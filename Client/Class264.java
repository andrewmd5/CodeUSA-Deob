/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.FileOutputStream;

final class Class264 {
	private final Class79 aClass79_1968 = new Class79(256);
	static FileOutputStream aFileOutputStream1969;
	private Class207 aClass207_1970;
	static int anInt1971;
	static int anInt1972;

	static final void method3222(final byte i) {
		try {
			Class253.anInt1934 = (Class98_Sub46_Sub10.aClass197_6019.anInt1517 - (-(Class98_Sub46_Sub10.aClass197_6019.anInt1514) - 2));
			Class98_Sub46_Sub20.aStringArray6073 = new String[500];
			Class98_Sub10_Sub12.anInt5598 = (2 + Class42_Sub1.aClass197_5354.anInt1517 + Class42_Sub1.aClass197_5354.anInt1514);
			int i_0_ = 0;
			if (i != -43) {
				anInt1971 = 15;
			}
			for (/**/; ((Class98_Sub46_Sub20.aStringArray6073.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
				Class98_Sub46_Sub20.aStringArray6073[i_0_] = "";
			}
			Class98_Sub46.method1525(Class309.aClass309_2586.method3615(
					Class374.anInt3159, (byte) 25), i ^ ~0x7b);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qi.C(" + i + ')');
		}
	}

	final void method3223(final byte i) {
		try {
			if (i != 17) {
				method3223((byte) 86);
			}
			synchronized (aClass79_1968) {
				aClass79_1968.method794(i + 58);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qi.D(" + i + ')');
		}
	}

	final Class98_Sub46_Sub12 method3224(final int i, final int i_1_) {
		try {
			Class98_Sub46_Sub12 class98_sub46_sub12;
			synchronized (aClass79_1968) {
				class98_sub46_sub12 = ((Class98_Sub46_Sub12) aClass79_1968
						.method802(-127, i_1_));
			}
			if (class98_sub46_sub12 != null) {
				return class98_sub46_sub12;
			}
			byte[] is;
			synchronized (aClass207_1970) {
				is = aClass207_1970.method2745(i_1_, i, false);
			}
			class98_sub46_sub12 = new Class98_Sub46_Sub12();
			if (is != null) {
				class98_sub46_sub12.method1588(0, new ByteBuffer(is));
			}
			synchronized (aClass79_1968) {
				aClass79_1968.method805(i_1_, class98_sub46_sub12, (byte) -80);
			}
			return class98_sub46_sub12;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qi.E(" + i + ','
					+ i_1_ + ')');
		}
	}

	public static void method3225(final boolean bool) {
		do {
			try {
				aFileOutputStream1969 = null;
				if (bool == true) {
					break;
				}
				anInt1971 = 51;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "qi.B(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final void method3226(final int i) {
		try {
			synchronized (aClass79_1968) {
				aClass79_1968.method806((byte) -115);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qi.A(" + i + ')');
		}
	}

	final void method3227(final int i, final int i_3_) {
		do {
			try {
				synchronized (aClass79_1968) {
					aClass79_1968.method800((byte) 62, i);
				}
				if (i_3_ <= -28) {
					break;
				}
				aClass207_1970 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "qi.F(" + i
						+ ',' + i_3_ + ')');
			}
			break;
		} while (false);
	}

	Class264(final Class279 class279, final int i, final Class207 class207) {
		try {
			aClass207_1970 = class207;
			aClass207_1970.method2761(0, 26);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qi.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}
}
