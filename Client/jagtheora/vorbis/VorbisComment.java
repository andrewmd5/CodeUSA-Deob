/* VorbisComment - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class VorbisComment extends SimplePeer {
	public VorbisComment() {
		try {
			init();
			if (b())
				throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	protected final native void clear();

	private final native void init();
}
