/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class325 {
	static int[] anIntArray2726 = new int[1024];
	static int anInt2727;
	private int anInt2728;
	static int anInt2729 = -1;
	int anInt2730;

	final void method3695(final int i) {
		do {
			try {
				anInt2730 &= 0x3fff;
				if (i == -7741) {
					break;
				}
				method3699(-29, -15, 43, 76);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ua.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method3696(final byte i, final int i_0_, final int i_1_,
			final int i_2_, final String string, final int i_3_,
			final int i_4_, final int i_5_) {
		try {
			final Class246_Sub7 class246_sub7 = new Class246_Sub7();
			class246_sub7.anInt5118 = Class215.anInt1614 - -i_2_;
			class246_sub7.anInt5116 = i_5_;
			class246_sub7.anInt5123 = i_1_;
			class246_sub7.aString5121 = string;
			class246_sub7.anInt5117 = i_0_;
			class246_sub7.anInt5120 = i_4_;
			class246_sub7.anInt5122 = i_3_;
			Class64_Sub20.aClass218_3694.method2808(true, class246_sub7);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ua.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ','
					+ (string != null ? "{...}" : "null") + ',' + i_3_ + ','
					+ i_4_ + ',' + i_5_ + ')'));
		}
	}

	final void method3697(final boolean bool, final int i) {
		do {
			try {
				anInt2730 = i;
				anInt2728 = 0;
				if (bool == true) {
					break;
				}
				method3699(3, -90, 0, -103);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ua.C(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	final int method3698(final byte i) {
		try {
			if (i != 116) {
				anInt2730 = 87;
			}
			return anInt2730 & 0x3fff;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ua.D(" + i + ')');
		}
	}

	final boolean method3699(final int i, final int i_7_, final int i_8_,
			final int i_9_) {
		try {
			final int i_10_ = anInt2728;
			if (i_8_ == anInt2730 && anInt2728 == 0) {
				return false;
			}
			boolean bool;
			if ((anInt2728 ^ 0xffffffff) == -1) {
				if ((anInt2730 < i_8_ && anInt2730 - -i_9_ >= i_8_)
						|| (i_8_ < anInt2730 && i_8_ >= anInt2730 - i_9_)) {
					anInt2730 = i_8_;
					return false;
				}
				bool = true;
			} else if (anInt2728 <= 0
					|| ((anInt2730 ^ 0xffffffff) <= (i_8_ ^ 0xffffffff))) {
				if ((anInt2728 ^ 0xffffffff) > -1 && anInt2730 > i_8_) {
					final int i_11_ = anInt2728 * anInt2728 / (i_9_ * 2);
					final int i_12_ = anInt2730 + -i_11_;
					if (i_8_ < i_12_ && i_12_ <= anInt2730) {
						bool = true;
					} else {
						bool = false;
					}
				} else {
					bool = false;
				}
			} else {
				final int i_13_ = anInt2728 * anInt2728 / (2 * i_9_);
				final int i_14_ = anInt2730 + i_13_;
				if ((i_8_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff)
						&& ((anInt2730 ^ 0xffffffff) >= (i_14_ ^ 0xffffffff))) {
					bool = true;
				} else {
					bool = false;
				}
			}
			if (i != 4201) {
				anInt2730 = -82;
			}
			if (!bool) {
				if ((anInt2728 ^ 0xffffffff) < -1) {
					anInt2728 -= i_9_;
					if ((anInt2728 ^ 0xffffffff) > -1) {
						anInt2728 = 0;
					}
				} else {
					anInt2728 += i_9_;
					if (anInt2728 > 0) {
						anInt2728 = 0;
					}
				}
			} else {
				if ((i_8_ ^ 0xffffffff) < (anInt2730 ^ 0xffffffff)) {
					anInt2728 += i_9_;
					if (i_7_ != 0
							&& (i_7_ ^ 0xffffffff) > (anInt2728 ^ 0xffffffff)) {
						anInt2728 = i_7_;
					}
				} else {
					anInt2728 -= i_9_;
					if (i_7_ != 0 && -i_7_ > anInt2728) {
						anInt2728 = -i_7_;
					}
				}
				if ((anInt2728 ^ 0xffffffff) != (i_10_ ^ 0xffffffff)) {
					final int i_15_ = anInt2728 * anInt2728 / (i_9_ * 2);
					if (anInt2730 >= i_8_) {
						if (i_8_ < anInt2730 && i_8_ > -i_15_ + anInt2730) {
							anInt2728 = i_10_;
						}
					} else if ((i_8_ ^ 0xffffffff) > (i_15_ + anInt2730 ^ 0xffffffff)) {
						anInt2728 = i_10_;
					}
				}
			}
			anInt2730 += i_10_ + anInt2728 >> -1761865567;
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ua.B(" + i + ','
					+ i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	public static void method3700(final int i) {
		try {
			if (i != 2) {
				anIntArray2726 = null;
			}
			anIntArray2726 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ua.E(" + i + ')');
		}
	}

	public Class325() {
		/* empty */
	}

	static {
		anInt2727 = 1338;
	}
}
