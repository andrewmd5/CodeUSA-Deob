/* Class299 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class299 {
	static Class79 aClass79_2493 = new Class79(32);
	static int anInt2494;
	static IncomingOpcode aClass58_2495 = new IncomingOpcode(47, -1);

	final boolean method3505(final byte i) {
		try {
			if (i != 22) {
				method3510((byte) 46);
			}
			if (!method3506((byte) 121) && !method3510((byte) -19)
					&& !method3512(1)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sga.J(" + i + ')');
		}
	}

	abstract boolean method3506(byte i);

	abstract int method3507(byte i);

	abstract Class98_Sub17 method3508(int i);

	static final Class243 method3509(final int i, final int i_0_, final int i_1_) {
		try {
			if (i != 2742) {
				method3511(85);
			}
			final Class243 class243 = new Class243();
			class243.anInt1855 = -1;
			class243.anInt1854 = -1;
			class243.anInt1856 = 6 + i_0_;
			class243.anInt1857 = 1 + (i_1_ - -5);
			class243.anIntArrayArray1853 = (new int[class243.anInt1857][class243.anInt1856]);
			class243.method2950((byte) -99);
			return class243;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sga.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	abstract boolean method3510(byte i);

	public Class299() {
		/* empty */
	}

	public static void method3511(final int i) {
		do {
			try {
				aClass58_2495 = null;
				aClass79_2493 = null;
				if (i == -1) {
					break;
				}
				aClass58_2495 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "sga.K(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	abstract boolean method3512(int i);

	static final void method3513(final boolean bool) {
		try {
			int i = 0;
			if (Class98_Sub9.aClass98_Sub27_3856 != null) {
				i = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub16_4040
						.method614((byte) 127);
			}
			if (bool != false) {
				method3511(6);
			}
			if ((i ^ 0xffffffff) != -3) {
				if ((i ^ 0xffffffff) == -2) {
					final int i_2_ = ((Class188.anInt1453 ^ 0xffffffff) < -1025 ? 1024
							: Class188.anInt1453);
					Class39_Sub1.anInt3593 = i_2_;
					final int i_3_ = (Class123_Sub1.anInt4744 <= 768 ? Class123_Sub1.anInt4744
							: 768);
					Class98_Sub46_Sub10.anInt6022 = (Class188.anInt1453 + -i_2_) / 2;
					Class191.anInt1479 = 0;
					Class98_Sub25.anInt4024 = i_3_;
				} else {
					Class39_Sub1.anInt3593 = Class188.anInt1453;
					Class98_Sub25.anInt4024 = Class123_Sub1.anInt4744;
					Class191.anInt1479 = 0;
					Class98_Sub46_Sub10.anInt6022 = 0;
				}
			} else {
				final int i_4_ = Class188.anInt1453 <= 800 ? Class188.anInt1453
						: 800;
				Class98_Sub46_Sub10.anInt6022 = (-i_4_ + Class188.anInt1453) / 2;
				final int i_5_ = (Class123_Sub1.anInt4744 > 600 ? 600
						: Class123_Sub1.anInt4744);
				Class39_Sub1.anInt3593 = i_4_;
				Class191.anInt1479 = 0;
				Class98_Sub25.anInt4024 = i_5_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sga.D(" + bool
					+ ')');
		}
	}

	abstract int method3514(int i);

	abstract void method3515(int i);

	abstract void method3516(byte i);
}
