/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class194 {
	static byte[] aByteArray1495 = new byte[32896];
	static Class102[] aClass102Array1496;

	static final void method2657(
			final Player class246_sub3_sub4_sub2_sub2,
			final byte i, final int i_0_, final int i_1_) {
		try {
			if (i == 114) {
				final int[] is = new int[4];
				Class236.method2896(is, 0, is.length, i_1_);
				Class181.method2608(i_0_, class246_sub3_sub4_sub2_sub2, is, 0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("mq.A("
							+ ((class246_sub3_sub4_sub2_sub2 != null) ? "{...}"
									: "null") + ',' + i + ',' + i_0_ + ','
							+ i_1_ + ')'));
		}
	}

	public static void method2658(final int i) {
		try {
			aClass102Array1496 = null;
			if (i != 255) {
				method2657(null, (byte) -10, -124, -20);
			}
			aByteArray1495 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mq.B(" + i + ')');
		}
	}

	static {
		int i = 0;
		for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -257; i_2_++) {
			for (int i_3_ = 0; i_3_ <= i_2_; i_3_++) {
				aByteArray1495[i++] = (byte) (int) (255.0 / (Math
						.sqrt((65535 + (i_2_ * i_2_ + i_3_ * i_3_)) / 65535.0F)));
			}
		}
	}
}
