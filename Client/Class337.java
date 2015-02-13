/* Class337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class337 implements Interface21 {
	int anInt3535;
	static int[] anIntArray3536 = { 2047, 16383, 65535 };
	static long aLong3537;
	Class63 aClass63_3538;
	static int anInt3539;
	Class110 aClass110_3540;
	int anInt3541;
	int anInt3542;

	public static void method3775(int i) {
		do {
			try {
				anIntArray3536 = null;
				if (i == 10003)
					break;
				anIntArray3536 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uk.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public Class113 method70(int i) {
		try {
			if (i != 30778)
				method70(-3);
			return Class280.aClass113_2111;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uk.A(" + i + ')');
		}
	}

	Class337(int i, Class63 class63, Class110 class110, int i_0_, int i_1_) {
		try {
			((Class337) this).anInt3542 = i_1_;
			((Class337) this).anInt3535 = i;
			((Class337) this).aClass63_3538 = class63;
			((Class337) this).aClass110_3540 = class110;
			((Class337) this).anInt3541 = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uk.<init>(" + i
					+ ',' + (class63 != null ? "{...}" : "null") + ','
					+ (class110 != null ? "{...}" : "null") + ',' + i_0_ + ','
					+ i_1_ + ')'));
		}
	}
}
