/* h - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class h extends Class43 implements Interface9 {
	long nativeid;

	@Override
	final native void fa(char c, int i, int i_0_, int i_1_, boolean bool);

	private final native void JA(oa var_oa, ya var_ya, byte[][] is,
			int[] is_2_, int[] is_3_, int[] is_4_, int[] is_5_);

	@Override
	public final native void w(boolean bool);

	private final native void NA(char c, int i, int i_6_, int i_7_,
			boolean bool, aa var_aa, int i_8_, int i_9_);

	@Override
	final void method409(final char c, final int i, final int i_10_,
			final int i_11_, final boolean bool, final aa var_aa,
			final int i_12_, final int i_13_) {
		NA(c, i, i_10_, i_11_, bool, var_aa, i_12_, i_13_);
	}

	h(final oa var_oa, final ya var_ya, final Class197 class197,
			final Class324[] class324s, final Class332[] class332s) {
		super(var_oa, class197);
		final byte[][] is = new byte[class324s.length][];
		final int[] is_14_ = new int[class324s.length];
		final int[] is_15_ = new int[class324s.length];
		final int[] is_16_ = new int[class324s.length];
		final int[] is_17_ = new int[class324s.length];
		for (int i = 0; i < class324s.length; i++) {
			is[i] = class324s[i].aByteArray2717;
			is_14_[i] = class324s[i].anInt2722;
			is_15_[i] = class324s[i].anInt2720;
			is_16_[i] = class324s[i].anInt2725;
			is_17_[i] = class324s[i].anInt2721;
		}
		JA(var_oa, var_ya, is, is_14_, is_15_, is_16_, is_17_);
	}

	@Override
	protected final void finalize() {
		if (nativeid != 0L) {
			Class192.method2654(false, this);
		}
	}
}
