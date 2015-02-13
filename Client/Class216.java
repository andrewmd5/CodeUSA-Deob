/* Class216 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class216 {
	int anInt1617;
	int anInt1618;
	int anInt1619;
	int anInt1620;
	int anInt1621;
	static Class341 aClass341_1622;
	int anInt1623;
	int anInt1624;
	int anInt1625;
	int anInt1626;
	int anInt1627;
	int anInt1628;
	int anInt1629;

	static final boolean method2793(final int i, final byte i_0_, final int i_1_) {
		try {
			if (i_0_ >= -87) {
				aClass341_1622 = null;
			}
			return (Class161.method2514(i_1_, 16, i) & Class322.method3672(i,
					i_1_, 2048));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nt.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2794(final byte i) {
		try {
			if (i <= -74) {
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (Class150.anInt1211 ^ 0xffffffff); i_2_++) {
					final int i_3_ = Class325.anIntArray2726[i_2_];
					final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
							.method3990(i_3_, -1));
					if (class98_sub39 != null) {
						final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
						Class98_Sub10_Sub10
								.method1038(
										class246_sub3_sub4_sub2_sub1,
										(class246_sub3_sub4_sub2_sub1.aClass141_6504).anInt1112,
										-12212);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nt.D(" + i + ')');
		}
	}

	final boolean method2795(final Class216 class216_4_, final boolean bool) {
		try {
			if (((anInt1617 ^ 0xffffffff) == (class216_4_.anInt1617 ^ 0xffffffff))
					&& ((anInt1618 ^ 0xffffffff) == (class216_4_.anInt1618 ^ 0xffffffff))
					&& (anInt1621 == class216_4_.anInt1621)) {
				return true;
			}
			if (bool != true) {
				method2797(64, 32, 21, 60);
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("nt.B(" + (class216_4_ != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	static final void method2796(final int i, final int i_5_, final int i_6_,
			final int i_7_, final byte i_8_) {
		while_131_: do {
			try {
				final int i_10_ = Class98_Sub10_Sub5.anInt5554;
				while_130_: do {
					do {
						if (i_10_ != 0) {
							if ((i_10_ ^ 0xffffffff) == -2) {
								break;
							}
							if ((i_10_ ^ 0xffffffff) != -3) {
								break while_131_;
							}
							if (!client.aBoolean3553) {
								break while_130_;
							}
						}
						return;
					} while (false);
					Class98_Sub10_Sub5.anInt5554 = 2;
					Class64_Sub27.anInt3716 = i_5_;
					Class82.anInt629 = i;
					Class98_Sub19.anInt3956 = i_6_;
					Applet_Sub1.anInt2 = i_7_;
					return;
				} while (false);
				if (i_6_ > Class98_Sub19.anInt3956) {
					Class98_Sub19.anInt3956 = i_6_;
				}
				if ((i ^ 0xffffffff) < (Class82.anInt629 ^ 0xffffffff)) {
					Class82.anInt629 = i;
				}
				if (i_7_ < Applet_Sub1.anInt2) {
					Applet_Sub1.anInt2 = i_7_;
				}
				if ((Class64_Sub27.anInt3716 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
					Class64_Sub27.anInt3716 = i_5_;
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("nt.A(" + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_
								+ ',' + i_8_ + ')'));
			}
		} while (false);
	}

	static final void method2797(final int i, final int i_11_, final int i_12_,
			final int i_13_) {
		try {
			if ((i ^ 0xffffffff) != (Class224_Sub2_Sub1.anInt6141 ^ 0xffffffff)
					|| (Class109.anInt926 ^ 0xffffffff) != (i_12_ ^ 0xffffffff)
					|| (aa_Sub1.anInt3558 ^ 0xffffffff) != (i_11_ ^ 0xffffffff)) {
				Class224_Sub2_Sub1.anInt6141 = i;
				Class109.anInt926 = i_12_;
				Class358.aBoolean3033 = true;
				aa_Sub1.anInt3558 = i_11_;
				final double d = -(2 * i * 3.141592653589793) / 16384.0;
				final double d_14_ = -(i_12_ * 2 * 3.141592653589793) / 16384.0;
				final double d_15_ = Math.cos(d_14_);
				final double d_16_ = Math.sin(d_14_);
				final double d_17_ = Math.cos(d);
				final double d_18_ = Math.sin(d);
				Class224_Sub3.aDouble5038 = -d_16_ * d_17_;
				Class98_Sub5_Sub2.aDouble5537 = d_18_;
				Class64_Sub11.aDouble3669 = d_16_ * d_18_;
				Class367.aDouble3543 = d_15_ * d_17_;
				Class279.aDouble2100 = 0.0;
				if (i_13_ == 25980) {
					Class76_Sub5.aDouble3747 = d_16_;
					Class98_Sub10_Sub25.aDouble5675 = d_17_;
					za_Sub2.aDouble6081 = d_15_;
					Class283.aDouble2145 = d_18_ * -d_15_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nt.C(" + i + ','
					+ i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	public static void method2798(final int i) {
		do {
			try {
				aClass341_1622 = null;
				if (i == 0) {
					break;
				}
				aClass341_1622 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "nt.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public Class216() {
		/* empty */
	}
}
