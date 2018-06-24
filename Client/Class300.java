/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;

final class Class300 {
	int anInt2496;
	int[] anIntArray2497;
	Class98_Sub46_Sub11 aClass98_Sub46_Sub11_2498;
	static Class65 aClass65_2499 = new Class65();
	static Class332 aClass332_2500;
	static BigInteger aBigInteger2501 = new BigInteger("10001", 16);

	public static void method3532(final byte i) {
		try {
			aClass332_2500 = null;
			aClass65_2499 = null;
			if (i > -53) {
				method3532((byte) -5);
			}
			aBigInteger2501 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sh.B(" + i + ')');
		}
	}

	public Class300() {
		/* empty */
	}

	static final Class119_Sub4 method3533(final ByteBuffer class98_sub22,
			final byte i) {
		try {
			if (i != 51) {
				aClass65_2499 = null;
			}
			return new Class119_Sub4(class98_sub22.readUShort(false),
					class98_sub22.readUShort(false),
					class98_sub22.readUShort(false),
					class98_sub22.readUShort(false),
					class98_sub22.readMediumInt(-127),
					class98_sub22.readMediumInt(-128),
					class98_sub22.readUnsignedByte((byte) -114));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("sh.A(" + (class98_sub22 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}
}
