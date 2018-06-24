/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class290 {
	static int[] anIntArray2198 = new int[14];

	static final void method3411(final int i, final byte i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_, final int i_5_) {
		try {
			if (i_0_ != 7) {
				anIntArray2198 = null;
			}
			for (Class246_Sub7 class246_sub7 = ((Class246_Sub7) Class64_Sub20.aClass218_3694
					.method2803((byte) 15)); class246_sub7 != null; class246_sub7 = (Class246_Sub7) Class64_Sub20.aClass218_3694
					.method2809(false)) {
				if (class246_sub7.anInt5118 <= Class215.anInt1614) {
					class246_sub7.method2965((byte) 5);
				} else {
					Class42_Sub1.method385(i_3_, class246_sub7.anInt5120,
							256 + (class246_sub7.anInt5116 << 1991702313), i_0_
									^ ~0x7, i_4_, class246_sub7.anInt5122 * 2,
							256 + (class246_sub7.anInt5123 << 999372329),
							i_2_ >> -1188035487, i_5_ >> 717151425);
					Class98_Sub10_Sub34.aClass43_5730.method415(~0xffffff
							| class246_sub7.anInt5117,
							class246_sub7.aString5121, i
									- -Class259.anIntArray1957[0], 0,
							(byte) -67, i_1_ - -Class259.anIntArray1957[1]);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rt.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ')'));
		}
	}

	public static void method3412(final int i) {
		try {
			if (i != -1) {
				method3411(110, (byte) -22, 5, 54, 26, 54, 115);
			}
			anIntArray2198 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rt.A(" + i + ')');
		}
	}

	static final void method3413(final int i, final int i_6_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i_6_, i + -72, 8);
			class98_sub46_sub17.method1621(i + i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rt.B(" + i + ','
					+ i_6_ + ')');
		}
	}
}
