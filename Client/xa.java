/* xa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class xa implements Interface13, Interface9 {
	long nativeid = 0L;

	private final native void va(long l, boolean bool);

	@Override
	protected final void finalize() {
		if (nativeid != 0L) {
			Class192.method2654(false, this);
		}
	}

	@Override
	public final void w(final boolean bool) {
		va(nativeid, bool);
	}

	private final native void r(int i, int i_0_);

	xa(final int i, final int i_1_) {
		r(i, i_1_);
	}
}
