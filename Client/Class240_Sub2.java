/* Class240_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class240_Sub2 extends Class240 {
	private long aLong5055 = 0L;
	private long aLong5056 = 0L;
	private final long[] aLongArray5057 = new long[10];
	private int anInt5058;
	private int anInt5059 = 1;
	private long aLong5060;

	@Override
	final void method2923(final boolean bool) {
		do {
			try {
				aLong5060 = 0L;
				if (aLong5055 > aLong5056) {
					aLong5056 += aLong5055 + -aLong5056;
				}
				if (!bool) {
					break;
				}
				method2924((byte) -114);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final long method2922(final byte i) {
		long l;
		try {
			aLong5056 += method2929(-123);
			if (aLong5056 < aLong5055) {
				return (-aLong5056 + aLong5055) / 1000000L;
			}
			if (i >= -80) {
				method2926(73, -115L);
			}
			l = 0L;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	@Override
	final int method2926(final int i, final long l) {
		int i_0_;
		try {
			if (i <= 117) {
				aLong5056 = -7L;
			}
			if (aLong5056 < aLong5055) {
				aLong5060 += aLong5055 + -aLong5056;
				aLong5056 += aLong5055 - aLong5056;
				aLong5055 += l;
				return 1;
			}
			int i_1_ = 0;
			do {
				i_1_++;
				aLong5055 += l;
			} while (10 > i_1_
					&& ((aLong5055 ^ 0xffffffffffffffffL) > (aLong5056 ^ 0xffffffffffffffffL)));
			if ((aLong5056 ^ 0xffffffffffffffffL) < (aLong5055 ^ 0xffffffffffffffffL)) {
				aLong5055 = aLong5056;
			}
			i_0_ = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_0_;
	}

	@Override
	final long method2924(final byte i) {
		long l;
		try {
			if (i <= 12) {
				return 126L;
			}
			l = aLong5056;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	private final long method2929(final int i) {
		long l;
		try {
			final long l_2_ = System.nanoTime();
			final long l_3_ = -aLong5060 + l_2_;
			aLong5060 = l_2_;
			if (4999999999L > (l_3_ ^ 0xffffffffffffffffL)
					&& 5000000000L > l_3_) {
				aLongArray5057[anInt5058] = l_3_;
				anInt5058 = (1 + anInt5058) % 10;
				if ((anInt5059 ^ 0xffffffff) > -2) {
					anInt5059++;
				}
			}
			long l_4_ = 0L;
			for (int i_5_ = 1; (anInt5059 ^ 0xffffffff) <= (i_5_ ^ 0xffffffff); i_5_++) {
				l_4_ += aLongArray5057[(10 + anInt5058 + -i_5_) % 10];
			}
			l = l_4_ / anInt5059;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	Class240_Sub2() {
		anInt5058 = 0;
		aLong5060 = 0L;
		try {
			aLong5056 = System.nanoTime();
			aLong5055 = System.nanoTime();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
