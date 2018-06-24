/* Class98_Sub10_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub25 extends Class98_Sub10 {
	static double aDouble5675;
	private int anInt5676 = -1;
	static long aLong5677 = 0L;
	private int anInt5678;
	private int anInt5679;
	private int[] anIntArray5680;

	static final int method1079(final Class98_Sub46_Sub9 class98_sub46_sub9,
			final int i) {
		try {
			if (i != 21) {
				return -125;
			}
			final String string = Class21.method262(class98_sub46_sub9,
					(byte) 103);
			return (Class42_Sub1.aClass197_5354.method2676((byte) 108,
					Class217.aClass332Array3408, string));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("om.B(" + (class98_sub46_sub9 != null ? "{...}" : "null")
							+ ',' + i + ')'));
		}
	}

	@Override
	final int method992(final int i) {
		try {
			return anInt5676;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "om.S(" + i + ')');
		}
	}

	static final void method1080(final byte i) {
		try {
			if (Class98_Sub43_Sub2.aClass88_5907.aBoolean682
					&& (Class289.aClass354_2197.worldId ^ 0xffffffff) != 0) {
				Class98_Sub12.method1131(-8804,
						(Class289.aClass354_2197.worldId),
						(Class289.aClass354_2197.aString3016));
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "om.E(" + i + ')');
		}
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_2_) {
		try {
			if ((i ^ 0xffffffff) == -1) {
				anInt5676 = class98_sub22.readUnsignedShort((byte) 127);
			}
			if (i_2_ >= -92) {
				anIntArray5680 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("om.A(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i_2_ + ')'));
		}
	}

	@Override
	final void method993(final int i) {
		try {
			super.method993((short) i);
			anIntArray5680 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "om.P(" + i + ')');
		}
	}

	@Override
	final void method998(final int i, final int i_3_, final int i_4_) {
		do {
			try {
				super.method998(i, i_3_, i_4_);
				if ((anInt5676 ^ 0xffffffff) > -1 || Class38.aD356 == null) {
					break;
				}
				final int i_5_ = ((Class38.aD356.method11(anInt5676, -28755).aBoolean1822) ? 64
						: 128);
				anIntArray5680 = Class38.aD356.method9(anInt5676, (byte) -121,
						i_5_, 1.0F, false, i_5_);
				anInt5679 = i_5_;
				anInt5678 = i_5_;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("om.O(" + i
						+ ',' + i_3_ + ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1081(final int i,
			final Class98_Sub46_Sub9 class98_sub46_sub9, final boolean bool,
			final int i_6_) {
		try {
			if (Player.aBoolean6540) {
				int i_7_ = 0;
				for (Class98_Sub46_Sub8 class98_sub46_sub8 = ((Class98_Sub46_Sub8) class98_sub46_sub9.aClass215_5999
						.method2792(-1)); class98_sub46_sub8 != null; class98_sub46_sub8 = ((Class98_Sub46_Sub8) class98_sub46_sub9.aClass215_5999
						.method2787(0))) {
					final int i_8_ = Class222.method2824((byte) 85,
							class98_sub46_sub8);
					if (i_8_ > i_7_) {
						i_7_ = i_8_;
					}
				}
				i_7_ += 8;
				final int i_9_ = 21 + (class98_sub46_sub9.anInt6001 * 16);
				Class98_Sub43_Sub4.anInt5938 = ((Class98_Sub5_Sub3.aBoolean5539 ? 26
						: 22) + 16 * (class98_sub46_sub9.anInt6001));
				int i_10_ = Class246_Sub3_Sub4_Sub4.anInt6488
						+ Class38.anInt355;
				if (i_10_ + i_7_ > Class39_Sub1.anInt3593) {
					i_10_ = Class38.anInt355 - i_7_;
				}
				if (bool == true) {
					if ((i_10_ ^ 0xffffffff) > -1) {
						i_10_ = 0;
					}
					final int i_11_ = !Class98_Sub5_Sub3.aBoolean5539 ? 31 : 33;
					int i_12_ = i + -i_11_ + 13;
					if (Class98_Sub25.anInt4024 < i_9_ + i_12_) {
						i_12_ = Class98_Sub25.anInt4024 - i_9_;
					}
					Class282.anInt2128 = i_10_;
					if (i_12_ < 0) {
						i_12_ = 0;
					}
					Class163.anInt3518 = i_12_;
					Class308.aClass98_Sub46_Sub9_2583 = class98_sub46_sub9;
					Class5.anInt3439 = i_7_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("om.D(" + i + ','
					+ (class98_sub46_sub9 != null ? "{...}" : "null") + ','
					+ bool + ',' + i_6_ + ')'));
		}
	}

	public Class98_Sub10_Sub25() {
		super(0, false);
	}

	@Override
	final int[][] method997(final int i, final int i_13_) {
		try {
			if (i >= -76) {
				anIntArray5680 = null;
			}
			final int[][] is = ((Class98_Sub10) this).aClass223_3859
					.method2828(i_13_, 0);
			if (((Class98_Sub10) this).aClass223_3859.aBoolean1683) {
				int i_14_ = (((Class63.anInt492 ^ 0xffffffff) == (anInt5678 ^ 0xffffffff) ? i_13_
						: anInt5678 * i_13_ / Class63.anInt492) * anInt5679);
				final int[] is_15_ = is[0];
				final int[] is_16_ = is[1];
				final int[] is_17_ = is[2];
				if (Class25.anInt268 != anInt5679) {
					for (int i_18_ = 0; Class25.anInt268 > i_18_; i_18_++) {
						final int i_19_ = i_18_ * anInt5679 / Class25.anInt268;
						final int i_20_ = anIntArray5680[i_19_ + i_14_];
						is_17_[i_18_] = Class202.method2702(i_20_, 255) << 1263100004;
						is_16_[i_18_] = Class202.method2702(4080,
								i_20_ >> 136339012);
						is_15_[i_18_] = Class202.method2702(4080,
								i_20_ >> 1712612364);
					}
				} else {
					for (int i_21_ = 0; Class25.anInt268 > i_21_; i_21_++) {
						final int i_22_ = anIntArray5680[i_14_++];
						is_17_[i_21_] = Class202.method2702(255, i_22_) << 1450547076;
						is_16_[i_21_] = Class202.method2702(4080,
								i_22_ >> 365050084);
						is_15_[i_21_] = Class202.method2702(4080,
								i_22_ >> 1685547052);
					}
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "om.C(" + i + ','
					+ i_13_ + ')');
		}
	}
}
