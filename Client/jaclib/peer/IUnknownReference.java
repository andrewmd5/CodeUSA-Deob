/* IUnknownReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class IUnknownReference extends PeerReference {
	protected final native long releasePeer(long l);

	IUnknownReference(final IUnknown iunknown, final jaa var_jaa) {
		super(iunknown, var_jaa);
	}
}
