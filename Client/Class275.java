/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class275 {
	static Class79 aClass79_2046 = new Class79(4);
	static int anInt2047;
	static int[] anIntArray2048 = new int[13];

	public static void method3282(final byte i) {
		try {
			anIntArray2048 = null;
			if (i != -53) {
				method3282((byte) 8);
			}
			aClass79_2046 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rc.A(" + i + ')');
		}
	}

	static final Class53_Sub1 method3283(final byte i, final int i_0_) {
		try {
			if (!Class98_Sub17.aBoolean3944
					|| (i_0_ ^ 0xffffffff) > (Class164.anInt1274 ^ 0xffffffff)
					|| i_0_ > Class101.anInt854) {
				return null;
			}
			if (i <= 112) {
				anInt2047 = 95;
			}
			return (Class98_Sub20.aClass53_Sub1Array3967[-Class164.anInt1274
					+ i_0_]);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rc.B(" + i + ','
					+ i_0_ + ')');
		}
	}
}
