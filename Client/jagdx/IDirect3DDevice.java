/* IDirect3DDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.jaa;

public final class IDirect3DDevice extends IUnknown {
	private jaa b;
	private static float[] c = new float[4];

	private final native int _CreateVertexDeclaration(
			VertexElementCollection vertexelementcollection,
			IDirect3DVertexDeclaration idirect3dvertexdeclaration);

	public final native int SetViewport(int i, int i_0_, int i_1_, int i_2_,
			float f, float f_3_);

	public final native int _CreateTexture(int i, int i_4_, int i_5_, int i_6_,
			int i_7_, int i_8_, IDirect3DTexture idirect3dtexture);

	public final native int _CreateCubeTexture(int i, int i_9_, int i_10_,
			int i_11_, int i_12_, IDirect3DCubeTexture idirect3dcubetexture);

	public final native int DrawIndexedPrimitive(int i, int i_13_, int i_14_,
			int i_15_, int i_16_, int i_17_);

	private final native int _GetSwapChain(int i,
			IDirect3DSwapChain idirect3dswapchain);

	public final native int TestCooperativeLevel();

	private final native int _CreateIndexBuffer(int i, int i_18_, int i_19_,
			int i_20_, IDirect3DIndexBuffer idirect3dindexbuffer);

	public final native int SetSamplerState(int i, int i_21_, int i_22_);

	public final native int EndScene();

	private final native int _CreateDepthStencilSurface(int i, int i_23_,
			int i_24_, int i_25_, int i_26_, boolean bool,
			IDirect3DSurface idirect3dsurface);

	public final native int SetVertexShader(
			IDirect3DVertexShader idirect3dvertexshader);

	private final native int _GetDepthStencilSurface(
			IDirect3DSurface idirect3dsurface);

	public final native int Clear(int i, int i_27_, float f, int i_28_);

	public final native int SetLight(int i, D3DLIGHT d3dlight);

	public final int a(final int i, final float f, final float f_29_,
			final float f_30_, final float f_31_) {
		int i_32_;
		try {
			c[0] = f;
			c[1] = f_29_;
			c[3] = f_31_;
			c[2] = f_30_;
			i_32_ = SetPixelShaderConstantF(i, c, 1);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_32_;
	}

	public final IDirect3DSurface b() {
		IDirect3DSurface idirect3dsurface;
		try {
			final IDirect3DSurface idirect3dsurface_33_ = new IDirect3DSurface(
					b);
			final int i = _GetDepthStencilSurface(idirect3dsurface_33_);
			if (kg.b(-7175, i))
				throw new jc(String.valueOf(i));
			idirect3dsurface = idirect3dsurface_33_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dsurface;
	}

	public final native int Reset(D3DPRESENT_PARAMETERS d3dpresent_parameters);

	private final native int _GetRenderTarget(int i,
			IDirect3DSurface idirect3dsurface);

	private final native int SetRenderStatef(int i, float f);

	public final IDirect3DVertexDeclaration a(
			final VertexElementCollection vertexelementcollection,
			IDirect3DVertexDeclaration idirect3dvertexdeclaration) {
		IDirect3DVertexDeclaration idirect3dvertexdeclaration_34_;
		try {
			if (idirect3dvertexdeclaration == null)
				idirect3dvertexdeclaration = new IDirect3DVertexDeclaration(b);
			else
				idirect3dvertexdeclaration.b(57);
			final int i = _CreateVertexDeclaration(vertexelementcollection,
					idirect3dvertexdeclaration);
			if (kg.b(-7175, i))
				throw new jc(String.valueOf(i));
			idirect3dvertexdeclaration_34_ = idirect3dvertexdeclaration;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dvertexdeclaration_34_;
	}

	public final native int SetVertexDeclaration(
			IDirect3DVertexDeclaration idirect3dvertexdeclaration);

	public final native int StretchRect(IDirect3DSurface idirect3dsurface,
			int i, int i_35_, int i_36_, int i_37_,
			IDirect3DSurface idirect3dsurface_38_, int i_39_, int i_40_,
			int i_41_, int i_42_, int i_43_);

	private final native int _GetBackBuffer(int i, int i_44_, int i_45_,
			IDirect3DSurface idirect3dsurface);

	public final int b(final int i, final float f, final float f_46_,
			final float f_47_, final float f_48_) {
		int i_49_;
		try {
			c[1] = f_46_;
			c[3] = f_48_;
			c[2] = f_47_;
			c[0] = f;
			i_49_ = SetVertexShaderConstantF(i, c, 1);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_49_;
	}

	public final IDirect3DEventQuery c() {
		IDirect3DEventQuery idirect3deventquery;
		try {
			final IDirect3DEventQuery idirect3deventquery_50_ = new IDirect3DEventQuery(
					b);
			if (kg.a(-21593, _CreateEventQuery(idirect3deventquery_50_))) {
				if (!idirect3deventquery_50_.a(25759))
					return null;
				return idirect3deventquery_50_;
			}
			idirect3deventquery = null;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3deventquery;
	}

	public final native int SetFVF(int i);

	public final native int SetVertexShaderConstantF(int i, float[] fs,
			int i_51_);

	private final native int SetRenderStateb(int i, boolean bool);

	public final native int SetTextureStageState(int i, int i_52_, int i_53_);

	public final native int SetTransform(int i, float[] fs);

	public final native int SetRenderState(int i, int i_54_);

	public final native int _CreateVertexShader(byte[] is,
			IDirect3DVertexShader idirect3dvertexshader);

	private final native int _CreateRenderTarget(int i, int i_55_, int i_56_,
			int i_57_, int i_58_, boolean bool,
			IDirect3DSurface idirect3dsurface);

	public final native int BeginScene();

	public final native int DrawPrimitive(int i, int i_59_, int i_60_);

	IDirect3DDevice(final jaa var_jaa) {
		super(var_jaa);
		try {
			b = var_jaa;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final IDirect3DCubeTexture a(final int i, final int i_61_,
			final int i_62_, final int i_63_, final int i_64_) {
		IDirect3DCubeTexture idirect3dcubetexture;
		try {
			final IDirect3DCubeTexture idirect3dcubetexture_65_ = new IDirect3DCubeTexture(
					b);
			final int i_66_ = _CreateCubeTexture(i, i_61_, i_62_, i_63_, i_64_,
					idirect3dcubetexture_65_);
			if (kg.b(-7175, i_66_))
				throw new jc(String.valueOf(i_66_));
			idirect3dcubetexture = idirect3dcubetexture_65_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dcubetexture;
	}

	public final int a(final int i, final boolean bool) {
		int i_67_;
		try {
			i_67_ = SetRenderStateb(i, bool);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_67_;
	}

	public final IDirect3DVertexShader a(final byte[] is) {
		IDirect3DVertexShader idirect3dvertexshader;
		try {
			if (null == is)
				return null;
			final IDirect3DVertexShader idirect3dvertexshader_68_ = new IDirect3DVertexShader(
					b);
			final int i = _CreateVertexShader(is, idirect3dvertexshader_68_);
			if (kg.b(-7175, i))
				throw new jc(String.valueOf(i));
			idirect3dvertexshader = idirect3dvertexshader_68_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dvertexshader;
	}

	private final native int _CreateOffscreenPlainSurface(int i, int i_69_,
			int i_70_, int i_71_, IDirect3DSurface idirect3dsurface);

	public final native int SetPixelShaderConstantF(int i, float[] fs, int i_72_);

	public final native int SetTexture(int i,
			IDirect3DBaseTexture idirect3dbasetexture);

	public final IDirect3DVertexBuffer a(final int i, final int i_73_,
			final int i_74_, final int i_75_,
			IDirect3DVertexBuffer idirect3dvertexbuffer) {
		IDirect3DVertexBuffer idirect3dvertexbuffer_76_;
		try {
			if (null == idirect3dvertexbuffer)
				idirect3dvertexbuffer = new IDirect3DVertexBuffer(b);
			else
				idirect3dvertexbuffer.b(61);
			final int i_77_ = _CreateVertexBuffer(i, i_73_, i_74_, i_75_,
					idirect3dvertexbuffer);
			if (kg.b(-7175, i_77_))
				throw new jc(String.valueOf(i_77_));
			idirect3dvertexbuffer.b = i;
			idirect3dvertexbuffer_76_ = idirect3dvertexbuffer;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dvertexbuffer_76_;
	}

	public final native int _CreatePixelShader(byte[] is,
			IDirect3DPixelShader idirect3dpixelshader);

	private final native int _CreateEventQuery(
			IDirect3DEventQuery idirect3deventquery);

	public final IDirect3DIndexBuffer a(final int i, final int i_78_,
			final int i_79_, final int i_80_,
			IDirect3DIndexBuffer idirect3dindexbuffer) {
		IDirect3DIndexBuffer idirect3dindexbuffer_81_;
		try {
			if (null == idirect3dindexbuffer)
				idirect3dindexbuffer = new IDirect3DIndexBuffer(b);
			else
				idirect3dindexbuffer.b(84);
			final int i_82_ = _CreateIndexBuffer(i, i_78_, i_79_, i_80_,
					idirect3dindexbuffer);
			if (kg.b(-7175, i_82_))
				throw new jc(String.valueOf(i_82_));
			idirect3dindexbuffer_81_ = idirect3dindexbuffer;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dindexbuffer_81_;
	}

	public final native int SetIndices(IDirect3DIndexBuffer idirect3dindexbuffer);

	public final IDirect3DSurface a(final int i, final int i_83_,
			final int i_84_, final int i_85_, final int i_86_,
			final boolean bool) {
		IDirect3DSurface idirect3dsurface;
		try {
			final IDirect3DSurface idirect3dsurface_87_ = new IDirect3DSurface(
					b);
			final int i_88_ = _CreateRenderTarget(i, i_83_, i_84_, i_85_,
					i_86_, bool, idirect3dsurface_87_);
			if (kg.b(-7175, i_88_))
				throw new jc(String.valueOf(i_88_));
			idirect3dsurface = idirect3dsurface_87_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dsurface;
	}

	public final IDirect3DVolumeTexture a(final int i, final int i_89_,
			final int i_90_, final int i_91_, final int i_92_, final int i_93_,
			final int i_94_) {
		IDirect3DVolumeTexture idirect3dvolumetexture;
		try {
			final IDirect3DVolumeTexture idirect3dvolumetexture_95_ = new IDirect3DVolumeTexture(
					b);
			final int i_96_ = _CreateVolumeTexture(i, i_89_, i_90_, i_91_,
					i_92_, i_93_, i_94_, idirect3dvolumetexture_95_);
			if (kg.b(-7175, i_96_))
				throw new jc(String.valueOf(i_96_));
			idirect3dvolumetexture = idirect3dvolumetexture_95_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dvolumetexture;
	}

	public final native int _CreateVolumeTexture(int i, int i_97_, int i_98_,
			int i_99_, int i_100_, int i_101_, int i_102_,
			IDirect3DVolumeTexture idirect3dvolumetexture);

	public final native int SetPixelShader(
			IDirect3DPixelShader idirect3dpixelshader);

	public final native int SetScissorRect(int i, int i_103_, int i_104_,
			int i_105_);

	public final native boolean LightEnable(int i, boolean bool);

	public final native int SetStreamSource(int i,
			IDirect3DVertexBuffer idirect3dvertexbuffer, int i_106_, int i_107_);

	public final int a(final int i, final float f) {
		int i_108_;
		try {
			i_108_ = SetRenderStatef(i, f);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_108_;
	}

	public final IDirect3DTexture a(final int i, final int i_109_,
			final int i_110_, final int i_111_, final int i_112_,
			final int i_113_) {
		IDirect3DTexture idirect3dtexture;
		try {
			final IDirect3DTexture idirect3dtexture_114_ = new IDirect3DTexture(
					b);
			final int i_115_ = _CreateTexture(i, i_109_, i_110_, i_111_,
					i_112_, i_113_, idirect3dtexture_114_);
			if (kg.b(-7175, i_115_))
				throw new jc(String.valueOf(i_115_));
			idirect3dtexture = idirect3dtexture_114_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dtexture;
	}

	private final native int _CreateVertexBuffer(int i, int i_116_, int i_117_,
			int i_118_, IDirect3DVertexBuffer idirect3dvertexbuffer);

	public final IDirect3DPixelShader b(final byte[] is) {
		IDirect3DPixelShader idirect3dpixelshader;
		try {
			if (is == null)
				return null;
			final IDirect3DPixelShader idirect3dpixelshader_119_ = new IDirect3DPixelShader(
					b);
			final int i = _CreatePixelShader(is, idirect3dpixelshader_119_);
			if (kg.b(-7175, i))
				throw new jc(String.valueOf(i));
			idirect3dpixelshader = idirect3dpixelshader_119_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dpixelshader;
	}

	public final IDirect3DSwapChain c(final int i) {
		IDirect3DSwapChain idirect3dswapchain;
		try {
			final IDirect3DSwapChain idirect3dswapchain_120_ = new IDirect3DSwapChain(
					b);
			final int i_121_ = _GetSwapChain(i, idirect3dswapchain_120_);
			if (kg.b(-7175, i_121_))
				throw new jc(String.valueOf(i_121_));
			idirect3dswapchain = idirect3dswapchain_120_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dswapchain;
	}

	public final IDirect3DSurface d(final int i) {
		IDirect3DSurface idirect3dsurface;
		try {
			final IDirect3DSurface idirect3dsurface_122_ = new IDirect3DSurface(
					b);
			final int i_123_ = _GetRenderTarget(i, idirect3dsurface_122_);
			if (kg.b(-7175, i_123_))
				throw new jc(String.valueOf(i_123_));
			idirect3dsurface = idirect3dsurface_122_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dsurface;
	}

	public final int a(final int i, final float[] fs) {
		int i_124_;
		try {
			i_124_ = SetVertexShaderConstantF(i, fs, fs.length / 4);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_124_;
	}
}
