/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class181 {
	int anInt1425 = 128;
	int anInt1426;
	int anInt1427;
	int anInt1428;
	int anInt1429 = 128;
	static Class148 aClass148_1430 = new Class148();
	int anInt1431;
	static int anInt1432 = 0;

	public static void method2606(int i) {
		try {
			if (i != -16841)
				aClass148_1430 = null;
			aClass148_1430 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mc.A(" + i + ')');
		}
	}

	static final void method2607(byte i) {
		do {
			try {
				Class257.method3201((byte) 65, false);
				Class142.anInt1160 = 0;
				boolean bool = true;
				for (int i_0_ = 0; ((client.aByteArrayArray3551.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
					if ((Class287.anIntArray2188[i_0_] ^ 0xffffffff) != 0
							&& client.aByteArrayArray3551[i_0_] == null) {
						client.aByteArrayArray3551[i_0_] = (Class234.aClass207_1748
								.method2745(0, Class287.anIntArray2188[i_0_],
										false));
						if (client.aByteArrayArray3551[i_0_] == null) {
							Class142.anInt1160++;
							bool = false;
						}
					}
					if ((Class98_Sub36.anIntArray4162[i_0_] ^ 0xffffffff) != 0
							&& Class255.aByteArrayArray3211[i_0_] == null) {
						Class255.aByteArrayArray3211[i_0_] = (Class234.aClass207_1748
								.method2736(
										Class98_Sub46_Sub17.anIntArrayArray6049[i_0_],
										5, 0,
										Class98_Sub36.anIntArray4162[i_0_]));
						if (Class255.aByteArrayArray3211[i_0_] == null) {
							bool = false;
							Class142.anInt1160++;
						}
					}
					if ((GameObjectDefinitionLoader.anIntArray2517[i_0_] ^ 0xffffffff) != 0
							&& (Player.aByteArrayArray6533[i_0_]) == null) {
						Player.aByteArrayArray6533[i_0_] = (Class234.aClass207_1748
								.method2745(
										0,
										GameObjectDefinitionLoader.anIntArray2517[i_0_],
										false));
						if ((Player.aByteArrayArray6533[i_0_]) == null) {
							Class142.anInt1160++;
							bool = false;
						}
					}
					if ((Class377.anIntArray3178[i_0_] ^ 0xffffffff) != 0
							&& Class377.aByteArrayArray3182[i_0_] == null) {
						Class377.aByteArrayArray3182[i_0_] = (Class234.aClass207_1748
								.method2745(0, Class377.anIntArray3178[i_0_],
										false));
						if (Class377.aByteArrayArray3182[i_0_] == null) {
							Class142.anInt1160++;
							bool = false;
						}
					}
					if (Class76_Sub7.anIntArray3765 != null
							&& Class105.aByteArrayArray3414[i_0_] == null
							&& Class76_Sub7.anIntArray3765[i_0_] != -1) {
						Class105.aByteArrayArray3414[i_0_] = (Class234.aClass207_1748
								.method2736(
										Class98_Sub46_Sub17.anIntArrayArray6049[i_0_],
										5, 0, Class76_Sub7.anIntArray3765[i_0_]));
						if (Class105.aByteArrayArray3414[i_0_] == null) {
							Class142.anInt1160++;
							bool = false;
						}
					}
				}
				if (Class64_Sub23.aClass370_3707 == null) {
					if (Class98_Sub40.aClass98_Sub46_Sub10_4195 != null
							&& (Class257.aClass207_1947
									.method2728(
											(((Class98_Sub46_Sub10) Class98_Sub40.aClass98_Sub46_Sub10_4195).aString6017)
													+ "_staticelements", 0))) {
						if (Class257.aClass207_1947
								.method2741(
										(((Class98_Sub46_Sub10) Class98_Sub40.aClass98_Sub46_Sub10_4195).aString6017)
												+ "_staticelements", 0))
							Class64_Sub23.aClass370_3707 = (Class52
									.method491(
											113,
											Class79.aBoolean602,
											Class257.aClass207_1947,
											(((Class98_Sub46_Sub10) Class98_Sub40.aClass98_Sub46_Sub10_4195).aString6017)
													+ "_staticelements"));
						else {
							Class142.anInt1160++;
						}
					} else
						Class64_Sub23.aClass370_3707 = new Class370(0);
				}
				if (!bool)
					Class130.anInt1031 = 1;
				else {
					bool = true;
					Class132.anInt1043 = 0;
					for (int i_1_ = 0; ((client.aByteArrayArray3551.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff)); i_1_++) {
						byte[] is = Class255.aByteArrayArray3211[i_1_];
						if (is != null) {
							int i_2_ = (-Class272.anInt2038 + (Class121.anIntArray1006[i_1_] >> 1965275688) * 64);
							int i_3_ = ((0xff & Class121.anIntArray1006[i_1_]) * 64 - aa_Sub2.anInt3562);
							if (Class151_Sub9.anInt5028 != 0) {
								i_3_ = 10;
								i_2_ = 10;
							}
							bool &= Class123.method2205(i_3_, is, i_2_,
									Class165.anInt1276,
									(Class98_Sub10_Sub7.anInt5572), 107);
						}
						is = Class377.aByteArrayArray3182[i_1_];
						if (is != null) {
							int i_4_ = (64 * (Class121.anIntArray1006[i_1_] >> -389792216) - Class272.anInt2038);
							int i_5_ = (64 * (Class121.anIntArray1006[i_1_] & 0xff) + -aa_Sub2.anInt3562);
							if (Class151_Sub9.anInt5028 != 0) {
								i_4_ = 10;
								i_5_ = 10;
							}
							bool &= Class123.method2205(i_5_, is, i_4_,
									Class165.anInt1276,
									(Class98_Sub10_Sub7.anInt5572), 119);
						}
					}
					if (!bool)
						Class130.anInt1031 = 2;
					else {
						if (Class130.anInt1031 != 0)
							Class246_Sub2
									.method2972(
											-77,
											(Class98_Sub46_Sub10.aClass197_6019),
											Class195.aClass43_1499,
											true,
											Class265.aHa1974,
											((Class309.aClass309_2598
													.method3615(
															Class374.anInt3159,
															(byte) 25)) + "<br>(100%)"));
						Class128.method2224(22696);
						Class98_Sub10_Sub15.method1050((byte) 101);
						Class301.method3542(50);
						boolean bool_6_ = false;
						if (Class265.aHa1974.method1747()
								&& (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub28_4064
										.method668((byte) 124) == 2)) {
							for (int i_7_ = 0; client.aByteArrayArray3551.length > i_7_; i_7_++) {
								if (Class377.aByteArrayArray3182[i_7_] != null
										|| (Player.aByteArrayArray6533[i_7_]) != null) {
									bool_6_ = true;
									break;
								}
							}
						}
						int i_8_;
						if ((((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub14_4049
								.method609((byte) 125) ^ 0xffffffff) == -2)
							i_8_ = (Class262.anIntArray1961[ByteBuffer.anInt3994]);
						else
							i_8_ = (Class303.anIntArray2531[ByteBuffer.anInt3994]);
						if (Class265.aHa1974.method1788())
							i_8_++;
						Class117.method2164(Class265.aHa1974,
								Class337_Sub1.anInt5499, 9, 4,
								Class165.anInt1276,
								Class98_Sub10_Sub7.anInt5572, i_8_, bool_6_,
								Class265.aHa1974.method1822() > 0);
						Class83.method825(Class98_Sub10_Sub14.anInt5614);
						if (Class98_Sub10_Sub14.anInt5614 == 0)
							Class207.method2746(null);
						else
							Class207.method2746(Class69_Sub2.aClass43_5336);
						for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -5; i_9_++)
							Class167.aClass243Array1281[i_9_]
									.method2950((byte) -99);
						TextureDefinition.method2920(-125);
						Class309.method3614(false, -119);
						Class369.method3954(0);
						Class232.aBoolean1744 = false;
						s_Sub1.aClass346_5202 = null;
						Class128.method2224(22696);
						System.gc();
						Class257.method3201((byte) 56, true);
						Class113.method2145((byte) -46);
						Class61.anInt479 = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub7_4073
								.method579((byte) 124);
						Class202.aBoolean1548 = Class292.anInt3359 >= 96;
						Class98_Sub46_Sub9.aBoolean6002 = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub28_4064
								.method668((byte) 121) ^ 0xffffffff) == -3;
						AnimationDefinition.aBoolean830 = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub10_4070
								.method592((byte) 121) ^ 0xffffffff) == -2;
						Class113.anInt950 = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub3_4076
								.method564((byte) 120) != 1) ? Class115.anInt963
								: -1;
						Class319.aBoolean2707 = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub25_4039
								.method655((byte) 125) == 1);
						Class369.aBoolean3130 = (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub20_4056
								.method634((byte) 122) ^ 0xffffffff) == -2;
						Class146_Sub3.aClass305_Sub1_4952 = new Class305_Sub1(
								4, Class165.anInt1276,
								Class98_Sub10_Sub7.anInt5572, false);
						if (Class151_Sub9.anInt5028 != 0)
							Class93.method900(11948,
									client.aByteArrayArray3551,
									(Class146_Sub3.aClass305_Sub1_4952));
						else
							Class42.method374(
									(Class146_Sub3.aClass305_Sub1_4952), 0,
									client.aByteArrayArray3551);
						Player.method3065(
								Class165.anInt1276 >> -1731069852,
								Class98_Sub10_Sub7.anInt5572 >> -1481341692,
								true);
						Class329.method3708(-1);
						if (bool_6_) {
							Class248.method3158(true);
							Class98_Sub31_Sub1.aClass305_Sub1_5816 = new Class305_Sub1(
									1, Class165.anInt1276,
									(Class98_Sub10_Sub7.anInt5572), true);
							if ((Class151_Sub9.anInt5028 ^ 0xffffffff) != -1) {
								Class93.method900(
										11948,
										(Player.aByteArrayArray6533),
										(Class98_Sub31_Sub1.aClass305_Sub1_5816));
								Class257.method3201((byte) 123, true);
							} else {
								Class42.method374(
										(Class98_Sub31_Sub1.aClass305_Sub1_5816),
										0,
										(Player.aByteArrayArray6533));
								Class257.method3201((byte) 113, true);
							}
							Class98_Sub31_Sub1.aClass305_Sub1_5816
									.method3577(
											0,
											-57,
											(((Class305) Class146_Sub3.aClass305_Sub1_4952).anIntArrayArrayArray2549[0]));
							Class98_Sub31_Sub1.aClass305_Sub1_5816.method3579(
									0, null, Class265.aHa1974, null);
							Class248.method3158(false);
						}
						Class146_Sub3.aClass305_Sub1_4952
								.method3579(
										0,
										Class167.aClass243Array1281,
										Class265.aHa1974,
										bool_6_ ? (((Class305) (Class98_Sub31_Sub1.aClass305_Sub1_5816)).anIntArrayArrayArray2549)
												: null);
						if ((Class151_Sub9.anInt5028 ^ 0xffffffff) == -1) {
							Class257.method3201((byte) 50, true);
							Class92.method898(false,
									Class255.aByteArrayArray3211,
									(Class146_Sub3.aClass305_Sub1_4952));
							if (Class105.aByteArrayArray3414 != null)
								Class246_Sub3_Sub2.method3005(21378);
						} else {
							Class257.method3201((byte) 67, true);
							Class48_Sub2.method470(
									(Class255.aByteArrayArray3211),
									(Class146_Sub3.aClass305_Sub1_4952), -4789);
						}
						Class98_Sub10_Sub15.method1050((byte) 104);
						if ((Class292.anInt3359 ^ 0xffffffff) > -97)
							Class206.method2727(79);
						Class257.method3201((byte) 64, true);
						Class146_Sub3.aClass305_Sub1_4952.method3568(null,
								(byte) 114, bool_6_ ? Class81.aSArray618[0]
										: null, Class265.aHa1974);
						Class146_Sub3.aClass305_Sub1_4952.method3589(false,
								(byte) 105, Class265.aHa1974);
						Class257.method3201((byte) 49, true);
						if (bool_6_) {
							Class248.method3158(true);
							Class257.method3201((byte) 96, true);
							if (Class151_Sub9.anInt5028 == 0)
								Class92.method898(
										false,
										Class377.aByteArrayArray3182,
										(Class98_Sub31_Sub1.aClass305_Sub1_5816));
							else
								Class48_Sub2
										.method470(
												(Class377.aByteArrayArray3182),
												(Class98_Sub31_Sub1.aClass305_Sub1_5816),
												-4789);
							Class98_Sub10_Sub15.method1050((byte) 123);
							Class257.method3201((byte) 126, true);
							Class98_Sub31_Sub1.aClass305_Sub1_5816.method3568(
									Class98_Sub46_Sub2_Sub2.aSArray6298[0],
									(byte) -81, null, Class265.aHa1974);
							Class98_Sub31_Sub1.aClass305_Sub1_5816.method3589(
									true, (byte) 105, Class265.aHa1974);
							Class257.method3201((byte) 47, true);
							Class248.method3158(false);
						}
						r_Sub1.method1645(-125);
						int i_10_ = (((Class305_Sub1) Class146_Sub3.aClass305_Sub1_4952).anInt5302);
						if (i_10_ > Class43.anInt377)
							i_10_ = Class43.anInt377;
						if (Class43.anInt377 + -1 > i_10_)
							i_10_ = Class43.anInt377 + -1;
						if (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub3_4076
								.method564((byte) 126) != 0)
							Class46.method439(0);
						else
							Class46.method439(i_10_);
						for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -5; i_11_++) {
							for (int i_12_ = 0; Class165.anInt1276 > i_12_; i_12_++) {
								for (int i_13_ = 0; i_13_ < Class98_Sub10_Sub7.anInt5572; i_13_++)
									Class98_Sub32.method1437(i_12_, i_11_,
											(byte) 64, i_13_);
							}
						}
						Class135.method2264((byte) -109);
						Class128.method2224(22696);
						Class77_Sub1.method789(125);
						Class98_Sub10_Sub15.method1050((byte) 103);
						Class96.method928((byte) -42);
						if (Class284.aFrame2168 != null
								&& aa_Sub1.aClass123_3561 != null
								&& Class177.anInt1376 == 11) {
							Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, aa_Sub3.aClass171_3570,
											Class331.aClass117_2811));
							((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
									.writeInt(1571862888, 1057001181);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
						if (i <= 26)
							method2607((byte) -1);
						if ((Class151_Sub9.anInt5028 ^ 0xffffffff) == -1) {
							int i_14_ = ((-(Class165.anInt1276 >> 1784299556) + Class160.anInt1258) / 8);
							int i_15_ = (((Class165.anInt1276 >> 554209988) + Class160.anInt1258) / 8);
							int i_16_ = (-(Class98_Sub10_Sub7.anInt5572 >> -69835196) + Class275.anInt2047) / 8;
							int i_17_ = ((Class275.anInt2047 - -(Class98_Sub10_Sub7.anInt5572 >> -1955440636)) / 8);
							for (int i_18_ = i_14_ + -1; ((i_18_ ^ 0xffffffff) >= (i_15_ + 1 ^ 0xffffffff)); i_18_++) {
								for (int i_19_ = -1 + i_16_; i_19_ <= 1 + i_17_; i_19_++) {
									if (i_14_ > i_18_
											|| i_15_ < i_18_
											|| ((i_19_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff))
											|| i_19_ > i_17_) {
										Class234.aClass207_1748.method2755("m"
												+ i_18_ + "_" + i_19_, -114);
										Class234.aClass207_1748.method2755("l"
												+ i_18_ + "_" + i_19_, -127);
									}
								}
							}
						}
						if ((Class177.anInt1376 ^ 0xffffffff) != -5) {
							if (Class177.anInt1376 == 8)
								Class61.method538(7, false);
							else {
								Class61.method538(10, false);
								if (aa_Sub1.aClass123_3561 != null) {
									Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
											.method3023(260,
													Class292.aClass171_3339,
													Class331.aClass117_2811));
									Class98_Sub10_Sub29.sendPacket(false,
											class98_sub11);
								}
							}
						} else
							Class61.method538(3, false);
						Class338.method3778((byte) -72);
						Class128.method2224(22696);
						Class32.method316(false);
						Class358.aBoolean3033 = true;
						if (!Class270.aBoolean2031)
							break;
						Class98_Sub46.method1525(
								("Took: "
										+ (-Class123.aLong1011 + Class343
												.method3819(-47)) + "ms"), -80);
						Class270.aBoolean2031 = true;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "mc.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method2608(int i,
			Player class246_sub3_sub4_sub2_sub2,
			int[] is, int i_20_) {
		do {
			try {
				if ((((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6373) != null) {
					boolean bool = true;
					for (int i_21_ = 0; ((i_21_ ^ 0xffffffff) > ((((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6373).length ^ 0xffffffff)); i_21_++) {
						if (((((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6373[i_21_]) ^ 0xffffffff) != (is[i_21_] ^ 0xffffffff)) {
							bool = false;
							break;
						}
					}
					if (bool
							&& (((Entity) class246_sub3_sub4_sub2_sub2).anInt6413 ^ 0xffffffff) != 0) {
						AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
								.method2623(
										((Entity) class246_sub3_sub4_sub2_sub2).anInt6413,
										16383));
						int i_22_ = ((AnimationDefinition) class97).anInt819;
						if ((i_22_ ^ 0xffffffff) == -2) {
							((Entity) class246_sub3_sub4_sub2_sub2).anInt6361 = 1;
							((Entity) class246_sub3_sub4_sub2_sub2).anInt6400 = i;
							((Entity) class246_sub3_sub4_sub2_sub2).anInt6366 = 0;
							((Entity) class246_sub3_sub4_sub2_sub2).anInt6405 = 0;
							((Entity) class246_sub3_sub4_sub2_sub2).anInt6393 = 0;
							if (!((Entity) class246_sub3_sub4_sub2_sub2).aBoolean6371)
								Class349.method3840(
										(byte) -128,
										class246_sub3_sub4_sub2_sub2,
										((Entity) class246_sub3_sub4_sub2_sub2).anInt6393,
										class97);
						}
						if (i_22_ == 2)
							((Entity) class246_sub3_sub4_sub2_sub2).anInt6405 = 0;
					}
				}
				boolean bool = true;
				for (int i_23_ = i_20_; is.length > i_23_; i_23_++) {
					if ((is[i_23_] ^ 0xffffffff) != 0)
						bool = false;
					if (((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6373 == null
							|| ((((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6373[i_23_]) ^ 0xffffffff) == 0
							|| (((((AnimationDefinition) Class151_Sub7.aClass183_5001
									.method2623(is[i_23_], 16383)).anInt829) ^ 0xffffffff) <= (((AnimationDefinition) (Class151_Sub7.aClass183_5001
									.method2623(
											(((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6373[i_23_]),
											16383))).anInt829 ^ 0xffffffff))) {
						((Entity) class246_sub3_sub4_sub2_sub2).anInt6400 = i;
						((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6373 = is;
						break;
					}
				}
				if (!bool)
					break;
				((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6373 = is;
				((Entity) class246_sub3_sub4_sub2_sub2).anInt6400 = i;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("mc.D("
						+ i
						+ ','
						+ ((class246_sub3_sub4_sub2_sub2 != null) ? "{...}"
								: "null") + ','
						+ (is != null ? "{...}" : "null") + ',' + i_20_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2609(Class181 class181_24_, byte i) {
		try {
			int i_25_ = 13 % ((i - 71) / 47);
			((Class181) this).anInt1429 = ((Class181) class181_24_).anInt1429;
			((Class181) this).anInt1428 = ((Class181) class181_24_).anInt1428;
			((Class181) this).anInt1426 = ((Class181) class181_24_).anInt1426;
			((Class181) this).anInt1425 = ((Class181) class181_24_).anInt1425;
			((Class181) this).anInt1431 = ((Class181) class181_24_).anInt1431;
			((Class181) this).anInt1427 = ((Class181) class181_24_).anInt1427;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("mc.B(" + (class181_24_ != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	static final void method2610(boolean bool, boolean bool_26_, int i) {
		try {
			Class98_Sub3 class98_sub3 = Class64_Sub28.method669(i, bool_26_, 6);
			if (bool == true && class98_sub3 != null)
				class98_sub3.method942(111);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mc.E(" + bool
					+ ',' + bool_26_ + ',' + i + ')'));
		}
	}

	final Class181 method2611(int i) {
		try {
			if (i != -1)
				aClass148_1430 = null;
			return new Class181(((Class181) this).anInt1428,
					((Class181) this).anInt1429, ((Class181) this).anInt1425,
					((Class181) this).anInt1426, ((Class181) this).anInt1427,
					((Class181) this).anInt1431);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mc.C(" + i + ')');
		}
	}

	Class181(int i) {
		try {
			((Class181) this).anInt1428 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mc.<init>(" + i
					+ ')');
		}
	}

	private Class181(int i, int i_27_, int i_28_, int i_29_, int i_30_,
			int i_31_) {
		try {
			((Class181) this).anInt1428 = i;
			((Class181) this).anInt1425 = i_28_;
			((Class181) this).anInt1426 = i_29_;
			((Class181) this).anInt1427 = i_30_;
			((Class181) this).anInt1431 = i_31_;
			((Class181) this).anInt1429 = i_27_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mc.<init>(" + i
					+ ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_
					+ ',' + i_31_ + ')'));
		}
	}
}
