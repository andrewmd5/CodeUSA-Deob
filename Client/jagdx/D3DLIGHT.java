/* D3DLIGHT - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.jaa;
import jaclib.peer.mfa;

public class D3DLIGHT extends mfa {
	public final native void SetSpotParams(float f, float f_0_, float f_1_);

	public final native void SetPosition(float f, float f_2_, float f_3_);

	public final native void SetDirection(float f, float f_4_, float f_5_);

	public final native void SetAttenuation(float f, float f_6_, float f_7_);

	public final native void SetAmbient(float f, float f_8_, float f_9_,
			float f_10_);

	public D3DLIGHT(final jaa var_jaa) {
		super(var_jaa);
		try {
			Init();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native void SetRange(float f);

	public final native void SetDiffuse(float f, float f_11_, float f_12_,
			float f_13_);

	private final native void Init();

	public final native void SetSpecular(float f, float f_14_, float f_15_,
			float f_16_);

	public final native void SetType(int i);
}
