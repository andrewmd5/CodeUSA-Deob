/* Class287_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class287_Sub2 extends Class287 implements Interface8 {
	static OutgoingOpcode aClass171_3270 = new OutgoingOpcode(29, 6);
	private int anInt3271;
	static String aString3272 = null;
	static float aFloat3273;
	static int anInt3274;
	static Class332[] aClass332Array3275;

	@Override
	public final long method22(final int i) {
		try {
			if (i != 20260) {
				aClass332Array3275 = null;
			}
			return 0L;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "no.I(" + i + ')');
		}
	}

	static final void method3391(final int i, final int i_0_, final int i_1_) {
		try {
			if (i_1_ != 2) {
				method3391(101, -12, 47);
			}
			if (Class154.aHa1231 != null) {
				final int i_2_ = Class191.anInt1477;
				final int i_3_ = Class63.anInt493;
				Class93_Sub1.method907(7, i, i_0_);
				if ((Class98_Sub46.anInt4261 ^ 0xffffffff) == -1) {
					Class31.anInterface17_301 = null;
					Class31.anInterface17_301 = (Class154.aHa1231.method1815(
							Class154.aHa1231.method1813(aa_Sub1.anInt3556,
									(Class48_Sub1_Sub2.anInt5519)),
							Class154.aHa1231.method1744(aa_Sub1.anInt3556,
									(Class48_Sub1_Sub2.anInt5519))));
				} else if (Class98_Sub46.anInt4261 == 1
						&& (Class172.anInterface17Array1327 == null
								|| ((Class191.anInt1477 ^ 0xffffffff) != (i_2_ ^ 0xffffffff)) || Class63.anInt493 != i_3_)) {
					Class172.anInterface17Array1327 = (new Interface17[Class191.anInt1477
							* Class63.anInt493]);
					for (int i_4_ = 0; ((Class172.anInterface17Array1327.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff)); i_4_++) {
						Class172.anInterface17Array1327[i_4_] = (Class154.aHa1231
								.method1815((Class154.aHa1231.method1813(
										Class197.anInt1513,
										Class98_Sub10_Sub38.anInt5761)),
										(Class154.aHa1231.method1744(
												Class197.anInt1513,
												Class98_Sub10_Sub38.anInt5761))));
					}
					Class146_Sub2.anIntArray4873 = new int[Class191.anInt1477
							* Class63.anInt493];
					Class230.anInt1732 = 1;
				}
				Class358.aBoolean3033 = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("no.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final byte[][][] method3392(final int i, final byte i_5_) {
		try {
			final byte[][][] is = new byte[8][4][];
			final int i_6_ = i;
			final int i_7_ = i;
			byte[] is_8_ = new byte[i_7_ * i_6_];
			int i_9_ = 0;
			for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_10_++) {
				for (int i_11_ = 0; i_11_ < i_6_; i_11_++) {
					if ((i_10_ ^ 0xffffffff) <= (i_11_ ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[0][0] = is_8_;
			is_8_ = new byte[i_7_ * i_6_];
			i_9_ = 0;
			for (int i_12_ = i_7_ - 1; i_12_ >= 0; i_12_--) {
				for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_13_++) {
					if (i_12_ >= i_13_) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[0][1] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_7_ * i_6_];
			for (int i_14_ = 0; i_14_ < i_7_; i_14_++) {
				for (int i_15_ = 0; (i_6_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
					if (i_14_ <= i_15_) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[0][2] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_7_ * i_6_];
			for (int i_16_ = -1 + i_7_; i_16_ >= 0; i_16_--) {
				for (int i_17_ = 0; i_6_ > i_17_; i_17_++) {
					if (i_17_ >= i_16_) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[0][3] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_7_ * i_6_];
			for (int i_18_ = i_7_ - 1; (i_18_ ^ 0xffffffff) <= -1; i_18_--) {
				for (int i_19_ = 0; i_6_ > i_19_; i_19_++) {
					if (i_18_ >> 637988225 >= i_19_) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[1][0] = is_8_;
			is_8_ = new byte[i_6_ * i_7_];
			i_9_ = 0;
			for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_20_++) {
				for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_21_++) {
					if ((i_9_ ^ 0xffffffff) > -1
							|| (i_9_ ^ 0xffffffff) <= (is_8_.length ^ 0xffffffff)) {
						i_9_++;
					} else {
						if ((i_21_ ^ 0xffffffff) <= (i_20_ << -973618751 ^ 0xffffffff)) {
							is_8_[i_9_] = (byte) -1;
						}
						i_9_++;
					}
				}
			}
			is[1][1] = is_8_;
			is_8_ = new byte[i_6_ * i_7_];
			i_9_ = 0;
			for (int i_22_ = 0; i_22_ < i_7_; i_22_++) {
				for (int i_23_ = -1 + i_6_; (i_23_ ^ 0xffffffff) <= -1; i_23_--) {
					if (i_23_ <= i_22_ >> -681409855) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[1][2] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_6_ * i_7_];
			for (int i_24_ = i_7_ - 1; (i_24_ ^ 0xffffffff) <= -1; i_24_--) {
				for (int i_25_ = -1 + i_6_; (i_25_ ^ 0xffffffff) <= -1; i_25_--) {
					if (i_25_ >= i_24_ << 632067009) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[1][3] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_7_ * i_6_];
			for (int i_26_ = i_7_ + -1; (i_26_ ^ 0xffffffff) <= -1; i_26_--) {
				for (int i_27_ = -1 + i_6_; (i_27_ ^ 0xffffffff) <= -1; i_27_--) {
					if ((i_27_ ^ 0xffffffff) >= (i_26_ >> 662025921 ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[2][0] = is_8_;
			is_8_ = new byte[i_7_ * i_6_];
			i_9_ = 0;
			for (int i_28_ = -1 + i_7_; i_28_ >= 0; i_28_--) {
				for (int i_29_ = 0; i_6_ > i_29_; i_29_++) {
					if ((i_29_ ^ 0xffffffff) <= (i_28_ << -1812059327 ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[2][1] = is_8_;
			is_8_ = new byte[i_6_ * i_7_];
			i_9_ = 0;
			for (int i_30_ = 0; i_7_ > i_30_; i_30_++) {
				for (int i_31_ = 0; i_6_ > i_31_; i_31_++) {
					if ((i_30_ >> 1049233889 ^ 0xffffffff) <= (i_31_ ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[2][2] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_6_ * i_7_];
			for (int i_32_ = 0; (i_7_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff); i_32_++) {
				for (int i_33_ = i_6_ - 1; i_33_ >= 0; i_33_--) {
					if ((i_33_ ^ 0xffffffff) <= (i_32_ << 1402682849 ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[2][3] = is_8_;
			is_8_ = new byte[i_6_ * i_7_];
			i_9_ = 0;
			for (int i_34_ = i_7_ - 1; i_34_ >= 0; i_34_--) {
				for (int i_35_ = 0; i_35_ < i_6_; i_35_++) {
					if ((i_34_ >> -87112031 ^ 0xffffffff) >= (i_35_ ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[3][0] = is_8_;
			is_8_ = new byte[i_6_ * i_7_];
			i_9_ = 0;
			for (int i_36_ = 0; i_36_ < i_7_; i_36_++) {
				for (int i_37_ = 0; i_6_ > i_37_; i_37_++) {
					if ((i_37_ ^ 0xffffffff) >= (i_36_ << -1040521279 ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[3][1] = is_8_;
			is_8_ = new byte[i_7_ * i_6_];
			i_9_ = 0;
			for (int i_38_ = 0; (i_7_ ^ 0xffffffff) < (i_38_ ^ 0xffffffff); i_38_++) {
				for (int i_39_ = -1 + i_6_; i_39_ >= 0; i_39_--) {
					if ((i_39_ ^ 0xffffffff) <= (i_38_ >> 826979297 ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[3][2] = is_8_;
			is_8_ = new byte[i_6_ * i_7_];
			i_9_ = 0;
			for (int i_40_ = i_7_ + -1; i_40_ >= 0; i_40_--) {
				for (int i_41_ = i_6_ - 1; (i_41_ ^ 0xffffffff) <= -1; i_41_--) {
					if (i_40_ << -687952063 >= i_41_) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[3][3] = is_8_;
			is_8_ = new byte[i_7_ * i_6_];
			i_9_ = 0;
			for (int i_42_ = i_7_ - 1; (i_42_ ^ 0xffffffff) <= -1; i_42_--) {
				for (int i_43_ = -1 + i_6_; i_43_ >= 0; i_43_--) {
					if (i_42_ >> -1221739007 <= i_43_) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[4][0] = is_8_;
			is_8_ = new byte[i_7_ * i_6_];
			i_9_ = 0;
			for (int i_44_ = i_7_ - 1; i_44_ >= 0; i_44_--) {
				for (int i_45_ = 0; i_6_ > i_45_; i_45_++) {
					if (i_45_ <= i_44_ << 573824577) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[4][1] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_7_ * i_6_];
			for (int i_46_ = 0; (i_7_ ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++) {
				for (int i_47_ = 0; i_6_ > i_47_; i_47_++) {
					if (i_47_ >= i_46_ >> -1550209439) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[4][2] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_7_ * i_6_];
			for (int i_48_ = 0; i_48_ < i_7_; i_48_++) {
				for (int i_49_ = -1 + i_6_; (i_49_ ^ 0xffffffff) <= -1; i_49_--) {
					if ((i_48_ << 1546929537 ^ 0xffffffff) <= (i_49_ ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[4][3] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_7_ * i_6_];
			for (int i_50_ = 0; (i_50_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_50_++) {
				for (int i_51_ = 0; (i_6_ ^ 0xffffffff) < (i_51_ ^ 0xffffffff); i_51_++) {
					if (i_6_ / 2 >= i_51_) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[5][0] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_6_ * i_7_];
			for (int i_52_ = 0; (i_7_ ^ 0xffffffff) < (i_52_ ^ 0xffffffff); i_52_++) {
				for (int i_53_ = 0; (i_53_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_53_++) {
					if (i_7_ / 2 >= i_52_) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[5][1] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_7_ * i_6_];
			for (int i_54_ = 0; (i_54_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff); i_54_++) {
				for (int i_55_ = 0; i_55_ < i_6_; i_55_++) {
					if (i_55_ >= i_6_ / 2) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[5][2] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_7_ * i_6_];
			for (int i_56_ = 0; (i_7_ ^ 0xffffffff) < (i_56_ ^ 0xffffffff); i_56_++) {
				for (int i_57_ = 0; (i_6_ ^ 0xffffffff) < (i_57_ ^ 0xffffffff); i_57_++) {
					if (i_56_ >= i_7_ / 2) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[5][3] = is_8_;
			is_8_ = new byte[i_6_ * i_7_];
			i_9_ = 0;
			for (int i_58_ = 0; i_7_ > i_58_; i_58_++) {
				for (int i_59_ = 0; (i_59_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_59_++) {
					if ((i_59_ ^ 0xffffffff) >= (i_58_ + -(i_7_ / 2) ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[6][0] = is_8_;
			is_8_ = new byte[i_7_ * i_6_];
			i_9_ = 0;
			for (int i_60_ = -1 + i_7_; i_60_ >= 0; i_60_--) {
				for (int i_61_ = 0; (i_6_ ^ 0xffffffff) < (i_61_ ^ 0xffffffff); i_61_++) {
					if ((i_61_ ^ 0xffffffff) >= (i_60_ - i_7_ / 2 ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[6][1] = is_8_;
			is_8_ = new byte[i_6_ * i_7_];
			i_9_ = 0;
			for (int i_62_ = i_7_ + -1; (i_62_ ^ 0xffffffff) <= -1; i_62_--) {
				for (int i_63_ = i_6_ + -1; i_63_ >= 0; i_63_--) {
					if ((i_63_ ^ 0xffffffff) >= (-(i_7_ / 2) + i_62_ ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[6][2] = is_8_;
			is_8_ = new byte[i_7_ * i_6_];
			i_9_ = 0;
			for (int i_64_ = 0; (i_7_ ^ 0xffffffff) < (i_64_ ^ 0xffffffff); i_64_++) {
				for (int i_65_ = -1 + i_6_; (i_65_ ^ 0xffffffff) <= -1; i_65_--) {
					if ((i_65_ ^ 0xffffffff) >= (-(i_7_ / 2) + i_64_ ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[6][3] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_6_ * i_7_];
			for (int i_66_ = 0; i_7_ > i_66_; i_66_++) {
				for (int i_67_ = 0; i_6_ > i_67_; i_67_++) {
					if ((i_67_ ^ 0xffffffff) <= (i_66_ - i_7_ / 2 ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[7][0] = is_8_;
			is_8_ = new byte[i_6_ * i_7_];
			i_9_ = 0;
			for (int i_68_ = -1 + i_7_; i_68_ >= 0; i_68_--) {
				for (int i_69_ = 0; i_69_ < i_6_; i_69_++) {
					if ((i_68_ - i_7_ / 2 ^ 0xffffffff) >= (i_69_ ^ 0xffffffff)) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[7][1] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_6_ * i_7_];
			for (int i_71_ = -1 + i_7_; i_71_ >= 0; i_71_--) {
				for (int i_72_ = i_6_ - 1; (i_72_ ^ 0xffffffff) <= -1; i_72_--) {
					if (i_72_ >= -(i_7_ / 2) + i_71_) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[7][2] = is_8_;
			i_9_ = 0;
			is_8_ = new byte[i_7_ * i_6_];
			for (int i_73_ = 0; i_7_ > i_73_; i_73_++) {
				for (int i_74_ = -1 + i_6_; i_74_ >= 0; i_74_--) {
					if (-(i_7_ / 2) + i_73_ <= i_74_) {
						is_8_[i_9_] = (byte) -1;
					}
					i_9_++;
				}
			}
			is[7][3] = is_8_;
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "no.E(" + i + ','
					+ i_5_ + ')');
		}
	}

	@Override
	public final int method19(final int i) {
		try {
			if (i != -22132) {
				return 118;
			}
			return ((Class287) this).anInt2191;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "no.B(" + i + ')');
		}
	}

	@Override
	public final int method21(final int i) {
		try {
			if (i != 5061) {
				aString3272 = null;
			}
			return anInt3271;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "no.A(" + i + ')');
		}
	}

	Class287_Sub2(final ha_Sub1 var_ha_Sub1, final int i, final byte[] is,
			final int i_75_, final boolean bool) {
		super(var_ha_Sub1, 34963, is, i_75_, bool);
		try {
			anInt3271 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("no.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_75_ + ','
					+ bool + ')'));
		}
	}

	@Override
	public final void method20(final byte i, final byte[] is, final int i_76_,
			final int i_77_) {
		try {
			if (i != -47) {
				aClass171_3270 = null;
			}
			method3389(0, i_76_, is);
			anInt3271 = i_77_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("no.H(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_76_ + ','
					+ i_77_ + ')'));
		}
	}

	static final void method3393(final boolean bool, final int i,
			final int i_78_, final byte i_79_, final boolean bool_80_) {
		do {
			try {
				Class348.method3836(i, 0,
						(Class98_Sub28_Sub1.aClass53_Sub1Array5805).length - 1,
						i_78_, bool_80_, bool, (byte) 91);
				Class98_Sub9.anInt3854 = 0;
				Class220.aClass98_Sub4_1657 = null;
				if (i_79_ == 82) {
					break;
				}
				aClass171_3270 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("no.C(" + bool + ',' + i + ',' + i_78_ + ',' + i_79_
								+ ',' + bool_80_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method3394(final int i) {
		try {
			aString3272 = null;
			aClass171_3270 = null;
			aClass332Array3275 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "no.G(" + i + ')');
		}
	}

	@Override
	final void method3384(final int i) {
		do {
			try {
				((Class287) this).aHa_Sub1_2185.method1830(this, 2936);
				if (i == 0) {
					break;
				}
				method3394(30);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "no.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
