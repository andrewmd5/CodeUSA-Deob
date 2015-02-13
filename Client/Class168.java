/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class168 {
	static Class377 aClass377_1287 = new Class377(512);
	short[] aShortArray1288;
	byte[] aByteArray1289;
	static Class253 aClass253_1290;
	short[] aShortArray1291;
	short[] aShortArray1292;

	public static void method2532(final byte i) {
		try {
			if (i == -6) {
				aClass253_1290 = null;
				aClass377_1287 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "le.A(" + i + ')');
		}
	}

	static final void method2533(final int i, final int i_0_, final int i_1_,
			final int i_2_, final byte i_3_, final int i_4_, final int i_5_,
			final int i_6_, final int i_7_, final int i_8_) {
		try {
			if (i_3_ > 79) {
				if ((i_0_ ^ 0xffffffff) > -513
						|| i_4_ < 512
						|| ((Class165.anInt1276 * 512 + -1024 ^ 0xffffffff) > (i_0_ ^ 0xffffffff))
						|| (Class98_Sub10_Sub7.anInt5572 * 512 + -1024 ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
					Class259.anIntArray1957[0] = Class259.anIntArray1957[1] = -1;
				} else {
					final int i_9_ = (Class98_Sub46_Sub2_Sub2.method1538(i_6_,
							i_4_, i_0_, 24111) + -i_8_);
					if (za_Sub2.aBoolean6079) {
						Class98_Sub46_Sub14.method1604(true, (byte) 88);
					} else {
						Class266.aClass111_1986.method2106(i_2_, 0, 0);
						Class265.aHa1974.a(Class266.aClass111_1986);
					}
					if (Class239.aBoolean1839) {
						Class265.aHa1974.HA(i_0_, i_9_, i_4_, Class16.anInt197,
								Class259.anIntArray1957);
					} else {
						Class265.aHa1974.da(i_0_, i_9_, i_4_,
								Class259.anIntArray1957);
					}
					if (za_Sub2.aBoolean6079) {
						Class207.method2765((byte) 38);
					} else {
						Class266.aClass111_1986.method2106(-i_2_, 0, 0);
						Class265.aHa1974.a(Class266.aClass111_1986);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("le.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final boolean method2534(final byte i) {
		try {
			if (i > -126) {
				aClass253_1290 = null;
			}
			if (Class257.anInt1948 == 0) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "le.B(" + i + ')');
		}
	}
}
