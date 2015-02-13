/* ja - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ja extends Class111 implements Interface9 {
	long nativeid;

	@Override
	final void method2099(final int i, final int i_0_, final int i_1_,
			final int[] is) {
		XA(nativeid, i, i_0_, i_1_, is);
	}

	@Override
	final void method2100(final int i, final int i_2_, final int i_3_) {
		FA(nativeid, i, i_2_, i_3_);
	}

	private final native void l(long l, long l_4_);

	private final native void a(long l, int i, int i_5_, int i_6_);

	@Override
	final void method2107(final int i) {
		VA(nativeid, i);
	}

	@Override
	final void method2090(final int i) {
		za(nativeid, i);
	}

	private final native void XA(long l, int i, int i_7_, int i_8_, int[] is);

	private final native void b(long l, int i, int i_9_, int i_10_, int[] is);

	private final native void FA(long l, int i, int i_11_, int i_12_);

	@Override
	final void method2093(final int i, final int i_13_, final int i_14_,
			final int i_15_, final int i_16_, final int i_17_) {
		P(nativeid, i, i_13_, i_14_, i_15_, i_16_, i_17_);
	}

	@Override
	protected final void finalize() {
		if (nativeid != 0L) {
			Class192.method2654(false, this);
		}
	}

	@Override
	final void method2103(final int i, final int i_18_, final int i_19_,
			final int[] is) {
		b(nativeid, i, i_18_, i_19_, is);
	}

	@Override
	final void method2092(final Class111 class111) {
		l(nativeid, ((ja) class111).nativeid);
	}

	@Override
	final void method2101(final int i) {
		t(nativeid, i);
	}

	private final native void m(long l, int i);

	@Override
	final void method2097(final int i) {
		m(nativeid, i);
	}

	private final native void AA(long l, boolean bool);

	private final native void VA(long l, int i);

	@Override
	final void method2108(final int[] is) {
		w(nativeid, is);
	}

	private final native void va(long l, int i, int i_20_, int i_21_, int[] is);

	@Override
	final void method2104(final int i) {
		NA(nativeid, i);
	}

	@Override
	public final void w(final boolean bool) {
		AA(nativeid, bool);
	}

	private final native void t(long l, int i);

	private final native void NA(long l, int i);

	private final native void J(long l, int i);

	private final native void la();

	private final native void P(long l, int i, int i_22_, int i_23_, int i_24_,
			int i_25_, int i_26_);

	@Override
	final void method2106(final int i, final int i_27_, final int i_28_) {
		a(nativeid, i, i_27_, i_28_);
	}

	@Override
	final Class111 method2102() {
		final ja var_ja_29_ = new ja();
		var_ja_29_.method2092(this);
		return var_ja_29_;
	}

	private final native void za(long l, int i);

	@Override
	final void method2091() {
		u(nativeid);
	}

	@Override
	final void method2105(final int i) {
		J(nativeid, i);
	}

	private final native void u(long l);

	private final native void w(long l, int[] is);

	@Override
	final void method2096(final int i, final int i_30_, final int i_31_,
			final int[] is) {
		va(nativeid, i, i_30_, i_31_, is);
	}

	ja() {
		la();
	}
}
