/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class133 implements Interface18 {
	static int anInt3452;
	private Class163 aClass163_3453;
	static Class85 aClass85_3454;
	static long aLong3455;
	static boolean aBoolean3456 = false;

	public final boolean method59(int i) {
		try {
			if (i != 14017)
				method59(-23);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jb.A(" + i + ')');
		}
	}

	public final void method58(byte i) {
		do {
			try {
				if (i == -43)
					break;
				method2239(88, 77, (byte) 120);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jb.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final boolean method2238(boolean bool, Class196 class196) {
		try {
			if (bool != true)
				method2239(-9, 115, (byte) -81);
			if (class196 != Class146.aClass196_1182
					&& class196 != Class246_Sub3_Sub4_Sub2_Sub2.aClass196_6543
					&& Class207.aClass196_1578 != class196
					&& class196 != Class134.aClass196_3458)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jb.D(" + bool
					+ ',' + (class196 != null ? "{...}" : "null") + ')'));
		}
	}

	Class133(Class163 class163) {
		try {
			aClass163_3453 = class163;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jb.<init>("
					+ (class163 != null ? "{...}" : "null") + ')');
		}
	}

	public final void method60(boolean bool, byte i) {
		do {
			try {
				if (bool)
					Class265.aHa1974.aa(0, 0, Class39_Sub1.anInt3593,
							Class98_Sub25.anInt4024,
							((Class163) aClass163_3453).anInt3515, 0);
				if (i < -81)
					break;
				method2238(true, null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jb.B(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method2239(int i, int i_0_, byte i_1_) {
		try {
			if (i_1_ != 100)
				anInt3452 = -91;
			boolean bool = ((i & 0x37) == 0 ? Class98_Sub27.method1292(i,
					(byte) 117, i_0_) : Class21_Sub3.method276(i_0_, 15123, i));
			return bool
					| (Class373_Sub3.method3978(i, i_0_, (byte) 103) | (0x10000 & i_0_) != 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jb.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method2240(byte i) {
		try {
			if (i != 16)
				method2239(14, 38, (byte) -60);
			aClass85_3454 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jb.E(" + i + ')');
		}
	}

	static {
		aClass85_3454 = new Class85(5, 3);
	}
}
