/* Class146_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class146_Sub1 extends Class146 {
	private int[] anIntArray4747;
	private int[] verticesX;
	private int[] anIntArray4749;
	private short[] triangleViewspaceY;
	private int[] anIntArray4751;
	private Class235 aClass235_4752;
	private short aShort4753;
	private boolean aBoolean4754;
	private boolean aBoolean4755 = false;
	private Class146_Sub1 aClass146_Sub1_4756;
	private int anInt4757;
	private int[] anIntArray4758;
	private Class146_Sub1 aClass146_Sub1_4759;
	private int[] anIntArray4760;
	private int anInt4761;
	private int[] verticesZ;
	private int[] anIntArray4763;
	private Class146_Sub1 aClass146_Sub1_4764;
	private boolean aBoolean4765;
	private int[] anIntArray4766;
	private int[] anIntArray4767;
	private Class12 aClass12_4768;
	private Class146_Sub1 aClass146_Sub1_4769;
	private short aShort4770;
	private int[] anIntArray4771;
	private byte[] aByteArray4772;
	private Class146_Sub1 aClass146_Sub1_4773;
	private short aShort4774;
	private Class146_Sub1 aClass146_Sub1_4775;
	private int anInt4776;
	private Class274[] aClass274Array4777;
	private boolean aBoolean4778;
	private Class146_Sub1 aClass146_Sub1_4779;
	private int anInt4780 = 0;
	private int anInt4781;
	private short[] triangleViewspaceX;
	private Class146_Sub1 aClass146_Sub1_4783;
	private int anInt4784;
	private Class146_Sub1 aClass146_Sub1_4785;
	private int anInt4786;
	private SurfaceSkin[] aClass35Array4787;
	private int[] verticesY;
	private Class274[] aClass274Array4789;
	private short[] aShortArray4790;
	private int[] anIntArray4791;
	private int anInt4792;
	private byte[] aByteArray4793;
	private short aShort4794;
	private short[] aShortArray4795;
	private int[][] anIntArrayArray4796;
	private final ha_Sub2 aHa_Sub2_4797;
	private float[][] aFloatArrayArray4798;
	private boolean aBoolean4799;
	private short[] aShortArray4800;
	private short aShort4801;
	private boolean aBoolean4802 = false;
	private int[] anIntArray4803;
	private short[] aShortArray4804;
	private int anInt4805;
	private float[][] aFloatArrayArray4806;
	private Class235 aClass235_4807;
	private short aShort4808;
	private short[] aShortArray4809;
	static int anInt4810;
	private int[] anIntArray4811;
	private int[] anIntArray4812;
	private Surface[] aClass87Array4813;
	private int anInt4814;
	private boolean aBoolean4815;
	private int anInt4816;
	private int[] anIntArray4817;
	private int[] anIntArray4818;
	private Class111_Sub2 aClass111_Sub2_4819;
	private int[] anIntArray4820;
	private Class329[] aClass329Array4821;
	private byte[] aByteArray4822;
	private Class296[] aClass296Array4823;
	private int[] anIntArray4824;
	static int anInt4825;
	private short aShort4826;
	private Class170[] aClass170Array4827;
	private int[] anIntArray4828;
	private int[] anIntArray4829;
	private static int anInt4830 = 0;
	private Class146_Sub1 aClass146_Sub1_4831;
	private short[] triangleViewspaceZ;
	private int[][] anIntArrayArray4833;
	private int[][] anIntArrayArray4834;
	private short aShort4835;
	private int[] anIntArray4836;

	private final void method2346() {
		if (!aBoolean4778) {
			int i = 0;
			int i_0_ = 0;
			int i_1_ = 32767;
			int i_2_ = 32767;
			int i_3_ = 32767;
			int i_4_ = -32768;
			int i_5_ = -32768;
			int i_6_ = -32768;
			for (int i_7_ = 0; i_7_ < anInt4814; i_7_++) {
				final int i_8_ = verticesX[i_7_];
				final int i_9_ = verticesY[i_7_];
				final int i_10_ = verticesZ[i_7_];
				if (i_8_ < i_1_) {
					i_1_ = i_8_;
				}
				if (i_8_ > i_4_) {
					i_4_ = i_8_;
				}
				if (i_9_ < i_2_) {
					i_2_ = i_9_;
				}
				if (i_9_ > i_5_) {
					i_5_ = i_9_;
				}
				if (i_10_ < i_3_) {
					i_3_ = i_10_;
				}
				if (i_10_ > i_6_) {
					i_6_ = i_10_;
				}
				int i_11_ = i_8_ * i_8_ + i_10_ * i_10_;
				if (i_11_ > i) {
					i = i_11_;
				}
				i_11_ += i_9_ * i_9_;
				if (i_11_ > i_0_) {
					i_0_ = i_11_;
				}
			}
			aShort4794 = (short) i_1_;
			aShort4801 = (short) i_4_;
			aShort4770 = (short) i_2_;
			aShort4808 = (short) i_5_;
			aShort4774 = (short) i_3_;
			aShort4753 = (short) i_6_;
			aShort4835 = (short) (int) (Math.sqrt(i) + 0.99);
			aShort4826 = (short) (int) (Math.sqrt(i_0_) + 0.99);
			aBoolean4778 = true;
		}
	}

	@Override
	final void method2337(final int i, final int i_12_, final int i_13_,
			final int i_14_) {
		if ((anInt4816 & 0x80000) != 524288) {
			throw new IllegalStateException("FMT");
		}
		for (int i_15_ = 0; i_15_ < anInt4780; i_15_++) {
			final int i_16_ = aShortArray4800[i_15_] & 0xffff;
			int i_17_ = i_16_ >> 10 & 0x3f;
			int i_18_ = i_16_ >> 7 & 0x7;
			int i_19_ = i_16_ & 0x7f;
			if (i != -1) {
				i_17_ += (i - i_17_) * i_14_ >> 7;
			}
			if (i_12_ != -1) {
				i_18_ += (i_12_ - i_18_) * i_14_ >> 7;
			}
			if (i_13_ != -1) {
				i_19_ += (i_13_ - i_19_) * i_14_ >> 7;
			}
			aShortArray4800[i_15_] = (short) (i_17_ << 10 | i_18_ << 7 | i_19_);
		}
		if (aClass170Array4827 != null) {
			for (int i_20_ = 0; i_20_ < anInt4776; i_20_++) {
				final Class170 class170 = aClass170Array4827[i_20_];
				final Class329 class329 = aClass329Array4821[i_20_];
				class329.anInt2770 = (class329.anInt2770 & ~0xffffff | (Class221.anIntArray1665[Class111_Sub2
						.method2117(
								(aShortArray4800[(class170.anInt1315)]) & 0xffff,
								72)]) & 0xffffff);
			}
		}
		if (anInt4784 == 2) {
			anInt4784 = 1;
		}
	}

	@Override
	final void I(final int i, final int[] is, int i_21_, int i_22_, int i_23_,
			final boolean bool, final int i_24_, final int[] is_25_) {
		final int i_26_ = is.length;
		if (i == 0) {
			i_21_ <<= 4;
			i_22_ <<= 4;
			i_23_ <<= 4;
			if (!aBoolean4815) {
				for (int i_27_ = 0; i_27_ < anInt4786; i_27_++) {
					verticesX[i_27_] <<= 4;
					verticesY[i_27_] <<= 4;
					verticesZ[i_27_] <<= 4;
				}
				aBoolean4815 = true;
			}
			int i_28_ = 0;
			anInt4792 = 0;
			anInt4781 = 0;
			anInt4757 = 0;
			for (int i_29_ = 0; i_29_ < i_26_; i_29_++) {
				final int i_30_ = is[i_29_];
				if (i_30_ < anIntArrayArray4834.length) {
					final int[] is_31_ = anIntArrayArray4834[i_30_];
					for (int i_32_ = 0; i_32_ < is_31_.length; i_32_++) {
						final int i_33_ = is_31_[i_32_];
						if (aShortArray4790 == null
								|| (i_24_ & aShortArray4790[i_33_]) != 0) {
							anInt4792 += verticesX[i_33_];
							anInt4781 += verticesY[i_33_];
							anInt4757 += verticesZ[i_33_];
							i_28_++;
						}
					}
				}
			}
			if (i_28_ > 0) {
				anInt4792 = anInt4792 / i_28_ + i_21_;
				anInt4781 = anInt4781 / i_28_ + i_22_;
				anInt4757 = anInt4757 / i_28_ + i_23_;
				aBoolean4799 = true;
			} else {
				anInt4792 = i_21_;
				anInt4781 = i_22_;
				anInt4757 = i_23_;
			}
		} else if (i == 1) {
			if (is_25_ != null) {
				final int i_34_ = ((is_25_[0] * i_21_ + is_25_[1] * i_22_
						+ is_25_[2] * i_23_ + 8192) >> 14);
				final int i_35_ = ((is_25_[3] * i_21_ + is_25_[4] * i_22_
						+ is_25_[5] * i_23_ + 8192) >> 14);
				final int i_36_ = ((is_25_[6] * i_21_ + is_25_[7] * i_22_
						+ is_25_[8] * i_23_ + 8192) >> 14);
				i_21_ = i_34_;
				i_22_ = i_35_;
				i_23_ = i_36_;
			}
			i_21_ <<= 4;
			i_22_ <<= 4;
			i_23_ <<= 4;
			if (!aBoolean4815) {
				for (int i_37_ = 0; i_37_ < anInt4786; i_37_++) {
					verticesX[i_37_] <<= 4;
					verticesY[i_37_] <<= 4;
					verticesZ[i_37_] <<= 4;
				}
				aBoolean4815 = true;
			}
			for (int i_38_ = 0; i_38_ < i_26_; i_38_++) {
				final int i_39_ = is[i_38_];
				if (i_39_ < anIntArrayArray4834.length) {
					final int[] is_40_ = anIntArrayArray4834[i_39_];
					for (int i_41_ = 0; i_41_ < is_40_.length; i_41_++) {
						final int i_42_ = is_40_[i_41_];
						if (aShortArray4790 == null
								|| (i_24_ & aShortArray4790[i_42_]) != 0) {
							verticesX[i_42_] += i_21_;
							verticesY[i_42_] += i_22_;
							verticesZ[i_42_] += i_23_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_25_ != null) {
				if (!aBoolean4815) {
					for (int i_43_ = 0; i_43_ < anInt4786; i_43_++) {
						verticesX[i_43_] <<= 4;
						verticesY[i_43_] <<= 4;
						verticesZ[i_43_] <<= 4;
					}
					aBoolean4815 = true;
				}
				final int i_44_ = is_25_[9] << 4;
				final int i_45_ = is_25_[10] << 4;
				final int i_46_ = is_25_[11] << 4;
				final int i_47_ = is_25_[12] << 4;
				final int i_48_ = is_25_[13] << 4;
				final int i_49_ = is_25_[14] << 4;
				if (aBoolean4799) {
					int i_50_ = ((is_25_[0] * anInt4792 + is_25_[3] * anInt4781
							+ is_25_[6] * anInt4757 + 8192) >> 14);
					int i_51_ = ((is_25_[1] * anInt4792 + is_25_[4] * anInt4781
							+ is_25_[7] * anInt4757 + 8192) >> 14);
					int i_52_ = ((is_25_[2] * anInt4792 + is_25_[5] * anInt4781
							+ is_25_[8] * anInt4757 + 8192) >> 14);
					i_50_ += i_47_;
					i_51_ += i_48_;
					i_52_ += i_49_;
					anInt4792 = i_50_;
					anInt4781 = i_51_;
					anInt4757 = i_52_;
					aBoolean4799 = false;
				}
				final int[] is_53_ = new int[9];
				final int i_54_ = Class284_Sub2_Sub2.anIntArray6202[i_21_];
				final int i_55_ = Class284_Sub2_Sub2.anIntArray6200[i_21_];
				final int i_56_ = Class284_Sub2_Sub2.anIntArray6202[i_22_];
				final int i_57_ = Class284_Sub2_Sub2.anIntArray6200[i_22_];
				final int i_58_ = Class284_Sub2_Sub2.anIntArray6202[i_23_];
				final int i_59_ = Class284_Sub2_Sub2.anIntArray6200[i_23_];
				final int i_60_ = i_55_ * i_58_ + 8192 >> 14;
				final int i_61_ = i_55_ * i_59_ + 8192 >> 14;
				is_53_[0] = i_56_ * i_58_ + i_57_ * i_61_ + 8192 >> 14;
				is_53_[1] = -i_56_ * i_59_ + i_57_ * i_60_ + 8192 >> 14;
				is_53_[2] = i_57_ * i_54_ + 8192 >> 14;
				is_53_[3] = i_54_ * i_59_ + 8192 >> 14;
				is_53_[4] = i_54_ * i_58_ + 8192 >> 14;
				is_53_[5] = -i_55_;
				is_53_[6] = -i_57_ * i_58_ + i_56_ * i_61_ + 8192 >> 14;
				is_53_[7] = i_57_ * i_59_ + i_56_ * i_60_ + 8192 >> 14;
				is_53_[8] = i_56_ * i_54_ + 8192 >> 14;
				final int i_62_ = ((is_53_[0] * -anInt4792 + is_53_[1]
						* -anInt4781 + is_53_[2] * -anInt4757 + 8192) >> 14);
				final int i_63_ = ((is_53_[3] * -anInt4792 + is_53_[4]
						* -anInt4781 + is_53_[5] * -anInt4757 + 8192) >> 14);
				final int i_64_ = ((is_53_[6] * -anInt4792 + is_53_[7]
						* -anInt4781 + is_53_[8] * -anInt4757 + 8192) >> 14);
				final int i_65_ = i_62_ + anInt4792;
				final int i_66_ = i_63_ + anInt4781;
				final int i_67_ = i_64_ + anInt4757;
				final int[] is_68_ = new int[9];
				for (int i_69_ = 0; i_69_ < 3; i_69_++) {
					for (int i_70_ = 0; i_70_ < 3; i_70_++) {
						int i_71_ = 0;
						for (int i_72_ = 0; i_72_ < 3; i_72_++) {
							i_71_ += (is_53_[i_69_ * 3 + i_72_] * is_25_[i_70_
									* 3 + i_72_]);
						}
						is_68_[i_69_ * 3 + i_70_] = i_71_ + 8192 >> 14;
					}
				}
				int i_73_ = ((is_53_[0] * i_47_ + is_53_[1] * i_48_ + is_53_[2]
						* i_49_ + 8192) >> 14);
				int i_74_ = ((is_53_[3] * i_47_ + is_53_[4] * i_48_ + is_53_[5]
						* i_49_ + 8192) >> 14);
				int i_75_ = ((is_53_[6] * i_47_ + is_53_[7] * i_48_ + is_53_[8]
						* i_49_ + 8192) >> 14);
				i_73_ += i_65_;
				i_74_ += i_66_;
				i_75_ += i_67_;
				final int[] is_76_ = new int[9];
				for (int i_77_ = 0; i_77_ < 3; i_77_++) {
					for (int i_78_ = 0; i_78_ < 3; i_78_++) {
						int i_79_ = 0;
						for (int i_80_ = 0; i_80_ < 3; i_80_++) {
							i_79_ += (is_25_[i_77_ * 3 + i_80_] * is_68_[i_78_
									+ i_80_ * 3]);
						}
						is_76_[i_77_ * 3 + i_78_] = i_79_ + 8192 >> 14;
					}
				}
				int i_81_ = ((is_25_[0] * i_73_ + is_25_[1] * i_74_ + is_25_[2]
						* i_75_ + 8192) >> 14);
				int i_82_ = ((is_25_[3] * i_73_ + is_25_[4] * i_74_ + is_25_[5]
						* i_75_ + 8192) >> 14);
				int i_83_ = ((is_25_[6] * i_73_ + is_25_[7] * i_74_ + is_25_[8]
						* i_75_ + 8192) >> 14);
				i_81_ += i_44_;
				i_82_ += i_45_;
				i_83_ += i_46_;
				for (int i_84_ = 0; i_84_ < i_26_; i_84_++) {
					final int i_85_ = is[i_84_];
					if (i_85_ < anIntArrayArray4834.length) {
						final int[] is_86_ = anIntArrayArray4834[i_85_];
						for (int i_87_ = 0; i_87_ < is_86_.length; i_87_++) {
							final int i_88_ = is_86_[i_87_];
							if (aShortArray4790 == null
									|| (i_24_ & aShortArray4790[i_88_]) != 0) {
								int i_89_ = ((is_76_[0] * verticesX[i_88_]
										+ is_76_[1] * verticesY[i_88_]
										+ is_76_[2] * verticesZ[i_88_] + 8192) >> 14);
								int i_90_ = ((is_76_[3] * verticesX[i_88_]
										+ is_76_[4] * verticesY[i_88_]
										+ is_76_[5] * verticesZ[i_88_] + 8192) >> 14);
								int i_91_ = ((is_76_[6] * verticesX[i_88_]
										+ is_76_[7] * verticesY[i_88_]
										+ is_76_[8] * verticesZ[i_88_] + 8192) >> 14);
								i_89_ += i_81_;
								i_90_ += i_82_;
								i_91_ += i_83_;
								verticesX[i_88_] = i_89_;
								verticesY[i_88_] = i_90_;
								verticesZ[i_88_] = i_91_;
							}
						}
					}
				}
			} else {
				for (int i_92_ = 0; i_92_ < i_26_; i_92_++) {
					final int i_93_ = is[i_92_];
					if (i_93_ < anIntArrayArray4834.length) {
						final int[] is_94_ = anIntArrayArray4834[i_93_];
						for (int i_95_ = 0; i_95_ < is_94_.length; i_95_++) {
							final int i_96_ = is_94_[i_95_];
							if (aShortArray4790 == null
									|| (i_24_ & aShortArray4790[i_96_]) != 0) {
								verticesX[i_96_] -= anInt4792;
								verticesY[i_96_] -= anInt4781;
								verticesZ[i_96_] -= anInt4757;
								if (i_23_ != 0) {
									final int i_97_ = (Class284_Sub2_Sub2.anIntArray6200[i_23_]);
									final int i_98_ = (Class284_Sub2_Sub2.anIntArray6202[i_23_]);
									final int i_99_ = ((verticesY[i_96_]
											* i_97_ + verticesX[i_96_]
											* i_98_ + 16383) >> 14);
									verticesY[i_96_] = (verticesY[i_96_]
											* i_98_
											- verticesX[i_96_]
											* i_97_ + 16383) >> 14;
									verticesX[i_96_] = i_99_;
								}
								if (i_21_ != 0) {
									final int i_100_ = (Class284_Sub2_Sub2.anIntArray6200[i_21_]);
									final int i_101_ = (Class284_Sub2_Sub2.anIntArray6202[i_21_]);
									final int i_102_ = ((verticesY[i_96_]
											* i_101_ - verticesZ[i_96_]
											* i_100_ + 16383) >> 14);
									verticesZ[i_96_] = (verticesY[i_96_]
											* i_100_
											+ verticesZ[i_96_]
											* i_101_ + 16383) >> 14;
									verticesY[i_96_] = i_102_;
								}
								if (i_22_ != 0) {
									final int i_103_ = (Class284_Sub2_Sub2.anIntArray6200[i_22_]);
									final int i_104_ = (Class284_Sub2_Sub2.anIntArray6202[i_22_]);
									final int i_105_ = ((verticesZ[i_96_]
											* i_103_ + verticesX[i_96_]
											* i_104_ + 16383) >> 14);
									verticesZ[i_96_] = (verticesZ[i_96_]
											* i_104_
											- verticesX[i_96_]
											* i_103_ + 16383) >> 14;
									verticesX[i_96_] = i_105_;
								}
								verticesX[i_96_] += anInt4792;
								verticesY[i_96_] += anInt4781;
								verticesZ[i_96_] += anInt4757;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_25_ != null) {
				if (!aBoolean4815) {
					for (int i_106_ = 0; i_106_ < anInt4786; i_106_++) {
						verticesX[i_106_] <<= 4;
						verticesY[i_106_] <<= 4;
						verticesZ[i_106_] <<= 4;
					}
					aBoolean4815 = true;
				}
				final int i_107_ = is_25_[9] << 4;
				final int i_108_ = is_25_[10] << 4;
				final int i_109_ = is_25_[11] << 4;
				final int i_110_ = is_25_[12] << 4;
				final int i_111_ = is_25_[13] << 4;
				final int i_112_ = is_25_[14] << 4;
				if (aBoolean4799) {
					int i_113_ = (is_25_[0] * anInt4792 + is_25_[3] * anInt4781
							+ is_25_[6] * anInt4757 + 8192) >> 14;
					int i_114_ = (is_25_[1] * anInt4792 + is_25_[4] * anInt4781
							+ is_25_[7] * anInt4757 + 8192) >> 14;
					int i_115_ = (is_25_[2] * anInt4792 + is_25_[5] * anInt4781
							+ is_25_[8] * anInt4757 + 8192) >> 14;
					i_113_ += i_110_;
					i_114_ += i_111_;
					i_115_ += i_112_;
					anInt4792 = i_113_;
					anInt4781 = i_114_;
					anInt4757 = i_115_;
					aBoolean4799 = false;
				}
				final int i_116_ = i_21_ << 15 >> 7;
				final int i_117_ = i_22_ << 15 >> 7;
				final int i_118_ = i_23_ << 15 >> 7;
				final int i_119_ = i_116_ * -anInt4792 + 8192 >> 14;
				final int i_120_ = i_117_ * -anInt4781 + 8192 >> 14;
				final int i_121_ = i_118_ * -anInt4757 + 8192 >> 14;
				final int i_122_ = i_119_ + anInt4792;
				final int i_123_ = i_120_ + anInt4781;
				final int i_124_ = i_121_ + anInt4757;
				final int[] is_125_ = new int[9];
				is_125_[0] = i_116_ * is_25_[0] + 8192 >> 14;
				is_125_[1] = i_116_ * is_25_[3] + 8192 >> 14;
				is_125_[2] = i_116_ * is_25_[6] + 8192 >> 14;
				is_125_[3] = i_117_ * is_25_[1] + 8192 >> 14;
				is_125_[4] = i_117_ * is_25_[4] + 8192 >> 14;
				is_125_[5] = i_117_ * is_25_[7] + 8192 >> 14;
				is_125_[6] = i_118_ * is_25_[2] + 8192 >> 14;
				is_125_[7] = i_118_ * is_25_[5] + 8192 >> 14;
				is_125_[8] = i_118_ * is_25_[8] + 8192 >> 14;
				int i_126_ = i_116_ * i_110_ + 8192 >> 14;
				int i_127_ = i_117_ * i_111_ + 8192 >> 14;
				int i_128_ = i_118_ * i_112_ + 8192 >> 14;
				i_126_ += i_122_;
				i_127_ += i_123_;
				i_128_ += i_124_;
				final int[] is_129_ = new int[9];
				for (int i_130_ = 0; i_130_ < 3; i_130_++) {
					for (int i_131_ = 0; i_131_ < 3; i_131_++) {
						int i_132_ = 0;
						for (int i_133_ = 0; i_133_ < 3; i_133_++) {
							i_132_ += (is_25_[i_130_ * 3 + i_133_] * is_125_[i_131_
									+ i_133_ * 3]);
						}
						is_129_[i_130_ * 3 + i_131_] = i_132_ + 8192 >> 14;
					}
				}
				int i_134_ = ((is_25_[0] * i_126_ + is_25_[1] * i_127_
						+ is_25_[2] * i_128_ + 8192) >> 14);
				int i_135_ = ((is_25_[3] * i_126_ + is_25_[4] * i_127_
						+ is_25_[5] * i_128_ + 8192) >> 14);
				int i_136_ = ((is_25_[6] * i_126_ + is_25_[7] * i_127_
						+ is_25_[8] * i_128_ + 8192) >> 14);
				i_134_ += i_107_;
				i_135_ += i_108_;
				i_136_ += i_109_;
				for (int i_137_ = 0; i_137_ < i_26_; i_137_++) {
					final int i_138_ = is[i_137_];
					if (i_138_ < anIntArrayArray4834.length) {
						final int[] is_139_ = anIntArrayArray4834[i_138_];
						for (int i_140_ = 0; i_140_ < is_139_.length; i_140_++) {
							final int i_141_ = is_139_[i_140_];
							if (aShortArray4790 == null
									|| (i_24_ & aShortArray4790[i_141_]) != 0) {
								int i_142_ = ((is_129_[0]
										* verticesX[i_141_] + is_129_[1]
										* verticesY[i_141_] + is_129_[2]
										* verticesZ[i_141_] + 8192) >> 14);
								int i_143_ = ((is_129_[3]
										* verticesX[i_141_] + is_129_[4]
										* verticesY[i_141_] + is_129_[5]
										* verticesZ[i_141_] + 8192) >> 14);
								int i_144_ = ((is_129_[6]
										* verticesX[i_141_] + is_129_[7]
										* verticesY[i_141_] + is_129_[8]
										* verticesZ[i_141_] + 8192) >> 14);
								i_142_ += i_134_;
								i_143_ += i_135_;
								i_144_ += i_136_;
								verticesX[i_141_] = i_142_;
								verticesY[i_141_] = i_143_;
								verticesZ[i_141_] = i_144_;
							}
						}
					}
				}
			} else {
				for (int i_145_ = 0; i_145_ < i_26_; i_145_++) {
					final int i_146_ = is[i_145_];
					if (i_146_ < anIntArrayArray4834.length) {
						final int[] is_147_ = anIntArrayArray4834[i_146_];
						for (int i_148_ = 0; i_148_ < is_147_.length; i_148_++) {
							final int i_149_ = is_147_[i_148_];
							if (aShortArray4790 == null
									|| (i_24_ & aShortArray4790[i_149_]) != 0) {
								verticesX[i_149_] -= anInt4792;
								verticesY[i_149_] -= anInt4781;
								verticesZ[i_149_] -= anInt4757;
								verticesX[i_149_] = verticesX[i_149_]
										* i_21_ / 128;
								verticesY[i_149_] = verticesY[i_149_]
										* i_22_ / 128;
								verticesZ[i_149_] = verticesZ[i_149_]
										* i_23_ / 128;
								verticesX[i_149_] += anInt4792;
								verticesY[i_149_] += anInt4781;
								verticesZ[i_149_] += anInt4757;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray4833 != null && aByteArray4822 != null) {
				for (int i_150_ = 0; i_150_ < i_26_; i_150_++) {
					final int i_151_ = is[i_150_];
					if (i_151_ < anIntArrayArray4833.length) {
						final int[] is_152_ = anIntArrayArray4833[i_151_];
						for (int i_153_ = 0; i_153_ < is_152_.length; i_153_++) {
							final int i_154_ = is_152_[i_153_];
							if (aShortArray4795 == null
									|| (i_24_ & aShortArray4795[i_154_]) != 0) {
								int i_155_ = ((aByteArray4822[i_154_] & 0xff) + i_21_ * 8);
								if (i_155_ < 0) {
									i_155_ = 0;
								} else if (i_155_ > 255) {
									i_155_ = 255;
								}
								aByteArray4822[i_154_] = (byte) i_155_;
							}
						}
					}
				}
				if (aClass170Array4827 != null) {
					for (int i_156_ = 0; i_156_ < anInt4776; i_156_++) {
						final Class170 class170 = aClass170Array4827[i_156_];
						final Class329 class329 = aClass329Array4821[i_156_];
						class329.anInt2770 = (class329.anInt2770 & 0xffffff | 255 - ((aByteArray4822[class170.anInt1315]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray4833 != null) {
				for (int i_157_ = 0; i_157_ < i_26_; i_157_++) {
					final int i_158_ = is[i_157_];
					if (i_158_ < anIntArrayArray4833.length) {
						final int[] is_159_ = anIntArrayArray4833[i_158_];
						for (int i_160_ = 0; i_160_ < is_159_.length; i_160_++) {
							final int i_161_ = is_159_[i_160_];
							if (aShortArray4795 == null
									|| (i_24_ & aShortArray4795[i_161_]) != 0) {
								final int i_162_ = aShortArray4800[i_161_] & 0xffff;
								int i_163_ = i_162_ >> 10 & 0x3f;
								int i_164_ = i_162_ >> 7 & 0x7;
								int i_165_ = i_162_ & 0x7f;
								i_163_ = i_163_ + i_21_ & 0x3f;
								i_164_ += i_22_;
								if (i_164_ < 0) {
									i_164_ = 0;
								} else if (i_164_ > 7) {
									i_164_ = 7;
								}
								i_165_ += i_23_;
								if (i_165_ < 0) {
									i_165_ = 0;
								} else if (i_165_ > 127) {
									i_165_ = 127;
								}
								aShortArray4800[i_161_] = (short) (i_163_ << 10
										| i_164_ << 7 | i_165_);
							}
						}
						aBoolean4754 = true;
					}
				}
				if (aClass170Array4827 != null) {
					for (int i_166_ = 0; i_166_ < anInt4776; i_166_++) {
						final Class170 class170 = aClass170Array4827[i_166_];
						final Class329 class329 = aClass329Array4821[i_166_];
						class329.anInt2770 = (class329.anInt2770 & ~0xffffff | ((Class221.anIntArray1665[Class111_Sub2
								.method2117(
										((aShortArray4800[(class170.anInt1315)]) & 0xffff),
										-83) & 0xffff]) & 0xffffff));
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray4796 != null) {
				for (int i_167_ = 0; i_167_ < i_26_; i_167_++) {
					final int i_168_ = is[i_167_];
					if (i_168_ < anIntArrayArray4796.length) {
						final int[] is_169_ = anIntArrayArray4796[i_168_];
						for (int i_170_ = 0; i_170_ < is_169_.length; i_170_++) {
							final Class329 class329 = aClass329Array4821[is_169_[i_170_]];
							class329.anInt2762 += i_21_;
							class329.anInt2772 += i_22_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray4796 != null) {
				for (int i_171_ = 0; i_171_ < i_26_; i_171_++) {
					final int i_172_ = is[i_171_];
					if (i_172_ < anIntArrayArray4796.length) {
						final int[] is_173_ = anIntArrayArray4796[i_172_];
						for (int i_174_ = 0; i_174_ < is_173_.length; i_174_++) {
							final Class329 class329 = aClass329Array4821[is_173_[i_174_]];
							class329.anInt2763 = class329.anInt2763 * i_21_ >> 7;
							class329.anInt2768 = class329.anInt2768 * i_22_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray4796 != null) {
				for (int i_175_ = 0; i_175_ < i_26_; i_175_++) {
					final int i_176_ = is[i_175_];
					if (i_176_ < anIntArrayArray4796.length) {
						final int[] is_177_ = anIntArrayArray4796[i_176_];
						for (int i_178_ = 0; i_178_ < is_177_.length; i_178_++) {
							final Class329 class329 = aClass329Array4821[is_177_[i_178_]];
							class329.anInt2769 = (class329.anInt2769 + i_21_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	@Override
	final void O(final int i, final int i_179_, final int i_180_) {
		if (i != 128 && (anInt4816 & 0x1) != 1) {
			throw new IllegalStateException();
		}
		if (i_179_ != 128 && (anInt4816 & 0x2) != 2) {
			throw new IllegalStateException();
		}
		if (i_180_ != 128 && (anInt4816 & 0x4) != 4) {
			throw new IllegalStateException();
		}
		synchronized (this) {
			for (int i_181_ = 0; i_181_ < anInt4786; i_181_++) {
				verticesX[i_181_] = verticesX[i_181_] * i >> 7;
				verticesY[i_181_] = verticesY[i_181_] * i_179_ >> 7;
				verticesZ[i_181_] = verticesZ[i_181_] * i_180_ >> 7;
			}
			aBoolean4778 = false;
		}
	}

	@Override
	final void k(final int i) {
		if ((anInt4816 & 0xd) != 13) {
			throw new IllegalStateException();
		}
		if (aClass274Array4789 != null) {
			if (i == 4096) {
				method2350();
			} else if (i == 8192) {
				method2369();
			} else if (i == 12288) {
				method2375();
			} else {
				final int i_182_ = Class284_Sub2_Sub2.anIntArray6200[i];
				final int i_183_ = Class284_Sub2_Sub2.anIntArray6202[i];
				synchronized (this) {
					for (int i_184_ = 0; i_184_ < anInt4814; i_184_++) {
						int i_185_ = ((verticesZ[i_184_] * i_182_ + verticesX[i_184_]
								* i_183_) >> 14);
						verticesZ[i_184_] = (verticesZ[i_184_]
								* i_183_ - verticesX[i_184_] * i_182_) >> 14;
						verticesX[i_184_] = i_185_;
						if (aClass274Array4789[i_184_] != null) {
							i_185_ = ((aClass274Array4789[i_184_].anInt2042)
									* i_182_ + (aClass274Array4789[i_184_].anInt2044)
									* i_183_) >> 14;
							aClass274Array4789[i_184_].anInt2042 = ((aClass274Array4789[i_184_].anInt2042)
									* i_183_ - (aClass274Array4789[i_184_].anInt2044)
									* i_182_) >> 14;
							aClass274Array4789[i_184_].anInt2044 = i_185_;
						}
					}
					if (aClass296Array4823 != null) {
						for (int i_186_ = 0; i_186_ < anInt4780; i_186_++) {
							if (aClass296Array4823[i_186_] != null) {
								final int i_187_ = ((aClass296Array4823[i_186_].anInt2413)
										* i_182_ + ((aClass296Array4823[i_186_]).anInt2411 * i_183_)) >> 14;
								aClass296Array4823[i_186_].anInt2413 = ((aClass296Array4823[i_186_].anInt2413)
										* i_183_ - ((aClass296Array4823[i_186_]).anInt2411 * i_182_)) >> 14;
								aClass296Array4823[i_186_].anInt2411 = i_187_;
							}
						}
					}
					for (int i_188_ = anInt4814; i_188_ < anInt4786; i_188_++) {
						final int i_189_ = ((verticesZ[i_188_] * i_182_ + verticesX[i_188_]
								* i_183_) >> 14);
						verticesZ[i_188_] = (verticesZ[i_188_]
								* i_183_ - verticesX[i_188_] * i_182_) >> 14;
						verticesX[i_188_] = i_189_;
					}
					anInt4784 = 0;
					aBoolean4778 = false;
				}
			}
		} else {
			a(i);
		}
	}

	@Override
	final void LA(final int i) {
		if ((anInt4816 & 0x2000) != 8192) {
			throw new IllegalStateException();
		}
		anInt4805 = i;
		anInt4784 = 0;
	}

	private final void method2347() {
		aClass274Array4789 = new Class274[anInt4814];
		for (int i = 0; i < anInt4814; i++) {
			aClass274Array4789[i] = new Class274();
		}
		for (int i = 0; i < anInt4780; i++) {
			final short i_190_ = triangleViewspaceX[i];
			final short i_191_ = triangleViewspaceY[i];
			final short i_192_ = triangleViewspaceZ[i];
			final int i_193_ = verticesX[i_191_] - verticesX[i_190_];
			final int i_194_ = verticesY[i_191_] - verticesY[i_190_];
			final int i_195_ = verticesZ[i_191_] - verticesZ[i_190_];
			final int i_196_ = verticesX[i_192_] - verticesX[i_190_];
			final int i_197_ = verticesY[i_192_] - verticesY[i_190_];
			final int i_198_ = verticesZ[i_192_] - verticesZ[i_190_];
			int i_199_ = i_194_ * i_198_ - i_197_ * i_195_;
			int i_200_ = i_195_ * i_196_ - i_198_ * i_193_;
			int i_201_;
			for (i_201_ = i_193_ * i_197_ - i_196_ * i_194_; (i_199_ > 8192
					|| i_200_ > 8192 || i_201_ > 8192 || i_199_ < -8192
					|| i_200_ < -8192 || i_201_ < -8192); i_201_ >>= 1) {
				i_199_ >>= 1;
				i_200_ >>= 1;
			}
			int i_202_ = (int) Math.sqrt(i_199_ * i_199_ + i_200_ * i_200_
					+ i_201_ * i_201_);
			if (i_202_ <= 0) {
				i_202_ = 1;
			}
			i_199_ = i_199_ * 256 / i_202_;
			i_200_ = i_200_ * 256 / i_202_;
			i_201_ = i_201_ * 256 / i_202_;
			byte i_203_;
			if (aByteArray4793 == null) {
				i_203_ = (byte) 0;
			} else {
				i_203_ = aByteArray4793[i];
			}
			if (i_203_ == 0) {
				Class274 class274 = aClass274Array4789[i_190_];
				class274.anInt2044 += i_199_;
				class274.anInt2043 += i_200_;
				class274.anInt2042 += i_201_;
				class274.anInt2045++;
				class274 = aClass274Array4789[i_191_];
				class274.anInt2044 += i_199_;
				class274.anInt2043 += i_200_;
				class274.anInt2042 += i_201_;
				class274.anInt2045++;
				class274 = aClass274Array4789[i_192_];
				class274.anInt2044 += i_199_;
				class274.anInt2043 += i_200_;
				class274.anInt2042 += i_201_;
				class274.anInt2045++;
			} else if (i_203_ == 1) {
				if (aClass296Array4823 == null) {
					aClass296Array4823 = new Class296[anInt4780];
				}
				final Class296 class296 = aClass296Array4823[i] = new Class296();
				class296.anInt2411 = i_199_;
				class296.anInt2412 = i_200_;
				class296.anInt2413 = i_201_;
			}
		}
	}

	@Override
	final int ma() {
		if (!aBoolean4778) {
			method2346();
		}
		return aShort4826;
	}

	@Override
	final int G() {
		if (!aBoolean4778) {
			method2346();
		}
		return aShort4753;
	}

	private final void method2348(final Class111 class111,
			final Class246_Sub6 class246_sub6, final int i, final int i_204_) {
		if (anInt4814 >= 1) {
			aClass111_Sub2_4819 = (Class111_Sub2) class111;
			final Class111_Sub2 class111_sub2 = aHa_Sub2_4797.aClass111_Sub2_4513;
			if (!aBoolean4778) {
				method2346();
			}
			boolean bool = false;
			if (aClass111_Sub2_4819.aFloat4700 == 16384.0F
					&& aClass111_Sub2_4819.aFloat4699 == 0.0F
					&& aClass111_Sub2_4819.aFloat4690 == 0.0F
					&& aClass111_Sub2_4819.aFloat4692 == 0.0F
					&& aClass111_Sub2_4819.aFloat4688 == 16384.0F
					&& aClass111_Sub2_4819.aFloat4696 == 0.0F
					&& aClass111_Sub2_4819.aFloat4693 == 0.0F
					&& aClass111_Sub2_4819.aFloat4698 == 0.0F
					&& (aClass111_Sub2_4819.aFloat4694 == 16384.0F)) {
				bool = true;
			}
			final float f = (class111_sub2.aFloat4689
					+ (class111_sub2.aFloat4693 * aClass111_Sub2_4819.aFloat4697)
					+ (class111_sub2.aFloat4698 * aClass111_Sub2_4819.aFloat4691) + (class111_sub2.aFloat4694 * aClass111_Sub2_4819.aFloat4689));
			final float f_205_ = (bool ? class111_sub2.aFloat4698
					: ((class111_sub2.aFloat4693 * aClass111_Sub2_4819.aFloat4699)
							+ (class111_sub2.aFloat4698 * aClass111_Sub2_4819.aFloat4688) + (class111_sub2.aFloat4694 * aClass111_Sub2_4819.aFloat4698)));
			final int i_206_ = (int) (f + aShort4770 * f_205_);
			final int i_207_ = (int) (f + aShort4808 * f_205_);
			int i_208_;
			int i_209_;
			if (i_206_ > i_207_) {
				i_208_ = i_207_ - aShort4835;
				i_209_ = i_206_ + aShort4835;
			} else {
				i_208_ = i_206_ - aShort4835;
				i_209_ = i_207_ + aShort4835;
			}
			if (i_208_ < aHa_Sub2_4797.anInt4484
					&& i_209_ > aHa_Sub2_4797.anInt4502) {
				final float f_210_ = (class111_sub2.aFloat4697
						+ (class111_sub2.aFloat4700 * aClass111_Sub2_4819.aFloat4697)
						+ (class111_sub2.aFloat4699 * aClass111_Sub2_4819.aFloat4691) + (class111_sub2.aFloat4690 * aClass111_Sub2_4819.aFloat4689));
				final float f_211_ = (bool ? class111_sub2.aFloat4699
						: ((class111_sub2.aFloat4700 * aClass111_Sub2_4819.aFloat4699)
								+ (class111_sub2.aFloat4699 * (aClass111_Sub2_4819.aFloat4688)) + (class111_sub2.aFloat4690 * (aClass111_Sub2_4819.aFloat4698))));
				final int i_212_ = (int) (f_210_ + aShort4770 * f_211_);
				final int i_213_ = (int) (f_210_ + aShort4808 * f_211_);
				int i_214_;
				int i_215_;
				if (i_212_ > i_213_) {
					i_214_ = ((i_213_ - aShort4835) * aHa_Sub2_4797.anInt4514);
					i_215_ = ((i_212_ + aShort4835) * aHa_Sub2_4797.anInt4514);
				} else {
					i_214_ = ((i_212_ - aShort4835) * aHa_Sub2_4797.anInt4514);
					i_215_ = ((i_213_ + aShort4835) * aHa_Sub2_4797.anInt4514);
				}
				if (i == -1) {
					if (i_214_ / i_209_ >= aHa_Sub2_4797.anInt4517
							|| (i_215_ / i_209_ <= aHa_Sub2_4797.anInt4486)) {
						return;
					}
				} else if (i_214_ / i >= aHa_Sub2_4797.anInt4517
						|| (i_215_ / i <= aHa_Sub2_4797.anInt4486)) {
					return;
				}
				final float f_216_ = (class111_sub2.aFloat4691
						+ (class111_sub2.aFloat4692 * aClass111_Sub2_4819.aFloat4697)
						+ (class111_sub2.aFloat4688 * aClass111_Sub2_4819.aFloat4691) + (class111_sub2.aFloat4696 * aClass111_Sub2_4819.aFloat4689));
				final float f_217_ = (bool ? class111_sub2.aFloat4688
						: ((class111_sub2.aFloat4692 * aClass111_Sub2_4819.aFloat4699)
								+ (class111_sub2.aFloat4688 * (aClass111_Sub2_4819.aFloat4688)) + (class111_sub2.aFloat4696 * (aClass111_Sub2_4819.aFloat4698))));
				final int i_218_ = (int) (f_216_ + aShort4770 * f_217_);
				final int i_219_ = (int) (f_216_ + aShort4808 * f_217_);
				int i_220_;
				int i_221_;
				if (i_218_ > i_219_) {
					i_220_ = ((i_219_ - aShort4835) * aHa_Sub2_4797.anInt4490);
					i_221_ = ((i_218_ + aShort4835) * aHa_Sub2_4797.anInt4490);
				} else {
					i_220_ = ((i_218_ - aShort4835) * aHa_Sub2_4797.anInt4490);
					i_221_ = ((i_219_ + aShort4835) * aHa_Sub2_4797.anInt4490);
				}
				if (i == -1) {
					if (i_220_ / i_209_ >= aHa_Sub2_4797.anInt4506
							|| (i_221_ / i_209_ <= aHa_Sub2_4797.anInt4518)) {
						return;
					}
				} else if (i_220_ / i >= aHa_Sub2_4797.anInt4506
						|| (i_221_ / i <= aHa_Sub2_4797.anInt4518)) {
					return;
				}
				float f_222_;
				float f_223_;
				float f_224_;
				float f_225_;
				float f_226_;
				float f_227_;
				if (bool) {
					f_222_ = class111_sub2.aFloat4700;
					f_223_ = class111_sub2.aFloat4692;
					f_224_ = class111_sub2.aFloat4693;
					f_225_ = class111_sub2.aFloat4690;
					f_226_ = class111_sub2.aFloat4696;
					f_227_ = class111_sub2.aFloat4694;
				} else {
					f_222_ = ((class111_sub2.aFloat4700 * aClass111_Sub2_4819.aFloat4700)
							+ (class111_sub2.aFloat4699 * (aClass111_Sub2_4819.aFloat4692)) + (class111_sub2.aFloat4690 * (aClass111_Sub2_4819.aFloat4693)));
					f_223_ = ((class111_sub2.aFloat4692 * aClass111_Sub2_4819.aFloat4700)
							+ (class111_sub2.aFloat4688 * (aClass111_Sub2_4819.aFloat4692)) + (class111_sub2.aFloat4696 * (aClass111_Sub2_4819.aFloat4693)));
					f_224_ = ((class111_sub2.aFloat4693 * aClass111_Sub2_4819.aFloat4700)
							+ (class111_sub2.aFloat4698 * (aClass111_Sub2_4819.aFloat4692)) + (class111_sub2.aFloat4694 * (aClass111_Sub2_4819.aFloat4693)));
					f_225_ = ((class111_sub2.aFloat4700 * aClass111_Sub2_4819.aFloat4690)
							+ (class111_sub2.aFloat4699 * (aClass111_Sub2_4819.aFloat4696)) + (class111_sub2.aFloat4690 * (aClass111_Sub2_4819.aFloat4694)));
					f_226_ = ((class111_sub2.aFloat4692 * aClass111_Sub2_4819.aFloat4690)
							+ (class111_sub2.aFloat4688 * (aClass111_Sub2_4819.aFloat4696)) + (class111_sub2.aFloat4696 * (aClass111_Sub2_4819.aFloat4694)));
					f_227_ = ((class111_sub2.aFloat4693 * aClass111_Sub2_4819.aFloat4690)
							+ (class111_sub2.aFloat4698 * (aClass111_Sub2_4819.aFloat4696)) + (class111_sub2.aFloat4694 * (aClass111_Sub2_4819.aFloat4694)));
				}
				if (aHa_Sub2_4797.anInt4508 > 1) {
					synchronized (this) {
						while (aBoolean4765) {
							try {
								this.wait();
							} catch (final InterruptedException interruptedexception) {
								/* empty */
							}
						}
						aBoolean4765 = true;
					}
				}
				method2351(Thread.currentThread());
				if ((i_204_ & 0x2) != 0) {
					aClass12_4768.method213(true);
				} else {
					aClass12_4768.method213(false);
				}
				boolean bool_228_ = false;
				final boolean bool_229_ = i_208_ <= aHa_Sub2_4797.anInt4502;
				final boolean bool_230_ = (bool_229_
						|| aClass87Array4813 != null || aClass35Array4787 != null);
				aClass235_4807.anInt1783 = aClass12_4768.anInt141;
				aClass235_4807.anInt1771 = aClass12_4768.anInt136;
				aClass235_4807.anInt1779 = aClass12_4768.anInt128;
				final int i_231_ = aHa_Sub2_4797.anInt4514;
				final int i_232_ = aHa_Sub2_4797.anInt4490;
				final int i_233_ = aHa_Sub2_4797.anInt4502;
				if (i == -1) {
					for (int i_234_ = 0; i_234_ < anInt4786; i_234_++) {
						final int i_235_ = verticesX[i_234_];
						final int i_236_ = verticesY[i_234_];
						final int i_237_ = verticesZ[i_234_];
						final float f_238_ = (f_210_ + f_222_ * i_235_ + f_211_
								* i_236_ + f_225_ * i_237_);
						final float f_239_ = (f_216_ + f_223_ * i_235_ + f_217_
								* i_236_ + f_226_ * i_237_);
						final float f_240_ = (f + f_224_ * i_235_ + f_205_
								* i_236_ + f_227_ * i_237_);
						anIntArray4766[i_234_] = (int) f_240_;
						if (f_240_ >= i_233_) {
							anIntArray4771[i_234_] = (aClass235_4807.anInt1771 + (int) (f_238_
									* i_231_ / f_240_));
							anIntArray4812[i_234_] = (aClass235_4807.anInt1779 + (int) (f_239_
									* i_232_ / f_240_));
						} else {
							anIntArray4771[i_234_] = -5000;
							bool_228_ = true;
						}
						if (bool_230_) {
							anIntArray4828[i_234_] = (int) f_238_;
							anIntArray4763[i_234_] = (int) f_239_;
							anIntArray4829[i_234_] = (int) f_240_;
						}
						if (aClass235_4807.aBoolean1759) {
							anIntArray4817[i_234_] = (int) ((aClass111_Sub2_4819.aFloat4691) + ((aClass111_Sub2_4819.aFloat4692 * i_235_)
									+ (aClass111_Sub2_4819.aFloat4688 * i_236_) + (aClass111_Sub2_4819.aFloat4696 * i_237_)));
						}
					}
					if (aClass170Array4827 != null) {
						for (int i_241_ = 0; i_241_ < anInt4776; i_241_++) {
							final Class170 class170 = aClass170Array4827[i_241_];
							final Class329 class329 = aClass329Array4821[i_241_];
							final short i_242_ = (triangleViewspaceX[class170.anInt1315]);
							final short i_243_ = (triangleViewspaceY[class170.anInt1315]);
							final short i_244_ = (triangleViewspaceZ[class170.anInt1315]);
							final int i_245_ = ((verticesX[i_242_]
									+ verticesX[i_243_] + verticesX[i_244_]) / 3);
							final int i_246_ = ((verticesY[i_242_]
									+ verticesY[i_243_] + verticesY[i_244_]) / 3);
							final int i_247_ = ((verticesZ[i_242_]
									+ verticesZ[i_243_] + verticesZ[i_244_]) / 3);
							final float f_248_ = (class329.anInt2762 + (f_210_
									+ f_222_ * i_245_ + f_211_ * i_246_ + f_225_
									* i_247_));
							final float f_249_ = (class329.anInt2772 + (f_216_
									+ f_223_ * i_245_ + f_217_ * i_246_ + f_226_
									* i_247_));
							final float f_250_ = (f + f_224_ * i_245_ + f_205_
									* i_246_ + f_227_ * i_247_);
							if (f_250_ > (aHa_Sub2_4797.anInt4502)) {
								class329.anInt2773 = (aHa_Sub2_4797.anInt4510 + (int) (f_248_
										* i_231_ / f_250_));
								class329.anInt2767 = (aHa_Sub2_4797.anInt4511 + (int) (f_249_
										* i_232_ / f_250_));
								class329.anInt2764 = ((int) f_250_ - class170.anInt1316);
								class329.anInt2766 = (int) ((class329.anInt2763)
										* (class170.aShort1317) * i_231_ / (f_250_ * 128.0F));
								class329.anInt2760 = (int) ((class329.anInt2768)
										* (class170.aShort1309) * i_232_ / (f_250_ * 128.0F));
							} else {
								class329.anInt2766 = class329.anInt2760 = 0;
							}
						}
					}
				} else {
					for (int i_251_ = 0; i_251_ < anInt4786; i_251_++) {
						final int i_252_ = verticesX[i_251_];
						final int i_253_ = verticesY[i_251_];
						final int i_254_ = verticesZ[i_251_];
						final float f_255_ = (f_210_ + f_222_ * i_252_ + f_211_
								* i_253_ + f_225_ * i_254_);
						final float f_256_ = (f_216_ + f_223_ * i_252_ + f_217_
								* i_253_ + f_226_ * i_254_);
						final float f_257_ = (f + f_224_ * i_252_ + f_205_
								* i_253_ + f_227_ * i_254_);
						anIntArray4766[i_251_] = (int) f_257_;
						anIntArray4771[i_251_] = (aClass235_4807.anInt1771 + (int) (f_255_
								* i_231_ / i));
						anIntArray4812[i_251_] = (aClass235_4807.anInt1779 + (int) (f_256_
								* i_232_ / i));
						if (bool_230_) {
							anIntArray4828[i_251_] = (int) f_255_;
							anIntArray4763[i_251_] = (int) f_256_;
							anIntArray4829[i_251_] = i;
						}
						if (aClass235_4807.aBoolean1759) {
							anIntArray4817[i_251_] = (int) ((aClass111_Sub2_4819.aFloat4691) + ((aClass111_Sub2_4819.aFloat4692 * i_252_)
									+ (aClass111_Sub2_4819.aFloat4688 * i_253_) + (aClass111_Sub2_4819.aFloat4696 * i_254_)));
						}
					}
					if (aClass170Array4827 != null) {
						for (int i_258_ = 0; i_258_ < anInt4776; i_258_++) {
							final Class170 class170 = aClass170Array4827[i_258_];
							final Class329 class329 = aClass329Array4821[i_258_];
							final short i_259_ = (triangleViewspaceX[class170.anInt1315]);
							final short i_260_ = (triangleViewspaceY[class170.anInt1315]);
							final short i_261_ = (triangleViewspaceZ[class170.anInt1315]);
							final int i_262_ = ((verticesX[i_259_]
									+ verticesX[i_260_] + verticesX[i_261_]) / 3);
							final int i_263_ = ((verticesY[i_259_]
									+ verticesY[i_260_] + verticesY[i_261_]) / 3);
							final int i_264_ = ((verticesZ[i_259_]
									+ verticesZ[i_260_] + verticesZ[i_261_]) / 3);
							final float f_265_ = (f_210_ + f_222_ * i_262_
									+ f_211_ * i_263_ + f_225_ * i_264_);
							final float f_266_ = (f_216_ + f_223_ * i_262_
									+ f_217_ * i_263_ + f_226_ * i_264_);
							class329.anInt2773 = (aHa_Sub2_4797.anInt4510 + (int) (f_265_
									* i_231_ / i));
							class329.anInt2767 = (aHa_Sub2_4797.anInt4511 + (int) (f_266_
									* i_232_ / i));
							class329.anInt2764 = i - class170.anInt1316;
							class329.anInt2766 = (class329.anInt2763
									* class170.aShort1317 * i_231_ / (i << 7));
							class329.anInt2760 = (class329.anInt2768
									* class170.aShort1309 * i_232_ / (i << 7));
						}
					}
				}
				if (class246_sub6 != null) {
					boolean bool_268_ = false;
					boolean bool_269_ = true;
					final int i_270_ = aShort4794 + aShort4801 >> 1;
					final int i_271_ = aShort4774 + aShort4753 >> 1;
					int i_272_ = i_270_;
					short i_273_ = aShort4770;
					int i_274_ = i_271_;
					final float f_275_ = (f_210_ + f_222_ * i_272_ + f_211_
							* i_273_ + f_225_ * i_274_);
					final float f_276_ = (f_216_ + f_223_ * i_272_ + f_217_
							* i_273_ + f_226_ * i_274_);
					final float f_277_ = (f + f_224_ * i_272_ + f_205_ * i_273_ + f_227_
							* i_274_);
					if (f_277_ >= i_233_) {
						int i_278_ = (int) f_277_;
						if (i != -1) {
							i_278_ = i;
						}
						class246_sub6.anInt5111 = (aHa_Sub2_4797.anInt4510 + (int) (f_275_
								* i_231_ / i_278_));
						class246_sub6.anInt5113 = (aHa_Sub2_4797.anInt4511 + (int) (f_276_
								* i_232_ / i_278_));
					} else {
						bool_268_ = true;
					}
					i_272_ = i_270_;
					i_273_ = aShort4808;
					i_274_ = i_271_;
					final float f_279_ = (f_210_ + f_222_ * i_272_ + f_211_
							* i_273_ + f_225_ * i_274_);
					final float f_280_ = (f_216_ + f_223_ * i_272_ + f_217_
							* i_273_ + f_226_ * i_274_);
					final float f_281_ = (f + f_224_ * i_272_ + f_205_ * i_273_ + f_227_
							* i_274_);
					if (f_281_ >= i_233_) {
						int i_282_ = (int) f_281_;
						if (i != -1) {
							i_282_ = i;
						}
						class246_sub6.anInt5110 = (aHa_Sub2_4797.anInt4510 + (int) (f_279_
								* i_231_ / i_282_));
						class246_sub6.anInt5112 = (aHa_Sub2_4797.anInt4511 + (int) (f_280_
								* i_232_ / i_282_));
					} else {
						bool_268_ = true;
					}
					if (bool_268_) {
						if (f_277_ < i_233_ && f_281_ < i_233_) {
							bool_269_ = false;
						} else if (f_277_ < i_233_) {
							final float f_283_ = ((f_281_ - (aHa_Sub2_4797.anInt4502)) / (f_281_ - f_277_));
							final int i_284_ = (int) (f_279_ + (f_279_ - f_275_)
									* f_283_);
							final int i_285_ = (int) (f_280_ + (f_280_ - f_276_)
									* f_283_);
							int i_286_ = i_233_;
							if (i != -1) {
								i_286_ = i;
							}
							class246_sub6.anInt5111 = (aHa_Sub2_4797.anInt4510 + i_284_
									* i_231_ / i_286_);
							class246_sub6.anInt5113 = (aHa_Sub2_4797.anInt4511 + i_285_
									* i_232_ / i_286_);
						} else if (f_281_ < i_233_) {
							final float f_287_ = ((f_277_ - i_233_) / (f_277_ - f_281_));
							final int i_288_ = (int) (f_275_ + (f_275_ - f_279_)
									* f_287_);
							final int i_289_ = (int) (f_276_ + (f_276_ - f_280_)
									* f_287_);
							int i_290_ = i_233_;
							if (i != -1) {
								i_290_ = i;
							}
							class246_sub6.anInt5111 = (aHa_Sub2_4797.anInt4510 + i_288_
									* i_231_ / i_290_);
							class246_sub6.anInt5113 = (aHa_Sub2_4797.anInt4511 + i_289_
									* i_232_ / i_290_);
						}
					}
					if (bool_269_) {
						if (f_277_ > f_281_) {
							int i_291_ = (int) f_277_;
							if (i != -1) {
								i_291_ = i;
							}
							class246_sub6.anInt5109 = (aHa_Sub2_4797.anInt4510
									+ (int) ((f_275_ + aShort4835) * i_231_ / i_291_) - (class246_sub6.anInt5111));
						} else {
							int i_292_ = (int) f_281_;
							if (i != -1) {
								i_292_ = i;
							}
							class246_sub6.anInt5109 = (aHa_Sub2_4797.anInt4510
									+ (int) ((f_279_ + aShort4835) * i_231_ / i_292_) - (class246_sub6.anInt5110));
						}
						class246_sub6.aBoolean5114 = true;
					}
				}
				method2354(true);
				aClass12_4768.aBoolean134 = (i_204_ & 0x1) == 0;
				aClass12_4768.aBoolean130 = false;
				try {
					method2359(
							bool_228_,
							((aClass235_4807.aBoolean1758 && (i_209_ > aClass235_4807.anInt1761)) || aClass235_4807.aBoolean1759),
							i_208_, i_209_ - i_208_);
				} catch (final Exception exception) {
					/* empty */
				}
				if (aClass170Array4827 != null) {
					for (int i_293_ = 0; i_293_ < anInt4780; i_293_++) {
						anIntArray4758[i_293_] = -1;
					}
				}
				aClass12_4768 = null;
				if (aHa_Sub2_4797.anInt4508 > 1) {
					synchronized (this) {
						aBoolean4765 = false;
						notifyAll();
					}
				}
			}
		}
	}

	@Override
	final Surface[] method2320() {
		return aClass87Array4813;
	}

	private final int method2349(final int i, int i_294_) {
		i_294_ = i_294_ * (i & 0x7f) >> 7;
		if (i_294_ < 2) {
			i_294_ = 2;
		} else if (i_294_ > 126) {
			i_294_ = 126;
		}
		return (i & 0xff80) + i_294_;
	}

	private final void method2350() {
		synchronized (this) {
			for (int i = 0; i < anInt4814; i++) {
				int i_295_ = verticesX[i];
				verticesX[i] = verticesZ[i];
				verticesZ[i] = -i_295_;
				if (aClass274Array4789[i] != null) {
					i_295_ = aClass274Array4789[i].anInt2044;
					aClass274Array4789[i].anInt2044 = aClass274Array4789[i].anInt2042;
					aClass274Array4789[i].anInt2042 = -i_295_;
				}
			}
			if (aClass296Array4823 != null) {
				for (int i = 0; i < anInt4780; i++) {
					if (aClass296Array4823[i] != null) {
						final int i_296_ = aClass296Array4823[i].anInt2411;
						aClass296Array4823[i].anInt2411 = aClass296Array4823[i].anInt2413;
						aClass296Array4823[i].anInt2413 = -i_296_;
					}
				}
			}
			for (int i = anInt4814; i < anInt4786; i++) {
				final int i_297_ = verticesX[i];
				verticesX[i] = verticesZ[i];
				verticesZ[i] = -i_297_;
			}
			anInt4784 = 0;
			aBoolean4778 = false;
		}
	}

	private final void method2351(final Thread thread) {
		final Class235 class235 = aHa_Sub2_4797.method1921(thread);
		aClass12_4768 = class235.aClass12_1767;
		if (class235 != aClass235_4807) {
			aClass235_4807 = class235;
			anIntArray4817 = aClass235_4807.anIntArray1794;
			anIntArray4828 = aClass235_4807.anIntArray1786;
			anIntArray4763 = aClass235_4807.anIntArray1765;
			anIntArray4829 = aClass235_4807.anIntArray1780;
			anIntArray4771 = aClass235_4807.anIntArray1796;
			anIntArray4812 = aClass235_4807.anIntArray1775;
			anIntArray4766 = aClass235_4807.anIntArray1766;
			anIntArray4767 = aClass235_4807.anIntArray1797;
			anIntArray4818 = aClass235_4807.anIntArray1791;
			anIntArray4747 = aClass235_4807.anIntArray1792;
			anIntArray4751 = aClass235_4807.anIntArray1789;
			anIntArray4811 = aClass235_4807.anIntArray1770;
			anIntArray4824 = aClass235_4807.anIntArray1777;
			anIntArray4749 = aClass235_4807.anIntArray1768;
			anIntArray4803 = aClass235_4807.anIntArray1782;
			anIntArray4820 = aClass235_4807.anIntArray1785;
			anIntArray4758 = aClass235_4807.anIntArray1773;
		}
	}

	@Override
	final void FA(final int i) {
		if ((anInt4816 & 0x6) != 6) {
			throw new IllegalStateException();
		}
		final int i_298_ = Class284_Sub2_Sub2.anIntArray6200[i];
		final int i_299_ = Class284_Sub2_Sub2.anIntArray6202[i];
		synchronized (this) {
			for (int i_300_ = 0; i_300_ < anInt4786; i_300_++) {
				final int i_301_ = ((verticesY[i_300_] * i_299_ - verticesZ[i_300_]
						* i_298_) >> 14);
				verticesZ[i_300_] = (verticesY[i_300_] * i_298_ + verticesZ[i_300_]
						* i_299_) >> 14;
				verticesY[i_300_] = i_301_;
			}
			method2364();
		}
	}

	@Override
	final int da() {
		return anInt4805;
	}

	@Override
	final void method2329(final Class111 class111,
			final Class246_Sub6 class246_sub6, final int i, final int i_302_) {
		method2348(class111, class246_sub6, i, i_302_);
	}

	@Override
	final boolean r() {
		return aBoolean4802;
	}

	private final void method2352() {
		for (int i = 0; i < anInt4780; i++) {
			final short i_303_ = aShortArray4804 != null ? aShortArray4804[i]
					: (short) -1;
			if (i_303_ == -1) {
				final int i_304_ = aShortArray4800[i] & 0xffff;
				final int i_305_ = (i_304_ & 0x7f) * anInt4761 >> 7;
				final short i_306_ = Class111_Sub2.method2117(i_304_ & ~0x7f
						| i_305_, 98);
				if (anIntArray4836[i] == -1) {
					final int i_307_ = anIntArray4791[i] & ~0x1ffff;
					anIntArray4791[i] = i_307_
							| Class246_Sub7.method3132(i_307_ >> 17,
									(byte) 118, i_306_);
				} else if (anIntArray4836[i] != -2) {
					int i_308_ = anIntArray4791[i] & ~0x1ffff;
					anIntArray4791[i] = i_308_
							| Class246_Sub7.method3132(i_308_ >> 17,
									(byte) 118, i_306_);
					i_308_ = anIntArray4760[i] & ~0x1ffff;
					anIntArray4760[i] = i_308_
							| Class246_Sub7.method3132(i_308_ >> 17,
									(byte) 118, i_306_);
					i_308_ = anIntArray4836[i] & ~0x1ffff;
					anIntArray4836[i] = i_308_
							| Class246_Sub7.method3132(i_308_ >> 17,
									(byte) 118, i_306_);
				}
			}
		}
		anInt4784 = 2;
	}

	private final void method2353() {
		if (anInt4784 == 0 && aClass274Array4789 == null) {
			if (aHa_Sub2_4797.anInt4508 > 1) {
				synchronized (this) {
					method2347();
				}
			} else {
				method2347();
			}
		}
	}

	@Override
	final int fa() {
		if (!aBoolean4778) {
			method2346();
		}
		return aShort4770;
	}

	@Override
	final int V() {
		if (!aBoolean4778) {
			method2346();
		}
		return aShort4794;
	}

	@Override
	final void s(final int i) {
		if (aHa_Sub2_4797.anInt4508 > 1) {
			synchronized (this) {
				if ((anInt4816 & 0x10000) == 65536 && (i & 0x10000) == 0) {
					method2354(true);
				}
				anInt4816 = i;
			}
		} else {
			if ((anInt4816 & 0x10000) == 65536 && (i & 0x10000) == 0) {
				method2354(true);
			}
			anInt4816 = i;
		}
	}

	@Override
	final void method2331(final Class111 class111, final int i,
			final boolean bool) {
		if (aShortArray4790 != null) {
			final int[] is = new int[3];
			for (int i_309_ = 0; i_309_ < anInt4814; i_309_++) {
				if ((i & aShortArray4790[i_309_]) != 0) {
					if (bool) {
						class111.method2096(verticesX[i_309_],
								verticesY[i_309_], verticesZ[i_309_],
								is);
					} else {
						class111.method2103(verticesX[i_309_],
								verticesY[i_309_], verticesZ[i_309_],
								is);
					}
					verticesX[i_309_] = is[0];
					verticesY[i_309_] = is[1];
					verticesZ[i_309_] = is[2];
				}
			}
		}
	}

	@Override
	final void p(final int i, final int i_310_, final s var_s,
			final s var_s_311_, final int i_312_, final int i_313_,
			final int i_314_) {
		if (i == 3) {
			if ((anInt4816 & 0x7) != 7) {
				throw new IllegalStateException();
			}
		} else if ((anInt4816 & 0x2) != 2) {
			throw new IllegalStateException();
		}
		if (!aBoolean4778) {
			method2346();
		}
		int i_315_ = i_312_ + aShort4794;
		int i_316_ = i_312_ + aShort4801;
		int i_317_ = i_314_ + aShort4774;
		int i_318_ = i_314_ + aShort4753;
		if (i == 4
				|| (i_315_ >= 0
						&& (i_316_ + var_s.anInt2206 >> var_s.anInt2200 < var_s.anInt2203)
						&& i_317_ >= 0 && (i_318_ + var_s.anInt2206 >> var_s.anInt2200 < var_s.anInt2204))) {
			final int[][] is = ((s) (s_Sub3) var_s).anIntArrayArray2201;
			int[][] is_319_ = null;
			if (var_s_311_ != null) {
				is_319_ = ((s) (s_Sub3) var_s_311_).anIntArrayArray2201;
			}
			if (i == 4 || i == 5) {
				if (var_s_311_ == null
						|| (i_315_ < 0
								|| ((i_316_ + var_s_311_.anInt2206 >> var_s_311_.anInt2200) >= var_s_311_.anInt2203)
								|| i_317_ < 0 || ((i_318_
								+ var_s_311_.anInt2206 >> var_s_311_.anInt2200) >= var_s_311_.anInt2204))) {
					return;
				}
			} else {
				i_315_ >>= var_s.anInt2200;
				i_316_ = (i_316_ + (var_s.anInt2206 - 1) >> var_s.anInt2200);
				i_317_ >>= var_s.anInt2200;
				i_318_ = (i_318_ + (var_s.anInt2206 - 1) >> var_s.anInt2200);
				if (is[i_315_][i_317_] == i_313_
						&& is[i_316_][i_317_] == i_313_
						&& is[i_315_][i_318_] == i_313_
						&& is[i_316_][i_318_] == i_313_) {
					return;
				}
			}
			synchronized (this) {
				if (i == 1) {
					final int i_320_ = var_s.anInt2206 - 1;
					for (int i_321_ = 0; i_321_ < anInt4814; i_321_++) {
						final int i_322_ = verticesX[i_321_] + i_312_;
						final int i_323_ = verticesZ[i_321_] + i_314_;
						final int i_324_ = i_322_ & i_320_;
						final int i_325_ = i_323_ & i_320_;
						final int i_326_ = i_322_ >> var_s.anInt2200;
						final int i_327_ = i_323_ >> var_s.anInt2200;
						final int i_328_ = ((is[i_326_][i_327_]
								* (var_s.anInt2206 - i_324_) + is[i_326_ + 1][i_327_]
								* i_324_) >> var_s.anInt2200);
						final int i_329_ = ((is[i_326_][i_327_ + 1]
								* (var_s.anInt2206 - i_324_) + is[i_326_ + 1][i_327_ + 1]
								* i_324_) >> var_s.anInt2200);
						final int i_330_ = (i_328_ * (var_s.anInt2206 - i_325_)
								+ i_329_ * i_325_ >> var_s.anInt2200);
						verticesY[i_321_] = verticesY[i_321_]
								+ i_330_ - i_313_;
					}
					for (int i_331_ = anInt4814; i_331_ < anInt4786; i_331_++) {
						final int i_332_ = verticesX[i_331_] + i_312_;
						final int i_333_ = verticesZ[i_331_] + i_314_;
						final int i_334_ = i_332_ & i_320_;
						final int i_335_ = i_333_ & i_320_;
						final int i_336_ = i_332_ >> var_s.anInt2200;
						final int i_337_ = i_333_ >> var_s.anInt2200;
						if (i_336_ >= 0 && i_336_ < is.length - 1
								&& i_337_ >= 0 && i_337_ < is[0].length - 1) {
							final int i_338_ = ((is[i_336_][i_337_]
									* (var_s.anInt2206 - i_334_) + is[i_336_ + 1][i_337_]
									* i_334_) >> var_s.anInt2200);
							final int i_339_ = (((is[i_336_][i_337_ + 1] * (var_s.anInt2206 - i_334_)) + is[i_336_ + 1][i_337_ + 1]
									* i_334_) >> var_s.anInt2200);
							final int i_340_ = (i_338_
									* (var_s.anInt2206 - i_335_) + i_339_
									* i_335_ >> var_s.anInt2200);
							verticesY[i_331_] = verticesY[i_331_]
									+ i_340_ - i_313_;
						}
					}
				} else if (i == 2) {
					final int i_341_ = var_s.anInt2206 - 1;
					for (int i_342_ = 0; i_342_ < anInt4814; i_342_++) {
						final int i_343_ = (verticesY[i_342_] << 16)
								/ aShort4770;
						if (i_343_ < i_310_) {
							final int i_344_ = verticesX[i_342_] + i_312_;
							final int i_345_ = verticesZ[i_342_] + i_314_;
							final int i_346_ = i_344_ & i_341_;
							final int i_347_ = i_345_ & i_341_;
							final int i_348_ = i_344_ >> var_s.anInt2200;
							final int i_349_ = i_345_ >> var_s.anInt2200;
							final int i_350_ = ((is[i_348_][i_349_]
									* (var_s.anInt2206 - i_346_) + is[i_348_ + 1][i_349_]
									* i_346_) >> var_s.anInt2200);
							final int i_351_ = (((is[i_348_][i_349_ + 1] * (var_s.anInt2206 - i_346_)) + is[i_348_ + 1][i_349_ + 1]
									* i_346_) >> var_s.anInt2200);
							final int i_352_ = (i_350_
									* (var_s.anInt2206 - i_347_) + i_351_
									* i_347_ >> var_s.anInt2200);
							verticesY[i_342_] = verticesY[i_342_]
									+ ((i_352_ - i_313_) * (i_310_ - i_343_) / i_310_);
						} else {
							verticesY[i_342_] = verticesY[i_342_];
						}
					}
					for (int i_353_ = anInt4814; i_353_ < anInt4786; i_353_++) {
						final int i_354_ = (verticesY[i_353_] << 16)
								/ aShort4770;
						if (i_354_ < i_310_) {
							final int i_355_ = verticesX[i_353_] + i_312_;
							final int i_356_ = verticesZ[i_353_] + i_314_;
							final int i_357_ = i_355_ & i_341_;
							final int i_358_ = i_356_ & i_341_;
							final int i_359_ = i_355_ >> var_s.anInt2200;
							final int i_360_ = i_356_ >> var_s.anInt2200;
							if (i_359_ >= 0 && i_359_ < var_s.anInt2203 - 1
									&& i_360_ >= 0
									&& i_360_ < var_s.anInt2204 - 1) {
								final int i_361_ = (((is[i_359_][i_360_] * (var_s.anInt2206 - i_357_)) + is[i_359_ + 1][i_360_]
										* i_357_) >> var_s.anInt2200);
								final int i_362_ = (((is[i_359_][i_360_ + 1] * (var_s.anInt2206 - i_357_)) + is[i_359_ + 1][i_360_ + 1]
										* i_357_) >> var_s.anInt2200);
								final int i_363_ = (i_361_
										* (var_s.anInt2206 - i_358_) + i_362_
										* i_358_ >> var_s.anInt2200);
								verticesY[i_353_] = (verticesY[i_353_] + ((i_363_ - i_313_)
										* (i_310_ - i_354_) / i_310_));
							}
						} else {
							verticesY[i_353_] = verticesY[i_353_];
						}
					}
				} else if (i == 3) {
					final int i_364_ = (i_310_ & 0xff) * 4;
					final int i_365_ = (i_310_ >> 8 & 0xff) * 4;
					final int i_366_ = (i_310_ >> 16 & 0xff) << 6;
					final int i_367_ = (i_310_ >> 24 & 0xff) << 6;
					if (i_312_ - (i_364_ >> 1) < 0
							|| (i_312_ + (i_364_ >> 1) + var_s.anInt2206 >= var_s.anInt2203 << var_s.anInt2200)
							|| i_314_ - (i_365_ >> 1) < 0
							|| (i_314_ + (i_365_ >> 1) + var_s.anInt2206 >= var_s.anInt2204 << var_s.anInt2200)) {
						return;
					}
					method2336(i_365_, i_364_, var_s, i_313_, i_312_, i_314_,
							i_366_, 2, i_367_);
				} else if (i == 4) {
					final int i_368_ = var_s_311_.anInt2206 - 1;
					final int i_369_ = aShort4808 - aShort4770;
					for (int i_370_ = 0; i_370_ < anInt4814; i_370_++) {
						final int i_371_ = verticesX[i_370_] + i_312_;
						final int i_372_ = verticesZ[i_370_] + i_314_;
						final int i_373_ = i_371_ & i_368_;
						final int i_374_ = i_372_ & i_368_;
						final int i_375_ = i_371_ >> var_s_311_.anInt2200;
						final int i_376_ = i_372_ >> var_s_311_.anInt2200;
						final int i_377_ = (((is_319_[i_375_][i_376_] * (var_s_311_.anInt2206 - i_373_)) + is_319_[i_375_ + 1][i_376_]
								* i_373_) >> var_s_311_.anInt2200);
						final int i_378_ = (((is_319_[i_375_][i_376_ + 1] * (var_s_311_.anInt2206 - i_373_)) + is_319_[i_375_ + 1][i_376_ + 1]
								* i_373_) >> var_s_311_.anInt2200);
						final int i_379_ = (i_377_
								* (var_s_311_.anInt2206 - i_374_) + i_378_
								* i_374_ >> var_s_311_.anInt2200);
						verticesY[i_370_] = (verticesY[i_370_]
								+ (i_379_ - i_313_) + i_369_);
					}
					for (int i_380_ = anInt4814; i_380_ < anInt4786; i_380_++) {
						final int i_381_ = verticesX[i_380_] + i_312_;
						final int i_382_ = verticesZ[i_380_] + i_314_;
						final int i_383_ = i_381_ & i_368_;
						final int i_384_ = i_382_ & i_368_;
						final int i_385_ = i_381_ >> var_s_311_.anInt2200;
						final int i_386_ = i_382_ >> var_s_311_.anInt2200;
						if (i_385_ >= 0 && i_385_ < var_s_311_.anInt2203 - 1
								&& i_386_ >= 0
								&& i_386_ < var_s_311_.anInt2204 - 1) {
							final int i_387_ = (((is_319_[i_385_][i_386_] * (var_s_311_.anInt2206 - i_383_)) + is_319_[i_385_ + 1][i_386_]
									* i_383_) >> var_s_311_.anInt2200);
							final int i_388_ = (((is_319_[i_385_][i_386_ + 1] * (var_s_311_.anInt2206 - i_383_)) + is_319_[i_385_ + 1][i_386_ + 1]
									* i_383_) >> var_s_311_.anInt2200);
							final int i_389_ = (i_387_
									* (var_s_311_.anInt2206 - i_384_) + i_388_
									* i_384_ >> var_s_311_.anInt2200);
							verticesY[i_380_] = (verticesY[i_380_]
									+ (i_389_ - i_313_) + i_369_);
						}
					}
				} else if (i == 5) {
					final int i_390_ = var_s_311_.anInt2206 - 1;
					final int i_391_ = aShort4808 - aShort4770;
					for (int i_392_ = 0; i_392_ < anInt4814; i_392_++) {
						final int i_393_ = verticesX[i_392_] + i_312_;
						final int i_394_ = verticesZ[i_392_] + i_314_;
						final int i_395_ = i_393_ & i_390_;
						final int i_396_ = i_394_ & i_390_;
						final int i_397_ = i_393_ >> var_s.anInt2200;
						final int i_398_ = i_394_ >> var_s.anInt2200;
						int i_399_ = ((is[i_397_][i_398_]
								* (var_s.anInt2206 - i_395_) + is[i_397_ + 1][i_398_]
								* i_395_) >> var_s.anInt2200);
						int i_400_ = ((is[i_397_][i_398_ + 1]
								* (var_s.anInt2206 - i_395_) + is[i_397_ + 1][i_398_ + 1]
								* i_395_) >> var_s.anInt2200);
						final int i_401_ = (i_399_ * (var_s.anInt2206 - i_396_)
								+ i_400_ * i_396_ >> var_s.anInt2200);
						i_399_ = (((is_319_[i_397_][i_398_] * (var_s_311_.anInt2206 - i_395_)) + is_319_[i_397_ + 1][i_398_]
								* i_395_) >> var_s_311_.anInt2200);
						i_400_ = (((is_319_[i_397_][i_398_ + 1] * (var_s_311_.anInt2206 - i_395_)) + is_319_[i_397_ + 1][i_398_ + 1]
								* i_395_) >> var_s_311_.anInt2200);
						final int i_402_ = (i_399_
								* (var_s_311_.anInt2206 - i_396_) + i_400_
								* i_396_ >> var_s_311_.anInt2200);
						final int i_403_ = i_401_ - i_402_ - i_310_;
						verticesY[i_392_] = ((verticesY[i_392_] << 8)
								/ i_391_ * i_403_ >> 8)
								- (i_313_ - i_401_);
					}
					for (int i_404_ = anInt4814; i_404_ < anInt4786; i_404_++) {
						final int i_405_ = verticesX[i_404_] + i_312_;
						final int i_406_ = verticesZ[i_404_] + i_314_;
						final int i_407_ = i_405_ & i_390_;
						final int i_408_ = i_406_ & i_390_;
						final int i_409_ = i_405_ >> var_s.anInt2200;
						final int i_410_ = i_406_ >> var_s.anInt2200;
						if (i_409_ >= 0 && i_409_ < var_s.anInt2203 - 1
								&& i_409_ < var_s_311_.anInt2203 - 1
								&& i_410_ >= 0 && i_410_ < var_s.anInt2204 - 1
								&& i_410_ < var_s_311_.anInt2204 - 1) {
							int i_411_ = ((is[i_409_][i_410_]
									* (var_s.anInt2206 - i_407_) + is[i_409_ + 1][i_410_]
									* i_407_) >> var_s.anInt2200);
							int i_412_ = (((is[i_409_][i_410_ + 1] * (var_s.anInt2206 - i_407_)) + is[i_409_ + 1][i_410_ + 1]
									* i_407_) >> var_s.anInt2200);
							final int i_413_ = (i_411_
									* (var_s.anInt2206 - i_408_) + i_412_
									* i_408_ >> var_s.anInt2200);
							i_411_ = (((is_319_[i_409_][i_410_] * (var_s_311_.anInt2206 - i_407_)) + is_319_[i_409_ + 1][i_410_]
									* i_407_) >> var_s_311_.anInt2200);
							i_412_ = (((is_319_[i_409_][i_410_ + 1] * (var_s_311_.anInt2206 - i_407_)) + is_319_[i_409_ + 1][i_410_ + 1]
									* i_407_) >> var_s_311_.anInt2200);
							final int i_414_ = (i_411_
									* (var_s_311_.anInt2206 - i_408_) + i_412_
									* i_408_ >> var_s_311_.anInt2200);
							final int i_415_ = i_413_ - i_414_ - i_310_;
							verticesY[i_404_] = (((verticesY[i_404_] << 8)
									/ i_391_ * i_415_) >> 8)
									- (i_313_ - i_413_);
						}
					}
				}
				aBoolean4778 = false;
			}
		}
	}

	private final void method2354(final boolean bool) {
		if (aHa_Sub2_4797.anInt4508 > 1) {
			synchronized (this) {
				method2363(bool);
			}
		} else {
			method2363(bool);
		}
	}

	private final void method2355(final Thread thread) {
		final Class235 class235 = aHa_Sub2_4797.method1921(thread);
		if (class235 != aClass235_4752) {
			aClass235_4752 = class235;
			aClass146_Sub1_4764 = aClass235_4752.aClass146_Sub1_1774;
			aClass146_Sub1_4773 = aClass235_4752.aClass146_Sub1_1790;
			aClass146_Sub1_4779 = aClass235_4752.aClass146_Sub1_1778;
			aClass146_Sub1_4775 = aClass235_4752.aClass146_Sub1_1769;
			aClass146_Sub1_4759 = aClass235_4752.aClass146_Sub1_1776;
			aClass146_Sub1_4756 = aClass235_4752.aClass146_Sub1_1800;
			aClass146_Sub1_4783 = aClass235_4752.aClass146_Sub1_1787;
			aClass146_Sub1_4785 = aClass235_4752.aClass146_Sub1_1793;
			aClass146_Sub1_4831 = aClass235_4752.aClass146_Sub1_1798;
			aClass146_Sub1_4769 = aClass235_4752.aClass146_Sub1_1772;
		}
	}

	private final int method2356(int i) {
		if (i < 2) {
			i = 2;
		} else if (i > 126) {
			i = 126;
		}
		return i;
	}

	@Override
	final boolean F() {
		return aBoolean4755;
	}

	private final void method2357() {
		synchronized (this) {
			for (int i = 0; i < anInt4786; i++) {
				final int i_416_ = verticesX[i];
				verticesX[i] = verticesZ[i];
				verticesZ[i] = -i_416_;
			}
			method2364();
		}
	}

	@Override
	final boolean method2339(final int i, final int i_417_,
			final Class111 class111, final boolean bool, final int i_418_) {
		return method2372(i, i_417_, class111, bool, i_418_, -1);
	}

	@Override
	final int RA() {
		if (!aBoolean4778) {
			method2346();
		}
		return aShort4801;
	}

	private final boolean method2358(final int i) {
		if (anIntArray4758 == null) {
			return false;
		}
		if (anIntArray4758[i] == -1) {
			return false;
		}
		return true;
	}

	private final void method2359(final boolean bool, final boolean bool_419_,
			final int i, final int i_420_) {
		if (aClass170Array4827 != null) {
			for (int i_421_ = 0; i_421_ < anInt4776; i_421_++) {
				final Class170 class170 = aClass170Array4827[i_421_];
				anIntArray4758[class170.anInt1315] = i_421_;
			}
		}
		if (aBoolean4755 || aClass170Array4827 != null) {
			if ((anInt4816 & 0x100) == 0 && aShortArray4809 != null) {
				for (int i_422_ = 0; i_422_ < anInt4780; i_422_++) {
					final short i_423_ = aShortArray4809[i_422_];
					method2371(i_423_, bool, bool_419_);
				}
			} else {
				for (int i_424_ = 0; i_424_ < anInt4780; i_424_++) {
					if (!method2362(i_424_) && !method2358(i_424_)) {
						method2371(i_424_, bool, bool_419_);
					}
				}
				if (aByteArray4772 == null) {
					for (int i_425_ = 0; i_425_ < anInt4780; i_425_++) {
						if (method2362(i_425_) || method2358(i_425_)) {
							method2371(i_425_, bool, bool_419_);
						}
					}
				} else {
					for (int i_426_ = 0; i_426_ < 12; i_426_++) {
						for (int i_427_ = 0; i_427_ < anInt4780; i_427_++) {
							if (aByteArray4772[i_427_] == i_426_
									&& (method2362(i_427_) || method2358(i_427_))) {
								method2371(i_427_, bool, bool_419_);
							}
						}
					}
				}
			}
		} else {
			for (int i_428_ = 0; i_428_ < anInt4780; i_428_++) {
				method2371(i_428_, bool, bool_419_);
			}
		}
	}

	@Override
	final int na() {
		if (!aBoolean4778) {
			method2346();
		}
		return aShort4835;
	}

	@Override
	final void method2325(final Class111 class111,
			final Class246_Sub6 class246_sub6, final int i) {
		method2348(class111, class246_sub6, -1, i);
	}

	@Override
	final int HA() {
		if (!aBoolean4778) {
			method2346();
		}
		return aShort4774;
	}

	private final int method2360(final int i, final short i_429_,
			final int i_430_) {
		int i_431_ = Class208.anIntArray1579[method2349(i, i_430_)];
		final TextureDefinition textureDefinition = ((ha) aHa_Sub2_4797).aD938.method11(
				i_429_ & 0xffff, -28755);
		final int i_432_ = textureDefinition.aByte1830 & 0xff;
		if (i_432_ != 0) {
			final int i_433_ = 131586 * i_430_;
			if (i_432_ == 256) {
				i_431_ = i_433_;
			} else {
				final int i_434_ = i_432_;
				final int i_435_ = 256 - i_432_;
				i_431_ = ((((i_433_ & 0xff00ff) * i_434_ + (i_431_ & 0xff00ff)
						* i_435_) & ~0xff00ff) + (((i_433_ & 0xff00) * i_434_ + (i_431_ & 0xff00)
						* i_435_) & 0xff0000)) >> 8;
			}
		}
		int i_436_ = textureDefinition.aByte1829 & 0xff;
		if (i_436_ != 0) {
			i_436_ += 256;
			int i_437_ = ((i_431_ & 0xff0000) >> 16) * i_436_;
			if (i_437_ > 65535) {
				i_437_ = 65535;
			}
			int i_438_ = ((i_431_ & 0xff00) >> 8) * i_436_;
			if (i_438_ > 65535) {
				i_438_ = 65535;
			}
			int i_439_ = (i_431_ & 0xff) * i_436_;
			if (i_439_ > 65535) {
				i_439_ = 65535;
			}
			i_431_ = (i_437_ << 8 & 0xff0000) + (i_438_ & 0xff00)
					+ (i_439_ >> 8);
		}
		return i_431_;
	}

	private final boolean method2361(final int i, final int i_440_,
			final int i_441_, final int i_442_, final int i_443_,
			final int i_444_, final int i_445_, final int i_446_) {
		if (i_440_ < i_441_ && i_440_ < i_442_ && i_440_ < i_443_) {
			return false;
		}
		if (i_440_ > i_441_ && i_440_ > i_442_ && i_440_ > i_443_) {
			return false;
		}
		if (i < i_444_ && i < i_445_ && i < i_446_) {
			return false;
		}
		if (i > i_444_ && i > i_445_ && i > i_446_) {
			return false;
		}
		return true;
	}

	@Override
	final Class146 method2341(final byte i, final int i_447_, final boolean bool) {
		method2355(Thread.currentThread());
		Class146_Sub1 class146_sub1_448_;
		Class146_Sub1 class146_sub1_449_;
		if (i == 1) {
			class146_sub1_448_ = aClass146_Sub1_4756;
			class146_sub1_449_ = aClass146_Sub1_4764;
		} else if (i == 2) {
			class146_sub1_448_ = aClass146_Sub1_4783;
			class146_sub1_449_ = aClass146_Sub1_4773;
		} else if (i == 3) {
			class146_sub1_448_ = aClass146_Sub1_4785;
			class146_sub1_449_ = aClass146_Sub1_4779;
		} else if (i == 4) {
			class146_sub1_448_ = aClass146_Sub1_4831;
			class146_sub1_449_ = aClass146_Sub1_4775;
		} else if (i == 5) {
			class146_sub1_448_ = aClass146_Sub1_4769;
			class146_sub1_449_ = aClass146_Sub1_4759;
		} else {
			class146_sub1_449_ = class146_sub1_448_ = new Class146_Sub1(
					aHa_Sub2_4797);
		}
		return method2367(class146_sub1_449_, class146_sub1_448_, i_447_,
				i != 0, bool);
	}

	private final boolean method2362(final int i) {
		if (aByteArray4822 == null) {
			return false;
		}
		if (aByteArray4822[i] == 0) {
			return false;
		}
		return true;
	}

	private final void method2363(final boolean bool) {
		if (anInt4784 == 1) {
			method2366();
		} else if (anInt4784 == 2) {
			if ((anInt4816 & 0x97098) == 0 && aFloatArrayArray4798 == null) {
				aShortArray4800 = null;
			}
			if (bool) {
				aByteArray4793 = null;
			}
		} else {
			method2353();
			final int i = aHa_Sub2_4797.anInt4481;
			final int i_450_ = aHa_Sub2_4797.anInt4515;
			final int i_451_ = aHa_Sub2_4797.anInt4500;
			final int i_452_ = aHa_Sub2_4797.anInt4516 >> 8;
			final int i_453_ = aHa_Sub2_4797.anInt4501 * 768 / anInt4805;
			final int i_454_ = aHa_Sub2_4797.anInt4489 * 768 / anInt4805;
			if (anIntArray4791 == null) {
				anIntArray4791 = new int[anInt4780];
				anIntArray4760 = new int[anInt4780];
				anIntArray4836 = new int[anInt4780];
			}
			for (int i_455_ = 0; i_455_ < anInt4780; i_455_++) {
				byte i_456_;
				if (aByteArray4793 == null) {
					i_456_ = (byte) 0;
				} else {
					i_456_ = aByteArray4793[i_455_];
				}
				byte i_457_;
				if (aByteArray4822 == null) {
					i_457_ = (byte) 0;
				} else {
					i_457_ = aByteArray4822[i_455_];
				}
				short i_458_;
				if (aShortArray4804 == null) {
					i_458_ = (short) -1;
				} else {
					i_458_ = aShortArray4804[i_455_];
				}
				if (i_457_ == -2) {
					i_456_ = (byte) 3;
				}
				if (i_457_ == -1) {
					i_456_ = (byte) 2;
				}
				if (i_458_ == -1) {
					if (i_456_ == 0) {
						final int i_459_ = aShortArray4800[i_455_] & 0xffff;
						final int i_460_ = (i_459_ & 0x7f) * anInt4761 >> 7;
						final short i_461_ = Class111_Sub2.method2117(i_459_
								& ~0x7f | i_460_, 76);
						Class274 class274;
						if (aClass274Array4777 != null
								&& (aClass274Array4777[triangleViewspaceX[i_455_]] != null)) {
							class274 = aClass274Array4777[triangleViewspaceX[i_455_]];
						} else {
							class274 = aClass274Array4789[triangleViewspaceX[i_455_]];
						}
						int i_462_ = (((i * class274.anInt2044 + i_450_
								* class274.anInt2043 + i_451_
								* class274.anInt2042) / class274.anInt2045) >> 16);
						int i_463_ = i_462_ > 256 ? i_453_ : i_454_;
						int i_464_ = (i_452_ >> 1) + (i_463_ * i_462_ >> 17);
						anIntArray4791[i_455_] = (i_464_ << 17 | Class246_Sub7
								.method3132(i_464_, (byte) 118, i_461_));
						if (aClass274Array4777 != null
								&& (aClass274Array4777[triangleViewspaceY[i_455_]] != null)) {
							class274 = aClass274Array4777[triangleViewspaceY[i_455_]];
						} else {
							class274 = aClass274Array4789[triangleViewspaceY[i_455_]];
						}
						i_462_ = ((i * class274.anInt2044 + i_450_
								* class274.anInt2043 + i_451_
								* class274.anInt2042) / class274.anInt2045) >> 16;
						i_463_ = i_462_ > 256 ? i_453_ : i_454_;
						i_464_ = (i_452_ >> 1) + (i_463_ * i_462_ >> 17);
						anIntArray4760[i_455_] = (i_464_ << 17 | Class246_Sub7
								.method3132(i_464_, (byte) 118, i_461_));
						if (aClass274Array4777 != null
								&& (aClass274Array4777[triangleViewspaceZ[i_455_]] != null)) {
							class274 = aClass274Array4777[triangleViewspaceZ[i_455_]];
						} else {
							class274 = aClass274Array4789[triangleViewspaceZ[i_455_]];
						}
						i_462_ = ((i * class274.anInt2044 + i_450_
								* class274.anInt2043 + i_451_
								* class274.anInt2042) / class274.anInt2045) >> 16;
						i_463_ = i_462_ > 256 ? i_453_ : i_454_;
						i_464_ = (i_452_ >> 1) + (i_463_ * i_462_ >> 17);
						anIntArray4836[i_455_] = (i_464_ << 17 | Class246_Sub7
								.method3132(i_464_, (byte) 118, i_461_));
					} else if (i_456_ == 1) {
						final int i_465_ = aShortArray4800[i_455_] & 0xffff;
						final int i_466_ = (i_465_ & 0x7f) * anInt4761 >> 7;
						final short i_467_ = Class111_Sub2.method2117(i_465_
								& ~0x7f | i_466_, -97);
						final Class296 class296 = aClass296Array4823[i_455_];
						final int i_468_ = ((i * class296.anInt2411 + i_450_
								* class296.anInt2412 + i_451_
								* class296.anInt2413) >> 16);
						final int i_469_ = i_468_ > 256 ? i_453_ : i_454_;
						final int i_470_ = (i_452_ >> 1)
								+ (i_469_ * i_468_ >> 17);
						anIntArray4791[i_455_] = (i_470_ << 17 | Class246_Sub7
								.method3132(i_470_, (byte) 118, i_467_));
						anIntArray4836[i_455_] = -1;
					} else if (i_456_ == 3) {
						anIntArray4791[i_455_] = 128;
						anIntArray4836[i_455_] = -1;
					} else {
						anIntArray4836[i_455_] = -2;
					}
				} else {
					final int i_471_ = aShortArray4800[i_455_] & 0xffff;
					if (i_456_ == 0) {
						Class274 class274;
						if (aClass274Array4777 != null
								&& (aClass274Array4777[triangleViewspaceX[i_455_]] != null)) {
							class274 = aClass274Array4777[triangleViewspaceX[i_455_]];
						} else {
							class274 = aClass274Array4789[triangleViewspaceX[i_455_]];
						}
						int i_472_ = (((i * class274.anInt2044 + i_450_
								* class274.anInt2043 + i_451_
								* class274.anInt2042) / class274.anInt2045) >> 16);
						int i_473_ = i_472_ > 256 ? i_453_ : i_454_;
						int i_474_ = method2356((i_452_ >> 2)
								+ (i_473_ * i_472_ >> 18));
						anIntArray4791[i_455_] = i_474_ << 24
								| method2360(i_471_, i_458_, i_474_);
						if (aClass274Array4777 != null
								&& (aClass274Array4777[triangleViewspaceY[i_455_]] != null)) {
							class274 = aClass274Array4777[triangleViewspaceY[i_455_]];
						} else {
							class274 = aClass274Array4789[triangleViewspaceY[i_455_]];
						}
						i_472_ = ((i * class274.anInt2044 + i_450_
								* class274.anInt2043 + i_451_
								* class274.anInt2042) / class274.anInt2045) >> 16;
						i_473_ = i_472_ > 256 ? i_453_ : i_454_;
						i_474_ = method2356((i_452_ >> 2)
								+ (i_473_ * i_472_ >> 18));
						anIntArray4760[i_455_] = i_474_ << 24
								| method2360(i_471_, i_458_, i_474_);
						if (aClass274Array4777 != null
								&& (aClass274Array4777[triangleViewspaceZ[i_455_]] != null)) {
							class274 = aClass274Array4777[triangleViewspaceZ[i_455_]];
						} else {
							class274 = aClass274Array4789[triangleViewspaceZ[i_455_]];
						}
						i_472_ = ((i * class274.anInt2044 + i_450_
								* class274.anInt2043 + i_451_
								* class274.anInt2042) / class274.anInt2045) >> 16;
						i_473_ = i_472_ > 256 ? i_453_ : i_454_;
						i_474_ = method2356((i_452_ >> 2)
								+ (i_473_ * i_472_ >> 18));
						anIntArray4836[i_455_] = i_474_ << 24
								| method2360(i_471_, i_458_, i_474_);
					} else if (i_456_ == 1) {
						final Class296 class296 = aClass296Array4823[i_455_];
						final int i_475_ = ((i * class296.anInt2411 + i_450_
								* class296.anInt2412 + i_451_
								* class296.anInt2413) >> 16);
						final int i_476_ = i_475_ > 256 ? i_453_ : i_454_;
						final int i_477_ = method2356((i_452_ >> 2)
								+ (i_476_ * i_475_ >> 18));
						anIntArray4791[i_455_] = i_477_ << 24
								| method2360(i_471_, i_458_, i_477_);
						anIntArray4836[i_455_] = -1;
					} else {
						anIntArray4836[i_455_] = -2;
					}
				}
			}
			aClass274Array4789 = null;
			aClass274Array4777 = null;
			aClass296Array4823 = null;
			if ((anInt4816 & 0x97098) == 0 && aFloatArrayArray4798 == null) {
				aShortArray4800 = null;
			}
			if (bool) {
				aByteArray4793 = null;
			}
			anInt4784 = 2;
		}
	}

	@Override
	final void wa() {
		if (aBoolean4815) {
			for (int i = 0; i < anInt4786; i++) {
				verticesX[i] = verticesX[i] + 7 >> 4;
				verticesY[i] = verticesY[i] + 7 >> 4;
				verticesZ[i] = verticesZ[i] + 7 >> 4;
			}
			aBoolean4815 = false;
		}
		if (aBoolean4754) {
			method2366();
			aBoolean4754 = false;
		}
		aBoolean4778 = false;
	}

	@Override
	final void a(final int i) {
		if ((anInt4816 & 0x5) != 5) {
			throw new IllegalStateException();
		}
		if (i == 4096) {
			method2357();
		} else if (i == 8192) {
			method2370();
		} else if (i == 12288) {
			method2374();
		} else {
			final int i_478_ = Class284_Sub2_Sub2.anIntArray6200[i];
			final int i_479_ = Class284_Sub2_Sub2.anIntArray6202[i];
			synchronized (this) {
				for (int i_480_ = 0; i_480_ < anInt4786; i_480_++) {
					final int i_481_ = ((verticesZ[i_480_] * i_478_ + verticesX[i_480_]
							* i_479_) >> 14);
					verticesZ[i_480_] = (verticesZ[i_480_] * i_479_ - verticesX[i_480_]
							* i_478_) >> 14;
					verticesX[i_480_] = i_481_;
				}
				method2364();
			}
		}
	}

	@Override
	final void P(final int i, final int i_482_, final int i_483_,
			final int i_484_) {
		if (i == 0) {
			int i_485_ = 0;
			anInt4792 = 0;
			anInt4781 = 0;
			anInt4757 = 0;
			for (int i_486_ = 0; i_486_ < anInt4786; i_486_++) {
				anInt4792 += verticesX[i_486_];
				anInt4781 += verticesY[i_486_];
				anInt4757 += verticesZ[i_486_];
				i_485_++;
			}
			if (i_485_ > 0) {
				anInt4792 = anInt4792 / i_485_ + i_482_;
				anInt4781 = anInt4781 / i_485_ + i_483_;
				anInt4757 = anInt4757 / i_485_ + i_484_;
			} else {
				anInt4792 = i_482_;
				anInt4781 = i_483_;
				anInt4757 = i_484_;
			}
		} else if (i == 1) {
			for (int i_487_ = 0; i_487_ < anInt4786; i_487_++) {
				verticesX[i_487_] += i_482_;
				verticesY[i_487_] += i_483_;
				verticesZ[i_487_] += i_484_;
			}
		} else if (i == 2) {
			for (int i_488_ = 0; i_488_ < anInt4786; i_488_++) {
				verticesX[i_488_] -= anInt4792;
				verticesY[i_488_] -= anInt4781;
				verticesZ[i_488_] -= anInt4757;
				if (i_484_ != 0) {
					final int i_489_ = Class284_Sub2_Sub2.anIntArray6200[i_484_];
					final int i_490_ = Class284_Sub2_Sub2.anIntArray6202[i_484_];
					final int i_491_ = ((verticesY[i_488_] * i_489_
							+ verticesX[i_488_] * i_490_ + 16383) >> 14);
					verticesY[i_488_] = (verticesY[i_488_] * i_490_
							- verticesX[i_488_] * i_489_ + 16383) >> 14;
					verticesX[i_488_] = i_491_;
				}
				if (i_482_ != 0) {
					final int i_492_ = Class284_Sub2_Sub2.anIntArray6200[i_482_];
					final int i_493_ = Class284_Sub2_Sub2.anIntArray6202[i_482_];
					final int i_494_ = ((verticesY[i_488_] * i_493_
							- verticesZ[i_488_] * i_492_ + 16383) >> 14);
					verticesZ[i_488_] = (verticesY[i_488_] * i_492_
							+ verticesZ[i_488_] * i_493_ + 16383) >> 14;
					verticesY[i_488_] = i_494_;
				}
				if (i_483_ != 0) {
					final int i_495_ = Class284_Sub2_Sub2.anIntArray6200[i_483_];
					final int i_496_ = Class284_Sub2_Sub2.anIntArray6202[i_483_];
					final int i_497_ = ((verticesZ[i_488_] * i_495_
							+ verticesX[i_488_] * i_496_ + 16383) >> 14);
					verticesZ[i_488_] = (verticesZ[i_488_] * i_496_
							- verticesX[i_488_] * i_495_ + 16383) >> 14;
					verticesX[i_488_] = i_497_;
				}
				verticesX[i_488_] += anInt4792;
				verticesY[i_488_] += anInt4781;
				verticesZ[i_488_] += anInt4757;
			}
		} else if (i == 3) {
			for (int i_498_ = 0; i_498_ < anInt4786; i_498_++) {
				verticesX[i_498_] -= anInt4792;
				verticesY[i_498_] -= anInt4781;
				verticesZ[i_498_] -= anInt4757;
				verticesX[i_498_] = verticesX[i_498_] * i_482_ / 128;
				verticesY[i_498_] = verticesY[i_498_] * i_483_ / 128;
				verticesZ[i_498_] = verticesZ[i_498_] * i_484_ / 128;
				verticesX[i_498_] += anInt4792;
				verticesY[i_498_] += anInt4781;
				verticesZ[i_498_] += anInt4757;
			}
		} else if (i == 5) {
			for (int i_499_ = 0; i_499_ < anInt4780; i_499_++) {
				int i_500_ = (aByteArray4822[i_499_] & 0xff) + i_482_ * 8;
				if (i_500_ < 0) {
					i_500_ = 0;
				} else if (i_500_ > 255) {
					i_500_ = 255;
				}
				aByteArray4822[i_499_] = (byte) i_500_;
			}
			if (aClass170Array4827 != null) {
				for (int i_501_ = 0; i_501_ < anInt4776; i_501_++) {
					final Class170 class170 = aClass170Array4827[i_501_];
					final Class329 class329 = aClass329Array4821[i_501_];
					class329.anInt2770 = (class329.anInt2770 & 0xffffff | 255 - ((aByteArray4822[class170.anInt1315]) & 0xff) << 24);
				}
			}
		} else if (i == 7) {
			for (int i_502_ = 0; i_502_ < anInt4780; i_502_++) {
				final int i_503_ = aShortArray4800[i_502_] & 0xffff;
				int i_504_ = i_503_ >> 10 & 0x3f;
				int i_505_ = i_503_ >> 7 & 0x7;
				int i_506_ = i_503_ & 0x7f;
				i_504_ = i_504_ + i_482_ & 0x3f;
				i_505_ += i_483_;
				if (i_505_ < 0) {
					i_505_ = 0;
				} else if (i_505_ > 7) {
					i_505_ = 7;
				}
				i_506_ += i_484_;
				if (i_506_ < 0) {
					i_506_ = 0;
				} else if (i_506_ > 127) {
					i_506_ = 127;
				}
				aShortArray4800[i_502_] = (short) (i_504_ << 10 | i_505_ << 7 | i_506_);
			}
			aBoolean4754 = true;
			if (aClass170Array4827 != null) {
				for (int i_507_ = 0; i_507_ < anInt4776; i_507_++) {
					final Class170 class170 = aClass170Array4827[i_507_];
					final Class329 class329 = aClass329Array4821[i_507_];
					class329.anInt2770 = (class329.anInt2770 & ~0xffffff | ((Class221.anIntArray1665[Class111_Sub2
							.method2117(
									((aShortArray4800[(class170.anInt1315)]) & 0xffff),
									83) & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_508_ = 0; i_508_ < anInt4776; i_508_++) {
				final Class329 class329 = aClass329Array4821[i_508_];
				class329.anInt2762 += i_482_;
				class329.anInt2772 += i_483_;
			}
		} else if (i == 10) {
			for (int i_509_ = 0; i_509_ < anInt4776; i_509_++) {
				final Class329 class329 = aClass329Array4821[i_509_];
				class329.anInt2763 = class329.anInt2763 * i_482_ >> 7;
				class329.anInt2768 = class329.anInt2768 * i_483_ >> 7;
			}
		} else if (i == 9) {
			for (int i_510_ = 0; i_510_ < anInt4776; i_510_++) {
				final Class329 class329 = aClass329Array4821[i_510_];
				class329.anInt2769 = class329.anInt2769 + i_482_ & 0x3fff;
			}
		}
	}

	@Override
	final void ia(final short i, final short i_511_) {
		for (int i_512_ = 0; i_512_ < anInt4780; i_512_++) {
			if (aShortArray4800[i_512_] == i) {
				aShortArray4800[i_512_] = i_511_;
			}
		}
		if (aClass170Array4827 != null) {
			for (int i_513_ = 0; i_513_ < anInt4776; i_513_++) {
				final Class170 class170 = aClass170Array4827[i_513_];
				final Class329 class329 = aClass329Array4821[i_513_];
				class329.anInt2770 = (class329.anInt2770 & ~0xffffff | ((Class221.anIntArray1665[Class111_Sub2
						.method2117((aShortArray4800[(class170.anInt1315)]),
								-54) & 0xffff]) & 0xffffff));
			}
		}
		if (anInt4784 == 2) {
			anInt4784 = 1;
		}
	}

	private final void method2364() {
		aClass274Array4789 = null;
		aClass274Array4777 = null;
		aClass296Array4823 = null;
		aBoolean4778 = false;
	}

	@Override
	final void method2332(final Class146 class146, final int i,
			final int i_514_, final int i_515_, final boolean bool) {
		final Class146_Sub1 class146_sub1_516_ = (Class146_Sub1) class146;
		if ((anInt4816 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		}
		if ((class146_sub1_516_.anInt4816 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		}
		method2351(Thread.currentThread());
		method2346();
		method2353();
		class146_sub1_516_.method2346();
		class146_sub1_516_.method2353();
		anInt4830++;
		int i_517_ = 0;
		final int[] is = class146_sub1_516_.verticesX;
		final int i_518_ = class146_sub1_516_.anInt4814;
		for (int i_519_ = 0; i_519_ < anInt4814; i_519_++) {
			final Class274 class274 = aClass274Array4789[i_519_];
			if (class274.anInt2045 != 0) {
				final int i_520_ = verticesY[i_519_] - i_514_;
				if (i_520_ >= class146_sub1_516_.aShort4770
						&& i_520_ <= class146_sub1_516_.aShort4808) {
					final int i_521_ = verticesX[i_519_] - i;
					if (i_521_ >= class146_sub1_516_.aShort4794
							&& i_521_ <= class146_sub1_516_.aShort4801) {
						final int i_522_ = verticesZ[i_519_] - i_515_;
						if (i_522_ >= class146_sub1_516_.aShort4774
								&& i_522_ <= class146_sub1_516_.aShort4753) {
							for (int i_523_ = 0; i_523_ < i_518_; i_523_++) {
								final Class274 class274_524_ = (class146_sub1_516_.aClass274Array4789[i_523_]);
								if (i_521_ == is[i_523_]
										&& i_522_ == (class146_sub1_516_.verticesZ[i_523_])
										&& i_520_ == (class146_sub1_516_.verticesY[i_523_])
										&& (class274_524_.anInt2045 != 0)) {
									if (aClass274Array4777 == null) {
										aClass274Array4777 = new Class274[anInt4814];
									}
									if (class146_sub1_516_.aClass274Array4777 == null) {
										class146_sub1_516_.aClass274Array4777 = new Class274[i_518_];
									}
									Class274 class274_525_ = aClass274Array4777[i_519_];
									if (class274_525_ == null) {
										class274_525_ = aClass274Array4777[i_519_] = new Class274(
												class274);
									}
									Class274 class274_526_ = (class146_sub1_516_.aClass274Array4777[i_523_]);
									if (class274_526_ == null) {
										class274_526_ = class146_sub1_516_.aClass274Array4777[i_523_] = new Class274(
												class274_524_);
									}
									class274_525_.anInt2044 += (class274_524_.anInt2044);
									class274_525_.anInt2043 += (class274_524_.anInt2043);
									class274_525_.anInt2042 += (class274_524_.anInt2042);
									class274_525_.anInt2045 += (class274_524_.anInt2045);
									class274_526_.anInt2044 += class274.anInt2044;
									class274_526_.anInt2043 += class274.anInt2043;
									class274_526_.anInt2042 += class274.anInt2042;
									class274_526_.anInt2045 += class274.anInt2045;
									i_517_++;
									anIntArray4803[i_519_] = anInt4830;
									anIntArray4820[i_523_] = anInt4830;
								}
							}
						}
					}
				}
			}
		}
		if (i_517_ >= 3 && bool) {
			for (int i_527_ = 0; i_527_ < anInt4780; i_527_++) {
				if (anIntArray4803[triangleViewspaceX[i_527_]] == anInt4830
						&& anIntArray4803[triangleViewspaceY[i_527_]] == anInt4830
						&& anIntArray4803[triangleViewspaceZ[i_527_]] == anInt4830) {
					if (aByteArray4793 == null) {
						aByteArray4793 = new byte[anInt4780];
					}
					aByteArray4793[i_527_] = (byte) 2;
				}
			}
			for (int i_528_ = 0; i_528_ < class146_sub1_516_.anInt4780; i_528_++) {
				if ((anIntArray4820[class146_sub1_516_.triangleViewspaceX[i_528_]] == anInt4830)
						&& anIntArray4820[(class146_sub1_516_.triangleViewspaceY[i_528_])] == anInt4830
						&& anIntArray4820[(class146_sub1_516_.triangleViewspaceZ[i_528_])] == anInt4830) {
					if (class146_sub1_516_.aByteArray4793 == null) {
						class146_sub1_516_.aByteArray4793 = new byte[class146_sub1_516_.anInt4780];
					}
					class146_sub1_516_.aByteArray4793[i_528_] = (byte) 2;
				}
			}
		}
	}

	@Override
	final int WA() {
		return anInt4761;
	}

	private final void method2365(final int i) {
		final short i_529_ = triangleViewspaceX[i];
		final short i_530_ = triangleViewspaceY[i];
		final short i_531_ = triangleViewspaceZ[i];
		if (aShortArray4804 == null || aShortArray4804[i] == -1) {
			if (aByteArray4822 == null) {
				aClass12_4768.anInt137 = 0;
			} else {
				aClass12_4768.anInt137 = aByteArray4822[i] & 0xff;
			}
			if (anIntArray4836[i] == -1) {
				aClass12_4768.method208(anIntArray4812[i_529_],
						anIntArray4812[i_530_], anIntArray4812[i_531_],
						anIntArray4771[i_529_], anIntArray4771[i_530_],
						anIntArray4771[i_531_], anIntArray4766[i_529_],
						anIntArray4766[i_530_], anIntArray4766[i_531_],
						(Class221.anIntArray1665[anIntArray4791[i] & 0xffff]));
			} else {
				aClass12_4768.method216(anIntArray4812[i_529_],
						anIntArray4812[i_530_], anIntArray4812[i_531_],
						anIntArray4771[i_529_], anIntArray4771[i_530_],
						anIntArray4771[i_531_], anIntArray4766[i_529_],
						anIntArray4766[i_530_], anIntArray4766[i_531_],
						anIntArray4791[i] & 0xffff, anIntArray4760[i] & 0xffff,
						anIntArray4836[i] & 0xffff);
			}
		} else {
			int i_532_ = -16777216;
			if (aByteArray4822 != null) {
				i_532_ = 255 - (aByteArray4822[i] & 0xff) << 24;
			}
			if (anIntArray4836[i] == -1) {
				final int i_533_ = i_532_ | anIntArray4791[i] & 0xffffff;
				aClass12_4768.method212(anIntArray4812[i_529_],
						anIntArray4812[i_530_], anIntArray4812[i_531_],
						anIntArray4771[i_529_], anIntArray4771[i_530_],
						anIntArray4771[i_531_], anIntArray4766[i_529_],
						anIntArray4766[i_530_], anIntArray4766[i_531_],
						aFloatArrayArray4798[i][0], aFloatArrayArray4798[i][1],
						aFloatArrayArray4798[i][2], aFloatArrayArray4806[i][0],
						aFloatArrayArray4806[i][1], aFloatArrayArray4806[i][2],
						i_533_, i_533_, i_533_, aClass235_4807.anInt1763, 0, 0,
						0, aShortArray4804[i]);
			} else {
				aClass12_4768.method212(anIntArray4812[i_529_],
						anIntArray4812[i_530_], anIntArray4812[i_531_],
						anIntArray4771[i_529_], anIntArray4771[i_530_],
						anIntArray4771[i_531_], anIntArray4766[i_529_],
						anIntArray4766[i_530_], anIntArray4766[i_531_],
						aFloatArrayArray4798[i][0], aFloatArrayArray4798[i][1],
						aFloatArrayArray4798[i][2], aFloatArrayArray4806[i][0],
						aFloatArrayArray4806[i][1], aFloatArrayArray4806[i][2],
						i_532_ | anIntArray4791[i] & 0xffffff, i_532_
								| anIntArray4760[i] & 0xffffff, i_532_
								| anIntArray4836[i] & 0xffffff,
						aClass235_4807.anInt1763, 0, 0, 0, aShortArray4804[i]);
			}
		}
	}

	@Override
	final boolean NA() {
		if (anIntArrayArray4834 == null) {
			return false;
		}
		anInt4792 = 0;
		anInt4781 = 0;
		anInt4757 = 0;
		return true;
	}

	@Override
	final void method2342() {
		if (aHa_Sub2_4797.anInt4508 > 1) {
			synchronized (this) {
				while (((Class146) this).aBoolean1181) {
					try {
						this.wait();
					} catch (final InterruptedException interruptedexception) {
						/* empty */
					}
				}
				((Class146) this).aBoolean1181 = true;
			}
		}
	}

	private final void method2366() {
		if (anInt4784 == 0) {
			method2354(false);
		} else if (aHa_Sub2_4797.anInt4508 > 1) {
			synchronized (this) {
				method2352();
			}
		} else {
			method2352();
		}
	}

	private final Class146 method2367(final Class146_Sub1 class146_sub1_534_,
			final Class146_Sub1 class146_sub1_535_, final int i,
			final boolean bool, final boolean bool_536_) {
		class146_sub1_534_.aBoolean4778 = aBoolean4778;
		if (aBoolean4778) {
			class146_sub1_534_.aShort4801 = aShort4801;
			class146_sub1_534_.aShort4808 = aShort4808;
			class146_sub1_534_.aShort4753 = aShort4753;
			class146_sub1_534_.aShort4794 = aShort4794;
			class146_sub1_534_.aShort4770 = aShort4770;
			class146_sub1_534_.aShort4774 = aShort4774;
			class146_sub1_534_.aShort4835 = aShort4835;
			class146_sub1_534_.aShort4826 = aShort4826;
		}
		class146_sub1_534_.anInt4761 = anInt4761;
		class146_sub1_534_.anInt4805 = anInt4805;
		class146_sub1_534_.anInt4786 = anInt4786;
		class146_sub1_534_.anInt4814 = anInt4814;
		class146_sub1_534_.anInt4780 = anInt4780;
		class146_sub1_534_.anInt4776 = anInt4776;
		if ((i & 0x100) != 0) {
			class146_sub1_534_.aBoolean4755 = true;
		} else {
			class146_sub1_534_.aBoolean4755 = aBoolean4755;
		}
		class146_sub1_534_.aBoolean4802 = aBoolean4802;
		final boolean bool_537_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		final boolean bool_538_ = bool_537_ || (i & 0x1) != 0;
		final boolean bool_539_ = bool_537_ || (i & 0x2) != 0;
		final boolean bool_540_ = bool_537_ || (i & 0x4) != 0
				|| (i & 0x10) != 0;
		if (bool_538_ || bool_539_ || bool_540_) {
			if (bool_538_) {
				if (class146_sub1_535_.verticesX == null
						|| class146_sub1_535_.verticesX.length < anInt4786) {
					class146_sub1_534_.verticesX = class146_sub1_535_.verticesX = new int[anInt4786];
				} else {
					class146_sub1_534_.verticesX = class146_sub1_535_.verticesX;
				}
				for (int i_541_ = 0; i_541_ < anInt4786; i_541_++) {
					class146_sub1_534_.verticesX[i_541_] = verticesX[i_541_];
				}
			} else {
				class146_sub1_534_.verticesX = verticesX;
			}
			if (bool_539_) {
				if (class146_sub1_535_.verticesY == null
						|| class146_sub1_535_.verticesY.length < anInt4786) {
					class146_sub1_534_.verticesY = class146_sub1_535_.verticesY = new int[anInt4786];
				} else {
					class146_sub1_534_.verticesY = class146_sub1_535_.verticesY;
				}
				for (int i_542_ = 0; i_542_ < anInt4786; i_542_++) {
					class146_sub1_534_.verticesY[i_542_] = verticesY[i_542_];
				}
			} else {
				class146_sub1_534_.verticesY = verticesY;
			}
			if (bool_540_) {
				if (class146_sub1_535_.verticesZ == null
						|| class146_sub1_535_.verticesZ.length < anInt4786) {
					class146_sub1_534_.verticesZ = class146_sub1_535_.verticesZ = new int[anInt4786];
				} else {
					class146_sub1_534_.verticesZ = class146_sub1_535_.verticesZ;
				}
				for (int i_543_ = 0; i_543_ < anInt4786; i_543_++) {
					class146_sub1_534_.verticesZ[i_543_] = verticesZ[i_543_];
				}
			} else {
				class146_sub1_534_.verticesZ = verticesZ;
			}
		} else {
			class146_sub1_534_.verticesX = verticesX;
			class146_sub1_534_.verticesY = verticesY;
			class146_sub1_534_.verticesZ = verticesZ;
		}
		if ((i & 0x84080) != 0) {
			if (class146_sub1_535_.aShortArray4800 == null
					|| class146_sub1_535_.aShortArray4800.length < anInt4780) {
				final int i_544_ = anInt4780;
				class146_sub1_534_.aShortArray4800 = class146_sub1_535_.aShortArray4800 = new short[i_544_];
			} else {
				class146_sub1_534_.aShortArray4800 = class146_sub1_535_.aShortArray4800;
			}
			for (int i_545_ = 0; i_545_ < anInt4780; i_545_++) {
				class146_sub1_534_.aShortArray4800[i_545_] = aShortArray4800[i_545_];
			}
		} else {
			class146_sub1_534_.aShortArray4800 = aShortArray4800;
		}
		if ((i & 0x97018) != 0) {
			class146_sub1_534_.anInt4784 = 0;
			class146_sub1_534_.anIntArray4791 = class146_sub1_534_.anIntArray4760 = class146_sub1_534_.anIntArray4836 = null;
		} else if ((i & 0x80) != 0) {
			if (bool_536_) {
				method2354(false);
			}
			if (anIntArray4791 != null) {
				if (class146_sub1_535_.anIntArray4791 == null
						|| class146_sub1_535_.anIntArray4791.length < anInt4780) {
					final int i_546_ = anInt4780;
					class146_sub1_534_.anIntArray4791 = class146_sub1_535_.anIntArray4791 = new int[i_546_];
					class146_sub1_534_.anIntArray4760 = class146_sub1_535_.anIntArray4760 = new int[i_546_];
					class146_sub1_534_.anIntArray4836 = class146_sub1_535_.anIntArray4836 = new int[i_546_];
				} else {
					class146_sub1_534_.anIntArray4791 = class146_sub1_535_.anIntArray4791;
					class146_sub1_534_.anIntArray4760 = class146_sub1_535_.anIntArray4760;
					class146_sub1_534_.anIntArray4836 = class146_sub1_535_.anIntArray4836;
				}
				for (int i_547_ = 0; i_547_ < anInt4780; i_547_++) {
					class146_sub1_534_.anIntArray4791[i_547_] = anIntArray4791[i_547_];
					class146_sub1_534_.anIntArray4760[i_547_] = anIntArray4760[i_547_];
					class146_sub1_534_.anIntArray4836[i_547_] = anIntArray4836[i_547_];
				}
			}
			class146_sub1_534_.anInt4784 = anInt4784;
		} else {
			if (bool_536_) {
				method2354(false);
			}
			class146_sub1_534_.anIntArray4791 = anIntArray4791;
			class146_sub1_534_.anIntArray4760 = anIntArray4760;
			class146_sub1_534_.anIntArray4836 = anIntArray4836;
			class146_sub1_534_.anInt4784 = anInt4784;
		}
		if ((i & 0x100) != 0) {
			if (class146_sub1_535_.aByteArray4822 == null
					|| class146_sub1_535_.aByteArray4822.length < anInt4780) {
				final int i_548_ = anInt4780;
				class146_sub1_534_.aByteArray4822 = class146_sub1_535_.aByteArray4822 = new byte[i_548_];
			} else {
				class146_sub1_534_.aByteArray4822 = class146_sub1_535_.aByteArray4822;
			}
			if (aByteArray4822 != null) {
				for (int i_549_ = 0; i_549_ < anInt4780; i_549_++) {
					class146_sub1_534_.aByteArray4822[i_549_] = aByteArray4822[i_549_];
				}
			} else {
				for (int i_550_ = 0; i_550_ < anInt4780; i_550_++) {
					class146_sub1_534_.aByteArray4822[i_550_] = (byte) 0;
				}
			}
		} else {
			class146_sub1_534_.aByteArray4822 = aByteArray4822;
		}
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (class146_sub1_535_.aClass274Array4789 == null
					|| class146_sub1_535_.aClass274Array4789.length < anInt4814) {
				final int i_551_ = anInt4814;
				class146_sub1_534_.aClass274Array4789 = class146_sub1_535_.aClass274Array4789 = new Class274[i_551_];
			} else {
				class146_sub1_534_.aClass274Array4789 = class146_sub1_535_.aClass274Array4789;
			}
			if (aClass274Array4789 != null) {
				for (int i_552_ = 0; i_552_ < anInt4814; i_552_++) {
					class146_sub1_534_.aClass274Array4789[i_552_] = new Class274(
							aClass274Array4789[i_552_]);
				}
			} else {
				class146_sub1_534_.aClass274Array4789 = null;
			}
			if (aClass296Array4823 != null) {
				if (class146_sub1_535_.aClass296Array4823 == null
						|| (class146_sub1_535_.aClass296Array4823.length < anInt4780)) {
					final int i_553_ = anInt4780;
					class146_sub1_534_.aClass296Array4823 = class146_sub1_535_.aClass296Array4823 = new Class296[i_553_];
				} else {
					class146_sub1_534_.aClass296Array4823 = class146_sub1_535_.aClass296Array4823;
				}
				for (int i_554_ = 0; i_554_ < anInt4780; i_554_++) {
					class146_sub1_534_.aClass296Array4823[i_554_] = (aClass296Array4823[i_554_] != null ? new Class296(
							aClass296Array4823[i_554_]) : null);
				}
			} else {
				class146_sub1_534_.aClass296Array4823 = null;
			}
		} else {
			if (bool_536_) {
				method2353();
			}
			class146_sub1_534_.aClass274Array4789 = aClass274Array4789;
			class146_sub1_534_.aClass296Array4823 = aClass296Array4823;
		}
		if ((i & 0x8000) != 0) {
			if (aShortArray4804 == null) {
				class146_sub1_534_.aShortArray4804 = null;
			} else {
				if (class146_sub1_535_.aShortArray4804 == null
						|| class146_sub1_535_.aShortArray4804.length < anInt4780) {
					final int i_555_ = anInt4780;
					class146_sub1_534_.aShortArray4804 = class146_sub1_535_.aShortArray4804 = new short[i_555_];
				} else {
					class146_sub1_534_.aShortArray4804 = class146_sub1_535_.aShortArray4804;
				}
				for (int i_556_ = 0; i_556_ < anInt4780; i_556_++) {
					class146_sub1_534_.aShortArray4804[i_556_] = aShortArray4804[i_556_];
				}
			}
		} else {
			class146_sub1_534_.aShortArray4804 = aShortArray4804;
		}
		if ((i & 0x10000) != 0) {
			if (aByteArray4793 == null) {
				class146_sub1_534_.aByteArray4793 = null;
			} else {
				if (class146_sub1_535_.aByteArray4793 == null
						|| class146_sub1_535_.aByteArray4793.length < anInt4780) {
					final int i_557_ = bool ? anInt4780 + 100 : anInt4780;
					class146_sub1_534_.aByteArray4793 = class146_sub1_535_.aByteArray4793 = new byte[i_557_];
				} else {
					class146_sub1_534_.aByteArray4793 = class146_sub1_535_.aByteArray4793;
				}
				for (int i_558_ = 0; i_558_ < anInt4780; i_558_++) {
					class146_sub1_534_.aByteArray4793[i_558_] = aByteArray4793[i_558_];
				}
			}
		} else {
			class146_sub1_534_.aByteArray4793 = aByteArray4793;
		}
		if ((i & 0xc580) != 0) {
			if (class146_sub1_535_.aClass329Array4821 == null
					|| class146_sub1_535_.aClass329Array4821.length < anInt4776) {
				final int i_559_ = anInt4776;
				class146_sub1_534_.aClass329Array4821 = class146_sub1_535_.aClass329Array4821 = new Class329[i_559_];
				for (int i_560_ = 0; i_560_ < anInt4776; i_560_++) {
					class146_sub1_534_.aClass329Array4821[i_560_] = aClass329Array4821[i_560_]
							.method3710(28889);
				}
			} else {
				class146_sub1_534_.aClass329Array4821 = class146_sub1_535_.aClass329Array4821;
				for (int i_561_ = 0; i_561_ < anInt4776; i_561_++) {
					class146_sub1_534_.aClass329Array4821[i_561_].method3709(
							aClass329Array4821[i_561_], 52);
				}
			}
		} else {
			class146_sub1_534_.aClass329Array4821 = aClass329Array4821;
		}
		if (aFloatArrayArray4798 != null && (i & 0x10) != 0) {
			if (class146_sub1_535_.aFloatArrayArray4798 == null
					|| (class146_sub1_535_.aFloatArrayArray4798.length < anInt4780)) {
				final int i_562_ = bool ? anInt4780 + 100 : anInt4780;
				class146_sub1_534_.aFloatArrayArray4798 = class146_sub1_535_.aFloatArrayArray4798 = new float[i_562_][3];
			} else {
				class146_sub1_534_.aFloatArrayArray4798 = class146_sub1_535_.aFloatArrayArray4798;
			}
			for (int i_563_ = 0; i_563_ < anInt4780; i_563_++) {
				if (aFloatArrayArray4798[i_563_] != null) {
					class146_sub1_534_.aFloatArrayArray4798[i_563_][0] = aFloatArrayArray4798[i_563_][0];
					class146_sub1_534_.aFloatArrayArray4798[i_563_][1] = aFloatArrayArray4798[i_563_][1];
					class146_sub1_534_.aFloatArrayArray4798[i_563_][2] = aFloatArrayArray4798[i_563_][2];
				}
			}
			if (class146_sub1_535_.aFloatArrayArray4806 == null
					|| (class146_sub1_535_.aFloatArrayArray4806.length < anInt4780)) {
				final int i_564_ = bool ? anInt4780 + 100 : anInt4780;
				class146_sub1_534_.aFloatArrayArray4806 = class146_sub1_535_.aFloatArrayArray4806 = new float[i_564_][3];
			} else {
				class146_sub1_534_.aFloatArrayArray4806 = class146_sub1_535_.aFloatArrayArray4806;
			}
			for (int i_565_ = 0; i_565_ < anInt4780; i_565_++) {
				if (aFloatArrayArray4806[i_565_] != null) {
					class146_sub1_534_.aFloatArrayArray4806[i_565_][0] = aFloatArrayArray4806[i_565_][0];
					class146_sub1_534_.aFloatArrayArray4806[i_565_][1] = aFloatArrayArray4806[i_565_][1];
					class146_sub1_534_.aFloatArrayArray4806[i_565_][2] = aFloatArrayArray4806[i_565_][2];
				}
			}
		} else {
			class146_sub1_534_.aFloatArrayArray4798 = aFloatArrayArray4798;
			class146_sub1_534_.aFloatArrayArray4806 = aFloatArrayArray4806;
		}
		class146_sub1_534_.anIntArrayArray4834 = anIntArrayArray4834;
		class146_sub1_534_.anIntArrayArray4833 = anIntArrayArray4833;
		class146_sub1_534_.anIntArrayArray4796 = anIntArrayArray4796;
		class146_sub1_534_.aShortArray4790 = aShortArray4790;
		class146_sub1_534_.aShortArray4795 = aShortArray4795;
		class146_sub1_534_.aByteArray4772 = aByteArray4772;
		class146_sub1_534_.triangleViewspaceX = triangleViewspaceX;
		class146_sub1_534_.triangleViewspaceY = triangleViewspaceY;
		class146_sub1_534_.triangleViewspaceZ = triangleViewspaceZ;
		class146_sub1_534_.aClass87Array4813 = aClass87Array4813;
		class146_sub1_534_.aClass35Array4787 = aClass35Array4787;
		class146_sub1_534_.aClass170Array4827 = aClass170Array4827;
		class146_sub1_534_.aShortArray4809 = aShortArray4809;
		class146_sub1_534_.anInt4816 = i;
		return class146_sub1_534_;
	}

	@Override
	final void method2344(final int i, final int[] is, int i_566_, int i_567_,
			int i_568_, final int i_569_, final boolean bool) {
		final int i_570_ = is.length;
		if (i == 0) {
			i_566_ <<= 4;
			i_567_ <<= 4;
			i_568_ <<= 4;
			if (!aBoolean4815) {
				for (int i_571_ = 0; i_571_ < anInt4786; i_571_++) {
					verticesX[i_571_] <<= 4;
					verticesY[i_571_] <<= 4;
					verticesZ[i_571_] <<= 4;
				}
				aBoolean4815 = true;
			}
			int i_572_ = 0;
			anInt4792 = 0;
			anInt4781 = 0;
			anInt4757 = 0;
			for (int i_573_ = 0; i_573_ < i_570_; i_573_++) {
				final int i_574_ = is[i_573_];
				if (i_574_ < anIntArrayArray4834.length) {
					final int[] is_575_ = anIntArrayArray4834[i_574_];
					for (int i_576_ = 0; i_576_ < is_575_.length; i_576_++) {
						final int i_577_ = is_575_[i_576_];
						anInt4792 += verticesX[i_577_];
						anInt4781 += verticesY[i_577_];
						anInt4757 += verticesZ[i_577_];
						i_572_++;
					}
				}
			}
			if (i_572_ > 0) {
				anInt4792 = anInt4792 / i_572_ + i_566_;
				anInt4781 = anInt4781 / i_572_ + i_567_;
				anInt4757 = anInt4757 / i_572_ + i_568_;
			} else {
				anInt4792 = i_566_;
				anInt4781 = i_567_;
				anInt4757 = i_568_;
			}
		} else if (i == 1) {
			i_566_ <<= 4;
			i_567_ <<= 4;
			i_568_ <<= 4;
			if (!aBoolean4815) {
				for (int i_578_ = 0; i_578_ < anInt4786; i_578_++) {
					verticesX[i_578_] <<= 4;
					verticesY[i_578_] <<= 4;
					verticesZ[i_578_] <<= 4;
				}
				aBoolean4815 = true;
			}
			for (int i_579_ = 0; i_579_ < i_570_; i_579_++) {
				final int i_580_ = is[i_579_];
				if (i_580_ < anIntArrayArray4834.length) {
					final int[] is_581_ = anIntArrayArray4834[i_580_];
					for (int i_582_ = 0; i_582_ < is_581_.length; i_582_++) {
						final int i_583_ = is_581_[i_582_];
						verticesX[i_583_] += i_566_;
						verticesY[i_583_] += i_567_;
						verticesZ[i_583_] += i_568_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_584_ = 0; i_584_ < i_570_; i_584_++) {
				final int i_585_ = is[i_584_];
				if (i_585_ < anIntArrayArray4834.length) {
					final int[] is_586_ = anIntArrayArray4834[i_585_];
					if ((i_569_ & 0x1) == 0) {
						for (int i_587_ = 0; i_587_ < is_586_.length; i_587_++) {
							final int i_588_ = is_586_[i_587_];
							verticesX[i_588_] -= anInt4792;
							verticesY[i_588_] -= anInt4781;
							verticesZ[i_588_] -= anInt4757;
							if (i_568_ != 0) {
								final int i_589_ = (Class284_Sub2_Sub2.anIntArray6200[i_568_]);
								final int i_590_ = (Class284_Sub2_Sub2.anIntArray6202[i_568_]);
								final int i_591_ = (verticesY[i_588_]
										* i_589_ + verticesX[i_588_]
										* i_590_ + 16383) >> 14;
								verticesY[i_588_] = (verticesY[i_588_]
										* i_590_
										- verticesX[i_588_]
										* i_589_ + 16383) >> 14;
								verticesX[i_588_] = i_591_;
							}
							if (i_566_ != 0) {
								final int i_592_ = (Class284_Sub2_Sub2.anIntArray6200[i_566_]);
								final int i_593_ = (Class284_Sub2_Sub2.anIntArray6202[i_566_]);
								final int i_594_ = (verticesY[i_588_]
										* i_593_ - verticesZ[i_588_]
										* i_592_ + 16383) >> 14;
								verticesZ[i_588_] = (verticesY[i_588_]
										* i_592_
										+ verticesZ[i_588_]
										* i_593_ + 16383) >> 14;
								verticesY[i_588_] = i_594_;
							}
							if (i_567_ != 0) {
								final int i_595_ = (Class284_Sub2_Sub2.anIntArray6200[i_567_]);
								final int i_596_ = (Class284_Sub2_Sub2.anIntArray6202[i_567_]);
								final int i_597_ = (verticesZ[i_588_]
										* i_595_ + verticesX[i_588_]
										* i_596_ + 16383) >> 14;
								verticesZ[i_588_] = (verticesZ[i_588_]
										* i_596_
										- verticesX[i_588_]
										* i_595_ + 16383) >> 14;
								verticesX[i_588_] = i_597_;
							}
							verticesX[i_588_] += anInt4792;
							verticesY[i_588_] += anInt4781;
							verticesZ[i_588_] += anInt4757;
						}
					} else {
						for (int i_598_ = 0; i_598_ < is_586_.length; i_598_++) {
							final int i_599_ = is_586_[i_598_];
							verticesX[i_599_] -= anInt4792;
							verticesY[i_599_] -= anInt4781;
							verticesZ[i_599_] -= anInt4757;
							if (i_566_ != 0) {
								final int i_600_ = (Class284_Sub2_Sub2.anIntArray6200[i_566_]);
								final int i_601_ = (Class284_Sub2_Sub2.anIntArray6202[i_566_]);
								final int i_602_ = (verticesY[i_599_]
										* i_601_ - verticesZ[i_599_]
										* i_600_ + 16383) >> 14;
								verticesZ[i_599_] = (verticesY[i_599_]
										* i_600_
										+ verticesZ[i_599_]
										* i_601_ + 16383) >> 14;
								verticesY[i_599_] = i_602_;
							}
							if (i_568_ != 0) {
								final int i_603_ = (Class284_Sub2_Sub2.anIntArray6200[i_568_]);
								final int i_604_ = (Class284_Sub2_Sub2.anIntArray6202[i_568_]);
								final int i_605_ = (verticesY[i_599_]
										* i_603_ + verticesX[i_599_]
										* i_604_ + 16383) >> 14;
								verticesY[i_599_] = (verticesY[i_599_]
										* i_604_
										- verticesX[i_599_]
										* i_603_ + 16383) >> 14;
								verticesX[i_599_] = i_605_;
							}
							if (i_567_ != 0) {
								final int i_606_ = (Class284_Sub2_Sub2.anIntArray6200[i_567_]);
								final int i_607_ = (Class284_Sub2_Sub2.anIntArray6202[i_567_]);
								final int i_608_ = (verticesZ[i_599_]
										* i_606_ + verticesX[i_599_]
										* i_607_ + 16383) >> 14;
								verticesZ[i_599_] = (verticesZ[i_599_]
										* i_607_
										- verticesX[i_599_]
										* i_606_ + 16383) >> 14;
								verticesX[i_599_] = i_608_;
							}
							verticesX[i_599_] += anInt4792;
							verticesY[i_599_] += anInt4781;
							verticesZ[i_599_] += anInt4757;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_609_ = 0; i_609_ < i_570_; i_609_++) {
				final int i_610_ = is[i_609_];
				if (i_610_ < anIntArrayArray4834.length) {
					final int[] is_611_ = anIntArrayArray4834[i_610_];
					for (int i_612_ = 0; i_612_ < is_611_.length; i_612_++) {
						final int i_613_ = is_611_[i_612_];
						verticesX[i_613_] -= anInt4792;
						verticesY[i_613_] -= anInt4781;
						verticesZ[i_613_] -= anInt4757;
						verticesX[i_613_] = verticesX[i_613_]
								* i_566_ / 128;
						verticesY[i_613_] = verticesY[i_613_]
								* i_567_ / 128;
						verticesZ[i_613_] = verticesZ[i_613_]
								* i_568_ / 128;
						verticesX[i_613_] += anInt4792;
						verticesY[i_613_] += anInt4781;
						verticesZ[i_613_] += anInt4757;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray4833 != null && aByteArray4822 != null) {
				for (int i_614_ = 0; i_614_ < i_570_; i_614_++) {
					final int i_615_ = is[i_614_];
					if (i_615_ < anIntArrayArray4833.length) {
						final int[] is_616_ = anIntArrayArray4833[i_615_];
						for (int i_617_ = 0; i_617_ < is_616_.length; i_617_++) {
							final int i_618_ = is_616_[i_617_];
							int i_619_ = (aByteArray4822[i_618_] & 0xff)
									+ i_566_ * 8;
							if (i_619_ < 0) {
								i_619_ = 0;
							} else if (i_619_ > 255) {
								i_619_ = 255;
							}
							aByteArray4822[i_618_] = (byte) i_619_;
						}
					}
				}
				if (aClass170Array4827 != null) {
					for (int i_620_ = 0; i_620_ < anInt4776; i_620_++) {
						final Class170 class170 = aClass170Array4827[i_620_];
						final Class329 class329 = aClass329Array4821[i_620_];
						class329.anInt2770 = (class329.anInt2770 & 0xffffff | 255 - ((aByteArray4822[class170.anInt1315]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray4833 != null) {
				for (int i_621_ = 0; i_621_ < i_570_; i_621_++) {
					final int i_622_ = is[i_621_];
					if (i_622_ < anIntArrayArray4833.length) {
						final int[] is_623_ = anIntArrayArray4833[i_622_];
						for (int i_624_ = 0; i_624_ < is_623_.length; i_624_++) {
							final int i_625_ = is_623_[i_624_];
							final int i_626_ = aShortArray4800[i_625_] & 0xffff;
							int i_627_ = i_626_ >> 10 & 0x3f;
							int i_628_ = i_626_ >> 7 & 0x7;
							int i_629_ = i_626_ & 0x7f;
							i_627_ = i_627_ + i_566_ & 0x3f;
							i_628_ += i_567_;
							if (i_628_ < 0) {
								i_628_ = 0;
							} else if (i_628_ > 7) {
								i_628_ = 7;
							}
							i_629_ += i_568_;
							if (i_629_ < 0) {
								i_629_ = 0;
							} else if (i_629_ > 127) {
								i_629_ = 127;
							}
							aShortArray4800[i_625_] = (short) (i_627_ << 10
									| i_628_ << 7 | i_629_);
						}
						aBoolean4754 = true;
					}
				}
				if (aClass170Array4827 != null) {
					for (int i_630_ = 0; i_630_ < anInt4776; i_630_++) {
						final Class170 class170 = aClass170Array4827[i_630_];
						final Class329 class329 = aClass329Array4821[i_630_];
						class329.anInt2770 = (class329.anInt2770 & ~0xffffff | ((Class221.anIntArray1665[Class111_Sub2
								.method2117(
										((aShortArray4800[(class170.anInt1315)]) & 0xffff),
										92) & 0xffff]) & 0xffffff));
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray4796 != null) {
				for (int i_631_ = 0; i_631_ < i_570_; i_631_++) {
					final int i_632_ = is[i_631_];
					if (i_632_ < anIntArrayArray4796.length) {
						final int[] is_633_ = anIntArrayArray4796[i_632_];
						for (int i_634_ = 0; i_634_ < is_633_.length; i_634_++) {
							final Class329 class329 = aClass329Array4821[is_633_[i_634_]];
							class329.anInt2762 += i_566_;
							class329.anInt2772 += i_567_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray4796 != null) {
				for (int i_635_ = 0; i_635_ < i_570_; i_635_++) {
					final int i_636_ = is[i_635_];
					if (i_636_ < anIntArrayArray4796.length) {
						final int[] is_637_ = anIntArrayArray4796[i_636_];
						for (int i_638_ = 0; i_638_ < is_637_.length; i_638_++) {
							final Class329 class329 = aClass329Array4821[is_637_[i_638_]];
							class329.anInt2763 = (class329.anInt2763 * i_566_ >> 7);
							class329.anInt2768 = (class329.anInt2768 * i_567_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray4796 != null) {
				for (int i_639_ = 0; i_639_ < i_570_; i_639_++) {
					final int i_640_ = is[i_639_];
					if (i_640_ < anIntArrayArray4796.length) {
						final int[] is_641_ = anIntArrayArray4796[i_640_];
						for (int i_642_ = 0; i_642_ < is_641_.length; i_642_++) {
							final Class329 class329 = aClass329Array4821[is_641_[i_642_]];
							class329.anInt2769 = (class329.anInt2769 + i_566_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	@Override
	final boolean method2333(final int i, final int i_643_,
			final Class111 class111, final boolean bool, final int i_644_,
			final int i_645_) {
		return method2372(i, i_643_, class111, bool, i_644_, i_645_);
	}

	private final void method2368(final int i) {
		int i_646_ = 0;
		final int i_647_ = aHa_Sub2_4797.anInt4502;
		final short i_648_ = triangleViewspaceX[i];
		final short i_649_ = triangleViewspaceY[i];
		final short i_650_ = triangleViewspaceZ[i];
		int i_651_ = anIntArray4829[i_648_];
		int i_652_ = anIntArray4829[i_649_];
		int i_653_ = anIntArray4829[i_650_];
		if (aByteArray4822 == null) {
			aClass12_4768.anInt137 = 0;
		} else {
			aClass12_4768.anInt137 = aByteArray4822[i] & 0xff;
		}
		if (i_651_ >= i_647_) {
			anIntArray4751[i_646_] = anIntArray4771[i_648_];
			anIntArray4811[i_646_] = anIntArray4812[i_648_];
			anIntArray4824[i_646_] = anIntArray4766[i_648_];
			anIntArray4749[i_646_++] = anIntArray4791[i] & 0xffff;
		} else {
			final int i_654_ = anIntArray4828[i_648_];
			final int i_655_ = anIntArray4763[i_648_];
			final int i_656_ = anIntArray4791[i] & 0xffff;
			if (i_653_ >= i_647_) {
				final int i_657_ = (i_647_ - i_651_)
						* (65536 / (i_653_ - i_651_));
				anIntArray4751[i_646_] = (aClass235_4807.anInt1771 + ((i_654_ + ((anIntArray4828[i_650_] - i_654_)
						* i_657_ >> 16))
						* aHa_Sub2_4797.anInt4514 / i_647_));
				anIntArray4811[i_646_] = (aClass235_4807.anInt1779 + ((i_655_ + ((anIntArray4763[i_650_] - i_655_)
						* i_657_ >> 16))
						* aHa_Sub2_4797.anInt4490 / i_647_));
				anIntArray4824[i_646_] = i_647_;
				anIntArray4749[i_646_++] = (i_656_ + (((anIntArray4836[i] & 0xffff) - i_656_)
						* i_657_ >> 16));
			}
			if (i_652_ >= i_647_) {
				final int i_658_ = (i_647_ - i_651_)
						* (65536 / (i_652_ - i_651_));
				anIntArray4751[i_646_] = (aClass235_4807.anInt1771 + ((i_654_ + ((anIntArray4828[i_649_] - i_654_)
						* i_658_ >> 16))
						* aHa_Sub2_4797.anInt4514 / i_647_));
				anIntArray4811[i_646_] = (aClass235_4807.anInt1779 + ((i_655_ + ((anIntArray4763[i_649_] - i_655_)
						* i_658_ >> 16))
						* aHa_Sub2_4797.anInt4490 / i_647_));
				anIntArray4824[i_646_] = i_647_;
				anIntArray4749[i_646_++] = (i_656_ + (((anIntArray4760[i] & 0xffff) - i_656_)
						* i_658_ >> 16));
			}
		}
		if (i_652_ >= i_647_) {
			anIntArray4751[i_646_] = anIntArray4771[i_649_];
			anIntArray4811[i_646_] = anIntArray4812[i_649_];
			anIntArray4824[i_646_] = anIntArray4766[i_649_];
			anIntArray4749[i_646_++] = anIntArray4760[i] & 0xffff;
		} else {
			final int i_659_ = anIntArray4828[i_649_];
			final int i_660_ = anIntArray4763[i_649_];
			final int i_661_ = anIntArray4760[i] & 0xffff;
			if (i_651_ >= i_647_) {
				final int i_662_ = (i_647_ - i_652_)
						* (65536 / (i_651_ - i_652_));
				anIntArray4751[i_646_] = (aClass235_4807.anInt1771 + ((i_659_ + ((anIntArray4828[i_648_] - i_659_)
						* i_662_ >> 16))
						* aHa_Sub2_4797.anInt4514 / i_647_));
				anIntArray4811[i_646_] = (aClass235_4807.anInt1779 + ((i_660_ + ((anIntArray4763[i_648_] - i_660_)
						* i_662_ >> 16))
						* aHa_Sub2_4797.anInt4490 / i_647_));
				anIntArray4824[i_646_] = i_647_;
				anIntArray4749[i_646_++] = (i_661_ + (((anIntArray4791[i] & 0xffff) - i_661_)
						* i_662_ >> 16));
			}
			if (i_653_ >= i_647_) {
				final int i_663_ = (i_647_ - i_652_)
						* (65536 / (i_653_ - i_652_));
				anIntArray4751[i_646_] = (aClass235_4807.anInt1771 + ((i_659_ + ((anIntArray4828[i_650_] - i_659_)
						* i_663_ >> 16))
						* aHa_Sub2_4797.anInt4514 / i_647_));
				anIntArray4811[i_646_] = (aClass235_4807.anInt1779 + ((i_660_ + ((anIntArray4763[i_650_] - i_660_)
						* i_663_ >> 16))
						* aHa_Sub2_4797.anInt4490 / i_647_));
				anIntArray4824[i_646_] = i_647_;
				anIntArray4749[i_646_++] = (i_661_ + (((anIntArray4836[i] & 0xffff) - i_661_)
						* i_663_ >> 16));
			}
		}
		if (i_653_ >= i_647_) {
			anIntArray4751[i_646_] = anIntArray4771[i_650_];
			anIntArray4811[i_646_] = anIntArray4812[i_650_];
			anIntArray4824[i_646_] = anIntArray4766[i_650_];
			anIntArray4749[i_646_++] = anIntArray4836[i] & 0xffff;
		} else {
			final int i_664_ = anIntArray4828[i_650_];
			final int i_665_ = anIntArray4763[i_650_];
			final int i_666_ = anIntArray4836[i] & 0xffff;
			if (i_652_ >= i_647_) {
				final int i_667_ = (i_647_ - i_653_)
						* (65536 / (i_652_ - i_653_));
				anIntArray4751[i_646_] = (aClass235_4807.anInt1771 + ((i_664_ + ((anIntArray4828[i_649_] - i_664_)
						* i_667_ >> 16))
						* aHa_Sub2_4797.anInt4514 / i_647_));
				anIntArray4811[i_646_] = (aClass235_4807.anInt1779 + ((i_665_ + ((anIntArray4763[i_649_] - i_665_)
						* i_667_ >> 16))
						* aHa_Sub2_4797.anInt4490 / i_647_));
				anIntArray4824[i_646_] = i_647_;
				anIntArray4749[i_646_++] = (i_666_ + (((anIntArray4760[i] & 0xffff) - i_666_)
						* i_667_ >> 16));
			}
			if (i_651_ >= i_647_) {
				final int i_668_ = (i_647_ - i_653_)
						* (65536 / (i_651_ - i_653_));
				anIntArray4751[i_646_] = (aClass235_4807.anInt1771 + ((i_664_ + ((anIntArray4828[i_648_] - i_664_)
						* i_668_ >> 16))
						* aHa_Sub2_4797.anInt4514 / i_647_));
				anIntArray4811[i_646_] = (aClass235_4807.anInt1779 + ((i_665_ + ((anIntArray4763[i_648_] - i_665_)
						* i_668_ >> 16))
						* aHa_Sub2_4797.anInt4490 / i_647_));
				anIntArray4824[i_646_] = i_647_;
				anIntArray4749[i_646_++] = (i_666_ + (((anIntArray4791[i] & 0xffff) - i_666_)
						* i_668_ >> 16));
			}
		}
		final int i_669_ = anIntArray4751[0];
		final int i_670_ = anIntArray4751[1];
		final int i_671_ = anIntArray4751[2];
		final int i_672_ = anIntArray4811[0];
		final int i_673_ = anIntArray4811[1];
		final int i_674_ = anIntArray4811[2];
		i_651_ = anIntArray4824[0];
		i_652_ = anIntArray4824[1];
		i_653_ = anIntArray4824[2];
		aClass12_4768.aBoolean135 = false;
		if (i_646_ == 3) {
			if (i_669_ < 0 || i_670_ < 0 || i_671_ < 0
					|| i_669_ > aClass235_4807.anInt1783
					|| i_670_ > aClass235_4807.anInt1783
					|| i_671_ > aClass235_4807.anInt1783) {
				aClass12_4768.aBoolean135 = true;
			}
			if (aShortArray4804 == null || aShortArray4804[i] == -1) {
				if (anIntArray4836[i] == -1) {
					aClass12_4768
							.method208(
									i_672_,
									i_673_,
									i_674_,
									i_669_,
									i_670_,
									i_671_,
									i_651_,
									i_652_,
									i_653_,
									(Class221.anIntArray1665[anIntArray4791[i] & 0xffff]));
				} else {
					aClass12_4768.method216(i_672_, i_673_, i_674_, i_669_,
							i_670_, i_671_, i_651_, i_652_, i_653_,
							anIntArray4749[0], anIntArray4749[1],
							anIntArray4749[2]);
				}
			} else {
				int i_675_ = -16777216;
				if (aByteArray4822 != null) {
					i_675_ = 255 - (aByteArray4822[i] & 0xff) << 24;
				}
				final int i_676_ = i_675_ | anIntArray4791[i] & 0xffffff;
				if (anIntArray4836[i] == -1) {
					aClass12_4768.method212(i_672_, i_673_, i_674_, i_669_,
							i_670_, i_671_, i_651_, i_652_, i_653_,
							aFloatArrayArray4798[i][0],
							aFloatArrayArray4798[i][1],
							aFloatArrayArray4798[i][2],
							aFloatArrayArray4806[i][0],
							aFloatArrayArray4806[i][1],
							aFloatArrayArray4806[i][2], i_676_, i_676_, i_676_,
							(aClass235_4807.anInt1763), 0, 0, 0,
							aShortArray4804[i]);
				} else {
					aClass12_4768.method212(i_672_, i_673_, i_674_, i_669_,
							i_670_, i_671_, i_651_, i_652_, i_653_,
							aFloatArrayArray4798[i][0],
							aFloatArrayArray4798[i][1],
							aFloatArrayArray4798[i][2],
							aFloatArrayArray4806[i][0],
							aFloatArrayArray4806[i][1],
							aFloatArrayArray4806[i][2], i_676_, i_676_, i_676_,
							(aClass235_4807.anInt1763), 0, 0, 0,
							aShortArray4804[i]);
				}
			}
		}
		if (i_646_ == 4) {
			if (i_669_ < 0 || i_670_ < 0 || i_671_ < 0
					|| i_669_ > aClass235_4807.anInt1783
					|| i_670_ > aClass235_4807.anInt1783
					|| i_671_ > aClass235_4807.anInt1783
					|| anIntArray4751[3] < 0
					|| anIntArray4751[3] > aClass235_4807.anInt1783) {
				aClass12_4768.aBoolean135 = true;
			}
			if (aShortArray4804 == null || aShortArray4804[i] == -1) {
				if (anIntArray4836[i] == -1) {
					final int i_677_ = Class221.anIntArray1665[anIntArray4791[i] & 0xffff];
					aClass12_4768.method208(i_672_, i_673_, i_674_, i_669_,
							i_670_, i_671_, i_651_, i_652_, i_653_, i_677_);
					aClass12_4768.method208(i_672_, i_674_, anIntArray4811[3],
							i_669_, i_671_, anIntArray4751[3], i_651_, i_652_,
							anIntArray4824[3], i_677_);
				} else {
					aClass12_4768.method216(i_672_, i_673_, i_674_, i_669_,
							i_670_, i_671_, i_651_, i_652_, i_653_,
							anIntArray4749[0], anIntArray4749[1],
							anIntArray4749[2]);
					aClass12_4768.method216(i_672_, i_674_, anIntArray4811[3],
							i_669_, i_671_, anIntArray4751[3], i_651_, i_652_,
							anIntArray4824[3], anIntArray4749[0],
							anIntArray4749[2], anIntArray4749[3]);
				}
			} else {
				int i_678_ = -16777216;
				if (aByteArray4822 != null) {
					i_678_ = 255 - (aByteArray4822[i] & 0xff) << 24;
				}
				final int i_679_ = i_678_ | anIntArray4791[i] & 0xffffff;
				if (anIntArray4836[i] == -1) {
					aClass12_4768.method212(i_672_, i_673_, i_674_, i_669_,
							i_670_, i_671_, i_651_, i_652_, i_653_,
							aFloatArrayArray4798[i][0],
							aFloatArrayArray4798[i][1],
							aFloatArrayArray4798[i][2],
							aFloatArrayArray4806[i][0],
							aFloatArrayArray4806[i][1],
							aFloatArrayArray4806[i][2], i_679_, i_679_, i_679_,
							(aClass235_4807.anInt1763), 0, 0, 0,
							aShortArray4804[i]);
					aClass12_4768.method212(i_672_, i_674_, anIntArray4811[3],
							i_669_, i_671_, anIntArray4751[3], i_651_, i_653_,
							anIntArray4824[3], aFloatArrayArray4798[i][0],
							aFloatArrayArray4798[i][1],
							aFloatArrayArray4798[i][2],
							aFloatArrayArray4806[i][0],
							aFloatArrayArray4806[i][1],
							aFloatArrayArray4806[i][2], i_679_, i_679_, i_679_,
							(aClass235_4807.anInt1763), 0, 0, 0,
							aShortArray4804[i]);
				} else {
					aClass12_4768.method212(i_672_, i_673_, i_674_, i_669_,
							i_670_, i_671_, i_651_, i_652_, i_653_,
							aFloatArrayArray4798[i][0],
							aFloatArrayArray4798[i][1],
							aFloatArrayArray4798[i][2],
							aFloatArrayArray4806[i][0],
							aFloatArrayArray4806[i][1],
							aFloatArrayArray4806[i][2], i_679_, i_679_, i_679_,
							(aClass235_4807.anInt1763), 0, 0, 0,
							aShortArray4804[i]);
					aClass12_4768.method212(i_672_, i_674_, anIntArray4811[3],
							i_669_, i_671_, anIntArray4751[3], i_651_, i_653_,
							anIntArray4824[3], aFloatArrayArray4798[i][0],
							aFloatArrayArray4798[i][1],
							aFloatArrayArray4798[i][2],
							aFloatArrayArray4806[i][0],
							aFloatArrayArray4806[i][1],
							aFloatArrayArray4806[i][2], i_679_, i_679_, i_679_,
							(aClass235_4807.anInt1763), 0, 0, 0,
							aShortArray4804[i]);
				}
			}
		}
	}

	@Override
	final void v() {
		if ((anInt4816 & 0x10) != 16) {
			throw new IllegalStateException();
		}
		synchronized (this) {
			for (int i = 0; i < anInt4786; i++) {
				verticesZ[i] = -verticesZ[i];
			}
			if (aClass274Array4789 != null) {
				for (int i = 0; i < anInt4814; i++) {
					if (aClass274Array4789[i] != null) {
						aClass274Array4789[i].anInt2042 = -aClass274Array4789[i].anInt2042;
					}
				}
			}
			if (aClass274Array4777 != null) {
				for (int i = 0; i < anInt4814; i++) {
					if (aClass274Array4777[i] != null) {
						aClass274Array4777[i].anInt2042 = -aClass274Array4777[i].anInt2042;
					}
				}
			}
			if (aClass296Array4823 != null) {
				for (int i = 0; i < anInt4780; i++) {
					if (aClass296Array4823[i] != null) {
						aClass296Array4823[i].anInt2413 = -aClass296Array4823[i].anInt2413;
					}
				}
			}
			final short[] is = triangleViewspaceX;
			triangleViewspaceX = triangleViewspaceZ;
			triangleViewspaceZ = is;
			if (aFloatArrayArray4798 != null) {
				for (int i = 0; i < anInt4780; i++) {
					if (aFloatArrayArray4798[i] != null) {
						final float f = aFloatArrayArray4798[i][0];
						aFloatArrayArray4798[i][0] = aFloatArrayArray4798[i][2];
						aFloatArrayArray4798[i][2] = f;
					}
					if (aFloatArrayArray4806[i] != null) {
						final float f = aFloatArrayArray4806[i][0];
						aFloatArrayArray4806[i][0] = aFloatArrayArray4806[i][2];
						aFloatArrayArray4806[i][2] = f;
					}
				}
			}
			aBoolean4778 = false;
			anInt4784 = 0;
		}
	}

	private final void method2369() {
		synchronized (this) {
			for (int i = 0; i < anInt4814; i++) {
				verticesX[i] = -verticesX[i];
				verticesZ[i] = -verticesZ[i];
				if (aClass274Array4789[i] != null) {
					aClass274Array4789[i].anInt2044 = -aClass274Array4789[i].anInt2044;
					aClass274Array4789[i].anInt2042 = -aClass274Array4789[i].anInt2042;
				}
			}
			if (aClass296Array4823 != null) {
				for (int i = 0; i < anInt4780; i++) {
					if (aClass296Array4823[i] != null) {
						aClass296Array4823[i].anInt2411 = -aClass296Array4823[i].anInt2411;
						aClass296Array4823[i].anInt2413 = -aClass296Array4823[i].anInt2413;
					}
				}
			}
			for (int i = anInt4814; i < anInt4786; i++) {
				verticesX[i] = -verticesX[i];
				verticesZ[i] = -verticesZ[i];
			}
			anInt4784 = 0;
			aBoolean4778 = false;
		}
	}

	@Override
	final void method2343(final Class111 class111) {
		final Class111_Sub2 class111_sub2 = (Class111_Sub2) class111;
		if (aClass87Array4813 != null) {
			for (int i = 0; i < aClass87Array4813.length; i++) {
				final Surface surface = aClass87Array4813[i];
				Surface class87_680_ = surface;
				if (surface.aClass87_657 != null) {
					class87_680_ = surface.aClass87_657;
				}
				class87_680_.anInt670 = (int) (class111_sub2.aFloat4697 + ((class111_sub2.aFloat4700 * (verticesX[surface.anInt666]))
						+ (class111_sub2.aFloat4699 * (verticesY[surface.anInt666])) + (class111_sub2.aFloat4690 * (verticesZ[(surface.anInt666)]))));
				class87_680_.anInt668 = (int) (class111_sub2.aFloat4691 + ((class111_sub2.aFloat4692 * (verticesX[surface.anInt666]))
						+ (class111_sub2.aFloat4688 * (verticesY[surface.anInt666])) + (class111_sub2.aFloat4696 * (verticesZ[(surface.anInt666)]))));
				class87_680_.anInt671 = (int) (class111_sub2.aFloat4689 + ((class111_sub2.aFloat4693 * (verticesX[surface.anInt666]))
						+ (class111_sub2.aFloat4698 * (verticesY[surface.anInt666])) + (class111_sub2.aFloat4694 * (verticesZ[(surface.anInt666)]))));
				class87_680_.anInt663 = (int) (class111_sub2.aFloat4697 + ((class111_sub2.aFloat4700 * (verticesX[surface.anInt661]))
						+ (class111_sub2.aFloat4699 * (verticesY[surface.anInt661])) + (class111_sub2.aFloat4690 * (verticesZ[(surface.anInt661)]))));
				class87_680_.anInt664 = (int) (class111_sub2.aFloat4691 + ((class111_sub2.aFloat4692 * (verticesX[surface.anInt661]))
						+ (class111_sub2.aFloat4688 * (verticesY[surface.anInt661])) + (class111_sub2.aFloat4696 * (verticesZ[(surface.anInt661)]))));
				class87_680_.anInt656 = (int) (class111_sub2.aFloat4689 + ((class111_sub2.aFloat4693 * (verticesX[surface.anInt661]))
						+ (class111_sub2.aFloat4698 * (verticesY[surface.anInt661])) + (class111_sub2.aFloat4694 * (verticesZ[(surface.anInt661)]))));
				class87_680_.anInt659 = (int) (class111_sub2.aFloat4697 + ((class111_sub2.aFloat4700 * (verticesX[surface.anInt674]))
						+ (class111_sub2.aFloat4699 * (verticesY[surface.anInt674])) + (class111_sub2.aFloat4690 * (verticesZ[(surface.anInt674)]))));
				class87_680_.anInt669 = (int) (class111_sub2.aFloat4691 + ((class111_sub2.aFloat4692 * (verticesX[surface.anInt674]))
						+ (class111_sub2.aFloat4688 * (verticesY[surface.anInt674])) + (class111_sub2.aFloat4696 * (verticesZ[(surface.anInt674)]))));
				class87_680_.anInt662 = (int) (class111_sub2.aFloat4689 + ((class111_sub2.aFloat4693 * (verticesX[surface.anInt674]))
						+ (class111_sub2.aFloat4698 * (verticesY[surface.anInt674])) + (class111_sub2.aFloat4694 * (verticesZ[(surface.anInt674)]))));
			}
		}
		if (aClass35Array4787 != null) {
			for (int i = 0; i < aClass35Array4787.length; i++) {
				final SurfaceSkin surfaceSkin = aClass35Array4787[i];
				SurfaceSkin class35_681_ = surfaceSkin;
				if (surfaceSkin.aClass35_328 != null) {
					class35_681_ = surfaceSkin.aClass35_328;
				}
				if (surfaceSkin.aClass111_334 != null) {
					surfaceSkin.aClass111_334.method2092(class111_sub2);
				} else {
					surfaceSkin.aClass111_334 = class111_sub2.method2102();
				}
				class35_681_.anInt331 = (int) (class111_sub2.aFloat4697 + ((class111_sub2.aFloat4700 * (verticesX[surfaceSkin.anInt327]))
						+ (class111_sub2.aFloat4699 * (verticesY[surfaceSkin.anInt327])) + (class111_sub2.aFloat4690 * (verticesZ[(surfaceSkin.anInt327)]))));
				class35_681_.anInt330 = (int) (class111_sub2.aFloat4691 + ((class111_sub2.aFloat4692 * (verticesX[surfaceSkin.anInt327]))
						+ (class111_sub2.aFloat4688 * (verticesY[surfaceSkin.anInt327])) + (class111_sub2.aFloat4696 * (verticesZ[(surfaceSkin.anInt327)]))));
				class35_681_.anInt337 = (int) (class111_sub2.aFloat4689 + ((class111_sub2.aFloat4693 * (verticesX[surfaceSkin.anInt327]))
						+ (class111_sub2.aFloat4698 * (verticesY[surfaceSkin.anInt327])) + (class111_sub2.aFloat4694 * (verticesZ[(surfaceSkin.anInt327)]))));
			}
		}
	}

	private final void method2370() {
		synchronized (this) {
			for (int i = 0; i < anInt4786; i++) {
				verticesX[i] = -verticesX[i];
				verticesZ[i] = -verticesZ[i];
			}
			method2364();
		}
	}

	@Override
	final r ba(final r var_r) {
		return null;
	}

	@Override
	final boolean method2324() {
		if (aShortArray4804 == null) {
			return true;
		}
		for (int i = 0; i < aShortArray4804.length; i++) {
			if (aShortArray4804[i] != -1
					&& !aHa_Sub2_4797.method1918(aShortArray4804[i])) {
				return false;
			}
		}
		return true;
	}

	private final void method2371(final int i, final boolean bool,
			final boolean bool_682_) {
		if (anIntArray4836[i] != -2) {
			final short i_683_ = triangleViewspaceX[i];
			final short i_684_ = triangleViewspaceY[i];
			final short i_685_ = triangleViewspaceZ[i];
			final int i_686_ = anIntArray4771[i_683_];
			final int i_687_ = anIntArray4771[i_684_];
			final int i_688_ = anIntArray4771[i_685_];
			if (bool && (i_686_ == -5000 || i_687_ == -5000 || i_688_ == -5000)) {
				int i_689_ = anIntArray4828[i_683_];
				final int i_690_ = anIntArray4828[i_684_];
				int i_691_ = anIntArray4828[i_685_];
				int i_692_ = anIntArray4763[i_683_];
				final int i_693_ = anIntArray4763[i_684_];
				int i_694_ = anIntArray4763[i_685_];
				int i_695_ = anIntArray4829[i_683_];
				final int i_696_ = anIntArray4829[i_684_];
				int i_697_ = anIntArray4829[i_685_];
				i_689_ -= i_690_;
				i_691_ -= i_690_;
				i_692_ -= i_693_;
				i_694_ -= i_693_;
				i_695_ -= i_696_;
				i_697_ -= i_696_;
				final int i_698_ = i_692_ * i_697_ - i_695_ * i_694_;
				final int i_699_ = i_695_ * i_691_ - i_689_ * i_697_;
				final int i_700_ = i_689_ * i_694_ - i_692_ * i_691_;
				if (i_690_ * i_698_ + i_693_ * i_699_ + i_696_ * i_700_ > 0) {
					method2368(i);
				}
			} else if (anIntArray4758[i] != -1
					|| ((i_686_ - i_687_)
							* (anIntArray4812[i_685_] - anIntArray4812[i_684_]) - ((anIntArray4812[i_683_] - anIntArray4812[i_684_]) * (i_688_ - i_687_))) > 0) {
				if (i_686_ < 0 || i_687_ < 0 || i_688_ < 0
						|| i_686_ > aClass235_4807.anInt1783
						|| i_687_ > aClass235_4807.anInt1783
						|| i_688_ > aClass235_4807.anInt1783) {
					aClass12_4768.aBoolean135 = true;
				} else {
					aClass12_4768.aBoolean135 = false;
				}
				if (bool_682_) {
					final int i_701_ = anIntArray4758[i];
					if (i_701_ == -1
							|| !(aClass170Array4827[i_701_].aBoolean1314)) {
						method2373(i);
					}
				} else {
					final int i_702_ = anIntArray4758[i];
					if (i_702_ != -1) {
						final Class170 class170 = aClass170Array4827[i_702_];
						final Class329 class329 = aClass329Array4821[i_702_];
						if (!class170.aBoolean1314) {
							method2365(i);
						}
						aHa_Sub2_4797.method1923(class329.anInt2773,
								class329.anInt2767, class329.anInt2764,
								class329.anInt2766, class329.anInt2760,
								class329.anInt2769,
								class170.aShort1310 & 0xffff,
								class329.anInt2770, class170.aByte1308,
								class170.aByte1312);
					} else {
						method2365(i);
					}
				}
			}
		}
	}

	private final boolean method2372(final int i, final int i_703_,
			final Class111 class111, final boolean bool, final int i_704_,
			final int i_705_) {
		aClass111_Sub2_4819 = (Class111_Sub2) class111;
		final Class111_Sub2 class111_sub2 = aHa_Sub2_4797.aClass111_Sub2_4513;
		final float f = (class111_sub2.aFloat4697 + ((class111_sub2.aFloat4700 * aClass111_Sub2_4819.aFloat4697)
				+ (class111_sub2.aFloat4699 * aClass111_Sub2_4819.aFloat4691) + (class111_sub2.aFloat4690 * aClass111_Sub2_4819.aFloat4689)));
		final float f_706_ = (class111_sub2.aFloat4691 + ((class111_sub2.aFloat4692 * aClass111_Sub2_4819.aFloat4697)
				+ (class111_sub2.aFloat4688 * aClass111_Sub2_4819.aFloat4691) + (class111_sub2.aFloat4696 * aClass111_Sub2_4819.aFloat4689)));
		final float f_707_ = (class111_sub2.aFloat4689 + ((class111_sub2.aFloat4693 * aClass111_Sub2_4819.aFloat4697)
				+ (class111_sub2.aFloat4698 * aClass111_Sub2_4819.aFloat4691) + (class111_sub2.aFloat4694 * aClass111_Sub2_4819.aFloat4689)));
		final float f_708_ = ((class111_sub2.aFloat4700 * aClass111_Sub2_4819.aFloat4700)
				+ (class111_sub2.aFloat4699 * aClass111_Sub2_4819.aFloat4692) + (class111_sub2.aFloat4690 * aClass111_Sub2_4819.aFloat4693));
		final float f_709_ = ((class111_sub2.aFloat4700 * aClass111_Sub2_4819.aFloat4699)
				+ (class111_sub2.aFloat4699 * aClass111_Sub2_4819.aFloat4688) + (class111_sub2.aFloat4690 * aClass111_Sub2_4819.aFloat4698));
		final float f_710_ = ((class111_sub2.aFloat4700 * aClass111_Sub2_4819.aFloat4690)
				+ (class111_sub2.aFloat4699 * aClass111_Sub2_4819.aFloat4696) + (class111_sub2.aFloat4690 * aClass111_Sub2_4819.aFloat4694));
		final float f_711_ = ((class111_sub2.aFloat4692 * aClass111_Sub2_4819.aFloat4700)
				+ (class111_sub2.aFloat4688 * aClass111_Sub2_4819.aFloat4692) + (class111_sub2.aFloat4696 * aClass111_Sub2_4819.aFloat4693));
		final float f_712_ = ((class111_sub2.aFloat4692 * aClass111_Sub2_4819.aFloat4699)
				+ (class111_sub2.aFloat4688 * aClass111_Sub2_4819.aFloat4688) + (class111_sub2.aFloat4696 * aClass111_Sub2_4819.aFloat4698));
		final float f_713_ = ((class111_sub2.aFloat4692 * aClass111_Sub2_4819.aFloat4690)
				+ (class111_sub2.aFloat4688 * aClass111_Sub2_4819.aFloat4696) + (class111_sub2.aFloat4696 * aClass111_Sub2_4819.aFloat4694));
		final float f_714_ = ((class111_sub2.aFloat4693 * aClass111_Sub2_4819.aFloat4700)
				+ (class111_sub2.aFloat4698 * aClass111_Sub2_4819.aFloat4692) + (class111_sub2.aFloat4694 * aClass111_Sub2_4819.aFloat4693));
		final float f_715_ = ((class111_sub2.aFloat4693 * aClass111_Sub2_4819.aFloat4699)
				+ (class111_sub2.aFloat4698 * aClass111_Sub2_4819.aFloat4688) + (class111_sub2.aFloat4694 * aClass111_Sub2_4819.aFloat4698));
		final float f_716_ = ((class111_sub2.aFloat4693 * aClass111_Sub2_4819.aFloat4690)
				+ (class111_sub2.aFloat4698 * aClass111_Sub2_4819.aFloat4696) + (class111_sub2.aFloat4694 * aClass111_Sub2_4819.aFloat4694));
		boolean bool_717_ = false;
		final int i_718_ = aHa_Sub2_4797.anInt4510;
		final int i_719_ = aHa_Sub2_4797.anInt4511;
		final int i_720_ = aHa_Sub2_4797.anInt4514;
		final int i_721_ = aHa_Sub2_4797.anInt4490;
		int i_722_ = 2147483647;
		int i_723_ = -2147483648;
		int i_724_ = 2147483647;
		int i_725_ = -2147483648;
		method2351(Thread.currentThread());
		if (!aBoolean4778) {
			method2346();
		}
		final int i_726_ = aShort4801 - aShort4794 >> 1;
		final int i_727_ = aShort4808 - aShort4770 >> 1;
		final int i_728_ = aShort4753 - aShort4774 >> 1;
		final int i_729_ = aShort4794 + i_726_;
		final int i_730_ = aShort4770 + i_727_;
		final int i_731_ = aShort4774 + i_728_;
		final int i_732_ = i_729_ - (i_726_ << i_704_);
		final int i_733_ = i_730_ - (i_727_ << i_704_);
		final int i_734_ = i_731_ - (i_728_ << i_704_);
		final int i_735_ = i_729_ + (i_726_ << i_704_);
		final int i_736_ = i_730_ + (i_727_ << i_704_);
		final int i_737_ = i_731_ + (i_728_ << i_704_);
		anIntArray4767[0] = i_732_;
		anIntArray4818[0] = i_733_;
		anIntArray4747[0] = i_734_;
		anIntArray4767[1] = i_735_;
		anIntArray4818[1] = i_733_;
		anIntArray4747[1] = i_734_;
		anIntArray4767[2] = i_732_;
		anIntArray4818[2] = i_736_;
		anIntArray4747[2] = i_734_;
		anIntArray4767[3] = i_735_;
		anIntArray4818[3] = i_736_;
		anIntArray4747[3] = i_734_;
		anIntArray4767[4] = i_732_;
		anIntArray4818[4] = i_733_;
		anIntArray4747[4] = i_737_;
		anIntArray4767[5] = i_735_;
		anIntArray4818[5] = i_733_;
		anIntArray4747[5] = i_737_;
		anIntArray4767[6] = i_732_;
		anIntArray4818[6] = i_736_;
		anIntArray4747[6] = i_737_;
		anIntArray4767[7] = i_735_;
		anIntArray4818[7] = i_736_;
		anIntArray4747[7] = i_737_;
		for (int i_738_ = 0; i_738_ < 8; i_738_++) {
			final int i_739_ = anIntArray4767[i_738_];
			final int i_740_ = anIntArray4818[i_738_];
			final int i_741_ = anIntArray4747[i_738_];
			final float f_742_ = f
					+ (f_708_ * i_739_ + f_709_ * i_740_ + f_710_ * i_741_);
			final float f_743_ = f_706_
					+ (f_711_ * i_739_ + f_712_ * i_740_ + f_713_ * i_741_);
			float f_744_ = f_707_
					+ (f_714_ * i_739_ + f_715_ * i_740_ + f_716_ * i_741_);
			if (f_744_ >= aHa_Sub2_4797.anInt4502) {
				if (i_705_ > 0) {
					f_744_ = i_705_;
				}
				final int i_745_ = i_718_ + (int) (f_742_ * i_720_ / f_744_);
				final int i_746_ = i_719_ + (int) (f_743_ * i_721_ / f_744_);
				if (i_745_ < i_722_) {
					i_722_ = i_745_;
				}
				if (i_745_ > i_723_) {
					i_723_ = i_745_;
				}
				if (i_746_ < i_724_) {
					i_724_ = i_746_;
				}
				if (i_746_ > i_725_) {
					i_725_ = i_746_;
				}
				bool_717_ = true;
			}
		}
		if (bool_717_ && i > i_722_ && i < i_723_ && i_703_ > i_724_
				&& i_703_ < i_725_) {
			if (bool) {
				return true;
			}
			for (int i_747_ = 0; i_747_ < anInt4786; i_747_++) {
				final int i_748_ = verticesX[i_747_];
				final int i_749_ = verticesY[i_747_];
				final int i_750_ = verticesZ[i_747_];
				final float f_751_ = f
						+ (f_708_ * i_748_ + f_709_ * i_749_ + f_710_ * i_750_);
				final float f_752_ = f_706_
						+ (f_711_ * i_748_ + f_712_ * i_749_ + f_713_ * i_750_);
				float f_753_ = f_707_
						+ (f_714_ * i_748_ + f_715_ * i_749_ + f_716_ * i_750_);
				if (f_753_ >= aHa_Sub2_4797.anInt4502) {
					if (i_705_ > 0) {
						f_753_ = i_705_;
					}
					anIntArray4771[i_747_] = i_718_
							+ (int) (f_751_ * i_720_ / f_753_);
					anIntArray4812[i_747_] = i_719_
							+ (int) (f_752_ * i_721_ / f_753_);
				} else {
					anIntArray4771[i_747_] = -999999;
				}
			}
			for (int i_754_ = 0; i_754_ < anInt4780; i_754_++) {
				if (anIntArray4771[triangleViewspaceX[i_754_]] != -999999
						&& anIntArray4771[triangleViewspaceY[i_754_]] != -999999
						&& anIntArray4771[triangleViewspaceZ[i_754_]] != -999999
						&& method2361(i, i_703_,
								anIntArray4812[triangleViewspaceX[i_754_]],
								anIntArray4812[triangleViewspaceY[i_754_]],
								anIntArray4812[triangleViewspaceZ[i_754_]],
								anIntArray4771[triangleViewspaceX[i_754_]],
								anIntArray4771[triangleViewspaceY[i_754_]],
								anIntArray4771[triangleViewspaceZ[i_754_]])) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	final int ua() {
		return anInt4816;
	}

	@Override
	final void H(final int i, final int i_755_, final int i_756_) {
		if (i != 0 && (anInt4816 & 0x1) != 1) {
			throw new IllegalStateException();
		}
		if (i_755_ != 0 && (anInt4816 & 0x2) != 2) {
			throw new IllegalStateException();
		}
		if (i_756_ != 0 && (anInt4816 & 0x4) != 4) {
			throw new IllegalStateException();
		}
		synchronized (this) {
			for (int i_757_ = 0; i_757_ < anInt4786; i_757_++) {
				verticesX[i_757_] += i;
				verticesY[i_757_] += i_755_;
				verticesZ[i_757_] += i_756_;
			}
		}
	}

	private final void method2373(final int i) {
		if (!aClass235_4807.aBoolean1759) {
			final short i_758_ = triangleViewspaceX[i];
			final short i_759_ = triangleViewspaceY[i];
			final short i_760_ = triangleViewspaceZ[i];
			int i_761_ = (anIntArray4766[i_758_] - aClass235_4807.anInt1761);
			if (i_761_ > 255) {
				i_761_ = 255;
			} else if (i_761_ < 0) {
				i_761_ = 0;
			}
			int i_762_ = (anIntArray4766[i_759_] - aClass235_4807.anInt1761);
			if (i_762_ > 255) {
				i_762_ = 255;
			} else if (i_762_ < 0) {
				i_762_ = 0;
			}
			int i_763_ = (anIntArray4766[i_760_] - aClass235_4807.anInt1761);
			if (i_763_ > 255) {
				i_763_ = 255;
			} else if (i_763_ < 0) {
				i_763_ = 0;
			}
			final int i_764_ = i_761_ + i_762_ + i_763_;
			if (i_764_ != 765) {
				if (i_764_ == 0) {
					method2365(i);
				} else {
					if (aByteArray4822 == null) {
						aClass12_4768.anInt137 = 0;
					} else {
						aClass12_4768.anInt137 = aByteArray4822[i] & 0xff;
					}
					if (aShortArray4804 == null || aShortArray4804[i] == -1) {
						if (anIntArray4836[i] == -1) {
							aClass12_4768
									.method206(
											anIntArray4812[i_758_],
											anIntArray4812[i_759_],
											anIntArray4812[i_760_],
											anIntArray4771[i_758_],
											anIntArray4771[i_759_],
											anIntArray4771[i_760_],
											anIntArray4766[i_758_],
											anIntArray4766[i_759_],
											anIntArray4766[i_760_],
											(Class98_Sub46_Sub5
													.method1544(
															(i_761_ << 24 | aClass235_4807.anInt1763),
															(byte) 123,
															(Class221.anIntArray1665[anIntArray4791[i] & 0xffff]))),
											(Class98_Sub46_Sub5
													.method1544(
															(i_762_ << 24 | aClass235_4807.anInt1763),
															(byte) 120,
															(Class221.anIntArray1665[anIntArray4791[i] & 0xffff]))),
											(Class98_Sub46_Sub5
													.method1544(
															(i_763_ << 24 | aClass235_4807.anInt1763),
															(byte) 120,
															(Class221.anIntArray1665[anIntArray4791[i] & 0xffff]))));
						} else {
							aClass12_4768
									.method206(
											anIntArray4812[i_758_],
											anIntArray4812[i_759_],
											anIntArray4812[i_760_],
											anIntArray4771[i_758_],
											anIntArray4771[i_759_],
											anIntArray4771[i_760_],
											anIntArray4766[i_758_],
											anIntArray4766[i_759_],
											anIntArray4766[i_760_],
											(Class98_Sub46_Sub5
													.method1544(
															(i_761_ << 24 | aClass235_4807.anInt1763),
															(byte) 123,
															(Class221.anIntArray1665[anIntArray4791[i] & 0xffff]))),
											(Class98_Sub46_Sub5
													.method1544(
															(i_762_ << 24 | aClass235_4807.anInt1763),
															(byte) 105,
															(Class221.anIntArray1665[anIntArray4760[i] & 0xffff]))),
											(Class98_Sub46_Sub5
													.method1544(
															(i_763_ << 24 | aClass235_4807.anInt1763),
															(byte) 127,
															(Class221.anIntArray1665[anIntArray4836[i] & 0xffff]))));
						}
					} else {
						int i_765_ = -16777216;
						if (aByteArray4822 != null) {
							i_765_ = 255 - (aByteArray4822[i] & 0xff) << 24;
						}
						if (anIntArray4836[i] == -1) {
							final int i_766_ = i_765_ | anIntArray4791[i]
									& 0xffffff;
							aClass12_4768.method212(anIntArray4812[i_758_],
									anIntArray4812[i_759_],
									anIntArray4812[i_760_],
									anIntArray4771[i_758_],
									anIntArray4771[i_759_],
									anIntArray4771[i_760_],
									anIntArray4766[i_758_],
									anIntArray4766[i_759_],
									anIntArray4766[i_760_],
									aFloatArrayArray4798[i][0],
									aFloatArrayArray4798[i][1],
									aFloatArrayArray4798[i][2],
									aFloatArrayArray4806[i][0],
									aFloatArrayArray4806[i][1],
									aFloatArrayArray4806[i][2], i_766_, i_766_,
									i_766_, aClass235_4807.anInt1763, i_761_,
									i_762_, i_763_, aShortArray4804[i]);
						} else {
							aClass12_4768.method212(anIntArray4812[i_758_],
									anIntArray4812[i_759_],
									anIntArray4812[i_760_],
									anIntArray4771[i_758_],
									anIntArray4771[i_759_],
									anIntArray4771[i_760_],
									anIntArray4766[i_758_],
									anIntArray4766[i_759_],
									anIntArray4766[i_760_],
									aFloatArrayArray4798[i][0],
									aFloatArrayArray4798[i][1],
									aFloatArrayArray4798[i][2],
									aFloatArrayArray4806[i][0],
									aFloatArrayArray4806[i][1],
									aFloatArrayArray4806[i][2], i_765_
											| anIntArray4791[i] & 0xffffff,
									i_765_ | anIntArray4760[i] & 0xffffff,
									i_765_ | anIntArray4836[i] & 0xffffff,
									aClass235_4807.anInt1763, i_761_, i_762_,
									i_763_, aShortArray4804[i]);
						}
					}
				}
			}
		} else {
			final short i_767_ = triangleViewspaceX[i];
			final short i_768_ = triangleViewspaceY[i];
			final short i_769_ = triangleViewspaceZ[i];
			int i_770_ = 0;
			int i_771_ = 0;
			int i_772_ = 0;
			if (anIntArray4817[i_767_] > aClass235_4807.anInt1757) {
				i_770_ = 255;
			} else if (anIntArray4817[i_767_] > aClass235_4807.anInt1754) {
				i_770_ = ((aClass235_4807.anInt1754 - anIntArray4817[i_767_]) * 255 / (aClass235_4807.anInt1754 - aClass235_4807.anInt1757));
			}
			if (anIntArray4817[i_768_] > aClass235_4807.anInt1757) {
				i_771_ = 255;
			} else if (anIntArray4817[i_768_] > aClass235_4807.anInt1754) {
				i_771_ = ((aClass235_4807.anInt1754 - anIntArray4817[i_768_]) * 255 / (aClass235_4807.anInt1754 - aClass235_4807.anInt1757));
			}
			if (anIntArray4817[i_769_] > aClass235_4807.anInt1757) {
				i_772_ = 255;
			} else if (anIntArray4817[i_769_] > aClass235_4807.anInt1754) {
				i_772_ = ((aClass235_4807.anInt1754 - anIntArray4817[i_769_]) * 255 / (aClass235_4807.anInt1754 - aClass235_4807.anInt1757));
			}
			if (aByteArray4822 == null) {
				aClass12_4768.anInt137 = 0;
			} else {
				aClass12_4768.anInt137 = aByteArray4822[i] & 0xff;
			}
			if (aShortArray4804 == null || aShortArray4804[i] == -1) {
				if (anIntArray4836[i] == -1) {
					aClass12_4768
							.method206(
									anIntArray4812[i_767_],
									anIntArray4812[i_768_],
									anIntArray4812[i_769_],
									anIntArray4771[i_767_],
									anIntArray4771[i_768_],
									anIntArray4771[i_769_],
									anIntArray4766[i_767_],
									anIntArray4766[i_768_],
									anIntArray4766[i_769_],
									Class98_Sub46_Sub5
											.method1544(
													(i_770_ << 24 | (aClass235_4807.anInt1763)),
													(byte) 124,
													(Class221.anIntArray1665[(anIntArray4791[i] & 0xffff)])),
									Class98_Sub46_Sub5
											.method1544(
													(i_771_ << 24 | (aClass235_4807.anInt1763)),
													(byte) 127,
													(Class221.anIntArray1665[(anIntArray4791[i] & 0xffff)])),
									Class98_Sub46_Sub5
											.method1544(
													(i_772_ << 24 | (aClass235_4807.anInt1763)),
													(byte) 109,
													(Class221.anIntArray1665[(anIntArray4791[i] & 0xffff)])));
				} else {
					aClass12_4768
							.method206(
									anIntArray4812[i_767_],
									anIntArray4812[i_768_],
									anIntArray4812[i_769_],
									anIntArray4771[i_767_],
									anIntArray4771[i_768_],
									anIntArray4771[i_769_],
									anIntArray4766[i_767_],
									anIntArray4766[i_768_],
									anIntArray4766[i_769_],
									Class98_Sub46_Sub5
											.method1544(
													(i_770_ << 24 | (aClass235_4807.anInt1763)),
													(byte) 127,
													(Class221.anIntArray1665[(anIntArray4791[i] & 0xffff)])),
									Class98_Sub46_Sub5
											.method1544(
													(i_771_ << 24 | (aClass235_4807.anInt1763)),
													(byte) 107,
													(Class221.anIntArray1665[(anIntArray4760[i] & 0xffff)])),
									Class98_Sub46_Sub5
											.method1544(
													(i_772_ << 24 | (aClass235_4807.anInt1763)),
													(byte) 113,
													(Class221.anIntArray1665[(anIntArray4836[i] & 0xffff)])));
				}
			} else {
				int i_773_ = -16777216;
				if (aByteArray4822 != null) {
					i_773_ = 255 - (aByteArray4822[i] & 0xff) << 24;
				}
				if (anIntArray4836[i] == -1) {
					final int i_774_ = i_773_ | anIntArray4791[i] & 0xffffff;
					aClass12_4768.method212(anIntArray4812[i_767_],
							anIntArray4812[i_768_], anIntArray4812[i_769_],
							anIntArray4771[i_767_], anIntArray4771[i_768_],
							anIntArray4771[i_769_], anIntArray4766[i_767_],
							anIntArray4766[i_768_], anIntArray4766[i_769_],
							aFloatArrayArray4798[i][0],
							aFloatArrayArray4798[i][1],
							aFloatArrayArray4798[i][2],
							aFloatArrayArray4806[i][0],
							aFloatArrayArray4806[i][1],
							aFloatArrayArray4806[i][2], i_774_, i_774_, i_774_,
							(aClass235_4807.anInt1763), i_770_, i_771_, i_772_,
							aShortArray4804[i]);
				} else {
					aClass12_4768.method212(anIntArray4812[i_767_],
							anIntArray4812[i_768_], anIntArray4812[i_769_],
							anIntArray4771[i_767_], anIntArray4771[i_768_],
							anIntArray4771[i_769_], anIntArray4766[i_767_],
							anIntArray4766[i_768_], anIntArray4766[i_769_],
							aFloatArrayArray4798[i][0],
							aFloatArrayArray4798[i][1],
							aFloatArrayArray4798[i][2],
							aFloatArrayArray4806[i][0],
							aFloatArrayArray4806[i][1],
							aFloatArrayArray4806[i][2], i_773_
									| anIntArray4791[i] & 0xffffff, i_773_
									| anIntArray4760[i] & 0xffffff, i_773_
									| anIntArray4836[i] & 0xffffff,
							aClass235_4807.anInt1763, i_770_, i_771_, i_772_,
							aShortArray4804[i]);
				}
			}
		}
	}

	@Override
	final int EA() {
		if (!aBoolean4778) {
			method2346();
		}
		return aShort4808;
	}

	@Override
	final void method2327() {
		if (aHa_Sub2_4797.anInt4508 > 1) {
			synchronized (this) {
				((Class146) this).aBoolean1181 = false;
				notifyAll();
			}
		}
	}

	@Override
	final void VA(final int i) {
		if ((anInt4816 & 0x3) != 3) {
			throw new IllegalStateException();
		}
		final int i_775_ = Class284_Sub2_Sub2.anIntArray6200[i];
		final int i_776_ = Class284_Sub2_Sub2.anIntArray6202[i];
		synchronized (this) {
			for (int i_777_ = 0; i_777_ < anInt4786; i_777_++) {
				final int i_778_ = ((verticesY[i_777_] * i_775_ + verticesX[i_777_]
						* i_776_) >> 14);
				verticesY[i_777_] = (verticesY[i_777_] * i_776_ - verticesX[i_777_]
						* i_775_) >> 14;
				verticesX[i_777_] = i_778_;
			}
			method2364();
		}
	}

	private final void method2374() {
		synchronized (this) {
			for (int i = 0; i < anInt4786; i++) {
				final int i_779_ = verticesZ[i];
				verticesZ[i] = verticesX[i];
				verticesX[i] = -i_779_;
			}
			method2364();
		}
	}

	@Override
	final void aa(final short i, final short i_780_) {
		if (aShortArray4804 != null) {
			if (!aBoolean4802 && i_780_ >= 0) {
				final TextureDefinition textureDefinition = ((ha) aHa_Sub2_4797).aD938.method11(
						i_780_ & 0xffff, -28755);
				if (textureDefinition.aByte1823 != 0 || textureDefinition.aByte1837 != 0) {
					aBoolean4802 = true;
				}
			}
			for (int i_781_ = 0; i_781_ < anInt4780; i_781_++) {
				if (aShortArray4804[i_781_] == i) {
					aShortArray4804[i_781_] = i_780_;
				}
			}
		}
	}

	@Override
	final SurfaceSkin[] method2322() {
		return aClass35Array4787;
	}

	private final void method2375() {
		synchronized (this) {
			for (int i = 0; i < anInt4814; i++) {
				int i_782_ = verticesZ[i];
				verticesZ[i] = verticesX[i];
				verticesX[i] = -i_782_;
				if (aClass274Array4789[i] != null) {
					i_782_ = aClass274Array4789[i].anInt2042;
					aClass274Array4789[i].anInt2042 = aClass274Array4789[i].anInt2044;
					aClass274Array4789[i].anInt2044 = -i_782_;
				}
			}
			if (aClass296Array4823 != null) {
				for (int i = 0; i < anInt4780; i++) {
					if (aClass296Array4823[i] != null) {
						final int i_783_ = aClass296Array4823[i].anInt2413;
						aClass296Array4823[i].anInt2413 = aClass296Array4823[i].anInt2411;
						aClass296Array4823[i].anInt2411 = -i_783_;
					}
				}
			}
			for (int i = anInt4814; i < anInt4786; i++) {
				final int i_784_ = verticesZ[i];
				verticesZ[i] = verticesX[i];
				verticesX[i] = -i_784_;
			}
			anInt4784 = 0;
			aBoolean4778 = false;
		}
	}

	@Override
	final void C(final int i) {
		if ((anInt4816 & 0x1000) != 4096) {
			throw new IllegalStateException();
		}
		anInt4761 = i;
		anInt4784 = 0;
	}

	Class146_Sub1(final ha_Sub2 var_ha_Sub2) {
		aBoolean4778 = false;
		anInt4786 = 0;
		anInt4814 = 0;
		anInt4784 = 0;
		aBoolean4815 = false;
		aBoolean4765 = false;
		aBoolean4799 = false;
		aHa_Sub2_4797 = var_ha_Sub2;
	}

	@Override
	final void method2326() {
		/* empty */
	}

	Class146_Sub1(final ha_Sub2 var_ha_Sub2, final Model model,
			final int i, final int i_785_, final int i_786_, final int i_787_) {
		aBoolean4778 = false;
		anInt4786 = 0;
		anInt4814 = 0;
		anInt4784 = 0;
		aBoolean4815 = false;
		aBoolean4765 = false;
		aBoolean4799 = false;
		aHa_Sub2_4797 = var_ha_Sub2;
		anInt4816 = i;
		anInt4761 = i_785_;
		anInt4805 = i_786_;
		final d var_d = ((ha) aHa_Sub2_4797).aD938;
		anInt4786 = model.numVertices;
		anInt4814 = model.maxDepth;
		verticesX = model.verticesX;
		verticesY = model.verticesY;
		verticesZ = model.verticesZ;
		anInt4780 = model.numTriangles;
		triangleViewspaceX = model.triangleViewspaceX;
		triangleViewspaceY = model.triangleViewspaceY;
		triangleViewspaceZ = model.triangleViewspaceZ;
		aByteArray4772 = model.trianglePriorities;
		aShortArray4800 = model.colorValues;
		aByteArray4822 = model.faceAlpha;
		aShortArray4795 = model.aShortArray1394;
		aByteArray4793 = model.faceRenderType;
		aClass87Array4813 = model.surfaces;
		aClass35Array4787 = model.surfaceSkins;
		aShortArray4790 = model.aShortArray1408;
		final int[] is = new int[anInt4780];
		for (int i_788_ = 0; i_788_ < anInt4780; i_788_++) {
			is[i_788_] = i_788_;
		}
		final long[] ls = new long[anInt4780];
		final boolean bool = (anInt4816 & 0x100) != 0;
		for (int i_789_ = 0; i_789_ < anInt4780; i_789_++) {
			final int i_790_ = is[i_789_];
			TextureDefinition textureDefinition = null;
			int i_791_ = 0;
			int i_792_ = 0;
			int i_793_ = 0;
			int i_794_ = 0;
			if (model.isolatedVertexNormals != null) {
				boolean bool_795_ = false;
				for (int i_796_ = 0; i_796_ < model.isolatedVertexNormals.length; i_796_++) {
					final VertexNormal vertexNormal = model.isolatedVertexNormals[i_796_];
					if (i_790_ == vertexNormal.anInt906) {
						final Class177 class177 = Class67.method689(
								vertexNormal.anInt905, (byte) -102);
						if (class177.aBoolean1377) {
							bool_795_ = true;
						}
						if (class177.anInt1373 != -1) {
							final TextureDefinition class238_797_ = var_d.method11(
									(class177.anInt1373), -28755);
							if (class238_797_.anInt1818 == 2) {
								aBoolean4755 = true;
							}
						}
					}
				}
				if (bool_795_) {
					ls[i_789_] = 9223372036854775807L;
				}
			}
			int i_798_ = -1;
			if (model.faceTexture != null) {
				i_798_ = model.faceTexture[i_790_];
				if (i_798_ != -1) {
					textureDefinition = var_d.method11(i_798_ & 0xffff, -28755);
					if ((i_787_ & 0x40) == 0 || !textureDefinition.aBoolean1825) {
						i_793_ = textureDefinition.aByte1820;
						i_794_ = textureDefinition.aByte1816;
					} else {
						i_798_ = -1;
					}
				}
			}
			final boolean bool_799_ = (aByteArray4822 != null
					&& aByteArray4822[i_790_] != 0 || (textureDefinition != null && textureDefinition.anInt1818 == 2));
			if ((bool || bool_799_) && aByteArray4772 != null) {
				i_791_ += aByteArray4772[i_790_] << 17;
			}
			if (bool_799_) {
				i_791_ += 65536;
			}
			i_791_ += (i_793_ & 0xff) << 8;
			i_791_ += i_794_ & 0xff;
			i_792_ += (i_798_ & 0xffff) << 16;
			i_792_ += i_789_ & 0xffff;
			ls[i_789_] = ((long) i_791_ << 32) + i_792_;
			aBoolean4755 |= bool_799_;
		}
		Class90.method882(is, ls, (byte) 118);
		if (model.isolatedVertexNormals != null) {
			anInt4776 = model.isolatedVertexNormals.length;
			aClass170Array4827 = new Class170[anInt4776];
			aClass329Array4821 = new Class329[anInt4776];
			for (int i_800_ = 0; i_800_ < model.isolatedVertexNormals.length; i_800_++) {
				final VertexNormal vertexNormal = model.isolatedVertexNormals[i_800_];
				final Class177 class177 = Class67.method689(vertexNormal.anInt905,
						(byte) -94);
				int i_801_ = ((Class221.anIntArray1665[(model.colorValues[vertexNormal.anInt906]) & 0xffff]) & 0xffffff);
				i_801_ = (i_801_ | 255 - (model.faceAlpha != null ? (model.faceAlpha[vertexNormal.anInt906]) & 0xff
						: 0) << 24);
				aClass170Array4827[i_800_] = new Class170(vertexNormal.anInt906,
						(model.triangleViewspaceX[vertexNormal.anInt906]),
						(model.triangleViewspaceY[vertexNormal.anInt906]),
						(model.triangleViewspaceZ[vertexNormal.anInt906]),
						class177.anInt1374, class177.anInt1380,
						class177.anInt1373, class177.anInt1384,
						class177.anInt1379, class177.aBoolean1377,
						vertexNormal.anInt907);
				aClass329Array4821[i_800_] = new Class329(i_801_);
			}
		}
		aFloatArrayArray4798 = new float[anInt4780][];
		aFloatArrayArray4806 = new float[anInt4780][];
		final Class250 class250 = Class224_Sub2.method2836(is, true, model,
				anInt4780);
		final Class235 class235 = aHa_Sub2_4797.method1921(Thread
				.currentThread());
		final float[] fs = class235.aFloatArray1799;
		boolean bool_802_ = false;
		for (int i_803_ = 0; i_803_ < anInt4780; i_803_++) {
			final int i_804_ = is[i_803_];
			int i_805_;
			if (model.textureCoords == null) {
				i_805_ = -1;
			} else {
				i_805_ = model.textureCoords[i_804_];
			}
			int sourceTexture = (model.faceTexture == null ? (int) -1
					: model.faceTexture[i_804_]);
			if (sourceTexture != -1 && (i_787_ & 0x40) != 0) {
				final TextureDefinition textureDefinition = var_d.method11(sourceTexture & 0xffff,
						-28755);
				if (textureDefinition.aBoolean1825) {
					sourceTexture = -1;
				}
			}
			if (sourceTexture != -1) {//this here converts rs tex coords to UV
				bool_802_ = true;
				final float[] fs_807_ = aFloatArrayArray4798[i_804_] = new float[3];
				final float[] fs_808_ = aFloatArrayArray4806[i_804_] = new float[3];
				if (i_805_ == -1) {
					fs_807_[0] = 0.0F;
					fs_808_[0] = 1.0F;
					fs_807_[1] = 1.0F;
					fs_808_[1] = 1.0F;
					fs_807_[2] = 0.0F;
					fs_808_[2] = 0.0F;
				} else {
					i_805_ &= 0xff;
					final byte i_810_ = model.textureRenderTypes[i_805_];
					if (i_810_ == 0) {
						final short i_811_ = triangleViewspaceX[i_804_];
						final short i_812_ = triangleViewspaceY[i_804_];
						final short i_813_ = triangleViewspaceZ[i_804_];
						//this is not actually PMN they refer to 3d coordinates
						final short i_814_ = model.textureTrianglePIndex[i_805_];
						final short i_815_ = model.textureTriangleMIndex[i_805_];
						final short i_816_ = model.textureTriangleNIndex[i_805_];
						final float f = verticesX[i_814_];
						final float f_817_ = verticesY[i_814_];
						final float f_818_ = verticesZ[i_814_];
						final float f_819_ = verticesX[i_815_] - f;
						final float f_820_ = verticesY[i_815_] - f_817_;
						final float f_821_ = verticesZ[i_815_] - f_818_;
						final float f_822_ = verticesX[i_816_] - f;
						final float f_823_ = verticesY[i_816_] - f_817_;
						final float f_824_ = verticesZ[i_816_] - f_818_;
						final float f_825_ = verticesX[i_811_] - f;
						final float f_826_ = verticesY[i_811_] - f_817_;
						final float f_827_ = verticesZ[i_811_] - f_818_;
						final float f_828_ = verticesX[i_812_] - f;
						final float f_829_ = verticesY[i_812_] - f_817_;
						final float f_830_ = verticesZ[i_812_] - f_818_;
						final float f_831_ = verticesX[i_813_] - f;
						final float f_832_ = verticesY[i_813_] - f_817_;
						final float f_833_ = verticesZ[i_813_] - f_818_;
						final float f_834_ = f_820_ * f_824_ - f_821_ * f_823_;
						final float f_835_ = f_821_ * f_822_ - f_819_ * f_824_;
						final float f_836_ = f_819_ * f_823_ - f_820_ * f_822_;
						float f_837_ = f_823_ * f_836_ - f_824_ * f_835_;
						float f_838_ = f_824_ * f_834_ - f_822_ * f_836_;
						float f_839_ = f_822_ * f_835_ - f_823_ * f_834_;
						float f_840_ = 1.0F / (f_837_ * f_819_ + f_838_
								* f_820_ + f_839_ * f_821_);
						fs_807_[0] = (f_837_ * f_825_ + f_838_ * f_826_ + f_839_
								* f_827_)
								* f_840_;
						fs_807_[1] = (f_837_ * f_828_ + f_838_ * f_829_ + f_839_
								* f_830_)
								* f_840_;
						fs_807_[2] = (f_837_ * f_831_ + f_838_ * f_832_ + f_839_
								* f_833_)
								* f_840_;
						f_837_ = f_820_ * f_836_ - f_821_ * f_835_;
						f_838_ = f_821_ * f_834_ - f_819_ * f_836_;
						f_839_ = f_819_ * f_835_ - f_820_ * f_834_;
						f_840_ = 1.0F / (f_837_ * f_822_ + f_838_ * f_823_ + f_839_
								* f_824_);
						fs_808_[0] = (f_837_ * f_825_ + f_838_ * f_826_ + f_839_
								* f_827_)
								* f_840_;
						fs_808_[1] = (f_837_ * f_828_ + f_838_ * f_829_ + f_839_
								* f_830_)
								* f_840_;
						fs_808_[2] = (f_837_ * f_831_ + f_838_ * f_832_ + f_839_
								* f_833_)
								* f_840_;
					} else {
						final short i_841_ = triangleViewspaceX[i_804_];
						final short i_842_ = triangleViewspaceY[i_804_];
						final short i_843_ = triangleViewspaceZ[i_804_];
						final int i_844_ = class250.anIntArray1911[i_805_];
						final int i_845_ = class250.anIntArray1915[i_805_];
						final int i_846_ = class250.anIntArray1912[i_805_];
						final float[] fs_847_ = (class250.aFloatArrayArray1910[i_805_]);
						final byte i_848_ = model.particleLifespanY[i_805_];
						final float f = ((model.particleLifespanZ[i_805_]) / 256.0F);
						if (i_810_ == 1) {
							final float f_849_ = ((model.particleDirectionZ[i_805_]) / 1024.0F);
							Class98_Sub37.method1460(verticesX[i_841_],
									i_846_, 8, verticesZ[i_841_], i_845_,
									verticesY[i_841_], fs_847_, f_849_,
									i_848_, i_844_, f, fs);
							fs_807_[0] = fs[0];
							fs_808_[0] = fs[1];
							Class98_Sub37.method1460(verticesX[i_842_],
									i_846_, 8, verticesZ[i_842_], i_845_,
									verticesY[i_842_], fs_847_, f_849_,
									i_848_, i_844_, f, fs);
							fs_807_[1] = fs[0];
							fs_808_[1] = fs[1];
							Class98_Sub37.method1460(verticesX[i_843_],
									i_846_, 8, verticesZ[i_843_], i_845_,
									verticesY[i_843_], fs_847_, f_849_,
									i_848_, i_844_, f, fs);
							fs_807_[2] = fs[0];
							fs_808_[2] = fs[1];
							final float f_850_ = f_849_ / 2.0F;
							if ((i_848_ & 0x1) == 0) {
								if (fs_807_[1] - fs_807_[0] > f_850_) {
									fs_807_[1] -= f_849_;
								} else if (fs_807_[0] - fs_807_[1] > f_850_) {
									fs_807_[1] += f_849_;
								}
								if (fs_807_[2] - fs_807_[0] > f_850_) {
									fs_807_[2] -= f_849_;
								} else if (fs_807_[0] - fs_807_[2] > f_850_) {
									fs_807_[2] += f_849_;
								}
							} else {
								if (fs_808_[1] - fs_808_[0] > f_850_) {
									fs_808_[1] -= f_849_;
								} else if (fs_808_[0] - fs_808_[1] > f_850_) {
									fs_808_[1] += f_849_;
								}
								if (fs_808_[2] - fs_808_[0] > f_850_) {
									fs_808_[2] -= f_849_;
								} else if (fs_808_[0] - fs_808_[2] > f_850_) {
									fs_808_[2] += f_849_;
								}
							}
						} else if (i_810_ == 2) {
							final float f_851_ = ((model.anIntArray1397[i_805_]) / 256.0F);
							final float f_852_ = ((model.anIntArray1386[i_805_]) / 256.0F);
							final int i_853_ = (verticesX[i_842_] - verticesX[i_841_]);
							final int i_854_ = (verticesY[i_842_] - verticesY[i_841_]);
							final int i_855_ = (verticesZ[i_842_] - verticesZ[i_841_]);
							final int i_856_ = (verticesX[i_843_] - verticesX[i_841_]);
							final int i_857_ = (verticesY[i_843_] - verticesY[i_841_]);
							final int i_858_ = (verticesZ[i_843_] - verticesZ[i_841_]);
							final int i_859_ = i_854_ * i_858_ - i_857_
									* i_855_;
							final int i_860_ = i_855_ * i_856_ - i_858_
									* i_853_;
							final int i_861_ = i_853_ * i_857_ - i_856_
									* i_854_;
							final float f_862_ = 64.0F / (model.particleDirectionX[i_805_]);
							final float f_863_ = 64.0F / (model.particleDirectionY[i_805_]);
							final float f_864_ = 64.0F / (model.particleDirectionZ[i_805_]);
							final float f_865_ = ((i_859_ * fs_847_[0] + i_860_
									* fs_847_[1] + i_861_ * fs_847_[2]) / f_862_);
							final float f_866_ = ((i_859_ * fs_847_[3] + i_860_
									* fs_847_[4] + i_861_ * fs_847_[5]) / f_863_);
							final float f_867_ = ((i_859_ * fs_847_[6] + i_860_
									* fs_847_[7] + i_861_ * fs_847_[8]) / f_864_);
							final int i_868_ = Class69.method696(f_865_,
									f_867_, (byte) -63, f_866_);
							Class48_Sub1_Sub1.method461(verticesY[i_841_],
									f_852_, i_848_, i_845_, f, 112, f_851_,
									fs_847_, i_868_, fs, i_846_,
									verticesZ[i_841_], i_844_,
									verticesX[i_841_]);
							fs_807_[0] = fs[0];
							fs_808_[0] = fs[1];
							Class48_Sub1_Sub1.method461(verticesY[i_842_],
									f_852_, i_848_, i_845_, f, 121, f_851_,
									fs_847_, i_868_, fs, i_846_,
									verticesZ[i_842_], i_844_,
									verticesX[i_842_]);
							fs_807_[1] = fs[0];
							fs_808_[1] = fs[1];
							Class48_Sub1_Sub1.method461(verticesY[i_843_],
									f_852_, i_848_, i_845_, f, 124, f_851_,
									fs_847_, i_868_, fs, i_846_,
									verticesZ[i_843_], i_844_,
									verticesX[i_843_]);
							fs_807_[2] = fs[0];
							fs_808_[2] = fs[1];
						} else if (i_810_ == 3) {
							Class243.method2943(fs, verticesY[i_841_],
									i_848_, i_846_, fs_847_,
									verticesZ[i_841_], i_845_, f,
									verticesX[i_841_], i_844_, 105);
							fs_807_[0] = fs[0];
							fs_808_[0] = fs[1];
							Class243.method2943(fs, verticesY[i_842_],
									i_848_, i_846_, fs_847_,
									verticesZ[i_842_], i_845_, f,
									verticesX[i_842_], i_844_, 103);
							fs_807_[1] = fs[0];
							fs_808_[1] = fs[1];
							Class243.method2943(fs, verticesY[i_843_],
									i_848_, i_846_, fs_847_,
									verticesZ[i_843_], i_845_, f,
									verticesX[i_843_], i_844_, 127);
							fs_807_[2] = fs[0];
							fs_808_[2] = fs[1];
							if ((i_848_ & 0x1) == 0) {
								if (fs_807_[1] - fs_807_[0] > 0.5F) {
									fs_807_[1]--;
								} else if (fs_807_[0] - fs_807_[1] > 0.5F) {
									fs_807_[1]++;
								}
								if (fs_807_[2] - fs_807_[0] > 0.5F) {
									fs_807_[2]--;
								} else if (fs_807_[0] - fs_807_[2] > 0.5F) {
									fs_807_[2]++;
								}
							} else {
								if (fs_808_[1] - fs_808_[0] > 0.5F) {
									fs_808_[1]--;
								} else if (fs_808_[0] - fs_808_[1] > 0.5F) {
									fs_808_[1]++;
								}
								if (fs_808_[2] - fs_808_[0] > 0.5F) {
									fs_808_[2]--;
								} else if (fs_808_[0] - fs_808_[2] > 0.5F) {
									fs_808_[2]++;
								}
							}
						}
					}
				}
			}
		}
		if (!bool_802_) {
			aFloatArrayArray4798 = aFloatArrayArray4806 = null;
		}
		if (model.vertexSkins != null && (anInt4816 & 0x20) != 0) {
			anIntArrayArray4834 = model.method2595(19, true);
		}
		if (model.triangleSkinValues != null && (anInt4816 & 0x180) != 0) {
			anIntArrayArray4833 = model.method2591((byte) 122);
		}
		if (model.isolatedVertexNormals != null && (anInt4816 & 0x400) != 0) {
			anIntArrayArray4796 = model.method2596(21517);
		}
		if (model.faceTexture != null) {
			aShortArray4804 = new short[anInt4780];
			boolean bool_869_ = false;
			for (int i_870_ = 0; i_870_ < anInt4780; i_870_++) {
				final short i_871_ = model.faceTexture[i_870_];
				if (i_871_ != -1) {
					final TextureDefinition textureDefinition = ((ha) aHa_Sub2_4797).aD938
							.method11(i_871_, -28755);
					if ((i_787_ & 0x40) == 0 || !textureDefinition.aBoolean1825) {
						aShortArray4804[i_870_] = i_871_;
						bool_869_ = true;
						if (textureDefinition.anInt1818 == 2) {
							aBoolean4755 = true;
						}
						if (textureDefinition.aByte1823 != 0 || textureDefinition.aByte1837 != 0) {
							aBoolean4802 = true;
						}
					} else {
						aShortArray4804[i_870_] = (short) -1;
					}
				} else {
					aShortArray4804[i_870_] = (short) -1;
				}
			}
			if (!bool_869_) {
				aShortArray4804 = null;
			}
		} else {
			aShortArray4804 = null;
		}
		if (aBoolean4755 || aClass170Array4827 != null) {
			aShortArray4809 = new short[anInt4780];
			for (int i_872_ = 0; i_872_ < anInt4780; i_872_++) {
				aShortArray4809[i_872_] = (short) is[i_872_];
			}
		}
	}

	static {
		anInt4810 = 4096;
		anInt4825 = 4096;
	}
}
