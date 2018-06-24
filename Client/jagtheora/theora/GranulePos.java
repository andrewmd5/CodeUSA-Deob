/* GranulePos - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class GranulePos extends SimplePeer {
	public long position;

	protected final native void clear();

	private static final native void init();

	static {
		init();
	}
}
