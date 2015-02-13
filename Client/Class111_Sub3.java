/* Class111_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class111_Sub3 extends Class111 {
	static int anInt4701;
	float aFloat4702;
	float aFloat4703;
	float aFloat4704;
	float aFloat4705;
	float aFloat4706;
	static int[] anIntArray4707;
	float aFloat4708;
	float aFloat4709;
	float aFloat4710;
	float aFloat4711;
	float aFloat4712;
	float aFloat4713;
	float aFloat4714;
	static Class207 aClass207_4715;

	static final void method2118(final int i) {
		do {
			try {
				Class341.method3812(Class255.aClass293_3208);
				Class105.anInt3417++;
				if (!Class166.aBoolean1278 || !Class239.aBoolean1840) {
					if ((Class105.anInt3417 ^ 0xffffffff) < -2) {
						Class255.aClass293_3208 = null;
					}
				} else {
					int i_0_ = 0;
					int i_1_ = 0;
					if (za_Sub2.aBoolean6079) {
						i_0_ = Class189.method2642((byte) 42);
						i_1_ = Class335.method3765(false);
					}
					int i_2_ = Class2.aClass299_73.method3514(74) - -i_0_;
					int i_3_ = Class2.aClass299_73.method3507((byte) 125)
							- -i_1_;
					i_3_ -= PlayerUpdateMask.anInt526;
					if (i == 19653) {
						i_2_ -= Model.anInt1405;
						if ((i_2_ ^ 0xffffffff) > (Class246_Sub3_Sub4_Sub2_Sub1.anInt6500 ^ 0xffffffff)) {
							i_2_ = Class246_Sub3_Sub4_Sub2_Sub1.anInt6500;
						}
						if ((Class255.aClass293_3208.anInt2311 + i_2_) > (Class189.aClass293_1457.anInt2311 + Class246_Sub3_Sub4_Sub2_Sub1.anInt6500)) {
							i_2_ = (Class246_Sub3_Sub4_Sub2_Sub1.anInt6500 + ((Class189.aClass293_1457.anInt2311) + -(Class255.aClass293_3208.anInt2311)));
						}
						if (Class222.anInt1670 > i_3_) {
							i_3_ = Class222.anInt1670;
						}
						if ((Class255.aClass293_3208.anInt2258 + i_3_) > (Class222.anInt1670 - -(Class189.aClass293_1457.anInt2258))) {
							i_3_ = (Class222.anInt1670 - (-(Class189.aClass293_1457.anInt2258) + (Class255.aClass293_3208.anInt2258)));
						}
						final int i_4_ = i_2_
								- (Class246_Sub3_Sub4_Sub2_Sub1.anInt6500 + -(Class189.aClass293_1457.anInt2246));
						final int i_5_ = (-Class222.anInt1670 + (i_3_ - -(Class189.aClass293_1457.anInt2213)));
						if (!Class2.aClass299_73.method3505((byte) 22)) {
							if (!Class15.aBoolean186) {
								if (((Class305_Sub1.anInt5303 ^ 0xffffffff) != -2)
										&& !r_Sub1.method1642((byte) 125)
										|| Class359.anInt3058 <= 2) {
									if (Class98_Sub17_Sub1.method1160(98)) {
										Class353.method3869(
												(Class259.anInt1960 + (PlayerUpdateMask.anInt526)),
												(Model.anInt1405 + (Class167.anInt1286)),
												-2);
									}
								} else {
									Class353.method3869(
											(PlayerUpdateMask.anInt526 - -(Class259.anInt1960)),
											(Model.anInt1405 - -(Class167.anInt1286)),
											-2);
								}
							} else {
								Class98_Sub10_Sub32.method1098((byte) -49);
								if ((Class255.aClass293_3208.anObjectArray2313) != null) {
									final Class98_Sub21 class98_sub21 = new Class98_Sub21();
									class98_sub21.aClass293_3982 = Class162.aClass293_1272;
									class98_sub21.anInt3979 = i_5_;
									class98_sub21.aClass293_3986 = Class255.aClass293_3208;
									class98_sub21.anObjectArray3981 = (Class255.aClass293_3208.anObjectArray2313);
									class98_sub21.anInt3985 = i_4_;
									ClientScriptsDefs.method3144(class98_sub21);
								}
								if (Class162.aClass293_1272 != null
										&& (client
												.method102(Class255.aClass293_3208) != null)) {
									Class151_Sub6.method2463(
											(Class162.aClass293_1272),
											(Class255.aClass293_3208), 42);
								}
							}
							Class255.aClass293_3208 = null;
						} else {
							if ((Class255.aClass293_3208.anInt2353 ^ 0xffffffff) > (Class105.anInt3417 ^ 0xffffffff)) {
								final int i_6_ = i_2_ + -Class167.anInt1286;
								final int i_7_ = i_3_ - Class259.anInt1960;
								if (i_6_ > Class255.aClass293_3208.anInt2308
										|| -(Class255.aClass293_3208.anInt2308) > i_6_
										|| ((i_7_ ^ 0xffffffff) < (Class255.aClass293_3208.anInt2308 ^ 0xffffffff))
										|| i_7_ < -(Class255.aClass293_3208.anInt2308)) {
									Class15.aBoolean186 = true;
								}
							}
							if ((Class255.aClass293_3208.anObjectArray2316) == null
									|| !Class15.aBoolean186) {
								break;
							}
							final Class98_Sub21 class98_sub21 = new Class98_Sub21();
							class98_sub21.anObjectArray3981 = (Class255.aClass293_3208.anObjectArray2316);
							class98_sub21.aClass293_3986 = Class255.aClass293_3208;
							class98_sub21.anInt3985 = i_4_;
							class98_sub21.anInt3979 = i_5_;
							ClientScriptsDefs.method3144(class98_sub21);
						}
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "og.K(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method2119(final float f, final int i, final float f_8_,
			final float f_9_) {
		try {
			aFloat4714 = aFloat4708 = aFloat4711 = aFloat4713 = aFloat4705 = aFloat4710 = 0.0F;
			aFloat4702 = f_9_;
			aFloat4703 = f;
			aFloat4712 = aFloat4706 = aFloat4704 = i;
			aFloat4709 = f_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.IA(" + f + ','
					+ i + ',' + f_8_ + ',' + f_9_ + ')'));
		}
	}

	@Override
	final void method2090(final int i) {
		try {
			final float f = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			final float f_10_ = Class64_Sub5.aFloatArray3651[0x3fff & i];
			final float f_11_ = aFloat4712;
			final float f_12_ = aFloat4711;
			final float f_13_ = aFloat4705;
			aFloat4712 = f * f_11_ - aFloat4714 * f_10_;
			final float f_14_ = aFloat4702;
			aFloat4714 = aFloat4714 * f + f_11_ * f_10_;
			aFloat4711 = f * f_12_ - aFloat4706 * f_10_;
			aFloat4706 = aFloat4706 * f + f_10_ * f_12_;
			aFloat4705 = -(aFloat4710 * f_10_) + f * f_13_;
			aFloat4710 = f * aFloat4710 + f_13_ * f_10_;
			aFloat4702 = f * f_14_ - aFloat4709 * f_10_;
			aFloat4709 = f * aFloat4709 + f_14_ * f_10_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.C(" + i + ')');
		}
	}

	final void method2120(final byte i, final float f, final float f_15_,
			final float f_16_, final float[] fs, final float f_17_) {
		try {
			fs[0] = (aFloat4711 * f_15_ + aFloat4712 * f_17_ + f * aFloat4705);
			float f_19_;
			float f_20_;
			float f_21_;
			if (!(f_17_ > 0.00390625F) && !(f_17_ < -0.00390625F)) {
				if (!(f_15_ > 0.00390625F) && !(f_15_ < -0.00390625F)) {
					final float f_22_ = -f_16_ / f;
					f_21_ = (aFloat4709 + f_22_ * aFloat4710);
					f_19_ = (aFloat4703 + f_22_ * aFloat4704);
					f_20_ = (f_22_ * aFloat4705 + aFloat4702);
				} else {
					final float f_23_ = -f_16_ / f_15_;
					f_20_ = (aFloat4711 * f_23_ + aFloat4702);
					f_21_ = (f_23_ * aFloat4706 + aFloat4709);
					f_19_ = (f_23_ * aFloat4713 + aFloat4703);
				}
			} else {
				final float f_24_ = -f_16_ / f_17_;
				f_19_ = (aFloat4703 + f_24_ * aFloat4708);
				f_20_ = (aFloat4712 * f_24_ + aFloat4702);
				f_21_ = (f_24_ * aFloat4714 + aFloat4709);
			}
			fs[2] = (f_17_ * aFloat4708 + f_15_ * aFloat4713 + aFloat4704 * f);
			fs[1] = (aFloat4714 * f_17_ + aFloat4706 * f_15_ + f * aFloat4710);
			fs[3] = -(fs[1] * f_21_ + f_20_ * fs[0] + f_19_ * fs[2]);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.JA(" + i + ','
					+ f + ',' + f_15_ + ',' + f_16_ + ','
					+ (fs != null ? "{...}" : "null") + ',' + f_17_ + ')'));
		}
	}

	final float[] method2121(final byte i, final float[] fs) {
		try {
			fs[14] = aFloat4703;
			fs[4] = aFloat4711;
			fs[0] = aFloat4712;
			fs[3] = 0.0F;
			fs[12] = aFloat4702;
			fs[11] = 0.0F;
			fs[6] = aFloat4713;
			fs[5] = aFloat4706;
			fs[7] = 0.0F;
			fs[13] = aFloat4709;
			fs[10] = aFloat4704;
			fs[8] = aFloat4705;
			fs[15] = 1.0F;
			if (i >= -27) {
				aFloat4706 = 1.5727293F;
			}
			fs[1] = aFloat4714;
			fs[9] = aFloat4710;
			fs[2] = aFloat4708;
			return fs;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.S(" + i + ','
					+ (fs != null ? "{...}" : "null") + ')'));
		}
	}

	final float[] method2122(final float[] fs, final int i) {
		try {
			fs[13] = 0.0F;
			fs[6] = 0.0F;
			fs[2] = 0.0F;
			fs[9] = aFloat4709;
			fs[3] = 0.0F;
			fs[8] = aFloat4702;
			fs[14] = 0.0F;
			fs[10] = aFloat4703;
			fs[12] = 0.0F;
			fs[11] = 0.0F;
			fs[5] = aFloat4706;
			fs[7] = 0.0F;
			fs[0] = aFloat4712;
			fs[1] = aFloat4714;
			fs[4] = aFloat4711;
			fs[15] = 1.0F;
			return fs;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.D("
					+ (fs != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final void method2096(int i, int i_26_, int i_27_, final int[] is) {
		try {
			i -= aFloat4702;
			i_26_ -= aFloat4709;
			i_27_ -= aFloat4703;
			is[0] = (int) (aFloat4708 * i_27_ + (aFloat4712 * i + (i_26_ * aFloat4714)));
			is[1] = (int) (i_27_ * aFloat4713 + (i_26_ * aFloat4706 + aFloat4711
					* i));
			is[2] = (int) (i * aFloat4705 + i_26_ * aFloat4710 + aFloat4704
					* i_27_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.PA(" + i + ','
					+ i_26_ + ',' + i_27_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2123(final float f, final float f_28_, final float f_29_,
			final float f_30_, final float f_31_, final float f_32_,
			final float f_33_, final float f_34_, final float f_35_,
			final byte i) {
		try {
			aFloat4708 = f_30_;
			aFloat4709 = 0.0F;
			aFloat4703 = 0.0F;
			aFloat4714 = f_29_;
			aFloat4713 = f_32_;
			aFloat4705 = f_35_;
			aFloat4702 = 0.0F;
			aFloat4706 = f_33_;
			aFloat4712 = f_34_;
			aFloat4710 = f_31_;
			aFloat4704 = f;
			aFloat4711 = f_28_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("og.UA(" + f + ',' + f_28_ + ',' + f_29_ + ',' + f_30_
							+ ',' + f_31_ + ',' + f_32_ + ',' + f_33_ + ','
							+ f_34_ + ',' + f_35_ + ',' + i + ')'));
		}
	}

	@Override
	final void method2107(final int i) {
		try {
			aFloat4712 = 1.0F;
			aFloat4706 = aFloat4704 = Class64_Sub5.aFloatArray3653[0x3fff & i];
			aFloat4713 = Class64_Sub5.aFloatArray3651[0x3fff & i];
			aFloat4711 = aFloat4705 = aFloat4702 = aFloat4714 = aFloat4709 = aFloat4708 = aFloat4703 = 0.0F;
			aFloat4710 = -aFloat4713;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.N(" + i + ')');
		}
	}

	@Override
	final void method2101(final int i) {
		try {
			aFloat4706 = 1.0F;
			aFloat4712 = aFloat4704 = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			aFloat4705 = Class64_Sub5.aFloatArray3651[0x3fff & i];
			aFloat4708 = -aFloat4705;
			aFloat4711 = aFloat4702 = aFloat4714 = aFloat4710 = aFloat4709 = aFloat4713 = aFloat4703 = 0.0F;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.F(" + i + ')');
		}
	}

	final void method2124(final boolean bool, final Class111 class111) {
		try {
			final Class111_Sub3 class111_sub3_37_ = (Class111_Sub3) class111;
			final float f = aFloat4712;
			final float f_38_ = aFloat4714;
			final float f_39_ = aFloat4711;
			final float f_40_ = aFloat4706;
			final float f_41_ = aFloat4705;
			final float f_42_ = aFloat4710;
			final float f_43_ = aFloat4702;
			final float f_44_ = aFloat4709;
			aFloat4714 = ((class111_sub3_37_.aFloat4710 * aFloat4708) + (class111_sub3_37_.aFloat4706
					* f_38_ + f * class111_sub3_37_.aFloat4714));
			aFloat4712 = ((aFloat4708 * class111_sub3_37_.aFloat4705) + (class111_sub3_37_.aFloat4711
					* f_38_ + f * class111_sub3_37_.aFloat4712));
			aFloat4708 = ((class111_sub3_37_.aFloat4704 * aFloat4708) + (class111_sub3_37_.aFloat4713
					* f_38_ + f * class111_sub3_37_.aFloat4708));
			if (bool != true) {
				anInt4701 = 101;
			}
			aFloat4711 = (class111_sub3_37_.aFloat4712 * f_39_ + f_40_
					* class111_sub3_37_.aFloat4711 + (class111_sub3_37_.aFloat4705 * aFloat4713));
			aFloat4706 = (class111_sub3_37_.aFloat4706 * f_40_
					+ class111_sub3_37_.aFloat4714 * f_39_ + (class111_sub3_37_.aFloat4710 * aFloat4713));
			aFloat4710 = ((aFloat4704 * class111_sub3_37_.aFloat4710) + (class111_sub3_37_.aFloat4706
					* f_42_ + (class111_sub3_37_.aFloat4714 * f_41_)));
			aFloat4713 = ((aFloat4713 * class111_sub3_37_.aFloat4704) + (f_40_
					* class111_sub3_37_.aFloat4713 + (class111_sub3_37_.aFloat4708 * f_39_)));
			aFloat4705 = (f_41_ * class111_sub3_37_.aFloat4712 + f_42_
					* class111_sub3_37_.aFloat4711 + (aFloat4704 * class111_sub3_37_.aFloat4705));
			aFloat4704 = (class111_sub3_37_.aFloat4713 * f_42_ + f_41_
					* class111_sub3_37_.aFloat4708 + (class111_sub3_37_.aFloat4704 * aFloat4704));
			aFloat4709 = (class111_sub3_37_.aFloat4706 * f_44_
					+ class111_sub3_37_.aFloat4714 * f_43_
					+ (aFloat4703 * class111_sub3_37_.aFloat4710) + class111_sub3_37_.aFloat4709);
			aFloat4702 = (f_43_ * class111_sub3_37_.aFloat4712
					+ class111_sub3_37_.aFloat4711 * f_44_
					+ (class111_sub3_37_.aFloat4705 * aFloat4703) + class111_sub3_37_.aFloat4702);
			aFloat4703 = ((aFloat4703 * class111_sub3_37_.aFloat4704)
					+ (class111_sub3_37_.aFloat4708 * f_43_ + f_44_
							* class111_sub3_37_.aFloat4713) + class111_sub3_37_.aFloat4703);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.QA(" + bool
					+ ',' + (class111 != null ? "{...}" : "null") + ')'));
		}
	}

	final float[] method2125(final float[] fs, final byte i) {
		try {
			fs[0] = aFloat4712;
			fs[12] = 0.0F;
			fs[6] = aFloat4710;
			fs[4] = aFloat4714;
			if (i > -55) {
				method2140(null, 66);
			}
			fs[14] = 0.0F;
			fs[9] = aFloat4713;
			fs[1] = aFloat4711;
			fs[11] = 0.0F;
			fs[13] = 0.0F;
			fs[3] = 0.0F;
			fs[7] = 0.0F;
			fs[15] = 0.0F;
			fs[8] = aFloat4708;
			fs[2] = aFloat4705;
			fs[5] = aFloat4706;
			fs[10] = aFloat4704;
			return fs;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.B("
					+ (fs != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final void method2103(final int i, final int i_45_, final int i_46_,
			final int[] is) {
		try {
			is[1] = (int) (aFloat4709 + (i_46_ * aFloat4710 + ((i_45_ * aFloat4706) + (aFloat4714 * i))));
			is[2] = (int) (aFloat4703 + (aFloat4704 * i_46_ + (aFloat4708 * i + (i_45_ * aFloat4713))));
			is[0] = (int) (aFloat4702 + (aFloat4712 * i + aFloat4711 * i_45_ + (aFloat4705 * i_46_)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.M(" + i + ','
					+ i_45_ + ',' + i_46_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final float method2126(final float f, final float f_47_, final float f_48_,
			final int i) {
		try {
			if (i <= 82) {
				method2141(40, 0.2517629F, 0.044088684F, -0.25122625F);
			}
			return (aFloat4702 + (f * aFloat4705 + (aFloat4711 * f_48_ + aFloat4712
					* f_47_)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.Q(" + f + ','
					+ f_47_ + ',' + f_48_ + ',' + i + ')'));
		}
	}

	public static void method2127(final int i) {
		try {
			if (i >= -30) {
				method2127(5);
			}
			anIntArray4707 = null;
			aClass207_4715 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.R(" + i + ')');
		}
	}

	final float[] method2128(final int i, final float[] fs) {
		try {
			fs[1] = aFloat4711;
			fs[9] = aFloat4713;
			fs[6] = aFloat4710;
			fs[14] = 0.0F;
			fs[7] = aFloat4709;
			if (i <= 107) {
				return null;
			}
			fs[3] = aFloat4702;
			fs[11] = aFloat4703;
			fs[10] = aFloat4704;
			fs[0] = aFloat4712;
			fs[2] = aFloat4705;
			fs[12] = 0.0F;
			fs[8] = aFloat4708;
			fs[4] = aFloat4714;
			fs[15] = 1.0F;
			fs[13] = 0.0F;
			fs[5] = aFloat4706;
			return fs;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.E(" + i + ','
					+ (fs != null ? "{...}" : "null") + ')'));
		}
	}

	final float[] method2129(final float[] fs, final int i) {
		try {
			fs[3] = aFloat4702;
			fs[5] = aFloat4706;
			fs[i] = aFloat4714;
			fs[7] = aFloat4709;
			fs[0] = aFloat4712;
			fs[1] = aFloat4711;
			fs[6] = aFloat4710;
			fs[2] = aFloat4705;
			return fs;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.KA("
					+ (fs != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final void method2092(final Class111 class111) {
		try {
			final Class111_Sub3 class111_sub3_49_ = (Class111_Sub3) class111;
			aFloat4708 = class111_sub3_49_.aFloat4708;
			aFloat4710 = class111_sub3_49_.aFloat4710;
			aFloat4705 = class111_sub3_49_.aFloat4705;
			aFloat4702 = class111_sub3_49_.aFloat4702;
			aFloat4704 = class111_sub3_49_.aFloat4704;
			aFloat4709 = class111_sub3_49_.aFloat4709;
			aFloat4712 = class111_sub3_49_.aFloat4712;
			aFloat4703 = class111_sub3_49_.aFloat4703;
			aFloat4714 = class111_sub3_49_.aFloat4714;
			aFloat4706 = class111_sub3_49_.aFloat4706;
			aFloat4713 = class111_sub3_49_.aFloat4713;
			aFloat4711 = class111_sub3_49_.aFloat4711;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.H("
					+ (class111 != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	final void method2093(final int i, final int i_50_, final int i_51_,
			final int i_52_, final int i_53_, final int i_54_) {
		try {
			final float f = Class64_Sub5.aFloatArray3653[0x3fff & i_52_];
			final float f_55_ = Class64_Sub5.aFloatArray3651[i_52_ & 0x3fff];
			final float f_56_ = Class64_Sub5.aFloatArray3653[0x3fff & i_53_];
			final float f_57_ = Class64_Sub5.aFloatArray3651[i_53_ & 0x3fff];
			final float f_58_ = Class64_Sub5.aFloatArray3653[i_54_ & 0x3fff];
			final float f_59_ = Class64_Sub5.aFloatArray3651[i_54_ & 0x3fff];
			final float f_60_ = f_55_ * f_58_;
			final float f_61_ = f_59_ * f_55_;
			aFloat4706 = f_58_ * f;
			aFloat4712 = f_56_ * f_58_ + f_61_ * f_57_;
			aFloat4710 = f_60_ * f_56_ + f_57_ * f_59_;
			aFloat4708 = f * f_57_;
			aFloat4711 = f_59_ * f;
			aFloat4713 = -f_55_;
			aFloat4714 = f_60_ * f_57_ + f_59_ * -f_56_;
			aFloat4705 = f_61_ * f_56_ + f_58_ * -f_57_;
			aFloat4704 = f * f_56_;
			aFloat4702 = (-(aFloat4705 * i_51_) + (-(aFloat4711 * i_50_) + aFloat4712
					* -i));
			aFloat4709 = (aFloat4714 * -i - i_50_ * aFloat4706 - i_51_
					* aFloat4710);
			aFloat4703 = (-(aFloat4704 * i_51_) + (-i * aFloat4708 - aFloat4713
					* i_50_));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.U(" + i + ','
					+ i_50_ + ',' + i_51_ + ',' + i_52_ + ',' + i_53_ + ','
					+ i_54_ + ')'));
		}
	}

	final void method2130(final Class111 class111, final Class111 class111_62_) {
		try {
			final Class111_Sub3 class111_sub3_63_ = (Class111_Sub3) class111;
			final Class111_Sub3 class111_sub3_64_ = (Class111_Sub3) class111_62_;
			aFloat4712 = ((class111_sub3_63_.aFloat4712 * class111_sub3_64_.aFloat4712)
					+ (class111_sub3_63_.aFloat4711 * class111_sub3_64_.aFloat4714) + (class111_sub3_63_.aFloat4705 * class111_sub3_64_.aFloat4708));
			aFloat4714 = ((class111_sub3_64_.aFloat4708 * class111_sub3_63_.aFloat4710) + ((class111_sub3_64_.aFloat4712 * class111_sub3_63_.aFloat4714) + (class111_sub3_63_.aFloat4706 * class111_sub3_64_.aFloat4714)));
			aFloat4708 = ((class111_sub3_63_.aFloat4713 * class111_sub3_64_.aFloat4714)
					+ (class111_sub3_63_.aFloat4708 * class111_sub3_64_.aFloat4712) + (class111_sub3_63_.aFloat4704 * class111_sub3_64_.aFloat4708));
			aFloat4711 = ((class111_sub3_63_.aFloat4705 * class111_sub3_64_.aFloat4713) + ((class111_sub3_64_.aFloat4706 * class111_sub3_63_.aFloat4711) + (class111_sub3_63_.aFloat4712 * class111_sub3_64_.aFloat4711)));
			aFloat4706 = ((class111_sub3_63_.aFloat4714 * class111_sub3_64_.aFloat4711)
					+ (class111_sub3_64_.aFloat4706 * class111_sub3_63_.aFloat4706) + (class111_sub3_63_.aFloat4710 * class111_sub3_64_.aFloat4713));
			aFloat4713 = ((class111_sub3_64_.aFloat4706 * class111_sub3_63_.aFloat4713)
					+ (class111_sub3_63_.aFloat4708 * class111_sub3_64_.aFloat4711) + (class111_sub3_63_.aFloat4704 * class111_sub3_64_.aFloat4713));
			aFloat4705 = ((class111_sub3_63_.aFloat4705 * class111_sub3_64_.aFloat4704) + ((class111_sub3_64_.aFloat4710 * class111_sub3_63_.aFloat4711) + (class111_sub3_63_.aFloat4712 * class111_sub3_64_.aFloat4705)));
			aFloat4710 = ((class111_sub3_63_.aFloat4706 * class111_sub3_64_.aFloat4710)
					+ (class111_sub3_63_.aFloat4714 * class111_sub3_64_.aFloat4705) + (class111_sub3_64_.aFloat4704 * class111_sub3_63_.aFloat4710));
			aFloat4702 = (class111_sub3_63_.aFloat4702 + ((class111_sub3_63_.aFloat4712 * class111_sub3_64_.aFloat4702)
					+ (class111_sub3_64_.aFloat4709 * class111_sub3_63_.aFloat4711) + (class111_sub3_64_.aFloat4703 * class111_sub3_63_.aFloat4705)));
			aFloat4704 = ((class111_sub3_64_.aFloat4704 * class111_sub3_63_.aFloat4704) + ((class111_sub3_63_.aFloat4708 * class111_sub3_64_.aFloat4705) + (class111_sub3_64_.aFloat4710 * class111_sub3_63_.aFloat4713)));
			aFloat4709 = ((class111_sub3_64_.aFloat4703 * class111_sub3_63_.aFloat4710)
					+ ((class111_sub3_63_.aFloat4714 * class111_sub3_64_.aFloat4702) + (class111_sub3_64_.aFloat4709 * class111_sub3_63_.aFloat4706)) + class111_sub3_63_.aFloat4709);
			aFloat4703 = ((class111_sub3_64_.aFloat4703 * class111_sub3_63_.aFloat4704)
					+ ((class111_sub3_63_.aFloat4713 * class111_sub3_64_.aFloat4709) + (class111_sub3_64_.aFloat4702 * class111_sub3_63_.aFloat4708)) + class111_sub3_63_.aFloat4703);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.GA("
					+ (class111 != null ? "{...}" : "null") + ','
					+ (class111_62_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2131(final float f, final boolean bool, final int i,
			final int i_65_, final float f_66_, final float f_67_,
			final int i_68_) {
		try {
			if (bool == false) {
				if ((i_68_ ^ 0xffffffff) == -1) {
					aFloat4709 = -i_65_ + f_66_;
					aFloat4706 = i_65_ * 2;
					aFloat4702 = f - i;
					aFloat4703 = f_67_;
					aFloat4714 = aFloat4708 = aFloat4711 = aFloat4713 = aFloat4705 = aFloat4710 = 0.0F;
					aFloat4704 = 1.0F;
					aFloat4712 = i * 2;
				} else {
					final float f_69_ = Class64_Sub5.aFloatArray3653[0x3fff & i_68_];
					final float f_70_ = Class64_Sub5.aFloatArray3651[i_68_ & 0x3fff];
					aFloat4703 = f_67_;
					aFloat4704 = 1.0F;
					aFloat4706 = i_65_ * (2.0F * f_69_);
					aFloat4709 = (2 * i_65_ * (-0.5F * f_70_ - 0.5F * f_69_) + f_66_);
					aFloat4708 = aFloat4713 = aFloat4705 = aFloat4710 = 0.0F;
					aFloat4702 = f + (0.5F * f_70_ - f_69_ * 0.5F) * (i * 2);
					aFloat4711 = i_65_ * (-2.0F * f_70_);
					aFloat4714 = i * (2.0F * f_70_);
					aFloat4712 = i * (f_69_ * 2.0F);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.WA(" + f + ','
					+ bool + ',' + i + ',' + i_65_ + ',' + f_66_ + ',' + f_67_
					+ ',' + i_68_ + ')'));
		}
	}

	final void method2132(final byte i, final Class111 class111) {
		try {
			final Class111_Sub3 class111_sub3_71_ = (Class111_Sub3) class111;
			aFloat4712 = class111_sub3_71_.aFloat4712;
			aFloat4711 = class111_sub3_71_.aFloat4714;
			aFloat4705 = class111_sub3_71_.aFloat4708;
			aFloat4714 = class111_sub3_71_.aFloat4711;
			aFloat4710 = class111_sub3_71_.aFloat4713;
			aFloat4706 = class111_sub3_71_.aFloat4706;
			aFloat4708 = class111_sub3_71_.aFloat4705;
			aFloat4704 = class111_sub3_71_.aFloat4704;
			aFloat4713 = class111_sub3_71_.aFloat4710;
			aFloat4702 = -((aFloat4712 * class111_sub3_71_.aFloat4702)
					+ (aFloat4711 * class111_sub3_71_.aFloat4709) + (class111_sub3_71_.aFloat4703 * aFloat4705));
			aFloat4709 = -((class111_sub3_71_.aFloat4703 * aFloat4710) + ((class111_sub3_71_.aFloat4709 * aFloat4706) + (class111_sub3_71_.aFloat4702 * aFloat4714)));
			aFloat4703 = -((class111_sub3_71_.aFloat4702 * aFloat4708)
					+ (class111_sub3_71_.aFloat4709 * aFloat4713) + (aFloat4704 * class111_sub3_71_.aFloat4703));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.DA(" + i + ','
					+ (class111 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method2105(final int i) {
		try {
			final float f = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			final float f_73_ = Class64_Sub5.aFloatArray3651[i & 0x3fff];
			final float f_74_ = aFloat4714;
			final float f_75_ = aFloat4706;
			final float f_76_ = aFloat4710;
			aFloat4714 = f_74_ * f - f_73_ * aFloat4708;
			final float f_77_ = aFloat4709;
			aFloat4708 = aFloat4708 * f + f_74_ * f_73_;
			aFloat4706 = f * f_75_ - aFloat4713 * f_73_;
			aFloat4713 = aFloat4713 * f + f_75_ * f_73_;
			aFloat4710 = -(f_73_ * aFloat4704) + f * f_76_;
			aFloat4704 = f_73_ * f_76_ + aFloat4704 * f;
			aFloat4709 = -(f_73_ * aFloat4703) + f_77_ * f;
			aFloat4703 = f_73_ * f_77_ + f * aFloat4703;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.O(" + i + ')');
		}
	}

	@Override
	final void method2097(final int i) {
		try {
			final float f = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			final float f_78_ = Class64_Sub5.aFloatArray3651[0x3fff & i];
			final float f_79_ = aFloat4712;
			final float f_80_ = aFloat4711;
			final float f_81_ = aFloat4705;
			aFloat4712 = f_79_ * f + f_78_ * aFloat4708;
			final float f_82_ = aFloat4702;
			aFloat4711 = aFloat4713 * f_78_ + f_80_ * f;
			aFloat4708 = aFloat4708 * f - f_79_ * f_78_;
			aFloat4713 = f * aFloat4713 - f_78_ * f_80_;
			aFloat4705 = f * f_81_ + f_78_ * aFloat4704;
			aFloat4704 = f * aFloat4704 - f_78_ * f_81_;
			aFloat4702 = aFloat4703 * f_78_ + f * f_82_;
			aFloat4703 = -(f_82_ * f_78_) + aFloat4703 * f;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.RA(" + i + ')');
		}
	}

	@Override
	final void method2100(final int i, final int i_83_, final int i_84_) {
		try {
			aFloat4712 = aFloat4706 = aFloat4704 = 1.0F;
			aFloat4709 = i_83_;
			aFloat4703 = i_84_;
			aFloat4714 = aFloat4708 = aFloat4711 = aFloat4713 = aFloat4705 = aFloat4710 = 0.0F;
			aFloat4702 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.SA(" + i + ','
					+ i_83_ + ',' + i_84_ + ')'));
		}
	}

	static final Class142 method2133(final byte i) {
		try {
			if (i != -20) {
				anInt4701 = -103;
			}
			try {
				return (Class142) Class.forName("Class142_Sub1").newInstance();
			} catch (final Throwable throwable) {
				return new Class142_Sub2();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.OA(" + i + ')');
		}
	}

	@Override
	final void method2104(final int i) {
		try {
			aFloat4704 = 1.0F;
			aFloat4712 = aFloat4706 = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			aFloat4714 = Class64_Sub5.aFloatArray3651[0x3fff & i];
			aFloat4705 = aFloat4702 = aFloat4710 = aFloat4709 = aFloat4708 = aFloat4713 = aFloat4703 = 0.0F;
			aFloat4711 = -aFloat4714;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.HA(" + i + ')');
		}
	}

	final void method2134(final int i, final float f, final float f_85_,
			final float[] fs, final float f_86_) {
		try {
			fs[0] = (f_85_ * aFloat4705 + (aFloat4711 * f_86_ + f * aFloat4712));
			fs[2] = (f * aFloat4708 + f_86_ * aFloat4713 + aFloat4704 * f_85_);
			if (i != -19890) {
				method2121((byte) -27, null);
			}
			fs[1] = (aFloat4710 * f_85_ + (aFloat4714 * f + f_86_ * aFloat4706));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.I(" + i + ','
					+ f + ',' + f_85_ + ',' + (fs != null ? "{...}" : "null")
					+ ',' + f_86_ + ')'));
		}
	}

	final float method2135(final float f, final float f_87_, final float f_88_,
			final boolean bool) {
		try {
			if (bool != false) {
				method2140(null, 53);
			}
			return (aFloat4703 + (aFloat4704 * f_87_ + (aFloat4713 * f + aFloat4708
					* f_88_)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.V(" + f + ','
					+ f_87_ + ',' + f_88_ + ',' + bool + ')'));
		}
	}

	final void method2136(final boolean bool) {
		try {
			aFloat4714 = -aFloat4714;
			aFloat4713 = -aFloat4713;
			aFloat4706 = -aFloat4706;
			aFloat4704 = -aFloat4704;
			aFloat4708 = -aFloat4708;
			aFloat4709 = -aFloat4709;
			if (bool != false) {
				anInt4701 = -32;
			}
			aFloat4703 = -aFloat4703;
			aFloat4710 = -aFloat4710;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.EA(" + bool
					+ ')');
		}
	}

	@Override
	final Class111 method2102() {
		try {
			final Class111_Sub3 class111_sub3_89_ = new Class111_Sub3();
			class111_sub3_89_.aFloat4703 = aFloat4703;
			class111_sub3_89_.aFloat4708 = aFloat4708;
			class111_sub3_89_.aFloat4712 = aFloat4712;
			class111_sub3_89_.aFloat4709 = aFloat4709;
			class111_sub3_89_.aFloat4704 = aFloat4704;
			class111_sub3_89_.aFloat4710 = aFloat4710;
			class111_sub3_89_.aFloat4713 = aFloat4713;
			class111_sub3_89_.aFloat4714 = aFloat4714;
			class111_sub3_89_.aFloat4711 = aFloat4711;
			class111_sub3_89_.aFloat4705 = aFloat4705;
			class111_sub3_89_.aFloat4702 = aFloat4702;
			class111_sub3_89_.aFloat4706 = aFloat4706;
			return class111_sub3_89_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.TA(" + ')');
		}
	}

	final void method2137(final float f, final byte i, final float f_90_,
			final float f_91_) {
		do {
			try {
				aFloat4712 = f_90_;
				aFloat4714 = 0.0F;
				aFloat4705 = 0.0F;
				aFloat4710 = 0.0F;
				aFloat4703 = 0.0F;
				aFloat4713 = 0.0F;
				aFloat4711 = 0.0F;
				aFloat4704 = f_91_;
				aFloat4706 = f;
				aFloat4709 = 0.0F;
				aFloat4702 = 0.0F;
				aFloat4708 = 0.0F;
				if (i < -108) {
					break;
				}
				method2126(0.43629217F, 1.0146681F, -0.31062412F, 60);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("og.W(" + f
						+ ',' + i + ',' + f_90_ + ',' + f_91_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2138(final float f, final float f_92_, final float f_93_,
			final int i) {
		do {
			try {
				aFloat4708 *= f;
				aFloat4706 *= f_92_;
				aFloat4703 *= f;
				aFloat4705 *= f_93_;
				aFloat4712 *= f_93_;
				aFloat4702 *= f_93_;
				aFloat4711 *= f_93_;
				aFloat4704 *= f;
				aFloat4714 *= f_92_;
				aFloat4713 *= f;
				aFloat4710 *= f_92_;
				aFloat4709 *= f_92_;
				if (i <= -47) {
					break;
				}
				anInt4701 = -90;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("og.T(" + f
						+ ',' + f_92_ + ',' + f_93_ + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method2106(final int i, final int i_94_, final int i_95_) {
		try {
			aFloat4702 += i;
			aFloat4703 += i_95_;
			aFloat4709 += i_94_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.G(" + i + ','
					+ i_94_ + ',' + i_95_ + ')'));
		}
	}

	@Override
	final void method2099(final int i, final int i_96_, final int i_97_,
			final int[] is) {
		try {
			is[0] = (int) (i * aFloat4712 + aFloat4711 * i_96_ + aFloat4705
					* i_97_);
			is[2] = (int) (i_97_ * aFloat4704 + (i * aFloat4708 + (aFloat4713 * i_96_)));
			is[1] = (int) (i_96_ * aFloat4706 + aFloat4714 * i + aFloat4710
					* i_97_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.MA(" + i + ','
					+ i_96_ + ',' + i_97_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final float method2139(final float f, final float f_98_, final float f_99_,
			final boolean bool) {
		try {
			if (bool != true) {
				return -0.64322424F;
			}
			return (f * aFloat4706 + aFloat4714 * f_98_ + aFloat4710 * f_99_ + aFloat4709);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.BA(" + f + ','
					+ f_98_ + ',' + f_99_ + ',' + bool + ')'));
		}
	}

	final void method2140(final Class111 class111, final int i) {
		try {
			final Class111_Sub3 class111_sub3_100_ = (Class111_Sub3) class111;
			aFloat4711 = class111_sub3_100_.aFloat4711;
			aFloat4708 = class111_sub3_100_.aFloat4708;
			aFloat4705 = class111_sub3_100_.aFloat4705;
			aFloat4703 = 0.0F;
			aFloat4702 = 0.0F;
			aFloat4710 = class111_sub3_100_.aFloat4710;
			aFloat4714 = class111_sub3_100_.aFloat4714;
			aFloat4709 = i;
			aFloat4706 = class111_sub3_100_.aFloat4706;
			aFloat4712 = class111_sub3_100_.aFloat4712;
			aFloat4704 = class111_sub3_100_.aFloat4704;
			aFloat4713 = class111_sub3_100_.aFloat4713;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.A("
					+ (class111 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final void method2108(final int[] is) {
		try {
			final float f = -aFloat4702 + is[0];
			final float f_101_ = is[1] - aFloat4709;
			final float f_102_ = -aFloat4703 + is[2];
			is[1] = (int) (f_101_ * aFloat4706 + aFloat4711 * f + aFloat4713
					* f_102_);
			is[2] = (int) (aFloat4704 * f_102_ + (aFloat4705 * f + f_101_
					* aFloat4710));
			is[0] = (int) (aFloat4708 * f_102_ + (f_101_ * aFloat4714 + f
					* aFloat4712));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.LA("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	public Class111_Sub3() {
		try {
			method2091();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.<init>(" + ')');
		}
	}

	final void method2141(final int i, final float f, final float f_103_,
			final float f_104_) {
		try {
			if (i >= -90) {
				anIntArray4707 = null;
			}
			aFloat4702 += f_104_;
			aFloat4703 += f_103_;
			aFloat4709 += f;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("og.L(" + i + ','
					+ f + ',' + f_103_ + ',' + f_104_ + ')'));
		}
	}

	@Override
	final void method2091() {
		try {
			aFloat4714 = aFloat4708 = aFloat4711 = aFloat4713 = aFloat4705 = aFloat4710 = aFloat4702 = aFloat4709 = aFloat4703 = 0.0F;
			aFloat4712 = aFloat4706 = aFloat4704 = 1.0F;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "og.CA(" + ')');
		}
	}
}
