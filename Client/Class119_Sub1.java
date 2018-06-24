/* Class119_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class119_Sub1 extends Class119 {
	static int anInt4716;
	private int anInt4717;
	static Class154 aClass154_4718;
	private int anInt4719;
	private int anInt4720;
	private int anInt4721;

	static final void method2180(final int i, final int i_0_) {
		try {
			if (i_0_ != 15233) {
				method2181(false);
			}
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i, -103, 1);
			class98_sub46_sub17.method1621(0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "bp.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method2181(final boolean bool) {
		do {
			try {
				aClass154_4718 = null;
				if (bool == true) {
					break;
				}
				anInt4716 = 12;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "bp.A(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final Class197 method2182(final Class207 class207,
			final boolean bool, final int i) {
		try {
			final byte[] is = class207.method2733(i, -96);
			if (is == null) {
				return null;
			}
			if (bool != true) {
				method2181(false);
			}
			return new Class197(is);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("bp.D("
					+ (class207 != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ')'));
		}
	}

	@Override
	final void method2174(final int i, final int i_1_, final int i_2_) {
		do {
			try {
				if (i_2_ == -5515) {
					break;
				}
				anInt4716 = 29;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("bp.C(" + i
						+ ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	Class119_Sub1(final int i, final int i_3_, final int i_4_, final int i_5_,
			final int i_6_, final int i_7_) {
		super(-1, i_6_, i_7_);
		try {
			anInt4721 = i;
			anInt4719 = i_4_;
			anInt4720 = i_5_;
			anInt4717 = i_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("bp.<init>(" + i
					+ ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ','
					+ i_7_ + ')'));
		}
	}

	@Override
	final void method2179(final byte i, final int i_8_, final int i_9_) {
		try {
			final int i_11_ = i_9_ * anInt4721 >> 611692;
			final int i_12_ = i_9_ * anInt4719 >> -1503457972;
			final int i_13_ = anInt4717 * i_8_ >> -1908682836;
			final int i_14_ = anInt4720 * i_8_ >> 243200236;
			InputStream_Sub2.method125(i_12_, ((Class119) this).anInt985,
					i_14_, i_13_, i_11_, 21597);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("bp.E(" + i + ','
					+ i_8_ + ',' + i_9_ + ')'));
		}
	}

	@Override
	final void method2178(final int i, final int i_15_, final int i_16_) {
		try {
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("bp.B(" + i + ','
					+ i_15_ + ',' + i_16_ + ')'));
		}
	}
}
