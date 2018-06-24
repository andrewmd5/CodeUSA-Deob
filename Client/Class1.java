/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class1 {
	private int anInt52;
	private int anInt53;
	boolean aBoolean54;
	Class98_Sub5 aClass98_Sub5_55;
	private int anInt56;
	int anInt57;
	boolean aBoolean58;
	short[] aShortArray59;
	private int anInt60;
	private int anInt61;
	int anInt62;
	static Class6 aClass6_63 = new Class6("RC", 1);
	static Class128 aClass128_64;
	static int[] anIntArray65 = new int[5];
	static boolean aBoolean66;
	static Class207 aClass207_67;

	static final int method160(final int i, final byte i_0_, final int i_1_) {
		try {
			if (i_0_ != -101) {
				aBoolean66 = true;
			}
			if ((i_1_ ^ 0xffffffff) == -2 || (i_1_ ^ 0xffffffff) == -4) {
				return Class98_Sub10_Sub6.anIntArray5559[i & 0x3];
			}
			return Class299_Sub2.anIntArray5301[0x3 & i];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ab.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method161(final boolean bool, final int i, final int i_2_) {
		try {
			if (i_2_ < 61) {
				method164(96);
			}
			int i_3_;
			while_3_: do {
				if (bool) {
					i_3_ = 2048;
				} else {
					final int i_4_ = 0x7ff & anInt61 + i * anInt60 / 50;
					final int i_5_ = anInt53;
					while_2_: do {
						while_1_: do {
							while_0_: do {
								do {
									if (i_5_ != 1) {
										if ((i_5_ ^ 0xffffffff) != -4) {
											if ((i_5_ ^ 0xffffffff) != -5) {
												if ((i_5_ ^ 0xffffffff) != -3) {
													if (i_5_ == 5) {
														break while_1_;
													}
													break while_2_;
												}
											} else {
												break;
											}
											break while_0_;
										}
									} else {
										i_3_ = ((Class284_Sub2_Sub2.anIntArray6200[i_4_ << -516328477]) >> -967825788) + 1024;
										break while_3_;
									}
									i_3_ = (Class287_Sub1.anIntArray3421[i_4_] >> 1875641633);
									break while_3_;
								} while (false);
								i_3_ = i_4_ >> -322029302 << 2017264779;
								break while_3_;
							} while (false);
							i_3_ = i_4_;
							break while_3_;
						} while (false);
						i_3_ = ((i_4_ < 1024 ? i_4_ : -i_4_ + 2048) << 1254570465);
						break while_3_;
					} while (false);
					i_3_ = 2048;
				}
			} while (false);
			aClass98_Sub5_55.method959(
					(anInt56 + (i_3_ * anInt52 >> 1801072939)) / 2048.0F, 57);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ab.F(" + bool
					+ ',' + i + ',' + i_2_ + ')'));
		}
	}

	static final boolean method162(final int i, final byte i_6_, final int i_7_) {
		try {
			if (i_6_ >= -79) {
				aBoolean66 = true;
			}
			if ((i_7_ ^ 0xffffffff) > -1
					|| i < 0
					|| Class281.aByteArrayArrayArray2117[1].length <= i_7_
					|| ((i ^ 0xffffffff) <= (Class281.aByteArrayArrayArray2117[1][i_7_].length ^ 0xffffffff))) {
				return false;
			}
			if ((0x2 & Class281.aByteArrayArrayArray2117[1][i_7_][i]) != 0) {
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ab.A(" + i + ','
					+ i_6_ + ',' + i_7_ + ')'));
		}
	}

	public static void method163(final int i) {
		try {
			if (i <= 25) {
				aClass128_64 = null;
			}
			aClass207_67 = null;
			aClass6_63 = null;
			aClass128_64 = null;
			anIntArray65 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ab.B(" + i + ')');
		}
	}

	private final void method164(final int i) {
		do {
			try {
				final int i_8_ = anInt62;
				while_17_: do {
					while_16_: do {
						while_15_: do {
							while_14_: do {
								while_13_: do {
									while_12_: do {
										while_11_: do {
											while_10_: do {
												while_9_: do {
													while_8_: do {
														while_7_: do {
															while_6_: do {
																while_5_: do {
																	while_4_: do {
																		do {
																			if (i_8_ != 2) {
																				if (i_8_ != 3) {
																					if (i_8_ != 4) {
																						if ((i_8_ ^ 0xffffffff) != -6) {
																							if (i_8_ != 12) {
																								if (i_8_ != 13) {
																									if (i_8_ != 10) {
																										if (i_8_ != 11) {
																											if ((i_8_ ^ 0xffffffff) != -7) {
																												if (i_8_ != 7) {
																													if ((i_8_ ^ 0xffffffff) != -9) {
																														if (i_8_ != 9) {
																															if ((i_8_ ^ 0xffffffff) != -15) {
																																if ((i_8_ ^ 0xffffffff) != -16) {
																																	if ((i_8_ ^ 0xffffffff) == -17) {
																																		break while_15_;
																																	}
																																	break while_16_;
																																}
																															} else {
																																break while_13_;
																															}
																															break while_14_;
																														}
																													} else {
																														break while_11_;
																													}
																													break while_12_;
																												}
																											} else {
																												break while_9_;
																											}
																											break while_10_;
																										}
																									} else {
																										break while_7_;
																									}
																									break while_8_;
																								}
																							} else {
																								break while_5_;
																							}
																							break while_6_;
																						}
																					} else {
																						break;
																					}
																					break while_4_;
																				}
																			} else {
																				anInt52 = 2048;
																				anInt60 = 2048;
																				anInt53 = 1;
																				anInt56 = 0;
																				break while_17_;
																			}
																			anInt56 = 0;
																			anInt52 = 2048;
																			anInt53 = 1;
																			anInt60 = 4096;
																			break while_17_;
																		} while (false);
																		anInt52 = 2048;
																		anInt53 = 4;
																		anInt60 = 2048;
																		anInt56 = 0;
																		break while_17_;
																	} while (false);
																	anInt56 = 0;
																	anInt53 = 4;
																	anInt52 = 2048;
																	anInt60 = 8192;
																	break while_17_;
																} while (false);
																anInt53 = 2;
																anInt56 = 0;
																anInt60 = 2048;
																anInt52 = 2048;
																break while_17_;
															} while (false);
															anInt53 = 2;
															anInt56 = 0;
															anInt52 = 2048;
															anInt60 = 8192;
															break while_17_;
														} while (false);
														anInt52 = 512;
														anInt56 = 1536;
														anInt53 = 3;
														anInt60 = 2048;
														break while_17_;
													} while (false);
													anInt52 = 512;
													anInt53 = 3;
													anInt56 = 1536;
													anInt60 = 4096;
													break while_17_;
												} while (false);
												anInt52 = 768;
												anInt56 = 1280;
												anInt53 = 3;
												anInt60 = 2048;
												break while_17_;
											} while (false);
											anInt56 = 1280;
											anInt53 = 3;
											anInt60 = 4096;
											anInt52 = 768;
											break while_17_;
										} while (false);
										anInt52 = 1024;
										anInt53 = 3;
										anInt56 = 1024;
										anInt60 = 2048;
										break while_17_;
									} while (false);
									anInt60 = 4096;
									anInt53 = 3;
									anInt56 = 1024;
									anInt52 = 1024;
									break while_17_;
								} while (false);
								anInt56 = 1280;
								anInt53 = 1;
								anInt60 = 2048;
								anInt52 = 768;
								break while_17_;
							} while (false);
							anInt53 = 1;
							anInt60 = 4096;
							anInt56 = 1536;
							anInt52 = 512;
							break while_17_;
						} while (false);
						anInt53 = 1;
						anInt52 = 256;
						anInt60 = 8192;
						anInt56 = 1792;
						break while_17_;
					} while (false);
					anInt52 = 2048;
					anInt53 = 0;
					anInt56 = 0;
					anInt60 = 2048;
				} while (false);
				if (i <= 0) {
					break;
				}
				method163(-26);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ab.E(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method165(final byte i, final Class207 class207) {
		try {
			aa.anInt51 = class207.getResourceByName((byte) -107, "hitmarks");
			Class140.anInt3243 = class207.getResourceByName((byte) -106,
					"hitbar_default");
			Class65.anInt503 = class207.getResourceByName((byte) -71,
					"timerbar_default");
			if (i >= -95) {
				aClass207_67 = null;
			}
			Class260.anInt3259 = class207
					.getResourceByName((byte) -61, "headicons_pk");
			Class251.anInt1916 = class207.getResourceByName((byte) -92,
					"headicons_prayer");
			Class319.anInt2706 = class207.getResourceByName((byte) -67,
					"hint_headicons");
			Class76_Sub2.anInt3728 = class207.getResourceByName((byte) -68,
					"hint_mapmarkers");
			Class226.anInt1706 = class207.getResourceByName((byte) -93, "mapflag");
			Class39.anInt363 = class207.getResourceByName((byte) -55, "cross");
			OutputStream_Sub1.anInt37 = class207.getResourceByName((byte) -87,
					"mapdots");
			Class243.anInt1852 = class207.getResourceByName((byte) -67, "scrollbar");
			Class98_Sub31_Sub4.anInt5860 = class207.getResourceByName((byte) -68,
					"name_icons");
			Class75.anInt583 = class207.getResourceByName((byte) -94, "floorshadows");
			Class111_Sub2.anInt4695 = class207.getResourceByName((byte) -123,
					"compass");
			Class264.anInt1972 = class207.getResourceByName((byte) -50, "otherlevel");
			Class76.anInt588 = class207.getResourceByName((byte) -101, "hint_mapedge");
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ab.C(" + i + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method166(final int i, final int i_9_, final int i_10_,
			final byte i_11_, final int i_12_) {
		try {
			anInt53 = i_12_;
			if (i_11_ <= -81) {
				anInt56 = i_10_;
				anInt52 = i_9_;
				anInt60 = i;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ab.H(" + i + ','
					+ i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	private final void method167(final byte i, final ha var_ha,
			final int i_13_, final int i_14_, final int i_15_, final int i_16_,
			final int i_17_) {
		do {
			try {
				aClass98_Sub5_55 = var_ha.method1765(i_15_, i_17_, i_13_,
						i_16_, i_14_, 1.0F);
				if (i < -21) {
					break;
				}
				method164(-124);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ab.G(" + i
						+ ',' + (var_ha != null ? "{...}" : "null") + ','
						+ i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ','
						+ i_17_ + ')'));
			}
			break;
		} while (false);
	}

	protected Class1() {
		try {
			if (Class287_Sub1.anIntArray3421 == null) {
				Class358.method3887(110);
			}
			method164(-48);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ab.<init>(" + ')');
		}
	}

	Class1(final ha var_ha, final ByteBuffer class98_sub22, final int i) {
		try {
			if (Class287_Sub1.anIntArray3421 == null) {
				Class358.method3887(110);
			}
			anInt57 = class98_sub22.readUnsignedByte((byte) -105);
			aBoolean54 = (0x10 & anInt57 ^ 0xffffffff) != -1;
			aBoolean58 = (anInt57 & 0x8 ^ 0xffffffff) != -1;
			anInt57 = anInt57 & 0x7;
			final int i_18_ = class98_sub22.readUnsignedShort((byte) 127) << i;
			final int i_19_ = class98_sub22.readUnsignedShort((byte) 127) << i;
			final int i_20_ = class98_sub22.readUnsignedShort((byte) 127) << i;
			int i_21_ = class98_sub22.readUnsignedByte((byte) 26);
			final int i_22_ = 1 + 2 * i_21_;
			aShortArray59 = new short[i_22_];
			for (int i_23_ = 0; ((i_23_ ^ 0xffffffff) > (aShortArray59.length ^ 0xffffffff)); i_23_++) {
				final int i_24_ = (short) class98_sub22.readUnsignedShort((byte) 127);
				int i_25_ = i_24_ >>> -502532568;
				int i_26_ = i_24_ & 0xff;
				if ((i_25_ ^ 0xffffffff) <= (i_22_ ^ 0xffffffff)) {
					i_25_ = i_22_ - 1;
				}
				if (i_26_ > -i_25_ + i_22_) {
					i_26_ = -i_25_ + i_22_;
				}
				aShortArray59[i_23_] = (short) Class41.method366(
						i_25_ << 1030619432, i_26_);
			}
			i_21_ = (i_21_ << Class151_Sub8.anInt5015) + Class207.anInt1577;
			final int i_27_ = (Class208.anIntArray1579 != null ? (Class208.anIntArray1579[class98_sub22
					.readUnsignedShort((byte) 127)])
					: (Class221.anIntArray1665[Class111_Sub2.method2117(
							class98_sub22.readUnsignedShort((byte) 127), 61) & 0xffff]));
			final int i_28_ = class98_sub22.readUnsignedByte((byte) -110);
			anInt62 = 0x1f & i_28_;
			anInt61 = 0x700 & i_28_ << -997312285;
			if (anInt62 != 31) {
				method164(-31);
			}
			method167((byte) -56, var_ha, i_19_, i_27_, i_18_, i_21_, i_20_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("ab.<init>(" + (var_ha != null ? "{...}" : "null") + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	static {
		aClass128_64 = new Class128();
	}
}
