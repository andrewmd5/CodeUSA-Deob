/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Frame;

import com.ms.com.IUnknown;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;

final class Class20 implements IEnumModesCallback {
	private static int[] anIntArray3249;
	private static int anInt3250;
	private DirectDraw aDirectDraw3251;

	final int[] method252(final boolean bool) {
		try {
			if (bool != false) {
				anIntArray3249 = null;
			}
			aDirectDraw3251.enumDisplayModes(0, null, null, this);
			anIntArray3249 = new int[anInt3250];
			anInt3250 = 0;
			aDirectDraw3251.enumDisplayModes(0, null, null, this);
			final int[] is = anIntArray3249;
			anInt3250 = 0;
			anIntArray3249 = null;
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method253(final int i, final Frame frame) {
		try {
			aDirectDraw3251.restoreDisplayMode();
			aDirectDraw3251.setCooperativeLevel(frame, 8);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method254(final DDSurfaceDesc ddsurfacedesc,
			final IUnknown iunknown) {
		try {
			if (anIntArray3249 != null) {
				anIntArray3249[anInt3250++] = ddsurfacedesc.width;
				anIntArray3249[anInt3250++] = ddsurfacedesc.height;
				anIntArray3249[anInt3250++] = ddsurfacedesc.rgbBitCount;
				anIntArray3249[anInt3250++] = ddsurfacedesc.refreshRate;
			} else {
				anInt3250 += 4;
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method255(final int i, final int i_1_, final int i_2_,
			final int i_3_, final int i_4_, final Frame frame) {
		try {
			frame.setVisible(true);
			final int i_5_ = 0;
			User32.SetWindowLong(i_5_, -16, i_1_);
			User32.SetWindowLong(i_5_, -20, 8);
			aDirectDraw3251.setCooperativeLevel(frame, 17);
			aDirectDraw3251.setDisplayMode(i_2_, i_4_, i, i_3_, 0);
			frame.setBounds(0, 0, i_2_, i_4_);
			frame.toFront();
			frame.requestFocus();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public Class20() {
		try {
			aDirectDraw3251 = new DirectDraw();
			aDirectDraw3251.initialize(null);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
