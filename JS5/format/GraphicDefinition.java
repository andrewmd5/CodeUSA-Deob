package org.codeusa.cache.format;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.codeusa.cache.CacheConstants;
import org.codeusa.cache.CacheManager;

/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class GraphicDefinition {

	/**
	 * The graphic definition mappings.
	 */
	private static final Map<Integer, GraphicDefinition> GRAPHICS = new HashMap<Integer, GraphicDefinition>();

	@SuppressWarnings("unused")
	private int anInt368 = 0;
	@SuppressWarnings("unused")
	private int anInt369 = 0;
	@SuppressWarnings("unused")
	private int anInt370;
	@SuppressWarnings("unused")
	private int anInt372;
	private short[] aShortArray373;
	protected byte aByte374 = 0;
	protected int anInt377;
	protected int anInt380 = -1;
	@SuppressWarnings("unused")
	private int anInt381;
	private short[] aShortArray382;
	protected boolean aBoolean383;
	private short[] aShortArray384;
	@SuppressWarnings("unused")
	private int anInt386;
	private short[] aShortArray388;
	@SuppressWarnings("unused")
	private int anInt389;

	public static GraphicDefinition forId(final int graphicId) {
		GraphicDefinition def = GRAPHICS.get(graphicId);
		if (def != null) {
			return def;
		}
		try {
			final byte[] data = CacheManager.getData(CacheConstants.GFX_IDX_ID,
					graphicId >>> 8, graphicId & 0xFF);
			def = new GraphicDefinition();
			def.method293(ByteBuffer.wrap(data));
			GRAPHICS.put(graphicId, def);
			return def;
		} catch (final Throwable t) {
			t.printStackTrace();
		}
		return null;
	}

	final void method293(final ByteBuffer buffer) {
		for (;;) {
			final int i_2_ = buffer.get() & 0xFF;
			if (i_2_ == 0) {
				break;
			}
			method294(i_2_, buffer);
		}
	}

	private final void method294(final int i_3_, final ByteBuffer buffer) {
		if (i_3_ == 1) {
			anInt386 = buffer.getShort() & 0xFFFF;
		} else if (i_3_ == 2) {
			anInt380 = buffer.getShort() & 0xFFFF;
		} else if (i_3_ == 4) {
			anInt370 = buffer.getShort() & 0xFFFF;
		} else if (i_3_ == 5) {
			anInt389 = buffer.getShort() & 0xFFFF;
		} else if (i_3_ == 6) {
			anInt372 = buffer.getShort() & 0xFFFF;
		} else if (i_3_ != 7) {
			if (i_3_ == 8) {
				anInt368 = buffer.get() & 0xFF;
			} else if (i_3_ == 9) {
				aByte374 = (byte) 3;
				anInt381 = 8224;
			} else if (i_3_ == 10) {
				aBoolean383 = true;
			} else if (i_3_ == 11) {
				aByte374 = (byte) 1;
			} else if (i_3_ != 12) {
				if (i_3_ == 13) {
					aByte374 = (byte) 5;
				} else if (i_3_ == 14) {
					aByte374 = (byte) 2;
					anInt381 = (256 * buffer.get()) & 0xFF;
				} else if (i_3_ != 15) {
					if (i_3_ == 16) {
						aByte374 = (byte) 3;
						anInt381 = buffer.getInt();
					} else if (i_3_ != 40) {
						if (i_3_ == 41) {
							final int i_4_ = buffer.get() & 0xFF;
							aShortArray384 = new short[i_4_];
							aShortArray382 = new short[i_4_];
							for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
								aShortArray382[i_5_] = (short) (buffer
										.getShort() & 0xFFFF);
								aShortArray384[i_5_] = (short) (buffer
										.getShort() & 0xFFFF);
							}
						}
					} else {
						final int i_6_ = buffer.get() & 0xFF;
						aShortArray373 = new short[i_6_];
						aShortArray388 = new short[i_6_];
						for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
							aShortArray388[i_7_] = (short) (buffer.getShort() & 0xFFFF);
							aShortArray373[i_7_] = (short) (buffer.getShort() & 0xFFFF);
						}
					}
				} else {
					aByte374 = (byte) 3;
					anInt381 = buffer.getShort() & 0xFFFF;
				}
			} else {
				aByte374 = (byte) 4;
			}
		} else {
			anInt369 = buffer.get() & 0xFF;
		}
	}

	/**
	 * Prints all fields in this class.
	 */
	public void printFields() {
		for (final Field field : getClass().getDeclaredFields()) {
			try {
				System.out.println(field.getName() + ": " + getValue(field));
			} catch (final Throwable e) {
				e.printStackTrace();
			}
		}
		System.out.println("-- end of " + getClass().getSimpleName()
				+ " fields --");
	}

	private Object getValue(final Field field) throws Throwable {
		field.setAccessible(true);
		final Class<?> type = field.getType();
		if (type == int[][].class) {
			return Arrays.toString((int[][]) field.get(this));
		} else if (type == int[].class) {
			return Arrays.toString((int[]) field.get(this));
		} else if (type == byte[].class) {
			return Arrays.toString((byte[]) field.get(this));
		} else if (type == short[].class) {
			return Arrays.toString((short[]) field.get(this));
		} else if (type == double[].class) {
			return Arrays.toString((double[]) field.get(this));
		} else if (type == float[].class) {
			return Arrays.toString((float[]) field.get(this));
		} else if (type == Object[].class) {
			return Arrays.toString((Object[]) field.get(this));
		}
		return field.get(this);
	}

	public GraphicDefinition() {
		anInt372 = 0;
		aBoolean383 = false;
		anInt381 = -1;
		anInt370 = 128;
		anInt389 = 128;
	}
}
