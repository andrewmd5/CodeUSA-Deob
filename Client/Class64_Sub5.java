/* Class64_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub5 extends Class64 {
	static Class79 aClass79_3650 = new Class79(50);
	static float[] aFloatArray3651 = new float[16384];
	static int[] anIntArray3652;
	static float[] aFloatArray3653 = new float[16384];
	static int anInt3654;

	@Override
	final void method551(final byte i) {
		do {
			try {
				if (((Class64) this).aClass98_Sub27_495.aClass64_Sub8_4042
						.method586(true)
						&& !Class144
								.method2311(
										false,
										(((Class64) this).aClass98_Sub27_495).aClass64_Sub8_4042
												.method583((byte) 124))) {
					((Class64) this).anInt494 = 0;
				}
				if ((((Class64) this).anInt494 ^ 0xffffffff) > -1
						|| ((Class64) this).anInt494 > 1) {
					((Class64) this).anInt494 = method552(0);
				}
				if (i > 118) {
					break;
				}
				aClass79_3650 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "dda.C(" + i
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
			throw Class64_Sub27.method667(runtimeexception, "dda.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				method556(-22, 33);
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dda.A(" + i + ')');
		}
	}

	Class64_Sub5(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	@Override
	final int method556(final int i, final int i_2_) {
		try {
			if (!Class144.method2311(false,
					((Class64) this).aClass98_Sub27_495.aClass64_Sub8_4042
							.method583((byte) 125))) {
				return 3;
			}
			if (i_2_ != 29053) {
				anIntArray3652 = null;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dda.F(" + i + ','
					+ i_2_ + ')');
		}
	}

	Class64_Sub5(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	public static void method569(final boolean bool) {
		try {
			anIntArray3652 = null;
			if (bool != true) {
				method569(true);
			}
			aFloatArray3651 = null;
			aFloatArray3653 = null;
			aClass79_3650 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dda.D(" + bool
					+ ')');
		}
	}

	final int method570(final byte i) {
		try {
			if (i <= 119) {
				return -44;
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dda.E(" + i + ')');
		}
	}

	final boolean method571(final int i) {
		try {
			if (i != -1) {
				return false;
			}
			if (!Class144.method2311(false,
					((Class64) this).aClass98_Sub27_495.aClass64_Sub8_4042
							.method583((byte) 124))) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dda.G(" + i + ')');
		}
	}

	static {
		final double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray3651[i] = (float) Math.sin(i * d);
			aFloatArray3653[i] = (float) Math.cos(i * d);
		}
	}
}
