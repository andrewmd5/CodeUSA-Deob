package org.codeusa.cache.format;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.codeusa.cache.CacheConstants;
import org.codeusa.cache.CacheManager;

public class RenderAnimationDefinition {
	/**
	 * The animations.
	 */
	private static final Map<Integer, RenderAnimationDefinition> RENDER_ANIMATIONS = new HashMap<Integer, RenderAnimationDefinition>();

	protected int anInt3675;
	protected int anInt3676;
	protected int anInt3677 = -1;
	protected int anInt3680;
	protected int anInt3682;
	protected int anInt3683;
	protected int[][] anIntArrayArray3684;
	protected int[] anIntArray3685;
	protected int anInt3686;
	protected int[][] anIntArrayArray3687;
	protected int anInt3688 = -1;
	protected int anInt3689;
	protected int anInt3690;
	protected int anInt3691;
	protected int anInt3692;
	protected int anInt3693 = 0;
	protected int anInt3694;
	protected int anInt3695;
	protected int[] anIntArray3696;
	protected int anInt3698;
	protected int[] anIntArray3699;
	protected int[] anIntArray3700;
	protected int anInt3701;
	protected int anInt3703;
	protected int anInt3704;
	protected int anInt3707;
	protected int anInt3708;
	protected int anInt3709;
	protected int anInt3710;
	protected int anInt3711;
	protected int anInt3712;
	protected int anInt3713;
	protected int anInt3714;
	protected int anInt3715;
	protected int anInt3716;
	protected int anInt3717;
	protected boolean aBoolean3721;
	protected int anInt3722;
	protected int anInt3723;
	protected int anInt3726;
	protected int anInt3727;
	protected int anInt3728;
	protected int anInt3729;
	protected int anInt3730;

	private final BodyDefinition bodyDefiniton;

	public static RenderAnimationDefinition valueOf(final BodyDefinition body,
			final int i) throws IOException {
		RenderAnimationDefinition class279 = RENDER_ANIMATIONS.get(i);
		if (class279 != null) {
			return class279;
		}
		final byte[] bs = CacheManager.getData(CacheConstants.RENDER_ANIMS_IDX,
				32, i);
		class279 = new RenderAnimationDefinition(body);
		if (bs != null) {
			class279.method3165(ByteBuffer.wrap(bs));
		}
		RENDER_ANIMATIONS.put(i, class279);
		return class279;
	}

