/* Class337_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class337_Sub1 extends Class337 {
	static int anInt5497 = 2;
	int anInt5498;
	static int anInt5499 = 1;
	static int[] anIntArray5500 = new int[6];

	public static void method3776(byte i) {
		try {
			if (i >= 22)
				anIntArray5500 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dv.C(" + i + ')');
		}
	}

	Class337_Sub1(int i, Class63 class63, Class110 class110, int i_0_,
			int i_1_, int i_2_) {
		super(i, class63, class110, i_0_, i_1_);
		try {
			((Class337_Sub1) this).anInt5498 = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dv.<init>(" + i
					+ ',' + (class63 != null ? "{...}" : "null") + ','
					+ (class110 != null ? "{...}" : "null") + ',' + i_0_ + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method3777(int i) {
		try {
			Class366.aClass98_Sub31_Sub2_3122.method1364(96);
			Class257.anInt1948 = 1;
			if (i != 31585)
				method3777(-86);
			Class269.aClass207_2025 = null;
			Class116.aClass98_Sub31_Sub2_965 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dv.D(" + i + ')');
		}
	}

	public final Class113 method70(int i) {
		try {
			if (i != 30778)
				return null;
			return Class98_Sub10_Sub3.aClass113_5546;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dv.A(" + i + ')');
		}
	}
}
