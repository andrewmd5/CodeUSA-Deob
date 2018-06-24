/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class222 {
	static boolean aBoolean1667 = false;
	int anInt1668;
	static OutgoingOpcode aClass171_1669 = new OutgoingOpcode(22, 7);
	static int anInt1670 = -1;
	static float[] aFloatArray1671 = { 0.0F, -1.0F, 0.0F, 0.0F };
	static int anInt1672;

	static final int method2824(final byte i,
			final Class98_Sub46_Sub8 class98_sub46_sub8) {
		try {
			String string = Class86.method845((byte) -124, class98_sub46_sub8);
			int[] is = null;
			if (Class299_Sub2.method3526(124, class98_sub46_sub8.anInt5990)) {
				is = (Class98_Sub46_Sub19.aClass205_6068.method2714(
						(int) class98_sub46_sub8.aLong5987, (byte) -128)).anIntArray2436;
			} else if ((class98_sub46_sub8.anInt5988 ^ 0xffffffff) != 0) {
				is = (Class98_Sub46_Sub19.aClass205_6068.method2714(
						class98_sub46_sub8.anInt5988, (byte) -125)).anIntArray2436;
			} else if (!Class36.method340(class98_sub46_sub8.anInt5990,
					(byte) -70)) {
				if (Class98_Sub10_Sub21.method1064(
						(class98_sub46_sub8.anInt5990), false)) {
					GameObjectDefinition class352;
					if (class98_sub46_sub8.anInt5990 == 1009) {
						class352 = (Class130.aClass302_1028.method3546(
								(int) class98_sub46_sub8.aLong5987, (byte) 119));
					} else {
						class352 = (Class130.aClass302_1028
								.method3546(
										(int) ((class98_sub46_sub8.aLong5987 >>> 762669664) & 0x7fffffffL),
										(byte) 119));
					}
					if (class352.anIntArray2928 != null) {
						class352 = class352.method3852(Class75.aClass140_584,
								(byte) -38);
					}
					if (class352 != null) {
						is = class352.anIntArray2934;
					}
				}
			} else {
				final Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254
						.method3990((int) class98_sub46_sub8.aLong5987, -1)));
				if (class98_sub39 != null) {
					final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
					NPC class141 = (class246_sub3_sub4_sub2_sub1.aClass141_6504);
					if (class141.anIntArray1109 != null) {
						class141 = class141.method2300(Class75.aClass140_584,
								(byte) 55);
					}
					if (class141 != null) {
						is = class141.anIntArray1152;
					}
				}
			}
			if (is != null) {
				string += Class64_Sub25.method653(0, is);
			}
			int i_1_ = Class42_Sub1.aClass197_5354.method2676((byte) -126,
					(Class217.aClass332Array3408), string);
			if (class98_sub46_sub8.aBoolean5983) {
				i_1_ += Class284_Sub2_Sub2.aClass332_6199.method3734() + 4;
			}
			return i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oe.D(" + i + ','
					+ (class98_sub46_sub8 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method2825(final int i, final int i_2_) {
		try {
			if (i >= -31) {
				return -69;
			}
			final int i_3_ = i_2_ * (i_2_ * i_2_ >> -1546827604) >> -2091093524;
			final int i_4_ = i_2_ * 6 - 61440;
			final int i_5_ = (i_2_ * i_4_ >> -1680263604) + 40960;
			return i_3_ * i_5_ >> -94375156;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oe.B(" + i + ','
					+ i_2_ + ')');
		}
	}

	static final boolean method2826(
			final Class246_Sub3_Sub4 class246_sub3_sub4, final boolean bool) {
		final boolean bool_6_ = Class78.aSArray594 == Class81.aSArray618;
		int i = 0;
		short i_7_ = 0;
		byte i_8_ = 0;
		class246_sub3_sub4.method3022(-8675);
		if (class246_sub3_sub4.aShort6158 < 0
				|| class246_sub3_sub4.aShort6157 < 0
				|| (class246_sub3_sub4.aShort6160 >= Class366.anInt3112)
				|| (class246_sub3_sub4.aShort6159 >= Class64_Sub9.anInt3662)) {
			return false;
		}
		short i_9_ = 0;
		for (int i_10_ = class246_sub3_sub4.aShort6158; i_10_ <= class246_sub3_sub4.aShort6160; i_10_++) {
			for (int i_11_ = class246_sub3_sub4.aShort6157; i_11_ <= class246_sub3_sub4.aShort6159; i_11_++) {
				final Class172 class172 = Class100.method1693(
						(((Class246_Sub3) class246_sub3_sub4).aByte5088),
						i_10_, i_11_);
				if (class172 != null) {
					final Class154 class154 = Class299_Sub2.method3524(
							(byte) -90, class246_sub3_sub4);
					Class154 class154_12_ = class172.aClass154_1325;
					if (class154_12_ == null) {
						class172.aClass154_1325 = class154;
					} else {
						for (/**/; class154_12_.aClass154_1233 != null; class154_12_ = class154_12_.aClass154_1233) {
							/* empty */
						}
						class154_12_.aClass154_1233 = class154;
					}
					if (bool_6_
							&& (Class40.anIntArrayArray367[i_10_][i_11_] & ~0xffffff) != 0) {
						i = Class40.anIntArrayArray367[i_10_][i_11_];
						i_7_ = Class304.aShortArrayArray2534[i_10_][i_11_];
						i_8_ = Class299_Sub2.aByteArrayArray5291[i_10_][i_11_];
					}
					if (!bool
							&& (class172.aClass246_Sub3_Sub1_1332 != null)
							&& (class172.aClass246_Sub3_Sub1_1332.aShort6149) > i_9_) {
						i_9_ = (class172.aClass246_Sub3_Sub1_1332.aShort6149);
					}
				}
			}
		}
		if (bool_6_ && (i & ~0xffffff) != 0) {
			for (int i_13_ = class246_sub3_sub4.aShort6158; i_13_ <= class246_sub3_sub4.aShort6160; i_13_++) {
				for (int i_14_ = (class246_sub3_sub4.aShort6157); (i_14_ <= class246_sub3_sub4.aShort6159); i_14_++) {
					if ((Class40.anIntArrayArray367[i_13_][i_14_] & ~0xffffff) == 0) {
						Class40.anIntArrayArray367[i_13_][i_14_] = i;
						Class304.aShortArrayArray2534[i_13_][i_14_] = i_7_;
						Class299_Sub2.aByteArrayArray5291[i_13_][i_14_] = i_8_;
					}
				}
			}
		}
		if (bool) {
			Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273[Class347.anInt2907++] = class246_sub3_sub4;
		} else {
			final int i_15_ = Class78.aSArray594 == Class81.aSArray618 ? 1 : 0;
			if (class246_sub3_sub4.method2978(-127)) {
				if (class246_sub3_sub4.method2987(6540)) {
					((Class246_Sub3) class246_sub3_sub4).aClass246_Sub3_5090 = Class359.aClass246_Sub3Array3056[i_15_];
					Class359.aClass246_Sub3Array3056[i_15_] = class246_sub3_sub4;
				} else {
					((Class246_Sub3) class246_sub3_sub4).aClass246_Sub3_5090 = Class379.aClass246_Sub3Array3198[i_15_];
					Class379.aClass246_Sub3Array3198[i_15_] = class246_sub3_sub4;
					Class358.aBoolean3033 = true;
				}
			} else {
				((Class246_Sub3) class246_sub3_sub4).aClass246_Sub3_5090 = Class130.aClass246_Sub3Array1029[i_15_];
				Class130.aClass246_Sub3Array1029[i_15_] = class246_sub3_sub4;
			}
		}
		if (bool) {
			((Class246_Sub3) class246_sub3_sub4).anInt5089 -= i_9_;
		}
		return true;
	}

	public static void method2827(final byte i) {
		try {
			if (i > -7) {
				method2826(null, true);
			}
			aClass171_1669 = null;
			aFloatArray1671 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oe.A(" + i + ')');
		}
	}

	@Override
	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					"oe.toString(" + ')');
		}
	}

	Class222(final int i, final int i_16_) {
		try {
			anInt1668 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oe.<init>(" + i
					+ ',' + i_16_ + ')'));
		}
	}
}
