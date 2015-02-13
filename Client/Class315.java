/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class315 implements Interface21 {
	String aString3519;
	int anInt3520;
	int anInt3521;
	Class110 aClass110_3522;
	int anInt3523;
	int anInt3524;
	int anInt3525;
	int anInt3526;
	static String[] aStringArray3527 = new String[200];
	Class63 aClass63_3528;
	static client aClient3529;
	int anInt3530;
	int anInt3531;
	int anInt3532;
	static IncomingOpcode aClass58_3533 = new IncomingOpcode(93, 6);
	int anInt3534;

	public final Class113 method70(int i) {
		try {
			if (i != 30778)
				aClient3529 = null;
			return Class308.aClass113_2582;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tga.A(" + i + ')');
		}
	}

	public static void method3645(boolean bool) {
		try {
			aStringArray3527 = null;
			aClient3529 = null;
			if (bool == false)
				aClass58_3533 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tga.C(" + bool
					+ ')');
		}
	}

	static final void method3646(int i) {
		try {
			if (i <= -31)
				Class246_Sub4_Sub1.aClass79_6170.method806((byte) -118);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tga.D(" + i + ')');
		}
	}

	static final void method3647(boolean bool, boolean bool_0_, String string,
			boolean bool_1_, Class88 class88) {
		try {
			if (bool_1_ == true) {
				if (bool) {
					if (Class88.aString699.startsWith("win")
							&& ((Class88) class88).aBoolean682) {
						String string_2_ = null;
						if (Class76_Sub11.anApplet3799 != null)
							string_2_ = Class76_Sub11.anApplet3799
									.getParameter("haveie6");
						if (string_2_ == null || !string_2_.equals("1")) {
							Class143 class143 = Class98_Sub10_Sub32.method1097(
									-18871, string, class88, 0);
							Class364.aClass88_3104 = class88;
							Class113.aClass143_953 = class143;
							Class246_Sub3_Sub4_Sub2_Sub1.aString6507 = string;
							return;
						}
					}
					if (Class88.aString699.startsWith("mac")) {
						String string_3_ = null;
						if (Class76_Sub11.anApplet3799 != null)
							string_3_ = Class76_Sub11.anApplet3799
									.getParameter("havefirefox");
						if (string_3_ != null && string_3_.equals("1")
								&& bool_0_) {
							Class98_Sub10_Sub32.method1097(-18871, string,
									class88, 1);
							return;
						}
					}
					Class98_Sub10_Sub32.method1097(-18871, string, class88, 2);
				} else
					Class98_Sub10_Sub32.method1097(-18871, string, class88, 3);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tga.B(" + bool
					+ ',' + bool_0_ + ',' + (string != null ? "{...}" : "null")
					+ ',' + bool_1_ + ','
					+ (class88 != null ? "{...}" : "null") + ')'));
		}
	}

	Class315(String string, Class63 class63, Class110 class110, int i,
			int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_, int i_11_, int i_12_) {
		try {
			((Class315) this).anInt3530 = i_7_;
			((Class315) this).anInt3524 = i_5_;
			((Class315) this).anInt3525 = i_10_;
			((Class315) this).aClass63_3528 = class63;
			((Class315) this).anInt3523 = i_11_;
			((Class315) this).anInt3532 = i_8_;
			((Class315) this).anInt3534 = i_6_;
			((Class315) this).anInt3521 = i;
			((Class315) this).anInt3526 = i_9_;
			((Class315) this).anInt3531 = i_12_;
			((Class315) this).anInt3520 = i_4_;
			((Class315) this).aClass110_3522 = class110;
			((Class315) this).aString3519 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("tga.<init>(" + (string != null ? "{...}" : "null") + ','
							+ (class63 != null ? "{...}" : "null") + ','
							+ (class110 != null ? "{...}" : "null") + ',' + i
							+ ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_
							+ ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ','
							+ i_11_ + ',' + i_12_ + ')'));
		}
	}
}
