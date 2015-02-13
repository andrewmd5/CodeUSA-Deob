/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class249 {
	static long aLong1898;
	int anInt1899;
	int anInt1900;
	short aShort1901;
	short aShort1902;
	static Class128 aClass128_1903 = new Class128();
	boolean aBoolean1904;
	int anInt1905;
	byte aByte1906;
	int anInt1907;
	short aShort1908;
	int anInt1909;

	static final String method3160(final String string, final int i) {
		try {
			final int i_0_ = string.length();
			int i_1_ = 0;
			for (int i_2_ = 0; i_0_ > i_2_; i_2_++) {
				final int i_3_ = string.charAt(i_2_);
				if (i_3_ == 60 || (i_3_ ^ 0xffffffff) == -63) {
					i_1_ += 3;
				}
			}
			final StringBuffer stringbuffer = new StringBuffer(i_1_ + i_0_);
			for (int i_4_ = 0; i_0_ > i_4_; i_4_++) {
				final char c = string.charAt(i_4_);
				if ((c ^ 0xffffffff) != -61) {
					if (c != 62) {
						stringbuffer.append(c);
					} else {
						stringbuffer.append("<gt>");
					}
				} else {
					stringbuffer.append("<lt>");
				}
			}
			if (i != 62) {
				method3162();
			}
			return stringbuffer.toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pk.C("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final int method3161(final int i, final int i_5_,
			final boolean bool, final int i_6_) {
		try {
			final Class98_Sub3 class98_sub3 = Class64_Sub28.method669(i, bool,
					6);
			if (class98_sub3 == null) {
				return 0;
			}
			if ((i_6_ ^ 0xffffffff) == 0) {
				return 0;
			}
			int i_7_ = 0;
			for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (class98_sub3.anIntArray3823.length ^ 0xffffffff)); i_9_++) {
				if ((i_6_ ^ 0xffffffff) == (class98_sub3.anIntArray3824[i_9_] ^ 0xffffffff)) {
					i_7_ += class98_sub3.anIntArray3823[i_9_];
				}
			}
			return i_7_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pk.D(" + i + ','
					+ i_5_ + ',' + bool + ',' + i_6_ + ')'));
		}
	}

	static final void method3162() {
		for (int i = 0; i < Class98_Sub46_Sub5.aClass174Array5970.length; i++) {
			Class98_Sub46_Sub5.aClass174Array5970[i].method2565();
		}
		Class98_Sub46_Sub5.aClass174Array5970 = null;
	}

	public static void method3163(final byte i) {
		try {
			if (i <= 34) {
				method3161(-115, -43, false, -122);
			}
			aClass128_1903 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pk.E(" + i + ')');
		}
	}

	static final void method3164(final int i, final int i_10_, final ha var_ha,
			final int i_11_, final int i_12_, final int i_13_, final int i_14_) {
		do {
			try {
				if (i_13_ != -22275) {
					aClass128_1903 = null;
				}
				if ((Class98_Sub47.aClass332_4273 == null
						|| Class98_Sub10_Sub28.aClass332_5704 == null || Class45.aClass332_383 == null)
						&& Class332_Sub2.aClass207_5423.method2742(-69,
								Class25.anInt267)
						&& Class332_Sub2.aClass207_5423.method2742(
								i_13_ + 22240, Class95.anInt799)
						&& Class332_Sub2.aClass207_5423.method2742(-39,
								Class146.anInt1183)) {
					final Class324 class324 = Class324.method3685(
							Class332_Sub2.aClass207_5423, Class95.anInt799, 0);
					Class98_Sub10_Sub28.aClass332_5704 = var_ha.method1758(
							class324, true);
					class324.method3691();
					Class221.aClass332_1666 = var_ha.method1758(class324, true);
					Class98_Sub47.aClass332_4273 = (var_ha.method1758(Class324
							.method3685(Class332_Sub2.aClass207_5423,
									Class25.anInt267, 0), true));
					final Class324 class324_15_ = Class324
							.method3685(Class332_Sub2.aClass207_5423,
									Class146.anInt1183, 0);
					Class45.aClass332_383 = var_ha.method1758(class324_15_,
							true);
					class324_15_.method3691();
					Class98_Sub50.aClass332_4287 = var_ha.method1758(
							class324_15_, true);
				}
				if (Class98_Sub47.aClass332_4273 == null
						|| Class98_Sub10_Sub28.aClass332_5704 == null
						|| Class45.aClass332_383 == null) {
					break;
				}
				final int i_16_ = ((i + -(2 * Class45.aClass332_383
						.method3734())) / Class98_Sub47.aClass332_4273
						.method3734());
				for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
					Class98_Sub47.aClass332_4273
							.method3735(
									(i_12_ + Class45.aClass332_383.method3734() + Class98_Sub47.aClass332_4273
											.method3734() * i_17_),
									(-Class98_Sub47.aClass332_4273.method3731() + (i_11_ + i_14_)));
				}
				final int i_18_ = ((-i_10_ + i_14_ - Class45.aClass332_383
						.method3731()) / Class98_Sub10_Sub28.aClass332_5704
						.method3731());
				for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
					Class98_Sub10_Sub28.aClass332_5704.method3735(
							i_12_,
							i_10_
									+ i_11_
									+ Class98_Sub10_Sub28.aClass332_5704
											.method3731() * i_19_);
					Class221.aClass332_1666
							.method3735(
									-Class221.aClass332_1666.method3734()
											+ (i + i_12_),
									i_19_
											* Class98_Sub10_Sub28.aClass332_5704
													.method3731() + i_10_
											+ i_11_);
				}
				Class45.aClass332_383
						.method3735(
								i_12_,
								(-Class45.aClass332_383.method3731() + (i_11_ - -i_14_)));
				Class98_Sub50.aClass332_4287.method3735(i + i_12_
						- Class45.aClass332_383.method3734(), i_11_
						- (-i_14_ + Class45.aClass332_383.method3731()));
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("pk.B(" + i
						+ ',' + i_10_ + ','
						+ (var_ha != null ? "{...}" : "null") + ',' + i_11_
						+ ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'));
			}
			break;
		} while (false);
	}

	Class249(final int i, final int i_20_, final int i_21_, final int i_22_,
			final int i_23_, final int i_24_, final int i_25_, final int i_26_,
			final int i_27_, final boolean bool, final boolean bool_28_,
			final int i_29_) {
		try {
			anInt1899 = i_29_;
			anInt1909 = i_20_;
			aBoolean1904 = bool_28_;
			anInt1905 = i;
			anInt1907 = i_22_;
			anInt1900 = i_21_;
			aShort1908 = (short) i_23_;
			aShort1901 = (short) i_24_;
			aShort1902 = (short) i_25_;
			aByte1906 = (byte) i_27_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pk.<init>(" + i
					+ ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_
					+ ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + i_27_
					+ ',' + bool + ',' + bool_28_ + ',' + i_29_ + ')'));
		}
	}
}
