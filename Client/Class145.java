/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class145 {
	static int anInt1170 = -1;
	private int anInt1171;
	static int anInt1172 = 0;
	static Class268 aClass268_1173;
	private boolean aBoolean1174;
	static int[] anIntArray1175;
	private boolean aBoolean1176;
	static int[] anIntArray1177 = new int[2];
	private int anInt1178;

	static final long method2313(final byte i, final String string) {
		try {
			final int i_0_ = string.length();
			long l = 0L;
			if (i > -118) {
				return 54L;
			}
			for (int i_1_ = 0; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
				l = string.charAt(i_1_) + (l << -470840507) + -l;
			}
			return l;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "k.B(" + i + ','
					+ (string != null ? "{...}" : "null") + ')');
		}
	}

	public static void method2314(final int i) {
		try {
			if (i != -1) {
				method2315(-27, null);
			}
			aClass268_1173 = null;
			anIntArray1175 = null;
			anIntArray1177 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "k.F(" + i + ')');
		}
	}

	static final String method2315(final int i, final String string) {
		try {
			if (Class19.aString3448.startsWith("win")) {
				return string + ".dll";
			}
			if (!Class19.aString3448.startsWith("linux")) {
				if (Class19.aString3448.startsWith("mac")) {
					return "lib" + string + ".dylib";
				}
			} else {
				return "lib" + string + ".so";
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "k.E(" + i + ','
					+ (string != null ? "{...}" : "null") + ')');
		}
	}

	final boolean method2316(final boolean bool) {
		try {
			if (bool != true) {
				method2316(false);
			}
			return aBoolean1176;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, "k.D(" + bool + ')');
		}
	}

	final boolean method2317(final boolean bool) {
		try {
			if (bool != false) {
				aClass268_1173 = null;
			}
			return aBoolean1174;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, "k.A(" + bool + ')');
		}
	}

	final int method2318(final int i) {
		try {
			if (i != -1) {
				return 72;
			}
			return anInt1178;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "k.G(" + i + ')');
		}
	}

	final int method2319(final int i) {
		try {
			if (i != 32755) {
				anIntArray1175 = null;
			}
			return anInt1171;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "k.C(" + i + ')');
		}
	}

	Class145(final boolean bool, final int i, final int i_3_,
			final boolean bool_4_) {
		try {
			anInt1171 = i_3_;
			aBoolean1174 = bool;
			aBoolean1176 = bool_4_;
			anInt1178 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("k.<init>(" + bool
					+ ',' + i + ',' + i_3_ + ',' + bool_4_ + ')'));
		}
	}
}
