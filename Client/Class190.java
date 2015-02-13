/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class190 {
	int anInt1460;
	private Interface4_Impl2 anInterface4_Impl2_1461;
	private int anInt1462;
	static int[] anIntArray1463 = new int[1];
	private Class15 aClass15_1464;
	private ha_Sub3 aHa_Sub3_1465;
	private int anInt1466;
	private int anInt1467;
	static byte[][][] aByteArrayArrayArray1468;
	private int anInt1469 = -1;
	boolean aBoolean1470 = true;
	private Interface2_Impl2 anInterface2_Impl2_1471;
	private int anInt1472;

	final void method2643(final int i) {
		try {
			if (i != 30925) {
				method2648(-107L, -52);
			}
			method2645(-18732, anInterface2_Impl2_1471, anInt1460);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mj.C(" + i + ')');
		}
	}

	static final byte method2644(final int i, final int i_0_, final int i_1_) {
		try {
			if (i_0_ <= 54) {
				method2644(8, 49, -34);
			}
			if ((i ^ 0xffffffff) != -10) {
				return (byte) 0;
			}
			if ((i_1_ & 0x1) != 0) {
				return (byte) 2;
			}
			return (byte) 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mj.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method2645(final int i, final Interface2_Impl2 interface2_impl2,
			final int i_2_) {
		try {
			if ((i_2_ ^ 0xffffffff) < -1) {
				method2647(128);
				aHa_Sub3_1465.method2005(anInterface4_Impl2_1461, 125);
				aHa_Sub3_1465.method1973(Class336.aClass232_2822, 1
						+ -anInt1472 + anInt1462, 0, 26810, interface2_impl2,
						anInt1472, i_2_);
			}
			if (i != -18732) {
				method2646(41);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mj.B(" + i + ','
					+ (interface2_impl2 != null ? "{...}" : "null") + ','
					+ i_2_ + ')'));
		}
	}

	public static void method2646(final int i) {
		do {
			try {
				anIntArray1463 = null;
				aByteArrayArrayArray1468 = null;
				if (i == 27387) {
					break;
				}
				method2646(102);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "mj.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	private final void method2647(final int i) {
		try {
			if (i != 128) {
				anInterface4_Impl2_1461 = null;
			}
			if (aBoolean1470) {
				aBoolean1470 = false;
				final byte[] is = aClass15_1464.aByteArray176;
				int i_3_ = 0;
				final int i_4_ = aClass15_1464.anInt180;
				int i_5_ = (aClass15_1464.anInt180 * anInt1466 + anInt1467);
				for (int i_6_ = -128; (i_6_ ^ 0xffffffff) > -1; i_6_++) {
					i_3_ = -i_3_ + (i_3_ << -266560856);
					for (int i_7_ = -128; i_7_ < 0; i_7_++) {
						if (is[i_5_++] != 0) {
							i_3_++;
						}
					}
					i_5_ += i_4_ - 128;
				}
				if (anInterface4_Impl2_1461 != null
						&& (i_3_ ^ 0xffffffff) == (anInt1469 ^ 0xffffffff)) {
					aBoolean1470 = false;
				} else {
					anInt1469 = i_3_;
					i_5_ = anInt1467 - -(anInt1466 * i_4_);
					int i_8_ = 0;
					if (!aHa_Sub3_1465.method1942(i + -128,
							Class53_Sub1.aClass164_3633,
							Class162.aClass162_1266)) {
						if (Class64_Sub1.anIntArray3639 == null) {
							Class64_Sub1.anIntArray3639 = new int[16384];
						}
						final int[] is_9_ = Class64_Sub1.anIntArray3639;
						for (int i_10_ = -128; (i_10_ ^ 0xffffffff) > -1; i_10_++) {
							for (int i_11_ = -128; (i_11_ ^ 0xffffffff) > -1; i_11_++) {
								if ((is[i_5_] ^ 0xffffffff) != -1) {
									is_9_[i_8_++] = 1140850688;
								} else {
									int i_12_ = 0;
									if (is[i_5_ - 1] != 0) {
										i_12_++;
									}
									if (is[i_5_ - -1] != 0) {
										i_12_++;
									}
									if (is[i_5_ - i_4_] != 0) {
										i_12_++;
									}
									if ((is[i_4_ + i_5_] ^ 0xffffffff) != -1) {
										i_12_++;
									}
									is_9_[i_8_++] = i_12_ * 17 << -1644342728;
								}
								i_5_++;
							}
							i_5_ += aClass15_1464.anInt180 + -128;
						}
						if (anInterface4_Impl2_1461 != null) {
							anInterface4_Impl2_1461.method49(17779, 0, 128,
									(Class64_Sub1.anIntArray3639), 0, 0, 128,
									128);
						} else {
							anInterface4_Impl2_1461 = aHa_Sub3_1465.method2012(
									128, 128, (byte) 31,
									(Class64_Sub1.anIntArray3639), false);
							anInterface4_Impl2_1461.method46(false, false, i
									+ -61);
						}
					} else {
						if (Class298.aByteArray2492 == null) {
							Class298.aByteArray2492 = new byte[16384];
						}
						final byte[] is_13_ = Class298.aByteArray2492;
						for (int i_14_ = -128; (i_14_ ^ 0xffffffff) > -1; i_14_++) {
							for (int i_15_ = -128; (i_15_ ^ 0xffffffff) > -1; i_15_++) {
								if ((is[i_5_] ^ 0xffffffff) != -1) {
									is_13_[i_8_++] = (byte) 68;
								} else {
									int i_16_ = 0;
									if ((is[-1 + i_5_] ^ 0xffffffff) != -1) {
										i_16_++;
									}
									if (is[i_5_ - -1] != 0) {
										i_16_++;
									}
									if ((is[i_5_ - i_4_] ^ 0xffffffff) != -1) {
										i_16_++;
									}
									if (is[i_4_ + i_5_] != 0) {
										i_16_++;
									}
									is_13_[i_8_++] = (byte) (17 * i_16_);
								}
								i_5_++;
							}
							i_5_ += aClass15_1464.anInt180 - 128;
						}
						if (anInterface4_Impl2_1461 == null) {
							anInterface4_Impl2_1461 = aHa_Sub3_1465.method2053(
									128, (Class53_Sub1.aClass164_3633),
									(byte) 87, (Class298.aByteArray2492),
									false, 128);
							anInterface4_Impl2_1461.method46(false, false, 124);
						} else {
							anInterface4_Impl2_1461.method41(128, 0, 128, 0,
									128, -26946, Class298.aByteArray2492,
									Class53_Sub1.aClass164_3633, 0);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mj.F(" + i + ')');
		}
	}

	Class190(final ha_Sub3 var_ha_Sub3, final Class15 class15,
			final s_Sub2 var_s_Sub2, final int i, final int i_17_,
			final int i_18_, final int i_19_, final int i_20_) {
		try {
			aClass15_1464 = class15;
			anInt1466 = i_20_;
			anInt1467 = i_19_;
			aHa_Sub3_1465 = var_ha_Sub3;
			final int i_21_ = 1 << i_18_;
			int i_22_ = 0;
			final int i_23_ = i << i_18_;
			final int i_24_ = i_17_ << i_18_;
			for (int i_25_ = 0; i_21_ > i_25_; i_25_++) {
				int i_26_ = ((s) var_s_Sub2).anInt2203 * (i_24_ - -i_25_)
						+ i_23_;
				for (int i_27_ = 0; (i_21_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++) {
					final short[] is = var_s_Sub2.aShortArrayArray5230[i_26_++];
					if (is != null) {
						i_22_ += is.length;
					}
				}
			}
			if (i_22_ > 0) {
				anInt1472 = 2147483647;
				anInt1462 = -2147483648;
				anInterface2_Impl2_1471 = aHa_Sub3_1465.method1990((byte) 84,
						false);
				anInterface2_Impl2_1471.method76(i_22_, 20779);
				for (int i_28_ = 0; i_28_ < 4; i_28_++) {
					final Buffer buffer = anInterface2_Impl2_1471.method78(
							true, -102);
					if (buffer != null) {
						final Stream stream = aHa_Sub3_1465.method2043(24022,
								buffer);
						if (Stream.a()) {
							for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff); i_29_++) {
								int i_30_ = (((i_24_ - -i_29_) * ((s) var_s_Sub2).anInt2203) + i_23_);
								for (int i_31_ = 0; ((i_21_ ^ 0xffffffff) < (i_31_ ^ 0xffffffff)); i_31_++) {
									final short[] is = (var_s_Sub2.aShortArrayArray5230[i_30_++]);
									if (is != null) {
										for (int i_32_ = 0; ((is.length ^ 0xffffffff) < (i_32_ ^ 0xffffffff)); i_32_++) {
											final int i_33_ = 0xffff & is[i_32_];
											if (i_33_ > anInt1462) {
												anInt1462 = i_33_;
											}
											if (anInt1472 > i_33_) {
												anInt1472 = i_33_;
											}
											stream.c(i_33_);
										}
									}
								}
							}
						} else {
							for (int i_34_ = 0; i_34_ < i_21_; i_34_++) {
								int i_35_ = i_23_
										+ ((i_24_ - -i_34_) * ((s) var_s_Sub2).anInt2203);
								for (int i_36_ = 0; i_36_ < i_21_; i_36_++) {
									final short[] is = (var_s_Sub2.aShortArrayArray5230[i_35_++]);
									if (is != null) {
										for (int i_37_ = 0; is.length > i_37_; i_37_++) {
											final int i_38_ = is[i_37_] & 0xffff;
											if ((i_38_ ^ 0xffffffff) > (anInt1472 ^ 0xffffffff)) {
												anInt1472 = i_38_;
											}
											if ((i_38_ ^ 0xffffffff) < (anInt1462 ^ 0xffffffff)) {
												anInt1462 = i_38_;
											}
											stream.d(i_38_);
										}
									}
								}
							}
						}
						stream.c();
						if (anInterface2_Impl2_1471.method79((byte) -120)) {
							break;
						}
					}
				}
				anInt1460 = i_22_ / 3;
			} else {
				anInt1460 = 0;
				anInterface4_Impl2_1461 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mj.<init>("
					+ (var_ha_Sub3 != null ? "{...}" : "null") + ','
					+ (class15 != null ? "{...}" : "null") + ','
					+ (var_s_Sub2 != null ? "{...}" : "null") + ',' + i + ','
					+ i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ')'));
		}
	}

	static final void method2648(final long l, final int i) {
		try {
			if (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948 != null) {
				if (Class98_Sub46_Sub20_Sub2.anInt6319 == 1
						|| Class98_Sub46_Sub20_Sub2.anInt6319 == 5) {
					Class153.method2489(l, (byte) -102);
				} else if ((Class98_Sub46_Sub20_Sub2.anInt6319 ^ 0xffffffff) == -5) {
					Class64_Sub6.method573(-1, l);
				}
			}
			Class45.method431(Class215.anInt1614, true, Class265.aHa1974);
			if (Class15.anInt185 != -1) {
				Class350.method3844(Class15.anInt185, -47);
			}
			for (int i_40_ = 0; (Class69_Sub2.anInt5335 ^ 0xffffffff) < (i_40_ ^ 0xffffffff); i_40_++) {
				if (aa_Sub3.aBooleanArray3574[i_40_]) {
					Class98_Sub10_Sub20.aBooleanArray5639[i_40_] = true;
				}
				Class232.aBooleanArray1741[i_40_] = aa_Sub3.aBooleanArray3574[i_40_];
				aa_Sub3.aBooleanArray3574[i_40_] = false;
			}
			Class77_Sub1.anInt3803 = Class215.anInt1614;
			Class98_Sub1.method946(-1, -125, -1, null);
			Class304.method3563(-1, null, -1, 60);
			if ((Class15.anInt185 ^ 0xffffffff) != 0) {
				Class69_Sub2.anInt5335 = 0;
				Class215.method2791((byte) 118);
			}
			Class265.aHa1974.la();
			Class98_Sub10_Sub22.method1069(256, Class265.aHa1974);
			int i_41_ = Class83.method824((byte) -72);
			if (i_41_ == -1) {
				i_41_ = Class21_Sub2.anInt5387;
			}
			if ((i_41_ ^ 0xffffffff) == 0) {
				i_41_ = OutputStream_Sub2.anInt39;
			}
			Class43.method401(i_41_, true);
			final int i_42_ = (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660
					.method3034(0) << 2087692776);
			Class169.method2535(
					Class279.anInt2099,
					(((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aByte5088),
					(((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5079)
							- -i_42_,
					(((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5084)
							+ i_42_, (byte) 112);
			Class279.anInt2099 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mj.A(" + l + ','
					+ i + ')');
		}
	}
}
