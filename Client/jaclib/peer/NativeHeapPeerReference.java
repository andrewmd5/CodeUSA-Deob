/* NativeHeapPeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class NativeHeapPeerReference extends PeerReference {
	NativeHeapPeerReference(final mfa var_mfa, final jaa var_jaa) {
		super(var_mfa, var_jaa);
	}

	protected final native long releasePeer(long l);
}
