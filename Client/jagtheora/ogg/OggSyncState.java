/* OggSyncState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggSyncState extends SimplePeer {
	public OggSyncState() {
		try {
			init();
			if (b())
				throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native int pageOut(OggPage oggpage);

	public final native boolean write(byte[] is, int i);

	protected final native void clear();

	public final native long pageSeek(OggPage oggpage);

	public final native boolean reset();

	private final native void init();
}
