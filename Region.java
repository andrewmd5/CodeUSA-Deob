package org.codeusa.model.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codeusa.cache.format.CacheObjectDefinition;
import org.codeusa.model.Entity;
import org.codeusa.model.Location;
import org.codeusa.model.map.region.DynamicRegion;
import org.codeusa.model.map.region.RegionBuilder;
import org.codeusa.model.npc.NPC;
import org.codeusa.model.player.Player;

@SuppressWarnings({ "unchecked" })
public class Region {

	public static final int PLAYERS = 0, NPCS = 1;

	public static final int REGION_SIZE = 128;

	public static final int MAX_MAP_X = 16383, MAX_MAP_Y = 16383;

	private static Region[][] regions = new Region[(MAX_MAP_X + 1)
			/ REGION_SIZE][(MAX_MAP_Y + 1) / REGION_SIZE];

	// private static List<Region> loadedRegions = new ArrayList<Region>();

	public static List<NPC> getLocalNPCs(Location tile) {
		return getLocalNPCs(tile, 16);
	}

	public static List<NPC> getLocalNPCs(Location tile, int depth) {
		return getRegionTiles(tile, depth, NPCS);
	}

	public static List<Player> getLocalPlayers(Location tile) {
		return getLocalPlayers(tile, 16);
	}

	public static List<Player> getLocalPlayers(Location tile, int depth) {
		return getRegionTiles(tile, depth, PLAYERS);
	}

	@SuppressWarnings("rawtypes")
	public static List getRegionTiles(Location tile, int depth, int type) {
		final int baseX = tile.getX();
		final int baseY = tile.getY();
		final int z = tile.getZ();

		int lastRegionId = hash(baseX, baseY);
		final Region region = forCoords(baseX, baseY);

		final List<Region> regions = new ArrayList<Region>();

		regions.add(region); // initial region
		for (int x = -depth; x < depth + 1; x++) {
			for (int y = -depth; y < depth + 1; y++) {
				final int currentRegionId = hash(baseX + x, baseY + y);
				if (currentRegionId != lastRegionId) {
					lastRegionId = currentRegionId;
					if (!regions.contains(region)) {
						regions.add(forCoords(baseX + x, baseY + y));
					}
				}
			}
		}
		final List list = new ArrayList();
		for (final Region r : regions) {
			switch (type) {
			case PLAYERS:
				for (final Player p : r.players[z]) {
					if (p.getLocation().distance(tile) <= depth) {
						list.add(p);
					}
				}
				break;
			case NPCS:
				for (final NPC n : r.npcs[z]) {
					if (n.getLocation().distance(tile) <= depth) {
						list.add(n);
					}
				}
				break;
			}
		}
		return list;
	}

	public static int hash(int x, int y) {
		return x >> 7 << 8 | y >> 7;
	}

	public static void addClipping(int x, int y, int z, int shift) {
		final Region region = forCoords(x, y);
		final int localX = x - (x >> 7 << 7);
		final int localY = y - (y >> 7 << 7);
		if (region.clippingMasks[z] == null) {
			region.clippingMasks[z] = new int[region.size][region.size];
		}
		region.clipped = true;
		region.clippingMasks[z][localX][localY] |= shift;
	}

	public static void setClippingMask(int x, int y, int z, int shift) {
		final Region region = forCoords(x, y);
		final int localX = x - (x >> 7 << 7);
		final int localY = y - (y >> 7 << 7);
		if (region.clippingMasks[z] == null) {
			region.clippingMasks[z] = new int[region.size][region.size];
		}
		region.clipped = true;
		region.clippingMasks[z][localX][localY] = shift;
	}

	public static void removeClipping(int x, int y, int z, int shift) {
		final Region region = forCoords(x, y);
		final int localX = x - (x >> 7 << 7);
		final int localY = y - (y >> 7 << 7);
		if (region.clippingMasks[z] == null) {
			region.clippingMasks[z] = new int[region.size][region.size];
		}
		region.clippingMasks[z][localX][localY] &= ~shift;
	}

	public static Region forCoords(int x, int y) {
		final int regionX = x >> 7, regionY = y >> 7;
		Region r = regions[regionX][regionY];
		if (r == null) {
			r = regions[regionX][regionY] = new Region(regionX, regionY,
					REGION_SIZE);
		}
		return r;
	}

