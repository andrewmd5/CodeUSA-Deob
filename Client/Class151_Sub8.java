import jaggl.OpenGL;

/* Class151_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class151_Sub8 extends Class151 {
	private boolean aBoolean5010 = false;
	static IncomingOpcode aClass58_5011 = new IncomingOpcode(43, -1);
	private Class91 aClass91_5012;
	static Class98_Sub31_Sub2 aClass98_Sub31_Sub2_5013;
	static int[] anIntArray5014 = new int[4096];
	static int anInt5015;
	static int anInt5016;

	Class151_Sub8(final ha_Sub1 var_ha_Sub1) {
		super(var_ha_Sub1);
		do {
			try {
				if (!var_ha_Sub1.aBoolean4391) {
					break;
				}
				aClass91_5012 = new Class91(var_ha_Sub1, 2);
				aClass91_5012.method887(0, -30389);
				((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
				((Class151) this).aHa_Sub1_1215.method1899(7681, 8960, 34165);
				((Class151) this).aHa_Sub1_1215.method1840(2, 770, 86, 34168);
				((Class151) this).aHa_Sub1_1215
						.method1886(770, 0, 34200, 34167);
				OpenGL.glTexGeni(8192, 9472, 34066);
				OpenGL.glTexGeni(8193, 9472, 34066);
				OpenGL.glTexGeni(8194, 9472, 34066);
				OpenGL.glEnable(3168);
				OpenGL.glEnable(3169);
				OpenGL.glEnable(3170);
				((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
				aClass91_5012.method886((byte) 100);
				aClass91_5012.method887(1, -30389);
				((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
				((Class151) this).aHa_Sub1_1215.method1899(8448, 8960, 8448);
				((Class151) this).aHa_Sub1_1215.method1840(2, 770, -62, 34166);
				((Class151) this).aHa_Sub1_1215.method1886(770, 0, 34200, 5890);
				OpenGL.glDisable(3168);
				OpenGL.glDisable(3169);
				OpenGL.glDisable(3170);
				OpenGL.glMatrixMode(5890);
				OpenGL.glLoadIdentity();
				OpenGL.glMatrixMode(5888);
				((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
				aClass91_5012.method886((byte) -125);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("vj.<init>("
						+ (var_ha_Sub1 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2468(final byte i) {
		try {
			aClass98_Sub31_Sub2_5013 = null;
			anIntArray5014 = null;
			aClass58_5011 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vj.B(" + i + ')');
		}
	}

	@Override
	final void method2441(final int i, final int i_1_, final int i_2_) {
		try {
			if (i_2_ > -2) {
				method2445((byte) 108);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vj.G(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	@Override
	final void method2440(final boolean bool, final boolean bool_3_) {
		try {
			final Class42_Sub2 class42_sub2 = ((Class151) this).aHa_Sub1_1215
					.method1827(-126);
			if (bool != false) {
				aClass98_Sub31_Sub2_5013 = null;
			}
			if (aClass91_5012 != null && class42_sub2 != null && bool_3_) {
				aClass91_5012.method888('\0', bool);
				((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
				((Class151) this).aHa_Sub1_1215.method1863(1, class42_sub2);
				OpenGL.glMatrixMode(5890);
				OpenGL.glLoadMatrixf(
						((Class151) this).aHa_Sub1_1215.aClass111_Sub1_4354
								.method2116(54), 0);
				OpenGL.glMatrixMode(5888);
				((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
				aBoolean5010 = true;
			} else {
				((Class151) this).aHa_Sub1_1215
						.method1886(770, 0, 34200, 34168);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vj.D(" + bool
					+ ',' + bool_3_ + ')'));
		}
	}

	@Override
	final void method2442(final Class42 class42, final boolean bool, final int i) {
		try {
			if (bool == false) {
				((Class151) this).aHa_Sub1_1215.method1863(1, class42);
				((Class151) this).aHa_Sub1_1215.method1896(260, i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vj.F("
					+ (class42 != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ')'));
		}
	}

	@Override
	final void method2443(final boolean bool, final int i) {
		do {
			try {
				((Class151) this).aHa_Sub1_1215
						.method1899(7681, i + 8705, 8448);
				if (i == 255) {
					break;
				}
				aClass58_5011 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "vj.C(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	@Override
	final boolean method2439(final int i) {
		try {
			if (i != 31565) {
				aClass98_Sub31_Sub2_5013 = null;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vj.A(" + i + ')');
		}
	}

	@Override
	final void method2445(final byte i) {
		try {
			do {
				if (!aBoolean5010) {
					((Class151) this).aHa_Sub1_1215.method1886(770, 0, 34200,
							5890);
					if (!client.aBoolean3553) {
						break;
					}
				}
				aClass91_5012.method888('\001', false);
				((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
				((Class151) this).aHa_Sub1_1215.method1863(1, null);
				((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
			} while (false);
			((Class151) this).aHa_Sub1_1215.method1899(8448, 8960, 8448);
			if (i <= 25) {
				aClass98_Sub31_Sub2_5013 = null;
			}
			aBoolean5010 = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vj.E(" + i + ')');
		}
	}

	static {
		for (int i = 0; (i ^ 0xffffffff) > -4097; i++) {
			anIntArray5014[i] = Class222.method2825(-83, i);
		}
		anInt5016 = 0;
	}
}
