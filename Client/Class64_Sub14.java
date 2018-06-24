/* Class64_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub14 extends Class64 {
	static Class332[] aClass332Array3675;

	Class64_Sub14(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	final boolean method607(final int i) {
		try {
			if (i != -1) {
				aClass332Array3675 = null;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ju.G(" + i + ')');
		}
	}

	@Override
	final int method556(final int i, final int i_0_) {
		try {
			if ((i ^ 0xffffffff) == -1
					|| ((Class64) this).aClass98_Sub27_495.aClass64_Sub25_4039
							.method655((byte) 126) == 1) {
				return 1;
			}
			if (i_0_ != 29053) {
				aClass332Array3675 = null;
			}
			return 2;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ju.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	@Override
	final void method551(final byte i) {
		try {
			if (i <= 118) {
				aClass332Array3675 = null;
			}
			if ((((Class64) this).anInt494 ^ 0xffffffff) != -1
					&& ((Class64) this).aClass98_Sub27_495.aClass64_Sub25_4039
							.method655((byte) 122) != 1) {
				((Class64) this).anInt494 = 0;
			}
			if (((Class64) this).anInt494 < 0
					|| (((Class64) this).anInt494 ^ 0xffffffff) < -2) {
				((Class64) this).anInt494 = method552(0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ju.C(" + i + ')');
		}
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				return 81;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ju.A(" + i + ')');
		}
	}

	public static void method608(final int i) {
		do {
			try {
				aClass332Array3675 = null;
				if (i < -90) {
					break;
				}
				method608(69);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ju.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final int method609(final byte i) {
		try {
			if (i < 119) {
				aClass332Array3675 = null;
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ju.E(" + i + ')');
		}
	}

	@Override
	final void method550(final int i, final int i_1_) {
		try {
			((Class64) this).anInt494 = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ju.B(" + i + ','
					+ i_1_ + ')');
		}
	}

	Class64_Sub14(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}
}
