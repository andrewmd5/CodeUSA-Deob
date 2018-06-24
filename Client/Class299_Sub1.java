/* Class299_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class Class299_Sub1 extends Class299 implements MouseListener,
		MouseMotionListener, MouseWheelListener {
	private Class148 aClass148_5277 = new Class148();
	private int anInt5278;
	private int anInt5279;
	private int anInt5280;
	private int anInt5281;

	private int anInt5282;
	private int anInt5283;
	private Class148 aClass148_5284 = new Class148();
	private Component aComponent5285;
	private boolean aBoolean5286;

	@Override
	public final synchronized void mouseWheelMoved(
			final MouseWheelEvent mousewheelevent) {
		try {
			final int i = mousewheelevent.getX();
			final int i_0_ = mousewheelevent.getY();
			final int i_1_ = mousewheelevent.getWheelRotation();
			method3517(i_1_, (byte) -127, i, 6, i_0_);
			mousewheelevent.consume();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}

		if (mousewheelevent.isControlDown()) {
			if (mousewheelevent.getWheelRotation() == +1) {// up
				if (GameClient.cameraZoom > 1200) {
					final String string = "";
					Class98_Sub45.method1521((byte) -113, 0,
							"You can't scroll out any further", 0, string,
							string, string);
					return;
				} else {
					GameClient.cameraZoom += 50;
				}
			} else {// down
				if (GameClient.cameraZoom < 200) {
					final String string = "";
					Class98_Sub45.method1521((byte) -113, 0,
							"You can't scroll in any further", 0, string,
							string, string);
					return;
				} else {
					GameClient.cameraZoom -= 50;
				}
			}
		}
	}

	@Override
	public final synchronized void mousePressed(final MouseEvent mouseevent) {
		do {
			try {

				final int i = method3519(mouseevent, 2);

				if (i == 1) {
					method3517(mouseevent.getClickCount(), (byte) -127,
							mouseevent.getX(), 0, mouseevent.getY());

				} else if (4 == i) {
					method3517(mouseevent.getClickCount(), (byte) -107,
							mouseevent.getX(), 2, mouseevent.getY());
				} else if (i == 2) {
					method3517(mouseevent.getClickCount(), (byte) -113,
							mouseevent.getX(), 1, mouseevent.getY());
				}
				anInt5283 |= i;
				if (!mouseevent.isPopupTrigger()) {
					break;
				}
				mouseevent.consume();
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final boolean method3510(final byte i) {
		boolean bool;
		try {
			if (i != -19) {
				aBoolean5286 = true;
			}
			if ((0x2 & anInt5280 ^ 0xffffffff) != -1) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	@Override
	public final synchronized void mouseReleased(final MouseEvent mouseevent) {
		try {
			int i = method3519(mouseevent, 2);
			if ((i & anInt5283 ^ 0xffffffff) == -1) {
				i = anInt5283;
			}
			if (0 != (i & 0x1)) {
				method3517(mouseevent.getClickCount(), (byte) -111,
						mouseevent.getX(), 3, mouseevent.getY());
			}
			if ((i & 0x4 ^ 0xffffffff) != -1) {
				method3517(mouseevent.getClickCount(), (byte) -114,
						mouseevent.getX(), 5, mouseevent.getY());
			}
			if (-1 != (0x2 & i ^ 0xffffffff)) {
				method3517(mouseevent.getClickCount(), (byte) -127,
						mouseevent.getX(), 4, mouseevent.getY());
			}
			anInt5283 &= i ^ 0xffffffff;
			if (mouseevent.isPopupTrigger()) {
				mouseevent.consume();
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final synchronized void method3516(final byte i) {
		try {
			anInt5280 = anInt5283;
			anInt5278 = anInt5282;
			anInt5279 = anInt5281;
			final Class148 class148 = aClass148_5277;
			aClass148_5277 = aClass148_5284;
			aClass148_5284 = class148;
			if (i < 103) {
				anInt5281 = -46;
			}
			aClass148_5284.method2422((byte) 47);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final boolean method3512(final int i) {
		boolean bool;
		try {
			if (i != 1) {
				mouseReleased(null);
			}
			if (0 != (anInt5280 & 0x4)) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	@Override
	final int method3507(final byte i) {
		int i_2_;
		try {
			if (i < 24) {
				method3518(null, (byte) -4);
			}
			i_2_ = anInt5278;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_2_;
	}

	@Override
	final void method3515(final int i) {
		do {
			try {
				method3520(-87);
				if (i < -110) {
					break;
				}
				aBoolean5286 = true;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final Class98_Sub17 method3508(final int i) {
		Class98_Sub17 class98_sub17;
		try {
			if (i != 600) {
				anInt5281 = -94;
			}
			class98_sub17 = (Class98_Sub17) aClass148_5277
					.method2421(i ^ 0x1b06);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class98_sub17;
	}

	private final void method3517(final int i, final byte i_3_, final int i_4_,
			final int i_5_, final int i_6_) {
		do {
			try {

				final Class98_Sub17_Sub2 class98_sub17_sub2 = new Class98_Sub17_Sub2();
				class98_sub17_sub2.anInt5785 = i_6_;
				class98_sub17_sub2.anInt5786 = i_5_;
				class98_sub17_sub2.anInt5787 = i_4_;
				class98_sub17_sub2.aLong5788 = Class343.method3819(-47);
				class98_sub17_sub2.anInt5784 = i;
				aClass148_5284.method2419(class98_sub17_sub2, -20911);

				if (i_3_ <= -106) {
					break;
				}
				anInt5278 = -78;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	private final void method3518(final Component component, final byte i) {
		try {
			method3520(i + -153);
			aComponent5285 = component;
			if (i != 88) {
				aClass148_5284 = null;
			}
			aComponent5285.addMouseListener(this);
			aComponent5285.addMouseMotionListener(this);
			aComponent5285.addMouseWheelListener(this);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final synchronized void mouseDragged(final MouseEvent mouseevent) {
		try {
			method3521(-11571, mouseevent.getX(), mouseevent.getY());
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final synchronized void mouseMoved(final MouseEvent mouseevent) {
		try {
			method3521(-11571, mouseevent.getX(), mouseevent.getY());
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final synchronized void mouseExited(final MouseEvent mouseevent) {
		try {
			method3521(-11571, mouseevent.getX(), mouseevent.getY());
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final synchronized void mouseEntered(final MouseEvent mouseevent) {
		try {
			method3521(-11571, mouseevent.getX(), mouseevent.getY());
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final synchronized void mouseClicked(final MouseEvent mouseevent) {
		try {
			if (mouseevent.isPopupTrigger()) {
				mouseevent.consume();
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final int method3519(final MouseEvent mouseevent, final int i) {
		int i_7_;
		try {
			if (i != 2) {
				return 56;
			}
			if (mouseevent.getButton() == 1) {
				if (mouseevent.isMetaDown()) {
					return 4;
				}
				return 1;
			}
			if (mouseevent.getButton() == 2) {
				return 2;
			}
			if (mouseevent.getButton() == 3) {
				return 4;
			}
			i_7_ = 0;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_7_;
	}

	private final void method3520(final int i) {
		try {
			if (null != aComponent5285) {
				aComponent5285.removeMouseWheelListener(this);
				aComponent5285.removeMouseMotionListener(this);
				aComponent5285.removeMouseListener(this);
				aClass148_5284 = null;
				anInt5281 = anInt5282 = anInt5283 = 0;
				anInt5279 = anInt5278 = anInt5280 = 0;
				aComponent5285 = null;
				aClass148_5277 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final int method3514(final int i) {
		int i_9_;
		try {
			if (i <= 4) {
				anInt5278 = 117;
			}
			i_9_ = anInt5279;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_9_;
	}

	private final void method3521(final int i, final int i_10_, final int i_11_) {
		do {
			try {
				anInt5282 = i_11_;
				anInt5281 = i_10_;
				if (i != -11571) {
					anInt5279 = 31;
				}
				if (!aBoolean5286) {
					break;
				}
				method3517(0, (byte) -125, i_10_, -1, i_11_);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final boolean method3506(final byte i) {
		boolean bool;
		try {
			if ((anInt5280 & 0x1) != 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	Class299_Sub1(final Component component, final boolean bool) {
		try {
			method3518(component, (byte) 88);
			aBoolean5286 = bool;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
