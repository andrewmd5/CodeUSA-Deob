/* Class224_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class224_Sub3_Sub1 extends Class224_Sub3 {
	static boolean aBoolean6144 = false;
	static Class298 aClass298_6145;
	static ByteBuffer[] aClass98_Sub22Array6146 = new ByteBuffer[2048];
	static int anInt6147;

	public static void method2841(final byte i) {
		try {
			if (i > -2) {
				method2841((byte) -40);
			}
			aClass98_Sub22Array6146 = null;
			aClass298_6145 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "nv.A(" + i + ')');
		}
	}

	static {
		aClass298_6145 = new Class298();
	}
}
