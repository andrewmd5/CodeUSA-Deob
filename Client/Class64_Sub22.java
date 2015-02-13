/* Class64_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub22 extends Class64 {
	static int anInt3705 = 0;
	static Class294 aClass294_3706 = new Class294();

	static final void method640(final double d, final int i) {
		try {
			if (d != Class148.aDouble1197) {
				for (int i_0_ = 0; i_0_ < 256; i_0_++) {
					final int i_1_ = (int) (Math.pow(i_0_ / 255.0, d) * 255.0);
					Class151_Sub4.anIntArray4985[i_0_] = (i_1_ ^ 0xffffffff) < -256 ? 255
							: i_1_;
				}
				Class148.aDouble1197 = d;
			}
			if (i != 0) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rv.H(" + d + ','
					+ i + ')');
		}
	}

	Class64_Sub22(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	final int method641(final byte i) {
		try {
			if (i <= 119) {
				method644(58);
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rv.E(" + i + ')');
		}
	}

	@Override
	final void method551(final byte i) {
		do {
			try {
				if (i > 118) {
					if (((Class64) this).anInt494 >= 0
							|| ((Class64) this).anInt494 <= 127) {
						break;
					}
					((Class64) this).anInt494 = method552(0);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "rv.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method642(final int i) {
		do {
			try {
				aClass294_3706 = null;
				if (i >= 83) {
					break;
				}
				method642(66);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "rv.I(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method550(final int i, final int i_2_) {
		try {
			((Class64) this).anInt494 = i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rv.B(" + i + ','
					+ i_2_ + ')');
		}
	}

	static final void method643(final int i, final Class213 class213) {
		try {
			if (i != -256) {
				method644(116);
			}
			Class146_Sub3.aClass213_4949 = class213;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rv.D(" + i + ','
					+ (class213 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method644(final int i) {
		try {
			for (int i_4_ = 0; (Class336.anInt2820 ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
				Class98_Sub30.aClass155Array4099[i_4_] = null;
			}
			Class336.anInt2820 = 0;
			for (int i_5_ = 0; (Class364.anInt3103 ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
				for (int i_6_ = 0; (Class366.anInt3112 ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
					for (int i_7_ = 0; i_7_ < Class64_Sub9.anInt3662; i_7_++) {
						final Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_5_][i_7_][i_6_]);
						if (class172 != null) {
							if (class172.aShort1328 > 0) {
								class172.aShort1328 *= -1;
							}
							if (class172.aShort1335 > 0) {
								class172.aShort1335 *= -1;
							}
						}
					}
				}
			}
			int i_8_ = 0;
			if (i >= -36) {
				anInt3705 = 62;
			}
			for (/**/; Class364.anInt3103 > i_8_; i_8_++) {
				for (int i_9_ = 0; (Class366.anInt3112 ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
					for (int i_10_ = 0; Class64_Sub9.anInt3662 > i_10_; i_10_++) {
						final Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_8_][i_10_][i_9_]);
						if (class172 != null) {
							final boolean bool = ((Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i_10_][i_9_]) != null && (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i_10_][i_9_]).aClass172_1330 != null);
							if (class172.aShort1335 < 0) {
								int i_11_ = i_9_;
								int i_12_ = i_9_;
								final int i_13_ = i_8_;
								final int i_14_ = i_8_;
								Class172 class172_15_ = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_8_][i_10_][-1
										+ i_11_]);
								int i_16_;
								for (i_16_ = (Class98_Sub46_Sub2_Sub2.aSArray6298[i_8_]
										.method3420(i_9_, -12639, i_10_)); ((i_11_ ^ 0xffffffff) < -1
										&& class172_15_ != null
										&& (class172_15_.aShort1335 < 0)
										&& ((class172_15_.aShort1335 ^ 0xffffffff) == (class172.aShort1335 ^ 0xffffffff))
										&& ((class172_15_.aShort1329 ^ 0xffffffff) == (class172.aShort1329 ^ 0xffffffff)) && ((i_16_ ^ 0xffffffff) == ((Class98_Sub46_Sub2_Sub2.aSArray6298[i_8_]
										.method3420(i_11_ + -1, -12639, i_10_)) ^ 0xffffffff))); class172_15_ = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_8_][i_10_][-1
										+ i_11_])) {
									if ((i_11_ - 1 ^ 0xffffffff) < -1
											&& i_16_ != (Class98_Sub46_Sub2_Sub2.aSArray6298[i_8_]
													.method3420(i_11_ - 2,
															-12639, i_10_))) {
										break;
									}
									i_11_--;
								}
								for (class172_15_ = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_8_][i_10_][i_12_
										- -1]); (((i_12_ ^ 0xffffffff) > (Class64_Sub9.anInt3662 ^ 0xffffffff))
										&& class172_15_ != null
										&& (class172_15_.aShort1335 ^ 0xffffffff) > -1
										&& (class172.aShort1335 == (class172_15_.aShort1335))
										&& ((class172.aShort1329 ^ 0xffffffff) == ((class172_15_.aShort1329) ^ 0xffffffff)) && ((Class98_Sub46_Sub2_Sub2.aSArray6298[i_8_]
											.method3420(i_12_ + 1, -12639,
													i_10_)) == i_16_)); class172_15_ = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_8_][i_10_][1 + i_12_])) {
									if (((1 + i_12_ ^ 0xffffffff) > (Class64_Sub9.anInt3662 ^ 0xffffffff))
											&& ((i_16_ ^ 0xffffffff) != ((Class98_Sub46_Sub2_Sub2.aSArray6298[i_8_]
													.method3420(i_12_ + 2,
															-12639, i_10_)) ^ 0xffffffff))) {
										break;
									}
									i_12_++;
								}
								final int i_17_ = -i_13_ + i_14_ + 1;
								final int i_18_ = Class98_Sub46_Sub2_Sub2.aSArray6298[!bool ? i_13_
										: 1 + i_13_].method3420(i_11_, -12639,
										i_10_);
								final int i_19_ = (class172.aShort1335 * i_17_ + i_18_);
								final int i_20_ = (Class98_Sub46_Sub2_Sub2.aSArray6298[bool ? i_13_
										- -1
										: i_13_].method3420(1 + i_12_, -12639,
										i_10_));
								final int i_21_ = i_20_
										+ (class172.aShort1335 * i_17_);
								final int i_22_ = i_10_ << Class151_Sub8.anInt5015;
								final int i_23_ = i_11_ << Class151_Sub8.anInt5015;
								final int i_24_ = (r_Sub2.anInt6333 + (i_12_ << Class151_Sub8.anInt5015));
								Class98_Sub30.aClass155Array4099[Class336.anInt2820++] = new Class155(
										1, i_14_,
										(i_22_ - -(class172.aShort1329)),
										(class172.aShort1329) + i_22_,
										(class172.aShort1329) + i_22_,
										(class172.aShort1329) + i_22_, i_18_,
										i_20_, i_21_, i_19_, i_23_, i_24_,
										i_24_, i_23_);
								for (int i_25_ = i_13_; ((i_25_ ^ 0xffffffff) >= (i_14_ ^ 0xffffffff)); i_25_++) {
									for (int i_26_ = i_11_; ((i_26_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff)); i_26_++) {
										(Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_25_][i_10_][i_26_]).aShort1335 *= -1;
									}
								}
							}
							if ((class172.aShort1328 ^ 0xffffffff) > -1) {
								int i_27_ = i_10_;
								int i_28_ = i_10_;
								final int i_29_ = i_8_;
								final int i_30_ = i_8_;
								Class172 class172_31_ = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_8_][-1
										+ i_27_][i_9_]);
								int i_32_;
								for (i_32_ = (Class98_Sub46_Sub2_Sub2.aSArray6298[i_8_]
										.method3420(i_9_, -12639, i_10_)); ((i_27_ ^ 0xffffffff) < -1
										&& class172_31_ != null
										&& (class172_31_.aShort1328 ^ 0xffffffff) > -1
										&& (class172.aShort1328 == (class172_31_.aShort1328))
										&& ((class172.aShort1323 ^ 0xffffffff) == ((class172_31_.aShort1323) ^ 0xffffffff)) && (i_32_ == (Class98_Sub46_Sub2_Sub2.aSArray6298[i_8_]
											.method3420(i_9_, -12639, -1
													+ i_27_)))); class172_31_ = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_8_][i_27_ - 1][i_9_])) {
									if (-1 + i_27_ > 0
											&& (((Class98_Sub46_Sub2_Sub2.aSArray6298[i_8_]
													.method3420(i_9_, -12639,
															i_27_ - 2)) ^ 0xffffffff) != (i_32_ ^ 0xffffffff))) {
										break;
									}
									i_27_--;
								}
								for (class172_31_ = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_8_][i_28_ + 1][i_9_]); (((i_28_ ^ 0xffffffff) > (Class366.anInt3112 ^ 0xffffffff))
										&& class172_31_ != null
										&& (class172_31_.aShort1328 ^ 0xffffffff) > -1
										&& ((class172.aShort1328 ^ 0xffffffff) == ((class172_31_.aShort1328) ^ 0xffffffff))
										&& (class172_31_.aShort1323 == class172.aShort1323) && (Class98_Sub46_Sub2_Sub2.aSArray6298[i_8_]
											.method3420(i_9_, -12639, i_28_ + 1)) == i_32_); class172_31_ = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_8_][i_28_ + 1][i_9_])) {
									if (((i_28_ + 1 ^ 0xffffffff) > (Class366.anInt3112 ^ 0xffffffff))
											&& ((i_32_ ^ 0xffffffff) != ((Class98_Sub46_Sub2_Sub2.aSArray6298[i_8_]
													.method3420(i_9_, -12639,
															i_28_ - -2)) ^ 0xffffffff))) {
										break;
									}
									i_28_++;
								}
								final int i_33_ = -i_29_ + (i_30_ - -1);
								final int i_34_ = Class98_Sub46_Sub2_Sub2.aSArray6298[bool ? 1 + i_29_
										: i_29_]
										.method3420(i_9_, -12639, i_27_);
								final int i_35_ = i_34_
										- -(i_33_ * (class172.aShort1328));
								final int i_36_ = Class98_Sub46_Sub2_Sub2.aSArray6298[bool ? 1 + i_29_
										: i_29_].method3420(i_9_, -12639,
										i_28_ + 1);
								final int i_37_ = (class172.aShort1328 * i_33_ + i_36_);
								final int i_38_ = i_27_ << Class151_Sub8.anInt5015;
								final int i_39_ = (r_Sub2.anInt6333 + (i_28_ << Class151_Sub8.anInt5015));
								final int i_40_ = i_9_ << Class151_Sub8.anInt5015;
								Class98_Sub30.aClass155Array4099[Class336.anInt2820++] = (new Class155(
										2, i_30_, i_38_, i_39_, i_39_, i_38_,
										i_34_, i_36_, i_37_, i_35_,
										(i_40_ - -class172.aShort1323),
										(class172.aShort1323 + i_40_),
										(i_40_ + class172.aShort1323),
										(i_40_ + class172.aShort1323)));
								for (int i_41_ = i_29_; ((i_30_ ^ 0xffffffff) <= (i_41_ ^ 0xffffffff)); i_41_++) {
									for (int i_42_ = i_27_; ((i_42_ ^ 0xffffffff) >= (i_28_ ^ 0xffffffff)); i_42_++) {
										(Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_41_][i_42_][i_9_]).aShort1328 *= -1;
									}
								}
							}
						}
					}
				}
			}
			OutputStream_Sub1.aBoolean35 = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rv.G(" + i + ')');
		}
	}

	Class64_Sub22(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	static final void method645(final byte i) {
		do {
			try {
				OutputStream_Sub1.aBoolean35 = false;
				Class59.anInt464 = 0;
				Class98_Sub46_Sub13_Sub2.anIntArrayArrayArray6311 = (new int[Class364.anInt3103][1 + Class366.anInt3112][Class64_Sub9.anInt3662
						- -1]);
				Class21_Sub3.anInt5389 = 0;
				Class98_Sub32_Sub1.aClass155Array5889 = new Class155[1000];
				Class98_Sub30.aClass155Array4099 = new Class155[2000];
				Class213.aClass155Array1611 = new Class155[500];
				Class119_Sub1.anInt4716 = r_Sub2.anInt6333;
				Class336.anInt2820 = 0;
				ha.anInt936 = 0;
				Class370.anInt3139 = r_Sub2.anInt6333;
				Class258.aClass155Array1951 = new Class155[500];
				do {
					if (Class98_Sub10_Sub30.aHa5709 instanceof oa) {
						Class98_Sub17.aBoolean3942 = false;
						if (!client.aBoolean3553) {
							break;
						}
					}
					Class98_Sub17.aBoolean3942 = true;
				} while (false);
				if (i == 102) {
					break;
				}
				anInt3705 = 61;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "rv.M(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				return -62;
			}
			return 127;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rv.A(" + i + ')');
		}
	}

	@Override
	final int method556(final int i, final int i_43_) {
		try {
			if (i_43_ != 29053) {
				return 3;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rv.F(" + i + ','
					+ i_43_ + ')');
		}
	}
}
