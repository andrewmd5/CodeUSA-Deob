/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.reflect.Field;

final class Class269 {
	static String[] aStringArray2021 = new String[8];
	private Class207 aClass207_2022;
	static float[] aFloatArray2023 = { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F,
			0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
	static int anInt2024 = -1;
	static Class207 aClass207_2025;
	static int anInt2026;
	static float[] aFloatArray2027 = new float[4];
	private final Class79 aClass79_2028 = new Class79(64);
	/* synthetic */static Class aClass2029;
	/* synthetic */static Class aClass2030;

	final void method3265(final int i) {
		try {
			synchronized (aClass79_2028) {
				if (i != 1) {
					aFloatArray2023 = null;
				}
				aClass79_2028.method794(85);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qq.I(" + i + ')');
		}
	}

	static final void method3266(final int i, final byte i_0_) {
		try {
			Class69_Sub2.aClass79_5334.method800((byte) 62, i);
			Class64_Sub5.aClass79_3650.method800((byte) 62, i);
			Class76_Sub11.aClass79_3797.method800((byte) 62, i);
			Class151_Sub7.aClass79_5004.method800((byte) 62, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qq.H(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method3267(final byte i) {
		do {
			try {
				aStringArray2021 = null;
				aClass207_2025 = null;
				aFloatArray2027 = null;
				aFloatArray2023 = null;
				if (i > 36) {
					break;
				}
				method3266(-41, (byte) 0);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "qq.E(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final Class379 method3268(final int i, final int i_2_) {
		try {
			Class379 class379;
			synchronized (aClass79_2028) {
				class379 = (Class379) aClass79_2028.method802(-126, i_2_);
			}
			if (i != -37) {
				method3269(false, 104);
			}
			if (class379 != null) {
				return class379;
			}
			byte[] is;
			synchronized (aClass207_2022) {
				is = aClass207_2022.method2745(i_2_, 31, false);
			}
			class379 = new Class379();
			if (is != null) {
				class379.method4008((byte) 126, new ByteBuffer(is));
			}
			synchronized (aClass79_2028) {
				aClass79_2028.method805(i_2_, class379, (byte) -80);
			}
			return class379;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qq.C(" + i + ','
					+ i_2_ + ')');
		}
	}

	static final void method3269(final boolean bool, final int i) {
		try {
			if (bool) {
				if (Class15.anInt185 != -1) {
					Class246.method2964(false, Class15.anInt185);
				}
				for (Class98_Sub18 class98_sub18 = ((Class98_Sub18) Class116.aClass377_964
						.method3998(94)); class98_sub18 != null; class98_sub18 = ((Class98_Sub18) Class116.aClass377_964
						.method3995(-1))) {
					if (!class98_sub18.method941((byte) 78)) {
						class98_sub18 = (Class98_Sub18) Class116.aClass377_964
								.method3998(121);
						if (class98_sub18 == null) {
							break;
						}
					}
					Class196.method2666(16398, false, class98_sub18, true);
				}
				Class15.anInt185 = -1;
				Class116.aClass377_964 = new Class377(8);
				Class76_Sub9.method768(118);
				Class15.anInt185 = ItemDefs.anInt2470;
				Class40.method359(i + 83, false);
				Class98_Sub43.method1481(2);
				ClientScriptsDefs.method3155(Class15.anInt185);
			}
			Class98_Sub5.userName = Class360.passWord = "";
			aa_Sub3.aBoolean3569 = false;
			Class162.method2516(-96);
			Class21_Sub2.anInt5387 = -1;
			Class43.method401(OutputStream_Sub2.anInt39, true);
			Surface.player = new Player();
			((Class246_Sub3) Surface.player).anInt5084 = Class165.anInt1276 * 512 / 2;
			((Entity) Surface.player).anIntArray6437[i] = Class165.anInt1276 / 2;
			((Class246_Sub3) Surface.player).anInt5079 = Class98_Sub10_Sub7.anInt5572 * 512 / 2;
			((Entity) Surface.player).anIntArray6438[0] = Class98_Sub10_Sub7.anInt5572 / 2;
			Class98_Sub46_Sub10.anInt6020 = Class134.anInt3461 = 0;
			if ((Class98_Sub46_Sub20_Sub2.anInt6319 ^ 0xffffffff) != -3) {
				AnimationDefParser.method2620(0);
			} else {
				Class134.anInt3461 = Class98_Sub10_Sub21.anInt5643 << 1006717769;
				Class98_Sub46_Sub10.anInt6020 = Class363.anInt3098 << 1638996777;
			}
			Class374.method3980((byte) 121);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qq.B(" + bool
					+ ',' + i + ')');
		}
	}

	static final int method3270(final int i) {
		try {
			int i_3_ = 0;
			final Field[] fields = (aClass2029 != null ? aClass2029
					: (aClass2029 = method3274("Class98_Sub27")))
					.getDeclaredFields();
			final Field[] fields_4_ = fields;
			for (int i_5_ = 0; (fields_4_.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
				final Field field = fields_4_[i_5_];
				if ((aClass2030 != null ? aClass2030
						: (aClass2030 = method3274("Class64")))
						.isAssignableFrom(field.getType())) {
					i_3_++;
				}
			}
			if (i <= 85) {
				method3273(true);
			}
			return 1 + i_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qq.F(" + i + ')');
		}
	}

	final void method3271(final boolean bool) {
		try {
			synchronized (aClass79_2028) {
				aClass79_2028.method806((byte) 63);
			}
			if (bool != true) {
				aClass207_2025 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qq.A(" + bool
					+ ')');
		}
	}

	final void method3272(final int i, final int i_6_) {
		try {
			synchronized (aClass79_2028) {
				aClass79_2028.method800((byte) 62, i_6_);
			}
			if (i <= 110) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qq.G(" + i + ','
					+ i_6_ + ')');
		}
	}

	static final void method3273(final boolean bool) {
		try {
			if (bool == true) {
				for (Class98_Sub33 class98_sub33 = ((Class98_Sub33) Class191.aClass148_1478
						.method2418(32)); class98_sub33 != null; class98_sub33 = ((Class98_Sub33) Class191.aClass148_1478
						.method2417(109))) {
					Class148.method2428(class98_sub33, false, 15697);
				}
				for (Class98_Sub33 class98_sub33 = ((Class98_Sub33) Class98_Sub11.aClass148_3866
						.method2418(32)); class98_sub33 != null; class98_sub33 = ((Class98_Sub33) Class98_Sub11.aClass148_3866
						.method2417(93))) {
					Class148.method2428(class98_sub33, true, 15697);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qq.D(" + bool
					+ ')');
		}
	}

	Class269(final Class279 class279, final int i, final Class207 class207) {
		try {
			aClass207_2022 = class207;
			aClass207_2022.method2761(0, 31);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qq.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	/* synthetic */
	static Class method3274(final String string) {
		try {
			return Class.forName(string);
		} catch (final ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
