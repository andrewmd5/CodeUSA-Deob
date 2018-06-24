/* r_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class r_Sub2 extends r {
	int anInt6327;
	int anInt6328;
	int anInt6329;
	static OutgoingOpcode aClass171_6330 = new OutgoingOpcode(77, -1);
	int anInt6331;
	byte[] aByteArray6332;
	static int anInt6333;
	static Class38 aClass38_6334 = new Class38();

	public static void method1649(final boolean bool) {
		do {
			try {
				aClass38_6334 = null;
				aClass171_6330 = null;
				if (bool == true) {
					break;
				}
				method1655(89, (byte) -40, 85);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "gl.M(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final int method1650(final String string, final byte i) {
		try {
			if (i <= 58) {
				aClass38_6334 = null;
			}
			return string.length() - -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gl.G("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method1651(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_) {
		try {
			anInt6328 = i_3_ + -i_2_;
			anInt6331 = -i_0_ + i;
			anInt6327 = i_0_;
			if (i_1_ == 0) {
				anInt6329 = i_2_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gl.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final boolean method1652(final int i, final int i_4_, final int i_5_) {
		try {
			if (i_5_ != 22657) {
				method1654(-99);
			}
			if ((aByteArray6332.length ^ 0xffffffff) > (i_4_ * i ^ 0xffffffff)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gl.N(" + i + ','
					+ i_4_ + ',' + i_5_ + ')'));
		}
	}

	final void method1653(int i, int i_6_, int i_7_, int i_8_, int i_9_,
			final byte i_10_, int i_11_) {
		try {
			if (i_10_ == -69) {
				int i_12_ = 0;
				if (i_11_ != i) {
					i_12_ = (-i_6_ + i_7_ << -443628592) / (-i + i_11_);
				}
				int i_13_ = 0;
				if (i_11_ != i_9_) {
					i_13_ = (-i_7_ + i_8_ << 785005552) / (-i_11_ + i_9_);
				}
				int i_14_ = 0;
				if ((i ^ 0xffffffff) != (i_9_ ^ 0xffffffff)) {
					i_14_ = (i_6_ + -i_8_ << -747179600) / (-i_9_ + i);
				}
				if ((i_11_ ^ 0xffffffff) > (i ^ 0xffffffff) || i > i_9_) {
					if ((i_9_ ^ 0xffffffff) <= (i_11_ ^ 0xffffffff)) {
						if ((i ^ 0xffffffff) >= (i_9_ ^ 0xffffffff)) {
							i_8_ = i_7_ <<= -1005720400;
							i_6_ <<= 1054242160;
							if (i_11_ < 0) {
								i_7_ -= i_13_ * i_11_;
								i_8_ -= i_11_ * i_12_;
								i_11_ = 0;
							}
							if ((i ^ 0xffffffff) > -1) {
								i_6_ -= i_14_ * i;
								i = 0;
							}
							if (i_12_ < i_13_) {
								i_9_ -= i;
								i -= i_11_;
								i_11_ *= anInt6328;
								while ((--i ^ 0xffffffff) <= -1) {
									Class246_Sub4_Sub2.method3108((byte) 1,
											i_11_, i_8_ >> 1059858032,
											i_7_ >> 2069463248, 0,
											aByteArray6332);
									i_11_ += anInt6328;
									i_7_ += i_13_;
									i_8_ += i_12_;
								}
								while ((--i_9_ ^ 0xffffffff) <= -1) {
									Class246_Sub4_Sub2.method3108((byte) 1,
											i_11_, i_6_ >> 120550704,
											i_7_ >> 1465970480, 0,
											aByteArray6332);
									i_11_ += anInt6328;
									i_6_ += i_14_;
									i_7_ += i_13_;
								}
							} else {
								i_9_ -= i;
								i -= i_11_;
								i_11_ = anInt6328 * i_11_;
								while ((--i ^ 0xffffffff) <= -1) {
									Class246_Sub4_Sub2.method3108((byte) 1,
											i_11_, i_7_ >> -670753872,
											i_8_ >> -481747760, 0,
											aByteArray6332);
									i_7_ += i_13_;
									i_11_ += anInt6328;
									i_8_ += i_12_;
								}
								while ((--i_9_ ^ 0xffffffff) <= -1) {
									Class246_Sub4_Sub2.method3108((byte) 1,
											i_11_, i_7_ >> -2068840848,
											i_6_ >> 2101115120, 0,
											aByteArray6332);
									i_11_ += anInt6328;
									i_6_ += i_14_;
									i_7_ += i_13_;
								}
							}
						} else {
							i_6_ = i_7_ <<= 82412240;
							i_8_ <<= -2011332048;
							if (i_11_ < 0) {
								i_7_ -= i_11_ * i_13_;
								i_6_ -= i_11_ * i_12_;
								i_11_ = 0;
							}
							if ((i_9_ ^ 0xffffffff) > -1) {
								i_8_ -= i_14_ * i_9_;
								i_9_ = 0;
							}
							if (i_9_ != i_11_
									&& ((i_12_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff))
									|| i_9_ == i_11_
									&& ((i_14_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff))) {
								i -= i_9_;
								i_9_ -= i_11_;
								i_11_ *= anInt6328;
								while (--i_9_ >= 0) {
									Class246_Sub4_Sub2.method3108((byte) 1,
											i_11_, i_6_ >> 1993822576,
											i_7_ >> -51441968, 0,
											aByteArray6332);
									i_7_ += i_13_;
									i_11_ += anInt6328;
									i_6_ += i_12_;
								}
								while ((--i ^ 0xffffffff) <= -1) {
									Class246_Sub4_Sub2.method3108((byte) 1,
											i_11_, i_6_ >> -1614605648,
											i_8_ >> -1609116880, 0,
											aByteArray6332);
									i_6_ += i_12_;
									i_8_ += i_14_;
									i_11_ += anInt6328;
								}
							} else {
								i -= i_9_;
								i_9_ -= i_11_;
								i_11_ *= anInt6328;
								while (--i_9_ >= 0) {
									Class246_Sub4_Sub2.method3108((byte) 1,
											i_11_, i_7_ >> -24007280,
											i_6_ >> 797325680, 0,
											aByteArray6332);
									i_6_ += i_12_;
									i_11_ += anInt6328;
									i_7_ += i_13_;
								}
								while (--i >= 0) {
									Class246_Sub4_Sub2.method3108((byte) 1,
											i_11_, i_8_ >> 1015000624,
											i_6_ >> 1871830288, 0,
											aByteArray6332);
									i_6_ += i_12_;
									i_11_ += anInt6328;
									i_8_ += i_14_;
								}
							}
						}
					} else if ((i ^ 0xffffffff) <= (i_11_ ^ 0xffffffff)) {
						i_6_ = i_8_ <<= 1675497904;
						i_7_ <<= -180783632;
						if (i_9_ < 0) {
							i_6_ -= i_13_ * i_9_;
							i_8_ -= i_9_ * i_14_;
							i_9_ = 0;
						}
						if ((i_11_ ^ 0xffffffff) > -1) {
							i_7_ -= i_11_ * i_12_;
							i_11_ = 0;
						}
						if (i_13_ >= i_14_) {
							i -= i_11_;
							i_11_ -= i_9_;
							i_9_ *= anInt6328;
							while (--i_11_ >= 0) {
								Class246_Sub4_Sub2.method3108((byte) 1, i_9_,
										i_8_ >> 904296848, i_6_ >> 871105648,
										0, aByteArray6332);
								i_9_ += anInt6328;
								i_6_ += i_13_;
								i_8_ += i_14_;
							}
							while (--i >= 0) {
								Class246_Sub4_Sub2.method3108((byte) 1, i_9_,
										i_8_ >> 1374751856, i_7_ >> -493069808,
										0, aByteArray6332);
								i_9_ += anInt6328;
								i_7_ += i_12_;
								i_8_ += i_14_;
							}
						} else {
							i -= i_11_;
							i_11_ -= i_9_;
							i_9_ *= anInt6328;
							while ((--i_11_ ^ 0xffffffff) <= -1) {
								Class246_Sub4_Sub2.method3108((byte) 1, i_9_,
										i_6_ >> 588920496, i_8_ >> 1994599568,
										0, aByteArray6332);
								i_8_ += i_14_;
								i_6_ += i_13_;
								i_9_ += anInt6328;
							}
							while ((--i ^ 0xffffffff) <= -1) {
								Class246_Sub4_Sub2.method3108((byte) 1, i_9_,
										i_7_ >> 454894448, i_8_ >> 317092656,
										0, aByteArray6332);
								i_8_ += i_14_;
								i_7_ += i_12_;
								i_9_ += anInt6328;
							}
						}
					} else {
						i_7_ = i_8_ <<= 1122623632;
						i_6_ <<= -88820752;
						if (i_9_ < 0) {
							i_7_ -= i_13_ * i_9_;
							i_8_ -= i_14_ * i_9_;
							i_9_ = 0;
						}
						if ((i ^ 0xffffffff) > -1) {
							i_6_ -= i * i_12_;
							i = 0;
						}
						if ((i_14_ ^ 0xffffffff) >= (i_13_ ^ 0xffffffff)) {
							i_11_ -= i;
							i -= i_9_;
							i_9_ = anInt6328 * i_9_;
							while ((--i ^ 0xffffffff) <= -1) {
								Class246_Sub4_Sub2.method3108((byte) 1, i_9_,
										i_8_ >> -1048394864,
										i_7_ >> -429300688, 0, aByteArray6332);
								i_9_ += anInt6328;
								i_8_ += i_14_;
								i_7_ += i_13_;
							}
							while (--i_11_ >= 0) {
								Class246_Sub4_Sub2.method3108((byte) 1, i_9_,
										i_6_ >> -2103570032,
										i_7_ >> 1396136368, 0, aByteArray6332);
								i_9_ += anInt6328;
								i_7_ += i_13_;
								i_6_ += i_12_;
							}
						} else {
							i_11_ -= i;
							i -= i_9_;
							i_9_ = anInt6328 * i_9_;
							while ((--i ^ 0xffffffff) <= -1) {
								Class246_Sub4_Sub2.method3108((byte) 1, i_9_,
										i_7_ >> -322633904, i_8_ >> 955734320,
										0, aByteArray6332);
								i_7_ += i_13_;
								i_8_ += i_14_;
								i_9_ += anInt6328;
							}
							while ((--i_11_ ^ 0xffffffff) <= -1) {
								Class246_Sub4_Sub2.method3108((byte) 1, i_9_,
										i_7_ >> 504672272, i_6_ >> 46642864, 0,
										aByteArray6332);
								i_9_ += anInt6328;
								i_7_ += i_13_;
								i_6_ += i_12_;
							}
						}
					}
				} else if (i_9_ <= i_11_) {
					i_7_ = i_6_ <<= 825934864;
					i_8_ <<= 502840432;
					if ((i ^ 0xffffffff) > -1) {
						i_6_ -= i_12_ * i;
						i_7_ -= i * i_14_;
						i = 0;
					}
					if (i_9_ < 0) {
						i_8_ -= i_9_ * i_13_;
						i_9_ = 0;
					}
					if (((i ^ 0xffffffff) != (i_9_ ^ 0xffffffff) && i_14_ < i_12_)
							|| ((i ^ 0xffffffff) == (i_9_ ^ 0xffffffff) && (i_13_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff))) {
						i_11_ -= i_9_;
						i_9_ -= i;
						i = anInt6328 * i;
						while ((--i_9_ ^ 0xffffffff) <= -1) {
							Class246_Sub4_Sub2.method3108((byte) 1, i,
									i_7_ >> -2091813776, i_6_ >> 146157264, 0,
									(aByteArray6332));
							i_7_ += i_14_;
							i_6_ += i_12_;
							i += anInt6328;
						}
						while (--i_11_ >= 0) {
							Class246_Sub4_Sub2.method3108((byte) 1, i,
									i_8_ >> 1605633872, i_6_ >> 118924656, 0,
									(aByteArray6332));
							i += anInt6328;
							i_6_ += i_12_;
							i_8_ += i_13_;
						}
					} else {
						i_11_ -= i_9_;
						i_9_ -= i;
						i = anInt6328 * i;
						while ((--i_9_ ^ 0xffffffff) <= -1) {
							Class246_Sub4_Sub2.method3108((byte) 1, i,
									i_6_ >> 580937424, i_7_ >> -1796960496, 0,
									(aByteArray6332));
							i_7_ += i_14_;
							i += anInt6328;
							i_6_ += i_12_;
						}
						while (--i_11_ >= 0) {
							Class246_Sub4_Sub2.method3108((byte) 1, i,
									i_6_ >> 2001540368, i_8_ >> -1393449104, 0,
									(aByteArray6332));
							i += anInt6328;
							i_6_ += i_12_;
							i_8_ += i_13_;
						}
					}
				} else {
					i_8_ = i_6_ <<= 1281760752;
					if (i < 0) {
						i_6_ -= i_12_ * i;
						i_8_ -= i * i_14_;
						i = 0;
					}
					i_7_ <<= -1708312816;
					if (i_11_ < 0) {
						i_7_ -= i_11_ * i_13_;
						i_11_ = 0;
					}
					if (((i ^ 0xffffffff) == (i_11_ ^ 0xffffffff) || i_14_ >= i_12_)
							&& ((i ^ 0xffffffff) != (i_11_ ^ 0xffffffff) || i_14_ <= i_13_)) {
						i_9_ -= i_11_;
						i_11_ -= i;
						i *= anInt6328;
						while (--i_11_ >= 0) {
							Class246_Sub4_Sub2.method3108((byte) 1, i,
									i_6_ >> 1230470320, i_8_ >> -1985593040, 0,
									(aByteArray6332));
							i += anInt6328;
							i_8_ += i_14_;
							i_6_ += i_12_;
						}
						while ((--i_9_ ^ 0xffffffff) <= -1) {
							Class246_Sub4_Sub2.method3108((byte) 1, i,
									i_7_ >> 52576112, i_8_ >> 411287696, 0,
									(aByteArray6332));
							i += anInt6328;
							i_7_ += i_13_;
							i_8_ += i_14_;
						}
					} else {
						i_9_ -= i_11_;
						i_11_ -= i;
						i = anInt6328 * i;
						while (--i_11_ >= 0) {
							Class246_Sub4_Sub2.method3108((byte) 1, i,
									i_8_ >> 1095249744, i_6_ >> 265258096, 0,
									(aByteArray6332));
							i_6_ += i_12_;
							i += anInt6328;
							i_8_ += i_14_;
						}
						while (--i_9_ >= 0) {
							Class246_Sub4_Sub2.method3108((byte) 1, i,
									i_8_ >> 1255153136, i_7_ >> -1907768848, 0,
									(aByteArray6332));
							i_7_ += i_13_;
							i += anInt6328;
							i_8_ += i_14_;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gl.O(" + i + ','
					+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_
					+ ',' + i_11_ + ')'));
		}
	}

	final void method1654(final int i) {
		try {
			if (i <= 68) {
				anInt6328 = -106;
			}
			int i_15_ = -1;
			final int i_16_ = -8 + aByteArray6332.length;
			while ((i_15_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff)) {
				aByteArray6332[++i_15_] = (byte) 0;
				aByteArray6332[++i_15_] = (byte) 0;
				aByteArray6332[++i_15_] = (byte) 0;
				aByteArray6332[++i_15_] = (byte) 0;
				aByteArray6332[++i_15_] = (byte) 0;
				aByteArray6332[++i_15_] = (byte) 0;
				aByteArray6332[++i_15_] = (byte) 0;
				aByteArray6332[++i_15_] = (byte) 0;
			}
			while (aByteArray6332.length - 1 > i_15_) {
				aByteArray6332[++i_15_] = (byte) 0;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gl.B(" + i + ')');
		}
	}

	static final boolean method1655(final int i, final byte i_17_,
			final int i_18_) {
		try {
			if (i_17_ > -120) {
				return true;
			}
			return (s_Sub1.method3432(i, (byte) 114, i_18_) & Class5.method176(
					24578, i, i_18_));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gl.E(" + i + ','
					+ i_17_ + ',' + i_18_ + ')'));
		}
	}

	static final void method1656(final Class246_Sub3[] class246_sub3s,
			final int i, final int i_19_) {
		if (i < i_19_) {
			final int i_20_ = (i + i_19_) / 2;
			int i_21_ = i;
			final Class246_Sub3 class246_sub3 = class246_sub3s[i_20_];
			class246_sub3s[i_20_] = class246_sub3s[i_19_];
			class246_sub3s[i_19_] = class246_sub3;
			final int i_22_ = class246_sub3.anInt5083;
			for (int i_23_ = i; i_23_ < i_19_; i_23_++) {
				if (class246_sub3s[i_23_].anInt5083 > i_22_ + (i_23_ & 0x1)) {
					final Class246_Sub3 class246_sub3_24_ = class246_sub3s[i_23_];
					class246_sub3s[i_23_] = class246_sub3s[i_21_];
					class246_sub3s[i_21_++] = class246_sub3_24_;
				}
			}
			class246_sub3s[i_19_] = class246_sub3s[i_21_];
			class246_sub3s[i_21_] = class246_sub3;
			method1656(class246_sub3s, i, i_21_ - 1);
			method1656(class246_sub3s, i_21_ + 1, i_19_);
		}
	}

	static final void method1657(int i, final byte[] is, final int i_25_,
			final int i_26_, final int i_27_, int i_28_, final int i_29_,
			final byte[] is_30_, int i_31_) {
		try {
			if (i_26_ != 1230470320) {
				method1657(-3, null, -82, 89, -120, 72, 31, null, -70);
			}
			final int i_32_ = -(i_28_ >> -110374878);
			i_28_ = -(0x3 & i_28_);
			for (int i_33_ = -i_25_; i_33_ < 0; i_33_++) {
				for (int i_34_ = i_32_; i_34_ < 0; i_34_++) {
					is[i_31_++] += is_30_[i++];
					is[i_31_++] += is_30_[i++];
					is[i_31_++] += is_30_[i++];
					is[i_31_++] += is_30_[i++];
				}
				for (int i_35_ = i_28_; (i_35_ ^ 0xffffffff) > -1; i_35_++) {
					is[i_31_++] += is_30_[i++];
				}
				i += i_29_;
				i_31_ += i_27_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gl.F(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_25_ + ','
					+ i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ','
					+ (is_30_ != null ? "{...}" : "null") + ',' + i_31_ + ')'));
		}
	}

	r_Sub2(final ha_Sub3 var_ha_Sub3, final int i, final int i_36_) {
		try {
			aByteArray6332 = new byte[i_36_ * i];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gl.<init>("
					+ (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i + ','
					+ i_36_ + ')'));
		}
	}
}
