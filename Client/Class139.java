/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class139 {
	int anInt1086;
	static int anInt1087 = 0;
	private Class207 aClass207_1088;
	private final Class79 aClass79_1089 = new Class79(64);

	final void method2281(final int i) {
		try {
			synchronized (aClass79_1089) {
				aClass79_1089.method794(4);
				if (i > -102) {
					anInt1086 = 56;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jj.D(" + i + ')');
		}
	}

	final Class167 method2282(final int i, final int i_0_) {
		try {
			Class167 class167;
			synchronized (aClass79_1089) {
				class167 = (Class167) aClass79_1089.method802(-125, i);
			}
			if (class167 != null) {
				return class167;
			}
			byte[] is;
			synchronized (aClass207_1088) {
				if (i_0_ != 16) {
					anInt1086 = 120;
				}
				is = aClass207_1088.method2745(i, 16, false);
			}
			class167 = new Class167();
			if (is != null) {
				class167.method2527(new ByteBuffer(is), -2);
			}
			synchronized (aClass79_1089) {
				aClass79_1089.method805(i, class167, (byte) -80);
			}
			return class167;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jj.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method2283(final byte i) {
		try {
			if (i <= 9) {
				method2282(-33, -125);
			}
			synchronized (aClass79_1089) {
				aClass79_1089.method806((byte) 30);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jj.A(" + i + ')');
		}
	}

	final void method2284(final byte i, final int i_1_) {
		try {
			synchronized (aClass79_1089) {
				aClass79_1089.method800((byte) 62, i_1_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jj.B(" + i + ','
					+ i_1_ + ')');
		}
	}

	Class139(final Class279 class279, final int i, final Class207 class207) {
		try {
			aClass207_1088 = class207;
			if (aClass207_1088 == null) {
				anInt1086 = 0;
			} else {
				anInt1086 = aClass207_1088.method2761(0, 16);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("jj.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}
}
