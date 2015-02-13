/* Class64_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;

final class Class64_Sub23 extends Class64 {
	static Class370 aClass370_3707;
	static int anInt3708;

	static final Class98_Sub32 method646(final int i, final int i_0_,
			final Canvas canvas, final byte i_1_) {
		try {
			try {
				final Class var_class = Class.forName("Class98_Sub32_Sub2");
				final Class98_Sub32 class98_sub32 = (Class98_Sub32) var_class
						.newInstance();
				class98_sub32.method1441(i, i_0_, 4095, canvas);
				if (i_1_ >= -28) {
					anInt3708 = 90;
				}
				return class98_sub32;
			} catch (final Throwable throwable) {
				final Class98_Sub32_Sub1 class98_sub32_sub1 = new Class98_Sub32_Sub1();
				class98_sub32_sub1.method1441(i, i_0_, 4095, canvas);
				return class98_sub32_sub1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("saa.H(" + i + ','
					+ i_0_ + ',' + (canvas != null ? "{...}" : "null") + ','
					+ i_1_ + ')'));
		}
	}

	final boolean method647(final int i) {
		try {
			if (!Class144.method2311(false,
					((Class64) this).aClass98_Sub27_495.aClass64_Sub8_4042
							.method583((byte) 127))) {
				return false;
			}
			if (i != -1) {
				method649(78);
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "saa.G(" + i + ')');
		}
	}

	@Override
	final void method550(final int i, final int i_2_) {
		try {
			((Class64) this).anInt494 = i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "saa.B(" + i + ','
					+ i_2_ + ')');
		}
	}

	Class64_Sub23(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	@Override
	final void method551(final byte i) {
		try {
			if (i < 118) {
				aClass370_3707 = null;
			}
			if (((Class64) this).aClass98_Sub27_495.aClass64_Sub8_4042
					.method586(true)
					&& !Class144
							.method2311(
									false,
									((Class64) this).aClass98_Sub27_495.aClass64_Sub8_4042
											.method583((byte) 120))) {
				((Class64) this).anInt494 = 0;
			}
			if ((((Class64) this).anInt494 ^ 0xffffffff) > -1
					|| ((Class64) this).anInt494 > 2) {
				((Class64) this).anInt494 = method552(0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "saa.C(" + i + ')');
		}
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				return 77;
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "saa.A(" + i + ')');
		}
	}

	final int method648(final byte i) {
		try {
			if (i < 119) {
				return -112;
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "saa.E(" + i + ')');
		}
	}

	Class64_Sub23(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	public static void method649(final int i) {
		do {
			try {
				aClass370_3707 = null;
				if (i < -50) {
					break;
				}
				method646(76, 110, null, (byte) -57);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "saa.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final int method556(final int i, final int i_4_) {
		try {
			if (i_4_ != 29053) {
				method551((byte) -94);
			}
			if (!Class144.method2311(false,
					((Class64) this).aClass98_Sub27_495.aClass64_Sub8_4042
							.method583((byte) 125))) {
				return 3;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "saa.F(" + i + ','
					+ i_4_ + ')');
		}
	}
}
