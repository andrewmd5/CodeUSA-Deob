/* Class151_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class151_Sub9 extends Class151 {
	private Class202 aClass202_5017;
	private boolean aBoolean5018;
	static int[] anIntArray5019;
	static int anInt5020 = 0;
	private boolean aBoolean5021;
	private Class202 aClass202_5022;
	static Class348 aClass348_5023;
	private boolean aBoolean5024 = false;
	private Class202 aClass202_5025;
	private boolean aBoolean5026;
	private Class42_Sub1 aClass42_Sub1_5027;
	static int anInt5028;
	private Class202 aClass202_5029;
	static Class246_Sub3_Sub4_Sub2_Sub2[] aClass246_Sub3_Sub4_Sub2_Sub2Array5030;

	Class151_Sub9(ha_Sub1 var_ha_Sub1) {
		super(var_ha_Sub1);
		try {
			if (((ha_Sub1) ((Class151) this).aHa_Sub1_1215).aBoolean4431) {
				aClass202_5022 = (Class347
						.method3835(
								0,
								((Class151) this).aHa_Sub1_1215,
								34336,
								"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
				aClass202_5029 = (Class347
						.method3835(
								0,
								((Class151) this).aHa_Sub1_1215,
								34336,
								"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
				aClass202_5025 = (Class347
						.method3835(
								0,
								((Class151) this).aHa_Sub1_1215,
								34336,
								"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
				aClass202_5017 = (Class347
						.method3835(
								0,
								((Class151) this).aHa_Sub1_1215,
								34336,
								"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
				if (!(aClass202_5017 != null & (aClass202_5025 != null & (aClass202_5029 != null & aClass202_5022 != null))))
					aBoolean5018 = false;
				else {
					aClass42_Sub1_5027 = new Class42_Sub1(var_ha_Sub1, 3553,
							6406, 2, 1, false, new byte[] { 0, -1 }, 6406,
							false);
					aClass42_Sub1_5027.method383(false, 10242, false);
					aBoolean5018 = true;
				}
			} else
				aBoolean5018 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ws.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean method2439(int i) {
		try {
			if (i != 31565)
				aBoolean5021 = true;
			return aBoolean5018;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ws.A(" + i + ')');
		}
	}

	final void method2441(int i, int i_0_, int i_1_) {
		do {
			try {
				if (i_1_ <= -2)
					break;
				method2445((byte) -6);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ws.G(" + i
						+ ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method2469(int i) {
		try {
			anIntArray5019 = null;
			aClass246_Sub3_Sub4_Sub2_Sub2Array5030 = null;
			if (i == 2147483647)
				aClass348_5023 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ws.B(" + i + ')');
		}
	}

	final void method2470(int i) {
		try {
			if (i != -16661)
				anInt5020 = 117;
			if (aBoolean5026) {
				int i_2_ = ((Class151) this).aHa_Sub1_1215.XA();
				int i_3_ = ((Class151) this).aHa_Sub1_1215.i();
				float f = (float) i_2_ - 0.125F * (float) (-i_3_ + i_2_);
				float f_4_ = -((float) (i_2_ + -i_3_) * 0.25F) + (float) i_2_;
				OpenGL.glProgramLocalParameter4fARB(
						34336,
						0,
						f_4_,
						f,
						1.0F / (float) ((ha_Sub1) (((Class151) this).aHa_Sub1_1215)).anInt4454,
						(float) (((ha_Sub1) ((Class151) this).aHa_Sub1_1215).anInt4453) / 255.0F);
				((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
				((Class151) this).aHa_Sub1_1215.method1882(
						((ha_Sub1) ((Class151) this).aHa_Sub1_1215).anInt4423,
						-104);
				((Class151) this).aHa_Sub1_1215.method1845(0, i ^ ~0x3289c27c);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ws.I(" + i + ')');
		}
	}

	final void method2471(byte i) {
		try {
			Class111_Sub1 class111_sub1 = (((ha_Sub1) ((Class151) this).aHa_Sub1_1215).aClass111_Sub1_4353);
			do {
				if (!aBoolean5021) {
					OpenGL.glBindProgramARB(
							34336,
							((((ha_Sub1) ((Class151) this).aHa_Sub1_1215).anInt4362) == 2147483647 ? ((Class202) aClass202_5022).anInt1549
									: ((Class202) aClass202_5025).anInt1549));
					if (!client.aBoolean3553)
						break;
				}
				OpenGL.glBindProgramARB(
						34336,
						((((ha_Sub1) ((Class151) this).aHa_Sub1_1215).anInt4362 != 2147483647) ? ((Class202) aClass202_5017).anInt1549
								: ((Class202) aClass202_5029).anInt1549));
			} while (false);
			class111_sub1
					.method2109(
							-29834,
							0.0F,
							(float) (((ha_Sub1) ((Class151) this).aHa_Sub1_1215).anInt4362),
							0.0F, -1.0F, Class222.aFloatArray1671);
			if (i == 34) {
				OpenGL.glProgramLocalParameter4fARB(34336, 1,
						Class222.aFloatArray1671[0],
						Class222.aFloatArray1671[1],
						Class222.aFloatArray1671[2],
						Class222.aFloatArray1671[3]);
				OpenGL.glEnable(34336);
				aBoolean5026 = true;
				method2470(-16661);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ws.J(" + i + ')');
		}
	}

	final void method2443(boolean bool, int i) {
		do {
			try {
				if (i == 255)
					break;
				method2442(null, false, -47);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ws.C(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method2440(boolean bool, boolean bool_5_) {
		try {
			aBoolean5021 = bool_5_;
			((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
			((Class151) this).aHa_Sub1_1215.method1863(1, aClass42_Sub1_5027);
			if (bool != false)
				aBoolean5018 = false;
			((Class151) this).aHa_Sub1_1215.method1899(7681, 8960, 34165);
			((Class151) this).aHa_Sub1_1215.method1840(0, 768, 108, 34166);
			((Class151) this).aHa_Sub1_1215.method1840(2, 770, 113, 5890);
			((Class151) this).aHa_Sub1_1215.method1886(770, 0, 34200, 34168);
			((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
			method2471((byte) 34);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ws.D(" + bool
					+ ',' + bool_5_ + ')'));
		}
	}

	final void method2445(byte i) {
		do {
			try {
				if (aBoolean5026) {
					OpenGL.glBindProgramARB(34336, 0);
					OpenGL.glDisable(34820);
					OpenGL.glDisable(34336);
					aBoolean5026 = false;
				}
				((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
				((Class151) this).aHa_Sub1_1215.method1863(1, null);
				((Class151) this).aHa_Sub1_1215.method1899(8448, 8960, 8448);
				((Class151) this).aHa_Sub1_1215.method1840(0, 768, -107, 5890);
				((Class151) this).aHa_Sub1_1215.method1840(2, 770, 104, 34166);
				((Class151) this).aHa_Sub1_1215.method1886(770, 0, 34200, 5890);
				if (i <= 25)
					anInt5020 = -23;
				((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
				if (!aBoolean5024)
					break;
				((Class151) this).aHa_Sub1_1215.method1840(0, 768, 117, 5890);
				((Class151) this).aHa_Sub1_1215.method1886(770, 0, 34200, 5890);
				aBoolean5024 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ws.E(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method2472(boolean bool, String string, int i,
			boolean bool_6_) {
		try {
			Class98_Sub43_Sub1.method1493(57);
			Class98_Sub36.method1458(-24580);
			Class98_Sub43_Sub4.method1510(28837);
			Class320.method3665((byte) 69, string, i, bool_6_);
			Class378.method4001((byte) -34);
			Class98_Sub10_Sub19.method1058((byte) -85, Class265.aHa1974);
			Class93_Sub2.method910(Class265.aHa1974, (byte) -48);
			NPC.method2303(Class265.aHa1974, (byte) -124,
					Class332_Sub2.aClass207_5423);
			Class48_Sub1_Sub2.method466(bool);
			Class303.method3556(Class64_Sub18.aClass332Array3689, 0);
			Class98_Sub43.method1481(2);
			Class98_Sub46_Sub13_Sub1.method1593((byte) 115);
			if ((Class177.anInt1376 ^ 0xffffffff) != -4) {
				if ((Class177.anInt1376 ^ 0xffffffff) != -8) {
					if (Class177.anInt1376 != 10) {
						if (Class177.anInt1376 == 1
								|| (Class177.anInt1376 ^ 0xffffffff) == -3)
							Class266.method3235((byte) -121);
					} else
						Class61.method538(11, false);
				} else
					Class61.method538(8, false);
			} else
				Class61.method538(4, false);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ws.H(" + bool
					+ ',' + (string != null ? "{...}" : "null") + ',' + i + ','
					+ bool_6_ + ')'));
		}
	}

	final void method2442(Class42 class42, boolean bool, int i) {
		do {
			try {
				if (bool == false) {
					if (class42 != null) {
						if (aBoolean5024) {
							((Class151) this).aHa_Sub1_1215.method1840(0, 768,
									74, 5890);
							((Class151) this).aHa_Sub1_1215.method1886(770, 0,
									34200, 5890);
							aBoolean5024 = false;
						}
						((Class151) this).aHa_Sub1_1215.method1863(1, class42);
						((Class151) this).aHa_Sub1_1215.method1896(260, i);
					} else {
						if (aBoolean5024)
							break;
						((Class151) this).aHa_Sub1_1215
								.method1863(
										1,
										(((ha_Sub1) ((Class151) this).aHa_Sub1_1215).aClass42_Sub1_4358));
						((Class151) this).aHa_Sub1_1215.method1896(260, 1);
						((Class151) this).aHa_Sub1_1215.method1840(0, 768, -50,
								34168);
						((Class151) this).aHa_Sub1_1215.method1886(770, 0,
								34200, 34168);
						aBoolean5024 = true;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ws.F("
						+ (class42 != null ? "{...}" : "null") + ',' + bool
						+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static {
		anIntArray5019 = new int[8];
		aClass348_5023 = new Class348(0, 2, 2, 1);
		anInt5028 = 0;
		aClass246_Sub3_Sub4_Sub2_Sub2Array5030 = new Class246_Sub3_Sub4_Sub2_Sub2[2048];
	}
}
