/* Class329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class329 {
	int anInt2760;
	static int anInt2761;
	int anInt2762;
	int anInt2763;
	int anInt2764;
	static int anInt2765 = 0;
	int anInt2766;
	int anInt2767;
	int anInt2768 = 128;
	int anInt2769;
	int anInt2770;
	static int[] anIntArray2771;
	int anInt2772;
	int anInt2773;

	static final void method3708(final int i) {
		try {
			if (Class53_Sub1.method499(i ^ ~0x800, Class177.anInt1376)
					|| Class246_Sub3_Sub3.method3011(-6410, Class177.anInt1376)) {
				Class185.method2630(Class134.anInt3461 >> -802670004, -108,
						(Class98_Sub46_Sub10.anInt6020 >> 1156493548), 5000);
			} else {
				final int i_0_ = ((((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6437[0]) >> -1272391965);
				final int i_1_ = ((((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6438[0]) >> -1164602557);
				if ((i_0_ ^ 0xffffffff) > -1
						|| Class165.anInt1276 >> -310895453 <= i_0_
						|| (i_1_ ^ 0xffffffff) > -1
						|| ((i_1_ ^ 0xffffffff) <= (Class98_Sub10_Sub7.anInt5572 >> 1384895075 ^ 0xffffffff))) {
					Class185.method2630(
							(Class98_Sub10_Sub7.anInt5572 >> -980626748), i
									+ -118, Class165.anInt1276 >> -3353948, 0);
				} else {
					Class185.method2630(i_1_, i + -111, i_0_, 5000);
				}
			}
			RuntimeException_Sub1.method4011(i + -113);
			if (i != -1) {
				anInt2765 = 71;
			}
			Class230.method2870((byte) -74);
			PlayerUpdate.method2855(-19004);
			Class96.method928((byte) -42);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uc.A(" + i + ')');
		}
	}

	final void method3709(final Class329 class329_2_, final int i) {
		try {
			anInt2770 = class329_2_.anInt2770;
			anInt2768 = class329_2_.anInt2768;
			anInt2769 = class329_2_.anInt2769;
			anInt2763 = class329_2_.anInt2763;
			anInt2762 = class329_2_.anInt2762;
			anInt2772 = class329_2_.anInt2772;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("uc.C("
							+ (class329_2_ != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	final Class329 method3710(final int i) {
		try {
			if (i != 28889) {
				anInt2762 = -34;
			}
			return new Class329(anInt2770, anInt2763, anInt2768, anInt2762,
					anInt2772, anInt2769);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uc.B(" + i + ')');
		}
	}

	static final int method3711(final byte i, final int i_4_) {
		try {
			if (i <= 113) {
				method3708(51);
			}
			return i_4_ >>> 367185160;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uc.E(" + i + ','
					+ i_4_ + ')');
		}
	}

	public static void method3712(final byte i) {
		do {
			try {
				anIntArray2771 = null;
				if (i == 21) {
					break;
				}
				method3712((byte) 51);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "uc.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method3713(final byte i, final String string) {
		try {
			final Class98_Sub11 class98_sub11 = Class98_Sub46_Sub9
					.method1556(false);
			class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
					Class298.aClass222_2490.anInt1668, -110);
			class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(0, 1571862888);
			final int i_5_ = (((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position);
			class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(637, 1571862888);
			final int[] is = Class42_Sub2.method389(12206, class98_sub11);
			final int i_6_ = (((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position);
			class98_sub11.aClass98_Sub22_Sub1_3865.method1188(string,
					(byte) 113);
			class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
					Class374.anInt3159, 84);
			((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position += 7;
			class98_sub11.aClass98_Sub22_Sub1_3865
					.method1235(
							true,
							is,
							i_6_,
							((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position);
			class98_sub11.aClass98_Sub22_Sub1_3865
					.method1207(
							(byte) 90,
							(((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position)
									- i_5_);
			Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
			Class98_Sub26.anInt4028 = 0;
			Class55.anInt442 = -3;
			Class21_Sub4.anInt5394 = 1;
			Class372.anInt3150 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uc.F(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	Class329(final int i) {
		anInt2763 = 128;
		try {
			anInt2770 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "uc.<init>(" + i
					+ ')');
		}
	}

	private Class329(final int i, final int i_8_, final int i_9_,
			final int i_10_, final int i_11_, final int i_12_) {
		anInt2763 = 128;
		try {
			anInt2768 = i_9_;
			anInt2770 = i;
			anInt2769 = i_12_;
			anInt2762 = i_10_;
			anInt2763 = i_8_;
			anInt2772 = i_11_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("uc.<init>(" + i
					+ ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ','
					+ i_12_ + ')'));
		}
	}
}
