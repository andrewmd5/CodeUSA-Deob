/* Class295 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class295 {
	static int[] anIntArray2409 = new int[2];
	static int anInt2410;

	public static void method3483(final int i) {
		do {
			try {
				anIntArray2409 = null;
				if (i == 0) {
					break;
				}
				method3484(false, false);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "sca.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method3484(final boolean bool, final boolean bool_0_) {
		try {
			if (Class45.aString382.length() != 0) {
				Class98_Sub46.method1525("--> " + Class45.aString382, -117);
				PlayerUpdateMask.method710(Class45.aString382, bool, bool_0_,
						(byte) 117);
				Class45.aString382 = "";
				Class98_Sub31_Sub2.anInt5822 = 0;
				Class198.anInt1524 = 0;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sca.B(" + bool
					+ ',' + bool_0_ + ')'));
		}
	}
}