	final void method3165(final ByteBuffer buffer) {
		for (;;) {
			final int i_2_ = buffer.get() & 0xFF;
			System.out.println("Parsing opcode " + i_2_ + ".");
			if (i_2_ == 0) {
				break;
			}
			method3168(i_2_, buffer);
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

	private final void method3168(final int i, final ByteBuffer buffer) {
		if (i == 1) {
			anInt3695 = buffer.getShort() & 0xFFFF;
			anInt3728 = buffer.getShort() & 0xFFFF;
			if (anInt3728 == 65535) {
				anInt3728 = -1;
			}
			if (anInt3695 == 65535) {
				anInt3695 = -1;
			}
		} else if (i == 2) {
			anInt3690 = buffer.getShort() & 0xFFFF;
		} else if (i != 3) {
			if (i == 4) {
				anInt3704 = buffer.getShort() & 0xFFFF;
			} else if (i == 5) {
				anInt3712 = buffer.getShort() & 0xFFFF;
			} else if (i != 6) {
				if (i == 7) {
					anInt3688 = buffer.getShort() & 0xFFFF;
				} else if (i == 8) {
					anInt3692 = buffer.getShort() & 0xFFFF;
				} else if (i != 9) {
					if (i == 26) {
						anInt3714 = (short) ((buffer.get() & 0xFF) * 4);
						anInt3713 = (short) ((buffer.get() & 0xFF) * 4);
					} else if (i == 27) {
						if (anIntArrayArray3684 == null) {
							anIntArrayArray3684 = new int[bodyDefiniton.partsData.length][];// this
						}
						// would
						// be
						// like
						// player.getBody().partsData.length
						// or
						// w/e
						final int i_11_ = buffer.get() & 0xFF;
						anIntArrayArray3684[i_11_] = new int[6];
						for (int i_12_ = 0; i_12_ < 6; i_12_++) {
							anIntArrayArray3684[i_11_][i_12_] = buffer
									.getShort();
						}
					} else if (i != 28) {
						if (i == 29) {
							anInt3701 = buffer.get() & 0xFF;
						} else if (i == 30) {
							anInt3708 = buffer.getShort() & 0xFFFF;
						} else if (i == 31) {
							anInt3726 = buffer.get() & 0xFF;
						} else if (i != 32) {
							if (i == 33) {
								anInt3693 = buffer.getShort();
							} else if (i == 34) {
								anInt3723 = buffer.get() & 0xFF;
							} else if (i == 35) {
								anInt3717 = buffer.getShort() & 0xFFFF;
							} else if (i != 36) {
								if (i == 37) {
									anInt3694 = buffer.get() & 0xFF;
								} else if (i == 38) {
									anInt3722 = buffer.getShort() & 0xFFFF;
								} else if (i == 39) {
									anInt3675 = buffer.getShort() & 0xFFFF;
								} else if (i != 40) {
									if (i == 41) {
										anInt3730 = buffer.getShort() & 0xFFFF;
									} else if (i == 42) {
										anInt3715 = buffer.getShort() & 0xFFFF;
									} else if (i == 43) {
										anInt3698 = buffer.getShort() & 0xFFFF;
									} else if (i == 44) {
										anInt3683 = buffer.getShort() & 0xFFFF;
									} else if (i == 45) {
										anInt3707 = buffer.getShort() & 0xFFFF;
									} else if (i != 46) {
										if (i == 47) {
											anInt3689 = buffer.getShort() & 0xFFFF;
										} else if (i == 48) {
											anInt3710 = buffer.getShort() & 0xFFFF;
										} else if (i == 49) {
											anInt3711 = buffer.getShort() & 0xFFFF;
										} else if (i != 50) {
											if (i == 51) {
												anInt3677 = buffer.getShort() & 0xFFFF;
											} else if (i == 52) {
												final int i_13_ = buffer.get() & 0xFF;
												anIntArray3696 = new int[i_13_];
												anIntArray3700 = new int[i_13_];
												for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
													anIntArray3700[i_14_] = buffer
															.getShort() & 0xFFFF;
													final int i_15_ = buffer
															.get() & 0xFF;
													anIntArray3696[i_14_] = i_15_;
												}
											} else if (i == 53) {
												aBoolean3721 = false;
											} else if (i != 54) {
												if (i != 55) {
													if (i == 56) {
														if (anIntArrayArray3687 == null) {
															anIntArrayArray3687 = new int[bodyDefiniton.partsData.length][];
														}
														final int i_16_ = buffer
																.get() & 0xFF;
														anIntArrayArray3687[i_16_] = new int[3];
														for (int i_17_ = 0; i_17_ < 3; i_17_++) {
															anIntArrayArray3687[i_16_][i_17_] = buffer
																	.getShort();
														}
													}
												} else {
													if (anIntArray3699 == null) {
														anIntArray3699 = new int[bodyDefiniton.partsData.length];
													}
													final int i_18_ = buffer
															.get() & 0xFF;
													anIntArray3699[i_18_] = buffer
															.getShort() & 0xFFFF;
												}
											} else {
												anInt3682 = (buffer.get() & 0xFF) << 6;
												anInt3709 = (buffer.get() & 0xFF) << 6;
											}
										} else {
											anInt3727 = buffer.getShort() & 0xFFFF;
										}
									} else {
										anInt3686 = buffer.getShort() & 0xFFFF;
									}
								} else {
									anInt3676 = buffer.getShort() & 0xFFFF;
								}
							} else {
								anInt3716 = buffer.getShort();
							}
						} else {
							anInt3703 = buffer.getShort() & 0xFFFF;
						}
					} else {
						final int i_19_ = buffer.get() & 0xFF;
						anIntArray3685 = new int[i_19_];
						for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
							anIntArray3685[i_20_] = buffer.get() & 0xFF;
							if (anIntArray3685[i_20_] == 255) {
								anIntArray3685[i_20_] = -1;
							}
						}
					}
				} else {
					anInt3691 = buffer.getShort() & 0xFFFF;
				}
			} else {
				anInt3680 = buffer.getShort() & 0xFFFF;
			}
		} else {
			anInt3729 = buffer.getShort() & 0xFFFF;
		}
	}

	public RenderAnimationDefinition(final BodyDefinition body) {
		this.bodyDefiniton = body;
		anInt3683 = -1;
		anInt3694 = -1;
		anInt3691 = -1;
		anInt3704 = -1;
		anIntArray3700 = null;
		anInt3698 = -1;
		anInt3714 = 0;
		anIntArray3696 = null;
		anInt3710 = -1;
		anInt3712 = -1;
		anInt3692 = -1;
		anInt3695 = -1;
		anInt3707 = -1;
		anInt3701 = 0;
		anInt3703 = 0;
		anInt3680 = -1;
		anInt3713 = 0;
		anInt3722 = -1;
		anInt3676 = -1;
		anInt3708 = 0;
		aBoolean3721 = true;
		anInt3686 = -1;
		anInt3675 = -1;
		anInt3709 = 0;
		anInt3690 = -1;
		anInt3711 = -1;
		anInt3727 = -1;
		anInt3728 = -1;
		anInt3682 = 0;
		anInt3726 = 0;
		anInt3723 = 0;
		anInt3715 = -1;
		anInt3729 = -1;
		anInt3689 = -1;
		anInt3717 = 0;
		anInt3716 = 0;
		anInt3730 = -1;
	}
}
