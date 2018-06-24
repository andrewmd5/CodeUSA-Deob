/* Class233 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class233 {
	static int anInt1746;

	static final void method2883(final byte i) {
		try {
			if (i != 111) {
				method2884(96);
			}
			Class299_Sub2.method3523(255, -1, i + -111);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "os.A(" + i + ')');
		}
	}

	static final void method2884(final int i) {
		try {
			Class246_Sub3_Sub4_Sub5.method3084(true);
			Class217.method2799(2, 22050,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub1_4043
							.method558((byte) 127) ^ 0xffffffff) == -2,
					(byte) 124);
			Class145.aClass268_1173 = Class153.method2484(22050, 0,
					(byte) -126, Class98_Sub43_Sub2.aClass88_5907,
					Class42_Sub3.aCanvas5361);
			Class246_Sub3_Sub5_Sub2.method3098(
					Class111_Sub1.method2115(126, null), true, 28643);
			if (i >= 96) {
				Class27.aClass268_276 = Class153.method2484(2048, 1,
						(byte) -126, Class98_Sub43_Sub2.aClass88_5907,
						Class42_Sub3.aCanvas5361);
				Class27.aClass268_276.method3252(0,
						Class81.aClass98_Sub31_Sub3_619);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "os.B(" + i + ')');
		}
	}
}
