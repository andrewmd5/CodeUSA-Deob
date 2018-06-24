/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable,
		FocusListener, WindowListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 365686174415919415L;
	private boolean aBoolean1;
	static int anInt2;
	private boolean aBoolean3 = false;
	public static int anInt4;
	public static boolean aBoolean5;
	public static boolean aBoolean6;
	public static int anInt7;
	public static boolean aBoolean8;
	public static int anInt9;
	public static int anInt10;
	public static int anInt11;
	public static boolean aBoolean12;
	public static int anInt13;
	public static int anInt14;
	public static int anInt15;
	public static boolean aBoolean16;
	public static boolean aBoolean17;
	public static int anInt18;
	public static int anInt19;
	public static int anInt20;
	public static int anInt21;
	public static int anInt22;

	@Override
	public final void update(final Graphics graphics) {
		try {
			paint(graphics);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ue.update("
					+ (graphics != null ? "{...}" : "null") + ')');
		}
	}

	final boolean method80(final int i) {
		try {
			if (i != 0) {
				windowActivated(null);
			}
			return Class134_Sub1.method2246("jagmisc", (byte) -36);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ue.P(" + i + ')');
		}
	}

	@Override
	public final void windowClosed(final WindowEvent windowevent) {
		/* empty */
	}

	static final int method81(int i, final byte i_0_, int i_1_) {
		try {
			if (i_0_ != -9) {
				method96(null, -42, null, -65, 42, 54, -75, 7, null, false,
						-21, 124, 62, -66, 123);
			}
			int i_2_ = 0;
			for (/**/; (i ^ 0xffffffff) < -1; i--) {
				i_2_ = i_2_ << -2140156575 | 0x1 & i_1_;
				i_1_ >>>= 1;
			}
			return i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ue.O(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final boolean method82(final int i) {
		try {
			if (i != -21568) {
				aBoolean3 = true;
			}
			return Class134_Sub1.method2246("jaclib", (byte) -36);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ue.G(" + i + ')');
		}
	}

	@Override
	public final void destroy() {
		try {
			if (Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271 == this
					&& !Class98_Sub10_Sub21.aBoolean5646) {
				Class180.aLong3404 = Class343.method3819(-47);
				Class246_Sub7.method3131(0, 5000L);
				Class98_Sub40.aClass88_4192 = null;
				method98(false, 18192);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "ue.destroy(" + ')');
		}
	}

	@Override
	public final void windowIconified(final WindowEvent windowevent) {
		/* empty */
	}

	@Override
	public final void windowOpened(final WindowEvent windowevent) {
		/* empty */
	}

	final boolean method83(final boolean bool) {
		try {
			if (bool != true) {
				aBoolean1 = false;
			}
			return Class134_Sub1.method2246("jagtheora", (byte) -36);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ue.C(" + bool
					+ ')');
		}
	}

	final void method84(final int i, final int i_3_, final int i_4_,
			final int i_5_, final String string, final int i_6_, final int i_7_) {
		try {
			try {
				if (Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271 != null) {
					Class98_Sub41.anInt4200++;
					if ((Class98_Sub41.anInt4200 ^ 0xffffffff) <= -4) {
						method97((byte) 74, "alreadyloaded");
					} else {
						getAppletContext().showDocument(getDocumentBase(),
								"_self");
					}
				} else {
					Class164.anInt1273 = i;
					Class131.anApplet1038 = Class76_Sub11.anApplet3799;
					Class188.anInt1453 = Class39_Sub1.anInt3593 = i_7_;
					Class123_Sub1.anInt4744 = Class98_Sub25.anInt4024 = i_3_;
					Class98_Sub46_Sub10.anInt6022 = 0;
					if (i_4_ == 4) {
						Class191.anInt1479 = 0;
						Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271 = this;
						Class98_Sub40.aClass88_4192 = Class98_Sub43_Sub2.aClass88_5907 = new Class88(
								i_6_, string, i_5_,
								Class76_Sub11.anApplet3799 != null);
						final Class143 class143 = Class98_Sub43_Sub2.aClass88_5907
								.method858(1, this, i_4_ + -3);
						while ((class143.anInt1163 ^ 0xffffffff) == -1) {
							Class246_Sub7.method3131(0, 10L);
						}
					}
				}
			} catch (final Throwable throwable) {
				Class305_Sub1.method3585(throwable, -128, null);
				method97((byte) -50, "crash");
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ue.E(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ','
					+ (string != null ? "{...}" : "null") + ',' + i_6_ + ','
					+ i_7_ + ')'));
		}
	}

	@Override
	public final String getParameter(final String string) {
		try {
			if (Class284.aFrame2168 != null) {
				return null;
			}
			if (Class76_Sub11.anApplet3799 != null
					&& Class76_Sub11.anApplet3799 != this) {
				return Class76_Sub11.anApplet3799.getParameter(string);
			}
			return super.getParameter(string);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ue.getParameter("
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final void windowActivated(final WindowEvent windowevent) {
		/* empty */
	}

	private final void method85(final int i) {
		try {
			if (i != 6341) {
				anInt2 = -22;
			}
			final long l = Class343.method3819(-47);
			final long l_8_ = Class271.aLongArray2034[Class295.anInt2410];
			Class271.aLongArray2034[Class295.anInt2410] = l;
			if ((l_8_ ^ 0xffffffffffffffffL) != -1L
					&& (l ^ 0xffffffffffffffffL) < (l_8_ ^ 0xffffffffffffffffL)) {
				/* empty */
			}
			Class295.anInt2410 = 0x1f & 1 + Class295.anInt2410;
			synchronized (this) {
				Class4.aBoolean84 = Class153.aBoolean1228;
			}
			method86((byte) -6);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ue.S(" + i + ')');
		}
	}

	abstract void method86(byte i);

	synchronized void method87(final int i) {
		try {
			if (Class42_Sub3.aCanvas5361 != null) {
				Class42_Sub3.aCanvas5361.removeFocusListener(this);
				Class42_Sub3.aCanvas5361.getParent().setBackground(Color.black);
				Class42_Sub3.aCanvas5361.getParent().remove(
						Class42_Sub3.aCanvas5361);
			}
			Container container;
			if (Class98_Sub18.aFrame3950 != null) {
				container = Class98_Sub18.aFrame3950;
			} else if (Class284.aFrame2168 != null) {
				container = Class284.aFrame2168;
			} else if (Class76_Sub11.anApplet3799 != null) {
				container = Class76_Sub11.anApplet3799;
			} else {
				container = Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271;
			}
			container.setLayout(null);
			Class42_Sub3.aCanvas5361 = new Canvas_Sub1(this);
			container.add(Class42_Sub3.aCanvas5361);
			Class42_Sub3.aCanvas5361.setSize(Class39_Sub1.anInt3593,
					Class98_Sub25.anInt4024);
			Class42_Sub3.aCanvas5361.setVisible(true);
			if (Class284.aFrame2168 != container) {
				Class42_Sub3.aCanvas5361.setLocation(
						(Class98_Sub46_Sub10.anInt6022), Class191.anInt1479);
			} else {
				final Insets insets = Class284.aFrame2168.getInsets();
				Class42_Sub3.aCanvas5361.setLocation(
						Class98_Sub46_Sub10.anInt6022 + insets.left,
						Class191.anInt1479 + insets.top);
			}
			Class42_Sub3.aCanvas5361.addFocusListener(this);
			Class42_Sub3.aCanvas5361.requestFocus();
			Class4.aBoolean84 = true;
			Class153.aBoolean1228 = true;
			Class246_Sub10.aBoolean5152 = true;
			Class224_Sub2_Sub1.aBoolean6142 = false;
			if (i != 0) {
				aBoolean3 = true;
			}
			client.aLong3547 = Class343.method3819(-47);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ue.J(" + i + ')');
		}
	}

	@Override
	public final void start() {
		try {
			if (Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271 == this
					&& !Class98_Sub10_Sub21.aBoolean5646) {
				Class180.aLong3404 = 0L;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ue.start(" + ')');
		}
	}

	@Override
	public final void windowDeiconified(final WindowEvent windowevent) {
		/* empty */
	}

	final void method88(final boolean bool, final String string, final int i,
			final int i_9_, final int i_10_, final boolean bool_11_,
			final int i_12_, final int i_13_) {
		try {
			try {
				Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271 = this;
				Class98_Sub46_Sub10.anInt6022 = 0;
				Class123_Sub1.anInt4744 = Class98_Sub25.anInt4024 = i_9_;
				Class188.anInt1453 = Class39_Sub1.anInt3593 = i_13_;
				Class131.anApplet1038 = null;
				Class191.anInt1479 = 0;
				Class164.anInt1273 = i_12_;
				Class284.aFrame2168 = new Frame();
				Class284.aFrame2168.setTitle("Jagex");
				Class284.aFrame2168.setResizable(true);
				Class284.aFrame2168.addWindowListener(this);
				Class284.aFrame2168.setVisible(true);
				Class284.aFrame2168.toFront();
				final Insets insets = Class284.aFrame2168.getInsets();
				Class284.aFrame2168
						.setSize(
								insets.left
										+ (Class188.anInt1453 + insets.right),
								(insets.bottom + (Class123_Sub1.anInt4744 - -insets.top)));
				Class98_Sub40.aClass88_4192 = Class98_Sub43_Sub2.aClass88_5907 = new Class88(
						i_10_, string, i, bool_11_);
				final Class143 class143 = Class98_Sub43_Sub2.aClass88_5907
						.method858(1, this, 1);
				while ((class143.anInt1163 ^ 0xffffffff) == -1) {
					Class246_Sub7.method3131(0, 10L);
				}
			} catch (final Exception exception) {
				Class305_Sub1.method3585(exception, -128, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ue.L(" + bool
					+ ',' + (string != null ? "{...}" : "null") + ',' + i + ','
					+ i_9_ + ',' + i_10_ + ',' + bool_11_ + ',' + i_12_ + ','
					+ i_13_ + ')'));
		}
	}

	@Override
	public final void focusLost(final FocusEvent focusevent) {
		try {
			Class153.aBoolean1228 = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ue.focusLost("
					+ (focusevent != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	public final void run() {
		try {
			do {
				try {
					if (Class88.aString696 != null) {
						final String string = Class88.aString696.toLowerCase();
						if (string.indexOf("sun") == -1
								&& (string.indexOf("apple") ^ 0xffffffff) == 0) {
							if ((string.indexOf("ibm") ^ 0xffffffff) != 0
									&& (Class88.aString692 == null || Class88.aString692
											.equals("1.4.2"))) {
								method97((byte) 87, "wrongjava");
								break;
							}
						} else {
							final String string_14_ = Class88.aString692;
							if (string_14_.equals("1.1")
									|| string_14_.startsWith("1.1.")
									|| string_14_.equals("1.2")
									|| string_14_.startsWith("1.2.")) {
								method97((byte) 88, "wrongjava");
								break;
							}
						}
					}
					if (Class88.aString692 != null
							&& Class88.aString692.startsWith("1.")) {
						int i = 2;
						int i_15_ = 0;
						for (/**/; ((i ^ 0xffffffff) > (Class88.aString692
								.length() ^ 0xffffffff)); i++) {
							final int i_16_ = Class88.aString692.charAt(i);
							if (i_16_ < 48 || (i_16_ ^ 0xffffffff) < -58) {
								break;
							}
							i_15_ = 10 * i_15_ - (48 + -i_16_);
						}
						if (i_15_ >= 5) {
							Class237.aBoolean1803 = true;
						}
					}
					Applet applet = Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271;
					if (Class76_Sub11.anApplet3799 != null) {
						applet = Class76_Sub11.anApplet3799;
					}
					final Method method = Class88.aMethod678;
					if (method != null) {
						try {
							method.invoke(applet, new Object[] { Boolean.TRUE });
						} catch (final Throwable throwable) {
							/* empty */
						}
					}
					Class96.method927(107);
					Class85.method839(12345);
					method87(0);
					method95(-13395);
					OutputStream_Sub1.aClass240_36 = Class109.method1737(72);
					while ((Class180.aLong3404 ^ 0xffffffffffffffffL) == -1L
							|| ((Class343.method3819(-47) ^ 0xffffffffffffffffL) > (Class180.aLong3404 ^ 0xffffffffffffffffL))) {
						Class42_Sub1.anInt5356 = OutputStream_Sub1.aClass240_36
								.method2925(0, Class212.aLong1599);
						for (int i = 0; Class42_Sub1.anInt5356 > i; i++) {
							method85(6341);
						}
						method91(784382337);
						PlayerUpdate.method2857(
								Class98_Sub43_Sub2.aClass88_5907, 31668,
								Class42_Sub3.aCanvas5361);
					}
				} catch (final ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (final Throwable throwable) {
					Class305_Sub1.method3585(throwable, -123, method94(0));
					method97((byte) -88, "crash");
				} finally {
					method98(true, 18192);
				}
			} while (false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ue.run(" + ')');
		}
	}

	// final boolean method89(int i) {
	// try {
	/*
	 * anInt23++; String string = getDocumentBase().getHost().toLowerCase(); if
	 * (string.equals("jagex.com") || string.endsWith(".jagex.com")) return
	 * true; if (string.equals("runescape.com") ||
	 * string.endsWith(".runescape.com")) return true; if (i < 89)
	 * getDocumentBase(); if (string.equals("stellardawn.com") ||
	 * string.endsWith(".stellardawn.com")) return true; if
	 * (string.contains(launch.ip)) return true; if
	 * (string.endsWith("192.168.1.")) return true; method81(-17312,
	 * "invalidhost"); return false;
	 */
	// return true;
	// /}

	final boolean method89(final int i) {
		return true;
	}

	abstract void method90(int i);

	public static final void provideLoaderApplet(final Applet applet) {
		try {
			Class76_Sub11.anApplet3799 = applet;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("ue.provideLoaderApplet("
							+ (applet != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method91(final int i) {
		try {
			final long l = Class343.method3819(i + -784382384);
			
			final long l_17_ = Class89.aLongArray709[Class98_Sub46_Sub11.anInt6024];
			Class89.aLongArray709[Class98_Sub46_Sub11.anInt6024] = l;
			if (i != 784382337) {
				windowOpened(null);
			}
			Class98_Sub46_Sub11.anInt6024 = 0x1f
					& Class98_Sub46_Sub11.anInt6024 - -1;
			if ((l_17_ ^ 0xffffffffffffffffL) != -1L && l > l_17_) {
				final int i_18_ = (int) (l + -l_17_);
				Class338.anInt2842 = ((i_18_ >> 784382337) + 32000) / i_18_;
			}
			do {
				if ((OutputStream_Sub1.anInt32++ ^ 0xffffffff) < -51) {
					Class246_Sub10.aBoolean5152 = true;
					OutputStream_Sub1.anInt32 -= 50;
					Class42_Sub3.aCanvas5361.setSize(Class39_Sub1.anInt3593,
							Class98_Sub25.anInt4024);
					Class42_Sub3.aCanvas5361.setVisible(true);
					if (Class284.aFrame2168 == null
							|| Class98_Sub18.aFrame3950 != null) {
						Class42_Sub3.aCanvas5361.setLocation(
								Class98_Sub46_Sub10.anInt6022,
								Class191.anInt1479);
						if (!client.aBoolean3553) {
							break;
						}
					}
					final Insets insets = Class284.aFrame2168.getInsets();
					Class42_Sub3.aCanvas5361.setLocation(insets.left
							+ Class98_Sub46_Sub10.anInt6022, Class191.anInt1479
							+ insets.top);
				}
			} while (false);
			method93(i + -784382227);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ue.R(" + i + ')');
		}
	}

	abstract void method92(boolean bool);

	@Override
	public final URL getDocumentBase() {
		try {
			if (Class284.aFrame2168 != null) {
				return null;
			}
			if (Class76_Sub11.anApplet3799 != null
					&& Class76_Sub11.anApplet3799 != this) {
				return Class76_Sub11.anApplet3799.getDocumentBase();
			}
			return super.getDocumentBase();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					"ue.getDocumentBase(" + ')');
		}
	}

	abstract void method93(int i);

	@Override
	public final AppletContext getAppletContext() {
		try {
			if (Class284.aFrame2168 != null) {
				return null;
			}
			if (Class76_Sub11.anApplet3799 != null
					&& Class76_Sub11.anApplet3799 != this) {
				return Class76_Sub11.anApplet3799.getAppletContext();
			}
			return super.getAppletContext();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					"ue.getAppletContext(" + ')');
		}
	}

	@Override
	public final URL getCodeBase() {
		try {
			if (Class284.aFrame2168 != null) {
				return null;
			}
			if (Class76_Sub11.anApplet3799 != null
					&& Class76_Sub11.anApplet3799 != this) {
				return Class76_Sub11.anApplet3799.getCodeBase();
			}
			return super.getCodeBase();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final void stop() {
		try {
			if (this == Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271
					&& !Class98_Sub10_Sub21.aBoolean5646) {
				Class180.aLong3404 = Class343.method3819(-47) + 4000L;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ue.stop(" + ')');
		}
	}

	@Override
	public abstract void init();

	@Override
	public final void windowDeactivated(final WindowEvent windowevent) {
		/* empty */
	}

	String method94(final int i) {
		try {
			if (i != 0) {
				aBoolean1 = true;
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ue.H(" + i + ')');
		}
	}

	@Override
	public final void windowClosing(final WindowEvent windowevent) {
		try {
			destroy();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("ue.windowClosing("
							+ (windowevent != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final synchronized void paint(final Graphics graphics) {
		do {
			try {
				if (Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271 == this
						&& !Class98_Sub10_Sub21.aBoolean5646) {
					Class246_Sub10.aBoolean5152 = true;
					if (!Class237.aBoolean1803
							|| (-client.aLong3547 + Class343.method3819(-47) <= 1000L)) {
						break;
					}
					final Rectangle rectangle = graphics.getClipBounds();
					if (rectangle == null
							|| (((rectangle.width ^ 0xffffffff) <= (Class188.anInt1453 ^ 0xffffffff)) && ((rectangle.height ^ 0xffffffff) <= (Class123_Sub1.anInt4744 ^ 0xffffffff)))) {
						Class224_Sub2_Sub1.aBoolean6142 = true;
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ue.paint("
						+ (graphics != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	abstract void method95(int i);

	static final int method96(final Class243 class243, final int i,
			final int[] is, final int i_19_, final int i_20_, final int i_21_,
			final int i_22_, final int i_23_, final int[] is_24_,
			final boolean bool, final int i_25_, final int i_26_,
			final int i_27_, final int i_28_, final int i_29_) {
		try {
			for (int i_30_ = 0; i_30_ < 128; i_30_++) {
				for (int i_31_ = 0; i_31_ < 128; i_31_++) {
					PlayerUpdateMask.anIntArrayArray528[i_30_][i_31_] = 0;
					Class339.anIntArrayArray2846[i_30_][i_31_] = 99999999;
				}
			}
			boolean bool_32_;
			if (i != 1) {
				if ((i ^ 0xffffffff) == -3) {
					bool_32_ = Class146_Sub2.method2384(class243, i_22_, i_29_,
							i_19_, i_26_, i_20_, i_28_, i_27_ ^ 0x29ddf632,
							i_21_, i_25_, i_23_);
				} else {
					bool_32_ = Class98_Sub46_Sub10.method1568(i, i_22_, i_28_,
							i_20_, i_23_, (byte) 20, i_26_, i_19_, i_29_,
							i_25_, i_21_, class243);
				}
			} else {
				bool_32_ = Class98_Sub43_Sub4.method1506(i_26_, 14664, i_22_,
						i_28_, i_19_, i_25_, class243, i_21_, i_20_, i_29_,
						i_23_);
			}
			final int i_33_ = i_28_ + -64;
			final int i_34_ = i_23_ + -64;
			if (i_27_ != 48) {
				anInt2 = -57;
			}
			int i_35_ = Class199.anInt1539;
			int i_36_ = Class22.anInt217;
			if (!bool_32_) {
				if (bool) {
					int i_37_ = 2147483647;
					int i_38_ = 2147483647;
					final int i_39_ = 10;
					for (int i_40_ = -i_39_ + i_25_; (i_40_ ^ 0xffffffff) >= (i_25_
							+ i_39_ ^ 0xffffffff); i_40_++) {
						for (int i_41_ = -i_39_ + i_21_; i_39_ + i_21_ >= i_41_; i_41_++) {
							final int i_42_ = i_40_ - i_33_;
							final int i_43_ = i_41_ - i_34_;
							if (i_42_ >= 0
									&& (i_43_ ^ 0xffffffff) <= -1
									&& i_42_ < 128
									&& i_43_ < 128
									&& (Class339.anIntArrayArray2846[i_42_][i_43_] < 100)) {
								int i_44_ = 0;
								if (i_25_ > i_40_) {
									i_44_ = -i_40_ + i_25_;
								} else if (i_25_ + (i_29_ + -1) < i_40_) {
									i_44_ = -i_29_ + (-i_25_ - -1) + i_40_;
								}
								int i_45_ = 0;
								if ((i_21_ ^ 0xffffffff) >= (i_41_ ^ 0xffffffff)) {
									if (i_41_ > i_22_ + (i_21_ - 1)) {
										i_45_ = i_41_ + 1 + (-i_22_ + -i_21_);
									}
								} else {
									i_45_ = -i_41_ + i_21_;
								}
								final int i_46_ = i_44_ * i_44_ + i_45_ * i_45_;
								if (i_37_ > i_46_
										|| ((i_37_ ^ 0xffffffff) == (i_46_ ^ 0xffffffff) && (Class339.anIntArrayArray2846[i_42_][i_43_]) < i_38_)) {
									i_36_ = i_41_;
									i_35_ = i_40_;
									i_37_ = i_46_;
									i_38_ = (Class339.anIntArrayArray2846[i_42_][i_43_]);
								}
							}
						}
					}
					if (i_37_ == 2147483647) {
						return -1;
					}
				} else {
					return -1;
				}
			}
			if ((i_28_ ^ 0xffffffff) == (i_35_ ^ 0xffffffff)
					&& (i_36_ ^ 0xffffffff) == (i_23_ ^ 0xffffffff)) {
				return 0;
			}
			int i_47_ = 0;
			Class359.anIntArray3060[i_47_] = i_35_;
			Class75.anIntArray580[i_47_++] = i_36_;
			int i_49_;
			int i_48_ = i_49_ = (PlayerUpdateMask.anIntArrayArray528[-i_33_
					+ i_35_][-i_34_ + i_36_]);
			while ((i_28_ ^ 0xffffffff) != (i_35_ ^ 0xffffffff)
					|| (i_36_ ^ 0xffffffff) != (i_23_ ^ 0xffffffff)) {
				if ((i_49_ ^ 0xffffffff) != (i_48_ ^ 0xffffffff)) {
					i_49_ = i_48_;
					Class359.anIntArray3060[i_47_] = i_35_;
					Class75.anIntArray580[i_47_++] = i_36_;
				}
				if ((i_48_ & 0x2) == 0) {
					if ((i_48_ & 0x8) != 0) {
						i_35_--;
					}
				} else {
					i_35_++;
				}
				if ((i_48_ & 0x1 ^ 0xffffffff) == -1) {
					if ((0x4 & i_48_ ^ 0xffffffff) != -1) {
						i_36_--;
					}
				} else {
					i_36_++;
				}
				i_48_ = (PlayerUpdateMask.anIntArrayArray528[-i_33_ + i_35_][-i_34_
						+ i_36_]);
			}
			int i_50_ = 0;
			while ((i_47_-- ^ 0xffffffff) < -1) {
				is[i_50_] = Class359.anIntArray3060[i_47_];
				is_24_[i_50_++] = Class75.anIntArray580[i_47_];
				if ((is.length ^ 0xffffffff) >= (i_50_ ^ 0xffffffff)) {
					break;
				}
			}
			return i_50_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ue.K("
					+ (class243 != null ? "{...}" : "null") + ',' + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_19_ + ','
					+ i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ','
					+ (is_24_ != null ? "{...}" : "null") + ',' + bool + ','
					+ i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ','
					+ i_29_ + ')'));
		}
	}

	public Applet_Sub1() {
		aBoolean1 = false;
	}

	@Override
	public final void focusGained(final FocusEvent focusevent) {
		try {
			Class153.aBoolean1228 = true;
			Class246_Sub10.aBoolean5152 = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ue.focusGained("
					+ (focusevent != null ? "{...}" : "null") + ')'));
		}
	}

	final void method97(final byte i, final String string) {
		try {
			if (!aBoolean3) {
				aBoolean3 = true;
				System.out.println("error_game_" + string);
				try {
					Class203.method2704("loggedout",
							Class76_Sub11.anApplet3799, -26978);
				} catch (final Throwable throwable) {
					/* empty */
				}
				try {
					getAppletContext().showDocument(
							new URL(getCodeBase(),
									("error_game_" + string + ".ws")), "_top");
				} catch (final Exception exception) {
					/* empty */
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ue.A(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method98(final boolean bool, final int i) {
		try {
			synchronized (this) {
				if (Class98_Sub10_Sub21.aBoolean5646) {
					return;
				}
				if (i != 18192) {
					return;
				}
				Class98_Sub10_Sub21.aBoolean5646 = true;
			}
			System.out.println("Shutdown start - clean:" + bool);
			if (Class76_Sub11.anApplet3799 != null) {
				Class76_Sub11.anApplet3799.destroy();
			}
			try {
				method92(false);
			} catch (final Exception exception) {
				/* empty */
			}
			if (aBoolean1) {
				try {
					jagmisc.quit();
				} catch (final Throwable throwable) {
					/* empty */
				}
				aBoolean1 = false;
			}
			Class192.method2652(-87, true);
			Class351.method3847(-91);
			if (Class42_Sub3.aCanvas5361 != null) {
				try {
					Class42_Sub3.aCanvas5361.removeFocusListener(this);
					Class42_Sub3.aCanvas5361.getParent().remove(
							Class42_Sub3.aCanvas5361);
				} catch (final Exception exception) {
					/* empty */
				}
			}
			if (Class98_Sub43_Sub2.aClass88_5907 != null) {
				try {
					Class98_Sub43_Sub2.aClass88_5907.method874(103);
				} catch (final Exception exception) {
					/* empty */
				}
			}
			method90(0);
			if (Class284.aFrame2168 != null) {
				Class284.aFrame2168.setVisible(false);
				Class284.aFrame2168.dispose();
				Class284.aFrame2168 = null;
			}
			System.out.println("Shutdown complete - clean:" + bool);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ue.I(" + bool
					+ ',' + i + ')');
		}
	}
}
