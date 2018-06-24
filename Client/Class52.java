/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class52 implements Interface21 {
	int anInt3489;
	int anInt3490;
	int anInt3491;
	int anInt3492;
	static int[] anIntArray3493 = new int[25];
	static Class207 aClass207_3494;
	boolean aBoolean3495;
	int anInt3496;
	int anInt3497;
	int anInt3498;
	Class110 aClass110_3499;
	static Class280 aClass280_3500;
	int anInt3501;
	Class63 aClass63_3502;

	static final int method488(boolean bool) {
		try {
			if (bool != true)
				method490(null, (byte) -28);
			synchronized (Class211.aClass79_1594) {
				return Class211.aClass79_1594.method797(-127);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dk.F(" + bool
					+ ')');
		}
	}

	public final Class113 method70(int i) {
		try {
			if (i != 30778)
				method70(43);
			return Class365.aClass113_3109;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dk.A(" + i + ')');
		}
	}

	static final void method489(boolean bool) {
		try {
			Class69_Sub2.aClass79_5334.method806((byte) -127);
			Class64_Sub5.aClass79_3650.method806((byte) 60);
			Class76_Sub11.aClass79_3797.method806((byte) -97);
			if (bool == false)
				Class151_Sub7.aClass79_5004.method806((byte) 116);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dk.D(" + bool
					+ ')');
		}
	}

	static final Class259[] method490(Class88 class88, byte i) {
		try {
			if (!class88.method860((byte) -112))
				return new Class259[0];
			Class143 class143 = class88.method864(55);
			while (class143.anInt1163 == 0)
				Class246_Sub7.method3131(0, 10L);
			if ((class143.anInt1163 ^ 0xffffffff) == -3)
				return new Class259[0];
			int[] is = (int[]) class143.anObject1162;
			Class259[] class259s = new Class259[is.length >> -574919422];
			int i_0_ = 0;
			if (i >= -64)
				anIntArray3493 = null;
			for (/**/; (i_0_ ^ 0xffffffff) > (class259s.length ^ 0xffffffff); i_0_++) {
				Class259 class259 = new Class259();
				class259s[i_0_] = class259;
				((Class259) class259).anInt1953 = is[i_0_ << -22199518];
				((Class259) class259).anInt1956 = is[(i_0_ << -27193534) + 1];
				((Class259) class259).anInt1955 = is[2 + (i_0_ << -1744757374)];
				((Class259) class259).anInt1958 = is[(i_0_ << -1958187070) - -3];
			}
			return class259s;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dk.B("
					+ (class88 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final Class370 method491(int i, boolean bool, Class207 class207,
			String string) {
		try {
			int i_1_ = class207.getResourceByName((byte) -102, string);
			if ((i_1_ ^ 0xffffffff) == 0)
				return new Class370(0);
			int[] is = class207.method2743(i_1_, 6341);
			Class370 class370 = new Class370(is.length);
			int i_2_ = 0;
			int i_3_ = 0;
			if (i < 67)
				method489(false);
			while (((Class370) class370).anInt3137 > i_2_) {
				ByteBuffer class98_sub22 = new ByteBuffer(
						class207.method2745(is[i_3_++], i_1_, false));
				int i_4_ = class98_sub22.readInt(-2);
				int i_5_ = class98_sub22.readUnsignedShort((byte) 127);
				int i_6_ = class98_sub22.readUnsignedByte((byte) 96);
				if (!bool && (i_6_ ^ 0xffffffff) == -2)
					((Class370) class370).anInt3137--;
				else {
					((Class370) class370).anIntArray3133[i_2_] = i_4_;
					((Class370) class370).anIntArray3138[i_2_] = i_5_;
					i_2_++;
				}
			}
			return class370;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dk.C(" + i + ','
					+ bool + ',' + (class207 != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method492(boolean bool) {
		try {
			aClass280_3500 = null;
			if (bool != true)
				anIntArray3493 = null;
			aClass207_3494 = null;
			anIntArray3493 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dk.E(" + bool
					+ ')');
		}
	}

	Class52(int i, Class63 class63, Class110 class110, int i_7_, int i_8_,
			int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool) {
		try {
			((Class52) this).anInt3492 = i_11_;
			((Class52) this).anInt3490 = i_8_;
			((Class52) this).anInt3497 = i_10_;
			((Class52) this).anInt3489 = i_13_;
			((Class52) this).anInt3496 = i_9_;
			((Class52) this).anInt3501 = i;
			((Class52) this).aClass110_3499 = class110;
			((Class52) this).anInt3498 = i_7_;
			((Class52) this).anInt3491 = i_12_;
			((Class52) this).aClass63_3502 = class63;
			((Class52) this).aBoolean3495 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dk.<init>(" + i
					+ ',' + (class63 != null ? "{...}" : "null") + ','
					+ (class110 != null ? "{...}" : "null") + ',' + i_7_ + ','
					+ i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ','
					+ i_12_ + ',' + i_13_ + ',' + bool + ')'));
		}
	}
}
