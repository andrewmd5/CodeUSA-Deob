/* Class98_Sub46_Sub13_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub13_Sub2 extends Class98_Sub46_Sub13 {
	static int anInt6309;
	int anInt6310;
	static int[][][] anIntArrayArrayArray6311;
	Class17 aClass17_6312;
	byte[] aByteArray6313;

	static final int method1598(final int i, final int i_0_) {
		try {
			if (i_0_ != -22645) {
				method1601(41, -108);
			}
			return i >>> 1951350663;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rba.E(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method1599(final int i) {
		try {
			if (i >= 100) {
				anIntArrayArrayArray6311 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rba.F(" + i + ')');
		}
	}

	@Override
	final int method1590(final int i) {
		try {
			if (i != 100) {
				return -47;
			}
			if (((Class98_Sub46_Sub13) this).aBoolean6038) {
				return 0;
			}
			return 100;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rba.B(" + i + ')');
		}
	}

	static final int method1600(final byte i) {
		try {
			if (i >= -6) {
				method1598(73, -45);
			}
			return Class337_Sub1.anInt5497;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rba.A(" + i + ')');
		}
	}

	static final Class98_Sub46_Sub4 method1601(final int i, final int i_1_) {
		try {
			Class98_Sub46_Sub4 class98_sub46_sub4 = ((Class98_Sub46_Sub4) Class38.aClass100_357
					.method1694((byte) 117, i));
			if (class98_sub46_sub4 != null) {
				return class98_sub46_sub4;
			}
			final byte[] is = Class52.aClass207_3494.method2745(0, i, false);
			if (i_1_ != 100) {
				method1599(-28);
			}
			if (is == null || is.length <= 1) {
				return null;
			}
			try {
				class98_sub46_sub4 = Class22.method280(is, 0);
			} catch (final Exception exception) {
				exception.printStackTrace();
				throw new RuntimeException(exception.getMessage() + " S: " + i);
			}
			Class38.aClass100_357.method1695(26404, class98_sub46_sub4, i);
			return class98_sub46_sub4;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rba.D(" + i + ','
					+ i_1_ + ')');
		}
	}

	@Override
	final byte[] method1591(final int i) {
		try {
			if (i < 5) {
				aClass17_6312 = null;
			}
			if (((Class98_Sub46_Sub13) this).aBoolean6038) {
				throw new RuntimeException();
			}
			return aByteArray6313;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rba.C(" + i + ')');
		}
	}

	public Class98_Sub46_Sub13_Sub2() {
		/* empty */
	}
}
