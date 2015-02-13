/* VertexElementCollection - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.jaa;
import jaclib.peer.mfa;

public class VertexElementCollection extends mfa {
	public final native void finish();

	private final native void init();

	public VertexElementCollection(final jaa var_jaa) {
		super(var_jaa);
		try {
			init();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native void addElement(int i, int i_0_, int i_1_, int i_2_,
			int i_3_, int i_4_);

	public final native void reset();
}
