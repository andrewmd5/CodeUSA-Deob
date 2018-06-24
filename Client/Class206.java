/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class206 {
	static int anInt1567;
	static int anInt1568;

	static final void method2723(int i, int i_0_) {
		Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i][i_0_];
		for (int i_1_ = 0; i_1_ < 3; i_1_++) {
			Class172 class172_2_ = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_1_][i][i_0_] = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_1_ + 1][i][i_0_]));
			if (class172_2_ != null) {
				for (Class154 class154 = ((Class172) class172_2_).aClass154_1325; class154 != null; class154 = ((Class154) class154).aClass154_1233) {
					Class246_Sub3_Sub4 class246_sub3_sub4 = ((Class154) class154).aClass246_Sub3_Sub4_1232;
					if ((((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6158 == i)
							&& (((Class246_Sub3_Sub4) class246_sub3_sub4).aShort6157) == i_0_)
						((Class246_Sub3) class246_sub3_sub4).aByte5088--;
				}
				if (((Class172) class172_2_).aClass246_Sub3_Sub1_1332 != null)
					((Class246_Sub3) (((Class172) class172_2_).aClass246_Sub3_Sub1_1332)).aByte5088--;
				if (((Class172) class172_2_).aClass246_Sub3_Sub3_1324 != null)
					((Class246_Sub3) (((Class172) class172_2_).aClass246_Sub3_Sub3_1324)).aByte5088--;
				if (((Class172) class172_2_).aClass246_Sub3_Sub3_1333 != null)
					((Class246_Sub3) (((Class172) class172_2_).aClass246_Sub3_Sub3_1333)).aByte5088--;
				if (((Class172) class172_2_).aClass246_Sub3_Sub5_1334 != null)
					((Class246_Sub3) (((Class172) class172_2_).aClass246_Sub3_Sub5_1334)).aByte5088--;
				if (((Class172) class172_2_).aClass246_Sub3_Sub5_1326 != null)
					((Class246_Sub3) (((Class172) class172_2_).aClass246_Sub3_Sub5_1326)).aByte5088--;
			}
		}
		if (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i][i_0_] == null) {
			Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i][i_0_] = new Class172(
					0);
			((Class172) (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i][i_0_])).aByte1322 = (byte) 1;
		}
		((Class172) (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i][i_0_])).aClass172_1330 = class172;
		Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[3][i][i_0_] = null;
	}

	static final void method2724(byte i) {
		try {
			if (Class98_Sub31_Sub2.anInt5822 <= 0)
				Class45.aString382 = "";
			else {
				int i_3_ = 0;
				for (int i_4_ = 0; i_4_ < Class98_Sub46_Sub20.aStringArray6073.length; i_4_++) {
					if (Class98_Sub46_Sub20.aStringArray6073[i_4_]
							.indexOf("--> ") != -1
							&& ((Class98_Sub31_Sub2.anInt5822 ^ 0xffffffff) == (++i_3_ ^ 0xffffffff))) {
						Class45.aString382 = (Class98_Sub46_Sub20.aStringArray6073[i_4_]
								.substring(Class98_Sub46_Sub20.aStringArray6073[i_4_]
										.indexOf(">") + 2));
						break;
					}
				}
			}
			if (i <= 122)
				method2725(-3, 116, -39);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "nha.D(" + i + ')');
		}
	}

	static final boolean method2725(int i, int i_5_, int i_6_) {
		try {
			if (i != 32768)
				anInt1567 = -40;
			if ((0x8000 & i_5_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("nha.A(" + i + ','
					+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	abstract Class98_Sub46_Sub2 method2726(int i,
			Class98_Sub46_Sub2 class98_sub46_sub2);

	static final void method2727(int i) {
		try {
			if (i < 20)
				anInt1567 = -40;
			if (!Class232.aBoolean1744) {
				Class246_Sub4_Sub1.method3105((byte) -89,
						(Class246_Sub2.aClass172ArrayArrayArray5077));
				if (Class252.aClass172ArrayArrayArray1927 != null)
					Class246_Sub4_Sub1.method3105((byte) -121,
							Class252.aClass172ArrayArrayArray1927);
				Class232.aBoolean1744 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "nha.C(" + i + ')');
		}
	}

	static {
		new Class105("", 73);
	}
}
