/* Class76_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;

final class Class76_Sub1 extends Class76 {
	private Class195 aClass195_3721;
	private boolean aBoolean3722;
	private IDirect3DPixelShader anIDirect3DPixelShader3723;
	private static float[] aFloatArray3724 = new float[16];
	private boolean aBoolean3725;
	private IDirect3DVertexShader anIDirect3DVertexShader3726;
	private ha_Sub3_Sub1 aHa_Sub3_Sub1_3727;

	@Override
	final void method742(final int i, final int i_0_,
			final Interface4 interface4) {
		do {
			try {
				if (i == 6) {
					break;
				}
				method738(72);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method738(final int i) {
		do {
			try {
				if (i > -45) {
					aBoolean3722 = true;
				}
				if (!aBoolean3725) {
					break;
				}
				final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3727.anIDirect3DDevice6098);
				if (-1 <= ((aHa_Sub3_585.anInt4581) ^ 0xffffffff)) {
					idirect3ddevice.b(16, 0.0F, 0.0F, 0.0F, 0.0F);
				} else {
					final float f = (aHa_Sub3_585.aFloat4592);
					final float f_1_ = (aHa_Sub3_585.aFloat4615);
					idirect3ddevice.b(16, f, 1.0F / (f - f_1_), 0.0F, 0.0F);
				}
				idirect3ddevice
						.a(0,
								((0xff21e2 & (aHa_Sub3_585).anInt4636) >> -2101860432) / 255.0F,
								(((aHa_Sub3_585.anInt4636) & 0xff68) >> 1976566696) / 255.0F,
								(0xff & (aHa_Sub3_585.anInt4636)) / 255.0F,
								0.0F);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method741(final byte i) {
		try {
			if (aBoolean3725) {
				final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3727.anIDirect3DDevice6098);
				final Class111_Sub3 class111_sub3 = aHa_Sub3_Sub1_3727
						.method2027(0);
				idirect3ddevice.a(0,
						class111_sub3.method2128(109, aFloatArray3724));
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method737(final int i) {
		do {
			try {
				if (i != 2899) {
					anIDirect3DVertexShader3726 = null;
				}
				if (!aBoolean3725) {
					break;
				}
				final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3727.anIDirect3DDevice6098);
				final Class111_Sub3 class111_sub3 = aHa_Sub3_Sub1_3727
						.method1956((byte) 78);
				final Class111_Sub3 class111_sub3_3_ = aHa_Sub3_Sub1_3727
						.method2027(0);
				idirect3ddevice.a(0,
						class111_sub3_3_.method2128(122, aFloatArray3724));
				idirect3ddevice.a(4,
						class111_sub3.method2125(aFloatArray3724, (byte) -80));
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method743(final int i, final boolean bool) {
		do {
			try {
				if (i > 93) {
					break;
				}
				aFloatArray3724 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	Class76_Sub1(final ha_Sub3_Sub1 var_ha_Sub3_Sub1, final Class207 class207,
			final Class195 class195) {
		super(var_ha_Sub3_Sub1);
		try {
			aClass195_3721 = class195;
			aHa_Sub3_Sub1_3727 = var_ha_Sub3_Sub1;
			if (null == class207
					|| !aHa_Sub3_585.aBoolean4569
					|| !aHa_Sub3_585.aBoolean4588
					|| (0xffff & (aHa_Sub3_Sub1_3727.aD3DCAPS6093.VertexShaderVersion)) < 257) {
				anIDirect3DVertexShader3726 = null;
				aBoolean3722 = false;
				anIDirect3DPixelShader3723 = null;
			} else {
				anIDirect3DVertexShader3726 = (aHa_Sub3_Sub1_3727.anIDirect3DDevice6098
						.a(class207.method2739("dx",
								"environment_mapped_water_v", -32734)));
				anIDirect3DPixelShader3723 = (aHa_Sub3_Sub1_3727.anIDirect3DDevice6098
						.b(class207.method2739("dx",
								"environment_mapped_water_f", -32734)));
				aBoolean3722 = (null != anIDirect3DVertexShader3726
						&& null != anIDirect3DPixelShader3723 && aClass195_3721
						.method2664(-119));
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method749(final int i) {
		do {
			try {
				if (aBoolean3725) {
					final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3727.anIDirect3DDevice6098);
					final Class111_Sub3 class111_sub3 = aHa_Sub3_585
							.method2061(i + -7);
					idirect3ddevice.SetVertexShaderConstantF(12,
							class111_sub3.method2129(aFloatArray3724, 4), 2);
				}
				if (i == 8) {
					break;
				}
				aHa_Sub3_Sub1_3727 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method740(final int i) {
		do {
			try {
				if (aBoolean3725) {
					final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3727.anIDirect3DDevice6098);
					idirect3ddevice.a(8,
							aHa_Sub3_585.method2040(aFloatArray3724, 32227));
				}
				if (i < -49) {
					break;
				}
				aBoolean3722 = false;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method746(final int i, final int i_4_, final int i_5_) {
		do {
			try {
				if (aBoolean3725) {
					final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3727.anIDirect3DDevice6098);
					final int i_6_ = 1 << (i & 0x3);
					final float f = (1 << ((i & 0x3a) >> 1073146595)) / 32.0F;
					final int i_7_ = 0xffff & i_4_;
					final float f_8_ = ((0x367af & i_4_) >> 1913070960) / 8.0F;
					idirect3ddevice.b(14, i_6_ * (aHa_Sub3_585).anInt4556
							% 40000 / 40000.0F, 0.0F, 0.0F, 0.0F);
					idirect3ddevice.b(15, f, 0.0F, 0.0F, 0.0F);
					idirect3ddevice.a(4, i_7_, 0.0F, 0.0F, 0.0F);
					idirect3ddevice.a(5, f_8_, 0.0F, 0.0F, 0.0F);
				}
				if (i_5_ <= -75) {
					break;
				}
				method746(0, -115, -17);
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
				if (aBoolean3725) {
					aHa_Sub3_Sub1_3727.method2070(null, true);
					aHa_Sub3_Sub1_3727.method2075(28, null);
					aHa_Sub3_585.method1951((byte) 120, 1);
					aHa_Sub3_585.method2005(null, -127);
					aHa_Sub3_585.method1951((byte) 120, 0);
					aHa_Sub3_585.method2005(null, 39);
					aBoolean3725 = false;
				}
				if (i == -2) {
					break;
				}
				method741((byte) -37);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method748(final int i, final boolean bool) {
		do {
			try {
				final Interface4_Impl3 interface4_impl3 = aHa_Sub3_585
						.method1939(-113);
				if (aBoolean3722 && interface4_impl3 != null) {
					final IDirect3DDevice idirect3ddevice = (aHa_Sub3_Sub1_3727.anIDirect3DDevice6098);
					aHa_Sub3_Sub1_3727.method2070(anIDirect3DVertexShader3726,
							true);
					aHa_Sub3_Sub1_3727.method2075(28,
							anIDirect3DPixelShader3723);
					aHa_Sub3_585.method1951((byte) 120, 1);
					aHa_Sub3_585.method2005(interface4_impl3, 7);
					aHa_Sub3_585.method1951((byte) 120, 0);
					aHa_Sub3_585.method2005(
							aClass195_3721.anInterface4_Impl1_1500, i ^ ~0x3e);
					aBoolean3725 = true;
					method737(2899);
					method749(8);
					method740(-71);
					method738(i ^ ~0x72);
					idirect3ddevice.a(1, -(aHa_Sub3_585.aFloatArray4596[0]),
							-(aHa_Sub3_585.aFloatArray4596[1]),
							-(aHa_Sub3_585.aFloatArray4596[2]), 0.0F);
					idirect3ddevice.a(2, (aHa_Sub3_585).aFloat4611,
							(aHa_Sub3_585).aFloat4549,
							(aHa_Sub3_585).aFloat4591, 1.0F);
					idirect3ddevice
							.a(3,
									(Math.abs(aHa_Sub3_585.aFloatArray4596[1]) * 928.0F + 96.0F),
									0.0F, 0.0F, 0.0F);
				}
				if (i == 69) {
					break;
				}
				method741((byte) -113);
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
				method740(103);
			}
			bool = aBoolean3722;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}
}
