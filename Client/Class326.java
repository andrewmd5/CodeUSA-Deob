/* Class326 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

final class Class326 {
	private final Class332[] aClass332Array2731;
	private static int anInt2732 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
			.length();
	private static int[] anIntArray2733 = new int[256];
	private final int[] anIntArray2734 = new int[4];
	private int anInt2735;
	private int anInt2736;
	private boolean aBoolean2737 = false;
	private final int[] anIntArray2738;

	final int method3701(final String string) {
		int i = 0;
		for (int i_0_ = 0; i_0_ < string.length(); i_0_++) {
			final int i_1_ = anIntArray2733[string.charAt(i_0_)];
			i += anIntArray2738[i_1_];
		}
		return i;
	}

	private final void method3702(final ha var_ha, final Font font,
			final FontMetrics fontmetrics, final char c, final int i,
			boolean bool) {
		int i_2_ = fontmetrics.charWidth(c);
		final int i_3_ = i_2_;
		if (bool) {
			try {
				if (c == '/') {
					bool = false;
				}
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k'
						|| c == 'x' || c == 'y' || c == 'A' || c == 'V'
						|| c == 'W') {
					i_2_++;
				}
			} catch (final Exception exception) {
				/* empty */
			}
		}
		final int i_4_ = fontmetrics.getMaxAscent();
		final int i_5_ = fontmetrics.getMaxAscent()
				+ fontmetrics.getMaxDescent();
		final int i_6_ = fontmetrics.getHeight();
		final Image image = Class42_Sub3.aCanvas5361.createImage(i_2_, i_5_);
		final Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_2_, i_5_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(String.valueOf(c), 0, i_4_);
		if (bool) {
			graphics.drawString(String.valueOf(c), 1, i_4_);
		}
		final int[] is = new int[i_2_ * i_5_];
		final PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_2_,
				i_5_, is, 0, i_2_);
		try {
			pixelgrabber.grabPixels();
		} catch (final Exception exception) {
			/* empty */
		}
		image.flush();
		int i_7_ = 0;
		while_223_: for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
			for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
				final int i_10_ = is[i_9_ + i_8_ * i_2_];
				if ((i_10_ & 0xffffff) != 0) {
					i_7_ = i_8_;
					break while_223_;
				}
			}
		}
		for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
			if ((is[i_11_] & 0xffffff) == 0) {
				is[i_11_] = 0;
			}
		}
		anInt2736 = i_4_ - i_7_;
		anInt2735 = i_6_;
		anIntArray2738[i] = i_3_;
		aClass332Array2731[i] = var_ha.method1748(-7962, 0, i_2_, i_5_, is,
				i_2_);
	}

	public static void method3703() {
		anIntArray2733 = null;
	}

	final int method3704() {
		return anInt2736;
	}

	final int method3705() {
		return anInt2735 - 1;
	}

	final void method3706(final ha var_ha, final String string, final int i,
			final int i_12_, final int i_13_, final boolean bool) {
		final int i_14_ = method3701(string) / 2;
		var_ha.K(anIntArray2734);
		if (i - i_14_ <= anIntArray2734[2] && i + i_14_ >= anIntArray2734[0]
				&& i_12_ - anInt2736 <= anIntArray2734[3]
				&& i_12_ + anInt2735 >= anIntArray2734[1]) {
			method3707(var_ha, string, anIntArray2734, i - i_14_, i_12_, i_13_,
					bool);
		}
	}

	private final void method3707(final ha var_ha, final String string,
			final int[] is, int i, final int i_15_, int i_16_, boolean bool) {
		if (i_16_ == 0) {
			bool = false;
		}
		i_16_ |= ~0xffffff;
		for (int i_17_ = 0; i_17_ < string.length(); i_17_++) {
			final int i_18_ = anIntArray2733[string.charAt(i_17_)];
			if (bool) {
				aClass332Array2731[i_18_].method3748(i + 1, i_15_ + 1, 0,
						-16777216, 1);
			}
			aClass332Array2731[i_18_].method3748(i, i_15_, 0, i_16_, 1);
			i += anIntArray2738[i_18_];
		}
	}

	Class326(final ha var_ha, final int i, final boolean bool,
			final Component component) {
		aBoolean2737 = false;
		aClass332Array2731 = new Class332[256];
		anIntArray2738 = new int[256];
		Font font = new Font("Helvetica", bool ? 1 : 0, i);
		FontMetrics fontmetrics = component.getFontMetrics(font);
		for (int i_19_ = 0; i_19_ < anInt2732; i_19_++) {
			method3702(
					var_ha,
					font,
					fontmetrics,
					"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
							.charAt(i_19_), i_19_, false);
		}
		if (bool && aBoolean2737) {
			aBoolean2737 = false;
			font = new Font("Helvetica", 0, i);
			fontmetrics = component.getFontMetrics(font);
			for (int i_20_ = 0; i_20_ < anInt2732; i_20_++) {
				method3702(
						var_ha,
						font,
						fontmetrics,
						"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
								.charAt(i_20_), i_20_, false);
			}
			if (!aBoolean2737) {
				aBoolean2737 = false;
				for (int i_21_ = 0; i_21_ < anInt2732; i_21_++) {
					method3702(
							var_ha,
							font,
							fontmetrics,
							"<col=ffffff>ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
									.charAt(i_21_), i_21_, true);
				}
			}
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_22_ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
					.indexOf(i);
			if (i_22_ == -1) {
				i_22_ = 74;
			}
			anIntArray2733[i] = i_22_;
		}
	}
}
