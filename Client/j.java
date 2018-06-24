/* j - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class j extends Class332 implements Interface9 {
	long nativeid;

	private final native void b(long l, float f, float f_0_, float f_1_,
			float f_2_, float f_3_, float f_4_, int i, int i_5_, int i_6_,
			int i_7_);

	private final native void ma(oa var_oa, int[] is, byte[] is_8_,
			byte[] is_9_, int i, int i_10_, int i_11_, int i_12_);

	@Override
	final int method3737() {
		return wa(nativeid);
	}

	@Override
	final void method3740(final int i, final int i_13_, final int i_14_,
			final int i_15_) {
		A(nativeid, i, i_13_, i_14_, i_15_);
	}

	private final native void P(long l, int i, int i_16_, int i_17_, int i_18_,
			int i_19_, int i_20_, int i_21_);

	private final native void R(long l, boolean bool);

	private final native int M(long l);

	@Override
	final void method3728(final int i, final int i_22_, final int i_23_,
			final int i_24_, final int i_25_, final int i_26_, final int i_27_) {
		P(nativeid, i, i_22_, i_23_, i_24_, i_25_, i_26_, i_27_);
	}

	private final native void h(oa var_oa, int i, int i_28_, int i_29_,
			int i_30_, boolean bool);

	@Override
	final int method3734() {
		return M(nativeid);
	}

	@Override
	final int method3731() {
		return I(nativeid);
	}

	@Override
	final void method3741(final int[] is) {
		CA(nativeid, is);
	}

	private final native int I(long l);

	private final native void W(long l, int i, int i_31_, int i_32_, int i_33_,
			int i_34_);

	@Override
	public final void w(final boolean bool) {
		R(nativeid, bool);
	}

	j(final oa var_oa, final int i, final int i_35_) {
		EA(var_oa, i, i_35_);
	}

	@Override
	final void method3742(final int i, final int i_36_, final int i_37_) {
		N(nativeid, i, i_36_, i_37_);
	}

	@Override
	final void method3747(final float f, final float f_38_, final float f_39_,
			final float f_40_, final float f_41_, final float f_42_,
			final int i, final aa var_aa, final int i_43_, final int i_44_) {
		UA(nativeid, f, f_38_, f_39_, f_40_, f_41_, f_42_, i,
				((na) var_aa).nativeid, i_43_, i_44_);
	}

	private final native void CA(long l, int[] is);

	private final native void EA(oa var_oa, int i, int i_45_);

	private final native int JA(long l);

	j(final oa var_oa, final int[] is, final int i, final int i_46_,
			final int i_47_, final int i_48_, final boolean bool) {
		ua(var_oa, is, i, i_46_, i_47_, i_48_, bool);
	}

	private final native void UA(long l, float f, float f_49_, float f_50_,
			float f_51_, float f_52_, float f_53_, int i, long l_54_,
			int i_55_, int i_56_);

	@Override
	final void method3733(final float f, final float f_57_, final float f_58_,
			final float f_59_, final float f_60_, final float f_61_,
			final int i, final int i_62_, final int i_63_, final int i_64_) {
		b(nativeid, f, f_57_, f_58_, f_59_, f_60_, f_61_, i, i_62_, i_63_,
				i_64_);
	}

	@Override
	protected final void finalize() {
		if (nativeid != 0L) {
			Class192.method2654(false, this);
		}
	}

	j(final oa var_oa, final int[] is, final byte[] is_65_,
			final byte[] is_66_, final int i, final int i_67_, final int i_68_,
			final int i_69_) {
		ma(var_oa, is, is_65_, is_66_, i, i_67_, i_68_, i_69_);
	}

	private final native void YA(long l, int i, int i_70_, int i_71_,
			int i_72_, int i_73_, int i_74_);

	@Override
	final void method3736(final int i, final int i_75_, final int i_76_,
			final int i_77_, final int i_78_, final int i_79_) {
		YA(nativeid, i, i_75_, i_76_, i_77_, i_78_, i_79_);
	}

	@Override
	final void method3748(final int i, final int i_80_, final int i_81_,
			final int i_82_, final int i_83_) {
		W(nativeid, i, i_80_, i_81_, i_82_, i_83_);
	}

	private final native void ua(oa var_oa, int[] is, int i, int i_84_,
			int i_85_, int i_86_, boolean bool);

	private final native void N(long l, int i, int i_87_, int i_88_);

	@Override
	final void method3729(final int i, final int i_89_, final aa var_aa,
			final int i_90_, final int i_91_) {
		V(nativeid, i, i_89_, ((na) var_aa).nativeid, i_90_, i_91_);
	}

	private final native void V(long l, int i, int i_92_, long l_93_,
			int i_94_, int i_95_);

	private final native void A(long l, int i, int i_96_, int i_97_, int i_98_);

	private final native int wa(long l);

	j(final oa var_oa, final int i, final int i_99_, final int i_100_,
			final int i_101_, final boolean bool) {
		h(var_oa, i, i_99_, i_100_, i_101_, bool);
	}

	private final native void RA(long l, int i, int i_102_, int i_103_,
			int i_104_, int i_105_, int i_106_, int i_107_, int i_108_);

	@Override
	final void method3745(final int i, final int i_109_, final int i_110_,
			final int i_111_, final int i_112_, final int i_113_,
			final int i_114_, final int i_115_) {
		RA(nativeid, i, i_109_, i_110_, i_111_, i_112_, i_113_, i_114_, i_115_);
	}

	@Override
	final int method3749() {
		return JA(nativeid);
	}
}
