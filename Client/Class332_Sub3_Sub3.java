/* Class332_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class332_Sub3_Sub3 extends Class332_Sub3 {
	private final int[] anIntArray6214;
	private final byte[] aByteArray6215;

	Class332_Sub3_Sub3(final ha_Sub2 var_ha_Sub2, final byte[] is,
			final int[] is_0_, final int i, final int i_1_) {
		super(var_ha_Sub2, i, i_1_);
		aByteArray6215 = is;
		anIntArray6214 = is_0_;
	}

	@Override
	final void method3745(int i, int i_2_, int i_3_, int i_4_, final int i_5_,
			int i_6_, final int i_7_, final int i_8_) {
		if (((Class332_Sub3) this).aHa_Sub2_5434.method1920()) {
			throw new IllegalStateException();
		}
		if (i_3_ > 0 && i_4_ > 0) {
			int i_9_ = 0;
			int i_10_ = 0;
			final int i_11_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4505;
			final int i_12_ = (((Class332_Sub3) this).anInt5446
					+ ((Class332_Sub3) this).anInt5433 + ((Class332_Sub3) this).anInt5455);
			final int i_13_ = (((Class332_Sub3) this).anInt5439
					+ ((Class332_Sub3) this).anInt5454 + ((Class332_Sub3) this).anInt5447);
			final int i_14_ = (i_12_ << 16) / i_3_;
			final int i_15_ = (i_13_ << 16) / i_4_;
			if (((Class332_Sub3) this).anInt5446 > 0) {
				final int i_16_ = (((((Class332_Sub3) this).anInt5446 << 16)
						+ i_14_ - 1) / i_14_);
				i += i_16_;
				i_9_ += i_16_ * i_14_
						- (((Class332_Sub3) this).anInt5446 << 16);
			}
			if (((Class332_Sub3) this).anInt5439 > 0) {
				final int i_17_ = (((((Class332_Sub3) this).anInt5439 << 16)
						+ i_15_ - 1) / i_15_);
				i_2_ += i_17_;
				i_10_ += i_17_ * i_15_
						- (((Class332_Sub3) this).anInt5439 << 16);
			}
			if (((Class332_Sub3) this).anInt5433 < i_12_) {
				i_3_ = ((((Class332_Sub3) this).anInt5433 << 16) - i_9_ + i_14_ - 1)
						/ i_14_;
			}
			if (((Class332_Sub3) this).anInt5454 < i_13_) {
				i_4_ = ((((Class332_Sub3) this).anInt5454 << 16) - i_10_
						+ i_15_ - 1)
						/ i_15_;
			}
			int i_18_ = i + i_2_ * i_11_;
			int i_19_ = i_11_ - i_3_;
			if (i_2_ + i_4_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4492) {
				i_4_ -= i_2_ + i_4_
						- (((Class332_Sub3) this).aHa_Sub2_5434).anInt4492;
			}
			if (i_2_ < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) {
				final int i_20_ = ((((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) - i_2_);
				i_4_ -= i_20_;
				i_18_ += i_20_ * i_11_;
				i_10_ += i_15_ * i_20_;
			}
			if (i + i_3_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4507) {
				final int i_21_ = i + i_3_
						- (((Class332_Sub3) this).aHa_Sub2_5434).anInt4507;
				i_3_ -= i_21_;
				i_19_ += i_21_;
			}
			if (i < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) {
				final int i_22_ = ((((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) - i);
				i_3_ -= i_22_;
				i_18_ += i_22_;
				i_9_ += i_14_ * i_22_;
				i_19_ += i_22_;
			}
			final int[] is = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			if (i_7_ == 0) {
				if (i_5_ == 1) {
					final int i_23_ = i_9_;
					for (int i_24_ = -i_4_; i_24_ < 0; i_24_++) {
						final int i_25_ = (i_10_ >> 16)
								* ((Class332_Sub3) this).anInt5433;
						for (int i_26_ = -i_3_; i_26_ < 0; i_26_++) {
							is[i_18_++] = (anIntArray6214[(aByteArray6215[(i_9_ >> 16)
									+ i_25_] & 0xff)]);
							i_9_ += i_14_;
						}
						i_10_ += i_15_;
						i_9_ = i_23_;
						i_18_ += i_19_;
					}
					return;
				}
				if (i_5_ == 0) {
					final int i_27_ = (i_6_ & 0xff0000) >> 16;
					final int i_28_ = (i_6_ & 0xff00) >> 8;
					final int i_29_ = i_6_ & 0xff;
					final int i_30_ = i_9_;
					for (int i_31_ = -i_4_; i_31_ < 0; i_31_++) {
						final int i_32_ = (i_10_ >> 16)
								* ((Class332_Sub3) this).anInt5433;
						for (int i_33_ = -i_3_; i_33_ < 0; i_33_++) {
							final int i_34_ = (anIntArray6214[(aByteArray6215[(i_9_ >> 16)
									+ i_32_] & 0xff)]);
							final int i_35_ = (i_34_ & 0xff0000) * i_27_
									& ~0xffffff;
							final int i_36_ = (i_34_ & 0xff00) * i_28_
									& 0xff0000;
							final int i_37_ = (i_34_ & 0xff) * i_29_ & 0xff00;
							is[i_18_++] = (i_35_ | i_36_ | i_37_) >>> 8;
							i_9_ += i_14_;
						}
						i_10_ += i_15_;
						i_9_ = i_30_;
						i_18_ += i_19_;
					}
					return;
				}
				if (i_5_ == 3) {
					final int i_38_ = i_9_;
					for (int i_39_ = -i_4_; i_39_ < 0; i_39_++) {
						final int i_40_ = (i_10_ >> 16)
								* ((Class332_Sub3) this).anInt5433;
						for (int i_41_ = -i_3_; i_41_ < 0; i_41_++) {
							final byte i_42_ = aByteArray6215[(i_9_ >> 16)
									+ i_40_];
							final int i_43_ = i_42_ > 0 ? anIntArray6214[i_42_]
									: 0;
							final int i_44_ = i_43_ + i_6_;
							final int i_45_ = (i_43_ & 0xff00ff)
									+ (i_6_ & 0xff00ff);
							final int i_46_ = ((i_45_ & 0x1000100) + (i_44_
									- i_45_ & 0x10000));
							is[i_18_++] = i_44_ - i_46_ | i_46_ - (i_46_ >>> 8);
							i_9_ += i_14_;
						}
						i_10_ += i_15_;
						i_9_ = i_38_;
						i_18_ += i_19_;
					}
					return;
				}
				if (i_5_ == 2) {
					final int i_47_ = i_6_ >>> 24;
					final int i_48_ = 256 - i_47_;
					int i_49_ = (i_6_ & 0xff00ff) * i_48_ & ~0xff00ff;
					int i_50_ = (i_6_ & 0xff00) * i_48_ & 0xff0000;
					i_6_ = (i_49_ | i_50_) >>> 8;
					final int i_51_ = i_9_;
					for (int i_52_ = -i_4_; i_52_ < 0; i_52_++) {
						final int i_53_ = (i_10_ >> 16)
								* ((Class332_Sub3) this).anInt5433;
						for (int i_54_ = -i_3_; i_54_ < 0; i_54_++) {
							final int i_55_ = (anIntArray6214[(aByteArray6215[(i_9_ >> 16)
									+ i_53_] & 0xff)]);
							i_49_ = (i_55_ & 0xff00ff) * i_47_ & ~0xff00ff;
							i_50_ = (i_55_ & 0xff00) * i_47_ & 0xff0000;
							is[i_18_++] = ((i_49_ | i_50_) >>> 8) + i_6_;
							i_9_ += i_14_;
						}
						i_10_ += i_15_;
						i_9_ = i_51_;
						i_18_ += i_19_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_7_ == 1) {
				if (i_5_ == 1) {
					final int i_56_ = i_9_;
					for (int i_57_ = -i_4_; i_57_ < 0; i_57_++) {
						final int i_58_ = (i_10_ >> 16)
								* ((Class332_Sub3) this).anInt5433;
						for (int i_59_ = -i_3_; i_59_ < 0; i_59_++) {
							final int i_60_ = aByteArray6215[(i_9_ >> 16)
									+ i_58_];
							if (i_60_ != 0) {
								is[i_18_++] = anIntArray6214[i_60_ & 0xff];
							} else {
								i_18_++;
							}
							i_9_ += i_14_;
						}
						i_10_ += i_15_;
						i_9_ = i_56_;
						i_18_ += i_19_;
					}
					return;
				}
				if (i_5_ == 0) {
					final int i_61_ = i_9_;
					if ((i_6_ & 0xffffff) == 16777215) {
						final int i_62_ = i_6_ >>> 24;
						final int i_63_ = 256 - i_62_;
						for (int i_64_ = -i_4_; i_64_ < 0; i_64_++) {
							final int i_65_ = ((i_10_ >> 16) * ((Class332_Sub3) this).anInt5433);
							for (int i_66_ = -i_3_; i_66_ < 0; i_66_++) {
								final int i_67_ = aByteArray6215[(i_9_ >> 16)
										+ i_65_];
								if (i_67_ != 0) {
									final int i_68_ = anIntArray6214[i_67_ & 0xff];
									final int i_69_ = is[i_18_];
									is[i_18_++] = ((((i_68_ & 0xff00ff) * i_62_ + (i_69_ & 0xff00ff)
											* i_63_) & ~0xff00ff) + (((i_68_ & 0xff00)
											* i_62_ + (i_69_ & 0xff00) * i_63_) & 0xff0000)) >> 8;
								} else {
									i_18_++;
								}
								i_9_ += i_14_;
							}
							i_10_ += i_15_;
							i_9_ = i_61_;
							i_18_ += i_19_;
						}
					} else {
						final int i_70_ = (i_6_ & 0xff0000) >> 16;
						final int i_71_ = (i_6_ & 0xff00) >> 8;
						final int i_72_ = i_6_ & 0xff;
						final int i_73_ = i_6_ >>> 24;
						final int i_74_ = 256 - i_73_;
						for (int i_75_ = -i_4_; i_75_ < 0; i_75_++) {
							final int i_76_ = ((i_10_ >> 16) * ((Class332_Sub3) this).anInt5433);
							for (int i_77_ = -i_3_; i_77_ < 0; i_77_++) {
								final int i_78_ = aByteArray6215[(i_9_ >> 16)
										+ i_76_];
								if (i_78_ != 0) {
									int i_79_ = anIntArray6214[i_78_ & 0xff];
									if (i_73_ != 255) {
										final int i_80_ = ((i_79_ & 0xff0000)
												* i_70_ & ~0xffffff);
										final int i_81_ = ((i_79_ & 0xff00)
												* i_71_ & 0xff0000);
										final int i_82_ = (i_79_ & 0xff)
												* i_72_ & 0xff00;
										i_79_ = (i_80_ | i_81_ | i_82_) >>> 8;
										final int i_83_ = is[i_18_];
										is[i_18_++] = ((((i_79_ & 0xff00ff)
												* i_73_ + (i_83_ & 0xff00ff)
												* i_74_) & ~0xff00ff) + (((i_79_ & 0xff00)
												* i_73_ + (i_83_ & 0xff00)
												* i_74_) & 0xff0000)) >> 8;
									} else {
										final int i_84_ = ((i_79_ & 0xff0000)
												* i_70_ & ~0xffffff);
										final int i_85_ = ((i_79_ & 0xff00)
												* i_71_ & 0xff0000);
										final int i_86_ = (i_79_ & 0xff)
												* i_72_ & 0xff00;
										is[i_18_++] = (i_84_ | i_85_ | i_86_) >>> 8;
									}
								} else {
									i_18_++;
								}
								i_9_ += i_14_;
							}
							i_10_ += i_15_;
							i_9_ = i_61_;
							i_18_ += i_19_;
						}
						return;
					}
					return;
				}
				if (i_5_ == 3) {
					final int i_87_ = i_9_;
					final int i_88_ = i_6_ >>> 24;
					final int i_89_ = 256 - i_88_;
					for (int i_90_ = -i_4_; i_90_ < 0; i_90_++) {
						final int i_91_ = (i_10_ >> 16)
								* ((Class332_Sub3) this).anInt5433;
						for (int i_92_ = -i_3_; i_92_ < 0; i_92_++) {
							final byte i_93_ = aByteArray6215[(i_9_ >> 16)
									+ i_91_];
							int i_94_ = i_93_ > 0 ? anIntArray6214[i_93_] : 0;
							final int i_95_ = i_94_ + i_6_;
							final int i_96_ = (i_94_ & 0xff00ff)
									+ (i_6_ & 0xff00ff);
							int i_97_ = ((i_96_ & 0x1000100) + (i_95_ - i_96_ & 0x10000));
							i_97_ = i_95_ - i_97_ | i_97_ - (i_97_ >>> 8);
							if (i_94_ == 0 && i_88_ != 255) {
								i_94_ = i_97_;
								i_97_ = is[i_18_];
								i_97_ = ((((i_94_ & 0xff00ff) * i_88_ + (i_97_ & 0xff00ff)
										* i_89_) & ~0xff00ff) + (((i_94_ & 0xff00)
										* i_88_ + (i_97_ & 0xff00) * i_89_) & 0xff0000)) >> 8;
							}
							is[i_18_++] = i_97_;
							i_9_ += i_14_;
						}
						i_10_ += i_15_;
						i_9_ = i_87_;
						i_18_ += i_19_;
					}
					return;
				}
				if (i_5_ == 2) {
					final int i_98_ = i_6_ >>> 24;
					final int i_99_ = 256 - i_98_;
					int i_100_ = (i_6_ & 0xff00ff) * i_99_ & ~0xff00ff;
					int i_101_ = (i_6_ & 0xff00) * i_99_ & 0xff0000;
					i_6_ = (i_100_ | i_101_) >>> 8;
					final int i_102_ = i_9_;
					for (int i_103_ = -i_4_; i_103_ < 0; i_103_++) {
						final int i_104_ = (i_10_ >> 16)
								* ((Class332_Sub3) this).anInt5433;
						for (int i_105_ = -i_3_; i_105_ < 0; i_105_++) {
							final int i_106_ = aByteArray6215[(i_9_ >> 16)
									+ i_104_];
							if (i_106_ != 0) {
								final int i_107_ = anIntArray6214[i_106_ & 0xff];
								i_100_ = (i_107_ & 0xff00ff) * i_98_
										& ~0xff00ff;
								i_101_ = (i_107_ & 0xff00) * i_98_ & 0xff0000;
								is[i_18_++] = ((i_100_ | i_101_) >>> 8) + i_6_;
							} else {
								i_18_++;
							}
							i_9_ += i_14_;
						}
						i_10_ += i_15_;
						i_9_ = i_102_;
						i_18_ += i_19_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_7_ == 2) {
				if (i_5_ == 1) {
					final int i_108_ = i_9_;
					for (int i_109_ = -i_4_; i_109_ < 0; i_109_++) {
						final int i_110_ = (i_10_ >> 16)
								* ((Class332_Sub3) this).anInt5433;
						for (int i_111_ = -i_3_; i_111_ < 0; i_111_++) {
							final int i_112_ = aByteArray6215[(i_9_ >> 16)
									+ i_110_];
							if (i_112_ != 0) {
								final int i_113_ = anIntArray6214[i_112_ & 0xff];
								int i_114_ = is[i_18_];
								final int i_115_ = i_113_ + i_114_;
								final int i_116_ = ((i_113_ & 0xff00ff) + (i_114_ & 0xff00ff));
								i_114_ = (i_116_ & 0x1000100)
										+ (i_115_ - i_116_ & 0x10000);
								is[i_18_++] = i_115_ - i_114_ | i_114_
										- (i_114_ >>> 8);
							} else {
								i_18_++;
							}
							i_9_ += i_14_;
						}
						i_10_ += i_15_;
						i_9_ = i_108_;
						i_18_ += i_19_;
					}
					return;
				}
				if (i_5_ == 0) {
					final int i_117_ = i_9_;
					final int i_118_ = (i_6_ & 0xff0000) >> 16;
					final int i_119_ = (i_6_ & 0xff00) >> 8;
					final int i_120_ = i_6_ & 0xff;
					for (int i_121_ = -i_4_; i_121_ < 0; i_121_++) {
						final int i_122_ = (i_10_ >> 16)
								* ((Class332_Sub3) this).anInt5433;
						for (int i_123_ = -i_3_; i_123_ < 0; i_123_++) {
							final int i_124_ = aByteArray6215[(i_9_ >> 16)
									+ i_122_];
							if (i_124_ != 0) {
								int i_125_ = anIntArray6214[i_124_ & 0xff];
								final int i_126_ = (i_125_ & 0xff0000) * i_118_
										& ~0xffffff;
								final int i_127_ = (i_125_ & 0xff00) * i_119_
										& 0xff0000;
								final int i_128_ = (i_125_ & 0xff) * i_120_
										& 0xff00;
								i_125_ = (i_126_ | i_127_ | i_128_) >>> 8;
								int i_129_ = is[i_18_];
								final int i_130_ = i_125_ + i_129_;
								final int i_131_ = ((i_125_ & 0xff00ff) + (i_129_ & 0xff00ff));
								i_129_ = (i_131_ & 0x1000100)
										+ (i_130_ - i_131_ & 0x10000);
								is[i_18_++] = i_130_ - i_129_ | i_129_
										- (i_129_ >>> 8);
							} else {
								i_18_++;
							}
							i_9_ += i_14_;
						}
						i_10_ += i_15_;
						i_9_ = i_117_;
						i_18_ += i_19_;
					}
					return;
				}
				if (i_5_ == 3) {
					final int i_132_ = i_9_;
					for (int i_133_ = -i_4_; i_133_ < 0; i_133_++) {
						final int i_134_ = (i_10_ >> 16)
								* ((Class332_Sub3) this).anInt5433;
						for (int i_135_ = -i_3_; i_135_ < 0; i_135_++) {
							final byte i_136_ = aByteArray6215[(i_9_ >> 16)
									+ i_134_];
							int i_137_ = i_136_ > 0 ? anIntArray6214[i_136_]
									: 0;
							int i_138_ = i_137_ + i_6_;
							int i_139_ = (i_137_ & 0xff00ff)
									+ (i_6_ & 0xff00ff);
							int i_140_ = ((i_139_ & 0x1000100) + (i_138_
									- i_139_ & 0x10000));
							i_137_ = i_138_ - i_140_ | i_140_ - (i_140_ >>> 8);
							i_140_ = is[i_18_];
							i_138_ = i_137_ + i_140_;
							i_139_ = (i_137_ & 0xff00ff) + (i_140_ & 0xff00ff);
							i_140_ = (i_139_ & 0x1000100)
									+ (i_138_ - i_139_ & 0x10000);
							is[i_18_++] = i_138_ - i_140_ | i_140_
									- (i_140_ >>> 8);
							i_9_ += i_14_;
						}
						i_10_ += i_15_;
						i_9_ = i_132_;
						i_18_ += i_19_;
					}
					return;
				}
				if (i_5_ == 2) {
					final int i_141_ = i_6_ >>> 24;
					final int i_142_ = 256 - i_141_;
					int i_143_ = (i_6_ & 0xff00ff) * i_142_ & ~0xff00ff;
					int i_144_ = (i_6_ & 0xff00) * i_142_ & 0xff0000;
					i_6_ = (i_143_ | i_144_) >>> 8;
					final int i_145_ = i_9_;
					for (int i_146_ = -i_4_; i_146_ < 0; i_146_++) {
						final int i_147_ = (i_10_ >> 16)
								* ((Class332_Sub3) this).anInt5433;
						for (int i_148_ = -i_3_; i_148_ < 0; i_148_++) {
							final int i_149_ = aByteArray6215[(i_9_ >> 16)
									+ i_147_];
							if (i_149_ != 0) {
								int i_150_ = anIntArray6214[i_149_ & 0xff];
								i_143_ = (i_150_ & 0xff00ff) * i_141_
										& ~0xff00ff;
								i_144_ = (i_150_ & 0xff00) * i_141_ & 0xff0000;
								i_150_ = ((i_143_ | i_144_) >>> 8) + i_6_;
								int i_151_ = is[i_18_];
								final int i_152_ = i_150_ + i_151_;
								final int i_153_ = ((i_150_ & 0xff00ff) + (i_151_ & 0xff00ff));
								i_151_ = (i_153_ & 0x1000100)
										+ (i_152_ - i_153_ & 0x10000);
								is[i_18_++] = i_152_ - i_151_ | i_151_
										- (i_151_ >>> 8);
							} else {
								i_18_++;
							}
							i_9_ += i_14_;
						}
						i_10_ += i_15_;
						i_9_ = i_145_;
						i_18_ += i_19_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	@Override
	final void method3736(final int i, final int i_154_, final int i_155_,
			final int i_156_, final int i_157_, final int i_158_) {
		throw new IllegalStateException();
	}

	@Override
	final void method3757(int i, int i_159_, final int i_160_, int i_161_,
			int i_162_, final int i_163_, int i_164_, final int i_165_,
			final int i_166_) {
		if (i_161_ > 0 && i_162_ > 0) {
			int i_167_ = 0;
			int i_168_ = 0;
			final int i_169_ = (((Class332_Sub3) this).anInt5446
					+ ((Class332_Sub3) this).anInt5433 + ((Class332_Sub3) this).anInt5455);
			final int i_170_ = (((Class332_Sub3) this).anInt5439
					+ ((Class332_Sub3) this).anInt5454 + ((Class332_Sub3) this).anInt5447);
			final int i_171_ = (i_169_ << 16) / i_161_;
			final int i_172_ = (i_170_ << 16) / i_162_;
			if (((Class332_Sub3) this).anInt5446 > 0) {
				final int i_173_ = (((((Class332_Sub3) this).anInt5446 << 16)
						+ i_171_ - 1) / i_171_);
				i += i_173_;
				i_167_ += i_173_ * i_171_
						- (((Class332_Sub3) this).anInt5446 << 16);
			}
			if (((Class332_Sub3) this).anInt5439 > 0) {
				final int i_174_ = (((((Class332_Sub3) this).anInt5439 << 16)
						+ i_172_ - 1) / i_172_);
				i_159_ += i_174_;
				i_168_ += i_174_ * i_172_
						- (((Class332_Sub3) this).anInt5439 << 16);
			}
			if (((Class332_Sub3) this).anInt5433 < i_169_) {
				i_161_ = ((((Class332_Sub3) this).anInt5433 << 16) - i_167_
						+ i_171_ - 1)
						/ i_171_;
			}
			if (((Class332_Sub3) this).anInt5454 < i_170_) {
				i_162_ = ((((Class332_Sub3) this).anInt5454 << 16) - i_168_
						+ i_172_ - 1)
						/ i_172_;
			}
			int i_175_ = i + i_159_
					* (((Class332_Sub3) this).aHa_Sub2_5434).anInt4505;
			int i_176_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4505 - i_161_);
			if (i_159_ + i_162_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4492) {
				i_162_ -= (i_159_ + i_162_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4492));
			}
			if (i_159_ < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) {
				final int i_177_ = ((((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) - i_159_);
				i_162_ -= i_177_;
				i_175_ += i_177_
						* (((Class332_Sub3) this).aHa_Sub2_5434).anInt4505;
				i_168_ += i_172_ * i_177_;
			}
			if (i + i_161_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4507) {
				final int i_178_ = (i + i_161_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4507));
				i_161_ -= i_178_;
				i_176_ += i_178_;
			}
			if (i < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) {
				final int i_179_ = ((((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) - i);
				i_161_ -= i_179_;
				i_175_ += i_179_;
				i_167_ += i_171_ * i_179_;
				i_176_ += i_179_;
			}
			final float[] fs = (((Class332_Sub3) this).aHa_Sub2_5434.aFloatArray4487);
			final int[] is = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			if (i_165_ == 0) {
				if (i_163_ == 1) {
					final int i_180_ = i_167_;
					for (int i_181_ = -i_162_; i_181_ < 0; i_181_++) {
						final int i_182_ = ((i_168_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_183_ = -i_161_; i_183_ < 0; i_183_++) {
							if (i_160_ < fs[i_175_]) {
								is[i_175_] = (anIntArray6214[(aByteArray6215[(i_167_ >> 16)
										+ i_182_]) & 0xff]);
								fs[i_175_] = i_160_;
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_180_;
						i_175_ += i_176_;
					}
					return;
				}
				if (i_163_ == 0) {
					final int i_184_ = (i_164_ & 0xff0000) >> 16;
					final int i_185_ = (i_164_ & 0xff00) >> 8;
					final int i_186_ = i_164_ & 0xff;
					final int i_187_ = i_167_;
					for (int i_188_ = -i_162_; i_188_ < 0; i_188_++) {
						final int i_189_ = ((i_168_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_190_ = -i_161_; i_190_ < 0; i_190_++) {
							if (i_160_ < fs[i_175_]) {
								final int i_191_ = (anIntArray6214[(aByteArray6215[(i_167_ >> 16)
										+ i_189_]) & 0xff]);
								final int i_192_ = (i_191_ & 0xff0000) * i_184_
										& ~0xffffff;
								final int i_193_ = (i_191_ & 0xff00) * i_185_
										& 0xff0000;
								final int i_194_ = (i_191_ & 0xff) * i_186_
										& 0xff00;
								is[i_175_] = (i_192_ | i_193_ | i_194_) >>> 8;
								fs[i_175_] = i_160_;
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_187_;
						i_175_ += i_176_;
					}
					return;
				}
				if (i_163_ == 3) {
					final int i_195_ = i_167_;
					for (int i_196_ = -i_162_; i_196_ < 0; i_196_++) {
						final int i_197_ = ((i_168_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_198_ = -i_161_; i_198_ < 0; i_198_++) {
							if (i_160_ < fs[i_175_]) {
								final byte i_199_ = aByteArray6215[(i_167_ >> 16)
										+ i_197_];
								final int i_200_ = i_199_ > 0 ? anIntArray6214[i_199_]
										: 0;
								final int i_201_ = i_200_ + i_164_;
								final int i_202_ = ((i_200_ & 0xff00ff) + (i_164_ & 0xff00ff));
								final int i_203_ = ((i_202_ & 0x1000100) + (i_201_
										- i_202_ & 0x10000));
								is[i_175_] = i_201_ - i_203_ | i_203_
										- (i_203_ >>> 8);
								fs[i_175_] = i_160_;
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_195_;
						i_175_ += i_176_;
					}
					return;
				}
				if (i_163_ == 2) {
					final int i_204_ = i_164_ >>> 24;
					final int i_205_ = 256 - i_204_;
					int i_206_ = (i_164_ & 0xff00ff) * i_205_ & ~0xff00ff;
					int i_207_ = (i_164_ & 0xff00) * i_205_ & 0xff0000;
					i_164_ = (i_206_ | i_207_) >>> 8;
					final int i_208_ = i_167_;
					for (int i_209_ = -i_162_; i_209_ < 0; i_209_++) {
						final int i_210_ = ((i_168_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_211_ = -i_161_; i_211_ < 0; i_211_++) {
							if (i_160_ < fs[i_175_]) {
								final int i_212_ = (anIntArray6214[(aByteArray6215[(i_167_ >> 16)
										+ i_210_]) & 0xff]);
								i_206_ = (i_212_ & 0xff00ff) * i_204_
										& ~0xff00ff;
								i_207_ = (i_212_ & 0xff00) * i_204_ & 0xff0000;
								is[i_175_] = ((i_206_ | i_207_) >>> 8) + i_164_;
								fs[i_175_] = i_160_;
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_208_;
						i_175_ += i_176_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_165_ == 1) {
				if (i_163_ == 1) {
					final int i_213_ = i_167_;
					for (int i_214_ = -i_162_; i_214_ < 0; i_214_++) {
						final int i_215_ = ((i_168_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_216_ = -i_161_; i_216_ < 0; i_216_++) {
							if (i_160_ < fs[i_175_]) {
								final int i_217_ = aByteArray6215[(i_167_ >> 16)
										+ i_215_];
								if (i_217_ != 0) {
									is[i_175_] = anIntArray6214[i_217_ & 0xff];
									fs[i_175_] = i_160_;
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_213_;
						i_175_ += i_176_;
					}
					return;
				}
				if (i_163_ == 0) {
					final int i_218_ = i_167_;
					if ((i_164_ & 0xffffff) == 16777215) {
						final int i_219_ = i_164_ >>> 24;
						final int i_220_ = 256 - i_219_;
						for (int i_221_ = -i_162_; i_221_ < 0; i_221_++) {
							final int i_222_ = ((i_168_ >> 16) * ((Class332_Sub3) this).anInt5433);
							for (int i_223_ = -i_161_; i_223_ < 0; i_223_++) {
								if (i_160_ < fs[i_175_]) {
									final int i_224_ = (aByteArray6215[(i_167_ >> 16)
											+ i_222_]);
									if (i_224_ != 0) {
										final int i_225_ = anIntArray6214[i_224_ & 0xff];
										final int i_226_ = is[i_175_];
										is[i_175_] = ((((i_225_ & 0xff00ff)
												* i_219_ + ((i_226_ & 0xff00ff) * i_220_)) & ~0xff00ff) + (((i_225_ & 0xff00)
												* i_219_ + ((i_226_ & 0xff00) * i_220_)) & 0xff0000)) >> 8;
										fs[i_175_] = i_160_;
									}
								}
								i_167_ += i_171_;
								i_175_++;
							}
							i_168_ += i_172_;
							i_167_ = i_218_;
							i_175_ += i_176_;
						}
					} else {
						final int i_227_ = (i_164_ & 0xff0000) >> 16;
						final int i_228_ = (i_164_ & 0xff00) >> 8;
						final int i_229_ = i_164_ & 0xff;
						final int i_230_ = i_164_ >>> 24;
						final int i_231_ = 256 - i_230_;
						for (int i_232_ = -i_162_; i_232_ < 0; i_232_++) {
							final int i_233_ = ((i_168_ >> 16) * ((Class332_Sub3) this).anInt5433);
							for (int i_234_ = -i_161_; i_234_ < 0; i_234_++) {
								if (i_160_ < fs[i_175_]) {
									final int i_235_ = (aByteArray6215[(i_167_ >> 16)
											+ i_233_]);
									if (i_235_ != 0) {
										int i_236_ = anIntArray6214[i_235_ & 0xff];
										if (i_230_ != 255) {
											final int i_237_ = ((i_236_ & 0xff0000)
													* i_227_ & ~0xffffff);
											final int i_238_ = ((i_236_ & 0xff00)
													* i_228_ & 0xff0000);
											final int i_239_ = ((i_236_ & 0xff)
													* i_229_ & 0xff00);
											i_236_ = (i_237_ | i_238_ | i_239_) >>> 8;
											final int i_240_ = is[i_175_];
											is[i_175_] = (((((i_236_ & 0xff00ff) * i_230_) + ((i_240_ & 0xff00ff) * i_231_)) & ~0xff00ff) + ((((i_236_ & 0xff00) * i_230_) + ((i_240_ & 0xff00) * i_231_)) & 0xff0000)) >> 8;
											fs[i_175_] = i_160_;
										} else {
											final int i_241_ = ((i_236_ & 0xff0000)
													* i_227_ & ~0xffffff);
											final int i_242_ = ((i_236_ & 0xff00)
													* i_228_ & 0xff0000);
											final int i_243_ = ((i_236_ & 0xff)
													* i_229_ & 0xff00);
											is[i_175_] = (i_241_ | i_242_ | i_243_) >>> 8;
											fs[i_175_] = i_160_;
										}
									}
								}
								i_167_ += i_171_;
								i_175_++;
							}
							i_168_ += i_172_;
							i_167_ = i_218_;
							i_175_ += i_176_;
						}
						return;
					}
					return;
				}
				if (i_163_ == 3) {
					final int i_244_ = i_167_;
					final int i_245_ = i_164_ >>> 24;
					final int i_246_ = 256 - i_245_;
					for (int i_247_ = -i_162_; i_247_ < 0; i_247_++) {
						final int i_248_ = ((i_168_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_249_ = -i_161_; i_249_ < 0; i_249_++) {
							if (i_160_ < fs[i_175_]) {
								final byte i_250_ = aByteArray6215[(i_167_ >> 16)
										+ i_248_];
								int i_251_ = i_250_ > 0 ? anIntArray6214[i_250_]
										: 0;
								final int i_252_ = i_251_ + i_164_;
								final int i_253_ = ((i_251_ & 0xff00ff) + (i_164_ & 0xff00ff));
								int i_254_ = ((i_253_ & 0x1000100) + (i_252_
										- i_253_ & 0x10000));
								i_254_ = i_252_ - i_254_ | i_254_
										- (i_254_ >>> 8);
								if (i_251_ == 0 && i_245_ != 255) {
									i_251_ = i_254_;
									i_254_ = is[i_175_];
									i_254_ = ((((i_251_ & 0xff00ff) * i_245_ + (i_254_ & 0xff00ff)
											* i_246_) & ~0xff00ff) + (((i_251_ & 0xff00)
											* i_245_ + (i_254_ & 0xff00)
											* i_246_) & 0xff0000)) >> 8;
								}
								is[i_175_] = i_254_;
								fs[i_175_] = i_160_;
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_244_;
						i_175_ += i_176_;
					}
					return;
				}
				if (i_163_ == 2) {
					final int i_255_ = i_164_ >>> 24;
					final int i_256_ = 256 - i_255_;
					int i_257_ = (i_164_ & 0xff00ff) * i_256_ & ~0xff00ff;
					int i_258_ = (i_164_ & 0xff00) * i_256_ & 0xff0000;
					i_164_ = (i_257_ | i_258_) >>> 8;
					final int i_259_ = i_167_;
					for (int i_260_ = -i_162_; i_260_ < 0; i_260_++) {
						final int i_261_ = ((i_168_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_262_ = -i_161_; i_262_ < 0; i_262_++) {
							if (i_160_ < fs[i_175_]) {
								final int i_263_ = aByteArray6215[(i_167_ >> 16)
										+ i_261_];
								if (i_263_ != 0) {
									final int i_264_ = anIntArray6214[i_263_ & 0xff];
									i_257_ = ((i_264_ & 0xff00ff) * i_255_ & ~0xff00ff);
									i_258_ = ((i_264_ & 0xff00) * i_255_ & 0xff0000);
									is[i_175_] = ((i_257_ | i_258_) >>> 8)
											+ i_164_;
									fs[i_175_] = i_160_;
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_259_;
						i_175_ += i_176_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_165_ == 2) {
				if (i_163_ == 1) {
					final int i_265_ = i_167_;
					for (int i_266_ = -i_162_; i_266_ < 0; i_266_++) {
						final int i_267_ = ((i_168_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_268_ = -i_161_; i_268_ < 0; i_268_++) {
							if (i_160_ < fs[i_175_]) {
								final int i_269_ = aByteArray6215[(i_167_ >> 16)
										+ i_267_];
								if (i_269_ != 0) {
									final int i_270_ = anIntArray6214[i_269_ & 0xff];
									int i_271_ = is[i_175_];
									final int i_272_ = i_270_ + i_271_;
									final int i_273_ = ((i_270_ & 0xff00ff) + (i_271_ & 0xff00ff));
									i_271_ = ((i_273_ & 0x1000100) + (i_272_
											- i_273_ & 0x10000));
									is[i_175_] = i_272_ - i_271_ | i_271_
											- (i_271_ >>> 8);
									fs[i_175_] = i_160_;
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_265_;
						i_175_ += i_176_;
					}
					return;
				}
				if (i_163_ == 0) {
					final int i_274_ = i_167_;
					final int i_275_ = (i_164_ & 0xff0000) >> 16;
					final int i_276_ = (i_164_ & 0xff00) >> 8;
					final int i_277_ = i_164_ & 0xff;
					for (int i_278_ = -i_162_; i_278_ < 0; i_278_++) {
						final int i_279_ = ((i_168_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_280_ = -i_161_; i_280_ < 0; i_280_++) {
							if (i_160_ < fs[i_175_]) {
								final int i_281_ = aByteArray6215[(i_167_ >> 16)
										+ i_279_];
								if (i_281_ != 0) {
									int i_282_ = anIntArray6214[i_281_ & 0xff];
									final int i_283_ = ((i_282_ & 0xff0000)
											* i_275_ & ~0xffffff);
									final int i_284_ = ((i_282_ & 0xff00)
											* i_276_ & 0xff0000);
									final int i_285_ = (i_282_ & 0xff) * i_277_
											& 0xff00;
									i_282_ = (i_283_ | i_284_ | i_285_) >>> 8;
									int i_286_ = is[i_175_];
									final int i_287_ = i_282_ + i_286_;
									final int i_288_ = ((i_282_ & 0xff00ff) + (i_286_ & 0xff00ff));
									i_286_ = ((i_288_ & 0x1000100) + (i_287_
											- i_288_ & 0x10000));
									is[i_175_] = i_287_ - i_286_ | i_286_
											- (i_286_ >>> 8);
									fs[i_175_] = i_160_;
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_274_;
						i_175_ += i_176_;
					}
					return;
				}
				if (i_163_ == 3) {
					final int i_289_ = i_167_;
					for (int i_290_ = -i_162_; i_290_ < 0; i_290_++) {
						final int i_291_ = ((i_168_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_292_ = -i_161_; i_292_ < 0; i_292_++) {
							if (i_160_ < fs[i_175_]) {
								final byte i_293_ = aByteArray6215[(i_167_ >> 16)
										+ i_291_];
								int i_294_ = i_293_ > 0 ? anIntArray6214[i_293_]
										: 0;
								int i_295_ = i_294_ + i_164_;
								int i_296_ = ((i_294_ & 0xff00ff) + (i_164_ & 0xff00ff));
								int i_297_ = ((i_296_ & 0x1000100) + (i_295_
										- i_296_ & 0x10000));
								i_294_ = i_295_ - i_297_ | i_297_
										- (i_297_ >>> 8);
								i_297_ = is[i_175_];
								i_295_ = i_294_ + i_297_;
								i_296_ = (i_294_ & 0xff00ff)
										+ (i_297_ & 0xff00ff);
								i_297_ = (i_296_ & 0x1000100)
										+ (i_295_ - i_296_ & 0x10000);
								is[i_175_] = i_295_ - i_297_ | i_297_
										- (i_297_ >>> 8);
								fs[i_175_] = i_160_;
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_289_;
						i_175_ += i_176_;
					}
					return;
				}
				if (i_163_ == 2) {
					final int i_298_ = i_164_ >>> 24;
					final int i_299_ = 256 - i_298_;
					int i_300_ = (i_164_ & 0xff00ff) * i_299_ & ~0xff00ff;
					int i_301_ = (i_164_ & 0xff00) * i_299_ & 0xff0000;
					i_164_ = (i_300_ | i_301_) >>> 8;
					final int i_302_ = i_167_;
					for (int i_303_ = -i_162_; i_303_ < 0; i_303_++) {
						final int i_304_ = ((i_168_ >> 16) * ((Class332_Sub3) this).anInt5433);
						for (int i_305_ = -i_161_; i_305_ < 0; i_305_++) {
							if (i_160_ < fs[i_175_]) {
								final int i_306_ = aByteArray6215[(i_167_ >> 16)
										+ i_304_];
								if (i_306_ != 0) {
									int i_307_ = anIntArray6214[i_306_ & 0xff];
									i_300_ = ((i_307_ & 0xff00ff) * i_298_ & ~0xff00ff);
									i_301_ = ((i_307_ & 0xff00) * i_298_ & 0xff0000);
									i_307_ = ((i_300_ | i_301_) >>> 8) + i_164_;
									int i_308_ = is[i_175_];
									final int i_309_ = i_307_ + i_308_;
									final int i_310_ = ((i_307_ & 0xff00ff) + (i_308_ & 0xff00ff));
									i_308_ = ((i_310_ & 0x1000100) + (i_309_
											- i_310_ & 0x10000));
									is[i_175_] = i_309_ - i_308_ | i_308_
											- (i_308_ >>> 8);
									fs[i_175_] = i_160_;
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_302_;
						i_175_ += i_176_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	@Override
	final void method3729(int i, int i_311_, final aa var_aa, final int i_312_,
			final int i_313_) {
		if (((Class332_Sub3) this).aHa_Sub2_5434.method1920()) {
			throw new IllegalStateException();
		}
		i += ((Class332_Sub3) this).anInt5446;
		i_311_ += ((Class332_Sub3) this).anInt5439;
		int i_314_ = 0;
		final int i_315_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4505;
		int i_316_ = ((Class332_Sub3) this).anInt5433;
		int i_317_ = ((Class332_Sub3) this).anInt5454;
		int i_318_ = i_315_ - i_316_;
		int i_319_ = 0;
		int i_320_ = i + i_311_ * i_315_;
		if (i_311_ < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) {
			final int i_321_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4495 - i_311_);
			i_317_ -= i_321_;
			i_311_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495;
			i_314_ += i_321_ * i_316_;
			i_320_ += i_321_ * i_315_;
		}
		if (i_311_ + i_317_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4492) {
			i_317_ -= i_311_ + i_317_
					- (((Class332_Sub3) this).aHa_Sub2_5434).anInt4492;
		}
		if (i < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) {
			final int i_322_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4509 - i);
			i_316_ -= i_322_;
			i = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509;
			i_314_ += i_322_;
			i_320_ += i_322_;
			i_319_ += i_322_;
			i_318_ += i_322_;
		}
		if (i + i_316_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4507) {
			final int i_323_ = (i + i_316_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4507));
			i_316_ -= i_323_;
			i_319_ += i_323_;
			i_318_ += i_323_;
		}
		if (i_316_ > 0 && i_317_ > 0) {
			final aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
			final int[] is = var_aa_Sub1.anIntArray3555;
			final int[] is_324_ = var_aa_Sub1.anIntArray3557;
			final int[] is_325_ = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			int i_326_ = i_311_;
			if (i_313_ > i_326_) {
				i_326_ = i_313_;
				i_320_ += (i_313_ - i_311_) * i_315_;
				i_314_ += (i_313_ - i_311_) * ((Class332_Sub3) this).anInt5433;
			}
			final int i_327_ = (i_313_ + is.length < i_311_ + i_317_ ? i_313_
					+ is.length : i_311_ + i_317_);
			for (int i_328_ = i_326_; i_328_ < i_327_; i_328_++) {
				final int i_329_ = is[i_328_ - i_313_] + i_312_;
				int i_330_ = is_324_[i_328_ - i_313_];
				int i_331_ = i_316_;
				if (i > i_329_) {
					final int i_332_ = i - i_329_;
					if (i_332_ >= i_330_) {
						i_314_ += i_316_ + i_319_;
						i_320_ += i_316_ + i_318_;
						continue;
					}
					i_330_ -= i_332_;
				} else {
					final int i_333_ = i_329_ - i;
					if (i_333_ >= i_316_) {
						i_314_ += i_316_ + i_319_;
						i_320_ += i_316_ + i_318_;
						continue;
					}
					i_314_ += i_333_;
					i_331_ -= i_333_;
					i_320_ += i_333_;
				}
				int i_334_ = 0;
				if (i_331_ < i_330_) {
					i_330_ = i_331_;
				} else {
					i_334_ = i_331_ - i_330_;
				}
				for (int i_335_ = -i_330_; i_335_ < 0; i_335_++) {
					final int i_336_ = aByteArray6215[i_314_++];
					if (i_336_ != 0) {
						is_325_[i_320_++] = anIntArray6214[i_336_ & 0xff];
					} else {
						i_320_++;
					}
				}
				i_314_ += i_334_ + i_319_;
				i_320_ += i_334_ + i_318_;
			}
		}
	}

	@Override
	final void method3742(final int i, final int i_337_, final int i_338_) {
		throw new IllegalStateException();
	}

	@Override
	final void method3759(final int i, final int i_339_) {
		final int[] is = ((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504;
		if (Class332_Sub3.anInt5444 == 0) {
			if (Class332_Sub3.anInt5436 == 0) {
				int i_340_ = Class332_Sub3.anInt5431;
				while (i_340_ < 0) {
					int i_341_ = Class332_Sub3.anInt5451;
					final int i_342_ = Class332_Sub3.anInt5450;
					final int i_343_ = Class332_Sub3.anInt5443;
					int i_344_ = Class332_Sub3.anInt5448;
					if (i_342_ >= 0
							&& i_343_ >= 0
							&& (i_342_
									- (((Class332_Sub3) this).anInt5433 << 12) < 0)
							&& (i_343_
									- (((Class332_Sub3) this).anInt5454 << 12) < 0)) {
						for (/**/; i_344_ < 0; i_344_++) {
							final int i_345_ = (((i_343_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_342_ >> 12));
							int i_346_ = i_341_++;
							final int[] is_347_ = is;
							final int i_348_ = i;
							final int i_349_ = i_339_;
							if (i_349_ == 0) {
								if (i_348_ == 1) {
									is_347_[i_346_] = (anIntArray6214[aByteArray6215[i_345_] & 0xff]);
								} else if (i_348_ == 0) {
									final int i_350_ = (anIntArray6214[aByteArray6215[i_345_] & 0xff]);
									final int i_351_ = (((i_350_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_352_ = (((i_350_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_353_ = (((i_350_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_347_[i_346_] = (i_351_ | i_352_ | i_353_) >>> 8;
								} else if (i_348_ == 3) {
									final int i_354_ = (anIntArray6214[aByteArray6215[i_345_] & 0xff]);
									final int i_355_ = Class332_Sub3.anInt5432;
									final int i_356_ = i_354_ + i_355_;
									final int i_357_ = ((i_354_ & 0xff00ff) + (i_355_ & 0xff00ff));
									final int i_358_ = ((i_357_ & 0x1000100) + (i_356_
											- i_357_ & 0x10000));
									is_347_[i_346_] = i_356_ - i_358_ | i_358_
											- (i_358_ >>> 8);
								} else if (i_348_ == 2) {
									final int i_359_ = (anIntArray6214[aByteArray6215[i_345_] & 0xff]);
									final int i_360_ = (((i_359_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_361_ = (((i_359_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_347_[i_346_] = (((i_360_ | i_361_) >>> 8) + Class332_Sub3.anInt5440);
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_349_ == 1) {
								if (i_348_ == 1) {
									final int i_362_ = aByteArray6215[i_345_];
									if (i_362_ != 0) {
										is_347_[i_346_] = anIntArray6214[i_362_ & 0xff];
									}
								} else if (i_348_ == 0) {
									final int i_363_ = aByteArray6215[i_345_];
									if (i_363_ != 0) {
										int i_364_ = anIntArray6214[i_363_ & 0xff];
										if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
											final int i_365_ = (Class332_Sub3.anInt5432 >>> 24);
											final int i_366_ = 256 - i_365_;
											final int i_367_ = is_347_[i_346_];
											is_347_[i_346_] = (((((i_364_ & 0xff00ff) * i_365_) + ((i_367_ & 0xff00ff) * i_366_)) & ~0xff00ff) + ((((i_364_ & 0xff00) * i_365_) + ((i_367_ & 0xff00) * i_366_)) & 0xff0000)) >> 8;
										} else if (Class332_Sub3.anInt5449 != 255) {
											final int i_368_ = (((i_364_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_369_ = (((i_364_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_370_ = (((i_364_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											i_364_ = (i_368_ | i_369_ | i_370_) >>> 8;
											final int i_371_ = is_347_[i_346_];
											is_347_[i_346_] = (((((i_364_ & 0xff00ff) * (Class332_Sub3.anInt5449)) + ((i_371_ & 0xff00ff) * (Class332_Sub3.anInt5442))) & ~0xff00ff) + ((((i_364_ & 0xff00) * (Class332_Sub3.anInt5449)) + ((i_371_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
										} else {
											final int i_372_ = (((i_364_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_373_ = (((i_364_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_374_ = (((i_364_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											is_347_[i_346_] = (i_372_ | i_373_ | i_374_) >>> 8;
										}
									}
								} else if (i_348_ == 3) {
									final byte i_375_ = aByteArray6215[i_345_];
									int i_376_ = (i_375_ > 0 ? anIntArray6214[i_375_]
											: 0);
									final int i_377_ = Class332_Sub3.anInt5432;
									final int i_378_ = i_376_ + i_377_;
									final int i_379_ = ((i_376_ & 0xff00ff) + (i_377_ & 0xff00ff));
									int i_380_ = ((i_379_ & 0x1000100) + (i_378_
											- i_379_ & 0x10000));
									i_380_ = i_378_ - i_380_ | i_380_
											- (i_380_ >>> 8);
									if (i_376_ == 0
											&& Class332_Sub3.anInt5449 != 255) {
										i_376_ = i_380_;
										i_380_ = is_347_[i_346_];
										i_380_ = (((((i_376_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_380_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_376_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_380_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									}
									is_347_[i_346_] = i_380_;
								} else if (i_348_ == 2) {
									final int i_381_ = aByteArray6215[i_345_];
									if (i_381_ != 0) {
										final int i_382_ = anIntArray6214[i_381_ & 0xff];
										final int i_383_ = (((i_382_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_384_ = (((i_382_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										is_347_[i_346_++] = (((i_383_ | i_384_) >>> 8) + Class332_Sub3.anInt5440);
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_349_ == 2) {
								if (i_348_ == 1) {
									final int i_385_ = aByteArray6215[i_345_];
									if (i_385_ != 0) {
										final int i_386_ = anIntArray6214[i_385_ & 0xff];
										int i_387_ = is_347_[i_346_];
										final int i_388_ = i_386_ + i_387_;
										final int i_389_ = ((i_386_ & 0xff00ff) + (i_387_ & 0xff00ff));
										i_387_ = ((i_389_ & 0x1000100) + (i_388_
												- i_389_ & 0x10000));
										is_347_[i_346_] = (i_388_ - i_387_ | i_387_
												- (i_387_ >>> 8));
									}
								} else if (i_348_ == 0) {
									final int i_390_ = aByteArray6215[i_345_];
									if (i_390_ != 0) {
										int i_391_ = anIntArray6214[i_390_ & 0xff];
										final int i_392_ = (((i_391_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_393_ = (((i_391_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_394_ = (((i_391_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_391_ = (i_392_ | i_393_ | i_394_) >>> 8;
										int i_395_ = is_347_[i_346_];
										final int i_396_ = i_391_ + i_395_;
										final int i_397_ = ((i_391_ & 0xff00ff) + (i_395_ & 0xff00ff));
										i_395_ = ((i_397_ & 0x1000100) + (i_396_
												- i_397_ & 0x10000));
										is_347_[i_346_] = (i_396_ - i_395_ | i_395_
												- (i_395_ >>> 8));
									}
								} else if (i_348_ == 3) {
									final byte i_398_ = aByteArray6215[i_345_];
									int i_399_ = (i_398_ > 0 ? anIntArray6214[i_398_]
											: 0);
									final int i_400_ = Class332_Sub3.anInt5432;
									final int i_401_ = i_399_ + i_400_;
									final int i_402_ = ((i_399_ & 0xff00ff) + (i_400_ & 0xff00ff));
									int i_403_ = ((i_402_ & 0x1000100) + (i_401_
											- i_402_ & 0x10000));
									i_403_ = i_401_ - i_403_ | i_403_
											- (i_403_ >>> 8);
									if (i_399_ == 0
											&& Class332_Sub3.anInt5449 != 255) {
										i_399_ = i_403_;
										i_403_ = is_347_[i_346_];
										i_403_ = (((((i_399_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_403_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_399_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_403_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									}
									is_347_[i_346_] = i_403_;
								} else if (i_348_ == 2) {
									final int i_404_ = aByteArray6215[i_345_];
									if (i_404_ != 0) {
										int i_405_ = anIntArray6214[i_404_ & 0xff];
										final int i_406_ = (((i_405_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_407_ = (((i_405_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										i_405_ = (((i_406_ | i_407_) >>> 8) + Class332_Sub3.anInt5440);
										int i_408_ = is_347_[i_346_];
										final int i_409_ = i_405_ + i_408_;
										final int i_410_ = ((i_405_ & 0xff00ff) + (i_408_ & 0xff00ff));
										i_408_ = ((i_410_ & 0x1000100) + (i_409_
												- i_410_ & 0x10000));
										is_347_[i_346_] = (i_409_ - i_408_ | i_408_
												- (i_408_ >>> 8));
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
						}
					}
					i_340_++;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else if (Class332_Sub3.anInt5436 < 0) {
				int i_411_ = Class332_Sub3.anInt5431;
				while (i_411_ < 0) {
					int i_412_ = Class332_Sub3.anInt5451;
					final int i_413_ = Class332_Sub3.anInt5450;
					int i_414_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_415_ = Class332_Sub3.anInt5448;
					if (i_413_ >= 0
							&& (i_413_
									- (((Class332_Sub3) this).anInt5433 << 12) < 0)) {
						int i_416_;
						if ((i_416_ = i_414_
								- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
							i_416_ = ((Class332_Sub3.anInt5436 - i_416_) / Class332_Sub3.anInt5436);
							i_415_ += i_416_;
							i_414_ += Class332_Sub3.anInt5436 * i_416_;
							i_412_ += i_416_;
						}
						if ((i_416_ = ((i_414_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_415_) {
							i_415_ = i_416_;
						}
						for (/**/; i_415_ < 0; i_415_++) {
							final int i_417_ = (((i_414_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_413_ >> 12));
							int i_418_ = i_412_++;
							final int[] is_419_ = is;
							final int i_420_ = i;
							final int i_421_ = i_339_;
							if (i_421_ == 0) {
								if (i_420_ == 1) {
									is_419_[i_418_] = (anIntArray6214[aByteArray6215[i_417_] & 0xff]);
								} else if (i_420_ == 0) {
									final int i_422_ = (anIntArray6214[aByteArray6215[i_417_] & 0xff]);
									final int i_423_ = (((i_422_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_424_ = (((i_422_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_425_ = (((i_422_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_419_[i_418_] = (i_423_ | i_424_ | i_425_) >>> 8;
								} else if (i_420_ == 3) {
									final int i_426_ = (anIntArray6214[aByteArray6215[i_417_] & 0xff]);
									final int i_427_ = Class332_Sub3.anInt5432;
									final int i_428_ = i_426_ + i_427_;
									final int i_429_ = ((i_426_ & 0xff00ff) + (i_427_ & 0xff00ff));
									final int i_430_ = ((i_429_ & 0x1000100) + (i_428_
											- i_429_ & 0x10000));
									is_419_[i_418_] = i_428_ - i_430_ | i_430_
											- (i_430_ >>> 8);
								} else if (i_420_ == 2) {
									final int i_431_ = (anIntArray6214[aByteArray6215[i_417_] & 0xff]);
									final int i_432_ = (((i_431_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_433_ = (((i_431_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_419_[i_418_] = (((i_432_ | i_433_) >>> 8) + Class332_Sub3.anInt5440);
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_421_ == 1) {
								if (i_420_ == 1) {
									final int i_434_ = aByteArray6215[i_417_];
									if (i_434_ != 0) {
										is_419_[i_418_] = anIntArray6214[i_434_ & 0xff];
									}
								} else if (i_420_ == 0) {
									final int i_435_ = aByteArray6215[i_417_];
									if (i_435_ != 0) {
										int i_436_ = anIntArray6214[i_435_ & 0xff];
										if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
											final int i_437_ = (Class332_Sub3.anInt5432 >>> 24);
											final int i_438_ = 256 - i_437_;
											final int i_439_ = is_419_[i_418_];
											is_419_[i_418_] = (((((i_436_ & 0xff00ff) * i_437_) + ((i_439_ & 0xff00ff) * i_438_)) & ~0xff00ff) + ((((i_436_ & 0xff00) * i_437_) + ((i_439_ & 0xff00) * i_438_)) & 0xff0000)) >> 8;
										} else if (Class332_Sub3.anInt5449 != 255) {
											final int i_440_ = (((i_436_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_441_ = (((i_436_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_442_ = (((i_436_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											i_436_ = (i_440_ | i_441_ | i_442_) >>> 8;
											final int i_443_ = is_419_[i_418_];
											is_419_[i_418_] = (((((i_436_ & 0xff00ff) * (Class332_Sub3.anInt5449)) + ((i_443_ & 0xff00ff) * (Class332_Sub3.anInt5442))) & ~0xff00ff) + ((((i_436_ & 0xff00) * (Class332_Sub3.anInt5449)) + ((i_443_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
										} else {
											final int i_444_ = (((i_436_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_445_ = (((i_436_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_446_ = (((i_436_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											is_419_[i_418_] = (i_444_ | i_445_ | i_446_) >>> 8;
										}
									}
								} else if (i_420_ == 3) {
									final byte i_447_ = aByteArray6215[i_417_];
									int i_448_ = (i_447_ > 0 ? anIntArray6214[i_447_]
											: 0);
									final int i_449_ = Class332_Sub3.anInt5432;
									final int i_450_ = i_448_ + i_449_;
									final int i_451_ = ((i_448_ & 0xff00ff) + (i_449_ & 0xff00ff));
									int i_452_ = ((i_451_ & 0x1000100) + (i_450_
											- i_451_ & 0x10000));
									i_452_ = i_450_ - i_452_ | i_452_
											- (i_452_ >>> 8);
									if (i_448_ == 0
											&& Class332_Sub3.anInt5449 != 255) {
										i_448_ = i_452_;
										i_452_ = is_419_[i_418_];
										i_452_ = (((((i_448_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_452_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_448_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_452_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									}
									is_419_[i_418_] = i_452_;
								} else if (i_420_ == 2) {
									final int i_453_ = aByteArray6215[i_417_];
									if (i_453_ != 0) {
										final int i_454_ = anIntArray6214[i_453_ & 0xff];
										final int i_455_ = (((i_454_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_456_ = (((i_454_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										is_419_[i_418_++] = (((i_455_ | i_456_) >>> 8) + Class332_Sub3.anInt5440);
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_421_ == 2) {
								if (i_420_ == 1) {
									final int i_457_ = aByteArray6215[i_417_];
									if (i_457_ != 0) {
										final int i_458_ = anIntArray6214[i_457_ & 0xff];
										int i_459_ = is_419_[i_418_];
										final int i_460_ = i_458_ + i_459_;
										final int i_461_ = ((i_458_ & 0xff00ff) + (i_459_ & 0xff00ff));
										i_459_ = ((i_461_ & 0x1000100) + (i_460_
												- i_461_ & 0x10000));
										is_419_[i_418_] = (i_460_ - i_459_ | i_459_
												- (i_459_ >>> 8));
									}
								} else if (i_420_ == 0) {
									final int i_462_ = aByteArray6215[i_417_];
									if (i_462_ != 0) {
										int i_463_ = anIntArray6214[i_462_ & 0xff];
										final int i_464_ = (((i_463_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_465_ = (((i_463_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_466_ = (((i_463_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_463_ = (i_464_ | i_465_ | i_466_) >>> 8;
										int i_467_ = is_419_[i_418_];
										final int i_468_ = i_463_ + i_467_;
										final int i_469_ = ((i_463_ & 0xff00ff) + (i_467_ & 0xff00ff));
										i_467_ = ((i_469_ & 0x1000100) + (i_468_
												- i_469_ & 0x10000));
										is_419_[i_418_] = (i_468_ - i_467_ | i_467_
												- (i_467_ >>> 8));
									}
								} else if (i_420_ == 3) {
									final byte i_470_ = aByteArray6215[i_417_];
									int i_471_ = (i_470_ > 0 ? anIntArray6214[i_470_]
											: 0);
									final int i_472_ = Class332_Sub3.anInt5432;
									final int i_473_ = i_471_ + i_472_;
									final int i_474_ = ((i_471_ & 0xff00ff) + (i_472_ & 0xff00ff));
									int i_475_ = ((i_474_ & 0x1000100) + (i_473_
											- i_474_ & 0x10000));
									i_475_ = i_473_ - i_475_ | i_475_
											- (i_475_ >>> 8);
									if (i_471_ == 0
											&& Class332_Sub3.anInt5449 != 255) {
										i_471_ = i_475_;
										i_475_ = is_419_[i_418_];
										i_475_ = (((((i_471_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_475_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_471_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_475_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									}
									is_419_[i_418_] = i_475_;
								} else if (i_420_ == 2) {
									final int i_476_ = aByteArray6215[i_417_];
									if (i_476_ != 0) {
										int i_477_ = anIntArray6214[i_476_ & 0xff];
										final int i_478_ = (((i_477_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_479_ = (((i_477_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										i_477_ = (((i_478_ | i_479_) >>> 8) + Class332_Sub3.anInt5440);
										int i_480_ = is_419_[i_418_];
										final int i_481_ = i_477_ + i_480_;
										final int i_482_ = ((i_477_ & 0xff00ff) + (i_480_ & 0xff00ff));
										i_480_ = ((i_482_ & 0x1000100) + (i_481_
												- i_482_ & 0x10000));
										is_419_[i_418_] = (i_481_ - i_480_ | i_480_
												- (i_480_ >>> 8));
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_414_ += Class332_Sub3.anInt5436;
						}
					}
					i_411_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else {
				int i_483_ = Class332_Sub3.anInt5431;
				while (i_483_ < 0) {
					int i_484_ = Class332_Sub3.anInt5451;
					final int i_485_ = Class332_Sub3.anInt5450;
					int i_486_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_487_ = Class332_Sub3.anInt5448;
					if (i_485_ >= 0
							&& (i_485_
									- (((Class332_Sub3) this).anInt5433 << 12) < 0)) {
						if (i_486_ < 0) {
							final int i_488_ = ((Class332_Sub3.anInt5436 - 1 - i_486_) / Class332_Sub3.anInt5436);
							i_487_ += i_488_;
							i_486_ += Class332_Sub3.anInt5436 * i_488_;
							i_484_ += i_488_;
						}
						int i_489_;
						if ((i_489_ = ((1 + i_486_
								- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_487_) {
							i_487_ = i_489_;
						}
						for (/**/; i_487_ < 0; i_487_++) {
							final int i_490_ = (((i_486_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_485_ >> 12));
							int i_491_ = i_484_++;
							final int[] is_492_ = is;
							final int i_493_ = i;
							final int i_494_ = i_339_;
							if (i_494_ == 0) {
								if (i_493_ == 1) {
									is_492_[i_491_] = (anIntArray6214[aByteArray6215[i_490_] & 0xff]);
								} else if (i_493_ == 0) {
									final int i_495_ = (anIntArray6214[aByteArray6215[i_490_] & 0xff]);
									final int i_496_ = (((i_495_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_497_ = (((i_495_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_498_ = (((i_495_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_492_[i_491_] = (i_496_ | i_497_ | i_498_) >>> 8;
								} else if (i_493_ == 3) {
									final int i_499_ = (anIntArray6214[aByteArray6215[i_490_] & 0xff]);
									final int i_500_ = Class332_Sub3.anInt5432;
									final int i_501_ = i_499_ + i_500_;
									final int i_502_ = ((i_499_ & 0xff00ff) + (i_500_ & 0xff00ff));
									final int i_503_ = ((i_502_ & 0x1000100) + (i_501_
											- i_502_ & 0x10000));
									is_492_[i_491_] = i_501_ - i_503_ | i_503_
											- (i_503_ >>> 8);
								} else if (i_493_ == 2) {
									final int i_504_ = (anIntArray6214[aByteArray6215[i_490_] & 0xff]);
									final int i_505_ = (((i_504_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_506_ = (((i_504_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_492_[i_491_] = (((i_505_ | i_506_) >>> 8) + Class332_Sub3.anInt5440);
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_494_ == 1) {
								if (i_493_ == 1) {
									final int i_507_ = aByteArray6215[i_490_];
									if (i_507_ != 0) {
										is_492_[i_491_] = anIntArray6214[i_507_ & 0xff];
									}
								} else if (i_493_ == 0) {
									final int i_508_ = aByteArray6215[i_490_];
									if (i_508_ != 0) {
										int i_509_ = anIntArray6214[i_508_ & 0xff];
										if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
											final int i_510_ = (Class332_Sub3.anInt5432 >>> 24);
											final int i_511_ = 256 - i_510_;
											final int i_512_ = is_492_[i_491_];
											is_492_[i_491_] = (((((i_509_ & 0xff00ff) * i_510_) + ((i_512_ & 0xff00ff) * i_511_)) & ~0xff00ff) + ((((i_509_ & 0xff00) * i_510_) + ((i_512_ & 0xff00) * i_511_)) & 0xff0000)) >> 8;
										} else if (Class332_Sub3.anInt5449 != 255) {
											final int i_513_ = (((i_509_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_514_ = (((i_509_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_515_ = (((i_509_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											i_509_ = (i_513_ | i_514_ | i_515_) >>> 8;
											final int i_516_ = is_492_[i_491_];
											is_492_[i_491_] = (((((i_509_ & 0xff00ff) * (Class332_Sub3.anInt5449)) + ((i_516_ & 0xff00ff) * (Class332_Sub3.anInt5442))) & ~0xff00ff) + ((((i_509_ & 0xff00) * (Class332_Sub3.anInt5449)) + ((i_516_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
										} else {
											final int i_517_ = (((i_509_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_518_ = (((i_509_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_519_ = (((i_509_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											is_492_[i_491_] = (i_517_ | i_518_ | i_519_) >>> 8;
										}
									}
								} else if (i_493_ == 3) {
									final byte i_520_ = aByteArray6215[i_490_];
									int i_521_ = (i_520_ > 0 ? anIntArray6214[i_520_]
											: 0);
									final int i_522_ = Class332_Sub3.anInt5432;
									final int i_523_ = i_521_ + i_522_;
									final int i_524_ = ((i_521_ & 0xff00ff) + (i_522_ & 0xff00ff));
									int i_525_ = ((i_524_ & 0x1000100) + (i_523_
											- i_524_ & 0x10000));
									i_525_ = i_523_ - i_525_ | i_525_
											- (i_525_ >>> 8);
									if (i_521_ == 0
											&& Class332_Sub3.anInt5449 != 255) {
										i_521_ = i_525_;
										i_525_ = is_492_[i_491_];
										i_525_ = (((((i_521_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_525_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_521_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_525_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									}
									is_492_[i_491_] = i_525_;
								} else if (i_493_ == 2) {
									final int i_526_ = aByteArray6215[i_490_];
									if (i_526_ != 0) {
										final int i_527_ = anIntArray6214[i_526_ & 0xff];
										final int i_528_ = (((i_527_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_529_ = (((i_527_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										is_492_[i_491_++] = (((i_528_ | i_529_) >>> 8) + Class332_Sub3.anInt5440);
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_494_ == 2) {
								if (i_493_ == 1) {
									final int i_530_ = aByteArray6215[i_490_];
									if (i_530_ != 0) {
										final int i_531_ = anIntArray6214[i_530_ & 0xff];
										int i_532_ = is_492_[i_491_];
										final int i_533_ = i_531_ + i_532_;
										final int i_534_ = ((i_531_ & 0xff00ff) + (i_532_ & 0xff00ff));
										i_532_ = ((i_534_ & 0x1000100) + (i_533_
												- i_534_ & 0x10000));
										is_492_[i_491_] = (i_533_ - i_532_ | i_532_
												- (i_532_ >>> 8));
									}
								} else if (i_493_ == 0) {
									final int i_535_ = aByteArray6215[i_490_];
									if (i_535_ != 0) {
										int i_536_ = anIntArray6214[i_535_ & 0xff];
										final int i_537_ = (((i_536_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_538_ = (((i_536_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_539_ = (((i_536_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_536_ = (i_537_ | i_538_ | i_539_) >>> 8;
										int i_540_ = is_492_[i_491_];
										final int i_541_ = i_536_ + i_540_;
										final int i_542_ = ((i_536_ & 0xff00ff) + (i_540_ & 0xff00ff));
										i_540_ = ((i_542_ & 0x1000100) + (i_541_
												- i_542_ & 0x10000));
										is_492_[i_491_] = (i_541_ - i_540_ | i_540_
												- (i_540_ >>> 8));
									}
								} else if (i_493_ == 3) {
									final byte i_543_ = aByteArray6215[i_490_];
									int i_544_ = (i_543_ > 0 ? anIntArray6214[i_543_]
											: 0);
									final int i_545_ = Class332_Sub3.anInt5432;
									final int i_546_ = i_544_ + i_545_;
									final int i_547_ = ((i_544_ & 0xff00ff) + (i_545_ & 0xff00ff));
									int i_548_ = ((i_547_ & 0x1000100) + (i_546_
											- i_547_ & 0x10000));
									i_548_ = i_546_ - i_548_ | i_548_
											- (i_548_ >>> 8);
									if (i_544_ == 0
											&& Class332_Sub3.anInt5449 != 255) {
										i_544_ = i_548_;
										i_548_ = is_492_[i_491_];
										i_548_ = (((((i_544_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_548_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_544_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_548_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									}
									is_492_[i_491_] = i_548_;
								} else if (i_493_ == 2) {
									final int i_549_ = aByteArray6215[i_490_];
									if (i_549_ != 0) {
										int i_550_ = anIntArray6214[i_549_ & 0xff];
										final int i_551_ = (((i_550_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_552_ = (((i_550_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										i_550_ = (((i_551_ | i_552_) >>> 8) + Class332_Sub3.anInt5440);
										int i_553_ = is_492_[i_491_];
										final int i_554_ = i_550_ + i_553_;
										final int i_555_ = ((i_550_ & 0xff00ff) + (i_553_ & 0xff00ff));
										i_553_ = ((i_555_ & 0x1000100) + (i_554_
												- i_555_ & 0x10000));
										is_492_[i_491_] = (i_554_ - i_553_ | i_553_
												- (i_553_ >>> 8));
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_486_ += Class332_Sub3.anInt5436;
						}
					}
					i_483_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			}
		} else if (Class332_Sub3.anInt5444 < 0) {
			if (Class332_Sub3.anInt5436 == 0) {
				int i_556_ = Class332_Sub3.anInt5431;
				while (i_556_ < 0) {
					int i_557_ = Class332_Sub3.anInt5451;
					int i_558_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					final int i_559_ = Class332_Sub3.anInt5443;
					int i_560_ = Class332_Sub3.anInt5448;
					if (i_559_ >= 0
							&& (i_559_
									- (((Class332_Sub3) this).anInt5454 << 12) < 0)) {
						int i_561_;
						if ((i_561_ = i_558_
								- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
							i_561_ = ((Class332_Sub3.anInt5444 - i_561_) / Class332_Sub3.anInt5444);
							i_560_ += i_561_;
							i_558_ += Class332_Sub3.anInt5444 * i_561_;
							i_557_ += i_561_;
						}
						if ((i_561_ = ((i_558_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_560_) {
							i_560_ = i_561_;
						}
						for (/**/; i_560_ < 0; i_560_++) {
							final int i_562_ = (((i_559_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_558_ >> 12));
							int i_563_ = i_557_++;
							final int[] is_564_ = is;
							final int i_565_ = i;
							final int i_566_ = i_339_;
							if (i_566_ == 0) {
								if (i_565_ == 1) {
									is_564_[i_563_] = (anIntArray6214[aByteArray6215[i_562_] & 0xff]);
								} else if (i_565_ == 0) {
									final int i_567_ = (anIntArray6214[aByteArray6215[i_562_] & 0xff]);
									final int i_568_ = (((i_567_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_569_ = (((i_567_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_570_ = (((i_567_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_564_[i_563_] = (i_568_ | i_569_ | i_570_) >>> 8;
								} else if (i_565_ == 3) {
									final int i_571_ = (anIntArray6214[aByteArray6215[i_562_] & 0xff]);
									final int i_572_ = Class332_Sub3.anInt5432;
									final int i_573_ = i_571_ + i_572_;
									final int i_574_ = ((i_571_ & 0xff00ff) + (i_572_ & 0xff00ff));
									final int i_575_ = ((i_574_ & 0x1000100) + (i_573_
											- i_574_ & 0x10000));
									is_564_[i_563_] = i_573_ - i_575_ | i_575_
											- (i_575_ >>> 8);
								} else if (i_565_ == 2) {
									final int i_576_ = (anIntArray6214[aByteArray6215[i_562_] & 0xff]);
									final int i_577_ = (((i_576_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_578_ = (((i_576_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_564_[i_563_] = (((i_577_ | i_578_) >>> 8) + Class332_Sub3.anInt5440);
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_566_ == 1) {
								if (i_565_ == 1) {
									final int i_579_ = aByteArray6215[i_562_];
									if (i_579_ != 0) {
										is_564_[i_563_] = anIntArray6214[i_579_ & 0xff];
									}
								} else if (i_565_ == 0) {
									final int i_580_ = aByteArray6215[i_562_];
									if (i_580_ != 0) {
										int i_581_ = anIntArray6214[i_580_ & 0xff];
										if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
											final int i_582_ = (Class332_Sub3.anInt5432 >>> 24);
											final int i_583_ = 256 - i_582_;
											final int i_584_ = is_564_[i_563_];
											is_564_[i_563_] = (((((i_581_ & 0xff00ff) * i_582_) + ((i_584_ & 0xff00ff) * i_583_)) & ~0xff00ff) + ((((i_581_ & 0xff00) * i_582_) + ((i_584_ & 0xff00) * i_583_)) & 0xff0000)) >> 8;
										} else if (Class332_Sub3.anInt5449 != 255) {
											final int i_585_ = (((i_581_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_586_ = (((i_581_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_587_ = (((i_581_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											i_581_ = (i_585_ | i_586_ | i_587_) >>> 8;
											final int i_588_ = is_564_[i_563_];
											is_564_[i_563_] = (((((i_581_ & 0xff00ff) * (Class332_Sub3.anInt5449)) + ((i_588_ & 0xff00ff) * (Class332_Sub3.anInt5442))) & ~0xff00ff) + ((((i_581_ & 0xff00) * (Class332_Sub3.anInt5449)) + ((i_588_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
										} else {
											final int i_589_ = (((i_581_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
											final int i_590_ = (((i_581_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
											final int i_591_ = (((i_581_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
											is_564_[i_563_] = (i_589_ | i_590_ | i_591_) >>> 8;
										}
									}
								} else if (i_565_ == 3) {
									final byte i_592_ = aByteArray6215[i_562_];
									int i_593_ = (i_592_ > 0 ? anIntArray6214[i_592_]
											: 0);
									final int i_594_ = Class332_Sub3.anInt5432;
									final int i_595_ = i_593_ + i_594_;
									final int i_596_ = ((i_593_ & 0xff00ff) + (i_594_ & 0xff00ff));
									int i_597_ = ((i_596_ & 0x1000100) + (i_595_
											- i_596_ & 0x10000));
									i_597_ = i_595_ - i_597_ | i_597_
											- (i_597_ >>> 8);
									if (i_593_ == 0
											&& Class332_Sub3.anInt5449 != 255) {
										i_593_ = i_597_;
										i_597_ = is_564_[i_563_];
										i_597_ = (((((i_593_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_597_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_593_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_597_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									}
									is_564_[i_563_] = i_597_;
								} else if (i_565_ == 2) {
									final int i_598_ = aByteArray6215[i_562_];
									if (i_598_ != 0) {
										final int i_599_ = anIntArray6214[i_598_ & 0xff];
										final int i_600_ = (((i_599_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_601_ = (((i_599_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										is_564_[i_563_++] = (((i_600_ | i_601_) >>> 8) + Class332_Sub3.anInt5440);
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_566_ == 2) {
								if (i_565_ == 1) {
									final int i_602_ = aByteArray6215[i_562_];
									if (i_602_ != 0) {
										final int i_603_ = anIntArray6214[i_602_ & 0xff];
										int i_604_ = is_564_[i_563_];
										final int i_605_ = i_603_ + i_604_;
										final int i_606_ = ((i_603_ & 0xff00ff) + (i_604_ & 0xff00ff));
										i_604_ = ((i_606_ & 0x1000100) + (i_605_
												- i_606_ & 0x10000));
										is_564_[i_563_] = (i_605_ - i_604_ | i_604_
												- (i_604_ >>> 8));
									}
								} else if (i_565_ == 0) {
									final int i_607_ = aByteArray6215[i_562_];
									if (i_607_ != 0) {
										int i_608_ = anIntArray6214[i_607_ & 0xff];
										final int i_609_ = (((i_608_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_610_ = (((i_608_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_611_ = (((i_608_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_608_ = (i_609_ | i_610_ | i_611_) >>> 8;
										int i_612_ = is_564_[i_563_];
										final int i_613_ = i_608_ + i_612_;
										final int i_614_ = ((i_608_ & 0xff00ff) + (i_612_ & 0xff00ff));
										i_612_ = ((i_614_ & 0x1000100) + (i_613_
												- i_614_ & 0x10000));
										is_564_[i_563_] = (i_613_ - i_612_ | i_612_
												- (i_612_ >>> 8));
									}
								} else if (i_565_ == 3) {
									final byte i_615_ = aByteArray6215[i_562_];
									int i_616_ = (i_615_ > 0 ? anIntArray6214[i_615_]
											: 0);
									final int i_617_ = Class332_Sub3.anInt5432;
									final int i_618_ = i_616_ + i_617_;
									final int i_619_ = ((i_616_ & 0xff00ff) + (i_617_ & 0xff00ff));
									int i_620_ = ((i_619_ & 0x1000100) + (i_618_
											- i_619_ & 0x10000));
									i_620_ = i_618_ - i_620_ | i_620_
											- (i_620_ >>> 8);
									if (i_616_ == 0
											&& Class332_Sub3.anInt5449 != 255) {
										i_616_ = i_620_;
										i_620_ = is_564_[i_563_];
										i_620_ = (((((i_616_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_620_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_616_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_620_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									}
									is_564_[i_563_] = i_620_;
								} else if (i_565_ == 2) {
									final int i_621_ = aByteArray6215[i_562_];
									if (i_621_ != 0) {
										int i_622_ = anIntArray6214[i_621_ & 0xff];
										final int i_623_ = (((i_622_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
										final int i_624_ = (((i_622_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
										i_622_ = (((i_623_ | i_624_) >>> 8) + Class332_Sub3.anInt5440);
										int i_625_ = is_564_[i_563_];
										final int i_626_ = i_622_ + i_625_;
										final int i_627_ = ((i_622_ & 0xff00ff) + (i_625_ & 0xff00ff));
										i_625_ = ((i_627_ & 0x1000100) + (i_626_
												- i_627_ & 0x10000));
										is_564_[i_563_] = (i_626_ - i_625_ | i_625_
												- (i_625_ >>> 8));
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_558_ += Class332_Sub3.anInt5444;
						}
					}
					i_556_++;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else if (Class332_Sub3.anInt5436 < 0) {
				int i_628_ = Class332_Sub3.anInt5431;
				while (i_628_ < 0) {
					int i_629_ = Class332_Sub3.anInt5451;
					int i_630_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_631_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_632_ = Class332_Sub3.anInt5448;
					int i_633_;
					if ((i_633_ = i_630_
							- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
						i_633_ = ((Class332_Sub3.anInt5444 - i_633_) / Class332_Sub3.anInt5444);
						i_632_ += i_633_;
						i_630_ += Class332_Sub3.anInt5444 * i_633_;
						i_631_ += Class332_Sub3.anInt5436 * i_633_;
						i_629_ += i_633_;
					}
					if ((i_633_ = ((i_630_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_632_) {
						i_632_ = i_633_;
					}
					if ((i_633_ = i_631_
							- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
						i_633_ = ((Class332_Sub3.anInt5436 - i_633_) / Class332_Sub3.anInt5436);
						i_632_ += i_633_;
						i_630_ += Class332_Sub3.anInt5444 * i_633_;
						i_631_ += Class332_Sub3.anInt5436 * i_633_;
						i_629_ += i_633_;
					}
					if ((i_633_ = ((i_631_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_632_) {
						i_632_ = i_633_;
					}
					for (/**/; i_632_ < 0; i_632_++) {
						final int i_634_ = (((i_631_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_630_ >> 12));
						int i_635_ = i_629_++;
						final int[] is_636_ = is;
						final int i_637_ = i;
						final int i_638_ = i_339_;
						if (i_638_ == 0) {
							if (i_637_ == 1) {
								is_636_[i_635_] = (anIntArray6214[aByteArray6215[i_634_] & 0xff]);
							} else if (i_637_ == 0) {
								final int i_639_ = (anIntArray6214[aByteArray6215[i_634_] & 0xff]);
								final int i_640_ = (((i_639_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_641_ = (((i_639_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_642_ = (((i_639_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								is_636_[i_635_] = (i_640_ | i_641_ | i_642_) >>> 8;
							} else if (i_637_ == 3) {
								final int i_643_ = (anIntArray6214[aByteArray6215[i_634_] & 0xff]);
								final int i_644_ = Class332_Sub3.anInt5432;
								final int i_645_ = i_643_ + i_644_;
								final int i_646_ = ((i_643_ & 0xff00ff) + (i_644_ & 0xff00ff));
								final int i_647_ = ((i_646_ & 0x1000100) + (i_645_
										- i_646_ & 0x10000));
								is_636_[i_635_] = i_645_ - i_647_ | i_647_
										- (i_647_ >>> 8);
							} else if (i_637_ == 2) {
								final int i_648_ = (anIntArray6214[aByteArray6215[i_634_] & 0xff]);
								final int i_649_ = (((i_648_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_650_ = (((i_648_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								is_636_[i_635_] = (((i_649_ | i_650_) >>> 8) + Class332_Sub3.anInt5440);
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_638_ == 1) {
							if (i_637_ == 1) {
								final int i_651_ = aByteArray6215[i_634_];
								if (i_651_ != 0) {
									is_636_[i_635_] = anIntArray6214[i_651_ & 0xff];
								}
							} else if (i_637_ == 0) {
								final int i_652_ = aByteArray6215[i_634_];
								if (i_652_ != 0) {
									int i_653_ = anIntArray6214[i_652_ & 0xff];
									if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
										final int i_654_ = Class332_Sub3.anInt5432 >>> 24;
										final int i_655_ = 256 - i_654_;
										final int i_656_ = is_636_[i_635_];
										is_636_[i_635_] = ((((i_653_ & 0xff00ff)
												* i_654_ + ((i_656_ & 0xff00ff) * i_655_)) & ~0xff00ff) + (((i_653_ & 0xff00)
												* i_654_ + ((i_656_ & 0xff00) * i_655_)) & 0xff0000)) >> 8;
									} else if (Class332_Sub3.anInt5449 != 255) {
										final int i_657_ = (((i_653_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_658_ = (((i_653_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_659_ = (((i_653_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_653_ = (i_657_ | i_658_ | i_659_) >>> 8;
										final int i_660_ = is_636_[i_635_];
										is_636_[i_635_] = (((((i_653_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_660_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_653_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_660_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									} else {
										final int i_661_ = (((i_653_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_662_ = (((i_653_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_663_ = (((i_653_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										is_636_[i_635_] = (i_661_ | i_662_ | i_663_) >>> 8;
									}
								}
							} else if (i_637_ == 3) {
								final byte i_664_ = aByteArray6215[i_634_];
								int i_665_ = i_664_ > 0 ? anIntArray6214[i_664_]
										: 0;
								final int i_666_ = Class332_Sub3.anInt5432;
								final int i_667_ = i_665_ + i_666_;
								final int i_668_ = ((i_665_ & 0xff00ff) + (i_666_ & 0xff00ff));
								int i_669_ = ((i_668_ & 0x1000100) + (i_667_
										- i_668_ & 0x10000));
								i_669_ = i_667_ - i_669_ | i_669_
										- (i_669_ >>> 8);
								if (i_665_ == 0
										&& Class332_Sub3.anInt5449 != 255) {
									i_665_ = i_669_;
									i_669_ = is_636_[i_635_];
									i_669_ = (((((i_665_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_669_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_665_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_669_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
								}
								is_636_[i_635_] = i_669_;
							} else if (i_637_ == 2) {
								final int i_670_ = aByteArray6215[i_634_];
								if (i_670_ != 0) {
									final int i_671_ = anIntArray6214[i_670_ & 0xff];
									final int i_672_ = (((i_671_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_673_ = (((i_671_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_636_[i_635_++] = (((i_672_ | i_673_) >>> 8) + Class332_Sub3.anInt5440);
								}
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_638_ == 2) {
							if (i_637_ == 1) {
								final int i_674_ = aByteArray6215[i_634_];
								if (i_674_ != 0) {
									final int i_675_ = anIntArray6214[i_674_ & 0xff];
									int i_676_ = is_636_[i_635_];
									final int i_677_ = i_675_ + i_676_;
									final int i_678_ = ((i_675_ & 0xff00ff) + (i_676_ & 0xff00ff));
									i_676_ = ((i_678_ & 0x1000100) + (i_677_
											- i_678_ & 0x10000));
									is_636_[i_635_] = i_677_ - i_676_ | i_676_
											- (i_676_ >>> 8);
								}
							} else if (i_637_ == 0) {
								final int i_679_ = aByteArray6215[i_634_];
								if (i_679_ != 0) {
									int i_680_ = anIntArray6214[i_679_ & 0xff];
									final int i_681_ = (((i_680_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_682_ = (((i_680_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_683_ = (((i_680_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_680_ = (i_681_ | i_682_ | i_683_) >>> 8;
									int i_684_ = is_636_[i_635_];
									final int i_685_ = i_680_ + i_684_;
									final int i_686_ = ((i_680_ & 0xff00ff) + (i_684_ & 0xff00ff));
									i_684_ = ((i_686_ & 0x1000100) + (i_685_
											- i_686_ & 0x10000));
									is_636_[i_635_] = i_685_ - i_684_ | i_684_
											- (i_684_ >>> 8);
								}
							} else if (i_637_ == 3) {
								final byte i_687_ = aByteArray6215[i_634_];
								int i_688_ = i_687_ > 0 ? anIntArray6214[i_687_]
										: 0;
								final int i_689_ = Class332_Sub3.anInt5432;
								final int i_690_ = i_688_ + i_689_;
								final int i_691_ = ((i_688_ & 0xff00ff) + (i_689_ & 0xff00ff));
								int i_692_ = ((i_691_ & 0x1000100) + (i_690_
										- i_691_ & 0x10000));
								i_692_ = i_690_ - i_692_ | i_692_
										- (i_692_ >>> 8);
								if (i_688_ == 0
										&& Class332_Sub3.anInt5449 != 255) {
									i_688_ = i_692_;
									i_692_ = is_636_[i_635_];
									i_692_ = (((((i_688_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_692_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_688_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_692_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
								}
								is_636_[i_635_] = i_692_;
							} else if (i_637_ == 2) {
								final int i_693_ = aByteArray6215[i_634_];
								if (i_693_ != 0) {
									int i_694_ = anIntArray6214[i_693_ & 0xff];
									final int i_695_ = (((i_694_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_696_ = (((i_694_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_694_ = (((i_695_ | i_696_) >>> 8) + Class332_Sub3.anInt5440);
									int i_697_ = is_636_[i_635_];
									final int i_698_ = i_694_ + i_697_;
									final int i_699_ = ((i_694_ & 0xff00ff) + (i_697_ & 0xff00ff));
									i_697_ = ((i_699_ & 0x1000100) + (i_698_
											- i_699_ & 0x10000));
									is_636_[i_635_] = i_698_ - i_697_ | i_697_
											- (i_697_ >>> 8);
								}
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_630_ += Class332_Sub3.anInt5444;
						i_631_ += Class332_Sub3.anInt5436;
					}
					i_628_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else {
				int i_700_ = Class332_Sub3.anInt5431;
				while (i_700_ < 0) {
					int i_701_ = Class332_Sub3.anInt5451;
					int i_702_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_703_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_704_ = Class332_Sub3.anInt5448;
					int i_705_;
					if ((i_705_ = i_702_
							- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
						i_705_ = ((Class332_Sub3.anInt5444 - i_705_) / Class332_Sub3.anInt5444);
						i_704_ += i_705_;
						i_702_ += Class332_Sub3.anInt5444 * i_705_;
						i_703_ += Class332_Sub3.anInt5436 * i_705_;
						i_701_ += i_705_;
					}
					if ((i_705_ = ((i_702_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_704_) {
						i_704_ = i_705_;
					}
					if (i_703_ < 0) {
						i_705_ = ((Class332_Sub3.anInt5436 - 1 - i_703_) / Class332_Sub3.anInt5436);
						i_704_ += i_705_;
						i_702_ += Class332_Sub3.anInt5444 * i_705_;
						i_703_ += Class332_Sub3.anInt5436 * i_705_;
						i_701_ += i_705_;
					}
					if ((i_705_ = ((1 + i_703_
							- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_704_) {
						i_704_ = i_705_;
					}
					for (/**/; i_704_ < 0; i_704_++) {
						final int i_706_ = (((i_703_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_702_ >> 12));
						int i_707_ = i_701_++;
						final int[] is_708_ = is;
						final int i_709_ = i;
						final int i_710_ = i_339_;
						if (i_710_ == 0) {
							if (i_709_ == 1) {
								is_708_[i_707_] = (anIntArray6214[aByteArray6215[i_706_] & 0xff]);
							} else if (i_709_ == 0) {
								final int i_711_ = (anIntArray6214[aByteArray6215[i_706_] & 0xff]);
								final int i_712_ = (((i_711_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_713_ = (((i_711_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_714_ = (((i_711_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								is_708_[i_707_] = (i_712_ | i_713_ | i_714_) >>> 8;
							} else if (i_709_ == 3) {
								final int i_715_ = (anIntArray6214[aByteArray6215[i_706_] & 0xff]);
								final int i_716_ = Class332_Sub3.anInt5432;
								final int i_717_ = i_715_ + i_716_;
								final int i_718_ = ((i_715_ & 0xff00ff) + (i_716_ & 0xff00ff));
								final int i_719_ = ((i_718_ & 0x1000100) + (i_717_
										- i_718_ & 0x10000));
								is_708_[i_707_] = i_717_ - i_719_ | i_719_
										- (i_719_ >>> 8);
							} else if (i_709_ == 2) {
								final int i_720_ = (anIntArray6214[aByteArray6215[i_706_] & 0xff]);
								final int i_721_ = (((i_720_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_722_ = (((i_720_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								is_708_[i_707_] = (((i_721_ | i_722_) >>> 8) + Class332_Sub3.anInt5440);
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_710_ == 1) {
							if (i_709_ == 1) {
								final int i_723_ = aByteArray6215[i_706_];
								if (i_723_ != 0) {
									is_708_[i_707_] = anIntArray6214[i_723_ & 0xff];
								}
							} else if (i_709_ == 0) {
								final int i_724_ = aByteArray6215[i_706_];
								if (i_724_ != 0) {
									int i_725_ = anIntArray6214[i_724_ & 0xff];
									if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
										final int i_726_ = Class332_Sub3.anInt5432 >>> 24;
										final int i_727_ = 256 - i_726_;
										final int i_728_ = is_708_[i_707_];
										is_708_[i_707_] = ((((i_725_ & 0xff00ff)
												* i_726_ + ((i_728_ & 0xff00ff) * i_727_)) & ~0xff00ff) + (((i_725_ & 0xff00)
												* i_726_ + ((i_728_ & 0xff00) * i_727_)) & 0xff0000)) >> 8;
									} else if (Class332_Sub3.anInt5449 != 255) {
										final int i_729_ = (((i_725_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_730_ = (((i_725_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_731_ = (((i_725_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_725_ = (i_729_ | i_730_ | i_731_) >>> 8;
										final int i_732_ = is_708_[i_707_];
										is_708_[i_707_] = (((((i_725_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_732_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_725_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_732_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									} else {
										final int i_733_ = (((i_725_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_734_ = (((i_725_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_735_ = (((i_725_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										is_708_[i_707_] = (i_733_ | i_734_ | i_735_) >>> 8;
									}
								}
							} else if (i_709_ == 3) {
								final byte i_736_ = aByteArray6215[i_706_];
								int i_737_ = i_736_ > 0 ? anIntArray6214[i_736_]
										: 0;
								final int i_738_ = Class332_Sub3.anInt5432;
								final int i_739_ = i_737_ + i_738_;
								final int i_740_ = ((i_737_ & 0xff00ff) + (i_738_ & 0xff00ff));
								int i_741_ = ((i_740_ & 0x1000100) + (i_739_
										- i_740_ & 0x10000));
								i_741_ = i_739_ - i_741_ | i_741_
										- (i_741_ >>> 8);
								if (i_737_ == 0
										&& Class332_Sub3.anInt5449 != 255) {
									i_737_ = i_741_;
									i_741_ = is_708_[i_707_];
									i_741_ = (((((i_737_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_741_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_737_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_741_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
								}
								is_708_[i_707_] = i_741_;
							} else if (i_709_ == 2) {
								final int i_742_ = aByteArray6215[i_706_];
								if (i_742_ != 0) {
									final int i_743_ = anIntArray6214[i_742_ & 0xff];
									final int i_744_ = (((i_743_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_745_ = (((i_743_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_708_[i_707_++] = (((i_744_ | i_745_) >>> 8) + Class332_Sub3.anInt5440);
								}
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_710_ == 2) {
							if (i_709_ == 1) {
								final int i_746_ = aByteArray6215[i_706_];
								if (i_746_ != 0) {
									final int i_747_ = anIntArray6214[i_746_ & 0xff];
									int i_748_ = is_708_[i_707_];
									final int i_749_ = i_747_ + i_748_;
									final int i_750_ = ((i_747_ & 0xff00ff) + (i_748_ & 0xff00ff));
									i_748_ = ((i_750_ & 0x1000100) + (i_749_
											- i_750_ & 0x10000));
									is_708_[i_707_] = i_749_ - i_748_ | i_748_
											- (i_748_ >>> 8);
								}
							} else if (i_709_ == 0) {
								final int i_751_ = aByteArray6215[i_706_];
								if (i_751_ != 0) {
									int i_752_ = anIntArray6214[i_751_ & 0xff];
									final int i_753_ = (((i_752_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_754_ = (((i_752_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_755_ = (((i_752_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_752_ = (i_753_ | i_754_ | i_755_) >>> 8;
									int i_756_ = is_708_[i_707_];
									final int i_757_ = i_752_ + i_756_;
									final int i_758_ = ((i_752_ & 0xff00ff) + (i_756_ & 0xff00ff));
									i_756_ = ((i_758_ & 0x1000100) + (i_757_
											- i_758_ & 0x10000));
									is_708_[i_707_] = i_757_ - i_756_ | i_756_
											- (i_756_ >>> 8);
								}
							} else if (i_709_ == 3) {
								final byte i_759_ = aByteArray6215[i_706_];
								int i_760_ = i_759_ > 0 ? anIntArray6214[i_759_]
										: 0;
								final int i_761_ = Class332_Sub3.anInt5432;
								final int i_762_ = i_760_ + i_761_;
								final int i_763_ = ((i_760_ & 0xff00ff) + (i_761_ & 0xff00ff));
								int i_764_ = ((i_763_ & 0x1000100) + (i_762_
										- i_763_ & 0x10000));
								i_764_ = i_762_ - i_764_ | i_764_
										- (i_764_ >>> 8);
								if (i_760_ == 0
										&& Class332_Sub3.anInt5449 != 255) {
									i_760_ = i_764_;
									i_764_ = is_708_[i_707_];
									i_764_ = (((((i_760_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_764_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_760_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_764_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
								}
								is_708_[i_707_] = i_764_;
							} else if (i_709_ == 2) {
								final int i_765_ = aByteArray6215[i_706_];
								if (i_765_ != 0) {
									int i_766_ = anIntArray6214[i_765_ & 0xff];
									final int i_767_ = (((i_766_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_768_ = (((i_766_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_766_ = (((i_767_ | i_768_) >>> 8) + Class332_Sub3.anInt5440);
									int i_769_ = is_708_[i_707_];
									final int i_770_ = i_766_ + i_769_;
									final int i_771_ = ((i_766_ & 0xff00ff) + (i_769_ & 0xff00ff));
									i_769_ = ((i_771_ & 0x1000100) + (i_770_
											- i_771_ & 0x10000));
									is_708_[i_707_] = i_770_ - i_769_ | i_769_
											- (i_769_ >>> 8);
								}
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_702_ += Class332_Sub3.anInt5444;
						i_703_ += Class332_Sub3.anInt5436;
					}
					i_700_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			}
		} else if (Class332_Sub3.anInt5436 == 0) {
			int i_772_ = Class332_Sub3.anInt5431;
			while (i_772_ < 0) {
				int i_773_ = Class332_Sub3.anInt5451;
				int i_774_ = Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425;
				final int i_775_ = Class332_Sub3.anInt5443;
				int i_776_ = Class332_Sub3.anInt5448;
				if (i_775_ >= 0
						&& i_775_ - (((Class332_Sub3) this).anInt5454 << 12) < 0) {
					if (i_774_ < 0) {
						final int i_777_ = ((Class332_Sub3.anInt5444 - 1 - i_774_) / Class332_Sub3.anInt5444);
						i_776_ += i_777_;
						i_774_ += Class332_Sub3.anInt5444 * i_777_;
						i_773_ += i_777_;
					}
					int i_778_;
					if ((i_778_ = ((1 + i_774_
							- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_776_) {
						i_776_ = i_778_;
					}
					for (/**/; i_776_ < 0; i_776_++) {
						final int i_779_ = (((i_775_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_774_ >> 12));
						int i_780_ = i_773_++;
						final int[] is_781_ = is;
						final int i_782_ = i;
						final int i_783_ = i_339_;
						if (i_783_ == 0) {
							if (i_782_ == 1) {
								is_781_[i_780_] = (anIntArray6214[aByteArray6215[i_779_] & 0xff]);
							} else if (i_782_ == 0) {
								final int i_784_ = (anIntArray6214[aByteArray6215[i_779_] & 0xff]);
								final int i_785_ = (((i_784_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_786_ = (((i_784_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_787_ = (((i_784_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								is_781_[i_780_] = (i_785_ | i_786_ | i_787_) >>> 8;
							} else if (i_782_ == 3) {
								final int i_788_ = (anIntArray6214[aByteArray6215[i_779_] & 0xff]);
								final int i_789_ = Class332_Sub3.anInt5432;
								final int i_790_ = i_788_ + i_789_;
								final int i_791_ = ((i_788_ & 0xff00ff) + (i_789_ & 0xff00ff));
								final int i_792_ = ((i_791_ & 0x1000100) + (i_790_
										- i_791_ & 0x10000));
								is_781_[i_780_] = i_790_ - i_792_ | i_792_
										- (i_792_ >>> 8);
							} else if (i_782_ == 2) {
								final int i_793_ = (anIntArray6214[aByteArray6215[i_779_] & 0xff]);
								final int i_794_ = (((i_793_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_795_ = (((i_793_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								is_781_[i_780_] = (((i_794_ | i_795_) >>> 8) + Class332_Sub3.anInt5440);
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_783_ == 1) {
							if (i_782_ == 1) {
								final int i_796_ = aByteArray6215[i_779_];
								if (i_796_ != 0) {
									is_781_[i_780_] = anIntArray6214[i_796_ & 0xff];
								}
							} else if (i_782_ == 0) {
								final int i_797_ = aByteArray6215[i_779_];
								if (i_797_ != 0) {
									int i_798_ = anIntArray6214[i_797_ & 0xff];
									if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
										final int i_799_ = Class332_Sub3.anInt5432 >>> 24;
										final int i_800_ = 256 - i_799_;
										final int i_801_ = is_781_[i_780_];
										is_781_[i_780_] = ((((i_798_ & 0xff00ff)
												* i_799_ + ((i_801_ & 0xff00ff) * i_800_)) & ~0xff00ff) + (((i_798_ & 0xff00)
												* i_799_ + ((i_801_ & 0xff00) * i_800_)) & 0xff0000)) >> 8;
									} else if (Class332_Sub3.anInt5449 != 255) {
										final int i_802_ = (((i_798_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_803_ = (((i_798_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_804_ = (((i_798_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										i_798_ = (i_802_ | i_803_ | i_804_) >>> 8;
										final int i_805_ = is_781_[i_780_];
										is_781_[i_780_] = (((((i_798_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_805_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_798_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_805_ & 0xff00) * (Class332_Sub3.anInt5442))) & 0xff0000)) >> 8;
									} else {
										final int i_806_ = (((i_798_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
										final int i_807_ = (((i_798_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
										final int i_808_ = (((i_798_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
										is_781_[i_780_] = (i_806_ | i_807_ | i_808_) >>> 8;
									}
								}
							} else if (i_782_ == 3) {
								final byte i_809_ = aByteArray6215[i_779_];
								int i_810_ = i_809_ > 0 ? anIntArray6214[i_809_]
										: 0;
								final int i_811_ = Class332_Sub3.anInt5432;
								final int i_812_ = i_810_ + i_811_;
								final int i_813_ = ((i_810_ & 0xff00ff) + (i_811_ & 0xff00ff));
								int i_814_ = ((i_813_ & 0x1000100) + (i_812_
										- i_813_ & 0x10000));
								i_814_ = i_812_ - i_814_ | i_814_
										- (i_814_ >>> 8);
								if (i_810_ == 0
										&& Class332_Sub3.anInt5449 != 255) {
									i_810_ = i_814_;
									i_814_ = is_781_[i_780_];
									i_814_ = (((((i_810_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_814_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_810_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_814_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
								}
								is_781_[i_780_] = i_814_;
							} else if (i_782_ == 2) {
								final int i_815_ = aByteArray6215[i_779_];
								if (i_815_ != 0) {
									final int i_816_ = anIntArray6214[i_815_ & 0xff];
									final int i_817_ = (((i_816_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_818_ = (((i_816_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									is_781_[i_780_++] = (((i_817_ | i_818_) >>> 8) + Class332_Sub3.anInt5440);
								}
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_783_ == 2) {
							if (i_782_ == 1) {
								final int i_819_ = aByteArray6215[i_779_];
								if (i_819_ != 0) {
									final int i_820_ = anIntArray6214[i_819_ & 0xff];
									int i_821_ = is_781_[i_780_];
									final int i_822_ = i_820_ + i_821_;
									final int i_823_ = ((i_820_ & 0xff00ff) + (i_821_ & 0xff00ff));
									i_821_ = ((i_823_ & 0x1000100) + (i_822_
											- i_823_ & 0x10000));
									is_781_[i_780_] = i_822_ - i_821_ | i_821_
											- (i_821_ >>> 8);
								}
							} else if (i_782_ == 0) {
								final int i_824_ = aByteArray6215[i_779_];
								if (i_824_ != 0) {
									int i_825_ = anIntArray6214[i_824_ & 0xff];
									final int i_826_ = (((i_825_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_827_ = (((i_825_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_828_ = (((i_825_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_825_ = (i_826_ | i_827_ | i_828_) >>> 8;
									int i_829_ = is_781_[i_780_];
									final int i_830_ = i_825_ + i_829_;
									final int i_831_ = ((i_825_ & 0xff00ff) + (i_829_ & 0xff00ff));
									i_829_ = ((i_831_ & 0x1000100) + (i_830_
											- i_831_ & 0x10000));
									is_781_[i_780_] = i_830_ - i_829_ | i_829_
											- (i_829_ >>> 8);
								}
							} else if (i_782_ == 3) {
								final byte i_832_ = aByteArray6215[i_779_];
								int i_833_ = i_832_ > 0 ? anIntArray6214[i_832_]
										: 0;
								final int i_834_ = Class332_Sub3.anInt5432;
								final int i_835_ = i_833_ + i_834_;
								final int i_836_ = ((i_833_ & 0xff00ff) + (i_834_ & 0xff00ff));
								int i_837_ = ((i_836_ & 0x1000100) + (i_835_
										- i_836_ & 0x10000));
								i_837_ = i_835_ - i_837_ | i_837_
										- (i_837_ >>> 8);
								if (i_833_ == 0
										&& Class332_Sub3.anInt5449 != 255) {
									i_833_ = i_837_;
									i_837_ = is_781_[i_780_];
									i_837_ = (((((i_833_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_837_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_833_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_837_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
								}
								is_781_[i_780_] = i_837_;
							} else if (i_782_ == 2) {
								final int i_838_ = aByteArray6215[i_779_];
								if (i_838_ != 0) {
									int i_839_ = anIntArray6214[i_838_ & 0xff];
									final int i_840_ = (((i_839_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
									final int i_841_ = (((i_839_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
									i_839_ = (((i_840_ | i_841_) >>> 8) + Class332_Sub3.anInt5440);
									int i_842_ = is_781_[i_780_];
									final int i_843_ = i_839_ + i_842_;
									final int i_844_ = ((i_839_ & 0xff00ff) + (i_842_ & 0xff00ff));
									i_842_ = ((i_844_ & 0x1000100) + (i_843_
											- i_844_ & 0x10000));
									is_781_[i_780_] = i_843_ - i_842_ | i_842_
											- (i_842_ >>> 8);
								}
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_774_ += Class332_Sub3.anInt5444;
					}
				}
				i_772_++;
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		} else if (Class332_Sub3.anInt5436 < 0) {
			for (int i_845_ = Class332_Sub3.anInt5431; i_845_ < 0; i_845_++) {
				int i_846_ = Class332_Sub3.anInt5451;
				int i_847_ = Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425;
				int i_848_ = Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456;
				int i_849_ = Class332_Sub3.anInt5448;
				if (i_847_ < 0) {
					final int i_850_ = ((Class332_Sub3.anInt5444 - 1 - i_847_) / Class332_Sub3.anInt5444);
					i_849_ += i_850_;
					i_847_ += Class332_Sub3.anInt5444 * i_850_;
					i_848_ += Class332_Sub3.anInt5436 * i_850_;
					i_846_ += i_850_;
				}
				int i_851_;
				if ((i_851_ = (1 + i_847_
						- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444)
						/ Class332_Sub3.anInt5444) > i_849_) {
					i_849_ = i_851_;
				}
				if ((i_851_ = i_848_ - (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
					i_851_ = ((Class332_Sub3.anInt5436 - i_851_) / Class332_Sub3.anInt5436);
					i_849_ += i_851_;
					i_847_ += Class332_Sub3.anInt5444 * i_851_;
					i_848_ += Class332_Sub3.anInt5436 * i_851_;
					i_846_ += i_851_;
				}
				if ((i_851_ = ((i_848_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_849_) {
					i_849_ = i_851_;
				}
				for (/**/; i_849_ < 0; i_849_++) {
					final int i_852_ = ((i_848_ >> 12)
							* ((Class332_Sub3) this).anInt5433 + (i_847_ >> 12));
					int i_853_ = i_846_++;
					final int[] is_854_ = is;
					final int i_855_ = i;
					final int i_856_ = i_339_;
					if (i_856_ == 0) {
						if (i_855_ == 1) {
							is_854_[i_853_] = (anIntArray6214[aByteArray6215[i_852_] & 0xff]);
						} else if (i_855_ == 0) {
							final int i_857_ = (anIntArray6214[aByteArray6215[i_852_] & 0xff]);
							final int i_858_ = (((i_857_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
							final int i_859_ = ((i_857_ & 0xff00)
									* Class332_Sub3.anInt5457 & 0xff0000);
							final int i_860_ = ((i_857_ & 0xff)
									* Class332_Sub3.anInt5427 & 0xff00);
							is_854_[i_853_] = (i_858_ | i_859_ | i_860_) >>> 8;
						} else if (i_855_ == 3) {
							final int i_861_ = (anIntArray6214[aByteArray6215[i_852_] & 0xff]);
							final int i_862_ = Class332_Sub3.anInt5432;
							final int i_863_ = i_861_ + i_862_;
							final int i_864_ = (i_861_ & 0xff00ff)
									+ (i_862_ & 0xff00ff);
							final int i_865_ = ((i_864_ & 0x1000100) + (i_863_
									- i_864_ & 0x10000));
							is_854_[i_853_] = i_863_ - i_865_ | i_865_
									- (i_865_ >>> 8);
						} else if (i_855_ == 2) {
							final int i_866_ = (anIntArray6214[aByteArray6215[i_852_] & 0xff]);
							final int i_867_ = (((i_866_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
							final int i_868_ = ((i_866_ & 0xff00)
									* Class332_Sub3.anInt5449 & 0xff0000);
							is_854_[i_853_] = (((i_867_ | i_868_) >>> 8) + Class332_Sub3.anInt5440);
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_856_ == 1) {
						if (i_855_ == 1) {
							final int i_869_ = aByteArray6215[i_852_];
							if (i_869_ != 0) {
								is_854_[i_853_] = anIntArray6214[i_869_ & 0xff];
							}
						} else if (i_855_ == 0) {
							final int i_870_ = aByteArray6215[i_852_];
							if (i_870_ != 0) {
								int i_871_ = anIntArray6214[i_870_ & 0xff];
								if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
									final int i_872_ = Class332_Sub3.anInt5432 >>> 24;
									final int i_873_ = 256 - i_872_;
									final int i_874_ = is_854_[i_853_];
									is_854_[i_853_] = ((((i_871_ & 0xff00ff)
											* i_872_ + (i_874_ & 0xff00ff)
											* i_873_) & ~0xff00ff) + (((i_871_ & 0xff00)
											* i_872_ + (i_874_ & 0xff00)
											* i_873_) & 0xff0000)) >> 8;
								} else if (Class332_Sub3.anInt5449 != 255) {
									final int i_875_ = (((i_871_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_876_ = (((i_871_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_877_ = (((i_871_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_871_ = (i_875_ | i_876_ | i_877_) >>> 8;
									final int i_878_ = is_854_[i_853_];
									is_854_[i_853_] = (((((i_871_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_878_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_871_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_878_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
								} else {
									final int i_879_ = (((i_871_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_880_ = (((i_871_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_881_ = (((i_871_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_854_[i_853_] = (i_879_ | i_880_ | i_881_) >>> 8;
								}
							}
						} else if (i_855_ == 3) {
							final byte i_882_ = aByteArray6215[i_852_];
							int i_883_ = i_882_ > 0 ? anIntArray6214[i_882_]
									: 0;
							final int i_884_ = Class332_Sub3.anInt5432;
							final int i_885_ = i_883_ + i_884_;
							final int i_886_ = (i_883_ & 0xff00ff)
									+ (i_884_ & 0xff00ff);
							int i_887_ = ((i_886_ & 0x1000100) + (i_885_
									- i_886_ & 0x10000));
							i_887_ = i_885_ - i_887_ | i_887_ - (i_887_ >>> 8);
							if (i_883_ == 0 && Class332_Sub3.anInt5449 != 255) {
								i_883_ = i_887_;
								i_887_ = is_854_[i_853_];
								i_887_ = (((((i_883_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_887_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_883_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_887_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
							}
							is_854_[i_853_] = i_887_;
						} else if (i_855_ == 2) {
							final int i_888_ = aByteArray6215[i_852_];
							if (i_888_ != 0) {
								final int i_889_ = anIntArray6214[i_888_ & 0xff];
								final int i_890_ = (((i_889_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_891_ = (((i_889_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								is_854_[i_853_++] = (((i_890_ | i_891_) >>> 8) + Class332_Sub3.anInt5440);
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_856_ == 2) {
						if (i_855_ == 1) {
							final int i_892_ = aByteArray6215[i_852_];
							if (i_892_ != 0) {
								final int i_893_ = anIntArray6214[i_892_ & 0xff];
								int i_894_ = is_854_[i_853_];
								final int i_895_ = i_893_ + i_894_;
								final int i_896_ = ((i_893_ & 0xff00ff) + (i_894_ & 0xff00ff));
								i_894_ = (i_896_ & 0x1000100)
										+ (i_895_ - i_896_ & 0x10000);
								is_854_[i_853_] = i_895_ - i_894_ | i_894_
										- (i_894_ >>> 8);
							}
						} else if (i_855_ == 0) {
							final int i_897_ = aByteArray6215[i_852_];
							if (i_897_ != 0) {
								int i_898_ = anIntArray6214[i_897_ & 0xff];
								final int i_899_ = (((i_898_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_900_ = (((i_898_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_901_ = (((i_898_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								i_898_ = (i_899_ | i_900_ | i_901_) >>> 8;
								int i_902_ = is_854_[i_853_];
								final int i_903_ = i_898_ + i_902_;
								final int i_904_ = ((i_898_ & 0xff00ff) + (i_902_ & 0xff00ff));
								i_902_ = (i_904_ & 0x1000100)
										+ (i_903_ - i_904_ & 0x10000);
								is_854_[i_853_] = i_903_ - i_902_ | i_902_
										- (i_902_ >>> 8);
							}
						} else if (i_855_ == 3) {
							final byte i_905_ = aByteArray6215[i_852_];
							int i_906_ = i_905_ > 0 ? anIntArray6214[i_905_]
									: 0;
							final int i_907_ = Class332_Sub3.anInt5432;
							final int i_908_ = i_906_ + i_907_;
							final int i_909_ = (i_906_ & 0xff00ff)
									+ (i_907_ & 0xff00ff);
							int i_910_ = ((i_909_ & 0x1000100) + (i_908_
									- i_909_ & 0x10000));
							i_910_ = i_908_ - i_910_ | i_910_ - (i_910_ >>> 8);
							if (i_906_ == 0 && Class332_Sub3.anInt5449 != 255) {
								i_906_ = i_910_;
								i_910_ = is_854_[i_853_];
								i_910_ = (((((i_906_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_910_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_906_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_910_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
							}
							is_854_[i_853_] = i_910_;
						} else if (i_855_ == 2) {
							final int i_911_ = aByteArray6215[i_852_];
							if (i_911_ != 0) {
								int i_912_ = anIntArray6214[i_911_ & 0xff];
								final int i_913_ = (((i_912_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_914_ = (((i_912_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								i_912_ = (((i_913_ | i_914_) >>> 8) + Class332_Sub3.anInt5440);
								int i_915_ = is_854_[i_853_];
								final int i_916_ = i_912_ + i_915_;
								final int i_917_ = ((i_912_ & 0xff00ff) + (i_915_ & 0xff00ff));
								i_915_ = (i_917_ & 0x1000100)
										+ (i_916_ - i_917_ & 0x10000);
								is_854_[i_853_] = i_916_ - i_915_ | i_915_
										- (i_915_ >>> 8);
							}
						}
					} else {
						throw new IllegalArgumentException();
					}
					i_847_ += Class332_Sub3.anInt5444;
					i_848_ += Class332_Sub3.anInt5436;
				}
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		} else {
			for (int i_918_ = Class332_Sub3.anInt5431; i_918_ < 0; i_918_++) {
				int i_919_ = Class332_Sub3.anInt5451;
				int i_920_ = Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425;
				int i_921_ = Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456;
				int i_922_ = Class332_Sub3.anInt5448;
				if (i_920_ < 0) {
					final int i_923_ = ((Class332_Sub3.anInt5444 - 1 - i_920_) / Class332_Sub3.anInt5444);
					i_922_ += i_923_;
					i_920_ += Class332_Sub3.anInt5444 * i_923_;
					i_921_ += Class332_Sub3.anInt5436 * i_923_;
					i_919_ += i_923_;
				}
				int i_924_;
				if ((i_924_ = (1 + i_920_
						- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444)
						/ Class332_Sub3.anInt5444) > i_922_) {
					i_922_ = i_924_;
				}
				if (i_921_ < 0) {
					i_924_ = ((Class332_Sub3.anInt5436 - 1 - i_921_) / Class332_Sub3.anInt5436);
					i_922_ += i_924_;
					i_920_ += Class332_Sub3.anInt5444 * i_924_;
					i_921_ += Class332_Sub3.anInt5436 * i_924_;
					i_919_ += i_924_;
				}
				if ((i_924_ = (1 + i_921_
						- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436)
						/ Class332_Sub3.anInt5436) > i_922_) {
					i_922_ = i_924_;
				}
				for (/**/; i_922_ < 0; i_922_++) {
					final int i_925_ = ((i_921_ >> 12)
							* ((Class332_Sub3) this).anInt5433 + (i_920_ >> 12));
					int i_926_ = i_919_++;
					final int[] is_927_ = is;
					final int i_928_ = i;
					final int i_929_ = i_339_;
					if (i_929_ == 0) {
						if (i_928_ == 1) {
							is_927_[i_926_] = (anIntArray6214[aByteArray6215[i_925_] & 0xff]);
						} else if (i_928_ == 0) {
							final int i_930_ = (anIntArray6214[aByteArray6215[i_925_] & 0xff]);
							final int i_931_ = (((i_930_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
							final int i_932_ = ((i_930_ & 0xff00)
									* Class332_Sub3.anInt5457 & 0xff0000);
							final int i_933_ = ((i_930_ & 0xff)
									* Class332_Sub3.anInt5427 & 0xff00);
							is_927_[i_926_] = (i_931_ | i_932_ | i_933_) >>> 8;
						} else if (i_928_ == 3) {
							final int i_934_ = (anIntArray6214[aByteArray6215[i_925_] & 0xff]);
							final int i_935_ = Class332_Sub3.anInt5432;
							final int i_936_ = i_934_ + i_935_;
							final int i_937_ = (i_934_ & 0xff00ff)
									+ (i_935_ & 0xff00ff);
							final int i_938_ = ((i_937_ & 0x1000100) + (i_936_
									- i_937_ & 0x10000));
							is_927_[i_926_] = i_936_ - i_938_ | i_938_
									- (i_938_ >>> 8);
						} else if (i_928_ == 2) {
							final int i_939_ = (anIntArray6214[aByteArray6215[i_925_] & 0xff]);
							final int i_940_ = (((i_939_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
							final int i_941_ = ((i_939_ & 0xff00)
									* Class332_Sub3.anInt5449 & 0xff0000);
							is_927_[i_926_] = (((i_940_ | i_941_) >>> 8) + Class332_Sub3.anInt5440);
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_929_ == 1) {
						if (i_928_ == 1) {
							final int i_942_ = aByteArray6215[i_925_];
							if (i_942_ != 0) {
								is_927_[i_926_] = anIntArray6214[i_942_ & 0xff];
							}
						} else if (i_928_ == 0) {
							final int i_943_ = aByteArray6215[i_925_];
							if (i_943_ != 0) {
								int i_944_ = anIntArray6214[i_943_ & 0xff];
								if ((Class332_Sub3.anInt5432 & 0xffffff) == 16777215) {
									final int i_945_ = Class332_Sub3.anInt5432 >>> 24;
									final int i_946_ = 256 - i_945_;
									final int i_947_ = is_927_[i_926_];
									is_927_[i_926_] = ((((i_944_ & 0xff00ff)
											* i_945_ + (i_947_ & 0xff00ff)
											* i_946_) & ~0xff00ff) + (((i_944_ & 0xff00)
											* i_945_ + (i_947_ & 0xff00)
											* i_946_) & 0xff0000)) >> 8;
								} else if (Class332_Sub3.anInt5449 != 255) {
									final int i_948_ = (((i_944_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_949_ = (((i_944_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_950_ = (((i_944_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									i_944_ = (i_948_ | i_949_ | i_950_) >>> 8;
									final int i_951_ = is_927_[i_926_];
									is_927_[i_926_] = (((((i_944_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_951_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_944_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_951_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
								} else {
									final int i_952_ = (((i_944_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
									final int i_953_ = (((i_944_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
									final int i_954_ = (((i_944_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
									is_927_[i_926_] = (i_952_ | i_953_ | i_954_) >>> 8;
								}
							}
						} else if (i_928_ == 3) {
							final byte i_955_ = aByteArray6215[i_925_];
							int i_956_ = i_955_ > 0 ? anIntArray6214[i_955_]
									: 0;
							final int i_957_ = Class332_Sub3.anInt5432;
							final int i_958_ = i_956_ + i_957_;
							final int i_959_ = (i_956_ & 0xff00ff)
									+ (i_957_ & 0xff00ff);
							int i_960_ = ((i_959_ & 0x1000100) + (i_958_
									- i_959_ & 0x10000));
							i_960_ = i_958_ - i_960_ | i_960_ - (i_960_ >>> 8);
							if (i_956_ == 0 && Class332_Sub3.anInt5449 != 255) {
								i_956_ = i_960_;
								i_960_ = is_927_[i_926_];
								i_960_ = (((((i_956_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_960_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_956_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_960_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
							}
							is_927_[i_926_] = i_960_;
						} else if (i_928_ == 2) {
							final int i_961_ = aByteArray6215[i_925_];
							if (i_961_ != 0) {
								final int i_962_ = anIntArray6214[i_961_ & 0xff];
								final int i_963_ = (((i_962_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_964_ = (((i_962_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								is_927_[i_926_++] = (((i_963_ | i_964_) >>> 8) + Class332_Sub3.anInt5440);
							}
						} else {
							throw new IllegalArgumentException();
						}
					} else if (i_929_ == 2) {
						if (i_928_ == 1) {
							final int i_965_ = aByteArray6215[i_925_];
							if (i_965_ != 0) {
								final int i_966_ = anIntArray6214[i_965_ & 0xff];
								int i_967_ = is_927_[i_926_];
								final int i_968_ = i_966_ + i_967_;
								final int i_969_ = ((i_966_ & 0xff00ff) + (i_967_ & 0xff00ff));
								i_967_ = (i_969_ & 0x1000100)
										+ (i_968_ - i_969_ & 0x10000);
								is_927_[i_926_] = i_968_ - i_967_ | i_967_
										- (i_967_ >>> 8);
							}
						} else if (i_928_ == 0) {
							final int i_970_ = aByteArray6215[i_925_];
							if (i_970_ != 0) {
								int i_971_ = anIntArray6214[i_970_ & 0xff];
								final int i_972_ = (((i_971_ & 0xff0000) * Class332_Sub3.anInt5435) & ~0xffffff);
								final int i_973_ = (((i_971_ & 0xff00) * Class332_Sub3.anInt5457) & 0xff0000);
								final int i_974_ = (((i_971_ & 0xff) * Class332_Sub3.anInt5427) & 0xff00);
								i_971_ = (i_972_ | i_973_ | i_974_) >>> 8;
								int i_975_ = is_927_[i_926_];
								final int i_976_ = i_971_ + i_975_;
								final int i_977_ = ((i_971_ & 0xff00ff) + (i_975_ & 0xff00ff));
								i_975_ = (i_977_ & 0x1000100)
										+ (i_976_ - i_977_ & 0x10000);
								is_927_[i_926_] = i_976_ - i_975_ | i_975_
										- (i_975_ >>> 8);
							}
						} else if (i_928_ == 3) {
							final byte i_978_ = aByteArray6215[i_925_];
							int i_979_ = i_978_ > 0 ? anIntArray6214[i_978_]
									: 0;
							final int i_980_ = Class332_Sub3.anInt5432;
							final int i_981_ = i_979_ + i_980_;
							final int i_982_ = (i_979_ & 0xff00ff)
									+ (i_980_ & 0xff00ff);
							int i_983_ = ((i_982_ & 0x1000100) + (i_981_
									- i_982_ & 0x10000));
							i_983_ = i_981_ - i_983_ | i_983_ - (i_983_ >>> 8);
							if (i_979_ == 0 && Class332_Sub3.anInt5449 != 255) {
								i_979_ = i_983_;
								i_983_ = is_927_[i_926_];
								i_983_ = (((((i_979_ & 0xff00ff) * Class332_Sub3.anInt5449) + ((i_983_ & 0xff00ff) * Class332_Sub3.anInt5442)) & ~0xff00ff) + ((((i_979_ & 0xff00) * Class332_Sub3.anInt5449) + ((i_983_ & 0xff00) * Class332_Sub3.anInt5442)) & 0xff0000)) >> 8;
							}
							is_927_[i_926_] = i_983_;
						} else if (i_928_ == 2) {
							final int i_984_ = aByteArray6215[i_925_];
							if (i_984_ != 0) {
								int i_985_ = anIntArray6214[i_984_ & 0xff];
								final int i_986_ = (((i_985_ & 0xff00ff) * Class332_Sub3.anInt5449) & ~0xff00ff);
								final int i_987_ = (((i_985_ & 0xff00) * Class332_Sub3.anInt5449) & 0xff0000);
								i_985_ = (((i_986_ | i_987_) >>> 8) + Class332_Sub3.anInt5440);
								int i_988_ = is_927_[i_926_];
								final int i_989_ = i_985_ + i_988_;
								final int i_990_ = ((i_985_ & 0xff00ff) + (i_988_ & 0xff00ff));
								i_988_ = (i_990_ & 0x1000100)
										+ (i_989_ - i_990_ & 0x10000);
								is_927_[i_926_] = i_989_ - i_988_ | i_988_
										- (i_988_ >>> 8);
							}
						}
					} else {
						throw new IllegalArgumentException();
					}
					i_920_ += Class332_Sub3.anInt5444;
					i_921_ += Class332_Sub3.anInt5436;
				}
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		}
	}

	@Override
	final void method3748(int i, int i_991_, final int i_992_, int i_993_,
			final int i_994_) {
		if (((Class332_Sub3) this).aHa_Sub2_5434.method1920()) {
			throw new IllegalStateException();
		}
		final int i_995_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4505;
		i += ((Class332_Sub3) this).anInt5446;
		i_991_ += ((Class332_Sub3) this).anInt5439;
		int i_996_ = i_991_ * i_995_ + i;
		int i_997_ = 0;
		int i_998_ = ((Class332_Sub3) this).anInt5454;
		int i_999_ = ((Class332_Sub3) this).anInt5433;
		int i_1000_ = i_995_ - i_999_;
		int i_1001_ = 0;
		if (i_991_ < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495) {
			final int i_1002_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4495 - i_991_);
			i_998_ -= i_1002_;
			i_991_ = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4495;
			i_997_ += i_1002_ * i_999_;
			i_996_ += i_1002_ * i_995_;
		}
		if (i_991_ + i_998_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4492) {
			i_998_ -= i_991_ + i_998_
					- (((Class332_Sub3) this).aHa_Sub2_5434).anInt4492;
		}
		if (i < ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509) {
			final int i_1003_ = (((Class332_Sub3) this).aHa_Sub2_5434.anInt4509 - i);
			i_999_ -= i_1003_;
			i = ((Class332_Sub3) this).aHa_Sub2_5434.anInt4509;
			i_997_ += i_1003_;
			i_996_ += i_1003_;
			i_1001_ += i_1003_;
			i_1000_ += i_1003_;
		}
		if (i + i_999_ > ((Class332_Sub3) this).aHa_Sub2_5434.anInt4507) {
			final int i_1004_ = (i + i_999_ - (((Class332_Sub3) this).aHa_Sub2_5434.anInt4507));
			i_999_ -= i_1004_;
			i_1001_ += i_1004_;
			i_1000_ += i_1004_;
		}
		if (i_999_ > 0 && i_998_ > 0) {
			final int[] is = (((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504);
			if (i_994_ == 0) {
				if (i_992_ == 1) {
					for (int i_1005_ = -i_998_; i_1005_ < 0; i_1005_++) {
						int i_1006_ = i_996_ + i_999_ - 3;
						while (i_996_ < i_1006_) {
							is[i_996_++] = (anIntArray6214[aByteArray6215[i_997_++] & 0xff]);
							is[i_996_++] = (anIntArray6214[aByteArray6215[i_997_++] & 0xff]);
							is[i_996_++] = (anIntArray6214[aByteArray6215[i_997_++] & 0xff]);
							is[i_996_++] = (anIntArray6214[aByteArray6215[i_997_++] & 0xff]);
						}
						i_1006_ += 3;
						while (i_996_ < i_1006_) {
							is[i_996_++] = (anIntArray6214[aByteArray6215[i_997_++] & 0xff]);
						}
						i_996_ += i_1000_;
						i_997_ += i_1001_;
					}
					return;
				}
				if (i_992_ == 0) {
					final int i_1007_ = (i_993_ & 0xff0000) >> 16;
					final int i_1008_ = (i_993_ & 0xff00) >> 8;
					final int i_1009_ = i_993_ & 0xff;
					for (int i_1010_ = -i_998_; i_1010_ < 0; i_1010_++) {
						for (int i_1011_ = -i_999_; i_1011_ < 0; i_1011_++) {
							final int i_1012_ = (anIntArray6214[aByteArray6215[i_997_++] & 0xff]);
							final int i_1013_ = (i_1012_ & 0xff0000) * i_1007_
									& ~0xffffff;
							final int i_1014_ = (i_1012_ & 0xff00) * i_1008_
									& 0xff0000;
							final int i_1015_ = (i_1012_ & 0xff) * i_1009_
									& 0xff00;
							is[i_996_++] = (i_1013_ | i_1014_ | i_1015_) >>> 8;
						}
						i_996_ += i_1000_;
						i_997_ += i_1001_;
					}
					return;
				}
				if (i_992_ == 3) {
					for (int i_1016_ = -i_998_; i_1016_ < 0; i_1016_++) {
						for (int i_1017_ = -i_999_; i_1017_ < 0; i_1017_++) {
							final int i_1018_ = (anIntArray6214[aByteArray6215[i_997_++] & 0xff]);
							final int i_1019_ = i_1018_ + i_993_;
							final int i_1020_ = (i_1018_ & 0xff00ff)
									+ (i_993_ & 0xff00ff);
							final int i_1021_ = ((i_1020_ & 0x1000100) + (i_1019_
									- i_1020_ & 0x10000));
							is[i_996_++] = i_1019_ - i_1021_ | i_1021_
									- (i_1021_ >>> 8);
						}
						i_996_ += i_1000_;
						i_997_ += i_1001_;
					}
					return;
				}
				if (i_992_ == 2) {
					final int i_1022_ = i_993_ >>> 24;
					final int i_1023_ = 256 - i_1022_;
					int i_1024_ = (i_993_ & 0xff00ff) * i_1023_ & ~0xff00ff;
					int i_1025_ = (i_993_ & 0xff00) * i_1023_ & 0xff0000;
					i_993_ = (i_1024_ | i_1025_) >>> 8;
					for (int i_1026_ = -i_998_; i_1026_ < 0; i_1026_++) {
						for (int i_1027_ = -i_999_; i_1027_ < 0; i_1027_++) {
							final int i_1028_ = (anIntArray6214[aByteArray6215[i_997_++] & 0xff]);
							i_1024_ = (i_1028_ & 0xff00ff) * i_1022_
									& ~0xff00ff;
							i_1025_ = (i_1028_ & 0xff00) * i_1022_ & 0xff0000;
							is[i_996_++] = ((i_1024_ | i_1025_) >>> 8) + i_993_;
						}
						i_996_ += i_1000_;
						i_997_ += i_1001_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_994_ == 1) {
				if (i_992_ == 1) {
					for (int i_1029_ = -i_998_; i_1029_ < 0; i_1029_++) {
						for (int i_1030_ = -i_999_; i_1030_ < 0; i_1030_++) {
							final int i_1031_ = aByteArray6215[i_997_++];
							if (i_1031_ != 0) {
								final int i_1032_ = (anIntArray6214[i_1031_ & 0xff] | ~0xffffff);
								final int i_1033_ = 255;
								final int i_1034_ = 0;
								final int i_1035_ = is[i_996_];
								is[i_996_++] = (((((i_1032_ & 0xff00ff)
										* i_1033_ + (i_1035_ & 0xff00ff)
										* i_1034_) & ~0xff00ff) >> 8) + (((((i_1032_ & ~0xff00ff) >>> 8) * i_1033_) + (((i_1035_ & ~0xff00ff) >>> 8) * i_1034_)) & ~0xff00ff));
							} else {
								i_996_++;
							}
						}
						i_996_ += i_1000_;
						i_997_ += i_1001_;
					}
					return;
				}
				if (i_992_ == 0) {
					if ((i_993_ & 0xffffff) == 16777215) {
						final int i_1036_ = i_993_ >>> 24;
						final int i_1037_ = 256 - i_1036_;
						for (int i_1038_ = -i_998_; i_1038_ < 0; i_1038_++) {
							for (int i_1039_ = -i_999_; i_1039_ < 0; i_1039_++) {
								final int i_1040_ = aByteArray6215[i_997_++];
								if (i_1040_ != 0) {
									final int i_1041_ = anIntArray6214[i_1040_ & 0xff];
									final int i_1042_ = is[i_996_];
									is[i_996_++] = ((((i_1041_ & 0xff00ff)
											* i_1036_ + (i_1042_ & 0xff00ff)
											* i_1037_) & ~0xff00ff) + (((i_1041_ & 0xff00)
											* i_1036_ + (i_1042_ & 0xff00)
											* i_1037_) & 0xff0000)) >> 8;
								} else {
									i_996_++;
								}
							}
							i_996_ += i_1000_;
							i_997_ += i_1001_;
						}
					} else {
						final int i_1043_ = (i_993_ & 0xff0000) >> 16;
						final int i_1044_ = (i_993_ & 0xff00) >> 8;
						final int i_1045_ = i_993_ & 0xff;
						final int i_1046_ = i_993_ >>> 24;
						final int i_1047_ = 256 - i_1046_;
						for (int i_1048_ = -i_998_; i_1048_ < 0; i_1048_++) {
							for (int i_1049_ = -i_999_; i_1049_ < 0; i_1049_++) {
								final int i_1050_ = aByteArray6215[i_997_++];
								if (i_1050_ != 0) {
									int i_1051_ = anIntArray6214[i_1050_ & 0xff];
									if (i_1046_ != 255) {
										final int i_1052_ = ((i_1051_ & 0xff0000)
												* i_1043_ & ~0xffffff);
										final int i_1053_ = ((i_1051_ & 0xff00)
												* i_1044_ & 0xff0000);
										final int i_1054_ = ((i_1051_ & 0xff)
												* i_1045_ & 0xff00);
										i_1051_ = (i_1052_ | i_1053_ | i_1054_) >>> 8;
										final int i_1055_ = is[i_996_];
										is[i_996_++] = ((((i_1051_ & 0xff00ff)
												* i_1046_ + ((i_1055_ & 0xff00ff) * i_1047_)) & ~0xff00ff) + (((i_1051_ & 0xff00)
												* i_1046_ + ((i_1055_ & 0xff00) * i_1047_)) & 0xff0000)) >> 8;
									} else {
										final int i_1056_ = ((i_1051_ & 0xff0000)
												* i_1043_ & ~0xffffff);
										final int i_1057_ = ((i_1051_ & 0xff00)
												* i_1044_ & 0xff0000);
										final int i_1058_ = ((i_1051_ & 0xff)
												* i_1045_ & 0xff00);
										is[i_996_++] = (i_1056_ | i_1057_ | i_1058_) >>> 8;
									}
								} else {
									i_996_++;
								}
							}
							i_996_ += i_1000_;
							i_997_ += i_1001_;
						}
						return;
					}
					return;
				}
				if (i_992_ == 3) {
					final int i_1059_ = i_993_ >>> 24;
					final int i_1060_ = 256 - i_1059_;
					for (int i_1061_ = -i_998_; i_1061_ < 0; i_1061_++) {
						for (int i_1062_ = -i_999_; i_1062_ < 0; i_1062_++) {
							final byte i_1063_ = aByteArray6215[i_997_++];
							int i_1064_ = i_1063_ > 0 ? anIntArray6214[i_1063_]
									: 0;
							final int i_1065_ = i_1064_ + i_993_;
							final int i_1066_ = (i_1064_ & 0xff00ff)
									+ (i_993_ & 0xff00ff);
							int i_1067_ = ((i_1066_ & 0x1000100) + (i_1065_
									- i_1066_ & 0x10000));
							i_1067_ = i_1065_ - i_1067_ | i_1067_
									- (i_1067_ >>> 8);
							if (i_1064_ == 0 && i_1059_ != 255) {
								i_1064_ = i_1067_;
								i_1067_ = is[i_996_];
								i_1067_ = ((((i_1064_ & 0xff00ff) * i_1059_ + (i_1067_ & 0xff00ff)
										* i_1060_) & ~0xff00ff) + (((i_1064_ & 0xff00)
										* i_1059_ + (i_1067_ & 0xff00)
										* i_1060_) & 0xff0000)) >> 8;
							}
							is[i_996_++] = i_1067_;
						}
						i_996_ += i_1000_;
						i_997_ += i_1001_;
					}
					return;
				}
				if (i_992_ == 2) {
					final int i_1068_ = i_993_ >>> 24;
					final int i_1069_ = 256 - i_1068_;
					int i_1070_ = (i_993_ & 0xff00ff) * i_1069_ & ~0xff00ff;
					int i_1071_ = (i_993_ & 0xff00) * i_1069_ & 0xff0000;
					i_993_ = (i_1070_ | i_1071_) >>> 8;
					for (int i_1072_ = -i_998_; i_1072_ < 0; i_1072_++) {
						for (int i_1073_ = -i_999_; i_1073_ < 0; i_1073_++) {
							final int i_1074_ = aByteArray6215[i_997_++];
							if (i_1074_ != 0) {
								final int i_1075_ = anIntArray6214[i_1074_ & 0xff];
								i_1070_ = ((i_1075_ & 0xff00ff) * i_1068_ & ~0xff00ff);
								i_1071_ = (i_1075_ & 0xff00) * i_1068_
										& 0xff0000;
								is[i_996_++] = ((i_1070_ | i_1071_) >>> 8)
										+ i_993_;
							} else {
								i_996_++;
							}
						}
						i_996_ += i_1000_;
						i_997_ += i_1001_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			if (i_994_ == 2) {
				if (i_992_ == 1) {
					for (int i_1076_ = -i_998_; i_1076_ < 0; i_1076_++) {
						for (int i_1077_ = -i_999_; i_1077_ < 0; i_1077_++) {
							final int i_1078_ = aByteArray6215[i_997_++];
							if (i_1078_ != 0) {
								final int i_1079_ = anIntArray6214[i_1078_ & 0xff];
								int i_1080_ = is[i_996_];
								final int i_1081_ = i_1079_ + i_1080_;
								final int i_1082_ = ((i_1079_ & 0xff00ff) + (i_1080_ & 0xff00ff));
								i_1080_ = ((i_1082_ & 0x1000100) + (i_1081_
										- i_1082_ & 0x10000));
								is[i_996_++] = i_1081_ - i_1080_ | i_1080_
										- (i_1080_ >>> 8);
							} else {
								i_996_++;
							}
						}
						i_996_ += i_1000_;
						i_997_ += i_1001_;
					}
					return;
				}
				if (i_992_ == 0) {
					final int i_1083_ = (i_993_ & 0xff0000) >> 16;
					final int i_1084_ = (i_993_ & 0xff00) >> 8;
					final int i_1085_ = i_993_ & 0xff;
					for (int i_1086_ = -i_998_; i_1086_ < 0; i_1086_++) {
						for (int i_1087_ = -i_999_; i_1087_ < 0; i_1087_++) {
							final int i_1088_ = aByteArray6215[i_997_++];
							if (i_1088_ != 0) {
								int i_1089_ = anIntArray6214[i_1088_ & 0xff];
								final int i_1090_ = ((i_1089_ & 0xff0000)
										* i_1083_ & ~0xffffff);
								final int i_1091_ = (i_1089_ & 0xff00)
										* i_1084_ & 0xff0000;
								final int i_1092_ = (i_1089_ & 0xff) * i_1085_
										& 0xff00;
								i_1089_ = (i_1090_ | i_1091_ | i_1092_) >>> 8;
								int i_1093_ = is[i_996_];
								final int i_1094_ = i_1089_ + i_1093_;
								final int i_1095_ = ((i_1089_ & 0xff00ff) + (i_1093_ & 0xff00ff));
								i_1093_ = ((i_1095_ & 0x1000100) + (i_1094_
										- i_1095_ & 0x10000));
								is[i_996_++] = i_1094_ - i_1093_ | i_1093_
										- (i_1093_ >>> 8);
							} else {
								i_996_++;
							}
						}
						i_996_ += i_1000_;
						i_997_ += i_1001_;
					}
					return;
				}
				if (i_992_ == 3) {
					for (int i_1096_ = -i_998_; i_1096_ < 0; i_1096_++) {
						for (int i_1097_ = -i_999_; i_1097_ < 0; i_1097_++) {
							final byte i_1098_ = aByteArray6215[i_997_++];
							int i_1099_ = i_1098_ > 0 ? anIntArray6214[i_1098_]
									: 0;
							int i_1100_ = i_1099_ + i_993_;
							int i_1101_ = (i_1099_ & 0xff00ff)
									+ (i_993_ & 0xff00ff);
							int i_1102_ = ((i_1101_ & 0x1000100) + (i_1100_
									- i_1101_ & 0x10000));
							i_1099_ = i_1100_ - i_1102_ | i_1102_
									- (i_1102_ >>> 8);
							i_1102_ = is[i_996_];
							i_1100_ = i_1099_ + i_1102_;
							i_1101_ = (i_1099_ & 0xff00ff)
									+ (i_1102_ & 0xff00ff);
							i_1102_ = (i_1101_ & 0x1000100)
									+ (i_1100_ - i_1101_ & 0x10000);
							is[i_996_++] = i_1100_ - i_1102_ | i_1102_
									- (i_1102_ >>> 8);
						}
						i_996_ += i_1000_;
						i_997_ += i_1001_;
					}
					return;
				}
				if (i_992_ == 2) {
					final int i_1103_ = i_993_ >>> 24;
					final int i_1104_ = 256 - i_1103_;
					int i_1105_ = (i_993_ & 0xff00ff) * i_1104_ & ~0xff00ff;
					int i_1106_ = (i_993_ & 0xff00) * i_1104_ & 0xff0000;
					i_993_ = (i_1105_ | i_1106_) >>> 8;
					for (int i_1107_ = -i_998_; i_1107_ < 0; i_1107_++) {
						for (int i_1108_ = -i_999_; i_1108_ < 0; i_1108_++) {
							final int i_1109_ = aByteArray6215[i_997_++];
							if (i_1109_ != 0) {
								int i_1110_ = anIntArray6214[i_1109_ & 0xff];
								i_1105_ = ((i_1110_ & 0xff00ff) * i_1103_ & ~0xff00ff);
								i_1106_ = (i_1110_ & 0xff00) * i_1103_
										& 0xff0000;
								i_1110_ = ((i_1105_ | i_1106_) >>> 8) + i_993_;
								int i_1111_ = is[i_996_];
								final int i_1112_ = i_1110_ + i_1111_;
								final int i_1113_ = ((i_1110_ & 0xff00ff) + (i_1111_ & 0xff00ff));
								i_1111_ = ((i_1113_ & 0x1000100) + (i_1112_
										- i_1113_ & 0x10000));
								is[i_996_++] = i_1112_ - i_1111_ | i_1111_
										- (i_1111_ >>> 8);
							} else {
								i_996_++;
							}
						}
						i_996_ += i_1000_;
						i_997_ += i_1001_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			throw new IllegalArgumentException();
		}
	}

	@Override
	final void method3758(final int[] is, final int[] is_1114_, final int i,
			final int i_1115_) {
		final int[] is_1116_ = ((Class332_Sub3) this).aHa_Sub2_5434.anIntArray4504;
		if (Class332_Sub3.anInt5444 == 0) {
			if (Class332_Sub3.anInt5436 == 0) {
				int i_1117_ = Class332_Sub3.anInt5431;
				while (i_1117_ < 0) {
					final int i_1118_ = i_1117_ + i_1115_;
					if (i_1118_ >= 0) {
						if (i_1118_ >= is.length) {
							break;
						}
						int i_1119_ = Class332_Sub3.anInt5451;
						int i_1120_ = Class332_Sub3.anInt5450;
						int i_1121_ = Class332_Sub3.anInt5443;
						int i_1122_ = Class332_Sub3.anInt5448;
						if (i_1120_ >= 0
								&& i_1121_ >= 0
								&& i_1120_
										- (((Class332_Sub3) this).anInt5433 << 12) < 0
								&& i_1121_
										- (((Class332_Sub3) this).anInt5454 << 12) < 0) {
							final int i_1123_ = is[i_1118_] - i;
							int i_1124_ = -is_1114_[i_1118_];
							final int i_1125_ = (i_1123_ - (i_1119_ - Class332_Sub3.anInt5451));
							if (i_1125_ > 0) {
								i_1119_ += i_1125_;
								i_1122_ += i_1125_;
								i_1120_ += Class332_Sub3.anInt5444 * i_1125_;
								i_1121_ += Class332_Sub3.anInt5436 * i_1125_;
							} else {
								i_1124_ -= i_1125_;
							}
							if (i_1122_ < i_1124_) {
								i_1122_ = i_1124_;
							}
							for (/**/; i_1122_ < 0; i_1122_++) {
								final int i_1126_ = (aByteArray6215[(((i_1121_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1120_ >> 12))]);
								if (i_1126_ != 0) {
									is_1116_[i_1119_++] = anIntArray6214[i_1126_ & 0xff];
								} else {
									i_1119_++;
								}
							}
						}
					}
					i_1117_++;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else if (Class332_Sub3.anInt5436 < 0) {
				int i_1127_ = Class332_Sub3.anInt5431;
				while (i_1127_ < 0) {
					final int i_1128_ = i_1127_ + i_1115_;
					if (i_1128_ >= 0) {
						if (i_1128_ >= is.length) {
							break;
						}
						int i_1129_ = Class332_Sub3.anInt5451;
						int i_1130_ = Class332_Sub3.anInt5450;
						int i_1131_ = (Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456);
						int i_1132_ = Class332_Sub3.anInt5448;
						if (i_1130_ >= 0
								&& i_1130_
										- (((Class332_Sub3) this).anInt5433 << 12) < 0) {
							int i_1133_;
							if ((i_1133_ = i_1131_
									- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
								i_1133_ = ((Class332_Sub3.anInt5436 - i_1133_) / Class332_Sub3.anInt5436);
								i_1132_ += i_1133_;
								i_1131_ += Class332_Sub3.anInt5436 * i_1133_;
								i_1129_ += i_1133_;
							}
							if ((i_1133_ = ((i_1131_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1132_) {
								i_1132_ = i_1133_;
							}
							final int i_1134_ = is[i_1128_] - i;
							int i_1135_ = -is_1114_[i_1128_];
							final int i_1136_ = (i_1134_ - (i_1129_ - Class332_Sub3.anInt5451));
							if (i_1136_ > 0) {
								i_1129_ += i_1136_;
								i_1132_ += i_1136_;
								i_1130_ += Class332_Sub3.anInt5444 * i_1136_;
								i_1131_ += Class332_Sub3.anInt5436 * i_1136_;
							} else {
								i_1135_ -= i_1136_;
							}
							if (i_1132_ < i_1135_) {
								i_1132_ = i_1135_;
							}
							for (/**/; i_1132_ < 0; i_1132_++) {
								final int i_1137_ = (aByteArray6215[(((i_1131_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1130_ >> 12))]);
								if (i_1137_ != 0) {
									is_1116_[i_1129_++] = anIntArray6214[i_1137_ & 0xff];
								} else {
									i_1129_++;
								}
								i_1131_ += Class332_Sub3.anInt5436;
							}
						}
					}
					i_1127_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else {
				int i_1138_ = Class332_Sub3.anInt5431;
				while (i_1138_ < 0) {
					final int i_1139_ = i_1138_ + i_1115_;
					if (i_1139_ >= 0) {
						if (i_1139_ >= is.length) {
							break;
						}
						int i_1140_ = Class332_Sub3.anInt5451;
						int i_1141_ = Class332_Sub3.anInt5450;
						int i_1142_ = (Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456);
						int i_1143_ = Class332_Sub3.anInt5448;
						if (i_1141_ >= 0
								&& i_1141_
										- (((Class332_Sub3) this).anInt5433 << 12) < 0) {
							if (i_1142_ < 0) {
								final int i_1144_ = ((Class332_Sub3.anInt5436 - 1 - i_1142_) / Class332_Sub3.anInt5436);
								i_1143_ += i_1144_;
								i_1142_ += Class332_Sub3.anInt5436 * i_1144_;
								i_1140_ += i_1144_;
							}
							int i_1145_;
							if ((i_1145_ = ((1 + i_1142_
									- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1143_) {
								i_1143_ = i_1145_;
							}
							final int i_1146_ = is[i_1139_] - i;
							int i_1147_ = -is_1114_[i_1139_];
							final int i_1148_ = (i_1146_ - (i_1140_ - Class332_Sub3.anInt5451));
							if (i_1148_ > 0) {
								i_1140_ += i_1148_;
								i_1143_ += i_1148_;
								i_1141_ += Class332_Sub3.anInt5444 * i_1148_;
								i_1142_ += Class332_Sub3.anInt5436 * i_1148_;
							} else {
								i_1147_ -= i_1148_;
							}
							if (i_1143_ < i_1147_) {
								i_1143_ = i_1147_;
							}
							for (/**/; i_1143_ < 0; i_1143_++) {
								final int i_1149_ = (aByteArray6215[(((i_1142_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1141_ >> 12))]);
								if (i_1149_ != 0) {
									is_1116_[i_1140_++] = anIntArray6214[i_1149_ & 0xff];
								} else {
									i_1140_++;
								}
								i_1142_ += Class332_Sub3.anInt5436;
							}
						}
					}
					i_1138_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			}
		} else if (Class332_Sub3.anInt5444 < 0) {
			if (Class332_Sub3.anInt5436 == 0) {
				int i_1150_ = Class332_Sub3.anInt5431;
				while (i_1150_ < 0) {
					final int i_1151_ = i_1150_ + i_1115_;
					if (i_1151_ >= 0) {
						if (i_1151_ >= is.length) {
							break;
						}
						int i_1152_ = Class332_Sub3.anInt5451;
						int i_1153_ = (Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425);
						int i_1154_ = Class332_Sub3.anInt5443;
						int i_1155_ = Class332_Sub3.anInt5448;
						if (i_1154_ >= 0
								&& i_1154_
										- (((Class332_Sub3) this).anInt5454 << 12) < 0) {
							int i_1156_;
							if ((i_1156_ = i_1153_
									- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
								i_1156_ = ((Class332_Sub3.anInt5444 - i_1156_) / Class332_Sub3.anInt5444);
								i_1155_ += i_1156_;
								i_1153_ += Class332_Sub3.anInt5444 * i_1156_;
								i_1152_ += i_1156_;
							}
							if ((i_1156_ = ((i_1153_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1155_) {
								i_1155_ = i_1156_;
							}
							final int i_1157_ = is[i_1151_] - i;
							int i_1158_ = -is_1114_[i_1151_];
							final int i_1159_ = (i_1157_ - (i_1152_ - Class332_Sub3.anInt5451));
							if (i_1159_ > 0) {
								i_1152_ += i_1159_;
								i_1155_ += i_1159_;
								i_1153_ += Class332_Sub3.anInt5444 * i_1159_;
								i_1154_ += Class332_Sub3.anInt5436 * i_1159_;
							} else {
								i_1158_ -= i_1159_;
							}
							if (i_1155_ < i_1158_) {
								i_1155_ = i_1158_;
							}
							for (/**/; i_1155_ < 0; i_1155_++) {
								final int i_1160_ = (aByteArray6215[(((i_1154_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1153_ >> 12))]);
								if (i_1160_ != 0) {
									is_1116_[i_1152_++] = anIntArray6214[i_1160_ & 0xff];
								} else {
									i_1152_++;
								}
								i_1153_ += Class332_Sub3.anInt5444;
							}
						}
					}
					i_1150_++;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else if (Class332_Sub3.anInt5436 < 0) {
				int i_1161_ = Class332_Sub3.anInt5431;
				while (i_1161_ < 0) {
					final int i_1162_ = i_1161_ + i_1115_;
					if (i_1162_ >= 0) {
						if (i_1162_ >= is.length) {
							break;
						}
						int i_1163_ = Class332_Sub3.anInt5451;
						int i_1164_ = (Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425);
						int i_1165_ = (Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456);
						int i_1166_ = Class332_Sub3.anInt5448;
						int i_1167_;
						if ((i_1167_ = i_1164_
								- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
							i_1167_ = ((Class332_Sub3.anInt5444 - i_1167_) / Class332_Sub3.anInt5444);
							i_1166_ += i_1167_;
							i_1164_ += Class332_Sub3.anInt5444 * i_1167_;
							i_1165_ += Class332_Sub3.anInt5436 * i_1167_;
							i_1163_ += i_1167_;
						}
						if ((i_1167_ = ((i_1164_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1166_) {
							i_1166_ = i_1167_;
						}
						if ((i_1167_ = i_1165_
								- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
							i_1167_ = ((Class332_Sub3.anInt5436 - i_1167_) / Class332_Sub3.anInt5436);
							i_1166_ += i_1167_;
							i_1164_ += Class332_Sub3.anInt5444 * i_1167_;
							i_1165_ += Class332_Sub3.anInt5436 * i_1167_;
							i_1163_ += i_1167_;
						}
						if ((i_1167_ = ((i_1165_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1166_) {
							i_1166_ = i_1167_;
						}
						final int i_1168_ = is[i_1162_] - i;
						int i_1169_ = -is_1114_[i_1162_];
						final int i_1170_ = i_1168_
								- (i_1163_ - Class332_Sub3.anInt5451);
						if (i_1170_ > 0) {
							i_1163_ += i_1170_;
							i_1166_ += i_1170_;
							i_1164_ += Class332_Sub3.anInt5444 * i_1170_;
							i_1165_ += Class332_Sub3.anInt5436 * i_1170_;
						} else {
							i_1169_ -= i_1170_;
						}
						if (i_1166_ < i_1169_) {
							i_1166_ = i_1169_;
						}
						for (/**/; i_1166_ < 0; i_1166_++) {
							final int i_1171_ = (aByteArray6215[(((i_1165_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1164_ >> 12))]);
							if (i_1171_ != 0) {
								is_1116_[i_1163_++] = anIntArray6214[i_1171_ & 0xff];
							} else {
								i_1163_++;
							}
							i_1164_ += Class332_Sub3.anInt5444;
							i_1165_ += Class332_Sub3.anInt5436;
						}
					}
					i_1161_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			} else {
				int i_1172_ = Class332_Sub3.anInt5431;
				while (i_1172_ < 0) {
					final int i_1173_ = i_1172_ + i_1115_;
					if (i_1173_ >= 0) {
						if (i_1173_ >= is.length) {
							break;
						}
						int i_1174_ = Class332_Sub3.anInt5451;
						int i_1175_ = (Class332_Sub3.anInt5450 + Class332_Sub3.anInt5425);
						int i_1176_ = (Class332_Sub3.anInt5443 + Class332_Sub3.anInt5456);
						int i_1177_ = Class332_Sub3.anInt5448;
						int i_1178_;
						if ((i_1178_ = i_1175_
								- (((Class332_Sub3) this).anInt5433 << 12)) >= 0) {
							i_1178_ = ((Class332_Sub3.anInt5444 - i_1178_) / Class332_Sub3.anInt5444);
							i_1177_ += i_1178_;
							i_1175_ += Class332_Sub3.anInt5444 * i_1178_;
							i_1176_ += Class332_Sub3.anInt5436 * i_1178_;
							i_1174_ += i_1178_;
						}
						if ((i_1178_ = ((i_1175_ - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1177_) {
							i_1177_ = i_1178_;
						}
						if (i_1176_ < 0) {
							i_1178_ = ((Class332_Sub3.anInt5436 - 1 - i_1176_) / Class332_Sub3.anInt5436);
							i_1177_ += i_1178_;
							i_1175_ += Class332_Sub3.anInt5444 * i_1178_;
							i_1176_ += Class332_Sub3.anInt5436 * i_1178_;
							i_1174_ += i_1178_;
						}
						if ((i_1178_ = ((1 + i_1176_
								- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1177_) {
							i_1177_ = i_1178_;
						}
						final int i_1179_ = is[i_1173_] - i;
						int i_1180_ = -is_1114_[i_1173_];
						final int i_1181_ = i_1179_
								- (i_1174_ - Class332_Sub3.anInt5451);
						if (i_1181_ > 0) {
							i_1174_ += i_1181_;
							i_1177_ += i_1181_;
							i_1175_ += Class332_Sub3.anInt5444 * i_1181_;
							i_1176_ += Class332_Sub3.anInt5436 * i_1181_;
						} else {
							i_1180_ -= i_1181_;
						}
						if (i_1177_ < i_1180_) {
							i_1177_ = i_1180_;
						}
						for (/**/; i_1177_ < 0; i_1177_++) {
							final int i_1182_ = (aByteArray6215[(((i_1176_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1175_ >> 12))]);
							if (i_1182_ != 0) {
								is_1116_[i_1174_++] = anIntArray6214[i_1182_ & 0xff];
							} else {
								i_1174_++;
							}
							i_1175_ += Class332_Sub3.anInt5444;
							i_1176_ += Class332_Sub3.anInt5436;
						}
					}
					i_1172_++;
					Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
					Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
					Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
				}
			}
		} else if (Class332_Sub3.anInt5436 == 0) {
			int i_1183_ = Class332_Sub3.anInt5431;
			while (i_1183_ < 0) {
				final int i_1184_ = i_1183_ + i_1115_;
				if (i_1184_ >= 0) {
					if (i_1184_ >= is.length) {
						break;
					}
					int i_1185_ = Class332_Sub3.anInt5451;
					int i_1186_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_1187_ = Class332_Sub3.anInt5443;
					int i_1188_ = Class332_Sub3.anInt5448;
					if (i_1187_ >= 0
							&& (i_1187_
									- (((Class332_Sub3) this).anInt5454 << 12) < 0)) {
						if (i_1186_ < 0) {
							final int i_1189_ = ((Class332_Sub3.anInt5444 - 1 - i_1186_) / Class332_Sub3.anInt5444);
							i_1188_ += i_1189_;
							i_1186_ += Class332_Sub3.anInt5444 * i_1189_;
							i_1185_ += i_1189_;
						}
						int i_1190_;
						if ((i_1190_ = ((1 + i_1186_
								- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1188_) {
							i_1188_ = i_1190_;
						}
						final int i_1191_ = is[i_1184_] - i;
						int i_1192_ = -is_1114_[i_1184_];
						final int i_1193_ = i_1191_
								- (i_1185_ - Class332_Sub3.anInt5451);
						if (i_1193_ > 0) {
							i_1185_ += i_1193_;
							i_1188_ += i_1193_;
							i_1186_ += Class332_Sub3.anInt5444 * i_1193_;
							i_1187_ += Class332_Sub3.anInt5436 * i_1193_;
						} else {
							i_1192_ -= i_1193_;
						}
						if (i_1188_ < i_1192_) {
							i_1188_ = i_1192_;
						}
						for (/**/; i_1188_ < 0; i_1188_++) {
							final int i_1194_ = (aByteArray6215[(((i_1187_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1186_ >> 12))]);
							if (i_1194_ != 0) {
								is_1116_[i_1185_++] = anIntArray6214[i_1194_ & 0xff];
							} else {
								i_1185_++;
							}
							i_1186_ += Class332_Sub3.anInt5444;
						}
					}
				}
				i_1183_++;
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		} else if (Class332_Sub3.anInt5436 < 0) {
			int i_1195_ = Class332_Sub3.anInt5431;
			while (i_1195_ < 0) {
				final int i_1196_ = i_1195_ + i_1115_;
				if (i_1196_ >= 0) {
					if (i_1196_ >= is.length) {
						break;
					}
					int i_1197_ = Class332_Sub3.anInt5451;
					int i_1198_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_1199_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_1200_ = Class332_Sub3.anInt5448;
					if (i_1198_ < 0) {
						final int i_1201_ = ((Class332_Sub3.anInt5444 - 1 - i_1198_) / Class332_Sub3.anInt5444);
						i_1200_ += i_1201_;
						i_1198_ += Class332_Sub3.anInt5444 * i_1201_;
						i_1199_ += Class332_Sub3.anInt5436 * i_1201_;
						i_1197_ += i_1201_;
					}
					int i_1202_;
					if ((i_1202_ = ((1 + i_1198_
							- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1200_) {
						i_1200_ = i_1202_;
					}
					if ((i_1202_ = i_1199_
							- (((Class332_Sub3) this).anInt5454 << 12)) >= 0) {
						i_1202_ = ((Class332_Sub3.anInt5436 - i_1202_) / Class332_Sub3.anInt5436);
						i_1200_ += i_1202_;
						i_1198_ += Class332_Sub3.anInt5444 * i_1202_;
						i_1199_ += Class332_Sub3.anInt5436 * i_1202_;
						i_1197_ += i_1202_;
					}
					if ((i_1202_ = ((i_1199_ - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1200_) {
						i_1200_ = i_1202_;
					}
					final int i_1203_ = is[i_1196_] - i;
					int i_1204_ = -is_1114_[i_1196_];
					final int i_1205_ = i_1203_
							- (i_1197_ - Class332_Sub3.anInt5451);
					if (i_1205_ > 0) {
						i_1197_ += i_1205_;
						i_1200_ += i_1205_;
						i_1198_ += Class332_Sub3.anInt5444 * i_1205_;
						i_1199_ += Class332_Sub3.anInt5436 * i_1205_;
					} else {
						i_1204_ -= i_1205_;
					}
					if (i_1200_ < i_1204_) {
						i_1200_ = i_1204_;
					}
					for (/**/; i_1200_ < 0; i_1200_++) {
						final int i_1206_ = (aByteArray6215[(((i_1199_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1198_ >> 12))]);
						if (i_1206_ != 0) {
							is_1116_[i_1197_++] = anIntArray6214[i_1206_ & 0xff];
						} else {
							i_1197_++;
						}
						i_1198_ += Class332_Sub3.anInt5444;
						i_1199_ += Class332_Sub3.anInt5436;
					}
				}
				i_1195_++;
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		} else {
			int i_1207_ = Class332_Sub3.anInt5431;
			while (i_1207_ < 0) {
				final int i_1208_ = i_1207_ + i_1115_;
				if (i_1208_ >= 0) {
					if (i_1208_ >= is.length) {
						break;
					}
					int i_1209_ = Class332_Sub3.anInt5451;
					int i_1210_ = Class332_Sub3.anInt5450
							+ Class332_Sub3.anInt5425;
					int i_1211_ = Class332_Sub3.anInt5443
							+ Class332_Sub3.anInt5456;
					int i_1212_ = Class332_Sub3.anInt5448;
					if (i_1210_ < 0) {
						final int i_1213_ = ((Class332_Sub3.anInt5444 - 1 - i_1210_) / Class332_Sub3.anInt5444);
						i_1212_ += i_1213_;
						i_1210_ += Class332_Sub3.anInt5444 * i_1213_;
						i_1211_ += Class332_Sub3.anInt5436 * i_1213_;
						i_1209_ += i_1213_;
					}
					int i_1214_;
					if ((i_1214_ = ((1 + i_1210_
							- (((Class332_Sub3) this).anInt5433 << 12) - Class332_Sub3.anInt5444) / Class332_Sub3.anInt5444)) > i_1212_) {
						i_1212_ = i_1214_;
					}
					if (i_1211_ < 0) {
						i_1214_ = ((Class332_Sub3.anInt5436 - 1 - i_1211_) / Class332_Sub3.anInt5436);
						i_1212_ += i_1214_;
						i_1210_ += Class332_Sub3.anInt5444 * i_1214_;
						i_1211_ += Class332_Sub3.anInt5436 * i_1214_;
						i_1209_ += i_1214_;
					}
					if ((i_1214_ = ((1 + i_1211_
							- (((Class332_Sub3) this).anInt5454 << 12) - Class332_Sub3.anInt5436) / Class332_Sub3.anInt5436)) > i_1212_) {
						i_1212_ = i_1214_;
					}
					final int i_1215_ = is[i_1208_] - i;
					int i_1216_ = -is_1114_[i_1208_];
					final int i_1217_ = i_1215_
							- (i_1209_ - Class332_Sub3.anInt5451);
					if (i_1217_ > 0) {
						i_1209_ += i_1217_;
						i_1212_ += i_1217_;
						i_1210_ += Class332_Sub3.anInt5444 * i_1217_;
						i_1211_ += Class332_Sub3.anInt5436 * i_1217_;
					} else {
						i_1216_ -= i_1217_;
					}
					if (i_1212_ < i_1216_) {
						i_1212_ = i_1216_;
					}
					for (/**/; i_1212_ < 0; i_1212_++) {
						final int i_1218_ = (aByteArray6215[(((i_1211_ >> 12) * ((Class332_Sub3) this).anInt5433) + (i_1210_ >> 12))]);
						if (i_1218_ != 0) {
							is_1116_[i_1209_++] = anIntArray6214[i_1218_ & 0xff];
						} else {
							i_1209_++;
						}
						i_1210_ += Class332_Sub3.anInt5444;
						i_1211_ += Class332_Sub3.anInt5436;
					}
				}
				i_1207_++;
				Class332_Sub3.anInt5450 += Class332_Sub3.anInt5441;
				Class332_Sub3.anInt5443 += Class332_Sub3.anInt5428;
				Class332_Sub3.anInt5451 += Class332_Sub3.anInt5438;
			}
		}
	}
}
