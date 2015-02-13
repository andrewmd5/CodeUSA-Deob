/* Class98_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub21 extends Class98 {
	int anInt3976;
	int anInt3977;
	String aString3978;
	int anInt3979;
	boolean aBoolean3980;
	Object[] anObjectArray3981;
	Class293 aClass293_3982;
	private static short[] aShortArray3983 = { -10304, 9104, 25485, 4620, 4540 };
	int anInt3984;
	int anInt3985;
	Class293 aClass293_3986;
	static short[][] aShortArrayArray3987;
	private static short[] aShortArray3988 = { -1, -1, -1, -1, -1 };
	private static short[] aShortArray3989 = { 6798, 8741, 25238, 4626, 4550 };
	int anInt3990;

	static final int method1176(final boolean bool) {
		try {
			if (Class98_Sub46.anInt4261 == 1) {
				return Class48_Sub1_Sub2.anInt5519;
			}
			if (bool != false) {
				aShortArray3989 = null;
			}
			return Class149.anInt1208;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "je.E(" + bool
					+ ')');
		}
	}

	public static void method1177(final int i) {
		try {
			aShortArray3989 = null;
			aShortArrayArray3987 = null;
			aShortArray3983 = null;
			if (i != 24301) {
				method1177(-117);
			}
			aShortArray3988 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "je.A(" + i + ')');
		}
	}

	static final boolean method1178(final int i) {
		try {
			if (i != 13299) {
				aShortArrayArray3987 = null;
			}
			try {
				if ((Class257.anInt1948 ^ 0xffffffff) == -3) {
					if (Class81.aClass98_Sub7_620 == null) {
						Class81.aClass98_Sub7_620 = Class98_Sub7
								.method985(Class269.aClass207_2025,
										Class98_Sub18.anInt3951,
										Class76_Sub8.anInt3770);
						if (Class81.aClass98_Sub7_620 == null) {
							return false;
						}
					}
					if (Class202.aClass308_1550 == null) {
						Class202.aClass308_1550 = new Class308(
								Class94.aClass207_793,
								Class98_Sub34.aClass207_4127);
					}
					Class98_Sub31_Sub2 class98_sub31_sub2 = Class366.aClass98_Sub31_Sub2_3122;
					if (Class116.aClass98_Sub31_Sub2_965 != null) {
						class98_sub31_sub2 = Class116.aClass98_Sub31_Sub2_965;
					}
					if (class98_sub31_sub2.method1352(
							Class81.aClass98_Sub7_620, 22050,
							Class202.aClass308_1550,
							Class64_Sub1.aClass207_3641, false)) {
						Class366.aClass98_Sub31_Sub2_3122 = class98_sub31_sub2;
						Class366.aClass98_Sub31_Sub2_3122.method1358((byte) 23);
						if (Class22.anInt219 <= 0) {
							Class257.anInt1948 = 0;
							Class366.aClass98_Sub31_Sub2_3122.method1366(
									Class224_Sub3.anInt5037, (byte) 124);
							for (int i_0_ = 0; ((Class77_Sub1.anIntArray3804.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
								Class366.aClass98_Sub31_Sub2_3122.method1363(
										-17, i_0_,
										Class77_Sub1.anIntArray3804[i_0_]);
								Class77_Sub1.anIntArray3804[i_0_] = 255;
							}
						} else {
							Class257.anInt1948 = 3;
							Class366.aClass98_Sub31_Sub2_3122
									.method1366(
											(Class224_Sub3.anInt5037 < Class22.anInt219 ? Class224_Sub3.anInt5037
													: Class22.anInt219),
											(byte) 33);
							for (int i_1_ = 0; i_1_ < Class77_Sub1.anIntArray3804.length; i_1_++) {
								Class366.aClass98_Sub31_Sub2_3122.method1363(
										-17, i_1_,
										Class77_Sub1.anIntArray3804[i_1_]);
								Class77_Sub1.anIntArray3804[i_1_] = 255;
							}
						}
						if (Class116.aClass98_Sub31_Sub2_965 == null) {
							if ((Class133.aLong3455 ^ 0xffffffffffffffffL) < -1L) {
								Class366.aClass98_Sub31_Sub2_3122.method1341(
										true, Class1.aBoolean66,
										Class81.aClass98_Sub7_620,
										Class133.aLong3455, -3);
							} else {
								Class366.aClass98_Sub31_Sub2_3122.method1332(
										Class1.aBoolean66,
										Class81.aClass98_Sub7_620, (byte) -4);
							}
						}
						if (Class270.aClass268_2032 != null) {
							Class270.aClass268_2032.method3252(i + -13299,
									Class366.aClass98_Sub31_Sub2_3122);
						}
						Class269.aClass207_2025 = null;
						Class202.aClass308_1550 = null;
						Class81.aClass98_Sub7_620 = null;
						Class133.aLong3455 = 0L;
						Class116.aClass98_Sub31_Sub2_965 = null;
						return true;
					}
				}
			} catch (final Exception exception) {
				exception.printStackTrace();
				Class366.aClass98_Sub31_Sub2_3122.method1364(98);
				Class269.aClass207_2025 = null;
				Class202.aClass308_1550 = null;
				Class257.anInt1948 = 0;
				Class81.aClass98_Sub7_620 = null;
				Class116.aClass98_Sub31_Sub2_965 = null;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "je.C(" + i + ')');
		}
	}

	static final boolean method1179(final int i, final int i_2_) {
		try {
			if (i_2_ != 255) {
				aShortArray3983 = null;
			}
			if (i != 49 && i != 59 && i != 1006 && i != 21 && i != 9) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "je.B(" + i + ','
					+ i_2_ + ')');
		}
	}

	static final int method1180(final int i, final byte i_3_, final int i_4_,
			final int i_5_, final int i_6_) {
		try {
			final int i_8_ = (65536 - Class284_Sub2_Sub2.anIntArray6202[8192
					* i_5_ / i] >> -219666591);
			return ((i_8_ * i_6_ >> -23038832) + (i_4_ * (65536 - i_8_) >> 1646652976));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("je.D(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	public Class98_Sub21() {
		/* empty */
	}

	static {
		aShortArrayArray3987 = new short[][] { aShortArray3989,
				aShortArray3983, aShortArray3988 };
	}
}
