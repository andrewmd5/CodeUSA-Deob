/* D3DPRESENT_PARAMETERS - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import java.awt.Canvas;

public class D3DPRESENT_PARAMETERS {
	public int MultiSampleType = 0;
	public int Flags;
	public int PresentationInterval;
	public int FullScreen_RefreshRateInHz;
	public int BackBufferWidth = 0;
	public boolean Windowed;
	public boolean EnableAutoDepthStencil;
	public int BackBufferFormat;
	public int BackBufferHeight;
	public Canvas DeviceWindow;
	public int BackBufferCount;
	public int AutoDepthStencilFormat;
	public int SwapEffect;
	public int MultiSampleQuality;

	public D3DPRESENT_PARAMETERS(final Canvas canvas) {
		PresentationInterval = 0;
		BackBufferCount = 0;
		BackBufferHeight = 0;
		MultiSampleQuality = 0;
		SwapEffect = 1;
		AutoDepthStencilFormat = 0;
		BackBufferFormat = 0;
		try {
			DeviceWindow = canvas;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
