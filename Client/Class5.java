/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class5 implements Interface18 {
	private Class207 aClass207_3437;
	private Class332 aClass332_3438;
	static int anInt3439;
	static String aString3440;
	private Class367 aClass367_3441;

	@Override
	public final void method58(final byte i) {
		try {
			if (i == -43) {
				aClass332_3438 = Class237_Sub1.method2915(
						(aClass367_3441.anInt3544), aClass207_3437, (byte) -89);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "af.C(" + i + ')');
		}
	}

	@Override
	public final boolean method59(final int i) {
		try {
			if (i != 14017) {
				aClass207_3437 = null;
			}
			return aClass207_3437.method2742(-77, aClass367_3441.anInt3544);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "af.A(" + i + ')');
		}
	}

	static final boolean method176(final int i, final int i_0_, final int i_1_) {
		try {
			if (i != 24578) {
				method176(-22, 97, 98);
			}
			if ((i_0_ & 0x800 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("af.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method177(final int i) {
		try {
			if (i != 7681) {
				method176(-63, 99, -33);
			}
			aString3440 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "af.E(" + i + ')');
		}
	}

	static final int method178(final Class128 class128, final int i) {
		try {
			if (i != 0) {
				method178(null, 3);
			}
			if (class128 == Class288.aClass128_3381) {
				return 7681;
			}
			if (Class249.aClass128_1903 != class128) {
				if (Class323.aClass128_2715 != class128) {
					if (class128 == Class1.aClass128_64) {
						return 260;
					}
					if (Class28.aClass128_286 == class128) {
						return 34023;
					}
				} else {
					return 34165;
				}
			} else {
				return 8448;
			}
			throw new IllegalArgumentException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("af.D("
					+ (class128 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	public final void method60(final boolean bool, final byte i) {
		try {
			if (bool) {
				final int i_2_ = (((Class39_Sub1.anInt3593 ^ 0xffffffff) < (Class98_Sub17_Sub1.anInt5782 ^ 0xffffffff)) ? Class39_Sub1.anInt3593
						: Class98_Sub17_Sub1.anInt5782);
				final int i_3_ = (Class246_Sub2.anInt5072 >= Class98_Sub25.anInt4024 ? Class246_Sub2.anInt5072
						: Class98_Sub25.anInt4024);
				final int i_4_ = aClass332_3438.method3737();
				final int i_5_ = aClass332_3438.method3749();
				int i_6_ = 0;
				int i_7_ = i_2_;
				int i_8_ = i_2_ * i_5_ / i_4_;
				int i_9_ = (i_3_ - i_8_) / 2;
				if ((i_3_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
					i_7_ = i_4_ * i_3_ / i_5_;
					i_9_ = 0;
					i_8_ = i_3_;
					i_6_ = (-i_7_ + i_2_) / 2;
				}
				aClass332_3438.method3726(i_6_, i_9_, i_7_, i_8_);
			}
			if (i >= -81) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "af.B(" + bool
					+ ',' + i + ')');
		}
	}

	Class5(final Class207 class207, final Class367 class367) {
		try {
			aClass367_3441 = class367;
			aClass207_3437 = class207;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("af.<init>("
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class367 != null ? "{...}" : "null") + ')'));
		}
	}
}
