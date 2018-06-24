/* Class64_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub4 extends Class64 {
	static Class204 aClass204_3649 = new Class204();

	@Override
	final int method556(final int i, final int i_0_) {
		try {
			if (i_0_ != 29053) {
				aClass204_3649 = null;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "cq.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				aClass204_3649 = null;
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "cq.A(" + i + ')');
		}
	}

	Class64_Sub4(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	@Override
	final void method550(final int i, final int i_1_) {
		try {
			((Class64) this).anInt494 = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "cq.B(" + i + ','
					+ i_1_ + ')');
		}
	}

	public static void method567(final byte i) {
		do {
			try {
				aClass204_3649 = null;
				if (i == 81) {
					break;
				}
				method567((byte) 73);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "cq.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final int method568(final byte i) {
		try {
			if (i < 119) {
				aClass204_3649 = null;
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "cq.E(" + i + ')');
		}
	}

	@Override
	final void method551(final byte i) {
		try {
			if (i < 118) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "cq.C(" + i + ')');
		}
	}

	Class64_Sub4(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}
}
