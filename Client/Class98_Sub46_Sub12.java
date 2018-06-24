/* Class98_Sub46_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub12 extends Class98_Sub46 {
	private Class377 aClass377_6033;
	static boolean[][] aBooleanArrayArray6034 = { new boolean[4],
			new boolean[4], { false, false, true, false },
			{ false, false, true, false }, { false, false, true, false },
			{ false, false, true, false }, { true, false, true, false },
			{ true, false, false, true }, { true, false, false, true },
			new boolean[4], new boolean[4], new boolean[4], new boolean[4] };
	static long aLong6035 = 0L;

	final int method1585(final int i, final boolean bool, final int i_0_) {
		try {
			if (aClass377_6033 == null) {
				return i_0_;
			}
			final Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass377_6033
					.method3990(i, -1);
			if (bool != true) {
				method1586(62, (byte) 80, null);
			}
			if (class98_sub34 == null) {
				return i_0_;
			}
			return class98_sub34.anInt4126;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hd.B(" + i + ','
					+ bool + ',' + i_0_ + ')'));
		}
	}

	final String method1586(final int i, final byte i_1_, final String string) {
		try {
			if (aClass377_6033 == null) {
				return string;
			}
			if (i_1_ != -19) {
				method1587((byte) 49);
			}
			final Class98_Sub15 class98_sub15 = ((Class98_Sub15) aClass377_6033
					.method3990(i, i_1_ ^ 0x12));
			if (class98_sub15 == null) {
				return string;
			}
			return class98_sub15.aString3917;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hd.C(" + i + ','
					+ i_1_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	public Class98_Sub46_Sub12() {
		/* empty */
	}

	public static void method1587(final byte i) {
		do {
			try {
				aBooleanArrayArray6034 = null;
				if (i <= -67) {
					break;
				}
				aLong6035 = 71L;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hd.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method1588(final int i, final ByteBuffer class98_sub22) {
		try {
			if (i != 0) {
				aBooleanArrayArray6034 = null;
			}
			for (;;) {
				final int i_2_ = class98_sub22.readUnsignedByte((byte) -98);
				if (i_2_ == 0) {
					break;
				}
				method1589(i_2_, true, class98_sub22);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hd.A(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1589(final int i, final boolean bool,
			final ByteBuffer class98_sub22) {
		try {
			if (i == 249) {
				final int i_3_ = class98_sub22.readUnsignedByte((byte) -128);
				if (aClass377_6033 == null) {
					final int i_4_ = Class48.method453(423660257, i_3_);
					aClass377_6033 = new Class377(i_4_);
				}
				for (int i_5_ = 0; (i_3_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
					final boolean bool_6_ = ((class98_sub22
							.readUnsignedByte((byte) 41) ^ 0xffffffff) == -2);
					final int i_7_ = class98_sub22.readMediumInt(-124);
					Node node;
					if (bool_6_) {
						node = new Class98_Sub15(
								class98_sub22.readString((byte) 84));
					} else {
						node = new Class98_Sub34(class98_sub22.readInt(-2));
					}
					aClass377_6033.method3996(node, i_7_, -1);
				}
			}
			if (bool != true) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(
							runtimeexception,
							("hd.E("
									+ i
									+ ','
									+ bool
									+ ','
									+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}
}
