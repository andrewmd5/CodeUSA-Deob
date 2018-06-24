/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class305 {
	private byte[][][] aByteArrayArrayArray2540;
	static int[] anIntArray2541;
	int anInt2542;
	int anInt2543;
	boolean aBoolean2544;
	static float aFloat2545 = 0.0F;
	private Class153 aClass153_2546;
	int anInt2547;
	private byte[][][] aByteArrayArrayArray2548;
	int[][][] anIntArrayArrayArray2549;
	byte[][][] aByteArrayArrayArray2550;
	private int[] anIntArray2551;
	private Class32 aClass32_2552;
	private int[] anIntArray2553 = { 0, 0, 0, 256, 512, 512, 512, 256, 256,
			384, 128, 128, 256 };
	byte[][][] aByteArrayArrayArray2554;
	private byte[][][] aByteArrayArrayArray2555;
	private byte[][][] aByteArrayArrayArray2556;

	final void method3567(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_) {
		do {
			try {
				for (int i_5_ = i_3_; i_2_ + i_3_ > i_5_; i_5_++) {
					for (int i_6_ = i_1_; i_6_ < i_1_ + i; i_6_++) {
						if ((i_6_ ^ 0xffffffff) <= -1
								&& i_6_ < ((Class305) this).anInt2543
								&& (i_5_ ^ 0xffffffff) <= -1
								&& ((i_5_ ^ 0xffffffff) > (((Class305) this).anInt2542 ^ 0xffffffff)))
							((Class305) this).anIntArrayArrayArray2549[i_0_][i_6_][i_5_] = (i_0_ <= 0 ? 0
									: -960
											+ (((Class305) this).anIntArrayArrayArray2549[-1
													+ i_0_][i_6_][i_5_]));
					}
				}
				if ((i_1_ ^ 0xffffffff) < -1
						&& i_1_ < ((Class305) this).anInt2543) {
					for (int i_7_ = i_3_ - -1; (i_7_ ^ 0xffffffff) > (i_2_
							+ i_3_ ^ 0xffffffff); i_7_++) {
						if (i_7_ >= 0 && i_7_ < ((Class305) this).anInt2542)
							((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_][i_7_] = (((Class305) this).anIntArrayArrayArray2549[i_0_][-1
									+ i_1_][i_7_]);
					}
				}
				if ((i_3_ ^ 0xffffffff) < -1
						&& i_3_ < ((Class305) this).anInt2542) {
					for (int i_8_ = 1 + i_1_; (i_8_ ^ 0xffffffff) > (i_1_ - -i ^ 0xffffffff); i_8_++) {
						if (i_8_ >= 0 && i_8_ < ((Class305) this).anInt2543)
							((Class305) this).anIntArrayArrayArray2549[i_0_][i_8_][i_3_] = (((Class305) this).anIntArrayArrayArray2549[i_0_][i_8_][-1
									+ i_3_]);
					}
				}
				if (i_4_ < (i_1_ ^ 0xffffffff)
						|| (i_3_ ^ 0xffffffff) > -1
						|| ((((Class305) this).anInt2543 ^ 0xffffffff) >= (i_1_ ^ 0xffffffff))
						|| ((((Class305) this).anInt2542 ^ 0xffffffff) >= (i_3_ ^ 0xffffffff)))
					break;
				if ((i_0_ ^ 0xffffffff) == -1) {
					if ((i_1_ ^ 0xffffffff) >= -1
							|| ((((Class305) this).anIntArrayArrayArray2549[i_0_][-1
									+ i_1_][i_3_]) ^ 0xffffffff) == -1) {
						if (i_3_ > 0
								&& ((((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_][i_3_
										+ -1]) ^ 0xffffffff) != -1)
							((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_][i_3_] = (((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_][i_3_ - 1]);
						else if ((i_1_ ^ 0xffffffff) < -1
								&& (i_3_ ^ 0xffffffff) < -1
								&& ((((Class305) this).anIntArrayArrayArray2549[i_0_][-1
										+ i_1_][i_3_ + -1]) ^ 0xffffffff) != -1)
							((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_][i_3_] = (((Class305) this).anIntArrayArrayArray2549[i_0_][-1
									+ i_1_][i_3_ + -1]);
					} else
						((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_][i_3_] = (((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_
								+ -1][i_3_]);
				} else if ((i_1_ ^ 0xffffffff) >= -1
						|| ((((Class305) this).anIntArrayArrayArray2549[-1
								+ i_0_][i_1_ + -1][i_3_]) == (((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_ - 1][i_3_]))) {
					if ((i_3_ ^ 0xffffffff) < -1
							&& ((((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_][i_3_
									+ -1]) != (((Class305) this).anIntArrayArrayArray2549[i_0_ - 1][i_1_][-1
									+ i_3_])))
						((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_][i_3_] = (((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_][i_3_
								+ -1]);
					else {
						if (i_1_ > 0
								&& i_3_ > 0
								&& ((((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_
										+ -1][-1 + i_3_]) != (((Class305) this).anIntArrayArrayArray2549[-1
										+ i_0_][-1 + i_1_][i_3_ - 1])))
							((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_][i_3_] = (((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_
									+ -1][i_3_ + -1]);
						break;
					}
				} else
					((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_][i_3_] = (((Class305) this).anIntArrayArrayArray2549[i_0_][i_1_
							+ -1][i_3_]);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("sm.O(" + i
						+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_
						+ ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	final void method3568(s var_s, byte i, s var_s_9_, ha var_ha) {
		try {
			int[][] is = (new int[((Class305) this).anInt2543][((Class305) this).anInt2542]);
			if (Class138.anIntArray1083 == null
					|| (Class138.anIntArray1083.length != ((Class305) this).anInt2542)) {
				OutputStream_Sub2.anIntArray42 = new int[((Class305) this).anInt2542];
				Class138.anIntArray1083 = new int[((Class305) this).anInt2542];
				Class294.anIntArray2406 = new int[((Class305) this).anInt2542];
				Class145.anIntArray1175 = new int[((Class305) this).anInt2542];
				Class284_Sub1.anIntArray5178 = new int[((Class305) this).anInt2542];
			}
			for (int i_10_ = 0; ((Class305) this).anInt2547 > i_10_; i_10_++) {
				for (int i_11_ = 0; i_11_ < ((Class305) this).anInt2542; i_11_++) {
					Class138.anIntArray1083[i_11_] = 0;
					Class294.anIntArray2406[i_11_] = 0;
					Class145.anIntArray1175[i_11_] = 0;
					OutputStream_Sub2.anIntArray42[i_11_] = 0;
					Class284_Sub1.anIntArray5178[i_11_] = 0;
				}
				for (int i_12_ = -5; ((Class305) this).anInt2543 > i_12_; i_12_++) {
					for (int i_13_ = 0; ((Class305) this).anInt2542 > i_13_; i_13_++) {
						int i_14_ = i_12_ + 5;
						if ((((Class305) this).anInt2543 ^ 0xffffffff) < (i_14_ ^ 0xffffffff)) {
							int i_15_ = 0xff & (aByteArrayArrayArray2548[i_10_][i_14_][i_13_]);
							if ((i_15_ ^ 0xffffffff) < -1) {
								Class72 class72 = aClass153_2546.method2483(
										i_15_ - 1, 123);
								Class138.anIntArray1083[i_13_] += ((Class72) class72).anInt538;
								Class294.anIntArray2406[i_13_] += ((Class72) class72).anInt541;
								Class145.anIntArray1175[i_13_] += ((Class72) class72).anInt542;
								OutputStream_Sub2.anIntArray42[i_13_] += ((Class72) class72).anInt540;
								Class284_Sub1.anIntArray5178[i_13_]++;
							}
						}
						int i_16_ = i_12_ - 5;
						if (i_16_ >= 0) {
							int i_17_ = ((aByteArrayArrayArray2548[i_10_][i_16_][i_13_]) & 0xff);
							if (i_17_ > 0) {
								Class72 class72 = aClass153_2546.method2483(-1
										+ i_17_, 121);
								Class138.anIntArray1083[i_13_] -= ((Class72) class72).anInt538;
								Class294.anIntArray2406[i_13_] -= ((Class72) class72).anInt541;
								Class145.anIntArray1175[i_13_] -= ((Class72) class72).anInt542;
								OutputStream_Sub2.anIntArray42[i_13_] -= ((Class72) class72).anInt540;
								Class284_Sub1.anIntArray5178[i_13_]--;
							}
						}
					}
					if ((i_12_ ^ 0xffffffff) <= -1) {
						int i_18_ = 0;
						int i_19_ = 0;
						int i_20_ = 0;
						int i_21_ = 0;
						int i_22_ = 0;
						for (int i_23_ = -5; i_23_ < ((Class305) this).anInt2542; i_23_++) {
							int i_24_ = i_23_ + 5;
							if (i_24_ < ((Class305) this).anInt2542) {
								i_18_ += Class138.anIntArray1083[i_24_];
								i_21_ += OutputStream_Sub2.anIntArray42[i_24_];
								i_20_ += Class145.anIntArray1175[i_24_];
								i_22_ += Class284_Sub1.anIntArray5178[i_24_];
								i_19_ += Class294.anIntArray2406[i_24_];
							}
							int i_25_ = i_23_ + -5;
							if (i_25_ >= 0) {
								i_22_ -= Class284_Sub1.anIntArray5178[i_25_];
								i_19_ -= Class294.anIntArray2406[i_25_];
								i_18_ -= Class138.anIntArray1083[i_25_];
								i_21_ -= OutputStream_Sub2.anIntArray42[i_25_];
								i_20_ -= Class145.anIntArray1175[i_25_];
							}
							if ((i_23_ ^ 0xffffffff) <= -1 && i_21_ > 0
									&& (i_22_ ^ 0xffffffff) < -1)
								is[i_12_][i_23_] = Class79.method801(
										(byte) -11, i_19_ / i_22_, i_18_ * 256
												/ i_21_, i_20_ / i_22_);
						}
					}
				}
				if (Class319.aBoolean2707)
					method3578((i_10_ ^ 0xffffffff) != -1 ? null : var_s_9_,
							var_ha, Class78.aSArray594[i_10_], is,
							i_10_ != 0 ? null : var_s, -22657, i_10_);
				else
					method3576(var_ha, (i_10_ ^ 0xffffffff) != -1 ? null
							: var_s, is, (i_10_ ^ 0xffffffff) != -1 ? null
							: var_s_9_, Class78.aSArray594[i_10_], i_10_,
							(byte) 126);
				aByteArrayArrayArray2548[i_10_] = null;
				aByteArrayArrayArray2540[i_10_] = null;
				aByteArrayArrayArray2555[i_10_] = null;
				aByteArrayArrayArray2556[i_10_] = null;
			}
			if (!((Class305) this).aBoolean2544) {
				if ((Class61.anInt479 ^ 0xffffffff) != -1)
					Class364.method3935();
				if (AnimationDefinition.aBoolean830)
					AbstractModel.method2335();
			}
			for (int i_26_ = 0; ((Class305) this).anInt2547 > i_26_; i_26_++)
				Class78.aSArray594[i_26_].YA();
			int i_27_ = -70 / ((i - 9) / 56);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sm.L("
					+ (var_s != null ? "{...}" : "null") + ',' + i + ','
					+ (var_s_9_ != null ? "{...}" : "null") + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3569(int i, boolean bool, int i_28_, int i_29_, int i_30_) {
		try {
			if (bool == true) {
				for (int i_31_ = 0; i_31_ < ((Class305) this).anInt2547; i_31_++)
					method3567(i, i_31_, i_30_, i_29_, i_28_, -1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sm.N(" + i + ','
					+ bool + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ')'));
		}
	}

	private final void method3570(int i, int i_32_, ha var_ha, byte i_33_,
			byte[][] is, int i_34_, Class72 class72, int i_35_, int i_36_,
			boolean[] bools, byte[][] is_37_, byte[][] is_38_,
			Class199 class199, int i_39_) {
		do {
			try {
				int i_40_ = -70 / ((-13 - i_33_) / 63);
				boolean[] bools_41_ = (class199 != null
						&& ((Class199) class199).aBoolean1526 ? Class161.aBooleanArrayArray1260[i_36_]
						: Class98_Sub46_Sub12.aBooleanArrayArray6034[i_36_]);
				if ((i_35_ ^ 0xffffffff) < -1) {
					if ((i ^ 0xffffffff) < -1) {
						int i_42_ = is[i + -1][i_35_ + -1] & 0xff;
						if (i_42_ > 0) {
							Class199 class199_43_ = aClass32_2552.method317(4,
									-1 + i_42_);
							if (((Class199) class199_43_).anInt1537 != -1
									&& ((Class199) class199_43_).aBoolean1526) {
								byte i_44_ = is_37_[-1 + i][-1 + i_35_];
								int i_45_ = (4 - -(is_38_[-1 + i][-1 + i_35_] * 2) & 0x7);
								int i_46_ = Class98_Sub16.method1149(false,
										class199_43_, var_ha);
								if (Class310.aBooleanArrayArray2653[i_44_][i_45_]) {
									Class98_Sub10_Sub4.anIntArray5547[0] = ((Class199) class199_43_).anInt1537;
									Class277.anIntArray2049[0] = i_46_;
									Class135.anIntArray1056[0] = ((Class199) class199_43_).anInt1542;
									Class156_Sub1.anIntArray3279[0] = ((Class199) class199_43_).anInt1529;
									Class95.anIntArray800[0] = ((Class199) class199_43_).anInt1535;
									Class275.anIntArray2048[0] = 256;
								}
							}
						}
					}
					if (i < -1 + i_32_) {
						int i_47_ = is[i - -1][i_35_ + -1] & 0xff;
						if (i_47_ > 0) {
							Class199 class199_48_ = aClass32_2552.method317(4,
									i_47_ - 1);
							if ((((Class199) class199_48_).anInt1537 ^ 0xffffffff) != 0
									&& ((Class199) class199_48_).aBoolean1526) {
								byte i_49_ = is_37_[1 + i][i_35_ + -1];
								int i_50_ = 0x7 & 2 * is_38_[1 + i][i_35_ - 1] + 6;
								int i_51_ = Class98_Sub16.method1149(false,
										class199_48_, var_ha);
								if (Class310.aBooleanArrayArray2653[i_49_][i_50_]) {
									Class98_Sub10_Sub4.anIntArray5547[2] = ((Class199) class199_48_).anInt1537;
									Class277.anIntArray2049[2] = i_51_;
									Class135.anIntArray1056[2] = ((Class199) class199_48_).anInt1542;
									Class156_Sub1.anIntArray3279[2] = ((Class199) class199_48_).anInt1529;
									Class95.anIntArray800[2] = ((Class199) class199_48_).anInt1535;
									Class275.anIntArray2048[2] = 512;
								}
							}
						}
					}
				}
				if (-1 + i_39_ > i_35_) {
					if ((i ^ 0xffffffff) < -1) {
						int i_52_ = 0xff & is[i - 1][1 + i_35_];
						if ((i_52_ ^ 0xffffffff) < -1) {
							Class199 class199_53_ = aClass32_2552.method317(4,
									i_52_ + -1);
							if ((((Class199) class199_53_).anInt1537 ^ 0xffffffff) != 0
									&& ((Class199) class199_53_).aBoolean1526) {
								byte i_54_ = is_37_[i + -1][i_35_ + 1];
								int i_55_ = 2 * is_38_[-1 + i][1 + i_35_] + 2 & 0x7;
								int i_56_ = Class98_Sub16.method1149(false,
										class199_53_, var_ha);
								if (Class310.aBooleanArrayArray2653[i_54_][i_55_]) {
									Class98_Sub10_Sub4.anIntArray5547[6] = ((Class199) class199_53_).anInt1537;
									Class277.anIntArray2049[6] = i_56_;
									Class135.anIntArray1056[6] = ((Class199) class199_53_).anInt1542;
									Class156_Sub1.anIntArray3279[6] = ((Class199) class199_53_).anInt1529;
									Class95.anIntArray800[6] = ((Class199) class199_53_).anInt1535;
									Class275.anIntArray2048[6] = 64;
								}
							}
						}
					}
					if (i < -1 + i_32_) {
						int i_57_ = 0xff & is[1 + i][1 + i_35_];
						if (i_57_ > 0) {
							Class199 class199_58_ = aClass32_2552.method317(4,
									-1 + i_57_);
							if ((((Class199) class199_58_).anInt1537 ^ 0xffffffff) != 0
									&& ((Class199) class199_58_).aBoolean1526) {
								byte i_59_ = is_37_[1 + i][1 + i_35_];
								int i_60_ = (2 * is_38_[1 + i][i_35_ - -1]) & 0x7;// TODO
																					// --
								int i_61_ = Class98_Sub16.method1149(false,
										class199_58_, var_ha);
								if (Class310.aBooleanArrayArray2653[i_59_][i_60_]) {
									Class98_Sub10_Sub4.anIntArray5547[4] = ((Class199) class199_58_).anInt1537;
									Class277.anIntArray2049[4] = i_61_;
									Class135.anIntArray1056[4] = ((Class199) class199_58_).anInt1542;
									Class156_Sub1.anIntArray3279[4] = ((Class199) class199_58_).anInt1529;
									Class95.anIntArray800[4] = ((Class199) class199_58_).anInt1535;
									Class275.anIntArray2048[4] = 128;
								}
							}
						}
					}
				}
				if (i_35_ > 0) {
					int i_62_ = is[i][-1 + i_35_] & 0xff;
					if ((i_62_ ^ 0xffffffff) < -1) {
						Class199 class199_63_ = aClass32_2552.method317(4,
								i_62_ + -1);
						if (((Class199) class199_63_).anInt1537 != -1) {
							byte i_64_ = is_37_[i][i_35_ - 1];
							int i_65_ = is_38_[i][i_35_ - 1];
							if (!((Class199) class199_63_).aBoolean1526) {
								if (!bools_41_[i_34_ & 0x3])
									bools[0] = (Class98_Sub46_Sub12.aBooleanArrayArray6034[i_64_][Class202
											.method2702(2 + i_65_, 3)]);
							} else {
								int i_66_ = 2;
								int i_67_ = 2 * i_65_ + 4;
								int i_68_ = Class98_Sub16.method1149(false,
										class199_63_, var_ha);
								for (int i_69_ = 0; i_69_ < 3; i_69_++) {
									i_67_ &= 0x7;
									i_66_ = 0x7 & i_66_;
									if ((Class310.aBooleanArrayArray2653[i_64_][i_67_])
											&& ((Class95.anIntArray800[i_66_] ^ 0xffffffff) >= ((((Class199) class199_63_).anInt1535) ^ 0xffffffff))) {
										Class98_Sub10_Sub4.anIntArray5547[i_66_] = (((Class199) class199_63_).anInt1537);
										Class277.anIntArray2049[i_66_] = i_68_;
										Class135.anIntArray1056[i_66_] = (((Class199) class199_63_).anInt1542);
										Class156_Sub1.anIntArray3279[i_66_] = (((Class199) class199_63_).anInt1529);
										if (((Class199) class199_63_).anInt1535 != Class95.anIntArray800[i_66_])
											Class275.anIntArray2048[i_66_] = 32;
										else
											Class275.anIntArray2048[i_66_] = (Class41
													.method366(
															(Class275.anIntArray2048[i_66_]),
															32));
										Class95.anIntArray800[i_66_] = (((Class199) class199_63_).anInt1535);
									}
									i_67_++;
									i_66_--;
								}
								if (!bools_41_[0x3 & i_34_])
									bools[0] = (Class161.aBooleanArrayArray1260[i_64_][Class202
											.method2702(2 - -i_65_, 3)]);
							}
						}
					}
				}
				if ((-1 + i_39_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff)) {
					int i_70_ = is[i][1 + i_35_] & 0xff;
					if ((i_70_ ^ 0xffffffff) < -1) {
						Class199 class199_71_ = aClass32_2552.method317(4, -1
								+ i_70_);
						if (((Class199) class199_71_).anInt1537 != -1) {
							byte i_72_ = is_37_[i][i_35_ + 1];
							int i_73_ = is_38_[i][1 + i_35_];
							if (!((Class199) class199_71_).aBoolean1526) {
								if (!bools_41_[0x3 & i_34_ + 2])
									bools[2] = (Class98_Sub46_Sub12.aBooleanArrayArray6034[i_72_][Class202
											.method2702(3, --i_73_)]);
							} else {
								int i_74_ = 4;
								int i_75_ = i_73_ * 2 + 2;
								int i_76_ = Class98_Sub16.method1149(false,
										class199_71_, var_ha);
								for (int i_77_ = 0; (i_77_ ^ 0xffffffff) > -4; i_77_++) {
									i_75_ = 0x7 & i_75_;
									i_74_ &= 0x7;
									if ((Class310.aBooleanArrayArray2653[i_72_][i_75_])
											&& (((Class199) class199_71_).anInt1535 >= Class95.anIntArray800[i_74_])) {
										Class98_Sub10_Sub4.anIntArray5547[i_74_] = (((Class199) class199_71_).anInt1537);
										Class277.anIntArray2049[i_74_] = i_76_;
										Class135.anIntArray1056[i_74_] = (((Class199) class199_71_).anInt1542);
										Class156_Sub1.anIntArray3279[i_74_] = (((Class199) class199_71_).anInt1529);
										if (Class95.anIntArray800[i_74_] == (((Class199) class199_71_).anInt1535))
											Class275.anIntArray2048[i_74_] = (Class41
													.method366(
															(Class275.anIntArray2048[i_74_]),
															16));
										else
											Class275.anIntArray2048[i_74_] = 16;
										Class95.anIntArray800[i_74_] = (((Class199) class199_71_).anInt1535);
									}
									i_75_--;
									i_74_++;
								}
								if (!bools_41_[2 - -i_34_ & 0x3])
									bools[2] = (Class161.aBooleanArrayArray1260[i_72_][Class202
											.method2702(i_73_, 3)]);
							}
						}
					}
				}
				if (i > 0) {
					int i_78_ = is[i - 1][i_35_] & 0xff;
					if (i_78_ > 0) {
						Class199 class199_79_ = aClass32_2552.method317(4, -1
								+ i_78_);
						if (((Class199) class199_79_).anInt1537 != -1) {
							byte i_80_ = is_37_[-1 + i][i_35_];
							int i_81_ = is_38_[-1 + i][i_35_];
							if (((Class199) class199_79_).aBoolean1526) {
								int i_82_ = 6;
								int i_83_ = 2 * i_81_ + 4;
								int i_84_ = Class98_Sub16.method1149(false,
										class199_79_, var_ha);
								for (int i_85_ = 0; i_85_ < 3; i_85_++) {
									i_82_ = 0x7 & i_82_;
									i_83_ &= 0x7;
									if ((Class310.aBooleanArrayArray2653[i_80_][i_83_])
											&& (((Class199) class199_79_).anInt1535 >= Class95.anIntArray800[i_82_])) {
										Class98_Sub10_Sub4.anIntArray5547[i_82_] = (((Class199) class199_79_).anInt1537);
										Class277.anIntArray2049[i_82_] = i_84_;
										Class135.anIntArray1056[i_82_] = (((Class199) class199_79_).anInt1542);
										Class156_Sub1.anIntArray3279[i_82_] = (((Class199) class199_79_).anInt1529);
										if (((Class199) class199_79_).anInt1535 != Class95.anIntArray800[i_82_])
											Class275.anIntArray2048[i_82_] = 8;
										else
											Class275.anIntArray2048[i_82_] = (Class41
													.method366(
															(Class275.anIntArray2048[i_82_]),
															8));
										Class95.anIntArray800[i_82_] = (((Class199) class199_79_).anInt1535);
									}
									i_83_--;
									i_82_++;
								}
								if (!bools_41_[0x3 & 3 - -i_34_])
									bools[3] = (Class161.aBooleanArrayArray1260[i_80_][Class202
											.method2702(3, i_81_ + 1)]);
							} else if (!bools_41_[i_34_ + 3 & 0x3])
								bools[3] = (Class98_Sub46_Sub12.aBooleanArrayArray6034[i_80_][Class202
										.method2702(1 + i_81_, 3)]);
						}
					}
				}
				if (-1 + i_32_ > i) {
					int i_86_ = 0xff & is[1 + i][i_35_];
					if ((i_86_ ^ 0xffffffff) < -1) {
						Class199 class199_87_ = aClass32_2552.method317(4,
								i_86_ + -1);
						if ((((Class199) class199_87_).anInt1537 ^ 0xffffffff) != 0) {
							byte i_88_ = is_37_[i - -1][i_35_];
							int i_89_ = is_38_[1 + i][i_35_];
							if (!((Class199) class199_87_).aBoolean1526) {
								if (!bools_41_[1 + i_34_ & 0x3])
									bools[1] = (Class98_Sub46_Sub12.aBooleanArrayArray6034[i_88_][Class202
											.method2702(3, i_89_ + 3)]);
							} else {
								int i_90_ = 4;
								int i_91_ = 2 * i_89_ + 6;
								int i_92_ = Class98_Sub16.method1149(false,
										class199_87_, var_ha);
								for (int i_93_ = 0; (i_93_ ^ 0xffffffff) > -4; i_93_++) {
									i_90_ = 0x7 & i_90_;
									i_91_ &= 0x7;
									if ((Class310.aBooleanArrayArray2653[i_88_][i_91_])
											&& (((((Class199) class199_87_).anInt1535) ^ 0xffffffff) <= (Class95.anIntArray800[i_90_] ^ 0xffffffff))) {
										Class98_Sub10_Sub4.anIntArray5547[i_90_] = (((Class199) class199_87_).anInt1537);
										Class277.anIntArray2049[i_90_] = i_92_;
										Class135.anIntArray1056[i_90_] = (((Class199) class199_87_).anInt1542);
										Class156_Sub1.anIntArray3279[i_90_] = (((Class199) class199_87_).anInt1529);
										if (((Class199) class199_87_).anInt1535 != Class95.anIntArray800[i_90_])
											Class275.anIntArray2048[i_90_] = 4;
										else
											Class275.anIntArray2048[i_90_] = (Class41
													.method366(
															(Class275.anIntArray2048[i_90_]),
															4));
										Class95.anIntArray800[i_90_] = (((Class199) class199_87_).anInt1535);
									}
									i_91_++;
									i_90_--;
								}
								if (!bools_41_[0x3 & 1 - -i_34_])
									bools[1] = (Class161.aBooleanArrayArray1260[i_88_][Class202
											.method2702(i_89_ + 3, 3)]);
							}
						}
					}
				}
				if (class199 == null)
					break;
				int i_94_ = Class98_Sub16.method1149(false, class199, var_ha);
				if (!((Class199) class199).aBoolean1526)
					break;
				for (int i_95_ = 0; i_95_ < 8; i_95_++) {
					int i_96_ = -(i_34_ * 2) + i_95_ & 0x7;
					if (Class310.aBooleanArrayArray2653[i_36_][i_95_]
							&& (Class95.anIntArray800[i_96_] <= ((Class199) class199).anInt1535)) {
						Class98_Sub10_Sub4.anIntArray5547[i_96_] = ((Class199) class199).anInt1537;
						Class277.anIntArray2049[i_96_] = i_94_;
						Class135.anIntArray1056[i_96_] = ((Class199) class199).anInt1542;
						Class156_Sub1.anIntArray3279[i_96_] = ((Class199) class199).anInt1529;
						if (((Class199) class199).anInt1535 != Class95.anIntArray800[i_96_])
							Class275.anIntArray2048[i_96_] = 2;
						else
							Class275.anIntArray2048[i_96_] = Class41.method366(
									(Class275.anIntArray2048[i_96_]), 2);
						Class95.anIntArray800[i_96_] = ((Class199) class199).anInt1535;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("sm.D(" + i + ',' + i_32_ + ','
								+ (var_ha != null ? "{...}" : "null") + ','
								+ i_33_ + ',' + (is != null ? "{...}" : "null")
								+ ',' + i_34_ + ','
								+ (class72 != null ? "{...}" : "null") + ','
								+ i_35_ + ',' + i_36_ + ','
								+ (bools != null ? "{...}" : "null") + ','
								+ (is_37_ != null ? "{...}" : "null") + ','
								+ (is_38_ != null ? "{...}" : "null") + ','
								+ (class199 != null ? "{...}" : "null") + ','
								+ i_39_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method3571(int i) {
		try {
			if (Class76_Sub11.anApplet3799 != null) {
				try {
					String string = Class76_Sub11.anApplet3799
							.getParameter("cookiehost");
					int i_97_ = (int) (Class343.method3819(-47) / 86400000L) - 11745;
					String string_98_ = ("usrdob=" + i_97_
							+ "; version=1; path=/; domain=" + string);
					Class203.method2706(Class76_Sub11.anApplet3799,
							("document.cookie=\"" + string_98_ + "\""), 9202);
				} catch (Throwable throwable) {
					/* empty */
				}
				int i_99_ = -96 / ((52 - i) / 62);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sm.E(" + i + ')');
		}
	}

	static final void method3572(int i, Class246_Sub2 class246_sub2) {
		do {
			try {
				((Class246_Sub2) class246_sub2).aClass246_Sub3_Sub4_Sub2_5076 = null;
				if (Class98_Sub50.anInt4294 >= i)
					break;
				Class138.aClass218_1084.method2808(true, class246_sub2);
				Class98_Sub50.anInt4294++;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27
						.printError(runtimeexception,
								("sm.B("
										+ i
										+ ','
										+ (class246_sub2 != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method3573(byte i) {
		do {
			try {
				anIntArray2541 = null;
				if (i == -20)
					break;
				aFloat2545 = -0.16454314F;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "sm.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method3574(byte i, int i_100_, int i_101_, int i_102_,
			ByteBuffer class98_sub22, int i_103_, Class243[] class243s) {
		try {
			if (!((Class305) this).aBoolean2544) {
				for (int i_104_ = 0; (i_104_ ^ 0xffffffff) > -5; i_104_++) {
					Class243 class243 = class243s[i_104_];
					for (int i_105_ = 0; (i_105_ ^ 0xffffffff) > -65; i_105_++) {
						for (int i_106_ = 0; (i_106_ ^ 0xffffffff) > -65; i_106_++) {
							int i_107_ = i_105_ + i_103_;
							int i_108_ = i_100_ + i_106_;
							if (i_107_ >= 0
									&& i_107_ < ((Class305) this).anInt2543
									&& i_108_ >= 0
									&& i_108_ < ((Class305) this).anInt2542)
								class243.method2944(i_108_, 101, i_107_);
						}
					}
				}
			}
			int i_109_ = i_103_ + i_102_;
			int i_110_ = i_101_ + i_100_;
			for (int i_111_ = 0; i_111_ < ((Class305) this).anInt2547; i_111_++) {
				for (int i_112_ = 0; i_112_ < 64; i_112_++) {
					for (int i_113_ = 0; i_113_ < 64; i_113_++)
						method3581(i_100_ + i_113_, false, 0, i_112_ + i_109_,
								i_110_ + i_113_, i_103_ + i_112_, (byte) -111,
								0, 0, i_111_, class98_sub22);
				}
			}
			int i_114_ = 111 % ((i - 67) / 48);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sm.H(" + i + ','
					+ i_100_ + ',' + i_101_ + ',' + i_102_ + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ',' + i_103_
					+ ',' + (class243s != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3575(int i, int i_115_, ByteBuffer class98_sub22,
			int i_116_, int i_117_, int i_118_, int i_119_, int i_120_,
			Class243[] class243s, int i_121_) {
		try {
			int i_122_ = (0x7 & i_120_) * 8;
			int i_123_ = (0x7 & i) * 8;
			if (!((Class305) this).aBoolean2544) {
				Class243 class243 = class243s[i_121_];
				for (int i_124_ = 0; i_124_ < 8; i_124_++) {
					for (int i_125_ = 0; (i_125_ ^ 0xffffffff) > -9; i_125_++) {
						int i_126_ = (i_118_ + Class107.method1720(
								0x7 & i_124_, i_119_, i_125_ & 0x7, i_116_));
						int i_127_ = (Class250.method3166(0x7 & i_124_,
								0x7 & i_125_, i_116_, (byte) 64) + i_115_);
						if ((i_126_ ^ 0xffffffff) < -1
								&& i_126_ < -1 + ((Class305) this).anInt2543
								&& (i_127_ ^ 0xffffffff) < -1
								&& i_127_ < -1 + ((Class305) this).anInt2542)
							class243.method2944(i_127_, i_119_ ^ 0x31, i_126_);
					}
				}
			}
			int i_128_ = (~0x7 & i_120_) << 633216931;
			int i_129_ = (~0x7 & i) << 924843875;
			int i_130_ = 0;
			int i_131_ = 0;
			if ((i_116_ ^ 0xffffffff) != -2) {
				if (i_116_ != 2) {
					if ((i_116_ ^ 0xffffffff) == -4)
						i_130_ = 1;
				} else {
					i_131_ = 1;
					i_130_ = 1;
				}
			} else
				i_131_ = 1;
			for (int i_132_ = i_119_; ((((Class305) this).anInt2547 ^ 0xffffffff) < (i_132_ ^ 0xffffffff)); i_132_++) {
				for (int i_133_ = 0; (i_133_ ^ 0xffffffff) > -65; i_133_++) {
					for (int i_134_ = 0; i_134_ < 64; i_134_++) {
						if ((i_132_ ^ 0xffffffff) == (i_117_ ^ 0xffffffff)
								&& (i_122_ ^ 0xffffffff) >= (i_133_ ^ 0xffffffff)
								&& i_133_ <= 8 + i_122_ && i_134_ >= i_123_
								&& i_134_ <= i_123_ - -8) {
							int i_135_;
							int i_136_;
							if (8 + i_122_ == i_133_ || i_123_ + 8 == i_134_) {
								if ((i_116_ ^ 0xffffffff) == -1) {
									i_136_ = -i_123_ + (i_134_ + i_115_);
									i_135_ = -i_122_ - (-i_133_ - i_118_);
								} else if (i_116_ == 1) {
									i_136_ = -i_133_ + i_122_ + i_115_ + 8;
									i_135_ = i_118_ - -i_134_ + -i_123_;
								} else if (i_116_ != 2) {
									i_135_ = i_118_ + (8 + -i_134_ - -i_123_);
									i_136_ = i_115_ + i_133_ - i_122_;
								} else {
									i_136_ = -i_134_ + i_123_ + (i_115_ + 8);
									i_135_ = -i_133_ + (i_122_ + (i_118_ - -8));
								}
								method3581(i_136_, true, 0, i_133_ + i_128_,
										i_134_ + i_129_, i_135_, (byte) -111,
										0, 0, i_121_, class98_sub22);
							} else {
								i_135_ = Class107.method1720(0x7 & i_133_, 0,
										i_134_ & 0x7, i_116_) + i_118_;
								i_136_ = (i_115_ + Class250.method3166(
										i_133_ & 0x7, i_134_ & 0x7, i_116_,
										(byte) -125));
								method3581(i_136_, false, i_116_, i_133_
										+ i_128_, i_134_ + i_129_, i_135_,
										(byte) -111, i_131_, i_130_, i_121_,
										class98_sub22);
							}
							if ((i_133_ ^ 0xffffffff) == -64 || i_134_ == 63) {
								int i_137_ = 1;
								if (i_133_ == 63
										&& (i_134_ ^ 0xffffffff) == -64)
									i_137_ = 3;
								for (int i_138_ = 0; ((i_137_ ^ 0xffffffff) < (i_138_ ^ 0xffffffff)); i_138_++) {
									int i_139_ = i_133_;
									int i_140_ = i_134_;
									if (i_138_ == 0) {
										i_139_ = i_133_ != 63 ? i_133_ : 64;
										i_140_ = i_134_ != 63 ? i_134_ : 64;
									} else if ((i_138_ ^ 0xffffffff) == -2)
										i_139_ = 64;
									else if (i_138_ == 2)
										i_140_ = 64;
									int i_141_;
									int i_142_;
									if ((i_116_ ^ 0xffffffff) == -1) {
										i_141_ = -i_122_ + (i_139_ + i_118_);
										i_142_ = -i_123_ + (i_140_ + i_115_);
									} else if (i_116_ == 1) {
										i_141_ = -i_123_ - (-i_140_ - i_118_);
										i_142_ = i_122_ - i_139_
												+ (i_115_ - -8);
									} else if ((i_116_ ^ 0xffffffff) != -3) {
										i_142_ = i_115_ - i_122_ - -i_139_;
										i_141_ = i_118_ - (-8 + -i_123_)
												- i_140_;
									} else {
										i_141_ = -i_139_
												+ (i_122_ + 8 + i_118_);
										i_142_ = 8 + i_115_
												+ (-i_140_ - -i_123_);
									}
									if (i_141_ >= 0
											&& ((i_141_ ^ 0xffffffff) > (((Class305) this).anInt2543 ^ 0xffffffff))
											&& (i_142_ ^ 0xffffffff) <= -1
											&& (i_142_ < ((Class305) this).anInt2542))
										((Class305) this).anIntArrayArrayArray2549[i_121_][i_141_][i_142_] = (((Class305) this).anIntArrayArrayArray2549[i_121_][i_135_
												- -i_130_][i_131_ + i_136_]);
								}
							}
						} else
							method3581(-1, false, 0, 0, 0, -1, (byte) -111, 0,
									0, 0, class98_sub22);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("sm.A(" + i + ',' + i_115_ + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i_116_ + ',' + i_117_ + ',' + i_118_ + ','
							+ i_119_ + ',' + i_120_ + ','
							+ (class243s != null ? "{...}" : "null") + ','
							+ i_121_ + ')'));
		}
	}

	private final void method3576(ha var_ha, s var_s, int[][] is, s var_s_143_,
			s var_s_144_, int i, byte i_145_) {
		try {
			if (i_145_ > 118) {
				for (int i_146_ = 0; ((i_146_ ^ 0xffffffff) > (((Class305) this).anInt2543 ^ 0xffffffff)); i_146_++) {
					for (int i_147_ = 0; i_147_ < ((Class305) this).anInt2542; i_147_++) {
						if (Class113.anInt950 == -1
								|| Class294.method3477(i_147_, i, i_146_,
										Class113.anInt950, -86)) {
							byte i_148_ = aByteArrayArrayArray2555[i][i_146_][i_147_];
							byte i_149_ = aByteArrayArrayArray2556[i][i_146_][i_147_];
							int i_150_ = (aByteArrayArrayArray2540[i][i_146_][i_147_] & 0xff);
							int i_151_ = 0xff & (aByteArrayArrayArray2548[i][i_146_][i_147_]);
							Class199 class199 = ((i_150_ ^ 0xffffffff) == -1 ? null
									: aClass32_2552.method317(4, i_150_ - 1));
							if (i_148_ == 0 && class199 == null)
								i_148_ = (byte) 12;
							Class72 class72 = (i_151_ == 0 ? null
									: aClass153_2546.method2483(i_151_ + -1,
											125));
							Class199 class199_152_ = class199;
							if (class199 != null
									&& (((Class199) class199).anInt1537 ^ 0xffffffff) == 0
									&& ((Class199) class199).anInt1540 == -1) {
								class199_152_ = class199;
								class199 = null;
							}
							if (class199 != null || class72 != null) {
								int i_153_ = (Class98_Sub31_Sub4.anIntArray5861[i_148_]);
								int i_154_ = (Class98_Sub46_Sub20_Sub2.anIntArray6318[i_148_]);
								int i_155_ = ((class72 == null ? 0 : i_153_) + (class199 == null ? 0
										: i_154_));
								int i_156_ = 0;
								int i_157_ = 0;
								int i_158_ = (class199 != null ? ((Class199) class199).anInt1542
										: -1);
								int i_159_ = (class72 == null ? -1
										: ((Class72) class72).anInt537);
								int[] is_160_ = new int[i_155_];
								int[] is_161_ = new int[i_155_];
								int[] is_162_ = new int[i_155_];
								int[] is_163_ = new int[i_155_];
								int[] is_164_ = new int[i_155_];
								int[] is_165_ = new int[i_155_];
								int[] is_166_ = ((class199 == null || (((Class199) class199).anInt1540 ^ 0xffffffff) == 0) ? null
										: new int[i_155_]);
								if (class199 != null) {
									for (int i_167_ = 0; ((i_154_ ^ 0xffffffff) < (i_167_ ^ 0xffffffff)); i_167_++) {
										is_160_[i_156_] = (Class64_Sub28.anIntArrayArray3718[i_148_][i_157_]);
										is_161_[i_156_] = (Class98_Sub45.anIntArrayArray4258[i_148_][i_157_]);
										is_162_[i_156_] = (Class93_Sub1.anIntArrayArray5487[i_148_][i_157_]);
										is_164_[i_156_] = i_158_;
										is_165_[i_156_] = ((Class199) class199).anInt1529;
										is_163_[i_156_] = ((Class199) class199).anInt1537;
										if (is_166_ != null)
											is_166_[i_156_] = (((Class199) class199).anInt1540);
										i_156_++;
										i_157_++;
									}
									if (!((Class305) this).aBoolean2544
											&& i == 0)
										Class286.method3382(
												i_146_,
												i_147_,
												((Class199) class199).anInt1532,
												(((Class199) class199).anInt1530 * 8),
												((Class199) class199).anInt1534);
								} else
									i_157_ += i_154_;
								if (class72 != null) {
									for (int i_168_ = 0; ((i_168_ ^ 0xffffffff) > (i_153_ ^ 0xffffffff)); i_168_++) {
										is_160_[i_156_] = (Class64_Sub28.anIntArrayArray3718[i_148_][i_157_]);
										is_161_[i_156_] = (Class98_Sub45.anIntArrayArray4258[i_148_][i_157_]);
										is_162_[i_156_] = (Class93_Sub1.anIntArrayArray5487[i_148_][i_157_]);
										is_164_[i_156_] = i_159_;
										is_165_[i_156_] = ((Class72) class72).anInt536;
										is_163_[i_156_] = is[i_146_][i_147_];
										if (is_166_ != null)
											is_166_[i_156_] = is_163_[i_156_];
										i_157_++;
										i_156_++;
									}
								}
								int i_169_ = anIntArray2551.length;
								int[] is_170_ = new int[i_169_];
								int[] is_171_ = new int[i_169_];
								int[] is_172_ = var_s != null ? new int[i_169_]
										: null;
								int[] is_173_ = (var_s == null
										&& var_s_143_ == null ? null
										: new int[i_169_]);
								for (int i_174_ = 0; ((i_174_ ^ 0xffffffff) > (i_169_ ^ 0xffffffff)); i_174_++) {
									int i_175_ = anIntArray2551[i_174_];
									int i_176_ = anIntArray2553[i_174_];
									if ((i_149_ ^ 0xffffffff) != -1) {
										if (i_149_ != 1) {
											if ((i_149_ ^ 0xffffffff) == -3) {
												is_170_[i_174_] = -i_175_ + 512;
												is_171_[i_174_] = 512 - i_176_;
											} else if ((i_149_ ^ 0xffffffff) == -4) {
												int i_177_ = i_175_;
												is_170_[i_174_] = 512 - i_176_;
												is_171_[i_174_] = i_177_;
											}
										} else {
											is_170_[i_174_] = i_176_;
											int i_178_ = i_175_;
											is_171_[i_174_] = 512 + -i_178_;
										}
									} else {
										is_170_[i_174_] = i_175_;
										is_171_[i_174_] = i_176_;
									}
									if (is_172_ != null
											&& (Class310.aBooleanArrayArray2653[i_148_][i_174_])) {
										int i_179_ = ((i_146_ << -1908633335) - -is_170_[i_174_]);
										int i_180_ = ((i_147_ << -463239607) + is_171_[i_174_]);
										is_172_[i_174_] = (var_s.method3417(
												i_179_, i_180_, true) + -var_s_144_
												.method3417(i_179_, i_180_,
														true));
									}
									if (is_173_ != null) {
										if (var_s != null
												&& !(Class310.aBooleanArrayArray2653[i_148_][i_174_])) {
											int i_181_ = ((i_146_ << -540220791) - -is_170_[i_174_]);
											int i_182_ = ((i_147_ << 2038312265) + is_171_[i_174_]);
											is_173_[i_174_] = ((var_s_144_
													.method3417(i_181_, i_182_,
															true)) + -var_s
													.method3417(i_181_, i_182_,
															true));
										} else if (var_s_143_ != null
												&& !(Class278_Sub1.aBooleanArrayArray5171[i_148_][i_174_])) {
											int i_183_ = (is_170_[i_174_] + (i_146_ << 1895621833));
											int i_184_ = ((i_147_ << -678943447) + is_171_[i_174_]);
											is_173_[i_174_] = ((var_s_143_
													.method3417(i_183_, i_184_,
															true)) + -(var_s_144_
													.method3417(i_183_, i_184_,
															true)));
										}
									}
								}
								int i_185_ = var_s_144_.method3420(i_147_,
										-12639, i_146_);
								int i_186_ = var_s_144_.method3420(i_147_,
										-12639, i_146_ + 1);
								int i_187_ = var_s_144_.method3420(i_147_ + 1,
										-12639, i_146_ + 1);
								int i_188_ = var_s_144_.method3420(i_147_ - -1,
										-12639, i_146_);
								boolean bool = Class1.method162(i_147_,
										(byte) -115, i_146_);
								if (bool && i > 1 || !bool
										&& (i ^ 0xffffffff) < -1) {
									boolean bool_189_ = true;
									if (class72 != null
											&& !((Class72) class72).aBoolean543)
										bool_189_ = false;
									else if ((i_151_ ^ 0xffffffff) == -1
											&& (i_148_ ^ 0xffffffff) != -1)
										bool_189_ = false;
									else if (i_150_ > 0
											&& class199_152_ != null
											&& !(((Class199) class199_152_).aBoolean1527))
										bool_189_ = false;
									if (bool_189_
											&& i_185_ == i_186_
											&& i_187_ == i_185_
											&& ((i_188_ ^ 0xffffffff) == (i_185_ ^ 0xffffffff)))
										((Class305) this).aByteArrayArrayArray2550[i][i_146_][i_147_] = (byte) (Class41
												.method366(
														(((Class305) this).aByteArrayArrayArray2550[i][i_146_][i_147_]),
														4));
								}
								int i_190_ = 0;
								int i_191_ = 0;
								int i_192_ = 0;
								if (((Class305) this).aBoolean2544) {
									i_190_ = Appearance
											.method3636(i_146_, i_147_);
									i_191_ = IOException_Sub1.method127(i_146_,
											i_147_);
									i_192_ = Class98_Sub46_Sub20.method1639(
											i_146_, i_147_);
								}
								var_s_144_.method3424(i_146_, i_147_, is_170_,
										is_172_, is_171_, is_173_, is_160_,
										is_161_, is_162_, is_163_, is_166_,
										is_164_, is_165_, i_190_, i_191_,
										i_192_, false);
								Class224_Sub2_Sub1
										.method2839(i, i_146_, i_147_);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sm.F("
					+ (var_ha != null ? "{...}" : "null") + ','
					+ (var_s != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ','
					+ (var_s_143_ != null ? "{...}" : "null") + ','
					+ (var_s_144_ != null ? "{...}" : "null") + ',' + i + ','
					+ i_145_ + ')'));
		}
	}

	final void method3577(int i, int i_193_, int[][] is) {
		try {
			int[][] is_194_ = ((Class305) this).anIntArrayArrayArray2549[i];
			int i_195_ = 17 % ((-11 - i_193_) / 36);
			for (int i_196_ = 0; i_196_ < ((Class305) this).anInt2543 + 1; i_196_++) {
				for (int i_197_ = 0; 1 + ((Class305) this).anInt2542 > i_197_; i_197_++)
					is_194_[i_196_][i_197_] += is[i_196_][i_197_];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sm.J(" + i + ','
					+ i_193_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method3578(s var_s, ha var_ha, s var_s_198_, int[][] is,
			s var_s_199_, int i, int i_200_) {
		do {
			try {
				byte[][] is_201_ = aByteArrayArrayArray2555[i_200_];
				byte[][] is_202_ = aByteArrayArrayArray2556[i_200_];
				byte[][] is_203_ = aByteArrayArrayArray2548[i_200_];
				byte[][] is_204_ = aByteArrayArrayArray2540[i_200_];
				for (int i_205_ = 0; i_205_ < ((Class305) this).anInt2543; i_205_++) {
					int i_206_ = (i_205_ >= ((Class305) this).anInt2543 - 1 ? i_205_
							: 1 + i_205_);
					for (int i_207_ = 0; i_207_ < ((Class305) this).anInt2542; i_207_++) {
						int i_208_ = (-1 + ((Class305) this).anInt2542 <= i_207_ ? i_207_
								: i_207_ - -1);
						if ((Class113.anInt950 ^ 0xffffffff) == 0
								|| Class294.method3477(i_207_, i_200_, i_205_,
										Class113.anInt950, 65)) {
							boolean bool = false;
							boolean bool_209_ = false;
							boolean[] bools = new boolean[4];
							byte i_210_ = is_201_[i_205_][i_207_];
							int i_211_ = is_202_[i_205_][i_207_];
							int i_212_ = 0xff & is_204_[i_205_][i_207_];
							int i_213_ = 0xff & is_203_[i_205_][i_207_];
							int i_214_ = 0xff & is_203_[i_205_][i_208_];
							int i_215_ = 0xff & is_203_[i_206_][i_208_];
							int i_216_ = 0xff & is_203_[i_206_][i_207_];
							if (i_212_ != 0 || i_213_ != 0) {
								Class199 class199 = ((i_212_ ^ 0xffffffff) == -1 ? null
										: aClass32_2552.method317(i ^ ~0x5884,
												-1 + i_212_));
								if (i_210_ == 0 && class199 == null)
									i_210_ = (byte) 12;
								Class72 class72 = (i_213_ == 0 ? null
										: aClass153_2546.method2483(
												-1 + i_213_, 120));
								Class199 class199_217_ = class199;
								if (class199 != null) {
									if ((((Class199) class199).anInt1537 ^ 0xffffffff) != 0
											|| (((Class199) class199).anInt1540 ^ 0xffffffff) != 0) {
										if (class72 != null && i_210_ != 0)
											bool_209_ = (((Class199) class199).aBoolean1526);
									} else {
										class199_217_ = class199;
										class199 = null;
									}
								}
								if (((i_210_ ^ 0xffffffff) == -1 || i_210_ == 12)
										&& (i_205_ ^ 0xffffffff) < -1
										&& (i_207_ ^ 0xffffffff) < -1
										&& (((Class305) this).anInt2543 ^ 0xffffffff) < (i_205_ ^ 0xffffffff)
										&& ((Class305) this).anInt2542 > i_207_) {
									int i_218_ = 0;
									int i_219_ = 0;
									int i_220_ = 0;
									int i_221_ = 0;
									i_220_ = i_220_
											+ (((is_203_[i_206_][i_208_] ^ 0xffffffff) != (i_213_ ^ 0xffffffff)) ? -1
													: 1);
									i_218_ = i_218_
											+ ((((is_203_[i_205_ + -1][-1
													+ i_207_]) ^ 0xffffffff) != (i_213_ ^ 0xffffffff)) ? -1
													: 1);
									i_219_ = i_219_
											+ ((is_203_[i_206_][-1 + i_207_]) != i_213_ ? -1
													: 1);
									i_221_ = (i_221_ + (((is_203_[i_205_ + -1][i_208_] ^ 0xffffffff) == (i_213_ ^ 0xffffffff)) ? 1
											: -1));
									if ((i_213_ ^ 0xffffffff) != (is_203_[i_205_][-1
											+ i_207_] ^ 0xffffffff)) {
										i_218_--;
										i_219_--;
									} else {
										i_219_++;
										i_218_++;
									}
									if (is_203_[i_206_][i_207_] != i_213_) {
										i_219_--;
										i_220_--;
									} else {
										i_220_++;
										i_219_++;
									}
									if (i_213_ != is_203_[i_205_][i_208_]) {
										i_221_--;
										i_220_--;
									} else {
										i_221_++;
										i_220_++;
									}
									if (is_203_[-1 + i_205_][i_207_] == i_213_) {
										i_218_++;
										i_221_++;
									} else {
										i_218_--;
										i_221_--;
									}
									int i_222_ = i_218_ - i_220_;
									if (i_222_ < 0)
										i_222_ = -i_222_;
									int i_223_ = i_219_ + -i_221_;
									if ((i_223_ ^ 0xffffffff) > -1)
										i_223_ = -i_223_;
									if (i_223_ == i_222_) {
										i_222_ = (var_s_198_.method3420(i_207_,
												-12639, i_205_) - (var_s_198_
												.method3420(i_208_, i + 10018,
														i_206_)));
										i_223_ = ((var_s_198_.method3420(
												i_207_, i ^ 0x69de, i_206_)) + -(var_s_198_
												.method3420(i_208_, i + 10018,
														i_205_)));
										if (i_222_ < 0)
											i_222_ = -i_222_;
										if ((i_223_ ^ 0xffffffff) > -1)
											i_223_ = -i_223_;
									}
									i_211_ = i_222_ < i_223_ ? 1 : 0;
								}
								for (int i_224_ = 0; (i_224_ ^ 0xffffffff) > -14; i_224_++) {
									Class95.anIntArray800[i_224_] = -1;
									Class275.anIntArray2048[i_224_] = 1;
								}
								boolean[] bools_225_ = ((class199 == null || !((Class199) class199).aBoolean1526) ? (Class98_Sub46_Sub12.aBooleanArrayArray6034[i_210_])
										: (Class161.aBooleanArrayArray1260[i_210_]));
								method3570(i_205_, ((Class305) this).anInt2543,
										var_ha, (byte) 53, is_204_, i_211_,
										class72, i_207_, i_210_, bools,
										is_201_, is_202_, class199,
										((Class305) this).anInt2542);
								boolean bool_226_ = (class199 != null && ((((Class199) class199).anInt1537 ^ 0xffffffff) != (((Class199) class199).anInt1540 ^ 0xffffffff)));
								if (!bool_226_) {
									for (int i_227_ = 0; (i_227_ ^ 0xffffffff) > -9; i_227_++) {
										if (Class95.anIntArray800[i_227_] >= 0
												&& (((Class277.anIntArray2049[i_227_]) ^ 0xffffffff) != ((Class98_Sub10_Sub4.anIntArray5547[i_227_]) ^ 0xffffffff))) {
											bool_226_ = true;
											break;
										}
									}
								}
								if (!bools_225_[1 - -i_211_ & 0x3])
									bools[1] = (Class98_Sub18
											.method1163(
													bools[1],
													((Class202
															.method2702(
																	Class275.anIntArray2048[4],
																	Class275.anIntArray2048[2])) ^ 0xffffffff) == -1));
								if (!bools_225_[0x3 & i_211_ + 3])
									bools[3] = (Class98_Sub18
											.method1163(
													bools[3],
													((Class202
															.method2702(
																	Class275.anIntArray2048[0],
																	Class275.anIntArray2048[6])) ^ 0xffffffff) == -1));
								if (!bools_225_[i_211_ & 0x3])
									bools[0] = (Class98_Sub18
											.method1163(
													bools[0],
													((Class202
															.method2702(
																	Class275.anIntArray2048[2],
																	Class275.anIntArray2048[0])) == 0)));
								if (!bools_225_[i_211_ + 2 & 0x3])
									bools[2] = (Class98_Sub18
											.method1163(
													bools[2],
													((Class202
															.method2702(
																	Class275.anIntArray2048[6],
																	Class275.anIntArray2048[4])) == 0)));
								if (!bool_209_
										&& ((i_210_ ^ 0xffffffff) == -1 || (i_210_ ^ 0xffffffff) == -13)) {
									if (!bools[0] || bools[1] || bools[2]
											|| !bools[3]) {
										if (!bools[0] || !bools[1] || bools[2]
												|| bools[3]) {
											if (!bools[0] && bools[1]
													&& bools[2] && !bools[3]) {
												bools[1] = bools[2] = false;
												i_210_ = ((i_210_ ^ 0xffffffff) == -1 ? (byte) 13
														: (byte) 14);
												i_211_ = 2;
											} else if (!bools[0] && !bools[1]
													&& bools[2] && bools[3]) {
												bools[2] = bools[3] = false;
												i_210_ = ((i_210_ ^ 0xffffffff) == -1 ? (byte) 13
														: (byte) 14);
												i_211_ = 1;
											}
										} else {
											i_210_ = ((i_210_ ^ 0xffffffff) != -1 ? (byte) 14
													: (byte) 13);
											bools[0] = bools[1] = false;
											i_211_ = 3;
										}
									} else {
										i_211_ = 0;
										i_210_ = (i_210_ == 0 ? (byte) 13
												: (byte) 14);
										bools[0] = bools[3] = false;
									}
								}
								boolean bool_228_ = (!bool_209_ && !bools[0]
										&& !bools[2] && !bools[1] && !bools[3]);
								int[] is_229_ = null;
								int[] is_230_;
								int i_231_;
								int[] is_232_;
								int i_233_;
								int[] is_234_;
								if (!bool_228_) {
									if (bool_209_) {
										is_229_ = (Class93.anIntArrayArray3510[i_210_]);
										i_233_ = (class72 == null ? 0
												: (Class253.anIntArray1928[i_210_]));
										is_234_ = (Class346.anIntArrayArray2893[i_210_]);
										i_231_ = (class199 != null ? Class6.anIntArray90[i_210_]
												: 0);
										is_230_ = (Class246_Sub9.anIntArrayArray5141[i_210_]);
										is_232_ = (Class98_Sub32.anIntArrayArray4111[i_210_]);
									} else {
										i_231_ = (class199 != null ? Class75.anIntArray582[i_210_]
												: 0);
										is_230_ = (Class98_Sub46_Sub10.anIntArrayArray6012[i_210_]);
										is_234_ = (Class21_Sub2.anIntArrayArray5386[i_210_]);
										is_229_ = (Class64_Sub1.anIntArrayArray3638[i_210_]);
										is_232_ = (Class278_Sub1.anIntArrayArray5169[i_210_]);
										i_233_ = (class72 != null ? (Class129.anIntArray1027[i_210_])
												: 0);
									}
								} else {
									is_230_ = (Class64_Sub28.anIntArrayArray3718[i_210_]);
									i_231_ = (class199 == null ? 0
											: (Class98_Sub46_Sub20_Sub2.anIntArray6318[i_210_]));
									is_232_ = (Class93_Sub1.anIntArrayArray5487[i_210_]);
									i_233_ = (class72 == null ? 0
											: (Class98_Sub31_Sub4.anIntArray5861[i_210_]));
									is_234_ = (Class98_Sub45.anIntArrayArray4258[i_210_]);
								}
								int i_235_ = i_233_ + i_231_;
								if ((i_235_ ^ 0xffffffff) >= -1)
									Class224_Sub2_Sub1.method2839(i_200_,
											i_205_, i_207_);
								else {
									if (bools[0])
										i_235_++;
									if (bools[2])
										i_235_++;
									if (bools[1])
										i_235_++;
									if (bools[3])
										i_235_++;
									int i_236_ = 0;
									int i_237_ = 0;
									int i_238_ = 3 * i_235_;
									int[] is_239_ = !bool_226_ ? null
											: new int[i_238_];
									int[] is_240_ = new int[i_238_];
									int[] is_241_ = new int[i_238_];
									int[] is_242_ = new int[i_238_];
									int[] is_243_ = new int[i_238_];
									int[] is_244_ = new int[i_238_];
									int[] is_245_ = (var_s_199_ != null ? new int[i_238_]
											: null);
									int[] is_246_ = (var_s_199_ == null
											&& var_s == null ? null
											: new int[i_238_]);
									int i_247_ = -1;
									int i_248_ = -1;
									int i_249_ = 256;
									if (class199 != null) {
										i_247_ = ((Class199) class199).anInt1537;
										i_249_ = ((Class199) class199).anInt1529;
										i_248_ = ((Class199) class199).anInt1542;
										int i_250_ = (Class98_Sub16.method1149(
												false, class199, var_ha));
										for (int i_251_ = 0; i_231_ > i_251_; i_251_++) {
											boolean bool_252_ = false;
											int i_253_;
											if (!bools[-i_211_ & 0x3]
													|| ((is_229_[0] ^ 0xffffffff) != (i_236_ ^ 0xffffffff))) {
												if (!bools[2 + -i_211_ & 0x3]
														|| ((is_229_[2] ^ 0xffffffff) != (i_236_ ^ 0xffffffff))) {
													if (!(bools[-i_211_ + 1 & 0x3])
															|| ((i_236_ ^ 0xffffffff) != (is_229_[1] ^ 0xffffffff))) {
														if ((bools[(0x3 & 3 - i_211_)])
																&& ((i_236_ ^ 0xffffffff) == (is_229_[3] ^ 0xffffffff))) {
															Class337_Sub1.anIntArray5500[0] = (is_230_[i_236_]);
															Class337_Sub1.anIntArray5500[1] = 7;
															Class337_Sub1.anIntArray5500[2] = (is_232_[i_236_]);
															Class337_Sub1.anIntArray5500[3] = 7;
															Class337_Sub1.anIntArray5500[4] = (is_234_[i_236_]);
															Class337_Sub1.anIntArray5500[5] = (is_232_[i_236_]);
															i_253_ = 6;
														} else {
															Class337_Sub1.anIntArray5500[0] = (is_230_[i_236_]);
															Class337_Sub1.anIntArray5500[1] = (is_234_[i_236_]);
															i_253_ = 3;
															Class337_Sub1.anIntArray5500[2] = (is_232_[i_236_]);
														}
													} else {
														Class337_Sub1.anIntArray5500[0] = is_230_[i_236_];
														Class337_Sub1.anIntArray5500[1] = 3;
														Class337_Sub1.anIntArray5500[2] = is_232_[i_236_];
														Class337_Sub1.anIntArray5500[3] = 3;
														Class337_Sub1.anIntArray5500[4] = is_234_[i_236_];
														Class337_Sub1.anIntArray5500[5] = is_232_[i_236_];
														i_253_ = 6;
													}
												} else {
													Class337_Sub1.anIntArray5500[0] = is_230_[i_236_];
													Class337_Sub1.anIntArray5500[1] = 5;
													Class337_Sub1.anIntArray5500[2] = is_232_[i_236_];
													Class337_Sub1.anIntArray5500[3] = 5;
													Class337_Sub1.anIntArray5500[4] = is_234_[i_236_];
													Class337_Sub1.anIntArray5500[5] = is_232_[i_236_];
													i_253_ = 6;
												}
											} else {
												Class337_Sub1.anIntArray5500[0] = is_230_[i_236_];
												Class337_Sub1.anIntArray5500[1] = 1;
												Class337_Sub1.anIntArray5500[2] = is_232_[i_236_];
												Class337_Sub1.anIntArray5500[3] = 1;
												Class337_Sub1.anIntArray5500[4] = is_234_[i_236_];
												Class337_Sub1.anIntArray5500[5] = is_232_[i_236_];
												i_253_ = 6;
											}
											i_236_++;
											for (int i_254_ = 0; i_254_ < i_253_; i_254_++) {
												int i_255_ = (Class337_Sub1.anIntArray5500[i_254_]);
												int i_256_ = 0x7 & (-(2 * i_211_) + i_255_);
												int i_257_ = anIntArray2551[i_255_];
												int i_258_ = anIntArray2553[i_255_];
												int i_259_;
												int i_260_;
												if (i_211_ == 1) {
													i_259_ = i_258_;
													i_260_ = -i_257_ + 512;
												} else if ((i_211_ ^ 0xffffffff) == -3) {
													i_259_ = -i_257_ + 512;
													i_260_ = 512 + -i_258_;
												} else if ((i_211_ ^ 0xffffffff) != -4) {
													i_260_ = i_258_;
													i_259_ = i_257_;
												} else {
													i_259_ = -i_258_ + 512;
													i_260_ = i_257_;
												}
												is_240_[i_237_] = i_259_;
												is_241_[i_237_] = i_260_;
												if (is_245_ != null
														&& (Class310.aBooleanArrayArray2653[i_210_][i_255_])) {
													int i_261_ = (i_259_ + (i_205_ << -139862679));
													int i_262_ = (i_260_ + (i_207_ << -735630231));
													is_245_[i_237_] = ((var_s_199_
															.method3417(i_261_,
																	i_262_,
																	true)) - (var_s_198_
															.method3417(i_261_,
																	i_262_,
																	true)));
												}
												if (is_246_ != null) {
													if (var_s_199_ == null
															|| (Class310.aBooleanArrayArray2653[i_210_][i_255_])) {
														if (var_s != null
																&& !(Class278_Sub1.aBooleanArrayArray5171[i_210_][i_255_])) {
															int i_263_ = (i_259_ + (i_205_ << -1191204759));
															int i_264_ = (i_260_ + (i_207_ << -858207319));
															is_246_[i_237_] = ((var_s
																	.method3417(
																			i_263_,
																			i_264_,
																			true)) - (var_s_198_
																	.method3417(
																			i_263_,
																			i_264_,
																			true)));
														}
													} else {
														int i_265_ = ((i_205_ << -1129452151) + i_259_);
														int i_266_ = ((i_207_ << 1770605321) + i_260_);
														is_246_[i_237_] = ((var_s_198_
																.method3417(
																		i_265_,
																		i_266_,
																		true)) + -(var_s_199_
																.method3417(
																		i_265_,
																		i_266_,
																		true)));
													}
												}
												if ((i_255_ ^ 0xffffffff) > -9
														&& ((Class95.anIntArray800[i_256_]) > (((Class199) class199).anInt1535))) {
													if (is_239_ != null)
														is_239_[i_237_] = (Class277.anIntArray2049[i_256_]);
													is_244_[i_237_] = (Class156_Sub1.anIntArray3279[i_256_]);
													is_243_[i_237_] = (Class135.anIntArray1056[i_256_]);
													is_242_[i_237_] = (Class98_Sub10_Sub4.anIntArray5547[i_256_]);
												} else {
													if (is_239_ != null)
														is_239_[i_237_] = i_250_;
													is_243_[i_237_] = ((Class199) class199).anInt1542;
													is_244_[i_237_] = ((Class199) class199).anInt1529;
													is_242_[i_237_] = i_247_;
												}
												i_237_++;
											}
										}
										if (!((Class305) this).aBoolean2544
												&& i_200_ == 0)
											Class286.method3382(
													i_205_,
													i_207_,
													(((Class199) class199).anInt1532),
													(((Class199) class199).anInt1530) * 8,
													(((Class199) class199).anInt1534));
										if (i_210_ != 12
												&& (((Class199) class199).anInt1537 ^ 0xffffffff) != 0
												&& (((Class199) class199).aBoolean1538))
											bool = true;
									} else if (bool_228_)
										i_236_ += (Class98_Sub46_Sub20_Sub2.anIntArray6318[i_210_]);
									else if (!bool_209_)
										i_236_ += Class75.anIntArray582[i_210_];
									else
										i_236_ += Class6.anIntArray90[i_210_];
									if (class72 != null) {
										if ((i_215_ ^ 0xffffffff) == -1)
											i_215_ = i_213_;
										if (i_216_ == 0)
											i_216_ = i_213_;
										if (i_214_ == 0)
											i_214_ = i_213_;
										Class72 class72_267_ = (aClass153_2546
												.method2483(-1 + i_213_, 126));
										Class72 class72_268_ = (aClass153_2546
												.method2483(-1 + i_214_, 122));
										Class72 class72_269_ = (aClass153_2546
												.method2483(i_215_ + -1, i
														^ ~0x58fb));
										Class72 class72_270_ = (aClass153_2546
												.method2483(i_216_ + -1,
														i + 22775));
										for (int i_271_ = 0; ((i_271_ ^ 0xffffffff) > (i_233_ ^ 0xffffffff)); i_271_++) {
											boolean bool_272_ = false;
											int i_273_;
											if (!bools[0x3 & -i_211_]
													|| is_229_[0] != i_236_) {
												if (!bools[-i_211_ + 2 & 0x3]
														|| ((i_236_ ^ 0xffffffff) != (is_229_[2] ^ 0xffffffff))) {
													if (!(bools[1 - i_211_ & 0x3])
															|| ((i_236_ ^ 0xffffffff) != (is_229_[1] ^ 0xffffffff))) {
														if (!(bools[(0x3 & 3 - i_211_)])
																|| (i_236_ != (is_229_[3]))) {
															Class337_Sub1.anIntArray5500[0] = (is_230_[i_236_]);
															Class337_Sub1.anIntArray5500[1] = (is_234_[i_236_]);
															i_273_ = 3;
															Class337_Sub1.anIntArray5500[2] = (is_232_[i_236_]);
														} else {
															Class337_Sub1.anIntArray5500[0] = (is_230_[i_236_]);
															Class337_Sub1.anIntArray5500[1] = 7;
															Class337_Sub1.anIntArray5500[2] = (is_232_[i_236_]);
															Class337_Sub1.anIntArray5500[3] = 7;
															Class337_Sub1.anIntArray5500[4] = (is_234_[i_236_]);
															i_273_ = 6;
															Class337_Sub1.anIntArray5500[5] = (is_232_[i_236_]);
														}
													} else {
														Class337_Sub1.anIntArray5500[0] = is_230_[i_236_];
														Class337_Sub1.anIntArray5500[1] = 3;
														Class337_Sub1.anIntArray5500[2] = is_232_[i_236_];
														Class337_Sub1.anIntArray5500[3] = 3;
														Class337_Sub1.anIntArray5500[4] = is_234_[i_236_];
														Class337_Sub1.anIntArray5500[5] = is_232_[i_236_];
														i_273_ = 6;
													}
												} else {
													Class337_Sub1.anIntArray5500[0] = is_230_[i_236_];
													Class337_Sub1.anIntArray5500[1] = 5;
													Class337_Sub1.anIntArray5500[2] = is_232_[i_236_];
													Class337_Sub1.anIntArray5500[3] = 5;
													Class337_Sub1.anIntArray5500[4] = is_234_[i_236_];
													i_273_ = 6;
													Class337_Sub1.anIntArray5500[5] = is_232_[i_236_];
												}
											} else {
												Class337_Sub1.anIntArray5500[0] = is_230_[i_236_];
												Class337_Sub1.anIntArray5500[1] = 1;
												Class337_Sub1.anIntArray5500[2] = is_232_[i_236_];
												Class337_Sub1.anIntArray5500[3] = 1;
												Class337_Sub1.anIntArray5500[4] = is_234_[i_236_];
												i_273_ = 6;
												Class337_Sub1.anIntArray5500[5] = is_232_[i_236_];
											}
											i_236_++;
											for (int i_274_ = 0; ((i_273_ ^ 0xffffffff) < (i_274_ ^ 0xffffffff)); i_274_++) {
												int i_275_ = (Class337_Sub1.anIntArray5500[i_274_]);
												int i_276_ = (i_275_
														+ -(2 * i_211_) & 0x7);
												int i_277_ = anIntArray2551[i_275_];
												int i_278_ = anIntArray2553[i_275_];
												int i_279_;
												int i_280_;
												if (i_211_ != 1) {
													if ((i_211_ ^ 0xffffffff) != -3) {
														if (i_211_ != 3) {
															i_279_ = i_278_;
															i_280_ = i_277_;
														} else {
															i_279_ = i_277_;
															i_280_ = (-i_278_ + 512);
														}
													} else {
														i_279_ = 512 - i_278_;
														i_280_ = -i_277_ + 512;
													}
												} else {
													i_279_ = -i_277_ + 512;
													i_280_ = i_278_;
												}
												is_240_[i_237_] = i_280_;
												is_241_[i_237_] = i_279_;
												if (is_245_ != null
														&& (Class310.aBooleanArrayArray2653[i_210_][i_275_])) {
													int i_281_ = (i_280_ + (i_205_ << 1261077129));
													int i_282_ = ((i_207_ << 1232038217) - -i_279_);
													is_245_[i_237_] = ((var_s_199_
															.method3417(i_281_,
																	i_282_,
																	true)) - (var_s_198_
															.method3417(i_281_,
																	i_282_,
																	true)));
												}
												if (is_246_ != null) {
													if (var_s_199_ != null
															&& !(Class310.aBooleanArrayArray2653[i_210_][i_275_])) {
														int i_283_ = ((i_205_ << 226787497) - -i_280_);
														int i_284_ = (i_279_ + (i_207_ << -1842618583));
														is_246_[i_237_] = ((var_s_198_
																.method3417(
																		i_283_,
																		i_284_,
																		true)) - (var_s_199_
																.method3417(
																		i_283_,
																		i_284_,
																		true)));
													} else if (var_s != null
															&& !(Class278_Sub1.aBooleanArrayArray5171[i_210_][i_275_])) {
														int i_285_ = (i_280_ + (i_205_ << -712659863));
														int i_286_ = (i_279_ + (i_207_ << -1203749399));
														is_246_[i_237_] = ((var_s
																.method3417(
																		i_285_,
																		i_286_,
																		true)) - (var_s_198_
																.method3417(
																		i_285_,
																		i_286_,
																		true)));
													}
												}
												if ((i_275_ ^ 0xffffffff) > -9
														&& ((Class95.anIntArray800[i_276_]) ^ 0xffffffff) <= -1) {
													if (is_239_ != null)
														is_239_[i_237_] = (Class277.anIntArray2049[i_276_]);
													is_244_[i_237_] = (Class156_Sub1.anIntArray3279[i_276_]);
													is_243_[i_237_] = (Class135.anIntArray1056[i_276_]);
													is_242_[i_237_] = (Class98_Sub10_Sub4.anIntArray5547[i_276_]);
												} else {
													if (!bool_209_
															|| !(Class310.aBooleanArrayArray2653[i_210_][i_275_])) {
														if (((i_280_ ^ 0xffffffff) == -1)
																&& ((i_279_ ^ 0xffffffff) == -1)) {
															is_242_[i_237_] = (is[i_205_][i_207_]);
															is_243_[i_237_] = (((Class72) class72_267_).anInt537);
															is_244_[i_237_] = (((Class72) class72_267_).anInt536);
														} else if (((i_280_ ^ 0xffffffff) == -1)
																&& (i_279_ == 512)) {
															is_242_[i_237_] = (is[i_205_][i_208_]);
															is_243_[i_237_] = (((Class72) class72_268_).anInt537);
															is_244_[i_237_] = (((Class72) class72_268_).anInt536);
														} else if (((i_280_ ^ 0xffffffff) == -513)
																&& (i_279_ == 512)) {
															is_242_[i_237_] = (is[i_206_][i_208_]);
															is_243_[i_237_] = (((Class72) class72_269_).anInt537);
															is_244_[i_237_] = (((Class72) class72_269_).anInt536);
														} else if (((i_280_ ^ 0xffffffff) == -513)
																&& (i_279_ == 0)) {
															is_242_[i_237_] = (is[i_206_][i_207_]);
															is_243_[i_237_] = (((Class72) class72_270_).anInt537);
															is_244_[i_237_] = (((Class72) class72_270_).anInt536);
														} else {
															if ((i_280_ ^ 0xffffffff) <= -257) {
																if (i_279_ < 256) {
																	is_243_[i_237_] = (((Class72) class72_270_).anInt537);
																	is_244_[i_237_] = (((Class72) class72_270_).anInt536);
																} else {
																	is_243_[i_237_] = (((Class72) class72_269_).anInt537);
																	is_244_[i_237_] = (((Class72) class72_269_).anInt536);
																}
															} else if ((i_279_ ^ 0xffffffff) > -257) {
																is_243_[i_237_] = (((Class72) class72_267_).anInt537);
																is_244_[i_237_] = (((Class72) class72_267_).anInt536);
															} else {
																is_243_[i_237_] = (((Class72) class72_268_).anInt537);
																is_244_[i_237_] = (((Class72) class72_268_).anInt536);
															}
															int i_287_ = (Class98_Sub46_Sub20
																	.method1637(
																			(i_280_ << -1870738201 >> 952160265),
																			i + 22533,
																			(is[i_205_][i_207_]),
																			(is[i_206_][i_207_])));
															int i_288_ = (Class98_Sub46_Sub20
																	.method1637(
																			(i_280_ << -1405224473 >> -654341815),
																			-84,
																			(is[i_205_][i_208_]),
																			(is[i_206_][i_208_])));
															is_242_[i_237_] = (Class98_Sub46_Sub20
																	.method1637(
																			(i_279_ << -1396466297 >> -1215779831),
																			-51,
																			i_287_,
																			i_288_));
														}
													} else {
														is_243_[i_237_] = i_248_;
														is_244_[i_237_] = i_249_;
														is_242_[i_237_] = i_247_;
													}
													if (is_239_ != null)
														is_239_[i_237_] = is_242_[i_237_];
												}
												i_237_++;
											}
										}
										if (i_210_ != 0
												&& ((Class72) class72).aBoolean544)
											bool = true;
									}
									int i_289_ = var_s_198_.method3420(i_207_,
											i ^ 0x69de, i_205_);
									int i_290_ = var_s_198_.method3420(i_207_,
											-12639, i_206_);
									int i_291_ = var_s_198_.method3420(i_208_,
											-12639, i_206_);
									int i_292_ = var_s_198_.method3420(i_208_,
											-12639, i_205_);
									boolean bool_293_ = Class1.method162(
											i_207_, (byte) -92, i_205_);
									if (bool_293_
											&& (i_200_ ^ 0xffffffff) < -2
											|| (!bool_293_ && (i_200_ ^ 0xffffffff) < -1)) {
										boolean bool_294_ = true;
										if (class72 != null
												&& !(((Class72) class72).aBoolean543))
											bool_294_ = false;
										else if ((i_213_ ^ 0xffffffff) == -1
												&& i_210_ != 0)
											bool_294_ = false;
										else if ((i_212_ ^ 0xffffffff) < -1
												&& class199_217_ != null
												&& !(((Class199) class199_217_).aBoolean1527))
											bool_294_ = false;
										if (bool_294_
												&& ((i_290_ ^ 0xffffffff) == (i_289_ ^ 0xffffffff))
												&& i_289_ == i_291_
												&& ((i_289_ ^ 0xffffffff) == (i_292_ ^ 0xffffffff)))
											((Class305) this).aByteArrayArrayArray2550[i_200_][i_205_][i_207_] = (byte) (Class41
													.method366(
															(((Class305) this).aByteArrayArrayArray2550[i_200_][i_205_][i_207_]),
															4));
									}
									int i_295_ = 0;
									int i_296_ = 0;
									int i_297_ = 0;
									if (((Class305) this).aBoolean2544) {
										i_295_ = Appearance.method3636(i_205_,
												i_207_);
										i_296_ = IOException_Sub1.method127(
												i_205_, i_207_);
										i_297_ = Class98_Sub46_Sub20
												.method1639(i_205_, i_207_);
									}
									var_s_198_.U(i_205_, i_207_, is_240_,
											is_245_, is_241_, is_246_, is_242_,
											is_239_, is_243_, is_244_, i_295_,
											i_296_, i_297_, bool);
									Class224_Sub2_Sub1.method2839(i_200_,
											i_205_, i_207_);
								}
							}
						}
					}
				}
				if (i == -22657)
					break;
				((Class305) this).aByteArrayArrayArray2554 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("sm.K("
						+ (var_s != null ? "{...}" : "null") + ','
						+ (var_ha != null ? "{...}" : "null") + ','
						+ (var_s_198_ != null ? "{...}" : "null") + ','
						+ (is != null ? "{...}" : "null") + ','
						+ (var_s_199_ != null ? "{...}" : "null") + ',' + i
						+ ',' + i_200_ + ')'));
			}
			break;
		} while (false);
	}

	final void method3579(int i, Class243[] class243s, ha var_ha, int[][][] is) {
		try {
			if (!((Class305) this).aBoolean2544) {
				for (int i_298_ = 0; i_298_ < 4; i_298_++) {
					for (int i_299_ = 0; i_299_ < ((Class305) this).anInt2543; i_299_++) {
						for (int i_300_ = 0; ((i_300_ ^ 0xffffffff) > (((Class305) this).anInt2542 ^ 0xffffffff)); i_300_++) {
							if (((Class281.aByteArrayArrayArray2117[i_298_][i_299_][i_300_]) & 0x1 ^ 0xffffffff) != -1) {
								int i_301_ = i_298_;
								if ((0x2 & (Class281.aByteArrayArrayArray2117[1][i_299_][i_300_])) != 0)
									i_301_--;
								if ((i_301_ ^ 0xffffffff) <= -1)
									class243s[i_301_].method2941(i_300_, 23254,
											i_299_);
							}
						}
					}
				}
			}
			for (int i_302_ = i; ((((Class305) this).anInt2547 ^ 0xffffffff) < (i_302_ ^ 0xffffffff)); i_302_++) {
				int i_303_ = 0;
				int i_304_ = 0;
				if (!((Class305) this).aBoolean2544) {
					if (Class98_Sub46_Sub9.aBoolean6002)
						i_304_ |= 0x8;
					if (AnimationDefinition.aBoolean830)
						i_303_ |= 0x2;
					if ((Class61.anInt479 ^ 0xffffffff) != -1) {
						i_303_ |= 0x1;
						if (i_302_ == 0 | Class202.aBoolean1548)
							i_304_ |= 0x10;
					}
				}
				if (AnimationDefinition.aBoolean830)
					i_304_ |= 0x7;
				if (!Class369.aBoolean3130)
					i_304_ |= 0x20;
				int[][] is_305_ = (is != null && is.length > i_302_ ? is[i_302_]
						: ((Class305) this).anIntArrayArrayArray2549[i_302_]);
				Class138.method2278(i_302_, var_ha.a(
						((Class305) this).anInt2543,
						((Class305) this).anInt2542,
						(((Class305) this).anIntArrayArrayArray2549[i_302_]),
						is_305_, 512, i_303_, i_304_));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sm.G(" + i + ','
					+ (class243s != null ? "{...}" : "null") + ','
					+ (var_ha != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method3580(String string, boolean bool) {
		try {
			int i = string.length();
			int i_306_ = 0;
			for (int i_307_ = 0; i > i_307_; i_307_++)
				i_306_ = ((i_306_ << 1982319173) - (i_306_ - Class349
						.method3843((byte) 88, string.charAt(i_307_))));
			if (bool != false)
				method3572(-128, null);
			return i_306_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sm.M("
					+ (string != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	private final void method3581(int i, boolean bool, int i_308_, int i_309_,
			int i_310_, int i_311_, byte i_312_, int i_313_, int i_314_,
			int i_315_, ByteBuffer class98_sub22) {
		try {
			if (i_312_ != -111)
				method3575(88, -38, null, 117, -34, -46, -20, -114, null, -78);
			if (i_308_ != 1) {
				if (i_308_ != 2) {
					if (i_308_ == 3)
						i_314_ = 1;
				} else {
					i_313_ = 1;
					i_314_ = 1;
				}
			} else
				i_313_ = 1;
			if ((i_311_ ^ 0xffffffff) <= -1
					&& (((Class305) this).anInt2543 ^ 0xffffffff) < (i_311_ ^ 0xffffffff)
					&& (i ^ 0xffffffff) <= -1
					&& ((Class305) this).anInt2542 > i) {
				if (!((Class305) this).aBoolean2544 && !bool)
					Class281.aByteArrayArrayArray2117[i_315_][i_311_][i] = (byte) 0;
				for (;;) {
					int i_316_ = class98_sub22.readUnsignedByte((byte) 3);
					if ((i_316_ ^ 0xffffffff) == -1) {
						if (!((Class305) this).aBoolean2544) {
							if ((i_315_ ^ 0xffffffff) != -1)
								((Class305) this).anIntArrayArrayArray2549[i_315_][i_314_
										+ i_311_][i - -i_313_] = -960
										+ (((Class305) this).anIntArrayArrayArray2549[i_315_
												+ -1][i_314_ + i_311_][i_313_
												+ i]);
							else
								((Class305) this).anIntArrayArrayArray2549[0][i_314_
										+ i_311_][i_313_ + i] = -(Class246_Sub3_Sub4_Sub4
										.method3082(i_310_ + 556238,
												i_312_ + 115, i_309_ + 932731)) * 8 << -48538654;
						} else {
							((Class305) this).anIntArrayArrayArray2549[0][i_311_
									- -i_314_][i_313_ + i] = 0;
							break;
						}
						break;
					}
					if ((i_316_ ^ 0xffffffff) == -2) {
						int i_317_ = class98_sub22
								.readUnsignedByte((byte) -114);
						if (!((Class305) this).aBoolean2544) {
							if (i_317_ == 1)
								i_317_ = 0;
							if (i_315_ != 0)
								((Class305) this).anIntArrayArrayArray2549[i_315_][i_311_
										- -i_314_][i - -i_313_] = (-(8 * i_317_ << 1144983522) + (((Class305) this).anIntArrayArrayArray2549[-1
										+ i_315_][i_311_ + i_314_][i_313_ + i]));
							else
								((Class305) this).anIntArrayArrayArray2549[0][i_311_
										+ i_314_][i + i_313_] = -i_317_ * 8 << -478503326;
						} else {
							((Class305) this).anIntArrayArrayArray2549[0][i_314_
									+ i_311_][i_313_ + i] = 8 * i_317_ << 2030578370;
							break;
						}
						break;
					}
					if (i_316_ <= 49) {
						if (bool)
							class98_sub22.readUnsignedByte((byte) -105);
						else {
							aByteArrayArrayArray2540[i_315_][i_311_][i] = class98_sub22
									.readSignedByte((byte) -19);
							aByteArrayArrayArray2555[i_315_][i_311_][i] = (byte) ((i_316_ - 2) / 4);
							aByteArrayArrayArray2556[i_315_][i_311_][i] = (byte) Class202
									.method2702(3, (i_308_ + -2 + i_316_));
						}
					} else if ((i_316_ ^ 0xffffffff) >= -82) {
						if (!((Class305) this).aBoolean2544 && !bool)
							Class281.aByteArrayArrayArray2117[i_315_][i_311_][i] = (byte) (-49 + i_316_);
					} else if (!bool)
						aByteArrayArrayArray2548[i_315_][i_311_][i] = (byte) (i_316_ - 81);
				}
			} else {
				for (;;) {
					int i_318_ = class98_sub22.readUnsignedByte((byte) 76);
					if ((i_318_ ^ 0xffffffff) == -1)
						break;
					if (i_318_ == 1) {
						class98_sub22.readUnsignedByte((byte) 122);
						break;
					}
					if (i_318_ <= 49)
						class98_sub22.readUnsignedByte((byte) -124);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, ("sm.I(" + i + ',' + bool
							+ ',' + i_308_ + ',' + i_309_ + ',' + i_310_ + ','
							+ i_311_ + ',' + i_312_ + ',' + i_313_ + ','
							+ i_314_ + ',' + i_315_ + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	Class305(int i, int i_319_, int i_320_, boolean bool, Class32 class32,
			Class153 class153) {
		anIntArray2551 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128,
				256, 128, 384, 256 };
		try {
			((Class305) this).anInt2542 = i_320_;
			aClass32_2552 = class32;
			((Class305) this).anInt2547 = i;
			((Class305) this).aBoolean2544 = bool;
			((Class305) this).anInt2543 = i_319_;
			aClass153_2546 = class153;
			((Class305) this).anIntArrayArrayArray2549 = (new int[((Class305) this).anInt2547][1 + ((Class305) this).anInt2543][((Class305) this).anInt2542
					- -1]);
			aByteArrayArrayArray2555 = (new byte[((Class305) this).anInt2547][((Class305) this).anInt2543][((Class305) this).anInt2542]);
			((Class305) this).aByteArrayArrayArray2550 = (new byte[((Class305) this).anInt2547][1 + ((Class305) this).anInt2543][((Class305) this).anInt2542 + 1]);
			aByteArrayArrayArray2540 = (new byte[((Class305) this).anInt2547][((Class305) this).anInt2543][((Class305) this).anInt2542]);
			aByteArrayArrayArray2548 = (new byte[((Class305) this).anInt2547][((Class305) this).anInt2543][((Class305) this).anInt2542]);
			aByteArrayArrayArray2556 = (new byte[((Class305) this).anInt2547][((Class305) this).anInt2543][((Class305) this).anInt2542]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sm.<init>(" + i
					+ ',' + i_319_ + ',' + i_320_ + ',' + bool + ','
					+ (class32 != null ? "{...}" : "null") + ','
					+ (class153 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anIntArray2541 = new int[8];
	}
}
