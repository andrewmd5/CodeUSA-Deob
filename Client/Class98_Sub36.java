/* Class98_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub36 extends Class98 {
	int anInt4152;
	boolean aBoolean4153;
	boolean aBoolean4154;
	boolean aBoolean4155;
	static Class348 aClass348_4156;
	Class237_Sub1 aClass237_Sub1_4157;
	boolean aBoolean4158;
	static long aLong4159 = -1L;
	int anInt4160;
	static int anInt4161;
	static int[] anIntArray4162;

	public static void method1457(final int i) {
		try {
			anIntArray4162 = null;
			if (i != -2496) {
				method1458(-13);
			}
			aClass348_4156 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pm.A(" + i + ')');
		}
	}

	static final void method1458(final int i) {
		try {
			if (Class265.aHa1974 != null) {
				if (za_Sub2.aBoolean6079) {
					Class61.method540((byte) -51);
				}
				Class98_Sub10_Sub27.aClass84_5692.method833(0);
				Class129.method2229();
				InputStream_Sub2.method124(i ^ 0x6068);
				Class48_Sub1_Sub2.method466(true);
				Class160.method2511(i ^ ~0x6545);
				Class39_Sub1.method355(i ^ 0x606a);
				if (s_Sub1.aClass346_5202 != null) {
					s_Sub1.aClass346_5202.method3827((byte) -87);
				}
				Class151_Sub7.method2466(-32346);
				Class98_Sub10_Sub15.method1050((byte) 114);
				Class176.method2582((byte) 99);
				Class266.method3235((byte) -25);
				Class118.method2173(false, 123);
				for (int i_0_ = 0; i_0_ < 2048; i_0_++) {
					final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_0_]);
					if (class246_sub3_sub4_sub2_sub2 != null) {
						for (int i_1_ = 0; ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).aClass146Array6441).length > i_1_); i_1_++) {
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).aClass146Array6441[i_1_] = null;
						}
					}
				}
				for (int i_2_ = 0; ((Class98_Sub10_Sub20.anInt5640 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)); i_2_++) {
					final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (Class163.aClass98_Sub39Array3516[i_2_].aClass246_Sub3_Sub4_Sub2_Sub1_4187);
					if (class246_sub3_sub4_sub2_sub1 != null) {
						for (int i_3_ = 0; i_3_ < (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).aClass146Array6441).length; i_3_++) {
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).aClass146Array6441[i_3_] = null;
						}
					}
				}
				Class76_Sub5.aClass111_3745 = null;
				Class266.aClass111_1986 = null;
				Class265.aHa1974.method1743(-1);
				Class265.aHa1974 = null;
			}
			if (i != -24580) {
				method1459(-123);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pm.B(" + i + ')');
		}
	}

	static final void method1459(final int i) {
		try {
			Class151_Sub9.anInt5028 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
					.readByteA(true);
			final int i_4_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
					.readByteA(true);
			final int i_5_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
					.readShortA(i ^ ~0x3e777627);
			final int i_6_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
					.readShort1((byte) -76);
			final boolean bool = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
					.readByteA(true) == 1);
			Class98_Sub10_Sub13.method1043((byte) -103);
			Class98_Sub27.method1282((byte) 8, i_4_);
			Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514.method1256(0);
			for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > -5; i_7_++) {
				for (int i_8_ = 0; i_8_ < Class165.anInt1276 >> -1040274845; i_8_++) {
					for (int i_9_ = 0; i_9_ < Class98_Sub10_Sub7.anInt5572 >> -1712093149; i_9_++) {
						final int i_10_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readBits((byte) -45, 1);
						if (i_10_ != 1) {
							Class170.anIntArrayArrayArray1311[i_7_][i_8_][i_9_] = -1;
						} else {
							Class170.anIntArrayArrayArray1311[i_7_][i_8_][i_9_] = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
									.readBits((byte) -86, 26);
						}
					}
				}
			}
			Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514.method1254((byte) 120);
			int i_11_ = ((-((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).position + Class65.anInt496) / 16);
			Class98_Sub46_Sub17.anIntArrayArray6049 = new int[i_11_][4];
			for (int i_12_ = 0; i_11_ > i_12_; i_12_++) {
				for (int i_13_ = 0; i_13_ < 4; i_13_++) {
					Class98_Sub46_Sub17.anIntArrayArray6049[i_12_][i_13_] = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readInt(-2);
				}
			}
			Class76_Sub7.anIntArray3765 = null;
			if (i != -1048016408) {
				anIntArray4162 = null;
			}
			Class377.aByteArrayArray3182 = new byte[i_11_][];
			Class105.aByteArrayArray3414 = null;
			client.aByteArrayArray3551 = new byte[i_11_][];
			GameObjectDefinitionLoader.anIntArray2517 = new int[i_11_];
			Class121.anIntArray1006 = new int[i_11_];
			anIntArray4162 = new int[i_11_];
			Class287.anIntArray2188 = new int[i_11_];
			Class377.anIntArray3178 = new int[i_11_];
			Class246_Sub3_Sub4_Sub2_Sub2.aByteArrayArray6533 = new byte[i_11_][];
			Class255.aByteArrayArray3211 = new byte[i_11_][];
			i_11_ = 0;
			for (int i_14_ = 0; i_14_ < 4; i_14_++) {
				for (int i_15_ = 0; Class165.anInt1276 >> 1588990627 > i_15_; i_15_++) {
					for (int i_16_ = 0; Class98_Sub10_Sub7.anInt5572 >> 1681357539 > i_16_; i_16_++) {
						final int i_17_ = (Class170.anIntArrayArrayArray1311[i_14_][i_15_][i_16_]);
						if ((i_17_ ^ 0xffffffff) != 0) {
							final int i_18_ = (i_17_ & 0xffe88a) >> 1970993198;
							final int i_19_ = 0x7ff & i_17_ >> -1128997053;
							int i_20_ = i_19_ / 8 + (i_18_ / 8 << -1281050872);
							for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff); i_21_++) {
								if (i_20_ == Class121.anIntArray1006[i_21_]) {
									i_20_ = -1;
									break;
								}
							}
							if ((i_20_ ^ 0xffffffff) != 0) {
								Class121.anIntArray1006[i_11_] = i_20_;
								final int i_22_ = i_20_ >> -1048016408 & 0xff;
								final int i_23_ = i_20_ & 0xff;
								Class287.anIntArray2188[i_11_] = (Class234.aClass207_1748
										.method2750((byte) -71, "m" + i_22_
												+ "_" + i_23_));
								anIntArray4162[i_11_] = (Class234.aClass207_1748
										.method2750((byte) -118, "l" + i_22_
												+ "_" + i_23_));
								GameObjectDefinitionLoader.anIntArray2517[i_11_] = (Class234.aClass207_1748
										.method2750((byte) -126, "um" + i_22_
												+ "_" + i_23_));
								Class377.anIntArray3178[i_11_] = (Class234.aClass207_1748
										.method2750((byte) -85, "ul" + i_22_
												+ "_" + i_23_));
								i_11_++;
							}
						}
					}
				}
			}
			Class251.method3170(-6547, i_5_, bool, i_6_, 11);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pm.C(" + i + ')');
		}
	}

	Class98_Sub36(final int i, final Class237_Sub1 class237_sub1,
			final int i_24_, final boolean bool) {
		try {
			anInt4152 = i_24_;
			aClass237_Sub1_4157 = class237_sub1;
			anInt4160 = i;
			aBoolean4154 = bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pm.<init>(" + i
					+ ',' + (class237_sub1 != null ? "{...}" : "null") + ','
					+ i_24_ + ',' + bool + ')'));
		}
	}

	static {
		aClass348_4156 = new Class348(7, 0, 1, 1);
		anInt4161 = 0;
	}
}
