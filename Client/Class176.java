/* Class176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class176 {
	static Class204 aClass204_1372 = new Class204();

	static final void method2579(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_, final int i_5_,
			final int i_6_, final int i_7_, final int i_8_) {
		do {
			try {
				if (i_3_ == i_2_ && i_7_ == i && i_5_ == i_6_ && i_0_ == i_1_) {
					Class91.method890(i_4_, i, i_1_, i_6_, (byte) -105, i_3_);
				} else {
					int i_9_ = i_3_;
					int i_10_ = i;
					final int i_11_ = 3 * i_3_;
					final int i_12_ = i * 3;
					final int i_13_ = i_2_ * 3;
					final int i_14_ = 3 * i_7_;
					final int i_15_ = i_5_ * 3;
					final int i_16_ = 3 * i_0_;
					final int i_17_ = i_13_ + i_6_ + (-i_15_ - i_3_);
					final int i_18_ = -i + (i_1_ - i_16_ + i_14_);
					final int i_19_ = -i_13_ + (i_15_ - (i_13_ - i_11_));
					final int i_20_ = i_12_ + -i_14_ + (-i_14_ + i_16_);
					final int i_21_ = -i_11_ + i_13_;
					final int i_22_ = i_14_ - i_12_;
					for (int i_23_ = 128; i_23_ <= 4096; i_23_ += 128) {
						final int i_24_ = i_23_ * i_23_ >> -1499707220;
						final int i_25_ = i_24_ * i_23_ >> -1727145204;
						final int i_26_ = i_17_ * i_25_;
						final int i_27_ = i_18_ * i_25_;
						final int i_28_ = i_19_ * i_24_;
						final int i_29_ = i_20_ * i_24_;
						final int i_30_ = i_23_ * i_21_;
						final int i_31_ = i_22_ * i_23_;
						final int i_32_ = i_3_
								+ (i_26_ - -i_28_ - -i_30_ >> 390504332);
						final int i_33_ = i
								+ (i_29_ + (i_27_ + i_31_) >> 1323025196);
						Class91.method890(i_4_, i_10_, i_33_, i_32_,
								(byte) -36, i_9_);
						i_9_ = i_32_;
						i_10_ = i_33_;
					}
				}
				if (i_8_ == 22024) {
					break;
				}
				aClass204_1372 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("lt.A(" + i
						+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_
						+ ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_
						+ ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method2580(final int i, final String string) {
		try {
			if (string != null) {
				if (((Class314.anInt2692 ^ 0xffffffff) <= -201 && !Class64_Sub18.aBoolean3690)
						|| Class314.anInt2692 >= 200) {
					za_Sub2.method1684(Class309.aClass309_2596.method3615(
							Class374.anInt3159, (byte) 25), 4, (byte) 49);
					final String string_34_ = Class309.aClass309_2597
							.method3615(Class374.anInt3159, (byte) 25);
					if (string_34_ != null) {
						za_Sub2.method1684(string_34_, 4, (byte) 127);
					}
				} else {
					final String string_35_ = Class353.method3867(-1, string);
					if (string_35_ != null && i == 4) {
						for (int i_36_ = 0; ((Class314.anInt2692 ^ 0xffffffff) < (i_36_ ^ 0xffffffff)); i_36_++) {
							final String string_37_ = Class353.method3867(-1,
									(Class98_Sub25.aStringArray4026[i_36_]));
							if (string_37_ != null
									&& string_37_.equals(string_35_)) {
								za_Sub2.method1684(
										(string + (Class309.aClass309_2624
												.method3615(Class374.anInt3159,
														(byte) 25))), 4,
										(byte) -32);
								return;
							}
							if (Class315.aStringArray3527[i_36_] != null) {
								final String string_38_ = Class353.method3867(i
										+ -5,
										(Class315.aStringArray3527[i_36_]));
								if (string_38_ != null
										&& string_38_.equals(string_35_)) {
									za_Sub2.method1684(
											(string + (Class309.aClass309_2624
													.method3615(
															Class374.anInt3159,
															(byte) 25))), 4,
											(byte) 119);
									return;
								}
							}
						}
						for (int i_39_ = 0; i_39_ < Class248.anInt1897; i_39_++) {
							final String string_40_ = Class353
									.method3867(
											i ^ ~0x4,
											(Class246_Sub4_Sub1.aStringArray6171[i_39_]));
							if (string_40_ != null
									&& string_40_.equals(string_35_)) {
								za_Sub2.method1684(
										((Class309.aClass309_2629.method3615(
												Class374.anInt3159, (byte) 25))
												+ string + (Class309.aClass309_2630
												.method3615(Class374.anInt3159,
														(byte) 25))), 4,
										(byte) -96);
								return;
							}
							if (Class98_Sub45.aStringArray4255[i_39_] != null) {
								final String string_41_ = Class353
										.method3867(
												-1,
												(Class98_Sub45.aStringArray4255[i_39_]));
								if (string_41_ != null
										&& string_41_.equals(string_35_)) {
									za_Sub2.method1684(
											((Class309.aClass309_2629
													.method3615(
															Class374.anInt3159,
															(byte) 25))
													+ string + (Class309.aClass309_2630
													.method3615(
															Class374.anInt3159,
															(byte) 25))), 4,
											(byte) -103);
									return;
								}
							}
						}
						if (Class353
								.method3867(
										-1,
										(Surface.player.name2))
								.equals(string_35_)) {
							za_Sub2.method1684(
									(Class309.aClass309_2627.method3615(
											Class374.anInt3159, (byte) 25)), 4,
									(byte) -100);
						} else {
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(
											260,
											Class246_Sub3_Sub4_Sub3.aClass171_6446,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
									r_Sub2.method1650(string, (byte) 88),
									i + 81);
							class98_sub11.aClass98_Sub22_Sub1_3865.method1188(
									string, (byte) 113);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lt.C(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2581(final int i) {
		try {
			if (i > 59) {
				aClass204_1372 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lt.B(" + i + ')');
		}
	}

	static final void method2582(final byte i) {
		try {
			Class98_Sub46_Sub11.aClass332Array6032 = null;
			Class119_Sub4.aClass332Array4739 = null;
			GameObjectDefinition.aClass332Array3000 = null;
			Class306.aClass332Array2557 = null;
			Class334.aClass332_3471 = null;
			Class287_Sub2.aClass332Array3275 = null;
			Class69_Sub2.aClass43_5336 = null;
			Class177.aClass332Array1382 = null;
			Class98_Sub10_Sub34.aClass43_5730 = null;
			Class254.aClass332Array1943 = null;
			Class64_Sub18.aClass332Array3689 = null;
			Class64_Sub14.aClass332Array3675 = null;
			Class284_Sub2_Sub2.aClass332_6199 = null;
			Class195.aClass43_1499 = null;
			Class340.aClass332Array2848 = null;
			Class76_Sub7.aClass332Array3764 = null;
			Class2.aClass332Array72 = null;
			if (i >= 11) {
				Class93.aClass332Array3512 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lt.D(" + i + ')');
		}
	}
}
