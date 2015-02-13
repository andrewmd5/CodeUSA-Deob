import jaggl.OpenGL;

/* Class151_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class151_Sub4 extends Class151 {
	private Class51 aClass51_4984;
	static int[] anIntArray4985 = new int[256];
	private Class336 aClass336_4986;
	private boolean aBoolean4987;
	private boolean aBoolean4988 = false;
	static float aFloat4989;

	@Override
	final void method2442(final Class42 class42, final boolean bool, final int i) {
		do {
			try {
				if (!aBoolean4987) {
					((Class151) this).aHa_Sub1_1215.method1863(1, class42);
					((Class151) this).aHa_Sub1_1215.method1896(260, i);
				}
				if (bool == false) {
					break;
				}
				aBoolean4988 = false;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lg.F("
						+ (class42 != null ? "{...}" : "null") + ',' + bool
						+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	Class151_Sub4(final ha_Sub1 var_ha_Sub1, final Class51 class51) {
		super(var_ha_Sub1);
		aBoolean4987 = false;
		do {
			try {
				aClass51_4984 = class51;
				if (aClass51_4984.aClass42_Sub4_421 == null
						|| !(((Class151) this).aHa_Sub1_1215.aBoolean4399)
						|| !(((Class151) this).aHa_Sub1_1215.aBoolean4447)) {
					break;
				}
				final Class345 class345 = (Class246_Sub3_Sub1_Sub1
						.method2996(
								35633,
								((Class151) this).aHa_Sub1_1215,
								false,
								"uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
				final Class345 class345_0_ = (Class246_Sub3_Sub1_Sub1
						.method2996(
								35632,
								((Class151) this).aHa_Sub1_1215,
								false,
								"varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
				aClass336_4986 = Class177.method2584(
						((Class151) this).aHa_Sub1_1215, new Class345[] {
								class345, class345_0_ }, true);
				aBoolean4988 = aClass336_4986 != null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lg.<init>("
						+ (var_ha_Sub1 != null ? "{...}" : "null") + ','
						+ (class51 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2460(final int i) {
		do {
			try {
				anIntArray4985 = null;
				if (i == 23777) {
					break;
				}
				method2460(68);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "lg.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final boolean method2439(final int i) {
		try {
			if (i != 31565) {
				method2442(null, false, -85);
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lg.A(" + i + ')');
		}
	}

	@Override
	final void method2441(final int i, final int i_1_, final int i_2_) {
		do {
			try {
				if (aBoolean4987) {
					final int i_3_ = 1 << (i & 0x3);
					final float f = (1 << (i >> 496943907 & 0x7)) / 32.0F;
					final int i_4_ = 0xffff & i_1_;
					final float f_5_ = ((i_1_ & 0x36757) >> 130557328) / 8.0F;
					final long l = aClass336_4986.aLong2821;
					OpenGL.glUniform1fARB(
							OpenGL.glGetUniformLocationARB(l, "time"),
							(((Class151) this).aHa_Sub1_1215.anInt4321) * i_3_
									% 40000 / 40000.0F);
					OpenGL.glUniform1fARB(
							OpenGL.glGetUniformLocationARB(l, "scale"), f);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l,
							"breakWaterDepth"), i_4_);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l,
							"breakWaterOffset"), f_5_);
				}
				if (i_2_ < -2) {
					break;
				}
				method2439(120);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lg.G(" + i
						+ ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method2440(final boolean bool, final boolean bool_6_) {
		do {
			try {
				if (bool == false) {
					final Class42_Sub2 class42_sub2 = ((Class151) this).aHa_Sub1_1215
							.method1827(-125);
					if (!aBoolean4988 || class42_sub2 == null) {
						break;
					}
					((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
					((Class151) this).aHa_Sub1_1215.method1863(1, class42_sub2);
					((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
					((Class151) this).aHa_Sub1_1215.method1863(1,
							aClass51_4984.aClass42_Sub4_421);
					final long l = aClass336_4986.aLong2821;
					OpenGL.glUseProgramObjectARB(l);
					OpenGL.glUniform1iARB(
							OpenGL.glGetUniformLocationARB(l, "normalSampler"),
							0);
					OpenGL.glUniform1iARB(
							OpenGL.glGetUniformLocationARB(l, "envMapSampler"),
							1);
					OpenGL.glUniform3fARB(
							OpenGL.glGetUniformLocationARB(l, "sunDir"),
							-(((Class151) this).aHa_Sub1_1215.aFloatArray4438[0]),
							-(((Class151) this).aHa_Sub1_1215.aFloatArray4438[1]),
							-(((Class151) this).aHa_Sub1_1215.aFloatArray4438[2]));
					OpenGL.glUniform4fARB(
							OpenGL.glGetUniformLocationARB(l, "sunColour"),
							(((Class151) this).aHa_Sub1_1215.aFloat4433),
							(((Class151) this).aHa_Sub1_1215.aFloat4420),
							(((Class151) this).aHa_Sub1_1215.aFloat4458), 1.0F);
					OpenGL.glUniform1fARB(
							OpenGL.glGetUniformLocationARB(l, "sunExponent"),
							Math.abs(((Class151) this).aHa_Sub1_1215.aFloatArray4438[1]) * 928.0F + 96.0F);
					aBoolean4987 = true;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lg.D(" + bool
						+ ',' + bool_6_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method2443(final boolean bool, final int i) {
		try {
			if (i != 255) {
				method2460(-19);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "lg.C(" + bool
					+ ',' + i + ')');
		}
	}

	@Override
	final void method2445(final byte i) {
		do {
			try {
				if (aBoolean4987) {
					((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
					((Class151) this).aHa_Sub1_1215.method1863(1, null);
					((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
					((Class151) this).aHa_Sub1_1215.method1863(1, null);
					OpenGL.glUseProgramObjectARB(0L);
					aBoolean4987 = false;
				}
				if (i > 25) {
					break;
				}
				method2439(-51);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "lg.E(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
