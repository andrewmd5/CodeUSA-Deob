/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class136 {
	private static int anInt1070;
	private static int anInt1071;
	private static int anInt1072;
	private static int[] anIntArray1073;
	private static int anInt1074;
	private static int anInt1075;
	private static int anInt1076;
	private static int anInt1077;

	private static final void method2265(final int i, final int i_0_) {
		if (i_0_ > i + 4) {
			int i_1_ = i;
			final int i_2_ = anIntArray1073[i_1_];
			final int i_3_ = anIntArray1073[i_1_ + 1];
			final int i_4_ = anIntArray1073[i_1_ + 2];
			final int i_5_ = anIntArray1073[i_1_ + 3];
			for (int i_6_ = i + 4; i_6_ < i_0_; i_6_ += 4) {
				final int i_7_ = anIntArray1073[i_6_ + 1];
				if (i_7_ < i_3_) {
					anIntArray1073[i_1_] = anIntArray1073[i_6_];
					anIntArray1073[i_1_ + 1] = i_7_;
					anIntArray1073[i_1_ + 2] = anIntArray1073[i_6_ + 2];
					anIntArray1073[i_1_ + 3] = anIntArray1073[i_6_ + 3];
					i_1_ += 4;
					anIntArray1073[i_6_] = anIntArray1073[i_1_];
					anIntArray1073[i_6_ + 1] = anIntArray1073[i_1_ + 1];
					anIntArray1073[i_6_ + 2] = anIntArray1073[i_1_ + 2];
					anIntArray1073[i_6_ + 3] = anIntArray1073[i_1_ + 3];
				}
			}
			anIntArray1073[i_1_] = i_2_;
			anIntArray1073[i_1_ + 1] = i_3_;
			anIntArray1073[i_1_ + 2] = i_4_;
			anIntArray1073[i_1_ + 3] = i_5_;
			method2265(i, i_1_);
			method2265(i_1_ + 4, i_0_);
		}
	}

	private static final boolean method2266(final int i) {
		int i_8_ = anInt1077;
		int i_9_ = anInt1072;
		int i_10_ = anInt1076;
		int i_11_;
		for (/**/; i_9_ >= i_8_; i_9_ = i_11_) {
			anInt1076 = ++i_10_;
			if (i_10_ >= i) {
				return false;
			}
			i_11_ = anInt1074;
			for (/**/; i_8_ < anInt1070; i_8_ += 4) {
				final int i_12_ = anIntArray1073[i_8_ + 1];
				if (i_10_ < i_12_) {
					break;
				}
				final int i_13_ = anIntArray1073[i_8_];
				final int i_14_ = anIntArray1073[i_8_ + 2];
				final int i_15_ = anIntArray1073[i_8_ + 3];
				final int i_16_ = (i_14_ - i_13_ << 16) / (i_15_ - i_12_);
				final int i_17_ = (i_13_ << 16) + 32768;
				anIntArray1073[i_8_] = i_17_;
				anIntArray1073[i_8_ + 2] = i_16_;
			}
			for (int i_18_ = i_11_; i_18_ < i_8_; i_18_ += 4) {
				final int i_19_ = anIntArray1073[i_18_ + 3];
				if (i_10_ >= i_19_) {
					anIntArray1073[i_18_] = anIntArray1073[i_11_];
					anIntArray1073[i_18_ + 1] = anIntArray1073[i_11_ + 1];
					anIntArray1073[i_18_ + 2] = anIntArray1073[i_11_ + 2];
					anIntArray1073[i_18_ + 3] = anIntArray1073[i_11_ + 3];
					i_11_ += 4;
				}
			}
			if (i_11_ == anInt1070) {
				anInt1070 = 0;
				return false;
			}
			method2274(i_11_, i_8_);
			anInt1074 = i_11_;
			anInt1077 = i_8_;
		}
		anInt1075 = anIntArray1073[i_9_] >> 16;
		anInt1071 = anIntArray1073[i_9_ + 4] >> 16;
		anIntArray1073[i_9_] += anIntArray1073[i_9_ + 2];
		anIntArray1073[i_9_ + 4] += anIntArray1073[i_9_ + 6];
		i_9_ += 8;
		anInt1072 = i_9_;
		return true;
	}

	private static final void method2267(final int[] is, final int i, int i_20_) {
		final int i_21_ = anInt1070 + (i_20_ << 1);
		if (anIntArray1073 == null || anIntArray1073.length < i_21_) {
			final int[] is_22_ = new int[i_21_];
			for (int i_23_ = 0; i_23_ < anInt1070; i_23_++) {
				is_22_[i_23_] = anIntArray1073[i_23_];
			}
			anIntArray1073 = is_22_;
		}
		i_20_ += i;
		int i_24_ = i_20_ - 2;
		for (int i_25_ = i; i_25_ < i_20_; i_25_ += 2) {
			final int i_26_ = is[i_24_ + 1];
			final int i_27_ = is[i_25_ + 1];
			if (i_26_ < i_27_) {
				anIntArray1073[anInt1070++] = is[i_24_];
				anIntArray1073[anInt1070++] = i_26_;
				anIntArray1073[anInt1070++] = is[i_25_];
				anIntArray1073[anInt1070++] = i_27_;
			} else if (i_27_ < i_26_) {
				anIntArray1073[anInt1070++] = is[i_25_];
				anIntArray1073[anInt1070++] = i_27_;
				anIntArray1073[anInt1070++] = is[i_24_];
				anIntArray1073[anInt1070++] = i_26_;
			}
			i_24_ = i_25_;
		}
	}

	private static final void method2268(final ha var_ha, final int[] is,
			final int i, final int i_28_, final int i_29_, final int[] is_30_,
			final int[] is_31_) {
		final int[] is_32_ = new int[4];
		var_ha.K(is_32_);
		if (is_30_ != null && is_32_[3] - is_32_[1] != is_30_.length) {
			throw new IllegalStateException();
		}
		method2271();
		method2267(is, i, i_28_);
		method2273(is_32_[1]);
		while (method2266(is_32_[3])) {
			int i_33_ = anInt1075;
			int i_34_ = anInt1071;
			final int i_35_ = anInt1076;
			if (is_30_ != null) {
				final int i_36_ = i_35_ - is_32_[1];
				if (i_33_ < is_30_[i_36_] + is_32_[0]) {
					i_33_ = is_30_[i_36_] + is_32_[0];
				}
				if (i_34_ > is_30_[i_36_] + is_31_[i_36_] + is_32_[0]) {
					i_34_ = is_30_[i_36_] + is_31_[i_36_] + is_32_[0];
				}
				if (i_34_ - i_33_ <= 0) {
					continue;
				}
			}
			var_ha.U(i_33_, i_35_, i_34_ - i_33_, i_29_, 1);
		}
	}

	public static void method2269() {
		anIntArray1073 = null;
	}

	static final void method2270(final ha var_ha, final int[] is, final int i) {
		method2268(var_ha, is, 0, is.length, i, null, null);
	}

	private static final void method2271() {
		anInt1070 = 0;
	}

	static final void method2272(final ha var_ha, final int[] is, final int i,
			final int[] is_37_, final int[] is_38_) {
		method2268(var_ha, is, 0, is.length, i, is_37_, is_38_);
	}

	private static final void method2273(final int i) {
		if (anInt1070 < 0) {
			anInt1074 = anInt1077 = anInt1072 = 0;
			anInt1076 = 2147483646;
		} else {
			method2265(0, anInt1070);
			int i_39_ = anIntArray1073[1];
			if (i_39_ < i) {
				i_39_ = i;
			}
			final int i_40_ = 0;
			int i_41_;
			for (i_41_ = 0; i_41_ < anInt1070; i_41_ += 4) {
				final int i_42_ = anIntArray1073[i_41_ + 1];
				if (i_39_ < i_42_) {
					break;
				}
				final int i_43_ = anIntArray1073[i_41_];
				final int i_44_ = anIntArray1073[i_41_ + 2];
				final int i_45_ = anIntArray1073[i_41_ + 3];
				final int i_46_ = (i_44_ - i_43_ << 16) / (i_45_ - i_42_);
				final int i_47_ = (i_43_ << 16) + 32768;
				anIntArray1073[i_41_] = i_47_ + (i_39_ - i_42_) * i_46_;
				anIntArray1073[i_41_ + 2] = i_46_;
			}
			anInt1074 = i_40_;
			anInt1077 = i_41_;
			anInt1072 = i_41_;
			anInt1076 = i_39_ - 1;
		}
	}

	private static final void method2274(final int i, int i_48_) {
		for (/**/; i_48_ >= i + 8; i_48_ -= 4) {
			boolean bool = true;
			for (int i_49_ = i + 4; i_49_ < i_48_; i_49_ += 4) {
				int i_50_ = anIntArray1073[i_49_ - 4];
				final int i_51_ = anIntArray1073[i_49_];
				if (i_50_ > i_51_) {
					bool = false;
					anIntArray1073[i_49_ - 4] = i_51_;
					anIntArray1073[i_49_] = i_50_;
					i_50_ = anIntArray1073[i_49_ - 2];
					anIntArray1073[i_49_ - 2] = anIntArray1073[i_49_ + 2];
					anIntArray1073[i_49_ + 2] = i_50_;
					i_50_ = anIntArray1073[i_49_ - 1];
					anIntArray1073[i_49_ - 1] = anIntArray1073[i_49_ + 3];
					anIntArray1073[i_49_ + 3] = i_50_;
				}
			}
			if (bool) {
				break;
			}
		}
	}
}
