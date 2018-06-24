/* Class43_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class43_Sub4 extends Class43 {
	private final byte[][] aByteArrayArray3615;
	private final int[] anIntArray3616;
	private final int[] anIntArray3617;
	private final int[] anIntArray3618;
	private final int[] anIntArray3619;
	private final int[] anIntArray3620;
	private ha_Sub2 aHa_Sub2_3621;

	@Override
	final void fa(final char c, int i, int i_0_, final int i_1_,
			final boolean bool) {
		i += anIntArray3620[c];
		i_0_ += anIntArray3618[c];
		int i_2_ = anIntArray3619[c];
		int i_3_ = anIntArray3616[c];
		final int i_4_ = aHa_Sub2_3621.anInt4505;
		int i_5_ = i + i_0_ * i_4_;
		int i_6_ = i_4_ - i_2_;
		int i_7_ = 0;
		int i_8_ = 0;
		if (i_0_ < aHa_Sub2_3621.anInt4495) {
			final int i_9_ = aHa_Sub2_3621.anInt4495 - i_0_;
			i_3_ -= i_9_;
			i_0_ = aHa_Sub2_3621.anInt4495;
			i_8_ += i_9_ * i_2_;
			i_5_ += i_9_ * i_4_;
		}
		if (i_0_ + i_3_ > aHa_Sub2_3621.anInt4492) {
			i_3_ -= i_0_ + i_3_ - aHa_Sub2_3621.anInt4492;
		}
		if (i < aHa_Sub2_3621.anInt4509) {
			final int i_10_ = aHa_Sub2_3621.anInt4509 - i;
			i_2_ -= i_10_;
			i = aHa_Sub2_3621.anInt4509;
			i_8_ += i_10_;
			i_5_ += i_10_;
			i_7_ += i_10_;
			i_6_ += i_10_;
		}
		if (i + i_2_ > aHa_Sub2_3621.anInt4507) {
			final int i_11_ = i + i_2_ - aHa_Sub2_3621.anInt4507;
			i_2_ -= i_11_;
			i_7_ += i_11_;
			i_6_ += i_11_;
		}
		if (i_2_ > 0 && i_3_ > 0) {
			if (bool) {
				method422(aByteArrayArray3615[c], aHa_Sub2_3621.anIntArray4504,
						i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
			} else {
				method421(aByteArrayArray3615[c], aHa_Sub2_3621.anIntArray4504,
						anIntArray3617, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
			}
		}
	}

	private final void method419(final byte[] is, final int[] is_12_,
			final int i, int i_13_, int i_14_, final int i_15_,
			final int i_16_, final int i_17_, final int i_18_, final int i_19_,
			final int i_20_, final int i_21_, final aa var_aa, final int i_22_,
			final int i_23_) {
		final aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		final int[] is_24_ = var_aa_Sub1.anIntArray3555;
		final int[] is_25_ = var_aa_Sub1.anIntArray3557;
		final int i_26_ = i_19_ - aHa_Sub2_3621.anInt4509;
		int i_27_ = i_20_;
		if (i_23_ > i_27_) {
			i_27_ = i_23_;
			i_14_ += (i_23_ - i_20_) * aHa_Sub2_3621.anInt4505;
			i_13_ += (i_23_ - i_20_) * i_21_;
		}
		final int i_28_ = (i_23_ + is_24_.length < i_20_ + i_16_ ? i_23_
				+ is_24_.length : i_20_ + i_16_);
		for (int i_29_ = i_27_; i_29_ < i_28_; i_29_++) {
			final int i_30_ = is_24_[i_29_ - i_23_] + i_22_;
			int i_31_ = is_25_[i_29_ - i_23_];
			int i_32_ = i_15_;
			if (i_26_ > i_30_) {
				final int i_33_ = i_26_ - i_30_;
				if (i_33_ >= i_31_) {
					i_13_ += i_15_ + i_18_;
					i_14_ += i_15_ + i_17_;
					continue;
				}
				i_31_ -= i_33_;
			} else {
				final int i_34_ = i_30_ - i_26_;
				if (i_34_ >= i_15_) {
					i_13_ += i_15_ + i_18_;
					i_14_ += i_15_ + i_17_;
					continue;
				}
				i_13_ += i_34_;
				i_32_ -= i_34_;
				i_14_ += i_34_;
			}
			int i_35_ = 0;
			if (i_32_ < i_31_) {
				i_31_ = i_32_;
			} else {
				i_35_ = i_32_ - i_31_;
			}
			for (int i_36_ = -i_31_; i_36_ < 0; i_36_++) {
				if (is[i_13_++] != 0) {
					is_12_[i_14_++] = i;
				} else {
					i_14_++;
				}
			}
			i_13_ += i_35_ + i_13_;
			i_14_ += i_35_ + i_17_;
		}
	}

	private final void method420(final byte[] is, final int[] is_37_,
			final int[] is_38_, final int i, int i_39_, int i_40_,
			final int i_41_, final int i_42_, final int i_43_, final int i_44_,
			final int i_45_, final int i_46_, final int i_47_, final aa var_aa,
			final int i_48_, final int i_49_) {
		final aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		final int[] is_50_ = var_aa_Sub1.anIntArray3555;
		final int[] is_51_ = var_aa_Sub1.anIntArray3557;
		final int i_52_ = i_45_ - aHa_Sub2_3621.anInt4509;
		int i_53_ = i_46_;
		if (i_49_ > i_53_) {
			i_53_ = i_49_;
			i_40_ += (i_49_ - i_46_) * aHa_Sub2_3621.anInt4505;
			i_39_ += (i_49_ - i_46_) * i_47_;
		}
		final int i_54_ = (i_49_ + is_50_.length < i_46_ + i_42_ ? i_49_
				+ is_50_.length : i_46_ + i_42_);
		for (int i_55_ = i_53_; i_55_ < i_54_; i_55_++) {
			final int i_56_ = is_50_[i_55_ - i_49_] + i_48_;
			int i_57_ = is_51_[i_55_ - i_49_];
			int i_58_ = i_41_;
			if (i_52_ > i_56_) {
				final int i_59_ = i_52_ - i_56_;
				if (i_59_ >= i_57_) {
					i_39_ += i_41_ + i_44_;
					i_40_ += i_41_ + i_43_;
					continue;
				}
				i_57_ -= i_59_;
			} else {
				final int i_60_ = i_56_ - i_52_;
				if (i_60_ >= i_41_) {
					i_39_ += i_41_ + i_44_;
					i_40_ += i_41_ + i_43_;
					continue;
				}
				i_39_ += i_60_;
				i_58_ -= i_60_;
				i_40_ += i_60_;
			}
			int i_61_ = 0;
			if (i_58_ < i_57_) {
				i_57_ = i_58_;
			} else {
				i_61_ = i_58_ - i_57_;
			}
			for (int i_62_ = -i_57_; i_62_ < 0; i_62_++) {
				int i_63_;
				if ((i_63_ = is[i_39_++]) != 0) {
					is_37_[i_40_++] = is_38_[i_63_ & 0xff];
				} else {
					i_40_++;
				}
			}
			i_39_ += i_61_ + i_44_;
			i_40_ += i_61_ + i_43_;
		}
	}

	Class43_Sub4(final ha_Sub2 var_ha_Sub2, final Class197 class197,
			final Class324[] class324s, final int[] is, final int[] is_64_) {
		super(var_ha_Sub2, class197);
		aHa_Sub2_3621 = var_ha_Sub2;
		aHa_Sub2_3621 = var_ha_Sub2;
		anIntArray3619 = is;
		anIntArray3616 = is_64_;
		aByteArrayArray3615 = new byte[class324s.length][];
		anIntArray3618 = new int[class324s.length];
		anIntArray3620 = new int[class324s.length];
		for (int i = 0; i < class324s.length; i++) {
			aByteArrayArray3615[i] = class324s[i].aByteArray2717;
			anIntArray3618[i] = class324s[i].anInt2721;
			anIntArray3620[i] = class324s[i].anInt2725;
		}
		anIntArray3617 = class324s[0].anIntArray2718;
	}

	@Override
	final void method409(final char c, int i, int i_65_, final int i_66_,
			final boolean bool, final aa var_aa, final int i_67_,
			final int i_68_) {
		if (var_aa == null) {
			fa(c, i, i_65_, i_66_, bool);
		} else {
			i += anIntArray3620[c];
			i_65_ += anIntArray3618[c];
			int i_69_ = anIntArray3619[c];
			int i_70_ = anIntArray3616[c];
			final int i_71_ = aHa_Sub2_3621.anInt4505;
			int i_72_ = i + i_65_ * i_71_;
			int i_73_ = i_71_ - i_69_;
			int i_74_ = 0;
			int i_75_ = 0;
			if (i_65_ < aHa_Sub2_3621.anInt4495) {
				final int i_76_ = aHa_Sub2_3621.anInt4495 - i_65_;
				i_70_ -= i_76_;
				i_65_ = aHa_Sub2_3621.anInt4495;
				i_75_ += i_76_ * i_69_;
				i_72_ += i_76_ * i_71_;
			}
			if (i_65_ + i_70_ > aHa_Sub2_3621.anInt4492) {
				i_70_ -= i_65_ + i_70_ - aHa_Sub2_3621.anInt4492;
			}
			if (i < aHa_Sub2_3621.anInt4509) {
				final int i_77_ = aHa_Sub2_3621.anInt4509 - i;
				i_69_ -= i_77_;
				i = aHa_Sub2_3621.anInt4509;
				i_75_ += i_77_;
				i_72_ += i_77_;
				i_74_ += i_77_;
				i_73_ += i_77_;
			}
			if (i + i_69_ > aHa_Sub2_3621.anInt4507) {
				final int i_78_ = i + i_69_ - aHa_Sub2_3621.anInt4507;
				i_69_ -= i_78_;
				i_74_ += i_78_;
				i_73_ += i_78_;
			}
			if (i_69_ > 0 && i_70_ > 0) {
				if (bool) {
					method419(aByteArrayArray3615[c],
							aHa_Sub2_3621.anIntArray4504, i_66_, i_75_, i_72_,
							i_69_, i_70_, i_73_, i_74_, i, i_65_,
							anIntArray3619[c], var_aa, i_67_, i_68_);
				} else {
					method420(aByteArrayArray3615[c],
							aHa_Sub2_3621.anIntArray4504, anIntArray3617,
							i_66_, i_75_, i_72_, i_69_, i_70_, i_73_, i_74_, i,
							i_65_, anIntArray3619[c], var_aa, i_67_, i_68_);
				}
			}
		}
	}

	private final void method421(final byte[] is, final int[] is_79_,
			final int[] is_80_, int i, int i_81_, int i_82_, final int i_83_,
			final int i_84_, final int i_85_) {
		final int i_86_ = -(i_82_ >> 2);
		i_82_ = -(i_82_ & 0x3);
		for (int i_87_ = -i_83_; i_87_ < 0; i_87_++) {
			for (int i_88_ = i_86_; i_88_ < 0; i_88_++) {
				int i_89_;
				if ((i_89_ = is[i++]) != 0) {
					is_79_[i_81_++] = is_80_[i_89_ & 0xff];
				} else {
					i_81_++;
				}
				if ((i_89_ = is[i++]) != 0) {
					is_79_[i_81_++] = is_80_[i_89_ & 0xff];
				} else {
					i_81_++;
				}
				if ((i_89_ = is[i++]) != 0) {
					is_79_[i_81_++] = is_80_[i_89_ & 0xff];
				} else {
					i_81_++;
				}
				if ((i_89_ = is[i++]) != 0) {
					is_79_[i_81_++] = is_80_[i_89_ & 0xff];
				} else {
					i_81_++;
				}
			}
			for (int i_90_ = i_82_; i_90_ < 0; i_90_++) {
				int i_91_;
				if ((i_91_ = is[i++]) != 0) {
					is_79_[i_81_++] = is_80_[i_91_ & 0xff];
				} else {
					i_81_++;
				}
			}
			i_81_ += i_84_;
			i += i_85_;
		}
	}

	private final void method422(final byte[] is, final int[] is_92_,
			final int i, int i_93_, int i_94_, int i_95_, final int i_96_,
			final int i_97_, final int i_98_) {
		final int i_99_ = -(i_95_ >> 2);
		i_95_ = -(i_95_ & 0x3);
		for (int i_100_ = -i_96_; i_100_ < 0; i_100_++) {
			for (int i_101_ = i_99_; i_101_ < 0; i_101_++) {
				if (is[i_93_++] != 0) {
					is_92_[i_94_++] = i;
				} else {
					i_94_++;
				}
				if (is[i_93_++] != 0) {
					is_92_[i_94_++] = i;
				} else {
					i_94_++;
				}
				if (is[i_93_++] != 0) {
					is_92_[i_94_++] = i;
				} else {
					i_94_++;
				}
				if (is[i_93_++] != 0) {
					is_92_[i_94_++] = i;
				} else {
					i_94_++;
				}
			}
			for (int i_102_ = i_95_; i_102_ < 0; i_102_++) {
				if (is[i_93_++] != 0) {
					is_92_[i_94_++] = i;
				} else {
					i_94_++;
				}
			}
			i_94_ += i_97_;
			i_93_ += i_98_;
		}
	}
}
