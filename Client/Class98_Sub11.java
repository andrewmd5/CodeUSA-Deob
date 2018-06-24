/* Class98_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub11 extends Node {
	OutgoingOpcode aClass171_3864;
	Class98_Sub22_Sub1 aClass98_Sub22_Sub1_3865;
	static Class148 aClass148_3866 = new Class148();
	int anInt3867;
	static Class85 aClass85_3868;
	int anInt3869;
	static Class98_Sub46_Sub16[] aClass98_Sub46_Sub16Array3870 = new Class98_Sub46_Sub16[14];

	public static void method1123(byte i) {
		try {
			if (i != -90)
				method1124(-18, (byte) 126);
			aClass148_3866 = null;
			aClass98_Sub46_Sub16Array3870 = null;
			aClass85_3868 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "eda.A(" + i + ')');
		}
	}

	static final void method1124(int i, byte i_0_) {
		try {
			Class232.aClass79_1740.method800((byte) 62, i);
			int i_1_ = -64 / ((i_0_ - -10) / 50);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "eda.E(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method1125(byte i) {
		try {
			if ((Class98_Sub33.anInt4117 ^ 0xffffffff) > (Class98_Sub46_Sub2_Sub2.aClass98_Sub11Array6302.length ^ 0xffffffff)) {
				if (i != 6)
					method1124(-24, (byte) -11);
				Class98_Sub46_Sub2_Sub2.aClass98_Sub11Array6302[Class98_Sub33.anInt4117++] = this;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "eda.C(" + i + ')');
		}
	}

	static final void method1126(boolean bool, short[] is, String[] strings) {
		try {
			Class260.method3207(47, is, strings, strings.length - 1, 0);
			if (bool != true)
				method1123((byte) 9);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("eda.B(" + bool
					+ ',' + (is != null ? "{...}" : "null") + ','
					+ (strings != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1127(byte i, int i_2_) {
		do {
			try {
				Class98_Sub36 class98_sub36 = ((Class98_Sub36) Class156_Sub1.aClass377_3277
						.method3990((long) i_2_, i + -68));
				if (class98_sub36 != null) {
					((Class98_Sub36) class98_sub36).aClass237_Sub1_4157
							.method2903(8);
					Class291.method3414(-1,
							(((Class98_Sub36) class98_sub36).aBoolean4154),
							(((Class98_Sub36) class98_sub36).anInt4160));
					class98_sub36.method942(69);
				}
				if (i == 67)
					break;
				method1126(true, null, null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "eda.D(" + i
						+ ',' + i_2_ + ')');
			}
			break;
		} while (false);
	}

	static {
		aClass85_3868 = new Class85(10, 7);
	}
}
