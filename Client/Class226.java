/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class226 {
	static int[] anIntArray1699 = new int[3];
	int anInt1700;
	int anInt1701;
	int anInt1702;
	int anInt1703;
	int anInt1704;
	static int anInt1705;
	static int anInt1706;
	int anInt1707;

	public static void method2853(final int i) {
		do {
			try {
				anIntArray1699 = null;
				if (i == 1) {
					break;
				}
				method2854(true, false, 46, null, -102, 74, -54);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "oga.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public Class226() {
		/* empty */
	}

	static final void method2854(final boolean bool, final boolean bool_0_,
			final int i, final Class207 class207, final int i_1_,
			final int i_2_, final int i_3_) {
		try {
			Class76_Sub8.anInt3770 = i_1_;
			Class257.anInt1948 = 1;
			Class224_Sub3.anInt5037 = i;
			Class1.aBoolean66 = bool_0_;
			Class98_Sub18.anInt3951 = i_3_;
			Class269.aClass207_2025 = class207;
			Class348.anInt2911 = i_2_;
			if (bool != false) {
				method2853(44);
			}
			Class116.aClass98_Sub31_Sub2_965 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oga.A(" + bool
					+ ',' + bool_0_ + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ',' + i_1_ + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}
}
