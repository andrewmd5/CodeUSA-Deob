/* Class373_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class373_Sub3 extends Class373 {
	static Class85 aClass85_5474 = new Class85(1, 7);
	private Class332 aClass332_5475;
	static long[][][] aLongArrayArrayArray5476;

	static final void method3976(int i, byte i_0_, String string) {
		try {
			Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4.method3023(260,
					PlayerUpdateMask.aClass171_524, Class331.aClass117_2811);
			((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
					.method1194(1 + r_Sub2.method1650(string, (byte) 97), -38);
			if (i_0_ < 65)
				aLongArrayArrayArray5476 = null;
			((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
					.method1188(string, (byte) 113);
			((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
					.method1231(i, (byte) -108);
			Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sq.I(" + i + ','
					+ i_0_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3960(int i, int i_1_, byte i_2_, boolean bool) {
		try {
			Class265.aHa1974
					.method1779(
							i_1_ + -2,
							i,
							4 + ((Class93) ((Class373) this).aClass93_3478).anInt3514,
							((Class93) ((Class373) this).aClass93_3478).anInt3504
									- -2,
							((Class93_Sub2) (Class93_Sub2) ((Class373) this).aClass93_3478).anInt5492,
							0);
			if (i_2_ == -36)
				Class265.aHa1974
						.method1779(
								-1 + i_1_,
								i - -1,
								((Class93) ((Class373) this).aClass93_3478).anInt3514 + 2,
								((Class93) ((Class373) this).aClass93_3478).anInt3504,
								0, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sq.D(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + bool + ')'));
		}
	}

	public final boolean method59(int i) {
		try {
			if (!super.method59(i))
				return false;
			return (((Class373) this).aClass207_3473
					.method2742(
							-87,
							((Class93_Sub2) (Class93_Sub2) ((Class373) this).aClass93_3478).anInt5490));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sq.A(" + i + ')');
		}
	}

	static final void method3977(boolean bool) {
		do {
			try {
				if (bool != true)
					aClass85_5474 = null;
				Class118.method2173(false, -125);
				if ((Class132.anInt1050 ^ 0xffffffff) > -1
						|| (Class132.anInt1050 ^ 0xffffffff) == -1)
					break;
				Class76_Sub4.method754(Class132.anInt1050, false, -117);
				Class132.anInt1050 = -1;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "sq.G(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	Class373_Sub3(Class207 class207, Class207 class207_3_,
			Class93_Sub2 class93_sub2) {
		super(class207, class207_3_, (Class93) class93_sub2);
	}

	public final void method58(byte i) {
		try {
			super.method58(i);
			aClass332_5475 = Class237_Sub1
					.method2915(
							(((Class93_Sub2) (Class93_Sub2) ((Class373) this).aClass93_3478).anInt5490),
							((Class373) this).aClass207_3473, (byte) -89);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sq.C(" + i + ')');
		}
	}

	final void method3965(int i, int i_4_, int i_5_, boolean bool) {
		try {
			int i_6_ = (this.method3963(i + 98)
					* ((Class93) ((Class373) this).aClass93_3478).anInt3514 / 10000);
			int[] is = new int[4];
			Class265.aHa1974.K(is);
			Class265.aHa1974.KA(i_5_, i_4_ + i, i_5_ + i_6_, i_4_
					- -(((Class93) ((Class373) this).aClass93_3478).anInt3504));
			aClass332_5475.method3738(i_5_, 2 + i_4_,
					((Class93) ((Class373) this).aClass93_3478).anInt3514,
					((Class93) ((Class373) this).aClass93_3478).anInt3504);
			Class265.aHa1974.KA(is[0], is[1], is[2], is[3]);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sq.F(" + i + ','
					+ i_4_ + ',' + i_5_ + ',' + bool + ')'));
		}
	}

	static final boolean method3978(int i, int i_7_, byte i_8_) {
		try {
			if (i_8_ <= 53)
				aLongArrayArrayArray5476 = null;
			return ((0x220 & i_7_ ^ 0xffffffff) == -545 | (0x18 & i_7_ ^ 0xffffffff) != -1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sq.H(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	public static void method3979(boolean bool) {
		try {
			if (bool != false)
				aLongArrayArrayArray5476 = null;
			aLongArrayArrayArray5476 = null;
			aClass85_5474 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sq.E(" + bool
					+ ')');
		}
	}
}
