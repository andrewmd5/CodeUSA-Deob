/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class170 {
	byte aByte1308;
	short aShort1309;
	short aShort1310;
	static int[][][] anIntArrayArrayArray1311;
	byte aByte1312;
	static boolean aBoolean1313 = false;
	boolean aBoolean1314;
	int anInt1315;
	int anInt1316;
	short aShort1317;

	static final String method2538(final int i, final Class293 class293) {
		try {
			if ((client.method116(class293).method1668(i) ^ 0xffffffff) == -1) {
				return null;
			}
			if (class293.aString2214 == null
					|| (class293.aString2214.trim().length() ^ 0xffffffff) == -1) {
				if (Class15.aBoolean169) {
					return "Hidden-use";
				}
				return null;
			}
			return class293.aString2214;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lfa.A(" + i + ','
					+ (class293 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2539(final byte i) {
		try {
			if (i != 13) {
				aBoolean1313 = true;
			}
			anIntArrayArrayArray1311 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lfa.B(" + i + ')');
		}
	}

	Class170(final int i, final int i_0_, final int i_1_, final int i_2_,
			final int i_3_, final int i_4_, final int i_5_, final int i_6_,
			final int i_7_, final boolean bool, final int i_8_) {
		try {
			aByte1312 = (byte) i_7_;
			aShort1317 = (short) i_3_;
			aShort1310 = (short) i_5_;
			aByte1308 = (byte) i_6_;
			anInt1316 = i_8_;
			aShort1309 = (short) i_4_;
			anInt1315 = i;
			aBoolean1314 = bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lfa.<init>(" + i
					+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
					+ i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + bool
					+ ',' + i_8_ + ')'));
		}
	}
}
