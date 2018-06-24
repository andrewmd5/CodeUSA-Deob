/* Class246_Sub3_Sub4_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub4_Sub4 extends Class246_Sub3_Sub4 {
	private AnimationDefinition aClass97_6459;
	private int anInt6460;
	private int anInt6461;
	private double aDouble6462;
	int anInt6463;
	private double aDouble6464;
	private int anInt6465 = 0;
	int anInt6466;
	private int anInt6467;
	private int anInt6468;
	private int anInt6469;
	private int anInt6470;
	private boolean aBoolean6471 = false;
	private double aDouble6472;
	private boolean aBoolean6473;
	private int anInt6474;
	private int anInt6475;
	private double aDouble6476;
	private int anInt6477;
	private double aDouble6478;
	int anInt6479;
	private double aDouble6480;
	private boolean aBoolean6481;
	int anInt6482;
	private double aDouble6483;
	private int anInt6484;
	private int anInt6485;
	private int anInt6486;
	static IncomingOpcode aClass58_6487 = new IncomingOpcode(112, 6);
	static int anInt6488;
	private Class246_Sub5 aClass246_Sub5_6489;
	private double aDouble6490;

	@Override
	final void method2988(final ha var_ha, final int i) {
		try {
			final AbstractModel abstractModel = method3081((byte) -96, 0, var_ha);
			if (abstractModel != null) {
				final Class111 class111 = var_ha.method1793();
				class111.method2107(anInt6474);
				class111.method2097(anInt6468);
				class111.method2106((int) aDouble6472, (int) aDouble6490,
						(int) aDouble6462);
				anInt6484 = abstractModel.fa();
				anInt6460 = abstractModel.ma();
				method3076(class111, var_ha, abstractModel, (byte) 74);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rk.MA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final Class228 method2974(final byte i, final ha var_ha) {
		try {
			if (i != -53) {
				method3074(-62, -24, -14, (byte) -98, -63);
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rk.KA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method2992(final byte i) {
		try {
			if (i != -73) {
				anInt6463 = -41;
			}
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rk.DA(" + i + ')');
		}
	}

	@Override
	final int method2990(final int i) {
		try {
			if (i != 0) {
				method2988(null, 60);
			}
			return anInt6484;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rk.J(" + i + ')');
		}
	}

	final void method3074(final int i, final int i_1_, final int i_2_,
			final byte i_3_, final int i_4_) {
		do {
			try {
				if (!aBoolean6481) {
					final double d = -((Class246_Sub3) this).anInt5084 + i;
					final double d_5_ = i_4_
							+ -((Class246_Sub3) this).anInt5079;
					final double d_6_ = Math.sqrt(d * d + d_5_ * d_5_);
					aDouble6462 = (((Class246_Sub3) this).anInt5079 + anInt6467
							* d_5_ / d_6_);
					aDouble6472 = (((Class246_Sub3) this).anInt5084 + d
							* anInt6467 / d_6_);
					if (aBoolean6473) {
						aDouble6490 = (Class98_Sub46_Sub2_Sub2.method1538(
								((Class246_Sub3) this).aByte5088,
								(int) aDouble6462, (int) aDouble6472, 24111))
								- anInt6461;
					} else {
						aDouble6490 = ((Class246_Sub3) this).anInt5089;
					}
				}
				final double d = -i_2_ + 1 + anInt6466;
				aDouble6483 = (i_4_ - aDouble6462) / d;
				aDouble6464 = (-aDouble6472 + i) / d;
				aDouble6478 = Math.sqrt(aDouble6483 * aDouble6483 + aDouble6464
						* aDouble6464);
				if (anInt6475 == -1) {
					aDouble6480 = (i_1_ - aDouble6490) / d;
				} else {
					if (!aBoolean6481) {
						aDouble6480 = (-aDouble6478 * Math
								.tan(anInt6475 * 0.02454369));
					}
					aDouble6476 = 2.0 * (i_1_ - aDouble6490 - aDouble6480 * d)
							/ (d * d);
				}
				if (i_3_ == 108) {
					break;
				}
				anInt6475 = 74;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("rk.NA(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_
								+ ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final int method2985(final boolean bool) {
		try {
			if (bool != false) {
				method2976(115, null, (byte) -18, -25);
			}
			return anInt6460;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rk.O(" + bool
					+ ')');
		}
	}

	final void method3075(final int i, final int i_7_) {
		do {
			try {
				aDouble6462 += i_7_ * aDouble6483;
				aDouble6472 += aDouble6464 * i_7_;
				aBoolean6481 = true;
				if (!aBoolean6473) {
					if ((anInt6475 ^ 0xffffffff) != 0) {
						aDouble6490 += (i_7_ * (i_7_ * (aDouble6476 * 0.5)) + i_7_
								* aDouble6480);
						aDouble6480 += i_7_ * aDouble6476;
					} else {
						aDouble6490 += aDouble6480 * i_7_;
					}
				} else {
					aDouble6490 = (Class98_Sub46_Sub2_Sub2.method1538(
							((Class246_Sub3) this).aByte5088,
							(int) aDouble6462, (int) aDouble6472, i + 34573))
							+ -anInt6461;
				}
				if (i == -10462) {
					anInt6468 = 8192 + (int) (2607.5945876176133 * Math.atan2(
							aDouble6464, aDouble6483)) & 0x3fff;
					anInt6474 = ((int) (2607.5945876176133 * Math.atan2(
							aDouble6480, aDouble6478)) & 0x3fff);
					if (aClass97_6459 == null) {
						break;
					}
					anInt6477 += i_7_;
					while ((aClass97_6459.anIntArray811[anInt6465] ^ 0xffffffff) > (anInt6477 ^ 0xffffffff)) {
						anInt6477 -= (aClass97_6459.anIntArray811[anInt6465]);
						anInt6465++;
						if (anInt6465 >= (aClass97_6459.anIntArray818).length) {
							anInt6465 -= aClass97_6459.anInt828;
							if (anInt6465 < 0
									|| anInt6465 >= (aClass97_6459.anIntArray818).length) {
								anInt6465 = 0;
							}
						}
						anInt6469 = anInt6465 - -1;
						if (aClass97_6459.anIntArray818.length <= anInt6469) {
							anInt6469 -= aClass97_6459.anInt828;
							if (anInt6469 < 0
									|| anInt6469 >= (aClass97_6459.anIntArray818).length) {
								anInt6469 = -1;
							}
						}
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "rk.VA(" + i
						+ ',' + i_7_ + ')');
			}
			break;
		} while (false);
	}

	private final void method3076(final Class111 class111, final ha var_ha,
			final AbstractModel abstractModel, final byte i) {
		do {
			try {
				abstractModel.method2343(class111);
				final Surface[] class87s = abstractModel.method2320();
				final SurfaceSkin[] class35s = abstractModel.method2322();
				if ((aClass246_Sub5_6489 == null || aClass246_Sub5_6489.aBoolean5099)
						&& (class87s != null || class35s != null)) {
					aClass246_Sub5_6489 = Class246_Sub5.method3117(
							Class215.anInt1614, true);
				}
				if (aClass246_Sub5_6489 == null) {
					break;
				}
				aClass246_Sub5_6489.method3120(var_ha, Class215.anInt1614,
						class87s, class35s, false);
				aClass246_Sub5_6489.method3123(
						((Class246_Sub3) this).aByte5088,
						((Class246_Sub3_Sub4) this).aShort6158,
						((Class246_Sub3_Sub4) this).aShort6160,
						((Class246_Sub3_Sub4) this).aShort6157,
						((Class246_Sub3_Sub4) this).aShort6159);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("rk.RA(" + (class111 != null ? "{...}" : "null") + ','
								+ (var_ha != null ? "{...}" : "null") + ','
								+ (abstractModel != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	public static void method3077(final byte i) {
		do {
			try {
				aClass58_6487 = null;
				if (i == -29) {
					break;
				}
				method3077((byte) 73);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "rk.SA(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method3078(final int i) {
		do {
			try {
				if (i != -6095) {
					method3077((byte) -55);
				}
				if (aClass246_Sub5_6489 == null) {
					break;
				}
				aClass246_Sub5_6489.method3114();
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "rk.PA(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method3079(final byte i, final Class207 class207,
			final int i_9_, final Class207 class207_10_) {
		try {
			Class64_Sub15.aClass207_3679 = class207_10_;
			Class64_Sub2.aClass207_3644 = class207;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rk.JA(" + i + ','
					+ (class207 != null ? "{...}" : "null") + ',' + i_9_ + ','
					+ (class207_10_ != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final boolean method2982(final byte i) {
		try {
			if (i > -70) {
				method3078(-85);
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rk.HA(" + i + ')');
		}
	}

	@Override
	final boolean method2978(final int i) {
		try {
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rk.H(" + i + ')');
		}
	}

	Class246_Sub3_Sub4_Sub4(final int i, final int i_13_, final int i_14_,
			final int i_15_, final int i_16_, final int i_17_, final int i_18_,
			final int i_19_, final int i_20_, final int i_21_, final int i_22_,
			final int i_23_, final int i_24_, final boolean bool,
			final int i_25_) {
		super(i_13_, i_14_, i_15_, -i_17_
				+ Class98_Sub46_Sub2_Sub2
						.method1538(i_13_, i_16_, i_15_, 24111), i_16_,
				i_15_ >> 1293743369, i_15_ >> -108544983, i_16_ >> -860505271,
				i_16_ >> 1727487849, false, (byte) 0);
		anInt6460 = 0;
		anInt6469 = -1;
		aBoolean6481 = false;
		anInt6477 = 0;
		anInt6484 = 0;
		try {
			anInt6461 = i_17_;
			anInt6475 = i_20_;
			anInt6467 = i_21_;
			anInt6485 = i;
			aBoolean6481 = false;
			anInt6463 = i_24_;
			anInt6479 = i_18_;
			anInt6482 = i_23_;
			anInt6466 = i_19_;
			anInt6470 = i_22_;
			aBoolean6473 = bool;
			anInt6486 = i_25_;
			final int i_26_ = (Class196.aClass304_1509.method3564(2, anInt6485).anInt910);
			if (i_26_ != -1) {
				aClass97_6459 = Class151_Sub7.aClass183_5001.method2623(i_26_,
						16383);
			} else {
				aClass97_6459 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rk.<init>(" + i
					+ ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_
					+ ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_
					+ ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_
					+ ',' + bool + ',' + i_25_ + ')'));
		}
	}

	@Override
	final boolean method2976(final int i, final ha var_ha, final byte i_27_,
			final int i_28_) {
		try {
			if (i_27_ < 59) {
				aBoolean6471 = false;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rk.TA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_27_ + ','
					+ i_28_ + ')'));
		}
	}

	final void method3080(final byte i) {
		do {
			try {
				if (!aBoolean6481) {
					if (i < 72) {
						anInt6485 = -118;
					}
					if ((anInt6470 ^ 0xffffffff) == -1) {
						break;
					}
					Entity class246_sub3_sub4_sub2 = null;
					if (anInt6470 < 0) {
						final int i_29_ = -anInt6470 + -1;
						if ((za_Sub2.anInt6080 ^ 0xffffffff) == (i_29_ ^ 0xffffffff)) {
							class246_sub3_sub4_sub2 = Surface.player;
						} else {
							class246_sub3_sub4_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_29_]);
						}
					} else {
						final int i_30_ = -1 + anInt6470;
						final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
								.method3990(i_30_, -1));
						if (class98_sub39 != null) {
							class246_sub3_sub4_sub2 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
						}
					}
					if (class246_sub3_sub4_sub2 == null) {
						break;
					}
					((Class246_Sub3) this).anInt5084 = ((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084;
					((Class246_Sub3) this).anInt5079 = ((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079;
					((Class246_Sub3) this).anInt5089 = (Class98_Sub46_Sub2_Sub2
							.method1538(
									((Class246_Sub3) this).aByte5088,
									(((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079),
									(((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084),
									24111))
							- anInt6461;
					if (anInt6486 < 0) {
						break;
					}
					final Class294 class294 = class246_sub3_sub4_sub2
							.method3039(1);
					int i_31_ = 0;
					int i_32_ = 0;
					if (class294.anIntArrayArray2366 != null
							&& (class294.anIntArrayArray2366[anInt6486]) != null) {
						i_31_ += (class294.anIntArrayArray2366[anInt6486][0]);
						i_32_ += (class294.anIntArrayArray2366[anInt6486][2]);
					}
					if (class294.anIntArrayArray2364 != null
							&& (class294.anIntArrayArray2364[anInt6486]) != null) {
						i_32_ += (class294.anIntArrayArray2364[anInt6486][2]);
						i_31_ += (class294.anIntArrayArray2364[anInt6486][0]);
					}
					if ((i_31_ ^ 0xffffffff) != -1 || i_32_ != 0) {
						final int i_33_ = class246_sub3_sub4_sub2.aClass325_6399
								.method3698((byte) 116);
						int i_34_ = i_33_;
						if (class246_sub3_sub4_sub2.anIntArray6370 != null
								&& (class246_sub3_sub4_sub2.anIntArray6370[anInt6486]) != -1) {
							i_34_ = (class246_sub3_sub4_sub2.anIntArray6370[anInt6486]);
						}
						final int i_35_ = 0x3fff & -i_33_ + i_34_;
						final int i_36_ = Class284_Sub2_Sub2.anIntArray6200[i_35_];
						final int i_37_ = Class284_Sub2_Sub2.anIntArray6202[i_35_];
						final int i_38_ = i_32_ * i_36_ + i_37_ * i_31_ >> 1205179214;
						i_32_ = i_37_ * i_32_ + -(i_36_ * i_31_) >> -1374485746;
						i_31_ = i_38_;
						((Class246_Sub3) this).anInt5084 += i_31_;
						((Class246_Sub3) this).anInt5079 += i_32_;
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "rk.OA(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	private final AbstractModel method3081(final byte i, final int i_39_,
			final ha var_ha) {
		try {
			if (i != -96) {
				method2981(null, (byte) -125, false, -13, null, 78, -34);
			}
			final Class107 class107 = Class196.aClass304_1509.method3564(2,
					anInt6485);
			return class107.method1728(anInt6465, Class151_Sub7.aClass183_5001,
					i_39_, anInt6477, (byte) -94, anInt6469, var_ha);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rk.LA(" + i + ','
					+ i_39_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final boolean method2987(final int i) {
		try {
			if (i != 6540) {
				anInt6470 = 62;
			}
			return aBoolean6471;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rk.I(" + i + ')');
		}
	}

	static final int method3082(final int i, final int i_40_, final int i_41_) {
		try {
			int i_42_ = (-128
					+ Class98_Sub5_Sub3.method971(45365 + i_41_, 91923 + i,
							i_40_, i_40_ + -91) - (-(Class98_Sub5_Sub3
					.method971(i_41_ + 10294, 37821 + i, 2, i_40_ + -98) + -128 >> 1334886049) - (Class98_Sub5_Sub3
					.method971(i_41_, i, 1, -48) - 128 >> -872292894)));
			i_42_ = (int) (i_42_ * 0.3) - -35;
			do {
				if ((i_42_ ^ 0xffffffff) <= -11) {
					if ((i_42_ ^ 0xffffffff) >= -61) {
						break;
					}
					i_42_ = 60;
					if (!client.aBoolean3553) {
						break;
					}
				}
				i_42_ = 10;
			} while (false);
			return i_42_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rk.UA(" + i + ','
					+ i_40_ + ',' + i_41_ + ')'));
		}
	}

	@Override
	final void method3022(final int i) {
		try {
			((Class246_Sub3_Sub4) this).aShort6157 = ((Class246_Sub3_Sub4) this).aShort6159 = (short) (int) (aDouble6462 / 512.0);
			if (i != -8675) {
				aDouble6480 = 0.42551889851769525;
			}
			((Class246_Sub3_Sub4) this).aShort6158 = ((Class246_Sub3_Sub4) this).aShort6160 = (short) (int) (aDouble6472 / 512.0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rk.F(" + i + ')');
		}
	}

	@Override
	final void method2981(final Class246_Sub3 class246_sub3, final byte i,
			final boolean bool, final int i_43_, final ha var_ha,
			final int i_44_, final int i_45_) {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rk.CA("
					+ (class246_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + bool + ',' + i_43_ + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_44_ + ','
					+ i_45_ + ')'));
		}
	}

	@Override
	protected final void finalize() {
		try {
			if (aClass246_Sub5_6489 != null) {
				aClass246_Sub5_6489.method3114();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					"rk.finalize(" + ')');
		}
	}

	@Override
	final Class246_Sub1 method2975(final ha var_ha, final int i) {
		try {
			final AbstractModel abstractModel = method3081((byte) -96, 2048, var_ha);
			if (abstractModel == null) {
				return null;
			}
			final Class111 class111 = var_ha.method1793();
			class111.method2107(anInt6474);
			class111.method2097(anInt6468);
			class111.method2106((int) aDouble6472, (int) aDouble6490,
					(int) aDouble6462);
			method3076(class111, var_ha, abstractModel, (byte) -74);
			final Class246_Sub1 class246_sub1 = Class94.method915(1,
					(byte) -47, false);
			if (!Class239.aBoolean1839) {
				abstractModel.method2325(class111,
						(class246_sub1.aClass246_Sub6Array5067[0]), 0);
			} else {
				abstractModel.method2329(class111,
						(class246_sub1.aClass246_Sub6Array5067[0]),
						Class16.anInt197, 0);
			}
			if (aClass246_Sub5_6489 != null) {
				final Class242 class242 = aClass246_Sub5_6489.method3116();
				if (!Class239.aBoolean1839) {
					var_ha.method1820(class242);
				} else {
					var_ha.method1785(class242, Class16.anInt197);
				}
			}
			if (i > -12) {
				aDouble6476 = 0.3831954713971479;
			}
			aBoolean6471 = abstractModel.F();
			anInt6484 = abstractModel.fa();
			anInt6460 = abstractModel.ma();
			return class246_sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rk.QA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
