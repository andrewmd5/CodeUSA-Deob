/* Class98_Sub10_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub33 extends Class98_Sub10 {
	private int[] anIntArray5723 = new int[257];
	private int[][] anIntArrayArray5724;

	public Class98_Sub10_Sub33() {
		super(1, false);
	}

	@Override
	final int[][] method997(final int i, final int i_0_) {
		try {
			if (i > -76) {
				anIntArrayArray5724 = null;
			}
			final int[][] is = ((Class98_Sub10) this).aClass223_3859
					.method2828(i_0_, 0);
			if (((Class98_Sub10) this).aClass223_3859.aBoolean1683) {
				final int[] is_1_ = method1000(i_0_, 0, 0);
				final int[] is_2_ = is[0];
				final int[] is_3_ = is[1];
				final int[] is_4_ = is[2];
				for (int i_5_ = 0; i_5_ < Class25.anInt268; i_5_++) {
					int i_6_ = is_1_[i_5_] >> -1995832092;
					if (i_6_ < 0) {
						i_6_ = 0;
					}
					if ((i_6_ ^ 0xffffffff) < -257) {
						i_6_ = 256;
					}
					i_6_ = anIntArray5723[i_6_];
					is_2_[i_5_] = Class202.method2702(4080, i_6_ >> -604582996);
					is_3_[i_5_] = Class202.method2702(i_6_ >> 1240244164, 4080);
					is_4_[i_5_] = Class202.method2702(i_6_ << 1317982468, 4080);
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sg.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method1099(final int i, final int i_7_, final byte i_8_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i, -123, 13);
			class98_sub46_sub17.method1626((byte) -103);
			class98_sub46_sub17.anInt6054 = i_7_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sg.D(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	@Override
	final void method1001(final byte i) {
		try {
			if (anIntArrayArray5724 == null) {
				method1100(10, 1);
			}
			if (i == 66) {
				method1102(3);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sg.I(" + i + ')');
		}
	}

	private final void method1100(final int i, final int i_9_) {
		do {
			try {
				while_172_: do {
					if ((i_9_ ^ 0xffffffff) != -1) {
						final int i_10_ = i_9_;
						while_171_: do {
							while_170_: do {
								while_169_: do {
									while_168_: do {
										do {
											if (i_10_ != 1) {
												if ((i_10_ ^ 0xffffffff) != -3) {
													if (i_10_ != 3) {
														if (i_10_ != 4) {
															if (i_10_ != 5) {
																if (i_10_ != 6) {
																	break while_171_;
																}
															} else {
																break while_169_;
															}
															break while_170_;
														}
													} else {
														break;
													}
													break while_168_;
												}
											} else {
												anIntArrayArray5724 = new int[2][4];
												anIntArrayArray5724[0][0] = 0;
												anIntArrayArray5724[0][1] = 0;
												anIntArrayArray5724[0][3] = 0;
												anIntArrayArray5724[0][2] = 0;
												anIntArrayArray5724[1][2] = 4096;
												anIntArrayArray5724[1][0] = 4096;
												anIntArrayArray5724[1][1] = 4096;
												anIntArrayArray5724[1][3] = 4096;
												break while_172_;
											}
											anIntArrayArray5724 = new int[8][4];
											anIntArrayArray5724[0][3] = 2361;
											anIntArrayArray5724[0][0] = 0;
											anIntArrayArray5724[0][1] = 2650;
											anIntArrayArray5724[0][2] = 2602;
											anIntArrayArray5724[1][3] = 1558;
											anIntArrayArray5724[1][2] = 1799;
											anIntArrayArray5724[1][1] = 2313;
											anIntArrayArray5724[1][0] = 2867;
											anIntArrayArray5724[2][2] = 1734;
											anIntArrayArray5724[2][3] = 1413;
											anIntArrayArray5724[2][1] = 2618;
											anIntArrayArray5724[2][0] = 3072;
											anIntArrayArray5724[3][1] = 2296;
											anIntArrayArray5724[3][3] = 947;
											anIntArrayArray5724[3][0] = 3276;
											anIntArrayArray5724[3][2] = 1220;
											anIntArrayArray5724[4][1] = 2072;
											anIntArrayArray5724[4][3] = 722;
											anIntArrayArray5724[4][0] = 3481;
											anIntArrayArray5724[4][2] = 963;
											anIntArrayArray5724[5][2] = 2152;
											anIntArrayArray5724[5][0] = 3686;
											anIntArrayArray5724[5][1] = 2730;
											anIntArrayArray5724[5][3] = 1766;
											anIntArrayArray5724[6][2] = 1060;
											anIntArrayArray5724[6][0] = 3891;
											anIntArrayArray5724[6][1] = 2232;
											anIntArrayArray5724[6][3] = 915;
											anIntArrayArray5724[7][0] = 4096;
											anIntArrayArray5724[7][1] = 1686;
											anIntArrayArray5724[7][2] = 1413;
											anIntArrayArray5724[7][3] = 1140;
											break while_172_;
										} while (false);
										anIntArrayArray5724 = new int[7][4];
										anIntArrayArray5724[0][2] = 0;
										anIntArrayArray5724[0][3] = 4096;
										anIntArrayArray5724[0][0] = 0;
										anIntArrayArray5724[0][1] = 0;
										anIntArrayArray5724[1][2] = 4096;
										anIntArrayArray5724[1][0] = 663;
										anIntArrayArray5724[1][1] = 0;
										anIntArrayArray5724[1][3] = 4096;
										anIntArrayArray5724[2][1] = 0;
										anIntArrayArray5724[2][3] = 0;
										anIntArrayArray5724[2][2] = 4096;
										anIntArrayArray5724[2][0] = 1363;
										anIntArrayArray5724[3][0] = 2048;
										anIntArrayArray5724[3][1] = 4096;
										anIntArrayArray5724[3][3] = 0;
										anIntArrayArray5724[3][2] = 4096;
										anIntArrayArray5724[4][1] = 4096;
										anIntArrayArray5724[4][0] = 2727;
										anIntArrayArray5724[4][2] = 0;
										anIntArrayArray5724[4][3] = 0;
										anIntArrayArray5724[5][0] = 3411;
										anIntArrayArray5724[5][2] = 0;
										anIntArrayArray5724[5][3] = 4096;
										anIntArrayArray5724[5][1] = 4096;
										anIntArrayArray5724[6][2] = 0;
										anIntArrayArray5724[6][0] = 4096;
										anIntArrayArray5724[6][3] = 4096;
										anIntArrayArray5724[6][1] = 0;
										break while_172_;
									} while (false);
									anIntArrayArray5724 = new int[6][4];
									anIntArrayArray5724[0][2] = 0;
									anIntArrayArray5724[0][1] = 0;
									anIntArrayArray5724[0][3] = 0;
									anIntArrayArray5724[0][0] = 0;
									anIntArrayArray5724[1][2] = 0;
									anIntArrayArray5724[1][1] = 0;
									anIntArrayArray5724[1][3] = 1493;
									anIntArrayArray5724[1][0] = 1843;
									anIntArrayArray5724[2][1] = 0;
									anIntArrayArray5724[2][0] = 2457;
									anIntArrayArray5724[2][3] = 2939;
									anIntArrayArray5724[2][2] = 0;
									anIntArrayArray5724[3][2] = 1124;
									anIntArrayArray5724[3][0] = 2781;
									anIntArrayArray5724[3][3] = 3565;
									anIntArrayArray5724[3][1] = 0;
									anIntArrayArray5724[4][0] = 3481;
									anIntArrayArray5724[4][3] = 4031;
									anIntArrayArray5724[4][2] = 3084;
									anIntArrayArray5724[4][1] = 546;
									anIntArrayArray5724[5][3] = 4096;
									anIntArrayArray5724[5][1] = 4096;
									anIntArrayArray5724[5][0] = 4096;
									anIntArrayArray5724[5][2] = 4096;
									break while_172_;
								} while (false);
								anIntArrayArray5724 = new int[16][4];
								anIntArrayArray5724[0][0] = 0;
								anIntArrayArray5724[0][1] = 80;
								anIntArrayArray5724[0][3] = 321;
								anIntArrayArray5724[0][2] = 192;
								anIntArrayArray5724[1][2] = 449;
								anIntArrayArray5724[1][1] = 321;
								anIntArrayArray5724[1][3] = 562;
								anIntArrayArray5724[1][0] = 155;
								anIntArrayArray5724[2][3] = 803;
								anIntArrayArray5724[2][0] = 389;
								anIntArrayArray5724[2][1] = 578;
								anIntArrayArray5724[2][2] = 690;
								anIntArrayArray5724[3][1] = 947;
								anIntArrayArray5724[3][3] = 1140;
								anIntArrayArray5724[3][0] = 671;
								anIntArrayArray5724[3][2] = 995;
								anIntArrayArray5724[4][3] = 1509;
								anIntArrayArray5724[4][2] = 1397;
								anIntArrayArray5724[4][1] = 1285;
								anIntArrayArray5724[4][0] = 897;
								anIntArrayArray5724[5][2] = 1429;
								anIntArrayArray5724[5][1] = 1525;
								anIntArrayArray5724[5][0] = 1175;
								anIntArrayArray5724[5][3] = 1413;
								anIntArrayArray5724[6][2] = 1461;
								anIntArrayArray5724[6][1] = 1734;
								anIntArrayArray5724[6][0] = 1368;
								anIntArrayArray5724[6][3] = 1333;
								anIntArrayArray5724[7][0] = 1507;
								anIntArrayArray5724[7][3] = 1702;
								anIntArrayArray5724[7][2] = 1525;
								anIntArrayArray5724[7][1] = 1413;
								anIntArrayArray5724[8][2] = 1590;
								anIntArrayArray5724[8][1] = 1108;
								anIntArrayArray5724[8][0] = 1736;
								anIntArrayArray5724[8][3] = 2056;
								anIntArrayArray5724[9][2] = 2056;
								anIntArrayArray5724[9][0] = 2088;
								anIntArrayArray5724[9][3] = 2666;
								anIntArrayArray5724[9][1] = 1766;
								anIntArrayArray5724[10][0] = 2355;
								anIntArrayArray5724[10][2] = 2586;
								anIntArrayArray5724[10][1] = 2409;
								anIntArrayArray5724[10][3] = 3276;
								anIntArrayArray5724[11][2] = 3148;
								anIntArrayArray5724[11][0] = 2691;
								anIntArrayArray5724[11][1] = 3116;
								anIntArrayArray5724[11][3] = 3228;
								anIntArrayArray5724[12][2] = 3710;
								anIntArrayArray5724[12][3] = 3196;
								anIntArrayArray5724[12][1] = 3806;
								anIntArrayArray5724[12][0] = 3031;
								anIntArrayArray5724[13][3] = 3019;
								anIntArrayArray5724[13][2] = 3421;
								anIntArrayArray5724[13][1] = 3437;
								anIntArrayArray5724[13][0] = 3522;
								anIntArrayArray5724[14][2] = 3148;
								anIntArrayArray5724[14][0] = 3727;
								anIntArrayArray5724[14][3] = 3228;
								anIntArrayArray5724[14][1] = 3116;
								anIntArrayArray5724[15][2] = 2505;
								anIntArrayArray5724[15][3] = 2746;
								anIntArrayArray5724[15][0] = 4096;
								anIntArrayArray5724[15][1] = 2377;
								break while_172_;
							} while (false);
							anIntArrayArray5724 = new int[4][4];
							anIntArrayArray5724[0][0] = 2048;
							anIntArrayArray5724[0][3] = 0;
							anIntArrayArray5724[0][1] = 0;
							anIntArrayArray5724[0][2] = 4096;
							anIntArrayArray5724[1][3] = 0;
							anIntArrayArray5724[1][2] = 4096;
							anIntArrayArray5724[1][1] = 4096;
							anIntArrayArray5724[1][0] = 2867;
							anIntArrayArray5724[2][3] = 0;
							anIntArrayArray5724[2][0] = 3276;
							anIntArrayArray5724[2][1] = 4096;
							anIntArrayArray5724[2][2] = 4096;
							anIntArrayArray5724[3][1] = 4096;
							anIntArrayArray5724[3][3] = 0;
							anIntArrayArray5724[3][0] = 4096;
							anIntArrayArray5724[3][2] = 0;
							break while_172_;
						} while (false);
						throw new RuntimeException("Invalid gradient preset");
					}
				} while (false);
				if (i == 10) {
					break;
				}
				anIntArrayArray5724 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "sg.E(" + i
						+ ',' + i_9_ + ')');
			}
			break;
		} while (false);
	}

	static final int method1101(final int i, final Class207 class207) {
		try {
			if (i != -11286) {
				return -69;
			}
			int i_11_ = 0;
			if (class207.method2742(i + 11209, aa.anInt51)) {
				i_11_++;
			}
			if (class207.method2742(-35, Class140.anInt3243)) {
				i_11_++;
			}
			if (class207.method2742(-25, Class65.anInt503)) {
				i_11_++;
			}
			if (class207.method2742(-104, Class260.anInt3259)) {
				i_11_++;
			}
			if (class207.method2742(-118, Class251.anInt1916)) {
				i_11_++;
			}
			if (class207.method2742(-64, Class319.anInt2706)) {
				i_11_++;
			}
			if (class207.method2742(-42, Class76_Sub2.anInt3728)) {
				i_11_++;
			}
			if (class207.method2742(i + 11196, Class226.anInt1706)) {
				i_11_++;
			}
			if (class207.method2742(-40, Class39.anInt363)) {
				i_11_++;
			}
			if (class207.method2742(-94, OutputStream_Sub1.anInt37)) {
				i_11_++;
			}
			if (class207.method2742(-89, Class243.anInt1852)) {
				i_11_++;
			}
			if (class207.method2742(-89, Class98_Sub31_Sub4.anInt5860)) {
				i_11_++;
			}
			if (class207.method2742(-111, Class75.anInt583)) {
				i_11_++;
			}
			if (class207.method2742(-40, Class111_Sub2.anInt4695)) {
				i_11_++;
			}
			if (class207.method2742(-108, Class264.anInt1972)) {
				i_11_++;
			}
			if (class207.method2742(-38, Class76.anInt588)) {
				i_11_++;
			}
			return i_11_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sg.B(" + i + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_12_) {
		try {
			if (i_12_ >= -92) {
				anIntArray5723 = null;
			}
			if ((i ^ 0xffffffff) == -1) {
				final int i_13_ = class98_sub22.readUnsignedByte((byte) 4);
				if (i_13_ != 0) {
					method1100(10, i_13_);
				} else {
					anIntArrayArray5724 = new int[class98_sub22
							.readUnsignedByte((byte) -107)][4];
					for (int i_14_ = 0; ((anIntArrayArray5724.length ^ 0xffffffff) < (i_14_ ^ 0xffffffff)); i_14_++) {
						anIntArrayArray5724[i_14_][0] = class98_sub22
								.readUnsignedShort((byte) 127);
						anIntArrayArray5724[i_14_][1] = (class98_sub22
								.readUnsignedByte((byte) 87) << -1113289820);
						anIntArrayArray5724[i_14_][2] = class98_sub22
								.readUnsignedByte((byte) 10) << 801224932;
						anIntArrayArray5724[i_14_][3] = (class98_sub22
								.readUnsignedByte((byte) -124) << 1705896548);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("sg.A(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i_12_ + ')'));
		}
	}

	private final void method1102(final int i) {
		do {
			try {
				final int i_15_ = anIntArrayArray5724.length;
				if (i == 3) {
					if ((i_15_ ^ 0xffffffff) >= -1) {
						break;
					}
					for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -258; i_16_++) {
						int i_17_ = 0;
						final int i_18_ = i_16_ << 2145521988;
						for (int i_19_ = 0; i_15_ > i_19_; i_19_++) {
							if ((i_18_ ^ 0xffffffff) > (anIntArrayArray5724[i_19_][0] ^ 0xffffffff)) {
								break;
							}
							i_17_++;
						}
						int i_20_;
						int i_21_;
						int i_22_;
						if ((i_15_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff)) {
							final int[] is = anIntArrayArray5724[i_17_];
							if (i_17_ > 0) {
								final int[] is_23_ = anIntArrayArray5724[i_17_
										+ -1];
								final int i_24_ = ((i_18_ + -is_23_[0] << 1394646828) / (is[0] - is_23_[0]));
								final int i_25_ = -i_24_ + 4096;
								i_22_ = (is[2] * i_24_ + is_23_[2] * i_25_ >> -1318458580);
								i_21_ = (is_23_[3] * i_25_ + i_24_ * is[3] >> -1229726772);
								i_20_ = (i_24_ * is[1] - -(is_23_[1] * i_25_) >> 2142671148);
							} else {
								i_21_ = is[3];
								i_22_ = is[2];
								i_20_ = is[1];
							}
						} else {
							final int[] is = anIntArrayArray5724[-1 + i_15_];
							i_20_ = is[1];
							i_21_ = is[3];
							i_22_ = is[2];
						}
						i_20_ >>= 4;
						i_22_ >>= 4;
						i_21_ >>= 4;
						if ((i_22_ ^ 0xffffffff) > -1) {
							i_22_ = 0;
						} else if (i_22_ > 255) {
							i_22_ = 255;
						}
						if (i_21_ < 0) {
							i_21_ = 0;
						} else if ((i_21_ ^ 0xffffffff) < -256) {
							i_21_ = 255;
						}
						if ((i_20_ ^ 0xffffffff) > -1) {
							i_20_ = 0;
						} else if ((i_20_ ^ 0xffffffff) < -256) {
							i_20_ = 255;
						}
						anIntArray5723[i_16_] = (Class41.method366(i_21_,
								Class41.method366(i_20_ << 1113026160,
										i_22_ << -1375834648)));
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "sg.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
