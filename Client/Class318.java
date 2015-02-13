/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318 {
	static Class123 aClass123_2698;

	public static void method3655(final boolean bool) {
		try {
			if (bool == true) {
				aClass123_2698 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tk.B(" + bool
					+ ')');
		}
	}

	static final void method3656(final int i, int i_0_, final byte i_1_,
			int i_2_, final int i_3_) {
		try {
			if (i_3_ >= Class98_Sub10_Sub38.anInt5753
					&& Class218.anInt1635 >= i_3_) {
				i_0_ = Class263.method3219(false, Class3.anInt77,
						Class76_Sub8.anInt3778, i_0_);
				i_2_ = Class263.method3219(false, Class3.anInt77,
						Class76_Sub8.anInt3778, i_2_);
				Class160.method2513((byte) -125, i, i_0_, i_2_, i_3_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tk.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method3657(final byte i) {
		try {
			Class69_Sub2.aClass79_5334.method794(77);
			Class64_Sub5.aClass79_3650.method794(119);
			Class76_Sub11.aClass79_3797.method794(47);
			if (i > -20) {
				method3655(true);
			}
			Class151_Sub7.aClass79_5004.method794(108);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tk.A(" + i + ')');
		}
	}
}
