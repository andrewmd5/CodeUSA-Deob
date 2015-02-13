/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class278 {
	static Class207 aClass207_2054;
	private static Class153 aClass153_2055;
	static Class98_Sub46_Sub10 aClass98_Sub46_Sub10_2056;
	static Class341 aClass341_2057;
	private static Class32 aClass32_2058;
	static Class335 aClass335_2059;
	static Interface6 anInterface6_2060;
	private static Class377 aClass377_2061 = new Class377(16);
	static GameObjectDefinitionLoader aClass302_2062;
	static int anInt2063 = (int) (Math.random() * 11.0) - 5;
	static float aFloat2064;
	static Class148 aClass148_2065;
	static Class370 aClass370_2066;
	private static byte[] aByteArray2067;
	static float aFloat2068;
	static int anInt2069;
	private static short[] aShortArray2070;
	static int anInt2071 = (int) (Math.random() * 17.0) - 8;
	static byte[][][] aByteArrayArrayArray2072;
	private static byte[] aByteArray2073;
	static int anInt2074;
	static int anInt2075;
	private static short[] aShortArray2076;
	static int anInt2077;
	static int anInt2078;
	private static int[] anIntArray2079;
	private static byte[] aByteArray2080;
	private static byte[] aByteArray2081;
	private static Class218[][][] aClass218ArrayArrayArray2082;
	static int anInt2083;
	static int anInt2084;
	private static short[] aShortArray2085;
	static int anInt2086;
	private static byte[] aByteArray2087;
	private static Class377 aClass377_2088;
	static int anInt2089;
	static int anInt2090;
	static int anInt2091;
	private static byte[] aByteArray2092;
	static int anInt2093;
	static int anInt2094;

	private static final void method3295() {
		for (int i = 0; i < anInt2089; i++) {
			for (int i_0_ = 0; i_0_ < anInt2084; i_0_++) {
				final int i_1_ = aShortArray2076[i + i_0_ * anInt2089] & 0xffff;
				if (i_1_ != 0) {
					if (i_1_ == 65535) {
						final Class98_Sub29 class98_sub29 = ((Class98_Sub29) aClass377_2088
								.method3990(i << 16 | i_0_, -1));
						if (class98_sub29 != null) {
							for (int i_2_ = 0; i_2_ < (class98_sub29.aShortArray4082).length; i_2_++) {
								GameObjectDefinition class352 = (aClass302_2062
										.method3546(
												(class98_sub29.aShortArray4082[i_2_]) & 0xffff,
												(byte) 119));
								int i_3_ = class352.anInt2958;
								if (class352.anIntArray2928 != null) {
									class352 = (class352.method3852(
											anInterface6_2060, (byte) -72));
									if (class352 != null) {
										i_3_ = class352.anInt2958;
									}
								}
								if (i_3_ != -1) {
									final Class98_Sub47 class98_sub47 = new Class98_Sub47(
											i_3_);
									class98_sub47.anInt4272 = i;
									class98_sub47.anInt4267 = i_0_;
									aClass148_2065.method2419(class98_sub47,
											-20911);
								}
							}
						}
					} else {
						GameObjectDefinition class352 = aClass302_2062
								.method3546(i_1_ - 1, (byte) 119);
						int i_4_ = class352.anInt2958;
						if (class352.anIntArray2928 != null) {
							class352 = class352.method3852(anInterface6_2060,
									(byte) -123);
							if (class352 != null) {
								i_4_ = class352.anInt2958;
							}
						}
						if (i_4_ != -1) {
							final Class98_Sub47 class98_sub47 = new Class98_Sub47(
									i_4_);
							class98_sub47.anInt4272 = i; // map to laod i think
							class98_sub47.anInt4267 = i_0_;
							aClass148_2065.method2419(class98_sub47, -20911);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_5_ = 0; i_5_ < aClass218ArrayArrayArray2082[0].length; i_5_++) {
				for (int i_6_ = 0; i_6_ < aClass218ArrayArrayArray2082[0][0].length; i_6_++) {
					final Class218 class218 = aClass218ArrayArrayArray2082[i][i_5_][i_6_];
					if (class218 != null) {
						for (Class246_Sub8 class246_sub8 = ((Class246_Sub8) class218
								.method2803((byte) 15)); class246_sub8 != null; class246_sub8 = ((Class246_Sub8) class218
								.method2809(false))) {
							if (class246_sub8.aShortArray5129 != null) {
								for (int i_7_ = 0; i_7_ < (class246_sub8.aShortArray5129).length; i_7_++) {
									GameObjectDefinition class352 = (aClass302_2062
											.method3546(
													(class246_sub8.aShortArray5129[i_7_]) & 0xffff,
													(byte) 119));
									int i_8_ = class352.anInt2958;
									if (class352.anIntArray2928 != null) {
										class352 = (class352.method3852(
												anInterface6_2060, (byte) -107));
										if (class352 != null) {
											i_8_ = (class352.anInt2958);
										}
									}
									if (i_8_ != -1) {
										final Class98_Sub47 class98_sub47 = new Class98_Sub47(
												i_8_);
										class98_sub47.anInt4272 = ((i_5_ + (anInt2075 >> 6))
												* 64 + class246_sub8.aByte5128 - anInt2075);
										class98_sub47.anInt4267 = ((i_6_ + (anInt2078 >> 6))
												* 64 + class246_sub8.aByte5125 - anInt2078);
										aClass148_2065.method2419(
												class98_sub47, -20911);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static final Class215 method3296(final int i, final int i_9_) {
		final Class215 class215 = new Class215();
		for (Class98_Sub46_Sub10 class98_sub46_sub10 = (Class98_Sub46_Sub10) aClass377_2061
				.method3998(107); class98_sub46_sub10 != null; class98_sub46_sub10 = (Class98_Sub46_Sub10) aClass377_2061
				.method3995(-1)) {
			if (class98_sub46_sub10.aBoolean6021
					&& class98_sub46_sub10.method1564(6, i, i_9_)) {
				class215.method2785(class98_sub46_sub10, -76);
			}
		}
		return class215;
	}

	static final void method3297() { // size lelele
		aByteArray2081 = new byte[anInt2089 * anInt2084];
		aByteArray2087 = new byte[anInt2089 * anInt2084];
		aByteArray2073 = new byte[anInt2089 * anInt2084];
		aShortArray2076 = new short[anInt2089 * anInt2084];
		aByteArray2092 = new byte[anInt2089 * anInt2084];
		aClass377_2088 = new Class377(1024);
		aClass218ArrayArrayArray2082 = new Class218[3][anInt2089 >> 6][anInt2084 >> 6];
		anIntArray2079 = new int[aClass32_2058.anInt309 + 1];
	}

	static final void method3298(final Class207 class207,
			final Class32 class32, final Class153 class153,
			final GameObjectDefinitionLoader class302, final Class341 class341,
			final Class335 class335, final Interface6 interface6) {
		aClass207_2054 = class207;
		aClass32_2058 = class32;
		aClass153_2055 = class153;
		aClass302_2062 = class302;
		aClass341_2057 = class341;
		aClass335_2059 = class335;
		anInterface6_2060 = interface6;
		aClass377_2061.method3994(-107);
		final int i = aClass207_2054.method2750((byte) -76, "details");
		final int[] is = aClass207_2054.method2743(i, 6341);
		if (is != null) {
			for (int i_10_ = 0; i_10_ < is.length; i_10_++) {
				final Class98_Sub46_Sub10 class98_sub46_sub10 = Class48_Sub1
						.method457(is[i_10_], i, 10443, aClass207_2054);
				aClass377_2061.method3996(class98_sub46_sub10,
						(class98_sub46_sub10.anInt6014), -1);
			}
		}
		Class101.method1702(8, true, false);
	}

	static final void method3299() {
		aByteArray2081 = null;
		aByteArray2080 = null;
		aShortArray2085 = null;
		aByteArray2087 = null;
		aByteArray2073 = null;
		aShortArray2076 = null;
		aByteArray2092 = null;
		aClass377_2088 = null;
		aClass218ArrayArrayArray2082 = null;
		anIntArray2079 = null;
	}

	private static final void method3300(final ha var_ha,
			final ByteBuffer class98_sub22, final int i, final int i_11_,
			final int i_12_, final int i_13_, final int[] is, final int[] is_14_) {
		final int i_15_ = class98_sub22.readUnsignedByte((byte) 95);
		if ((i_15_ & 0x1) == 0) {
			final boolean bool = (i_15_ & 0x2) == 0;
			int i_16_ = i_15_ >> 2 & 0x3f;
			if (i_16_ != 62) {
				if (i_16_ == 63) {
					i_16_ = class98_sub22.readUnsignedByte((byte) 124);
				} else if (bool) {
					i_16_ = is[i_16_];
				} else {
					i_16_ = is_14_[i_16_];
				}
				if (bool) {
					aByteArray2081[i_12_ + i_13_ * anInt2089] = (byte) i_16_;
					aByteArray2087[i_12_ + i_13_ * anInt2089] = (byte) 0;
				} else {
					aByteArray2087[i_12_ + i_13_ * anInt2089] = (byte) i_16_;
					aByteArray2073[i_12_ + i_13_ * anInt2089] = (byte) 0;
					aByteArray2081[i_12_ + i_13_ * anInt2089] = class98_sub22
							.readSignedByte((byte) -19);
				}
			}
		} else {
			final int i_17_ = (i_15_ >> 1 & 0x3) + 1;
			final boolean bool = (i_15_ & 0x8) != 0;
			final boolean bool_18_ = (i_15_ & 0x10) != 0;
			for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
				final int i_20_ = class98_sub22.readUnsignedByte((byte) -110);
				int i_21_ = 0;
				int i_22_ = 0;
				if (bool) {
					i_21_ = class98_sub22.readUnsignedByte((byte) -123);
					i_22_ = class98_sub22.readUnsignedByte((byte) -127);
				}
				int i_23_ = 0;
				if (bool_18_) {
					i_23_ = class98_sub22.readUnsignedByte((byte) 15);
				}
				if (i_19_ == 0) {
					aByteArray2081[i_12_ + i_13_ * anInt2089] = (byte) i_20_;
					aByteArray2087[i_12_ + i_13_ * anInt2089] = (byte) i_21_;
					aByteArray2073[i_12_ + i_13_ * anInt2089] = (byte) i_22_;
					if (i_23_ == 1) {
						aShortArray2076[i_12_ + i_13_ * anInt2089] = (short) (class98_sub22
								.readUnsignedShort((byte) 127) + 1);
						aByteArray2092[i_12_ + i_13_ * anInt2089] = class98_sub22
								.readSignedByte((byte) -19);
					} else if (i_23_ > 1) {
						aShortArray2076[i_12_ + i_13_ * anInt2089] = (short) -1;
						final short[] is_24_ = new short[i_23_];
						final byte[] is_25_ = new byte[i_23_];
						for (int i_26_ = 0; i_26_ < i_23_; i_26_++) {
							is_24_[i_26_] = (short) class98_sub22
									.readUnsignedShort((byte) 127);
							is_25_[i_26_] = class98_sub22
									.readSignedByte((byte) -19);
						}
						aClass377_2088.method3996(new Class98_Sub29(is_24_,
								is_25_), i_12_ << 16 | i_13_, -1);
					}
				} else {
					short[] is_27_ = null;
					byte[] is_28_ = null;
					if (i_23_ > 0) {
						is_27_ = new short[i_23_];
						is_28_ = new byte[i_23_];
						for (int i_29_ = 0; i_29_ < i_23_; i_29_++) {
							is_27_[i_29_] = (short) class98_sub22
									.readUnsignedShort((byte) 127);
							is_28_[i_29_] = class98_sub22
									.readSignedByte((byte) -19);
						}
					}
					if ((aClass218ArrayArrayArray2082[i_19_ - 1][i
							- (anInt2075 >> 6)][i_11_ - (anInt2078 >> 6)]) == null) {
						aClass218ArrayArrayArray2082[i_19_ - 1][i
								- (anInt2075 >> 6)][i_11_ - (anInt2078 >> 6)] = new Class218();
					}
					final Class246_Sub8 class246_sub8 = new Class246_Sub8(
							i_12_ & 0x3f, i_13_ & 0x3f, i_20_, i_21_, i_22_,
							is_27_, is_28_);
					aClass218ArrayArrayArray2082[i_19_ - 1][i
							- (anInt2075 >> 6)][i_11_ - (anInt2078 >> 6)]
							.method2808(true, class246_sub8);
				}
			}
		}
	}

	private static final void method3301(final ha var_ha, final int i,
			final int i_30_, final int i_31_, final int i_32_) {
		int i_33_ = anInt2074 - anInt2091;
		int i_34_ = anInt2083 - anInt2090;
		if (anInt2074 < anInt2089) {
			i_33_++;
		}
		if (anInt2083 < anInt2084) {
			i_34_++;
		}
		for (int i_35_ = 0; i_35_ < i_33_; i_35_++) {
			final int i_36_ = (i_31_ + i * i_35_ >> 16) + anInt2086;
			final int i_37_ = (i_31_ + i * (i_35_ + 1) >> 16) + anInt2086;
			final int i_38_ = i_37_ - i_36_;
			if (i_38_ > 0) {
				final int i_39_ = anInt2091 + i_35_;
				if (i_39_ < 0 || i_39_ >= anInt2089) {
					for (int i_40_ = 0; i_40_ < i_34_; i_40_++) {
						final int i_41_ = anInt2094
								- (i_32_ + i_30_ * (i_40_ + 1) >> 16);
						final int i_42_ = anInt2094
								- (i_32_ + i_30_ * i_40_ >> 16);
						final int i_43_ = i_42_ - i_41_;
						int i_44_;
						if ((aClass98_Sub46_Sub10_2056.anInt6013) != -1) {
							i_44_ = ~0xffffff
									| (aClass98_Sub46_Sub10_2056.anInt6013);
						} else if ((i_35_ + anInt2091 & 0x4) != (i_40_
								+ anInt2083 & 0x4)) {
							i_44_ = -11840664;
						} else {
							i_44_ = (anIntArray2079[aClass32_2058.anInt312 + 1]);
						}
						if (i_44_ == 0) {
							i_44_ = -16777216;
						}
						var_ha.aa(i_36_, i_41_, i_38_, i_43_, i_44_, 0);
					}
				} else {
					for (int i_45_ = 0; i_45_ < i_34_; i_45_++) {
						final int i_46_ = anInt2094
								- (i_32_ + i_30_ * (i_45_ + 1) >> 16);
						final int i_47_ = anInt2094
								- (i_32_ + i_30_ * i_45_ >> 16);
						final int i_48_ = i_47_ - i_46_;
						if (i_48_ > 0) {
							final int i_49_ = i_45_ + anInt2090;
							final int i_50_ = i_39_ + i_49_ * anInt2089;
							int i_51_ = 0;
							int i_52_ = 0;
							int i_53_ = 0;
							if (i_49_ >= 0 && i_49_ < anInt2084) {
								i_51_ = ((aByteArray2080[i_50_] & 0xff) << 16 | aShortArray2085[i_50_] & 0xffff);
								if (i_51_ != 0) {
									i_51_ |= ~0xffffff;
								}
								i_52_ = aByteArray2087[i_50_] & 0xff;
								i_53_ = aShortArray2076[i_50_] & 0xffff;
							}
							if (i_51_ == 0 && i_52_ == 0 && i_53_ == 0) {
								if (aClass98_Sub46_Sub10_2056.anInt6013 != -1) {
									i_51_ = (~0xffffff | (aClass98_Sub46_Sub10_2056.anInt6013));
								} else if ((i_35_ + anInt2091 & 0x4) != (i_45_
										+ anInt2083 & 0x4)) {
									i_51_ = -11840664;
								} else {
									i_51_ = (anIntArray2079[(aClass32_2058.anInt312 + 1)]);
								}
								if (i_51_ == 0) {
									i_51_ = -16777216;
								}
								var_ha.aa(i_36_, i_46_, i_38_, i_48_, i_51_, 0);
							} else if (i_53_ > 0) {
								if (i_53_ == 65535) {
									final Class98_Sub29 class98_sub29 = ((Class98_Sub29) (aClass377_2088
											.method3990(i_39_ << 16 | i_49_, -1)));
									if (class98_sub29 != null) {
										method3318(
												var_ha,
												i_36_,
												i_46_,
												i_38_,
												i_48_,
												i_51_,
												i_52_,
												aByteArray2073[i_50_],
												(class98_sub29.aShortArray4082),
												(class98_sub29.aByteArray4083),
												true);
									}
								} else {
									aShortArray2070[0] = (short) (i_53_ - 1);
									aByteArray2067[0] = aByteArray2092[i_50_];
									method3318(var_ha, i_36_, i_46_, i_38_,
											i_48_, i_51_, i_52_,
											aByteArray2073[i_50_],
											aShortArray2070, aByteArray2067,
											true);
								}
							} else {
								method3318(var_ha, i_36_, i_46_, i_38_, i_48_,
										i_51_, i_52_, aByteArray2073[i_50_],
										null, null, true);
							}
						}
					}
				}
			}
		}
		for (int i_54_ = -16; i_54_ < i_33_ + 16; i_54_++) {
			final int i_55_ = (i_31_ + i * i_54_ >> 16) + anInt2086;
			final int i_56_ = (i_31_ + i * (i_54_ + 1) >> 16) + anInt2086;
			final int i_57_ = i_56_ - i_55_;
			if (i_57_ > 0) {
				final int i_58_ = i_54_ + anInt2091;
				if (i_58_ >= 0 && i_58_ < anInt2089) {
					for (int i_59_ = -16; i_59_ < i_34_ + 16; i_59_++) {
						final int i_60_ = anInt2094
								- (i_32_ + i_30_ * (i_59_ + 1) >> 16);
						final int i_61_ = anInt2094
								- (i_32_ + i_30_ * i_59_ >> 16);
						final int i_62_ = i_61_ - i_60_;
						if (i_62_ > 0) {
							final int i_63_ = i_59_ + anInt2090;
							if (i_63_ >= 0 && i_63_ < anInt2084) {
								final int i_64_ = ((aShortArray2076[i_58_
										+ i_63_ * anInt2089]) & 0xffff);
								if (i_64_ > 0) {
									if (i_64_ == 65535) {
										final Class98_Sub29 class98_sub29 = ((Class98_Sub29) (aClass377_2088
												.method3990(
														i_58_ << 16 | i_63_, -1)));
										if (class98_sub29 != null) {
											method3317(
													var_ha,
													i_55_,
													i_60_,
													i_57_,
													i_62_,
													(class98_sub29.aShortArray4082),
													(class98_sub29.aByteArray4083));
										}
									} else {
										aShortArray2070[0] = (short) (i_64_ - 1);
										aByteArray2067[0] = (aByteArray2092[i_58_
												+ i_63_ * anInt2089]);
										method3317(var_ha, i_55_, i_60_, i_57_,
												i_62_, aShortArray2070,
												aByteArray2067);
									}
								} else {
									method3317(var_ha, i_55_, i_60_, i_57_,
											i_62_, null, null);
								}
							}
						}
					}
				}
			}
		}
		int i_65_ = anInt2091 >> 6;
		int i_66_ = anInt2090 >> 6;
		if (i_65_ < 0) {
			i_65_ = 0;
		}
		if (i_66_ < 0) {
			i_66_ = 0;
		}
		int i_67_ = anInt2074 >> 6;
		int i_68_ = anInt2083 >> 6;
		if (i_67_ >= aClass218ArrayArrayArray2082[0].length) {
			i_67_ = aClass218ArrayArrayArray2082[0].length - 1;
		}
		if (i_68_ >= aClass218ArrayArrayArray2082[0][0].length) {
			i_68_ = aClass218ArrayArrayArray2082[0][0].length - 1;
		}
		for (int i_69_ = 0; i_69_ < 3; i_69_++) {
			for (int i_70_ = i_65_; i_70_ <= i_67_; i_70_++) {
				for (int i_71_ = i_66_; i_71_ <= i_68_; i_71_++) {
					final Class218 class218 = aClass218ArrayArrayArray2082[i_69_][i_70_][i_71_];
					if (class218 != null) {
						final int i_72_ = (i_70_ + (anInt2075 >> 6)) * 64;
						final int i_73_ = (i_71_ + (anInt2078 >> 6)) * 64;
						for (Class246_Sub8 class246_sub8 = ((Class246_Sub8) class218
								.method2803((byte) 15)); class246_sub8 != null; class246_sub8 = ((Class246_Sub8) class218
								.method2809(false))) {
							final int i_74_ = (i_72_ + class246_sub8.aByte5128
									- anInt2075 - anInt2091);
							final int i_75_ = (i_73_ + class246_sub8.aByte5125
									- anInt2078 - anInt2090);
							final int i_76_ = (i_31_ + i * i_74_ >> 16)
									+ anInt2086;
							final int i_77_ = (i_31_ + i * (i_74_ + 1) >> 16)
									+ anInt2086;
							final int i_78_ = (anInt2094 - (i_32_ + i_30_
									* (i_75_ + 1) >> 16));
							final int i_79_ = anInt2094
									- (i_32_ + i_30_ * i_75_ >> 16);
							method3318(var_ha, i_76_, i_78_, i_77_ - i_76_,
									i_79_ - i_78_, (class246_sub8.anInt5124),
									(class246_sub8.aByte5127) & 0xff,
									(class246_sub8.aByte5126),
									(class246_sub8.aShortArray5129),
									(class246_sub8.aByteArray5130), false);
						}
					}
				}
			}
			for (int i_80_ = i_65_; i_80_ <= i_67_; i_80_++) {
				for (int i_81_ = i_66_; i_81_ <= i_68_; i_81_++) {
					final Class218 class218 = aClass218ArrayArrayArray2082[i_69_][i_80_][i_81_];
					if (class218 != null) {
						final int i_82_ = (i_80_ + (anInt2075 >> 6)) * 64;
						final int i_83_ = (i_81_ + (anInt2078 >> 6)) * 64;
						for (Class246_Sub8 class246_sub8 = ((Class246_Sub8) class218
								.method2803((byte) 15)); class246_sub8 != null; class246_sub8 = ((Class246_Sub8) class218
								.method2809(false))) {
							final int i_84_ = (i_82_ + class246_sub8.aByte5128
									- anInt2075 - anInt2091);
							final int i_85_ = (i_83_ + class246_sub8.aByte5125
									- anInt2078 - anInt2090);
							final int i_86_ = (i_31_ + i * i_84_ >> 16)
									+ anInt2086;
							final int i_87_ = (i_31_ + i * (i_84_ + 1) >> 16)
									+ anInt2086;
							final int i_88_ = (anInt2094 - (i_32_ + i_30_
									* (i_85_ + 1) >> 16));
							final int i_89_ = anInt2094
									- (i_32_ + i_30_ * i_85_ >> 16);
							method3317(var_ha, i_86_, i_88_, i_87_ - i_86_,
									i_89_ - i_88_,
									(class246_sub8.aShortArray5129),
									(class246_sub8.aByteArray5130));
						}
					}
				}
			}
		}
	}

	static final void method3302() {
		final int[] is = new int[3];
		for (int i = 0; i < aClass370_2066.anInt3137; i++) {
			final boolean bool = (aClass98_Sub46_Sub10_2056.method1573(
					aClass370_2066.anIntArray3133[i] >> 28 & 0x3, is, -122,
					aClass370_2066.anIntArray3133[i] & 0x3fff,
					(aClass370_2066.anIntArray3133[i] >> 14 & 0x3fff)));
			if (bool) {
				final Class98_Sub47 class98_sub47 = new Class98_Sub47(
						aClass370_2066.anIntArray3138[i]);
				class98_sub47.anInt4272 = is[1] - anInt2075;
				class98_sub47.anInt4267 = is[2] - anInt2078;
				aClass148_2065.method2419(class98_sub47, -20911);
			}
		}
	}

	static final Class98_Sub46_Sub10 method3303(final int i, final int i_90_) {
		for (Class98_Sub46_Sub10 class98_sub46_sub10 = (Class98_Sub46_Sub10) aClass377_2061
				.method3998(101); class98_sub46_sub10 != null; class98_sub46_sub10 = (Class98_Sub46_Sub10) aClass377_2061
				.method3995(-1)) {
			if (class98_sub46_sub10.aBoolean6021
					&& class98_sub46_sub10.method1564(6, i, i_90_)) {
				return class98_sub46_sub10;
			}
		}
		return null;
	}

	static final void method3304(final d var_d, final int i, final int i_91_) {
		for (int i_92_ = 0; i_92_ < aClass32_2058.anInt309; i_92_++) {
			anIntArray2079[i_92_ + 1] = method3311(var_d, i_92_, i, i_91_);
		}
	}

	static final void method3305(final ha var_ha, final int i, final int i_93_) { // store
																					// map
																					// by
		// name + area
		final ByteBuffer class98_sub22 = (new ByteBuffer(
				aClass207_2054
						.method2739((aClass98_Sub46_Sub10_2056.aString6017),
								"area", -32734)));
		final int i_94_ = class98_sub22.readUnsignedByte((byte) -109);
		final int[] is = new int[i_94_];
		for (int i_95_ = 0; i_95_ < i_94_; i_95_++) {
			is[i_95_] = class98_sub22.readUnsignedByte((byte) 92);
		}
		final int i_96_ = class98_sub22.readUnsignedByte((byte) -113);
		final int[] is_97_ = new int[i_96_];
		for (int i_98_ = 0; i_98_ < i_96_; i_98_++) {
			is_97_[i_98_] = class98_sub22.readUnsignedByte((byte) -8);
		}
		while (class98_sub22.position < class98_sub22.aByteArray3992.length) {
			if (class98_sub22.readUnsignedByte((byte) -111) == 0) {
				final int i_99_ = class98_sub22.readUnsignedByte((byte) -115);
				final int i_100_ = class98_sub22.readUnsignedByte((byte) 56);
				for (int i_101_ = 0; i_101_ < 64; i_101_++) {
					for (int i_102_ = 0; i_102_ < 64; i_102_++) {
						final int i_103_ = i_99_ * 64 + i_101_ - anInt2075;
						final int i_104_ = i_100_ * 64 + i_102_ - anInt2078;
						method3300(var_ha, class98_sub22, i_99_, i_100_,
								i_103_, i_104_, is, is_97_);
					}
				}
			} else {
				final int i_105_ = class98_sub22.readUnsignedByte((byte) 126);
				final int i_106_ = class98_sub22.readUnsignedByte((byte) -108);
				final int i_107_ = class98_sub22.readUnsignedByte((byte) -4);
				final int i_108_ = class98_sub22.readUnsignedByte((byte) -113);
				for (int i_109_ = 0; i_109_ < 8; i_109_++) {
					for (int i_110_ = 0; i_110_ < 8; i_110_++) {
						final int i_111_ = i_105_ * 64 + i_107_ * 8 + i_109_
								- anInt2075;
						final int i_112_ = i_106_ * 64 + i_108_ * 8 + i_110_
								- anInt2078;
						method3300(var_ha, class98_sub22, i_105_, i_106_,
								i_111_, i_112_, is, is_97_);
					}
				}
			}
		}
		aByteArray2080 = new byte[anInt2089 * anInt2084];
		aShortArray2085 = new short[anInt2089 * anInt2084];
		for (int i_113_ = 0; i_113_ < 3; i_113_++) {
			final byte[] is_114_ = new byte[anInt2089 * anInt2084];
			for (int i_115_ = 0; i_115_ < aClass218ArrayArrayArray2082[i_113_].length; i_115_++) {
				for (int i_116_ = 0; i_116_ < aClass218ArrayArrayArray2082[i_113_][0].length; i_116_++) {
					final Class218 class218 = aClass218ArrayArrayArray2082[i_113_][i_115_][i_116_];
					if (class218 != null) {
						for (Class246_Sub8 class246_sub8 = ((Class246_Sub8) class218
								.method2803((byte) 15)); class246_sub8 != null; class246_sub8 = (Class246_Sub8) class218
								.method2809(false)) {
							is_114_[(i_115_ * 64 + (class246_sub8.aByte5128) + (i_116_ * 64 + (class246_sub8.aByte5125))
									* anInt2089)] = (byte) (class246_sub8.anInt5124);
						}
					}
				}
			}
			method3310(is_114_, aByteArray2080, aShortArray2085, i, i_93_);
			for (int i_117_ = 0; i_117_ < aClass218ArrayArrayArray2082[i_113_].length; i_117_++) {
				for (int i_118_ = 0; i_118_ < aClass218ArrayArrayArray2082[i_113_][0].length; i_118_++) {
					final Class218 class218 = aClass218ArrayArrayArray2082[i_113_][i_117_][i_118_];
					if (class218 != null) {
						for (Class246_Sub8 class246_sub8 = ((Class246_Sub8) class218
								.method2803((byte) 15)); class246_sub8 != null; class246_sub8 = ((Class246_Sub8) class218
								.method2809(false))) {
							final int i_119_ = (i_117_ * 64
									+ class246_sub8.aByte5128 + (i_118_ * 64 + (class246_sub8.aByte5125))
									* anInt2089);
							class246_sub8.anInt5124 = ((aByteArray2080[i_119_] & 0xff) << 16 | aShortArray2085[i_119_] & 0xffff);
							if (class246_sub8.anInt5124 != 0) {
								class246_sub8.anInt5124 |= ~0xffffff;
							}
						}
					}
				}
			}
		}
		method3310(aByteArray2081, aByteArray2080, aShortArray2085, i, i_93_);
		aByteArray2081 = null;
		method3295();
	}

	static final Class98_Sub46_Sub10 method3306(final int i) {
		return (Class98_Sub46_Sub10) aClass377_2061.method3990(i, -1);
	}

	private static final void method3307(final ha var_ha,
			final Class98_Sub47 class98_sub47, final int i, final int i_120_,
			final int i_121_, final int i_122_) {
		class98_sub47.anInt4266 = (anInt2086 + (i_121_ + i
				* (class98_sub47.anInt4272 - anInt2091) >> 16));
		class98_sub47.anInt4271 = (anInt2094 - (i_122_ + i_120_
				* (class98_sub47.anInt4267 - anInt2090) >> 16));
	}

	static final void method3308(final int i, final int i_123_,
			final int i_124_, final int i_125_, final int i_126_,
			final int i_127_, final int i_128_, final int i_129_) {
		anInt2091 = i - anInt2075;
		anInt2083 = i_123_ - anInt2078;
		anInt2074 = i_124_ - anInt2075;
		anInt2090 = i_125_ - anInt2078;
		anInt2086 = i_126_;
		anInt2077 = i_127_;
		anInt2093 = i_128_;
		anInt2094 = i_129_;
	}

	static final void method3309(final ha var_ha) {
		final int i = anInt2074 - anInt2091;
		final int i_130_ = anInt2083 - anInt2090;
		final int i_131_ = (anInt2093 - anInt2086 << 16) / i;
		final int i_132_ = (anInt2094 - anInt2077 << 16) / i_130_;
		method3301(var_ha, i_131_, i_132_, 0, 0);
	}

	private static final void method3310(final byte[] is, final byte[] is_133_,
			final short[] is_134_, final int i, final int i_135_) {
		final int[] is_136_ = new int[anInt2084];
		final int[] is_137_ = new int[anInt2084];
		final int[] is_138_ = new int[anInt2084];
		final int[] is_139_ = new int[anInt2084];
		final int[] is_140_ = new int[anInt2084];
		for (int i_141_ = -5; i_141_ < anInt2089; i_141_++) {
			final int i_142_ = i_141_ + 5;
			final int i_143_ = i_141_ - 5;
			for (int i_144_ = 0; i_144_ < anInt2084; i_144_++) {
				if (i_142_ < anInt2089) {
					final int i_145_ = is[i_142_ + i_144_ * anInt2089] & 0xff;
					if (i_145_ > 0) {
						final Class72 class72 = aClass153_2055.method2483(
								i_145_ - 1, 125);
						is_136_[i_144_] += class72.anInt538;
						is_137_[i_144_] += class72.anInt541;
						is_138_[i_144_] += class72.anInt542;
						is_139_[i_144_] += class72.anInt540;
						is_140_[i_144_]++;
					}
				}
				if (i_143_ >= 0) {
					final int i_146_ = is[i_143_ + i_144_ * anInt2089] & 0xff;
					if (i_146_ > 0) {
						final Class72 class72 = aClass153_2055.method2483(
								i_146_ - 1, 120);
						is_136_[i_144_] -= class72.anInt538;
						is_137_[i_144_] -= class72.anInt541;
						is_138_[i_144_] -= class72.anInt542;
						is_139_[i_144_] -= class72.anInt540;
						is_140_[i_144_]--;
					}
				}
			}
			if (i_141_ >= 0) {
				int i_147_ = 0;
				int i_148_ = 0;
				int i_149_ = 0;
				int i_150_ = 0;
				int i_151_ = 0;
				for (int i_152_ = -5; i_152_ < anInt2084; i_152_++) {
					final int i_153_ = i_152_ + 5;
					if (i_153_ < anInt2084) {
						i_147_ += is_136_[i_153_];
						i_148_ += is_137_[i_153_];
						i_149_ += is_138_[i_153_];
						i_150_ += is_139_[i_153_];
						i_151_ += is_140_[i_153_];
					}
					final int i_154_ = i_152_ - 5;
					if (i_154_ >= 0) {
						i_147_ -= is_136_[i_154_];
						i_148_ -= is_137_[i_154_];
						i_149_ -= is_138_[i_154_];
						i_150_ -= is_139_[i_154_];
						i_151_ -= is_140_[i_154_];
					}
					if (i_152_ >= 0 && i_151_ > 0) {
						if ((is[i_141_ + i_152_ * anInt2089] & 0xff) == 0) {
							final int i_155_ = i_141_ + i_152_ * anInt2089;
							is_133_[i_155_] = (byte) 0;
							is_134_[i_155_] = (short) 0;
						} else {
							final int i_156_ = (i_150_ == 0 ? 0 : Class79
									.method801((byte) -11, i_148_ / i_151_,
											i_147_ * 256 / i_150_, i_149_
													/ i_151_));
							int i_157_ = (i_156_ & 0x7f) + i_135_;
							if (i_157_ < 0) {
								i_157_ = 0;
							} else if (i_157_ > 127) {
								i_157_ = 127;
							}
							final int i_158_ = ((i_156_ + i & 0xfc00)
									+ (i_156_ & 0x380) + i_157_);
							final int i_159_ = i_141_ + i_152_ * anInt2089;
							final int i_160_ = (Class221.anIntArray1665[(Class111_Sub2
									.method2117(Class98_Sub10_Sub8.method1027(
											96, i_158_, -126), -118)) & 0xffff]);
							is_133_[i_159_] = (byte) (i_160_ >> 16 & 0xff);
							is_134_[i_159_] = (short) (i_160_ & 0xffff);
						}
					}
				}
			}
		}
	}

	private static final int method3311(final d var_d, final int i,
			final int i_161_, final int i_162_) {
		final Class199 class199 = aClass32_2058.method317(4, i);
		if (class199 == null) {
			return 0;
		}
		int i_163_ = class199.anInt1542;
		if (i_163_ >= 0 && var_d.method11(i_163_, -28755).aBoolean1825) {
			i_163_ = -1;
		}
		int i_164_;
		if (class199.anInt1540 >= 0) {
			final int i_165_ = class199.anInt1540;
			int i_166_ = (i_165_ & 0x7f) + i_162_;
			if (i_166_ < 0) {
				i_166_ = 0;
			} else if (i_166_ > 127) {
				i_166_ = 127;
			}
			final int i_167_ = (i_165_ + i_161_ & 0xfc00) + (i_165_ & 0x380)
					+ i_166_;
			i_164_ = ~0xffffff
					| (Class221.anIntArray1665[(Class111_Sub2.method2117(
							Class345.method3825(96, i_167_, (byte) -21), 51)) & 0xffff]);
		} else if (i_163_ >= 0) {
			i_164_ = ~0xffffff
					| (Class221.anIntArray1665[(Class111_Sub2
							.method2117(
									Class345.method3825(
											96,
											(var_d.method11(i_163_, -28755).aShort1831),
											(byte) -21), 92)) & 0xffff]);
		} else if (class199.anInt1537 == -1) {
			i_164_ = 0;
		} else {
			final int i_168_ = class199.anInt1537;
			int i_169_ = (i_168_ & 0x7f) + i_162_;
			if (i_169_ < 0) {
				i_169_ = 0;
			} else if (i_169_ > 127) {
				i_169_ = 127;
			}
			final int i_170_ = (i_168_ + i_161_ & 0xfc00) + (i_168_ & 0x380)
					+ i_169_;
			i_164_ = ~0xffffff
					| (Class221.anIntArray1665[(Class111_Sub2.method2117(
							Class345.method3825(96, i_170_, (byte) -21), -41)) & 0xffff]);
		}
		return i_164_;
	}

	private static final Class148 method3312(final ha var_ha, final int i,
			final int i_171_, final int i_172_, final int i_173_) {
		for (Class98_Sub47 class98_sub47 = (Class98_Sub47) aClass148_2065
				.method2418(32); class98_sub47 != null; class98_sub47 = (Class98_Sub47) aClass148_2065
				.method2417(88)) {
			method3307(var_ha, class98_sub47, i, i_171_, i_172_, i_173_);
		}
		return aClass148_2065;
	}

	public static void method3313() {
		aClass32_2058 = null;
		aClass153_2055 = null;
		aClass302_2062 = null;
		aClass341_2057 = null;
		aClass335_2059 = null;
		anInterface6_2060 = null;
		aClass98_Sub46_Sub10_2056 = null;
		aClass207_2054 = null;
		aClass377_2061 = null;
		aByteArrayArrayArray2072 = null;
		aShortArray2070 = null;
		aByteArray2067 = null;
		aClass370_2066 = null;
		aClass148_2065 = null;
		anIntArray2079 = null;
		aByteArray2081 = null;
		aByteArray2080 = null;
		aShortArray2085 = null;
		aByteArray2087 = null;
		aByteArray2073 = null;
		aShortArray2076 = null;
		aByteArray2092 = null;
		aClass377_2088 = null;
		aClass218ArrayArrayArray2082 = null;
	}

	static final void method3314(final ha var_ha,
			final Class98_Sub47 class98_sub47, final Class24 class24) {
		if (class24.anIntArray265 != null) {
			final int[] is = new int[class24.anIntArray265.length];
			for (int i = 0; i < is.length / 2; i++) {
				final int i_174_ = (class24.anIntArray265[i * 2] + class98_sub47.anInt4272);
				final int i_175_ = (class24.anIntArray265[i * 2 + 1] + class98_sub47.anInt4267);
				is[i * 2] = anInt2086
						+ ((anInt2093 - anInt2086) * (i_174_ - anInt2091) / (anInt2074 - anInt2091));
				is[i * 2 + 1] = anInt2094
						- ((anInt2094 - anInt2077) * (i_175_ - anInt2090) / (anInt2083 - anInt2090));
			}
			Class136.method2270(var_ha, is, class24.anInt249);
			if (class24.anInt250 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_176_ = is[i * 2];
					int i_177_ = is[i * 2 + 1];
					int i_178_ = is[(i + 1) * 2];
					int i_179_ = is[(i + 1) * 2 + 1];
					if (i_178_ < i_176_) {
						final int i_180_ = i_176_;
						final int i_181_ = i_177_;
						i_176_ = i_178_;
						i_177_ = i_179_;
						i_178_ = i_180_;
						i_179_ = i_181_;
					} else if (i_178_ == i_176_ && i_179_ < i_177_) {
						final int i_182_ = i_177_;
						i_177_ = i_179_;
						i_179_ = i_182_;
					}
					var_ha.method1811(
							i_176_,
							i_177_,
							i_178_,
							i_179_,
							(class24.anIntArray234[(class24.aByteArray229[i] & 0xff)]),
							1, class24.anInt250, class24.anInt253,
							class24.anInt224);
				}
				int i = is[is.length - 2];
				int i_183_ = is[is.length - 1];
				int i_184_ = is[0];
				int i_185_ = is[1];
				if (i_184_ < i) {
					final int i_186_ = i;
					final int i_187_ = i_183_;
					i = i_184_;
					i_183_ = i_185_;
					i_184_ = i_186_;
					i_185_ = i_187_;
				} else if (i_184_ == i && i_185_ < i_183_) {
					final int i_188_ = i_183_;
					i_183_ = i_185_;
					i_185_ = i_188_;
				}
				var_ha.method1811(
						i,
						i_183_,
						i_184_,
						i_185_,
						(class24.anIntArray234[(class24.aByteArray229[(class24.aByteArray229.length - 1)]) & 0xff]),
						1, class24.anInt250, class24.anInt253, class24.anInt224);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					var_ha.method1789(
							is[i * 2 + 1],
							(class24.anIntArray234[(class24.aByteArray229[i] & 0xff)]),
							is[(i + 1) * 2 + 1], is[(i + 1) * 2], -10550,
							is[i * 2]);
				}
				var_ha.method1789(
						is[is.length - 1],
						(class24.anIntArray234[(class24.aByteArray229[(class24.aByteArray229.length - 1)]) & 0xff]),
						is[1], is[0], -10550, is[is.length - 2]);
			}
		}
	}

	static final Class148 method3315(final ha var_ha) {
		final int i = anInt2074 - anInt2091;
		final int i_189_ = anInt2083 - anInt2090;
		final int i_190_ = (anInt2093 - anInt2086 << 16) / i;
		final int i_191_ = (anInt2094 - anInt2077 << 16) / i_189_;
		return method3312(var_ha, i_190_, i_191_, 0, 0);
	}

	static final void method3316(final int i) {
		aClass98_Sub46_Sub10_2056 = (Class98_Sub46_Sub10) aClass377_2061
				.method3990(i, -1);
	}

	private static final void method3317(final ha var_ha, final int i,
			final int i_192_, final int i_193_, final int i_194_,
			final short[] is, final byte[] is_195_) {
		if (is != null) {
			for (int i_196_ = 0; i_196_ < is.length; i_196_++) {
				final GameObjectDefinition class352 = aClass302_2062
						.method3546(is[i_196_] & 0xffff, (byte) 119);
				final int i_197_ = class352.anInt2990;
				if (i_197_ != -1) {
					final Class9 class9 = aClass335_2059.method3766(i_197_,
							(byte) -28);
					final Class332 class332 = class9.method190(
							(class352.aBoolean2976 ? (class352.aBoolean2961)
									: false), 0,
							(class352.aBoolean3004 ? is_195_[i_196_] >> 6 & 0x3
									: 0), var_ha);
					if (class332 != null) {
						int i_198_ = i_193_ * class332.method3737() >> 2;
						int i_199_ = i_194_ * class332.method3749() >> 2;
						if (class9.aBoolean116) {
							int i_200_ = class352.sizeY;
							int i_201_ = class352.sizeX;
							if ((is_195_[i_196_] >> 6 & 0x1) == 1) {
								final int i_202_ = i_200_;
								i_200_ = i_201_;
								i_201_ = i_202_;
							}
							i_198_ = i_200_ * i_193_;
							i_199_ = i_201_ * i_194_;
						}
						if (i_198_ != 0 && i_199_ != 0) {
							if (class9.anInt115 != 0) {
								class332.method3727(i,
										i_192_ - i_199_ + i_194_, i_198_,
										i_199_, 0,
										(~0xffffff | (class9.anInt115)), 1);
							} else {
								class332.method3726(i,
										i_192_ - i_199_ + i_194_, i_198_,
										i_199_);
							}
						}
					}
				}
			}
		}
	}

	private static final void method3318(final ha var_ha, final int i,
			final int i_203_, final int i_204_, final int i_205_,
			final int i_206_, final int i_207_, final int i_208_,
			final short[] is, final byte[] is_209_, final boolean bool) {
		if (bool || i_206_ != 0 || i_207_ > 0) {
			if (i_207_ == 0) {
				var_ha.aa(i, i_203_, i_204_, i_205_, i_206_, 0);
			} else {
				final int i_210_ = i_208_ & 0x3f;
				if (i_210_ == 0 || i_204_ <= 1 || i_205_ <= 1) {
					final int i_211_ = anIntArray2079[i_207_];
					if (bool || i_211_ != 0) {
						var_ha.aa(i, i_203_, i_204_, i_205_, i_211_, 0);
					}
				} else {
					final int i_212_ = bool ? 0 : 1;
					Class276.method3287(i_208_ >> 6 & 0x3, i_206_, anInt2069,
							i, i_205_, i_210_, anIntArray2079[i_207_], var_ha,
							i_203_, i_204_, aByteArrayArrayArray2072, i_212_,
							10);
				}
			}
		}
		if (is != null) {
			int i_213_;
			if (i_204_ == 1) {
				i_213_ = i;
			} else {
				i_213_ = i + i_204_ - 1;
			}
			int i_214_;
			if (i_205_ == 1) {
				i_214_ = i_203_;
			} else {
				i_214_ = i_203_ + i_205_ - 1;
			}
			for (int i_215_ = 0; i_215_ < is.length; i_215_++) {
				final int i_216_ = is_209_[i_215_] & 0x3f;
				if (i_216_ == 0 || i_216_ == 2 || i_216_ == 3 || i_216_ == 9) {
					final GameObjectDefinition class352 = aClass302_2062
							.method3546(is[i_215_] & 0xffff, (byte) 119);
					if (class352.anInt2990 == -1) {
						int i_217_ = -3355444;
						if (class352.anInt2998 == 1) {
							i_217_ = -3407872;
						}
						final int i_218_ = is_209_[i_215_] >> 6 & 0x3;
						if (i_216_ == 0) {
							if (i_218_ == 0) {
								var_ha.P(i, i_203_, i_205_, i_217_, 0);
							} else if (i_218_ == 1) {
								var_ha.U(i, i_203_, i_204_, i_217_, 0);
							} else if (i_218_ == 2) {
								var_ha.P(i_213_, i_203_, i_205_, i_217_, 0);
							} else {
								var_ha.U(i, i_214_, i_204_, i_217_, 0);
							}
						} else if (i_216_ == 2) {
							if (i_218_ == 0) {
								var_ha.P(i, i_203_, i_205_, -1, 0);
								var_ha.U(i, i_203_, i_204_, i_217_, 0);
							} else if (i_218_ == 1) {
								var_ha.P(i_213_, i_203_, i_205_, -1, 0);
								var_ha.U(i, i_203_, i_204_, i_217_, 0);
							} else if (i_218_ == 2) {
								var_ha.P(i_213_, i_203_, i_205_, -1, 0);
								var_ha.U(i, i_214_, i_204_, i_217_, 0);
							} else {
								var_ha.P(i, i_203_, i_205_, -1, 0);
								var_ha.U(i, i_214_, i_204_, i_217_, 0);
							}
						} else if (i_216_ == 3) {
							if (i_218_ == 0) {
								var_ha.U(i, i_203_, 1, i_217_, 0);
							} else if (i_218_ == 1) {
								var_ha.U(i_213_, i_203_, 1, i_217_, 0);
							} else if (i_218_ == 2) {
								var_ha.U(i_213_, i_214_, 1, i_217_, 0);
							} else {
								var_ha.U(i, i_214_, 1, i_217_, 0);
							}
						} else if (i_216_ == 9) {
							if (i_218_ == 0 || i_218_ == 2) {
								for (int i_219_ = 0; i_219_ < i_205_; i_219_++) {
									var_ha.U(i + i_219_, i_214_ - i_219_, 1,
											i_217_, 0);
								}
							} else {
								for (int i_220_ = 0; i_220_ < i_205_; i_220_++) {
									var_ha.U(i + i_220_, i_203_ + i_220_, 1,
											i_217_, 0);
								}
							}
						}
					}
				}
			}
		}
	}

	static {
		aShortArray2070 = new short[1];
		aByteArray2067 = new byte[1];
		aClass148_2065 = new Class148();
	}
}
