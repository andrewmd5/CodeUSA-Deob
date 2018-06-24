/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class41 {
	static OutgoingOpcode aClass171_371 = new OutgoingOpcode(31, 3);

	public static void method365(final int i) {
		do {
			try {
				aClass171_371 = null;
				if (i == 0) {
					break;
				}
				aClass171_371 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "cs.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static int method366(final int i, final int i_0_) {
		try {
			return i | i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "cs.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method367(final double d, final int i) {
		try {
			Class42_Sub3.aClass111_5364
					.method2092(Class98_Sub5_Sub3.aClass111_5540);
			Class42_Sub3.aClass111_5364.method2106(0, 0, (int) d);
			if (i != 14794) {
				method365(-123);
			}
			Class154.aHa1231.a(Class42_Sub3.aClass111_5364);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "cs.A(" + d + ','
					+ i + ')');
		}
	}
}
