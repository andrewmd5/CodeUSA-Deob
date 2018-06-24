/* Class98_Sub10_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub23 extends Class98_Sub10 {
	private int anInt5657;
	private int[] anIntArray5658;
	static int anInt5659;
	private int[] anIntArray5660;
	static int anInt5661 = 0;
	static Class335 aClass335_5662;
	private int anInt5663 = 0;
	private int anInt5664 = 10;

	public Class98_Sub10_Sub23() {
		super(0, true);
		anInt5657 = 2048;
	}

	@Override
	final void method1001(final byte i) {
		do {
			try {
				method1074((byte) -6);
				if (i == 66) {
					break;
				}
				aClass335_5662 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "nu.I(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_0_) {
		do {
			try {
				final int i_1_ = i;
				while_132_: do {
					do {
						if (i_1_ != 0) {
							if (i_1_ != 1) {
								if ((i_1_ ^ 0xffffffff) == -3) {
									break;
								}
								break while_132_;
							}
						} else {
							anInt5664 = class98_sub22
									.readUnsignedByte((byte) 4);
							break while_132_;
						}
						anInt5657 = class98_sub22.readUnsignedShort((byte) 127);
						break while_132_;
					} while (false);
					anInt5663 = class98_sub22.readUnsignedByte((byte) -126);
				} while (false);
				if (i_0_ < -92) {
					break;
				}
				method1001((byte) 102);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("nu.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1073(final int i) {
		do {
			try {
				aClass335_5662 = null;
				if (i == 4096) {
					break;
				}
				method1073(45);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "nu.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	private final void method1074(final byte i) {
		try {
			anIntArray5658 = new int[1 + anInt5664];
			anIntArray5660 = new int[1 + anInt5664];
			int i_2_ = 0;
			final int i_3_ = 4096 / anInt5664;
			final int i_4_ = i_3_ * anInt5657 >> -946071060;
			int i_5_ = 0;
			if (i != -6) {
				anInt5657 = -68;
			}
			for (/**/; i_5_ < anInt5664; i_5_++) {
				anIntArray5660[i_5_] = i_2_;
				anIntArray5658[i_5_] = i_4_ + i_2_;
				i_2_ += i_3_;
			}
			anIntArray5660[anInt5664] = 4096;
			anIntArray5658[anInt5664] = anIntArray5658[0] + 4096;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "nu.D(" + i + ')');
		}
	}

	@Override
	final int[] method990(final int i, final int i_6_) {
		try {
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_6_);
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				final int i_7_ = GameObjectDefinition.anIntArray3001[i_6_];
				if ((anInt5663 ^ 0xffffffff) == -1) {
					int i_8_ = 0;
					for (int i_9_ = 0; anInt5664 > i_9_; i_9_++) {
						if ((i_7_ ^ 0xffffffff) <= (anIntArray5660[i_9_] ^ 0xffffffff)
								&& ((anIntArray5660[1 + i_9_] ^ 0xffffffff) < (i_7_ ^ 0xffffffff))) {
							if ((anIntArray5658[i_9_] ^ 0xffffffff) < (i_7_ ^ 0xffffffff)) {
								i_8_ = 4096;
							}
							break;
						}
					}
					Class236.method2896(is, 0, Class25.anInt268, i_8_);
				} else {
					for (int i_10_ = 0; i_10_ < Class25.anInt268; i_10_++) {
						int i_11_ = 0;
						int i_12_ = 0;
						final int i_13_ = Class64_Sub1.anIntArray3640[i_10_];
						int i_14_ = anInt5663;
						while_133_: do {
							do {
								if (i_14_ != 1) {
									if ((i_14_ ^ 0xffffffff) != -3) {
										if ((i_14_ ^ 0xffffffff) == -4) {
											break;
										}
										break while_133_;
									}
								} else {
									i_11_ = i_13_;
									break while_133_;
								}
								i_11_ = 2048 + (i_13_ + -4096 + i_7_ >> -752554751);
								break while_133_;
							} while (false);
							i_11_ = (i_13_ + -i_7_ >> 2077425665) + 2048;
						} while (false);
						for (i_14_ = 0; (anInt5664 ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
							if (((anIntArray5660[i_14_] ^ 0xffffffff) >= (i_11_ ^ 0xffffffff))
									&& ((anIntArray5660[i_14_ - -1] ^ 0xffffffff) < (i_11_ ^ 0xffffffff))) {
								if ((anIntArray5658[i_14_] ^ 0xffffffff) < (i_11_ ^ 0xffffffff)) {
									i_12_ = 4096;
								}
								break;
							}
						}
						is[i_10_] = i_12_;
					}
				}
			}
			if (i != 255) {
				anInt5661 = -81;
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "nu.G(" + i + ','
					+ i_6_ + ')');
		}
	}
}
