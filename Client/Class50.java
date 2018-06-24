/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class50 {
	static int[] anIntArray417;
	static int anInt418 = 0;
	static float aFloat419;

	public static void method483(final int i) {
		try {
			if (i != -11543) {
				method483(-8);
			}
			anIntArray417 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dj.D(" + i + ')');
		}
	}

	static final void method484(final int i, final int i_0_) {
		try {
			final int i_2_ = Class215.anInt1614
					+ -Class98_Sub10_Sub14.anInt5613;
			if (i_2_ >= 100) {
				Class116.anInt967 = Class64_Sub26.anInt3712 = -1;
				Class98_Sub46_Sub20_Sub2.anInt6319 = 1;
			} else {
				int i_3_ = (int) Class119_Sub4.aFloat4740;
				if ((i_3_ ^ 0xffffffff) > (Class43.anInt372 >> 237711528 ^ 0xffffffff)) {
					i_3_ = Class43.anInt372 >> 238117992;
				}
				if (Class217.aBooleanArray3410[4]
						&& 128 + Class98_Sub10_Sub13.anIntArray5603[4] > i_3_) {
					i_3_ = 128 + Class98_Sub10_Sub13.anIntArray5603[4];
				}
				final int i_4_ = ((Class98_Sub10_Sub9.anInt5581 + (int) Class98_Sub22_Sub2.aFloat5794) & 0x3fff);
				Class104.method1712(
						false,
						i_4_,
						(i_3_ >> 756311203) * 3 + 600 << 995508098,
						Class224_Sub3_Sub1.anInt6147,
						i,
						Class201.anInt1545,
						i_3_,
						(Class98_Sub46_Sub2_Sub2
								.method1538(
										Class43.anInt377,
										((Class246_Sub3) Surface.player).anInt5079,
										((Class246_Sub3) Surface.player).anInt5084,
										24111)) - 200);
				final float f = 1.0F - ((100 + -i_2_)
						* ((-i_2_ + 100) * (100 - i_2_)) / 1000000.0F);
				Entity.anInt6357 = (int) ((-Class299.anInt2494 + Entity.anInt6357)
						* f + Class299.anInt2494);
				Class98_Sub46_Sub10.anInt6020 = (int) (Class246_Sub3_Sub4_Sub2_Sub1.anInt6511 + (-Class246_Sub3_Sub4_Sub2_Sub1.anInt6511 + Class98_Sub46_Sub10.anInt6020)
						* f);
				Class79.anInt601 = (int) (Class363.anInt3095 + f
						* (-Class363.anInt3095 + Class79.anInt601));
				Class134.anInt3461 = (int) (Class98_Sub50.anInt4292 + (Class134.anInt3461 + -Class98_Sub50.anInt4292)
						* f);
				int i_5_ = -Class96.anInt801 + Class186.anInt3424;
				do {
					if ((i_5_ ^ 0xffffffff) >= -8193) {
						if (i_5_ >= -8192) {
							break;
						}
						i_5_ += 16384;
						if (!client.aBoolean3553) {
							break;
						}
					}
					i_5_ -= 16384;
				} while (false);
				Class186.anInt3424 = (int) (Class96.anInt801 + i_5_ * f);
				Class186.anInt3424 &= 0x3fff;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dj.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method485(final int i) {
		try {
			final int i_6_ = Class2.anInt71;
			final int[] is = Class319.anIntArray2705;
			for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
				final Player class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[is[i_8_]]);
				if (class246_sub3_sub4_sub2_sub2 != null) {
					Class98_Sub10_Sub10.method1038(
							class246_sub3_sub4_sub2_sub2,
							class246_sub3_sub4_sub2_sub2.method3034(0), -12212);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dj.A(" + i + ')');
		}
	}

	static final Class98_Sub11 method486(final int i, final int i_15_,
			final int i_16_, final int i_17_, final int i_18_, final int i_19_,
			final int i_20_, final boolean bool, final int i_21_) {
		try {
			final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4.method3023(
					260, Class254.aClass171_1940, Class331.aClass117_2811);
			// class98_sub11 = Class246_Sub3_Sub4.method3023(260,
			// ha.aClass171_939, Class331.aClass117_2811);
			// ((Class98_Sub11)
			// class98_sub11).aClass98_Sub22_Sub1_3865.writeShort(Class272.anInt2038
			// + toLocalX, 128);
			// ((Class98_Sub11)
			// class98_sub11).aClass98_Sub22_Sub1_3865.writeShort(aa_Sub2.anInt3562
			// + toLocalY, 128);
			class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
					Class272.anInt2038 + i_20_, 128);
			class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(aa_Sub2.anInt3562
					+ i_19_, 128);
			class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
					!Class219.aClass77_1641.method779(82, 5503) ? 0 : 1, 72);
			return class98_sub11;
		} catch (final RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			return null;
		}
	}
}
