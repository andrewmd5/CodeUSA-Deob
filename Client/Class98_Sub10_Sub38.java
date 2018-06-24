/* Class98_Sub10_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class98_Sub10_Sub38 extends Class98_Sub10 {
	static int anInt5751;
	static int anInt5752;
	static int anInt5753;
	private int anInt5754 = 409;
	private int anInt5755 = 0;
	static boolean aBoolean5756;
	private int anInt5757;
	private int anInt5758;
	static boolean[] aBooleanArray5759 = new boolean[100];
	private int anInt5760;
	static int anInt5761;
	private int[][] anIntArrayArray5762;
	private int anInt5763 = 8;
	private int[][] anIntArrayArray5764;
	static Class135 aClass135_5765;
	private int anInt5766;
	private int[] anIntArray5767;
	private int anInt5768;
	private int anInt5769;
	private int anInt5770;
	private int anInt5771;

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_0_) {
		while_255_: do {
			try {
				if (i_0_ >= -92) {
					break;
				}
				final int i_1_ = i;
				while_254_: do {
					while_253_: do {
						while_252_: do {
							while_251_: do {
								while_250_: do {
									do {
										if ((i_1_ ^ 0xffffffff) != -1) {
											if (i_1_ != 1) {
												if (i_1_ != 2) {
													if (i_1_ != 3) {
														if (i_1_ != 4) {
															if ((i_1_ ^ 0xffffffff) != -6) {
																if ((i_1_ ^ 0xffffffff) != -7) {
																	if (i_1_ != 7) {
																		break while_255_;
																	}
																} else {
																	break while_253_;
																}
																break while_254_;
															}
														} else {
															break while_251_;
														}
														break while_252_;
													}
												} else {
													break;
												}
												break while_250_;
											}
										} else {
											anInt5771 = class98_sub22
													.readUnsignedByte((byte) -123);
											break while_255_;
										}
										anInt5763 = class98_sub22
												.readUnsignedByte((byte) 79);
										break while_255_;
									} while (false);
									anInt5754 = class98_sub22
											.readUnsignedShort((byte) 127);
									break while_255_;
								} while (false);
								anInt5769 = class98_sub22.readUnsignedShort((byte) 127);
								break while_255_;
							} while (false);
							anInt5760 = class98_sub22.readUnsignedShort((byte) 127);
							break while_255_;
						} while (false);
						anInt5755 = class98_sub22.readUnsignedShort((byte) 127);
						break while_255_;
					} while (false);
					anInt5766 = class98_sub22.readUnsignedShort((byte) 127);
					break while_255_;
				} while (false);
				anInt5757 = class98_sub22.readUnsignedShort((byte) 127);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("wia.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_0_ + ')'));
			}
		} while (false);
	}

	static final int method1116(final int i, final int i_2_, int i_3_) {
		try {
			if (i_2_ != 1391) {
				return 124;
			}
			i_3_ = i_3_ * (i & 0x7f) >> -1626377081;
			do {
				if (i_3_ >= 2) {
					if ((i_3_ ^ 0xffffffff) >= -127) {
						break;
					}
					i_3_ = 126;
					if (!client.aBoolean3553) {
						break;
					}
				}
				i_3_ = 2;
			} while (false);
			return i_3_ + (i & 0xff80);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("wia.B(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	@Override
	final int[] method990(final int i, final int i_4_) {
		try {
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_4_);
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				int i_5_ = 0;
				int i_6_;
				for (i_6_ = anInt5755
						+ GameObjectDefinition.anIntArray3001[i_4_]; (i_6_ ^ 0xffffffff) > -1; i_6_ += 4096) {
					/* empty */
				}
				for (/**/; (i_6_ ^ 0xffffffff) < -4097; i_6_ -= 4096) {
					/* empty */
				}
				for (/**/; anInt5763 > i_5_; i_5_++) {
					if (i_6_ < anIntArray5767[i_5_]) {
						break;
					}
				}
				final int i_7_ = i_5_ - 1;
				final boolean bool = (i_5_ & 0x1 ^ 0xffffffff) == -1;
				final int i_8_ = anIntArray5767[i_5_];
				final int i_9_ = anIntArray5767[i_5_ + -1];
				if (i_9_ + anInt5768 >= i_6_
						|| (i_6_ ^ 0xffffffff) <= (-anInt5768 + i_8_ ^ 0xffffffff)) {
					Class236.method2896(is, 0, Class25.anInt268, 0);
				} else {
					for (int i_10_ = 0; i_10_ < Class25.anInt268; i_10_++) {
						int i_11_ = 0;
						final int i_12_ = bool ? anInt5760 : -anInt5760;
						int i_13_;
						for (i_13_ = ((anInt5758 * i_12_ >> 1198328172) + Class64_Sub1.anIntArray3640[i_10_]); i_13_ < 0; i_13_ += 4096) {
							/* empty */
						}
						for (/**/; i_13_ > 4096; i_13_ -= 4096) {
							/* empty */
						}
						for (/**/; i_11_ < anInt5771; i_11_++) {
							if (anIntArrayArray5764[i_7_][i_11_] > i_13_) {
								break;
							}
						}
						final int i_14_ = i_11_ - 1;
						final int i_15_ = anIntArrayArray5764[i_7_][i_14_];
						final int i_16_ = anIntArrayArray5764[i_7_][i_11_];
						if (i_15_ - -anInt5768 < i_13_
								&& ((i_16_ + -anInt5768 ^ 0xffffffff) < (i_13_ ^ 0xffffffff))) {
							is[i_10_] = anIntArrayArray5762[i_7_][i_14_];
						} else {
							is[i_10_] = 0;
						}
					}
				}
			}
			if (i != 255) {
				anInt5769 = 39;
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wia.G(" + i + ','
					+ i_4_ + ')');
		}
	}

	@Override
	final void method1001(final byte i) {
		try {
			method1117(64);
			if (i != 66) {
				anInt5758 = -87;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wia.I(" + i + ')');
		}
	}

	private final void method1117(final int i) {
		try {
			final Random random = new Random(anInt5763);
			anInt5768 = anInt5766 / 2;
			anInt5758 = 4096 / anInt5771;
			anInt5770 = 4096 / anInt5763;
			final int i_17_ = anInt5758 / 2;
			anIntArrayArray5764 = new int[anInt5763][1 + anInt5771];
			anIntArray5767 = new int[1 + anInt5763];
			anIntArrayArray5762 = new int[anInt5763][anInt5771];
			final int i_18_ = anInt5770 / 2;
			anIntArray5767[0] = 0;
			for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > (anInt5763 ^ 0xffffffff); i_19_++) {
				if (i_19_ > 0) {
					int i_20_ = anInt5770;
					final int i_21_ = ((Class63.method546(-28737, 4096, random) + -2048)
							* anInt5769 >> -533582260);
					i_20_ += i_21_ * i_18_ >> -1942924724;
					anIntArray5767[i_19_] = i_20_ + anIntArray5767[i_19_ + -1];
				}
				anIntArrayArray5764[i_19_][0] = 0;
				for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (anInt5771 ^ 0xffffffff); i_22_++) {
					if ((i_22_ ^ 0xffffffff) < -1) {
						int i_23_ = anInt5758;
						final int i_24_ = ((Class63.method546(-28737, 4096,
								random) + -2048) * anInt5754 >> 1772484460);
						i_23_ += i_17_ * i_24_ >> -1938743028;
						anIntArrayArray5764[i_19_][i_22_] = i_23_
								+ anIntArrayArray5764[i_19_][i_22_ - 1];
					}
					anIntArrayArray5762[i_19_][i_22_] = ((anInt5757 ^ 0xffffffff) >= -1 ? 4096
							: 4096 + -Class63.method546(-28737, anInt5757,
									random));
				}
				anIntArrayArray5764[i_19_][anInt5771] = 4096;
			}
			if (i < 62) {
				anInt5752 = -113;
			}
			anIntArray5767[anInt5763] = 4096;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wia.E(" + i + ')');
		}
	}

	public Class98_Sub10_Sub38() {
		super(0, true);
		anInt5760 = 1024;
		anInt5757 = 1024;
		anInt5771 = 4;
		anInt5769 = 204;
		anInt5766 = 81;
	}

	public static void method1118(final boolean bool) {
		do {
			try {
				aClass135_5765 = null;
				aBooleanArray5759 = null;
				if (bool == true) {
					break;
				}
				aClass135_5765 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "wia.D(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static {
		anInt5753 = 0;
		aBoolean5756 = false;
	}
}
