/* Class224_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class224_Sub2 extends Class224 {
	static final Class250 method2836(final int[] is, final boolean bool,
			final Model model, final int i) {
		try {
			if (bool != true) {
				return null;
			}
			int[] is_0_ = null;
			int[] is_1_ = null;
			int[] is_2_ = null;
			float[][] fs = null;
			if (model.textureCoords != null) {
				final int i_3_ = model.numTextureTriangles;
				final int[] is_4_ = new int[i_3_];
				final int[] is_5_ = new int[i_3_];
				final int[] is_6_ = new int[i_3_];
				final int[] is_7_ = new int[i_3_];
				final int[] is_8_ = new int[i_3_];
				final int[] is_9_ = new int[i_3_];
				for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
					is_4_[i_10_] = 2147483647;
					is_5_[i_10_] = -2147483647;
					is_6_[i_10_] = 2147483647;
					is_7_[i_10_] = -2147483647;
					is_8_[i_10_] = 2147483647;
					is_9_[i_10_] = -2147483647;
				}
				for (int i_11_ = 0; i_11_ < i; i_11_++) {
					final int i_12_ = is[i_11_];
					if (model.textureCoords[i_12_] != -1) {
						final int i_13_ = (0xff & model.textureCoords[i_12_]);
						for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -4; i_14_++) {
							short i_15_;
							if ((i_14_ ^ 0xffffffff) != -1) {
								if ((i_14_ ^ 0xffffffff) != -2) {
									i_15_ = (model.triangleViewspaceZ[i_12_]);
								} else {
									i_15_ = (model.triangleViewspaceY[i_12_]);
								}
							} else {
								i_15_ = (model.triangleViewspaceX[i_12_]);
							}
							final int i_16_ = model.verticesX[i_15_];
							final int i_17_ = model.verticesY[i_15_];
							final int i_18_ = model.verticesZ[i_15_];
							if (is_4_[i_13_] > i_16_) {
								is_4_[i_13_] = i_16_;
							}
							if ((is_5_[i_13_] ^ 0xffffffff) > (i_16_ ^ 0xffffffff)) {
								is_5_[i_13_] = i_16_;
							}
							if (is_6_[i_13_] > i_17_) {
								is_6_[i_13_] = i_17_;
							}
							if (is_7_[i_13_] < i_17_) {
								is_7_[i_13_] = i_17_;
							}
							if (i_18_ < is_8_[i_13_]) {
								is_8_[i_13_] = i_18_;
							}
							if (i_18_ > is_9_[i_13_]) {
								is_9_[i_13_] = i_18_;
							}
						}
					}
				}
				fs = new float[i_3_][];
				is_0_ = new int[i_3_];
				is_1_ = new int[i_3_];
				is_2_ = new int[i_3_];
				for (int i_19_ = 0; i_19_ < i_3_; i_19_++) {
					final byte i_20_ = model.textureRenderTypes[i_19_];
					if (i_20_ > 0) {
						is_0_[i_19_] = (is_5_[i_19_] + is_4_[i_19_]) / 2;
						is_1_[i_19_] = (is_6_[i_19_] + is_7_[i_19_]) / 2;
						is_2_[i_19_] = (is_8_[i_19_] + is_9_[i_19_]) / 2;
						float f;
						float f_21_;
						float f_22_;
						if ((i_20_ ^ 0xffffffff) == -2) {
							final int i_23_ = model.particleDirectionX[i_19_];
							f = 64.0F / (model.particleDirectionY[i_19_]);
							if (i_23_ != 0) {
								if ((i_23_ ^ 0xffffffff) < -1) {
									f_22_ = i_23_ / 1024.0F;
									f_21_ = 1.0F;
								} else {
									f_21_ = -i_23_ / 1024.0F;
									f_22_ = 1.0F;
								}
							} else {
								f_22_ = 1.0F;
								f_21_ = 1.0F;
							}
						} else if ((i_20_ ^ 0xffffffff) != -3) {
							f = (model.particleDirectionY[i_19_]) / 1024.0F;
							f_21_ = (model.particleDirectionX[i_19_]) / 1024.0F;
							f_22_ = (model.particleDirectionZ[i_19_]) / 1024.0F;
						} else {
							f = 64.0F / (model.particleDirectionY[i_19_]);
							f_21_ = 64.0F / (model.particleDirectionX[i_19_]);
							f_22_ = 64.0F / (model.particleDirectionZ[i_19_]);
						}
						fs[i_19_] = (Class349.method3839((byte) 123, Class202
								.method2702((model.particleLifespanX[i_19_]),
										255), f_21_, f,
								model.textureTriangleNIndex[i_19_],
								model.textureTriangleMIndex[i_19_], f_22_,
								model.textureTrianglePIndex[i_19_]));
					}
				}
			}
			return new Class250(is_0_, is_1_, is_2_, fs);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ih.D("
					+ (is != null ? "{...}" : "null") + ',' + bool + ','
					+ (model != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method2837(final boolean bool,
			final Class293[] class293s, final int i, final boolean bool_24_,
			final int i_25_, final int i_26_) {
		try {
			if (bool_24_ == true) {
				for (int i_27_ = 0; class293s.length > i_27_; i_27_++) {
					final Class293 class293 = class293s[i_27_];
					if (class293 != null
							&& ((class293.anInt2234 ^ 0xffffffff) == (i_26_ ^ 0xffffffff))) {
						Class253.method3180(i_25_, i, 1375731712, class293,
								bool);
						Class98_Sub8.method986(i, i_25_, class293, 119);
						if (class293.anInt2246 > (-class293.anInt2311 + class293.anInt2290)) {
							class293.anInt2246 = (-class293.anInt2311 + class293.anInt2290);
						}
						if ((-class293.anInt2258 + class293.anInt2228) < class293.anInt2213) {
							class293.anInt2213 = (class293.anInt2228 + -class293.anInt2258);
						}
						if (class293.anInt2246 < 0) {
							class293.anInt2246 = 0;
						}
						if (class293.anInt2213 < 0) {
							class293.anInt2213 = 0;
						}
						if (class293.anInt2354 == 0) {
							Class63.method549(class293, bool, (byte) 61);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ih.C(" + bool
					+ ',' + (class293s != null ? "{...}" : "null") + ',' + i
					+ ',' + bool_24_ + ',' + i_25_ + ',' + i_26_ + ')'));
		}
	}
}
