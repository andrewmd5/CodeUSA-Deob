/* Class276 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class276 {
	static final void method3284(final byte[] is, final int i) {
		try {
			final ByteBuffer class98_sub22 = new ByteBuffer(is);
			if (i != -65536) {
				method3285(null, null, (byte) -37);
			}
			for (;;) {
				final int i_0_ = class98_sub22.readUnsignedByte((byte) 70);
				if ((i_0_ ^ 0xffffffff) == -1) {
					break;
				}
				if (i_0_ == 1) {
					final int[] is_1_ = Class50.anIntArray417 = new int[6];
					is_1_[0] = class98_sub22.readUnsignedShort((byte) 127);
					is_1_[1] = class98_sub22.readUnsignedShort((byte) 127);
					is_1_[2] = class98_sub22.readUnsignedShort((byte) 127);
					is_1_[3] = class98_sub22.readUnsignedShort((byte) 127);
					is_1_[4] = class98_sub22.readUnsignedShort((byte) 127);
					is_1_[5] = class98_sub22.readUnsignedShort((byte) 127);
				} else if ((i_0_ ^ 0xffffffff) == -5) {
					final int i_2_ = class98_sub22.readUnsignedByte((byte) 104);
					Class272.anIntArray2036 = new int[i_2_];
					for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
						Class272.anIntArray2036[i_3_] = class98_sub22
								.readUnsignedShort((byte) 127);
						if ((Class272.anIntArray2036[i_3_] ^ 0xffffffff) == -65536) {
							Class272.anIntArray2036[i_3_] = -1;
						}
					}
				} else if (i_0_ == 5) {
					final int i_4_ = class98_sub22.readUnsignedByte((byte) 65);
					SurfaceSkin.anIntArray333 = new int[i_4_];
					for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
						SurfaceSkin.anIntArray333[i_5_] = class98_sub22
								.readUnsignedShort((byte) 127);
						if (SurfaceSkin.anIntArray333[i_5_] == 65535) {
							SurfaceSkin.anIntArray333[i_5_] = -1;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rda.D("
					+ (is != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	// disabled lobby backup
	/*
	 * static final void method3285(String string, String string_6_, byte i) {
	 * try { if (i != -68) method3285(null, null, (byte) 102);
	 * Class146_Sub2.anInt4855 = -1; Class98_Sub46_Sub20_Sub2.anInt6317 = 1;
	 * Class342.method3814(false, string_6_, 72, string); } catch
	 * (RuntimeException runtimeexception) { throw
	 * Class64_Sub27.method667(runtimeexception, ("rda.C(" + (string != null ?
	 * "{...}" : "null") + ',' + (string_6_ != null ? "{...}" : "null") + ',' +
	 * i + ')')); } }
	 */
	static final void method3285(final String string, final String string_6_,
			final byte i) {
		try {

			if (i != -68) {
				method3285(null, null, (byte) 102);
			}
			Class146_Sub2.anInt4855 = -1;
			Class98_Sub46_Sub20_Sub2.anInt6317 = 1;
			Class342.finalLogin(false, string_6_, 72, string);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rda.C("
					+ (string != null ? "{...}" : "null") + ','
					+ (string_6_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void methodbleh(final String string, final String string_6_,
			final byte i) {
		try {
			if (i != -68) {
				method3285(null, null, (byte) 102);
			}
			Class146_Sub2.anInt4855 = -1;
			Class98_Sub46_Sub20_Sub2.anInt6317 = 1;
			Class342.finalLogin(true, string_6_, 72, string);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rda.C("
					+ (string != null ? "{...}" : "null") + ','
					+ (string_6_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final boolean method3286(final byte i, final int i_7_, final int i_8_) {
		try {
			if (i <= 19) {
				method3287(-88, -7, -49, -121, -81, 87, 14, null, -2, 46, null,
						113, -42);
			}
			return (Class98_Sub10_Sub9.method1033(i_7_, i_8_, 16) & Class140
					.method2287(i_7_, i_8_, 2048));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rda.A(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final void method3287(int i, final int i_9_, final int i_10_,
			final int i_11_, final int i_12_, int i_13_, final int i_14_,
			final ha var_ha, final int i_15_, final int i_16_,
			final byte[][][] is, final int i_17_, final int i_18_) {
		try {
			if (i_13_ != 0 && (i_10_ ^ 0xffffffff) != -1) {
				if (i_13_ == 9) {
					i = i - -1 & 0x3;
					i_13_ = 1;
				}
				if (i_18_ == i_13_) {
					i = 0x3 & 3 + i;
					i_13_ = 1;
				}
				if (i_13_ == 11) {
					i = 3 + i & 0x3;
					i_13_ = 8;
				}
				var_ha.Q(i_11_, i_15_, i_16_, i_12_, i_9_, i_14_,
						is[-1 + i_13_][i], i_10_, i_17_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rda.B(" + i + ','
					+ i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ','
					+ i_13_ + ',' + i_14_ + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_15_ + ','
					+ i_16_ + ',' + (is != null ? "{...}" : "null") + ','
					+ i_17_ + ',' + i_18_ + ')'));
		}
	}
}
