/* aa_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class aa_Sub2 extends aa {
	static int anInt3562;
	Interface4_Impl2 anInterface4_Impl2_3563;
	static OutgoingOpcode aClass171_3564 = new OutgoingOpcode(13, 8);
	static int[] anIntArray3565;

	public static void method156(int i) {
		try {
			if (i != 13)
				anInt3562 = -35;
			aClass171_3564 = null;
			anIntArray3565 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hu.A(" + i + ')');
		}
	}

	aa_Sub2(ha_Sub3 var_ha_Sub3, int i, int i_0_, byte[] is) {
		try {
			((aa_Sub2) this).anInterface4_Impl2_3563 = var_ha_Sub3.method2053(
					i, Class53_Sub1.aClass164_3633, (byte) 87, is, false, i_0_);
			((aa_Sub2) this).anInterface4_Impl2_3563.method46(false, false, 76);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hu.<init>("
					+ (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	aa_Sub2(ha_Sub3 var_ha_Sub3, int i, int i_1_, int[] is) {
		try {
			((aa_Sub2) this).anInterface4_Impl2_3563 = var_ha_Sub3.method2012(
					i, i_1_, (byte) 31, is, false);
			((aa_Sub2) this).anInterface4_Impl2_3563.method46(false, false, 77);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hu.<init>("
					+ (var_ha_Sub3 != null ? "{...}" : "null") + ',' + i + ','
					+ i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}
}
