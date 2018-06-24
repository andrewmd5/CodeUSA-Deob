/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class245 {
	static Class207 aClass207_1862;
	private final Class218 aClass218_1863 = new Class218();
	static Class207 aClass207_1864;
	static Class338[] aClass338Array1865 = new Class338[50];
	String aString1866;
	private volatile int anInt1867;
	private Class174 aClass174_1868;

	public static void method2955(final byte i) {
		try {
			if (i != 67) {
				aClass207_1862 = null;
			}
			aClass207_1862 = null;
			aClass338Array1865 = null;
			aClass207_1864 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ph.F(" + i + ')');
		}
	}

	final Class246 method2956(final int i) {
		try {
			Class246 class246;
			synchronized (aClass218_1863) {
				class246 = aClass218_1863.method2803((byte) 15);
				class246.method2965((byte) 123);
				anInt1867--;
				if (i != 0) {
					method2958((byte) 124, null);
				}
			}
			return class246;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ph.A(" + i + ')');
		}
	}

	final void method2957(final Class174 class174, final boolean bool) {
		try {
			aClass174_1868 = class174;
			if (bool != false) {
				anInt1867 = -25;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, ("ph.D("
							+ (class174 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	final void method2958(final byte i, final Class246_Sub3 class246_sub3) {
		try {
			class246_sub3.aBoolean5078 = true;
			synchronized (aClass218_1863) {
				aClass218_1863.method2808(true, class246_sub3);
				anInt1867++;
			}
			if (aClass174_1868 != null) {
				synchronized (aClass174_1868) {
					aClass174_1868.notify();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ph.B(" + i + ','
					+ (class246_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2959(final int i) {
		try {
			if (i < 113) {
				aClass338Array1865 = null;
			}
			if (anInt1867 != 0) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ph.G(" + i + ')');
		}
	}

	final void method2960(final Class246_Sub3 class246_sub3, final int i) {
		try {
			class246_sub3.aBoolean5078 = false;
			synchronized (aClass218_1863) {
				aClass218_1863.method2808(true, class246_sub3);
				anInt1867++;
			}
			if (i != 0) {
				method2959(22);
			}
			if (aClass174_1868 != null) {
				synchronized (aClass174_1868) {
					aClass174_1868.notify();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("ph.E(" + (class246_sub3 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	final void method2961(final boolean bool,
			final Class246_Sub10 class246_sub10) {
		try {
			synchronized (aClass218_1863) {
				aClass218_1863.method2808(bool, class246_sub10);
				anInt1867++;
			}
			if (aClass174_1868 != null) {
				synchronized (aClass174_1868) {
					aClass174_1868.notify();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ph.C(" + bool
					+ ',' + (class246_sub10 != null ? "{...}" : "null") + ')'));
		}
	}

	Class245(final String string) {
		try {
			aString1866 = string;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ph.<init>("
					+ (string != null ? "{...}" : "null") + ')');
		}
	}
}
