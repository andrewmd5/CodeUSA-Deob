/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class234 {
	static OutgoingOpcode aClass171_1747 = new OutgoingOpcode(15, 8);
	static Class207 aClass207_1748;
	static float aFloat1749;
	static boolean aBoolean1750 = false;
	static Class207 aClass207_1751;

	public static void method2885(final byte i) {
		try {
			aClass207_1751 = null;
			aClass207_1748 = null;
			aClass171_1747 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ot.C(" + i + ')');
		}
	}

	static final int method2886(final int i, final int i_1_) {
		try {
			if (i_1_ > -101) {
				return -25;
			}
			return i >>> -2139410934;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ot.B(" + i + ','
					+ i_1_ + ')');
		}
	}

	static final boolean method2887(final int i, final byte i_2_, final int i_3_) {
		try {
			if (i_2_ != 46) {
				method2886(36, 120);
			}
			if ((i_3_ & 0xc580) == 0) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ot.A(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}
}
