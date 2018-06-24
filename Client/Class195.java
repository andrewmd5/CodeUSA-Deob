/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class195 {
	static int[] anIntArray1497 = new int[16];
	Interface4_Impl1 anInterface4_Impl1_1498;
	static Class43 aClass43_1499;
	Interface4_Impl1 anInterface4_Impl1_1500 = null;
	boolean aBoolean1501;
	static Class225 aClass225_1502;
	Interface4_Impl2[] anInterface4_Impl2Array1503 = null;
	private ha_Sub3 aHa_Sub3_1504;
	private Interface4_Impl2[] anInterface4_Impl2Array1505;
	static int anInt1506;

	final boolean method2659(final int i) {
		try {
			if (i != -22382) {
				return false;
			}
			if (!aBoolean1501) {
				if (anInterface4_Impl2Array1503 == null) {
					return false;
				}
				return true;
			}
			if (anInterface4_Impl1_1498 == null) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mt.B(" + i + ')');
		}
	}

	public static void method2660(final int i) {
		try {
			aClass225_1502 = null;
			if (i != 26845) {
				method2660(22);
			}
			anIntArray1497 = null;
			aClass43_1499 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mt.D(" + i + ')');
		}
	}

	static final boolean method2661(final int i, final int i_0_,
			final int i_1_, final int i_2_, final byte i_3_) {
		try {
			if (i_3_ > -94) {
				method2662(-60);
			}
			if (!Class98_Sub17.aBoolean3942 || !Class135.aBoolean1052) {
				return false;
			}
			if ((Class4.anInt81 ^ 0xffffffff) > -101) {
				return false;
			}
			if (!Class76_Sub5.method758((byte) 72, i, i_0_, i_1_)) {
				return false;
			}
			final int i_4_ = i_1_ << Class151_Sub8.anInt5015;
			final int i_5_ = i_0_ << Class151_Sub8.anInt5015;
			if (s_Sub1.method3427(
					Class78.aSArray594[i].method3420(i_0_, -12639, i_1_),
					r_Sub2.anInt6333, i_2_, r_Sub2.anInt6333, (byte) 16, i_5_,
					i_4_)) {
				Class151_Sub7.anInt5006++;
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mt.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final boolean method2662(final int i) {
		try {
			if (i > -84) {
				aClass225_1502 = null;
			}
			if (Class76_Sub7.aBoolean3761) {
				try {
					Class203.method2704("showVideoAd",
							Class76_Sub11.anApplet3799, -26978);
					return true;
				} catch (final Throwable throwable) {
					/* empty */
				}
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mt.F(" + i + ')');
		}
	}

	static final boolean method2663(final int i, final int i_6_,
			final boolean bool) {
		try {
			if (bool != false) {
				method2660(-61);
			}
			if ((i & 0x34 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mt.A(" + i + ','
					+ i_6_ + ',' + bool + ')'));
		}
	}

	final boolean method2664(final int i) {
		try {
			if (anInterface4_Impl1_1500 == null) {
				if (Class332_Sub1.anObject5409 == null) {
					final byte[] is = Class134_Sub1.method2244(-31633, 16.0F,
							0.5F, 0.6F, 16, 8, 128, new Class39_Sub1(419684),
							4.0F, 4.0F, 128);
					Class332_Sub1.anObject5409 = Class64_Sub25.method654(2, is,
							false);
				}
				final byte[] is = Class98_Sub28_Sub1.method1310(false,
						Class332_Sub1.anObject5409, false);
				final byte[] is_8_ = new byte[is.length * 4];
				int i_9_ = 0;
				for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -17; i_10_++) {
					int i_11_ = 128 * i_10_ * 128;
					final int i_12_ = i_11_;
					for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -129; i_13_++) {
						final int i_14_ = i_12_ + i_13_ * 128;
						final int i_15_ = i_12_ - -(128 * (0x7f & -1 + i_13_));
						final int i_16_ = i_12_ + 128 * (i_13_ + 1 & 0x7f);
						for (int i_17_ = 0; i_17_ < 128; i_17_++) {
							final float f = (is[i_17_ + i_15_] & 0xff)
									- (0xff & is[i_16_ + i_17_]);
							final float f_18_ = (is[(-1 + i_17_ & 0x7f) + i_14_] & 0xff)
									- (is[(1 + i_17_ & 0x7f) + i_14_] & 0xff);
							final float f_19_ = (float) (128.0 / (Math.sqrt(f
									* f + (16384.0F + (f_18_ * f_18_)))));
							is_8_[i_9_++] = (byte) (int) (f_18_ * f_19_ + 127.0F);
							is_8_[i_9_++] = (byte) (int) (127.0F + 128.0F * f_19_);
							is_8_[i_9_++] = (byte) (int) (f_19_ * f + 127.0F);
							is_8_[i_9_++] = is[i_11_++];
						}
					}
				}
				anInterface4_Impl1_1500 = aHa_Sub3_1504.method2044(-81,
						Class62.aClass164_486, is_8_, 128, 128, 16);
			}
			if (anInterface4_Impl1_1500 == null) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mt.E(" + i + ')');
		}
	}

	Class195(final ha_Sub3 var_ha_Sub3) {
		anInterface4_Impl1_1498 = null;
		anInterface4_Impl2Array1505 = null;
		try {
			aHa_Sub3_1504 = var_ha_Sub3;
			aBoolean1501 = aHa_Sub3_1504.aBoolean4588;
			if (aBoolean1501
					&& !aHa_Sub3_1504.method1977(Class162.aClass162_1266, true,
							Class74.aClass164_547)) {
				aBoolean1501 = false;
			}
			if (aBoolean1501
					|| aHa_Sub3_1504.method1942(0, Class74.aClass164_547,
							Class162.aClass162_1266)) {
				Class98_Sub42.method1477(false);
				if (!aBoolean1501) {
					anInterface4_Impl2Array1503 = new Interface4_Impl2[16];
					for (int i = 0; (i ^ 0xffffffff) > -17; i++) {
						final byte[] is = Class98_Sub10_Sub20.method1061(2,
								32768, 2 * (128 * (i * 128)),
								(Class241.anObject1847));
						anInterface4_Impl2Array1503[i] = aHa_Sub3_1504
								.method2053(128, Class74.aClass164_547,
										(byte) 87, is, true, 128);
					}
					anInterface4_Impl2Array1505 = new Interface4_Impl2[16];
					for (int i = 0; i < 16; i++) {
						final byte[] is = Class98_Sub10_Sub20.method1061(2,
								32768, 16384 * i * 2,
								(Class64_Sub24.anObject3709));
						anInterface4_Impl2Array1505[i] = aHa_Sub3_1504
								.method2053(128, Class74.aClass164_547,
										(byte) 87, is, true, 128);
					}
				} else {
					byte[] is = Class98_Sub28_Sub1.method1310(false,
							Class241.anObject1847, false);
					anInterface4_Impl1_1498 = aHa_Sub3_1504.method2044(95,
							Class74.aClass164_547, is, 128, 128, 16);
					is = Class98_Sub28_Sub1.method1310(false,
							(Class64_Sub24.anObject3709), false);
					aHa_Sub3_1504.method2044(125, Class74.aClass164_547, is,
							128, 128, 16);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mt.<init>("
					+ (var_ha_Sub3 != null ? "{...}" : "null") + ')');
		}
	}
}
