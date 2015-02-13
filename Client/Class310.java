/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class310 {
	static int anInt2652 = -1;
	static boolean[][] aBooleanArrayArray2653 = {
			{ true, true, true, true, true, true, true, true, true, true, true,
					true, true },
			{ true, true, true, false, false, false, true, true, false, false,
					false, false, true },
			{ true, false, false, false, false, true, true, true, false, false,
					false, false, false },
			{ false, false, true, true, true, true, false, false, false, false,
					false, false, false },
			{ true, true, true, true, true, true, false, false, false, false,
					false, false, false },
			{ true, true, true, false, false, true, true, true, false, false,
					false, false, false },
			{ true, true, false, false, false, true, true, true, false, false,
					false, false, true },
			{ true, true, false, false, false, false, false, true, false,
					false, false, false, false },
			{ false, true, true, true, true, true, true, true, false, false,
					false, false, false },
			{ true, false, false, false, true, true, true, true, true, true,
					false, false, false },
			{ true, true, true, true, true, false, false, false, true, true,
					false, false, false },
			{ true, true, true, false, false, false, false, false, false,
					false, true, true, false },
			new boolean[13],
			{ true, true, true, true, true, true, true, true, true, true, true,
					true, true }, new boolean[13] };

	public static void method3617(final byte i) {
		try {
			if (i >= -11) {
				method3617((byte) -111);
			}
			aBooleanArrayArray2653 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tc.A(" + i + ')');
		}
	}

	static final void method3618(final int i) {
		do {
			try {
				Class356 class356 = null;
				try {
					final Class143 class143 = Class98_Sub43_Sub2.aClass88_5907
							.method875("", true, i + 27480);
					if (i != -5964) {
						break;
					}
					while (class143.anInt1163 == 0) {
						Class246_Sub7.method3131(i + 5964, 1L);
					}
					if ((class143.anInt1163 ^ 0xffffffff) == -2) {
						class356 = (Class356) class143.anObject1162;
						final ByteBuffer class98_sub22 = Class98_Sub9.aClass98_Sub27_3856
								.method1288(true);
						class356.method3882((class98_sub22.aByteArray3992),
								4657, 0, (class98_sub22.position));
					}
				} catch (final Exception exception) {
					/* empty */
				}
				try {
					if (class356 == null) {
						break;
					}
					class356.method3880(true);
				} catch (final Exception exception) {
					/* empty */
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "tc.B(" + i
						+ ')');
			}
		} while (false);
	}
}
