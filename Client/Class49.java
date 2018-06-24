/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class49 {
	private int anInt411;
	private long aLong412;
	static OutgoingOpcode aClass171_413 = new OutgoingOpcode(38, 7);
	static int[] anIntArray414;
	static int anInt415 = 0;
	static float aFloat416;

	static final void method477(final int i) {
		try {
			Class336.aClass148_2827.method2422((byte) 47);
			if (i != -5788) {
				method477(-89);
			}
			Class62.anInt490 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dia.C(" + i + ')');
		}
	}

	private final void method478(final Class169 class169, final int i) {
		try {
			if (i != 13) {
				aClass171_413 = null;
			}
			aLong412 |= class169.anInt1300 << Class169.anInt1304 * anInt411++;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dia.E("
					+ (class169 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class169 method479(final int i, final byte i_0_) {
		try {
			if (i_0_ >= -73) {
				method481(99, 88);
			}
			return Class169.method2537(method481(15, i), (byte) 40);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dia.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	final int method480(final byte i) {
		try {
			if (i >= -7) {
				return 115;
			}
			return anInt411;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dia.A(" + i + ')');
		}
	}

	private final int method481(final int i, final int i_1_) {
		try {
			if (i != 15) {
				method481(81, -68);
			}
			return 0xf & (int) (aLong412 >> Class169.anInt1304 * i_1_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dia.D(" + i + ','
					+ i_1_ + ')');
		}
	}

	public static void method482(final int i) {
		try {
			anIntArray414 = null;
			if (i != 13) {
				method482(-50);
			}
			aClass171_413 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dia.F(" + i + ')');
		}
	}

	Class49(final Class169 class169) {
		try {
			anInt411 = 1;
			aLong412 = class169.anInt1300;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dia.<init>("
					+ (class169 != null ? "{...}" : "null") + ')');
		}
	}

	Class49(final Class169[] class169s) {
		try {
			for (int i = 0; (class169s.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				method478(class169s[i], 13);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dia.<init>("
					+ (class169s != null ? "{...}" : "null") + ')');
		}
	}

	static {
		anIntArray414 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
	}
}
