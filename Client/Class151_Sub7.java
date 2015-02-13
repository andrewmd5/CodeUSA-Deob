import jaggl.OpenGL;

/* Class151_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class151_Sub7 extends Class151 {
	static AnimationDefParser aClass183_5001;
	private Class51 aClass51_5002;
	private Class91 aClass91_5003;
	static Class79 aClass79_5004 = new Class79(4);
	static int anInt5005;
	static int anInt5006;
	static boolean aBoolean5007;
	static Class348 aClass348_5008 = new Class348(11, 0, 1, 2);
	static Class326 aClass326_5009;

	@Override
	final void method2445(final byte i) {
		try {
			aClass91_5003.method888('\001', false);
			if (i <= 25) {
				aClass326_5009 = null;
			}
			((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
			((Class151) this).aHa_Sub1_1215.method1863(1, null);
			((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sl.E(" + i + ')');
		}
	}

	static final void method2466(final int i) {
		do {
			try {
				Class175.method2578();
				if (i == -32346) {
					break;
				}
				aClass348_5008 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "sl.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method2443(final boolean bool, final int i) {
		do {
			try {
				if (i == 255) {
					break;
				}
				aClass51_5002 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "sl.C(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	Class151_Sub7(final ha_Sub1 var_ha_Sub1, final Class51 class51) {
		super(var_ha_Sub1);
		try {
			aClass51_5002 = class51;
			aClass91_5003 = new Class91(var_ha_Sub1, 2);
			aClass91_5003.method887(0, -30389);
			((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
			if (aClass51_5002.aBoolean424) {
				OpenGL.glTexGeni(8194, 9472, 9217);
				OpenGL.glEnable(3170);
			}
			OpenGL.glTexGeni(8192, 9472, 9216);
			OpenGL.glTexGeni(8193, 9472, 9216);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
			aClass91_5003.method886((byte) -50);
			aClass91_5003.method887(1, -30389);
			((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
			if (aClass51_5002.aBoolean424) {
				OpenGL.glDisable(3170);
			}
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
			aClass91_5003.method886((byte) 53);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sl.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ','
					+ (class51 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final boolean method2439(final int i) {
		try {
			if (i != 31565) {
				anInt5006 = -90;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sl.A(" + i + ')');
		}
	}

	public static void method2467(final int i) {
		try {
			aClass348_5008 = null;
			aClass79_5004 = null;
			aClass183_5001 = null;
			if (i != 0) {
				method2466(-69);
			}
			aClass326_5009 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sl.H(" + i + ')');
		}
	}

	@Override
	final void method2442(final Class42 class42, final boolean bool, final int i) {
		do {
			try {
				((Class151) this).aHa_Sub1_1215.method1863(1, class42);
				((Class151) this).aHa_Sub1_1215.method1896(260, i);
				if (bool == false) {
					break;
				}
				method2466(-73);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("sl.F("
						+ (class42 != null ? "{...}" : "null") + ',' + bool
						+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method2441(final int i, final int i_0_, final int i_1_) {
		try {
			final float f = ((0x3 & i) - -1) * -5.0E-4F;
			final float f_2_ = (1 + ((0x1d & i) >> -1356659485)) * 5.0E-4F;
			final float f_3_ = (0x40 & i ^ 0xffffffff) != -1 ? 9.765625E-4F
					: 4.8828125E-4F;
			if (i_1_ > -2) {
				aClass91_5003 = null;
			}
			((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
			final boolean bool = (i & 0x80 ^ 0xffffffff) != -1;
			if (bool) {
				Class98_Sub43_Sub4.aFloatArray5940[0] = f_3_;
				Class98_Sub43_Sub4.aFloatArray5940[2] = 0.0F;
				Class98_Sub43_Sub4.aFloatArray5940[3] = 0.0F;
				Class98_Sub43_Sub4.aFloatArray5940[1] = 0.0F;
			} else {
				Class98_Sub43_Sub4.aFloatArray5940[3] = 0.0F;
				Class98_Sub43_Sub4.aFloatArray5940[0] = 0.0F;
				Class98_Sub43_Sub4.aFloatArray5940[2] = f_3_;
				Class98_Sub43_Sub4.aFloatArray5940[1] = 0.0F;
			}
			OpenGL.glTexGenfv(8192, 9474, Class98_Sub43_Sub4.aFloatArray5940, 0);
			Class98_Sub43_Sub4.aFloatArray5940[0] = 0.0F;
			Class98_Sub43_Sub4.aFloatArray5940[1] = f_3_;
			Class98_Sub43_Sub4.aFloatArray5940[3] = (((Class151) this).aHa_Sub1_1215.anInt4321)
					* f % 1.0F;
			Class98_Sub43_Sub4.aFloatArray5940[2] = 0.0F;
			OpenGL.glTexGenfv(8193, 9474, Class98_Sub43_Sub4.aFloatArray5940, 0);
			if (aClass51_5002.aBoolean424) {
				Class98_Sub43_Sub4.aFloatArray5940[0] = 0.0F;
				Class98_Sub43_Sub4.aFloatArray5940[3] = (f_2_
						* (((Class151) this).aHa_Sub1_1215.anInt4321) % 1.0F);
				Class98_Sub43_Sub4.aFloatArray5940[2] = 0.0F;
				Class98_Sub43_Sub4.aFloatArray5940[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473,
						Class98_Sub43_Sub4.aFloatArray5940, 0);
			} else {
				final int i_4_ = (int) (16.0F * (f_2_ * ((((Class151) this).aHa_Sub1_1215).anInt4321)));
				((Class151) this).aHa_Sub1_1215.method1863(1,
						(aClass51_5002.aClass42_Sub1Array420[i_4_ % 16]));
			}
			((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sl.G(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	@Override
	final void method2440(final boolean bool, final boolean bool_5_) {
		do {
			try {
				aClass91_5003.method888('\0', bool);
				if (!aClass51_5002.aBoolean424) {
					break;
				}
				((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
				((Class151) this).aHa_Sub1_1215.method1863(1,
						aClass51_5002.aClass42_Sub4_425);
				((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("sl.D(" + bool
						+ ',' + bool_5_ + ')'));
			}
			break;
		} while (false);
	}
}
