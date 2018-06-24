/* TextureDefinition - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class TextureDefinition {
	byte aByte1816;
	boolean aBoolean1817;
	int anInt1818;
	boolean aBoolean1819;
	byte aByte1820;
	int anInt1821;
	boolean aBoolean1822;
	byte aByte1823;
	boolean aBoolean1824;
	boolean aBoolean1825;
	boolean aBoolean1826;
	boolean aBoolean1827;
	static Class43 aClass43_1828;
	byte aByte1829;
	byte aByte1830;
	short aShort1831;
	byte aByte1832;
	boolean aBoolean1833;
	static Class348 aClass348_1834;
	int anInt1835;
	static int[] anIntArray1836 = new int[2];
	byte aByte1837;

	static final int method2917(final int i,
			final Class98_Sub22_Sub1 class98_sub22_sub1) {
		try {
			if (i != 0) {
				return 89;
			}
			final int i_0_ = class98_sub22_sub1.readBits((byte) -115, 2);
			int i_1_;
			if ((i_0_ ^ 0xffffffff) != -1) {
				if ((i_0_ ^ 0xffffffff) != -2) {
					if ((i_0_ ^ 0xffffffff) == -3) {
						i_1_ = class98_sub22_sub1.readBits((byte) -58, 8);
					} else {
						i_1_ = class98_sub22_sub1.readBits((byte) -110, 11);
					}
				} else {
					i_1_ = class98_sub22_sub1.readBits((byte) -84, 5);
				}
			} else {
				i_1_ = 0;
			}
			return i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pba.A(" + i + ','
					+ (class98_sub22_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2918(final int i) {
		try {
			aClass348_1834 = null;
			if (i >= -28) {
				anIntArray1836 = null;
			}
			anIntArray1836 = null;
			aClass43_1828 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pba.C(" + i + ')');
		}
	}

	static final boolean method2919(final int i, final int i_2_, final int i_3_) {
		try {
			if (i > -49) {
				method2917(-89, null);
			}
			return ((IncomingOpcode.method523(i_3_, -1, i_2_)
					| Class105.method1715(true, i_2_, i_3_) | Class76_Sub9
						.method766(-99, i_3_, i_2_)) & Class93.method901(i_3_,
					i_2_, -122));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pba.D(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method2920(final int i) {
		do {
			try {
				for (int i_4_ = 0; ((i_4_ ^ 0xffffffff) > (Class281.aByteArrayArrayArray2117.length ^ 0xffffffff)); i_4_++) {
					for (int i_5_ = 0; i_5_ < Class281.aByteArrayArrayArray2117[0].length; i_5_++) {
						for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (Class281.aByteArrayArrayArray2117[0][0].length ^ 0xffffffff)); i_6_++) {
							Class281.aByteArrayArrayArray2117[i_4_][i_5_][i_6_] = (byte) 0;
						}
					}
				}
				if (i < -123) {
					break;
				}
				method2920(65);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "pba.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public TextureDefinition() {
		/* empty */
	}

	static {
		aClass348_1834 = new Class348(15, 0, 1, 0);
	}
}
