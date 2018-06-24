/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class Canvas_Sub1 extends Canvas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7665093628592335222L;
	static int anInt23;
	private Component aComponent24;
	static float aFloat25;
	static int anInt26 = -1;

	Canvas_Sub1(final Component component) {
		try {
			aComponent24 = component;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "bn.<init>("
					+ (component != null ? "{...}" : "null") + ')');
		}
	}

	static final void method118(final byte i) {
		try {
			if ((Class177.anInt1376 ^ 0xffffffff) == -8) {
				Class98_Sub10_Sub1.method1003(false, false);
			} else {
				Class318.aClass123_2698 = aa_Sub1.aClass123_3561;
				aa_Sub1.aClass123_3561 = null;
				if (i == 104) {
					Class61.method538(13, false);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "bn.A(" + i + ')');
		}
	}

	static final void method119(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_, final int i_5_,
			final int i_6_, final int i_7_) {
		do {
			try {
				if (i_4_ < (i_5_ ^ 0xffffffff)
						|| i_0_ < 1
						|| (i_5_ ^ 0xffffffff) < (Class165.anInt1276 + -2 ^ 0xffffffff)
						|| -2 + Class98_Sub10_Sub7.anInt5572 < i_0_) {
					break;
				}
				int i_8_ = i_3_;
				if ((i_8_ ^ 0xffffffff) > -4
						&& Class1.method162(i_0_, (byte) -88, i_5_)) {
					i_8_++;
				}
				if ((Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4076
						.method564((byte) 122) != 0 || Class294.method3477(
						i_0_, i_8_, i_5_, Class115.anInt963, 55))
						&& (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948 != null)) {
					Class146_Sub3.aClass305_Sub1_4952.method3590(i_0_, i_3_,
							Class265.aHa1974,
							Class167.aClass243Array1281[i_3_], 1, i_1_, i_5_);
					if (i < 0) {
						break;
					}
					final int i_9_ = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038
							.method596((byte) 122);
					Class98_Sub9.aClass98_Sub27_3856
							.method1285(
									(byte) -13,
									1,
									(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038));
					Class146_Sub3.aClass305_Sub1_4952.method3588(i, i_0_, i_6_,
							i_8_, false, i_5_, Class265.aHa1974, i_2_, i_7_,
							i_3_, Class167.aClass243Array1281[i_3_]);
					Class98_Sub9.aClass98_Sub27_3856
							.method1285(
									(byte) -13,
									i_9_,
									(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038));
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("bn.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_
								+ ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ','
								+ i_6_ + ',' + i_7_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	public final void paint(final Graphics graphics) {
		try {
			aComponent24.paint(graphics);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "bn.paint("
					+ (graphics != null ? "{...}" : "null") + ')');
		}
	}

	static final aa_Sub2 method120(final int i, final ha_Sub3 var_ha_Sub3,
			final int i_10_, final int[] is, final int i_11_, final int[] is_12_) {
		try {
			if (i_11_ <= 70) {
				method119(108, -86, 41, 17, 85, 52, -105, 11, 108);
			}
			if (!var_ha_Sub3.method1942(0, Class53_Sub1.aClass164_3633,
					Class162.aClass162_1266)) {
				final int[] is_13_ = new int[i_10_ * i];
				for (int i_14_ = 0; i > i_14_; i_14_++) {
					int i_15_ = is[i_14_] + i_14_ * i_10_;
					for (int i_16_ = 0; (is_12_[i_14_] ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
						is_13_[i_15_++] = -16777216;
					}
				}
				return new aa_Sub2(var_ha_Sub3, i_10_, i, is_13_);
			}
			final byte[] is_17_ = new byte[i_10_ * i];
			for (int i_18_ = 0; i > i_18_; i_18_++) {
				int i_19_ = i_10_ * i_18_ + is[i_18_];
				for (int i_20_ = 0; is_12_[i_18_] > i_20_; i_20_++) {
					is_17_[i_19_++] = (byte) -1;
				}
			}
			return new aa_Sub2(var_ha_Sub3, i_10_, i, is_17_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("bn.B(" + i + ','
					+ (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i_10_
					+ ',' + (is != null ? "{...}" : "null") + ',' + i_11_ + ','
					+ (is_12_ != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final void update(final Graphics graphics) {
		try {
			aComponent24.update(graphics);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "bn.update("
					+ (graphics != null ? "{...}" : "null") + ')');
		}
	}
}
