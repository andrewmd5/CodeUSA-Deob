/* Class246_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub6 extends Class246 {
	int anInt5109;
	int anInt5110;
	int anInt5111;
	int anInt5112;
	int anInt5113;
	boolean aBoolean5114 = false;

	final boolean method3130(final int i, final int i_0_) {
		if (!aBoolean5114) {
			return false;
		}
		final int i_1_ = (anInt5110 - anInt5111);
		final int i_2_ = (anInt5112 - anInt5113);
		final int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
		int i_4_ = (i * i_1_ + i_0_ * i_2_ - (anInt5111 * i_1_ + anInt5113
				* i_2_));
		if (i_4_ <= 0) {
			final int i_5_ = anInt5111 - i;
			final int i_6_ = anInt5113 - i_0_;
			if (i_5_ * i_5_ + i_6_ * i_6_ >= (anInt5109 * anInt5109)) {
				return false;
			}
			return true;
		}
		if (i_4_ > i_3_) {
			final int i_7_ = anInt5110 - i;
			final int i_8_ = anInt5112 - i_0_;
			if (i_7_ * i_7_ + i_8_ * i_8_ >= (anInt5109 * anInt5109)) {
				return false;
			}
			return true;
		}
		i_4_ = (i_4_ << 10) / i_3_;
		final int i_9_ = anInt5111 + (i_1_ * i_4_ >> 10) - i;
		final int i_10_ = anInt5113 + (i_2_ * i_4_ >> 10) - i_0_;
		if (i_9_ * i_9_ + i_10_ * i_10_ >= (anInt5109 * anInt5109)) {
			return false;
		}
		return true;
	}

	public Class246_Sub6() {
		/* empty */
	}
}
