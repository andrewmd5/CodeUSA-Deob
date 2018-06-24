/* Class98_Sub46_Sub20_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub20_Sub2 extends Class98_Sub46_Sub20 {
	private Object anObject6315;
	static Class218[] aClass218Array6316 = new Class218[5];
	static int anInt6317;
	static int[] anIntArray6318;
	static int anInt6319;

	@Override
	final Object method1635(final int i) {
		try {
			return anObject6315;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "to.A(" + i + ')');
		}
	}

	@Override
	final boolean method1638(final int i) {
		try {
			if (i != 896) {
				return false;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "to.B(" + i + ')');
		}
	}

	public static void method1640(final byte i) {
		try {
			aClass218Array6316 = null;
			if (i > 40) {
				anIntArray6318 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "to.F(" + i + ')');
		}
	}

	Class98_Sub46_Sub20_Sub2(final Interface20 interface20,
			final Object object, final int i) {
		super(interface20, i);
		try {
			anObject6315 = object;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("to.<init>("
					+ (interface20 != null ? "{...}" : "null") + ','
					+ (object != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static {
		for (int i = 0; i < aClass218Array6316.length; i++) {
			aClass218Array6316[i] = new Class218();
		}
		anIntArray6318 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4,
				0 };
	}
}
