/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class242 {
	static Class88 aClass88_1848;
	static Class85 aClass85_1849 = new Class85(13, 16);
	Class358 aClass358_1850 = new Class358();
	static Class244[] aClass244Array1851 = null;

	public static void method2933(int i) {
		try {
			if (i > -30)
				aClass88_1848 = null;
			aClass88_1848 = null;
			aClass244Array1851 = null;
			aClass85_1849 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pf.A(" + i + ')');
		}
	}

	static final int method2934(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = i_0_ - -(57 * i_1_);
			if (i != 11348)
				method2935((byte) 75, null);
			i_2_ ^= i_2_ << 952799405;
			int i_3_ = (0x7fffffff & 1376312589
					+ (789221 + i_2_ * i_2_ * 15731) * i_2_);
			return 0xff & i_3_ >> -1652763981;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pf.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public Class242() {
		/* empty */
	}

	static final void method2935(byte i, Class207 class207) {
		do {
			try {
				Class42_Sub1_Sub1.aClass207_6206 = class207;
				if (i > 15)
					break;
				method2933(-93);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("pf.C(" + i
						+ ',' + (class207 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
