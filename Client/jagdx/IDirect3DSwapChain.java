/* IDirect3DSwapChain - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.jaa;

public class IDirect3DSwapChain extends IUnknown {
	private jaa b;

	private final native int _GetBackBuffer(int i, int i_0_,
			IDirect3DSurface idirect3dsurface);

	public final native int Present(int i);

	public final IDirect3DSurface a(final int i, final int i_1_) {
		IDirect3DSurface idirect3dsurface;
		try {
			final IDirect3DSurface idirect3dsurface_2_ = new IDirect3DSurface(b);
			final int i_3_ = _GetBackBuffer(i, i_1_, idirect3dsurface_2_);
			if (kg.b(-7175, i_3_))
				throw new jc(String.valueOf(i_3_));
			idirect3dsurface = idirect3dsurface_2_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dsurface;
	}

	IDirect3DSwapChain(final jaa var_jaa) {
		super(var_jaa);
		try {
			b = var_jaa;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
