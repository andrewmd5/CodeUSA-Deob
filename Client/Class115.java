/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class115 {
	private final Class79 aClass79_959 = new Class79(16);
	static int anInt960;
	static float[] aFloatArray961 = new float[4];
	private Class207 aClass207_962;
	static int anInt963;

	final void method2152(final int i) {
		try {
			synchronized (aClass79_959) {
				aClass79_959.method794(97);
			}
			if (i != 21185) {
				method2155();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hh.G(" + i + ')');
		}
	}

	final void method2153(final int i, final byte i_0_) {
		do {
			try {
				synchronized (aClass79_959) {
					aClass79_959.method800((byte) 62, i);
				}
				if (i_0_ < -117) {
					break;
				}
				method2154((byte) -111);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "hh.C(" + i
						+ ',' + i_0_ + ')');
			}
			break;
		} while (false);
	}

	public static void method2154(final byte i) {
		try {
			if (i == -67) {
				aFloatArray961 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hh.A(" + i + ')');
		}
	}

	static final void method2155() {
		Class98_Sub10_Sub27.aClass84_5692 = Class98_Sub10_Sub27.aClass84_5693;
	}

	static final void method2156(final boolean bool, final String string,
			final int i) {
		try {
			Class57.method519(bool, string, -1, -1, -1);
			if (i > -61) {
				method2156(false, null, 41);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("hh.E(" + bool + ',' + (string != null ? "{...}" : "null")
							+ ',' + i + ')'));
		}
	}

	final Class266 method2157(final int i, final byte i_1_) {
		try {
			Class266 class266;
			synchronized (aClass79_959) {
				class266 = (Class266) aClass79_959.method802(-124, i);
			}
			if (class266 != null) {
				return class266;
			}
			if (i_1_ != -87) {
				aClass207_962 = null;
			}
			byte[] is;
			synchronized (aClass207_962) {
				is = aClass207_962.method2745(i, 30, false);
			}
			class266 = new Class266();
			if (is != null) {
				class266.method3236(new ByteBuffer(is), (byte) -16);
			}
			synchronized (aClass79_959) {
				aClass79_959.method805(i, class266, (byte) -80);
			}
			return class266;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hh.B(" + i + ','
					+ i_1_ + ')');
		}
	}

	final void method2158(final boolean bool) {
		try {
			if (bool == true) {
				synchronized (aClass79_959) {
					aClass79_959.method806((byte) -104);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hh.D(" + bool
					+ ')');
		}
	}

	Class115(final Class279 class279, final int i, final Class207 class207) {
		try {
			aClass207_962 = class207;
			aClass207_962.method2761(0, 30);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hh.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt960 = -1;
		anInt963 = 0;
	}
}
