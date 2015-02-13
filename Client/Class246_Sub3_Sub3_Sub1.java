/* Class246_Sub3_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub3_Sub1 extends Class246_Sub3_Sub3 implements
		Interface19 {
	private boolean aBoolean6253;
	private Class228 aClass228_6254;
	private boolean aBoolean6255 = false;
	static boolean[] aBooleanArray6256;
	static float aFloat6257 = 1.0F;
	Class359 aClass359_6258;

	final boolean method2976(int i, ha var_ha, byte i_0_, int i_1_) {
		try {
			Class146 class146 = ((Class246_Sub3_Sub3_Sub1) this).aClass359_6258
					.method3897(-1, false, 131072, var_ha, false);
			if (class146 == null)
				return false;
			if (i_0_ <= 59)
				aBoolean6253 = false;
			Class111 class111 = var_ha.method1793();
			class111.method2100(((Class246_Sub3) this).anInt5084,
					((Class246_Sub3) this).anInt5089,
					((Class246_Sub3) this).anInt5079);
			if (!Class239.aBoolean1839)
				return class146.method2339(i, i_1_, class111, false, 0);
			return class146.method2333(i, i_1_, class111, false, 0,
					Class16.anInt197);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tp.TA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_0_ + ','
					+ i_1_ + ')'));
		}
	}

	public final void method67(int i, ha var_ha) {
		try {
			if (i != -25163)
				method2987(-89);
			((Class246_Sub3_Sub3_Sub1) this).aClass359_6258.method3894(
					(byte) -72, var_ha);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tp.E(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2987(int i) {
		try {
			if (i != 6540)
				return false;
			return aBoolean6255;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tp.I(" + i + ')');
		}
	}

	final void method2981(Class246_Sub3 class246_sub3, byte i, boolean bool,
			int i_2_, ha var_ha, int i_3_, int i_4_) {
		try {
			int i_5_ = 6 / ((15 - i) / 55);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tp.CA("
					+ (class246_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + bool + ',' + i_2_ + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_3_ + ','
					+ i_4_ + ')'));
		}
	}

	final Class228 method2974(byte i, ha var_ha) {
		try {
			if (i != -53)
				aBoolean6255 = false;
			return aClass228_6254;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tp.KA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	public final int method64(int i) {
		try {
			if (i != 30472)
				return -48;
			return (((Class359) ((Class246_Sub3_Sub3_Sub1) this).aClass359_6258).anInt3052);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tp.C(" + i + ')');
		}
	}

	Class246_Sub3_Sub3_Sub1(ha var_ha, GameObjectDefinition class352, int i,
			int i_6_, int i_7_, int i_8_, int i_9_, boolean bool, int i_10_,
			int i_11_, int i_12_) {
		super(i_7_, i_8_, i_9_, i, i_6_, Class1.method160(i_11_, (byte) -101,
				i_10_));
		try {
			((Class246_Sub3_Sub3_Sub1) this).aClass359_6258 = new Class359(
					var_ha, class352, i_10_, i_11_,
					((Class246_Sub3) this).aByte5088, i_6_, this, bool, i_12_);
			aBoolean6253 = ((((GameObjectDefinition) class352).anInt2998 ^ 0xffffffff) != -1 && !bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tp.<init>("
					+ (var_ha != null ? "{...}" : "null") + ','
					+ (class352 != null ? "{...}" : "null") + ',' + i + ','
					+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + bool
					+ ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	final void method2988(ha var_ha, int i) {
		do {
			try {
				int i_13_ = -21 % ((53 - i) / 46);
				Class146 class146 = ((Class246_Sub3_Sub3_Sub1) this).aClass359_6258
						.method3897(-1, true, 262144, var_ha, true);
				if (class146 == null)
					break;
				int i_14_ = ((Class246_Sub3) this).anInt5084 >> -1240765751;
				int i_15_ = ((Class246_Sub3) this).anInt5079 >> -1493666103;
				Class111 class111 = var_ha.method1793();
				class111.method2100(((Class246_Sub3) this).anInt5084,
						((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5079);
				((Class246_Sub3_Sub3_Sub1) this).aClass359_6258.method3895(
						class146, i_14_, i_15_, class111, false, i_14_, var_ha,
						false, i_15_);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("tp.MA("
						+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method2992(byte i) {
		try {
			if (i != -73)
				aFloat6257 = 1.3506109F;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tp.DA(" + i + ')');
		}
	}

	public final boolean method65(boolean bool) {
		try {
			if (bool != true)
				method2990(-31);
			return ((Class246_Sub3_Sub3_Sub1) this).aClass359_6258
					.method3898(35);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tp.A(" + bool
					+ ')');
		}
	}

	public final int method66(int i) {
		try {
			if (i != 4657)
				return -76;
			return (((Class359) ((Class246_Sub3_Sub3_Sub1) this).aClass359_6258).anInt3059);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tp.N(" + i + ')');
		}
	}

	final int method2985(boolean bool) {
		try {
			if (bool != false)
				return -32;
			return ((Class246_Sub3_Sub3_Sub1) this).aClass359_6258
					.method3903((byte) -102);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tp.O(" + bool
					+ ')');
		}
	}

	final void method3016(int i, Class185 class185) {
		try {
			((Class246_Sub3_Sub3_Sub1) this).aClass359_6258.method3901(
					class185, i ^ ~0x878);
			if (i != 2048)
				aClass228_6254 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tp.P(" + i + ','
					+ (class185 != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method62(ha var_ha, int i) {
		do {
			try {
				((Class246_Sub3_Sub3_Sub1) this).aClass359_6258.method3892(
						var_ha, i + -24343);
				if (i == 24447)
					break;
				method2981(null, (byte) 16, true, -102, null, 75, -43);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("tp.G("
						+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2978(int i) {
		try {
			int i_16_ = 122 % ((-76 - i) / 47);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tp.H(" + i + ')');
		}
	}

	public final int method63(byte i) {
		try {
			if (i != 20)
				aClass228_6254 = null;
			return (((Class359) ((Class246_Sub3_Sub3_Sub1) this).aClass359_6258).anInt3038);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tp.B(" + i + ')');
		}
	}

	public final void method61(byte i) {
		try {
			if (i != -96)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tp.Q(" + i + ')');
		}
	}

	final int method2990(int i) {
		try {
			if (i != 0)
				method62(null, 53);
			return ((Class246_Sub3_Sub3_Sub1) this).aClass359_6258
					.method3899((byte) 127);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tp.J(" + i + ')');
		}
	}

	final boolean method2982(byte i) {
		try {
			if (i > -70)
				method61((byte) 39);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tp.HA(" + i + ')');
		}
	}

	public static void method3017(byte i) {
		do {
			try {
				aBooleanArray6256 = null;
				if (i >= 19)
					break;
				method3017((byte) 70);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "tp.R(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final Class246_Sub1 method2975(ha var_ha, int i) {
		try {
			Class146 class146 = ((Class246_Sub3_Sub3_Sub1) this).aClass359_6258
					.method3897(-1, false, 2048, var_ha, true);
			if (class146 == null)
				return null;
			Class111 class111 = var_ha.method1793();
			class111.method2100(((Class246_Sub3) this).anInt5084,
					((Class246_Sub3) this).anInt5089,
					((Class246_Sub3) this).anInt5079);
			Class246_Sub1 class246_sub1 = Class94.method915(1, (byte) -47,
					aBoolean6253);
			int i_17_ = ((Class246_Sub3) this).anInt5084 >> -600721783;
			int i_18_ = ((Class246_Sub3) this).anInt5079 >> 1261366377;
			((Class246_Sub3_Sub3_Sub1) this).aClass359_6258.method3895(
					class146, i_17_, i_18_, class111, true, i_17_, var_ha,
					false, i_18_);
			if (Class239.aBoolean1839)
				class146.method2329(
						class111,
						(((Class246_Sub1) class246_sub1).aClass246_Sub6Array5067[0]),
						Class16.anInt197, 0);
			else
				class146.method2325(
						class111,
						(((Class246_Sub1) class246_sub1).aClass246_Sub6Array5067[0]),
						0);
			if (i > -12)
				aFloat6257 = 0.4871182F;
			if ((((Class359) ((Class246_Sub3_Sub3_Sub1) this).aClass359_6258).aClass246_Sub5_3062) != null) {
				Class242 class242 = ((Class359) ((Class246_Sub3_Sub3_Sub1) this).aClass359_6258).aClass246_Sub5_3062
						.method3116();
				if (!Class239.aBoolean1839)
					var_ha.method1820(class242);
				else
					var_ha.method1785(class242, Class16.anInt197);
			}
			aBoolean6255 = class146.F()
					|| (((Class359) ((Class246_Sub3_Sub3_Sub1) this).aClass359_6258).aClass246_Sub5_3062) != null;
			if (aClass228_6254 == null)
				aClass228_6254 = (Class48_Sub2_Sub1.method472(
						((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5084, class146,
						((Class246_Sub3) this).anInt5079, 4));
			else
				Class283.method3350(((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5084, 18,
						((Class246_Sub3) this).anInt5079, class146,
						aClass228_6254);
			return class246_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tp.QA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
