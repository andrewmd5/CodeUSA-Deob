/* Class362 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class362 {
	static int anInt3090 = 4;
	private Class363 aClass363_3091;
	private Class207 aClass207_3092;
	private Class207 aClass207_3093;

	static final Class93_Sub1_Sub1 method3924(int i, ByteBuffer class98_sub22) {
		try {
			Class93_Sub1 class93_sub1 = Class338.method3781((byte) 94,
					class98_sub22);
			int i_0_ = class98_sub22.readUShort(false);
			if (i != 1)
				anInt3090 = -67;
			return (new Class93_Sub1_Sub1(
					((Class93) class93_sub1).aClass63_3509,
					((Class93) class93_sub1).aClass110_3511,
					((Class93) class93_sub1).anInt3505,
					((Class93) class93_sub1).anInt3507,
					((Class93) class93_sub1).anInt3514,
					((Class93) class93_sub1).anInt3504,
					((Class93) class93_sub1).anInt3508,
					((Class93) class93_sub1).anInt3506,
					((Class93) class93_sub1).anInt3513,
					((Class93_Sub1) class93_sub1).anInt5483,
					((Class93_Sub1) class93_sub1).anInt5480,
					((Class93_Sub1) class93_sub1).anInt5485,
					((Class93_Sub1) class93_sub1).anInt5481,
					((Class93_Sub1) class93_sub1).anInt5478,
					((Class93_Sub1) class93_sub1).anInt5484, i_0_));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vu.B(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	Class362(Class207 class207, Class207 class207_1_) {
		try {
			aClass207_3092 = class207;
			aClass207_3093 = class207_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vu.<init>("
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class207_1_ != null ? "{...}" : "null") + ')'));
		}
	}

	private final Class363 method3925(boolean bool) {
		try {
			if (aClass363_3091 == null)
				aClass363_3091 = new Class363();
			if (bool != false)
				return null;
			return aClass363_3091;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vu.A(" + bool
					+ ')');
		}
	}

	static final void method3926(int i, int i_2_, int i_3_, int i_4_,
			ha var_ha, int i_5_, int i_6_, int i_7_) {
		do {
			try {
				Class154.aHa1231 = var_ha;
				Class98_Sub5_Sub3.aClass111_5540 = Class154.aHa1231
						.method1821();
				Class42_Sub3.aClass111_5364 = Class154.aHa1231.method1821();
				Class200.aClass111_1543 = Class154.aHa1231.method1821();
				Class151.anInt1214 = i_6_;
				Class31.anInterface17_301 = null;
				Class268.anInt2007 = 0;
				Class98_Sub46.anInt4261 = 1;
				Class98_Sub40.anInt4194 = i_2_;
				Class98_Sub10_Sub38.anInt5761 = i_5_;
				Class197.anInt1513 = i_4_;
				Class76_Sub8.anInt3780 = 0;
				Class287_Sub2.method3391(i_7_, i_3_, 2);
				if (i <= -112)
					break;
				method3924(42, null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vu.D(" + i
						+ ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ','
						+ (var_ha != null ? "{...}" : "null") + ',' + i_5_
						+ ',' + i_6_ + ',' + i_7_ + ')'));
			}
			break;
		} while (false);
	}

	final Interface18 method3927(byte i, Interface21 interface21) {
		try {
			if (interface21 == null)
				return null;
			Class113 class113 = interface21.method70(30778);
			if (Class100.aClass113_840 == class113)
				return new Class133((Class163) interface21);
			if (class113 == Class365.aClass113_3109)
				return new Class334(method3925(false), (Class52) interface21);
			if (class113 == Class280.aClass113_2111)
				return new Class134(aClass207_3092, (Class337) interface21);
			if (Class98_Sub10_Sub3.aClass113_5546 == class113)
				return new Class134_Sub1(aClass207_3092,
						(Class337_Sub1) interface21);
			if (class113 == Class47.aClass113_399)
				return new Class373_Sub2(aClass207_3092, aClass207_3093,
						(Class93_Sub3) interface21);
			if (Class137.aClass113_1078 == class113)
				return new Class373_Sub3(aClass207_3092, aClass207_3093,
						(Class93_Sub2) interface21);
			if (class113 == Class98_Sub44.aClass113_4245)
				return new PacketParser(aClass207_3092, aClass207_3093,
						(Class93_Sub1) interface21);
			if (Class308.aClass113_2582 == class113)
				return new Class19(aClass207_3092, aClass207_3093,
						(Class315) interface21);
			if (Class4.aClass113_80 == class113)
				return new Class5(aClass207_3092, (Class367) interface21);
			if (class113 == Class18.aClass113_210)
				return new Class373_Sub1_Sub1(aClass207_3092, aClass207_3093,
						(Class93_Sub1_Sub1) interface21);
			if (i != 62)
				aClass207_3093 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vu.C(" + i + ','
					+ (interface21 != null ? "{...}" : "null") + ')'));
		}
	}
}
