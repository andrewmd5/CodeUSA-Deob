/* na - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class na extends aa implements Interface9 {
	long nativeid;

	private final native void ma(oa var_oa, ya var_ya, int i, int i_0_,
			int[] is, int[] is_1_);

	@Override
	protected final void finalize() {
		if (nativeid != 0L) {
			Class192.method2654(false, this);
		}
	}

	na(final oa var_oa, final ya var_ya, final int i, final int i_2_,
			final int[] is, final int[] is_3_) {
		ma(var_oa, var_ya, i, i_2_, is, is_3_);
	}

	@Override
	public final native void w(boolean bool);
}
