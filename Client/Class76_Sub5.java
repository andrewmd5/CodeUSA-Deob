/* Class76_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class76_Sub5 extends Class76 {
	private boolean aBoolean3742 = false;
	static int[] anIntArray3743;
	static int[] anIntArray3744;
	static Class111 aClass111_3745;
	static int anInt3746;
	static double aDouble3747;
	static int anInt3748 = 0;

	@Override
	final boolean method745(final byte i) {
		try {
			if (i != 27) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jh.H(" + i + ')');
		}
	}

	@Override
	final void method746(final int i, final int i_0_, final int i_1_) {
		do {
			try {
				if (i_1_ < -75) {
					break;
				}
				method757((byte) 40);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jh.E(" + i
						+ ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method742(final int i, final int i_2_,
			final Interface4 interface4) {
		try {
			if (i != 6) {
				method746(62, 22, -72);
			}
			((Class76) this).aHa_Sub3_585.method2005(interface4, 0);
			((Class76) this).aHa_Sub3_585.method2015(i_2_, (byte) 79);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("jh.I(" + i + ',' + i_2_ + ','
							+ (interface4 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method743(final int i, final boolean bool) {
		try {
			if (i < 93) {
				method746(-61, 44, -112);
			}
			((Class76) this).aHa_Sub3_585.method2019(Class288.aClass128_3381,
					Class249.aClass128_1903, 22831);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jh.D(" + i + ','
					+ bool + ')');
		}
	}

	public static void method757(final byte i) {
		try {
			aClass111_3745 = null;
			if (i == 4) {
				anIntArray3744 = null;
				anIntArray3743 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jh.A(" + i + ')');
		}
	}

	static final boolean method758(final byte i, final int i_3_,
			final int i_4_, final int i_5_) {
		try {
			if (!Class98_Sub17.aBoolean3942 || !Class135.aBoolean1052) {
				return false;
			}
			if (Class4.anInt81 < 100) {
				return false;
			}
			final int i_6_ = (Class98_Sub46_Sub13_Sub2.anIntArrayArrayArray6311[i_3_][i_5_][i_4_]);
			if ((i_6_ ^ 0xffffffff) == (-Class356.anInt3020 ^ 0xffffffff)) {
				return false;
			}
			if (Class356.anInt3020 == i_6_) {
				return true;
			}
			if (Class78.aSArray594 == Class81.aSArray618) {
				return false;
			}
			final int i_8_ = i_5_ << Class151_Sub8.anInt5015;
			final int i_9_ = i_4_ << Class151_Sub8.anInt5015;
			if ((Class254.method3187(Class78.aSArray594[i_3_].method3420(i_4_
					- -1, -12639, i_5_ + 1), 1 + i_8_, i_9_ - -1, (byte) 82,
					Class78.aSArray594[i_3_].method3420(i_4_, -12639, i_5_),
					i_9_ - -r_Sub2.anInt6333 + -1, Class78.aSArray594[i_3_]
							.method3420(1 + i_4_, -12639, i_5_), i_9_
							- (-r_Sub2.anInt6333 - -1), r_Sub2.anInt6333 + i_8_
							+ -1, 1 + i_8_))
					&& (Class254.method3187(Class78.aSArray594[i_3_]
							.method3420(i_4_, -12639, i_5_ + 1),
							r_Sub2.anInt6333 + i_8_ - 1, i_9_ + 1, (byte) 82,
							Class78.aSArray594[i_3_].method3420(i_4_, -12639,
									i_5_), -1 + r_Sub2.anInt6333 + i_9_,
							Class78.aSArray594[i_3_].method3420(1 + i_4_,
									-12639, i_5_ - -1), i_9_ - -1, -1
									+ (i_8_ - -r_Sub2.anInt6333), 1 + i_8_))) {
				GameObjectDefinitionLoader.anInt2518++;
				Class98_Sub46_Sub13_Sub2.anIntArrayArrayArray6311[i_3_][i_5_][i_4_] = Class356.anInt3020;
				return true;
			}
			Class98_Sub46_Sub13_Sub2.anIntArrayArrayArray6311[i_3_][i_5_][i_4_] = -Class356.anInt3020;
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jh.G(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	@Override
	final void method739(final int i) {
		do {
			try {
				do {
					if (!aBoolean3742) {
						((Class76) this).aHa_Sub3_585.method1953(i ^ 0x6b,
								Class300.aClass65_2499, 0);
						if (!client.aBoolean3553) {
							break;
						}
					}
					((Class76) this).aHa_Sub3_585.method1951((byte) 120, 1);
					((Class76) this).aHa_Sub3_585.method1964(
							r_Sub2.aClass38_6334, (byte) 26);
					((Class76) this).aHa_Sub3_585.method2019(
							(Class249.aClass128_1903),
							(Class249.aClass128_1903), 22831);
					((Class76) this).aHa_Sub3_585.method2051(2, -92,
							Class64_Sub16.aClass65_3681);
					((Class76) this).aHa_Sub3_585.method1953(-84,
							Class300.aClass65_2499, 0);
					((Class76) this).aHa_Sub3_585.method1985(2);
					((Class76) this).aHa_Sub3_585.method2005(null, i + -116);
					((Class76) this).aHa_Sub3_585.method1951((byte) 120, 0);
					aBoolean3742 = false;
				} while (false);
				((Class76) this).aHa_Sub3_585
						.method2019(Class249.aClass128_1903,
								Class249.aClass128_1903, 22831);
				if (i == -2) {
					break;
				}
				method757((byte) -25);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jh.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method759(final byte i, final int[][] is) {
		do {
			try {
				AnimationDefinition.anIntArrayArray814 = is;
				if (i < -62) {
					break;
				}
				anIntArray3744 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jh.F(" + i
						+ ',' + (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	Class76_Sub5(final ha_Sub3 var_ha_Sub3) {
		super(var_ha_Sub3);
	}

	@Override
	final void method748(final int i, final boolean bool) {
		do {
			try {
				final Interface4_Impl3 interface4_impl3 = ((Class76) this).aHa_Sub3_585
						.method1939(-109);
				do {
					if (interface4_impl3 != null && bool) {
						((Class76) this).aHa_Sub3_585.method1951((byte) 120, 1);
						((Class76) this).aHa_Sub3_585.method2005(
								interface4_impl3, i + -6);
						((Class76) this).aHa_Sub3_585.method1964(
								Class204.aClass38_1552, (byte) 26);
						((Class76) this).aHa_Sub3_585.method1951((byte) 120, 1);
						((Class76) this).aHa_Sub3_585.method2019(
								Class288.aClass128_3381,
								Class323.aClass128_2715, 22831);
						((Class76) this).aHa_Sub3_585.method2026(2, true,
								(byte) 27, IncomingOpcode.aClass65_459, false);
						((Class76) this).aHa_Sub3_585.method1953(-101,
								Class98_Sub43_Sub3.aClass65_5926, 0);
						final Class111_Sub3 class111_sub3 = ((Class76) this).aHa_Sub3_585
								.method1957((byte) -101);
						class111_sub3.method2140(
								((Class76) this).aHa_Sub3_585.method2023(1), 0);
						((Class76) this).aHa_Sub3_585.method2008(
								Class144.aClass258_1168, (byte) 120);
						((Class76) this).aHa_Sub3_585.method1951((byte) 120, 0);
						aBoolean3742 = true;
						if (!client.aBoolean3553) {
							break;
						}
					}
					((Class76) this).aHa_Sub3_585.method1953(-127,
							Class98_Sub43_Sub3.aClass65_5926, 0);
				} while (false);
				if (i == 69) {
					break;
				}
				method743(-119, true);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jh.B(" + i
						+ ',' + bool + ')');
			}
			break;
		} while (false);
	}

	static {
		anIntArray3743 = new int[50];
	}
}
