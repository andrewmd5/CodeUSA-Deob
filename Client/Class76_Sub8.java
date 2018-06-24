/* Class76_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

import java.util.Random;

final class Class76_Sub8 extends Class76 {
	static int anInt3766;
	static Random aRandom3767;
	private boolean aBoolean3768;
	private boolean aBoolean3769;
	static int anInt3770;
	static boolean aBoolean3771 = false;
	private boolean aBoolean3772;
	private Class273 aClass273_3773;
	private Class273 aClass273_3774;
	private boolean aBoolean3775;
	private final float[] aFloatArray3776 = new float[4];
	private Class273 aClass273_3777;
	static int anInt3778;
	private Interface4_Impl2 anInterface4_Impl2_3779;
	static int anInt3780;
	private Class273 aClass273_3781;

	@Override
	final void method746(final int i, final int i_0_, final int i_1_) {
		do {
			try {
				if (i_1_ < -75) {
					break;
				}
				method748(69, true);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("laa.E(" + i
						+ ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method743(final int i, final boolean bool) {
		try {
			if (i <= 93) {
				anInterface4_Impl2_3779 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "laa.D(" + i + ','
					+ bool + ')');
		}
	}

	@Override
	final void method739(final int i) {
		do {
			try {
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 1);
				((Class76) this).aHa_Sub3_585.method2005(null, 76);
				((Class76) this).aHa_Sub3_585
						.method2019(Class249.aClass128_1903,
								Class249.aClass128_1903, 22831);
				((Class76) this).aHa_Sub3_585.method2051(0, -108,
						Class300.aClass65_2499);
				((Class76) this).aHa_Sub3_585.method2051(2, -54,
						Class64_Sub16.aClass65_3681);
				((Class76) this).aHa_Sub3_585.method1953(i ^ 0x5c,
						Class300.aClass65_2499, 0);
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 0);
				if (aBoolean3768) {
					((Class76) this).aHa_Sub3_585.method2051(0, -87,
							Class300.aClass65_2499);
					((Class76) this).aHa_Sub3_585.method1953(-93,
							Class300.aClass65_2499, 0);
					aBoolean3768 = false;
				}
				if (aBoolean3769) {
					OpenGL.glBindProgramARB(34336, 0);
					OpenGL.glDisable(34820);
					OpenGL.glDisable(34336);
					aBoolean3769 = false;
				}
				if (i == -2) {
					break;
				}
				method746(-34, -50, 9);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "laa.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method747(final int i) {
		try {
			if (i != -25684) {
				anInt3778 = -102;
			}
			final int i_2_ = ((Class76) this).aHa_Sub3_585
					.method2017((byte) 67);
			final Class111_Sub3 class111_sub3 = ((Class76) this).aHa_Sub3_585
					.method1956((byte) -90);
			do {
				if (!aBoolean3775) {
					OpenGL.glBindProgramARB(
							34336,
							((i_2_ ^ 0xffffffff) != -2147483648 ? (aClass273_3773.anInt2040)
									: (aClass273_3781.anInt2040)));
					if (!client.aBoolean3553) {
						break;
					}
				}
				OpenGL.glBindProgramARB(34336,
						(i_2_ == 2147483647 ? (aClass273_3774.anInt2040)
								: (aClass273_3777.anInt2040)));
			} while (false);
			OpenGL.glEnable(34336);
			aBoolean3769 = true;
			class111_sub3.method2120((byte) 51, 0.0F, -1.0F, i_2_,
					aFloatArray3776, 0.0F);
			OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray3776[0],
					aFloatArray3776[1], aFloatArray3776[2], aFloatArray3776[3]);
			method738(i + 25626);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "laa.P(" + i + ')');
		}
	}

	@Override
	final void method742(final int i, final int i_3_,
			final Interface4 interface4) {
		try {
			do {
				if (interface4 == null) {
					if (aBoolean3768) {
						break;
					}
					((Class76) this).aHa_Sub3_585.method2005(
							(((Class76) this).aHa_Sub3_585.anInterface4_4586),
							41);
					((Class76) this).aHa_Sub3_585.method2015(1, (byte) -124);
					((Class76) this).aHa_Sub3_585.method2051(0, i + -132,
							IncomingOpcode.aClass65_459);
					((Class76) this).aHa_Sub3_585.method1953(-108,
							IncomingOpcode.aClass65_459, 0);
					aBoolean3768 = true;
					if (!client.aBoolean3553) {
						break;
					}
				}
				if (aBoolean3768) {
					((Class76) this).aHa_Sub3_585.method2051(0, -57,
							Class300.aClass65_2499);
					((Class76) this).aHa_Sub3_585.method1953(-67,
							Class300.aClass65_2499, 0);
					aBoolean3768 = false;
				}
				((Class76) this).aHa_Sub3_585.method2005(interface4, -124);
				((Class76) this).aHa_Sub3_585.method2015(i_3_, (byte) -128);
			} while (false);
			if (i != 6) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("laa.I(" + i + ',' + i_3_ + ','
							+ (interface4 != null ? "{...}" : "null") + ')'));
		}
	}

	Class76_Sub8(final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final Class207 class207) {
		super(var_ha_Sub3_Sub2);
		aBoolean3768 = false;
		try {
			if (class207 == null || !var_ha_Sub3_Sub2.aBoolean6134) {
				aBoolean3772 = false;
			} else {
				aClass273_3781 = (Class240.method2927(
						class207.method2739("gl", "uw_ground_unlit", -32734),
						var_ha_Sub3_Sub2, 34336, 25246));
				aClass273_3774 = Class240.method2927(
						class207.method2739("gl", "uw_ground_lit", -32734),
						var_ha_Sub3_Sub2, 34336, 25246);
				aClass273_3773 = Class240.method2927(
						class207.method2739("gl", "uw_model_unlit", -32734),
						var_ha_Sub3_Sub2, 34336, 25246);
				aClass273_3777 = Class240.method2927(
						class207.method2739("gl", "uw_model_lit", -32734),
						var_ha_Sub3_Sub2, 34336, 25246);
				if (aClass273_3777 != null
						& (aClass273_3773 != null & (aClass273_3781 != null & aClass273_3774 != null))) {
					anInterface4_Impl2_3779 = ((Class76) this).aHa_Sub3_585
							.method2012(2, 1, (byte) 31, (new int[] { 0, -1 }),
									false);
					anInterface4_Impl2_3779.method46(false, false, -37);
					aBoolean3772 = true;
				} else {
					aBoolean3772 = false;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("laa.<init>("
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method738(final int i) {
		do {
			try {
				if (i > -45) {
					aRandom3767 = null;
				}
				if (!aBoolean3769) {
					break;
				}
				final int i_4_ = ((Class76) this).aHa_Sub3_585.XA();
				final int i_5_ = ((Class76) this).aHa_Sub3_585.i();
				final float f = -((i_4_ + -i_5_) * 0.125F) + i_4_;
				final float f_6_ = i_4_ - (-i_5_ + i_4_) * 0.25F;
				OpenGL.glProgramLocalParameter4fARB(
						34336,
						0,
						f_6_,
						f,
						(1.0F / ((Class76) this).aHa_Sub3_585.method1948(126)),
						((Class76) this).aHa_Sub3_585.method2018((byte) 98) / 255.0F);
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 1);
				((Class76) this).aHa_Sub3_585.method1984(2,
						((Class76) this).aHa_Sub3_585.method1998((byte) 89));
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 0);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "laa.K(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method764(final byte i) {
		do {
			try {
				aRandom3767 = null;
				if (i == 122) {
					break;
				}
				method764((byte) -116);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "laa.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final boolean method745(final byte i) {
		try {
			if (i != 27) {
				method748(-106, true);
			}
			return aBoolean3772;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "laa.H(" + i + ')');
		}
	}

	@Override
	final void method748(final int i, final boolean bool) {
		try {
			if (i == 69) {
				aBoolean3775 = bool;
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 1);
				((Class76) this).aHa_Sub3_585.method2005(
						anInterface4_Impl2_3779, -114);
				((Class76) this).aHa_Sub3_585
						.method2019(Class288.aClass128_3381,
								Class323.aClass128_2715, 22831);
				((Class76) this).aHa_Sub3_585.method2051(0, -81,
						Class64_Sub16.aClass65_3681);
				((Class76) this).aHa_Sub3_585.method2026(2, true, (byte) 27,
						(Class300.aClass65_2499), false);
				((Class76) this).aHa_Sub3_585.method1953(-125,
						IncomingOpcode.aClass65_459, 0);
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 0);
				method747(-25684);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "laa.B(" + i + ','
					+ bool + ')');
		}
	}

	static {
		anInt3766 = 0;
		anInt3778 = 0;
		aRandom3767 = new Random();
	}
}
