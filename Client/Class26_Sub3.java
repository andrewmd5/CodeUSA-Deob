/* Class26_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.kg;

final class Class26_Sub3 extends Class26 implements Interface4_Impl2 {
	private IDirect3DTexture anIDirect3DTexture3582;
	private int anInt3583;
	boolean aBoolean3584;
	boolean aBoolean3585;
	private int anInt3586;

	@Override
	public final void method41(int i, final int i_0_, int i_1_, final int i_2_,
			final int i_3_, final int i_4_, final byte[] is,
			final Class164 class164, final int i_5_) {
		do {
			try {
				if (class164 != aClass164_273
						|| (Class162.aClass162_1266 != aClass162_271)) {
					throw new RuntimeException();
				}
				if (i_4_ != -26946) {
					aBoolean3585 = true;
				}
				final PixelBuffer pixelbuffer = (aHa_Sub3_Sub1_270.aPixelBuffer6095);
				final int i_6_ = anIDirect3DTexture3582.LockRect(0, i_5_, i_2_,
						i_1_, i_3_, 0, pixelbuffer);
				if (!kg.a(-21593, i_6_)) {
					break;
				}
				i *= (aClass164_273.anInt1275);
				i_1_ *= (aClass164_273.anInt1275);
				final int i_7_ = pixelbuffer.getRowPitch();
				if (i_7_ == i_1_ && (i ^ 0xffffffff) == (i_1_ ^ 0xffffffff)) {
					pixelbuffer.a(is, i_0_, 0, i_1_ * i_3_);
				} else {
					for (int i_8_ = 0; i_3_ > i_8_; i_8_++) {
						pixelbuffer
								.a(is, i_0_ - -(i_8_ * i), i_8_ * i_7_, i_1_);
					}
				}
				anIDirect3DTexture3582.UnlockRect(0);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	Class26_Sub3(final ha_Sub3_Sub1 var_ha_Sub3_Sub1, final int i,
			final int i_9_, final boolean bool, final int[] is,
			final int i_10_, int i_11_) {
		super(var_ha_Sub3_Sub1, Class62.aClass164_486, Class162.aClass162_1266,
				bool && var_ha_Sub3_Sub1.aBoolean6107, i * i_9_);
		do {
			try {
				if (!aHa_Sub3_Sub1_270.aBoolean6109) {
					anInt3583 = Class48.method453(423660257, i);
					anInt3586 = Class48.method453(423660257, i_9_);
				} else {
					anInt3583 = i;
					anInt3586 = i_9_;
				}
				if (bool) {
					anIDirect3DTexture3582 = aHa_Sub3_Sub1_270.anIDirect3DDevice6098
							.a(anInt3583, anInt3586, 0, 1024, 21, 1);
				} else {
					anIDirect3DTexture3582 = aHa_Sub3_Sub1_270.anIDirect3DDevice6098
							.a(anInt3583, anInt3586, 1, 0, 21, 1);
				}
				final PixelBuffer pixelbuffer = (aHa_Sub3_Sub1_270.aPixelBuffer6095);
				final int i_12_ = anIDirect3DTexture3582.LockRect(0, 0, 0, i,
						i_9_, 0, pixelbuffer);
				if (!kg.a(-21593, i_12_)) {
					break;
				}
				if (0 == i_11_) {
					i_11_ = i;
				}
				final int i_13_ = pixelbuffer.getRowPitch();
				if ((i_13_ ^ 0xffffffff) != (4 * i ^ 0xffffffff)
						|| (i ^ 0xffffffff) != (i_11_ ^ 0xffffffff)) {
					for (int i_14_ = 0; i_14_ < i_9_; i_14_++) {
						pixelbuffer.a(is, i_10_ + i_11_ * i_14_, i_13_ * i_14_,
								i);
					}
				} else {
					pixelbuffer.a(is, i_10_, 0, i_9_ * i);
				}
				anIDirect3DTexture3582.UnlockRect(0);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	public final void method5(final int i) {
		do {
			try {
				aHa_Sub3_Sub1_270.method2079(false, this);
				if (i >= 14) {
					break;
				}
				anIDirect3DTexture3582 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	@Override
	public final float method45(final int i, final float f) {
		float f_15_;
		try {
			if (i != -8473) {
				return 1.9078624F;
			}
			f_15_ = f / anInt3586;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return f_15_;
	}

	Class26_Sub3(final ha_Sub3_Sub1 var_ha_Sub3_Sub1, final Class164 class164,
			final Class162 class162, final int i, final int i_16_) {
		super(var_ha_Sub3_Sub1, class164, class162, false, i_16_ * i);
		try {
			if (!aHa_Sub3_Sub1_270.aBoolean6109) {
				anInt3583 = Class48.method453(423660257, i);
				anInt3586 = Class48.method453(423660257, i_16_);
			} else {
				anInt3586 = i_16_;
				anInt3583 = i;
			}
			anIDirect3DTexture3582 = (aHa_Sub3_Sub1_270.anIDirect3DDevice6098
					.a(i, i_16_, 1, 0, ha_Sub3_Sub1.method2074(-1935,
							(aClass164_273), (aClass162_271)), 1));
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final int method43(final int i) {
		int i_17_;
		try {
			if (i < 109) {
				return 5;
			}
			i_17_ = anInt3586;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_17_;
	}

	@Override
	public final float method42(final byte i, final float f) {
		float f_18_;
		try {
			f_18_ = f / anInt3583;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return f_18_;
	}

	Class26_Sub3(final ha_Sub3_Sub1 var_ha_Sub3_Sub1, final Class164 class164,
			int i, final int i_20_, final boolean bool, final byte[] is,
			final int i_21_, int i_22_) {
		super(var_ha_Sub3_Sub1, class164, Class162.aClass162_1266, bool
				&& var_ha_Sub3_Sub1.aBoolean6107, i * i_20_);
		try {
			if (!aHa_Sub3_Sub1_270.aBoolean6109) {
				anInt3583 = Class48.method453(423660257, i);
				anInt3586 = Class48.method453(423660257, i_20_);
			} else {
				anInt3586 = i_20_;
				anInt3583 = i;
			}
			if (bool) {
				anIDirect3DTexture3582 = (aHa_Sub3_Sub1_270.anIDirect3DDevice6098
						.a(anInt3583, anInt3586, 0, 1024, ha_Sub3_Sub1
								.method2074(-1935, (aClass164_273),
										Class162.aClass162_1266), 1));
			} else {
				anIDirect3DTexture3582 = (aHa_Sub3_Sub1_270.anIDirect3DDevice6098
						.a(anInt3583, anInt3586, 1, 0, ha_Sub3_Sub1
								.method2074(-1935, (aClass164_273),
										Class162.aClass162_1266), 1));
			}
			final PixelBuffer pixelbuffer = (aHa_Sub3_Sub1_270.aPixelBuffer6095);
			final int i_23_ = anIDirect3DTexture3582.LockRect(0, 0, 0, i,
					i_20_, 0, pixelbuffer);
			if (kg.a(-21593, i_23_)) {
				if (-1 == (i_22_ ^ 0xffffffff)) {
					i_22_ = i;
				}
				i *= (aClass164_273.anInt1275);
				i_22_ *= (aClass164_273.anInt1275);
				final int i_24_ = pixelbuffer.getRowPitch();
				if ((i_24_ ^ 0xffffffff) != (i ^ 0xffffffff) || i_22_ != i) {
					for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff); i_25_++) {
						pixelbuffer.a(is, i_21_ - -(i_25_ * i_22_), i_25_
								* i_24_, i);
					}
				} else {
					pixelbuffer.a(is, i_21_, 0, i_20_ * i);
				}
				anIDirect3DTexture3582.UnlockRect(0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final boolean method48(final int i) {
		boolean bool;
		try {
			if (i > -22) {
				aBoolean3584 = false;
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	@Override
	public final int method47(final int i) {
		int i_26_;
		try {
			if (i != 12941) {
				aBoolean3585 = false;
			}
			i_26_ = anInt3583;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_26_;
	}

	@Override
	public final void method4(final byte i, final Class200 class200) {
		try {
			super.method4(i, class200);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final IDirect3DBaseTexture method293(final byte i) {
		IDirect3DTexture idirect3dtexture;
		try {
			if (i != 18) {
				method4((byte) -23, null);
			}
			idirect3dtexture = anIDirect3DTexture3582;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dtexture;
	}

	@Override
	public final void method44(final int i, final int i_27_, final byte i_28_,
			final int i_29_, final int i_30_, final int[] is, final int i_31_) {
		try {
			if (Class62.aClass164_486 != aClass164_273
					|| (aClass162_271 != Class162.aClass162_1266)) {
				throw new RuntimeException();
			}
			final PixelBuffer pixelbuffer = (aHa_Sub3_Sub1_270.aPixelBuffer6095);
			final int i_33_ = anIDirect3DTexture3582.LockRect(0, i_30_, i_31_,
					i, i_29_, 16, pixelbuffer);
			if (kg.a(-21593, i_33_)) {
				final int i_34_ = pixelbuffer.getRowPitch();
				if ((i_34_ ^ 0xffffffff) == (i * 4 ^ 0xffffffff)) {
					pixelbuffer.b(is, i_27_, 0, is.length);
				} else {
					for (int i_35_ = 0; i_35_ < i_29_; i_35_++) {
						pixelbuffer.b(is, i_27_ + i_35_ * i, i_34_ * i_35_, i);
					}
				}
				anIDirect3DTexture3582.UnlockRect(0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final void method46(final boolean bool, final boolean bool_36_,
			final int i) {
		try {
			aBoolean3584 = bool;
			aBoolean3585 = bool_36_;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final void method49(final int i, final int i_38_, final int i_39_,
			final int[] is, final int i_40_, final int i_41_, final int i_42_,
			final int i_43_) {
		do {
			try {
				if ((Class62.aClass164_486 != aClass164_273)
						|| (Class162.aClass162_1266 != aClass162_271)) {
					throw new RuntimeException();
				}
				if (i == 17779) {
					final PixelBuffer pixelbuffer = (aHa_Sub3_Sub1_270.aPixelBuffer6095);
					final int i_44_ = anIDirect3DTexture3582.LockRect(0, i_40_,
							i_38_, i_43_, i_39_, 0, pixelbuffer);
					if (!kg.a(-21593, i_44_)) {
						break;
					}
					final int i_45_ = pixelbuffer.getRowPitch();
					if ((i_45_ ^ 0xffffffff) != (i_43_ * 4 ^ 0xffffffff)
							|| (i_43_ ^ 0xffffffff) != (i_42_ ^ 0xffffffff)) {
						for (int i_46_ = 0; (i_39_ ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++) {
							pixelbuffer.a(is, i_46_ * i_42_ + i_41_, i_46_
									* i_45_, i_43_);
						}
					} else {
						pixelbuffer.a(is, i_41_, 0, i_39_ * i_43_);
					}
					anIDirect3DTexture3582.UnlockRect(0);
				}
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}
}
