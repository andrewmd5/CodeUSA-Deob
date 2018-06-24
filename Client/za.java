/* za - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class za extends Node {
	static Class63 aClass63_4296 = new Class63();

	public za() {
		/* empty */
	}

	static final int method1674(final int i, final int i_0_) {
		try {
			if (i != -1035933944) {
				return -95;
			}
			return i_0_ >>> -1035933944;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "za.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method1675(final int i, final int i_1_, final int i_2_,
			final int i_3_, final int i_4_, final int i_5_, final int i_6_,
			final byte i_7_) {
		try {
			if (i_2_ == i) {
				Class267.method3247(i_3_, i_6_, i_5_, i_4_, i, i_1_, 1333849452);
			} else {
				if (-i + i_5_ >= Class76_Sub8.anInt3778
						&& i_5_ + i <= Class3.anInt77
						&& ((Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff) >= (i_3_
								+ -i_2_ ^ 0xffffffff))
						&& i_3_ + i_2_ <= Class218.anInt1635) {
					Class64_Sub18.method624(i_6_, -2211, i_5_, i_1_, i, i_3_,
							i_4_, i_2_);
				} else {
					Class48_Sub2_Sub1.method473(i_3_, i_1_, i_5_, i_2_, i_4_,
							i, -25682, i_6_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("za.A(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_
					+ ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	public static void method1676(final int i) {
		try {
			aClass63_4296 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "za.C(" + i + ')');
		}
	}
}
