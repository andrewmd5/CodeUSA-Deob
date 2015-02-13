/* Class98_Sub10_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class98_Sub10_Sub28 extends Class98_Sub10 {
	private int anInt5694 = 1024;
	private int anInt5695;
	private int anInt5696 = 1024;
	static IncomingOpcode aClass58_5697 = new IncomingOpcode(97, 2);
	private int anInt5698;
	private int anInt5699;
	private int anInt5700;
	private int anInt5701;
	private int anInt5702;
	private int anInt5703;
	static Class332 aClass332_5704;
	static ByteBuffer aClass98_Sub22_5705;
	private int anInt5706;

	public static void method1088(final int i) {
		try {
			aClass332_5704 = null;
			aClass98_Sub22_5705 = null;
			aClass58_5697 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "po.D(" + i + ')');
		}
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_1_) {
		try {
			final int i_2_ = i;
			while_158_: do {
				while_157_: do {
					while_156_: do {
						while_155_: do {
							while_154_: do {
								while_153_: do {
									while_152_: do {
										do {
											if (i_2_ != 0) {
												if (i_2_ != 1) {
													if (i_2_ != 2) {
														if (i_2_ != 3) {
															if ((i_2_ ^ 0xffffffff) != -5) {
																if (i_2_ != 5) {
																	if ((i_2_ ^ 0xffffffff) != -7) {
																		if (i_2_ != 7) {
																			if ((i_2_ ^ 0xffffffff) == -9) {
																				break while_157_;
																			}
																			break while_158_;
																		}
																	} else {
																		break while_155_;
																	}
																	break while_156_;
																}
															} else {
																break while_153_;
															}
															break while_154_;
														}
													} else {
														break;
													}
													break while_152_;
												}
											} else {
												anInt5700 = (class98_sub22
														.readUnsignedByte((byte) -122));
												break while_158_;
											}
											anInt5698 = class98_sub22
													.readUnsignedShort((byte) 127);
											break while_158_;
										} while (false);
										anInt5701 = class98_sub22
												.readUnsignedShort((byte) 127);
										break while_158_;
									} while (false);
									anInt5702 = class98_sub22
											.readUnsignedShort((byte) 127);
									break while_158_;
								} while (false);
								anInt5695 = class98_sub22.readUnsignedShort((byte) 127);
								break while_158_;
							} while (false);
							anInt5696 = class98_sub22.readUnsignedShort((byte) 127);
							break while_158_;
						} while (false);
						anInt5703 = class98_sub22.readUnsignedByte((byte) -113);
						break while_158_;
					} while (false);
					anInt5694 = class98_sub22.readUnsignedShort((byte) 127);
					break while_158_;
				} while (false);
				anInt5699 = class98_sub22.readUnsignedShort((byte) 127);
			} while (false);
			if (i_1_ > -92) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("po.A(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i_1_ + ')'));
		}
	}

	public Class98_Sub10_Sub28() {
		super(0, true);
		anInt5695 = 819;
		anInt5700 = 0;
		anInt5698 = 1024;
		anInt5702 = 409;
		anInt5699 = 1024;
		anInt5703 = 0;
		anInt5701 = 2048;
	}

	private final void method1089(final byte i, final int i_3_, int i_4_,
			final Random random, final int[][] is, final int i_5_,
			final int i_6_) {
		try {
			final int i_7_ = (anInt5699 <= 0 ? 4096 : 4096 - Class63.method546(
					-28737, anInt5699, random));
			final int i_8_ = anInt5706 * anInt5694 >> 1951392652;
			final int i_9_ = anInt5706
					+ -((i_8_ ^ 0xffffffff) >= -1 ? 0 : Class63.method546(
							-28737, i_8_, random));
			if (Class25.anInt268 <= i_4_) {
				i_4_ -= Class25.anInt268;
			}
			if (i >= 39) {
				if (i_9_ > 0) {
					if ((i_6_ ^ 0xffffffff) < -1 && i_3_ > 0) {
						final int i_10_ = i_3_ / 2;
						final int i_11_ = i_6_ / 2;
						final int i_12_ = ((i_9_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff) ? i_10_
								: i_9_);
						final int i_13_ = ((i_11_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff) ? i_11_
								: i_9_);
						final int i_14_ = i_4_ - -i_12_;
						final int i_15_ = -(2 * i_12_) + i_3_;
						for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_16_++) {
							final int[] is_17_ = is[i_16_ - -i_5_];
							if ((i_16_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff)) {
								final int i_18_ = i_7_ * i_16_ / i_13_;
								if (anInt5703 == 0) {
									for (int i_19_ = 0; ((i_19_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff)); i_19_++) {
										final int i_20_ = i_19_ * i_7_ / i_12_;
										is_17_[Class202.method2702(
												i_4_ + i_19_,
												(Class329.anInt2761))] = is_17_[(Class202
												.method2702(
														(-1 + -i_19_ + i_3_ + i_4_),
														Class329.anInt2761))] = i_20_
												* i_18_ >> -895330964;
									}
								} else {
									for (int i_21_ = 0; ((i_21_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff)); i_21_++) {
										final int i_22_ = i_7_ * i_21_ / i_12_;
										is_17_[Class202.method2702(
												(Class329.anInt2761), i_21_
														+ i_4_)] = is_17_[(Class202
												.method2702(Class329.anInt2761,
														-i_21_ + i_4_
																- (-i_3_ + 1)))] = i_22_ < i_18_ ? i_22_
												: i_18_;
									}
								}
								if ((Class25.anInt268 ^ 0xffffffff) <= (i_14_
										- -i_15_ ^ 0xffffffff)) {
									Class236.method2896(is_17_, i_14_, i_15_,
											i_18_);
								} else {
									final int i_23_ = -i_14_ + Class25.anInt268;
									Class236.method2896(is_17_, i_14_, i_23_,
											i_18_);
									Class236.method2896(is_17_, 0, i_15_
											+ -i_23_, i_18_);
								}
							} else {
								final int i_24_ = -1 + i_6_ + -i_16_;
								if ((i_13_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff)) {
									final int i_25_ = i_24_ * i_7_ / i_13_;
									if (anInt5703 == 0) {
										for (int i_26_ = 0; i_12_ > i_26_; i_26_++) {
											final int i_27_ = i_26_ * i_7_
													/ i_12_;
											is_17_[(Class202.method2702(
													Class329.anInt2761, i_4_
															+ i_26_))] = is_17_[(Class202
													.method2702(
															(i_4_ + i_3_
																	- i_26_ + -1),
															(Class329.anInt2761)))] = i_27_
													* i_25_ >> 1830367756;
										}
									} else {
										for (int i_28_ = 0; i_28_ < i_12_; i_28_++) {
											final int i_29_ = i_28_ * i_7_
													/ i_12_;
											is_17_[(Class202.method2702(
													Class329.anInt2761, i_28_
															+ i_4_))] = is_17_[(Class202
													.method2702(
															Class329.anInt2761,
															(-1 + i_3_ + (i_4_ + -i_28_))))] = (i_29_ >= i_25_ ? i_25_
													: i_29_);
										}
									}
									if ((Class25.anInt268 ^ 0xffffffff) > (i_14_
											+ i_15_ ^ 0xffffffff)) {
										final int i_30_ = -i_14_
												+ Class25.anInt268;
										Class236.method2896(is_17_, i_14_,
												i_30_, i_25_);
										Class236.method2896(is_17_, 0, -i_30_
												+ i_15_, i_25_);
									} else {
										Class236.method2896(is_17_, i_14_,
												i_15_, i_25_);
									}
								} else {
									for (int i_31_ = 0; i_12_ > i_31_; i_31_++) {
										is_17_[Class202.method2702(
												i_31_ + i_4_,
												(Class329.anInt2761))] = is_17_[(Class202
												.method2702(
														Class329.anInt2761,
														(-i_31_ + (i_3_ + i_4_) - 1)))] = i_7_
												* i_31_ / i_12_;
									}
									if (Class25.anInt268 >= i_14_ + i_15_) {
										Class236.method2896(is_17_, i_14_,
												i_15_, i_7_);
									} else {
										final int i_32_ = Class25.anInt268
												+ -i_14_;
										Class236.method2896(is_17_, i_14_,
												i_32_, i_7_);
										Class236.method2896(is_17_, 0, i_15_
												+ -i_32_, i_7_);
									}
								}
							}
						}
					}
				} else if (i_3_ + i_4_ <= Class25.anInt268) {
					for (int i_33_ = 0; i_6_ > i_33_; i_33_++) {
						Class236.method2896(is[i_33_ + i_5_], i_4_, i_3_, i_7_);
					}
				} else {
					final int i_34_ = -i_4_ + Class25.anInt268;
					for (int i_35_ = 0; (i_6_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff); i_35_++) {
						final int[] is_36_ = is[i_35_ + i_5_];
						Class236.method2896(is_36_, i_4_, i_34_, i_7_);
						Class236.method2896(is_36_, 0, i_3_ + -i_34_, i_7_);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("po.B(" + i + ',' + i_3_ + ',' + i_4_ + ','
							+ (random != null ? "{...}" : "null") + ','
							+ (is != null ? "{...}" : "null") + ',' + i_5_
							+ ',' + i_6_ + ')'));
		}
	}

	@Override
	final int[] method990(final int i, final int i_37_) {
		try {
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_37_);
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				final int[][] is_38_ = ((Class98_Sub10) this).aClass16_3863
						.method238(98);
				int i_39_ = 0;
				int i_40_ = 0;
				int i_41_ = 0;
				int i_42_ = 0;
				int i_43_ = 0;
				boolean bool = true;
				boolean bool_44_ = true;
				int i_45_ = 0;
				int i_46_ = 0;
				final int i_47_ = anInt5698 * Class25.anInt268 >> -697803540;
				final int i_48_ = anInt5701 * Class25.anInt268 >> 2123484780;
				final int i_49_ = Class63.anInt492 * anInt5702 >> 669504172;
				final int i_50_ = Class63.anInt492 * anInt5695 >> 1744932684;
				if (i_50_ <= 1) {
					return is_38_[i_37_];
				}
				anInt5706 = Class25.anInt268 / 8 * anInt5696 >> 2057408108;
				final int i_51_ = 1 + Class25.anInt268 / i_47_;
				int[][] is_52_ = new int[i_51_][3];
				int[][] is_53_ = new int[i_51_][3];
				final Random random = new Random(anInt5700);
				for (;;) {
					int i_54_ = (Class63.method546(i ^ ~0x70bf, i_48_ - i_47_,
							random) + i_47_);
					int i_55_ = (Class63.method546(-28737, i_50_ - i_49_,
							random) + i_49_);
					int i_56_ = i_42_ + i_54_;
					if (i_56_ > Class25.anInt268) {
						i_56_ = Class25.anInt268;
						i_54_ = Class25.anInt268 + -i_42_;
					}
					int i_57_;
					if (bool_44_) {
						i_57_ = 0;
					} else {
						int i_58_ = i_43_;
						final int[] is_59_ = is_53_[i_43_];
						int i_60_ = 0;
						int i_61_ = i_39_ + i_56_;
						if (i_61_ < 0) {
							i_61_ += Class25.anInt268;
						}
						if (i_61_ > Class25.anInt268) {
							i_61_ -= Class25.anInt268;
						}
						i_57_ = is_59_[2];
						for (;;) {
							final int[] is_62_ = is_53_[i_58_];
							if ((i_61_ ^ 0xffffffff) <= (is_62_[0] ^ 0xffffffff)
									&& is_62_[1] >= i_61_) {
								break;
							}
							i_60_++;
							if (i_45_ <= ++i_58_) {
								i_58_ = 0;
							}
						}
						if (i_43_ != i_58_) {
							int i_63_ = i_42_ + i_39_;
							if (i_63_ < 0) {
								i_63_ += Class25.anInt268;
							}
							if (i_63_ > Class25.anInt268) {
								i_63_ -= Class25.anInt268;
							}
							for (int i_64_ = 1; (i_60_ ^ 0xffffffff) <= (i_64_ ^ 0xffffffff); i_64_++) {
								final int[] is_65_ = is_53_[(i_64_ + i_43_)
										% i_45_];
								i_57_ = Math.max(i_57_, is_65_[2]);
							}
							for (int i_66_ = 0; i_66_ <= i_60_; i_66_++) {
								final int[] is_67_ = is_53_[(i_66_ + i_43_)
										% i_45_];
								final int i_68_ = is_67_[2];
								if ((i_68_ ^ 0xffffffff) != (i_57_ ^ 0xffffffff)) {
									final int i_69_ = is_67_[0];
									final int i_70_ = is_67_[1];
									int i_71_;
									int i_72_;
									if ((i_63_ ^ 0xffffffff) <= (i_61_ ^ 0xffffffff)) {
										if (i_69_ != 0) {
											i_71_ = Math.max(i_63_, i_69_);
											i_72_ = Class25.anInt268;
										} else {
											i_72_ = Math.min(i_61_, i_70_);
											i_71_ = 0;
										}
									} else {
										i_71_ = Math.max(i_63_, i_69_);
										i_72_ = Math.min(i_61_, i_70_);
									}
									method1089((byte) 101, i_72_ - i_71_, i_41_
											+ i_71_, random, is_38_, i_68_,
											-i_68_ + i_57_);
								}
							}
						}
						i_43_ = i_58_;
					}
					if ((Class63.anInt492 ^ 0xffffffff) > (i_57_ - -i_55_ ^ 0xffffffff)) {
						i_55_ = -i_57_ + Class63.anInt492;
					} else {
						bool = false;
					}
					if (i_56_ != Class25.anInt268) {
						final int[] is_73_ = is_52_[i_46_++];
						is_73_[1] = i_56_;
						is_73_[0] = i_42_;
						is_73_[2] = i_57_ - -i_55_;
						method1089((byte) 96, i_54_, i_42_ + i_40_, random,
								is_38_, i_57_, i_55_);
						i_42_ = i_56_;
					} else {
						method1089((byte) 126, i_54_, i_42_ - -i_40_, random,
								is_38_, i_57_, i_55_);
						if (bool) {
							break;
						}
						bool = true;
						final int[] is_74_ = is_52_[i_46_++];
						is_74_[1] = i_56_;
						is_74_[0] = i_42_;
						is_74_[2] = i_57_ - -i_55_;
						final int[][] is_75_ = is_53_;
						is_53_ = is_52_;
						i_45_ = i_46_;
						is_52_ = is_75_;
						i_41_ = i_40_;
						i_46_ = 0;
						i_40_ = Class63.method546(-28737, Class25.anInt268,
								random);
						i_42_ = 0;
						i_39_ = -i_41_ + i_40_;
						int i_76_ = i_39_;
						if (i_76_ < 0) {
							i_76_ += Class25.anInt268;
						}
						i_43_ = 0;
						if (i_76_ > Class25.anInt268) {
							i_76_ -= Class25.anInt268;
						}
						bool_44_ = false;
						for (;;) {
							final int[] is_77_ = is_53_[i_43_];
							if ((is_77_[0] ^ 0xffffffff) >= (i_76_ ^ 0xffffffff)
									&& i_76_ <= is_77_[1]) {
								break;
							}
							if (++i_43_ >= i_45_) {
								i_43_ = 0;
							}
						}
					}
				}
			}
			if (i != 255) {
				anInt5696 = -8;
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "po.G(" + i + ','
					+ i_37_ + ')');
		}
	}

	@Override
	final void method1001(final byte i) {
		do {
			try {
				if (i == 66) {
					break;
				}
				anInt5694 = 64;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "po.I(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
