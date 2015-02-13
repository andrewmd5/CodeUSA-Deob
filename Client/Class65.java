/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class65 {
	static int anInt496 = 0;
	static char[] aCharArray497 = { '\u20ac', '\0', '\u201a', '\u0192',
			'\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030',
			'\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018',
			'\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014',
			'\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e',
			'\u0178' };
	static int anInt498;
	static IncomingOpcode aClass58_499 = new IncomingOpcode(78, 4);
	static Class293[] aClass293Array500;
	static int[] anIntArray501;
	static int anInt502 = 0;
	static int anInt503;
	/* synthetic */static Class aClass504;

	public Class65() {
		/* empty */
	}

	static final void method678(final int i, final boolean bool) {
		try {
			if (bool == false) {
				Class81.anInt624 = i;
				synchronized (PlayerUpdate.aClass79_3411) {
					PlayerUpdate.aClass79_3411.method794(76);
				}
				synchronized (Class211.aClass79_1594) {
					Class211.aClass79_1594.method794(19);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ef.C(" + i + ','
					+ bool + ')');
		}
	}

	static final boolean method679(final int i, final int i_0_,
			final byte i_1_, final int i_2_) {
		try {
			if (i_1_ < 66) {
				method678(-15, true);
			}
			boolean bool = true;
			Interface19 interface19 = (Interface19) Class21_Sub1.method268(
					i_0_, i, i_2_);
			if (interface19 != null) {
				bool &= Class180.method2603((byte) 76, interface19);
			}
			interface19 = ((Interface19) AnimationDefinition.method931(i_0_, i,
					i_2_, (aClass504 != null ? aClass504
							: (aClass504 = method681("Interface19")))));
			if (interface19 != null) {
				bool &= Class180.method2603((byte) 76, interface19);
			}
			interface19 = (Interface19) Class253.method3177(i_0_, i, i_2_);
			if (interface19 != null) {
				bool &= Class180.method2603((byte) 76, interface19);
			}
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ef.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public static void method680(final byte i) {
		do {
			try {
				aClass293Array500 = null;
				aCharArray497 = null;
				aClass58_499 = null;
				anIntArray501 = null;
				if (i == -108) {
					break;
				}
				method679(44, -79, (byte) 121, 60);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ef.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					"ef.toString(" + ')');
		}
	}

	/* synthetic */
	static Class method681(final String string) {
		try {
			return Class.forName(string);
		} catch (final ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}

	static {
		anIntArray501 = new int[2048];
	}
}
