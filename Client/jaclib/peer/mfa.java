/* mfa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

public class mfa extends Peer {
	protected mfa(final jaa var_jaa) {
		try {
			reference = new NativeHeapPeerReference(this, var_jaa);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
