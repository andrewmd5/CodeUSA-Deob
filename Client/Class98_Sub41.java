/* Class98_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub41 extends Class98 {
	static IncomingOpcode aClass58_4199;
	static int anInt4200 = 0;
	String aString4201;
	static int anInt4202;
	static Object anObject4203;
	static float aFloat4204;

	public static void method1474(final boolean bool) {
		do {
			try {
				anObject4203 = null;
				aClass58_4199 = null;
				if (bool == false) {
					break;
				}
				aClass58_4199 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qda.B(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method1475(final int i) {
		try {
			Class151_Sub9.anInt5028 = 0;
			final int i_0_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
					.readLEShortA((byte) 104);
			if (i >= 4) {
				final int i_1_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShortA(121);
				final int i_2_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 80);
				final boolean resetScene = ((Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteA(true) ^ 0xffffffff) == -2);
				Class98_Sub10_Sub13.method1043((byte) -65);
				Class98_Sub27.method1282((byte) 8, i_2_);
				int i_3_ = ((-((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).position + Class65.anInt496) / 16);
				Class98_Sub46_Sub17.anIntArrayArray6049 = new int[i_3_][4];
				for (int i_4_ = 0; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
					for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -5; i_5_++) {
						Class98_Sub46_Sub17.anIntArrayArray6049[i_4_][i_5_] = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readInt(-2);
					}
				}
				Class105.aByteArrayArray3414 = null;
				Class121.anIntArray1006 = new int[i_3_];
				client.aByteArrayArray3551 = new byte[i_3_][];
				Class377.anIntArray3178 = new int[i_3_];
				Class287.anIntArray2188 = new int[i_3_];
				Class246_Sub3_Sub4_Sub2_Sub2.aByteArrayArray6533 = new byte[i_3_][];
				Class255.aByteArrayArray3211 = new byte[i_3_][];
				Class377.aByteArrayArray3182 = new byte[i_3_][];
				Class98_Sub36.anIntArray4162 = new int[i_3_];
				Class76_Sub7.anIntArray3765 = null;
				GameObjectDefinitionLoader.anIntArray2517 = new int[i_3_];
				i_3_ = 0;
				for (int i_6_ = (-(Class165.anInt1276 >> -1188333180) + i_1_) / 8; ((Class165.anInt1276 >> -222953052) + i_1_) / 8 >= i_6_; i_6_++) {
					for (int i_7_ = (i_0_ - (Class98_Sub10_Sub7.anInt5572 >> 907774532)) / 8; ((i_0_ + (Class98_Sub10_Sub7.anInt5572 >> -1113312988)) / 8 >= i_7_); i_7_++) {
						Class121.anIntArray1006[i_3_] = (i_6_ << -1191642008)
								+ i_7_;
						Class287.anIntArray2188[i_3_] = Class234.aClass207_1748
								.method2750((byte) -90,
										("m" + i_6_ + "_" + i_7_));
						Class98_Sub36.anIntArray4162[i_3_] = Class234.aClass207_1748
								.method2750((byte) -114,
										("l" + i_6_ + "_" + i_7_));
						GameObjectDefinitionLoader.anIntArray2517[i_3_] = Class234.aClass207_1748
								.method2750((byte) -77,
										("um" + i_6_ + "_" + i_7_));
						Class377.anIntArray3178[i_3_] = Class234.aClass207_1748
								.method2750((byte) -61,
										("ul" + i_6_ + "_" + i_7_));
						i_3_++;
					}
				}
				Class251.method3170(-6547, i_0_, resetScene, i_1_, 11);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qda.A(" + i + ')');
		}
	}

	public Class98_Sub41() {
		/* empty */
	}

	Class98_Sub41(final String string, final int i) {
		try {
			aString4201 = string;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qda.<init>("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static {
		aClass58_4199 = new IncomingOpcode(20, 7);
	}
}