	public static Region forLocation(Location other) {
		return forCoords(other.getX(), other.getY());
	}

	public static int getClippingMask(int x, int y, int z) {
		final Region region = forCoords(x, y);
		if (region.clippingMasks[z] == null || !region.clipped) {
			final DynamicRegion dynamicRegion = RegionBuilder.getDynamicRegion(
					x, y);
			if (dynamicRegion != null) {
				final int baseLocalX = x - (x >> 3 >> 3 << 6);
				final int baseLocalY = y - (y >> 3 >> 3 << 6);
				return dynamicRegion.getMask(z, baseLocalX, baseLocalY);
			}
			return -1;
		}
		final int localX = x - (x >> 7 << 7);
		final int localY = y - (y >> 7 << 7);
		return region.clippingMasks[z][localX][localY];
	}

	public static Region getRegion(int x, int y, int z) {
		return forCoords(x, y);
	}

	public static Location getLocation(int x, int y, int z) {
		final Region region = forCoords(x, y);
		final int localX = x - (x >> 7 << 7);
		final int localY = y - (y >> 7 << 7);
		return region.getLocalLocation(localX, localY, z);
	}

	private final int[][][] clippingMasks = new int[4][][];
	private final Location[][][] tiles = new Location[4][][];

	private int size;
	private int x;
	private int y;
	public Set<Player>[] players = new HashSet[4];
	public Set<NPC>[] npcs = new HashSet[4];

	private boolean clipped;
	@SuppressWarnings("unused")
	private boolean active;

	public Region(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
		for (int i = 0; i < 4; i++) {
			players[i] = new HashSet<Player>();
			npcs[i] = new HashSet<NPC>();
		}
		// loadedRegions.add(this);
	}

	public Region(int regionId) {
	}

	public Location getLocalLocation(int x, int y, int z) {
		z %= 4;
		if (z == -1) {
			z = 0;
		}
		if (x == -1) {
			x = 1;
		}
		if (y == -1) {
			y = 1;
		}
		if (tiles[z] == null) {
			tiles[z] = new Location[size][size];
		}
		Location tile = tiles[z][x][y];
		if (tile == null) {
			tile = new Location(this.x << 7 | x, this.y << 7 | y, z, this);
			tiles[z][x][y] = tile;
		}
		return tile;
	}

