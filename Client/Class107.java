/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class107 {
	boolean aBoolean909;
	int anInt910 = -1;
	private short[] aShortArray911;
	static String aString912;
	private short[] aShortArray913;
	private int anInt914;
	private int anInt915;
	private int anInt916;
	private int anInt917;
	private int anInt918;
	private short[] aShortArray919;
	private int anInt920;
	Class304 aClass304_921;
	private short[] aShortArray922;
	byte aByte923;
	private int anInt924;
	int anInt925;

	static final int method1720(final int i, final int i_0_, final int i_1_,
			int i_2_) {
		try {
			i_2_ &= 0x3;
			if ((i_2_ ^ 0xffffffff) == -1) {
				return i;
			}
			if ((i_2_ ^ 0xffffffff) == -2) {
				return i_1_;
			}
			if (i_0_ != 0) {
				aString912 = null;
			}
			if (i_2_ == 2) {
				return -i + 7;
			}
			return -i_1_ + 7;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final Class146 method1721(final ha var_ha, final int i, final int i_3_,
			final int i_4_, final AnimationDefParser class183, final int i_5_,
			final int i_6_) {
		try {
			if (i_3_ != 21945) {
				method1724(49, -89, -82, -97);
			}
			return method1723(i_4_, i_6_, 0, i, null, null, 0, (byte) 5,
					class183, false, var_ha, false, 0, i_5_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.D("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ','
					+ i_3_ + ',' + i_4_ + ','
					+ (class183 != null ? "{...}" : "null") + ',' + i_5_ + ','
					+ i_6_ + ')'));
		}
	}

	final Class146 method1722(final ha var_ha,
			final AnimationDefParser class183, final int i, final int i_7_,
			final int i_8_, final boolean bool, final s var_s, final int i_9_,
			final int i_10_, final s var_s_11_, final int i_12_,
			final int i_13_, final byte i_14_) {
		try {
			if (i_14_ != 2) {
				return null;
			}
			return method1723(i_7_, i, i_9_, i_13_, var_s_11_, var_s, i_8_,
					(byte) 2, class183, false, var_ha, bool, i_12_, i_10_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.B("
					+ (var_ha != null ? "{...}" : "null") + ','
					+ (class183 != null ? "{...}" : "null") + ',' + i + ','
					+ i_7_ + ',' + i_8_ + ',' + bool + ','
					+ (var_s != null ? "{...}" : "null") + ',' + i_9_ + ','
					+ i_10_ + ',' + (var_s_11_ != null ? "{...}" : "null")
					+ ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	private final Class146 method1723(final int i, final int i_15_,
			final int i_16_, final int i_17_, final s var_s, final s var_s_18_,
			final int i_19_, final byte i_20_,
			final AnimationDefParser class183, final boolean bool,
			final ha var_ha, boolean bool_21_, final int i_22_, final int i_23_) {
		try {
			int i_24_ = i;
			final AnimationDefinition class97 = ((anInt910 == -1 || (i_15_ ^ 0xffffffff) == 0) ? null
					: class183.method2623(anInt910, 16383));
			bool_21_ = bool_21_ & (aByte923 ^ 0xffffffff) != -1;
			if (bool != false) {
				anInt918 = 18;
			}
			if (class97 != null) {
				i_24_ |= class97.method932(false, i_15_, true, i_17_);
			}
			if (bool_21_) {
				i_24_ = i_24_ | ((aByte923 ^ 0xffffffff) != -4 ? 2 : 7);
			}
			if (anInt916 != 128) {
				i_24_ |= 0x2;
			}
			if ((anInt920 ^ 0xffffffff) != -129
					|| (anInt924 ^ 0xffffffff) != -1) {
				i_24_ |= 0x5;
			}
			Class146 class146;
			synchronized (aClass304_921.aClass79_2537) {
				class146 = (Class146) (aClass304_921.aClass79_2537.method802(
						-125, anInt925 |= (var_ha.anInt937 << 1821407229)));
			}
			if (class146 == null || var_ha.c(class146.ua(), i_24_) != 0) {
				if (class146 != null) {
					i_24_ = var_ha.method1777(i_24_, class146.ua());
				}
				int i_25_ = i_24_;
				if (aShortArray922 != null) {
					i_25_ |= 0x4000;
				}
				if (aShortArray913 != null) {
					i_25_ |= 0x8000;
				}
				final Model model = Class98_Sub6.method981(0, -9252,
						(aClass304_921.aClass207_2536), anInt914);
				if (model == null) {
					return null;
				}
				if (model.version < 13) {
					model.method2592(13746, 2);
				}
				class146 = var_ha.method1790(model, i_25_,
						(aClass304_921.anInt2539), 64 + anInt915,
						850 + anInt917);
				if (aShortArray922 != null) {
					for (int i_26_ = 0; i_26_ < aShortArray922.length; i_26_++) {
						class146.ia(aShortArray922[i_26_],
								aShortArray919[i_26_]);
					}
				}
				if (aShortArray913 != null) {
					for (int i_27_ = 0; aShortArray913.length > i_27_; i_27_++) {
						class146.aa(aShortArray913[i_27_],
								aShortArray911[i_27_]);
					}
				}
				class146.s(i_24_);
				synchronized (aClass304_921.aClass79_2537) {
					aClass304_921.aClass79_2537.method805(
							anInt925 |= var_ha.anInt937 << 378441757, class146,
							(byte) -80);
				}
			}
			final Class146 class146_28_ = (class97 != null ? class97.method930(
					i_20_, 0, i_15_, i_24_, i_17_, (byte) 86, class146, i_23_)
					: class146.method2341(i_20_, i_24_, true));
			if ((anInt920 ^ 0xffffffff) != -129 || anInt916 != 128) {
				class146_28_.O(anInt920, anInt916, anInt920);
			}
			if (anInt924 != 0) {
				if ((anInt924 ^ 0xffffffff) == -91) {
					class146_28_.a(4096);
				}
				if (anInt924 == 180) {
					class146_28_.a(8192);
				}
				if (anInt924 == 270) {
					class146_28_.a(12288);
				}
			}
			if (bool_21_) {
				class146_28_.p(aByte923, anInt918, var_s, var_s_18_, i_19_,
						i_16_, i_22_);
			}
			class146_28_.s(i);
			return class146_28_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.C(" + i + ','
					+ i_15_ + ',' + i_16_ + ',' + i_17_ + ','
					+ (var_s != null ? "{...}" : "null") + ','
					+ (var_s_18_ != null ? "{...}" : "null") + ',' + i_19_
					+ ',' + i_20_ + ',' + (class183 != null ? "{...}" : "null")
					+ ',' + bool + ',' + (var_ha != null ? "{...}" : "null")
					+ ',' + bool_21_ + ',' + i_22_ + ',' + i_23_ + ')'));
		}
	}

	static final int method1724(final int i, int i_29_, final int i_30_,
			final int i_31_) {
		try {
			i_29_ &= 0x3;
			if ((i_29_ ^ 0xffffffff) == -1) {
				return i_30_;
			}
			if (i != 7) {
				return -123;
			}
			if (i_29_ == 1) {
				return 4095 - i_31_;
			}
			if ((i_29_ ^ 0xffffffff) == -3) {
				return -i_30_ + 4095;
			}
			return i_31_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.G(" + i + ','
					+ i_29_ + ',' + i_30_ + ',' + i_31_ + ')'));
		}
	}

	final void method1725(final int i, final ByteBuffer class98_sub22) {
		try {
			if (i != 0) {
				method1722(null, null, -47, 65, -101, false, null, 26, 120,
						null, -16, -44, (byte) -122);
			}
			for (;;) {
				final int i_32_ = class98_sub22.readUnsignedByte((byte) -114);
				if (i_32_ == 0) {
					break;
				}
				method1727(i + -120, class98_sub22, i_32_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.A(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1726(final boolean bool) {
		try {
			if (bool == false) {
				aString912 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gp.E(" + bool
					+ ')');
		}
	}

	private final void method1727(final int i,
			final ByteBuffer class98_sub22, final int i_33_) {
		try {
			if (i_33_ == 1) {
				anInt914 = class98_sub22.readIntSmart2();
			} else if (i_33_ == 2) {
				anInt910 = class98_sub22.readUnsignedShort((byte) 127);
			} else if (i_33_ == 4) {
				anInt920 = class98_sub22.readUnsignedShort((byte) 127);
			} else if (i_33_ != 5) {
				if ((i_33_ ^ 0xffffffff) == -7) {
					anInt924 = class98_sub22.readUnsignedShort((byte) 127);
				} else if (i_33_ == 7) {
					anInt915 = class98_sub22.readUnsignedByte((byte) -120);
				} else if ((i_33_ ^ 0xffffffff) == -9) {
					anInt917 = class98_sub22.readUnsignedByte((byte) 62);
				} else if (i_33_ == 9) {
					anInt918 = 8224;
					aByte923 = (byte) 3;
				} else if ((i_33_ ^ 0xffffffff) == -11) {
					aBoolean909 = true;
				} else if (i_33_ != 11) {
					if ((i_33_ ^ 0xffffffff) == -13) {
						aByte923 = (byte) 4;
					} else if (i_33_ != 13) {
						if ((i_33_ ^ 0xffffffff) == -15) {
							aByte923 = (byte) 2;
							anInt918 = 256 * class98_sub22
									.readUnsignedByte((byte) 91);
						} else if ((i_33_ ^ 0xffffffff) == -16) {
							aByte923 = (byte) 3;
							anInt918 = class98_sub22.readUnsignedShort((byte) 127);
						} else if (i_33_ == 16) {
							aByte923 = (byte) 3;
							anInt918 = class98_sub22.readInt(-2);
						} else if (i_33_ != 40) {
							if (i_33_ == 41) {
								final int i_34_ = class98_sub22
										.readUnsignedByte((byte) 95);
								aShortArray913 = new short[i_34_];
								aShortArray911 = new short[i_34_];
								for (int i_35_ = 0; i_34_ > i_35_; i_35_++) {
									aShortArray913[i_35_] = (short) class98_sub22
											.readUnsignedShort((byte) 127);
									aShortArray911[i_35_] = (short) class98_sub22
											.readUnsignedShort((byte) 127);
								}
							}
						} else {
							final int i_36_ = class98_sub22
									.readUnsignedByte((byte) 75);
							aShortArray919 = new short[i_36_];
							aShortArray922 = new short[i_36_];
							for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
								aShortArray922[i_37_] = (short) class98_sub22
										.readUnsignedShort((byte) 127);
								aShortArray919[i_37_] = (short) class98_sub22
										.readUnsignedShort((byte) 127);
							}
						}
					} else {
						aByte923 = (byte) 5;
					}
				} else {
					aByte923 = (byte) 1;
				}
			} else {
				anInt916 = class98_sub22.readUnsignedShort((byte) 127);
			}
			if (i >= -49) {
				anInt920 = 7;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("gp.H(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i_33_ + ')'));
		}
	}

	final Class146 method1728(final int i, final AnimationDefParser class183,
			final int i_38_, final int i_39_, final byte i_40_,
			final int i_41_, final ha var_ha) {
		try {
			return method1723(i_38_, i, 0, i_41_, null, null, 0, (byte) 2,
					class183, false, var_ha, false, 0, i_39_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gp.I(" + i + ','
					+ (class183 != null ? "{...}" : "null") + ',' + i_38_ + ','
					+ i_39_ + ',' + i_40_ + ',' + i_41_ + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	public Class107() {
		aBoolean909 = false;
		anInt917 = 0;
		anInt916 = 128;
		anInt918 = -1;
		anInt924 = 0;
		aByte923 = (byte) 0;
		anInt915 = 0;
		anInt920 = 128;
	}
}
