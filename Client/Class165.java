/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class165 {
	static int anInt1276 = 104;
	static int[] anIntArray1277 = new int[1];

	static final void method2523(int i,
			Class246_Sub3_Sub4_Sub2 class246_sub3_sub4_sub2) {
		do {
			try {
				int i_0_ = (-Class215.anInt1614 + (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2).anInt6390));
				int i_1_ = ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2).anInt6378) * 512 + 256 * class246_sub3_sub4_sub2
						.method3034(i ^ i));
				int i_2_ = ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2).anInt6347) * 512 + 256 * class246_sub3_sub4_sub2
						.method3034(0));
				((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 += (-((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 + i_2_)
						/ i_0_;
				((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 += (-((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 + i_1_)
						/ i_0_;
				((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2).anInt6433 = 0;
				if (((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2).anInt6407) ^ 0xffffffff) == -1)
					class246_sub3_sub4_sub2.method3042(8192, i + -20481);
				if ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2).anInt6407) == 1)
					class246_sub3_sub4_sub2.method3042(12288, -8193);
				if ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2).anInt6407) == 2)
					class246_sub3_sub4_sub2.method3042(0, -8193);
				if ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2).anInt6407) != 3)
					break;
				class246_sub3_sub4_sub2.method3042(4096, -8193);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("kv.A("
								+ i
								+ ','
								+ ((class246_sub3_sub4_sub2 != null) ? "{...}"
										: "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2524(byte i) {
		try {
			if (i > -103)
				method2524((byte) 15);
			anIntArray1277 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kv.B(" + i + ')');
		}
	}
}
