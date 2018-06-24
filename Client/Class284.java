/* Class284 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Frame;
import java.util.Random;

abstract class Class284 {
	int anInt2159;
	private int anInt2160 = 4;
	private final short[] aShortArray2161 = new short[512];
	static int anInt2162;
	private int anInt2163;
	private short[] aShortArray2164;
	private int anInt2165;
	private int anInt2166;
	static Class98_Sub4 aClass98_Sub4_2167;
	static Frame aFrame2168;

	abstract void method3354(int i);

	public static void method3355(final int i) {
		do {
			try {
				aFrame2168 = null;
				aClass98_Sub4_2167 = null;
				if (i == 15029) {
					break;
				}
				method3359(-38);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "rn.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	abstract void method3356(int i, int i_0_, int i_1_);

	private final void method3357(final byte i) {
		try {
			final Random random = new Random(anInt2163);
			for (int i_2_ = 0; i_2_ < 255; i_2_++) {
				aShortArray2161[i_2_] = (short) i_2_;
			}
			int i_3_ = 0;
			if (i != 116) {
				method3358(-94);
			}
			for (/**/; (i_3_ ^ 0xffffffff) > -256; i_3_++) {
				final int i_4_ = 255 - i_3_;
				final int i_5_ = Class63.method546(-28737, i_4_, random);
				final short i_6_ = aShortArray2161[i_5_];
				aShortArray2161[i_5_] = aShortArray2161[i_4_];
				aShortArray2161[i_4_] = aShortArray2161[i_4_ + 256] = i_6_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rn.F(" + i + ')');
		}
	}

	abstract void method3358(int i);

	static final void method3359(final int i) {
		try {
			for (int i_7_ = 0; i_7_ < 5; i_7_++) {
				Class217.aBooleanArray3410[i_7_] = false;
			}
			if (i != 9268) {
				aClass98_Sub4_2167 = null;
			}
			Class98_Sub4.anInt3828 = 0;
			Class98_Sub41.anInt4202 = 0;
			Class98_Sub46_Sub20_Sub2.anInt6319 = 1;
			Class368.anInt3128 = -1;
			Class116.anInt967 = Class64_Sub26.anInt3712 = -1;
			Class53_Sub1.anInt3636 = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rn.A(" + i + ')');
		}
	}

	private final void method3360(final int i) {
		try {
			aShortArray2164 = new short[anInt2159];
			if (i == 10567) {
				for (int i_8_ = 0; i_8_ < anInt2159; i_8_++) {
					aShortArray2164[i_8_] = (short) (int) Math.pow(2.0, i_8_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rn.I(" + i + ')');
		}
	}

	final void method3361(final byte i, final int i_9_, final int i_10_,
			final int i_11_) {
		try {
			final int[] is = new int[i_9_];
			final int[] is_12_ = new int[i_10_];
			for (int i_13_ = 0; (i_9_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
				is[i_13_] = (i_13_ << -1065786996) / i_9_;
			}
			final int[] is_14_ = new int[i_11_];
			if (i >= 0) {
				aFrame2168 = null;
			}
			for (int i_15_ = 0; i_15_ < i_10_; i_15_++) {
				is_12_[i_15_] = (i_15_ << 786345612) / i_10_;
			}
			for (int i_16_ = 0; (i_11_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
				is_14_[i_16_] = (i_16_ << -258200020) / i_11_;
			}
			method3354(751943489);
			for (int i_17_ = 0; i_17_ < i_11_; i_17_++) {
				for (int i_18_ = 0; i_10_ > i_18_; i_18_++) {
					for (int i_19_ = 0; i_19_ < i_9_; i_19_++) {
						for (int i_20_ = 0; i_20_ < anInt2159; i_20_++) {
							final int i_21_ = aShortArray2164[i_20_] << 705054604;
							final int i_22_ = i_21_ * anInt2165 >> 486926636;
							final int i_23_ = i_21_ * anInt2160 >> 627216364;
							final int i_24_ = anInt2166 * i_21_ >> 1211593132;
							int i_25_ = i_21_ * is_14_[i_17_] >> 192686284;
							int i_26_ = is_12_[i_18_] * i_21_ >> -1320253108;
							int i_27_ = is[i_19_] * i_21_ >> 865773868;
							i_25_ *= anInt2166;
							i_27_ *= anInt2165;
							i_26_ *= anInt2160;
							int i_28_ = i_27_ >> -2083454548;
							int i_29_ = 1 + i_28_;
							i_28_ &= 0xff;
							int i_30_ = i_26_ >> -833753588;
							int i_31_ = 1 + i_30_;
							i_30_ &= 0xff;
							int i_32_ = i_25_ >> -1617570836;
							int i_33_ = i_32_ + 1;
							i_32_ &= 0xff;
							i_27_ &= 0xfff;
							if ((i_31_ ^ 0xffffffff) > (i_23_ ^ 0xffffffff)) {
								i_31_ &= 0xff;
							} else {
								i_31_ = 0;
							}
							if ((i_24_ ^ 0xffffffff) >= (i_33_ ^ 0xffffffff)) {
								i_33_ = 0;
							} else {
								i_33_ &= 0xff;
							}
							i_25_ &= 0xfff;
							i_26_ &= 0xfff;
							if ((i_22_ ^ 0xffffffff) >= (i_29_ ^ 0xffffffff)) {
								i_29_ = 0;
							} else {
								i_29_ &= 0xff;
							}
							final int i_34_ = aShortArray2161[i_33_];
							final int i_35_ = aShortArray2161[i_32_];
							final int i_36_ = Class151_Sub8.anIntArray5014[i_25_];
							final int i_37_ = Class151_Sub8.anIntArray5014[i_26_];
							final int i_38_ = -4096 + i_27_;
							final int i_39_ = -4096 + i_26_;
							final int i_40_ = i_25_ - 4096;
							final int i_41_ = Class151_Sub8.anIntArray5014[i_27_];
							final int i_42_ = aShortArray2161[i_34_ + i_30_];
							final int i_43_ = aShortArray2161[i_30_ + i_35_];
							final int i_44_ = aShortArray2161[i_35_ + i_31_];
							final int i_45_ = aShortArray2161[i_34_ + i_31_];
							int i_46_ = Class105
									.method1717(i_25_, i_26_, i_27_,
											(aShortArray2161[i_43_ + i_28_]),
											-5);
							int i_47_ = Class105.method1717(i_25_, i_26_,
									i_38_, (aShortArray2161[i_29_ - -i_43_]),
									-5);
							int i_48_ = ((i_41_ * (i_47_ - i_46_) >> -2081855316) + i_46_);
							i_46_ = Class105.method1717(i_25_, i_39_, i_27_,
									(aShortArray2161[i_28_ - -i_44_]), -5);
							i_47_ = Class105.method1717(i_25_, i_39_, i_38_,
									(aShortArray2161[i_29_ + i_44_]), -5);
							int i_49_ = (((i_47_ + -i_46_) * i_41_ >> -2138527092) + i_46_);
							i_46_ = Class105.method1717(i_40_, i_26_, i_27_,
									(aShortArray2161[i_42_ + i_28_]), -5);
							final int i_50_ = i_48_
									- -(i_37_ * (i_49_ - i_48_) >> 404369900);
							i_47_ = Class105.method1717(i_40_, i_26_, i_38_,
									(aShortArray2161[i_42_ + i_29_]), -5);
							i_48_ = (((i_47_ + -i_46_) * i_41_ >> 409714956) + i_46_);
							i_46_ = Class105.method1717(i_40_, i_39_, i_27_,
									(aShortArray2161[i_45_ + i_28_]), -5);
							i_47_ = Class105.method1717(i_40_, i_39_, i_38_,
									(aShortArray2161[i_29_ - -i_45_]), -5);
							i_49_ = i_46_
									+ (i_41_ * (i_47_ + -i_46_) >> -369561460);
							final int i_51_ = ((i_37_ * (-i_48_ + i_49_) >> 547048108) + i_48_);
							method3356(
									i_20_,
									i_50_
											- -((i_51_ + -i_50_) * i_36_ >> -612835924),
									255);
						}
						method3358(0);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rn.E(" + i + ','
					+ i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	static final void method3362(final int i, final int i_52_, final int i_53_,
			final byte i_54_, final int i_55_, final int i_56_) {
		try {
			int i_57_ = 0;
			int i_58_ = i_56_;
			final int i_59_ = i_52_ * i_52_;
			final int i_60_ = i_56_ * i_56_;
			final int i_62_ = i_60_ << -551098815;
			final int i_63_ = i_59_ << -2118941983;
			final int i_64_ = i_56_ << -1268930943;
			int i_65_ = i_59_ * (1 - i_64_) - -i_62_;
			int i_66_ = -(i_63_ * (i_64_ + -1)) + i_60_;
			final int i_67_ = i_59_ << 641021474;
			final int i_68_ = i_60_ << -578970494;
			int i_69_ = i_62_ * (3 + (i_57_ << -629209375));
			int i_70_ = i_63_ * ((i_58_ << 751943489) + -3);
			int i_71_ = i_68_ * (1 + i_57_);
			Class333.method3761(i_53_,
					AnimationDefinition.anIntArrayArray814[i], -i_52_ + i_55_,
					i_55_ + i_52_, (byte) 99);
			int i_72_ = i_67_ * (-1 + i_58_);
			while (i_58_ > 0) {
				if ((i_65_ ^ 0xffffffff) > -1) {
					while (i_65_ < 0) {
						i_65_ += i_69_;
						i_66_ += i_71_;
						i_57_++;
						i_71_ += i_68_;
						i_69_ += i_68_;
					}
				}
				if (i_66_ < 0) {
					i_66_ += i_71_;
					i_65_ += i_69_;
					i_69_ += i_68_;
					i_57_++;
					i_71_ += i_68_;
				}
				i_65_ += -i_72_;
				i_66_ += -i_70_;
				i_70_ -= i_67_;
				i_58_--;
				i_72_ -= i_67_;
				final int i_73_ = -i_58_ + i;
				final int i_74_ = i_58_ + i;
				final int i_75_ = i_55_ - -i_57_;
				final int i_76_ = i_55_ - i_57_;
				Class333.method3761(i_53_,
						AnimationDefinition.anIntArrayArray814[i_73_], i_76_,
						i_75_, (byte) -127);
				Class333.method3761(i_53_,
						AnimationDefinition.anIntArrayArray814[i_74_], i_76_,
						i_75_, (byte) -124);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rn.B(" + i + ','
					+ i_52_ + ',' + i_53_ + ',' + i_54_ + ',' + i_55_ + ','
					+ i_56_ + ')'));
		}
	}

	Class284(final int i, final int i_77_, final int i_78_, final int i_79_,
			final int i_80_) {
		anInt2159 = 4;
		anInt2165 = 4;
		anInt2163 = 0;
		anInt2166 = 4;
		try {
			anInt2160 = i_79_;
			anInt2166 = i_80_;
			anInt2165 = i_78_;
			anInt2159 = i_77_;
			anInt2163 = i;
			method3360(10567);
			method3357((byte) 116);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("rn.<init>(" + i + ',' + i_77_ + ',' + i_78_ + ',' + i_79_
							+ ',' + i_80_ + ')'));
		}
	}
}
