/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class40 {
	long aLong365;
	int[] anIntArray366;
	static int[][] anIntArrayArray367;
	short[] aShortArray368;
	static IncomingOpcode aClass58_369 = new IncomingOpcode(11, 28);
	short[] aShortArray370;

	static final void method359(final int i, final boolean bool) {
		try {
			Class378.method4005(Class39_Sub1.anInt3593, Class15.anInt185, -1,
					bool, Class98_Sub25.anInt4024);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cr.B(" + i + ','
					+ bool + ')');
		}
	}

	static final void method360(final byte i) {
		do {
			try {
				Class98_Sub10_Sub2.method1009(-63);
				Class128.method2224(22696);
				if (i == 79) {
					break;
				}
				anIntArrayArray367 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cr.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method361(final int i, final int i_1_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i, -30, 16);
			class98_sub46_sub17.method1621(i_1_ + i_1_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cr.E(" + i + ','
					+ i_1_ + ')');
		}
	}

	static final void method362(final byte i, final int i_2_) {
		try {
			Class64_Sub25.anInt3711 = 3;
			Class287.anInt2186 = 100;
			Class98_Sub5_Sub2.anInt5536 = i_2_;
			Class256.anInt1945 = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cr.C(" + i + ','
					+ i_2_ + ')');
		}
	}

	public static void method363(final int i) {
		try {
			if (i >= -55) {
				anIntArrayArray367 = null;
			}
			anIntArrayArray367 = null;
			aClass58_369 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cr.D(" + i + ')');
		}
	}

	static final void method364(final int i, final int i_4_, final int i_5_,
			final int i_6_, final int i_7_, final int i_8_) {
		try {
			int i_9_ = 0;
			int i_10_ = i;
			final int i_11_ = i_5_ * i_5_;
			final int i_13_ = i * i;
			final int i_14_ = i_13_ << -124913215;
			final int i_15_ = i_11_ << -1990005311;
			final int i_16_ = i << -1924555039;
			int i_17_ = i_11_ * (1 + -i_16_) - -i_14_;
			int i_18_ = i_13_ - i_15_ * (i_16_ + -1);
			final int i_19_ = i_11_ << 1567622306;
			final int i_20_ = i_13_ << 2060901122;
			int i_21_ = ((i_9_ << -27167295) + 3) * i_14_;
			int i_22_ = i_15_ * (-3 + (i_10_ << 500964065));
			int i_23_ = (1 + i_9_) * i_20_;
			if (Class98_Sub10_Sub38.anInt5753 <= i_6_
					&& (Class218.anInt1635 ^ 0xffffffff) <= (i_6_ ^ 0xffffffff)) {
				final int i_24_ = Class263.method3219(false, Class3.anInt77,
						Class76_Sub8.anInt3778, i_4_ + i_5_);
				final int i_25_ = Class263.method3219(false, Class3.anInt77,
						Class76_Sub8.anInt3778, -i_5_ + i_4_);
				Class333.method3761(i_8_,
						AnimationDefinition.anIntArrayArray814[i_6_], i_25_,
						i_24_, (byte) -125);
			}
			int i_26_ = (-1 + i_10_) * i_19_;
			while (i_10_ > 0) {
				if ((i_17_ ^ 0xffffffff) > -1) {
					while (i_17_ < 0) {
						i_18_ += i_23_;
						i_17_ += i_21_;
						i_21_ += i_20_;
						i_9_++;
						i_23_ += i_20_;
					}
				}
				if (i_18_ < 0) {
					i_18_ += i_23_;
					i_17_ += i_21_;
					i_21_ += i_20_;
					i_9_++;
					i_23_ += i_20_;
				}
				i_17_ += -i_26_;
				i_18_ += -i_22_;
				i_26_ -= i_19_;
				i_22_ -= i_19_;
				i_10_--;
				final int i_27_ = i_6_ - i_10_;
				final int i_28_ = i_10_ + i_6_;
				if ((i_28_ ^ 0xffffffff) <= (Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff)
						&& (i_27_ ^ 0xffffffff) >= (Class218.anInt1635 ^ 0xffffffff)) {
					final int i_29_ = Class263
							.method3219(false, Class3.anInt77,
									Class76_Sub8.anInt3778, i_4_ + i_9_);
					final int i_30_ = Class263.method3219(false,
							Class3.anInt77, Class76_Sub8.anInt3778, -i_9_
									+ i_4_);
					if ((i_27_ ^ 0xffffffff) <= (Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff)) {
						Class333.method3761(i_8_,
								AnimationDefinition.anIntArrayArray814[i_27_],
								i_30_, i_29_, (byte) 90);
					}
					if (Class218.anInt1635 >= i_28_) {
						Class333.method3761(i_8_,
								AnimationDefinition.anIntArrayArray814[i_28_],
								i_30_, i_29_, (byte) 2);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("cr.A(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ','
							+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	Class40(final long l, final int[] is, final short[] is_31_,
			final short[] is_32_) {
		try {
			aShortArray368 = is_32_;
			aLong365 = l;
			aShortArray370 = is_31_;
			anIntArray366 = is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cr.<init>(" + l
					+ ',' + (is != null ? "{...}" : "null") + ','
					+ (is_31_ != null ? "{...}" : "null") + ','
					+ (is_32_ != null ? "{...}" : "null") + ')'));
		}
	}

	protected Class40() {
		/* empty */
	}
}
