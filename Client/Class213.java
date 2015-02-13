/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class213 {
	static OutgoingOpcode aClass171_1604;
	private byte[] aByteArray1605;
	private int[] anIntArray1606;
	static int[] anIntArray1607 = new int[64];
	private int[] anIntArray1608;
	static IncomingOpcode aClass58_1609;
	static int[] anIntArray1610;
	static Class155[] aClass155Array1611;

	static final void method2778(final boolean bool,
			final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2) {
		do {
			try {
				if (bool != true) {
					anIntArray1610 = null;
				}
				final Class98_Sub42 class98_sub42 = ((Class98_Sub42) (Class98_Sub10_Sub14.aClass377_5612
						.method3990(
								((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6369,
								-1)));
				if (class98_sub42 == null) {
					break;
				}
				if (class98_sub42.aClass98_Sub31_Sub5_4232 != null) {
					Class81.aClass98_Sub31_Sub3_619
							.method1374(class98_sub42.aClass98_Sub31_Sub5_4232);
					class98_sub42.aClass98_Sub31_Sub5_4232 = null;
				}
				class98_sub42.method942(73);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("nq.C("
						+ bool
						+ ','
						+ ((class246_sub3_sub4_sub2_sub2 != null) ? "{...}"
								: "null") + ')'));
			}
			break;
		} while (false);
	}

	static final Class98_Sub46_Sub4 method2779(final byte i, final int i_0_,
			final int i_1_, final Class105 class105) {
		try {
			int i_2_ = class105.anInt3416 | i_1_ << -1405442934;
			Class98_Sub46_Sub4 class98_sub46_sub4 = ((Class98_Sub46_Sub4) Class38.aClass100_357
					.method1694((byte) 113, (long) i_2_ << -1997125744));
			if (class98_sub46_sub4 != null) {
				return class98_sub46_sub4;
			}
			byte[] is = Class52.aClass207_3494.method2733(
					Class52.aClass207_3494.method2763(106, i_2_), 103);
			if (is != null) {
				if (is.length <= 1) {
					return null;
				}
				try {
					class98_sub46_sub4 = Class22.method280(is, 0);
				} catch (final Exception exception) {
					throw new RuntimeException(exception.getMessage() + " S: "
							+ i_2_);
				}
				class98_sub46_sub4.aClass105_5957 = class105;
				Class38.aClass100_357.method1695(26404, class98_sub46_sub4,
						(long) i_2_ << -2064343152);
				return class98_sub46_sub4;
			}
			i_2_ = class105.anInt3416 | i_0_ + 65536 << 1862719850;
			class98_sub46_sub4 = ((Class98_Sub46_Sub4) Class38.aClass100_357
					.method1694((byte) -34, (long) i_2_ << -988809008));
			if (class98_sub46_sub4 != null) {
				return class98_sub46_sub4;
			}
			is = Class52.aClass207_3494.method2733(
					Class52.aClass207_3494.method2763(116, i_2_), 40);
			if (is != null) {
				if (is.length <= 1) {
					return null;
				}
				try {
					class98_sub46_sub4 = Class22.method280(is, 0);
				} catch (final Exception exception) {
					throw new RuntimeException(exception.getMessage() + " S: "
							+ i_2_);
				}
				class98_sub46_sub4.aClass105_5957 = class105;
				Class38.aClass100_357.method1695(26404, class98_sub46_sub4,
						(long) i_2_ << 744524432);
				return class98_sub46_sub4;
			}
			i_2_ = class105.anInt3416 | 0x3fffc00;
			class98_sub46_sub4 = ((Class98_Sub46_Sub4) Class38.aClass100_357
					.method1694((byte) -82, (long) i_2_ << 846811984));
			if (class98_sub46_sub4 != null) {
				return class98_sub46_sub4;
			}
			is = Class52.aClass207_3494.method2733(
					Class52.aClass207_3494.method2763(80, i_2_), -103);
			if (is != null) {
				if (is.length <= 1) {
					return null;
				}
				try {
					class98_sub46_sub4 = Class22.method280(is, 0);
				} catch (final Exception exception) {
					throw new RuntimeException(exception.getMessage() + " S: "
							+ i_2_);
				}
				class98_sub46_sub4.aClass105_5957 = class105;
				Class38.aClass100_357.method1695(26404, class98_sub46_sub4,
						(long) i_2_ << -303464880);
				return class98_sub46_sub4;
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nq.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ','
					+ (class105 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2780(int i, final byte[] is, int i_4_, final int i_5_,
			final byte[] is_6_, final int i_7_) {
		try {
			int i_8_ = 0;
			i += i_4_;
			int i_9_ = i_5_ << -1823989501;
			if (i_7_ != 6350) {
				method2783((byte) -128);
			}
			for (/**/; i > i_4_; i_4_++) {
				final int i_10_ = 0xff & is_6_[i_4_];
				final int i_11_ = anIntArray1608[i_10_];
				final int i_12_ = aByteArray1605[i_10_];
				if ((i_12_ ^ 0xffffffff) == -1) {
					throw new RuntimeException("No codeword for data value "
							+ i_10_);
				}
				int i_13_ = i_9_ >> 747036739;
				int i_14_ = i_9_ & 0x7;
				i_8_ &= -i_14_ >> 588283839;
				final int i_15_ = (i_14_ + i_12_ + -1 >> -78573981) + i_13_;
				i_14_ += 24;
				is[i_13_] = (byte) (i_8_ = Class41.method366(i_8_,
						i_11_ >>> i_14_));
				if (i_15_ > i_13_) {
					i_14_ -= 8;
					i_13_++;
					is[i_13_] = (byte) (i_8_ = i_11_ >>> i_14_);
					if (i_13_ < i_15_) {
						i_14_ -= 8;
						i_13_++;
						is[i_13_] = (byte) (i_8_ = i_11_ >>> i_14_);
						if (i_15_ > i_13_) {
							i_13_++;
							i_14_ -= 8;
							is[i_13_] = (byte) (i_8_ = i_11_ >>> i_14_);
							if ((i_13_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff)) {
								i_14_ -= 8;
								i_13_++;
								is[i_13_] = (byte) (i_8_ = i_11_ << -i_14_);
							}
						}
					}
				}
				i_9_ += i_12_;
			}
			return -i_5_ + (7 + i_9_ >> 1571009731);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception,
							("nq.B(" + i + ','
									+ (is != null ? "{...}" : "null") + ','
									+ i_4_ + ',' + i_5_ + ','
									+ (is_6_ != null ? "{...}" : "null") + ','
									+ i_7_ + ')'));
		}
	}

	static final void method2781(final int i) {
		do {
			try {
				final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
						.method3023(260, (Class98_Sub27.aClass171_4045),
								Class331.aClass117_2811);
				class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
						Class75.anInt581, i + 1571862880);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				if (i == 8) {
					break;
				}
				method2779((byte) 108, 108, -78, null);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "nq.E(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final int method2782(final int i, final byte[] is, final int i_16_,
			int i_17_, final byte[] is_18_, int i_19_) {
		try {
			if (i_17_ == 0) {
				return 0;
			}
			int i_20_ = 0;
			i_17_ += i_19_;
			if (i_16_ > -62) {
				return -32;
			}
			int i_21_ = i;
			for (;;) {
				final byte i_22_ = is_18_[i_21_];
				if ((i_22_ ^ 0xffffffff) > -1) {
					i_20_ = anIntArray1606[i_20_];
				} else {
					i_20_++;
				}
				int i_23_;
				if ((i_23_ = anIntArray1606[i_20_]) < 0) {
					is[i_19_++] = (byte) (i_23_ ^ 0xffffffff);
					if ((i_17_ ^ 0xffffffff) >= (i_19_ ^ 0xffffffff)) {
						break;
					}
					i_20_ = 0;
				}
				if ((0x40 & i_22_) != 0) {
					i_20_ = anIntArray1606[i_20_];
				} else {
					i_20_++;
				}
				if (((i_23_ = anIntArray1606[i_20_]) ^ 0xffffffff) > -1) {
					is[i_19_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_19_ >= i_17_) {
						break;
					}
					i_20_ = 0;
				}
				if ((i_22_ & 0x20 ^ 0xffffffff) == -1) {
					i_20_++;
				} else {
					i_20_ = anIntArray1606[i_20_];
				}
				if ((i_23_ = anIntArray1606[i_20_]) < 0) {
					is[i_19_++] = (byte) (i_23_ ^ 0xffffffff);
					if ((i_17_ ^ 0xffffffff) >= (i_19_ ^ 0xffffffff)) {
						break;
					}
					i_20_ = 0;
				}
				if ((i_22_ & 0x10) == 0) {
					i_20_++;
				} else {
					i_20_ = anIntArray1606[i_20_];
				}
				if (((i_23_ = anIntArray1606[i_20_]) ^ 0xffffffff) > -1) {
					is[i_19_++] = (byte) (i_23_ ^ 0xffffffff);
					if ((i_19_ ^ 0xffffffff) <= (i_17_ ^ 0xffffffff)) {
						break;
					}
					i_20_ = 0;
				}
				if ((0x8 & i_22_ ^ 0xffffffff) != -1) {
					i_20_ = anIntArray1606[i_20_];
				} else {
					i_20_++;
				}
				if (((i_23_ = anIntArray1606[i_20_]) ^ 0xffffffff) > -1) {
					is[i_19_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ <= i_19_) {
						break;
					}
					i_20_ = 0;
				}
				if ((i_22_ & 0x4) != 0) {
					i_20_ = anIntArray1606[i_20_];
				} else {
					i_20_++;
				}
				if ((i_23_ = anIntArray1606[i_20_]) < 0) {
					is[i_19_++] = (byte) (i_23_ ^ 0xffffffff);
					if ((i_17_ ^ 0xffffffff) >= (i_19_ ^ 0xffffffff)) {
						break;
					}
					i_20_ = 0;
				}
				if ((0x2 & i_22_ ^ 0xffffffff) != -1) {
					i_20_ = anIntArray1606[i_20_];
				} else {
					i_20_++;
				}
				if ((i_23_ = anIntArray1606[i_20_]) < 0) {
					is[i_19_++] = (byte) (i_23_ ^ 0xffffffff);
					if ((i_19_ ^ 0xffffffff) <= (i_17_ ^ 0xffffffff)) {
						break;
					}
					i_20_ = 0;
				}
				if ((i_22_ & 0x1) != 0) {
					i_20_ = anIntArray1606[i_20_];
				} else {
					i_20_++;
				}
				if ((i_23_ = anIntArray1606[i_20_]) < 0) {
					is[i_19_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ <= i_19_) {
						break;
					}
					i_20_ = 0;
				}
				i_21_++;
			}
			return -i + (1 + i_21_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nq.D(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_16_ + ','
					+ i_17_ + ',' + (is_18_ != null ? "{...}" : "null") + ','
					+ i_19_ + ')'));
		}
	}

	Class213(final byte[] is) {
		try {
			final int i = is.length;
			anIntArray1608 = new int[i];
			aByteArray1605 = is;
			anIntArray1606 = new int[8];
			final int[] is_24_ = new int[33];
			int i_25_ = 0;
			for (int i_26_ = 0; i_26_ < i; i_26_++) {
				final int i_27_ = is[i_26_];
				if (i_27_ != 0) {
					final int i_28_ = 1 << -i_27_ + 32;
					final int i_29_ = is_24_[i_27_];
					anIntArray1608[i_26_] = i_29_;
					int i_30_;
					if ((i_28_ & i_29_ ^ 0xffffffff) == -1) {
						for (int i_31_ = i_27_ - 1; i_31_ >= 1; i_31_--) {
							final int i_32_ = is_24_[i_31_];
							if (i_32_ != i_29_) {
								break;
							}
							final int i_33_ = 1 << 32 - i_31_;
							if ((i_33_ & i_32_ ^ 0xffffffff) == -1) {
								is_24_[i_31_] = Class41.method366(i_33_, i_32_);
							} else {
								is_24_[i_31_] = is_24_[i_31_ - 1];
								break;
							}
						}
						i_30_ = i_28_ | i_29_;
					} else {
						i_30_ = is_24_[i_27_ - 1];
					}
					is_24_[i_27_] = i_30_;
					for (int i_34_ = i_27_ + 1; (i_34_ ^ 0xffffffff) >= -33; i_34_++) {
						if ((i_29_ ^ 0xffffffff) == (is_24_[i_34_] ^ 0xffffffff)) {
							is_24_[i_34_] = i_30_;
						}
					}
					int i_35_ = 0;
					for (int i_36_ = 0; i_27_ > i_36_; i_36_++) {
						int i_37_ = -2147483648 >>> i_36_;
						if ((i_29_ & i_37_) != 0) {
							if (anIntArray1606[i_35_] == 0) {
								anIntArray1606[i_35_] = i_25_;
							}
							i_35_ = anIntArray1606[i_35_];
						} else {
							i_35_++;
						}
						if (i_35_ >= anIntArray1606.length) {
							final int[] is_38_ = new int[2 * anIntArray1606.length];
							for (int i_39_ = 0; ((anIntArray1606.length ^ 0xffffffff) < (i_39_ ^ 0xffffffff)); i_39_++) {
								is_38_[i_39_] = anIntArray1606[i_39_];
							}
							anIntArray1606 = is_38_;
						}
						i_37_ >>>= 1;
					}
					if (i_35_ >= i_25_) {
						i_25_ = 1 + i_35_;
					}
					anIntArray1606[i_35_] = i_26_ ^ 0xffffffff;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nq.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	public static void method2783(final byte i) {
		try {
			if (i < -120) {
				aClass58_1609 = null;
				aClass171_1604 = null;
				aClass155Array1611 = null;
				anIntArray1610 = null;
				anIntArray1607 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nq.A(" + i + ')');
		}
	}

	static {
		aClass171_1604 = new OutgoingOpcode(10, 16);
		aClass58_1609 = new IncomingOpcode(102, -1);
		anIntArray1610 = new int[4096];
	}
}
