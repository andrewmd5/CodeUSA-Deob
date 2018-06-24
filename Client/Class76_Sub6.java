/* Class76_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;

final class Class76_Sub6 extends Class76 {
	private IDirect3DVertexShader anIDirect3DVertexShader3749;
	private IDirect3DVertexShader anIDirect3DVertexShader3750;
	private boolean aBoolean3751;
	private static float[] aFloatArray3752 = new float[4];
	private IDirect3DVertexShader anIDirect3DVertexShader3753;
	private ha_Sub3_Sub1 aHa_Sub3_Sub1_3754;
	private Interface4_Impl2 anInterface4_Impl2_3755;
	private IDirect3DVertexShader anIDirect3DVertexShader3756;
	private boolean aBoolean3757;
	private static float[] aFloatArray3758 = new float[16];
	private IDirect3DVertexShader anIDirect3DVertexShader3759;
	private boolean aBoolean3760 = false;

	@Override
	final void method740(final int i) {
		try {
			if (i > -49) {
				aBoolean3760 = false;
			}
			if (null != anIDirect3DVertexShader3750) {
				final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
				idirect3ddevice.a(4,
						aHa_Sub3_585.method2040(aFloatArray3758, 32227));
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method738(final int i) {
		try {
			if (i > -45) {
				anIDirect3DVertexShader3750 = null;
			}
			if (null != anIDirect3DVertexShader3750) {
				final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
				final int i_0_ = aHa_Sub3_585.XA();
				final int i_1_ = aHa_Sub3_585.i();
				final float f = i_0_ - (i_0_ - i_1_) * 0.125F;
				final float f_2_ = -(0.25F * (i_0_ - i_1_)) + i_0_;
				idirect3ddevice.b(10, f_2_, 1.0F / (f - f_2_), f,
						1.0F / (i_0_ - f));
				idirect3ddevice
						.b(11,
								1.0F / aHa_Sub3_585.method1948(126),
								aHa_Sub3_585.method2018((byte) 122) / 255.0F,
								aHa_Sub3_585.aFloat4592,
								1.0F / ((aHa_Sub3_585.aFloat4592) - (aHa_Sub3_585.aFloat4615)));
				aHa_Sub3_585.method1984(2, aHa_Sub3_585.method1998((byte) 92));
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final void method760(final boolean bool) {
		do {
			try {
				if (bool != true) {
					method749(-31);
				}
				if (null == anIDirect3DVertexShader3750) {
					break;
				}
				if (aBoolean3751) {
					final Class111_Sub3 class111_sub3 = aHa_Sub3_585
							.method2023(1);
					final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
					idirect3ddevice
							.b(13,
									((aHa_Sub3_585.aFloat4576) * (aHa_Sub3_585.aFloat4611)),
									((aHa_Sub3_585.aFloat4576) * (aHa_Sub3_585.aFloat4549)),
									((aHa_Sub3_585.aFloat4591) * (aHa_Sub3_585.aFloat4576)),
									1.0F);
					idirect3ddevice
							.b(14,
									((aHa_Sub3_585.aFloat4630) * (aHa_Sub3_585.aFloat4611)),
									((aHa_Sub3_585.aFloat4549) * (aHa_Sub3_585.aFloat4630)),
									((aHa_Sub3_585.aFloat4630) * (aHa_Sub3_585.aFloat4591)),
									1.0F);
					idirect3ddevice
							.b(16,
									((aHa_Sub3_585.aFloat4611) * (aHa_Sub3_585.aFloat4594)),
									((aHa_Sub3_585.aFloat4594) * (aHa_Sub3_585.aFloat4549)),
									((aHa_Sub3_585.aFloat4594) * (aHa_Sub3_585.aFloat4591)),
									1.0F);
					class111_sub3.method2134(-19890,
							(aHa_Sub3_585.aFloatArray4596[0]),
							(aHa_Sub3_585.aFloatArray4596[2]), aFloatArray3752,
							(aHa_Sub3_585.aFloatArray4596[1]));
					idirect3ddevice.SetVertexShaderConstantF(15,
							aFloatArray3752, 1);
					class111_sub3.method2134(-19890,
							(aHa_Sub3_585.aFloatArray4572[0]),
							(aHa_Sub3_585.aFloatArray4572[2]), aFloatArray3752,
							(aHa_Sub3_585.aFloatArray4572[1]));
					idirect3ddevice.SetVertexShaderConstantF(17,
							aFloatArray3752, 1);
				}
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method742(final int i, final int i_3_,
			final Interface4 interface4) {
		do {
			try {
				if (null == interface4) {
					if (!aBoolean3760) {
						aHa_Sub3_585.method2005(
								(aHa_Sub3_585.anInterface4_4586), 98);
						aHa_Sub3_585.method2015(1, (byte) -99);
						aHa_Sub3_585.method2051(0, -115,
								IncomingOpcode.aClass65_459);
						aHa_Sub3_585.method1953(-121,
								IncomingOpcode.aClass65_459, 0);
						aBoolean3760 = true;
					}
				} else {
					if (aBoolean3760) {
						aHa_Sub3_585.method2051(0, -80, Class300.aClass65_2499);
						aHa_Sub3_585.method1953(-72, Class300.aClass65_2499, 0);
						aBoolean3760 = false;
					}
					aHa_Sub3_585.method2005(interface4, i ^ ~0x73);
					aHa_Sub3_585.method2015(i_3_, (byte) 92);
				}
				if (i == 6) {
					break;
				}
				method748(-96, true);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method739(final int i) {
		do {
			try {
				aHa_Sub3_585.method1951((byte) 120, 1);
				aHa_Sub3_585.method2005(null, -123);
				aHa_Sub3_585.method2019(Class249.aClass128_1903,
						Class249.aClass128_1903, 22831);
				aHa_Sub3_585.method2051(0, -70, Class300.aClass65_2499);
				aHa_Sub3_585.method2051(2, -81, Class64_Sub16.aClass65_3681);
				aHa_Sub3_585.method1953(-108, Class300.aClass65_2499, 0);
				aHa_Sub3_585.method1951((byte) 120, 0);
				if (aBoolean3760) {
					aHa_Sub3_585.method2051(0, -115, Class300.aClass65_2499);
					aHa_Sub3_585.method1953(-82, Class300.aClass65_2499, 0);
					aBoolean3760 = false;
				}
				if (i != -2) {
					method747(96);
				}
				if (null == anIDirect3DVertexShader3750) {
					break;
				}
				aHa_Sub3_Sub1_3754.method2070(null, true);
				anIDirect3DVertexShader3750 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final boolean method745(final byte i) {
		boolean bool;
		try {
			if (i != 27) {
				method746(-54, -30, -35);
			}
			bool = aBoolean3757;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	@Override
	final void method746(final int i, final int i_4_, final int i_5_) {
		do {
			try {
				if (i_5_ <= -75) {
					break;
				}
				aBoolean3757 = false;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method741(final byte i) {
		try {
			if (null != anIDirect3DVertexShader3750) {
				final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
				final Class111_Sub3 class111_sub3 = aHa_Sub3_Sub1_3754
						.method2027(0);
				idirect3ddevice.a(0,
						class111_sub3.method2128(123, aFloatArray3758));
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method748(final int i, final boolean bool) {
		try {
			aBoolean3751 = bool;
			aHa_Sub3_585.method1951((byte) 120, 1);
			aHa_Sub3_585.method2005(anInterface4_Impl2_3755, 63);
			aHa_Sub3_585.method2019(Class288.aClass128_3381,
					Class323.aClass128_2715, i + 22762);
			aHa_Sub3_585.method2051(0, i ^ ~0x3c, Class64_Sub16.aClass65_3681);
			aHa_Sub3_585.method2026(2, true, (byte) 27, Class300.aClass65_2499,
					false);
			aHa_Sub3_585.method1953(-76, IncomingOpcode.aClass65_459, 0);
			aHa_Sub3_585.method1951((byte) 120, 0);
			if (i == 69) {
				method747(-25684);
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method743(final int i, final boolean bool) {
		do {
			try {
				if (i > 93) {
					break;
				}
				aFloatArray3752 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	Class76_Sub6(final ha_Sub3_Sub1 var_ha_Sub3_Sub1, final Class207 class207) {
		super(var_ha_Sub3_Sub1);
		try {
			aHa_Sub3_Sub1_3754 = var_ha_Sub3_Sub1;
			if (class207 == null
					|| -258 < ((aHa_Sub3_Sub1_3754.aD3DCAPS6093.VertexShaderVersion) & 0xffff ^ 0xffffffff)) {
				aBoolean3757 = false;
			} else {
				anIDirect3DVertexShader3759 = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098
						.a(class207.method2739("dx", "uw_ground_unlit", -32734)));
				anIDirect3DVertexShader3753 = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098
						.a(class207.method2739("dx", "uw_ground_lit", -32734)));
				anIDirect3DVertexShader3749 = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098
						.a(class207.method2739("dx", "uw_model_unlit", -32734)));
				anIDirect3DVertexShader3756 = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098
						.a(class207.method2739("dx", "uw_model_lit", -32734)));
				if (anIDirect3DVertexShader3756 != null
						& (anIDirect3DVertexShader3753 != null
								& null != anIDirect3DVertexShader3759 & anIDirect3DVertexShader3749 != null)) {
					anInterface4_Impl2_3755 = (aHa_Sub3_585.method2012(2, 1,
							(byte) 31, new int[] { 0, -1 }, false));
					anInterface4_Impl2_3755.method46(false, false, 76);
					aBoolean3757 = true;
				} else {
					aBoolean3757 = false;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method737(final int i) {
		do {
			try {
				if (anIDirect3DVertexShader3750 != null) {
					final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
					final Class111_Sub3 class111_sub3 = aHa_Sub3_Sub1_3754
							.method2027(0);
					idirect3ddevice.a(0,
							class111_sub3.method2128(126, aFloatArray3758));
				}
				if (i == 2899) {
					break;
				}
				method741((byte) -1);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method747(final int i) {
		try {
			if (i == -25684) {
				final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
				final int i_7_ = aHa_Sub3_585.method2017((byte) 67);
				final Class111_Sub3 class111_sub3 = aHa_Sub3_585
						.method1956((byte) -127);
				IDirect3DVertexShader idirect3dvertexshader;
				if (!aBoolean3751) {
					idirect3dvertexshader = (i_7_ == 2147483647 ? anIDirect3DVertexShader3759
							: anIDirect3DVertexShader3749);
				} else {
					idirect3dvertexshader = (-2147483648 != (i_7_ ^ 0xffffffff) ? anIDirect3DVertexShader3756
							: anIDirect3DVertexShader3753);
				}
				if (anIDirect3DVertexShader3750 != idirect3dvertexshader) {
					anIDirect3DVertexShader3750 = idirect3dvertexshader;
					aHa_Sub3_Sub1_3754.method2070(idirect3dvertexshader, true);
					method760(true);
					method740(-101);
					method749(8);
					method741((byte) -124);
					method737(2899);
					method738(-57);
				}
				class111_sub3.method2120((byte) 18, 0.0F, -1.0F, i_7_,
						aFloatArray3752, 0.0F);
				idirect3ddevice.a(12, aFloatArray3752);
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method749(final int i) {
		do {
			try {
				if (null != anIDirect3DVertexShader3750) {
					final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3754.anIDirect3DDevice6098);
					final Class111_Sub3 class111_sub3 = aHa_Sub3_585
							.method2061(i + -7);
					idirect3ddevice.SetVertexShaderConstantF(8,
							class111_sub3.method2129(aFloatArray3758, 4), 2);
				}
				if (i == 8) {
					break;
				}
				anIDirect3DVertexShader3749 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}
}
