/* r - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class r extends Class98_Sub46 {
	public r() {
		/* empty */
	}

	static final void method1641(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_, final int i_5_,
			final int i_6_) {
		try {
			final int i_7_ = Class263.method3219(false, Class218.anInt1635,
					Class98_Sub10_Sub38.anInt5753, i_5_);
			final int i_8_ = Class263.method3219(false, Class218.anInt1635,
					Class98_Sub10_Sub38.anInt5753, i_0_);
			final int i_9_ = Class263.method3219(false, Class3.anInt77,
					Class76_Sub8.anInt3778, i_1_);
			final int i_10_ = Class263.method3219(false, Class3.anInt77,
					Class76_Sub8.anInt3778, i_3_);
			final int i_11_ = Class263.method3219(false, Class218.anInt1635,
					Class98_Sub10_Sub38.anInt5753, i_5_ + i_2_);
			final int i_12_ = Class263.method3219(false, Class218.anInt1635,
					Class98_Sub10_Sub38.anInt5753, -i_2_ + i_0_);
			for (int i_13_ = i_7_; (i_11_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
				Class333.method3761(i,
						AnimationDefinition.anIntArrayArray814[i_13_], i_9_,
						i_10_, (byte) 103);
			}
			if (i_4_ == -18907) {
				for (int i_14_ = i_8_; (i_14_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_14_--) {
					Class333.method3761(i,
							AnimationDefinition.anIntArrayArray814[i_14_],
							i_9_, i_10_, (byte) 126);
				}
				final int i_15_ = Class263.method3219(false, Class3.anInt77,
						Class76_Sub8.anInt3778, i_1_ - -i_2_);
				final int i_16_ = Class263.method3219(false, Class3.anInt77,
						Class76_Sub8.anInt3778, i_3_ - i_2_);
				for (int i_17_ = i_11_; i_12_ >= i_17_; i_17_++) {
					final int[] is = AnimationDefinition.anIntArrayArray814[i_17_];
					Class333.method3761(i, is, i_9_, i_15_, (byte) 112);
					Class333.method3761(i_6_, is, i_15_, i_16_, (byte) -128);
					Class333.method3761(i, is, i_16_, i_10_, (byte) 3);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("r.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}
}
