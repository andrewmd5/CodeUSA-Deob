/* Class43_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class43_Sub2 extends Class43 {
	private boolean aBoolean3605;
	private final Interface2_Impl1 anInterface2_Impl1_3606;
	private Interface4_Impl2 anInterface4_Impl2_3607;
	private final ha_Sub3 aHa_Sub3_3608;

	@Override
	final void method409(final char c, final int i, final int i_0_,
			final int i_1_, final boolean bool, final aa var_aa,
			final int i_2_, final int i_3_) {
		/* empty */
	}

	@Override
	final void fa(final char c, final int i, final int i_4_, final int i_5_,
			final boolean bool) {
		aHa_Sub3_3608.method1949(0);
		aHa_Sub3_3608.method2005(anInterface4_Impl2_3607, -127);
		if (aBoolean3605 || bool) {
			aHa_Sub3_3608.method2019(Class249.aClass128_1903,
					Class288.aClass128_3381, 22831);
			aHa_Sub3_3608.method2051(0, -117, Class64_Sub16.aClass65_3681);
			aHa_Sub3_3608.method1984(2, i_5_);
		} else {
			aHa_Sub3_3608.method2019(Class288.aClass128_3381,
					Class288.aClass128_3381, 22831);
		}
		final Class111_Sub3 class111_sub3 = aHa_Sub3_3608
				.method1978((byte) -26);
		class111_sub3.method2100(i, i_4_, 0);
		aHa_Sub3_3608.method1935(1);
		aHa_Sub3_3608.method1971(0, true, anInterface2_Impl1_3606);
		aHa_Sub3_3608.method2042(aHa_Sub3_3608.aClass256_4664, (byte) 120);
		aHa_Sub3_3608.method2037(Class98_Sub46_Sub15.aClass232_6043,
				c * '\004', (byte) 98, 2);
		if (aBoolean3605 || bool) {
			aHa_Sub3_3608.method2051(0, -104, Class300.aClass65_2499);
		}
	}

	Class43_Sub2(final ha_Sub3 var_ha_Sub3, final Class197 class197,
			final Class324[] class324s, final boolean bool) {
		super(var_ha_Sub3, class197);
		aHa_Sub3_3608 = var_ha_Sub3;
		int i = 0;
		for (int i_6_ = 0; i_6_ < 256; i_6_++) {
			final Class324 class324 = class324s[i_6_];
			if (class324.anInt2720 > i) {
				i = class324.anInt2720;
			}
			if (class324.anInt2722 > i) {
				i = class324.anInt2722;
			}
		}
		final int i_7_ = i * 16;
		if (bool) {
			final byte[] is = new byte[i_7_ * i_7_];
			for (int i_8_ = 0; i_8_ < 256; i_8_++) {
				final Class324 class324 = class324s[i_8_];
				final int i_9_ = class324.anInt2720;
				final int i_10_ = class324.anInt2722;
				final int i_11_ = i_8_ % 16 * i;
				final int i_12_ = i_8_ / 16 * i;
				int i_13_ = i_12_ * i_7_ + i_11_;
				int i_14_ = 0;
				if (class324.aByteArray2723 == null) {
					final byte[] is_15_ = class324.aByteArray2717;
					for (int i_16_ = 0; i_16_ < i_9_; i_16_++) {
						for (int i_17_ = 0; i_17_ < i_10_; i_17_++) {
							is[i_13_++] = (byte) (is_15_[i_14_++] == 0 ? 0 : -1);
						}
						i_13_ += i_7_ - i_10_;
					}
				} else {
					final byte[] is_18_ = class324.aByteArray2723;
					for (int i_19_ = 0; i_19_ < i_9_; i_19_++) {
						for (int i_20_ = 0; i_20_ < i_10_; i_20_++) {
							is[i_13_++] = is_18_[i_14_++];
						}
						i_13_ += i_7_ - i_10_;
					}
				}
			}
			if (!var_ha_Sub3.method1942(0, Class53_Sub1.aClass164_3633,
					Class162.aClass162_1266)) {
				final int[] is_21_ = new int[is.length];
				for (int i_22_ = 0; i_22_ < is.length; i_22_++) {
					is_21_[i_22_] = is[i_22_] << 24;
				}
				anInterface4_Impl2_3607 = var_ha_Sub3.method2012(i_7_, i_7_,
						(byte) 31, is_21_, false);
			} else {
				anInterface4_Impl2_3607 = var_ha_Sub3
						.method2053(i_7_, Class53_Sub1.aClass164_3633,
								(byte) 87, is, false, i_7_);
			}
			aBoolean3605 = true;
		} else {
			final int[] is = new int[i_7_ * i_7_];
			for (int i_23_ = 0; i_23_ < 256; i_23_++) {
				final Class324 class324 = class324s[i_23_];
				final int[] is_24_ = class324.anIntArray2718;
				final byte[] is_25_ = class324.aByteArray2723;
				final byte[] is_26_ = class324.aByteArray2717;
				final int i_27_ = class324.anInt2720;
				final int i_28_ = class324.anInt2722;
				final int i_29_ = i_23_ % 16 * i;
				final int i_30_ = i_23_ / 16 * i;
				int i_31_ = i_30_ * i_7_ + i_29_;
				int i_32_ = 0;
				if (is_25_ != null) {
					for (int i_33_ = 0; i_33_ < i_27_; i_33_++) {
						for (int i_34_ = 0; i_34_ < i_28_; i_34_++) {
							is[i_31_++] = (is_25_[i_32_] << 24 | is_24_[is_26_[i_32_] & 0xff]);
							i_32_++;
						}
						i_31_ += i_7_ - i_28_;
					}
				} else {
					for (int i_35_ = 0; i_35_ < i_27_; i_35_++) {
						for (int i_36_ = 0; i_36_ < i_28_; i_36_++) {
							int i_37_;
							if ((i_37_ = is_26_[i_32_++]) != 0) {
								is[i_31_++] = ~0xffffff | is_24_[i_37_ & 0xff];
							} else {
								i_31_++;
							}
						}
						i_31_ += i_7_ - i_28_;
					}
				}
			}
			anInterface4_Impl2_3607 = var_ha_Sub3.method2012(i_7_, i_7_,
					(byte) 31, is, false);
			aBoolean3605 = false;
		}
		anInterface4_Impl2_3607.method4((byte) -81, Class342.aClass200_2861);
		anInterface2_Impl1_3606 = var_ha_Sub3.method2060(false, 66);
		anInterface2_Impl1_3606.method74(-20279, 20, 20480);
		for (int i_38_ = 0; i_38_ < 4; i_38_++) {
			final Buffer buffer = anInterface2_Impl1_3606.method75(true,
					(byte) 27);
			if (buffer != null) {
				final Stream stream = aHa_Sub3_3608.method2043(24022, buffer);
				final float f = (anInterface4_Impl2_3607.method42((byte) -63,
						i_7_) / i_7_);
				final float f_39_ = (anInterface4_Impl2_3607.method45(-8473,
						i_7_) / i_7_);
				for (int i_40_ = 0; i_40_ < 256; i_40_++) {
					final Class324 class324 = class324s[i_40_];
					final int i_41_ = class324.anInt2720;
					final int i_42_ = class324.anInt2722;
					final int i_43_ = class324.anInt2721;
					final int i_44_ = class324.anInt2725;
					final float f_45_ = i_40_ % 16 * i;
					final float f_46_ = i_40_ / 16 * i;
					final float f_47_ = f_45_ * f;
					final float f_48_ = f_46_ * f_39_;
					final float f_49_ = (f_45_ + i_42_) * f;
					final float f_50_ = (f_46_ + i_41_) * f_39_;
					if (Stream.a()) {
						stream.b((float) i_44_);
						stream.b((float) i_43_);
						stream.b(0.0F);
						stream.b(f_47_);
						stream.b(f_48_);
						stream.b((float) i_44_);
						stream.b((float) (i_43_ + i_41_));
						stream.b(0.0F);
						stream.b(f_47_);
						stream.b(f_50_);
						stream.b((float) (i_44_ + i_42_));
						stream.b((float) (i_43_ + i_41_));
						stream.b(0.0F);
						stream.b(f_49_);
						stream.b(f_50_);
						stream.b((float) (i_44_ + i_42_));
						stream.b((float) i_43_);
						stream.b(0.0F);
						stream.b(f_49_);
						stream.b(f_48_);
					} else {
						stream.a((float) i_44_);
						stream.a((float) i_43_);
						stream.a(0.0F);
						stream.a(f_47_);
						stream.a(f_48_);
						stream.a((float) i_44_);
						stream.a((float) (i_43_ + i_41_));
						stream.a(0.0F);
						stream.a(f_47_);
						stream.a(f_50_);
						stream.a((float) (i_44_ + i_42_));
						stream.a((float) (i_43_ + i_41_));
						stream.a(0.0F);
						stream.a(f_49_);
						stream.a(f_50_);
						stream.a((float) (i_44_ + i_42_));
						stream.a((float) i_43_);
						stream.a(0.0F);
						stream.a(f_49_);
						stream.a(f_48_);
					}
				}
				stream.c();
				if (anInterface2_Impl1_3606.method71(13623)) {
					break;
				}
			}
		}
	}
}
