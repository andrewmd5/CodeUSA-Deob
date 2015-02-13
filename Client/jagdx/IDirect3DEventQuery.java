/* IDirect3DEventQuery - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.jaa;

public class IDirect3DEventQuery extends IUnknown {
	IDirect3DEventQuery(final jaa var_jaa) {
		super(var_jaa);
	}

	public final native int IsSignaled();

	public final native int Issue();
}
