/* Class240_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

final class Class240_Sub1 extends Class240 {
	private long aLong5049;
	private long aLong5050 = 0L;
	private long aLong5051;
	private int anInt5052;
	private int anInt5053;
	private final long[] aLongArray5054;

	@Override
	final void method2923(final boolean bool) {
		do {
			try {
				aLong5051 = 0L;
				if ((aLong5049 ^ 0xffffffffffffffffL) < (aLong5050 ^ 0xffffffffffffffffL)) {
					aLong5050 += aLong5049 - aLong5050;
				}
				if (bool == false) {
					break;
				}
				aLong5049 = 111L;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	final long method2924(final byte i) {
		try {
			if (i < 12) {
				method2928(104);
			}
			return aLong5050;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final long method2928(final int i) {
		try {
			final long l = jagmisc.nanoTime();
			final long l_0_ = l - aLong5051;
			aLong5051 = l;
			if (i != 27103) {
				return -94L;
			}
			if ((l_0_ ^ 0xffffffffffffffffL) < 4999999999L
					&& l_0_ < 5000000000L) {
				aLongArray5054[anInt5052] = l_0_;
				if (anInt5053 < 1) {
					anInt5053++;
				}
				anInt5052 = (1 + anInt5052) % 10;
			}
			long l_1_ = 0L;
			for (int i_2_ = 1; (i_2_ ^ 0xffffffff) >= (anInt5053 ^ 0xffffffff); i_2_++) {
				l_1_ += aLongArray5054[(10 + anInt5052 + -i_2_) % 10];
			}
			return l_1_ / anInt5053;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final long method2922(final byte i) {
		try {
			aLong5050 += method2928(27103);
			if (aLong5049 > aLong5050) {
				return (aLong5049 - aLong5050) / 1000000L;
			}
			if (i >= -80) {
				anInt5053 = -48;
			}
			return 0L;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final int method2926(final int i, final long l) {
		try {
			if (i <= 117) {
				anInt5053 = 14;
			}
			if ((aLong5049 ^ 0xffffffffffffffffL) >= (aLong5050 ^ 0xffffffffffffffffL)) {
				int i_3_ = 0;
				do {
					aLong5049 += l;
				} while (++i_3_ < 10 && aLong5049 < aLong5050);
				if ((aLong5049 ^ 0xffffffffffffffffL) > (aLong5050 ^ 0xffffffffffffffffL)) {
					aLong5049 = aLong5050;
				}
				return i_3_;
			}
			aLong5051 += aLong5049 + -aLong5050;
			aLong5050 += aLong5049 + -aLong5050;
			aLong5049 += l;
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class240_Sub1() {
		aLong5049 = 0L;
		aLong5051 = 0L;
		anInt5052 = 0;
		anInt5053 = 1;
		aLongArray5054 = new long[10];
		try {
			aLong5049 = aLong5050 = jagmisc.nanoTime();
			if (aLong5050 == 0L) {
				throw new RuntimeException();
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
