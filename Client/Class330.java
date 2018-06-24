/* Class330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class330 {
	private static Class331 aClass331_2774 = new Class331();

	public static void method3714() {
		aClass331_2774 = null;
	}

	private static final void method3715(final int[] is, final int[] is_0_,
			final int[] is_1_, final byte[] is_2_, final int i, final int i_3_,
			final int i_4_) {
		int i_5_ = 0;
		for (int i_6_ = i; i_6_ <= i_3_; i_6_++) {
			for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
				if (is_2_[i_7_] == i_6_) {
					is_1_[i_5_] = i_7_;
					i_5_++;
				}
			}
		}
		for (int i_8_ = 0; i_8_ < 23; i_8_++) {
			is_0_[i_8_] = 0;
		}
		for (int i_9_ = 0; i_9_ < i_4_; i_9_++) {
			is_0_[is_2_[i_9_] + 1]++;
		}
		for (int i_10_ = 1; i_10_ < 23; i_10_++) {
			is_0_[i_10_] += is_0_[i_10_ - 1];
		}
		for (int i_11_ = 0; i_11_ < 23; i_11_++) {
			is[i_11_] = 0;
		}
		int i_12_ = 0;
		for (int i_13_ = i; i_13_ <= i_3_; i_13_++) {
			i_12_ += is_0_[i_13_ + 1] - is_0_[i_13_];
			is[i_13_] = i_12_ - 1;
			i_12_ <<= 1;
		}
		for (int i_14_ = i + 1; i_14_ <= i_3_; i_14_++) {
			is_0_[i_14_] = (is[i_14_ - 1] + 1 << 1) - is_0_[i_14_];
		}
	}

	static final int method3716(final byte[] is, int i, final byte[] is_15_,
			final int i_16_, final int i_17_) {
		synchronized (aClass331_2774) {
			aClass331_2774.aByteArray2799 = is_15_;
			aClass331_2774.anInt2801 = i_17_;
			aClass331_2774.aByteArray2775 = is;
			aClass331_2774.anInt2808 = 0;
			aClass331_2774.anInt2785 = i;
			aClass331_2774.anInt2779 = 0;
			aClass331_2774.anInt2777 = 0;
			aClass331_2774.anInt2798 = 0;
			aClass331_2774.anInt2789 = 0;
			method3717(aClass331_2774);
			i -= aClass331_2774.anInt2785;
			aClass331_2774.aByteArray2799 = null;
			aClass331_2774.aByteArray2775 = null;
			return i;
		}
	}

	private static final void method3717(final Class331 class331) {
		int i = 0;
		int[] is = null;
		int[] is_35_ = null;
		int[] is_36_ = null;
		class331.anInt2778 = 1;
		if (Class329.anIntArray2771 == null) {
			Class329.anIntArray2771 = new int[class331.anInt2778 * 100000];
		}
		boolean bool_37_ = true;
		while (bool_37_) {
			byte i_38_ = method3718(class331);
			if (i_38_ == 23) {
				break;
			}
			i_38_ = method3718(class331);
			i_38_ = method3718(class331);
			i_38_ = method3718(class331);
			i_38_ = method3718(class331);
			i_38_ = method3718(class331);
			i_38_ = method3718(class331);
			i_38_ = method3718(class331);
			i_38_ = method3718(class331);
			i_38_ = method3718(class331);
			i_38_ = method3721(class331);
			class331.anInt2809 = 0;
			int i_39_ = method3718(class331);
			class331.anInt2809 = class331.anInt2809 << 8 | i_39_ & 0xff;
			i_39_ = method3718(class331);
			class331.anInt2809 = class331.anInt2809 << 8 | i_39_ & 0xff;
			i_39_ = method3718(class331);
			class331.anInt2809 = class331.anInt2809 << 8 | i_39_ & 0xff;
			for (int i_40_ = 0; i_40_ < 16; i_40_++) {
				i_38_ = method3721(class331);
				if (i_38_ == 1) {
					class331.aBooleanArray2780[i_40_] = true;
				} else {
					class331.aBooleanArray2780[i_40_] = false;
				}
			}
			for (int i_41_ = 0; i_41_ < 256; i_41_++) {
				class331.aBooleanArray2782[i_41_] = false;
			}
			for (int i_42_ = 0; i_42_ < 16; i_42_++) {
				if (class331.aBooleanArray2780[i_42_]) {
					for (int i_43_ = 0; i_43_ < 16; i_43_++) {
						i_38_ = method3721(class331);
						if (i_38_ == 1) {
							class331.aBooleanArray2782[(i_42_ * 16 + i_43_)] = true;
						}
					}
				}
			}
			method3722(class331);
			final int i_44_ = class331.anInt2805 + 2;
			final int i_45_ = method3720(3, class331);
			final int i_46_ = method3720(15, class331);
			for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
				int i_48_ = 0;
				for (;;) {
					i_38_ = method3721(class331);
					if (i_38_ == 0) {
						break;
					}
					i_48_++;
				}
				class331.aByteArray2783[i_47_] = (byte) i_48_;
			}
			final byte[] is_49_ = new byte[6];
			for (byte i_50_ = 0; i_50_ < i_45_; i_50_++) {
				is_49_[i_50_] = i_50_;
			}
			for (int i_51_ = 0; i_51_ < i_46_; i_51_++) {
				byte i_52_ = class331.aByteArray2783[i_51_];
				final byte i_53_ = is_49_[i_52_];
				for (/**/; i_52_ > 0; i_52_--) {
					is_49_[i_52_] = is_49_[i_52_ - 1];
				}
				is_49_[0] = i_53_;
				class331.aByteArray2776[i_51_] = i_53_;
			}
			for (int i_54_ = 0; i_54_ < i_45_; i_54_++) {
				int i_55_ = method3720(5, class331);
				for (int i_56_ = 0; i_56_ < i_44_; i_56_++) {
					for (;;) {
						i_38_ = method3721(class331);
						if (i_38_ == 0) {
							break;
						}
						i_38_ = method3721(class331);
						if (i_38_ == 0) {
							i_55_++;
						} else {
							i_55_--;
						}
					}
					class331.aByteArrayArray2804[i_54_][i_56_] = (byte) i_55_;
				}
			}
			for (int i_57_ = 0; i_57_ < i_45_; i_57_++) {
				int i_58_ = 32;
				byte i_59_ = 0;
				for (int i_60_ = 0; i_60_ < i_44_; i_60_++) {
					if (class331.aByteArrayArray2804[i_57_][i_60_] > i_59_) {
						i_59_ = (class331.aByteArrayArray2804[i_57_][i_60_]);
					}
					if (class331.aByteArrayArray2804[i_57_][i_60_] < i_58_) {
						i_58_ = (class331.aByteArrayArray2804[i_57_][i_60_]);
					}
				}
				method3715(class331.anIntArrayArray2806[i_57_],
						class331.anIntArrayArray2784[i_57_],
						class331.anIntArrayArray2790[i_57_],
						class331.aByteArrayArray2804[i_57_], i_58_, i_59_,
						i_44_);
				class331.anIntArray2791[i_57_] = i_58_;
			}
			final int i_61_ = class331.anInt2805 + 1;
			int i_62_ = -1;
			int i_63_ = 0;
			for (int i_64_ = 0; i_64_ <= 255; i_64_++) {
				class331.anIntArray2794[i_64_] = 0;
			}
			int i_65_ = 4095;
			for (int i_66_ = 15; i_66_ >= 0; i_66_--) {
				for (int i_67_ = 15; i_67_ >= 0; i_67_--) {
					class331.aByteArray2796[i_65_] = (byte) (i_66_ * 16 + i_67_);
					i_65_--;
				}
				class331.anIntArray2781[i_66_] = i_65_ + 1;
			}
			int i_68_ = 0;
			if (i_63_ == 0) {
				i_62_++;
				i_63_ = 50;
				final byte i_69_ = class331.aByteArray2776[i_62_];
				i = class331.anIntArray2791[i_69_];
				is = class331.anIntArrayArray2806[i_69_];
				is_36_ = class331.anIntArrayArray2790[i_69_];
				is_35_ = class331.anIntArrayArray2784[i_69_];
			}
			i_63_--;
			int i_70_ = i;
			int i_71_;
			int i_72_;
			for (i_72_ = method3720(i_70_, class331); i_72_ > is[i_70_]; i_72_ = i_72_ << 1
					| i_71_) {
				i_70_++;
				i_71_ = method3721(class331);
			}
			int i_73_ = is_36_[i_72_ - is_35_[i_70_]];
			while (i_73_ != i_61_) {
				if (i_73_ == 0 || i_73_ == 1) {
					int i_74_ = -1;
					int i_75_ = 1;
					do {
						if (i_73_ == 0) {
							i_74_ += i_75_;
						} else if (i_73_ == 1) {
							i_74_ += 2 * i_75_;
						}
						i_75_ *= 2;
						if (i_63_ == 0) {
							i_62_++;
							i_63_ = 50;
							final byte i_76_ = class331.aByteArray2776[i_62_];
							i = class331.anIntArray2791[i_76_];
							is = (class331.anIntArrayArray2806[i_76_]);
							is_36_ = (class331.anIntArrayArray2790[i_76_]);
							is_35_ = (class331.anIntArrayArray2784[i_76_]);
						}
						i_63_--;
						i_70_ = i;
						for (i_72_ = method3720(i_70_, class331); i_72_ > is[i_70_]; i_72_ = i_72_ << 1
								| i_71_) {
							i_70_++;
							i_71_ = method3721(class331);
						}
						i_73_ = is_36_[i_72_ - is_35_[i_70_]];
					} while (i_73_ == 0 || i_73_ == 1);
					i_74_++;
					i_39_ = (class331.aByteArray2795[((class331.aByteArray2796[class331.anIntArray2781[0]]) & 0xff)]);
					class331.anIntArray2794[i_39_ & 0xff] += i_74_;
					for (/**/; i_74_ > 0; i_74_--) {
						Class329.anIntArray2771[i_68_] = i_39_ & 0xff;
						i_68_++;
					}
				} else {
					int i_77_ = i_73_ - 1;
					if (i_77_ < 16) {
						final int i_78_ = class331.anIntArray2781[0];
						i_38_ = (class331.aByteArray2796[i_78_ + i_77_]);
						for (/**/; i_77_ > 3; i_77_ -= 4) {
							final int i_79_ = i_78_ + i_77_;
							class331.aByteArray2796[i_79_] = (class331.aByteArray2796[i_79_ - 1]);
							class331.aByteArray2796[i_79_ - 1] = (class331.aByteArray2796[i_79_ - 2]);
							class331.aByteArray2796[i_79_ - 2] = (class331.aByteArray2796[i_79_ - 3]);
							class331.aByteArray2796[i_79_ - 3] = (class331.aByteArray2796[i_79_ - 4]);
						}
						for (/**/; i_77_ > 0; i_77_--) {
							class331.aByteArray2796[i_78_ + i_77_] = (class331.aByteArray2796[i_78_
									+ i_77_ - 1]);
						}
						class331.aByteArray2796[i_78_] = i_38_;
					} else {
						int i_80_ = i_77_ / 16;
						final int i_81_ = i_77_ % 16;
						int i_82_ = (class331.anIntArray2781[i_80_] + i_81_);
						i_38_ = class331.aByteArray2796[i_82_];
						for (/**/; (i_82_ > class331.anIntArray2781[i_80_]); i_82_--) {
							class331.aByteArray2796[i_82_] = (class331.aByteArray2796[i_82_ - 1]);
						}
						class331.anIntArray2781[i_80_]++;
						for (/**/; i_80_ > 0; i_80_--) {
							class331.anIntArray2781[i_80_]--;
							class331.aByteArray2796[class331.anIntArray2781[i_80_]] = (class331.aByteArray2796[(class331.anIntArray2781[i_80_ - 1]) + 16 - 1]);
						}
						class331.anIntArray2781[0]--;
						class331.aByteArray2796[class331.anIntArray2781[0]] = i_38_;
						if (class331.anIntArray2781[0] == 0) {
							int i_83_ = 4095;
							for (int i_84_ = 15; i_84_ >= 0; i_84_--) {
								for (int i_85_ = 15; i_85_ >= 0; i_85_--) {
									class331.aByteArray2796[i_83_] = (class331.aByteArray2796[(class331.anIntArray2781[i_84_])
											+ i_85_]);
									i_83_--;
								}
								class331.anIntArray2781[i_84_] = i_83_ + 1;
							}
						}
					}
					class331.anIntArray2794[(class331.aByteArray2795[i_38_ & 0xff] & 0xff)]++;
					Class329.anIntArray2771[i_68_] = (class331.aByteArray2795[i_38_ & 0xff] & 0xff);
					i_68_++;
					if (i_63_ == 0) {
						i_62_++;
						i_63_ = 50;
						final byte i_86_ = class331.aByteArray2776[i_62_];
						i = class331.anIntArray2791[i_86_];
						is = class331.anIntArrayArray2806[i_86_];
						is_36_ = class331.anIntArrayArray2790[i_86_];
						is_35_ = class331.anIntArrayArray2784[i_86_];
					}
					i_63_--;
					i_70_ = i;
					for (i_72_ = method3720(i_70_, class331); i_72_ > is[i_70_]; i_72_ = i_72_ << 1
							| i_71_) {
						i_70_++;
						i_71_ = method3721(class331);
					}
					i_73_ = is_36_[i_72_ - is_35_[i_70_]];
				}
			}
			class331.anInt2788 = 0;
			class331.aByte2787 = (byte) 0;
			class331.anIntArray2807[0] = 0;
			for (int i_87_ = 1; i_87_ <= 256; i_87_++) {
				class331.anIntArray2807[i_87_] = class331.anIntArray2794[i_87_ - 1];
			}
			for (int i_88_ = 1; i_88_ <= 256; i_88_++) {
				class331.anIntArray2807[i_88_] += class331.anIntArray2807[i_88_ - 1];
			}
			for (int i_89_ = 0; i_89_ < i_68_; i_89_++) {
				i_39_ = (byte) (Class329.anIntArray2771[i_89_] & 0xff);
				Class329.anIntArray2771[(class331.anIntArray2807[i_39_ & 0xff])] |= i_89_ << 8;
				class331.anIntArray2807[i_39_ & 0xff]++;
			}
			class331.anInt2802 = (Class329.anIntArray2771[class331.anInt2809] >> 8);
			class331.anInt2793 = 0;
			class331.anInt2802 = Class329.anIntArray2771[class331.anInt2802];
			class331.anInt2786 = (byte) (class331.anInt2802 & 0xff);
			class331.anInt2802 >>= 8;
			class331.anInt2793++;
			class331.anInt2797 = i_68_;
			method3719(class331);
			if ((class331.anInt2793 == class331.anInt2797 + 1)
					&& class331.anInt2788 == 0) {
				bool_37_ = true;
			} else {
				bool_37_ = false;
			}
		}
	}

	private static final byte method3718(final Class331 class331) {
		return (byte) method3720(8, class331);
	}

	private static final void method3719(final Class331 class331) {
		byte i = class331.aByte2787;
		int i_90_ = class331.anInt2788;
		int i_91_ = class331.anInt2793;
		int i_92_ = class331.anInt2786;
		final int[] is = Class329.anIntArray2771;
		int i_93_ = class331.anInt2802;
		final byte[] is_94_ = class331.aByteArray2775;
		int i_95_ = class331.anInt2808;
		int i_96_ = class331.anInt2785;
		final int i_97_ = i_96_;
		final int i_98_ = class331.anInt2797 + 1;
		while_224_: for (;;) {
			if (i_90_ > 0) {
				for (;;) {
					if (i_96_ == 0) {
						break while_224_;
					}
					if (i_90_ == 1) {
						break;
					}
					is_94_[i_95_] = i;
					i_90_--;
					i_95_++;
					i_96_--;
				}
				if (i_96_ == 0) {
					i_90_ = 1;
					break;
				}
				is_94_[i_95_] = i;
				i_95_++;
				i_96_--;
			}
			for (;;) {
				if (i_91_ == i_98_) {
					i_90_ = 0;
					break while_224_;
				}
				i = (byte) i_92_;
				i_93_ = is[i_93_];
				final int i_99_ = (byte) i_93_;
				i_93_ >>= 8;
				i_91_++;
				if (i_99_ != i_92_) {
					i_92_ = i_99_;
					if (i_96_ == 0) {
						i_90_ = 1;
						break while_224_;
					}
					is_94_[i_95_] = i;
					i_95_++;
					i_96_--;
				} else {
					if (i_91_ != i_98_) {
						break;
					}
					if (i_96_ == 0) {
						i_90_ = 1;
						break while_224_;
					}
					is_94_[i_95_] = i;
					i_95_++;
					i_96_--;
				}
			}
			i_90_ = 2;
			i_93_ = is[i_93_];
			int i_100_ = (byte) i_93_;
			i_93_ >>= 8;
			if (++i_91_ != i_98_) {
				if (i_100_ != i_92_) {
					i_92_ = i_100_;
				} else {
					i_90_ = 3;
					i_93_ = is[i_93_];
					i_100_ = (byte) i_93_;
					i_93_ >>= 8;
					if (++i_91_ != i_98_) {
						if (i_100_ != i_92_) {
							i_92_ = i_100_;
						} else {
							i_93_ = is[i_93_];
							i_100_ = (byte) i_93_;
							i_93_ >>= 8;
							i_91_++;
							i_90_ = (i_100_ & 0xff) + 4;
							i_93_ = is[i_93_];
							i_92_ = (byte) i_93_;
							i_93_ >>= 8;
							i_91_++;
						}
					}
				}
			}
		}
		class331.anInt2789 += i_97_ - i_96_;
		class331.aByte2787 = i;
		class331.anInt2788 = i_90_;
		class331.anInt2793 = i_91_;
		class331.anInt2786 = i_92_;
		Class329.anIntArray2771 = is;
		class331.anInt2802 = i_93_;
		class331.aByteArray2775 = is_94_;
		class331.anInt2808 = i_95_;
		class331.anInt2785 = i_96_;
	}

	private static final int method3720(final int i, final Class331 class331) {
		for (;;) {
			if (class331.anInt2779 >= i) {
				final int i_102_ = ((class331.anInt2777 >> class331.anInt2779
						- i) & (1 << i) - 1);
				class331.anInt2779 -= i;
				return i_102_;
			}
			class331.anInt2777 = (class331.anInt2777 << 8 | (class331.aByteArray2799[class331.anInt2801]) & 0xff);
			class331.anInt2779 += 8;
			class331.anInt2801++;
			class331.anInt2798++;
		}
	}

	private static final byte method3721(final Class331 class331) {
		return (byte) method3720(1, class331);
	}

	private static final void method3722(final Class331 class331) {
		class331.anInt2805 = 0;
		for (int i = 0; i < 256; i++) {
			if (class331.aBooleanArray2782[i]) {
				class331.aByteArray2795[(class331.anInt2805)] = (byte) i;
				class331.anInt2805++;
			}
		}
	}
}
