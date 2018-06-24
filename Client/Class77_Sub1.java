/* Class77_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

final class Class77_Sub1 extends Class77 implements KeyListener, FocusListener {
	static Class348 aClass348_3801;
	private Class148 aClass148_3802 = new Class148();
	static int anInt3803 = -2;
	static int[] anIntArray3804;
	static Class326 aClass326_3805;
	private final Class148 aClass148_3806 = new Class148();
	private Component aComponent3807;
	private boolean[] aBooleanArray3808 = new boolean[112];

	@Override
	public final synchronized void keyTyped(final KeyEvent keyevent) {
		try {
			final char c = keyevent.getKeyChar();
			if (c != 0 && Class111.method2089((byte) 102, c)) {
				method786(3, -1, c, false);
				keyevent.consume();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oca.keyTyped("
					+ (keyevent != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	public final synchronized void keyReleased(final KeyEvent keyevent) {
		try {
			method783((byte) 61, 1, keyevent);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oca.keyReleased("
					+ (keyevent != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final void focusGained(final FocusEvent focusevent) {
		/* empty */
	}

	static final boolean method781(final byte i, final String string) {
		try {
			if (i != 53) {
				anIntArray3804 = null;
			}
			return Class48_Sub1_Sub2.method468(true, 30883, 10, string);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oca.J(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method773(final byte i) {
		try {
			if (i <= -9) {
				method782(128);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oca.B(" + i + ')');
		}
	}

	private final void method782(final int i) {
		try {
			if (aComponent3807 != null) {
				aComponent3807.removeKeyListener(this);
				aComponent3807.removeFocusListener(this);
				aComponent3807 = null;
				for (int i_0_ = 0; i_0_ < 112; i_0_++) {
					aBooleanArray3808[i_0_] = false;
				}
				if (i != 128) {
					aClass348_3801 = null;
				}
				aClass148_3802.method2422((byte) 47);
				aClass148_3806.method2422((byte) 47);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oca.Q(" + i + ')');
		}
	}

	private final void method783(final byte i, final int i_1_,
			final KeyEvent keyevent) {
		try {
			int i_2_ = keyevent.getKeyCode();
			if (i != 61) {
				aBooleanArray3808 = null;
			}
			if (i_2_ != 0) {
				if (i_2_ >= 0
						&& (i_2_ ^ 0xffffffff) > (Surface.anIntArray667.length ^ 0xffffffff)) {
					i_2_ = Surface.anIntArray667[i_2_];
					if (i_1_ != 0 || (i_2_ & 0x80 ^ 0xffffffff) == -1) {
						i_2_ &= ~0x80;
					} else {
						i_2_ = 0;
					}
				} else {
					i_2_ = 0;
				}
			} else {
				i_2_ = 0;
			}
			if ((i_2_ ^ 0xffffffff) != -1) {
				method786(i_1_, i_2_, '\0', false);
				keyevent.consume();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(
							runtimeexception,
							("oca.K(" + i + ',' + i_1_ + ','
									+ (keyevent != null ? "{...}" : "null") + ')'));
		}
	}

	private final int method784(final byte i) {
		try {
			int i_3_ = 0;
			if (aBooleanArray3808[81]) {
				i_3_ |= 0x1;
			}
			if (i <= 32) {
				return -81;
			}
			if (aBooleanArray3808[82]) {
				i_3_ |= 0x4;
			}
			if (aBooleanArray3808[86]) {
				i_3_ |= 0x2;
			}
			return i_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oca.L(" + i + ')');
		}
	}

	@Override
	final synchronized void method774(final byte i) {
		do {
			try {
				aClass148_3802.method2422((byte) 47);
				for (Class98_Sub8 class98_sub8 = (Class98_Sub8) aClass148_3806
						.method2421(6494); class98_sub8 != null; class98_sub8 = (Class98_Sub8) aClass148_3806
						.method2421(6494)) {
					class98_sub8.anInt3266 = method784((byte) 127);
					if (class98_sub8.anInt3268 != 0) {
						if ((class98_sub8.anInt3268 ^ 0xffffffff) == -2) {
							if (aBooleanArray3808[class98_sub8.anInt3269]) {
								aClass148_3802.method2419(class98_sub8, -20911);
								aBooleanArray3808[class98_sub8.anInt3269] = false;
							}
						} else if (class98_sub8.anInt3268 == -1) {
							for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -113; i_4_++) {
								if (aBooleanArray3808[i_4_]) {
									final Class98_Sub8 class98_sub8_5_ = new Class98_Sub8();
									class98_sub8_5_.anInt3266 = (class98_sub8.anInt3266);
									class98_sub8_5_.anInt3269 = i_4_;
									class98_sub8_5_.aLong3267 = (class98_sub8.aLong3267);
									class98_sub8_5_.anInt3268 = 1;
									class98_sub8_5_.aChar3265 = '\0';
									aClass148_3802.method2419(class98_sub8_5_,
											-20911);
									aBooleanArray3808[i_4_] = false;
								}
							}
						} else if (class98_sub8.anInt3268 == 3) {
							aClass148_3802.method2419(class98_sub8, -20911);
						}
					} else {
						if (!aBooleanArray3808[class98_sub8.anInt3269]) {
							final Class98_Sub8 class98_sub8_6_ = new Class98_Sub8();
							class98_sub8_6_.aLong3267 = class98_sub8.aLong3267;
							class98_sub8_6_.anInt3266 = class98_sub8.anInt3266;
							class98_sub8_6_.anInt3268 = 0;
							class98_sub8_6_.aChar3265 = '\0';
							class98_sub8_6_.anInt3269 = class98_sub8.anInt3269;
							aClass148_3802.method2419(class98_sub8_6_, -20911);
							aBooleanArray3808[(class98_sub8.anInt3269)] = true;
						}
						class98_sub8.anInt3268 = 2;
						aClass148_3802.method2419(class98_sub8, -20911);
					}
				}
				if (i <= -74) {
					break;
				}
				method789(102);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "oca.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method785(final int i) {
		try {
			if (i != 3) {
				method785(48);
			}
			aClass348_3801 = null;
			anIntArray3804 = null;
			aClass326_3805 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oca.O(" + i + ')');
		}
	}

	@Override
	public final synchronized void focusLost(final FocusEvent focusevent) {
		try {
			method786(-1, 0, '\0', false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oca.focusLost("
					+ (focusevent != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method786(final int i, final int i_7_, final char c,
			final boolean bool) {
		try {
			final Class98_Sub8 class98_sub8 = new Class98_Sub8();
			class98_sub8.anInt3269 = i_7_;
			class98_sub8.aChar3265 = c;
			class98_sub8.anInt3268 = i;
			class98_sub8.aLong3267 = Class343.method3819(-47);
			if (bool != false) {
				aClass326_3805 = null;
			}
			aClass148_3806.method2419(class98_sub8, -20911);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oca.N(" + i + ','
					+ i_7_ + ',' + c + ',' + bool + ')'));
		}
	}

	static final void method787(final byte i, final int i_8_) {
		try {
			if (i <= 88) {
				method787((byte) -39, 78);
			}
			Class246_Sub4_Sub1.aClass79_6170.method800((byte) 62, i_8_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oca.I(" + i + ','
					+ i_8_ + ')');
		}
	}

	private final void method788(final Component component, final int i) {
		do {
			try {
				method782(128);
				aComponent3807 = component;
				final Method method = Class88.aMethod700;
				if (method != null) {
					try {
						method.invoke(aComponent3807,
								new Object[] { Boolean.FALSE });
					} catch (final Throwable throwable) {
						/* empty */
					}
				}
				aComponent3807.addKeyListener(this);
				aComponent3807.addFocusListener(this);
				if (i <= -117) {
					break;
				}
				keyReleased(null);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("oca.P(" + (component != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	@Override
	public final synchronized void keyPressed(final KeyEvent keyevent) {
		try {
			method783((byte) 61, 0, keyevent);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oca.keyPressed("
					+ (keyevent != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method789(final int i) {
		try {
			for (Class98_Sub33 class98_sub33 = (Class98_Sub33) Class191.aClass148_1478
					.method2418(32); class98_sub33 != null; class98_sub33 = ((Class98_Sub33) Class191.aClass148_1478
					.method2417(94))) {
				if (class98_sub33.aBoolean4124) {
					class98_sub33.method942(79);
				} else {
					class98_sub33.aBoolean4123 = true;
					if (class98_sub33.anInt4112 >= 0
							&& class98_sub33.anInt4113 >= 0
							&& (class98_sub33.anInt4112 ^ 0xffffffff) > (Class165.anInt1276 ^ 0xffffffff)
							&& ((class98_sub33.anInt4113 ^ 0xffffffff) > (Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff))) {
						Class98_Sub46_Sub9
								.method1558((byte) 109, class98_sub33);
					}
				}
			}
			for (Class98_Sub33 class98_sub33 = ((Class98_Sub33) Class98_Sub11.aClass148_3866
					.method2418(32)); class98_sub33 != null; class98_sub33 = (Class98_Sub33) Class98_Sub11.aClass148_3866
					.method2417(98)) {
				if (!class98_sub33.aBoolean4124) {
					class98_sub33.aBoolean4123 = true;
				} else {
					class98_sub33.method942(53);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oca.M(" + i + ')');
		}
	}

	@Override
	final boolean method779(final int i, final int i_10_) {
		try {
			if ((i ^ 0xffffffff) > -1 || i >= 112) {
				return false;
			}
			if (i_10_ != 5503) {
				return true;
			}
			return aBooleanArray3808[i];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oca.C(" + i + ','
					+ i_10_ + ')');
		}
	}

	@Override
	final Interface7 method776(final byte i) {
		try {
			if (i != 31) {
				aClass148_3802 = null;
			}
			return (Interface7) aClass148_3802.method2421(6494);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oca.A(" + i + ')');
		}
	}

	Class77_Sub1(final Component component) {
		try {
			Class202.method2703(false);
			method788(component, -124);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oca.<init>("
					+ (component != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aClass348_3801 = new Class348(1, 2, 2, 0);
	}
}
