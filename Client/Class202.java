/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class202 {
	private ha_Sub1 aHa_Sub1_1546;
	static Class110 aClass110_1547;
	static boolean aBoolean1548 = false;
	int anInt1549;
	static Class308 aClass308_1550;

	static final void method2698(final byte i, int i_0_, final int i_1_,
			int i_2_, final int i_3_) {
		try {
			final float f = (float) Class278.anInt2084
					/ (float) Class278.anInt2089;
			int i_4_ = i_1_;
			if (i < 47) {
				method2700(43, null, true, -10, null);
			}
			int i_5_ = i_3_;
			do {
				if (!(f < 1.0F)) {
					i_4_ = (int) (i_3_ / f);
					if (!client.aBoolean3553) {
						break;
					}
				}
				i_5_ = (int) (i_1_ * f);
			} while (false);
			i_0_ -= (i_3_ + -i_5_) / 2;
			i_2_ -= (-i_4_ + i_1_) / 2;
			Class98_Sub40.anInt4197 = Class278.anInt2084
					+ -(i_0_ * Class278.anInt2084 / i_5_);
			Class169.anInt1307 = -1;
			Class101.anInt849 = -1;
			Class42_Sub4.anInt5371 = i_2_ * Class278.anInt2089 / i_4_;
			aa_Sub1.method155(-1);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ne.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	@Override
	protected final void finalize() throws Throwable {
		try {
			aHa_Sub1_1546.method1872(anInt1549, 2834);
			super.finalize();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					"ne.finalize(" + ')');
		}
	}

	public static void method2699(final byte i) {
		try {
			if (i == 44) {
				aClass110_1547 = null;
				aClass308_1550 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ne.B(" + i + ')');
		}
	}

	static final int method2700(final int i, final Class53_Sub1 class53_sub1,
			final boolean bool, final int i_6_,
			final Class53_Sub1 class53_sub1_7_) {
		try {
			if ((i ^ 0xffffffff) == -2) {
				int i_8_ = ((Class53) class53_sub1).anInt429;
				int i_9_ = ((Class53) class53_sub1_7_).anInt429;
				if (!bool) {
					if ((i_9_ ^ 0xffffffff) == 0) {
						i_9_ = 2001;
					}
					if ((i_8_ ^ 0xffffffff) == 0) {
						i_8_ = 2001;
					}
				}
				return i_8_ - i_9_;
			}
			if ((i ^ 0xffffffff) == -3) {
				return (Class336.method3772(
						class53_sub1.method501(i_6_).aString957,
						class53_sub1_7_.method501(-1).aString957,
						Class374.anInt3159, 1166845806));
			}
			if ((i ^ 0xffffffff) == -4) {
				if (!class53_sub1.aString3630.equals("-")) {
					if (class53_sub1_7_.aString3630.equals("-")) {
						if (bool) {
							return 1;
						}
						return -1;
					}
				} else {
					if (class53_sub1_7_.aString3630.equals("-")) {
						return 0;
					}
					if (bool) {
						return -1;
					}
					return 1;
				}
				return Class336.method3772((class53_sub1.aString3630),
						(class53_sub1_7_.aString3630), Class374.anInt3159,
						1166845806);
			}
			if ((i ^ 0xffffffff) == -5) {
				if (!class53_sub1.method495((byte) 122)) {
					if (class53_sub1_7_.method495((byte) 127)) {
						return -1;
					}
					return 0;
				}
				if (!class53_sub1_7_.method495((byte) 122)) {
					return 1;
				}
				return 0;
			}
			if (i == 5) {
				if (class53_sub1.method493(9811)) {
					if (class53_sub1_7_.method493(9811)) {
						return 0;
					}
					return 1;
				}
				if (class53_sub1_7_.method493(9811)) {
					return -1;
				}
				return 0;
			}
			if ((i ^ 0xffffffff) == -7) {
				if (class53_sub1.method496((byte) 72)) {
					if (!class53_sub1_7_.method496((byte) 90)) {
						return 1;
					}
					return 0;
				}
				if (class53_sub1_7_.method496((byte) 60)) {
					return -1;
				}
				return 0;
			}
			if (i_6_ != -1) {
				method2700(-89, null, true, -108, null);
			}
			if ((i ^ 0xffffffff) == -8) {
				if (!class53_sub1.method497(false)) {
					if (class53_sub1_7_.method497(false)) {
						return -1;
					}
					return 0;
				}
				if (class53_sub1_7_.method497(false)) {
					return 0;
				}
				return 1;
			}
			if ((i ^ 0xffffffff) == -9) {
				int i_10_ = class53_sub1.anInt3631;
				int i_11_ = class53_sub1_7_.anInt3631;
				do {
					if (!bool) {
						if (i_10_ == -1) {
							i_10_ = 1000;
						}
						if (i_11_ != -1) {
							break;
						}
						i_11_ = 1000;
						if (!client.aBoolean3553) {
							break;
						}
					}
					if ((i_11_ ^ 0xffffffff) == -1001) {
						i_11_ = -1;
					}
					if (i_10_ == 1000) {
						i_10_ = -1;
					}
				} while (false);
				return -i_11_ + i_10_;
			}
			return (class53_sub1.anInt3632 - class53_sub1_7_.anInt3632);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ne.F(" + i + ','
					+ (class53_sub1 != null ? "{...}" : "null") + ',' + bool
					+ ',' + i_6_ + ','
					+ (class53_sub1_7_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2701(int i, final int i_12_, final ha var_ha,
			int i_13_, final byte i_14_, final int i_15_) {
		do {
			try {
				var_ha.KA(i, i_13_, i + i_12_, i_15_ + i_13_);
				var_ha.method1760(i_12_, i_15_, i_13_, -16777216, (byte) -66, i);
				if ((Class212.anInt1600 ^ 0xffffffff) <= -101) {
					final float f = ((float) Class278.anInt2084 / (float) Class278.anInt2089);
					int i_16_ = i_12_;
					int i_17_ = i_15_;
					if (!(f < 1.0F)) {
						i_16_ = (int) (i_15_ / f);
					} else {
						i_17_ = (int) (i_12_ * f);
					}
					i += (i_12_ - i_16_) / 2;
					i_13_ += (-i_17_ + i_15_) / 2;
					if (Class152.aClass332_1221 == null
							|| Class152.aClass332_1221.method3734() != i_12_
							|| i_15_ != Class152.aClass332_1221.method3731()) {
						Class278.method3308(Class278.anInt2075,
								(Class278.anInt2078 + Class278.anInt2084),
								(Class278.anInt2089 + Class278.anInt2075),
								Class278.anInt2078, i, i_13_, i - -i_16_, i_17_
										+ i_13_);
						Class278.method3309(var_ha);
						Class152.aClass332_1221 = var_ha.method1797(i, i_13_,
								i_16_, i_17_, false);
					}
					if (i_14_ == -90) {
						Class152.aClass332_1221.method3735(i, i_13_);
						final int i_18_ = i_16_ * aa.anInt48
								/ Class278.anInt2089;
						final int i_19_ = (Class246_Sub3_Sub5_Sub2.anInt6268
								* i_17_ / Class278.anInt2084);
						final int i_20_ = (Class166.anInt1279 * i_16_
								/ Class278.anInt2089 + i);
						final int i_21_ = (-i_19_
								+ -(Class231.anInt1739 * i_17_ / Class278.anInt2084) + (i_17_ + i_13_));
						int i_22_ = -1996554240;
						if (Class4.aClass279_86 == Class64_Sub2.aClass279_3643) {
							i_22_ = -1996488705;
						}
						var_ha.aa(i_20_, i_21_, i_18_, i_19_, i_22_, 1);
						var_ha.method1779(i_20_, i_21_, i_18_, i_19_, i_22_, 0);
						if (Class64_Sub25.anInt3711 <= 0) {
							break;
						}
						int i_23_;
						if (Class287.anInt2186 <= 50) {
							i_23_ = 5 * Class287.anInt2186;
						} else {
							i_23_ = -(Class287.anInt2186 * 5) + 500;
						}
						for (Class98_Sub47 class98_sub47 = ((Class98_Sub47) Class278.aClass148_2065
								.method2418(32)); class98_sub47 != null; class98_sub47 = ((Class98_Sub47) Class278.aClass148_2065
								.method2417(105))) {
							final Class24 class24 = (Class278.aClass341_2057
									.method3807(117, (class98_sub47.anInt4268)));
							if (Surface.method855(i_14_ + 215, class24)) {
								if (Class98_Sub5_Sub2.anInt5536 == (class98_sub47.anInt4268)) {
									final int i_24_ = i
											+ (i_16_ * class98_sub47.anInt4272 / Class278.anInt2089);
									final int i_25_ = (i_13_ - -((-class98_sub47.anInt4267 + Class278.anInt2084)
											* i_17_ / Class278.anInt2084));
									var_ha.method1760(4, 4, -2 + i_25_,
											(i_23_ << 2063784920 | 0xffff00),
											(byte) -66, i_24_ + -2);
								} else if (((Class256.anInt1945 ^ 0xffffffff) != 0)
										&& ((Class256.anInt1945 ^ 0xffffffff) == (class24.anInt246 ^ 0xffffffff))) {
									final int i_26_ = ((i_16_
											* (class98_sub47.anInt4272) / Class278.anInt2089) + i);
									final int i_27_ = ((i_17_
											* (Class278.anInt2084 + -class98_sub47.anInt4267) / Class278.anInt2084) + i_13_);
									var_ha.method1760(4, 4, -2 + i_27_,
											(0xffff00 | i_23_ << 1169738168),
											(byte) -66, -2 + i_26_);
								}
							}
						}
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ne.E(" + i
						+ ',' + i_12_ + ','
						+ (var_ha != null ? "{...}" : "null") + ',' + i_13_
						+ ',' + i_14_ + ',' + i_15_ + ')'));
			}
			break;
		} while (false);
	}

	static int method2702(final int i, final int i_28_) {
		try {
			return i & i_28_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ne.C(" + i + ','
					+ i_28_ + ')');
		}
	}

	static final void method2703(final boolean bool) {
		do {
			try {
				if (Class88.aString696.toLowerCase().indexOf("microsoft") != -1) {
					Surface.anIntArray667[192] = 58;
					Surface.anIntArray667[191] = 73;
					Surface.anIntArray667[220] = 74;
					Surface.anIntArray667[221] = 43;
					Surface.anIntArray667[188] = 71;
					Surface.anIntArray667[190] = 72;
					Surface.anIntArray667[189] = 26;
					Surface.anIntArray667[223] = 28;
					Surface.anIntArray667[187] = 27;
					Surface.anIntArray667[219] = 42;
					Surface.anIntArray667[222] = 59;
					Surface.anIntArray667[186] = 57;
				} else {
					Surface.anIntArray667[45] = 26;
					Surface.anIntArray667[92] = 74;
					Surface.anIntArray667[46] = 72;
					Surface.anIntArray667[59] = 57;
					Surface.anIntArray667[47] = 73;
					Surface.anIntArray667[91] = 42;
					if (Class88.aMethod700 != null) {
						Surface.anIntArray667[222] = 58;
						Surface.anIntArray667[520] = 59;
						Surface.anIntArray667[192] = 28;
					} else {
						Surface.anIntArray667[222] = 59;
						Surface.anIntArray667[192] = 58;
					}
					Surface.anIntArray667[61] = 27;
					Surface.anIntArray667[93] = 43;
					Surface.anIntArray667[44] = 71;
				}
				if (bool == false) {
					break;
				}
				method2700(-70, null, false, 0, null);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ne.D(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	Class202(final ha_Sub1 var_ha_Sub1, final int i, final int i_29_) {
		try {
			aHa_Sub1_1546 = var_ha_Sub1;
			anInt1549 = i_29_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ne.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_29_ + ')'));
		}
	}
}
