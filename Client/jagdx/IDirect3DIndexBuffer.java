/* IDirect3DIndexBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.jaa;

public class IDirect3DIndexBuffer extends IUnknown {
	public final native int Unlock();

	public final native int Lock(int i, int i_0_, int i_1_,
			GeometryBuffer geometrybuffer);

	private final native boolean _Update(long l, int i, int i_2_);

	protected final long a() {
		long l;
		try {
			l = super.a();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	IDirect3DIndexBuffer(final jaa var_jaa) {
		super(var_jaa);
	}
}
