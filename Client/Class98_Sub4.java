/* Class98_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub4 extends Class98 {
	static int anInt3826;
	volatile int anInt3827 = -1;
	static int anInt3828;
	volatile String aString3829;

	static final void method953(final int i, final int i_0_, final boolean bool) {
		try {
			int i_1_ = (Class42_Sub1.aClass197_5354.method2674(
					Class309.aClass309_2610.method3615(Class374.anInt3159,
							(byte) 25), 99));
			int i_2_;
			if (Class248.aBoolean1896) {
				for (Class98_Sub46_Sub9 class98_sub46_sub9 = ((Class98_Sub46_Sub9) Class98_Sub18.aClass215_3949
						.method2792(-1)); class98_sub46_sub9 != null; class98_sub46_sub9 = ((Class98_Sub46_Sub9) Class98_Sub18.aClass215_3949
						.method2787(0))) {
					int i_3_;
					if ((class98_sub46_sub9.anInt6001 ^ 0xffffffff) != -2) {
						i_3_ = Class98_Sub10_Sub25.method1079(
								class98_sub46_sub9, 21);
					} else {
						i_3_ = Class222
								.method2824(
										(byte) 81,
										((Class98_Sub46_Sub8) (((class98_sub46_sub9.aClass215_5999).aClass98_Sub46_1615).aClass98_Sub46_4262)));
					}
					if ((i_3_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff)) {
						i_1_ = i_3_;
					}
				}
				i_1_ += 8;
				i_2_ = 16 * Class64_Sub12.anInt3672 + 21;
				Class15.anInt172 = (Class64_Sub12.anInt3672 * 16 + (Class98_Sub5_Sub3.aBoolean5539 ? 26
						: 22));
			} else {
				for (Class98_Sub46_Sub8 class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class33.aClass148_315
						.method2418(32)); class98_sub46_sub8 != null; class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class33.aClass148_315
						.method2417(119))) {
					final int i_4_ = Class222.method2824((byte) 75,
							class98_sub46_sub8);
					if ((i_1_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
						i_1_ = i_4_;
					}
				}
				i_1_ += 8;
				Class15.anInt172 = Class359.anInt3058 * 16
						+ (Class98_Sub5_Sub3.aBoolean5539 ? 26 : 22);
				i_2_ = 21 + Class359.anInt3058 * 16;
			}
			int i_5_ = i_0_ + -(i_1_ / 2);
			if ((Class39_Sub1.anInt3593 ^ 0xffffffff) > (i_5_ - -i_1_ ^ 0xffffffff)) {
				i_5_ = Class39_Sub1.anInt3593 - i_1_;
			}
			if ((i_5_ ^ 0xffffffff) > -1) {
				i_5_ = 0;
			}
			int i_6_ = i;
			if (i_2_ + i_6_ > Class98_Sub25.anInt4024) {
				i_6_ = -i_2_ + Class98_Sub25.anInt4024;
			}
			Class38.anInt355 = i_5_;
			if ((i_6_ ^ 0xffffffff) > -1) {
				i_6_ = 0;
			}
			Class104.anInt897 = i_6_;
			Class246_Sub3_Sub4_Sub2_Sub2.aBoolean6540 = bool;
			Class246_Sub3_Sub4_Sub4.anInt6488 = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("bfa.A(" + i + ','
					+ i_0_ + ',' + bool + ')'));
		}
	}

	Class98_Sub4(final String string) {
		try {
			aString3829 = string;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bfa.<init>("
					+ (string != null ? "{...}" : "null") + ')');
		}
	}
}
