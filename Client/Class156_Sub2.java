/* Class156_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

final class Class156_Sub2 extends Class156 implements Interface16 {
	private int anInt3422;
	static int anInt3423 = 0;

	@Override
	public final void method54(final int i, final int i_0_, final byte[] is,
			final int i_1_) {
		try {
			method2496(is, i);
			if (i_0_ != 7896) {
				anInt3422 = -117;
			}
			anInt3422 = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("se.F(" + i + ',' + i_0_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_1_ + ')'));
		}
	}

	static final void method2500(final int i, final int i_2_) {
		do {
			try {
				Class49.anInt415 = i;
				if (i_2_ == 0) {
					break;
				}
				method2500(-95, -97);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "se.A(" + i
						+ ',' + i_2_ + ')');
			}
			break;
		} while (false);
	}

	@Override
	public final long method52(final int i) {
		try {
			if (i != 24582) {
				anInt3422 = 44;
			}
			return ((Class156) this).aBuffer1247.getAddress();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "se.E(" + i + ')');
		}
	}

	static final long method2501(final byte i, final String string) {
		try {
			long l = 0L;
			final int i_3_ = string.length();
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				l *= 37L;
				final int i_5_ = string.charAt(i_4_);
				if (i_5_ >= 65 && i_5_ <= 90) {
					l += 1 - (-i_5_ - -65);
				} else if (i_5_ >= 97 && i_5_ <= 122) {
					l += -97 + (1 + i_5_);
				} else if (i_5_ >= 48 && i_5_ <= 57) {
					l += i_5_ + -21;
				}
				if ((l ^ 0xffffffffffffffffL) <= -177917621779460414L) {
					break;
				}
			}
			if (i > -124) {
				anInt3423 = 56;
			}
			for (/**/; (l % 37L ^ 0xffffffffffffffffL) == -1L && l != 0L; l /= 37L) {
				/* empty */
			}
			return l;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("se.D(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	Class156_Sub2(final ha_Sub1 var_ha_Sub1, final int i, final byte[] is,
			final int i_6_) {
		super(var_ha_Sub1, is, i_6_);
		try {
			anInt3422 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("se.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_6_ + ')'));
		}
	}

	Class156_Sub2(final ha_Sub1 var_ha_Sub1, final int i, final Buffer buffer) {
		super(var_ha_Sub1, buffer);
		try {
			anInt3422 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("se.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ (buffer != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final int method53(final int i) {
		try {
			if (i != -14112) {
				method55(-28);
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "se.B(" + i + ')');
		}
	}

	@Override
	public final int method55(final int i) {
		try {
			return anInt3422;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "se.C(" + i + ')');
		}
	}
}
