/* MapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;

import jaclib.memory.NativeBuffer;

public class MapBuffer extends NativeBuffer {
	private int c;

	public final void a(final byte[] is, final int i, final int i_0_,
			final int i_1_) {
		try {
			if ((c ^ 0xffffffff) == -1)
				throw new RuntimeException();
			super.a(is, i, i_0_, i_1_);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final boolean a() {
		try {
			if ((c ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final boolean b() {
		try {
			boolean bool = true;
			if (c != 0) {
				bool = OpenGL.glUnmapBufferARB(c);
				this.a(0L, 0);
				c = 0;
			}
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final boolean a(final int i, final int i_2_, final int i_3_) {
		try {
			if (c != 0)
				return false;
			final long l = OpenGL.glMapBufferARB(i, i_3_);
			if (l == 0L)
				return false;
			this.a(l, i_2_);
			c = i;
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
