/* Class64_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub10 extends Class64 {
	static int anInt3664;
	static IncomingOpcode aClass58_3665;
	static int anInt3666 = -1;
	static Class85 aClass85_3667;

	final void method550(int i, int i_0_) {
		try {
			((Class64) this).anInt494 = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fe.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	Class64_Sub10(int i, Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	final int method592(byte i) {
		try {
			if (i < 119)
				anInt3666 = -111;
			return ((Class64) this).anInt494;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fe.E(" + i + ')');
		}
	}

	final void method551(byte i) {
		do {
			try {
				if (i <= 118)
					method593(44);
				if ((((Class64) this).anInt494 ^ 0xffffffff) == -2
						|| (((Class64) this).anInt494 ^ 0xffffffff) == -1)
					break;
				((Class64) this).anInt494 = method552(0);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "fe.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	Class64_Sub10(Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	final int method552(int i) {
		try {
			if (i != 0)
				method550(110, -78);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fe.A(" + i + ')');
		}
	}

	final int method556(int i, int i_2_) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fe.F(" + i + ','
					+ i_2_ + ')');
		}
	}

	public static void method593(int i) {
		try {
			aClass58_3665 = null;
			aClass85_3667 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fe.G(" + i + ')');
		}
	}

	static final boolean method594(int i, int i_4_, int i_5_) {
		try {
			if (i_4_ != 6)
				return true;
			if ((i & 0x100100 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fe.D(" + i + ','
					+ i_4_ + ',' + i_5_ + ')'));
		}
	}

	static {
		anInt3664 = -1;
		aClass58_3665 = new IncomingOpcode(64, 6);
		aClass85_3667 = new Class85(12, -1);
	}
}
