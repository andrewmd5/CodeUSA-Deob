/* OggStreamState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggStreamState extends SimplePeer {
	public final native boolean resetSerialNo(int i);

	public final native int packetOut();

	public final native int packetPeek(OggPacket oggpacket);

	protected final native void clear();

	private final native boolean init(int i);

	public final native int packetOut(OggPacket oggpacket);

	public final native boolean isEOS();

	public final native boolean reset();

	public final native boolean pageIn(OggPage oggpage);

	public OggStreamState(final int i) {
		try {
			if (!init(i))
				throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native int packetPeek();
}
