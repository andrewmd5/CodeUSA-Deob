/* Class98_Sub46_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class98_Sub46_Sub20 extends Class98_Sub46 {
	static int[] anIntArray6070 = new int[32];
	Interface20 anInterface20_6071;
	int anInt6072;
	static String[] aStringArray6073;
	static int anInt6074;

	abstract Object method1635(int i);

	public static void method1636(final boolean bool) {
		try {
			if (bool == true) {
				anIntArray6070 = null;
				aStringArray6073 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "naa.C(" + bool
					+ ')');
		}
	}

	static final int method1637(final int i, final int i_0_, final int i_1_,
			final int i_2_) {
		try {
			if (i_0_ >= -39) {
				return 26;
			}
			if ((i_1_ ^ 0xffffffff) == (i_2_ ^ 0xffffffff)) {
				return i_1_;
			}
			final int i_3_ = -i + 128;
			final int i_4_ = i * (0x7f & i_2_) + i_3_ * (0x7f & i_1_) >> 747196583;
			final int i_5_ = i_3_ * (0x380 & i_1_) + (0x380 & i_2_) * i >> 1680000903;
			final int i_6_ = (0xfc00 & i_2_) * i + (i_1_ & 0xfc00) * i_3_ >> -239610233;
			return i_5_ & 0x380 | 0xfc00 & i_6_ | i_4_ & 0x7f;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("naa.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	abstract boolean method1638(int i);

	static final int method1639(final int i, final int i_7_) {
		if (Class299_Sub2.aByteArrayArray5291 != null) {
			return Class299_Sub2.aByteArrayArray5291[i][i_7_] & 0xff;
		}
		return 0;
	}

	Class98_Sub46_Sub20(final Interface20 interface20, final int i) {
		try {
			anInt6072 = i;
			anInterface20_6071 = interface20;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("naa.<init>("
							+ (interface20 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	static {
		int i = 2;
		for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -33; i_8_++) {
			anIntArray6070[i_8_] = -1 + i;
			i += i;
		}
	}
}
