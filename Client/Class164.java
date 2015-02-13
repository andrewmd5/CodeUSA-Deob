/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class164 {
	static int anInt1273;
	static int anInt1274;
	int anInt1275;

	@Override
	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					"kt.toString(" + ')');
		}
	}

	static final void method2522(final int i, final int i_0_, final int i_1_,
			final aa var_aa, final ha var_ha, final int i_2_,
			final Class293 class293, final int i_3_, final int i_4_) {
		do {
			try {
				if (i_2_ != -2040004466) {
					method2522(-86, 94, 35, null, null, 24, null, -1, -62);
				}
				final Class24 class24 = Class216.aClass341_1622.method3807(-72,
						i_0_);
				if (class24 == null || !class24.aBoolean230
						|| !class24.method284(34, Class75.aClass140_584)) {
					break;
				}
				if (class24.anIntArray265 != null) {
					final int[] is = new int[class24.anIntArray265.length];
					for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (is.length / 2 ^ 0xffffffff); i_5_++) {
						int i_6_;
						if (Class98_Sub46_Sub20_Sub2.anInt6319 != 4) {
							i_6_ = 0x3fff & ((int) Class98_Sub22_Sub2.aFloat5794 + Class204.anInt1553);
						} else {
							i_6_ = (int) Class98_Sub22_Sub2.aFloat5794 & 0x3fff;
						}
						int i_7_ = Class284_Sub2_Sub2.anIntArray6200[i_6_];
						int i_8_ = Class284_Sub2_Sub2.anIntArray6202[i_6_];
						if (Class98_Sub46_Sub20_Sub2.anInt6319 != 4) {
							i_8_ = 256 * i_8_ / (256 + Class151.anInt1213);
							i_7_ = 256 * i_7_ / (256 + Class151.anInt1213);
						}
						is[2 * i_5_] = (i_3_ + class293.anInt2311 / 2 + ((i_7_
								* (4 * (class24.anIntArray265[2 * i_5_ - -1]) + i_4_) - -(i_8_ * (i - -((class24.anIntArray265[i_5_ * 2]) * 4)))) >> 1110343022));
						is[2 * i_5_ + 1] = (class293.anInt2258 / 2 + i_1_ - ((i_8_
								* (4 * (class24.anIntArray265[i_5_ * 2 + 1]) + i_4_) - i_7_
								* (4 * (class24.anIntArray265[2 * i_5_]) + i)) >> -2040004466));
					}
					Class136.method2272(var_ha, is, class24.anInt249,
							class293.anIntArray2217, class293.anIntArray2298);
					if ((class24.anInt250 ^ 0xffffffff) >= -1) {
						for (int i_9_ = 0; i_9_ < -1 + is.length / 2; i_9_++) {
							var_ha.a(
									is[i_9_ * 2],
									is[2 * i_9_ - -1],
									is[2 * i_9_ - -2],
									is[2 + (2 * i_9_ + 1)],
									(class24.anIntArray234[((class24.aByteArray229[i_9_]) & 0xff)]),
									1, var_aa, i_3_, i_1_);
						}
						var_ha.a(
								is[-2 + is.length],
								is[is.length - 1],
								is[0],
								is[1],
								(class24.anIntArray234[0xff & (class24.aByteArray229[((class24.aByteArray229).length - 1)])]),
								1, var_aa, i_3_, i_1_);
					} else {
						for (int i_10_ = 0; is.length / 2 - 1 > i_10_; i_10_++) {
							int i_11_ = is[2 * i_10_];
							int i_12_ = is[2 * i_10_ + 1];
							int i_13_ = is[2 * (i_10_ + 1)];
							int i_14_ = is[1 + 2 * (i_10_ - -1)];
							if (i_11_ > i_13_) {
								final int i_15_ = i_11_;
								i_11_ = i_13_;
								final int i_16_ = i_12_;
								i_12_ = i_14_;
								i_13_ = i_15_;
								i_14_ = i_16_;
							} else if (i_13_ == i_11_ && i_12_ > i_14_) {
								final int i_17_ = i_12_;
								i_12_ = i_14_;
								i_14_ = i_17_;
							}
							var_ha.a(
									i_11_,
									i_12_,
									i_13_,
									i_14_,
									(class24.anIntArray234[((class24.aByteArray229[i_10_]) & 0xff)]),
									1, var_aa, i_3_, i_1_, class24.anInt250,
									class24.anInt253, class24.anInt224);
						}
						int i_18_ = is[-2 + is.length];
						int i_19_ = is[-1 + is.length];
						int i_20_ = is[0];
						int i_21_ = is[1];
						if (i_20_ >= i_18_) {
							if ((i_20_ ^ 0xffffffff) == (i_18_ ^ 0xffffffff)
									&& (i_19_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff)) {
								final int i_22_ = i_19_;
								i_19_ = i_21_;
								i_21_ = i_22_;
							}
						} else {
							final int i_23_ = i_18_;
							final int i_24_ = i_19_;
							i_18_ = i_20_;
							i_20_ = i_23_;
							i_19_ = i_21_;
							i_21_ = i_24_;
						}
						var_ha.a(
								i_18_,
								i_19_,
								i_20_,
								i_21_,
								(class24.anIntArray234[((class24.aByteArray229[(class24.aByteArray229).length - 1]) & 0xff)]),
								1, var_aa, i_3_, i_1_, class24.anInt250,
								class24.anInt253, class24.anInt224);
					}
				}
				Class332 class332 = null;
				if ((class24.anInt245 ^ 0xffffffff) != 0) {
					class332 = class24.method287((byte) 92, var_ha, false);
					if (class332 != null) {
						Class4.method173(i_1_, i_4_, i_3_, class293, var_aa, i,
								(byte) -24, class332);
					}
				}
				if (class24.aString263 == null) {
					break;
				}
				int i_25_ = 0;
				if (class332 != null) {
					i_25_ = class332.method3731();
				}
				Class43 class43 = Class69_Sub2.aClass43_5336;
				Class197 class197 = Class98_Sub46_Sub2_Sub2.aClass197_6296;
				if (class24.anInt264 == 1) {
					class197 = Class98_Sub46_Sub10.aClass197_6019;
					class43 = Class195.aClass43_1499;
				}
				if ((class24.anInt264 ^ 0xffffffff) == -3) {
					class197 = Class42_Sub1.aClass197_5354;
					class43 = Class98_Sub10_Sub34.aClass43_5730;
				}
				OutgoingOpcode.method2540(i, i_3_, class197, i_1_, class293,
						i_25_, (byte) 109, class24.aString263, var_aa,
						class24.anInt257, i_4_, class43);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("kt.A(" + i
						+ ',' + i_0_ + ',' + i_1_ + ','
						+ (var_aa != null ? "{...}" : "null") + ','
						+ (var_ha != null ? "{...}" : "null") + ',' + i_2_
						+ ',' + (class293 != null ? "{...}" : "null") + ','
						+ i_3_ + ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	Class164(final int i) {
		try {
			anInt1275 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kt.<init>(" + i
					+ ')');
		}
	}
}
