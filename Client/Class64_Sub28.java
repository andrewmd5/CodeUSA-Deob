/* Class64_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub28 extends Class64 {
	static int anInt3717;
	static int[][] anIntArrayArray3718 = { { 0, 2 }, { 0, 2 }, { 0, 0, 2 },
			{ 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 },
			{ 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 },
			{ 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 },
			{ 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
	static int[][] anIntArrayArray3719;

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				method551((byte) 106);
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vp.A(" + i + ')');
		}
	}

	Class64_Sub28(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	@Override
	final void method550(final int i, final int i_0_) {
		try {
			((Class64) this).anInt494 = i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vp.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	final int method668(final byte i) {
		try {
			if (i < 119) {
				return 12;
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vp.E(" + i + ')');
		}
	}

	static final Class98_Sub3 method669(final int i, final boolean bool,
			final int i_2_) {
		try {
			if (i_2_ != 6) {
				anIntArrayArray3719 = null;
			}
			final long l = (!bool ? 0 : -2147483648) | i;
			return (Class98_Sub3) Class142.aClass377_1157.method3990(l, -1);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vp.H(" + i + ','
					+ bool + ',' + i_2_ + ')'));
		}
	}

	static final boolean method670(final int i, final int i_3_, final int i_4_) {
		try {
			if (i_3_ != -12294) {
				anIntArrayArray3719 = null;
			}
			return ((Class151_Sub2.method2451(i, 544, i_4_) | (i & 0x2000) != 0 | Class246_Sub1
					.method2967(i_4_, i, (byte) 91)) & Class246_Sub3_Sub5_Sub2
					.method3096(-27984, i_4_, i));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vp.I(" + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	final boolean method671(final int i) {
		try {
			if (i != -1) {
				method551((byte) 19);
			}
			if (((Class64) this).aClass98_Sub27_495.method1291((byte) 109)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vp.G(" + i + ')');
		}
	}

	Class64_Sub28(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	@Override
	final void method551(final byte i) {
		do {
			try {
				if (((Class64) this).aClass98_Sub27_495.method1291((byte) 118)) {
					((Class64) this).anInt494 = 0;
				}
				if (i <= 118) {
					anIntArrayArray3719 = null;
				}
				if (((Class64) this).anInt494 >= 0
						|| (((Class64) this).anInt494 ^ 0xffffffff) >= -3) {
					break;
				}
				((Class64) this).anInt494 = method552(0);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "vp.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final int method556(final int i, final int i_5_) {
		try {
			if (((Class64) this).aClass98_Sub27_495.method1291((byte) 113)) {
				return 3;
			}
			if ((i ^ 0xffffffff) == -1
					|| (((Class64) this).aClass98_Sub27_495.aClass64_Sub25_4039
							.method655((byte) 121) ^ 0xffffffff) == -2) {
				return 1;
			}
			if (i_5_ != 29053) {
				method551((byte) -65);
			}
			return 2;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vp.F(" + i + ','
					+ i_5_ + ')');
		}
	}

	public static void method672(final int i) {
		do {
			try {
				anIntArrayArray3718 = null;
				anIntArrayArray3719 = null;
				if (i == 8192) {
					break;
				}
				anIntArrayArray3719 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "vp.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
