/* Class98_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub6 extends Class98 {
	int anInt3838;
	int anInt3839;
	private int anInt3840;
	private int anInt3841;
	private int anInt3842;
	int anInt3843;
	static IncomingOpcode aClass58_3844 = new IncomingOpcode(121, -1);
	int anInt3845;
	private int anInt3846;
	static Class79 aClass79_3847 = new Class79(8);
	private int anInt3848;

	public static void method975(final int i) {
		do {
			try {
				aClass58_3844 = null;
				aClass79_3847 = null;
				if (i == 1) {
					break;
				}
				method978(true, true, 19, true, 86);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cd.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final boolean method976(final int i, final int i_0_, final int i_1_,
			final int i_2_) {
		try {
			if (i_0_ < 104) {
				anInt3848 = 122;
			}
			if ((anInt3842 ^ 0xffffffff) == (i_2_ ^ 0xffffffff)
					&& i_1_ >= anInt3840 && i_1_ <= anInt3848 && i >= anInt3846
					&& i <= anInt3841) {
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cd.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final boolean method977(final int i, final byte i_3_, final int i_4_) {
		try {
			if (i_3_ <= 32) {
				anInt3848 = 89;
			}
			if (((anInt3839 ^ 0xffffffff) >= (i ^ 0xffffffff))
					&& i <= anInt3838 && anInt3843 <= i_4_ && anInt3845 >= i_4_) {
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cd.D(" + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final int method978(final boolean bool, final boolean bool_5_,
			final int i, final boolean bool_6_, final int i_7_) {
		try {
			final Class98_Sub3 class98_sub3 = Class64_Sub28.method669(i, bool,
					6);
			if (class98_sub3 == null) {
				return 0;
			}
			int i_8_ = 0;
			for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (class98_sub3.anIntArray3824.length ^ 0xffffffff)); i_9_++) {
				if ((class98_sub3.anIntArray3824[i_9_] ^ 0xffffffff) <= -1
						&& (((Class98_Sub46_Sub19.aClass205_6068.anInt1554) ^ 0xffffffff) < (class98_sub3.anIntArray3824[i_9_] ^ 0xffffffff))) {
					final ItemDefs class297 = (Class98_Sub46_Sub19.aClass205_6068
							.method2714(class98_sub3.anIntArray3824[i_9_],
									(byte) -121));
					final int i_10_ = (class297.method3494(i_7_, (byte) -128,
							(Class98_Sub43_Sub1.aClass365_5897.method3940(
									(byte) 31, i_7_).anInt1202)));
					if (bool_5_) {
						i_8_ += (class98_sub3.anIntArray3823[i_9_]) * i_10_;
					} else {
						i_8_ += i_10_;
					}
				}
			}
			if (bool_6_ != true) {
				method975(-10);
			}
			return i_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("cd.G(" + bool + ',' + bool_5_ + ',' + i + ',' + bool_6_
							+ ',' + i_7_ + ')'));
		}
	}

	final void method979(final int i, final int i_11_, final int i_12_,
			final int[] is) {
		try {
			is[1] = i_12_ - anInt3839 - -anInt3840;
			is[i_11_] = anInt3842;
			is[2] = i - -anInt3846 + -anInt3843;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cd.H(" + i + ','
					+ i_11_ + ',' + i_12_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method980(final int i, final int i_13_, final int i_14_) {
		try {
			if (i > -94) {
				method980(104, -50, -22);
			}
			if ((i_13_ ^ 0xffffffff) > (anInt3840 ^ 0xffffffff)
					|| (i_13_ ^ 0xffffffff) < (anInt3848 ^ 0xffffffff)
					|| (anInt3846 ^ 0xffffffff) < (i_14_ ^ 0xffffffff)
					|| anInt3841 < i_14_) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cd.C(" + i + ','
					+ i_13_ + ',' + i_14_ + ')'));
		}
	}

	static final Model method981(final int i, final int i_15_,
			final Class207 class207, int modelId) {
		try {
			// / if (i_16_ == 65677) {
			// i_16_ = 1;
			// }
			// if (i_16_ == 65673) {
			// i_16_ = 1;
			// }
			// System.out.println(i_16_); //model id
			final byte[] is = class207.method2745(i, modelId, false);
			if (i_15_ != -9252) {
				aClass79_3847 = null;
			}
			if (is == null) {
				return null;
			}
			return new Model(is);
		} catch (final RuntimeException runtimeexception) {
			modelId = 1;

		}
		return null;
	}

	Class98_Sub6(final int i, final int i_17_, final int i_18_,
			final int i_19_, final int i_20_, final int i_21_, final int i_22_,
			final int i_23_, final int i_24_) {
		try {
			anInt3842 = i;
			anInt3840 = i_17_;
			anInt3845 = i_24_;
			anInt3846 = i_18_;
			anInt3841 = i_20_;
			anInt3839 = i_21_;
			anInt3848 = i_19_;
			anInt3838 = i_23_;
			anInt3843 = i_22_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("cd.<init>(" + i + ',' + i_17_ + ',' + i_18_ + ',' + i_19_
							+ ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ','
							+ i_23_ + ',' + i_24_ + ')'));
		}
	}

	final void method982(final int i, final int i_25_, final int i_26_,
			final int[] is) {
		do {
			try {
				is[0] = 0;
				is[2] = anInt3843 - anInt3846 + i;
				is[1] = -anInt3840 - (-anInt3839 - i_25_);
				if (i_26_ > 43) {
					break;
				}
				anInt3842 = 27;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("cd.A(" + i
						+ ',' + i_25_ + ',' + i_26_ + ','
						+ (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
