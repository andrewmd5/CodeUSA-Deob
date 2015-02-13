import jaggl.OpenGL;

/* Class21_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class21_Sub1 extends Class21 implements Interface4_Impl2 {
	private int anInt5382;
	static Class269 aClass269_5383;
	private int anInt5384;
	static Interface7[] anInterface7Array5385 = new Interface7[128];

	Class21_Sub1(final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final Class164 class164,
			final Class162 class162, final int i, final int i_0_) {
		super(var_ha_Sub3_Sub2, 3553, class164, class162, i * i_0_, false);
		try {
			anInt5384 = i_0_;
			anInt5382 = i;
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, -118);
			OpenGL.glTexImage2Dub(((Class21) this).anInt3235, 0, method260(0),
					i, i_0_, 0, Class196.method2665(false,
							((Class21) this).aClass164_3237), Class98_Sub5_Sub1
							.method964(((Class21) this).aClass162_3234,
									(byte) 105), null, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bf.<init>("
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ','
					+ (class164 != null ? "{...}" : "null") + ','
					+ (class162 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ')'));
		}
	}

	Class21_Sub1(final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final Class164 class164,
			final int i, final int i_1_, final boolean bool, final float[] fs,
			final int i_2_, final int i_3_) {
		super(var_ha_Sub3_Sub2, 3553, class164, Class162.aClass162_1270, i
				* i_1_, bool);
		try {
			anInt5384 = i_1_;
			anInt5382 = i;
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, -115);
			if (!bool && i_3_ == 0 && (i_2_ ^ 0xffffffff) == -1) {
				method256(i, fs, false, i_1_, ((Class21) this).anInt3235);
			} else {
				OpenGL.glPixelStorei(3314, i_3_);
				OpenGL.glTexImage2Df(((Class21) this).anInt3235, 0,
						method260(0), i, i_1_, 0, Class196.method2665(false,
								(((Class21) this).aClass164_3237)), 5126, fs,
						i_2_ * 4);
				OpenGL.glPixelStorei(3314, 0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bf.<init>("
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ','
					+ (class164 != null ? "{...}" : "null") + ',' + i + ','
					+ i_1_ + ',' + bool + ',' + (fs != null ? "{...}" : "null")
					+ ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	Class21_Sub1(final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final Class164 class164,
			final int i, final int i_4_, final boolean bool, final byte[] is,
			final int i_5_, final int i_6_) {
		super(var_ha_Sub3_Sub2, 3553, class164, Class162.aClass162_1266, i
				* i_4_, bool);
		try {
			anInt5384 = i_4_;
			anInt5382 = i;
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, 50);
			OpenGL.glPixelStorei(3317, 1);
			do {
				if (!bool || i_6_ != 0 || (i_5_ ^ 0xffffffff) != -1) {
					OpenGL.glPixelStorei(3314, i_6_);
					OpenGL.glTexImage2Dub(((Class21) this).anInt3235, 0,
							method260(0), i, i_4_, 0, Class196.method2665(
									false, ((Class21) this).aClass164_3237),
							5121, is, i_5_);
					OpenGL.glPixelStorei(3314, 0);
					if (!client.aBoolean3553) {
						break;
					}
				}
				method259(is, 54, i_4_, i, ((Class21) this).anInt3235);
			} while (false);
			OpenGL.glPixelStorei(3317, 4);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bf.<init>("
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ','
					+ (class164 != null ? "{...}" : "null") + ',' + i + ','
					+ i_4_ + ',' + bool + ',' + (is != null ? "{...}" : "null")
					+ ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	@Override
	public final void method46(final boolean bool, final boolean bool_7_,
			final int i) {
		try {
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, -128);
			OpenGL.glTexParameteri(((Class21) this).anInt3235, 10242,
					!bool ? 33071 : 10497);
			OpenGL.glTexParameteri(((Class21) this).anInt3235, 10243,
					bool_7_ ? 10497 : 33071);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bf.K(" + bool
					+ ',' + bool_7_ + ',' + i + ')'));
		}
	}

	@Override
	public final int method47(final int i) {
		try {
			if (i != 12941) {
				return 59;
			}
			return anInt5382;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bf.G(" + i + ')');
		}
	}

	final void method267(final float[] fs, final Class164 class164,
			final int i, final int i_9_, final byte i_10_, final int i_11_,
			final int i_12_, final int i_13_, final int i_14_) {
		try {
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, -111);
			OpenGL.glPixelStorei(3314, i_12_);
			OpenGL.glTexSubImage2Df(((Class21) this).anInt3235, 0, i_11_,
					i_13_, i_9_, i, Class196.method2665(false, class164), 5121,
					fs, i_14_);
			if (i_10_ <= 94) {
				anInt5382 = 117;
			}
			OpenGL.glPixelStorei(3314, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bf.E("
					+ (fs != null ? "{...}" : "null") + ','
					+ (class164 != null ? "{...}" : "null") + ',' + i + ','
					+ i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ','
					+ i_13_ + ',' + i_14_ + ')'));
		}
	}

	@Override
	public final int method43(final int i) {
		try {
			if (i <= 109) {
				return -89;
			}
			return anInt5384;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bf.L(" + i + ')');
		}
	}

	Class21_Sub1(final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final int i,
			final int i_15_, final boolean bool, final int[] is,
			final int i_16_, final int i_17_) {
		super(var_ha_Sub3_Sub2, 3553, Class62.aClass164_486,
				Class162.aClass162_1266, i_15_ * i, bool);
		try {
			anInt5384 = i_15_;
			anInt5382 = i;
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, 69);
			if (bool && (i_17_ ^ 0xffffffff) == -1
					&& (i_16_ ^ 0xffffffff) == -1) {
				method264(i, is, i_15_, 526364520, ((Class21) this).anInt3235);
			} else {
				OpenGL.glPixelStorei(3314, i_17_);
				OpenGL.glTexImage2Di(((Class21) this).anInt3235, 0, 6408,
						anInt5382, anInt5384, 0, 32993,
						(((Class21) this).aHa_Sub3_Sub2_3233.anInt6135), is,
						i_16_ * 4);
				OpenGL.glPixelStorei(3314, 0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bf.<init>("
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_15_ + ',' + bool + ','
					+ (is != null ? "{...}" : "null") + ',' + i_16_ + ','
					+ i_17_ + ')'));
		}
	}

	static final Class246_Sub3_Sub3 method268(final int i, final int i_18_,
			final int i_19_) {
		final Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_18_][i_19_];
		if (class172 == null) {
			return null;
		}
		return class172.aClass246_Sub3_Sub3_1324;
	}

	@Override
	public final void method41(final int i, final int i_20_, final int i_21_,
			final int i_22_, final int i_23_, final int i_24_, final byte[] is,
			final Class164 class164, final int i_25_) {
		try {
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, 124);
			if (i_24_ == -26946) {
				OpenGL.glPixelStorei(3317, 1);
				OpenGL.glPixelStorei(3314, i);
				OpenGL.glTexSubImage2Dub(((Class21) this).anInt3235, 0, i_25_,
						i_22_, i_21_, i_23_,
						Class196.method2665(false, class164), 5121, is, i_20_);
				OpenGL.glPixelStorei(3314, 0);
				OpenGL.glPixelStorei(3317, 4);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("bf.M(" + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_
							+ ',' + i_23_ + ',' + i_24_ + ','
							+ (is != null ? "{...}" : "null") + ','
							+ (class164 != null ? "{...}" : "null") + ','
							+ i_25_ + ')'));
		}
	}

	@Override
	public final float method45(final int i, final float f) {
		try {
			if (i != -8473) {
				return -1.7685026F;
			}
			return f / anInt5384;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bf.J(" + i + ','
					+ f + ')');
		}
	}

	@Override
	public final void method49(final int i, final int i_26_, final int i_27_,
			final int[] is, final int i_28_, final int i_29_, final int i_30_,
			final int i_31_) {
		try {
			if (i == 17779) {
				((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, -119);
				OpenGL.glPixelStorei(3314, i_30_);
				OpenGL.glTexSubImage2Di(((Class21) this).anInt3235, 0, i_28_,
						i_26_, i_31_, i_27_, 32993,
						(((Class21) this).aHa_Sub3_Sub2_3233.anInt6135), is,
						i_29_);
				OpenGL.glPixelStorei(3314, 0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bf.F(" + i + ','
					+ i_26_ + ',' + i_27_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_28_ + ','
					+ i_29_ + ',' + i_30_ + ',' + i_31_ + ')'));
		}
	}

	@Override
	public final boolean method48(final int i) {
		try {
			if (i >= -22) {
				anInterface7Array5385 = null;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bf.N(" + i + ')');
		}
	}

	@Override
	public final float method42(final byte i, final float f) {
		try {
			return f / anInt5382;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bf.O(" + i + ','
					+ f + ')');
		}
	}

	static final void method269(final boolean bool) {
		try {
			Class246_Sub4_Sub1.aClass79_6170.method794(41);
			if (bool != true) {
				method270(-50);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bf.D(" + bool
					+ ')');
		}
	}

	@Override
	public final void method44(final int i, final int i_33_, final byte i_34_,
			final int i_35_, final int i_36_, final int[] is, final int i_37_) {
		try {
			final int[] is_38_ = new int[anInt5384 * anInt5382];
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, 24);
			OpenGL.glGetTexImagei(((Class21) this).anInt3235, 0, 32993, 5121,
					is_38_, 0);
			for (int i_39_ = 0; i_39_ < i_35_; i_39_++) {
				Class236.method2891(is_38_,
						((-1 - (-i_35_ - i_37_ - -i_39_)) * anInt5382), is, i
								* i_39_ + i_33_, i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bf.H(" + i + ','
					+ i_33_ + ',' + i_34_ + ',' + i_35_ + ',' + i_36_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_37_ + ')'));
		}
	}

	public static void method270(final int i) {
		try {
			anInterface7Array5385 = null;
			if (i != 0) {
				method269(false);
			}
			aClass269_5383 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bf.C(" + i + ')');
		}
	}
}
