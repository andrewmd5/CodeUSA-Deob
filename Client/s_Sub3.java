/* s_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class s_Sub3 extends s {
	private float aFloat5255;
	private final int anInt5256;
	private byte[][] aByteArrayArray5257;
	private Class285[][] aClass285ArrayArray5258;
	private byte[][] aByteArrayArray5259;
	private float aFloat5260;
	private Class328[][] aClass328ArrayArray5261;
	private int anInt5262 = -1;
	private float aFloat5263;
	private float aFloat5264;
	private Class327[][] aClass327ArrayArray5265;
	private Class120[][] aClass120ArrayArray5266;
	private float aFloat5267;
	private float aFloat5268;
	private final ha_Sub2 aHa_Sub2_5269;
	private float aFloat5270;
	private float aFloat5271;
	private Class193[][] aClass193ArrayArray5272;
	private float aFloat5273;
	private float aFloat5274;
	private float aFloat5275;
	private float aFloat5276;

	@Override
	final void ka(final int i, final int i_0_, final int i_1_) {
		if (aByteArrayArray5259[i][i_0_] < i_1_) {
			aByteArrayArray5259[i][i_0_] = (byte) i_1_;
		}
	}

	@Override
	final void method3422(final int i, final int i_2_, final int i_3_,
			final int i_4_, final int i_5_, final int i_6_, final int i_7_,
			final boolean[][] bools) {
		final Class235 class235 = aHa_Sub2_5269.method1921(Thread
				.currentThread());
		final Class12 class12 = class235.aClass12_1767;
		class12.anInt137 = 0;
		class12.aBoolean135 = true;
		aHa_Sub2_5269.ya();
		if (aClass193ArrayArray5272 != null || aClass120ArrayArray5266 != null) {
			method3444(i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, bools, class235,
					class12, class235.anIntArray1795, class235.anIntArray1788);
		} else if (aClass327ArrayArray5265 != null) {
			method3437(i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, bools, class235,
					class12, class235.anIntArray1795, class235.anIntArray1788);
		}
	}

	s_Sub3(final ha_Sub2 var_ha_Sub2, final int i, final int i_8_,
			final int i_9_, final int i_10_, final int[][] is,
			final int[][] is_11_, final int i_12_) {
		super(i_9_, i_10_, i_12_, is);
		aHa_Sub2_5269 = var_ha_Sub2;
		anInt5256 = i_8_;
		aByteArrayArray5257 = new byte[i_9_ + 1][i_10_ + 1];
		final int i_13_ = aHa_Sub2_5269.anInt4516 >> 9;
		for (int i_14_ = 1; i_14_ < i_10_; i_14_++) {
			for (int i_15_ = 1; i_15_ < i_9_; i_15_++) {
				int i_16_ = i_13_;
				final int i_17_ = is_11_[i_15_ + 1][i_14_]
						- is_11_[i_15_ - 1][i_14_];
				final int i_18_ = is_11_[i_15_][i_14_ + 1]
						- is_11_[i_15_][i_14_ - 1];
				final int i_19_ = (int) Math.sqrt(i_17_ * i_17_ + 512 * i_12_
						+ i_18_ * i_18_);
				final int i_20_ = (i_17_ << 8) / i_19_;
				final int i_21_ = -512 * i_12_ / i_19_;
				final int i_22_ = (i_18_ << 8) / i_19_;
				i_16_ += (aHa_Sub2_5269.anInt4481 * i_20_
						+ aHa_Sub2_5269.anInt4515 * i_21_ + aHa_Sub2_5269.anInt4500
						* i_22_) >> 17;
				i_16_ >>= 1;
				if (i_16_ < 2) {
					i_16_ = 2;
				} else if (i_16_ > 126) {
					i_16_ = 126;
				}
				aByteArrayArray5257[i_15_][i_14_] = (byte) i_16_;
			}
		}
		aByteArrayArray5259 = new byte[i_9_ + 1][i_10_ + 1];
	}

	@Override
	final r fa(final int i, final int i_23_, final r var_r) {
		return null;
	}

	private final void method3437(final int i, final int i_24_,
			final int i_25_, final int i_26_, final int i_27_, final int i_28_,
			final int i_29_, final boolean[][] bools, final Class235 class235,
			final Class12 class12, final int[] is, final int[] is_30_) {
		final int i_31_ = (i_29_ - i_27_) * i_25_ / 256;
		final int i_32_ = i_25_ >> 8;
		final boolean bool = class235.aBoolean1762;
		aHa_Sub2_5269.C(false);
		class12.aBoolean134 = false;
		class12.aBoolean130 = false;
		int i_33_ = i;
		int i_34_ = i_24_ + i_31_;
		for (int i_35_ = i_26_; i_35_ < i_28_; i_35_++) {
			for (int i_36_ = i_27_; i_36_ < i_29_; i_36_++) {
				if (bools[i_35_ - i_26_][i_36_ - i_27_]) {
					if (aClass327ArrayArray5265[i_35_][i_36_] != null) {
						final Class327 class327 = aClass327ArrayArray5265[i_35_][i_36_];
						if (class327.aShort2744 != -1
								&& (class327.aByte2740 & 0x2) == 0
								&& class327.anInt2743 == -1) {
							final int i_37_ = aHa_Sub2_5269
									.method1926(class327.aShort2744);
							class12.method216(i_34_ - i_32_, i_34_ - i_32_,
									i_34_, i_33_ + i_32_, i_33_, i_33_ + i_32_,
									100.0F, 100.0F, 100.0F,
									(Class246_Sub7.method3132(
											(class327.aShort2745) & 0xffff,
											(byte) 118, i_37_)),
									(Class246_Sub7.method3132(
											(class327.aShort2742) & 0xffff,
											(byte) 118, i_37_)),
									(Class246_Sub7.method3132(
											(class327.aShort2739) & 0xffff,
											(byte) 118, i_37_)));
							class12.method216(i_34_, i_34_, i_34_ - i_32_,
									i_33_, i_33_ + i_32_, i_33_, 100.0F,
									100.0F, 100.0F, (Class246_Sub7.method3132(
											(class327.aShort2741) & 0xffff,
											(byte) 118, i_37_)),
									(Class246_Sub7.method3132(
											(class327.aShort2739) & 0xffff,
											(byte) 118, i_37_)),
									(Class246_Sub7.method3132(
											(class327.aShort2742) & 0xffff,
											(byte) 118, i_37_)));
						} else if (class327.anInt2743 == -1) {
							class12.method216(i_34_ - i_32_, i_34_ - i_32_,
									i_34_, i_33_ + i_32_, i_33_, i_33_ + i_32_,
									100.0F, 100.0F, 100.0F,
									class327.aShort2745 & 0xffff,
									class327.aShort2742 & 0xffff,
									class327.aShort2739 & 0xffff);
							class12.method216(i_34_, i_34_, i_34_ - i_32_,
									i_33_, i_33_ + i_32_, i_33_, 100.0F,
									100.0F, 100.0F,
									class327.aShort2741 & 0xffff,
									class327.aShort2739 & 0xffff,
									class327.aShort2742 & 0xffff);
						} else {
							final int i_38_ = class327.anInt2743;
							class12.method216(i_34_ - i_32_, i_34_ - i_32_,
									i_34_, i_33_ + i_32_, i_33_, i_33_ + i_32_,
									100.0F, 100.0F, 100.0F, i_38_, i_38_, i_38_);
							class12.method216(i_34_, i_34_, i_34_ - i_32_,
									i_33_, i_33_ + i_32_, i_33_, 100.0F,
									100.0F, 100.0F, i_38_, i_38_, i_38_);
						}
					} else if (aClass328ArrayArray5261[i_35_][i_36_] != null) {
						final Class328 class328 = aClass328ArrayArray5261[i_35_][i_36_];
						for (int i_39_ = 0; i_39_ < class328.aShort2748; i_39_++) {
							is[i_39_] = i_33_
									+ ((class328.aShortArray2755[i_39_])
											* i_32_ / ((s) this).anInt2206);
							is_30_[i_39_] = i_34_
									- ((class328.aShortArray2757[i_39_])
											* i_32_ / ((s) this).anInt2206);
						}
						for (int i_40_ = 0; i_40_ < class328.aShort2746; i_40_++) {
							final short i_41_ = class328.aShortArray2758[i_40_];
							final short i_42_ = class328.aShortArray2751[i_40_];
							final short i_43_ = class328.aShortArray2759[i_40_];
							final int i_44_ = is[i_41_];
							final int i_45_ = is[i_42_];
							final int i_46_ = is[i_43_];
							final int i_47_ = is_30_[i_41_];
							final int i_48_ = is_30_[i_42_];
							final int i_49_ = is_30_[i_43_];
							if (class328.anIntArray2756 != null
									&& (class328.anIntArray2756[i_40_] != -1)) {
								final int i_50_ = (class328.anIntArray2756[i_40_]);
								class12.method216(
										i_47_,
										i_48_,
										i_49_,
										i_44_,
										i_45_,
										i_46_,
										100.0F,
										100.0F,
										100.0F,
										(Class246_Sub7
												.method3132(
														(class328.aShortArray2750[i_41_]),
														(byte) 118, i_50_)),
										(Class246_Sub7
												.method3132(
														(class328.aShortArray2750[i_42_]),
														(byte) 118, i_50_)),
										(Class246_Sub7
												.method3132(
														(class328.aShortArray2750[i_43_]),
														(byte) 118, i_50_)));
							} else if ((class328.aShortArray2752 != null)
									&& (class328.aShortArray2752[i_40_]) != -1) {
								final int i_51_ = aHa_Sub2_5269
										.method1926(class328.aShortArray2752[i_40_]);
								class12.method216(
										i_47_,
										i_48_,
										i_49_,
										i_44_,
										i_45_,
										i_46_,
										100.0F,
										100.0F,
										100.0F,
										(Class246_Sub7
												.method3132(
														(class328.aShortArray2750[i_41_]),
														(byte) 118, i_51_)),
										(Class246_Sub7
												.method3132(
														(class328.aShortArray2750[i_42_]),
														(byte) 118, i_51_)),
										(Class246_Sub7
												.method3132(
														(class328.aShortArray2750[i_43_]),
														(byte) 118, i_51_)));
							} else {
								final int i_52_ = (class328.anIntArray2749[i_40_]);
								class12.method216(
										i_47_,
										i_48_,
										i_49_,
										i_44_,
										i_45_,
										i_46_,
										100.0F,
										100.0F,
										100.0F,
										(Class246_Sub7
												.method3132(
														(class328.aShortArray2750[i_41_]),
														(byte) 118, i_52_)),
										(Class246_Sub7
												.method3132(
														(class328.aShortArray2750[i_42_]),
														(byte) 118, i_52_)),
										(Class246_Sub7
												.method3132(
														(class328.aShortArray2750[i_43_]),
														(byte) 118, i_52_)));
							}
						}
					}
				}
				i_34_ -= i_32_;
			}
			i_34_ = i_24_ + i_31_;
			i_33_ += i_32_;
		}
		class12.aBoolean134 = true;
		aHa_Sub2_5269.C(bool);
	}

	@Override
	final void method3421(final Class98_Sub5 class98_sub5, final int[] is) {
		/* empty */
	}

	private final void method3438(final int i, final int i_53_,
			final boolean bool, final Class235 class235, final Class12 class12,
			final int[] is, final int[] is_54_, final int[] is_55_,
			final int[] is_56_, final int i_57_) {
		final Class120 class120 = aClass120ArrayArray5266[i][i_53_];
		if (i_57_ == 0 || (i_57_ & 0x2) == 0) {
			if (class120 != null) {
				if (anInt5262 == -1) {
					for (int i_58_ = 0; i_58_ < class120.aShort994; i_58_++) {
						final int i_59_ = (class120.aShortArray995[i_58_] + (i << ((s) this).anInt2200));
						int i_60_ = class120.aShortArray996[i_58_];
						final int i_61_ = (class120.aShortArray992[i_58_] + (i_53_ << ((s) this).anInt2200));
						final float f = aFloat5274
								+ (aFloat5260 * i_59_ + aFloat5270 * i_60_ + aFloat5263
										* i_61_);
						if (f <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						is_56_[i_58_] = 0;
						if (bool) {
							int i_62_ = (int) (f - (class235.anInt1761));
							if (i_62_ > 255) {
								i_62_ = 255;
							}
							if (i_62_ > 0) {
								is_56_[i_58_] = i_62_;
								final int i_63_ = ((class120.aShortArray993[i_58_])
										* i_62_ / 255);
								if (i_63_ > 0) {
									i_60_ -= i_63_;
								}
							}
						} else if (class235.aBoolean1758) {
							final int i_64_ = (int) (f - (class235.anInt1761));
							if (i_64_ > 0) {
								is_56_[i_58_] = i_64_;
								if (is_56_[i_58_] > 255) {
									is_56_[i_58_] = 255;
								}
							}
						}
						final float f_65_ = aFloat5268
								+ (aFloat5275 * i_59_ + aFloat5271 * i_60_ + aFloat5276
										* i_61_);
						final float f_66_ = aFloat5255
								+ (aFloat5264 * i_59_ + aFloat5273 * i_60_ + aFloat5267
										* i_61_);
						is[i_58_] = (class12.anInt136 + (int) (f_65_
								* (aHa_Sub2_5269.anInt4514) / f));
						is_54_[i_58_] = (class12.anInt128 + (int) (f_66_
								* (aHa_Sub2_5269.anInt4490) / f));
						is_55_[i_58_] = (int) f;
					}
				} else {
					for (int i_67_ = 0; i_67_ < class120.aShort994; i_67_++) {
						final int i_68_ = (class120.aShortArray995[i_67_] + (i << ((s) this).anInt2200));
						int i_69_ = class120.aShortArray996[i_67_];
						final int i_70_ = (class120.aShortArray992[i_67_] + (i_53_ << ((s) this).anInt2200));
						final float f = aFloat5274
								+ (aFloat5260 * i_68_ + aFloat5270 * i_69_ + aFloat5263
										* i_70_);
						is_56_[i_67_] = 0;
						if (bool) {
							int i_71_ = anInt5262 - class235.anInt1761;
							if (i_71_ > 255) {
								i_71_ = 255;
							}
							if (i_71_ > 0) {
								is_56_[i_67_] = i_71_;
								final int i_72_ = ((class120.aShortArray993[i_67_])
										* i_71_ / 255);
								if (i_72_ > 0) {
									i_69_ -= i_72_;
								}
							}
						} else if (class235.aBoolean1758) {
							final int i_73_ = anInt5262 - class235.anInt1761;
							if (i_73_ > 0) {
								is_56_[i_67_] = i_73_;
								if (is_56_[i_67_] > 255) {
									is_56_[i_67_] = 255;
								}
							}
						}
						final float f_74_ = aFloat5268
								+ (aFloat5275 * i_68_ + aFloat5271 * i_69_ + aFloat5276
										* i_70_);
						final float f_75_ = aFloat5255
								+ (aFloat5264 * i_68_ + aFloat5273 * i_69_ + aFloat5267
										* i_70_);
						is[i_67_] = (class12.anInt136 + (int) (f_74_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						is_54_[i_67_] = (class12.anInt128 + (int) (f_75_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						is_55_[i_67_] = (int) f;
					}
				}
				final float f = ((s) this).anInt2206;
				for (int i_76_ = 0; i_76_ < class120.aShort991; i_76_++) {
					final int i_77_ = i_76_ * 3;
					final int i_78_ = i_77_ + 1;
					final int i_79_ = i_78_ + 1;
					final int i_80_ = is[i_77_];
					final int i_81_ = is[i_78_];
					final int i_82_ = is[i_79_];
					final int i_83_ = is_54_[i_77_];
					final int i_84_ = is_54_[i_78_];
					final int i_85_ = is_54_[i_79_];
					if (((i_80_ - i_81_) * (i_85_ - i_84_) - (i_83_ - i_84_)
							* (i_82_ - i_81_)) > 0) {
						class12.aBoolean135 = (i_80_ < 0 || i_81_ < 0
								|| i_82_ < 0 || i_80_ > class12.anInt141
								|| i_81_ > class12.anInt141 || i_82_ > class12.anInt141);
						if (is_56_[i_77_] + is_56_[i_78_] + is_56_[i_79_] < 765) {
							final int i_86_ = i << ((s) this).anInt2200;
							final int i_87_ = i_53_ << ((s) this).anInt2200;
							if ((class120.anIntArray999[i_77_] & 0xffffff) != 0) {
								if (((class120.aShortArray998[i_77_]) == (class120.aShortArray998[i_78_]))
										&& ((class120.aShortArray998[i_77_]) == (class120.aShortArray998[i_79_]))
										&& ((class120.aShortArray990[i_77_]) == (class120.aShortArray990[i_78_]))
										&& ((class120.aShortArray990[i_77_]) == (class120.aShortArray990[i_79_]))) {
									class12.method212(
											i_83_,
											i_84_,
											i_85_,
											i_80_,
											i_81_,
											i_82_,
											is_55_[i_77_],
											is_55_[i_78_],
											is_55_[i_79_],
											((float) (i_86_ + (class120.aShortArray995[i_77_])) / (float) (class120.aShortArray990[i_77_])),
											((float) (i_86_ + (class120.aShortArray995[i_78_])) / (float) (class120.aShortArray990[i_78_])),
											((float) (i_86_ + (class120.aShortArray995[i_79_])) / (float) (class120.aShortArray990[i_79_])),
											((float) (i_87_ + (class120.aShortArray992[i_77_])) / (float) (class120.aShortArray990[i_77_])),
											((float) (i_87_ + (class120.aShortArray992[i_78_])) / (float) (class120.aShortArray990[i_78_])),
											((float) (i_87_ + (class120.aShortArray992[i_79_])) / (float) (class120.aShortArray990[i_79_])),
											(class120.anIntArray999[i_77_]),
											(class120.anIntArray999[i_78_]),
											(class120.anIntArray999[i_79_]),
											class235.anInt1763, is_56_[i_77_],
											is_56_[i_78_], is_56_[i_79_],
											(class120.aShortArray998[i_77_]));
								} else {
									class12.method209(
											i_83_,
											i_84_,
											i_85_,
											i_80_,
											i_81_,
											i_82_,
											is_55_[i_77_],
											is_55_[i_78_],
											is_55_[i_79_],
											((i_86_ + (class120.aShortArray995[i_77_])) / f),
											((i_86_ + (class120.aShortArray995[i_78_])) / f),
											((i_86_ + (class120.aShortArray995[i_79_])) / f),
											((i_87_ + (class120.aShortArray992[i_77_])) / f),
											((i_87_ + (class120.aShortArray992[i_78_])) / f),
											((i_87_ + (class120.aShortArray992[i_79_])) / f),
											(class120.anIntArray999[i_77_]),
											(class120.anIntArray999[i_78_]),
											(class120.anIntArray999[i_79_]),
											class235.anInt1763,
											is_56_[i_77_],
											is_56_[i_78_],
											is_56_[i_79_],
											(class120.aShortArray998[i_77_]),
											f
													/ (class120.aShortArray990[i_77_]),
											(class120.aShortArray998[i_78_]),
											f
													/ (class120.aShortArray990[i_78_]),
											(class120.aShortArray998[i_79_]),
											f
													/ (class120.aShortArray990[i_79_]));
								}
							}
						} else {
							class12.method208(i_83_, i_84_, i_85_, i_80_,
									i_81_, i_82_, is_55_[i_77_], is_55_[i_78_],
									is_55_[i_79_], class235.anInt1763);
						}
					}
				}
			}
		}
	}

	private static final int method3439(final int i, final int i_88_) {
		int i_89_ = (i & 0xff0000) * i_88_ >> 23;
		if (i_89_ < 2) {
			i_89_ = 2;
		} else if (i_89_ > 253) {
			i_89_ = 253;
		}
		int i_90_ = (i & 0xff00) * i_88_ >> 15;
		if (i_90_ < 2) {
			i_90_ = 2;
		} else if (i_90_ > 253) {
			i_90_ = 253;
		}
		int i_91_ = (i & 0xff) * i_88_ >> 7;
		if (i_91_ < 2) {
			i_91_ = 2;
		} else if (i_91_ > 253) {
			i_91_ = 253;
		}
		return i_89_ << 16 | i_90_ << 8 | i_91_;
	}

	@Override
	final void YA() {
		aByteArrayArray5257 = null;
		aByteArrayArray5259 = null;
	}

	private final void method3440(final int i, final int i_92_,
			final Class12 class12, final int[] is, final int[] is_93_,
			final int[] is_94_, final int[] is_95_, final int i_96_) {
		final Class327 class327 = aClass327ArrayArray5265[i][i_92_];
		if (class327 != null) {
			if ((class327.aByte2740 & 0x2) == 0) {
				if (i_96_ != 0) {
					if ((class327.aByte2740 & 0x4) != 0) {
						if ((i_96_ & 0x1) != 0) {
							return;
						}
					} else if ((i_96_ & 0x2) != 0) {
						return;
					}
				}
				final int i_97_ = i * ((s) this).anInt2206;
				final int i_98_ = i_97_ + ((s) this).anInt2206;
				final int i_99_ = i_92_ * ((s) this).anInt2206;
				final int i_100_ = i_99_ + ((s) this).anInt2206;
				float f;
				float f_101_;
				float f_102_;
				float f_103_;
				int i_104_;
				int i_105_;
				int i_106_;
				int i_107_;
				int i_108_;
				int i_109_;
				int i_110_;
				int i_111_;
				if ((class327.aByte2740 & 0x1) != 0) {
					final int i_112_ = ((s) this).anIntArrayArray2201[i][i_92_];
					final float f_113_ = aFloat5270 * i_112_;
					if (anInt5262 == -1) {
						f = aFloat5274
								+ (aFloat5260 * i_97_ + f_113_ + aFloat5263
										* i_99_);
						if (f <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						f_101_ = aFloat5274
								+ (aFloat5260 * i_98_ + f_113_ + aFloat5263
										* i_99_);
						if (f_101_ <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						f_102_ = aFloat5274
								+ (aFloat5260 * i_98_ + f_113_ + aFloat5263
										* i_100_);
						if (f_102_ <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						f_103_ = aFloat5274
								+ (aFloat5260 * i_97_ + f_113_ + aFloat5263
										* i_100_);
						if (f_103_ <= aHa_Sub2_5269.anInt4502) {
							return;
						}
					} else {
						f = aFloat5274
								+ (aFloat5260 * i_97_ + f_113_ + aFloat5263
										* i_99_);
						f_101_ = aFloat5274
								+ (aFloat5260 * i_98_ + f_113_ + aFloat5263
										* i_99_);
						f_102_ = aFloat5274
								+ (aFloat5260 * i_98_ + f_113_ + aFloat5263
										* i_100_);
						f_103_ = aFloat5274
								+ (aFloat5260 * i_97_ + f_113_ + aFloat5263
										* i_100_);
					}
					final float f_114_ = aFloat5271 * i_112_;
					final float f_115_ = aFloat5273 * i_112_;
					if (anInt5262 == -1) {
						final float f_116_ = aFloat5268
								+ (aFloat5275 * i_97_ + f_114_ + aFloat5276
										* i_99_);
						i_104_ = (class12.anInt136 + (int) (f_116_
								* (aHa_Sub2_5269.anInt4514) / f));
						final float f_117_ = aFloat5255
								+ (aFloat5264 * i_97_ + f_115_ + aFloat5267
										* i_99_);
						i_105_ = (class12.anInt128 + (int) (f_117_
								* (aHa_Sub2_5269.anInt4490) / f));
						final float f_118_ = aFloat5268
								+ (aFloat5275 * i_98_ + f_114_ + aFloat5276
										* i_99_);
						i_106_ = (class12.anInt136 + (int) (f_118_
								* (aHa_Sub2_5269.anInt4514) / f_101_));
						final float f_119_ = aFloat5255
								+ (aFloat5264 * i_98_ + f_115_ + aFloat5267
										* i_99_);
						i_107_ = (class12.anInt128 + (int) (f_119_
								* (aHa_Sub2_5269.anInt4490) / f_101_));
						final float f_120_ = aFloat5268
								+ (aFloat5275 * i_98_ + f_114_ + aFloat5276
										* i_100_);
						i_108_ = (class12.anInt136 + (int) (f_120_
								* (aHa_Sub2_5269.anInt4514) / f_102_));
						final float f_121_ = aFloat5255
								+ (aFloat5264 * i_98_ + f_115_ + aFloat5267
										* i_100_);
						i_109_ = (class12.anInt128 + (int) (f_121_
								* (aHa_Sub2_5269.anInt4490) / f_102_));
						final float f_122_ = aFloat5268
								+ (aFloat5275 * i_97_ + f_114_ + aFloat5276
										* i_100_);
						i_110_ = (class12.anInt136 + (int) (f_122_
								* (aHa_Sub2_5269.anInt4514) / f_103_));
						final float f_123_ = aFloat5255
								+ (aFloat5264 * i_97_ + f_115_ + aFloat5267
										* i_100_);
						i_111_ = (class12.anInt128 + (int) (f_123_
								* (aHa_Sub2_5269.anInt4490) / f_103_));
					} else {
						final float f_124_ = aFloat5268
								+ (aFloat5275 * i_97_ + f_114_ + aFloat5276
										* i_99_);
						i_104_ = (class12.anInt136 + (int) (f_124_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_125_ = aFloat5255
								+ (aFloat5264 * i_97_ + f_115_ + aFloat5267
										* i_99_);
						i_105_ = (class12.anInt128 + (int) (f_125_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						final float f_126_ = aFloat5268
								+ (aFloat5275 * i_98_ + f_114_ + aFloat5276
										* i_99_);
						i_106_ = (class12.anInt136 + (int) (f_126_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_127_ = aFloat5255
								+ (aFloat5264 * i_98_ + f_115_ + aFloat5267
										* i_99_);
						i_107_ = (class12.anInt128 + (int) (f_127_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						final float f_128_ = aFloat5268
								+ (aFloat5275 * i_98_ + f_114_ + aFloat5276
										* i_100_);
						i_108_ = (class12.anInt136 + (int) (f_128_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_129_ = aFloat5255
								+ (aFloat5264 * i_98_ + f_115_ + aFloat5267
										* i_100_);
						i_109_ = (class12.anInt128 + (int) (f_129_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						final float f_130_ = aFloat5268
								+ (aFloat5275 * i_97_ + f_114_ + aFloat5276
										* i_100_);
						i_110_ = (class12.anInt136 + (int) (f_130_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_131_ = aFloat5255
								+ (aFloat5264 * i_97_ + f_115_ + aFloat5267
										* i_100_);
						i_111_ = (class12.anInt128 + (int) (f_131_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
					}
				} else {
					final int i_132_ = ((s) this).anIntArrayArray2201[i][i_92_];
					final int i_133_ = ((s) this).anIntArrayArray2201[i + 1][i_92_];
					final int i_134_ = ((s) this).anIntArrayArray2201[i + 1][i_92_ + 1];
					final int i_135_ = ((s) this).anIntArrayArray2201[i][i_92_ + 1];
					if (anInt5262 == -1) {
						f = aFloat5274
								+ (aFloat5260 * i_97_ + aFloat5270 * i_132_ + aFloat5263
										* i_99_);
						if (f <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						f_101_ = aFloat5274
								+ (aFloat5260 * i_98_ + aFloat5270 * i_133_ + aFloat5263
										* i_99_);
						if (f_101_ <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						f_102_ = aFloat5274
								+ (aFloat5260 * i_98_ + aFloat5270 * i_134_ + aFloat5263
										* i_100_);
						if (f_102_ <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						f_103_ = aFloat5274
								+ (aFloat5260 * i_97_ + aFloat5270 * i_135_ + aFloat5263
										* i_100_);
						if (f_103_ <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						final float f_136_ = aFloat5268
								+ (aFloat5275 * i_97_ + aFloat5271 * i_132_ + aFloat5276
										* i_99_);
						i_104_ = (class12.anInt136 + (int) (f_136_
								* (aHa_Sub2_5269.anInt4514) / f));
						final float f_137_ = aFloat5255
								+ (aFloat5264 * i_97_ + aFloat5273 * i_132_ + aFloat5267
										* i_99_);
						i_105_ = (class12.anInt128 + (int) (f_137_
								* (aHa_Sub2_5269.anInt4490) / f));
						final float f_138_ = aFloat5268
								+ (aFloat5275 * i_98_ + aFloat5271 * i_133_ + aFloat5276
										* i_99_);
						i_106_ = (class12.anInt136 + (int) (f_138_
								* (aHa_Sub2_5269.anInt4514) / f_101_));
						final float f_139_ = aFloat5255
								+ (aFloat5264 * i_98_ + aFloat5273 * i_133_ + aFloat5267
										* i_99_);
						i_107_ = (class12.anInt128 + (int) (f_139_
								* (aHa_Sub2_5269.anInt4490) / f_101_));
						final float f_140_ = aFloat5268
								+ (aFloat5275 * i_98_ + aFloat5271 * i_134_ + aFloat5276
										* i_100_);
						i_108_ = (class12.anInt136 + (int) (f_140_
								* (aHa_Sub2_5269.anInt4514) / f_102_));
						final float f_141_ = aFloat5255
								+ (aFloat5264 * i_98_ + aFloat5273 * i_134_ + aFloat5267
										* i_100_);
						i_109_ = (class12.anInt128 + (int) (f_141_
								* (aHa_Sub2_5269.anInt4490) / f_102_));
						final float f_142_ = aFloat5268
								+ (aFloat5275 * i_97_ + aFloat5271 * i_135_ + aFloat5276
										* i_100_);
						i_110_ = (class12.anInt136 + (int) (f_142_
								* (aHa_Sub2_5269.anInt4514) / f_103_));
						final float f_143_ = aFloat5255
								+ (aFloat5264 * i_97_ + aFloat5273 * i_135_ + aFloat5267
										* i_100_);
						i_111_ = (class12.anInt128 + (int) (f_143_
								* (aHa_Sub2_5269.anInt4490) / f_103_));
					} else {
						f = aFloat5274
								+ (aFloat5260 * i_97_ + aFloat5270 * i_132_ + aFloat5263
										* i_99_);
						f_101_ = aFloat5274
								+ (aFloat5260 * i_98_ + aFloat5270 * i_133_ + aFloat5263
										* i_99_);
						f_102_ = aFloat5274
								+ (aFloat5260 * i_98_ + aFloat5270 * i_134_ + aFloat5263
										* i_100_);
						f_103_ = aFloat5274
								+ (aFloat5260 * i_97_ + aFloat5270 * i_135_ + aFloat5263
										* i_100_);
						final float f_144_ = aFloat5268
								+ (aFloat5275 * i_97_ + aFloat5271 * i_132_ + aFloat5276
										* i_99_);
						i_104_ = (class12.anInt136 + (int) (f_144_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_145_ = aFloat5255
								+ (aFloat5264 * i_97_ + aFloat5273 * i_132_ + aFloat5267
										* i_99_);
						i_105_ = (class12.anInt128 + (int) (f_145_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						final float f_146_ = aFloat5268
								+ (aFloat5275 * i_98_ + aFloat5271 * i_133_ + aFloat5276
										* i_99_);
						i_106_ = (class12.anInt136 + (int) (f_146_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_147_ = aFloat5255
								+ (aFloat5264 * i_98_ + aFloat5273 * i_133_ + aFloat5267
										* i_99_);
						i_107_ = (class12.anInt128 + (int) (f_147_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						final float f_148_ = aFloat5268
								+ (aFloat5275 * i_98_ + aFloat5271 * i_134_ + aFloat5276
										* i_100_);
						i_108_ = (class12.anInt136 + (int) (f_148_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_149_ = aFloat5255
								+ (aFloat5264 * i_98_ + aFloat5273 * i_134_ + aFloat5267
										* i_100_);
						i_109_ = (class12.anInt128 + (int) (f_149_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						final float f_150_ = aFloat5268
								+ (aFloat5275 * i_97_ + aFloat5271 * i_135_ + aFloat5276
										* i_100_);
						i_110_ = (class12.anInt136 + (int) (f_150_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_151_ = aFloat5255
								+ (aFloat5264 * i_97_ + aFloat5273 * i_135_ + aFloat5267
										* i_100_);
						i_111_ = (class12.anInt128 + (int) (f_151_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
					}
				}
				if (anInt5262 == -1) {
					if (((i_108_ - i_110_) * (i_107_ - i_111_) - (i_109_ - i_111_)
							* (i_106_ - i_110_)) > 0) {
						class12.aBoolean135 = (i_108_ < 0 || i_110_ < 0
								|| i_106_ < 0 || i_108_ > class12.anInt141
								|| i_110_ > class12.anInt141 || i_106_ > class12.anInt141);
						if (class327.aShort2744 >= 0) {
							class12.method212(
									i_109_,
									i_111_,
									i_107_,
									i_108_,
									i_110_,
									i_106_,
									f_102_,
									f_103_,
									f_101_,
									1.0F,
									0.0F,
									1.0F,
									1.0F,
									1.0F,
									0.0F,
									(~0xffffff | (Class221.anIntArray1665[(class327.aShort2745 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class221.anIntArray1665[(class327.aShort2742 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class221.anIntArray1665[(class327.aShort2739 & 0xffff)]) & 0xffffff),
									0, 0, 0, 0, class327.aShort2744);
						} else {
							class12.method216(i_109_, i_111_, i_107_, i_108_,
									i_110_, i_106_, (int) f_102_, (int) f_103_,
									(int) f_101_, class327.aShort2745 & 0xffff,
									class327.aShort2742 & 0xffff,
									class327.aShort2739 & 0xffff);
						}
					}
					if (((i_104_ - i_106_) * (i_111_ - i_107_) - (i_105_ - i_107_)
							* (i_110_ - i_106_)) > 0) {
						class12.aBoolean135 = (i_104_ < 0 || i_106_ < 0
								|| i_110_ < 0 || i_104_ > class12.anInt141
								|| i_106_ > class12.anInt141 || i_110_ > class12.anInt141);
						if (class327.aShort2744 >= 0) {
							class12.method212(
									i_105_,
									i_107_,
									i_111_,
									i_104_,
									i_106_,
									i_110_,
									f,
									f_101_,
									f_103_,
									0.0F,
									1.0F,
									1.0F,
									0.0F,
									0.0F,
									1.0F,
									(~0xffffff | (Class221.anIntArray1665[(class327.aShort2741 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class221.anIntArray1665[(class327.aShort2739 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class221.anIntArray1665[(class327.aShort2742 & 0xffff)]) & 0xffffff),
									0, 0, 0, 0, class327.aShort2744);
						} else {
							class12.method216(i_105_, i_107_, i_111_, i_104_,
									i_106_, i_110_, (int) f, (int) f_101_,
									(int) f_103_, class327.aShort2741 & 0xffff,
									class327.aShort2739 & 0xffff,
									class327.aShort2742 & 0xffff);
						}
					}
				} else {
					if (((i_108_ - i_110_) * (i_107_ - i_111_) - (i_109_ - i_111_)
							* (i_106_ - i_110_)) > 0) {
						class12.aBoolean135 = (i_108_ < 0 || i_110_ < 0
								|| i_106_ < 0 || i_108_ > class12.anInt141
								|| i_110_ > class12.anInt141 || i_106_ > class12.anInt141);
						if (class327.aShort2744 >= 0) {
							class12.method212(
									i_109_,
									i_111_,
									i_107_,
									i_108_,
									i_110_,
									i_106_,
									f_102_,
									f_103_,
									f_101_,
									1.0F,
									0.0F,
									1.0F,
									1.0F,
									1.0F,
									0.0F,
									(~0xffffff | (Class221.anIntArray1665[(class327.aShort2745 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class221.anIntArray1665[(class327.aShort2742 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class221.anIntArray1665[(class327.aShort2739 & 0xffff)]) & 0xffffff),
									0, 0, 0, 0, class327.aShort2744);
						} else {
							class12.method216(i_109_, i_111_, i_107_, i_108_,
									i_110_, i_106_, (int) f_102_, (int) f_103_,
									(int) f_101_, class327.aShort2745 & 0xffff,
									class327.aShort2742 & 0xffff,
									class327.aShort2739 & 0xffff);
						}
					}
					if (((i_104_ - i_106_) * (i_111_ - i_107_) - (i_105_ - i_107_)
							* (i_110_ - i_106_)) > 0) {
						class12.aBoolean135 = (i_104_ < 0 || i_106_ < 0
								|| i_110_ < 0 || i_104_ > class12.anInt141
								|| i_106_ > class12.anInt141 || i_110_ > class12.anInt141);
						if (class327.aShort2744 >= 0) {
							class12.method212(
									i_105_,
									i_107_,
									i_111_,
									i_104_,
									i_106_,
									i_110_,
									f,
									f_101_,
									f_103_,
									0.0F,
									1.0F,
									1.0F,
									0.0F,
									0.0F,
									1.0F,
									(~0xffffff | (Class221.anIntArray1665[(class327.aShort2741 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class221.anIntArray1665[(class327.aShort2739 & 0xffff)]) & 0xffffff),
									(~0xffffff | (Class221.anIntArray1665[(class327.aShort2742 & 0xffff)]) & 0xffffff),
									0, 0, 0, 0, class327.aShort2744);
						} else {
							class12.method216(i_105_, i_107_, i_111_, i_104_,
									i_106_, i_110_, (int) f, (int) f_101_,
									(int) f_103_, class327.aShort2741 & 0xffff,
									class327.aShort2739 & 0xffff,
									class327.aShort2742 & 0xffff);
						}
					}
				}
			}
		} else {
			final Class328 class328 = aClass328ArrayArray5261[i][i_92_];
			if (class328 != null) {
				if (i_96_ != 0) {
					if ((class328.aByte2747 & 0x4) != 0) {
						if ((i_96_ & 0x1) != 0) {
							return;
						}
					} else if ((i_96_ & 0x2) != 0) {
						return;
					}
				}
				if (anInt5262 == -1) {
					for (int i_152_ = 0; i_152_ < class328.aShort2748; i_152_++) {
						final int i_153_ = (class328.aShortArray2755[i_152_] + (i << ((s) this).anInt2200));
						final short i_154_ = class328.aShortArray2754[i_152_];
						final int i_155_ = (class328.aShortArray2757[i_152_] + (i_92_ << ((s) this).anInt2200));
						final float f = aFloat5274
								+ (aFloat5260 * i_153_ + aFloat5270 * i_154_ + aFloat5263
										* i_155_);
						if (f <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						final float f_156_ = aFloat5268
								+ (aFloat5275 * i_153_ + aFloat5271 * i_154_ + aFloat5276
										* i_155_);
						final float f_157_ = aFloat5255
								+ (aFloat5264 * i_153_ + aFloat5273 * i_154_ + aFloat5267
										* i_155_);
						is[i_152_] = (class12.anInt136 + (int) (f_156_
								* (aHa_Sub2_5269.anInt4514) / f));
						is_93_[i_152_] = (class12.anInt128 + (int) (f_157_
								* (aHa_Sub2_5269.anInt4490) / f));
						is_94_[i_152_] = (int) f;
					}
				} else {
					for (int i_158_ = 0; i_158_ < class328.aShort2748; i_158_++) {
						final int i_159_ = (class328.aShortArray2755[i_158_] + (i << ((s) this).anInt2200));
						final short i_160_ = class328.aShortArray2754[i_158_];
						final int i_161_ = (class328.aShortArray2757[i_158_] + (i_92_ << ((s) this).anInt2200));
						final float f = aFloat5274
								+ (aFloat5260 * i_159_ + aFloat5270 * i_160_ + aFloat5263
										* i_161_);
						final float f_162_ = aFloat5268
								+ (aFloat5275 * i_159_ + aFloat5271 * i_160_ + aFloat5276
										* i_161_);
						final float f_163_ = aFloat5255
								+ (aFloat5264 * i_159_ + aFloat5273 * i_160_ + aFloat5267
										* i_161_);
						is[i_158_] = (class12.anInt136 + (int) (f_162_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						is_93_[i_158_] = (class12.anInt128 + (int) (f_163_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						is_94_[i_158_] = (int) f;
					}
				}
				if (class328.aShortArray2752 != null) {
					if (anInt5262 == -1) {
						for (int i_164_ = 0; i_164_ < class328.aShort2746; i_164_++) {
							final short i_165_ = (class328.aShortArray2758[i_164_]);
							final short i_166_ = (class328.aShortArray2751[i_164_]);
							final short i_167_ = (class328.aShortArray2759[i_164_]);
							final int i_168_ = is[i_165_];
							final int i_169_ = is[i_166_];
							final int i_170_ = is[i_167_];
							final int i_171_ = is_93_[i_165_];
							final int i_172_ = is_93_[i_166_];
							final int i_173_ = is_93_[i_167_];
							if (((i_168_ - i_169_) * (i_173_ - i_172_) - (i_171_ - i_172_)
									* (i_170_ - i_169_)) > 0) {
								class12.aBoolean135 = (i_168_ < 0 || i_169_ < 0
										|| i_170_ < 0
										|| i_168_ > class12.anInt141
										|| i_169_ > class12.anInt141 || (i_170_ > class12.anInt141));
								final short i_174_ = (class328.aShortArray2752[i_164_]);
								if (i_174_ != -1) {
									class12.method212(
											i_171_,
											i_172_,
											i_173_,
											i_168_,
											i_169_,
											i_170_,
											is_94_[i_165_],
											is_94_[i_166_],
											is_94_[i_167_],
											((float) (class328.aShortArray2755[i_165_]) / (float) ((s) this).anInt2206),
											((float) (class328.aShortArray2755[i_166_]) / (float) ((s) this).anInt2206),
											((float) (class328.aShortArray2755[i_167_]) / (float) ((s) this).anInt2206),
											((float) (class328.aShortArray2757[i_165_]) / (float) ((s) this).anInt2206),
											((float) (class328.aShortArray2757[i_166_]) / (float) ((s) this).anInt2206),
											((float) (class328.aShortArray2757[i_167_]) / (float) ((s) this).anInt2206),
											~0xffffff
													| ((Class221.anIntArray1665[(class328.aShortArray2750[i_165_]) & 0xffff]) & 0xffffff),
											~0xffffff
													| ((Class221.anIntArray1665[(class328.aShortArray2750[i_166_]) & 0xffff]) & 0xffffff),
											~0xffffff
													| ((Class221.anIntArray1665[(class328.aShortArray2750[i_167_]) & 0xffff]) & 0xffffff),
											0, 0, 0, 0, i_174_);
								} else {
									final int i_175_ = (class328.anIntArray2749[i_164_]);
									if (i_175_ != -1) {
										class12.method216(
												i_171_,
												i_172_,
												i_173_,
												i_168_,
												i_169_,
												i_170_,
												is_94_[i_165_],
												is_94_[i_166_],
												is_94_[i_167_],
												(Class246_Sub7
														.method3132(
																(class328.aShortArray2750[i_165_]),
																(byte) 118,
																i_175_)),
												(Class246_Sub7
														.method3132(
																(class328.aShortArray2750[i_166_]),
																(byte) 118,
																i_175_)),
												(Class246_Sub7
														.method3132(
																(class328.aShortArray2750[i_167_]),
																(byte) 118,
																i_175_)));
									}
								}
							}
						}
					} else {
						for (int i_176_ = 0; i_176_ < class328.aShort2746; i_176_++) {
							final short i_177_ = (class328.aShortArray2758[i_176_]);
							final short i_178_ = (class328.aShortArray2751[i_176_]);
							final short i_179_ = (class328.aShortArray2759[i_176_]);
							final int i_180_ = is[i_177_];
							final int i_181_ = is[i_178_];
							final int i_182_ = is[i_179_];
							final int i_183_ = is_93_[i_177_];
							final int i_184_ = is_93_[i_178_];
							final int i_185_ = is_93_[i_179_];
							if (((i_180_ - i_181_) * (i_185_ - i_184_) - (i_183_ - i_184_)
									* (i_182_ - i_181_)) > 0) {
								class12.aBoolean135 = (i_180_ < 0 || i_181_ < 0
										|| i_182_ < 0
										|| i_180_ > class12.anInt141
										|| i_181_ > class12.anInt141 || (i_182_ > class12.anInt141));
								final short i_186_ = (class328.aShortArray2752[i_176_]);
								if (i_186_ != -1) {
									class12.method212(
											i_183_,
											i_184_,
											i_185_,
											i_180_,
											i_181_,
											i_182_,
											is_94_[i_177_],
											is_94_[i_178_],
											is_94_[i_179_],
											((float) (class328.aShortArray2755[i_177_]) / (float) ((s) this).anInt2206),
											((float) (class328.aShortArray2755[i_178_]) / (float) ((s) this).anInt2206),
											((float) (class328.aShortArray2755[i_179_]) / (float) ((s) this).anInt2206),
											((float) (class328.aShortArray2757[i_177_]) / (float) ((s) this).anInt2206),
											((float) (class328.aShortArray2757[i_178_]) / (float) ((s) this).anInt2206),
											((float) (class328.aShortArray2757[i_179_]) / (float) ((s) this).anInt2206),
											~0xffffff
													| ((Class221.anIntArray1665[(class328.aShortArray2750[i_177_]) & 0xffff]) & 0xffffff),
											~0xffffff
													| ((Class221.anIntArray1665[(class328.aShortArray2750[i_178_]) & 0xffff]) & 0xffffff),
											~0xffffff
													| ((Class221.anIntArray1665[(class328.aShortArray2750[i_179_]) & 0xffff]) & 0xffffff),
											0, 0, 0, 0, i_186_);
								} else {
									final int i_187_ = (class328.anIntArray2749[i_176_]);
									if (i_187_ != -1) {
										class12.method216(
												i_183_,
												i_184_,
												i_185_,
												i_180_,
												i_181_,
												i_182_,
												is_94_[i_177_],
												is_94_[i_178_],
												is_94_[i_179_],
												(Class246_Sub7
														.method3132(
																(class328.aShortArray2750[i_177_]),
																(byte) 118,
																i_187_)),
												(Class246_Sub7
														.method3132(
																(class328.aShortArray2750[i_178_]),
																(byte) 118,
																i_187_)),
												(Class246_Sub7
														.method3132(
																(class328.aShortArray2750[i_179_]),
																(byte) 118,
																i_187_)));
									}
								}
							}
						}
					}
				} else {
					for (int i_188_ = 0; i_188_ < class328.aShort2746; i_188_++) {
						final short i_189_ = class328.aShortArray2758[i_188_];
						final short i_190_ = class328.aShortArray2751[i_188_];
						final short i_191_ = class328.aShortArray2759[i_188_];
						final int i_192_ = is[i_189_];
						final int i_193_ = is[i_190_];
						final int i_194_ = is[i_191_];
						final int i_195_ = is_93_[i_189_];
						final int i_196_ = is_93_[i_190_];
						final int i_197_ = is_93_[i_191_];
						if (((i_192_ - i_193_) * (i_197_ - i_196_) - (i_195_ - i_196_)
								* (i_194_ - i_193_)) > 0) {
							final int i_198_ = class328.anIntArray2749[i_188_];
							if (i_198_ != -1) {
								class12.aBoolean135 = (i_192_ < 0 || i_193_ < 0
										|| i_194_ < 0
										|| i_192_ > class12.anInt141
										|| i_193_ > class12.anInt141 || (i_194_ > class12.anInt141));
								class12.method216(
										i_195_,
										i_196_,
										i_197_,
										i_192_,
										i_193_,
										i_194_,
										is_94_[i_189_],
										is_94_[i_190_],
										is_94_[i_191_],
										(Class246_Sub7
												.method3132(
														(class328.aShortArray2750[i_189_]),
														(byte) 118, i_198_)),
										(Class246_Sub7
												.method3132(
														(class328.aShortArray2750[i_190_]),
														(byte) 118, i_198_)),
										(Class246_Sub7
												.method3132(
														(class328.aShortArray2750[i_191_]),
														(byte) 118, i_198_)));
							}
						}
					}
				}
			}
		}
	}

	@Override
	final boolean method3418(final r var_r, final int i, final int i_199_,
			final int i_200_, final int i_201_, final boolean bool) {
		return false;
	}

	private final boolean method3441(final int i) {
		if ((anInt5256 & 0x8) == 0) {
			return false;
		}
		if (i == 4) {
			return true;
		}
		if (i == 8) {
			return true;
		}
		if (i == 9) {
			return true;
		}
		return false;
	}

	@Override
	final void method3425(final int i, final int i_202_) {
		method3443(i, i_202_, 0);
	}

	@Override
	final void U(final int i, final int i_203_, final int[] is,
			final int[] is_204_, final int[] is_205_, final int[] is_206_,
			final int[] is_207_, final int[] is_208_, final int[] is_209_,
			final int[] is_210_, final int i_211_, final int i_212_,
			final int i_213_, final boolean bool) {
		final boolean bool_214_ = (anInt5256 & 0x20) == 0;
		if (aClass193ArrayArray5272 == null && !bool_214_) {
			aClass193ArrayArray5272 = new Class193[((s) this).anInt2203][((s) this).anInt2204];
			aClass285ArrayArray5258 = new Class285[((s) this).anInt2203][((s) this).anInt2204];
		} else if (aClass120ArrayArray5266 == null && bool_214_) {
			aClass120ArrayArray5266 = new Class120[((s) this).anInt2203][((s) this).anInt2204];
		} else if (aClass327ArrayArray5265 != null) {
			throw new IllegalStateException();
		}
		if (is != null && is.length != 0) {
			for (int i_215_ = 0; i_215_ < is_207_.length; i_215_++) {
				if (is_207_[i_215_] == -1) {
					is_207_[i_215_] = 0;
				} else {
					is_207_[i_215_] = (Class221.anIntArray1665[(Class111_Sub2
							.method2117(is_207_[i_215_], -67) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (is_208_ != null) {
				for (int i_216_ = 0; i_216_ < is_208_.length; i_216_++) {
					if (is_208_[i_216_] == -1) {
						is_208_[i_216_] = 0;
					} else {
						is_208_[i_216_] = (Class221.anIntArray1665[(Class111_Sub2
								.method2117(is_208_[i_216_], 57) & 0xffff)]) << 8 | 0xff;
					}
				}
			}
			if (bool_214_) {
				final Class120 class120 = new Class120();
				class120.aShort994 = (short) is.length;
				class120.aShort991 = (short) (is.length / 3);
				class120.aShortArray995 = new short[class120.aShort994];
				class120.aShortArray996 = new short[class120.aShort994];
				class120.aShortArray992 = new short[class120.aShort994];
				class120.anIntArray999 = new int[class120.aShort994];
				class120.aShortArray998 = new short[class120.aShort994];
				class120.aShortArray990 = new short[class120.aShort994];
				class120.aByteArray1000 = new byte[class120.aShort994];
				if (is_206_ != null) {
					class120.aShortArray993 = new short[class120.aShort994];
				}
				for (int i_217_ = 0; i_217_ < class120.aShort994; i_217_++) {
					final int i_218_ = is[i_217_];
					final int i_219_ = is_205_[i_217_];
					int i_221_;
					if (i_218_ == 0 && i_219_ == 0) {
						i_221_ = (aByteArrayArray5257[i][i_203_] - aByteArrayArray5259[i][i_203_]);
					} else if (i_218_ == 0 && i_219_ == ((s) this).anInt2206) {
						i_221_ = (aByteArrayArray5257[i][i_203_ + 1] - aByteArrayArray5259[i][i_203_ + 1]);
					} else if (i_218_ == ((s) this).anInt2206
							&& i_219_ == ((s) this).anInt2206) {
						i_221_ = (aByteArrayArray5257[i + 1][i_203_ + 1] - aByteArrayArray5259[i + 1][i_203_ + 1]);
					} else if (i_218_ == ((s) this).anInt2206 && i_219_ == 0) {
						i_221_ = (aByteArrayArray5257[i + 1][i_203_] - aByteArrayArray5259[i + 1][i_203_]);
					} else {
						final int i_222_ = (((aByteArrayArray5257[i][i_203_] - aByteArrayArray5259[i][i_203_]) * (((s) this).anInt2206 - i_218_)) + ((aByteArrayArray5257[i + 1][i_203_] - aByteArrayArray5259[i + 1][i_203_]) * i_218_));
						final int i_223_ = (((aByteArrayArray5257[i][i_203_ + 1] - aByteArrayArray5259[i][i_203_ + 1]) * (((s) this).anInt2206 - i_218_)) + ((aByteArrayArray5257[i + 1][i_203_ + 1] - aByteArrayArray5259[i + 1][i_203_ + 1]) * i_218_));
						i_221_ = (i_222_ * (((s) this).anInt2206 - i_219_) + i_223_
								* i_219_) >> 2 * ((s) this).anInt2200;
					}
					final int i_224_ = (i << ((s) this).anInt2200) + i_218_;
					final int i_225_ = (i_203_ << ((s) this).anInt2200)
							+ i_219_;
					class120.aShortArray995[i_217_] = (short) i_218_;
					class120.aShortArray992[i_217_] = (short) i_219_;
					class120.aShortArray996[i_217_] = (short) (method3417(
							i_224_, i_225_, true) + (is_204_ != null ? is_204_[i_217_]
							: 0));
					if (i_221_ < 0) {
						i_221_ = 0;
					}
					if (is_207_[i_217_] == 0) {
						class120.anIntArray999[i_217_] = 0;
						if (is_208_ != null) {
							class120.aByteArray1000[i_217_] = (byte) i_221_;
						}
					} else {
						int i_226_ = 0;
						if (is_206_ != null) {
							final int i_227_ = (class120.aShortArray993[i_217_] = (short) is_206_[i_217_]);
							if (i_212_ != 0) {
								i_226_ = 255 * i_227_ / i_212_;
								if (i_226_ < 0) {
									i_226_ = 0;
								} else if (i_226_ > 255) {
									i_226_ = 255;
								}
							}
						}
						int i_228_ = -16777216;
						if (is_209_[i_217_] != -1
								&& method3441((((ha) aHa_Sub2_5269).aD938
										.method11(is_209_[i_217_], -28755)).aByte1820)) {
							i_228_ = -1694498816;
						}
						class120.anIntArray999[i_217_] = (i_228_ | Class215
								.method2790(
										127,
										i_226_,
										method3439(((is_207_[i_217_]) >> 8),
												i_221_), i_211_));
						if (is_208_ != null) {
							class120.aByteArray1000[i_217_] = (byte) i_221_;
						}
					}
					class120.aShortArray998[i_217_] = (short) is_209_[i_217_];
					class120.aShortArray990[i_217_] = (short) is_210_[i_217_];
				}
				if (is_208_ != null) {
					class120.anIntArray997 = new int[class120.aShort991];
				}
				for (int i_229_ = 0; i_229_ < class120.aShort991; i_229_++) {
					final int i_230_ = i_229_ * 3;
					if (is_208_ != null && is_208_[i_230_] != 0) {
						class120.anIntArray997[i_229_] = ~0xffffff
								| is_208_[i_230_] >> 8;
					}
				}
				aClass120ArrayArray5266[i][i_203_] = class120;
			} else {
				boolean bool_231_ = true;
				int i_232_ = -1;
				int i_233_ = -1;
				int i_234_ = -1;
				int i_235_ = -1;
				if (is.length == 6) {
					for (int i_236_ = 0; i_236_ < 6; i_236_++) {
						if (is[i_236_] == 0 && is_205_[i_236_] == 0) {
							if (i_232_ != -1
									&& is_207_[i_232_] != is_207_[i_236_]) {
								bool_231_ = false;
								break;
							}
							i_232_ = i_236_;
						} else if (is[i_236_] == ((s) this).anInt2206
								&& is_205_[i_236_] == 0) {
							if (i_233_ != -1
									&& is_207_[i_233_] != is_207_[i_236_]) {
								bool_231_ = false;
								break;
							}
							i_233_ = i_236_;
						} else if (is[i_236_] == ((s) this).anInt2206
								&& (is_205_[i_236_] == ((s) this).anInt2206)) {
							if (i_234_ != -1
									&& is_207_[i_234_] != is_207_[i_236_]) {
								bool_231_ = false;
								break;
							}
							i_234_ = i_236_;
						} else if (is[i_236_] == 0
								&& (is_205_[i_236_] == ((s) this).anInt2206)) {
							if (i_235_ != -1
									&& is_207_[i_235_] != is_207_[i_236_]) {
								bool_231_ = false;
								break;
							}
							i_235_ = i_236_;
						}
					}
					if (i_232_ == -1 || i_233_ == -1 || i_234_ == -1
							|| i_235_ == -1) {
						bool_231_ = false;
					}
					if (bool_231_) {
						if (is_204_ != null) {
							for (int i_237_ = 0; i_237_ < 4; i_237_++) {
								if (is_204_[i_237_] != 0) {
									bool_231_ = false;
									break;
								}
							}
						}
						if (bool_231_) {
							for (int i_238_ = 1; i_238_ < 4; i_238_++) {
								if (is[i_238_] != is[0]
										&& (is[i_238_] != is[0]
												+ ((s) this).anInt2206)
										&& (is[i_238_] != is[0]
												- ((s) this).anInt2206)) {
									bool_231_ = false;
									break;
								}
								if (is_205_[i_238_] != is_205_[0]
										&& (is_205_[i_238_] != is_205_[0]
												+ ((s) this).anInt2206)
										&& (is_205_[i_238_] != (is_205_[0] - ((s) this).anInt2206))) {
									bool_231_ = false;
									break;
								}
							}
						}
					}
				} else {
					bool_231_ = false;
				}
				if (bool_231_) {
					final Class193 class193 = new Class193();
					final int i_239_ = is_207_[0];
					final int i_240_ = is_209_[0];
					if (is_208_ != null) {
						class193.anInt1494 = is_208_[0] >> 8;
						if (i_239_ == 0) {
							class193.aByte1492 |= 0x2;
						}
					} else if (i_239_ == 0) {
						return;
					}
					if ((((s) this).anIntArrayArray2201[i][i_203_] == ((s) this).anIntArrayArray2201[i + 1][i_203_])
							&& (((s) this).anIntArrayArray2201[i][i_203_] == (((s) this).anIntArrayArray2201[i + 1][i_203_ + 1]))
							&& (((s) this).anIntArrayArray2201[i][i_203_] == ((s) this).anIntArrayArray2201[i][i_203_ + 1])) {
						class193.aByte1492 |= 0x1;
					}
					if (i_240_ != -1
							&& (class193.aByte1492 & 0x2) == 0
							&& !(((ha) aHa_Sub2_5269).aD938.method11(i_240_,
									-28755).aBoolean1825)) {
						int i_241_;
						if (is_206_ != null && i_212_ != 0) {
							i_241_ = 255 * is_206_[i_232_] / i_212_;
							if (i_241_ < 0) {
								i_241_ = 0;
							} else if (i_241_ > 255) {
								i_241_ = 255;
							}
						} else {
							i_241_ = 0;
						}
						class193.anInt1490 = (Class215
								.method2790(
										127,
										i_241_,
										method3439(
												is_207_[i_232_] >> 8,
												(aByteArrayArray5257[i][i_203_] - aByteArrayArray5259[i][i_203_])),
										i_211_));
						if (class193.anInt1494 != 0) {
							class193.anInt1490 |= (255 - (aByteArrayArray5257[i][i_203_] - aByteArrayArray5259[i][i_203_]) << 25);
						}
						if (is_206_ != null && i_212_ != 0) {
							i_241_ = 255 * is_206_[i_233_] / i_212_;
							if (i_241_ < 0) {
								i_241_ = 0;
							} else if (i_241_ > 255) {
								i_241_ = 255;
							}
						} else {
							i_241_ = 0;
						}
						class193.anInt1491 = (Class215
								.method2790(
										126,
										i_241_,
										method3439(
												is_207_[i_233_] >> 8,
												(aByteArrayArray5257[i + 1][i_203_] - (aByteArrayArray5259[i + 1][i_203_]))),
										i_211_));
						if (class193.anInt1494 != 0) {
							class193.anInt1491 |= 255 - (aByteArrayArray5257[i + 1][i_203_] - (aByteArrayArray5259[i + 1][i_203_])) << 25;
						}
						if (is_206_ != null && i_212_ != 0) {
							i_241_ = 255 * is_206_[i_234_] / i_212_;
							if (i_241_ < 0) {
								i_241_ = 0;
							} else if (i_241_ > 255) {
								i_241_ = 255;
							}
						} else {
							i_241_ = 0;
						}
						class193.anInt1493 = (Class215
								.method2790(
										127,
										i_241_,
										method3439(
												is_207_[i_234_] >> 8,
												((aByteArrayArray5257[i + 1][i_203_ + 1]) - (aByteArrayArray5259[i + 1][i_203_ + 1]))),
										i_211_));
						if (class193.anInt1494 != 0) {
							class193.anInt1493 |= (255 - (aByteArrayArray5257[i + 1][i_203_ + 1] - (aByteArrayArray5259[i + 1][i_203_ + 1]))) << 25;
						}
						if (is_206_ != null && i_212_ != 0) {
							i_241_ = 255 * is_206_[i_235_] / i_212_;
							if (i_241_ < 0) {
								i_241_ = 0;
							} else if (i_241_ > 255) {
								i_241_ = 255;
							}
						} else {
							i_241_ = 0;
						}
						class193.anInt1484 = (Class215
								.method2790(
										126,
										i_241_,
										method3439(
												is_207_[i_235_] >> 8,
												(aByteArrayArray5257[i][i_203_ + 1] - (aByteArrayArray5259[i][i_203_ + 1]))),
										i_211_));
						class193.aShort1487 = (short) i_240_;
					} else {
						int i_242_;
						if (is_206_ != null && i_212_ != 0) {
							i_242_ = 255 * is_206_[i_232_] / i_212_;
							if (i_242_ < 0) {
								i_242_ = 0;
							} else if (i_242_ > 255) {
								i_242_ = 255;
							}
						} else {
							i_242_ = 0;
						}
						class193.anInt1490 = (Class215
								.method2790(
										126,
										i_242_,
										method3439(
												is_207_[i_232_] >> 8,
												(aByteArrayArray5257[i][i_203_] - aByteArrayArray5259[i][i_203_])),
										i_211_));
						if (class193.anInt1494 != 0) {
							class193.anInt1490 |= (255 - (aByteArrayArray5257[i][i_203_] - aByteArrayArray5259[i][i_203_]) << 25);
						}
						if (is_206_ != null && i_212_ != 0) {
							i_242_ = 255 * is_206_[i_233_] / i_212_;
							if (i_242_ < 0) {
								i_242_ = 0;
							} else if (i_242_ > 255) {
								i_242_ = 255;
							}
						} else {
							i_242_ = 0;
						}
						class193.anInt1491 = (Class215
								.method2790(
										126,
										i_242_,
										method3439(
												is_207_[i_233_] >> 8,
												(aByteArrayArray5257[i + 1][i_203_] - (aByteArrayArray5259[i + 1][i_203_]))),
										i_211_));
						if (class193.anInt1494 != 0) {
							class193.anInt1491 |= 255 - (aByteArrayArray5257[i + 1][i_203_] - (aByteArrayArray5259[i + 1][i_203_])) << 25;
						}
						if (is_206_ != null && i_212_ != 0) {
							i_242_ = 255 * is_206_[i_234_] / i_212_;
							if (i_242_ < 0) {
								i_242_ = 0;
							} else if (i_242_ > 255) {
								i_242_ = 255;
							}
						} else {
							i_242_ = 0;
						}
						class193.anInt1493 = (Class215
								.method2790(
										126,
										i_242_,
										method3439(
												is_207_[i_234_] >> 8,
												((aByteArrayArray5257[i + 1][i_203_ + 1]) - (aByteArrayArray5259[i + 1][i_203_ + 1]))),
										i_211_));
						if (class193.anInt1494 != 0) {
							class193.anInt1493 |= (255 - (aByteArrayArray5257[i + 1][i_203_ + 1] - (aByteArrayArray5259[i + 1][i_203_ + 1]))) << 25;
						}
						if (is_206_ != null && i_212_ != 0) {
							i_242_ = 255 * is_206_[i_235_] / i_212_;
							if (i_242_ < 0) {
								i_242_ = 0;
							} else if (i_242_ > 255) {
								i_242_ = 255;
							}
						} else {
							i_242_ = 0;
						}
						class193.anInt1484 = (Class215
								.method2790(
										127,
										i_242_,
										method3439(
												is_207_[i_235_] >> 8,
												(aByteArrayArray5257[i][i_203_ + 1] - (aByteArrayArray5259[i][i_203_ + 1]))),
										i_211_));
						if (class193.anInt1494 != 0) {
							class193.anInt1484 |= 255 - (aByteArrayArray5257[i][i_203_ + 1] - (aByteArrayArray5259[i][i_203_ + 1])) << 25;
						}
						class193.aShort1487 = (short) -1;
					}
					if (is_206_ != null) {
						class193.aShort1486 = (short) is_206_[i_234_];
						class193.aShort1488 = (short) is_206_[i_235_];
						class193.aShort1485 = (short) is_206_[i_233_];
						class193.aShort1489 = (short) is_206_[i_232_];
					}
					aClass193ArrayArray5272[i][i_203_] = class193;
				} else {
					final Class285 class285 = new Class285();
					class285.aShort2174 = (short) is.length;
					class285.aShort2171 = (short) (is.length / 3);
					class285.aShortArray2176 = new short[class285.aShort2174];
					class285.aShortArray2179 = new short[class285.aShort2174];
					class285.aShortArray2170 = new short[class285.aShort2174];
					class285.anIntArray2173 = new int[class285.aShort2174];
					if (is_206_ != null) {
						class285.aShortArray2178 = new short[class285.aShort2174];
					}
					for (int i_243_ = 0; i_243_ < class285.aShort2174; i_243_++) {
						final int i_244_ = is[i_243_];
						final int i_245_ = is_205_[i_243_];
						int i_247_;
						if (i_244_ == 0 && i_245_ == 0) {
							i_247_ = (aByteArrayArray5257[i][i_203_] - aByteArrayArray5259[i][i_203_]);
						} else if (i_244_ == 0
								&& i_245_ == ((s) this).anInt2206) {
							i_247_ = (aByteArrayArray5257[i][i_203_ + 1] - aByteArrayArray5259[i][i_203_ + 1]);
						} else if (i_244_ == ((s) this).anInt2206
								&& i_245_ == ((s) this).anInt2206) {
							i_247_ = (aByteArrayArray5257[i + 1][i_203_ + 1] - aByteArrayArray5259[i + 1][i_203_ + 1]);
						} else if (i_244_ == ((s) this).anInt2206
								&& i_245_ == 0) {
							i_247_ = (aByteArrayArray5257[i + 1][i_203_] - aByteArrayArray5259[i + 1][i_203_]);
						} else {
							final int i_248_ = (((aByteArrayArray5257[i][i_203_] - aByteArrayArray5259[i][i_203_]) * (((s) this).anInt2206 - i_244_)) + ((aByteArrayArray5257[i + 1][i_203_] - aByteArrayArray5259[i + 1][i_203_]) * i_244_));
							final int i_249_ = (((aByteArrayArray5257[i][i_203_ + 1] - aByteArrayArray5259[i][i_203_ + 1]) * (((s) this).anInt2206 - i_244_)) + (aByteArrayArray5257[i + 1][i_203_ + 1] - (aByteArrayArray5259[i + 1][i_203_ + 1]))
									* i_244_);
							i_247_ = ((i_248_ * (((s) this).anInt2206 - i_245_) + i_249_
									* i_245_) >> 2 * ((s) this).anInt2200);
						}
						final int i_250_ = (i << ((s) this).anInt2200) + i_244_;
						final int i_251_ = (i_203_ << ((s) this).anInt2200)
								+ i_245_;
						class285.aShortArray2176[i_243_] = (short) i_244_;
						class285.aShortArray2170[i_243_] = (short) i_245_;
						class285.aShortArray2179[i_243_] = (short) (method3417(
								i_250_, i_251_, true) + (is_204_ != null ? is_204_[i_243_]
								: 0));
						if (i_247_ < 0) {
							i_247_ = 0;
						}
						if (is_207_[i_243_] == 0) {
							if (is_208_ != null) {
								class285.anIntArray2173[i_243_] = i_247_ << 25;
							} else {
								class285.anIntArray2173[i_243_] = 0;
							}
						} else {
							int i_252_ = 0;
							if (is_206_ != null) {
								final int i_253_ = (class285.aShortArray2178[i_243_] = (short) is_206_[i_243_]);
								if (i_212_ != 0) {
									i_252_ = 255 * i_253_ / i_212_;
									if (i_252_ < 0) {
										i_252_ = 0;
									} else if (i_252_ > 255) {
										i_252_ = 255;
									}
								}
							}
							class285.anIntArray2173[i_243_] = Class215
									.method2790(
											126,
											i_252_,
											method3439(
													((is_207_[i_243_]) >> 8),
													i_247_), i_211_);
							if (is_208_ != null) {
								class285.anIntArray2173[i_243_] |= i_247_ << 25;
							}
						}
					}
					boolean bool_254_ = false;
					for (int i_255_ = 0; i_255_ < class285.aShort2171; i_255_++) {
						if (is_209_[i_255_ * 3] != -1
								&& !(((ha) aHa_Sub2_5269).aD938.method11(
										is_209_[i_255_ * 3], -28755).aBoolean1825)) {
							bool_254_ = true;
						}
					}
					if (is_208_ != null) {
						class285.anIntArray2175 = new int[class285.aShort2171];
					}
					if (bool_254_) {
						class285.aShortArray2169 = new short[class285.aShort2171];
						class285.aShortArray2177 = new short[class285.aShort2171];
					}
					for (int i_256_ = 0; i_256_ < class285.aShort2171; i_256_++) {
						final int i_257_ = i_256_ * 3;
						if (is_208_ != null && is_208_[i_257_] != 0) {
							class285.anIntArray2175[i_256_] = is_208_[i_257_] >> 8;
						}
						if (bool_254_) {
							final int i_258_ = i_257_ + 1;
							final int i_259_ = i_258_ + 1;
							boolean bool_260_ = false;
							boolean bool_261_ = true;
							int i_262_ = is_209_[i_257_];
							if (i_262_ == -1
									|| (((ha) aHa_Sub2_5269).aD938.method11(
											i_262_, -28755).aBoolean1825)) {
								bool_261_ = false;
							} else {
								bool_260_ = true;
							}
							i_262_ = is_209_[i_258_];
							if (i_262_ == -1
									|| (((ha) aHa_Sub2_5269).aD938.method11(
											i_262_, -28755).aBoolean1825)) {
								bool_261_ = false;
							} else {
								bool_260_ = true;
							}
							i_262_ = is_209_[i_259_];
							if (i_262_ == -1
									|| (((ha) aHa_Sub2_5269).aD938.method11(
											i_262_, -28755).aBoolean1825)) {
								bool_261_ = false;
							} else {
								bool_260_ = true;
							}
							if (bool_261_) {
								class285.aShortArray2169[i_256_] = (short) i_262_;
								class285.aShortArray2177[i_256_] = (short) is_210_[i_257_];
							} else {
								if (bool_260_) {
									i_262_ = is_209_[i_257_];
									if (i_262_ != -1
											&& !(((ha) aHa_Sub2_5269).aD938
													.method11(i_262_, -28755).aBoolean1825)) {
										class285.anIntArray2173[i_257_] = (Class221.anIntArray1665[(Class111_Sub2
												.method2117(
														((((ha) aHa_Sub2_5269).aD938
																.method11(
																		i_262_,
																		-28755)).aShort1831) & 0xffff,
														109)) & 0xffff]);
									}
									i_262_ = is_209_[i_258_];
									if (i_262_ != -1
											&& !(((ha) aHa_Sub2_5269).aD938
													.method11(i_262_, -28755).aBoolean1825)) {
										class285.anIntArray2173[i_258_] = (Class221.anIntArray1665[(Class111_Sub2
												.method2117(
														((((ha) aHa_Sub2_5269).aD938
																.method11(
																		i_262_,
																		-28755)).aShort1831) & 0xffff,
														-51)) & 0xffff]);
									}
									i_262_ = is_209_[i_259_];
									if (i_262_ != -1
											&& !(((ha) aHa_Sub2_5269).aD938
													.method11(i_262_, -28755).aBoolean1825)) {
										class285.anIntArray2173[i_259_] = (Class221.anIntArray1665[(Class111_Sub2
												.method2117(
														((((ha) aHa_Sub2_5269).aD938
																.method11(
																		i_262_,
																		-28755)).aShort1831) & 0xffff,
														115)) & 0xffff]);
									}
								}
								class285.aShortArray2169[i_256_] = (short) -1;
							}
						}
					}
					aClass285ArrayArray5258[i][i_203_] = class285;
				}
			}
		}
	}

	private final void method3442(final int i, final int i_263_,
			final boolean bool, final Class235 class235, final Class12 class12,
			final int[] is, final int[] is_264_, final int[] is_265_,
			final int[] is_266_, final int i_267_) {
		final Class193 class193 = aClass193ArrayArray5272[i][i_263_];
		if (class193 != null) {
			if ((class193.aByte1492 & 0x2) == 0) {
				if (i_267_ != 0) {
					if ((class193.aByte1492 & 0x4) != 0) {
						if ((i_267_ & 0x1) != 0) {
							return;
						}
					} else if ((i_267_ & 0x2) != 0) {
						return;
					}
				}
				final int i_268_ = i * ((s) this).anInt2206;
				final int i_269_ = i_268_ + ((s) this).anInt2206;
				final int i_270_ = i_263_ * ((s) this).anInt2206;
				final int i_271_ = i_270_ + ((s) this).anInt2206;
				int i_272_ = 0;
				int i_273_ = 0;
				int i_274_ = 0;
				int i_275_ = 0;
				float f;
				float f_276_;
				float f_277_;
				float f_278_;
				int i_279_;
				int i_280_;
				int i_281_;
				int i_282_;
				int i_283_;
				int i_284_;
				int i_285_;
				int i_286_;
				if ((class193.aByte1492 & 0x1) != 0 && !bool) {
					final int i_287_ = ((s) this).anIntArrayArray2201[i][i_263_];
					final float f_288_ = aFloat5270 * i_287_;
					if (anInt5262 == -1) {
						f = aFloat5274
								+ (aFloat5260 * i_268_ + f_288_ + aFloat5263
										* i_270_);
						if (f <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						f_276_ = aFloat5274
								+ (aFloat5260 * i_269_ + f_288_ + aFloat5263
										* i_270_);
						if (f_276_ <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						f_277_ = aFloat5274
								+ (aFloat5260 * i_269_ + f_288_ + aFloat5263
										* i_271_);
						if (f_277_ <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						f_278_ = aFloat5274
								+ (aFloat5260 * i_268_ + f_288_ + aFloat5263
										* i_271_);
						if (f_278_ <= aHa_Sub2_5269.anInt4502) {
							return;
						}
					} else {
						f = aFloat5274
								+ (aFloat5260 * i_268_ + f_288_ + aFloat5263
										* i_270_);
						f_276_ = aFloat5274
								+ (aFloat5260 * i_269_ + f_288_ + aFloat5263
										* i_270_);
						f_277_ = aFloat5274
								+ (aFloat5260 * i_269_ + f_288_ + aFloat5263
										* i_271_);
						f_278_ = aFloat5274
								+ (aFloat5260 * i_268_ + f_288_ + aFloat5263
										* i_271_);
					}
					if (class235.aBoolean1758) {
						int i_289_ = (int) (f - (class235.anInt1761));
						if (i_289_ > 0) {
							i_272_ = i_289_;
							if (i_272_ > 255) {
								i_272_ = 255;
							}
						}
						i_289_ = (int) (f_276_ - (class235.anInt1761));
						if (i_289_ > 0) {
							i_273_ = i_289_;
							if (i_273_ > 255) {
								i_273_ = 255;
							}
						}
						i_289_ = (int) (f_277_ - (class235.anInt1761));
						if (i_289_ > 0) {
							i_274_ = i_289_;
							if (i_274_ > 255) {
								i_274_ = 255;
							}
						}
						i_289_ = (int) (f_278_ - (class235.anInt1761));
						if (i_289_ > 0) {
							i_275_ = i_289_;
							if (i_275_ > 255) {
								i_275_ = 255;
							}
						}
					}
					final float f_290_ = aFloat5271 * i_287_;
					final float f_291_ = aFloat5273 * i_287_;
					if (anInt5262 == -1) {
						final float f_292_ = (aFloat5268 + (aFloat5275 * i_268_
								+ f_290_ + aFloat5276 * i_270_));
						i_279_ = (class12.anInt136 + (int) (f_292_
								* (aHa_Sub2_5269.anInt4514) / f));
						final float f_293_ = (aFloat5255 + (aFloat5264 * i_268_
								+ f_291_ + aFloat5267 * i_270_));
						i_280_ = (class12.anInt128 + (int) (f_293_
								* (aHa_Sub2_5269.anInt4490) / f));
						final float f_294_ = (aFloat5268 + (aFloat5275 * i_269_
								+ f_290_ + aFloat5276 * i_270_));
						i_281_ = (class12.anInt136 + (int) (f_294_
								* (aHa_Sub2_5269.anInt4514) / f_276_));
						final float f_295_ = (aFloat5255 + (aFloat5264 * i_269_
								+ f_291_ + aFloat5267 * i_270_));
						i_282_ = (class12.anInt128 + (int) (f_295_
								* (aHa_Sub2_5269.anInt4490) / f_276_));
						final float f_296_ = (aFloat5268 + (aFloat5275 * i_269_
								+ f_290_ + aFloat5276 * i_271_));
						i_283_ = (class12.anInt136 + (int) (f_296_
								* (aHa_Sub2_5269.anInt4514) / f_277_));
						final float f_297_ = (aFloat5255 + (aFloat5264 * i_269_
								+ f_291_ + aFloat5267 * i_271_));
						i_284_ = (class12.anInt128 + (int) (f_297_
								* (aHa_Sub2_5269.anInt4490) / f_277_));
						final float f_298_ = (aFloat5268 + (aFloat5275 * i_268_
								+ f_290_ + aFloat5276 * i_271_));
						i_285_ = (class12.anInt136 + (int) (f_298_
								* (aHa_Sub2_5269.anInt4514) / f_278_));
						final float f_299_ = (aFloat5255 + (aFloat5264 * i_268_
								+ f_291_ + aFloat5267 * i_271_));
						i_286_ = (class12.anInt128 + (int) (f_299_
								* (aHa_Sub2_5269.anInt4490) / f_278_));
					} else {
						final float f_300_ = (aFloat5268 + (aFloat5275 * i_268_
								+ f_290_ + aFloat5276 * i_270_));
						i_279_ = (class12.anInt136 + (int) (f_300_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_301_ = (aFloat5255 + (aFloat5264 * i_268_
								+ f_291_ + aFloat5267 * i_270_));
						i_280_ = (class12.anInt128 + (int) (f_301_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						final float f_302_ = (aFloat5268 + (aFloat5275 * i_269_
								+ f_290_ + aFloat5276 * i_270_));
						i_281_ = (class12.anInt136 + (int) (f_302_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_303_ = (aFloat5255 + (aFloat5264 * i_269_
								+ f_291_ + aFloat5267 * i_270_));
						i_282_ = (class12.anInt128 + (int) (f_303_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						final float f_304_ = (aFloat5268 + (aFloat5275 * i_269_
								+ f_290_ + aFloat5276 * i_271_));
						i_283_ = (class12.anInt136 + (int) (f_304_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_305_ = (aFloat5255 + (aFloat5264 * i_269_
								+ f_291_ + aFloat5267 * i_271_));
						i_284_ = (class12.anInt128 + (int) (f_305_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						final float f_306_ = (aFloat5268 + (aFloat5275 * i_268_
								+ f_290_ + aFloat5276 * i_271_));
						i_285_ = (class12.anInt136 + (int) (f_306_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_307_ = (aFloat5255 + (aFloat5264 * i_268_
								+ f_291_ + aFloat5267 * i_271_));
						i_286_ = (class12.anInt128 + (int) (f_307_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
					}
				} else {
					int i_308_ = ((s) this).anIntArrayArray2201[i][i_263_];
					int i_309_ = ((s) this).anIntArrayArray2201[i + 1][i_263_];
					int i_310_ = ((s) this).anIntArrayArray2201[i + 1][i_263_ + 1];
					int i_311_ = ((s) this).anIntArrayArray2201[i][i_263_ + 1];
					if (anInt5262 == -1) {
						f = aFloat5274
								+ (aFloat5260 * i_268_ + aFloat5270 * i_308_ + aFloat5263
										* i_270_);
						if (f <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						f_276_ = aFloat5274
								+ (aFloat5260 * i_269_ + aFloat5270 * i_309_ + aFloat5263
										* i_270_);
						if (f_276_ <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						f_277_ = aFloat5274
								+ (aFloat5260 * i_269_ + aFloat5270 * i_310_ + aFloat5263
										* i_271_);
						if (f_277_ <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						f_278_ = aFloat5274
								+ (aFloat5260 * i_268_ + aFloat5270 * i_311_ + aFloat5263
										* i_271_);
						if (f_278_ <= aHa_Sub2_5269.anInt4502) {
							return;
						}
					} else {
						f = aFloat5274
								+ (aFloat5260 * i_268_ + aFloat5270 * i_308_ + aFloat5263
										* i_270_);
						f_276_ = aFloat5274
								+ (aFloat5260 * i_269_ + aFloat5270 * i_309_ + aFloat5263
										* i_270_);
						f_277_ = aFloat5274
								+ (aFloat5260 * i_269_ + aFloat5270 * i_310_ + aFloat5263
										* i_271_);
						f_278_ = aFloat5274
								+ (aFloat5260 * i_268_ + aFloat5270 * i_311_ + aFloat5263
										* i_271_);
					}
					if (bool) {
						int i_312_ = (int) (f - (class235.anInt1761));
						if (i_312_ > 255) {
							i_312_ = 255;
						}
						if (i_312_ > 0) {
							i_272_ = i_312_;
							final int i_313_ = (class193.aShort1489 * i_312_ / 255);
							if (i_313_ > 0) {
								i_308_ -= i_313_;
							}
						}
						i_312_ = (int) (f_276_ - (class235.anInt1761));
						if (i_312_ > 255) {
							i_312_ = 255;
						}
						if (i_312_ > 0) {
							i_273_ = i_312_;
							final int i_314_ = (class193.aShort1485 * i_312_ / 255);
							if (i_314_ > 0) {
								i_309_ -= i_314_;
							}
						}
						i_312_ = (int) (f_277_ - (class235.anInt1761));
						if (i_312_ > 255) {
							i_312_ = 255;
						}
						if (i_312_ > 0) {
							i_274_ = i_312_;
							final int i_315_ = (class193.aShort1486 * i_312_ / 255);
							if (i_315_ > 0) {
								i_310_ -= i_315_;
							}
						}
						i_312_ = (int) (f_278_ - (class235.anInt1761));
						if (i_312_ > 255) {
							i_312_ = 255;
						}
						if (i_312_ > 0) {
							i_275_ = i_312_;
							final int i_316_ = (class193.aShort1488 * i_312_ / 255);
							if (i_316_ > 0) {
								i_311_ -= i_316_;
							}
						}
					} else if (class235.aBoolean1758) {
						int i_317_ = (int) (f - (class235.anInt1761));
						if (i_317_ > 0) {
							i_272_ = i_317_;
							if (i_272_ > 255) {
								i_272_ = 255;
							}
						}
						i_317_ = (int) (f_276_ - (class235.anInt1761));
						if (i_317_ > 0) {
							i_273_ = i_317_;
							if (i_273_ > 255) {
								i_273_ = 255;
							}
						}
						i_317_ = (int) (f_277_ - (class235.anInt1761));
						if (i_317_ > 0) {
							i_274_ = i_317_;
							if (i_274_ > 255) {
								i_274_ = 255;
							}
						}
						i_317_ = (int) (f_278_ - (class235.anInt1761));
						if (i_317_ > 0) {
							i_275_ = i_317_;
							if (i_275_ > 255) {
								i_275_ = 255;
							}
						}
					}
					if (anInt5262 == -1) {
						final float f_318_ = aFloat5268
								+ (aFloat5275 * i_268_ + aFloat5271 * i_308_ + aFloat5276
										* i_270_);
						i_279_ = (class12.anInt136 + (int) (f_318_
								* (aHa_Sub2_5269.anInt4514) / f));
						final float f_319_ = aFloat5255
								+ (aFloat5264 * i_268_ + aFloat5273 * i_308_ + aFloat5267
										* i_270_);
						i_280_ = (class12.anInt128 + (int) (f_319_
								* (aHa_Sub2_5269.anInt4490) / f));
						final float f_320_ = aFloat5268
								+ (aFloat5275 * i_269_ + aFloat5271 * i_309_ + aFloat5276
										* i_270_);
						i_281_ = (class12.anInt136 + (int) (f_320_
								* (aHa_Sub2_5269.anInt4514) / f_276_));
						final float f_321_ = aFloat5255
								+ (aFloat5264 * i_269_ + aFloat5273 * i_309_ + aFloat5267
										* i_270_);
						i_282_ = (class12.anInt128 + (int) (f_321_
								* (aHa_Sub2_5269.anInt4490) / f_276_));
						final float f_322_ = aFloat5268
								+ (aFloat5275 * i_269_ + aFloat5271 * i_310_ + aFloat5276
										* i_271_);
						i_283_ = (class12.anInt136 + (int) (f_322_
								* (aHa_Sub2_5269.anInt4514) / f_277_));
						final float f_323_ = aFloat5255
								+ (aFloat5264 * i_269_ + aFloat5273 * i_310_ + aFloat5267
										* i_271_);
						i_284_ = (class12.anInt128 + (int) (f_323_
								* (aHa_Sub2_5269.anInt4490) / f_277_));
						final float f_324_ = aFloat5268
								+ (aFloat5275 * i_268_ + aFloat5271 * i_311_ + aFloat5276
										* i_271_);
						i_285_ = (class12.anInt136 + (int) (f_324_
								* (aHa_Sub2_5269.anInt4514) / f_278_));
						final float f_325_ = aFloat5255
								+ (aFloat5264 * i_268_ + aFloat5273 * i_311_ + aFloat5267
										* i_271_);
						i_286_ = (class12.anInt128 + (int) (f_325_
								* (aHa_Sub2_5269.anInt4490) / f_278_));
					} else {
						final float f_326_ = aFloat5268
								+ (aFloat5275 * i_268_ + aFloat5271 * i_308_ + aFloat5276
										* i_270_);
						i_279_ = (class12.anInt136 + (int) (f_326_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_327_ = aFloat5255
								+ (aFloat5264 * i_268_ + aFloat5273 * i_308_ + aFloat5267
										* i_270_);
						i_280_ = (class12.anInt128 + (int) (f_327_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						final float f_328_ = aFloat5268
								+ (aFloat5275 * i_269_ + aFloat5271 * i_309_ + aFloat5276
										* i_270_);
						i_281_ = (class12.anInt136 + (int) (f_328_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_329_ = aFloat5255
								+ (aFloat5264 * i_269_ + aFloat5273 * i_309_ + aFloat5267
										* i_270_);
						i_282_ = (class12.anInt128 + (int) (f_329_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						final float f_330_ = aFloat5268
								+ (aFloat5275 * i_269_ + aFloat5271 * i_310_ + aFloat5276
										* i_271_);
						i_283_ = (class12.anInt136 + (int) (f_330_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_331_ = aFloat5255
								+ (aFloat5264 * i_269_ + aFloat5273 * i_310_ + aFloat5267
										* i_271_);
						i_284_ = (class12.anInt128 + (int) (f_331_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						final float f_332_ = aFloat5268
								+ (aFloat5275 * i_268_ + aFloat5271 * i_311_ + aFloat5276
										* i_271_);
						i_285_ = (class12.anInt136 + (int) (f_332_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						final float f_333_ = aFloat5255
								+ (aFloat5264 * i_268_ + aFloat5273 * i_311_ + aFloat5267
										* i_271_);
						i_286_ = (class12.anInt128 + (int) (f_333_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
					}
				}
				final boolean bool_334_ = (class193.aShort1487 != -1 && method3441((((ha) aHa_Sub2_5269).aD938
						.method11(class193.aShort1487, -28755)).aByte1820));
				if (anInt5262 == -1) {
					int i_335_ = i_273_ + i_274_ + i_275_;
					if (((i_283_ - i_285_) * (i_282_ - i_286_) - (i_284_ - i_286_)
							* (i_281_ - i_285_)) > 0) {
						class12.aBoolean135 = (i_283_ < 0 || i_285_ < 0
								|| i_281_ < 0 || i_283_ > class12.anInt141
								|| i_285_ > class12.anInt141 || i_281_ > class12.anInt141);
						if (i_335_ < 765) {
							if (i_335_ > 0) {
								if (class193.aShort1487 >= 0) {
									int i_336_ = -16777216;
									if (bool_334_) {
										i_336_ = -1694498816;
									}
									class12.method212(i_284_, i_286_, i_282_,
											i_283_, i_285_, i_281_, f_277_,
											f_278_, f_276_, 1.0F, 0.0F, 1.0F,
											1.0F, 1.0F, 0.0F, i_336_
													| (class193.anInt1493)
													& 0xffffff, i_336_
													| (class193.anInt1484)
													& 0xffffff, i_336_
													| (class193.anInt1491)
													& 0xffffff,
											class235.anInt1763, i_274_, i_275_,
											i_273_, class193.aShort1487);
								} else {
									if (bool_334_) {
										class12.anInt137 = 100;
									}
									class12.method206(
											i_284_,
											i_286_,
											i_282_,
											i_283_,
											i_285_,
											i_281_,
											(int) f_277_,
											(int) f_278_,
											(int) f_276_,
											(Class98_Sub46_Sub5
													.method1544(
															(i_274_ << 24 | class235.anInt1763),
															(byte) 104,
															class193.anInt1493)),
											(Class98_Sub46_Sub5
													.method1544(
															(i_275_ << 24 | class235.anInt1763),
															(byte) 109,
															class193.anInt1484)),
											(Class98_Sub46_Sub5
													.method1544(
															(i_273_ << 24 | class235.anInt1763),
															(byte) 107,
															class193.anInt1491)));
									class12.anInt137 = 0;
								}
							} else if (class193.aShort1487 >= 0) {
								int i_337_ = -16777216;
								if (bool_334_) {
									i_337_ = -1694498816;
								}
								class12.method212(
										i_284_,
										i_286_,
										i_282_,
										i_283_,
										i_285_,
										i_281_,
										f_277_,
										f_278_,
										f_276_,
										1.0F,
										0.0F,
										1.0F,
										1.0F,
										1.0F,
										0.0F,
										i_337_
												| (class193.anInt1493 & 0xffffff),
										i_337_
												| (class193.anInt1484 & 0xffffff),
										i_337_
												| (class193.anInt1491 & 0xffffff),
										0, 0, 0, 0, class193.aShort1487);
							} else {
								if (bool_334_) {
									class12.anInt137 = 100;
								}
								class12.method206(i_284_, i_286_, i_282_,
										i_283_, i_285_, i_281_, (int) f_277_,
										(int) f_278_, (int) f_276_,
										class193.anInt1493, class193.anInt1484,
										class193.anInt1491);
								class12.anInt137 = 0;
							}
						} else {
							class12.method208(i_284_, i_286_, i_282_, i_283_,
									i_285_, i_281_, (int) f_277_, (int) f_278_,
									(int) f_276_, class235.anInt1763);
						}
					}
					i_335_ = i_272_ + i_273_ + i_275_;
					if (((i_279_ - i_281_) * (i_286_ - i_282_) - (i_280_ - i_282_)
							* (i_285_ - i_281_)) > 0) {
						class12.aBoolean135 = (i_279_ < 0 || i_281_ < 0
								|| i_285_ < 0 || i_279_ > class12.anInt141
								|| i_281_ > class12.anInt141 || i_285_ > class12.anInt141);
						if (i_335_ < 765) {
							if (bool_334_) {
								class12.anInt137 = -1694498816;
							}
							if (i_335_ > 0) {
								if (class193.aShort1487 >= 0) {
									int i_338_ = -16777216;
									if (bool_334_) {
										i_338_ = -1694498816;
									}
									class12.method212(i_280_, i_282_, i_286_,
											i_279_, i_281_, i_285_, f, f_276_,
											f_278_, 0.0F, 1.0F, 1.0F, 0.0F,
											0.0F, 1.0F, i_338_
													| (class193.anInt1490)
													& 0xffffff, i_338_
													| (class193.anInt1491)
													& 0xffffff, i_338_
													| (class193.anInt1484)
													& 0xffffff,
											class235.anInt1763, i_272_, i_273_,
											i_275_, class193.aShort1487);
								} else {
									if (bool_334_) {
										class12.anInt137 = 100;
									}
									class12.method206(
											i_280_,
											i_282_,
											i_286_,
											i_279_,
											i_281_,
											i_285_,
											(int) f,
											(int) f_276_,
											(int) f_278_,
											(Class98_Sub46_Sub5
													.method1544(
															(i_272_ << 24 | class235.anInt1763),
															(byte) 112,
															class193.anInt1490)),
											(Class98_Sub46_Sub5
													.method1544(
															(i_273_ << 24 | class235.anInt1763),
															(byte) 122,
															class193.anInt1491)),
											(Class98_Sub46_Sub5
													.method1544(
															(i_275_ << 24 | class235.anInt1763),
															(byte) 121,
															class193.anInt1484)));
									class12.anInt137 = 0;
								}
							} else if (class193.aShort1487 >= 0) {
								int i_339_ = -16777216;
								if (bool_334_) {
									i_339_ = -1694498816;
								}
								class12.method212(
										i_280_,
										i_282_,
										i_286_,
										i_279_,
										i_281_,
										i_285_,
										f,
										f_276_,
										f_278_,
										0.0F,
										1.0F,
										1.0F,
										0.0F,
										0.0F,
										1.0F,
										i_339_
												| (class193.anInt1490 & 0xffffff),
										i_339_
												| (class193.anInt1491 & 0xffffff),
										i_339_
												| (class193.anInt1484 & 0xffffff),
										0, 0, 0, 0, class193.aShort1487);
							} else {
								if (bool_334_) {
									class12.anInt137 = 100;
								}
								class12.method206(i_280_, i_282_, i_286_,
										i_279_, i_281_, i_285_, (int) f,
										(int) f_276_, (int) f_278_,
										class193.anInt1490, class193.anInt1491,
										class193.anInt1484);
								class12.anInt137 = 0;
							}
						} else {
							class12.method208(i_280_, i_282_, i_286_, i_279_,
									i_281_, i_285_, (int) f, (int) f_276_,
									(int) f_278_, class235.anInt1763);
						}
					}
				} else {
					int i_340_ = i_273_ + i_274_ + i_275_;
					if (((i_283_ - i_285_) * (i_282_ - i_286_) - (i_284_ - i_286_)
							* (i_281_ - i_285_)) > 0) {
						class12.aBoolean135 = (i_283_ < 0 || i_285_ < 0
								|| i_281_ < 0 || i_283_ > class12.anInt141
								|| i_285_ > class12.anInt141 || i_281_ > class12.anInt141);
						if (i_340_ < 765) {
							if (bool_334_) {
								class12.anInt137 = -1694498816;
							}
							if (i_340_ > 0) {
								if (class193.aShort1487 >= 0) {
									int i_341_ = -16777216;
									if (bool_334_) {
										i_341_ = -1694498816;
									}
									class12.method212(i_284_, i_286_, i_282_,
											i_283_, i_285_, i_281_, f_277_,
											f_278_, f_276_, 1.0F, 0.0F, 1.0F,
											1.0F, 1.0F, 0.0F, i_341_
													| (class193.anInt1493)
													& 0xffffff, i_341_
													| (class193.anInt1484)
													& 0xffffff, i_341_
													| (class193.anInt1491)
													& 0xffffff,
											class235.anInt1763, i_274_, i_275_,
											i_273_, class193.aShort1487);
								} else {
									if (bool_334_) {
										class12.anInt137 = 100;
									}
									class12.method206(
											i_284_,
											i_286_,
											i_282_,
											i_283_,
											i_285_,
											i_281_,
											(int) f_277_,
											(int) f_278_,
											(int) f_276_,
											(Class98_Sub46_Sub5
													.method1544(
															(i_274_ << 24 | class235.anInt1763),
															(byte) 127,
															class193.anInt1493)),
											(Class98_Sub46_Sub5
													.method1544(
															(i_275_ << 24 | class235.anInt1763),
															(byte) 124,
															class193.anInt1484)),
											(Class98_Sub46_Sub5
													.method1544(
															(i_273_ << 24 | class235.anInt1763),
															(byte) 114,
															class193.anInt1491)));
									class12.anInt137 = 0;
								}
							} else if (class193.aShort1487 >= 0) {
								int i_342_ = -16777216;
								if (bool_334_) {
									i_342_ = -1694498816;
								}
								class12.method212(
										i_284_,
										i_286_,
										i_282_,
										i_283_,
										i_285_,
										i_281_,
										f_277_,
										f_278_,
										f_276_,
										1.0F,
										0.0F,
										1.0F,
										1.0F,
										1.0F,
										0.0F,
										i_342_
												| (class193.anInt1493 & 0xffffff),
										i_342_
												| (class193.anInt1484 & 0xffffff),
										i_342_
												| (class193.anInt1491 & 0xffffff),
										0, 0, 0, 0, class193.aShort1487);
							} else {
								if (bool_334_) {
									class12.anInt137 = 100;
								}
								class12.method206(i_284_, i_286_, i_282_,
										i_283_, i_285_, i_281_, (int) f_277_,
										(int) f_278_, (int) f_276_,
										class193.anInt1493, class193.anInt1484,
										class193.anInt1491);
								class12.anInt137 = 0;
							}
						} else {
							class12.method208(i_284_, i_286_, i_282_, i_283_,
									i_285_, i_281_, (int) f_277_, (int) f_278_,
									(int) f_276_, class235.anInt1763);
						}
					}
					i_340_ = i_272_ + i_273_ + i_275_;
					if (((i_279_ - i_281_) * (i_286_ - i_282_) - (i_280_ - i_282_)
							* (i_285_ - i_281_)) > 0) {
						class12.aBoolean135 = (i_279_ < 0 || i_281_ < 0
								|| i_285_ < 0 || i_279_ > class12.anInt141
								|| i_281_ > class12.anInt141 || i_285_ > class12.anInt141);
						if (i_340_ < 765) {
							if (bool_334_) {
								class12.anInt137 = -1694498816;
							}
							if (i_340_ > 0) {
								if (class193.aShort1487 >= 0) {
									int i_343_ = -16777216;
									if (bool_334_) {
										i_343_ = -1694498816;
									}
									class12.method212(i_280_, i_282_, i_286_,
											i_279_, i_281_, i_285_, f, f_276_,
											f_278_, 0.0F, 1.0F, 1.0F, 0.0F,
											0.0F, 1.0F, i_343_
													| (class193.anInt1490)
													& 0xffffff, i_343_
													| (class193.anInt1491)
													& 0xffffff, i_343_
													| (class193.anInt1484)
													& 0xffffff,
											class235.anInt1763, i_272_, i_273_,
											i_275_, class193.aShort1487);
								} else {
									if (bool_334_) {
										class12.anInt137 = 100;
									}
									class12.method206(
											i_280_,
											i_282_,
											i_286_,
											i_279_,
											i_281_,
											i_285_,
											(int) f,
											(int) f_276_,
											(int) f_278_,
											(Class98_Sub46_Sub5
													.method1544(
															(i_272_ << 24 | class235.anInt1763),
															(byte) 105,
															class193.anInt1490)),
											(Class98_Sub46_Sub5
													.method1544(
															(i_273_ << 24 | class235.anInt1763),
															(byte) 118,
															class193.anInt1491)),
											(Class98_Sub46_Sub5
													.method1544(
															(i_275_ << 24 | class235.anInt1763),
															(byte) 105,
															class193.anInt1484)));
									class12.anInt137 = 0;
								}
							} else if (class193.aShort1487 >= 0) {
								int i_344_ = -16777216;
								if (bool_334_) {
									i_344_ = -1694498816;
								}
								class12.method212(
										i_280_,
										i_282_,
										i_286_,
										i_279_,
										i_281_,
										i_285_,
										f,
										f_276_,
										f_278_,
										0.0F,
										1.0F,
										1.0F,
										0.0F,
										0.0F,
										1.0F,
										i_344_
												| (class193.anInt1490 & 0xffffff),
										i_344_
												| (class193.anInt1491 & 0xffffff),
										i_344_
												| (class193.anInt1484 & 0xffffff),
										0, 0, 0, 0, class193.aShort1487);
							} else {
								if (bool_334_) {
									class12.anInt137 = 100;
								}
								class12.method206(i_280_, i_282_, i_286_,
										i_279_, i_281_, i_285_, (int) f,
										(int) f_276_, (int) f_278_,
										class193.anInt1490, class193.anInt1491,
										class193.anInt1484);
								class12.anInt137 = 0;
							}
						} else {
							class12.method208(i_280_, i_282_, i_286_, i_279_,
									i_281_, i_285_, (int) f, (int) f_276_,
									(int) f_278_, class235.anInt1763);
						}
					}
				}
			}
		} else {
			final Class285 class285 = aClass285ArrayArray5258[i][i_263_];
			if (class285 != null) {
				if (i_267_ != 0) {
					if ((class285.aByte2172 & 0x4) != 0) {
						if ((i_267_ & 0x1) != 0) {
							return;
						}
					} else if ((i_267_ & 0x2) != 0) {
						return;
					}
				}
				if (anInt5262 == -1) {
					for (int i_345_ = 0; i_345_ < class285.aShort2174; i_345_++) {
						final int i_346_ = (class285.aShortArray2176[i_345_] + (i << ((s) this).anInt2200));
						int i_347_ = class285.aShortArray2179[i_345_];
						final int i_348_ = (class285.aShortArray2170[i_345_] + (i_263_ << ((s) this).anInt2200));
						final float f = aFloat5274
								+ (aFloat5260 * i_346_ + aFloat5270 * i_347_ + aFloat5263
										* i_348_);
						if (f <= aHa_Sub2_5269.anInt4502) {
							return;
						}
						is_266_[i_345_] = 0;
						if (bool) {
							int i_349_ = (int) (f - (class235.anInt1761));
							if (i_349_ > 255) {
								i_349_ = 255;
							}
							if (i_349_ > 0) {
								is_266_[i_345_] = i_349_;
								final int i_350_ = ((class285.aShortArray2178[i_345_])
										* i_349_ / 255);
								if (i_350_ > 0) {
									i_347_ -= i_350_;
								}
							}
						} else if (class235.aBoolean1758) {
							final int i_351_ = (int) (f - (class235.anInt1761));
							if (i_351_ > 0) {
								is_266_[i_345_] = i_351_;
								if (is_266_[i_345_] > 255) {
									is_266_[i_345_] = 255;
								}
							}
						}
						final float f_352_ = aFloat5268
								+ (aFloat5275 * i_346_ + aFloat5271 * i_347_ + aFloat5276
										* i_348_);
						final float f_353_ = aFloat5255
								+ (aFloat5264 * i_346_ + aFloat5273 * i_347_ + aFloat5267
										* i_348_);
						is[i_345_] = (class12.anInt136 + (int) (f_352_
								* (aHa_Sub2_5269.anInt4514) / f));
						is_264_[i_345_] = (class12.anInt128 + (int) (f_353_
								* (aHa_Sub2_5269.anInt4490) / f));
						is_265_[i_345_] = (int) f;
					}
				} else {
					for (int i_354_ = 0; i_354_ < class285.aShort2174; i_354_++) {
						final int i_355_ = (class285.aShortArray2176[i_354_] + (i << ((s) this).anInt2200));
						int i_356_ = class285.aShortArray2179[i_354_];
						final int i_357_ = (class285.aShortArray2170[i_354_] + (i_263_ << ((s) this).anInt2200));
						final float f = aFloat5274
								+ (aFloat5260 * i_355_ + aFloat5270 * i_356_ + aFloat5263
										* i_357_);
						is_266_[i_354_] = 0;
						if (bool) {
							int i_358_ = anInt5262 - class235.anInt1761;
							if (i_358_ > 255) {
								i_358_ = 255;
							}
							if (i_358_ > 0) {
								is_266_[i_354_] = i_358_;
								final int i_359_ = ((class285.aShortArray2178[i_354_])
										* i_358_ / 255);
								if (i_359_ > 0) {
									i_356_ -= i_359_;
								}
							}
						} else if (class235.aBoolean1758) {
							final int i_360_ = anInt5262 - class235.anInt1761;
							if (i_360_ > 0) {
								is_266_[i_354_] = i_360_;
								if (is_266_[i_354_] > 255) {
									is_266_[i_354_] = 255;
								}
							}
						}
						final float f_361_ = aFloat5268
								+ (aFloat5275 * i_355_ + aFloat5271 * i_356_ + aFloat5276
										* i_357_);
						final float f_362_ = aFloat5255
								+ (aFloat5264 * i_355_ + aFloat5273 * i_356_ + aFloat5267
										* i_357_);
						is[i_354_] = (class12.anInt136 + (int) (f_361_
								* (aHa_Sub2_5269.anInt4514) / anInt5262));
						is_264_[i_354_] = (class12.anInt128 + (int) (f_362_
								* (aHa_Sub2_5269.anInt4490) / anInt5262));
						is_265_[i_354_] = (int) f;
					}
				}
				if (class285.aShortArray2169 != null) {
					if (anInt5262 == -1) {
						for (int i_363_ = 0; i_363_ < class285.aShort2171; i_363_++) {
							final int i_364_ = i_363_ * 3;
							final int i_365_ = i_364_ + 1;
							final int i_366_ = i_365_ + 1;
							final int i_367_ = is[i_364_];
							final int i_368_ = is[i_365_];
							final int i_369_ = is[i_366_];
							final int i_370_ = is_264_[i_364_];
							final int i_371_ = is_264_[i_365_];
							final int i_372_ = is_264_[i_366_];
							final int i_373_ = (is_266_[i_364_]
									+ is_266_[i_365_] + is_266_[i_366_]);
							if (((i_367_ - i_368_) * (i_372_ - i_371_) - (i_370_ - i_371_)
									* (i_369_ - i_368_)) > 0) {
								class12.aBoolean135 = (i_367_ < 0 || i_368_ < 0
										|| i_369_ < 0
										|| i_367_ > class12.anInt141
										|| i_368_ > class12.anInt141 || (i_369_ > class12.anInt141));
								final short i_374_ = (class285.aShortArray2169[i_363_]);
								if (i_373_ < 765) {
									if (i_373_ > 0) {
										if (i_374_ != -1) {
											int i_375_ = -16777216;
											if (i_374_ != -1
													&& method3441((((ha) aHa_Sub2_5269).aD938
															.method11(i_374_,
																	-28755)).aByte1820)) {
												i_375_ = -1694498816;
											}
											class12.method212(
													i_370_,
													i_371_,
													i_372_,
													i_367_,
													i_368_,
													i_369_,
													is_265_[i_364_],
													is_265_[i_365_],
													is_265_[i_366_],
													((float) (class285.aShortArray2176[i_364_]) / (float) (((s) this).anInt2206)),
													((float) (class285.aShortArray2176[i_365_]) / (float) (((s) this).anInt2206)),
													((float) (class285.aShortArray2176[i_366_]) / (float) (((s) this).anInt2206)),
													((float) (class285.aShortArray2170[i_364_]) / (float) (((s) this).anInt2206)),
													((float) (class285.aShortArray2170[i_365_]) / (float) (((s) this).anInt2206)),
													((float) (class285.aShortArray2170[i_366_]) / (float) (((s) this).anInt2206)),
													(i_375_ | ((class285.anIntArray2173[i_364_]) & 0xffffff)),
													(i_375_ | ((class285.anIntArray2173[i_365_]) & 0xffffff)),
													(i_375_ | ((class285.anIntArray2173[i_366_]) & 0xffffff)),
													(class235.anInt1763),
													is_266_[i_364_],
													is_266_[i_365_],
													is_266_[i_366_], i_374_);
										} else if (((class285.anIntArray2173[i_364_]) & 0xffffff) != 0) {
											if (i_374_ != -1
													&& method3441((((ha) aHa_Sub2_5269).aD938
															.method11(i_374_,
																	-28755)).aByte1820)) {
												class12.anInt137 = -1694498816;
											}
											class12.method206(
													i_370_,
													i_371_,
													i_372_,
													i_367_,
													i_368_,
													i_369_,
													is_265_[i_364_],
													is_265_[i_365_],
													is_265_[i_366_],
													(Class98_Sub46_Sub5
															.method1544(
																	(is_266_[i_364_] << 24 | (class235.anInt1763)),
																	(byte) 119,
																	(class285.anIntArray2173[i_364_]))),
													(Class98_Sub46_Sub5
															.method1544(
																	(is_266_[i_365_] << 24 | (class235.anInt1763)),
																	(byte) 120,
																	(class285.anIntArray2173[i_365_]))),
													(Class98_Sub46_Sub5
															.method1544(
																	(is_266_[i_366_] << 24 | (class235.anInt1763)),
																	(byte) 122,
																	(class285.anIntArray2173[i_366_]))));
											class12.anInt137 = 0;
										}
									} else if (i_374_ != -1) {
										int i_376_ = -16777216;
										if (i_374_ != -1
												&& method3441((((ha) aHa_Sub2_5269).aD938
														.method11(i_374_,
																-28755)).aByte1820)) {
											i_376_ = -1694498816;
										}
										class12.method212(
												i_370_,
												i_371_,
												i_372_,
												i_367_,
												i_368_,
												i_369_,
												is_265_[i_364_],
												is_265_[i_365_],
												is_265_[i_366_],
												((float) (class285.aShortArray2176[i_364_]) / (float) ((s) this).anInt2206),
												((float) (class285.aShortArray2176[i_365_]) / (float) ((s) this).anInt2206),
												((float) (class285.aShortArray2176[i_366_]) / (float) ((s) this).anInt2206),
												((float) (class285.aShortArray2170[i_364_]) / (float) ((s) this).anInt2206),
												((float) (class285.aShortArray2170[i_365_]) / (float) ((s) this).anInt2206),
												((float) (class285.aShortArray2170[i_366_]) / (float) ((s) this).anInt2206),
												i_376_
														| (class285.anIntArray2173[i_364_])
														& 0xffffff,
												i_376_
														| (class285.anIntArray2173[i_365_])
														& 0xffffff,
												i_376_
														| (class285.anIntArray2173[i_366_])
														& 0xffffff, 0, 0, 0, 0,
												i_374_);
									} else if (((class285.anIntArray2173[i_364_]) & 0xffffff) != 0) {
										if (i_374_ != -1
												&& method3441((((ha) aHa_Sub2_5269).aD938
														.method11(i_374_,
																-28755)).aByte1820)) {
											class12.anInt137 = -1694498816;
										}
										class12.method206(
												i_370_,
												i_371_,
												i_372_,
												i_367_,
												i_368_,
												i_369_,
												is_265_[i_364_],
												is_265_[i_365_],
												is_265_[i_366_],
												(class285.anIntArray2173[i_364_]),
												(class285.anIntArray2173[i_365_]),
												(class285.anIntArray2173[i_366_]));
										class12.anInt137 = 0;
									}
								} else {
									class12.method208(i_370_, i_371_, i_372_,
											i_367_, i_368_, i_369_,
											is_265_[i_364_], is_265_[i_365_],
											is_265_[i_366_],
											(class235.anInt1763));
								}
							}
						}
					} else {
						for (int i_377_ = 0; i_377_ < class285.aShort2171; i_377_++) {
							final int i_378_ = i_377_ * 3;
							final int i_379_ = i_378_ + 1;
							final int i_380_ = i_379_ + 1;
							final int i_381_ = is[i_378_];
							final int i_382_ = is[i_379_];
							final int i_383_ = is[i_380_];
							final int i_384_ = is_264_[i_378_];
							final int i_385_ = is_264_[i_379_];
							final int i_386_ = is_264_[i_380_];
							final int i_387_ = (is_266_[i_378_]
									+ is_266_[i_379_] + is_266_[i_380_]);
							if (((i_381_ - i_382_) * (i_386_ - i_385_) - (i_384_ - i_385_)
									* (i_383_ - i_382_)) > 0) {
								class12.aBoolean135 = (i_381_ < 0 || i_382_ < 0
										|| i_383_ < 0
										|| i_381_ > class12.anInt141
										|| i_382_ > class12.anInt141 || (i_383_ > class12.anInt141));
								final short i_388_ = (class285.aShortArray2169[i_377_]);
								if (i_387_ < 765) {
									if (i_388_ != -1
											&& method3441((((ha) aHa_Sub2_5269).aD938
													.method11(i_388_, -28755)).aByte1820)) {
										class12.anInt137 = -1694498816;
									}
									if (i_387_ > 0) {
										if (i_388_ != -1) {
											int i_389_ = -16777216;
											if (i_388_ != -1
													&& method3441((((ha) aHa_Sub2_5269).aD938
															.method11(i_388_,
																	-28755)).aByte1820)) {
												i_389_ = -1694498816;
											}
											class12.method212(
													i_384_,
													i_385_,
													i_386_,
													i_381_,
													i_382_,
													i_383_,
													is_265_[i_378_],
													is_265_[i_379_],
													is_265_[i_380_],
													((float) (class285.aShortArray2176[i_378_]) / (float) (((s) this).anInt2206)),
													((float) (class285.aShortArray2176[i_379_]) / (float) (((s) this).anInt2206)),
													((float) (class285.aShortArray2176[i_380_]) / (float) (((s) this).anInt2206)),
													((float) (class285.aShortArray2170[i_378_]) / (float) (((s) this).anInt2206)),
													((float) (class285.aShortArray2170[i_379_]) / (float) (((s) this).anInt2206)),
													((float) (class285.aShortArray2170[i_380_]) / (float) (((s) this).anInt2206)),
													(i_389_ | ((class285.anIntArray2173[i_378_]) & 0xffffff)),
													(i_389_ | ((class285.anIntArray2173[i_379_]) & 0xffffff)),
													(i_389_ | ((class285.anIntArray2173[i_380_]) & 0xffffff)),
													(class235.anInt1763),
													is_266_[i_378_],
													is_266_[i_379_],
													is_266_[i_380_], i_388_);
										} else if (((class285.anIntArray2173[i_378_]) & 0xffffff) != 0) {
											if (i_388_ != -1
													&& method3441((((ha) aHa_Sub2_5269).aD938
															.method11(i_388_,
																	-28755)).aByte1820)) {
												class12.anInt137 = -1694498816;
											}
											class12.method206(
													i_384_,
													i_385_,
													i_386_,
													i_381_,
													i_382_,
													i_383_,
													is_265_[i_378_],
													is_265_[i_379_],
													is_265_[i_380_],
													(Class98_Sub46_Sub5
															.method1544(
																	(is_266_[i_378_] << 24 | (class235.anInt1763)),
																	(byte) 117,
																	(class285.anIntArray2173[i_378_]))),
													(Class98_Sub46_Sub5
															.method1544(
																	(is_266_[i_379_] << 24 | (class235.anInt1763)),
																	(byte) 104,
																	(class285.anIntArray2173[i_379_]))),
													(Class98_Sub46_Sub5
															.method1544(
																	(is_266_[i_380_] << 24 | (class235.anInt1763)),
																	(byte) 123,
																	(class285.anIntArray2173[i_380_]))));
											class12.anInt137 = 0;
										}
									} else if (i_388_ != -1) {
										int i_390_ = -16777216;
										if (i_388_ != -1
												&& method3441((((ha) aHa_Sub2_5269).aD938
														.method11(i_388_,
																-28755)).aByte1820)) {
											i_390_ = -1694498816;
										}
										class12.method212(
												i_384_,
												i_385_,
												i_386_,
												i_381_,
												i_382_,
												i_383_,
												is_265_[i_378_],
												is_265_[i_379_],
												is_265_[i_380_],
												((float) (class285.aShortArray2176[i_378_]) / (float) ((s) this).anInt2206),
												((float) (class285.aShortArray2176[i_379_]) / (float) ((s) this).anInt2206),
												((float) (class285.aShortArray2176[i_380_]) / (float) ((s) this).anInt2206),
												((float) (class285.aShortArray2170[i_378_]) / (float) ((s) this).anInt2206),
												((float) (class285.aShortArray2170[i_379_]) / (float) ((s) this).anInt2206),
												((float) (class285.aShortArray2170[i_380_]) / (float) ((s) this).anInt2206),
												i_390_
														| (class285.anIntArray2173[i_378_])
														& 0xffffff,
												i_390_
														| (class285.anIntArray2173[i_379_])
														& 0xffffff,
												i_390_
														| (class285.anIntArray2173[i_380_])
														& 0xffffff, 0, 0, 0, 0,
												i_388_);
									} else if (((class285.anIntArray2173[i_378_]) & 0xffffff) != 0) {
										if (i_388_ != -1
												&& method3441((((ha) aHa_Sub2_5269).aD938
														.method11(i_388_,
																-28755)).aByte1820)) {
											class12.anInt137 = -1694498816;
										}
										class12.method206(
												i_384_,
												i_385_,
												i_386_,
												i_381_,
												i_382_,
												i_383_,
												is_265_[i_378_],
												is_265_[i_379_],
												is_265_[i_380_],
												(class285.anIntArray2173[i_378_]),
												(class285.anIntArray2173[i_379_]),
												(class285.anIntArray2173[i_380_]));
										class12.anInt137 = 0;
									}
									class12.anInt137 = 0;
								} else {
									class12.method208(i_384_, i_385_, i_386_,
											i_381_, i_382_, i_383_,
											is_265_[i_378_], is_265_[i_379_],
											is_265_[i_380_],
											(class235.anInt1763));
								}
							}
						}
					}
				} else {
					for (int i_391_ = 0; i_391_ < class285.aShort2171; i_391_++) {
						final int i_392_ = i_391_ * 3;
						final int i_393_ = i_392_ + 1;
						final int i_394_ = i_393_ + 1;
						final int i_395_ = is[i_392_];
						final int i_396_ = is[i_393_];
						final int i_397_ = is[i_394_];
						final int i_398_ = is_264_[i_392_];
						final int i_399_ = is_264_[i_393_];
						final int i_400_ = is_264_[i_394_];
						final int i_401_ = (is_266_[i_392_] + is_266_[i_393_] + is_266_[i_394_]);
						if (((i_395_ - i_396_) * (i_400_ - i_399_) - (i_398_ - i_399_)
								* (i_397_ - i_396_)) > 0) {
							class12.aBoolean135 = (i_395_ < 0 || i_396_ < 0
									|| i_397_ < 0 || i_395_ > class12.anInt141
									|| i_396_ > class12.anInt141 || i_397_ > class12.anInt141);
							if (i_401_ < 765) {
								if (i_401_ > 0) {
									if (((class285.anIntArray2173[i_392_]) & 0xffffff) != 0) {
										class12.method206(
												i_398_,
												i_399_,
												i_400_,
												i_395_,
												i_396_,
												i_397_,
												is_265_[i_392_],
												is_265_[i_393_],
												is_265_[i_394_],
												(Class215
														.method2790(
																126,
																is_266_[i_392_],
																(class285.anIntArray2173[i_392_]),
																(class235.anInt1763))),
												(Class215
														.method2790(
																126,
																is_266_[i_393_],
																(class285.anIntArray2173[i_393_]),
																(class235.anInt1763))),
												(Class215
														.method2790(
																127,
																is_266_[i_394_],
																(class285.anIntArray2173[i_394_]),
																(class235.anInt1763))));
									}
								} else if (((class285.anIntArray2173[i_392_]) & 0xffffff) != 0) {
									class12.method206(i_398_, i_399_, i_400_,
											i_395_, i_396_, i_397_,
											is_265_[i_392_], is_265_[i_393_],
											is_265_[i_394_],
											(class285.anIntArray2173[i_392_]),
											(class285.anIntArray2173[i_393_]),
											(class285.anIntArray2173[i_394_]));
								}
							} else {
								class12.method208(i_398_, i_399_, i_400_,
										i_395_, i_396_, i_397_,
										is_265_[i_392_], is_265_[i_393_],
										is_265_[i_394_], (class235.anInt1763));
							}
						}
					}
				}
			}
		}
	}

	@Override
	final void method3426(final int i, final int i_402_, final int i_403_,
			final boolean[][] bools, final boolean bool, final int i_404_) {
		final Class111_Sub2 class111_sub2 = aHa_Sub2_5269.aClass111_Sub2_4513;
		anInt5262 = -1;
		aFloat5275 = class111_sub2.aFloat4700;
		aFloat5271 = class111_sub2.aFloat4699;
		aFloat5276 = class111_sub2.aFloat4690;
		aFloat5268 = class111_sub2.aFloat4697;
		aFloat5264 = class111_sub2.aFloat4692;
		aFloat5273 = class111_sub2.aFloat4688;
		aFloat5267 = class111_sub2.aFloat4696;
		aFloat5255 = class111_sub2.aFloat4691;
		aFloat5260 = class111_sub2.aFloat4693;
		aFloat5270 = class111_sub2.aFloat4698;
		aFloat5263 = class111_sub2.aFloat4694;
		aFloat5274 = class111_sub2.aFloat4689;
		for (int i_405_ = 0; i_405_ < i_403_ + i_403_; i_405_++) {
			for (int i_406_ = 0; i_406_ < i_403_ + i_403_; i_406_++) {
				if (bools[i_405_][i_406_]) {
					final int i_407_ = i - i_403_ + i_405_;
					final int i_408_ = i_402_ - i_403_ + i_406_;
					if (i_407_ >= 0 && i_407_ < ((s) this).anInt2203
							&& i_408_ >= 0 && i_408_ < ((s) this).anInt2204) {
						method3443(i_407_, i_408_, i_404_);
					}
				}
			}
		}
	}

	private final void method3443(final int i, final int i_409_,
			final int i_410_) {
		final Class235 class235 = aHa_Sub2_5269.method1921(Thread
				.currentThread());
		class235.aClass12_1767.anInt137 = 0;
		if (aClass193ArrayArray5272 != null) {
			method3442(i, i_409_, class235.aBoolean1759, class235,
					class235.aClass12_1767, class235.anIntArray1795,
					class235.anIntArray1788, class235.anIntArray1784,
					class235.anIntArray1781, i_410_);
		} else if (aClass327ArrayArray5265 != null) {
			method3440(i, i_409_, class235.aClass12_1767,
					class235.anIntArray1795, class235.anIntArray1788,
					class235.anIntArray1784, class235.anIntArray1781, i_410_);
		} else if (aClass120ArrayArray5266 != null) {
			method3438(i, i_409_, class235.aBoolean1759, class235,
					class235.aClass12_1767, class235.anIntArray1795,
					class235.anIntArray1788, class235.anIntArray1784,
					class235.anIntArray1781, i_410_);
		}
	}

	@Override
	final void method3416(final int i, final int i_411_, final int i_412_,
			final boolean[][] bools, final boolean bool, final int i_413_,
			final int i_414_) {
		final Class111_Sub2 class111_sub2 = aHa_Sub2_5269.aClass111_Sub2_4513;
		anInt5262 = i_413_;
		aFloat5275 = class111_sub2.aFloat4700;
		aFloat5271 = class111_sub2.aFloat4699;
		aFloat5276 = class111_sub2.aFloat4690;
		aFloat5268 = class111_sub2.aFloat4697;
		aFloat5264 = class111_sub2.aFloat4692;
		aFloat5273 = class111_sub2.aFloat4688;
		aFloat5267 = class111_sub2.aFloat4696;
		aFloat5255 = class111_sub2.aFloat4691;
		aFloat5260 = class111_sub2.aFloat4693;
		aFloat5270 = class111_sub2.aFloat4698;
		aFloat5263 = class111_sub2.aFloat4694;
		aFloat5274 = class111_sub2.aFloat4689;
		for (int i_415_ = 0; i_415_ < i_412_ + i_412_; i_415_++) {
			for (int i_416_ = 0; i_416_ < i_412_ + i_412_; i_416_++) {
				if (bools[i_415_][i_416_]) {
					final int i_417_ = i - i_412_ + i_415_;
					final int i_418_ = i_411_ - i_412_ + i_416_;
					if (i_417_ >= 0 && i_417_ < ((s) this).anInt2203
							&& i_418_ >= 0 && i_418_ < ((s) this).anInt2204) {
						method3443(i_417_, i_418_, i_414_);
					}
				}
			}
		}
	}

	@Override
	final void method3424(final int i, final int i_419_, final int[] is,
			final int[] is_420_, final int[] is_421_, final int[] is_422_,
			final int[] is_423_, final int[] is_424_, final int[] is_425_,
			final int[] is_426_, final int[] is_427_, final int[] is_428_,
			final int[] is_429_, final int i_430_, final int i_431_,
			final int i_432_, final boolean bool) {
		if (aClass327ArrayArray5265 == null) {
			aClass327ArrayArray5265 = new Class327[((s) this).anInt2203][((s) this).anInt2204];
			aClass328ArrayArray5261 = new Class328[((s) this).anInt2203][((s) this).anInt2204];
		} else if (aClass193ArrayArray5272 != null
				|| aClass120ArrayArray5266 != null) {
			throw new IllegalStateException();
		}
		boolean bool_433_ = false;
		if (is_426_.length == 2
				&& is_423_.length == 2
				&& (is_426_[0] == is_426_[1] || is_428_[0] != -1
						&& is_428_[0] == is_428_[1])) {
			bool_433_ = true;
			for (int i_434_ = 1; i_434_ < 2; i_434_++) {
				final int i_435_ = is[is_423_[i_434_]];
				final int i_436_ = is_421_[is_423_[i_434_]];
				if (i_435_ != 0 && i_435_ != ((s) this).anInt2206
						|| i_436_ != 0 && i_436_ != ((s) this).anInt2206) {
					bool_433_ = false;
					break;
				}
			}
		}
		if (!bool_433_) {
			final Class328 class328 = new Class328();
			final short i_437_ = (short) is.length;
			final int i_438_ = (short) is_426_.length;
			class328.aShort2748 = i_437_;
			class328.aShortArray2750 = new short[i_437_];
			class328.aShortArray2755 = new short[i_437_];
			class328.aShortArray2754 = new short[i_437_];
			class328.aShortArray2757 = new short[i_437_];
			for (int i_439_ = 0; i_439_ < i_437_; i_439_++) {
				final int i_440_ = is[i_439_];
				final int i_441_ = is_421_[i_439_];
				if (i_440_ == 0 && i_441_ == 0) {
					class328.aShortArray2750[i_439_] = (short) (aByteArrayArray5257[i][i_419_] - aByteArrayArray5259[i][i_419_]);
				} else if (i_440_ == 0 && i_441_ == ((s) this).anInt2206) {
					class328.aShortArray2750[i_439_] = (short) (aByteArrayArray5257[i][i_419_ + 1] - aByteArrayArray5259[i][i_419_ + 1]);
				} else if (i_440_ == ((s) this).anInt2206
						&& i_441_ == ((s) this).anInt2206) {
					class328.aShortArray2750[i_439_] = (short) (aByteArrayArray5257[i + 1][i_419_ + 1] - aByteArrayArray5259[i + 1][i_419_ + 1]);
				} else if (i_440_ == ((s) this).anInt2206 && i_441_ == 0) {
					class328.aShortArray2750[i_439_] = (short) (aByteArrayArray5257[i + 1][i_419_] - aByteArrayArray5259[i + 1][i_419_]);
				} else {
					final int i_442_ = (((aByteArrayArray5257[i][i_419_] - aByteArrayArray5259[i][i_419_]) * (((s) this).anInt2206 - i_440_)) + (aByteArrayArray5257[i + 1][i_419_] - aByteArrayArray5259[i + 1][i_419_])
							* i_440_);
					final int i_443_ = (((aByteArrayArray5257[i][i_419_ + 1] - aByteArrayArray5259[i][i_419_ + 1]) * (((s) this).anInt2206 - i_440_)) + ((aByteArrayArray5257[i + 1][i_419_ + 1] - aByteArrayArray5259[i + 1][i_419_ + 1]) * i_440_));
					class328.aShortArray2750[i_439_] = (short) ((i_442_
							* (((s) this).anInt2206 - i_441_) + i_443_ * i_441_) >> 2 * ((s) this).anInt2200);
				}
				final int i_444_ = (i << ((s) this).anInt2200) + i_440_;
				final int i_445_ = (i_419_ << ((s) this).anInt2200) + i_441_;
				class328.aShortArray2755[i_439_] = (short) i_440_;
				class328.aShortArray2757[i_439_] = (short) i_441_;
				class328.aShortArray2754[i_439_] = (short) (method3417(i_444_,
						i_445_, true) + (is_420_ != null ? is_420_[i_439_] : 0));
				if (class328.aShortArray2750[i_439_] < 2) {
					class328.aShortArray2750[i_439_] = (short) 2;
				}
			}
			boolean bool_446_ = false;
			int i_447_ = 0;
			for (int i_448_ = 0; i_448_ < i_438_; i_448_++) {
				if (is_426_[i_448_] >= 0 || is_427_ != null
						&& is_427_[i_448_] >= 0) {
					i_447_++;
				}
				final int i_449_ = is_428_[i_448_];
				if (i_449_ != -1) {
					final TextureDefinition textureDefinition = ((ha) aHa_Sub2_5269).aD938
							.method11(i_449_, -28755);
					if (!textureDefinition.aBoolean1825) {
						bool_446_ = true;
						if (method3441(textureDefinition.aByte1820)
								|| textureDefinition.aByte1823 != 0
								|| textureDefinition.aByte1837 != 0) {
							class328.aByte2747 |= 0x4;
						}
					}
				}
			}
			class328.anIntArray2749 = new int[i_447_];
			if (is_427_ != null) {
				class328.anIntArray2756 = new int[i_447_];
			}
			class328.aShortArray2758 = new short[i_447_];
			class328.aShortArray2751 = new short[i_447_];
			class328.aShortArray2759 = new short[i_447_];
			if (bool_446_) {
				class328.aShortArray2752 = new short[i_447_];
				class328.aShortArray2753 = new short[i_447_];
			}
			for (int i_450_ = 0; i_450_ < i_438_; i_450_++) {
				if (is_426_[i_450_] >= 0 || is_427_ != null
						&& is_427_[i_450_] >= 0) {
					if (is_426_[i_450_] >= 0) {
						class328.anIntArray2749[class328.aShort2746] = Class111_Sub2
								.method2117(is_426_[i_450_], -107);
					} else {
						class328.anIntArray2749[class328.aShort2746] = -1;
					}
					if (is_427_ != null) {
						if (is_427_[i_450_] != -1) {
							class328.anIntArray2756[class328.aShort2746] = Class111_Sub2
									.method2117(is_427_[i_450_], 110);
						} else {
							class328.anIntArray2756[class328.aShort2746] = -1;
						}
					}
					class328.aShortArray2758[class328.aShort2746] = (short) is_423_[i_450_];
					class328.aShortArray2751[class328.aShort2746] = (short) is_424_[i_450_];
					class328.aShortArray2759[class328.aShort2746] = (short) is_425_[i_450_];
					if (bool_446_) {
						if (is_428_[i_450_] != -1
								&& !(((ha) aHa_Sub2_5269).aD938.method11(
										is_428_[i_450_], -28755).aBoolean1825)) {
							class328.aShortArray2752[class328.aShort2746] = (short) is_428_[i_450_];
							class328.aShortArray2753[class328.aShort2746] = (short) is_429_[i_450_];
						} else {
							class328.aShortArray2752[class328.aShort2746] = (short) -1;
						}
					}
					class328.aShort2746++;
				}
			}
			aClass328ArrayArray5261[i][i_419_] = class328;
		} else if (is_426_[0] >= 0 || is_427_ != null && is_427_[0] >= 0) {
			final Class327 class327 = new Class327();
			final int i_451_ = is_426_[0];
			final int i_452_ = is_428_[0];
			if (is_427_ != null) {
				class327.anInt2743 = (Class246_Sub7
						.method3132(
								(aByteArrayArray5257[i][i_419_] - aByteArrayArray5259[i][i_419_]),
								(byte) 118,
								Class111_Sub2.method2117(is_427_[0], -112)));
				if (i_451_ == -1) {
					class327.aByte2740 |= 0x2;
				}
			}
			if ((((s) this).anIntArrayArray2201[i][i_419_] == ((s) this).anIntArrayArray2201[i + 1][i_419_])
					&& (((s) this).anIntArrayArray2201[i][i_419_] == ((s) this).anIntArrayArray2201[i + 1][i_419_ + 1])
					&& (((s) this).anIntArrayArray2201[i][i_419_] == ((s) this).anIntArrayArray2201[i][i_419_ + 1])) {
				class327.aByte2740 |= 0x1;
			}
			TextureDefinition textureDefinition = null;
			if (i_452_ != -1) {
				textureDefinition = ((ha) aHa_Sub2_5269).aD938.method11(i_452_, -28755);
			}
			if (textureDefinition != null && (class327.aByte2740 & 0x2) == 0
					&& !textureDefinition.aBoolean1825) {
				class327.aShort2741 = (short) (aByteArrayArray5257[i][i_419_] - aByteArrayArray5259[i][i_419_]);
				class327.aShort2739 = (short) (aByteArrayArray5257[i + 1][i_419_] - aByteArrayArray5259[i + 1][i_419_]);
				class327.aShort2745 = (short) (aByteArrayArray5257[i + 1][i_419_ + 1] - aByteArrayArray5259[i + 1][i_419_ + 1]);
				class327.aShort2742 = (short) (aByteArrayArray5257[i][i_419_ + 1] - aByteArrayArray5259[i][i_419_ + 1]);
				class327.aShort2744 = (short) i_452_;
				if (method3441(textureDefinition.aByte1820) || textureDefinition.aByte1823 != 0
						|| textureDefinition.aByte1837 != 0) {
					class327.aByte2740 |= 0x4;
				}
			} else {
				final short i_453_ = Class111_Sub2.method2117(i_451_, -105);
				class327.aShort2741 = (short) Class246_Sub7
						.method3132(
								((aByteArrayArray5257[i][i_419_]) - (aByteArrayArray5259[i][i_419_])),
								(byte) 118, i_453_);
				class327.aShort2739 = (short) Class246_Sub7
						.method3132(
								((aByteArrayArray5257[i + 1][i_419_]) - (aByteArrayArray5259[i + 1][i_419_])),
								(byte) 118, i_453_);
				class327.aShort2745 = (short) Class246_Sub7
						.method3132(
								((aByteArrayArray5257[i + 1][i_419_ + 1]) - (aByteArrayArray5259[i + 1][i_419_ + 1])),
								(byte) 118, i_453_);
				class327.aShort2742 = (short) Class246_Sub7
						.method3132(
								((aByteArrayArray5257[i][i_419_ + 1]) - (aByteArrayArray5259[i][i_419_ + 1])),
								(byte) 118, i_453_);
				class327.aShort2744 = (short) -1;
			}
			aClass327ArrayArray5265[i][i_419_] = class327;
		}
	}

	@Override
	final void wa(final r var_r, final int i, final int i_454_,
			final int i_455_, final int i_456_, final boolean bool) {
		/* empty */
	}

	private final void method3444(final int i, final int i_457_,
			final int i_458_, final int i_459_, final int i_460_,
			final int i_461_, final int i_462_, final boolean[][] bools,
			final Class235 class235, final Class12 class12, final int[] is,
			final int[] is_463_) {
		final int i_464_ = (i_462_ - i_460_) * i_458_ / 256;
		final int i_465_ = i_458_ >> 8;
		final boolean bool = class235.aBoolean1762;
		aHa_Sub2_5269.C(false);
		class12.aBoolean134 = false;
		class12.aBoolean130 = false;
		int i_466_ = i;
		int i_467_ = i_457_ + i_464_;
		for (int i_468_ = i_459_; i_468_ < i_461_; i_468_++) {
			for (int i_469_ = i_460_; i_469_ < i_462_; i_469_++) {
				if (bools[i_468_ - i_459_][i_469_ - i_460_]) {
					if (aClass193ArrayArray5272 != null) {
						if (aClass193ArrayArray5272[i_468_][i_469_] != null) {
							final Class193 class193 = aClass193ArrayArray5272[i_468_][i_469_];
							if (class193.aShort1487 != -1
									&& (class193.aByte1492 & 0x2) == 0
									&& class193.anInt1494 == 0) {
								final int i_470_ = aHa_Sub2_5269
										.method1926(class193.aShort1487);
								class12.method216(i_467_ - i_465_, i_467_
										- i_465_, i_467_, i_466_ + i_465_,
										i_466_, i_466_ + i_465_, 100.0F,
										100.0F, 100.0F, (Class246_Sub7
												.method3132(class193.anInt1493,
														(byte) 118, i_470_)),
										(Class246_Sub7.method3132(
												class193.anInt1484, (byte) 118,
												i_470_)), (Class246_Sub7
												.method3132(class193.anInt1491,
														(byte) 118, i_470_)));
								class12.method216(i_467_, i_467_, i_467_
										- i_465_, i_466_, i_466_ + i_465_,
										i_466_, 100.0F, 100.0F, 100.0F,
										(Class246_Sub7.method3132(
												class193.anInt1490, (byte) 118,
												i_470_)), (Class246_Sub7
												.method3132(class193.anInt1491,
														(byte) 118, i_470_)),
										(Class246_Sub7.method3132(
												class193.anInt1484, (byte) 118,
												i_470_)));
							} else if (class193.anInt1494 == 0) {
								class12.method206(i_467_ - i_465_, i_467_
										- i_465_, i_467_, i_466_ + i_465_,
										i_466_, i_466_ + i_465_, 100.0F,
										100.0F, 100.0F, class193.anInt1493,
										class193.anInt1484, class193.anInt1491);
								class12.method206(i_467_, i_467_, i_467_
										- i_465_, i_466_, i_466_ + i_465_,
										i_466_, 100.0F, 100.0F, 100.0F,
										class193.anInt1490, class193.anInt1491,
										class193.anInt1484);
							} else {
								final int i_471_ = class193.anInt1494;
								class12.method206(
										i_467_ - i_465_,
										i_467_ - i_465_,
										i_467_,
										i_466_ + i_465_,
										i_466_,
										i_466_ + i_465_,
										100.0F,
										100.0F,
										100.0F,
										(Class98_Sub46_Sub5
												.method1544(
														(class193.anInt1493 & ~0xffffff),
														(byte) 105, i_471_)),
										(Class98_Sub46_Sub5
												.method1544(
														(class193.anInt1484 & ~0xffffff),
														(byte) 120, i_471_)),
										(Class98_Sub46_Sub5
												.method1544(
														(class193.anInt1491 & ~0xffffff),
														(byte) 120, i_471_)));
								class12.method206(
										i_467_,
										i_467_,
										i_467_ - i_465_,
										i_466_,
										i_466_ + i_465_,
										i_466_,
										100.0F,
										100.0F,
										100.0F,
										(Class98_Sub46_Sub5
												.method1544(
														(class193.anInt1490 & ~0xffffff),
														(byte) 117, i_471_)),
										(Class98_Sub46_Sub5
												.method1544(
														(class193.anInt1491 & ~0xffffff),
														(byte) 115, i_471_)),
										(Class98_Sub46_Sub5
												.method1544(
														(class193.anInt1484 & ~0xffffff),
														(byte) 113, i_471_)));
							}
						} else if (aClass285ArrayArray5258[i_468_][i_469_] != null) {
							final Class285 class285 = aClass285ArrayArray5258[i_468_][i_469_];
							for (int i_472_ = 0; i_472_ < class285.aShort2174; i_472_++) {
								is[i_472_] = i_466_
										+ ((class285.aShortArray2176[i_472_])
												* i_465_ / ((s) this).anInt2206);
								is_463_[i_472_] = i_467_
										- ((class285.aShortArray2170[i_472_])
												* i_465_ / ((s) this).anInt2206);
							}
							for (int i_473_ = 0; i_473_ < class285.aShort2171; i_473_++) {
								final int i_474_ = i_473_ * 3;
								final int i_475_ = i_474_ + 1;
								final int i_476_ = i_475_ + 1;
								final int i_477_ = is[i_474_];
								final int i_478_ = is[i_475_];
								final int i_479_ = is[i_476_];
								final int i_480_ = is_463_[i_474_];
								final int i_481_ = is_463_[i_475_];
								final int i_482_ = is_463_[i_476_];
								if ((class285.anIntArray2175 != null)
										&& (class285.anIntArray2175[i_473_]) != 0
										&& ((class285.aShortArray2169 == null) || ((class285.aShortArray2169) != null && ((class285.aShortArray2169[i_473_]) == -1)))) {
									final int i_483_ = (class285.anIntArray2175[i_473_]);
									class12.method206(
											i_480_,
											i_481_,
											i_482_,
											i_477_,
											i_478_,
											i_479_,
											100.0F,
											100.0F,
											100.0F,
											(Class98_Sub46_Sub5
													.method1544(
															-16777216
																	- ((class285.anIntArray2173[i_474_]) & ~0xffffff),
															(byte) 125, i_483_)),
											(Class98_Sub46_Sub5
													.method1544(
															-16777216
																	- ((class285.anIntArray2173[i_475_]) & ~0xffffff),
															(byte) 124, i_483_)),
											(Class98_Sub46_Sub5
													.method1544(
															-16777216
																	- ((class285.anIntArray2173[i_476_]) & ~0xffffff),
															(byte) 111, i_483_)));
								} else if ((class285.aShortArray2169) != null
										&& ((class285.aShortArray2169[i_473_]) != -1)) {
									final int i_484_ = (aHa_Sub2_5269
											.method1926(class285.aShortArray2169[i_473_]));
									class12.method216(i_480_, i_481_, i_482_,
											i_477_, i_478_, i_479_, 100.0F,
											100.0F, 100.0F, i_484_, i_484_,
											i_484_);
								} else {
									class12.method206(i_480_, i_481_, i_482_,
											i_477_, i_478_, i_479_, 100.0F,
											100.0F, 100.0F,
											(class285.anIntArray2173[i_474_]),
											(class285.anIntArray2173[i_475_]),
											(class285.anIntArray2173[i_476_]));
								}
							}
						}
					} else if (aClass120ArrayArray5266[i_468_][i_469_] != null) {
						final Class120 class120 = aClass120ArrayArray5266[i_468_][i_469_];
						for (int i_485_ = 0; i_485_ < class120.aShort994; i_485_++) {
							is[i_485_] = i_466_
									+ ((class120.aShortArray995[i_485_])
											* i_465_ / ((s) this).anInt2206);
							is_463_[i_485_] = i_467_
									- ((class120.aShortArray992[i_485_])
											* i_465_ / ((s) this).anInt2206);
						}
						for (int i_486_ = 0; i_486_ < class120.aShort991; i_486_++) {
							final int i_487_ = i_486_ * 3;
							final int i_488_ = i_487_ + 1;
							final int i_489_ = i_488_ + 1;
							final int i_490_ = is[i_487_];
							final int i_491_ = is[i_488_];
							final int i_492_ = is[i_489_];
							final int i_493_ = is_463_[i_487_];
							final int i_494_ = is_463_[i_488_];
							final int i_495_ = is_463_[i_489_];
							if (class120.anIntArray997 != null
									&& (class120.anIntArray997[i_486_] != 0)) {
								final int i_496_ = (class120.anIntArray997[i_486_]);
								class12.method206(i_493_, i_494_, i_495_,
										i_490_, i_491_, i_492_, 100.0F, 100.0F,
										100.0F, i_496_, i_496_, i_496_);
							} else {
								class12.method206(i_493_, i_494_, i_495_,
										i_490_, i_491_, i_492_, 100.0F, 100.0F,
										100.0F,
										(class120.anIntArray999[i_487_]),
										(class120.anIntArray999[i_488_]),
										(class120.anIntArray999[i_489_]));
							}
						}
					}
				}
				i_467_ -= i_465_;
			}
			i_467_ = i_457_ + i_464_;
			i_466_ += i_465_;
		}
		class12.aBoolean134 = true;
		aHa_Sub2_5269.C(bool);
	}

	@Override
	final void CA(final r var_r, final int i, final int i_497_,
			final int i_498_, final int i_499_, final boolean bool) {
		/* empty */
	}
}
