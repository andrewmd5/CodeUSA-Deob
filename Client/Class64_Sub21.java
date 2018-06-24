/* Class64_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub21 extends Class64 {
	static int anInt3700 = 0;
	static int[] skillLevels = new int[25];
	static int anInt3702;
	static Class148 aClass148_3703;
	static int anInt3704 = 1407;

	public static void method638(final int i) {
		do {
			try {
				skillLevels = null;
				aClass148_3703 = null;
				if (i == 4) {
					break;
				}
				method638(3);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "rha.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method550(final int i, final int i_0_) {
		try {
			((Class64) this).anInt494 = i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rha.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	@Override
	final void method551(final byte i) {
		try {
			if (((Class64) this).anInt494 < 0 && ((Class64) this).anInt494 > 4) {
				((Class64) this).anInt494 = method552(0);
			}
			if (i < 118) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rha.C(" + i + ')');
		}
	}

	final int method639(final byte i) {
		try {
			if (i < 119) {
				method639((byte) 43);
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rha.E(" + i + ')');
		}
	}

	Class64_Sub21(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	Class64_Sub21(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				anInt3700 = 51;
			}
			if (((Class64) this).aClass98_Sub27_495.method1289(-108)
					.method2319(32755) > 1) {
				return 4;
			}
			return 2;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rha.A(" + i + ')');
		}
	}

	@Override
	final int method556(final int i, final int i_2_) {
		try {
			if (i_2_ != 29053) {
				anInt3704 = -17;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rha.F(" + i + ','
					+ i_2_ + ')');
		}
	}

	static {
		anInt3702 = 0;
		aClass148_3703 = new Class148();
	}
}
