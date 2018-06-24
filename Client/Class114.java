/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class114 {
	int anInt956;
	String aString957;
	static int[] anIntArray958 = new int[3];

	static final boolean method2147(final char c, final int i) {
		try {
			if (i <= 104) {
				return true;
			}
			if (((c ^ 0xffffffff) > -49 || c > 57) && (c < 65 || c > 90)
					&& (c < 97 || c > 122)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hga.A(" + c + ','
					+ i + ')');
		}
	}

	static final void method2148() {
		for (int i = 0; i < Class347.anInt2907; i++) {
			final Class246_Sub3_Sub4 class246_sub3_sub4 = Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273[i];
			Class99.method1687(class246_sub3_sub4, true);
			Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273[i] = null;
		}
		Class347.anInt2907 = 0;
	}

	static final Class267 method2149(final int i, final int i_0_) {
		try {
			final Class267 class267 = new Class267(i, false);
			return class267;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hga.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method2150(final int i) {
		do {
			try {
				anIntArray958 = null;
				if (i == 0) {
					break;
				}
				anIntArray958 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hga.E(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final Class244 method2151(final int i, final boolean bool,
			final ha var_ha, final boolean bool_2_) {
		try {
			if ((i ^ 0xffffffff) == 0) {
				return null;
			}
			if (Class2.anIntArray70 != null) {
				for (int i_3_ = 0; ((i_3_ ^ 0xffffffff) > (Class2.anIntArray70.length ^ 0xffffffff)); i_3_++) {
					if (Class2.anIntArray70[i_3_] == i) {
						return Class242.aClass244Array1851[i_3_];
					}
				}
			}
			Class244 class244 = (Class244) Class232.aClass79_1740.method802(
					-123, i);
			if (class244 != null) {
				if (bool && class244.aClass197_1858 == null) {
					final Class197 class197 = Class119_Sub1.method2182(
							(Class64_Sub17.aClass207_3687), true, i);
					if (class197 == null) {
						return null;
					}
					class244.aClass197_1858 = class197;
				}
				return class244;
			}
			final Class324[] class324s = Class324.method3684(
					Class64_Sub16.aClass207_3683, i);
			if (class324s == null) {
				return null;
			}
			if (bool_2_ != true) {
				method2149(-104, 72);
			}
			final Class197 class197 = Class119_Sub1.method2182(
					Class64_Sub17.aClass207_3687, true, i);
			if (class197 == null) {
				return null;
			}
			if (!bool) {
				class244 = new Class244(var_ha.method1804(class197, class324s,
						true));
			} else {
				class244 = new Class244(var_ha.method1804(class197, class324s,
						true), class197);
			}
			Class232.aClass79_1740.method805(i, class244, (byte) -80);
			return class244;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hga.B(" + i + ','
					+ bool + ',' + (var_ha != null ? "{...}" : "null") + ','
					+ bool_2_ + ')'));
		}
	}
}
