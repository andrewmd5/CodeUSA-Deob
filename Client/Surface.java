/* Surface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Surface {
	int anInt656;
	Surface aClass87_657;
	byte aByte658;
	int anInt659;
	static Class246_Sub3_Sub4_Sub2_Sub2 aClass246_Sub3_Sub4_Sub2_Sub2_660;
	int anInt661;
	int anInt662;
	int anInt663;
	int anInt664;
	static OutgoingOpcode aClass171_665;
	int anInt666;
	static int[] anIntArray667 = { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91,
			0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83,
			104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16,
			17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66,
			50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36,
			38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224,
			219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6,
			7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0 };
	int anInt668;
	int anInt669;
	int anInt670;
	int anInt671;
	private int anInt672;
	static int anInt673;
	int anInt674;

	public static void method853(final int i) {
		try {
			aClass171_665 = null;
			if (i > -5) {
				method854(-66, -83, -85);
			}
			anIntArray667 = null;
			aClass246_Sub3_Sub4_Sub2_Sub2_660 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fk.C(" + i + ')');
		}
	}

	static final boolean method854(final int i, final int i_0_, final int i_1_) {
		try {
			if (i_0_ != 28733) {
				return true;
			}
			if ((i_1_ & 0x800 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fk.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final boolean method855(final int i, final Class24 class24) {
		try {
			if (class24 == null) {
				return false;
			}
			if (!class24.aBoolean258) {
				return false;
			}
			if (i <= 73) {
				method853(126);
			}
			if (!class24.method284(64, Class278.anInterface6_2060)) {
				return false;
			}
			if (Class248.aClass377_1894.method3990(class24.anInt228, -1) != null) {
				return false;
			}
			if (Class366.aClass377_3114.method3990(class24.anInt246, -1) != null) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fk.E(" + i + ','
					+ (class24 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class92 method856(final int i) {
		try {
			if (i != 0) {
				aByte658 = (byte) -8;
			}
			return Class98_Sub45.method1520(anInt672, i ^ 0x3a23);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fk.A(" + i + ')');
		}
	}

	Surface(final int i, final int i_2_, final int i_3_, final int i_4_,
			final byte i_5_) {
		try {
			anInt661 = i_3_;
			anInt672 = i;
			aByte658 = i_5_;
			anInt674 = i_4_;
			anInt666 = i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fk.<init>(" + i
					+ ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	final Surface method857(final int i, final boolean bool, final int i_6_,
			final int i_7_) {
		try {
			if (bool != true) {
				return null;
			}
			return new Surface(anInt672, i, i_7_, i_6_, aByte658);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fk.D(" + i + ','
					+ bool + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	static {
		aClass171_665 = new OutgoingOpcode(16, -1);
		anInt673 = 1400;
	}
}
