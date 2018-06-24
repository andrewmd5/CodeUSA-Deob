/* Entity - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Entity extends Class246_Sub3_Sub4 {
	int anInt6347;
	boolean aBoolean6348 = false;
	int anInt6349;
	int anInt6350;
	int anInt6351;
	int anInt6352;
	int anInt6353 = -1;
	int anInt6354;
	private byte aByte6355;
	int anInt6356;
	static int anInt6357;
	int anInt6358 = 0;
	boolean aBoolean6359;
	int anInt6360;
	int anInt6361 = -1;
	int anInt6362;
	int anInt6363;
	int anInt6364;
	int anInt6365;
	int anInt6366 = 0;
	int anInt6367;
	byte aByte6368;
	int anInt6369;
	int[] anIntArray6370;
	boolean aBoolean6371;
	int anInt6372;
	int[] anIntArray6373;
	String aString6374;
	int[] anIntArray6375;
	int anInt6376;
	int anInt6377;
	int anInt6378;
	int anInt6379;
	int anInt6380;
	byte aByte6381;
	int anInt6382;
	int[] anIntArray6383;
	int anInt6384;
	int anInt6385;
	int[] anIntArray6386;
	Class226[] aClass226Array6387;
	int anInt6388;
	int anInt6389;
	int anInt6390;
	int anInt6391;
	int anInt6392;
	int anInt6393;
	int anInt6394;
	private int anInt6395;
	int anInt6396;
	int[] anIntArray6397;
	int anInt6398;
	Class325 aClass325_6399;
	int anInt6400;
	int anInt6401;
	int anInt6402;
	int anInt6403;
	byte aByte6404;
	int anInt6405;
	int anInt6406;
	int anInt6407;
	int anInt6408;
	int anInt6409;
	int anInt6410;
	int anInt6411;
	int anInt6412;
	int anInt6413;
	int anInt6414;
	int anInt6415;
	int anInt6416;
	int anInt6417;
	int anInt6418;
	int anInt6419;
	int anInt6420;
	int anInt6421;
	byte aByte6422;
	int[] anIntArray6423;
	int anInt6424;
	int[] anIntArray6425;
	int anInt6426;
	int anInt6427;
	int anInt6428;
	int anInt6429;
	int[] anIntArray6430;
	private final Class325 aClass325_6431;
	private final Class325 aClass325_6432;
	int anInt6433;
	int anInt6434;
	int anInt6435;
	int anInt6436;
	int[] anIntArray6437;
	int[] anIntArray6438;
	Class246_Sub5 aClass246_Sub5_6439;
	boolean aBoolean6440;
	AbstractModel[] aClass146Array6441;
	boolean aBoolean6442;
	byte[] aByteArray6443;

	@Override
	final boolean method2987(final int i) {
		try {
			if (i != 6540) {
				method3045((byte) -59, 60);
			}
			return aBoolean6442;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oi.I(" + i + ')');
		}
	}

	@Override
	final void method3022(final int i) {
		try {
			if (i != -8675) {
				method3037(-16, true, -64, 100, -58, -61, -88, 24);
			}
			final int i_0_ = (-1 + anInt6395 << 1914403080) + 240;
			((Class246_Sub3_Sub4) this).aShort6159 = (short) (i_0_
					+ ((Class246_Sub3) this).anInt5079 >> 1380990889);
			((Class246_Sub3_Sub4) this).aShort6160 = (short) (((Class246_Sub3) this).anInt5084
					+ i_0_ >> 1794948489);
			((Class246_Sub3_Sub4) this).aShort6157 = (short) (((Class246_Sub3) this).anInt5079
					+ -i_0_ >> 956113769);
			((Class246_Sub3_Sub4) this).aShort6158 = (short) (-i_0_
					+ ((Class246_Sub3) this).anInt5084 >> 12223625);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oi.F(" + i + ')');
		}
	}

	abstract int method3030(byte i);

	final void method3031(final int i) {
		try {
			anInt6436 = i;
			anInt6434 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oi.R(" + i + ')');
		}
	}

	final void method3032(final int i, final boolean bool, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_) {
		do {
			try {
				final int i_5_ = (bool ? anInt6365 : anInt6379);
				if ((i_3_ ^ 0xffffffff) != 0 && i_5_ != -1) {
					if (i_5_ != i_3_) {
						final Class107 class107 = Class196.aClass304_1509
								.method3564(2, i_3_);
						final Class107 class107_6_ = Class196.aClass304_1509
								.method3564(2, i_5_);
						if (class107.anInt910 != -1
								&& (class107_6_.anInt910 ^ 0xffffffff) != 0) {
							final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
									.method2623(class107.anInt910, 16383));
							final AnimationDefinition class97_7_ = (Class151_Sub7.aClass183_5001
									.method2623(class107_6_.anInt910, 16383));
							if (class97_7_.anInt829 > class97.anInt829) {
								break;
							}
						}
					} else {
						final Class107 class107 = Class196.aClass304_1509
								.method3564(2, i_3_);
						if (class107.aBoolean909 && class107.anInt910 != -1) {
							final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
									.method2623(class107.anInt910, 16383));
							final int i_8_ = class97.anInt819;
							if ((i_8_ ^ 0xffffffff) == -1) {
								break;
							}
							if (i_8_ == 2) {
								if (!bool) {
									anInt6356 = 0;
								} else {
									anInt6380 = 0;
									break;
								}
								break;
							}
						}
					}
				}
				if (i_4_ >= -69) {
					method3035(-115);
				}
				final int i_9_ = Class215.anInt1614;
				if (bool) {
					anInt6421 = 1;
					anInt6426 = i_9_ - -(i_1_ & 0xffff);
					anInt6427 = 0;
					anInt6365 = i_3_;
					anInt6363 = i_1_ >> 813121872;
					anInt6428 = 0;
					anInt6353 = i;
					anInt6360 = i_2_;
					if (i_9_ < anInt6426) {
						anInt6428 = -1;
					}
					if ((anInt6365 ^ 0xffffffff) != 0 && (i_9_ == anInt6426)) {
						final int i_10_ = ((Class196.aClass304_1509.method3564(
								2, anInt6365)).anInt910);
						if (i_10_ != -1) {
							final AnimationDefinition class97 = Class151_Sub7.aClass183_5001
									.method2623(i_10_, 16383);
							if (class97 != null
									&& class97.anIntArray818 != null
									&& !(aBoolean6371)) {
								Class349.method3840((byte) -128, this, 0,
										class97);
							}
						}
					}
				} else {
					anInt6396 = 0;
					anInt6367 = 1;
					anInt6379 = i_3_;
					anInt6410 = i;
					anInt6389 = i_2_;
					anInt6391 = i_9_ + (i_1_ & 0xffff);
					anInt6382 = i_1_ >> -1127488624;
					anInt6376 = 0;
					if ((i_9_ ^ 0xffffffff) > (anInt6391 ^ 0xffffffff)) {
						anInt6376 = -1;
					}
					if ((anInt6379 ^ 0xffffffff) == 0 || anInt6391 != i_9_) {
						break;
					}
					final int i_11_ = ((Class196.aClass304_1509.method3564(2,
							anInt6379)).anInt910);
					if ((i_11_ ^ 0xffffffff) == 0) {
						break;
					}
					final AnimationDefinition class97 = Class151_Sub7.aClass183_5001
							.method2623(i_11_, 16383);
					if (class97 == null || class97.anIntArray818 == null
							|| aBoolean6371) {
						break;
					}
					Class349.method3840((byte) -128, this, 0, class97);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("oi.S(" + i
						+ ',' + bool + ',' + i_1_ + ',' + i_2_ + ',' + i_3_
						+ ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	final int method3033(final byte i) {
		try {
			final Class294 class294 = method3039(1);
			final int i_13_ = (aClass325_6399.anInt2730);
			boolean bool;
			if (class294.anInt2398 == 0) {
				bool = (aClass325_6399.method3699(4201, anInt6414, anInt6415,
						anInt6414));
			} else {
				bool = (aClass325_6399.method3699(4201, class294.anInt2383,
						anInt6415, class294.anInt2398));
			}
			final int i_14_ = -i_13_ + (aClass325_6399).anInt2730;
			if (i_14_ != 0) {
				anInt6408++;
			} else {
				anInt6408 = 0;
				aClass325_6399.method3697(true, anInt6415);
			}
			if (bool) {
				if ((class294.anInt2390 ^ 0xffffffff) != -1) {
					if ((i_14_ ^ 0xffffffff) < -1) {
						aClass325_6431.method3699(4201, class294.anInt2392,
								class294.anInt2393, class294.anInt2390);
					} else {
						aClass325_6431.method3699(4201, class294.anInt2392,
								-class294.anInt2393, class294.anInt2390);
					}
				}
				if (class294.anInt2375 != 0) {
					aClass325_6432.method3699(4201, class294.anInt2380,
							class294.anInt2363, class294.anInt2375);
				}
			} else {
				if ((class294.anInt2390 ^ 0xffffffff) == -1) {
					aClass325_6431.method3697(true, 0);
				} else {
					aClass325_6431.method3699(4201, class294.anInt2392, 0,
							class294.anInt2390);
				}
				if (class294.anInt2375 != 0) {
					aClass325_6432.method3699(4201, class294.anInt2380, 0,
							class294.anInt2375);
				} else {
					aClass325_6432.method3697(true, 0);
				}
			}
			return i_14_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oi.L(" + i + ')');
		}
	}

	int method3034(final int i) {
		try {
			if (i != 0) {
				return -77;
			}
			return anInt6395;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oi.A(" + i + ')');
		}
	}

	abstract int method3035(int i);

	final void method3036(final ha var_ha, final boolean bool, final byte i,
			final Class111 class111, final AbstractModel[] class146s) {
		do {
			try {
				if (i <= -118) {
					do {
						if (bool) {
							if ((aClass246_Sub5_6439) == null) {
								break;
							}
							aClass246_Sub5_6439.method3126(Class215.anInt1614);
							if (!client.aBoolean3553) {
								break;
							}
						}
						final AbstractModel abstractModel = class146s[0];
						final AbstractModel class146_15_ = class146s[1];
						final AbstractModel class146_16_ = class146s[2];
						if (abstractModel != null) {
							abstractModel.method2343(class111);
							int i_17_ = 0;
							int i_18_ = 0;
							int i_19_ = 0;
							int i_20_ = 0;
							final Surface[] class87s = abstractModel.method2320();
							final SurfaceSkin[] class35s = abstractModel.method2322();
							if (class35s != null) {
								i_20_++;
								i_19_ += class35s.length;
							}
							if (class87s != null) {
								i_18_++;
								i_17_ += class87s.length;
							}
							Surface[] class87s_21_ = null;
							SurfaceSkin[] class35s_22_ = null;
							if (class146_15_ != null) {
								class146_15_.method2343(class111);
								class87s_21_ = class146_15_.method2320();
								class35s_22_ = class146_15_.method2322();
							}
							if (class35s_22_ != null) {
								i_19_ += class35s_22_.length;
								i_20_++;
							}
							if (class87s_21_ != null) {
								i_17_ += class87s_21_.length;
								i_18_++;
							}
							Surface[] class87s_23_ = null;
							SurfaceSkin[] class35s_24_ = null;
							if (class146_16_ != null) {
								class146_16_.method2343(class111);
								class87s_23_ = class146_16_.method2320();
								class35s_24_ = class146_16_.method2322();
							}
							if (class35s_24_ != null) {
								i_19_ += class35s_24_.length;
								i_20_++;
							}
							if (class87s_23_ != null) {
								i_18_++;
								i_17_ += class87s_23_.length;
							}
							if (((aClass246_Sub5_6439) == null || (aClass246_Sub5_6439).aBoolean5099)
									&& ((i_18_ ^ 0xffffffff) < -1 || (i_20_ ^ 0xffffffff) < -1)) {
								aClass246_Sub5_6439 = Class246_Sub5.method3117(
										(Class215.anInt1614), true);
							}
							if ((aClass246_Sub5_6439) != null) {
								Surface[] class87s_25_;
								if (i_18_ == 1) {
									if (class87s_21_ == null) {
										if (class87s_23_ != null) {
											class87s_25_ = class87s_23_;
										} else {
											class87s_25_ = class87s;
										}
									} else {
										class87s_25_ = class87s_21_;
									}
								} else {
									class87s_25_ = new Surface[i_17_];
									int i_26_ = 0;
									if (class87s != null) {
										Class236.method2892(class87s, 0,
												class87s_25_, i_26_,
												class87s.length);
										i_26_ += class87s.length;
									}
									if (class87s_21_ != null) {
										Class236.method2892(class87s_21_, 0,
												class87s_25_, i_26_,
												class87s_21_.length);
										i_26_ += class87s_21_.length;
									}
									if (class87s_23_ != null) {
										Class236.method2892(class87s_23_, 0,
												class87s_25_, i_26_,
												class87s_23_.length);
									}
								}
								SurfaceSkin[] class35s_28_;
								if (i_20_ != 1) {
									class35s_28_ = new SurfaceSkin[i_19_];
									int i_29_ = 0;
									if (class35s != null) {
										Class236.method2892(class35s, 0,
												class35s_28_, i_29_,
												class35s.length);
										i_29_ += class35s.length;
									}
									if (class35s_22_ != null) {
										Class236.method2892(class35s_22_, 0,
												class35s_28_, i_29_,
												class35s_22_.length);
										i_29_ += class35s_22_.length;
									}
									if (class35s_24_ != null) {
										Class236.method2892(class35s_24_, 0,
												class35s_28_, i_29_,
												class35s_24_.length);
									}
								} else if (class35s_22_ != null) {
									class35s_28_ = class35s_22_;
								} else if (class35s_24_ == null) {
									class35s_28_ = class35s;
								} else {
									class35s_28_ = class35s_24_;
								}
								aClass246_Sub5_6439.method3120(var_ha,
										Class215.anInt1614, class87s_25_,
										class35s_28_, false);
							}
							aBoolean6440 = true;
						}
					} while (false);
					if (aClass246_Sub5_6439 == null) {
						break;
					}
					aClass246_Sub5_6439.method3123(
							((Class246_Sub3) this).aByte5088,
							((Class246_Sub3_Sub4) this).aShort6158,
							((Class246_Sub3_Sub4) this).aShort6160,
							((Class246_Sub3_Sub4) this).aShort6157,
							((Class246_Sub3_Sub4) this).aShort6159);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("oi.N("
						+ (var_ha != null ? "{...}" : "null") + ',' + bool
						+ ',' + i + ',' + (class111 != null ? "{...}" : "null")
						+ ',' + (class146s != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method3037(final int i, final boolean bool, final int i_30_,
			final int i_31_, final int i_32_, final int i_33_, final int i_34_,
			final int i_35_) {
		try {
			boolean bool_36_ = true;
			boolean bool_37_ = true;
			for (int i_38_ = 0; (Class362.anInt3090 ^ 0xffffffff) < (i_38_ ^ 0xffffffff); i_38_++) {
				if ((anIntArray6375[i_38_] ^ 0xffffffff) < (i_32_ ^ 0xffffffff)) {
					bool_36_ = false;
				} else {
					bool_37_ = false;
				}
			}
			int i_39_ = -1;
			int i_40_ = -1;
			int i_41_ = 0;
			if ((i_31_ ^ 0xffffffff) <= -1) {
				final Class86 class86 = Class246_Sub3_Sub1.aClass121_6150
						.method2194(-62, i_31_);
				i_40_ = class86.anInt642;
				i_41_ = class86.anInt651;
			}
			if (bool == false) {
				if (bool_37_) {
					if ((i_40_ ^ 0xffffffff) == 0) {
						return;
					}
					i_39_ = 0;
					int i_42_ = 0;
					if ((i_40_ ^ 0xffffffff) != -1) {
						if ((i_40_ ^ 0xffffffff) == -2) {
							i_42_ = (anIntArray6425[0]);
						}
					} else {
						i_42_ = (anIntArray6375[0]);
					}
					for (int i_43_ = 1; ((Class362.anInt3090 ^ 0xffffffff) < (i_43_ ^ 0xffffffff)); i_43_++) {
						if ((i_40_ ^ 0xffffffff) == -1) {
							if ((i_42_ ^ 0xffffffff) < ((anIntArray6375[i_43_]) ^ 0xffffffff)) {
								i_39_ = i_43_;
								i_42_ = (anIntArray6375[i_43_]);
							}
						} else if ((i_40_ ^ 0xffffffff) == -2
								&& i_42_ > (anIntArray6425[i_43_])) {
							i_39_ = i_43_;
							i_42_ = (anIntArray6425[i_43_]);
						}
					}
					if ((i_40_ ^ 0xffffffff) == -2
							&& (i_30_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff)) {
						return;
					}
				} else {
					if (bool_36_) {
						aByte6355 = (byte) 0;
					}
					for (int i_44_ = 0; ((i_44_ ^ 0xffffffff) > (Class362.anInt3090 ^ 0xffffffff)); i_44_++) {
						final int i_45_ = aByte6355;
						aByte6355 = (byte) ((aByte6355 + 1) % Class362.anInt3090);
						if ((i_32_ ^ 0xffffffff) <= ((anIntArray6375[i_45_]) ^ 0xffffffff)) {
							i_39_ = i_45_;
							break;
						}
					}
				}
				if (i_39_ >= 0) {
					anIntArray6430[i_39_] = i_31_;
					anIntArray6425[i_39_] = i_30_;
					anIntArray6386[i_39_] = i_35_;
					anIntArray6423[i_39_] = i_33_;
					anIntArray6375[i_39_] = i_41_ + (i_32_ + i_34_);
					anIntArray6397[i_39_] = i;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oi.V(" + i + ','
					+ bool + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ','
					+ i_33_ + ',' + i_34_ + ',' + i_35_ + ')'));
		}
	}

	@Override
	final int method2985(final boolean bool) {
		try {
			if (bool != false) {
				anInt6362 = -77;
			}
			return anInt6354;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oi.O(" + bool
					+ ')');
		}
	}

	final void method3038(final int[] is, final int[] is_46_, final boolean bool) {
		try {
			if (bool != true) {
				anInt6352 = -44;
			}
			if (anIntArray6383 != null || is_46_ == null) {
				if (is_46_ == null) {
					anIntArray6383 = null;
					return;
				}
			} else {
				anIntArray6383 = new int[12];
			}
			for (int i = 0; anIntArray6383.length > i; i++) {
				anIntArray6383[i] = -1;
			}
			for (int i = 0; (i ^ 0xffffffff) > (is_46_.length ^ 0xffffffff); i++) {
				int i_47_ = is[i];
				int i_48_ = 0;
				while ((anIntArray6383.length ^ 0xffffffff) < (i_48_ ^ 0xffffffff)) {
					if ((i_47_ & 0x1 ^ 0xffffffff) != -1) {
						anIntArray6383[i_48_] = is_46_[i];
					}
					i_48_++;
					i_47_ >>= 1;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oi.M("
					+ (is != null ? "{...}" : "null") + ','
					+ (is_46_ != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	@Override
	final int method2990(final int i) {
		try {
			if (i != 0) {
				return 30;
			}
			if ((anInt6352 ^ 0xffffffff) == 32767) {
				return 0;
			}
			return anInt6352;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oi.J(" + i + ')');
		}
	}

	final Class294 method3039(final int i) {
		try {
			if (i != 1) {
				method3032(125, false, -5, 97, 58, -63);
			}
			final int i_49_ = method3030((byte) 70);
			if (i_49_ != -1) {
				return Class370.aClass257_3136.method3199(false, i_49_);
			}
			return Class64_Sub22.aClass294_3706;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oi.U(" + i + ')');
		}
	}

	final void method3040(final boolean bool, final int i, final int i_50_,
			final int i_51_, final int i_52_, final int i_53_) {
		try {
			final int i_54_ = ((((Class246_Sub3_Sub4) this).aShort6158 + ((Class246_Sub3_Sub4) this).aShort6160) >> -1012169567);
			final int i_55_ = ((((Class246_Sub3_Sub4) this).aShort6157 + ((Class246_Sub3_Sub4) this).aShort6159) >> -988754175);
			final int i_56_ = Class284_Sub2_Sub2.anIntArray6200[i_52_];
			final int i_57_ = Class284_Sub2_Sub2.anIntArray6202[i_52_];
			final int i_58_ = -i_50_ / 2;
			final int i_59_ = -i_51_ / 2;
			final int i_60_ = i_58_ * i_57_ + i_59_ * i_56_ >> -1025229234;
			final int i_61_ = i_57_ * i_59_ - i_56_ * i_58_ >> -184895538;
			if (bool != false) {
				method3039(126);
			}
			final int i_62_ = (Class64_Sub27.method664(
					((Class246_Sub3) this).anInt5079 + i_61_, i_55_, 109,
					((Class246_Sub3) this).aByte5088,
					((Class246_Sub3) this).anInt5084 + i_60_, i_54_));
			final int i_63_ = i_50_ / 2;
			final int i_64_ = -i_51_ / 2;
			final int i_65_ = i_64_ * i_56_ - -(i_57_ * i_63_) >> 755643662;
			final int i_66_ = i_57_ * i_64_ - i_63_ * i_56_ >> -1527044626;
			final int i_67_ = (Class64_Sub27.method664(
					((Class246_Sub3) this).anInt5079 - -i_66_, i_55_, 125,
					((Class246_Sub3) this).aByte5088, i_65_
							+ ((Class246_Sub3) this).anInt5084, i_54_));
			final int i_68_ = -i_50_ / 2;
			final int i_69_ = i_51_ / 2;
			final int i_70_ = i_56_ * i_69_ + i_68_ * i_57_ >> 726596686;
			final int i_71_ = i_69_ * i_57_ - i_56_ * i_68_ >> -1452830226;
			final int i_72_ = (Class64_Sub27.method664(i_71_
					+ ((Class246_Sub3) this).anInt5079, i_55_, 89,
					((Class246_Sub3) this).aByte5088, i_70_
							+ ((Class246_Sub3) this).anInt5084, i_54_));
			final int i_73_ = i_50_ / 2;
			final int i_74_ = i_51_ / 2;
			final int i_75_ = i_73_ * i_57_ + i_56_ * i_74_ >> -26644050;
			final int i_76_ = -(i_56_ * i_73_) + i_57_ * i_74_ >> 352446958;
			final int i_77_ = (Class64_Sub27.method664(i_76_
					+ ((Class246_Sub3) this).anInt5079, i_55_, 111,
					((Class246_Sub3) this).aByte5088, i_75_
							+ ((Class246_Sub3) this).anInt5084, i_54_));
			final int i_78_ = i_67_ > i_62_ ? i_62_ : i_67_;
			final int i_79_ = (i_72_ ^ 0xffffffff) <= (i_77_ ^ 0xffffffff) ? i_77_
					: i_72_;
			final int i_80_ = i_77_ <= i_67_ ? i_77_ : i_67_;
			final int i_81_ = i_72_ > i_62_ ? i_62_ : i_72_;
			anInt6388 = 0x3fff & (int) (2607.5945876176133 * Math.atan2(-i_79_
					+ i_78_, i_51_));
			anInt6377 = 0x3fff & (int) (Math.atan2(i_81_ + -i_80_, i_50_) * 2607.5945876176133);
			if ((anInt6388 ^ 0xffffffff) != -1 && (i ^ 0xffffffff) != -1) {
				final int i_82_ = 16384 - i;
				if (anInt6388 <= 8192) {
					if ((anInt6388 ^ 0xffffffff) < (i ^ 0xffffffff)) {
						anInt6388 = i;
					}
				} else if (anInt6388 < i_82_) {
					anInt6388 = i_82_;
				}
			}
			if (anInt6377 != 0 && i_53_ != 0) {
				final int i_83_ = -i_53_ + 16384;
				if (anInt6377 > 8192) {
					if (i_83_ > anInt6377) {
						anInt6377 = i_83_;
					}
				} else if (anInt6377 > i_53_) {
					anInt6377 = i_53_;
				}
			}
			anInt6416 = i_62_ - -i_77_;
			if (anInt6416 > i_72_ + i_67_) {
				anInt6416 = i_67_ - -i_72_;
			}
			anInt6416 = (-((Class246_Sub3) this).anInt5089 + (anInt6416 >> 1518450497));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oi.C(" + bool
					+ ',' + i + ',' + i_50_ + ',' + i_51_ + ',' + i_52_ + ','
					+ i_53_ + ')'));
		}
	}

	static final void method3041(final int i, final Class88 class88,
			final ByteBuffer class98_sub22, final int i_84_) {
		try {
			final Class98_Sub19 class98_sub19 = new Class98_Sub19();
			class98_sub19.anInt3960 = class98_sub22.readUnsignedByte((byte) 5);
			class98_sub19.anInt3954 = class98_sub22.readInt(-2);
			class98_sub19.aByteArrayArrayArray3958 = new byte[class98_sub19.anInt3960][][];
			class98_sub19.aClass143Array3962 = new Class143[class98_sub19.anInt3960];
			class98_sub19.anIntArray3957 = new int[class98_sub19.anInt3960];
			class98_sub19.anIntArray3953 = new int[class98_sub19.anInt3960];
			class98_sub19.aClass143Array3961 = new Class143[class98_sub19.anInt3960];
			class98_sub19.anIntArray3959 = new int[class98_sub19.anInt3960];
			for (int i_85_ = i; ((class98_sub19.anInt3960 ^ 0xffffffff) < (i_85_ ^ 0xffffffff)); i_85_++) {
				try {
					final int i_86_ = class98_sub22.readUnsignedByte((byte) 35);
					if (i_86_ != 0 && (i_86_ ^ 0xffffffff) != -2 && i_86_ != 2) {
						if ((i_86_ ^ 0xffffffff) == -4 || i_86_ == 4) {
							final String string = class98_sub22
									.readString((byte) 84);
							final String string_87_ = class98_sub22
									.readString((byte) 84);
							final int i_88_ = class98_sub22
									.readUnsignedByte((byte) -108);
							final String[] strings = new String[i_88_];
							for (int i_89_ = 0; (i_89_ ^ 0xffffffff) > (i_88_ ^ 0xffffffff); i_89_++) {
								strings[i_89_] = class98_sub22
										.readString((byte) 84);
							}
							final byte[][] is = new byte[i_88_][];
							if (i_86_ == 3) {
								for (int i_90_ = 0; i_90_ < i_88_; i_90_++) {
									final int i_91_ = class98_sub22.readInt(-2);
									is[i_90_] = new byte[i_91_];
									class98_sub22.method1190(is[i_90_], true,
											i_91_, 0);
								}
							}
							class98_sub19.anIntArray3953[i_85_] = i_86_;
							final Class[] var_classes = new Class[i_88_];
							for (int i_92_ = 0; (i_88_ ^ 0xffffffff) < (i_92_ ^ 0xffffffff); i_92_++) {
								var_classes[i_92_] = Class98_Sub10_Sub10
										.method1037(107, strings[i_92_]);
							}
							class98_sub19.aClass143Array3961[i_85_] = (class88
									.method870(string_87_, Class98_Sub10_Sub10
											.method1037(-113, string), Class369
											.method3953(i, 0), var_classes));
							class98_sub19.aByteArrayArrayArray3958[i_85_] = is;
						}
					} else {
						final String string = class98_sub22
								.readString((byte) 84);
						final String string_93_ = class98_sub22
								.readString((byte) 84);
						int i_94_ = 0;
						if ((i_86_ ^ 0xffffffff) == -2) {
							i_94_ = class98_sub22.readInt(i + -2);
						}
						class98_sub19.anIntArray3953[i_85_] = i_86_;
						class98_sub19.anIntArray3959[i_85_] = i_94_;
						class98_sub19.aClass143Array3962[i_85_] = class88
								.method873(string_93_, Class98_Sub10_Sub10
										.method1037(-128, string), -27303);
					}
				} catch (final ClassNotFoundException classnotfoundexception) {
					class98_sub19.anIntArray3957[i_85_] = -1;
				} catch (final SecurityException securityexception) {
					class98_sub19.anIntArray3957[i_85_] = -2;
				} catch (final NullPointerException nullpointerexception) {
					class98_sub19.anIntArray3957[i_85_] = -3;
				} catch (final Exception exception) {
					class98_sub19.anIntArray3957[i_85_] = -4;
				} catch (final Throwable throwable) {
					class98_sub19.anIntArray3957[i_85_] = -5;
				}
			}
			Class186.aClass148_3428.method2419(class98_sub19, -20911);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("oi.D(" + i + ',' + (class88 != null ? "{...}" : "null")
							+ ',' + (class98_sub22 != null ? "{...}" : "null")
							+ ',' + i_84_ + ')'));
		}
	}

	@Override
	final boolean method2978(final int i) {
		try {
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oi.H(" + i + ')');
		}
	}

	public Entity() {
		super(0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		aBoolean6359 = false;
		anInt6356 = 0;
		anInt6351 = 0;
		anInt6354 = 0;
		anInt6379 = -1;
		anInt6352 = -32768;
		anInt6385 = -1;
		anInt6367 = -1;
		aByte6355 = (byte) 0;
		anInt6380 = 0;
		aClass226Array6387 = new Class226[12];
		anInt6396 = 0;
		anInt6349 = -1;
		anIntArray6397 = new int[Class362.anInt3090];
		anInt6350 = 0;
		aString6374 = null;
		anIntArray6375 = new int[Class362.anInt3090];
		anInt6364 = -1;
		aBoolean6371 = true;
		anInt6406 = 0;
		anInt6403 = -1;
		anInt6405 = 0;
		anInt6376 = 0;
		anInt6410 = -1;
		anInt6414 = 256;
		anIntArray6373 = null;
		anInt6402 = 0;
		anInt6384 = 100;
		anIntArray6386 = new int[Class362.anInt3090];
		anInt6398 = 0;
		anInt6412 = -1000;
		anInt6409 = 0;
		anInt6419 = -1;
		anInt6413 = -1;
		anInt6418 = -1000;
		anInt6408 = 0;
		anIntArray6423 = new int[Class362.anInt3090];
		anInt6372 = 0;
		anInt6427 = 0;
		anInt6365 = -1;
		anInt6400 = 0;
		anInt6421 = -1;
		anIntArray6425 = new int[Class362.anInt3090];
		aByte6422 = (byte) 0;
		anInt6411 = -1;
		anInt6393 = 0;
		anInt6428 = 0;
		anInt6395 = 1;
		anIntArray6430 = new int[Class362.anInt3090];
		aClass325_6399 = new Class325();
		aClass325_6431 = new Class325();
		aClass325_6432 = new Class325();
		anInt6434 = 0;
		anIntArray6437 = new int[10];
		anIntArray6438 = new int[10];
		anInt6433 = 0;
		aClass146Array6441 = new AbstractModel[3];
		anInt6435 = 0;
		anInt6436 = 0;
		aBoolean6442 = false;
		aBoolean6440 = false;
		aByteArray6443 = new byte[10];
	}

	final void method3042(final int i, final int i_96_) {
		try {
			final Class294 class294 = method3039(1);
			if ((class294.anInt2398 ^ 0xffffffff) != -1
					|| ((anInt6414 ^ 0xffffffff) != -1)) {
				aClass325_6399.method3695(i_96_ + 452);
				final int i_97_ = (-(aClass325_6399).anInt2730 + i & 0x3fff);
				if ((i_97_ ^ 0xffffffff) < i_96_) {
					anInt6415 = -16384 - (-i_97_ - (aClass325_6399).anInt2730);
				} else {
					anInt6415 = (aClass325_6399).anInt2730 - -i_97_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oi.P(" + i + ','
					+ i_96_ + ')');
		}
	}

	final boolean method3043(final int i, final int i_98_, final int i_99_) {
		try {
			if (anIntArray6370 == null) {
				if (i_99_ == -1) {
					return true;
				}
				anIntArray6370 = new int[12];
				for (int i_100_ = 0; (i_100_ ^ 0xffffffff) > -13; i_100_++) {
					anIntArray6370[i_100_] = -1;
				}
			}
			final Class294 class294 = method3039(1);
			if (i != 12) {
				method3045((byte) 34, 119);
			}
			int i_101_ = 256;
			if (class294.anIntArray2373 != null
					&& class294.anIntArray2373[i_98_] > 0) {
				i_101_ = class294.anIntArray2373[i_98_];
			}
			if (i_99_ == -1) {
				if (anIntArray6370[i_98_] == -1) {
					return true;
				}
				final int i_102_ = aClass325_6399.method3698((byte) 116);
				final int i_103_ = anIntArray6370[i_98_];
				final int i_104_ = -i_103_ + i_102_;
				if (-i_101_ <= i_104_
						&& (i_101_ ^ 0xffffffff) <= (i_104_ ^ 0xffffffff)) {
					anIntArray6370[i_98_] = -1;
					for (int i_105_ = 0; i_105_ < 12; i_105_++) {
						if (((anIntArray6370[i_105_]) ^ 0xffffffff) != 0) {
							return true;
						}
					}
					anIntArray6370 = null;
					return true;
				}
				if ((i_104_ <= 0 || i_104_ > 8192)
						&& (i_104_ ^ 0xffffffff) < 8191) {
					anIntArray6370[i_98_] = Class202.method2702(16383, -i_101_
							+ i_103_);
				} else {
					anIntArray6370[i_98_] = Class202.method2702(
							i_101_ + i_103_, 16383);
				}
				return false;
			}
			if (anIntArray6370[i_98_] == -1) {
				anIntArray6370[i_98_] = aClass325_6399.method3698((byte) 116);
			}
			final int i_106_ = anIntArray6370[i_98_];
			final int i_107_ = i_99_ + -i_106_;
			if ((i_107_ ^ 0xffffffff) <= (-i_101_ ^ 0xffffffff)
					&& i_107_ <= i_101_) {
				anIntArray6370[i_98_] = i_99_;
				return true;
			}
			if (((i_107_ ^ 0xffffffff) >= -1 || (i_107_ ^ 0xffffffff) < -8193)
					&& i_107_ > -8192) {
				anIntArray6370[i_98_] = Class202.method2702(16383, i_106_
						- i_101_);
			} else {
				anIntArray6370[i_98_] = Class202.method2702(i_101_ + i_106_,
						16383);
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oi.K(" + i + ','
					+ i_98_ + ',' + i_99_ + ')'));
		}
	}

	int method3044(final boolean bool) {
		try {
			final Class294 class294 = method3039(1);
			if (class294.anInt2385 != -1) {
				return class294.anInt2385;
			}
			if (anInt6352 == -32768) {
				return 200;
			}
			if (bool != false) {
				return 122;
			}
			return -anInt6352;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oi.B(" + bool
					+ ')');
		}
	}

	final void method3045(final byte i, final int i_108_) {
		try {
			if (i > 66) {
				anInt6395 = i_108_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oi.E(" + i + ','
					+ i_108_ + ')');
		}
	}

	final void method3046(final int i, final AbstractModel abstractModel) {
		try {
			if (i != 758) {
				anInt6384 = -63;
			}
			final int i_109_ = aClass325_6431.anInt2730;
			final int i_110_ = aClass325_6432.anInt2730;
			if ((i_109_ ^ 0xffffffff) != -1 || (i_110_ ^ 0xffffffff) != -1) {
				final int i_111_ = abstractModel.fa() / 2;
				abstractModel.H(0, -i_111_, 0);
				abstractModel.VA(i_109_ & 0x3fff);
				abstractModel.FA(i_110_ & 0x3fff);
				abstractModel.H(0, i_111_, 0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oi.Q(" + i + ','
					+ (abstractModel != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3047(final int i, final boolean bool, final int i_112_) {
		try {
			final Class294 class294 = method3039(1);
			if (bool || (class294.anInt2398 ^ 0xffffffff) != -1
					|| ((anInt6414 ^ 0xffffffff) != -1)) {
				if (i_112_ < 9) {
					anInt6391 = 107;
				}
				anInt6415 = i & 0x3fff;
				aClass325_6399.method3697(true, anInt6415);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oi.W(" + i + ','
					+ bool + ',' + i_112_ + ')'));
		}
	}

	@Override
	protected final void finalize() {
		try {
			if (aClass246_Sub5_6439 != null) {
				aClass246_Sub5_6439.method3114();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					"oi.finalize(" + ')');
		}
	}
}
