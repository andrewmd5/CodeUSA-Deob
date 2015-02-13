/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class251 {
	static int anInt1916;
	int anInt1917;
	int anInt1918;
	int anInt1919;
	int anInt1920;
	static IncomingOpcode aClass58_1921 = new IncomingOpcode(4, 6);

	public static void method3169(final byte i) {
		try {
			aClass58_1921 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pn.A(" + i + ')');
		}
	}

	public Class251() {
		/* empty */
	}

	static final void method3170(final int i, final int i_1_,
			final boolean bool, final int i_2_, final int i_3_) {
		try {
			if (bool
					|| i_2_ != Class160.anInt1258
					|| (i_1_ ^ 0xffffffff) != (Class275.anInt2047 ^ 0xffffffff)
					|| ((Class43.anInt377 ^ 0xffffffff) != (Class115.anInt963 ^ 0xffffffff) && (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4076
							.method564((byte) 123) ^ 0xffffffff) != -2)) {
				Class160.anInt1258 = i_2_;
				Class115.anInt963 = Class43.anInt377;
				Class275.anInt2047 = i_1_;
				if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4076
						.method564((byte) 123) == 1) {
					Class115.anInt963 = 0;
				}
				Class61.method538(i_3_, false);
				Class246_Sub2.method2972(-77,
						Class98_Sub46_Sub10.aClass197_6019,
						Class195.aClass43_1499, true, Class265.aHa1974,
						Class309.aClass309_2598.method3615(Class374.anInt3159,
								(byte) 25));
				final int i_4_ = Class272.anInt2038;
				Class272.anInt2038 = (Class160.anInt1258 - (Class165.anInt1276 >> -1323929948)) * 8;
				final int i_5_ = aa_Sub2.anInt3562;
				aa_Sub2.anInt3562 = (-(Class98_Sub10_Sub7.anInt5572 >> 624271236) + Class275.anInt2047) * 8;
				Class98_Sub40.aClass98_Sub46_Sub10_4195 = Class278.method3303(
						Class160.anInt1258 * 8, Class275.anInt2047 * 8);
				Class64_Sub23.aClass370_3707 = null;
				final int i_6_ = -i_4_ + Class272.anInt2038;
				final int i_7_ = -i_5_ + aa_Sub2.anInt3562;
				if ((i_3_ ^ 0xffffffff) == -12) {
					for (int i_8_ = 0; ((i_8_ ^ 0xffffffff) > (Class98_Sub10_Sub20.anInt5640 ^ 0xffffffff)); i_8_++) {
						final Class98_Sub39 class98_sub39 = Class163.aClass98_Sub39Array3516[i_8_];
						if (class98_sub39 != null) {
							final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
							for (int i_9_ = 0; i_9_ < 10; i_9_++) {
								((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6437[i_9_] -= i_6_;
								((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6438[i_9_] -= i_7_;
							}
							((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5079 -= i_7_ * 512;
							((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5084 -= i_6_ * 512;
						}
					}
				} else {
					Class150.anInt1211 = 0;
					boolean bool_10_ = false;
					final int i_11_ = (-1 + Class165.anInt1276) * 512;
					final int i_12_ = (-1 + Class98_Sub10_Sub7.anInt5572) * 512;
					for (int i_13_ = 0; Class98_Sub10_Sub20.anInt5640 > i_13_; i_13_++) {
						final Class98_Sub39 class98_sub39 = Class163.aClass98_Sub39Array3516[i_13_];
						if (class98_sub39 != null) {
							final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
							((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5084 -= 512 * i_6_;
							((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5079 -= i_7_ * 512;
							if ((((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5084 ^ 0xffffffff) > -1
									|| (((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5084 ^ 0xffffffff) < (i_11_ ^ 0xffffffff)
									|| (((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5079 ^ 0xffffffff) > -1
									|| ((i_12_ ^ 0xffffffff) > (((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5079 ^ 0xffffffff))) {
								class246_sub3_sub4_sub2_sub1
										.method3054(null, 1);
								class98_sub39.method942(113);
								bool_10_ = true;
							} else {
								boolean bool_14_ = true;
								for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -11; i_15_++) {
									((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6437[i_15_] -= i_6_;
									((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6438[i_15_] -= i_7_;
									if ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6437[i_15_]) < 0
											|| (Class165.anInt1276 <= (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6437[i_15_]))
											|| ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6438[i_15_]) ^ 0xffffffff) > -1
											|| ((Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff) >= ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6438[i_15_]) ^ 0xffffffff))) {
										bool_14_ = false;
									}
								}
								if (!bool_14_) {
									class246_sub3_sub4_sub2_sub1.method3054(
											null, 1);
									class98_sub39.method942(97);
									bool_10_ = true;
								} else {
									Class325.anIntArray2726[Class150.anInt1211++] = (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6369);
								}
							}
						}
					}
					if (bool_10_) {
						Class98_Sub10_Sub20.anInt5640 = Class260.aClass377_3254
								.method3999((byte) -6);
						Class260.aClass377_3254.method3992(
								Class163.aClass98_Sub39Array3516, (byte) 74);
					}
				}
				for (int i_16_ = 0; i_16_ < 2048; i_16_++) {
					final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_16_]);
					if (class246_sub3_sub4_sub2_sub2 != null) {
						for (int i_17_ = 0; i_17_ < 10; i_17_++) {
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6437[i_17_] -= i_6_;
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6438[i_17_] -= i_7_;
						}
						((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5079 -= 512 * i_7_;
						((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5084 -= 512 * i_6_;
					}
				}
				if (i == -6547) {
					final Class36[] class36s = Class104.aClass36Array903;
					for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > (class36s.length ^ 0xffffffff); i_18_++) {
						final Class36 class36 = class36s[i_18_];
						if (class36 != null) {
							class36.anInt338 -= i_6_ * 512;
							class36.anInt347 -= 512 * i_7_;
						}
					}
					for (Class98_Sub33 class98_sub33 = ((Class98_Sub33) Class191.aClass148_1478
							.method2418(32)); class98_sub33 != null; class98_sub33 = ((Class98_Sub33) Class191.aClass148_1478
							.method2417(88))) {
						class98_sub33.anInt4112 -= i_6_;
						class98_sub33.anInt4113 -= i_7_;
						if (Class151_Sub9.anInt5028 != 4
								&& ((class98_sub33.anInt4112 ^ 0xffffffff) > -1
										|| (class98_sub33.anInt4113 < 0)
										|| ((class98_sub33.anInt4112 ^ 0xffffffff) <= (Class165.anInt1276 ^ 0xffffffff)) || (Class98_Sub10_Sub7.anInt5572 <= (class98_sub33.anInt4113)))) {
							class98_sub33.method942(83);
						}
					}
					for (Class98_Sub33 class98_sub33 = ((Class98_Sub33) Class98_Sub11.aClass148_3866
							.method2418(32)); class98_sub33 != null; class98_sub33 = (Class98_Sub33) Class98_Sub11.aClass148_3866
							.method2417(116)) {
						class98_sub33.anInt4113 -= i_7_;
						class98_sub33.anInt4112 -= i_6_;
						if (Class151_Sub9.anInt5028 != 4
								&& (class98_sub33.anInt4112 < 0
										|| (class98_sub33.anInt4113 < 0)
										|| ((Class165.anInt1276 ^ 0xffffffff) >= ((class98_sub33.anInt4112) ^ 0xffffffff)) || (Class98_Sub10_Sub7.anInt5572 <= (class98_sub33.anInt4113)))) {
							class98_sub33.method942(i + 6603);
						}
					}
					if (Class151_Sub9.anInt5028 != 4) {
						for (Class98_Sub45 class98_sub45 = ((Class98_Sub45) Class146.aClass377_1180
								.method3998(101)); class98_sub45 != null; class98_sub45 = (Class98_Sub45) Class146.aClass377_1180
								.method3995(i + 6546)) {
							final int i_19_ = (int) (((Class98) class98_sub45).aLong832 & 0x3fffL);
							final int i_20_ = -Class272.anInt2038 + i_19_;
							final int i_21_ = (int) ((((Class98) class98_sub45).aLong832 >> -937625842) & 0x3fffL);
							final int i_22_ = i_21_ + -aa_Sub2.anInt3562;
							if ((i_20_ ^ 0xffffffff) > -1 || i_22_ < 0
									|| Class165.anInt1276 <= i_20_
									|| Class98_Sub10_Sub7.anInt5572 <= i_22_) {
								class98_sub45.method942(61);
							}
						}
					}
					if ((Class269.anInt2024 ^ 0xffffffff) != -1) {
						Class246_Sub3_Sub1_Sub2.anInt6251 -= i_7_;
						Class269.anInt2024 -= i_6_;
					}
					Class220.method2820((byte) 126);
					if ((i_3_ ^ 0xffffffff) != -12) {
						Class98_Sub10_Sub21.anInt5643 -= i_7_;
						Exception_Sub1.anInt44 -= i_6_;
						Class363.anInt3098 -= i_6_;
						Class98_Sub15.anInt3915 -= i_7_;
						Class134.anInt3461 -= i_7_ * 512;
						Class98_Sub46_Sub10.anInt6020 -= 512 * i_6_;
						if (Math.abs(i_6_) > Class165.anInt1276
								|| Math.abs(i_7_) > Class98_Sub10_Sub7.anInt5572) {
							Class374.method3980((byte) 124);
						}
					} else if (Class98_Sub46_Sub20_Sub2.anInt6319 == 4) {
						Class224_Sub3_Sub1.anInt6147 -= i_7_ * 512;
						Class135.anInt1051 -= 512 * i_7_;
						Class201.anInt1545 -= 512 * i_6_;
						Class98_Sub46_Sub2_Sub2.anInt6295 -= i_6_ * 512;
					} else {
						Class116.anInt967 = Class64_Sub26.anInt3712 = -1;
						Class98_Sub46_Sub20_Sub2.anInt6319 = 1;
					}
					Class64_Sub18.method622((byte) -38);
					InputStream_Sub2.method124(i + 6456);
					Class98_Sub10_Sub11.aClass148_5596.method2422((byte) 47);
					Class280.aClass148_2108.method2422((byte) 47);
					Class64_Sub20.aClass218_3694.method2802(i + 6435);
					Class98_Sub20.method1171(i + 6547);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pn.B(" + i + ','
					+ i_1_ + ',' + bool + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method3171(final String string, final int i,
			final String string_23_, final int i_24_) {
		try {
			if (i != -17877) {
				anInt1916 = -7;
			}
			Class146_Sub2.anInt4855 = i_24_;
			Class98_Sub46_Sub20_Sub2.anInt6317 = 2;
			Class342.finalLogin(false, string_23_, i + 17782, string);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("pn.C(" + (string != null ? "{...}" : "null") + ',' + i
							+ ',' + (string_23_ != null ? "{...}" : "null")
							+ ',' + i_24_ + ')'));
		}
	}
}
