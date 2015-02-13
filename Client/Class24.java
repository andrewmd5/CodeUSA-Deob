/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class24 {
	static int anInt223;
	int anInt224;
	int anInt225;
	int anInt226;
	private int anInt227;
	int anInt228;
	byte[] aByteArray229;
	boolean aBoolean230;
	private int anInt231;
	String aString232;
	Class341 aClass341_233;
	int[] anIntArray234;
	int anInt235;
	private int anInt236;
	String[] aStringArray237;
	int anInt238;
	int anInt239;
	private int anInt240 = -1;
	boolean aBoolean241;
	static int anInt242;
	private int anInt243;
	int anInt244 = 2147483647;
	int anInt245;
	int anInt246 = -1;
	int anInt247;
	int anInt248;
	int anInt249;
	int anInt250;
	private int anInt251;
	int anInt252;
	int anInt253;
	private int anInt254;
	static int anInt255 = 0;
	private Class377 aClass377_256;
	int anInt257;
	boolean aBoolean258;
	private int anInt259;
	private int anInt260;
	boolean aBoolean261;
	int anInt262;
	String aString263;
	int anInt264;
	int[] anIntArray265;

	final boolean method284(final int i, final Interface6 interface6) {
		try {
			int i_0_;
			if (anInt260 == -1) {
				if ((anInt259 ^ 0xffffffff) == 0) {
					return true;
				}
				i_0_ = interface6.method7(anInt259, 7373);
			} else {
				i_0_ = interface6.method6(anInt260, 83);
			}
			if ((i_0_ ^ 0xffffffff) > (anInt251 ^ 0xffffffff)
					|| anInt227 < i_0_) {
				return false;
			}
			if (i < 6) {
				anInt225 = -120;
			}
			int i_1_;
			if (anInt243 == -1) {
				if (anInt240 != -1) {
					i_1_ = interface6.method7(anInt240, 7373);
				} else {
					return true;
				}
			} else {
				i_1_ = interface6.method6(anInt243, 63);
			}
			if ((i_1_ ^ 0xffffffff) > (anInt254 ^ 0xffffffff)
					|| (i_1_ ^ 0xffffffff) < (anInt236 ^ 0xffffffff)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bq.G(" + i + ','
					+ (interface6 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method285(final int i, final int i_2_, final int i_3_) {
		try {
			if (aClass377_256 == null) {
				return i_3_;
			}
			if (i < 47) {
				method289(67, null, 54);
			}
			final Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass377_256
					.method3990(i_2_, -1);
			if (class98_sub34 == null) {
				return i_3_;
			}
			return class98_sub34.anInt4126;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bq.D(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	final Class332 method286(final ha var_ha, final byte i) {
		try {
			Class332 class332 = ((Class332) (aClass341_233.aClass79_2857
					.method802(-119, 0x20000 | anInt231
							| var_ha.anInt937 << 947659261)));
			if (class332 != null) {
				return class332;
			}
			aClass341_233.aClass207_2852.method2742(-84, anInt231);
			final Class324 class324 = Class324.method3685(
					(aClass341_233.aClass207_2852), anInt231, 0);
			if (class324 != null) {
				class332 = var_ha.method1758(class324, true);
				aClass341_233.aClass79_2857.method805(anInt231 | 0x20000
						| var_ha.anInt937 << 160002877, class332, (byte) -80);
			}
			if (i != 92) {
				method290(null, -73);
			}
			return class332;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bq.B("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class332 method287(final byte i, final ha var_ha, final boolean bool) {
		try {
			final int i_4_ = bool ? anInt225 : anInt245;
			final int i_5_ = var_ha.anInt937 << 548917245 | i_4_;
			if (i != 92) {
				anInt257 = 107;
			}
			Class332 class332 = ((Class332) aClass341_233.aClass79_2857
					.method802(i + -214, i_5_));
			if (class332 != null) {
				return class332;
			}
			if (!aClass341_233.aClass207_2852.method2742(-52, i_4_)) {
				return null;
			}
			final Class324 class324 = Class324.method3685(
					(aClass341_233.aClass207_2852), i_4_, 0);
			if (class324 != null) {
				class332 = var_ha.method1758(class324, true);
				aClass341_233.aClass79_2857.method805(i_5_, class332,
						(byte) -80);
			}
			return class332;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bq.H(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	private final void method288(final int i, final int i_6_,
			final ByteBuffer class98_sub22) {
		try {
			if (i == 27177) {
				if (i_6_ != 1) {
					if ((i_6_ ^ 0xffffffff) != -3) {
						if (i_6_ != 3) {
							if (i_6_ != 4) {
								if (i_6_ != 5) {
									if ((i_6_ ^ 0xffffffff) != -7) {
										if (i_6_ != 7) {
											if (i_6_ == 8) {
												aBoolean261 = (class98_sub22
														.readUnsignedByte((byte) 113)) == 1;
											} else if ((i_6_ ^ 0xffffffff) == -10) {
												anInt259 = (class98_sub22
														.readUnsignedShort((byte) 127));
												if (anInt259 == 65535) {
													anInt259 = -1;
												}
												anInt260 = (class98_sub22
														.readUnsignedShort((byte) 127));
												if ((anInt260 ^ 0xffffffff) == -65536) {
													anInt260 = -1;
												}
												anInt251 = class98_sub22
														.readInt(-2);
												anInt227 = class98_sub22
														.readInt(-2);
											} else if (i_6_ >= 10 && i_6_ <= 14) {
												aStringArray237[-10 + i_6_] = (class98_sub22
														.readString((byte) 84));
											} else if ((i_6_ ^ 0xffffffff) != -16) {
												if ((i_6_ ^ 0xffffffff) == -17) {
													aBoolean241 = false;
												} else if (i_6_ != 17) {
													if (i_6_ == 18) {
														anInt231 = (class98_sub22
																.readUnsignedShort((byte) 127));
													} else if ((i_6_ ^ 0xffffffff) != -20) {
														if ((i_6_ ^ 0xffffffff) == -21) {
															anInt240 = (class98_sub22
																	.readUnsignedShort((byte) 127));
															if ((anInt240 ^ 0xffffffff) == -65536) {
																anInt240 = -1;
															}
															anInt243 = (class98_sub22
																	.readUnsignedShort((byte) 127));
															if (anInt243 == 65535) {
																anInt243 = -1;
															}
															anInt254 = (class98_sub22
																	.readInt(-2));
															anInt236 = (class98_sub22
																	.readInt(-2));
														} else if ((i_6_ ^ 0xffffffff) != -22) {
															if ((i_6_ ^ 0xffffffff) != -23) {
																if (i_6_ != 23) {
																	if ((i_6_ ^ 0xffffffff) == -25) {
																		anInt235 = class98_sub22
																				.readUShort(false);
																		anInt252 = class98_sub22
																				.readUShort(false);
																	} else if ((i_6_ ^ 0xffffffff) == -250) {
																		final int i_7_ = class98_sub22
																				.readUnsignedByte((byte) -115);
																		if (aClass377_256 == null) {
																			final int i_8_ = Class48
																					.method453(
																							423660257,
																							i_7_);
																			aClass377_256 = new Class377(
																					i_8_);
																		}
																		for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
																			final boolean bool = class98_sub22
																					.readUnsignedByte((byte) 76) == 1;
																			final int i_10_ = class98_sub22
																					.readMediumInt(i
																							^ ~0x6a52);
																			Class98 class98;
																			if (bool) {
																				class98 = new Class98_Sub15(
																						class98_sub22
																								.readString((byte) 84));
																			} else {
																				class98 = new Class98_Sub34(
																						class98_sub22
																								.readInt(-2));
																			}
																			aClass377_256
																					.method3996(
																							class98,
																							i_10_,
																							-1);
																		}
																	}
																} else {
																	anInt250 = (class98_sub22
																			.readUnsignedByte((byte) -3));
																	anInt253 = (class98_sub22
																			.readUnsignedByte((byte) -109));
																	anInt224 = (class98_sub22
																			.readUnsignedByte((byte) -116));
																}
															} else {
																anInt226 = (class98_sub22
																		.readInt(-2));
															}
														} else {
															anInt239 = (class98_sub22
																	.readInt(-2));
														}
													} else {
														anInt246 = (class98_sub22
																.readUnsignedShort((byte) 127));
													}
												} else {
													aString232 = (class98_sub22
															.readString((byte) 84));
												}
											} else {
												final int i_11_ = (class98_sub22
														.readUnsignedByte((byte) -124));
												anIntArray265 = new int[i_11_ * 2];
												for (int i_12_ = 0; ((2 * i_11_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
													anIntArray265[i_12_] = (class98_sub22
															.readUShort(false));
												}
												anInt249 = class98_sub22
														.readInt(-2);
												final int i_13_ = (class98_sub22
														.readUnsignedByte((byte) 67));
												anIntArray234 = new int[i_13_];
												for (int i_14_ = 0; (((anIntArray234).length ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++) {
													anIntArray234[i_14_] = (class98_sub22
															.readInt(i + -27179));
												}
												aByteArray229 = new byte[i_11_];
												for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff)); i_15_++) {
													aByteArray229[i_15_] = (class98_sub22
															.readSignedByte((byte) -19));
												}
											}
										} else {
											final int i_16_ = class98_sub22
													.readUnsignedByte((byte) 19);
											if ((0x2 & i_16_) == 2) {
												aBoolean230 = true;
											}
											if ((0x1 & i_16_) == 0) {
												aBoolean258 = false;
											}
										}
									} else {
										anInt264 = class98_sub22
												.readUnsignedByte((byte) 48);
									}
								} else {
									anInt238 = class98_sub22.readMediumInt(-128);
								}
							} else {
								anInt257 = class98_sub22.readMediumInt(-124);
							}
						} else {
							aString263 = class98_sub22.readString((byte) 84);
						}
					} else {
						anInt225 = class98_sub22.readUnsignedShort((byte) 127);
					}
				} else {
					anInt245 = class98_sub22.readUnsignedShort((byte) 127);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(
							runtimeexception,
							("bq.E("
									+ i
									+ ','
									+ i_6_
									+ ','
									+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	final String method289(final int i, final String string, final int i_17_) {
		try {
			if (aClass377_256 == null) {
				return string;
			}
			final Class98_Sub15 class98_sub15 = (Class98_Sub15) aClass377_256
					.method3990(i_17_, -1);
			if (class98_sub15 == null) {
				return string;
			}
			if (i != -5911) {
				anInt248 = 76;
			}
			return class98_sub15.aString3917;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bq.A(" + i + ','
					+ (string != null ? "{...}" : "null") + ',' + i_17_ + ')'));
		}
	}

	final void method290(final ByteBuffer class98_sub22, final int i) {
		do {
			try {
				for (;;) {
					final int i_18_ = class98_sub22
							.readUnsignedByte((byte) 115);
					if ((i_18_ ^ 0xffffffff) == -1) {
						break;
					}
					method288(i + 27172, i_18_, class98_sub22);
				}
				if (i == 5) {
					break;
				}
				method289(-65, null, 33);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("bq.F(" + (class98_sub22 != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method291(final int i) {
		do {
			try {
				if (anIntArray265 != null) {
					for (int i_19_ = 0; ((anIntArray265.length ^ 0xffffffff) < (i_19_ ^ 0xffffffff)); i_19_ += 2) {
						if (anIntArray265[i_19_] >= anInt244) {
							if (anIntArray265[i_19_] > anInt247) {
								anInt247 = anIntArray265[i_19_];
							}
						} else {
							anInt244 = anIntArray265[i_19_];
						}
						if ((anIntArray265[1 + i_19_] ^ 0xffffffff) <= (anInt248 ^ 0xffffffff)) {
							if (anInt262 < anIntArray265[i_19_ - -1]) {
								anInt262 = (anIntArray265[i_19_ + 1]);
							}
						} else {
							anInt248 = anIntArray265[i_19_ + 1];
						}
					}
				}
				if (i == -25798) {
					break;
				}
				method289(10, null, -15);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bq.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public Class24() {
		anInt245 = -1;
		anInt224 = -1;
		anInt248 = 2147483647;
		anInt243 = -1;
		anInt231 = -1;
		anInt247 = -2147483648;
		anInt238 = -1;
		anInt225 = -1;
		aBoolean230 = false;
		aBoolean261 = true;
		aBoolean258 = true;
		anInt253 = -1;
		anInt259 = -1;
		aBoolean241 = true;
		anInt260 = -1;
		anInt262 = -2147483648;
		anInt264 = 0;
		anInt250 = -1;
		aStringArray237 = new String[5];
	}

	static {
		anInt242 = 1;
	}
}
