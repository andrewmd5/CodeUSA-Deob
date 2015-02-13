/* Class98_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub23 extends Class98 {
	int anInt3996 = 2147483647;
	Class98_Sub47 aClass98_Sub47_3997;
	static OutgoingOpcode aClass171_3998 = new OutgoingOpcode(1, -1);
	int anInt3999 = 2147483647;
	int anInt4000 = -2147483648;
	static int anInt4001;
	int anInt4002;
	int anInt4003;
	int anInt4004;
	int anInt4005 = 2147483647;
	int anInt4006;
	static Class85 aClass85_4007 = new Class85(3, 2);

	public static void method1266(int i) {
		try {
			aClass171_3998 = null;
			if (i != -6292)
				aClass171_3998 = null;
			aClass85_4007 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jia.C(" + i + ')');
		}
	}

	final boolean method1267(int i, int i_0_, int i_1_) {
		try {
			if (((Class98_Sub23) this).anInt3996 <= i_1_
					&& ((Class98_Sub23) this).anInt4006 >= i_1_
					&& ((Class98_Sub23) this).anInt3999 <= i_0_
					&& i_0_ <= ((Class98_Sub23) this).anInt4000)
				return true;
			if (i != -2147483648)
				method1267(85, -86, -89);
			if (((((Class98_Sub23) this).anInt4003 ^ 0xffffffff) >= (i_1_ ^ 0xffffffff))
					&& ((((Class98_Sub23) this).anInt4002 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff))
					&& ((Class98_Sub23) this).anInt4005 <= i_0_
					&& ((Class98_Sub23) this).anInt4004 >= i_0_)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jia.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	Class98_Sub23(Class98_Sub47 class98_sub47) {
		((Class98_Sub23) this).anInt4003 = 2147483647;
		((Class98_Sub23) this).anInt4006 = -2147483648;
		((Class98_Sub23) this).anInt4002 = -2147483648;
		((Class98_Sub23) this).anInt4004 = -2147483648;
		try {
			((Class98_Sub23) this).aClass98_Sub47_3997 = class98_sub47;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jia.<init>("
					+ (class98_sub47 != null ? "{...}" : "null") + ')'));
		}
	}

	static final byte[] method1268(int i, int i_2_, byte[] is, byte i_3_) {
		try {
			int i_4_ = -34 / ((i_3_ - -27) / 46);
			byte[] is_5_ = new byte[i];
			Class236.method2894(is, i_2_, is_5_, 0, i);
			return is_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("jia.B(" + i + ',' + i_2_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_3_ + ')'));
		}
	}
}
