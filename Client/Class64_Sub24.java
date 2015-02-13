/* Class64_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub24 extends Class64 {
	static Object anObject3709;
	static boolean aBoolean3710 = false;

	public static void method650(final int i) {
		try {
			anObject3709 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.G(" + i + ')');
		}
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				return -68;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.A(" + i + ')');
		}
	}

	Class64_Sub24(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	Class64_Sub24(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	@Override
	final void method550(final int i, final int i_1_) {
		try {
			((Class64) this).anInt494 = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.B(" + i + ','
					+ i_1_ + ')');
		}
	}

	final int method651(final byte i) {
		try {
			if (i <= 119) {
				anObject3709 = null;
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.E(" + i + ')');
		}
	}

	@Override
	final int method556(final int i, final int i_3_) {
		try {
			if (i_3_ != 29053) {
				return -97;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.F(" + i + ','
					+ i_3_ + ')');
		}
	}

	static final int method652(final int i, final int i_4_) {
		try {
			if (i_4_ <= 66) {
				return 62;
			}
			if (i == 16711935) {
				return -1;
			}
			return Class38.method348(i, -24);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.D(" + i + ','
					+ i_4_ + ')');
		}
	}

	@Override
	final void method551(final byte i) {
		try {
			if (((Class64) this).aClass98_Sub27_495.method1286((byte) 104) == Class64_Sub2.aClass279_3643) {
				((Class64) this).anInt494 = 2;
			}
			if (i >= 118) {
				if ((((Class64) this).anInt494 ^ 0xffffffff) > -1
						|| ((Class64) this).anInt494 > 2) {
					((Class64) this).anInt494 = method552(0);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uga.C(" + i + ')');
		}
	}
}
