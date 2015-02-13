/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class61 {
	private int anInt477 = 0;
	static short[][][] aShortArrayArrayArray478;
	static int anInt479 = 0;
	private Class377 aClass377_480;
	static Class207 aClass207_481;
	private Class98 aClass98_482;

	static final void method537(final byte i) {
		try {
			Class98_Sub27.method1282((byte) 8,
					Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub17_4046
							.method617((byte) 120));
			final int i_0_ = ((Class272.anInt2038 >> 913933219) + (Class98_Sub46_Sub10.anInt6020 >> -195505812));
			final int i_1_ = ((Class134.anInt3461 >> -1524816148) + (aa_Sub2.anInt3562 >> -522339549));
			Class43.anInt377 = ((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aByte5088 = (byte) 0;
			Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.method3060(8, 8, 1470);
			int i_2_ = 18;
			Class105.aByteArrayArray3414 = new byte[i_2_][];
			Class255.aByteArrayArray3211 = new byte[i_2_][];
			client.aByteArrayArray3551 = new byte[i_2_][];
			Class98_Sub46_Sub17.anIntArrayArray6049 = new int[i_2_][4];
			Class121.anIntArray1006 = new int[i_2_];
			Class246_Sub3_Sub4_Sub2_Sub2.aByteArrayArray6533 = new byte[i_2_][];
			Class98_Sub36.anIntArray4162 = new int[i_2_];
			Class287.anIntArray2188 = new int[i_2_];
			Class377.aByteArrayArray3182 = new byte[i_2_][];
			Class377.anIntArray3178 = new int[i_2_];
			Class76_Sub7.anIntArray3765 = new int[i_2_];
			GameObjectDefinitionLoader.anIntArray2517 = new int[i_2_];
			if (i <= 64) {
				method542(true);
			}
			i_2_ = 0;
			for (int i_3_ = (i_0_ - (Class165.anInt1276 >> -2009281948)) / 8; i_3_ <= ((Class165.anInt1276 >> 1983437604) + i_0_) / 8; i_3_++) {
				for (int i_4_ = (-(Class98_Sub10_Sub7.anInt5572 >> -1249052220) + i_1_) / 8; i_4_ <= ((Class98_Sub10_Sub7.anInt5572 >> 226644196) + i_1_) / 8; i_4_++) {
					final int i_5_ = i_4_ + (i_3_ << 1247776552);
					Class121.anIntArray1006[i_2_] = i_5_;
					Class287.anIntArray2188[i_2_] = Class234.aClass207_1748
							.method2750((byte) -90, "m" + i_3_ + "_" + i_4_);
					Class98_Sub36.anIntArray4162[i_2_] = Class234.aClass207_1748
							.method2750((byte) -69, "l" + i_3_ + "_" + i_4_);
					Class76_Sub7.anIntArray3765[i_2_] = Class234.aClass207_1748
							.method2750((byte) -100, ("n" + i_3_ + "_" + i_4_));
					GameObjectDefinitionLoader.anIntArray2517[i_2_] = Class234.aClass207_1748
							.method2750((byte) -109, ("um" + i_3_ + "_" + i_4_));
					Class377.anIntArray3178[i_2_] = Class234.aClass207_1748
							.method2750((byte) -124, ("ul" + i_3_ + "_" + i_4_));
					if ((Class76_Sub7.anIntArray3765[i_2_] ^ 0xffffffff) == 0) {
						Class287.anIntArray2188[i_2_] = -1;
						Class98_Sub36.anIntArray4162[i_2_] = -1;
						GameObjectDefinitionLoader.anIntArray2517[i_2_] = -1;
						Class377.anIntArray3178[i_2_] = -1;
					}
					i_2_++;
				}
			}
			for (int i_6_ = i_2_; ((i_6_ ^ 0xffffffff) > (Class76_Sub7.anIntArray3765.length ^ 0xffffffff)); i_6_++) {
				Class76_Sub7.anIntArray3765[i_6_] = -1;
				Class287.anIntArray2188[i_6_] = -1;
				Class98_Sub36.anIntArray4162[i_6_] = -1;
				GameObjectDefinitionLoader.anIntArray2517[i_6_] = -1;
				Class377.anIntArray3178[i_6_] = -1;
			}
			int i_7_;
			if (Class177.anInt1376 != 3) {
				i_7_ = 8;
			} else {
				i_7_ = 4;
			}
			Class251.method3170(-6547, i_1_, false, i_0_, i_7_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.C(" + i + ')');
		}
	}

	static final void method538(final int i, final boolean bool) {
		try {
			if (((Class98_Sub46_Sub10.aClass354_6011).worldId) == 1) {
				Game.worldPort = 43594;
				Class354.port = Game.worldPort;
			}
			/*
			 * } else if (((Class98_Sub46_Sub10.aClass354_6011).worldId) == 2) {
			 * System.out.println("Switching port"); Game.worldPort =
			 * 43597; Class354.port = Game.worldPort; }
			 */
			if ((i ^ 0xFFFFFFFF) != (Class177.anInt1376 ^ 0xFFFFFFFF)) {
				if (i == 13) {
					if (Class98_Sub10_Sub10.aString5593 == null) {
						Class251.method3171(Class360.passWord, -17877,
								Class98_Sub5.userName, Class146_Sub2.anInt4855);
					} else {
						Class98_Sub10_Sub14.method1045(Class146_Sub2.anInt4855,
								-6182);
					}
				}
				if ((i != 13) && (Class318.aClass123_2698 != null)) {
					Class318.aClass123_2698.method2207(-61);
					Class318.aClass123_2698 = null;
				}
				if (i == 3) {
					Class269.method3269(Class15.anInt185 != ItemDefs.anInt2470,
							0);
				}
				if ((i ^ 0xFFFFFFFF) == -8) {
					Class96.method922(
							(Class15.anInt185 ^ 0xFFFFFFFF) != (Class19.anInt3450 ^ 0xFFFFFFFF),
							-1);
				}
				if (i == 5) {
					if (Class98_Sub10_Sub10.aString5593 != null) {
						Class27.method296((byte) 55);
					} else {
						Class276.method3285(Class360.passWord,
								Class98_Sub5.userName, (byte) -68);
					}
				} else if (i != 6) {
					if ((i ^ 0xFFFFFFFF) == -10) {
						if (Class98_Sub10_Sub10.aString5593 == null) {
							Class251.method3171(Class360.passWord, -17877,
									Class98_Sub5.userName,
									Class146_Sub2.anInt4855);
						} else {
							Class98_Sub10_Sub14.method1045(
									Class146_Sub2.anInt4855, -6182);
						}
					} else if ((i ^ 0xFFFFFFFF) == -13) {
						if (Class98_Sub10_Sub10.aString5593 == null) {
							Class276.method3285(Class360.passWord,
									Class98_Sub5.userName, (byte) -68);
						} else {
							Class27.method296((byte) 55);
						}
					}
				} else if (Class98_Sub10_Sub10.aString5593 != null) {
					Class98_Sub10_Sub14.method1045(Class146_Sub2.anInt4855,
							-6182);
				} else {
					Class251.method3171(Class360.passWord, -17877,
							Class98_Sub5.userName, Class146_Sub2.anInt4855);
				}
				if (Class199.method2690(Class177.anInt1376, 8)) {
					client.aClass207_3549.anInt1575 = 2;
					Class98_Sub10_Sub24.aClass207_5668.anInt1575 = 2;
					Class375.aClass207_3167.anInt1575 = 2;
					Class234.aClass207_1751.anInt1575 = 2;
					Class208.aClass207_1581.anInt1575 = 2;
					Class246_Sub3.ANIMATION_INDEX.anInt1575 = 2;
					PlayerUpdateMask.aClass207_525.anInt1575 = 2;
				}
				if (Class199.method2690(i, 8)) {
					Class280.anInt2105 = 1;
					Class98_Sub5_Sub3.anInt5538 = 1;
					Class130.anInt1031 = 0;
					Class142.anInt1160 = 0;
					Class132.anInt1043 = 0;
					Class118.method2173(true, 122);
					client.aClass207_3549.anInt1575 = 1;
					Class98_Sub10_Sub24.aClass207_5668.anInt1575 = 1;
					Class375.aClass207_3167.anInt1575 = 1;
					Class234.aClass207_1751.anInt1575 = 1;
					Class208.aClass207_1581.anInt1575 = 1;
					Class246_Sub3.ANIMATION_INDEX.anInt1575 = 1;
					PlayerUpdateMask.aClass207_525.anInt1575 = 1;
				}
				if (((i ^ 0xFFFFFFFF) == -12) || (i == 3)) {
					Class4.method174((byte) 99);
				}
				final boolean bool_8_ = ((i ^ 0xFFFFFFFF) == -3)
						|| (Class53_Sub1.method499(2048, i))
						|| (Class246_Sub3_Sub3.method3011(-6410, i));
				final boolean bool_9_ = ((Class177.anInt1376 ^ 0xFFFFFFFF) == -3)
						|| (Class53_Sub1.method499(2048, Class177.anInt1376))
						|| (Class246_Sub3_Sub3.method3011(-6410,
								Class177.anInt1376));
				if (bool_8_ == (!bool_9_)) {
					if (bool_8_) {
						Class144.anInt1169 = Class94.anInt795;
						if ((Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4072
								.method641((byte) 125) ^ 0xFFFFFFFF) == -1) {
							Class96.method923(103, 2);
						} else {
							Class226.method2854(
									false,
									false,
									Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4072
											.method641((byte) 124),
									Class98_Sub10_Sub1.aClass207_5544, 0, 2,
									Class94.anInt795);
							Class233.method2883((byte) 111);
						}
						Class98_Sub10_Sub38.aClass135_5765.method2255(2, false);
					} else {
						Class96.method923(100, 2);
						Class98_Sub10_Sub38.aClass135_5765.method2255(2, true);
					}
				}
				if ((Class199.method2690(i, 8)) || ((i ^ 0xFFFFFFFF) == -14)) {
					Class265.aHa1974.method1817();
				}
				if (!bool) {
					Class177.anInt1376 = i;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.D(" + i + ','
					+ bool + ')');
		}
	}

	final Class98 method539(final int i) {
		try {
			if (i != 2) {
				aClass377_480 = null;
			}
			if ((anInt477 ^ 0xffffffff) < -1
					&& (aClass377_480.aClass98Array3180[anInt477 - 1] != aClass98_482)) {
				final Class98 class98 = aClass98_482;
				aClass98_482 = class98.aClass98_836;
				return class98;
			}
			while ((anInt477 ^ 0xffffffff) > (aClass377_480.anInt3179 ^ 0xffffffff)) {
				final Class98 class98 = ((aClass377_480.aClass98Array3180[anInt477++]).aClass98_836);
				if (class98 != (aClass377_480.aClass98Array3180[-1 + anInt477])) {
					aClass98_482 = class98.aClass98_836;
					return class98;
				}
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.E(" + i + ')');
		}
	}

	static final void method540(final byte i) {
		try {
			if (i != -51) {
				method537((byte) 114);
			}
			Class246.method2962(false);
			za_Sub2.aBoolean6079 = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.A(" + i + ')');
		}
	}

	public Class61() {
		/* empty */
	}

	final Class98 method541(final int i) {
		try {
			anInt477 = i;
			return method539(2);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.F(" + i + ')');
		}
	}

	Class61(final Class377 class377) {
		try {
			aClass377_480 = class377;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.<init>("
					+ (class377 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method542(final boolean bool) {
		try {
			if (bool != false) {
				method537((byte) -49);
			}
			aClass207_481 = null;
			aShortArrayArrayArray478 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ec.B(" + bool
					+ ')');
		}
	}
}
