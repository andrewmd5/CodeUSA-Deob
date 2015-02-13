import jaggl.OpenGL;

/* Class98_Sub46_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub14 extends Class98_Sub46 implements Interface3 {
	private ha_Sub1 aHa_Sub1_5373;
	private int anInt5374;
	private int anInt5375 = -1;
	int anInt5376;
	int anInt5377;
	static Class8 aClass8_5378;
	private int anInt5379;
	private int anInt5380 = -1;
	private int anInt5381;

	static final void method1602(final int i, final int i_0_, final int i_1_) {
		final Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_0_][i_1_];
		if (class172 != null) {
			Class129.method2227(class172.aClass246_Sub3_Sub1_1332);
			if (class172.aClass246_Sub3_Sub1_1332 != null) {
				class172.aClass246_Sub3_Sub1_1332 = null;
			}
		}
	}

	final void method1603(final int i) {
		try {
			if (i < anInt5381) {
				aHa_Sub1_5373.method1846(anInt5381, i ^ 0x4b, anInt5374);
				anInt5381 = 0;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "is.C(" + i + ')');
		}
	}

	static final void method1604(final boolean bool, final byte i) {
		try {
			Class200.aClass111_1543.method2092(Class154.aHa1231.method1752());
			final int[] is = Class154.aHa1231.Y();
			if (i != 88) {
				method1604(false, (byte) -30);
			}
			Class98_Sub10_Sub38.anInt5752 = is[3];
			Class98_Sub48.anInt4279 = is[0];
			Class96.anInt802 = is[2];
			Class54.anInt3391 = is[1];
			if (!bool) {
				Class154.aHa1231.DA(Class246_Sub10.anInt5154,
						Class76_Sub11.anInt3798, Class138.anInt1085,
						Class59.anInt466);
				Class41.method367(Class291.aDouble2199, 14794);
			} else {
				Class154.aHa1231.DA(Class224_Sub2_Sub1.anInt6143,
						Class98_Sub10_Sub1.anInt5543, Class370.anInt3140,
						Class246_Sub3_Sub4_Sub2_Sub1.anInt6509);
				Class41.method367(Class263.aDouble1966, 14794);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "is.E(" + bool
					+ ',' + i + ')');
		}
	}

	final void method1605(final int i, final int i_2_, final int i_3_) {
		do {
			try {
				OpenGL.glFramebufferRenderbufferEXT(i_2_, i_3_, 36161,
						anInt5381);
				anInt5380 = i_3_;
				anInt5375 = i_2_;
				if (i == 0) {
					break;
				}
				method1606((byte) -93);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("is.G(" + i
						+ ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1606(final byte i) {
		do {
			try {
				aClass8_5378 = null;
				if (i > 25) {
					break;
				}
				method1607(null, (byte) 87);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "is.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final boolean method1607(final Class228 class228, final byte i) {
		try {
			if (i < 80) {
				method1607(null, (byte) 113);
			}
			if (class228 == null) {
				return false;
			}
			return s_Sub1.method3427(class228.anInt1713,
					(class228.anInt1714 - class228.anInt1712),
					(class228.anInt1708 - class228.anInt1713),
					(class228.anInt1709 - class228.anInt1715), (byte) 16,
					class228.anInt1715, class228.anInt1712);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("is.D("
					+ (class228 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	protected final void finalize() throws Throwable {
		try {
			method1603(0);
			super.finalize();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					"is.finalize(" + ')');
		}
	}

	@Override
	public final void method3(final byte i) {
		try {
			OpenGL.glFramebufferRenderbufferEXT(anInt5375, anInt5380, 36161, 0);
			if (i > -117) {
				method1605(-42, -54, 110);
			}
			anInt5380 = -1;
			anInt5375 = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "is.B(" + i + ')');
		}
	}

	Class98_Sub46_Sub14(final ha_Sub1 var_ha_Sub1, final int i, final int i_4_,
			final int i_5_) {
		try {
			anInt5379 = i;
			aHa_Sub1_5373 = var_ha_Sub1;
			anInt5377 = i_5_;
			anInt5376 = i_4_;
			OpenGL.glGenRenderbuffersEXT(1, Class76_Sub9.anIntArray3785, 0);
			anInt5381 = Class76_Sub9.anIntArray3785[0];
			OpenGL.glBindRenderbufferEXT(36161, anInt5381);
			OpenGL.glRenderbufferStorageEXT(36161, anInt5379, (anInt5376),
					(anInt5377));
			anInt5374 = (anInt5376 * (anInt5377 * aHa_Sub1_5373.method1866(-96,
					anInt5379)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("is.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_4_ + ',' + i_5_ + ')'));
		}
	}

	Class98_Sub46_Sub14(final ha_Sub1 var_ha_Sub1, final int i, final int i_6_,
			final int i_7_, final int i_8_) {
		try {
			aHa_Sub1_5373 = var_ha_Sub1;
			anInt5379 = i;
			anInt5376 = i_6_;
			anInt5377 = i_7_;
			OpenGL.glGenRenderbuffersEXT(1, Class76_Sub9.anIntArray3785, 0);
			anInt5381 = Class76_Sub9.anIntArray3785[0];
			OpenGL.glBindRenderbufferEXT(36161, anInt5381);
			OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_8_, anInt5379,
					anInt5376, anInt5377);
			anInt5374 = (anInt5377 * anInt5376 * aHa_Sub1_5373.method1866(-121,
					anInt5379));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("is.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}
}
