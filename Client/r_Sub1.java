/* r_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class r_Sub1 extends r {
	int anInt6320;
	static Class79 aClass79_6321;
	static long aLong6322 = -1L;
	int anInt6323;
	int anInt6324;
	byte[] aByteArray6325;
	int anInt6326;

	static final boolean method1642(final byte i) {
		try {
			if (Class98_Sub46_Sub19.aClass98_Sub46_Sub8_6066 == null) {
				return false;
			}
			if (Class98_Sub46_Sub19.aClass98_Sub46_Sub8_6066.anInt5990 >= 2000) {
				Class98_Sub46_Sub19.aClass98_Sub46_Sub8_6066.anInt5990 -= 2000;
			}
			if ((Class98_Sub46_Sub19.aClass98_Sub46_Sub8_6066.anInt5990 ^ 0xffffffff) == -1007) {
				return true;
			}
			if (i <= 121) {
				aClass79_6321 = null;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "en.E(" + i + ')');
		}
	}

	final void method1643(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_) {
		try {
			anInt6326 = -i_2_ + i_0_;
			anInt6320 = i_2_;
			if (i_3_ == -1) {
				anInt6323 = -i + i_1_;
				anInt6324 = i;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("en.G(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public static void method1644(final int i) {
		do {
			try {
				aClass79_6321 = null;
				if (i == 9949) {
					break;
				}
				aLong6322 = -46L;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "en.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method1645(final int i) {
		try {
			OutputStream_Sub2.anIntArray42 = null;
			Class145.anIntArray1175 = null;
			Class98_Sub9.aBoolean3851 = false;
			Class284_Sub1.anIntArray5178 = null;
			Class138.anIntArray1083 = null;
			Class294.anIntArray2406 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "en.B(" + i + ')');
		}
	}

	final void method1646(final int i) {
		try {
			int i_5_ = -1;
			final int i_7_ = aByteArray6325.length - 8;
			while (i_5_ < i_7_) {
				aByteArray6325[++i_5_] = (byte) 0;
				aByteArray6325[++i_5_] = (byte) 0;
				aByteArray6325[++i_5_] = (byte) 0;
				aByteArray6325[++i_5_] = (byte) 0;
				aByteArray6325[++i_5_] = (byte) 0;
				aByteArray6325[++i_5_] = (byte) 0;
				aByteArray6325[++i_5_] = (byte) 0;
				aByteArray6325[++i_5_] = (byte) 0;
			}
			while ((aByteArray6325.length + -1 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
				aByteArray6325[++i_5_] = (byte) 0;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "en.D(" + i + ')');
		}
	}

	final boolean method1647(final int i, final byte i_8_, final int i_9_) {
		try {
			if (i_8_ > -114) {
				return true;
			}
			if ((aByteArray6325.length ^ 0xffffffff) > (i * i_9_ ^ 0xffffffff)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("en.F(" + i + ','
					+ i_8_ + ',' + i_9_ + ')'));
		}
	}

	r_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_10_) {
		try {
			aByteArray6325 = new byte[i_10_ * i];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("en.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_10_ + ')'));
		}
	}

	final void method1648(int i, int i_11_, int i_12_, int i_13_, int i_14_,
			final int i_15_, int i_16_) {
		try {
			int i_18_ = 0;
			if ((i_14_ ^ 0xffffffff) != (i ^ 0xffffffff)) {
				i_18_ = (i_11_ + -i_12_ << 308809648) / (-i + i_14_);
			}
			int i_19_ = 0;
			if (i_13_ != i_14_) {
				i_19_ = (-i_11_ + i_16_ << -1744910128) / (-i_14_ + i_13_);
			}
			int i_20_ = 0;
			if ((i_13_ ^ 0xffffffff) != (i ^ 0xffffffff)) {
				i_20_ = (i_12_ + -i_16_ << 478406896) / (-i_13_ + i);
			}
			if ((i ^ 0xffffffff) >= (i_14_ ^ 0xffffffff) && i <= i_13_) {
				if (i_13_ > i_14_) {
					i_16_ = i_12_ <<= 1202729712;
					if (i < 0) {
						i_12_ -= i_18_ * i;
						i_16_ -= i * i_20_;
						i = 0;
					}
					i_11_ <<= 132460240;
					if ((i_14_ ^ 0xffffffff) > -1) {
						i_11_ -= i_19_ * i_14_;
						i_14_ = 0;
					}
					if (((i ^ 0xffffffff) != (i_14_ ^ 0xffffffff) && i_18_ > i_20_)
							|| ((i ^ 0xffffffff) == (i_14_ ^ 0xffffffff) && (i_20_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff))) {
						i_13_ -= i_14_;
						i_14_ -= i;
						i *= anInt6323;
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_12_ >> 2088693072, i,
									i_16_ >> -1493619120);
							i += anInt6323;
							i_16_ += i_20_;
							i_12_ += i_18_;
						}
						while ((--i_13_ ^ 0xffffffff) <= -1) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_11_ >> 1016237104, i, i_16_ >> 43486800);
							i_16_ += i_20_;
							i_11_ += i_19_;
							i += anInt6323;
						}
					} else {
						i_13_ -= i_14_;
						i_14_ -= i;
						i *= anInt6323;
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_16_ >> -70451696, i, i_12_ >> -569292944);
							i_12_ += i_18_;
							i += anInt6323;
							i_16_ += i_20_;
						}
						while ((--i_13_ ^ 0xffffffff) <= -1) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_16_ >> 1090756528, i, i_11_ >> -376719216);
							i_11_ += i_19_;
							i_16_ += i_20_;
							i += anInt6323;
						}
					}
				} else {
					i_11_ = i_12_ <<= -2138871568;
					i_16_ <<= -1328825456;
					if ((i ^ 0xffffffff) > -1) {
						i_11_ -= i_20_ * i;
						i_12_ -= i_18_ * i;
						i = 0;
					}
					if (i_13_ < 0) {
						i_16_ -= i_13_ * i_19_;
						i_13_ = 0;
					}
					if (((i ^ 0xffffffff) == (i_13_ ^ 0xffffffff) || i_20_ >= i_18_)
							&& ((i_13_ ^ 0xffffffff) != (i ^ 0xffffffff) || i_18_ >= i_19_)) {
						i_14_ -= i_13_;
						i_13_ -= i;
						i *= anInt6323;
						while (--i_13_ >= 0) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_11_ >> 1658514640, i, i_12_ >> -493710704);
							i_11_ += i_20_;
							i += anInt6323;
							i_12_ += i_18_;
						}
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_16_ >> 875406544, i, i_12_ >> 968472208);
							i_16_ += i_19_;
							i_12_ += i_18_;
							i += anInt6323;
						}
					} else {
						i_14_ -= i_13_;
						i_13_ -= i;
						i *= anInt6323;
						while ((--i_13_ ^ 0xffffffff) <= -1) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_12_ >> 1630435120, i, i_11_ >> 860712432);
							i_11_ += i_20_;
							i += anInt6323;
							i_12_ += i_18_;
						}
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_12_ >> 215894032, i, i_16_ >> 2015104304);
							i_12_ += i_18_;
							i_16_ += i_19_;
							i += anInt6323;
						}
					}
				}
			} else if (i_13_ < i_14_) {
				if (i >= i_14_) {
					i_12_ = i_16_ <<= 374585904;
					i_11_ <<= 1905005264;
					if ((i_13_ ^ 0xffffffff) > -1) {
						i_12_ -= i_19_ * i_13_;
						i_16_ -= i_20_ * i_13_;
						i_13_ = 0;
					}
					if ((i_14_ ^ 0xffffffff) > -1) {
						i_11_ -= i_14_ * i_18_;
						i_14_ = 0;
					}
					if (i_19_ >= i_20_) {
						i -= i_14_;
						i_14_ -= i_13_;
						i_13_ *= anInt6323;
						while ((--i_14_ ^ 0xffffffff) <= -1) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_12_ >> -2063477360, i_13_,
									i_16_ >> 1547652080);
							i_16_ += i_20_;
							i_12_ += i_19_;
							i_13_ += anInt6323;
						}
						while ((--i ^ 0xffffffff) <= -1) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_11_ >> -880271024, i_13_,
									i_16_ >> 1114847408);
							i_16_ += i_20_;
							i_11_ += i_18_;
							i_13_ += anInt6323;
						}
					} else {
						i -= i_14_;
						i_14_ -= i_13_;
						i_13_ *= anInt6323;
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_16_ >> -1610162128, i_13_,
									i_12_ >> 844481776);
							i_16_ += i_20_;
							i_13_ += anInt6323;
							i_12_ += i_19_;
						}
						while ((--i ^ 0xffffffff) <= -1) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_16_ >> -1338436880, i_13_,
									i_11_ >> -1716563952);
							i_16_ += i_20_;
							i_13_ += anInt6323;
							i_11_ += i_18_;
						}
					}
				} else {
					i_11_ = i_16_ <<= 800608624;
					if ((i_13_ ^ 0xffffffff) > -1) {
						i_16_ -= i_20_ * i_13_;
						i_11_ -= i_19_ * i_13_;
						i_13_ = 0;
					}
					i_12_ <<= 1504634480;
					if (i < 0) {
						i_12_ -= i_18_ * i;
						i = 0;
					}
					if ((i_20_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff)) {
						i_14_ -= i;
						i -= i_13_;
						i_13_ = anInt6323 * i_13_;
						while ((--i ^ 0xffffffff) <= -1) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_16_ >> -1957735056, i_13_,
									i_11_ >> 1141100560);
							i_13_ += anInt6323;
							i_11_ += i_19_;
							i_16_ += i_20_;
						}
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_12_ >> 1458762608, i_13_,
									i_11_ >> -491951696);
							i_11_ += i_19_;
							i_13_ += anInt6323;
							i_12_ += i_18_;
						}
					} else {
						i_14_ -= i;
						i -= i_13_;
						i_13_ = anInt6323 * i_13_;
						while (--i >= 0) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_11_ >> -441923792, i_13_,
									i_16_ >> -1844532944);
							i_13_ += anInt6323;
							i_16_ += i_20_;
							i_11_ += i_19_;
						}
						while (--i_14_ >= 0) {
							Class261.method3210((byte) -104, aByteArray6325, 0,
									i_11_ >> -1096286768, i_13_,
									i_12_ >> -2134156272);
							i_13_ += anInt6323;
							i_11_ += i_19_;
							i_12_ += i_18_;
						}
					}
				}
			} else if (i > i_13_) {
				i_12_ = i_11_ <<= 1231068944;
				i_16_ <<= 1066666256;
				if (i_14_ < 0) {
					i_11_ -= i_19_ * i_14_;
					i_12_ -= i_14_ * i_18_;
					i_14_ = 0;
				}
				if (i_13_ < 0) {
					i_16_ -= i_13_ * i_20_;
					i_13_ = 0;
				}
				if (i_13_ != i_14_ && i_19_ > i_18_ || i_13_ == i_14_
						&& i_20_ < i_18_) {
					i -= i_13_;
					i_13_ -= i_14_;
					i_14_ = anInt6323 * i_14_;
					while ((--i_13_ ^ 0xffffffff) <= -1) {
						Class261.method3210((byte) -104, aByteArray6325, 0,
								i_11_ >> 704910512, i_14_, i_12_ >> 114452112);
						i_12_ += i_18_;
						i_14_ += anInt6323;
						i_11_ += i_19_;
					}
					while ((--i ^ 0xffffffff) <= -1) {
						Class261.method3210((byte) -104, aByteArray6325, 0,
								i_16_ >> 876486832, i_14_, i_12_ >> 928878736);
						i_12_ += i_18_;
						i_16_ += i_20_;
						i_14_ += anInt6323;
					}
				} else {
					i -= i_13_;
					i_13_ -= i_14_;
					i_14_ *= anInt6323;
					while (--i_13_ >= 0) {
						Class261.method3210((byte) -104, aByteArray6325, 0,
								i_12_ >> -1290116336, i_14_,
								i_11_ >> -1781790608);
						i_14_ += anInt6323;
						i_11_ += i_19_;
						i_12_ += i_18_;
					}
					while (--i >= 0) {
						Class261.method3210((byte) -104, aByteArray6325, 0,
								i_12_ >> 192479824, i_14_, i_16_ >> -1290160400);
						i_14_ += anInt6323;
						i_12_ += i_18_;
						i_16_ += i_20_;
					}
				}
			} else {
				i_16_ = i_11_ <<= -1766173488;
				if (i_14_ < 0) {
					i_11_ -= i_14_ * i_19_;
					i_16_ -= i_14_ * i_18_;
					i_14_ = 0;
				}
				i_12_ <<= -1121160880;
				if ((i ^ 0xffffffff) > -1) {
					i_12_ -= i * i_20_;
					i = 0;
				}
				if (i_18_ >= i_19_) {
					i_13_ -= i;
					i -= i_14_;
					i_14_ *= anInt6323;
					while (--i >= 0) {
						Class261.method3210((byte) -104, aByteArray6325, 0,
								i_16_ >> 1933867888, i_14_, i_11_ >> -281985552);
						i_11_ += i_19_;
						i_14_ += anInt6323;
						i_16_ += i_18_;
					}
					while (--i_13_ >= 0) {
						Class261.method3210((byte) -104, aByteArray6325, 0,
								i_12_ >> -1913628528, i_14_,
								i_11_ >> -825231248);
						i_14_ += anInt6323;
						i_12_ += i_20_;
						i_11_ += i_19_;
					}
				} else {
					i_13_ -= i;
					i -= i_14_;
					i_14_ *= anInt6323;
					while (--i >= 0) {
						Class261.method3210((byte) -104, aByteArray6325, 0,
								i_11_ >> 1066305936, i_14_, i_16_ >> -378739344);
						i_11_ += i_19_;
						i_14_ += anInt6323;
						i_16_ += i_18_;
					}
					while ((--i_13_ ^ 0xffffffff) <= -1) {
						Class261.method3210((byte) -104, aByteArray6325, 0,
								i_11_ >> -448370448, i_14_, i_12_ >> 842419952);
						i_11_ += i_19_;
						i_14_ += anInt6323;
						i_12_ += i_20_;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("en.M(" + i + ','
					+ i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ','
					+ i_15_ + ',' + i_16_ + ')'));
		}
	}

	static {
		aClass79_6321 = new Class79(10);
	}
}
