/* Class53_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class53_Sub1 extends Class53 {
	String aString3630;
	int anInt3631 = -1;
	int anInt3632;
	static Class164 aClass164_3633 = new Class164(1);
	String aString3634;
	static int anInt3635;
	static int anInt3636 = -1;

	static final void method498(final int i) {
		try {
			for (int i_0_ = i; (Class63.anInt493 ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
				final int i_1_ = (Class198.method2678((byte) 6, i_0_
						- -Class268.anInt2007, Class63.anInt493) * Class191.anInt1477);
				for (int i_2_ = 0; i_2_ < Class191.anInt1477; i_2_++) {
					final int i_3_ = (i_1_ + Class198.method2678((byte) 6,
							Class76_Sub8.anInt3780 + i_2_, Class191.anInt1477));
					if ((Class230.anInt1732 ^ 0xffffffff) == (Class146_Sub2.anIntArray4873[i_3_] ^ 0xffffffff)) {
						Class172.anInterface17Array1327[i_3_].method57(0, 0,
								Class197.anInt1513,
								Class98_Sub10_Sub38.anInt5761,
								Class197.anInt1513 * i_2_, i_0_
										* Class98_Sub10_Sub38.anInt5761, true,
								true);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jha.F(" + i + ')');
		}
	}

	static final boolean method499(final int i, final int i_4_) {
		try {
			if (i != 2048) {
				method502(119, -121, (byte) 95);
			}
			if ((i_4_ ^ 0xffffffff) != -4 && i_4_ != 4 && i_4_ != 5
					&& i_4_ != 6) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jha.G(" + i + ','
					+ i_4_ + ')');
		}
	}

	public static void method500(final int i) {
		try {
			if (i >= -93) {
				method499(86, 125);
			}
			aClass164_3633 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jha.J(" + i + ')');
		}
	}

	final Class114 method501(final int i) {
		try {
			if (i != -1) {
				method500(-79);
			}
			return (Class98_Sub10_Sub36.aClass114Array5744[((Class53) this).anInt426]);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jha.I(" + i + ')');
		}
	}

	static final boolean method502(final int i, final int i_5_, final byte i_6_) {
		try {
			if (i_6_ < 110) {
				method500(-79);
			}
			if ((i_5_ & 0x800 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("jha.H(" + i + ','
					+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	static {
		anInt3635 = -1;
	}
}
