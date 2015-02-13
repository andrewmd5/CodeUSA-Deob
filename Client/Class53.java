/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class53 {
	int anInt426;
	int anInt427;
	static long aLong428 = 0L;
	int anInt429;
	static int anInt430;
	static IncomingOpcode aClass58_431 = new IncomingOpcode(8, 6);

	final boolean method493(int i) {
		try {
			if (i != 9811)
				method496((byte) -66);
			if ((((Class53) this).anInt427 & 0x2 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dl.A(" + i + ')');
		}
	}

	public static void method494(byte i) {
		do {
			try {
				aClass58_431 = null;
				if (i == 116)
					break;
				aLong428 = 16L;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "dl.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final boolean method495(byte i) {
		try {
			if (i <= 119)
				method494((byte) -66);
			if ((((Class53) this).anInt427 & 0x8) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dl.D(" + i + ')');
		}
	}

	final boolean method496(byte i) {
		try {
			if (i <= 42)
				method496((byte) 70);
			if ((((Class53) this).anInt427 & 0x4) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dl.C(" + i + ')');
		}
	}

	final boolean method497(boolean bool) {
		try {
			if (bool != false)
				return true;
			if ((0x1 & ((Class53) this).anInt427) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dl.E(" + bool
					+ ')');
		}
	}

	public Class53() {
		/* empty */
	}
}
