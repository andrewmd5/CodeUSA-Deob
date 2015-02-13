/* Class48_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class48_Sub2_Sub1 extends Class48_Sub2 {
	private ha_Sub3 aHa_Sub3_5521;
	static float[][] aFloatArrayArray5522 = {
			{ -0.333333F, -0.333333F, -0.333333F },
			{ 0.333333F, -0.333333F, -0.333333F },
			{ -0.333333F, 0.333333F, -0.333333F },
			{ 0.333333F, 0.333333F, -0.333333F },
			{ -0.333333F, -0.333333F, 0.333333F },
			{ 0.333333F, -0.333333F, 0.333333F },
			{ -0.333333F, 0.333333F, 0.333333F },
			{ 0.333333F, 0.333333F, 0.333333F } };
	private int anInt5523;
	private int anInt5524;
	static int anInt5525 = -1;
	private int anInt5526;
	private int anInt5527;
	private int anInt5528;
	private Interface4_Impl3 anInterface4_Impl3_5529;
	private int anInt5530;
	static Class265 aClass265_5531 = new Class265();
	static int anInt5532 = 0;

	static final void method471(int i, byte i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			int i_4_ = -79 / ((-80 - i_0_) / 41);
			if (i_3_ < i_2_) {
				for (int i_5_ = i_3_; (i_2_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++)
					AnimationDefinition.anIntArrayArray814[i_5_][i] = i_1_;
			} else {
				for (int i_6_ = i_2_; (i_3_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++)
					AnimationDefinition.anIntArrayArray814[i_6_][i] = i_1_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("efa.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final Class228 method472(int i, int i_7_, Class146 class146,
			int i_8_, int i_9_) {
		try {
			if (class146 == null)
				return null;
			if (i_9_ != 4)
				anInt5525 = -48;
			Class228 class228 = new Class228(i_7_, i, i_8_, class146.na(),
					class146.V(), class146.RA(), class146.fa(), class146.EA(),
					class146.HA(), class146.G());
			return class228;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("efa.F(" + i + ','
					+ i_7_ + ',' + (class146 != null ? "{...}" : "null") + ','
					+ i_8_ + ',' + i_9_ + ')'));
		}
	}

	static final void method473(int i, int i_10_, int i_11_, int i_12_,
			int i_13_, int i_14_, int i_15_, int i_16_) {
		try {
			int i_17_ = 0;
			int i_18_ = i_12_;
			int i_19_ = 0;
			int i_20_ = i_14_ + -i_10_;
			int i_21_ = i_12_ + -i_10_;
			int i_22_ = i_14_ * i_14_;
			int i_23_ = i_12_ * i_12_;
			int i_24_ = i_20_ * i_20_;
			int i_25_ = i_21_ * i_21_;
			int i_26_ = i_23_ << 1121913825;
			int i_27_ = i_22_ << 2023203873;
			int i_28_ = i_25_ << -1633987743;
			int i_29_ = i_24_ << -1996017919;
			int i_30_ = i_12_ << 2038291265;
			int i_31_ = i_21_ << -951242911;
			int i_32_ = i_22_ * (-i_30_ + 1) - -i_26_;
			int i_33_ = i_23_ - i_27_ * (-1 + i_30_);
			int i_34_ = i_28_ + i_24_ * (-i_31_ + 1);
			int i_35_ = i_25_ - (-1 + i_31_) * i_29_;
			if (i_15_ != -25682)
				anInt5525 = -99;
			int i_36_ = i_22_ << 1187177570;
			int i_37_ = i_23_ << 1493540962;
			int i_38_ = i_24_ << -1623543038;
			int i_39_ = i_25_ << -1092116446;
			int i_40_ = i_26_ * 3;
			int i_41_ = (-3 + i_30_) * i_27_;
			int i_42_ = 3 * i_28_;
			int i_43_ = i_29_ * (i_31_ + -3);
			int i_44_ = i_37_;
			int i_45_ = (-1 + i_12_) * i_36_;
			int i_46_ = i_39_;
			if ((Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff) >= (i ^ 0xffffffff)
					&& (Class218.anInt1635 ^ 0xffffffff) <= (i ^ 0xffffffff)) {
				int[] is = AnimationDefinition.anIntArrayArray814[i];
				int i_47_ = Class263.method3219(false, Class3.anInt77,
						Class76_Sub8.anInt3778, -i_14_ + i_11_);
				int i_48_ = Class263.method3219(false, Class3.anInt77,
						Class76_Sub8.anInt3778, i_11_ + i_14_);
				int i_49_ = Class263.method3219(false, Class3.anInt77,
						Class76_Sub8.anInt3778, i_11_ - i_20_);
				int i_50_ = Class263.method3219(false, Class3.anInt77,
						Class76_Sub8.anInt3778, i_11_ + i_20_);
				Class333.method3761(i_13_, is, i_47_, i_49_, (byte) 24);
				Class333.method3761(i_16_, is, i_49_, i_50_, (byte) -128);
				Class333.method3761(i_13_, is, i_50_, i_48_, (byte) -128);
			}
			int i_51_ = i_38_ * (-1 + i_21_);
			while ((i_18_ ^ 0xffffffff) < -1) {
				boolean bool = i_21_ >= i_18_;
				if (i_32_ < 0) {
					while (i_32_ < 0) {
						i_32_ += i_40_;
						i_33_ += i_44_;
						i_44_ += i_37_;
						i_40_ += i_37_;
						i_17_++;
					}
				}
				if (bool) {
					if (i_34_ < 0) {
						while ((i_34_ ^ 0xffffffff) > -1) {
							i_35_ += i_46_;
							i_34_ += i_42_;
							i_19_++;
							i_42_ += i_39_;
							i_46_ += i_39_;
						}
					}
					if ((i_35_ ^ 0xffffffff) > -1) {
						i_34_ += i_42_;
						i_35_ += i_46_;
						i_42_ += i_39_;
						i_46_ += i_39_;
						i_19_++;
					}
					i_34_ += -i_51_;
					i_35_ += -i_43_;
					i_51_ -= i_38_;
					i_43_ -= i_38_;
				}
				if ((i_33_ ^ 0xffffffff) > -1) {
					i_32_ += i_40_;
					i_33_ += i_44_;
					i_44_ += i_37_;
					i_17_++;
					i_40_ += i_37_;
				}
				i_32_ += -i_45_;
				i_33_ += -i_41_;
				i_45_ -= i_36_;
				i_41_ -= i_36_;
				int i_52_ = --i_18_ + i;// TODO ---
				int i_53_ = i_18_ + i;
				if ((i_53_ ^ 0xffffffff) <= (Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff)
						&& (Class218.anInt1635 ^ 0xffffffff) <= (i_52_ ^ 0xffffffff)) {
					int i_54_ = Class263.method3219(false, Class3.anInt77,
							Class76_Sub8.anInt3778, i_11_ + i_17_);
					int i_55_ = Class263.method3219(false, Class3.anInt77,
							Class76_Sub8.anInt3778, -i_17_ + i_11_);
					if (bool) {
						int i_56_ = Class263.method3219(false, Class3.anInt77,
								Class76_Sub8.anInt3778, i_11_ + i_19_);
						int i_57_ = Class263.method3219(false, Class3.anInt77,
								Class76_Sub8.anInt3778, i_11_ + -i_19_);
						if ((Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff) >= (i_52_ ^ 0xffffffff)) {
							int[] is = AnimationDefinition.anIntArrayArray814[i_52_];
							Class333.method3761(i_13_, is, i_55_, i_57_,
									(byte) -125);
							Class333.method3761(i_16_, is, i_57_, i_56_,
									(byte) -123);
							Class333.method3761(i_13_, is, i_56_, i_54_,
									(byte) 47);
						}
						if ((Class218.anInt1635 ^ 0xffffffff) <= (i_53_ ^ 0xffffffff)) {
							int[] is = AnimationDefinition.anIntArrayArray814[i_53_];
							Class333.method3761(i_13_, is, i_55_, i_57_,
									(byte) 40);
							Class333.method3761(i_16_, is, i_57_, i_56_,
									(byte) -127);
							Class333.method3761(i_13_, is, i_56_, i_54_,
									(byte) -123);
						}
					} else {
						if (i_52_ >= Class98_Sub10_Sub38.anInt5753)
							Class333.method3761(
									i_13_,
									(AnimationDefinition.anIntArrayArray814[i_52_]),
									i_55_, i_54_, (byte) 14);
						if ((Class218.anInt1635 ^ 0xffffffff) <= (i_53_ ^ 0xffffffff))
							Class333.method3761(
									i_13_,
									(AnimationDefinition.anIntArrayArray814[i_53_]),
									i_55_, i_54_, (byte) -125);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("efa.C(" + i + ','
					+ i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ','
					+ i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	static final int method474(int i, byte i_58_) {
		try {
			int i_59_ = 0;
			if (i_58_ != 31)
				anInt5525 = 28;
			if (i < 0 || (i ^ 0xffffffff) <= -65537) {
				i_59_ += 16;
				i >>>= 16;
			}
			if (i >= 256) {
				i >>>= 8;
				i_59_ += 8;
			}
			if (i >= 16) {
				i >>>= 4;
				i_59_ += 4;
			}
			if (i >= 4) {
				i >>>= 2;
				i_59_ += 2;
			}
			if (i >= 1) {
				i >>>= 1;
				i_59_++;
			}
			return i + i_59_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "efa.A(" + i + ','
					+ i_58_ + ')');
		}
	}

	public static void method475(int i) {
		try {
			if (i == 1187177570) {
				aFloatArrayArray5522 = null;
				aClass265_5531 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "efa.E(" + i + ')');
		}
	}

	final Interface4_Impl3 method469(int i) {
		try {
			if (anInterface4_Impl3_5529 == null) {
				Class246_Sub3_Sub1_Sub1.anIntArray6223[4] = anInt5526;
				Class246_Sub3_Sub1_Sub1.anIntArray6223[3] = anInt5523;
				Class246_Sub3_Sub1_Sub1.anIntArray6223[1] = anInt5527;
				Class246_Sub3_Sub1_Sub1.anIntArray6223[2] = anInt5524;
				Class246_Sub3_Sub1_Sub1.anIntArray6223[0] = anInt5528;
				d var_d = ((ha) aHa_Sub3_5521).aD938;
				Class246_Sub3_Sub1_Sub1.anIntArray6223[5] = anInt5530;
				boolean bool = false;
				int i_60_ = 0;
				for (int i_61_ = 0; (i_61_ ^ 0xffffffff) > -7; i_61_++) {
					if (!var_d.method8(97,
							(Class246_Sub3_Sub1_Sub1.anIntArray6223[i_61_])))
						return null;
					TextureDefinition textureDefinition = var_d.method11(
							(Class246_Sub3_Sub1_Sub1.anIntArray6223[i_61_]),
							-28755);
					int i_62_ = ((TextureDefinition) textureDefinition).aBoolean1822 ? 64 : 128;
					if ((i_60_ ^ 0xffffffff) > (i_62_ ^ 0xffffffff))
						i_60_ = i_62_;
					if ((((TextureDefinition) textureDefinition).aByte1832 ^ 0xffffffff) < -1)
						bool = true;
				}
				for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > -7; i_63_++)
					Class19.anIntArrayArray3443[i_63_] = var_d.method9(
							(Class246_Sub3_Sub1_Sub1.anIntArray6223[i_63_]),
							(byte) -114, i_60_, 1.0F, false, i_60_);
				anInterface4_Impl3_5529 = aHa_Sub3_5521.method1934(8, bool,
						Class19.anIntArrayArray3443, i_60_);
			}
			int i_64_ = 84 % ((39 - i) / 57);
			return anInterface4_Impl3_5529;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "efa.B(" + i + ')');
		}
	}

	static final Class113[] method476(boolean bool) {
		try {
			if (bool != false)
				aFloatArrayArray5522 = null;
			return (new Class113[] { Class100.aClass113_840,
					Class47.aClass113_399, Class137.aClass113_1078,
					Class98_Sub44.aClass113_4245, Class365.aClass113_3109,
					Class280.aClass113_2111, Class98_Sub10_Sub3.aClass113_5546,
					Class308.aClass113_2582, Class4.aClass113_80,
					Class18.aClass113_210 });
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "efa.G(" + bool
					+ ')');
		}
	}

	Class48_Sub2_Sub1(ha_Sub3 var_ha_Sub3, int i, int i_65_, int i_66_,
			int i_67_, int i_68_, int i_69_) {
		try {
			anInt5527 = i_65_;
			anInt5526 = i_68_;
			anInt5528 = i;
			anInt5524 = i_66_;
			anInt5523 = i_67_;
			anInt5530 = i_69_;
			aHa_Sub3_5521 = var_ha_Sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("efa.<init>("
					+ (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i + ','
					+ i_65_ + ',' + i_66_ + ',' + i_67_ + ',' + i_68_ + ','
					+ i_69_ + ')'));
		}
	}
}
