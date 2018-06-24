/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class150 {
	static OutgoingOpcode aClass171_1209 = new OutgoingOpcode(19, 2);
	static IncomingOpcode aClass58_1210;
	static int anInt1211 = 0;
	static IncomingOpcode aClass58_1212;

	public static void method2436(final boolean bool) {
		try {
			aClass58_1210 = null;
			aClass171_1209 = null;
			aClass58_1212 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kca.A(" + bool
					+ ')');
		}
	}

	static final int method2437(final byte i, final int i_0_) {
		try {
			return i_0_ >>> -54059832;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kca.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	static {
		aClass58_1210 = new IncomingOpcode(49, 2);
		aClass58_1212 = new IncomingOpcode(31, -2);
	}
}
