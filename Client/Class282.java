/* Class282 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Class282 {
	private int anInt2124;
	static int anInt2125 = 0;
	private boolean[] aBooleanArray2126;
	private Class207 aClass207_2127;
	static int anInt2128;
	static Class293 aClass293_2129 = null;
	static int[] anIntArray2130 = { 1, 4, 1, 2 };
	private int[][] anIntArrayArray2131;
	static int anInt2132;

	static final void method3334(byte i, int i_0_,
			Entity class246_sub3_sub4_sub2) {
		try {
			if (i != 37)
				aClass293_2129 = null;
			if ((((Entity) class246_sub3_sub4_sub2).anIntArray6373) != null) {
				int i_1_ = (((Entity) class246_sub3_sub4_sub2).anIntArray6373[i_0_ + 1]);
				if (((((Entity) class246_sub3_sub4_sub2).anInt6413) ^ 0xffffffff) != (i_1_ ^ 0xffffffff)) {
					((Entity) class246_sub3_sub4_sub2).anInt6413 = i_1_;
					((Entity) class246_sub3_sub4_sub2).anInt6366 = 0;
					((Entity) class246_sub3_sub4_sub2).anInt6436 = (((Entity) class246_sub3_sub4_sub2).anInt6434);
					((Entity) class246_sub3_sub4_sub2).anInt6361 = 1;
					((Entity) class246_sub3_sub4_sub2).anInt6405 = 0;
					((Entity) class246_sub3_sub4_sub2).anInt6393 = 0;
					if ((((Entity) class246_sub3_sub4_sub2).anInt6413) != -1)
						Class349.method3840(
								(byte) -127,
								class246_sub3_sub4_sub2,
								(((Entity) class246_sub3_sub4_sub2).anInt6393),
								(Class151_Sub7.aClass183_5001
										.method2623(
												(((Entity) class246_sub3_sub4_sub2).anInt6413),
												i + 16346)));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("rj.E("
							+ i
							+ ','
							+ i_0_
							+ ','
							+ (class246_sub3_sub4_sub2 != null ? "{...}"
									: "null") + ')'));
		}
	}

	final int[] method3335(int i, byte i_2_) {
		try {
			if (i < 0
					|| (i ^ 0xffffffff) <= (anIntArrayArray2131.length ^ 0xffffffff)) {
				if (anInt2124 != -1)
					return new int[] { anInt2124 };
				return new int[0];
			}
			if (!aBooleanArray2126[i] || anIntArrayArray2131[i].length <= 1)
				return anIntArrayArray2131[i];
			if (i_2_ < 86)
				method3335(9, (byte) 114);
			int i_3_ = (anInt2124 ^ 0xffffffff) == 0 ? 0 : 1;
			Random random = new Random();
			int[] is = new int[anIntArrayArray2131[i].length];
			Class236.method2891(anIntArrayArray2131[i], 0, is, 0, is.length);
			for (int i_4_ = i_3_; (i_4_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_4_++) {
				int i_5_ = (Class63
						.method546(-28737, -i_3_ + is.length, random) - -i_3_);
				int i_6_ = is[i_4_];
				is[i_4_] = is[i_5_];
				is[i_5_] = i_6_;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rj.A(" + i + ','
					+ i_2_ + ')');
		}
	}

	final Class124 method3336(int i, int i_7_) {
		try {
			int i_8_ = -31 % ((-52 - i) / 54);
			byte[] is = aClass207_2127.method2745(i_7_, 1, false);
			Class124 class124 = new Class124();
			class124.method2215(0, new ByteBuffer(is));
			return class124;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rj.D(" + i + ','
					+ i_7_ + ')');
		}
	}

	final boolean method3337(int i) {
		try {
			if (i != 1)
				aBooleanArray2126 = null;
			if (anInt2124 == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rj.C(" + i + ')');
		}
	}

	public static void method3338(int i) {
		try {
			anIntArray2130 = null;
			if (i != 0)
				method3334((byte) -59, -38, null);
			aClass293_2129 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rj.B(" + i + ')');
		}
	}

	Class282(Class279 class279, int i, Class207 class207) {
		try {
			aClass207_2127 = class207;
			aClass207_2127.method2761(0, 1);
			ByteBuffer class98_sub22 = new ByteBuffer(
					aClass207_2127.method2745(0, 0, false));
			int i_9_ = class98_sub22.readUnsignedByte((byte) 67);
			if ((i_9_ ^ 0xffffffff) >= -4) {
				int i_10_ = class98_sub22.readUnsignedByte((byte) 37);
				Class113[] class113s = Class48_Sub2_Sub1.method476(false);
				boolean bool = true;
				if ((class113s.length ^ 0xffffffff) != (i_10_ ^ 0xffffffff))
					bool = false;
				else {
					for (int i_11_ = 0; class113s.length > i_11_; i_11_++) {
						int i_12_ = class98_sub22.readUnsignedByte((byte) 9);
						if ((i_12_ ^ 0xffffffff) != (((Class113) class113s[i_11_]).anInt955 ^ 0xffffffff)) {
							bool = false;
							break;
						}
					}
				}
				if (!bool) {
					anInt2124 = -1;
					aBooleanArray2126 = new boolean[0];
					anIntArrayArray2131 = new int[0][];
				} else {
					int i_13_ = class98_sub22.readUnsignedByte((byte) -110);
					int i_14_ = class98_sub22.readUnsignedByte((byte) 49);
					if (i_9_ <= 2)
						anInt2124 = -1;
					else
						anInt2124 = class98_sub22.readUShort(false);
					aBooleanArray2126 = new boolean[1 + i_14_];
					anIntArrayArray2131 = new int[1 + i_14_][];
					for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff); i_15_++) {
						int i_16_ = class98_sub22.readUnsignedByte((byte) -108);
						aBooleanArray2126[i_16_] = (class98_sub22
								.readUnsignedByte((byte) -120) ^ 0xffffffff) == -2;
						int i_17_ = class98_sub22.readUnsignedShort((byte) 127);
						if (anInt2124 == -1) {
							anIntArrayArray2131[i_16_] = new int[i_17_];
							for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff); i_18_++)
								anIntArrayArray2131[i_16_][i_18_] = class98_sub22
										.readUnsignedShort((byte) 127);
						} else {
							anIntArrayArray2131[i_16_] = new int[i_17_ + 1];
							anIntArrayArray2131[i_16_][0] = anInt2124;
							for (int i_19_ = 0; i_17_ > i_19_; i_19_++)
								anIntArrayArray2131[i_16_][1 + i_19_] = class98_sub22
										.readUnsignedShort((byte) 127);
						}
					}
					for (int i_20_ = 0; i_14_ + 1 > i_20_; i_20_++) {
						if (anIntArrayArray2131[i_20_] == null) {
							if (anInt2124 != -1)
								anIntArrayArray2131[i_20_] = new int[] { anInt2124 };
							else
								anIntArrayArray2131[i_20_] = new int[0];
						}
					}
				}
			} else {
				aBooleanArray2126 = new boolean[0];
				anIntArrayArray2131 = new int[0][];
				anInt2124 = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rj.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}
}
