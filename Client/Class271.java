/* Class271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

final class Class271 {
	static Class326 aClass326_2033;
	static long[] aLongArray2034 = new long[32];
	static int anInt2035;

	public static void method3276(final byte i) {
		try {
			aLongArray2034 = null;
			aClass326_2033 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qt.B(" + i + ')');
		}
	}

	static final Class332 method3277(final byte[] is, final int i) {
		try {
			if (i != 1) {
				aLongArray2034 = null;
			}
			if (is == null) {
				throw new RuntimeException("");
			}
			for (;;) {
				try {
					final Image image = Toolkit.getDefaultToolkit()
							.createImage(is);
					final MediaTracker mediatracker = new MediaTracker(
							Class315.aClient3529);
					mediatracker.addImage(image, 0);
					mediatracker.waitForAll();
					final int i_1_ = image.getWidth(Class315.aClient3529);
					final int i_2_ = image.getHeight(Class315.aClient3529);
					if (mediatracker.isErrorAny() || (i_1_ ^ 0xffffffff) > -1
							|| i_2_ < 0) {
						throw new RuntimeException("");
					}
					final int[] is_3_ = new int[i_2_ * i_1_];
					final PixelGrabber pixelgrabber = new PixelGrabber(image,
							0, 0, i_1_, i_2_, is_3_, 0, i_1_);
					pixelgrabber.grabPixels();
					return Class265.aHa1974.method1748(i ^ ~0x1f18, 0, i_1_,
							i_2_, is_3_, i_1_);
				} catch (final InterruptedException interruptedexception) {
					/* empty */
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qt.C("
					+ (is != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method3278(final int i, final int i_4_, final ha var_ha,
			final Class155 class155) {
		try {
			if (Class132.anIntArray1044 != null
					&& (i_4_ ^ 0xffffffff) >= (class155.aByte1238 ^ 0xffffffff)) {
				for (int i_5_ = 0; Class132.anIntArray1044.length > i_5_; i_5_++) {
					if ((Class132.anIntArray1044[i_5_] ^ 0xffffffff) != 999999
							&& (((Class132.anIntArray1044[i_5_] ^ 0xffffffff) <= (class155.anIntArray1237[0] ^ 0xffffffff))
									|| ((Class132.anIntArray1044[i_5_] ^ 0xffffffff) <= (class155.anIntArray1237[1] ^ 0xffffffff))
									|| ((class155.anIntArray1237[2] ^ 0xffffffff) >= (Class132.anIntArray1044[i_5_] ^ 0xffffffff)) || ((Class132.anIntArray1044[i_5_] ^ 0xffffffff) <= (class155.anIntArray1237[3] ^ 0xffffffff)))
							&& (((Class98_Sub46_Sub10.anIntArray6015[i_5_] ^ 0xffffffff) <= (class155.anIntArray1240[0] ^ 0xffffffff))
									|| (Class98_Sub46_Sub10.anIntArray6015[i_5_] >= class155.anIntArray1240[1])
									|| ((Class98_Sub46_Sub10.anIntArray6015[i_5_] ^ 0xffffffff) <= (class155.anIntArray1240[2] ^ 0xffffffff)) || (Class98_Sub46_Sub10.anIntArray6015[i_5_] >= class155.anIntArray1240[3]))
							&& (((Class288.anIntArray3376[i_5_] ^ 0xffffffff) >= (class155.anIntArray1240[0] ^ 0xffffffff))
									|| ((Class288.anIntArray3376[i_5_] ^ 0xffffffff) >= (class155.anIntArray1240[1] ^ 0xffffffff))
									|| ((Class288.anIntArray3376[i_5_] ^ 0xffffffff) >= (class155.anIntArray1240[2] ^ 0xffffffff)) || ((class155.anIntArray1240[3] ^ 0xffffffff) <= (Class288.anIntArray3376[i_5_] ^ 0xffffffff)))
							&& ((Class98_Sub10_Sub10.anIntArray5589[i_5_] >= class155.anIntArray1241[0])
									|| ((class155.anIntArray1241[1] ^ 0xffffffff) >= (Class98_Sub10_Sub10.anIntArray5589[i_5_] ^ 0xffffffff))
									|| ((class155.anIntArray1241[2] ^ 0xffffffff) >= (Class98_Sub10_Sub10.anIntArray5589[i_5_] ^ 0xffffffff)) || ((class155.anIntArray1241[3] ^ 0xffffffff) >= (Class98_Sub10_Sub10.anIntArray5589[i_5_] ^ 0xffffffff)))
							&& ((class155.anIntArray1241[0] >= Class364.anIntArray3102[i_5_])
									|| ((class155.anIntArray1241[1] ^ 0xffffffff) <= (Class364.anIntArray3102[i_5_] ^ 0xffffffff))
									|| (Class364.anIntArray3102[i_5_] <= class155.anIntArray1241[2]) || ((Class364.anIntArray3102[i_5_] ^ 0xffffffff) >= (class155.anIntArray1241[3] ^ 0xffffffff)))) {
						return;
					}
				}
			}
			if ((class155.aByte1242 ^ 0xffffffff) == -2) {
				final int i_6_ = -Class241.anInt1845
						+ (class155.aShort1236 - -Class259.anInt1959);
				if ((i_6_ ^ 0xffffffff) <= -1
						&& ((i_6_ ^ 0xffffffff) >= (Class259.anInt1959
								- -Class259.anInt1959 ^ 0xffffffff))) {
					int i_7_ = (-Class64_Sub26.anInt3714 + (class155.aShort1239 + Class259.anInt1959));
					if (i_7_ >= 0) {
						if ((Class259.anInt1959 + Class259.anInt1959 ^ 0xffffffff) > (i_7_ ^ 0xffffffff)) {
							return;
						}
					} else {
						i_7_ = 0;
					}
					int i_8_ = (-Class64_Sub26.anInt3714 + class155.aShort1245 + Class259.anInt1959);
					if (i_8_ > Class259.anInt1959 + Class259.anInt1959) {
						i_8_ = Class259.anInt1959 + Class259.anInt1959;
					} else if (i_8_ < 0) {
						return;
					}
					boolean bool = false;
					while ((i_7_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff)) {
						if (Class74.aBooleanArrayArray551[i_6_][i_7_++]) {
							bool = true;
							break;
						}
					}
					if (bool) {
						float f = Class127.anInt1018
								- (class155.anIntArray1240[0]);
						if (f < 0.0F) {
							f *= -1.0F;
						}
						if (!(Class370.anInt3139 > f)
								&& Class134.method2242(0, i + 5538, class155)
								&& Class134.method2242(1, 5541, class155)
								&& Class134.method2242(2, 5541, class155)
								&& Class134.method2242(3, 5541, class155)) {
							Class213.aClass155Array1611[Class59.anInt464++] = class155;
						}
					}
				}
			} else {
				if (i != 3) {
					method3276((byte) -55);
				}
				if ((class155.aByte1242 ^ 0xffffffff) == -3) {
					final int i_9_ = (-Class64_Sub26.anInt3714 + (class155.aShort1239 - -Class259.anInt1959));
					if ((i_9_ ^ 0xffffffff) <= -1
							&& Class259.anInt1959 + Class259.anInt1959 >= i_9_) {
						int i_10_ = (-Class241.anInt1845 + (class155.aShort1236 + Class259.anInt1959));
						if ((i_10_ ^ 0xffffffff) > -1) {
							i_10_ = 0;
						} else if (i_10_ > Class259.anInt1959
								+ Class259.anInt1959) {
							return;
						}
						int i_11_ = (Class259.anInt1959 + -Class241.anInt1845 + class155.aShort1243);
						if ((i_11_ ^ 0xffffffff) >= (Class259.anInt1959
								+ Class259.anInt1959 ^ 0xffffffff)) {
							if (i_11_ < 0) {
								return;
							}
						} else {
							i_11_ = Class259.anInt1959 + Class259.anInt1959;
						}
						boolean bool = false;
						while (i_11_ >= i_10_) {
							if (Class74.aBooleanArrayArray551[i_10_++][i_9_]) {
								bool = true;
								break;
							}
						}
						if (bool) {
							float f = -(class155.anIntArray1241[0])
									+ Class98_Sub48.anInt4280;
							if (f < 0.0F) {
								f *= -1.0F;
							}
							if (!(Class370.anInt3139 > f)
									&& Class134.method2242(0, 5541, class155)
									&& Class134.method2242(1, 5541, class155)
									&& Class134.method2242(2, 5541, class155)
									&& Class134.method2242(3, 5541, class155)) {
								Class213.aClass155Array1611[Class59.anInt464++] = class155;
							}
						}
					}
				} else if (class155.aByte1242 == 16 || class155.aByte1242 == 8) {
					final int i_12_ = (Class259.anInt1959 + -Class241.anInt1845 + class155.aShort1236);
					if ((i_12_ ^ 0xffffffff) <= -1
							&& (Class259.anInt1959 - -Class259.anInt1959 ^ 0xffffffff) <= (i_12_ ^ 0xffffffff)) {
						final int i_13_ = (-Class64_Sub26.anInt3714
								+ class155.aShort1239 - -Class259.anInt1959);
						if ((i_13_ ^ 0xffffffff) <= -1
								&& ((i_13_ ^ 0xffffffff) >= (Class259.anInt1959
										+ Class259.anInt1959 ^ 0xffffffff))
								&& Class74.aBooleanArrayArray551[i_12_][i_13_]) {
							float f = -(class155.anIntArray1240[0])
									+ Class127.anInt1018;
							if (f < 0.0F) {
								f *= -1.0F;
							}
							float f_14_ = -(class155.anIntArray1241[0])
									+ Class98_Sub48.anInt4280;
							if (f_14_ < 0.0F) {
								f_14_ *= -1.0F;
							}
							if ((!(Class370.anInt3139 > f) || !(Class370.anInt3139 > f_14_))
									&& Class134.method2242(0, i ^ 0x15a6,
											class155)
									&& Class134.method2242(1, 5541, class155)
									&& Class134.method2242(2, 5541, class155)
									&& Class134.method2242(3, 5541, class155)) {
								Class213.aClass155Array1611[Class59.anInt464++] = class155;
							}
						}
					}
				} else if (class155.aByte1242 == 4) {
					final float f = -Class42_Sub1_Sub1.anInt6208
							+ class155.anIntArray1237[0];
					if (!(f <= Class119_Sub1.anInt4716)) {
						int i_15_ = (Class259.anInt1959 + class155.aShort1239 - Class64_Sub26.anInt3714);
						if ((i_15_ ^ 0xffffffff) <= -1) {
							if (Class259.anInt1959 + Class259.anInt1959 < i_15_) {
								return;
							}
						} else {
							i_15_ = 0;
						}
						int i_16_ = (-Class64_Sub26.anInt3714
								+ class155.aShort1245 - -Class259.anInt1959);
						if (i_16_ > Class259.anInt1959 + Class259.anInt1959) {
							i_16_ = Class259.anInt1959 + Class259.anInt1959;
						} else if ((i_16_ ^ 0xffffffff) > -1) {
							return;
						}
						int i_17_ = (Class259.anInt1959 + -Class241.anInt1845 + class155.aShort1236);
						if ((i_17_ ^ 0xffffffff) <= -1) {
							if ((i_17_ ^ 0xffffffff) < (Class259.anInt1959
									- -Class259.anInt1959 ^ 0xffffffff)) {
								return;
							}
						} else {
							i_17_ = 0;
						}
						int i_18_ = (Class259.anInt1959 + class155.aShort1243 - Class241.anInt1845);
						if (i_18_ > Class259.anInt1959 - -Class259.anInt1959) {
							i_18_ = Class259.anInt1959 + Class259.anInt1959;
						} else if ((i_18_ ^ 0xffffffff) > -1) {
							return;
						}
						boolean bool = false;
						while_163_: for (int i_19_ = i_17_; (i_18_ ^ 0xffffffff) <= (i_19_ ^ 0xffffffff); i_19_++) {
							for (int i_20_ = i_15_; (i_20_ ^ 0xffffffff) >= (i_16_ ^ 0xffffffff); i_20_++) {
								if (Class74.aBooleanArrayArray551[i_19_][i_20_]) {
									bool = true;
									break while_163_;
								}
							}
						}
						if (bool && Class134.method2242(0, 5541, class155)
								&& Class134.method2242(1, i + 5538, class155)
								&& Class134.method2242(2, i ^ 0x15a6, class155)
								&& Class134.method2242(3, 5541, class155)) {
							Class213.aClass155Array1611[Class59.anInt464++] = class155;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qt.A(" + i + ','
					+ i_4_ + ',' + (var_ha != null ? "{...}" : "null") + ','
					+ (class155 != null ? "{...}" : "null") + ')'));
		}
	}
}
