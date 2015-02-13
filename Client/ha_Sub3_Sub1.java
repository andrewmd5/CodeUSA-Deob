/* ha_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.peer.jaa;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.GeometryBuffer;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DVertexShader;
import jagdx.PixelBuffer;
import jagdx.jc;
import jagdx.kg;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;

public final class ha_Sub3_Sub1 extends ha_Sub3 {
	private int anInt6083 = 0;
	private static int[] anIntArray6084;
	private D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS6085;
	GeometryBuffer aGeometryBuffer6086;
	private int[] anIntArray6087;
	private boolean[] aBooleanArray6088;
	private IDirect3D anIDirect3D6089;
	private int anInt6090;
	private IDirect3DVertexShader anIDirect3DVertexShader6091;
	private D3DLIGHT aD3DLIGHT6092;
	D3DCAPS aD3DCAPS6093;
	private boolean[] aBooleanArray6094;
	PixelBuffer aPixelBuffer6095;
	private boolean aBoolean6096 = false;
	boolean aBoolean6097;
	IDirect3DDevice anIDirect3DDevice6098;
	private D3DLIGHT aD3DLIGHT6099;
	private boolean[] aBooleanArray6100;
	private static float[] aFloatArray6101 = new float[16];
	private Class200[] aClass200Array6102;
	private int anInt6103;
	private D3DLIGHT aD3DLIGHT6104;
	private boolean[] aBooleanArray6105;
	private static int[] anIntArray6106 = { 22, 23 };
	boolean aBoolean6107;
	jaa aJaa6108;
	boolean aBoolean6109;
	private Class229 aClass229_6110;

	@Override
	final Interface4_Impl2 method1968(final int i, final int i_0_,
			final boolean bool, final Class164 class164, final int i_1_,
			final int i_2_, final int i_3_, final float[] fs) {
		Interface4_Impl2 interface4_impl2;
		try {
			interface4_impl2 = null;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return interface4_impl2;
	}

	@Override
	final void method1746(final int i, final int i_5_, final int i_6_,
			final int i_7_) {
		/* empty */
	}

	@Override
	final void F(final int i, final int i_8_) {
		/* empty */
	}

	@Override
	final void method2007(final boolean bool) {
		try {
			aFloat4592 = anInt4605 + -anInt4601;
			aFloat4615 = (-anInt4581 + aFloat4592);
			if (bool) {
				anIntArray6106 = null;
			}
			if (aFloat4615 < anInt4640) {
				aFloat4615 = anInt4640;
			}
			anIDirect3DDevice6098.a(36, aFloat4615);
			anIDirect3DDevice6098.a(37, aFloat4592);
			anIDirect3DDevice6098.SetRenderState(34, anInt4636);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method2010(final int i) {
		do {
			try {
				if (null != anIDirect3DVertexShader6091
						|| (Class98_Sub46_Sub19.aClass258_6062 == (aClass258Array4644[anInt4579]))) {
					anIDirect3DDevice6098
							.SetTextureStageState(anInt4579, 24, 0);
					anIntArray6087[anInt4579] = 0;
				} else {
					if (Class246_Sub3_Sub4_Sub5.aClass258_6260 != (aClass258Array4644[anInt4579])) {
						anIDirect3DDevice6098.SetTransform(anInt4579 + 16,
								aClass111_Sub3Array4609[anInt4579].method2121(
										(byte) -91, aFloatArray6101));
					} else {
						anIDirect3DDevice6098.SetTransform(anInt4579 + 16,
								aClass111_Sub3Array4609[anInt4579].method2122(
										aFloatArray6101, 22));
					}
					final int i_10_ = method2071(
							(aClass258Array4644[anInt4579]), 2474);
					if (i_10_ == anIntArray6087[anInt4579]) {
						break;
					}
					anIDirect3DDevice6098.SetTextureStageState(anInt4579, 24,
							i_10_);
					anIntArray6087[anInt4579] = i_10_;
				}
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final Interface2_Impl2 method1990(final byte i, final boolean bool) {
		Class125 class125;
		try {
			if (i != 84) {
				aBooleanArray6094 = null;
			}
			class125 = new Class125(this, Class162.aClass162_1267, bool);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class125;
	}

	@Override
	final void method1773() {
		try {
			aJaa6108.b((byte) -125);
			super.method1773();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method1761(final boolean bool) {
		/* empty */
	}

	@Override
	final void method2021(final int i) {
		try {
			if (!aClass204_4551.method2708(98)) {
				aFloatArray6101[15] = 1.0F;
				aFloatArray6101[1] = 0.0F;
				aFloatArray6101[11] = 0.0F;
				aFloatArray6101[12] = 0.0F;
				aFloatArray6101[8] = 0.0F;
				aFloatArray6101[13] = 0.0F;
				aFloatArray6101[4] = 0.0F;
				aFloatArray6101[5] = 1.0F;
				aFloatArray6101[6] = 0.0F;
				aFloatArray6101[14] = 0.0F;
				aFloatArray6101[7] = 0.0F;
				aFloatArray6101[2] = 0.0F;
				aFloatArray6101[3] = 0.0F;
				aFloatArray6101[0] = 1.0F;
				aFloatArray6101[9] = 0.0F;
				aFloatArray6101[10] = 1.0F;
			} else {
				aClass111_Sub3_4545.method2121((byte) -111, aFloatArray6101);
			}
			if (i == 0) {
				anIDirect3DDevice6098.SetTransform(2, aFloatArray6101);
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final float method2050(final byte i) {
		float f;
		try {
			if (i != 56) {
				return 0.34527656F;
			}
			f = -0.5F;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return f;
	}

	private static final int method2068(final Class65 class65, final byte i) {
		try {
			if (i <= 125) {
				return -28;
			}
			if (class65 == Class300.aClass65_2499) {
				return 2;
			}
			if (class65 != Class98_Sub43_Sub3.aClass65_5926) {
				if (class65 != IncomingOpcode.aClass65_459) {
					if (Class64_Sub16.aClass65_3681 == class65) {
						return 3;
					}
				} else {
					return 1;
				}
			} else {
				return 0;
			}
			throw new IllegalArgumentException();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method1776() {
		/* empty */
	}

	@Override
	final Class62 method1799() {
		Class62 class62;
		try {
			final D3DADAPTER_IDENTIFIER d3dadapter_identifier = anIDirect3D6089
					.b(anInt6103, 0);
			class62 = new Class62(d3dadapter_identifier.VendorID, "Direct3D",
					9, d3dadapter_identifier.Description,
					d3dadapter_identifier.DriverVersion);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class62;
	}

	private static final int method2069(final int i, final Class232 class232) {
		try {
			if (class232 != Class334.aClass232_3468) {
				if (class232 != Class287_Sub1.aClass232_3420) {
					if (class232 == Class224.aClass232_1685) {
						return 1;
					}
					if (Class336.aClass232_2822 != class232) {
						if (Class98_Sub46_Sub15.aClass232_6043 != class232) {
							if (class232 == AnimationDefinition.aClass232_806) {
								return 5;
							}
						} else {
							return 6;
						}
					} else {
						return 4;
					}
				} else {
					return 3;
				}
			} else {
				return 2;
			}
			throw new IllegalArgumentException("");
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method1989(final int i) {
		do {
			try {
				if (aBoolean6096) {
					break;
				}
				anIDirect3DDevice6098.LightEnable(0, false);
				anIDirect3DDevice6098.LightEnable(1, false);
				anIDirect3DDevice6098.SetLight(0, aD3DLIGHT6099);
				anIDirect3DDevice6098.SetLight(1, aD3DLIGHT6104);
				anIDirect3DDevice6098.LightEnable(0, true);
				anIDirect3DDevice6098.LightEnable(1, true);
				aBoolean6096 = true;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method2070(final IDirect3DVertexShader idirect3dvertexshader,
			final boolean bool) {
		do {
			try {
				anIDirect3DVertexShader6091 = idirect3dvertexshader;
				anIDirect3DDevice6098.SetVertexShader(idirect3dvertexshader);
				method2010(-114);
				if (bool == true) {
					break;
				}
				anInt6090 = -60;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method1740(final Interface17 interface17) {
		/* empty */
	}

	@Override
	final void method2046(final int i) {
		do {
			try {
				anIDirect3DDevice6098.a(15, aBoolean4599);
				if (i == 0) {
					break;
				}
				aBooleanArray6088 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	private static final int method2071(final Class258 class258, final int i) {
		int i_13_;
		try {
			if (i != 2474) {
				anIntArray6106 = null;
			}
			if (Class98_Sub10_Sub6.aClass258_5568 == class258) {
				return 1;
			}
			if (class258 != Class246_Sub3_Sub4_Sub5.aClass258_6260) {
				if (class258 == Class144.aClass258_1168) {
					return 3;
				}
				if (Class98_Sub46_Sub13_Sub1.aClass258_6307 != class258) {
					if (Class246_Sub4_Sub1.aClass258_6169 == class258) {
						return 256;
					}
				} else {
					return 4;
				}
			} else {
				return 2;
			}
			i_13_ = 0;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_13_;
	}

	@Override
	final void method1825() {
		try {
			final IDirect3DEventQuery idirect3deventquery = anIDirect3DDevice6098
					.c();
			if (kg.a(-21593, idirect3deventquery.Issue())) {
				for (;;) {
					final int i = idirect3deventquery.IsSignaled();
					if (i != 1) {
						break;
					}
					Thread.yield();
				}
			}
			idirect3deventquery.b(99);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final int I() {
		int i;
		try {
			i = 0;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	@Override
	final void method2037(final Class232 class232, final int i,
			final byte i_14_, final int i_15_) {
		do {
			try {
				anIDirect3DDevice6098.DrawPrimitive(method2069(-101, class232),
						i, i_15_);
				if (i_14_ > 8) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final Interface5 method1813(final int i, final int i_16_) {
		Interface5 interface5;
		try {
			interface5 = null;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return interface5;
	}

	@Override
	final void method1814() {
		/* empty */
	}

	@Override
	final void method2036(final int i) {
		do {
			try {
			
				anIDirect3DDevice6098.SetViewport(anInt4578, anInt4622,
						anInt4527, anInt4531, 0.0F, 1.0F);

				if (i == -11155) {
					break;
				}
				aBoolean6109 = true;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final Interface2_Impl1 method2060(final boolean bool, final int i) {
		Class80 class80;
		try {
			if (i <= 40) {
				method1972(-48);
			}
			class80 = new Class80(this, bool);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class80;
	}

	@Override
	final boolean method1977(final Class162 class162, final boolean bool,
			final Class164 class164) {
		boolean bool_17_;
		try {
			if (bool != true) {
				method2074(19, null, null);
			}
			final D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (kg.a(-21593, anIDirect3D6089.a(anInt6103, d3ddisplaymode))
					&& kg.a(-21593, (anIDirect3D6089.CheckDeviceFormat(
							anInt6103, anInt6090, d3ddisplaymode.Format, 0, 4,
							method2074(-1935, class164, class162))))) {
				return true;
			}
			bool_17_ = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool_17_;
	}

	@Override
	final void method1955(final int i) {
		try {
			if (i != -5668) {
				anIntArray6084 = null;
			}
			anIDirect3DDevice6098.a(137, (aBoolean4643 && !aBoolean4637));
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final synchronized void method1806(final int i) {
		try {
			aJaa6108.a((byte) 126);
			super.method1806(i);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method2009(final int i) {
		try {
			if (i != 28976) {
				aBoolean6096 = false;
			}
			anIDirect3DDevice6098.SetScissorRect((anInt4602 + anInt4578),
					(anInt4558 + anInt4622), anInt4575, anInt4638);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final int[] na(final int i, final int i_18_, final int i_19_,
			final int i_20_) {
		int[] is;
		try {
			int[] is_21_ = null;
			final IDirect3DSurface idirect3dsurface = anIDirect3DDevice6098
					.d(0);
			final IDirect3DSurface idirect3dsurface_22_ = anIDirect3DDevice6098
					.a(i_19_, i_20_, 21, 0, 0, true);
			if (kg.a(-21593, (anIDirect3DDevice6098.StretchRect(
					idirect3dsurface, i, i_18_, i_19_, i_20_,
					idirect3dsurface_22_, 0, 0, i_19_, i_20_, 0)))
					&& kg.a(-21593, idirect3dsurface_22_.LockRect(0, 0, i_19_,
							i_20_, 16, (aPixelBuffer6095)))) {
				is_21_ = new int[i_19_ * i_20_];
				final int i_23_ = aPixelBuffer6095.getRowPitch();
				if ((4 * i_19_ ^ 0xffffffff) == (i_23_ ^ 0xffffffff)) {
					aPixelBuffer6095.b(is_21_, 0, 0, i_19_ * i_20_);
				} else {
					for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff); i_24_++) {
						aPixelBuffer6095.b(is_21_, i_19_ * i_24_,
								i_24_ * i_23_, i_19_);
					}
				}
				idirect3dsurface_22_.UnlockRect();
			}
			idirect3dsurface.b(71);
			idirect3dsurface_22_.b(80);
			is = is_21_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return is;
	}

	@Override
	final void method1756() {
		/* empty */
	}

	@Override
	final void method2057(final int i) {
		try {
			if (i == 12362) {
				anIDirect3DDevice6098.SetRenderState(60, anInt4648);
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private static final int method2072(final boolean bool,
			final Class128 class128) {
		try {
			if (bool) {
				aFloatArray6101 = null;
			}
			if (class128 != Class288.aClass128_3381) {
				if (class128 != Class249.aClass128_1903) {
					if (Class323.aClass128_2715 == class128) {
						return 26;
					}
					if (Class1.aClass128_64 == class128) {
						return 7;
					}
					if (class128 == Class28.aClass128_286) {
						return 10;
					}
				} else {
					return 4;
				}
			} else {
				return 2;
			}
			throw new IllegalArgumentException();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final Class76 method2067(final int i, final byte i_25_) {
		Class76 class76;
		try {
			final int i_27_ = i;
			while_23_: do {
				do {
					if (3 != i_27_) {
						if (-5 != (i_27_ ^ 0xffffffff)) {
							if (i_27_ == 8) {
								break;
							}
							break while_23_;
						}
					} else {
						return new Class76_Sub6(this, (aClass207_4535));
					}
					return new Class76_Sub3(this, (aClass207_4535),
							(aClass195_4529));
				} while (false);
				return new Class76_Sub1(this, aClass207_4535, aClass195_4529);
			} while (false);
			class76 = super.method2067(i, (byte) 102);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class76;
	}

	@Override
	final boolean method1768() {
		boolean bool;
		try {
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	@Override
	final void method2025(final byte i) {
		try {
			method2004((byte) -118);
			method1989(73);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private static final int method2073(final int i, final Class200 class200) {
		try {
			if (Class284_Sub1_Sub1.aClass200_6187 == class200) {
				return 2;
			}
			if (class200 == Class342.aClass200_2861) {
				return 1;
			}
			if (i != 26476) {
				return -49;
			}
			throw new IllegalArgumentException();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final Class48 method1769(final Class48 class48, final Class48 class48_29_,
			final float f, final Class48 class48_30_) {
		Class48 class48_31_;
		try {
			if (f < 0.5F) {
				return class48;
			}
			class48_31_ = class48_29_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class48_31_;
	}

	@Override
	final void method1964(final Class38 class38, final byte i) {
		try {
			if (i != 26) {
				method1942(-76, null, null);
			}
			int i_32_ = 0;
			if (class38 != Class357.aClass38_3026) {
				if (Class98.aClass38_834 == class38) {
					i_32_ = 131072;
				} else if (Class204.aClass38_1552 == class38) {
					i_32_ = 196608;
				}
			} else {
				i_32_ = 65536;
			}
			anIDirect3DDevice6098.SetTextureStageState(anInt4579, 11, i_32_
					| anInt4579);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final int method2074(final int i, final Class164 class164,
			final Class162 class162) {
		try {
			if (Class162.aClass162_1266 == class162) {
				if (class164 == Class98_Sub40.aClass164_4190) {
					return 22;
				}
				if (Class62.aClass164_486 == class164) {
					return 21;
				}
				if (class164 != Class53_Sub1.aClass164_3633) {
					if (class164 == Class98_Sub30.aClass164_4088) {
						return 50;
					}
					if (Class74.aClass164_547 == class164) {
						return 51;
					}
					if (class164 == Class280.aClass164_2101) {
						return 77;
					}
				} else {
					return 28;
				}
			}
			if (i != -1935) {
				method2069(119, null);
			}
			throw new IllegalArgumentException("");
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method1983(final byte i) {
		try {
			if (aBoolean4540) {
				aFloatArray6101[5] = 1.0F;
				aFloatArray6101[9] = 0.0F;
				aFloatArray6101[7] = 0.0F;
				aFloatArray6101[3] = 0.0F;
				aFloatArray6101[11] = 0.0F;
				aFloatArray6101[10] = 1.0F;
				aFloatArray6101[4] = 0.0F;
				aFloatArray6101[13] = 0.0F;
				aFloatArray6101[2] = 0.0F;
				aFloatArray6101[6] = 0.0F;
				aFloatArray6101[12] = 0.0F;
				aFloatArray6101[0] = 1.0F;
				aFloatArray6101[14] = 0.0F;
				aFloatArray6101[1] = 0.0F;
				aFloatArray6101[15] = 1.0F;
				aFloatArray6101[8] = 0.0F;
			} else {
				aClass111_Sub3_4542.method2121((byte) -90, aFloatArray6101);
			}
			anIDirect3DDevice6098.SetTransform(256, aFloatArray6101);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void ya() {
		try {
			method1997(0, true);
			anIDirect3DDevice6098.Clear(2, 0, 1.0F, 0);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method1973(final Class232 class232, final int i,
			final int i_34_, final int i_35_,
			final Interface2_Impl2 interface2_impl2, final int i_36_,
			final int i_37_) {
		try {
			anIDirect3DDevice6098
					.SetIndices(((Class125) interface2_impl2).anIDirect3DIndexBuffer5350);
			if (i_35_ != 26810) {
				aBooleanArray6094 = null;
			}
			anIDirect3DDevice6098.DrawIndexedPrimitive(
					method2069(-85, class232), 0, i_36_, i, i_34_, i_37_);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method1936(final int i, final Object object, final Canvas canvas) {
		do {
			try {
				if (i == 0) {
					break;
				}
				method2080(4, -101, null, -18, null, 124);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final void method2075(final int i,
			final IDirect3DPixelShader idirect3dpixelshader) {
		try {
			if (i != 28) {
				method2072(true, null);
			}
			anIDirect3DDevice6098.SetPixelShader(idirect3dpixelshader);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private ha_Sub3_Sub1(final int i, final int i_38_, final Canvas canvas,
			final jaa var_jaa, final IDirect3D idirect3d,
			final IDirect3DDevice idirect3ddevice, final Class229 class229,
			final D3DPRESENT_PARAMETERS d3dpresent_parameters,
			final D3DCAPS d3dcaps, final d var_d, final Class207 class207,
			final int i_39_) {
		super(canvas, class229, var_d, class207, i_39_, 0);
		try {
			try {
				anInt6103 = i;
				aJaa6108 = var_jaa;
				anIDirect3DDevice6098 = idirect3ddevice;
				anInt6090 = i_38_;
				aD3DPRESENT_PARAMETERS6085 = d3dpresent_parameters;
				aClass229_6110 = class229;
				aD3DCAPS6093 = d3dcaps;
				anIDirect3D6089 = idirect3d;
				aD3DLIGHT6099 = new D3DLIGHT(aJaa6108);
				aD3DLIGHT6104 = new D3DLIGHT(aJaa6108);
				aD3DLIGHT6092 = new D3DLIGHT(aJaa6108);
				aPixelBuffer6095 = new PixelBuffer(aJaa6108);
				aGeometryBuffer6086 = new GeometryBuffer(aJaa6108);
				new GeometryBuffer(aJaa6108);
				anInt4608 = (aD3DCAPS6093.MaxSimultaneousTextures);
				aBoolean6097 = (0x10000 & aD3DCAPS6093.TextureCaps) != 0;
				aBoolean4569 = -1 != ((aD3DCAPS6093.TextureCaps & 0x800) ^ 0xffffffff);
				anInt4565 = (aD3DCAPS6093.MaxActiveLights > 0 ? aD3DCAPS6093.MaxActiveLights
						: 8);
				aBoolean6107 = -1 != ((aD3DCAPS6093.TextureCaps & 0x4000) ^ 0xffffffff);
				aBoolean4588 = -1 != ((0x2000 & aD3DCAPS6093.TextureCaps) ^ 0xffffffff);
				aBoolean6109 = ((aD3DCAPS6093.TextureCaps & 0x2) == 0);
				aBoolean4559 = (-1 > (anInt4616 ^ 0xffffffff) || (anIDirect3D6089
						.CheckDeviceMultiSampleType(anInt6103, anInt6090,
								aD3DPRESENT_PARAMETERS6085.BackBufferFormat,
								true, 2)) == 0);
				aBooleanArray6100 = new boolean[anInt4608];
				aBooleanArray6088 = new boolean[anInt4608];
				aBooleanArray6094 = new boolean[anInt4608];
				aBooleanArray6105 = new boolean[anInt4608];
				anIntArray6087 = new int[anInt4608];
				aClass200Array6102 = new Class200[anInt4608];
				anIDirect3DDevice6098.BeginScene();
			} catch (final Throwable throwable) {
				throwable.printStackTrace();
				method1743(-1);
				throw new RuntimeException("");
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final Interface4_Impl2 method2006(final int i, final int i_40_,
			final Class164 class164, final byte i_41_, final Class162 class162) {
		Class26_Sub3 class26_sub3;
		try {
			if (i_41_ != 45) {
				method1802();
			}
			class26_sub3 = new Class26_Sub3(this, class164, class162, i_40_, i);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class26_sub3;
	}

	@Override
	final Interface13 method1744(final int i, final int i_42_) {
		Interface13 interface13;
		try {
			interface13 = null;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return interface13;
	}

	private final boolean method2076(final int i) {
		boolean bool;
		try {
			if (i >= -127) {
				return true;
			}
			final int i_43_ = anIDirect3DDevice6098.TestCooperativeLevel();
			if (0 == i_43_ || (i_43_ ^ 0xffffffff) == 2005530518) {
				final Class229 class229 = (Class229) anObject4530;
				method1981((byte) -105);
				class229.method2868((byte) 88);
				aD3DPRESENT_PARAMETERS6085.BackBufferWidth = 0;
				aD3DPRESENT_PARAMETERS6085.BackBufferHeight = 0;
				if (method2080(anInt4616, anInt6103, anIDirect3D6089, 0,
						aD3DPRESENT_PARAMETERS6085, anInt6090)) {
					final int i_44_ = anIDirect3DDevice6098
							.Reset(aD3DPRESENT_PARAMETERS6085);
					if (kg.a(-21593, i_44_)) {
						class229.method2866(anIDirect3DDevice6098.b(),
								(byte) -85, anIDirect3DDevice6098.c(0));
						method2064((byte) -61);
						method1941(1);
						return true;
					}
				}
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final void method2077(final boolean bool, final Class26_Sub2 class26_sub2) {
		do {
			try {
				method2078(class26_sub2, 0);
				if (!aBooleanArray6088[anInt4579]) {
					anIDirect3DDevice6098.SetSamplerState(anInt4579, 1, 1);
					aBooleanArray6088[anInt4579] = true;
				}
				if (!aBooleanArray6100[anInt4579]) {
					anIDirect3DDevice6098.SetSamplerState(anInt4579, 2, 1);
					aBooleanArray6100[anInt4579] = true;
				}
				if (!bool) {
					break;
				}
				aBoolean6097 = true;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method1817() {
		/* empty */
	}

	@Override
	final boolean method1802() {
		boolean bool;
		try {
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final void method2078(final Class26 class26, final int i) {
		do {
			try {
				anIDirect3DDevice6098.SetTexture(anInt4579,
						class26.method293((byte) 18));
				if (class26.aClass200_272 != aClass200Array6102[anInt4579]) {
					final int i_45_ = method2073(26476, class26.aClass200_272);
					anIDirect3DDevice6098.SetSamplerState(anInt4579, 6, i_45_);
					anIDirect3DDevice6098.SetSamplerState(anInt4579, 5, i_45_);
					aClass200Array6102[anInt4579] = class26.aClass200_272;
					if (!aBooleanArray6105[anInt4579] != !class26.aBoolean269) {
						anIDirect3DDevice6098.SetSamplerState(
								anInt4579,
								7,
								(!class26.aBoolean269 ? 0 : method2073(26476,
										(class26.aClass200_272))));
						aBooleanArray6105[anInt4579] = class26.aBoolean269;
					}
				} else if (!class26.aBoolean269 != !(aBooleanArray6105[anInt4579])) {
					anIDirect3DDevice6098.SetSamplerState(
							anInt4579,
							7,
							(!class26.aBoolean269 ? 0 : method2073(26476,
									class26.aClass200_272)));
					aBooleanArray6105[anInt4579] = class26.aBoolean269;
				}
				if (i == 0) {
					if (aBooleanArray6094[anInt4579]) {
						break;
					}
					aBooleanArray6094[anInt4579] = true;
					method1958((byte) -48);
					method2011(2);
				}
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method1994(final byte i, final int i_46_) {
		try {
			if (i < 0) {
				anIntArray6087 = null;
			}
			anIDirect3DDevice6098.SetTextureStageState(anInt4579, 11, i_46_);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method2065(final byte i) {
		try {
			aD3DLIGHT6099.SetDirection(-aFloatArray4596[0],
					-aFloatArray4596[1], -aFloatArray4596[2]);
			aD3DLIGHT6104.SetDirection(-aFloatArray4572[0],
					-aFloatArray4572[1], -aFloatArray4572[2]);
			if (i == 80) {
				aBoolean6096 = false;
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final ha createToolkit(final Canvas canvas, final d var_d,
			final Class207 class207, final Integer integer) {
		try {
			ha_Sub3_Sub1 var_ha_Sub3_Sub1 = null;
			ha_Sub3_Sub1 var_ha_Sub3_Sub1_47_;
			try {
				final int i = 0;
				final int i_48_ = 1;
				final jaa var_jaa = new jaa();
				final IDirect3D idirect3d = IDirect3D.a(-2147483616, var_jaa);
				final D3DCAPS d3dcaps = idirect3d.a(i, i_48_);
				if (0 == (0x1000000 & d3dcaps.RasterCaps)) {
					throw new RuntimeException("");
				}
				if (2 > d3dcaps.MaxSimultaneousTextures) {
					throw new RuntimeException("");
				}
				if ((d3dcaps.TextureOpCaps & 0x2) == 0) {
					throw new RuntimeException("");
				}
				if (0 == (0x8 & d3dcaps.TextureOpCaps)) {
					throw new RuntimeException("");
				}
				if (-1 == (0x40 & d3dcaps.TextureOpCaps ^ 0xffffffff)) {
					throw new RuntimeException("");
				}
				if ((d3dcaps.TextureOpCaps & 0x200) == 0) {
					throw new RuntimeException("");
				}
				if ((0x2000000 & d3dcaps.TextureOpCaps) == 0) {
					throw new RuntimeException("");
				}
				if (0 == (0x10 & (d3dcaps.DestBlendCaps & d3dcaps.SrcBlendCaps))) {
					throw new RuntimeException("");
				}
				if (0 == (d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20)) {
					throw new RuntimeException("");
				}
				if ((0x2 & (d3dcaps.DestBlendCaps & d3dcaps.SrcBlendCaps) ^ 0xffffffff) == -1) {
					throw new RuntimeException("");
				}
				if (-1 > (d3dcaps.MaxActiveLights ^ 0xffffffff)
						&& -3 < (d3dcaps.MaxActiveLights ^ 0xffffffff)) {
					throw new RuntimeException("");
				}
				if ((d3dcaps.MaxStreams ^ 0xffffffff) > -6) {
					throw new RuntimeException("");
				}
				final D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(
						canvas);
				if (!method2080(integer.intValue(), i, idirect3d, 0,
						d3dpresent_parameters, i_48_)) {
					throw new RuntimeException("");
				}
				d3dpresent_parameters.PresentationInterval = -2147483648;
				d3dpresent_parameters.EnableAutoDepthStencil = true;
				d3dpresent_parameters.Windowed = true;
				int i_49_ = 2;
				if (-1 != (0x100000 & d3dcaps.DevCaps ^ 0xffffffff)) {
					i_49_ |= 0x10;
				}
				IDirect3DDevice idirect3ddevice;
				try {
					idirect3ddevice = idirect3d.a(i, i_48_, canvas,
							0x40 | i_49_, d3dpresent_parameters);
				} catch (final jc var_jc) {
					idirect3ddevice = idirect3d.a(i, i_48_, canvas,
							0x20 | i_49_, d3dpresent_parameters);
				}
				final Class229 class229 = new Class229(idirect3ddevice.c(0),
						idirect3ddevice.b());
				var_ha_Sub3_Sub1 = new ha_Sub3_Sub1(i, i_48_, canvas, var_jaa,
						idirect3d, idirect3ddevice, class229,
						d3dpresent_parameters, d3dcaps, var_d, class207,
						integer.intValue());
				var_ha_Sub3_Sub1.method1965(true);
				var_ha_Sub3_Sub1_47_ = var_ha_Sub3_Sub1;
			} catch (final RuntimeException runtimeexception) {
				if (var_ha_Sub3_Sub1 != null) {
					var_ha_Sub3_Sub1.method1773();
				}
				throw runtimeexception;
			}
			return var_ha_Sub3_Sub1_47_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method1991(final int i) {
		do {
			try {
				aD3DLIGHT6099.SetAmbient((aFloat4611 * aFloat4576),
						(aFloat4549 * aFloat4576), (aFloat4576 * aFloat4591),
						0.0F);
				aBoolean6096 = false;
				if (i == -24391) {
					break;
				}
				method2007(true);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method2030(final byte i) {
		try {
			if (i != -122) {
				F(29, 70);
			}
			anIDirect3DDevice6098.a(174, aBoolean4672);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final boolean method1942(final int i, final Class164 class164,
			final Class162 class162) {
		boolean bool;
		try {
			final D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (i != 0) {
				method2080(-93, -77, null, -97, null, -25);
			}
			if (kg.a(-21593, anIDirect3D6089.a(anInt6103, d3ddisplaymode))
					&& kg.a(-21593, (anIDirect3D6089.CheckDeviceFormat(
							anInt6103, anInt6090, d3ddisplaymode.Format, 0, 3,
							method2074(-1935, class164, class162))))) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	@Override
	final Class256 method1982(final Class49[] class49s, final int i) {
		dxVertexLayout var_dxVertexLayout;
		try {
			if (i != 6) {
				return null;
			}
			var_dxVertexLayout = new dxVertexLayout(this, class49s);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return var_dxVertexLayout;
	}

	@Override
	final Interface4_Impl2 method2063(final int i, final byte i_50_,
			final int[] is, final boolean bool, final int i_51_,
			final int i_52_, final int i_53_) {
		Class26_Sub3 class26_sub3;
		try {
			class26_sub3 = new Class26_Sub3(this, i_51_, i_52_, bool, is, i,
					i_53_);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class26_sub3;
	}

	@Override
	final void method1972(final int i) {
		try {
			if (i == 0) {
				anIDirect3DDevice6098.a(14, (aBoolean4606 && aBoolean4620));
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method1764(final int i, final int i_55_) throws Exception_Sub1 {
		try {
			anIDirect3DDevice6098.EndScene();
			if (aClass229_6110.method2867(0)) {
				anInt6083 = 0;
				if (kg.b(-7175, aClass229_6110.method2865(true, 0))) {
					method2076(-128);
				}
			} else {
				if (50 < ++anInt6083) {
					throw new Exception_Sub1();
				}
				method2076(-128);
			}
			anIDirect3DDevice6098.BeginScene();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final Interface4_Impl2 method2032(final byte[] is, final boolean bool,
			final Class164 class164, final int i, final int i_56_,
			final boolean bool_57_, final int i_58_, final int i_59_) {
		Class26_Sub3 class26_sub3;
		try {
			if (bool) {
				method2016((byte) 12);
			}
			class26_sub3 = new Class26_Sub3(this, class164, i_59_, i_56_,
					bool_57_, is, i_58_, i);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class26_sub3;
	}

	@Override
	final void method1944(final Object object, final Canvas canvas, final byte i) {
		do {
			try {
				aClass229_6110 = (Class229) object;
				if (i == -34) {
					break;
				}
				aJaa6108 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method1950(final byte i) {
		try {
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2079(final boolean bool, final Class26_Sub3 class26_sub3) {
		do {
			try {
				method2078(class26_sub3, 0);
				if (class26_sub3.aBoolean3584 != aBooleanArray6088[anInt4579]) {
					anIDirect3DDevice6098.SetSamplerState(anInt4579, 1,
							class26_sub3.aBoolean3584 ? 1 : 3);
					aBooleanArray6088[anInt4579] = class26_sub3.aBoolean3584;
				}
				if (bool) {
					method1942(-63, null, null);
				}
				if (class26_sub3.aBoolean3585 != !aBooleanArray6100[anInt4579]) {
					break;
				}
				anIDirect3DDevice6098.SetSamplerState(anInt4579, 2,
						!class26_sub3.aBoolean3585 ? 3 : 1);
				aBooleanArray6100[anInt4579] = class26_sub3.aBoolean3585;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method1999(final byte i) {
		do {
			try {
				anIDirect3DDevice6098.a(28,
						(aBoolean4571 && aBoolean4562 && anInt4581 >= 0));
				if (i == 112) {
					break;
				}
				anIntArray6106 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void GA(final int i) {
		try {
			anIDirect3DDevice6098.Clear(1, i, 0.0F, 0);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final Interface4_Impl3 method1934(final int i, final boolean bool,
			final int[][] is, final int i_61_) {
		Class26_Sub1 class26_sub1;
		try {
			if (i != 8) {
				return null;
			}
			class26_sub1 = new Class26_Sub1(this, i_61_, bool, is);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class26_sub1;
	}

	@Override
	final void method1971(final int i, final boolean bool,
			final Interface2_Impl1 interface2_impl1) {
		do {
			try {
				final Class80 class80 = (Class80) interface2_impl1;
				anIDirect3DDevice6098.SetStreamSource(i,
						class80.anIDirect3DVertexBuffer5337, 0,
						class80.method810((byte) -22));
				if (bool == true) {
					break;
				}
				anIntArray6084 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method1958(final byte i) {
		do {
			try {
				final int i_62_ = (aBooleanArray6094[anInt4579] ? method2072(
						false, (aClass128Array4639[anInt4579])) : 1);
				anIDirect3DDevice6098.SetTextureStageState(anInt4579, 4, i_62_);
				if (i == -48) {
					break;
				}
				aBooleanArray6100 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method1959(final int i) {
		do {
			try {
				if (aBooleanArray6094[anInt4579]) {
					aBooleanArray6094[anInt4579] = false;
					anIDirect3DDevice6098.SetTexture(anInt4579, null);
					method1958((byte) -48);
					method2011(2);
				}
				if (i == 0) {
					break;
				}
				aBoolean6096 = true;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final Object method2058(final Canvas canvas, final int i) {
		Object object;
		try {
			if (i != -8401) {
				return null;
			}
			object = null;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return object;
	}

	@Override
	final void method1966(final byte i) {
		try {
			anIDirect3DDevice6098.SetTransform(3, aFloatArray4566);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final Interface17 method1815(final Interface5 interface5,
			final Interface13 interface13) {
		Interface17 interface17;
		try {
			interface17 = null;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return interface17;
	}

	@Override
	final void method2042(final Class256 class256, final byte i) {
		try {
			final dxVertexLayout var_dxVertexLayout = (dxVertexLayout) class256;
			anIDirect3DDevice6098
					.SetVertexDeclaration(var_dxVertexLayout.anIDirect3DVertexDeclaration5155);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method1988(final Canvas canvas, final Object object, final int i) {
		do {
			try {
				if (i > -40) {
					method1950((byte) -56);
				}
				if (aCanvas4533 != canvas) {
					break;
				}
				final Dimension dimension = canvas.getSize();
				if ((dimension.width ^ 0xffffffff) >= -1
						|| (dimension.height ^ 0xffffffff) >= -1) {
					break;
				}
				anIDirect3DDevice6098.EndScene();
				method2076(-128);
				anIDirect3DDevice6098.BeginScene();
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	private static final boolean method2080(int i, final int i_65_,
			final IDirect3D idirect3d, final int i_66_,
			final D3DPRESENT_PARAMETERS d3dpresent_parameters, final int i_67_) {
		boolean bool;
		do {
			try {
				int i_68_ = 0;
				int i_69_ = 0;
				int i_70_ = 0;
				boolean bool_71_;
				try {
					final D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
					if (kg.b(i_66_ + -7175, idirect3d.a(i_65_, d3ddisplaymode))) {
						return false;
					}
					while_24_: for (/**/; 0 <= i; i--) {
						if (-2 != (i ^ 0xffffffff)) {
							i_70_ = 0 + i;
							for (int i_72_ = 0; ((i_72_ ^ 0xffffffff) > (anIntArray6106.length ^ 0xffffffff)); i_72_++) {
								if (idirect3d.CheckDeviceType(i_65_, i_67_,
										(d3ddisplaymode.Format),
										(anIntArray6106[i_72_]), true) == 0
										&& (idirect3d.CheckDeviceFormat(i_65_,
												i_67_, d3ddisplaymode.Format,
												1, 1, anIntArray6106[i_72_])) == 0
										&& (i == 0 || ((idirect3d
												.CheckDeviceMultiSampleType(
														i_65_, i_67_,
														anIntArray6106[i_72_],
														true, i_70_)) ^ 0xffffffff) == -1)) {
									for (int i_73_ = 0; anIntArray6084.length > i_73_; i_73_++) {
										if ((idirect3d.CheckDeviceFormat(i_65_,
												i_67_, d3ddisplaymode.Format,
												2, 1, anIntArray6084[i_73_])) == 0
												&& (0 == (idirect3d
														.CheckDepthStencilMatch(
																i_65_,
																i_67_,
																d3ddisplaymode.Format,
																anIntArray6106[i_72_],
																anIntArray6084[i_73_])))
												&& (i == 0 || (idirect3d
														.CheckDeviceMultiSampleType(
																i_65_,
																i_67_,
																anIntArray6084[i_72_],
																true, i_70_)) == 0)) {
											i_69_ = anIntArray6106[i_72_];
											i_68_ = anIntArray6084[i_73_];
											break while_24_;
										}
									}
								}
							}
						}
					}
					if (i < i_66_ || 0 == i_69_ || i_68_ == 0) {
						return false;
					}
					d3dpresent_parameters.BackBufferFormat = i_69_;
					d3dpresent_parameters.MultiSampleQuality = 0;
					d3dpresent_parameters.MultiSampleType = i_70_;
					d3dpresent_parameters.AutoDepthStencilFormat = i_68_;
					bool_71_ = true;
				} catch (final Throwable throwable) {
					bool = false;
					break;
				}
				return bool_71_;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
		} while (false);
		return bool;
	}

	@Override
	final void method2035(final int i) {
		try {
			int i_74_;
			for (i_74_ = 0; anInt4619 > i_74_; i_74_++) {
				final Class98_Sub5 class98_sub5 = aClass98_Sub5Array4597[i_74_];
				final int i_75_ = i_74_ - -2;
				final int i_76_ = class98_sub5.method961((byte) -78);
				final float f = class98_sub5.method956(false) / 255.0F;
				aD3DLIGHT6092.SetPosition(class98_sub5.method954(7019),
						class98_sub5.method963((byte) 115),
						class98_sub5.method962(i + 43412));
				aD3DLIGHT6092.SetDiffuse(
						((i_76_ & 0xff6196) >> 1871372912) * f,
						((i_76_ & 0xff55) >> -1608995352) * f, (0xff & i_76_)
								* f, 0.0F);
				aD3DLIGHT6092
						.SetAttenuation(0.0F, 0.0F, 1.0F / (class98_sub5
								.method958(i + 14840) * class98_sub5
								.method958(i ^ ~0x3906)));
				aD3DLIGHT6092.SetRange(class98_sub5.method958(i ^ ~0x3906));
				anIDirect3DDevice6098.SetLight(i_75_, aD3DLIGHT6092);
				anIDirect3DDevice6098.LightEnable(i_75_, true);
			}
			for (/**/; anInt4628 > i_74_; i_74_++) {
				anIDirect3DDevice6098.LightEnable(i_74_ + 2, false);
			}
			super.method2035(i);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method2026(final int i, final boolean bool, final byte i_77_,
			final Class65 class65, final boolean bool_78_) {
		try {
			if (i_77_ != 27) {
				method1740(null);
			}
			final int i_79_ = i;
			int i_80_;
			while_25_: do {
				do {
					if (1 != i_79_) {
						if (2 != i_79_) {
							break;
						}
					} else {
						i_80_ = 3;
						break while_25_;
					}
					i_80_ = 26;
					break while_25_;
				} while (false);
				i_80_ = 2;
			} while (false);
			int i_81_ = 0;
			if (bool) {
				i_81_ |= 0x20;
			}
			if (bool_78_) {
				i_81_ |= 0x10;
			}
			anIDirect3DDevice6098.SetTextureStageState(anInt4579, i_80_, i_81_
					| method2068(class65, (byte) 127));
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method2004(final byte i) {
		try {
			if (i <= -98) {
				final float f = (aBoolean4555 ? aFloat4630 : 0.0F);
				final float f_82_ = (aBoolean4555 ? -aFloat4594 : 0.0F);
				aD3DLIGHT6099.SetDiffuse(f * aFloat4611, aFloat4549 * f, f
						* aFloat4591, 0.0F);
				aD3DLIGHT6104.SetDiffuse(aFloat4611 * f_82_,
						aFloat4549 * f_82_, aFloat4591 * f_82_, 0.0F);
				aBoolean6096 = false;
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void b(final int i, final int i_83_, final int i_84_,
			final int i_85_, final double d) {
		/* empty */
	}

	@Override
	final Interface4_Impl1 method2044(final int i, final Class164 class164,
			final byte[] is, final int i_86_, final int i_87_, final int i_88_) {
		Class26_Sub2 class26_sub2;
		try {
			class26_sub2 = new Class26_Sub2(this, class164, i_86_, i_87_,
					i_88_, is);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class26_sub2;
	}

	@Override
	final void method2033(final int i) {
		try {
			anIDirect3DDevice6098.a(27, aBoolean4560);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method2059(final boolean bool, final boolean bool_91_) {
		do {
			try {
				anIDirect3DDevice6098.a(161, bool);
				if (!bool_91_) {
					break;
				}
				method2025((byte) -31);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void method1941(final int i) {
		try {
			for (int i_92_ = 0; ((i_92_ ^ 0xffffffff) > (anInt4608 ^ 0xffffffff)); i_92_++) {
				anIDirect3DDevice6098.SetSamplerState(i_92_, 7, 0);
				anIDirect3DDevice6098.SetSamplerState(i_92_, 6, 2);
				anIDirect3DDevice6098.SetSamplerState(i_92_, 5, 2);
				anIDirect3DDevice6098.SetSamplerState(i_92_, 1, 1);
				anIDirect3DDevice6098.SetSamplerState(i_92_, 2, 1);
				aClass200Array6102[i_92_] = Class284_Sub1_Sub1.aClass200_6187;
				aBooleanArray6088[i_92_] = aBooleanArray6100[i_92_] = true;
				aBooleanArray6105[i_92_] = false;
				anIntArray6087[i_92_] = 0;
			}
			anIDirect3DDevice6098.SetTextureStageState(0, 6, 1);
			anIDirect3DDevice6098.SetRenderState(9, 2);
			anIDirect3DDevice6098.SetRenderState(23, 4);
			anIDirect3DDevice6098.SetRenderState(25, 5);
			anIDirect3DDevice6098.SetRenderState(24, 0);
			anIDirect3DDevice6098.SetRenderState(22, 2);
			anIDirect3DDevice6098.SetRenderState(147, i);
			anIDirect3DDevice6098.SetRenderState(145, 1);
			anIDirect3DDevice6098.a(38, 0.95F);
			anIDirect3DDevice6098.SetRenderState(140, 3);
			aD3DLIGHT6099.SetType(3);
			aD3DLIGHT6104.SetType(3);
			aD3DLIGHT6092.SetType(1);
			aBoolean6096 = false;
			super.method1941(1);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method2047(final int i, final boolean bool, final byte i_93_,
			final Class65 class65) {
		try {
			int i_94_ = 0;
			if (i_93_ != -42) {
				aFloatArray6101 = null;
			}
			final int i_95_ = i;
			int i_96_;
			while_26_: do {
				do {
					if (i_95_ != 1) {
						if (-3 != (i_95_ ^ 0xffffffff)) {
							break;
						}
					} else {
						i_96_ = 6;
						break while_26_;
					}
					i_96_ = 27;
					break while_26_;
				} while (false);
				i_96_ = 5;
			} while (false);
			if (bool) {
				i_94_ |= 0x10;
			}
			anIDirect3DDevice6098.SetTextureStageState(anInt4579, i_96_, i_94_
					| method2068(class65, (byte) 127));
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method2011(final int i) {
		try {
			final int i_97_ = (aBooleanArray6094[anInt4579] ? method2072(false,
					(aClass128Array4585[anInt4579])) : 1);
			if (i != 2) {
				aGeometryBuffer6086 = null;
			}
			anIDirect3DDevice6098.SetTextureStageState(anInt4579, 1, i_97_);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method1791(final float f, final float f_98_, final float f_99_) {
		/* empty */
	}

	@Override
	final void method2016(final byte i) {
		try {
			if (i <= -109) {
				if (aClass126_4625 != Class101.aClass126_848) {
					if (aClass126_4625 != Class373_Sub1_Sub1.aClass126_6216) {
						if (Class83.aClass126_632 == aClass126_4625) {
							anIDirect3DDevice6098.SetRenderState(19, 9);
							anIDirect3DDevice6098.SetRenderState(20, 2);
						}
					} else {
						anIDirect3DDevice6098.SetRenderState(19, 2);
						anIDirect3DDevice6098.SetRenderState(20, 2);
					}
				} else {
					anIDirect3DDevice6098.SetRenderState(19, 5);
					anIDirect3DDevice6098.SetRenderState(20, 6);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method1974(final int i) {
		do {
			try {
				anIDirect3DDevice6098.a(7, aBoolean4577);
				if (i == 0) {
					break;
				}
				anInt6083 = -18;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final void a(final Rectangle[] rectangles, final int i, final int i_100_,
			final int i_101_) throws Exception_Sub1 {
		try {
			method1764(i_100_, i_101_);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static {
		anIntArray6084 = new int[] { 77, 80 };
	}
}
