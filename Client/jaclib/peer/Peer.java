/* Peer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

abstract class Peer {
	protected PeerReference reference;
	/* synthetic */static Class a;

	private static final native void init(Class var_class);

	protected long a() {
		long l;
		try {
			l = reference.a(0);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	public final boolean a(final int i) {
		boolean bool;
		try {
			if (i != 25759)
				a();
			bool = reference.b(i + -25881);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	protected Peer() {
		/* empty */
	}

	/* synthetic */static Class a(final String string) {
		Class var_class;
		try {
			var_class = Class.forName(string);
		} catch (final ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
		return var_class;
	}

	static {
		init(a == null ? a = a("jaclib.peer.PeerReference") : a);
	}
}
