/* Class98_Sub46_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub7 extends Class98_Sub46 {
	byte[] aByteArray5981;
	private static char[] aCharArray5982 = new char[64];

	Class98_Sub46_Sub7(final byte[] is) {
		try {
			aByteArray5981 = is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dn.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	public static void method1551(final byte i) {
		do {
			try {
				aCharArray5982 = null;
				if (i == -28) {
					break;
				}
				aCharArray5982 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "dn.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static {
		for (int i = 0; (i ^ 0xffffffff) > -27; i++) {
			aCharArray5982[i] = (char) (i + 65);
		}
		for (int i = 26; (i ^ 0xffffffff) > -53; i++) {
			aCharArray5982[i] = (char) (-26 + i + 97);
		}
		for (int i = 52; (i ^ 0xffffffff) > -63; i++) {
			aCharArray5982[i] = (char) (48 + (i + -52));
		}
		aCharArray5982[62] = '*';
		aCharArray5982[63] = '-';
	}
}
