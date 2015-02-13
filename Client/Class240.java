import jaggl.OpenGL;

/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class240 {
	abstract long method2922(byte i);

	abstract void method2923(boolean bool);

	abstract long method2924(byte i);

	final int method2925(final int i, final long l) {
		try {
			final long l_0_ = method2922((byte) -93);
			if (l_0_ > i) {
				Class246_Sub7.method3131(0, l_0_);
			}
			return method2926(123, l);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pca.D(" + i + ','
					+ l + ')');
		}
	}

	abstract int method2926(int i, long l);

	static final Class273 method2927(final byte[] is,
			final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final int i, final int i_1_) {
		try {
			if (is == null) {
				return null;
			}
			final int i_2_ = OpenGL.glGenProgramARB();
			OpenGL.glBindProgramARB(i, i_2_);
			OpenGL.glProgramRawARB(i, 34933, is);
			OpenGL.glGetIntegerv(34379, Class4.anIntArray83, 0);
			if ((Class4.anIntArray83[0] ^ 0xffffffff) != 0) {
				OpenGL.glBindProgramARB(i, 0);
				return null;
			}
			OpenGL.glBindProgramARB(i, 0);
			if (i_1_ != 25246) {
				return null;
			}
			return new Class273(var_ha_Sub3_Sub2, i, i_2_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pca.F("
					+ (is != null ? "{...}" : "null") + ','
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_1_ + ')'));
		}
	}

	public Class240() {
		/* empty */
	}
}
