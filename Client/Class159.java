/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class159 {
	static Class293[][] aClass293ArrayArray1252;
	static IncomingOpcode aClass58_1253 = new IncomingOpcode(85, -1);
	static float aFloat1254;
	static byte[] aByteArray1255 = new byte[520];
	static int anInt1256;

	static final void method2508(final int i, final int i_0_, final byte i_1_,
			final ha var_ha) {
		do {
			try {
				Class98_Sub37.aHa4185 = var_ha;
				Class76.aClass28ArrayArray586 = new Class28[i][i_0_];
				if (Class50.anIntArray417 != null) {
					Class246_Sub7.aClass48_5119 = Class13.method217(5,
							Class50.anIntArray417[3], Class50.anIntArray417[5],
							Class50.anIntArray417[4], Class50.anIntArray417[2],
							Class50.anIntArray417[0], Class50.anIntArray417[1]);
				}
				Class91.aClass28_722 = new Class28();
				Class369.method3954(0);
				if (i_1_ == -50) {
					break;
				}
				aFloat1254 = 0.79444367F;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("km.B(" + i
						+ ',' + i_0_ + ',' + i_1_ + ','
						+ (var_ha != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final Class293 method2509(final int i, final int i_2_) {
		try {
			final int i_3_ = i >> 1456192752;
			if (i_2_ != -9820) {
				aClass293ArrayArray1252 = null;
			}
			final int i_4_ = i & 0xffff;
			if (aClass293ArrayArray1252[i_3_] == null
					|| aClass293ArrayArray1252[i_3_][i_4_] == null) {
				final boolean bool = Class85.method837(i_3_, 85);
				if (!bool) {
					return null;
				}
			}
			return aClass293ArrayArray1252[i_3_][i_4_];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "km.A(" + i + ','
					+ i_2_ + ')');
		}
	}

	public static void method2510(final int i) {
		try {
			aClass58_1253 = null;
			if (i != 4) {
				method2509(21, -77);
			}
			aByteArray1255 = null;
			aClass293ArrayArray1252 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "km.C(" + i + ')');
		}
	}
}
