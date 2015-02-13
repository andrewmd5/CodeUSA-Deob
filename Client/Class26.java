/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;

abstract class Class26 {
	boolean aBoolean269;
	ha_Sub3_Sub1 aHa_Sub3_Sub1_270;
	Class162 aClass162_271;
	Class200 aClass200_272 = Class284_Sub1_Sub1.aClass200_6187;
	Class164 aClass164_273;

	abstract IDirect3DBaseTexture method293(byte i);

	Class26(final ha_Sub3_Sub1 var_ha_Sub3_Sub1, final Class164 class164,
			final Class162 class162, final boolean bool, final int i) {
		try {
			aBoolean269 = bool;
			aClass162_271 = class162;
			aHa_Sub3_Sub1_270 = var_ha_Sub3_Sub1;
			aClass164_273 = class164;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	void method4(final byte i, final Class200 class200) {
		do {
			try {
				aClass200_272 = class200;
				if (i == -81) {
					break;
				}
				aHa_Sub3_Sub1_270 = null;
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}
}
