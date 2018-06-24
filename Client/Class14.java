/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class14 {
	short[] aShortArray165;
	short[] aShortArray166;
	short[] aShortArray167;
	byte[] aByteArray168;

	static final boolean method225(final String string, final byte i) {
		try {
			if (string == null) {
				return false;
			}
			for (int i_0_ = 0; i_0_ < Class248.anInt1897; i_0_++) {
				if (string.equalsIgnoreCase(Class255.aStringArray3209[i_0_])) {
					return true;
				}
				if (string.equalsIgnoreCase(Class110.aStringArray945[i_0_])) {
					return true;
				}
			}
			if (i <= 100) {
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("bb.A("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final int method226(final int i) {
		try {
			if (i <= 106) {
				method225(null, (byte) 101);
			}
			return Class246_Sub3_Sub2_Sub1.anInt6345++;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "bb.B(" + i + ')');
		}
	}
}
