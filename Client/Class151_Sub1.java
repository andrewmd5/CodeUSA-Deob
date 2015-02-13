import jaggl.OpenGL;

/* Class151_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class151_Sub1 extends Class151 {
	private Class51 aClass51_4964;
	private Class91 aClass91_4965;
	private Class42_Sub3 aClass42_Sub3_4966;
	static String[] aStringArray4967;
	static OutgoingOpcode aClass171_4968 = new OutgoingOpcode(4, 6);
	static int[] anIntArray4969 = new int[500];
	static long[] aLongArray4970;

	static final void method2446(final byte i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_) {
		do {
			try {
				int i_4_ = 0;
				int i_5_ = i_2_;
				int i_6_ = -i_2_;
				int i_7_ = -1;
				Class333.method3761(i_1_,
						AnimationDefinition.anIntArrayArray814[i_3_], -i_2_
								+ i_0_, i_0_ + i_2_, (byte) -126);
				while (i_4_ < i_5_) {
					i_7_ += 2;
					i_6_ += i_7_;
					i_4_++;
					if (i_6_ >= 0) {
						i_5_--;
						i_6_ -= i_5_ << -1422120383;
						final int[] is = AnimationDefinition.anIntArrayArray814[i_3_
								- -i_5_];
						final int[] is_8_ = AnimationDefinition.anIntArrayArray814[i_3_
								- i_5_];
						final int i_9_ = i_4_ + i_0_;
						final int i_10_ = -i_4_ + i_0_;
						Class333.method3761(i_1_, is, i_10_, i_9_, (byte) -128);
						Class333.method3761(i_1_, is_8_, i_10_, i_9_, (byte) -1);
					}
					final int i_11_ = i_5_ + i_0_;
					final int i_12_ = -i_5_ + i_0_;
					final int[] is = AnimationDefinition.anIntArrayArray814[i_3_
							+ i_4_];
					final int[] is_13_ = AnimationDefinition.anIntArrayArray814[i_3_
							+ -i_4_];
					Class333.method3761(i_1_, is, i_12_, i_11_, (byte) 46);
					Class333.method3761(i_1_, is_13_, i_12_, i_11_, (byte) -125);
				}
				if (i <= -96) {
					break;
				}
				method2450((byte) -76);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("al.I(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_
								+ ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method2440(final boolean bool, final boolean bool_14_) {
		try {
			if ((((Class151) this).aHa_Sub1_1215.anInt4441 ^ 0xffffffff) < -1) {
				final float f = (-0.5F / (((Class151) this).aHa_Sub1_1215.anInt4441));
				((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
				Class34.aFloatArray326[1] = 0.0F;
				Class34.aFloatArray326[2] = f;
				Class34.aFloatArray326[3] = 0.25F
						+ (((Class151) this).aHa_Sub1_1215.aFloat4356) * f;
				Class34.aFloatArray326[0] = 0.0F;
				OpenGL.glPushMatrix();
				OpenGL.glLoadIdentity();
				OpenGL.glTexGenfv(8192, 9474, Class34.aFloatArray326, 0);
				OpenGL.glPopMatrix();
				((Class151) this).aHa_Sub1_1215.method1848(0.5F, true,
						(((Class151) this).aHa_Sub1_1215.anInt4441));
				((Class151) this).aHa_Sub1_1215.method1863(1,
						aClass42_Sub3_4966);
				((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
			}
			aClass91_4965.method888('\0', bool);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(0.25F, 0.25F, 1.0F);
			OpenGL.glMatrixMode(5888);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("al.D(" + bool
					+ ',' + bool_14_ + ')'));
		}
	}

	public static void method2447(final int i) {
		try {
			aLongArray4970 = null;
			if (i == 32132) {
				anIntArray4969 = null;
				aClass171_4968 = null;
				aStringArray4967 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "al.J(" + i + ')');
		}
	}

	Class151_Sub1(final ha_Sub1 var_ha_Sub1, final Class51 class51) {
		super(var_ha_Sub1);
		try {
			aClass51_4964 = class51;
			method2449((byte) -23);
			aClass42_Sub3_4966 = new Class42_Sub3(
					((Class151) this).aHa_Sub1_1215, 6406, 2, new byte[] { 0,
							-1 }, 6406);
			aClass42_Sub3_4966.method393(3552, false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("al.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ','
					+ (class51 != null ? "{...}" : "null") + ')'));
		}
	}

	static long method2448(final long l, final long l_15_) {
		try {
			return l | l_15_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "al.H(" + l + ','
					+ l_15_ + ')');
		}
	}

	private final void method2449(final byte i) {
		try {
			aClass91_4965 = new Class91(((Class151) this).aHa_Sub1_1215, 2);
			aClass91_4965.method887(0, i + -30366);
			((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
			((Class151) this).aHa_Sub1_1215.method1899(260, i + 8983, 7681);
			((Class151) this).aHa_Sub1_1215.method1840(0, 768, -116, 34168);
			OpenGL.glTexGeni(8192, 9472, 9216);
			OpenGL.glEnable(3168);
			((Class151) this).aHa_Sub1_1215.method1845(0, i ^ ~0x3289837e);
			OpenGL.glTexEnvf(8960, 34163, 2.0F);
			if (aClass51_4964.aBoolean424) {
				OpenGL.glTexGeni(8194, 9472, 9217);
				OpenGL.glTexGeni(8195, 9472, 9217);
				OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F,
						1.0F }, 0);
				OpenGL.glEnable(3170);
				OpenGL.glEnable(3171);
			}
			aClass91_4965.method886((byte) -108);
			aClass91_4965.method887(1, -30389);
			((Class151) this).aHa_Sub1_1215.method1845(1, i + 847872895);
			((Class151) this).aHa_Sub1_1215.method1899(8448, 8960, 8448);
			((Class151) this).aHa_Sub1_1215.method1840(0, 768, 87, 5890);
			OpenGL.glDisable(3168);
			((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
			if (i != -23) {
				aClass51_4964 = null;
			}
			OpenGL.glTexEnvf(8960, 34163, 1.0F);
			if (aClass51_4964.aBoolean424) {
				OpenGL.glDisable(3170);
				OpenGL.glDisable(3171);
			}
			aClass91_4965.method886((byte) 54);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "al.K(" + i + ')');
		}
	}

	@Override
	final void method2441(final int i, final int i_16_, final int i_17_) {
		try {
			if (i_17_ > -2) {
				anIntArray4969 = null;
			}
			if ((0x1 & i ^ 0xffffffff) == -2) {
				if (aClass51_4964.aBoolean424) {
					((Class151) this).aHa_Sub1_1215.method1863(1,
							aClass51_4964.aClass42_Sub4_422);
					Class34.aFloatArray326[3] = (((Class151) this).aHa_Sub1_1215.anInt4321) % 4000 / 4000.0F;
					Class34.aFloatArray326[0] = 0.0F;
					Class34.aFloatArray326[1] = 0.0F;
					Class34.aFloatArray326[2] = 0.0F;
					OpenGL.glTexGenfv(8194, 9473, Class34.aFloatArray326, 0);
				} else {
					final int i_18_ = 16 * ((((Class151) this).aHa_Sub1_1215.anInt4321) % 4000) / 4000;
					((Class151) this).aHa_Sub1_1215.method1863(1,
							(aClass51_4964.aClass42_Sub1Array423[i_18_]));
				}
			} else if (aClass51_4964.aBoolean424) {
				((Class151) this).aHa_Sub1_1215.method1863(1,
						aClass51_4964.aClass42_Sub4_422);
				Class34.aFloatArray326[2] = 0.0F;
				Class34.aFloatArray326[3] = 0.0F;
				Class34.aFloatArray326[0] = 0.0F;
				Class34.aFloatArray326[1] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Class34.aFloatArray326, 0);
			} else {
				((Class151) this).aHa_Sub1_1215.method1863(1,
						aClass51_4964.aClass42_Sub1Array423[0]);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("al.G(" + i + ','
					+ i_16_ + ',' + i_17_ + ')'));
		}
	}

	@Override
	final boolean method2439(final int i) {
		try {
			if (i != 31565) {
				anIntArray4969 = null;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "al.A(" + i + ')');
		}
	}

	@Override
	final void method2443(final boolean bool, final int i) {
		try {
			if (i != 255) {
				method2439(-35);
			}
			((Class151) this).aHa_Sub1_1215.method1899(8448, i ^ 0x23ff, 260);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "al.C(" + bool
					+ ',' + i + ')');
		}
	}

	static final void method2450(final byte i) {
		do {
			try {
				do {
					if ((Class98_Sub46_Sub19.anInt6065 ^ 0xffffffff) >= -2) {
						Class98_Sub9.aClass98_Sub27_3856
								.method1285(
										(byte) -13,
										2,
										(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub21_4037));
						if (!client.aBoolean3553) {
							break;
						}
					}
					Class98_Sub9.aClass98_Sub27_3856
							.method1285(
									(byte) -13,
									4,
									(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub21_4037));
				} while (false);
				if (i > 45) {
					break;
				}
				method2450((byte) -21);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "al.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method2445(final byte i) {
		do {
			try {
				aClass91_4965.method888('\001', false);
				if (((Class151) this).aHa_Sub1_1215.anInt4441 > 0) {
					((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
					((Class151) this).aHa_Sub1_1215.method1863(1, null);
					((Class151) this).aHa_Sub1_1215
							.method1848(1.0F, true, 0.0F);
					((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
				}
				((Class151) this).aHa_Sub1_1215.method1899(8448, 8960, 8448);
				OpenGL.glMatrixMode(5890);
				OpenGL.glPopMatrix();
				OpenGL.glMatrixMode(5888);
				if (i > 25) {
					break;
				}
				aLongArray4970 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "al.E(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method2442(final Class42 class42, final boolean bool, final int i) {
		do {
			try {
				if (bool == false) {
					break;
				}
				aClass42_Sub3_4966 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("al.F("
						+ (class42 != null ? "{...}" : "null") + ',' + bool
						+ ',' + i + ')'));
			}
			break;
		} while (false);
	}
}
