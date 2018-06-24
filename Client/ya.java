/* ya - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ya extends za implements Interface9 {
	long nativeid;

	final native void ga();

	@Override
	protected final void finalize() {
		if (nativeid != 0L) {
			Class192.method2654(false, this);
		}
	}

	final native void r();

	@Override
	public final native void w(boolean bool);

	private final native void aa(oa var_oa, int i);

	ya(final oa var_oa, final int i) {
		aa(var_oa, i);
	}
}
