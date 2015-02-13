/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class255 implements Interface1 {
	static OutgoingOpcode aClass171_3206;
	static int[] anIntArray3207;
	static Class293 aClass293_3208 = null;
	static String[] aStringArray3209 = new String[100];
	static int[] anIntArray3210 = new int[1000];
	static byte[][] aByteArrayArray3211;

	public Class255() {
		/* empty */
	}

	public static void method3191(final byte i) {
		try {
			anIntArray3210 = null;
			aStringArray3209 = null;
			if (i != 49) {
				aByteArrayArray3211 = null;
			}
			aByteArrayArray3211 = null;
			anIntArray3207 = null;
			aClass171_3206 = null;
			aClass293_3208 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pv.A(" + i + ')');
		}
	}

	@Override
	public final String method1(final int i, final long l,
			final Class348 class348, final int[] is) {
		try {
			if (class348 == Class151_Sub9.aClass348_5023) {
				final Class306 class306 = Class98_Sub10_Sub16.aClass29_5620
						.method302(is[0], 1028602529);
				return class306.method3594((int) l, (byte) 43);
			}
			if (Class77_Sub1.aClass348_3801 == class348
					|| class348 == Class359.aClass348_3046) {
				final ItemDefs class297 = Class98_Sub46_Sub19.aClass205_6068
						.method2714((int) l, (byte) -120);
				return class297.aString2450;
			}
			if (class348 == Class42_Sub3.aClass348_5363
					|| class348 == Class98_Sub36.aClass348_4156
					|| Class151_Sub7.aClass348_5008 == class348) {
				return Class98_Sub10_Sub16.aClass29_5620.method302(is[0],
						1028602529).method3594((int) l, (byte) 127);
			}
			if (i != 17438) {
				method3191((byte) 34);
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pv.B(" + i + ','
					+ l + ',' + (class348 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class119_Sub1 method3192(final int i,
			final ByteBuffer class98_sub22) {
		try {
			if (i >= -115) {
				return null;
			}
			return new Class119_Sub1(class98_sub22.readUShort(false),
					class98_sub22.readUShort(false),
					class98_sub22.readUShort(false),
					class98_sub22.readUShort(false),
					class98_sub22.readMediumInt(-125),
					class98_sub22.readUnsignedByte((byte) -100));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pv.C(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass171_3206 = new OutgoingOpcode(25, 7);
	}
}
