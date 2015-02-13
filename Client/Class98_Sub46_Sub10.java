/* Class98_Sub46_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub10 extends Class98_Sub46 {
	String aString6005;
	int anInt6006;
	int anInt6007 = -1;
	int anInt6008 = 12800;
	int anInt6009 = 12800;
	Class148 aClass148_6010;
	static Class354 aClass354_6011;
	static int[][] anIntArrayArray6012 = { { 0, 2, 4, 6 }, { 6, 0, 2, 4 },
			{ 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 },
			{ 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 },
			{ 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 },
			{ 0, 2, 4, 6 } };
	int anInt6013;
	int anInt6014;
	static int[] anIntArray6015;
	int anInt6016 = 0;
	String aString6017;
	static Class148 aClass148_6018 = new Class148();
	static Class197 aClass197_6019;
	static int anInt6020;
	boolean aBoolean6021 = true;
	static int anInt6022 = 0;
	int anInt6023 = 0;

	final boolean method1563(final int i, final int i_0_, final int[] is,
			final int i_1_) {
		try {
			if (i != 31960) {
				method1565(70, -83, false, 79, 63, 26, -76, -81, 21);
			}
			for (Class98_Sub6 class98_sub6 = (Class98_Sub6) aClass148_6010
					.method2418(32); class98_sub6 != null; class98_sub6 = (Class98_Sub6) aClass148_6010
					.method2417(113)) {
				if (class98_sub6.method977(i_0_, (byte) 41, i_1_)) {
					class98_sub6.method979(i_1_, 0, i_0_, is);
					return true;
				}
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("gga.A(" + i + ',' + i_0_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_1_ + ')'));
		}
	}

	final boolean method1564(final int i, final int i_2_, final int i_3_) {
		try {
			if (i != 6) {
				method1567((byte) -19);
			}
			for (Class98_Sub6 class98_sub6 = (Class98_Sub6) aClass148_6010
					.method2418(32); class98_sub6 != null; class98_sub6 = (Class98_Sub6) aClass148_6010
					.method2417(107)) {
				if (class98_sub6.method980(i + -116, i_2_, i_3_)) {
					return true;
				}
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gga.P(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method1565(final int i, final int i_4_,
			final boolean bool, final int i_5_, final int i_6_, final int i_7_,
			final int i_8_, final int i_9_, final int i_10_) {
		do {
			try {
				Class258.aClass155Array1951[Class21_Sub3.anInt5389++] = new Class155(
						i_5_, i_6_, i, i_7_, i_7_, i, i_8_, i_10_, i_10_, i_8_,
						i_9_, i_9_, i_4_, i_4_);
				if (bool == false) {
					break;
				}
				aClass197_6019 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("gga.O(" + i + ',' + i_4_ + ',' + bool + ',' + i_5_
								+ ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ','
								+ i_9_ + ',' + i_10_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1566(final long[] ls, final int i,
			final byte i_11_, final int i_12_, final Object[] objects) {
		do {
			try {
				if (i >= i_12_) {
					break;
				}
				final int i_14_ = (i_12_ + i) / 2;
				int i_15_ = i;
				final long l = ls[i_14_];
				ls[i_14_] = ls[i_12_];
				ls[i_12_] = l;
				final Object object = objects[i_14_];
				objects[i_14_] = objects[i_12_];
				objects[i_12_] = object;
				final int i_16_ = ((l ^ 0xffffffffffffffffL) != -9223372036854775808L ? 1
						: 0);
				for (int i_17_ = i; (i_12_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
					if (ls[i_17_] < l - -(long) (i_17_ & i_16_)) {
						final long l_18_ = ls[i_17_];
						ls[i_17_] = ls[i_15_];
						ls[i_15_] = l_18_;
						final Object object_19_ = objects[i_17_];
						objects[i_17_] = objects[i_15_];
						objects[i_15_++] = object_19_;
					}
				}
				ls[i_12_] = ls[i_15_];
				ls[i_15_] = l;
				objects[i_12_] = objects[i_15_];
				objects[i_15_] = object;
				method1566(ls, i, (byte) 64, -1 + i_15_, objects);
				method1566(ls, i_15_ + 1, (byte) -109, i_12_, objects);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gga.B("
						+ (ls != null ? "{...}" : "null") + ',' + i + ','
						+ i_11_ + ',' + i_12_ + ','
						+ (objects != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method1567(final byte i) {
		try {
			if (i >= 41) {
				anIntArray6015 = null;
				aClass197_6019 = null;
				aClass148_6018 = null;
				anIntArrayArray6012 = null;
				aClass354_6011 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gga.N(" + i + ')');
		}
	}

	static final boolean method1568(final int i, final int i_20_,
			final int i_21_, final int i_22_, final int i_23_,
			final byte i_24_, final int i_25_, final int i_26_,
			final int i_27_, final int i_28_, final int i_29_,
			final Class243 class243) {
		try {
			if (i_24_ != 20) {
				return false;
			}
			int i_30_ = i_21_;
			int i_31_ = i_23_;
			int i_32_ = 64;
			int i_33_ = 64;
			final int i_34_ = -i_32_ + i_21_;
			final int i_35_ = i_23_ + -i_33_;
			PlayerUpdateMask.anIntArrayArray528[i_32_][i_33_] = 99;
			Class339.anIntArrayArray2846[i_32_][i_33_] = 0;
			int i_36_ = 0;
			int i_37_ = 0;
			Class359.anIntArray3060[i_36_] = i_30_;
			Class75.anIntArray580[i_36_++] = i_31_;
			final int[][] is = class243.anIntArrayArray1853;
			while_92_: while ((i_37_ ^ 0xffffffff) != (i_36_ ^ 0xffffffff)) {
				i_30_ = Class359.anIntArray3060[i_37_];
				i_31_ = Class75.anIntArray580[i_37_];
				i_32_ = i_30_ + -i_34_;
				i_33_ = i_31_ + -i_35_;
				i_37_ = 1 + i_37_ & 0xfff;
				final int i_38_ = -class243.anInt1854 + i_30_;
				final int i_39_ = -class243.anInt1855 + i_31_;
				int i_40_ = i_25_;
				while_84_: do {
					while_83_: do {
						while_82_: do {
							while_81_: do {
								do {
									if ((i_40_ ^ 0xffffffff) != 3) {
										if (i_40_ != -3) {
											if ((i_40_ ^ 0xffffffff) != 1) {
												if ((i_40_ ^ 0xffffffff) != 0) {
													if (i_40_ == 0
															|| (i_40_ ^ 0xffffffff) == -2
															|| i_40_ == 2
															|| i_40_ == 3
															|| i_40_ == 9) {
														break while_82_;
													}
													break while_83_;
												}
											} else {
												break;
											}
											break while_81_;
										}
									} else {
										if (i_30_ == i_28_
												&& ((i_31_ ^ 0xffffffff) == (i_29_ ^ 0xffffffff))) {
											Class22.anInt217 = i_31_;
											Class199.anInt1539 = i_30_;
											return true;
										}
										break while_84_;
									}
									if (Class98_Sub5.method960(i_28_, i_27_,
											-113, i_31_, i_20_, i_30_, i_29_,
											i, i)) {
										Class199.anInt1539 = i_30_;
										Class22.anInt217 = i_31_;
										return true;
									}
									break while_84_;
								} while (false);
								if (class243.method2936(i_28_, i_20_, i_29_,
										-1, i_31_, i_27_, i, i_30_, i, i_26_)) {
									Class22.anInt217 = i_31_;
									Class199.anInt1539 = i_30_;
									return true;
								}
								break while_84_;
							} while (false);
							if (class243.method2939(i_27_, i_28_, i_31_, 14672,
									i, i_29_, i_26_, i_30_, i_20_)) {
								Class22.anInt217 = i_31_;
								Class199.anInt1539 = i_30_;
								return true;
							}
							break while_84_;
						} while (false);
						if (class243.method2952(i_29_, i_30_, (byte) -123, i,
								i_31_, i_22_, i_28_, i_25_)) {
							Class22.anInt217 = i_31_;
							Class199.anInt1539 = i_30_;
							return true;
						}
						break while_84_;
					} while (false);
					if (class243.method2938(i_28_, i_22_, i_31_, i_29_, i_25_,
							17761, i, i_30_)) {
						Class22.anInt217 = i_31_;
						Class199.anInt1539 = i_30_;
						return true;
					}
				} while (false);
				i_40_ = 1 + Class339.anIntArrayArray2846[i_32_][i_33_];
				while_85_: do {
					if ((i_32_ ^ 0xffffffff) < -1
							&& PlayerUpdateMask.anIntArrayArray528[-1 + i_32_][i_33_] == 0
							&& (is[-1 + i_38_][i_39_] & 0x43a40000) == 0
							&& (is[i_38_ + -1][i_39_ + i - 1] & 0x4e240000 ^ 0xffffffff) == -1) {
						for (int i_41_ = 1; (i_41_ ^ 0xffffffff) > (-1 + i ^ 0xffffffff); i_41_++) {
							if ((is[-1 + i_38_][i_39_ - -i_41_] & 0x4fa40000) != 0) {
								break while_85_;
							}
						}
						Class359.anIntArray3060[i_36_] = -1 + i_30_;
						Class75.anIntArray580[i_36_] = i_31_;
						i_36_ = i_36_ - -1 & 0xfff;
						PlayerUpdateMask.anIntArrayArray528[-1 + i_32_][i_33_] = 2;
						Class339.anIntArrayArray2846[-1 + i_32_][i_33_] = i_40_;
					}
				} while (false);
				while_86_: do {
					if (i_32_ < 128 + -i
							&& (PlayerUpdateMask.anIntArrayArray528[1 + i_32_][i_33_] ^ 0xffffffff) == -1
							&& (0x60e40000 & is[i_38_ - -i][i_39_]) == 0
							&& (is[i_38_ - -i][-1 + i + i_39_] & 0x78240000 ^ 0xffffffff) == -1) {
						for (int i_42_ = 1; i - 1 > i_42_; i_42_++) {
							if ((is[i_38_ + i][i_42_ + i_39_] & 0x78e40000 ^ 0xffffffff) != -1) {
								break while_86_;
							}
						}
						Class359.anIntArray3060[i_36_] = 1 + i_30_;
						Class75.anIntArray580[i_36_] = i_31_;
						PlayerUpdateMask.anIntArrayArray528[i_32_ - -1][i_33_] = 8;
						i_36_ = i_36_ - -1 & 0xfff;
						Class339.anIntArrayArray2846[i_32_ + 1][i_33_] = i_40_;
					}
				} while (false);
				while_87_: do {
					if ((i_33_ ^ 0xffffffff) < -1
							&& (PlayerUpdateMask.anIntArrayArray528[i_32_][i_33_
									+ -1] ^ 0xffffffff) == -1
							&& ((0x43a40000 & is[i_38_][i_39_ - 1] ^ 0xffffffff) == -1)
							&& ((is[-1 + i_38_ - -i][i_39_ + -1] & 0x60e40000) == 0)) {
						for (int i_43_ = 1; i_43_ < i - 1; i_43_++) {
							if ((is[i_38_ + i_43_][-1 + i_39_] & 0x63e40000) != 0) {
								break while_87_;
							}
						}
						Class359.anIntArray3060[i_36_] = i_30_;
						Class75.anIntArray580[i_36_] = -1 + i_31_;
						i_36_ = 0xfff & 1 + i_36_;
						PlayerUpdateMask.anIntArrayArray528[i_32_][i_33_ - 1] = 1;
						Class339.anIntArrayArray2846[i_32_][-1 + i_33_] = i_40_;
					}
				} while (false);
				while_88_: do {
					if (i_33_ < 128 - i
							&& (PlayerUpdateMask.anIntArrayArray528[i_32_][i_33_ + 1] ^ 0xffffffff) == -1
							&& ((is[i_38_][i_39_ - -i] & 0x4e240000 ^ 0xffffffff) == -1)
							&& ((0x78240000 & is[i_38_ - (-i + 1)][i_39_ - -i]) == 0)) {
						for (int i_44_ = 1; (i_44_ ^ 0xffffffff) > (-1 + i ^ 0xffffffff); i_44_++) {
							if ((0x7e240000 & is[i_38_ + i_44_][i_39_ + i] ^ 0xffffffff) != -1) {
								break while_88_;
							}
						}
						Class359.anIntArray3060[i_36_] = i_30_;
						Class75.anIntArray580[i_36_] = i_31_ - -1;
						PlayerUpdateMask.anIntArrayArray528[i_32_][1 + i_33_] = 4;
						i_36_ = i_36_ + 1 & 0xfff;
						Class339.anIntArrayArray2846[i_32_][1 + i_33_] = i_40_;
					}
				} while (false);
				while_89_: do {
					if ((i_32_ ^ 0xffffffff) < -1
							&& i_33_ > 0
							&& (PlayerUpdateMask.anIntArrayArray528[-1 + i_32_][i_33_ - 1] ^ 0xffffffff) == -1
							&& (is[i_38_ - 1][-1 + i_39_] & 0x43a40000) == 0) {
						for (int i_45_ = 1; (i_45_ ^ 0xffffffff) > (i ^ 0xffffffff); i_45_++) {
							if (((is[-1 + i_38_][-1 + (i_39_ - -i_45_)] & 0x4fa40000) ^ 0xffffffff) != -1
									|| ((is[-1 + i_38_ - -i_45_][i_39_ - 1] & 0x63e40000) ^ 0xffffffff) != -1) {
								break while_89_;
							}
						}
						Class359.anIntArray3060[i_36_] = -1 + i_30_;
						Class75.anIntArray580[i_36_] = -1 + i_31_;
						PlayerUpdateMask.anIntArrayArray528[i_32_ + -1][-1
								+ i_33_] = 3;
						i_36_ = 0xfff & i_36_ + 1;
						Class339.anIntArrayArray2846[-1 + i_32_][-1 + i_33_] = i_40_;
					}
				} while (false);
				while_90_: do {
					if ((i_32_ ^ 0xffffffff) > (128 - i ^ 0xffffffff)
							&& i_33_ > 0
							&& (PlayerUpdateMask.anIntArrayArray528[i_32_ - -1][i_33_
									+ -1] == 0)
							&& (0x60e40000 & is[i_38_ + i][i_39_ + -1]) == 0) {
						for (int i_46_ = 1; (i_46_ ^ 0xffffffff) > (i ^ 0xffffffff); i_46_++) {
							if ((0x78e40000 & is[i_38_ - -i][i_46_
									+ (i_39_ + -1)]) != 0
									|| (is[i_38_ - -i_46_][i_39_ - 1] & 0x63e40000 ^ 0xffffffff) != -1) {
								break while_90_;
							}
						}
						Class359.anIntArray3060[i_36_] = 1 + i_30_;
						Class75.anIntArray580[i_36_] = -1 + i_31_;
						PlayerUpdateMask.anIntArrayArray528[i_32_ - -1][i_33_
								+ -1] = 9;
						i_36_ = 0xfff & i_36_ + 1;
						Class339.anIntArrayArray2846[i_32_ + 1][i_33_ + -1] = i_40_;
					}
				} while (false);
				while_91_: do {
					if ((i_32_ ^ 0xffffffff) < -1
							&& (128 - i ^ 0xffffffff) < (i_33_ ^ 0xffffffff)
							&& (PlayerUpdateMask.anIntArrayArray528[-1 + i_32_][i_33_ + 1] ^ 0xffffffff) == -1
							&& (0x4e240000 & is[-1 + i_38_][i + i_39_]) == 0) {
						for (int i_47_ = 1; i > i_47_; i_47_++) {
							if (((is[-1 + i_38_][i_39_ + i_47_] & 0x4fa40000) != 0)
									|| ((0x7e240000 & is[i_38_ + (-1 - -i_47_)][i
											+ i_39_]) ^ 0xffffffff) != -1) {
								break while_91_;
							}
						}
						Class359.anIntArray3060[i_36_] = i_30_ + -1;
						Class75.anIntArray580[i_36_] = 1 + i_31_;
						i_36_ = 0xfff & 1 + i_36_;
						PlayerUpdateMask.anIntArrayArray528[-1 + i_32_][1 + i_33_] = 6;
						Class339.anIntArrayArray2846[i_32_ - 1][1 + i_33_] = i_40_;
					}
				} while (false);
				if ((128 + -i ^ 0xffffffff) < (i_32_ ^ 0xffffffff)
						&& (i_33_ ^ 0xffffffff) > (128 - i ^ 0xffffffff)
						&& (PlayerUpdateMask.anIntArrayArray528[i_32_ + 1][i_33_
								- -1] ^ 0xffffffff) == -1
						&& ((0x78240000 & is[i + i_38_][i + i_39_] ^ 0xffffffff) == -1)) {
					for (int i_48_ = 1; i_48_ < i; i_48_++) {
						if ((is[i_38_ + i_48_][i + i_39_] & 0x7e240000) != 0
								|| (0x78e40000 & is[i_38_ + i][i_48_ + i_39_] ^ 0xffffffff) != -1) {
							continue while_92_;
						}
					}
					Class359.anIntArray3060[i_36_] = i_30_ - -1;
					Class75.anIntArray580[i_36_] = 1 + i_31_;
					i_36_ = 0xfff & 1 + i_36_;
					PlayerUpdateMask.anIntArrayArray528[1 + i_32_][1 + i_33_] = 12;
					Class339.anIntArrayArray2846[i_32_ - -1][i_33_ + 1] = i_40_;
				}
			}
			Class199.anInt1539 = i_30_;
			Class22.anInt217 = i_31_;
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gga.C(" + i + ','
					+ i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ','
					+ i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ','
					+ i_28_ + ',' + i_29_ + ','
					+ (class243 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1569(final int i) {
		try {
			anInt6009 = 12800;
			anInt6023 = 0;
			anInt6008 = 12800;
			anInt6016 = 0;
			if (i != -1) {
				method1564(71, -12, 111);
			}
			for (Class98_Sub6 class98_sub6 = (Class98_Sub6) aClass148_6010
					.method2418(32); class98_sub6 != null; class98_sub6 = (Class98_Sub6) aClass148_6010
					.method2417(117)) {
				if ((anInt6016 ^ 0xffffffff) > (class98_sub6.anInt3838 ^ 0xffffffff)) {
					anInt6016 = class98_sub6.anInt3838;
				}
				if (anInt6008 > class98_sub6.anInt3839) {
					anInt6008 = class98_sub6.anInt3839;
				}
				if (anInt6009 > class98_sub6.anInt3843) {
					anInt6009 = class98_sub6.anInt3843;
				}
				if ((class98_sub6.anInt3845 ^ 0xffffffff) < (anInt6023 ^ 0xffffffff)) {
					anInt6023 = class98_sub6.anInt3845;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gga.D(" + i + ')');
		}
	}

	final boolean method1570(final byte i, final int i_49_, final int[] is,
			final int i_50_) {
		try {
			for (Class98_Sub6 class98_sub6 = (Class98_Sub6) aClass148_6010
					.method2418(32); class98_sub6 != null; class98_sub6 = (Class98_Sub6) aClass148_6010
					.method2417(109)) {
				if (class98_sub6.method980(-96, i_50_, i_49_)) {
					class98_sub6.method982(i_49_, i_50_, 88, is);
					return true;
				}
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gga.M(" + i + ','
					+ i_49_ + ',' + (is != null ? "{...}" : "null") + ','
					+ i_50_ + ')'));
		}
	}

	static final byte[] method1571(final byte[] is, final byte i) {
		try {
			if (i != -84) {
				method1567((byte) 87);
			}
			final ByteBuffer class98_sub22 = new ByteBuffer(is);
			final int i_52_ = class98_sub22.readUnsignedByte((byte) -103);
			final int i_53_ = class98_sub22.readInt(-2);
			if (i_53_ < 0 || Class333.anInt3390 != 0
					&& i_53_ > Class333.anInt3390) {
				throw new RuntimeException();
			}
			if ((i_52_ ^ 0xffffffff) == -1) {
				final byte[] is_54_ = new byte[i_53_];
				class98_sub22.method1190(is_54_, true, i_53_, 0);
				return is_54_;
			}
			final int i_55_ = class98_sub22.readInt(-2);
			if (i_55_ > 10000000 || i_55_ < 0) {
				return new byte[500];// codeusa the fuck is this //objectsize?
			}
			if ((i_55_ ^ 0xffffffff) > -1
					|| ((Class333.anInt3390 ^ 0xffffffff) != -1 && i_55_ > Class333.anInt3390)) {
				throw new RuntimeException();
			}
			final byte[] is_56_ = new byte[i_55_];
			if ((i_52_ ^ 0xffffffff) != -2) {
				synchronized (Class284_Sub1_Sub1.aClass263_6189) {
					Class284_Sub1_Sub1.aClass263_6189.method3218(is_56_,
							class98_sub22, 18762);
				}
			} else {
				Class330.method3716(is_56_, i_55_, is, i_53_, 9);
			}
			return is_56_;
		} catch (final RuntimeException runtimeexception) {
			System.out.println("Unpack error!");
			return new byte[100];
		}
	}

	static final void method1572(final int i, final int i_57_, final int i_58_) {
		try {
			if (i_57_ == 30585) {
				final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
						.method2628(i, -40, 16);
				class98_sub46_sub17.method1626((byte) -103);
				class98_sub46_sub17.anInt6054 = i_58_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gga.F(" + i + ','
					+ i_57_ + ',' + i_58_ + ')'));
		}
	}

	final boolean method1573(final int i, final int[] is, final int i_59_,
			final int i_60_, final int i_61_) {
		try {
			if (i_59_ >= -80) {
				method1565(31, -45, true, -110, 4, -16, -41, 5, -2);
			}
			for (Class98_Sub6 class98_sub6 = (Class98_Sub6) aClass148_6010
					.method2418(32); class98_sub6 != null; class98_sub6 = (Class98_Sub6) aClass148_6010
					.method2417(103)) {
				if (class98_sub6.method976(i_60_, 113, i_61_, i)) {
					class98_sub6.method982(i_60_, i_61_, 94, is);
					return true;
				}
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gga.E(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_59_ + ','
					+ i_60_ + ',' + i_61_ + ')'));
		}
	}

	Class98_Sub46_Sub10(final int i, final String string,
			final String string_62_, final int i_63_, final int i_64_,
			final boolean bool, final int i_65_, final int i_66_) {
		anInt6013 = -1;
		try {
			anInt6007 = i_65_;
			anInt6014 = i;
			aString6005 = string_62_;
			anInt6006 = i_63_;
			aString6017 = string;
			aBoolean6021 = bool;
			anInt6013 = i_64_;
			if (anInt6007 == 255) {
				anInt6007 = 0;
			}
			aClass148_6010 = new Class148();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("gga.<init>(" + i + ','
							+ (string != null ? "{...}" : "null") + ','
							+ (string_62_ != null ? "{...}" : "null") + ','
							+ i_63_ + ',' + i_64_ + ',' + bool + ',' + i_65_
							+ ',' + i_66_ + ')'));
		}
	}
}
