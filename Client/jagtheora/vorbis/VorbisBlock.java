/* VorbisBlock - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisBlock extends SimplePeer {
	public final native int synthesis(OggPacket oggpacket);

	private final native void init(DSPState dspstate);

	protected final native void clear();

	public VorbisBlock(final DSPState dspstate) {
		try {
			init(dspstate);
			if (b())
				throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
