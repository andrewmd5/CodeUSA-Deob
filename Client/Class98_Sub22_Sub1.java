/* Class98_Sub22_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub22_Sub1 extends ByteBuffer {
	static int anInt5789;
	private int anInt5790;
	private Class117 aClass117_5791;

	final void method1251(int i, int i_0_, byte[] is, boolean bool) {
		try {
			for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i_1_++)
				is[i_1_ - -i] = (byte) ((((ByteBuffer) this).aByteArray3992[((ByteBuffer) this).position++]) + -aClass117_5791
						.method2167(123));
			if (bool != true)
				method1261(true, -96);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("bi.H(" + i + ',' + i_0_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	final void method1252(byte i, Class117 class117) {
		try {
			if (i >= -82)
				method1255(-35);
			aClass117_5791 = class117;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bi.I(" + i + ','
					+ (class117 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method1253(boolean bool, int i) {
		try {
			if (i != -31553)
				anInt5789 = -49;
			int i_2_ = Class98_Sub46.anInt4261;
			while_28_: do {
				while_27_: do {
					do {
						if ((i_2_ ^ 0xffffffff) != -1) {
							if ((i_2_ ^ 0xffffffff) == -2)
								break;
							if ((i_2_ ^ 0xffffffff) != -3)
								break while_28_;
							if (!client.aBoolean3553)
								break while_27_;
						}
						if (!bool)
							return Class98_Sub46_Sub13_Sub2.anInt6309;
						return 0;
					} while (false);
					return Class98_Sub46_Sub13_Sub2.anInt6309;
				} while (false);
				return 0;
			} while (false);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bi.C(" + bool
					+ ',' + i + ')');
		}
	}

	final void method1254(byte i) {
		try {
			if (i != 120)
				anInt5790 = -99;
			((ByteBuffer) this).position = (anInt5790 - -7) / 8;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bi.G(" + i + ')');
		}
	}

	final int method1255(int i) {
		try {
			if (i != 0)
				aClass117_5791 = null;
			int i_3_ = (((((ByteBuffer) this).aByteArray3992[((ByteBuffer) this).position++]) - aClass117_5791
					.method2167(121)) & 0xff);
			if ((i_3_ ^ 0xffffffff) > -129)
				return i_3_;
			return ((i_3_ - 128 << 1485705704) - -(0xff & ((((ByteBuffer) this).aByteArray3992[((ByteBuffer) this).position++]) - aClass117_5791
					.method2167(i ^ 0x6a))));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bi.E(" + i + ')');
		}
	}

	final void method1256(int i) {
		try {
			anInt5790 = 8 * ((ByteBuffer) this).position;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bi.K(" + i + ')');
		}
	}

	final int readBits(byte i, int i_4_) {
		try {
			int i_5_ = anInt5790 >> 212764035;
			int i_6_ = 8 + -(anInt5790 & 0x7);
			anInt5790 += i_4_;
			int i_7_ = 0;
			for (/**/; (i_6_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_6_ = 8) {
				i_7_ += (((ByteBuffer) this).aByteArray3992[i_5_++] & Class79.anIntArray604[i_6_]) << i_4_
						- i_6_;
				i_4_ -= i_6_;
			}
			if (i_4_ == i_6_)
				i_7_ += (Class79.anIntArray604[i_6_] & ((ByteBuffer) this).aByteArray3992[i_5_]);
			else
				i_7_ += (((ByteBuffer) this).aByteArray3992[i_5_] >> i_6_
						- i_4_)
						& Class79.anIntArray604[i_4_];
			return i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bi.B(" + i + ','
					+ i_4_ + ')');
		}
	}

	final int method1258(int i, int i_8_) {
		try {
			return 8 * i - anInt5790;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bi.J(" + i + ','
					+ i_8_ + ')');
		}
	}

	Class98_Sub22_Sub1(int i) {
		super(i);
	}

	final void method1259(int[] is, int i) {
		try {
			if (i == 255)
				aClass117_5791 = new Class117(is);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bi.F("
					+ (is != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final boolean method1260(byte i) {
		try {
			if (i != 54)
				aClass117_5791 = null;
			int i_10_ = 0xff & ((((ByteBuffer) this).aByteArray3992[((ByteBuffer) this).position]) + -aClass117_5791
					.method2168(i + -51));
			if (i_10_ < 128)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bi.D(" + i + ')');
		}
	}

	final void method1261(boolean bool, int i) {
		try {
			((ByteBuffer) this).aByteArray3992[((ByteBuffer) this).position++] = (byte) (i + aClass117_5791
					.method2167(84));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bi.A(" + bool
					+ ',' + i + ')');
		}
	}
}
