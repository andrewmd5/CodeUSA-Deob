/* aa_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class aa_Sub1 extends aa {
	static IncomingOpcode aClass58_3554;
	int[] anIntArray3555;
	static int anInt3556;
	int[] anIntArray3557;
	static int anInt3558 = -1;
	static OutgoingOpcode aClass171_3559;
	static boolean[][] aBooleanArrayArray3560;
	static Class123 aClass123_3561;

	static final Class42_Sub1_Sub1 method153(byte i, int i_0_,
			ha_Sub1 var_ha_Sub1, int i_1_, int i_2_, int i_3_) {
		try {
			if (((ha_Sub1) var_ha_Sub1).aBoolean4426
					|| Class81.method815(i_1_, 0) && Class81.method815(i_0_, 0))
				return new Class42_Sub1_Sub1(var_ha_Sub1, 3553, i_2_, i_3_,
						i_1_, i_0_, true);
			if (!((ha_Sub1) var_ha_Sub1).aBoolean4378)
				return new Class42_Sub1_Sub1(var_ha_Sub1, i_2_, i_3_, i_1_,
						i_0_, Class48.method453(423660257, i_1_),
						Class48.method453(423660257, i_0_), true);
			return new Class42_Sub1_Sub1(var_ha_Sub1, 34037, i_2_, i_3_, i_1_,
					i_0_, true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ht.B(" + i + ','
					+ i_0_ + ',' + (var_ha_Sub1 != null ? "{...}" : "null")
					+ ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public static void method154(byte i) {
		try {
			aBooleanArrayArray3560 = null;
			aClass58_3554 = null;
			aClass171_3559 = null;
			aClass123_3561 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ht.A(" + i + ')');
		}
	}

	static final void method155(int i) {
		do {
			try {
				if (Class42_Sub4.anInt5371 < 0) {
					Class42_Sub4.anInt5371 = 0;
					Class101.anInt849 = -1;
					Class169.anInt1307 = -1;
				}
				if (Class42_Sub4.anInt5371 > Class278.anInt2089) {
					Class169.anInt1307 = -1;
					Class101.anInt849 = -1;
					Class42_Sub4.anInt5371 = Class278.anInt2089;
				}
				if ((Class98_Sub40.anInt4197 ^ 0xffffffff) > i) {
					Class169.anInt1307 = -1;
					Class101.anInt849 = -1;
					Class98_Sub40.anInt4197 = 0;
				}
				if ((Class98_Sub40.anInt4197 ^ 0xffffffff) >= (Class278.anInt2084 ^ 0xffffffff))
					break;
				Class101.anInt849 = -1;
				Class98_Sub40.anInt4197 = Class278.anInt2084;
				Class169.anInt1307 = -1;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ht.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	aa_Sub1(int i, int i_5_, int[] is, int[] is_6_) {
		try {
			((aa_Sub1) this).anIntArray3557 = is_6_;
			((aa_Sub1) this).anIntArray3555 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ht.<init>(" + i
					+ ',' + i_5_ + ',' + (is != null ? "{...}" : "null") + ','
					+ (is_6_ != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass58_3554 = new IncomingOpcode(94, -1);
		aClass171_3559 = new OutgoingOpcode(48, 2);
	}
}
