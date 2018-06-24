/* Class297 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ItemDefs {
	int anInt2414;
	private int anInt2415;
	int anInt2416;
	private int anInt2417;
	int anInt2418;
	Class205 aClass205_2419;
	boolean aBoolean2420;
	int anInt2421;
	private int anInt2422 = 0;
	private int anInt2423;
	private int anInt2424;
	private int anInt2425;
	private int anInt2426;
	private int anInt2427;
	int[] anIntArray2428;
	private int anInt2429;
	private short[] aShortArray2430;
	private int anInt2431;
	private int anInt2432;
	int anInt2433;
	int anInt2434;
	int anInt2435;
	int[] anIntArray2436;
	int anInt2437;
	int anInt2438;
	int anInt2439;
	int anInt2440;
	int anInt2441;
	private short[] aShortArray2442;
	Class377 aClass377_2443;
	private int anInt2444;
	int anInt2445;
	String[] groundOptions;
	int anInt2447;
	private int anInt2448;
	private int anInt2449;
	String aString2450;
	private int anInt2451;
	private int anInt2452;
	private int anInt2453;
	int[] anIntArray2454;
	private int anInt2455;
	private short[] aShortArray2456;
	private byte[] aByteArray2457;
	int anInt2458;
	int anInt2459;
	private short[] aShortArray2460;
	boolean aBoolean2461;
	int anInt2462;
	int anInt2463;
	int anInt2464;
	int anInt2465;
	int anInt2466;
	private int anInt2467;
	int anInt2468;
	int anInt2469;
	static int anInt2470;
	int anInt2471;
	int anInt2472;
	String[] inventoryOptions;
	private int anInt2474;
	int anInt2475;
	int anInt2476;

	final void method3485(int i) {
		do {
			try {
				if (i == 850)
					break;
				((ItemDefs) this).anIntArray2436 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "sea.M(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final Model method3486(boolean bool, int i) {
		try {
			int i_0_ = anInt2417;
			int i_1_ = anInt2449;
			if (bool) {
				i_1_ = anInt2455;
				i_0_ = anInt2453;
			}
			if (i_0_ == -1)
				return null;
			Model model = RSModelLoader
					.createModel(
							i,
							i ^ ~0x2423,
							(((Class205) ((ItemDefs) this).aClass205_2419).aClass207_1556),
							i_0_);
			if (((Model) model).version < 13)
				model.method2592(13746, 2);
			if (i_1_ != -1) {
				Model class178_2_ = RSModelLoader
						.createModel(
								0,
								-9252,
								(((Class205) (((ItemDefs) this).aClass205_2419)).aClass207_1556),
								i_1_);
				if (((Model) class178_2_).version < 13)
					class178_2_.method2592(13746, 2);
				Model[] class178s = { model, class178_2_ };
				model = new Model(class178s, 2);
			}
			if (aShortArray2430 != null) {
				for (int i_3_ = 0; aShortArray2430.length > i_3_; i_3_++)
					model.method2593(0, aShortArray2430[i_3_],
							aShortArray2442[i_3_]);
			}
			if (aShortArray2460 != null) {
				for (int i_4_ = 0; i_4_ < aShortArray2460.length; i_4_++)
					model.method2590(aShortArray2456[i_4_], (byte) 115,
							aShortArray2460[i_4_]);
			}
			return model;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sea.L(" + bool
					+ ',' + i + ')');
		}
	}

	final void method3487(ItemDefs class297_5_, int i, ItemDefs class297_6_) {
		try {
			aShortArray2456 = class297_6_.aShortArray2456;
			((ItemDefs) this).anInt2437 = ((ItemDefs) class297_6_).anInt2437;
			((ItemDefs) this).anInt2441 = ((ItemDefs) class297_6_).anInt2441;
			aShortArray2430 = class297_6_.aShortArray2430;
			((ItemDefs) this).anInt2447 = ((ItemDefs) class297_6_).anInt2447;
			((ItemDefs) this).aString2450 = ((ItemDefs) class297_5_).aString2450;
			((ItemDefs) this).anInt2476 = ((ItemDefs) class297_6_).anInt2476;
			((ItemDefs) this).anInt2469 = 1;
			aShortArray2460 = class297_6_.aShortArray2460;
			anInt2431 = class297_6_.anInt2431;
			aByteArray2457 = class297_6_.aByteArray2457;
			((ItemDefs) this).anInt2416 = ((ItemDefs) class297_6_).anInt2416;
			((ItemDefs) this).anInt2475 = ((ItemDefs) class297_5_).anInt2475;
			aShortArray2442 = class297_6_.aShortArray2442;
			((ItemDefs) this).aBoolean2420 = ((ItemDefs) class297_5_).aBoolean2420;
			((ItemDefs) this).anInt2465 = ((ItemDefs) class297_6_).anInt2465;
			int i_7_ = 49 / ((i - -25) / 52);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sea.I("
					+ (class297_5_ != null ? "{...}" : "null") + ',' + i + ','
					+ (class297_6_ != null ? "{...}" : "null") + ')'));
		}
	}

	final int[] method3488(int i, int i_8_, boolean bool, int i_9_, int i_10_,
			ha var_ha, ha var_ha_11_, byte i_12_, Appearance appearance,
			Class43 class43) {
		try {
			Model model = RSModelLoader
					.createModel(
							0,
							-9252,
							(((Class205) ((ItemDefs) this).aClass205_2419).aClass207_1556),
							anInt2431);
			if (model == null)
				return null;
			if (((Model) model).version < 13)
				model.method2592(13746, 2);
			if (aShortArray2430 != null) {
				for (int i_13_ = 0; ((aShortArray2430.length ^ 0xffffffff) < (i_13_ ^ 0xffffffff)); i_13_++) {
					if (aByteArray2457 != null
							&& (i_13_ ^ 0xffffffff) > (aByteArray2457.length ^ 0xffffffff))
						model.method2593(
								0,
								aShortArray2430[i_13_],
								(Class338.aShortArray2833[0xff & aByteArray2457[i_13_]]));
					else
						model.method2593(i_12_ + 125,
								aShortArray2430[i_13_], aShortArray2442[i_13_]);
				}
			}
			if (aShortArray2460 != null) {
				for (int i_14_ = 0; ((aShortArray2460.length ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++)
					model.method2590(aShortArray2456[i_14_], (byte) -99,
							aShortArray2460[i_14_]);
			}
			if (appearance != null) {
				for (int i_15_ = 0; i_15_ < 5; i_15_++) {
					for (int i_16_ = 0; ((Class61.aShortArrayArrayArray478.length ^ 0xffffffff) < (i_16_ ^ 0xffffffff)); i_16_++) {
						if ((Class61.aShortArrayArrayArray478[i_16_][i_15_]).length > ((Appearance) appearance).colour[i_15_])
							model.method2593(
									0,
									(Class98_Sub10_Sub11.aShortArrayArray5597[i_16_][i_15_]),
									(Class61.aShortArrayArrayArray478[i_16_][i_15_][(((Appearance) appearance).colour[i_15_])]));
					}
				}
			}
			int i_17_ = 2048;
			boolean bool_18_ = false;
			if (anInt2451 != 128 || anInt2429 != 128 || anInt2415 != 128) {
				bool_18_ = true;
				i_17_ |= 0x7;
			}
			AbstractModel abstractModel = var_ha_11_.method1790(model, i_17_, 64,
					64 - -anInt2452, anInt2422 + 768);
			if (!abstractModel.method2324())
				return null;
			if (bool_18_)
				abstractModel.O(anInt2451, anInt2429, anInt2415);
			Class332 class332 = null;
			if (((ItemDefs) this).anInt2414 != -1) {
				class332 = (((ItemDefs) this).aClass205_2419.method2722(
						class43, false, ((ItemDefs) this).anInt2433, 1, 0,
						appearance, var_ha_11_, 0, true, 10, var_ha, true));
				if (class332 == null)
					return null;
			} else if ((((ItemDefs) this).anInt2459 ^ 0xffffffff) != 0) {
				class332 = (((ItemDefs) this).aClass205_2419.method2722(
						class43, false, ((ItemDefs) this).anInt2472, i_10_, i,
						appearance, var_ha_11_, 0, true, i_9_, var_ha, false));
				if (class332 == null)
					return null;
			}
			int i_19_;
			if (bool)
				i_19_ = ((int) ((double) ((ItemDefs) this).anInt2465 * 1.5) << -21057662);
			else if (i_10_ == 2)
				i_19_ = ((int) (1.04 * (double) ((ItemDefs) this).anInt2465) << 839018274);
			else
				i_19_ = ((ItemDefs) this).anInt2465 << -512379550;
			var_ha_11_.DA(16, 16, 512, 512);
			Class111 class111 = var_ha_11_.method1821();
			class111.method2091();
			var_ha_11_.a(class111);
			var_ha_11_.xa(1.0F);
			var_ha_11_.ZA(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
			Class111 class111_20_ = var_ha_11_.method1793();
			class111_20_.method2104(-((ItemDefs) this).anInt2441 << -384263997);
			class111_20_.method2097(((ItemDefs) this).anInt2476 << 857131171);
			class111_20_
					.method2106(
							((ItemDefs) this).anInt2437 << 1252715202,
							((i_19_
									* (Class284_Sub2_Sub2.anIntArray6200[((ItemDefs) this).anInt2416 << -664636093]) >> -1954445778)
									+ -(abstractModel.fa() / 2) + (((ItemDefs) this).anInt2447 << -1632893918)),
							((i_19_
									* (Class284_Sub2_Sub2.anIntArray6202[((ItemDefs) this).anInt2416 << 769335843]) >> -1078595890) - -(((ItemDefs) this).anInt2447 << -772037790)));
			class111_20_.method2105(((ItemDefs) this).anInt2416 << 1743842275);
			int i_21_ = var_ha_11_.i();
			int i_22_ = var_ha_11_.XA();
			var_ha_11_.f(50, 2147483647);
			var_ha_11_.ya();
			if (i_12_ != -125)
				return null;
			var_ha_11_.la();
			var_ha_11_.aa(0, 0, 36, 32, 0, 0);
			abstractModel.method2325(class111_20_, null, 1);
			var_ha_11_.f(i_21_, i_22_);
			int[] is = var_ha_11_.na(0, 0, 36, 32);
			if ((i_10_ ^ 0xffffffff) <= -2) {
				is = method3491(is, i_12_ + 3, -16777214);
				if (i_10_ >= 2)
					is = method3491(is, -109, -1);
			}
			if ((i ^ 0xffffffff) != -1)
				method3499(-76, i, is);
			var_ha_11_.method1748(-7962, 0, 36, 32, is, 36).method3735(0, 0);
			if (((ItemDefs) this).anInt2414 == -1) {
				if (((ItemDefs) this).anInt2459 != -1)
					class332.method3735(0, 0);
			} else
				class332.method3735(0, 0);
			if ((i_8_ ^ 0xffffffff) == -2 || i_8_ == 2
					&& (((ItemDefs) this).anInt2469 == 1 || i_9_ != 1)
					&& (i_9_ ^ 0xffffffff) != 0)
				class43.method411((byte) 76, 9, method3490((byte) -93, i_9_),
						-256, -16777215, 0);
			is = var_ha_11_.na(0, 0, 36, 32);
			for (int i_23_ = 0; (is.length ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++) {
				if ((0xffffff & is[i_23_]) == 0)
					is[i_23_] = 0;
				else
					is[i_23_] = Class41.method366(is[i_23_], -16777216);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sea.H(" + i + ','
					+ i_8_ + ',' + bool + ',' + i_9_ + ',' + i_10_ + ','
					+ (var_ha != null ? "{...}" : "null") + ','
					+ (var_ha_11_ != null ? "{...}" : "null") + ',' + i_12_
					+ ',' + (appearance != null ? "{...}" : "null") + ','
					+ (class43 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method3489(boolean bool, int i) {
		try {
			int i_24_ = -6 / ((i - -44) / 61);
			int i_25_ = anInt2417;
			int i_26_ = anInt2449;
			if (bool) {
				i_25_ = anInt2453;
				i_26_ = anInt2455;
			}
			if ((i_25_ ^ 0xffffffff) == 0)
				return true;
			boolean bool_27_ = true;
			if (!((Class205) ((ItemDefs) this).aClass205_2419).aClass207_1556
					.method2751(0, i_25_, -6329))
				bool_27_ = false;
			if (i_26_ != -1
					&& !((Class205) ((ItemDefs) this).aClass205_2419).aClass207_1556
							.method2751(0, i_26_, -6329))
				bool_27_ = false;
			return bool_27_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sea.B(" + bool
					+ ',' + i + ')');
		}
	}

	private final String method3490(byte i, int i_28_) { // Amount to String
		try {
			if (i != -93)
				((ItemDefs) this).anInt2459 = 107;
			if (i_28_ < 100000)
				return "<col=ffff00>" + i_28_ + "</col>";
			if ((i_28_ ^ 0xffffffff) > -10000001)
				return ("<col=ffffff>"
						+ i_28_
						/ 1000
						+ (Class309.aClass309_2622
								.method3615(
										(((Class205) ((ItemDefs) this).aClass205_2419).anInt1555),
										(byte) 25)) + "</col>");
			return ("<col=00ff80>"
					+ i_28_
					/ 1000000
					+ Class309.aClass309_2620
							.method3615(
									(((Class205) (((ItemDefs) this).aClass205_2419)).anInt1555),
									(byte) 25) + "</col>");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sea.J(" + i + ','
					+ i_28_ + ')');
		}
	}

	private final int[] method3491(int[] is, int i, int i_29_) {
		try {
			if (i > -36)
				return null;
			int[] is_30_ = new int[1152];
			int i_31_ = 0;
			for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > -33; i_32_++) {
				for (int i_33_ = 0; i_33_ < 36; i_33_++) {
					int i_34_ = is[i_31_];
					if ((i_34_ ^ 0xffffffff) == -1) {
						if (i_33_ <= 0 || (is[-1 + i_31_] ^ 0xffffffff) == -1) {
							if ((i_32_ ^ 0xffffffff) >= -1
									|| (is[-36 + i_31_] ^ 0xffffffff) == -1) {
								if (i_33_ < 35 && is[i_31_ + 1] != 0)
									i_34_ = i_29_;
								else if (i_32_ < 31
										&& (is[36 + i_31_] ^ 0xffffffff) != -1)
									i_34_ = i_29_;
							} else
								i_34_ = i_29_;
						} else
							i_34_ = i_29_;
					}
					is_30_[i_31_++] = i_34_;
				}
			}
			return is_30_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("sea.A(" + (is != null ? "{...}" : "null") + ',' + i + ','
							+ i_29_ + ')'));
		}
	}

	final boolean method3492(int i, boolean bool) {
		try {
			int i_35_ = ((ItemDefs) this).anInt2458;
			int i_36_ = anInt2444;
			int i_37_ = anInt2424;
			if (bool) {
				i_36_ = anInt2423;
				i_35_ = ((ItemDefs) this).anInt2466;
				i_37_ = anInt2432;
			}
			if ((i_35_ ^ 0xffffffff) == 0)
				return true;
			boolean bool_38_ = true;
			if (!((Class205) ((ItemDefs) this).aClass205_2419).aClass207_1556
					.method2751(i, i_35_, -6329))
				bool_38_ = false;
			if (i_36_ != -1
					&& !((Class205) ((ItemDefs) this).aClass205_2419).aClass207_1556
							.method2751(0, i_36_, -6329))
				bool_38_ = false;
			if ((i_37_ ^ 0xffffffff) != 0
					&& !((Class205) ((ItemDefs) this).aClass205_2419).aClass207_1556
							.method2751(0, i_37_, -6329))
				bool_38_ = false;
			return bool_38_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sea.D(" + i + ','
					+ bool + ')');
		}
	}

	final ItemDefs method3493(byte i, int i_39_) {
		try {
			int i_40_ = -25 % ((i - 26) / 56);
			if (((ItemDefs) this).anIntArray2428 != null
					&& (i_39_ ^ 0xffffffff) < -2) {
				int i_41_ = -1;
				for (int i_42_ = 0; i_42_ < 10; i_42_++) {
					if (((ItemDefs) this).anIntArray2454[i_42_] <= i_39_
							&& ((ItemDefs) this).anIntArray2454[i_42_] != 0)
						i_41_ = ((ItemDefs) this).anIntArray2428[i_42_];
				}
				if ((i_41_ ^ 0xffffffff) != 0)
					return ((ItemDefs) this).aClass205_2419.method2714(i_41_,
							(byte) -124);
			}
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sea.P(" + i + ','
					+ i_39_ + ')');
		}
	}

	final int method3494(int i, byte i_43_, int i_44_) {
		try {
			if (i_43_ > -75)
				return -30;
			if (((ItemDefs) this).aClass377_2443 == null)
				return i_44_;
			Class98_Sub34 class98_sub34 = ((Class98_Sub34) ((ItemDefs) this).aClass377_2443
					.method3990((long) i, -1));
			if (class98_sub34 == null)
				return i_44_;
			return ((Class98_Sub34) class98_sub34).anInt4126;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sea.G(" + i + ','
					+ i_43_ + ',' + i_44_ + ')'));
		}
	}

	final String method3495(String string, int i, int i_45_) {
		try {
			if (((ItemDefs) this).aClass377_2443 == null)
				return string;
			Class98_Sub15 class98_sub15 = ((Class98_Sub15) ((ItemDefs) this).aClass377_2443
					.method3990((long) i_45_, i));
			if (class98_sub15 == null)
				return string;
			return ((Class98_Sub15) class98_sub15).aString3917;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sea.F("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ i_45_ + ')'));
		}
	}

	private final void method3496(final int opcode,
			final ByteBuffer class98_sub22, final int i_46_) {
		do {
			try {

				if (opcode != 1) {
					if ((opcode ^ 0xffffffff) == -3) {
						aString2450 = class98_sub22.readString((byte) 84);
					} else if (opcode != 4) {
						if (opcode == 5) {
							anInt2416 = class98_sub22.readUnsignedShort((byte) 127);
						} else if (opcode == 6) {
							anInt2476 = class98_sub22.readUnsignedShort((byte) 127);
						} else if (opcode != 7) {
							if (opcode != 8) {
								if (opcode != 11) {
									if ((opcode ^ 0xffffffff) == -13) {
										anInt2475 = class98_sub22.readInt(-2);
									} else if (opcode == 16) {
										aBoolean2420 = true;
									} else if ((opcode ^ 0xffffffff) != -19) {
										if ((opcode ^ 0xffffffff) != -24) {
											if (opcode == 24) {
												anInt2444 = (class98_sub22
														.readIntSmart2());
											} else if ((opcode ^ 0xffffffff) == -26) {
												anInt2466 = (class98_sub22
														.readIntSmart2());
											} else if (opcode != 26) {
												if (opcode < 30 || opcode >= 35) {
													if ((opcode ^ 0xffffffff) > -36
															|| opcode >= 40) {
														if (opcode != 40) {
															if ((opcode ^ 0xffffffff) == -42) {
																final int i_47_ = (class98_sub22
																		.readUnsignedByte((byte) 123));
																aShortArray2460 = (new short[i_47_]);
																aShortArray2456 = (new short[i_47_]);
																for (int i_48_ = 0; (i_47_ > i_48_); i_48_++) {
																	aShortArray2460[i_48_] = (short) class98_sub22
																			.readUnsignedShort((byte) 127);
																	aShortArray2456[i_48_] = (short) class98_sub22
																			.readUnsignedShort((byte) 127);
																}
															} else if ((opcode ^ 0xffffffff) != -43) {
																if (opcode == 65) {
																	aBoolean2461 = true;
																} else if (opcode == 78) {
																	anInt2424 = (class98_sub22
																			.readIntSmart2());
																} else if ((opcode ^ 0xffffffff) != -80) {
																	if (opcode != 90) {
																		if (opcode != 91) {
																			if ((opcode ^ 0xffffffff) == -93) {
																				anInt2449 = class98_sub22
																						.readIntSmart2();
																			} else if ((opcode ^ 0xffffffff) != -94) {
																				if ((opcode ^ 0xffffffff) == -96) {
																					anInt2441 = class98_sub22
																							.readUnsignedShort((byte) 127);
																				} else if (opcode != 96) {
																					if (opcode != 97) {
																						if ((opcode ^ 0xffffffff) == -99) {
																							anInt2414 = class98_sub22
																									.readUnsignedShort((byte) 127);
																						} else if (opcode < 100
																								|| (opcode ^ 0xffffffff) <= -111) {
																							if (opcode != 110) {
																								if ((opcode ^ 0xffffffff) == -112) {
																									anInt2429 = class98_sub22
																											.readUnsignedShort((byte) 127);
																								} else if (opcode == 112) {
																									anInt2415 = class98_sub22
																											.readUnsignedShort((byte) 127);
																								} else if (opcode == 113) {
																									anInt2452 = class98_sub22
																											.readSignedByte((byte) -19);
																								} else if ((opcode ^ 0xffffffff) != -115) {
																									if ((opcode ^ 0xffffffff) == -116) {
																										anInt2435 = class98_sub22
																												.readUnsignedByte((byte) -108);
																									} else if (opcode != 121) {
																										if ((opcode ^ 0xffffffff) != -123) {
																											if ((opcode ^ 0xffffffff) == -126) {
																												anInt2448 = class98_sub22
																														.readSignedByte((byte) -19) << 119149218;
																												anInt2426 = class98_sub22
																														.readSignedByte((byte) -19) << -1266678398;
																												anInt2425 = class98_sub22
																														.readSignedByte((byte) -19) << 1583045954;
																											} else if ((opcode ^ 0xffffffff) != -127) {
																												if (opcode == 127) {
																													anInt2438 = class98_sub22
																															.readUnsignedByte((byte) -126);
																													anInt2439 = class98_sub22
																															.readUnsignedShort((byte) 127);
																												} else if ((opcode ^ 0xffffffff) != -129) {
																													if ((opcode ^ 0xffffffff) != -130) {
																														if ((opcode ^ 0xffffffff) != -131) {
																															if (opcode != 132) {
																																if (opcode == 134) {
																																	anInt2445 = class98_sub22
																																			.readUnsignedByte((byte) 118);
																																} else if (opcode == 139) {
																																	class98_sub22
																																			.readUnsignedShort((byte) 127);
																																} else if (opcode == 140) {
																																	class98_sub22
																																			.readUnsignedShort((byte) 127);
																																} else if ((opcode ^ 0xffffffff) == -250) {
																																	final int i_49_ = class98_sub22
																																			.readUnsignedByte((byte) -115);
																																	if (aClass377_2443 == null) {
																																		final int i_50_ = Class48
																																				.method453(
																																						423660257,
																																						i_49_);
																																		aClass377_2443 = new Class377(
																																				i_50_);
																																	}
																																	for (int i_51_ = 0; (i_49_ ^ 0xffffffff) < (i_51_ ^ 0xffffffff); i_51_++) {
																																		final boolean bool = (class98_sub22
																																				.readUnsignedByte((byte) 18) ^ 0xffffffff) == -2;
																																		final int i_52_ = class98_sub22
																																				.readMediumInt(i_46_
																																						^ ~0xf8);

																																		Node node;
																																		if (!bool) {
																																			node = new Class98_Sub34(
																																					class98_sub22
																																							.readInt(-2));
																																		} else {
																																			node = new Class98_Sub15(
																																					class98_sub22
																																							.readString((byte) 84));
																																		}
																																		aClass377_2443
																																				.method3996(
																																						node,
																																						i_52_,
																																						-1);
																																	}
																																}
																															} else {
																																final int i_53_ = class98_sub22
																																		.readUnsignedByte((byte) -114);
																																anIntArray2436 = new int[i_53_];
																																for (int i_54_ = 0; i_53_ > i_54_; i_54_++) {
																																	anIntArray2436[i_54_] = class98_sub22
																																			.readUnsignedShort((byte) 127);
																																}
																															}
																														} else {
																															anInt2434 = class98_sub22
																																	.readUnsignedByte((byte) -110);
																															anInt2462 = class98_sub22
																																	.readUnsignedShort((byte) 127);
																														}
																													} else {
																														anInt2463 = class98_sub22
																																.readUnsignedByte((byte) 79);
																														anInt2440 = class98_sub22
																																.readUnsignedShort((byte) 127);
																													}
																												} else {
																													anInt2421 = class98_sub22
																															.readUnsignedByte((byte) -101);
																													anInt2471 = class98_sub22
																															.readUnsignedShort((byte) 127);
																												}
																											} else {
																												anInt2474 = class98_sub22
																														.readSignedByte((byte) -19) << 1304107298;
																												anInt2427 = class98_sub22
																														.readSignedByte((byte) -19) << 294608354;
																												anInt2467 = class98_sub22
																														.readSignedByte((byte) -19) << -629362526;
																											}
																										} else {
																											anInt2459 = class98_sub22
																													.readUnsignedShort((byte) 127);
																										}
																									} else {
																										anInt2472 = class98_sub22
																												.readUnsignedShort((byte) 127);
																									}
																								} else {
																									anInt2422 = 5 * class98_sub22
																											.readSignedByte((byte) -19);
																								}
																							} else {
																								anInt2451 = class98_sub22
																										.readUnsignedShort((byte) 127);
																							}
																						} else {
																							if (anIntArray2428 == null) {
																								anIntArray2428 = new int[10];
																								anIntArray2454 = new int[10];
																							}
																							anIntArray2428[-100
																									+ opcode] = class98_sub22
																									.readUnsignedShort((byte) 127);
																							anIntArray2454[-100
																									+ opcode] = class98_sub22
																									.readUnsignedShort((byte) 127);
																						}
																					} else {
																						anInt2433 = class98_sub22
																								.readUnsignedShort((byte) 127);
																					}
																				} else {
																					anInt2464 = class98_sub22
																							.readUnsignedByte((byte) -124);
																				}
																			} else {
																				anInt2455 = class98_sub22
																						.readIntSmart2();
																			}
																		} else {
																			anInt2453 = class98_sub22
																					.readIntSmart2();
																		}
																	} else {
																		anInt2417 = class98_sub22
																				.readIntSmart2();
																	}
																} else {
																	anInt2432 = (class98_sub22
																			.readIntSmart2());
																}
															} else {
																final int i_55_ = (class98_sub22
																		.readUnsignedByte((byte) 56));
																aByteArray2457 = (new byte[i_55_]);
																for (int i_56_ = 0; (i_55_ > i_56_); i_56_++) {
																	aByteArray2457[i_56_] = (class98_sub22
																			.readSignedByte((byte) -19));
																}
															}
														} else {
															final int i_57_ = (class98_sub22
																	.readUnsignedByte((byte) -100));
															aShortArray2442 = (new short[i_57_]);
															aShortArray2430 = (new short[i_57_]);
															for (int i_58_ = 0; ((i_58_ ^ 0xffffffff) > (i_57_ ^ 0xffffffff)); i_58_++) {
																aShortArray2430[i_58_] = (short) class98_sub22
																		.readUnsignedShort((byte) 127);
																aShortArray2442[i_58_] = (short) class98_sub22
																		.readUnsignedShort((byte) 127);
															}
														}
													} else {
														inventoryOptions[-35
																+ opcode] = (class98_sub22
																.readString((byte) 84));

													}
												} else {
													groundOptions[opcode - 30] = (class98_sub22
															.readString((byte) 84));

												}
											} else {
												anInt2423 = (class98_sub22
														.readIntSmart2());
											}
										} else {
											anInt2458 = class98_sub22
													.readIntSmart2();
										}
									} else {
										anInt2418 = class98_sub22
												.readUnsignedShort((byte) 127);
									}
								} else {
									anInt2469 = 1;
								}
							} else {
								anInt2447 = class98_sub22.readUnsignedShort((byte) 127);
								if (anInt2447 > 32767) {
									anInt2447 -= 65536;
								}
							}
						} else {
							anInt2437 = class98_sub22.readUnsignedShort((byte) 127);
							if (anInt2437 > 32767) {
								anInt2437 -= 65536;
							}
						}
					} else {
						anInt2465 = class98_sub22.readUnsignedShort((byte) 127);
					}
				} else {
					anInt2431 = class98_sub22.readIntSmart2();
				}
				if (i_46_ == 132) {
					break;
				}
				anInt2437 = 117;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("sea.K("
						+ opcode + ','
						+ (class98_sub22 != null ? "{...}" : "null") + ','
						+ i_46_ + ')'));
			}
			break;
		} while (false);
	}

	final void parse(ByteBuffer class98_sub22, byte i) {
		do {
			try {
				for (;;) {
					int i_59_ = class98_sub22.readUnsignedByte((byte) -123);
					if ((i_59_ ^ 0xffffffff) == -1)
						break;
					method3496(i_59_, class98_sub22, 132);
				}
				if (i < -112)
					break;
				((ItemDefs) this).aClass377_2443 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("sea.O(" + (class98_sub22 != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method3498(ItemDefs class297_60_, ItemDefs class297_61_, int i) {
		try {
			((ItemDefs) this).anInt2475 = 0;
			aShortArray2430 = class297_60_.aShortArray2430;
			anInt2432 = class297_60_.anInt2432;
			anInt2424 = class297_60_.anInt2424;
			anInt2474 = class297_60_.anInt2474;
			((ItemDefs) this).aBoolean2420 = ((ItemDefs) class297_60_).aBoolean2420;
			anInt2425 = class297_60_.anInt2425;
			anInt2455 = class297_60_.anInt2455;
			anInt2423 = class297_60_.anInt2423;
			anInt2448 = class297_60_.anInt2448;
			((ItemDefs) this).anInt2437 = ((ItemDefs) class297_61_).anInt2437;
			anInt2417 = class297_60_.anInt2417;
			anInt2467 = class297_60_.anInt2467;
			((ItemDefs) this).inventoryOptions = new String[5];
			((ItemDefs) this).anInt2465 = ((ItemDefs) class297_61_).anInt2465;
			aByteArray2457 = class297_60_.aByteArray2457;
			anInt2444 = class297_60_.anInt2444;
			((ItemDefs) this).anInt2476 = ((ItemDefs) class297_61_).anInt2476;
			anInt2449 = class297_60_.anInt2449;
			((ItemDefs) this).aString2450 = ((ItemDefs) class297_60_).aString2450;
			((ItemDefs) this).aClass377_2443 = ((ItemDefs) class297_60_).aClass377_2443;
			anInt2431 = class297_61_.anInt2431;
			anInt2426 = class297_60_.anInt2426;
			aShortArray2456 = class297_60_.aShortArray2456;
			((ItemDefs) this).anInt2458 = ((ItemDefs) class297_60_).anInt2458;
			anInt2453 = class297_60_.anInt2453;
			aShortArray2442 = class297_60_.aShortArray2442;
			((ItemDefs) this).anInt2441 = ((ItemDefs) class297_61_).anInt2441;
			((ItemDefs) this).anInt2416 = ((ItemDefs) class297_61_).anInt2416;
			((ItemDefs) this).anInt2466 = ((ItemDefs) class297_60_).anInt2466;
			((ItemDefs) this).groundOptions = ((ItemDefs) class297_60_).groundOptions;
			aShortArray2460 = class297_60_.aShortArray2460;
			anInt2427 = class297_60_.anInt2427;
			((ItemDefs) this).anInt2447 = ((ItemDefs) class297_61_).anInt2447;
			((ItemDefs) this).anInt2435 = ((ItemDefs) class297_60_).anInt2435;
			if (((ItemDefs) class297_60_).inventoryOptions != null) {
				for (int i_62_ = 0; i_62_ < 4; i_62_++)
					((ItemDefs) this).inventoryOptions[i_62_] = ((ItemDefs) class297_60_).inventoryOptions[i_62_];
			}
			int i_63_ = 59 % ((i - -79) / 44);
			((ItemDefs) this).inventoryOptions[4] = Class309.aClass309_2592
					.method3615(
							(((Class205) (((ItemDefs) this).aClass205_2419)).anInt1555),
							(byte) 25);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("sea.Q(" + (class297_60_ != null ? "{...}" : "null") + ','
							+ (class297_61_ != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	private final void method3499(int i, int i_64_, int[] is) {
		try {
			int i_65_ = 31;
			if (i > -53)
				anInt2452 = -82;
			for (/**/; i_65_ > 0; i_65_--) {
				int i_66_ = i_65_ * 36;
				for (int i_67_ = 35; (i_67_ ^ 0xffffffff) < -1; i_67_--) {
					if ((is[i_67_ + i_66_] ^ 0xffffffff) == -1
							&& (is[i_67_ + (i_66_ - 37)] ^ 0xffffffff) != -1)
						is[i_67_ + i_66_] = i_64_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sea.C(" + i + ','
					+ i_64_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final Model method3500(boolean bool, int i) {
		try {
			if (i <= 42)
				method3487(null, 70, null);
			int i_68_ = ((ItemDefs) this).anInt2458;
			int i_69_ = anInt2444;
			int i_70_ = anInt2424;
			if (bool) {
				i_68_ = ((ItemDefs) this).anInt2466;
				i_70_ = anInt2432;
				i_69_ = anInt2423;
			}
			if (i_68_ == -1)
				return null;
			Model model = RSModelLoader
					.createModel(
							0,
							-9252,
							(((Class205) ((ItemDefs) this).aClass205_2419).aClass207_1556),
							i_68_);
			if ((((Model) model).version ^ 0xffffffff) > -14)
				model.method2592(13746, 2);
			if ((i_69_ ^ 0xffffffff) != 0) {
				Model class178_71_ = RSModelLoader
						.createModel(
								0,
								-9252,
								(((Class205) (((ItemDefs) this).aClass205_2419)).aClass207_1556),
								i_69_);
				if (((Model) class178_71_).version < 13)
					class178_71_.method2592(13746, 2);
				if (i_70_ != -1) {
					Model class178_72_ = RSModelLoader
							.createModel(
									0,
									-9252,
									(((Class205) (((ItemDefs) this).aClass205_2419)).aClass207_1556),
									i_70_);
					if (((Model) class178_72_).version < 13)
						class178_72_.method2592(13746, 2);
					Model[] class178s = { model, class178_71_,
							class178_72_ };
					model = new Model(class178s, 3);
				} else {
					Model[] class178s = { model, class178_71_ };
					model = new Model(class178s, 2);
				}
			}
			if (model == null)
				return null;
			if (!bool
					&& (anInt2448 != 0 || (anInt2426 ^ 0xffffffff) != -1 || anInt2425 != 0))
				model.method2597(anInt2425, anInt2448, (byte) 122, anInt2426);
			if (bool
					&& ((anInt2474 ^ 0xffffffff) != -1
							|| (anInt2427 ^ 0xffffffff) != -1 || (anInt2467 ^ 0xffffffff) != -1))
				model.method2597(anInt2467, anInt2474, (byte) 63, anInt2427);
			if (aShortArray2430 != null) {
				for (int i_73_ = 0; ((i_73_ ^ 0xffffffff) > (aShortArray2430.length ^ 0xffffffff)); i_73_++)
					model.method2593(0, aShortArray2430[i_73_],
							aShortArray2442[i_73_]);
			}
			if (aShortArray2460 != null) {
				for (int i_74_ = 0; i_74_ < aShortArray2460.length; i_74_++)
					model.method2590(aShortArray2456[i_74_], (byte) 107,
							aShortArray2460[i_74_]);
			}
			return model;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sea.E(" + bool
					+ ',' + i + ')');
		}
	}

	final AbstractModel method3501(int i, int i_75_, int i_76_,
			AnimationDefinition class97, int i_77_, ha var_ha, int i_78_,
			int i_79_, Appearance appearance) {
		try {
			if (((ItemDefs) this).anIntArray2428 != null && i_78_ > 1) {
				int i_80_ = -1;
				for (int i_81_ = 0; (i_81_ ^ 0xffffffff) > -11; i_81_++) {
					if (((i_78_ ^ 0xffffffff) <= (((ItemDefs) this).anIntArray2454[i_81_] ^ 0xffffffff))
							&& (((ItemDefs) this).anIntArray2454[i_81_] ^ 0xffffffff) != -1)
						i_80_ = ((ItemDefs) this).anIntArray2428[i_81_];
				}
				if ((i_80_ ^ 0xffffffff) != 0)
					return (((ItemDefs) this).aClass205_2419.method2714(i_80_,
							(byte) -119).method3501(i, i_75_, i_76_, class97,
							i_77_, var_ha, 1, i_79_, appearance));
			}
			int i_82_ = i_75_;
			if (class97 != null)
				i_82_ |= class97.method932(true, i_76_, true, i_77_);
			AbstractModel abstractModel;
			synchronized (((Class205) ((ItemDefs) this).aClass205_2419).aClass79_1560) {
				abstractModel = (AbstractModel) (((Class205) ((ItemDefs) this).aClass205_2419).aClass79_1560
						.method802(
								-123,
								(long) (((ItemDefs) this).anInt2468 | (((ha) var_ha).anInt937 << -1658708323))));
				if (i_79_ != 128)
					((ItemDefs) this).anInt2434 = -112;
			}
			if (abstractModel == null
					|| (var_ha.c(abstractModel.ua(), i_82_) ^ 0xffffffff) != -1) {
				if (abstractModel != null)
					i_82_ = var_ha.method1777(i_82_, abstractModel.ua());
				int i_83_ = i_82_;
				if (aShortArray2460 != null)
					i_83_ |= 0x8000;
				if (aShortArray2430 != null || appearance != null)
					i_83_ |= 0x4000;
				if (anInt2451 != 128)
					i_83_ |= 0x1;
				if ((anInt2451 ^ 0xffffffff) != -129)
					i_83_ |= 0x2;
				if ((anInt2451 ^ 0xffffffff) != -129)
					i_83_ |= 0x4;
				Model model = RSModelLoader
						.createModel(
								0,
								-9252,
								(((Class205) (((ItemDefs) this).aClass205_2419)).aClass207_1556),
								anInt2431);
				if (model == null)
					return null;
				if ((((Model) model).version ^ 0xffffffff) > -14)
					model.method2592(13746, 2);
				abstractModel = var_ha
						.method1790(
								model,
								i_83_,
								(((Class205) (((ItemDefs) this).aClass205_2419)).anInt1564),
								anInt2452 + 64, 850 - -anInt2422);
				if (anInt2451 != 128 || anInt2429 != 128
						|| (anInt2415 ^ 0xffffffff) != -129)
					abstractModel.O(anInt2451, anInt2429, anInt2415);
				if (aShortArray2430 != null) {
					for (int i_84_ = 0; aShortArray2430.length > i_84_; i_84_++) {
						if (aByteArray2457 == null
								|| ((aByteArray2457.length ^ 0xffffffff) >= (i_84_ ^ 0xffffffff)))
							abstractModel.ia(aShortArray2430[i_84_],
									aShortArray2442[i_84_]);
						else
							abstractModel.ia(
									aShortArray2430[i_84_],
									(Class338.aShortArray2833[aByteArray2457[i_84_] & 0xff]));
					}
				}
				if (aShortArray2460 != null) {
					for (int i_85_ = 0; ((aShortArray2460.length ^ 0xffffffff) < (i_85_ ^ 0xffffffff)); i_85_++)
						abstractModel.aa(aShortArray2460[i_85_],
								aShortArray2456[i_85_]);
				}
				if (appearance != null) {
					for (int i_86_ = 0; (i_86_ ^ 0xffffffff) > -6; i_86_++) {
						for (int i_87_ = 0; ((Class61.aShortArrayArrayArray478.length ^ 0xffffffff) < (i_87_ ^ 0xffffffff)); i_87_++) {
							if ((((Appearance) appearance).colour[i_86_] ^ 0xffffffff) > ((Class61.aShortArrayArrayArray478[i_87_][i_86_]).length ^ 0xffffffff))
								abstractModel.ia(
										(Class98_Sub10_Sub11.aShortArrayArray5597[i_87_][i_86_]),
										(Class61.aShortArrayArrayArray478[i_87_][i_86_][(((Appearance) appearance).colour[i_86_])]));
						}
					}
				}
				abstractModel.s(i_82_);
				synchronized (((Class205) ((ItemDefs) this).aClass205_2419).aClass79_1560) {
					((Class205) ((ItemDefs) this).aClass205_2419).aClass79_1560
							.method805(
									(long) (((ItemDefs) this).anInt2468 | ((ha) var_ha).anInt937 << -1883478627),
									abstractModel, (byte) -80);
				}
			}
			if (class97 != null)
				abstractModel = class97.method937(i_77_, i, i_82_, 42, abstractModel,
						i_76_);
			abstractModel.s(i_75_);
			return abstractModel;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("sea.N(" + i + ',' + i_75_ + ',' + i_76_ + ','
							+ (class97 != null ? "{...}" : "null") + ','
							+ i_77_ + ',' + (var_ha != null ? "{...}" : "null")
							+ ',' + i_78_ + ',' + i_79_ + ','
							+ (appearance != null ? "{...}" : "null") + ')'));
		}
	}

	public ItemDefs() {
		anInt2414 = -1;
		anInt2433 = -1;
		anInt2434 = -1;
		anInt2423 = -1;
		anInt2435 = 0;
		anInt2437 = 0;
		anInt2417 = -1;
		anInt2424 = -1;
		anInt2440 = -1;
		anInt2451 = 128;
		anInt2448 = 0;
		anInt2429 = 128;
		anInt2439 = -1;
		anInt2416 = 0;
		anInt2418 = -1;
		anInt2458 = -1;
		anInt2421 = -1;
		anInt2438 = -1;
		anInt2445 = 0;
		anInt2415 = 128;
		anInt2441 = 0;
		anInt2455 = -1;
		anInt2459 = -1;
		aBoolean2420 = false;
		anInt2452 = 0;
		anInt2425 = 0;
		aBoolean2461 = false;
		anInt2462 = -1;
		anInt2444 = -1;
		anInt2449 = -1;
		anInt2465 = 2000;
		aString2450 = "null";
		anInt2469 = 0;
		anInt2463 = -1;
		anInt2453 = -1;
		anInt2466 = -1;
		anInt2447 = 0;
		anInt2426 = 0;
		anInt2471 = -1;
		anInt2427 = 0;
		anInt2432 = -1;
		anInt2474 = 0;
		anInt2464 = 0;
		anInt2467 = 0;
		anInt2475 = 1;
		anInt2476 = 0;
		anInt2472 = -1;
	}
}
