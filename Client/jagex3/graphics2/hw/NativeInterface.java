/* NativeInterface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagex3.graphics2.hw;

public class NativeInterface {
	long peer;

	public final native void setSunColour(float f, float f_0_, float f_1_,
			float f_2_, float f_3_);

	private final native void init(int i, int i_4_);

	public final native void release();

	public final native void copyPositions(int[] is, int[] is_5_, int[] is_6_,
			short[] is_7_, int i, int i_8_, int i_9_, long l);

	public final native void copyTexCoords(float[] fs, float[] fs_10_, int i,
			int i_11_, int i_12_, long l);

	public final native void initTextureMetrics(int i, byte i_13_, byte i_14_);

	public final native void copyNormals(short[] is, short[] is_15_,
			short[] is_16_, byte[] is_17_, float f, float f_18_, int i,
			int i_19_, int i_20_, long l);

	public final native void copyLighting(short[] is, byte[] is_21_,
			short[] is_22_, short[] is_23_, short[] is_24_, short[] is_25_,
			byte[] is_26_, int i, int i_27_, short[] is_28_, int i_29_,
			int i_30_, int i_31_, long l);

	public final native void copyColours(short[] is, byte[] is_32_,
			short[] is_33_, int i, short[] is_34_, int i_35_, int i_36_,
			int i_37_, long l);

	public NativeInterface(final int i, final int i_38_) {
		try {
			init(i, i_38_);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native void setAmbient(float f);

	public final native void setSunDirection(float f, float f_39_, float f_40_);
}
