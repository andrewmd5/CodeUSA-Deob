import jaggl.OpenGL;

/* Class42_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class42_Sub2 extends Class42 {
	int anInt5357;
	private int anInt5358 = -1;
	static Class324 aClass324_5359;
	private int anInt5360 = -1;

	Class42_Sub2(final ha_Sub1 var_ha_Sub1, final int i, final int i_0_) {
		super(var_ha_Sub1, 34067, i, 6 * i_0_ * i_0_, false);
		try {
			anInt5357 = i_0_;
			((Class42) this).aHa_Sub1_3227.method1863(1, this);
			for (int i_1_ = 0; i_1_ < 6; i_1_++) {
				OpenGL.glTexImage2Dub(i_1_ + 34069, 0,
						((Class42) this).anInt3230, i_0_, i_0_, 0,
						Class98_Sub31_Sub2.method1339(
								((Class42) this).anInt3230, 126), 5121, null, 0);
			}
			method372(-28003, true);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hw.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ')'));
		}
	}

	static final void method388(final boolean bool) {
		do {
			try {
				int i = 1024;
				int i_2_ = 3072;
				if (Class239.aBoolean1839) {
					i_2_ = 4096;
					if (Class69.aBoolean3223) {
						i = 2048;
					}
				}
				if (i > Class119_Sub4.aFloat4740) {
					Class119_Sub4.aFloat4740 = i;
				}
				if (Class119_Sub4.aFloat4740 > i_2_) {
					Class119_Sub4.aFloat4740 = i_2_;
				}
				for (/**/; Class98_Sub22_Sub2.aFloat5794 >= 16384.0F; Class98_Sub22_Sub2.aFloat5794 -= 16384.0F) {
					/* empty */
				}
				for (/**/; Class98_Sub22_Sub2.aFloat5794 < 0.0F; Class98_Sub22_Sub2.aFloat5794 += 16384.0F) {
					/* empty */
				}
				final int i_3_ = Class201.anInt1545 >> 698948297;
				final int i_4_ = Class224_Sub3_Sub1.anInt6147 >> -35654487;
				final int i_5_ = Class98_Sub46_Sub2_Sub2.method1538(
						Class43.anInt377, (Class224_Sub3_Sub1.anInt6147),
						Class201.anInt1545, 24111);
				if (bool == true) {
					int i_6_ = 0;
					if ((i_3_ ^ 0xffffffff) < -4
							&& (i_4_ ^ 0xffffffff) < -4
							&& ((Class165.anInt1276 + -4 ^ 0xffffffff) < (i_3_ ^ 0xffffffff))
							&& ((Class98_Sub10_Sub7.anInt5572 + -4 ^ 0xffffffff) < (i_4_ ^ 0xffffffff))) {
						for (int i_7_ = -4 + i_3_; (4 + i_3_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff); i_7_++) {
							for (int i_8_ = i_4_ - 4; 4 + i_4_ >= i_8_; i_8_++) {
								int i_9_ = Class43.anInt377;
								if (i_9_ < 3
										&& Class1.method162(i_8_, (byte) -104,
												i_7_)) {
									i_9_++;
								}
								int i_10_ = 0;
								if ((((Class305) Class146_Sub3.aClass305_Sub1_4952).aByteArrayArrayArray2554) != null
										&& ((((Class305) Class146_Sub3.aClass305_Sub1_4952).aByteArrayArrayArray2554[i_9_]) != null)) {
									i_10_ = ((0xff & (((Class305) (Class146_Sub3.aClass305_Sub1_4952)).aByteArrayArrayArray2554[i_9_][i_7_][i_8_])) * 8 << 976034466);
								}
								if (Class78.aSArray594 != null
										&& Class78.aSArray594[i_9_] != null) {
									final int i_11_ = (i_5_
											- (Class78.aSArray594[i_9_]
													.method3420(i_8_, -12639,
															i_7_)) - -i_10_);
									if ((i_11_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff)) {
										i_6_ = i_11_;
									}
								}
							}
						}
					}
					int i_12_ = (i_6_ >> 142317154) * 1536;
					if (i_12_ > 786432) {
						i_12_ = 786432;
					}
					if (i_12_ < 262144) {
						i_12_ = 262144;
					}
					if (Class43.anInt372 < i_12_) {
						Class43.anInt372 += (-Class43.anInt372 + i_12_) / 24;
					} else {
						if ((Class43.anInt372 ^ 0xffffffff) >= (i_12_ ^ 0xffffffff)) {
							break;
						}
						Class43.anInt372 += (i_12_ + -Class43.anInt372) / 80;
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hw.C(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	Class42_Sub2(final ha_Sub1 var_ha_Sub1, final int i, final int i_13_,
			final boolean bool, final byte[][] is, final int i_14_) {
		super(var_ha_Sub1, 34067, i, 6 * (i_13_ * i_13_), bool);
		try {
			anInt5357 = i_13_;
			((Class42) this).aHa_Sub1_3227.method1863(1, this);
			for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -7; i_15_++) {
				OpenGL.glTexImage2Dub(34069 - -i_15_, 0,
						((Class42) this).anInt3230, i_13_, i_13_, 0, i_14_,
						5121, is[i_15_], 0);
			}
			method372(-28003, true);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hw.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_13_ + ',' + bool + ','
					+ (is != null ? "{...}" : "null") + ',' + i_14_ + ')'));
		}
	}

	Class42_Sub2(final ha_Sub1 var_ha_Sub1, final int i, final int i_16_,
			final boolean bool, final int[][] is) {
		super(var_ha_Sub1, 34067, i, i_16_ * (i_16_ * 6), bool);
		try {
			anInt5357 = i_16_;
			((Class42) this).aHa_Sub1_3227.method1863(1, this);
			if (bool) {
				for (int i_17_ = 0; i_17_ < 6; i_17_++) {
					Class336.method3773(((Class42) this).anInt3230, 53,
							(((Class42) this).aHa_Sub1_3227).anInt4425,
							34069 + i_17_, i_16_, 32993, i_16_, is[i_17_]);
				}
			} else {
				for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -7; i_18_++) {
					OpenGL.glTexImage2Di(34069 - -i_18_, 0,
							((Class42) this).anInt3230, i_16_, i_16_, 0, 32993,
							(((Class42) this).aHa_Sub1_3227.anInt4425),
							is[i_18_], 0);
				}
			}
			method372(-28003, true);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hw.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_16_ + ',' + bool + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final void method3(final byte i) {
		try {
			if (i > -117) {
				anInt5360 = -45;
			}
			OpenGL.glFramebufferTexture2DEXT(anInt5358, anInt5360, 3553, 0, 0);
			anInt5358 = -1;
			anInt5360 = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hw.B(" + i + ')');
		}
	}

	static final int[] method389(final int i, final Class98_Sub11 class98_sub11) {
		try {
			final ByteBuffer class98_sub22 = new ByteBuffer(518);
			if (i != 12206) {
				method388(true);
			}
			final int[] is = new int[4];
			for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > -5; i_19_++) {
				is[i_19_] = (int) (9.9999999E7 * Math.random());
			}
			class98_sub22.method1194(10, 86);
			class98_sub22.writeInt(1571862888, is[0]);
			class98_sub22.writeInt(1571862888, is[1]);
			class98_sub22.writeInt(i ^ 0x5db096c6, is[2]);
			class98_sub22.writeInt(1571862888, is[3]);
			for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > -11; i_20_++) {
				class98_sub22.writeInt(1571862888,
						(int) (9.9999999E7 * Math.random()));
			}
			class98_sub22.writeShort((int) (Math.random() * 9.9999999E7),
					i ^ 0x5db096c6);
			class98_sub22.method1205(Class98_Sub45.aBigInteger4253, true,
					Class138.aBigInteger1082);
			class98_sub11.aClass98_Sub22_Sub1_3865.method1217(
					class98_sub22.incomingBytes, class98_sub22.position, i
							+ -12207, 0);
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hw.D(" + i + ','
					+ (class98_sub11 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method390(final boolean bool) {
		try {
			if (bool != false) {
				method389(103, null);
			}
			aClass324_5359 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hw.E(" + bool
					+ ')');
		}
	}

	final void method391(final int i, final int i_21_, final int i_22_,
			final int i_23_, final byte i_24_) {
		try {
			OpenGL.glFramebufferTexture2DEXT(i_23_, i_21_, i_22_,
					((Class42) this).anInt3229, i);
			anInt5360 = i_21_;
			anInt5358 = i_23_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hw.A(" + i + ','
					+ i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ')'));
		}
	}
}
