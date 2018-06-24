/* Class344 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Class344 {
	private static int[] anIntArray2864 = new int[32768];
	private Class209 aClass209_2865;
	private static int[] anIntArray2866;
	int anInt2867;
	private int anInt2868 = 100;
	private Class209 aClass209_2869;
	int anInt2870;
	private Class182 aClass182_2871;
	private Class209 aClass209_2872;
	private final int[] anIntArray2873;
	private Class209 aClass209_2874;
	private final int[] anIntArray2875;
	private Class209 aClass209_2876;
	private Class209 aClass209_2877;
	private Class209 aClass209_2878;
	private static int[] anIntArray2879;
	private Class209 aClass209_2880;
	private final int[] anIntArray2881;
	private int anInt2882;
	private Class209 aClass209_2883;
	private static int[] anIntArray2884;
	private static int[] anIntArray2885;
	private static int[] anIntArray2886;
	private static int[] anIntArray2887;
	private static int[] anIntArray2888;

	final void method3820(final ByteBuffer class98_sub22) {
		aClass209_2880 = new Class209();
		aClass209_2880.method2771(class98_sub22);
		aClass209_2883 = new Class209();
		aClass209_2883.method2771(class98_sub22);
		int i = class98_sub22.readUnsignedByte((byte) 95);
		if (i != 0) {
			class98_sub22.position--;
			aClass209_2874 = new Class209();
			aClass209_2874.method2771(class98_sub22);
			aClass209_2869 = new Class209();
			aClass209_2869.method2771(class98_sub22);
		}
		i = class98_sub22.readUnsignedByte((byte) 36);
		if (i != 0) {
			class98_sub22.position--;
			aClass209_2876 = new Class209();
			aClass209_2876.method2771(class98_sub22);
			aClass209_2878 = new Class209();
			aClass209_2878.method2771(class98_sub22);
		}
		i = class98_sub22.readUnsignedByte((byte) -99);
		if (i != 0) {
			class98_sub22.position--;
			aClass209_2872 = new Class209();
			aClass209_2872.method2771(class98_sub22);
			aClass209_2877 = new Class209();
			aClass209_2877.method2771(class98_sub22);
		}
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			final int i_1_ = class98_sub22.readSmart();
			if (i_1_ == 0) {
				break;
			}
			anIntArray2881[i_0_] = i_1_;
			anIntArray2875[i_0_] = class98_sub22.method1239(-80);
			anIntArray2873[i_0_] = class98_sub22.readSmart();
		}
		anInt2882 = class98_sub22.readSmart();
		anInt2868 = class98_sub22.readSmart();
		anInt2870 = class98_sub22.readUnsignedShort((byte) 127);
		anInt2867 = class98_sub22.readUnsignedShort((byte) 127);
		aClass182_2871 = new Class182();
		aClass209_2865 = new Class209();
		aClass182_2871.method2612(class98_sub22, aClass209_2865);
	}

	private final int method3821(final int i, final int i_2_, final int i_3_) {
		if (i_3_ == 1) {
			if ((i & 0x7fff) < 16384) {
				return i_2_;
			}
			return -i_2_;
		}
		if (i_3_ == 2) {
			return anIntArray2866[i & 0x7fff] * i_2_ >> 14;
		}
		if (i_3_ == 3) {
			return ((i & 0x7fff) * i_2_ >> 14) - i_2_;
		}
		if (i_3_ == 4) {
			return anIntArray2864[i / 2607 & 0x7fff] * i_2_;
		}
		return 0;
	}

	final int[] method3822(final int i, final int i_4_) {
		Class236.method2893(anIntArray2879, 0, i);
		if (i_4_ < 10) {
			return anIntArray2879;
		}
		final double d = i / (i_4_ + 0.0);
		aClass209_2880.method2769();
		aClass209_2883.method2769();
		int i_5_ = 0;
		int i_6_ = 0;
		int i_7_ = 0;
		if (aClass209_2874 != null) {
			aClass209_2874.method2769();
			aClass209_2869.method2769();
			i_5_ = (int) ((aClass209_2874.anInt1583 - aClass209_2874.anInt1587) * 32.768 / d);
			i_6_ = (int) (aClass209_2874.anInt1587 * 32.768 / d);
		}
		int i_8_ = 0;
		int i_9_ = 0;
		int i_10_ = 0;
		if (aClass209_2876 != null) {
			aClass209_2876.method2769();
			aClass209_2878.method2769();
			i_8_ = (int) ((aClass209_2876.anInt1583 - aClass209_2876.anInt1587) * 32.768 / d);
			i_9_ = (int) (aClass209_2876.anInt1587 * 32.768 / d);
		}
		for (int i_11_ = 0; i_11_ < 5; i_11_++) {
			if (anIntArray2881[i_11_] != 0) {
				anIntArray2887[i_11_] = 0;
				anIntArray2884[i_11_] = (int) (anIntArray2873[i_11_] * d);
				anIntArray2888[i_11_] = (anIntArray2881[i_11_] << 14) / 100;
				anIntArray2885[i_11_] = (int) ((aClass209_2880.anInt1583 - aClass209_2880.anInt1587)
						* 32.768
						* Math.pow(1.0057929410678534, anIntArray2875[i_11_]) / d);
				anIntArray2886[i_11_] = (int) (aClass209_2880.anInt1587 * 32.768 / d);
			}
		}
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			int i_13_ = aClass209_2880.method2770(i);
			int i_14_ = aClass209_2883.method2770(i);
			if (aClass209_2874 != null) {
				final int i_15_ = aClass209_2874.method2770(i);
				final int i_16_ = aClass209_2869.method2770(i);
				i_13_ += method3821(i_7_, i_16_, aClass209_2874.anInt1584) >> 1;
				i_7_ += (i_15_ * i_5_ >> 16) + i_6_;
			}
			if (aClass209_2876 != null) {
				final int i_17_ = aClass209_2876.method2770(i);
				final int i_18_ = aClass209_2878.method2770(i);
				i_14_ = (i_14_ * ((method3821(i_10_, i_18_,
						aClass209_2876.anInt1584) >> 1) + 32768)) >> 15;
				i_10_ += (i_17_ * i_8_ >> 16) + i_9_;
			}
			for (int i_19_ = 0; i_19_ < 5; i_19_++) {
				if (anIntArray2881[i_19_] != 0) {
					final int i_20_ = i_12_ + anIntArray2884[i_19_];
					if (i_20_ < i) {
						anIntArray2879[i_20_] += method3821(
								anIntArray2887[i_19_], i_14_
										* anIntArray2888[i_19_] >> 15,
								(aClass209_2880.anInt1584));
						anIntArray2887[i_19_] += ((i_13_
								* anIntArray2885[i_19_] >> 16) + anIntArray2886[i_19_]);
					}
				}
			}
		}
		if (aClass209_2872 != null) {
			aClass209_2872.method2769();
			aClass209_2877.method2769();
			int i_21_ = 0;
			boolean bool_22_ = true;
			for (int i_23_ = 0; i_23_ < i; i_23_++) {
				final int i_24_ = aClass209_2872.method2770(i);
				final int i_25_ = aClass209_2877.method2770(i);
				int i_26_;
				if (bool_22_) {
					i_26_ = (aClass209_2872.anInt1587 + ((aClass209_2872.anInt1583 - aClass209_2872.anInt1587)
							* i_24_ >> 8));
				} else {
					i_26_ = (aClass209_2872.anInt1587 + ((aClass209_2872.anInt1583 - aClass209_2872.anInt1587)
							* i_25_ >> 8));
				}
				i_21_ += 256;
				if (i_21_ >= i_26_) {
					i_21_ = 0;
					bool_22_ = !bool_22_;
				}
				if (bool_22_) {
					anIntArray2879[i_23_] = 0;
				}
			}
		}
		if (anInt2882 > 0 && anInt2868 > 0) {
			final int i_27_ = (int) (anInt2882 * d);
			for (int i_28_ = i_27_; i_28_ < i; i_28_++) {
				anIntArray2879[i_28_] += anIntArray2879[i_28_ - i_27_]
						* anInt2868 / 100;
			}
		}
		if (aClass182_2871.anIntArray1437[0] > 0
				|| aClass182_2871.anIntArray1437[1] > 0) {
			aClass209_2865.method2769();
			int i_29_ = aClass209_2865.method2770(i + 1);
			int i_30_ = aClass182_2871.method2613(0, i_29_ / 65536.0F);
			int i_31_ = aClass182_2871.method2613(1, i_29_ / 65536.0F);
			if (i >= i_30_ + i_31_) {
				int i_32_ = 0;
				int i_33_ = i_31_;
				if (i_33_ > i - i_30_) {
					i_33_ = i - i_30_;
				}
				for (/**/; i_32_ < i_33_; i_32_++) {
					int i_34_ = (int) (((long) anIntArray2879[i_32_ + i_30_] * (long) Class182.anInt1439) >> 16);
					for (int i_35_ = 0; i_35_ < i_30_; i_35_++) {
						i_34_ += (int) (((long) (anIntArray2879[i_32_ + i_30_
								- 1 - i_35_]) * (long) (Class182.anIntArrayArray1438[0][i_35_])) >> 16);
					}
					for (int i_36_ = 0; i_36_ < i_32_; i_36_++) {
						i_34_ -= (int) (((long) anIntArray2879[i_32_ - 1
								- i_36_] * (long) (Class182.anIntArrayArray1438[1][i_36_])) >> 16);
					}
					anIntArray2879[i_32_] = i_34_;
					i_29_ = aClass209_2865.method2770(i + 1);
				}
				i_33_ = 128;
				for (;;) {
					if (i_33_ > i - i_30_) {
						i_33_ = i - i_30_;
					}
					for (/**/; i_32_ < i_33_; i_32_++) {
						int i_37_ = (int) (((long) anIntArray2879[i_32_ + i_30_] * (long) Class182.anInt1439) >> 16);
						for (int i_38_ = 0; i_38_ < i_30_; i_38_++) {
							i_37_ += (int) (((long) (anIntArray2879[i_32_
									+ i_30_ - 1 - i_38_]) * (long) (Class182.anIntArrayArray1438[0][i_38_])) >> 16);
						}
						for (int i_39_ = 0; i_39_ < i_31_; i_39_++) {
							i_37_ -= (int) (((long) (anIntArray2879[i_32_ - 1
									- i_39_]) * (long) (Class182.anIntArrayArray1438[1][i_39_])) >> 16);
						}
						anIntArray2879[i_32_] = i_37_;
						i_29_ = aClass209_2865.method2770(i + 1);
					}
					if (i_32_ >= i - i_30_) {
						break;
					}
					i_30_ = aClass182_2871.method2613(0, i_29_ / 65536.0F);
					i_31_ = aClass182_2871.method2613(1, i_29_ / 65536.0F);
					i_33_ += 128;
				}
				for (/**/; i_32_ < i; i_32_++) {
					int i_40_ = 0;
					for (int i_41_ = i_32_ + i_30_ - i; i_41_ < i_30_; i_41_++) {
						i_40_ += (int) (((long) (anIntArray2879[i_32_ + i_30_
								- 1 - i_41_]) * (long) (Class182.anIntArrayArray1438[0][i_41_])) >> 16);
					}
					for (int i_42_ = 0; i_42_ < i_31_; i_42_++) {
						i_40_ -= (int) (((long) anIntArray2879[i_32_ - 1
								- i_42_] * (long) (Class182.anIntArrayArray1438[1][i_42_])) >> 16);
					}
					anIntArray2879[i_32_] = i_40_;
					i_29_ = aClass209_2865.method2770(i + 1);
				}
			}
		}
		for (int i_43_ = 0; i_43_ < i; i_43_++) {
			if (anIntArray2879[i_43_] < -32768) {
				anIntArray2879[i_43_] = -32768;
			}
			if (anIntArray2879[i_43_] > 32767) {
				anIntArray2879[i_43_] = 32767;
			}
		}
		return anIntArray2879;
	}

	public static void method3823() {
		anIntArray2879 = null;
		anIntArray2864 = null;
		anIntArray2866 = null;
		anIntArray2887 = null;
		anIntArray2884 = null;
		anIntArray2888 = null;
		anIntArray2885 = null;
		anIntArray2886 = null;
	}

	public Class344() {
		anInt2867 = 0;
		anIntArray2873 = new int[5];
		anIntArray2875 = new int[5];
		anInt2870 = 500;
		anIntArray2881 = new int[5];
		anInt2882 = 0;
	}

	static {
		final Random random = new Random(0L);
		for (int i = 0; i < 32768; i++) {
			anIntArray2864[i] = (random.nextInt() & 0x2) - 1;
		}
		anIntArray2866 = new int[32768];
		for (int i = 0; i < 32768; i++) {
			anIntArray2866[i] = (int) (Math.sin(i / 5215.1903) * 16384.0);
		}
		anIntArray2879 = new int[220500];
		anIntArray2885 = new int[5];
		anIntArray2888 = new int[5];
		anIntArray2887 = new int[5];
		anIntArray2884 = new int[5];
		anIntArray2886 = new int[5];
	}
}
