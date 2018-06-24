/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class71 {
	int anInt530;
	private final int anInt531;
	private int[] anIntArray532;
	private float[][] aFloatArrayArray533;
	private final int[] anIntArray534;
	private int[] anIntArray535;

	private final void method712() {
		final int[] is = new int[anInt531];
		final int[] is_0_ = new int[33];
		for (int i = 0; i < anInt531; i++) {
			final int i_1_ = anIntArray534[i];
			if (i_1_ != 0) {
				final int i_2_ = 1 << 32 - i_1_;
				final int i_3_ = is_0_[i_1_];
				is[i] = i_3_;
				int i_4_;
				if ((i_3_ & i_2_) != 0) {
					i_4_ = is_0_[i_1_ - 1];
				} else {
					i_4_ = i_3_ | i_2_;
					for (int i_5_ = i_1_ - 1; i_5_ >= 1; i_5_--) {
						final int i_6_ = is_0_[i_5_];
						if (i_6_ != i_3_) {
							break;
						}
						final int i_7_ = 1 << 32 - i_5_;
						if ((i_6_ & i_7_) != 0) {
							is_0_[i_5_] = is_0_[i_5_ - 1];
							break;
						}
						is_0_[i_5_] = i_6_ | i_7_;
					}
				}
				is_0_[i_1_] = i_4_;
				for (int i_8_ = i_1_ + 1; i_8_ <= 32; i_8_++) {
					final int i_9_ = is_0_[i_8_];
					if (i_9_ == i_3_) {
						is_0_[i_8_] = i_4_;
					}
				}
			}
		}
		anIntArray535 = new int[8];
		int i = 0;
		for (int i_10_ = 0; i_10_ < anInt531; i_10_++) {
			final int i_11_ = anIntArray534[i_10_];
			if (i_11_ != 0) {
				final int i_12_ = is[i_10_];
				int i_13_ = 0;
				for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
					int i_15_ = -2147483648 >>> i_14_;
					if ((i_12_ & i_15_) != 0) {
						if (anIntArray535[i_13_] == 0) {
							anIntArray535[i_13_] = i;
						}
						i_13_ = anIntArray535[i_13_];
					} else {
						i_13_++;
					}
					if (i_13_ >= anIntArray535.length) {
						final int[] is_16_ = new int[anIntArray535.length * 2];
						for (int i_17_ = 0; i_17_ < anIntArray535.length; i_17_++) {
							is_16_[i_17_] = anIntArray535[i_17_];
						}
						anIntArray535 = is_16_;
					}
					i_15_ >>>= 1;
				}
				anIntArray535[i_13_] = i_10_ ^ 0xffffffff;
				if (i_13_ >= i) {
					i = i_13_ + 1;
				}
			}
		}
	}

	private static final int method713(final int i, final int i_18_) {
		int i_19_;
		for (i_19_ = (int) Math.pow(i, 1.0 / i_18_) + 1; Class98_Sub49
				.method1662(i_19_, -1, i_18_) > i; i_19_--) {
			/* empty */
		}
		return i_19_;
	}

	final int method714() {
		int i;
		for (i = 0; anIntArray535[i] >= 0; i = Class98_Sub13.method1134() != 0 ? anIntArray535[i]
				: i + 1) {
			/* empty */
		}
		return anIntArray535[i] ^ 0xffffffff;
	}

	final float[] method715() {
		return aFloatArrayArray533[method714()];
	}

	Class71() {
		Class98_Sub13.method1138(24);
		anInt530 = Class98_Sub13.method1138(16);
		anInt531 = Class98_Sub13.method1138(24);
		anIntArray534 = new int[anInt531];
		final boolean bool = Class98_Sub13.method1134() != 0;
		if (bool) {
			int i = 0;
			int i_20_ = Class98_Sub13.method1138(5) + 1;
			while (i < anInt531) {
				final int i_21_ = (Class98_Sub13.method1138(Class48_Sub2_Sub1
						.method474(anInt531 - i, (byte) 31)));
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
					anIntArray534[i++] = i_20_;
				}
				i_20_++;
			}
		} else {
			final boolean bool_23_ = Class98_Sub13.method1134() != 0;
			for (int i = 0; i < anInt531; i++) {
				if (bool_23_ && Class98_Sub13.method1134() == 0) {
					anIntArray534[i] = 0;
				} else {
					anIntArray534[i] = Class98_Sub13.method1138(5) + 1;
				}
			}
		}
		method712();
		final int i = Class98_Sub13.method1138(4);
		if (i > 0) {
			final float f = Class98_Sub13.method1139(Class98_Sub13
					.method1138(32));
			final float f_24_ = Class98_Sub13.method1139(Class98_Sub13
					.method1138(32));
			final int i_25_ = Class98_Sub13.method1138(4) + 1;
			final boolean bool_26_ = Class98_Sub13.method1134() != 0;
			int i_27_;
			if (i == 1) {
				i_27_ = method713(anInt531, anInt530);
			} else {
				i_27_ = anInt531 * anInt530;
			}
			anIntArray532 = new int[i_27_];
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
				anIntArray532[i_28_] = Class98_Sub13.method1138(i_25_);
			}
			aFloatArrayArray533 = new float[anInt531][anInt530];
			if (i == 1) {
				for (int i_29_ = 0; i_29_ < anInt531; i_29_++) {
					float f_30_ = 0.0F;
					int i_31_ = 1;
					for (int i_32_ = 0; i_32_ < anInt530; i_32_++) {
						final int i_33_ = i_29_ / i_31_ % i_27_;
						final float f_34_ = anIntArray532[i_33_] * f_24_ + f
								+ f_30_;
						aFloatArrayArray533[i_29_][i_32_] = f_34_;
						if (bool_26_) {
							f_30_ = f_34_;
						}
						i_31_ *= i_27_;
					}
				}
			} else {
				for (int i_35_ = 0; i_35_ < anInt531; i_35_++) {
					float f_36_ = 0.0F;
					int i_37_ = i_35_ * anInt530;
					for (int i_38_ = 0; i_38_ < anInt530; i_38_++) {
						final float f_39_ = anIntArray532[i_37_] * f_24_ + f
								+ f_36_;
						aFloatArrayArray533[i_35_][i_38_] = f_39_;
						if (bool_26_) {
							f_36_ = f_39_;
						}
						i_37_++;
					}
				}
			}
		}
	}
}
