import jaggl.OpenGL;

/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2 {
	static Class6 aClass6_68 = new Class6("LIVE", 0);
	static int anInt69;
	static int[] anIntArray70;
	static int anInt71 = 0;
	static Class332[] aClass332Array72;
	static Class299 aClass299_73;

	static final void method168(int i, final int i_0_, final int i_1_,
			final int i_2_, final float[] fs, int i_3_, final int i_4_) {
		try {
			if ((i ^ 0xffffffff) < -1 && !Class81.method815(i, 0)) {
				throw new IllegalArgumentException("");
			}
			if (i_3_ > 0 && !Class81.method815(i_3_, 0)) {
				throw new IllegalArgumentException("");
			}
			final int i_5_ = Class246_Sub3_Sub3.method3014(1, i_1_);
			int i_6_ = 0;
			int i_7_ = (i ^ 0xffffffff) <= (i_3_ ^ 0xffffffff) ? i_3_ : i;
			int i_8_ = i >> -928318015;
			int i_10_ = i_3_ >> -786638463;
			float[] fs_11_ = fs;
			float[] fs_12_ = new float[i_10_ * (i_8_ * i_5_)];
			for (;;) {
				OpenGL.glTexImage2Df(i_0_, i_6_, i_2_, i, i_3_, 0, i_1_, 5126,
						fs_11_, 0);
				if ((i_7_ ^ 0xffffffff) >= -2) {
					break;
				}
				final int i_13_ = i * i_5_;
				for (int i_14_ = 0; i_5_ > i_14_; i_14_++) {
					int i_15_ = i_14_;
					int i_16_ = i_14_;
					int i_17_ = i_13_ + i_16_;
					for (int i_18_ = 0; i_18_ < i_10_; i_18_++) {
						for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff); i_19_++) {
							float f = fs_11_[i_16_];
							i_16_ += i_5_;
							f += fs_11_[i_16_];
							f += fs_11_[i_17_];
							i_16_ += i_5_;
							i_17_ += i_5_;
							f += fs_11_[i_17_];
							i_17_ += i_5_;
							fs_12_[i_15_] = 0.25F * f;
							i_15_ += i_5_;
						}
						i_16_ += i_13_;
						i_17_ += i_13_;
					}
				}
				final float[] fs_20_ = fs_12_;
				fs_12_ = fs_11_;
				i = i_8_;
				i_3_ = i_10_;
				fs_11_ = fs_20_;
				i_6_++;
				i_8_ >>= 1;
				i_7_ >>= 1;
				i_10_ >>= 1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("ad.A(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
							+ (fs != null ? "{...}" : "null") + ',' + i_3_
							+ ',' + i_4_ + ')'));
		}
	}

	static final boolean method169(final boolean bool, final int i,
			final int i_21_) {
		try {
			if (bool != false) {
				return true;
			}
			if ((0x400 & i) == 0) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ad.C(" + bool
					+ ',' + i + ',' + i_21_ + ')'));
		}
	}

	public static void method170(final byte i) {
		try {
			aClass299_73 = null;
			aClass332Array72 = null;
			if (i < 5) {
				aClass332Array72 = null;
			}
			aClass6_68 = null;
			anIntArray70 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ad.B(" + i + ')');
		}
	}

	static {
		anIntArray70 = null;
	}
}