	public int getSize() {
		return size;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int hashCode() {
		return x << 8 | y;
	}

	public void setClipped(boolean clipped) {
		this.clipped = clipped;
	}

	public boolean isClipped() {
		return clipped;
	}

	public static GameObject addObject(int objectId, int x, int y, int height,
			int type, int direction, boolean ignoreObjects) {
		if (!ignoreObjects && objectId == -1) {
			removeObject(x, y, height, type);
		}
		if (objectId == -1) {
			return new GameObject(objectId, x, y, height, type, direction);
		}
		final CacheObjectDefinition def = CacheObjectDefinition.forId(objectId);
		if (def == null) {
			return null;
		}
		int xLength;
		int yLength;
		final GameObject object = new GameObject(objectId, x, y, height, type,
				direction);
		if (direction != 1 && direction != 3) {
			xLength = def.sizeX;
			yLength = def.sizeY;
		} else {
			xLength = def.sizeY;
			yLength = def.sizeX;
		}
		if (type == 22) {
			if (def.actionCount == 1) {
				addClipping(x, y, height, 0x200000);
			}
		} else if (type >= 9 && type <= 11) {
			if (def.actionCount != 0) {
				addClippingForSolidObject(x, y, height, xLength, yLength,
						def.isSolid(), !def.clippingFlag);
			}
		} else if (type >= 0 && type <= 3) {
			if (def.actionCount != 0) {
				addClippingForVariableObject(x, y, height, type, direction,
						def.isSolid(), !def.clippingFlag);
			}
		}
		if (!ignoreObjects) {
			removeObject(x, y, height, type);
		}
		addGameObject(object);
		return object;
	}

	public static void addGameObject(GameObject object) {
		final GameObject oldObject = object.getLocation().getGameObjectType(
				object.getType());
		if (oldObject != null) {
			return;
		}
		object.getLocation().addObject(object);
	}

	public static GameObject removeObject(int x, int y, int height, int type) {
		final Location loc = Location.locate(x, y, height);
		final GameObject oldObj = loc.getGameObjectType(type);
		loc.removeObject(oldObj);
		if (oldObj != null) {
			final CacheObjectDefinition def = CacheObjectDefinition
					.forId(oldObj.getId());
			int xLength;
			int yLength;

			if (oldObj.getRotation() != 1 && oldObj.getRotation() != 3) {
				xLength = def.sizeX;
				yLength = def.sizeY;
			} else {
				xLength = def.sizeY;
				yLength = def.sizeX;
			}
			if (oldObj.getType() == 22) {
				if (def.actionCount == 1) {
					removeClipping(x, y, height, 0x200000);
				}
			} else if (oldObj.getType() >= 9 && oldObj.getType() <= 11) {
				if (def.actionCount != 0) {
					removeClippingForSolidObject(x, y, height, xLength,
							yLength, def.isSolid(), !def.clippingFlag);
				}
			} else if (oldObj.getType() >= 0 && oldObj.getType() <= 3) {
				if (def.actionCount != 0) {
					removeClippingForVariableObject(x, y, height,
							oldObj.getType(), oldObj.getRotation(),
							def.isSolid(), !def.clippingFlag);
				}
			}
		}
		return oldObj;
	}

	private static void addClippingForSolidObject(int x, int y, int height,
			int xLength, int yLength, boolean flag, boolean flag2) {
		int clipping = 256;
		if (flag) {
			clipping |= 0x20000;
		}
		if (flag2) {
			clipping |= 0x40000000;
		}
		for (int i = x; i < x + xLength; i++) {
			for (int i2 = y; i2 < y + yLength; i2++) {
				addClipping(i, i2, height, clipping);
			}
		}
	}

	private static void removeClippingForSolidObject(int x, int y, int height,
			int xLength, int yLength, boolean flag, boolean flag2) {
		int clipping = 256;
		if (flag) {
			clipping |= 0x20000;
		}
		if (flag2) {
			clipping |= 0x40000000;
		}
		for (int i = x; i < x + xLength; i++) {
			for (int i2 = y; i2 < y + yLength; i2++) {
				removeClipping(i, i2, height, clipping);
			}
		}
	}

	private static void addClippingForVariableObject(int x, int y, int z,
			int type, int direction, boolean flag, boolean flag2) {
		if (type == 0) {
			if (direction == 0) {
				addClipping(x, y, z, 128);
				addClipping(x - 1, y, z, 8);
			}
			if (direction == 1) {
				addClipping(x, y, z, 2);
				addClipping(x, y + 1, z, 32);
			}
			if (direction == 2) {
				addClipping(x, y, z, 8);
				addClipping(x + 1, y, z, 128);
			}
			if (direction == 3) {
				addClipping(x, y, z, 32);
				addClipping(x, y - 1, z, 2);
			}
		}
		if (type == 1 || type == 3) {
			if (direction == 0) {
				addClipping(x, y, z, 1);
				addClipping(x - 1, y + 1, z, 16);
			}
			if (direction == 1) {
				addClipping(x, y, z, 4);
				addClipping(x + 1, y + 1, z, 64);
			}
			if (direction == 2) {
				addClipping(x, y, z, 16);
				addClipping(x + 1, y - 1, z, 1);
			}
			if (direction == 3) {
				addClipping(x, y, z, 64);
				addClipping(x - 1, y - 1, z, 4);
			}
		}
		if (type == 2) {
			if (direction == 0) {
				addClipping(x, y, z, 130);
				addClipping(x - 1, y, z, 8);
				addClipping(x, y + 1, z, 32);
			}
			if (direction == 1) {
				addClipping(x, y, z, 10);
				addClipping(x, y + 1, z, 32);
				addClipping(x + 1, y, z, 128);
			}
			if (direction == 2) {
				addClipping(x, y, z, 40);
				addClipping(x + 1, y, z, 128);
				addClipping(x, y - 1, z, 2);
			}
			if (direction == 3) {
				addClipping(x, y, z, 160);
				addClipping(x, y - 1, z, 2);
				addClipping(x - 1, y, z, 8);
			}
		}
		if (flag) {
			if (type == 0) {
				if (direction == 0) {
					addClipping(x, y, z, 0x10000);
					addClipping(x - 1, y, z, 4096);
				}
				if (direction == 1) {
					addClipping(x, y, z, 1024);
					addClipping(x, y + 1, z, 16384);
				}
				if (direction == 2) {
					addClipping(x, y, z, 4096);
					addClipping(x + 1, y, z, 0x10000);
				}
				if (direction == 3) {
					addClipping(x, y, z, 16384);
					addClipping(x, y - 1, z, 1024);
				}
			}
			if (type == 1 || type == 3) {
				if (direction == 0) {
					addClipping(x, y, z, 512);
					addClipping(x - 1, y + 1, z, 8192);
				}
				if (direction == 1) {
					addClipping(x, y, z, 2048);
					addClipping(x + 1, y + 1, z, 32768);
				}
				if (direction == 2) {
					addClipping(x, y, z, 8192);
					addClipping(x + 1, y - 1, z, 512);
				}
				if (direction == 3) {
					addClipping(x, y, z, 32768);
					addClipping(x - 1, y - 1, z, 2048);
				}
			}
			if (type == 2) {
				if (direction == 0) {
					addClipping(x, y, z, 0x10400);
					addClipping(x - 1, y, z, 4096);
					addClipping(x, y + 1, z, 16384);
				}
				if (direction == 1) {
					addClipping(x, y, z, 5120);
					addClipping(x, y + 1, z, 16384);
					addClipping(x + 1, y, z, 0x10000);
				}
				if (direction == 2) {
					addClipping(x, y, z, 20480);
					addClipping(x + 1, y, z, 0x10000);
					addClipping(x, y - 1, z, 1024);
				}
				if (direction == 3) {
					addClipping(x, y, z, 0x14000);
					addClipping(x, y - 1, z, 1024);
					addClipping(x - 1, y, z, 4096);
				}
			}
		}
		if (flag2) {
			if (type == 0) {
				if (direction == 0) {
					addClipping(x, y, z, 0x20000000);
					addClipping(x - 1, y, z, 0x2000000);
				}
				if (direction == 1) {
					addClipping(x, y, z, 0x800000);
					addClipping(x, y + 1, z, 0x8000000);
				}
				if (direction == 2) {
					addClipping(x, y, z, 0x2000000);
					addClipping(x + 1, y, z, 0x20000000);
				}
				if (direction == 3) {
					addClipping(x, y, z, 0x8000000);
					addClipping(x, y - 1, z, 0x800000);
				}
			}
			if (type == 1 || type == 3) {
				if (direction == 0) {
					addClipping(x, y, z, 0x400000);
					addClipping(x - 1, y + 1, z, 0x4000000);
				}
				if (direction == 1) {
					addClipping(x, y, z, 0x1000000);
					addClipping(1 + x, 1 + y, z, 0x10000000);
				}
				if (direction == 2) {
					addClipping(x, y, z, 0x4000000);
					addClipping(x + 1, -1 + y, z, 0x400000);
				}
				if (direction == 3) {
					addClipping(x, y, z, 0x10000000);
					addClipping(-1 + x, y - 1, z, 0x1000000);
				}
			}
			if (type == 2) {
				if (direction == 0) {
					addClipping(x, y, z, 0x20800000);
					addClipping(-1 + x, y, z, 0x2000000);
					addClipping(x, 1 + y, z, 0x8000000);
				}
				if (direction == 1) {
					addClipping(x, y, z, 0x2800000);
					addClipping(x, 1 + y, z, 0x8000000);
					addClipping(x + 1, y, z, 0x20000000);
				}
				if (direction == 2) {
					addClipping(x, y, z, 0xa000000);
					addClipping(1 + x, y, z, 0x20000000);
					addClipping(x, y - 1, z, 0x800000);
				}
				if (direction == 3) {
					addClipping(x, y, z, 0x28000000);
					addClipping(x, y - 1, z, 0x800000);
					addClipping(-1 + x, y, z, 0x2000000);
				}
			}
		}
	}

	public static void removeClippingForVariableObject(int x, int y, int z,
			int type, int direction, boolean flag, boolean flag2) {
		if (type == 0) {
			if (direction == 0) {
				removeClipping(x, y, z, 128);
				removeClipping(x - 1, y, z, 8);
			}
			if (direction == 1) {
				removeClipping(x, y, z, 2);
				removeClipping(x, 1 + y, z, 32);
			}
			if (direction == 2) {
				removeClipping(x, y, z, 8);
				removeClipping(1 + x, y, z, 128);
			}
			if (direction == 3) {
				removeClipping(x, y, z, 32);
				removeClipping(x, y - 1, z, 2);
			}
		}
		if (type == 1 || type == 3) {
			if (direction == 0) {
				removeClipping(x, y, z, 1);
				removeClipping(x - 1, 1 + y, z, 16);
			}
			if (direction == 1) {
				removeClipping(x, y, z, 4);
				removeClipping(1 + x, y + 1, z, 64);
			}
			if (direction == 2) {
				removeClipping(x, y, z, 16);
				removeClipping(x + 1, -1 + y, z, 1);
			}
			if (direction == 3) {
				removeClipping(x, y, z, 64);
				removeClipping(-1 + x, -1 + y, z, 4);
			}
		}
		if (type == 2) {
			if (direction == 0) {
				removeClipping(x, y, z, 130);
				removeClipping(x - 1, y, z, 8);
				removeClipping(x, 1 + y, z, 32);
			}
			if (direction == 1) {
				removeClipping(x, y, z, 10);
				removeClipping(x, 1 + y, z, 32);
				removeClipping(1 + x, y, z, 128);
			}
			if (direction == 2) {
				removeClipping(x, y, z, 40);
				removeClipping(x + 1, y, z, 128);
				removeClipping(x, -1 + y, z, 2);
			}
			if (direction == 3) {
				removeClipping(x, y, z, 160);
				removeClipping(x, y - 1, z, 2);
				removeClipping(-1 + x, y, z, 8);
			}
		}
		if (flag) {
			if (type == 0) {
				if (direction == 0) {
					removeClipping(x, y, z, 0x10000);
					removeClipping(-1 + x, y, z, 4096);
				}
				if (direction == 1) {
					removeClipping(x, y, z, 1024);
					removeClipping(x, 1 + y, z, 16384);
				}
				if (direction == 2) {
					removeClipping(x, y, z, 4096);
					removeClipping(x + 1, y, z, 0x10000);
				}
				if (direction == 3) {
					removeClipping(x, y, z, 16384);
					removeClipping(x, y - 1, z, 1024);
				}
			}
			if (type == 1 || type == 3) {
				if (direction == 0) {
					removeClipping(x, y, z, 512);
					removeClipping(-1 + x, 1 + y, z, 8192);
				}
				if (direction == 1) {
					removeClipping(x, y, z, 2048);
					removeClipping(1 + x, 1 + y, z, 32768);
				}
				if (direction == 2) {
					removeClipping(x, y, z, 8192);
					removeClipping(x + 1, -1 + y, z, 512);
				}
				if (direction == 3) {
					removeClipping(x, y, z, 32768);
					removeClipping(x - 1, -1 + y, z, 2048);
				}
			}
			if (type == 2) {
				if (direction == 0) {
					removeClipping(x, y, z, 0x10400);
					removeClipping(-1 + x, y, z, 4096);
					removeClipping(x, y + 1, z, 16384);
				}
				if (direction == 1) {
					removeClipping(x, y, z, 5120);
					removeClipping(x, 1 + y, z, 16384);
					removeClipping(x + 1, y, z, 0x10000);
				}
				if (direction == 2) {
					removeClipping(x, y, z, 20480);
					removeClipping(1 + x, y, z, 0x10000);
					removeClipping(x, -1 + y, z, 1024);
				}
				if (direction == 3) {
					removeClipping(x, y, z, 0x14000);
					removeClipping(x, -1 + y, z, 1024);
					removeClipping(-1 + x, y, z, 4096);
				}
			}
		}
		if (flag2) {
			if (type == 0) {
				if (direction == 0) {
					removeClipping(x, y, z, 0x20000000);
					removeClipping(-1 + x, y, z, 0x2000000);
				}
				if (direction == 1) {
					removeClipping(x, y, z, 0x800000);
					removeClipping(x, 1 + y, z, 0x8000000);
				}
				if (direction == 2) {
					removeClipping(x, y, z, 0x2000000);
					removeClipping(x + 1, y, z, 0x20000000);
				}
				if (direction == 3) {
					removeClipping(x, y, z, 0x8000000);
					removeClipping(x, -1 + y, z, 0x800000);
				}
			}
			if (type == 1 || type == 3) {
				if (direction == 0) {
					removeClipping(x, y, z, 0x400000);
					removeClipping(x - 1, y + 1, z, 0x4000000);
				}
				if (direction == 1) {
					removeClipping(x, y, z, 0x1000000);
					removeClipping(1 + x, 1 + y, z, 0x10000000);
				}
				if (direction == 2) {
					removeClipping(x, y, z, 0x4000000);
					removeClipping(x + 1, -1 + y, z, 0x400000);
				}
				if (direction == 3) {
					removeClipping(x, y, z, 0x10000000);
					removeClipping(-1 + x, y - 1, z, 0x1000000);
				}
			}
			if (type == 2) {
				if (direction == 0) {
					removeClipping(x, y, z, 0x20800000);
					removeClipping(-1 + x, y, z, 0x2000000);
					removeClipping(x, y + 1, z, 0x8000000);
				}
				if (direction == 1) {
					removeClipping(x, y, z, 0x2800000);
					removeClipping(x, y + 1, z, 0x8000000);
					removeClipping(1 + x, y, z, 0x20000000);
				}
				if (direction == 2) {
					removeClipping(x, y, z, 0xa000000);
					removeClipping(x + 1, y, z, 0x20000000);
					removeClipping(x, y - 1, z, 0x800000);
				}
				if (direction == 3) {
					removeClipping(x, y, z, 0x28000000);
					removeClipping(x, -1 + y, z, 0x800000);
					removeClipping(x - 1, y, z, 0x2000000);
				}
			}
		}
	}

	public void addEntity(Entity entity) {
		final int z = entity.getLocation().getZ();
		if (entity.isPlayer()) {
			synchronized (players) {
				players[z].add(entity.getPlayer());
			}
		} else if (entity.isNPC()) {
			synchronized (npcs) {
				npcs[z].add(entity.getNPC());
			}
		}
	}

	public void removeEntity(Entity entity) {
		final int z = entity.getLocation().getZ();
		if (entity.isPlayer()) {
			synchronized (players) {
				players[z].remove(entity.getPlayer());
			}
		} else if (entity.isNPC()) {
			synchronized (npcs) {
				npcs[z].remove(entity.getNPC());
			}
		}
	}

	public int getClippingFlag(int localX, int localY, int height) {
		return clippingMasks[localX][localY][height];
	}

	public static Region getRegion(int realRegionId) {

		return null;
	}

	public static boolean isPassable(Location l) {
		final int clippingMask = getClippingMask(l.getX(), l.getY(), l.getZ());
		if (clippingMask == -1) {
			return true; // ?
		}
		return clippingMask < 1; /*
								 * (clippingMask & 0x1280180) == 0 &&
								 * (clippingMask & 0x1280108) == 0 &&
								 * (clippingMask & 0x1280120) == 0 &&
								 * (clippingMask & 0x1280102) == 0;
								 */
	}

	public final static List<GameObject> getLocalObjects(Location tile) {
		return getLocalObjects(tile, 48);
	}

	public final static List<GameObject> getLocalObjects(Location tile,
			int depth) {
		final Location[] regionTiles = getRegionTiles(tile, depth);
		final List<GameObject> objects = new ArrayList<GameObject>();
		for (final Location t : regionTiles) {
			if (t.hasObjects()) {
				objects.addAll(t.getGameObjects());
			}
		}
		return objects;
	}

	public final static Location[] getRegionTiles(Location tile, int depth) {
		final int baseX = tile.getX();
		final int baseY = tile.getY();
		final int z = tile.getZ();
		final Location[] regionTiles = new Location[(int) Math.pow(
				depth * 2 - 1, 2)];
		int i = 0;
		for (int x = -depth + 1; x < depth; x++) {
			for (int y = -depth + 1; y < depth; y++) {
				regionTiles[i++] = Location.locate(baseX + x, baseY + y, z);
			}
		}
		return regionTiles;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isActive() {
		for (int i = 0; i < 4; i++) {
			if (players[i].size() > 0) {
				return true;
			}
		}
		return false;

	}

	// / public static List<Region> getRegions() {
	// return loadedRegions;
	// }

	public int getRotation(byte plane, int boundX, int boundY) {
		// TODO Auto-generated method stub
		return 0;
	}

}
