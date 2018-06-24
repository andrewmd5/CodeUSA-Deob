/* Class368 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;

final class Class368 {
	String aString3123;
	static int anInt3124 = 0;
	String aString3125;
	static Class63 aClass63_3126 = new Class63();
	String aString3127;
	static int anInt3128 = -1;

	public static void method3949(final byte i) {
		try {
			if (i != 49) {
				method3949((byte) -9);
			}
			aClass63_3126 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "we.A(" + i + ')');
		}
	}

	static final Class77 method3950(final byte i, final Component component) {
		try {
			if (i != 10) {
				method3950((byte) 67, null);
			}
			return new Class77_Sub1(component);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("we.B(" + i + ','
					+ (component != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3951(final byte i) {
		try {
			if (Class224_Sub3_Sub1.aBoolean6144) {
				while ((Class98_Sub9.anInt3854 ^ 0xffffffff) > (Class98_Sub28_Sub1.aClass53_Sub1Array5805.length ^ 0xffffffff)) {
					final Class53_Sub1 class53_sub1 = (Class98_Sub28_Sub1.aClass53_Sub1Array5805[Class98_Sub9.anInt3854]);
					if (class53_sub1 == null
							|| (class53_sub1.anInt3631 ^ 0xffffffff) != 0) {
						Class98_Sub9.anInt3854++;
					} else {
						if (Class220.aClass98_Sub4_1657 == null) {
							Class220.aClass98_Sub4_1657 = (Class48_Sub2_Sub1.aClass265_5531
									.method3229(90, (class53_sub1.aString3634)));
						}
						final int i_1_ = (Class220.aClass98_Sub4_1657.anInt3827);
						if (i_1_ == -1) {
							break;
						}
						Class220.aClass98_Sub4_1657 = null;
						Class98_Sub9.anInt3854++;
						class53_sub1.anInt3631 = i_1_;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "we.C(" + i + ')');
		}
	}

	Class368(final String string, final String string_2_, final String string_3_) {
		try {
			aString3125 = string_3_;
			aString3127 = string;
			aString3123 = string_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("we.<init>("
					+ (string != null ? "{...}" : "null") + ','
					+ (string_2_ != null ? "{...}" : "null") + ','
					+ (string_3_ != null ? "{...}" : "null") + ')'));
		}
	}
}
