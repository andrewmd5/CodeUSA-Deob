/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class92 {
	private int anInt726;
	int anInt727;
	int[] anIntArray728;
	int anInt729;
	int anInt730;
	int anInt731;
	boolean aBoolean732;
	int anInt733;
	int anInt734;
	int[] anIntArray735;
	boolean aBoolean736;
	int anInt737;
	static IncomingOpcode currentIncommingOpcode = null;
	int anInt739 = 0;
	private int anInt740;
	int anInt741;
	int anInt742;
	int anInt743;
	private int anInt744;
	int anInt745;
	int anInt746;
	short aShort747;
	private int anInt748;
	private int anInt749;
	int anInt750;
	private int anInt751;
	int anInt752;
	boolean aBoolean753;
	short aShort754;
	private int anInt755;
	int anInt756;
	int anInt757;
	int anInt758;
	boolean aBoolean759;
	int anInt760;
	int anInt761;
	int anInt762;
	short aShort763;
	int anInt764;
	int anInt765;
	int anInt766;
	private int anInt767;
	int[] anIntArray768;
	private int anInt769;
	int anInt770;
	int anInt771;
	int[] anIntArray772;
	private int anInt773;
	int anInt774;
	int anInt775;
	boolean aBoolean776;
	int anInt777;
	boolean aBoolean778;
	int anInt779;
	int anInt780;
	int anInt781;
	int anInt782;
	boolean aBoolean783;
	int anInt784;
	int anInt785;
	short aShort786;
	int anInt787;
	int anInt788;
	boolean aBoolean789;
	int anInt790;
	boolean aBoolean791;
	int anInt792;

	static final void method891(final int i, final int i_0_) {
		try {
			Class101.anInt849 = -1;
			Class42_Sub4.anInt5371 = i;
			Class169.anInt1307 = -1;
			if (i_0_ < -63) {
				aa_Sub1.method155(-1);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fp.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method892(final int i, int i_1_, int i_2_, int i_3_,
			final boolean bool, int i_4_) {
		try {
			if (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948 == null) {
				Class265.aHa1974.method1760(i_4_, i_3_, i_2_, -16777216,
						(byte) -66, i_1_);
			} else if ((((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5084 ^ 0xffffffff) > -1
					|| ((512 * Class165.anInt1276 ^ 0xffffffff) >= ((((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5084) ^ 0xffffffff))
					|| (((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5079 ^ 0xffffffff) > -1
					|| ((((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5079 ^ 0xffffffff) <= (512 * Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff))) {
				Class265.aHa1974.method1760(i_4_, i_3_, i_2_, -16777216,
						(byte) -66, i_1_);
			} else {
				Class64_Sub15.anInt3676++;
				if (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660 != null
						&& (((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5084 - 256 * (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660
								.method3034(0) + -1)) >> 856517161 == Class269.anInt2024
						&& (((((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5079 - (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660
								.method3034(0) * 256 + -256)) >> -425076055 ^ 0xffffffff) == (Class246_Sub3_Sub1_Sub2.anInt6251 ^ 0xffffffff))) {
					Class246_Sub3_Sub1_Sub2.anInt6251 = -1;
					Class269.anInt2024 = -1;
					ByteBuffer.method1216(-17470);
				}
				Class98_Sub44.method1512(true);
				if (!bool) {
					Class205.method2716(-9627);
				}
				Class246_Sub1.method2966(66);
				Class151_Sub3.method2453(i_2_, true, i_4_, 100, i_3_, i_1_);
				i_3_ = Class332_Sub2.anInt5421;
				i_1_ = Class151_Sub8.anInt5016;
				Class16.anInt197 = Class16.anInt199;
				i_4_ = Class215.anInt1612;
				i_2_ = Class98_Sub31_Sub2.anInt5824;
				if (Class98_Sub46_Sub20_Sub2.anInt6319 == 1) {
					int i_5_ = (int) Class119_Sub4.aFloat4740;
					if (Class43.anInt372 >> 861735464 > i_5_) {
						i_5_ = Class43.anInt372 >> -1370935128;
					}
					if (Class217.aBooleanArray3410[4]
							&& ((i_5_ ^ 0xffffffff) > (Class98_Sub10_Sub13.anIntArray5603[4] + 128 ^ 0xffffffff))) {
						i_5_ = 128 + Class98_Sub10_Sub13.anIntArray5603[4];
					}
					final int i_6_ = 0x3fff & (Class98_Sub10_Sub9.anInt5581 + (int) Class98_Sub22_Sub2.aFloat5794);
					Class104.method1712(
							false,
							i_6_,
							Game.cameraZoom + 3 * (i_5_ >> 2062510403) << 989514018, // camera
																							// zoom
																							// /
																							// //850
																							// is
																							// nice
							Class224_Sub3_Sub1.anInt6147,
							i_3_,
							Class201.anInt1545,
							i_5_,
							-500
									+ (Class98_Sub46_Sub2_Sub2
											.method1538(
													Class43.anInt377,
													(((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5079),
													(((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5084),
													i ^ 0xd76)));
				} else if (Class98_Sub46_Sub20_Sub2.anInt6319 == 4) {
					int i_7_ = (int) Class119_Sub4.aFloat4740;
					if (i_7_ < Class43.anInt372 >> 1907221800) {
						i_7_ = Class43.anInt372 >> 107774920;
					}
					if (Class217.aBooleanArray3410[4]
							&& (128 + Class98_Sub10_Sub13.anIntArray5603[4] ^ 0xffffffff) < (i_7_ ^ 0xffffffff)) {
						i_7_ = Class98_Sub10_Sub13.anIntArray5603[4] - -128;
					}
					final int i_8_ = (int) Class98_Sub22_Sub2.aFloat5794 & 0x3fff;
					Class104.method1712(false, i_8_,
							(600 - -((i_7_ >> 325944995) * 3) << 128688834),
							Class224_Sub3_Sub1.anInt6147, i_3_,
							Class201.anInt1545, i_7_, (Class98_Sub46_Sub2_Sub2
									.method1538(Class43.anInt377,
											Class135.anInt1051,
											Class98_Sub46_Sub2_Sub2.anInt6295,
											24111)) - 200);
				} else if ((Class98_Sub46_Sub20_Sub2.anInt6319 ^ 0xffffffff) == -6) {
					Class50.method484(i_3_, i ^ 0x5301);
				}
				final int i_9_ = Class98_Sub46_Sub10.anInt6020;
				final int i_10_ = Class79.anInt601;
				final int i_11_ = Class134.anInt3461;
				final int i_12_ = Class246_Sub3_Sub4_Sub2.anInt6357;
				final int i_13_ = Class186.anInt3424;
				for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -6; i_14_++) {
					if (Class217.aBooleanArray3410[i_14_]) {
						final int i_15_ = (int) ((Math.random() * (2 * (aa_Sub3.anIntArray3571[i_14_]) + 1))
								- aa_Sub3.anIntArray3571[i_14_] + (Math
								.sin((Class212.anIntArray1597[i_14_])
										* ((Class98_Sub32.anIntArray4109[i_14_]) / 100.0)) * (Class98_Sub10_Sub13.anIntArray5603[i_14_])));
						if ((i_14_ ^ 0xffffffff) == -4) {
							Class186.anInt3424 = 0x3fff & Class186.anInt3424
									+ i_15_;
						}
						if ((i_14_ ^ 0xffffffff) == -1) {
							Class98_Sub46_Sub10.anInt6020 += i_15_ << -286964990;
						}
						if (i_14_ == 2) {
							Class134.anInt3461 += i_15_ << 1958877954;
						}
						if ((i_14_ ^ 0xffffffff) == -5) {
							Class246_Sub3_Sub4_Sub2.anInt6357 += i_15_;
							if (Class246_Sub3_Sub4_Sub2.anInt6357 >= 1024) {
								if (Class246_Sub3_Sub4_Sub2.anInt6357 > 3072) {
									Class246_Sub3_Sub4_Sub2.anInt6357 = 3072;
								}
							} else {
								Class246_Sub3_Sub4_Sub2.anInt6357 = 1024;
							}
						}
						if (i_14_ == 1) {
							Class79.anInt601 += i_15_ << -757066846;
						}
					}
				}
				if (Class98_Sub46_Sub10.anInt6020 < 0) {
					Class98_Sub46_Sub10.anInt6020 = 0;
				}
				if ((Class366.anInt3112 << 1495907977) - 1 < Class98_Sub46_Sub10.anInt6020) {
					Class98_Sub46_Sub10.anInt6020 = (Class366.anInt3112 << 1118361961) - 1;
				}
				if (Class134.anInt3461 < 0) {
					Class134.anInt3461 = 0;
				}
				if ((Class134.anInt3461 ^ 0xffffffff) < (-1
						+ (Class64_Sub9.anInt3662 << -179806359) ^ 0xffffffff)) {
					Class134.anInt3461 = (Class64_Sub9.anInt3662 << 2090279273) - 1;
				}
				if (i == 21337) {
					Class246_Sub3_Sub4_Sub1.method3025((byte) 72);
					Class329.method3708(i + -21338);
					Class265.aHa1974.KA(i_1_, i_2_, i_4_ + i_1_, i_3_ + i_2_);
					Class201.method2697(i ^ ~0x5178, true);
					if (!za_Sub2.aBoolean6079) {
						Class265.aHa1974.ya();
						final int i_16_ = Class284_Sub1_Sub2.anInt6192;
						if (s_Sub1.aClass346_5202 == null) {
							Class265.aHa1974.GA(i_16_);
						} else {
							s_Sub1.aClass346_5202.method3831(
									Class156_Sub1.anInt3278 << -14047229,
									Class246_Sub3_Sub4_Sub2.anInt6357,
									Class186.anInt3424, i_2_, i + -45783, i_1_,
									Class265.aHa1974, i_3_, i_4_, i_16_);
						}
					} else {
						Class156_Sub2.method2500(Class284_Sub1_Sub2.anInt6192,
								i + -21337);
						if ((Class16.anInt197 ^ 0xffffffff) != (Class48_Sub2_Sub1.anInt5525 ^ 0xffffffff)) {
							Class358.aBoolean3033 = true;
						}
						Class48_Sub2_Sub1.anInt5525 = Class16.anInt197;
					}
					Class128.method2224(i ^ 0xbf1);
					Class266.aClass111_1986.method2093(
							Class98_Sub46_Sub10.anInt6020, Class79.anInt601,
							Class134.anInt3461,
							0x3fff & -Class246_Sub3_Sub4_Sub2.anInt6357,
							-Class186.anInt3424 & 0x3fff,
							0x3fff & -Class308.anInt2584);
					Class265.aHa1974.a(Class266.aClass111_1986);
					Class265.aHa1974.DA(i_1_ - -(i_4_ / 2), i_3_ / 2 + i_2_,
							(Class98_Sub10_Sub14.anInt5610 << -346205375),
							(Class98_Sub10_Sub14.anInt5610 << 74627969));
					Class260.method3208(
							(Class98_Sub10_Sub14.anInt5610 << -1360844447),
							-128,
							(Class98_Sub10_Sub14.anInt5610 << 1280299137), i_2_
									- -(i_3_ / 2), i_1_ + i_4_ / 2);
					Class98_Sub46_Sub6.method1548(0x3fff & -Class186.anInt3424,
							Class79.anInt601,
							-Class246_Sub3_Sub4_Sub2.anInt6357 & 0x3fff,
							0x3fff & -Class308.anInt2584, (byte) -78,
							Class134.anInt3461, Class98_Sub46_Sub10.anInt6020);
					final byte i_17_ = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub15_4058
							.method612((byte) 126) != 2 ? (byte) 1
							: (byte) Class64_Sub15.anInt3676);
					if (!za_Sub2.aBoolean6079) {
						Class60.method535(
								Class215.anInt1614,
								Class98_Sub46_Sub10.anInt6020,
								Class79.anInt601,
								Class134.anInt3461,
								OutputStream_Sub2.aByteArrayArrayArray41,
								Class204.anIntArray1551,
								Class336.anIntArray2826,
								Class287.anIntArray2195,
								Class295.anIntArray2409,
								Class48_Sub1_Sub2.anIntArray5518,
								1 + (((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aByte5088),
								i_17_,
								(((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5084) >> 1664602249,
								(((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5079) >> -1941412663,
								Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub13_4063
										.method602((byte) 121) == 0, true,
								Class239.aBoolean1839 ? Class16.anInt197 : -1,
								0, false);
					} else {
						Class216.method2797(
								(-Class246_Sub3_Sub4_Sub2.anInt6357 & 0x3fff),
								0x3fff & -Class308.anInt2584,
								-Class186.anInt3424 & 0x3fff, i + 4643);
						Class154.method2493(
								Class79.anInt601,
								1 + (((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aByte5088),
								OutputStream_Sub2.aByteArrayArrayArray41,
								Class16.anInt197,
								Class98_Sub46_Sub10.anInt6020,
								Class48_Sub1_Sub2.anIntArray5518,
								(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub13_4063
										.method602((byte) 126) ^ 0xffffffff) == -1,
								Class204.anIntArray1551,
								i_17_,
								true,
								(((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5084) >> -921672887,
								(((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5079) >> -1397703127,
								Class287.anIntArray2195, Class215.anInt1614,
								Class295.anIntArray2409, Class134.anInt3461,
								Class336.anIntArray2826, true);
					}
					Class128.method2224(22696);
					if ((Class177.anInt1376 ^ 0xffffffff) == -11) {
						Class290.method3411(i_1_, (byte) 7, i_2_, i_3_, 256,
								256, i_4_);
						Class98_Sub34.method1450(256, i_4_, i_3_, 256,
								(byte) -124, i_1_, i_2_);
						Class294.method3479(256, i_4_, -7957, i_3_, i_1_, i_2_,
								256);
						Class98_Sub46_Sub13_Sub1.method1594(i_2_, i_1_, i_3_,
								i_4_, (byte) 116);
					}
					Class114.method2148();
					Class186.anInt3424 = i_13_;
					Class98_Sub46_Sub10.anInt6020 = i_9_;
					Class134.anInt3461 = i_11_;
					Class246_Sub3_Sub4_Sub2.anInt6357 = i_12_;
					Class79.anInt601 = i_10_;
					if (Class98_Sub10_Sub12.aBoolean5599
							&& (Class98_Sub10_Sub38.aClass135_5765
									.method2261(-1) ^ 0xffffffff) == -1) {
						Class98_Sub10_Sub12.aBoolean5599 = false;
					}
					if (Class98_Sub10_Sub12.aBoolean5599) {
						Class265.aHa1974.method1760(i_4_, i_3_, i_2_,
								-16777216, (byte) -66, i_1_);
						Class246_Sub2.method2972(i + -21457,
								Class98_Sub46_Sub10.aClass197_6019,
								Class195.aClass43_1499, false,
								Class265.aHa1974, Class309.aClass309_2598
										.method3615(Class374.anInt3159,
												(byte) 25));
					}
					Class201.method2697(-546, false);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("fp.D(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
							+ bool + ',' + i_4_ + ')'));
		}
	}

	static final boolean method893(final int i) {
		try {
			final Class98_Sub19 class98_sub19 = (Class98_Sub19) Class186.aClass148_3428
					.method2418(32);
			if (class98_sub19 == null) {
				return false;
			}
			for (int i_19_ = 0; ((class98_sub19.anInt3960 ^ 0xffffffff) < (i_19_ ^ 0xffffffff)); i_19_++) {
				if ((class98_sub19.aClass143Array3962[i_19_] != null)
						&& (class98_sub19.aClass143Array3962[i_19_].anInt1163) == 0) {
					return false;
				}
				if ((class98_sub19.aClass143Array3961[i_19_] != null)
						&& ((class98_sub19.aClass143Array3961[i_19_].anInt1163) ^ 0xffffffff) == -1) {
					return false;
				}
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fp.B(" + i + ')');
		}
	}

	final void method894(final int i, final ByteBuffer class98_sub22) {
		do {
			try {
				for (;;) {
					final int i_20_ = class98_sub22
							.readUnsignedByte((byte) -128);
					if ((i_20_ ^ 0xffffffff) == -1) {
						break;
					}
					method895(class98_sub22, i_20_, (byte) -112);
				}
				if (i < -20) {
					break;
				}
				method892(113, 42, 109, 50, true, -116);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27
						.method667(runtimeexception,
								("fp.A("
										+ i
										+ ','
										+ (class98_sub22 != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method895(final ByteBuffer class98_sub22,
			final int i, final byte i_21_) {
		try {
			if (i == 1) {
				aShort747 = (short) class98_sub22.readUnsignedShort((byte) 127);
				aShort786 = (short) class98_sub22.readUnsignedShort((byte) 127);
				aShort763 = (short) class98_sub22.readUnsignedShort((byte) 127);
				aShort754 = (short) class98_sub22.readUnsignedShort((byte) 127);
				final int i_22_ = 3;
				aShort763 <<= i_22_;
				aShort786 <<= i_22_;
				aShort747 <<= i_22_;
				aShort754 <<= i_22_;
			} else if ((i ^ 0xffffffff) == -3) {
				class98_sub22.readUnsignedByte((byte) 47);
			} else if (i == 3) {
				anInt770 = class98_sub22.readInt(-2);
				anInt731 = class98_sub22.readInt(-2);
			} else if (i != 4) {
				if ((i ^ 0xffffffff) == -6) {
					anInt780 = anInt788 = (class98_sub22.readUnsignedShort((byte) 127) << -577553204 << 1586483106);
				} else if (i != 6) {
					if (i == 7) {
						anInt766 = class98_sub22.readUnsignedShort((byte) 127);
						anInt787 = class98_sub22.readUnsignedShort((byte) 127);
					} else if (i != 8) {
						if (i == 9) {
							final int i_23_ = class98_sub22
									.readUnsignedByte((byte) 41);
							anIntArray728 = new int[i_23_];
							for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
								anIntArray728[i_24_] = class98_sub22
										.readUnsignedShort((byte) 127);
							}
						} else if ((i ^ 0xffffffff) == -11) {
							final int i_25_ = class98_sub22
									.readUnsignedByte((byte) 121);
							anIntArray772 = new int[i_25_];
							for (int i_26_ = 0; (i_25_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff); i_26_++) {
								anIntArray772[i_26_] = class98_sub22
										.readUnsignedShort((byte) 127);
							}
						} else if ((i ^ 0xffffffff) != -13) {
							if (i == 13) {
								anInt782 = class98_sub22
										.readSignedByte((byte) -19);
							} else if (i == 14) {
								anInt784 = class98_sub22.readUnsignedShort((byte) 127);
							} else if ((i ^ 0xffffffff) == -16) {
								anInt729 = class98_sub22.readUnsignedShort((byte) 127);
							} else if ((i ^ 0xffffffff) != -17) {
								if ((i ^ 0xffffffff) == -18) {
									anInt764 = class98_sub22
											.readUnsignedShort((byte) 127);
								} else if (i != 18) {
									if ((i ^ 0xffffffff) == -20) {
										anInt752 = class98_sub22
												.readUnsignedByte((byte) -111);
									} else if (i == 20) {
										anInt773 = class98_sub22
												.readUnsignedByte((byte) 107);
									} else if (i == 21) {
										anInt767 = class98_sub22
												.readUnsignedByte((byte) 68);
									} else if ((i ^ 0xffffffff) != -23) {
										if ((i ^ 0xffffffff) == -24) {
											anInt748 = class98_sub22
													.readUnsignedByte((byte) -119);
										} else if ((i ^ 0xffffffff) == -25) {
											aBoolean759 = false;
										} else if (i != 25) {
											if (i != 26) {
												if (i != 27) {
													if (i == 28) {
														anInt749 = (class98_sub22
																.readUnsignedByte((byte) -117));
													} else if (i != 29) {
														if (i != 30) {
															if (i == 31) {
																anInt780 = ((class98_sub22
																		.readUnsignedShort((byte) 127)) << -1910098324 << 660699586);
																anInt788 = ((class98_sub22
																		.readUnsignedShort((byte) 127)) << 1930543596 << 296157090);
															} else if ((i ^ 0xffffffff) != -33) {
																if (i == 33) {
																	aBoolean789 = true;
																} else if (i == 34) {
																	aBoolean776 = false;
																}
															} else {
																aBoolean778 = false;
															}
														} else {
															aBoolean791 = true;
														}
													} else {
														class98_sub22
																.readUShort(false);
													}
												} else {
													anInt775 = ((class98_sub22
															.readUnsignedShort((byte) 127)) << -1135326388 << 1935821730);
												}
											} else {
												aBoolean753 = false;
											}
										} else {
											final int i_27_ = class98_sub22
													.readUnsignedByte((byte) -124);
											anIntArray735 = new int[i_27_];
											for (int i_28_ = 0; ((i_27_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff)); i_28_++) {
												anIntArray735[i_28_] = (class98_sub22
														.readUnsignedShort((byte) 127));
											}
										}
									} else {
										anInt745 = class98_sub22.readInt(-2);
									}
								} else {
									anInt760 = class98_sub22.readInt(-2);
								}
							} else {
								aBoolean732 = (class98_sub22
										.readUnsignedByte((byte) 13) ^ 0xffffffff) == -2;
								anInt746 = class98_sub22.readUnsignedShort((byte) 127);
								anInt762 = class98_sub22.readUnsignedShort((byte) 127);
								aBoolean783 = (class98_sub22
										.readUnsignedByte((byte) -120) == 1);
							}
						} else {
							anInt774 = class98_sub22.readSignedByte((byte) -19);
						}
					} else {
						anInt750 = class98_sub22.readUnsignedShort((byte) 127);
						anInt790 = class98_sub22.readUnsignedShort((byte) 127);
					}
				} else {
					anInt726 = class98_sub22.readInt(-2);
					anInt744 = class98_sub22.readInt(-2);
				}
			} else {
				anInt739 = class98_sub22.readUnsignedByte((byte) 81);
				anInt792 = class98_sub22.readSignedByte((byte) -19);
			}
			if (i_21_ >= -101) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fp.C("
					+ (class98_sub22 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_21_ + ')'));
		}
	}

	public static void method896(final int i) {
		try {
			if (i != -1025810040) {
				method891(-100, -83);
			}
			currentIncommingOpcode = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fp.G(" + i + ')');
		}
	}

	final void method897(final byte i) {
		do {
			try {
				if ((anInt774 ^ 0xffffffff) < 1 || anInt782 > -2) {
					aBoolean736 = true;
				}
				anInt741 = (anInt726 & 0xffc52c) >> -731747568;
				anInt751 = 0xff & anInt744 >> -1356228592;
				anInt730 = -anInt741 + anInt751;
				anInt740 = (0xff9a & anInt744) >> 1249635720;
				anInt757 = (anInt726 & 0xff64) >> 547175144;
				anInt734 = -anInt757 + anInt740;
				anInt771 = anInt726 & 0xff;
				anInt755 = 0xff & anInt744;
				anInt769 = 0xff & anInt744 >> 1155880536;
				if (i > 56) {
					anInt737 = anInt755 - anInt771;
					anInt756 = anInt726 >> 328179352 & 0xff;
					anInt765 = -anInt756 + anInt769;
					if (anInt760 != 0) {
						anInt761 = anInt773 * anInt787 / 100;
						anInt758 = anInt787 * anInt767 / 100;
						if (anInt761 == 0) {
							anInt761 = 1;
						}
						anInt743 = ((-anInt741 + (-(anInt730 / 2) + (anInt760 >> 1956144528 & 0xff))) << -1025810040)
								/ anInt761;
						anInt733 = ((-(anInt734 / 2) + -anInt757 + (anInt760 >> -21137720 & 0xff)) << -1200703608)
								/ anInt761;
						anInt727 = ((-anInt771 + (-(anInt737 / 2) + (0xff & anInt760))) << -178823608)
								/ anInt761;
						if ((anInt758 ^ 0xffffffff) == -1) {
							anInt758 = 1;
						}
						final Class92 class92_29_ = this;
						class92_29_.anInt743 = (class92_29_.anInt743 + (((anInt743 ^ 0xffffffff) >= -1) ? 4
								: -4));
						final Class92 class92_30_ = this;
						class92_30_.anInt733 = (class92_30_.anInt733 + (anInt733 <= 0 ? 4
								: -4));
						final Class92 class92_31_ = this;
						class92_31_.anInt727 = (class92_31_.anInt727 + (anInt727 <= 0 ? 4
								: -4));
						anInt779 = (((anInt760 >> -686226984 & 0xff) - (anInt765 / 2 + anInt756)) << -121018712)
								/ anInt758;
						final Class92 class92_32_ = this;
						class92_32_.anInt779 = (class92_32_.anInt779 + (anInt779 <= 0 ? 4
								: -4));
					}
					if (anInt775 != -1) {
						anInt777 = anInt749 * anInt787 / 100;
						if ((anInt777 ^ 0xffffffff) == -1) {
							anInt777 = 1;
						}
						anInt742 = ((-anInt780 + (-((anInt788 - anInt780) / 2) + anInt775)) / anInt777);
					}
					if ((anInt745 ^ 0xffffffff) == 0) {
						break;
					}
					anInt785 = anInt787 * anInt748 / 100;
					if ((anInt785 ^ 0xffffffff) == -1) {
						anInt785 = 1;
					}
					anInt781 = ((anInt745 - (-anInt770 + anInt731) / 2 - anInt770) / anInt785);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fp.H(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method898(final boolean bool, final byte[][] is,
			final Class305_Sub1 class305_sub1) {
		try {
			if (bool != false) {
				method892(70, -39, 115, -109, false, -73);
			}
			final int i = client.aByteArrayArray3551.length;
			for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > (i ^ 0xffffffff); i_33_++) {
				final byte[] is_34_ = is[i_33_];
				if (is_34_ != null) {
					final int i_35_ = ((Class121.anIntArray1006[i_33_] >> 1369954824) * 64 - Class272.anInt2038);
					final int i_36_ = (-aa_Sub2.anInt3562 + 64 * (Class121.anIntArray1006[i_33_] & 0xff));
					Class128.method2224(22696);
					class305_sub1.method3591(Class167.aClass243Array1281,
							i_36_, (byte) -19, is_34_, Class265.aHa1974, i_35_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fp.E(" + bool
					+ ',' + (is != null ? "{...}" : "null") + ','
					+ (class305_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class92() {
		anInt729 = -1;
		anInt749 = 100;
		anInt748 = 100;
		aBoolean732 = true;
		aBoolean753 = true;
		anInt764 = -1;
		aBoolean736 = false;
		anInt762 = -1;
		aBoolean759 = true;
		anInt752 = 0;
		anInt773 = 100;
		aBoolean778 = true;
		anInt774 = -2;
		anInt745 = -1;
		anInt784 = 0;
		anInt746 = -1;
		anInt775 = -1;
		anInt782 = -2;
		anInt767 = 100;
		aBoolean776 = true;
		aBoolean783 = true;
		aBoolean791 = false;
		aBoolean789 = false;
	}
}
