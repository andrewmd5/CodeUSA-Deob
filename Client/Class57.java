/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class57 {
	static int[] anIntArray457;
	static int[] anIntArray458 = new int[1];

	public static void method518(final int i) {
		try {
			anIntArray457 = null;
			anIntArray458 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "du.A(" + i + ')');
		}
	}

	static final void method519(final boolean bool, final String string,
			final int i, final int i_1_, final int i_2_) {
		try {
			if (i_1_ == -1) {
				Class277.method3288(bool, i_2_, string, 2, null, false, i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("du.B(" + bool
					+ ',' + (string != null ? "{...}" : "null") + ',' + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	static {
		anIntArray457 = null;
	}
}
