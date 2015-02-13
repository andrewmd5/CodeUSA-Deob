/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class98 {
	long aLong832;
	Class98 aClass98_833;
	static Class38 aClass38_834;
	static int anInt835 = -1;
	Class98 aClass98_836;
	static int anInt837 = 0;

	public static void method940(boolean bool) {
		try {
			if (bool == false)
				aClass38_834 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gda.AA(" + bool
					+ ')');
		}
	}

	final boolean method941(byte i) {
		try {
			if (((Class98) this).aClass98_833 == null)
				return false;
			if (i != 78)
				method943(null, false, true);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gda.T(" + i + ')');
		}
	}

	final void method942(int i) {
		try {
			if (i <= 41)
				anInt837 = -8;
			if (((Class98) this).aClass98_833 != null) {
				((Class98) ((Class98) this).aClass98_833).aClass98_836 = ((Class98) this).aClass98_836;
				((Class98) ((Class98) this).aClass98_836).aClass98_833 = ((Class98) this).aClass98_833;
				((Class98) this).aClass98_833 = null;
				((Class98) this).aClass98_836 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gda.V(" + i + ')');
		}
	}

	static final void method943(byte[] is, boolean bool, boolean bool_0_) {
		do {
			try {
				if (bool_0_ != false)
					method943(null, false, true);
				if (Class98_Sub10_Sub28.aClass98_Sub22_5705 == null)
					Class98_Sub10_Sub28.aClass98_Sub22_5705 = new ByteBuffer(
							20000);
				Class98_Sub10_Sub28.aClass98_Sub22_5705.method1217(is,
						is.length, -1, 0);
				if (!bool)
					break;
				Class30.method304(
						120,
						(((ByteBuffer) Class98_Sub10_Sub28.aClass98_Sub22_5705).aByteArray3992));
				Class98_Sub28_Sub1.aClass53_Sub1Array5805 = new Class53_Sub1[Class42_Sub3.anInt5366];
				int i = 0;
				for (int i_1_ = Class164.anInt1274; Class101.anInt854 >= i_1_; i_1_++) {
					Class53_Sub1 class53_sub1 = Class275.method3283((byte) 127,
							i_1_);
					if (class53_sub1 != null)
						Class98_Sub28_Sub1.aClass53_Sub1Array5805[i++] = class53_sub1;
				}
				Class64_Sub12.aBoolean3671 = false;
				Class267.aLong1998 = Class343.method3819(-47);
				Class98_Sub10_Sub28.aClass98_Sub22_5705 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gda.U("
						+ (is != null ? "{...}" : "null") + ',' + bool + ','
						+ bool_0_ + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method944(int i, int i_2_, byte i_3_) {
		try {
			if (i_3_ != 85)
				method944(43, 69, (byte) 22);
			if ((0x22 & i ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gda.W(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	public Class98() {
		/* empty */
	}

	static {
		aClass38_834 = new Class38();
	}
}
