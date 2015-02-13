/* ba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ba extends r implements Interface9 {
	long nativeid;

	@Override
	public final native void w(boolean bool);

	ba(final oa var_oa) {
		/* empty */
	}

	@Override
	protected final void finalize() {
		if (nativeid != 0L) {
			Class192.method2654(false, this);
		}
	}
}
