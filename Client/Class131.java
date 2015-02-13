/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;

final class Class131 {
	String aString1032;
	String aString1033;
	String aString1034;
	int anInt1035;
	int anInt1036;
	int anInt1037;
	static Applet anApplet1038;
	int anInt1039;
	int anInt1040;
	String aString1041;
	String aString1042;

	final void method2232(final int i, final String string,
			final String string_0_, final String string_1_, final int i_2_,
			final String string_3_, final int i_4_, final String string_5_,
			final int i_6_) {
		try {
			anInt1037 = Class14.method226(i_6_ ^ ~0x7970);
			aString1032 = string_1_;
			anInt1035 = i_2_;
			aString1041 = string;
			aString1034 = string_3_;
			anInt1039 = Class215.anInt1614;
			anInt1036 = i;
			if (i_6_ != -30991) {
				anInt1036 = -72;
			}
			anInt1040 = i_4_;
			aString1042 = string_5_;
			aString1033 = string_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("it.B(" + i + ',' + (string != null ? "{...}" : "null")
							+ ',' + (string_0_ != null ? "{...}" : "null")
							+ ',' + (string_1_ != null ? "{...}" : "null")
							+ ',' + i_2_ + ','
							+ (string_3_ != null ? "{...}" : "null") + ','
							+ i_4_ + ','
							+ (string_5_ != null ? "{...}" : "null") + ','
							+ i_6_ + ')'));
		}
	}

	public static void method2233(final int i) {
		do {
			try {
				anApplet1038 = null;
				if (i == -11535) {
					break;
				}
				anApplet1038 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "it.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	Class131(final int i, final int i_7_, final String string,
			final String string_8_, final String string_9_,
			final String string_10_, final int i_11_, final String string_12_) {
		try {
			anInt1037 = Class14.method226(120);
			anInt1036 = 33;
			anInt1039 = Class215.anInt1614;
			anInt1040 = i;
			aString1033 = string;
			aString1041 = string_12_;
			aString1032 = string_10_;
			aString1042 = string_9_;
			aString1034 = string_8_;
			anInt1035 = i_7_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("it.<init>(" + i
					+ ',' + i_7_ + ',' + (string != null ? "{...}" : "null")
					+ ',' + (string_8_ != null ? "{...}" : "null") + ','
					+ (string_9_ != null ? "{...}" : "null") + ','
					+ (string_10_ != null ? "{...}" : "null") + ',' + i_11_
					+ ',' + (string_12_ != null ? "{...}" : "null") + ')'));
		}
	}
}
