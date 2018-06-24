/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class257 {
	static int anInt1946;
	static Class207 aClass207_1947;
	static int anInt1948 = 0;
	private Class207 aClass207_1949;
	private final Class79 aClass79_1950 = new Class79(64);

	final void method3197(final byte i, final int i_0_) {
		try {
			synchronized (aClass79_1950) {
				if (i != 30) {
					method3199(true, 112);
				}
				aClass79_1950.method800((byte) 62, i_0_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qb.D(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method3198(final int i) {
		try {
			if (i < 48) {
				anInt1946 = -4;
			}
			aClass207_1947 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qb.C(" + i + ')');
		}
	}

	final Class294 method3199(final boolean bool, final int i) {
		try {
			Class294 class294;
			synchronized (aClass79_1950) {
				class294 = (Class294) aClass79_1950.method802(-123, i);
			}
			if (class294 != null) {
				return class294;
			}
			byte[] is;
			synchronized (aClass207_1949) {
				is = aClass207_1949.method2745(i, 32, bool);
			}
			class294 = new Class294();
			if (is != null) {
				class294.method3475(-22400, new ByteBuffer(is));
			}
			synchronized (aClass79_1950) {
				aClass79_1950.method805(i, class294, (byte) -80);
			}
			return class294;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qb.A(" + bool
					+ ',' + i + ')');
		}
	}

	final void method3200(final byte i) {
		try {
			synchronized (aClass79_1950) {
				aClass79_1950.method794(102);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qb.F(" + i + ')');
		}
	}

	static final void method3201(final byte i, final boolean bool) {
		try {
			Class128.method2224(22696);
			if (za_Sub2.method1683(-11297, Class177.anInt1376)) {
				Class196.anInt1511++;
				if ((Class196.anInt1511 ^ 0xffffffff) <= -51 || bool) {
					if (i < 45) {
						method3198(75);
					}
					Class196.anInt1511 = 0;
					if (!Class76_Sub9.aBoolean3788
							&& aa_Sub1.aClass123_3561 != null) {
						Class76_Sub5.anInt3746++;
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(260,
										(Class98_Sub40.aClass171_4193),
										(Class331.aClass117_2811));
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						try {
							Class95.method920((byte) 81);
						} catch (final java.io.IOException ioexception) {
							Class76_Sub9.aBoolean3788 = true;
						}
					}
					Class128.method2224(22696);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qb.E(" + i + ','
					+ bool + ')');
		}
	}

	final void method3202(final byte i) {
		try {
			synchronized (aClass79_1950) {
				if (i != 96) {
					aClass207_1949 = null;
				}
				aClass79_1950.method806((byte) -121);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qb.B(" + i + ')');
		}
	}

	Class257(final Class279 class279, final int i, final Class207 class207) {
		try {
			aClass207_1949 = class207;
			aClass207_1949.method2761(0, 32);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qb.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt1946 = -2;
	}
}
