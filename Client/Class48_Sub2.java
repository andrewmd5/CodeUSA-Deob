/* Class48_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class48_Sub2 extends Class48 {
	abstract Interface4_Impl3 method469(int i);

	static final void method470(final byte[][] is,
			final Class305_Sub1 class305_sub1, final int i) {
		try {
			if (i != -4789) {
				method470(null, null, -69);
			}
			for (int i_0_ = 0; ((i_0_ ^ 0xffffffff) > (((Class305) class305_sub1).anInt2547 ^ 0xffffffff)); i_0_++) {
				Class128.method2224(i ^ ~0x4a1c);
				for (int i_1_ = 0; i_1_ < Class165.anInt1276 >> -1696914461; i_1_++) {
					for (int i_2_ = 0; i_2_ < Class98_Sub10_Sub7.anInt5572 >> -516098653; i_2_++) {
						final int i_3_ = (Class170.anIntArrayArrayArray1311[i_0_][i_1_][i_2_]);
						if ((i_3_ ^ 0xffffffff) != 0) {
							final int i_4_ = 0x3 & i_3_ >> -1093162696;
							if (!((Class305) class305_sub1).aBoolean2544
									|| i_4_ == 0) {
								final int i_5_ = 0x3 & i_3_ >> -610352415;
								final int i_6_ = (i_3_ & 0xffc290) >> -1877248338;
								final int i_7_ = (i_3_ & 0x3ffc) >> 255846019;
								final int i_8_ = (i_6_ / 8 << -1553791576)
										- -(i_7_ / 8);
								for (int i_9_ = 0; i_9_ < Class121.anIntArray1006.length; i_9_++) {
									if (((i_8_ ^ 0xffffffff) == (Class121.anIntArray1006[i_9_] ^ 0xffffffff))
											&& is[i_9_] != null) {
										class305_sub1.method3584(
												Class167.aClass243Array1281,
												i_0_, i_4_, is[i_9_], i_2_ * 8,
												8 * i_1_, (i_6_ & 0x7) * 8,
												(0x7 & i_7_) * 8, i_5_,
												Class265.aHa1974, i ^ ~0x12cc);
										break;
									}
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("jv.H(" + (is != null ? "{...}" : "null") + ','
							+ (class305_sub1 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}
}
