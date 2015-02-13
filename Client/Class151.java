/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class151 {
	static int anInt1213 = 0;
	static int anInt1214;
	ha_Sub1 aHa_Sub1_1215;
	static Class63 aClass63_1216;

	public static void method2438(final int i) {
		try {
			if (i != -24883) {
				method2438(14);
			}
			aClass63_1216 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kd.L(" + i + ')');
		}
	}

	abstract boolean method2439(int i);

	abstract void method2440(boolean bool, boolean bool_0_);

	Class151(final ha_Sub1 var_ha_Sub1) {
		try {
			aHa_Sub1_1215 = var_ha_Sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kd.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ')');
		}
	}

	abstract void method2441(int i, int i_1_, int i_2_);

	abstract void method2442(Class42 class42, boolean bool, int i);

	abstract void method2443(boolean bool, int i);

	static final int method2444(final int i, final int i_3_) {
		try {
			return i & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kd.M(" + i + ','
					+ i_3_ + ')');
		}
	}

	abstract void method2445(byte i);
}
