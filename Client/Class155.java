/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class155 {
	short[] aShortArray1234;
	short[] aShortArray1235;
	short aShort1236;
	int[] anIntArray1237;
	byte aByte1238;
	short aShort1239;
	int[] anIntArray1240;
	int[] anIntArray1241;
	byte aByte1242;
	short aShort1243;
	short[] aShortArray1244;
	short aShort1245;

	static final Class53_Sub1 method2494(final byte i) {
		try {
			Class239.anInt1843 = 0;
			if (i <= 74) {
				method2494((byte) -118);
			}
			return Class69_Sub2.method706(200);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kia.A(" + i + ')');
		}
	}

	static final void method2495(final byte[] is, final byte i) {
		do {
			try {
				final ByteBuffer class98_sub22 = new ByteBuffer(is);
				boolean bool = false;
				if (i == -25) {
					for (;;) {
						final int i_0_ = class98_sub22
								.readUnsignedByte((byte) -105);
						if (i_0_ == 0) {
							break;
						}
						if ((i_0_ ^ 0xffffffff) == -2) {
							if (Class57.anIntArray457 == null) {
								Class235.anIntArray1764 = new int[4];
								Class362.anInt3090 = 4;
								Class57.anIntArray457 = new int[4];
							}
							for (int i_1_ = 0; Class57.anIntArray457.length > i_1_; i_1_++) {
								Class57.anIntArray457[i_1_] = class98_sub22
										.readUShort(false);
								Class235.anIntArray1764[i_1_] = class98_sub22
										.readUShort(false);
							}
							bool = true;
						} else if (i_0_ == 2) {
							Class64_Sub10.anInt3666 = class98_sub22
									.readUnsignedShort((byte) 127);
						} else if ((i_0_ ^ 0xffffffff) == -4) {
							Class362.anInt3090 = class98_sub22
									.readUnsignedByte((byte) -109);
							Class57.anIntArray457 = new int[Class362.anInt3090];
							Class235.anIntArray1764 = new int[Class362.anInt3090];
						}
					}
					if (bool) {
						break;
					}
					if (Class57.anIntArray457 == null) {
						Class362.anInt3090 = 4;
						Class235.anIntArray1764 = new int[4];
						Class57.anIntArray457 = new int[4];
					}
					for (int i_2_ = 0; i_2_ < Class57.anIntArray457.length; i_2_++) {
						Class57.anIntArray457[i_2_] = 0;
						Class235.anIntArray1764[i_2_] = 20 * i_2_;
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("kia.B("
						+ (is != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	Class155(final int i, final int i_3_, final int i_4_, final int i_5_,
			final int i_6_, final int i_7_, final int i_8_, final int i_9_,
			final int i_10_, final int i_11_, final int i_12_, final int i_13_,
			final int i_14_, final int i_15_) {
		try {
			aByte1242 = (byte) i;
			anIntArray1237 = new int[4];
			aByte1238 = (byte) i_3_;
			anIntArray1240 = new int[4];
			anIntArray1241 = new int[4];
			anIntArray1240[2] = i_6_;
			anIntArray1240[3] = i_7_;
			anIntArray1240[1] = i_5_;
			anIntArray1240[0] = i_4_;
			anIntArray1237[3] = i_11_;
			anIntArray1237[0] = i_8_;
			anIntArray1237[2] = i_10_;
			anIntArray1237[1] = i_9_;
			anIntArray1241[2] = i_14_;
			anIntArray1241[1] = i_13_;
			anIntArray1241[3] = i_15_;
			aShort1236 = (short) (i_4_ >> Class151_Sub8.anInt5015);
			anIntArray1241[0] = i_12_;
			aShort1243 = (short) (i_6_ >> Class151_Sub8.anInt5015);
			aShort1239 = (short) (i_12_ >> Class151_Sub8.anInt5015);
			aShort1245 = (short) (i_14_ >> Class151_Sub8.anInt5015);
			aShortArray1234 = new short[4];
			aShortArray1235 = new short[4];
			aShortArray1244 = new short[4];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("kia.<init>(" + i
					+ ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ','
					+ i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ','
					+ i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ','
					+ i_15_ + ')'));
		}
	}
}
