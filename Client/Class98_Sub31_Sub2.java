/* Class98_Sub31_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

final class Class98_Sub31_Sub2 extends Class98_Sub31 {
	private int[] anIntArray5819;
	private Class377 aClass377_5820;
	private final int[] anIntArray5821;
	static int anInt5822;
	private final Class173 aClass173_5823;
	static int anInt5824;
	private final Class98_Sub16[][] aClass98_Sub16ArrayArray5825;
	private final int[] anIntArray5826;
	private final int anInt5827;
	private final Class98_Sub16[][] aClass98_Sub16ArrayArray5828;
	private final int[] anIntArray5829;
	private int[] anIntArray5830;
	private final int[] anIntArray5831;
	static int[] anIntArray5832 = new int[1];
	private final int[] anIntArray5833;
	private final int[] anIntArray5834;
	private final int[] anIntArray5835;
	private int anInt5836;
	private int[] anIntArray5837;
	static IncomingOpcode aClass58_5838;
	private final int[] anIntArray5839;
	int[] anIntArray5840;
	private final int[] anIntArray5841;
	int[] anIntArray5842;
	int[] anIntArray5843;
	private int[] anIntArray5844;
	private int anInt5845;
	private Class98_Sub31_Sub1 aClass98_Sub31_Sub1_5846;
	private long aLong5847;
	private boolean aBoolean5848;
	private long aLong5849;
	private int anInt5850;
	private Class98_Sub7 aClass98_Sub7_5851;
	private boolean aBoolean5852;
	private int anInt5853;

	private final void method1331(final boolean bool, final int i) {
		try {
			if (!bool) {
				method1335(-1, 0);
			} else {
				method1355(false, -1);
			}
			method1342(0, -1);
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -17; i_0_++) {
				anIntArray5834[i_0_] = anIntArray5830[i_0_];
			}
			for (int i_1_ = i; (i_1_ ^ 0xffffffff) > -17; i_1_++) {
				anIntArray5841[i_1_] = Class202.method2702(-128,
						anIntArray5830[i_1_]);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.QA(" + bool
					+ ',' + i + ')');
		}
	}

	final synchronized void method1332(final boolean bool,
			final Class98_Sub7 class98_sub7, final byte i) {
		do {
			try {
				method1343(class98_sub7, true, bool, i ^ ~0x52);
				if (i == -4) {
					break;
				}
				anIntArray5837 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("jga.Q(" + bool + ','
								+ (class98_sub7 != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public static void method1333(final int i) {
		try {
			anIntArray5832 = null;
			if (i != 0) {
				anInt5822 = -88;
			}
			aClass58_5838 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.E(" + i + ')');
		}
	}

	private final int method1334(final int i, final Class98_Sub16 class98_sub16) {
		try {
			if (anIntArray5844[class98_sub16.anInt3940] == 0) {
				return 0;
			}
			final Class89 class89 = class98_sub16.aClass89_3935;
			int i_2_ = ((anIntArray5831[class98_sub16.anInt3940] * (anIntArray5826[class98_sub16.anInt3940]))
					- -4096 >> -2144255443);
			i_2_ = 16384 + i_2_ * i_2_ >> 1838107727;
			i_2_ = (16384 + class98_sub16.anInt3925 * i_2_ >> 755612303);
			i_2_ = anInt5836 * i_2_ - -128 >> 1177580712;
			i_2_ = 128 + i_2_ * anIntArray5844[(class98_sub16.anInt3940)] >> -273066168;
			if ((class89.anInt707 ^ 0xffffffff) < -1) {
				i_2_ = (int) (0.5 + (Math
						.pow(0.5,
								(class98_sub16.anInt3932 * 1.953125E-5 * (class89.anInt707))) * i_2_));
			}
			if (class89.aByteArray714 != null) {
				final int i_3_ = class98_sub16.anInt3920;
				int i_4_ = (class89.aByteArray714[1 + class98_sub16.anInt3937]);
				if (class89.aByteArray714.length + -2 > class98_sub16.anInt3937) {
					final int i_5_ = 0xff00 & (class89.aByteArray714[(class98_sub16.anInt3937)]) << 814996168;
					final int i_6_ = (((class89.aByteArray714[2 + class98_sub16.anInt3937]) << -603738584) & 0xff00);
					i_4_ += ((class89.aByteArray714[3 + class98_sub16.anInt3937]) - i_4_)
							* (i_3_ - i_5_) / (i_6_ - i_5_);
				}
				i_2_ = i_4_ * i_2_ + 32 >> 559368486;
			}
			if (class98_sub16.anInt3930 > 0 && class89.aByteArray713 != null) {
				final int i_7_ = class98_sub16.anInt3930;
				int i_8_ = (class89.aByteArray713[1 + class98_sub16.anInt3922]);
				if (class98_sub16.anInt3922 < -2 + class89.aByteArray713.length) {
					final int i_9_ = (((class89.aByteArray713[class98_sub16.anInt3922]) << -624556984) & 0xff00);
					final int i_10_ = ((0xff & (class89.aByteArray713[2 + (class98_sub16.anInt3922)])) << -1122491128);
					i_8_ += ((-i_9_ + i_7_)
							* (-i_8_ + (class89.aByteArray713[(class98_sub16.anInt3922 - -3)])) / (i_10_ + -i_9_));
				}
				i_2_ = 32 + i_8_ * i_2_ >> 139934694;
			}
			if (i != 255) {
				return -41;
			}
			return i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.DA(" + i
					+ ',' + (class98_sub16 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1335(final int i, final int i_11_) {
		try {
			if (i_11_ != 0) {
				method1359((byte) -87, -124L);
			}
			for (Class98_Sub16 class98_sub16 = ((Class98_Sub16) aClass98_Sub31_Sub1_5846.aClass148_5817
					.method2418(32)); class98_sub16 != null; class98_sub16 = ((Class98_Sub16) aClass98_Sub31_Sub1_5846.aClass148_5817
					.method2417(104))) {
				if ((i < 0 || class98_sub16.anInt3940 == i)
						&& class98_sub16.anInt3930 < 0) {
					aClass98_Sub16ArrayArray5825[class98_sub16.anInt3940][class98_sub16.anInt3936] = null;
					class98_sub16.anInt3930 = 0;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.I(" + i + ','
					+ i_11_ + ')');
		}
	}

	static final void method1336(final byte i) {
		try {
			synchronized (Class315.aClient3529) {
				if (Class98_Sub18.aFrame3950 != null) {
					/* empty */
				} else {
					java.awt.Container container;
					if (Class284.aFrame2168 == null) {
						if (Class76_Sub11.anApplet3799 != null) {
							container = Class76_Sub11.anApplet3799;
						} else {
							container = Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271;
						}
					} else {
						container = Class284.aFrame2168;
					}
					Class188.anInt1453 = container.getSize().width;
					Class123_Sub1.anInt4744 = container.getSize().height;
					if (Class284.aFrame2168 == container) {
						final Insets insets = Class284.aFrame2168.getInsets();
						Class123_Sub1.anInt4744 -= insets.bottom + insets.top;
						Class188.anInt1453 -= insets.left - -insets.right;
					}
					if (Class146_Sub2.method2391((byte) 118) == 1) {
						Class191.anInt1479 = 0;
						Class39_Sub1.anInt3593 = Class98_Sub17_Sub1.anInt5782;
						Class98_Sub25.anInt4024 = Class246_Sub2.anInt5072;
						Class98_Sub46_Sub10.anInt6022 = (Class188.anInt1453 + -Class98_Sub17_Sub1.anInt5782) / 2;
					} else {
						Class299.method3513(false);
					}
					if (Class43.aClass196_375 != Class64_Sub29.aClass196_3720) {
						if ((Class39_Sub1.anInt3593 ^ 0xffffffff) > -1025
								&& Class98_Sub25.anInt4024 < 768) {
							/* empty */
						}
					}
					Class42_Sub3.aCanvas5361.setSize(Class39_Sub1.anInt3593,
							Class98_Sub25.anInt4024);
					if (Class265.aHa1974 != null) {
						if (!za_Sub2.aBoolean6079) {
							Class265.aHa1974.method1782(
									(Class42_Sub3.aCanvas5361),
									Class39_Sub1.anInt3593,
									(Class98_Sub25.anInt4024));
						} else {
							Class293.method3471(Class42_Sub3.aCanvas5361, 0);
						}
					}
					if (i > -41) {
						method1333(94);
					}
					if (container == Class284.aFrame2168) {
						final Insets insets = Class284.aFrame2168.getInsets();
						Class42_Sub3.aCanvas5361.setLocation(insets.left
								+ Class98_Sub46_Sub10.anInt6022,
								Class191.anInt1479 + insets.top);
					} else {
						Class42_Sub3.aCanvas5361.setLocation(
								Class98_Sub46_Sub10.anInt6022,
								Class191.anInt1479);
					}
					if ((Class15.anInt185 ^ 0xffffffff) != 0) {
						Class40.method359(-1, true);
					}
					Class263.method3216(14059);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.J(" + i + ')');
		}
	}

	private final void method1337(final int i, final byte i_12_) {
		try {
			int i_14_ = 0xf0 & i;
			if (i_14_ == 128) {
				final int i_15_ = i & 0xf;
				final int i_16_ = 0x7f & i >> 374811400;
				final int i_17_ = (0x7f5ce4 & i) >> 907280592;
				method1353(i_16_, i_15_, i_17_, 42);
			} else if (i_14_ == 144) {
				final int i_18_ = i & 0xf;
				final int i_19_ = i >> 1952651336 & 0x7f;
				final int i_20_ = i >> 1968912016 & 0x7f;
				if ((i_20_ ^ 0xffffffff) >= -1) {
					method1353(i_19_, i_18_, 64, 19);
				} else {
					method1346(98, i_19_, i_20_, i_18_);
				}
			} else if ((i_14_ ^ 0xffffffff) == -161) {
				final int i_21_ = 0xf & i;
				final int i_22_ = i >> 1959226056 & 0x7f;
				final int i_23_ = (0x7f67e2 & i) >> -805171600;
				method1338(i_22_, i_21_, true, i_23_);
			} else if ((i_14_ ^ 0xffffffff) == -177) {
				final int i_24_ = 0xf & i;
				final int i_25_ = (0x7f65 & i) >> -1760183224;
				final int i_26_ = 0x7f & i >> -428057136;
				if ((i_25_ ^ 0xffffffff) == -1) {
					anIntArray5841[i_24_] = ((i_26_ << -243849874) + Class202
							.method2702(anIntArray5841[i_24_], -2080769));
				}
				if ((i_25_ ^ 0xffffffff) == -33) {
					anIntArray5841[i_24_] = ((i_26_ << 1679403687) + Class202
							.method2702(anIntArray5841[i_24_], -16257));
				}
				if ((i_25_ ^ 0xffffffff) == -2) {
					anIntArray5821[i_24_] = (Class202.method2702(
							anIntArray5821[i_24_], -16257) - -(i_26_ << 231051687));
				}
				if (i_25_ == 33) {
					anIntArray5821[i_24_] = i_26_
							+ Class202.method2702(anIntArray5821[i_24_], -128);
				}
				if (i_25_ == 5) {
					anIntArray5835[i_24_] = ((i_26_ << -324226233) + Class202
							.method2702(-16257, anIntArray5835[i_24_]));
				}
				if ((i_25_ ^ 0xffffffff) == -38) {
					anIntArray5835[i_24_] = (Class202.method2702(-128,
							anIntArray5835[i_24_]) - -i_26_);
				}
				if (i_25_ == 7) {
					anIntArray5831[i_24_] = (Class202.method2702(-16257,
							anIntArray5831[i_24_]) + (i_26_ << 1142330119));
				}
				if (i_25_ == 39) {
					anIntArray5831[i_24_] = (Class202.method2702(
							anIntArray5831[i_24_], -128) + i_26_);
				}
				if (i_25_ == 10) {
					anIntArray5839[i_24_] = (Class202.method2702(
							anIntArray5839[i_24_], -16257) - -(i_26_ << 1026620103));
				}
				if ((i_25_ ^ 0xffffffff) == -43) {
					anIntArray5839[i_24_] = (Class202.method2702(-128,
							anIntArray5839[i_24_]) + i_26_);
				}
				if (i_25_ == 11) {
					anIntArray5826[i_24_] = (Class202.method2702(
							anIntArray5826[i_24_], -16257) + (i_26_ << -1493630745));
				}
				if ((i_25_ ^ 0xffffffff) == -44) {
					anIntArray5826[i_24_] = (Class202.method2702(-128,
							anIntArray5826[i_24_]) + i_26_);
				}
				if (i_25_ == 64) {
					if ((i_26_ ^ 0xffffffff) > -65) {
						anIntArray5840[i_24_] = Class202.method2702(
								(anIntArray5840[i_24_]), -2);
					} else {
						anIntArray5840[i_24_] = Class41.method366(
								(anIntArray5840[i_24_]), 1);
					}
				}
				if ((i_25_ ^ 0xffffffff) == -66) {
					if (i_26_ < 64) {
						method1369(i_24_, -114);
						anIntArray5840[i_24_] = Class202.method2702(
								(anIntArray5840[i_24_]), -3);
					} else {
						anIntArray5840[i_24_] = Class41.method366(
								(anIntArray5840[i_24_]), 2);
					}
				}
				if ((i_25_ ^ 0xffffffff) == -100) {
					anIntArray5829[i_24_] = (Class202.method2702(
							anIntArray5829[i_24_], 127) - -(i_26_ << -107977913));
				}
				if (i_25_ == 98) {
					anIntArray5829[i_24_] = i_26_
							+ Class202.method2702(anIntArray5829[i_24_], 16256);
				}
				if ((i_25_ ^ 0xffffffff) == -102) {
					anIntArray5829[i_24_] = (Class202.method2702(
							anIntArray5829[i_24_], 127) + (16384 + (i_26_ << -1693120281)));
				}
				if ((i_25_ ^ 0xffffffff) == -101) {
					anIntArray5829[i_24_] = (i_26_
							+ Class202.method2702(16256, anIntArray5829[i_24_]) + 16384);
				}
				if ((i_25_ ^ 0xffffffff) == -121) {
					method1355(false, i_24_);
				}
				if ((i_25_ ^ 0xffffffff) == -122) {
					method1342(0, i_24_);
				}
				if ((i_25_ ^ 0xffffffff) == -124) {
					method1335(i_24_, 0);
				}
				if (i_25_ == 6) {
					final int i_27_ = anIntArray5829[i_24_];
					if ((i_27_ ^ 0xffffffff) == -16385) {
						anIntArray5819[i_24_] = (Class202.method2702(-16257,
								anIntArray5819[i_24_]) + (i_26_ << 1255328263));
					}
				}
				if (i_25_ == 38) {
					final int i_28_ = anIntArray5829[i_24_];
					if ((i_28_ ^ 0xffffffff) == -16385) {
						anIntArray5819[i_24_] = (Class202.method2702(-128,
								anIntArray5819[i_24_]) + i_26_);
					}
				}
				if (i_25_ == 16) {
					anIntArray5842[i_24_] = (Class202.method2702(
							(anIntArray5842[i_24_]), -16257) - -(i_26_ << -1160099449));
				}
				if ((i_25_ ^ 0xffffffff) == -49) {
					anIntArray5842[i_24_] = (i_26_ + Class202.method2702(
							(anIntArray5842[i_24_]), -128));
				}
				if (i_25_ == 81) {
					if ((i_26_ ^ 0xffffffff) <= -65) {
						anIntArray5840[i_24_] = Class41.method366(
								(anIntArray5840[i_24_]), 4);
					} else {
						method1368(103, i_24_);
						anIntArray5840[i_24_] = Class202.method2702(
								(anIntArray5840[i_24_]), -5);
					}
				}
				if ((i_25_ ^ 0xffffffff) == -18) {
					method1348(
							103,
							i_24_,
							((~0x3f80 & anIntArray5837[i_24_]) - -(i_26_ << -1302433305)));
				}
				if ((i_25_ ^ 0xffffffff) == -50) {
					method1348(111, i_24_, (~0x7f & anIntArray5837[i_24_])
							+ i_26_);
				}
			} else if ((i_14_ ^ 0xffffffff) == -193) {
				final int i_29_ = i & 0xf;
				final int i_30_ = (i & 0x7fc6) >> -889995320;
				method1347((byte) -128, anIntArray5841[i_29_] + i_30_, i_29_);
			} else if (i_14_ == 208) {
				final int i_31_ = i & 0xf;
				final int i_32_ = i >> -966108184 & 0x7f;
				method1365(i_32_, i_31_, 15);
			} else if (i_14_ == 224) {
				final int i_33_ = i & 0xf;
				final int i_34_ = (((i & 0x7f94) >> -1491268920) + ((i & 0x7f0001) >> 1964066633));
				method1362(i_33_, 1, i_34_);
			} else {
				i_14_ = i & 0xff;
				if (i_14_ == 255) {
					method1331(true, 0);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.P(" + i + ','
					+ i_12_ + ')');
		}
	}

	private final void method1338(final int i, final int i_35_,
			final boolean bool, final int i_36_) {
		try {
			if (bool != true) {
				anIntArray5819 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.C(" + i + ','
					+ i_35_ + ',' + bool + ',' + i_36_ + ')'));
		}
	}

	static final int method1339(final int i, final int i_37_) {
		try {
			if (i == 6407 || (i ^ 0xffffffff) == -34844 || i == 34837) {
				return 6407;
			}
			if ((i ^ 0xffffffff) == -6409 || (i ^ 0xffffffff) == -34843
					|| (i ^ 0xffffffff) == -34837) {
				return 6408;
			}
			if (i == 6406 || (i ^ 0xffffffff) == -34845) {
				return 6406;
			}
			if (i == 6409 || (i ^ 0xffffffff) == -34847) {
				return 6409;
			}
			if ((i ^ 0xffffffff) == -6411 || (i ^ 0xffffffff) == -34848) {
				return 6410;
			}
			if (i_37_ < 123) {
				method1333(-1);
			}
			if (i == 6402) {
				return 6402;
			}
			throw new IllegalArgumentException("");
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.FB(" + i + ','
					+ i_37_ + ')');
		}
	}

	final boolean method1340(final int i, final int[] is, final int i_38_,
			final int i_39_, final Class98_Sub16 class98_sub16) {
		try {
			class98_sub16.anInt3923 = Class64_Sub15.anInt3678 / 100;
			if (class98_sub16.anInt3930 >= 0
					&& ((class98_sub16.aClass98_Sub31_Sub5_3939 == null) || class98_sub16.aClass98_Sub31_Sub5_3939
							.method1401())) {
				class98_sub16.method1148(-1);
				class98_sub16.method942(53);
				if (class98_sub16.anInt3931 > 0
						&& ((aClass98_Sub16ArrayArray5828[class98_sub16.anInt3940][class98_sub16.anInt3931]) == class98_sub16)) {
					aClass98_Sub16ArrayArray5828[class98_sub16.anInt3940][class98_sub16.anInt3931] = null;
				}
				return true;
			}
			int i_40_ = class98_sub16.anInt3929;
			if (i_40_ > 0) {
				i_40_ -= (int) (0.5 + (Math
						.pow(2.0,
								(4.921259842519685E-4 * (anIntArray5835[(class98_sub16.anInt3940)]))) * 16.0));
				if (i_40_ < 0) {
					i_40_ = 0;
				}
				class98_sub16.anInt3929 = i_40_;
			}
			class98_sub16.aClass98_Sub31_Sub5_3939.method1407(method1350(i_38_,
					class98_sub16));
			final Class89 class89 = class98_sub16.aClass89_3935;
			class98_sub16.anInt3921++;
			boolean bool = false;
			class98_sub16.anInt3941 += class89.anInt710;
			final double d = (((-60 + class98_sub16.anInt3936 << -498361240) + ((class98_sub16.anInt3938 * class98_sub16.anInt3929) >> -147636500)) * 5.086263020833333E-6);
			if (class89.anInt707 > 0) {
				if ((class89.anInt712 ^ 0xffffffff) >= -1) {
					class98_sub16.anInt3932 += 128;
				} else {
					class98_sub16.anInt3932 += (int) (0.5 + (128.0 * Math.pow(
							2.0, (class89.anInt712) * d)));
				}
				if ((class89.anInt707 * class98_sub16.anInt3932) >= 819200) {
					bool = true;
				}
			}
			if (class89.aByteArray714 != null) {
				if ((class89.anInt711 ^ 0xffffffff) >= -1) {
					class98_sub16.anInt3920 += 128;
				} else {
					class98_sub16.anInt3920 += (int) (0.5 + (Math.pow(2.0, d
							* (class89.anInt711)) * 128.0));
				}
				for (/**/; (((class89.aByteArray714.length + -2 ^ 0xffffffff) < (class98_sub16.anInt3937 ^ 0xffffffff)) && (class98_sub16.anInt3920 > (0xff & (class89.aByteArray714[2 + (class98_sub16.anInt3937)])) << 2116910312)); class98_sub16.anInt3937 += 2) {
					/* empty */
				}
				if (((class98_sub16.anInt3937 ^ 0xffffffff) == (-2
						+ class89.aByteArray714.length ^ 0xffffffff))
						&& ((class89.aByteArray714[1 + class98_sub16.anInt3937]) ^ 0xffffffff) == -1) {
					bool = true;
				}
			}
			if ((class98_sub16.anInt3930 ^ 0xffffffff) <= -1
					&& class89.aByteArray713 != null
					&& (0x1 & (anIntArray5840[class98_sub16.anInt3940]) ^ 0xffffffff) == -1
					&& (class98_sub16.anInt3931 < 0 || (class98_sub16 != (aClass98_Sub16ArrayArray5828[class98_sub16.anInt3940][class98_sub16.anInt3931])))) {
				if ((class89.anInt715 ^ 0xffffffff) >= -1) {
					class98_sub16.anInt3930 += 128;
				} else {
					class98_sub16.anInt3930 += (int) ((128.0 * Math.pow(2.0, d
							* (class89.anInt715))) + 0.5);
				}
				for (/**/; (((-2 + class89.aByteArray713.length ^ 0xffffffff) < (class98_sub16.anInt3922 ^ 0xffffffff)) && (((0xff & (class89.aByteArray713[2 + (class98_sub16.anInt3922)])) << -865703064 ^ 0xffffffff) > (class98_sub16.anInt3930 ^ 0xffffffff))); class98_sub16.anInt3922 += 2) {
					/* empty */
				}
				if ((class89.aByteArray713.length - 2 ^ 0xffffffff) == (class98_sub16.anInt3922 ^ 0xffffffff)) {
					bool = true;
				}
			}
			if (bool) {
				class98_sub16.aClass98_Sub31_Sub5_3939
						.method1423(class98_sub16.anInt3923);
				if (is != null) {
					class98_sub16.aClass98_Sub31_Sub5_3939.method1325(is,
							i_39_, i);
				} else {
					class98_sub16.aClass98_Sub31_Sub5_3939.method1321(i);
				}
				if (class98_sub16.aClass98_Sub31_Sub5_3939.method1425()) {
					aClass98_Sub31_Sub1_5846.aClass98_Sub31_Sub3_5818
							.method1371(class98_sub16.aClass98_Sub31_Sub5_3939);
				}
				class98_sub16.method1148(i_38_ ^ ~0x2);
				if (class98_sub16.anInt3930 >= 0) {
					class98_sub16.method942(107);
					if (class98_sub16.anInt3931 > 0
							&& (class98_sub16 == (aClass98_Sub16ArrayArray5828[class98_sub16.anInt3940][class98_sub16.anInt3931]))) {
						aClass98_Sub16ArrayArray5828[class98_sub16.anInt3940][class98_sub16.anInt3931] = null;
					}
				}
				return true;
			}
			class98_sub16.aClass98_Sub31_Sub5_3939.method1412(
					class98_sub16.anInt3923, method1334(255, class98_sub16),
					method1351(class98_sub16, i_38_ + -114));
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("jga.O(" + i + ','
							+ (is != null ? "{...}" : "null") + ',' + i_38_
							+ ',' + i_39_ + ','
							+ (class98_sub16 != null ? "{...}" : "null") + ')'));
		}
	}

	final synchronized void method1341(final boolean bool,
			final boolean bool_41_, final Class98_Sub7 class98_sub7,
			final long l, final int i) {
		do {
			try {
				method1343(class98_sub7, bool, bool_41_, 113);
				method1359((byte) -117, aClass173_5823.anInt1340 * l);
				if (i == -3) {
					break;
				}
				anIntArray5844 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jga.AB("
						+ bool + ',' + bool_41_ + ','
						+ (class98_sub7 != null ? "{...}" : "null") + ',' + l
						+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	private final void method1342(final int i, int i_42_) {
		try {
			if ((i_42_ ^ 0xffffffff) > -1) {
				for (i_42_ = 0; i_42_ < 16; i_42_++) {
					method1342(i, i_42_);
				}
			} else {
				anIntArray5831[i_42_] = 12800;
				anIntArray5839[i_42_] = 8192;
				anIntArray5826[i_42_] = 16383;
				anIntArray5833[i_42_] = 8192;
				anIntArray5821[i_42_] = i;
				anIntArray5835[i_42_] = 8192;
				method1369(i_42_, i ^ 0x12);
				method1368(98, i_42_);
				anIntArray5840[i_42_] = 0;
				anIntArray5829[i_42_] = 32767;
				anIntArray5819[i_42_] = 256;
				anIntArray5842[i_42_] = 0;
				method1348(71, i_42_, 8192);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.EA(" + i + ','
					+ i_42_ + ')');
		}
	}

	private final synchronized void method1343(final Class98_Sub7 class98_sub7,
			final boolean bool, final boolean bool_43_, final int i) {
		try {
			if (i < 76) {
				method1346(-76, 125, -76, 76);
			}
			method1344(95, bool);
			aClass173_5823.method2557(class98_sub7.aByteArray3850);
			aBoolean5848 = bool_43_;
			aLong5847 = 0L;
			final int i_44_ = aClass173_5823.method2558();
			for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
				aClass173_5823.method2555(i_45_);
				aClass173_5823.method2556(i_45_);
				aClass173_5823.method2552(i_45_);
			}
			anInt5845 = aClass173_5823.method2551();
			anInt5850 = aClass173_5823.anIntArray1343[anInt5845];
			aLong5849 = aClass173_5823.method2547(anInt5850);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.IA("
					+ (class98_sub7 != null ? "{...}" : "null") + ',' + bool
					+ ',' + bool_43_ + ',' + i + ')'));
		}
	}

	private final synchronized void method1344(final int i, final boolean bool) {
		try {
			aClass173_5823.method2545();
			aClass98_Sub7_5851 = null;
			method1331(bool, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.F(" + i + ','
					+ bool + ')');
		}
	}

	final boolean method1345(final int i, final Class98_Sub16 class98_sub16) {
		try {
			if (i != 1816) {
				aClass377_5820 = null;
			}
			if (class98_sub16.aClass98_Sub31_Sub5_3939 == null) {
				if (class98_sub16.anInt3930 >= 0) {
					class98_sub16.method942(47);
					if ((class98_sub16.anInt3931 ^ 0xffffffff) < -1
							&& (class98_sub16 == (aClass98_Sub16ArrayArray5828[class98_sub16.anInt3940][class98_sub16.anInt3931]))) {
						aClass98_Sub16ArrayArray5828[class98_sub16.anInt3940][class98_sub16.anInt3931] = null;
					}
				}
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.OA(" + i
					+ ',' + (class98_sub16 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1346(final int i, final int i_47_,
			final int i_48_, final int i_49_) {
		try {
			method1353(i_47_, i_49_, 64, 104);
			if ((0x2 & anIntArray5840[i_49_] ^ 0xffffffff) != -1) {
				for (Class98_Sub16 class98_sub16 = ((Class98_Sub16) aClass98_Sub31_Sub1_5846.aClass148_5817
						.method2427(-125)); class98_sub16 != null; class98_sub16 = ((Class98_Sub16) aClass98_Sub31_Sub1_5846.aClass148_5817
						.method2416((byte) 5))) {
					if (((i_49_ ^ 0xffffffff) == (class98_sub16.anInt3940 ^ 0xffffffff))
							&& class98_sub16.anInt3930 < 0) {
						aClass98_Sub16ArrayArray5825[i_49_][class98_sub16.anInt3936] = null;
						aClass98_Sub16ArrayArray5825[i_49_][i_47_] = class98_sub16;
						final int i_50_ = (class98_sub16.anInt3926 + ((class98_sub16.anInt3938 * class98_sub16.anInt3929) >> 805761964));
						class98_sub16.anInt3926 += i_47_
								+ -(class98_sub16.anInt3936) << 308353096;
						class98_sub16.anInt3938 = (-class98_sub16.anInt3926 + i_50_);
						class98_sub16.anInt3936 = i_47_;
						class98_sub16.anInt3929 = 4096;
						return;
					}
				}
			}
			final Class98_Sub44 class98_sub44 = ((Class98_Sub44) aClass377_5820
					.method3990(anIntArray5834[i_49_], -1));
			if (class98_sub44 != null) {
				final Class98_Sub24_Sub1 class98_sub24_sub1 = (class98_sub44.aClass98_Sub24_Sub1Array4244[i_47_]);
				if (class98_sub24_sub1 != null) {
					final Class98_Sub16 class98_sub16 = new Class98_Sub16();
					class98_sub16.aClass98_Sub24_Sub1_3934 = class98_sub24_sub1;
					class98_sub16.anInt3940 = i_49_;
					class98_sub16.aClass98_Sub44_3918 = class98_sub44;
					class98_sub16.aClass89_3935 = (class98_sub44.aClass89Array4251[i_47_]);
					class98_sub16.anInt3931 = (class98_sub44.aByteArray4250[i_47_]);
					class98_sub16.anInt3936 = i_47_;
					class98_sub16.anInt3925 = (1024 + (class98_sub44.anInt4249
							* i_48_ * (i_48_ * (class98_sub44.aByteArray4252[i_47_]))) >> 622064875);
					class98_sub16.anInt3924 = (class98_sub44.aByteArray4247[i_47_]) & 0xff;
					class98_sub16.anInt3926 = ((i_47_ << 1695782120) + -(0x7fff & (class98_sub44.aShortArray4248[i_47_])));
					class98_sub16.anInt3932 = 0;
					class98_sub16.anInt3937 = 0;
					class98_sub16.anInt3920 = 0;
					class98_sub16.anInt3922 = 0;
					class98_sub16.anInt3930 = -1;
					if (anIntArray5842[i_49_] == 0) {
						class98_sub16.aClass98_Sub31_Sub5_3939 = (Class98_Sub31_Sub5
								.method1402(class98_sub24_sub1,
										method1350(2, class98_sub16),
										method1334(255, class98_sub16),
										method1351(class98_sub16, 20)));
					} else {
						class98_sub16.aClass98_Sub31_Sub5_3939 = (Class98_Sub31_Sub5
								.method1402(class98_sub24_sub1,
										method1350(2, class98_sub16), 0,
										method1351(class98_sub16, -103)));
						method1361(1,
								(class98_sub44.aShortArray4248[i_47_]) < 0,
								class98_sub16);
					}
					if ((class98_sub44.aShortArray4248[i_47_] ^ 0xffffffff) > -1) {
						class98_sub16.aClass98_Sub31_Sub5_3939.method1422(-1);
					}
					if (class98_sub16.anInt3931 >= 0) {
						final Class98_Sub16 class98_sub16_52_ = (aClass98_Sub16ArrayArray5828[i_49_][class98_sub16.anInt3931]);
						if (class98_sub16_52_ != null
								&& (class98_sub16_52_.anInt3930 ^ 0xffffffff) > -1) {
							aClass98_Sub16ArrayArray5825[i_49_][class98_sub16_52_.anInt3936] = null;
							class98_sub16_52_.anInt3930 = 0;
						}
						aClass98_Sub16ArrayArray5828[i_49_][class98_sub16.anInt3931] = class98_sub16;
					}
					aClass98_Sub31_Sub1_5846.aClass148_5817.method2419(
							class98_sub16, -20911);
					aClass98_Sub16ArrayArray5825[i_49_][i_47_] = class98_sub16;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.JA(" + i
					+ ',' + i_47_ + ',' + i_48_ + ',' + i_49_ + ')'));
		}
	}

	private final void method1347(final byte i, final int i_53_, final int i_54_) {
		do {
			try {
				if (i >= -127) {
					aBoolean5852 = true;
				}
				if (anIntArray5834[i_54_] == i_53_) {
					break;
				}
				anIntArray5834[i_54_] = i_53_;
				for (int i_55_ = 0; i_55_ < 128; i_55_++) {
					aClass98_Sub16ArrayArray5828[i_54_][i_55_] = null;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jga.R(" + i
						+ ',' + i_53_ + ',' + i_54_ + ')'));
			}
			break;
		} while (false);
	}

	private final void method1348(final int i, final int i_56_, final int i_57_) {
		try {
			if (i >= 40) {
				anIntArray5837[i_56_] = i_57_;
				anIntArray5843[i_56_] = (int) (0.5 + (Math.pow(2.0,
						5.4931640625E-4 * i_57_) * 2097152.0));
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.FA(" + i
					+ ',' + i_56_ + ',' + i_57_ + ')'));
		}
	}

	final synchronized void method1349(final int i) {
		try {
			if (i == -1) {
				for (Class98_Sub44 class98_sub44 = (Class98_Sub44) aClass377_5820
						.method3998(i + 96); class98_sub44 != null; class98_sub44 = (Class98_Sub44) aClass377_5820
						.method3995(-1)) {
					class98_sub44.method942(i + 52);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, "jga.HA(" + i + ')');
		}
	}

	private final int method1350(final int i, final Class98_Sub16 class98_sub16) {
		try {
			int i_58_ = (((class98_sub16.anInt3938 * class98_sub16.anInt3929) >> 94082348) + class98_sub16.anInt3926);
			i_58_ += ((-8192 + (anIntArray5833[class98_sub16.anInt3940])) * anIntArray5819[(class98_sub16.anInt3940)]) >> -1798455636;
			final Class89 class89 = class98_sub16.aClass89_3935;
			if ((class89.anInt710 ^ 0xffffffff) < -1
					&& (class89.anInt708 > 0 || ((anIntArray5821[class98_sub16.anInt3940]) ^ 0xffffffff) < -1)) {
				int i_59_ = class89.anInt708 << 789514338;
				final int i_60_ = class89.anInt717 << 1268741473;
				if ((class98_sub16.anInt3921 ^ 0xffffffff) > (i_60_ ^ 0xffffffff)) {
					i_59_ = (class98_sub16.anInt3921 * i_59_ / i_60_);
				}
				i_59_ += anIntArray5821[(class98_sub16.anInt3940)] >> 677293351;
				final double d = Math
						.sin(0.01227184630308513 * (0x1ff & (class98_sub16.anInt3941)));
				i_58_ += (int) (i_59_ * d);
			}
			final int i_61_ = (int) (((class98_sub16.aClass98_Sub24_Sub1_3934).anInt5795
					* 256 * Math.pow(i, 3.255208333333333E-4 * i_58_) / Class64_Sub15.anInt3678) + 0.5);
			if ((i_61_ ^ 0xffffffff) <= -2) {
				return i_61_;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.LA(" + i
					+ ',' + (class98_sub16 != null ? "{...}" : "null") + ')'));
		}
	}

	private final int method1351(final Class98_Sub16 class98_sub16, final int i) {
		try {
			final int i_63_ = anIntArray5839[class98_sub16.anInt3940];
			if (i_63_ < 8192) {
				return (class98_sub16.anInt3924 * i_63_ - -32 >> 1741690950);
			}
			return (16384 - (32 + ((128 + -class98_sub16.anInt3924) * (16384 + -i_63_)) >> -526683354));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("jga.BB(" + (class98_sub16 != null ? "{...}" : "null")
							+ ',' + i + ')'));
		}
	}

	final synchronized boolean method1352(final Class98_Sub7 class98_sub7,
			final int i, final Class308 class308, final Class207 class207,
			final boolean bool) {
		try {
			class98_sub7.method984();
			boolean bool_64_ = true;
			int[] is = null;
			if ((i ^ 0xffffffff) < -1) {
				is = new int[] { i };
			}
			if (bool != false) {
				return false;
			}
			for (Class98_Sub14 class98_sub14 = (Class98_Sub14) class98_sub7.aClass377_3849
					.method3998(117); class98_sub14 != null; class98_sub14 = (Class98_Sub14) class98_sub7.aClass377_3849
					.method3995(-1)) {
				final int i_65_ = (int) ((Class98) class98_sub14).aLong832;
				Class98_Sub44 class98_sub44 = ((Class98_Sub44) aClass377_5820
						.method3990(i_65_, -1));
				if (class98_sub44 == null) {
					class98_sub44 = Class355.method3875(i_65_, class207, -118);
					if (class98_sub44 == null) {
						bool_64_ = false;
						continue;
					}
					aClass377_5820.method3996(class98_sub44, i_65_, -1);
				}
				if (!class98_sub44.method1517((class98_sub14.aByteArray3914),
						class308, (byte) -121, is)) {
					bool_64_ = false;
				}
			}
			if (bool_64_) {
				class98_sub7.method983();
			}
			return bool_64_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("jga.PA("
							+ (class98_sub7 != null ? "{...}" : "null") + ','
							+ i + ',' + (class308 != null ? "{...}" : "null")
							+ ',' + (class207 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	private final void method1353(final int i, final int i_66_,
			final int i_67_, final int i_68_) {
		try {
			if (i_68_ <= 5) {
				aLong5847 = -45L;
			}
			final Class98_Sub16 class98_sub16 = aClass98_Sub16ArrayArray5825[i_66_][i];
			if (class98_sub16 != null) {
				aClass98_Sub16ArrayArray5825[i_66_][i] = null;
				if ((0x2 & anIntArray5840[i_66_] ^ 0xffffffff) == -1) {
					class98_sub16.anInt3930 = 0;
				} else {
					for (Class98_Sub16 class98_sub16_69_ = ((Class98_Sub16) aClass98_Sub31_Sub1_5846.aClass148_5817
							.method2418(32)); class98_sub16_69_ != null; class98_sub16_69_ = ((Class98_Sub16) aClass98_Sub31_Sub1_5846.aClass148_5817
							.method2417(97))) {
						if (((class98_sub16_69_.anInt3940 ^ 0xffffffff) == (class98_sub16.anInt3940 ^ 0xffffffff))
								&& (class98_sub16_69_.anInt3930 < 0)
								&& class98_sub16 != class98_sub16_69_) {
							class98_sub16.anInt3930 = 0;
							break;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.NA(" + i
					+ ',' + i_66_ + ',' + i_67_ + ',' + i_68_ + ')'));
		}
	}

	@Override
	final synchronized void method1321(int i) {
		try {
			if (aClass173_5823.method2546()) {
				final int i_70_ = (anInt5827 * aClass173_5823.anInt1340 / Class64_Sub15.anInt3678);
				do {
					final long l = aLong5847 - -((long) i_70_ * (long) i);
					if (aLong5849 - l >= 0L) {
						aLong5847 = l;
						break;
					}
					final int i_71_ = (int) ((-1L + i_70_ + (-aLong5847 + aLong5849)) / i_70_);
					aLong5847 += (long) i_70_ * (long) i_71_;
					i -= i_71_;
					aClass98_Sub31_Sub1_5846.method1321(i_71_);
					method1370(121);
				} while (aClass173_5823.method2546());
			}
			aClass98_Sub31_Sub1_5846.method1321(i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.M(" + i + ')');
		}
	}

	final synchronized boolean method1354(final int i) {
		try {
			if (i != -3619) {
				method1356(17, 42, false);
			}
			return aClass173_5823.method2546();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, "jga.TA(" + i + ')');
		}
	}

	private final void method1355(final boolean bool, final int i) {
		do {
			try {
				for (Class98_Sub16 class98_sub16 = ((Class98_Sub16) aClass98_Sub31_Sub1_5846.aClass148_5817
						.method2418(32)); class98_sub16 != null; class98_sub16 = ((Class98_Sub16) aClass98_Sub31_Sub1_5846.aClass148_5817
						.method2417(102))) {
					if ((i ^ 0xffffffff) > -1 || class98_sub16.anInt3940 == i) {
						if ((class98_sub16.aClass98_Sub31_Sub5_3939) != null) {
							class98_sub16.aClass98_Sub31_Sub5_3939
									.method1423(Class64_Sub15.anInt3678 / 100);
							if (class98_sub16.aClass98_Sub31_Sub5_3939
									.method1425()) {
								aClass98_Sub31_Sub1_5846.aClass98_Sub31_Sub3_5818
										.method1371(class98_sub16.aClass98_Sub31_Sub5_3939);
							}
							class98_sub16.method1148(-1);
						}
						if ((class98_sub16.anInt3930 ^ 0xffffffff) > -1) {
							aClass98_Sub16ArrayArray5825[class98_sub16.anInt3940][class98_sub16.anInt3936] = null;
						}
						class98_sub16.method942(115);
					}
				}
				if (bool == false) {
					break;
				}
				method1348(-2, -56, -43);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jga.GA("
						+ bool + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final synchronized Class98_Sub31 method1327() {
		try {
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.D(" + ')');
		}
	}

	private final void method1356(final int i, final int i_72_,
			final boolean bool) {
		try {
			anIntArray5830[i] = i_72_;
			anIntArray5841[i] = Class202.method2702(i_72_, -128);
			if (bool != false) {
				aClass98_Sub31_Sub1_5846 = null;
			}
			method1347((byte) -128, i_72_, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.H(" + i + ','
					+ i_72_ + ',' + bool + ')'));
		}
	}

	final synchronized void method1357(final int i, final int i_73_,
			final int i_74_) {
		do {
			try {
				method1356(i_74_, i_73_, false);
				if (i == 26377) {
					break;
				}
				method1337(102, (byte) 85);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jga.UA(" + i
						+ ',' + i_73_ + ',' + i_74_ + ')'));
			}
			break;
		} while (false);
	}

	final synchronized void method1358(final byte i) {
		try {
			if (i != 23) {
				anIntArray5842 = null;
			}
			for (Class98_Sub44 class98_sub44 = (Class98_Sub44) aClass377_5820
					.method3998(123); class98_sub44 != null; class98_sub44 = (Class98_Sub44) aClass377_5820
					.method3995(-1)) {
				class98_sub44.method1513(true);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, "jga.MA(" + i + ')');
		}
	}

	private final void method1359(final byte i, final long l) {
		try {
			while (l >= aLong5849) {
				int i_75_ = anInt5845;
				int i_76_ = anInt5850;
				long l_77_ = aLong5849;
				while (anInt5850 == i_76_) {
					while ((i_76_ ^ 0xffffffff) == ((aClass173_5823.anIntArray1343[i_75_]) ^ 0xffffffff)) {
						aClass173_5823.method2555(i_75_);
						final int i_78_ = aClass173_5823.method2559(i_75_);
						if (i_78_ == 1) {
							aClass173_5823.method2553();
							aClass173_5823.method2552(i_75_);
							if (aClass173_5823.method2550()) {
								if (aBoolean5848 && (i_76_ ^ 0xffffffff) != -1) {
									aClass173_5823.method2548(l_77_);
								} else {
									method1331(true, 0);
									aClass173_5823.method2545();
									return;
								}
							}
							break;
						}
						if ((i_78_ & 0x80 ^ 0xffffffff) != -1
								&& (i_78_ & 0xf0 ^ 0xffffffff) != -145) {
							method1337(i_78_, (byte) 126);
						}
						aClass173_5823.method2556(i_75_);
						aClass173_5823.method2552(i_75_);
					}
					aLong5847 = l_77_;
					i_75_ = aClass173_5823.method2551();
					i_76_ = aClass173_5823.anIntArray1343[i_75_];
					l_77_ = aClass173_5823.method2547(i_76_);
				}
				aLong5849 = l_77_;
				anInt5850 = i_76_;
				anInt5845 = i_75_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.WA(" + i + ','
					+ l + ')');
		}
	}

	final int method1360(final int i) {
		try {
			if (i != -16257) {
				return -118;
			}
			return anInt5836;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, "jga.RA(" + i + ')');
		}
	}

	final void method1361(final int i, final boolean bool,
			final Class98_Sub16 class98_sub16) {
		do {
			try {
				int i_80_ = ((class98_sub16.aClass98_Sub24_Sub1_3934).aByteArray5799).length;
				int i_81_;
				do {
					if (bool
							&& (class98_sub16.aClass98_Sub24_Sub1_3934).aBoolean5797) {
						final int i_82_ = (-(class98_sub16.aClass98_Sub24_Sub1_3934).anInt5798 + (i_80_ + i_80_));
						i_81_ = (int) ((long) (anIntArray5842[(class98_sub16.anInt3940)])
								* (long) i_82_ >> -261318330);
						i_80_ <<= 8;
						if (i_81_ < i_80_) {
							break;
						}
						i_81_ = -i_81_ + (i_80_ + i_80_) - 1;
						class98_sub16.aClass98_Sub31_Sub5_3939.method1411(true);
						if (!client.aBoolean3553) {
							break;
						}
					}
					i_81_ = (int) ((long) (anIntArray5842[(class98_sub16.anInt3940)])
							* (long) i_80_ >> 1204742342);
				} while (false);
				class98_sub16.aClass98_Sub31_Sub5_3939.method1399(i_81_);
				if (i == 1) {
					break;
				}
				aBoolean5852 = false;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jga.L(" + i
						+ ',' + bool + ','
						+ (class98_sub16 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method1362(final int i, final int i_83_, final int i_84_) {
		try {
			anIntArray5833[i] = i_84_;
			if (i_83_ != 1) {
				method1333(-63);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.S(" + i + ','
					+ i_83_ + ',' + i_84_ + ')'));
		}
	}

	@Override
	final synchronized Class98_Sub31 method1322() {
		try {
			return aClass98_Sub31_Sub1_5846;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.B(" + ')');
		}
	}

	final synchronized void method1363(final int i, final int i_85_,
			final int i_86_) {
		try {
			if (i_85_ >= 0) {
				anIntArray5844[i_85_] = i_86_;
			} else {
				for (int i_87_ = 0; (i_87_ ^ 0xffffffff) > -17; i_87_++) {
					anIntArray5844[i_87_] = i_86_;
				}
			}
			if (i != -17) {
				anInt5824 = -115;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.EB(" + i
					+ ',' + i_85_ + ',' + i_86_ + ')'));
		}
	}

	final synchronized void method1364(final int i) {
		try {
			if (i <= 84) {
				anIntArray5830 = null;
			}
			method1344(-123, true);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, "jga.DB(" + i + ')');
		}
	}

	private final void method1365(final int i, final int i_88_, final int i_89_) {
		try {
			if (i_89_ != 15) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jga.CB(" + i
					+ ',' + i_88_ + ',' + i_89_ + ')'));
		}
	}

	final synchronized void method1366(final int i, final byte i_90_) {
		try {
			if (i_90_ <= 7) {
				method1337(-49, (byte) -22);
			}
			anInt5836 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.N(" + i + ','
					+ i_90_ + ')');
		}
	}

	static final void method1367(final byte i) {
		try {
			if (!Class4.aBoolean79) {
				Class180.aFloat3405 += (-24.0F - Class180.aFloat3405) / 2.0F;
				if (i == 83) {
					Class64_Sub6.aBoolean3656 = true;
					Class4.aBoolean79 = true;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, "jga.VA(" + i + ')');
		}
	}

	private final void method1368(final int i, final int i_91_) {
		try {
			if ((anIntArray5840[i_91_] & 0x4 ^ 0xffffffff) != -1) {
				for (Class98_Sub16 class98_sub16 = ((Class98_Sub16) aClass98_Sub31_Sub1_5846.aClass148_5817
						.method2418(32)); class98_sub16 != null; class98_sub16 = ((Class98_Sub16) aClass98_Sub31_Sub1_5846.aClass148_5817
						.method2417(101))) {
					if (i_91_ == class98_sub16.anInt3940) {
						class98_sub16.anInt3919 = 0;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.SA(" + i + ','
					+ i_91_ + ')');
		}
	}

	@Override
	final synchronized void method1325(final int[] is, int i, int i_93_) {
		try {
			if (aClass173_5823.method2546()) {
				final int i_94_ = (anInt5827 * aClass173_5823.anInt1340 / Class64_Sub15.anInt3678);
				do {
					final long l = (long) i_93_ * (long) i_94_ + aLong5847;
					if ((-l + aLong5849 ^ 0xffffffffffffffffL) <= -1L) {
						aLong5847 = l;
						break;
					}
					final int i_95_ = (int) ((-1L + (-aLong5847 + (aLong5849 - -(long) i_94_))) / i_94_);
					aLong5847 += (long) i_94_ * (long) i_95_;
					aClass98_Sub31_Sub1_5846.method1325(is, i, i_95_);
					i += i_95_;
					i_93_ -= i_95_;
					method1370(115);
				} while (aClass173_5823.method2546());
			}
			aClass98_Sub31_Sub1_5846.method1325(is, i, i_93_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("jga.A(" + (is != null ? "{...}" : "null") + ',' + i + ','
							+ i_93_ + ')'));
		}
	}

	private final void method1369(final int i, final int i_96_) {
		try {
			if ((0x2 & anIntArray5840[i]) != 0) {
				for (Class98_Sub16 class98_sub16 = ((Class98_Sub16) aClass98_Sub31_Sub1_5846.aClass148_5817
						.method2418(32)); class98_sub16 != null; class98_sub16 = ((Class98_Sub16) aClass98_Sub31_Sub1_5846.aClass148_5817
						.method2417(110))) {
					if (class98_sub16.anInt3940 == i
							&& ((aClass98_Sub16ArrayArray5825[i][class98_sub16.anInt3936]) == null)
							&& (class98_sub16.anInt3930 ^ 0xffffffff) > -1) {
						class98_sub16.anInt3930 = 0;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.K(" + i + ','
					+ i_96_ + ')');
		}
	}

	private final void method1370(final int i) {
		do {
			try {
				int i_98_ = anInt5845;
				if (i <= 112) {
					method1344(-33, false);
				}
				int i_99_ = anInt5850;
				long l = aLong5849;
				if (aClass98_Sub7_5851 != null
						&& (i_99_ ^ 0xffffffff) == (anInt5853 ^ 0xffffffff)) {
					method1343(aClass98_Sub7_5851, aBoolean5852, aBoolean5848,
							90);
					method1370(124);
				} else {
					while ((i_99_ ^ 0xffffffff) == (anInt5850 ^ 0xffffffff)) {
						while (((aClass173_5823.anIntArray1343[i_98_]) ^ 0xffffffff) == (i_99_ ^ 0xffffffff)) {
							aClass173_5823.method2555(i_98_);
							final int i_100_ = aClass173_5823.method2559(i_98_);
							if (i_100_ == 1) {
								aClass173_5823.method2553();
								aClass173_5823.method2552(i_98_);
								if (aClass173_5823.method2550()) {
									if (aClass98_Sub7_5851 != null) {
										method1332(aBoolean5848,
												aClass98_Sub7_5851, (byte) -4);
										method1370(119);
										return;
									}
									if (aBoolean5848 && i_99_ != 0) {
										aClass173_5823.method2548(l);
									} else {
										method1331(true, 0);
										aClass173_5823.method2545();
										return;
									}
								}
								break;
							}
							if ((0x80 & i_100_) != 0) {
								method1337(i_100_, (byte) 127);
							}
							aClass173_5823.method2556(i_98_);
							aClass173_5823.method2552(i_98_);
						}
						i_98_ = aClass173_5823.method2551();
						i_99_ = (aClass173_5823.anIntArray1343[i_98_]);
						l = aClass173_5823.method2547(i_99_);
					}
					anInt5850 = i_99_;
					anInt5845 = i_98_;
					aLong5849 = l;
					if (aClass98_Sub7_5851 == null || anInt5853 >= i_99_) {
						break;
					}
					anInt5845 = -1;
					anInt5850 = anInt5853;
					aLong5849 = aClass173_5823.method2547(anInt5850);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jga.KA(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final synchronized int method1326() {
		try {
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jga.G(" + ')');
		}
	}

	public Class98_Sub31_Sub2() {
		anIntArray5821 = new int[16];
		aClass98_Sub16ArrayArray5825 = new Class98_Sub16[16][128];
		aClass98_Sub16ArrayArray5828 = new Class98_Sub16[16][128];
		anIntArray5830 = new int[16];
		anIntArray5826 = new int[16];
		anIntArray5831 = new int[16];
		anIntArray5833 = new int[16];
		anIntArray5834 = new int[16];
		anIntArray5829 = new int[16];
		anIntArray5837 = new int[16];
		anInt5827 = 1000000;
		anIntArray5840 = new int[16];
		anIntArray5839 = new int[16];
		anInt5836 = 256;
		anIntArray5842 = new int[16];
		anIntArray5841 = new int[16];
		anIntArray5843 = new int[16];
		anIntArray5819 = new int[16];
		anIntArray5844 = new int[16];
		anIntArray5835 = new int[16];
		aClass173_5823 = new Class173();
		aClass98_Sub31_Sub1_5846 = new Class98_Sub31_Sub1(this);
		try {
			aClass377_5820 = new Class377(128);
			method1363(-17, -1, 256);
			method1331(true, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, "jga.<init>(" + ')');
		}
	}

	Class98_Sub31_Sub2(final Class98_Sub31_Sub2 class98_sub31_sub2_101_) {
		anIntArray5821 = new int[16];
		aClass98_Sub16ArrayArray5825 = new Class98_Sub16[16][128];
		aClass98_Sub16ArrayArray5828 = new Class98_Sub16[16][128];
		anIntArray5830 = new int[16];
		anIntArray5826 = new int[16];
		anIntArray5831 = new int[16];
		anIntArray5833 = new int[16];
		anIntArray5834 = new int[16];
		anIntArray5829 = new int[16];
		anIntArray5837 = new int[16];
		anInt5827 = 1000000;
		anIntArray5840 = new int[16];
		anIntArray5839 = new int[16];
		anInt5836 = 256;
		anIntArray5842 = new int[16];
		anIntArray5841 = new int[16];
		anIntArray5843 = new int[16];
		anIntArray5819 = new int[16];
		anIntArray5844 = new int[16];
		anIntArray5835 = new int[16];
		aClass173_5823 = new Class173();
		aClass98_Sub31_Sub1_5846 = new Class98_Sub31_Sub1(this);
		try {
			aClass377_5820 = class98_sub31_sub2_101_.aClass377_5820;
			method1363(-17, -1, 256);
			method1331(true, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("jga.<init>("
							+ (class98_sub31_sub2_101_ != null ? "{...}"
									: "null") + ')'));
		}
	}

	static {
		anInt5824 = 0;
		anInt5822 = 0;
		aClass58_5838 = new IncomingOpcode(32, 1);
	}
}
