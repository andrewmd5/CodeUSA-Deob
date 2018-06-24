/* Class98_Sub10_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub1 extends Class98_Sub10 {
	private int anInt5541 = 4096;
	static Class75[] aClass75Array5542;
	static int anInt5543;
	static Class207 class207;

	@Override
	final int[] method990(final int i, final int i_0_) {
		try {
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_0_);
			if (i != 255) {
				anInt5543 = 92;
			}
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				final int[] is_1_ = method1000(i_0_ + -1 & za_Sub1.anInt6075,
						0, i ^ 0xff);
				final int[] is_2_ = method1000(i_0_, 0, 0);
				final int[] is_3_ = method1000(za_Sub1.anInt6075 & 1 + i_0_, 0,
						0);
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff); i_4_++) {
					final int i_5_ = anInt5541 * (is_3_[i_4_] - is_1_[i_4_]);
					final int i_6_ = ((is_2_[i_4_ - -1 & Class329.anInt2761] - is_2_[Class329.anInt2761
							& i_4_ + -1]) * anInt5541);
					final int i_7_ = i_6_ >> 1820664684;
					final int i_8_ = i_5_ >> 1009040556;
					final int i_9_ = i_7_ * i_7_ >> 466133996;
					final int i_10_ = i_8_ * i_8_ >> -1631782228;
					final int i_11_ = (int) (4096.0 * Math
							.sqrt((i_9_ - -i_10_ + 4096) / 4096.0F));
					final int i_12_ = (i_11_ ^ 0xffffffff) != -1 ? 16777216 / i_11_
							: 0;
					is[i_4_] = 4096 + -i_12_;
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "aca.G(" + i + ','
					+ i_0_ + ')');
		}
	}

	public Class98_Sub10_Sub1() {
		super(1, true);
	}

	static final void method1002(final boolean bool) {
		try {
			Class199.aClass32_1531.method313((byte) 30, 5);
			Class82.aClass153_630.method2485(5, 1);
			Class149.aClass83_1205.method827((byte) -63, 5);
			Class130.aClass302_1028.method3548(5, (byte) 85);
			Class4.aClass301_85.method3539(5, (byte) 123);
			Class98_Sub46_Sub19.aClass205_6068.method2720(5, 1);
			Class151_Sub7.aClass183_5001.method2621(5, 3);
			Class196.aClass304_1509.method3566((byte) -53, 5);
			Class17.aClass198_205.method2681((byte) 126, 5);
			Class134.aClass139_3465.method2284((byte) -120, 5);
			Class370.aClass257_3136.method3197((byte) 30, 5);
			Class216.aClass341_1622.method3806(5, false);
			Class98_Sub10_Sub23.aClass335_5662.method3767(56, 5);
			Class98_Sub43_Sub1.aClass365_5897.method3943(5, false);
			Class303.aClass13_2529.method223(32, 5);
			Class373_Sub2.aClass59_5470.method530((byte) -32, 5);
			Class101.aClass115_857.method2153(5, (byte) -125);
			Class21_Sub1.aClass269_5383.method3272(119, 5);
			Class18.aClass11_213.method203(bool, 5);
			Class62.aClass264_487.method3227(5, -112);
			Class246_Sub3_Sub1.aClass121_6150.method2191(5, (byte) 126);
			Class43.method404(5, 2974);
			Class269.method3266(50, (byte) -50);
			Class98_Sub11.method1124(50, (byte) 78);
			Class77_Sub1.method787((byte) 110, 5);
			Class67.method687((byte) 118, 5);
			Class275.aClass79_2046.method800((byte) 62, 5);
			Class224_Sub3.aClass79_5039.method800((byte) 62, 5);
			Class378.aClass79_3189.method800((byte) 62, 5);
			RSModelLoader.aClass79_3847.method800((byte) 62, 5);
			ClientScriptsDefs.aClass79_1890.method800((byte) 62, 5);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "aca.H(" + bool
					+ ')');
		}
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_13_) {
		do {
			try {
				if (i_13_ >= -92) {
					class207 = null;
				}
				if ((i ^ 0xffffffff) != -1) {
					break;
				}
				anInt5541 = class98_sub22.readUnsignedShort((byte) 127);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("aca.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_13_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1003(final boolean bool, final boolean bool_14_) {
		try {
			if (aa_Sub1.aClass123_3561 != null) {
				aa_Sub1.aClass123_3561.method2207(-14);
				aa_Sub1.aClass123_3561 = null;
			}
			Class64_Sub16.anInt3680 = 0;
			Class98_Sub10_Sub15.method1050((byte) 97);
			Class129.method2229();
			for (int i = 0; i < 4; i++) {
				Class167.aClass243Array1281[i].method2950((byte) -99);
			}
			Class118.method2173(false, -7);
			System.gc();
			Class96.method923(127, 2);
			Class151_Sub5.aBoolean4991 = bool;
			Class144.anInt1169 = -1;
			Class233.method2883((byte) 111);
			Class309.method3614(true, 121);
			Class272.anInt2038 = 0;
			Class160.anInt1258 = 0;
			Class275.anInt2047 = 0;
			aa_Sub2.anInt3562 = 0;
			Class118.anInt978 = Class151_Sub9.anInt5028 = 0;
			for (int i = 0; Class104.aClass36Array903.length > i; i++) {
				Class104.aClass36Array903[i] = null;
			}
			Class121.method2195(30574);
			for (int i = 0; i < 2048; i++) {
				Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i] = null;
			}
			Class150.anInt1211 = 0;
			Class260.aClass377_3254.method3994(-96);
			Class98_Sub10_Sub20.anInt5640 = 0;
			AbstractModel.aClass377_1180.method3994(-126);
			Class284.method3359(9268);
			Class75.anInt581 = 0;
			Class75.aClass140_584.method2288((byte) -103);
			Class373_Sub3.method3977(true);
			Class246_Sub4_Sub1.method3104(5134);
			Class11.aLong121 = 0L;
			Class284.aClass98_Sub4_2167 = null;
			if (bool_14_) {
				Class61.method538(12, false);
			} else {
				Class61.method538(3, false);
				try {
					Class203.method2704("loggedout",
							Class76_Sub11.anApplet3799, -26978);
				} catch (final Throwable throwable) {
					/* empty */
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("aca.E(" + bool
					+ ',' + bool_14_ + ')'));
		}
	}

	static final void method1004(final int i, int i_15_) {
		try {
			if ((i_15_ ^ 0xffffffff) > -1 || (i_15_ ^ 0xffffffff) < -3) {
				i_15_ = 0;
			}
			if (i > -41) {
				aClass75Array5542 = null;
			}
			Class337_Sub1.anInt5497 = i_15_;
			Class373_Sub2.aClass246_Sub5Array5469 = new Class246_Sub5[1 + (Class224_Sub1.anIntArray5034[Class337_Sub1.anInt5497])];
			Class258.anInt1952 = 0;
			Class273.anInt2039 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "aca.F(" + i + ','
					+ i_15_ + ')');
		}
	}

	static final boolean method1005(final int i, final int i_16_,
			final byte i_17_) {
		try {
			if (i_17_ != -23) {
				class207 = null;
			}
			if ((0x800 & i ^ 0xffffffff) == -1
					|| (i_16_ & 0x37 ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("aca.D(" + i + ','
					+ i_16_ + ',' + i_17_ + ')'));
		}
	}

	public static void method1006(final int i) {
		try {
			if (i == -1) {
				aClass75Array5542 = null;
				class207 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "aca.B(" + i + ')');
		}
	}
}
