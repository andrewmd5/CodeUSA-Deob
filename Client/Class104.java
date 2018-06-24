/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class104 {
	static int anInt897;
	byte aByte898;
	short aShort899;
	byte aByte900;
	static OutgoingOpcode aClass171_901 = new OutgoingOpcode(18, 3);
	Interface16 anInterface16_902;
	static Class36[] aClass36Array903 = new Class36[8];

	static final void method1712(final boolean bool, final int i, int i_0_,
			final int i_1_, final int i_2_, final int i_3_, final int i_4_,
			final int i_5_) {
		try {
			int i_6_ = -334 + i_2_;
			do {
				if (i_6_ >= 0) {
					if (i_6_ <= 100) {
						break;
					}
					i_6_ = 100;
					if (!client.aBoolean3553) {
						break;
					}
				}
				i_6_ = 0;
			} while (false);
			final int i_7_ = (((Class135.aShort1057 + -Class64_Sub19.aShort3692)
					* i_6_ / 100) + Class64_Sub19.aShort3692);

			Class16.anInt197 = i_7_ * Class16.anInt199 >> 626243656;

			i_0_ = i_0_ * i_7_ >> -1212701304;
			// System.out.println(i_0_ );
			final int i_8_ = 16384 - i_4_ & 0x3fff;

			final int i_9_ = 16384 + -i & 0x3fff;

			int i_10_ = 0;
			if (bool != false) {
				anInt897 = -79;
			}
			int i_11_ = 0;
			int i_12_ = i_0_;

			if ((i_8_ ^ 0xffffffff) != -1) {
				i_11_ = (Class284_Sub2_Sub2.anIntArray6200[i_8_] * -i_12_ >> -1123635698);
				i_12_ = (i_12_ * Class284_Sub2_Sub2.anIntArray6202[i_8_] >> 1849889102);

			}
			if ((i_9_ ^ 0xffffffff) != -1) {
				i_10_ = (Class284_Sub2_Sub2.anIntArray6200[i_9_] * i_12_ >> 1440327534);
				i_12_ = (i_12_ * Class284_Sub2_Sub2.anIntArray6202[i_9_] >> -1335926898);
			}
			Class134.anInt3461 = -i_12_ + i_1_;
			Class308.anInt2584 = 0;
			Entity.anInt6357 = i_4_;
			Class98_Sub46_Sub10.anInt6020 = -i_10_ + i_3_;
			Class186.anInt3424 = i;
			Class79.anInt601 = i_5_ - i_11_;
		//	System.out.println(Class79.anInt601);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gk.A(" + bool
					+ ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	public static void method1713(final byte i) {
		try {
			if (i != 23) {
				anInt897 = -82;
			}
			aClass36Array903 = null;
			aClass171_901 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gk.B(" + i + ')');
		}
	}

	Class104(final Interface16 interface16, final int i, final int i_13_,
			final int i_14_) {
		try {
			aByte898 = (byte) i_14_;
			anInterface16_902 = interface16;
			aShort899 = (short) i;
			aByte900 = (byte) i_13_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gk.<init>("
					+ (interface16 != null ? "{...}" : "null") + ',' + i + ','
					+ i_13_ + ',' + i_14_ + ')'));
		}
	}
}
