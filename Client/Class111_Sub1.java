/* Class111_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class111_Sub1 extends Class111 {
	float aFloat4673;
	float aFloat4674;
	float aFloat4675;
	float aFloat4676;
	float aFloat4677;
	float aFloat4678;
	float aFloat4679;
	float aFloat4680;
	static int[] anIntArray4681;
	static int[] anIntArray4682 = new int[32];
	float aFloat4683;
	float aFloat4684;
	static Class239 aClass239_4685;
	float aFloat4686;
	float aFloat4687;

	@Override
	final void method2100(final int i, final int i_0_, final int i_1_) {
		try {
			aFloat4674 = i;
			aFloat4677 = i_1_;
			aFloat4683 = i_0_;
			aFloat4678 = aFloat4684 = aFloat4679 = aFloat4676 = aFloat4680 = aFloat4687 = 0.0F;
			aFloat4686 = aFloat4675 = aFloat4673 = 1.0F;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.SA(" + i
					+ ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method2109(final int i, final float f, final float f_2_,
			final float f_3_, final float f_4_, final float[] fs) {
		try {
			fs[0] = (f_4_ * aFloat4679 + f_3_ * aFloat4686 + aFloat4680 * f);
			float f_5_;
			float f_6_;
			float f_7_;
			if (f_3_ > 0.00390625F || f_3_ < -0.00390625F) {
				final float f_8_ = -f_2_ / f_3_;
				f_5_ = (aFloat4683 + aFloat4678 * f_8_);
				f_7_ = (aFloat4677 + aFloat4684 * f_8_);
				f_6_ = (f_8_ * aFloat4686 + aFloat4674);
			} else if (!(f_4_ > 0.00390625F) && !(f_4_ < -0.00390625F)) {
				final float f_9_ = -f_2_ / f;
				f_5_ = (f_9_ * aFloat4687 + aFloat4683);
				f_6_ = (aFloat4674 + aFloat4680 * f_9_);
				f_7_ = (aFloat4673 * f_9_ + aFloat4677);
			} else {
				final float f_10_ = -f_2_ / f_4_;
				f_6_ = (aFloat4674 + f_10_ * aFloat4679);
				f_5_ = (aFloat4683 + f_10_ * aFloat4675);
				f_7_ = (f_10_ * aFloat4676 + aFloat4677);
			}
			if (i == -29834) {
				fs[2] = (f * aFloat4673 + (f_3_ * aFloat4684 + aFloat4676
						* f_4_));
				fs[1] = (aFloat4687 * f + (f_3_ * aFloat4678 + f_4_
						* aFloat4675));
				fs[3] = -(fs[0] * f_6_ + f_5_ * fs[1] + f_7_ * fs[2]);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.J(" + i + ','
					+ f + ',' + f_2_ + ',' + f_3_ + ',' + f_4_ + ','
					+ (fs != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method2096(int i, int i_11_, int i_12_, final int[] is) {
		try {
			i -= aFloat4674;
			i_11_ -= aFloat4683;
			i_12_ -= aFloat4677;
			is[1] = (int) (i_12_ * aFloat4676 + (i * aFloat4679 + (aFloat4675 * i_11_)));
			is[0] = (int) (i_11_ * aFloat4678 + i * aFloat4686 + aFloat4684
					* i_12_);
			is[2] = (int) (i_12_ * aFloat4673 + (i * aFloat4680 + (i_11_ * aFloat4687)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.PA(" + i
					+ ',' + i_11_ + ',' + i_12_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2110(final float f, final int i, final int i_13_,
			final float f_14_, final int i_15_, final byte i_16_,
			final float f_17_) {
		do {
			try {
				do {
					if (i_13_ != 0) {
						final float f_18_ = (Class98_Sub10_Sub36.aFloatArray5741[0x3fff & i_13_]);
						final float f_19_ = (Class98_Sub10_Sub36.aFloatArray5742[i_13_ & 0x3fff]);
						aFloat4686 = f_18_ * i_15_;
						aFloat4679 = -f_19_ * i;
						aFloat4678 = f_19_ * i_15_;
						aFloat4684 = aFloat4676 = aFloat4680 = aFloat4687 = 0.0F;
						aFloat4675 = f_18_ * i;
						aFloat4673 = 1.0F;
						if (!client.aBoolean3553) {
							break;
						}
					}
					aFloat4686 = i_15_;
					aFloat4678 = aFloat4684 = aFloat4679 = aFloat4676 = aFloat4680 = aFloat4687 = 0.0F;
					aFloat4675 = i;
					aFloat4673 = 1.0F;
				} while (false);
				aFloat4683 = f;
				aFloat4674 = f_17_;
				aFloat4677 = f_14_;
				if (i_16_ == 63) {
					break;
				}
				method2092(null);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gca.K(" + f
						+ ',' + i + ',' + i_13_ + ',' + f_14_ + ',' + i_15_
						+ ',' + i_16_ + ',' + f_17_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method2090(final int i) {
		try {
			final float f = Class98_Sub10_Sub36.aFloatArray5741[0x3fff & i];
			final float f_20_ = Class98_Sub10_Sub36.aFloatArray5742[0x3fff & i];
			final float f_21_ = aFloat4686;
			final float f_22_ = aFloat4679;
			final float f_23_ = aFloat4680;
			final float f_24_ = aFloat4674;
			aFloat4686 = f * f_21_ - f_20_ * aFloat4678;
			aFloat4678 = f_20_ * f_21_ + f * aFloat4678;
			aFloat4679 = f_22_ * f - aFloat4675 * f_20_;
			aFloat4680 = f_23_ * f - f_20_ * aFloat4687;
			aFloat4675 = f * aFloat4675 + f_22_ * f_20_;
			aFloat4687 = f_23_ * f_20_ + aFloat4687 * f;
			aFloat4674 = f * f_24_ - f_20_ * aFloat4683;
			aFloat4683 = aFloat4683 * f + f_24_ * f_20_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.C(" + i + ')');
		}
	}

	@Override
	final void method2093(final int i, final int i_25_, final int i_26_,
			final int i_27_, final int i_28_, final int i_29_) {
		try {
			final float f = Class98_Sub10_Sub36.aFloatArray5741[0x3fff & i_27_];
			final float f_30_ = Class98_Sub10_Sub36.aFloatArray5742[i_27_ & 0x3fff];
			final float f_31_ = Class98_Sub10_Sub36.aFloatArray5741[i_28_ & 0x3fff];
			final float f_32_ = Class98_Sub10_Sub36.aFloatArray5742[i_28_ & 0x3fff];
			final float f_33_ = Class98_Sub10_Sub36.aFloatArray5741[i_29_ & 0x3fff];
			final float f_34_ = Class98_Sub10_Sub36.aFloatArray5742[0x3fff & i_29_];
			final float f_35_ = f_33_ * f_30_;
			final float f_36_ = f_34_ * f_30_;
			aFloat4684 = f_32_ * f;
			aFloat4676 = -f_30_;
			aFloat4679 = f * f_34_;
			aFloat4673 = f_31_ * f;
			aFloat4686 = f_33_ * f_31_ + f_36_ * f_32_;
			aFloat4687 = f_34_ * f_32_ + f_31_ * f_35_;
			aFloat4678 = f_32_ * f_35_ + -f_31_ * f_34_;
			aFloat4680 = -f_32_ * f_33_ + f_36_ * f_31_;
			aFloat4675 = f * f_33_;
			aFloat4677 = (-(i_26_ * aFloat4673) + (-(i_25_ * aFloat4676) + aFloat4684
					* -i));
			aFloat4683 = (-(i_26_ * aFloat4687) + (-(aFloat4675 * i_25_) + aFloat4678
					* -i));
			aFloat4674 = (aFloat4686 * -i - aFloat4679 * i_25_ - i_26_
					* aFloat4680);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.U(" + i + ','
					+ i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ','
					+ i_29_ + ')'));
		}
	}

	@Override
	final void method2105(final int i) {
		try {
			final float f = Class98_Sub10_Sub36.aFloatArray5741[0x3fff & i];
			final float f_37_ = Class98_Sub10_Sub36.aFloatArray5742[i & 0x3fff];
			final float f_38_ = aFloat4678;
			final float f_39_ = aFloat4675;
			final float f_40_ = aFloat4687;
			final float f_41_ = aFloat4683;
			aFloat4678 = -(f_37_ * aFloat4684) + f_38_ * f;
			aFloat4684 = f_38_ * f_37_ + f * aFloat4684;
			aFloat4675 = -(aFloat4676 * f_37_) + f * f_39_;
			aFloat4687 = -(f_37_ * aFloat4673) + f_40_ * f;
			aFloat4676 = f_39_ * f_37_ + f * aFloat4676;
			aFloat4683 = f_41_ * f - f_37_ * aFloat4677;
			aFloat4673 = f_37_ * f_40_ + f * aFloat4673;
			aFloat4677 = aFloat4677 * f + f_41_ * f_37_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.O(" + i + ')');
		}
	}

	@Override
	final void method2091() {
		try {
			aFloat4678 = aFloat4684 = aFloat4679 = aFloat4676 = aFloat4680 = aFloat4687 = aFloat4674 = aFloat4683 = aFloat4677 = 0.0F;
			aFloat4686 = aFloat4675 = aFloat4673 = 1.0F;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.CA(" + ')');
		}
	}

	final void method2111(final int i) {
		try {
			aFloat4684 = -aFloat4684;
			aFloat4683 = -aFloat4683;
			aFloat4687 = -aFloat4687;
			if (i != 2) {
				aFloat4679 = -1.6680864F;
			}
			aFloat4676 = -aFloat4676;
			aFloat4677 = -aFloat4677;
			aFloat4678 = -aFloat4678;
			aFloat4673 = -aFloat4673;
			aFloat4675 = -aFloat4675;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.B(" + i + ')');
		}
	}

	final void method2112(final Class111 class111, final byte i) {
		try {
			final Class111_Sub1 class111_sub1_42_ = (Class111_Sub1) class111;
			aFloat4686 = class111_sub1_42_.aFloat4686;
			aFloat4680 = class111_sub1_42_.aFloat4684;
			aFloat4679 = class111_sub1_42_.aFloat4678;
			aFloat4684 = class111_sub1_42_.aFloat4680;
			aFloat4675 = class111_sub1_42_.aFloat4675;
			aFloat4678 = class111_sub1_42_.aFloat4679;
			if (i > -83) {
				aFloat4684 = 0.61483526F;
			}
			aFloat4687 = class111_sub1_42_.aFloat4676;
			aFloat4676 = class111_sub1_42_.aFloat4687;
			aFloat4673 = class111_sub1_42_.aFloat4673;
			aFloat4674 = -((class111_sub1_42_.aFloat4677 * aFloat4680) + ((aFloat4686 * class111_sub1_42_.aFloat4674) + (class111_sub1_42_.aFloat4683 * aFloat4679)));
			aFloat4683 = -((class111_sub1_42_.aFloat4677 * aFloat4687) + ((aFloat4675 * class111_sub1_42_.aFloat4683) + (aFloat4678 * class111_sub1_42_.aFloat4674)));
			aFloat4677 = -((class111_sub1_42_.aFloat4677 * aFloat4673) + ((aFloat4676 * class111_sub1_42_.aFloat4683) + (class111_sub1_42_.aFloat4674 * aFloat4684)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.E("
					+ (class111 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final void method2099(final int i, final int i_43_, final int i_44_,
			final int[] is) {
		try {
			is[1] = (int) (i_44_ * aFloat4687 + (aFloat4675 * i_43_ + i
					* aFloat4678));
			is[0] = (int) (i_44_ * aFloat4680 + (aFloat4679 * i_43_ + aFloat4686
					* i));
			is[2] = (int) (aFloat4673 * i_44_ + (aFloat4684 * i + (i_43_ * aFloat4676)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.MA(" + i
					+ ',' + i_43_ + ',' + i_44_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method2104(final int i) {
		try {
			aFloat4673 = 1.0F;
			aFloat4686 = aFloat4675 = Class98_Sub10_Sub36.aFloatArray5741[0x3fff & i];
			aFloat4678 = Class98_Sub10_Sub36.aFloatArray5742[i & 0x3fff];
			aFloat4680 = aFloat4674 = aFloat4687 = aFloat4683 = aFloat4684 = aFloat4676 = aFloat4677 = 0.0F;
			aFloat4679 = -aFloat4678;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, "gca.HA(" + i + ')');
		}
	}

	final float[] method2113(final int i) {
		try {
			Class269.aFloatArray2023[4] = aFloat4679;
			if (i > -102) {
				aFloat4675 = -1.0382957F;
			}
			Class269.aFloatArray2023[8] = aFloat4680;
			Class269.aFloatArray2023[14] = aFloat4677;
			Class269.aFloatArray2023[10] = aFloat4673;
			Class269.aFloatArray2023[6] = aFloat4676;
			Class269.aFloatArray2023[1] = aFloat4678;
			Class269.aFloatArray2023[13] = aFloat4683;
			Class269.aFloatArray2023[2] = aFloat4684;
			Class269.aFloatArray2023[0] = aFloat4686;
			Class269.aFloatArray2023[5] = aFloat4675;
			Class269.aFloatArray2023[9] = aFloat4687;
			Class269.aFloatArray2023[12] = aFloat4674;
			return Class269.aFloatArray2023;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.L(" + i + ')');
		}
	}

	@Override
	final void method2107(final int i) {
		try {
			aFloat4686 = 1.0F;
			aFloat4675 = aFloat4673 = Class98_Sub10_Sub36.aFloatArray5741[i & 0x3fff];
			aFloat4676 = Class98_Sub10_Sub36.aFloatArray5742[i & 0x3fff];
			aFloat4687 = -aFloat4676;
			aFloat4679 = aFloat4680 = aFloat4674 = aFloat4678 = aFloat4683 = aFloat4684 = aFloat4677 = 0.0F;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.N(" + i + ')');
		}
	}

	public static void method2114(final byte i) {
		try {
			aClass239_4685 = null;
			if (i != 66) {
				method2114((byte) -98);
			}
			anIntArray4681 = null;
			anIntArray4682 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.A(" + i + ')');
		}
	}

	static final Class98_Sub31_Sub2 method2115(final int i,
			final Class98_Sub31_Sub2 class98_sub31_sub2) {
		try {
			final Class98_Sub31_Sub2 class98_sub31_sub2_46_ = (class98_sub31_sub2 != null ? new Class98_Sub31_Sub2(
					class98_sub31_sub2) : new Class98_Sub31_Sub2());
			class98_sub31_sub2_46_.method1357(26377, 128, 9);
			return class98_sub31_sub2_46_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.I(" + i + ','
					+ (class98_sub31_sub2 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method2101(final int i) {
		try {
			aFloat4675 = 1.0F;
			aFloat4686 = aFloat4673 = Class98_Sub10_Sub36.aFloatArray5741[i & 0x3fff];
			aFloat4680 = Class98_Sub10_Sub36.aFloatArray5742[i & 0x3fff];
			aFloat4679 = aFloat4674 = aFloat4678 = aFloat4687 = aFloat4683 = aFloat4676 = aFloat4677 = 0.0F;
			aFloat4684 = -aFloat4680;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.F(" + i + ')');
		}
	}

	@Override
	final void method2097(final int i) {
		try {
			final float f = Class98_Sub10_Sub36.aFloatArray5741[0x3fff & i];
			final float f_47_ = Class98_Sub10_Sub36.aFloatArray5742[i & 0x3fff];
			final float f_48_ = aFloat4686;
			final float f_49_ = aFloat4679;
			final float f_50_ = aFloat4680;
			aFloat4686 = aFloat4684 * f_47_ + f_48_ * f;
			final float f_51_ = aFloat4674;
			aFloat4679 = f_49_ * f + f_47_ * aFloat4676;
			aFloat4684 = -(f_47_ * f_48_) + aFloat4684 * f;
			aFloat4676 = f * aFloat4676 - f_47_ * f_49_;
			aFloat4680 = f_50_ * f + f_47_ * aFloat4673;
			aFloat4674 = aFloat4677 * f_47_ + f_51_ * f;
			aFloat4673 = aFloat4673 * f - f_50_ * f_47_;
			aFloat4677 = -(f_47_ * f_51_) + aFloat4677 * f;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, "gca.RA(" + i + ')');
		}
	}

	@Override
	final void method2106(final int i, final int i_52_, final int i_53_) {
		try {
			aFloat4683 += i_52_;
			aFloat4677 += i_53_;
			aFloat4674 += i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.G(" + i + ','
					+ i_52_ + ',' + i_53_ + ')'));
		}
	}

	@Override
	final void method2092(final Class111 class111) {
		try {
			final Class111_Sub1 class111_sub1_54_ = (Class111_Sub1) class111;
			aFloat4680 = class111_sub1_54_.aFloat4680;
			aFloat4678 = class111_sub1_54_.aFloat4678;
			aFloat4687 = class111_sub1_54_.aFloat4687;
			aFloat4674 = class111_sub1_54_.aFloat4674;
			aFloat4686 = class111_sub1_54_.aFloat4686;
			aFloat4683 = class111_sub1_54_.aFloat4683;
			aFloat4677 = class111_sub1_54_.aFloat4677;
			aFloat4676 = class111_sub1_54_.aFloat4676;
			aFloat4675 = class111_sub1_54_.aFloat4675;
			aFloat4673 = class111_sub1_54_.aFloat4673;
			aFloat4684 = class111_sub1_54_.aFloat4684;
			aFloat4679 = class111_sub1_54_.aFloat4679;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.H("
					+ (class111 != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	final void method2108(final int[] is) {
		try {
			final float f = -aFloat4674 + is[0];
			final float f_55_ = -aFloat4683 + is[1];
			final float f_56_ = -aFloat4677 + is[2];
			is[1] = (int) (f_56_ * aFloat4676 + (aFloat4675 * f_55_ + aFloat4679
					* f));
			is[0] = (int) (f * aFloat4686 + f_55_ * aFloat4678 + f_56_
					* aFloat4684);
			is[2] = (int) (aFloat4673 * f_56_ + (f_55_ * aFloat4687 + aFloat4680
					* f));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.LA("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	final void method2103(final int i, final int i_57_, final int i_58_,
			final int[] is) {
		try {
			is[0] = (int) (i_58_ * aFloat4680
					+ (i_57_ * aFloat4679 + aFloat4686 * i) + aFloat4674);
			is[1] = (int) (aFloat4683 + (aFloat4687 * i_58_ + ((aFloat4675 * i_57_) + (aFloat4678 * i))));
			is[2] = (int) (aFloat4673 * i_58_
					+ (i * aFloat4684 + (i_57_ * aFloat4676)) + aFloat4677);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gca.M(" + i + ','
					+ i_57_ + ',' + i_58_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final Class111 method2102() {
		try {
			final Class111_Sub1 class111_sub1_59_ = new Class111_Sub1();
			class111_sub1_59_.aFloat4677 = aFloat4677;
			class111_sub1_59_.aFloat4683 = aFloat4683;
			class111_sub1_59_.aFloat4674 = aFloat4674;
			class111_sub1_59_.aFloat4676 = aFloat4676;
			class111_sub1_59_.aFloat4675 = aFloat4675;
			class111_sub1_59_.aFloat4684 = aFloat4684;
			class111_sub1_59_.aFloat4686 = aFloat4686;
			class111_sub1_59_.aFloat4680 = aFloat4680;
			class111_sub1_59_.aFloat4678 = aFloat4678;
			class111_sub1_59_.aFloat4673 = aFloat4673;
			class111_sub1_59_.aFloat4679 = aFloat4679;
			class111_sub1_59_.aFloat4687 = aFloat4687;
			return class111_sub1_59_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.TA(" + ')');
		}
	}

	final float[] method2116(final int i) {
		try {
			Class269.aFloatArray2023[13] = 0.0F;
			Class269.aFloatArray2023[8] = aFloat4680;
			Class269.aFloatArray2023[2] = aFloat4684;
			if (i <= 45) {
				aClass239_4685 = null;
			}
			Class269.aFloatArray2023[10] = aFloat4673;
			Class269.aFloatArray2023[9] = aFloat4687;
			Class269.aFloatArray2023[1] = aFloat4678;
			Class269.aFloatArray2023[14] = 0.0F;
			Class269.aFloatArray2023[0] = aFloat4686;
			Class269.aFloatArray2023[4] = aFloat4679;
			Class269.aFloatArray2023[6] = aFloat4676;
			Class269.aFloatArray2023[12] = 0.0F;
			Class269.aFloatArray2023[5] = aFloat4675;
			return Class269.aFloatArray2023;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gca.D(" + i + ')');
		}
	}

	public Class111_Sub1() {
		try {
			method2091();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, "gca.<init>(" + ')');
		}
	}
}
