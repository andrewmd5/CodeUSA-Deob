/* Class342 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class342 {
	static int[] anIntArray2859;
	static int[] anIntArray2860 = new int[1];
	static Class200 aClass200_2861;
	static long aLong2862;

	// Login handle
	static final void finalLogin(final boolean bool, final String string,
			final int i, final String string_0_) {
		try {
			Class98_Sub5.userName = string;
			Class360.passWord = string_0_;
			Class246_Sub3_Sub4_Sub1.aBoolean6244 = bool;
			if (!Class246_Sub3_Sub4_Sub1.aBoolean6244
					&& (Class98_Sub5.userName.equals("") || Class360.passWord
							.equals(""))) {
				Class369.method3952(3, (byte) -55);
			} else {
				Class76_Sub9.aBoolean3788 = false;
				if ((Class98_Sub46_Sub20_Sub2.anInt6317 ^ 0xffffffff) != -2) {

					Class98_Sub48.anInt4277 = 0;
					Class69_Sub1.anInt5330 = -1;
				}
				Class369.method3952(-3, (byte) -55);
				Class139.anInt1087 = 0;
				Class151_Sub9.anInt5020 = 0;
				Class64_Sub16.anInt3680 = 1;
				
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("uq.A(" + bool
					+ ',' + (string != null ? "{...}" : "null") + ',' + i + ','
					+ (string_0_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3815(final int i, final int i_2_) {
		do {
			try {
				Class212.aLong1599 = 1000000000L / i;
				if (i_2_ >= 40) {
					break;
				}
				method3815(-114, -57);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "uq.C(" + i
						+ ',' + i_2_ + ')');
			}
			break;
		} while (false);
	}

	public static void method3816(final int i) {
		try {
			if (i != 30935) {
				finalLogin(true, null, 125, null);
			}
			anIntArray2859 = null;
			aClass200_2861 = null;
			anIntArray2860 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "uq.B(" + i + ')');
		}
	}

	static {
		anIntArray2859 = new int[8];
		aClass200_2861 = new Class200();
	}
}
