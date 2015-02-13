/* Class246_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class246_Sub4_Sub2 extends Class246_Sub4 {
	static Class246_Sub3[] aClass246_Sub3Array6173;
	boolean aBoolean6174;
	int anInt6175;
	int anInt6176;
	int anInt6177;
	int anInt6178;
	int anInt6179;
	int anInt6180;
	static int anInt6181 = 0;
	static IncomingOpcode aClass58_6182 = new IncomingOpcode(13, 1);
	byte aByte6183 = 5;
	static int anInt6184;
	static OutgoingOpcode aClass171_6185 = new OutgoingOpcode(41, -1);
	static Class85 aClass85_6186 = new Class85(11, 8);

	public static void method3106(byte i) {
		try {
			aClass171_6185 = null;
			aClass58_6182 = null;
			if (i < 52)
				aClass171_6185 = null;
			aClass85_6186 = null;
			aClass246_Sub3Array6173 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tha.B(" + i + ')');
		}
	}

	static final boolean method3107(int i, byte i_0_) {
		try {
			if (i_0_ >= -65)
				method3107(-77, (byte) 42);
			if ((i ^ 0xffffffff) != -1 && (i ^ 0xffffffff) != -3)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tha.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method3108(byte i, int i_1_, int i_2_, int i_3_,
			int i_4_, byte[] is) {
		try {
			if (i != 1)
				method3106((byte) 100);
			if ((i_3_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff)) {
				i_1_ += i_2_;
				i_4_ = -i_2_ + i_3_ >> 1044038946;
				while ((--i_4_ ^ 0xffffffff) <= -1) {
					is[i_1_++] = (byte) 1;
					is[i_1_++] = (byte) 1;
					is[i_1_++] = (byte) 1;
					is[i_1_++] = (byte) 1;
				}
				i_4_ = 0x3 & -i_2_ + i_3_;
				while (--i_4_ >= 0)
					is[i_1_++] = (byte) 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tha.A(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	public Class246_Sub4_Sub2() {
		/* empty */
	}
}
