/* Class246_Sub3_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub2_Sub1 extends Class246_Sub3_Sub2 {
	static IncomingOpcode aClass58_6335 = new IncomingOpcode(65, -1);
	private boolean aBoolean6336 = false;
	int anInt6337;
	int anInt6338;
	int anInt6339 = 0;
	int anInt6340;
	int anInt6341;
	static OutgoingOpcode aClass171_6342 = new OutgoingOpcode(73, 8);
	int anInt6343 = -1;
	private int anInt6344 = 0;
	static int anInt6345 = 0;
	int anInt6346;

	@Override
	final boolean method2978(final int i) {
		try {
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "iha.H(" + i + ')');
		}
	}

	static final Class31 method3006(final String string, final int i,
			final int i_1_) {
		try {
			Class31 class31;
			try {
				class31 = (Class31) Class.forName("Class31_Sub2").newInstance();
			} catch (final Throwable throwable) {
				class31 = new Class31_Sub1();
			}
			class31.anInt302 = i_1_;
			if (i != 0) {
				return null;
			}
			class31.aString299 = string;
			return class31;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("iha.B("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ i_1_ + ')'));
		}
	}

	static final boolean method3007(final int i, final int i_2_, final byte i_3_) {
		try {
			if (i_3_ != -15) {
				return false;
			}
			if (!((0x40000 & i ^ 0xffffffff) != -1 | Class64_Sub10.method594(i,
					6, i_2_)) && !Class228.method2864(55, i, i_2_)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("iha.C(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	@Override
	final boolean method2987(final int i) {
		try {
			if (i != 6540) {
				return true;
			}
			return aBoolean6336;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "iha.I(" + i + ')');
		}
	}

	@Override
	final Class246_Sub1 method2975(final ha var_ha, final int i) {
		try {
			final Class154 class154 = Class94
					.method914(
							((Class246_Sub3) this).aByte5088,
							(((Class246_Sub3) this).anInt5084 >> Class151_Sub8.anInt5015),
							(((Class246_Sub3) this).anInt5079 >> Class151_Sub8.anInt5015));
			if (class154 != null
					&& (class154.aClass246_Sub3_Sub4_1232.aBoolean6162)) {
				final int i_4_ = class154.aClass246_Sub3_Sub4_1232
						.method2990(0);
				if (anInt6339 != i_4_) {
					((Class246_Sub3) this).anInt5089 -= anInt6339;
					((Class246_Sub3) this).anInt5089 += i_4_;
					anInt6339 = i_4_;
				}
			}
			final Class111 class111 = var_ha.method1793();
			class111.method2091();
			if (i > -12) {
				return null;
			}
			if (class154 == null
					|| !(class154.aClass246_Sub3_Sub4_1232.aBoolean6162)) {
				final s var_s = Class78.aSArray594[((Class246_Sub3) this).aByte5081];
				final int i_7_ = anInt6344 << -1155039327;
				final int i_8_ = i_7_;
				final int i_9_ = -i_7_ / 2;
				final int i_10_ = -i_8_ / 2;
				final int i_11_ = var_s.method3417(
						(((Class246_Sub3) this).anInt5084 - -i_9_),
						(((Class246_Sub3) this).anInt5079 - -i_10_), true);
				final int i_12_ = i_7_ / 2;
				final int i_13_ = -i_8_ / 2;
				final int i_14_ = var_s.method3417(
						(((Class246_Sub3) this).anInt5084 + i_12_),
						(((Class246_Sub3) this).anInt5079 - -i_13_), true);
				final int i_15_ = -i_7_ / 2;
				final int i_16_ = i_8_ / 2;
				final int i_17_ = var_s.method3417(
						(((Class246_Sub3) this).anInt5084 - -i_15_),
						(((Class246_Sub3) this).anInt5079 - -i_16_), true);
				final int i_18_ = i_7_ / 2;
				final int i_19_ = i_8_ / 2;
				final int i_20_ = var_s.method3417(i_18_
						+ (((Class246_Sub3) this).anInt5084), i_19_
						+ (((Class246_Sub3) this).anInt5079), true);
				final int i_21_ = i_14_ <= i_11_ ? i_14_ : i_11_;
				final int i_22_ = ((i_20_ ^ 0xffffffff) >= (i_17_ ^ 0xffffffff) ? i_20_
						: i_17_);
				final int i_23_ = ((i_14_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff) ? i_14_
						: i_20_);
				final int i_24_ = ((i_11_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff) ? i_11_
						: i_17_);
				if (i_8_ != 0) {
					final int i_25_ = (0x3fff & (int) (2607.5945876176133 * Math
							.atan2(i_21_ - i_22_, i_8_)));
					if ((i_25_ ^ 0xffffffff) != -1) {
						class111.method2105(i_25_);
					}
				}
				if ((i_7_ ^ 0xffffffff) != -1) {
					final int i_26_ = (0x3fff & (int) (2607.5945876176133 * Math
							.atan2(-i_23_ + i_24_, i_7_)));
					if (i_26_ != 0) {
						class111.method2090(-i_26_);
					}
				}
				int i_27_ = i_20_ + i_11_;
				if ((i_27_ ^ 0xffffffff) < (i_14_ + i_17_ ^ 0xffffffff)) {
					i_27_ = i_17_ + i_14_;
				}
				i_27_ = (i_27_ >> 147921889) - ((Class246_Sub3) this).anInt5089;
				if ((i_27_ ^ 0xffffffff) != -1) {
					class111.method2106(0, i_27_, 0);
				}
			}
			class111.method2106(((Class246_Sub3) this).anInt5084, -10
					+ ((Class246_Sub3) this).anInt5089,
					((Class246_Sub3) this).anInt5079);
			final Class246_Sub1 class246_sub1 = Class94.method915(3,
					(byte) -47, true);
			aBoolean6336 = false;
			anInt6344 = 0;
			if ((anInt6343 ^ 0xffffffff) != 0) {
				final AbstractModel abstractModel = (Class98_Sub46_Sub19.aClass205_6068
						.method2714(anInt6343, (byte) -118).method3501(0, 2048,
						0, null, -1, var_ha, anInt6337, 128, null));
				if (abstractModel != null) {
					if (!Class239.aBoolean1839) {
						abstractModel.method2325(class111,
								(class246_sub1.aClass246_Sub6Array5067[2]), 0);
					} else {
						abstractModel.method2329(class111,
								(class246_sub1.aClass246_Sub6Array5067[2]),
								Class16.anInt197, 0);
					}
					aBoolean6336 |= abstractModel.F();
					anInt6344 = abstractModel.ma();
				}
			}
			if (anInt6341 != -1) {
				final AbstractModel abstractModel = (Class98_Sub46_Sub19.aClass205_6068
						.method2714(anInt6341, (byte) -122).method3501(0, 2048,
						0, null, -1, var_ha, anInt6346, 128, null));
				if (abstractModel != null) {
					if (!Class239.aBoolean1839) {
						abstractModel.method2325(class111,
								(class246_sub1.aClass246_Sub6Array5067[1]), 0);
					} else {
						abstractModel.method2329(class111,
								(class246_sub1.aClass246_Sub6Array5067[1]),
								Class16.anInt197, 0);
					}
					aBoolean6336 |= abstractModel.F();
					if (abstractModel.ma() > anInt6344) {
						anInt6344 = abstractModel.ma();
					}
				}
			}
			final AbstractModel abstractModel = (Class98_Sub46_Sub19.aClass205_6068
					.method2714(anInt6340, (byte) -121).method3501(0, 2048, 0,
					null, -1, var_ha, anInt6338, 128, null));
			if (abstractModel != null) {
				if (Class239.aBoolean1839) {
					abstractModel.method2329(class111,
							(class246_sub1.aClass246_Sub6Array5067[0]),
							Class16.anInt197, 0);
				} else {
					abstractModel.method2325(class111,
							(class246_sub1.aClass246_Sub6Array5067[0]), 0);
				}
				aBoolean6336 |= abstractModel.F();
				if ((abstractModel.ma() ^ 0xffffffff) < (anInt6344 ^ 0xffffffff)) {
					anInt6344 = abstractModel.ma();
				}
			}
			return class246_sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("iha.QA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final int method2985(final boolean bool) {
		try {
			if (bool != false) {
				aClass171_6342 = null;
			}
			return anInt6344;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "iha.O(" + bool
					+ ')');
		}
	}

	static final void method3008(final byte i) {
		try {
			synchronized (Class299.aClass79_2493) {
				if (i != 60) {
					/* empty */
				} else {
					Class299.aClass79_2493.method806((byte) -114);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "iha.E(" + i + ')');
		}
	}

	@Override
	final int method2986(final int i) {
		try {
			if (i != -14240) {
				return 114;
			}
			final ItemDefs class297 = (Class98_Sub46_Sub19.aClass205_6068
					.method2714(anInt6340, (byte) -116));
			int i_28_ = class297.anInt2445;
			if (anInt6341 != -1) {
				final ItemDefs class297_29_ = (Class98_Sub46_Sub19.aClass205_6068
						.method2714(anInt6341, (byte) -122));
				if ((class297_29_.anInt2445 ^ 0xffffffff) < (i_28_ ^ 0xffffffff)) {
					i_28_ = class297_29_.anInt2445;
				}
			}
			if ((anInt6343 ^ 0xffffffff) != 0) {
				final ItemDefs class297_30_ = (Class98_Sub46_Sub19.aClass205_6068
						.method2714(anInt6343, (byte) -118));
				if ((i_28_ ^ 0xffffffff) > (class297_30_.anInt2445 ^ 0xffffffff)) {
					i_28_ = class297_30_.anInt2445;
				}
			}
			return i_28_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "iha.FB(" + i + ')');
		}
	}

	@Override
	final boolean method2976(final int i, final ha var_ha, final byte i_31_,
			final int i_32_) {
		try {
			if (i_31_ < 59) {
				method2990(-84);
			}
			final Class111 class111 = var_ha.method1793();
			class111.method2100(((Class246_Sub3) this).anInt5084,
					((Class246_Sub3) this).anInt5089 + -10,
					((Class246_Sub3) this).anInt5079);
			final ItemDefs class297 = (Class98_Sub46_Sub19.aClass205_6068
					.method2714(anInt6340, (byte) -118));
			AbstractModel abstractModel = class297.method3501(0, 131072, 0, null, -1,
					var_ha, (anInt6338), 128, null);
			if (abstractModel != null
					&& (Class239.aBoolean1839 ? abstractModel.method2333(i, i_32_,
							class111, true, class297.anInt2445,
							Class16.anInt197) : abstractModel.method2339(i, i_32_,
							class111, true, class297.anInt2445))) {
				return true;
			}
			if ((anInt6341 ^ 0xffffffff) != 0) {
				final ItemDefs class297_33_ = (Class98_Sub46_Sub19.aClass205_6068
						.method2714(anInt6341, (byte) -121));
				abstractModel = class297_33_.method3501(0, 131072, 0, null, -1,
						var_ha, (anInt6346), 128, null);
				if (abstractModel != null
						&& (Class239.aBoolean1839 ? abstractModel.method2333(i,
								i_32_, class111, true,
								(class297_33_.anInt2445), Class16.anInt197)
								: abstractModel.method2339(i, i_32_, class111, true,
										(class297_33_.anInt2445)))) {
					return true;
				}
			}
			if (anInt6343 != -1) {
				final ItemDefs class297_34_ = (Class98_Sub46_Sub19.aClass205_6068
						.method2714(anInt6343, (byte) -127));
				abstractModel = class297_34_.method3501(0, 131072, 0, null, -1,
						var_ha, (anInt6337), 128, null);
				if (abstractModel != null
						&& (Class239.aBoolean1839 ? abstractModel.method2333(i,
								i_32_, class111, true,
								(class297_34_.anInt2445), Class16.anInt197)
								: abstractModel.method2339(i, i_32_, class111, true,
										(class297_34_.anInt2445)))) {
					return true;
				}
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("iha.TA(" + i
					+ ',' + (var_ha != null ? "{...}" : "null") + ',' + i_31_
					+ ',' + i_32_ + ')'));
		}
	}

	@Override
	final int method2990(final int i) {
		try {
			if (i != 0) {
				anInt6343 = 51;
			}
			return -10;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "iha.J(" + i + ')');
		}
	}

	static final void method3009(final int i,
			final Class98_Sub46_Sub8 class98_sub46_sub8, final int i_35_,
			final int i_36_, final int i_37_, final int i_38_, final int i_39_,
			final ha var_ha, final int i_40_, final int i_41_, int i_42_,
			final int i_43_) {
		do {
			try {
				if ((i_39_ ^ 0xffffffff) < (i_43_ ^ 0xffffffff)
						&& i_39_ < i_36_ + i_43_ && i_40_ > -13 + i_37_
						&& i_40_ < 3 + i_37_ && class98_sub46_sub8.aBoolean5984) {
					i_42_ = i_35_;
				}
				int[] is = null;
				if (!Class299_Sub2.method3526(119,
						(class98_sub46_sub8.anInt5990))) {
					if (class98_sub46_sub8.anInt5988 == -1) {
						if (!Class36.method340(class98_sub46_sub8.anInt5990,
								(byte) -87)) {
							if (Class98_Sub10_Sub21.method1064(
									(class98_sub46_sub8.anInt5990), false)) {
								GameObjectDefinition class352;
								if (((class98_sub46_sub8.anInt5990) ^ 0xffffffff) == -1010) {
									class352 = (Class130.aClass302_1028
											.method3546(
													(int) (class98_sub46_sub8.aLong5987),
													(byte) 119));
								} else {
									class352 = (Class130.aClass302_1028
											.method3546(
													(int) (0x7fffffffL & ((class98_sub46_sub8.aLong5987) >>> 615469152)),
													(byte) 119));
								}
								if (class352.anIntArray2928 != null) {
									class352 = class352
											.method3852(
													(Class75.aClass140_584),
													(byte) -66);
								}
								if (class352 != null) {
									is = class352.anIntArray2934;
								}
							}
						} else {
							final Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254
									.method3990(
											(int) (class98_sub46_sub8.aLong5987),
											-1)));
							if (class98_sub39 != null) {
								final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								NPC class141 = (class246_sub3_sub4_sub2_sub1.aClass141_6504);
								if (class141.anIntArray1109 != null) {
									class141 = class141.method2300(
											(Class75.aClass140_584), (byte) 32);
								}
								if (class141 != null) {
									is = class141.anIntArray1152;
								}
							}
						}
					} else {
						is = (Class98_Sub46_Sub19.aClass205_6068.method2714(
								(class98_sub46_sub8.anInt5988), (byte) -117)).anIntArray2436;
					}
				} else {
					is = (Class98_Sub46_Sub19.aClass205_6068.method2714(
							(int) (class98_sub46_sub8.aLong5987), (byte) -127)).anIntArray2436;
				}
				String string = Class86.method845((byte) -124,
						class98_sub46_sub8);
				if (is != null) {
					string += Class64_Sub25.method653(0, is);
				}
				Class98_Sub10_Sub34.aClass43_5730.method413(i_37_,
						Class64_Sub5.anIntArray3652, i_41_, string, i_42_,
						3 + i_43_, (byte) 18, Class217.aClass332Array3408);
				if (!class98_sub46_sub8.aBoolean5983) {
					break;
				}
				Class284_Sub2_Sub2.aClass332_6199.method3735(
						(Class42_Sub1.aClass197_5354.method2674(string, 118)
								+ i_43_ - -5), -12 + i_37_);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("iha.D(" + i
						+ ',' + (class98_sub46_sub8 != null ? "{...}" : "null")
						+ ',' + i_35_ + ',' + i_36_ + ',' + i_37_ + ',' + i_38_
						+ ',' + i_39_ + ','
						+ (var_ha != null ? "{...}" : "null") + ',' + i_40_
						+ ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ')'));
			}
			break;
		} while (false);
	}

	Class246_Sub3_Sub2_Sub1(final int i, final int i_44_, final int i_45_,
			final int i_46_, final int i_47_) {
		super(i, i_44_, i_45_, i_46_, i_47_);
		anInt6341 = -1;
	}

	@Override
	final Class228 method2974(final byte i, final ha var_ha) {
		try {
			if (i != -53) {
				method2974((byte) -91, null);
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("iha.KA(" + i
					+ ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3010(final byte i) {
		try {
			if (i == -37) {
				aClass58_6335 = null;
				aClass171_6342 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "iha.A(" + i + ')');
		}
	}

	@Override
	final void method2988(final ha var_ha, final int i) {
		try {
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("iha.MA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
