/* i - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class i extends Class146 implements Interface9 {
	private final ya aYa3292;
	private final oa anOa3293;
	Surface[] aClass87Array3294;
	long nativeid;
	SurfaceSkin[] aClass35Array3295;

	private final native void l(long l, int i, int[] is, int i_0_, int i_1_,
			int i_2_, int i_3_, boolean bool);

	@Override
	final native void ia(short i, short i_4_);

	@Override
	final boolean method2333(final int i, final int i_5_,
			final Class111 class111, final boolean bool, final int i_6_,
			final int i_7_) {
		return anOa3293.method1930().method147(this, i, i_5_, class111, bool,
				i_7_);
	}

	@Override
	final native void a(int i);

	private final void method2376(final int[] is, final Class111 class111) {
		anOa3293.method1930().method143(this, is, class111);
	}

	final native void ZA(i var_i_8_, i var_i_9_, int i, boolean bool,
			boolean bool_10_);

	private final native void oa(oa var_oa);

	@Override
	final SurfaceSkin[] method2322() {
		return aClass35Array3295;
	}

	@Override
	final native void s(int i);

	@Override
	final native int RA();

	@Override
	final native boolean r();

	@Override
	final native int V();

	@Override
	final boolean method2339(final int i, final int i_11_,
			final Class111 class111, final boolean bool, final int i_12_) {
		return anOa3293.method1930().method150(this, i, i_11_, class111, bool);
	}

	@Override
	final native void LA(int i);

	@Override
	final void method2331(final Class111 class111, final int i,
			final boolean bool) {
		A(((ja) class111).nativeid, i, bool);
	}

	@Override
	final native int G();

	private final native void A(long l, int i, boolean bool);

	@Override
	final native void aa(short i, short i_13_);

	@Override
	final native int ma();

	@Override
	final native int da();

	@Override
	final native void p(int i, int i_14_, s var_s, s var_s_15_, int i_16_,
			int i_17_, int i_18_);

	@Override
	final native r ba(r var_r);

	@Override
	final native void VA(int i);

	@Override
	final void method2343(final Class111 class111) {
		method2376(oa.anIntArray3306, class111);
		int i = 0;
		if (aClass87Array3294 != null) {
			for (int i_19_ = 0; i_19_ < aClass87Array3294.length; i_19_++) {
				final Surface surface = aClass87Array3294[i_19_];
				surface.anInt670 = oa.anIntArray3306[i++];
				surface.anInt668 = oa.anIntArray3306[i++];
				surface.anInt671 = oa.anIntArray3306[i++];
				surface.anInt663 = oa.anIntArray3306[i++];
				surface.anInt664 = oa.anIntArray3306[i++];
				surface.anInt656 = oa.anIntArray3306[i++];
				surface.anInt659 = oa.anIntArray3306[i++];
				surface.anInt669 = oa.anIntArray3306[i++];
				surface.anInt662 = oa.anIntArray3306[i++];
			}
		}
		if (aClass35Array3295 != null) {
			for (int i_20_ = 0; i_20_ < aClass35Array3295.length; i_20_++) {
				final SurfaceSkin surfaceSkin = aClass35Array3295[i_20_];
				SurfaceSkin class35_21_ = surfaceSkin;
				if (surfaceSkin.aClass35_328 != null) {
					class35_21_ = surfaceSkin.aClass35_328;
				}
				if (surfaceSkin.aClass111_334 != null) {
					surfaceSkin.aClass111_334.method2092(class111);
				} else {
					surfaceSkin.aClass111_334 = class111.method2102();
				}
				class35_21_.anInt331 = oa.anIntArray3306[i++];
				class35_21_.anInt330 = oa.anIntArray3306[i++];
				class35_21_.anInt337 = oa.anIntArray3306[i++];
			}
		}
	}

	@Override
	public final native void w(boolean bool);

	@Override
	final Surface[] method2320() {
		return aClass87Array3294;
	}

	@Override
	final native boolean F();

	@Override
	final native boolean NA();

	@Override
	final native void wa();

	@Override
	final native void I(int i, int[] is, int i_22_, int i_23_, int i_24_,
			boolean bool, int i_25_, int[] is_26_);

	@Override
	final void method2342() {
		if (anOa3293.anInt3316 > 1) {
			synchronized (this) {
				while (((Class146) this).aBoolean1181) {
					try {
						this.wait();
					} catch (final InterruptedException interruptedexception) {
						/* empty */
					}
				}
				((Class146) this).aBoolean1181 = true;
			}
		}
	}

	@Override
	final native int EA();

	@Override
	final native int ua();

	@Override
	final boolean method2324() {
		return true;
	}

	@Override
	protected final void finalize() {
		if (nativeid != 0L) {
			Class192.method2654(false, this);
		}
	}

	@Override
	final native void O(int i, int i_27_, int i_28_);

	@Override
	final native void v();

	@Override
	final native void FA(int i);

	@Override
	final void method2325(final Class111 class111,
			final Class246_Sub6 class246_sub6, final int i) {
		if (class246_sub6 == null) {
			anOa3293.method1930().method149(this, class111, null, i);
		} else {
			oa.anIntArray3313[5] = 0;
			anOa3293.method1930().method149(this, class111, oa.anIntArray3313,
					i);
			class246_sub6.anInt5111 = oa.anIntArray3313[0];
			class246_sub6.anInt5113 = oa.anIntArray3313[1];
			class246_sub6.anInt5110 = oa.anIntArray3313[2];
			class246_sub6.anInt5112 = oa.anIntArray3313[3];
			class246_sub6.anInt5109 = oa.anIntArray3313[4];
			class246_sub6.aBoolean5114 = oa.anIntArray3313[5] != 0;
		}
	}

	@Override
	final native void C(int i);

	@Override
	final void method2332(final Class146 class146, final int i,
			final int i_29_, final int i_30_, final boolean bool) {
		anOa3293.method1930().method140(this, class146, i, i_29_, i_30_, bool);
	}

	@Override
	final void method2337(final int i, final int i_31_, final int i_32_,
			final int i_33_) {
		/* empty */
	}

	@Override
	final native int fa();

	@Override
	final native void P(int i, int i_34_, int i_35_, int i_36_);

	@Override
	final native void k(int i);

	@Override
	final native void H(int i, int i_37_, int i_38_);

	@Override
	final native int WA();

	@Override
	final void method2344(final int i, final int[] is, final int i_39_,
			final int i_40_, final int i_41_, final int i_42_,
			final boolean bool) {
		l(nativeid, i, is, i_39_, i_40_, i_41_, i_42_, bool);
	}

	@Override
	final void method2326() {
		/* empty */
	}

	@Override
	final Class146 method2341(final byte i, final int i_43_, final boolean bool) {
		return anOa3293.method1930().method137(this, i, i_43_, bool);
	}

	@Override
	final void method2327() {
		if (anOa3293.anInt3316 > 1) {
			synchronized (this) {
				((Class146) this).aBoolean1181 = false;
				notifyAll();
			}
		}
	}

	@Override
	final void method2329(final Class111 class111,
			final Class246_Sub6 class246_sub6, final int i, final int i_44_) {
		if (class246_sub6 == null) {
			anOa3293.method1930().method146(this, class111, null, i, i_44_);
		} else {
			oa.anIntArray3313[5] = 0;
			anOa3293.method1930().method146(this, class111, oa.anIntArray3313,
					i, i_44_);
			class246_sub6.anInt5111 = oa.anIntArray3313[0];
			class246_sub6.anInt5113 = oa.anIntArray3313[1];
			class246_sub6.anInt5110 = oa.anIntArray3313[2];
			class246_sub6.anInt5112 = oa.anIntArray3313[3];
			class246_sub6.anInt5109 = oa.anIntArray3313[4];
			class246_sub6.aBoolean5114 = oa.anIntArray3313[5] != 0;
		}
	}

	private final native void R(oa var_oa, ya var_ya, int i, int i_45_,
			int[] is, int[] is_46_, int[] is_47_, int[] is_48_, short[] is_49_,
			int i_50_, short[] is_51_, short[] is_52_, short[] is_53_,
			byte[] is_54_, byte[] is_55_, byte[] is_56_, byte[] is_57_,
			short[] is_58_, short[] is_59_, int[] is_60_, byte i_61_,
			short[] is_62_, int i_63_, byte[] is_64_, short[] is_65_,
			short[] is_66_, short[] is_67_, int[] is_68_, int[] is_69_,
			int[] is_70_, byte[] is_71_, byte[] is_72_, int[] is_73_,
			int[] is_74_, int[] is_75_, int[] is_76_, int i_77_, int i_78_,
			int i_79_, int i_80_, int i_81_, int i_82_, int[] is_83_);

	@Override
	final native int na();

	i(final oa var_oa, final ya var_ya, final Model model, final int i,
			final int i_84_, final int i_85_, final int i_86_) {
		anOa3293 = var_oa;
		aYa3292 = var_ya;
		aClass87Array3294 = model.surfaces;
		aClass35Array3295 = model.surfaceSkins;
		final int i_87_ = (model.surfaces == null ? 0
				: model.surfaces.length);
		final int i_88_ = (model.surfaceSkins == null ? 0
				: model.surfaceSkins.length);
		int i_89_ = 0;
		final int[] is = new int[i_87_ * 3 + i_88_];
		for (int i_90_ = 0; i_90_ < i_87_; i_90_++) {
			is[i_89_++] = aClass87Array3294[i_90_].anInt666;
			is[i_89_++] = aClass87Array3294[i_90_].anInt661;
			is[i_89_++] = aClass87Array3294[i_90_].anInt674;
		}
		for (int i_91_ = 0; i_91_ < i_88_; i_91_++) {
			is[i_89_++] = aClass35Array3295[i_91_].anInt327;
		}
		final int i_92_ = (model.isolatedVertexNormals == null ? 0
				: model.isolatedVertexNormals.length);
		final int[] is_93_ = new int[i_92_ * 8];
		int i_94_ = 0;
		for (int i_95_ = 0; i_95_ < i_92_; i_95_++) {
			final VertexNormal vertexNormal = model.isolatedVertexNormals[i_95_];
			final Class177 class177 = Class67.method689(vertexNormal.anInt905,
					(byte) -119);
			is_93_[i_94_++] = vertexNormal.anInt906;
			is_93_[i_94_++] = class177.anInt1374;
			is_93_[i_94_++] = class177.anInt1380;
			is_93_[i_94_++] = class177.anInt1373;
			is_93_[i_94_++] = class177.anInt1384;
			is_93_[i_94_++] = class177.anInt1379;
			is_93_[i_94_++] = class177.aBoolean1377 ? -1 : 0;
		}
		for (int i_96_ = 0; i_96_ < i_92_; i_96_++) {
			final VertexNormal vertexNormal = model.isolatedVertexNormals[i_96_];
			is_93_[i_94_++] = vertexNormal.anInt908;
		}
		R(anOa3293, aYa3292, model.numVertices, model.maxDepth,
				model.verticesX, model.verticesY,
				model.verticesZ, model.vertexSkins,
				model.aShortArray1408, model.numTriangles,
				model.triangleViewspaceX, model.triangleViewspaceY,
				model.triangleViewspaceZ, model.faceRenderType,
				model.trianglePriorities, model.faceAlpha,
				model.textureCoords, model.colorValues,
				model.faceTexture, model.triangleSkinValues,
				model.aByte1422, model.aShortArray1394,
				model.numTextureTriangles, model.textureRenderTypes,
				model.textureTrianglePIndex, model.textureTriangleMIndex,
				model.textureTriangleNIndex, model.particleDirectionX,
				model.particleDirectionY, model.particleDirectionZ,
				model.particleLifespanX, model.particleLifespanY,
				model.particleLifespanZ, model.anIntArray1397,
				model.anIntArray1386, is, i_87_, i_88_, i, i_84_, i_85_,
				i_86_, is_93_);
	}

	@Override
	final native int HA();

	i(final oa var_oa) {
		anOa3293 = var_oa;
		aYa3292 = null;
		oa(var_oa);
	}
}
