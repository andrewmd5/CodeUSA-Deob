/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class122 {
	private int[] anIntArray1008;
	static int anInt1009;

	static final void method2199(final boolean bool) {
		try {
			if (Class221.anIntArray1665 == null) {
				Class221.anIntArray1665 = new int[65536];
				final double d = 0.7 + (0.03 * Math.random() - 0.015);
				int i = 0;
				if (bool != false) {
					anInt1009 = 50;
				}
				for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -513; i_0_++) {
					final float f = 360.0F * (0.0078125F + (i_0_ >> 74274595) / 64.0F);
					final float f_1_ = (i_0_ & 0x7) / 8.0F + 0.0625F;
					for (int i_2_ = 0; i_2_ < 128; i_2_++) {
						final float f_3_ = i_2_ / 128.0F;
						float f_4_ = 0.0F;
						float f_5_ = 0.0F;
						float f_6_ = 0.0F;
						final float f_7_ = f / 60.0F;
						final int i_8_ = (int) f_7_;
						final int i_9_ = i_8_ % 6;
						final float f_10_ = -i_8_ + f_7_;
						final float f_11_ = (-f_1_ + 1.0F) * f_3_;
						final float f_12_ = f_3_ * (1.0F - f_1_ * f_10_);
						final float f_13_ = (-((-f_10_ + 1.0F) * f_1_) + 1.0F)
								* f_3_;
						if (i_9_ != 0) {
							if (i_9_ != 1) {
								if ((i_9_ ^ 0xffffffff) != -3) {
									if ((i_9_ ^ 0xffffffff) != -4) {
										if ((i_9_ ^ 0xffffffff) != -5) {
											if ((i_9_ ^ 0xffffffff) == -6) {
												f_6_ = f_12_;
												f_4_ = f_3_;
												f_5_ = f_11_;
											}
										} else {
											f_5_ = f_11_;
											f_6_ = f_3_;
											f_4_ = f_13_;
										}
									} else {
										f_4_ = f_11_;
										f_5_ = f_12_;
										f_6_ = f_3_;
									}
								} else {
									f_4_ = f_11_;
									f_6_ = f_13_;
									f_5_ = f_3_;
								}
							} else {
								f_5_ = f_3_;
								f_4_ = f_12_;
								f_6_ = f_11_;
							}
						} else {
							f_5_ = f_13_;
							f_4_ = f_3_;
							f_6_ = f_11_;
						}
						f_4_ = (float) Math.pow(f_4_, d);
						f_5_ = (float) Math.pow(f_5_, d);
						f_6_ = (float) Math.pow(f_6_, d);
						final int i_14_ = (int) (256.0F * f_4_);
						final int i_15_ = (int) (f_5_ * 256.0F);
						final int i_16_ = (int) (f_6_ * 256.0F);
						final int i_17_ = ((i_14_ << 1057698384) + (-16777216
								+ (i_15_ << 1325420744) - -i_16_));
						Class221.anIntArray1665[i++] = i_17_;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ica.C(" + bool
					+ ')');
		}
	}

	final int method2200(final byte i, final int i_18_) {
		try {
			if (i != -26) {
				method2201(83, null, -111, null, 117, (byte) -54);
			}
			final int i_19_ = (anIntArray1008.length >> 1866406849) - 1;
			int i_20_ = i_19_ & i_18_;
			for (;;) {
				final int i_21_ = anIntArray1008[1 + (i_20_ + i_20_)];
				if ((i_21_ ^ 0xffffffff) == 0) {
					return -1;
				}
				if ((i_18_ ^ 0xffffffff) == (anIntArray1008[i_20_ - -i_20_] ^ 0xffffffff)) {
					return i_21_;
				}
				i_20_ = 1 + i_20_ & i_19_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ica.A(" + i + ','
					+ i_18_ + ')');
		}
	}

	Class122(final int[] is) {
		try {
			int i;
			for (i = 1; ((i ^ 0xffffffff) >= (is.length
					+ (is.length >> 1095190241) ^ 0xffffffff)); i <<= 1) {
				/* empty */
			}
			anIntArray1008 = new int[i + i];
			for (int i_22_ = 0; i - -i > i_22_; i_22_++) {
				anIntArray1008[i_22_] = -1;
			}
			for (int i_23_ = 0; (is.length ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++) {
				int i_24_;
				for (i_24_ = is[i_23_] & i + -1; anIntArray1008[1 + i_24_
						+ i_24_] != -1; i_24_ = i_24_ - -1 & -1 + i) {
					/* empty */
				}
				anIntArray1008[i_24_ + i_24_] = is[i_23_];
				anIntArray1008[1 + (i_24_ + i_24_)] = i_23_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ica.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	static final void method2201(int i, final GameObjectDefinition class352,
			final int i_25_, final ha var_ha, final int i_26_, final byte i_27_) {
		try {
			if (i_27_ != 70) {
				method2201(76, null, 62, null, 80, (byte) -43);
			}
			final Class9 class9 = Class98_Sub10_Sub23.aClass335_5662
					.method3766(class352.anInt2990, (byte) 97);
			if ((class9.anInt114 ^ 0xffffffff) != 0) {
				do {
					if (class352.aBoolean3004) {
						i += class352.anInt2962;
						i &= 0x3;
						if (!client.aBoolean3553) {
							break;
						}
					}
					i = 0;
				} while (false);
				final Class332 class332 = class9.method190(
						class352.aBoolean2976, 0, i, var_ha);
				if (class332 != null) {
					int i_28_ = class352.sizeY;
					int i_29_ = class352.sizeX;
					if ((0x1 & i) == 1) {
						i_29_ = class352.sizeY;
						i_28_ = class352.sizeX;
					}
					int i_30_ = class332.method3737();
					int i_31_ = class332.method3749();
					if (class9.aBoolean116) {
						i_31_ = 4 * i_29_;
						i_30_ = 4 * i_28_;
					}
					if ((class9.anInt115 ^ 0xffffffff) != -1) {
						class332.method3727(i_25_, i_26_ - -4 - 4 * i_29_,
								i_30_, i_31_, 0, (class9.anInt115 | ~0xffffff),
								1);
					} else {
						class332.method3726(i_25_, i_26_ + -(4 * (-1 + i_29_)),
								i_30_, i_31_);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ica.B(" + i + ','
					+ (class352 != null ? "{...}" : "null") + ',' + i_25_ + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_26_ + ','
					+ i_27_ + ')'));
		}
	}
}
