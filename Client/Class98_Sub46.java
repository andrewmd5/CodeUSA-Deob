/* Class98_Sub46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

import java.util.Date;

class Class98_Sub46 extends Class98 {
	long aLong4259;
	static int anInt4260 = 0;
	static int anInt4261;
	Class98_Sub46 aClass98_Sub46_4262;
	static Class279 aClass279_4263 = new Class279("game4", 3);
	static int anInt4264;
	Class98_Sub46 aClass98_Sub46_4265;

	final boolean method1522(final byte i) {
		try {
			if (i <= 34) {
				anInt4260 = -110;
			}
			if (aClass98_Sub46_4265 == null) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tm.H(" + i + ')');
		}
	}

	public static void method1523(final int i) {
		try {
			if (i != 0) {
				anInt4260 = 103;
			}
			aClass279_4263 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tm.L(" + i + ')');
		}
	}

	final void method1524(final byte i) {
		try {
			if (aClass98_Sub46_4265 != null) {
				aClass98_Sub46_4265.aClass98_Sub46_4262 = aClass98_Sub46_4262;
				aClass98_Sub46_4262.aClass98_Sub46_4265 = aClass98_Sub46_4265;
				aClass98_Sub46_4262 = null;
				if (i != -90) {
					method1523(-94);
				}
				aClass98_Sub46_4265 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tm.J(" + i + ')');
		}
	}

	static final void method1525(final String string, final int i) {
		try {
			if (Class98_Sub46_Sub20.aStringArray6073 == null) {
				Class264.method3222((byte) -43);
			}
			Class149.aCalendar1200.setTime(new Date(Class343.method3819(-47)));
			final int i_1_ = Class149.aCalendar1200.get(11);
			final int i_2_ = Class149.aCalendar1200.get(12);
			final int i_3_ = Class149.aCalendar1200.get(13);
			final String string_4_ = (Integer.toString(i_1_ / 10) + i_1_ % 10
					+ ":" + i_2_ / 10 + i_2_ % 10 + ":" + i_3_ / 10 + i_3_ % 10);
			final String[] strings = Class112.method2142(string, '\n', false);
			for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (strings.length ^ 0xffffffff); i_5_++) {
				for (int i_6_ = Class98_Sub28.anInt4080; (i_6_ ^ 0xffffffff) < -1; i_6_--) {
					Class98_Sub46_Sub20.aStringArray6073[i_6_] = Class98_Sub46_Sub20.aStringArray6073[-1
							+ i_6_];
				}
				Class98_Sub46_Sub20.aStringArray6073[0] = string_4_ + ": "
						+ strings[i_5_];
				if (Class264.aFileOutputStream1969 != null) {
					try {
						Class264.aFileOutputStream1969.write(aa.method152(0,
								(Class98_Sub46_Sub20.aStringArray6073[0])
										+ "\n"));
					} catch (final java.io.IOException ioexception) {
						/* empty */
					}
				}
				if (Class98_Sub28.anInt4080 < Class98_Sub46_Sub20.aStringArray6073.length
						+ -1) {
					if ((Class54.anInt3395 ^ 0xffffffff) < -1) {
						Class54.anInt3395++;
					}
					Class98_Sub28.anInt4080++;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tm.I("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public Class98_Sub46() {
		/* empty */
	}

	static final Class230 method1526(final byte[] is,
			final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final int i, final int i_7_) {
		try {
			if (is == null || (is.length ^ 0xffffffff) == -1) {
				return null;
			}
			final long l = OpenGL.glCreateShaderObjectARB(i_7_);
			OpenGL.glShaderSourceRawARB(l, is);
			if (i != -25671) {
				anInt4260 = 21;
			}
			OpenGL.glCompileShaderARB(l);
			OpenGL.glGetObjectParameterivARB(l, 35713, Class231.anIntArray1734,
					0);
			if ((Class231.anIntArray1734[0] ^ 0xffffffff) == -1) {
				if (Class231.anIntArray1734[0] == 0) {
					System.out.println("Shader compile failed:");
				}
				OpenGL.glGetObjectParameterivARB(l, 35716,
						Class231.anIntArray1734, 1);
				if ((Class231.anIntArray1734[1] ^ 0xffffffff) < -2) {
					final byte[] is_8_ = new byte[Class231.anIntArray1734[1]];
					OpenGL.glGetInfoLogARB(l, Class231.anIntArray1734[1],
							Class231.anIntArray1734, 0, is_8_, 0);
					System.out.println(new String(is_8_));
				}
				if ((Class231.anIntArray1734[0] ^ 0xffffffff) == -1) {
					OpenGL.glDeleteObjectARB(l);
					return null;
				}
			}
			return new Class230(var_ha_Sub3_Sub2, l, i_7_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tm.K("
					+ (is != null ? "{...}" : "null") + ','
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_7_ + ')'));
		}
	}
}
