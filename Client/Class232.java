/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class232 {
	static Class79 aClass79_1740;
	static boolean[] aBooleanArray1741 = new boolean[100];
	static byte aByte1742;
	static IncomingOpcode aClass58_1743;
	static boolean aBoolean1744;
	private static char[] aCharArray1745;

	public static void method2881(final boolean bool) {
		try {
			aClass58_1743 = null;
			if (bool != false) {
				aClass58_1743 = null;
			}
			aClass79_1740 = null;
			aCharArray1745 = null;
			aBooleanArray1741 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "oq.A(" + bool
					+ ')');
		}
	}

	public Class232() {
		/* empty */
	}

	@Override
	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					"oq.toString(" + ')');
		}
	}

	static final void method2882(final int i, final int i_0_, final boolean bool) {
		try {
			final Class98_Sub3 class98_sub3 = Class64_Sub28.method669(i_0_,
					bool, 6);
			if (class98_sub3 != null) {
				if (i != -26) {
					method2881(false);
				}
				for (int i_1_ = 0; (i_1_ < class98_sub3.anIntArray3824.length); i_1_++) {
					class98_sub3.anIntArray3824[i_1_] = -1;
					class98_sub3.anIntArray3823[i_1_] = 0;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("oq.B(" + i + ','
					+ i_0_ + ',' + bool + ')'));
		}
	}

	static {
		aClass79_1740 = new Class79(20);
		aClass58_1743 = new IncomingOpcode(10, -2);
		aBoolean1744 = false;
		aCharArray1745 = new char[64];
		for (int i = 0; (i ^ 0xffffffff) > -27; i++) {
			aCharArray1745[i] = (char) (i + 65);
		}
		for (int i = 26; i < 52; i++) {
			aCharArray1745[i] = (char) (97 + (i + -26));
		}
		for (int i = 52; i < 62; i++) {
			aCharArray1745[i] = (char) (48 + (i + -52));
		}
		aCharArray1745[63] = '/';
		aCharArray1745[62] = '+';
	}
}
