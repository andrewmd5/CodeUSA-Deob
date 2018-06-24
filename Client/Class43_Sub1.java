import jaggl.OpenGL;

/* Class43_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class43_Sub1 extends Class43 {
	private Class42_Sub1_Sub1 aClass42_Sub1_Sub1_3601;
	private final Class91 aClass91_3602;
	private boolean aBoolean3603;
	private final ha_Sub1 aHa_Sub1_3604;

	Class43_Sub1(final ha_Sub1 var_ha_Sub1, final Class197 class197,
			final Class324[] class324s, final boolean bool) {
		super(var_ha_Sub1, class197);
		aHa_Sub1_3604 = var_ha_Sub1;
		int i = 0;
		for (int i_0_ = 0; i_0_ < 256; i_0_++) {
			final Class324 class324 = class324s[i_0_];
			if (class324.anInt2720 > i) {
				i = class324.anInt2720;
			}
			if (class324.anInt2722 > i) {
				i = class324.anInt2722;
			}
		}
		final int i_1_ = i * 16;
		if (bool) {
			final byte[] is = new byte[i_1_ * i_1_];
			for (int i_2_ = 0; i_2_ < 256; i_2_++) {
				final Class324 class324 = class324s[i_2_];
				final int i_3_ = class324.anInt2720;
				final int i_4_ = class324.anInt2722;
				final int i_5_ = i_2_ % 16 * i;
				final int i_6_ = i_2_ / 16 * i;
				int i_7_ = i_6_ * i_1_ + i_5_;
				int i_8_ = 0;
				if (class324.aByteArray2723 == null) {
					final byte[] is_9_ = class324.aByteArray2717;
					for (int i_10_ = 0; i_10_ < i_3_; i_10_++) {
						for (int i_11_ = 0; i_11_ < i_4_; i_11_++) {
							is[i_7_++] = (byte) (is_9_[i_8_++] == 0 ? 0 : -1);
						}
						i_7_ += i_1_ - i_4_;
					}
				} else {
					final byte[] is_12_ = class324.aByteArray2723;
					for (int i_13_ = 0; i_13_ < i_3_; i_13_++) {
						for (int i_14_ = 0; i_14_ < i_4_; i_14_++) {
							is[i_7_++] = is_12_[i_8_++];
						}
						i_7_ += i_1_ - i_4_;
					}
				}
			}
			aClass42_Sub1_Sub1_3601 = Class284_Sub2.method3374(6406, i_1_,
					14764, 6406, var_ha_Sub1, false, is, i_1_);
			aBoolean3603 = true;
		} else {
			final int[] is = new int[i_1_ * i_1_];
			for (int i_15_ = 0; i_15_ < 256; i_15_++) {
				final Class324 class324 = class324s[i_15_];
				final int[] is_16_ = class324.anIntArray2718;
				final byte[] is_17_ = class324.aByteArray2723;
				final byte[] is_18_ = class324.aByteArray2717;
				final int i_19_ = class324.anInt2720;
				final int i_20_ = class324.anInt2722;
				final int i_21_ = i_15_ % 16 * i;
				final int i_22_ = i_15_ / 16 * i;
				int i_23_ = i_22_ * i_1_ + i_21_;
				int i_24_ = 0;
				if (is_17_ != null) {
					for (int i_25_ = 0; i_25_ < i_19_; i_25_++) {
						for (int i_26_ = 0; i_26_ < i_20_; i_26_++) {
							is[i_23_++] = (is_17_[i_24_] << 24 | is_16_[is_18_[i_24_] & 0xff]);
							i_24_++;
						}
						i_23_ += i_1_ - i_20_;
					}
				} else {
					for (int i_27_ = 0; i_27_ < i_19_; i_27_++) {
						for (int i_28_ = 0; i_28_ < i_20_; i_28_++) {
							int i_29_;
							if ((i_29_ = is_18_[i_24_++]) != 0) {
								is[i_23_++] = ~0xffffff | is_16_[i_29_ & 0xff];
							} else {
								i_23_++;
							}
						}
						i_23_ += i_1_ - i_20_;
					}
				}
			}
			aClass42_Sub1_Sub1_3601 = Class246_Sub9.method3136(var_ha_Sub1,
					false, is, i_1_, (byte) 120, 0, 0, i_1_);
			aBoolean3603 = false;
		}
		aClass42_Sub1_Sub1_3601.method372(-28003, false);
		aClass91_3602 = new Class91(var_ha_Sub1, 256);
		final float f = (aClass42_Sub1_Sub1_3601.aFloat6205 / (aClass42_Sub1_Sub1_3601.anInt6207));
		final float f_30_ = (aClass42_Sub1_Sub1_3601.aFloat6209 / (aClass42_Sub1_Sub1_3601.anInt6204));
		for (int i_31_ = 0; i_31_ < 256; i_31_++) {
			final Class324 class324 = class324s[i_31_];
			final int i_32_ = class324.anInt2720;
			final int i_33_ = class324.anInt2722;
			final int i_34_ = class324.anInt2721;
			final int i_35_ = class324.anInt2725;
			final float f_36_ = i_31_ % 16 * i;
			final float f_37_ = i_31_ / 16 * i;
			final float f_38_ = f_36_ * f;
			final float f_39_ = f_37_ * f_30_;
			final float f_40_ = (f_36_ + i_33_) * f;
			final float f_41_ = (f_37_ + i_32_) * f_30_;
			aClass91_3602.method887(i_31_, -30389);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(f_38_, (aClass42_Sub1_Sub1_3601.aFloat6209)
					- f_39_);
			OpenGL.glVertex2i(i_35_, i_34_);
			OpenGL.glTexCoord2f(f_38_, (aClass42_Sub1_Sub1_3601.aFloat6209)
					- f_41_);
			OpenGL.glVertex2i(i_35_, i_34_ + i_32_);
			OpenGL.glTexCoord2f(f_40_, (aClass42_Sub1_Sub1_3601.aFloat6209)
					- f_41_);
			OpenGL.glVertex2i(i_35_ + i_33_, i_34_ + i_32_);
			OpenGL.glTexCoord2f(f_40_, (aClass42_Sub1_Sub1_3601.aFloat6209)
					- f_39_);
			OpenGL.glVertex2i(i_35_ + i_33_, i_34_);
			OpenGL.glEnd();
			aClass91_3602.method886((byte) -44);
		}
	}

	@Override
	final void method409(final char c, final int i, final int i_42_,
			final int i_43_, final boolean bool, final aa var_aa,
			final int i_44_, final int i_45_) {
		final aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
		final Class42_Sub1_Sub1 class42_sub1_sub1 = var_aa_Sub3.aClass42_Sub1_Sub1_3568;
		aHa_Sub1_3604.method1889(false);
		aHa_Sub1_3604.method1863(1, aClass42_Sub1_Sub1_3601);
		if (aBoolean3603 || bool) {
			aHa_Sub1_3604.method1899(8448, 8960, 7681);
			aHa_Sub1_3604.method1840(0, 768, 104, 34168);
		} else {
			aHa_Sub1_3604.method1899(7681, 8960, 7681);
		}
		aHa_Sub1_3604.method1845(1, 847872872);
		aHa_Sub1_3604.method1863(1, class42_sub1_sub1);
		aHa_Sub1_3604.method1899(8448, 8960, 7681);
		aHa_Sub1_3604.method1840(0, 768, 110, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		final float f = (class42_sub1_sub1.aFloat6205 / class42_sub1_sub1.anInt6207);
		final float f_46_ = (class42_sub1_sub1.aFloat6209 / class42_sub1_sub1.anInt6204);
		OpenGL.glTexGenfv(8192, 9474,
				new float[] { f, 0.0F, 0.0F, -i_44_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_46_, 0.0F,
				-i_45_ * f_46_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_43_ >> 16), (byte) (i_43_ >> 8),
				(byte) i_43_, (byte) (i_43_ >> 24));
		OpenGL.glTranslatef(i, i_42_, 0.0F);
		aClass91_3602.method888(c, false);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aHa_Sub1_3604.method1840(0, 768, -91, 5890);
		aHa_Sub1_3604.method1899(8448, 8960, 8448);
		aHa_Sub1_3604.method1863(1, null);
		aHa_Sub1_3604.method1845(0, 847872872);
		if (aBoolean3603 || bool) {
			aHa_Sub1_3604.method1840(0, 768, -102, 5890);
		}
	}

	@Override
	final void fa(final char c, final int i, final int i_47_, final int i_48_,
			final boolean bool) {
		aHa_Sub1_3604.method1889(false);
		aHa_Sub1_3604.method1863(1, aClass42_Sub1_Sub1_3601);
		if (aBoolean3603 || bool) {
			aHa_Sub1_3604.method1899(8448, 8960, 7681);
			aHa_Sub1_3604.method1840(0, 768, 83, 34168);
		} else {
			aHa_Sub1_3604.method1899(7681, 8960, 7681);
		}
		OpenGL.glColor4ub((byte) (i_48_ >> 16), (byte) (i_48_ >> 8),
				(byte) i_48_, (byte) (i_48_ >> 24));
		OpenGL.glTranslatef(i, i_47_, 0.0F);
		aClass91_3602.method888(c, false);
		OpenGL.glLoadIdentity();
		if (aBoolean3603 || bool) {
			aHa_Sub1_3604.method1840(0, 768, 93, 5890);
		}
	}
}
