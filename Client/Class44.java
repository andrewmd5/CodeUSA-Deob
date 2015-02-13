/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class44 {
	static boolean aBoolean378 = false;
	static IncomingOpcode aClass58_379 = new IncomingOpcode(75, 3);
	static OutgoingOpcode aClass171_380 = new OutgoingOpcode(3, 16);

	static final void method427(final int i, final int i_0_, final int i_1_) {
		try {
			if (i != -19181) {
				method427(-125, 127, -126);
			}
			if (Class64_Sub2.aClass279_3643 == Class4.aClass279_86) {
				if (!Class76_Sub2.requestFlag(0, 0, 1, -2, 0, i_0_, i_1_,
						false, 1)) {
					Class76_Sub2.requestFlag(0, 0, 1, -3, i + 19181, i_0_,
							i_1_, false, 1);
				}
			} else if (!Class76_Sub2.requestFlag(0, 0, 1, -3, i ^ ~0x4aec,
					i_0_, i_1_, false, 1)) {
				Class76_Sub2.requestFlag(0, 0, 1, -2, 0, i_0_, i_1_, false, 1);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dca.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final String method428(final int i, final boolean bool,
			final boolean bool_2_) {
		try {
			if (bool != false) {
				method429((byte) -9);
			}
			if (!bool_2_ || i < 0) {
				return Integer.toString(i);
			}
			return Class98_Sub10_Sub34.method1103(i, bool_2_, 328, 10);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dca.A(" + i + ','
					+ bool + ',' + bool_2_ + ')'));
		}
	}

	public static void method429(final byte i) {
		do {
			try {
				aClass58_379 = null;
				aClass171_380 = null;
				if (i > 20) {
					break;
				}
				aClass58_379 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "dca.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
