/* VorbisInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisInfo extends SimplePeer {
	public int channels;
	public int rate;

	public final native int headerIn(VorbisComment vorbiscomment,
			OggPacket oggpacket);

	protected final native void clear();

	private static final native void initFields();

	private final native void init();

	public VorbisInfo() {
		try {
			init();
			if (b())
				throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static {
		initFields();
	}
}
