/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class7 {
	private static short[] aShortArray92 = new short[500];
	Class98_Sub1 aClass98_Sub1_93 = null;
	short[] aShortArray94;
	boolean aBoolean95;
	private static short[] aShortArray96;
	private static byte[] aByteArray97;
	private static short[] aShortArray98;
	byte[] aByteArray99;
	int anInt100 = 0;
	private static short[] aShortArray101 = new short[500];
	boolean aBoolean102 = false;
	private static short[] aShortArray103;
	boolean aBoolean104;
	short[] aShortArray105;
	short[] aShortArray106;
	short[] aShortArray107;
	short[] aShortArray108;

	public static void method183() {
		aShortArray103 = null;
		aShortArray101 = null;
		aShortArray96 = null;
		aShortArray92 = null;
		aShortArray98 = null;
		aByteArray97 = null;
	}

	Class7(final byte[] is, final Class98_Sub1 class98_sub1) {
		aBoolean95 = false;
		aBoolean104 = false;
		aClass98_Sub1_93 = class98_sub1;
		try {
			final ByteBuffer class98_sub22 = new ByteBuffer(is);
			final ByteBuffer class98_sub22_0_ = new ByteBuffer(is);
			class98_sub22.readUnsignedByte((byte) 89);
			class98_sub22.position += 2;
			final int i = class98_sub22.readUnsignedByte((byte) -128);
			int i_1_ = 0;
			int i_2_ = -1;
			int i_3_ = -1;
			class98_sub22_0_.position = class98_sub22.position + i;
			for (int i_4_ = 0; i_4_ < i; i_4_++) {
				final int i_5_ = (aClass98_Sub1_93.anIntArray3812[i_4_]);
				if (i_5_ == 0) {
					i_2_ = i_4_;
				}
				final int i_6_ = class98_sub22.readUnsignedByte((byte) -7);
				if (i_6_ > 0) {
					if (i_5_ == 0) {
						i_3_ = i_4_;
					}
					aShortArray103[i_1_] = (short) i_4_;
					short i_7_ = 0;
					if (i_5_ == 3 || i_5_ == 10) {
						i_7_ = (short) 128;
					}
					if ((i_6_ & 0x1) != 0) {
						aShortArray101[i_1_] = (short) class98_sub22_0_
								.method1239(-80);
					} else {
						aShortArray101[i_1_] = i_7_;
					}
					if ((i_6_ & 0x2) != 0) {
						aShortArray96[i_1_] = (short) class98_sub22_0_
								.method1239(-76);
					} else {
						aShortArray96[i_1_] = i_7_;
					}
					if ((i_6_ & 0x4) != 0) {
						aShortArray92[i_1_] = (short) class98_sub22_0_
								.method1239(-82);
					} else {
						aShortArray92[i_1_] = i_7_;
					}
					aByteArray97[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
					if (i_5_ == 2 || i_5_ == 9) {
						aShortArray101[i_1_] = (short) (aShortArray101[i_1_] << 2 & 0x3fff);
						aShortArray96[i_1_] = (short) (aShortArray96[i_1_] << 2 & 0x3fff);
						aShortArray92[i_1_] = (short) (aShortArray92[i_1_] << 2 & 0x3fff);
					}
					aShortArray98[i_1_] = (short) -1;
					if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
						if (i_2_ > i_3_) {
							aShortArray98[i_1_] = (short) i_2_;
							i_3_ = i_2_;
						}
					} else if (i_5_ == 5) {
						aBoolean102 = true;
					} else if (i_5_ == 7) {
						aBoolean104 = true;
					} else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8) {
						aBoolean95 = true;
					}
					i_1_++;
				}
			}
			if (class98_sub22_0_.position != is.length) {
				throw new RuntimeException();
			}
			anInt100 = i_1_;
			aShortArray108 = new short[i_1_];
			aShortArray94 = new short[i_1_];
			aShortArray105 = new short[i_1_];
			aShortArray106 = new short[i_1_];
			aShortArray107 = new short[i_1_];
			aByteArray99 = new byte[i_1_];
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
				aShortArray108[i_8_] = aShortArray103[i_8_];
				aShortArray94[i_8_] = aShortArray101[i_8_];
				aShortArray105[i_8_] = aShortArray96[i_8_];
				aShortArray106[i_8_] = aShortArray92[i_8_];
				aShortArray107[i_8_] = aShortArray98[i_8_];
				aByteArray99[i_8_] = aByteArray97[i_8_];
			}
		} catch (final Exception exception) {
			anInt100 = 0;
			aBoolean102 = false;
			aBoolean104 = false;
		}
	}

	static {
		aByteArray97 = new byte[500];
		aShortArray103 = new short[500];
		aShortArray98 = new short[500];
		aShortArray96 = new short[500];
	}
}
