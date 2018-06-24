/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public final class Class68 {
	private DisplayMode aDisplayMode522;
	private GraphicsDevice aGraphicsDevice523;

	public final void method690() {
		try {
			if (null != aDisplayMode522) {
				aGraphicsDevice523.setDisplayMode(aDisplayMode522);
				if (!aGraphicsDevice523.getDisplayMode()
						.equals(aDisplayMode522)) {
					throw new RuntimeException(
							"Did not return to correct resolution!");
				}
				aDisplayMode522 = null;
			}
			method691((byte) -92, null);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final void method691(final byte i, final Frame frame) {
		try {
			boolean bool = false;
			try {
				final Field field = Class
						.forName("sun.awt.Win32GraphicsDevice")
						.getDeclaredField("valid");
				field.setAccessible(true);
				final boolean bool_0_ = ((Boolean) field
						.get(aGraphicsDevice523)).booleanValue();
				if (bool_0_) {
					field.set(aGraphicsDevice523, Boolean.FALSE);
					bool = true;
				}
				if (i != -92) {
					method692(null, -99, -10, 13, 34);
				}
			} catch (final Throwable throwable) {
				/* empty */
			}
			try {
				aGraphicsDevice523.setFullScreenWindow(frame);
			} catch (final Throwable t) {
				if (bool) {
					try {
						final Field field = Class.forName(
								"sun.awt.Win32GraphicsDevice")
								.getDeclaredField("valid");
						field.set(aGraphicsDevice523, Boolean.TRUE);
					} catch (final Throwable throwable) {
						/* empty */
					}
				}
			}
			if (bool) {
				try {
					final Field field = Class.forName(
							"sun.awt.Win32GraphicsDevice").getDeclaredField(
							"valid");
					field.set(aGraphicsDevice523, Boolean.TRUE);
				} catch (final Throwable throwable) {
					/* empty */
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method692(final Frame frame, final int i, final int i_1_,
			final int i_2_, int i_3_) {
		try {
			aDisplayMode522 = aGraphicsDevice523.getDisplayMode();
			if (null == aDisplayMode522) {
				throw new NullPointerException();
			}
			frame.setUndecorated(true);
			frame.enableInputMethods(false);
			method691((byte) -92, frame);
			if (-1 == (i_3_ ^ 0xffffffff)) {
				final int i_4_ = aDisplayMode522.getRefreshRate();
				final DisplayMode[] displaymodes = aGraphicsDevice523
						.getDisplayModes();
				boolean bool = false;
				for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (displaymodes.length ^ 0xffffffff); i_5_++) {
					if (displaymodes[i_5_].getWidth() == i
							&& i_1_ == displaymodes[i_5_].getHeight()
							&& displaymodes[i_5_].getBitDepth() == i_2_) {
						final int i_6_ = displaymodes[i_5_].getRefreshRate();
						if (!bool
								|| (Math.abs(-i_4_ + i_6_) < Math.abs(-i_4_
										+ i_3_))) {
							i_3_ = i_6_;
							bool = true;
						}
					}
				}
				if (!bool) {
					i_3_ = i_4_;
				}
			}
			aGraphicsDevice523.setDisplayMode(new DisplayMode(i, i_1_, i_2_,
					i_3_));
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final int[] method693() {
		int[] is;
		try {
			final DisplayMode[] displaymodes = aGraphicsDevice523
					.getDisplayModes();
			final int[] is_7_ = new int[displaymodes.length << 754645378];
			for (int i = 0; i < displaymodes.length; i++) {
				is_7_[i << 670030594] = displaymodes[i].getWidth();
				is_7_[1 + (i << 697150050)] = displaymodes[i].getHeight();
				is_7_[2 + (i << -399684990)] = displaymodes[i].getBitDepth();
				is_7_[(i << -1626028094) - -3] = displaymodes[i]
						.getRefreshRate();
			}
			is = is_7_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return is;
	}

	public Class68() throws Exception {
		try {
			final GraphicsEnvironment graphicsenvironment = GraphicsEnvironment
					.getLocalGraphicsEnvironment();
			aGraphicsDevice523 = graphicsenvironment.getDefaultScreenDevice();
			if (!aGraphicsDevice523.isFullScreenSupported()) {
				final GraphicsDevice[] graphicsdevices = graphicsenvironment
						.getScreenDevices();
				final GraphicsDevice[] graphicsdevices_8_ = graphicsdevices;
				for (int i = 0; ((graphicsdevices_8_.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
					final GraphicsDevice graphicsdevice = graphicsdevices_8_[i];
					if (null != graphicsdevice
							&& graphicsdevice.isFullScreenSupported()) {
						aGraphicsDevice523 = graphicsdevice;
						return;
					}
				}
				throw new Exception();
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
