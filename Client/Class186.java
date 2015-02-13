/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class186 implements Interface17 {
	static int anInt3424;
	private Class333 aClass333_3425;
	int anInt3426;
	int[] anIntArray3427;
	static Class148 aClass148_3428;
	float[] aFloatArray3429;
	int anInt3430;
	static int anInt3431 = 0;
	private ha_Sub2 aHa_Sub2_3432;
	static Class348 aClass348_3433;

	@Override
	public final void method56(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_, final boolean bool,
			final boolean bool_5_) {
		try {
			Class246_Sub3_Sub4_Sub5.method3086(
					aHa_Sub2_3432.aClass98_Sub32_4478.anInt4105,
					bool ? (aHa_Sub2_3432.aClass98_Sub32_4478.anIntArray4108)
							: null, i_0_, i, i_1_, bool_5_ ? aFloatArray3429
							: null, i_4_, anIntArray3427, i_2_, i_3_,
					!bool_5_ ? null : aHa_Sub2_3432.aFloatArray4488, anInt3426,
					0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mga.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + bool + ',' + bool_5_ + ')'));
		}
	}

	public static void method2633(final int i) {
		try {
			aClass148_3428 = null;
			if (i != -20830) {
				anInt3424 = 49;
			}
			aClass348_3433 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mga.C(" + i + ')');
		}
	}

	@Override
	public final void method57(final int i, final int i_6_, final int i_7_,
			final int i_8_, final int i_9_, final int i_10_,
			final boolean bool, final boolean bool_11_) {
		try {
			Class246_Sub3_Sub4_Sub5.method3086(anInt3426, bool ? anIntArray3427
					: null, i_6_, i, i_7_,
					bool_11_ ? aHa_Sub2_3432.aFloatArray4488 : null, i_10_,
					(aHa_Sub2_3432.aClass98_Sub32_4478).anIntArray4108, i_8_,
					i_9_, !bool_11_ ? null : aFloatArray3429,
					aHa_Sub2_3432.aClass98_Sub32_4478.anInt4105, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mga.B(" + i + ','
					+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_
					+ ',' + bool + ',' + bool_11_ + ')'));
		}
	}

	Class186(final ha_Sub2 var_ha_Sub2, final Class332 class332,
			final Class333 class333) {
		do {
			try {
				aHa_Sub2_3432 = var_ha_Sub2;
				do {
					if (!(class332 instanceof Class332_Sub3_Sub2)) {
						if (!(class332 instanceof Class332_Sub3_Sub1)) {
							throw new RuntimeException();
						}
						final Class332_Sub3_Sub1 class332_sub3_sub1 = (Class332_Sub3_Sub1) class332;
						anInt3426 = ((Class332_Sub3) class332_sub3_sub1).anInt5433;
						anIntArray3427 = (class332_sub3_sub1.anIntArray6212);
						anInt3430 = ((Class332_Sub3) class332_sub3_sub1).anInt5454;
						if (!client.aBoolean3553) {
							break;
						}
					}
					final Class332_Sub3_Sub2 class332_sub3_sub2 = (Class332_Sub3_Sub2) class332;
					anInt3430 = ((Class332_Sub3) class332_sub3_sub2).anInt5454;
					anIntArray3427 = (class332_sub3_sub2.anIntArray6213);
					anInt3426 = ((Class332_Sub3) class332_sub3_sub2).anInt5433;
				} while (false);
				if (class333 == null) {
					break;
				}
				aClass333_3425 = class333;
				if (((anInt3426 ^ 0xffffffff) != (aClass333_3425.anInt3388 ^ 0xffffffff))
						|| ((anInt3430 ^ 0xffffffff) != (aClass333_3425.anInt3387 ^ 0xffffffff))) {
					throw new RuntimeException();
				}
				aFloatArray3429 = aClass333_3425.aFloatArray3389;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("mga.<init>("
						+ (var_ha_Sub2 != null ? "{...}" : "null") + ','
						+ (class332 != null ? "{...}" : "null") + ','
						+ (class333 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass148_3428 = new Class148();
		aClass348_3433 = new Class348(8, 0, 4, 1);
	}
}
