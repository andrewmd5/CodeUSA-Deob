/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class51 {
	Class42_Sub1[] aClass42_Sub1Array420 = null;
	Class42_Sub4 aClass42_Sub4_421;
	Class42_Sub4 aClass42_Sub4_422;
	Class42_Sub1[] aClass42_Sub1Array423 = null;
	boolean aBoolean424;
	Class42_Sub4 aClass42_Sub4_425;

	static final void method487(final int i, final Class98_Sub46 class98_sub46,
			final Class98_Sub46 class98_sub46_0_) {
		try {
			if (class98_sub46_0_.aClass98_Sub46_4265 != null) {
				class98_sub46_0_.method1524((byte) -90);
			}
			if (i >= 32) {
				class98_sub46_0_.aClass98_Sub46_4262 = class98_sub46;
				class98_sub46_0_.aClass98_Sub46_4265 = class98_sub46.aClass98_Sub46_4265;
				(class98_sub46_0_.aClass98_Sub46_4265).aClass98_Sub46_4262 = class98_sub46_0_;
				(class98_sub46_0_.aClass98_Sub46_4262).aClass98_Sub46_4265 = class98_sub46_0_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dja.A(" + i + ','
					+ (class98_sub46 != null ? "{...}" : "null") + ','
					+ (class98_sub46_0_ != null ? "{...}" : "null") + ')'));
		}
	}

	Class51(final ha_Sub1 var_ha_Sub1) {
		aClass42_Sub4_421 = null;
		aClass42_Sub4_425 = null;
		aClass42_Sub4_422 = null;
		try {
			aBoolean424 = var_ha_Sub1.aBoolean4434;
			Class64_Sub9.method590(true, var_ha_Sub1);
			if (aBoolean424) {
				byte[] is = Class98_Sub28_Sub1.method1310(false,
						Class167.anObject1285, false);
				aClass42_Sub4_422 = new Class42_Sub4(var_ha_Sub1, 6410, 128,
						128, 16, is, 6410);
				is = Class98_Sub28_Sub1.method1310(false,
						Class130.anObject1030, false);
				aClass42_Sub4_425 = new Class42_Sub4(var_ha_Sub1, 6410, 128,
						128, 16, is, 6410);
				final Class118 class118 = var_ha_Sub1.aClass118_4322;
				if (class118.method2171(true)) {
					is = Class98_Sub28_Sub1.method1310(false,
							(Class98_Sub41.anObject4203), false);
					aClass42_Sub4_421 = new Class42_Sub4(var_ha_Sub1, 6408,
							128, 128, 16);
					final Class42_Sub4 class42_sub4 = new Class42_Sub4(
							var_ha_Sub1, 6409, 128, 128, 16, is, 6409);
					if (class118.method2172(0, class42_sub4, 2.0F,
							(aClass42_Sub4_421))) {
						aClass42_Sub4_421.method371(35);
					} else {
						aClass42_Sub4_421.method375(true);
						aClass42_Sub4_421 = null;
					}
					class42_sub4.method375(true);
				}
			} else {
				aClass42_Sub1Array423 = new Class42_Sub1[16];
				for (int i = 0; (i ^ 0xffffffff) > -17; i++) {
					final byte[] is = Class98_Sub10_Sub20.method1061(2, 32768,
							128 * (128 * i) * 2, (Class167.anObject1285));
					aClass42_Sub1Array423[i] = new Class42_Sub1(var_ha_Sub1,
							3553, 6410, 128, 128, true, is, 6410, false);
				}
				aClass42_Sub1Array420 = new Class42_Sub1[16];
				for (int i = 0; (i ^ 0xffffffff) > -17; i++) {
					final byte[] is = Class98_Sub10_Sub20.method1061(2, 32768,
							16384 * i * 2, (Class130.anObject1030));
					aClass42_Sub1Array420[i] = new Class42_Sub1(var_ha_Sub1,
							3553, 6410, 128, 128, true, is, 6410, false);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dja.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ')');
		}
	}
}
