/* Class246_Sub3_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub3_Sub5 extends Class246_Sub3 {
	short aShort6163;
	static OutgoingOpcode aClass171_6164 = new OutgoingOpcode(34, 4);
	short aShort6165;

	@Override
	final void method2992(final byte i) {
		try {
			if (i != -73) {
				aClass171_6164 = null;
			}
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wo.DA(" + i + ')');
		}
	}

	@Override
	final boolean method2982(final byte i) {
		try {
			if (i > -70) {
				aClass171_6164 = null;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wo.HA(" + i + ')');
		}
	}

	@Override
	final void method2981(final Class246_Sub3 class246_sub3, final byte i,
			final boolean bool, final int i_0_, final ha var_ha,
			final int i_1_, final int i_2_) {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wo.CA("
					+ (class246_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + bool + ',' + i_0_ + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_1_ + ','
					+ i_2_ + ')'));
		}
	}

	public static void method3089(final int i) {
		try {
			if (i != 4) {
				aClass171_6164 = null;
			}
			aClass171_6164 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wo.R(" + i + ')');
		}
	}

	@Override
	final boolean method2977(final ha var_ha, final byte i) {
		try {
			if (i != 77) {
				return false;
			}
			return Class195
					.method2661(
							((Class246_Sub3) this).aByte5081,
							(((Class246_Sub3) this).anInt5079 >> Class151_Sub8.anInt5015),
							(((Class246_Sub3) this).anInt5084 >> Class151_Sub8.anInt5015),
							method2990(i + -77), (byte) -123);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wo.AA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final int method2980(final int i, final Class98_Sub5[] class98_sub5s) {
		try {
			return method2989(
					(((Class246_Sub3) this).anInt5084 >> Class151_Sub8.anInt5015),
					false,
					class98_sub5s,
					(((Class246_Sub3) this).anInt5079 >> Class151_Sub8.anInt5015));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wo.GA(" + i + ','
					+ (class98_sub5s != null ? "{...}" : "null") + ')'));
		}
	}

	Class246_Sub3_Sub5(final int i, final int i_5_, final int i_6_,
			final int i_7_, final int i_8_, final int i_9_, final int i_10_) {
		try {
			((Class246_Sub3) this).anInt5084 = i;
			((Class246_Sub3) this).aByte5081 = (byte) i_8_;
			aShort6165 = (short) i_9_;
			aShort6163 = (short) i_10_;
			((Class246_Sub3) this).aByte5088 = (byte) i_7_;
			((Class246_Sub3) this).anInt5079 = i_6_;
			((Class246_Sub3) this).anInt5089 = i_5_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wo.<init>(" + i
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ','
					+ i_9_ + ',' + i_10_ + ')'));
		}
	}

	@Override
	final boolean method2991(final boolean bool) {
		try {
			if (bool != false) {
				return true;
			}
			return (Class74.aBooleanArrayArray551[(Class259.anInt1959
					+ -Class241.anInt1845 + (((Class246_Sub3) this).anInt5084 >> Class151_Sub8.anInt5015))][(Class259.anInt1959
					+ (((Class246_Sub3) this).anInt5079 >> Class151_Sub8.anInt5015) - Class64_Sub26.anInt3714)]);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wo.FA(" + bool
					+ ')');
		}
	}
}
