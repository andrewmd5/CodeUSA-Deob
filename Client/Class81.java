/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class81 {
	private final int[] anIntArray608 = new int[1600];
	private Interface2_Impl2 anInterface2_Impl2_609;
	private final Class246_Sub4_Sub2[][] aClass246_Sub4_Sub2ArrayArray610 = new Class246_Sub4_Sub2[64][768];
	private Class256 aClass256_611;
	private Interface2_Impl1 anInterface2_Impl1_612;
	private int anInt613;
	private int[] anIntArray614 = new int[64];
	private int[] anIntArray615;
	private Class246_Sub4_Sub2[][] aClass246_Sub4_Sub2ArrayArray616;
	static Class100 aClass100_617 = new Class100(16);
	static s[] aSArray618;
	static Class98_Sub31_Sub3 aClass98_Sub31_Sub3_619;
	static Class98_Sub7 aClass98_Sub7_620;
	static boolean aBoolean621 = false;
	static Class207 aClass207_622;
	private Interface2_Impl1 anInterface2_Impl1_623;
	static int anInt624;

	private final void method811(final ha_Sub3 var_ha_Sub3, final byte i,
			final int i_0_) {
		do {
			try {
				int i_1_ = 0;
				final Class111_Sub3 class111_sub3 = var_ha_Sub3.method2027(0);
				final float f = class111_sub3.aFloat4712;
				final float f_2_ = class111_sub3.aFloat4711;
				final float f_3_ = class111_sub3.aFloat4705;
				final float f_4_ = class111_sub3.aFloat4714;
				final float f_5_ = class111_sub3.aFloat4706;
				final float f_6_ = class111_sub3.aFloat4710;
				final float f_7_ = f_4_ + f;
				final float f_8_ = f_2_ + f_5_;
				final float f_9_ = f_3_ + f_6_;
				final float f_10_ = -f_4_ + f;
				final float f_11_ = -f_5_ + f_2_;
				final float f_12_ = -f_6_ + f_3_;
				final float f_13_ = -f + f_4_;
				final float f_14_ = f_5_ - f_2_;
				final float f_15_ = f_6_ - f_3_;
				if (i != -14) {
					anInt624 = -5;
				}
				final Buffer buffer = anInterface2_Impl1_623.method75(true,
						(byte) 27);
				if (buffer != null) {
					final Stream stream = var_ha_Sub3.method2043(i + 24036,
							buffer);
					if (Stream.a()) {
						for (int i_16_ = i_0_ - 1; (i_16_ ^ 0xffffffff) <= -1; i_16_--) {
							final int i_17_ = (anIntArray608[i_16_] > 64 ? 64
									: anIntArray608[i_16_]);
							if ((i_17_ ^ 0xffffffff) < -1) {
								for (int i_18_ = i_17_ - 1; (i_18_ ^ 0xffffffff) <= -1; i_18_--) {
									final Class246_Sub4_Sub2 class246_sub4_sub2 = (aClass246_Sub4_Sub2ArrayArray616[i_16_][i_18_]);
									final int i_19_ = (class246_sub4_sub2.anInt6178);
									final byte i_20_ = (byte) (i_19_ >> 1004982320);
									final byte i_21_ = (byte) (i_19_ >> -1475022584);
									final byte i_22_ = (byte) i_19_;
									final byte i_23_ = (byte) (i_19_ >>> 499468248);
									final float f_24_ = (class246_sub4_sub2.anInt6176) >> -1148612052;
									final float f_25_ = (class246_sub4_sub2.anInt6177) >> -1842071796;
									final float f_26_ = (class246_sub4_sub2.anInt6175) >> 1522356492;
									final int i_27_ = (class246_sub4_sub2.anInt6179 >> -2078565748);
									stream.b(f_24_ + f_7_ * -i_27_);
									stream.b(f_25_ + f_8_ * -i_27_);
									stream.b(-i_27_ * f_9_ + f_26_);
									if (var_ha_Sub3.anInt4580 != 0) {
										stream.b(i_20_, i_21_, i_22_, i_23_);
									} else {
										stream.a(i_20_, i_21_, i_22_, i_23_);
									}
									stream.b(0.0F);
									stream.b(0.0F);
									stream.b(f_24_ + f_10_ * i_27_);
									stream.b(f_25_ + f_11_ * i_27_);
									stream.b(f_12_ * i_27_ + f_26_);
									if ((var_ha_Sub3.anInt4580 ^ 0xffffffff) == -1) {
										stream.a(i_20_, i_21_, i_22_, i_23_);
									} else {
										stream.b(i_20_, i_21_, i_22_, i_23_);
									}
									stream.b(1.0F);
									stream.b(0.0F);
									stream.b(f_7_ * i_27_ + f_24_);
									stream.b(i_27_ * f_8_ + f_25_);
									stream.b(i_27_ * f_9_ + f_26_);
									if (var_ha_Sub3.anInt4580 == 0) {
										stream.a(i_20_, i_21_, i_22_, i_23_);
									} else {
										stream.b(i_20_, i_21_, i_22_, i_23_);
									}
									stream.b(1.0F);
									stream.b(1.0F);
									stream.b(f_24_ + f_13_ * i_27_);
									stream.b(f_14_ * i_27_ + f_25_);
									stream.b(i_27_ * f_15_ + f_26_);
									if ((var_ha_Sub3.anInt4580 ^ 0xffffffff) != -1) {
										stream.b(i_20_, i_21_, i_22_, i_23_);
									} else {
										stream.a(i_20_, i_21_, i_22_, i_23_);
									}
									stream.b(0.0F);
									i_1_++;
									stream.b(1.0F);
								}
								if (anIntArray608[i_16_] > 64) {
									final int i_28_ = anIntArray608[i_16_]
											+ -64 + -1;
									for (int i_29_ = anIntArray614[i_28_] + -1; i_29_ >= 0; i_29_--) {
										final Class246_Sub4_Sub2 class246_sub4_sub2 = (aClass246_Sub4_Sub2ArrayArray610[i_28_][i_29_]);
										final int i_30_ = (class246_sub4_sub2.anInt6178);
										final byte i_31_ = (byte) (i_30_ >> -1731208688);
										final byte i_32_ = (byte) (i_30_ >> 2114755272);
										final byte i_33_ = (byte) i_30_;
										final byte i_34_ = (byte) (i_30_ >>> 42394680);
										final float f_35_ = (class246_sub4_sub2.anInt6176) >> -1812783700;
										final float f_36_ = (class246_sub4_sub2.anInt6177) >> -1875090740;
										final float f_37_ = (class246_sub4_sub2.anInt6175) >> -1949960628;
										final int i_38_ = (class246_sub4_sub2.anInt6179 >> 1949500780);
										stream.b(f_35_ + f_7_ * -i_38_);
										stream.b(f_8_ * -i_38_ + f_36_);
										stream.b(f_37_ + -i_38_ * f_9_);
										if (var_ha_Sub3.anInt4580 == 0) {
											stream.a(i_31_, i_32_, i_33_, i_34_);
										} else {
											stream.b(i_31_, i_32_, i_33_, i_34_);
										}
										stream.b(0.0F);
										stream.b(0.0F);
										stream.b(f_10_ * i_38_ + f_35_);
										stream.b(i_38_ * f_11_ + f_36_);
										stream.b(f_37_ + f_12_ * i_38_);
										if (var_ha_Sub3.anInt4580 != 0) {
											stream.b(i_31_, i_32_, i_33_, i_34_);
										} else {
											stream.a(i_31_, i_32_, i_33_, i_34_);
										}
										stream.b(1.0F);
										stream.b(0.0F);
										stream.b(f_35_ + f_7_ * i_38_);
										stream.b(f_36_ + i_38_ * f_8_);
										stream.b(f_37_ + i_38_ * f_9_);
										if ((var_ha_Sub3.anInt4580 ^ 0xffffffff) != -1) {
											stream.b(i_31_, i_32_, i_33_, i_34_);
										} else {
											stream.a(i_31_, i_32_, i_33_, i_34_);
										}
										stream.b(1.0F);
										stream.b(1.0F);
										stream.b(f_35_ + i_38_ * f_13_);
										stream.b(i_38_ * f_14_ + f_36_);
										stream.b(f_37_ + i_38_ * f_15_);
										if (var_ha_Sub3.anInt4580 == 0) {
											stream.a(i_31_, i_32_, i_33_, i_34_);
										} else {
											stream.b(i_31_, i_32_, i_33_, i_34_);
										}
										stream.b(0.0F);
										i_1_++;
										stream.b(1.0F);
									}
								}
							}
						}
					} else {
						for (int i_39_ = -1 + i_0_; (i_39_ ^ 0xffffffff) <= -1; i_39_--) {
							final int i_40_ = (anIntArray608[i_39_] > 64 ? 64
									: anIntArray608[i_39_]);
							if (i_40_ > 0) {
								for (int i_41_ = i_40_ + -1; i_41_ >= 0; i_41_--) {
									final Class246_Sub4_Sub2 class246_sub4_sub2 = (aClass246_Sub4_Sub2ArrayArray616[i_39_][i_41_]);
									final int i_42_ = (class246_sub4_sub2.anInt6178);
									final byte i_43_ = (byte) (i_42_ >> -1414407312);
									final byte i_44_ = (byte) (i_42_ >> 1123272776);
									final byte i_45_ = (byte) i_42_;
									final byte i_46_ = (byte) (i_42_ >>> -997863304);
									final float f_47_ = (class246_sub4_sub2.anInt6176) >> -83946644;
									final float f_48_ = (class246_sub4_sub2.anInt6177) >> -867938740;
									final float f_49_ = (class246_sub4_sub2.anInt6175) >> 13807948;
									final int i_50_ = (class246_sub4_sub2.anInt6179 >> -1405584212);
									stream.a(-i_50_ * f_7_ + f_47_);
									stream.a(f_48_ + f_8_ * -i_50_);
									stream.a(f_49_ + -i_50_ * f_9_);
									if ((var_ha_Sub3.anInt4580 ^ 0xffffffff) == -1) {
										stream.a(i_43_, i_44_, i_45_, i_46_);
									} else {
										stream.b(i_43_, i_44_, i_45_, i_46_);
									}
									stream.a(0.0F);
									stream.a(0.0F);
									stream.a(f_47_ + i_50_ * f_10_);
									stream.a(f_48_ + i_50_ * f_11_);
									stream.a(f_12_ * i_50_ + f_49_);
									if ((var_ha_Sub3.anInt4580 ^ 0xffffffff) != -1) {
										stream.b(i_43_, i_44_, i_45_, i_46_);
									} else {
										stream.a(i_43_, i_44_, i_45_, i_46_);
									}
									stream.a(1.0F);
									stream.a(0.0F);
									stream.a(i_50_ * f_7_ + f_47_);
									stream.a(i_50_ * f_8_ + f_48_);
									stream.a(f_49_ + i_50_ * f_9_);
									if ((var_ha_Sub3.anInt4580 ^ 0xffffffff) == -1) {
										stream.a(i_43_, i_44_, i_45_, i_46_);
									} else {
										stream.b(i_43_, i_44_, i_45_, i_46_);
									}
									stream.a(1.0F);
									stream.a(1.0F);
									stream.a(f_47_ + f_13_ * i_50_);
									stream.a(i_50_ * f_14_ + f_48_);
									stream.a(i_50_ * f_15_ + f_49_);
									if ((var_ha_Sub3.anInt4580 ^ 0xffffffff) == -1) {
										stream.a(i_43_, i_44_, i_45_, i_46_);
									} else {
										stream.b(i_43_, i_44_, i_45_, i_46_);
									}
									stream.a(0.0F);
									i_1_++;
									stream.a(1.0F);
								}
								if ((anIntArray608[i_39_] ^ 0xffffffff) < -65) {
									final int i_51_ = -1
											+ (-64 + anIntArray608[i_39_]);
									for (int i_52_ = -1 + anIntArray614[i_51_]; i_52_ >= 0; i_52_--) {
										final Class246_Sub4_Sub2 class246_sub4_sub2 = (aClass246_Sub4_Sub2ArrayArray610[i_51_][i_52_]);
										final int i_53_ = (class246_sub4_sub2.anInt6178);
										final byte i_54_ = (byte) (i_53_ >> -924804944);
										final byte i_55_ = (byte) (i_53_ >> 1479709480);
										final byte i_56_ = (byte) i_53_;
										final byte i_57_ = (byte) (i_53_ >>> 989558680);
										final float f_58_ = (class246_sub4_sub2.anInt6176) >> -1539946420;
										final float f_59_ = (class246_sub4_sub2.anInt6177) >> 1485597036;
										final float f_60_ = (class246_sub4_sub2.anInt6175) >> 750057452;
										final int i_61_ = (class246_sub4_sub2.anInt6179 >> 2108567500);
										stream.a(-i_61_ * f_7_ + f_58_);
										stream.a(f_59_ + f_8_ * -i_61_);
										stream.a(-i_61_ * f_9_ + f_60_);
										if (var_ha_Sub3.anInt4580 != 0) {
											stream.b(i_54_, i_55_, i_56_, i_57_);
										} else {
											stream.a(i_54_, i_55_, i_56_, i_57_);
										}
										stream.a(0.0F);
										stream.a(0.0F);
										stream.a(i_61_ * f_10_ + f_58_);
										stream.a(f_59_ + i_61_ * f_11_);
										stream.a(f_60_ + f_12_ * i_61_);
										if ((var_ha_Sub3.anInt4580 ^ 0xffffffff) == -1) {
											stream.a(i_54_, i_55_, i_56_, i_57_);
										} else {
											stream.b(i_54_, i_55_, i_56_, i_57_);
										}
										stream.a(1.0F);
										stream.a(0.0F);
										stream.a(f_58_ + f_7_ * i_61_);
										stream.a(f_59_ + f_8_ * i_61_);
										stream.a(f_9_ * i_61_ + f_60_);
										if ((var_ha_Sub3.anInt4580 ^ 0xffffffff) != -1) {
											stream.b(i_54_, i_55_, i_56_, i_57_);
										} else {
											stream.a(i_54_, i_55_, i_56_, i_57_);
										}
										stream.a(1.0F);
										stream.a(1.0F);
										stream.a(f_13_ * i_61_ + f_58_);
										stream.a(f_59_ + f_14_ * i_61_);
										stream.a(i_61_ * f_15_ + f_60_);
										if (var_ha_Sub3.anInt4580 != 0) {
											stream.b(i_54_, i_55_, i_56_, i_57_);
										} else {
											stream.a(i_54_, i_55_, i_56_, i_57_);
										}
										stream.a(0.0F);
										stream.a(1.0F);
										i_1_++;
									}
								}
							}
						}
					}
					stream.c();
					if (!anInterface2_Impl1_623.method71(i + 13637)) {
						break;
					}
					var_ha_Sub3.method1971(0, true, anInterface2_Impl1_623);
					var_ha_Sub3.method1971(1, true, anInterface2_Impl1_612);
					var_ha_Sub3.method2042(aClass256_611, (byte) 101);
					var_ha_Sub3.method1973(Class336.aClass232_2822, 4 * i_1_,
							0, i + 26824, anInterface2_Impl2_609, 0, 2 * i_1_);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fea.I("
						+ (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i
						+ ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	final void method812(final ha_Sub3 var_ha_Sub3, final byte i) {
		try {
			if (i != 36) {
				aClass246_Sub4_Sub2ArrayArray616 = null;
			}
			anInterface2_Impl1_623.method74(-20279, 24, 786336);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("fea.H("
							+ (var_ha_Sub3 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	private final void method813(final ha_Sub3 var_ha_Sub3, final int i) {
		try {
			Class98_Sub32_Sub1.aFloat5886 = var_ha_Sub3.aFloat4576;
			if (i != -64) {
				anInterface2_Impl2_609 = null;
			}
			var_ha_Sub3.method1976(i ^ 0x4e);
			var_ha_Sub3.method1986(false, (byte) -119);
			var_ha_Sub3.method1997(0, false);
			var_ha_Sub3.method1960(13951);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("fea.G("
							+ (var_ha_Sub3 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	final void method814(final byte i) {
		try {
			if (i != 4) {
				anIntArray615 = null;
			}
			anInterface2_Impl1_623.method72(false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fea.C(" + i + ')');
		}
	}

	static final boolean method815(final int i, final int i_62_) {
		try {
			if (i_62_ != 0) {
				method817(true);
			}
			if ((i ^ 0xffffffff) != (-i & i ^ 0xffffffff)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fea.A(" + i + ','
					+ i_62_ + ')');
		}
	}

	private final void method816(final int i, final ha_Sub3 var_ha_Sub3) {
		do {
			try {
				var_ha_Sub3.method1997(0, true);
				var_ha_Sub3.method1986(true, (byte) -7);
				if (Class98_Sub32_Sub1.aFloat5886 != var_ha_Sub3.aFloat4576) {
					var_ha_Sub3.xa(Class98_Sub32_Sub1.aFloat5886);
				}
				if (i <= -97) {
					break;
				}
				anIntArray614 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27
						.method667(runtimeexception,
								("fea.J("
										+ i
										+ ','
										+ (var_ha_Sub3 != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method817(final boolean bool) {
		do {
			try {
				Class129.method2229();
				for (int i = 0; i < 4; i++) {
					Class167.aClass243Array1281[i].method2950((byte) -99);
				}
				InputStream_Sub2.method124(52);
				Class98_Sub10_Sub15.method1050((byte) 125);
				Class301.method3542(50);
				System.gc();
				Class265.aHa1974.ya();
				if (bool == false) {
					break;
				}
				aBoolean621 = true;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fea.B(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final void method818(final byte i, final Class242 class242,
			final int i_63_, final ha_Sub3 var_ha_Sub3) {
		try {
			if (var_ha_Sub3.aClass111_Sub3_4543 != null) {
				if (i_63_ < 0) {
					method813(var_ha_Sub3, -64);
				} else {
					method819(-11402, i_63_, var_ha_Sub3);
				}
				final float f = (var_ha_Sub3.aClass111_Sub3_4543.aFloat4708);
				final float f_64_ = (var_ha_Sub3.aClass111_Sub3_4543.aFloat4713);
				final float f_65_ = (var_ha_Sub3.aClass111_Sub3_4543.aFloat4704);
				final float f_66_ = (var_ha_Sub3.aClass111_Sub3_4543.aFloat4703);
				try {
					int i_67_ = 0;
					int i_68_ = 2147483647;
					int i_69_ = 0;
					final Class246_Sub4 class246_sub4 = (class242.aClass358_1850.aClass246_Sub4_3028);
					for (Class246_Sub4 class246_sub4_70_ = (class246_sub4.aClass246_Sub4_5091); class246_sub4_70_ != class246_sub4; class246_sub4_70_ = (class246_sub4_70_.aClass246_Sub4_5091)) {
						final Class246_Sub4_Sub2 class246_sub4_sub2 = (Class246_Sub4_Sub2) class246_sub4_70_;
						final int i_71_ = (int) (f_66_ + ((class246_sub4_sub2.anInt6175 >> 912414860)
								* f_65_ + (((class246_sub4_sub2.anInt6177) >> -493384788)
								* f_64_ + ((class246_sub4_sub2.anInt6176) >> 1402072204)
								* f)));
						if ((i_69_ ^ 0xffffffff) > (i_71_ ^ 0xffffffff)) {
							i_69_ = i_71_;
						}
						if ((i_71_ ^ 0xffffffff) > (i_68_ ^ 0xffffffff)) {
							i_68_ = i_71_;
						}
						anIntArray615[i_67_++] = i_71_;
					}
					int i_72_ = i_69_ - i_68_;
					int i_73_;
					if ((2 + i_72_ ^ 0xffffffff) >= -1601) {
						i_72_ += 2;
						i_73_ = 0;
					} else {
						i_73_ = 1 + (Class48_Sub2_Sub1.method474(i_72_,
								(byte) 31) + -Class373.anInt3477);
						i_72_ = 2 + (i_72_ >> i_73_);
					}
					i_67_ = 0;
					Class246_Sub4 class246_sub4_74_ = class246_sub4.aClass246_Sub4_5091;
					int i_75_ = -2;
					if (i != -108) {
						anInterface2_Impl1_623 = null;
					}
					boolean bool = true;
					boolean bool_76_ = true;
					while (class246_sub4 != class246_sub4_74_) {
						anInt613 = 0;
						for (int i_77_ = 0; (i_77_ ^ 0xffffffff) > (i_72_ ^ 0xffffffff); i_77_++) {
							anIntArray608[i_77_] = 0;
						}
						for (int i_78_ = 0; i_78_ < 64; i_78_++) {
							anIntArray614[i_78_] = 0;
						}
						for (/**/; class246_sub4_74_ != class246_sub4; class246_sub4_74_ = (class246_sub4_74_.aClass246_Sub4_5091)) {
							final Class246_Sub4_Sub2 class246_sub4_sub2 = (Class246_Sub4_Sub2) class246_sub4_74_;
							if (bool_76_) {
								bool_76_ = false;
								bool = class246_sub4_sub2.aBoolean6174;
								i_75_ = class246_sub4_sub2.anInt6180;
							}
							if (i_67_ > 0
									&& (i_75_ != class246_sub4_sub2.anInt6180 || (class246_sub4_sub2.aBoolean6174 == !bool))) {
								bool_76_ = true;
								break;
							}
							final int i_79_ = -i_68_ + anIntArray615[i_67_++] >> i_73_;
							if ((i_79_ ^ 0xffffffff) > -1601) {
								if ((anIntArray608[i_79_] ^ 0xffffffff) > -65) {
									aClass246_Sub4_Sub2ArrayArray616[i_79_][anIntArray608[i_79_]++] = class246_sub4_sub2;
								} else {
									if ((anIntArray608[i_79_] ^ 0xffffffff) == -65) {
										if ((anInt613 ^ 0xffffffff) == -65) {
											continue;
										}
										anIntArray608[i_79_] += 1 + anInt613++;
									}
									aClass246_Sub4_Sub2ArrayArray610[anIntArray608[i_79_] - 64 - 1][anIntArray614[(-1
											+ anIntArray608[i_79_] + -64)]++] = class246_sub4_sub2;
								}
							}
						}
						var_ha_Sub3
								.method2039(
										false,
										i ^ ~0x6b,
										((i_75_ ^ 0xffffffff) > -1 ? -1 : i_75_),
										false);
						if (!bool
								|| (Class98_Sub32_Sub1.aFloat5886 == var_ha_Sub3.aFloat4576)) {
							if (var_ha_Sub3.aFloat4576 != 1.0F) {
								var_ha_Sub3.xa(1.0F);
							}
						} else {
							var_ha_Sub3.xa(Class98_Sub32_Sub1.aFloat5886);
						}
						method811(var_ha_Sub3, (byte) -14, i_72_);
					}
				} catch (final Exception exception) {
					/* empty */
				}
				method816(-103, var_ha_Sub3);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fea.D(" + i + ','
					+ (class242 != null ? "{...}" : "null") + ',' + i_63_ + ','
					+ (var_ha_Sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method819(final int i, final int i_80_,
			final ha_Sub3 var_ha_Sub3) {
		try {
			Class98_Sub32_Sub1.aFloat5886 = var_ha_Sub3.aFloat4576;
			var_ha_Sub3.method2056(i ^ ~0x2cbd, i_80_);
			if (i != -11402) {
				anIntArray614 = null;
			}
			var_ha_Sub3.method1937(4);
			var_ha_Sub3.method1986(false, (byte) -126);
			var_ha_Sub3.method1997(0, false);
			var_ha_Sub3.method1960(13951);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("fea.E(" + i + ',' + i_80_ + ','
							+ (var_ha_Sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	Class81(final ha_Sub3 var_ha_Sub3) {
		anInt613 = 0;
		anIntArray615 = new int[8191];
		aClass246_Sub4_Sub2ArrayArray616 = new Class246_Sub4_Sub2[1600][64];
		do {
			try {
				aClass256_611 = (var_ha_Sub3.method1982((new Class49[] {
						new Class49(new Class169[] { Class169.aClass169_1294,
								Class169.aClass169_1298,
								Class169.aClass169_1301 }),
						new Class49(Class169.aClass169_1297) }), 6));
				anInterface2_Impl1_623 = var_ha_Sub3.method2060(true, 107);
				anInterface2_Impl1_612 = var_ha_Sub3.method2060(false, 119);
				anInterface2_Impl1_612.method74(-20279, 12, 393168);
				anInterface2_Impl2_609 = var_ha_Sub3.method1990((byte) 84,
						false);
				anInterface2_Impl2_609.method76(49146, 20779);
				final Buffer buffer = anInterface2_Impl2_609
						.method78(true, -87);
				if (buffer != null) {
					final Stream stream = var_ha_Sub3.method2043(24022, buffer);
					if (!Stream.a()) {
						for (int i = 0; (i ^ 0xffffffff) > -8192; i++) {
							final int i_81_ = 4 * i;
							stream.d(i_81_);
							stream.d(1 + i_81_);
							stream.d(2 + i_81_);
							stream.d(2 + i_81_);
							stream.d(3 + i_81_);
							stream.d(i_81_);
						}
					} else {
						for (int i = 0; (i ^ 0xffffffff) > -8192; i++) {
							final int i_82_ = 4 * i;
							stream.c(i_82_);
							stream.c(i_82_ - -1);
							stream.c(i_82_ - -2);
							stream.c(2 + i_82_);
							stream.c(3 + i_82_);
							stream.c(i_82_);
						}
					}
					stream.c();
					anInterface2_Impl2_609.method79((byte) -117);
				}
				final Buffer buffer_83_ = anInterface2_Impl1_612.method75(true,
						(byte) 27);
				if (buffer_83_ == null) {
					break;
				}
				final Stream stream = var_ha_Sub3.method2043(24022, buffer_83_);
				if (Stream.a()) {
					for (int i = 0; i < 8191; i++) {
						stream.b(0.0F);
						stream.b(-1.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(-1.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(-1.0F);
						stream.b(0.0F);
						stream.b(0.0F);
						stream.b(-1.0F);
						stream.b(0.0F);
					}
				} else {
					for (int i = 0; (i ^ 0xffffffff) > -8192; i++) {
						stream.a(0.0F);
						stream.a(-1.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(-1.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(-1.0F);
						stream.a(0.0F);
						stream.a(0.0F);
						stream.a(-1.0F);
						stream.a(0.0F);
					}
				}
				stream.c();
				anInterface2_Impl1_612.method71(13623);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fea.<init>("
						+ (var_ha_Sub3 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method820(final int i) {
		try {
			aSArray618 = null;
			aClass100_617 = null;
			aClass98_Sub31_Sub3_619 = null;
			if (i != 1) {
				aBoolean621 = true;
			}
			aClass98_Sub7_620 = null;
			aClass207_622 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fea.F(" + i + ')');
		}
	}
}
