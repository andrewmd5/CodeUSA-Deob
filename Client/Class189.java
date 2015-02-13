/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class189 {
	Interface2_Impl1 anInterface2_Impl1_1454;
	static int anInt1455 = 13156520;
	Interface2_Impl1 anInterface2_Impl1_1456;
	static Class293 aClass293_1457 = null;
	boolean aBoolean1458;
	boolean aBoolean1459;

	final void method2639(final boolean bool) {
		try {
			if (anInterface2_Impl1_1454 != null) {
				anInterface2_Impl1_1454.method72(!bool);
			}
			if (bool != true) {
				method2642((byte) 27);
			}
			aBoolean1458 = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mia.D(" + bool
					+ ')');
		}
	}

	final boolean method2640(final int i) {
		try {
			if (i != 13156520) {
				aClass293_1457 = null;
			}
			if (!aBoolean1458 || aBoolean1459) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mia.A(" + i + ')');
		}
	}

	public static void method2641(final byte i) {
		try {
			if (i > 11) {
				aClass293_1457 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mia.B(" + i + ')');
		}
	}

	static final int method2642(final byte i) {
		try {
			if (i != 42) {
				method2641((byte) -66);
			}
			if (Class98_Sub46.anInt4261 == 1) {
				return Class98_Sub46_Sub13_Sub2.anInt6309;
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mia.C(" + i + ')');
		}
	}

	Class189(final boolean bool) {
		try {
			aBoolean1459 = bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mia.<init>("
					+ bool + ')');
		}
	}
}
