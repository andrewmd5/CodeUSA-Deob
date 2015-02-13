/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class217 implements Interface14 {
	static IncomingOpcode aClass58_3406 = new IncomingOpcode(59, 3);
	private Class207 aClass207_3407;
	static Class332[] aClass332Array3408;
	private String aString3409;
	static boolean[] aBooleanArray3410 = new boolean[5];

	static final void method2799(final int i, final int i_0_,
			final boolean bool, final byte i_1_) {
		try {
			if (i_1_ <= 71) {
				method2800(-42);
			}
			if ((i_0_ ^ 0xffffffff) > -8001 || (i_0_ ^ 0xffffffff) < -48001) {
				throw new IllegalArgumentException();
			}
			PlayerUpdateMask.anInt529 = i;
			Class64_Sub15.anInt3678 = i_0_;
			Class151_Sub7.aBoolean5007 = bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nw.A(" + i + ','
					+ i_0_ + ',' + bool + ',' + i_1_ + ')'));
		}
	}

	static final boolean method2800(final int i) {
		try {
			if (i != -8001) {
				method2801((byte) -63);
			}
			return Class98_Sub17_Sub1.aBoolean5778;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nw.C(" + i + ')');
		}
	}

	@Override
	public final Class191 method50(final int i) {
		try {
			if (i != 15763) {
				aBooleanArray3410 = null;
			}
			return Class191.aClass191_1475;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nw.B(" + i + ')');
		}
	}

	@Override
	public final int method51(final byte i) {
		try {
			if (i <= 126) {
				aClass58_3406 = null;
			}
			if (aClass207_3407.method2741(aString3409, 0)) {
				return 100;
			}
			return aClass207_3407.method2748(29952, aString3409);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nw.E(" + i + ')');
		}
	}

	public static void method2801(final byte i) {
		try {
			aBooleanArray3410 = null;
			if (i != 101) {
				method2799(67, 18, false, (byte) -61);
			}
			aClass58_3406 = null;
			aClass332Array3408 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nw.D(" + i + ')');
		}
	}

	Class217(final Class207 class207, final String string) {
		try {
			aClass207_3407 = class207;
			aString3409 = string;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nw.<init>("
					+ (class207 != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}
}
