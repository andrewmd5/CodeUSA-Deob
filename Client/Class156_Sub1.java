/* Class156_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class156_Sub1 extends Class156 implements Interface8 {
	private int anInt3276;
	static Class377 aClass377_3277 = new Class377(4);
	static int anInt3278;
	static int[] anIntArray3279 = new int[13];

	@Override
	public final int method19(final int i) {
		try {
			if (i != -22132) {
				return 116;
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qs.B(" + i + ')');
		}
	}

	@Override
	public final long method22(final int i) {
		try {
			if (i != 20260) {
				return -35L;
			}
			return ((Class156) this).aBuffer1247.getAddress();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qs.I(" + i + ')');
		}
	}

	@Override
	public final int method21(final int i) {
		try {
			if (i != 5061) {
				anInt3278 = 93;
			}
			return anInt3276;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qs.A(" + i + ')');
		}
	}

	Class156_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final byte[] is,
			final int i_0_) {
		super(var_ha_Sub1, is, i_0_);
		try {
			anInt3276 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qs.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	public static void method2497(final byte i) {
		try {
			if (i >= -62) {
				anInt3278 = -42;
			}
			aClass377_3277 = null;
			anIntArray3279 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qs.E(" + i + ')');
		}
	}

	@Override
	public final void method20(final byte i, final byte[] is, final int i_1_,
			final int i_2_) {
		try {
			method2496(is, i_1_);
			if (i == -47) {
				anInt3276 = i_2_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("qs.H(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final int method2498(final int i, final byte i_3_, final boolean bool) {
		try {
			if (bool) {
				return 0;
			}
			final Class98_Sub3 class98_sub3 = Class64_Sub28.method669(i, bool,
					6);
			if (class98_sub3 == null) {
				return (Class98_Sub46_Sub14.aClass8_5378.method185(9, i).anInt6055);
			}
			int i_4_ = 0;
			for (int i_5_ = 0; class98_sub3.anIntArray3824.length > i_5_; i_5_++) {
				if (class98_sub3.anIntArray3824[i_5_] == -1) {
					i_4_++;
				}
			}
			if (i_3_ <= 93) {
				return -9;
			}
			i_4_ += (Class98_Sub46_Sub14.aClass8_5378.method185(9, i).anInt6055 - class98_sub3.anIntArray3824.length);
			return i_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qs.C(" + i + ','
					+ i_3_ + ',' + bool + ')'));
		}
	}

	static final int method2499(final int i, final int i_6_, final int i_7_) {
		try {
			final int i_8_ = (Class242.method2934(11348, i_7_ + -1, -1 + i_6_)
					+ Class242.method2934(11348, 1 + i_7_, -1 + i_6_) - (-Class242
					.method2934(11348, i_7_ - 1, 1 + i_6_) + -Class242
					.method2934(11348, i_7_ - -1, 1 + i_6_)));
			final int i_9_ = (Class242.method2934(11348, i_7_ + -1, i_6_) - (-Class242
					.method2934(11348, 1 + i_7_, i_6_)
					+ -Class242.method2934(11348, i_7_, -1 + i_6_) + -Class242
					.method2934(11348, i_7_, 1 + i_6_)));
			final int i_10_ = Class242.method2934(11348, i_7_, i_6_);
			return i_9_ / 8 + i_8_ / 16 - -(i_10_ / 4);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qs.D(" + i + ','
					+ i_6_ + ',' + i_7_ + ')'));
		}
	}
}
