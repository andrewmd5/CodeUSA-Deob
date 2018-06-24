/* Class93_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

final class Class93_Sub1_Sub1 extends Class93_Sub1 {
	static int anInt6289;
	int anInt6290;
	static int anInt6291;

	Class93_Sub1_Sub1(Class63 class63, Class110 class110, int i, int i_0_,
			int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
			int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		super(class63, class110, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_,
				i_7_, i_8_, i_9_, i_10_, i_11_);
		try {
			((Class93_Sub1_Sub1) this).anInt6290 = i_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hi.<init>("
					+ (class63 != null ? "{...}" : "null") + ','
					+ (class110 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ','
					+ i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	static final void method908(int i, int i_13_, boolean bool, int i_14_,
			int i_15_) {
		try {
			if (Class98_Sub46.anInt4261 == 1) {
				int i_16_ = i_14_ / Class197.anInt1513;
				int i_17_ = i_15_ / Class197.anInt1513;
				int i_18_ = i_13_ / Class98_Sub10_Sub38.anInt5761;
				int i_19_ = i / Class98_Sub10_Sub38.anInt5761;
				if (bool != false)
					anInt6291 = 95;
				if (i_16_ < Class191.anInt1477
						&& (i_17_ ^ 0xffffffff) <= -1
						&& (i_18_ ^ 0xffffffff) > (Class63.anInt493 ^ 0xffffffff)
						&& (i_19_ ^ 0xffffffff) <= -1) {
					if ((i_16_ ^ 0xffffffff) > -1)
						i_16_ = 0;
					if (i_18_ < 0)
						i_18_ = 0;
					if ((Class63.anInt493 ^ 0xffffffff) >= (i_19_ ^ 0xffffffff))
						i_19_ = -1 + Class63.anInt493;
					if ((i_17_ ^ 0xffffffff) <= (Class191.anInt1477 ^ 0xffffffff))
						i_17_ = Class191.anInt1477 + -1;
					for (int i_20_ = i_18_; i_20_ <= i_19_; i_20_++) {
						int i_21_ = (Class198.method2678((byte) 6, i_20_
								+ Class268.anInt2007, Class63.anInt493) * Class191.anInt1477);
						for (int i_22_ = i_16_; i_22_ <= i_17_; i_22_++) {
							int i_23_ = (i_21_ + Class198.method2678((byte) 6,
									i_22_ - -(Class76_Sub8.anInt3780),
									Class191.anInt1477));
							Class146_Sub2.anIntArray4873[i_23_] = Class230.anInt1732;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hi.C(" + i + ','
					+ i_13_ + ',' + bool + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	public final Class113 method70(int i) {
		try {
			if (i != 30778)
				return null;
			return Class18.aClass113_210;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hi.A(" + i + ')');
		}
	}

	static final void method909(int i, int i_24_, boolean bool, int i_25_,
			int i_26_, int i_27_) {
		try {
			if (Class98_Sub18.aFrame3950 != null
					&& (i != 3
							|| (Class110.anInt946 ^ 0xffffffff) != (i_26_ ^ 0xffffffff) || (i_27_ ^ 0xffffffff) != (Class112.anInt949 ^ 0xffffffff))) {
				Class281.method3331(false, Class98_Sub18.aFrame3950,
						Class98_Sub43_Sub2.aClass88_5907);
				Class98_Sub18.aFrame3950 = null;
			}
			if ((i ^ 0xffffffff) == -4 && Class98_Sub18.aFrame3950 == null) {
				Class98_Sub18.aFrame3950 = Class54.method503(0, (byte) 105,
						i_26_, i_27_, 0, Class98_Sub43_Sub2.aClass88_5907);
				if (Class98_Sub18.aFrame3950 != null) {
					Class110.anInt946 = i_26_;
					Class112.anInt949 = i_27_;
					Class310.method3618(-5964);
				}
			}
			if ((i ^ 0xffffffff) == -4 && Class98_Sub18.aFrame3950 == null)
				method909(
						((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub27_4052
								.method666((byte) 120), i_24_, true, i_25_, -1,
						-1);
			else {
				java.awt.Container container;
				if (Class98_Sub18.aFrame3950 == null) {
					if (Class284.aFrame2168 == null) {
						if (Class76_Sub11.anApplet3799 != null)
							container = Class76_Sub11.anApplet3799;
						else
							container = Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271;
						Class188.anInt1453 = container.getSize().width;
						Class123_Sub1.anInt4744 = container.getSize().height;
					} else {
						Insets insets = Class284.aFrame2168.getInsets();
						Class188.anInt1453 = (Class284.aFrame2168.getSize().width + (-insets.left + -insets.right));
						Class123_Sub1.anInt4744 = (Class284.aFrame2168
								.getSize().height - (insets.bottom + insets.top));
						container = Class284.aFrame2168;
					}
				} else {
					Class188.anInt1453 = i_26_;
					container = Class98_Sub18.aFrame3950;
					Class123_Sub1.anInt4744 = i_27_;
				}
				if ((i ^ 0xffffffff) != -2)
					Class299.method3513(false);
				else {
					Class191.anInt1479 = 0;
					Class39_Sub1.anInt3593 = Class98_Sub17_Sub1.anInt5782;
					Class98_Sub25.anInt4024 = Class246_Sub2.anInt5072;
					Class98_Sub46_Sub10.anInt6022 = ((Class188.anInt1453 + -Class98_Sub17_Sub1.anInt5782) / 2);
				}
				if (Class43.aClass196_375 != Class64_Sub29.aClass196_3720) {
					if (Class39_Sub1.anInt3593 < 1024
							&& Class98_Sub25.anInt4024 < 768) {
						/* empty */
					}
				}
				if (!bool) {
					Class42_Sub3.aCanvas5361.setSize(Class39_Sub1.anInt3593,
							Class98_Sub25.anInt4024);
					if (za_Sub2.aBoolean6079)
						Class293.method3471(Class42_Sub3.aCanvas5361, 0);
					else
						Class265.aHa1974
								.method1782(Class42_Sub3.aCanvas5361,
										Class39_Sub1.anInt3593,
										Class98_Sub25.anInt4024);
					if (Class284.aFrame2168 != container)
						Class42_Sub3.aCanvas5361.setLocation(
								Class98_Sub46_Sub10.anInt6022,
								Class191.anInt1479);
					else {
						Insets insets = Class284.aFrame2168.getInsets();
						Class42_Sub3.aCanvas5361.setLocation(insets.left
								+ Class98_Sub46_Sub10.anInt6022, insets.top
								+ Class191.anInt1479);
					}
				} else
					Class277.method3292((byte) 107);
				if (i < 2)
					Class134.aBoolean3457 = false;
				else
					Class134.aBoolean3457 = true;
				if ((Class15.anInt185 ^ 0xffffffff) != 0)
					Class40.method359(i_24_ ^ 0x7448, true);
				if (aa_Sub1.aClass123_3561 != null
						&& za_Sub2.method1683(-11297, Class177.anInt1376))
					Class98_Sub17_Sub1.method1158(-2);
				if (i_24_ != -29758)
					anInt6289 = 13;
				for (int i_28_ = 0; i_28_ < 100; i_28_++)
					aa_Sub3.aBooleanArray3574[i_28_] = true;
				Class246_Sub10.aBoolean5152 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hi.B(" + i + ','
					+ i_24_ + ',' + bool + ',' + i_25_ + ',' + i_26_ + ','
					+ i_27_ + ')'));
		}
	}
}
