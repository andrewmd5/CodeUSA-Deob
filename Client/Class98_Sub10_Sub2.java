/* Class98_Sub10_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub2 extends Class98_Sub10 {
	private int anInt5545 = 32768;

	@Override
	final int[][] method997(final int i, final int i_0_) {
		try {
			if (i > -76) {
				anInt5545 = -101;
			}
			final int[][] is = ((Class98_Sub10) this).aClass223_3859
					.method2828(i_0_, 0);
			if (((Class98_Sub10) this).aClass223_3859.aBoolean1683) {
				final int[] is_1_ = method1000(i_0_, 1, 0);
				final int[] is_2_ = method1000(i_0_, 2, 0);
				final int[] is_3_ = is[0];
				final int[] is_4_ = is[1];
				final int[] is_5_ = is[2];
				for (int i_6_ = 0; (Class25.anInt268 ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
					final int i_7_ = 255 * is_1_[i_6_] >> 328402860 & 0xff;
					final int i_8_ = is_2_[i_6_] * anInt5545 >> 299114828;
					final int i_9_ = (Class278_Sub1.anIntArray5168[i_7_] * i_8_ >> -1083056916);
					final int i_10_ = aa_Sub2.anIntArray3565[i_7_] * i_8_ >> -1641503572;
					final int i_11_ = Class329.anInt2761 & (i_9_ >> 1756603788)
							+ i_6_;
					final int i_12_ = za_Sub1.anInt6075
							& (i_10_ >> -1134552788) + i_0_;
					final int[][] is_13_ = method994(i_12_, 24431, 0);
					is_3_[i_6_] = is_13_[0][i_11_];
					is_4_[i_6_] = is_13_[1][i_11_];
					is_5_[i_6_] = is_13_[2][i_11_];
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aha.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	public Class98_Sub10_Sub2() {
		super(3, false);
	}

	static final String method1007(final String string, final int i) {
		try {
			String string_14_ = Class18.method247(
					Class156_Sub2.method2501((byte) -125, string), -120);
			if (string_14_ == null) {
				string_14_ = "";
			}
			return string_14_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("aha.B("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final void method1001(final byte i) {
		try {
			if (i != 66) {
				method991(122, null, (byte) 17);
			}
			Class98_Sub31_Sub4.method1386(0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aha.I(" + i + ')');
		}
	}

	@Override
	final int[] method990(final int i, final int i_16_) {
		try {
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_16_);
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				final int[] is_17_ = method1000(i_16_, 1, 0);
				final int[] is_18_ = method1000(i_16_, 2, 0);
				for (int i_19_ = 0; (Class25.anInt268 ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++) {
					final int i_20_ = is_17_[i_19_] >> -2049795036 & 0xff;
					final int i_21_ = anInt5545 * is_18_[i_19_] >> 329150252;
					final int i_22_ = (i_21_
							* Class278_Sub1.anIntArray5168[i_20_] >> -862649204);
					final int i_23_ = aa_Sub2.anIntArray3565[i_20_] * i_21_ >> -1243350708;
					final int i_24_ = Class329.anInt2761 & (i_22_ >> 820741420)
							+ i_19_;
					final int i_25_ = za_Sub1.anInt6075 & (i_23_ >> 1296780)
							+ i_16_;
					final int[] is_26_ = method1000(i_25_, 0, 0);
					is[i_19_] = is_26_[i_24_];
				}
			}
			if (i != 255) {
				method1008(16);
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aha.G(" + i + ','
					+ i_16_ + ')');
		}
	}

	static final void method1008(final int i) {
		try {
			if (i < -32) {
				RuntimeException_Sub1.aClass79_3204.method794(77);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aha.F(" + i + ')');
		}
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_27_) {
		try {
			final int i_28_ = i;
			do {
				if ((i_28_ ^ 0xffffffff) != -1) {
					if ((i_28_ ^ 0xffffffff) != -2) {
						break;
					}
				} else {
					anInt5545 = class98_sub22.readUnsignedShort((byte) 127) << 568932100;
					break;
				}
				((Class98_Sub10) this).aBoolean3861 = ((class98_sub22
						.readUnsignedByte((byte) -126) ^ 0xffffffff) == -2);
			} while (false);
			if (i_27_ >= -92) {
				anInt5545 = 33;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("aha.A(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i_27_ + ')'));
		}
	}

	static final void method1009(final int i) {
		do {
			try {
				try {
					if ((Class257.anInt1948 ^ 0xffffffff) == -2) {
						int i_30_ = Class366.aClass98_Sub31_Sub2_3122
								.method1360(-16257);
						if ((i_30_ ^ 0xffffffff) < -1
								&& Class366.aClass98_Sub31_Sub2_3122
										.method1354(-3619)) {
							i_30_ -= Class348.anInt2911;
							if (i_30_ < 0) {
								i_30_ = 0;
							}
							Class366.aClass98_Sub31_Sub2_3122.method1366(i_30_,
									(byte) 48);
							break;
						}
						Class366.aClass98_Sub31_Sub2_3122.method1364(85);
						Class366.aClass98_Sub31_Sub2_3122.method1349(-1);
						Class202.aClass308_1550 = null;
						do {
							if (Class269.aClass207_2025 == null) {
								Class257.anInt1948 = 0;
								if (!client.aBoolean3553) {
									break;
								}
							}
							Class257.anInt1948 = 2;
						} while (false);
						Class81.aClass98_Sub7_620 = null;
					}
					if ((Class257.anInt1948 ^ 0xffffffff) != -4) {
						break;
					}
					int i_31_ = Class366.aClass98_Sub31_Sub2_3122
							.method1360(-16257);
					if ((Class224_Sub3.anInt5037 ^ 0xffffffff) < (i_31_ ^ 0xffffffff)
							&& Class366.aClass98_Sub31_Sub2_3122
									.method1354(-3619)) {
						i_31_ += Class22.anInt219;
						if ((Class224_Sub3.anInt5037 ^ 0xffffffff) > (i_31_ ^ 0xffffffff)) {
							i_31_ = Class224_Sub3.anInt5037;
						}
						Class366.aClass98_Sub31_Sub2_3122.method1366(i_31_,
								(byte) 72);
					} else {
						Class257.anInt1948 = 0;
						Class22.anInt219 = 0;
					}
				} catch (final Exception exception) {
					exception.printStackTrace();
					Class366.aClass98_Sub31_Sub2_3122.method1364(105);
					Class202.aClass308_1550 = null;
					Class269.aClass207_2025 = null;
					Class81.aClass98_Sub7_620 = null;
					Class116.aClass98_Sub31_Sub2_965 = null;
					Class257.anInt1948 = 0;
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "aha.E(" + i
						+ ')');
			}
		} while (false);
	}

	static final Class267 method1010(final int i) {
		try {
			return Class114.method2149(1, -100);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aha.D(" + i + ')');
		}
	}
}
