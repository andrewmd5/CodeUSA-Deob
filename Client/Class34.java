/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class34 {
	static boolean aBoolean324 = false;
	static boolean[][][] aBooleanArrayArrayArray325;
	static float[] aFloatArray326 = new float[4];

	static final void method328(final int i) {
		do {
			try {
				Class232.aClass79_1740.method806((byte) 60);
				if (i == 0) {
					break;
				}
				method330((byte) -71, true);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cha.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method329(final int i) {
		try {
			if (i != 0) {
				method330((byte) -103, false);
			}
			aBooleanArrayArrayArray325 = null;
			aFloatArray326 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cha.B(" + i + ')');
		}
	}

	static final void method330(final byte i, final boolean bool) {
		do {
			try {
				if (Class140.aClass47_3241 == null) {
					Class266.method3238(0);
				}
				if (!bool) {
					break;
				}
				Class140.aClass47_3241.method452(-7423);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cha.A(" + i
						+ ',' + bool + ')');
			}
			break;
		} while (false);
	}
}
