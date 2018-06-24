/* Class64_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub19 extends Class64 {
	static short aShort3692;
	static int anInt3693 = 0;

	final int method630(final byte i) {
		try {
			if (i < 119) {
				method551((byte) -70);
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ra.E(" + i + ')');
		}
	}

	@Override
	final void method550(final int i, final int i_0_) {
		try {
			((Class64) this).anInt494 = i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ra.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final boolean method631(final int i, final int i_2_, final int i_3_) {
		try {
			if (i_3_ != -2) {
				return true;
			}
			return (s_Sub1.method3433(i_2_, i_3_ ^ ~0x3de8, i) & za_Sub2
					.method1682(i_2_, 0, i));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ra.G(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				return -63;
			}
			return 3;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ra.A(" + i + ')');
		}
	}

	Class64_Sub19(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	Class64_Sub19(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	@Override
	final int method556(final int i, final int i_4_) {
		try {
			if (i_4_ != 29053) {
				method550(-113, 77);
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ra.F(" + i + ','
					+ i_4_ + ')');
		}
	}

	static final void method632(final int i, final int i_5_, final byte i_6_,
			final int i_7_, final int i_8_, final int i_9_, final int i_10_) {
		do {
			try {
				if ((Class76_Sub8.anInt3778 ^ 0xffffffff) >= (i_8_ ^ 0xffffffff)
						&& Class3.anInt77 >= i_5_
						&& (i_9_ ^ 0xffffffff) <= (Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff)
						&& Class218.anInt1635 >= i_10_) {
					if ((i_7_ ^ 0xffffffff) == -2) {
						Class64_Sub3.method565(i_9_, i_10_, i_5_, i_8_, i,
								-10194);
					} else {
						Class98_Sub26.method1279(i_9_, i_5_, i_7_, i, i_10_,
								i_8_, true);
					}
				} else if ((i_7_ ^ 0xffffffff) != -2) {
					Class98_Sub10_Sub19.method1059(false, i_8_, i, i_9_, i_7_,
							i_5_, i_10_);
				} else {
					RuntimeException_Sub1.method4010(-31085, i_10_, i_8_, i_9_,
							i_5_, i);
				}
				if (i_6_ == -51) {
					break;
				}
				aShort3692 = (short) 74;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ra.D(" + i
						+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_
						+ ',' + i_9_ + ',' + i_10_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method551(final byte i) {
		try {
			if (i < 118) {
				method632(5, 122, (byte) 12, -14, -80, 53, -39);
			}
			if (((Class64) this).anInt494 < 0
					|| (((Class64) this).anInt494 ^ 0xffffffff) < -5) {
				((Class64) this).anInt494 = method552(0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ra.C(" + i + ')');
		}
	}

	static {
		aShort3692 = (short) 256;
	}
}
