/* Class98_Sub10_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub11 extends Class98_Sub10 {
	private boolean aBoolean5594 = true;
	private boolean aBoolean5595 = true;
	static Class148 aClass148_5596 = new Class148();
	static short[][] aShortArrayArray5597;

	public static void method1040(final int i) {
		try {
			aShortArrayArray5597 = null;
			aClass148_5596 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fia.B(" + i + ')');
		}
	}

	@Override
	final int[][] method997(final int i, final int i_1_) {
		try {
			final int[][] is = ((Class98_Sub10) this).aClass223_3859
					.method2828(i_1_, 0);
			if (i > -76) {
				return null;
			}
			if (((Class98_Sub10) this).aClass223_3859.aBoolean1683) {
				final int[][] is_2_ = method994((!aBoolean5595 ? i_1_
						: za_Sub1.anInt6075 - i_1_), 24431, 0);
				final int[] is_3_ = is_2_[0];
				final int[] is_4_ = is_2_[1];
				final int[] is_5_ = is_2_[2];
				final int[] is_6_ = is[0];
				final int[] is_7_ = is[1];
				final int[] is_8_ = is[2];
				if (!aBoolean5594) {
					for (int i_9_ = 0; i_9_ < Class25.anInt268; i_9_++) {
						is_6_[i_9_] = is_3_[i_9_];
						is_7_[i_9_] = is_4_[i_9_];
						is_8_[i_9_] = is_5_[i_9_];
					}
				} else {
					for (int i_10_ = 0; ((Class25.anInt268 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++) {
						is_6_[i_10_] = is_3_[Class329.anInt2761 - i_10_];
						is_7_[i_10_] = is_4_[-i_10_ + Class329.anInt2761];
						is_8_[i_10_] = is_5_[-i_10_ + Class329.anInt2761];
					}
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fia.C(" + i + ','
					+ i_1_ + ')');
		}
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_11_) {
		do {
			try {
				final int i_12_ = i;
				while_80_: do {
					do {
						if (i_12_ != 0) {
							if ((i_12_ ^ 0xffffffff) != -2) {
								if ((i_12_ ^ 0xffffffff) == -3) {
									break;
								}
								break while_80_;
							}
						} else {
							aBoolean5594 = class98_sub22
									.readUnsignedByte((byte) 43) == 1;
							break while_80_;
						}
						aBoolean5595 = class98_sub22
								.readUnsignedByte((byte) -116) == 1;
						break while_80_;
					} while (false);
					((Class98_Sub10) this).aBoolean3861 = class98_sub22
							.readUnsignedByte((byte) -107) == 1;
				} while (false);
				if (i_11_ <= -92) {
					break;
				}
				method991(7, null, (byte) -105);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fia.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_11_ + ')'));
			}
			break;
		} while (false);
	}

	public Class98_Sub10_Sub11() {
		super(1, false);
	}

	@Override
	final int[] method990(final int i, final int i_13_) {
		try {
			if (i != 255) {
				aBoolean5594 = true;
			}
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_13_);
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				final int[] is_14_ = method1000((!aBoolean5595 ? i_13_
						: za_Sub1.anInt6075 - i_13_), 0, i ^ 0xff);
				if (aBoolean5594) {
					for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff)); i_15_++) {
						is[i_15_] = is_14_[-i_15_ + Class329.anInt2761];
					}
				} else {
					Class236.method2891(is_14_, 0, is, 0, Class25.anInt268);
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fia.G(" + i + ','
					+ i_13_ + ')');
		}
	}
}
