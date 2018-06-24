/* Class43_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class43_Sub3 extends Class43 {
	private final int[] anIntArray3609;
	private final int[] anIntArray3610;
	private final int[] anIntArray3611;
	private final byte[][] aByteArrayArray3612;
	private final int[] anIntArray3613;
	private ha_Sub2 aHa_Sub2_3614;

	Class43_Sub3(final ha_Sub2 var_ha_Sub2, final Class197 class197,
			final Class324[] class324s, final int[] is, final int[] is_0_) {
		super(var_ha_Sub2, class197);
		aHa_Sub2_3614 = var_ha_Sub2;
		aHa_Sub2_3614 = var_ha_Sub2;
		anIntArray3610 = is;
		anIntArray3609 = is_0_;
		aByteArrayArray3612 = new byte[class324s.length][];
		anIntArray3613 = new int[class324s.length];
		anIntArray3611 = new int[class324s.length];
		for (int i = 0; i < class324s.length; i++) {
			final Class324 class324 = class324s[i];
			if (class324.aByteArray2723 != null) {
				aByteArrayArray3612[i] = class324.aByteArray2723;
			} else {
				final byte[] is_1_ = class324.aByteArray2717;
				final byte[] is_2_ = aByteArrayArray3612[i] = new byte[is_1_.length];
				for (int i_3_ = 0; i_3_ < is_1_.length; i_3_++) {
					is_2_[i_3_] = (byte) (is_1_[i_3_] == 0 ? 0 : -1);
				}
			}
			anIntArray3613[i] = class324.anInt2721;
			anIntArray3611[i] = class324.anInt2725;
		}
	}

	@Override
	final void fa(final char c, int i, int i_4_, final int i_5_,
			final boolean bool) {
		i += anIntArray3611[c];
		i_4_ += anIntArray3613[c];
		int i_6_ = anIntArray3610[c];
		int i_7_ = anIntArray3609[c];
		final int i_8_ = aHa_Sub2_3614.anInt4505;
		int i_9_ = i + i_4_ * i_8_;
		int i_10_ = i_8_ - i_6_;
		int i_11_ = 0;
		int i_12_ = 0;
		if (i_4_ < aHa_Sub2_3614.anInt4495) {
			final int i_13_ = aHa_Sub2_3614.anInt4495 - i_4_;
			i_7_ -= i_13_;
			i_4_ = aHa_Sub2_3614.anInt4495;
			i_12_ += i_13_ * i_6_;
			i_9_ += i_13_ * i_8_;
		}
		if (i_4_ + i_7_ > aHa_Sub2_3614.anInt4492) {
			i_7_ -= i_4_ + i_7_ - aHa_Sub2_3614.anInt4492;
		}
		if (i < aHa_Sub2_3614.anInt4509) {
			final int i_14_ = aHa_Sub2_3614.anInt4509 - i;
			i_6_ -= i_14_;
			i = aHa_Sub2_3614.anInt4509;
			i_12_ += i_14_;
			i_9_ += i_14_;
			i_11_ += i_14_;
			i_10_ += i_14_;
		}
		if (i + i_6_ > aHa_Sub2_3614.anInt4507) {
			final int i_15_ = i + i_6_ - aHa_Sub2_3614.anInt4507;
			i_6_ -= i_15_;
			i_11_ += i_15_;
			i_10_ += i_15_;
		}
		if (i_6_ > 0 && i_7_ > 0) {
			method417(aByteArrayArray3612[c], aHa_Sub2_3614.anIntArray4504,
					i_5_, i_12_, i_9_, i_6_, i_7_, i_10_, i_11_);
		}
	}

	private final void method417(final byte[] is, final int[] is_16_,
			final int i, int i_17_, int i_18_, final int i_19_,
			final int i_20_, final int i_21_, final int i_22_) {
		for (int i_23_ = -i_20_; i_23_ < 0; i_23_++) {
			for (int i_24_ = -i_19_; i_24_ < 0; i_24_++) {
				int i_25_ = is[i_17_++] & 0xff;
				if (i_25_ != 0) {
					final int i_26_ = ((((i & 0xff00ff) * i_25_ & ~0xff00ff) + ((i & 0xff00)
							* i_25_ & 0xff0000)) >> 8);
					i_25_ = 256 - i_25_;
					final int i_27_ = is_16_[i_18_];
					is_16_[i_18_++] = ((((i_27_ & 0xff00ff) * i_25_ & ~0xff00ff) + ((i_27_ & 0xff00)
							* i_25_ & 0xff0000)) >> 8)
							+ i_26_;
				} else {
					i_18_++;
				}
			}
			i_18_ += i_21_;
			i_17_ += i_22_;
		}
	}

	private final void method418(final byte[] is, final int[] is_28_,
			final int i, int i_29_, int i_30_, final int i_31_,
			final int i_32_, final int i_33_, final int i_34_, final int i_35_,
			final int i_36_, final int i_37_, final aa var_aa, final int i_38_,
			final int i_39_) {
		final aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		final int[] is_40_ = var_aa_Sub1.anIntArray3555;
		final int[] is_41_ = var_aa_Sub1.anIntArray3557;
		final int i_42_ = i_35_ - aHa_Sub2_3614.anInt4509;
		int i_43_ = i_36_;
		if (i_39_ > i_43_) {
			i_43_ = i_39_;
			i_30_ += (i_39_ - i_36_) * aHa_Sub2_3614.anInt4505;
			i_29_ += (i_39_ - i_36_) * i_37_;
		}
		final int i_44_ = (i_39_ + is_40_.length < i_36_ + i_32_ ? i_39_
				+ is_40_.length : i_36_ + i_32_);
		for (int i_45_ = i_43_; i_45_ < i_44_; i_45_++) {
			final int i_46_ = is_40_[i_45_ - i_39_] + i_38_;
			int i_47_ = is_41_[i_45_ - i_39_];
			int i_48_ = i_31_;
			if (i_42_ > i_46_) {
				final int i_49_ = i_42_ - i_46_;
				if (i_49_ >= i_47_) {
					i_29_ += i_31_ + i_34_;
					i_30_ += i_31_ + i_33_;
					continue;
				}
				i_47_ -= i_49_;
			} else {
				final int i_50_ = i_46_ - i_42_;
				if (i_50_ >= i_31_) {
					i_29_ += i_31_ + i_34_;
					i_30_ += i_31_ + i_33_;
					continue;
				}
				i_29_ += i_50_;
				i_48_ -= i_50_;
				i_30_ += i_50_;
			}
			int i_51_ = 0;
			if (i_48_ < i_47_) {
				i_47_ = i_48_;
			} else {
				i_51_ = i_48_ - i_47_;
			}
			for (int i_52_ = -i_47_; i_52_ < 0; i_52_++) {
				int i_53_ = is[i_29_++] & 0xff;
				if (i_53_ != 0) {
					final int i_54_ = ((((i & 0xff00ff) * i_53_ & ~0xff00ff) + ((i & 0xff00)
							* i_53_ & 0xff0000)) >> 8);
					i_53_ = 256 - i_53_;
					final int i_55_ = is_28_[i_30_];
					is_28_[i_30_++] = ((((i_55_ & 0xff00ff) * i_53_ & ~0xff00ff) + ((i_55_ & 0xff00)
							* i_53_ & 0xff0000)) >> 8)
							+ i_54_;
				} else {
					i_30_++;
				}
			}
			i_29_ += i_51_ + i_34_;
			i_30_ += i_51_ + i_33_;
		}
	}

	@Override
	final void method409(final char c, int i, int i_56_, final int i_57_,
			final boolean bool, final aa var_aa, final int i_58_,
			final int i_59_) {
		if (var_aa == null) {
			fa(c, i, i_56_, i_57_, bool);
		} else {
			i += anIntArray3611[c];
			i_56_ += anIntArray3613[c];
			int i_60_ = anIntArray3610[c];
			int i_61_ = anIntArray3609[c];
			final int i_62_ = aHa_Sub2_3614.anInt4505;
			int i_63_ = i + i_56_ * i_62_;
			int i_64_ = i_62_ - i_60_;
			int i_65_ = 0;
			int i_66_ = 0;
			if (i_56_ < aHa_Sub2_3614.anInt4495) {
				final int i_67_ = aHa_Sub2_3614.anInt4495 - i_56_;
				i_61_ -= i_67_;
				i_56_ = aHa_Sub2_3614.anInt4495;
				i_66_ += i_67_ * i_60_;
				i_63_ += i_67_ * i_62_;
			}
			if (i_56_ + i_61_ > aHa_Sub2_3614.anInt4492) {
				i_61_ -= i_56_ + i_61_ - aHa_Sub2_3614.anInt4492;
			}
			if (i < aHa_Sub2_3614.anInt4509) {
				final int i_68_ = aHa_Sub2_3614.anInt4509 - i;
				i_60_ -= i_68_;
				i = aHa_Sub2_3614.anInt4509;
				i_66_ += i_68_;
				i_63_ += i_68_;
				i_65_ += i_68_;
				i_64_ += i_68_;
			}
			if (i + i_60_ > aHa_Sub2_3614.anInt4507) {
				final int i_69_ = i + i_60_ - aHa_Sub2_3614.anInt4507;
				i_60_ -= i_69_;
				i_65_ += i_69_;
				i_64_ += i_69_;
			}
			if (i_60_ > 0 && i_61_ > 0) {
				method418(aByteArrayArray3612[c], aHa_Sub2_3614.anIntArray4504,
						i_57_, i_66_, i_63_, i_60_, i_61_, i_64_, i_65_, i,
						i_56_, anIntArray3610[c], var_aa, i_58_, i_59_);
			}
		}
	}
}
