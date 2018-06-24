/* Class333 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class333 implements Interface13 {
	static int anInt3385;
	static int anInt3386 = 0;
	int anInt3387;
	int anInt3388;
	float[] aFloatArray3389;
	static int anInt3390 = 0;

	static final void method3761(final int i, final int[] is, int i_0_,
			int i_1_, final byte i_2_) {
		try {
			i_0_--;
			final int i_4_ = --i_1_ + -7;
			while (i_4_ > i_0_) {
				is[++i_0_] = i;
				is[++i_0_] = i;
				is[++i_0_] = i;
				is[++i_0_] = i;
				is[++i_0_] = i;
				is[++i_0_] = i;
				is[++i_0_] = i;
				is[++i_0_] = i;
			}
			while (i_0_ < i_1_) {
				is[++i_0_] = i;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("uh.B(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_
					+ ',' + i_2_ + ')'));
		}
	}

	static final void method3762(final byte i, final boolean bool,
			final Entity class246_sub3_sub4_sub2) {
		do {
			try {
				final Class294 class294 = class246_sub3_sub4_sub2.method3039(1);
				if ((class246_sub3_sub4_sub2.anInt6434) == 0) {
					Class64_Sub23.anInt3708 = -1;
					Class366.anInt3121 = 0;
					class246_sub3_sub4_sub2.anInt6433 = 0;
				} else {
					if ((class246_sub3_sub4_sub2.anInt6413) != -1
							&& (class246_sub3_sub4_sub2.anInt6400) == 0) {
						final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
								.method2623(class246_sub3_sub4_sub2.anInt6413,
										16383));
						if ((class246_sub3_sub4_sub2.anInt6436 ^ 0xffffffff) < -1
								&& class97.anInt821 == 0) {
							class246_sub3_sub4_sub2.anInt6433++;
							Class64_Sub23.anInt3708 = -1;
							Class366.anInt3121 = 0;
							break;
						}
						if ((class246_sub3_sub4_sub2.anInt6436 ^ 0xffffffff) >= -1
								&& ((class97.anInt816 ^ 0xffffffff) == -1)) {
							Class366.anInt3121 = 0;
							class246_sub3_sub4_sub2.anInt6433++;
							Class64_Sub23.anInt3708 = -1;
							break;
						}
					}
					if ((class246_sub3_sub4_sub2.anInt6379) != -1
							&& (class246_sub3_sub4_sub2.anInt6391) <= Class215.anInt1614) {
						final Class107 class107 = (Class196.aClass304_1509
								.method3564(2,
										class246_sub3_sub4_sub2.anInt6379));
						if (class107.aBoolean909 && class107.anInt910 != -1) {
							final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
									.method2623(class107.anInt910, 16383));
							if (class246_sub3_sub4_sub2.anInt6436 > 0
									&& class97.anInt821 == 0) {
								class246_sub3_sub4_sub2.anInt6433++;
								Class366.anInt3121 = 0;
								Class64_Sub23.anInt3708 = -1;
								break;
							}
							if (class246_sub3_sub4_sub2.anInt6436 <= 0
									&& ((class97.anInt816 ^ 0xffffffff) == -1)) {
								class246_sub3_sub4_sub2.anInt6433++;
								Class64_Sub23.anInt3708 = -1;
								Class366.anInt3121 = 0;
								break;
							}
						}
					}
					if (((class246_sub3_sub4_sub2.anInt6379) ^ 0xffffffff) != 0
							&& Class215.anInt1614 >= (class246_sub3_sub4_sub2.anInt6391)) {
						final Class107 class107 = (Class196.aClass304_1509
								.method3564(2,
										class246_sub3_sub4_sub2.anInt6379));
						if (class107.aBoolean909 && class107.anInt910 != -1) {
							final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
									.method2623(class107.anInt910, 16383));
							if (class246_sub3_sub4_sub2.anInt6436 > 0
									&& class97.anInt821 == 0) {
								Class366.anInt3121 = 0;
								class246_sub3_sub4_sub2.anInt6433++;
								Class64_Sub23.anInt3708 = -1;
								break;
							}
							if ((class246_sub3_sub4_sub2.anInt6436 ^ 0xffffffff) >= -1
									&& ((class97.anInt816 ^ 0xffffffff) == -1)) {
								class246_sub3_sub4_sub2.anInt6433++;
								Class64_Sub23.anInt3708 = -1;
								Class366.anInt3121 = 0;
								break;
							}
						}
					}
					final int i_6_ = ((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084;
					final int i_7_ = ((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079;
					final int i_8_ = (512 * (class246_sub3_sub4_sub2.anIntArray6437[-1
							+ class246_sub3_sub4_sub2.anInt6434]) + 256 * class246_sub3_sub4_sub2
							.method3034(0));
					final int i_9_ = ((class246_sub3_sub4_sub2.anIntArray6438[-1
							+ class246_sub3_sub4_sub2.anInt6434]) * 512 - -(class246_sub3_sub4_sub2
							.method3034(0) * 256));
					if (i_6_ < i_8_) {
						if (i_7_ >= i_9_) {
							if ((i_7_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff)) {
								class246_sub3_sub4_sub2
										.method3042(14336, -8193);
							} else {
								class246_sub3_sub4_sub2
										.method3042(12288, -8193);
							}
						} else {
							class246_sub3_sub4_sub2.method3042(10240, -8193);
						}
					} else if (i_8_ < i_6_) {
						if (i_7_ < i_9_) {
							class246_sub3_sub4_sub2.method3042(6144, -8193);
						} else if ((i_7_ ^ 0xffffffff) >= (i_9_ ^ 0xffffffff)) {
							class246_sub3_sub4_sub2.method3042(4096, -8193);
						} else {
							class246_sub3_sub4_sub2.method3042(2048, -8193);
						}
					} else if (i_9_ <= i_7_) {
						if ((i_7_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff)) {
							class246_sub3_sub4_sub2.method3042(0, -8193);
						}
					} else {
						class246_sub3_sub4_sub2.method3042(8192, -8193);
					}
					final byte i_10_ = (class246_sub3_sub4_sub2.aByteArray6443[class246_sub3_sub4_sub2.anInt6434
							+ -1]);
					if (!bool
							&& (i_8_ + -i_6_ > 1024
									|| (i_8_ + -i_6_ ^ 0xffffffff) > 1023
									|| (-i_7_ + i_9_ ^ 0xffffffff) < -1025 || -i_7_
									+ i_9_ < -1024)) {
						((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 = i_8_;
						((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 = i_9_;
						class246_sub3_sub4_sub2.method3047(
								class246_sub3_sub4_sub2.anInt6415, false, 75);
						Class64_Sub23.anInt3708 = -1;
						if (class246_sub3_sub4_sub2.anInt6436 > 0) {
							class246_sub3_sub4_sub2.anInt6436--;
						}
						class246_sub3_sub4_sub2.anInt6434--;
						Class366.anInt3121 = 0;
					} else {
						int i_11_ = 16;
						boolean bool_12_ = true;
						if (class246_sub3_sub4_sub2 instanceof Class246_Sub3_Sub4_Sub2_Sub1) {
							bool_12_ = (((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2).aClass141_6504).aBoolean1126;
						}
						if (!bool_12_) {
							if (!bool && class246_sub3_sub4_sub2.anInt6434 > 1) {
								i_11_ = 24;
							}
							if (!bool
									&& (class246_sub3_sub4_sub2.anInt6434 ^ 0xffffffff) < -3) {
								i_11_ = 32;
							}
						} else {
							final int i_13_ = (-(class246_sub3_sub4_sub2.aClass325_6399).anInt2730 + class246_sub3_sub4_sub2.anInt6415);
							if ((i_13_ ^ 0xffffffff) != -1
									&& (class246_sub3_sub4_sub2.anInt6364 ^ 0xffffffff) == 0
									&& (class246_sub3_sub4_sub2.anInt6414 ^ 0xffffffff) != -1) {
								i_11_ = 8;
							}
							if (!bool
									&& (class246_sub3_sub4_sub2.anInt6434 ^ 0xffffffff) < -3) {
								i_11_ = 24;
							}
							if (!bool
									&& (class246_sub3_sub4_sub2.anInt6434 ^ 0xffffffff) < -4) {
								i_11_ = 32;
							}
						}
						if ((class246_sub3_sub4_sub2.anInt6433 ^ 0xffffffff) < -1
								&& class246_sub3_sub4_sub2.anInt6434 > 1) {
							i_11_ = 32;
							class246_sub3_sub4_sub2.anInt6433--;
						}
						if ((i_10_ ^ 0xffffffff) == -3) {
							i_11_ <<= 1;
						} else if (i_10_ == 0) {
							i_11_ >>= 1;
						}
						if (class294.anInt2401 != -1) {
							i_11_ <<= 9;
							if ((class246_sub3_sub4_sub2.anInt6434 ^ 0xffffffff) == -2) {
								final int i_14_ = (class246_sub3_sub4_sub2.anInt6435 * class246_sub3_sub4_sub2.anInt6435);
								final int i_15_ = (((((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 ^ 0xffffffff) >= (i_8_ ^ 0xffffffff) ? i_8_
										+ -(((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084)
										: (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 - i_8_)) << -1268948087);
								final int i_16_ = ((i_9_ < (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079) ? (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 + -i_9_)
										: i_9_
												+ -(((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079)) << -1396718167);
								final int i_17_ = ((i_15_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff) ? i_15_
										: i_16_);
								final int i_18_ = (class294.anInt2401 * 2 * i_17_);
								if (i_18_ >= i_14_) {
									if ((i_14_ / 2 ^ 0xffffffff) < (i_17_ ^ 0xffffffff)) {
										class246_sub3_sub4_sub2.anInt6435 -= class294.anInt2401;
										if (((class246_sub3_sub4_sub2.anInt6435) ^ 0xffffffff) > -1) {
											class246_sub3_sub4_sub2.anInt6435 = 0;
										}
									} else if (((class246_sub3_sub4_sub2.anInt6435) ^ 0xffffffff) > (i_11_ ^ 0xffffffff)) {
										class246_sub3_sub4_sub2.anInt6435 += class294.anInt2401;
										if ((i_11_ ^ 0xffffffff) > ((class246_sub3_sub4_sub2.anInt6435) ^ 0xffffffff)) {
											class246_sub3_sub4_sub2.anInt6435 = i_11_;
										}
									}
								} else {
									class246_sub3_sub4_sub2.anInt6435 /= 2;
								}
							} else if (class246_sub3_sub4_sub2.anInt6435 >= i_11_) {
								if (class246_sub3_sub4_sub2.anInt6435 > 0) {
									class246_sub3_sub4_sub2.anInt6435 -= class294.anInt2401;
									if (class246_sub3_sub4_sub2.anInt6435 < 0) {
										class246_sub3_sub4_sub2.anInt6435 = 0;
									}
								}
							} else {
								class246_sub3_sub4_sub2.anInt6435 += class294.anInt2401;
								if ((class246_sub3_sub4_sub2.anInt6435 ^ 0xffffffff) < (i_11_ ^ 0xffffffff)) {
									class246_sub3_sub4_sub2.anInt6435 = i_11_;
								}
							}
							i_11_ = (class246_sub3_sub4_sub2.anInt6435 >> -1583796215);
							if ((i_11_ ^ 0xffffffff) > -2) {
								i_11_ = 1;
							}
						}
						Class366.anInt3121 = 0;
						if (i_8_ != i_6_ || i_9_ != i_7_) {
							if ((i_8_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff)) {
								((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 += i_11_;
								Class366.anInt3121 |= 0x4;
								if ((i_8_ ^ 0xffffffff) > (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 ^ 0xffffffff)) {
									((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 = i_8_;
								}
							} else if ((i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
								Class366.anInt3121 |= 0x8;
								((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 -= i_11_;
								if ((((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084) < i_8_) {
									((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 = i_8_;
								}
							}
							if ((i_11_ ^ 0xffffffff) > -33) {
								Class64_Sub23.anInt3708 = i_10_;
							} else {
								Class64_Sub23.anInt3708 = 2;
							}
							if (i_7_ >= i_9_) {
								if ((i_9_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff)) {
									Class366.anInt3121 |= 0x2;
									((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 -= i_11_;
									if ((((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 ^ 0xffffffff) > (i_9_ ^ 0xffffffff)) {
										((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 = i_9_;
									}
								}
							} else {
								Class366.anInt3121 |= 0x1;
								((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 += i_11_;
								if (i_9_ < ((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079) {
									((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 = i_9_;
								}
							}
						} else {
							Class64_Sub23.anInt3708 = -1;
						}
						if (i_8_ != (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084)
								|| ((((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079) ^ 0xffffffff) != (i_9_ ^ 0xffffffff)) {
							break;
						}
						if (class246_sub3_sub4_sub2.anInt6436 > 0) {
							class246_sub3_sub4_sub2.anInt6436--;
						}
						class246_sub3_sub4_sub2.anInt6434--;
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("uh.A("
								+ i
								+ ','
								+ bool
								+ ','
								+ ((class246_sub3_sub4_sub2 != null) ? "{...}"
										: "null") + ')'));
			}
			break;
		} while (false);
	}

	Class333(final int i, final int i_19_) {
		try {
			anInt3387 = i_19_;
			aFloatArray3389 = new float[i_19_ * i];
			anInt3388 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("uh.<init>(" + i
					+ ',' + i_19_ + ')'));
		}
	}
}
