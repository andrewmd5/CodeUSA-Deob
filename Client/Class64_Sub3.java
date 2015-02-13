/* Class64_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub3 extends Class64 {
	static int anInt3646;
	static int anInt3647 = -1;
	static Class207 aClass207_3648;

	final int method564(final byte i) {
		try {
			if (i < 119) {
				anInt3646 = 36;
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "be.E(" + i + ')');
		}
	}

	Class64_Sub3(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	static final void method565(int i, int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_) {
		try {
			Class333.method3761(i_3_,
					AnimationDefinition.anIntArrayArray814[i++], i_2_, i_1_,
					(byte) -123);
			Class333.method3761(i_3_,
					AnimationDefinition.anIntArrayArray814[i_0_--], i_2_, i_1_,
					(byte) 125);
			if (i_4_ != -10194) {
				anInt3647 = 18;
			}
			for (int i_5_ = i; (i_5_ ^ 0xffffffff) >= (i_0_ ^ 0xffffffff); i_5_++) {
				final int[] is = AnimationDefinition.anIntArrayArray814[i_5_];
				is[i_2_] = is[i_1_] = i_3_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("be.G(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
							+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	Class64_Sub3(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				aClass207_3648 = null;
			}
			if ((((Class64) this).aClass98_Sub27_495.method1286((byte) 104) != s_Sub1.aClass279_5197)
					|| !((Class64) this).aClass98_Sub27_495
							.method1291((byte) 104)) {
				return 1;
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "be.A(" + i + ')');
		}
	}

	@Override
	final int method556(final int i, final int i_6_) {
		try {
			if (i_6_ != 29053) {
				anInt3647 = -23;
			}
			return 3;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "be.F(" + i + ','
					+ i_6_ + ')');
		}
	}

	@Override
	final void method550(final int i, final int i_7_) {
		try {
			((Class64) this).anInt494 = i_7_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "be.B(" + i + ','
					+ i_7_ + ')');
		}
	}

	@Override
	final void method551(final byte i) {
		do {
			try {
				((Class64) this).anInt494 = method552(0);
				if (i >= 118) {
					break;
				}
				method565(-59, 53, -54, 62, 98, 89);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "be.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method566(final int i) {
		try {
			if (i == -3623) {
				aClass207_3648 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "be.D(" + i + ')');
		}
	}

	static {
		anInt3646 = -1;
	}
}
