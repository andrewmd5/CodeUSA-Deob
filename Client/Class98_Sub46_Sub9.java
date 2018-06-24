/* Class98_Sub46_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub9 extends Class98_Sub46 {
	static long aLong5997 = 0L;
	String aString5998;
	Class215 aClass215_5999;
	static OutgoingOpcode aClass171_6000 = new OutgoingOpcode(0, 8);
	int anInt6001;
	static boolean aBoolean6002 = false;
	static int anInt6003;
	/* synthetic */static Class aClass6004;

	static final void method1553(final Class246_Sub3 class246_sub3,
			final int i, final int i_0_, final int i_1_) {
		if (i_0_ < Class366.anInt3112) {
			final Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_0_ + 1][i_1_]);
			if (class172 != null && class172.aClass246_Sub3_Sub1_1332 != null
					&& class172.aClass246_Sub3_Sub1_1332.method2982((byte) -84)) {
				class246_sub3.method2981((class172.aClass246_Sub3_Sub1_1332),
						(byte) -94, true, r_Sub2.anInt6333,
						Class98_Sub10_Sub30.aHa5709, 0, 0);
			}
		}
		if (i_1_ < Class366.anInt3112) {
			final Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_0_][i_1_ + 1]);
			if (class172 != null && class172.aClass246_Sub3_Sub1_1332 != null
					&& class172.aClass246_Sub3_Sub1_1332.method2982((byte) -97)) {
				class246_sub3.method2981((class172.aClass246_Sub3_Sub1_1332),
						(byte) 115, true, 0, Class98_Sub10_Sub30.aHa5709, 0,
						r_Sub2.anInt6333);
			}
		}
		if (i_0_ < Class366.anInt3112 && i_1_ < Class64_Sub9.anInt3662) {
			final Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_0_ + 1][i_1_ + 1]);
			if (class172 != null && class172.aClass246_Sub3_Sub1_1332 != null
					&& class172.aClass246_Sub3_Sub1_1332.method2982((byte) -88)) {
				class246_sub3.method2981((class172.aClass246_Sub3_Sub1_1332),
						(byte) 117, true, r_Sub2.anInt6333,
						Class98_Sub10_Sub30.aHa5709, 0, r_Sub2.anInt6333);
			}
		}
		if (i_0_ < Class366.anInt3112 && i_1_ > 0) {
			final Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_0_ + 1][i_1_ - 1]);
			if (class172 != null
					&& class172.aClass246_Sub3_Sub1_1332 != null
					&& class172.aClass246_Sub3_Sub1_1332
							.method2982((byte) -118)) {
				class246_sub3.method2981((class172.aClass246_Sub3_Sub1_1332),
						(byte) 88, true, r_Sub2.anInt6333,
						Class98_Sub10_Sub30.aHa5709, 0, -r_Sub2.anInt6333);
			}
		}
	}

	static final boolean method1554(final int i, final int i_2_, final int i_3_) {
		try {
			if (i_2_ != 22251) {
				method1554(113, 12, -12);
			}
			if ((i & 0x180 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("f.C(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	final boolean method1555(final int i,
			final Class98_Sub46_Sub8 class98_sub46_sub8) {
		try {
			boolean bool = true;
			class98_sub46_sub8.method1524((byte) -90);
			if (i < 68) {
				aClass215_5999 = null;
			}
			Class98_Sub46_Sub8 class98_sub46_sub8_4_ = ((Class98_Sub46_Sub8) aClass215_5999
					.method2792(-1));
			while (class98_sub46_sub8_4_ != null) {
				if (Class378.method4004((byte) 93,
						class98_sub46_sub8.anInt5990,
						class98_sub46_sub8_4_.anInt5990)) {
					Class51.method487(83, class98_sub46_sub8_4_,
							class98_sub46_sub8);
					anInt6001++;
					if (bool) {
						return false;
					}
					return true;
				}
				class98_sub46_sub8_4_ = (Class98_Sub46_Sub8) aClass215_5999
						.method2787(0);
				bool = false;
			}
			aClass215_5999.method2785(class98_sub46_sub8, -30);
			anInt6001++;
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("f.A(" + i + ','
					+ (class98_sub46_sub8 != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class98_Sub11 method1556(final boolean bool) {
		try {
			final Class98_Sub11 class98_sub11 = Class289.method3410(-1);
			class98_sub11.aClass171_3864 = null;
			if (bool != false) {
				method1554(39, 118, -15);
			}
			class98_sub11.anInt3867 = 0;
			class98_sub11.aClass98_Sub22_Sub1_3865 = new Class98_Sub22_Sub1(
					5000);
			return class98_sub11;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "f.B(" + bool + ')');
		}
	}

	final boolean method1557(final byte i,
			final Class98_Sub46_Sub8 class98_sub46_sub8) {
		try {
			final int i_5_ = method1559(75);
			class98_sub46_sub8.method1524((byte) -90);
			anInt6001--;
			if (i >= -65) {
				aClass215_5999 = null;
			}
			if ((anInt6001 ^ 0xffffffff) != -1) {
				if (i_5_ == method1559(123)) {
					return false;
				}
				return true;
			}
			method942(73);
			method1524((byte) -90);
			Class64_Sub12.anInt3672--;
			Class98_Sub46_Sub16.aClass79_6046.method805(
					(class98_sub46_sub8.aLong5991), this, (byte) -80);
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("f.E(" + i + ','
					+ (class98_sub46_sub8 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1558(final byte i, final Class98_Sub33 class98_sub33) {
		try {
			if (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948 != null) {
				Interface19 interface19 = null;
				if (class98_sub33.anInt4118 == 0) {
					interface19 = ((Interface19) (Class21_Sub1.method268(
							class98_sub33.anInt4116, class98_sub33.anInt4112,
							class98_sub33.anInt4113)));
				}
				if (i != 109) {
					aBoolean6002 = false;
				}
				if ((class98_sub33.anInt4118 ^ 0xffffffff) == -2) {
					interface19 = ((Interface19) Class101.method1701(
							(class98_sub33.anInt4116),
							(class98_sub33.anInt4112),
							(class98_sub33.anInt4113)));
				}
				if ((class98_sub33.anInt4118 ^ 0xffffffff) == -3) {
					interface19 = ((Interface19) (AnimationDefinition
							.method931(
									class98_sub33.anInt4116,
									class98_sub33.anInt4112,
									class98_sub33.anInt4113,
									(aClass6004 != null ? aClass6004
											: (aClass6004 = method1562("Interface19"))))));
				}
				if ((class98_sub33.anInt4118 ^ 0xffffffff) == -4) {
					interface19 = ((Interface19) Class253.method3177(
							(class98_sub33.anInt4116),
							(class98_sub33.anInt4112),
							(class98_sub33.anInt4113)));
				}
				if (interface19 != null) {
					class98_sub33.anInt4119 = interface19.method64(30472);
					class98_sub33.anInt4115 = interface19.method63((byte) 20);
					class98_sub33.anInt4121 = interface19.method66(4657);
				} else {
					class98_sub33.anInt4121 = 0;
					class98_sub33.anInt4119 = -1;
					class98_sub33.anInt4115 = 0;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("f.G(" + i + ','
					+ (class98_sub33 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method1559(final int i) {
		try {
			if (i <= 73) {
				aLong5997 = 94L;
			}
			if ((aClass215_5999.aClass98_Sub46_1615).aClass98_Sub46_4262 != (aClass215_5999.aClass98_Sub46_1615)) {
				return (((Class98_Sub46_Sub8) ((aClass215_5999).aClass98_Sub46_1615.aClass98_Sub46_4262)).anInt5990);
			}
			return -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "f.F(" + i + ')');
		}
	}

	public static void method1560(final byte i) {
		try {
			if (i >= 43) {
				aClass171_6000 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "f.M(" + i + ')');
		}
	}

	static final void method1561(final ha var_ha, final int i) {
		try {
			if (i != -256) {
				anInt6003 = 112;
			}
			int i_6_ = 0;
			int i_7_ = 0;
			if (za_Sub2.aBoolean6079) {
				i_6_ = Class189.method2642((byte) 42);
				i_7_ = Class335.method3765(false);
			}
			final int i_8_ = -10660793;
			Class42_Sub1.method381(Class15.anInt172, i_7_ + Class104.anInt897,
					var_ha, -16777216, i_8_, Class246_Sub3_Sub4_Sub4.anInt6488,
					8516, Class38.anInt355 + i_6_);
			Class98_Sub10_Sub34.aClass43_5730.method411((byte) -73, 14
					+ Class104.anInt897 + i_7_, Class309.aClass309_2610
					.method3615(Class374.anInt3159, (byte) 25), i_8_, -1, 3
					+ i_6_ + Class38.anInt355);
			final int i_9_ = Class2.aClass299_73.method3514(68) + i_6_;
			final int i_10_ = Class2.aClass299_73.method3507((byte) 90) + i_7_;
			if (Class248.aBoolean1896) {
				int i_11_ = 0;
				for (Class98_Sub46_Sub9 class98_sub46_sub9 = ((Class98_Sub46_Sub9) Class98_Sub18.aClass215_3949
						.method2792(-1)); class98_sub46_sub9 != null; class98_sub46_sub9 = ((Class98_Sub46_Sub9) Class98_Sub18.aClass215_3949
						.method2787(0))) {
					final int i_12_ = i_11_ * 16
							+ (31 + (Class104.anInt897 + i_7_));
					i_11_++;
					if (class98_sub46_sub9.anInt6001 == 1) {
						Class246_Sub3_Sub2_Sub1
								.method3009(
										Class15.anInt172,
										((Class98_Sub46_Sub8) ((class98_sub46_sub9.aClass215_5999).aClass98_Sub46_1615.aClass98_Sub46_4262)),
										-256,
										Class246_Sub3_Sub4_Sub4.anInt6488,
										i_12_, i_7_ + Class104.anInt897, i_9_,
										var_ha, i_10_, 0, -1, Class38.anInt355
												- -i_6_);
					} else {
						Class320.method3663(class98_sub46_sub9, -1, i_9_,
								Class15.anInt172, i_10_, i_6_
										+ Class38.anInt355, var_ha, i_12_,
								-256, 0, Class246_Sub3_Sub4_Sub4.anInt6488,
								i_7_ + Class104.anInt897);
					}
				}
				if (Class308.aClass98_Sub46_Sub9_2583 != null) {
					Class42_Sub1.method381(Class98_Sub43_Sub4.anInt5938,
							Class163.anInt3518, var_ha, -16777216, i_8_,
							Class5.anInt3439, 8516, Class282.anInt2128);
					Class98_Sub10_Sub34.aClass43_5730.method411((byte) -50,
							Class163.anInt3518 + 14,
							Class308.aClass98_Sub46_Sub9_2583.aString5998,
							i_8_, -1, Class282.anInt2128 - -3);
					i_11_ = 0;
					for (Class98_Sub46_Sub8 class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class308.aClass98_Sub46_Sub9_2583.aClass215_5999
							.method2792(i + 255)); class98_sub46_sub8 != null; class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class308.aClass98_Sub46_Sub9_2583.aClass215_5999
							.method2787(0))) {
						final int i_13_ = 16 * i_11_
								+ (31 + Class163.anInt3518);
						Class246_Sub3_Sub2_Sub1.method3009(
								Class98_Sub43_Sub4.anInt5938,
								class98_sub46_sub8, -256, Class5.anInt3439,
								i_13_, Class163.anInt3518, i_9_, var_ha, i_10_,
								0, -1, Class282.anInt2128);
						i_11_++;
					}
					Class351.method3849(Class98_Sub43_Sub4.anInt5938, -8,
							Class282.anInt2128, Class5.anInt3439,
							Class163.anInt3518);
				}
			} else {
				int i_14_ = 0;
				for (Class98_Sub46_Sub8 class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class33.aClass148_315
						.method2418(i ^ ~0xdf)); class98_sub46_sub8 != null; class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class33.aClass148_315
						.method2417(109))) {
					final int i_15_ = 31 + (i_7_ + Class104.anInt897 - -((-i_14_
							+ -1 + Class359.anInt3058) * 16));
					Class246_Sub3_Sub2_Sub1.method3009(Class15.anInt172,
							class98_sub46_sub8, -256,
							Class246_Sub3_Sub4_Sub4.anInt6488, i_15_,
							Class104.anInt897 + i_7_, i_9_, var_ha, i_10_, 0,
							-1, Class38.anInt355 - -i_6_);
					i_14_++;
				}
			}
			Class351.method3849(Class15.anInt172, i ^ 0xf8, i_6_
					+ Class38.anInt355, Class246_Sub3_Sub4_Sub4.anInt6488, i_7_
					+ Class104.anInt897);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "f.D("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	Class98_Sub46_Sub9(final String string) {
		try {
			aString5998 = string;
			aClass215_5999 = new Class215();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "f.<init>("
					+ (string != null ? "{...}" : "null") + ')');
		}
	}

	/* synthetic */static Class method1562(final String string) {
		try {
			return Class.forName(string);
		} catch (final ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
