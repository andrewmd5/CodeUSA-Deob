/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class82 {
	static OutgoingOpcode aClass171_625;
	static boolean aBoolean626 = false;
	private ha_Sub3_Sub2 aHa_Sub3_Sub2_627;
	long aLong628;
	static int anInt629;
	static Class153 aClass153_630;

	public static void method821(final int i) {
		try {
			if (i == 14) {
				aClass171_625 = null;
				aClass153_630 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fg.B(" + i + ')');
		}
	}

	@Override
	protected final void finalize() throws Throwable {
		try {
			aHa_Sub3_Sub2_627.method2082(0, aLong628);
			super.finalize();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					"fg.finalize(" + ')');
		}
	}

	static final void method822(final int i) {
		try {
			r_Sub1.aClass79_6321.method794(i ^ 0x27b6);
			if (i != 10157) {
				aClass171_625 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fg.C(" + i + ')');
		}
	}

	static final Class42_Sub1_Sub1 method823(final int i,
			final ha_Sub1 var_ha_Sub1, final int i_0_, final int i_1_,
			final int i_2_) {
		try {
			if (!var_ha_Sub1.aBoolean4426
					&& (!Class81.method815(i_0_, 0) || !Class81.method815(i, 0))) {
				if (var_ha_Sub1.aBoolean4378) {
					return new Class42_Sub1_Sub1(var_ha_Sub1, 34037, i_2_,
							i_0_, i);
				}
				return new Class42_Sub1_Sub1(var_ha_Sub1, i_2_, i_0_, i,
						Class48.method453(423660257, i_0_), Class48.method453(
								423660257, i));
			}
			return new Class42_Sub1_Sub1(var_ha_Sub1, 3553, i_2_, i_0_, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fg.A(" + i + ','
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i_0_
					+ ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	Class82(final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final long l,
			final Class230[] class230s) {
		try {
			aLong628 = l;
			aHa_Sub3_Sub2_627 = var_ha_Sub3_Sub2;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fg.<init>("
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + l
					+ ',' + (class230s != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass171_625 = new OutgoingOpcode(14, 11);
	}
}
