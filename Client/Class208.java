/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class208 {
	static int[] anIntArray1579;
	static int[] anIntArray1580 = new int[8];
	static Class207 aClass207_1581;

	static final void method2767() {
		final int i = 10;
		final int i_0_ = 30;
		if (Class64_Sub21.anInt3702 != 0 && Class284_Sub1.aClass43_5177 != null) {
			Class98_Sub10_Sub30.aHa5709.K(Class98_Sub16.anIntArray3933);
			for (int i_1_ = 0; i_1_ < s.anIntArray2205.length; i_1_++) {
				Class98_Sub10_Sub30.aHa5709
						.method1755(
								8479,
								Class98_Sub16.anIntArray3933[1],
								s.anIntArray2205[i_1_]
										+ Class15.anIntArray182[i_1_],
								-256,
								(Class98_Sub16.anIntArray3933[3] - Class98_Sub16.anIntArray3933[1]));
			}
			for (int i_2_ = 0; i_2_ < Class59.anInt464; i_2_++) {
				final Class155 class155 = Class213.aClass155Array1611[i_2_];
				Class98_Sub10_Sub30.aHa5709.H(class155.anIntArray1240[0],
						class155.anIntArray1237[0], class155.anIntArray1241[0],
						Class237.anIntArray1809);
				Class98_Sub10_Sub30.aHa5709.H(class155.anIntArray1240[1],
						class155.anIntArray1237[1], class155.anIntArray1241[1],
						Class314.anIntArray2691);
				Class98_Sub10_Sub30.aHa5709.H(class155.anIntArray1240[2],
						class155.anIntArray1237[2], class155.anIntArray1241[2],
						Class98_Sub46_Sub6.anIntArray5980);
				Class98_Sub10_Sub30.aHa5709.H(class155.anIntArray1240[3],
						class155.anIntArray1237[3], class155.anIntArray1241[3],
						Class262.anIntArray1962);
				if (Class237.anIntArray1809[2] != -1
						&& Class314.anIntArray2691[2] != -1
						&& Class98_Sub46_Sub6.anIntArray5980[2] != -1
						&& Class262.anIntArray1962[2] != -1) {
					int i_3_ = -65536;
					if (class155.aByte1242 == 4) {
						i_3_ = -16776961;
					}
					Class98_Sub10_Sub30.aHa5709.method1789(
							Class237.anIntArray1809[1], i_3_,
							Class314.anIntArray2691[1],
							Class314.anIntArray2691[0], -10550,
							Class237.anIntArray1809[0]);
					Class98_Sub10_Sub30.aHa5709.method1789(
							Class314.anIntArray2691[1], i_3_,
							Class98_Sub46_Sub6.anIntArray5980[1],
							Class98_Sub46_Sub6.anIntArray5980[0], -10550,
							Class314.anIntArray2691[0]);
					Class98_Sub10_Sub30.aHa5709.method1789(
							Class98_Sub46_Sub6.anIntArray5980[1], i_3_,
							Class262.anIntArray1962[1],
							Class262.anIntArray1962[0], -10550,
							Class98_Sub46_Sub6.anIntArray5980[0]);
					Class98_Sub10_Sub30.aHa5709.method1789(
							Class262.anIntArray1962[1], i_3_,
							Class237.anIntArray1809[1],
							Class237.anIntArray1809[0], -10550,
							Class262.anIntArray1962[0]);
					Class98_Sub10_Sub30.aHa5709.method1789(
							Class237.anIntArray1809[1], i_3_,
							Class98_Sub46_Sub6.anIntArray5980[1],
							Class98_Sub46_Sub6.anIntArray5980[0], -10550,
							Class237.anIntArray1809[0]);
				}
			}
			Class284_Sub1.aClass43_5177.method411((byte) -118, i_0_ + 45,
					("Dynamic: " + Class347.anInt2907 + "/" + 5000), -256,
					-16777216, i);
			Class284_Sub1.aClass43_5177
					.method411((byte) 62, i_0_ + 60,
							("Total Opaque Onscreen: "
									+ GameObjectDefinitionLoader.anInt2523
									+ "/" + 10000), -256, -16777216, i);
			Class284_Sub1.aClass43_5177
					.method411((byte) 46, i_0_ + 75, ("Total Trans Onscreen: "
							+ Class353.anInt3009 + "/" + 5000), -256,
							-16777216, i);
			Class284_Sub1.aClass43_5177.method411((byte) 78, i_0_ + 90,
					("Occluders: "
							+ (Class21_Sub3.anInt5389 + Class336.anInt2820)
							+ " Active: " + Class59.anInt464), -256, -16777216,
					i);
			Class284_Sub1.aClass43_5177
					.method411((byte) 84, i_0_ + 105,
							("Occluded: Ground:"
									+ GameObjectDefinitionLoader.anInt2518
									+ " Walls: " + Class98_Sub16.anInt3927
									+ " CPs: " + Class151_Sub7.anInt5006
									+ " Pixels: " + Class4.anInt81), -256,
							-16777216, i);
			Class284_Sub1.aClass43_5177
					.method411((byte) 78, i_0_ + 120, ("Occlude Calc Took: "
							+ Class249.aLong1898 / 1000L + "us"), -256,
							-16777216, i);
			if (Class64_Sub21.anInt3702 == 2
					&& Class111_Sub3.anIntArray4707 != null) {
				for (int i_4_ = 0; i_4_ < Class111_Sub3.anIntArray4707.length; i_4_++) {
					float f = Class111_Sub3.anIntArray4707[i_4_];
					f /= 4194304.0F;
					if (f > 1.0F) {
						f = 1.0F;
					}
					f *= 255.0F;
					f = 255.0F - f;
					final int i_5_ = (int) f;
					Class111_Sub3.anIntArray4707[i_4_] = i_5_ | i_5_ << 8
							| i_5_ << 16 | ~0xffffff;
				}
				final Class332 class332 = (Class98_Sub10_Sub30.aHa5709
						.method1748(-7962, 0, Class64_Sub3.anInt3646,
								IncomingOpcode.anInt461,
								Class111_Sub3.anIntArray4707,
								Class64_Sub3.anInt3646));
				class332.method3748(i, 170, 1, 0, 0);
			}
		}
	}

	public static void method2768(final int i) {
		try {
			anIntArray1579 = null;
			if (i <= 97) {
				method2767();
			}
			anIntArray1580 = null;
			aClass207_1581 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nia.B(" + i + ')');
		}
	}
}
