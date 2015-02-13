/* Class299_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class Class299_Sub2 extends Class299 implements MouseListener,
		MouseMotionListener {
	private Class148 aClass148_5287 = new Class148();
	private int anInt5288;
	private int anInt5289;
	private int anInt5290;
	static byte[][] aByteArrayArray5291;
	private Class148 aClass148_5292 = new Class148();
	private int anInt5293;
	private int anInt5294;
	private int anInt5295;
	static OutgoingOpcode aClass171_5296 = new OutgoingOpcode(72, 3);
	static Class354 aClass354_5297;
	static int anInt5298 = 16777215;
	private boolean aBoolean5299;
	private Component aComponent5300;
	static int[] anIntArray5301 = { 1, 2, 4, 8 };

	@Override
	final boolean method3510(final byte i) {
		try {
			if (i != -19) {
				method3512(-127);
			}
			if ((anInt5290 & 0x2 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.C(" + i + ')');
		}
	}

	@Override
	final boolean method3506(final byte i) {
		try {
			if ((0x1 & anInt5290 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.L(" + i + ')');
		}
	}

	@Override
	public final synchronized void mousePressed(final MouseEvent mouseevent) {
		do {
			try {
				final int i = method3528(23542, mouseevent);
				if ((i ^ 0xffffffff) == -2) {
					method3529(22661, mouseevent.getX(),
							mouseevent.getClickCount(), mouseevent.getY(), 0);
				} else if ((i ^ 0xffffffff) != -5) {
					if ((i ^ 0xffffffff) == -3) {
						method3529(22661, mouseevent.getX(),
								mouseevent.getClickCount(), mouseevent.getY(),
								1);
					}
				} else {
					method3529(22661, mouseevent.getX(),
							mouseevent.getClickCount(), mouseevent.getY(), 2);
				}
				anInt5294 |= i;
				if (!mouseevent.isPopupTrigger()) {
					break;
				}
				mouseevent.consume();
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27
						.method667(runtimeexception,
								("un.mousePressed("
										+ (mouseevent != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final boolean method3512(final int i) {
		try {
			if (i != 1) {
				return false;
			}
			if ((0x4 & anInt5290 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.I(" + i + ')');
		}
	}

	@Override
	final void method3515(final int i) {
		try {
			if (i < -110) {
				method3530((byte) 119);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.H(" + i + ')');
		}
	}

	@Override
	public final synchronized void mouseClicked(final MouseEvent mouseevent) {
		do {
			try {
				if (!mouseevent.isPopupTrigger()) {
					break;
				}
				mouseevent.consume();
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27
						.method667(runtimeexception,
								("un.mouseClicked("
										+ (mouseevent != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	@Override
	public final synchronized void mouseMoved(final MouseEvent mouseevent) {
		try {
			method3531(-22490, mouseevent.getX(), mouseevent.getY());
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.mouseMoved("
					+ (mouseevent != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final synchronized void mouseExited(final MouseEvent mouseevent) {
		try {
			method3531(-22490, mouseevent.getX(), mouseevent.getY());
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.mouseExited("
					+ (mouseevent != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3522(final boolean bool) {
		try {
			aByteArrayArray5291 = null;
			aClass354_5297 = null;
			if (bool != false) {
				method3526(-120, -17);
			}
			anIntArray5301 = null;
			aClass171_5296 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.S(" + bool
					+ ')');
		}
	}

	static final void method3523(final int i, final int i_1_, final int i_2_) {
		do {
			try {
				if ((Class257.anInt1948 ^ 0xffffffff) != -1) {
					if (i_1_ < 0) {
						for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -17; i_3_++) {
							Class77_Sub1.anIntArray3804[i_3_] = i;
						}
					} else {
						Class77_Sub1.anIntArray3804[i_1_] = i;
					}
				}
				Class366.aClass98_Sub31_Sub2_3122.method1363(-17, i_1_, i);
				if (i_2_ == 0) {
					break;
				}
				method3527(35, -66);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("un.O(" + i
						+ ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	static final Class154 method3524(final byte i,
			final Class246_Sub3_Sub4 class246_sub3_sub4) {
		try {
			if (i != -90) {
				return null;
			}
			Class154 class154;
			do {
				if (Class119_Sub1.aClass154_4718 == null) {
					class154 = new Class154();
					if (!client.aBoolean3553) {
						break;
					}
				}
				class154 = Class119_Sub1.aClass154_4718;
				Class119_Sub1.aClass154_4718 = Class119_Sub1.aClass154_4718.aClass154_1233;
				Class76_Sub8.anInt3766--;
				class154.aClass154_1233 = null;
			} while (false);
			class154.aClass246_Sub3_Sub4_1232 = class246_sub3_sub4;
			return class154;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.N(" + i + ','
					+ (class246_sub3_sub4 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method3525(final int i, final Component component) {
		try {
			method3530((byte) -40);
			aComponent5300 = component;
			aComponent5300.addMouseListener(this);
			aComponent5300.addMouseMotionListener(this);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.R(" + i + ','
					+ (component != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final int method3514(final int i) {
		try {
			if (i <= 4) {
				return 121;
			}
			return anInt5289;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.E(" + i + ')');
		}
	}

	@Override
	final Class98_Sub17 method3508(final int i) {
		try {
			if (i != 600) {
				aClass148_5292 = null;
			}
			return (Class98_Sub17) aClass148_5287.method2421(6494);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.G(" + i + ')');
		}
	}

	static final boolean method3526(final int i, final int i_5_) {
		try {
			if (i < 113) {
				return false;
			}
			if (i_5_ == 13 || i_5_ == 23 || (i_5_ ^ 0xffffffff) == -3
					|| i_5_ == 30 || i_5_ == 18) {
				return true;
			}
			if (i_5_ == 58 || (i_5_ ^ 0xffffffff) == -1009) {
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.M(" + i + ','
					+ i_5_ + ')');
		}
	}

	@Override
	public final synchronized void mouseDragged(final MouseEvent mouseevent) {
		try {
			method3531(-22490, mouseevent.getX(), mouseevent.getY());
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.mouseDragged("
					+ (mouseevent != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method3527(final int i, final int i_6_) {
		try {
			if (i_6_ != 770356935) {
				aClass354_5297 = null;
			}
			return i >>> 770356935;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.V(" + i + ','
					+ i_6_ + ')');
		}
	}

	private final int method3528(final int i, final MouseEvent mouseevent) {
		try {
			final int i_7_ = mouseevent.getModifiers();
			final boolean bool = (i_7_ & 0x10) != 0;
			boolean bool_8_ = (0x8 & i_7_) != 0;
			final boolean bool_9_ = (0x4 & i_7_) != 0;
			if (bool_8_ && (bool || bool_9_)) {
				bool_8_ = false;
			}
			if (bool && bool_9_) {
				return 4;
			}
			if (bool) {
				return 1;
			}
			if (i != 23542) {
				anInt5290 = -41;
			}
			if (bool_8_) {
				return 2;
			}
			if (bool_9_) {
				return 4;
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.Q(" + i + ','
					+ (mouseevent != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final synchronized void method3516(final byte i) {
		try {
			anInt5288 = anInt5293;
			anInt5290 = anInt5294;
			anInt5289 = anInt5295;
			final Class148 class148 = aClass148_5287;
			aClass148_5287 = aClass148_5292;
			aClass148_5292 = class148;
			if (i <= 103) {
				anInt5290 = 55;
			}
			aClass148_5292.method2422((byte) 47);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.A(" + i + ')');
		}
	}

	@Override
	final int method3507(final byte i) {
		try {
			if (i < 24) {
				mouseExited(null);
			}
			return anInt5288;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.B(" + i + ')');
		}
	}

	private final void method3529(final int i, final int i_10_,
			final int i_11_, final int i_12_, final int i_13_) {
		try {
			final Class98_Sub17_Sub1 class98_sub17_sub1 = new Class98_Sub17_Sub1();
			class98_sub17_sub1.anInt5774 = i_11_;
			class98_sub17_sub1.anInt5779 = i_13_;
			class98_sub17_sub1.anInt5775 = i_10_;
			class98_sub17_sub1.anInt5776 = i_12_;
			class98_sub17_sub1.aLong5777 = Class343.method3819(i ^ ~0x58ab);
			if (i != 22661) {
				aClass148_5287 = null;
			}
			aClass148_5292.method2419(class98_sub17_sub1, i ^ ~0x92b);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.U(" + i + ','
					+ i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	@Override
	public final synchronized void mouseEntered(final MouseEvent mouseevent) {
		try {
			method3531(-22490, mouseevent.getX(), mouseevent.getY());
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("un.mouseEntered("
					+ (mouseevent != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final synchronized void mouseReleased(final MouseEvent mouseevent) {
		do {
			try {
				int i = method3528(23542, mouseevent);
				if ((i & anInt5294 ^ 0xffffffff) == -1) {
					i = anInt5294;
				}
				if ((0x1 & i) != 0) {
					method3529(22661, mouseevent.getX(),
							mouseevent.getClickCount(), mouseevent.getY(), 3);
				}
				if ((0x4 & i) != 0) {
					method3529(22661, mouseevent.getX(),
							mouseevent.getClickCount(), mouseevent.getY(), 5);
				}
				if ((0x2 & i ^ 0xffffffff) != -1) {
					method3529(22661, mouseevent.getX(),
							mouseevent.getClickCount(), mouseevent.getY(), 4);
				}
				anInt5294 &= i ^ 0xffffffff;
				if (!mouseevent.isPopupTrigger()) {
					break;
				}
				mouseevent.consume();
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27
						.method667(runtimeexception,
								("un.mouseReleased("
										+ (mouseevent != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method3530(final byte i) {
		try {
			if (aComponent5300 != null) {
				aComponent5300.removeMouseMotionListener(this);
				aComponent5300.removeMouseListener(this);
				anInt5295 = anInt5293 = anInt5294 = 0;
				anInt5289 = anInt5288 = anInt5290 = 0;
				aComponent5300 = null;
				aClass148_5287 = null;
				aClass148_5292 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "un.T(" + i + ')');
		}
	}

	Class299_Sub2(final Component component, final boolean bool) {
		try {
			method3525(-32, component);
			aBoolean5299 = bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("un.<init>(" + (component != null ? "{...}" : "null")
							+ ',' + bool + ')'));
		}
	}

	private final void method3531(final int i, final int i_15_, final int i_16_) {
		do {
			try {
				if (i != -22490) {
					method3525(-122, null);
				}
				anInt5293 = i_16_;
				anInt5295 = i_15_;
				if (!aBoolean5299) {
					break;
				}
				method3529(22661, i_15_, 0, i_16_, -1);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("un.P(" + i
						+ ',' + i_15_ + ',' + i_16_ + ')'));
			}
			break;
		} while (false);
	}
}
