/* Class98_Sub10_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub18 extends Class98_Sub10 {
	static int anInt5626;
	static long aLong5627 = 0L;

	static final boolean method1054(final int i) {
		try {
			if (Class76_Sub7.aBoolean3761) {
				try {
					if (((Boolean) Class203.method2704("showingVideoAd",
							Class76_Sub11.anApplet3799, -26978)).booleanValue()) {
						return false;
					}
					return true;
				} catch (final Throwable throwable) {
					/* empty */
				}
			}
			if (i <= 67) {
				anInt5626 = 88;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ll.D(" + i + ')');
		}
	}

	static final boolean method1055(final int i, final int i_0_, final byte i_1_) {
		try {
			if (i_1_ != -11) {
				aLong5627 = -40L;
			}
			if (!(Class373_Sub2.method3974(i_0_, i, i_1_ + -101) | (0x70000 & i ^ 0xffffffff) != -1)
					&& !Class76_Sub7.method763(i, i_0_, false)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ll.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method1056(final byte i, final int i_2_) {
		try {
			if (i == 97) {
				final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
						.method2628(i_2_, i ^ ~0x59, 7);
				class98_sub46_sub17.method1621(0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ll.B(" + i + ','
					+ i_2_ + ')');
		}
	}

	@Override
	final int[] method990(final int i, final int i_3_) {
		try {
			if (i != 255) {
				aLong5627 = -124L;
			}
			return Class64_Sub1.anIntArray3640;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ll.G(" + i + ','
					+ i_3_ + ')');
		}
	}

	public Class98_Sub10_Sub18() {
		super(0, true);
	}
}
