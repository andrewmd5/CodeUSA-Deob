/* Class98_Sub46_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub6 extends Class98_Sub46 {
	SurfaceSkin aClass35_5971;
	int anInt5972;
	Class66 aClass66_5973;
	int anInt5974;
	static IncomingOpcode aClass58_5975 = new IncomingOpcode(60, 4);
	int anInt5976;
	int anInt5977;
	int anInt5978;
	static int anInt5979;
	static int[] anIntArray5980 = new int[3];

	static final String method1546(final int i, final int i_0_,
			final byte i_1_, final byte[] is) {
		try {
			final char[] cs = new char[i];
			int i_2_ = 0;
			if (i_1_ >= -49) {
				method1548(-78, 47, 80, 103, (byte) -48, -72, 123);
			}
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i ^ 0xffffffff); i_3_++) {
				int i_4_ = is[i_0_ + i_3_] & 0xff;
				if ((i_4_ ^ 0xffffffff) != -1) {
					if ((i_4_ ^ 0xffffffff) <= -129 && i_4_ < 160) {
						int i_5_ = Class65.aCharArray497[-128 + i_4_];
						if (i_5_ == 0) {
							i_5_ = 63;
						}
						i_4_ = i_5_;
					}
					cs[i_2_++] = (char) i_4_;
				}
			}
			return new String(cs, 0, i_2_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("dh.A(" + i + ',' + i_0_ + ',' + i_1_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1547(final int i) {
		try {
			anInt5974 = (aClass35_5971.anInt330);
			anInt5978 = (aClass35_5971.anInt337);
			anInt5972 = (aClass35_5971.anInt331);
			if ((aClass35_5971.aClass111_334) != null) {
				aClass35_5971.aClass111_334.method2099(
						(aClass66_5973.anInt506), (aClass66_5973.anInt511),
						(aClass66_5973.anInt505), Class210.anIntArray3329);
			}
			anInt5977 = Class210.anIntArray3329[2];
			anInt5976 = Class210.anIntArray3329[0];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dh.D(" + i + ')');
		}
	}

	static final void method1548(final int i, final int i_7_, final int i_8_,
			final int i_9_, final byte i_10_, final int i_11_, final int i_12_) {
		try {
			if (i_10_ != -78) {
				anIntArray5980 = null;
			}
			Class64_Sub28.anInt3717 = i_12_;
			Class64_Sub6.anInt3655 = i_9_;
			Class287_Sub2.anInt3274 = i;
			Class356.anInt3025 = i_8_;
			Class137.anInt1079 = i_11_;
			Class98_Sub42.anInt4239 = i_7_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dh.E(" + i + ','
					+ i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ','
					+ i_11_ + ',' + i_12_ + ')'));
		}
	}

	public static void method1549(final byte i) {
		try {
			anIntArray5980 = null;
			if (i == -112) {
				aClass58_5975 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dh.C(" + i + ')');
		}
	}

	static final Class197 method1550(final int i, final int i_13_,
			final ha var_ha) {
		try {
			if (i_13_ != 18361) {
				method1550(59, 118, null);
			}
			final Class244 class244 = Class114
					.method2151(i, true, var_ha, true);
			if (class244 == null) {
				return null;
			}
			return class244.aClass197_1858;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dh.B(" + i + ','
					+ i_13_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	Class98_Sub46_Sub6(final SurfaceSkin surfaceSkin, final Class246_Sub5 class246_sub5) {
		try {
			aClass35_5971 = surfaceSkin;
			aClass66_5973 = aClass35_5971.method331((byte) 93);
			method1547(-102);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dh.<init>("
					+ (surfaceSkin != null ? "{...}" : "null") + ','
					+ (class246_sub5 != null ? "{...}" : "null") + ')'));
		}
	}
}
