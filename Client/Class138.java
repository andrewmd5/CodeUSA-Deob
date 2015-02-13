/* Class138 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;

final class Class138 {
	static BigInteger aBigInteger1082 = new BigInteger("10001", 16);
	static int[] anIntArray1083;
	static Class218 aClass218_1084 = new Class218();
	static int anInt1085;

	static final Class337_Sub1 method2277(final ByteBuffer class98_sub22,
			final int i) {
		try {
			if (i < 12) {
				anInt1085 = -116;
			}
			final Class337 class337 = ha.method1796(9342, class98_sub22);
			final int i_0_ = class98_sub22.method1227((byte) -1);
			return new Class337_Sub1(class337.anInt3535,
					class337.aClass63_3538, class337.aClass110_3540,
					class337.anInt3541, class337.anInt3542, i_0_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("jg.C(" + (class98_sub22 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	static final void method2278(final int i, final s var_s) {
		Class78.aSArray594[i] = var_s;
	}

	public static void method2279(final int i) {
		do {
			try {
				aClass218_1084 = null;
				anIntArray1083 = null;
				aBigInteger1082 = null;
				if (i == 100) {
					break;
				}
				anInt1085 = 77;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jg.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final Class131 method2280(final byte i, final int i_1_) {
		try {
			if (i != 49) {
				aClass218_1084 = null;
			}
			if ((i_1_ ^ 0xffffffff) > -1 || i_1_ >= 100) {
				return null;
			}
			return Class98_Sub46_Sub3.aClass131Array5953[i_1_];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jg.A(" + i + ','
					+ i_1_ + ')');
		}
	}
}
