/* Class284_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class284_Sub2 extends Class284 {
	private int anInt5179;
	static OutgoingOpcode aClass171_5180;
	private int anInt5181;
	private int anInt5182;
	private int anInt5183;
	private byte[] aByteArray5184;
	private int anInt5185;
	static int anInt5186 = -1;
	private int anInt5187;
	private int anInt5188;
	private int anInt5189;

	@Override
	final void method3356(final int i, final int i_0_, final int i_1_) {
		do {
			try {
				if ((i ^ 0xffffffff) == -1) {
					anInt5188 = (-((i_0_ ^ 0xffffffff) > -1 ? -i_0_ : i_0_) + anInt5179);
					anInt5183 = 4096;
					anInt5188 = anInt5188 * anInt5188 >> 419437836;
					anInt5185 = anInt5188;
				} else {
					anInt5183 = anInt5187 * anInt5188 >> 1860817932;
					if ((anInt5183 ^ 0xffffffff) > -1) {
						anInt5183 = 0;
					} else if (anInt5183 > 4096) {
						anInt5183 = 4096;
					}
					anInt5188 = anInt5179
							+ -((i_0_ ^ 0xffffffff) <= -1 ? i_0_ : -i_0_);
					anInt5188 = anInt5188 * anInt5188 >> -1937288276;
					anInt5188 = anInt5183 * anInt5188 >> -133065620;
					anInt5185 += anInt5182 * anInt5188 >> 1705588460;
					anInt5182 = anInt5189 * anInt5182 >> -387876148;
				}
				if (i_1_ == 255) {
					break;
				}
				anInt5183 = -18;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gt.G(" + i
						+ ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method3358(final int i) {
		try {
			anInt5185 >>= 4;
			anInt5182 = anInt5189;
			do {
				if ((anInt5185 ^ 0xffffffff) <= -1) {
					if ((anInt5185 ^ 0xffffffff) >= -256) {
						break;
					}
					anInt5185 = 255;
					if (!client.aBoolean3553) {
						break;
					}
				}
				anInt5185 = 0;
			} while (false);
			method3375(anInt5181++, 64, (byte) anInt5185);
			anInt5185 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gt.H(" + i + ')');
		}
	}

	@Override
	final void method3354(final int i) {
		try {
			anInt5181 = 0;
			if (i != 751943489) {
				method3376(-60);
			}
			anInt5185 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gt.D(" + i + ')');
		}
	}

	static final Class42_Sub1_Sub1 method3374(final int i, final int i_2_,
			final int i_3_, final int i_4_, final ha_Sub1 var_ha_Sub1,
			final boolean bool, final byte[] is, final int i_5_) {
		try {
			if (i_3_ != 14764) {
				method3376(-123);
			}
			if (!var_ha_Sub1.aBoolean4426
					&& (!Class81.method815(i_5_, 0) || !Class81.method815(i_2_,
							0))) {
				if (!var_ha_Sub1.aBoolean4378) {
					return new Class42_Sub1_Sub1(var_ha_Sub1, i_4_, i_5_, i_2_,
							Class48.method453(423660257, i_5_),
							Class48.method453(423660257, i_2_), is, i);
				}
				return new Class42_Sub1_Sub1(var_ha_Sub1, 34037, i_4_, i_5_,
						i_2_, bool, is, i);
			}
			return new Class42_Sub1_Sub1(var_ha_Sub1, 3553, i_4_, i_5_, i_2_,
					bool, is, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("gt.K(" + i + ',' + i_2_
							+ ',' + i_3_ + ',' + i_4_ + ','
							+ (var_ha_Sub1 != null ? "{...}" : "null") + ','
							+ bool + ',' + (is != null ? "{...}" : "null")
							+ ',' + i_5_ + ')'));
		}
	}

	void method3375(final int i, final int i_6_, final byte i_7_) {
		try {
			aByteArray5184[i] = i_7_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gt.L(" + i + ','
					+ i_6_ + ',' + i_7_ + ')'));
		}
	}

	Class284_Sub2(final int i, final int i_9_, final int i_10_,
			final int i_11_, final int i_12_, final float f, final float f_13_,
			final float f_14_) {
		super(i, i_9_, i_10_, i_11_, i_12_);
		try {
			anInt5187 = (int) (f_14_ * 4096.0F);
			anInt5179 = (int) (f_13_ * 4096.0F);
			anInt5182 = anInt5189 = (int) (Math.pow(0.5, -f) * 4096.0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gt.<init>(" + i
					+ ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_
					+ ',' + f + ',' + f_13_ + ',' + f_14_ + ')'));
		}
	}

	public static void method3376(final int i) {
		try {
			aClass171_5180 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gt.J(" + i + ')');
		}
	}

	static {
		aClass171_5180 = new OutgoingOpcode(43, 7);
	}
}
