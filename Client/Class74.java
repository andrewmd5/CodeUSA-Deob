/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class74 {
	private Class377 aClass377_545;
	static byte[] aByteArray546 = { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127,
			-29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118,
			118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126,
			17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29,
			101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91,
			11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60,
			-36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7,
			24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5,
			25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6,
			40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40,
			42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2,
			-108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38,
			-78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96,
			104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18,
			-110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106,
			86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17,
			-111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101,
			-27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38,
			79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39,
			-14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18,
			58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107,
			-85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123,
			-2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97,
			-65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117,
			-119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2,
			65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70,
			14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84,
			116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35,
			-50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79,
			48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22,
			-16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2,
			0, 0 };
	static Class164 aClass164_547 = new Class164(2);
	private int anInt548;
	private final Class215 aClass215_549 = new Class215();
	private int anInt550;
	static boolean[][] aBooleanArrayArray551;

	final void method722(final boolean bool) {
		try {
			if (bool == true) {
				aClass215_549.method2786(16711680);
				aClass377_545.method3994(-67);
				anInt550 = anInt548;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ep.K(" + bool
					+ ')');
		}
	}

	private final void method723(final int i, final Interface20 interface20,
			final Object object, final boolean bool) {
		try {
			if ((i ^ 0xffffffff) < (anInt548 ^ 0xffffffff)) {
				throw new IllegalStateException("s>cs");
			}
			method731(interface20, bool);
			anInt550 -= i;
			while (anInt550 < 0) {
				final Class98_Sub46_Sub20 class98_sub46_sub20 = ((Class98_Sub46_Sub20) aClass215_549
						.method2789(-16711936));
				method728(class98_sub46_sub20, (byte) -100);
			}
			final Class98_Sub46_Sub20_Sub2 class98_sub46_sub20_sub2 = new Class98_Sub46_Sub20_Sub2(
					interface20, object, i);
			aClass377_545.method3996(class98_sub46_sub20_sub2,
					interface20.method69(!bool), -1);
			aClass215_549.method2785(class98_sub46_sub20_sub2, -51);
			((Class98_Sub46) class98_sub46_sub20_sub2).aLong4259 = 0L;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ep.I(" + i + ','
					+ (interface20 != null ? "{...}" : "null") + ','
					+ (object != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void method724(final byte i, final int i_0_) {
		try {
			if (Class39_Sub1.aClass277_3590 != null) {
				for (Class98_Sub46_Sub20 class98_sub46_sub20 = (Class98_Sub46_Sub20) aClass215_549
						.method2792(-1); class98_sub46_sub20 != null; class98_sub46_sub20 = (Class98_Sub46_Sub20) aClass215_549
						.method2787(0)) {
					if (class98_sub46_sub20.method1638(896)) {
						if (class98_sub46_sub20.method1635(121) == null) {
							class98_sub46_sub20.method942(114);
							class98_sub46_sub20.method1524((byte) -90);
							anInt550 += (class98_sub46_sub20.anInt6072);
						}
					} else if (++((Class98_Sub46) class98_sub46_sub20).aLong4259 > i_0_) {
						final Class98_Sub46_Sub20 class98_sub46_sub20_1_ = Class39_Sub1.aClass277_3590
								.method3290(class98_sub46_sub20, (byte) -33);
						aClass377_545.method3996(class98_sub46_sub20_1_,
								(((Class98) class98_sub46_sub20).aLong832), -1);
						Class101.method1697(class98_sub46_sub20, (byte) 37,
								class98_sub46_sub20_1_);
						class98_sub46_sub20.method942(82);
						class98_sub46_sub20.method1524((byte) -90);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ep.D(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method725(final int i) {
		do {
			try {
				for (Class98_Sub46_Sub20 class98_sub46_sub20 = (Class98_Sub46_Sub20) aClass215_549
						.method2792(-1); class98_sub46_sub20 != null; class98_sub46_sub20 = ((Class98_Sub46_Sub20) aClass215_549
						.method2787(i + -13937))) {
					if (class98_sub46_sub20.method1638(i ^ 0x35f1)) {
						class98_sub46_sub20.method942(i + -13861);
						class98_sub46_sub20.method1524((byte) -90);
						anInt550 += (class98_sub46_sub20.anInt6072);
					}
				}
				if (i == 13937) {
					break;
				}
				method727((byte) -57);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ep.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final int method726(final boolean bool) {
		try {
			if (bool != true) {
				aByteArray546 = null;
			}
			return anInt550;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ep.A(" + bool
					+ ')');
		}
	}

	public static void method727(final byte i) {
		do {
			try {
				aBooleanArrayArray551 = null;
				aClass164_547 = null;
				aByteArray546 = null;
				if (i == 5) {
					break;
				}
				aClass164_547 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ep.L(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	private final void method728(final Class98_Sub46_Sub20 class98_sub46_sub20,
			final byte i) {
		do {
			try {
				if (class98_sub46_sub20 != null) {
					class98_sub46_sub20.method942(89);
					class98_sub46_sub20.method1524((byte) -90);
					anInt550 += (class98_sub46_sub20.anInt6072);
				}
				if (i == -100) {
					break;
				}
				method724((byte) -95, -14);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ep.J("
						+ (class98_sub46_sub20 != null ? "{...}" : "null")
						+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method729(final Object object, final Interface20 interface20,
			final boolean bool) {
		try {
			method723(1, interface20, object, bool);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("ep.E(" + (object != null ? "{...}" : "null") + ','
							+ (interface20 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	final int method730(final int i) {
		try {
			if (i != -19536) {
				return 7;
			}
			return anInt548;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ep.F(" + i + ')');
		}
	}

	private final void method731(final Interface20 interface20,
			final boolean bool) {
		try {
			if (bool != false) {
				method728(null, (byte) -125);
			}
			final long l = interface20.method69(!bool);
			for (Class98_Sub46_Sub20 class98_sub46_sub20 = (Class98_Sub46_Sub20) aClass377_545
					.method3990(l, -1); class98_sub46_sub20 != null; class98_sub46_sub20 = (Class98_Sub46_Sub20) aClass377_545
					.method3993(122)) {
				if (class98_sub46_sub20.anInterface20_6071.method68(22000,
						interface20)) {
					method728(class98_sub46_sub20, (byte) -100);
					break;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("ep.C(" + (interface20 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	final Object method732(final Interface20 interface20, final int i) {
		try {
			if (i != 0) {
				return null;
			}
			final long l = interface20.method69(true);
			for (Class98_Sub46_Sub20 class98_sub46_sub20 = ((Class98_Sub46_Sub20) aClass377_545
					.method3990(l, i ^ 0xffffffff)); class98_sub46_sub20 != null; class98_sub46_sub20 = (Class98_Sub46_Sub20) aClass377_545
					.method3993(-123)) {
				if (class98_sub46_sub20.anInterface20_6071.method68(22000,
						interface20)) {
					final Object object = class98_sub46_sub20.method1635(-97);
					if (object == null) {
						class98_sub46_sub20.method942(53);
						class98_sub46_sub20.method1524((byte) -90);
						anInt550 += (class98_sub46_sub20.anInt6072);
					} else {
						if (class98_sub46_sub20.method1638(896)) {
							final Class98_Sub46_Sub20_Sub2 class98_sub46_sub20_sub2 = (new Class98_Sub46_Sub20_Sub2(
									interface20, object,
									class98_sub46_sub20.anInt6072));
							aClass377_545.method3996(class98_sub46_sub20_sub2,
									(((Class98) class98_sub46_sub20).aLong832),
									-1);
							aClass215_549.method2785(class98_sub46_sub20_sub2,
									i + -68);
							((Class98_Sub46) class98_sub46_sub20_sub2).aLong4259 = 0L;
							class98_sub46_sub20.method942(70);
							class98_sub46_sub20.method1524((byte) -90);
						} else {
							aClass215_549.method2785(class98_sub46_sub20, -97);
							((Class98_Sub46) class98_sub46_sub20).aLong4259 = 0L;
						}
						return object;
					}
				}
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("ep.G("
							+ (interface20 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	Class74(final int i) {
		try {
			anInt550 = i;
			anInt548 = i;
			int i_3_;
			for (i_3_ = 1; (i_3_ + i_3_ ^ 0xffffffff) > (i ^ 0xffffffff); i_3_ += i_3_) {
				/* empty */
			}
			aClass377_545 = new Class377(i_3_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ep.<init>(" + i
					+ ')');
		}
	}

	static final void method733(final long l, final int i) {
		do {
			try {
				try {
					Thread.sleep(l);
				} catch (final InterruptedException interruptedexception) {
					/* empty */
				}
				if (i > 52) {
					break;
				}
				method733(-115L, -9);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ep.H(" + l
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}
}
