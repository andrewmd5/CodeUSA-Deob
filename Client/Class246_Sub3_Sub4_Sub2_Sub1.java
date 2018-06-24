/* Class246_Sub3_Sub4_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub4_Sub2_Sub1 extends Entity {
	static int anInt6500 = -1;
	int anInt6501 = 1;
	Class40 aClass40_6502;
	int anInt6503 = 1;
	NPC aClass141_6504;
	int anInt6505 = -1;
	static OutgoingOpcode aClass171_6506 = new OutgoingOpcode(5, 2);
	static String aString6507;
	static Class332 aClass332_6508;
	static int anInt6509;
	int anInt6510 = -1;
	static int anInt6511;

	@Override
	final void method2988(final ha var_ha, final int i) {
		try {
			if (aClass141_6504 != null
					&& (((Entity) this).aBoolean6440 || method3048(
							var_ha, 255, 0))) {
				final Class111 class111 = var_ha.method1793();
				class111.method2101(((Entity) this).aClass325_6399
						.method3698((byte) 116));
				class111.method2106(((Class246_Sub3) this).anInt5084,
						((Class246_Sub3) this).anInt5089 - 20,
						((Class246_Sub3) this).anInt5079);
				method3036(var_ha,
						((Entity) this).aBoolean6440,
						(byte) -119, class111,
						(((Entity) this).aClass146Array6441));
				((Entity) this).aClass146Array6441[0] = ((Entity) this).aClass146Array6441[1] = ((Entity) this).aClass146Array6441[2] = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("cea.MA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final boolean method3048(final ha var_ha, final int i, int i_1_) {
		try {
			final int i_2_ = i_1_;
			final Class294 class294 = method3039(1);
			if (i != 255) {
				aString6507 = null;
			}
			final AnimationDefinition class97 = ((((Entity) this).anInt6413 != -1 && (((Entity) this).anInt6400 ^ 0xffffffff) == -1) ? (Class151_Sub7.aClass183_5001
					.method2623(((Entity) this).anInt6413,
							i ^ 0x3f00)) : null);
			final AnimationDefinition class97_3_ = ((((((Entity) this).anInt6385 ^ 0xffffffff) == 0) || (((Entity) this).aBoolean6359 && class97 != null)) ? null
					: (Class151_Sub7.aClass183_5001.method2623(
							((Entity) this).anInt6385, 16383)));
			final int i_4_ = class294.anInt2362;
			final int i_5_ = class294.anInt2382;
			if ((i_4_ ^ 0xffffffff) != -1 || (i_5_ ^ 0xffffffff) != -1
					|| (class294.anInt2393 ^ 0xffffffff) != -1
					|| class294.anInt2363 != 0) {
				i_1_ |= 0x7;
			}
			final boolean bool = ((((Entity) this).aByte6422 ^ 0xffffffff) != -1
					&& (Class215.anInt1614 >= ((Entity) this).anInt6403) && ((Class215.anInt1614 ^ 0xffffffff) > (((Entity) this).anInt6349 ^ 0xffffffff)));
			if (bool) {
				i_1_ |= 0x80000;
			}
			final int i_6_ = ((Entity) this).aClass325_6399
					.method3698((byte) 116);
			final AbstractModel abstractModel = (((Entity) this).aClass146Array6441[0] = (aClass141_6504
					.method2301(
							((Entity) this).anInt6393,
							i_6_,
							((Entity) this).anIntArray6370,
							((Entity) this).anInt6350,
							(byte) 100,
							class97,
							((Entity) this).aClass226Array6387,
							var_ha, ((Entity) this).anInt6409,
							((Entity) this).anInt6361,
							Class75.aClass140_584, aClass40_6502,
							((Entity) this).anInt6366,
							Class370.aClass257_3136, i_1_,
							((Entity) this).anInt6419,
							Class151_Sub7.aClass183_5001, class97_3_)));
			if (abstractModel == null) {
				return false;
			}
			((Entity) this).anInt6352 = abstractModel.fa();
			((Entity) this).anInt6354 = abstractModel.ma();
			method3046(758, abstractModel);
			if ((i_4_ ^ 0xffffffff) != -1 || i_5_ != 0) {
				method3040(false, class294.anInt2360, i_4_, i_5_, i_6_,
						class294.anInt2391);
				if ((((Entity) this).anInt6388 ^ 0xffffffff) != -1) {
					((Entity) this).aClass146Array6441[0]
							.FA(((Entity) this).anInt6388);
				}
				if (((Entity) this).anInt6377 != 0) {
					((Entity) this).aClass146Array6441[0]
							.VA(((Entity) this).anInt6377);
				}
				if (((Entity) this).anInt6416 != 0) {
					((Entity) this).aClass146Array6441[0].H(0,
							((Entity) this).anInt6416, 0);
				}
			} else {
				method3040(false, 0, method3034(i + -255) << 188560585,
						method3034(0) << -1964945015, i_6_, 0);
			}
			if (bool) {
				abstractModel.method2337(((Entity) this).aByte6404,
						((Entity) this).aByte6381,
						((Entity) this).aByte6368,
						(((Entity) this).aByte6422 & 0xff));
			}
			if (((Entity) this).anInt6379 == -1
					|| ((((Entity) this).anInt6376 ^ 0xffffffff) == 0)) {
				((Entity) this).aClass146Array6441[1] = null;
			} else {
				final Class107 class107 = (Class196.aClass304_1509.method3564(i
						+ -253, ((Entity) this).anInt6379));
				final boolean bool_7_ = (class107.aByte923 == 3 && (i_4_ != 0 || i_5_ != 0));
				int i_8_ = i_2_;
				if (!bool_7_) {
					if (((Entity) this).anInt6389 != 0) {
						i_8_ |= 0x5;
					}
					if ((((Entity) this).anInt6382 ^ 0xffffffff) != -1) {
						i_8_ |= 0x2;
					}
					if (((Entity) this).anInt6410 >= 0) {
						i_8_ |= 0x7;
					}
				} else {
					i_8_ |= 0x7;
				}
				final AbstractModel class146_9_ = (((Entity) this).aClass146Array6441[1] = (class107
						.method1728(((Entity) this).anInt6376,
								Class151_Sub7.aClass183_5001, i_8_,
								((Entity) this).anInt6396,
								(byte) 66,
								((Entity) this).anInt6367,
								var_ha)));
				if (class146_9_ != null) {
					if ((((Entity) this).anInt6410 ^ 0xffffffff) > -1) {
						if (((Entity) this).anInt6389 != 0) {
							class146_9_
									.a(2048 * ((Entity) this).anInt6389);
						}
					} else {
						int i_10_ = 0;
						int i_11_ = 0;
						int i_12_ = 0;
						if (class294.anIntArrayArray2366 != null
								&& ((class294.anIntArrayArray2366[((Entity) this).anInt6410]) != null)) {
							i_11_ += (class294.anIntArrayArray2366[(((Entity) this).anInt6410)][1]);
							i_12_ += (class294.anIntArrayArray2366[(((Entity) this).anInt6410)][2]);
							i_10_ += (class294.anIntArrayArray2366[(((Entity) this).anInt6410)][0]);
						}
						if (class294.anIntArrayArray2364 != null
								&& ((class294.anIntArrayArray2364[((Entity) this).anInt6410]) != null)) {
							i_10_ += (class294.anIntArrayArray2364[(((Entity) this).anInt6410)][0]);
							i_11_ += (class294.anIntArrayArray2364[(((Entity) this).anInt6410)][1]);
							i_12_ += (class294.anIntArrayArray2364[(((Entity) this).anInt6410)][2]);
						}
						if ((i_12_ ^ 0xffffffff) != -1 || i_10_ != 0) {
							int i_13_ = i_6_;
							if ((((Entity) this).anIntArray6370) != null
									&& ((((Entity) this).anIntArray6370[(((Entity) this).anInt6410)]) ^ 0xffffffff) != 0) {
								i_13_ = (((Entity) this).anIntArray6370[(((Entity) this).anInt6410)]);
							}
							final int i_14_ = (i_13_
									+ (2048 * ((Entity) this).anInt6389 - i_6_) & 0x3fff);
							if (i_14_ != 0) {
								class146_9_.a(i_14_);
							}
							final int i_15_ = Class284_Sub2_Sub2.anIntArray6200[i_14_];
							final int i_16_ = Class284_Sub2_Sub2.anIntArray6202[i_14_];
							final int i_17_ = i_10_ * i_16_ + i_15_ * i_12_ >> -874650578;
							i_12_ = (-(i_10_ * i_15_) + i_12_ * i_16_ >> 562276558);
							i_10_ = i_17_;
						}
						class146_9_.H(i_10_, i_11_, i_12_);
					}
					if (((Entity) this).anInt6382 != 0) {
						class146_9_
								.H(0,
										-(((Entity) this).anInt6382) << -1220664798,
										0);
					}
					if (bool_7_) {
						if ((((Entity) this).anInt6388 ^ 0xffffffff) != -1) {
							class146_9_
									.FA(((Entity) this).anInt6388);
						}
						if ((((Entity) this).anInt6377 ^ 0xffffffff) != -1) {
							class146_9_
									.VA(((Entity) this).anInt6377);
						}
						if ((((Entity) this).anInt6416 ^ 0xffffffff) != -1) {
							class146_9_
									.H(0,
											(((Entity) this).anInt6416),
											0);
						}
					}
				}
			}
			if ((((Entity) this).anInt6365 ^ 0xffffffff) == 0
					|| ((Entity) this).anInt6428 == -1) {
				((Entity) this).aClass146Array6441[2] = null;
			} else {
				final Class107 class107 = (Class196.aClass304_1509.method3564(
						2, ((Entity) this).anInt6365));
				final boolean bool_18_ = ((class107.aByte923 ^ 0xffffffff) == -4 && (i_4_ != 0 || i_5_ != 0));
				int i_19_ = i_2_;
				if (!bool_18_) {
					if (((Entity) this).anInt6360 != 0) {
						i_19_ |= 0x5;
					}
					if ((((Entity) this).anInt6363 ^ 0xffffffff) != -1) {
						i_19_ |= 0x2;
					}
					if ((((Entity) this).anInt6353 ^ 0xffffffff) <= -1) {
						i_19_ |= 0x7;
					}
				} else {
					i_19_ |= 0x7;
				}
				final AbstractModel class146_20_ = (((Entity) this).aClass146Array6441[2] = (class107
						.method1721(var_ha,
								((Entity) this).anInt6421,
								21945, i_19_, Class151_Sub7.aClass183_5001,
								((Entity) this).anInt6427,
								((Entity) this).anInt6428)));
				if (class146_20_ != null) {
					if ((((Entity) this).anInt6353 ^ 0xffffffff) > -1
							|| class294.anIntArrayArray2366 == null
							|| ((class294.anIntArrayArray2366[((Entity) this).anInt6353]) == null)) {
						if (((Entity) this).anInt6360 != 0) {
							class146_20_
									.a(2048 * ((Entity) this).anInt6360);
						}
					} else {
						int i_21_ = 0;
						int i_22_ = 0;
						int i_23_ = 0;
						if (class294.anIntArrayArray2366 != null
								&& ((class294.anIntArrayArray2366[((Entity) this).anInt6353]) != null)) {
							i_21_ += (class294.anIntArrayArray2366[(((Entity) this).anInt6353)][0]);
							i_22_ += (class294.anIntArrayArray2366[(((Entity) this).anInt6353)][1]);
							i_23_ += (class294.anIntArrayArray2366[(((Entity) this).anInt6353)][2]);
						}
						if (class294.anIntArrayArray2364 != null
								&& ((class294.anIntArrayArray2364[((Entity) this).anInt6353]) != null)) {
							i_22_ += (class294.anIntArrayArray2364[(((Entity) this).anInt6353)][1]);
							i_21_ += (class294.anIntArrayArray2364[(((Entity) this).anInt6353)][0]);
							i_23_ += (class294.anIntArrayArray2364[(((Entity) this).anInt6353)][2]);
						}
						if (i_23_ != 0 || i_21_ != 0) {
							int i_24_ = i_6_;
							if ((((Entity) this).anIntArray6370) != null
									&& (((Entity) this).anIntArray6370[(((Entity) this).anInt6353)]) != -1) {
								i_24_ = (((Entity) this).anIntArray6370[(((Entity) this).anInt6353)]);
							}
							final int i_25_ = (0x3fff & i_24_
									+ (((Entity) this).anInt6360)
									* 2048 - i_6_);
							if ((i_25_ ^ 0xffffffff) != -1) {
								class146_20_.a(i_25_);
							}
							final int i_26_ = Class284_Sub2_Sub2.anIntArray6200[i_25_];
							final int i_27_ = Class284_Sub2_Sub2.anIntArray6202[i_25_];
							final int i_28_ = i_23_ * i_26_ + i_21_ * i_27_ >> 349754830;
							i_23_ = i_27_ * i_23_ - i_21_ * i_26_ >> 1020454830;
							i_21_ = i_28_;
						}
						class146_20_.H(i_21_, i_22_, i_23_);
					}
					if (((Entity) this).anInt6363 != 0) {
						class146_20_
								.H(0,
										-(((Entity) this).anInt6363) << 1062444738,
										0);
					}
					if (bool_18_) {
						if (((Entity) this).anInt6388 != 0) {
							class146_20_
									.FA(((Entity) this).anInt6388);
						}
						if (((Entity) this).anInt6377 != 0) {
							class146_20_
									.VA(((Entity) this).anInt6377);
						}
						if (((Entity) this).anInt6416 != 0) {
							class146_20_
									.H(0,
											(((Entity) this).anInt6416),
											0);
						}
					}
				}
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("cea.CB("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ','
					+ i_1_ + ')'));
		}
	}

	final void method3049(final int i, final int i_29_, final boolean bool,
			final byte i_30_, final int i_31_, final int i_32_) {
		do {
			try {
				((Class246_Sub3) this).aByte5088 = ((Class246_Sub3) this).aByte5081 = (byte) i_32_;
				if (Class1.method162(i_31_, (byte) -99, i_29_)) {
					((Class246_Sub3) this).aByte5081++;
				}
				if (((((Entity) this).anInt6413 ^ 0xffffffff) != 0)
						&& ((Class151_Sub7.aClass183_5001.method2623(
								((Entity) this).anInt6413,
								16383)).anInt816 ^ 0xffffffff) == -2) {
					((Entity) this).anIntArray6373 = null;
					((Entity) this).anInt6413 = -1;
				}
				if (((Entity) this).anInt6379 != -1) {
					final Class107 class107 = (Class196.aClass304_1509
							.method3564(2,
									((Entity) this).anInt6379));
					if (class107.aBoolean909
							&& (class107.anInt910 ^ 0xffffffff) != 0
							&& ((Class151_Sub7.aClass183_5001.method2623(
									class107.anInt910, 16383)).anInt816 ^ 0xffffffff) == -2) {
						((Entity) this).anInt6379 = -1;
					}
				}
				if ((((Entity) this).anInt6365 ^ 0xffffffff) != 0) {
					final Class107 class107 = (Class196.aClass304_1509
							.method3564(2,
									((Entity) this).anInt6365));
					if (class107.aBoolean909
							&& (class107.anInt910 ^ 0xffffffff) != 0
							&& (Class151_Sub7.aClass183_5001.method2623(
									class107.anInt910, 16383)).anInt816 == 1) {
						((Entity) this).anInt6365 = -1;
					}
				}
				if (!bool) {
					final int i_33_ = (-((Entity) this).anIntArray6437[0] + i_29_);
					final int i_34_ = i_31_
							+ -(((Entity) this).anIntArray6438[0]);
					if ((i_33_ ^ 0xffffffff) <= 7 && (i_33_ ^ 0xffffffff) >= -9
							&& (i_34_ ^ 0xffffffff) <= 7 && i_34_ <= 8) {
						if ((((Entity) this).anInt6434 ^ 0xffffffff) > -10) {
							((Entity) this).anInt6434++;
						}
						for (int i_35_ = ((Entity) this).anInt6434; (i_35_ ^ 0xffffffff) < -1; i_35_--) {
							((Entity) this).anIntArray6437[i_35_] = (((Entity) this).anIntArray6437[-1
									+ i_35_]);
							((Entity) this).anIntArray6438[i_35_] = (((Entity) this).anIntArray6438[i_35_
									+ -1]);
							((Entity) this).aByteArray6443[i_35_] = (((Entity) this).aByteArray6443[-1
									+ i_35_]);
						}
						((Entity) this).anIntArray6437[0] = i_29_;
						((Entity) this).aByteArray6443[0] = (byte) 1;
						((Entity) this).anIntArray6438[0] = i_31_;
						break;
					}
				}
				((Entity) this).anInt6434 = 0;
				((Entity) this).anIntArray6437[0] = i_29_;
				((Entity) this).anInt6436 = 0;
				((Entity) this).anInt6433 = 0;
				((Entity) this).anIntArray6438[0] = i_31_;
				((Class246_Sub3) this).anInt5079 = ((i << -869632920) + (((Entity) this).anIntArray6438[0] << 1403178185));
				((Class246_Sub3) this).anInt5084 = (((Entity) this).anIntArray6437[0] << 348528265)
						+ (i << 1193276360);
				if (i_30_ >= -105) {
					anInt6501 = -54;
				}
				if (((Entity) this).aClass246_Sub5_6439 == null) {
					break;
				}
				((Entity) this).aClass246_Sub5_6439
						.method3127();
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("cea.GB(" + i
						+ ',' + i_29_ + ',' + bool + ',' + i_30_ + ',' + i_31_
						+ ',' + i_32_ + ')'));
			}
			break;
		} while (false);
	}

	final void method3050(final int i, final int i_36_, final int i_37_) {
		try {
			int i_38_ = ((Entity) this).anIntArray6437[0];
			int i_39_ = ((Entity) this).anIntArray6438[0];
			if (i_37_ == 0) {
				i_39_++;
			}
			if (i_37_ == 1) {
				i_38_++;
				i_39_++;
			}
			if (i_37_ == 2) {
				i_38_++;
			}
			if (i_37_ == 3) {
				i_38_++;
				i_39_--;
			}
			if (i_37_ == 4) {
				i_39_--;
			}
			if (i_37_ == 5) {
				i_38_--;
				i_39_--;
			}
			if (i_37_ == 6) {
				i_38_--;
			}
			if (i_37_ == 7) {
				i_39_++;
				i_38_--;
			}
			if (((Entity) this).anInt6413 != -1
					&& (Class151_Sub7.aClass183_5001.method2623(
							((Entity) this).anInt6413, 16383)).anInt816 == 1) {
				((Entity) this).anInt6413 = -1;
				((Entity) this).anIntArray6373 = null;
			}
			if ((((Entity) this).anInt6379 ^ 0xffffffff) != i) {
				final Class107 class107 = (Class196.aClass304_1509.method3564(
						i + 2, ((Entity) this).anInt6379));
				if (class107.aBoolean909
						&& class107.anInt910 != -1
						&& (Class151_Sub7.aClass183_5001.method2623(
								(class107.anInt910), 16383).anInt816) == 1) {
					((Entity) this).anInt6379 = -1;
				}
			}
			if (((Entity) this).anInt6365 != -1) {
				final Class107 class107 = (Class196.aClass304_1509.method3564(
						i + 2, ((Entity) this).anInt6365));
				if (class107.aBoolean909
						&& (class107.anInt910 ^ 0xffffffff) != 0
						&& (Class151_Sub7.aClass183_5001.method2623(
								(class107.anInt910), 16383).anInt816) == 1) {
					((Entity) this).anInt6365 = -1;
				}
			}
			if (((Entity) this).anInt6434 < 9) {
				((Entity) this).anInt6434++;
			}
			for (int i_40_ = ((Entity) this).anInt6434; (i_40_ ^ 0xffffffff) < -1; i_40_--) {
				((Entity) this).anIntArray6437[i_40_] = (((Entity) this).anIntArray6437[-1
						+ i_40_]);
				((Entity) this).anIntArray6438[i_40_] = (((Entity) this).anIntArray6438[-1
						+ i_40_]);
				((Entity) this).aByteArray6443[i_40_] = (((Entity) this).aByteArray6443[-1
						+ i_40_]);
			}
			((Entity) this).anIntArray6437[0] = i_38_;
			((Entity) this).anIntArray6438[0] = i_39_;
			((Entity) this).aByteArray6443[0] = (byte) i_36_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("cea.EB(" + i
					+ ',' + i_36_ + ',' + i_37_ + ')'));
		}
	}

	@Override
	final int method3044(final boolean bool) {
		try {
			if (bool != false) {
				aClass141_6504 = null;
			}
			if ((aClass141_6504).anIntArray1109 != null) {
				final NPC class141 = aClass141_6504.method2300(
						Class75.aClass140_584, (byte) 70);
				if (class141 != null && (class141.anInt1092 ^ 0xffffffff) != 0) {
					return class141.anInt1092;
				}
			}
			if ((aClass141_6504).anInt1092 == -1) {
				return super.method3044(false);
			}
			return (aClass141_6504.anInt1092);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "cea.B(" + bool
					+ ')');
		}
	}

	private final boolean method3051(final int i) {
		try {
			if (i != 2) {
				anInt6503 = -16;
			}
			return (aClass141_6504.aBoolean1116);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "cea.DB(" + i + ')');
		}
	}

	@Override
	final void method2981(final Class246_Sub3 class246_sub3, final byte i,
			final boolean bool, final int i_41_, final ha var_ha,
			final int i_42_, final int i_43_) {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("cea.CA("
					+ (class246_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + bool + ',' + i_41_ + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_42_ + ','
					+ i_43_ + ')'));
		}
	}

	@Override
	final boolean method2976(final int i, final ha var_ha, final byte i_45_,
			final int i_46_) {
		try {
			if (aClass141_6504 == null || !method3048(var_ha, 255, 131072)) {
				return false;
			}
			final Class111 class111 = var_ha.method1793();
			final int i_47_ = ((Entity) this).aClass325_6399
					.method3698((byte) 116);
			class111.method2101(i_47_);
			if (i_45_ <= 59) {
				method2975(null, -17);
			}
			class111.method2106(((Class246_Sub3) this).anInt5084,
					((Class246_Sub3) this).anInt5089,
					((Class246_Sub3) this).anInt5079);
			boolean bool = false;
			for (int i_48_ = 0; i_48_ < (((Entity) this).aClass146Array6441).length; i_48_++) {
				if (((Entity) this).aClass146Array6441[i_48_] != null) {
					final boolean bool_49_ = (((aClass141_6504).anInt1123 ^ 0xffffffff) < -1 || ((aClass141_6504.anInt1096 ^ 0xffffffff) == 0 ? (aClass141_6504.anInt1112 == 1)
							: (aClass141_6504.anInt1096 ^ 0xffffffff) == -2));
					boolean bool_50_;
					if (!Class239.aBoolean1839) {
						bool_50_ = (((Entity) this).aClass146Array6441[i_48_]
								.method2339(i, i_46_, class111, bool_49_,
										aClass141_6504.anInt1123));
					} else {
						bool_50_ = (((Entity) this).aClass146Array6441[i_48_]
								.method2333(i, i_46_, class111, bool_49_,
										aClass141_6504.anInt1123,
										Class16.anInt197));
					}
					if (bool_50_) {
						bool = true;
						break;
					}
				}
			}
			((Entity) this).aClass146Array6441[0] = ((Entity) this).aClass146Array6441[1] = ((Entity) this).aClass146Array6441[2] = null;
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("cea.TA(" + i
					+ ',' + (var_ha != null ? "{...}" : "null") + ',' + i_45_
					+ ',' + i_46_ + ')'));
		}
	}

	@Override
	final int method3035(final int i) {
		try {
			if ((aClass141_6504).anIntArray1109 != null) {
				final NPC class141 = aClass141_6504.method2300(
						Class75.aClass140_584, (byte) 82);
				if (class141 != null && (class141.anInt1095 ^ 0xffffffff) != 0) {
					return class141.anInt1095;
				}
			}
			if (i != 28213) {
				aClass171_6506 = null;
			}
			return (aClass141_6504.anInt1095);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "cea.T(" + i + ')');
		}
	}

	@Override
	final Class228 method2974(final byte i, final ha var_ha) {
		try {
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("cea.KA(" + i
					+ ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method3052(final byte i) {
		try {
			if (aClass141_6504 == null) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "cea.WA(" + i + ')');
		}
	}

	public static void method3053(final boolean bool) {
		try {
			aClass171_6506 = null;
			aClass332_6508 = null;
			aString6507 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "cea.BB(" + bool
					+ ')');
		}
	}

	final void method3054(final NPC class141, final int i) {
		do {
			try {
				aClass141_6504 = class141;
				if (i != 1) {
					anInt6510 = -51;
				}
				if (((Entity) this).aClass246_Sub5_6439 == null) {
					break;
				}
				((Entity) this).aClass246_Sub5_6439
						.method3127();
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("cea.AB(" + (class141 != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final int method3030(final byte i) {
		try {
			if ((aClass141_6504).anIntArray1109 != null) {
				final NPC class141 = aClass141_6504.method2300(
						Class75.aClass140_584, (byte) 121);
				if (class141 != null && class141.renderEmote != -1) {
					return class141.renderEmote;
				}
			}
			return (aClass141_6504.renderEmote);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "cea.G(" + i + ')');
		}
	}

	@Override
	final boolean method2982(final byte i) {
		try {
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "cea.HA(" + i + ')');
		}
	}

	@Override
	final int method2986(final int i) {
		try {
			if (aClass141_6504 == null) {
				return 0;
			}
			return (aClass141_6504.anInt1123);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "cea.FB(" + i + ')');
		}
	}

	@Override
	final Class246_Sub1 method2975(final ha var_ha, final int i) {
		try {
			if (aClass141_6504 == null || !method3048(var_ha, 255, 2048)) {
				return null;
			}
			final Class111 class111 = var_ha.method1793();
			final int i_51_ = ((Entity) this).aClass325_6399
					.method3698((byte) 116);
			class111.method2101(i_51_);
			final Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[((Class246_Sub3) this).aByte5088][(((Class246_Sub3) this).anInt5084 >> Class151_Sub8.anInt5015)][(((Class246_Sub3) this).anInt5079 >> Class151_Sub8.anInt5015)]);
			if (class172 == null || class172.aClass246_Sub3_Sub1_1332 == null) {
				((Entity) this).anInt6351 -= (((Entity) this).anInt6351 / 10.0F);
			} else {
				final int i_52_ = (-(class172.aClass246_Sub3_Sub1_1332.aShort6149) + ((Entity) this).anInt6351);
				((Entity) this).anInt6351 -= i_52_ / 10.0F;
			}
			class111.method2106(((Class246_Sub3) this).anInt5084,
					(-((Entity) this).anInt6351
							+ ((Class246_Sub3) this).anInt5089 + -20),
					((Class246_Sub3) this).anInt5079);
			final Class294 class294 = method3039(1);
			final NPC class141 = ((aClass141_6504).anIntArray1109 != null ? aClass141_6504
					.method2300(Class75.aClass140_584, (byte) 70)
					: aClass141_6504);
			((Entity) this).aBoolean6442 = false;
			Class246_Sub1 class246_sub1 = null;
			if ((Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub26_4035
					.method662((byte) 123) ^ 0xffffffff) == -2
					&& class141.aBoolean1130 && class294.aBoolean2400) {
				final AnimationDefinition class97 = ((((Entity) this).anInt6413 == -1 || (((Entity) this).anInt6400 ^ 0xffffffff) != -1) ? null
						: (Class151_Sub7.aClass183_5001.method2623(
								((Entity) this).anInt6413,
								16383)));
				final AnimationDefinition class97_53_ = ((((Entity) this).anInt6385 == -1 || (((Entity) this).aBoolean6359 && class97 != null)) ? null
						: (Class151_Sub7.aClass183_5001.method2623(
								((Entity) this).anInt6385,
								16383)));
				final AbstractModel abstractModel = (Class102
						.method1703(
								class97_53_ == null ? class97 : class97_53_,
								((Entity) this).anInt6377,
								(aClass141_6504).anInt1112,
								(aClass141_6504).aByte1134 & 0xff,
								((Entity) this).aClass146Array6441[0],
								((Entity) this).anInt6388,
								i_51_,
								121,
								0xff & aClass141_6504.aByte1122,
								(aClass141_6504).aShort1135 & 0xffff,
								(class97_53_ != null ? ((Entity) this).anInt6350
										: ((Entity) this).anInt6393),
								var_ha, (aClass141_6504).aShort1094 & 0xffff,
								((Entity) this).anInt6416));
				if (abstractModel != null) {
					class246_sub1 = Class94
							.method915(
									1 + (((Entity) this).aClass146Array6441).length,
									(byte) -47, method3051(2));
					((Entity) this).aBoolean6442 = true;
					var_ha.C(false);
					if (Class239.aBoolean1839) {
						abstractModel.method2329(
								class111,
								(class246_sub1.aClass246_Sub6Array5067[(((Entity) this).aClass146Array6441).length]),
								Class16.anInt197, 0);
					} else {
						abstractModel.method2325(
								class111,
								(class246_sub1.aClass246_Sub6Array5067[(((Entity) this).aClass146Array6441).length]),
								0);
					}
					var_ha.C(true);
				}
			}
			class111.method2101(i_51_);
			class111.method2106(
					((Class246_Sub3) this).anInt5084,
					(((Class246_Sub3) this).anInt5089 - 5 + -(((Entity) this).anInt6351)),
					((Class246_Sub3) this).anInt5079);
			if (class246_sub1 == null) {
				class246_sub1 = Class94
						.method915(
								(((Entity) this).aClass146Array6441).length,
								(byte) -47, method3051(2));
			}
			method3036(var_ha, false, (byte) -124, class111,
					(((Entity) this).aClass146Array6441));
			if (Class239.aBoolean1839) {
				for (int i_54_ = 0; i_54_ < (((Entity) this).aClass146Array6441).length; i_54_++) {
					if ((((Entity) this).aClass146Array6441[i_54_]) != null) {
						((Entity) this).aClass146Array6441[i_54_]
								.method2329(
										class111,
										(class246_sub1.aClass246_Sub6Array5067[i_54_]),
										Class16.anInt197, 0);
					}
				}
			} else {
				for (int i_55_ = 0; (i_55_ ^ 0xffffffff) > ((((Entity) this).aClass146Array6441).length ^ 0xffffffff); i_55_++) {
					if ((((Entity) this).aClass146Array6441[i_55_]) != null) {
						((Entity) this).aClass146Array6441[i_55_]
								.method2325(
										class111,
										(class246_sub1.aClass246_Sub6Array5067[i_55_]),
										0);
					}
				}
			}
			if (((Entity) this).aClass246_Sub5_6439 != null) {
				final Class242 class242 = ((Entity) this).aClass246_Sub5_6439
						.method3116();
				if (!Class239.aBoolean1839) {
					var_ha.method1820(class242);
				} else {
					var_ha.method1785(class242, Class16.anInt197);
				}
			}
			for (int i_56_ = 0; (((Entity) this).aClass146Array6441.length > i_56_); i_56_++) {
				if (((Entity) this).aClass146Array6441[i_56_] != null) {
					((Entity) this).aBoolean6442 |= ((Entity) this).aClass146Array6441[i_56_]
							.F();
				}
			}
			((Entity) this).aClass146Array6441[0] = ((Entity) this).aClass146Array6441[1] = ((Entity) this).aClass146Array6441[2] = null;
			((Entity) this).anInt6417 = Class64_Sub15.anInt3676;
			if (i > -12) {
				method2982((byte) -72);
			}
			return class246_sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("cea.QA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public Class246_Sub3_Sub4_Sub2_Sub1() {
		/* empty */
	}

	@Override
	final void method2992(final byte i) {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "cea.DA(" + i + ')');
		}
	}
}
