import jaggl.OpenGL;

/* Class21_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class21_Sub3 extends Class21 implements Interface4_Impl2 {
	static int anInt5389;
	static int anInt5390 = -1;
	private int anInt5391;
	private int anInt5392;

	static final void method275(final boolean bool, int i, final Class28 class28) {
		do {
			try {
				if (Class222.aBoolean1667) {
					Class222.aBoolean1667 = false;
					i = 0;
				}
				do {
					if (aa.aClass28_50 == null
							|| !aa.aClass28_50.method299(true, class28)) {
						aa.aClass28_50 = class28;
						Class98_Sub46_Sub12.aLong6035 = Class343
								.method3819(-47);
						Class287.anInt2196 = Class98_Sub10_Sub6.anInt5570 = i;
						if ((Class287.anInt2196 ^ 0xffffffff) == -1) {
							RuntimeException_Sub1.method4011(-38);
							if (!client.aBoolean3553) {
								break;
							}
						}
						Class140.aClass48_3245 = Class98_Sub46_Sub4.aClass48_5962;
						Class162.anInt1271 = Class284_Sub1_Sub2.anInt6192;
						Class135.aFloat1053 = Class159.aFloat1254;
						Class346.aFloat2900 = Class260.aFloat3260;
						Class98_Sub28_Sub1.anInt5811 = Class98_Sub46_Sub6.anInt5979;
						Class98_Sub12.anInt3872 = Class263.anInt1965;
						Class234.aFloat1749 = NPC.aFloat1150;
						IOException_Sub1.aFloat31 = Class46.aFloat388;
						Class157.aFloat1249 = AnimationDefinition.aFloat831;
						Class3.aFloat78 = Class215.aFloat1613;
					}
				} while (false);
				if (bool == false) {
					break;
				}
				anInt5389 = 4;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("vca.A("
						+ bool + ',' + i + ','
						+ (class28 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	@Override
	public final float method45(final int i, final float f) {
		try {
			if (i != -8473) {
				method48(-66);
			}
			return f;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vca.J(" + i + ','
					+ f + ')');
		}
	}

	static final boolean method276(final int i, final int i_0_, final int i_1_) {
		try {
			if (i_0_ != 15123) {
				method275(true, 53, null);
			}
			return (Class98_Sub10_Sub1.method1005(i, i_1_, (byte) -23) & ((0x2000 & i) != 0
					| Class373_Sub3.method3978(i_1_, i, (byte) 88) | Class21_Sub2
						.method271((byte) -104, i, i_1_)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vca.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	Class21_Sub3(final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final Class164 class164,
			final int i, final int i_2_, final byte[] is, final int i_3_,
			final int i_4_) {
		super(var_ha_Sub3_Sub2, 34037, class164, Class162.aClass162_1266, i_2_
				* i, false);
		try {
			anInt5391 = i;
			anInt5392 = i_2_;
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, -123);
			OpenGL.glPixelStorei(3317, 1);
			OpenGL.glPixelStorei(3314, i_4_);
			OpenGL.glTexImage2Dub(((Class21) this).anInt3235, 0, method260(0),
					i, i_2_, 0, Class196.method2665(false,
							(((Class21) this).aClass164_3237)), 5121, is, i_3_);
			OpenGL.glPixelStorei(3314, 0);
			OpenGL.glPixelStorei(3317, 4);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vca.<init>("
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ','
					+ (class164 != null ? "{...}" : "null") + ',' + i + ','
					+ i_2_ + ',' + (is != null ? "{...}" : "null") + ',' + i_3_
					+ ',' + i_4_ + ')'));
		}
	}

	@Override
	public final int method47(final int i) {
		try {
			if (i != 12941) {
				return 31;
			}
			return anInt5391;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vca.G(" + i + ')');
		}
	}

	@Override
	public final void method41(int i, final int i_5_, final int i_6_,
			final int i_7_, final int i_8_, final int i_9_, final byte[] is,
			final Class164 class164, final int i_10_) {
		try {
			if (i == 0) {
				i = i_6_;
			}
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, -123);
			if (i_9_ != -26946) {
				method45(-63, 1.4202741F);
			}
			OpenGL.glPixelStorei(3317, 1);
			if (i_6_ != i) {
				OpenGL.glPixelStorei(3314, i);
			}
			OpenGL.glTexSubImage2Dub(((Class21) this).anInt3235, 0, i_10_,
					i_7_, i_6_, i_8_, Class196.method2665(false, class164),
					5121, is, i_5_);
			if (i != i_6_) {
				OpenGL.glPixelStorei(3314, 0);
			}
			OpenGL.glPixelStorei(3317, 4);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("vca.M(" + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ','
							+ i_8_ + ',' + i_9_ + ','
							+ (is != null ? "{...}" : "null") + ','
							+ (class164 != null ? "{...}" : "null") + ','
							+ i_10_ + ')'));
		}
	}

	@Override
	public final float method42(final byte i, final float f) {
		try {
			return f;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vca.O(" + i + ','
					+ f + ')');
		}
	}

	@Override
	public final int method43(final int i) {
		try {
			if (i < 109) {
				method49(15, -62, -104, null, -50, -111, -85, 115);
			}
			return anInt5392;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vca.L(" + i + ')');
		}
	}

	@Override
	public final void method46(final boolean bool, final boolean bool_12_,
			final int i) {
		try {
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vca.K(" + bool
					+ ',' + bool_12_ + ',' + i + ')'));
		}
	}

	Class21_Sub3(final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final int i,
			final int i_14_, final int[] is, final int i_15_, final int i_16_) {
		super(var_ha_Sub3_Sub2, 34037, Class62.aClass164_486,
				Class162.aClass162_1266, i * i_14_, false);
		try {
			anInt5392 = i_14_;
			anInt5391 = i;
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, -121);
			OpenGL.glPixelStorei(3314, i_16_);
			OpenGL.glTexImage2Di(((Class21) this).anInt3235, 0, 6408,
					anInt5391, anInt5392, 0, 32993,
					(((Class21) this).aHa_Sub3_Sub2_3233.anInt6135), is,
					4 * i_15_);
			OpenGL.glPixelStorei(3314, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vca.<init>("
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_14_ + ',' + (is != null ? "{...}" : "null") + ','
					+ i_15_ + ',' + i_16_ + ')'));
		}
	}

	Class21_Sub3(final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final Class164 class164,
			final int i, final int i_17_, final float[] fs, final int i_18_,
			final int i_19_) {
		super(var_ha_Sub3_Sub2, 34037, class164, Class162.aClass162_1270, i_17_
				* i, false);
		try {
			anInt5392 = i_17_;
			anInt5391 = i;
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, 43);
			OpenGL.glPixelStorei(3314, i_19_);
			OpenGL.glTexImage2Df(((Class21) this).anInt3235, 0, method260(0),
					i, i_17_, 0, Class196.method2665(false,
							(((Class21) this).aClass164_3237)), 5126, fs,
					4 * i_18_);
			OpenGL.glPixelStorei(3314, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vca.<init>("
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ','
					+ (class164 != null ? "{...}" : "null") + ',' + i + ','
					+ i_17_ + ',' + (fs != null ? "{...}" : "null") + ','
					+ i_18_ + ',' + i_19_ + ')'));
		}
	}

	@Override
	public final void method44(final int i, final int i_20_, final byte i_21_,
			final int i_22_, final int i_23_, final int[] is, final int i_24_) {
		try {
			final int[] is_26_ = new int[anInt5391 * anInt5392];
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, 88);
			OpenGL.glGetTexImagei(((Class21) this).anInt3235, 0, 32993, 5121,
					is_26_, 0);
			for (int i_27_ = 0; i_27_ < i_22_; i_27_++) {
				Class236.method2891(is_26_,
						((-i_27_ + -1 - (-i_22_ - i_24_)) * anInt5391), is,
						i_20_ - -(i * i_27_), i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vca.H(" + i + ','
					+ i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_24_ + ')'));
		}
	}

	@Override
	public final boolean method48(final int i) {
		try {
			if (i > -22) {
				return false;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vca.N(" + i + ')');
		}
	}

	@Override
	public final void method49(final int i, final int i_28_, final int i_29_,
			final int[] is, final int i_30_, final int i_31_, int i_32_,
			final int i_33_) {
		do {
			try {
				if (i != 17779) {
					method49(-84, 50, 115, null, 124, 55, -64, 94);
				}
				((Class21) this).aHa_Sub3_Sub2_3233
						.method2005(this, i + -17894);
				if (i_32_ == 0) {
					i_32_ = i_33_;
				}
				if ((i_32_ ^ 0xffffffff) != (i_33_ ^ 0xffffffff)) {
					OpenGL.glPixelStorei(3314, i_32_);
				}
				OpenGL.glTexSubImage2Di(((Class21) this).anInt3235, 0, i_30_,
						i_28_, i_33_, i_29_, 32993,
						(((Class21) this).aHa_Sub3_Sub2_3233.anInt6135), is,
						i_31_);
				if ((i_33_ ^ 0xffffffff) == (i_32_ ^ 0xffffffff)) {
					break;
				}
				OpenGL.glPixelStorei(3314, 0);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("vca.F(" + i
						+ ',' + i_28_ + ',' + i_29_ + ','
						+ (is != null ? "{...}" : "null") + ',' + i_30_ + ','
						+ i_31_ + ',' + i_32_ + ',' + i_33_ + ')'));
			}
			break;
		} while (false);
	}

	Class21_Sub3(final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final Class164 class164,
			final Class162 class162, final int i, final int i_34_) {
		super(var_ha_Sub3_Sub2, 34037, class164, class162, i_34_ * i, false);
		try {
			anInt5392 = i_34_;
			anInt5391 = i;
			((Class21) this).aHa_Sub3_Sub2_3233.method2005(this, -119);
			OpenGL.glTexImage2Dub(((Class21) this).anInt3235, 0, method260(0),
					i, i_34_, 0, Class196.method2665(false,
							((Class21) this).aClass164_3237), Class98_Sub5_Sub1
							.method964(((Class21) this).aClass162_3234,
									(byte) 105), null, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vca.<init>("
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ','
					+ (class164 != null ? "{...}" : "null") + ','
					+ (class162 != null ? "{...}" : "null") + ',' + i + ','
					+ i_34_ + ')'));
		}
	}
}
