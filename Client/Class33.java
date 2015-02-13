import jaggl.OpenGL;

/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class33 {
	private Class46[][] aClass46ArrayArray313;
	int anInt314;
	static Class148 aClass148_315 = new Class148();
	static boolean aBoolean316 = false;
	private int anInt317;
	private ha_Sub1 aHa_Sub1_318;
	private int anInt319;
	private s_Sub1 aS_Sub1_320;
	byte[] aByteArray321;
	private int anInt322;
	private int anInt323;

	final void method320(final boolean bool, final int i, final int i_0_,
			final boolean[][] bools, final byte i_1_, final int i_2_) {
		try {
			if (i_1_ >= 8) {
				aHa_Sub1_318.method1851(false, false);
				aHa_Sub1_318.method1875((byte) -127, false);
				aHa_Sub1_318.method1834(104, -2);
				aHa_Sub1_318.method1896(260, 1);
				aHa_Sub1_318.method1870((byte) -93, 1);
				final float f = 1.0F / (aHa_Sub1_318.anInt4318 * 128);
				if (!bool) {
					for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (anInt317 ^ 0xffffffff); i_3_++) {
						final int i_4_ = i_3_ << anInt319;
						final int i_5_ = i_3_ - -1 << anInt319;
						for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (anInt323 ^ 0xffffffff); i_6_++) {
							int i_7_ = 0;
							final int i_8_ = i_6_ << anInt319;
							final int i_9_ = 1 + i_6_ << anInt319;
							final Class98_Sub22_Sub2 class98_sub22_sub2 = (aHa_Sub1_318.aClass98_Sub22_Sub2_4446);
							((ByteBuffer) class98_sub22_sub2).position = 0;
							for (int i_10_ = i_4_; (i_5_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
								if (((i_10_ - i_2_ ^ 0xffffffff) <= (-i ^ 0xffffffff))
										&& i_10_ - i_2_ <= i) {
									int i_11_ = i_8_ + i_10_
											* (((s) aS_Sub1_320).anInt2203);
									for (int i_12_ = i_8_; i_12_ < i_9_; i_12_++) {
										if (-i <= -i_0_ + i_12_
												&& ((-i_0_ + i_12_ ^ 0xffffffff) >= (i ^ 0xffffffff))
												&& (bools[i_12_ + (-i_0_ + i)][i
														+ (-i_2_ + i_10_)])) {
											final short[] is = (aS_Sub1_320.aShortArrayArray5196[i_11_]);
											if (is != null) {
												if (!aHa_Sub1_318.aBoolean4397) {
													for (int i_13_ = 0; i_13_ < is.length; i_13_++) {
														i_7_++;
														class98_sub22_sub2
																.method1247(
																		(is[i_13_] & 0xffff),
																		4);
													}
												} else {
													for (int i_14_ = 0; ((i_14_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_14_++) {
														i_7_++;
														class98_sub22_sub2
																.writeShort(
																		(0xffff & is[i_14_]),
																		1571862888);
													}
												}
											}
										}
										i_11_++;
									}
								}
							}
							if ((i_7_ ^ 0xffffffff) < -1) {
								OpenGL.glMatrixMode(5890);
								OpenGL.glLoadIdentity();
								OpenGL.glScalef(f, f, 1.0F);
								OpenGL.glTranslatef(-i_6_ / f, -i_3_ / f, 1.0F);
								OpenGL.glMatrixMode(5888);
								aClass46ArrayArray313[i_6_][i_3_]
										.method438(
												i_7_,
												0,
												5123,
												(((ByteBuffer) class98_sub22_sub2).aByteArray3992));
							}
						}
					}
				} else {
					for (int i_15_ = 0; i_15_ < anInt317; i_15_++) {
						final int i_16_ = i_15_ << anInt319;
						final int i_17_ = i_15_ + 1 << anInt319;
						for (int i_18_ = 0; anInt323 > i_18_; i_18_++) {
							final int i_19_ = i_18_ << anInt319;
							final int i_20_ = 1 + i_18_ << anInt319;
							while_38_: for (int i_21_ = i_19_; i_20_ > i_21_; i_21_++) {
								if (((-i_0_ + i_21_ ^ 0xffffffff) <= (-i ^ 0xffffffff))
										&& (i ^ 0xffffffff) <= (i_21_ - i_0_ ^ 0xffffffff)) {
									for (int i_22_ = i_16_; i_22_ < i_17_; i_22_++) {
										if (((-i_2_ + i_22_ ^ 0xffffffff) <= (-i ^ 0xffffffff))
												&& i >= i_22_ + -i_2_
												&& (bools[i + i_21_ - i_0_][i
														+ (-i_2_ + i_22_)])) {
											OpenGL.glMatrixMode(5890);
											OpenGL.glLoadIdentity();
											OpenGL.glScalef(f, f, 1.0F);
											OpenGL.glTranslatef((-i_18_ / f),
													(-i_15_ / f), 1.0F);
											OpenGL.glMatrixMode(5888);
											aClass46ArrayArray313[i_18_][i_15_]
													.method437(6401);
											break while_38_;
										}
									}
								}
							}
						}
					}
				}
				OpenGL.glMatrixMode(5890);
				OpenGL.glLoadIdentity();
				OpenGL.glMatrixMode(5888);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cg.F(" + bool
					+ ',' + i + ',' + i_0_ + ','
					+ (bools != null ? "{...}" : "null") + ',' + i_1_ + ','
					+ i_2_ + ')'));
		}
	}

	final void method321(final int i) {
		do {
			try {
				aClass46ArrayArray313 = new Class46[anInt323][anInt317];
				for (int i_23_ = 0; (anInt317 ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++) {
					for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (anInt323 ^ 0xffffffff); i_24_++) {
						aClass46ArrayArray313[i_24_][i_23_] = new Class46(
								aHa_Sub1_318, this, aS_Sub1_320, i_24_, i_23_,
								anInt319, 1 + 128 * i_24_, 128 * i_23_ - -1);
					}
				}
				if (i >= 103) {
					break;
				}
				aClass46ArrayArray313 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cg.G(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method322(int i, int i_25_, final boolean bool, final r var_r) {
		try {
			final r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
			i_25_ += 1 + var_r_Sub1.anInt6324;
			i += 1 + var_r_Sub1.anInt6320;
			int i_26_ = anInt314 * i + i_25_;
			int i_27_ = 0;
			int i_28_ = var_r_Sub1.anInt6326;
			int i_29_ = var_r_Sub1.anInt6323;
			int i_30_ = -i_29_ + anInt314;
			int i_31_ = 0;
			if (i <= 0) {
				final int i_32_ = 1 + -i;
				i_28_ -= i_32_;
				i = 1;
				i_26_ += i_32_ * anInt314;
				i_27_ += i_29_ * i_32_;
			}
			if (anInt322 <= i_28_ + i) {
				final int i_33_ = i - -i_28_ - (-1 - -anInt322);
				i_28_ -= i_33_;
			}
			if (i_25_ <= 0) {
				final int i_34_ = -i_25_ + 1;
				i_29_ -= i_34_;
				i_26_ += i_34_;
				i_31_ += i_34_;
				i_27_ += i_34_;
				i_25_ = 1;
				i_30_ += i_34_;
			}
			if ((i_25_ + i_29_ ^ 0xffffffff) <= (anInt314 ^ 0xffffffff)) {
				final int i_35_ = -anInt314 + 1 + (i_25_ - -i_29_);
				i_29_ -= i_35_;
				i_30_ += i_35_;
				i_31_ += i_35_;
			}
			if ((i_29_ ^ 0xffffffff) < -1 && i_28_ > 0) {
				Class187.method2637(i_28_, i_26_, i_27_,
						var_r_Sub1.aByteArray6325, aByteArray321, -18305,
						i_31_, i_30_, i_29_);
				method326(i_28_, i_29_, i_25_, i, bool);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cg.E(" + i + ','
					+ i_25_ + ',' + bool + ','
					+ (var_r != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method323(final int[] is, final Object[] objects,
			final int i, final int i_36_, final int i_37_) {
		do {
			try {
				if (i != 0) {
					aClass148_315 = null;
				}
				if ((i_36_ ^ 0xffffffff) >= (i_37_ ^ 0xffffffff)) {
					break;
				}
				final int i_38_ = (i_36_ + i_37_) / 2;
				int i_39_ = i_37_;
				final int i_40_ = is[i_38_];
				is[i_38_] = is[i_36_];
				is[i_36_] = i_40_;
				final Object object = objects[i_38_];
				objects[i_38_] = objects[i_36_];
				objects[i_36_] = object;
				final int i_41_ = i_40_ != 2147483647 ? 1 : 0;
				for (int i_42_ = i_37_; i_36_ > i_42_; i_42_++) {
					if (is[i_42_] < (i_41_ & i_42_) + i_40_) {
						final int i_43_ = is[i_42_];
						is[i_42_] = is[i_39_];
						is[i_39_] = i_43_;
						final Object object_44_ = objects[i_42_];
						objects[i_42_] = objects[i_39_];
						objects[i_39_++] = object_44_;
					}
				}
				is[i_36_] = is[i_39_];
				is[i_39_] = i_40_;
				objects[i_36_] = objects[i_39_];
				objects[i_39_] = object;
				method323(is, objects, i, i_39_ + -1, i_37_);
				method323(is, objects, 0, i_36_, i_39_ - -1);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("cg.H("
						+ (is != null ? "{...}" : "null") + ','
						+ (objects != null ? "{...}" : "null") + ',' + i + ','
						+ i_36_ + ',' + i_37_ + ')'));
			}
			break;
		} while (false);
	}

	final void method324(final byte i, int i_45_, int i_46_, final r var_r) {
		try {
			if (i <= 87) {
				aBoolean316 = true;
			}
			final r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
			i_46_ += var_r_Sub1.anInt6324 - -1;
			i_45_ += var_r_Sub1.anInt6320 - -1;
			int i_47_ = i_46_ + anInt314 * i_45_;
			int i_48_ = 0;
			int i_49_ = var_r_Sub1.anInt6326;
			int i_50_ = var_r_Sub1.anInt6323;
			int i_51_ = anInt314 + -i_50_;
			int i_52_ = 0;
			if ((i_45_ ^ 0xffffffff) >= -1) {
				final int i_53_ = 1 - i_45_;
				i_48_ += i_50_ * i_53_;
				i_45_ = 1;
				i_49_ -= i_53_;
				i_47_ += anInt314 * i_53_;
			}
			if ((i_49_ + i_45_ ^ 0xffffffff) <= (anInt322 ^ 0xffffffff)) {
				final int i_54_ = -anInt322 + i_49_ + (i_45_ + 1);
				i_49_ -= i_54_;
			}
			if (i_46_ <= 0) {
				final int i_55_ = -i_46_ + 1;
				i_46_ = 1;
				i_52_ += i_55_;
				i_47_ += i_55_;
				i_50_ -= i_55_;
				i_48_ += i_55_;
				i_51_ += i_55_;
			}
			if (anInt314 <= i_46_ - -i_50_) {
				final int i_56_ = i_50_ + (i_46_ - (-1 + anInt314));
				i_50_ -= i_56_;
				i_51_ += i_56_;
				i_52_ += i_56_;
			}
			if ((i_50_ ^ 0xffffffff) < -1 && i_49_ > 0) {
				Class76_Sub2.method751(i_52_, aByteArray321, i_49_,
						var_r_Sub1.aByteArray6325, i_48_, i_51_, i_47_, i_50_,
						0);
				method326(i_49_, i_50_, i_46_, i_45_, false);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cg.C(" + i + ','
					+ i_45_ + ',' + i_46_ + ','
					+ (var_r != null ? "{...}" : "null") + ')'));
		}
	}

	Class33(final ha_Sub1 var_ha_Sub1, final s_Sub1 var_s_Sub1) {
		try {
			aHa_Sub1_318 = var_ha_Sub1;
			aS_Sub1_320 = var_s_Sub1;
			anInt314 = (((s) aS_Sub1_320).anInt2206
					* ((s) aS_Sub1_320).anInt2203 >> aHa_Sub1_318.anInt4319) + 2;
			anInt322 = 2 + ((((s) aS_Sub1_320).anInt2204 * ((s) aS_Sub1_320).anInt2206) >> aHa_Sub1_318.anInt4319);
			anInt319 = (aHa_Sub1_318.anInt4319 + (7 + -((s) aS_Sub1_320).anInt2200));
			aByteArray321 = new byte[anInt314 * anInt322];
			anInt323 = ((s) aS_Sub1_320).anInt2203 >> anInt319;
			anInt317 = ((s) aS_Sub1_320).anInt2204 >> anInt319;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cg.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ','
					+ (var_s_Sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method325(final r var_r, final int i, int i_57_, int i_58_) {
		try {
			final r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
			i_57_ += 1 + var_r_Sub1.anInt6324;
			i_58_ += var_r_Sub1.anInt6320 - -1;
			int i_59_ = i_58_ * anInt314 + i_57_;
			int i_60_ = var_r_Sub1.anInt6326;
			int i_61_ = var_r_Sub1.anInt6323;
			int i_62_ = -i_61_ + anInt314;
			if (i_58_ <= 0) {
				final int i_63_ = 1 - i_58_;
				i_58_ = 1;
				i_59_ += anInt314 * i_63_;
				i_60_ -= i_63_;
			}
			if ((i_58_ + i_60_ ^ 0xffffffff) <= (anInt322 ^ 0xffffffff)) {
				final int i_64_ = i_60_ + i_58_ + (1 + -anInt322);
				i_60_ -= i_64_;
			}
			if (i_57_ <= 0) {
				final int i_65_ = 1 - i_57_;
				i_61_ -= i_65_;
				i_59_ += i_65_;
				i_62_ += i_65_;
				i_57_ = 1;
			}
			if ((i_57_ - -i_61_ ^ 0xffffffff) <= (anInt314 ^ 0xffffffff)) {
				final int i_66_ = i_61_ + (i_57_ + 1 + -anInt314);
				i_62_ += i_66_;
				i_61_ -= i_66_;
			}
			if ((i_61_ ^ 0xffffffff) >= -1 || (i_60_ ^ 0xffffffff) >= -1) {
				return false;
			}
			final int i_67_ = 8;
			if (i > -109) {
				aS_Sub1_320 = null;
			}
			i_62_ += anInt314 * (-1 + i_67_);
			return Class130.method2230(i_67_, i_59_, 1, i_62_, i_61_,
					aByteArray321, i_60_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cg.B("
					+ (var_r != null ? "{...}" : "null") + ',' + i + ','
					+ i_57_ + ',' + i_58_ + ')'));
		}
	}

	private final void method326(final int i, final int i_68_, final int i_69_,
			final int i_70_, final boolean bool) {
		try {
			if (bool == false && aClass46ArrayArray313 != null) {
				final int i_71_ = -1 + i_69_ >> -1633322617;
				final int i_72_ = i_68_ + i_69_ - 2 >> -1182142265;
				final int i_73_ = -1 + i_70_ >> -1931383033;
				final int i_74_ = -1 + (i_70_ - (1 + -i)) >> 950325127;
				for (int i_75_ = i_71_; (i_72_ ^ 0xffffffff) <= (i_75_ ^ 0xffffffff); i_75_++) {
					final Class46[] class46s = aClass46ArrayArray313[i_75_];
					for (int i_76_ = i_73_; (i_76_ ^ 0xffffffff) >= (i_74_ ^ 0xffffffff); i_76_++) {
						class46s[i_76_].aBoolean392 = true;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cg.D(" + i + ','
					+ i_68_ + ',' + i_69_ + ',' + i_70_ + ',' + bool + ')'));
		}
	}

	public static void method327(final byte i) {
		do {
			try {
				aClass148_315 = null;
				if (i <= -124) {
					break;
				}
				aBoolean316 = false;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cg.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
