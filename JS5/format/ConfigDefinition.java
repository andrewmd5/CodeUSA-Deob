package org.codeusa.cache.format;

import java.nio.ByteBuffer;
import java.util.HashMap;

import org.codeusa.cache.CacheManager;
import org.codeusa.util.BufferUtils;


public final class ConfigDefinition {

	public HashMap<Integer, Object> settings;

	public static ConfigDefinition forId(final int id) {
		try {
			final byte[] data = CacheManager.getData(2, 26, id);
			return decode(ByteBuffer.wrap(data));
		} catch (final Throwable t) {
			t.printStackTrace();
		}
		return null;
	}

	public static ConfigDefinition decode(final ByteBuffer buffer) {
		final ConfigDefinition def = new ConfigDefinition();
		while (true) {
			final int opcode = buffer.get() & 0xFF;
			if (opcode == 0) {
				break;
			}
			System.out.println(opcode);
			if (opcode == 249) {
				final int i_2_ = buffer.get() & 0xFF;
				if (def.settings == null) {
					final int capacity = resize(i_2_);
					def.settings = new HashMap<Integer, Object>(capacity);
				}
				for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
					final boolean bool = (buffer.get() & 0xFF) == 1;
					final int key = BufferUtils.getMediumInt(buffer);
					Object value;
					if (bool) {
						value = BufferUtils.getJagexString(buffer);
					} else {
						value = buffer.getInt();
					}
					def.settings.put(key, value);
					if (value instanceof String) {
						System.out.println(value);
					}
				}
			}
		}
		return def;
	}

	static final int resize(int i) {
		i--;
		i |= i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}
}