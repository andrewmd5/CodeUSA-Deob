/* Class98_Sub49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub49 extends Node {
	static Class100 aClass100_4283;
	int anInt4284;
	int anInt4285;
	static int anInt4286 = 0;

	static final int method1662(int i, final int i_0_, int i_1_) {
		try {
			if (i_0_ != -1) {
				anInt4286 = -117;
			}
			int i_2_ = 1;
			while (i_1_ > 1) {
				if ((i_1_ & 0x1) != 0) {
					i_2_ *= i;
				}
				i_1_ >>= 1;
				i *= i;
			}
			if (i_1_ == 1) {
				return i * i_2_;
			}
			return i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("waa.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final int method1663(final int i) {
		try {
			if (i != 1) {
				return 24;
			}
			return (0x1df9b4 & anInt4284) >> 682065522;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "waa.F(" + i + ')');
		}
	}

	final boolean method1664(final int i) {
		try {
			if (i != -1) {
				method1664(-109);
			}
			if (((anInt4284 & 0x325ce0) >> 548331733 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "waa.H(" + i + ')');
		}
	}

	public static void method1665(final byte i) {
		try {
			if (i != 116) {
				method1665((byte) 30);
			}
			aClass100_4283 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "waa.C(" + i + ')');
		}
	}

	final boolean method1666(final byte i, final int i_3_) {
		try {
			if (i != -72) {
				return false;
			}
			if ((0x1 & anInt4284 >> 1 + i_3_) == 0) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "waa.G(" + i + ','
					+ i_3_ + ')');
		}
	}

	final boolean method1667(final byte i) {
		try {
			if ((0x1 & anInt4284 >> -1566073674 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "waa.A(" + i + ')');
		}
	}

	final int method1668(final int i) {
		try {
			if (i != -1) {
				method1669(-124);
			}
			return aa_Sub3.method157(anInt4284, (byte) 64);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "waa.D(" + i + ')');
		}
	}

	final boolean method1669(final int i) {
		try {
			if (i != 1964468) {
				return false;
			}
			if ((0x1 & anInt4284 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "waa.E(" + i + ')');
		}
	}

	Class98_Sub49(final int i, final int i_5_) {
		try {
			anInt4285 = i_5_;
			anInt4284 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("waa.<init>(" + i
					+ ',' + i_5_ + ')'));
		}
	}

	static {
		aClass100_4283 = new Class100(64);
	}
}
