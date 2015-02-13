/* Class98_Sub10_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub24 extends Class98_Sub10 {
	private int anInt5665 = 1;
	static Class101[] aClass101Array5666;
	private static short[] aShortArray5667 = { 967, 20428, -21577, 11219,
			-10290 };
	static Class207 aClass207_5668;
	static short[][] aShortArrayArray5669;
	private static short[] aShortArray5670 = { 957, 20418, -21587, 11209,
			-10300 };
	static int anInt5671;
	private int anInt5672 = 1;
	private static short[] aShortArray5673;
	private static short[] aShortArray5674;

	@Override
	final int[] method990(final int i, final int i_0_) {
		try {
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_0_);
			if (i != 255) {
				aClass207_5668 = null;
			}
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				final int i_1_ = 1 + (anInt5665 - -anInt5665);
				final int i_2_ = 65536 / i_1_;
				final int i_3_ = 1 + anInt5672 + anInt5672;
				final int i_4_ = 65536 / i_3_;
				final int[][] is_5_ = new int[i_1_][];
				for (int i_6_ = i_0_ + -anInt5665; anInt5665 + i_0_ >= i_6_; i_6_++) {
					final int[] is_7_ = method1000(i_6_ & za_Sub1.anInt6075, 0,
							i ^ 0xff);
					final int[] is_8_ = new int[Class25.anInt268];
					int i_9_ = 0;
					for (int i_10_ = -anInt5672; (anInt5672 ^ 0xffffffff) <= (i_10_ ^ 0xffffffff); i_10_++) {
						i_9_ += is_7_[Class329.anInt2761 & i_10_];
					}
					int i_11_ = 0;
					while ((i_11_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff)) {
						is_8_[i_11_] = i_9_ * i_4_ >> 880426384;
						i_9_ -= is_7_[Class329.anInt2761 & -anInt5672 + i_11_];
						i_11_++;
						i_9_ += is_7_[Class329.anInt2761 & i_11_ - -anInt5672];
					}
					is_5_[i_6_ + (anInt5665 + -i_0_)] = is_8_;
				}
				for (int i_12_ = 0; (Class25.anInt268 ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
					int i_13_ = 0;
					for (int i_14_ = 0; i_14_ < i_1_; i_14_++) {
						i_13_ += is_5_[i_14_][i_12_];
					}
					is[i_12_] = i_2_ * i_13_ >> -153979312;
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "od.G(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final byte[] method1075(final byte[] is, final boolean bool) {
		try {
			if (is == null) {
				return null;
			}
			if (bool != true) {
				return null;
			}
			final byte[] is_15_ = new byte[is.length];
			Class236.method2894(is, 0, is_15_, 0, is.length);
			return is_15_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("od.F("
					+ (is != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	static final boolean method1076(final int i) {
		try {
			try {
				return PacketParser.method3967(525200579);
			} catch (final java.io.IOException ioexception) {
				Canvas_Sub1.method118((byte) 104);
				return true;
			} catch (final Exception exception) {
				String string = ("T2 - "
						+ (Class92.currentIncommingOpcode != null ? Class92.currentIncommingOpcode
								.method521((byte) 89) : -1)
						+ ","
						+ (Class260.aClass58_3262 != null ? Class260.aClass58_3262
								.method521((byte) 64) : -1)
						+ ","
						+ (Class98_Sub10_Sub21.aClass58_5641 == null ? -1
								: Class98_Sub10_Sub21.aClass58_5641
										.method521((byte) 97))
						+ " - "
						+ Class65.anInt496
						+ ","
						+ (Class272.anInt2038 + (((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6437[0]))
						+ ","
						+ (aa_Sub2.anInt3562 + (((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6438[0])) + " - ");
				for (int i_17_ = 0; i_17_ < Class65.anInt496
						&& (i_17_ ^ 0xffffffff) > -51; i_17_++) {
					string += (((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).aByteArray3992[i_17_])
							+ ",";
				}
				Class305_Sub1.method3585(exception, -124, string);
				Class98_Sub10_Sub1.method1003(false, false);
				return true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "od.E(" + i + ')');
		}
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_18_) {
		while_135_: do {
			try {
				if (i_18_ >= -92) {
					method1075(null, true);
				}
				final int i_19_ = i;
				while_134_: do {
					do {
						if (i_19_ != 0) {
							if (i_19_ == 1) {
								break;
							}
							if (i_19_ != 2) {
								break while_135_;
							}
							if (!client.aBoolean3553) {
								break while_134_;
							}
						}
						anInt5672 = class98_sub22.readUnsignedByte((byte) 126);
						return;
					} while (false);
					anInt5665 = class98_sub22.readUnsignedByte((byte) -111);
					return;
				} while (false);
				((Class98_Sub10) this).aBoolean3861 = class98_sub22
						.readUnsignedByte((byte) -118) == 1;
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("od.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_18_ + ')'));
			}
		} while (false);
	}

	@Override
	final int[][] method997(final int i, final int i_20_) {
		try {
			if (i > -76) {
				anInt5671 = -102;
			}
			final int[][] is = ((Class98_Sub10) this).aClass223_3859
					.method2828(i_20_, 0);
			if (((Class98_Sub10) this).aClass223_3859.aBoolean1683) {
				final int i_21_ = anInt5665 + anInt5665 + 1;
				final int i_22_ = 65536 / i_21_;
				final int i_23_ = anInt5672 + anInt5672 + 1;
				final int i_24_ = 65536 / i_23_;
				final int[][][] is_25_ = new int[i_21_][][];
				for (int i_26_ = -anInt5665 + i_20_; (i_26_ ^ 0xffffffff) >= (i_20_
						- -anInt5665 ^ 0xffffffff); i_26_++) {
					final int[][] is_27_ = method994(i_26_ & za_Sub1.anInt6075,
							24431, 0);
					final int[][] is_28_ = new int[3][Class25.anInt268];
					int i_29_ = 0;
					int i_30_ = 0;
					int i_31_ = 0;
					final int[] is_32_ = is_27_[0];
					final int[] is_33_ = is_27_[1];
					final int[] is_34_ = is_27_[2];
					for (int i_35_ = -anInt5672; (anInt5672 ^ 0xffffffff) <= (i_35_ ^ 0xffffffff); i_35_++) {
						final int i_36_ = Class329.anInt2761 & i_35_;
						i_29_ += is_32_[i_36_];
						i_30_ += is_33_[i_36_];
						i_31_ += is_34_[i_36_];
					}
					final int[] is_37_ = is_28_[0];
					final int[] is_38_ = is_28_[1];
					final int[] is_39_ = is_28_[2];
					int i_40_ = 0;
					while (Class25.anInt268 > i_40_) {
						is_37_[i_40_] = i_24_ * i_29_ >> -948678224;
						is_38_[i_40_] = i_24_ * i_30_ >> -1965134224;
						is_39_[i_40_] = i_24_ * i_31_ >> 1110096464;
						int i_41_ = Class329.anInt2761 & -anInt5672 + i_40_;
						i_30_ -= is_33_[i_41_];
						i_31_ -= is_34_[i_41_];
						i_29_ -= is_32_[i_41_];
						i_40_++;
						i_41_ = Class329.anInt2761 & i_40_ - -anInt5672;
						i_29_ += is_32_[i_41_];
						i_31_ += is_34_[i_41_];
						i_30_ += is_33_[i_41_];
					}
					is_25_[i_26_ - (-anInt5665 - -i_20_)] = is_28_;
				}
				final int[] is_42_ = is[0];
				final int[] is_43_ = is[1];
				final int[] is_44_ = is[2];
				for (int i_45_ = 0; i_45_ < Class25.anInt268; i_45_++) {
					int i_46_ = 0;
					int i_47_ = 0;
					int i_48_ = 0;
					for (int i_49_ = 0; (i_21_ ^ 0xffffffff) < (i_49_ ^ 0xffffffff); i_49_++) {
						final int[][] is_50_ = is_25_[i_49_];
						i_48_ += is_50_[2][i_45_];
						i_47_ += is_50_[1][i_45_];
						i_46_ += is_50_[0][i_45_];
					}
					is_42_[i_45_] = i_46_ * i_22_ >> 710103472;
					is_43_[i_45_] = i_47_ * i_22_ >> -1587122512;
					is_44_[i_45_] = i_22_ * i_48_ >> 807012816;
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "od.C(" + i + ','
					+ i_20_ + ')');
		}
	}

	public Class98_Sub10_Sub24() {
		super(1, false);
	}

	static final void method1077(final int i, final boolean bool,
			final int i_51_, final int i_52_, final int i_53_, final int i_54_,
			final Class293[] class293s, final int i_55_, final int i_56_,
			final boolean bool_57_, final int i_58_) {
		try {
			Class265.aHa1974.KA(i_52_, i_53_, i_55_, i_56_);
			if (bool == true) {
				int i_59_ = 0;
				for (/**/; (i_59_ ^ 0xffffffff) > (class293s.length ^ 0xffffffff); i_59_++) {
					final Class293 class293 = class293s[i_59_];
					if (class293 != null
							&& (i == class293.anInt2234 || (i == -1412584499 && Class255.aClass293_3208 == class293))) {
						final int i_60_ = i_51_ + class293.anInt2347;
						final int i_61_ = class293.anInt2299 + i_58_;
						final int i_62_ = 1 + (class293.anInt2311 + i_60_);
						final int i_63_ = class293.anInt2258 + i_61_ + 1;
						int i_64_;
						if (i_54_ == -1) {
							Class98_Sub35.aRectangleArray4144[Class69_Sub2.anInt5335]
									.setBounds(i_51_ + class293.anInt2347,
											class293.anInt2299 - -i_58_,
											class293.anInt2311,
											class293.anInt2258);
							i_64_ = Class69_Sub2.anInt5335++;
						} else {
							i_64_ = i_54_;
						}
						class293.anInt2250 = Class215.anInt1614;
						class293.anInt2238 = i_64_;
						if (!client.method111(class293)) {
							if ((class293.anInt2307 ^ 0xffffffff) != -1) {
								Class123.method2206(class293, (byte) 19);
							}
							int i_65_ = class293.anInt2347 - -i_51_;
							int i_66_ = i_58_ + class293.anInt2299;
							int i_67_ = 0;
							int i_68_ = 0;
							if (za_Sub2.aBoolean6079) {
								i_67_ = Class189.method2642((byte) 42);
								i_68_ = Class335.method3765(false);
							}
							int i_69_ = class293.anInt2285;
							if (Class15.aBoolean169
									&& (client.method116(class293).anInt4284 != 0 || (class293.anInt2354 ^ 0xffffffff) == -1)
									&& i_69_ > 127) {
								i_69_ = 127;
							}
							if (Class255.aClass293_3208 == class293) {
								if ((i ^ 0xffffffff) != 1412584498
										&& (((Class36.anInt350 ^ 0xffffffff) == (class293.anInt2289 ^ 0xffffffff)) || ((Class369.anInt3129 ^ 0xffffffff) == (class293.anInt2289 ^ 0xffffffff)))) {
									Class65.aClass293Array500 = class293s;
									IncomingOpcode.anInt463 = i_51_;
									Class64_Sub5.anInt3654 = i_58_;
									continue;
								}
								if (Class15.aBoolean186
										&& Class239.aBoolean1840) {
									int i_70_ = (Class2.aClass299_73
											.method3514(67) - -i_67_);
									int i_71_ = (Class2.aClass299_73
											.method3507((byte) 116) + i_68_);
									i_71_ -= PlayerUpdateMask.anInt526;
									i_70_ -= Model.anInt1405;
									if ((i_70_ ^ 0xffffffff) > ((Class246_Sub3_Sub4_Sub2_Sub1.anInt6500) ^ 0xffffffff)) {
										i_70_ = (Class246_Sub3_Sub4_Sub2_Sub1.anInt6500);
									}
									if ((i_70_ - -class293.anInt2311) > (Class189.aClass293_1457.anInt2311 + (Class246_Sub3_Sub4_Sub2_Sub1.anInt6500))) {
										i_70_ = (-class293.anInt2311 + ((Class189.aClass293_1457.anInt2311) + (Class246_Sub3_Sub4_Sub2_Sub1.anInt6500)));
									}
									if (i_71_ < Class222.anInt1670) {
										i_71_ = Class222.anInt1670;
									}
									i_65_ = i_70_;
									if ((i_71_ - -class293.anInt2258) > (Class222.anInt1670 + (Class189.aClass293_1457.anInt2258))) {
										i_71_ = (-class293.anInt2258 + ((Class189.aClass293_1457.anInt2258) + Class222.anInt1670));
									}
									i_66_ = i_71_;
								}
								if ((class293.anInt2289 ^ 0xffffffff) == (Class369.anInt3129 ^ 0xffffffff)) {
									i_69_ = 128;
								}
							}
							int i_72_;
							int i_73_;
							int i_74_;
							int i_75_;
							if ((class293.anInt2354 ^ 0xffffffff) != -3) {
								int i_76_ = class293.anInt2311 + i_65_;
								int i_77_ = i_66_ - -class293.anInt2258;
								i_72_ = i_66_ <= i_53_ ? i_53_ : i_66_;
								i_73_ = i_52_ >= i_65_ ? i_52_ : i_65_;
								if (class293.anInt2354 == 9) {
									i_76_++;
									i_77_++;
								}
								i_75_ = ((i_55_ ^ 0xffffffff) < (i_76_ ^ 0xffffffff) ? i_76_
										: i_55_);
								i_74_ = i_56_ <= i_77_ ? i_56_ : i_77_;
							} else {
								i_72_ = i_53_;
								i_73_ = i_52_;
								i_74_ = i_56_;
								i_75_ = i_55_;
							}
							if ((i_75_ ^ 0xffffffff) < (i_73_ ^ 0xffffffff)
									&& i_72_ < i_74_) {
								if ((class293.anInt2307 ^ 0xffffffff) != -1) {
									if ((Class22.anInt218 == class293.anInt2307)
											|| ((class293.anInt2307 ^ 0xffffffff) == (Class64_Sub20.anInt3698 ^ 0xffffffff))) {
										Class98_Sub1.method946(i_65_, -121,
												i_66_, class293);
										if (!za_Sub2.aBoolean6079) {
											Class92.method892(
													21337,
													i_65_,
													i_66_,
													(class293.anInt2258),
													(((class293.anInt2307) ^ 0xffffffff) == (Class64_Sub20.anInt3698 ^ 0xffffffff)),
													(class293.anInt2311));
											Class265.aHa1974.KA(i_52_, i_53_,
													i_55_, i_56_);
										}
										aa_Sub3.aBooleanArray3574[i_64_] = true;
										continue;
									}
									if ((class293.anInt2307 ^ 0xffffffff) == (Class325.anInt2727 ^ 0xffffffff)) {
										if (class293.method3469(
												(Class265.aHa1974), 123) != null) {
											Class128.method2224(22696);
											Class201.method2696(4, class293,
													(Class265.aHa1974), i_65_,
													i_66_);
											Class98_Sub10_Sub20.aBooleanArray5639[i_64_] = true;
											Class265.aHa1974.KA(i_52_, i_53_,
													i_55_, i_56_);
											if (za_Sub2.aBoolean6079) {
												if (!bool_57_) {
													Class216.method2796(i_63_,
															i_60_, i_62_,
															i_61_, (byte) 126);
												} else {
													Class93_Sub1_Sub1
															.method908(i_63_,
																	i_61_,
																	false,
																	i_60_,
																	i_62_);
												}
											}
										}
										continue;
									}
									if (Class96.anInt804 == class293.anInt2307) {
										if (class293.method3469(
												(Class265.aHa1974), 103) != null) {
											Class304.method3562(4096, i_65_,
													i_66_, class293);
											Class98_Sub10_Sub20.aBooleanArray5639[i_64_] = true;
											Class265.aHa1974.KA(i_52_, i_53_,
													i_55_, i_56_);
											if (za_Sub2.aBoolean6079) {
												if (bool_57_) {
													Class93_Sub1_Sub1
															.method908(i_63_,
																	i_61_,
																	!bool,
																	i_60_,
																	i_62_);
												} else {
													Class216.method2796(i_63_,
															i_60_, i_62_,
															i_61_, (byte) 113);
												}
											}
										}
										continue;
									}
									if (class293.anInt2307 == Surface.anInt673) {
										Class64_Sub29.method673(
												Class265.aHa1974,
												Class284_Sub2_Sub2.aD6203,
												i_66_, i_65_,
												class293.anInt2258, (byte) 31,
												class293.anInt2311);
										aa_Sub3.aBooleanArray3574[i_64_] = true;
										Class265.aHa1974.KA(i_52_, i_53_,
												i_55_, i_56_);
										continue;
									}
									if (Class239.anInt1841 == class293.anInt2307) {
										Class202.method2701(i_65_,
												class293.anInt2311,
												Class265.aHa1974, i_66_,
												(byte) -90, class293.anInt2258);
										aa_Sub3.aBooleanArray3574[i_64_] = true;
										Class265.aHa1974.KA(i_52_, i_53_,
												i_55_, i_56_);
										continue;
									}
									if ((class293.anInt2307 ^ 0xffffffff) == (Class294.anInt2371 ^ 0xffffffff)) {
										if (Class91.aBoolean725
												|| Class170.aBoolean1313) {
											final int i_78_ = ((class293.anInt2311) + i_65_);
											int i_79_ = 15 + i_66_;
											if (za_Sub2.aBoolean6079) {
												if (bool_57_) {
													Class93_Sub1_Sub1
															.method908(i_63_,
																	i_61_,
																	false,
																	i_60_,
																	i_62_);
												} else {
													Class216.method2796(i_63_,
															i_60_, i_62_,
															i_61_, (byte) 118);
												}
											}
											if (Class91.aBoolean725) {
												final Class62 class62 = Class265.aHa1974
														.method1799();
												int i_80_ = -256;
												if (Class338.anInt2842 < 20) {
													i_80_ = -65536;
												}
												Class195.aClass43_1499
														.method397(
																i_80_,
																0,
																i_78_,
																-1,
																("Build: " + Game.version),
																i_79_);

												i_79_ += 15;
												Class195.aClass43_1499
														.method397(
																i_80_,
																0,
																i_78_,
																-1,
																("Fps:" + Class338.anInt2842),
																i_79_);

												i_79_ += 15;
												Class195.aClass43_1499
														.method397(
																i_80_,
																0,
																i_78_,
																-1,
																("Vendor: " + (class62.anInt484)),
																i_79_);
												i_79_ += 15;
												Class195.aClass43_1499
														.method397(
																i_80_,
																0,
																i_78_,
																-1,
																("Name: " + (class62.aString489)),
																i_79_);
												i_79_ += 15;
												Class195.aClass43_1499
														.method397(
																i_80_,
																0,
																i_78_,
																-1,
																("Version: " + (class62.anInt483)),
																i_79_);
												i_79_ += 15;
												Class195.aClass43_1499
														.method397(
																i_80_,
																0,
																i_78_,
																-1,
																("Device: " + (class62.aString488)),
																i_79_);
												i_79_ += 15;
												Class195.aClass43_1499
														.method397(
																i_80_,
																0,
																i_78_,
																-1,
																("Driver Version: " + (class62.aLong485)),
																i_79_);
												i_79_ += 15;
												final Runtime runtime = Runtime
														.getRuntime();
												int i_81_ = (int) (((runtime
														.totalMemory()) - (runtime
														.freeMemory())) / 1024L);
												int i_82_ = -256;
												if ((i_81_ ^ 0xffffffff) < -98305) {
													if (Class23.aBoolean220) {
														Class27.method294(true);
														for (int i_83_ = 0; ((i_83_ ^ 0xffffffff) > -11); i_83_++) {
															System.gc();
														}
														i_81_ = (int) (((runtime
																.totalMemory()) + -(runtime
																.freeMemory())) / 1024L);
														if ((i_81_ ^ 0xffffffff) < -65537) {
															za_Sub2.method1684(
																	"WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.",
																	4,
																	(byte) -109);
														}
													}
													i_82_ = -65536;
												}
												Class195.aClass43_1499
														.method397(i_82_, 0,
																i_78_, -1,
																"Mem:" + i_81_
																		+ "k",
																i_79_);
												i_79_ += 15;
												Class195.aClass43_1499
														.method397(
																-256,
																0,
																i_78_,
																-1,
																("In:"
																		+ Class118.anInt975
																		+ "B/s Out:"
																		+ Class98_Sub12.anInt3879 + "B/s"),
																i_79_);
												i_79_ += 15;
												final int i_84_ = (Class265.aHa1974
														.E() / 1024);
												Class195.aClass43_1499
														.method397(
																(i_84_ <= 65536 ? -256
																		: -65536),
																0, i_78_, -1,
																"Offheap:"
																		+ i_84_
																		+ "k",
																i_79_);
												i_79_ += 15;
												int i_85_ = 0;
												int i_86_ = 0;
												int i_87_ = 0;
												for (int i_88_ = 0; ((i_88_ ^ 0xffffffff) > -38); i_88_++) {
													if ((Class100.aClass339_Sub1Array844[i_88_]) != null) {
														i_85_ += (Class100.aClass339_Sub1Array844[i_88_]
																.method3800(0));
														i_86_ += (Class100.aClass339_Sub1Array844[i_88_]
																.method3798(49));
														i_87_ += (Class100.aClass339_Sub1Array844[i_88_]
																.method3791((byte) -125));
													}
												}
												final int i_89_ = i_87_ * 100
														/ i_85_;
												final int i_90_ = i_86_ * 10000
														/ i_85_;
												final String string = ("Cache:"
														+ (Class39.method349(0,
																2, 48, i_90_,
																true)) + "% ("
														+ i_89_ + "%)");
												Class69_Sub2.aClass43_5336
														.method397(-256, 0,
																i_78_, -1,
																string, i_79_);
												i_79_ += 12;
											}
											if (Class113.anInt952 > 0)
												Class69_Sub2.aClass43_5336
														.method397(
																-256,
																0,
																i_78_,
																-1,
																("Particles: "
																		+ (Class98_Sub43_Sub3.anInt5924)
																		+ " / " + Class113.anInt952),
																i_79_);
											i_79_ += 12;
											if (Class170.aBoolean1313) {
												Class69_Sub2.aClass43_5336
														.method397(
																-256,
																0,
																i_78_,
																-1,
																("Polys: "
																		+ Class265.aHa1974
																				.I()
																		+ " Models: " + Class265.aHa1974
																		.M()),
																i_79_);
												i_79_ += 12;
												Class69_Sub2.aClass43_5336
														.method397(
																-256,
																0,
																i_78_,
																-1,
																("Ls: "
																		+ Class191.anInt1480
																		+ " La: "
																		+ Class76_Sub5.anInt3748
																		+ " NPC: "
																		+ Class181.anInt1432
																		+ " Pl: " + (Class98_Sub10_Sub13.anInt5602)),
																i_79_);
												Class228.method2862(-92);
												i_79_ += 12;
											}
											aa_Sub3.aBooleanArray3574[i_64_] = true;
										}
										continue;
									}
								}
								if (class293.anInt2354 == 0) {
									if ((class293.anInt2307 == Class64_Sub21.anInt3704)
											&& Class265.aHa1974.method1768()) {
										Class265.aHa1974.method1746(i_65_,
												i_66_, class293.anInt2311,
												class293.anInt2258);
									}
									method1077(class293.anInt2248, true,
											-(class293.anInt2246) + i_65_,
											i_73_, i_72_, i_64_, class293s,
											i_75_, i_74_, bool_57_, i_66_
													+ -(class293.anInt2213));
									if ((class293.aClass293Array2339) != null) {
										method1077(class293.anInt2248, true,
												i_65_ - (class293.anInt2246),
												i_73_, i_72_, i_64_,
												(class293.aClass293Array2339),
												i_75_, i_74_, bool_57_, i_66_
														- (class293.anInt2213));
									}
									final Class98_Sub18 class98_sub18 = ((Class98_Sub18) (Class116.aClass377_964
											.method3990((class293.anInt2248),
													-1)));
									if (class98_sub18 != null) {
										Class246_Sub3_Sub5_Sub2.method3093(
												i_74_, i_64_, i_72_,
												(class98_sub18.anInt3945),
												i_66_, i_65_, i_75_, (byte) -9,
												i_73_);
									}
									if (((Class64_Sub21.anInt3704 ^ 0xffffffff) == (class293.anInt2307 ^ 0xffffffff))
											&& Class265.aHa1974.method1768()) {
										Class265.aHa1974.method1814();
									}
									Class265.aHa1974.KA(i_52_, i_53_, i_55_,
											i_56_);
								}
								if (Class232.aBooleanArray1741[i_64_]
										|| ((Class167.anInt1282 ^ 0xffffffff) < -2)) {
									if (class293.anInt2354 == 3) {
										if (i_69_ != 0) {
											if (!class293.aBoolean2263) {
												Class265.aHa1974
														.method1779(
																i_65_,
																i_66_,
																(class293.anInt2311),
																(class293.anInt2258),
																((255 + -(0xff & i_69_) << 1189469208) | (0xffffff & (class293.anInt2236))),
																1);
											} else {
												Class265.aHa1974
														.aa(i_65_,
																i_66_,
																(class293.anInt2311),
																(class293.anInt2258),
																((255 + -(0xff & i_69_) << -1750207592) | (0xffffff & (class293.anInt2236))),
																1);
											}
										} else if (class293.aBoolean2263) {
											Class265.aHa1974.aa(i_65_, i_66_,
													(class293.anInt2311),
													(class293.anInt2258),
													(class293.anInt2236), 0);
										} else {
											Class265.aHa1974.method1779(i_65_,
													i_66_,
													(class293.anInt2311),
													(class293.anInt2258),
													(class293.anInt2236), 0);
										}
										if (za_Sub2.aBoolean6079) {
											if (bool_57_) {
												Class93_Sub1_Sub1.method908(
														i_63_, i_61_, false,
														i_60_, i_62_);
											} else {
												Class216.method2796(i_63_,
														i_60_, i_62_, i_61_,
														(byte) 91);
											}
										}
									} else if (class293.anInt2354 == 4) {
										final Class43 class43 = class293
												.method3460(-69,
														(Class265.aHa1974));
										if (class43 == null) {
											if (Class93.aBoolean3503) {
												Class341.method3812(class293);
											}
										} else {
											int i_91_ = (class293.anInt2236);
											String string = (class293.aString2225);
											if (class293.anInt2302 != -1) {
												final ItemDefs class297 = (Class98_Sub46_Sub19.aClass205_6068
														.method2714(
																(class293.anInt2302),
																(byte) -121));
												string = (class297.aString2450);
												if (string == null) {
													string = "null";
												}
												if (((class297.anInt2469) == 1 || ((class293.anInt2349) ^ 0xffffffff) != -2)
														&& ((class293.anInt2349) ^ 0xffffffff) != 0) {
													string = ("<col=ff9040>"
															+ string
															+ "</col> x" + (Class64_Sub29
															.method675(
																	(class293.anInt2349),
																	16474)));
												}
											}
											if (class293.anInt2211 != -1) {
												string = (Class48.method454(
														(class293.anInt2211),
														bool));
												if (string == null) {
													string = "";
												}
											}
											if (OutputStream_Sub1.aClass293_33 == class293) {
												string = (Class309.aClass309_2617
														.method3615(
																Class374.anInt3159,
																(byte) 25));
												i_91_ = (class293.anInt2236);
											}
											if (Class153.aBoolean1230) {
												Class265.aHa1974
														.T(i_65_,
																i_66_,
																(i_65_ + (class293.anInt2311)),
																(i_66_ + (class293.anInt2258)));
											}
											class43.method405(
													i_65_,
													(class293.anInt2350),
													(class293.anInt2258),
													null,
													0,
													(class293.anInt2311),
													((class293.aBoolean2315) ? (-(0xff & i_69_) + 255 << 1735414296)
															: -1),
													(class293.anInt2244),
													(class293.anInt2296),
													i_66_,
													(byte) -80,
													(Class64_Sub18.aClass332Array3689),
													(-(i_69_ & 0xff) + 255 << 1099433400)
															| i_91_, 0, string,
													(class293.anInt2341), null);
											if (Class153.aBoolean1230) {
												Class265.aHa1974.KA(i_52_,
														i_53_, i_55_, i_56_);
											}
											if ((string.trim().length() ^ 0xffffffff) < -1) {
												if (Class153.aBoolean1230) {
													if (za_Sub2.aBoolean6079) {
														if (bool_57_) {
															Class93_Sub1_Sub1
																	.method908(
																			i_63_,
																			i_61_,
																			false,
																			i_60_,
																			i_62_);
														} else {
															Class216.method2796(
																	i_63_,
																	i_60_,
																	i_62_,
																	i_61_,
																	(byte) 114);
														}
													}
												} else {
													final Class197 class197 = (Class98_Sub46_Sub6
															.method1550(
																	(class293.anInt2264),
																	18361,
																	Class265.aHa1974));
													final int i_92_ = (class197
															.method2670(
																	(class293.anInt2311),
																	string,
																	(Class64_Sub18.aClass332Array3689),
																	(byte) 79));
													final int i_93_ = (class197
															.method2672(
																	(Class64_Sub18.aClass332Array3689),
																	(class293.anInt2311),
																	(class293.anInt2244),
																	string,
																	true));
													if (za_Sub2.aBoolean6079) {
														if (bool_57_) {
															Class93_Sub1_Sub1
																	.method908(
																			i_66_
																					+ i_93_,
																			i_66_,
																			false,
																			i_65_,
																			(i_92_ + i_65_));
														} else {
															Class216.method2796(
																	i_93_
																			+ i_66_,
																	i_65_,
																	i_92_
																			+ i_65_,
																	i_66_,
																	(byte) -62);
														}
													}
												}
											}
										}
									} else if ((class293.anInt2354 ^ 0xffffffff) == -6) {
										if (class293.anInt2267 >= 0) {
											class293.method3467(0,
													Class101.aClass115_857,
													Class373_Sub2.aClass59_5470)
													.method3831(
															0,
															(class293.anInt2216) << 1037126371,
															(class293.anInt2261) << 765115811,
															i_66_,
															-24446,
															i_65_,
															Class265.aHa1974,
															(class293.anInt2258),
															(class293.anInt2311),
															0);
										} else {
											Class332 class332;
											if (((class293.anInt2302) ^ 0xffffffff) != 0) {
												final Class313 class313 = ((class293.aBoolean2262) ? ((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aClass313_6518)
														: null);
												class332 = (Class98_Sub46_Sub19.aClass205_6068
														.method2710(
																(class293.anInt2304),
																(class293.anInt2302),
																Class265.aHa1974,
																class313,
																(class293.anInt2349),
																(class293.anInt2305),
																(~0xffffff | (class293.anInt2355)),
																24056));
											} else if (((class293.anInt2211) ^ 0xffffffff) != 0) {
												class332 = (Class200
														.method2693(
																(class293.anInt2211),
																(byte) -114,
																Class265.aHa1974));
											} else {
												class332 = (class293
														.method3456(
																Class265.aHa1974,
																-1234042329));
											}
											if (class332 != null) {
												final int i_94_ = class332
														.method3737();
												final int i_95_ = class332
														.method3749();
												final int i_96_ = ((((class293.anInt2236) ^ 0xffffffff) == -1 ? 16777215
														: (class293.anInt2236 & 0xffffff)) | (255 - (i_69_ & 0xff) << 638192120));
												if (class293.aBoolean2288) {
													Class265.aHa1974
															.T(i_65_,
																	i_66_,
																	(class293.anInt2311)
																			+ i_65_,
																	i_66_
																			+ (class293.anInt2258));
													if ((class293.anInt2255) != 0) {
														final int i_97_ = ((i_94_ + (-1 + (class293.anInt2311))) / i_94_);
														final int i_98_ = ((i_95_ - 1 + (class293.anInt2258)) / i_95_);
														for (int i_99_ = 0; ((i_99_ ^ 0xffffffff) > (i_97_ ^ 0xffffffff)); i_99_++) {
															for (int i_100_ = 0; ((i_98_ ^ 0xffffffff) < (i_100_ ^ 0xffffffff)); i_100_++) {
																if ((class293.anInt2236) == 0) {
																	class332.method3730(
																			(i_99_
																					* i_94_
																					+ i_65_ + (i_94_ / 2.0F)),
																			(i_95_
																					* i_100_
																					+ i_66_ + (i_95_ / 2.0F)),
																			4096,
																			(class293.anInt2255));
																} else {
																	class332.method3743(
																			(i_65_
																					- -(i_99_ * i_94_) + (i_94_ / 2.0F)),
																			(i_66_
																					+ i_100_
																					* i_95_ + (i_95_ / 2.0F)),
																			4096,
																			(class293.anInt2255),
																			0,
																			i_96_,
																			1);
																}
															}
														}
													} else if (((class293.anInt2236) != 0)
															|| i_69_ != 0) {
														class332.method3728(
																i_65_,
																i_66_,
																(class293.anInt2311),
																(class293.anInt2258),
																0, i_96_, 1);
													} else {
														class332.method3738(
																i_65_,
																i_66_,
																(class293.anInt2311),
																(class293.anInt2258));
													}
													Class265.aHa1974
															.KA(i_52_, i_53_,
																	i_55_,
																	i_56_);
												} else if ((class293.anInt2236) == 0
														&& i_69_ == 0) {
													if (((class293.anInt2255) ^ 0xffffffff) != -1) {
														class332.method3730(
																(i_65_ + ((class293.anInt2311) / 2.0F)),
																(i_66_ + ((class293.anInt2258) / 2.0F)),
																((class293.anInt2311) * 4096 / i_94_),
																(class293.anInt2255));
													} else if (((i_94_ ^ 0xffffffff) != ((class293.anInt2311) ^ 0xffffffff))
															|| (((class293.anInt2258) ^ 0xffffffff) != (i_95_ ^ 0xffffffff))) {
														class332.method3726(
																i_65_,
																i_66_,
																(class293.anInt2311),
																(class293.anInt2258));
													} else {
														class332.method3735(
																i_65_, i_66_);
													}
												} else if (class293.anInt2255 == 0) {
													if (((class293.anInt2311 ^ 0xffffffff) == (i_94_ ^ 0xffffffff))
															&& ((class293.anInt2258) == i_95_)) {
														class332.method3748(
																i_65_, i_66_,
																0, i_96_, 1);
													} else {
														class332.method3727(
																i_65_,
																i_66_,
																(class293.anInt2311),
																(class293.anInt2258),
																0, i_96_, 1);
													}
												} else {
													class332.method3743(
															(((class293.anInt2311) / 2.0F) + i_65_),
															(i_66_ + ((class293.anInt2258) / 2.0F)),
															(4096 * (class293.anInt2311) / i_94_),
															(class293.anInt2255),
															0, i_96_, 1);
												}
											} else if (Class93.aBoolean3503) {
												Class341.method3812(class293);
											}
										}
										if (za_Sub2.aBoolean6079) {
											if (!bool_57_) {
												Class216.method2796(i_63_,
														i_60_, i_62_, i_61_,
														(byte) 102);
											} else {
												Class93_Sub1_Sub1.method908(
														i_63_, i_61_, false,
														i_60_, i_62_);
											}
										}
									} else if (class293.anInt2354 == 6) {
										Class98_Sub35.method1452(0);
										final Class40 class40 = null;
										Class146 class146 = null;
										int i_101_ = 0;
										if ((class293.anInt2302 ^ 0xffffffff) != 0) {
											ItemDefs class297 = (Class98_Sub46_Sub19.aClass205_6068
													.method2714(
															(class293.anInt2302),
															(byte) -121));
											if (class297 != null) {
												class297 = (class297
														.method3493(
																(byte) -45,
																(class293.anInt2349)));
												final AnimationDefinition class97 = ((class293.anInt2208) == -1 ? null
														: (Class151_Sub7.aClass183_5001
																.method2623(
																		(class293.anInt2208),
																		16383)));
												final Class313 class313 = ((class293.aBoolean2262) ? ((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aClass313_6518)
														: null);
												class146 = (class297
														.method3501(
																(class293.anInt2312),
																2048,
																(class293.anInt2303),
																class97,
																(class293.anInt2287),
																Class265.aHa1974,
																1, 128,
																class313));
												if (class146 == null) {
													Class341.method3812(class293);
												} else {
													i_101_ = (-class146.fa() >> -1224511199);
												}
											}
										} else if ((class293.anInt2233) != 5) {
											if (((class293.anInt2233) ^ 0xffffffff) == -9
													|| (class293.anInt2233) == 9) {
												final Class98_Sub3 class98_sub3 = (Class64_Sub28
														.method669(
																(class293.anInt2343),
																false, 6));
												final AnimationDefinition class97 = (((class293.anInt2208) ^ 0xffffffff) == 0 ? null
														: (Class151_Sub7.aClass183_5001
																.method2623(
																		(class293.anInt2208),
																		16383)));
												if (class98_sub3 != null) {
													final Class313 class313 = (!(class293.aBoolean2262) ? null
															: ((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aClass313_6518));
													class146 = (class98_sub3
															.method951(
																	class97,
																	(class293.anInt2312),
																	(class293.anInt2303),
																	(class293.anInt2233) == 9,
																	class313,
																	(class293.anInt2210),
																	2048,
																	(class293.anInt2287),
																	(byte) -80,
																	Class265.aHa1974));
												}
											} else if (((class293.anInt2208) ^ 0xffffffff) == 0) {
												class146 = (class293
														.method3461(
																Class75.aClass140_584,
																(Class151_Sub7.aClass183_5001),
																Class4.aClass301_85,
																Class149.aClass83_1205,
																Class265.aHa1974,
																(Class370.aClass257_3136),
																class40,
																(byte) -40,
																-1,
																2048,
																-1,
																0,
																null,
																((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aClass313_6518),
																(Class98_Sub46_Sub19.aClass205_6068)));
												if (class146 == null
														&& Class93.aBoolean3503) {
													Class341.method3812(class293);
												}
											} else {
												final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
														.method2623(
																(class293.anInt2208),
																16383));
												class146 = (class293
														.method3461(
																Class75.aClass140_584,
																(Class151_Sub7.aClass183_5001),
																Class4.aClass301_85,
																Class149.aClass83_1205,
																Class265.aHa1974,
																(Class370.aClass257_3136),
																class40,
																(byte) -57,
																(class293.anInt2287),
																2048,
																(class293.anInt2303),
																(class293.anInt2312),
																class97,
																((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aClass313_6518),
																(Class98_Sub46_Sub19.aClass205_6068)));
												if (class146 == null
														&& Class93.aBoolean3503) {
													Class341.method3812(class293);
												}
											}
										} else {
											final int i_102_ = (class293.anInt2343);
											if ((i_102_ ^ 0xffffffff) <= -1
													&& ((i_102_ ^ 0xffffffff) > -2049)) {
												final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_102_]);
												final AnimationDefinition class97 = ((class293.anInt2208) != -1 ? (Class151_Sub7.aClass183_5001
														.method2623(
																(class293.anInt2208),
																16383))
														: null);
												if ((class246_sub3_sub4_sub2_sub2 != null)
														&& ((za_Sub2.anInt6080 == i_102_) || ((Class98_Sub32
																.method1438(
																		(class246_sub3_sub4_sub2_sub2.aString6537),
																		6243)) == (class293.anInt2210)))) {
													class146 = (class246_sub3_sub4_sub2_sub2.aClass313_6518
															.method3628(
																	(Class370.aClass257_3136),
																	class97,
																	null,
																	(Class151_Sub7.aClass183_5001),
																	(class293.anInt2303),
																	(Class149.aClass83_1205),
																	null,
																	(Class98_Sub46_Sub19.aClass205_6068),
																	true,
																	0,
																	null,
																	(Class4.aClass301_85),
																	(Class75.aClass140_584),
																	true,
																	2048,
																	-1,
																	(class293.anInt2312),
																	(class293.anInt2287),
																	0,
																	0,
																	Class265.aHa1974));
												}
											}
										}
										if (class146 != null) {
											int i_103_;
											if (class293.anInt2232 > 0) {
												i_103_ = (((class293.anInt2311) << -1492214583) / (class293.anInt2232));
											} else {
												i_103_ = 512;
											}
											int i_104_;
											if (class293.anInt2226 > 0) {
												i_104_ = (((class293.anInt2258) << -44986999) / (class293.anInt2226));
											} else {
												i_104_ = 512;
											}
											int i_105_ = ((class293.anInt2311) / 2 + i_65_);
											int i_106_ = (i_66_ + (class293.anInt2258) / 2);
											if (!class293.aBoolean2280) {
												i_105_ += ((class293.anInt2336)
														* i_103_ >> -1439009655);
												i_106_ += (i_104_
														* (class293.anInt2344) >> -285380663);
											}
											Class266.aClass111_1986
													.method2091();
											Class265.aHa1974
													.a(Class266.aClass111_1986);
											Class265.aHa1974.DA(i_105_, i_106_,
													i_103_, i_104_);
											Class265.aHa1974.ya();
											if (class293.aBoolean2325) {
												Class265.aHa1974.C(false);
											}
											if (!class293.aBoolean2280) {
												final int i_107_ = ((((class293.anInt2251) << -1783646334) * (Class284_Sub2_Sub2.anIntArray6200[((class293.anInt2310) << -1188499165)])) >> -1207674034);
												final int i_108_ = (((Class284_Sub2_Sub2.anIntArray6202[(class293.anInt2310 << -223590269)]) * (class293.anInt2251 << -423051582)) >> -1224356338);
												Class76_Sub5.aClass111_3745
														.method2104(-(class293.anInt2346) << -1988380221);
												Class76_Sub5.aClass111_3745
														.method2097((class293.anInt2218) << 1880483235);
												Class76_Sub5.aClass111_3745
														.method2106(
																((class293.anInt2268) << 1838805666),
																(i_101_ + (i_107_ - -((class293.anInt2273) << -1320988254))),
																((class293.anInt2273) << -290939422)
																		+ i_108_);
												Class76_Sub5.aClass111_3745
														.method2105((class293.anInt2310) << -1796566077);
											} else {
												Class76_Sub5.aClass111_3745
														.method2107(class293.anInt2310);
												Class76_Sub5.aClass111_3745
														.method2097(class293.anInt2218);
												Class76_Sub5.aClass111_3745
														.method2090(class293.anInt2346);
												Class76_Sub5.aClass111_3745
														.method2106(
																(class293.anInt2336),
																(class293.anInt2344),
																(class293.anInt2352));
											}
											class293.method3464(true,
													Class265.aHa1974,
													Class215.anInt1614,
													class146,
													Class76_Sub5.aClass111_3745);
											if (Class153.aBoolean1230) {
												Class265.aHa1974
														.T(i_65_,
																i_66_,
																(i_65_ - -(class293.anInt2311)),
																(class293.anInt2258)
																		+ i_66_);
											}
											if (!class293.aBoolean2280) {
												if (!class293.aBoolean2265) {
													class146.method2325(
															(Class76_Sub5.aClass111_3745),
															null, 1);
													if ((class293.aClass246_Sub5_2301) != null) {
														Class265.aHa1974
																.method1820(class293.aClass246_Sub5_2301
																		.method3115());
													}
												} else {
													class146.method2329(
															(Class76_Sub5.aClass111_3745),
															null,
															(class293.anInt2251 << 1326541250),
															1);
												}
											} else if (class293.aBoolean2265) {
												class146.method2329(
														(Class76_Sub5.aClass111_3745),
														null,
														(class293.anInt2251), 1);
											} else {
												class146.method2325(
														(Class76_Sub5.aClass111_3745),
														null, 1);
												if ((class293.aClass246_Sub5_2301) != null) {
													Class265.aHa1974
															.method1820(class293.aClass246_Sub5_2301
																	.method3115());
												}
											}
											if (Class153.aBoolean1230) {
												Class265.aHa1974.KA(i_52_,
														i_53_, i_55_, i_56_);
											}
											if (class293.aBoolean2325) {
												Class265.aHa1974.C(true);
											}
										}
										if (za_Sub2.aBoolean6079) {
											if (bool_57_) {
												Class93_Sub1_Sub1.method908(
														i_63_, i_61_, false,
														i_60_, i_62_);
											} else {
												Class216.method2796(i_63_,
														i_60_, i_62_, i_61_,
														(byte) 95);
											}
										}
									} else if ((class293.anInt2354 ^ 0xffffffff) == -10) {
										int i_109_;
										int i_110_;
										int i_111_;
										int i_112_;
										if (class293.aBoolean2256) {
											i_112_ = i_66_;
											i_110_ = i_65_ + class293.anInt2311;
											i_111_ = i_65_;
											i_109_ = (i_66_ - -(class293.anInt2258));
										} else {
											i_109_ = i_66_;
											i_110_ = (class293.anInt2311)
													+ i_65_;
											i_111_ = i_65_;
											i_112_ = (class293.anInt2258)
													+ i_66_;
										}
										if (class293.anInt2293 == 1) {
											Class265.aHa1974.method1795(i_111_,
													i_109_, i_110_, i_112_,
													(class293.anInt2236), 0);
										} else {
											Class265.aHa1974.method1816(i_111_,
													i_109_, i_110_, i_112_,
													(class293.anInt2236),
													(class293.anInt2293), 0);
										}
										if (za_Sub2.aBoolean6079) {
											if (!bool_57_) {
												Class216.method2796(i_63_,
														i_60_, i_62_, i_61_,
														(byte) 102);
											} else {
												Class93_Sub1_Sub1.method908(
														i_63_, i_61_, false,
														i_60_, i_62_);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("od.B(" + i + ',' + bool + ',' + i_51_ + ',' + i_52_ + ','
							+ i_53_ + ',' + i_54_ + ','
							+ (class293s != null ? "{...}" : "null") + ','
							+ i_55_ + ',' + i_56_ + ',' + bool_57_ + ','
							+ i_58_ + ')'));
		}
	}

	public static void method1078(final byte i) {
		try {
			aShortArray5674 = null;
			aShortArrayArray5669 = null;
			aShortArray5667 = null;
			aClass207_5668 = null;
			aShortArray5670 = null;
			aShortArray5673 = null;
			aClass101Array5666 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "od.D(" + i + ')');
		}
	}

	static {
		aClass101Array5666 = new Class101[6];
		aShortArray5673 = new short[] { 962, 20423, -21582, 11214, -10295 };
		aShortArray5674 = new short[] { 952, 20413, -21592, 11204, -10305 };
		aShortArrayArray5669 = new short[][] { aShortArray5667,
				aShortArray5673, aShortArray5670, aShortArray5674 };
	}
}
