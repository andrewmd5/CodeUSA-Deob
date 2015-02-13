/* Class98_Sub10_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub12 extends Class98_Sub10 {
	static int anInt5598;
	static boolean aBoolean5599 = true;

	@Override
	final int[][] method997(final int i, final int i_0_) {
		try {
			final int[][] is = ((Class98_Sub10) this).aClass223_3859
					.method2828(i_0_, 0);
			if (((Class98_Sub10) this).aClass223_3859.aBoolean1683) {
				final int[] is_1_ = method1000(i_0_, 2, 0);
				final int[][] is_2_ = method994(i_0_, 24431, 0);
				final int[][] is_3_ = method994(i_0_, 24431, 1);
				final int[] is_4_ = is[0];
				final int[] is_5_ = is[1];
				final int[] is_6_ = is[2];
				final int[] is_7_ = is_2_[0];
				final int[] is_8_ = is_2_[1];
				final int[] is_9_ = is_2_[2];
				final int[] is_10_ = is_3_[0];
				final int[] is_11_ = is_3_[1];
				final int[] is_12_ = is_3_[2];
				for (int i_13_ = 0; (Class25.anInt268 ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
					final int i_14_ = is_1_[i_13_];
					if (i_14_ != 4096) {
						if (i_14_ == 0) {
							is_4_[i_13_] = is_10_[i_13_];
							is_5_[i_13_] = is_11_[i_13_];
							is_6_[i_13_] = is_12_[i_13_];
						} else {
							final int i_15_ = -i_14_ + 4096;
							is_4_[i_13_] = (i_14_ * is_7_[i_13_]
									- -(is_10_[i_13_] * i_15_) >> 327350924);
							is_5_[i_13_] = (is_8_[i_13_] * i_14_ + i_15_
									* is_11_[i_13_] >> 428197644);
							is_6_[i_13_] = (is_12_[i_13_] * i_15_
									+ is_9_[i_13_] * i_14_ >> 1391664972);
						}
					} else {
						is_4_[i_13_] = is_7_[i_13_];
						is_5_[i_13_] = is_8_[i_13_];
						is_6_[i_13_] = is_9_[i_13_];
					}
				}
			}
			if (i > -76) {
				aBoolean5599 = false;
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gr.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	@Override
	final int[] method990(final int i, final int i_16_) {
		try {
			if (i != 255) {
				method991(92, null, (byte) -19);
			}
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_16_);
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				final int[] is_17_ = method1000(i_16_, 0, 0);
				final int[] is_18_ = method1000(i_16_, 1, 0);
				final int[] is_19_ = method1000(i_16_, 2, 0);
				for (int i_20_ = 0; Class25.anInt268 > i_20_; i_20_++) {
					final int i_21_ = is_19_[i_20_];
					if (i_21_ != 4096) {
						if (i_21_ != 0) {
							is[i_20_] = (is_18_[i_20_] * (4096 - i_21_) + i_21_
									* is_17_[i_20_]) >> 1486833164;
						} else {
							is[i_20_] = is_18_[i_20_];
						}
					} else {
						is[i_20_] = is_17_[i_20_];
					}
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gr.G(" + i + ','
					+ i_16_ + ')');
		}
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_22_) {
		do {
			try {
				if (i_22_ >= -92) {
					aBoolean5599 = false;
				}
				if ((i ^ 0xffffffff) != -1) {
					break;
				}
				((Class98_Sub10) this).aBoolean3861 = ((class98_sub22
						.readUnsignedByte((byte) -115) ^ 0xffffffff) == -2);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gr.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_22_ + ')'));
			}
			break;
		} while (false);
	}

	public Class98_Sub10_Sub12() {
		super(3, false);
	}
}
