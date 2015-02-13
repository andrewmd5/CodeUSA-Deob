/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class94 {
	static Class207 aClass207_793;
	static long[] aLongArray794 = new long[100];
	static int anInt795;
	static Class207 aClass207_796;
	static boolean aBoolean797 = false;

	static final Class154 method914(final int i, final int i_0_, final int i_1_) {
		final Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_0_][i_1_];
		if (class172 == null) {
			return null;
		}
		return class172.aClass154_1325;
	}

	static final Class246_Sub1 method915(final int i, final byte i_2_,
			final boolean bool) {
		try {
			synchronized (Class98_Sub46_Sub20_Sub2.aClass218Array6316) {
				if (i_2_ != -47) {
					return null;
				}
				Class246_Sub1 class246_sub1;
				if (Class98_Sub46_Sub20_Sub2.aClass218Array6316.length > i
						&& !Class98_Sub46_Sub20_Sub2.aClass218Array6316[i]
								.method2812(true)) {
					class246_sub1 = (Class246_Sub1) Class98_Sub46_Sub20_Sub2.aClass218Array6316[i]
							.method2810((byte) -39);
					class246_sub1.method2965((byte) 126);
					Class1.anIntArray65[i]--;
				} else {
					class246_sub1 = new Class246_Sub1();
					class246_sub1.aClass246_Sub6Array5067 = new Class246_Sub6[i];
					for (int i_3_ = 0; i > i_3_; i_3_++) {
						class246_sub1.aClass246_Sub6Array5067[i_3_] = new Class246_Sub6();
					}
				}
				class246_sub1.aBoolean5070 = bool;
				return class246_sub1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fr.C(" + i + ','
					+ i_2_ + ',' + bool + ')'));
		}
	}

	static final void method916(final int i, final Class207 class207,
			final Class207 class207_4_, final Class207 class207_5_,
			final Class207 class207_6_) {
		try {
			Class98_Sub17_Sub1.aClass207_5783 = class207;
			Class340.aClass207_2847 = class207_6_;
			if (i >= -74) {
				method914(109, 98, -81);
			}
			Class166.aClass207_1280 = class207_5_;
			Class159.aClass293ArrayArray1252 = (new Class293[Class98_Sub17_Sub1.aClass207_5783
					.method2752((byte) -11)][]);
			Class246_Sub3_Sub3_Sub1.aBooleanArray6256 = (new boolean[Class98_Sub17_Sub1.aClass207_5783
					.method2752((byte) -11)]);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fr.A(" + i + ','
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class207_4_ != null ? "{...}" : "null") + ','
					+ (class207_5_ != null ? "{...}" : "null") + ','
					+ (class207_6_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method917(final byte i, final int i_7_, final int i_8_) {
		try {
			if (i > -90) {
				return false;
			}
			if (!(Class195.method2663(i_8_, i_7_, false) | (i_8_ & 0x70000 ^ 0xffffffff) != -1)
					&& !Class76_Sub7.method763(i_8_, i_7_, false)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fr.E(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	public static void method918(final int i) {
		do {
			try {
				aLongArray794 = null;
				aClass207_793 = null;
				aClass207_796 = null;
				if (i == -19406) {
					break;
				}
				aClass207_793 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fr.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method919(final String string, final int i, final int i_9_) {
		do {
			try {
				final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
						.method2628(i, -78, 2);
				class98_sub46_sub17.method1626((byte) -103);
				class98_sub46_sub17.aString6052 = string;
				if (i_9_ >= 28) {
					break;
				}
				method915(30, (byte) -45, true);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fr.F("
						+ (string != null ? "{...}" : "null") + ',' + i + ','
						+ i_9_ + ')'));
			}
			break;
		} while (false);
	}

	static {
		anInt795 = -1;
	}
}
