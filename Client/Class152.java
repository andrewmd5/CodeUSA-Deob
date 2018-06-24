/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class152 {
	private short[] aShortArray1217;
	private int[] anIntArray1218;
	private short[] aShortArray1219;
	Class83 aClass83_1220;
	static Class332 aClass332_1221;
	private final int[] anIntArray1222 = { -1, -1, -1, -1, -1 };
	private short[] aShortArray1223;
	private short[] aShortArray1224;

	final Model method2473(final int i) {
		try {
			if (anIntArray1218 == null) {
				return null;
			}
			final Model[] class178s = new Model[anIntArray1218.length];
			synchronized (aClass83_1220.aClass207_631) {
				if (i != 2) {
					aClass332_1221 = null;
				}
				for (int i_0_ = 0; anIntArray1218.length > i_0_; i_0_++) {
					class178s[i_0_] = RSModelLoader.createModel(0, -9252,
							((aClass83_1220).aClass207_631),
							anIntArray1218[i_0_]);
				}
			}
			for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (anIntArray1218.length ^ 0xffffffff); i_1_++) {
				if (class178s[i_1_].version < 13) {
					class178s[i_1_].method2592(i ^ 0x35b0, 2);
				}
			}
			Model model;
			if ((class178s.length ^ 0xffffffff) != -2) {
				model = new Model(class178s, class178s.length);
			} else {
				model = class178s[0];
			}
			if (model == null) {
				return null;
			}
			if (aShortArray1219 != null) {
				for (int i_2_ = 0; ((aShortArray1219.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff)); i_2_++) {
					model.method2593(0, aShortArray1219[i_2_],
							aShortArray1217[i_2_]);
				}
			}
			if (aShortArray1224 != null) {
				for (int i_3_ = 0; i_3_ < aShortArray1224.length; i_3_++) {
					model.method2590(aShortArray1223[i_3_], (byte) -114,
							aShortArray1224[i_3_]);
				}
			}
			return model;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ke.F(" + i + ')');
		}
	}

	final boolean method2474(final int i) {
		try {
			boolean bool = true;
			synchronized (aClass83_1220.aClass207_631) {
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -6; i_4_++) {
					if ((anIntArray1222[i_4_] ^ 0xffffffff) != 0
							&& !aClass83_1220.aClass207_631.method2751(0,
									anIntArray1222[i_4_], -6329)) {
						bool = false;
					}
				}
			}
			if (i < 105) {
				return true;
			}
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ke.A(" + i + ')');
		}
	}

	final boolean method2475(final int i) {
		try {
			if (anIntArray1218 == null) {
				return true;
			}
			boolean bool = true;
			synchronized (aClass83_1220.aClass207_631) {
				for (int i_5_ = i; i_5_ < anIntArray1218.length; i_5_++) {
					if (!aClass83_1220.aClass207_631.method2751(0,
							anIntArray1218[i_5_], i + -6329)) {
						bool = false;
					}
				}
			}
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ke.D(" + i + ')');
		}
	}

	final Model method2476(final byte i) {
		try {
			final Model[] class178s = new Model[5];
			int i_6_ = 0;
			synchronized (aClass83_1220.aClass207_631) {
				for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -6; i_7_++) {
					if ((anIntArray1222[i_7_] ^ 0xffffffff) != 0) {
						class178s[i_6_++] = RSModelLoader.createModel(0, -9252,
								((aClass83_1220).aClass207_631),
								anIntArray1222[i_7_]);
					}
				}
			}
			for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -6; i_8_++) {
				if (class178s[i_8_] != null && class178s[i_8_].version < 13) {
					class178s[i_8_].method2592(13746, 2);
				}
			}
			final Model model = new Model(class178s, i_6_);
			if (aShortArray1219 != null) {
				for (int i_10_ = 0; ((i_10_ ^ 0xffffffff) > (aShortArray1219.length ^ 0xffffffff)); i_10_++) {
					model.method2593(0, aShortArray1219[i_10_],
							aShortArray1217[i_10_]);
				}
			}
			if (aShortArray1224 != null) {
				for (int i_11_ = 0; aShortArray1224.length > i_11_; i_11_++) {
					model.method2590(aShortArray1223[i_11_], (byte) -93,
							aShortArray1224[i_11_]);
				}
			}
			return model;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ke.I(" + i + ')');
		}
	}

	static final String method2477(final int i) {
		try {
			if (Player.aBoolean6540
					|| Class266.aClass98_Sub46_Sub8_1994 == null) {
				return "";
			}
			if (((Class266.aClass98_Sub46_Sub8_1994.aString5992) == null || (Class266.aClass98_Sub46_Sub8_1994.aString5992
					.length() ^ 0xffffffff) == -1)
					&& (Class266.aClass98_Sub46_Sub8_1994.aString5985) != null
					&& Class266.aClass98_Sub46_Sub8_1994.aString5985.length() > 0) {
				return (Class266.aClass98_Sub46_Sub8_1994.aString5985);
			}
			if (i != 29558) {
				aClass332_1221 = null;
			}
			return (Class266.aClass98_Sub46_Sub8_1994.aString5992);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ke.B(" + i + ')');
		}
	}

	static final void method2478(final int i, final int i_12_,
			final Class185 class185, final int i_13_, final int i_14_,
			final int i_15_) {
		try {
			if (i_14_ <= -1) {
				Class98_Sub33 class98_sub33 = null;
				for (Class98_Sub33 class98_sub33_16_ = ((Class98_Sub33) Class98_Sub11.aClass148_3866
						.method2418(32)); class98_sub33_16_ != null; class98_sub33_16_ = ((Class98_Sub33) Class98_Sub11.aClass148_3866
						.method2417(106))) {
					if (class98_sub33_16_.anInt4116 == i_15_
							&& (i_13_ == class98_sub33_16_.anInt4112)
							&& i == class98_sub33_16_.anInt4113
							&& (class98_sub33_16_.anInt4118 ^ 0xffffffff) == (i_12_ ^ 0xffffffff)) {
						class98_sub33 = class98_sub33_16_;
						break;
					}
				}
				if (class98_sub33 == null) {
					class98_sub33 = new Class98_Sub33();
					class98_sub33.anInt4113 = i;
					class98_sub33.anInt4118 = i_12_;
					class98_sub33.anInt4112 = i_13_;
					class98_sub33.anInt4116 = i_15_;
					Class98_Sub11.aClass148_3866.method2419(class98_sub33,
							-20911);
				}
				class98_sub33.aClass185_4125 = class185;
				class98_sub33.aBoolean4124 = false;
				class98_sub33.aBoolean4123 = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ke.C(" + i + ','
					+ i_12_ + ',' + (class185 != null ? "{...}" : "null") + ','
					+ i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	private final void method2479(final ByteBuffer class98_sub22,
			final int i, final byte i_17_) {
		try {
			if ((i ^ 0xffffffff) != -2) {
				if ((i ^ 0xffffffff) != -3) {
					if (i != 3) {
						if ((i ^ 0xffffffff) == -41) {
							final int i_19_ = class98_sub22
									.readUnsignedByte((byte) 107);
							aShortArray1217 = new short[i_19_];
							aShortArray1219 = new short[i_19_];
							for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff); i_20_++) {
								aShortArray1219[i_20_] = (short) class98_sub22
										.readUnsignedShort((byte) 127);
								aShortArray1217[i_20_] = (short) class98_sub22
										.readUnsignedShort((byte) 127);
							}
						} else if (i != 41) {
							if ((i ^ 0xffffffff) <= -61
									&& (i ^ 0xffffffff) > -71) {
								anIntArray1222[-60 + i] = class98_sub22
										.readUnsignedShort((byte) 127);
							}
						} else {
							final int i_21_ = class98_sub22
									.readUnsignedByte((byte) -123);
							aShortArray1223 = new short[i_21_];
							aShortArray1224 = new short[i_21_];
							for (int i_22_ = 0; i_21_ > i_22_; i_22_++) {
								aShortArray1224[i_22_] = (short) class98_sub22
										.readUnsignedShort((byte) 127);
								aShortArray1223[i_22_] = (short) class98_sub22
										.readUnsignedShort((byte) 127);
							}
						}
					}
				} else {
					final int i_23_ = class98_sub22
							.readUnsignedByte((byte) 100);
					anIntArray1218 = new int[i_23_];
					for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (i_23_ ^ 0xffffffff); i_24_++) {
						anIntArray1218[i_24_] = class98_sub22
								.readUnsignedShort((byte) 127);
					}
				}
			} else {
				class98_sub22.readUnsignedByte((byte) -111);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ke.G("
					+ (class98_sub22 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_17_ + ')'));
		}
	}

	final void method2480(final boolean bool, final ByteBuffer class98_sub22) {
		do {
			try {
				for (;;) {
					final int i = class98_sub22.readUnsignedByte((byte) 95);
					if ((i ^ 0xffffffff) == -1) {
						break;
					}
					method2479(class98_sub22, i, (byte) 115);
				}
				if (bool == false) {
					break;
				}
				method2475(44);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27
						.printError(runtimeexception,
								("ke.E("
										+ bool
										+ ','
										+ (class98_sub22 != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	public Class152() {
		/* empty */
	}

	public static void method2481(final boolean bool) {
		try {
			if (bool == false) {
				aClass332_1221 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ke.H(" + bool
					+ ')');
		}
	}

	static {
		new Class105("", 76);
	}
}
