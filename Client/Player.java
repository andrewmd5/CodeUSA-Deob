import java.util.Arrays;

/* Player - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Player extends Entity {
	int anInt6512 = -1;
	private byte aByte6513;
	int anInt6514;
	int skullIcon = -1;
	static IncomingOpcode aClass58_6516;
	int anInt6517 = -1;
	Appearance appearance;
	int combatLevel;
	boolean aBoolean6520;
	int anInt6521;
	int anInt6522;
	boolean invisible;
	int anInt6524;
	int anInt6525;
	boolean aBoolean6526;
	int anInt6527;
	int anInt6528;
	private int renderAnim;
	private int skinColour;
	int headIcon;
	private byte gender;
	boolean aBoolean6532;
	static byte[][] aByteArrayArray6533;
	boolean aBoolean6534;
	int anInt6535;
	String name;
	String name2;
	private byte title;
	int anInt6539;
	static boolean aBoolean6540 = false;
	int anInt6541;
	int anInt6542;
	static Class196 aClass196_6543;

	final boolean method3055(final byte i) {
		try {
			if (appearance == null) {
				return false;
			}
			if (i != 106) {
				aBoolean6534 = true;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gv.WA(" + i + ')');
		}
	}

	final void method3056(final byte i, final int i_0_, final int i_1_,
			final int i_2_) {
		try {
			if (((Entity) this).anInt6434 < 9) {
				((Entity) this).anInt6434++;
			}
			for (int i_3_ = ((Entity) this).anInt6434; (i_3_ ^ 0xffffffff) < -1; i_3_--) {
				((Entity) this).anIntArray6437[i_3_] = (((Entity) this).anIntArray6437[-1
						+ i_3_]);
				((Entity) this).anIntArray6438[i_3_] = (((Entity) this).anIntArray6438[i_3_ - 1]);
				((Entity) this).aByteArray6443[i_3_] = (((Entity) this).aByteArray6443[i_3_ - 1]);
			}
			((Entity) this).anIntArray6437[0] = i_2_;
			((Entity) this).anIntArray6438[0] = i_1_;
			if (i_0_ != 1) {
				method3064(-126);
			}
			((Entity) this).aByteArray6443[0] = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gv.NA(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method3057(final int i, final int i_4_, final byte i_5_,
			final int i_6_) {
		try {
			if ((((Entity) this).anInt6413 ^ 0xffffffff) != 0
					&& (Class151_Sub7.aClass183_5001.method2623(
							((Entity) this).anInt6413, 16383)).anInt816 == 1) {
				((Entity) this).anInt6413 = -1;
				((Entity) this).anIntArray6373 = null;
			}
			if (((Entity) this).anInt6379 != i_6_) {
				final Class107 class107 = (Class196.aClass304_1509.method3564(
						i_6_ + 3, ((Entity) this).anInt6379));
				if (class107.aBoolean909
						&& class107.anInt910 != -1
						&& ((Class151_Sub7.aClass183_5001.method2623(
								(class107.anInt910), 16383).anInt816) ^ 0xffffffff) == -2) {
					((Entity) this).anInt6379 = -1;
				}
			}
			if ((((Entity) this).anInt6365 ^ 0xffffffff) != 0) {
				final Class107 class107 = (Class196.aClass304_1509.method3564(
						2, ((Entity) this).anInt6365));
				if (class107.aBoolean909
						&& class107.anInt910 != -1
						&& (Class151_Sub7.aClass183_5001.method2623(
								(class107.anInt910), 16383).anInt816) == 1) {
					((Entity) this).anInt6365 = -1;
				}
			}
			anInt6512 = -1;
			if (i < 0 || (Class165.anInt1276 ^ 0xffffffff) >= (i ^ 0xffffffff)
					|| i_4_ < 0 || i_4_ >= Class98_Sub10_Sub7.anInt5572) {
				method3060(i_4_, i, 1470);
			} else if ((((Entity) this).anIntArray6437[0] ^ 0xffffffff) <= -1
					&& (((Entity) this).anIntArray6437[0] ^ 0xffffffff) > (Class165.anInt1276 ^ 0xffffffff)
					&& ((Entity) this).anIntArray6438[0] >= 0
					&& ((((Entity) this).anIntArray6438[0] ^ 0xffffffff) > (Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff))) {
				if ((i_5_ ^ 0xffffffff) == -3) {
					Class363.method3930(false, (byte) 2, this, i_4_, i);
				}
				method3056(i_5_, 1, i_4_, i);
			} else {
				method3060(i_4_, i, 1470);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gv.LA(" + i + ','
					+ i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	private final boolean method3058(final byte i, final ha var_ha, int i_7_) {
		try {
			final int i_8_ = i_7_;
			final Class294 class294 = method3039(1);
			final AnimationDefinition class97 = ((((Entity) this).anInt6413 == -1 || ((Entity) this).anInt6400 != 0) ? null
					: (Class151_Sub7.aClass183_5001.method2623(
							((Entity) this).anInt6413, 16383)));
			final AnimationDefinition class97_10_ = ((((Entity) this).anInt6385 == -1
					|| aBoolean6520 || (((Entity) this).aBoolean6359 && class97 != null)) ? null
					: (Class151_Sub7.aClass183_5001.method2623(
							((Entity) this).anInt6385, 16383)));
			final int i_11_ = class294.anInt2362;
			final int i_12_ = class294.anInt2382;
			if ((i_11_ ^ 0xffffffff) != -1 || (i_12_ ^ 0xffffffff) != -1
					|| (class294.anInt2393 ^ 0xffffffff) != -1
					|| (class294.anInt2363 ^ 0xffffffff) != -1) {
				i_7_ |= 0x7;
			}
			final int i_13_ = ((Entity) this).aClass325_6399
					.method3698((byte) 116);
			final boolean bool = ((((Entity) this).aByte6422 ^ 0xffffffff) != -1
					&& (Class215.anInt1614 >= ((Entity) this).anInt6403) && (Class215.anInt1614 < ((Entity) this).anInt6349));
			if (bool) {
				i_7_ |= 0x80000;
			}
			final AbstractModel abstractModel = (((Entity) this).aClass146Array6441[0] = (appearance
					.method3628(
							Class370.aClass257_3136,
							class97,
							class97_10_,
							Class151_Sub7.aClass183_5001,
							((Entity) this).anInt6393,
							Class149.aClass83_1205,
							((Entity) this).anIntArray6370,
							Class98_Sub46_Sub19.aClass205_6068,
							true,
							((Entity) this).anInt6409,
							((Entity) this).aClass226Array6387,
							Class4.aClass301_85, Class75.aClass140_584, true,
							i_7_, ((Entity) this).anInt6419,
							((Entity) this).anInt6366,
							((Entity) this).anInt6361,
							((Entity) this).anInt6350, i_13_,
							var_ha)));
			final int i_14_ = Class52.method488(true);
			if (Class292.anInt3359 < 96 && (i_14_ ^ 0xffffffff) < -51) {
				Class206.method2727(89);
			}
			if (Class43.aClass196_375 == Class64_Sub29.aClass196_3720
					|| (i_14_ ^ 0xffffffff) <= -51) {
				if (Class64_Sub29.aClass196_3720 != Class43.aClass196_375) {
					Class98_Sub48.anInt4281 = 0;
					Class76.aByteArrayArray590 = new byte[50][];
				}
			} else {
				int i_15_;
				for (i_15_ = -i_14_ + 50; ((i_15_ ^ 0xffffffff) < (Class98_Sub48.anInt4281 ^ 0xffffffff)); Class98_Sub48.anInt4281++) {
					Class76.aByteArrayArray590[Class98_Sub48.anInt4281] = new byte[102400];
				}
				while ((Class98_Sub48.anInt4281 ^ 0xffffffff) < (i_15_ ^ 0xffffffff)) {
					Class98_Sub48.anInt4281--;
					Class76.aByteArrayArray590[Class98_Sub48.anInt4281] = null;
				}
			}
			if (abstractModel == null) {
				return false;
			}
			((Entity) this).anInt6352 = abstractModel.fa();
			((Entity) this).anInt6354 = abstractModel.ma();
			method3046(758, abstractModel);
			if ((i_11_ ^ 0xffffffff) != -1 || i_12_ != 0) {
				method3040(false, class294.anInt2360, i_11_, i_12_, i_13_,
						class294.anInt2391);
				if ((((Entity) this).anInt6388 ^ 0xffffffff) != -1) {
					abstractModel.FA(((Entity) this).anInt6388);
				}
				if (((Entity) this).anInt6377 != 0) {
					abstractModel.VA(((Entity) this).anInt6377);
				}
				if ((((Entity) this).anInt6416 ^ 0xffffffff) != -1) {
					abstractModel.H(0, ((Entity) this).anInt6416, 0);
				}
			} else {
				method3040(false, 0, method3034(0) << -1003342711,
						method3034(0) << -31149111, i_13_, 0);
			}
			if (bool) {
				
			abstractModel.method2337(((Entity) this).aByte6404,
						((Entity) this).aByte6381,
						((Entity) this).aByte6368,
						0xff & (((Entity) this).aByte6422)); 
				
			
			}
			if (!aBoolean6520
					&& ((Entity) this).anInt6379 != -1
					&& ((((Entity) this).anInt6376 ^ 0xffffffff) != 0)) {
				final Class107 class107 = (Class196.aClass304_1509.method3564(
						2, ((Entity) this).anInt6379));
				final boolean bool_16_ = (class107.aByte923 == 3 && ((i_11_ ^ 0xffffffff) != -1 || i_12_ != 0));
				int i_17_ = i_8_;
				if (!bool_16_) {
					if (((Entity) this).anInt6389 != 0) {
						i_17_ |= 0x5;
					}
					if ((((Entity) this).anInt6382 ^ 0xffffffff) != -1) {
						i_17_ |= 0x2;
					}
					if (((Entity) this).anInt6410 >= 0) {
						i_17_ |= 0x7;
					}
				} else {
					i_17_ |= 0x7;
				}
				final AbstractModel class146_18_ = (((Entity) this).aClass146Array6441[1] = (class107
						.method1728(((Entity) this).anInt6376,
								Class151_Sub7.aClass183_5001, i_17_,
								((Entity) this).anInt6396,
								(byte) -95,
								((Entity) this).anInt6367,
								var_ha)));
				if (class146_18_ != null) {
					if ((((Entity) this).anInt6410 ^ 0xffffffff) <= -1
							&& class294.anIntArrayArray2366 != null
							&& ((class294.anIntArrayArray2366[((Entity) this).anInt6410]) != null)) {
						int i_19_ = 0;
						int i_20_ = 0;
						int i_21_ = 0;
						if (class294.anIntArrayArray2366 != null
								&& ((class294.anIntArrayArray2366[((Entity) this).anInt6410]) != null)) {
							i_21_ += (class294.anIntArrayArray2366[(((Entity) this).anInt6410)][2]);
							i_19_ += (class294.anIntArrayArray2366[(((Entity) this).anInt6410)][0]);
							i_20_ += (class294.anIntArrayArray2366[(((Entity) this).anInt6410)][1]);
						}
						if (class294.anIntArrayArray2364 != null
								&& ((class294.anIntArrayArray2364[((Entity) this).anInt6410]) != null)) {
							i_21_ += (class294.anIntArrayArray2364[(((Entity) this).anInt6410)][2]);
							i_19_ += (class294.anIntArrayArray2364[(((Entity) this).anInt6410)][0]);
							i_20_ += (class294.anIntArrayArray2364[(((Entity) this).anInt6410)][1]);
						}
						if (i_21_ != 0 || (i_19_ ^ 0xffffffff) != -1) {
							int i_22_ = i_13_;
							if ((((Entity) this).anIntArray6370) != null
									&& ((((Entity) this).anIntArray6370[(((Entity) this).anInt6410)]) ^ 0xffffffff) != 0) {
								i_22_ = (((Entity) this).anIntArray6370[(((Entity) this).anInt6410)]);
							}
							final int i_23_ = (0x3fff & i_22_
									+ ((((Entity) this).anInt6389) * 2048 + -i_13_));
							if (i_23_ != 0) {
								class146_18_.a(i_23_);
							}
							final int i_24_ = Class284_Sub2_Sub2.anIntArray6200[i_23_];
							final int i_25_ = Class284_Sub2_Sub2.anIntArray6202[i_23_];
							final int i_26_ = i_25_ * i_19_ + i_24_ * i_21_ >> 1204025262;
							i_21_ = (i_21_ * i_25_ + -(i_19_ * i_24_) >> -1923367154);
							i_19_ = i_26_;
						}
						class146_18_.H(i_19_, i_20_, i_21_);
					} else if (((Entity) this).anInt6389 != 0) {
						class146_18_
								.a(2048 * (((Entity) this).anInt6389));
					}
					if ((((Entity) this).anInt6382 ^ 0xffffffff) != -1) {
						class146_18_
								.H(0,
										-(((Entity) this).anInt6382) << -849373150,
										0);
					}
					if (bool_16_) {
						if (((Entity) this).anInt6388 != 0) {
							class146_18_
									.FA(((Entity) this).anInt6388);
						}
						if ((((Entity) this).anInt6377 ^ 0xffffffff) != -1) {
							class146_18_
									.VA(((Entity) this).anInt6377);
						}
						if (((Entity) this).anInt6416 != 0) {
							class146_18_
									.H(0,
											(((Entity) this).anInt6416),
											0);
						}
					}
				}
			} else {
				((Entity) this).aClass146Array6441[1] = null;
			}
			if (aBoolean6520
					|| ((Entity) this).anInt6365 == -1
					|| ((((Entity) this).anInt6428 ^ 0xffffffff) == 0)) {
				((Entity) this).aClass146Array6441[2] = null;
			} else {
				final Class107 class107 = (Class196.aClass304_1509.method3564(
						2, ((Entity) this).anInt6365));
				final boolean bool_27_ = ((class107.aByte923 ^ 0xffffffff) == -4 && (i_11_ != 0 || (i_12_ ^ 0xffffffff) != -1));
				int i_28_ = i_8_;
				if (!bool_27_) {
					if ((((Entity) this).anInt6360 ^ 0xffffffff) != -1) {
						i_28_ |= 0x5;
					}
					if (((Entity) this).anInt6363 != 0) {
						i_28_ |= 0x2;
					}
					if (((Entity) this).anInt6353 >= 0) {
						i_28_ |= 0x7;
					}
				} else {
					i_28_ |= 0x7;
				}
				final AbstractModel class146_29_ = (((Entity) this).aClass146Array6441[2] = (class107
						.method1721(var_ha,
								((Entity) this).anInt6421,
								21945, i_28_, Class151_Sub7.aClass183_5001,
								((Entity) this).anInt6427,
								((Entity) this).anInt6428)));
				if (class146_29_ != null) {
					if ((((Entity) this).anInt6353 ^ 0xffffffff) > -1
							|| class294.anIntArrayArray2366 == null
							|| ((class294.anIntArrayArray2366[((Entity) this).anInt6353]) == null)) {
						if ((((Entity) this).anInt6360 ^ 0xffffffff) != -1) {
							class146_29_
									.a(2048 * ((Entity) this).anInt6360);
						}
					} else {
						int i_30_ = 0;
						int i_31_ = 0;
						int i_32_ = 0;
						if (class294.anIntArrayArray2366 != null
								&& ((class294.anIntArrayArray2366[((Entity) this).anInt6353]) != null)) {
							i_32_ += (class294.anIntArrayArray2366[(((Entity) this).anInt6353)][2]);
							i_31_ += (class294.anIntArrayArray2366[(((Entity) this).anInt6353)][1]);
							i_30_ += (class294.anIntArrayArray2366[(((Entity) this).anInt6353)][0]);
						}
						if (class294.anIntArrayArray2364 != null
								&& ((class294.anIntArrayArray2364[((Entity) this).anInt6353]) != null)) {
							i_32_ += (class294.anIntArrayArray2364[(((Entity) this).anInt6353)][2]);
							i_31_ += (class294.anIntArrayArray2364[(((Entity) this).anInt6353)][1]);
							i_30_ += (class294.anIntArrayArray2364[(((Entity) this).anInt6353)][0]);
						}
						if ((i_32_ ^ 0xffffffff) != -1 || i_30_ != 0) {
							int i_33_ = i_13_;
							if ((((Entity) this).anIntArray6370) != null
									&& ((((Entity) this).anIntArray6370[(((Entity) this).anInt6353)]) ^ 0xffffffff) != 0) {
								i_33_ = (((Entity) this).anIntArray6370[(((Entity) this).anInt6353)]);
							}
							final int i_34_ = 0x3fff
									& -i_13_
									+ (((Entity) this).anInt6360 * 2048 - -i_33_);
							if ((i_34_ ^ 0xffffffff) != -1) {
								class146_29_.a(i_34_);
							}
							final int i_35_ = Class284_Sub2_Sub2.anIntArray6200[i_34_];
							final int i_36_ = Class284_Sub2_Sub2.anIntArray6202[i_34_];
							final int i_37_ = i_30_ * i_36_ + i_35_ * i_32_ >> 1334277742;
							i_32_ = i_36_ * i_32_ - i_35_ * i_30_ >> 1208318926;
							i_30_ = i_37_;
						}
						class146_29_.H(i_30_, i_31_, i_32_);
					}
					if ((((Entity) this).anInt6363 ^ 0xffffffff) != -1) {
						class146_29_
								.H(0,
										-(((Entity) this).anInt6363) << -623157630,
										0);
					}
					if (bool_27_) {
						if ((((Entity) this).anInt6388 ^ 0xffffffff) != -1) {
							class146_29_
									.FA(((Entity) this).anInt6388);
						}
						if (((Entity) this).anInt6377 != 0) {
							class146_29_
									.VA(((Entity) this).anInt6377);
						}
						if ((((Entity) this).anInt6416 ^ 0xffffffff) != -1) {
							class146_29_
									.H(0,
											(((Entity) this).anInt6416),
											0);
						}
					}
				}
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			//throw Class64_Sub27.printError(runtimeexception, ("gv.IA(" + i + ','
					//+ (var_ha != null ? "{...}" : "null") + ',' + i_7_ + ')'));
			return true;
		}
	}

	@Override
	final boolean method2982(final byte i) {
		try {
			if (i >= -70) {
				aClass196_6543 = null;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gv.HA(" + i + ')');
		}
	}

	final String method3059(final int i, final boolean bool) {
		try {
			if (i != -1) {
				method2992((byte) 110);
			}
			if (bool) {
				return name;
			}
			return name2;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gv.JA(" + i + ','
					+ bool + ')');
		}
	}

	final void method3060(final int i, final int i_38_, final int i_39_) {
		do {
			try {
				((Entity) this).anIntArray6437[0] = i_38_;
				((Entity) this).anInt6433 = 0;
				((Entity) this).anInt6436 = 0;
				((Entity) this).anInt6434 = 0;
				if (i_39_ != 1470) {
					title = (byte) -42;
				}
				((Entity) this).anIntArray6438[0] = i;
				final int i_40_ = method3034(0);
				((Class246_Sub3) this).anInt5084 = (512 * ((Entity) this).anIntArray6437[0] + 256 * i_40_);
				((Class246_Sub3) this).anInt5079 = i_40_ * 256
						+ (((Entity) this).anIntArray6438[0])
						* 512;
				if (Surface.player == this) {
					Class374.method3980((byte) 126);
				}
				if (((Entity) this).aClass246_Sub5_6439 == null) {
					break;
				}
				((Entity) this).aClass246_Sub5_6439
						.method3127();
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("gv.VA(" + i
						+ ',' + i_38_ + ',' + i_39_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final Class228 method2974(final byte i, final ha var_ha) {
		try {
			if (i != -53) {
				return null;
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gv.KA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method3061(final ha var_ha, final int i,
			final int i_41_, final int i_42_, final boolean bool,
			final Class111 class111, final int i_43_, final int i_44_,
			final AbstractModel abstractModel) {
		do {
			try {
				final int i_45_ = i * i + i_42_ * i_42_;
				if ((i_45_ ^ 0xffffffff) <= -262145
						&& (i_43_ ^ 0xffffffff) <= (i_45_ ^ 0xffffffff)) {
					if (bool != true) {
						method3030((byte) 44);
					}
					final int i_46_ = 0x3fff & (int) (2607.5945876176133 * Math
							.atan2(i_42_, i));
					final AbstractModel class146_47_ = (Class98_Sub10_Sub16
							.method1052(
									((Entity) this).anInt6377,
									i_46_,
									((Entity) this).anInt6388,
									var_ha, i_44_, 106,
									((Entity) this).anInt6416));
					if (class146_47_ == null) {
						break;
					}
					var_ha.C(false);
					class146_47_.method2329(class111, null, i_41_, 0);
					var_ha.C(true);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("gv.AB("
						+ (var_ha != null ? "{...}" : "null") + ',' + i + ','
						+ i_41_ + ',' + i_42_ + ',' + bool + ','
						+ (class111 != null ? "{...}" : "null") + ',' + i_43_
						+ ',' + i_44_ + ','
						+ (abstractModel != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method3062(final ByteBuffer byteBuffer, final byte i) {
		do {
			try {
				byteBuffer.position = 0;
				final int i_48_ = byteBuffer.readUnsignedByte((byte) -101);
				gender = (byte) (0x1 & i_48_);
				final boolean bool = aBoolean6526;
				aBoolean6526 = (i_48_ & 0x2 ^ 0xffffffff) != -1;
				final boolean bool_49_ = (0x4 & i_48_) != 0;
				final int i_50_ = super.method3034(0);
				method3045((byte) 68, 1 + (0x7 & i_48_ >> 846259619));
				aByte6513 = (byte) (i_48_ >> -218019610 & 0x3);
				((Class246_Sub3) this).anInt5084 += -i_50_
						+ method3034(i + -73) << 1992716520;
				((Class246_Sub3) this).anInt5079 += method3034(0) - i_50_ << 1346950216;
				title = byteBuffer.readSignedByte((byte) -19);
				skullIcon = byteBuffer.readSignedByte((byte) -19);
				headIcon = byteBuffer.readSignedByte((byte) -19);
				invisible = byteBuffer.readSignedByte((byte) -19) == 1;
				if (Class64_Sub29.aClass196_3720 == Class43.aClass196_375
						&& Class282.anInt2125 >= 2) {
					invisible = false;
				}
				int i_51_ = -1;
				anInt6528 = 0;
				final int[] equipIDs = new int[12];
				for (int equipIndex = 0; equipIndex < 12; equipIndex++) {
					final int equipped = byteBuffer
							.readUnsignedByte((byte) -123);
					if (equipped == 0) {
						equipIDs[equipIndex] = 0;
					} else {
						final int i_54_ = byteBuffer
								.readUnsignedByte((byte) -111);
						int i_55_ = (equipped << -30617816) + i_54_;
						if (equipIndex == 0 && (i_55_ ^ 0xffffffff) == -65536) {
							i_51_ = byteBuffer.readUnsignedShort((byte) 127);
							anInt6528 = byteBuffer
									.readUnsignedByte((byte) -114);
							break;
						}
						if (i_55_ >= 32768) {
							i_55_ = Class255.anIntArray3207[-32768 + i_55_];
							equipIDs[equipIndex] = Class41.method366(1073741824, i_55_);
							final int i_56_ = (Class98_Sub46_Sub19.aClass205_6068
									.method2714(i_55_, (byte) -119).anInt2435);
							if (i_56_ != 0) {
								anInt6528 = i_56_;
							}
						} else {
							equipIDs[equipIndex] = Class41.method366(-2147483648, i_55_
									+ -256);
						}
					}
				}
				final int[] colors = new int[5];
				for (int i_58_ = 0; i_58_ < 5; i_58_++) {
					int i_59_ = byteBuffer.readUnsignedByte((byte) -108);
					if (((Class61.aShortArrayArrayArray478.length ^ 0xffffffff) > -2)
							|| i_59_ < 0
							|| (Class61.aShortArrayArrayArray478[0][i_58_].length <= i_59_)) {
						i_59_ = 0;
					}
					colors[i_58_] = i_59_;
				}
				renderAnim = byteBuffer.readUnsignedShort((byte) 127);
				name = byteBuffer.readString((byte) 84);
				int[] compcols = new int[4];
				compcols[0] = byteBuffer.readShort((byte) 127);
				compcols[1] = byteBuffer.readShort((byte) 127);
				compcols[2] = byteBuffer.readShort((byte) 127);
				compcols[3] = byteBuffer.readShort((byte) 127);
				//System.out.println(compcols[0] + "," + compcols[1] + "," + compcols[2] + "," + compcols[3]);
				
				int[] maxcols = new int[4];
				maxcols[0] = byteBuffer.readShort((byte) 127);
				
				maxcols[1] = byteBuffer.readShort((byte) 127);
				maxcols[2] = byteBuffer.readShort((byte) 127);
				maxcols[3] = byteBuffer.readShort((byte) 127);
			
			//	String rem = class98_sub22.readString((byte) 84);
				
				//if (rem.length() > 0)
				//	Class118.method2170(26, rem);
				
				
				name2 = name;
				
				if (this == Surface.player) {
					Class256_Sub1.aString5157 = name;
				}
				combatLevel = byteBuffer.readUnsignedByte((byte) 80);
				if (!bool_49_) {
					anInt6539 = 0;
					anInt6542 = byteBuffer.readUnsignedByte((byte) -125); //summoning level next to combat
					anInt6535 = byteBuffer.readUnsignedByte((byte) 31);
					if ((anInt6535 ^ 0xffffffff) == -256) {
						anInt6535 = -1;
					}
				} else {
					anInt6539 = byteBuffer.readUnsignedShort((byte) 127);
					anInt6535 = -1;
					anInt6542 = combatLevel;
					if ((anInt6539 ^ 0xffffffff) == -65536) {
						anInt6539 = -1;
					}
				}
				final int i_60_ = anInt6525;
				anInt6525 = byteBuffer.readUnsignedByte((byte) -122);//npcTransformation
				if ((anInt6525 ^ 0xffffffff) == -1) {
					Class213.method2778(true, this);
				} else {
					final int i_61_ = anInt6527;
					final int i_62_ = anInt6524;
					final int i_63_ = anInt6522;
					final int i_64_ = anInt6517;
					final int i_65_ = anInt6514;
					anInt6527 = byteBuffer.readUnsignedShort((byte) 127);
					anInt6524 = byteBuffer.readUnsignedShort((byte) 127);
					anInt6522 = byteBuffer.readUnsignedShort((byte) 127);
					anInt6517 = byteBuffer.readUnsignedShort((byte) 127);
					anInt6514 = byteBuffer.readUnsignedByte((byte) -115);
					if (!bool != !(aBoolean6526) || (i_60_ != anInt6525)
							|| (i_61_ != anInt6527) || (i_62_ != anInt6524)
							|| (i_63_ != anInt6522) || (i_64_ != anInt6517)
							|| (anInt6514 != i_65_)) {
						Class322.method3674(0, this);
					}
				}
				if (appearance == null) {
					appearance = new Appearance();
				}
				final int i_66_ = ((appearance).anInt2684);
				final int[] is_67_ = (appearance.colour);
			
		
				appearance.updateAppearance(equipIDs, -59, (gender ^ 0xffffffff) == -2,
						colors, method3030((byte) 70), i_51_, compcols, maxcols);
			//	System.out.println(
			//			);
				if (i == 73) {
					if ((i_51_ ^ 0xffffffff) != (i_66_ ^ 0xffffffff)) {
						((Class246_Sub3) this).anInt5084 = (((((Entity) this).anIntArray6437[0]) << -1791062743) - -(method3034(0) << 2009592264));
						((Class246_Sub3) this).anInt5079 = (((((Entity) this).anIntArray6438[0]) << 845342377) - -(method3034(i ^ 0x49) << 1847977800));
					}
					if ((((Entity) this).anInt6369 ^ 0xffffffff) == (za_Sub2.anInt6080 ^ 0xffffffff)
							&& is_67_ != null) {
						for (int i_68_ = 0; colors.length > i_68_; i_68_++) {
							if ((is_67_[i_68_] ^ 0xffffffff) != (colors[i_68_] ^ 0xffffffff)) {
								Class98_Sub46_Sub19.aClass205_6068.method2717(i
										+ -9);
								break;
							}
						}
					}
					if (((Entity) this).aClass246_Sub5_6439 != null) {
						((Entity) this).aClass246_Sub5_6439
								.method3127();
					}
					if (((Entity) this).anInt6385 == -1
							|| !((Entity) this).aBoolean6359) {
						break;
					}
					final Class294 class294 = method3039(1);
					if (class294.method3480((byte) 119,
							(((Entity) this).anInt6385))) {
						break;
					}
					((Entity) this).aBoolean6359 = false;
					((Entity) this).anInt6385 = -1;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("gv.SA(" + (byteBuffer != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method2981(final Class246_Sub3 class246_sub3, final byte i,
			final boolean bool, final int i_69_, final ha var_ha,
			final int i_70_, final int i_71_) {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gv.CA("
					+ (class246_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + bool + ',' + i_69_ + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_70_ + ','
					+ i_71_ + ')'));
		}
	}

	@Override
	final boolean method2976(final int i, final ha var_ha, final byte i_73_,
			final int i_74_) {
		try {
			if (appearance == null
					|| !method3058((byte) -105, var_ha, 131072)) {
				return false;
			}
			final Class111 class111 = var_ha.method1793();
			final int i_75_ = ((Entity) this).aClass325_6399
					.method3698((byte) 116);
			class111.method2101(i_75_);
			class111.method2106(((Class246_Sub3) this).anInt5084,
					((Class246_Sub3) this).anInt5089,
					((Class246_Sub3) this).anInt5079);
			boolean bool = false;
			for (int i_76_ = 0; (((Entity) this).aClass146Array6441.length > i_76_); i_76_++) {
				if ((((Entity) this).aClass146Array6441[i_76_] != null)
						&& (Class239.aBoolean1839 ? (((Entity) this).aClass146Array6441[i_76_]
								.method2333(i, i_74_, class111, true, 0,
										Class16.anInt197))
								: ((Entity) this).aClass146Array6441[i_76_]
										.method2339(i, i_74_, class111, true, 0))) {
					bool = true;
					break;
				}
			}
			if (i_73_ < 59) {
				aBoolean6534 = true;
			}
			((Entity) this).aClass146Array6441[0] = ((Entity) this).aClass146Array6441[1] = ((Entity) this).aClass146Array6441[2] = null;
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gv.TA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_73_ + ','
					+ i_74_ + ')'));
		}
	}

	final String getNameForDisplay(final int i, final boolean bool) {
		try {
			String string = "";
			if (i != 0) {
				return null;
			}
			if (Class116.aStringArray966 != null) {
				string += Class116.aStringArray966[aByte6513];
			}
			int[] is;
			if ((gender ^ 0xffffffff) == -2 && SurfaceSkin.anIntArray333 != null) {
				is = SurfaceSkin.anIntArray333;
			} else {
				is = Class272.anIntArray2036;
			}
			if (is != null && (is[aByte6513] ^ 0xffffffff) != 0) {
				final Class306 class306 = Class98_Sub10_Sub16.aClass29_5620
						.method302(is[aByte6513], 1028602529);
				if ((class306.aChar2567 ^ 0xffffffff) == -116) {
					if (title <= 4) {
						string += class306.method3594(title & 0xff,
								(byte) 37);
					} else {
						string += CustomTitle(title);
					}
				} else {
					Class305_Sub1.method3585(new Throwable(), i + -126, "gdn1");
					is[aByte6513] = -1;
				}
			}
			if (!bool) {
				string += name2;
			} else {
				string += name;
			}
			if (Class84.aStringArray636 != null) {
				string += Class84.aStringArray636[aByte6513];
			}
			return string;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gv.PA(" + i + ','
					+ bool + ')');
		}
	}

	public String CustomTitle(final int tv) {
		final boolean male = gender == 0;
		switch (tv) {
		case 5:
			return "<col=c96300>The Amazing</col> ";
		case 6:
			return "<col=c96300>The Beautiful</col> ";
		case 7:
			if (male) {
				return "<col=c96300>Lord</col> ";
			}
			return "<col=c96300>Lady</col> ";
		case 9:
			if (male) {
				return "<col=c96300>Sir</col> ";
			}
			return "<col=c96300>Dame</col> ";
		case 11:
			if (male) {
				return "<col=c96300>Duderino</col> ";
			}
			return "<col=c96300>Dudette</col> ";
		case 13:
			return "<col=c96300>Crusader</col> ";
		case 14:
			return "<col=c96300>Hellraiser</col> ";
		case 15:
			return "<col=c96300>Desperado</col> ";
		case 16:
			if (male) {
				return "<col=c96300>Baron</col> ";
			}
			return "<col=c96300>Baroness</col> ";
		case 18:
			if (male) {
				return "<col=c96300>Count</col> ";
			}
			return "<col=c96300>Countess</col> ";
		case 20:
			if (male) {
				return "<col=c96300>Overlord</col> ";
			}
			return "<col=c96300>Overlordess</col> ";
		case 22:
			if (male) {
				return "<col=c96300>Prince</col> ";
			}
			return "<col=c96300>Princess</col> ";

		case 24:
			return "<col=c96300>Bandito</col> ";
		case 25:
			if (male) {
				return "<col=c96300>Duke</col> ";
			}
			return "<col=c96300>Duchess</col> ";
		case 27:
			return "<col=c96300>Justiciar</col> ";
		case 28:
			return "<col=c96300>Big Cheese</col> ";
		case 29:
			return "<col=c96300>Bigwig</col> ";
		case 30:
			if (male) {
				return "<col=c96300>King</col> ";
			}
			return "<col=c96300>Queen</col> ";
		case 32:
			return "<col=c96300>Archon</col> ";
		case 33:
			if (male) {
				return "<col=c96300>Emperor</col> ";
			}
			return "<col=c96300>Empress</col> ";
		case 35:
			return "<col=c96300>Wunderkind</col> ";
		case 36:
			if (male) {
				return "<col=c96300>Witch king</col> ";
			}
			return "<col=c96300>Witch queen</col> ";
		case 38:
			return "<col=c96300>The Awesome</col> ";
		case 39:
			return "<col=c96300>The Magnificent</col> ";
		case 40:
			return "<col=c96300>The Undefeated</col> ";
		case 41:
			return "<col=c96300>The Warrior</col> ";
		case 42:
			return "<col=c96300>The Strange</col> ";
		case 43:
			return "<col=c96300>The Divine</col> ";
		case 44:
			return "<col=c96300>The Fallen</col> ";
		}
		return "";
	}

	@Override
	final int method3035(final int i) {
		try {
			if (i != 28213) {
				method3062(null, (byte) -78);
			}
			return -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gv.T(" + i + ')');
		}
	}

	@Override
	final void method2988(final ha var_ha, final int i) {
		try {
			if (appearance != null
					&& (((Entity) this).aBoolean6440 || method3058(
							(byte) 35, var_ha, 0))) {
				final Class111 class111 = var_ha.method1793();
				class111.method2101(((Entity) this).aClass325_6399
						.method3698((byte) 116));
				class111.method2106(((Class246_Sub3) this).anInt5084,
						((Class246_Sub3) this).anInt5089 + -5,
						((Class246_Sub3) this).anInt5079);
				method3036(var_ha,
						((Entity) this).aBoolean6440,
						(byte) -126, class111,
						(((Entity) this).aClass146Array6441));
				((Entity) this).aClass146Array6441[0] = ((Entity) this).aClass146Array6441[1] = ((Entity) this).aClass146Array6441[2] = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gv.MA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final int method3034(final int i) {
		try {
			if (appearance != null
					&& ((appearance).anInt2684 ^ 0xffffffff) != 0) {
				return ((Class4.aClass301_85.method3538(i + 5,
						(appearance).anInt2684)).anInt1112);
			}
			if (i != 0) {
				return 57;
			}
			return super.method3034(0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gv.A(" + i + ')');
		}
	}

	public static void method3064(final int i) {
		try {
			if (i != -2485) {
				method3064(-115);
			}
			aClass196_6543 = null;
			aByteArrayArray6533 = null;
			aClass58_6516 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gv.OA(" + i + ')');
		}
	}

	@Override
	final void method2992(final byte i) {
		try {
			if (i != -73) {
				method3035(16);
			}
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gv.DA(" + i + ')');
		}
	}

	static final void method3065(final int i, final int i_78_,
			final boolean bool) {
		try {
			final Class28 class28 = Class76.aClass28ArrayArray586[i][i_78_];
			if (bool == true) {
				if (class28 != null) {
					Class48.anInt410 = class28.anInt284;
					InputStream_Sub2.anInt29 = class28.anInt282;
					OutputStream_Sub2.anInt40 = class28.anInt292;
				}
				Class230.method2870((byte) -74);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gv.UA(" + i + ','
					+ i_78_ + ',' + bool + ')'));
		}
	}

	@Override
	final Class246_Sub1 method2975(final ha var_ha, final int i) {
		try {
			if (appearance == null
					|| !method3058((byte) -122, var_ha, 2048)) {
				return null;
			}
			final Class111 class111 = var_ha.method1793();
			final int i_79_ = ((Entity) this).aClass325_6399
					.method3698((byte) 116);
			class111.method2101(i_79_);
			final Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[((Class246_Sub3) this).aByte5088][(((Class246_Sub3) this).anInt5084 >> Class151_Sub8.anInt5015)][(((Class246_Sub3) this).anInt5079 >> Class151_Sub8.anInt5015)]);
			if (class172 == null || class172.aClass246_Sub3_Sub1_1332 == null) {
				((Entity) this).anInt6351 -= (((Entity) this).anInt6351 / 10.0F);
			} else {
				final int i_80_ = (((Entity) this).anInt6351 - (class172.aClass246_Sub3_Sub1_1332.aShort6149));
				((Entity) this).anInt6351 -= i_80_ / 10.0F;
			}
			class111.method2106(((Class246_Sub3) this).anInt5084,
					(-((Entity) this).anInt6351
							+ ((Class246_Sub3) this).anInt5089 + -20),
					((Class246_Sub3) this).anInt5079);
			Class246_Sub1 class246_sub1 = null;
			if (i > -12) {
				return null;
			}
			((Entity) this).aBoolean6442 = false;
			if ((Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub26_4035
					.method662((byte) 120) ^ 0xffffffff) == -2) {
				final Class294 class294 = method3039(1);
				if (class294.aBoolean2400
						&& ((appearance).anInt2684 == -1 || (Class4.aClass301_85
								.method3538(5, (appearance.anInt2684))).aBoolean1130)) {
					final AnimationDefinition class97 = (((((Entity) this).anInt6413 ^ 0xffffffff) != 0 && ((Entity) this).anInt6400 == 0) ? (Class151_Sub7.aClass183_5001
							.method2623(
									((Entity) this).anInt6413,
									16383)) : null);
					final AnimationDefinition class97_81_ = (((((Entity) this).anInt6385 ^ 0xffffffff) == 0
							|| (aBoolean6520) || (((Entity) this).aBoolean6359 && class97 != null)) ? null
							: (Class151_Sub7.aClass183_5001.method2623(
									((Entity) this).anInt6385,
									16383)));
					final AbstractModel abstractModel = (Class102
							.method1703(
									class97_81_ == null ? class97 : class97_81_,
									((Entity) this).anInt6377,
									1,
									240,
									(((Entity) this).aClass146Array6441[0]),
									((Entity) this).anInt6388,
									i_79_,
									124,
									160,
									0,
									(class97_81_ == null ? ((Entity) this).anInt6393
											: ((Entity) this).anInt6350),
									var_ha, 0,
									((Entity) this).anInt6416));
					if (abstractModel != null) {
						class246_sub1 = (Class94
								.method915(
										1 + (((Entity) this).aClass146Array6441).length,
										(byte) -47, true));
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
			}
			if (this == Surface.player) {
				class111.method2100(((Class246_Sub3) this).anInt5084,
						((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5079);
				for (int i_82_ = -1 + Class104.aClass36Array903.length; (i_82_ ^ 0xffffffff) <= -1; i_82_--) {
					final Class36 class36 = Class104.aClass36Array903[i_82_];
					if (class36 != null && class36.anInt339 != -1) {
						if ((class36.anInt346 ^ 0xffffffff) == -2) {
							final Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254
									.method3990(class36.anInt345, -1)));
							if (class98_sub39 != null) {
								final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								final int i_83_ = (-(((Class246_Sub3) (Surface.player)).anInt5084) + (((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5084));
								final int i_84_ = (((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5079 - (((Class246_Sub3) (Surface.player)).anInt5079));
								if (!Class239.aBoolean1839) {
									method3066(
											i_84_,
											class111,
											i_83_,
											false,
											((Entity) this).aClass146Array6441[0],
											92160000, var_ha, class36.anInt339);
								} else {
									method3061(
											var_ha,
											i_84_,
											Class16.anInt197,
											i_83_,
											true,
											class111,
											92160000,
											class36.anInt339,
											((Entity) this).aClass146Array6441[0]);
								}
							}
						}
						if (class36.anInt346 == 2) {
							final int i_85_ = (-(((Class246_Sub3) (Surface.player)).anInt5084)
									+ class36.anInt338 - -256);
							final int i_86_ = (-(((Class246_Sub3) (Surface.player)).anInt5079) + 256 + class36.anInt347);
							int i_87_ = class36.anInt340 << 556190985;
							i_87_ *= i_87_;
							if (Class239.aBoolean1839) {
								method3061(
										var_ha,
										i_86_,
										Class16.anInt197,
										i_85_,
										true,
										class111,
										i_87_,
										class36.anInt339,
										(((Entity) this).aClass146Array6441[0]));
							} else {
								method3066(
										i_86_,
										class111,
										i_85_,
										false,
										(((Entity) this).aClass146Array6441[0]),
										i_87_, var_ha, class36.anInt339);
							}
						}
						if ((class36.anInt346 ^ 0xffffffff) == -11
								&& ((class36.anInt345 ^ 0xffffffff) <= -1)
								&& (class36.anInt345 < (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030).length)) {
							final Player class246_sub3_sub4_sub2_sub2_88_ = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[class36.anInt345]);
							if (class246_sub3_sub4_sub2_sub2_88_ != null) {
								final int i_89_ = ((((Class246_Sub3) class246_sub3_sub4_sub2_sub2_88_).anInt5084) - (((Class246_Sub3) (Surface.player)).anInt5084));
								final int i_90_ = (-(((Class246_Sub3) (Surface.player)).anInt5079) + (((Class246_Sub3) class246_sub3_sub4_sub2_sub2_88_).anInt5079));
								if (!Class239.aBoolean1839) {
									method3066(
											i_90_,
											class111,
											i_89_,
											false,
											((Entity) this).aClass146Array6441[0],
											92160000, var_ha, class36.anInt339);
								} else {
									method3061(
											var_ha,
											i_90_,
											Class16.anInt197,
											i_89_,
											true,
											class111,
											92160000,
											class36.anInt339,
											((Entity) this).aClass146Array6441[0]);
								}
							}
						}
					}
				}
				class111.method2101(i_79_);
				class111.method2106(((Class246_Sub3) this).anInt5084,
						((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5079);
			}
			class111.method2101(i_79_);
			class111.method2106(
					((Class246_Sub3) this).anInt5084,
					(-((Entity) this).anInt6351 + -5 + ((Class246_Sub3) this).anInt5089),
					((Class246_Sub3) this).anInt5079);
			if (class246_sub1 == null) {
				class246_sub1 = Class94
						.method915(
								(((Entity) this).aClass146Array6441).length,
								(byte) -47, true);
			}
			method3036(var_ha, false, (byte) -124, class111,
					(((Entity) this).aClass146Array6441));
			if (!Class239.aBoolean1839) {
				for (int i_91_ = 0; (((((Entity) this).aClass146Array6441).length ^ 0xffffffff) < (i_91_ ^ 0xffffffff)); i_91_++) {
					if ((((Entity) this).aClass146Array6441[i_91_]) != null) {
						((Entity) this).aClass146Array6441[i_91_]
								.method2325(
										class111,
										(class246_sub1.aClass246_Sub6Array5067[i_91_]),
										(Surface.player == this ? 1
												: 0));
					}
				}
			} else {
				for (int i_92_ = 0; (i_92_ ^ 0xffffffff) > ((((Entity) this).aClass146Array6441).length ^ 0xffffffff); i_92_++) {
					if ((((Entity) this).aClass146Array6441[i_92_]) != null) {
						((Entity) this).aClass146Array6441[i_92_]
								.method2329(
										class111,
										(class246_sub1.aClass246_Sub6Array5067[i_92_]),
										Class16.anInt197,
										(Surface.player != this ? 0
												: 1));
					}
				}
			}
			if (((Entity) this).aClass246_Sub5_6439 != null) {
				final Class242 class242 = ((Entity) this).aClass246_Sub5_6439
						.method3116();
				if (Class239.aBoolean1839) {
					var_ha.method1785(class242, Class16.anInt197);
				} else {
					var_ha.method1820(class242);
				}
			}
			for (int i_93_ = 0; (((Entity) this).aClass146Array6441.length > i_93_); i_93_++) {
				if (((Entity) this).aClass146Array6441[i_93_] != null) {
					((Entity) this).aBoolean6442 |= ((Entity) this).aClass146Array6441[i_93_]
							.F();
				}
			}
			((Entity) this).anInt6417 = Class64_Sub15.anInt3676;
			((Entity) this).aClass146Array6441[0] = ((Entity) this).aClass146Array6441[1] = ((Entity) this).aClass146Array6441[2] = null;
			return class246_sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gv.QA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final int method3030(final byte i) {
		try {
			if (i != 70) {
				method3030((byte) 12);
			}
			return renderAnim;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gv.G(" + i + ')');
		}
	}

	private final void method3066(final int i, final Class111 class111,
			final int i_94_, final boolean bool, final AbstractModel abstractModel,
			final int i_95_, final ha var_ha, final int i_96_) {
		do {
			try {
				final int i_97_ = i * i + i_94_ * i_94_;
				if (i_97_ >= 262144
						&& (i_97_ ^ 0xffffffff) >= (i_95_ ^ 0xffffffff)
						&& bool == false) {
					final int i_98_ = ((int) (Math.atan2(i_94_, i) * 2607.5945876176133) & 0x3fff);
					final AbstractModel class146_99_ = (Class98_Sub10_Sub16
							.method1052(
									((Entity) this).anInt6377,
									i_98_,
									((Entity) this).anInt6388,
									var_ha, i_96_, 94,
									((Entity) this).anInt6416));
					if (class146_99_ == null) {
						break;
					}
					var_ha.C(false);
					class146_99_.method2325(class111, null, 0);
					var_ha.C(true);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("gv.RA(" + i
						+ ',' + (class111 != null ? "{...}" : "null") + ','
						+ i_94_ + ',' + bool + ','
						+ (abstractModel != null ? "{...}" : "null") + ',' + i_95_
						+ ',' + (var_ha != null ? "{...}" : "null") + ','
						+ i_96_ + ')'));
			}
			break;
		} while (false);
	}

	public Player() {
		aByte6513 = (byte) 0;
		combatLevel = 0;
		anInt6524 = -1;
		aBoolean6532 = false;
		anInt6535 = -1;
		invisible = false;
		headIcon = -1;
		anInt6539 = 0;
		title = (byte) 0;
		anInt6514 = 255;
		anInt6525 = 0;
		aBoolean6534 = false;
		aBoolean6526 = false;
		anInt6528 = 0;
		anInt6522 = -1;
		anInt6527 = -1;
		gender = (byte) 0;
		aBoolean6520 = false;
		anInt6542 = 0;
	}

	static {
		aClass58_6516 = new IncomingOpcode(28, -2);
		aClass196_6543 = new Class196("WTQA", "office", "_qa", 2);
	}
}
