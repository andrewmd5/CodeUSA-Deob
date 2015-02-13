/* Class26_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.kg;

final class Class26_Sub2 extends Class26 implements Interface4_Impl1 {
	private IDirect3DVolumeTexture anIDirect3DVolumeTexture3578;
	private int anInt3579;
	private int anInt3580;
	private int anInt3581;

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
		IDirect3DVolumeTexture idirect3dvolumetexture;
		try {
			if (i != 18) {
				anInt3580 = 43;
			}
			idirect3dvolumetexture = anIDirect3DVolumeTexture3578;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dvolumetexture;
	}

	@Override
	public final void method5(final int i) {
		do {
			try {
				aHa_Sub3_Sub1_270.method2077(false, this);
				if (i > 14) {
					break;
				}
				anIDirect3DVolumeTexture3578 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	Class26_Sub2(final ha_Sub3_Sub1 var_ha_Sub3_Sub1, final Class164 class164,
			final int i, final int i_0_, final int i_1_, final byte[] is) {
		super(var_ha_Sub3_Sub1, class164, Class162.aClass162_1266, false, i_1_
				* (i * i_0_));
		try {
			anInt3580 = i_0_;
			anInt3581 = i_1_;
			anInt3579 = i;
			anIDirect3DVolumeTexture3578 = (aHa_Sub3_Sub1_270.anIDirect3DDevice6098
					.a(i, i_0_, i_1_, 1, 0, ha_Sub3_Sub1.method2074(-1935,
							class164, (aClass162_271)), 1));
			final PixelBuffer pixelbuffer = (aHa_Sub3_Sub1_270.aPixelBuffer6095);
			final int i_2_ = anIDirect3DVolumeTexture3578.LockBox(0, 0, 0, 0,
					i, i_0_, i_1_, 0, pixelbuffer);
			if (kg.a(-21593, i_2_)) {
				final int i_3_ = (anInt3579 * (aClass164_273.anInt1275));
				final int i_4_ = i_3_ * anInt3580;
				final int i_5_ = pixelbuffer.getSlicePitch();
				if (i_5_ == i_4_) {
					pixelbuffer.a(is, 0, 0, anInt3580 * (i_3_ * anInt3581));
				} else {
					final int i_6_ = pixelbuffer.getRowPitch();
					if ((i_6_ ^ 0xffffffff) == (i_3_ ^ 0xffffffff)) {
						for (int i_7_ = 0; (anInt3581 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
							pixelbuffer.a(is, i_7_ * i_4_, i_7_ * i_5_, i_4_);
						}
					} else {
						for (int i_8_ = 0; i_8_ < anInt3581; i_8_++) {
							for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (anInt3580 ^ 0xffffffff)); i_9_++) {
								pixelbuffer.a(is, i_9_ * i_3_ + i_4_ * i_8_,
										i_9_ * i_6_ + i_5_ * i_8_, i_3_);
							}
						}
					}
				}
				anIDirect3DVolumeTexture3578.UnlockBox(0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
