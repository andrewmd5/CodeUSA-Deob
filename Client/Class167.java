/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class167 {
	static Class243[] aClass243Array1281 = new Class243[4];
	static int anInt1282;
	int anInt1283 = 0;
	static Class148 aClass148_1284;
	static Object anObject1285;
	static int anInt1286 = -1;

	final void method2527(final ByteBuffer class98_sub22, final int i) {
		do {
			try {
				for (;;) {
					final int i_0_ = class98_sub22.readUnsignedByte((byte) 80);
					if ((i_0_ ^ 0xffffffff) == -1) {
						break;
					}
					method2530(i_0_, class98_sub22, i ^ ~0x3);
				}
				if (i == -2) {
					break;
				}
				method2527(null, -116);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("ld.B(" + (class98_sub22 != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public static void method2528(final byte i) {
		do {
			try {
				aClass148_1284 = null;
				anObject1285 = null;
				aClass243Array1281 = null;
				if (i >= 82) {
					break;
				}
				method2528((byte) -25);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ld.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method2529(final Class246_Sub3 class246_sub3,
			final boolean bool, final boolean bool_1_) {
		class246_sub3.aBoolean5082 = bool_1_;
		if (Class375.aBoolean3170) {
			if (bool) {
				Class98_Sub43_Sub3.aClass245Array5922[Class98_Sub43_Sub3.aClass245Array5922.length - 1]
						.method2960(class246_sub3, 0);
			} else {
				final int i = Class200.method2692(class246_sub3.anInt5085);
				final int i_2_ = (GameObjectDefinitionLoader.anIntArray2521[2]
						* class246_sub3.method2985(false) / class246_sub3.anInt5083);
				final int i_3_ = Class200.method2692((class246_sub3.anInt5085)
						- i_2_);
				final int i_4_ = Class200.method2692((class246_sub3.anInt5085)
						+ i_2_);
				if (i_3_ == i_4_) {
					Class98_Sub43_Sub3.aClass245Array5922[i].method2960(
							class246_sub3, 0);
				} else if (i_4_ - i_3_ == 1) {
					Class98_Sub43_Sub3.aClass245Array5922[Class18.anInt212
							+ i_3_].method2960(class246_sub3, 0);
				} else {
					Class98_Sub43_Sub3.aClass245Array5922[Class98_Sub43_Sub3.aClass245Array5922.length - 1]
							.method2960(class246_sub3, 0);
				}
			}
		} else {
			Class289.method3407(class246_sub3, za_Sub1.aClass98_Sub5Array6077);
		}
	}

	public Class167() {
		/* empty */
	}

	private final void method2530(final int i,
			final ByteBuffer class98_sub22, final int i_5_) {
		do {
			try {
				if ((i ^ 0xffffffff) == -6) {
					anInt1283 = class98_sub22.readUnsignedShort((byte) 127);
				}
				if (i_5_ == 2) {
					break;
				}
				method2531(null, -110);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ld.D(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_5_ + ')'));
			}
			break;
		} while (false);
	}

	static final byte[] method2531(final String string, final int i) {
		try {
			final int i_6_ = string.length();
			if ((i_6_ ^ 0xffffffff) == -1) {
				return new byte[0];
			}
			final int i_7_ = 3 + i_6_ & ~0x3;
			int i_8_ = i_7_ / 4 * 3;
			if (i != 12705) {
				return null;
			}
			do {
				if ((i_6_ ^ 0xffffffff) >= (i_7_ + -2 ^ 0xffffffff)
						|| (Class64_Sub6
								.method574(112, string.charAt(i_7_ - 2)) == -1)) {
					i_8_ -= 2;
					if (!client.aBoolean3553) {
						break;
					}
				}
				if ((i_6_ ^ 0xffffffff) >= (-1 + i_7_ ^ 0xffffffff)
						|| (Class64_Sub6
								.method574(74, string.charAt(i_7_ + -1)) == -1)) {
					i_8_--;
				}
			} while (false);
			final byte[] is = new byte[i_8_];
			Class98_Sub10_Sub37.method1115(0, is, false, string);
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ld.C("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static {
		anInt1282 = 0;
		aClass148_1284 = new Class148();
	}
}
