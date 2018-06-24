/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class218 {
	static Class348 aClass348_1630;
	static int[] anIntArray1631 = new int[14];
	private final Class246 aClass246_1632 = new Class246();
	private Class246 aClass246_1633;
	static Class212 aClass212_1634;
	static int anInt1635;
	static String aString1636;

	final void method2802(final int i) {
		try {
			for (;;) {
				final Class246 class246 = aClass246_1632.aClass246_1874;
				if (aClass246_1632 == class246) {
					break;
				}
				class246.method2965((byte) -2);
			}
			aClass246_1633 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "o.A(" + i + ')');
		}
	}

	final Class246 method2803(final byte i) {
		try {
			if (i != 15) {
				aClass348_1630 = null;
			}
			final Class246 class246 = aClass246_1632.aClass246_1874;
			if (class246 == aClass246_1632) {
				aClass246_1633 = null;
				return null;
			}
			aClass246_1633 = class246.aClass246_1874;
			return class246;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "o.I(" + i + ')');
		}
	}

	public static void method2804(final byte i) {
		try {
			aString1636 = null;
			aClass348_1630 = null;
			aClass212_1634 = null;
			anIntArray1631 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "o.D(" + i + ')');
		}
	}

	final Class246 method2805(final byte i) {
		try {
			if (i != -72) {
				aClass212_1634 = null;
			}
			final Class246 class246 = aClass246_1632.aClass246_1874;
			if (aClass246_1632 == class246) {
				return null;
			}
			class246.method2965((byte) -63);
			return class246;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "o.B(" + i + ')');
		}
	}

	static final void method2806(final int i, final int i_2_, final boolean bool) {
		try {
			if (bool != true) {
				method2806(-21, -126, true);
			}
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i, -104, 5);
			class98_sub46_sub17.method1626((byte) -103);
			class98_sub46_sub17.anInt6054 = i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("o.K(" + i + ','
					+ i_2_ + ',' + bool + ')'));
		}
	}

	static final void method2807(final int i, final int i_3_, final int i_4_) {
		final Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_3_][i_4_];
		if (class172 != null) {
			Class129.method2227(class172.aClass246_Sub3_Sub5_1334);
			Class129.method2227(class172.aClass246_Sub3_Sub5_1326);
			if (class172.aClass246_Sub3_Sub5_1334 != null) {
				class172.aClass246_Sub3_Sub5_1334 = null;
			}
			if (class172.aClass246_Sub3_Sub5_1326 != null) {
				class172.aClass246_Sub3_Sub5_1326 = null;
			}
		}
	}

	final void method2808(final boolean bool, final Class246 class246) {
		try {
			if (bool != true) {
				method2811(119);
			}
			if (class246.aClass246_1873 != null) {
				class246.method2965((byte) 127);
			}
			class246.aClass246_1873 = aClass246_1632.aClass246_1873;
			class246.aClass246_1874 = aClass246_1632;
			class246.aClass246_1873.aClass246_1874 = class246;
			class246.aClass246_1874.aClass246_1873 = class246;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("o.G(" + bool
					+ ',' + (class246 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class246 method2809(final boolean bool) {
		try {
			final Class246 class246 = aClass246_1633;
			if (aClass246_1632 == class246) {
				aClass246_1633 = null;
				return null;
			}
			if (bool != false) {
				return null;
			}
			aClass246_1633 = class246.aClass246_1874;
			return class246;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "o.H(" + bool + ')');
		}
	}

	final Class246 method2810(final byte i) {
		try {
			final Class246 class246 = aClass246_1632.aClass246_1873;
			if (i > -33) {
				aString1636 = null;
			}
			if (aClass246_1632 == class246) {
				aClass246_1633 = null;
				return null;
			}
			aClass246_1633 = class246.aClass246_1873;
			return class246;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "o.E(" + i + ')');
		}
	}

	final int method2811(final int i) {
		try {
			if (i != 15) {
				method2804((byte) -5);
			}
			int i_5_ = 0;
			Class246 class246 = aClass246_1632.aClass246_1874;
			while (class246 != aClass246_1632) {
				class246 = class246.aClass246_1874;
				i_5_++;
			}
			return i_5_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "o.F(" + i + ')');
		}
	}

	final boolean method2812(final boolean bool) {
		try {
			if (bool != true) {
				aString1636 = null;
			}
			if (aClass246_1632.aClass246_1874 != aClass246_1632) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "o.C(" + bool + ')');
		}
	}

	public Class218() {
		try {
			aClass246_1632.aClass246_1874 = aClass246_1632;
			aClass246_1632.aClass246_1873 = aClass246_1632;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "o.<init>(" + ')');
		}
	}

	static {
		aClass348_1630 = new Class348(12, 0, 1, 0);
		anInt1635 = 100;
	}
}
