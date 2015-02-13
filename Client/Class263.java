/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.zip.Inflater;

final class Class263 {
	private Inflater anInflater1963;
	static OutgoingOpcode aClass171_1964 = new OutgoingOpcode(60, 7);
	static int anInt1965;
	static double aDouble1966;
	static int anInt1967;

	static final void method3216(final int i) {
		do {
			try {
				if (Class98_Sub18.aFrame3950 != null) {
					break;
				}
				final int i_0_ = Class98_Sub46_Sub10.anInt6022;
				final int i_1_ = Class191.anInt1479;
				final int i_2_ = Class188.anInt1453 + -Class39_Sub1.anInt3593
						+ -i_0_;
				final int i_3_ = (Class123_Sub1.anInt4744 + (-Class98_Sub25.anInt4024 + -i_1_));
				if (i != 14059) {
					break;
				}
				if (i_0_ > 0 || i_2_ > 0 || (i_1_ ^ 0xffffffff) < -1
						|| i_3_ > 0) {
					try {
						java.awt.Container container;
						if (Class284.aFrame2168 != null) {
							container = Class284.aFrame2168;
						} else if (Class76_Sub11.anApplet3799 != null) {
							container = Class76_Sub11.anApplet3799;
						} else {
							container = Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271;
						}
						int i_4_ = 0;
						int i_5_ = 0;
						if (Class284.aFrame2168 == container) {
							final Insets insets = Class284.aFrame2168
									.getInsets();
							i_4_ = insets.left;
							i_5_ = insets.top;
						}
						final Graphics graphics = container.getGraphics();
						graphics.setColor(Color.black);
						if ((i_0_ ^ 0xffffffff) < -1) {
							graphics.fillRect(i_4_, i_5_, i_0_,
									Class123_Sub1.anInt4744);
						}
						if (i_1_ > 0) {
							graphics.fillRect(i_4_, i_5_, Class188.anInt1453,
									i_1_);
						}
						if (i_2_ > 0) {
							graphics.fillRect(Class188.anInt1453
									+ (i_4_ + -i_2_), i_5_, i_2_,
									Class123_Sub1.anInt4744);
						}
						if (i_3_ <= 0) {
							break;
						}
						graphics.fillRect(i_4_, -i_3_
								+ (i_5_ - -Class123_Sub1.anInt4744),
								Class188.anInt1453, i_3_);
					} catch (final Exception exception) {
						/* empty */
					}
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qha.D(" + i
						+ ')');
			}
		} while (false);
	}

	static final char method3217(final int i, final char c) {
		try {
			if ((c ^ 0xffffffff) == -199) {
				return 'E';
			}
			if ((c ^ 0xffffffff) == -231) {
				return 'e';
			}
			if (c == 223) {
				return 's';
			}
			if (c == 338) {
				return 'E';
			}
			if ((c ^ 0xffffffff) == -340) {
				return 'e';
			}
			if (i != 14561) {
				anInt1965 = 124;
			}
			return '\0';
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qha.A(" + i + ','
					+ c + ')');
		}
	}

	final void method3218(final byte[] is, final ByteBuffer class98_sub22,
			final int i) {
		try {
			if (i == 18762) {
				if (((class98_sub22.aByteArray3992[class98_sub22.position]) ^ 0xffffffff) != -32
						|| ((class98_sub22.aByteArray3992[class98_sub22.position
								- -1]) ^ 0xffffffff) != 116) {
					throw new RuntimeException("Invalid GZIP header!");
				}
				if (anInflater1963 == null) {
					anInflater1963 = new Inflater(true);
				}
				try {
					anInflater1963
							.setInput(
									class98_sub22.aByteArray3992,
									10 + class98_sub22.position,
									(-18 - class98_sub22.position + (class98_sub22.aByteArray3992).length));
					anInflater1963.inflate(is);
				} catch (final Exception exception) {
					anInflater1963.reset();
					throw new RuntimeException("Invalid GZIP compressed data!");
				}
				anInflater1963.reset();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("qha.F(" + (is != null ? "{...}" : "null") + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	public Class263() {
		this(-1, 1000000, 1000000);
	}

	static final int method3219(final boolean bool, final int i,
			final int i_6_, final int i_7_) {
		try {
			if (bool != false) {
				aDouble1966 = 0.7636388514984377;
			}
			if ((i_6_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff)) {
				if (i >= i_7_) {
					return i_7_;
				}
				return i;
			}
			return i_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qha.E(" + bool
					+ ',' + i + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	final byte[] method3220(final byte i, final byte[] is) {
		try {
			final ByteBuffer class98_sub22 = new ByteBuffer(is);
			class98_sub22.position = -4 + is.length;
			final int i_8_ = class98_sub22.method1202((byte) -63);
			final byte[] is_9_ = new byte[i_8_];
			class98_sub22.position = 0;
			method3218(is_9_, class98_sub22, 18762);
			if (i < 90) {
				return null;
			}
			return is_9_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qha.B(" + i + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	private Class263(final int i, final int i_10_, final int i_11_) {
		/* empty */
	}

	public static void method3221(final int i) {
		try {
			if (i > -97) {
				aDouble1966 = 0.1934401666895311;
			}
			aClass171_1964 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qha.C(" + i + ')');
		}
	}
}
