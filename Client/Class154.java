/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class154 {
	static ha aHa1231;
	Class246_Sub3_Sub4 aClass246_Sub3_Sub4_1232;
	Class154 aClass154_1233;

	final void method2491(final int i) {
		try {
			if (Class76_Sub8.anInt3766 < 500) {
				aClass154_1233 = Class119_Sub1.aClass154_4718;
				if (i != 2) {
					aClass246_Sub3_Sub4_1232 = null;
				}
				aClass246_Sub3_Sub4_1232 = null;
				Class76_Sub8.anInt3766++;
				Class119_Sub1.aClass154_4718 = this;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kfa.B(" + i + ')');
		}
	}

	public static void method2492(final int i) {
		do {
			try {
				aHa1231 = null;
				if (i == -1) {
					break;
				}
				method2492(65);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "kfa.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method2493(final int i, final int i_0_,
			final byte[][][] is, final int i_1_, final int i_2_,
			final int[] is_3_, final boolean bool, final int[] is_4_,
			final byte i_5_, final boolean bool_6_, final int i_7_,
			final int i_8_, final int[] is_9_, final int i_10_,
			final int[] is_11_, final int i_12_, final int[] is_13_,
			final boolean bool_14_) {
		try {
			if (Class98_Sub46.anInt4261 != -1) {
				final int[] is_15_ = aHa1231.Y();
				if (bool_6_ == true) {
					final int i_16_ = is_15_[0];
					final int i_17_ = is_15_[1];
					final int i_18_ = is_15_[2];
					final int i_19_ = is_15_[3];
					int i_20_ = i_18_;
					int i_21_ = i_19_;
					if (Class98_Sub46.anInt4261 == 1) {
						i_20_ = (int) ((double) Class149.anInt1208
								* (double) i_18_ / Class48_Sub1_Sub2.anInt5519);
						i_21_ = (int) ((double) i_19_
								* (double) Class149.anInt1208 / Class48_Sub1_Sub2.anInt5519);
					}
					if (!Class358.aBoolean3033) {
						if ((Class98_Sub46.anInt4261 ^ 0xffffffff) == -2) {
							Class53_Sub1.method498(0);
						}
						final int i_22_ = i_2_ + -Canvas_Sub1.anInt23;
						final int i_23_ = i - Class103.anInt890;
						final int i_24_ = -Class24.anInt223 + i_12_;
						final int i_25_ = (int) (i_20_
								* ((i_24_ * Class76_Sub5.aDouble3747) + ((i_23_ * Class279.aDouble2100) + (i_22_ * za_Sub2.aDouble6081))) / i_1_);
						final int i_26_ = (int) (i_21_
								* (i_24_ * Class283.aDouble2145 + ((i_23_ * Class98_Sub10_Sub25.aDouble5675) + (i_22_ * Class64_Sub11.aDouble3669))) / i_1_);
						final double d = (Class367.aDouble3543 * i_24_ + (i_22_
								* Class224_Sub3.aDouble5038 + (i_23_ * Class98_Sub5_Sub2.aDouble5537)));
						final int i_27_ = (Class377.anInt3183 + i_25_ + -Class151_Sub5.anInt4993);
						final int i_28_ = (Class111_Sub3.anInt4701 + (i_26_ + -Class38.anInt359));
						final int i_29_ = i_27_ - -Class151_Sub7.anInt5005;
						final int i_30_ = i_28_ - -Class149.anInt1208;
						if (((i_27_ ^ 0xffffffff) > -1 || i_28_ < 0
								|| aa_Sub1.anInt3556 < i_29_ || Class48_Sub1_Sub2.anInt5519 < i_30_)
								&& Class98_Sub46.anInt4261 != 2) {
							if ((i_29_ ^ 0xffffffff) >= -1
									|| (i_30_ ^ 0xffffffff) >= -1
									|| aa_Sub1.anInt3556 <= i_27_
									|| i_28_ >= Class48_Sub1_Sub2.anInt5519) {
								Class358.aBoolean3033 = true;
							} else {
								final int i_31_ = i_27_ + -Class377.anInt3183;
								final int i_32_ = i_28_
										+ -Class111_Sub3.anInt4701;
								int i_33_ = 0;
								int i_34_ = 0;
								int i_35_ = 0;
								int i_36_ = 0;
								double d_37_ = 0.0;
								if ((Class98_Sub46.anInt4261 ^ 0xffffffff) != -1) {
									if (Class98_Sub46.anInt4261 == 1) {
										i_36_ = i_32_
												/ (Class98_Sub10_Sub38.anInt5761);
										i_35_ = i_31_ / Class197.anInt1513;
										i_34_ = i_36_
												* (Class98_Sub10_Sub38.anInt5761);
										i_33_ = Class197.anInt1513 * i_35_;
										d_37_ = ((i_31_ * i_33_ - -(i_32_ * i_34_))
												* (Class98_Sub39.aDouble4188 + d) / (i_31_
												* i_31_ + i_32_ * i_32_));
									}
								} else {
									d_37_ = Class98_Sub39.aDouble4188 + d;
									i_33_ = i_31_;
									i_34_ = i_32_;
								}
								d_37_ = -d_37_;
								int i_38_ = 0;
								int i_39_ = 0;
								int i_40_ = 0;
								int i_41_ = 0;
								int i_42_ = 0;
								int i_43_;
								int i_44_;
								int i_45_;
								int i_46_;
								if (i_33_ >= 0) {
									i_45_ = aa_Sub1.anInt3556 - i_33_;
									i_44_ = 0;
									if ((Class98_Sub46.anInt4261 ^ 0xffffffff) == -2) {
										i_42_ = i_35_;
										i_40_ = -i_35_ + Class191.anInt1477;
									}
									i_46_ = i_33_;
									i_43_ = i_45_;
								} else {
									i_43_ = 0;
									i_44_ = -i_33_;
									i_45_ = aa_Sub1.anInt3556 - -i_33_;
									i_46_ = i_44_;
									if ((Class98_Sub46.anInt4261 ^ 0xffffffff) == -2) {
										i_42_ = -i_35_;
										i_40_ = 0;
									}
								}
								int i_47_ = 0;
								int i_48_;
								int i_49_;
								int i_50_;
								int i_51_;
								int i_52_;
								int i_53_;
								if (i_34_ >= 0) {
									i_50_ = 0;
									i_48_ = Class48_Sub1_Sub2.anInt5519
											+ -i_34_;
									if (Class98_Sub46.anInt4261 == 1) {
										i_41_ = 0;
										i_39_ = i_36_;
										i_38_ = -i_36_ + Class63.anInt493;
										i_47_ = i_38_;
									}
									i_53_ = i_48_;
									i_49_ = i_48_;
									i_52_ = 0;
									i_51_ = i_34_;
								} else {
									i_48_ = Class48_Sub1_Sub2.anInt5519 + i_34_;
									i_49_ = 0;
									i_50_ = -i_34_;
									i_51_ = i_50_;
									i_52_ = i_51_;
									if (Class98_Sub46.anInt4261 == 1) {
										i_38_ = 0;
										i_39_ = -i_36_;
										i_47_ = Class63.anInt493 - -i_36_;
										i_41_ = i_39_;
									}
									i_53_ = i_48_;
								}
								final Class218 class218 = (Class266.aClass84_1988.aClass218_635);
								for (Class246_Sub1 class246_sub1 = ((Class246_Sub1) class218
										.method2803((byte) 15)); class246_sub1 != null; class246_sub1 = ((Class246_Sub1) class218
										.method2809(false))) {
									final Class246_Sub6[] class246_sub6s = (class246_sub1.aClass246_Sub6Array5067);
									boolean bool_54_ = true;
									for (int i_55_ = 0; class246_sub6s.length > i_55_; i_55_++) {
										final Class246_Sub6 class246_sub6 = class246_sub6s[i_55_];
										int i_56_ = (class246_sub6.anInt5111);
										int i_57_ = (class246_sub6.anInt5113);
										int i_58_ = (class246_sub6.anInt5110);
										int i_59_ = (class246_sub6.anInt5112);
										class246_sub6.anInt5110 = i_58_ -= i_33_;
										final int i_60_ = (class246_sub6.anInt5109);
										class246_sub6.anInt5112 = i_59_ = -i_34_
												+ i_59_;
										class246_sub6.anInt5111 = i_56_ = -i_33_
												+ i_56_;
										class246_sub6.anInt5113 = i_57_ = -i_34_
												+ i_57_;
										if (bool_54_) {
											final int i_61_ = ((((i_58_ ^ 0xffffffff) >= (i_56_ ^ 0xffffffff)) ? i_58_
													: i_56_) - i_60_);
											if (aa_Sub1.anInt3556 >= i_61_) {
												final int i_62_ = (-i_60_ + (i_57_ < i_59_ ? i_57_
														: i_59_));
												if (Class48_Sub1_Sub2.anInt5519 >= i_62_) {
													final int i_63_ = (i_60_ + (((i_58_ ^ 0xffffffff) < (i_56_ ^ 0xffffffff)) ? i_58_
															: i_56_));
													if ((i_63_ ^ 0xffffffff) <= -1) {
														final int i_64_ = (i_60_ + (i_59_ > i_57_ ? i_59_
																: i_57_));
														if ((i_64_ ^ 0xffffffff) <= -1) {
															bool_54_ = false;
														}
													}
												}
											}
										}
									}
									if (bool_54_) {
										class246_sub1.method2965((byte) -64);
										SurfaceSkin.method333(class246_sub1, 9);
									}
								}
								if ((Class98_Sub46.anInt4261 ^ 0xffffffff) == -1) {
									aHa1231.method1740(Class31.anInterface17_301);
								}
								aHa1231.F(-i_33_, -i_34_);
								aHa1231.b(i_44_, i_50_, i_45_, i_48_, d_37_);
								Class41.method367(
										(Class98_Sub39.aDouble4188 + d_37_),
										14794);
								Class291.aDouble2199 = Class98_Sub39.aDouble4188
										+ d_37_;
								if (Class98_Sub46.anInt4261 != 1) {
									Class76_Sub11.anInt3798 = -i_34_
											+ (-Class38.anInt359 + (Class111_Sub3.anInt4701 + i_17_));
									Class246_Sub10.anInt5154 = (-Class151_Sub5.anInt4993
											+ Class377.anInt3183 + i_16_ - i_33_);
									Class59.anInt466 = i_21_;
									Class138.anInt1085 = i_20_;
									aHa1231.DA(Class246_Sub10.anInt5154,
											Class76_Sub11.anInt3798,
											Class138.anInt1085,
											Class59.anInt466);
								} else {
									Class76_Sub11.anInt3798 = -i_34_ + i_17_
											- Class38.anInt359;
									Class246_Sub10.anInt5154 = (-i_33_
											+ -Class151_Sub5.anInt4993 + i_16_);
									Class138.anInt1085 = i_20_;
									Class59.anInt466 = i_21_;
									aHa1231.DA(Class246_Sub10.anInt5154,
											Class76_Sub11.anInt3798,
											Class138.anInt1085,
											Class59.anInt466);
								}
								Class85.method838(Class266.aClass84_1988);
								if ((i_51_ ^ 0xffffffff) < -1) {
									aHa1231.KA(0, i_49_, aa_Sub1.anInt3556,
											i_51_ + i_49_);
									aHa1231.ya();
									aHa1231.GA(Class49.anInt415);
									Class60.method535(i_10_, i_2_, i, i_12_,
											is, is_4_, is_13_, is_9_, is_11_,
											is_3_, i_0_, i_5_, i_7_, i_8_,
											bool, bool_14_, i_1_, 1, false);
								}
								if (i_46_ > 0) {
									aHa1231.KA(i_43_, i_52_, i_43_ + i_46_,
											i_52_ - -i_53_);
									aHa1231.ya();
									aHa1231.GA(Class49.anInt415);
									Class60.method535(i_10_, i_2_, i, i_12_,
											is, is_4_, is_13_, is_9_, is_11_,
											is_3_, i_0_, i_5_, i_7_, i_8_,
											bool, bool_14_, i_1_, 1, false);
								}
								aHa1231.la();
								Class115.method2155();
								if (Class98_Sub46.anInt4261 == 0) {
									aHa1231.method1776();
								}
								Class98_Sub39.aDouble4188 += d_37_;
								Class38.anInt359 += i_34_;
								Class151_Sub5.anInt4993 += i_33_;
								Class98_Sub46_Sub13_Sub2.anInt6309 = (-Class151_Sub5.anInt4993
										+ Class377.anInt3183 - -i_25_);
								Class272.anInt2037 = (-Class38.anInt359 + i_26_ + Class111_Sub3.anInt4701);
								if (Class98_Sub46.anInt4261 == 1) {
									Class268.anInt2007 += i_36_;
									Class76_Sub8.anInt3780 += i_35_;
									for (int i_65_ = 0; i_65_ < Class63.anInt493; i_65_++) {
										final int i_66_ = ((Class198
												.method2678((byte) 6, i_65_
														- -Class268.anInt2007,
														Class63.anInt493)) * Class191.anInt1477);
										for (int i_67_ = 0; ((Class191.anInt1477 ^ 0xffffffff) < (i_67_ ^ 0xffffffff)); i_67_++) {
											final int i_68_ = ((Class198
													.method2678(
															(byte) 6,
															i_67_
																	+ (Class76_Sub8.anInt3780),
															Class191.anInt1477)) + i_66_);
											final boolean bool_69_ = ((i_65_ >= i_38_ && i_65_ < i_38_
													- -i_39_) || (((i_41_ ^ 0xffffffff) >= (i_65_ ^ 0xffffffff))
													&& i_65_ < i_47_ + i_41_
													&& i_67_ >= i_40_ && ((i_42_
													+ i_40_ ^ 0xffffffff) < (i_67_ ^ 0xffffffff))));
											Class172.anInterface17Array1327[i_68_]
													.method56(
															i_67_
																	* Class197.anInt1513,
															i_65_
																	* (Class98_Sub10_Sub38.anInt5761),
															Class197.anInt1513,
															Class98_Sub10_Sub38.anInt5761,
															0, 0, bool_69_,
															true);
										}
									}
								}
							}
						} else {
							Class98_Sub46_Sub13_Sub2.anInt6309 = i_27_;
							Class272.anInt2037 = i_28_;
							if (Class98_Sub46.anInt4261 == 2) {
								Class98_Sub39.aDouble4188 = -d;
							}
						}
					}
					if (Class358.aBoolean3033) {
						Class98_Sub39.aDouble4188 = 0.0;
						Class98_Sub46_Sub13_Sub2.anInt6309 = Class377.anInt3183;
						Class151_Sub5.anInt4993 = 0;
						Class103.anInt890 = i;
						Class24.anInt223 = i_12_;
						Class272.anInt2037 = Class111_Sub3.anInt4701;
						Canvas_Sub1.anInt23 = i_2_;
						Class38.anInt359 = 0;
						if ((Class98_Sub46.anInt4261 ^ 0xffffffff) == -1) {
							aHa1231.method1740(Class31.anInterface17_301);
						}
						aHa1231.la();
						aHa1231.ya();
						aHa1231.GA(Class49.anInt415);
						Class98_Sub5_Sub3.aClass111_5540.method2093(
								Canvas_Sub1.anInt23, Class103.anInt890,
								Class24.anInt223, Class224_Sub2_Sub1.anInt6141,
								Class109.anInt926, aa_Sub1.anInt3558);
						aHa1231.a(Class98_Sub5_Sub3.aClass111_5540);
						if (Class98_Sub46.anInt4261 != 1) {
							Class59.anInt466 = i_21_;
							Class246_Sub10.anInt5154 = Class377.anInt3183
									+ i_16_;
							Class138.anInt1085 = i_20_;
							Class76_Sub11.anInt3798 = Class111_Sub3.anInt4701
									+ i_17_;
							aHa1231.DA(Class246_Sub10.anInt5154,
									Class76_Sub11.anInt3798,
									Class138.anInt1085, Class59.anInt466);
						} else {
							Class138.anInt1085 = i_20_;
							Class59.anInt466 = i_21_;
							Class76_Sub11.anInt3798 = i_17_;
							Class246_Sub10.anInt5154 = i_16_;
							aHa1231.DA(Class246_Sub10.anInt5154,
									Class76_Sub11.anInt3798,
									Class138.anInt1085, Class59.anInt466);
						}
						Class291.aDouble2199 = 0.0;
						Class266.aClass84_1988.method833(0);
						Class85.method838(Class266.aClass84_1988);
						Class60.method535(i_10_, i_2_, i, i_12_, is, is_4_,
								is_13_, is_9_, is_11_, is_3_, i_0_, i_5_, i_7_,
								i_8_, bool, bool_14_, i_1_, 1, false);
						Class115.method2155();
						Class358.aBoolean3033 = false;
						if ((Class98_Sub46.anInt4261 ^ 0xffffffff) == -1) {
							aHa1231.method1776();
						}
						if ((Class98_Sub46.anInt4261 ^ 0xffffffff) == -2) {
							Class147.method2411(0);
						}
					}
					if ((Class98_Sub46.anInt4261 ^ 0xffffffff) == -1) {
						Class31.anInterface17_301.method57(
								Class98_Sub46_Sub13_Sub2.anInt6309,
								Class272.anInt2037, Class151_Sub7.anInt5005,
								Class149.anInt1208, 0, 0, true, true);
					}
					Class230.anInt1732++;
					Class41.method367(Class98_Sub39.aDouble4188, 14794);
					Class263.aDouble1966 = Class98_Sub39.aDouble4188;
					if (Class98_Sub46.anInt4261 == 0
							|| Class98_Sub46.anInt4261 == 2) {
						if (Class98_Sub46.anInt4261 == 2) {
							aHa1231.GA(Class49.anInt415);
							aHa1231.ya();
						}
						Class98_Sub10_Sub1.anInt5543 = (Class111_Sub3.anInt4701
								+ (i_17_ - Class38.anInt359) + -Class272.anInt2037);
						Class224_Sub2_Sub1.anInt6143 = (i_16_ + (Class377.anInt3183 - (Class151_Sub5.anInt4993 + Class98_Sub46_Sub13_Sub2.anInt6309)));
						Class370.anInt3140 = i_20_;
						Class246_Sub3_Sub4_Sub2_Sub1.anInt6509 = i_21_;
						aHa1231.DA(Class224_Sub2_Sub1.anInt6143,
								Class98_Sub10_Sub1.anInt5543,
								Class370.anInt3140,
								Class246_Sub3_Sub4_Sub2_Sub1.anInt6509);
					} else if ((Class98_Sub46.anInt4261 ^ 0xffffffff) == -2) {
						Class224_Sub2_Sub1.anInt6143 = -Class151_Sub5.anInt4993
								+ i_16_;
						Class98_Sub10_Sub1.anInt5543 = i_17_ - Class38.anInt359;
						Class246_Sub3_Sub4_Sub2_Sub1.anInt6509 = i_21_;
						Class370.anInt3140 = i_20_;
						aHa1231.DA(Class224_Sub2_Sub1.anInt6143,
								Class98_Sub10_Sub1.anInt5543,
								Class370.anInt3140,
								Class246_Sub3_Sub4_Sub2_Sub1.anInt6509);
						aHa1231.KA(
								Class98_Sub46_Sub13_Sub2.anInt6309,
								Class272.anInt2037,
								(Class98_Sub46_Sub13_Sub2.anInt6309 - -Class151_Sub7.anInt5005),
								Class272.anInt2037 + Class149.anInt1208);
					}
					Class60.method535(i_10_, i_2_, i, i_12_, is, is_4_, is_13_,
							is_9_, is_11_, is_3_, i_0_, i_5_, i_7_, i_8_, bool,
							bool_14_, i_1_,
							((Class98_Sub46.anInt4261 ^ 0xffffffff) == -3) ? 0
									: 2,
							((Class98_Sub46.anInt4261 ^ 0xffffffff) == -2));
					aHa1231.la();
					aHa1231.DA(i_16_, i_17_, i_18_, i_19_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("kfa.A(" + i + ','
					+ i_0_ + ',' + (is != null ? "{...}" : "null") + ',' + i_1_
					+ ',' + i_2_ + ',' + (is_3_ != null ? "{...}" : "null")
					+ ',' + bool + ',' + (is_4_ != null ? "{...}" : "null")
					+ ',' + i_5_ + ',' + bool_6_ + ',' + i_7_ + ',' + i_8_
					+ ',' + (is_9_ != null ? "{...}" : "null") + ',' + i_10_
					+ ',' + (is_11_ != null ? "{...}" : "null") + ',' + i_12_
					+ ',' + (is_13_ != null ? "{...}" : "null") + ','
					+ bool_14_ + ')'));
		}
	}
}
