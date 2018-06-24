/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class319 {
	static int anInt2699;
	static boolean aBoolean2700 = false;
	private d aD2701;
	static boolean[][] aBooleanArrayArray2702;
	private final Class79 aClass79_2703 = new Class79(256);
	private ha_Sub3 aHa_Sub3_2704;
	static int[] anIntArray2705;
	static int anInt2706;
	static boolean aBoolean2707;

	public static void method3658(final byte i) {
		do {
			try {
				anIntArray2705 = null;
				aBooleanArrayArray2702 = null;
				if (i >= 79) {
					break;
				}
				method3658((byte) -66);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "tl.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method3659(final int i) {
		try {
			if (i != -3) {
				method3658((byte) 47);
			}
			aClass79_2703.method794(i + 80);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "tl.B(" + i + ')');
		}
	}

	Class319(final ha_Sub3 var_ha_Sub3, final d var_d) {
		try {
			aHa_Sub3_2704 = var_ha_Sub3;
			aD2701 = var_d;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("tl.<init>("
					+ (var_ha_Sub3 != null ? "{...}" : "null") + ','
					+ (var_d != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method3660(final boolean bool) {
		try {
			if (!Class134_Sub1.method2246("jaclib", (byte) -36)) {
				return false;
			}
			if (bool != true) {
				method3658((byte) 113);
			}
			return Class134_Sub1.method2246("hw3d", (byte) -36);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "tl.A(" + bool
					+ ')');
		}
	}

	final Interface4_Impl2 method3661(final int i, final int i_0_) {
		try {
			final Object object = aClass79_2703.method802(i + -124, i_0_);
			if (object != null) {
				return (Interface4_Impl2) object;
			}
			if (!aD2701.method8(-5, i_0_)) {
				return null;
			}
			if (i != 0) {
				return null;
			}
			final TextureDefinition textureDefinition = aD2701.method11(i_0_, i + -28755);
			final int i_1_ = (!textureDefinition.aBoolean1822 ? aHa_Sub3_2704.anInt4607
					: 64);
			Interface4_Impl2 interface4_impl2;
			if (textureDefinition.aBoolean1817 && aHa_Sub3_2704.method1768()) {
				final float[] fs = aD2701.method10((byte) -117, false, i_0_,
						i_1_, 0.7F, i_1_);
				interface4_impl2 = aHa_Sub3_2704.method2066(
						Class62.aClass164_486,
						(textureDefinition.aByte1832 ^ 0xffffffff) != -1, fs, false,
						i_1_, i_1_);
			} else {
				int[] is;
				if ((textureDefinition.anInt1818 ^ 0xffffffff) == -3
						|| !Class98_Sub10_Sub7.method1023(i ^ 0x1,
								(textureDefinition.aByte1820))) {
					is = aD2701
							.method13(i + 115, i_1_, i_0_, 0.7F, false, i_1_);
				} else {
					is = aD2701.method9(i_0_, (byte) -116, i_1_, 0.7F, true,
							i_1_);
				}
				interface4_impl2 = aHa_Sub3_2704.method2012(i_1_, i_1_,
						(byte) 31, is, (textureDefinition.aByte1832 != 0));
			}
			interface4_impl2.method46(textureDefinition.aBoolean1826,
					textureDefinition.aBoolean1819, -97);
			aClass79_2703.method805(i_0_, interface4_impl2, (byte) -80);
			return interface4_impl2;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "tl.D(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method3662(final int i) {
		try {
			aClass79_2703.method800((byte) 62, 5);
			if (i >= -112) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "tl.E(" + i + ')');
		}
	}

	static {
		anInt2699 = 0;
		anIntArray2705 = new int[2048];
		aBoolean2707 = false;
	}
}
