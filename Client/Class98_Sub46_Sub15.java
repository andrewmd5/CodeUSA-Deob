/* Class98_Sub46_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub15 extends Class98_Sub46 {
	static int anInt6039 = -1;
	short[][] aShortArrayArray6040;
	static IncomingOpcode aClass58_6041 = new IncomingOpcode(36, 3);
	double aDouble6042;
	static Class232 aClass232_6043 = new Class232();

	final long method1608(final int i) {
		try {
			if (i != 2) {
				return -37L;
			}
			return (aShortArrayArray6040[0]).length
					| (aShortArrayArray6040).length << -2104658688;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jba.A(" + i + ')');
		}
	}

	static final void method1609(final int i, final int i_0_) {
		try {
			if (Class85.method837(i, 11) && i_0_ == -12889) {
				final Class293[] class293s = Class159.aClass293ArrayArray1252[i];
				for (int i_1_ = 0; (class293s.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
					final Class293 class293 = class293s[i_1_];
					if (class293 != null) {
						class293.anInt2303 = 0;
						class293.anInt2312 = 0;
						class293.anInt2287 = 1;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jba.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final int method1610(final boolean bool, final byte i) {
		try {
			if (Class2.anIntArray70 == null) {
				return 0;
			}
			if (!bool && Class242.aClass244Array1851 != null) {
				return Class2.anIntArray70.length * 2;
			}
			int i_2_ = 0;
			for (int i_3_ = 0; ((Class2.anIntArray70.length ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
				final int i_4_ = Class2.anIntArray70[i_3_];
				if (Class64_Sub16.aClass207_3683.method2742(i + -161, i_4_)) {
					i_2_++;
				}
				if (Class64_Sub17.aClass207_3687.method2742(i ^ ~0x4d, i_4_)) {
					i_2_++;
				}
			}
			if (i != 90) {
				anInt6039 = 34;
			}
			return i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jba.E(" + bool
					+ ',' + i + ')');
		}
	}

	static final boolean method1611(final byte i, final char c) {
		try {
			if (i < 117) {
				method1612(false);
			}
			if (((c ^ 0xffffffff) > -66 || (c ^ 0xffffffff) < -91)
					&& ((c ^ 0xffffffff) > -98 || (c ^ 0xffffffff) < -123)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jba.D(" + i + ','
					+ c + ')');
		}
	}

	Class98_Sub46_Sub15(final short[][] is, final double d) {
		try {
			aShortArrayArray6040 = is;
			aDouble6042 = d;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("jba.<init>("
					+ (is != null ? "{...}" : "null") + ',' + d + ')'));
		}
	}

	public static void method1612(final boolean bool) {
		try {
			if (bool != true) {
				anInt6039 = 72;
			}
			aClass232_6043 = null;
			aClass58_6041 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jba.B(" + bool
					+ ')');
		}
	}
}
