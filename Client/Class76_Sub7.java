/* Class76_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class76_Sub7 extends Class76 {
	static boolean aBoolean3761 = false;
	private Class195 aClass195_3762;
	private float aFloat3763 = 0.0F;
	static Class332[] aClass332Array3764;
	static int[] anIntArray3765;

	public static void method761(final byte i) {
		try {
			if (i == 19) {
				aClass332Array3764 = null;
				anIntArray3765 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kha.F(" + i + ')');
		}
	}

	@Override
	final void method743(final int i, final boolean bool) {
		try {
			((Class76) this).aHa_Sub3_585.method2019(Class288.aClass128_3381,
					Class249.aClass128_1903, 22831);
			if (i < 93) {
				anIntArray3765 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kha.D(" + i + ','
					+ bool + ')');
		}
	}

	@Override
	final void method749(final int i) {
		do {
			try {
				if (i != 8) {
					aClass195_3762 = null;
				}
				if ((((Class76) this).aHa_Sub3_585.method1967(i + 114) ^ 0xffffffff) != -1) {
					break;
				}
				final Class111_Sub3 class111_sub3 = ((Class76) this).aHa_Sub3_585
						.method2061(1);
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 1);
				final Class111_Sub3 class111_sub3_0_ = ((Class76) this).aHa_Sub3_585
						.method1957((byte) -105);
				class111_sub3_0_.method2092(class111_sub3);
				class111_sub3_0_.method2138(1.0F, 0.125F, 0.125F, i + -115);
				class111_sub3_0_.method2141(-122, 0.0F, aFloat3763, 0.0F);
				((Class76) this).aHa_Sub3_585.method2008(
						Class144.aClass258_1168, (byte) 103);
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 0);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "kha.M(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method748(final int i, final boolean bool) {
		try {
			((Class76) this).aHa_Sub3_585.method1951((byte) 120, 1);
			if (i != 69) {
				aClass195_3762 = null;
			}
			((Class76) this).aHa_Sub3_585.method2019(Class288.aClass128_3381,
					Class1.aClass128_64, 22831);
			((Class76) this).aHa_Sub3_585.method2026(0, true, (byte) 27,
					Class300.aClass65_2499, false);
			((Class76) this).aHa_Sub3_585.method1953(-78,
					IncomingOpcode.aClass65_459, 0);
			((Class76) this).aHa_Sub3_585.method1994((byte) 32, 0);
			((Class76) this).aHa_Sub3_585.method1951((byte) 120, 0);
			((Class76) this).aHa_Sub3_585.method1984(2, -16777216);
			((Class76) this).aHa_Sub3_585.method1953(i + -174,
					Class64_Sub16.aClass65_3681, 0);
			method749(8);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kha.B(" + i + ','
					+ bool + ')');
		}
	}

	Class76_Sub7(final ha_Sub3 var_ha_Sub3, final Class195 class195) {
		super(var_ha_Sub3);
		try {
			aClass195_3762 = class195;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kha.<init>("
					+ (var_ha_Sub3 != null ? "{...}" : "null") + ','
					+ (class195 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method762(final int i, final ByteBuffer class98_sub22,
			final boolean bool) {
		try {
			if (Class195.aClass225_1502 != null) {
				try {
					Class195.aClass225_1502.method2846(0L, 0);
					Class195.aClass225_1502.method2852(24, i, -1,
							(class98_sub22.aByteArray3992));
				} catch (final Exception exception) {
					/* empty */
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("kha.A(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	@Override
	final void method746(final int i, final int i_1_, final int i_2_) {
		try {
			if (i_2_ > -75) {
				aClass332Array3764 = null;
			}
			((Class76) this).aHa_Sub3_585.method1951((byte) 120, 1);
			if ((0x80 & i ^ 0xffffffff) == -1) {
				if ((i_1_ & 0x1 ^ 0xffffffff) != -2) {
					if (aClass195_3762.aBoolean1501) {
						((Class76) this).aHa_Sub3_585.method2005(
								(aClass195_3762.anInterface4_Impl1_1498), -1);
					} else {
						((Class76) this).aHa_Sub3_585
								.method2005(
										(aClass195_3762.anInterface4_Impl2Array1503[0]),
										113);
					}
				} else if (!aClass195_3762.aBoolean1501) {
					final int i_3_ = (((Class76) this).aHa_Sub3_585.anInt4556 % 4000 * 16 / 4000);
					((Class76) this).aHa_Sub3_585.method2005(
							(aClass195_3762.anInterface4_Impl2Array1503[i_3_]),
							-122);
				} else {
					aFloat3763 = (((Class76) this).aHa_Sub3_585.anInt4556) % 4000 / 4000.0F;
					((Class76) this).aHa_Sub3_585.method2005(
							aClass195_3762.anInterface4_Impl1_1498, -114);
				}
			} else {
				((Class76) this).aHa_Sub3_585.method2005(null, 102);
			}
			((Class76) this).aHa_Sub3_585.method1951((byte) 120, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kha.E(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final boolean method763(final int i, final int i_4_,
			final boolean bool) {
		try {
			if (bool != false) {
				method763(-71, 94, true);
			}
			return ((Class373_Sub2.method3974(i_4_, i, -35)
					| Class98.method944(i, i_4_, (byte) 85) | Class195
						.method2663(i, i_4_, bool)) & Class246_Sub2.method2973(
					i, i_4_, (byte) -96));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kha.G(" + i + ','
					+ i_4_ + ',' + bool + ')'));
		}
	}

	@Override
	final boolean method745(final byte i) {
		try {
			if (i != 27) {
				return false;
			}
			return aClass195_3762.method2659(i ^ ~0x5776);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kha.H(" + i + ')');
		}
	}

	@Override
	final void method742(final int i, final int i_5_,
			final Interface4 interface4) {
		try {
			((Class76) this).aHa_Sub3_585.method2005(interface4, -119);
			if (i != 6) {
				aClass195_3762 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("kha.I(" + i + ',' + i_5_ + ','
							+ (interface4 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method739(final int i) {
		try {
			((Class76) this).aHa_Sub3_585.method1951((byte) 120, 1);
			((Class76) this).aHa_Sub3_585.method2019(Class249.aClass128_1903,
					Class249.aClass128_1903, 22831);
			if (i == -2) {
				((Class76) this).aHa_Sub3_585.method2051(0, -98,
						Class300.aClass65_2499);
				((Class76) this).aHa_Sub3_585.method1953(-110,
						Class300.aClass65_2499, 0);
				((Class76) this).aHa_Sub3_585.method1994((byte) 119, 1);
				((Class76) this).aHa_Sub3_585.method2005(null, 63);
				((Class76) this).aHa_Sub3_585.method1951((byte) 120, 0);
				((Class76) this).aHa_Sub3_585.method1953(-68,
						Class300.aClass65_2499, 0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kha.C(" + i + ')');
		}
	}
}
