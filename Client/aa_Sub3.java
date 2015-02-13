/* aa_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class aa_Sub3 extends aa {
	static IncomingOpcode aClass58_3566;
	static float aFloat3567;
	Class42_Sub1_Sub1 aClass42_Sub1_Sub1_3568;
	static boolean aBoolean3569 = false;
	static OutgoingOpcode aClass171_3570;
	static int[] anIntArray3571;
	static char[] aCharArray3572;
	static Class348 aClass348_3573;
	static boolean[] aBooleanArray3574;
	static boolean[] aBooleanArray3575;

	static final int method157(final int i, final byte i_0_) {
		try {
			if (i_0_ != 64) {
				method158(100);
			}
			return (0x3ff26 & i) >> -1240258357;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nc.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	aa_Sub3(final ha_Sub1 var_ha_Sub1, final int i, final int i_1_,
			final byte[] is) {
		try {
			aClass42_Sub1_Sub1_3568 = Class284_Sub2.method3374(6406, i_1_,
					14764, 6406, var_ha_Sub1, false, is, i);
			aClass42_Sub1_Sub1_3568.method383(false, 10242, false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nc.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method158(final int i) {
		try {
			aBooleanArray3575 = null;
			if (i != 6406) {
				method159(null, 9, null, null, null, null);
			}
			aBooleanArray3574 = null;
			aClass171_3570 = null;
			aClass348_3573 = null;
			anIntArray3571 = null;
			aClass58_3566 = null;
			aCharArray3572 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nc.B(" + i + ')');
		}
	}

	static final boolean method159(final Class207 class207, final int i,
			final Class98_Sub31_Sub2 class98_sub31_sub2,
			final Class268 class268, final Class207 class207_2_,
			final Class207 class207_3_) {
		try {
			Class366.aClass98_Sub31_Sub2_3122 = class98_sub31_sub2;
			Class98_Sub34.aClass207_4127 = class207_2_;
			Class94.aClass207_793 = class207_3_;
			Class77_Sub1.anIntArray3804 = new int[16];
			Class270.aClass268_2032 = class268;
			Class64_Sub1.aClass207_3641 = class207;
			if (i != -25233) {
				aClass58_3566 = null;
			}
			for (int i_4_ = 0; i_4_ < 16; i_4_++) {
				Class77_Sub1.anIntArray3804[i_4_] = 255;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nc.A("
					+ (class207 != null ? "{...}" : "null") + ',' + i + ','
					+ (class98_sub31_sub2 != null ? "{...}" : "null") + ','
					+ (class268 != null ? "{...}" : "null") + ','
					+ (class207_2_ != null ? "{...}" : "null") + ','
					+ (class207_3_ != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass58_3566 = new IncomingOpcode(67, -1);
		anIntArray3571 = new int[5];
		aClass171_3570 = new OutgoingOpcode(40, 4);
		aCharArray3572 = new char[] { '[', ']', '#' };
		aBooleanArray3574 = new boolean[100];
		aClass348_3573 = new Class348(9, 0, 4, 1);
		aBooleanArray3575 = new boolean[200];
	}
}
