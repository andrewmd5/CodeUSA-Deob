/* Class224_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Color;

final class Class224_Sub1 extends Class224 {
	static int anInt5031 = 0;
	static IncomingOpcode aClass58_5032;
	static int[] anIntArray5033;
	static int[] anIntArray5034 = { 3, 7, 15 };
	static Class207 aClass207_5035;
	static Color[] aColorArray5036;

	static final String method2834(final int i, String string) {
		try {
			String string_0_ = null;
			if (i != 0) {
				method2835(-70);
			}
			final int i_1_ = string.indexOf("--> ");
			if ((i_1_ ^ 0xffffffff) <= -1) {
				string_0_ = string.substring(0, i_1_ + 4);
				string = string.substring(i_1_ - -4);
			}
			if (string.startsWith("directlogin ")) {
				final int i_2_ = string.indexOf(" ", "directlogin ".length());
				if ((i_2_ ^ 0xffffffff) <= -1) {
					final int i_3_ = string.length();
					string = string.substring(0, i_2_) + " ";
					for (int i_4_ = i_2_ - -1; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
						string += "*";
					}
				}
			}
			if (string_0_ != null) {
				return string_0_ + string;
			}
			return string;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cw.B(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2835(final int i) {
		try {
			aClass207_5035 = null;
			anIntArray5034 = null;
			aColorArray5036 = null;
			anIntArray5033 = null;
			if (i != -15870) {
				method2834(56, null);
			}
			aClass58_5032 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cw.A(" + i + ')');
		}
	}

	static {
		anIntArray5033 = new int[1];
		aClass58_5032 = new IncomingOpcode(33, -2);
		aColorArray5036 = new Color[] { new Color(9179409),
				new Color(16777215), new Color(16726277), new Color(16726277) };
	}
}
