/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Point;
import java.util.Random;

abstract class Class43 {
	static int anInt372 = 0;
	private Class197 aClass197_373;
	private ha aHa374;
	static Class196 aClass196_375 = new Class196("LIVE", "", "", 0);
	static char[] aCharArray376 = { ' ', '\u00a0', '_', '-', '\u00e0',
			'\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1',
			'\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea',
			'\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed',
			'\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2',
			'\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3',
			'\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb',
			'\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7',
			'\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
	static int anInt377;

	private final void method396(final int i, final int i_0_, int i_1_,
			int i_2_, final aa var_aa, final int i_3_, final String string,
			final Class332[] class332s, final int[] is) {
		try {
			i_1_ -= aClass197_373.anInt1518;
			int i_4_ = -1;
			int i_5_ = i_3_;
			final int i_6_ = string.length();
			int i_7_ = 0;
			for (/**/; i_6_ > i_7_; i_7_++) {
				char c = (char) (0xff & Class349.method3843((byte) 88,
						string.charAt(i_7_)));
				if (c == 60) {
					i_4_ = i_7_;
				} else {
					if (c == 62 && i_4_ != -1) {
						final String string_8_ = string.substring(i_4_ - -1,
								i_7_);
						i_4_ = -1;
						if (string_8_.equals("lt")) {
							c = '<';
						} else if (string_8_.equals("gt")) {
							c = '>';
						} else if (string_8_.equals("nbsp")) {
							c = '\u00a0';
						} else if (string_8_.equals("shy")) {
							c = '\u00ad';
						} else if (!string_8_.equals("times")) {
							if (!string_8_.equals("euro")) {
								if (!string_8_.equals("copy")) {
									if (string_8_.equals("reg")) {
										c = '\u00ae';
									} else {
										if (string_8_.startsWith("img=")) {
											try {
												final int i_9_ = (PacketSender
														.method3607(
																42,
																string_8_
																		.substring(4)));
												final Class332 class332 = class332s[i_9_];
												final int i_10_ = (is != null ? is[i_9_]
														: class332.method3749());
												if ((Class223.anInt1676 & ~0xffffff) == -16777216) {
													class332.method3748(
															i_2_,
															(-i_10_ + ((aClass197_373.anInt1518) + i_1_)),
															1, 0, 1);
												} else {
													class332.method3748(
															i_2_,
															(-i_10_ + (i_1_ - -(aClass197_373.anInt1518))),
															0,
															((Class223.anInt1676 & ~0xffffff) | 0xffffff),
															1);
												}
												i_2_ += class332s[i_9_]
														.method3737();
												i_5_ = -1;
											} catch (final Exception exception) {
												/* empty */
											}
										} else {
											method400(string_8_, -1);
										}
										continue;
									}
								} else {
									c = '\u00a9';
								}
							} else {
								c = '\u20ac';
							}
						} else {
							c = '\u00d7';
						}
					}
					if ((i_4_ ^ 0xffffffff) == 0) {
						if (i_5_ != -1) {
							i_2_ += aClass197_373.method2671((byte) -50, c,
									i_5_);
						}
						if (c == 32) {
							if ((Class93_Sub1.anInt5486 ^ 0xffffffff) < -1) {
								Class98_Sub47.anInt4276 += Class93_Sub1.anInt5486;
								i_2_ += Class98_Sub47.anInt4276 >> 804071592;
								Class98_Sub47.anInt4276 &= 0xff;
							}
						} else if (var_aa == null) {
							if ((Class64_Sub17.anInt3684 & ~0xffffff) != 0) {
								fa(c, i_2_ - -1, i_1_ - -1,
										Class64_Sub17.anInt3684, true);
							}
							fa(c, i_2_, i_1_, Class223.anInt1676, false);
						} else {
							if ((Class64_Sub17.anInt3684 & ~0xffffff) != 0) {
								method409(c, i_2_ + 1, i_1_ + 1,
										Class64_Sub17.anInt3684, true, var_aa,
										i, i_0_);
							}
							method409(c, i_2_, i_1_, Class223.anInt1676, false,
									var_aa, i, i_0_);
						}
						final int i_11_ = aClass197_373
								.method2673((byte) 81, c);
						if ((Class98_Sub10_Sub5_Sub1.anInt6292 ^ 0xffffffff) != 0) {
							aHa374.method1753(
									i_3_ ^ ~0x5716,
									i_11_,
									Class98_Sub10_Sub5_Sub1.anInt6292,
									i_1_
											+ (int) (0.7 * (aClass197_373.anInt1518)),
									i_2_);
						}
						if ((Class91.anInt724 ^ 0xffffffff) != 0) {
							aHa374.method1753(22294, i_11_, Class91.anInt724,
									(aClass197_373.anInt1518) + i_1_ + 1, i_2_);
						}
						i_5_ = c;
						i_2_ += i_11_;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("da.N(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ','
					+ (var_aa != null ? "{...}" : "null") + ',' + i_3_ + ','
					+ (string != null ? "{...}" : "null") + ','
					+ (class332s != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method397(final int i, final int i_12_, final int i_13_,
			final int i_14_, final String string, final int i_15_) {
		try {
			if (string != null) {
				method399((byte) -47, i_14_, i);
				method396(0, i_12_, i_15_,
						-aClass197_373.method2674(string, 124) + i_13_, null,
						-1, string, null, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("da.T(" + i + ','
					+ i_12_ + ',' + i_13_ + ',' + i_14_ + ','
					+ (string != null ? "{...}" : "null") + ',' + i_15_ + ')'));
		}
	}

	static final void method398(final int i) {
		try {
			Class45.method431(Class215.anInt1614, true, Class265.aHa1974);
			if ((Class15.anInt185 ^ 0xffffffff) != 0) {
				Class350.method3844(Class15.anInt185, -115);
			}
			for (int i_16_ = 0; i_16_ < Class69_Sub2.anInt5335; i_16_++) {
				if (aa_Sub3.aBooleanArray3574[i_16_]) {
					Class98_Sub10_Sub20.aBooleanArray5639[i_16_] = true;
				}
				Class232.aBooleanArray1741[i_16_] = aa_Sub3.aBooleanArray3574[i_16_];
				aa_Sub3.aBooleanArray3574[i_16_] = false;
			}
			Class77_Sub1.anInt3803 = Class215.anInt1614;
			if (i < 33) {
				method398(14);
			}
			if ((Class15.anInt185 ^ 0xffffffff) != 0) {
				Class69_Sub2.anInt5335 = 0;
				Class215.method2791((byte) 112);
			}
			Class265.aHa1974.la();
			Class98_Sub10_Sub22.method1069(256, Class265.aHa1974);
			int i_17_ = Class83.method824((byte) -70);
			if ((i_17_ ^ 0xffffffff) == 0) {
				i_17_ = Class21_Sub2.anInt5387;
			}
			if (i_17_ == -1) {
				i_17_ = OutputStream_Sub2.anInt39;
			}
			method401(i_17_, true);
			Class279.anInt2099 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "da.F(" + i + ')');
		}
	}

	private final void method399(final byte i, int i_18_, final int i_19_) {
		try {
			Class91.anInt724 = -1;
			Class98_Sub10_Sub5_Sub1.anInt6292 = -1;
			Class223.anInt1676 = Class23.anInt221 = i_19_;
			Class98_Sub47.anInt4276 = 0;
			Class93_Sub1.anInt5486 = 0;
			if (i_18_ == -1) {
				i_18_ = 0;
			}
			Class64_Sub17.anInt3684 = Class279.anInt2096 = i_18_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("da.P(" + i + ','
					+ i_18_ + ',' + i_19_ + ')'));
		}
	}

	private final void method400(final String string, final int i) {
		try {
			try {
				if (i != -1) {
					aClass197_373 = null;
				}
				if (string.startsWith("col=")) {
					Class223.anInt1676 = (~0xffffff & Class223.anInt1676 | 0xffffff & (Class98_Sub43_Sub4
							.method1508(i ^ ~0x1, 16, string.substring(4))));
				} else if (string.equals("/col")) {
					Class223.anInt1676 = (Class23.anInt221 & 0xffffff | Class223.anInt1676
							& ~0xffffff);
				}
				if (string.startsWith("argb=")) {
					Class223.anInt1676 = Class98_Sub43_Sub4.method1508(1, 16,
							string.substring(5));
				} else if (!string.equals("/argb")) {
					if (!string.startsWith("str=")) {
						if (string.equals("str")) {
							Class98_Sub10_Sub5_Sub1.anInt6292 = ~0xffffff
									& Class223.anInt1676 | 0x800000;
						} else if (string.equals("/str")) {
							Class98_Sub10_Sub5_Sub1.anInt6292 = -1;
						} else if (string.startsWith("u=")) {
							Class91.anInt724 = (Class223.anInt1676 & ~0xffffff | (Class98_Sub43_Sub4
									.method1508(i + 2, 16, string.substring(2))));
						} else if (!string.equals("u")) {
							if (!string.equals("/u")) {
								if (!string.equalsIgnoreCase("shad=-1")) {
									if (string.startsWith("shad=")) {
										Class64_Sub17.anInt3684 = (Class223.anInt1676
												& ~0xffffff | (Class98_Sub43_Sub4
												.method1508(1, 16,
														string.substring(5))));
									} else if (!string.equals("shad")) {
										if (!string.equals("/shad")) {
											if (string.equals("br")) {
												method399((byte) -35,
														Class279.anInt2096,
														Class23.anInt221);
											}
										} else {
											Class64_Sub17.anInt3684 = Class279.anInt2096;
										}
									} else {
										Class64_Sub17.anInt3684 = Class223.anInt1676
												& ~0xffffff;
									}
								} else {
									Class64_Sub17.anInt3684 = 0;
								}
							} else {
								Class91.anInt724 = -1;
							}
						} else {
							Class91.anInt724 = Class223.anInt1676 & ~0xffffff;
						}
					} else {
						Class98_Sub10_Sub5_Sub1.anInt6292 = (Class223.anInt1676
								& ~0xffffff | (Class98_Sub43_Sub4.method1508(
								i + 2, 16, string.substring(4))));
					}
				} else {
					Class223.anInt1676 = Class23.anInt221;
				}
			} catch (final Exception exception) {
				/* empty */
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("da.V("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method401(int i, final boolean bool) {
		do {
			try {
				if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub29_4050
						.method677((byte) 120) == 0) {
					i = -1;
				}
				if ((i ^ 0xffffffff) != (Class325.anInt2729 ^ 0xffffffff)) {
					do {
						if (i != -1) {
							final Class231 class231 = Class18.aClass11_213
									.method202(i, 25930);
							final Class324 class324 = class231
									.method2876((byte) 126);
							if (class324 == null) {
								i = -1;
								if (!client.aBoolean3553) {
									break;
								}
							}
							Class98_Sub43_Sub2.aClass88_5907.method872(class324
									.method3686(), new Point(
									class231.anInt1738, class231.anInt1736),
									class324.method3681(), (byte) 125, class324
											.method3689(),
									Class42_Sub3.aCanvas5361);
							Class325.anInt2729 = i;
						}
					} while (false);
					if (bool == true) {
						if ((i ^ 0xffffffff) != 0 || Class325.anInt2729 == -1) {
							break;
						}
						Class98_Sub43_Sub2.aClass88_5907.method872(null,
								new Point(), -1, (byte) 95, -1,
								Class42_Sub3.aCanvas5361);
						Class325.anInt2729 = -1;
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "da.W(" + i
						+ ',' + bool + ')');
			}
			break;
		} while (false);
	}

	private final void method402(final int i, final String string,
			final byte i_21_) {
		do {
			try {
				int i_22_ = 0;
				boolean bool = false;
				for (int i_23_ = 0; i_23_ < string.length(); i_23_++) {
					final int i_24_ = string.charAt(i_23_);
					if (i_24_ != 60) {
						if ((i_24_ ^ 0xffffffff) == -63) {
							bool = false;
						} else if (!bool && i_24_ == 32) {
							i_22_++;
						}
					} else {
						bool = true;
					}
				}
				if (i_21_ < 35) {
					aClass197_373 = null;
				}
				if (i_22_ <= 0) {
					break;
				}
				Class93_Sub1.anInt5486 = (-aClass197_373
						.method2674(string, 106) + i << 1130187208)
						/ i_22_;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("da.AA(" + i
						+ ',' + (string != null ? "{...}" : "null") + ','
						+ i_21_ + ')'));
			}
			break;
		} while (false);
	}

	final void method403(final int i, final int i_25_, final int i_26_,
			final int i_27_, final int i_28_, final String string,
			final int i_29_) {
		try {
			if (i_28_ < 3) {
				aClass197_373 = null;
			}
			if (string != null) {
				method399((byte) -81, i, i_29_);
				final int i_30_ = string.length();
				final int[] is = new int[i_30_];
				for (int i_31_ = 0; i_30_ > i_31_; i_31_++) {
					is[i_31_] = (int) (Math.sin(i_27_ / 5.0 + i_31_ / 2.0) * 5.0);
				}
				method410(is,
						i_25_ - aClass197_373.method2674(string, 113) / 2,
						true, null, null, string, null, i_26_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("da.G(" + i + ','
					+ i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ','
					+ (string != null ? "{...}" : "null") + ',' + i_29_ + ')'));
		}
	}

	static final void method404(final int i, final int i_32_) {
		try {
			synchronized (Class211.aClass79_1594) {
				Class211.aClass79_1594.method800((byte) 62, i);
			}
			if (i_32_ != 2974) {
				method398(-17);
			}
			synchronized (PlayerUpdate.aClass79_3411) {
				PlayerUpdate.aClass79_3411.method800((byte) 62, i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "da.BA(" + i + ','
					+ i_32_ + ')');
		}
	}

	final int method405(final int i, int i_33_, final int i_34_,
			final aa var_aa, final int i_35_, final int i_36_, final int i_37_,
			int i_38_, int i_39_, final int i_40_, final byte i_41_,
			final Class332[] class332s, final int i_42_, final int i_43_,
			final String string, final int i_44_, final int[] is) {
		try {
			if (string == null) {
				return 0;
			}
			method399((byte) 108, i_37_, i_42_);
			if ((i_38_ ^ 0xffffffff) == -1) {
				i_38_ = aClass197_373.anInt1518;
			}
			int[] is_45_;
			if (((aClass197_373.anInt1517 - -aClass197_373.anInt1514 + i_38_) ^ 0xffffffff) >= (i_34_ ^ 0xffffffff)
					|| i_38_ - -i_38_ <= i_34_) {
				is_45_ = new int[] { i_36_ };
			} else {
				is_45_ = null;
			}
			int i_46_ = aClass197_373.method2675(string,
					Class98_Sub43_Sub4.aStringArray5932, is_45_, class332s, -1);
			if (i_33_ == -1) {
				i_33_ = i_34_ / i_38_;
				if ((i_33_ ^ 0xffffffff) >= -1) {
					i_33_ = 1;
				}
			}
			if ((i_33_ ^ 0xffffffff) < -1 && i_46_ >= i_33_) {
				i_46_ = i_33_;
				Class98_Sub43_Sub4.aStringArray5932[-1 + i_33_] = aClass197_373
						.method2677((Class98_Sub43_Sub4.aStringArray5932[-1
								+ i_33_]), false, class332s, i_36_);
			}
			if ((i_39_ ^ 0xffffffff) == -4 && (i_46_ ^ 0xffffffff) == -2) {
				i_39_ = 1;
			}
			int i_48_;
			if (i_39_ != 0) {
				if ((i_39_ ^ 0xffffffff) == -2) {
					i_48_ = (aClass197_373.anInt1517 + (i_40_ - -((-((i_46_ + -1) * i_38_) + (-aClass197_373.anInt1514 + (i_34_ + -(aClass197_373.anInt1517)))) / 2)));
				} else if ((i_39_ ^ 0xffffffff) != -3) {
					int i_49_ = ((-aClass197_373.anInt1514
							+ -aClass197_373.anInt1517 + (i_34_ - i_38_
							* (-1 + i_46_))) / (1 + i_46_));
					if ((i_49_ ^ 0xffffffff) > -1) {
						i_49_ = 0;
					}
					i_48_ = i_49_ + aClass197_373.anInt1517 + i_40_;
					i_38_ += i_49_;
				} else {
					i_48_ = (-(i_38_ * (-1 + i_46_)) + i_34_ + (i_40_ + -aClass197_373.anInt1514));
				}
			} else {
				i_48_ = i_40_ + aClass197_373.anInt1517;
			}
			for (int i_50_ = 0; i_46_ > i_50_; i_50_++) {
				if ((i_44_ ^ 0xffffffff) == -1) {
					method396(i_43_, i_35_, i_48_, i, var_aa, -1,
							Class98_Sub43_Sub4.aStringArray5932[i_50_],
							class332s, is);
				} else if (i_44_ != 1) {
					if (i_44_ == 2) {
						method396(
								i_43_,
								i_35_,
								i_48_,
								i
										+ (i_36_ - (aClass197_373
												.method2674(
														(Class98_Sub43_Sub4.aStringArray5932[i_50_]),
														123))), var_aa, -1,
								Class98_Sub43_Sub4.aStringArray5932[i_50_],
								class332s, is);
					} else if ((i_46_ - 1 ^ 0xffffffff) != (i_50_ ^ 0xffffffff)) {
						method402(i_36_,
								Class98_Sub43_Sub4.aStringArray5932[i_50_],
								(byte) 74);
						method396(i_43_, i_35_, i_48_, i, var_aa, -1,
								Class98_Sub43_Sub4.aStringArray5932[i_50_],
								class332s, is);
						Class93_Sub1.anInt5486 = 0;
					} else {
						method396(i_43_, i_35_, i_48_, i, var_aa, -1,
								Class98_Sub43_Sub4.aStringArray5932[i_50_],
								class332s, is);
					}
				} else {
					method396(
							i_43_,
							i_35_,
							i_48_,
							(-aClass197_373
									.method2674(
											(Class98_Sub43_Sub4.aStringArray5932[i_50_]),
											112) + i_36_)
									/ 2 + i, var_aa, -1,
							Class98_Sub43_Sub4.aStringArray5932[i_50_],
							class332s, is);
				}
				i_48_ += i_38_;
			}
			return i_46_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("da.R(" + i + ',' + i_33_ + ',' + i_34_ + ','
							+ (var_aa != null ? "{...}" : "null") + ',' + i_35_
							+ ',' + i_36_ + ',' + i_37_ + ',' + i_38_ + ','
							+ i_39_ + ',' + i_40_ + ',' + i_41_ + ','
							+ (class332s != null ? "{...}" : "null") + ','
							+ i_42_ + ',' + i_43_ + ','
							+ (string != null ? "{...}" : "null") + ',' + i_44_
							+ ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method406(final int i, final int i_51_, final int i_52_,
			final int i_53_, final int i_54_, final int i_55_, final int i_56_,
			final String string) {
		try {
			if (string != null) {
				method399((byte) 123, i_51_, i_53_);
				double d = -(i_54_ / 8.0) + 7.0;
				if (d < 0.0) {
					d = 0.0;
				}
				final int i_57_ = string.length();
				final int[] is = new int[i_57_];
				for (int i_58_ = i; (i_58_ ^ 0xffffffff) > (i_57_ ^ 0xffffffff); i_58_++) {
					is[i_58_] = (int) (d * Math.sin(i_55_ + i_58_ / 1.5));
				}
				method410(is, -(aClass197_373.method2674(string, 118) / 2)
						+ i_56_, true, null, null, string, null, i_52_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("da.I(" + i + ','
					+ i_51_ + ',' + i_52_ + ',' + i_53_ + ',' + i_54_ + ','
					+ i_55_ + ',' + i_56_ + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void fa(char c, int i, int i_59_, int i_60_, boolean bool);

	final int method407(final int i, final int i_61_, final int i_62_,
			final String string, final Random random, final int[] is,
			final int i_63_, final int i_64_, final Class332[] class332s,
			final int i_65_) {
		try {
			if (i_65_ >= -48) {
				method410(null, -54, true, null, null, null, null, -121);
			}
			if (string == null) {
				return 0;
			}
			random.setSeed(i_63_);
			final int i_66_ = (0x1f & random.nextInt()) + 192;
			method399((byte) -94, i & 0xffffff | i_66_ << 2106889272,
					i_66_ << 484897464 | 0xffffff & i_61_);
			final int i_67_ = string.length();
			final int[] is_68_ = new int[i_67_];
			int i_69_ = 0;
			for (int i_70_ = 0; (i_70_ ^ 0xffffffff) > (i_67_ ^ 0xffffffff); i_70_++) {
				is_68_[i_70_] = i_69_;
				if ((random.nextInt() & 0x3) == 0) {
					i_69_++;
				}
			}
			method410(null, i_64_, true, is_68_, class332s, string, is, i_62_);
			return i_69_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("da.H(" + i + ','
					+ i_61_ + ',' + i_62_ + ','
					+ (string != null ? "{...}" : "null") + ','
					+ (random != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ',' + i_63_ + ','
					+ i_64_ + ',' + (class332s != null ? "{...}" : "null")
					+ ',' + i_65_ + ')'));
		}
	}

	final int method408(final int i, final Class332[] class332s,
			final int i_71_, final String string, final int i_72_,
			final int i_73_, final aa var_aa, final int i_74_,
			final byte i_75_, final int i_76_, final int[] is, final int i_77_,
			final int i_78_, final int i_79_, final int i_80_, final int i_81_) {
		try {
			if (i_75_ > -48) {
				fa('b', -40, -26, 60, false);
			}
			return method405(i, 0, i_81_, var_aa, i_78_, i_71_, i_73_, i_77_,
					i_79_, i_80_, (byte) -74, class332s, i_76_, i_72_, string,
					i_74_, is);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("da.Q(" + i + ','
					+ (class332s != null ? "{...}" : "null") + ',' + i_71_
					+ ',' + (string != null ? "{...}" : "null") + ',' + i_72_
					+ ',' + i_73_ + ',' + (var_aa != null ? "{...}" : "null")
					+ ',' + i_74_ + ',' + i_75_ + ',' + i_76_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_77_ + ','
					+ i_78_ + ',' + i_79_ + ',' + i_80_ + ',' + i_81_ + ')'));
		}
	}

	abstract void method409(char c, int i, int i_82_, int i_83_, boolean bool,
			aa var_aa, int i_84_, int i_85_);

	private final void method410(final int[] is, int i, final boolean bool,
			final int[] is_86_, final Class332[] class332s,
			final String string, final int[] is_87_, int i_88_) {
		try {
			i_88_ -= aClass197_373.anInt1518;
			int i_89_ = -1;
			int i_90_ = -1;
			int i_91_ = 0;
			if (bool != true) {
				method403(39, -23, 82, 55, -128, null, 88);
			}
			final int i_92_ = string.length();
			int i_93_ = 0;
			for (/**/; (i_93_ ^ 0xffffffff) > (i_92_ ^ 0xffffffff); i_93_++) {
				char c = (char) (0xff & Class349.method3843((byte) 88,
						string.charAt(i_93_)));
				if ((c ^ 0xffffffff) == -61) {
					i_89_ = i_93_;
				} else {
					if (c == 62 && (i_89_ ^ 0xffffffff) != 0) {
						final String string_94_ = string.substring(1 + i_89_,
								i_93_);
						i_89_ = -1;
						if (!string_94_.equals("lt")) {
							if (!string_94_.equals("gt")) {
								if (string_94_.equals("nbsp")) {
									c = '\u00a0';
								} else if (string_94_.equals("shy")) {
									c = '\u00ad';
								} else if (!string_94_.equals("times")) {
									if (string_94_.equals("euro")) {
										c = '\u20ac';
									} else if (string_94_.equals("copy")) {
										c = '\u00a9';
									} else if (string_94_.equals("reg")) {
										c = '\u00ae';
									} else {
										if (!string_94_.startsWith("img=")) {
											method400(string_94_, -1);
										} else {
											try {
												int i_95_;
												if (is_86_ == null) {
													i_95_ = 0;
												} else {
													i_95_ = is_86_[i_91_];
												}
												int i_96_;
												if (is != null) {
													i_96_ = is[i_91_];
												} else {
													i_96_ = 0;
												}
												i_91_++;
												final int i_97_ = (PacketSender
														.method3607(
																-62,
																string_94_
																		.substring(4)));
												final Class332 class332 = class332s[i_97_];
												final int i_98_ = (is_87_ != null ? is_87_[i_97_]
														: class332.method3749());
												class332.method3748(
														i - -i_95_,
														i_88_
																+ ((aClass197_373.anInt1518)
																		- i_98_ - -i_96_),
														1, 0, 1);
												i += class332s[i_97_]
														.method3737();
												i_90_ = -1;
											} catch (final Exception exception) {
												/* empty */
											}
										}
										continue;
									}
								} else {
									c = '\u00d7';
								}
							} else {
								c = '>';
							}
						} else {
							c = '<';
						}
					}
					if ((i_89_ ^ 0xffffffff) == 0) {
						if ((i_90_ ^ 0xffffffff) != 0) {
							i += aClass197_373.method2671((byte) -50, c, i_90_);
						}
						int i_99_;
						if (is_86_ != null) {
							i_99_ = is_86_[i_91_];
						} else {
							i_99_ = 0;
						}
						int i_100_;
						if (is != null) {
							i_100_ = is[i_91_];
						} else {
							i_100_ = 0;
						}
						i_91_++;
						if (c != 32) {
							if ((Class64_Sub17.anInt3684 & ~0xffffff) != 0) {
								fa(c, 1 + i - -i_99_, i_100_ + i_88_ + 1,
										Class64_Sub17.anInt3684, true);
							}
							fa(c, i_99_ + i, i_100_ + i_88_,
									Class223.anInt1676, false);
						} else if (Class93_Sub1.anInt5486 > 0) {
							Class98_Sub47.anInt4276 += Class93_Sub1.anInt5486;
							i += Class98_Sub47.anInt4276 >> 146551848;
							Class98_Sub47.anInt4276 &= 0xff;
						}
						final int i_101_ = aClass197_373.method2673(
								(byte) -127, c);
						if (Class98_Sub10_Sub5_Sub1.anInt6292 != -1) {
							aHa374.method1753(22294, i_101_,
									Class98_Sub10_Sub5_Sub1.anInt6292,
									(int) (0.7 * (aClass197_373.anInt1518))
											+ i_88_, i);
						}
						if ((Class91.anInt724 ^ 0xffffffff) != 0) {
							aHa374.method1753(22294, i_101_, Class91.anInt724,
									(i_88_ + (aClass197_373.anInt1518)), i);
						}
						i_90_ = c;
						i += i_101_;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("da.J("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + bool
					+ ',' + (is_86_ != null ? "{...}" : "null") + ','
					+ (class332s != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ','
					+ (is_87_ != null ? "{...}" : "null") + ',' + i_88_ + ')'));
		}
	}

	final void method411(final byte i, final int i_102_, final String string,
			final int i_103_, final int i_104_, final int i_105_) {
		try {
			if (string != null) {
				method399((byte) 93, i_104_, i_103_);
				method396(0, 0, i_102_, i_105_, null, -1, string, null, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("da.M(" + i + ','
					+ i_102_ + ',' + (string != null ? "{...}" : "null") + ','
					+ i_103_ + ',' + i_104_ + ',' + i_105_ + ')'));
		}
	}

	final void method412(final int i, final int i_107_, final int i_108_,
			final int i_109_, final int i_110_, final String string,
			final int i_111_) {
		try {
			if (string != null) {
				method399((byte) 121, i, i_108_);
				final int i_112_ = string.length();
				final int[] is = new int[i_112_];
				final int[] is_113_ = new int[i_112_];
				for (int i_114_ = 0; (i_112_ ^ 0xffffffff) < (i_114_ ^ 0xffffffff); i_114_++) {
					is[i_114_] = (int) (5.0 * Math.sin(i_111_ / 5.0 + i_114_
							/ 5.0));
					is_113_[i_114_] = (int) (Math.sin(i_111_ / 5.0 + i_114_
							/ 3.0) * 5.0);
				}
				method410(is_113_,
						i_109_ - aClass197_373.method2674(string, 127) / 2,
						true, is, null, string, null, i_110_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("da.U(" + i + ',' + i_107_
							+ ',' + i_108_ + ',' + i_109_ + ',' + i_110_ + ','
							+ (string != null ? "{...}" : "null") + ','
							+ i_111_ + ')'));
		}
	}

	final void method413(final int i, final int[] is, final int i_116_,
			final String string, final int i_117_, final int i_118_,
			final byte i_119_, final Class332[] class332s) {
		try {
			if (i_119_ == 18 && string != null) {
				method399((byte) 91, i_116_, i_117_);
				method396(0, 0, i, i_118_, null, -1, string, class332s, is);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("da.K(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_116_ + ','
					+ (string != null ? "{...}" : "null") + ',' + i_117_ + ','
					+ i_118_ + ',' + i_119_ + ','
					+ (class332s != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method414(final int i) {
		do {
			try {
				aCharArray376 = null;
				aClass196_375 = null;
				if (i == -2) {
					break;
				}
				aCharArray376 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "da.CA(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method415(final int i, final String string, final int i_120_,
			final int i_121_, final byte i_122_, final int i_123_) {
		try {
			if (string != null) {
				method399((byte) 94, i_121_, i);
				method396(0, 0, i_123_,
						i_120_ - aClass197_373.method2674(string, 127) / 2,
						null, -1, string, null, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("da.L(" + i + ','
					+ (string != null ? "{...}" : "null") + ',' + i_120_ + ','
					+ i_121_ + ',' + i_122_ + ',' + i_123_ + ')'));
		}
	}

	Class43(final ha var_ha, final Class197 class197) {
		try {
			aClass197_373 = class197;
			aHa374 = var_ha;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("da.<init>("
					+ (var_ha != null ? "{...}" : "null") + ','
					+ (class197 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method416(final int i, final int i_125_, final int i_126_,
			final int i_127_, final int i_128_, final Random random,
			final int i_129_, final int[] is, final int i_130_,
			final String string, final int i_131_, final int[] is_132_,
			final int i_133_, final Class332[] class332s, final int i_134_) {
		try {
			if (string == null) {
				return 0;
			}
			random.setSeed(i_126_);
			final int i_135_ = (random.nextInt() & 0x1f) + 192;
			method399((byte) -77, i_127_ & 0xffffff | i_135_ << 1901748184,
					i_135_ << 1707350264 | i_125_ & 0xffffff);
			final int i_136_ = string.length();
			final int[] is_137_ = new int[i_136_];
			int i_138_ = 0;
			for (int i_139_ = 0; (i_139_ ^ 0xffffffff) > (i_136_ ^ 0xffffffff); i_139_++) {
				is_137_[i_139_] = i_138_;
				if ((0x3 & random.nextInt() ^ 0xffffffff) == -1) {
					i_138_++;
				}
			}
			int i_141_ = i;
			int i_142_ = aClass197_373.anInt1517 + i_134_;
			int i_143_ = -1;
			if (i_131_ != 1) {
				if (i_131_ == 2) {
					i_142_ = (i_134_ + i_128_ - aClass197_373.anInt1514);
				}
			} else {
				i_142_ += ((-aClass197_373.anInt1514 + (i_128_ + -aClass197_373.anInt1517)) / 2);
			}
			if ((i_129_ ^ 0xffffffff) == -2) {
				i_143_ = i_138_ + aClass197_373.method2674(string, 118);
				i_141_ += (-i_143_ + i_130_) / 2;
			} else if (i_129_ == 2) {
				i_143_ = aClass197_373.method2674(string, 100) - -i_138_;
				i_141_ += i_130_ + -i_143_;
			}
			method410(null, i_141_, true, is_137_, class332s, string, is_132_,
					i_142_);
			if (is != null) {
				if ((i_143_ ^ 0xffffffff) == 0) {
					i_143_ = i_138_ + aClass197_373.method2674(string, 104);
				}
				is[1] = -aClass197_373.anInt1517 + i_142_;
				is[0] = i_141_;
				is[3] = (aClass197_373.anInt1514 + aClass197_373.anInt1517);
				is[2] = i_143_;
			}
			return i_138_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("da.O(" + i + ',' + i_125_ + ',' + i_126_ + ',' + i_127_
							+ ',' + i_128_ + ','
							+ (random != null ? "{...}" : "null") + ','
							+ i_129_ + ',' + (is != null ? "{...}" : "null")
							+ ',' + i_130_ + ','
							+ (string != null ? "{...}" : "null") + ','
							+ i_131_ + ','
							+ (is_132_ != null ? "{...}" : "null") + ','
							+ i_133_ + ','
							+ (class332s != null ? "{...}" : "null") + ','
							+ i_134_ + ')'));
		}
	}
}
