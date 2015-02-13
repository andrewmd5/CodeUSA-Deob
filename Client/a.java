/* a - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class a implements Interface9 {
	private final i anI3280;
	Runnable aRunnable3281;
	private final i anI3282;
	private final i anI3283;
	private final i anI3284;
	long nativeid;
	private final i anI3285;
	private final i anI3286;
	private final i anI3287;
	private final i anI3288;
	private final i anI3289;
	private final oa anOa3290;
	private final i anI3291;

	private final native void f(long l, long l_0_, long l_1_, int[] is, int i,
			int i_2_);

	@Override
	protected final void finalize() {
		if (nativeid != 0L) {
			Class192.method2654(false, this);
		}
	}

	private final native void UA(long l, long l_3_, long l_4_, int[] is, int i);

	private final void method135() {
		M(nativeid);
	}

	final void method136(final s var_s, final int i, final int i_5_,
			final int i_6_) {
		Z(nativeid, ((t) var_s).nativeid, i, i_5_, i_6_);
	}

	final Class146 method137(final i var_i, final byte i, final int i_7_,
			final boolean bool) {
		i var_i_8_;
		i var_i_9_;
		if (i == 1) {
			var_i_8_ = anI3287;
			var_i_9_ = anI3285;
		} else if (i == 2) {
			var_i_8_ = anI3289;
			var_i_9_ = anI3286;
		} else if (i == 3) {
			var_i_8_ = anI3280;
			var_i_9_ = anI3288;
		} else if (i == 4) {
			var_i_8_ = anI3284;
			var_i_9_ = anI3291;
		} else if (i == 5) {
			var_i_8_ = anI3283;
			var_i_9_ = anI3282;
		} else {
			var_i_9_ = var_i_8_ = new i(anOa3290);
		}
		var_i.ZA(var_i_9_, var_i_8_, i_7_, i != 0, bool);
		var_i_9_.aClass87Array3294 = var_i.aClass87Array3294;
		var_i_9_.aClass35Array3295 = var_i.aClass35Array3295;
		return var_i_9_;
	}

	private final native void ta(long l, long l_10_, int i, int i_11_,
			int i_12_, int i_13_, int i_14_, int i_15_, int i_16_,
			boolean[][] bools);

	final void method138(final ha var_ha, final int i, final int i_17_,
			final int i_18_, final int i_19_, final int i_20_, final int i_21_,
			final int i_22_) {
		na(nativeid, var_ha, i, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_);
	}

	private final native void HA(long l, ha var_ha, int i, int i_23_);

	private final native void Z(long l, long l_24_, int i, int i_25_, int i_26_);

	final void method139() {
		aRunnable3281 = null;
		method144();
	}

	final void method140(final Class146 class146, final Class146 class146_27_,
			final int i, final int i_28_, final int i_29_, final boolean bool) {
		r(nativeid, ((i) class146).nativeid, ((i) class146_27_).nativeid, i,
				i_28_, i_29_, bool);
	}

	private final native boolean n(long l, long l_30_, int i, int i_31_,
			long l_32_, boolean bool, int i_33_);

	final void method141() {
		aRunnable3281 = Thread.currentThread();
		method135();
	}

	final void method142(final ha var_ha, final int[] is, final int[] is_34_,
			final int[] is_35_, final short[] is_36_, final int i) {
		O(nativeid, var_ha, is, is_34_, is_35_, is_36_, i);
	}

	private final native void O(long l, ha var_ha, int[] is, int[] is_37_,
			int[] is_38_, short[] is_39_, int i);

	private final native void M(long l);

	private final native void na(long l, ha var_ha, int i, int i_40_,
			int i_41_, int i_42_, int i_43_, int i_44_, int i_45_);

	final void method143(final Class146 class146, final int[] is,
			final Class111 class111) {
		e(nativeid, ((i) class146).nativeid, is, ((ja) class111).nativeid);
	}

	private final void method144() {
		W(nativeid);
	}

	@Override
	public final void w(final boolean bool) {
		E(nativeid, bool);
	}

	private final native void e(long l, long l_46_, int[] is, long l_47_);

	final void method145(final s var_s, final int i, final int i_48_) {
		H(nativeid, ((t) var_s).nativeid, i, i_48_);
	}

	private final native void r(long l, long l_49_, long l_50_, int i,
			int i_51_, int i_52_, boolean bool);

	private final native void W(long l);

	final void method146(final Class146 class146, final Class111 class111,
			final int[] is, final int i, final int i_53_) {
		f(nativeid, ((i) class146).nativeid, ((ja) class111).nativeid, is, i,
				i_53_);
	}

	private final native void E(long l, boolean bool);

	private final native void H(long l, long l_54_, int i, int i_55_);

	private final native boolean R(long l, long l_56_, int i, int i_57_,
			long l_58_, boolean bool);

	final boolean method147(final Class146 class146, final int i,
			final int i_59_, final Class111 class111, final boolean bool,
			final int i_60_) {
		return n(nativeid, ((i) class146).nativeid, i, i_59_,
				((ja) class111).nativeid, bool, i_60_);
	}

	final void method148(final s var_s, final int i, final int i_61_,
			final int i_62_, final int i_63_, final int i_64_, final int i_65_,
			final int i_66_, final boolean[][] bools) {
		ta(nativeid, ((t) var_s).nativeid, i, i_61_, i_62_, i_63_, i_64_,
				i_65_, i_66_, bools);
	}

	final void method149(final Class146 class146, final Class111 class111,
			final int[] is, final int i) {
		UA(nativeid, ((i) class146).nativeid, ((ja) class111).nativeid, is, i);
	}

	final boolean method150(final Class146 class146, final int i,
			final int i_67_, final Class111 class111, final boolean bool) {
		return R(nativeid, ((i) class146).nativeid, i, i_67_,
				((ja) class111).nativeid, bool);
	}

	a(final oa var_oa, final int i, final int i_68_) {
		anOa3290 = var_oa;
		anI3285 = new i(anOa3290);
		anI3286 = new i(anOa3290);
		anI3288 = new i(anOa3290);
		anI3291 = new i(anOa3290);
		anI3282 = new i(anOa3290);
		anI3287 = new i(anOa3290);
		anI3289 = new i(anOa3290);
		anI3280 = new i(anOa3290);
		anI3284 = new i(anOa3290);
		anI3283 = new i(anOa3290);
		HA(nativeid, var_oa, i, i_68_);
	}
}
