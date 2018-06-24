/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class294 {
	int anInt2357;
	private final int anInt2358 = -1;
	int anInt2359;
	int anInt2360;
	int anInt2361 = -1;
	int anInt2362;
	int anInt2363;
	int[][] anIntArrayArray2364;
	int anInt2365;
	int[][] anIntArrayArray2366;
	private int anInt2367;
	int anInt2368;
	int anInt2369;
	int anInt2370;
	static int anInt2371 = 1405;
	int anInt2372;
	int[] anIntArray2373;
	int anInt2374;
	int anInt2375;
	int anInt2376;
	int anInt2377;
	int anInt2378;
	int[] anIntArray2379;
	int anInt2380;
	int anInt2381;
	int anInt2382;
	int anInt2383;
	int anInt2384;
	int anInt2385;
	int[] anIntArray2386;
	private Class111[] aClass111Array2387;
	int anInt2388;
	int anInt2389;
	int anInt2390;
	int anInt2391;
	int anInt2392;
	int anInt2393;
	int anInt2394;
	int[] anIntArray2395;
	int anInt2396;
	static Class377 aClass377_2397 = new Class377(16);
	int anInt2398;
	int anInt2399;
	boolean aBoolean2400;
	int anInt2401;
	int anInt2402;
	int anInt2403;
	int anInt2404;
	int anInt2405;
	static int[] anIntArray2406;
	static int anInt2407;
	static int[] anIntArray2408 = new int[1000];

	final void method3475(final int i, final ByteBuffer class98_sub22) {
		try {
			if (i == -22400) {
				for (;;) {
					final int i_0_ = class98_sub22
							.readUnsignedByte((byte) -103);
					if ((i_0_ ^ 0xffffffff) == -1) {
						break;
					}
					method3476(class98_sub22, i_0_, 91);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sc.F(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method3476(final ByteBuffer class98_sub22,
			final int i, final int i_1_) {
		do {
			try {
				if (i_1_ > 76) {
					if ((i ^ 0xffffffff) != -2) {
						if (i != 2) {
							if ((i ^ 0xffffffff) != -4) {
								if ((i ^ 0xffffffff) != -5) {
									if (i != 5) {
										if ((i ^ 0xffffffff) == -7) {
											anInt2389 = class98_sub22
													.readUnsignedShort((byte) 127);
										} else if ((i ^ 0xffffffff) == -8) {
											anInt2361 = class98_sub22
													.readUnsignedShort((byte) 127);
										} else if ((i ^ 0xffffffff) != -9) {
											if ((i ^ 0xffffffff) != -10) {
												if (i == 26) {
													anInt2362 = (short) ((class98_sub22
															.readUnsignedByte((byte) -101)) * 4);
													anInt2382 = (short) ((class98_sub22
															.readUnsignedByte((byte) -126)) * 4);
												} else if (i == 27) {
													if ((anIntArrayArray2366) == null) {
														anIntArrayArray2366 = new int[12][];
													}
													final int i_2_ = (class98_sub22
															.readUnsignedByte((byte) 28));
													anIntArrayArray2366[i_2_] = new int[6];
													for (int i_3_ = 0; i_3_ < 6; i_3_++) {
														anIntArrayArray2366[i_2_][i_3_] = (class98_sub22
																.readUShort(false));
													}
												} else if (i == 28) {
													anIntArray2379 = new int[12];
													for (int i_4_ = 0; i_4_ < 12; i_4_++) {
														anIntArray2379[i_4_] = (class98_sub22
																.readUnsignedByte((byte) 101));
														if (((anIntArray2379[i_4_]) ^ 0xffffffff) == -256) {
															anIntArray2379[i_4_] = -1;
														}
													}
												} else if (i == 29) {
													anInt2398 = (class98_sub22
															.readUnsignedByte((byte) -124));
												} else if ((i ^ 0xffffffff) != -31) {
													if (i == 31) {
														anInt2390 = (class98_sub22
																.readUnsignedByte((byte) -116));
													} else if (i != 32) {
														if (i == 33) {
															anInt2393 = (class98_sub22
																	.readUShort(false));
														} else if (i != 34) {
															if (i != 35) {
																if ((i ^ 0xffffffff) != -37) {
																	if ((i ^ 0xffffffff) == -38) {
																		anInt2401 = class98_sub22
																				.readUnsignedByte((byte) 2);
																	} else if (i == 38) {
																		anInt2376 = class98_sub22
																				.readUnsignedShort((byte) 127);
																	} else if ((i ^ 0xffffffff) != -40) {
																		if (i != 40) {
																			if ((i ^ 0xffffffff) != -42) {
																				if (i != 42) {
																					if (i != 43) {
																						if (i == 44) {
																							anInt2374 = class98_sub22
																									.readUnsignedShort((byte) 127);
																						} else if ((i ^ 0xffffffff) == -46) {
																							anInt2385 = class98_sub22
																									.readUnsignedShort((byte) 127);
																						} else if ((i ^ 0xffffffff) != -47) {
																							if ((i ^ 0xffffffff) != -48) {
																								if (i == 48) {
																									anInt2384 = class98_sub22
																											.readUnsignedShort((byte) 127);
																								} else if ((i ^ 0xffffffff) == -50) {
																									anInt2370 = class98_sub22
																											.readUnsignedShort((byte) 127);
																								} else if (i == 50) {
																									anInt2378 = class98_sub22
																											.readUnsignedShort((byte) 127);
																								} else if (i != 51) {
																									if (i != 52) {
																										if ((i ^ 0xffffffff) == -54) {
																											aBoolean2400 = false;
																										} else if ((i ^ 0xffffffff) == -55) {
																											anInt2360 = class98_sub22
																													.readUnsignedByte((byte) 77) << -1514864954;
																											anInt2391 = class98_sub22
																													.readUnsignedByte((byte) -121) << 666953990;
																										} else if ((i ^ 0xffffffff) == -56) {
																											if (anIntArray2373 == null) {
																												anIntArray2373 = new int[12];
																											}
																											final int i_5_ = class98_sub22
																													.readUnsignedByte((byte) 121);
																											anIntArray2373[i_5_] = class98_sub22
																													.readUnsignedShort((byte) 127);
																										} else if (i == 56) {
																											if (anIntArrayArray2364 == null) {
																												anIntArrayArray2364 = new int[12][];
																											}
																											final int i_6_ = class98_sub22
																													.readUnsignedByte((byte) 92);
																											anIntArrayArray2364[i_6_] = new int[3];
																											for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -4; i_7_++) {
																												anIntArrayArray2364[i_6_][i_7_] = class98_sub22
																														.readUShort(false);
																											}
																										}
																									} else {
																										final int i_8_ = class98_sub22
																												.readUnsignedByte((byte) 106);
																										anIntArray2395 = new int[i_8_];
																										anIntArray2386 = new int[i_8_];
																										for (int i_9_ = 0; i_8_ > i_9_; i_9_++) {
																											anIntArray2395[i_9_] = class98_sub22
																													.readUnsignedShort((byte) 127);
																											final int i_10_ = class98_sub22
																													.readUnsignedByte((byte) -113);
																											anIntArray2386[i_9_] = i_10_;
																											anInt2367 += i_10_;
																										}
																									}
																								} else {
																									anInt2369 = class98_sub22
																											.readUnsignedShort((byte) 127);
																								}
																							} else {
																								anInt2404 = class98_sub22
																										.readUnsignedShort((byte) 127);
																							}
																						} else {
																							anInt2405 = class98_sub22
																									.readUnsignedShort((byte) 127);
																						}
																					} else {
																						anInt2381 = class98_sub22
																								.readUnsignedShort((byte) 127);
																					}
																				} else {
																					anInt2372 = class98_sub22
																							.readUnsignedShort((byte) 127);
																				}
																			} else {
																				anInt2359 = class98_sub22
																						.readUnsignedShort((byte) 127);
																			}
																		} else {
																			anInt2365 = class98_sub22
																					.readUnsignedShort((byte) 127);
																		}
																	} else {
																		anInt2388 = class98_sub22
																				.readUnsignedShort((byte) 127);
																	}
																} else {
																	anInt2363 = (class98_sub22
																			.readUShort(false));
																}
															} else {
																anInt2380 = (class98_sub22
																		.readUnsignedShort((byte) 127));
															}
														} else {
															anInt2375 = (class98_sub22
																	.readUnsignedByte((byte) 10));
														}
													} else {
														anInt2392 = (class98_sub22
																.readUnsignedShort((byte) 127));
													}
												} else {
													anInt2383 = (class98_sub22
															.readUnsignedShort((byte) 127));
												}
											} else {
												anInt2402 = (class98_sub22
														.readUnsignedShort((byte) 127));
											}
										} else {
											anInt2357 = class98_sub22
													.readUnsignedShort((byte) 127);
										}
									} else {
										anInt2403 = class98_sub22
												.readUnsignedShort((byte) 127);
									}
								} else {
									anInt2377 = class98_sub22
											.readUnsignedShort((byte) 127);
								}
							} else {
								anInt2394 = class98_sub22.readUnsignedShort((byte) 127);
							}
						} else {
							anInt2368 = class98_sub22.readUnsignedShort((byte) 127);
						}
					} else {
						anInt2396 = class98_sub22.readUnsignedShort((byte) 127);
						anInt2399 = class98_sub22.readUnsignedShort((byte) 127);
						if (anInt2396 == 65535) {
							anInt2396 = -1;
						}
						if ((anInt2399 ^ 0xffffffff) != -65536) {
							break;
						}
						anInt2399 = -1;
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("sc.H("
						+ (class98_sub22 != null ? "{...}" : "null") + ',' + i
						+ ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method3477(final int i, final int i_11_,
			final int i_12_, final int i_13_, final int i_14_) {
		try {
			if ((Class281.aByteArrayArrayArray2117[0][i_12_][i] & 0x2 ^ 0xffffffff) != -1) {
				return true;
			}
			if ((Class281.aByteArrayArrayArray2117[i_11_][i_12_][i] & 0x10) != 0) {
				return false;
			}
			if (Class98_Sub31_Sub4.method1390(i, i_11_, i_12_, -8941) == i_13_) {
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sc.B(" + i + ','
					+ i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	final int method3478(final int i) {
		try {
			if ((anInt2396 ^ 0xffffffff) != 0) {
				return anInt2396;
			}
			if (anIntArray2395 != null) {
				int i_17_ = (int) (Math.random() * anInt2367);
				int i_18_;
				for (i_18_ = 0; anIntArray2386[i_18_] <= i_17_; i_18_++) {
					i_17_ -= anIntArray2386[i_18_];
				}
				return anIntArray2395[i_18_];
			}
			return -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sc.D(" + i + ')');
		}
	}

	static final void method3479(final int i, final int i_19_, final int i_20_,
			final int i_21_, final int i_22_, final int i_23_, final int i_24_) {
		try {
			final Class36[] class36s = Class104.aClass36Array903;
			int i_25_ = 0;
			if (i_20_ == -7957) {
				for (/**/; (class36s.length ^ 0xffffffff) < (i_25_ ^ 0xffffffff); i_25_++) {
					final Class36 class36 = class36s[i_25_];
					if (class36 != null && class36.anInt346 == 2) {
						Class42_Sub1.method385(i_24_, class36.anInt342,
								class36.anInt338, i_20_ + 7956, i,
								2 * (class36.anInt343), class36.anInt347,
								i_21_ >> 1378251745, i_19_ >> 830958817);
						if ((Class259.anIntArray1957[0] ^ 0xffffffff) < 0
								&& Class215.anInt1614 % 20 < 10) {
							final Class332 class332 = (Class306.aClass332Array2557[class36.anInt341]);
							final int i_26_ = -12
									+ (Class259.anIntArray1957[0] + i_22_);
							final int i_27_ = -28
									+ (i_23_ + Class259.anIntArray1957[1]);
							class332.method3735(i_26_, i_27_);
							Class93_Sub1_Sub1.method908(
									i_27_ - -class332.method3749(), i_27_,
									false, i_26_,
									i_26_ - -class332.method3737());
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sc.E(" + i + ','
					+ i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ','
					+ i_23_ + ',' + i_24_ + ')'));
		}
	}

	final boolean method3480(final byte i, final int i_28_) {
		try {
			if ((i_28_ ^ 0xffffffff) == 0) {
				return false;
			}
			if ((anInt2396 ^ 0xffffffff) == (i_28_ ^ 0xffffffff)) {
				return true;
			}
			if (anIntArray2395 != null) {
				for (int i_30_ = 0; anIntArray2395.length > i_30_; i_30_++) {
					if ((anIntArray2395[i_30_] ^ 0xffffffff) == (i_28_ ^ 0xffffffff)) {
						return true;
					}
				}
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sc.G(" + i + ','
					+ i_28_ + ')');
		}
	}

	final Class111[] method3481(final ha var_ha, final byte i) {
		try {
			if (aClass111Array2387 != null && var_ha.anInt937 == anInt2358) {
				return aClass111Array2387;
			}
			if (anIntArrayArray2366 == null) {
				return null;
			}
			aClass111Array2387 = new Class111[anIntArrayArray2366.length];
			for (int i_32_ = 0; ((anIntArrayArray2366.length ^ 0xffffffff) < (i_32_ ^ 0xffffffff)); i_32_++) {
				int i_33_ = 0;
				int i_34_ = 0;
				int i_35_ = 0;
				int i_36_ = 0;
				int i_37_ = 0;
				int i_38_ = 0;
				if (anIntArrayArray2366[i_32_] != null) {
					i_36_ = (anIntArrayArray2366[i_32_][3] << 1842507107);
					i_35_ = anIntArrayArray2366[i_32_][2];
					i_38_ = (anIntArrayArray2366[i_32_][5] << 813035747);
					i_37_ = (anIntArrayArray2366[i_32_][4] << 1803526819);
					i_34_ = anIntArrayArray2366[i_32_][1];
					i_33_ = anIntArrayArray2366[i_32_][0];
				}
				if ((i_33_ ^ 0xffffffff) != -1 || (i_34_ ^ 0xffffffff) != -1
						|| (i_35_ ^ 0xffffffff) != -1
						|| (i_36_ ^ 0xffffffff) != -1 || i_37_ != 0
						|| (i_38_ ^ 0xffffffff) != -1) {
					final Class111 class111 = aClass111Array2387[i_32_] = var_ha
							.method1821();
					if (i_38_ != 0) {
						class111.method2090(i_38_);
					}
					if ((i_36_ ^ 0xffffffff) != -1) {
						class111.method2105(i_36_);
					}
					if (i_37_ != 0) {
						class111.method2097(i_37_);
					}
					class111.method2106(i_33_, i_34_, i_35_);
				}
			}
			return aClass111Array2387;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sc.C("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method3482(final int i) {
		try {
			if (i == -10494) {
				anIntArray2408 = null;
				aClass377_2397 = null;
				anIntArray2406 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sc.A(" + i + ')');
		}
	}

	public Class294() {
		anInt2359 = -1;
		anInt2362 = 0;
		anInt2368 = -1;
		anInt2370 = -1;
		anInt2357 = -1;
		anInt2380 = 0;
		anInt2360 = 0;
		anInt2374 = -1;
		anInt2372 = -1;
		anIntArray2386 = null;
		anInt2376 = -1;
		anInt2378 = -1;
		anInt2382 = 0;
		anInt2375 = 0;
		anInt2369 = -1;
		anInt2383 = 0;
		anInt2367 = 0;
		anInt2381 = -1;
		anInt2377 = -1;
		anInt2363 = 0;
		anInt2384 = -1;
		anInt2365 = -1;
		anInt2388 = -1;
		anInt2389 = -1;
		anInt2396 = -1;
		anInt2385 = -1;
		anInt2391 = 0;
		anInt2393 = 0;
		anInt2394 = -1;
		anInt2390 = 0;
		anInt2399 = -1;
		anIntArray2395 = null;
		anInt2392 = 0;
		anInt2398 = 0;
		anInt2401 = -1;
		anInt2404 = -1;
		aBoolean2400 = true;
		anInt2403 = -1;
		anInt2405 = -1;
		anInt2402 = -1;
	}
}
