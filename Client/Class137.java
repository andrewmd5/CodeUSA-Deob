/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class137 {
	static Class113 aClass113_1078 = new Class113(2, 2);
	static int anInt1079;
	static Class326 aClass326_1080;
	static int[] anIntArray1081 = { 1, 2, 4, 8 };

	public static void method2275(int i) {
		try {
			int i_0_ = -57 / ((61 - i) / 51);
			anIntArray1081 = null;
			aClass326_1080 = null;
			aClass113_1078 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jfa.B(" + i + ')');
		}
	}

	static final void method2276(String string, int i, String string_1_,
			String string_2_, int i_3_, String string_4_, byte i_5_, int i_6_,
			String string_7_) {
		try {
			Class131 class131 = Class98_Sub46_Sub3.aClass131Array5953[99];
			for (int i_8_ = 99; i_8_ > 0; i_8_--)
				Class98_Sub46_Sub3.aClass131Array5953[i_8_] = Class98_Sub46_Sub3.aClass131Array5953[i_8_
						+ -1];
			if (i_5_ > -50)
				method2275(-6);
			if (class131 != null)
				class131.method2232(i_3_, string_2_, string_1_, string_4_,
						i_6_, string_7_, i, string, -30991);
			else {
				class131 = new Class131(i, i_6_, string_1_, string_7_, string,
						string_4_, i_3_, string_2_);
			}
			Class133.anInt3452++;
			Class98_Sub46_Sub3.aClass131Array5953[0] = class131;
			Class98_Sub3.anInt3825 = Class24.anInt242;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("jfa.A(" + (string != null ? "{...}" : "null") + ',' + i
							+ ',' + (string_1_ != null ? "{...}" : "null")
							+ ',' + (string_2_ != null ? "{...}" : "null")
							+ ',' + i_3_ + ','
							+ (string_4_ != null ? "{...}" : "null") + ','
							+ i_5_ + ',' + i_6_ + ','
							+ (string_7_ != null ? "{...}" : "null") + ')'));
		}
	}
}
