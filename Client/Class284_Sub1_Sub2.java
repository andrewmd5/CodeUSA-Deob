/* Class284_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class284_Sub1_Sub2 extends Class284_Sub1 {
	static OutgoingOpcode aClass171_6191;
	static int anInt6192;
	static int[] anIntArray6193 = new int[4];
	private byte[] aByteArray6194;

	public Class284_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	public static void method3369(final byte i) {
		try {
			anIntArray6193 = null;
			if (i >= -28) {
				method3371(-40);
			}
			aClass171_6191 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tb.K(" + i + ')');
		}
	}

	static final void method3370(final int i, final int i_0_,
			final Class246_Sub3_Sub4_Sub2 class246_sub3_sub4_sub2,
			final int i_1_, final int i_2_) {
		try {
			final Class294 class294 = class246_sub3_sub4_sub2.method3039(1);
			if (i_0_ != 6144) {
				anIntArray6193 = null;
			}
			final int i_3_ = (((class246_sub3_sub4_sub2.anInt6415) - (class246_sub3_sub4_sub2.aClass325_6399).anInt2730) & 0x3fff);
			if (i_1_ == -1) {
				if ((i_3_ ^ 0xffffffff) == -1
						&& ((class246_sub3_sub4_sub2.anInt6408) ^ 0xffffffff) >= -26) {
					if (!(class246_sub3_sub4_sub2.aBoolean6359)
							|| !class294.method3480((byte) -53,
									(class246_sub3_sub4_sub2.anInt6385))) {
						class246_sub3_sub4_sub2.anInt6385 = class294
								.method3478(i_0_ ^ 0x1820);
						class246_sub3_sub4_sub2.aBoolean6359 = class246_sub3_sub4_sub2.anInt6385 != -1;
					}
				} else {
					if ((i_2_ ^ 0xffffffff) <= -1 || class294.anInt2376 == -1) {
						if (i_2_ <= 0 || class294.anInt2388 == -1) {
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2399;
						} else {
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2388;
						}
					} else {
						class246_sub3_sub4_sub2.aBoolean6359 = false;
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2376;
					}
					class246_sub3_sub4_sub2.aBoolean6359 = false;
				}
			} else if (((class246_sub3_sub4_sub2.anInt6364) ^ 0xffffffff) == 0
					|| i_3_ < 10240 && i_3_ > 2048) {
				if ((i_3_ ^ 0xffffffff) != -1
						|| (class246_sub3_sub4_sub2.anInt6408) > 25) {
					if (i_1_ != 2 || (class294.anInt2389 ^ 0xffffffff) == 0) {
						if (i_1_ == 0 && class294.anInt2368 != -1) {
							if (i_2_ < 0 && class294.anInt2405 != -1) {
								class246_sub3_sub4_sub2.anInt6385 = class294.anInt2405;
							} else if ((i_2_ ^ 0xffffffff) >= -1
									|| class294.anInt2404 == -1) {
								class246_sub3_sub4_sub2.anInt6385 = class294.anInt2368;
							} else {
								class246_sub3_sub4_sub2.anInt6385 = class294.anInt2404;
							}
						} else if ((i_2_ ^ 0xffffffff) <= -1
								|| class294.anInt2378 == -1) {
							if ((i_2_ ^ 0xffffffff) < -1
									&& class294.anInt2369 != -1) {
								class246_sub3_sub4_sub2.anInt6385 = class294.anInt2369;
							} else {
								class246_sub3_sub4_sub2.anInt6385 = class294.anInt2399;
							}
						} else {
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2378;
						}
					} else if (i_2_ < 0
							&& (class294.anInt2384 ^ 0xffffffff) != 0) {
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2384;
					} else if (i_2_ <= 0
							|| (class294.anInt2370 ^ 0xffffffff) == 0) {
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2389;
					} else {
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2370;
					}
					class246_sub3_sub4_sub2.aBoolean6359 = false;
				} else {
					if ((i_1_ ^ 0xffffffff) == -3
							&& (class294.anInt2389 ^ 0xffffffff) != 0) {
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2389;
					} else if (i_1_ == 0
							&& (class294.anInt2368 ^ 0xffffffff) != 0) {
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2368;
					} else {
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2399;
					}
					class246_sub3_sub4_sub2.aBoolean6359 = false;
				}
			} else {
				final int i_4_ = 0x3fff & (-(class246_sub3_sub4_sub2.aClass325_6399).anInt2730 + Class98_Sub43_Sub1.anIntArray5896[i]);
				if ((i_1_ ^ 0xffffffff) == -3 && class294.anInt2389 != -1) {
					if (i_4_ > 2048 && i_4_ <= 6144
							&& (class294.anInt2402 ^ 0xffffffff) != 0) {
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2402;
					} else if (i_4_ < 10240 || (i_4_ ^ 0xffffffff) <= -14337
							|| class294.anInt2357 == -1) {
						if ((i_4_ ^ 0xffffffff) < -6145
								&& (i_4_ ^ 0xffffffff) > -10241
								&& ((class294.anInt2361 ^ 0xffffffff) != 0)) {
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2361;
						} else {
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2389;
						}
					} else {
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2357;
					}
				} else if ((i_1_ ^ 0xffffffff) == -1
						&& ((class294.anInt2368 ^ 0xffffffff) != 0)) {
					if ((i_4_ ^ 0xffffffff) < -2049 && i_4_ <= 6144
							&& (class294.anInt2403 ^ 0xffffffff) != 0) {
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2403;
					} else if (i_4_ < 10240 || (i_4_ ^ 0xffffffff) <= -14337
							|| ((class294.anInt2377 ^ 0xffffffff) == 0)) {
						if (i_4_ > 6144 && (i_4_ ^ 0xffffffff) > -10241
								&& ((class294.anInt2394 ^ 0xffffffff) != 0)) {
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2394;
						} else {
							class246_sub3_sub4_sub2.anInt6385 = class294.anInt2368;
						}
					} else {
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2377;
					}
				} else if (i_4_ > 2048 && i_4_ <= 6144
						&& ((class294.anInt2372 ^ 0xffffffff) != 0)) {
					class246_sub3_sub4_sub2.anInt6385 = class294.anInt2372;
				} else if (i_4_ < 10240 || (i_4_ ^ 0xffffffff) <= -14337
						|| ((class294.anInt2359 ^ 0xffffffff) == 0)) {
					if ((i_4_ ^ 0xffffffff) >= -6145 || i_4_ >= 10240
							|| (class294.anInt2365 ^ 0xffffffff) == 0) {
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2399;
					} else {
						class246_sub3_sub4_sub2.anInt6385 = class294.anInt2365;
					}
				} else {
					class246_sub3_sub4_sub2.anInt6385 = class294.anInt2359;
				}
				class246_sub3_sub4_sub2.aBoolean6359 = false;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tb.L(" + i + ','
					+ i_0_ + ','
					+ (class246_sub3_sub4_sub2 != null ? "{...}" : "null")
					+ ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method3371(final int i) {
		do {
			try {
				Class64_Sub22.method644(-67);
				if (i == 31398) {
					break;
				}
				aClass171_6191 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "tb.N(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final byte[] method3372(final boolean bool, final int i, final int i_5_,
			final int i_6_) {
		try {
			aByteArray6194 = new byte[2 * (i_5_ * i * i_6_)];
			if (bool != true) {
				method3363((byte) 104, -114, (byte) 118);
			}
			method3361((byte) -45, i_6_, i, i_5_);
			return aByteArray6194;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tb.J(" + bool
					+ ',' + i + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	@Override
	final void method3363(byte i, final int i_7_, final byte i_8_) {
		do {
			try {
				i = (byte) (((i & 0xff) >> -428365951) + 127);
				int i_9_ = i_7_ * 2;
				aByteArray6194[i_9_++] = i;
				aByteArray6194[i_9_] = i;
				if (i_8_ == 42) {
					break;
				}
				aClass171_6191 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("tb.M(" + i
						+ ',' + i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method3373(final int i, final int i_10_,
			final byte i_11_) {
		try {
			if (i_11_ <= 10) {
				method3370(36, -41, null, 23, 85);
			}
			if ((i_10_ & 0xc580 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tb.O(" + i + ','
					+ i_10_ + ',' + i_11_ + ')'));
		}
	}

	static {
		aClass171_6191 = new OutgoingOpcode(37, -1);
	}
}
