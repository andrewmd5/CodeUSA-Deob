/* Class151_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class151_Sub5 extends Class151 {
	static int anInt4990;
	static boolean aBoolean4991 = false;
	static IncomingOpcode aClass58_4992 = new IncomingOpcode(87, 7);
	static int anInt4993;

	@Override
	final void method2441(final int i, final int i_0_, final int i_1_) {
		try {
			if (i_1_ > -2) {
				method2445((byte) -119);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mca.G(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	@Override
	final boolean method2439(final int i) {
		try {
			if (i != 31565) {
				method2461(-54);
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mca.A(" + i + ')');
		}
	}

	public static void method2461(final int i) {
		do {
			try {
				aClass58_4992 = null;
				if (i == -3) {
					break;
				}
				anInt4993 = -98;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "mca.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method2442(final Class42 class42, final boolean bool, final int i) {
		try {
			if (bool != false) {
				method2440(false, false);
			}
			((Class151) this).aHa_Sub1_1215.method1863(1, class42);
			((Class151) this).aHa_Sub1_1215.method1896(260, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mca.F("
					+ (class42 != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ')'));
		}
	}

	Class151_Sub5(final ha_Sub1 var_ha_Sub1) {
		super(var_ha_Sub1);
	}

	@Override
	final void method2440(final boolean bool, final boolean bool_2_) {
		try {
			if (bool != false) {
				aClass58_4992 = null;
			}
			((Class151) this).aHa_Sub1_1215.method1905(true, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mca.D(" + bool
					+ ',' + bool_2_ + ')'));
		}
	}

	@Override
	final void method2443(final boolean bool, final int i) {
		try {
			if (i != 255) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mca.C(" + bool
					+ ',' + i + ')');
		}
	}

	static final boolean method2462(final int i, final byte i_3_) {
		try {
			if (i != 0 && (i ^ 0xffffffff) != -3) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mca.H(" + i + ','
					+ i_3_ + ')');
		}
	}

	@Override
	final void method2445(final byte i) {
		try {
			((Class151) this).aHa_Sub1_1215.method1905(false, 0);
			if (i < 25) {
				aBoolean4991 = false;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mca.E(" + i + ')');
		}
	}
}
