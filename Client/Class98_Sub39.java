/* Class98_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub39 extends Node {
	Class246_Sub3_Sub4_Sub2_Sub1 aClass246_Sub3_Sub4_Sub2_Sub1_4187;
	static double aDouble4188;
	static float[] aFloatArray4189 = new float[4];

	public static void method1467(final boolean bool) {
		do {
			try {
				aFloatArray4189 = null;
				if (bool == true) {
					break;
				}
				aDouble4188 = 0.4390183000949001;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "pw.B(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method1468(final int i) {
		try {
			Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514.method1256(i ^ i);
			final int i_0_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
					.readBits((byte) -104, 8);
			if (i_0_ < Class150.anInt1211) {
				for (int i_1_ = i_0_; i_1_ < Class150.anInt1211; i_1_++) {
					Class246_Sub3_Sub4_Sub3.anIntArray6451[Class259.anInt1954++] = Class325.anIntArray2726[i_1_];
				}
			}
			if (Class150.anInt1211 < i_0_) {
				throw new RuntimeException("gnpov1");
			}
			Class150.anInt1211 = 0;
			for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
				final int i_3_ = Class325.anIntArray2726[i_2_];
				final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) Class260.aClass377_3254
						.method3990(i_3_, -1)).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
				final int i_4_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readBits((byte) -74, 1);
				if (i_4_ == 0) {
					Class325.anIntArray2726[Class150.anInt1211++] = i_3_;
					((Entity) class246_sub3_sub4_sub2_sub1).anInt6406 = Class201.anInt1544;
				} else {
					final int i_5_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readBits((byte) -117, 2);
					if (i_5_ == 0) {
						Class325.anIntArray2726[Class150.anInt1211++] = i_3_;
						((Entity) class246_sub3_sub4_sub2_sub1).anInt6406 = Class201.anInt1544;
						Class76_Sub11.anIntArray3796[Class65.anInt502++] = i_3_;
					} else if (i_5_ == 1) {
						Class325.anIntArray2726[Class150.anInt1211++] = i_3_;
						((Entity) class246_sub3_sub4_sub2_sub1).anInt6406 = Class201.anInt1544;
						final int i_6_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readBits((byte) -16, 3);
						class246_sub3_sub4_sub2_sub1.method3050(0, 1, i_6_);
						final int i_7_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readBits((byte) -107, 1);
						if (i_7_ == 1) {
							Class76_Sub11.anIntArray3796[Class65.anInt502++] = i_3_;
						}
					} else if (i_5_ == 2) {
						Class325.anIntArray2726[Class150.anInt1211++] = i_3_;
						((Entity) class246_sub3_sub4_sub2_sub1).anInt6406 = Class201.anInt1544;
						if (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readBits((byte) -42, 1) != 1) {
							final int i_8_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
									.readBits((byte) -36, 3);
							class246_sub3_sub4_sub2_sub1.method3050(0, 0, i_8_);
						} else {
							final int i_9_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
									.readBits((byte) -58, 3);
							class246_sub3_sub4_sub2_sub1.method3050(
									i ^ ~0x134d, 2, i_9_);
							final int i_10_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
									.readBits((byte) -45, 3);
							class246_sub3_sub4_sub2_sub1
									.method3050(0, 2, i_10_);
						}
						final int i_11_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readBits((byte) -65, 1);
						if (i_11_ == 1) {
							Class76_Sub11.anIntArray3796[Class65.anInt502++] = i_3_;
						}
					} else if (i_5_ == 3) {
						Class246_Sub3_Sub4_Sub3.anIntArray6451[Class259.anInt1954++] = i_3_;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pw.A(" + i + ')');
		}
	}

	Class98_Sub39(
			final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1) {
		try {
			aClass246_Sub3_Sub4_Sub2_Sub1_4187 = class246_sub3_sub4_sub2_sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pw.<init>("
					+ ((class246_sub3_sub4_sub2_sub1 != null) ? "{...}"
							: "null") + ')'));
		}
	}
}
