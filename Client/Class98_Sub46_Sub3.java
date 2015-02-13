/* Class98_Sub46_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub3 extends Class98_Sub46 {
	static Class131[] aClass131Array5953 = new Class131[100];
	Class246_Sub3_Sub4_Sub3 aClass246_Sub3_Sub4_Sub3_5954;

	public static void method1540(final boolean bool) {
		do {
			try {
				aClass131Array5953 = null;
				if (bool == false) {
					break;
				}
				method1540(true);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bv.B(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	Class98_Sub46_Sub3(final Class246_Sub3_Sub4_Sub3 class246_sub3_sub4_sub3) {
		try {
			aClass246_Sub3_Sub4_Sub3_5954 = class246_sub3_sub4_sub3;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("bv.<init>("
							+ (class246_sub3_sub4_sub3 != null ? "{...}"
									: "null") + ')'));
		}
	}

	static final void method1541(final int i) {
		do {
			try {
				int i_0_ = 256 + 512 * Class363.anInt3098;
				int i_1_ = Class98_Sub10_Sub21.anInt5643 * 512 + 256;
				int i_2_ = (Class98_Sub46_Sub2_Sub2.method1538(
						Class43.anInt377, i_1_, i_0_, 24111) - Class308.anInt2580);
				do {
					if ((Class263.anInt1967 ^ 0xffffffff) <= -101) {
						Class134.anInt3461 = 256 + 512 * Class98_Sub10_Sub21.anInt5643;
						Class98_Sub46_Sub10.anInt6020 = Class363.anInt3098 * 512 + 256;
						Class79.anInt601 = ((Class98_Sub46_Sub2_Sub2
								.method1538(Class43.anInt377,
										Class134.anInt3461,
										Class98_Sub46_Sub10.anInt6020, 24111)) - Class308.anInt2580);
						if (!client.aBoolean3553) {
							break;
						}
					}
					if (Class98_Sub46_Sub10.anInt6020 < i_0_) {
						Class98_Sub46_Sub10.anInt6020 += (Class98_Sub46_Sub2_Sub2.anInt6300 - -((-Class98_Sub46_Sub10.anInt6020 + i_0_)
								* Class263.anInt1967 / 1000));
						if ((Class98_Sub46_Sub10.anInt6020 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)) {
							Class98_Sub46_Sub10.anInt6020 = i_0_;
						}
					}
					if (i_0_ < Class98_Sub46_Sub10.anInt6020) {
						Class98_Sub46_Sub10.anInt6020 -= (Class98_Sub46_Sub2_Sub2.anInt6300 + ((-i_0_ + Class98_Sub46_Sub10.anInt6020)
								* Class263.anInt1967 / 1000));
						if (Class98_Sub46_Sub10.anInt6020 < i_0_) {
							Class98_Sub46_Sub10.anInt6020 = i_0_;
						}
					}
					if ((Class79.anInt601 ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
						Class79.anInt601 += ((-Class79.anInt601 + i_2_)
								* Class263.anInt1967 / 1000)
								+ Class98_Sub46_Sub2_Sub2.anInt6300;
						if (Class79.anInt601 > i_2_) {
							Class79.anInt601 = i_2_;
						}
					}
					if (i_1_ > Class134.anInt3461) {
						Class134.anInt3461 += ((Class263.anInt1967
								* (i_1_ + -Class134.anInt3461) / 1000) + Class98_Sub46_Sub2_Sub2.anInt6300);
						if ((Class134.anInt3461 ^ 0xffffffff) < (i_1_ ^ 0xffffffff)) {
							Class134.anInt3461 = i_1_;
						}
					}
					if ((Class79.anInt601 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)) {
						Class79.anInt601 -= (Class98_Sub46_Sub2_Sub2.anInt6300 - -((Class79.anInt601 - i_2_)
								* Class263.anInt1967 / 1000));
						if (i_2_ > Class79.anInt601) {
							Class79.anInt601 = i_2_;
						}
					}
					if ((i_1_ ^ 0xffffffff) > (Class134.anInt3461 ^ 0xffffffff)) {
						Class134.anInt3461 -= (Class98_Sub46_Sub2_Sub2.anInt6300 + (Class263.anInt1967
								* (-i_1_ + Class134.anInt3461) / 1000));
						if ((i_1_ ^ 0xffffffff) < (Class134.anInt3461 ^ 0xffffffff)) {
							Class134.anInt3461 = i_1_;
						}
					}
				} while (false);
				i_1_ = 512 * Class98_Sub15.anInt3915 + 256;
				i_0_ = 256 + 512 * Exception_Sub1.anInt44;
				i_2_ = (Class98_Sub46_Sub2_Sub2.method1538(Class43.anInt377,
						i_1_, i_0_, 24111) - Class303.anInt2530);
				final int i_3_ = -Class98_Sub46_Sub10.anInt6020 + i_0_;
				final int i_4_ = -Class79.anInt601 + i_2_;
				final int i_5_ = -Class134.anInt3461 + i_1_;
				final int i_6_ = (int) Math.sqrt(i_3_ * i_3_ - -(i_5_ * i_5_));
				int i_7_ = 0x3fff & (int) (Math.atan2(i_4_, i_6_) * 2607.5945876176133);
				final int i_8_ = ((int) (-2607.5945876176133 * Math.atan2(i_3_,
						i_5_)) & 0x3fff);
				if (i_7_ < 1024) {
					i_7_ = 1024;
				}
				if ((i_7_ ^ 0xffffffff) < -3073) {
					i_7_ = 3072;
				}
				if (Class246_Sub3_Sub4_Sub2.anInt6357 < i_7_) {
					Class246_Sub3_Sub4_Sub2.anInt6357 += ((i_7_
							- Class246_Sub3_Sub4_Sub2.anInt6357 >> -1117924989)
							* Class98_Sub4.anInt3828 / 1000 + Class98_Sub41.anInt4202) << -1739945821;
					if (Class246_Sub3_Sub4_Sub2.anInt6357 > i_7_) {
						Class246_Sub3_Sub4_Sub2.anInt6357 = i_7_;
					}
				}
				if ((i_7_ ^ 0xffffffff) > (Class246_Sub3_Sub4_Sub2.anInt6357 ^ 0xffffffff)) {
					Class246_Sub3_Sub4_Sub2.anInt6357 -= (Class98_Sub41.anInt4202 + (Class98_Sub4.anInt3828
							* (-i_7_ + Class246_Sub3_Sub4_Sub2.anInt6357 >> 1278679235) / 1000)) << -1425824541;
					if (i_7_ > Class246_Sub3_Sub4_Sub2.anInt6357) {
						Class246_Sub3_Sub4_Sub2.anInt6357 = i_7_;
					}
				}
				int i_9_ = i_8_ + -Class186.anInt3424;
				if ((i_9_ ^ 0xffffffff) < -8193) {
					i_9_ -= 16384;
				}
				if ((i_9_ ^ 0xffffffff) > 8191) {
					i_9_ += 16384;
				}
				i_9_ >>= 3;
				if ((i_9_ ^ 0xffffffff) < -1) {
					Class186.anInt3424 += (Class98_Sub4.anInt3828 * i_9_ / 1000 + Class98_Sub41.anInt4202) << 1507566883;
					Class186.anInt3424 &= 0x3fff;
				}
				if (i_9_ < 0) {
					Class186.anInt3424 -= (Class98_Sub4.anInt3828 * -i_9_
							/ 1000 + Class98_Sub41.anInt4202) << 1406205123;
					Class186.anInt3424 &= 0x3fff;
				}
				int i_10_ = -Class186.anInt3424 + i_8_;
				if (i > 69) {
					if ((i_10_ ^ 0xffffffff) < -8193) {
						i_10_ -= 16384;
					}
					if (i_10_ < -8192) {
						i_10_ += 16384;
					}
					Class308.anInt2584 = 0;
					if (((i_10_ ^ 0xffffffff) <= -1 || i_9_ <= 0)
							&& (i_10_ <= 0 || i_9_ >= 0)) {
						break;
					}
					Class186.anInt3424 = i_8_;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "bv.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
