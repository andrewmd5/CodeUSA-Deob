/* Class332_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class332_Sub3_Sub2 extends Class332_Sub3 {
	int[] anIntArray6213;

	Class332_Sub3_Sub2(final ha_Sub2 var_ha_Sub2, final int[] is, final int i,
			final int i_0_) {
		super(var_ha_Sub2, i, i_0_);
		anIntArray6213 = is;
	}

	@Override
	final void method3748(int i, int i_1_, final int i_2_, int i_3_,
			final int i_4_) {
		if (((Class332_Sub3) this).aHa_Sub2_5434.method1920()) {
			throw new IllegalStateException();
		}
		final int i_5_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4505;
		i += ((Class332_Sub3) this).anInt5446;
		i_1_ += ((Class332_Sub3) this).anInt5439;
		int i_6_ = i_1_ * i_5_ + i;
		int i_7_ = 0;
		int i_8_ = ((Class332_Sub3) this).anInt5454;
		int i_9_ = ((Class332_Sub3) this).anInt5433;
		int i_10_ = i_5_ - i_9_;
		int i_11_ = 0;
		if (i_1_ < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) {
			final int i_12_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4495 - i_1_);
			i_8_ -= i_12_;
			i_1_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495;
			i_7_ += i_12_ * i_9_;
			i_6_ += i_12_ * i_5_;
		}
		if (i_1_ + i_8_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4492) {
			i_8_ -= i_1_ + i_8_
					- (((Class332_Sub3) this).aHa_Sub2_5434).anInt4492;
		}
		if (i < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) {
			final int i_13_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4509 - i);
			i_9_ -= i_13_;
			i = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509;
			i_7_ += i_13_;
			i_6_ += i_13_;
			i_11_ += i_13_;
			i_10_ += i_13_;
		}
		if (i + i_9_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4507) {
			final int i_14_ = i + i_9_
					- (((Class332_Sub3) this).aHa_Sub2_5434.anInt4507);
			i_9_ -= i_14_;
			i_11_ += i_14_;
			i_10_ += i_14_;
		}
		if (i_9_ > 0 && i_8_ > 0) {
			final int[] is = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			if (i_4_ == 0) {
				if (i_2_ == 1) {
					for (int i_15_ = -i_8_; i_15_ < 0; i_15_++) {
						int i_16_ = i_6_ + i_9_ - 3;
						while (i_6_ < i_16_) {
							is[i_6_++] = (anIntArray6213[i_7_++]);
							is[i_6_++] = (anIntArray6213[i_7_++]);
							is[i_6_++] = (anIntArray6213[i_7_++]);
							is[i_6_++] = (anIntArray6213[i_7_++]);
						}
						i_16_ += 3;
						while (i_6_ < i_16_) {
							is[i_6_++] = (anIntArray6213[i_7_++]);
						}
						i_6_ += i_10_;
						i_7_ += i_11_;
					}
					return;
				}
				if (i_2_ == 0) {
					final int i_17_ = (i_3_ & 0xff0000) >> 16;
					final int i_18_ = (i_3_ & 0xff00) >> 8;
					final int i_19_ = i_3_ & 0xff;
					for (int i_20_ = -i_8_; i_20_ < 0; i_20_++) {
						for (int i_21_ = -i_9_; i_21_ < 0; i_21_++) {
							final int i_22_ = (anIntArray6213[i_7_++]);
							final int i_23_ = (i_22_ & 0xff0000) * i_17_
									& ~0xffffff;
							final int i_24_ = (i_22_ & 0xff00) * i_18_
									& 0xff0000;
							final int i_25_ = (i_22_ & 0xff) * i_19_ & 0xff00;
							is[i_6_++] = (i_23_ | i_24_ | i_25_) >>> 8;
						}
						i_6_ += i_10_;
						i_7_ += i_11_;
					}
					return;
				}
				if (i_2_ == 3) {
					for (int i_26_ = -i_8_; i_26_ < 0; i_26_++) {
						for (int i_27_ = -i_9_; i_27_ < 0; i_27_++) {
							final int i_28_ = (anIntArray6213[i_7_++]);
							final int i_29_ = i_28_ + i_3_;
							final int i_30_ = (i_28_ & 0xff00ff)
									+ (i_3_ & 0xff00ff);
							final int i_31_ = ((i_30_ & 0x1000100) + (i_29_
									- i_30_ & 0x10000));
							is[i_6_++] = i_29_ - i_31_ | i_31_ - (i_31_ >>> 8);
						}
						i_6_ += i_10_;
						i_7_ += i_11_;
					}
					return;
				}
				if (i_2_ == 2) {
					final int i_32_ = i_3_ >>> 24;
					final int i_33_ = 256 - i_32_;
					int i_34_ = (i_3_ & 0xff00ff) * i_33_ & ~0xff00ff;
					int i_35_ = (i_3_ & 0xff00) * i_33_ & 0xff0000;
					i_3_ = (i_34_ | i_35_) >>> 8;
					for (int i_36_ = -i_8_; i_36_ < 0; i_36_++) {
						for (int i_37_ = -i_9_; i_37_ < 0; i_37_++) {
							final int i_38_ = (anIntArray6213[i_7_++]);
							i_34_ = (i_38_ & 0xff00ff) * i_32_ & ~0xff00ff;
							i_35_ = (i_38_ & 0xff00) * i_32_ & 0xff0000;
							is[i_6_++] = ((i_34_ | i_35_) >>> 8) + i_3_;
						}
						i_6_ += i_10_;
						i_7_ += i_11_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_4_ == 1) {
				if (i_2_ == 1) {
					for (int i_39_ = -i_8_; i_39_ < 0; i_39_++) {
						int i_40_ = i_6_ + i_9_ - 3;
						while (i_6_ < i_40_) {
							int i_41_ = (anIntArray6213[i_7_++]);
							if (i_41_ != 0) {
								is[i_6_++] = i_41_;
							} else {
								i_6_++;
							}
							i_41_ = (anIntArray6213[i_7_++]);
							if (i_41_ != 0) {
								is[i_6_++] = i_41_;
							} else {
								i_6_++;
							}
							i_41_ = (anIntArray6213[i_7_++]);
							if (i_41_ != 0) {
								is[i_6_++] = i_41_;
							} else {
								i_6_++;
							}
							i_41_ = (anIntArray6213[i_7_++]);
							if (i_41_ != 0) {
								is[i_6_++] = i_41_;
							} else {
								i_6_++;
							}
						}
						i_40_ += 3;
						while (i_6_ < i_40_) {
							final int i_42_ = (anIntArray6213[i_7_++]);
							if (i_42_ != 0) {
								is[i_6_++] = i_42_;
							} else {
								i_6_++;
							}
						}
						i_6_ += i_10_;
						i_7_ += i_11_;
					}
					return;
				}
				if (i_2_ == 0) {
					if ((i_3_ & 0xffffff) == 16777215) {
						final int i_43_ = i_3_ >>> 24;
						final int i_44_ = 256 - i_43_;
						for (int i_45_ = -i_8_; i_45_ < 0; i_45_++) {
							for (int i_46_ = -i_9_; i_46_ < 0; i_46_++) {
								final int i_47_ = (anIntArray6213[i_7_++]);
								if (i_47_ != 0) {
									final int i_48_ = is[i_6_];
									is[i_6_++] = ((((i_47_ & 0xff00ff) * i_43_ + (i_48_ & 0xff00ff)
											* i_44_) & ~0xff00ff) + (((i_47_ & 0xff00)
											* i_43_ + (i_48_ & 0xff00) * i_44_) & 0xff0000)) >> 8;
								} else {
									i_6_++;
								}
							}
							i_6_ += i_10_;
							i_7_ += i_11_;
						}
					} else {
						final int i_49_ = (i_3_ & 0xff0000) >> 16;
						final int i_50_ = (i_3_ & 0xff00) >> 8;
						final int i_51_ = i_3_ & 0xff;
						final int i_52_ = i_3_ >>> 24;
						final int i_53_ = 256 - i_52_;
						for (int i_54_ = -i_8_; i_54_ < 0; i_54_++) {
							for (int i_55_ = -i_9_; i_55_ < 0; i_55_++) {
								int i_56_ = (anIntArray6213[i_7_++]);
								if (i_56_ != 0) {
									if (i_52_ != 255) {
										final int i_57_ = ((i_56_ & 0xff0000)
												* i_49_ & ~0xffffff);
										final int i_58_ = ((i_56_ & 0xff00)
												* i_50_ & 0xff0000);
										final int i_59_ = (i_56_ & 0xff)
												* i_51_ & 0xff00;
										i_56_ = (i_57_ | i_58_ | i_59_) >>> 8;
										final int i_60_ = is[i_6_];
										is[i_6_++] = ((((i_56_ & 0xff00ff)
												* i_52_ + (i_60_ & 0xff00ff)
												* i_53_) & ~0xff00ff) + (((i_56_ & 0xff00)
												* i_52_ + (i_60_ & 0xff00)
												* i_53_) & 0xff0000)) >> 8;
									} else {
										final int i_61_ = ((i_56_ & 0xff0000)
												* i_49_ & ~0xffffff);
										final int i_62_ = ((i_56_ & 0xff00)
												* i_50_ & 0xff0000);
										final int i_63_ = (i_56_ & 0xff)
												* i_51_ & 0xff00;
										is[i_6_++] = (i_61_ | i_62_ | i_63_) >>> 8;
									}
								} else {
									i_6_++;
								}
							}
							i_6_ += i_10_;
							i_7_ += i_11_;
						}
						return;
					}
					return;
				}
				if (i_2_ == 3) {
					final int i_64_ = i_3_ >>> 24;
					final int i_65_ = 256 - i_64_;
					for (int i_66_ = -i_8_; i_66_ < 0; i_66_++) {
						for (int i_67_ = -i_9_; i_67_ < 0; i_67_++) {
							int i_68_ = (anIntArray6213[i_7_++]);
							final int i_69_ = i_68_ + i_3_;
							final int i_70_ = (i_68_ & 0xff00ff)
									+ (i_3_ & 0xff00ff);
							int i_71_ = ((i_70_ & 0x1000100) + (i_69_ - i_70_ & 0x10000));
							i_71_ = i_69_ - i_71_ | i_71_ - (i_71_ >>> 8);
							if (i_68_ == 0 && i_64_ != 255) {
								i_68_ = i_71_;
								i_71_ = is[i_6_];
								i_71_ = ((((i_68_ & 0xff00ff) * i_64_ + (i_71_ & 0xff00ff)
										* i_65_) & ~0xff00ff) + (((i_68_ & 0xff00)
										* i_64_ + (i_71_ & 0xff00) * i_65_) & 0xff0000)) >> 8;
							}
							is[i_6_++] = i_71_;
						}
						i_6_ += i_10_;
						i_7_ += i_11_;
					}
					return;
				}
				if (i_2_ == 2) {
					final int i_72_ = i_3_ >>> 24;
					final int i_73_ = 256 - i_72_;
					int i_74_ = (i_3_ & 0xff00ff) * i_73_ & ~0xff00ff;
					int i_75_ = (i_3_ & 0xff00) * i_73_ & 0xff0000;
					i_3_ = (i_74_ | i_75_) >>> 8;
					for (int i_76_ = -i_8_; i_76_ < 0; i_76_++) {
						for (int i_77_ = -i_9_; i_77_ < 0; i_77_++) {
							final int i_78_ = (anIntArray6213[i_7_++]);
							if (i_78_ != 0) {
								i_74_ = (i_78_ & 0xff00ff) * i_72_ & ~0xff00ff;
								i_75_ = (i_78_ & 0xff00) * i_72_ & 0xff0000;
								is[i_6_++] = ((i_74_ | i_75_) >>> 8) + i_3_;
							} else {
								i_6_++;
							}
						}
						i_6_ += i_10_;
						i_7_ += i_11_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_4_ == 2) {
				if (i_2_ == 1) {
					for (int i_79_ = -i_8_; i_79_ < 0; i_79_++) {
						for (int i_80_ = -i_9_; i_80_ < 0; i_80_++) {
							final int i_81_ = (anIntArray6213[i_7_++]);
							if (i_81_ != 0) {
								int i_82_ = is[i_6_];
								final int i_83_ = i_81_ + i_82_;
								final int i_84_ = (i_81_ & 0xff00ff)
										+ (i_82_ & 0xff00ff);
								i_82_ = (i_84_ & 0x1000100)
										+ (i_83_ - i_84_ & 0x10000);
								is[i_6_++] = i_83_ - i_82_ | i_82_
										- (i_82_ >>> 8);
							} else {
								i_6_++;
							}
						}
						i_6_ += i_10_;
						i_7_ += i_11_;
					}
					return;
				}
				if (i_2_ == 0) {
					final int i_85_ = (i_3_ & 0xff0000) >> 16;
					final int i_86_ = (i_3_ & 0xff00) >> 8;
					final int i_87_ = i_3_ & 0xff;
					for (int i_88_ = -i_8_; i_88_ < 0; i_88_++) {
						for (int i_89_ = -i_9_; i_89_ < 0; i_89_++) {
							int i_90_ = (anIntArray6213[i_7_++]);
							if (i_90_ != 0) {
								final int i_91_ = (i_90_ & 0xff0000) * i_85_
										& ~0xffffff;
								final int i_92_ = (i_90_ & 0xff00) * i_86_
										& 0xff0000;
								final int i_93_ = (i_90_ & 0xff) * i_87_
										& 0xff00;
								i_90_ = (i_91_ | i_92_ | i_93_) >>> 8;
								int i_94_ = is[i_6_];
								final int i_95_ = i_90_ + i_94_;
								final int i_96_ = (i_90_ & 0xff00ff)
										+ (i_94_ & 0xff00ff);
								i_94_ = (i_96_ & 0x1000100)
										+ (i_95_ - i_96_ & 0x10000);
								is[i_6_++] = i_95_ - i_94_ | i_94_
										- (i_94_ >>> 8);
							} else {
								i_6_++;
							}
						}
						i_6_ += i_10_;
						i_7_ += i_11_;
					}
					return;
				}
				if (i_2_ == 3) {
					for (int i_97_ = -i_8_; i_97_ < 0; i_97_++) {
						for (int i_98_ = -i_9_; i_98_ < 0; i_98_++) {
							int i_99_ = (anIntArray6213[i_7_++]);
							int i_100_ = i_99_ + i_3_;
							int i_101_ = (i_99_ & 0xff00ff) + (i_3_ & 0xff00ff);
							int i_102_ = ((i_101_ & 0x1000100) + (i_100_
									- i_101_ & 0x10000));
							i_99_ = i_100_ - i_102_ | i_102_ - (i_102_ >>> 8);
							i_102_ = is[i_6_];
							i_100_ = i_99_ + i_102_;
							i_101_ = (i_99_ & 0xff00ff) + (i_102_ & 0xff00ff);
							i_102_ = (i_101_ & 0x1000100)
									+ (i_100_ - i_101_ & 0x10000);
							is[i_6_++] = i_100_ - i_102_ | i_102_
									- (i_102_ >>> 8);
						}
						i_6_ += i_10_;
						i_7_ += i_11_;
					}
					return;
				}
				if (i_2_ == 2) {
					final int i_103_ = i_3_ >>> 24;
					final int i_104_ = 256 - i_103_;
					int i_105_ = (i_3_ & 0xff00ff) * i_104_ & ~0xff00ff;
					int i_106_ = (i_3_ & 0xff00) * i_104_ & 0xff0000;
					i_3_ = (i_105_ | i_106_) >>> 8;
					for (int i_107_ = -i_8_; i_107_ < 0; i_107_++) {
						for (int i_108_ = -i_9_; i_108_ < 0; i_108_++) {
							int i_109_ = (anIntArray6213[i_7_++]);
							if (i_109_ != 0) {
								i_105_ = (i_109_ & 0xff00ff) * i_103_
										& ~0xff00ff;
								i_106_ = (i_109_ & 0xff00) * i_103_ & 0xff0000;
								i_109_ = ((i_105_ | i_106_) >>> 8) + i_3_;
								int i_110_ = is[i_6_];
								final int i_111_ = i_109_ + i_110_;
								final int i_112_ = ((i_109_ & 0xff00ff) + (i_110_ & 0xff00ff));
								i_110_ = (i_112_ & 0x1000100)
										+ (i_111_ - i_112_ & 0x10000);
								is[i_6_++] = i_111_ - i_110_ | i_110_
										- (i_110_ >>> 8);
							} else {
								i_6_++;
							}
						}
						i_6_ += i_10_;
						i_7_ += i_11_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	Class332_Sub3_Sub2(final ha_Sub2 var_ha_Sub2, final int i, final int i_113_) {
		super(var_ha_Sub2, i, i_113_);
		anIntArray6213 = new int[i * i_113_];
	}

	@Override
	final void method3759(final int i, final int i_114_) {
		final int[] is = ((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504;
		if (Class332_Sub3.anInt5444 == 0) {
			if (Class332_Sub3.anInt5436 == 0) {
				int i_115_ = Class332_Sub3.anInt5431;
				while (i_115_ < 0) {
					int i_116_ = Class332_Sub3.anInt5451;
					final int i_117_ = Class332_Sub3.anInt5450;
					final int i_118_ = Class332_Sub3.anInt5443;
					int i_119_ = Class332_Sub3.anInt5448;
					if (i_117_ >= 0
							&& i_118_ >= 0
							&& (i_117_
									- (((Class332_Sub3) this).anInt5433 << 12) < 0)
							&& (i_118_
									- (((Class332_Sub3) this).anInt5454 << 12) < 0)) {
						for (/**/; i_119_ < 0; i_119_++) {
							int i_120_ = (((i_118_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_117_ >> 12));
							int i_121_ = i_116_++;
							final int[] is_122_ = is;
							final int i_123_ = i;
							final int i_124_ = i_114_;
							if (i_124_ == 0) {
								if (i_123_ == 1) {
									is_122_[i_121_] = (anIntArray6213[i_120_]);
								} else if (i_123_ == 0) {
									final int i_125_ = (anIntArray6213[i_120_++]);
									final int i_126_ = (((i_125_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_127_ = (((i_125_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_128_ = (((i_125_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_122_[i_121_] = (i_126_ | i_127_ | i_128_) >>> 8;
								} else if (i_123_ == 3) {
									final int i_129_ = (anIntArray6213[i_120_++]);
									final int i_130_ = Class332_Sub3.anInt5432;
									final int i_131_ = i_129_ + i_130_;
									final int i_132_ = ((i_129_ & 0xff00ff) + (i_130_ & 0xff00ff));
									final int i_133_ = ((i_132_ & 0x1000100) + (i_131_
											- i_132_ & 0x10000));
									is_122_[i_121_] = i_131_ - i_133_ | i_133_
											- (i_133_ >>> 8);
								} else if (i_123_ == 2) {
									final int i_134_ = (anIntArray6213[i_120_]);
									final int i_135_ = (((i_134_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_136_ = (((i_134_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_122_[i_121_] = (((i_135_ | i_136_) >>> 8) + Class332_Sub3.anInt5440);
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_124_ == 1) {
								if (i_123_ == 1) {
									final int i_137_ = (anIntArray6213[i_120_]);
									if (i_137_ != 0) {
										is_122_[i_121_] = i_137_;
									}
								} else if (i_123_ == 0) {
									int i_138_ = (anIntArray6213[i_120_]);
									if (i_138_ != 0) {
										if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
											final int i_139_ = (Class332_Sub3.anInt5432 >>> 24);
											final int i_140_ = 256 - i_139_;
											final int i_141_ = is_122_[i_121_];
											is_122_[i_121_] = (((((i_138_ & 0xff00ff) * i_139_) + ((i_141_ & 0xff00ff) * i_140_)) & ~0xff00ff) + ((((i_138_ & 0xff00) * i_139_) + ((i_141_ & 0xff00) * i_140_)) & 0xff0000)) >> 8;
										} else if (Class332_Sub3.anInt5449 != 255) {
											final int i_142_ = (((i_138_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_143_ = (((i_138_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_144_ = (((i_138_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											i_138_ = (i_142_ | i_143_ | i_144_) >>> 8;
											final int i_145_ = is_122_[i_121_];
											is_122_[i_121_] = (((((i_138_ & 0xff00ff) * (Class332_Sub3.anInt5449)) + ((i_145_ & 0xff00ff) * (Class332_Sub3.anInt5442))) & ~0xff00ff) + ((((i_138_ & 0xff00) * (Class332_Sub3.anInt5449)) + ((i_145_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
										} else {
											final int i_146_ = (((i_138_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_147_ = (((i_138_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_148_ = (((i_138_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											is_122_[i_121_] = (i_146_ | i_147_ | i_148_) >>> 8;
										}
									}
								} else if (i_123_ == 3) {
									int i_149_ = (anIntArray6213[i_120_]);
									final int i_150_ = Class332_Sub3.anInt5432;
									final int i_151_ = i_149_ + i_150_;
									final int i_152_ = ((i_149_ & 0xff00ff) + (i_150_ & 0xff00ff));
									int i_153_ = ((i_152_ & 0x1000100) + (i_151_
											- i_152_ & 0x10000));
									i_153_ = i_151_ - i_153_ | i_153_
											- (i_153_ >>> 8);
									if (i_149_ == 0
											&& Class332_Sub3.anInt5449 != 255) {
										i_149_ = i_153_;
										i_153_ = is_122_[i_121_];
										i_153_ = (((((i_149_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_153_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_149_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_153_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									}
									is_122_[i_121_] = i_153_;
								} else if (i_123_ == 2) {
									final int i_154_ = (anIntArray6213[i_120_]);
									if (i_154_ != 0) {
										final int i_155_ = (((i_154_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_156_ = (((i_154_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										is_122_[i_121_++] = (((i_155_ | i_156_) >>> 8) + Class332_Sub3.anInt5440);
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_124_ == 2) {
								if (i_123_ == 1) {
									final int i_157_ = (anIntArray6213[i_120_]);
									if (i_157_ != 0) {
										int i_158_ = is_122_[i_121_];
										final int i_159_ = i_157_ + i_158_;
										final int i_160_ = ((i_157_ & 0xff00ff) + (i_158_ & 0xff00ff));
										i_158_ = ((i_160_ & 0x1000100) + (i_159_
												- i_160_ & 0x10000));
										is_122_[i_121_] = (i_159_ - i_158_ | i_158_
												- (i_158_ >>> 8));
									}
								} else if (i_123_ == 0) {
									int i_161_ = (anIntArray6213[i_120_]);
									if (i_161_ != 0) {
										final int i_162_ = (((i_161_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_163_ = (((i_161_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_164_ = (((i_161_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_161_ = (i_162_ | i_163_ | i_164_) >>> 8;
										int i_165_ = is_122_[i_121_];
										final int i_166_ = i_161_ + i_165_;
										final int i_167_ = ((i_161_ & 0xff00ff) + (i_165_ & 0xff00ff));
										i_165_ = ((i_167_ & 0x1000100) + (i_166_
												- i_167_ & 0x10000));
										is_122_[i_121_] = (i_166_ - i_165_ | i_165_
												- (i_165_ >>> 8));
									}
								} else if (i_123_ == 3) {
									int i_168_ = (anIntArray6213[i_120_]);
									final int i_169_ = Class332_Sub3.anInt5432;
									int i_170_ = i_168_ + i_169_;
									int i_171_ = ((i_168_ & 0xff00ff) + (i_169_ & 0xff00ff));
									int i_172_ = ((i_171_ & 0x1000100) + (i_170_
											- i_171_ & 0x10000));
									i_168_ = i_170_ - i_172_ | i_172_
											- (i_172_ >>> 8);
									i_172_ = is_122_[i_121_];
									i_170_ = i_168_ + i_172_;
									i_171_ = (i_168_ & 0xff00ff)
											+ (i_172_ & 0xff00ff);
									i_172_ = ((i_171_ & 0x1000100) + (i_170_
											- i_171_ & 0x10000));
									is_122_[i_121_] = i_170_ - i_172_ | i_172_
											- (i_172_ >>> 8);
								} else if (i_123_ == 2) {
									int i_173_ = (anIntArray6213[i_120_]);
									if (i_173_ != 0) {
										final int i_174_ = (((i_173_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_175_ = (((i_173_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										i_173_ = (((i_174_ | i_175_) >>> 8) + Class332_Sub3.anInt5440);
										int i_176_ = is_122_[i_121_];
										final int i_177_ = i_173_ + i_176_;
										final int i_178_ = ((i_173_ & 0xff00ff) + (i_176_ & 0xff00ff));
										i_176_ = ((i_178_ & 0x1000100) + (i_177_
												- i_178_ & 0x10000));
										is_122_[i_121_] = (i_177_ - i_176_ | i_176_
												- (i_176_ >>> 8));
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
						}
					}
					i_115_++;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else if (Class332_Sub3.anInt5436 < 0) {
				int i_179_ = Class332_Sub3.anInt5431;
				while (i_179_ < 0) {
					int i_180_ = Class332_Sub3.anInt5451;
					final int i_181_ = Class332_Sub3.anInt5450;
					int i_182_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_183_ = Class332_Sub3.anInt5448;
					if (i_181_ >= 0
							&& (i_181_
									- (((Class332_Sub3) this).anInt5433 << 12) < 0)) {
						int i_184_;
						if ((i_184_ = i_182_
								- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
							i_184_ = ((Class332_Sub3.anInt5436 - i_184_) / Class332_Sub3.anInt5436);
							i_183_ += i_184_;
							i_182_ += Class332_Sub3.anInt5436 * i_184_;
							i_180_ += i_184_;
						}
						if ((i_184_ = ((i_182_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_183_) {
							i_183_ = i_184_;
						}
						for (/**/; i_183_ < 0; i_183_++) {
							int i_185_ = (((i_182_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_181_ >> 12));
							int i_186_ = i_180_++;
							final int[] is_187_ = is;
							final int i_188_ = i;
							final int i_189_ = i_114_;
							if (i_189_ == 0) {
								if (i_188_ == 1) {
									is_187_[i_186_] = (anIntArray6213[i_185_]);
								} else if (i_188_ == 0) {
									final int i_190_ = (anIntArray6213[i_185_++]);
									final int i_191_ = (((i_190_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_192_ = (((i_190_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_193_ = (((i_190_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_187_[i_186_] = (i_191_ | i_192_ | i_193_) >>> 8;
								} else if (i_188_ == 3) {
									final int i_194_ = (anIntArray6213[i_185_++]);
									final int i_195_ = Class332_Sub3.anInt5432;
									final int i_196_ = i_194_ + i_195_;
									final int i_197_ = ((i_194_ & 0xff00ff) + (i_195_ & 0xff00ff));
									final int i_198_ = ((i_197_ & 0x1000100) + (i_196_
											- i_197_ & 0x10000));
									is_187_[i_186_] = i_196_ - i_198_ | i_198_
											- (i_198_ >>> 8);
								} else if (i_188_ == 2) {
									final int i_199_ = (anIntArray6213[i_185_]);
									final int i_200_ = (((i_199_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_201_ = (((i_199_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_187_[i_186_] = (((i_200_ | i_201_) >>> 8) + Class332_Sub3.anInt5440);
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_189_ == 1) {
								if (i_188_ == 1) {
									final int i_202_ = (anIntArray6213[i_185_]);
									if (i_202_ != 0) {
										is_187_[i_186_] = i_202_;
									}
								} else if (i_188_ == 0) {
									int i_203_ = (anIntArray6213[i_185_]);
									if (i_203_ != 0) {
										if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
											final int i_204_ = (Class332_Sub3.anInt5432 >>> 24);
											final int i_205_ = 256 - i_204_;
											final int i_206_ = is_187_[i_186_];
											is_187_[i_186_] = (((((i_203_ & 0xff00ff) * i_204_) + ((i_206_ & 0xff00ff) * i_205_)) & ~0xff00ff) + ((((i_203_ & 0xff00) * i_204_) + ((i_206_ & 0xff00) * i_205_)) & 0xff0000)) >> 8;
										} else if (Class332_Sub3.anInt5449 != 255) {
											final int i_207_ = (((i_203_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_208_ = (((i_203_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_209_ = (((i_203_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											i_203_ = (i_207_ | i_208_ | i_209_) >>> 8;
											final int i_210_ = is_187_[i_186_];
											is_187_[i_186_] = (((((i_203_ & 0xff00ff) * (Class332_Sub3.anInt5449)) + ((i_210_ & 0xff00ff) * (Class332_Sub3.anInt5442))) & ~0xff00ff) + ((((i_203_ & 0xff00) * (Class332_Sub3.anInt5449)) + ((i_210_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
										} else {
											final int i_211_ = (((i_203_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_212_ = (((i_203_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_213_ = (((i_203_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											is_187_[i_186_] = (i_211_ | i_212_ | i_213_) >>> 8;
										}
									}
								} else if (i_188_ == 3) {
									int i_214_ = (anIntArray6213[i_185_]);
									final int i_215_ = Class332_Sub3.anInt5432;
									final int i_216_ = i_214_ + i_215_;
									final int i_217_ = ((i_214_ & 0xff00ff) + (i_215_ & 0xff00ff));
									int i_218_ = ((i_217_ & 0x1000100) + (i_216_
											- i_217_ & 0x10000));
									i_218_ = i_216_ - i_218_ | i_218_
											- (i_218_ >>> 8);
									if (i_214_ == 0
											&& Class332_Sub3.anInt5449 != 255) {
										i_214_ = i_218_;
										i_218_ = is_187_[i_186_];
										i_218_ = (((((i_214_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_218_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_214_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_218_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									}
									is_187_[i_186_] = i_218_;
								} else if (i_188_ == 2) {
									final int i_219_ = (anIntArray6213[i_185_]);
									if (i_219_ != 0) {
										final int i_220_ = (((i_219_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_221_ = (((i_219_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										is_187_[i_186_++] = (((i_220_ | i_221_) >>> 8) + Class332_Sub3.anInt5440);
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_189_ == 2) {
								if (i_188_ == 1) {
									final int i_222_ = (anIntArray6213[i_185_]);
									if (i_222_ != 0) {
										int i_223_ = is_187_[i_186_];
										final int i_224_ = i_222_ + i_223_;
										final int i_225_ = ((i_222_ & 0xff00ff) + (i_223_ & 0xff00ff));
										i_223_ = ((i_225_ & 0x1000100) + (i_224_
												- i_225_ & 0x10000));
										is_187_[i_186_] = (i_224_ - i_223_ | i_223_
												- (i_223_ >>> 8));
									}
								} else if (i_188_ == 0) {
									int i_226_ = (anIntArray6213[i_185_]);
									if (i_226_ != 0) {
										final int i_227_ = (((i_226_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_228_ = (((i_226_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_229_ = (((i_226_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_226_ = (i_227_ | i_228_ | i_229_) >>> 8;
										int i_230_ = is_187_[i_186_];
										final int i_231_ = i_226_ + i_230_;
										final int i_232_ = ((i_226_ & 0xff00ff) + (i_230_ & 0xff00ff));
										i_230_ = ((i_232_ & 0x1000100) + (i_231_
												- i_232_ & 0x10000));
										is_187_[i_186_] = (i_231_ - i_230_ | i_230_
												- (i_230_ >>> 8));
									}
								} else if (i_188_ == 3) {
									int i_233_ = (anIntArray6213[i_185_]);
									final int i_234_ = Class332_Sub3.anInt5432;
									int i_235_ = i_233_ + i_234_;
									int i_236_ = ((i_233_ & 0xff00ff) + (i_234_ & 0xff00ff));
									int i_237_ = ((i_236_ & 0x1000100) + (i_235_
											- i_236_ & 0x10000));
									i_233_ = i_235_ - i_237_ | i_237_
											- (i_237_ >>> 8);
									i_237_ = is_187_[i_186_];
									i_235_ = i_233_ + i_237_;
									i_236_ = (i_233_ & 0xff00ff)
											+ (i_237_ & 0xff00ff);
									i_237_ = ((i_236_ & 0x1000100) + (i_235_
											- i_236_ & 0x10000));
									is_187_[i_186_] = i_235_ - i_237_ | i_237_
											- (i_237_ >>> 8);
								} else if (i_188_ == 2) {
									int i_238_ = (anIntArray6213[i_185_]);
									if (i_238_ != 0) {
										final int i_239_ = (((i_238_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_240_ = (((i_238_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										i_238_ = (((i_239_ | i_240_) >>> 8) + Class332_Sub3.anInt5440);
										int i_241_ = is_187_[i_186_];
										final int i_242_ = i_238_ + i_241_;
										final int i_243_ = ((i_238_ & 0xff00ff) + (i_241_ & 0xff00ff));
										i_241_ = ((i_243_ & 0x1000100) + (i_242_
												- i_243_ & 0x10000));
										is_187_[i_186_] = (i_242_ - i_241_ | i_241_
												- (i_241_ >>> 8));
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_182_ += Class332_Sub3.anInt5436;
						}
					}
					i_179_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else {
				int i_244_ = Class332_Sub3.anInt5431;
				while (i_244_ < 0) {
					int i_245_ = Class332_Sub3.anInt5451;
					final int i_246_ = Class332_Sub3.anInt5450;
					int i_247_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_248_ = Class332_Sub3.anInt5448;
					if (i_246_ >= 0
							&& (i_246_
									- (((Class332_Sub3) this).anInt5433 << 12) < 0)) {
						if (i_247_ < 0) {
							final int i_249_ = ((Class332_Sub3.anInt5436 - 1 - i_247_) / Class332_Sub3.anInt5436);
							i_248_ += i_249_;
							i_247_ += Class332_Sub3.anInt5436 * i_249_;
							i_245_ += i_249_;
						}
						int i_250_;
						if ((i_250_ = ((1 + i_247_
								- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_248_) {
							i_248_ = i_250_;
						}
						for (/**/; i_248_ < 0; i_248_++) {
							int i_251_ = (((i_247_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_246_ >> 12));
							int i_252_ = i_245_++;
							final int[] is_253_ = is;
							final int i_254_ = i;
							final int i_255_ = i_114_;
							if (i_255_ == 0) {
								if (i_254_ == 1) {
									is_253_[i_252_] = (anIntArray6213[i_251_]);
								} else if (i_254_ == 0) {
									final int i_256_ = (anIntArray6213[i_251_++]);
									final int i_257_ = (((i_256_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_258_ = (((i_256_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_259_ = (((i_256_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_253_[i_252_] = (i_257_ | i_258_ | i_259_) >>> 8;
								} else if (i_254_ == 3) {
									final int i_260_ = (anIntArray6213[i_251_++]);
									final int i_261_ = Class332_Sub3.anInt5432;
									final int i_262_ = i_260_ + i_261_;
									final int i_263_ = ((i_260_ & 0xff00ff) + (i_261_ & 0xff00ff));
									final int i_264_ = ((i_263_ & 0x1000100) + (i_262_
											- i_263_ & 0x10000));
									is_253_[i_252_] = i_262_ - i_264_ | i_264_
											- (i_264_ >>> 8);
								} else if (i_254_ == 2) {
									final int i_265_ = (anIntArray6213[i_251_]);
									final int i_266_ = (((i_265_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_267_ = (((i_265_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_253_[i_252_] = (((i_266_ | i_267_) >>> 8) + Class332_Sub3.anInt5440);
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_255_ == 1) {
								if (i_254_ == 1) {
									final int i_268_ = (anIntArray6213[i_251_]);
									if (i_268_ != 0) {
										is_253_[i_252_] = i_268_;
									}
								} else if (i_254_ == 0) {
									int i_269_ = (anIntArray6213[i_251_]);
									if (i_269_ != 0) {
										if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
											final int i_270_ = (Class332_Sub3.anInt5432 >>> 24);
											final int i_271_ = 256 - i_270_;
											final int i_272_ = is_253_[i_252_];
											is_253_[i_252_] = (((((i_269_ & 0xff00ff) * i_270_) + ((i_272_ & 0xff00ff) * i_271_)) & ~0xff00ff) + ((((i_269_ & 0xff00) * i_270_) + ((i_272_ & 0xff00) * i_271_)) & 0xff0000)) >> 8;
										} else if (Class332_Sub3.anInt5449 != 255) {
											final int i_273_ = (((i_269_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_274_ = (((i_269_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_275_ = (((i_269_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											i_269_ = (i_273_ | i_274_ | i_275_) >>> 8;
											final int i_276_ = is_253_[i_252_];
											is_253_[i_252_] = (((((i_269_ & 0xff00ff) * (Class332_Sub3.anInt5449)) + ((i_276_ & 0xff00ff) * (Class332_Sub3.anInt5442))) & ~0xff00ff) + ((((i_269_ & 0xff00) * (Class332_Sub3.anInt5449)) + ((i_276_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
										} else {
											final int i_277_ = (((i_269_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_278_ = (((i_269_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_279_ = (((i_269_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											is_253_[i_252_] = (i_277_ | i_278_ | i_279_) >>> 8;
										}
									}
								} else if (i_254_ == 3) {
									int i_280_ = (anIntArray6213[i_251_]);
									final int i_281_ = Class332_Sub3.anInt5432;
									final int i_282_ = i_280_ + i_281_;
									final int i_283_ = ((i_280_ & 0xff00ff) + (i_281_ & 0xff00ff));
									int i_284_ = ((i_283_ & 0x1000100) + (i_282_
											- i_283_ & 0x10000));
									i_284_ = i_282_ - i_284_ | i_284_
											- (i_284_ >>> 8);
									if (i_280_ == 0
											&& Class332_Sub3.anInt5449 != 255) {
										i_280_ = i_284_;
										i_284_ = is_253_[i_252_];
										i_284_ = (((((i_280_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_284_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_280_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_284_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									}
									is_253_[i_252_] = i_284_;
								} else if (i_254_ == 2) {
									final int i_285_ = (anIntArray6213[i_251_]);
									if (i_285_ != 0) {
										final int i_286_ = (((i_285_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_287_ = (((i_285_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										is_253_[i_252_++] = (((i_286_ | i_287_) >>> 8) + Class332_Sub3.anInt5440);
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_255_ == 2) {
								if (i_254_ == 1) {
									final int i_288_ = (anIntArray6213[i_251_]);
									if (i_288_ != 0) {
										int i_289_ = is_253_[i_252_];
										final int i_290_ = i_288_ + i_289_;
										final int i_291_ = ((i_288_ & 0xff00ff) + (i_289_ & 0xff00ff));
										i_289_ = ((i_291_ & 0x1000100) + (i_290_
												- i_291_ & 0x10000));
										is_253_[i_252_] = (i_290_ - i_289_ | i_289_
												- (i_289_ >>> 8));
									}
								} else if (i_254_ == 0) {
									int i_292_ = (anIntArray6213[i_251_]);
									if (i_292_ != 0) {
										final int i_293_ = (((i_292_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_294_ = (((i_292_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_295_ = (((i_292_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_292_ = (i_293_ | i_294_ | i_295_) >>> 8;
										int i_296_ = is_253_[i_252_];
										final int i_297_ = i_292_ + i_296_;
										final int i_298_ = ((i_292_ & 0xff00ff) + (i_296_ & 0xff00ff));
										i_296_ = ((i_298_ & 0x1000100) + (i_297_
												- i_298_ & 0x10000));
										is_253_[i_252_] = (i_297_ - i_296_ | i_296_
												- (i_296_ >>> 8));
									}
								} else if (i_254_ == 3) {
									int i_299_ = (anIntArray6213[i_251_]);
									final int i_300_ = Class332_Sub3.anInt5432;
									int i_301_ = i_299_ + i_300_;
									int i_302_ = ((i_299_ & 0xff00ff) + (i_300_ & 0xff00ff));
									int i_303_ = ((i_302_ & 0x1000100) + (i_301_
											- i_302_ & 0x10000));
									i_299_ = i_301_ - i_303_ | i_303_
											- (i_303_ >>> 8);
									i_303_ = is_253_[i_252_];
									i_301_ = i_299_ + i_303_;
									i_302_ = (i_299_ & 0xff00ff)
											+ (i_303_ & 0xff00ff);
									i_303_ = ((i_302_ & 0x1000100) + (i_301_
											- i_302_ & 0x10000));
									is_253_[i_252_] = i_301_ - i_303_ | i_303_
											- (i_303_ >>> 8);
								} else if (i_254_ == 2) {
									int i_304_ = (anIntArray6213[i_251_]);
									if (i_304_ != 0) {
										final int i_305_ = (((i_304_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_306_ = (((i_304_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										i_304_ = (((i_305_ | i_306_) >>> 8) + Class332_Sub3.anInt5440);
										int i_307_ = is_253_[i_252_];
										final int i_308_ = i_304_ + i_307_;
										final int i_309_ = ((i_304_ & 0xff00ff) + (i_307_ & 0xff00ff));
										i_307_ = ((i_309_ & 0x1000100) + (i_308_
												- i_309_ & 0x10000));
										is_253_[i_252_] = (i_308_ - i_307_ | i_307_
												- (i_307_ >>> 8));
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_247_ += Class332_Sub3.anInt5436;
						}
					}
					i_244_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			}
		} else if (Class332_Sub3.anInt5444 < 0) {
			if (Class332_Sub3.anInt5436 == 0) {
				int i_310_ = Class332_Sub3.anInt5431;
				while (i_310_ < 0) {
					int i_311_ = Class332_Sub3.anInt5451;
					int i_312_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					final int i_313_ = Class332_Sub3.anInt5443;
					int i_314_ = Class332_Sub3.anInt5448;
					if (i_313_ >= 0
							&& (i_313_
									- (((Class332_Sub3) this).anInt5454 << 12) < 0)) {
						int i_315_;
						if ((i_315_ = i_312_
								- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
							i_315_ = ((Class332_Sub3.anInt5444 - i_315_) / Class332_Sub3.anInt5444);
							i_314_ += i_315_;
							i_312_ += Class332_Sub3.anInt5444 * i_315_;
							i_311_ += i_315_;
						}
						if ((i_315_ = ((i_312_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_314_) {
							i_314_ = i_315_;
						}
						for (/**/; i_314_ < 0; i_314_++) {
							int i_316_ = (((i_313_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_312_ >> 12));
							int i_317_ = i_311_++;
							final int[] is_318_ = is;
							final int i_319_ = i;
							final int i_320_ = i_114_;
							if (i_320_ == 0) {
								if (i_319_ == 1) {
									is_318_[i_317_] = (anIntArray6213[i_316_]);
								} else if (i_319_ == 0) {
									final int i_321_ = (anIntArray6213[i_316_++]);
									final int i_322_ = (((i_321_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_323_ = (((i_321_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_324_ = (((i_321_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_318_[i_317_] = (i_322_ | i_323_ | i_324_) >>> 8;
								} else if (i_319_ == 3) {
									final int i_325_ = (anIntArray6213[i_316_++]);
									final int i_326_ = Class332_Sub3.anInt5432;
									final int i_327_ = i_325_ + i_326_;
									final int i_328_ = ((i_325_ & 0xff00ff) + (i_326_ & 0xff00ff));
									final int i_329_ = ((i_328_ & 0x1000100) + (i_327_
											- i_328_ & 0x10000));
									is_318_[i_317_] = i_327_ - i_329_ | i_329_
											- (i_329_ >>> 8);
								} else if (i_319_ == 2) {
									final int i_330_ = (anIntArray6213[i_316_]);
									final int i_331_ = (((i_330_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_332_ = (((i_330_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_318_[i_317_] = (((i_331_ | i_332_) >>> 8) + Class332_Sub3.anInt5440);
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_320_ == 1) {
								if (i_319_ == 1) {
									final int i_333_ = (anIntArray6213[i_316_]);
									if (i_333_ != 0) {
										is_318_[i_317_] = i_333_;
									}
								} else if (i_319_ == 0) {
									int i_334_ = (anIntArray6213[i_316_]);
									if (i_334_ != 0) {
										if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
											final int i_335_ = (Class332_Sub3.anInt5432 >>> 24);
											final int i_336_ = 256 - i_335_;
											final int i_337_ = is_318_[i_317_];
											is_318_[i_317_] = (((((i_334_ & 0xff00ff) * i_335_) + ((i_337_ & 0xff00ff) * i_336_)) & ~0xff00ff) + ((((i_334_ & 0xff00) * i_335_) + ((i_337_ & 0xff00) * i_336_)) & 0xff0000)) >> 8;
										} else if (Class332_Sub3.anInt5449 != 255) {
											final int i_338_ = (((i_334_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_339_ = (((i_334_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_340_ = (((i_334_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											i_334_ = (i_338_ | i_339_ | i_340_) >>> 8;
											final int i_341_ = is_318_[i_317_];
											is_318_[i_317_] = (((((i_334_ & 0xff00ff) * (Class332_Sub3.anInt5449)) + ((i_341_ & 0xff00ff) * (Class332_Sub3.anInt5442))) & ~0xff00ff) + ((((i_334_ & 0xff00) * (Class332_Sub3.anInt5449)) + ((i_341_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
										} else {
											final int i_342_ = (((i_334_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_343_ = (((i_334_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_344_ = (((i_334_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											is_318_[i_317_] = (i_342_ | i_343_ | i_344_) >>> 8;
										}
									}
								} else if (i_319_ == 3) {
									int i_345_ = (anIntArray6213[i_316_]);
									final int i_346_ = Class332_Sub3.anInt5432;
									final int i_347_ = i_345_ + i_346_;
									final int i_348_ = ((i_345_ & 0xff00ff) + (i_346_ & 0xff00ff));
									int i_349_ = ((i_348_ & 0x1000100) + (i_347_
											- i_348_ & 0x10000));
									i_349_ = i_347_ - i_349_ | i_349_
											- (i_349_ >>> 8);
									if (i_345_ == 0
											&& Class332_Sub3.anInt5449 != 255) {
										i_345_ = i_349_;
										i_349_ = is_318_[i_317_];
										i_349_ = (((((i_345_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_349_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_345_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_349_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									}
									is_318_[i_317_] = i_349_;
								} else if (i_319_ == 2) {
									final int i_350_ = (anIntArray6213[i_316_]);
									if (i_350_ != 0) {
										final int i_351_ = (((i_350_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_352_ = (((i_350_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										is_318_[i_317_++] = (((i_351_ | i_352_) >>> 8) + Class332_Sub3.anInt5440);
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_320_ == 2) {
								if (i_319_ == 1) {
									final int i_353_ = (anIntArray6213[i_316_]);
									if (i_353_ != 0) {
										int i_354_ = is_318_[i_317_];
										final int i_355_ = i_353_ + i_354_;
										final int i_356_ = ((i_353_ & 0xff00ff) + (i_354_ & 0xff00ff));
										i_354_ = ((i_356_ & 0x1000100) + (i_355_
												- i_356_ & 0x10000));
										is_318_[i_317_] = (i_355_ - i_354_ | i_354_
												- (i_354_ >>> 8));
									}
								} else if (i_319_ == 0) {
									int i_357_ = (anIntArray6213[i_316_]);
									if (i_357_ != 0) {
										final int i_358_ = (((i_357_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_359_ = (((i_357_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_360_ = (((i_357_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_357_ = (i_358_ | i_359_ | i_360_) >>> 8;
										int i_361_ = is_318_[i_317_];
										final int i_362_ = i_357_ + i_361_;
										final int i_363_ = ((i_357_ & 0xff00ff) + (i_361_ & 0xff00ff));
										i_361_ = ((i_363_ & 0x1000100) + (i_362_
												- i_363_ & 0x10000));
										is_318_[i_317_] = (i_362_ - i_361_ | i_361_
												- (i_361_ >>> 8));
									}
								} else if (i_319_ == 3) {
									int i_364_ = (anIntArray6213[i_316_]);
									final int i_365_ = Class332_Sub3.anInt5432;
									int i_366_ = i_364_ + i_365_;
									int i_367_ = ((i_364_ & 0xff00ff) + (i_365_ & 0xff00ff));
									int i_368_ = ((i_367_ & 0x1000100) + (i_366_
											- i_367_ & 0x10000));
									i_364_ = i_366_ - i_368_ | i_368_
											- (i_368_ >>> 8);
									i_368_ = is_318_[i_317_];
									i_366_ = i_364_ + i_368_;
									i_367_ = (i_364_ & 0xff00ff)
											+ (i_368_ & 0xff00ff);
									i_368_ = ((i_367_ & 0x1000100) + (i_366_
											- i_367_ & 0x10000));
									is_318_[i_317_] = i_366_ - i_368_ | i_368_
											- (i_368_ >>> 8);
								} else if (i_319_ == 2) {
									int i_369_ = (anIntArray6213[i_316_]);
									if (i_369_ != 0) {
										final int i_370_ = (((i_369_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_371_ = (((i_369_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										i_369_ = (((i_370_ | i_371_) >>> 8) + Class332_Sub3.anInt5440);
										int i_372_ = is_318_[i_317_];
										final int i_373_ = i_369_ + i_372_;
										final int i_374_ = ((i_369_ & 0xff00ff) + (i_372_ & 0xff00ff));
										i_372_ = ((i_374_ & 0x1000100) + (i_373_
												- i_374_ & 0x10000));
										is_318_[i_317_] = (i_373_ - i_372_ | i_372_
												- (i_372_ >>> 8));
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_312_ += Class332_Sub3.anInt5444;
						}
					}
					i_310_++;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else if (Class332_Sub3.anInt5436 < 0) {
				int i_375_ = Class332_Sub3.anInt5431;
				while (i_375_ < 0) {
					int i_376_ = Class332_Sub3.anInt5451;
					int i_377_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_378_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_379_ = Class332_Sub3.anInt5448;
					int i_380_;
					if ((i_380_ = i_377_
							- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
						i_380_ = ((Class332_Sub3.anInt5444 - i_380_) / Class332_Sub3.anInt5444);
						i_379_ += i_380_;
						i_377_ += Class332_Sub3.anInt5444 * i_380_;
						i_378_ += Class332_Sub3.anInt5436 * i_380_;
						i_376_ += i_380_;
					}
					if ((i_380_ = ((i_377_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_379_) {
						i_379_ = i_380_;
					}
					if ((i_380_ = i_378_
							- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
						i_380_ = ((Class332_Sub3.anInt5436 - i_380_) / Class332_Sub3.anInt5436);
						i_379_ += i_380_;
						i_377_ += Class332_Sub3.anInt5444 * i_380_;
						i_378_ += Class332_Sub3.anInt5436 * i_380_;
						i_376_ += i_380_;
					}
					if ((i_380_ = ((i_378_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_379_) {
						i_379_ = i_380_;
					}
					for (/**/; i_379_ < 0; i_379_++) {
						int i_381_ = (((i_378_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_377_ >> 12));
						int i_382_ = i_376_++;
						final int[] is_383_ = is;
						final int i_384_ = i;
						final int i_385_ = i_114_;
						if (i_385_ == 0) {
							if (i_384_ == 1) {
								is_383_[i_382_] = (anIntArray6213[i_381_]);
							} else if (i_384_ == 0) {
								final int i_386_ = (anIntArray6213[i_381_++]);
								final int i_387_ = (((i_386_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_388_ = (((i_386_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_389_ = (((i_386_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								is_383_[i_382_] = (i_387_ | i_388_ | i_389_) >>> 8;
							} else if (i_384_ == 3) {
								final int i_390_ = (anIntArray6213[i_381_++]);
								final int i_391_ = Class332_Sub3.anInt5432;
								final int i_392_ = i_390_ + i_391_;
								final int i_393_ = ((i_390_ & 0xff00ff) + (i_391_ & 0xff00ff));
								final int i_394_ = ((i_393_ & 0x1000100) + (i_392_
										- i_393_ & 0x10000));
								is_383_[i_382_] = i_392_ - i_394_ | i_394_
										- (i_394_ >>> 8);
							} else if (i_384_ == 2) {
								final int i_395_ = (anIntArray6213[i_381_]);
								final int i_396_ = (((i_395_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_397_ = (((i_395_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								is_383_[i_382_] = (((i_396_ | i_397_) >>> 8) + Class332_Sub3.anInt5440);
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_385_ == 1) {
							if (i_384_ == 1) {
								final int i_398_ = (anIntArray6213[i_381_]);
								if (i_398_ != 0) {
									is_383_[i_382_] = i_398_;
								}
							} else if (i_384_ == 0) {
								int i_399_ = (anIntArray6213[i_381_]);
								if (i_399_ != 0) {
									if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
										final int i_400_ = Class332_Sub3.anInt5432 >>> 24;
										final int i_401_ = 256 - i_400_;
										final int i_402_ = is_383_[i_382_];
										is_383_[i_382_] = ((((i_399_ & 0xff00ff)
												* i_400_ + ((i_402_ & 0xff00ff) * i_401_)) & ~0xff00ff) + (((i_399_ & 0xff00)
												* i_400_ + ((i_402_ & 0xff00) * i_401_)) & 0xff0000)) >> 8;
									} else if (Class332_Sub3.anInt5449 != 255) {
										final int i_403_ = (((i_399_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_404_ = (((i_399_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_405_ = (((i_399_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_399_ = (i_403_ | i_404_ | i_405_) >>> 8;
										final int i_406_ = is_383_[i_382_];
										is_383_[i_382_] = (((((i_399_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_406_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_399_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_406_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									} else {
										final int i_407_ = (((i_399_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_408_ = (((i_399_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_409_ = (((i_399_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										is_383_[i_382_] = (i_407_ | i_408_ | i_409_) >>> 8;
									}
								}
							} else if (i_384_ == 3) {
								int i_410_ = (anIntArray6213[i_381_]);
								final int i_411_ = Class332_Sub3.anInt5432;
								final int i_412_ = i_410_ + i_411_;
								final int i_413_ = ((i_410_ & 0xff00ff) + (i_411_ & 0xff00ff));
								int i_414_ = ((i_413_ & 0x1000100) + (i_412_
										- i_413_ & 0x10000));
								i_414_ = i_412_ - i_414_ | i_414_
										- (i_414_ >>> 8);
								if (i_410_ == 0
										&& Class332_Sub3.anInt5449 != 255) {
									i_410_ = i_414_;
									i_414_ = is_383_[i_382_];
									i_414_ = (((((i_410_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_414_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_410_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_414_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
								}
								is_383_[i_382_] = i_414_;
							} else if (i_384_ == 2) {
								final int i_415_ = (anIntArray6213[i_381_]);
								if (i_415_ != 0) {
									final int i_416_ = (((i_415_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_417_ = (((i_415_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_383_[i_382_++] = (((i_416_ | i_417_) >>> 8) + Class332_Sub3.anInt5440);
								}
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_385_ == 2) {
							if (i_384_ == 1) {
								final int i_418_ = (anIntArray6213[i_381_]);
								if (i_418_ != 0) {
									int i_419_ = is_383_[i_382_];
									final int i_420_ = i_418_ + i_419_;
									final int i_421_ = ((i_418_ & 0xff00ff) + (i_419_ & 0xff00ff));
									i_419_ = ((i_421_ & 0x1000100) + (i_420_
											- i_421_ & 0x10000));
									is_383_[i_382_] = i_420_ - i_419_ | i_419_
											- (i_419_ >>> 8);
								}
							} else if (i_384_ == 0) {
								int i_422_ = (anIntArray6213[i_381_]);
								if (i_422_ != 0) {
									final int i_423_ = (((i_422_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_424_ = (((i_422_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_425_ = (((i_422_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_422_ = (i_423_ | i_424_ | i_425_) >>> 8;
									int i_426_ = is_383_[i_382_];
									final int i_427_ = i_422_ + i_426_;
									final int i_428_ = ((i_422_ & 0xff00ff) + (i_426_ & 0xff00ff));
									i_426_ = ((i_428_ & 0x1000100) + (i_427_
											- i_428_ & 0x10000));
									is_383_[i_382_] = i_427_ - i_426_ | i_426_
											- (i_426_ >>> 8);
								}
							} else if (i_384_ == 3) {
								int i_429_ = (anIntArray6213[i_381_]);
								final int i_430_ = Class332_Sub3.anInt5432;
								int i_431_ = i_429_ + i_430_;
								int i_432_ = ((i_429_ & 0xff00ff) + (i_430_ & 0xff00ff));
								int i_433_ = ((i_432_ & 0x1000100) + (i_431_
										- i_432_ & 0x10000));
								i_429_ = i_431_ - i_433_ | i_433_
										- (i_433_ >>> 8);
								i_433_ = is_383_[i_382_];
								i_431_ = i_429_ + i_433_;
								i_432_ = (i_429_ & 0xff00ff)
										+ (i_433_ & 0xff00ff);
								i_433_ = (i_432_ & 0x1000100)
										+ (i_431_ - i_432_ & 0x10000);
								is_383_[i_382_] = i_431_ - i_433_ | i_433_
										- (i_433_ >>> 8);
							} else if (i_384_ == 2) {
								int i_434_ = (anIntArray6213[i_381_]);
								if (i_434_ != 0) {
									final int i_435_ = (((i_434_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_436_ = (((i_434_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_434_ = (((i_435_ | i_436_) >>> 8) + Class332_Sub3.anInt5440);
									int i_437_ = is_383_[i_382_];
									final int i_438_ = i_434_ + i_437_;
									final int i_439_ = ((i_434_ & 0xff00ff) + (i_437_ & 0xff00ff));
									i_437_ = ((i_439_ & 0x1000100) + (i_438_
											- i_439_ & 0x10000));
									is_383_[i_382_] = i_438_ - i_437_ | i_437_
											- (i_437_ >>> 8);
								}
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_377_ += Class332_Sub3.anInt5444;
						i_378_ += Class332_Sub3.anInt5436;
					}
					i_375_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else {
				int i_440_ = Class332_Sub3.anInt5431;
				while (i_440_ < 0) {
					int i_441_ = Class332_Sub3.anInt5451;
					int i_442_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_443_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_444_ = Class332_Sub3.anInt5448;
					int i_445_;
					if ((i_445_ = i_442_
							- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
						i_445_ = ((Class332_Sub3.anInt5444 - i_445_) / Class332_Sub3.anInt5444);
						i_444_ += i_445_;
						i_442_ += Class332_Sub3.anInt5444 * i_445_;
						i_443_ += Class332_Sub3.anInt5436 * i_445_;
						i_441_ += i_445_;
					}
					if ((i_445_ = ((i_442_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_444_) {
						i_444_ = i_445_;
					}
					if (i_443_ < 0) {
						i_445_ = ((Class332_Sub3.anInt5436 - 1 - i_443_) / Class332_Sub3.anInt5436);
						i_444_ += i_445_;
						i_442_ += Class332_Sub3.anInt5444 * i_445_;
						i_443_ += Class332_Sub3.anInt5436 * i_445_;
						i_441_ += i_445_;
					}
					if ((i_445_ = ((1 + i_443_
							- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_444_) {
						i_444_ = i_445_;
					}
					for (/**/; i_444_ < 0; i_444_++) {
						int i_446_ = (((i_443_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_442_ >> 12));
						int i_447_ = i_441_++;
						final int[] is_448_ = is;
						final int i_449_ = i;
						final int i_450_ = i_114_;
						if (i_450_ == 0) {
							if (i_449_ == 1) {
								is_448_[i_447_] = (anIntArray6213[i_446_]);
							} else if (i_449_ == 0) {
								final int i_451_ = (anIntArray6213[i_446_++]);
								final int i_452_ = (((i_451_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_453_ = (((i_451_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_454_ = (((i_451_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								is_448_[i_447_] = (i_452_ | i_453_ | i_454_) >>> 8;
							} else if (i_449_ == 3) {
								final int i_455_ = (anIntArray6213[i_446_++]);
								final int i_456_ = Class332_Sub3.anInt5432;
								final int i_457_ = i_455_ + i_456_;
								final int i_458_ = ((i_455_ & 0xff00ff) + (i_456_ & 0xff00ff));
								final int i_459_ = ((i_458_ & 0x1000100) + (i_457_
										- i_458_ & 0x10000));
								is_448_[i_447_] = i_457_ - i_459_ | i_459_
										- (i_459_ >>> 8);
							} else if (i_449_ == 2) {
								final int i_460_ = (anIntArray6213[i_446_]);
								final int i_461_ = (((i_460_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_462_ = (((i_460_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								is_448_[i_447_] = (((i_461_ | i_462_) >>> 8) + Class332_Sub3.anInt5440);
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_450_ == 1) {
							if (i_449_ == 1) {
								final int i_463_ = (anIntArray6213[i_446_]);
								if (i_463_ != 0) {
									is_448_[i_447_] = i_463_;
								}
							} else if (i_449_ == 0) {
								int i_464_ = (anIntArray6213[i_446_]);
								if (i_464_ != 0) {
									if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
										final int i_465_ = Class332_Sub3.anInt5432 >>> 24;
										final int i_466_ = 256 - i_465_;
										final int i_467_ = is_448_[i_447_];
										is_448_[i_447_] = ((((i_464_ & 0xff00ff)
												* i_465_ + ((i_467_ & 0xff00ff) * i_466_)) & ~0xff00ff) + (((i_464_ & 0xff00)
												* i_465_ + ((i_467_ & 0xff00) * i_466_)) & 0xff0000)) >> 8;
									} else if (Class332_Sub3.anInt5449 != 255) {
										final int i_468_ = (((i_464_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_469_ = (((i_464_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_470_ = (((i_464_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_464_ = (i_468_ | i_469_ | i_470_) >>> 8;
										final int i_471_ = is_448_[i_447_];
										is_448_[i_447_] = (((((i_464_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_471_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_464_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_471_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									} else {
										final int i_472_ = (((i_464_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_473_ = (((i_464_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_474_ = (((i_464_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										is_448_[i_447_] = (i_472_ | i_473_ | i_474_) >>> 8;
									}
								}
							} else if (i_449_ == 3) {
								int i_475_ = (anIntArray6213[i_446_]);
								final int i_476_ = Class332_Sub3.anInt5432;
								final int i_477_ = i_475_ + i_476_;
								final int i_478_ = ((i_475_ & 0xff00ff) + (i_476_ & 0xff00ff));
								int i_479_ = ((i_478_ & 0x1000100) + (i_477_
										- i_478_ & 0x10000));
								i_479_ = i_477_ - i_479_ | i_479_
										- (i_479_ >>> 8);
								if (i_475_ == 0
										&& Class332_Sub3.anInt5449 != 255) {
									i_475_ = i_479_;
									i_479_ = is_448_[i_447_];
									i_479_ = (((((i_475_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_479_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_475_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_479_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
								}
								is_448_[i_447_] = i_479_;
							} else if (i_449_ == 2) {
								final int i_480_ = (anIntArray6213[i_446_]);
								if (i_480_ != 0) {
									final int i_481_ = (((i_480_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_482_ = (((i_480_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_448_[i_447_++] = (((i_481_ | i_482_) >>> 8) + Class332_Sub3.anInt5440);
								}
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_450_ == 2) {
							if (i_449_ == 1) {
								final int i_483_ = (anIntArray6213[i_446_]);
								if (i_483_ != 0) {
									int i_484_ = is_448_[i_447_];
									final int i_485_ = i_483_ + i_484_;
									final int i_486_ = ((i_483_ & 0xff00ff) + (i_484_ & 0xff00ff));
									i_484_ = ((i_486_ & 0x1000100) + (i_485_
											- i_486_ & 0x10000));
									is_448_[i_447_] = i_485_ - i_484_ | i_484_
											- (i_484_ >>> 8);
								}
							} else if (i_449_ == 0) {
								int i_487_ = (anIntArray6213[i_446_]);
								if (i_487_ != 0) {
									final int i_488_ = (((i_487_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_489_ = (((i_487_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_490_ = (((i_487_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_487_ = (i_488_ | i_489_ | i_490_) >>> 8;
									int i_491_ = is_448_[i_447_];
									final int i_492_ = i_487_ + i_491_;
									final int i_493_ = ((i_487_ & 0xff00ff) + (i_491_ & 0xff00ff));
									i_491_ = ((i_493_ & 0x1000100) + (i_492_
											- i_493_ & 0x10000));
									is_448_[i_447_] = i_492_ - i_491_ | i_491_
											- (i_491_ >>> 8);
								}
							} else if (i_449_ == 3) {
								int i_494_ = (anIntArray6213[i_446_]);
								final int i_495_ = Class332_Sub3.anInt5432;
								int i_496_ = i_494_ + i_495_;
								int i_497_ = ((i_494_ & 0xff00ff) + (i_495_ & 0xff00ff));
								int i_498_ = ((i_497_ & 0x1000100) + (i_496_
										- i_497_ & 0x10000));
								i_494_ = i_496_ - i_498_ | i_498_
										- (i_498_ >>> 8);
								i_498_ = is_448_[i_447_];
								i_496_ = i_494_ + i_498_;
								i_497_ = (i_494_ & 0xff00ff)
										+ (i_498_ & 0xff00ff);
								i_498_ = (i_497_ & 0x1000100)
										+ (i_496_ - i_497_ & 0x10000);
								is_448_[i_447_] = i_496_ - i_498_ | i_498_
										- (i_498_ >>> 8);
							} else if (i_449_ == 2) {
								int i_499_ = (anIntArray6213[i_446_]);
								if (i_499_ != 0) {
									final int i_500_ = (((i_499_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_501_ = (((i_499_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_499_ = (((i_500_ | i_501_) >>> 8) + Class332_Sub3.anInt5440);
									int i_502_ = is_448_[i_447_];
									final int i_503_ = i_499_ + i_502_;
									final int i_504_ = ((i_499_ & 0xff00ff) + (i_502_ & 0xff00ff));
									i_502_ = ((i_504_ & 0x1000100) + (i_503_
											- i_504_ & 0x10000));
									is_448_[i_447_] = i_503_ - i_502_ | i_502_
											- (i_502_ >>> 8);
								}
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_442_ += Class332_Sub3.anInt5444;
						i_443_ += Class332_Sub3.anInt5436;
					}
					i_440_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			}
		} else if (Class332_Sub3.anInt5436 == 0) {
			int i_505_ = Class332_Sub3.anInt5431;
			while (i_505_ < 0) {
				int i_506_ = Class332_Sub3.anInt5451;
				int i_507_ = Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425;
				final int i_508_ = Class332_Sub3.anInt5443;
				int i_509_ = Class332_Sub3.anInt5448;
				if (i_508_ >= 0
						&& i_508_ - (((Class332_Sub3) this).anInt5454 << 12) < 0) {
					if (i_507_ < 0) {
						final int i_510_ = ((Class332_Sub3.anInt5444 - 1 - i_507_) / Class332_Sub3.anInt5444);
						i_509_ += i_510_;
						i_507_ += Class332_Sub3.anInt5444 * i_510_;
						i_506_ += i_510_;
					}
					int i_511_;
					if ((i_511_ = ((1 + i_507_
							- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_509_) {
						i_509_ = i_511_;
					}
					for (/**/; i_509_ < 0; i_509_++) {
						int i_512_ = (((i_508_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_507_ >> 12));
						int i_513_ = i_506_++;
						final int[] is_514_ = is;
						final int i_515_ = i;
						final int i_516_ = i_114_;
						if (i_516_ == 0) {
							if (i_515_ == 1) {
								is_514_[i_513_] = (anIntArray6213[i_512_]);
							} else if (i_515_ == 0) {
								final int i_517_ = (anIntArray6213[i_512_++]);
								final int i_518_ = (((i_517_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_519_ = (((i_517_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_520_ = (((i_517_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								is_514_[i_513_] = (i_518_ | i_519_ | i_520_) >>> 8;
							} else if (i_515_ == 3) {
								final int i_521_ = (anIntArray6213[i_512_++]);
								final int i_522_ = Class332_Sub3.anInt5432;
								final int i_523_ = i_521_ + i_522_;
								final int i_524_ = ((i_521_ & 0xff00ff) + (i_522_ & 0xff00ff));
								final int i_525_ = ((i_524_ & 0x1000100) + (i_523_
										- i_524_ & 0x10000));
								is_514_[i_513_] = i_523_ - i_525_ | i_525_
										- (i_525_ >>> 8);
							} else if (i_515_ == 2) {
								final int i_526_ = (anIntArray6213[i_512_]);
								final int i_527_ = (((i_526_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_528_ = (((i_526_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								is_514_[i_513_] = (((i_527_ | i_528_) >>> 8) + Class332_Sub3.anInt5440);
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_516_ == 1) {
							if (i_515_ == 1) {
								final int i_529_ = (anIntArray6213[i_512_]);
								if (i_529_ != 0) {
									is_514_[i_513_] = i_529_;
								}
							} else if (i_515_ == 0) {
								int i_530_ = (anIntArray6213[i_512_]);
								if (i_530_ != 0) {
									if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
										final int i_531_ = Class332_Sub3.anInt5432 >>> 24;
										final int i_532_ = 256 - i_531_;
										final int i_533_ = is_514_[i_513_];
										is_514_[i_513_] = ((((i_530_ & 0xff00ff)
												* i_531_ + ((i_533_ & 0xff00ff) * i_532_)) & ~0xff00ff) + (((i_530_ & 0xff00)
												* i_531_ + ((i_533_ & 0xff00) * i_532_)) & 0xff0000)) >> 8;
									} else if (Class332_Sub3.anInt5449 != 255) {
										final int i_534_ = (((i_530_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_535_ = (((i_530_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_536_ = (((i_530_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_530_ = (i_534_ | i_535_ | i_536_) >>> 8;
										final int i_537_ = is_514_[i_513_];
										is_514_[i_513_] = (((((i_530_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_537_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_530_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_537_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									} else {
										final int i_538_ = (((i_530_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_539_ = (((i_530_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_540_ = (((i_530_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										is_514_[i_513_] = (i_538_ | i_539_ | i_540_) >>> 8;
									}
								}
							} else if (i_515_ == 3) {
								int i_541_ = (anIntArray6213[i_512_]);
								final int i_542_ = Class332_Sub3.anInt5432;
								final int i_543_ = i_541_ + i_542_;
								final int i_544_ = ((i_541_ & 0xff00ff) + (i_542_ & 0xff00ff));
								int i_545_ = ((i_544_ & 0x1000100) + (i_543_
										- i_544_ & 0x10000));
								i_545_ = i_543_ - i_545_ | i_545_
										- (i_545_ >>> 8);
								if (i_541_ == 0
										&& Class332_Sub3.anInt5449 != 255) {
									i_541_ = i_545_;
									i_545_ = is_514_[i_513_];
									i_545_ = (((((i_541_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_545_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_541_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_545_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
								}
								is_514_[i_513_] = i_545_;
							} else if (i_515_ == 2) {
								final int i_546_ = (anIntArray6213[i_512_]);
								if (i_546_ != 0) {
									final int i_547_ = (((i_546_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_548_ = (((i_546_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_514_[i_513_++] = (((i_547_ | i_548_) >>> 8) + Class332_Sub3.anInt5440);
								}
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_516_ == 2) {
							if (i_515_ == 1) {
								final int i_549_ = (anIntArray6213[i_512_]);
								if (i_549_ != 0) {
									int i_550_ = is_514_[i_513_];
									final int i_551_ = i_549_ + i_550_;
									final int i_552_ = ((i_549_ & 0xff00ff) + (i_550_ & 0xff00ff));
									i_550_ = ((i_552_ & 0x1000100) + (i_551_
											- i_552_ & 0x10000));
									is_514_[i_513_] = i_551_ - i_550_ | i_550_
											- (i_550_ >>> 8);
								}
							} else if (i_515_ == 0) {
								int i_553_ = (anIntArray6213[i_512_]);
								if (i_553_ != 0) {
									final int i_554_ = (((i_553_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_555_ = (((i_553_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_556_ = (((i_553_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_553_ = (i_554_ | i_555_ | i_556_) >>> 8;
									int i_557_ = is_514_[i_513_];
									final int i_558_ = i_553_ + i_557_;
									final int i_559_ = ((i_553_ & 0xff00ff) + (i_557_ & 0xff00ff));
									i_557_ = ((i_559_ & 0x1000100) + (i_558_
											- i_559_ & 0x10000));
									is_514_[i_513_] = i_558_ - i_557_ | i_557_
											- (i_557_ >>> 8);
								}
							} else if (i_515_ == 3) {
								int i_560_ = (anIntArray6213[i_512_]);
								final int i_561_ = Class332_Sub3.anInt5432;
								int i_562_ = i_560_ + i_561_;
								int i_563_ = ((i_560_ & 0xff00ff) + (i_561_ & 0xff00ff));
								int i_564_ = ((i_563_ & 0x1000100) + (i_562_
										- i_563_ & 0x10000));
								i_560_ = i_562_ - i_564_ | i_564_
										- (i_564_ >>> 8);
								i_564_ = is_514_[i_513_];
								i_562_ = i_560_ + i_564_;
								i_563_ = (i_560_ & 0xff00ff)
										+ (i_564_ & 0xff00ff);
								i_564_ = (i_563_ & 0x1000100)
										+ (i_562_ - i_563_ & 0x10000);
								is_514_[i_513_] = i_562_ - i_564_ | i_564_
										- (i_564_ >>> 8);
							} else if (i_515_ == 2) {
								int i_565_ = (anIntArray6213[i_512_]);
								if (i_565_ != 0) {
									final int i_566_ = (((i_565_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_567_ = (((i_565_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_565_ = (((i_566_ | i_567_) >>> 8) + Class332_Sub3.anInt5440);
									int i_568_ = is_514_[i_513_];
									final int i_569_ = i_565_ + i_568_;
									final int i_570_ = ((i_565_ & 0xff00ff) + (i_568_ & 0xff00ff));
									i_568_ = ((i_570_ & 0x1000100) + (i_569_
											- i_570_ & 0x10000));
									is_514_[i_513_] = i_569_ - i_568_ | i_568_
											- (i_568_ >>> 8);
								}
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_507_ += Class332_Sub3.anInt5444;
					}
				}
				i_505_++;
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		} else if (Class332_Sub3.anInt5436 < 0) {
			for (int i_571_ = Class332_Sub3.anInt5431; i_571_ < 0; i_571_++) {
				int i_572_ = Class332_Sub3.anInt5451;
				int i_573_ = Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425;
				int i_574_ = Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456;
				int i_575_ = Class332_Sub3.anInt5448;
				if (i_573_ < 0) {
					final int i_576_ = ((Class332_Sub3.anInt5444 - 1 - i_573_) / Class332_Sub3.anInt5444);
					i_575_ += i_576_;
					i_573_ += Class332_Sub3.anInt5444 * i_576_;
					i_574_ += Class332_Sub3.anInt5436 * i_576_;
					i_572_ += i_576_;
				}
				int i_577_;
				if ((i_577_ = (1 + i_573_
						- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444)
						/ Class332_Sub3.anInt5444) > i_575_) {
					i_575_ = i_577_;
				}
				if ((i_577_ = i_574_ - (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
					i_577_ = ((Class332_Sub3.anInt5436 - i_577_) / Class332_Sub3.anInt5436);
					i_575_ += i_577_;
					i_573_ += Class332_Sub3.anInt5444 * i_577_;
					i_574_ += Class332_Sub3.anInt5436 * i_577_;
					i_572_ += i_577_;
				}
				if ((i_577_ = ((i_574_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_575_) {
					i_575_ = i_577_;
				}
				for (/**/; i_575_ < 0; i_575_++) {
					int i_578_ = ((i_574_ >> 12)
							* ((Class332_Sub3) this).anInt5433 + (i_573_ >> 12));
					int i_579_ = i_572_++;
					final int[] is_580_ = is;
					final int i_581_ = i;
					final int i_582_ = i_114_;
					if (i_582_ == 0) {
						if (i_581_ == 1) {
							is_580_[i_579_] = (anIntArray6213[i_578_]);
						} else if (i_581_ == 0) {
							final int i_583_ = (anIntArray6213[i_578_++]);
							final int i_584_ = (((i_583_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
							final int i_585_ = ((i_583_ & 0xff00)
									* Class332_Sub3.anInt5457 & 0xff0000);
							final int i_586_ = ((i_583_ & 0xff)
									* Class332_Sub3.anInt5427 & 0xff00);
							is_580_[i_579_] = (i_584_ | i_585_ | i_586_) >>> 8;
						} else if (i_581_ == 3) {
							final int i_587_ = (anIntArray6213[i_578_++]);
							final int i_588_ = Class332_Sub3.anInt5432;
							final int i_589_ = i_587_ + i_588_;
							final int i_590_ = (i_587_ & 0xff00ff)
									+ (i_588_ & 0xff00ff);
							final int i_591_ = ((i_590_ & 0x1000100) + (i_589_
									- i_590_ & 0x10000));
							is_580_[i_579_] = i_589_ - i_591_ | i_591_
									- (i_591_ >>> 8);
						} else if (i_581_ == 2) {
							final int i_592_ = (anIntArray6213[i_578_]);
							final int i_593_ = (((i_592_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
							final int i_594_ = ((i_592_ & 0xff00)
									* Class332_Sub3.anInt5449 & 0xff0000);
							is_580_[i_579_] = (((i_593_ | i_594_) >>> 8) + Class332_Sub3.anInt5440);
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_582_ == 1) {
						if (i_581_ == 1) {
							final int i_595_ = (anIntArray6213[i_578_]);
							if (i_595_ != 0) {
								is_580_[i_579_] = i_595_;
							}
						} else if (i_581_ == 0) {
							int i_596_ = (anIntArray6213[i_578_]);
							if (i_596_ != 0) {
								if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
									final int i_597_ = Class332_Sub3.anInt5432 >>> 24;
									final int i_598_ = 256 - i_597_;
									final int i_599_ = is_580_[i_579_];
									is_580_[i_579_] = ((((i_596_ & 0xff00ff)
											* i_597_ + (i_599_ & 0xff00ff)
											* i_598_) & ~0xff00ff) + (((i_596_ & 0xff00)
											* i_597_ + (i_599_ & 0xff00)
											* i_598_) & 0xff0000)) >> 8;
								} else if (Class332_Sub3.anInt5449 != 255) {
									final int i_600_ = (((i_596_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_601_ = (((i_596_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_602_ = (((i_596_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_596_ = (i_600_ | i_601_ | i_602_) >>> 8;
									final int i_603_ = is_580_[i_579_];
									is_580_[i_579_] = (((((i_596_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_603_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_596_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_603_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
								} else {
									final int i_604_ = (((i_596_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_605_ = (((i_596_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_606_ = (((i_596_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_580_[i_579_] = (i_604_ | i_605_ | i_606_) >>> 8;
								}
							}
						} else if (i_581_ == 3) {
							int i_607_ = (anIntArray6213[i_578_]);
							final int i_608_ = Class332_Sub3.anInt5432;
							final int i_609_ = i_607_ + i_608_;
							final int i_610_ = (i_607_ & 0xff00ff)
									+ (i_608_ & 0xff00ff);
							int i_611_ = ((i_610_ & 0x1000100) + (i_609_
									- i_610_ & 0x10000));
							i_611_ = i_609_ - i_611_ | i_611_ - (i_611_ >>> 8);
							if (i_607_ == 0 && Class332_Sub3.anInt5449 != 255) {
								i_607_ = i_611_;
								i_611_ = is_580_[i_579_];
								i_611_ = (((((i_607_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_611_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_607_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_611_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
							}
							is_580_[i_579_] = i_611_;
						} else if (i_581_ == 2) {
							final int i_612_ = (anIntArray6213[i_578_]);
							if (i_612_ != 0) {
								final int i_613_ = (((i_612_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_614_ = (((i_612_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								is_580_[i_579_++] = (((i_613_ | i_614_) >>> 8) + Class332_Sub3.anInt5440);
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_582_ == 2) {
						if (i_581_ == 1) {
							final int i_615_ = (anIntArray6213[i_578_]);
							if (i_615_ != 0) {
								int i_616_ = is_580_[i_579_];
								final int i_617_ = i_615_ + i_616_;
								final int i_618_ = ((i_615_ & 0xff00ff) + (i_616_ & 0xff00ff));
								i_616_ = (i_618_ & 0x1000100)
										+ (i_617_ - i_618_ & 0x10000);
								is_580_[i_579_] = i_617_ - i_616_ | i_616_
										- (i_616_ >>> 8);
							}
						} else if (i_581_ == 0) {
							int i_619_ = (anIntArray6213[i_578_]);
							if (i_619_ != 0) {
								final int i_620_ = (((i_619_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_621_ = (((i_619_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_622_ = (((i_619_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								i_619_ = (i_620_ | i_621_ | i_622_) >>> 8;
								int i_623_ = is_580_[i_579_];
								final int i_624_ = i_619_ + i_623_;
								final int i_625_ = ((i_619_ & 0xff00ff) + (i_623_ & 0xff00ff));
								i_623_ = (i_625_ & 0x1000100)
										+ (i_624_ - i_625_ & 0x10000);
								is_580_[i_579_] = i_624_ - i_623_ | i_623_
										- (i_623_ >>> 8);
							}
						} else if (i_581_ == 3) {
							int i_626_ = (anIntArray6213[i_578_]);
							final int i_627_ = Class332_Sub3.anInt5432;
							int i_628_ = i_626_ + i_627_;
							int i_629_ = (i_626_ & 0xff00ff)
									+ (i_627_ & 0xff00ff);
							int i_630_ = ((i_629_ & 0x1000100) + (i_628_
									- i_629_ & 0x10000));
							i_626_ = i_628_ - i_630_ | i_630_ - (i_630_ >>> 8);
							i_630_ = is_580_[i_579_];
							i_628_ = i_626_ + i_630_;
							i_629_ = (i_626_ & 0xff00ff) + (i_630_ & 0xff00ff);
							i_630_ = (i_629_ & 0x1000100)
									+ (i_628_ - i_629_ & 0x10000);
							is_580_[i_579_] = i_628_ - i_630_ | i_630_
									- (i_630_ >>> 8);
						} else if (i_581_ == 2) {
							int i_631_ = (anIntArray6213[i_578_]);
							if (i_631_ != 0) {
								final int i_632_ = (((i_631_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_633_ = (((i_631_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								i_631_ = (((i_632_ | i_633_) >>> 8) + Class332_Sub3.anInt5440);
								int i_634_ = is_580_[i_579_];
								final int i_635_ = i_631_ + i_634_;
								final int i_636_ = ((i_631_ & 0xff00ff) + (i_634_ & 0xff00ff));
								i_634_ = (i_636_ & 0x1000100)
										+ (i_635_ - i_636_ & 0x10000);
								is_580_[i_579_] = i_635_ - i_634_ | i_634_
										- (i_634_ >>> 8);
							}
						}
					} else {
						throw new IllegalArgumentException();
					}
					i_573_ += Class332_Sub3.anInt5444;
					i_574_ += Class332_Sub3.anInt5436;
				}
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		} else {
			for (int i_637_ = Class332_Sub3.anInt5431; i_637_ < 0; i_637_++) {
				int i_638_ = Class332_Sub3.anInt5451;
				int i_639_ = Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425;
				int i_640_ = Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456;
				int i_641_ = Class332_Sub3.anInt5448;
				if (i_639_ < 0) {
					final int i_642_ = ((Class332_Sub3.anInt5444 - 1 - i_639_) / Class332_Sub3.anInt5444);
					i_641_ += i_642_;
					i_639_ += Class332_Sub3.anInt5444 * i_642_;
					i_640_ += Class332_Sub3.anInt5436 * i_642_;
					i_638_ += i_642_;
				}
				int i_643_;
				if ((i_643_ = (1 + i_639_
						- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444)
						/ Class332_Sub3.anInt5444) > i_641_) {
					i_641_ = i_643_;
				}
				if (i_640_ < 0) {
					i_643_ = ((Class332_Sub3.anInt5436 - 1 - i_640_) / Class332_Sub3.anInt5436);
					i_641_ += i_643_;
					i_639_ += Class332_Sub3.anInt5444 * i_643_;
					i_640_ += Class332_Sub3.anInt5436 * i_643_;
					i_638_ += i_643_;
				}
				if ((i_643_ = (1 + i_640_
						- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436)
						/ Class332_Sub3.anInt5436) > i_641_) {
					i_641_ = i_643_;
				}
				for (/**/; i_641_ < 0; i_641_++) {
					int i_644_ = ((i_640_ >> 12)
							* ((Class332_Sub3) this).anInt5433 + (i_639_ >> 12));
					int i_645_ = i_638_++;
					final int[] is_646_ = is;
					final int i_647_ = i;
					final int i_648_ = i_114_;
					if (i_648_ == 0) {
						if (i_647_ == 1) {
							is_646_[i_645_] = (anIntArray6213[i_644_]);
						} else if (i_647_ == 0) {
							final int i_649_ = (anIntArray6213[i_644_++]);
							final int i_650_ = (((i_649_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
							final int i_651_ = ((i_649_ & 0xff00)
									* Class332_Sub3.anInt5457 & 0xff0000);
							final int i_652_ = ((i_649_ & 0xff)
									* Class332_Sub3.anInt5427 & 0xff00);
							is_646_[i_645_] = (i_650_ | i_651_ | i_652_) >>> 8;
						} else if (i_647_ == 3) {
							final int i_653_ = (anIntArray6213[i_644_++]);
							final int i_654_ = Class332_Sub3.anInt5432;
							final int i_655_ = i_653_ + i_654_;
							final int i_656_ = (i_653_ & 0xff00ff)
									+ (i_654_ & 0xff00ff);
							final int i_657_ = ((i_656_ & 0x1000100) + (i_655_
									- i_656_ & 0x10000));
							is_646_[i_645_] = i_655_ - i_657_ | i_657_
									- (i_657_ >>> 8);
						} else if (i_647_ == 2) {
							final int i_658_ = (anIntArray6213[i_644_]);
							final int i_659_ = (((i_658_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
							final int i_660_ = ((i_658_ & 0xff00)
									* Class332_Sub3.anInt5449 & 0xff0000);
							is_646_[i_645_] = (((i_659_ | i_660_) >>> 8) + Class332_Sub3.anInt5440);
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_648_ == 1) {
						if (i_647_ == 1) {
							final int i_661_ = (anIntArray6213[i_644_]);
							if (i_661_ != 0) {
								is_646_[i_645_] = i_661_;
							}
						} else if (i_647_ == 0) {
							int i_662_ = (anIntArray6213[i_644_]);
							if (i_662_ != 0) {
								if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
									final int i_663_ = Class332_Sub3.anInt5432 >>> 24;
									final int i_664_ = 256 - i_663_;
									final int i_665_ = is_646_[i_645_];
									is_646_[i_645_] = ((((i_662_ & 0xff00ff)
											* i_663_ + (i_665_ & 0xff00ff)
											* i_664_) & ~0xff00ff) + (((i_662_ & 0xff00)
											* i_663_ + (i_665_ & 0xff00)
											* i_664_) & 0xff0000)) >> 8;
								} else if (Class332_Sub3.anInt5449 != 255) {
									final int i_666_ = (((i_662_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_667_ = (((i_662_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_668_ = (((i_662_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_662_ = (i_666_ | i_667_ | i_668_) >>> 8;
									final int i_669_ = is_646_[i_645_];
									is_646_[i_645_] = (((((i_662_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_669_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_662_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_669_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
								} else {
									final int i_670_ = (((i_662_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_671_ = (((i_662_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_672_ = (((i_662_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_646_[i_645_] = (i_670_ | i_671_ | i_672_) >>> 8;
								}
							}
						} else if (i_647_ == 3) {
							int i_673_ = (anIntArray6213[i_644_]);
							final int i_674_ = Class332_Sub3.anInt5432;
							final int i_675_ = i_673_ + i_674_;
							final int i_676_ = (i_673_ & 0xff00ff)
									+ (i_674_ & 0xff00ff);
							int i_677_ = ((i_676_ & 0x1000100) + (i_675_
									- i_676_ & 0x10000));
							i_677_ = i_675_ - i_677_ | i_677_ - (i_677_ >>> 8);
							if (i_673_ == 0 && Class332_Sub3.anInt5449 != 255) {
								i_673_ = i_677_;
								i_677_ = is_646_[i_645_];
								i_677_ = (((((i_673_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_677_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_673_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_677_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
							}
							is_646_[i_645_] = i_677_;
						} else if (i_647_ == 2) {
							final int i_678_ = (anIntArray6213[i_644_]);
							if (i_678_ != 0) {
								final int i_679_ = (((i_678_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_680_ = (((i_678_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								is_646_[i_645_++] = (((i_679_ | i_680_) >>> 8) + Class332_Sub3.anInt5440);
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_648_ == 2) {
						if (i_647_ == 1) {
							final int i_681_ = (anIntArray6213[i_644_]);
							if (i_681_ != 0) {
								int i_682_ = is_646_[i_645_];
								final int i_683_ = i_681_ + i_682_;
								final int i_684_ = ((i_681_ & 0xff00ff) + (i_682_ & 0xff00ff));
								i_682_ = (i_684_ & 0x1000100)
										+ (i_683_ - i_684_ & 0x10000);
								is_646_[i_645_] = i_683_ - i_682_ | i_682_
										- (i_682_ >>> 8);
							}
						} else if (i_647_ == 0) {
							int i_685_ = (anIntArray6213[i_644_]);
							if (i_685_ != 0) {
								final int i_686_ = (((i_685_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_687_ = (((i_685_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_688_ = (((i_685_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								i_685_ = (i_686_ | i_687_ | i_688_) >>> 8;
								int i_689_ = is_646_[i_645_];
								final int i_690_ = i_685_ + i_689_;
								final int i_691_ = ((i_685_ & 0xff00ff) + (i_689_ & 0xff00ff));
								i_689_ = (i_691_ & 0x1000100)
										+ (i_690_ - i_691_ & 0x10000);
								is_646_[i_645_] = i_690_ - i_689_ | i_689_
										- (i_689_ >>> 8);
							}
						} else if (i_647_ == 3) {
							int i_692_ = (anIntArray6213[i_644_]);
							final int i_693_ = Class332_Sub3.anInt5432;
							int i_694_ = i_692_ + i_693_;
							int i_695_ = (i_692_ & 0xff00ff)
									+ (i_693_ & 0xff00ff);
							int i_696_ = ((i_695_ & 0x1000100) + (i_694_
									- i_695_ & 0x10000));
							i_692_ = i_694_ - i_696_ | i_696_ - (i_696_ >>> 8);
							i_696_ = is_646_[i_645_];
							i_694_ = i_692_ + i_696_;
							i_695_ = (i_692_ & 0xff00ff) + (i_696_ & 0xff00ff);
							i_696_ = (i_695_ & 0x1000100)
									+ (i_694_ - i_695_ & 0x10000);
							is_646_[i_645_] = i_694_ - i_696_ | i_696_
									- (i_696_ >>> 8);
						} else if (i_647_ == 2) {
							int i_697_ = (anIntArray6213[i_644_]);
							if (i_697_ != 0) {
								final int i_698_ = (((i_697_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_699_ = (((i_697_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								i_697_ = (((i_698_ | i_699_) >>> 8) + Class332_Sub3.anInt5440);
								int i_700_ = is_646_[i_645_];
								final int i_701_ = i_697_ + i_700_;
								final int i_702_ = ((i_697_ & 0xff00ff) + (i_700_ & 0xff00ff));
								i_700_ = (i_702_ & 0x1000100)
										+ (i_701_ - i_702_ & 0x10000);
								is_646_[i_645_] = i_701_ - i_700_ | i_700_
										- (i_700_ >>> 8);
							}
						}
					} else {
						throw new IllegalArgumentException();
					}
					i_639_ += Class332_Sub3.anInt5444;
					i_640_ += Class332_Sub3.anInt5436;
				}
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		}
	}

	@Override
	final void method3729(int i, int i_703_, final aa var_aa, final int i_704_,
			final int i_705_) {
		if (((Class332_Sub3) this).aHa_Sub2_5434.method1920()) {
			throw new IllegalStateException();
		}
		i += ((Class332_Sub3) this).anInt5446;
		i_703_ += ((Class332_Sub3) this).anInt5439;
		int i_706_ = 0;
		final int i_707_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4505;
		int i_708_ = ((Class332_Sub3) this).anInt5433;
		int i_709_ = ((Class332_Sub3) this).anInt5454;
		int i_710_ = i_707_ - i_708_;
		int i_711_ = 0;
		int i_712_ = i + i_703_ * i_707_;
		if (i_703_ < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) {
			final int i_713_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4495 - i_703_);
			i_709_ -= i_713_;
			i_703_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495;
			i_706_ += i_713_ * i_708_;
			i_712_ += i_713_ * i_707_;
		}
		if (i_703_ + i_709_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4492) {
			i_709_ -= i_703_ + i_709_
					- (((Class332_Sub3) this).aHa_Sub2_5434).anInt4492;
		}
		if (i < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) {
			final int i_714_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4509 - i);
			i_708_ -= i_714_;
			i = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509;
			i_706_ += i_714_;
			i_712_ += i_714_;
			i_711_ += i_714_;
			i_710_ += i_714_;
		}
		if (i + i_708_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4507) {
			final int i_715_ = (i + i_708_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4507));
			i_708_ -= i_715_;
			i_711_ += i_715_;
			i_710_ += i_715_;
		}
		if (i_708_ > 0 && i_709_ > 0) {
			final aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
			final int[] is = var_aa_Sub1.anIntArray3555;
			final int[] is_716_ = var_aa_Sub1.anIntArray3557;
			final int[] is_717_ = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			int i_718_ = i_703_;
			if (i_705_ > i_718_) {
				i_718_ = i_705_;
				i_712_ += (i_705_ - i_703_) * i_707_;
				i_706_ += (i_705_ - i_703_) * ((Class332_Sub3) this).anInt5433;
			}
			final int i_719_ = (i_705_ + is.length < i_703_ + i_709_ ? i_705_
					+ is.length : i_703_ + i_709_);
			for (int i_720_ = i_718_; i_720_ < i_719_; i_720_++) {
				final int i_721_ = is[i_720_ - i_705_] + i_704_;
				int i_722_ = is_716_[i_720_ - i_705_];
				int i_723_ = i_708_;
				if (i > i_721_) {
					final int i_724_ = i - i_721_;
					if (i_724_ >= i_722_) {
						i_706_ += i_708_ + i_711_;
						i_712_ += i_708_ + i_710_;
						continue;
					}
					i_722_ -= i_724_;
				} else {
					final int i_725_ = i_721_ - i;
					if (i_725_ >= i_708_) {
						i_706_ += i_708_ + i_711_;
						i_712_ += i_708_ + i_710_;
						continue;
					}
					i_706_ += i_725_;
					i_723_ -= i_725_;
					i_712_ += i_725_;
				}
				int i_726_ = 0;
				if (i_723_ < i_722_) {
					i_722_ = i_723_;
				} else {
					i_726_ = i_723_ - i_722_;
				}
				for (int i_727_ = -i_722_; i_727_ < 0; i_727_++) {
					final int i_728_ = anIntArray6213[i_706_++];
					if (i_728_ != 0) {
						is_717_[i_712_++] = i_728_;
					} else {
						i_712_++;
					}
				}
				i_706_ += i_726_ + i_711_;
				i_712_ += i_726_ + i_710_;
			}
		}
	}

	@Override
	final void method3745(int i, int i_729_, int i_730_, int i_731_,
			final int i_732_, int i_733_, final int i_734_, final int i_735_) {
		if (((Class332_Sub3) this).aHa_Sub2_5434.method1920()) {
			throw new IllegalStateException();
		}
		if (i_730_ > 0 && i_731_ > 0) {
			int i_736_ = 0;
			int i_737_ = 0;
			final int i_738_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4505;
			final int i_739_ = (((Class332_Sub3) this).anInt5446
					+ ((Class332_Sub3) this).anInt5433 + ((Class332_Sub3) this).anInt5455);
			final int i_740_ = (((Class332_Sub3) this).anInt5439
					+ ((Class332_Sub3) this).anInt5454 + ((Class332_Sub3) this).anInt5447);
			final int i_741_ = (i_739_ << 16) / i_730_;
			final int i_742_ = (i_740_ << 16) / i_731_;
			if (((Class332_Sub3) this).anInt5446 > 0) {
				final int i_743_ = (((((Class332_Sub3) this).anInt5446 << 16)
						+ i_741_ - 1) / i_741_);
				i += i_743_;
				i_736_ += i_743_ * i_741_
						- (((Class332_Sub3) this).anInt5446 << 16);
			}
			if (((Class332_Sub3) this).anInt5439 > 0) {
				final int i_744_ = (((((Class332_Sub3) this).anInt5439 << 16)
						+ i_742_ - 1) / i_742_);
				i_729_ += i_744_;
				i_737_ += i_744_ * i_742_
						- (((Class332_Sub3) this).anInt5439 << 16);
			}
			if (((Class332_Sub3) this).anInt5433 < i_739_) {
				i_730_ = ((((Class332_Sub3) this).anInt5433 << 16) - i_736_
						+ i_741_ - 1)
						/ i_741_;
			}
			if (((Class332_Sub3) this).anInt5454 < i_740_) {
				i_731_ = ((((Class332_Sub3) this).anInt5454 << 16) - i_737_
						+ i_742_ - 1)
						/ i_742_;
			}
			int i_745_ = i + i_729_ * i_738_;
			int i_746_ = i_738_ - i_730_;
			if (i_729_ + i_731_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4492) {
				i_731_ -= (i_729_ + i_731_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4492));
			}
			if (i_729_ < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) {
				final int i_747_ = ((((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) - i_729_);
				i_731_ -= i_747_;
				i_745_ += i_747_ * i_738_;
				i_737_ += i_742_ * i_747_;
			}
			if (i + i_730_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4507) {
				final int i_748_ = (i + i_730_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4507));
				i_730_ -= i_748_;
				i_746_ += i_748_;
			}
			if (i < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) {
				final int i_749_ = ((((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) - i);
				i_730_ -= i_749_;
				i_745_ += i_749_;
				i_736_ += i_741_ * i_749_;
				i_746_ += i_749_;
			}
			final int[] is = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			if (i_734_ == 0) {
				if (i_732_ == 1) {
					final int i_750_ = i_736_;
					for (int i_751_ = -i_731_; i_751_ < 0; i_751_++) {
						final int i_752_ = ((i_737_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_753_ = -i_730_; i_753_ < 0; i_753_++) {
							is[i_745_++] = (anIntArray6213[(i_736_ >> 16)
									+ i_752_]);
							i_736_ += i_741_;
						}
						i_737_ += i_742_;
						i_736_ = i_750_;
						i_745_ += i_746_;
					}
					return;
				}
				if (i_732_ == 0) {
					final int i_754_ = (i_733_ & 0xff0000) >> 16;
					final int i_755_ = (i_733_ & 0xff00) >> 8;
					final int i_756_ = i_733_ & 0xff;
					final int i_757_ = i_736_;
					for (int i_758_ = -i_731_; i_758_ < 0; i_758_++) {
						final int i_759_ = ((i_737_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_760_ = -i_730_; i_760_ < 0; i_760_++) {
							final int i_761_ = (anIntArray6213[(i_736_ >> 16)
									+ i_759_]);
							final int i_762_ = (i_761_ & 0xff0000) * i_754_
									& ~0xffffff;
							final int i_763_ = (i_761_ & 0xff00) * i_755_
									& 0xff0000;
							final int i_764_ = (i_761_ & 0xff) * i_756_
									& 0xff00;
							is[i_745_++] = (i_762_ | i_763_ | i_764_) >>> 8;
							i_736_ += i_741_;
						}
						i_737_ += i_742_;
						i_736_ = i_757_;
						i_745_ += i_746_;
					}
					return;
				}
				if (i_732_ == 3) {
					final int i_765_ = i_736_;
					for (int i_766_ = -i_731_; i_766_ < 0; i_766_++) {
						final int i_767_ = ((i_737_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_768_ = -i_730_; i_768_ < 0; i_768_++) {
							final int i_769_ = (anIntArray6213[(i_736_ >> 16)
									+ i_767_]);
							final int i_770_ = i_769_ + i_733_;
							final int i_771_ = (i_769_ & 0xff00ff)
									+ (i_733_ & 0xff00ff);
							final int i_772_ = ((i_771_ & 0x1000100) + (i_770_
									- i_771_ & 0x10000));
							is[i_745_++] = i_770_ - i_772_ | i_772_
									- (i_772_ >>> 8);
							i_736_ += i_741_;
						}
						i_737_ += i_742_;
						i_736_ = i_765_;
						i_745_ += i_746_;
					}
					return;
				}
				if (i_732_ == 2) {
					final int i_773_ = i_733_ >>> 24;
					final int i_774_ = 256 - i_773_;
					int i_775_ = (i_733_ & 0xff00ff) * i_774_ & ~0xff00ff;
					int i_776_ = (i_733_ & 0xff00) * i_774_ & 0xff0000;
					i_733_ = (i_775_ | i_776_) >>> 8;
					final int i_777_ = i_736_;
					for (int i_778_ = -i_731_; i_778_ < 0; i_778_++) {
						final int i_779_ = ((i_737_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_780_ = -i_730_; i_780_ < 0; i_780_++) {
							final int i_781_ = (anIntArray6213[(i_736_ >> 16)
									+ i_779_]);
							i_775_ = (i_781_ & 0xff00ff) * i_773_ & ~0xff00ff;
							i_776_ = (i_781_ & 0xff00) * i_773_ & 0xff0000;
							is[i_745_++] = ((i_775_ | i_776_) >>> 8) + i_733_;
							i_736_ += i_741_;
						}
						i_737_ += i_742_;
						i_736_ = i_777_;
						i_745_ += i_746_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_734_ == 1) {
				if (i_732_ == 1) {
					final int i_782_ = i_736_;
					for (int i_783_ = -i_731_; i_783_ < 0; i_783_++) {
						final int i_784_ = ((i_737_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_785_ = -i_730_; i_785_ < 0; i_785_++) {
							final int i_786_ = (anIntArray6213[(i_736_ >> 16)
									+ i_784_]);
							if (i_786_ != 0) {
								is[i_745_++] = i_786_;
							} else {
								i_745_++;
							}
							i_736_ += i_741_;
						}
						i_737_ += i_742_;
						i_736_ = i_782_;
						i_745_ += i_746_;
					}
					return;
				}
				if (i_732_ == 0) {
					final int i_787_ = i_736_;
					if ((i_733_ & 0xffffff) == 16777215) {
						final int i_788_ = i_733_ >>> 24;
						final int i_789_ = 256 - i_788_;
						for (int i_790_ = -i_731_; i_790_ < 0; i_790_++) {
							final int i_791_ = ((i_737_ >> 16) * ((Class332_Sub3) this).anInt5433);
							for (int i_792_ = -i_730_; i_792_ < 0; i_792_++) {
								final int i_793_ = (anIntArray6213[(i_736_ >> 16)
										+ i_791_]);
								if (i_793_ != 0) {
									final int i_794_ = is[i_745_];
									is[i_745_++] = ((((i_793_ & 0xff00ff)
											* i_788_ + (i_794_ & 0xff00ff)
											* i_789_) & ~0xff00ff) + (((i_793_ & 0xff00)
											* i_788_ + (i_794_ & 0xff00)
											* i_789_) & 0xff0000)) >> 8;
								} else {
									i_745_++;
								}
								i_736_ += i_741_;
							}
							i_737_ += i_742_;
							i_736_ = i_787_;
							i_745_ += i_746_;
						}
					} else {
						final int i_795_ = (i_733_ & 0xff0000) >> 16;
						final int i_796_ = (i_733_ & 0xff00) >> 8;
						final int i_797_ = i_733_ & 0xff;
						final int i_798_ = i_733_ >>> 24;
						final int i_799_ = 256 - i_798_;
						for (int i_800_ = -i_731_; i_800_ < 0; i_800_++) {
							final int i_801_ = ((i_737_ >> 16) * ((Class332_Sub3) this).anInt5433);
							for (int i_802_ = -i_730_; i_802_ < 0; i_802_++) {
								int i_803_ = (anIntArray6213[(i_736_ >> 16)
										+ i_801_]);
								if (i_803_ != 0) {
									if (i_798_ != 255) {
										final int i_804_ = ((i_803_ & 0xff0000)
												* i_795_ & ~0xffffff);
										final int i_805_ = ((i_803_ & 0xff00)
												* i_796_ & 0xff0000);
										final int i_806_ = ((i_803_ & 0xff)
												* i_797_ & 0xff00);
										i_803_ = (i_804_ | i_805_ | i_806_) >>> 8;
										final int i_807_ = is[i_745_];
										is[i_745_++] = ((((i_803_ & 0xff00ff)
												* i_798_ + ((i_807_ & 0xff00ff) * i_799_)) & ~0xff00ff) + (((i_803_ & 0xff00)
												* i_798_ + ((i_807_ & 0xff00) * i_799_)) & 0xff0000)) >> 8;
									} else {
										final int i_808_ = ((i_803_ & 0xff0000)
												* i_795_ & ~0xffffff);
										final int i_809_ = ((i_803_ & 0xff00)
												* i_796_ & 0xff0000);
										final int i_810_ = ((i_803_ & 0xff)
												* i_797_ & 0xff00);
										is[i_745_++] = (i_808_ | i_809_ | i_810_) >>> 8;
									}
								} else {
									i_745_++;
								}
								i_736_ += i_741_;
							}
							i_737_ += i_742_;
							i_736_ = i_787_;
							i_745_ += i_746_;
						}
						return;
					}
					return;
				}
				if (i_732_ == 3) {
					final int i_811_ = i_736_;
					final int i_812_ = i_733_ >>> 24;
					final int i_813_ = 256 - i_812_;
					for (int i_814_ = -i_731_; i_814_ < 0; i_814_++) {
						final int i_815_ = ((i_737_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_816_ = -i_730_; i_816_ < 0; i_816_++) {
							int i_817_ = (anIntArray6213[(i_736_ >> 16)
									+ i_815_]);
							final int i_818_ = i_817_ + i_733_;
							final int i_819_ = (i_817_ & 0xff00ff)
									+ (i_733_ & 0xff00ff);
							int i_820_ = ((i_819_ & 0x1000100) + (i_818_
									- i_819_ & 0x10000));
							i_820_ = i_818_ - i_820_ | i_820_ - (i_820_ >>> 8);
							if (i_817_ == 0 && i_812_ != 255) {
								i_817_ = i_820_;
								i_820_ = is[i_745_];
								i_820_ = ((((i_817_ & 0xff00ff) * i_812_ + (i_820_ & 0xff00ff)
										* i_813_) & ~0xff00ff) + (((i_817_ & 0xff00)
										* i_812_ + (i_820_ & 0xff00) * i_813_) & 0xff0000)) >> 8;
							}
							is[i_745_++] = i_820_;
							i_736_ += i_741_;
						}
						i_737_ += i_742_;
						i_736_ = i_811_;
						i_745_ += i_746_;
					}
					return;
				}
				if (i_732_ == 2) {
					final int i_821_ = i_733_ >>> 24;
					final int i_822_ = 256 - i_821_;
					int i_823_ = (i_733_ & 0xff00ff) * i_822_ & ~0xff00ff;
					int i_824_ = (i_733_ & 0xff00) * i_822_ & 0xff0000;
					i_733_ = (i_823_ | i_824_) >>> 8;
					final int i_825_ = i_736_;
					for (int i_826_ = -i_731_; i_826_ < 0; i_826_++) {
						final int i_827_ = ((i_737_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_828_ = -i_730_; i_828_ < 0; i_828_++) {
							final int i_829_ = (anIntArray6213[(i_736_ >> 16)
									+ i_827_]);
							if (i_829_ != 0) {
								i_823_ = (i_829_ & 0xff00ff) * i_821_
										& ~0xff00ff;
								i_824_ = (i_829_ & 0xff00) * i_821_ & 0xff0000;
								is[i_745_++] = ((i_823_ | i_824_) >>> 8)
										+ i_733_;
							} else {
								i_745_++;
							}
							i_736_ += i_741_;
						}
						i_737_ += i_742_;
						i_736_ = i_825_;
						i_745_ += i_746_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_734_ == 2) {
				if (i_732_ == 1) {
					final int i_830_ = i_736_;
					for (int i_831_ = -i_731_; i_831_ < 0; i_831_++) {
						final int i_832_ = ((i_737_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_833_ = -i_730_; i_833_ < 0; i_833_++) {
							final int i_834_ = (anIntArray6213[(i_736_ >> 16)
									+ i_832_]);
							if (i_834_ != 0) {
								int i_835_ = is[i_745_];
								final int i_836_ = i_834_ + i_835_;
								final int i_837_ = ((i_834_ & 0xff00ff) + (i_835_ & 0xff00ff));
								i_835_ = (i_837_ & 0x1000100)
										+ (i_836_ - i_837_ & 0x10000);
								is[i_745_++] = i_836_ - i_835_ | i_835_
										- (i_835_ >>> 8);
							} else {
								i_745_++;
							}
							i_736_ += i_741_;
						}
						i_737_ += i_742_;
						i_736_ = i_830_;
						i_745_ += i_746_;
					}
					return;
				}
				if (i_732_ == 0) {
					final int i_838_ = i_736_;
					final int i_839_ = (i_733_ & 0xff0000) >> 16;
					final int i_840_ = (i_733_ & 0xff00) >> 8;
					final int i_841_ = i_733_ & 0xff;
					for (int i_842_ = -i_731_; i_842_ < 0; i_842_++) {
						final int i_843_ = ((i_737_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_844_ = -i_730_; i_844_ < 0; i_844_++) {
							int i_845_ = (anIntArray6213[(i_736_ >> 16)
									+ i_843_]);
							if (i_845_ != 0) {
								final int i_846_ = (i_845_ & 0xff0000) * i_839_
										& ~0xffffff;
								final int i_847_ = (i_845_ & 0xff00) * i_840_
										& 0xff0000;
								final int i_848_ = (i_845_ & 0xff) * i_841_
										& 0xff00;
								i_845_ = (i_846_ | i_847_ | i_848_) >>> 8;
								int i_849_ = is[i_745_];
								final int i_850_ = i_845_ + i_849_;
								final int i_851_ = ((i_845_ & 0xff00ff) + (i_849_ & 0xff00ff));
								i_849_ = (i_851_ & 0x1000100)
										+ (i_850_ - i_851_ & 0x10000);
								is[i_745_++] = i_850_ - i_849_ | i_849_
										- (i_849_ >>> 8);
							} else {
								i_745_++;
							}
							i_736_ += i_741_;
						}
						i_737_ += i_742_;
						i_736_ = i_838_;
						i_745_ += i_746_;
					}
					return;
				}
				if (i_732_ == 3) {
					final int i_852_ = i_736_;
					for (int i_853_ = -i_731_; i_853_ < 0; i_853_++) {
						final int i_854_ = ((i_737_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_855_ = -i_730_; i_855_ < 0; i_855_++) {
							int i_856_ = (anIntArray6213[(i_736_ >> 16)
									+ i_854_]);
							int i_857_ = i_856_ + i_733_;
							int i_858_ = (i_856_ & 0xff00ff)
									+ (i_733_ & 0xff00ff);
							int i_859_ = ((i_858_ & 0x1000100) + (i_857_
									- i_858_ & 0x10000));
							i_856_ = i_857_ - i_859_ | i_859_ - (i_859_ >>> 8);
							i_859_ = is[i_745_];
							i_857_ = i_856_ + i_859_;
							i_858_ = (i_856_ & 0xff00ff) + (i_859_ & 0xff00ff);
							i_859_ = (i_858_ & 0x1000100)
									+ (i_857_ - i_858_ & 0x10000);
							is[i_745_++] = i_857_ - i_859_ | i_859_
									- (i_859_ >>> 8);
							i_736_ += i_741_;
						}
						i_737_ += i_742_;
						i_736_ = i_852_;
						i_745_ += i_746_;
					}
					return;
				}
				if (i_732_ == 2) {
					final int i_860_ = i_733_ >>> 24;
					final int i_861_ = 256 - i_860_;
					int i_862_ = (i_733_ & 0xff00ff) * i_861_ & ~0xff00ff;
					int i_863_ = (i_733_ & 0xff00) * i_861_ & 0xff0000;
					i_733_ = (i_862_ | i_863_) >>> 8;
					final int i_864_ = i_736_;
					for (int i_865_ = -i_731_; i_865_ < 0; i_865_++) {
						final int i_866_ = ((i_737_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_867_ = -i_730_; i_867_ < 0; i_867_++) {
							int i_868_ = (anIntArray6213[(i_736_ >> 16)
									+ i_866_]);
							if (i_868_ != 0) {
								i_862_ = (i_868_ & 0xff00ff) * i_860_
										& ~0xff00ff;
								i_863_ = (i_868_ & 0xff00) * i_860_ & 0xff0000;
								i_868_ = ((i_862_ | i_863_) >>> 8) + i_733_;
								int i_869_ = is[i_745_];
								final int i_870_ = i_868_ + i_869_;
								final int i_871_ = ((i_868_ & 0xff00ff) + (i_869_ & 0xff00ff));
								i_869_ = (i_871_ & 0x1000100)
										+ (i_870_ - i_871_ & 0x10000);
								is[i_745_++] = i_870_ - i_869_ | i_869_
										- (i_869_ >>> 8);
							} else {
								i_745_++;
							}
							i_736_ += i_741_;
						}
						i_737_ += i_742_;
						i_736_ = i_864_;
						i_745_ += i_746_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	@Override
	final void method3757(int i, int i_872_, final int i_873_, int i_874_,
			int i_875_, final int i_876_, int i_877_, final int i_878_,
			final int i_879_) {
		if (i_874_ > 0 && i_875_ > 0) {
			int i_880_ = 0;
			int i_881_ = 0;
			final int i_882_ = (((Class332_Sub3) this).anInt5446
					+ ((Class332_Sub3) this).anInt5433 + ((Class332_Sub3) this).anInt5455);
			final int i_883_ = (((Class332_Sub3) this).anInt5439
					+ ((Class332_Sub3) this).anInt5454 + ((Class332_Sub3) this).anInt5447);
			final int i_884_ = (i_882_ << 16) / i_874_;
			final int i_885_ = (i_883_ << 16) / i_875_;
			if (((Class332_Sub3) this).anInt5446 > 0) {
				final int i_886_ = (((((Class332_Sub3) this).anInt5446 << 16)
						+ i_884_ - 1) / i_884_);
				i += i_886_;
				i_880_ += i_886_ * i_884_
						- (((Class332_Sub3) this).anInt5446 << 16);
			}
			if (((Class332_Sub3) this).anInt5439 > 0) {
				final int i_887_ = (((((Class332_Sub3) this).anInt5439 << 16)
						+ i_885_ - 1) / i_885_);
				i_872_ += i_887_;
				i_881_ += i_887_ * i_885_
						- (((Class332_Sub3) this).anInt5439 << 16);
			}
			if (((Class332_Sub3) this).anInt5433 < i_882_) {
				i_874_ = ((((Class332_Sub3) this).anInt5433 << 16) - i_880_
						+ i_884_ - 1)
						/ i_884_;
			}
			if (((Class332_Sub3) this).anInt5454 < i_883_) {
				i_875_ = ((((Class332_Sub3) this).anInt5454 << 16) - i_881_
						+ i_885_ - 1)
						/ i_885_;
			}
			int i_888_ = i + i_872_
					* (((Class332_Sub3) this).aHa_Sub2_5434).anInt4505;
			int i_889_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4505 - i_874_);
			if (i_872_ + i_875_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4492) {
				i_875_ -= (i_872_ + i_875_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4492));
			}
			if (i_872_ < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) {
				final int i_890_ = ((((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) - i_872_);
				i_875_ -= i_890_;
				i_888_ += i_890_
						* (((Class332_Sub3) this).aHa_Sub2_5434).anInt4505;
				i_881_ += i_885_ * i_890_;
			}
			if (i + i_874_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4507) {
				final int i_891_ = (i + i_874_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4507));
				i_874_ -= i_891_;
				i_889_ += i_891_;
			}
			if (i < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) {
				final int i_892_ = ((((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) - i);
				i_874_ -= i_892_;
				i_888_ += i_892_;
				i_880_ += i_884_ * i_892_;
				i_889_ += i_892_;
			}
			final float[] fs = (((Class332_Sub3) this).aHa_Sub2_5434.aFloatArray4487);
			final int[] is = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			if (i_878_ == 0) {
				if (i_876_ == 1) {
					final int i_893_ = i_880_;
					for (int i_894_ = -i_875_; i_894_ < 0; i_894_++) {
						final int i_895_ = ((i_881_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_896_ = -i_874_; i_896_ < 0; i_896_++) {
							if (i_873_ < fs[i_888_]) {
								is[i_888_] = (anIntArray6213[(i_880_ >> 16)
										+ i_895_]);
								fs[i_888_] = i_873_;
							}
							i_880_ += i_884_;
							i_888_++;
						}
						i_881_ += i_885_;
						i_880_ = i_893_;
						i_888_ += i_889_;
					}
					return;
				}
				if (i_876_ == 0) {
					final int i_897_ = (i_877_ & 0xff0000) >> 16;
					final int i_898_ = (i_877_ & 0xff00) >> 8;
					final int i_899_ = i_877_ & 0xff;
					final int i_900_ = i_880_;
					for (int i_901_ = -i_875_; i_901_ < 0; i_901_++) {
						final int i_902_ = ((i_881_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_903_ = -i_874_; i_903_ < 0; i_903_++) {
							if (i_873_ < fs[i_888_]) {
								final int i_904_ = (anIntArray6213[(i_880_ >> 16)
										+ i_902_]);
								final int i_905_ = (i_904_ & 0xff0000) * i_897_
										& ~0xffffff;
								final int i_906_ = (i_904_ & 0xff00) * i_898_
										& 0xff0000;
								final int i_907_ = (i_904_ & 0xff) * i_899_
										& 0xff00;
								is[i_888_] = (i_905_ | i_906_ | i_907_) >>> 8;
								fs[i_888_] = i_873_;
							}
							i_880_ += i_884_;
							i_888_++;
						}
						i_881_ += i_885_;
						i_880_ = i_900_;
						i_888_ += i_889_;
					}
					return;
				}
				if (i_876_ == 3) {
					final int i_908_ = i_880_;
					for (int i_909_ = -i_875_; i_909_ < 0; i_909_++) {
						final int i_910_ = ((i_881_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_911_ = -i_874_; i_911_ < 0; i_911_++) {
							if (i_873_ < fs[i_888_]) {
								final int i_912_ = (anIntArray6213[(i_880_ >> 16)
										+ i_910_]);
								final int i_913_ = i_912_ + i_877_;
								final int i_914_ = ((i_912_ & 0xff00ff) + (i_877_ & 0xff00ff));
								final int i_915_ = ((i_914_ & 0x1000100) + (i_913_
										- i_914_ & 0x10000));
								is[i_888_] = i_913_ - i_915_ | i_915_
										- (i_915_ >>> 8);
								fs[i_888_] = i_873_;
							}
							i_880_ += i_884_;
							i_888_++;
						}
						i_881_ += i_885_;
						i_880_ = i_908_;
						i_888_ += i_889_;
					}
					return;
				}
				if (i_876_ == 2) {
					final int i_916_ = i_877_ >>> 24;
					final int i_917_ = 256 - i_916_;
					int i_918_ = (i_877_ & 0xff00ff) * i_917_ & ~0xff00ff;
					int i_919_ = (i_877_ & 0xff00) * i_917_ & 0xff0000;
					i_877_ = (i_918_ | i_919_) >>> 8;
					final int i_920_ = i_880_;
					for (int i_921_ = -i_875_; i_921_ < 0; i_921_++) {
						final int i_922_ = ((i_881_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_923_ = -i_874_; i_923_ < 0; i_923_++) {
							if (i_873_ < fs[i_888_]) {
								final int i_924_ = (anIntArray6213[(i_880_ >> 16)
										+ i_922_]);
								i_918_ = (i_924_ & 0xff00ff) * i_916_
										& ~0xff00ff;
								i_919_ = (i_924_ & 0xff00) * i_916_ & 0xff0000;
								is[i_888_] = ((i_918_ | i_919_) >>> 8) + i_877_;
								fs[i_888_] = i_873_;
							}
							i_880_ += i_884_;
							i_888_++;
						}
						i_881_ += i_885_;
						i_880_ = i_920_;
						i_888_ += i_889_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_878_ == 1) {
				if (i_876_ == 1) {
					final int i_925_ = i_880_;
					for (int i_926_ = -i_875_; i_926_ < 0; i_926_++) {
						final int i_927_ = ((i_881_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_928_ = -i_874_; i_928_ < 0; i_928_++) {
							if (i_873_ < fs[i_888_]) {
								final int i_929_ = (anIntArray6213[(i_880_ >> 16)
										+ i_927_]);
								if (i_929_ != 0) {
									is[i_888_] = i_929_;
									fs[i_888_] = i_873_;
								}
							}
							i_880_ += i_884_;
							i_888_++;
						}
						i_881_ += i_885_;
						i_880_ = i_925_;
						i_888_ += i_889_;
					}
					return;
				}
				if (i_876_ == 0) {
					final int i_930_ = i_880_;
					if ((i_877_ & 0xffffff) == 16777215) {
						final int i_931_ = i_877_ >>> 24;
						final int i_932_ = 256 - i_931_;
						for (int i_933_ = -i_875_; i_933_ < 0; i_933_++) {
							final int i_934_ = ((i_881_ >> 16) * ((Class332_Sub3) this).anInt5433);
							for (int i_935_ = -i_874_; i_935_ < 0; i_935_++) {
								if (i_873_ < fs[i_888_]) {
									final int i_936_ = (anIntArray6213[(i_880_ >> 16)
											+ i_934_]);
									if (i_936_ != 0) {
										final int i_937_ = is[i_888_];
										is[i_888_] = ((((i_936_ & 0xff00ff)
												* i_931_ + ((i_937_ & 0xff00ff) * i_932_)) & ~0xff00ff) + (((i_936_ & 0xff00)
												* i_931_ + ((i_937_ & 0xff00) * i_932_)) & 0xff0000)) >> 8;
										fs[i_888_] = i_873_;
									}
								}
								i_880_ += i_884_;
								i_888_++;
							}
							i_881_ += i_885_;
							i_880_ = i_930_;
							i_888_ += i_889_;
						}
					} else {
						final int i_938_ = (i_877_ & 0xff0000) >> 16;
						final int i_939_ = (i_877_ & 0xff00) >> 8;
						final int i_940_ = i_877_ & 0xff;
						final int i_941_ = i_877_ >>> 24;
						final int i_942_ = 256 - i_941_;
						for (int i_943_ = -i_875_; i_943_ < 0; i_943_++) {
							final int i_944_ = ((i_881_ >> 16) * ((Class332_Sub3) this).anInt5433);
							for (int i_945_ = -i_874_; i_945_ < 0; i_945_++) {
								if (i_873_ < fs[i_888_]) {
									int i_946_ = (anIntArray6213[(i_880_ >> 16)
											+ i_944_]);
									if (i_946_ != 0) {
										if (i_941_ != 255) {
											final int i_947_ = ((i_946_ & 0xff0000)
													* i_938_ & ~0xffffff);
											final int i_948_ = ((i_946_ & 0xff00)
													* i_939_ & 0xff0000);
											final int i_949_ = ((i_946_ & 0xff)
													* i_940_ & 0xff00);
											i_946_ = (i_947_ | i_948_ | i_949_) >>> 8;
											final int i_950_ = is[i_888_];
											is[i_888_] = (((((i_946_ & 0xff00ff) * i_941_) + ((i_950_ & 0xff00ff) * i_942_)) & ~0xff00ff) + ((((i_946_ & 0xff00) * i_941_) + ((i_950_ & 0xff00) * i_942_)) & 0xff0000)) >> 8;
											fs[i_888_] = i_873_;
										} else {
											final int i_951_ = ((i_946_ & 0xff0000)
													* i_938_ & ~0xffffff);
											final int i_952_ = ((i_946_ & 0xff00)
													* i_939_ & 0xff0000);
											final int i_953_ = ((i_946_ & 0xff)
													* i_940_ & 0xff00);
											is[i_888_] = (i_951_ | i_952_ | i_953_) >>> 8;
											fs[i_888_] = i_873_;
										}
									}
								}
								i_880_ += i_884_;
								i_888_++;
							}
							i_881_ += i_885_;
							i_880_ = i_930_;
							i_888_ += i_889_;
						}
						return;
					}
					return;
				}
				if (i_876_ == 3) {
					final int i_954_ = i_880_;
					final int i_955_ = i_877_ >>> 24;
					final int i_956_ = 256 - i_955_;
					for (int i_957_ = -i_875_; i_957_ < 0; i_957_++) {
						final int i_958_ = ((i_881_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_959_ = -i_874_; i_959_ < 0; i_959_++) {
							if (i_873_ < fs[i_888_]) {
								int i_960_ = (anIntArray6213[(i_880_ >> 16)
										+ i_958_]);
								final int i_961_ = i_960_ + i_877_;
								final int i_962_ = ((i_960_ & 0xff00ff) + (i_877_ & 0xff00ff));
								int i_963_ = ((i_962_ & 0x1000100) + (i_961_
										- i_962_ & 0x10000));
								i_963_ = i_961_ - i_963_ | i_963_
										- (i_963_ >>> 8);
								if (i_960_ == 0 && i_955_ != 255) {
									i_960_ = i_963_;
									i_963_ = is[i_888_];
									i_963_ = ((((i_960_ & 0xff00ff) * i_955_ + (i_963_ & 0xff00ff)
											* i_956_) & ~0xff00ff) + (((i_960_ & 0xff00)
											* i_955_ + (i_963_ & 0xff00)
											* i_956_) & 0xff0000)) >> 8;
								}
								is[i_888_] = i_963_;
								fs[i_888_] = i_873_;
							}
							i_880_ += i_884_;
							i_888_++;
						}
						i_881_ += i_885_;
						i_880_ = i_954_;
						i_888_ += i_889_;
					}
					return;
				}
				if (i_876_ == 2) {
					final int i_964_ = i_877_ >>> 24;
					final int i_965_ = 256 - i_964_;
					int i_966_ = (i_877_ & 0xff00ff) * i_965_ & ~0xff00ff;
					int i_967_ = (i_877_ & 0xff00) * i_965_ & 0xff0000;
					i_877_ = (i_966_ | i_967_) >>> 8;
					final int i_968_ = i_880_;
					for (int i_969_ = -i_875_; i_969_ < 0; i_969_++) {
						final int i_970_ = ((i_881_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_971_ = -i_874_; i_971_ < 0; i_971_++) {
							if (i_873_ < fs[i_888_]) {
								final int i_972_ = (anIntArray6213[(i_880_ >> 16)
										+ i_970_]);
								if (i_972_ != 0) {
									i_966_ = ((i_972_ & 0xff00ff) * i_964_ & ~0xff00ff);
									i_967_ = ((i_972_ & 0xff00) * i_964_ & 0xff0000);
									is[i_888_] = ((i_966_ | i_967_) >>> 8)
											+ i_877_;
									fs[i_888_] = i_873_;
								}
							}
							i_880_ += i_884_;
							i_888_++;
						}
						i_881_ += i_885_;
						i_880_ = i_968_;
						i_888_ += i_889_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_878_ == 2) {
				if (i_876_ == 1) {
					final int i_973_ = i_880_;
					for (int i_974_ = -i_875_; i_974_ < 0; i_974_++) {
						final int i_975_ = ((i_881_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_976_ = -i_874_; i_976_ < 0; i_976_++) {
							if (i_873_ < fs[i_888_]) {
								final int i_977_ = (anIntArray6213[(i_880_ >> 16)
										+ i_975_]);
								if (i_977_ != 0) {
									int i_978_ = is[i_888_];
									final int i_979_ = i_977_ + i_978_;
									final int i_980_ = ((i_977_ & 0xff00ff) + (i_978_ & 0xff00ff));
									i_978_ = ((i_980_ & 0x1000100) + (i_979_
											- i_980_ & 0x10000));
									is[i_888_] = i_979_ - i_978_ | i_978_
											- (i_978_ >>> 8);
									fs[i_888_] = i_873_;
								}
							}
							i_880_ += i_884_;
							i_888_++;
						}
						i_881_ += i_885_;
						i_880_ = i_973_;
						i_888_ += i_889_;
					}
					return;
				}
				if (i_876_ == 0) {
					final int i_981_ = i_880_;
					final int i_982_ = (i_877_ & 0xff0000) >> 16;
					final int i_983_ = (i_877_ & 0xff00) >> 8;
					final int i_984_ = i_877_ & 0xff;
					for (int i_985_ = -i_875_; i_985_ < 0; i_985_++) {
						final int i_986_ = ((i_881_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_987_ = -i_874_; i_987_ < 0; i_987_++) {
							if (i_873_ < fs[i_888_]) {
								int i_988_ = (anIntArray6213[(i_880_ >> 16)
										+ i_986_]);
								if (i_988_ != 0) {
									final int i_989_ = ((i_988_ & 0xff0000)
											* i_982_ & ~0xffffff);
									final int i_990_ = ((i_988_ & 0xff00)
											* i_983_ & 0xff0000);
									final int i_991_ = (i_988_ & 0xff) * i_984_
											& 0xff00;
									i_988_ = (i_989_ | i_990_ | i_991_) >>> 8;
									int i_992_ = is[i_888_];
									final int i_993_ = i_988_ + i_992_;
									final int i_994_ = ((i_988_ & 0xff00ff) + (i_992_ & 0xff00ff));
									i_992_ = ((i_994_ & 0x1000100) + (i_993_
											- i_994_ & 0x10000));
									is[i_888_] = i_993_ - i_992_ | i_992_
											- (i_992_ >>> 8);
									fs[i_888_] = i_873_;
								}
							}
							i_880_ += i_884_;
							i_888_++;
						}
						i_881_ += i_885_;
						i_880_ = i_981_;
						i_888_ += i_889_;
					}
					return;
				}
				if (i_876_ == 3) {
					final int i_995_ = i_880_;
					for (int i_996_ = -i_875_; i_996_ < 0; i_996_++) {
						final int i_997_ = ((i_881_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_998_ = -i_874_; i_998_ < 0; i_998_++) {
							if (i_873_ < fs[i_888_]) {
								int i_999_ = (anIntArray6213[(i_880_ >> 16)
										+ i_997_]);
								int i_1000_ = i_999_ + i_877_;
								int i_1001_ = ((i_999_ & 0xff00ff) + (i_877_ & 0xff00ff));
								int i_1002_ = ((i_1001_ & 0x1000100) + (i_1000_
										- i_1001_ & 0x10000));
								i_999_ = i_1000_ - i_1002_ | i_1002_
										- (i_1002_ >>> 8);
								i_1002_ = is[i_888_];
								i_1000_ = i_999_ + i_1002_;
								i_1001_ = (i_999_ & 0xff00ff)
										+ (i_1002_ & 0xff00ff);
								i_1002_ = ((i_1001_ & 0x1000100) + (i_1000_
										- i_1001_ & 0x10000));
								is[i_888_] = i_1000_ - i_1002_ | i_1002_
										- (i_1002_ >>> 8);
								fs[i_888_] = i_873_;
							}
							i_880_ += i_884_;
							i_888_++;
						}
						i_881_ += i_885_;
						i_880_ = i_995_;
						i_888_ += i_889_;
					}
					return;
				}
				if (i_876_ == 2) {
					final int i_1003_ = i_877_ >>> 24;
					final int i_1004_ = 256 - i_1003_;
					int i_1005_ = (i_877_ & 0xff00ff) * i_1004_ & ~0xff00ff;
					int i_1006_ = (i_877_ & 0xff00) * i_1004_ & 0xff0000;
					i_877_ = (i_1005_ | i_1006_) >>> 8;
					final int i_1007_ = i_880_;
					for (int i_1008_ = -i_875_; i_1008_ < 0; i_1008_++) {
						final int i_1009_ = ((i_881_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_1010_ = -i_874_; i_1010_ < 0; i_1010_++) {
							if (i_873_ < fs[i_888_]) {
								int i_1011_ = (anIntArray6213[(i_880_ >> 16)
										+ i_1009_]);
								if (i_1011_ != 0) {
									i_1005_ = ((i_1011_ & 0xff00ff) * i_1003_ & ~0xff00ff);
									i_1006_ = ((i_1011_ & 0xff00) * i_1003_ & 0xff0000);
									i_1011_ = ((i_1005_ | i_1006_) >>> 8)
											+ i_877_;
									int i_1012_ = is[i_888_];
									final int i_1013_ = i_1011_ + i_1012_;
									final int i_1014_ = ((i_1011_ & 0xff00ff) + (i_1012_ & 0xff00ff));
									i_1012_ = ((i_1014_ & 0x1000100) + (i_1013_
											- i_1014_ & 0x10000));
									is[i_888_] = (i_1013_ - i_1012_ | i_1012_
											- (i_1012_ >>> 8));
									fs[i_888_] = i_873_;
								}
							}
							i_880_ += i_884_;
							i_888_++;
						}
						i_881_ += i_885_;
						i_880_ = i_1007_;
						i_888_ += i_889_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	@Override
	final void method3758(final int[] is, final int[] is_1015_, final int i,
			final int i_1016_) {
		final int[] is_1017_ = ((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504;
		if (Class332_Sub3.anInt5444 == 0) {
			if (Class332_Sub3.anInt5436 == 0) {
				int i_1018_ = Class332_Sub3.anInt5431;
				while (i_1018_ < 0) {
					final int i_1019_ = i_1018_ + i_1016_;
					if (i_1019_ >= 0) {
						if (i_1019_ >= is.length) {
							break;
						}
						int i_1020_ = Class332_Sub3.anInt5451;
						int i_1021_ = Class332_Sub3.anInt5450;
						int i_1022_ = Class332_Sub3.anInt5443;
						int i_1023_ = Class332_Sub3.anInt5448;
						if (i_1021_ >= 0
								&& i_1022_ >= 0
								&& i_1021_
										- (((Class332_Sub3) this).anInt5433 << 12) < 0
								&& i_1022_
										- (((Class332_Sub3) this).anInt5454 << 12) < 0) {
							final int i_1024_ = is[i_1019_] - i;
							int i_1025_ = -is_1015_[i_1019_];
							final int i_1026_ = (i_1024_ - (i_1020_ - Class332_Sub3.anInt5451));
							if (i_1026_ > 0) {
								i_1020_ += i_1026_;
								i_1023_ += i_1026_;
								i_1021_ += Class332_Sub3.anInt5444 * i_1026_;
								i_1022_ += Class332_Sub3.anInt5436 * i_1026_;
							} else {
								i_1025_ -= i_1026_;
							}
							if (i_1023_ < i_1025_) {
								i_1023_ = i_1025_;
							}
							for (/**/; i_1023_ < 0; i_1023_++) {
								final int i_1027_ = (anIntArray6213[(((i_1022_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1021_ >> 12))]);
								if (i_1027_ != 0) {
									is_1017_[i_1020_++] = i_1027_;
								} else {
									i_1020_++;
								}
							}
						}
					}
					i_1018_++;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else if (Class332_Sub3.anInt5436 < 0) {
				int i_1028_ = Class332_Sub3.anInt5431;
				while (i_1028_ < 0) {
					final int i_1029_ = i_1028_ + i_1016_;
					if (i_1029_ >= 0) {
						if (i_1029_ >= is.length) {
							break;
						}
						int i_1030_ = Class332_Sub3.anInt5451;
						int i_1031_ = Class332_Sub3.anInt5450;
						int i_1032_ = (Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456);
						int i_1033_ = Class332_Sub3.anInt5448;
						if (i_1031_ >= 0
								&& i_1031_
										- (((Class332_Sub3) this).anInt5433 << 12) < 0) {
							int i_1034_;
							if ((i_1034_ = i_1032_
									- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
								i_1034_ = ((Class332_Sub3.anInt5436 - i_1034_) / Class332_Sub3.anInt5436);
								i_1033_ += i_1034_;
								i_1032_ += Class332_Sub3.anInt5436 * i_1034_;
								i_1030_ += i_1034_;
							}
							if ((i_1034_ = ((i_1032_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1033_) {
								i_1033_ = i_1034_;
							}
							final int i_1035_ = is[i_1029_] - i;
							int i_1036_ = -is_1015_[i_1029_];
							final int i_1037_ = (i_1035_ - (i_1030_ - Class332_Sub3.anInt5451));
							if (i_1037_ > 0) {
								i_1030_ += i_1037_;
								i_1033_ += i_1037_;
								i_1031_ += Class332_Sub3.anInt5444 * i_1037_;
								i_1032_ += Class332_Sub3.anInt5436 * i_1037_;
							} else {
								i_1036_ -= i_1037_;
							}
							if (i_1033_ < i_1036_) {
								i_1033_ = i_1036_;
							}
							for (/**/; i_1033_ < 0; i_1033_++) {
								final int i_1038_ = (anIntArray6213[(((i_1032_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1031_ >> 12))]);
								if (i_1038_ != 0) {
									is_1017_[i_1030_++] = i_1038_;
								} else {
									i_1030_++;
								}
								i_1032_ += Class332_Sub3.anInt5436;
							}
						}
					}
					i_1028_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else {
				int i_1039_ = Class332_Sub3.anInt5431;
				while (i_1039_ < 0) {
					final int i_1040_ = i_1039_ + i_1016_;
					if (i_1040_ >= 0) {
						if (i_1040_ >= is.length) {
							break;
						}
						int i_1041_ = Class332_Sub3.anInt5451;
						int i_1042_ = Class332_Sub3.anInt5450;
						int i_1043_ = (Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456);
						int i_1044_ = Class332_Sub3.anInt5448;
						if (i_1042_ >= 0
								&& i_1042_
										- (((Class332_Sub3) this).anInt5433 << 12) < 0) {
							if (i_1043_ < 0) {
								final int i_1045_ = ((Class332_Sub3.anInt5436 - 1 - i_1043_) / Class332_Sub3.anInt5436);
								i_1044_ += i_1045_;
								i_1043_ += Class332_Sub3.anInt5436 * i_1045_;
								i_1041_ += i_1045_;
							}
							int i_1046_;
							if ((i_1046_ = ((1 + i_1043_
									- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1044_) {
								i_1044_ = i_1046_;
							}
							final int i_1047_ = is[i_1040_] - i;
							int i_1048_ = -is_1015_[i_1040_];
							final int i_1049_ = (i_1047_ - (i_1041_ - Class332_Sub3.anInt5451));
							if (i_1049_ > 0) {
								i_1041_ += i_1049_;
								i_1044_ += i_1049_;
								i_1042_ += Class332_Sub3.anInt5444 * i_1049_;
								i_1043_ += Class332_Sub3.anInt5436 * i_1049_;
							} else {
								i_1048_ -= i_1049_;
							}
							if (i_1044_ < i_1048_) {
								i_1044_ = i_1048_;
							}
							for (/**/; i_1044_ < 0; i_1044_++) {
								final int i_1050_ = (anIntArray6213[(((i_1043_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1042_ >> 12))]);
								if (i_1050_ != 0) {
									is_1017_[i_1041_++] = i_1050_;
								} else {
									i_1041_++;
								}
								i_1043_ += Class332_Sub3.anInt5436;
							}
						}
					}
					i_1039_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			}
		} else if (Class332_Sub3.anInt5444 < 0) {
			if (Class332_Sub3.anInt5436 == 0) {
				int i_1051_ = Class332_Sub3.anInt5431;
				while (i_1051_ < 0) {
					final int i_1052_ = i_1051_ + i_1016_;
					if (i_1052_ >= 0) {
						if (i_1052_ >= is.length) {
							break;
						}
						int i_1053_ = Class332_Sub3.anInt5451;
						int i_1054_ = (Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425);
						int i_1055_ = Class332_Sub3.anInt5443;
						int i_1056_ = Class332_Sub3.anInt5448;
						if (i_1055_ >= 0
								&& i_1055_
										- (((Class332_Sub3) this).anInt5454 << 12) < 0) {
							int i_1057_;
							if ((i_1057_ = i_1054_
									- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
								i_1057_ = ((Class332_Sub3.anInt5444 - i_1057_) / Class332_Sub3.anInt5444);
								i_1056_ += i_1057_;
								i_1054_ += Class332_Sub3.anInt5444 * i_1057_;
								i_1053_ += i_1057_;
							}
							if ((i_1057_ = ((i_1054_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1056_) {
								i_1056_ = i_1057_;
							}
							final int i_1058_ = is[i_1052_] - i;
							int i_1059_ = -is_1015_[i_1052_];
							final int i_1060_ = (i_1058_ - (i_1053_ - Class332_Sub3.anInt5451));
							if (i_1060_ > 0) {
								i_1053_ += i_1060_;
								i_1056_ += i_1060_;
								i_1054_ += Class332_Sub3.anInt5444 * i_1060_;
								i_1055_ += Class332_Sub3.anInt5436 * i_1060_;
							} else {
								i_1059_ -= i_1060_;
							}
							if (i_1056_ < i_1059_) {
								i_1056_ = i_1059_;
							}
							for (/**/; i_1056_ < 0; i_1056_++) {
								final int i_1061_ = (anIntArray6213[(((i_1055_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1054_ >> 12))]);
								if (i_1061_ != 0) {
									is_1017_[i_1053_++] = i_1061_;
								} else {
									i_1053_++;
								}
								i_1054_ += Class332_Sub3.anInt5444;
							}
						}
					}
					i_1051_++;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else if (Class332_Sub3.anInt5436 < 0) {
				int i_1062_ = Class332_Sub3.anInt5431;
				while (i_1062_ < 0) {
					final int i_1063_ = i_1062_ + i_1016_;
					if (i_1063_ >= 0) {
						if (i_1063_ >= is.length) {
							break;
						}
						int i_1064_ = Class332_Sub3.anInt5451;
						int i_1065_ = (Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425);
						int i_1066_ = (Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456);
						int i_1067_ = Class332_Sub3.anInt5448;
						int i_1068_;
						if ((i_1068_ = i_1065_
								- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
							i_1068_ = ((Class332_Sub3.anInt5444 - i_1068_) / Class332_Sub3.anInt5444);
							i_1067_ += i_1068_;
							i_1065_ += Class332_Sub3.anInt5444 * i_1068_;
							i_1066_ += Class332_Sub3.anInt5436 * i_1068_;
							i_1064_ += i_1068_;
						}
						if ((i_1068_ = ((i_1065_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1067_) {
							i_1067_ = i_1068_;
						}
						if ((i_1068_ = i_1066_
								- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
							i_1068_ = ((Class332_Sub3.anInt5436 - i_1068_) / Class332_Sub3.anInt5436);
							i_1067_ += i_1068_;
							i_1065_ += Class332_Sub3.anInt5444 * i_1068_;
							i_1066_ += Class332_Sub3.anInt5436 * i_1068_;
							i_1064_ += i_1068_;
						}
						if ((i_1068_ = ((i_1066_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1067_) {
							i_1067_ = i_1068_;
						}
						final int i_1069_ = is[i_1063_] - i;
						int i_1070_ = -is_1015_[i_1063_];
						final int i_1071_ = i_1069_
								- (i_1064_ - Class332_Sub3.anInt5451);
						if (i_1071_ > 0) {
							i_1064_ += i_1071_;
							i_1067_ += i_1071_;
							i_1065_ += Class332_Sub3.anInt5444 * i_1071_;
							i_1066_ += Class332_Sub3.anInt5436 * i_1071_;
						} else {
							i_1070_ -= i_1071_;
						}
						if (i_1067_ < i_1070_) {
							i_1067_ = i_1070_;
						}
						for (/**/; i_1067_ < 0; i_1067_++) {
							final int i_1072_ = (anIntArray6213[(((i_1066_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1065_ >> 12))]);
							if (i_1072_ != 0) {
								is_1017_[i_1064_++] = i_1072_;
							} else {
								i_1064_++;
							}
							i_1065_ += Class332_Sub3.anInt5444;
							i_1066_ += Class332_Sub3.anInt5436;
						}
					}
					i_1062_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else {
				int i_1073_ = Class332_Sub3.anInt5431;
				while (i_1073_ < 0) {
					final int i_1074_ = i_1073_ + i_1016_;
					if (i_1074_ >= 0) {
						if (i_1074_ >= is.length) {
							break;
						}
						int i_1075_ = Class332_Sub3.anInt5451;
						int i_1076_ = (Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425);
						int i_1077_ = (Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456);
						int i_1078_ = Class332_Sub3.anInt5448;
						int i_1079_;
						if ((i_1079_ = i_1076_
								- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
							i_1079_ = ((Class332_Sub3.anInt5444 - i_1079_) / Class332_Sub3.anInt5444);
							i_1078_ += i_1079_;
							i_1076_ += Class332_Sub3.anInt5444 * i_1079_;
							i_1077_ += Class332_Sub3.anInt5436 * i_1079_;
							i_1075_ += i_1079_;
						}
						if ((i_1079_ = ((i_1076_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1078_) {
							i_1078_ = i_1079_;
						}
						if (i_1077_ < 0) {
							i_1079_ = ((Class332_Sub3.anInt5436 - 1 - i_1077_) / Class332_Sub3.anInt5436);
							i_1078_ += i_1079_;
							i_1076_ += Class332_Sub3.anInt5444 * i_1079_;
							i_1077_ += Class332_Sub3.anInt5436 * i_1079_;
							i_1075_ += i_1079_;
						}
						if ((i_1079_ = ((1 + i_1077_
								- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1078_) {
							i_1078_ = i_1079_;
						}
						final int i_1080_ = is[i_1074_] - i;
						int i_1081_ = -is_1015_[i_1074_];
						final int i_1082_ = i_1080_
								- (i_1075_ - Class332_Sub3.anInt5451);
						if (i_1082_ > 0) {
							i_1075_ += i_1082_;
							i_1078_ += i_1082_;
							i_1076_ += Class332_Sub3.anInt5444 * i_1082_;
							i_1077_ += Class332_Sub3.anInt5436 * i_1082_;
						} else {
							i_1081_ -= i_1082_;
						}
						if (i_1078_ < i_1081_) {
							i_1078_ = i_1081_;
						}
						for (/**/; i_1078_ < 0; i_1078_++) {
							final int i_1083_ = (anIntArray6213[(((i_1077_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1076_ >> 12))]);
							if (i_1083_ != 0) {
								is_1017_[i_1075_++] = i_1083_;
							} else {
								i_1075_++;
							}
							i_1076_ += Class332_Sub3.anInt5444;
							i_1077_ += Class332_Sub3.anInt5436;
						}
					}
					i_1073_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			}
		} else if (Class332_Sub3.anInt5436 == 0) {
			int i_1084_ = Class332_Sub3.anInt5431;
			while (i_1084_ < 0) {
				final int i_1085_ = i_1084_ + i_1016_;
				if (i_1085_ >= 0) {
					if (i_1085_ >= is.length) {
						break;
					}
					int i_1086_ = Class332_Sub3.anInt5451;
					int i_1087_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_1088_ = Class332_Sub3.anInt5443;
					int i_1089_ = Class332_Sub3.anInt5448;
					if (i_1088_ >= 0
							&& (i_1088_
									- (((Class332_Sub3) this).anInt5454 << 12) < 0)) {
						if (i_1087_ < 0) {
							final int i_1090_ = ((Class332_Sub3.anInt5444 - 1 - i_1087_) / Class332_Sub3.anInt5444);
							i_1089_ += i_1090_;
							i_1087_ += Class332_Sub3.anInt5444 * i_1090_;
							i_1086_ += i_1090_;
						}
						int i_1091_;
						if ((i_1091_ = ((1 + i_1087_
								- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1089_) {
							i_1089_ = i_1091_;
						}
						final int i_1092_ = is[i_1085_] - i;
						int i_1093_ = -is_1015_[i_1085_];
						final int i_1094_ = i_1092_
								- (i_1086_ - Class332_Sub3.anInt5451);
						if (i_1094_ > 0) {
							i_1086_ += i_1094_;
							i_1089_ += i_1094_;
							i_1087_ += Class332_Sub3.anInt5444 * i_1094_;
							i_1088_ += Class332_Sub3.anInt5436 * i_1094_;
						} else {
							i_1093_ -= i_1094_;
						}
						if (i_1089_ < i_1093_) {
							i_1089_ = i_1093_;
						}
						for (/**/; i_1089_ < 0; i_1089_++) {
							final int i_1095_ = (anIntArray6213[(((i_1088_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1087_ >> 12))]);
							if (i_1095_ != 0) {
								is_1017_[i_1086_++] = i_1095_;
							} else {
								i_1086_++;
							}
							i_1087_ += Class332_Sub3.anInt5444;
						}
					}
				}
				i_1084_++;
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		} else if (Class332_Sub3.anInt5436 < 0) {
			int i_1096_ = Class332_Sub3.anInt5431;
			while (i_1096_ < 0) {
				final int i_1097_ = i_1096_ + i_1016_;
				if (i_1097_ >= 0) {
					if (i_1097_ >= is.length) {
						break;
					}
					int i_1098_ = Class332_Sub3.anInt5451;
					int i_1099_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_1100_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_1101_ = Class332_Sub3.anInt5448;
					if (i_1099_ < 0) {
						final int i_1102_ = ((Class332_Sub3.anInt5444 - 1 - i_1099_) / Class332_Sub3.anInt5444);
						i_1101_ += i_1102_;
						i_1099_ += Class332_Sub3.anInt5444 * i_1102_;
						i_1100_ += Class332_Sub3.anInt5436 * i_1102_;
						i_1098_ += i_1102_;
					}
					int i_1103_;
					if ((i_1103_ = ((1 + i_1099_
							- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1101_) {
						i_1101_ = i_1103_;
					}
					if ((i_1103_ = i_1100_
							- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
						i_1103_ = ((Class332_Sub3.anInt5436 - i_1103_) / Class332_Sub3.anInt5436);
						i_1101_ += i_1103_;
						i_1099_ += Class332_Sub3.anInt5444 * i_1103_;
						i_1100_ += Class332_Sub3.anInt5436 * i_1103_;
						i_1098_ += i_1103_;
					}
					if ((i_1103_ = ((i_1100_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1101_) {
						i_1101_ = i_1103_;
					}
					final int i_1104_ = is[i_1097_] - i;
					int i_1105_ = -is_1015_[i_1097_];
					final int i_1106_ = i_1104_
							- (i_1098_ - Class332_Sub3.anInt5451);
					if (i_1106_ > 0) {
						i_1098_ += i_1106_;
						i_1101_ += i_1106_;
						i_1099_ += Class332_Sub3.anInt5444 * i_1106_;
						i_1100_ += Class332_Sub3.anInt5436 * i_1106_;
					} else {
						i_1105_ -= i_1106_;
					}
					if (i_1101_ < i_1105_) {
						i_1101_ = i_1105_;
					}
					for (/**/; i_1101_ < 0; i_1101_++) {
						final int i_1107_ = (anIntArray6213[(((i_1100_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1099_ >> 12))]);
						if (i_1107_ != 0) {
							is_1017_[i_1098_++] = i_1107_;
						} else {
							i_1098_++;
						}
						i_1099_ += Class332_Sub3.anInt5444;
						i_1100_ += Class332_Sub3.anInt5436;
					}
				}
				i_1096_++;
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		} else {
			int i_1108_ = Class332_Sub3.anInt5431;
			while (i_1108_ < 0) {
				final int i_1109_ = i_1108_ + i_1016_;
				if (i_1109_ >= 0) {
					if (i_1109_ >= is.length) {
						break;
					}
					int i_1110_ = Class332_Sub3.anInt5451;
					int i_1111_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_1112_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_1113_ = Class332_Sub3.anInt5448;
					if (i_1111_ < 0) {
						final int i_1114_ = ((Class332_Sub3.anInt5444 - 1 - i_1111_) / Class332_Sub3.anInt5444);
						i_1113_ += i_1114_;
						i_1111_ += Class332_Sub3.anInt5444 * i_1114_;
						i_1112_ += Class332_Sub3.anInt5436 * i_1114_;
						i_1110_ += i_1114_;
					}
					int i_1115_;
					if ((i_1115_ = ((1 + i_1111_
							- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1113_) {
						i_1113_ = i_1115_;
					}
					if (i_1112_ < 0) {
						i_1115_ = ((Class332_Sub3.anInt5436 - 1 - i_1112_) / Class332_Sub3.anInt5436);
						i_1113_ += i_1115_;
						i_1111_ += Class332_Sub3.anInt5444 * i_1115_;
						i_1112_ += Class332_Sub3.anInt5436 * i_1115_;
						i_1110_ += i_1115_;
					}
					if ((i_1115_ = ((1 + i_1112_
							- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1113_) {
						i_1113_ = i_1115_;
					}
					final int i_1116_ = is[i_1109_] - i;
					int i_1117_ = -is_1015_[i_1109_];
					final int i_1118_ = i_1116_
							- (i_1110_ - Class332_Sub3.anInt5451);
					if (i_1118_ > 0) {
						i_1110_ += i_1118_;
						i_1113_ += i_1118_;
						i_1111_ += Class332_Sub3.anInt5444 * i_1118_;
						i_1112_ += Class332_Sub3.anInt5436 * i_1118_;
					} else {
						i_1117_ -= i_1118_;
					}
					if (i_1113_ < i_1117_) {
						i_1113_ = i_1117_;
					}
					for (/**/; i_1113_ < 0; i_1113_++) {
						final int i_1119_ = (anIntArray6213[(((i_1112_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1111_ >> 12))]);
						if (i_1119_ != 0) {
							is_1017_[i_1110_++] = i_1119_;
						} else {
							i_1110_++;
						}
						i_1111_ += Class332_Sub3.anInt5444;
						i_1112_ += Class332_Sub3.anInt5436;
					}
				}
				i_1108_++;
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		}
	}

	@Override
	final void method3736(final int i, final int i_1120_, final int i_1121_,
			final int i_1122_, final int i_1123_, final int i_1124_) {
		final int[] is = ((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504;
		for (int i_1125_ = 0; i_1125_ < i_1122_; i_1125_++) {
			final int i_1126_ = (i_1120_ + i_1125_)
					* ((Class332_Sub3) this).anInt5433 + i;
			final int i_1127_ = ((i_1124_ + i_1125_)
					* (((Class332_Sub3) this).aHa_Sub2_5434).anInt4505 + i_1123_);
			for (int i_1128_ = 0; i_1128_ < i_1121_; i_1128_++) {
				anIntArray6213[i_1126_ + i_1128_] = is[i_1127_ + i_1128_];
			}
		}
	}

	Class332_Sub3_Sub2(final ha_Sub2 var_ha_Sub2, final int[] is, int i,
			int i_1129_, final int i_1130_, final int i_1131_,
			final boolean bool) {
		super(var_ha_Sub2, i_1130_, i_1131_);
		if (bool) {
			anIntArray6213 = new int[i_1130_ * i_1131_];
		} else {
			anIntArray6213 = is;
		}
		i_1129_ -= ((Class332_Sub3) this).anInt5433;
		int i_1132_ = 0;
		for (int i_1133_ = 0; i_1133_ < i_1131_; i_1133_++) {
			for (int i_1134_ = 0; i_1134_ < i_1130_; i_1134_++) {
				final int i_1135_ = is[i++];
				if (i_1135_ >>> 24 == 255) {
					anIntArray6213[i_1132_++] = (i_1135_ & 0xffffff) == 0 ? -16777215
							: i_1135_;
				} else {
					anIntArray6213[i_1132_++] = 0;
				}
			}
			i += i_1129_;
		}
	}

	@Override
	final void method3742(final int i, final int i_1136_, final int i_1137_) {
		throw new IllegalStateException(
				"Can't capture alpha into a java_sprite_24");
	}
}
