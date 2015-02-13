import jaggl.OpenGL;

/* Class98_Sub28_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub28_Sub1 extends Class98_Sub28 {
	private Class336 aClass336_5800;
	private int anInt5801;
	private Class288 aClass288_5802;
	private int anInt5803;
	private Class42_Sub1 aClass42_Sub1_5804;
	static Class53_Sub1[] aClass53_Sub1Array5805 = new Class53_Sub1[0];
	private int anInt5806;
	private int anInt5807;
	private Class42_Sub1 aClass42_Sub1_5808;
	private Class288 aClass288_5809;
	private Class336 aClass336_5810;
	static int anInt5811;
	private Class42_Sub1[] aClass42_Sub1Array5812;
	private Class336 aClass336_5813;
	private Class336 aClass336_5814;

	@Override
	final boolean method1294(final byte i) {
		try {
			if (((Class98_Sub28) this).aHa_Sub1_4079.aBoolean4460
					&& (((Class98_Sub28) this).aHa_Sub1_4079.aBoolean4447)
					&& (((Class98_Sub28) this).aHa_Sub1_4079.aBoolean4383)) {
				aClass288_5802 = new Class288(
						((Class98_Sub28) this).aHa_Sub1_4079);
				aClass42_Sub1_5804 = new Class42_Sub1(
						((Class98_Sub28) this).aHa_Sub1_4079, 3553, 34842, 256,
						256);
				aClass42_Sub1_5804.method383(false, 10242, false);
				aClass42_Sub1_5808 = new Class42_Sub1(
						((Class98_Sub28) this).aHa_Sub1_4079, 3553, 34842, 256,
						256);
				aClass42_Sub1_5808.method383(false, 10242, false);
				((Class98_Sub28) this).aHa_Sub1_4079.method1898(true,
						aClass288_5802);
				aClass288_5802.method3395(0, aClass42_Sub1_5804, 119);
				aClass288_5802.method3395(1, aClass42_Sub1_5808, 109);
				aClass288_5802.method3404(0, 0);
				if (!aClass288_5802.method3403((byte) 74)) {
					((Class98_Sub28) this).aHa_Sub1_4079.method1907(
							aClass288_5802, -1);
					return false;
				}
				((Class98_Sub28) this).aHa_Sub1_4079.method1907(aClass288_5802,
						-1);
				aClass336_5813 = (Class177
						.method2584(
								((Class98_Sub28) this).aHa_Sub1_4079,
								(new Class345[] { Class246_Sub3_Sub1_Sub1
										.method2996(
												35632,
												((Class98_Sub28) this).aHa_Sub1_4079,
												false,
												"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }),
								true));
				aClass336_5810 = (Class177
						.method2584(
								((Class98_Sub28) this).aHa_Sub1_4079,
								(new Class345[] { Class246_Sub3_Sub1_Sub1
										.method2996(
												35632,
												((Class98_Sub28) this).aHa_Sub1_4079,
												false,
												"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") }),
								true));
				aClass336_5814 = (Class177
						.method2584(
								((Class98_Sub28) this).aHa_Sub1_4079,
								(new Class345[] { Class246_Sub3_Sub1_Sub1
										.method2996(
												35632,
												((Class98_Sub28) this).aHa_Sub1_4079,
												false,
												"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n") }),
								true));
				aClass336_5800 = (Class177
						.method2584(
								((Class98_Sub28) this).aHa_Sub1_4079,
								(new Class345[] { Class246_Sub3_Sub1_Sub1
										.method2996(
												35632,
												((Class98_Sub28) this).aHa_Sub1_4079,
												false,
												"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") }),
								true));
				if (aClass336_5810 == null || aClass336_5813 == null
						|| aClass336_5814 == null || aClass336_5800 == null) {
					return false;
				}
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bw.H(" + i + ')');
		}
	}

	public static void method1308(final byte i) {
		do {
			try {
				aClass53_Sub1Array5805 = null;
				if (i > 102) {
					break;
				}
				method1310(false, null, false);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bw.J(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method1297(final int i, final byte i_1_) {
		try {
			OpenGL.glUseProgramObjectARB(0L);
			((Class98_Sub28) this).aHa_Sub1_4079.method1845(1, 847872872);
			((Class98_Sub28) this).aHa_Sub1_4079.method1863(1, null);
			if (i_1_ == 115) {
				((Class98_Sub28) this).aHa_Sub1_4079.method1845(0, 847872872);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bw.D(" + i + ','
					+ i_1_ + ')');
		}
	}

	@Override
	final void method1304(final byte i) {
		try {
			if (i < -31) {
				aClass336_5813 = null;
				aClass42_Sub1Array5812 = null;
				aClass288_5802 = null;
				aClass42_Sub1_5808 = null;
				aClass336_5800 = null;
				aClass336_5810 = null;
				aClass336_5814 = null;
				aClass288_5809 = null;
				aClass42_Sub1_5804 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bw.C(" + i + ')');
		}
	}

	final boolean method1309(final byte i) {
		try {
			if (i != 41) {
				return false;
			}
			if (!((Class98_Sub28) this).aHa_Sub1_4079.aBoolean4460
					|| !(((Class98_Sub28) this).aHa_Sub1_4079.aBoolean4447)
					|| !(((Class98_Sub28) this).aHa_Sub1_4079.aBoolean4383)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bw.E(" + i + ')');
		}
	}

	Class98_Sub28_Sub1(final ha_Sub1 var_ha_Sub1) {
		super(var_ha_Sub1);
	}

	@Override
	final boolean method1298(final int i) {
		try {
			if (i <= 10) {
				method1298(6);
			}
			if (aClass288_5802 == null) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bw.F(" + i + ')');
		}
	}

	@Override
	final int method1299(final boolean bool) {
		try {
			if (bool != false) {
				method1297(88, (byte) 126);
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bw.B(" + bool
					+ ')');
		}
	}

	static final byte[] method1310(final boolean bool, final Object object,
			final boolean bool_2_) {
		try {
			if (object == null) {
				return null;
			}
			if (object instanceof byte[]) {
				final byte[] is = (byte[]) object;
				if (!bool_2_) {
					return is;
				}
				return Class246_Sub10.method3140(is, 0);
			}
			if (object instanceof Class317) {
				final Class317 class317 = (Class317) object;
				return class317.method3654(false);
			}
			if (bool != false) {
				return null;
			}
			throw new IllegalArgumentException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("bw.I(" + bool + ',' + (object != null ? "{...}" : "null")
							+ ',' + bool_2_ + ')'));
		}
	}

	@Override
	final void method1295(final int i, final int i_3_, final boolean bool) {
		try {
			anInt5806 = i;
			anInt5801 = i_3_;
			final int i_4_ = Class23.method282(96, anInt5801);
			final int i_5_ = Class23.method282(-97, anInt5806);
			if (bool == false) {
				if (anInt5807 != i_4_
						|| (anInt5803 ^ 0xffffffff) != (i_5_ ^ 0xffffffff)) {
					if (aClass42_Sub1Array5812 != null) {
						for (int i_6_ = 0; ((aClass42_Sub1Array5812.length ^ 0xffffffff) < (i_6_ ^ 0xffffffff)); i_6_++) {
							aClass42_Sub1Array5812[i_6_].method375(true);
						}
						aClass42_Sub1Array5812 = null;
					}
					if (i_4_ <= 256 && (i_5_ ^ 0xffffffff) >= -257) {
						aClass288_5809 = null;
					} else {
						int i_7_ = i_4_;
						int i_8_ = i_5_;
						int i_9_ = 0;
						while (i_7_ > 256 || (i_8_ ^ 0xffffffff) < -257) {
							if (i_8_ > 256) {
								i_8_ >>= 1;
							}
							if (i_7_ > 256) {
								i_7_ >>= 1;
							}
							i_9_++;
						}
						if (aClass288_5809 == null) {
							aClass288_5809 = new Class288(
									((Class98_Sub28) this).aHa_Sub1_4079);
						}
						aClass42_Sub1Array5812 = new Class42_Sub1[i_9_];
						i_7_ = i_4_;
						i_8_ = i_5_;
						i_9_ = 0;
						while (i_7_ > 256 || (i_8_ ^ 0xffffffff) < -257) {
							aClass42_Sub1Array5812[i_9_++] = new Class42_Sub1(
									(((Class98_Sub28) this).aHa_Sub1_4079),
									3553, 34842, i_7_, i_8_);
							if ((i_8_ ^ 0xffffffff) < -257) {
								i_8_ >>= 1;
							}
							if (i_7_ > 256) {
								i_7_ >>= 1;
							}
						}
					}
					anInt5807 = i_4_;
					anInt5803 = i_5_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bw.A(" + i + ','
					+ i_3_ + ',' + bool + ')'));
		}
	}

	@Override
	final void method1302(final Class42_Sub1 class42_sub1, final int i,
			final byte i_10_, final Class42_Sub1 class42_sub1_11_) {
		try {
			OpenGL.glPushAttrib(2048);
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			if (i_10_ != -64) {
				method1309((byte) -68);
			}
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			if (aClass42_Sub1Array5812 == null) {
				((Class98_Sub28) this).aHa_Sub1_4079.method1863(1,
						class42_sub1_11_);
				((Class98_Sub28) this).aHa_Sub1_4079.method1898(true,
						aClass288_5802);
				aClass288_5802.method3404(i_10_ + 64, 0);
				OpenGL.glViewport(0, 0, 256, 256);
				final long l = aClass336_5813.aLong2821;
				OpenGL.glUseProgramObjectARB(l);
				OpenGL.glUniform1iARB(
						OpenGL.glGetUniformLocationARB(l, "sceneTex"), 0);
				OpenGL.glUniform3fARB(
						OpenGL.glGetUniformLocationARB(l, "params"),
						Class246_Sub3_Sub3_Sub1.aFloat6257, 0.0F, 0.0F);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(anInt5801, 0.0F);
				OpenGL.glVertex2i(1, 0);
				OpenGL.glTexCoord2f(anInt5801, anInt5806);
				OpenGL.glVertex2i(1, 1);
				OpenGL.glTexCoord2f(0.0F, anInt5806);
				OpenGL.glVertex2i(0, 1);
				OpenGL.glEnd();
			} else {
				((Class98_Sub28) this).aHa_Sub1_4079.method1898(true,
						aClass288_5809);
				int i_12_ = Class23.method282(76, anInt5801);
				int i_13_ = Class23.method282(104, anInt5806);
				int i_14_ = 0;
				while (i_12_ > 256 || i_13_ > 256) {
					OpenGL.glViewport(0, 0, i_12_, i_13_);
					aClass288_5809.method3395(0, aClass42_Sub1Array5812[i_14_],
							116);
					if (i_12_ > 256) {
						i_12_ >>= 1;
					}
					if ((i_13_ ^ 0xffffffff) < -257) {
						i_13_ >>= 1;
					}
					if ((i_14_ ^ 0xffffffff) == -1) {
						((Class98_Sub28) this).aHa_Sub1_4079.method1863(
								i_10_ + 65, class42_sub1_11_);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glVertex2i(0, 0);
						OpenGL.glTexCoord2f(anInt5801, 0.0F);
						OpenGL.glVertex2i(1, 0);
						OpenGL.glTexCoord2f(anInt5801, anInt5806);
						OpenGL.glVertex2i(1, 1);
						OpenGL.glTexCoord2f(0.0F, anInt5806);
						OpenGL.glVertex2i(0, 1);
						OpenGL.glEnd();
					} else {
						((Class98_Sub28) this).aHa_Sub1_4079.method1863(1,
								aClass42_Sub1Array5812[i_14_ + -1]);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glVertex2i(0, 0);
						OpenGL.glTexCoord2f(1.0F, 0.0F);
						OpenGL.glVertex2i(1, 0);
						OpenGL.glTexCoord2f(1.0F, 1.0F);
						OpenGL.glVertex2i(1, 1);
						OpenGL.glTexCoord2f(0.0F, 1.0F);
						OpenGL.glVertex2i(0, 1);
						OpenGL.glEnd();
					}
					i_14_++;
				}
				((Class98_Sub28) this).aHa_Sub1_4079.method1907(aClass288_5809,
						-1);
				((Class98_Sub28) this).aHa_Sub1_4079.method1863(1,
						aClass42_Sub1Array5812[-1 + i_14_]);
				((Class98_Sub28) this).aHa_Sub1_4079.method1898(true,
						aClass288_5802);
				aClass288_5802.method3404(i_10_ ^ ~0x3f, 0);
				OpenGL.glViewport(0, 0, 256, 256);
				final long l = aClass336_5810.aLong2821;
				OpenGL.glUseProgramObjectARB(l);
				OpenGL.glUniform1iARB(
						OpenGL.glGetUniformLocationARB(l, "sceneTex"), 0);
				OpenGL.glUniform3fARB(
						OpenGL.glGetUniformLocationARB(l, "params"),
						Class246_Sub3_Sub3_Sub1.aFloat6257, 0.0F, 0.0F);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(0, 0);
				OpenGL.glTexCoord2f(1.0F, 0.0F);
				OpenGL.glVertex2i(1, 0);
				OpenGL.glTexCoord2f(1.0F, 1.0F);
				OpenGL.glVertex2i(1, 1);
				OpenGL.glTexCoord2f(0.0F, 1.0F);
				OpenGL.glVertex2i(0, 1);
				OpenGL.glEnd();
			}
			aClass288_5802.method3404(i_10_ + 64, 1);
			((Class98_Sub28) this).aHa_Sub1_4079.method1863(1,
					aClass42_Sub1_5804);
			final long l = aClass336_5800.aLong2821;
			OpenGL.glUseProgramObjectARB(l);
			OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "baseTex"),
					0);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "step"),
					0.00390625F, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
			aClass288_5802.method3404(i_10_ + 64, 0);
			((Class98_Sub28) this).aHa_Sub1_4079.method1863(i_10_ ^ ~0x3e,
					aClass42_Sub1_5808);
			OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "step"),
					0.0F, 0.00390625F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			((Class98_Sub28) this).aHa_Sub1_4079.method1907(aClass288_5802, -1);
			final long l_15_ = aClass336_5814.aLong2821;
			OpenGL.glUseProgramObjectARB(l_15_);
			OpenGL.glUniform1iARB(
					OpenGL.glGetUniformLocationARB(l_15_, "sceneTex"), 0);
			OpenGL.glUniform1iARB(
					OpenGL.glGetUniformLocationARB(l_15_, "bloomTex"), 1);
			OpenGL.glUniform3fARB(
					OpenGL.glGetUniformLocationARB(l_15_, "params"),
					Class313.aFloat2680, Class177.aFloat1378, 0.0F);
			((Class98_Sub28) this).aHa_Sub1_4079.method1845(1, 847872872);
			((Class98_Sub28) this).aHa_Sub1_4079.method1863(1,
					aClass42_Sub1_5804);
			((Class98_Sub28) this).aHa_Sub1_4079.method1845(0, 847872872);
			((Class98_Sub28) this).aHa_Sub1_4079
					.method1863(1, class42_sub1_11_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bw.G("
					+ (class42_sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_10_ + ','
					+ (class42_sub1_11_ != null ? "{...}" : "null") + ')'));
		}
	}
}
