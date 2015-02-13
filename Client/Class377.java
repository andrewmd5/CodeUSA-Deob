/* Class377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class377 {
	static int[] anIntArray3178;
	int anInt3179;
	Class98[] aClass98Array3180;
	private long aLong3181;
	static byte[][] aByteArrayArray3182;
	static int anInt3183;
	private Class98 aClass98_3184;
	private Class98 aClass98_3185;
	private int anInt3186 = 0;

	final Class98 method3990(long l, int i) {
		try {
			aLong3181 = l;
			Class98 class98 = (((Class377) this).aClass98Array3180[(int) (l & (long) (((Class377) this).anInt3179 + i))]);
			for (aClass98_3184 = ((Class98) class98).aClass98_836; aClass98_3184 != class98; aClass98_3184 = ((Class98) aClass98_3184).aClass98_836) {
				if ((l ^ 0xffffffffffffffffL) == (((Class98) aClass98_3184).aLong832 ^ 0xffffffffffffffffL)) {
					Class98 class98_0_ = aClass98_3184;
					aClass98_3184 = ((Class98) aClass98_3184).aClass98_836;
					return class98_0_;
				}
			}
			aClass98_3184 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.J(" + l + ','
					+ i + ')');
		}
	}

	static final int method3991(Class293 class293, int i, int i_1_) {
		try {
			if (i >= -23)
				method3991(null, -63, -59);
			if (!client.method116(class293).method1666((byte) -72, i_1_)
					&& ((Class293) class293).anObjectArray2329 == null)
				return -1;
			if (((Class293) class293).anIntArray2326 != null
					&& ((((Class293) class293).anIntArray2326.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff)))
				return ((Class293) class293).anIntArray2326[i_1_];
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wr.K("
					+ (class293 != null ? "{...}" : "null") + ',' + i + ','
					+ i_1_ + ')'));
		}
	}

	final int method3992(Class98[] class98s, byte i) {
		try {
			int i_2_ = 0;
			for (int i_3_ = 0; ((Class377) this).anInt3179 > i_3_; i_3_++) {
				Class98 class98 = ((Class377) this).aClass98Array3180[i_3_];
				for (Class98 class98_4_ = ((Class98) class98).aClass98_836; class98 != class98_4_; class98_4_ = ((Class98) class98_4_).aClass98_836)
					class98s[i_2_++] = class98_4_;
			}
			if (i != 74)
				method4000((byte) 120);
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wr.B("
					+ (class98s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class98 method3993(int i) {
		try {
			if (aClass98_3184 == null)
				return null;
			for (Class98 class98 = (((Class377) this).aClass98Array3180[(int) ((long) (-1 + ((Class377) this).anInt3179) & aLong3181)]); aClass98_3184 != class98; aClass98_3184 = ((Class98) aClass98_3184).aClass98_836) {
				if ((aLong3181 ^ 0xffffffffffffffffL) == (((Class98) aClass98_3184).aLong832 ^ 0xffffffffffffffffL)) {
					Class98 class98_5_ = aClass98_3184;
					aClass98_3184 = ((Class98) aClass98_3184).aClass98_836;
					return class98_5_;
				}
			}
			aClass98_3184 = null;
			int i_6_ = -38 / ((70 - i) / 48);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.D(" + i + ')');
		}
	}

	final void method3994(int i) {
		try {
			for (int i_7_ = 0; ((((Class377) this).anInt3179 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
				Class98 class98 = ((Class377) this).aClass98Array3180[i_7_];
				for (;;) {
					Class98 class98_8_ = ((Class98) class98).aClass98_836;
					if (class98_8_ == class98)
						break;
					class98_8_.method942(79);
				}
			}
			if (i < -59) {
				aClass98_3184 = null;
				aClass98_3185 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.H(" + i + ')');
		}
	}

	final Class98 method3995(int i) {
		try {
			if ((anInt3186 ^ 0xffffffff) < i
					&& (((Class377) this).aClass98Array3180[anInt3186 - 1] != aClass98_3185)) {
				Class98 class98 = aClass98_3185;
				aClass98_3185 = ((Class98) class98).aClass98_836;
				return class98;
			}
			while ((anInt3186 ^ 0xffffffff) > (((Class377) this).anInt3179 ^ 0xffffffff)) {
				Class98 class98 = (((Class98) ((Class377) this).aClass98Array3180[anInt3186++]).aClass98_836);
				if (class98 != ((Class377) this).aClass98Array3180[anInt3186
						+ -1]) {
					aClass98_3185 = ((Class98) class98).aClass98_836;
					return class98;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.F(" + i + ')');
		}
	}

	final void method3996(Class98 class98, long l, int i) {
		try {
			if (((Class98) class98).aClass98_833 != null)
				class98.method942(58);
			Class98 class98_9_ = (((Class377) this).aClass98Array3180[(int) (l & (long) (i + ((Class377) this).anInt3179))]);
			((Class98) class98).aClass98_836 = class98_9_;
			((Class98) class98).aClass98_833 = ((Class98) class98_9_).aClass98_833;
			((Class98) ((Class98) class98).aClass98_833).aClass98_836 = class98;
			((Class98) class98).aLong832 = l;
			((Class98) ((Class98) class98).aClass98_836).aClass98_833 = class98;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("wr.G(" + (class98 != null ? "{...}" : "null") + ',' + l
							+ ',' + i + ')'));
		}
	}

	Class377(int i) {
		try {
			((Class377) this).anInt3179 = i;
			((Class377) this).aClass98Array3180 = new Class98[i];
			for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i ^ 0xffffffff); i_10_++) {
				Class98 class98 = (((Class377) this).aClass98Array3180[i_10_] = new Class98());
				((Class98) class98).aClass98_833 = class98;
				((Class98) class98).aClass98_836 = class98;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.<init>(" + i
					+ ')');
		}
	}

	final int method3997(byte i) {
		try {
			if (i <= 40)
				aByteArrayArray3182 = null;
			return ((Class377) this).anInt3179;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.I(" + i + ')');
		}
	}

	final Class98 method3998(int i) {
		try {
			if (i <= 93)
				method3992(null, (byte) 45);
			anInt3186 = 0;
			return method3995(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.C(" + i + ')');
		}
	}

	final int method3999(byte i) {
		try {
			int i_11_ = 0;
			for (int i_12_ = 0; ((((Class377) this).anInt3179 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
				Class98 class98 = ((Class377) this).aClass98Array3180[i_12_];
				for (Class98 class98_13_ = ((Class98) class98).aClass98_836; class98 != class98_13_; class98_13_ = ((Class98) class98_13_).aClass98_836)
					i_11_++;
			}
			if (i != -6)
				anIntArray3178 = null;
			return i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.A(" + i + ')');
		}
	}

	public static void method4000(byte i) {
		try {
			aByteArrayArray3182 = null;
			if (i > -62)
				anInt3183 = -27;
			anIntArray3178 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wr.E(" + i + ')');
		}
	}
}
