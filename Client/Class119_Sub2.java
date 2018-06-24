/* Class119_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class119_Sub2 extends Class119 {
	private int anInt4722;
	private int anInt4723;
	private int anInt4724;
	private int anInt4725;
	static Class207 aClass207_4726;
	static int[] anIntArray4727 = new int[500];

	private static final void method2183(final int i, final int i_0_,
			final int i_1_, final int i_2_, final int i_3_, final int i_4_,
			final int i_5_, final int i_6_) {
		try {
			do {
				if ((i_2_ ^ 0xffffffff) <= (Class76_Sub8.anInt3778 ^ 0xffffffff)
						&& (Class3.anInt77 ^ 0xffffffff) <= (i_0_ ^ 0xffffffff)
						&& (i_6_ ^ 0xffffffff) <= (Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff)
						&& Class218.anInt1635 >= i_4_) {
					Class48_Sub1.method455(i_3_, i_5_, i_0_, i_2_, false, i_6_,
							i_4_, i_1_);
					if (!client.aBoolean3553) {
						break;
					}
				}
				r.method1641(i_3_, i_4_, i_2_, i_5_, i_0_, -18907, i_6_, i_1_);
			} while (false);
			if (i != 1701353708) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lc.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	public static void method2184(final byte i) {
		try {
			aClass207_4726 = null;
			if (i != 72) {
				method2184((byte) 50);
			}
			anIntArray4727 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lc.D(" + i + ')');
		}
	}

	@Override
	final void method2178(final int i, final int i_7_, final int i_8_) {
		try {
			final int i_10_ = anInt4724 * i_7_ >> 1701353708;
			final int i_11_ = anInt4722 * i_7_ >> 310827276;
			final int i_12_ = i_8_ * anInt4725 >> -526500468;
			final int i_13_ = i_8_ * anInt4723 >> -968048116;
			Class119.method2177(((Class119) this).anInt988, i_13_, -80, i_11_,
					i_10_, i_12_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lc.B(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	@Override
	final void method2179(final byte i, final int i_14_, final int i_15_) {
		try {
			final int i_17_ = i_15_ * anInt4724 >> -1259702804;
			final int i_18_ = i_15_ * anInt4722 >> -611555860;
			final int i_19_ = i_14_ * anInt4725 >> 1917461164;
			final int i_20_ = i_14_ * anInt4723 >> -415500500;
			Class64_Sub19
					.method632(((Class119) this).anInt985, i_18_, (byte) -51,
							((Class119) this).anInt987, i_17_, i_19_, i_20_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lc.E(" + i + ','
					+ i_14_ + ',' + i_15_ + ')'));
		}
	}

	@Override
	final void method2174(final int i, final int i_21_, final int i_22_) {
		try {
			final int i_23_ = i * anInt4724 >> -1082509588;
			if (i_22_ == -5515) {
				final int i_24_ = anInt4722 * i >> -2074443060;
				final int i_25_ = i_21_ * anInt4725 >> 1484019436;
				final int i_26_ = i_21_ * anInt4723 >> -634503956;
				method2183(1701353708, i_24_, ((Class119) this).anInt988,
						i_23_, ((Class119) this).anInt985, i_26_,
						((Class119) this).anInt987, i_25_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lc.C(" + i + ','
					+ i_21_ + ',' + i_22_ + ')'));
		}
	}

	Class119_Sub2(final int i, final int i_27_, final int i_28_,
			final int i_29_, final int i_30_, final int i_31_, final int i_32_) {
		super(i_30_, i_31_, i_32_);
		try {
			anInt4723 = i_29_;
			anInt4725 = i_27_;
			anInt4722 = i_28_;
			anInt4724 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lc.<init>(" + i
					+ ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_
					+ ',' + i_31_ + ',' + i_32_ + ')'));
		}
	}
}
