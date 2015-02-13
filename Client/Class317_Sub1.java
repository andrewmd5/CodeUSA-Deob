/* Class317_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.nio.ByteBuffer;

final class Class317_Sub1 extends Class317 {
	private ByteBuffer aByteBuffer5305;

	@Override
	final byte[] method3653(final int i, final int i_0_, final boolean bool) {
		byte[] is;
		try {
			final byte[] is_1_ = new byte[i_0_];
			aByteBuffer5305.position(i);
			aByteBuffer5305.get(is_1_, 0, i_0_);
			if (bool) {
				aByteBuffer5305 = null;
			}
			is = is_1_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return is;
	}

	@Override
	final byte[] method3654(final boolean bool) {
		byte[] is;
		try {
			if (bool) {
				aByteBuffer5305 = null;
			}
			final byte[] is_2_ = new byte[aByteBuffer5305.capacity()];
			aByteBuffer5305.position(0);
			aByteBuffer5305.get(is_2_);
			is = is_2_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return is;
	}

	@Override
	final void method3652(final byte i, final byte[] is) {
		try {
			aByteBuffer5305 = ByteBuffer.allocateDirect(is.length);
			aByteBuffer5305.position(0);
			aByteBuffer5305.put(is);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
