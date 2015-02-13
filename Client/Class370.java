/* Class370 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class370 {
	int[] anIntArray3133;
	static IncomingOpcode aClass58_3134;
	static int[] anIntArray3135 = { 8, 11, 4, 6, 9, 7, 10, 0 };
	static Class257 aClass257_3136;
	int anInt3137;
	int[] anIntArray3138;
	static int anInt3139;
	static int anInt3140;

	public static void method3956(final int i) {
		try {
			anIntArray3135 = null;
			aClass257_3136 = null;
			if (i <= -118) {
				aClass58_3134 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wf.A(" + i + ')');
		}
	}

	Class370(final int i) {
		try {
			anInt3137 = i;
			anIntArray3133 = new int[anInt3137];
			anIntArray3138 = new int[anInt3137];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wf.<init>(" + i
					+ ')');
		}
	}

	static {
		aClass58_3134 = new IncomingOpcode(0, 12);
	}
}
