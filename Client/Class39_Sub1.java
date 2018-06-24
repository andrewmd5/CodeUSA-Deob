/* Class39_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Class39_Sub1 extends Class39 {
	static Class277 aClass277_3590 = Class354.method3872((byte) 83);
	public static int anInt3591;
	static Interface10[] anInterface10Array3592;
	static int anInt3593;
	static int anInt3594;
	private final int[] anIntArray3595 = new int[512];

	@Override
	final void method352(final int i, final int i_0_, final float f,
			final int i_1_, final float f_2_, int i_3_, final float f_4_,
			final float f_5_, final float[] fs, final int i_6_, final int i_7_) {
		try {
			int i_8_ = (int) (i_6_ * f_4_ - i_7_);
			i_8_ &= 0xff;
			int i_9_ = (int) (-1.0F + f_5_ * i_0_);
			i_9_ &= 0xff;
			int i_10_ = (int) (-1.0F + i * f);
			i_10_ &= 0xff;
			final float f_11_ = i_1_ * f;
			int i_12_ = (int) f_11_;
			int i_13_ = 1 + i_12_;
			final float f_14_ = f_11_ - i_12_;
			final float f_15_ = 1.0F - f_14_;
			i_12_ &= i_10_;
			i_13_ &= i_10_;
			final float f_16_ = Class119_Sub4.method2188(f_14_, 1024);
			final int i_17_ = anIntArray3595[i_12_];
			final int i_18_ = anIntArray3595[i_13_];
			for (int i_19_ = 0; i_0_ > i_19_; i_19_++) {
				final float f_20_ = i_19_ * f_5_;
				int i_21_ = (int) f_20_;
				int i_22_ = i_21_ + 1;
				final float f_23_ = -i_21_ + f_20_;
				final float f_24_ = -f_23_ + 1.0F;
				final float f_25_ = Class119_Sub4
						.method2188(f_23_, i_7_ + 1023);
				i_22_ &= i_9_;
				i_21_ &= i_9_;
				final int i_26_ = anIntArray3595[i_17_ + i_21_];
				final int i_27_ = anIntArray3595[i_17_ + i_22_];
				final int i_28_ = anIntArray3595[i_21_ - -i_18_];
				final int i_29_ = anIntArray3595[i_18_ + i_22_];
				for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_30_++) {
					final float f_31_ = f_4_ * i_30_;
					int i_32_ = (int) f_31_;
					int i_33_ = i_32_ - -1;
					final float f_34_ = f_31_ - i_32_;
					final float f_35_ = -f_34_ + 1.0F;
					final float f_36_ = Class119_Sub4.method2188(f_34_, 1024);
					i_32_ &= i_8_;
					i_33_ &= i_8_;
					fs[i_3_++] = (Class98_Sub10_Sub5
							.method1014(
									(Class98_Sub10_Sub5.method1014(
											(Class98_Sub10_Sub5.method1014(
													(Model
															.method2588(
																	f_35_,
																	Class202.method2702(
																			(anIntArray3595[i_26_
																					+ i_32_]),
																			7),
																	-24576,
																	f_24_,
																	f_15_)),
													(byte) 112,
													(Model
															.method2588(
																	f_34_,
																	Class202.method2702(
																			7,
																			(anIntArray3595[i_26_
																					+ i_33_])),
																	-24576,
																	f_24_,
																	f_15_)),
													f_36_)),
											(byte) -107,
											(Class98_Sub10_Sub5.method1014(
													(Model
															.method2588(
																	f_35_,
																	Class202.method2702(
																			7,
																			(anIntArray3595[i_27_
																					+ i_32_])),
																	-24576,
																	f_23_,
																	f_15_)),
													(byte) 107,
													(Model
															.method2588(
																	f_34_,
																	Class202.method2702(
																			7,
																			(anIntArray3595[i_33_
																					- -i_27_])),
																	-24576,
																	f_23_,
																	f_15_)),
													f_36_)), f_25_)),
									(byte) -124,
									(Class98_Sub10_Sub5.method1014(
											(Class98_Sub10_Sub5.method1014(
													(Model
															.method2588(
																	f_35_,
																	Class202.method2702(
																			(anIntArray3595[i_32_
																					+ i_28_]),
																			7),
																	-24576,
																	f_24_,
																	f_14_)),
													(byte) -89,
													(Model
															.method2588(
																	f_34_,
																	Class202.method2702(
																			7,
																			(anIntArray3595[i_28_
																					+ i_33_])),
																	i_7_
																			+ -24577,
																	f_24_,
																	f_14_)),
													f_36_)),
											(byte) -103,
											(Class98_Sub10_Sub5.method1014(
													(Model
															.method2588(
																	f_35_,
																	Class202.method2702(
																			7,
																			(anIntArray3595[i_29_
																					+ i_32_])),
																	-24576,
																	f_23_,
																	f_14_)),
													(byte) -108,
													(Model
															.method2588(
																	f_34_,
																	Class202.method2702(
																			7,
																			(anIntArray3595[i_33_
																					- -i_29_])),
																	-24576,
																	f_23_,
																	f_14_)),
													f_36_)), f_25_)), f_16_))
							* f_2_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("kga.C(" + i + ',' + i_0_ + ',' + f + ',' + i_1_ + ','
							+ f_2_ + ',' + i_3_ + ',' + f_4_ + ',' + f_5_ + ','
							+ (fs != null ? "{...}" : "null") + ',' + i_6_
							+ ',' + i_7_ + ')'));
		}
	}

	public static void method354(final byte i) {
		try {
			if (i != -107) {
				method354((byte) 65);
			}
			aClass277_3590 = null;
			anInterface10Array3592 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kga.A(" + i + ')');
		}
	}

	static final void method355(final int i) {
		try {
			Class373.method3962((byte) 0);
			Class246_Sub7.aClass48_5119 = null;
			Class140.aClass48_3245 = null;
			Class98_Sub46_Sub4.aClass48_5962 = null;
			Class76.aClass28ArrayArray586 = null;
			Class98_Sub37.aHa4185 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kga.B(" + i + ')');
		}
	}

	Class39_Sub1(final int i) {
		try {
			final Random random = new Random(i);
			for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > -257; i_38_++) {
				anIntArray3595[i_38_] = anIntArray3595[i_38_ + 256] = i_38_;
			}
			for (int i_39_ = 0; i_39_ < 256; i_39_++) {
				final int i_40_ = random.nextInt() & 0xff;
				final int i_41_ = anIntArray3595[i_40_];
				anIntArray3595[i_40_] = anIntArray3595[256 + i_40_] = anIntArray3595[i_39_];
				anIntArray3595[i_39_] = anIntArray3595[i_39_ + 256] = i_41_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kga.<init>(" + i
					+ ')');
		}
	}
}
