/* IDirect3DVertexBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.memory.Source;
import jaclib.peer.IUnknown;
import jaclib.peer.jaa;

public class IDirect3DVertexBuffer extends IUnknown {
	int b;

	protected final long a() {
		long l;
		try {
			b = 0;
			l = super.a();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	public final native int Unlock();

	private final native boolean _Update(long l, int i, int i_0_, int i_1_);

	IDirect3DVertexBuffer(final jaa var_jaa) {
		super(var_jaa);
	}

	public final native int Lock(int i, int i_2_, int i_3_,
			GeometryBuffer geometrybuffer);

	public final boolean a(final Source source, final int i, final int i_4_,
			final int i_5_, final int i_6_) {
		boolean bool;
		try {
			if (source == null
					|| -1 < (i ^ 0xffffffff)
					|| (i_5_ ^ 0xffffffff) < (i + source.getSize() ^ 0xffffffff))
				throw new jc("");
			if ((i_4_ ^ 0xffffffff) > -1
					|| (b + i_4_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff))
				throw new jc("");
			bool = _Update(i + source.getAddress(), i_4_, i_5_, i_6_);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}
}
