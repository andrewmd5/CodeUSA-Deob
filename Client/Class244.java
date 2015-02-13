/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class244 {
	Class197 aClass197_1858;
	Class43 aClass43_1859 = null;
	static int anInt1860;
	static Class6 aClass6_1861 = new Class6("WIP", 2);

	static final void method2953(final byte i, final int i_0_, final int i_1_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(0, -71, 15);
			class98_sub46_sub17.method1626((byte) -103);
			class98_sub46_sub17.anInt6051 = i_1_;
			class98_sub46_sub17.anInt6054 = i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pga.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	Class244(final Class43 class43) {
		aClass197_1858 = null;
		try {
			aClass43_1859 = class43;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pga.<init>("
					+ (class43 != null ? "{...}" : "null") + ')');
		}
	}

	Class244(final Class43 class43, final Class197 class197) {
		aClass197_1858 = null;
		try {
			aClass197_1858 = class197;
			aClass43_1859 = class43;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pga.<init>("
					+ (class43 != null ? "{...}" : "null") + ','
					+ (class197 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2954(final int i) {
		try {
			if (i <= 125) {
				aClass6_1861 = null;
			}
			aClass6_1861 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pga.A(" + i + ')');
		}
	}
}
