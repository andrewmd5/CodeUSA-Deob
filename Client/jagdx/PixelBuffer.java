/* PixelBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.jaa;
import jaclib.peer.mfa;

public class PixelBuffer extends mfa implements Buffer {
	public final long getAddress() {
		long l;
		try {
			l = 0L;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	private final native void putub(byte[] is, int i, int i_0_, int i_1_);

	public PixelBuffer(final jaa var_jaa) {
		super(var_jaa);
		try {
			init();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final native void puti(int[] is, int i, int i_2_, int i_3_);

	public final void a(final int[] is, final int i, final int i_4_,
			final int i_5_) {
		try {
			if (((i_4_ ^ 0xffffffff) > -1 | (is == null | -1 < (i ^ 0xffffffff) | (is.length ^ 0xffffffff) > (i
					+ i_5_ ^ 0xffffffff)))
					|| (i_5_ * 4 + i_4_ ^ 0xffffffff) < (getSize() ^ 0xffffffff))
				throw new jc();
			puti(is, i, i_4_, i_5_);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void a(final byte[] is, final int i, final int i_6_,
			final int i_7_) {
		try {
			if (((is.length ^ 0xffffffff) > (i + i_7_ ^ 0xffffffff)
					| (0 > i | is == null) | 0 > i_6_)
					|| (getSize() ^ 0xffffffff) > (i_6_ - -i_7_ ^ 0xffffffff))
				throw new jc();
			putub(is, i, i_6_, i_7_);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native int getSize();

	public final native int getRowPitch();

	public final native int getSlicePitch();

	private final native void init();

	private final native void getub(byte[] is, int i, int i_8_, int i_9_);

	private final native void geti(int[] is, int i, int i_10_, int i_11_);

	public final void b(final int[] is, final int i, final int i_12_,
			final int i_13_) {
		try {
			if ((is == null | 0 > i
					| (i + i_13_ ^ 0xffffffff) < (is.length ^ 0xffffffff) | -1 < (i_12_ ^ 0xffffffff))
					|| getSize() < 4 * i_13_ + i_12_)
				throw new jc();
			geti(is, i, i_12_, i_13_);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
