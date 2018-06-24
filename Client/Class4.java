/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class4 {
	static boolean aBoolean79 = false;
	static Class113 aClass113_80;
	static int anInt81 = 0;
	static Class348 aClass348_82;
	static int[] anIntArray83;
	static boolean aBoolean84;
	static Class301 aClass301_85;
	static Class279 aClass279_86;

	static final void method173(int i, int i_0_, int i_1_, Class293 class293,
			aa var_aa, int i_2_, byte i_3_, Class332 class332) {
		try {
			if (class332 != null) {
				int i_4_;
				do {
					if (Class98_Sub46_Sub20_Sub2.anInt6319 != 4) {
						i_4_ = ((int) Class98_Sub22_Sub2.aFloat5794 + Class204.anInt1553) & 0x3fff;
						if (!client.aBoolean3553)
							break;
					}
					i_4_ = (int) Class98_Sub22_Sub2.aFloat5794 & 0x3fff;
				} while (false);
				int i_5_ = 10 + Math.max(((Class293) class293).anInt2311 / 2,
						((Class293) class293).anInt2258 / 2);
				int i_6_ = i_2_ * i_2_ - -(i_0_ * i_0_);
				if ((i_5_ * i_5_ ^ 0xffffffff) <= (i_6_ ^ 0xffffffff)) {
					int i_7_ = Class284_Sub2_Sub2.anIntArray6200[i_4_];
					if (i_3_ != -24)
						aClass348_82 = null;
					int i_8_ = Class284_Sub2_Sub2.anIntArray6202[i_4_];
					if ((Class98_Sub46_Sub20_Sub2.anInt6319 ^ 0xffffffff) != -5) {
						i_7_ = 256 * i_7_ / (256 + Class151.anInt1213);
						i_8_ = 256 * i_8_ / (256 + Class151.anInt1213);
					}
					int i_9_ = i_7_ * i_0_ - -(i_8_ * i_2_) >> -1366947250;
					int i_10_ = i_0_ * i_8_ + -(i_2_ * i_7_) >> -1991891442;
					class332.method3729(
							i_9_
									+ (((Class293) class293).anInt2311 / 2
											+ i_1_ - class332.method3737() / 2),
							-i_10_
									+ (((Class293) class293).anInt2258 / 2 + i + -(class332
											.method3749() / 2)), var_aa, i_1_,
							i);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, ("aea.C(" + i + ',' + i_0_
							+ ',' + i_1_ + ','
							+ (class293 != null ? "{...}" : "null") + ','
							+ (var_aa != null ? "{...}" : "null") + ',' + i_2_
							+ ',' + i_3_ + ','
							+ (class332 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method174(byte i) {
		try {
			if (Class64_Sub29.aClass196_3720 != Class98_Sub43_Sub2.aClass196_5908) {
				if (i != 99)
					method174((byte) -1);
				try {
					Class203.method2704("tbrefresh", Class315.aClient3529,
							-26978);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "aea.A(" + i + ')');
		}
	}

	public static void method175(int i) {
		try {
			if (i != 10)
				aClass301_85 = null;
			aClass348_82 = null;
			aClass301_85 = null;
			aClass113_80 = null;
			anIntArray83 = null;
			aClass279_86 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "aea.B(" + i + ')');
		}
	}

	static {
		aClass113_80 = new Class113(8, 1);
		aClass348_82 = new Class348(2, 4, 4, 0);
		anIntArray83 = new int[1];
		aClass279_86 = null;
	}
}
