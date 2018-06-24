/* Class43_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class43_Sub5 extends Class43 {
	private final int[] anIntArray3622;
	private final byte[][] aByteArrayArray3623;
	private final int[] anIntArray3624;
	private final int[] anIntArray3625;
	private final ha_Sub2 aHa_Sub2_3626;
	private final int[] anIntArray3627;

	private final void method423(final byte[] is, final int[] is_0_,
			final int i, int i_1_, int i_2_, int i_3_, final int i_4_,
			final int i_5_, final int i_6_) {
		final int i_7_ = -(i_3_ >> 2);
		i_3_ = -(i_3_ & 0x3);
		for (int i_8_ = -i_4_; i_8_ < 0; i_8_++) {
			for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
				if (is[i_1_++] != 0) {
					is_0_[i_2_++] = i;
				} else {
					i_2_++;
				}
				if (is[i_1_++] != 0) {
					is_0_[i_2_++] = i;
				} else {
					i_2_++;
				}
				if (is[i_1_++] != 0) {
					is_0_[i_2_++] = i;
				} else {
					i_2_++;
				}
				if (is[i_1_++] != 0) {
					is_0_[i_2_++] = i;
				} else {
					i_2_++;
				}
			}
			for (int i_10_ = i_3_; i_10_ < 0; i_10_++) {
				if (is[i_1_++] != 0) {
					is_0_[i_2_++] = i;
				} else {
					i_2_++;
				}
			}
			i_2_ += i_5_;
			i_1_ += i_6_;
		}
	}

	private final void method424(final byte[] is, final int[] is_11_,
			final int i, int i_12_, int i_13_, final int i_14_,
			final int i_15_, final int i_16_, final int i_17_) {
		final int i_18_ = i >>> 24;
		final int i_19_ = 255 - i_18_;
		for (int i_20_ = -i_15_; i_20_ < 0; i_20_++) {
			for (int i_21_ = -i_14_; i_21_ < 0; i_21_++) {
				if (is[i_12_++] != 0) {
					final int i_22_ = ((((i & 0xff00ff) * i_18_ & ~0xff00ff) + ((i & 0xff00)
							* i_18_ & 0xff0000)) >> 8);
					final int i_23_ = is_11_[i_13_];
					is_11_[i_13_++] = ((((i_23_ & 0xff00ff) * i_19_ & ~0xff00ff) + ((i_23_ & 0xff00)
							* i_19_ & 0xff0000)) >> 8)
							+ i_22_;
				} else {
					i_13_++;
				}
			}
			i_13_ += i_16_;
			i_12_ += i_17_;
		}
	}

	private final void method425(final byte[] is, final int[] is_24_,
			final int i, int i_25_, int i_26_, final int i_27_,
			final int i_28_, final int i_29_, final int i_30_, final int i_31_,
			final int i_32_, final int i_33_, final aa var_aa, final int i_34_,
			final int i_35_) {
		final aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		final int[] is_36_ = var_aa_Sub1.anIntArray3555;
		final int[] is_37_ = var_aa_Sub1.anIntArray3557;
		int i_38_ = i_32_;
		if (i_35_ > i_38_) {
			i_38_ = i_35_;
			i_26_ += (i_35_ - i_32_) * aHa_Sub2_3626.anInt4505;
			i_25_ += (i_35_ - i_32_) * i_33_;
		}
		final int i_39_ = (i_35_ + is_36_.length < i_32_ + i_28_ ? i_35_
				+ is_36_.length : i_32_ + i_28_);
		for (int i_40_ = i_38_; i_40_ < i_39_; i_40_++) {
			final int i_41_ = i_34_ + is_36_[i_40_ - i_35_];
			int i_42_ = is_37_[i_40_ - i_35_];
			int i_43_ = i_27_;
			if (i_31_ > i_41_) {
				final int i_44_ = i_31_ - i_41_;
				if (i_44_ >= i_42_) {
					i_25_ += i_27_ + i_30_;
					i_26_ += i_27_ + i_29_;
					continue;
				}
				i_42_ -= i_44_;
			} else {
				final int i_45_ = i_41_ - i_31_;
				if (i_45_ >= i_27_) {
					i_25_ += i_27_ + i_30_;
					i_26_ += i_27_ + i_29_;
					continue;
				}
				i_25_ += i_45_;
				i_43_ -= i_45_;
				i_26_ += i_45_;
			}
			int i_46_ = 0;
			if (i_43_ < i_42_) {
				i_42_ = i_43_;
			} else {
				i_46_ = i_43_ - i_42_;
			}
			for (int i_47_ = 0; i_47_ < i_42_; i_47_++) {
				if (is[i_25_++] != 0) {
					is_24_[i_26_++] = i;
				} else {
					i_26_++;
				}
			}
			i_25_ += i_46_ + i_30_;
			i_26_ += i_46_ + i_29_;
		}
	}

	private final void method426(final byte[] is, final int[] is_48_,
			final int i, int i_49_, int i_50_, final int i_51_,
			final int i_52_, final int i_53_, final int i_54_, final int i_55_,
			final int i_56_, final int i_57_, final aa var_aa, final int i_58_,
			final int i_59_) {
		final aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		final int[] is_60_ = var_aa_Sub1.anIntArray3555;
		final int[] is_61_ = var_aa_Sub1.anIntArray3557;
		final int i_62_ = i_55_ - aHa_Sub2_3626.anInt4509;
		int i_63_ = i_56_;
		if (i_59_ > i_63_) {
			i_63_ = i_59_;
			i_50_ += (i_59_ - i_56_) * aHa_Sub2_3626.anInt4505;
			i_49_ += (i_59_ - i_56_) * i_57_;
		}
		final int i_64_ = (i_59_ + is_60_.length < i_56_ + i_52_ ? i_59_
				+ is_60_.length : i_56_ + i_52_);
		final int i_65_ = i >>> 24;
		final int i_66_ = 255 - i_65_;
		for (int i_67_ = i_63_; i_67_ < i_64_; i_67_++) {
			final int i_68_ = is_60_[i_67_ - i_59_] + i_58_;
			int i_69_ = is_61_[i_67_ - i_59_];
			int i_70_ = i_51_;
			if (i_62_ > i_68_) {
				final int i_71_ = i_62_ - i_68_;
				if (i_71_ >= i_69_) {
					i_49_ += i_51_ + i_54_;
					i_50_ += i_51_ + i_53_;
					continue;
				}
				i_69_ -= i_71_;
			} else {
				final int i_72_ = i_68_ - i_62_;
				if (i_72_ >= i_51_) {
					i_49_ += i_51_ + i_54_;
					i_50_ += i_51_ + i_53_;
					continue;
				}
				i_49_ += i_72_;
				i_70_ -= i_72_;
				i_50_ += i_72_;
			}
			int i_73_ = 0;
			if (i_70_ < i_69_) {
				i_69_ = i_70_;
			} else {
				i_73_ = i_70_ - i_69_;
			}
			for (int i_74_ = -i_69_; i_74_ < 0; i_74_++) {
				if (is[i_49_++] != 0) {
					final int i_75_ = ((((i & 0xff00ff) * i_65_ & ~0xff00ff) + ((i & 0xff00)
							* i_65_ & 0xff0000)) >> 8);
					final int i_76_ = is_48_[i_50_];
					is_48_[i_50_++] = ((((i_76_ & 0xff00ff) * i_66_ & ~0xff00ff) + ((i_76_ & 0xff00)
							* i_66_ & 0xff0000)) >> 8)
							+ i_75_;
				} else {
					i_50_++;
				}
			}
			i_49_ += i_73_ + i_54_;
			i_50_ += i_73_ + i_53_;
		}
	}

	@Override
	final void fa(final char c, int i, int i_77_, final int i_78_,
			final boolean bool) {
		i += anIntArray3624[c];
		i_77_ += anIntArray3622[c];
		int i_79_ = anIntArray3627[c];
		int i_80_ = anIntArray3625[c];
		final int i_81_ = aHa_Sub2_3626.anInt4505;
		int i_82_ = i + i_77_ * i_81_;
		int i_83_ = i_81_ - i_79_;
		int i_84_ = 0;
		int i_85_ = 0;
		if (i_77_ < aHa_Sub2_3626.anInt4495) {
			final int i_86_ = aHa_Sub2_3626.anInt4495 - i_77_;
			i_80_ -= i_86_;
			i_77_ = aHa_Sub2_3626.anInt4495;
			i_85_ += i_86_ * i_79_;
			i_82_ += i_86_ * i_81_;
		}
		if (i_77_ + i_80_ > aHa_Sub2_3626.anInt4492) {
			i_80_ -= i_77_ + i_80_ - aHa_Sub2_3626.anInt4492;
		}
		if (i < aHa_Sub2_3626.anInt4509) {
			final int i_87_ = aHa_Sub2_3626.anInt4509 - i;
			i_79_ -= i_87_;
			i = aHa_Sub2_3626.anInt4509;
			i_85_ += i_87_;
			i_82_ += i_87_;
			i_84_ += i_87_;
			i_83_ += i_87_;
		}
		if (i + i_79_ > aHa_Sub2_3626.anInt4507) {
			final int i_88_ = i + i_79_ - aHa_Sub2_3626.anInt4507;
			i_79_ -= i_88_;
			i_84_ += i_88_;
			i_83_ += i_88_;
		}
		if (i_79_ > 0 && i_80_ > 0) {
			if ((i_78_ & ~0xffffff) == -16777216) {
				method423(aByteArrayArray3623[c], aHa_Sub2_3626.anIntArray4504,
						i_78_, i_85_, i_82_, i_79_, i_80_, i_83_, i_84_);
			} else if ((i_78_ & ~0xffffff) != 0) {
				method424(aByteArrayArray3623[c], aHa_Sub2_3626.anIntArray4504,
						i_78_, i_85_, i_82_, i_79_, i_80_, i_83_, i_84_);
			}
		}
	}

	@Override
	final void method409(final char c, int i, int i_89_, final int i_90_,
			final boolean bool, final aa var_aa, final int i_91_,
			final int i_92_) {
		if (var_aa == null) {
			fa(c, i, i_89_, i_90_, bool);
		} else {
			i += anIntArray3624[c];
			i_89_ += anIntArray3622[c];
			int i_93_ = anIntArray3627[c];
			int i_94_ = anIntArray3625[c];
			final int i_95_ = aHa_Sub2_3626.anInt4505;
			int i_96_ = i + i_89_ * i_95_;
			int i_97_ = i_95_ - i_93_;
			int i_98_ = 0;
			int i_99_ = 0;
			if (i_89_ < aHa_Sub2_3626.anInt4495) {
				final int i_100_ = aHa_Sub2_3626.anInt4495 - i_89_;
				i_94_ -= i_100_;
				i_89_ = aHa_Sub2_3626.anInt4495;
				i_99_ += i_100_ * i_93_;
				i_96_ += i_100_ * i_95_;
			}
			if (i_89_ + i_94_ > aHa_Sub2_3626.anInt4492) {
				i_94_ -= i_89_ + i_94_ - aHa_Sub2_3626.anInt4492;
			}
			if (i < aHa_Sub2_3626.anInt4509) {
				final int i_101_ = aHa_Sub2_3626.anInt4509 - i;
				i_93_ -= i_101_;
				i = aHa_Sub2_3626.anInt4509;
				i_99_ += i_101_;
				i_96_ += i_101_;
				i_98_ += i_101_;
				i_97_ += i_101_;
			}
			if (i + i_93_ > aHa_Sub2_3626.anInt4507) {
				final int i_102_ = i + i_93_ - aHa_Sub2_3626.anInt4507;
				i_93_ -= i_102_;
				i_98_ += i_102_;
				i_97_ += i_102_;
			}
			if (i_93_ > 0 && i_94_ > 0) {
				if ((i_90_ & ~0xffffff) == -16777216) {
					method425(aByteArrayArray3623[c],
							aHa_Sub2_3626.anIntArray4504, i_90_, i_99_, i_96_,
							i_93_, i_94_, i_97_, i_98_, i, i_89_,
							anIntArray3627[c], var_aa, i_91_, i_92_);
				} else {
					method426(aByteArrayArray3623[c],
							aHa_Sub2_3626.anIntArray4504, i_90_, i_99_, i_96_,
							i_93_, i_94_, i_97_, i_98_, i, i_89_,
							anIntArray3627[c], var_aa, i_91_, i_92_);
				}
			}
		}
	}

	Class43_Sub5(final ha_Sub2 var_ha_Sub2, final Class197 class197,
			final Class324[] class324s, final int[] is, final int[] is_103_) {
		super(var_ha_Sub2, class197);
		aHa_Sub2_3626 = var_ha_Sub2;
		anIntArray3627 = is;
		anIntArray3625 = is_103_;
		aByteArrayArray3623 = new byte[class324s.length][];
		anIntArray3622 = new int[class324s.length];
		anIntArray3624 = new int[class324s.length];
		for (int i = 0; i < class324s.length; i++) {
			aByteArrayArray3623[i] = class324s[i].aByteArray2717;
			anIntArray3622[i] = class324s[i].anInt2721;
			anIntArray3624[i] = class324s[i].anInt2725;
		}
	}
}
