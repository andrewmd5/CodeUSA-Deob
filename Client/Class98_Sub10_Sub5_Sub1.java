/* Class98_Sub10_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub5_Sub1 extends Class98_Sub10_Sub5 {
	static int anInt6292 = -1;

	static final void method1018(float f, final boolean bool, final int i,
			final float f_0_, final int i_1_, float f_2_,
			final Class39 class39, final int i_3_, float f_4_, final int i_5_,
			final byte[] is, float f_6_, final int i_7_, final int i_8_) {
		do {
			try {
				final int i_9_ = i_7_ * i_5_;
				final float[] fs = new float[i_9_];
				for (int i_10_ = 0; i_3_ > i_10_; i_10_++) {
					int i_11_ = i;
					class39.method352(i_1_, i_5_, f_2_ / i_1_, i_8_,
							f_4_ * 127.0F, 0, f / i_7_, f_6_ / i_5_, fs, i_7_,
							1);
					f_6_ *= 2.0F;
					f_2_ *= 2.0F;
					f_4_ *= f_0_;
					f *= 2.0F;
					for (int i_12_ = 0; i_12_ < i_9_; i_12_++) {
						is[i_11_] += fs[i_12_];
						i_11_++;
					}
				}
				int i_13_ = i;
				for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff); i_14_++) {
					is[i_13_] = (byte) (is[i_13_] + 127);
					i_13_++;
				}
				if (bool == false) {
					break;
				}
				method1018(-1.6836507F, true, 101, -0.5326127F, 104,
						-0.6777266F, null, -49, -1.3125609F, 51, null,
						0.05877325F, -34, -101);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("dc.B(" + f
						+ ',' + bool + ',' + i + ',' + f_0_ + ',' + i_1_ + ','
						+ f_2_ + ',' + (class39 != null ? "{...}" : "null")
						+ ',' + i_3_ + ',' + f_4_ + ',' + i_5_ + ','
						+ (is != null ? "{...}" : "null") + ',' + f_6_ + ','
						+ i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	public Class98_Sub10_Sub5_Sub1() {
		/* empty */
	}

	@Override
	final int[][] method997(final int i, final int i_15_) {
		try {
			final int[][] is = ((Class98_Sub10) this).aClass223_3859
					.method2828(i_15_, 0);
			if (((Class98_Sub10) this).aClass223_3859.aBoolean1683
					&& method1016(-1)) {
				final int[] is_16_ = is[0];
				final int[] is_17_ = is[1];
				final int[] is_18_ = is[2];
				final int i_19_ = (((Class98_Sub10_Sub5) this).anInt5555 * (i_15_ % ((Class98_Sub10_Sub5) this).anInt5555));
				for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff); i_20_++) {
					final int i_21_ = (((Class98_Sub10_Sub5) this).anIntArray5552[(i_20_
							% ((Class98_Sub10_Sub5) this).anInt5556 + i_19_)]);
					is_18_[i_20_] = Class202.method2702(i_21_ << 1432308676,
							4080);
					is_17_[i_20_] = Class202.method2702(4080,
							i_21_ >> -1121818652);
					is_16_[i_20_] = Class202.method2702(i_21_, 16711680) >> 1364421580;
				}
			}
			if (i >= -76) {
				method997(54, -2);
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dc.C(" + i + ','
					+ i_15_ + ')');
		}
	}
}
