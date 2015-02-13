/* Class98_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub37 extends Class98 {
	private Class98_Sub5 aClass98_Sub5_4163;
	private ha_Sub1 aHa_Sub1_4164;
	private float[][] aFloatArrayArray4165;
	private Class98_Sub22_Sub2 aClass98_Sub22_Sub2_4166;
	private int anInt4167;
	static OutgoingOpcode aClass171_4168 = new OutgoingOpcode(80, 3);
	private Interface8 anInterface8_4169;
	private ByteBuffer aClass98_Sub22_4170;
	private float[][] aFloatArrayArray4171;
	private int anInt4172;
	private int anInt4173;
	private int anInt4174;
	private int anInt4175;
	private Interface16 anInterface16_4176;
	private float[][] aFloatArrayArray4177;
	static Class225 aClass225_4178;
	private Class377 aClass377_4179;
	private Class104 aClass104_4180;
	private int anInt4181;
	private s_Sub1 aS_Sub1_4182;
	private Class104 aClass104_4183;
	static int anInt4184;
	static ha aHa4185;

	static final void method1460(int i, final int i_0_, final int i_1_,
			int i_2_, final int i_3_, int i_4_, final float[] fs,
			final float f, final int i_5_, final int i_6_, final float f_7_,
			final float[] fs_8_) {
		try {
			i_4_ -= i_3_;
			i_2_ -= i_0_;
			i -= i_6_;
			final float f_9_ = (fs[0] * i + i_4_ * fs[1] + i_2_ * fs[2]);
			final float f_10_ = (fs[5] * i_2_ + (i_4_ * fs[4] + fs[3] * i));
			final float f_11_ = (i_4_ * fs[7] + fs[6] * i + i_2_ * fs[i_1_]);
			float f_12_ = (((float) Math.atan2(f_9_, f_11_) / 6.2831855F) + 0.5F);
			if (f != 1.0F) {
				f_12_ *= f;
			}
			float f_13_ = 0.5F + f_10_ + f_7_;
			if (i_5_ == 1) {
				final float f_14_ = f_12_;
				f_12_ = -f_13_;
				f_13_ = f_14_;
			} else if ((i_5_ ^ 0xffffffff) != -3) {
				if ((i_5_ ^ 0xffffffff) == -4) {
					final float f_15_ = f_12_;
					f_12_ = f_13_;
					f_13_ = -f_15_;
				}
			} else {
				f_12_ = -f_12_;
				f_13_ = -f_13_;
			}
			fs_8_[0] = f_12_;
			fs_8_[1] = f_13_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pp.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + (fs != null ? "{...}" : "null") + ',' + f + ','
					+ i_5_ + ',' + i_6_ + ',' + f_7_ + ','
					+ (fs_8_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1461(final int i, final int i_16_, final int i_17_,
			final boolean[][] bools, final byte i_18_) {
		try {
			if (anInterface8_4169 != null
					&& (i_17_ + i_16_ ^ 0xffffffff) <= (anInt4181 ^ 0xffffffff)
					&& -i_16_ + i_17_ <= anInt4172 && i_18_ >= 31
					&& i_16_ + i >= anInt4174 && anInt4173 >= i - i_16_) {
				for (int i_19_ = anInt4174; (anInt4173 ^ 0xffffffff) <= (i_19_ ^ 0xffffffff); i_19_++) {
					for (int i_20_ = anInt4181; (anInt4172 ^ 0xffffffff) <= (i_20_ ^ 0xffffffff); i_20_++) {
						final int i_21_ = -i_17_ + i_20_;
						final int i_22_ = -i + i_19_;
						if (-i_16_ < i_21_
								&& (i_21_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff)
								&& (-i_16_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff)
								&& (i_22_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff)
								&& bools[i_21_ + i_16_][i_16_ + i_22_]) {
							aHa_Sub1_4164.method1882(
									((int) (255.0F * aClass98_Sub5_4163
											.method956(false)) << 2088417752),
									-120);
							aHa_Sub1_4164.method1868(aClass104_4183, null,
									null, aClass104_4180, 0);
							aHa_Sub1_4164.method1865(anInt4167, 4,
									anInterface8_4169, false, 0);
							return;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pp.B(" + i + ','
					+ i_16_ + ',' + i_17_ + ','
					+ (bools != null ? "{...}" : "null") + ',' + i_18_ + ')'));
		}
	}

	private final void method1462(final int i, final int i_23_,
			final int i_24_, final int i_25_, final int i_26_, final int i_27_,
			final int i_28_) {
		do {
			try {
				long l = -1L;
				final int i_29_ = i_26_
						- -(i_27_ << ((s) aS_Sub1_4182).anInt2200);
				final int i_30_ = (i_25_ << ((s) aS_Sub1_4182).anInt2200)
						+ i_23_;
				final int i_31_ = aS_Sub1_4182.method3417(i_29_, i_30_, true);
				if ((i_26_ & 0x7f ^ 0xffffffff) == -1 || (i_23_ & 0x7f) == 0) {
					l = ((0xffffL & i_30_) << 1522918928 | 0xffffL & i_29_);
					final Class98 class98 = aClass377_4179.method3990(l, -1);
					if (class98 != null) {
						method1464(1522918928,
								(((Class98_Sub40) class98).aShort4191));
						break;
					}
				}
				final short i_32_ = (short) anInt4175++;
				if (l != -1L) {
					aClass377_4179.method3996(new Class98_Sub40(i_32_), l, -1);
				}
				float f;
				float f_33_;
				float f_34_;
				if (i_26_ != 0 || i_23_ != 0) {
					if (((s) aS_Sub1_4182).anInt2206 != i_26_
							|| (i_23_ ^ 0xffffffff) != -1) {
						if (((i_26_ ^ 0xffffffff) != (((s) aS_Sub1_4182).anInt2206 ^ 0xffffffff))
								|| i_23_ != ((s) aS_Sub1_4182).anInt2206) {
							if ((i_26_ ^ 0xffffffff) != -1
									|| ((s) aS_Sub1_4182).anInt2206 != i_23_) {
								final float f_35_ = ((float) i_26_ / (float) ((s) aS_Sub1_4182).anInt2206);
								final float f_36_ = ((float) i_23_ / (float) ((s) aS_Sub1_4182).anInt2206);
								float f_37_ = aFloatArrayArray4165[i_28_][i_24_];
								float f_38_ = aFloatArrayArray4171[i_28_][i_24_];
								float f_39_ = aFloatArrayArray4177[i_28_][i_24_];
								float f_40_ = aFloatArrayArray4165[1 + i_28_][i_24_];
								float f_41_ = aFloatArrayArray4171[i_28_ + 1][i_24_];
								float f_42_ = aFloatArrayArray4177[1 + i_28_][i_24_];
								f_37_ += (aFloatArrayArray4165[i_28_][i_24_
										- -1] - f_37_)
										* f_35_;
								f_41_ += f_35_
										* (-f_41_ + (aFloatArrayArray4171[i_28_
												- -1][i_24_ + 1]));
								f_39_ += (-f_39_ + (aFloatArrayArray4177[i_28_][i_24_ + 1]))
										* f_35_;
								f_40_ += f_35_
										* (-f_40_ + (aFloatArrayArray4165[1 + i_28_][i_24_ + 1]));
								f_38_ += f_35_
										* ((aFloatArrayArray4171[i_28_][i_24_
												- -1]) - f_38_);
								f_42_ += f_35_
										* ((aFloatArrayArray4177[1 + i_28_][i_24_
												- -1]) - f_42_);
								f_33_ = (-f_38_ + f_41_) * f_36_ + f_38_;
								f = f_37_ + (-f_37_ + f_40_) * f_36_;
								f_34_ = f_39_ + f_36_ * (f_42_ - f_39_);
							} else {
								f_33_ = aFloatArrayArray4171[i_28_][1 + i_24_];
								f_34_ = aFloatArrayArray4177[i_28_][i_24_ + 1];
								f = aFloatArrayArray4165[i_28_][1 + i_24_];
							}
						} else {
							f_33_ = aFloatArrayArray4171[1 + i_28_][1 + i_24_];
							f = aFloatArrayArray4165[1 + i_28_][i_24_ + 1];
							f_34_ = aFloatArrayArray4177[1 + i_28_][1 + i_24_];
						}
					} else {
						f_33_ = aFloatArrayArray4171[i_28_ - -1][i_24_];
						f = aFloatArrayArray4165[1 + i_28_][i_24_];
						f_34_ = aFloatArrayArray4177[1 + i_28_][i_24_];
					}
				} else {
					f = aFloatArrayArray4165[i_28_][i_24_];
					f_33_ = aFloatArrayArray4171[i_28_][i_24_];
					f_34_ = aFloatArrayArray4177[i_28_][i_24_];
				}
				float f_43_ = aClass98_Sub5_4163.method954(7019) + -i_29_;
				float f_44_ = -i_31_ + aClass98_Sub5_4163.method963((byte) 73);
				float f_45_ = aClass98_Sub5_4163.method962(28699) - i_30_;
				final float f_46_ = (float) Math.sqrt(f_43_ * f_43_ + f_44_
						* f_44_ + f_45_ * f_45_);
				final float f_47_ = 1.0F / f_46_;
				f_44_ *= f_47_;
				f_45_ *= f_47_;
				f_43_ *= f_47_;
				final float f_48_ = f_46_ / aClass98_Sub5_4163.method958(127);
				float f_49_ = 1.0F - f_48_ * f_48_;
				if (f_49_ < 0.0F) {
					f_49_ = 0.0F;
				}
				float f_50_ = f_34_ * f_45_ + (f_33_ * f_44_ + f * f_43_);
				if (f_50_ < 0.0F) {
					f_50_ = 0.0F;
				}
				float f_51_ = 2.0F * (f_49_ * f_50_);
				if (f_51_ > 1.0F) {
					f_51_ = 1.0F;
				}
				final int i_52_ = aClass98_Sub5_4163.method961((byte) -78);
				int i_53_ = (int) (((i_52_ & 0xff1301) >> 185099056) * f_51_);
				if (i_53_ > 255) {
					i_53_ = 255;
				}
				int i_54_ = (int) (f_51_ * (0xff & i_52_ >> 1744976008));
				if ((i_54_ ^ 0xffffffff) < -256) {
					i_54_ = 255;
				}
				int i_55_ = (int) (f_51_ * (i_52_ & 0xff));
				if ((i_55_ ^ 0xffffffff) < -256) {
					i_55_ = 255;
				}
				if (!aHa_Sub1_4164.aBoolean4397) {
					aClass98_Sub22_Sub2_4166.method1265((byte) -52, i_29_);
					aClass98_Sub22_Sub2_4166.method1265((byte) -52, i_31_);
					aClass98_Sub22_Sub2_4166.method1265((byte) -52, i_30_);
				} else {
					aClass98_Sub22_Sub2_4166.method1264((byte) -126, i_29_);
					aClass98_Sub22_Sub2_4166.method1264((byte) 7, i_31_);
					aClass98_Sub22_Sub2_4166.method1264((byte) -116, i_30_);
				}
				aClass98_Sub22_Sub2_4166.method1194(i_53_, -92);
				aClass98_Sub22_Sub2_4166.method1194(i_54_, -85);
				aClass98_Sub22_Sub2_4166.method1194(i_55_, 124);
				aClass98_Sub22_Sub2_4166.method1194(255, -44);
				method1464(1522918928, i_32_);
				if (i >= 85) {
					break;
				}
				method1463((byte) -76);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("pp.E(" + i
						+ ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_
						+ ',' + i_27_ + ',' + i_28_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1463(final byte i) {
		try {
			aClass171_4168 = null;
			if (i != 119) {
				aClass171_4168 = null;
			}
			aClass225_4178 = null;
			aHa4185 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pp.A(" + i + ')');
		}
	}

	private final void method1464(final int i, final short i_56_) {
		try {
			do {
				if (!aHa_Sub1_4164.aBoolean4397) {
					aClass98_Sub22_4170.method1247(i_56_, 4);
					if (!client.aBoolean3553) {
						break;
					}
				}
				aClass98_Sub22_4170.writeShort(i_56_, i + 48943960);
			} while (false);
			if (i != 1522918928) {
				aClass171_4168 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pp.D(" + i + ','
					+ i_56_ + ')');
		}
	}

	Class98_Sub37(final ha_Sub1 var_ha_Sub1, final s_Sub1 var_s_Sub1,
			final Class98_Sub5 class98_sub5, final int[] is) {
		try {
			aHa_Sub1_4164 = var_ha_Sub1;
			aS_Sub1_4182 = var_s_Sub1;
			aClass98_Sub5_4163 = class98_sub5;
			final int i = (aClass98_Sub5_4163.method958(-33) - (((s) var_s_Sub1).anInt2206 >> -669182751));
			anInt4181 = (aClass98_Sub5_4163.method954(7019) - i >> ((s) var_s_Sub1).anInt2200);
			anInt4172 = (aClass98_Sub5_4163.method954(7019) - -i >> ((s) var_s_Sub1).anInt2200);
			anInt4174 = (aClass98_Sub5_4163.method962(28699) + -i >> ((s) var_s_Sub1).anInt2200);
			anInt4173 = (i + aClass98_Sub5_4163.method962(28699) >> ((s) var_s_Sub1).anInt2200);
			final int i_57_ = anInt4172 + (-anInt4181 - -1);
			final int i_58_ = -anInt4174 + anInt4173 + 1;
			aFloatArrayArray4165 = new float[1 + i_57_][1 + i_58_];
			aFloatArrayArray4171 = new float[1 + i_57_][1 + i_58_];
			aFloatArrayArray4177 = new float[i_57_ + 1][1 + i_58_];
			for (int i_59_ = 0; (i_58_ ^ 0xffffffff) <= (i_59_ ^ 0xffffffff); i_59_++) {
				final int i_60_ = anInt4174 + i_59_;
				if ((i_60_ ^ 0xffffffff) < -1
						&& (i_60_ ^ 0xffffffff) > (((s) aS_Sub1_4182).anInt2204 - 1 ^ 0xffffffff)) {
					for (int i_61_ = 0; (i_61_ ^ 0xffffffff) >= (i_57_ ^ 0xffffffff); i_61_++) {
						final int i_62_ = i_61_ + anInt4181;
						if (i_62_ > 0
								&& (-1 + ((s) aS_Sub1_4182).anInt2203 ^ 0xffffffff) < (i_62_ ^ 0xffffffff)) {
							final int i_63_ = (var_s_Sub1.method3420(i_60_,
									-12639, i_62_ + 1) + -var_s_Sub1
									.method3420(i_60_, -12639, -1 + i_62_));
							final int i_64_ = (var_s_Sub1.method3420(i_60_ + 1,
									-12639, i_62_) + -var_s_Sub1.method3420(
									i_60_ - 1, -12639, i_62_));
							final float f = (float) (1.0 / (Math.sqrt(i_64_
									* i_64_ + 65536 + i_63_ * i_63_)));
							aFloatArrayArray4165[i_61_][i_59_] = i_63_ * f;
							aFloatArrayArray4171[i_61_][i_59_] = -256.0F * f;
							aFloatArrayArray4177[i_61_][i_59_] = i_64_ * f;
						}
					}
				}
			}
			int i_65_ = 0;
			for (int i_66_ = anInt4174; (i_66_ ^ 0xffffffff) >= (anInt4173 ^ 0xffffffff); i_66_++) {
				if (i_66_ >= 0
						&& (i_66_ ^ 0xffffffff) > (((s) var_s_Sub1).anInt2204 ^ 0xffffffff)) {
					for (int i_67_ = anInt4181; (anInt4172 ^ 0xffffffff) <= (i_67_ ^ 0xffffffff); i_67_++) {
						if ((i_67_ ^ 0xffffffff) <= -1
								&& ((((s) var_s_Sub1).anInt2203 ^ 0xffffffff) < (i_67_ ^ 0xffffffff))) {
							final int i_68_ = is[i_65_];
							final int[] is_69_ = (var_s_Sub1.anIntArrayArrayArray5210[i_67_][i_66_]);
							if (is_69_ != null && (i_68_ ^ 0xffffffff) != -1) {
								if ((i_68_ ^ 0xffffffff) == -2) {
									int i_70_ = 0;
									while (is_69_.length > i_70_) {
										if ((is_69_[i_70_++] ^ 0xffffffff) != 0
												&& is_69_[i_70_++] != -1
												&& ((is_69_[i_70_++] ^ 0xffffffff) != 0)) {
											anInt4167 += 3;
										}
									}
								} else {
									anInt4167 += 3;
								}
							}
						}
						i_65_++;
					}
				} else {
					i_65_ += anInt4172 - anInt4181;
				}
			}
			if (anInt4167 > 0) {
				aClass98_Sub22_4170 = new ByteBuffer(anInt4167 * 2);
				aClass98_Sub22_Sub2_4166 = new Class98_Sub22_Sub2(
						16 * anInt4167);
				aClass377_4179 = new Class377(Class48.method453(423660257,
						anInt4167));
				i_65_ = 0;
				int i_71_ = 0;
				for (int i_72_ = anInt4174; (i_72_ ^ 0xffffffff) >= (anInt4173 ^ 0xffffffff); i_72_++) {
					if ((i_72_ ^ 0xffffffff) <= -1
							&& ((s) var_s_Sub1).anInt2204 > i_72_) {
						int i_73_ = 0;
						for (int i_74_ = anInt4181; i_74_ <= anInt4172; i_74_++) {
							if ((i_74_ ^ 0xffffffff) <= -1
									&& ((((s) var_s_Sub1).anInt2203 ^ 0xffffffff) < (i_74_ ^ 0xffffffff))) {
								final int i_75_ = is[i_65_];
								final int[] is_76_ = (var_s_Sub1.anIntArrayArrayArray5210[i_74_][i_72_]);
								if (is_76_ != null && i_75_ != 0) {
									if (i_75_ == 1) {
										final int[] is_77_ = (var_s_Sub1.anIntArrayArrayArray5192[i_74_][i_72_]);
										final int[] is_78_ = (var_s_Sub1.anIntArrayArrayArray5194[i_74_][i_72_]);
										int i_79_ = 0;
										while ((is_76_.length ^ 0xffffffff) < (i_79_ ^ 0xffffffff)) {
											if (((is_76_[i_79_] ^ 0xffffffff) != 0)
													&& is_76_[1 + i_79_] != -1
													&& (is_76_[2 + i_79_] ^ 0xffffffff) != 0) {
												method1462(101, is_78_[i_79_],
														i_71_, i_72_,
														is_77_[i_79_], i_74_,
														i_73_);
												i_79_++;
												method1462(97, is_78_[i_79_],
														i_71_, i_72_,
														is_77_[i_79_], i_74_,
														i_73_);
												i_79_++;
												method1462(106, is_78_[i_79_],
														i_71_, i_72_,
														is_77_[i_79_], i_74_,
														i_73_);
												i_79_++;
											} else {
												i_79_ += 3;
											}
										}
									} else if (i_75_ != 3) {
										if ((i_75_ ^ 0xffffffff) != -3) {
											if (i_75_ == 5) {
												method1462(
														122,
														(((s) var_s_Sub1).anInt2206),
														i_71_,
														i_72_,
														(((s) var_s_Sub1).anInt2206),
														i_74_, i_73_);
												method1462(
														90,
														(((s) var_s_Sub1).anInt2206),
														i_71_, i_72_, 0, i_74_,
														i_73_);
												method1462(
														102,
														0,
														i_71_,
														i_72_,
														(((s) var_s_Sub1).anInt2206),
														i_74_, i_73_);
											} else if ((i_75_ ^ 0xffffffff) == -5) {
												method1462(
														116,
														(((s) var_s_Sub1).anInt2206),
														i_71_, i_72_, 0, i_74_,
														i_73_);
												method1462(105, 0, i_71_,
														i_72_, 0, i_74_, i_73_);
												method1462(
														92,
														(((s) var_s_Sub1).anInt2206),
														i_71_,
														i_72_,
														(((s) var_s_Sub1).anInt2206),
														i_74_, i_73_);
											}
										} else {
											method1462(
													91,
													0,
													i_71_,
													i_72_,
													(((s) var_s_Sub1).anInt2206),
													i_74_, i_73_);
											method1462(
													122,
													(((s) var_s_Sub1).anInt2206),
													i_71_,
													i_72_,
													(((s) var_s_Sub1).anInt2206),
													i_74_, i_73_);
											method1462(120, 0, i_71_, i_72_, 0,
													i_74_, i_73_);
										}
									} else {
										method1462(117, 0, i_71_, i_72_, 0,
												i_74_, i_73_);
										method1462(118, 0, i_71_, i_72_,
												((s) var_s_Sub1).anInt2206,
												i_74_, i_73_);
										method1462(98,
												((s) var_s_Sub1).anInt2206,
												i_71_, i_72_, 0, i_74_, i_73_);
									}
								}
							}
							i_65_++;
							i_73_++;
						}
					} else {
						i_65_ += -anInt4181 + anInt4172;
					}
					i_71_++;
				}
				anInterface8_4169 = (aHa_Sub1_4164.method1838(5123,
						aClass98_Sub22_4170.aByteArray3992, 7, false,
						aClass98_Sub22_4170.position));
				anInterface16_4176 = aHa_Sub1_4164
						.method1878(
								(((ByteBuffer) aClass98_Sub22_Sub2_4166).position),
								false,
								16,
								-55,
								(((ByteBuffer) aClass98_Sub22_Sub2_4166).aByteArray3992));
				aClass104_4180 = new Class104(anInterface16_4176, 5126, 3, 0);
				aClass104_4183 = new Class104(anInterface16_4176, 5121, 4, 12);
			} else {
				aClass104_4183 = null;
				anInterface8_4169 = null;
				aClass104_4180 = null;
				anInterface16_4176 = null;
			}
			aFloatArrayArray4165 = aFloatArrayArray4171 = aFloatArrayArray4177 = null;
			aClass98_Sub22_Sub2_4166 = null;
			aClass377_4179 = null;
			aClass98_Sub22_4170 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pp.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ','
					+ (var_s_Sub1 != null ? "{...}" : "null") + ','
					+ (class98_sub5 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}
}
