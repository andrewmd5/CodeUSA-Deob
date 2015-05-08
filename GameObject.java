package org.codeusa.model.map;

import org.codeusa.cache.format.CacheObjectDefinition;
import org.codeusa.model.Entity;
import org.codeusa.model.Location;
import org.codeusa.model.player.Player;

public class GameObject extends Entity {

	private int id;
	private final int type;
	private int rotation;
	private boolean landscape;
	private int health;
	private boolean healthSet;

	private Player owner;
	private boolean exists = true;
	private boolean spawned;
	public int getloc;

	public GameObject(int id, int x, int y, int z, int type, int rotation) {
		this(id, Location.locate(x, y, z), type, rotation);
	}

	public GameObject(int id, Location location, int type, int rotation) {
		this.id = id;
		this.type = type;
		this.rotation = rotation;
		setLocation(location);
	}

	public GameObject(Player owner, int id, Location location, int type,
			int rotation) {
		this.setOwner(owner);
		this.id = id;
		this.type = type;
		this.rotation = rotation;
		setLocation(location);
	}

	public int getId() {
		return id;
	}

	public int getType() {
		return type;
	}

	public int getRotation() {
		return rotation;
	}

	public void setExists(boolean exists) {
		this.exists = exists;
	}

	public boolean exists() {
		return exists;
	}

	public void setRotation(byte rotation) {
		this.rotation = rotation;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CacheObjectDefinition getDefinition() {
		return CacheObjectDefinition.forId(id);
	}

	@Override
	public boolean isGameObject() {
		return true;
	}

	@Override
	public GameObject getGameObject() {
		return this;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isHealthSet() {
		return healthSet;
	}

	public void setHealthSet(boolean b) {
		this.healthSet = b;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public Player getOwner() {
		return owner;
	}

	public void setSpawned(boolean spawned) {
		this.spawned = spawned;
	}

	public boolean isSpawned() {
		return spawned;
	}

	public void setLandscape(boolean landscape) {
		this.landscape = landscape;
	}

	public boolean isLandscape() {
		return landscape;
	}

}
