/* Class339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class339 {
	static IncomingOpcode aClass58_2844;
	static Interface7[] anInterface7Array2845 = new Interface7[75];
	static int[][] anIntArrayArray2846;

	static final void method3783(final ha var_ha, final d var_d, final int i) {
		try {
			if (Class278.aClass98_Sub46_Sub10_2056 != null && i >= 47) {
				if (Class212.anInt1600 < 10) {
					if (!Class278.aClass207_2054.method2741(
							Class278.aClass98_Sub46_Sub10_2056.aString6017, 0)) {
						Class212.anInt1600 = (Class257.aClass207_1947
								.method2748(
										29952,
										(Class278.aClass98_Sub46_Sub10_2056.aString6017))) / 10;
						return;
					}
					Class81.method817(false);
					Class212.anInt1600 = 10;
				}
				if (Class212.anInt1600 == 10) {
					Class278.anInt2078 = (Class278.aClass98_Sub46_Sub10_2056.anInt6009 >> -91123994 << 2115773958);
					Class278.anInt2075 = (Class278.aClass98_Sub46_Sub10_2056.anInt6008 >> 1322363302 << 1884411078);
					Class278.anInt2084 = (-Class278.anInt2078 + ((Class278.aClass98_Sub46_Sub10_2056.anInt6023 >> 1885364678 << 969285766) - -64));
					Class278.anInt2089 = 64
							+ (Class278.aClass98_Sub46_Sub10_2056.anInt6016 >> 1668330822 << 910225286)
							- Class278.anInt2075;
					final int[] is = new int[3];
					int i_0_ = -1;
					int i_1_ = -1;
					if (Class278.aClass98_Sub46_Sub10_2056
							.method1573(
									((Class246_Sub3) Surface.player).aByte5088,
									is,
									-90,
									(aa_Sub2.anInt3562 + ((((Class246_Sub3) Surface.player).anInt5079) >> 219261193)),
									(((Class246_Sub3) Surface.player).anInt5084 >> -86706999)
											+ Class272.anInt2038)) {
						i_1_ = -Class278.anInt2078 + is[2];
						i_0_ = is[1] + -Class278.anInt2075;
					}
					if (Class211.aBoolean1593
							|| (i_0_ ^ 0xffffffff) > -1
							|| (Class278.anInt2089 ^ 0xffffffff) >= (i_0_ ^ 0xffffffff)
							|| (i_1_ ^ 0xffffffff) > -1
							|| ((Class278.anInt2084 ^ 0xffffffff) >= (i_1_ ^ 0xffffffff))) {
						if (RuntimeException_Sub1.anInt3205 != -1
								&& (Node.anInt835 ^ 0xffffffff) != 0) {
							Class278.aClass98_Sub46_Sub10_2056.method1570(
									(byte) 100, Node.anInt835, is,
									RuntimeException_Sub1.anInt3205);
							if (is != null) {
								Class42_Sub4.anInt5371 = is[1]
										- Class278.anInt2075;
								Class98_Sub40.anInt4197 = is[2]
										- Class278.anInt2078;
							}
							RuntimeException_Sub1.anInt3205 = Node.anInt835 = -1;
							Class211.aBoolean1593 = false;
						} else {
							Class278.aClass98_Sub46_Sub10_2056
									.method1570(
											(byte) 117,
											(Class278.aClass98_Sub46_Sub10_2056.anInt6006) & 0x3fff,
											is,
											((Class278.aClass98_Sub46_Sub10_2056.anInt6006) & 0xfffc780) >> 809556622);
							Class98_Sub40.anInt4197 = -Class278.anInt2078
									+ is[2];
							Class42_Sub4.anInt5371 = -Class278.anInt2075
									+ is[1];
						}
					} else {
						i_1_ += -5 + (int) (Math.random() * 10.0);
						i_0_ += -5 + (int) (10.0 * Math.random());
						Class42_Sub4.anInt5371 = i_0_;
						Class98_Sub40.anInt4197 = i_1_;
					}
					if (Class278.aClass98_Sub46_Sub10_2056.anInt6007 != 37) {
						if (Class278.aClass98_Sub46_Sub10_2056.anInt6007 != 50) {
							if ((Class278.aClass98_Sub46_Sub10_2056.anInt6007 ^ 0xffffffff) != -76) {
								if (((Class278.aClass98_Sub46_Sub10_2056.anInt6007) ^ 0xffffffff) == -101) {
									Class278.aFloat2068 = Class278.aFloat2064 = 8.0F;
								} else if ((Class278.aClass98_Sub46_Sub10_2056.anInt6007) == 200) {
									Class278.aFloat2068 = Class278.aFloat2064 = 16.0F;
								} else {
									Class278.aFloat2068 = Class278.aFloat2064 = 8.0F;
								}
							} else {
								Class278.aFloat2068 = Class278.aFloat2064 = 6.0F;
							}
						} else {
							Class278.aFloat2068 = Class278.aFloat2064 = 4.0F;
						}
					} else {
						Class278.aFloat2068 = Class278.aFloat2064 = 3.0F;
					}
					Class278.anInt2069 = (int) Class278.aFloat2064 >> 898065889;
					Class278.aByteArrayArrayArray2072 = Class287_Sub2
							.method3392(Class278.anInt2069, (byte) 126);
					aa_Sub1.method155(-1);
					Class278.method3297();
					Class8.aClass148_110 = new Class148();
					Class278.anInt2063 += -2 + (int) (Math.random() * 5.0);
					if (Class278.anInt2063 < -8) {
						Class278.anInt2063 = -8;
					}
					Class278.anInt2071 += (int) (Math.random() * 5.0) + -2;
					if (Class278.anInt2063 > 8) {
						Class278.anInt2063 = 8;
					}
					if ((Class278.anInt2071 ^ 0xffffffff) > 15) {
						Class278.anInt2071 = -16;
					}
					if ((Class278.anInt2071 ^ 0xffffffff) < -17) {
						Class278.anInt2071 = 16;
					}
					Class278.method3304(var_d,
							(Class278.anInt2063 >> -2097260862 << 776330122),
							Class278.anInt2071 >> 386662625);
					Class278.aClass341_2057.method3809(256, -30502, 1024);
					Class278.aClass335_2059.method3771(119, 256, 256);
					Class278.aClass302_2062.method3550(-129, 4096);
					Class17.aClass198_205.method2679(256, (byte) -90);
					Class212.anInt1600 = 20;
				} else if ((Class212.anInt1600 ^ 0xffffffff) == -21) {
					Class257.method3201((byte) 86, true);
					Class278.method3305(var_ha, Class278.anInt2063,
							Class278.anInt2071);
					Class212.anInt1600 = 60;
					Class257.method3201((byte) 85, true);
					Class32.method316(false);
				} else if ((Class212.anInt1600 ^ 0xffffffff) == -61) {
					if (!Class278.aClass207_2054
							.method2728(
									(Class278.aClass98_Sub46_Sub10_2056.aString6017 + "_staticelements"),
									0)) {
						Class278.aClass370_2066 = new Class370(0);
					} else {
						if (!Class278.aClass207_2054
								.method2741(
										(Class278.aClass98_Sub46_Sub10_2056.aString6017 + "_staticelements"),
										0)) {
							return;
						}
						Class278.aClass370_2066 = (Class52
								.method491(
										77,
										Class79.aBoolean602,
										Class278.aClass207_2054,
										(Class278.aClass98_Sub46_Sub10_2056.aString6017)
												+ "_staticelements"));
					}
					Class278.method3302();
					Class212.anInt1600 = 70;
					Class257.method3201((byte) 65, true);
					Class32.method316(false);
				} else if (Class212.anInt1600 == 70) {
					Class339_Sub1.aClass326_5315 = new Class326(var_ha, 11,
							true, Class42_Sub3.aCanvas5361);
					Class212.anInt1600 = 73;
					Class257.method3201((byte) 80, true);
					Class32.method316(false);
				} else if ((Class212.anInt1600 ^ 0xffffffff) == -74) {
					Class77_Sub1.aClass326_3805 = new Class326(var_ha, 12,
							true, Class42_Sub3.aCanvas5361);
					Class212.anInt1600 = 76;
					Class257.method3201((byte) 46, true);
					Class32.method316(false);
				} else if (Class212.anInt1600 == 76) {
					Class339_Sub1.aClass326_5308 = new Class326(var_ha, 14,
							true, Class42_Sub3.aCanvas5361);
					Class212.anInt1600 = 79;
					Class257.method3201((byte) 96, true);
					Class32.method316(false);
				} else if ((Class212.anInt1600 ^ 0xffffffff) == -80) {
					Class137.aClass326_1080 = new Class326(var_ha, 17, true,
							Class42_Sub3.aCanvas5361);
					Class212.anInt1600 = 82;
					Class257.method3201((byte) 94, true);
					Class32.method316(false);
				} else if (Class212.anInt1600 == 82) {
					Class151_Sub7.aClass326_5009 = new Class326(var_ha, 19,
							true, Class42_Sub3.aCanvas5361);
					Class212.anInt1600 = 85;
					Class257.method3201((byte) 49, true);
					Class32.method316(false);
				} else if (Class212.anInt1600 == 85) {
					Class271.aClass326_2033 = new Class326(var_ha, 22, true,
							Class42_Sub3.aCanvas5361);
					Class212.anInt1600 = 88;
					Class257.method3201((byte) 104, true);
					Class32.method316(false);
				} else if ((Class212.anInt1600 ^ 0xffffffff) == -89) {
					Class224.aClass326_1686 = new Class326(var_ha, 26, true,
							Class42_Sub3.aCanvas5361);
					Class212.anInt1600 = 91;
					Class257.method3201((byte) 60, true);
					Class32.method316(false);
				} else {
					Class260.aClass326_3263 = new Class326(var_ha, 30, true,
							Class42_Sub3.aCanvas5361);
					Class212.anInt1600 = 100;
					Class257.method3201((byte) 62, true);
					Class32.method316(false);
					System.gc();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("um.G("
					+ (var_ha != null ? "{...}" : "null") + ','
					+ (var_d != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	abstract ReferenceTable method3784(byte i);

	public Class339() {
		/* empty */
	}

	abstract void method3785(int i, boolean bool);

	abstract byte[] method3786(int i, int i_2_);

	public static void method3787(final byte i) {
		try {
			if (i == -69) {
				anInterface7Array2845 = null;
				anIntArrayArray2846 = null;
				aClass58_2844 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "um.C(" + i + ')');
		}
	}

	static final void method3788(final int i, final int i_3_, final int i_4_,
			final int i_5_, final byte i_6_, final int i_7_, final int i_8_,
			final int i_9_, final int i_10_, final int i_11_) {
		try {
			if (i_5_ != i || (i_10_ ^ 0xffffffff) != (i_11_ ^ 0xffffffff)
					|| i_8_ != i_7_
					|| (i_9_ ^ 0xffffffff) != (i_4_ ^ 0xffffffff)) {
				int i_12_ = i;
				int i_13_ = i_10_;
				final int i_14_ = i * 3;
				final int i_15_ = i_10_ * 3;
				final int i_16_ = 3 * i_5_;
				final int i_17_ = i_11_ * 3;
				final int i_18_ = 3 * i_8_;
				final int i_19_ = i_4_ * 3;
				final int i_20_ = i_16_ + i_7_ + (-i_18_ - i);
				final int i_21_ = i_9_ + (-i_19_ + (i_17_ - i_10_));
				final int i_22_ = i_18_ + (-i_16_ - (i_16_ + -i_14_));
				final int i_23_ = -i_17_ + (-i_17_ + (i_19_ - -i_15_));
				final int i_24_ = i_16_ + -i_14_;
				final int i_25_ = i_17_ + -i_15_;
				for (int i_26_ = 128; (i_26_ ^ 0xffffffff) >= -4097; i_26_ += 128) {
					final int i_27_ = i_26_ * i_26_ >> 671351852;
					final int i_28_ = i_26_ * i_27_ >> 962258476;
					final int i_29_ = i_20_ * i_28_;
					final int i_30_ = i_28_ * i_21_;
					final int i_31_ = i_27_ * i_22_;
					final int i_32_ = i_23_ * i_27_;
					final int i_33_ = i_26_ * i_24_;
					final int i_34_ = i_25_ * i_26_;
					final int i_35_ = i
							- -(i_29_ - (-i_31_ - i_33_) >> -1199794356);
					final int i_36_ = (i_34_ + (i_30_ + i_32_) >> 962061708)
							+ i_10_;
					InputStream_Sub2.method125(i_35_, i_3_, i_36_, i_13_,
							i_12_, 21597);
					i_13_ = i_36_;
					i_12_ = i_35_;
				}
			} else {
				InputStream_Sub2.method125(i_7_, i_3_, i_9_, i_10_, i, 21597);
			}
			if (i_6_ != -67) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("um.F(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ','
							+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ','
							+ i_10_ + ',' + i_11_ + ')'));
		}
	}

	static final void method3789(final int i) {
		try {
			if (Class308.aClass98_Sub46_Sub9_2583 != null) {
				Class308.aClass98_Sub46_Sub9_2583 = null;
				if (i != 70) {
					method3788(-45, -2, -88, -42, (byte) -67, 70, -12, -2, 77,
							14);
				}
				Class246_Sub3_Sub4_Sub3.method3071(
						(Class98_Sub43_Sub4.anInt5938), -1, Class5.anInt3439,
						Class282.anInt2128, Class163.anInt3518);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "um.E(" + i + ')');
		}
	}

	abstract int method3790(int i, byte i_37_);

	static {
		aClass58_2844 = new IncomingOpcode(74, 11);
		anIntArrayArray2846 = new int[128][128];
	}
}
