/* Class98_Sub46_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub1 extends Class98_Sub46 {
	String aString5941;
	int[] anIntArray5942;
	static boolean aBoolean5943;
	int[] anIntArray5944;
	static int anInt5945;
	char[] aCharArray5946;
	char[] aCharArray5947;
	static Class172[][][] aClass172ArrayArrayArray5948;
	static int anInt5949 = 0;

	private final void method1527(final int i,
			final ByteBuffer class98_sub22, final byte i_0_) {
		try {
			if (i_0_ <= 7) {
				method1527(50, null, (byte) 94);
			}
			if ((i ^ 0xffffffff) != -2) {
				if ((i ^ 0xffffffff) == -3) {
					final int i_1_ = class98_sub22.readUnsignedByte((byte) 30);
					aCharArray5946 = new char[i_1_];
					anIntArray5944 = new int[i_1_];
					for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
						anIntArray5944[i_2_] = class98_sub22
								.readUnsignedShort((byte) 127);
						final byte i_3_ = class98_sub22
								.readSignedByte((byte) -19);
						aCharArray5946[i_2_] = ((i_3_ ^ 0xffffffff) != -1 ? Class64_Sub7
								.method576(i_3_, (byte) 123) : '\0');
					}
				} else if (i == 3) {
					final int i_4_ = class98_sub22.readUnsignedByte((byte) 45);
					anIntArray5942 = new int[i_4_];
					aCharArray5947 = new char[i_4_];
					for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_5_++) {
						anIntArray5942[i_5_] = class98_sub22
								.readUnsignedShort((byte) 127);
						final byte i_6_ = class98_sub22
								.readSignedByte((byte) -19);
						aCharArray5947[i_5_] = (i_6_ == 0 ? '\0' : Class64_Sub7
								.method576(i_6_, (byte) 125));
					}
				}
			} else {
				aString5941 = class98_sub22.readString((byte) 84);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("aw.F(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i_0_ + ')'));
		}
	}

	final int method1528(final int i, final char c) {
		try {
			if (anIntArray5944 == null) {
				return -1;
			}
			for (int i_7_ = 0; i_7_ < anIntArray5944.length; i_7_++) {
				if (c == aCharArray5946[i_7_]) {
					return anIntArray5944[i_7_];
				}
			}
			if (i != -1) {
				anIntArray5942 = null;
			}
			return -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aw.C(" + i + ','
					+ c + ')');
		}
	}

	final int method1529(final char c, final byte i) {
		try {
			if (anIntArray5942 == null) {
				return -1;
			}
			for (int i_8_ = 0; anIntArray5942.length > i_8_; i_8_++) {
				if (c == aCharArray5947[i_8_]) {
					return anIntArray5942[i_8_];
				}
			}
			if (i > -119) {
				return 91;
			}
			return -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aw.E(" + c + ','
					+ i + ')');
		}
	}

	public static void method1530(final boolean bool) {
		try {
			if (bool != true) {
				anInt5949 = 117;
			}
			aClass172ArrayArrayArray5948 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aw.A(" + bool
					+ ')');
		}
	}

	final void method1531(final int i) {
		do {
			try {
				if (i != 32768) {
					anInt5945 = 115;
				}
				if (anIntArray5942 != null) {
					for (int i_9_ = 0; (i_9_ < anIntArray5942.length); i_9_++) {
						anIntArray5942[i_9_] = Class41.method366(
								(anIntArray5942[i_9_]), 32768);
					}
				}
				if (anIntArray5944 == null) {
					break;
				}
				for (int i_10_ = 0; ((anIntArray5944.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++) {
					anIntArray5944[i_10_] = Class41.method366(
							(anIntArray5944[i_10_]), 32768);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "aw.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method1532(final ByteBuffer class98_sub22, final boolean bool) {
		try {
			if (bool != true) {
				aClass172ArrayArrayArray5948 = null;
			}
			for (;;) {
				final int i = class98_sub22.readUnsignedByte((byte) 29);
				if (i == 0) {
					break;
				}
				method1527(i, class98_sub22, (byte) 61);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("aw.D(" + (class98_sub22 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	public Class98_Sub46_Sub1() {
		/* empty */
	}
}
