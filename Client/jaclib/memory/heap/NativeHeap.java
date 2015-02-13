/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap {
	private int a;
	private boolean b;
	long peer;

	final synchronized native long getBufferAddress(int i);

	private final native void deallocateHeap();

	private final native void allocateHeap(int i);

	public final NativeHeapBuffer a(final int i, final boolean bool) {
		try {
			if (!b)
				throw new IllegalStateException();
			return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final synchronized native void get(int i, byte[] is, int i_0_, int i_1_,
			int i_2_);

	final synchronized boolean a() {
		try {
			return b;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	protected final synchronized void finalize() throws Throwable {
		try {
			super.finalize();
			b();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final synchronized native void put(int i, byte[] is, int i_3_, int i_4_,
			int i_5_);

	public NativeHeap(final int i) {
		try {
			a = i;
			allocateHeap(a);
			b = true;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final synchronized native void deallocateBuffer(int i);

	public final synchronized void b() {
		try {
			if (b)
				deallocateHeap();
			b = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final synchronized native int allocateBuffer(int i, boolean bool);
}
