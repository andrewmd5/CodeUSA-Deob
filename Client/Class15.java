/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class15 {
	static boolean aBoolean169 = false;
	static int anInt170;
	private ha_Sub3 aHa_Sub3_171;
	static int anInt172;
	private s_Sub2 aS_Sub2_173;
	private int anInt174;
	private int anInt175;
	byte[] aByteArray176;
	static OutgoingOpcode aClass171_177 = new OutgoingOpcode(39, 8);
	private int anInt178;
	private int anInt179;
	int anInt180;
	private Class190[][] aClass190ArrayArray181;
	static int[] anIntArray182;
	static OutgoingOpcode aClass171_183 = new OutgoingOpcode(32, 0);
	static IncomingOpcode aClass58_184 = new IncomingOpcode(103, 7);
	static volatile int anInt185 = -1;
	static boolean aBoolean186 = false;

	final void method227(final int i, final boolean bool,
			final boolean[][] bools, final int i_0_, final int i_1_,
			final int i_2_) {
		try {
			aHa_Sub3_171.method1979(false, -89);
			aHa_Sub3_171.method1997(0, false);
			aHa_Sub3_171.method2001(1, 106);
			aHa_Sub3_171.method2015(1, (byte) 76);
			aHa_Sub3_171.method2039(false, 0, -2, false);
			if (i_2_ <= 15) {
				anInt172 = -11;
			}
			final float f = 1.0F / (aHa_Sub3_171.anInt4553 * 128);
			if (bool) {
				for (int i_3_ = 0; (anInt175 ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
					final int i_4_ = i_3_ << anInt174;
					final int i_5_ = i_3_ - -1 << anInt174;
					for (int i_6_ = 0; i_6_ < anInt178; i_6_++) {
						if (aClass190ArrayArray181[i_6_][i_3_] != null) {
							final int i_7_ = i_6_ << anInt174;
							final int i_8_ = 1 + i_6_ << anInt174;
							while_22_: for (int i_9_ = i_7_; (i_8_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
								if (-i_1_ <= -i + i_9_ && i_1_ >= i_9_ - i) {
									for (int i_10_ = i_4_; ((i_10_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff)); i_10_++) {
										if (-i_0_ + i_10_ >= -i_1_
												&& i_1_ >= i_10_ - i_0_
												&& (bools[i_1_ + (-i + i_9_)][i_1_
														+ (i_10_ - i_0_)])) {
											final Class111_Sub3 class111_sub3 = aHa_Sub3_171
													.method1957((byte) -89);
											class111_sub3.method2137(f,
													(byte) -113, f, 1.0F);
											class111_sub3.method2106(-i_6_,
													-i_3_, 0);
											aHa_Sub3_171
													.method2008(
															(Class246_Sub3_Sub4_Sub5.aClass258_6260),
															(byte) 81);
											aClass190ArrayArray181[i_6_][i_3_]
													.method2643(30925);
											break while_22_;
										}
									}
								}
							}
						}
					}
				}
			} else {
				for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (anInt175 ^ 0xffffffff); i_11_++) {
					final int i_12_ = i_11_ << anInt174;
					final int i_13_ = 1 + i_11_ << anInt174;
					for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (anInt178 ^ 0xffffffff); i_14_++) {
						final Class190 class190 = aClass190ArrayArray181[i_14_][i_11_];
						if (class190 != null) {
							final Interface2_Impl2 interface2_impl2 = aHa_Sub3_171
									.method1963(61, 3 * (class190.anInt1460));
							final Buffer buffer = interface2_impl2.method78(
									true, -116);
							if (buffer != null) {
								final Stream stream = aHa_Sub3_171.method2043(
										24022, buffer);
								int i_15_ = 0;
								final int i_16_ = i_14_ << anInt174;
								final int i_17_ = i_14_ + 1 << anInt174;
								for (int i_18_ = i_12_; i_13_ > i_18_; i_18_++) {
									if (-i_1_ <= i_18_ + -i_0_
											&& -i_0_ + i_18_ <= i_1_) {
										int i_19_ = ((((s) aS_Sub2_173).anInt2203 * i_18_) + i_16_);
										for (int i_20_ = i_16_; ((i_17_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff)); i_20_++) {
											if (((-i + i_20_ ^ 0xffffffff) <= (-i_1_ ^ 0xffffffff))
													&& i_1_ >= -i + i_20_
													&& (bools[i_1_
															+ (-i + i_20_)][i_18_
															- i_0_ - -i_1_])) {
												final short[] is = (aS_Sub2_173.aShortArrayArray5230[i_19_]);
												if (is != null) {
													if (!Stream.a()) {
														for (int i_21_ = 0; is.length > i_21_; i_21_++) {
															i_15_++;
															stream.d(is[i_21_] & 0xffff);
														}
													} else {
														for (int i_22_ = 0; i_22_ < is.length; i_22_++) {
															i_15_++;
															stream.c(0xffff & is[i_22_]);
														}
													}
												}
											}
											i_19_++;
										}
									}
								}
								stream.c();
								if (interface2_impl2.method79((byte) -99)
										&& (i_15_ ^ 0xffffffff) < -1) {
									final Class111_Sub3 class111_sub3 = aHa_Sub3_171
											.method1957((byte) -78);
									class111_sub3.method2137(f, (byte) -124, f,
											1.0F);
									class111_sub3.method2106(-i_14_, -i_11_, 0);
									aHa_Sub3_171
											.method2008(
													(Class246_Sub3_Sub4_Sub5.aClass258_6260),
													(byte) 94);
									class190.method2645(-18732,
											interface2_impl2, i_15_ / 3);
								}
							}
						}
					}
				}
			}
			aHa_Sub3_171.method1985(2);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bba.G(" + i + ','
					+ bool + ',' + (bools != null ? "{...}" : "null") + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final boolean method228(final int i, final int i_23_, final int i_24_) {
		try {
			if (i_23_ != 1) {
				method233(-41);
			}
			if (!s_Sub1.method3432(i_24_, (byte) -49, i)
					&& !r_Sub2.method1655(i_24_, (byte) -124, i)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bba.F(" + i + ','
					+ i_23_ + ',' + i_24_ + ')'));
		}
	}

	final void method229(final byte i) {
		try {
			aClass190ArrayArray181 = new Class190[anInt178][anInt175];
			if (i >= -9) {
				anInt174 = 95;
			}
			for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (anInt175 ^ 0xffffffff); i_25_++) {
				for (int i_26_ = 0; i_26_ < anInt178; i_26_++) {
					aClass190ArrayArray181[i_26_][i_25_] = new Class190(
							aHa_Sub3_171, this, aS_Sub2_173, i_26_, i_25_,
							anInt174, 1 + i_26_ * 128, 1 + i_25_ * 128);
					if (((aClass190ArrayArray181[i_26_][i_25_].anInt1460) ^ 0xffffffff) == -1) {
						aClass190ArrayArray181[i_26_][i_25_] = null;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bba.E(" + i + ')');
		}
	}

	private final void method230(final int i, final int i_27_, final int i_28_,
			final int i_29_, final int i_30_) {
		try {
			if (aClass190ArrayArray181 != null) {
				final int i_31_ = i_28_ - 1 >> 1264444711;
				final int i_32_ = i_29_ + (i_28_ - 1 + -1) >> 1674907143;
				final int i_33_ = -1 + i_27_ >> -1840220025;
				if (i != -30590) {
					method227(80, true, null, -46, -43, -39);
				}
				final int i_34_ = -1 + i_27_ + (-1 - -i_30_) >> -724193337;
				for (int i_35_ = i_31_; (i_32_ ^ 0xffffffff) <= (i_35_ ^ 0xffffffff); i_35_++) {
					final Class190[] class190s = aClass190ArrayArray181[i_35_];
					for (int i_36_ = i_33_; i_36_ <= i_34_; i_36_++) {
						if (class190s[i_36_] != null) {
							class190s[i_36_].aBoolean1470 = true;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bba.B(" + i + ','
					+ i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ')'));
		}
	}

	final void method231(final r var_r, int i, final byte i_37_, int i_38_) {
		try {
			if (i_37_ <= 46) {
				anInt172 = -82;
			}
			final r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
			i += var_r_Sub2.anInt6329 + 1;
			i_38_ += 1 + var_r_Sub2.anInt6327;
			int i_39_ = i_38_ * anInt180 + i;
			int i_40_ = 0;
			int i_41_ = var_r_Sub2.anInt6331;
			int i_42_ = var_r_Sub2.anInt6328;
			int i_43_ = -i_42_ + anInt180;
			int i_44_ = 0;
			if ((i_38_ ^ 0xffffffff) >= -1) {
				final int i_45_ = -i_38_ + 1;
				i_38_ = 1;
				i_41_ -= i_45_;
				i_40_ += i_42_ * i_45_;
				i_39_ += i_45_ * anInt180;
			}
			if ((anInt179 ^ 0xffffffff) >= (i_41_ + i_38_ ^ 0xffffffff)) {
				final int i_46_ = -anInt179 + i_41_ + (i_38_ + 1);
				i_41_ -= i_46_;
			}
			if ((i ^ 0xffffffff) >= -1) {
				final int i_47_ = 1 + -i;
				i_42_ -= i_47_;
				i_39_ += i_47_;
				i_40_ += i_47_;
				i_44_ += i_47_;
				i = 1;
				i_43_ += i_47_;
			}
			if ((anInt180 ^ 0xffffffff) >= (i_42_ + i ^ 0xffffffff)) {
				final int i_48_ = 1 + (i_42_ + i - anInt180);
				i_44_ += i_48_;
				i_43_ += i_48_;
				i_42_ -= i_48_;
			}
			if ((i_42_ ^ 0xffffffff) < -1 && (i_41_ ^ 0xffffffff) < -1) {
				r_Sub2.method1657(i_40_, aByteArray176, i_41_, 1230470320,
						i_43_, i_42_, i_44_, var_r_Sub2.aByteArray6332, i_39_);
				method230(-30590, i_38_, i, i_42_, i_41_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bba.H("
					+ (var_r != null ? "{...}" : "null") + ',' + i + ','
					+ i_37_ + ',' + i_38_ + ')'));
		}
	}

	final void method232(final r var_r, final byte i, int i_49_, int i_50_) {
		try {
			final r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
			i_50_ += var_r_Sub2.anInt6327 - -1;
			i_49_ += 1 + var_r_Sub2.anInt6329;
			int i_51_ = anInt180 * i_50_ + i_49_;
			int i_52_ = 0;
			int i_53_ = var_r_Sub2.anInt6331;
			if (i > -84) {
				method228(23, 21, -126);
			}
			int i_54_ = var_r_Sub2.anInt6328;
			int i_55_ = -i_54_ + anInt180;
			if (i_50_ <= 0) {
				final int i_56_ = 1 - i_50_;
				i_50_ = 1;
				i_52_ += i_56_ * i_54_;
				i_51_ += anInt180 * i_56_;
				i_53_ -= i_56_;
			}
			int i_57_ = 0;
			if ((i_50_ - -i_53_ ^ 0xffffffff) <= (anInt179 ^ 0xffffffff)) {
				final int i_58_ = -anInt179 + (i_53_ + (i_50_ - -1));
				i_53_ -= i_58_;
			}
			if ((i_49_ ^ 0xffffffff) >= -1) {
				final int i_59_ = -i_49_ + 1;
				i_51_ += i_59_;
				i_54_ -= i_59_;
				i_49_ = 1;
				i_57_ += i_59_;
				i_55_ += i_59_;
				i_52_ += i_59_;
			}
			if ((anInt180 ^ 0xffffffff) >= (i_54_ + i_49_ ^ 0xffffffff)) {
				final int i_60_ = -anInt180 + (1 + (i_54_ + i_49_));
				i_54_ -= i_60_;
				i_55_ += i_60_;
				i_57_ += i_60_;
			}
			if ((i_54_ ^ 0xffffffff) < -1 && (i_53_ ^ 0xffffffff) < -1) {
				Class323.method3676(i_53_, i_55_, i_57_, i_54_, aByteArray176,
						false, i_52_, var_r_Sub2.aByteArray6332, i_51_);
				method230(-30590, i_50_, i_49_, i_54_, i_53_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bba.C("
					+ (var_r != null ? "{...}" : "null") + ',' + i + ','
					+ i_49_ + ',' + i_50_ + ')'));
		}
	}

	public static void method233(final int i) {
		try {
			aClass58_184 = null;
			aClass171_183 = null;
			if (i != 8) {
				anInt185 = -128;
			}
			anIntArray182 = null;
			aClass171_177 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bba.A(" + i + ')');
		}
	}

	Class15(final ha_Sub3 var_ha_Sub3, final s_Sub2 var_s_Sub2) {
		try {
			aS_Sub2_173 = var_s_Sub2;
			aHa_Sub3_171 = var_ha_Sub3;
			anInt180 = 2 - -((((s) aS_Sub2_173).anInt2206 * ((s) aS_Sub2_173).anInt2203) >> aHa_Sub3_171.anInt4573);
			anInt179 = (((s) aS_Sub2_173).anInt2204
					* ((s) aS_Sub2_173).anInt2206 >> aHa_Sub3_171.anInt4573) + 2;
			anInt174 = (-((s) aS_Sub2_173).anInt2200 + 7 - -aHa_Sub3_171.anInt4573);
			aByteArray176 = new byte[anInt179 * anInt180];
			anInt178 = ((s) aS_Sub2_173).anInt2203 >> anInt174;
			anInt175 = ((s) aS_Sub2_173).anInt2204 >> anInt174;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bba.<init>("
					+ (var_ha_Sub3 != null ? "{...}" : "null") + ','
					+ (var_s_Sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method234(int i, final r var_r, final int i_61_, int i_62_) {
		try {
			final r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
			i_62_ += 1 + var_r_Sub2.anInt6329;
			i += 1 + var_r_Sub2.anInt6327;
			int i_63_ = anInt180 * i + i_62_;
			int i_64_ = var_r_Sub2.anInt6331;
			int i_65_ = var_r_Sub2.anInt6328;
			if ((i ^ 0xffffffff) >= -1) {
				final int i_66_ = 1 + -i;
				i_63_ += i_66_ * anInt180;
				i = 1;
				i_64_ -= i_66_;
			}
			int i_67_ = -i_65_ + anInt180;
			if (i - -i_64_ >= anInt179) {
				final int i_68_ = 1 + i + i_64_ - anInt179;
				i_64_ -= i_68_;
			}
			if ((i_62_ ^ 0xffffffff) >= -1) {
				final int i_69_ = 1 - i_62_;
				i_62_ = 1;
				i_67_ += i_69_;
				i_65_ -= i_69_;
				i_63_ += i_69_;
			}
			if (anInt180 <= i_65_ + i_62_) {
				final int i_70_ = 1 + (i_65_ + i_62_) + -anInt180;
				i_67_ += i_70_;
				i_65_ -= i_70_;
			}
			if (i_65_ <= 0 || (i_64_ ^ 0xffffffff) >= -1) {
				return false;
			}
			final int i_71_ = i_61_;
			i_67_ += (-1 + i_71_) * anInt180;
			return Class121.method2198(i_63_, i_67_, i_65_, aByteArray176,
					i_71_, 14849, i_64_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bba.D(" + i + ','
					+ (var_r != null ? "{...}" : "null") + ',' + i_61_ + ','
					+ i_62_ + ')'));
		}
	}
}
