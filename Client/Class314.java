/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class314 {
	private int anInt2686;
	private int[][] anIntArrayArray2687;
	static Class110 aClass110_2688 = new Class110();
	private int anInt2689;
	static int anInt2690 = -1;
	static int[] anIntArray2691 = new int[3];
	static int anInt2692 = 0;

	static final int method3637(final int i, final int i_0_) {
		try {
			if (i != -14982) {
				aClass110_2688 = null;
			}
			return 0xff & i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tg.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	final int method3638(final int i, int i_1_) {
		try {
			if (anIntArrayArray2687 != null) {
				i_1_ = 6 + (int) ((long) i_1_ * (long) anInt2686 / anInt2689);
			}
			if (i != 6) {
				method3642(false, null);
			}
			return i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tg.E(" + i + ','
					+ i_1_ + ')');
		}
	}

	static final void method3639(final int i, final String string,
			final boolean bool) {
		do {
			try {
				final int i_2_ = Class2.anInt71;
				final int[] is = Class319.anIntArray2705;
				boolean bool_3_ = bool;
				for (int i_4_ = 0; i_2_ > i_4_; i_4_++) {
					final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[is[i_4_]]);
					if (class246_sub3_sub4_sub2_sub2 != null
							&& (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660 != class246_sub3_sub4_sub2_sub2)
							&& class246_sub3_sub4_sub2_sub2.aString6537 != null
							&& class246_sub3_sub4_sub2_sub2.aString6537
									.equalsIgnoreCase(string)) {
						bool_3_ = true;
						if (i == 1) {
							Class98_Sub46_Sub16.anInt6044++;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260,
											Class64_Sub8.aClass171_3661,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShort(is[i_4_], 17624);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeByteS(
									0, -65);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						} else if ((i ^ 0xffffffff) == -5) {
							Class65.anInt498++;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(
											260,
											GameObjectDefinitionLoader.aClass171_2520,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.writeByteS(
									0, -24);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
									is[i_4_], 1571862888);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						} else if ((i ^ 0xffffffff) != -6) {
							if (i != 6) {
								if ((i ^ 0xffffffff) == -8) {
									Class366.anInt3111++;
									final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
											.method3023(260,
													Class277.aClass171_2051,
													Class331.aClass117_2811));
									class98_sub11.aClass98_Sub22_Sub1_3865
											.writeByteS(0, -105);
									class98_sub11.aClass98_Sub22_Sub1_3865
											.writeShort(is[i_4_], 1571862888);
									Class98_Sub10_Sub29.sendPacket(false,
											class98_sub11);
								}
							} else {
								Class98_Sub43.anInt4242++;
								final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
										.method3023(260,
												OutputStream_Sub1.aClass171_34,
												Class331.aClass117_2811));
								class98_sub11.aClass98_Sub22_Sub1_3865
										.method1244(0, (byte) 112);
								class98_sub11.aClass98_Sub22_Sub1_3865
										.writeShort(is[i_4_], 1571862888);
								Class98_Sub10_Sub29.sendPacket(false,
										class98_sub11);
							}
						} else {
							Class98_Sub23.anInt4001++;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, Class121.aClass171_1001,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShortA(is[i_4_], 128);
							class98_sub11.aClass98_Sub22_Sub1_3865.method1231(
									0, (byte) 110);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
						break;
					}
				}
				if (bool_3_) {
					break;
				}
				za_Sub2.method1684(
						Class309.aClass309_2607.method3615(Class374.anInt3159,
								(byte) 25) + string, 4, (byte) 57);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("tg.D(" + i
						+ ',' + (string != null ? "{...}" : "null") + ','
						+ bool + ')'));
			}
			break;
		} while (false);
	}

	public static void method3640(final int i) {
		do {
			try {
				anIntArray2691 = null;
				aClass110_2688 = null;
				if (i == 0) {
					break;
				}
				anInt2690 = -4;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "tg.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final short[] method3641(final int i, short[] is) {
		try {
			if (i != 6) {
				aClass110_2688 = null;
			}
			if (anIntArrayArray2687 != null) {
				final int i_5_ = ((int) ((long) anInt2686 * (long) is.length / anInt2689) - -14);
				final int[] is_6_ = new int[i_5_];
				int i_7_ = 0;
				int i_8_ = 0;
				for (int i_9_ = 0; i_9_ < is.length; i_9_++) {
					final int i_10_ = is[i_9_];
					final int[] is_11_ = anIntArrayArray2687[i_8_];
					for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -15; i_12_++) {
						is_6_[i_7_ - -i_12_] += is_11_[i_12_] * i_10_ >> 1476810210;
					}
					i_8_ += anInt2686;
					final int i_13_ = i_8_ / anInt2689;
					i_7_ += i_13_;
					i_8_ -= i_13_ * anInt2689;
				}
				is = new short[i_5_];
				for (int i_14_ = 0; i_14_ < i_5_; i_14_++) {
					final int i_15_ = 8192 + is_6_[i_14_] >> -2136199730;
					if (i_15_ >= -32768) {
						if (i_15_ <= 32767) {
							is[i_14_] = (short) i_15_;
						} else {
							is[i_14_] = (short) 32767;
						}
					} else {
						is[i_14_] = (short) -32768;
					}
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tg.G(" + i + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final byte[] method3642(final boolean bool, byte[] is) {
		try {
			if (bool != true) {
				method3641(-23, null);
			}
			if (anIntArrayArray2687 != null) {
				final int i = ((int) ((long) is.length * (long) anInt2686 / anInt2689) - -14);
				final int[] is_16_ = new int[i];
				int i_17_ = 0;
				int i_18_ = 0;
				for (int i_19_ = 0; (is.length ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++) {
					final int i_20_ = is[i_19_];
					final int[] is_21_ = anIntArrayArray2687[i_18_];
					for (int i_22_ = 0; i_22_ < 14; i_22_++) {
						is_16_[i_17_ + i_22_] += is_21_[i_22_] * i_20_;
					}
					i_18_ += anInt2686;
					final int i_23_ = i_18_ / anInt2689;
					i_17_ += i_23_;
					i_18_ -= anInt2689 * i_23_;
				}
				is = new byte[i];
				for (int i_24_ = 0; (i ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
					final int i_25_ = 32768 + is_16_[i_24_] >> -107504688;
					if ((i_25_ ^ 0xffffffff) <= 127) {
						if (i_25_ <= 127) {
							is[i_24_] = (byte) i_25_;
						} else {
							is[i_24_] = (byte) 127;
						}
					} else {
						is[i_24_] = (byte) -128;
					}
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tg.C(" + bool
					+ ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final int method3643(int i, final int i_26_) {
		try {
			if (i_26_ != 1) {
				anInt2686 = -77;
			}
			if (anIntArrayArray2687 != null) {
				i = (int) ((long) i * (long) anInt2686 / anInt2689);
			}
			return i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tg.H(" + i + ','
					+ i_26_ + ')');
		}
	}

	static final void method3644(final int i, final int i_27_) {
		r var_r = null;
		for (int i_28_ = i; i_28_ < i_27_; i_28_++) {
			final s var_s = Class98_Sub46_Sub2_Sub2.aSArray6298[i_28_];
			if (var_s != null) {
				for (int i_29_ = 0; i_29_ < Class64_Sub9.anInt3662; i_29_++) {
					for (int i_30_ = 0; i_30_ < Class366.anInt3112; i_30_++) {
						var_r = var_s.fa(i_30_, i_29_, var_r);
						if (var_r != null) {
							final int i_31_ = i_30_ << Class151_Sub8.anInt5015;
							final int i_32_ = i_29_ << Class151_Sub8.anInt5015;
							for (int i_33_ = i_28_ - 1; i_33_ >= 0; i_33_--) {
								final s var_s_34_ = (Class98_Sub46_Sub2_Sub2.aSArray6298[i_33_]);
								if (var_s_34_ != null) {
									final int i_35_ = (var_s.method3420(i_29_,
											-12639, i_30_) - var_s_34_
											.method3420(i_29_, -12639, i_30_));
									final int i_36_ = (var_s.method3420(i_29_,
											-12639, i_30_ + 1) - var_s_34_
											.method3420(i_29_, -12639,
													i_30_ + 1));
									final int i_37_ = (var_s.method3420(
											i_29_ + 1, -12639, i_30_ + 1) - var_s_34_
											.method3420(i_29_ + 1, -12639,
													i_30_ + 1));
									final int i_38_ = (var_s.method3420(
											i_29_ + 1, -12639, i_30_) - var_s_34_
											.method3420(i_29_ + 1, -12639,
													i_30_));
									var_s_34_.CA(var_r, i_31_, (i_35_ + i_36_
											+ i_37_ + i_38_) / 4, i_32_, 0,
											false);
								}
							}
						}
					}
				}
			}
		}
	}

	Class314(int i, int i_39_) {
		try {
			if ((i ^ 0xffffffff) != (i_39_ ^ 0xffffffff)) {
				final int i_40_ = Class126.method2216(i, 111, i_39_);
				i_39_ /= i_40_;
				i /= i_40_;
				anInt2686 = i_39_;
				anIntArrayArray2687 = new int[i][14];
				anInt2689 = i;
				for (int i_41_ = 0; i_41_ < i; i_41_++) {
					final int[] is = anIntArrayArray2687[i_41_];
					final double d = 6.0 + (double) i_41_ / (double) i;
					int i_42_ = (int) Math.floor(d - 7.0 + 1.0);
					if (i_42_ < 0) {
						i_42_ = 0;
					}
					int i_43_ = (int) Math.ceil(7.0 + d);
					if ((i_43_ ^ 0xffffffff) < -15) {
						i_43_ = 14;
					}
					final double d_44_ = (double) i_39_ / (double) i;
					for (/**/; (i_42_ ^ 0xffffffff) > (i_43_ ^ 0xffffffff); i_42_++) {
						final double d_45_ = (-d + i_42_) * 3.141592653589793;
						double d_46_ = d_44_;
						if (d_45_ < -1.0E-4 || d_45_ > 1.0E-4) {
							d_46_ *= Math.sin(d_45_) / d_45_;
						}
						d_46_ *= (Math.cos(0.2243994752564138 * (i_42_ - d)) * 0.46 + 0.54);
						is[i_42_] = (int) Math.floor(0.5 + d_46_ * 65536.0);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tg.<init>(" + i
					+ ',' + i_39_ + ')'));
		}
	}
}
