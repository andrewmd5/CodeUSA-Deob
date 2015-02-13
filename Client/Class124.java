/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Hashtable;

final class Class124 {
	int anInt1012;
	Interface21[] anInterface21Array1013;
	int anInt1014;
	static Hashtable aHashtable1015 = new Hashtable();

	static final int method2212(boolean bool, byte i, int i_0_, int i_1_) {
		try {
			if (i != -96)
				method2212(true, (byte) -78, 7, 22);
			Class98_Sub3 class98_sub3 = Class64_Sub28.method669(i_0_, bool, 6);
			if (class98_sub3 == null)
				return 0;
			if (i_1_ < 0
					|| ((i_1_ ^ 0xffffffff) <= (((Class98_Sub3) class98_sub3).anIntArray3823.length ^ 0xffffffff)))
				return 0;
			return ((Class98_Sub3) class98_sub3).anIntArray3823[i_1_];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ie.A(" + bool
					+ ',' + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	private final Interface21 method2213(Class113 class113,
			ByteBuffer class98_sub22, int i) {
		try {
			if (class113 == Class100.aClass113_840)
				return Class298.method3503(class98_sub22, -22);
			if (class113 == Class47.aClass113_399)
				return Class246_Sub10.method3141(class98_sub22, -88);
			if (class113 == Class365.aClass113_3109)
				return Class98_Sub40.method1469(-2, class98_sub22);
			if (Class98_Sub10_Sub3.aClass113_5546 == class113)
				return Class138.method2277(class98_sub22, i ^ ~0x2219);
			if (i != -8829)
				method2215(87, null);
			if (class113 == Class280.aClass113_2111)
				return ha.method1796(9342, class98_sub22);
			if (class113 == Class137.aClass113_1078)
				return Class64_Sub27.method663(-36, class98_sub22);
			if (class113 == Class98_Sub44.aClass113_4245)
				return Class338.method3781((byte) 94, class98_sub22);
			if (Class308.aClass113_2582 == class113)
				return Class246_Sub3_Sub4.method3024(class98_sub22, true);
			if (Class4.aClass113_80 == class113)
				return Class98_Sub46_Sub19.method1634(class98_sub22, 93);
			if (Class18.aClass113_210 == class113)
				return Class362.method3924(1, class98_sub22);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("ie.D(" + (class113 != null ? "{...}" : "null") + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	public Class124() {
		/* empty */
	}

	public static void method2214(int i) {
		try {
			if (i != 0)
				method2214(-96);
			aHashtable1015 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ie.C(" + i + ')');
		}
	}

	final void method2215(int i, ByteBuffer class98_sub22) {
		try {
			((Class124) this).anInt1012 = class98_sub22.readMediumInt(-124);
			((Class124) this).anInt1014 = class98_sub22.readUnsignedShort((byte) 127);
			((Class124) this).anInterface21Array1013 = new Interface21[class98_sub22
					.readUnsignedByte((byte) 124)];
			Class113[] class113s = Class48_Sub2_Sub1.method476(false);
			for (int i_2_ = i; (((Class124) this).anInterface21Array1013.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++)
				((Class124) this).anInterface21Array1013[i_2_] = method2213(
						(class113s[class98_sub22.readUnsignedByte((byte) -120)]),
						class98_sub22, -8829);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ie.B(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}
}
