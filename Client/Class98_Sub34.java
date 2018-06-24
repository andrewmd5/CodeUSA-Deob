/* Class98_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub34 extends Node {
	int anInt4126;
	static Class207 aClass207_4127;
	static IncomingOpcode aClass58_4128 = new IncomingOpcode(86, 6);

	static final void method1450(final int i, final int i_0_, final int i_1_,
			final int i_2_, final byte i_3_, final int i_4_, final int i_5_) {
		try {
			final int i_6_ = Class2.anInt71;
			final int[] is = Class319.anIntArray2705;
			Class48_Sub2_Sub1.anInt5532 = 0;
			for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (Class150.anInt1211 + i_6_ ^ 0xffffffff); i_7_++) {
				NPC class141 = null;
				Entity class246_sub3_sub4_sub2;
				if ((i_7_ ^ 0xffffffff) <= (i_6_ ^ 0xffffffff)) {
					class246_sub3_sub4_sub2 = ((Class98_Sub39) (Class260.aClass377_3254
							.method3990(Class325.anIntArray2726[-i_6_ + i_7_],
									-1))).aClass246_Sub3_Sub4_Sub2_Sub1_4187;
					class141 = ((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2).aClass141_6504;
					if (class141.anIntArray1109 != null) {
						class141 = class141.method2300(Class75.aClass140_584,
								(byte) 127);
						if (class141 == null) {
							continue;
						}
					}
				} else {
					class246_sub3_sub4_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[is[i_7_]]);
				}
				if ((class246_sub3_sub4_sub2.anInt6372) >= 0
						&& (((Class64_Sub15.anInt3676 ^ 0xffffffff) == (class246_sub3_sub4_sub2.anInt6417 ^ 0xffffffff)) || (((Class246_Sub3) class246_sub3_sub4_sub2).aByte5088 == (((Class246_Sub3) Surface.player).aByte5088)))) {
					Class17.method243(
							class246_sub3_sub4_sub2.method3044(false),
							i_0_ >> 620118273, -100, i_2_,
							class246_sub3_sub4_sub2, i_1_ >> -120706623, i);
					if ((Class259.anIntArray1957[0] ^ 0xffffffff) <= -1) {
						if (class246_sub3_sub4_sub2.aString6374 != null
								&& ((i_6_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff)
										|| (Class265.anInt1983 ^ 0xffffffff) == -1
										|| Class265.anInt1983 == 3 || (Class265.anInt1983 == 1 && (Class256_Sub1
										.method3195(
												0,
												(((Player) class246_sub3_sub4_sub2).name2)))))
								&& ((Class230.anInt1725 ^ 0xffffffff) < (Class48_Sub2_Sub1.anInt5532 ^ 0xffffffff))) {
							Class230.anIntArray1729[(Class48_Sub2_Sub1.anInt5532)] = (Class42_Sub1.aClass197_5354
									.method2674(
											class246_sub3_sub4_sub2.aString6374,
											124)) / 2;
							Class230.anIntArray1724[(Class48_Sub2_Sub1.anInt5532)] = Class259.anIntArray1957[0];
							Class230.anIntArray1730[(Class48_Sub2_Sub1.anInt5532)] = Class259.anIntArray1957[1];
							Class230.anIntArray1726[(Class48_Sub2_Sub1.anInt5532)] = class246_sub3_sub4_sub2.anInt6398;
							Class230.anIntArray1728[(Class48_Sub2_Sub1.anInt5532)] = class246_sub3_sub4_sub2.anInt6402;
							Class230.anIntArray1722[(Class48_Sub2_Sub1.anInt5532)] = class246_sub3_sub4_sub2.anInt6384;
							Class230.aStringArray1721[(Class48_Sub2_Sub1.anInt5532)] = class246_sub3_sub4_sub2.aString6374;
							Class48_Sub2_Sub1.anInt5532++;
						}
						int i_8_ = i_5_ + Class259.anIntArray1957[1];
						if (!class246_sub3_sub4_sub2.aBoolean6371
								&& ((Class215.anInt1614 ^ 0xffffffff) > (class246_sub3_sub4_sub2.anInt6418 ^ 0xffffffff))) {
							int i_9_ = -1;
							int i_10_ = 1;
							if (i_6_ <= i_7_) {
								i_9_ = class141.anInt1127;
								if ((i_9_ ^ 0xffffffff) == 0) {
									i_9_ = (class246_sub3_sub4_sub2
											.method3039(i_3_ ^ ~0x7a).anInt2381);
								}
							} else {
								final Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[is[i_7_]]);
								i_9_ = (class246_sub3_sub4_sub2.method3039(1).anInt2381);
								if (class246_sub3_sub4_sub2_sub2.aBoolean6534) {
									i_10_ = 2;
								}
							}
							Class332[] class332s = Class254.aClass332Array1943;
							if (i_9_ != -1) {
								Class332[] class332s_11_ = ((Class332[]) Class275.aClass79_2046
										.method802(-128, i_9_));
								if (class332s_11_ == null) {
									final Class324[] class324s = (Class324
											.method3680(
													Class332_Sub2.aClass207_5423,
													i_9_, 0));
									if (class324s != null) {
										class332s_11_ = new Class332[class324s.length];
										for (int i_12_ = 0; ((class324s.length ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
											class332s_11_[i_12_] = (Class265.aHa1974
													.method1758(
															class324s[i_12_],
															true));
										}
										Class275.aClass79_2046.method805(i_9_,
												class332s_11_, (byte) -80);
									}
								}
								if (class332s_11_ != null
										&& class332s_11_.length >= 2) {
									class332s = class332s_11_;
								}
							}
							if (class332s.length <= i_10_) {
								i_10_ = 1;
							}
							final Class332 class332 = class332s[0];
							final Class332 class332_13_ = class332s[i_10_];
							i_8_ -= Math.max(
									(Class42_Sub1.aClass197_5354.anInt1517),
									class332.method3731());
							final int i_14_ = i_4_
									+ (Class259.anIntArray1957[0] - (class332
											.method3734() >> -1452536927));
							int i_15_ = (class332.method3734()
									* class246_sub3_sub4_sub2.anInt6429 / 255);
							final int i_16_ = class332.method3731();
							if (class246_sub3_sub4_sub2.anInt6429 > 0
									&& i_15_ < 2) {
								i_15_ = 2;
							}
							class332.method3735(i_14_, i_8_);
							Class265.aHa1974.T(i_14_, i_8_, i_14_ + i_15_,
									i_16_ + i_8_);
							class332_13_.method3735(i_14_, i_8_);
							Class265.aHa1974.KA(i_4_, i_5_, i_0_ + i_4_, i_5_
									- -i_1_);
							Class93_Sub1_Sub1.method908(i_8_ + i_16_, i_8_,
									false, i_14_,
									(class332.method3737() + i_14_));
						} else {
							i_8_ -= Math
									.max((Class42_Sub1.aClass197_5354.anInt1517),
											Class254.aClass332Array1943[0]
													.method3731());
						}
						i_8_ -= 2;
						if (!class246_sub3_sub4_sub2.aBoolean6371) {
							if ((class246_sub3_sub4_sub2.anInt6412 ^ 0xffffffff) < (Class215.anInt1614 ^ 0xffffffff)) {
								Class332 class332 = (Class177.aClass332Array1382[!(class246_sub3_sub4_sub2.aBoolean6348) ? 0
										: 2]);
								Class332 class332_17_ = (Class177.aClass332Array1382[!(class246_sub3_sub4_sub2.aBoolean6348) ? 1
										: 3]);
								int i_18_ = -1;
								if (!(class246_sub3_sub4_sub2 instanceof Class246_Sub3_Sub4_Sub2_Sub1)) {
									i_18_ = (class246_sub3_sub4_sub2
											.method3039(1).anInt2374);
								} else {
									i_18_ = class141.anInt1100;
									if (i_18_ == -1) {
										i_18_ = class246_sub3_sub4_sub2
												.method3039(1).anInt2374;
									}
								}
								if (i_18_ != -1) {
									Class332[] class332s = ((Class332[]) Class224_Sub3.aClass79_5039
											.method802(-126, i_18_));
									if (class332s == null) {
										final Class324[] class324s = (Class324
												.method3680(
														Class332_Sub2.aClass207_5423,
														i_18_, 0));
										if (class324s != null) {
											class332s = (new Class332[class324s.length]);
											for (int i_19_ = 0; ((i_19_ ^ 0xffffffff) > (class324s.length ^ 0xffffffff)); i_19_++) {
												class332s[i_19_] = (Class265.aHa1974
														.method1758(
																class324s[i_19_],
																true));
											}
											Class224_Sub3.aClass79_5039
													.method805(i_18_,
															class332s,
															(byte) -80);
										}
									}
									if (class332s != null
											&& class332s.length == 4) {
										class332 = (class332s[!(class246_sub3_sub4_sub2.aBoolean6348) ? 0
												: 2]);
										class332_17_ = (class332s[!(class246_sub3_sub4_sub2.aBoolean6348) ? 1
												: 3]);
									}
								}
								int i_20_ = (-Class215.anInt1614 + class246_sub3_sub4_sub2.anInt6412);
								int i_21_;
								if ((class246_sub3_sub4_sub2.anInt6394 ^ 0xffffffff) <= (i_20_ ^ 0xffffffff)) {
									i_21_ = class332.method3734();
								} else {
									i_20_ -= class246_sub3_sub4_sub2.anInt6394;
									final int i_22_ = ((class246_sub3_sub4_sub2.anInt6401 ^ 0xffffffff) != -1 ? ((-i_20_ + (class246_sub3_sub4_sub2.anInt6420))
											/ (class246_sub3_sub4_sub2.anInt6401) * (class246_sub3_sub4_sub2.anInt6401))
											: 0);
									i_21_ = (class332.method3734() * i_22_ / (class246_sub3_sub4_sub2.anInt6420));
								}
								final int i_23_ = class332.method3731();
								i_8_ -= i_23_;
								final int i_24_ = (Class259.anIntArray1957[0] + (i_4_ + -(class332
										.method3734() >> 1704497793)));
								class332.method3735(i_24_, i_8_);
								Class265.aHa1974.T(i_24_, i_8_, i_21_ + i_24_,
										i_8_ - -i_23_);
								class332_17_.method3735(i_24_, i_8_);
								Class265.aHa1974.KA(i_4_, i_5_, i_0_ + i_4_,
										i_5_ + i_1_);
								Class93_Sub1_Sub1.method908(i_23_ + i_8_, i_8_,
										false, i_24_,
										(class332.method3737() + i_24_));
								i_8_ -= 2;
							}
							if (i_7_ >= i_6_) {
								if ((class141.headIcon ^ 0xffffffff) <= -1
										&& ((class141.headIcon ^ 0xffffffff) > (Class2.aClass332Array72.length ^ 0xffffffff))) {
									final Class332 class332 = (Class2.aClass332Array72[class141.headIcon]);
									i_8_ -= 25;
									class332.method3735(
											(i_4_ - -Class259.anIntArray1957[0] - (class332
													.method3734() >> -1760821695)),
											i_8_);
									Class93_Sub1_Sub1
											.method908(
													class332.method3749()
															+ i_8_,
													i_8_,
													false,
													i_4_
															- (-Class259.anIntArray1957[0] + (class332
																	.method3734() >> 845665)),
													(Class259.anIntArray1957[0]
															+ i_4_ + (-(class332
															.method3734() >> 1759618049) + class332
															.method3737())));
									i_8_ -= 2;
								}
							} else {
								final Player class246_sub3_sub4_sub2_sub2 = ((Player) class246_sub3_sub4_sub2);
								if (class246_sub3_sub4_sub2_sub2.skullIcon != -1) {
									i_8_ -= 25;
									final Class332 class332 = (Class119_Sub4.aClass332Array4739[(class246_sub3_sub4_sub2_sub2.skullIcon)]);
									class332.method3735(
											(i_4_ + ((Class259.anIntArray1957[0]) - 12)),
											i_8_);
									Class93_Sub1_Sub1
											.method908(
													class332.method3749()
															+ i_8_,
													i_8_,
													false,
													i_4_
															- (-Class259.anIntArray1957[0] - -12),
													(Class259.anIntArray1957[0] + (i_4_
															+ -12 + class332
															.method3737())));
									i_8_ -= 2;
								}
								if ((class246_sub3_sub4_sub2_sub2.headIcon ^ 0xffffffff) != 0) {
									i_8_ -= 25;
									final Class332 class332 = (Class2.aClass332Array72[(class246_sub3_sub4_sub2_sub2.headIcon)]);
									class332.method3735(
											(-12 + (i_4_ - -(Class259.anIntArray1957[0]))),
											i_8_);
									Class93_Sub1_Sub1
											.method908(
													i_8_
															- -class332
																	.method3749(),
													i_8_,
													false,
													(Class259.anIntArray1957[0]
															+ i_4_ - 12),
													i_4_
															+ (Class259.anIntArray1957[0]
																	+ -12 - -class332
																		.method3737()));
									i_8_ -= 2;
								}
							}
						}
						if (class246_sub3_sub4_sub2 instanceof Player) {
							if ((i_7_ ^ 0xffffffff) <= -1) {
								int i_25_ = 0;
								final Class36[] class36s = Class104.aClass36Array903;
								for (int i_26_ = 0; i_26_ < class36s.length; i_26_++) {
									final Class36 class36 = class36s[i_26_];
									if (class36 != null
											&& (class36.anInt346 ^ 0xffffffff) == -11
											&& (class36.anInt345 == is[i_7_])) {
										final Class332 class332 = (Class306.aClass332Array2557[class36.anInt341]);
										if ((i_25_ ^ 0xffffffff) > (class332
												.method3731() ^ 0xffffffff)) {
											i_25_ = class332.method3731();
										}
										class332.method3735(
												(Class259.anIntArray1957[0] + (i_4_ + -12)),
												-class332.method3731() + i_8_);
										Class93_Sub1_Sub1
												.method908(
														(-class332.method3731()
																+ i_8_ - -class332
																.method3749()),
														i_8_
																- class332
																		.method3731(),
														false,
														(Class259.anIntArray1957[0] + (i_4_ + -12)),
														(i_4_
																- (-Class259.anIntArray1957[0] + 12) - -class332
																.method3737()));
									}
								}
								if (i_25_ > 0) {
									i_8_ -= 2 + i_25_;
								}
							}
						} else {
							int i_27_ = 0;
							final Class36[] class36s = Class104.aClass36Array903;
							for (int i_28_ = 0; class36s.length > i_28_; i_28_++) {
								final Class36 class36 = class36s[i_28_];
								if (class36 != null
										&& class36.anInt346 == 1
										&& ((class36.anInt345 ^ 0xffffffff) == ((Class325.anIntArray2726[-i_6_
												+ i_7_]) ^ 0xffffffff))) {
									final Class332 class332 = (Class306.aClass332Array2557[class36.anInt341]);
									if (class332.method3731() > i_27_) {
										i_27_ = class332.method3731();
									}
									if ((Class215.anInt1614 % 20 ^ 0xffffffff) > -11) {
										class332.method3735(
												-12
														+ (Class259.anIntArray1957[0] + i_4_),
												i_8_ + -class332.method3731());
										Class93_Sub1_Sub1
												.method908(
														(i_8_
																- class332
																		.method3731() - -class332
																.method3749()),
														i_8_
																+ -class332
																		.method3731(),
														false,
														-12
																+ (Class259.anIntArray1957[0] + i_4_),
														(-12
																+ Class259.anIntArray1957[0] + (i_4_ + class332
																.method3737())));
									}
								}
							}
							if ((i_27_ ^ 0xffffffff) < -1) {
								i_8_ -= i_27_ - -2;
							}
						}
						int i_29_ = 0;
						for (/**/; i_29_ < Class362.anInt3090; i_29_++) {
							final int i_30_ = (class246_sub3_sub4_sub2.anIntArray6375[i_29_]);
							final int i_31_ = (class246_sub3_sub4_sub2.anIntArray6430[i_29_]);
							Class86 class86 = null;
							int i_32_ = 0;
							if ((i_31_ ^ 0xffffffff) <= -1) {
								if ((Class215.anInt1614 ^ 0xffffffff) <= (i_30_ ^ 0xffffffff)) {
									continue;
								}
								class86 = (Class246_Sub3_Sub1.aClass121_6150
										.method2194(
												i_3_ + 87,
												(class246_sub3_sub4_sub2.anIntArray6430[i_29_])));
								i_32_ = class86.anInt651;
							} else if (i_30_ < 0) {
								continue;
							}
							final int i_33_ = (class246_sub3_sub4_sub2.anIntArray6386[i_29_]);
							Class86 class86_34_ = null;
							if (i_33_ >= 0) {
								class86_34_ = Class246_Sub3_Sub1.aClass121_6150
										.method2194(94, i_33_);
							}
							if ((Class215.anInt1614 ^ 0xffffffff) <= (i_30_
									- i_32_ ^ 0xffffffff)) {
								final int i_35_ = (class246_sub3_sub4_sub2.anIntArray6397[i_29_]);
								if (i_35_ >= 0) {
									class246_sub3_sub4_sub2.anInt6418 = 300 + Class215.anInt1614;
									class246_sub3_sub4_sub2.anInt6429 = i_35_;
									class246_sub3_sub4_sub2.anIntArray6397[i_29_] = -1;
								}
								if (class86 == null) {
									class246_sub3_sub4_sub2.anIntArray6375[i_29_] = -1;
								} else {
									final int i_36_ = (class246_sub3_sub4_sub2
											.method3044(false) / 2);
									Class17.method243(i_36_,
											i_0_ >> 1162505793, 92, i_2_,
											class246_sub3_sub4_sub2,
											i_1_ >> 649783713, i);
									if ((Class259.anIntArray1957[0] ^ 0xffffffff) < 0) {
										Class259.anIntArray1957[0] += Class57.anIntArray457[i_29_];
										Class259.anIntArray1957[1] += Class235.anIntArray1764[i_29_];
										int i_40_ = 0;
										int i_41_ = 0;
										int i_42_ = 0;
										int i_43_ = 0;
										int i_44_ = 0;
										int i_45_ = 0;
										int i_46_ = 0;
										int i_47_ = 0;
										Class332 class332 = null;
										Class332 class332_48_ = null;
										Class332 class332_49_ = null;
										Class332 class332_50_ = null;
										int i_51_ = 0;
										int i_52_ = 0;
										int i_53_ = 0;
										int i_54_ = 0;
										int i_55_ = 0;
										int i_56_ = 0;
										int i_57_ = 0;
										int i_58_ = 0;
										final Class332 class332_59_ = class86
												.method846(false,
														(Class265.aHa1974));
										int i_60_ = 0;
										if (class332_59_ != null) {
											i_40_ = class332_59_.method3734();
											final int i_61_ = class332_59_
													.method3731();
											class332_59_
													.method3741(Class284_Sub1_Sub1.anIntArray6190);
											if ((i_61_ ^ 0xffffffff) < (i_60_ ^ 0xffffffff)) {
												i_60_ = i_61_;
											}
											i_44_ = (Class284_Sub1_Sub1.anIntArray6190[0]);
										}
										final Class332 class332_62_ = class86
												.method852(40,
														(Class265.aHa1974));
										if (class332_62_ != null) {
											i_41_ = class332_62_.method3734();
											final int i_63_ = class332_62_
													.method3731();
											class332_62_
													.method3741(Class284_Sub1_Sub1.anIntArray6190);
											if (i_63_ > i_60_) {
												i_60_ = i_63_;
											}
											i_45_ = (Class284_Sub1_Sub1.anIntArray6190[0]);
										}
										final Class332 class332_64_ = class86
												.method849((Class265.aHa1974),
														i_3_ ^ 0x17);
										if (class332_64_ != null) {
											i_42_ = class332_64_.method3734();
											final int i_65_ = class332_64_
													.method3731();
											class332_64_
													.method3741(Class284_Sub1_Sub1.anIntArray6190);
											if (i_60_ < i_65_) {
												i_60_ = i_65_;
											}
											i_46_ = (Class284_Sub1_Sub1.anIntArray6190[0]);
										}
										final Class332 class332_66_ = class86
												.method850(-1,
														(Class265.aHa1974));
										if (class332_66_ != null) {
											i_43_ = class332_66_.method3734();
											final int i_67_ = class332_66_
													.method3731();
											if ((i_67_ ^ 0xffffffff) < (i_60_ ^ 0xffffffff)) {
												i_60_ = i_67_;
											}
											class332_66_
													.method3741(Class284_Sub1_Sub1.anIntArray6190);
											i_47_ = (Class284_Sub1_Sub1.anIntArray6190[0]);
										}
										if (class86_34_ != null) {
											class332 = (class86_34_.method846(
													false, Class265.aHa1974));
											if (class332 != null) {
												i_51_ = class332.method3734();
												final int i_68_ = class332
														.method3731();
												if ((i_60_ ^ 0xffffffff) > (i_68_ ^ 0xffffffff)) {
													i_60_ = i_68_;
												}
												class332.method3741(Class284_Sub1_Sub1.anIntArray6190);
												i_55_ = (Class284_Sub1_Sub1.anIntArray6190[0]);
											}
											class332_48_ = (class86_34_
													.method852(63,
															Class265.aHa1974));
											if (class332_48_ != null) {
												i_52_ = class332_48_
														.method3734();
												final int i_69_ = class332_48_
														.method3731();
												class332_48_
														.method3741(Class284_Sub1_Sub1.anIntArray6190);
												if ((i_60_ ^ 0xffffffff) > (i_69_ ^ 0xffffffff)) {
													i_60_ = i_69_;
												}
												i_56_ = (Class284_Sub1_Sub1.anIntArray6190[0]);
											}
											class332_49_ = (class86_34_
													.method849(
															Class265.aHa1974,
															i_3_ ^ 0x7d));
											if (class332_49_ != null) {
												i_53_ = class332_49_
														.method3734();
												final int i_70_ = class332_49_
														.method3731();
												if (i_70_ > i_60_) {
													i_60_ = i_70_;
												}
												class332_49_
														.method3741(Class284_Sub1_Sub1.anIntArray6190);
												i_57_ = (Class284_Sub1_Sub1.anIntArray6190[0]);
											}
											class332_50_ = (class86_34_
													.method850(i_3_ ^ 0x7b,
															Class265.aHa1974));
											if (class332_50_ != null) {
												i_54_ = class332_50_
														.method3734();
												final int i_71_ = class332_50_
														.method3731();
												class332_50_
														.method3741(Class284_Sub1_Sub1.anIntArray6190);
												if ((i_60_ ^ 0xffffffff) > (i_71_ ^ 0xffffffff)) {
													i_60_ = i_71_;
												}
												i_58_ = (Class284_Sub1_Sub1.anIntArray6190[0]);
											}
										}
										Class43 class43 = Class69_Sub2.aClass43_5336;
										Class43 class43_72_ = Class69_Sub2.aClass43_5336;
										Class197 class197 = (Class98_Sub46_Sub2_Sub2.aClass197_6296);
										int i_73_ = class86.anInt655;
										Class197 class197_74_ = (Class98_Sub46_Sub2_Sub2.aClass197_6296);
										if (i_73_ >= 0) {
											final Class43 class43_75_ = (Class98_Sub1
													.method945(i_73_,
															Class265.aHa1974,
															(byte) 124, true));
											final Class197 class197_76_ = (Class98_Sub46_Sub6
													.method1550(i_73_, 18361,
															Class265.aHa1974));
											if (class43_75_ != null
													&& class197_76_ != null) {
												class197 = class197_76_;
												class43 = class43_75_;
											}
										}
										if (class86_34_ != null) {
											i_73_ = (class86_34_.anInt655);
											if ((i_73_ ^ 0xffffffff) <= -1) {
												final Class43 class43_77_ = (Class98_Sub1
														.method945(
																i_73_,
																Class265.aHa1974,
																(byte) 124,
																true));
												final Class197 class197_78_ = (Class98_Sub46_Sub6
														.method1550(
																i_73_,
																18361,
																Class265.aHa1974));
												if (class43_77_ != null
														&& class197_78_ != null) {
													class197_74_ = class197_78_;
													class43_72_ = class43_77_;
												}
											}
										}
										String string = null;
										final String string_80_ = (class86
												.method848(
														22414,
														(class246_sub3_sub4_sub2.anIntArray6425[i_29_])));
										int i_81_ = 0;
										final int i_82_ = class197.method2674(
												string_80_, i_3_ + 242);
										if (class86_34_ != null) {
											string = (class86_34_
													.method848(
															22414,
															(class246_sub3_sub4_sub2.anIntArray6423[i_29_])));
											i_81_ = class197_74_.method2674(
													string, 107);
										}
										int i_83_ = 0;
										int i_84_ = 0;
										if (i_41_ > 0) {
											i_83_ = i_82_ / i_41_ + 1;
										}
										if (class86_34_ != null && i_52_ > 0) {
											i_84_ = 1 + i_81_ / i_52_;
										}
										int i_85_ = 0;
										final int i_86_ = i_85_;
										if (i_40_ > 0) {
											i_85_ += i_40_;
										}
										i_85_ += 2;
										final int i_87_ = i_85_;
										if ((i_42_ ^ 0xffffffff) < -1) {
											i_85_ += i_42_;
										}
										final int i_88_ = i_85_;
										int i_89_ = i_85_;
										if ((i_41_ ^ 0xffffffff) < -1) {
											final int i_90_ = i_83_ * i_41_;
											i_85_ += i_90_;
											i_89_ += (-i_82_ + i_90_) / 2;
										} else {
											i_85_ += i_82_;
										}
										final int i_91_ = i_85_;
										if (i_43_ > 0) {
											i_85_ += i_43_;
										}
										int i_92_ = 0;
										int i_93_ = 0;
										int i_94_ = 0;
										int i_95_ = 0;
										int i_96_ = 0;
										if (class86_34_ != null) {
											i_85_ += 2;
											i_92_ = i_85_;
											if ((i_51_ ^ 0xffffffff) < -1) {
												i_85_ += i_51_;
											}
											i_85_ += 2;
											i_93_ = i_85_;
											if ((i_53_ ^ 0xffffffff) < -1) {
												i_85_ += i_53_;
											}
											i_94_ = i_85_;
											i_96_ = i_85_;
											if (i_52_ > 0) {
												final int i_97_ = i_84_ * i_52_;
												i_96_ += (i_97_ - i_81_) / 2;
												i_85_ += i_97_;
											} else {
												i_85_ += i_81_;
											}
											i_95_ = i_85_;
											if ((i_54_ ^ 0xffffffff) < -1) {
												i_85_ += i_54_;
											}
										}
										final int i_98_ = (-Class215.anInt1614 + (class246_sub3_sub4_sub2.anIntArray6375[i_29_]));
										final int i_99_ = (-(class86.anInt653
												* i_98_ / (class86.anInt651)) + class86.anInt653);
										final int i_100_ = ((class86.anInt650
												* i_98_ / class86.anInt651) + -(class86.anInt650));
										final int i_101_ = (i_99_ + (-(i_85_ >> -291615551) + (Class259.anIntArray1957[0] + i_4_)));
										final int i_102_ = (i_100_ + -12 + (i_5_ + (Class259.anIntArray1957[1])));
										int i_103_ = i_102_;
										int i_104_ = i_60_ + i_102_;
										final int i_105_ = (class86.anInt646
												+ i_102_ - -15);
										final int i_106_ = (-class197.anInt1517 + i_105_);
										if (i_106_ < i_103_) {
											i_103_ = i_106_;
										}
										final int i_107_ = (class197.anInt1514 + i_105_);
										if ((i_107_ ^ 0xffffffff) < (i_104_ ^ 0xffffffff)) {
											i_104_ = i_107_;
										}
										int i_108_ = 0;
										if (class86_34_ != null) {
											i_108_ = (15 + i_102_ + (class86_34_.anInt646));
											final int i_109_ = i_108_
													+ -(class197_74_.anInt1517);
											final int i_110_ = ((class197_74_.anInt1514) + i_108_);
											if (i_109_ < i_103_) {
												i_103_ = i_109_;
											}
											if (i_104_ < i_110_) {
												i_104_ = i_110_;
											}
										}
										int i_111_ = 255;
										if ((class86.anInt645 ^ 0xffffffff) <= -1) {
											i_111_ = ((i_98_ << -847692632) / ((class86.anInt651) - (class86.anInt645)));
										}
										if ((i_111_ ^ 0xffffffff) <= -1
												&& (i_111_ ^ 0xffffffff) > -256) {
											final int i_112_ = i_111_ << 877653624;
											final int i_113_ = 0xffffff | i_112_;
											if (class332_59_ != null) {
												class332_59_.method3748(-i_44_
														+ i_86_ + i_101_,
														i_102_, 0, i_113_, 1);
											}
											if (class332_64_ != null) {
												class332_64_.method3748(-i_46_
														+ i_87_ + i_101_,
														i_102_, 0, i_113_, 1);
											}
											if (class332_62_ != null) {
												for (int i_114_ = 0; i_83_ > i_114_; i_114_++) {
													class332_62_
															.method3748(
																	(i_101_
																			- -i_88_ - (i_45_ - (i_114_ * i_41_))),
																	i_102_, 0,
																	i_113_, 1);
												}
											}
											if (class332_66_ != null) {
												class332_66_.method3748(-i_47_
														+ (i_101_ - -i_91_),
														i_102_, 0, i_113_, 1);
											}
											class43.method411(
													(byte) -102,
													i_105_,
													string_80_,
													(class86.anInt648 | i_112_),
													0, i_89_ + i_101_);
											if (class86_34_ != null) {
												if (class332 != null) {
													class332.method3748((i_101_
															+ i_92_ - i_55_),
															i_102_, 0, i_113_,
															1);
												}
												if (class332_49_ != null) {
													class332_49_
															.method3748(
																	i_101_
																			- (-i_93_ - -i_57_),
																	i_102_, 0,
																	i_113_, 1);
												}
												if (class332_48_ != null) {
													for (int i_115_ = 0; i_115_ < i_84_; i_115_++) {
														class332_48_
																.method3748(
																		(i_52_
																				* i_115_
																				+ -i_56_
																				+ i_101_ + i_94_),
																		i_102_,
																		0,
																		i_113_,
																		1);
													}
												}
												if (class332_50_ != null) {
													class332_50_
															.method3748(
																	(i_95_
																			+ i_101_ + -i_58_),
																	i_102_, 0,
																	i_113_, 1);
												}
												class43_72_
														.method411(
																(byte) -105,
																i_108_,
																string,
																i_112_
																		| (class86_34_.anInt648),
																0,
																i_96_ + i_101_);
											}
										} else {
											if (class332_59_ != null) {
												class332_59_.method3735(i_101_
														- -i_86_ - i_44_,
														i_102_);
											}
											if (class332_64_ != null) {
												class332_64_.method3735(-i_46_
														+ (i_101_ + i_87_),
														i_102_);
											}
											if (class332_62_ != null) {
												for (int i_116_ = 0; i_83_ > i_116_; i_116_++) {
													class332_62_
															.method3735(
																	(i_101_
																			- -i_88_ + (-i_45_ - -(i_41_ * i_116_))),
																	i_102_);
												}
											}
											if (class332_66_ != null) {
												class332_66_.method3735(-i_47_
														+ (i_101_ + i_91_),
														i_102_);
											}
											class43.method411(
													(byte) 79,
													i_105_,
													string_80_,
													(class86.anInt648 | ~0xffffff),
													0, i_101_ - -i_89_);
											if (class86_34_ != null) {
												if (class332 != null) {
													class332.method3735(
															i_101_
																	- (-i_92_ - -i_55_),
															i_102_);
												}
												if (class332_49_ != null) {
													class332_49_
															.method3735(
																	(-i_57_
																			+ i_93_ + i_101_),
																	i_102_);
												}
												if (class332_48_ != null) {
													for (int i_117_ = 0; i_117_ < i_84_; i_117_++) {
														class332_48_
																.method3735(
																		(i_101_ + (i_94_ + (-i_56_ - -(i_117_ * i_52_)))),
																		i_102_);
													}
												}
												if (class332_50_ != null) {
													class332_50_
															.method3735(
																	-i_58_
																			+ (i_101_ + i_95_),
																	i_102_);
												}
												class43_72_
														.method411(
																(byte) 81,
																i_108_,
																string,
																~0xffffff
																		| (class86_34_.anInt648),
																0,
																i_101_ - -i_96_);
											}
										}
										Class93_Sub1_Sub1.method908(1 + i_104_,
												i_103_, false, i_101_, i_85_
														+ i_101_);
									}
								}
							}
						}
					}
				}
			}
			for (int i_118_ = 0; ((i_118_ ^ 0xffffffff) > (Class98_Sub19.anInt3955 ^ 0xffffffff)); i_118_++) {
				final int i_119_ = Class151_Sub1.anIntArray4969[i_118_];
				Entity class246_sub3_sub4_sub2;
				if (i_119_ < 2048) {
					class246_sub3_sub4_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_119_]);
				} else {
					class246_sub3_sub4_sub2 = (((Class98_Sub39) Class260.aClass377_3254
							.method3990(-2048 + i_119_, -1)).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
				}
				final int i_120_ = Class119_Sub2.anIntArray4727[i_118_];
				Entity class246_sub3_sub4_sub2_121_;
				if (i_120_ >= 2048) {
					class246_sub3_sub4_sub2_121_ = (((Class98_Sub39) (Class260.aClass377_3254
							.method3990(-2048 + i_120_, i_3_ + 123))).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
				} else {
					class246_sub3_sub4_sub2_121_ = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_120_]);
				}
				Class286.method3381(i, i_4_, i_2_, 123,
						class246_sub3_sub4_sub2, i_5_,
						class246_sub3_sub4_sub2_121_,
						--class246_sub3_sub4_sub2.anInt6358, i_0_, i_1_);
			}
			final int i_122_ = 2 + (Class42_Sub1.aClass197_5354.anInt1514 + Class42_Sub1.aClass197_5354.anInt1517);
			if (i_3_ == -124) {
				for (int i_123_ = 0; ((Class48_Sub2_Sub1.anInt5532 ^ 0xffffffff) < (i_123_ ^ 0xffffffff)); i_123_++) {
					final int i_124_ = Class230.anIntArray1724[i_123_];
					int i_125_ = Class230.anIntArray1730[i_123_];
					final int i_126_ = Class230.anIntArray1729[i_123_];
					boolean bool = true;
					while (bool) {
						bool = false;
						for (int i_127_ = 0; i_123_ > i_127_; i_127_++) {
							if ((-i_122_ + Class230.anIntArray1730[i_127_] < i_125_ + 2)
									&& ((2 + Class230.anIntArray1730[i_127_] ^ 0xffffffff) < (-i_122_
											+ i_125_ ^ 0xffffffff))
									&& (-i_126_ + i_124_ < (Class230.anIntArray1729[i_127_] + Class230.anIntArray1724[i_127_]))
									&& (((-Class230.anIntArray1729[i_127_] + Class230.anIntArray1724[i_127_]) ^ 0xffffffff) > (i_124_
											- -i_126_ ^ 0xffffffff))
									&& ((i_125_ ^ 0xffffffff) < ((-i_122_ + Class230.anIntArray1730[i_127_]) ^ 0xffffffff))) {
								i_125_ = (Class230.anIntArray1730[i_127_] + -i_122_);
								bool = true;
							}
						}
					}
					Class230.anIntArray1730[i_123_] = i_125_;
					final String string = Class230.aStringArray1721[i_123_];
					final int i_128_ = Class42_Sub1.aClass197_5354.method2674(
							string, 104);
					int i_129_ = i_4_ - -i_124_;
					int i_130_ = (-Class42_Sub1.aClass197_5354.anInt1517 + (i_125_ + i_5_));
					int i_131_ = i_128_ + i_129_;
					int i_132_ = (i_125_ + i_5_ + (Class42_Sub1.aClass197_5354.anInt1514));
					if (Class129.anInt1026 == 0) {
						int i_133_ = 16776960;
						if (Class230.anIntArray1726[i_123_] < 6) {
							i_133_ = (OutputStream_Sub1.anIntArray38[Class230.anIntArray1726[i_123_]]);
						}
						if ((Class230.anIntArray1726[i_123_] ^ 0xffffffff) == -7) {
							i_133_ = ((Class64_Sub15.anInt3676 % 20 ^ 0xffffffff) > -11) ? 16711680
									: 16776960;
						}
						if ((Class230.anIntArray1726[i_123_] ^ 0xffffffff) == -8) {
							i_133_ = (Class64_Sub15.anInt3676 % 20 >= 10 ? 65535
									: 255);
						}
						if ((Class230.anIntArray1726[i_123_] ^ 0xffffffff) == -9) {
							i_133_ = (Class64_Sub15.anInt3676 % 20 < 10 ? 45056
									: 8454016);
						}
						if ((Class230.anIntArray1726[i_123_] ^ 0xffffffff) == -10) {
							final int i_134_ = -Class230.anIntArray1722[i_123_] + 150;
							if ((i_134_ ^ 0xffffffff) <= -51) {
								if (i_134_ < 100) {
									i_133_ = (16776960 + -(i_134_ * 327680) + 16384000);
								} else if (i_134_ < 150) {
									i_133_ = (i_134_ - 100) * 5 + 65280;
								}
							} else {
								i_133_ = i_134_ * 1280 + 16711680;
							}
						}
						if ((Class230.anIntArray1726[i_123_] ^ 0xffffffff) == -11) {
							final int i_135_ = 150 + -Class230.anIntArray1722[i_123_];
							if (i_135_ < 50) {
								i_133_ = i_135_ * 5 + 16711680;
							} else if ((i_135_ ^ 0xffffffff) <= -101) {
								if (i_135_ < 150) {
									i_133_ = (255 - -(327680 * i_135_) - (32768000 - -((i_135_ + -100) * 5)));
								}
							} else {
								i_133_ = 16384000 - 327680 * i_135_ + 16711935;
							}
						}
						if ((Class230.anIntArray1726[i_123_] ^ 0xffffffff) == -12) {
							final int i_136_ = 150 - Class230.anIntArray1722[i_123_];
							if ((i_136_ ^ 0xffffffff) <= -51) {
								if ((i_136_ ^ 0xffffffff) <= -101) {
									if (i_136_ < 150) {
										i_133_ = (-(327680 * (-100 + i_136_)) + 16777215);
									}
								} else {
									i_133_ = -16384250
											+ (327685 * i_136_ + 65280);
								}
							} else {
								i_133_ = -(327685 * i_136_) + 16777215;
							}
						}
						final int i_137_ = ~0xffffff | i_133_;
						if ((Class230.anIntArray1728[i_123_] ^ 0xffffffff) == -1) {
							i_131_ -= i_128_ >> 315503681;
							Class98_Sub10_Sub34.aClass43_5730.method415(i_137_,
									string, i_4_ + i_124_, -16777216,
									(byte) 60, i_5_ + i_125_);
							i_129_ -= i_128_ >> 887140673;
						}
						if ((Class230.anIntArray1728[i_123_] ^ 0xffffffff) == -2) {
							i_130_ -= 5;
							i_129_ -= i_128_ >> -1595838975;
							Class98_Sub10_Sub34.aClass43_5730
									.method403(-16777216, i_124_ + i_4_, i_5_
											+ i_125_, Class64_Sub15.anInt3676,
											62, string, i_137_);
							i_132_ += 5;
							i_131_ -= i_128_ >> -50142815;
						}
						if ((Class230.anIntArray1728[i_123_] ^ 0xffffffff) == -3) {
							i_131_ -= (i_128_ >> 90209633) + -5;
							i_132_ += 5;
							i_130_ -= 5;
							Class98_Sub10_Sub34.aClass43_5730.method412(
									-16777216, -127, i_137_, i_124_ + i_4_,
									i_125_ + i_5_, string,
									Class64_Sub15.anInt3676);
							i_129_ -= 5 + (i_128_ >> -574220287);
						}
						if ((Class230.anIntArray1728[i_123_] ^ 0xffffffff) == -4) {
							i_131_ -= i_128_ >> 988959905;
							i_132_ += 7;
							Class98_Sub10_Sub34.aClass43_5730.method406(0,
									-16777216, i_5_ - -i_125_, i_137_,
									-Class230.anIntArray1722[i_123_] + 150,
									Class64_Sub15.anInt3676, i_124_ + i_4_,
									string);
							i_130_ -= 7;
							i_129_ -= i_128_ >> -798403551;
						}
						if (Class230.anIntArray1728[i_123_] == 4) {
							final int i_138_ = ((-Class230.anIntArray1722[i_123_] + 150)
									* (100 + Class42_Sub1.aClass197_5354
											.method2674(string, 112)) / 150);
							Class265.aHa1974.T(-50 + i_124_ + i_4_, i_5_,
									50 + (i_4_ + i_124_), i_5_ - -i_1_);
							i_131_ += 50 + -i_138_;
							i_129_ += -i_138_ + 50;
							Class98_Sub10_Sub34.aClass43_5730.method411(
									(byte) 66, i_125_ + i_5_, string, i_137_,
									-16777216, -i_138_ + i_124_ + i_4_ - -50);
							Class265.aHa1974.KA(i_4_, i_5_, i_4_ + i_0_, i_1_
									+ i_5_);
						}
						if (Class230.anIntArray1728[i_123_] == 5) {
							final int i_139_ = 150 + -Class230.anIntArray1722[i_123_];
							int i_140_ = 0;
							if (i_139_ < 25) {
								i_140_ = i_139_ + -25;
							} else if ((i_139_ ^ 0xffffffff) < -126) {
								i_140_ = -125 + i_139_;
							}
							final int i_141_ = ((Class42_Sub1.aClass197_5354.anInt1514) + (Class42_Sub1.aClass197_5354.anInt1517));
							Class265.aHa1974.T(i_4_, -i_141_
									+ (i_125_ + i_5_ - 1), i_0_ + i_4_, i_5_
									- (-i_125_ + -5));
							i_130_ += i_140_;
							i_132_ += i_140_;
							i_131_ -= i_128_ >> -305213023;
							Class98_Sub10_Sub34.aClass43_5730.method415(i_137_,
									string, i_4_ - -i_124_, -16777216,
									(byte) 124, i_140_ + (i_5_ - -i_125_));
							i_129_ -= i_128_ >> 1565844833;
							Class265.aHa1974.KA(i_4_, i_5_, i_0_ + i_4_, i_1_
									+ i_5_);
						}
					} else {
						Class98_Sub10_Sub34.aClass43_5730.method415(-256,
								string, i_124_ + i_4_, -16777216, (byte) -87,
								i_125_ + i_5_);
						i_131_ -= i_128_ >> 1383577281;
						i_129_ -= i_128_ >> -37573471;
					}
					Class93_Sub1_Sub1.method908(1 + i_132_, i_130_, false,
							i_129_, i_131_ + 1);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pda.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ')'));
		}
	}

	public static void method1451(final int i) {
		try {
			aClass58_4128 = null;
			if (i > -106) {
				aClass207_4127 = null;
			}
			aClass207_4127 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pda.B(" + i + ')');
		}
	}

	public Class98_Sub34() {
		/* empty */
	}

	Class98_Sub34(final int i) {
		try {
			anInt4126 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pda.<init>(" + i
					+ ')');
		}
	}
}
