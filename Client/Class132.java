/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class132 {
	static int anInt1043 = 0;
	static int[] anIntArray1044;
	private Class207 aClass207_1045;
	static int anInt1046;
	int anInt1047;
	static Class98_Sub48 aClass98_Sub48_1048 = new Class98_Sub48(0, 0);
	private final Class79 aClass79_1049 = new Class79(64);
	static int anInt1050 = -1;

	public static void method2234(final int i) {
		try {
			aClass98_Sub48_1048 = null;
			if (i == 0) {
				anIntArray1044 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iu.B(" + i + ')');
		}
	}

	static final int method2235(final int i, final int i_0_, final byte i_1_) {
		try {
			if (i_1_ != 98) {
				anIntArray1044 = null;
			}
			int i_2_;
			if ((i ^ 0xffffffff) >= -20001) {
				if (i > 10000) {
					i_2_ = 3;
					Class98_Sub50.method1672((byte) 19);
				} else if ((i ^ 0xffffffff) < -5001) {
					Class287.method3385((byte) 66);
					i_2_ = 2;
				} else {
					Class98_Sub32.method1436(i_1_ + -216, true);
					i_2_ = 1;
				}
			} else {
				Class98_Sub27.method1284(1);
				i_2_ = 4;
			}
			if ((Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
					.method583((byte) 125) ^ 0xffffffff) != (i_0_ ^ 0xffffffff)) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_0_,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4062));
				Class76_Sub4.method754(i_0_, false, i_1_ + -215);
			}
			Class310.method3618(-5964);
			return i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iu.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2236(final boolean bool, final int i,
			final String string, final String string_3_, final int i_4_) {
		do {
			try {
				final Class98_Sub11 class98_sub11 = Class98_Sub46_Sub9
						.method1556(false);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
						Class298.aClass222_2485.anInt1668, -86);
				class98_sub11.aClass98_Sub22_Sub1_3865
						.writeShort(0, 1571862888);
				final int i_5_ = (((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position);
				class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(637,
						i ^ 0x5db0b968);
				final int[] is = Class42_Sub2.method389(12206, class98_sub11);
				final int i_6_ = (((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1188(string_3_,
						(byte) 113);
				class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
						Class98_Sub10_Sub15.anInt5619, 1571862888);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1188(string,
						(byte) 113);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1221(-75,
						Class197.aLong1515);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
						Class374.anInt3159, 62);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
						Class4.aClass279_86.anInt2095, 126);
				Class149.method2430((class98_sub11.aClass98_Sub22_Sub1_3865),
						(byte) 0);
				final String string_7_ = Class98_Sub10_Sub7.aString5573;
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
						string_7_ == null ? 0 : 1, i + -61);
				if (string_7_ != null) {
					class98_sub11.aClass98_Sub22_Sub1_3865.method1188(
							string_7_, (byte) 113);
				}
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(i_4_, -114);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(bool ? 1 : 0,
						93);
				((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position += 7;
				class98_sub11.aClass98_Sub22_Sub1_3865
						.method1235(
								true,
								is,
								i_6_,
								((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position);
				class98_sub11.aClass98_Sub22_Sub1_3865
						.method1207(
								(byte) 90,
								-i_5_
										+ (((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position));
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				Class21_Sub4.anInt5394 = 1;
				Class372.anInt3150 = i;
				Class98_Sub26.anInt4028 = 0;
				Class55.anInt442 = -3;
				if (i_4_ >= 13) {
					break;
				}
				ha.aBoolean940 = true;
				Class305.method3571(-97);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("iu.D(" + bool
						+ ',' + i + ',' + (string != null ? "{...}" : "null")
						+ ',' + (string_3_ != null ? "{...}" : "null") + ','
						+ i_4_ + ')'));
			}
			break;
		} while (false);
	}

	final Class90 method2237(final int i, final int i_8_) {
		try {
			Class90 class90;
			synchronized (aClass79_1049) {
				class90 = (Class90) aClass79_1049.method802(-121, i);
			}
			if (class90 != null) {
				return class90;
			}
			if (i_8_ <= 39) {
				method2235(-23, -51, (byte) 7);
			}
			byte[] is;
			synchronized (aClass207_1045) {
				is = aClass207_1045.method2745(i, 19, false);
			}
			class90 = new Class90();
			if (is != null) {
				class90.method885(new ByteBuffer(is), -23453);
			}
			synchronized (aClass79_1049) {
				aClass79_1049.method805(i, class90, (byte) -80);
			}
			return class90;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iu.A(" + i + ','
					+ i_8_ + ')');
		}
	}

	Class132(final Class279 class279, final int i, final Class207 class207) {
		try {
			aClass207_1045 = class207;
			anInt1047 = aClass207_1045.method2761(0, 19);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iu.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}
}
