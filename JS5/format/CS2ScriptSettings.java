package org.codeusa.cache.format;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

import org.codeusa.cache.CacheManager;
import org.codeusa.util.BufferUtils;


public class CS2ScriptSettings {

	/**
	 * The definitions mapping.
	 */
	private static final Map<Integer, CS2ScriptSettings> DEFINITIONS = new HashMap<Integer, CS2ScriptSettings>();
	private String defaultString;
	private char valueType;
	private char keyType;
	private int defaultInteger;
	private Map<Integer, Object> settings;
	private HashMap<Long, Object> values;

	/**
	 * The client script setting definitions.
	 *
	 * @param id
	 *            The client script id.
	 * @return The definitions.
	 */
	public static CS2ScriptSettings forId(final int id) {
		CS2ScriptSettings def = DEFINITIONS.get(id);
		if (def != null) {
			// return def;
		}
		try {
			final byte[] data = CacheManager.getData(17, id >>> 8, id & 0xFF);
			def = decode(ByteBuffer.wrap(data));
			DEFINITIONS.put(id, def);
			return def;
		} catch (final Throwable e) {
			// e.printStackTrace();
		}
		return null;
	}

	/**
	 *
	 * @param buffer
	 *            The buffer which contains information for the file.
	 * @return a new CachedSettingDefinition
	 */
	private static CS2ScriptSettings decode(final ByteBuffer buffer) {
		final CS2ScriptSettings def = new CS2ScriptSettings();
		def.settings = new HashMap<Integer, Object>();
		while (true) {
			final int opcode = buffer.get() & 0xFF;
			if (opcode == 0) {
				break;
			} else if (opcode == 1) {
				def.keyType = BufferUtils.getCPCharacter(buffer);
			} else if (opcode == 2) {
				def.valueType = BufferUtils.getCPCharacter(buffer);
			} else if (opcode == 3) {
				def.defaultString = BufferUtils.readRS2String(buffer);
			} else if (opcode == 4) {
				def.defaultInteger = buffer.getInt();
			} else if ((opcode == 5) || (opcode == 6)) {
				final int range = buffer.getShort() & 0xFFFF;
				for (int offset = 0; offset < range; offset++) {
					final int settingIdentifier = buffer.getInt();
					Object data;
					if (opcode == 5) {
						data = BufferUtils.readRS2String(buffer);
						// System.out.println(settingIdentifier + ", " + data);
					} else {
						data = buffer.getInt();
					}
					def.settings.put(settingIdentifier, data);
				}
			} else if (opcode == 7) {
				buffer.getShort();
				final int length = buffer.getShort() & 0xFF;
				for (int i_5_ = 0; length > i_5_; i_5_++) {
					final int key = buffer.getShort() & 0xFF;
					def.settings.put(key, BufferUtils.readRS2String(buffer));
					// System.out.println(key + ", " + def.settings.get(key));
				}
			} else if (opcode == 8) {
				buffer.getShort();
				final int length = buffer.getShort() & 0xFF;
				for (int i_8_ = 0; i_8_ < length; i_8_++) {
					def.settings.put(buffer.getShort() & 0xFF, new Integer(
							buffer.getInt()));
				}
			} else {
				System.out.println("Opcode: " + opcode);
			}
		}
		return def;
	}

	public int getDefaultInteger() {
		return defaultInteger;
	}

	public String getDefaultString() {
		return defaultString;
	}

	public char getKeyType() {
		return keyType;
	}

	public Map<Integer, Object> getSettings() {
		return settings;
	}

	public char getValueType() {
		return valueType;
	}

	public long getKeyForValue(final Object value) {
		for (final Long key : values.keySet()) {
			if (values.get(key).equals(value)) {
				return key;
			}
		}
		return -1;
	}

	public int getKey(final Object o) {
		for (final int i : settings.keySet()) {
			if (settings.get(i).equals(o)) {
				return i;
			}
		}
		return -1;
	}

	public int getIntValue(final long key) {
		if (values == null) {
			return defaultInteger;
		}
		final Object value = values.get(key);
		if ((value == null) || !(value instanceof Integer)) {
			return defaultInteger;
		}
		return (Integer) value;
	}
}