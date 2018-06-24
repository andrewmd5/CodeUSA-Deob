/* Class332_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class332_Sub2 extends Class332 {
	private boolean aBoolean5410;
	private boolean aBoolean5411;
	private int anInt5412;
	private boolean aBoolean5413;
	private int anInt5414;
	private ha_Sub3 aHa_Sub3_5415;
	private int anInt5416 = 0;
	private boolean aBoolean5417;
	private int anInt5418;
	private int anInt5419;
	private boolean aBoolean5420 = false;
	static int anInt5421 = 0;
	private int anInt5422;
	static Class207 aClass207_5423;
	private Interface4_Impl2 anInterface4_Impl2_5424;

	@Override
	final void method3736(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_) {
		do {
			try {
				final int[] is = aHa_Sub3_5415.na(i_3_, i_4_, i_1_, i_2_);
				if (is == null) {
					break;
				}
				for (int i_5_ = 0; (is.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
					is[i_5_] = Class41.method366(is[i_5_], -16777216);
				}
				method3756(i, i_0_, i_1_, i_2_, is, 0, i_1_);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("pia.J(" + i
						+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_
						+ ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final int method3749() {
		try {
			return anInt5418 + anInt5419 + anInt5416;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pia.T(" + ')');
		}
	}

	public static void method3755(final int i) {
		try {
			if (i == -14320) {
				aClass207_5423 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pia.A(" + i + ')');
		}
	}

	private final void method3756(final int i, final int i_6_, final int i_7_,
			final int i_8_, final int[] is, final int i_9_, final int i_10_) {
		try {
			anInterface4_Impl2_5424.method49(17779, i_6_, i_8_, is, i, i_9_,
					i_10_, i_7_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pia.B(" + i + ','
					+ i_6_ + ',' + i_7_ + ',' + i_8_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_9_ + ','
					+ i_10_ + ')'));
		}
	}

	@Override
	final int method3737() {
		try {
			return anInt5414 + (anInt5412 + anInt5422);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pia.O(" + ')');
		}
	}

	@Override
	final void method3741(final int[] is) {
		try {
			is[3] = anInt5418;
			is[2] = anInt5422;
			is[1] = anInt5416;
			is[0] = anInt5414;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pia.S("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	final void method3733(float f, float f_11_, float f_12_, float f_13_,
			float f_14_, float f_15_, final int i, final int i_16_,
			final int i_17_, final int i_18_) {
		try {
			final Class111_Sub3 class111_sub3 = aHa_Sub3_5415
					.method1978((byte) -47);
			final Class111_Sub3 class111_sub3_19_ = aHa_Sub3_5415
					.method1957((byte) 63);
			anInterface4_Impl2_5424
					.method4(
							(byte) -81,
							((!aBoolean5410 && !aBoolean5411 && (i_18_ & 0x1) != 0) ? (Class284_Sub1_Sub1.aClass200_6187)
									: Class342.aClass200_2861));
			aHa_Sub3_5415.method2052(false);
			aHa_Sub3_5415.method2005(anInterface4_Impl2_5424, 118);
			aHa_Sub3_5415.method2001(i_17_, 69);
			aHa_Sub3_5415.method2015(i, (byte) -115);
			aHa_Sub3_5415.method2051(1, -93, Class64_Sub16.aClass65_3681);
			aHa_Sub3_5415.method1953(-92, Class64_Sub16.aClass65_3681, 1);
			aHa_Sub3_5415.method1984(2, i_16_);
			if (aBoolean5420) {
				final float f_20_ = method3737();
				final float f_21_ = method3749();
				final float f_22_ = (-f + f_12_) / f_20_;
				final float f_23_ = (f_13_ - f_11_) / f_20_;
				final float f_24_ = (-f + f_14_) / f_21_;
				final float f_25_ = (f_15_ - f_11_) / f_21_;
				final float f_26_ = f_24_ * anInt5416;
				final float f_27_ = f_25_ * anInt5416;
				final float f_28_ = f_22_ * anInt5414;
				final float f_29_ = f_23_ * anInt5414;
				final float f_30_ = anInt5422 * -f_22_;
				final float f_31_ = -f_23_ * anInt5422;
				final float f_32_ = -f_24_ * anInt5418;
				f = f + f_28_ + f_26_;
				f_11_ = f_11_ + f_29_ + f_27_;
				f_14_ = f_14_ + f_28_ + f_32_;
				f_13_ = f_31_ + f_13_ + f_27_;
				f_12_ = f_26_ + (f_30_ + f_12_);
				final float f_33_ = anInt5418 * -f_25_;
				f_15_ = f_33_ + (f_29_ + f_15_);
			}
			class111_sub3.method2123(1.0F, -f + f_14_, -f_11_ + f_13_, 0.0F,
					0.0F, 0.0F, f_15_ - f_11_, -f + f_12_, 0.0F, (byte) 123);
			class111_sub3.method2141(-99, f_11_, 0.0F, f);
			class111_sub3_19_.method2137(
					anInterface4_Impl2_5424.method45(-8473, anInt5419),
					(byte) -123,
					anInterface4_Impl2_5424.method42((byte) 53, anInt5412),
					1.0F);
			aHa_Sub3_5415.method2008(Class246_Sub3_Sub4_Sub5.aClass258_6260,
					(byte) 98);
			aHa_Sub3_5415.method1935(1);
			aHa_Sub3_5415.method2002((byte) -88);
			aHa_Sub3_5415.method1985(2);
			aHa_Sub3_5415.method2051(1, -107, IncomingOpcode.aClass65_459);
			aHa_Sub3_5415.method1953(-89, IncomingOpcode.aClass65_459, 1);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pia.BA(" + f
					+ ',' + f_11_ + ',' + f_12_ + ',' + f_13_ + ',' + f_14_
					+ ',' + f_15_ + ',' + i + ',' + i_16_ + ',' + i_17_ + ','
					+ i_18_ + ')'));
		}
	}

	@Override
	final void method3742(final int i, final int i_34_, final int i_35_) {
		try {
			final int[] is = aHa_Sub3_5415.na(i, i_34_, anInt5412, anInt5419);
			final int[] is_36_ = new int[anInt5419 * anInt5412];
			anInterface4_Impl2_5424.method44(anInt5412, 0, (byte) 87,
					anInt5419, 0, is_36_, 0);
			if ((i_35_ ^ 0xffffffff) != -1) {
				if ((i_35_ ^ 0xffffffff) != -2) {
					if ((i_35_ ^ 0xffffffff) == -3) {
						for (int i_37_ = 0; i_37_ < anInt5419; i_37_++) {
							final int i_38_ = i_37_ * anInt5412;
							for (int i_39_ = 0; ((anInt5412 ^ 0xffffffff) < (i_39_ ^ 0xffffffff)); i_39_++) {
								is_36_[i_39_ + i_38_] = (Class41.method366(
										(Class202.method2702(is[i_39_ + i_38_],
												-1286409473) << 1475591704),
										Class202.method2702(16777215,
												(is_36_[(i_39_ + i_38_)]))));
							}
						}
					} else if ((i_35_ ^ 0xffffffff) == -4) {
						for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (anInt5419 ^ 0xffffffff); i_40_++) {
							final int i_41_ = i_40_ * anInt5412;
							for (int i_42_ = 0; ((i_42_ ^ 0xffffffff) > (anInt5412 ^ 0xffffffff)); i_42_++) {
								is_36_[i_41_ + i_42_] = (Class41.method366(
										is[i_42_ + i_41_] != 0 ? -16777216 : 0,
										Class202.method2702(16777215,
												(is_36_[(i_41_ - -i_42_)]))));
							}
						}
					}
				} else {
					for (int i_43_ = 0; i_43_ < anInt5419; i_43_++) {
						final int i_44_ = i_43_ * anInt5412;
						for (int i_45_ = 0; i_45_ < anInt5412; i_45_++) {
							is_36_[i_44_ + i_45_] = (Class41.method366(
									Class202.method2702(16777215, is_36_[i_45_
											+ i_44_]),
									(Class202.method2702(1304231680, is[i_45_
											+ i_44_]) << -1936896592)));
						}
					}
				}
			} else {
				for (int i_46_ = 0; (anInt5419 ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++) {
					final int i_47_ = i_46_ * anInt5412;
					for (int i_48_ = 0; anInt5412 > i_48_; i_48_++) {
						is_36_[i_48_ + i_47_] = (Class41.method366(
								Class202.method2702(-16776984, (is[i_47_
										- -i_48_] << -1575239864)),
								Class202.method2702(16777215, is_36_[i_48_
										+ i_47_])));
					}
				}
			}
			method3756(0, 0, anInt5412, anInt5419, is_36_, 0, anInt5412);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pia.F(" + i + ','
					+ i_34_ + ',' + i_35_ + ')'));
		}
	}

	@Override
	final void method3740(final int i, final int i_49_, final int i_50_,
			final int i_51_) {
		try {
			anInt5418 = i_51_;
			anInt5414 = i;
			anInt5422 = i_50_;
			anInt5416 = i_49_;
			aBoolean5420 = (anInt5414 != 0 || (anInt5416 ^ 0xffffffff) != -1
					|| (anInt5422 ^ 0xffffffff) != -1 || (anInt5418 ^ 0xffffffff) != -1);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pia.Q(" + i + ','
					+ i_49_ + ',' + i_50_ + ',' + i_51_ + ')'));
		}
	}

	@Override
	final void method3728(final int i, final int i_52_, final int i_53_,
			final int i_54_, final int i_55_, final int i_56_, final int i_57_) {
		try {
			final Class111_Sub3 class111_sub3 = aHa_Sub3_5415
					.method1978((byte) 111);
			final Class111_Sub3 class111_sub3_58_ = aHa_Sub3_5415
					.method1957((byte) -88);
			anInterface4_Impl2_5424
					.method4((byte) -81, Class342.aClass200_2861);
			aHa_Sub3_5415.method2052(false);
			aHa_Sub3_5415.method2005(anInterface4_Impl2_5424, -115);
			aHa_Sub3_5415.method2001(i_57_, 110);
			aHa_Sub3_5415.method2015(i_55_, (byte) 77);
			aHa_Sub3_5415.method2051(1, -98, Class64_Sub16.aClass65_3681);
			aHa_Sub3_5415.method1953(-67, Class64_Sub16.aClass65_3681, 1);
			aHa_Sub3_5415.method1984(2, i_56_);
			final boolean bool = (aBoolean5417
					&& (anInt5416 ^ 0xffffffff) == -1 && (anInt5418 ^ 0xffffffff) == -1);
			final boolean bool_59_ = aBoolean5413 && anInt5414 == 0
					&& anInt5422 == 0;
			if (!(bool_59_ & bool)) {
				if (!bool_59_) {
					if (bool) {
						final int i_60_ = i_53_ + i;
						final int i_61_ = method3737();
						class111_sub3_58_.method2137(anInterface4_Impl2_5424
								.method45(-8473, i_54_), (byte) -128,
								anInterface4_Impl2_5424.method42((byte) 111,
										anInt5412), 1.0F);
						aHa_Sub3_5415.method2008(
								(Class246_Sub3_Sub4_Sub5.aClass258_6260),
								(byte) 69);
						int i_62_ = i + anInt5414;
						int i_63_ = anInt5412 + i_62_;
						while (i_60_ >= i_63_) {
							class111_sub3.method2137(i_54_, (byte) -119,
									anInt5412, 0.0F);
							class111_sub3.method2106(i_62_, i_52_, 0);
							aHa_Sub3_5415.method1935(1);
							i_62_ += i_61_;
							i_63_ += i_61_;
							aHa_Sub3_5415.method2002((byte) -124);
						}
						if ((i_62_ ^ 0xffffffff) > (i_60_ ^ 0xffffffff)) {
							final int i_64_ = i_60_ - i_62_;
							class111_sub3_58_.method2137(
									anInterface4_Impl2_5424.method45(-8473,
											i_54_), (byte) -121,
									anInterface4_Impl2_5424.method42(
											(byte) -86, i_64_), 1.0F);
							aHa_Sub3_5415.method2008(
									(Class246_Sub3_Sub4_Sub5.aClass258_6260),
									(byte) 107);
							class111_sub3.method2137(i_54_, (byte) -125, i_64_,
									0.0F);
							class111_sub3.method2106(i_62_, i_52_, 0);
							aHa_Sub3_5415.method1935(1);
							aHa_Sub3_5415.method2002((byte) -119);
						}
					} else {
						final int i_65_ = i_52_ - -i_54_;
						final int i_66_ = i_53_ + i;
						final int i_67_ = method3737();
						final int i_68_ = method3749();
						int i_69_ = anInt5416 + i_52_;
						int i_70_ = anInt5419 + i_69_;
						while (i_65_ >= i_70_) {
							class111_sub3_58_.method2137(
									anInterface4_Impl2_5424.method45(-8473,
											anInt5419), (byte) -114,
									anInterface4_Impl2_5424.method42(
											(byte) -85, anInt5412), 1.0F);
							aHa_Sub3_5415.method2008(
									(Class246_Sub3_Sub4_Sub5.aClass258_6260),
									(byte) 64);
							int i_71_ = anInt5414 + i;
							int i_72_ = i_71_ - -anInt5412;
							while ((i_66_ ^ 0xffffffff) <= (i_72_ ^ 0xffffffff)) {
								class111_sub3.method2137(anInt5419,
										(byte) -125, anInt5412, 0.0F);
								class111_sub3.method2106(i_71_, i_69_, 0);
								aHa_Sub3_5415.method1935(1);
								i_72_ += i_67_;
								aHa_Sub3_5415.method2002((byte) -128);
								i_71_ += i_67_;
							}
							if ((i_71_ ^ 0xffffffff) > (i_66_ ^ 0xffffffff)) {
								final int i_73_ = -i_71_ + i_66_;
								class111_sub3_58_.method2137(
										anInterface4_Impl2_5424.method45(-8473,
												anInt5419), (byte) -110,
										anInterface4_Impl2_5424.method42(
												(byte) -55, i_73_), 1.0F);
								aHa_Sub3_5415.method2008(
										Class246_Sub3_Sub4_Sub5.aClass258_6260,
										(byte) 26);
								class111_sub3.method2137(anInt5419,
										(byte) -115, i_73_, 0.0F);
								class111_sub3.method2106(i_71_, i_69_, 0);
								aHa_Sub3_5415.method1935(1);
								aHa_Sub3_5415.method2002((byte) 53);
							}
							i_70_ += i_68_;
							i_69_ += i_68_;
						}
						if (i_69_ < i_65_) {
							final int i_74_ = i_65_ - i_69_;
							class111_sub3_58_.method2137(
									anInterface4_Impl2_5424.method45(-8473,
											i_74_), (byte) -122,
									anInterface4_Impl2_5424.method42(
											(byte) -100, anInt5412), 1.0F);
							aHa_Sub3_5415.method2008(
									(Class246_Sub3_Sub4_Sub5.aClass258_6260),
									(byte) 105);
							int i_75_ = i - -anInt5414;
							for (int i_76_ = i_75_ - -anInt5412; (i_66_ ^ 0xffffffff) <= (i_76_ ^ 0xffffffff); i_76_ += i_67_) {
								class111_sub3.method2137(i_74_, (byte) -119,
										anInt5412, 0.0F);
								class111_sub3.method2106(i_75_, i_69_, 0);
								aHa_Sub3_5415.method1935(1);
								aHa_Sub3_5415.method2002((byte) -113);
								i_75_ += i_67_;
							}
							if (i_75_ < i_66_) {
								final int i_77_ = i_66_ + -i_75_;
								class111_sub3_58_.method2137(
										anInterface4_Impl2_5424.method45(-8473,
												i_74_), (byte) -109,
										anInterface4_Impl2_5424.method42(
												(byte) 101, i_77_), 1.0F);
								aHa_Sub3_5415.method2008(
										Class246_Sub3_Sub4_Sub5.aClass258_6260,
										(byte) 125);
								class111_sub3.method2137(i_74_, (byte) -123,
										i_77_, 0.0F);
								class111_sub3.method2106(i_75_, i_69_, 0);
								aHa_Sub3_5415.method1935(1);
								aHa_Sub3_5415.method2002((byte) -105);
							}
						}
					}
				} else {
					final int i_78_ = i_54_ + i_52_;
					final int i_79_ = method3749();
					class111_sub3_58_
							.method2137(anInterface4_Impl2_5424.method45(-8473,
									anInt5419), (byte) -119,
									anInterface4_Impl2_5424.method42(
											(byte) -69, i_53_), 1.0F);
					aHa_Sub3_5415
							.method2008(
									(Class246_Sub3_Sub4_Sub5.aClass258_6260),
									(byte) 49);
					int i_80_ = anInt5416 + i_52_;
					int i_81_ = i_80_ - -anInt5419;
					while (i_81_ <= i_78_) {
						class111_sub3.method2137(anInt5419, (byte) -114, i_53_,
								0.0F);
						class111_sub3.method2106(i, i_80_, 0);
						aHa_Sub3_5415.method1935(1);
						i_81_ += i_79_;
						aHa_Sub3_5415.method2002((byte) -108);
						i_80_ += i_79_;
					}
					if ((i_80_ ^ 0xffffffff) > (i_78_ ^ 0xffffffff)) {
						final int i_82_ = -i_80_ + i_78_;
						class111_sub3_58_.method2137(anInterface4_Impl2_5424
								.method45(-8473, i_82_), (byte) -122,
								anInterface4_Impl2_5424.method42((byte) 79,
										i_53_), 1.0F);
						aHa_Sub3_5415.method2008(
								(Class246_Sub3_Sub4_Sub5.aClass258_6260),
								(byte) 97);
						class111_sub3.method2137(i_82_, (byte) -118, i_53_,
								0.0F);
						class111_sub3.method2106(i, i_80_, 0);
						aHa_Sub3_5415.method1935(1);
						aHa_Sub3_5415.method2002((byte) -117);
					}
				}
			} else {
				class111_sub3_58_.method2137(
						anInterface4_Impl2_5424.method45(-8473, i_54_),
						(byte) -123,
						anInterface4_Impl2_5424.method42((byte) 119, i_53_),
						1.0F);
				class111_sub3.method2137(i_54_, (byte) -120, i_53_, 0.0F);
				class111_sub3.method2106(i, i_52_, 0);
				aHa_Sub3_5415.method2008(
						(Class246_Sub3_Sub4_Sub5.aClass258_6260), (byte) 53);
				aHa_Sub3_5415.method1935(1);
				aHa_Sub3_5415.method2002((byte) -100);
			}
			aHa_Sub3_5415.method1985(2);
			aHa_Sub3_5415.method2051(1, -79, IncomingOpcode.aClass65_459);
			aHa_Sub3_5415.method1953(-86, IncomingOpcode.aClass65_459, 1);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pia.K(" + i + ','
					+ i_52_ + ',' + i_53_ + ',' + i_54_ + ',' + i_55_ + ','
					+ i_56_ + ',' + i_57_ + ')'));
		}
	}

	@Override
	final void method3729(int i, int i_83_, final aa var_aa, final int i_84_,
			final int i_85_) {
		try {
			final aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
			i_83_ += anInt5416;
			i += anInt5414;
			final Interface4_Impl2 interface4_impl2 = var_aa_Sub2.anInterface4_Impl2_3563;
			anInterface4_Impl2_5424
					.method4((byte) -81, Class342.aClass200_2861);
			aHa_Sub3_5415.method2052(false);
			aHa_Sub3_5415.method2005(anInterface4_Impl2_5424, 43);
			aHa_Sub3_5415.method2001(1, 117);
			aHa_Sub3_5415.method2015(1, (byte) -122);
			final Class111_Sub3 class111_sub3 = aHa_Sub3_5415
					.method1978((byte) 123);
			class111_sub3.method2137(anInt5419, (byte) -109, anInt5412, 0.0F);
			class111_sub3.method2106(i, i_83_, 0);
			aHa_Sub3_5415.method1935(1);
			final Class111_Sub3 class111_sub3_86_ = aHa_Sub3_5415
					.method1957((byte) -96);
			class111_sub3_86_.method2137(
					anInterface4_Impl2_5424.method45(-8473, anInt5419),
					(byte) -123,
					anInterface4_Impl2_5424.method42((byte) -62, anInt5412),
					1.0F);
			aHa_Sub3_5415.method2008(Class246_Sub3_Sub4_Sub5.aClass258_6260,
					(byte) 30);
			aHa_Sub3_5415.method1951((byte) 120, 1);
			aHa_Sub3_5415.method2005(interface4_impl2, 102);
			aHa_Sub3_5415.method2019(Class249.aClass128_1903,
					Class288.aClass128_3381, 22831);
			aHa_Sub3_5415.method2051(0, -86, IncomingOpcode.aClass65_459);
			final Class111_Sub3 class111_sub3_87_ = aHa_Sub3_5415
					.method1957((byte) 93);
			class111_sub3_87_.method2137(
					interface4_impl2.method45(-8473, anInt5419), (byte) -125,
					interface4_impl2.method42((byte) 103, anInt5412), 1.0F);
			class111_sub3_87_.method2141(-118,
					interface4_impl2.method45(-8473, -i_85_ + i_83_), 0.0F,
					interface4_impl2.method42((byte) 58, -i_84_ + i));
			aHa_Sub3_5415.method2008(Class246_Sub3_Sub4_Sub5.aClass258_6260,
					(byte) 57);
			aHa_Sub3_5415.method2002((byte) -120);
			aHa_Sub3_5415.method1985(2);
			aHa_Sub3_5415.method2051(0, -121, Class300.aClass65_2499);
			aHa_Sub3_5415.method2019(Class249.aClass128_1903,
					Class249.aClass128_1903, 22831);
			aHa_Sub3_5415.method2005(null, 104);
			aHa_Sub3_5415.method1951((byte) 120, 0);
			aHa_Sub3_5415.method1985(2);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pia.D(" + i + ','
					+ i_83_ + ',' + (var_aa != null ? "{...}" : "null") + ','
					+ i_84_ + ',' + i_85_ + ')'));
		}
	}

	@Override
	final void method3747(final float f, final float f_88_, final float f_89_,
			final float f_90_, final float f_91_, final float f_92_,
			final int i, final aa var_aa, final int i_93_, final int i_94_) {
		try {
			final Class111_Sub3 class111_sub3 = aHa_Sub3_5415
					.method1978((byte) 102);
			final Class111_Sub3 class111_sub3_95_ = aHa_Sub3_5415
					.method1957((byte) -80);
			final aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
			final Interface4_Impl2 interface4_impl2 = var_aa_Sub2.anInterface4_Impl2_3563;
			anInterface4_Impl2_5424
					.method4(
							(byte) -81,
							((aBoolean5410 || aBoolean5411 || (0x1 & i) == 0) ? Class342.aClass200_2861
									: (Class284_Sub1_Sub1.aClass200_6187)));
			aHa_Sub3_5415.method2052(false);
			aHa_Sub3_5415.method2005(anInterface4_Impl2_5424, -120);
			aHa_Sub3_5415.method2001(1, 83);
			aHa_Sub3_5415.method2015(1, (byte) 118);
			do {
				if (!aBoolean5420) {
					class111_sub3.method2123(1.0F, f_91_ - f, -f_88_ + f_90_,
							0.0F, 0.0F, 0.0F, f_92_ - f_88_, -f + f_89_, 0.0F,
							(byte) 104);
					class111_sub3.method2141(-97, f_88_, 0.0F, f);
					if (!client.aBoolean3553) {
						break;
					}
				}
				final float f_96_ = (float) anInt5412 / (float) method3737();
				final float f_97_ = (float) anInt5419 / (float) method3749();
				class111_sub3.method2123(1.0F, f_97_ * (f_91_ - f),
						(f_90_ - f_88_) * f_96_, 0.0F, 0.0F, 0.0F, f_97_
								* (-f_88_ + f_92_), (f_89_ - f) * f_96_, 0.0F,
						(byte) 92);
				class111_sub3.method2141(-118, (anInt5416 + f_88_) * f_97_,
						0.0F, (f + anInt5414) * f_96_);
			} while (false);
			class111_sub3_95_.method2137(
					anInterface4_Impl2_5424.method45(-8473, anInt5419),
					(byte) -110,
					anInterface4_Impl2_5424.method42((byte) -128, anInt5412),
					1.0F);
			aHa_Sub3_5415.method2008(Class246_Sub3_Sub4_Sub5.aClass258_6260,
					(byte) 39);
			aHa_Sub3_5415.method1951((byte) 120, 1);
			aHa_Sub3_5415.method2005(interface4_impl2, 73);
			aHa_Sub3_5415.method2019(Class249.aClass128_1903,
					Class288.aClass128_3381, 22831);
			aHa_Sub3_5415.method2051(0, -59, IncomingOpcode.aClass65_459);
			final Class111_Sub3 class111_sub3_98_ = aHa_Sub3_5415
					.method1957((byte) -128);
			class111_sub3_98_.method2092(class111_sub3);
			class111_sub3_98_.method2106(-i_93_, -i_94_, 0);
			class111_sub3_98_.method2138(1.0F,
					interface4_impl2.method45(-8473, 1.0F),
					interface4_impl2.method42((byte) 62, 1.0F), -76);
			aHa_Sub3_5415.method2008(Class246_Sub3_Sub4_Sub5.aClass258_6260,
					(byte) 89);
			aHa_Sub3_5415.method1935(1);
			aHa_Sub3_5415.method2002((byte) 88);
			aHa_Sub3_5415.method1985(2);
			aHa_Sub3_5415.method2051(0, -63, Class300.aClass65_2499);
			aHa_Sub3_5415.method2019(Class249.aClass128_1903,
					Class249.aClass128_1903, 22831);
			aHa_Sub3_5415.method2005(null, 2);
			aHa_Sub3_5415.method1951((byte) 120, 0);
			aHa_Sub3_5415.method1985(2);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pia.L(" + f + ','
					+ f_88_ + ',' + f_89_ + ',' + f_90_ + ',' + f_91_ + ','
					+ f_92_ + ',' + i + ','
					+ (var_aa != null ? "{...}" : "null") + ',' + i_93_ + ','
					+ i_94_ + ')'));
		}
	}

	@Override
	final int method3734() {
		try {
			return anInt5412;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pia.AA(" + ')');
		}
	}

	@Override
	final void method3745(int i, int i_99_, int i_100_, int i_101_,
			final int i_102_, final int i_103_, final int i_104_,
			final int i_105_) {
		try {
			final Class111_Sub3 class111_sub3 = aHa_Sub3_5415
					.method1978((byte) 4);
			final Class111_Sub3 class111_sub3_106_ = aHa_Sub3_5415
					.method1957((byte) 103);
			anInterface4_Impl2_5424
					.method4(
							(byte) -81,
							((aBoolean5410 || aBoolean5411 || ((0x1 & i_105_ ^ 0xffffffff) == -1)) ? Class342.aClass200_2861
									: (Class284_Sub1_Sub1.aClass200_6187)));
			aHa_Sub3_5415.method2052(false);
			aHa_Sub3_5415.method2005(anInterface4_Impl2_5424, -123);
			aHa_Sub3_5415.method2001(i_104_, 96);
			aHa_Sub3_5415.method2015(i_102_, (byte) 28);
			aHa_Sub3_5415.method2051(1, -121, Class64_Sub16.aClass65_3681);
			aHa_Sub3_5415.method1953(-111, Class64_Sub16.aClass65_3681, 1);
			aHa_Sub3_5415.method1984(2, i_103_);
			class111_sub3_106_.method2137(
					anInterface4_Impl2_5424.method45(-8473, anInt5419),
					(byte) -112,
					anInterface4_Impl2_5424.method42((byte) -52, anInt5412),
					1.0F);
			if (aBoolean5420) {
				i_100_ = anInt5412 * i_100_ / method3737();
				i_101_ = anInt5419 * i_101_ / method3749();
				i += anInt5414 * i_100_ / anInt5412;
				i_99_ += i_101_ * anInt5416 / anInt5419;
			}
			class111_sub3.method2137(i_101_, (byte) -113, i_100_, 0.0F);
			class111_sub3.method2106(i, i_99_, 0);
			aHa_Sub3_5415.method2008(Class246_Sub3_Sub4_Sub5.aClass258_6260,
					(byte) 52);
			aHa_Sub3_5415.method1935(1);
			aHa_Sub3_5415.method2002((byte) -104);
			aHa_Sub3_5415.method1985(2);
			aHa_Sub3_5415.method2051(1, -84, IncomingOpcode.aClass65_459);
			aHa_Sub3_5415.method1953(-69, IncomingOpcode.aClass65_459, 1);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pia.C(" + i + ','
					+ i_99_ + ',' + i_100_ + ',' + i_101_ + ',' + i_102_ + ','
					+ i_103_ + ',' + i_104_ + ',' + i_105_ + ')'));
		}
	}

	@Override
	final int method3731() {
		try {
			return anInt5419;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pia.U(" + ')');
		}
	}

	@Override
	final void method3748(int i, int i_107_, final int i_108_,
			final int i_109_, final int i_110_) {
		try {
			final Class111_Sub3 class111_sub3 = aHa_Sub3_5415
					.method1978((byte) 95);
			final Class111_Sub3 class111_sub3_111_ = aHa_Sub3_5415
					.method1957((byte) -94);
			i_107_ += anInt5416;
			i += anInt5414;
			anInterface4_Impl2_5424
					.method4((byte) -81, Class342.aClass200_2861);
			aHa_Sub3_5415.method2052(false);
			aHa_Sub3_5415.method2005(anInterface4_Impl2_5424, 57);
			aHa_Sub3_5415.method2001(i_110_, 91);
			aHa_Sub3_5415.method2015(i_108_, (byte) -119);
			aHa_Sub3_5415.method2051(1, -73, Class64_Sub16.aClass65_3681);
			aHa_Sub3_5415.method1953(-107, Class64_Sub16.aClass65_3681, 1);
			aHa_Sub3_5415.method1984(2, i_109_);
			class111_sub3.method2137(anInt5419, (byte) -120, anInt5412, 0.0F);
			class111_sub3.method2106(i, i_107_, 0);
			class111_sub3_111_.method2137(
					anInterface4_Impl2_5424.method45(-8473, anInt5419),
					(byte) -111,
					anInterface4_Impl2_5424.method42((byte) 52, anInt5412),
					1.0F);
			aHa_Sub3_5415.method2008(Class246_Sub3_Sub4_Sub5.aClass258_6260,
					(byte) 28);
			aHa_Sub3_5415.method1935(1);
			aHa_Sub3_5415.method2002((byte) -113);
			aHa_Sub3_5415.method1985(2);
			aHa_Sub3_5415.method2051(1, -112, IncomingOpcode.aClass65_459);
			aHa_Sub3_5415.method1953(-102, IncomingOpcode.aClass65_459, 1);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("pia.E(" + i + ',' + i_107_ + ',' + i_108_ + ',' + i_109_
							+ ',' + i_110_ + ')'));
		}
	}

	Class332_Sub2(final ha_Sub3 var_ha_Sub3, final int i, final int i_112_,
			final boolean bool) {
		anInt5418 = 0;
		anInt5414 = 0;
		anInt5422 = 0;
		try {
			aHa_Sub3_5415 = var_ha_Sub3;
			anInt5412 = i;
			anInt5419 = i_112_;
			anInterface4_Impl2_5424 = var_ha_Sub3.method2006(i_112_, i,
					(!bool ? Class98_Sub40.aClass164_4190
							: Class62.aClass164_486), (byte) 45,
					Class162.aClass162_1266);
			anInterface4_Impl2_5424.method46(true, true, 116);
			aBoolean5410 = anInterface4_Impl2_5424.method47(12941) != i;
			aBoolean5411 = (anInterface4_Impl2_5424.method43(116) ^ 0xffffffff) != (i_112_ ^ 0xffffffff);
			aBoolean5413 = !aBoolean5410
					&& anInterface4_Impl2_5424.method48(-62);
			aBoolean5417 = !aBoolean5411
					&& anInterface4_Impl2_5424.method48(-33);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pia.<init>("
					+ (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i + ','
					+ i_112_ + ',' + bool + ')'));
		}
	}

	Class332_Sub2(final ha_Sub3 var_ha_Sub3, final int i, final int i_113_,
			final int[] is, final int i_114_, final int i_115_) {
		anInt5418 = 0;
		anInt5414 = 0;
		anInt5422 = 0;
		try {
			anInt5419 = i_113_;
			anInt5412 = i;
			aHa_Sub3_5415 = var_ha_Sub3;
			anInterface4_Impl2_5424 = var_ha_Sub3.method2063(i_114_,
					(byte) 124, is, false, i, i_113_, i_115_);
			anInterface4_Impl2_5424.method46(true, true, 102);
			aBoolean5410 = (i ^ 0xffffffff) != (anInterface4_Impl2_5424
					.method47(12941) ^ 0xffffffff);
			aBoolean5411 = anInterface4_Impl2_5424.method43(124) != i_113_;
			aBoolean5413 = !aBoolean5410
					&& anInterface4_Impl2_5424.method48(-116);
			aBoolean5417 = !aBoolean5411
					&& anInterface4_Impl2_5424.method48(-111);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pia.<init>("
					+ (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i + ','
					+ i_113_ + ',' + (is != null ? "{...}" : "null") + ','
					+ i_114_ + ',' + i_115_ + ')'));
		}
	}
}
