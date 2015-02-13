/* TheoraInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraInfo extends SimplePeer {
	public int pixelFormat;
	public int colourSpace;
	public byte versionMinor;
	public int frameHeight;
	public int picX;
	public int frameWidth;
	public int picY;
	public byte versionSubMinor;
	public int aspectNumerator;
	public int picHeight;
	public int aspectDenominator;
	public int fpsDenominator;
	public int fpsNumerator;
	public byte versionMajor;
	public int picWidth;

	protected final native void clear();

	private final native void init();

	private static final native void initFields();

	public TheoraInfo() {
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
