/* Class246_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub3_Sub1 extends Class246_Sub3 {
	static OutgoingOpcode aClass171_6148 = new OutgoingOpcode(61, -1);
	short aShort6149;
	static Class121 aClass121_6150;

	@Override
	final int method2980(final int i, final Class98_Sub5[] class98_sub5s) {
		try {
			return method2989(
					(((Class246_Sub3) this).anInt5084 >> Class151_Sub8.anInt5015),
					false,
					class98_sub5s,
					(((Class246_Sub3) this).anInt5079 >> Class151_Sub8.anInt5015));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hc.GA(" + i + ','
					+ (class98_sub5s != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final boolean method2977(final ha var_ha, final byte i) {
		try {
			if (i != 77) {
				return true;
			}
			return Class76_Sub5
					.method758(
							(byte) 62,
							((Class246_Sub3) this).aByte5081,
							(((Class246_Sub3) this).anInt5079 >> Class151_Sub8.anInt5015),
							(((Class246_Sub3) this).anInt5084 >> Class151_Sub8.anInt5015));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hc.AA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method2993(final int i) {
		try {
			aClass171_6148 = null;
			if (i == 288450632) {
				aClass121_6150 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hc.F(" + i + ')');
		}
	}

	static final void method2994(final int i, int i_1_, final byte i_2_,
			final int i_3_) {
		try {
			i_1_ = (i_1_
					* Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4069
							.method641((byte) 126) >> 288450632);
			if (i_2_ != -83) {
				method2995(-90, 54, -126, null, null);
			}
			do {
				if ((i ^ 0xffffffff) == 0 && !Class151_Sub5.aBoolean4991) {
					Class337_Sub1.method3777(31585);
					if (!client.aBoolean3553) {
						break;
					}
				}
				if ((i ^ 0xffffffff) != 0
						&& ((Class144.anInt1169 ^ 0xffffffff) != (i ^ 0xffffffff) || !Class8
								.method188(false)) && i_1_ != 0
						&& !Class151_Sub5.aBoolean4991) {
					Class64_Sub29.method674(i_1_, 0, i,
							Class98_Sub10_Sub1.aClass207_5544, i_3_, false,
							(byte) -86);
					Class233.method2883((byte) 111);
				}
			} while (false);
			if ((Class144.anInt1169 ^ 0xffffffff) != (i ^ 0xffffffff)) {
				Class151_Sub8.aClass98_Sub31_Sub2_5013 = null;
			}
			Class144.anInt1169 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hc.D(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	Class246_Sub3_Sub1(final int i, final int i_4_, final int i_5_,
			final int i_6_, final int i_7_, final int i_8_) {
		try {
			aShort6149 = (short) i_8_;
			((Class246_Sub3) this).anInt5084 = i;
			((Class246_Sub3) this).aByte5081 = (byte) i_7_;
			((Class246_Sub3) this).aByte5088 = (byte) i_6_;
			((Class246_Sub3) this).anInt5089 = i_4_;
			((Class246_Sub3) this).anInt5079 = i_5_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hc.<init>(" + i
					+ ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ','
					+ i_8_ + ')'));
		}
	}

	@Override
	final boolean method2991(final boolean bool) {
		try {
			if (bool != false) {
				aClass171_6148 = null;
			}
			return (Class74.aBooleanArrayArray551[(Class259.anInt1959
					+ (((Class246_Sub3) this).anInt5084 >> Class151_Sub8.anInt5015) - Class241.anInt1845)][(-Class64_Sub26.anInt3714
					+ (((Class246_Sub3) this).anInt5079 >> Class151_Sub8.anInt5015) + Class259.anInt1959)]);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hc.FA(" + bool
					+ ')');
		}
	}

	static final void method2995(final int i, final int i_9_, final int i_10_,
			final Class246_Sub3_Sub5 class246_sub3_sub5,
			final Class246_Sub3_Sub5 class246_sub3_sub5_11_) {
		final Class172 class172 = Class100.method1693(i, i_9_, i_10_);
		if (class172 != null) {
			class172.aClass246_Sub3_Sub5_1334 = class246_sub3_sub5;
			class172.aClass246_Sub3_Sub5_1326 = class246_sub3_sub5_11_;
			final int i_12_ = Class78.aSArray594 == Class81.aSArray618 ? 1 : 0;
			if (class246_sub3_sub5.method2978(-124)) {
				if (class246_sub3_sub5.method2987(6540)) {
					((Class246_Sub3) class246_sub3_sub5).aClass246_Sub3_5090 = Class359.aClass246_Sub3Array3056[i_12_];
					Class359.aClass246_Sub3Array3056[i_12_] = class246_sub3_sub5;
				} else {
					((Class246_Sub3) class246_sub3_sub5).aClass246_Sub3_5090 = Class379.aClass246_Sub3Array3198[i_12_];
					Class379.aClass246_Sub3Array3198[i_12_] = class246_sub3_sub5;
					Class358.aBoolean3033 = true;
				}
			} else {
				((Class246_Sub3) class246_sub3_sub5).aClass246_Sub3_5090 = Class130.aClass246_Sub3Array1029[i_12_];
				Class130.aClass246_Sub3Array1029[i_12_] = class246_sub3_sub5;
			}
			if (class246_sub3_sub5_11_ != null) {
				if (class246_sub3_sub5_11_.method2978(-7)) {
					if (class246_sub3_sub5_11_.method2987(6540)) {
						((Class246_Sub3) class246_sub3_sub5_11_).aClass246_Sub3_5090 = Class359.aClass246_Sub3Array3056[i_12_];
						Class359.aClass246_Sub3Array3056[i_12_] = class246_sub3_sub5_11_;
					} else {
						((Class246_Sub3) class246_sub3_sub5_11_).aClass246_Sub3_5090 = Class379.aClass246_Sub3Array3198[i_12_];
						Class379.aClass246_Sub3Array3198[i_12_] = class246_sub3_sub5_11_;
						Class358.aBoolean3033 = true;
					}
				} else {
					((Class246_Sub3) class246_sub3_sub5_11_).aClass246_Sub3_5090 = Class130.aClass246_Sub3Array1029[i_12_];
					Class130.aClass246_Sub3Array1029[i_12_] = class246_sub3_sub5_11_;
				}
			}
		}
	}
}
