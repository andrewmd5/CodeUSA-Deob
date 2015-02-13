/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class129 {
	static int anInt1026 = 0;
	static int[] anIntArray1027 = { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	static final synchronized byte[] method2225(final boolean bool, final int i) {
		try {
			if ((i ^ 0xffffffff) == -101 && Class69_Sub1.anInt5329 > 0) {
				final byte[] is = Class157.aByteArrayArray1248[--Class69_Sub1.anInt5329];
				Class157.aByteArrayArray1248[Class69_Sub1.anInt5329] = null;
				return is;
			}
			if (bool != false) {
				anIntArray1027 = null;
			}
			if (i == 5000 && SurfaceSkin.anInt336 > 0) {
				final byte[] is = Class366.aByteArrayArray3119[--SurfaceSkin.anInt336];
				Class366.aByteArrayArray3119[SurfaceSkin.anInt336] = null;
				return is;
			}
			if ((i ^ 0xffffffff) == -30001 && Class10.anInt119 > 0) {
				final byte[] is = Class64_Sub11.aByteArrayArray3670[--Class10.anInt119];
				Class64_Sub11.aByteArrayArray3670[Class10.anInt119] = null;
				return is;
			}
			if (Class190.aByteArrayArrayArray1468 != null) {
				for (int i_0_ = 0; Class111_Sub1.anIntArray4681.length > i_0_; i_0_++) {
					if (i == Class111_Sub1.anIntArray4681[i_0_]
							&& (Class98_Sub46_Sub13_Sub1.anIntArray6308[i_0_] ^ 0xffffffff) < -1) {
						final byte[] is = (Class190.aByteArrayArrayArray1468[i_0_][--Class98_Sub46_Sub13_Sub1.anIntArray6308[i_0_]]);
						Class190.aByteArrayArrayArray1468[i_0_][Class98_Sub46_Sub13_Sub1.anIntArray6308[i_0_]] = null;
						return is;
					}
				}
			}
			return new byte[i];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "io.D(" + bool
					+ ',' + i + ')');
		}
	}

	public static void method2226(final byte i) {
		try {
			anIntArray1027 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "io.C(" + i + ')');
		}
	}

	static final void method2227(final Class246_Sub3 class246_sub3) {
		if (class246_sub3 != null) {
			for (int i = 0; i < 2; i++) {
				Class246_Sub3 class246_sub3_2_ = null;
				for (Class246_Sub3 class246_sub3_3_ = Class379.aClass246_Sub3Array3198[i]; class246_sub3_3_ != null; class246_sub3_3_ = (class246_sub3_3_.aClass246_Sub3_5090)) {
					if (class246_sub3_3_ == class246_sub3) {
						if (class246_sub3_2_ != null) {
							class246_sub3_2_.aClass246_Sub3_5090 = (class246_sub3_3_.aClass246_Sub3_5090);
						} else {
							Class379.aClass246_Sub3Array3198[i] = (class246_sub3_3_.aClass246_Sub3_5090);
						}
						Class358.aBoolean3033 = true;
						return;
					}
					class246_sub3_2_ = class246_sub3_3_;
				}
				class246_sub3_2_ = null;
				for (Class246_Sub3 class246_sub3_4_ = Class359.aClass246_Sub3Array3056[i]; class246_sub3_4_ != null; class246_sub3_4_ = (class246_sub3_4_.aClass246_Sub3_5090)) {
					if (class246_sub3_4_ == class246_sub3) {
						if (class246_sub3_2_ != null) {
							class246_sub3_2_.aClass246_Sub3_5090 = (class246_sub3_4_.aClass246_Sub3_5090);
						} else {
							Class359.aClass246_Sub3Array3056[i] = (class246_sub3_4_.aClass246_Sub3_5090);
						}
						Class358.aBoolean3033 = true;
						return;
					}
					class246_sub3_2_ = class246_sub3_4_;
				}
				class246_sub3_2_ = null;
				for (Class246_Sub3 class246_sub3_5_ = Class130.aClass246_Sub3Array1029[i]; class246_sub3_5_ != null; class246_sub3_5_ = (class246_sub3_5_.aClass246_Sub3_5090)) {
					if (class246_sub3_5_ == class246_sub3) {
						if (class246_sub3_2_ != null) {
							class246_sub3_2_.aClass246_Sub3_5090 = (class246_sub3_5_.aClass246_Sub3_5090);
						} else {
							Class130.aClass246_Sub3Array1029[i] = (class246_sub3_5_.aClass246_Sub3_5090);
						}
						Class358.aBoolean3033 = true;
						return;
					}
					class246_sub3_2_ = class246_sub3_5_;
				}
			}
		}
	}

	static final synchronized void method2228(final byte i, final byte[] is) {
		do {
			try {
				if (i <= 61) {
					anIntArray1027 = null;
				}
				if (is.length == 100 && Class69_Sub1.anInt5329 < 1000) {
					Class157.aByteArrayArray1248[Class69_Sub1.anInt5329++] = is;
				} else if (is.length == 5000 && SurfaceSkin.anInt336 < 250) {
					Class366.aByteArrayArray3119[SurfaceSkin.anInt336++] = is;
				} else if ((is.length ^ 0xffffffff) == -30001
						&& (Class10.anInt119 ^ 0xffffffff) > -51) {
					Class64_Sub11.aByteArrayArray3670[Class10.anInt119++] = is;
				} else {
					if (Class190.aByteArrayArrayArray1468 == null) {
						break;
					}
					for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (Class111_Sub1.anIntArray4681.length ^ 0xffffffff)); i_6_++) {
						if (Class111_Sub1.anIntArray4681[i_6_] == is.length
								&& ((Class98_Sub46_Sub13_Sub1.anIntArray6308[i_6_] ^ 0xffffffff) > ((Class190.aByteArrayArrayArray1468[i_6_]).length ^ 0xffffffff))) {
							Class190.aByteArrayArrayArray1468[i_6_][Class98_Sub46_Sub13_Sub1.anIntArray6308[i_6_]++] = is;
							break;
						}
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("io.A(" + i
						+ ',' + (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method2229() {
		if (Class246_Sub2.aClass172ArrayArrayArray5077 != null) {
			for (int i = 0; i < Class246_Sub2.aClass172ArrayArrayArray5077.length; i++) {
				for (int i_7_ = 0; i_7_ < Class366.anInt3112; i_7_++) {
					for (int i_8_ = 0; i_8_ < Class64_Sub9.anInt3662; i_8_++) {
						if ((Class246_Sub2.aClass172ArrayArrayArray5077[i][i_7_][i_8_]) != null) {
							Class246_Sub2.aClass172ArrayArrayArray5077[i][i_7_][i_8_]
									.method2544(6730);
						}
						Class246_Sub2.aClass172ArrayArrayArray5077[i][i_7_][i_8_] = null;
					}
				}
			}
		}
		Class246_Sub2.aClass172ArrayArrayArray5077 = null;
		Class98_Sub46_Sub2_Sub2.aSArray6298 = null;
		if (Class252.aClass172ArrayArrayArray1927 != null) {
			for (int i = 0; i < Class252.aClass172ArrayArrayArray1927.length; i++) {
				for (int i_9_ = 0; i_9_ < Class366.anInt3112; i_9_++) {
					for (int i_10_ = 0; i_10_ < Class64_Sub9.anInt3662; i_10_++) {
						if ((Class252.aClass172ArrayArrayArray1927[i][i_9_][i_10_]) != null) {
							Class252.aClass172ArrayArrayArray1927[i][i_9_][i_10_]
									.method2544(6730);
						}
						Class252.aClass172ArrayArrayArray1927[i][i_9_][i_10_] = null;
					}
				}
			}
		}
		Class252.aClass172ArrayArrayArray1927 = null;
		Class81.aSArray618 = null;
		Class98_Sub46_Sub1.aClass172ArrayArrayArray5948 = null;
		Class78.aSArray594 = null;
		Class74.aBooleanArrayArray551 = null;
		Class319.aBooleanArrayArray2702 = null;
		Class347.anIntArray2906 = null;
		Class34.aBooleanArrayArrayArray325 = null;
		Class64_Sub12.aBooleanArrayArrayArray3673 = null;
		Class64_Sub20.method633(0);
		if (Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273 != null) {
			for (int i = 0; i < Class347.anInt2907; i++) {
				Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273[i] = null;
			}
			Class347.anInt2907 = 0;
		}
		Class379.aClass246_Sub3Array3198 = null;
		Class359.aClass246_Sub3Array3056 = null;
		Class130.aClass246_Sub3Array1029 = null;
		if (Class32.aClass246_Sub3Array307 != null) {
			for (int i = 0; i < Class32.aClass246_Sub3Array307.length; i++) {
				Class32.aClass246_Sub3Array307[i] = null;
			}
			GameObjectDefinitionLoader.anInt2523 = 0;
		}
		if (Class246_Sub4_Sub2.aClass246_Sub3Array6173 != null) {
			for (int i = 0; i < Class246_Sub4_Sub2.aClass246_Sub3Array6173.length; i++) {
				Class246_Sub4_Sub2.aClass246_Sub3Array6173[i] = null;
			}
			Class353.anInt3009 = 0;
		}
		if (Class98_Sub10_Sub31.aClass1Array5717 != null) {
			for (int i = 0; i < Class226.anInt1705; i++) {
				Class98_Sub10_Sub31.aClass1Array5717[i] = null;
			}
			for (int i = 0; i < Class364.anInt3103; i++) {
				for (int i_11_ = 0; i_11_ < Class366.anInt3112; i_11_++) {
					for (int i_12_ = 0; i_12_ < Class64_Sub9.anInt3662; i_12_++) {
						Class373_Sub3.aLongArrayArrayArray5476[i][i_11_][i_12_] = 0L;
					}
				}
			}
			Class226.anInt1705 = 0;
		}
		Class160.method2511(1350);
		Class98_Sub10_Sub27.aClass84_5692 = Class98_Sub10_Sub27.aClass84_5693;
		Class98_Sub10_Sub27.aClass84_5692.method833(0);
		Class299_Sub2.aByteArrayArray5291 = null;
		Class40.anIntArrayArray367 = null;
		Class304.aShortArrayArray2534 = null;
		if (Class98_Sub46_Sub5.aClass174Array5970 != null) {
			Class249.method3162();
			Class98_Sub10_Sub30.aHa5709.method1783(1);
			Class98_Sub10_Sub30.aHa5709.method1807(0);
		}
		if (Class98_Sub43_Sub3.aClass245Array5922 != null) {
			Class98_Sub43_Sub3.aClass245Array5922 = null;
		}
		Class98_Sub10_Sub30.aHa5709 = null;
	}
}
