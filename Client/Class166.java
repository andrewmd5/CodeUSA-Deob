/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class166 {
	static boolean aBoolean1278 = false;
	static int anInt1279;
	static Class207 aClass207_1280;

	public Class166() {
		/* empty */
	}

	static final void method2525(final int i) {
		try {
			Class259.anInt1954 = 0;
			Class201.anInt1544++;
			Class65.anInt502 = 0;
			Class98_Sub39.method1468(-4942);
			Class341.method3810((byte) 121);
			Class21_Sub2.method273((byte) -61);
			boolean bool = false;
			for (int i_0_ = 0; (Class259.anInt1954 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
				final int i_1_ = Class246_Sub3_Sub4_Sub3.anIntArray6451[i_0_];
				final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
						.method3990(i_1_, -1));
				final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
				if (Class246_Sub3_Sub4_Sub2_Sub2.aBoolean6540
						&& Class98_Sub44.method1514(-128, i_1_)) {
					Class317.method3651((byte) -53);
				}
				if ((Class201.anInt1544 ^ 0xffffffff) != (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6406 ^ 0xffffffff)) {
					if (class246_sub3_sub4_sub2_sub1.aClass141_6504
							.method2302((byte) 117)) {
						Class98_Sub43_Sub4.method1504(
								class246_sub3_sub4_sub2_sub1, -16255);
					}
					class246_sub3_sub4_sub2_sub1.method3054(null, 1);
					class98_sub39.method942(i + 98);
					bool = true;
				}
			}
			if (bool) {
				Class98_Sub10_Sub20.anInt5640 = Class260.aClass377_3254
						.method3999((byte) -6);
				Class260.aClass377_3254.method3992(
						Class163.aClass98_Sub39Array3516, (byte) 74);
			}
			if ((((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).position) != Class65.anInt496) {
				throw new RuntimeException(
						"gnp1 pos:"
								+ (((ByteBuffer) (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514)).position)
								+ " psize:" + Class65.anInt496);
			}
			for (int i_2_ = 0; (Class150.anInt1211 ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
				if (Class260.aClass377_3254.method3990(
						Class325.anIntArray2726[i_2_], -1) == null) {
					throw new RuntimeException("gnp2 pos:" + i_2_ + " size:"
							+ Class150.anInt1211);
				}
			}
			if (-Class150.anInt1211 + Class98_Sub10_Sub20.anInt5640 != i) {
				throw new RuntimeException("gnp3 mis:"
						+ (Class98_Sub10_Sub20.anInt5640 + -Class150.anInt1211));
			}
			for (int i_3_ = 0; i_3_ < Class98_Sub10_Sub20.anInt5640; i_3_++) {
				if ((Class201.anInt1544 ^ 0xffffffff) != (((Class246_Sub3_Sub4_Sub2) (Class163.aClass98_Sub39Array3516[i_3_].aClass246_Sub3_Sub4_Sub2_Sub1_4187)).anInt6406 ^ 0xffffffff)) {
					throw new RuntimeException(
							"gnp4 uk:"
									+ (((Class246_Sub3_Sub4_Sub2) (Class163.aClass98_Sub39Array3516[i_3_].aClass246_Sub3_Sub4_Sub2_Sub1_4187)).anInt6369));
				}
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	public static void method2526(final int i) {
		do {
			try {
				aClass207_1280 = null;
				if (i == -19351) {
					break;
				}
				method2526(-23);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "l.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
