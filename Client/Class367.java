/* Class367 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class367 implements Interface21 {
	static double aDouble3543;
	int anInt3544;
	static Class215 aClass215_3545 = new Class215();
	static int[] anIntArray3546 = new int[14];

	public final Class113 method70(int i) {
		try {
			if (i != 30778)
				aClass215_3545 = null;
			return Class4.aClass113_80;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wd.A(" + i + ')');
		}
	}

	public static void method3948(boolean bool) {
		do {
			try {
				aClass215_3545 = null;
				anIntArray3546 = null;
				if (bool == true)
					break;
				method3948(false);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "wd.B(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	Class367(int i) {
		try {
			((Class367) this).anInt3544 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wd.<init>(" + i
					+ ')');
		}
	}
}
