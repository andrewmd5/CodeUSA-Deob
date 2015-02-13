package org.codeusa.cache.format;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.codeusa.cache.CacheConstants;
import org.codeusa.cache.CacheManager;
import org.codeusa.util.BufferUtils;

public class AnimationDefinition {
	/**
	 * The animation definitions mapping.
	 */
	private static final Map<Integer, AnimationDefinition> ANIMATIONS = new HashMap<Integer, AnimationDefinition>();

	protected int anInt591 = -1;
	protected int[] anIntArray592;
	protected int anInt593;
	protected int[] frames;
	protected int anInt595;
	protected int anInt597 = -1;
	protected int[] frameDelay;
	protected boolean aBoolean600;
	protected int priority;
	protected boolean aBoolean603;
	protected int anInt604;
	protected int anInt606;
	protected boolean aBoolean607;
	protected boolean[] aBooleanArray608;
	protected int[] anIntArray609;
	protected int[] anIntArray610;
	protected int anInt611;
	protected int[][] anIntArrayArray613;
	protected int[] anIntArray615;
	protected int anInt617;

	public static AnimationDefinition forId(final int animId) {
		AnimationDefinition def = ANIMATIONS.get(animId);
		if (def != null) {
			return def;
		}
		try {
			final byte[] data = CacheManager.getData(
					CacheConstants.ANIM_IDX_ID, animId >>> 7, animId & 0x7f);
			def = new AnimationDefinition();
			def.method541(ByteBuffer.wrap(data));
			ANIMATIONS.put(animId, def);
			return def;
		} catch (final Throwable t) {
			// t.printStackTrace();
		}
		return null;
	}

	private final void method540(final int i, final int i_0_,
			final ByteBuffer buffer) {
		if (i_0_ == 1) {
			final int i_2_ = buffer.getShort() & 0xFFFF;
			frameDelay = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				frameDelay[i_3_] = buffer.getShort() & 0xFFFF;
			}
			frames = new int[i_2_];
			for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
				frames[i_4_] = buffer.getShort() & 0xFFFF;
			}
			for (int i_5_ = 0; i_2_ > i_5_; i_5_++) {
				frames[i_5_] = (buffer.getShort() & (0xFFFF << 16))
						- -frames[i_5_];
			}
		} else if (i_0_ == 2) {
			anInt591 = buffer.getShort() & 0xFFFF;
		} else if (i_0_ == 3) {
			aBooleanArray608 = new boolean[256];
			final int i_6_ = buffer.get() & 0xFF;
			for (int i_7_ = 0; i_6_ > i_7_; i_7_++) {
				aBooleanArray608[buffer.get() & 0xFF] = true;
			}
		} else if (i_0_ == 5) {
			priority = buffer.get() & 0xFF;
		} else if (i_0_ == 6) {
			anInt606 = buffer.getShort() & 0xFFFF;
		} else if (i_0_ == 7) {
			anInt593 = buffer.getShort() & 0xFFFF;
		} else if (i_0_ == 8) {
			anInt595 = buffer.get() & 0xFF;
		} else if (i_0_ == 9) {
			anInt597 = buffer.get() & 0xFF;
		} else if (i_0_ == 10) {
			anInt611 = buffer.get() & 0xFF;
		} else if (i_0_ != 11) {
			if (i_0_ == 12) {
				final int i_8_ = buffer.get() & 0xFF;
				anIntArray615 = new int[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					anIntArray615[i_9_] = buffer.getShort() & 0xFFFF;
				}
				for (int i_10_ = 0; i_8_ > i_10_; i_10_++) {
					anIntArray615[i_10_] = (buffer.getShort() & (0xFFFF << 16))
							+ anIntArray615[i_10_];
				}
			} else if (i_0_ == 13) {
				final int i_11_ = buffer.getShort() & 0xFFFF;
				anIntArrayArray613 = new int[i_11_][];
				for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
					final int i_13_ = buffer.get() & 0xFF;
					if (i_13_ > 0) {
						anIntArrayArray613[i_12_] = new int[i_13_];
						anIntArrayArray613[i_12_][0] = BufferUtils
								.getMediumInt(buffer);// buffer.getMedium((byte)
						// 55); //TODO
						for (int i_14_ = 1; i_13_ > i_14_; i_14_++) {
							anIntArrayArray613[i_12_][i_14_] = buffer
									.getShort() & 0xFFFF;
						}
					}
				}
			} else if (i_0_ != 14) {
				if (i_0_ == 15) {
					aBoolean600 = true;
				} else if (i_0_ != 16) {
					if (i_0_ == 18) {
						aBoolean603 = true;
					} else if (i_0_ == 19) {
						if (anIntArray610 == null) {
							anIntArray610 = new int[anIntArrayArray613.length];
							for (int i_15_ = 0; i_15_ < anIntArrayArray613.length; i_15_++) {
								anIntArray610[i_15_] = 255;
							}
						}
						anIntArray610[buffer.get() & 0xFF] = buffer.get() & 0xFF;
					} else if (i_0_ == 20) {
						if ((anIntArray609 == null) || (anIntArray592 == null)) {
							anIntArray609 = new int[anIntArrayArray613.length];
							anIntArray592 = new int[anIntArrayArray613.length];
							for (int i_16_ = 0; anIntArrayArray613.length > i_16_; i_16_++) {
								anIntArray609[i_16_] = 256;
								anIntArray592[i_16_] = 256;
							}
						}
						final int i_17_ = buffer.get() & 0xFF;
						anIntArray609[i_17_] = buffer.getShort() & 0xFFFF;
						anIntArray592[i_17_] = buffer.getShort() & 0xFFFF;
					}
				}
			} else {
				aBoolean607 = true;
			}
		} else {
			anInt604 = buffer.get() & 0xFF;
		}
	}

	final void method541(final ByteBuffer buffer) {
		for (;;) {
			final int i_19_ = buffer.get() & 0xFF;
			if (i_19_ == 0) {
				break;
			}
			method540(115, i_19_, buffer);
		}
	}

	/**
	 * Prints all fields in this class.
	 */
	public void printFields() {
		for (final Field field : getClass().getDeclaredFields()) {
			if ((field.getModifiers() & 8) != 0) {
				continue;
			}
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

	/**
	 * Gets the duration of this animation.
	 *
	 * @return The total amount of time (in ticks).
	 */
	public int getDuration() {
		int total = 0;
		for (final int delay : frameDelay) {
			total += delay;
		}
		return (total * 30) / 600; // in ticks.
	}

	/**
	 * Gets the duratoin of this animation in seconds.
	 *
	 * @return The total amount of time.
	 */
	public int getMillisecondDelay() {
		int total = 0;
		for (final int delay : frameDelay) {
			total += delay;
		}
		return total * 30;
	}

	/**
	 * Gets the duratoin of this animation in seconds.
	 *
	 * @return The total amount of time.
	 */
	public int getSecondDelay() {
		int total = 0;
		for (final int delay : frameDelay) {
			total += delay;
		}
		return total * 30 * 1000;
	}

	/**
	 * Gets the animation priority.
	 *
	 * @return The priority.
	 */
	public int getPriority() {
		return priority;
	}

	public int[] getFrameDelay() {
		return frameDelay;
	}

	public AnimationDefinition() {
		anInt595 = 99;
		anInt604 = 2;
		aBoolean607 = false;
		aBoolean603 = false;
		anInt611 = -1;
		priority = 5;
		aBoolean600 = false;
		anInt593 = -1;
		anInt606 = -1;
	}
}