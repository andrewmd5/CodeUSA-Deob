/* Class332_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class332_Sub3_Sub1 extends Class332_Sub3 {
	int[] anIntArray6212;

	@Override
	final void method3729(int i, int i_0_, final aa var_aa, final int i_1_,
			final int i_2_) {
		if (((Class332_Sub3) this).aHa_Sub2_5434.method1920()) {
			throw new IllegalStateException();
		}
		i += ((Class332_Sub3) this).anInt5446;
		i_0_ += ((Class332_Sub3) this).anInt5439;
		int i_3_ = 0;
		final int i_4_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4505;
		int i_5_ = ((Class332_Sub3) this).anInt5433;
		int i_6_ = ((Class332_Sub3) this).anInt5454;
		int i_7_ = i_4_ - i_5_;
		int i_8_ = 0;
		int i_9_ = i + i_0_ * i_4_;
		if (i_0_ < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) {
			final int i_10_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4495 - i_0_);
			i_6_ -= i_10_;
			i_0_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495;
			i_3_ += i_10_ * i_5_;
			i_9_ += i_10_ * i_4_;
		}
		if (i_0_ + i_6_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4492) {
			i_6_ -= i_0_ + i_6_
					- (((Class332_Sub3) this).aHa_Sub2_5434).anInt4492;
		}
		if (i < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) {
			final int i_11_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4509 - i);
			i_5_ -= i_11_;
			i = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509;
			i_3_ += i_11_;
			i_9_ += i_11_;
			i_8_ += i_11_;
			i_7_ += i_11_;
		}
		if (i + i_5_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4507) {
			final int i_12_ = i + i_5_
					- (((Class332_Sub3) this).aHa_Sub2_5434.anInt4507);
			i_5_ -= i_12_;
			i_8_ += i_12_;
			i_7_ += i_12_;
		}
		if (i_5_ > 0 && i_6_ > 0) {
			final aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
			final int[] is = var_aa_Sub1.anIntArray3555;
			final int[] is_13_ = var_aa_Sub1.anIntArray3557;
			final int[] is_14_ = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			int i_15_ = i_0_;
			if (i_2_ > i_15_) {
				i_15_ = i_2_;
				i_9_ += (i_2_ - i_0_) * i_4_;
				i_3_ += (i_2_ - i_0_) * ((Class332_Sub3) this).anInt5433;
			}
			final int i_16_ = (i_2_ + is.length < i_0_ + i_6_ ? i_2_
					+ is.length : i_0_ + i_6_);
			for (int i_17_ = i_15_; i_17_ < i_16_; i_17_++) {
				final int i_18_ = is[i_17_ - i_2_] + i_1_;
				int i_19_ = is_13_[i_17_ - i_2_];
				int i_20_ = i_5_;
				if (i > i_18_) {
					final int i_21_ = i - i_18_;
					if (i_21_ >= i_19_) {
						i_3_ += i_5_ + i_8_;
						i_9_ += i_5_ + i_7_;
						continue;
					}
					i_19_ -= i_21_;
				} else {
					final int i_22_ = i_18_ - i;
					if (i_22_ >= i_5_) {
						i_3_ += i_5_ + i_8_;
						i_9_ += i_5_ + i_7_;
						continue;
					}
					i_3_ += i_22_;
					i_20_ -= i_22_;
					i_9_ += i_22_;
				}
				int i_23_ = 0;
				if (i_20_ < i_19_) {
					i_19_ = i_20_;
				} else {
					i_23_ = i_20_ - i_19_;
				}
				for (int i_24_ = -i_19_; i_24_ < 0; i_24_++) {
					final int i_25_ = anIntArray6212[i_3_++];
					final int i_26_ = i_25_ >>> 24;
					final int i_27_ = 256 - i_26_;
					final int i_28_ = is_14_[i_9_];
					is_14_[i_9_++] = ((((i_25_ & 0xff00ff) * i_26_ + (i_28_ & 0xff00ff)
							* i_27_) & ~0xff00ff) + (((i_25_ & 0xff00) * i_26_ + (i_28_ & 0xff00)
							* i_27_) & 0xff0000)) >> 8;
				}
				i_3_ += i_23_ + i_8_;
				i_9_ += i_23_ + i_7_;
			}
		}
	}

	@Override
	final void method3759(final int i, final int i_29_) {
		final int[] is = ((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504;
		if (Class332_Sub3.anInt5444 == 0) {
			if (Class332_Sub3.anInt5436 == 0) {
				int i_30_ = Class332_Sub3.anInt5431;
				while (i_30_ < 0) {
					int i_31_ = Class332_Sub3.anInt5451;
					final int i_32_ = Class332_Sub3.anInt5450;
					final int i_33_ = Class332_Sub3.anInt5443;
					int i_34_ = Class332_Sub3.anInt5448;
					if (i_32_ >= 0
							&& i_33_ >= 0
							&& i_32_ - (((Class332_Sub3) this).anInt5433 << 12) < 0
							&& (i_33_
									- (((Class332_Sub3) this).anInt5454 << 12) < 0)) {
						for (/**/; i_34_ < 0; i_34_++) {
							int i_35_ = (((i_33_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_32_ >> 12));
							final int i_36_ = i_31_++;
							final int[] is_37_ = is;
							final int i_38_ = i;
							final int i_39_ = i_29_;
							if (i_39_ == 0) {
								if (i_38_ == 1) {
									is_37_[i_36_] = (anIntArray6212[i_35_]);
								} else if (i_38_ == 0) {
									final int i_40_ = (anIntArray6212[i_35_++]);
									final int i_41_ = (((i_40_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_42_ = (((i_40_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_43_ = (((i_40_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_37_[i_36_] = (i_41_ | i_42_ | i_43_) >>> 8;
								} else if (i_38_ == 3) {
									final int i_44_ = (anIntArray6212[i_35_++]);
									final int i_45_ = Class332_Sub3.anInt5432;
									final int i_46_ = i_44_ + i_45_;
									final int i_47_ = ((i_44_ & 0xff00ff) + (i_45_ & 0xff00ff));
									final int i_48_ = ((i_47_ & 0x1000100) + (i_46_
											- i_47_ & 0x10000));
									is_37_[i_36_] = i_46_ - i_48_ | i_48_
											- (i_48_ >>> 8);
								} else if (i_38_ == 2) {
									final int i_49_ = (anIntArray6212[i_35_]);
									final int i_50_ = (((i_49_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_51_ = (((i_49_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_37_[i_36_] = (((i_50_ | i_51_) >>> 8) + Class332_Sub3.anInt5440);
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_39_ == 1) {
								if (i_38_ == 1) {
									final int i_52_ = (anIntArray6212[i_35_]);
									final int i_53_ = i_52_ >>> 24;
									final int i_54_ = 256 - i_53_;
									final int i_55_ = is_37_[i_36_];
									is_37_[i_36_] = ((((i_52_ & 0xff00ff)
											* i_53_ + (i_55_ & 0xff00ff)
											* i_54_) & ~0xff00ff) + (((i_52_ & 0xff00)
											* i_53_ + (i_55_ & 0xff00) * i_54_) & 0xff0000)) >> 8;
								} else if (i_38_ == 0) {
									int i_56_ = (anIntArray6212[i_35_]);
									final int i_57_ = (((i_56_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
									final int i_58_ = 256 - i_57_;
									if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
										final int i_59_ = is_37_[i_36_];
										is_37_[i_36_] = ((((i_56_ & 0xff00ff)
												* i_57_ + (i_59_ & 0xff00ff)
												* i_58_) & ~0xff00ff) + (((i_56_ & 0xff00)
												* i_57_ + (i_59_ & 0xff00)
												* i_58_) & 0xff0000)) >> 8;
									} else if (i_57_ != 255) {
										final int i_60_ = (((i_56_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_61_ = (((i_56_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_62_ = (((i_56_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_56_ = (i_60_ | i_61_ | i_62_) >>> 8;
										final int i_63_ = is_37_[i_36_];
										is_37_[i_36_] = ((((i_56_ & 0xff00ff)
												* i_57_ + (i_63_ & 0xff00ff)
												* i_58_) & ~0xff00ff) + (((i_56_ & 0xff00)
												* i_57_ + (i_63_ & 0xff00)
												* i_58_) & 0xff0000)) >> 8;
									} else {
										final int i_64_ = (((i_56_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_65_ = (((i_56_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_66_ = (((i_56_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										is_37_[i_36_] = (i_64_ | i_65_ | i_66_) >>> 8;
									}
								} else if (i_38_ == 3) {
									int i_67_ = (anIntArray6212[i_35_]);
									final int i_68_ = Class332_Sub3.anInt5432;
									final int i_69_ = i_67_ + i_68_;
									final int i_70_ = ((i_67_ & 0xff00ff) + (i_68_ & 0xff00ff));
									int i_71_ = ((i_70_ & 0x1000100) + (i_69_
											- i_70_ & 0x10000));
									i_71_ = i_69_ - i_71_ | i_71_
											- (i_71_ >>> 8);
									final int i_72_ = (((i_67_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
									final int i_73_ = 256 - i_72_;
									if (i_72_ != 255) {
										i_67_ = i_71_;
										i_71_ = is_37_[i_36_];
										i_71_ = ((((i_67_ & 0xff00ff) * i_72_ + (i_71_ & 0xff00ff)
												* i_73_) & ~0xff00ff) + (((i_67_ & 0xff00)
												* i_72_ + (i_71_ & 0xff00)
												* i_73_) & 0xff0000)) >> 8;
									}
									is_37_[i_36_] = i_71_;
								} else if (i_38_ == 2) {
									int i_74_ = (anIntArray6212[i_35_]);
									final int i_75_ = i_74_ >>> 24;
									final int i_76_ = 256 - i_75_;
									final int i_77_ = (((i_74_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_78_ = (((i_74_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_74_ = (((i_77_ | i_78_) >>> 8) + Class332_Sub3.anInt5440);
									final int i_79_ = is_37_[i_36_];
									is_37_[i_36_] = ((((i_74_ & 0xff00ff)
											* i_75_ + (i_79_ & 0xff00ff)
											* i_76_) & ~0xff00ff) + (((i_74_ & 0xff00)
											* i_75_ + (i_79_ & 0xff00) * i_76_) & 0xff0000)) >> 8;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_39_ == 2) {
								if (i_38_ == 1) {
									final int i_80_ = (anIntArray6212[i_35_]);
									int i_81_ = is_37_[i_36_];
									final int i_82_ = i_80_ + i_81_;
									final int i_83_ = ((i_80_ & 0xff00ff) + (i_81_ & 0xff00ff));
									i_81_ = (i_83_ & 0x1000100)
											+ (i_82_ - i_83_ & 0x10000);
									is_37_[i_36_] = i_82_ - i_81_ | i_81_
											- (i_81_ >>> 8);
								} else if (i_38_ == 0) {
									int i_84_ = (anIntArray6212[i_35_]);
									final int i_85_ = (((i_84_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_86_ = (((i_84_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_87_ = (((i_84_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_84_ = (i_85_ | i_86_ | i_87_) >>> 8;
									int i_88_ = is_37_[i_36_];
									final int i_89_ = i_84_ + i_88_;
									final int i_90_ = ((i_84_ & 0xff00ff) + (i_88_ & 0xff00ff));
									i_88_ = (i_90_ & 0x1000100)
											+ (i_89_ - i_90_ & 0x10000);
									is_37_[i_36_] = i_89_ - i_88_ | i_88_
											- (i_88_ >>> 8);
								} else if (i_38_ == 3) {
									int i_91_ = (anIntArray6212[i_35_]);
									final int i_92_ = Class332_Sub3.anInt5432;
									int i_93_ = i_91_ + i_92_;
									int i_94_ = ((i_91_ & 0xff00ff) + (i_92_ & 0xff00ff));
									int i_95_ = ((i_94_ & 0x1000100) + (i_93_
											- i_94_ & 0x10000));
									i_91_ = i_93_ - i_95_ | i_95_
											- (i_95_ >>> 8);
									i_95_ = is_37_[i_36_];
									i_93_ = i_91_ + i_95_;
									i_94_ = (i_91_ & 0xff00ff)
											+ (i_95_ & 0xff00ff);
									i_95_ = (i_94_ & 0x1000100)
											+ (i_93_ - i_94_ & 0x10000);
									is_37_[i_36_] = i_93_ - i_95_ | i_95_
											- (i_95_ >>> 8);
								} else if (i_38_ == 2) {
									int i_96_ = (anIntArray6212[i_35_]);
									final int i_97_ = (((i_96_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_98_ = (((i_96_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_96_ = (((i_97_ | i_98_) >>> 8) + Class332_Sub3.anInt5440);
									int i_99_ = is_37_[i_36_];
									final int i_100_ = i_96_ + i_99_;
									final int i_101_ = ((i_96_ & 0xff00ff) + (i_99_ & 0xff00ff));
									i_99_ = ((i_101_ & 0x1000100) + (i_100_
											- i_101_ & 0x10000));
									is_37_[i_36_] = i_100_ - i_99_ | i_99_
											- (i_99_ >>> 8);
								}
							} else {
								throw new IllegalArgumentException();
							}
						}
					}
					i_30_++;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else if (Class332_Sub3.anInt5436 < 0) {
				int i_102_ = Class332_Sub3.anInt5431;
				while (i_102_ < 0) {
					int i_103_ = Class332_Sub3.anInt5451;
					final int i_104_ = Class332_Sub3.anInt5450;
					int i_105_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_106_ = Class332_Sub3.anInt5448;
					if (i_104_ >= 0
							&& (i_104_
									- (((Class332_Sub3) this).anInt5433 << 12) < 0)) {
						int i_107_;
						if ((i_107_ = i_105_
								- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
							i_107_ = ((Class332_Sub3.anInt5436 - i_107_) / Class332_Sub3.anInt5436);
							i_106_ += i_107_;
							i_105_ += Class332_Sub3.anInt5436 * i_107_;
							i_103_ += i_107_;
						}
						if ((i_107_ = ((i_105_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_106_) {
							i_106_ = i_107_;
						}
						for (/**/; i_106_ < 0; i_106_++) {
							int i_108_ = (((i_105_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_104_ >> 12));
							final int i_109_ = i_103_++;
							final int[] is_110_ = is;
							final int i_111_ = i;
							final int i_112_ = i_29_;
							if (i_112_ == 0) {
								if (i_111_ == 1) {
									is_110_[i_109_] = (anIntArray6212[i_108_]);
								} else if (i_111_ == 0) {
									final int i_113_ = (anIntArray6212[i_108_++]);
									final int i_114_ = (((i_113_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_115_ = (((i_113_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_116_ = (((i_113_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_110_[i_109_] = (i_114_ | i_115_ | i_116_) >>> 8;
								} else if (i_111_ == 3) {
									final int i_117_ = (anIntArray6212[i_108_++]);
									final int i_118_ = Class332_Sub3.anInt5432;
									final int i_119_ = i_117_ + i_118_;
									final int i_120_ = ((i_117_ & 0xff00ff) + (i_118_ & 0xff00ff));
									final int i_121_ = ((i_120_ & 0x1000100) + (i_119_
											- i_120_ & 0x10000));
									is_110_[i_109_] = i_119_ - i_121_ | i_121_
											- (i_121_ >>> 8);
								} else if (i_111_ == 2) {
									final int i_122_ = (anIntArray6212[i_108_]);
									final int i_123_ = (((i_122_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_124_ = (((i_122_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_110_[i_109_] = (((i_123_ | i_124_) >>> 8) + Class332_Sub3.anInt5440);
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_112_ == 1) {
								if (i_111_ == 1) {
									final int i_125_ = (anIntArray6212[i_108_]);
									final int i_126_ = i_125_ >>> 24;
									final int i_127_ = 256 - i_126_;
									final int i_128_ = is_110_[i_109_];
									is_110_[i_109_] = ((((i_125_ & 0xff00ff)
											* i_126_ + (i_128_ & 0xff00ff)
											* i_127_) & ~0xff00ff) + (((i_125_ & 0xff00)
											* i_126_ + (i_128_ & 0xff00)
											* i_127_) & 0xff0000)) >> 8;
								} else if (i_111_ == 0) {
									int i_129_ = (anIntArray6212[i_108_]);
									final int i_130_ = (((i_129_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
									final int i_131_ = 256 - i_130_;
									if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
										final int i_132_ = is_110_[i_109_];
										is_110_[i_109_] = ((((i_129_ & 0xff00ff)
												* i_130_ + ((i_132_ & 0xff00ff) * i_131_)) & ~0xff00ff) + (((i_129_ & 0xff00)
												* i_130_ + ((i_132_ & 0xff00) * i_131_)) & 0xff0000)) >> 8;
									} else if (i_130_ != 255) {
										final int i_133_ = (((i_129_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_134_ = (((i_129_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_135_ = (((i_129_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_129_ = (i_133_ | i_134_ | i_135_) >>> 8;
										final int i_136_ = is_110_[i_109_];
										is_110_[i_109_] = ((((i_129_ & 0xff00ff)
												* i_130_ + ((i_136_ & 0xff00ff) * i_131_)) & ~0xff00ff) + (((i_129_ & 0xff00)
												* i_130_ + ((i_136_ & 0xff00) * i_131_)) & 0xff0000)) >> 8;
									} else {
										final int i_137_ = (((i_129_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_138_ = (((i_129_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_139_ = (((i_129_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										is_110_[i_109_] = (i_137_ | i_138_ | i_139_) >>> 8;
									}
								} else if (i_111_ == 3) {
									int i_140_ = (anIntArray6212[i_108_]);
									final int i_141_ = Class332_Sub3.anInt5432;
									final int i_142_ = i_140_ + i_141_;
									final int i_143_ = ((i_140_ & 0xff00ff) + (i_141_ & 0xff00ff));
									int i_144_ = ((i_143_ & 0x1000100) + (i_142_
											- i_143_ & 0x10000));
									i_144_ = i_142_ - i_144_ | i_144_
											- (i_144_ >>> 8);
									final int i_145_ = (((i_140_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
									final int i_146_ = 256 - i_145_;
									if (i_145_ != 255) {
										i_140_ = i_144_;
										i_144_ = is_110_[i_109_];
										i_144_ = ((((i_140_ & 0xff00ff)
												* i_145_ + ((i_144_ & 0xff00ff) * i_146_)) & ~0xff00ff) + (((i_140_ & 0xff00)
												* i_145_ + ((i_144_ & 0xff00) * i_146_)) & 0xff0000)) >> 8;
									}
									is_110_[i_109_] = i_144_;
								} else if (i_111_ == 2) {
									int i_147_ = (anIntArray6212[i_108_]);
									final int i_148_ = i_147_ >>> 24;
									final int i_149_ = 256 - i_148_;
									final int i_150_ = (((i_147_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_151_ = (((i_147_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_147_ = (((i_150_ | i_151_) >>> 8) + Class332_Sub3.anInt5440);
									final int i_152_ = is_110_[i_109_];
									is_110_[i_109_] = ((((i_147_ & 0xff00ff)
											* i_148_ + (i_152_ & 0xff00ff)
											* i_149_) & ~0xff00ff) + (((i_147_ & 0xff00)
											* i_148_ + (i_152_ & 0xff00)
											* i_149_) & 0xff0000)) >> 8;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_112_ == 2) {
								if (i_111_ == 1) {
									final int i_153_ = (anIntArray6212[i_108_]);
									int i_154_ = is_110_[i_109_];
									final int i_155_ = i_153_ + i_154_;
									final int i_156_ = ((i_153_ & 0xff00ff) + (i_154_ & 0xff00ff));
									i_154_ = ((i_156_ & 0x1000100) + (i_155_
											- i_156_ & 0x10000));
									is_110_[i_109_] = i_155_ - i_154_ | i_154_
											- (i_154_ >>> 8);
								} else if (i_111_ == 0) {
									int i_157_ = (anIntArray6212[i_108_]);
									final int i_158_ = (((i_157_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_159_ = (((i_157_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_160_ = (((i_157_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_157_ = (i_158_ | i_159_ | i_160_) >>> 8;
									int i_161_ = is_110_[i_109_];
									final int i_162_ = i_157_ + i_161_;
									final int i_163_ = ((i_157_ & 0xff00ff) + (i_161_ & 0xff00ff));
									i_161_ = ((i_163_ & 0x1000100) + (i_162_
											- i_163_ & 0x10000));
									is_110_[i_109_] = i_162_ - i_161_ | i_161_
											- (i_161_ >>> 8);
								} else if (i_111_ == 3) {
									int i_164_ = (anIntArray6212[i_108_]);
									final int i_165_ = Class332_Sub3.anInt5432;
									int i_166_ = i_164_ + i_165_;
									int i_167_ = ((i_164_ & 0xff00ff) + (i_165_ & 0xff00ff));
									int i_168_ = ((i_167_ & 0x1000100) + (i_166_
											- i_167_ & 0x10000));
									i_164_ = i_166_ - i_168_ | i_168_
											- (i_168_ >>> 8);
									i_168_ = is_110_[i_109_];
									i_166_ = i_164_ + i_168_;
									i_167_ = (i_164_ & 0xff00ff)
											+ (i_168_ & 0xff00ff);
									i_168_ = ((i_167_ & 0x1000100) + (i_166_
											- i_167_ & 0x10000));
									is_110_[i_109_] = i_166_ - i_168_ | i_168_
											- (i_168_ >>> 8);
								} else if (i_111_ == 2) {
									int i_169_ = (anIntArray6212[i_108_]);
									final int i_170_ = (((i_169_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_171_ = (((i_169_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_169_ = (((i_170_ | i_171_) >>> 8) + Class332_Sub3.anInt5440);
									int i_172_ = is_110_[i_109_];
									final int i_173_ = i_169_ + i_172_;
									final int i_174_ = ((i_169_ & 0xff00ff) + (i_172_ & 0xff00ff));
									i_172_ = ((i_174_ & 0x1000100) + (i_173_
											- i_174_ & 0x10000));
									is_110_[i_109_] = i_173_ - i_172_ | i_172_
											- (i_172_ >>> 8);
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_105_ += Class332_Sub3.anInt5436;
						}
					}
					i_102_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else {
				int i_175_ = Class332_Sub3.anInt5431;
				while (i_175_ < 0) {
					int i_176_ = Class332_Sub3.anInt5451;
					final int i_177_ = Class332_Sub3.anInt5450;
					int i_178_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_179_ = Class332_Sub3.anInt5448;
					if (i_177_ >= 0
							&& (i_177_
									- (((Class332_Sub3) this).anInt5433 << 12) < 0)) {
						if (i_178_ < 0) {
							final int i_180_ = ((Class332_Sub3.anInt5436 - 1 - i_178_) / Class332_Sub3.anInt5436);
							i_179_ += i_180_;
							i_178_ += Class332_Sub3.anInt5436 * i_180_;
							i_176_ += i_180_;
						}
						int i_181_;
						if ((i_181_ = ((1 + i_178_
								- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_179_) {
							i_179_ = i_181_;
						}
						for (/**/; i_179_ < 0; i_179_++) {
							int i_182_ = (((i_178_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_177_ >> 12));
							final int i_183_ = i_176_++;
							final int[] is_184_ = is;
							final int i_185_ = i;
							final int i_186_ = i_29_;
							if (i_186_ == 0) {
								if (i_185_ == 1) {
									is_184_[i_183_] = (anIntArray6212[i_182_]);
								} else if (i_185_ == 0) {
									final int i_187_ = (anIntArray6212[i_182_++]);
									final int i_188_ = (((i_187_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_189_ = (((i_187_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_190_ = (((i_187_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_184_[i_183_] = (i_188_ | i_189_ | i_190_) >>> 8;
								} else if (i_185_ == 3) {
									final int i_191_ = (anIntArray6212[i_182_++]);
									final int i_192_ = Class332_Sub3.anInt5432;
									final int i_193_ = i_191_ + i_192_;
									final int i_194_ = ((i_191_ & 0xff00ff) + (i_192_ & 0xff00ff));
									final int i_195_ = ((i_194_ & 0x1000100) + (i_193_
											- i_194_ & 0x10000));
									is_184_[i_183_] = i_193_ - i_195_ | i_195_
											- (i_195_ >>> 8);
								} else if (i_185_ == 2) {
									final int i_196_ = (anIntArray6212[i_182_]);
									final int i_197_ = (((i_196_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_198_ = (((i_196_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_184_[i_183_] = (((i_197_ | i_198_) >>> 8) + Class332_Sub3.anInt5440);
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_186_ == 1) {
								if (i_185_ == 1) {
									final int i_199_ = (anIntArray6212[i_182_]);
									final int i_200_ = i_199_ >>> 24;
									final int i_201_ = 256 - i_200_;
									final int i_202_ = is_184_[i_183_];
									is_184_[i_183_] = ((((i_199_ & 0xff00ff)
											* i_200_ + (i_202_ & 0xff00ff)
											* i_201_) & ~0xff00ff) + (((i_199_ & 0xff00)
											* i_200_ + (i_202_ & 0xff00)
											* i_201_) & 0xff0000)) >> 8;
								} else if (i_185_ == 0) {
									int i_203_ = (anIntArray6212[i_182_]);
									final int i_204_ = (((i_203_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
									final int i_205_ = 256 - i_204_;
									if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
										final int i_206_ = is_184_[i_183_];
										is_184_[i_183_] = ((((i_203_ & 0xff00ff)
												* i_204_ + ((i_206_ & 0xff00ff) * i_205_)) & ~0xff00ff) + (((i_203_ & 0xff00)
												* i_204_ + ((i_206_ & 0xff00) * i_205_)) & 0xff0000)) >> 8;
									} else if (i_204_ != 255) {
										final int i_207_ = (((i_203_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_208_ = (((i_203_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_209_ = (((i_203_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_203_ = (i_207_ | i_208_ | i_209_) >>> 8;
										final int i_210_ = is_184_[i_183_];
										is_184_[i_183_] = ((((i_203_ & 0xff00ff)
												* i_204_ + ((i_210_ & 0xff00ff) * i_205_)) & ~0xff00ff) + (((i_203_ & 0xff00)
												* i_204_ + ((i_210_ & 0xff00) * i_205_)) & 0xff0000)) >> 8;
									} else {
										final int i_211_ = (((i_203_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_212_ = (((i_203_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_213_ = (((i_203_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										is_184_[i_183_] = (i_211_ | i_212_ | i_213_) >>> 8;
									}
								} else if (i_185_ == 3) {
									int i_214_ = (anIntArray6212[i_182_]);
									final int i_215_ = Class332_Sub3.anInt5432;
									final int i_216_ = i_214_ + i_215_;
									final int i_217_ = ((i_214_ & 0xff00ff) + (i_215_ & 0xff00ff));
									int i_218_ = ((i_217_ & 0x1000100) + (i_216_
											- i_217_ & 0x10000));
									i_218_ = i_216_ - i_218_ | i_218_
											- (i_218_ >>> 8);
									final int i_219_ = (((i_214_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
									final int i_220_ = 256 - i_219_;
									if (i_219_ != 255) {
										i_214_ = i_218_;
										i_218_ = is_184_[i_183_];
										i_218_ = ((((i_214_ & 0xff00ff)
												* i_219_ + ((i_218_ & 0xff00ff) * i_220_)) & ~0xff00ff) + (((i_214_ & 0xff00)
												* i_219_ + ((i_218_ & 0xff00) * i_220_)) & 0xff0000)) >> 8;
									}
									is_184_[i_183_] = i_218_;
								} else if (i_185_ == 2) {
									int i_221_ = (anIntArray6212[i_182_]);
									final int i_222_ = i_221_ >>> 24;
									final int i_223_ = 256 - i_222_;
									final int i_224_ = (((i_221_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_225_ = (((i_221_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_221_ = (((i_224_ | i_225_) >>> 8) + Class332_Sub3.anInt5440);
									final int i_226_ = is_184_[i_183_];
									is_184_[i_183_] = ((((i_221_ & 0xff00ff)
											* i_222_ + (i_226_ & 0xff00ff)
											* i_223_) & ~0xff00ff) + (((i_221_ & 0xff00)
											* i_222_ + (i_226_ & 0xff00)
											* i_223_) & 0xff0000)) >> 8;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_186_ == 2) {
								if (i_185_ == 1) {
									final int i_227_ = (anIntArray6212[i_182_]);
									int i_228_ = is_184_[i_183_];
									final int i_229_ = i_227_ + i_228_;
									final int i_230_ = ((i_227_ & 0xff00ff) + (i_228_ & 0xff00ff));
									i_228_ = ((i_230_ & 0x1000100) + (i_229_
											- i_230_ & 0x10000));
									is_184_[i_183_] = i_229_ - i_228_ | i_228_
											- (i_228_ >>> 8);
								} else if (i_185_ == 0) {
									int i_231_ = (anIntArray6212[i_182_]);
									final int i_232_ = (((i_231_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_233_ = (((i_231_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_234_ = (((i_231_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_231_ = (i_232_ | i_233_ | i_234_) >>> 8;
									int i_235_ = is_184_[i_183_];
									final int i_236_ = i_231_ + i_235_;
									final int i_237_ = ((i_231_ & 0xff00ff) + (i_235_ & 0xff00ff));
									i_235_ = ((i_237_ & 0x1000100) + (i_236_
											- i_237_ & 0x10000));
									is_184_[i_183_] = i_236_ - i_235_ | i_235_
											- (i_235_ >>> 8);
								} else if (i_185_ == 3) {
									int i_238_ = (anIntArray6212[i_182_]);
									final int i_239_ = Class332_Sub3.anInt5432;
									int i_240_ = i_238_ + i_239_;
									int i_241_ = ((i_238_ & 0xff00ff) + (i_239_ & 0xff00ff));
									int i_242_ = ((i_241_ & 0x1000100) + (i_240_
											- i_241_ & 0x10000));
									i_238_ = i_240_ - i_242_ | i_242_
											- (i_242_ >>> 8);
									i_242_ = is_184_[i_183_];
									i_240_ = i_238_ + i_242_;
									i_241_ = (i_238_ & 0xff00ff)
											+ (i_242_ & 0xff00ff);
									i_242_ = ((i_241_ & 0x1000100) + (i_240_
											- i_241_ & 0x10000));
									is_184_[i_183_] = i_240_ - i_242_ | i_242_
											- (i_242_ >>> 8);
								} else if (i_185_ == 2) {
									int i_243_ = (anIntArray6212[i_182_]);
									final int i_244_ = (((i_243_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_245_ = (((i_243_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_243_ = (((i_244_ | i_245_) >>> 8) + Class332_Sub3.anInt5440);
									int i_246_ = is_184_[i_183_];
									final int i_247_ = i_243_ + i_246_;
									final int i_248_ = ((i_243_ & 0xff00ff) + (i_246_ & 0xff00ff));
									i_246_ = ((i_248_ & 0x1000100) + (i_247_
											- i_248_ & 0x10000));
									is_184_[i_183_] = i_247_ - i_246_ | i_246_
											- (i_246_ >>> 8);
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_178_ += Class332_Sub3.anInt5436;
						}
					}
					i_175_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			}
		} else if (Class332_Sub3.anInt5444 < 0) {
			if (Class332_Sub3.anInt5436 == 0) {
				int i_249_ = Class332_Sub3.anInt5431;
				while (i_249_ < 0) {
					int i_250_ = Class332_Sub3.anInt5451;
					int i_251_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					final int i_252_ = Class332_Sub3.anInt5443;
					int i_253_ = Class332_Sub3.anInt5448;
					if (i_252_ >= 0
							&& (i_252_
									- (((Class332_Sub3) this).anInt5454 << 12) < 0)) {
						int i_254_;
						if ((i_254_ = i_251_
								- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
							i_254_ = ((Class332_Sub3.anInt5444 - i_254_) / Class332_Sub3.anInt5444);
							i_253_ += i_254_;
							i_251_ += Class332_Sub3.anInt5444 * i_254_;
							i_250_ += i_254_;
						}
						if ((i_254_ = ((i_251_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_253_) {
							i_253_ = i_254_;
						}
						for (/**/; i_253_ < 0; i_253_++) {
							int i_255_ = (((i_252_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_251_ >> 12));
							final int i_256_ = i_250_++;
							final int[] is_257_ = is;
							final int i_258_ = i;
							final int i_259_ = i_29_;
							if (i_259_ == 0) {
								if (i_258_ == 1) {
									is_257_[i_256_] = (anIntArray6212[i_255_]);
								} else if (i_258_ == 0) {
									final int i_260_ = (anIntArray6212[i_255_++]);
									final int i_261_ = (((i_260_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_262_ = (((i_260_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_263_ = (((i_260_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_257_[i_256_] = (i_261_ | i_262_ | i_263_) >>> 8;
								} else if (i_258_ == 3) {
									final int i_264_ = (anIntArray6212[i_255_++]);
									final int i_265_ = Class332_Sub3.anInt5432;
									final int i_266_ = i_264_ + i_265_;
									final int i_267_ = ((i_264_ & 0xff00ff) + (i_265_ & 0xff00ff));
									final int i_268_ = ((i_267_ & 0x1000100) + (i_266_
											- i_267_ & 0x10000));
									is_257_[i_256_] = i_266_ - i_268_ | i_268_
											- (i_268_ >>> 8);
								} else if (i_258_ == 2) {
									final int i_269_ = (anIntArray6212[i_255_]);
									final int i_270_ = (((i_269_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_271_ = (((i_269_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_257_[i_256_] = (((i_270_ | i_271_) >>> 8) + Class332_Sub3.anInt5440);
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_259_ == 1) {
								if (i_258_ == 1) {
									final int i_272_ = (anIntArray6212[i_255_]);
									final int i_273_ = i_272_ >>> 24;
									final int i_274_ = 256 - i_273_;
									final int i_275_ = is_257_[i_256_];
									is_257_[i_256_] = ((((i_272_ & 0xff00ff)
											* i_273_ + (i_275_ & 0xff00ff)
											* i_274_) & ~0xff00ff) + (((i_272_ & 0xff00)
											* i_273_ + (i_275_ & 0xff00)
											* i_274_) & 0xff0000)) >> 8;
								} else if (i_258_ == 0) {
									int i_276_ = (anIntArray6212[i_255_]);
									final int i_277_ = (((i_276_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
									final int i_278_ = 256 - i_277_;
									if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
										final int i_279_ = is_257_[i_256_];
										is_257_[i_256_] = ((((i_276_ & 0xff00ff)
												* i_277_ + ((i_279_ & 0xff00ff) * i_278_)) & ~0xff00ff) + (((i_276_ & 0xff00)
												* i_277_ + ((i_279_ & 0xff00) * i_278_)) & 0xff0000)) >> 8;
									} else if (i_277_ != 255) {
										final int i_280_ = (((i_276_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_281_ = (((i_276_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_282_ = (((i_276_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_276_ = (i_280_ | i_281_ | i_282_) >>> 8;
										final int i_283_ = is_257_[i_256_];
										is_257_[i_256_] = ((((i_276_ & 0xff00ff)
												* i_277_ + ((i_283_ & 0xff00ff) * i_278_)) & ~0xff00ff) + (((i_276_ & 0xff00)
												* i_277_ + ((i_283_ & 0xff00) * i_278_)) & 0xff0000)) >> 8;
									} else {
										final int i_284_ = (((i_276_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_285_ = (((i_276_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_286_ = (((i_276_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										is_257_[i_256_] = (i_284_ | i_285_ | i_286_) >>> 8;
									}
								} else if (i_258_ == 3) {
									int i_287_ = (anIntArray6212[i_255_]);
									final int i_288_ = Class332_Sub3.anInt5432;
									final int i_289_ = i_287_ + i_288_;
									final int i_290_ = ((i_287_ & 0xff00ff) + (i_288_ & 0xff00ff));
									int i_291_ = ((i_290_ & 0x1000100) + (i_289_
											- i_290_ & 0x10000));
									i_291_ = i_289_ - i_291_ | i_291_
											- (i_291_ >>> 8);
									final int i_292_ = (((i_287_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
									final int i_293_ = 256 - i_292_;
									if (i_292_ != 255) {
										i_287_ = i_291_;
										i_291_ = is_257_[i_256_];
										i_291_ = ((((i_287_ & 0xff00ff)
												* i_292_ + ((i_291_ & 0xff00ff) * i_293_)) & ~0xff00ff) + (((i_287_ & 0xff00)
												* i_292_ + ((i_291_ & 0xff00) * i_293_)) & 0xff0000)) >> 8;
									}
									is_257_[i_256_] = i_291_;
								} else if (i_258_ == 2) {
									int i_294_ = (anIntArray6212[i_255_]);
									final int i_295_ = i_294_ >>> 24;
									final int i_296_ = 256 - i_295_;
									final int i_297_ = (((i_294_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_298_ = (((i_294_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_294_ = (((i_297_ | i_298_) >>> 8) + Class332_Sub3.anInt5440);
									final int i_299_ = is_257_[i_256_];
									is_257_[i_256_] = ((((i_294_ & 0xff00ff)
											* i_295_ + (i_299_ & 0xff00ff)
											* i_296_) & ~0xff00ff) + (((i_294_ & 0xff00)
											* i_295_ + (i_299_ & 0xff00)
											* i_296_) & 0xff0000)) >> 8;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_259_ == 2) {
								if (i_258_ == 1) {
									final int i_300_ = (anIntArray6212[i_255_]);
									int i_301_ = is_257_[i_256_];
									final int i_302_ = i_300_ + i_301_;
									final int i_303_ = ((i_300_ & 0xff00ff) + (i_301_ & 0xff00ff));
									i_301_ = ((i_303_ & 0x1000100) + (i_302_
											- i_303_ & 0x10000));
									is_257_[i_256_] = i_302_ - i_301_ | i_301_
											- (i_301_ >>> 8);
								} else if (i_258_ == 0) {
									int i_304_ = (anIntArray6212[i_255_]);
									final int i_305_ = (((i_304_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_306_ = (((i_304_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_307_ = (((i_304_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_304_ = (i_305_ | i_306_ | i_307_) >>> 8;
									int i_308_ = is_257_[i_256_];
									final int i_309_ = i_304_ + i_308_;
									final int i_310_ = ((i_304_ & 0xff00ff) + (i_308_ & 0xff00ff));
									i_308_ = ((i_310_ & 0x1000100) + (i_309_
											- i_310_ & 0x10000));
									is_257_[i_256_] = i_309_ - i_308_ | i_308_
											- (i_308_ >>> 8);
								} else if (i_258_ == 3) {
									int i_311_ = (anIntArray6212[i_255_]);
									final int i_312_ = Class332_Sub3.anInt5432;
									int i_313_ = i_311_ + i_312_;
									int i_314_ = ((i_311_ & 0xff00ff) + (i_312_ & 0xff00ff));
									int i_315_ = ((i_314_ & 0x1000100) + (i_313_
											- i_314_ & 0x10000));
									i_311_ = i_313_ - i_315_ | i_315_
											- (i_315_ >>> 8);
									i_315_ = is_257_[i_256_];
									i_313_ = i_311_ + i_315_;
									i_314_ = (i_311_ & 0xff00ff)
											+ (i_315_ & 0xff00ff);
									i_315_ = ((i_314_ & 0x1000100) + (i_313_
											- i_314_ & 0x10000));
									is_257_[i_256_] = i_313_ - i_315_ | i_315_
											- (i_315_ >>> 8);
								} else if (i_258_ == 2) {
									int i_316_ = (anIntArray6212[i_255_]);
									final int i_317_ = (((i_316_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_318_ = (((i_316_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_316_ = (((i_317_ | i_318_) >>> 8) + Class332_Sub3.anInt5440);
									int i_319_ = is_257_[i_256_];
									final int i_320_ = i_316_ + i_319_;
									final int i_321_ = ((i_316_ & 0xff00ff) + (i_319_ & 0xff00ff));
									i_319_ = ((i_321_ & 0x1000100) + (i_320_
											- i_321_ & 0x10000));
									is_257_[i_256_] = i_320_ - i_319_ | i_319_
											- (i_319_ >>> 8);
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_251_ += Class332_Sub3.anInt5444;
						}
					}
					i_249_++;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else if (Class332_Sub3.anInt5436 < 0) {
				int i_322_ = Class332_Sub3.anInt5431;
				while (i_322_ < 0) {
					int i_323_ = Class332_Sub3.anInt5451;
					int i_324_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_325_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_326_ = Class332_Sub3.anInt5448;
					int i_327_;
					if ((i_327_ = i_324_
							- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
						i_327_ = ((Class332_Sub3.anInt5444 - i_327_) / Class332_Sub3.anInt5444);
						i_326_ += i_327_;
						i_324_ += Class332_Sub3.anInt5444 * i_327_;
						i_325_ += Class332_Sub3.anInt5436 * i_327_;
						i_323_ += i_327_;
					}
					if ((i_327_ = ((i_324_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_326_) {
						i_326_ = i_327_;
					}
					if ((i_327_ = i_325_
							- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
						i_327_ = ((Class332_Sub3.anInt5436 - i_327_) / Class332_Sub3.anInt5436);
						i_326_ += i_327_;
						i_324_ += Class332_Sub3.anInt5444 * i_327_;
						i_325_ += Class332_Sub3.anInt5436 * i_327_;
						i_323_ += i_327_;
					}
					if ((i_327_ = ((i_325_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_326_) {
						i_326_ = i_327_;
					}
					for (/**/; i_326_ < 0; i_326_++) {
						int i_328_ = (((i_325_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_324_ >> 12));
						final int i_329_ = i_323_++;
						final int[] is_330_ = is;
						final int i_331_ = i;
						final int i_332_ = i_29_;
						if (i_332_ == 0) {
							if (i_331_ == 1) {
								is_330_[i_329_] = (anIntArray6212[i_328_]);
							} else if (i_331_ == 0) {
								final int i_333_ = (anIntArray6212[i_328_++]);
								final int i_334_ = (((i_333_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_335_ = (((i_333_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_336_ = (((i_333_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								is_330_[i_329_] = (i_334_ | i_335_ | i_336_) >>> 8;
							} else if (i_331_ == 3) {
								final int i_337_ = (anIntArray6212[i_328_++]);
								final int i_338_ = Class332_Sub3.anInt5432;
								final int i_339_ = i_337_ + i_338_;
								final int i_340_ = ((i_337_ & 0xff00ff) + (i_338_ & 0xff00ff));
								final int i_341_ = ((i_340_ & 0x1000100) + (i_339_
										- i_340_ & 0x10000));
								is_330_[i_329_] = i_339_ - i_341_ | i_341_
										- (i_341_ >>> 8);
							} else if (i_331_ == 2) {
								final int i_342_ = (anIntArray6212[i_328_]);
								final int i_343_ = (((i_342_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_344_ = (((i_342_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								is_330_[i_329_] = (((i_343_ | i_344_) >>> 8) + Class332_Sub3.anInt5440);
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_332_ == 1) {
							if (i_331_ == 1) {
								final int i_345_ = (anIntArray6212[i_328_]);
								final int i_346_ = i_345_ >>> 24;
								final int i_347_ = 256 - i_346_;
								final int i_348_ = is_330_[i_329_];
								is_330_[i_329_] = ((((i_345_ & 0xff00ff)
										* i_346_ + (i_348_ & 0xff00ff) * i_347_) & ~0xff00ff) + (((i_345_ & 0xff00)
										* i_346_ + (i_348_ & 0xff00) * i_347_) & 0xff0000)) >> 8;
							} else if (i_331_ == 0) {
								int i_349_ = (anIntArray6212[i_328_]);
								final int i_350_ = (((i_349_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
								final int i_351_ = 256 - i_350_;
								if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
									final int i_352_ = is_330_[i_329_];
									is_330_[i_329_] = ((((i_349_ & 0xff00ff)
											* i_350_ + (i_352_ & 0xff00ff)
											* i_351_) & ~0xff00ff) + (((i_349_ & 0xff00)
											* i_350_ + (i_352_ & 0xff00)
											* i_351_) & 0xff0000)) >> 8;
								} else if (i_350_ != 255) {
									final int i_353_ = (((i_349_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_354_ = (((i_349_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_355_ = (((i_349_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_349_ = (i_353_ | i_354_ | i_355_) >>> 8;
									final int i_356_ = is_330_[i_329_];
									is_330_[i_329_] = ((((i_349_ & 0xff00ff)
											* i_350_ + (i_356_ & 0xff00ff)
											* i_351_) & ~0xff00ff) + (((i_349_ & 0xff00)
											* i_350_ + (i_356_ & 0xff00)
											* i_351_) & 0xff0000)) >> 8;
								} else {
									final int i_357_ = (((i_349_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_358_ = (((i_349_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_359_ = (((i_349_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_330_[i_329_] = (i_357_ | i_358_ | i_359_) >>> 8;
								}
							} else if (i_331_ == 3) {
								int i_360_ = (anIntArray6212[i_328_]);
								final int i_361_ = Class332_Sub3.anInt5432;
								final int i_362_ = i_360_ + i_361_;
								final int i_363_ = ((i_360_ & 0xff00ff) + (i_361_ & 0xff00ff));
								int i_364_ = ((i_363_ & 0x1000100) + (i_362_
										- i_363_ & 0x10000));
								i_364_ = i_362_ - i_364_ | i_364_
										- (i_364_ >>> 8);
								final int i_365_ = (((i_360_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
								final int i_366_ = 256 - i_365_;
								if (i_365_ != 255) {
									i_360_ = i_364_;
									i_364_ = is_330_[i_329_];
									i_364_ = ((((i_360_ & 0xff00ff) * i_365_ + (i_364_ & 0xff00ff)
											* i_366_) & ~0xff00ff) + (((i_360_ & 0xff00)
											* i_365_ + (i_364_ & 0xff00)
											* i_366_) & 0xff0000)) >> 8;
								}
								is_330_[i_329_] = i_364_;
							} else if (i_331_ == 2) {
								int i_367_ = (anIntArray6212[i_328_]);
								final int i_368_ = i_367_ >>> 24;
								final int i_369_ = 256 - i_368_;
								final int i_370_ = (((i_367_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_371_ = (((i_367_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								i_367_ = (((i_370_ | i_371_) >>> 8) + Class332_Sub3.anInt5440);
								final int i_372_ = is_330_[i_329_];
								is_330_[i_329_] = ((((i_367_ & 0xff00ff)
										* i_368_ + (i_372_ & 0xff00ff) * i_369_) & ~0xff00ff) + (((i_367_ & 0xff00)
										* i_368_ + (i_372_ & 0xff00) * i_369_) & 0xff0000)) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_332_ == 2) {
							if (i_331_ == 1) {
								final int i_373_ = (anIntArray6212[i_328_]);
								int i_374_ = is_330_[i_329_];
								final int i_375_ = i_373_ + i_374_;
								final int i_376_ = ((i_373_ & 0xff00ff) + (i_374_ & 0xff00ff));
								i_374_ = (i_376_ & 0x1000100)
										+ (i_375_ - i_376_ & 0x10000);
								is_330_[i_329_] = i_375_ - i_374_ | i_374_
										- (i_374_ >>> 8);
							} else if (i_331_ == 0) {
								int i_377_ = (anIntArray6212[i_328_]);
								final int i_378_ = (((i_377_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_379_ = (((i_377_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_380_ = (((i_377_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								i_377_ = (i_378_ | i_379_ | i_380_) >>> 8;
								int i_381_ = is_330_[i_329_];
								final int i_382_ = i_377_ + i_381_;
								final int i_383_ = ((i_377_ & 0xff00ff) + (i_381_ & 0xff00ff));
								i_381_ = (i_383_ & 0x1000100)
										+ (i_382_ - i_383_ & 0x10000);
								is_330_[i_329_] = i_382_ - i_381_ | i_381_
										- (i_381_ >>> 8);
							} else if (i_331_ == 3) {
								int i_384_ = (anIntArray6212[i_328_]);
								final int i_385_ = Class332_Sub3.anInt5432;
								int i_386_ = i_384_ + i_385_;
								int i_387_ = ((i_384_ & 0xff00ff) + (i_385_ & 0xff00ff));
								int i_388_ = ((i_387_ & 0x1000100) + (i_386_
										- i_387_ & 0x10000));
								i_384_ = i_386_ - i_388_ | i_388_
										- (i_388_ >>> 8);
								i_388_ = is_330_[i_329_];
								i_386_ = i_384_ + i_388_;
								i_387_ = (i_384_ & 0xff00ff)
										+ (i_388_ & 0xff00ff);
								i_388_ = (i_387_ & 0x1000100)
										+ (i_386_ - i_387_ & 0x10000);
								is_330_[i_329_] = i_386_ - i_388_ | i_388_
										- (i_388_ >>> 8);
							} else if (i_331_ == 2) {
								int i_389_ = (anIntArray6212[i_328_]);
								final int i_390_ = (((i_389_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_391_ = (((i_389_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								i_389_ = (((i_390_ | i_391_) >>> 8) + Class332_Sub3.anInt5440);
								int i_392_ = is_330_[i_329_];
								final int i_393_ = i_389_ + i_392_;
								final int i_394_ = ((i_389_ & 0xff00ff) + (i_392_ & 0xff00ff));
								i_392_ = (i_394_ & 0x1000100)
										+ (i_393_ - i_394_ & 0x10000);
								is_330_[i_329_] = i_393_ - i_392_ | i_392_
										- (i_392_ >>> 8);
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_324_ += Class332_Sub3.anInt5444;
						i_325_ += Class332_Sub3.anInt5436;
					}
					i_322_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else {
				int i_395_ = Class332_Sub3.anInt5431;
				while (i_395_ < 0) {
					int i_396_ = Class332_Sub3.anInt5451;
					int i_397_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_398_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_399_ = Class332_Sub3.anInt5448;
					int i_400_;
					if ((i_400_ = i_397_
							- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
						i_400_ = ((Class332_Sub3.anInt5444 - i_400_) / Class332_Sub3.anInt5444);
						i_399_ += i_400_;
						i_397_ += Class332_Sub3.anInt5444 * i_400_;
						i_398_ += Class332_Sub3.anInt5436 * i_400_;
						i_396_ += i_400_;
					}
					if ((i_400_ = ((i_397_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_399_) {
						i_399_ = i_400_;
					}
					if (i_398_ < 0) {
						i_400_ = ((Class332_Sub3.anInt5436 - 1 - i_398_) / Class332_Sub3.anInt5436);
						i_399_ += i_400_;
						i_397_ += Class332_Sub3.anInt5444 * i_400_;
						i_398_ += Class332_Sub3.anInt5436 * i_400_;
						i_396_ += i_400_;
					}
					if ((i_400_ = ((1 + i_398_
							- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_399_) {
						i_399_ = i_400_;
					}
					for (/**/; i_399_ < 0; i_399_++) {
						int i_401_ = (((i_398_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_397_ >> 12));
						final int i_402_ = i_396_++;
						final int[] is_403_ = is;
						final int i_404_ = i;
						final int i_405_ = i_29_;
						if (i_405_ == 0) {
							if (i_404_ == 1) {
								is_403_[i_402_] = (anIntArray6212[i_401_]);
							} else if (i_404_ == 0) {
								final int i_406_ = (anIntArray6212[i_401_++]);
								final int i_407_ = (((i_406_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_408_ = (((i_406_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_409_ = (((i_406_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								is_403_[i_402_] = (i_407_ | i_408_ | i_409_) >>> 8;
							} else if (i_404_ == 3) {
								final int i_410_ = (anIntArray6212[i_401_++]);
								final int i_411_ = Class332_Sub3.anInt5432;
								final int i_412_ = i_410_ + i_411_;
								final int i_413_ = ((i_410_ & 0xff00ff) + (i_411_ & 0xff00ff));
								final int i_414_ = ((i_413_ & 0x1000100) + (i_412_
										- i_413_ & 0x10000));
								is_403_[i_402_] = i_412_ - i_414_ | i_414_
										- (i_414_ >>> 8);
							} else if (i_404_ == 2) {
								final int i_415_ = (anIntArray6212[i_401_]);
								final int i_416_ = (((i_415_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_417_ = (((i_415_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								is_403_[i_402_] = (((i_416_ | i_417_) >>> 8) + Class332_Sub3.anInt5440);
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_405_ == 1) {
							if (i_404_ == 1) {
								final int i_418_ = (anIntArray6212[i_401_]);
								final int i_419_ = i_418_ >>> 24;
								final int i_420_ = 256 - i_419_;
								final int i_421_ = is_403_[i_402_];
								is_403_[i_402_] = ((((i_418_ & 0xff00ff)
										* i_419_ + (i_421_ & 0xff00ff) * i_420_) & ~0xff00ff) + (((i_418_ & 0xff00)
										* i_419_ + (i_421_ & 0xff00) * i_420_) & 0xff0000)) >> 8;
							} else if (i_404_ == 0) {
								int i_422_ = (anIntArray6212[i_401_]);
								final int i_423_ = (((i_422_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
								final int i_424_ = 256 - i_423_;
								if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
									final int i_425_ = is_403_[i_402_];
									is_403_[i_402_] = ((((i_422_ & 0xff00ff)
											* i_423_ + (i_425_ & 0xff00ff)
											* i_424_) & ~0xff00ff) + (((i_422_ & 0xff00)
											* i_423_ + (i_425_ & 0xff00)
											* i_424_) & 0xff0000)) >> 8;
								} else if (i_423_ != 255) {
									final int i_426_ = (((i_422_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_427_ = (((i_422_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_428_ = (((i_422_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_422_ = (i_426_ | i_427_ | i_428_) >>> 8;
									final int i_429_ = is_403_[i_402_];
									is_403_[i_402_] = ((((i_422_ & 0xff00ff)
											* i_423_ + (i_429_ & 0xff00ff)
											* i_424_) & ~0xff00ff) + (((i_422_ & 0xff00)
											* i_423_ + (i_429_ & 0xff00)
											* i_424_) & 0xff0000)) >> 8;
								} else {
									final int i_430_ = (((i_422_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_431_ = (((i_422_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_432_ = (((i_422_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_403_[i_402_] = (i_430_ | i_431_ | i_432_) >>> 8;
								}
							} else if (i_404_ == 3) {
								int i_433_ = (anIntArray6212[i_401_]);
								final int i_434_ = Class332_Sub3.anInt5432;
								final int i_435_ = i_433_ + i_434_;
								final int i_436_ = ((i_433_ & 0xff00ff) + (i_434_ & 0xff00ff));
								int i_437_ = ((i_436_ & 0x1000100) + (i_435_
										- i_436_ & 0x10000));
								i_437_ = i_435_ - i_437_ | i_437_
										- (i_437_ >>> 8);
								final int i_438_ = (((i_433_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
								final int i_439_ = 256 - i_438_;
								if (i_438_ != 255) {
									i_433_ = i_437_;
									i_437_ = is_403_[i_402_];
									i_437_ = ((((i_433_ & 0xff00ff) * i_438_ + (i_437_ & 0xff00ff)
											* i_439_) & ~0xff00ff) + (((i_433_ & 0xff00)
											* i_438_ + (i_437_ & 0xff00)
											* i_439_) & 0xff0000)) >> 8;
								}
								is_403_[i_402_] = i_437_;
							} else if (i_404_ == 2) {
								int i_440_ = (anIntArray6212[i_401_]);
								final int i_441_ = i_440_ >>> 24;
								final int i_442_ = 256 - i_441_;
								final int i_443_ = (((i_440_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_444_ = (((i_440_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								i_440_ = (((i_443_ | i_444_) >>> 8) + Class332_Sub3.anInt5440);
								final int i_445_ = is_403_[i_402_];
								is_403_[i_402_] = ((((i_440_ & 0xff00ff)
										* i_441_ + (i_445_ & 0xff00ff) * i_442_) & ~0xff00ff) + (((i_440_ & 0xff00)
										* i_441_ + (i_445_ & 0xff00) * i_442_) & 0xff0000)) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_405_ == 2) {
							if (i_404_ == 1) {
								final int i_446_ = (anIntArray6212[i_401_]);
								int i_447_ = is_403_[i_402_];
								final int i_448_ = i_446_ + i_447_;
								final int i_449_ = ((i_446_ & 0xff00ff) + (i_447_ & 0xff00ff));
								i_447_ = (i_449_ & 0x1000100)
										+ (i_448_ - i_449_ & 0x10000);
								is_403_[i_402_] = i_448_ - i_447_ | i_447_
										- (i_447_ >>> 8);
							} else if (i_404_ == 0) {
								int i_450_ = (anIntArray6212[i_401_]);
								final int i_451_ = (((i_450_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_452_ = (((i_450_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_453_ = (((i_450_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								i_450_ = (i_451_ | i_452_ | i_453_) >>> 8;
								int i_454_ = is_403_[i_402_];
								final int i_455_ = i_450_ + i_454_;
								final int i_456_ = ((i_450_ & 0xff00ff) + (i_454_ & 0xff00ff));
								i_454_ = (i_456_ & 0x1000100)
										+ (i_455_ - i_456_ & 0x10000);
								is_403_[i_402_] = i_455_ - i_454_ | i_454_
										- (i_454_ >>> 8);
							} else if (i_404_ == 3) {
								int i_457_ = (anIntArray6212[i_401_]);
								final int i_458_ = Class332_Sub3.anInt5432;
								int i_459_ = i_457_ + i_458_;
								int i_460_ = ((i_457_ & 0xff00ff) + (i_458_ & 0xff00ff));
								int i_461_ = ((i_460_ & 0x1000100) + (i_459_
										- i_460_ & 0x10000));
								i_457_ = i_459_ - i_461_ | i_461_
										- (i_461_ >>> 8);
								i_461_ = is_403_[i_402_];
								i_459_ = i_457_ + i_461_;
								i_460_ = (i_457_ & 0xff00ff)
										+ (i_461_ & 0xff00ff);
								i_461_ = (i_460_ & 0x1000100)
										+ (i_459_ - i_460_ & 0x10000);
								is_403_[i_402_] = i_459_ - i_461_ | i_461_
										- (i_461_ >>> 8);
							} else if (i_404_ == 2) {
								int i_462_ = (anIntArray6212[i_401_]);
								final int i_463_ = (((i_462_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_464_ = (((i_462_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								i_462_ = (((i_463_ | i_464_) >>> 8) + Class332_Sub3.anInt5440);
								int i_465_ = is_403_[i_402_];
								final int i_466_ = i_462_ + i_465_;
								final int i_467_ = ((i_462_ & 0xff00ff) + (i_465_ & 0xff00ff));
								i_465_ = (i_467_ & 0x1000100)
										+ (i_466_ - i_467_ & 0x10000);
								is_403_[i_402_] = i_466_ - i_465_ | i_465_
										- (i_465_ >>> 8);
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_397_ += Class332_Sub3.anInt5444;
						i_398_ += Class332_Sub3.anInt5436;
					}
					i_395_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			}
		} else if (Class332_Sub3.anInt5436 == 0) {
			int i_468_ = Class332_Sub3.anInt5431;
			while (i_468_ < 0) {
				int i_469_ = Class332_Sub3.anInt5451;
				int i_470_ = Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425;
				final int i_471_ = Class332_Sub3.anInt5443;
				int i_472_ = Class332_Sub3.anInt5448;
				if (i_471_ >= 0
						&& i_471_ - (((Class332_Sub3) this).anInt5454 << 12) < 0) {
					if (i_470_ < 0) {
						final int i_473_ = ((Class332_Sub3.anInt5444 - 1 - i_470_) / Class332_Sub3.anInt5444);
						i_472_ += i_473_;
						i_470_ += Class332_Sub3.anInt5444 * i_473_;
						i_469_ += i_473_;
					}
					int i_474_;
					if ((i_474_ = ((1 + i_470_
							- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_472_) {
						i_472_ = i_474_;
					}
					for (/**/; i_472_ < 0; i_472_++) {
						int i_475_ = (((i_471_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_470_ >> 12));
						final int i_476_ = i_469_++;
						final int[] is_477_ = is;
						final int i_478_ = i;
						final int i_479_ = i_29_;
						if (i_479_ == 0) {
							if (i_478_ == 1) {
								is_477_[i_476_] = (anIntArray6212[i_475_]);
							} else if (i_478_ == 0) {
								final int i_480_ = (anIntArray6212[i_475_++]);
								final int i_481_ = (((i_480_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_482_ = (((i_480_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_483_ = (((i_480_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								is_477_[i_476_] = (i_481_ | i_482_ | i_483_) >>> 8;
							} else if (i_478_ == 3) {
								final int i_484_ = (anIntArray6212[i_475_++]);
								final int i_485_ = Class332_Sub3.anInt5432;
								final int i_486_ = i_484_ + i_485_;
								final int i_487_ = ((i_484_ & 0xff00ff) + (i_485_ & 0xff00ff));
								final int i_488_ = ((i_487_ & 0x1000100) + (i_486_
										- i_487_ & 0x10000));
								is_477_[i_476_] = i_486_ - i_488_ | i_488_
										- (i_488_ >>> 8);
							} else if (i_478_ == 2) {
								final int i_489_ = (anIntArray6212[i_475_]);
								final int i_490_ = (((i_489_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_491_ = (((i_489_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								is_477_[i_476_] = (((i_490_ | i_491_) >>> 8) + Class332_Sub3.anInt5440);
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_479_ == 1) {
							if (i_478_ == 1) {
								final int i_492_ = (anIntArray6212[i_475_]);
								final int i_493_ = i_492_ >>> 24;
								final int i_494_ = 256 - i_493_;
								final int i_495_ = is_477_[i_476_];
								is_477_[i_476_] = ((((i_492_ & 0xff00ff)
										* i_493_ + (i_495_ & 0xff00ff) * i_494_) & ~0xff00ff) + (((i_492_ & 0xff00)
										* i_493_ + (i_495_ & 0xff00) * i_494_) & 0xff0000)) >> 8;
							} else if (i_478_ == 0) {
								int i_496_ = (anIntArray6212[i_475_]);
								final int i_497_ = (((i_496_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
								final int i_498_ = 256 - i_497_;
								if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
									final int i_499_ = is_477_[i_476_];
									is_477_[i_476_] = ((((i_496_ & 0xff00ff)
											* i_497_ + (i_499_ & 0xff00ff)
											* i_498_) & ~0xff00ff) + (((i_496_ & 0xff00)
											* i_497_ + (i_499_ & 0xff00)
											* i_498_) & 0xff0000)) >> 8;
								} else if (i_497_ != 255) {
									final int i_500_ = (((i_496_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_501_ = (((i_496_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_502_ = (((i_496_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_496_ = (i_500_ | i_501_ | i_502_) >>> 8;
									final int i_503_ = is_477_[i_476_];
									is_477_[i_476_] = ((((i_496_ & 0xff00ff)
											* i_497_ + (i_503_ & 0xff00ff)
											* i_498_) & ~0xff00ff) + (((i_496_ & 0xff00)
											* i_497_ + (i_503_ & 0xff00)
											* i_498_) & 0xff0000)) >> 8;
								} else {
									final int i_504_ = (((i_496_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_505_ = (((i_496_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_506_ = (((i_496_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_477_[i_476_] = (i_504_ | i_505_ | i_506_) >>> 8;
								}
							} else if (i_478_ == 3) {
								int i_507_ = (anIntArray6212[i_475_]);
								final int i_508_ = Class332_Sub3.anInt5432;
								final int i_509_ = i_507_ + i_508_;
								final int i_510_ = ((i_507_ & 0xff00ff) + (i_508_ & 0xff00ff));
								int i_511_ = ((i_510_ & 0x1000100) + (i_509_
										- i_510_ & 0x10000));
								i_511_ = i_509_ - i_511_ | i_511_
										- (i_511_ >>> 8);
								final int i_512_ = (((i_507_ >>> 24) * Class332_Sub3.anInt5449) >> 8);
								final int i_513_ = 256 - i_512_;
								if (i_512_ != 255) {
									i_507_ = i_511_;
									i_511_ = is_477_[i_476_];
									i_511_ = ((((i_507_ & 0xff00ff) * i_512_ + (i_511_ & 0xff00ff)
											* i_513_) & ~0xff00ff) + (((i_507_ & 0xff00)
											* i_512_ + (i_511_ & 0xff00)
											* i_513_) & 0xff0000)) >> 8;
								}
								is_477_[i_476_] = i_511_;
							} else if (i_478_ == 2) {
								int i_514_ = (anIntArray6212[i_475_]);
								final int i_515_ = i_514_ >>> 24;
								final int i_516_ = 256 - i_515_;
								final int i_517_ = (((i_514_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_518_ = (((i_514_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								i_514_ = (((i_517_ | i_518_) >>> 8) + Class332_Sub3.anInt5440);
								final int i_519_ = is_477_[i_476_];
								is_477_[i_476_] = ((((i_514_ & 0xff00ff)
										* i_515_ + (i_519_ & 0xff00ff) * i_516_) & ~0xff00ff) + (((i_514_ & 0xff00)
										* i_515_ + (i_519_ & 0xff00) * i_516_) & 0xff0000)) >> 8;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_479_ == 2) {
							if (i_478_ == 1) {
								final int i_520_ = (anIntArray6212[i_475_]);
								int i_521_ = is_477_[i_476_];
								final int i_522_ = i_520_ + i_521_;
								final int i_523_ = ((i_520_ & 0xff00ff) + (i_521_ & 0xff00ff));
								i_521_ = (i_523_ & 0x1000100)
										+ (i_522_ - i_523_ & 0x10000);
								is_477_[i_476_] = i_522_ - i_521_ | i_521_
										- (i_521_ >>> 8);
							} else if (i_478_ == 0) {
								int i_524_ = (anIntArray6212[i_475_]);
								final int i_525_ = (((i_524_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_526_ = (((i_524_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_527_ = (((i_524_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								i_524_ = (i_525_ | i_526_ | i_527_) >>> 8;
								int i_528_ = is_477_[i_476_];
								final int i_529_ = i_524_ + i_528_;
								final int i_530_ = ((i_524_ & 0xff00ff) + (i_528_ & 0xff00ff));
								i_528_ = (i_530_ & 0x1000100)
										+ (i_529_ - i_530_ & 0x10000);
								is_477_[i_476_] = i_529_ - i_528_ | i_528_
										- (i_528_ >>> 8);
							} else if (i_478_ == 3) {
								int i_531_ = (anIntArray6212[i_475_]);
								final int i_532_ = Class332_Sub3.anInt5432;
								int i_533_ = i_531_ + i_532_;
								int i_534_ = ((i_531_ & 0xff00ff) + (i_532_ & 0xff00ff));
								int i_535_ = ((i_534_ & 0x1000100) + (i_533_
										- i_534_ & 0x10000));
								i_531_ = i_533_ - i_535_ | i_535_
										- (i_535_ >>> 8);
								i_535_ = is_477_[i_476_];
								i_533_ = i_531_ + i_535_;
								i_534_ = (i_531_ & 0xff00ff)
										+ (i_535_ & 0xff00ff);
								i_535_ = (i_534_ & 0x1000100)
										+ (i_533_ - i_534_ & 0x10000);
								is_477_[i_476_] = i_533_ - i_535_ | i_535_
										- (i_535_ >>> 8);
							} else if (i_478_ == 2) {
								int i_536_ = (anIntArray6212[i_475_]);
								final int i_537_ = (((i_536_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_538_ = (((i_536_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								i_536_ = (((i_537_ | i_538_) >>> 8) + Class332_Sub3.anInt5440);
								int i_539_ = is_477_[i_476_];
								final int i_540_ = i_536_ + i_539_;
								final int i_541_ = ((i_536_ & 0xff00ff) + (i_539_ & 0xff00ff));
								i_539_ = (i_541_ & 0x1000100)
										+ (i_540_ - i_541_ & 0x10000);
								is_477_[i_476_] = i_540_ - i_539_ | i_539_
										- (i_539_ >>> 8);
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_470_ += Class332_Sub3.anInt5444;
					}
				}
				i_468_++;
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		} else if (Class332_Sub3.anInt5436 < 0) {
			for (int i_542_ = Class332_Sub3.anInt5431; i_542_ < 0; i_542_++) {
				int i_543_ = Class332_Sub3.anInt5451;
				int i_544_ = Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425;
				int i_545_ = Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456;
				int i_546_ = Class332_Sub3.anInt5448;
				if (i_544_ < 0) {
					final int i_547_ = ((Class332_Sub3.anInt5444 - 1 - i_544_) / Class332_Sub3.anInt5444);
					i_546_ += i_547_;
					i_544_ += Class332_Sub3.anInt5444 * i_547_;
					i_545_ += Class332_Sub3.anInt5436 * i_547_;
					i_543_ += i_547_;
				}
				int i_548_;
				if ((i_548_ = (1 + i_544_
						- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444)
						/ Class332_Sub3.anInt5444) > i_546_) {
					i_546_ = i_548_;
				}
				if ((i_548_ = i_545_ - (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
					i_548_ = ((Class332_Sub3.anInt5436 - i_548_) / Class332_Sub3.anInt5436);
					i_546_ += i_548_;
					i_544_ += Class332_Sub3.anInt5444 * i_548_;
					i_545_ += Class332_Sub3.anInt5436 * i_548_;
					i_543_ += i_548_;
				}
				if ((i_548_ = ((i_545_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_546_) {
					i_546_ = i_548_;
				}
				for (/**/; i_546_ < 0; i_546_++) {
					int i_549_ = ((i_545_ >> 12)
							* ((Class332_Sub3) this).anInt5433 + (i_544_ >> 12));
					final int i_550_ = i_543_++;
					final int[] is_551_ = is;
					final int i_552_ = i;
					final int i_553_ = i_29_;
					if (i_553_ == 0) {
						if (i_552_ == 1) {
							is_551_[i_550_] = (anIntArray6212[i_549_]);
						} else if (i_552_ == 0) {
							final int i_554_ = (anIntArray6212[i_549_++]);
							final int i_555_ = (((i_554_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
							final int i_556_ = ((i_554_ & 0xff00)
									* Class332_Sub3.anInt5457 & 0xff0000);
							final int i_557_ = ((i_554_ & 0xff)
									* Class332_Sub3.anInt5427 & 0xff00);
							is_551_[i_550_] = (i_555_ | i_556_ | i_557_) >>> 8;
						} else if (i_552_ == 3) {
							final int i_558_ = (anIntArray6212[i_549_++]);
							final int i_559_ = Class332_Sub3.anInt5432;
							final int i_560_ = i_558_ + i_559_;
							final int i_561_ = (i_558_ & 0xff00ff)
									+ (i_559_ & 0xff00ff);
							final int i_562_ = ((i_561_ & 0x1000100) + (i_560_
									- i_561_ & 0x10000));
							is_551_[i_550_] = i_560_ - i_562_ | i_562_
									- (i_562_ >>> 8);
						} else if (i_552_ == 2) {
							final int i_563_ = (anIntArray6212[i_549_]);
							final int i_564_ = (((i_563_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
							final int i_565_ = ((i_563_ & 0xff00)
									* Class332_Sub3.anInt5449 & 0xff0000);
							is_551_[i_550_] = (((i_564_ | i_565_) >>> 8) + Class332_Sub3.anInt5440);
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_553_ == 1) {
						if (i_552_ == 1) {
							final int i_566_ = (anIntArray6212[i_549_]);
							final int i_567_ = i_566_ >>> 24;
							final int i_568_ = 256 - i_567_;
							final int i_569_ = is_551_[i_550_];
							is_551_[i_550_] = ((((i_566_ & 0xff00ff) * i_567_ + (i_569_ & 0xff00ff)
									* i_568_) & ~0xff00ff) + (((i_566_ & 0xff00)
									* i_567_ + (i_569_ & 0xff00) * i_568_) & 0xff0000)) >> 8;
						} else if (i_552_ == 0) {
							int i_570_ = (anIntArray6212[i_549_]);
							final int i_571_ = ((i_570_ >>> 24)
									* Class332_Sub3.anInt5449 >> 8);
							final int i_572_ = 256 - i_571_;
							if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
								final int i_573_ = is_551_[i_550_];
								is_551_[i_550_] = ((((i_570_ & 0xff00ff)
										* i_571_ + (i_573_ & 0xff00ff) * i_572_) & ~0xff00ff) + (((i_570_ & 0xff00)
										* i_571_ + (i_573_ & 0xff00) * i_572_) & 0xff0000)) >> 8;
							} else if (i_571_ != 255) {
								final int i_574_ = (((i_570_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_575_ = (((i_570_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_576_ = (((i_570_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								i_570_ = (i_574_ | i_575_ | i_576_) >>> 8;
								final int i_577_ = is_551_[i_550_];
								is_551_[i_550_] = ((((i_570_ & 0xff00ff)
										* i_571_ + (i_577_ & 0xff00ff) * i_572_) & ~0xff00ff) + (((i_570_ & 0xff00)
										* i_571_ + (i_577_ & 0xff00) * i_572_) & 0xff0000)) >> 8;
							} else {
								final int i_578_ = (((i_570_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_579_ = (((i_570_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_580_ = (((i_570_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								is_551_[i_550_] = (i_578_ | i_579_ | i_580_) >>> 8;
							}
						} else if (i_552_ == 3) {
							int i_581_ = (anIntArray6212[i_549_]);
							final int i_582_ = Class332_Sub3.anInt5432;
							final int i_583_ = i_581_ + i_582_;
							final int i_584_ = (i_581_ & 0xff00ff)
									+ (i_582_ & 0xff00ff);
							int i_585_ = ((i_584_ & 0x1000100) + (i_583_
									- i_584_ & 0x10000));
							i_585_ = i_583_ - i_585_ | i_585_ - (i_585_ >>> 8);
							final int i_586_ = ((i_581_ >>> 24)
									* Class332_Sub3.anInt5449 >> 8);
							final int i_587_ = 256 - i_586_;
							if (i_586_ != 255) {
								i_581_ = i_585_;
								i_585_ = is_551_[i_550_];
								i_585_ = ((((i_581_ & 0xff00ff) * i_586_ + (i_585_ & 0xff00ff)
										* i_587_) & ~0xff00ff) + (((i_581_ & 0xff00)
										* i_586_ + (i_585_ & 0xff00) * i_587_) & 0xff0000)) >> 8;
							}
							is_551_[i_550_] = i_585_;
						} else if (i_552_ == 2) {
							int i_588_ = (anIntArray6212[i_549_]);
							final int i_589_ = i_588_ >>> 24;
							final int i_590_ = 256 - i_589_;
							final int i_591_ = (((i_588_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
							final int i_592_ = ((i_588_ & 0xff00)
									* Class332_Sub3.anInt5449 & 0xff0000);
							i_588_ = (((i_591_ | i_592_) >>> 8) + Class332_Sub3.anInt5440);
							final int i_593_ = is_551_[i_550_];
							is_551_[i_550_] = ((((i_588_ & 0xff00ff) * i_589_ + (i_593_ & 0xff00ff)
									* i_590_) & ~0xff00ff) + (((i_588_ & 0xff00)
									* i_589_ + (i_593_ & 0xff00) * i_590_) & 0xff0000)) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_553_ == 2) {
						if (i_552_ == 1) {
							final int i_594_ = (anIntArray6212[i_549_]);
							int i_595_ = is_551_[i_550_];
							final int i_596_ = i_594_ + i_595_;
							final int i_597_ = (i_594_ & 0xff00ff)
									+ (i_595_ & 0xff00ff);
							i_595_ = (i_597_ & 0x1000100)
									+ (i_596_ - i_597_ & 0x10000);
							is_551_[i_550_] = i_596_ - i_595_ | i_595_
									- (i_595_ >>> 8);
						} else if (i_552_ == 0) {
							int i_598_ = (anIntArray6212[i_549_]);
							final int i_599_ = (((i_598_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
							final int i_600_ = ((i_598_ & 0xff00)
									* Class332_Sub3.anInt5457 & 0xff0000);
							final int i_601_ = ((i_598_ & 0xff)
									* Class332_Sub3.anInt5427 & 0xff00);
							i_598_ = (i_599_ | i_600_ | i_601_) >>> 8;
							int i_602_ = is_551_[i_550_];
							final int i_603_ = i_598_ + i_602_;
							final int i_604_ = (i_598_ & 0xff00ff)
									+ (i_602_ & 0xff00ff);
							i_602_ = (i_604_ & 0x1000100)
									+ (i_603_ - i_604_ & 0x10000);
							is_551_[i_550_] = i_603_ - i_602_ | i_602_
									- (i_602_ >>> 8);
						} else if (i_552_ == 3) {
							int i_605_ = (anIntArray6212[i_549_]);
							final int i_606_ = Class332_Sub3.anInt5432;
							int i_607_ = i_605_ + i_606_;
							int i_608_ = (i_605_ & 0xff00ff)
									+ (i_606_ & 0xff00ff);
							int i_609_ = ((i_608_ & 0x1000100) + (i_607_
									- i_608_ & 0x10000));
							i_605_ = i_607_ - i_609_ | i_609_ - (i_609_ >>> 8);
							i_609_ = is_551_[i_550_];
							i_607_ = i_605_ + i_609_;
							i_608_ = (i_605_ & 0xff00ff) + (i_609_ & 0xff00ff);
							i_609_ = (i_608_ & 0x1000100)
									+ (i_607_ - i_608_ & 0x10000);
							is_551_[i_550_] = i_607_ - i_609_ | i_609_
									- (i_609_ >>> 8);
						} else if (i_552_ == 2) {
							int i_610_ = (anIntArray6212[i_549_]);
							final int i_611_ = (((i_610_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
							final int i_612_ = ((i_610_ & 0xff00)
									* Class332_Sub3.anInt5449 & 0xff0000);
							i_610_ = (((i_611_ | i_612_) >>> 8) + Class332_Sub3.anInt5440);
							int i_613_ = is_551_[i_550_];
							final int i_614_ = i_610_ + i_613_;
							final int i_615_ = (i_610_ & 0xff00ff)
									+ (i_613_ & 0xff00ff);
							i_613_ = (i_615_ & 0x1000100)
									+ (i_614_ - i_615_ & 0x10000);
							is_551_[i_550_] = i_614_ - i_613_ | i_613_
									- (i_613_ >>> 8);
						}
					} else {
						throw new IllegalArgumentException();
					}
					i_544_ += Class332_Sub3.anInt5444;
					i_545_ += Class332_Sub3.anInt5436;
				}
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		} else {
			for (int i_616_ = Class332_Sub3.anInt5431; i_616_ < 0; i_616_++) {
				int i_617_ = Class332_Sub3.anInt5451;
				int i_618_ = Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425;
				int i_619_ = Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456;
				int i_620_ = Class332_Sub3.anInt5448;
				if (i_618_ < 0) {
					final int i_621_ = ((Class332_Sub3.anInt5444 - 1 - i_618_) / Class332_Sub3.anInt5444);
					i_620_ += i_621_;
					i_618_ += Class332_Sub3.anInt5444 * i_621_;
					i_619_ += Class332_Sub3.anInt5436 * i_621_;
					i_617_ += i_621_;
				}
				int i_622_;
				if ((i_622_ = (1 + i_618_
						- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444)
						/ Class332_Sub3.anInt5444) > i_620_) {
					i_620_ = i_622_;
				}
				if (i_619_ < 0) {
					i_622_ = ((Class332_Sub3.anInt5436 - 1 - i_619_) / Class332_Sub3.anInt5436);
					i_620_ += i_622_;
					i_618_ += Class332_Sub3.anInt5444 * i_622_;
					i_619_ += Class332_Sub3.anInt5436 * i_622_;
					i_617_ += i_622_;
				}
				if ((i_622_ = (1 + i_619_
						- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436)
						/ Class332_Sub3.anInt5436) > i_620_) {
					i_620_ = i_622_;
				}
				for (/**/; i_620_ < 0; i_620_++) {
					int i_623_ = ((i_619_ >> 12)
							* ((Class332_Sub3) this).anInt5433 + (i_618_ >> 12));
					final int i_624_ = i_617_++;
					final int[] is_625_ = is;
					final int i_626_ = i;
					final int i_627_ = i_29_;
					if (i_627_ == 0) {
						if (i_626_ == 1) {
							is_625_[i_624_] = (anIntArray6212[i_623_]);
						} else if (i_626_ == 0) {
							final int i_628_ = (anIntArray6212[i_623_++]);
							final int i_629_ = (((i_628_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
							final int i_630_ = ((i_628_ & 0xff00)
									* Class332_Sub3.anInt5457 & 0xff0000);
							final int i_631_ = ((i_628_ & 0xff)
									* Class332_Sub3.anInt5427 & 0xff00);
							is_625_[i_624_] = (i_629_ | i_630_ | i_631_) >>> 8;
						} else if (i_626_ == 3) {
							final int i_632_ = (anIntArray6212[i_623_++]);
							final int i_633_ = Class332_Sub3.anInt5432;
							final int i_634_ = i_632_ + i_633_;
							final int i_635_ = (i_632_ & 0xff00ff)
									+ (i_633_ & 0xff00ff);
							final int i_636_ = ((i_635_ & 0x1000100) + (i_634_
									- i_635_ & 0x10000));
							is_625_[i_624_] = i_634_ - i_636_ | i_636_
									- (i_636_ >>> 8);
						} else if (i_626_ == 2) {
							final int i_637_ = (anIntArray6212[i_623_]);
							final int i_638_ = (((i_637_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
							final int i_639_ = ((i_637_ & 0xff00)
									* Class332_Sub3.anInt5449 & 0xff0000);
							is_625_[i_624_] = (((i_638_ | i_639_) >>> 8) + Class332_Sub3.anInt5440);
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_627_ == 1) {
						if (i_626_ == 1) {
							final int i_640_ = (anIntArray6212[i_623_]);
							final int i_641_ = i_640_ >>> 24;
							final int i_642_ = 256 - i_641_;
							final int i_643_ = is_625_[i_624_];
							is_625_[i_624_] = ((((i_640_ & 0xff00ff) * i_641_ + (i_643_ & 0xff00ff)
									* i_642_) & ~0xff00ff) + (((i_640_ & 0xff00)
									* i_641_ + (i_643_ & 0xff00) * i_642_) & 0xff0000)) >> 8;
						} else if (i_626_ == 0) {
							int i_644_ = (anIntArray6212[i_623_]);
							final int i_645_ = ((i_644_ >>> 24)
									* Class332_Sub3.anInt5449 >> 8);
							final int i_646_ = 256 - i_645_;
							if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
								final int i_647_ = is_625_[i_624_];
								is_625_[i_624_] = ((((i_644_ & 0xff00ff)
										* i_645_ + (i_647_ & 0xff00ff) * i_646_) & ~0xff00ff) + (((i_644_ & 0xff00)
										* i_645_ + (i_647_ & 0xff00) * i_646_) & 0xff0000)) >> 8;
							} else if (i_645_ != 255) {
								final int i_648_ = (((i_644_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_649_ = (((i_644_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_650_ = (((i_644_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								i_644_ = (i_648_ | i_649_ | i_650_) >>> 8;
								final int i_651_ = is_625_[i_624_];
								is_625_[i_624_] = ((((i_644_ & 0xff00ff)
										* i_645_ + (i_651_ & 0xff00ff) * i_646_) & ~0xff00ff) + (((i_644_ & 0xff00)
										* i_645_ + (i_651_ & 0xff00) * i_646_) & 0xff0000)) >> 8;
							} else {
								final int i_652_ = (((i_644_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_653_ = (((i_644_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_654_ = (((i_644_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								is_625_[i_624_] = (i_652_ | i_653_ | i_654_) >>> 8;
							}
						} else if (i_626_ == 3) {
							int i_655_ = (anIntArray6212[i_623_]);
							final int i_656_ = Class332_Sub3.anInt5432;
							final int i_657_ = i_655_ + i_656_;
							final int i_658_ = (i_655_ & 0xff00ff)
									+ (i_656_ & 0xff00ff);
							int i_659_ = ((i_658_ & 0x1000100) + (i_657_
									- i_658_ & 0x10000));
							i_659_ = i_657_ - i_659_ | i_659_ - (i_659_ >>> 8);
							final int i_660_ = ((i_655_ >>> 24)
									* Class332_Sub3.anInt5449 >> 8);
							final int i_661_ = 256 - i_660_;
							if (i_660_ != 255) {
								i_655_ = i_659_;
								i_659_ = is_625_[i_624_];
								i_659_ = ((((i_655_ & 0xff00ff) * i_660_ + (i_659_ & 0xff00ff)
										* i_661_) & ~0xff00ff) + (((i_655_ & 0xff00)
										* i_660_ + (i_659_ & 0xff00) * i_661_) & 0xff0000)) >> 8;
							}
							is_625_[i_624_] = i_659_;
						} else if (i_626_ == 2) {
							int i_662_ = (anIntArray6212[i_623_]);
							final int i_663_ = i_662_ >>> 24;
							final int i_664_ = 256 - i_663_;
							final int i_665_ = (((i_662_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
							final int i_666_ = ((i_662_ & 0xff00)
									* Class332_Sub3.anInt5449 & 0xff0000);
							i_662_ = (((i_665_ | i_666_) >>> 8) + Class332_Sub3.anInt5440);
							final int i_667_ = is_625_[i_624_];
							is_625_[i_624_] = ((((i_662_ & 0xff00ff) * i_663_ + (i_667_ & 0xff00ff)
									* i_664_) & ~0xff00ff) + (((i_662_ & 0xff00)
									* i_663_ + (i_667_ & 0xff00) * i_664_) & 0xff0000)) >> 8;
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_627_ == 2) {
						if (i_626_ == 1) {
							final int i_668_ = (anIntArray6212[i_623_]);
							int i_669_ = is_625_[i_624_];
							final int i_670_ = i_668_ + i_669_;
							final int i_671_ = (i_668_ & 0xff00ff)
									+ (i_669_ & 0xff00ff);
							i_669_ = (i_671_ & 0x1000100)
									+ (i_670_ - i_671_ & 0x10000);
							is_625_[i_624_] = i_670_ - i_669_ | i_669_
									- (i_669_ >>> 8);
						} else if (i_626_ == 0) {
							int i_672_ = (anIntArray6212[i_623_]);
							final int i_673_ = (((i_672_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
							final int i_674_ = ((i_672_ & 0xff00)
									* Class332_Sub3.anInt5457 & 0xff0000);
							final int i_675_ = ((i_672_ & 0xff)
									* Class332_Sub3.anInt5427 & 0xff00);
							i_672_ = (i_673_ | i_674_ | i_675_) >>> 8;
							int i_676_ = is_625_[i_624_];
							final int i_677_ = i_672_ + i_676_;
							final int i_678_ = (i_672_ & 0xff00ff)
									+ (i_676_ & 0xff00ff);
							i_676_ = (i_678_ & 0x1000100)
									+ (i_677_ - i_678_ & 0x10000);
							is_625_[i_624_] = i_677_ - i_676_ | i_676_
									- (i_676_ >>> 8);
						} else if (i_626_ == 3) {
							int i_679_ = (anIntArray6212[i_623_]);
							final int i_680_ = Class332_Sub3.anInt5432;
							int i_681_ = i_679_ + i_680_;
							int i_682_ = (i_679_ & 0xff00ff)
									+ (i_680_ & 0xff00ff);
							int i_683_ = ((i_682_ & 0x1000100) + (i_681_
									- i_682_ & 0x10000));
							i_679_ = i_681_ - i_683_ | i_683_ - (i_683_ >>> 8);
							i_683_ = is_625_[i_624_];
							i_681_ = i_679_ + i_683_;
							i_682_ = (i_679_ & 0xff00ff) + (i_683_ & 0xff00ff);
							i_683_ = (i_682_ & 0x1000100)
									+ (i_681_ - i_682_ & 0x10000);
							is_625_[i_624_] = i_681_ - i_683_ | i_683_
									- (i_683_ >>> 8);
						} else if (i_626_ == 2) {
							int i_684_ = (anIntArray6212[i_623_]);
							final int i_685_ = (((i_684_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
							final int i_686_ = ((i_684_ & 0xff00)
									* Class332_Sub3.anInt5449 & 0xff0000);
							i_684_ = (((i_685_ | i_686_) >>> 8) + Class332_Sub3.anInt5440);
							int i_687_ = is_625_[i_624_];
							final int i_688_ = i_684_ + i_687_;
							final int i_689_ = (i_684_ & 0xff00ff)
									+ (i_687_ & 0xff00ff);
							i_687_ = (i_689_ & 0x1000100)
									+ (i_688_ - i_689_ & 0x10000);
							is_625_[i_624_] = i_688_ - i_687_ | i_687_
									- (i_687_ >>> 8);
						}
					} else {
						throw new IllegalArgumentException();
					}
					i_618_ += Class332_Sub3.anInt5444;
					i_619_ += Class332_Sub3.anInt5436;
				}
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		}
	}

	@Override
	final void method3745(int i, int i_690_, int i_691_, int i_692_,
			final int i_693_, int i_694_, final int i_695_, final int i_696_) {
		if (((Class332_Sub3) this).aHa_Sub2_5434.method1920()) {
			throw new IllegalStateException();
		}
		if (i_691_ > 0 && i_692_ > 0) {
			int i_697_ = 0;
			int i_698_ = 0;
			final int i_699_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4505;
			final int i_700_ = (((Class332_Sub3) this).anInt5446
					+ ((Class332_Sub3) this).anInt5433 + ((Class332_Sub3) this).anInt5455);
			final int i_701_ = (((Class332_Sub3) this).anInt5439
					+ ((Class332_Sub3) this).anInt5454 + ((Class332_Sub3) this).anInt5447);
			final int i_702_ = (i_700_ << 16) / i_691_;
			final int i_703_ = (i_701_ << 16) / i_692_;
			if (((Class332_Sub3) this).anInt5446 > 0) {
				final int i_704_ = (((((Class332_Sub3) this).anInt5446 << 16)
						+ i_702_ - 1) / i_702_);
				i += i_704_;
				i_697_ += i_704_ * i_702_
						- (((Class332_Sub3) this).anInt5446 << 16);
			}
			if (((Class332_Sub3) this).anInt5439 > 0) {
				final int i_705_ = (((((Class332_Sub3) this).anInt5439 << 16)
						+ i_703_ - 1) / i_703_);
				i_690_ += i_705_;
				i_698_ += i_705_ * i_703_
						- (((Class332_Sub3) this).anInt5439 << 16);
			}
			if (((Class332_Sub3) this).anInt5433 < i_700_) {
				i_691_ = ((((Class332_Sub3) this).anInt5433 << 16) - i_697_
						+ i_702_ - 1)
						/ i_702_;
			}
			if (((Class332_Sub3) this).anInt5454 < i_701_) {
				i_692_ = ((((Class332_Sub3) this).anInt5454 << 16) - i_698_
						+ i_703_ - 1)
						/ i_703_;
			}
			int i_706_ = i + i_690_ * i_699_;
			int i_707_ = i_699_ - i_691_;
			if (i_690_ + i_692_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4492) {
				i_692_ -= (i_690_ + i_692_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4492));
			}
			if (i_690_ < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) {
				final int i_708_ = ((((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) - i_690_);
				i_692_ -= i_708_;
				i_706_ += i_708_ * i_699_;
				i_698_ += i_703_ * i_708_;
			}
			if (i + i_691_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4507) {
				final int i_709_ = (i + i_691_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4507));
				i_691_ -= i_709_;
				i_707_ += i_709_;
			}
			if (i < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) {
				final int i_710_ = ((((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) - i);
				i_691_ -= i_710_;
				i_706_ += i_710_;
				i_697_ += i_702_ * i_710_;
				i_707_ += i_710_;
			}
			final int[] is = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			if (i_695_ == 0) {
				if (i_693_ == 1) {
					final int i_711_ = i_697_;
					for (int i_712_ = -i_692_; i_712_ < 0; i_712_++) {
						final int i_713_ = ((i_698_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_714_ = -i_691_; i_714_ < 0; i_714_++) {
							is[i_706_++] = (anIntArray6212[(i_697_ >> 16)
									+ i_713_]);
							i_697_ += i_702_;
						}
						i_698_ += i_703_;
						i_697_ = i_711_;
						i_706_ += i_707_;
					}
					return;
				}
				if (i_693_ == 0) {
					final int i_715_ = (i_694_ & 0xff0000) >> 16;
					final int i_716_ = (i_694_ & 0xff00) >> 8;
					final int i_717_ = i_694_ & 0xff;
					final int i_718_ = i_697_;
					for (int i_719_ = -i_692_; i_719_ < 0; i_719_++) {
						final int i_720_ = ((i_698_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_721_ = -i_691_; i_721_ < 0; i_721_++) {
							final int i_722_ = (anIntArray6212[(i_697_ >> 16)
									+ i_720_]);
							final int i_723_ = (i_722_ & 0xff0000) * i_715_
									& ~0xffffff;
							final int i_724_ = (i_722_ & 0xff00) * i_716_
									& 0xff0000;
							final int i_725_ = (i_722_ & 0xff) * i_717_
									& 0xff00;
							is[i_706_++] = (i_723_ | i_724_ | i_725_) >>> 8;
							i_697_ += i_702_;
						}
						i_698_ += i_703_;
						i_697_ = i_718_;
						i_706_ += i_707_;
					}
					return;
				}
				if (i_693_ == 3) {
					final int i_726_ = i_697_;
					for (int i_727_ = -i_692_; i_727_ < 0; i_727_++) {
						final int i_728_ = ((i_698_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_729_ = -i_691_; i_729_ < 0; i_729_++) {
							final int i_730_ = (anIntArray6212[(i_697_ >> 16)
									+ i_728_]);
							final int i_731_ = i_730_ + i_694_;
							final int i_732_ = (i_730_ & 0xff00ff)
									+ (i_694_ & 0xff00ff);
							final int i_733_ = ((i_732_ & 0x1000100) + (i_731_
									- i_732_ & 0x10000));
							is[i_706_++] = i_731_ - i_733_ | i_733_
									- (i_733_ >>> 8);
							i_697_ += i_702_;
						}
						i_698_ += i_703_;
						i_697_ = i_726_;
						i_706_ += i_707_;
					}
					return;
				}
				if (i_693_ == 2) {
					final int i_734_ = i_694_ >>> 24;
					final int i_735_ = 256 - i_734_;
					int i_736_ = (i_694_ & 0xff00ff) * i_735_ & ~0xff00ff;
					int i_737_ = (i_694_ & 0xff00) * i_735_ & 0xff0000;
					i_694_ = (i_736_ | i_737_) >>> 8;
					final int i_738_ = i_697_;
					for (int i_739_ = -i_692_; i_739_ < 0; i_739_++) {
						final int i_740_ = ((i_698_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_741_ = -i_691_; i_741_ < 0; i_741_++) {
							final int i_742_ = (anIntArray6212[(i_697_ >> 16)
									+ i_740_]);
							i_736_ = (i_742_ & 0xff00ff) * i_734_ & ~0xff00ff;
							i_737_ = (i_742_ & 0xff00) * i_734_ & 0xff0000;
							is[i_706_++] = ((i_736_ | i_737_) >>> 8) + i_694_;
							i_697_ += i_702_;
						}
						i_698_ += i_703_;
						i_697_ = i_738_;
						i_706_ += i_707_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_695_ == 1) {
				if (i_693_ == 1) {
					final int i_743_ = i_697_;
					for (int i_744_ = -i_692_; i_744_ < 0; i_744_++) {
						final int i_745_ = ((i_698_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_746_ = -i_691_; i_746_ < 0; i_746_++) {
							final int i_747_ = (anIntArray6212[(i_697_ >> 16)
									+ i_745_]);
							final int i_748_ = i_747_ >>> 24;
							final int i_749_ = 256 - i_748_;
							final int i_750_ = is[i_706_];
							is[i_706_++] = (((((i_747_ & 0xff00ff) * i_748_ + (i_750_ & 0xff00ff)
									* i_749_) & ~0xff00ff) >> 8) + ((((i_747_ & ~0xff00ff) >>> 8)
									* i_748_ + ((i_750_ & ~0xff00ff) >>> 8)
									* i_749_) & ~0xff00ff));
							i_697_ += i_702_;
						}
						i_698_ += i_703_;
						i_697_ = i_743_;
						i_706_ += i_707_;
					}
					return;
				}
				if (i_693_ == 0) {
					final int i_751_ = i_697_;
					if ((i_694_ & 0xffffff) == 16777215) {
						for (int i_752_ = -i_692_; i_752_ < 0; i_752_++) {
							final int i_753_ = ((i_698_ >> 16) * ((Class332_Sub3) this).anInt5433);
							for (int i_754_ = -i_691_; i_754_ < 0; i_754_++) {
								final int i_755_ = (anIntArray6212[(i_697_ >> 16)
										+ i_753_]);
								final int i_756_ = (i_755_ >>> 24)
										* (i_694_ >>> 24) >> 8;
								final int i_757_ = 256 - i_756_;
								final int i_758_ = is[i_706_];
								is[i_706_++] = ((((i_755_ & 0xff00ff) * i_756_ + (i_758_ & 0xff00ff)
										* i_757_) & ~0xff00ff) + (((i_755_ & 0xff00)
										* i_756_ + (i_758_ & 0xff00) * i_757_) & 0xff0000)) >> 8;
								i_697_ += i_702_;
							}
							i_698_ += i_703_;
							i_697_ = i_751_;
							i_706_ += i_707_;
						}
					} else {
						final int i_759_ = (i_694_ & 0xff0000) >> 16;
						final int i_760_ = (i_694_ & 0xff00) >> 8;
						final int i_761_ = i_694_ & 0xff;
						for (int i_762_ = -i_692_; i_762_ < 0; i_762_++) {
							final int i_763_ = ((i_698_ >> 16) * ((Class332_Sub3) this).anInt5433);
							for (int i_764_ = -i_691_; i_764_ < 0; i_764_++) {
								int i_765_ = (anIntArray6212[(i_697_ >> 16)
										+ i_763_]);
								final int i_766_ = (i_765_ >>> 24)
										* (i_694_ >>> 24) >> 8;
								final int i_767_ = 256 - i_766_;
								if (i_766_ != 255) {
									final int i_768_ = ((i_765_ & 0xff0000)
											* i_759_ & ~0xffffff);
									final int i_769_ = ((i_765_ & 0xff00)
											* i_760_ & 0xff0000);
									final int i_770_ = (i_765_ & 0xff) * i_761_
											& 0xff00;
									i_765_ = (i_768_ | i_769_ | i_770_) >>> 8;
									final int i_771_ = is[i_706_];
									is[i_706_++] = ((((i_765_ & 0xff00ff)
											* i_766_ + (i_771_ & 0xff00ff)
											* i_767_) & ~0xff00ff) + (((i_765_ & 0xff00)
											* i_766_ + (i_771_ & 0xff00)
											* i_767_) & 0xff0000)) >> 8;
								} else {
									final int i_772_ = ((i_765_ & 0xff0000)
											* i_759_ & ~0xffffff);
									final int i_773_ = ((i_765_ & 0xff00)
											* i_760_ & 0xff0000);
									final int i_774_ = (i_765_ & 0xff) * i_761_
											& 0xff00;
									is[i_706_++] = (i_772_ | i_773_ | i_774_) >>> 8;
								}
								i_697_ += i_702_;
							}
							i_698_ += i_703_;
							i_697_ = i_751_;
							i_706_ += i_707_;
						}
						return;
					}
					return;
				}
				if (i_693_ == 3) {
					final int i_775_ = i_697_;
					for (int i_776_ = -i_692_; i_776_ < 0; i_776_++) {
						final int i_777_ = ((i_698_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_778_ = -i_691_; i_778_ < 0; i_778_++) {
							int i_779_ = (anIntArray6212[(i_697_ >> 16)
									+ i_777_]);
							final int i_780_ = i_779_ + i_694_;
							final int i_781_ = (i_779_ & 0xff00ff)
									+ (i_694_ & 0xff00ff);
							int i_782_ = ((i_781_ & 0x1000100) + (i_780_
									- i_781_ & 0x10000));
							i_782_ = i_780_ - i_782_ | i_782_ - (i_782_ >>> 8);
							final int i_783_ = (i_782_ >>> 24)
									* (i_694_ >>> 24) >> 8;
							final int i_784_ = 256 - i_783_;
							if (i_783_ != 255) {
								i_779_ = i_782_;
								i_782_ = is[i_706_];
								i_782_ = ((((i_779_ & 0xff00ff) * i_783_ + (i_782_ & 0xff00ff)
										* i_784_) & ~0xff00ff) + (((i_779_ & 0xff00)
										* i_783_ + (i_782_ & 0xff00) * i_784_) & 0xff0000)) >> 8;
							}
							is[i_706_++] = i_782_;
							i_697_ += i_702_;
						}
						i_698_ += i_703_;
						i_697_ = i_775_;
						i_706_ += i_707_;
					}
					return;
				}
				if (i_693_ == 2) {
					final int i_785_ = i_694_ >>> 24;
					final int i_786_ = 256 - i_785_;
					int i_787_ = (i_694_ & 0xff00ff) * i_786_ & ~0xff00ff;
					int i_788_ = (i_694_ & 0xff00) * i_786_ & 0xff0000;
					i_694_ = (i_787_ | i_788_) >>> 8;
					final int i_789_ = i_697_;
					for (int i_790_ = -i_692_; i_790_ < 0; i_790_++) {
						final int i_791_ = ((i_698_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_792_ = -i_691_; i_792_ < 0; i_792_++) {
							int i_793_ = (anIntArray6212[(i_697_ >> 16)
									+ i_791_]);
							final int i_794_ = i_793_ >>> 24;
							final int i_795_ = 256 - i_794_;
							i_787_ = (i_793_ & 0xff00ff) * i_785_ & ~0xff00ff;
							i_788_ = (i_793_ & 0xff00) * i_785_ & 0xff0000;
							i_793_ = ((i_787_ | i_788_) >>> 8) + i_694_;
							final int i_796_ = is[i_706_];
							is[i_706_++] = ((((i_793_ & 0xff00ff) * i_794_ + (i_796_ & 0xff00ff)
									* i_795_) & ~0xff00ff) + (((i_793_ & 0xff00)
									* i_794_ + (i_796_ & 0xff00) * i_795_) & 0xff0000)) >> 8;
							i_697_ += i_702_;
						}
						i_698_ += i_703_;
						i_697_ = i_789_;
						i_706_ += i_707_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_695_ == 2) {
				if (i_693_ == 1) {
					final int i_797_ = i_697_;
					for (int i_798_ = -i_692_; i_798_ < 0; i_798_++) {
						final int i_799_ = ((i_698_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_800_ = -i_691_; i_800_ < 0; i_800_++) {
							final int i_801_ = (anIntArray6212[(i_697_ >> 16)
									+ i_799_]);
							if (i_801_ != 0) {
								int i_802_ = is[i_706_];
								final int i_803_ = i_801_ + i_802_;
								final int i_804_ = ((i_801_ & 0xff00ff) + (i_802_ & 0xff00ff));
								i_802_ = (i_804_ & 0x1000100)
										+ (i_803_ - i_804_ & 0x10000);
								is[i_706_++] = i_803_ - i_802_ | i_802_
										- (i_802_ >>> 8);
							} else {
								i_706_++;
							}
							i_697_ += i_702_;
						}
						i_698_ += i_703_;
						i_697_ = i_797_;
						i_706_ += i_707_;
					}
					return;
				}
				if (i_693_ == 0) {
					final int i_805_ = i_697_;
					final int i_806_ = (i_694_ & 0xff0000) >> 16;
					final int i_807_ = (i_694_ & 0xff00) >> 8;
					final int i_808_ = i_694_ & 0xff;
					for (int i_809_ = -i_692_; i_809_ < 0; i_809_++) {
						final int i_810_ = ((i_698_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_811_ = -i_691_; i_811_ < 0; i_811_++) {
							int i_812_ = (anIntArray6212[(i_697_ >> 16)
									+ i_810_]);
							if (i_812_ != 0) {
								final int i_813_ = (i_812_ & 0xff0000) * i_806_
										& ~0xffffff;
								final int i_814_ = (i_812_ & 0xff00) * i_807_
										& 0xff0000;
								final int i_815_ = (i_812_ & 0xff) * i_808_
										& 0xff00;
								i_812_ = (i_813_ | i_814_ | i_815_) >>> 8;
								int i_816_ = is[i_706_];
								final int i_817_ = i_812_ + i_816_;
								final int i_818_ = ((i_812_ & 0xff00ff) + (i_816_ & 0xff00ff));
								i_816_ = (i_818_ & 0x1000100)
										+ (i_817_ - i_818_ & 0x10000);
								is[i_706_++] = i_817_ - i_816_ | i_816_
										- (i_816_ >>> 8);
							} else {
								i_706_++;
							}
							i_697_ += i_702_;
						}
						i_698_ += i_703_;
						i_697_ = i_805_;
						i_706_ += i_707_;
					}
					return;
				}
				if (i_693_ == 3) {
					final int i_819_ = i_697_;
					for (int i_820_ = -i_692_; i_820_ < 0; i_820_++) {
						final int i_821_ = ((i_698_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_822_ = -i_691_; i_822_ < 0; i_822_++) {
							int i_823_ = (anIntArray6212[(i_697_ >> 16)
									+ i_821_]);
							int i_824_ = i_823_ + i_694_;
							int i_825_ = (i_823_ & 0xff00ff)
									+ (i_694_ & 0xff00ff);
							int i_826_ = ((i_825_ & 0x1000100) + (i_824_
									- i_825_ & 0x10000));
							i_823_ = i_824_ - i_826_ | i_826_ - (i_826_ >>> 8);
							i_826_ = is[i_706_];
							i_824_ = i_823_ + i_826_;
							i_825_ = (i_823_ & 0xff00ff) + (i_826_ & 0xff00ff);
							i_826_ = (i_825_ & 0x1000100)
									+ (i_824_ - i_825_ & 0x10000);
							is[i_706_++] = i_824_ - i_826_ | i_826_
									- (i_826_ >>> 8);
							i_697_ += i_702_;
						}
						i_698_ += i_703_;
						i_697_ = i_819_;
						i_706_ += i_707_;
					}
					return;
				}
				if (i_693_ == 2) {
					final int i_827_ = i_694_ >>> 24;
					final int i_828_ = 256 - i_827_;
					int i_829_ = (i_694_ & 0xff00ff) * i_828_ & ~0xff00ff;
					int i_830_ = (i_694_ & 0xff00) * i_828_ & 0xff0000;
					i_694_ = (i_829_ | i_830_) >>> 8;
					final int i_831_ = i_697_;
					for (int i_832_ = -i_692_; i_832_ < 0; i_832_++) {
						final int i_833_ = ((i_698_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_834_ = -i_691_; i_834_ < 0; i_834_++) {
							int i_835_ = (anIntArray6212[(i_697_ >> 16)
									+ i_833_]);
							if (i_835_ != 0) {
								i_829_ = (i_835_ & 0xff00ff) * i_827_
										& ~0xff00ff;
								i_830_ = (i_835_ & 0xff00) * i_827_ & 0xff0000;
								i_835_ = ((i_829_ | i_830_) >>> 8) + i_694_;
								int i_836_ = is[i_706_];
								final int i_837_ = i_835_ + i_836_;
								final int i_838_ = ((i_835_ & 0xff00ff) + (i_836_ & 0xff00ff));
								i_836_ = (i_838_ & 0x1000100)
										+ (i_837_ - i_838_ & 0x10000);
								is[i_706_++] = i_837_ - i_836_ | i_836_
										- (i_836_ >>> 8);
							} else {
								i_706_++;
							}
							i_697_ += i_702_;
						}
						i_698_ += i_703_;
						i_697_ = i_831_;
						i_706_ += i_707_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	Class332_Sub3_Sub1(final ha_Sub2 var_ha_Sub2, final int[] is, int i,
			int i_839_, final int i_840_, final int i_841_, final boolean bool) {
		super(var_ha_Sub2, i_840_, i_841_);
		if (bool) {
			anIntArray6212 = new int[i_840_ * i_841_];
		} else {
			anIntArray6212 = is;
		}
		i_839_ -= ((Class332_Sub3) this).anInt5433;
		int i_842_ = 0;
		for (int i_843_ = 0; i_843_ < i_841_; i_843_++) {
			for (int i_844_ = 0; i_844_ < i_840_; i_844_++) {
				anIntArray6212[i_842_++] = is[i++];
			}
			i += i_839_;
		}
	}

	@Override
	final void method3757(int i, int i_845_, final int i_846_, int i_847_,
			int i_848_, final int i_849_, int i_850_, final int i_851_,
			final int i_852_) {
		if (i_847_ > 0 && i_848_ > 0) {
			int i_853_ = 0;
			int i_854_ = 0;
			final int i_855_ = (((Class332_Sub3) this).anInt5446
					+ ((Class332_Sub3) this).anInt5433 + ((Class332_Sub3) this).anInt5455);
			final int i_856_ = (((Class332_Sub3) this).anInt5439
					+ ((Class332_Sub3) this).anInt5454 + ((Class332_Sub3) this).anInt5447);
			final int i_857_ = (i_855_ << 16) / i_847_;
			final int i_858_ = (i_856_ << 16) / i_848_;
			if (((Class332_Sub3) this).anInt5446 > 0) {
				final int i_859_ = (((((Class332_Sub3) this).anInt5446 << 16)
						+ i_857_ - 1) / i_857_);
				i += i_859_;
				i_853_ += i_859_ * i_857_
						- (((Class332_Sub3) this).anInt5446 << 16);
			}
			if (((Class332_Sub3) this).anInt5439 > 0) {
				final int i_860_ = (((((Class332_Sub3) this).anInt5439 << 16)
						+ i_858_ - 1) / i_858_);
				i_845_ += i_860_;
				i_854_ += i_860_ * i_858_
						- (((Class332_Sub3) this).anInt5439 << 16);
			}
			if (((Class332_Sub3) this).anInt5433 < i_855_) {
				i_847_ = ((((Class332_Sub3) this).anInt5433 << 16) - i_853_
						+ i_857_ - 1)
						/ i_857_;
			}
			if (((Class332_Sub3) this).anInt5454 < i_856_) {
				i_848_ = ((((Class332_Sub3) this).anInt5454 << 16) - i_854_
						+ i_858_ - 1)
						/ i_858_;
			}
			int i_861_ = i + i_845_
					* (((Class332_Sub3) this).aHa_Sub2_5434).anInt4505;
			int i_862_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4505 - i_847_);
			if (i_845_ + i_848_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4492) {
				i_848_ -= (i_845_ + i_848_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4492));
			}
			if (i_845_ < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) {
				final int i_863_ = ((((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) - i_845_);
				i_848_ -= i_863_;
				i_861_ += i_863_
						* (((Class332_Sub3) this).aHa_Sub2_5434).anInt4505;
				i_854_ += i_858_ * i_863_;
			}
			if (i + i_847_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4507) {
				final int i_864_ = (i + i_847_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4507));
				i_847_ -= i_864_;
				i_862_ += i_864_;
			}
			if (i < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) {
				final int i_865_ = ((((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) - i);
				i_847_ -= i_865_;
				i_861_ += i_865_;
				i_853_ += i_857_ * i_865_;
				i_862_ += i_865_;
			}
			final float[] fs = (((Class332_Sub3) this).aHa_Sub2_5434.aFloatArray4487);
			final int[] is = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			if (i_851_ == 0) {
				if (i_849_ == 1) {
					final int i_866_ = i_853_;
					for (int i_867_ = -i_848_; i_867_ < 0; i_867_++) {
						final int i_868_ = ((i_854_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_869_ = -i_847_; i_869_ < 0; i_869_++) {
							if (i_846_ < fs[i_861_]) {
								is[i_861_] = (anIntArray6212[(i_853_ >> 16)
										+ i_868_]);
								fs[i_861_] = i_846_;
							}
							i_853_ += i_857_;
							i_861_++;
						}
						i_854_ += i_858_;
						i_853_ = i_866_;
						i_861_ += i_862_;
					}
					return;
				}
				if (i_849_ == 0) {
					final int i_870_ = (i_850_ & 0xff0000) >> 16;
					final int i_871_ = (i_850_ & 0xff00) >> 8;
					final int i_872_ = i_850_ & 0xff;
					final int i_873_ = i_853_;
					for (int i_874_ = -i_848_; i_874_ < 0; i_874_++) {
						final int i_875_ = ((i_854_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_876_ = -i_847_; i_876_ < 0; i_876_++) {
							if (i_846_ < fs[i_861_]) {
								final int i_877_ = (anIntArray6212[(i_853_ >> 16)
										+ i_875_]);
								final int i_878_ = (i_877_ & 0xff0000) * i_870_
										& ~0xffffff;
								final int i_879_ = (i_877_ & 0xff00) * i_871_
										& 0xff0000;
								final int i_880_ = (i_877_ & 0xff) * i_872_
										& 0xff00;
								is[i_861_] = (i_878_ | i_879_ | i_880_) >>> 8;
								fs[i_861_] = i_846_;
							}
							i_853_ += i_857_;
							i_861_++;
						}
						i_854_ += i_858_;
						i_853_ = i_873_;
						i_861_ += i_862_;
					}
					return;
				}
				if (i_849_ == 3) {
					final int i_881_ = i_853_;
					for (int i_882_ = -i_848_; i_882_ < 0; i_882_++) {
						final int i_883_ = ((i_854_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_884_ = -i_847_; i_884_ < 0; i_884_++) {
							if (i_846_ < fs[i_861_]) {
								final int i_885_ = (anIntArray6212[(i_853_ >> 16)
										+ i_883_]);
								final int i_886_ = i_885_ + i_850_;
								final int i_887_ = ((i_885_ & 0xff00ff) + (i_850_ & 0xff00ff));
								final int i_888_ = ((i_887_ & 0x1000100) + (i_886_
										- i_887_ & 0x10000));
								is[i_861_] = i_886_ - i_888_ | i_888_
										- (i_888_ >>> 8);
								fs[i_861_] = i_846_;
							}
							i_853_ += i_857_;
							i_861_++;
						}
						i_854_ += i_858_;
						i_853_ = i_881_;
						i_861_ += i_862_;
					}
					return;
				}
				if (i_849_ == 2) {
					final int i_889_ = i_850_ >>> 24;
					final int i_890_ = 256 - i_889_;
					int i_891_ = (i_850_ & 0xff00ff) * i_890_ & ~0xff00ff;
					int i_892_ = (i_850_ & 0xff00) * i_890_ & 0xff0000;
					i_850_ = (i_891_ | i_892_) >>> 8;
					final int i_893_ = i_853_;
					for (int i_894_ = -i_848_; i_894_ < 0; i_894_++) {
						final int i_895_ = ((i_854_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_896_ = -i_847_; i_896_ < 0; i_896_++) {
							if (i_846_ < fs[i_861_]) {
								final int i_897_ = (anIntArray6212[(i_853_ >> 16)
										+ i_895_]);
								i_891_ = (i_897_ & 0xff00ff) * i_889_
										& ~0xff00ff;
								i_892_ = (i_897_ & 0xff00) * i_889_ & 0xff0000;
								is[i_861_] = ((i_891_ | i_892_) >>> 8) + i_850_;
								fs[i_861_] = i_846_;
							}
							i_853_ += i_857_;
							i_861_++;
						}
						i_854_ += i_858_;
						i_853_ = i_893_;
						i_861_ += i_862_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_851_ == 1) {
				if (i_849_ == 1) {
					final int i_898_ = i_853_;
					for (int i_899_ = -i_848_; i_899_ < 0; i_899_++) {
						final int i_900_ = ((i_854_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_901_ = -i_847_; i_901_ < 0; i_901_++) {
							if (i_846_ < fs[i_861_]) {
								final int i_902_ = (anIntArray6212[(i_853_ >> 16)
										+ i_900_]);
								final int i_903_ = i_902_ >>> 24;
								final int i_904_ = 256 - i_903_;
								final int i_905_ = is[i_861_];
								is[i_861_] = (((((i_902_ & 0xff00ff) * i_903_ + (i_905_ & 0xff00ff)
										* i_904_) & ~0xff00ff) >> 8) + (((((i_902_ & ~0xff00ff) >>> 8) * i_903_) + (((i_905_ & ~0xff00ff) >>> 8) * i_904_)) & ~0xff00ff));
								fs[i_861_] = i_846_;
							}
							i_853_ += i_857_;
							i_861_++;
						}
						i_854_ += i_858_;
						i_853_ = i_898_;
						i_861_ += i_862_;
					}
					return;
				}
				if (i_849_ == 0) {
					final int i_906_ = i_853_;
					if ((i_850_ & 0xffffff) == 16777215) {
						for (int i_907_ = -i_848_; i_907_ < 0; i_907_++) {
							final int i_908_ = ((i_854_ >> 16) * ((Class332_Sub3) this).anInt5433);
							for (int i_909_ = -i_847_; i_909_ < 0; i_909_++) {
								if (i_846_ < fs[i_861_]) {
									final int i_910_ = (anIntArray6212[(i_853_ >> 16)
											+ i_908_]);
									final int i_911_ = ((i_910_ >>> 24)
											* (i_850_ >>> 24) >> 8);
									final int i_912_ = 256 - i_911_;
									final int i_913_ = is[i_861_];
									is[i_861_] = ((((i_910_ & 0xff00ff)
											* i_911_ + (i_913_ & 0xff00ff)
											* i_912_) & ~0xff00ff) + (((i_910_ & 0xff00)
											* i_911_ + (i_913_ & 0xff00)
											* i_912_) & 0xff0000)) >> 8;
									fs[i_861_] = i_846_;
								}
								i_853_ += i_857_;
								i_861_++;
							}
							i_854_ += i_858_;
							i_853_ = i_906_;
							i_861_ += i_862_;
						}
					} else {
						final int i_914_ = (i_850_ & 0xff0000) >> 16;
						final int i_915_ = (i_850_ & 0xff00) >> 8;
						final int i_916_ = i_850_ & 0xff;
						for (int i_917_ = -i_848_; i_917_ < 0; i_917_++) {
							final int i_918_ = ((i_854_ >> 16) * ((Class332_Sub3) this).anInt5433);
							for (int i_919_ = -i_847_; i_919_ < 0; i_919_++) {
								if (i_846_ < fs[i_861_]) {
									int i_920_ = (anIntArray6212[(i_853_ >> 16)
											+ i_918_]);
									final int i_921_ = ((i_920_ >>> 24)
											* (i_850_ >>> 24) >> 8);
									final int i_922_ = 256 - i_921_;
									if (i_921_ != 255) {
										final int i_923_ = ((i_920_ & 0xff0000)
												* i_914_ & ~0xffffff);
										final int i_924_ = ((i_920_ & 0xff00)
												* i_915_ & 0xff0000);
										final int i_925_ = ((i_920_ & 0xff)
												* i_916_ & 0xff00);
										i_920_ = (i_923_ | i_924_ | i_925_) >>> 8;
										final int i_926_ = is[i_861_];
										is[i_861_] = ((((i_920_ & 0xff00ff)
												* i_921_ + ((i_926_ & 0xff00ff) * i_922_)) & ~0xff00ff) + (((i_920_ & 0xff00)
												* i_921_ + ((i_926_ & 0xff00) * i_922_)) & 0xff0000)) >> 8;
										fs[i_861_] = i_846_;
									} else {
										final int i_927_ = ((i_920_ & 0xff0000)
												* i_914_ & ~0xffffff);
										final int i_928_ = ((i_920_ & 0xff00)
												* i_915_ & 0xff0000);
										final int i_929_ = ((i_920_ & 0xff)
												* i_916_ & 0xff00);
										is[i_861_] = (i_927_ | i_928_ | i_929_) >>> 8;
										fs[i_861_] = i_846_;
									}
								}
								i_853_ += i_857_;
								i_861_++;
							}
							i_854_ += i_858_;
							i_853_ = i_906_;
							i_861_ += i_862_;
						}
						return;
					}
					return;
				}
				if (i_849_ == 3) {
					final int i_930_ = i_853_;
					for (int i_931_ = -i_848_; i_931_ < 0; i_931_++) {
						final int i_932_ = ((i_854_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_933_ = -i_847_; i_933_ < 0; i_933_++) {
							if (i_846_ < fs[i_861_]) {
								int i_934_ = (anIntArray6212[(i_853_ >> 16)
										+ i_932_]);
								final int i_935_ = i_934_ + i_850_;
								final int i_936_ = ((i_934_ & 0xff00ff) + (i_850_ & 0xff00ff));
								int i_937_ = ((i_936_ & 0x1000100) + (i_935_
										- i_936_ & 0x10000));
								i_937_ = i_935_ - i_937_ | i_937_
										- (i_937_ >>> 8);
								final int i_938_ = (i_937_ >>> 24)
										* (i_850_ >>> 24) >> 8;
								final int i_939_ = 256 - i_938_;
								if (i_938_ != 255) {
									i_934_ = i_937_;
									i_937_ = is[i_861_];
									i_937_ = ((((i_934_ & 0xff00ff) * i_938_ + (i_937_ & 0xff00ff)
											* i_939_) & ~0xff00ff) + (((i_934_ & 0xff00)
											* i_938_ + (i_937_ & 0xff00)
											* i_939_) & 0xff0000)) >> 8;
								}
								is[i_861_] = i_937_;
								fs[i_861_] = i_846_;
							}
							i_853_ += i_857_;
							i_861_++;
						}
						i_854_ += i_858_;
						i_853_ = i_930_;
						i_861_ += i_862_;
					}
					return;
				}
				if (i_849_ == 2) {
					final int i_940_ = i_850_ >>> 24;
					final int i_941_ = 256 - i_940_;
					int i_942_ = (i_850_ & 0xff00ff) * i_941_ & ~0xff00ff;
					int i_943_ = (i_850_ & 0xff00) * i_941_ & 0xff0000;
					i_850_ = (i_942_ | i_943_) >>> 8;
					final int i_944_ = i_853_;
					for (int i_945_ = -i_848_; i_945_ < 0; i_945_++) {
						final int i_946_ = ((i_854_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_947_ = -i_847_; i_947_ < 0; i_947_++) {
							if (i_846_ < fs[i_861_]) {
								int i_948_ = (anIntArray6212[(i_853_ >> 16)
										+ i_946_]);
								final int i_949_ = i_948_ >>> 24;
								final int i_950_ = 256 - i_949_;
								i_942_ = (i_948_ & 0xff00ff) * i_940_
										& ~0xff00ff;
								i_943_ = (i_948_ & 0xff00) * i_940_ & 0xff0000;
								i_948_ = ((i_942_ | i_943_) >>> 8) + i_850_;
								final int i_951_ = is[i_861_];
								is[i_861_] = ((((i_948_ & 0xff00ff) * i_949_ + (i_951_ & 0xff00ff)
										* i_950_) & ~0xff00ff) + (((i_948_ & 0xff00)
										* i_949_ + (i_951_ & 0xff00) * i_950_) & 0xff0000)) >> 8;
								fs[i_861_] = i_846_;
							}
							i_853_ += i_857_;
							i_861_++;
						}
						i_854_ += i_858_;
						i_853_ = i_944_;
						i_861_ += i_862_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_851_ == 2) {
				if (i_849_ == 1) {
					final int i_952_ = i_853_;
					for (int i_953_ = -i_848_; i_953_ < 0; i_953_++) {
						final int i_954_ = ((i_854_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_955_ = -i_847_; i_955_ < 0; i_955_++) {
							if (i_846_ < fs[i_861_]) {
								final int i_956_ = (anIntArray6212[(i_853_ >> 16)
										+ i_954_]);
								if (i_956_ != 0) {
									int i_957_ = is[i_861_];
									final int i_958_ = i_956_ + i_957_;
									final int i_959_ = ((i_956_ & 0xff00ff) + (i_957_ & 0xff00ff));
									i_957_ = ((i_959_ & 0x1000100) + (i_958_
											- i_959_ & 0x10000));
									is[i_861_] = i_958_ - i_957_ | i_957_
											- (i_957_ >>> 8);
									fs[i_861_] = i_846_;
								}
							}
							i_853_ += i_857_;
							i_861_++;
						}
						i_854_ += i_858_;
						i_853_ = i_952_;
						i_861_ += i_862_;
					}
					return;
				}
				if (i_849_ == 0) {
					final int i_960_ = i_853_;
					final int i_961_ = (i_850_ & 0xff0000) >> 16;
					final int i_962_ = (i_850_ & 0xff00) >> 8;
					final int i_963_ = i_850_ & 0xff;
					for (int i_964_ = -i_848_; i_964_ < 0; i_964_++) {
						final int i_965_ = ((i_854_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_966_ = -i_847_; i_966_ < 0; i_966_++) {
							if (i_846_ < fs[i_861_]) {
								int i_967_ = (anIntArray6212[(i_853_ >> 16)
										+ i_965_]);
								if (i_967_ != 0) {
									final int i_968_ = ((i_967_ & 0xff0000)
											* i_961_ & ~0xffffff);
									final int i_969_ = ((i_967_ & 0xff00)
											* i_962_ & 0xff0000);
									final int i_970_ = (i_967_ & 0xff) * i_963_
											& 0xff00;
									i_967_ = (i_968_ | i_969_ | i_970_) >>> 8;
									int i_971_ = is[i_861_];
									final int i_972_ = i_967_ + i_971_;
									final int i_973_ = ((i_967_ & 0xff00ff) + (i_971_ & 0xff00ff));
									i_971_ = ((i_973_ & 0x1000100) + (i_972_
											- i_973_ & 0x10000));
									is[i_861_] = i_972_ - i_971_ | i_971_
											- (i_971_ >>> 8);
									fs[i_861_] = i_846_;
								}
							}
							i_853_ += i_857_;
							i_861_++;
						}
						i_854_ += i_858_;
						i_853_ = i_960_;
						i_861_ += i_862_;
					}
					return;
				}
				if (i_849_ == 3) {
					final int i_974_ = i_853_;
					for (int i_975_ = -i_848_; i_975_ < 0; i_975_++) {
						final int i_976_ = ((i_854_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_977_ = -i_847_; i_977_ < 0; i_977_++) {
							if (i_846_ < fs[i_861_]) {
								int i_978_ = (anIntArray6212[(i_853_ >> 16)
										+ i_976_]);
								int i_979_ = i_978_ + i_850_;
								int i_980_ = ((i_978_ & 0xff00ff) + (i_850_ & 0xff00ff));
								int i_981_ = ((i_980_ & 0x1000100) + (i_979_
										- i_980_ & 0x10000));
								i_978_ = i_979_ - i_981_ | i_981_
										- (i_981_ >>> 8);
								i_981_ = is[i_861_];
								i_979_ = i_978_ + i_981_;
								i_980_ = (i_978_ & 0xff00ff)
										+ (i_981_ & 0xff00ff);
								i_981_ = (i_980_ & 0x1000100)
										+ (i_979_ - i_980_ & 0x10000);
								is[i_861_] = i_979_ - i_981_ | i_981_
										- (i_981_ >>> 8);
								fs[i_861_] = i_846_;
							}
							i_853_ += i_857_;
							i_861_++;
						}
						i_854_ += i_858_;
						i_853_ = i_974_;
						i_861_ += i_862_;
					}
					return;
				}
				if (i_849_ == 2) {
					final int i_982_ = i_850_ >>> 24;
					final int i_983_ = 256 - i_982_;
					int i_984_ = (i_850_ & 0xff00ff) * i_983_ & ~0xff00ff;
					int i_985_ = (i_850_ & 0xff00) * i_983_ & 0xff0000;
					i_850_ = (i_984_ | i_985_) >>> 8;
					final int i_986_ = i_853_;
					for (int i_987_ = -i_848_; i_987_ < 0; i_987_++) {
						final int i_988_ = ((i_854_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_989_ = -i_847_; i_989_ < 0; i_989_++) {
							if (i_846_ < fs[i_861_]) {
								int i_990_ = (anIntArray6212[(i_853_ >> 16)
										+ i_988_]);
								if (i_990_ != 0) {
									i_984_ = ((i_990_ & 0xff00ff) * i_982_ & ~0xff00ff);
									i_985_ = ((i_990_ & 0xff00) * i_982_ & 0xff0000);
									i_990_ = ((i_984_ | i_985_) >>> 8) + i_850_;
									int i_991_ = is[i_861_];
									final int i_992_ = i_990_ + i_991_;
									final int i_993_ = ((i_990_ & 0xff00ff) + (i_991_ & 0xff00ff));
									i_991_ = ((i_993_ & 0x1000100) + (i_992_
											- i_993_ & 0x10000));
									is[i_861_] = i_992_ - i_991_ | i_991_
											- (i_991_ >>> 8);
									fs[i_861_] = i_846_;
								}
							}
							i_853_ += i_857_;
							i_861_++;
						}
						i_854_ += i_858_;
						i_853_ = i_986_;
						i_861_ += i_862_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	Class332_Sub3_Sub1(final ha_Sub2 var_ha_Sub2, final int[] is, final int i,
			final int i_994_) {
		super(var_ha_Sub2, i, i_994_);
		anIntArray6212 = is;
	}

	@Override
	final void method3736(final int i, final int i_995_, final int i_996_,
			final int i_997_, final int i_998_, final int i_999_) {
		final int[] is = ((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504;
		for (int i_1000_ = 0; i_1000_ < i_997_; i_1000_++) {
			final int i_1001_ = (i_995_ + i_1000_) * i_996_ + i;
			final int i_1002_ = (i_999_ + i_1000_) * i_996_ + i_998_;
			for (int i_1003_ = 0; i_1003_ < i_996_; i_1003_++) {
				anIntArray6212[i_1001_ + i_1003_] = is[i_1002_ + i_1003_] & 0xffffff;
			}
		}
	}

	@Override
	final void method3742(final int i, final int i_1004_, final int i_1005_) {
		if (i_1005_ == 0) {
			final int[] is = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			for (int i_1006_ = 0; i_1006_ < ((Class332_Sub3) this).anInt5454; i_1006_++) {
				final int i_1007_ = i_1006_ * ((Class332_Sub3) this).anInt5433;
				final int i_1008_ = (((i_1004_ + i_1006_) * (((Class332_Sub3) this).aHa_Sub2_5434.anInt4505)) + i);
				for (int i_1009_ = 0; i_1009_ < ((Class332_Sub3) this).anInt5433; i_1009_++) {
					anIntArray6212[(i_1007_ + i_1009_)] = ((anIntArray6212[i_1007_
							+ i_1009_]) & 0xffffff | is[i_1008_ + i_1009_] << 8
							& ~0xffffff);
				}
			}
		} else if (i_1005_ == 1) {
			final int[] is = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			for (int i_1010_ = 0; i_1010_ < ((Class332_Sub3) this).anInt5454; i_1010_++) {
				final int i_1011_ = i_1010_ * ((Class332_Sub3) this).anInt5433;
				final int i_1012_ = (((i_1004_ + i_1010_) * (((Class332_Sub3) this).aHa_Sub2_5434.anInt4505)) + i);
				for (int i_1013_ = 0; i_1013_ < ((Class332_Sub3) this).anInt5433; i_1013_++) {
					anIntArray6212[(i_1011_ + i_1013_)] = ((anIntArray6212[i_1011_
							+ i_1013_]) & 0xffffff | is[i_1012_ + i_1013_] << 16
							& ~0xffffff);
				}
			}
		} else if (i_1005_ == 2) {
			final int[] is = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			for (int i_1014_ = 0; i_1014_ < ((Class332_Sub3) this).anInt5454; i_1014_++) {
				final int i_1015_ = i_1014_ * ((Class332_Sub3) this).anInt5433;
				final int i_1016_ = (((i_1004_ + i_1014_) * (((Class332_Sub3) this).aHa_Sub2_5434.anInt4505)) + i);
				for (int i_1017_ = 0; i_1017_ < ((Class332_Sub3) this).anInt5433; i_1017_++) {
					anIntArray6212[(i_1015_ + i_1017_)] = ((anIntArray6212[i_1015_
							+ i_1017_]) & 0xffffff | is[i_1016_ + i_1017_] << 24
							& ~0xffffff);
				}
			}
		} else if (i_1005_ == 3) {
			final int[] is = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			for (int i_1018_ = 0; i_1018_ < ((Class332_Sub3) this).anInt5454; i_1018_++) {
				final int i_1019_ = i_1018_ * ((Class332_Sub3) this).anInt5433;
				final int i_1020_ = (((i_1004_ + i_1018_) * (((Class332_Sub3) this).aHa_Sub2_5434.anInt4505)) + i);
				for (int i_1021_ = 0; i_1021_ < ((Class332_Sub3) this).anInt5433; i_1021_++) {
					anIntArray6212[(i_1019_ + i_1021_)] = ((anIntArray6212[i_1019_
							+ i_1021_]) & 0xffffff | (is[i_1020_ + i_1021_] != 0 ? -16777216
							: 0));
				}
			}
		}
	}

	@Override
	final void method3748(int i, int i_1022_, final int i_1023_, int i_1024_,
			final int i_1025_) {
		if (((Class332_Sub3) this).aHa_Sub2_5434.method1920()) {
			throw new IllegalStateException();
		}
		final int i_1026_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4505;
		i += ((Class332_Sub3) this).anInt5446;
		i_1022_ += ((Class332_Sub3) this).anInt5439;
		int i_1027_ = i_1022_ * i_1026_ + i;
		int i_1028_ = 0;
		int i_1029_ = ((Class332_Sub3) this).anInt5454;
		int i_1030_ = ((Class332_Sub3) this).anInt5433;
		int i_1031_ = i_1026_ - i_1030_;
		int i_1032_ = 0;
		if (i_1022_ < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) {
			final int i_1033_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4495 - i_1022_);
			i_1029_ -= i_1033_;
			i_1022_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495;
			i_1028_ += i_1033_ * i_1030_;
			i_1027_ += i_1033_ * i_1026_;
		}
		if (i_1022_ + i_1029_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4492) {
			i_1029_ -= i_1022_ + i_1029_
					- (((Class332_Sub3) this).aHa_Sub2_5434).anInt4492;
		}
		if (i < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) {
			final int i_1034_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4509 - i);
			i_1030_ -= i_1034_;
			i = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509;
			i_1028_ += i_1034_;
			i_1027_ += i_1034_;
			i_1032_ += i_1034_;
			i_1031_ += i_1034_;
		}
		if (i + i_1030_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4507) {
			final int i_1035_ = (i + i_1030_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4507));
			i_1030_ -= i_1035_;
			i_1032_ += i_1035_;
			i_1031_ += i_1035_;
		}
		if (i_1030_ > 0 && i_1029_ > 0) {
			final int[] is = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			if (i_1025_ == 0) {
				if (i_1023_ == 1) {
					for (int i_1036_ = -i_1029_; i_1036_ < 0; i_1036_++) {
						int i_1037_ = i_1027_ + i_1030_ - 3;
						while (i_1027_ < i_1037_) {
							is[i_1027_++] = (anIntArray6212[i_1028_++]);
							is[i_1027_++] = (anIntArray6212[i_1028_++]);
							is[i_1027_++] = (anIntArray6212[i_1028_++]);
							is[i_1027_++] = (anIntArray6212[i_1028_++]);
						}
						i_1037_ += 3;
						while (i_1027_ < i_1037_) {
							is[i_1027_++] = (anIntArray6212[i_1028_++]);
						}
						i_1027_ += i_1031_;
						i_1028_ += i_1032_;
					}
					return;
				}
				if (i_1023_ == 0) {
					final int i_1038_ = (i_1024_ & 0xff0000) >> 16;
					final int i_1039_ = (i_1024_ & 0xff00) >> 8;
					final int i_1040_ = i_1024_ & 0xff;
					for (int i_1041_ = -i_1029_; i_1041_ < 0; i_1041_++) {
						for (int i_1042_ = -i_1030_; i_1042_ < 0; i_1042_++) {
							final int i_1043_ = (anIntArray6212[i_1028_++]);
							final int i_1044_ = (i_1043_ & 0xff0000) * i_1038_
									& ~0xffffff;
							final int i_1045_ = (i_1043_ & 0xff00) * i_1039_
									& 0xff0000;
							final int i_1046_ = (i_1043_ & 0xff) * i_1040_
									& 0xff00;
							is[i_1027_++] = (i_1044_ | i_1045_ | i_1046_) >>> 8;
						}
						i_1027_ += i_1031_;
						i_1028_ += i_1032_;
					}
					return;
				}
				if (i_1023_ == 3) {
					for (int i_1047_ = -i_1029_; i_1047_ < 0; i_1047_++) {
						for (int i_1048_ = -i_1030_; i_1048_ < 0; i_1048_++) {
							final int i_1049_ = (anIntArray6212[i_1028_++]);
							final int i_1050_ = i_1049_ + i_1024_;
							final int i_1051_ = (i_1049_ & 0xff00ff)
									+ (i_1024_ & 0xff00ff);
							final int i_1052_ = ((i_1051_ & 0x1000100) + (i_1050_
									- i_1051_ & 0x10000));
							is[i_1027_++] = i_1050_ - i_1052_ | i_1052_
									- (i_1052_ >>> 8);
						}
						i_1027_ += i_1031_;
						i_1028_ += i_1032_;
					}
					return;
				}
				if (i_1023_ == 2) {
					final int i_1053_ = i_1024_ >>> 24;
					final int i_1054_ = 256 - i_1053_;
					int i_1055_ = (i_1024_ & 0xff00ff) * i_1054_ & ~0xff00ff;
					int i_1056_ = (i_1024_ & 0xff00) * i_1054_ & 0xff0000;
					i_1024_ = (i_1055_ | i_1056_) >>> 8;
					for (int i_1057_ = -i_1029_; i_1057_ < 0; i_1057_++) {
						for (int i_1058_ = -i_1030_; i_1058_ < 0; i_1058_++) {
							final int i_1059_ = (anIntArray6212[i_1028_++]);
							i_1055_ = (i_1059_ & 0xff00ff) * i_1053_
									& ~0xff00ff;
							i_1056_ = (i_1059_ & 0xff00) * i_1053_ & 0xff0000;
							is[i_1027_++] = ((i_1055_ | i_1056_) >>> 8)
									+ i_1024_;
						}
						i_1027_ += i_1031_;
						i_1028_ += i_1032_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_1025_ == 1) {
				if (i_1023_ == 1) {
					for (int i_1060_ = -i_1029_; i_1060_ < 0; i_1060_++) {
						for (int i_1061_ = -i_1030_; i_1061_ < 0; i_1061_++) {
							final int i_1062_ = (anIntArray6212[i_1028_++]);
							final int i_1063_ = i_1062_ >>> 24;
							final int i_1064_ = 256 - i_1063_;
							final int i_1065_ = is[i_1027_];
							is[i_1027_++] = (((((i_1062_ & 0xff00ff) * i_1063_ + (i_1065_ & 0xff00ff)
									* i_1064_) & ~0xff00ff) >> 8) + ((((i_1062_ & ~0xff00ff) >>> 8)
									* i_1063_ + (((i_1065_ & ~0xff00ff) >>> 8) * i_1064_)) & ~0xff00ff));
						}
						i_1027_ += i_1031_;
						i_1028_ += i_1032_;
					}
					return;
				}
				if (i_1023_ == 0) {
					if ((i_1024_ & 0xffffff) == 16777215) {
						for (int i_1066_ = -i_1029_; i_1066_ < 0; i_1066_++) {
							for (int i_1067_ = -i_1030_; i_1067_ < 0; i_1067_++) {
								final int i_1068_ = (anIntArray6212[i_1028_++]);
								final int i_1069_ = (i_1068_ >>> 24)
										* (i_1024_ >>> 24) >> 8;
								final int i_1070_ = 256 - i_1069_;
								final int i_1071_ = is[i_1027_];
								is[i_1027_++] = ((((i_1068_ & 0xff00ff)
										* i_1069_ + (i_1071_ & 0xff00ff)
										* i_1070_) & ~0xff00ff) + (((i_1068_ & 0xff00)
										* i_1069_ + (i_1071_ & 0xff00)
										* i_1070_) & 0xff0000)) >> 8;
							}
							i_1027_ += i_1031_;
							i_1028_ += i_1032_;
						}
					} else {
						final int i_1072_ = (i_1024_ & 0xff0000) >> 16;
						final int i_1073_ = (i_1024_ & 0xff00) >> 8;
						final int i_1074_ = i_1024_ & 0xff;
						for (int i_1075_ = -i_1029_; i_1075_ < 0; i_1075_++) {
							for (int i_1076_ = -i_1030_; i_1076_ < 0; i_1076_++) {
								int i_1077_ = (anIntArray6212[i_1028_++]);
								final int i_1078_ = (i_1077_ >>> 24)
										* (i_1024_ >>> 24) >> 8;
								final int i_1079_ = 256 - i_1078_;
								if (i_1078_ != 255) {
									final int i_1080_ = ((i_1077_ & 0xff0000)
											* i_1072_ & ~0xffffff);
									final int i_1081_ = ((i_1077_ & 0xff00)
											* i_1073_ & 0xff0000);
									final int i_1082_ = (i_1077_ & 0xff)
											* i_1074_ & 0xff00;
									i_1077_ = (i_1080_ | i_1081_ | i_1082_) >>> 8;
									final int i_1083_ = is[i_1027_];
									is[i_1027_++] = ((((i_1077_ & 0xff00ff)
											* i_1078_ + (i_1083_ & 0xff00ff)
											* i_1079_) & ~0xff00ff) + (((i_1077_ & 0xff00)
											* i_1078_ + (i_1083_ & 0xff00)
											* i_1079_) & 0xff0000)) >> 8;
								} else {
									final int i_1084_ = ((i_1077_ & 0xff0000)
											* i_1072_ & ~0xffffff);
									final int i_1085_ = ((i_1077_ & 0xff00)
											* i_1073_ & 0xff0000);
									final int i_1086_ = (i_1077_ & 0xff)
											* i_1074_ & 0xff00;
									is[i_1027_++] = (i_1084_ | i_1085_ | i_1086_) >>> 8;
								}
							}
							i_1027_ += i_1031_;
							i_1028_ += i_1032_;
						}
						return;
					}
					return;
				}
				if (i_1023_ == 3) {
					for (int i_1087_ = -i_1029_; i_1087_ < 0; i_1087_++) {
						for (int i_1088_ = -i_1030_; i_1088_ < 0; i_1088_++) {
							int i_1089_ = (anIntArray6212[i_1028_++]);
							final int i_1090_ = i_1089_ + i_1024_;
							final int i_1091_ = (i_1089_ & 0xff00ff)
									+ (i_1024_ & 0xff00ff);
							int i_1092_ = ((i_1091_ & 0x1000100) + (i_1090_
									- i_1091_ & 0x10000));
							i_1092_ = i_1090_ - i_1092_ | i_1092_
									- (i_1092_ >>> 8);
							final int i_1093_ = (i_1092_ >>> 24)
									* (i_1024_ >>> 24) >> 8;
							final int i_1094_ = 256 - i_1093_;
							if (i_1093_ != 255) {
								i_1089_ = i_1092_;
								i_1092_ = is[i_1027_];
								i_1092_ = ((((i_1089_ & 0xff00ff) * i_1093_ + (i_1092_ & 0xff00ff)
										* i_1094_) & ~0xff00ff) + (((i_1089_ & 0xff00)
										* i_1093_ + (i_1092_ & 0xff00)
										* i_1094_) & 0xff0000)) >> 8;
							}
							is[i_1027_++] = i_1092_;
						}
						i_1027_ += i_1031_;
						i_1028_ += i_1032_;
					}
					return;
				}
				if (i_1023_ == 2) {
					final int i_1095_ = i_1024_ >>> 24;
					final int i_1096_ = 256 - i_1095_;
					int i_1097_ = (i_1024_ & 0xff00ff) * i_1096_ & ~0xff00ff;
					int i_1098_ = (i_1024_ & 0xff00) * i_1096_ & 0xff0000;
					i_1024_ = (i_1097_ | i_1098_) >>> 8;
					for (int i_1099_ = -i_1029_; i_1099_ < 0; i_1099_++) {
						for (int i_1100_ = -i_1030_; i_1100_ < 0; i_1100_++) {
							int i_1101_ = (anIntArray6212[i_1028_++]);
							final int i_1102_ = i_1101_ >>> 24;
							final int i_1103_ = 256 - i_1102_;
							i_1097_ = (i_1101_ & 0xff00ff) * i_1095_
									& ~0xff00ff;
							i_1098_ = (i_1101_ & 0xff00) * i_1095_ & 0xff0000;
							i_1101_ = ((i_1097_ | i_1098_) >>> 8) + i_1024_;
							final int i_1104_ = is[i_1027_];
							is[i_1027_++] = ((((i_1101_ & 0xff00ff) * i_1102_ + (i_1104_ & 0xff00ff)
									* i_1103_) & ~0xff00ff) + (((i_1101_ & 0xff00)
									* i_1102_ + (i_1104_ & 0xff00) * i_1103_) & 0xff0000)) >> 8;
						}
						i_1027_ += i_1031_;
						i_1028_ += i_1032_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_1025_ == 2) {
				if (i_1023_ == 1) {
					for (int i_1105_ = -i_1029_; i_1105_ < 0; i_1105_++) {
						for (int i_1106_ = -i_1030_; i_1106_ < 0; i_1106_++) {
							final int i_1107_ = (anIntArray6212[i_1028_++]);
							if (i_1107_ != 0) {
								int i_1108_ = is[i_1027_];
								final int i_1109_ = i_1107_ + i_1108_;
								final int i_1110_ = ((i_1107_ & 0xff00ff) + (i_1108_ & 0xff00ff));
								i_1108_ = ((i_1110_ & 0x1000100) + (i_1109_
										- i_1110_ & 0x10000));
								is[i_1027_++] = i_1109_ - i_1108_ | i_1108_
										- (i_1108_ >>> 8);
							} else {
								i_1027_++;
							}
						}
						i_1027_ += i_1031_;
						i_1028_ += i_1032_;
					}
					return;
				}
				if (i_1023_ == 0) {
					final int i_1111_ = (i_1024_ & 0xff0000) >> 16;
					final int i_1112_ = (i_1024_ & 0xff00) >> 8;
					final int i_1113_ = i_1024_ & 0xff;
					for (int i_1114_ = -i_1029_; i_1114_ < 0; i_1114_++) {
						for (int i_1115_ = -i_1030_; i_1115_ < 0; i_1115_++) {
							int i_1116_ = (anIntArray6212[i_1028_++]);
							if (i_1116_ != 0) {
								final int i_1117_ = ((i_1116_ & 0xff0000)
										* i_1111_ & ~0xffffff);
								final int i_1118_ = (i_1116_ & 0xff00)
										* i_1112_ & 0xff0000;
								final int i_1119_ = (i_1116_ & 0xff) * i_1113_
										& 0xff00;
								i_1116_ = (i_1117_ | i_1118_ | i_1119_) >>> 8;
								int i_1120_ = is[i_1027_];
								final int i_1121_ = i_1116_ + i_1120_;
								final int i_1122_ = ((i_1116_ & 0xff00ff) + (i_1120_ & 0xff00ff));
								i_1120_ = ((i_1122_ & 0x1000100) + (i_1121_
										- i_1122_ & 0x10000));
								is[i_1027_++] = i_1121_ - i_1120_ | i_1120_
										- (i_1120_ >>> 8);
							} else {
								i_1027_++;
							}
						}
						i_1027_ += i_1031_;
						i_1028_ += i_1032_;
					}
					return;
				}
				if (i_1023_ == 3) {
					for (int i_1123_ = -i_1029_; i_1123_ < 0; i_1123_++) {
						for (int i_1124_ = -i_1030_; i_1124_ < 0; i_1124_++) {
							int i_1125_ = (anIntArray6212[i_1028_++]);
							int i_1126_ = i_1125_ + i_1024_;
							int i_1127_ = (i_1125_ & 0xff00ff)
									+ (i_1024_ & 0xff00ff);
							int i_1128_ = ((i_1127_ & 0x1000100) + (i_1126_
									- i_1127_ & 0x10000));
							i_1125_ = i_1126_ - i_1128_ | i_1128_
									- (i_1128_ >>> 8);
							i_1128_ = is[i_1027_];
							i_1126_ = i_1125_ + i_1128_;
							i_1127_ = (i_1125_ & 0xff00ff)
									+ (i_1128_ & 0xff00ff);
							i_1128_ = (i_1127_ & 0x1000100)
									+ (i_1126_ - i_1127_ & 0x10000);
							is[i_1027_++] = i_1126_ - i_1128_ | i_1128_
									- (i_1128_ >>> 8);
						}
						i_1027_ += i_1031_;
						i_1028_ += i_1032_;
					}
					return;
				}
				if (i_1023_ == 2) {
					final int i_1129_ = i_1024_ >>> 24;
					final int i_1130_ = 256 - i_1129_;
					int i_1131_ = (i_1024_ & 0xff00ff) * i_1130_ & ~0xff00ff;
					int i_1132_ = (i_1024_ & 0xff00) * i_1130_ & 0xff0000;
					i_1024_ = (i_1131_ | i_1132_) >>> 8;
					for (int i_1133_ = -i_1029_; i_1133_ < 0; i_1133_++) {
						for (int i_1134_ = -i_1030_; i_1134_ < 0; i_1134_++) {
							int i_1135_ = (anIntArray6212[i_1028_++]);
							if (i_1135_ != 0) {
								i_1131_ = ((i_1135_ & 0xff00ff) * i_1129_ & ~0xff00ff);
								i_1132_ = (i_1135_ & 0xff00) * i_1129_
										& 0xff0000;
								i_1135_ = ((i_1131_ | i_1132_) >>> 8) + i_1024_;
								int i_1136_ = is[i_1027_];
								final int i_1137_ = i_1135_ + i_1136_;
								final int i_1138_ = ((i_1135_ & 0xff00ff) + (i_1136_ & 0xff00ff));
								i_1136_ = ((i_1138_ & 0x1000100) + (i_1137_
										- i_1138_ & 0x10000));
								is[i_1027_++] = i_1137_ - i_1136_ | i_1136_
										- (i_1136_ >>> 8);
							} else {
								i_1027_++;
							}
						}
						i_1027_ += i_1031_;
						i_1028_ += i_1032_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	Class332_Sub3_Sub1(final ha_Sub2 var_ha_Sub2, final int i, final int i_1139_) {
		super(var_ha_Sub2, i, i_1139_);
		anIntArray6212 = new int[i * i_1139_];
	}

	@Override
	final void method3758(final int[] is, final int[] is_1140_, final int i,
			final int i_1141_) {
		final int[] is_1142_ = ((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504;
		if (Class332_Sub3.anInt5444 == 0) {
			if (Class332_Sub3.anInt5436 == 0) {
				int i_1143_ = Class332_Sub3.anInt5431;
				while (i_1143_ < 0) {
					final int i_1144_ = i_1143_ + i_1141_;
					if (i_1144_ >= 0) {
						if (i_1144_ >= is.length) {
							break;
						}
						int i_1145_ = Class332_Sub3.anInt5451;
						int i_1146_ = Class332_Sub3.anInt5450;
						int i_1147_ = Class332_Sub3.anInt5443;
						int i_1148_ = Class332_Sub3.anInt5448;
						if (i_1146_ >= 0
								&& i_1147_ >= 0
								&& i_1146_
										- (((Class332_Sub3) this).anInt5433 << 12) < 0
								&& i_1147_
										- (((Class332_Sub3) this).anInt5454 << 12) < 0) {
							final int i_1149_ = is[i_1144_] - i;
							int i_1150_ = -is_1140_[i_1144_];
							final int i_1151_ = (i_1149_ - (i_1145_ - Class332_Sub3.anInt5451));
							if (i_1151_ > 0) {
								i_1145_ += i_1151_;
								i_1148_ += i_1151_;
								i_1146_ += Class332_Sub3.anInt5444 * i_1151_;
								i_1147_ += Class332_Sub3.anInt5436 * i_1151_;
							} else {
								i_1150_ -= i_1151_;
							}
							if (i_1148_ < i_1150_) {
								i_1148_ = i_1150_;
							}
							for (/**/; i_1148_ < 0; i_1148_++) {
								final int i_1152_ = (anIntArray6212[(((i_1147_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1146_ >> 12))]);
								final int i_1153_ = i_1152_ >>> 24;
								final int i_1154_ = 256 - i_1153_;
								final int i_1155_ = is_1142_[i_1145_];
								is_1142_[i_1145_++] = ((((i_1152_ & 0xff00ff)
										* i_1153_ + (i_1155_ & 0xff00ff)
										* i_1154_) & ~0xff00ff) + (((i_1152_ & 0xff00)
										* i_1153_ + (i_1155_ & 0xff00)
										* i_1154_) & 0xff0000)) >> 8;
							}
						}
					}
					i_1143_++;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else if (Class332_Sub3.anInt5436 < 0) {
				int i_1156_ = Class332_Sub3.anInt5431;
				while (i_1156_ < 0) {
					final int i_1157_ = i_1156_ + i_1141_;
					if (i_1157_ >= 0) {
						if (i_1157_ >= is.length) {
							break;
						}
						int i_1158_ = Class332_Sub3.anInt5451;
						int i_1159_ = Class332_Sub3.anInt5450;
						int i_1160_ = (Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456);
						int i_1161_ = Class332_Sub3.anInt5448;
						if (i_1159_ >= 0
								&& i_1159_
										- (((Class332_Sub3) this).anInt5433 << 12) < 0) {
							int i_1162_;
							if ((i_1162_ = i_1160_
									- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
								i_1162_ = ((Class332_Sub3.anInt5436 - i_1162_) / Class332_Sub3.anInt5436);
								i_1161_ += i_1162_;
								i_1160_ += Class332_Sub3.anInt5436 * i_1162_;
								i_1158_ += i_1162_;
							}
							if ((i_1162_ = ((i_1160_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1161_) {
								i_1161_ = i_1162_;
							}
							final int i_1163_ = is[i_1157_] - i;
							int i_1164_ = -is_1140_[i_1157_];
							final int i_1165_ = (i_1163_ - (i_1158_ - Class332_Sub3.anInt5451));
							if (i_1165_ > 0) {
								i_1158_ += i_1165_;
								i_1161_ += i_1165_;
								i_1159_ += Class332_Sub3.anInt5444 * i_1165_;
								i_1160_ += Class332_Sub3.anInt5436 * i_1165_;
							} else {
								i_1164_ -= i_1165_;
							}
							if (i_1161_ < i_1164_) {
								i_1161_ = i_1164_;
							}
							for (/**/; i_1161_ < 0; i_1161_++) {
								final int i_1166_ = (anIntArray6212[(((i_1160_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1159_ >> 12))]);
								final int i_1167_ = i_1166_ >>> 24;
								final int i_1168_ = 256 - i_1167_;
								final int i_1169_ = is_1142_[i_1158_];
								is_1142_[i_1158_++] = ((((i_1166_ & 0xff00ff)
										* i_1167_ + (i_1169_ & 0xff00ff)
										* i_1168_) & ~0xff00ff) + (((i_1166_ & 0xff00)
										* i_1167_ + (i_1169_ & 0xff00)
										* i_1168_) & 0xff0000)) >> 8;
								i_1160_ += Class332_Sub3.anInt5436;
							}
						}
					}
					i_1156_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else {
				int i_1170_ = Class332_Sub3.anInt5431;
				while (i_1170_ < 0) {
					final int i_1171_ = i_1170_ + i_1141_;
					if (i_1171_ >= 0) {
						if (i_1171_ >= is.length) {
							break;
						}
						int i_1172_ = Class332_Sub3.anInt5451;
						int i_1173_ = Class332_Sub3.anInt5450;
						int i_1174_ = (Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456);
						int i_1175_ = Class332_Sub3.anInt5448;
						if (i_1173_ >= 0
								&& i_1173_
										- (((Class332_Sub3) this).anInt5433 << 12) < 0) {
							if (i_1174_ < 0) {
								final int i_1176_ = ((Class332_Sub3.anInt5436 - 1 - i_1174_) / Class332_Sub3.anInt5436);
								i_1175_ += i_1176_;
								i_1174_ += Class332_Sub3.anInt5436 * i_1176_;
								i_1172_ += i_1176_;
							}
							int i_1177_;
							if ((i_1177_ = ((1 + i_1174_
									- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1175_) {
								i_1175_ = i_1177_;
							}
							final int i_1178_ = is[i_1171_] - i;
							int i_1179_ = -is_1140_[i_1171_];
							final int i_1180_ = (i_1178_ - (i_1172_ - Class332_Sub3.anInt5451));
							if (i_1180_ > 0) {
								i_1172_ += i_1180_;
								i_1175_ += i_1180_;
								i_1173_ += Class332_Sub3.anInt5444 * i_1180_;
								i_1174_ += Class332_Sub3.anInt5436 * i_1180_;
							} else {
								i_1179_ -= i_1180_;
							}
							if (i_1175_ < i_1179_) {
								i_1175_ = i_1179_;
							}
							for (/**/; i_1175_ < 0; i_1175_++) {
								final int i_1181_ = (anIntArray6212[(((i_1174_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1173_ >> 12))]);
								final int i_1182_ = i_1181_ >>> 24;
								final int i_1183_ = 256 - i_1182_;
								final int i_1184_ = is_1142_[i_1172_];
								is_1142_[i_1172_++] = ((((i_1181_ & 0xff00ff)
										* i_1182_ + (i_1184_ & 0xff00ff)
										* i_1183_) & ~0xff00ff) + (((i_1181_ & 0xff00)
										* i_1182_ + (i_1184_ & 0xff00)
										* i_1183_) & 0xff0000)) >> 8;
								i_1174_ += Class332_Sub3.anInt5436;
							}
						}
					}
					i_1170_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			}
		} else if (Class332_Sub3.anInt5444 < 0) {
			if (Class332_Sub3.anInt5436 == 0) {
				int i_1185_ = Class332_Sub3.anInt5431;
				while (i_1185_ < 0) {
					final int i_1186_ = i_1185_ + i_1141_;
					if (i_1186_ >= 0) {
						if (i_1186_ >= is.length) {
							break;
						}
						int i_1187_ = Class332_Sub3.anInt5451;
						int i_1188_ = (Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425);
						int i_1189_ = Class332_Sub3.anInt5443;
						int i_1190_ = Class332_Sub3.anInt5448;
						if (i_1189_ >= 0
								&& i_1189_
										- (((Class332_Sub3) this).anInt5454 << 12) < 0) {
							int i_1191_;
							if ((i_1191_ = i_1188_
									- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
								i_1191_ = ((Class332_Sub3.anInt5444 - i_1191_) / Class332_Sub3.anInt5444);
								i_1190_ += i_1191_;
								i_1188_ += Class332_Sub3.anInt5444 * i_1191_;
								i_1187_ += i_1191_;
							}
							if ((i_1191_ = ((i_1188_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1190_) {
								i_1190_ = i_1191_;
							}
							final int i_1192_ = is[i_1186_] - i;
							int i_1193_ = -is_1140_[i_1186_];
							final int i_1194_ = (i_1192_ - (i_1187_ - Class332_Sub3.anInt5451));
							if (i_1194_ > 0) {
								i_1187_ += i_1194_;
								i_1190_ += i_1194_;
								i_1188_ += Class332_Sub3.anInt5444 * i_1194_;
								i_1189_ += Class332_Sub3.anInt5436 * i_1194_;
							} else {
								i_1193_ -= i_1194_;
							}
							if (i_1190_ < i_1193_) {
								i_1190_ = i_1193_;
							}
							for (/**/; i_1190_ < 0; i_1190_++) {
								final int i_1195_ = (anIntArray6212[(((i_1189_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1188_ >> 12))]);
								final int i_1196_ = i_1195_ >>> 24;
								final int i_1197_ = 256 - i_1196_;
								final int i_1198_ = is_1142_[i_1187_];
								is_1142_[i_1187_++] = ((((i_1195_ & 0xff00ff)
										* i_1196_ + (i_1198_ & 0xff00ff)
										* i_1197_) & ~0xff00ff) + (((i_1195_ & 0xff00)
										* i_1196_ + (i_1198_ & 0xff00)
										* i_1197_) & 0xff0000)) >> 8;
								i_1188_ += Class332_Sub3.anInt5444;
							}
						}
					}
					i_1185_++;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else if (Class332_Sub3.anInt5436 < 0) {
				int i_1199_ = Class332_Sub3.anInt5431;
				while (i_1199_ < 0) {
					final int i_1200_ = i_1199_ + i_1141_;
					if (i_1200_ >= 0) {
						if (i_1200_ >= is.length) {
							break;
						}
						int i_1201_ = Class332_Sub3.anInt5451;
						int i_1202_ = (Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425);
						int i_1203_ = (Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456);
						int i_1204_ = Class332_Sub3.anInt5448;
						int i_1205_;
						if ((i_1205_ = i_1202_
								- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
							i_1205_ = ((Class332_Sub3.anInt5444 - i_1205_) / Class332_Sub3.anInt5444);
							i_1204_ += i_1205_;
							i_1202_ += Class332_Sub3.anInt5444 * i_1205_;
							i_1203_ += Class332_Sub3.anInt5436 * i_1205_;
							i_1201_ += i_1205_;
						}
						if ((i_1205_ = ((i_1202_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1204_) {
							i_1204_ = i_1205_;
						}
						if ((i_1205_ = i_1203_
								- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
							i_1205_ = ((Class332_Sub3.anInt5436 - i_1205_) / Class332_Sub3.anInt5436);
							i_1204_ += i_1205_;
							i_1202_ += Class332_Sub3.anInt5444 * i_1205_;
							i_1203_ += Class332_Sub3.anInt5436 * i_1205_;
							i_1201_ += i_1205_;
						}
						if ((i_1205_ = ((i_1203_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1204_) {
							i_1204_ = i_1205_;
						}
						final int i_1206_ = is[i_1200_] - i;
						int i_1207_ = -is_1140_[i_1200_];
						final int i_1208_ = i_1206_
								- (i_1201_ - Class332_Sub3.anInt5451);
						if (i_1208_ > 0) {
							i_1201_ += i_1208_;
							i_1204_ += i_1208_;
							i_1202_ += Class332_Sub3.anInt5444 * i_1208_;
							i_1203_ += Class332_Sub3.anInt5436 * i_1208_;
						} else {
							i_1207_ -= i_1208_;
						}
						if (i_1204_ < i_1207_) {
							i_1204_ = i_1207_;
						}
						for (/**/; i_1204_ < 0; i_1204_++) {
							final int i_1209_ = (anIntArray6212[(((i_1203_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1202_ >> 12))]);
							final int i_1210_ = i_1209_ >>> 24;
							final int i_1211_ = 256 - i_1210_;
							final int i_1212_ = is_1142_[i_1201_];
							is_1142_[i_1201_++] = ((((i_1209_ & 0xff00ff)
									* i_1210_ + (i_1212_ & 0xff00ff) * i_1211_) & ~0xff00ff) + (((i_1209_ & 0xff00)
									* i_1210_ + (i_1212_ & 0xff00) * i_1211_) & 0xff0000)) >> 8;
							i_1202_ += Class332_Sub3.anInt5444;
							i_1203_ += Class332_Sub3.anInt5436;
						}
					}
					i_1199_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else {
				int i_1213_ = Class332_Sub3.anInt5431;
				while (i_1213_ < 0) {
					final int i_1214_ = i_1213_ + i_1141_;
					if (i_1214_ >= 0) {
						if (i_1214_ >= is.length) {
							break;
						}
						int i_1215_ = Class332_Sub3.anInt5451;
						int i_1216_ = (Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425);
						int i_1217_ = (Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456);
						int i_1218_ = Class332_Sub3.anInt5448;
						int i_1219_;
						if ((i_1219_ = i_1216_
								- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
							i_1219_ = ((Class332_Sub3.anInt5444 - i_1219_) / Class332_Sub3.anInt5444);
							i_1218_ += i_1219_;
							i_1216_ += Class332_Sub3.anInt5444 * i_1219_;
							i_1217_ += Class332_Sub3.anInt5436 * i_1219_;
							i_1215_ += i_1219_;
						}
						if ((i_1219_ = ((i_1216_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1218_) {
							i_1218_ = i_1219_;
						}
						if (i_1217_ < 0) {
							i_1219_ = ((Class332_Sub3.anInt5436 - 1 - i_1217_) / Class332_Sub3.anInt5436);
							i_1218_ += i_1219_;
							i_1216_ += Class332_Sub3.anInt5444 * i_1219_;
							i_1217_ += Class332_Sub3.anInt5436 * i_1219_;
							i_1215_ += i_1219_;
						}
						if ((i_1219_ = ((1 + i_1217_
								- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1218_) {
							i_1218_ = i_1219_;
						}
						final int i_1220_ = is[i_1214_] - i;
						int i_1221_ = -is_1140_[i_1214_];
						final int i_1222_ = i_1220_
								- (i_1215_ - Class332_Sub3.anInt5451);
						if (i_1222_ > 0) {
							i_1215_ += i_1222_;
							i_1218_ += i_1222_;
							i_1216_ += Class332_Sub3.anInt5444 * i_1222_;
							i_1217_ += Class332_Sub3.anInt5436 * i_1222_;
						} else {
							i_1221_ -= i_1222_;
						}
						if (i_1218_ < i_1221_) {
							i_1218_ = i_1221_;
						}
						for (/**/; i_1218_ < 0; i_1218_++) {
							final int i_1223_ = (anIntArray6212[(((i_1217_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1216_ >> 12))]);
							final int i_1224_ = i_1223_ >>> 24;
							final int i_1225_ = 256 - i_1224_;
							final int i_1226_ = is_1142_[i_1215_];
							is_1142_[i_1215_++] = ((((i_1223_ & 0xff00ff)
									* i_1224_ + (i_1226_ & 0xff00ff) * i_1225_) & ~0xff00ff) + (((i_1223_ & 0xff00)
									* i_1224_ + (i_1226_ & 0xff00) * i_1225_) & 0xff0000)) >> 8;
							i_1216_ += Class332_Sub3.anInt5444;
							i_1217_ += Class332_Sub3.anInt5436;
						}
					}
					i_1213_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			}
		} else if (Class332_Sub3.anInt5436 == 0) {
			int i_1227_ = Class332_Sub3.anInt5431;
			while (i_1227_ < 0) {
				final int i_1228_ = i_1227_ + i_1141_;
				if (i_1228_ >= 0) {
					if (i_1228_ >= is.length) {
						break;
					}
					int i_1229_ = Class332_Sub3.anInt5451;
					int i_1230_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_1231_ = Class332_Sub3.anInt5443;
					int i_1232_ = Class332_Sub3.anInt5448;
					if (i_1231_ >= 0
							&& (i_1231_
									- (((Class332_Sub3) this).anInt5454 << 12) < 0)) {
						if (i_1230_ < 0) {
							final int i_1233_ = ((Class332_Sub3.anInt5444 - 1 - i_1230_) / Class332_Sub3.anInt5444);
							i_1232_ += i_1233_;
							i_1230_ += Class332_Sub3.anInt5444 * i_1233_;
							i_1229_ += i_1233_;
						}
						int i_1234_;
						if ((i_1234_ = ((1 + i_1230_
								- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1232_) {
							i_1232_ = i_1234_;
						}
						final int i_1235_ = is[i_1228_] - i;
						int i_1236_ = -is_1140_[i_1228_];
						final int i_1237_ = i_1235_
								- (i_1229_ - Class332_Sub3.anInt5451);
						if (i_1237_ > 0) {
							i_1229_ += i_1237_;
							i_1232_ += i_1237_;
							i_1230_ += Class332_Sub3.anInt5444 * i_1237_;
							i_1231_ += Class332_Sub3.anInt5436 * i_1237_;
						} else {
							i_1236_ -= i_1237_;
						}
						if (i_1232_ < i_1236_) {
							i_1232_ = i_1236_;
						}
						for (/**/; i_1232_ < 0; i_1232_++) {
							final int i_1238_ = (anIntArray6212[(((i_1231_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1230_ >> 12))]);
							final int i_1239_ = i_1238_ >>> 24;
							final int i_1240_ = 256 - i_1239_;
							final int i_1241_ = is_1142_[i_1229_];
							is_1142_[i_1229_++] = ((((i_1238_ & 0xff00ff)
									* i_1239_ + (i_1241_ & 0xff00ff) * i_1240_) & ~0xff00ff) + (((i_1238_ & 0xff00)
									* i_1239_ + (i_1241_ & 0xff00) * i_1240_) & 0xff0000)) >> 8;
							i_1230_ += Class332_Sub3.anInt5444;
						}
					}
				}
				i_1227_++;
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		} else if (Class332_Sub3.anInt5436 < 0) {
			int i_1242_ = Class332_Sub3.anInt5431;
			while (i_1242_ < 0) {
				final int i_1243_ = i_1242_ + i_1141_;
				if (i_1243_ >= 0) {
					if (i_1243_ >= is.length) {
						break;
					}
					int i_1244_ = Class332_Sub3.anInt5451;
					int i_1245_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_1246_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_1247_ = Class332_Sub3.anInt5448;
					if (i_1245_ < 0) {
						final int i_1248_ = ((Class332_Sub3.anInt5444 - 1 - i_1245_) / Class332_Sub3.anInt5444);
						i_1247_ += i_1248_;
						i_1245_ += Class332_Sub3.anInt5444 * i_1248_;
						i_1246_ += Class332_Sub3.anInt5436 * i_1248_;
						i_1244_ += i_1248_;
					}
					int i_1249_;
					if ((i_1249_ = ((1 + i_1245_
							- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1247_) {
						i_1247_ = i_1249_;
					}
					if ((i_1249_ = i_1246_
							- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
						i_1249_ = ((Class332_Sub3.anInt5436 - i_1249_) / Class332_Sub3.anInt5436);
						i_1247_ += i_1249_;
						i_1245_ += Class332_Sub3.anInt5444 * i_1249_;
						i_1246_ += Class332_Sub3.anInt5436 * i_1249_;
						i_1244_ += i_1249_;
					}
					if ((i_1249_ = ((i_1246_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1247_) {
						i_1247_ = i_1249_;
					}
					final int i_1250_ = is[i_1243_] - i;
					int i_1251_ = -is_1140_[i_1243_];
					final int i_1252_ = i_1250_
							- (i_1244_ - Class332_Sub3.anInt5451);
					if (i_1252_ > 0) {
						i_1244_ += i_1252_;
						i_1247_ += i_1252_;
						i_1245_ += Class332_Sub3.anInt5444 * i_1252_;
						i_1246_ += Class332_Sub3.anInt5436 * i_1252_;
					} else {
						i_1251_ -= i_1252_;
					}
					if (i_1247_ < i_1251_) {
						i_1247_ = i_1251_;
					}
					for (/**/; i_1247_ < 0; i_1247_++) {
						final int i_1253_ = (anIntArray6212[(((i_1246_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1245_ >> 12))]);
						final int i_1254_ = i_1253_ >>> 24;
						final int i_1255_ = 256 - i_1254_;
						final int i_1256_ = is_1142_[i_1244_];
						is_1142_[i_1244_++] = ((((i_1253_ & 0xff00ff) * i_1254_ + (i_1256_ & 0xff00ff)
								* i_1255_) & ~0xff00ff) + (((i_1253_ & 0xff00)
								* i_1254_ + (i_1256_ & 0xff00) * i_1255_) & 0xff0000)) >> 8;
						i_1245_ += Class332_Sub3.anInt5444;
						i_1246_ += Class332_Sub3.anInt5436;
					}
				}
				i_1242_++;
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		} else {
			int i_1257_ = Class332_Sub3.anInt5431;
			while (i_1257_ < 0) {
				final int i_1258_ = i_1257_ + i_1141_;
				if (i_1258_ >= 0) {
					if (i_1258_ >= is.length) {
						break;
					}
					int i_1259_ = Class332_Sub3.anInt5451;
					int i_1260_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_1261_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_1262_ = Class332_Sub3.anInt5448;
					if (i_1260_ < 0) {
						final int i_1263_ = ((Class332_Sub3.anInt5444 - 1 - i_1260_) / Class332_Sub3.anInt5444);
						i_1262_ += i_1263_;
						i_1260_ += Class332_Sub3.anInt5444 * i_1263_;
						i_1261_ += Class332_Sub3.anInt5436 * i_1263_;
						i_1259_ += i_1263_;
					}
					int i_1264_;
					if ((i_1264_ = ((1 + i_1260_
							- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1262_) {
						i_1262_ = i_1264_;
					}
					if (i_1261_ < 0) {
						i_1264_ = ((Class332_Sub3.anInt5436 - 1 - i_1261_) / Class332_Sub3.anInt5436);
						i_1262_ += i_1264_;
						i_1260_ += Class332_Sub3.anInt5444 * i_1264_;
						i_1261_ += Class332_Sub3.anInt5436 * i_1264_;
						i_1259_ += i_1264_;
					}
					if ((i_1264_ = ((1 + i_1261_
							- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1262_) {
						i_1262_ = i_1264_;
					}
					final int i_1265_ = is[i_1258_] - i;
					int i_1266_ = -is_1140_[i_1258_];
					final int i_1267_ = i_1265_
							- (i_1259_ - Class332_Sub3.anInt5451);
					if (i_1267_ > 0) {
						i_1259_ += i_1267_;
						i_1262_ += i_1267_;
						i_1260_ += Class332_Sub3.anInt5444 * i_1267_;
						i_1261_ += Class332_Sub3.anInt5436 * i_1267_;
					} else {
						i_1266_ -= i_1267_;
					}
					if (i_1262_ < i_1266_) {
						i_1262_ = i_1266_;
					}
					for (/**/; i_1262_ < 0; i_1262_++) {
						final int i_1268_ = (anIntArray6212[(((i_1261_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1260_ >> 12))]);
						final int i_1269_ = i_1268_ >>> 24;
						final int i_1270_ = 256 - i_1269_;
						final int i_1271_ = is_1142_[i_1259_];
						is_1142_[i_1259_++] = ((((i_1268_ & 0xff00ff) * i_1269_ + (i_1271_ & 0xff00ff)
								* i_1270_) & ~0xff00ff) + (((i_1268_ & 0xff00)
								* i_1269_ + (i_1271_ & 0xff00) * i_1270_) & 0xff0000)) >> 8;
						i_1260_ += Class332_Sub3.anInt5444;
						i_1261_ += Class332_Sub3.anInt5436;
					}
				}
				i_1257_++;
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		}
	}
}
