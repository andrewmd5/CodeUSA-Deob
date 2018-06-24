/* IDirect3DSurface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.jaa;

public class IDirect3DSurface extends IUnknown {
	public final native int LockRect(int i, int i_0_, int i_1_, int i_2_,
			int i_3_, PixelBuffer pixelbuffer);

	IDirect3DSurface(final jaa var_jaa) {
		super(var_jaa);
	}

	public final native boolean UnlockRect();
}
