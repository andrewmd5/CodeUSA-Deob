/* PeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

import java.lang.ref.WeakReference;

abstract class PeerReference extends WeakReference {
	PeerReference a;
	private long peer;
	PeerReference b;

	final long a(final int i) {
		long l;
		try {
			if (i != 0)
				setPeer(26L);
			long l_0_;
			if (-1L != (peer ^ 0xffffffffffffffffL)) {
				l_0_ = releasePeer(peer);
				peer = 0L;
			} else
				l_0_ = 0L;
			l = l_0_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	PeerReference(final Peer peer, final jaa var_jaa) {
		super(peer, var_jaa.a);
		try {
			var_jaa.a(this, -31112);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void setPeer(final long l) {
		try {
			a(0);
			peer = l;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean b(final int i) {
		boolean bool;
		try {
			if (i >= -108)
				b = null;
			if (0L != peer)
				return true;
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	protected abstract long releasePeer(long l);
}
