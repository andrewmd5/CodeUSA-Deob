/* Class374 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class374 {
	private final byte[] aByteArray3154;
	private final long[] aLongArray3155;
	static int[] anIntArray3156 = new int[1];
	static Class147[] aClass147Array3157;
	private final long[] aLongArray3158;
	static int anInt3159;
	private int anInt3160 = 0;
	private final long[] aLongArray3161;
	private final long[] aLongArray3162;
	private final long[] aLongArray3163 = new long[8];
	static long[] aLongArray3164 = new long[256];
	private int anInt3165;
	private final byte[] aByteArray3166;

	static final void method3980(final byte i) {
		try {
			if (i >= 120) {
				Class222.aBoolean1667 = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wn.C(" + i + ')');
		}
	}

	final void method3981(final byte[] is, final int i, long l) {
		try {
			int i_0_ = 0;
			final int i_1_ = 0x7 & -((int) l & 0x7) + 8;
			if (i != 64) {
				method3980((byte) 113);
			}
			final int i_2_ = anInt3165 & 0x7;
			long l_3_ = l;
			int i_4_ = 31;
			int i_5_ = 0;
			for (/**/; i_4_ >= 0; i_4_--) {
				i_5_ += (0xff & aByteArray3166[i_4_]) - -((int) l_3_ & 0xff);
				aByteArray3166[i_4_] = (byte) i_5_;
				l_3_ >>>= 8;
				i_5_ >>>= 8;
			}
			while (l > 8L) {
				final int i_6_ = (0xff & is[i_0_] << i_1_ | (is[1 + i_0_] & 0xff) >>> 8 - i_1_);
				if ((i_6_ ^ 0xffffffff) > -1 || i_6_ >= 256) {
					throw new RuntimeException("LOGIC ERROR");
				}
				aByteArray3154[anInt3160] = (byte) Class41.method366(
						aByteArray3154[anInt3160], i_6_ >>> i_2_);
				anInt3160++;
				anInt3165 += 8 - i_2_;
				if ((anInt3165 ^ 0xffffffff) == -513) {
					method3984((byte) 105);
					anInt3165 = anInt3160 = 0;
				}
				aByteArray3154[anInt3160] = (byte) Class202.method2702(
						i_6_ << 8 + -i_2_, 255);
				anInt3165 += i_2_;
				l -= 8L;
				i_0_++;
			}
			int i_7_;
			if (l > 0L) {
				i_7_ = is[i_0_] << i_1_ & 0xff;
				aByteArray3154[anInt3160] = (byte) Class41.method366(
						aByteArray3154[anInt3160], i_7_ >>> i_2_);
			} else {
				i_7_ = 0;
			}
			if (l + i_2_ >= 8L) {
				anInt3160++;
				l -= 8 - i_2_;
				anInt3165 += -i_2_ + 8;
				if (anInt3165 == 512) {
					method3984((byte) 125);
					anInt3165 = anInt3160 = 0;
				}
				aByteArray3154[anInt3160] = (byte) Class202.method2702(255,
						i_7_ << 8 + -i_2_);
				anInt3165 += (int) l;
			} else {
				anInt3165 += l;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("wn.F(" + (is != null ? "{...}" : "null") + ',' + i + ','
							+ l + ')'));
		}
	}

	final void method3982(final byte i, final int i_8_, final byte[] is) {
		try {
			aByteArray3154[anInt3160] = (byte) (Class41.method366(
					aByteArray3154[anInt3160],
					128 >>> Class202.method2702(7, anInt3165)));
			anInt3160++;
			if ((anInt3160 ^ 0xffffffff) < -33) {
				while ((anInt3160 ^ 0xffffffff) > -65) {
					aByteArray3154[anInt3160++] = (byte) 0;
				}
				method3984((byte) 99);
				anInt3160 = 0;
			}
			while (anInt3160 < 32) {
				aByteArray3154[anInt3160++] = (byte) 0;
			}
			Class236.method2894(aByteArray3166, 0, aByteArray3154, 32, 32);
			method3984((byte) 103);
			int i_10_ = 0;
			int i_11_ = i_8_;
			for (/**/; (i_10_ ^ 0xffffffff) > -9; i_10_++) {
				final long l = aLongArray3158[i_10_];
				is[i_11_] = (byte) (int) (l >>> -933636680);
				is[i_11_ + 1] = (byte) (int) (l >>> 67716592);
				is[i_11_ + 2] = (byte) (int) (l >>> -1541782744);
				is[3 + i_11_] = (byte) (int) (l >>> 1121681056);
				is[4 + i_11_] = (byte) (int) (l >>> 1704348888);
				is[5 + i_11_] = (byte) (int) (l >>> 266681360);
				is[i_11_ + 6] = (byte) (int) (l >>> 2131746888);
				is[7 + i_11_] = (byte) (int) l;
				i_11_ += 8;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wn.A(" + i + ','
					+ i_8_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3983(final byte i) {
		try {
			for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > -33; i_12_++) {
				aByteArray3166[i_12_] = (byte) 0;
			}
			aByteArray3154[0] = (byte) 0;
			anInt3165 = anInt3160 = 0;
			int i_13_ = 0;
			if (i != -77) {
				method3980((byte) 86);
			}
			for (/**/; i_13_ < 8; i_13_++) {
				aLongArray3158[i_13_] = 0L;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wn.D(" + i + ')');
		}
	}

	private final void method3984(final byte i) {
		do {
			try {
				int i_14_ = 0;
				int i_15_ = 0;
				while (i_14_ < 8) {
					aLongArray3161[i_14_] = (Class284_Sub1_Sub1
							.method3367(
									SurfaceSkin.method335(
											aByteArray3154[7 + i_15_], 255L),
									(Class284_Sub1_Sub1.method3367(
											SurfaceSkin.method335(
													255L << -430972856,
													((long) (aByteArray3154[i_15_ + 6]) << -1568727992)),
											(Class284_Sub1_Sub1.method3367(
													(SurfaceSkin.method335(
															255L,
															(aByteArray3154[i_15_ + 5])) << 149608080),
													(Class284_Sub1_Sub1.method3367(
															SurfaceSkin.method335(
																	(aByteArray3154[4 + i_15_]),
																	255L) << 770901656,
															(Class284_Sub1_Sub1
																	.method3367(
																			(Class284_Sub1_Sub1
																					.method3367(
																							SurfaceSkin.method335(
																									255L << -830401048,
																									((long) (aByteArray3154[2 + i_15_]) << 1260466408)),
																							(Class284_Sub1_Sub1
																									.method3367(
																											((SurfaceSkin
																													.method335(
																															255L,
																															aByteArray3154[1 + i_15_])) << 88187824),
																											((long) aByteArray3154[i_15_] << -1365521608))))),
																			(SurfaceSkin.method335(
																					255L << 581206880,
																					((long) aByteArray3154[3 + i_15_] << 1040697696)))))))))))));
					i_14_++;
					i_15_ += 8;
				}
				for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -9; i_16_++) {
					aLongArray3163[i_16_] = Class284_Sub1_Sub1.method3367(
							aLongArray3161[i_16_],
							(aLongArray3155[i_16_] = (aLongArray3158[i_16_])));
				}
				for (int i_17_ = 1; (i_17_ ^ 0xffffffff) >= -11; i_17_++) {
					for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -9; i_18_++) {
						aLongArray3162[i_18_] = 0L;
						int i_19_ = 0;
						int i_20_ = 56;
						while (i_19_ < 8) {
							aLongArray3162[i_18_] = (Class284_Sub1_Sub1
									.method3367(
											aLongArray3162[i_18_],
											(Class27.aLongArrayArray279[i_19_][(Class202
													.method2702(
															255,
															(int) ((aLongArray3155[(Class202
																	.method2702(
																			7,
																			-i_19_
																					+ i_18_))]) >>> i_20_)))])));
							i_19_++;
							i_20_ -= 8;
						}
					}
					for (int i_21_ = 0; i_21_ < 8; i_21_++) {
						aLongArray3155[i_21_] = aLongArray3162[i_21_];
					}
					aLongArray3155[0] = Class284_Sub1_Sub1.method3367(
							aLongArray3155[0], (Class27.aLongArray280[i_17_]));
					for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -9; i_22_++) {
						aLongArray3162[i_22_] = aLongArray3155[i_22_];
						int i_23_ = 0;
						int i_24_ = 56;
						for (/**/; (i_23_ ^ 0xffffffff) > -9; i_23_++) {
							aLongArray3162[i_22_] = (Class284_Sub1_Sub1
									.method3367(
											aLongArray3162[i_22_],
											(Class27.aLongArrayArray279[i_23_][(Class202
													.method2702(
															255,
															(int) ((aLongArray3163[Class202
																	.method2702(
																			(i_22_ - i_23_),
																			7)]) >>> i_24_)))])));
							i_24_ -= 8;
						}
					}
					for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -9; i_25_++) {
						aLongArray3163[i_25_] = aLongArray3162[i_25_];
					}
				}
				for (int i_26_ = 0; i_26_ < 8; i_26_++) {
					aLongArray3158[i_26_] = (Class284_Sub1_Sub1.method3367(
							aLongArray3158[i_26_], Class284_Sub1_Sub1
									.method3367((aLongArray3161[i_26_]),
											(aLongArray3163[i_26_]))));
				}
				if (i >= 98) {
					break;
				}
				method3982((byte) 104, -78, null);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "wn.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method3985(final int i) {
		do {
			try {
				aClass147Array3157 = null;
				anIntArray3156 = null;
				aLongArray3164 = null;
				if (i == 0) {
					break;
				}
				aClass147Array3157 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "wn.E(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public Class374() {
		aLongArray3158 = new long[8];
		aLongArray3162 = new long[8];
		aByteArray3154 = new byte[64];
		aLongArray3155 = new long[8];
		anInt3165 = 0;
		aLongArray3161 = new long[8];
		aByteArray3166 = new byte[32];
	}

	static {
		anInt3159 = 0;
		for (int i = 0; i < 256; i++) {
			long l = i;
			for (int i_27_ = 0; i_27_ < 8; i_27_++) {
				if ((l & 0x1L) == 1L) {
					l = l >>> 1524723841 ^ ~0x3693a86a2878f0bdL;
				} else {
					l >>>= 1;
				}
			}
			aLongArray3164[i] = l;
		}
	}
}
