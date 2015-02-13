/* Class320 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class320 {
	static IncomingOpcode aClass58_2708 = new IncomingOpcode(23, 0);

	static final void method3663(final Class98_Sub46_Sub9 class98_sub46_sub9,
			int i, final int i_0_, final int i_1_, final int i_2_,
			final int i_3_, final ha var_ha, final int i_4_, final int i_5_,
			final int i_6_, final int i_7_, final int i_8_) {
		try {
			if ((i_3_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff) && i_0_ < i_3_ + i_7_
					&& i_2_ > i_4_ - 13 && i_2_ < 3 + i_4_) {
				i = i_5_;
			}
			final String string = Class21.method262(class98_sub46_sub9,
					(byte) 36);
			Class98_Sub10_Sub34.aClass43_5730.method413(i_4_,
					Class64_Sub5.anIntArray3652, i_6_, string, i, 3 + i_3_,
					(byte) 18, Class217.aClass332Array3408);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tn.B("
					+ (class98_sub46_sub9 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_4_ + ','
					+ i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	public static void method3664(final int i) {
		do {
			try {
				aClass58_2708 = null;
				if (i == 5989) {
					break;
				}
				aClass58_2708 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "tn.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method3665(final byte i, final String string,
			final int i_9_, final boolean bool) {
		try {
			Class61.method540((byte) -51);
			if (i_9_ == 0) {
				Class265.aHa1974 = Class76_Sub11.method771(
						(Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub23_4055
								.method648((byte) 120) * 2,
						Class42_Sub3.aCanvas5361, i ^ 0x27,
						Class284_Sub2_Sub2.aD6203, 0, Class212.aClass207_1603);
				if (string != null) {
					Class265.aHa1974.GA(0);
					final Class197 class197 = Class109.method1733((byte) 120,
							0, Class269.anInt2026, Class36.aClass207_348);
					final Class43 class43 = (Class265.aHa1974.method1804(
							class197, Class324.method3680(
									Class332_Sub2.aClass207_5423,
									Class269.anInt2026, 0), true));
					Class263.method3216(14059);
					Class246_Sub2.method2972(-127, class197, class43, true,
							Class265.aHa1974, string);
				}
			} else {
				ha var_ha = null;
				if (string != null) {
					var_ha = Class76_Sub11.method771(0,
							Class42_Sub3.aCanvas5361, i + -21,
							Class284_Sub2_Sub2.aD6203, 0,
							Class212.aClass207_1603);
					var_ha.GA(0);
					final Class197 class197 = Class109.method1733((byte) 115,
							0, Class269.anInt2026, Class36.aClass207_348);
					final Class43 class43 = (var_ha.method1804(class197,
							Class324.method3680(Class332_Sub2.aClass207_5423,
									Class269.anInt2026, 0), true));
					Class263.method3216(14059);
					Class246_Sub2.method2972(-99, class197, class43, true,
							var_ha, string);
				}
				try {
					Class265.aHa1974 = (Class76_Sub11
							.method771(
									Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub23_4055
											.method648((byte) 127) * 2,
									Class42_Sub3.aCanvas5361, 79,
									Class284_Sub2_Sub2.aD6203, i_9_,
									Class212.aClass207_1603));
					if (string != null) {
						var_ha.GA(0);
						final Class197 class197 = Class109.method1733(
								(byte) 124, 0, Class269.anInt2026,
								Class36.aClass207_348);
						final Class43 class43 = var_ha.method1804(class197,
								(Class324.method3680(
										Class332_Sub2.aClass207_5423,
										Class269.anInt2026, 0)), true);
						Class263.method3216(14059);
						Class246_Sub2.method2972(-127, class197, class43, true,
								var_ha, string);
					}
					if (Class265.aHa1974.method1824()) {
						boolean bool_10_ = true;
						try {
							bool_10_ = (Exception_Sub1.aClass98_Sub35_47.anInt4129) > 256;
						} catch (final Throwable throwable) {
							/* empty */
						}
						za var_za;
						if (!bool_10_) {
							var_za = Class265.aHa1974.method1762(104857600);
						} else {
							var_za = Class265.aHa1974.method1762(146800640);
						}
						Class265.aHa1974.a(var_za);
					}
				} catch (final Throwable throwable) {
					final int i_11_ = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
							.method583((byte) 120);
					if ((i_11_ ^ 0xffffffff) == -3) {
						Class223.aBoolean1679 = true;
					}
					Class98_Sub9.aClass98_Sub27_3856
							.method1285(
									(byte) -13,
									0,
									(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042));
					method3665((byte) 69, string, i_11_, bool);
					return;
				} finally {
					if (var_ha != null) {
						try {
							var_ha.method1743(-1);
						} catch (final Throwable throwable) {
							/* empty */
						}
					}
				}
			}
			Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042.method582(
					!bool, false);
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_9_,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042));
			Class39.method353((byte) -79);
			Class265.aHa1974.method1798(10000);
			Class265.aHa1974.X(32);
			Class266.aClass111_1986 = Class265.aHa1974.method1821();
			Class76_Sub5.aClass111_3745 = Class265.aHa1974.method1821();
			Class98_Sub10_Sub34.method1104(110);
			if (i != 69) {
				method3664(-5);
			}
			Class265.aHa1974
					.method1749((Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub9_4067
							.method588((byte) 122) ^ 0xffffffff) == -2);
			if (Class265.aHa1974.method1767()) {
				Class98_Sub5_Sub1.method966(29089,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub5_4065
								.method570((byte) 122) ^ 0xffffffff) == -2);
			}
			Class159.method2508(Class165.anInt1276 >> 1270556451,
					Class98_Sub10_Sub7.anInt5572 >> 1930762467, (byte) -50,
					Class265.aHa1974);
			Class374.method3980((byte) 125);
			Class33.aBoolean316 = true;
			PlayerUpdateMask.aClass259Array527 = null;
			s_Sub1.aBoolean5207 = false;
			Class230.method2871(i + -134);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tn.C(" + i + ','
					+ (string != null ? "{...}" : "null") + ',' + i_9_ + ','
					+ bool + ')'));
		}
	}
}
