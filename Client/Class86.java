/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class86 {
	static float[] aFloatArray640 = new float[16];
	private int anInt641 = -1;
	int anInt642 = -1;
	private int anInt643;
	Class121 aClass121_644;
	int anInt645;
	int anInt646;
	private int anInt647 = -1;
	int anInt648;
	static Class350 aClass350_649;
	int anInt650;
	int anInt651;
	private int anInt652;
	int anInt653;
	private String aString654;
	int anInt655;

	private final void method841(final int i, final int i_0_,
			final ByteBuffer class98_sub22) {
		do {
			try {
				if (i_0_ == 1) {
					anInt655 = class98_sub22.readUnsignedShort((byte) 127);
				} else if ((i_0_ ^ 0xffffffff) == -3) {
					anInt648 = class98_sub22.readMediumInt(-128);
				} else if ((i_0_ ^ 0xffffffff) == -4) {
					anInt641 = class98_sub22.readUnsignedShort((byte) 127);
				} else if (i_0_ == 4) {
					anInt643 = class98_sub22.readUnsignedShort((byte) 127);
				} else if ((i_0_ ^ 0xffffffff) == -6) {
					anInt652 = class98_sub22.readUnsignedShort((byte) 127);
				} else if ((i_0_ ^ 0xffffffff) != -7) {
					if ((i_0_ ^ 0xffffffff) != -8) {
						if ((i_0_ ^ 0xffffffff) != -9) {
							if ((i_0_ ^ 0xffffffff) == -10) {
								anInt651 = class98_sub22.readUnsignedShort((byte) 127);
							} else if (i_0_ == 10) {
								anInt650 = class98_sub22.readUShort(false);
							} else if (i_0_ == 11) {
								anInt645 = 0;
							} else if (i_0_ == 12) {
								anInt642 = class98_sub22
										.readUnsignedByte((byte) -120);
							} else if (i_0_ == 13) {
								anInt646 = class98_sub22.readUShort(false);
							} else if (i_0_ == 14) {
								anInt645 = class98_sub22.readUnsignedShort((byte) 127);
							}
						} else {
							aString654 = class98_sub22.method1223(-1);
						}
					} else {
						anInt653 = class98_sub22.readUShort(false);
					}
				} else {
					anInt647 = class98_sub22.readUnsignedShort((byte) 127);
				}
				if (i <= -7) {
					break;
				}
				method844(2, false, 22, 53, -22, 114, -118, -30);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("fj.C(" + i
						+ ',' + i_0_ + ','
						+ (class98_sub22 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method842(final boolean bool) {
		do {
			try {
				aFloatArray640 = null;
				aClass350_649 = null;
				if (bool == false) {
					break;
				}
				aFloatArray640 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "fj.J(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method843(final int i, final ha var_ha,
			final Class148 class148, final int i_1_, final int i_2_) {
		do {
			try {
				Class8.aClass148_110.method2422((byte) 47);
				if (!Class98_Sub43_Sub1.aBoolean5895) {
					for (Class98_Sub47 class98_sub47 = (Class98_Sub47) class148
							.method2418(32); class98_sub47 != null; class98_sub47 = ((Class98_Sub47) class148
							.method2417(i_1_ + 93))) {
						final Class24 class24 = (Class278.aClass341_2057
								.method3807(i_1_ ^ ~0x65,
										class98_sub47.anInt4268));
						if (Surface.method855(87, class24)) {
							final boolean bool = Class98_Sub40.method1473(
									class24, i, class98_sub47, i_2_, 15924,
									var_ha);
							if (bool) {
								Class103.method1711(var_ha, (byte) 70,
										class98_sub47, class24);
							}
						}
					}
					if (i_1_ == -1) {
						break;
					}
					aFloatArray640 = null;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("fj.F(" + i
						+ ',' + (var_ha != null ? "{...}" : "null") + ','
						+ (class148 != null ? "{...}" : "null") + ',' + i_1_
						+ ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method844(final int i, final boolean bool,
			final int i_3_, final int i_4_, final int i_5_, final int i_6_,
			final int i_7_, final int i_8_) {
		do {
			try {
				if ((!bool ? Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4066
						.method641((byte) 122)
						: Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4054
								.method641((byte) 127)) != 0
						&& i_4_ != 0 && Class306.anInt2566 < 50 && i_7_ != -1) {
					Class245.aClass338Array1865[Class306.anInt2566++] = new Class338(
							!bool ? (byte) 2 : (byte) 3, i_7_, i_4_, i_3_,
							i_5_, i_6_, i, null);
				}
				if (i_8_ < -58) {
					break;
				}
				method844(-106, false, -53, 52, 126, 31, -86, -57);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("fj.E(" + i
						+ ',' + bool + ',' + i_3_ + ',' + i_4_ + ',' + i_5_
						+ ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	static final String method845(final byte i,
			final Class98_Sub46_Sub8 class98_sub46_sub8) {
		try {
			if (i != -124) {
				method844(-38, false, 87, -74, -69, -59, 2, -40);
			}
			if (class98_sub46_sub8.aString5985 != null
					&& class98_sub46_sub8.aString5985.length() != 0) {
				if ((class98_sub46_sub8.aString5992 == null)
						|| (class98_sub46_sub8.aString5992.length() ^ 0xffffffff) >= -1) {
					return ((class98_sub46_sub8.aString5994)
							+ Class309.aClass309_2618.method3615(
									Class374.anInt3159, (byte) 25) + (class98_sub46_sub8.aString5985));
				}
				return (class98_sub46_sub8.aString5994
						+ Class309.aClass309_2618.method3615(
								Class374.anInt3159, (byte) 25)
						+ class98_sub46_sub8.aString5992
						+ Class309.aClass309_2618.method3615(
								Class374.anInt3159, (byte) 25) + (class98_sub46_sub8.aString5985));
			}
			if (class98_sub46_sub8.aString5992 == null
					|| (class98_sub46_sub8.aString5992.length() ^ 0xffffffff) >= -1) {
				return class98_sub46_sub8.aString5994;
			}
			return (class98_sub46_sub8.aString5994
					+ Class309.aClass309_2618.method3615(Class374.anInt3159,
							(byte) 25) + class98_sub46_sub8.aString5992);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fj.K(" + i + ','
					+ (class98_sub46_sub8 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class332 method846(final boolean bool, final ha var_ha) {
		try {
			if (anInt641 < 0) {
				return null;
			}
			if (bool != false) {
				anInt655 = 120;
			}
			Class332 class332 = ((Class332) aClass121_644.aClass79_1003
					.method802(-125, anInt641));
			if (class332 == null) {
				method847(-109, var_ha);
				class332 = (Class332) aClass121_644.aClass79_1003.method802(
						-125, anInt641);
			}
			return class332;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fj.A(" + bool
					+ ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method847(final int i, final ha var_ha) {
		do {
			try {
				final Class207 class207 = (aClass121_644.aClass207_1005);
				if (anInt641 >= 0
						&& (aClass121_644.aClass79_1003.method802(-120,
								anInt641) == null)
						&& class207.method2742(-32, anInt641)) {
					final Class324 class324 = Class324.method3683(class207,
							anInt641);
					aClass121_644.aClass79_1003.method805(anInt641,
							var_ha.method1758(class324, true), (byte) -80);
				}
				if (anInt652 >= 0
						&& (aClass121_644.aClass79_1003.method802(-119,
								anInt652) == null)
						&& class207.method2742(-83, anInt652)) {
					final Class324 class324 = Class324.method3683(class207,
							anInt652);
					aClass121_644.aClass79_1003.method805(anInt652,
							var_ha.method1758(class324, true), (byte) -80);
				}
				if ((anInt643 ^ 0xffffffff) <= -1
						&& (aClass121_644.aClass79_1003.method802(-126,
								anInt643) == null)
						&& class207.method2742(-91, anInt643)) {
					final Class324 class324 = Class324.method3683(class207,
							anInt643);
					aClass121_644.aClass79_1003.method805(anInt643,
							var_ha.method1758(class324, true), (byte) -80);
				}
				if ((anInt647 ^ 0xffffffff) > -1
						|| (aClass121_644.aClass79_1003.method802(-123,
								anInt647) != null)
						|| !class207.method2742(-79, anInt647)) {
					break;
				}
				final Class324 class324 = Class324.method3683(class207,
						anInt647);
				aClass121_644.aClass79_1003.method805(anInt647,
						var_ha.method1758(class324, true), (byte) -80);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("fj.G(" + i
						+ ',' + (var_ha != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final String method848(final int i, final int i_10_) {
		try {
			String string = aString654;
			if (i != 22414) {
				anInt652 = 8;
			}
			for (;;) {
				final int i_11_ = string.indexOf("%1");
				if ((i_11_ ^ 0xffffffff) > -1) {
					break;
				}
				string = (string.substring(0, i_11_)
						+ Class44.method428(i_10_, false, false) + string
						.substring(i_11_ + 2));
			}
			return string;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fj.L(" + i + ','
					+ i_10_ + ')');
		}
	}

	final Class332 method849(final ha var_ha, final int i) {
		try {
			if ((anInt643 ^ 0xffffffff) > -1) {
				return null;
			}
			Class332 class332 = ((Class332) aClass121_644.aClass79_1003
					.method802(-127, anInt643));
			if (class332 == null) {
				method847(-83, var_ha);
				class332 = (Class332) aClass121_644.aClass79_1003.method802(
						-128, anInt643);
			}
			return class332;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fj.H("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class332 method850(final int i, final ha var_ha) {
		try {
			if (i < (anInt647 ^ 0xffffffff)) {
				return null;
			}
			Class332 class332 = ((Class332) aClass121_644.aClass79_1003
					.method802(-121, anInt647));
			if (class332 == null) {
				method847(i + 61, var_ha);
				class332 = (Class332) aClass121_644.aClass79_1003.method802(
						-125, anInt647);
			}
			return class332;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fj.I(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final void method851(final ByteBuffer class98_sub22, final int i) {
		do {
			try {
				for (;;) {
					final int i_13_ = class98_sub22.readUnsignedByte((byte) 9);
					if ((i_13_ ^ 0xffffffff) == -1) {
						break;
					}
					method841(-120, i_13_, class98_sub22);
				}
				if (i == -1) {
					break;
				}
				aFloatArray640 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("fj.B(" + (class98_sub22 != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final Class332 method852(final int i, final ha var_ha) {
		try {
			if (anInt652 < 0) {
				return null;
			}
			Class332 class332 = ((Class332) aClass121_644.aClass79_1003
					.method802(-122, anInt652));
			if (i < 11) {
				return null;
			}
			if (class332 == null) {
				method847(45, var_ha);
				class332 = (Class332) aClass121_644.aClass79_1003.method802(
						-128, anInt652);
			}
			return class332;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fj.D(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	public Class86() {
		anInt645 = -1;
		anInt650 = 0;
		anInt648 = 16777215;
		anInt651 = 70;
		anInt643 = -1;
		anInt652 = -1;
		anInt653 = 0;
		anInt646 = 0;
		anInt655 = -1;
		aString654 = "";
	}
}
