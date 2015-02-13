import jaggl.OpenGL;

/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class118 {
	static int anInt975;
	private Class336 aClass336_976;
	private ha_Sub1 aHa_Sub1_977;
	static int anInt978 = 0;
	static int anInt979;
	static int anInt980 = -1;

	static final void method2170(final int i, String string) {
		try {
			if (string != null) {
				if (string.startsWith("*")) {
					string = string.substring(1);
				}
				final String string_0_ = Class353.method3867(-1, string);
				if (string_0_ != null) {
					if (i < 25) {
						anInt978 = -32;
					}
					for (int i_1_ = 0; Class314.anInt2692 > i_1_; i_1_++) {
						String string_2_ = Class98_Sub25.aStringArray4026[i_1_];
						if (string_2_.startsWith("*")) {
							string_2_ = string_2_.substring(1);
						}
						string_2_ = Class353.method3867(-1, string_2_);
						if (string_2_ != null && string_2_.equals(string_0_)) {
							Class314.anInt2692--;
							for (int i_3_ = i_1_; ((Class314.anInt2692 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
								Class98_Sub25.aStringArray4026[i_3_] = Class98_Sub25.aStringArray4026[1 + i_3_];
								Class315.aStringArray3527[i_3_] = Class315.aStringArray3527[1 + i_3_];
								Class98_Sub26.anIntArray4030[i_3_] = Class98_Sub26.anIntArray4030[1 + i_3_];
								Class98_Sub10_Sub17.aStringArray5625[i_3_] = (Class98_Sub10_Sub17.aStringArray5625[i_3_ + 1]);
								Class69.anIntArray3222[i_3_] = Class69.anIntArray3222[1 + i_3_];
								aa_Sub3.aBooleanArray3575[i_3_] = aa_Sub3.aBooleanArray3575[1 + i_3_];
							}
							Class363.anInt3099 = Class24.anInt242;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, r_Sub2.aClass171_6330,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
									r_Sub2.method1650(string, (byte) 75), 67);
							class98_sub11.aClass98_Sub22_Sub1_3865.method1188(
									string, (byte) 113);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							break;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hk.D(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	Class118(final ha_Sub1 var_ha_Sub1) {
		try {
			aHa_Sub1_977 = var_ha_Sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hk.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean method2171(final boolean bool) {
		try {
			if (bool != true) {
				anInt980 = -111;
			}
			if (aHa_Sub1_977.aBoolean4460 && aHa_Sub1_977.aBoolean4447
					&& aClass336_976 == null) {
				final Class345 class345 = (Class246_Sub3_Sub1_Sub1
						.method2996(
								35632,
								aHa_Sub1_977,
								false,
								"uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
				if (class345 != null) {
					aClass336_976 = Class177.method2584(aHa_Sub1_977,
							new Class345[] { class345 }, bool);
				}
			}
			if (aClass336_976 == null) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hk.C(" + bool
					+ ')');
		}
	}

	final boolean method2172(final int i, final Class42_Sub4 class42_sub4,
			final float f, final Class42_Sub4 class42_sub4_4_) {
		try {
			if (!method2171(true)) {
				return false;
			}
			final Class288 class288 = aHa_Sub1_977.aClass288_4363;
			final Class98_Sub46_Sub14 class98_sub46_sub14 = new Class98_Sub46_Sub14(
					aHa_Sub1_977, 6408, (class42_sub4_4_.anInt5369),
					(class42_sub4_4_.anInt5372));
			boolean bool = false;
			aHa_Sub1_977.method1898(true, class288);
			class288.method3406((byte) 120, 0, class98_sub46_sub14);
			if (class288.method3403((byte) 74)) {
				OpenGL.glPushMatrix();
				OpenGL.glLoadIdentity();
				OpenGL.glMatrixMode(5889);
				OpenGL.glPushMatrix();
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glPushAttrib(2048);
				OpenGL.glViewport(0, 0, class42_sub4_4_.anInt5369,
						class42_sub4_4_.anInt5372);
				OpenGL.glUseProgramObjectARB(aClass336_976.aLong2821);
				OpenGL.glUniform1iARB((OpenGL.glGetUniformLocationARB(
						aClass336_976.aLong2821, "heightMap")), 0);
				OpenGL.glUniform1fARB((OpenGL.glGetUniformLocationARB(
						aClass336_976.aLong2821, "rcpRelief")), 1.0F / f);
				OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(
						(aClass336_976.aLong2821), "sampleSize"),
						1.0F / class42_sub4.anInt5369,
						1.0F / class42_sub4.anInt5372);
				for (int i_5_ = 0; i_5_ < class42_sub4_4_.anInt5368; i_5_++) {
					final float f_6_ = ((float) i_5_ / (float) (class42_sub4_4_.anInt5368));
					aHa_Sub1_977.method1863(1, class42_sub4);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord3f(0.0F, 0.0F, f_6_);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3f(1.0F, 0.0F, f_6_);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3f(1.0F, 1.0F, f_6_);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3f(0.0F, 1.0F, f_6_);
					OpenGL.glVertex2f(0.0F, 1.0F);
					OpenGL.glEnd();
					class42_sub4_4_.method395(0, 0, i_5_, i, 0,
							(class42_sub4_4_.anInt5369),
							(class42_sub4_4_.anInt5372), 0);
				}
				OpenGL.glUseProgramObjectARB(0L);
				OpenGL.glPopAttrib();
				OpenGL.glPopMatrix();
				OpenGL.glMatrixMode(5888);
				bool = true;
				OpenGL.glPopMatrix();
			}
			class288.method3401(i, true);
			aHa_Sub1_977.method1907(class288, -1);
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hk.A(" + i + ','
					+ (class42_sub4 != null ? "{...}" : "null") + ',' + f + ','
					+ (class42_sub4_4_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2173(final boolean bool, final int i) {
		try {
			do {
				if (bool && Class278.aClass98_Sub46_Sub10_2056 != null) {
					Class98_Sub22_Sub1.anInt5789 = Class278.aClass98_Sub46_Sub10_2056.anInt6014;
					if (!client.aBoolean3553) {
						break;
					}
				}
				Class98_Sub22_Sub1.anInt5789 = -1;
			} while (false);
			Class11.aClass293_120 = null;
			Class212.anInt1600 = 0;
			Class278.aClass98_Sub46_Sub10_2056 = null;
			Class8.aClass148_110 = null;
			Class278.method3299();
			Class278.aClass148_2065.method2422((byte) 47);
			Class339_Sub1.aClass326_5308 = null;
			Class339_Sub1.aClass326_5315 = null;
			Class152.aClass332_1221 = null;
			Class224.aClass326_1686 = null;
			Class151_Sub7.aClass326_5009 = null;
			Class278.aClass370_2066 = null;
			Class101.anInt849 = -1;
			Class260.aClass326_3263 = null;
			Class169.anInt1307 = -1;
			Class271.aClass326_2033 = null;
			Class77_Sub1.aClass326_3805 = null;
			Class137.aClass326_1080 = null;
			if (Class278.aClass341_2057 != null) {
				Class278.aClass341_2057.method3808(0);
				Class278.aClass341_2057.method3809(64, -30502, 128);
			}
			if (Class278.aClass335_2059 != null) {
				Class278.aClass335_2059.method3771(109, 64, 64);
			}
			if (Class278.aClass302_2062 != null) {
				Class278.aClass302_2062.method3550(-129, 64);
			}
			Class17.aClass198_205.method2679(64, (byte) -91);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hk.B(" + bool
					+ ',' + i + ')');
		}
	}
}
