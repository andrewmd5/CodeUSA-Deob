/* Class224_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class224_Sub2_Sub1 extends Class224_Sub2 {
	static int anInt6141 = -1;
	static volatile boolean aBoolean6142 = false;
	static int anInt6143;

	static final void method2838(final int i, final int i_0_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i_0_, i + -139, i);
			class98_sub46_sub17.method1621(0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jm.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method2839(final int i, final int i_1_, final int i_2_) {
		final boolean bool = ((Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i_1_][i_2_] != null) && (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i_1_][i_2_]).aClass172_1330 != null);
		for (int i_3_ = i; i_3_ >= 0; i_3_--) {
			if ((Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_3_][i_1_][i_2_]) == null) {
				final Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_3_][i_1_][i_2_] = new Class172(
						i_3_));
				if (bool) {
					class172.aByte1322++;
				}
			}
		}
	}
}
