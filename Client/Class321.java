/* Class321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

final class Class321 {
	private Robot aRobot2709;
	private Component aComponent2710;

	final void method3666(final Component component, final int[] is,
			final int i, final int i_0_, final Point point) {
		try {
			if (is != null) {
				final BufferedImage bufferedimage = new BufferedImage(i, i_0_,
						2);
				bufferedimage.setRGB(0, 0, i, i_0_, is, 0, i);
				component.setCursor(component.getToolkit().createCustomCursor(
						bufferedimage, point, null));
			} else {
				component.setCursor(null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3667(Component component, final boolean bool) {
		do {
			try {
				if (!bool) {
					if (component == null) {
						throw new NullPointerException();
					}
				} else {
					component = null;
				}
				if (component != aComponent2710) {
					if (null != aComponent2710) {
						aComponent2710.setCursor(null);
						aComponent2710 = null;
					}
					if (component == null) {
						break;
					}
					component.setCursor(component.getToolkit()
							.createCustomCursor(new BufferedImage(1, 1, 2),
									new Point(0, 0), null));
					aComponent2710 = component;
				}
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	Class321() throws Exception {
		try {
			aRobot2709 = new Robot();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3668(final int i, final int i_1_) {
		try {
			aRobot2709.mouseMove(i, i_1_);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
