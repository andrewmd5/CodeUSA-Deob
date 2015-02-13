/* GeometryBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.jaa;
import jaclib.peer.mfa;

public class GeometryBuffer extends mfa implements Buffer {
	public final native long getAddress();

	public final native int getSize();

	private final native void init();

	public GeometryBuffer(final jaa var_jaa) {
		super(var_jaa);
		try {
			init();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final native void putub(byte[] is, int i, int i_0_, int i_1_);

	private final native void getub(byte[] is, int i, int i_2_, int i_3_);

	public final void a(final byte[] is, final int i, final int i_4_,
			final int i_5_) {
		try {
			if ((0 > i | null == is
					| (is.length ^ 0xffffffff) > (i + i_5_ ^ 0xffffffff) | i_4_ < 0)
					|| getSize() < i_5_ + i_4_)
				throw new jc();
			putub(is, i, i_4_, i_5_);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
