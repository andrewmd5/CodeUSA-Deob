package org.codeusa.cache.format;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

import org.codeusa.cache.CacheContainer;
import org.codeusa.cache.CacheManager;
import org.codeusa.cache.stream.ByteInputStream;
import org.codeusa.cache.stream.RSByteBuffer;
import org.codeusa.model.map.Region;
import org.codeusa.util.XTEA;


public class LandscapeParser {

	private static Map<Integer, Boolean> loaded = new HashMap<Integer, Boolean>();
	private static Map<Integer, Boolean> broken = new HashMap<Integer, Boolean>();

	public static boolean parseLandscape(final int area, final int[] keys) {
		if (broken.containsKey(area)) {
			return false;
		}
		if (loaded.get(area) == Boolean.TRUE) {
			return true;
		}
		loaded.put(area, Boolean.TRUE);
		final int regionX = area >> 8;
		final int regionY = area & 0xFF;
		try {
			final byte[] landscapeMap = CacheManager.getByName(5, "m" + regionX
					+ "_" + regionY);
			byte[] objectMap = CacheManager.getByName(5, "l" + regionX + "_"
					+ regionY);
			if ((landscapeMap == null) && (objectMap == null)) {
				System.out.println("Map [" + (regionX << 6) + ", "
						+ (regionY << 6) + "] was not found in the cache!");
				return true;
			}
			RSByteBuffer str2 = null;
			ByteInputStream str1 = null;
			if (landscapeMap != null) {
				str2 = new RSByteBuffer(new ByteArrayInputStream(
						new CacheContainer(landscapeMap).decompress()));
			}
			if (objectMap != null) {
				if (keys != null) {
					objectMap = XTEA.decrypt(keys, objectMap, 5,
							objectMap.length);
				}
				str1 = new ByteInputStream(
						new CacheContainer(objectMap).decompress());
			}
			final int x = regionX << 6;
			final int y = regionY << 6;
			final byte[][][] landscapeData = new byte[4][64][64];
			if (str2 != null) {
				for (int z = 0; z < 4; z++) {
					for (int localX = 0; localX < 64; localX++) {
						for (int localY = 0; localY < 64; localY++) {
							while (true) {
								final int v = str2.readByte() & 0xff;
								if (v == 0) {
									break;
								} else if (v == 1) {
									str2.readByte();
									break;
								} else if (v <= 49) {
									str2.readByte();
								} else if (v <= 81) {
									landscapeData[z][localX][localY] = (byte) (v - 49);
								}
							}
						}
					}
				}
				for (int z = 0; z < 4; z++) {
					for (int localX = 0; localX < 64; localX++) {
						for (int localY = 0; localY < 64; localY++) {
							if ((landscapeData[z][localX][localY] & 1) == 1) {
								int height = z;
								if ((landscapeData[1][localX][localY] & 2) == 2) {
									height--;
								}
								if ((height >= 0) && (height <= 3)) {
									Region.addClipping(x + localX, y + localY,
											height, 0x200000);
								}
							}
						}
					}
				}
			}
			if (str1 != null) {
				int objectId = -1;
				int incr;
				while ((incr = str1.readSmart2()) != 0) {
					objectId += incr;
					int location = 0;
					int incr2;
					while ((incr2 = str1.readSmart()) != 0) {
						location += incr2 - 1;
						final int localX = (location >> 6) & 0x3f;
						final int localY = location & 0x3f;
						int height = location >> 12;
				final int objectData = str1.readUByte();
				final int type = objectData >> 2;
								final int rotation = objectData & 0x3;
								if ((localX < 0) || (localX >= 64) || (localY < 0)
										|| (localY >= 64)) {
									continue;
								}
								if ((landscapeData[1][localX][localY] & 2) == 2) {
									height--;
								}
								if ((height >= 0) && (height <= 3)) {
									Region.addObject(objectId, x + localX, y + localY,
											height, type, rotation, true).setLandscape(
													true);
								}
					}
				}
			}
			return true;
		} catch (final Throwable e) {
			System.out.println("Error while loading region " + area + ", "
					+ e.getMessage() + ", " + e.getCause() + ", "
					+ e.toString());
			broken.put(area, Boolean.TRUE);
			return false;
		}
	}
}
