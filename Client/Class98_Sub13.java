/* Class98_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub13 extends Class98 {
	private int anInt3880;
	private float[] aFloatArray3881;
	private static float[] aFloatArray3882;
	private static float[] aFloatArray3883;
	private int anInt3884;
	static Class71[] aClass71Array3885;
	private static float[] aFloatArray3886;
	private static float[] aFloatArray3887;
	private static float[] aFloatArray3888;
	private static int anInt3889;
	private boolean aBoolean3890;
	private static int[] anIntArray3891;
	private boolean aBoolean3892;
	private static int anInt3893;
	private static Class311[] aClass311Array3894;
	private static int anInt3895;
	private int anInt3896;
	private static int[] anIntArray3897;
	private byte[][] aByteArrayArray3898;
	private static float[] aFloatArray3899;
	private int anInt3900;
	private static Class56[] aClass56Array3901;
	private static Class371[] aClass371Array3902;
	private static boolean[] aBooleanArray3903;
	private static int anInt3904;
	private static boolean aBoolean3905 = false;
	private static int[] anIntArray3906;
	private static float[] aFloatArray3907;
	private static byte[] aByteArray3908;
	private int anInt3909;
	private int anInt3910;
	private byte[] aByteArray3911;
	private int anInt3912;
	private int anInt3913;

	final Class98_Sub24_Sub1 method1132(final int[] is) {
		if (is != null && is[0] <= 0) {
			return null;
		}
		if (aByteArray3911 == null) {
			anInt3884 = 0;
			aFloatArray3881 = new float[anInt3904];
			aByteArray3911 = new byte[anInt3910];
			anInt3913 = 0;
			anInt3912 = 0;
		}
		for (/**/; anInt3912 < aByteArrayArray3898.length; anInt3912++) {
			if (is != null && is[0] <= 0) {
				return null;
			}
			final float[] fs = method1135(anInt3912);
			if (fs != null) {
				int i = anInt3913;
				int i_0_ = fs.length;
				if (i_0_ > anInt3910 - i) {
					i_0_ = anInt3910 - i;
				}
				for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
					int i_2_ = (int) (128.0F + fs[i_1_] * 128.0F);
					if ((i_2_ & ~0xff) != 0) {
						i_2_ = (i_2_ ^ 0xffffffff) >> 31;
					}
					aByteArray3911[i++] = (byte) (i_2_ - 128);
				}
				if (is != null) {
					is[0] -= i - anInt3913;
				}
				anInt3913 = i;
			}
		}
		aFloatArray3881 = null;
		final byte[] is_3_ = aByteArray3911;
		aByteArray3911 = null;
		return new Class98_Sub24_Sub1(anInt3880, is_3_, anInt3896, anInt3900,
				aBoolean3890);
	}

	private static final boolean method1133(final Class207 class207) {
		if (!aBoolean3905) {
			final byte[] is = class207.method2745(0, 0, false);
			if (is == null) {
				return false;
			}
			method1143(is);
		}
		return true;
	}

	static final int method1134() {
		final int i = aByteArray3908[anInt3893] >> anInt3895 & 0x1;
		anInt3895++;
		anInt3893 += anInt3895 >> 3;
		anInt3895 &= 0x7;
		return i;
	}

	private final float[] method1135(final int i) {
		method1141(aByteArrayArray3898[i], 0);
		method1134();
		final int i_4_ = method1138(Class48_Sub2_Sub1.method474(
				anIntArray3906.length - 1, (byte) 31));
		final boolean bool = aBooleanArray3903[i_4_];
		final int i_5_ = bool ? anInt3904 : anInt3889;
		boolean bool_6_ = false;
		boolean bool_7_ = false;
		if (bool) {
			bool_6_ = method1134() != 0;
			bool_7_ = method1134() != 0;
		}
		final int i_8_ = i_5_ >> 1;
		int i_9_;
		int i_10_;
		int i_11_;
		if (bool && !bool_6_) {
			i_9_ = (i_5_ >> 2) - (anInt3889 >> 2);
			i_10_ = (i_5_ >> 2) + (anInt3889 >> 2);
			i_11_ = anInt3889 >> 1;
		} else {
			i_9_ = 0;
			i_10_ = i_8_;
			i_11_ = i_5_ >> 1;
		}
		int i_12_;
		int i_13_;
		int i_14_;
		if (bool && !bool_7_) {
			i_12_ = i_5_ - (i_5_ >> 2) - (anInt3889 >> 2);
			i_13_ = i_5_ - (i_5_ >> 2) + (anInt3889 >> 2);
			i_14_ = anInt3889 >> 1;
		} else {
			i_12_ = i_8_;
			i_13_ = i_5_;
			i_14_ = i_5_ >> 1;
		}
		final Class371 class371 = aClass371Array3902[anIntArray3906[i_4_]];
		final int i_15_ = class371.anInt3144;
		final int i_16_ = class371.anIntArray3142[i_15_];
		final boolean bool_17_ = !aClass56Array3901[i_16_].method510();
		final boolean bool_18_ = bool_17_;
		for (int i_19_ = 0; i_19_ < class371.anInt3141; i_19_++) {
			final Class311 class311 = (aClass311Array3894[class371.anIntArray3143[i_19_]]);
			final float[] fs = aFloatArray3882;
			class311.method3619(fs, i_5_ >> 1, bool_18_);
		}
		if (!bool_17_) {
			final int i_20_ = class371.anInt3144;
			final int i_21_ = class371.anIntArray3142[i_20_];
			aClass56Array3901[i_21_].method513(aFloatArray3882, i_5_ >> 1);
		}
		if (bool_17_) {
			for (int i_22_ = i_5_ >> 1; i_22_ < i_5_; i_22_++) {
				aFloatArray3882[i_22_] = 0.0F;
			}
		} else {
			final int i_23_ = i_5_ >> 1;
			final int i_24_ = i_5_ >> 2;
			final int i_25_ = i_5_ >> 3;
			final float[] fs = aFloatArray3882;
			for (int i_26_ = 0; i_26_ < i_23_; i_26_++) {
				fs[i_26_] *= 0.5F;
			}
			for (int i_27_ = i_23_; i_27_ < i_5_; i_27_++) {
				fs[i_27_] = -fs[i_5_ - i_27_ - 1];
			}
			final float[] fs_28_ = bool ? aFloatArray3883 : aFloatArray3886;
			final float[] fs_29_ = bool ? aFloatArray3888 : aFloatArray3899;
			final float[] fs_30_ = bool ? aFloatArray3887 : aFloatArray3907;
			final int[] is = bool ? anIntArray3891 : anIntArray3897;
			for (int i_31_ = 0; i_31_ < i_24_; i_31_++) {
				final float f = fs[4 * i_31_] - fs[i_5_ - 4 * i_31_ - 1];
				final float f_32_ = fs[4 * i_31_ + 2]
						- fs[i_5_ - 4 * i_31_ - 3];
				final float f_33_ = fs_28_[2 * i_31_];
				final float f_34_ = fs_28_[2 * i_31_ + 1];
				fs[i_5_ - 4 * i_31_ - 1] = f * f_33_ - f_32_ * f_34_;
				fs[i_5_ - 4 * i_31_ - 3] = f * f_34_ + f_32_ * f_33_;
			}
			for (int i_35_ = 0; i_35_ < i_25_; i_35_++) {
				final float f = fs[i_23_ + 3 + 4 * i_35_];
				final float f_36_ = fs[i_23_ + 1 + 4 * i_35_];
				final float f_37_ = fs[4 * i_35_ + 3];
				final float f_38_ = fs[4 * i_35_ + 1];
				fs[i_23_ + 3 + 4 * i_35_] = f + f_37_;
				fs[i_23_ + 1 + 4 * i_35_] = f_36_ + f_38_;
				final float f_39_ = fs_28_[i_23_ - 4 - 4 * i_35_];
				final float f_40_ = fs_28_[i_23_ - 3 - 4 * i_35_];
				fs[4 * i_35_ + 3] = (f - f_37_) * f_39_ - (f_36_ - f_38_)
						* f_40_;
				fs[4 * i_35_ + 1] = (f_36_ - f_38_) * f_39_ + (f - f_37_)
						* f_40_;
			}
			final int i_41_ = Class48_Sub2_Sub1.method474(i_5_ - 1, (byte) 31);
			for (int i_42_ = 0; i_42_ < i_41_ - 3; i_42_++) {
				final int i_43_ = i_5_ >> i_42_ + 2;
				final int i_44_ = 8 << i_42_;
				for (int i_45_ = 0; i_45_ < 2 << i_42_; i_45_++) {
					final int i_46_ = i_5_ - i_43_ * 2 * i_45_;
					final int i_47_ = i_5_ - i_43_ * (2 * i_45_ + 1);
					for (int i_48_ = 0; i_48_ < i_5_ >> i_42_ + 4; i_48_++) {
						final int i_49_ = 4 * i_48_;
						final float f = fs[i_46_ - 1 - i_49_];
						final float f_50_ = fs[i_46_ - 3 - i_49_];
						final float f_51_ = fs[i_47_ - 1 - i_49_];
						final float f_52_ = fs[i_47_ - 3 - i_49_];
						fs[i_46_ - 1 - i_49_] = f + f_51_;
						fs[i_46_ - 3 - i_49_] = f_50_ + f_52_;
						final float f_53_ = fs_28_[i_48_ * i_44_];
						final float f_54_ = fs_28_[i_48_ * i_44_ + 1];
						fs[i_47_ - 1 - i_49_] = (f - f_51_) * f_53_
								- (f_50_ - f_52_) * f_54_;
						fs[i_47_ - 3 - i_49_] = (f_50_ - f_52_) * f_53_
								+ (f - f_51_) * f_54_;
					}
				}
			}
			for (int i_55_ = 1; i_55_ < i_25_ - 1; i_55_++) {
				final int i_56_ = is[i_55_];
				if (i_55_ < i_56_) {
					final int i_57_ = 8 * i_55_;
					final int i_58_ = 8 * i_56_;
					float f = fs[i_57_ + 1];
					fs[i_57_ + 1] = fs[i_58_ + 1];
					fs[i_58_ + 1] = f;
					f = fs[i_57_ + 3];
					fs[i_57_ + 3] = fs[i_58_ + 3];
					fs[i_58_ + 3] = f;
					f = fs[i_57_ + 5];
					fs[i_57_ + 5] = fs[i_58_ + 5];
					fs[i_58_ + 5] = f;
					f = fs[i_57_ + 7];
					fs[i_57_ + 7] = fs[i_58_ + 7];
					fs[i_58_ + 7] = f;
				}
			}
			for (int i_59_ = 0; i_59_ < i_23_; i_59_++) {
				fs[i_59_] = fs[2 * i_59_ + 1];
			}
			for (int i_60_ = 0; i_60_ < i_25_; i_60_++) {
				fs[i_5_ - 1 - 2 * i_60_] = fs[4 * i_60_];
				fs[i_5_ - 2 - 2 * i_60_] = fs[4 * i_60_ + 1];
				fs[i_5_ - i_24_ - 1 - 2 * i_60_] = fs[4 * i_60_ + 2];
				fs[i_5_ - i_24_ - 2 - 2 * i_60_] = fs[4 * i_60_ + 3];
			}
			for (int i_61_ = 0; i_61_ < i_25_; i_61_++) {
				final float f = fs_30_[2 * i_61_];
				final float f_62_ = fs_30_[2 * i_61_ + 1];
				final float f_63_ = fs[i_23_ + 2 * i_61_];
				final float f_64_ = fs[i_23_ + 2 * i_61_ + 1];
				final float f_65_ = fs[i_5_ - 2 - 2 * i_61_];
				final float f_66_ = fs[i_5_ - 1 - 2 * i_61_];
				float f_67_ = f_62_ * (f_63_ - f_65_) + f * (f_64_ + f_66_);
				fs[i_23_ + 2 * i_61_] = (f_63_ + f_65_ + f_67_) * 0.5F;
				fs[i_5_ - 2 - 2 * i_61_] = (f_63_ + f_65_ - f_67_) * 0.5F;
				f_67_ = f_62_ * (f_64_ + f_66_) - f * (f_63_ - f_65_);
				fs[i_23_ + 2 * i_61_ + 1] = (f_64_ - f_66_ + f_67_) * 0.5F;
				fs[i_5_ - 1 - 2 * i_61_] = (-f_64_ + f_66_ + f_67_) * 0.5F;
			}
			for (int i_68_ = 0; i_68_ < i_24_; i_68_++) {
				fs[i_68_] = (fs[2 * i_68_ + i_23_] * fs_29_[2 * i_68_] + fs[2
						* i_68_ + 1 + i_23_]
						* fs_29_[2 * i_68_ + 1]);
				fs[i_23_ - 1 - i_68_] = (fs[2 * i_68_ + i_23_]
						* fs_29_[2 * i_68_ + 1] - fs[2 * i_68_ + 1 + i_23_]
						* fs_29_[2 * i_68_]);
			}
			for (int i_69_ = 0; i_69_ < i_24_; i_69_++) {
				fs[i_5_ - i_24_ + i_69_] = -fs[i_69_];
			}
			for (int i_70_ = 0; i_70_ < i_24_; i_70_++) {
				fs[i_70_] = fs[i_24_ + i_70_];
			}
			for (int i_71_ = 0; i_71_ < i_24_; i_71_++) {
				fs[i_24_ + i_71_] = -fs[i_24_ - i_71_ - 1];
			}
			for (int i_72_ = 0; i_72_ < i_24_; i_72_++) {
				fs[i_23_ + i_72_] = fs[i_5_ - i_72_ - 1];
			}
			for (int i_73_ = i_9_; i_73_ < i_10_; i_73_++) {
				final float f = (float) Math.sin((i_73_ - i_9_ + 0.5) / i_11_
						* 0.5 * 3.141592653589793);
				aFloatArray3882[i_73_] *= (float) Math.sin(1.5707963267948966
						* f * f);
			}
			for (int i_74_ = i_12_; i_74_ < i_13_; i_74_++) {
				final float f = (float) Math.sin(((i_74_ - i_12_ + 0.5) / i_14_
						* 0.5 * 3.141592653589793) + 1.5707963267948966);
				aFloatArray3882[i_74_] *= (float) Math.sin(1.5707963267948966
						* f * f);
			}
		}
		float[] fs = null;
		if (anInt3884 > 0) {
			final int i_75_ = anInt3884 + i_5_ >> 2;
			fs = new float[i_75_];
			if (!aBoolean3892) {
				for (int i_76_ = 0; i_76_ < anInt3909; i_76_++) {
					final int i_77_ = (anInt3884 >> 1) + i_76_;
					fs[i_76_] += aFloatArray3881[i_77_];
				}
			}
			if (!bool_17_) {
				for (int i_78_ = i_9_; i_78_ < i_5_ >> 1; i_78_++) {
					final int i_79_ = fs.length - (i_5_ >> 1) + i_78_;
					fs[i_79_] += aFloatArray3882[i_78_];
				}
			}
		}
		final float[] fs_80_ = aFloatArray3881;
		aFloatArray3881 = aFloatArray3882;
		aFloatArray3882 = fs_80_;
		anInt3884 = i_5_;
		anInt3909 = i_13_ - (i_5_ >> 1);
		aBoolean3892 = bool_17_;
		return fs;
	}

	public static void method1136() {
		aByteArray3908 = null;
		aClass71Array3885 = null;
		aClass56Array3901 = null;
		aClass311Array3894 = null;
		aClass371Array3902 = null;
		aBooleanArray3903 = null;
		anIntArray3906 = null;
		aFloatArray3882 = null;
		aFloatArray3886 = null;
		aFloatArray3899 = null;
		aFloatArray3907 = null;
		aFloatArray3883 = null;
		aFloatArray3888 = null;
		aFloatArray3887 = null;
		anIntArray3897 = null;
		anIntArray3891 = null;
	}

	static final Class98_Sub13 method1137(final Class207 class207, final int i) {
		if (!method1133(class207)) {
			class207.method2742(-88, i);
			return null;
		}
		final byte[] is = class207.method2733(i, 55);
		if (is == null) {
			return null;
		}
		return new Class98_Sub13(is);
	}

	static final int method1138(int i) {
		int i_81_ = 0;
		int i_82_ = 0;
		int i_83_;
		for (/**/; i >= 8 - anInt3895; i -= i_83_) {
			i_83_ = 8 - anInt3895;
			final int i_84_ = (1 << i_83_) - 1;
			i_81_ += (aByteArray3908[anInt3893] >> anInt3895 & i_84_) << i_82_;
			anInt3895 = 0;
			anInt3893++;
			i_82_ += i_83_;
		}
		if (i > 0) {
			i_83_ = (1 << i) - 1;
			i_81_ += (aByteArray3908[anInt3893] >> anInt3895 & i_83_) << i_82_;
			anInt3895 += i;
		}
		return i_81_;
	}

	static final float method1139(final int i) {
		int i_85_ = i & 0x1fffff;
		final int i_86_ = i & ~0x7fffffff;
		final int i_87_ = (i & 0x7fe00000) >> 21;
		if (i_86_ != 0) {
			i_85_ = -i_85_;
		}
		return (float) (i_85_ * Math.pow(2.0, i_87_ - 788));
	}

	static final Class98_Sub13 method1140(final Class207 class207, final int i,
			final int i_88_) {
		if (!method1133(class207)) {
			class207.method2751(i_88_, i, -6329);
			return null;
		}
		final byte[] is = class207.method2745(i_88_, i, false);
		if (is == null) {
			return null;
		}
		return new Class98_Sub13(is);
	}

	private static final void method1141(final byte[] is, final int i) {
		aByteArray3908 = is;
		anInt3893 = i;
		anInt3895 = 0;
	}

	private final void method1142(final byte[] is) {
		final ByteBuffer class98_sub22 = new ByteBuffer(is);
		anInt3880 = class98_sub22.readInt(-2);
		anInt3910 = class98_sub22.readInt(-2);
		anInt3896 = class98_sub22.readInt(-2);
		anInt3900 = class98_sub22.readInt(-2);
		if (anInt3900 < 0) {
			anInt3900 = anInt3900 ^ 0xffffffff;
			aBoolean3890 = true;
		}
		final int i = class98_sub22.readInt(-2);
		aByteArrayArray3898 = new byte[i][];
		for (int i_89_ = 0; i_89_ < i; i_89_++) {
			int i_90_ = 0;
			int i_91_;
			do {
				i_91_ = class98_sub22.readUnsignedByte((byte) -101);
				i_90_ += i_91_;
			} while (i_91_ >= 255);
			final byte[] is_92_ = new byte[i_90_];
			class98_sub22.method1190(is_92_, true, i_90_, 0);
			aByteArrayArray3898[i_89_] = is_92_;
		}
	}

	private static final void method1143(final byte[] is) {
		method1141(is, 0);
		anInt3889 = 1 << method1138(4);
		anInt3904 = 1 << method1138(4);
		aFloatArray3882 = new float[anInt3904];
		for (int i = 0; i < 2; i++) {
			final int i_93_ = i != 0 ? anInt3904 : anInt3889;
			final int i_94_ = i_93_ >> 1;
			final int i_95_ = i_93_ >> 2;
			final int i_96_ = i_93_ >> 3;
			final float[] fs = new float[i_94_];
			for (int i_97_ = 0; i_97_ < i_95_; i_97_++) {
				fs[2 * i_97_] = (float) Math.cos(4 * i_97_ * 3.141592653589793
						/ i_93_);
				fs[2 * i_97_ + 1] = -(float) Math.sin(4 * i_97_
						* 3.141592653589793 / i_93_);
			}
			final float[] fs_98_ = new float[i_94_];
			for (int i_99_ = 0; i_99_ < i_95_; i_99_++) {
				fs_98_[2 * i_99_] = (float) Math.cos((2 * i_99_ + 1)
						* 3.141592653589793 / (2 * i_93_));
				fs_98_[2 * i_99_ + 1] = (float) Math.sin((2 * i_99_ + 1)
						* 3.141592653589793 / (2 * i_93_));
			}
			final float[] fs_100_ = new float[i_95_];
			for (int i_101_ = 0; i_101_ < i_96_; i_101_++) {
				fs_100_[2 * i_101_] = (float) Math.cos((4 * i_101_ + 2)
						* 3.141592653589793 / i_93_);
				fs_100_[2 * i_101_ + 1] = -(float) Math.sin((4 * i_101_ + 2)
						* 3.141592653589793 / i_93_);
			}
			final int[] is_102_ = new int[i_96_];
			final int i_103_ = Class48_Sub2_Sub1
					.method474(i_96_ - 1, (byte) 31);
			for (int i_104_ = 0; i_104_ < i_96_; i_104_++) {
				is_102_[i_104_] = Applet_Sub1.method81(i_103_, (byte) -9,
						i_104_);
			}
			if (i != 0) {
				aFloatArray3883 = fs;
				aFloatArray3888 = fs_98_;
				aFloatArray3887 = fs_100_;
				anIntArray3891 = is_102_;
			} else {
				aFloatArray3886 = fs;
				aFloatArray3899 = fs_98_;
				aFloatArray3907 = fs_100_;
				anIntArray3897 = is_102_;
			}
		}
		final int i = method1138(8) + 1;
		aClass71Array3885 = new Class71[i];
		for (int i_105_ = 0; i_105_ < i; i_105_++) {
			aClass71Array3885[i_105_] = new Class71();
		}
		final int i_106_ = method1138(6) + 1;
		for (int i_107_ = 0; i_107_ < i_106_; i_107_++) {
			method1138(16);
		}
		final int i_108_ = method1138(6) + 1;
		aClass56Array3901 = new Class56[i_108_];
		for (int i_109_ = 0; i_109_ < i_108_; i_109_++) {
			aClass56Array3901[i_109_] = new Class56();
		}
		final int i_110_ = method1138(6) + 1;
		aClass311Array3894 = new Class311[i_110_];
		for (int i_111_ = 0; i_111_ < i_110_; i_111_++) {
			aClass311Array3894[i_111_] = new Class311();
		}
		final int i_112_ = method1138(6) + 1;
		aClass371Array3902 = new Class371[i_112_];
		for (int i_113_ = 0; i_113_ < i_112_; i_113_++) {
			aClass371Array3902[i_113_] = new Class371();
		}
		final int i_114_ = method1138(6) + 1;
		aBooleanArray3903 = new boolean[i_114_];
		anIntArray3906 = new int[i_114_];
		for (int i_115_ = 0; i_115_ < i_114_; i_115_++) {
			aBooleanArray3903[i_115_] = method1134() != 0;
			method1138(16);
			method1138(16);
			anIntArray3906[i_115_] = method1138(8);
		}
		aBoolean3905 = true;
	}

	private Class98_Sub13(final byte[] is) {
		method1142(is);
	}
}
