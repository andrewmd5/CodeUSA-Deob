/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IncomingOpcode {
	static Class65 aClass65_459;
	int anInt460;
	static int anInt461 = -1;
	private int anInt462;
	static int anInt463;

	static final Class6[] method520(byte i) {
		try {
			if (i >= -54)
				method522(11);
			return new Class6[] { Class2.aClass6_68, Class1.aClass6_63,
					Class244.aClass6_1861 };
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ea.A(" + i + ')');
		}
	}

	final int method521(byte i) {
		try {
			if (i <= 60)
				method521((byte) -127);
			return anInt462;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ea.C(" + i + ')');
		}
	}

	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					"ea.toString(" + ')');
		}
	}

	IncomingOpcode(int i, int i_0_) {
		try {
			((IncomingOpcode) this).anInt460 = i_0_;
			anInt462 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ea.<init>(" + i
					+ ',' + i_0_ + ')');
		}
	}

	public static void method522(int i) {
		try {
			int i_1_ = -3 / ((-64 - i) / 62);
			aClass65_459 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ea.D(" + i + ')');
		}
	}

	static final boolean method523(int i, int i_2_, int i_3_) {
		try {
			if (i_2_ != -1)
				return true;
			if ((0x21 & i_3_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ea.B(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	static {
		aClass65_459 = new Class65();
	}
}
