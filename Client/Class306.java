/* Class306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class306 {
	static Class332[] aClass332Array2557;
	Class377 aClass377_2558;
	private String aString2559 = "null";
	char aChar2560;
	static int anInt2561;
	static Class376[] aClass376Array2562 = new Class376[2048];
	private int anInt2563;
	private Class377 aClass377_2564;
	static Class348 aClass348_2565;
	static int anInt2566 = 0;
	char aChar2567;

	final void method3593(final ByteBuffer class98_sub22, final int i) {
		do {
			try {
				for (;;) {
					final int i_0_ = class98_sub22.readUnsignedByte((byte) 115);
					if (i_0_ == 0) {
						break;
					}
					method3600(i + -4, class98_sub22, i_0_);
				}
				if (i == 4) {
					break;
				}
				anInt2561 = 4;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("sp.B(" + (class98_sub22 != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final String method3594(final int i, final byte i_1_) {
		try {
			if (aClass377_2558 == null) {
				return aString2559;
			}
			final Class98_Sub15 class98_sub15 = ((Class98_Sub15) aClass377_2558
					.method3990(i, -1));
			if (class98_sub15 == null) {
				return aString2559;
			}
			if (i_1_ < 20) {
				method3597(126);
			}
			return class98_sub15.aString3917;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sp.J(" + i + ','
					+ i_1_ + ')');
		}
	}

	static final Class350[] method3595(final byte i) {
		try {
			if (i < 57) {
				aClass376Array2562 = null;
			}
			return (new Class350[] { Class98_Sub10_Sub31.aClass350_5716,
					Class98_Sub27.aClass350_4074, Class102.aClass350_888 });
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sp.D(" + i + ')');
		}
	}

	final boolean method3596(final int i, final byte i_2_) {
		try {
			if (aClass377_2558 == null) {
				return false;
			}
			if (aClass377_2564 == null) {
				method3599((byte) -59);
			}
			final Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass377_2564
					.method3990(i, -1);
			if (class98_sub34 == null) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sp.H(" + i + ','
					+ i_2_ + ')');
		}
	}

	public static void method3597(final int i) {
		try {
			if (i > 84) {
				aClass376Array2562 = null;
				aClass332Array2557 = null;
				aClass348_2565 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sp.A(" + i + ')');
		}
	}

	final int method3598(final int i, final int i_4_) {
		try {
			if (aClass377_2558 == null) {
				return anInt2563;
			}
			final Class98_Sub34 class98_sub34 = ((Class98_Sub34) aClass377_2558
					.method3990(i, -1));
			if (i_4_ != -28629) {
				return -113;
			}
			if (class98_sub34 == null) {
				return anInt2563;
			}
			return class98_sub34.anInt4126;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sp.G(" + i + ','
					+ i_4_ + ')');
		}
	}

	private final void method3599(final byte i) {
		try {
			aClass377_2564 = new Class377(aClass377_2558.method3997((byte) 106));
			Class98_Sub34 class98_sub34 = ((Class98_Sub34) aClass377_2558
					.method3998(102));
			if (i < -19) {
				for (/**/; class98_sub34 != null; class98_sub34 = ((Class98_Sub34) aClass377_2558
						.method3995(-1))) {
					final Class98_Sub34 class98_sub34_5_ = new Class98_Sub34(
							(int) ((Class98) class98_sub34).aLong832);
					aClass377_2564.method3996(class98_sub34_5_,
							class98_sub34.anInt4126, -1);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sp.C(" + i + ')');
		}
	}

	private final void method3600(final int i,
			final ByteBuffer class98_sub22, final int i_6_) {
		do {
			try {
				if (i_6_ == 1) {
					aChar2560 = Class64_Sub7.method576(
							class98_sub22.readSignedByte((byte) -19),
							(byte) 121);
				} else if (i_6_ != 2) {
					if ((i_6_ ^ 0xffffffff) == -4) {
						aString2559 = class98_sub22.readString((byte) 84);
					} else if (i_6_ == 4) {
						anInt2563 = class98_sub22.readInt(-2);
					} else if ((i_6_ ^ 0xffffffff) == -6
							|| (i_6_ ^ 0xffffffff) == -7) {
						final int i_7_ = class98_sub22.readUnsignedShort((byte) 127);
						aClass377_2558 = new Class377(Class48.method453(
								423660257, i_7_));
						for (int i_8_ = 0; i_7_ > i_8_; i_8_++) {
							final int i_9_ = class98_sub22.readInt(-2);
							Class98 class98;
							if ((i_6_ ^ 0xffffffff) == -6) {
								class98 = (new Class98_Sub15(
										class98_sub22.readString((byte) 84)));
							} else {
								class98 = new Class98_Sub34(
										class98_sub22.readInt(-2));
							}
							aClass377_2558.method3996(class98, i_9_,
									i ^ 0xffffffff);
						}
					}
				} else {
					aChar2567 = Class64_Sub7.method576(
							class98_sub22.readSignedByte((byte) -19),
							(byte) 125);
				}
				if (i == 0) {
					break;
				}
				aClass376Array2562 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("sp.E(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_6_ + ')'));
			}
			break;
		} while (false);
	}

	private final void method3601(final int i) {
		do {
			try {
				aClass377_2564 = new Class377(
						aClass377_2558.method3997((byte) 53));
				for (Class98_Sub15 class98_sub15 = (Class98_Sub15) aClass377_2558
						.method3998(i + 111); class98_sub15 != null; class98_sub15 = (Class98_Sub15) aClass377_2558
						.method3995(i + 3)) {
					final Class98_Sub41 class98_sub41 = new Class98_Sub41(
							(class98_sub15.aString3917),
							(int) (((Class98) class98_sub15).aLong832));
					aClass377_2564.method3996(class98_sub41, Class145
							.method2313((byte) -121,
									(class98_sub15.aString3917)), -1);
				}
				if (i == -4) {
					break;
				}
				method3597(-68);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "sp.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final boolean method3602(final String string, final int i) {
		try {
			if (aClass377_2558 == null) {
				return false;
			}
			if (aClass377_2564 == null) {
				method3601(-4);
			}
			Class98_Sub41 class98_sub41 = ((Class98_Sub41) aClass377_2564
					.method3990(Class145.method2313((byte) -124, string), -1));
			if (i != -16972) {
				return false;
			}
			for (/**/; class98_sub41 != null; class98_sub41 = (Class98_Sub41) aClass377_2564
					.method3993(126)) {
				if (class98_sub41.aString4201.equals(string)) {
					return true;
				}
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sp.I("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public Class306() {
		/* empty */
	}

	static {
		aClass348_2565 = new Class348(4, 1, 1, 1);
	}
}
