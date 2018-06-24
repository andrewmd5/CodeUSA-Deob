/* Class98_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub26 extends Node {
	static int anInt4028 = 0;
	static IncomingOpcode aClass58_4029 = new IncomingOpcode(57, -2);
	static int[] anIntArray4030 = new int[200];
	int anInt4031;
	int anInt4032;

	static final int method1275(String string, boolean bool) {
		try {
			if (bool != false)
				return -106;
			return 2 + string.length();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("kaa.E("
					+ (string != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	static final int method1276(int i) {
		try {
			if (i != -2)
				anIntArray4030 = null;
			return Class284.anInt2162;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kaa.C(" + i + ')');
		}
	}

	static final void method1277(int i, String string) {
		try {
			System.exit(i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("kaa.B(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1278(int i) {
		try {
			int i_0_ = -45 % ((i - 10) / 55);
			anIntArray4030 = null;
			aClass58_4029 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kaa.D(" + i + ')');
		}
	}

	static final void method1279(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			int i_5_, boolean bool) {
		try {
			int i_6_ = i_2_ + i;
			if (bool != true)
				method1276(-2);
			int i_7_ = -i_2_ + i_4_;
			for (int i_8_ = i; i_6_ > i_8_; i_8_++)
				Class333.method3761(i_3_,
						AnimationDefinition.anIntArrayArray814[i_8_], i_5_,
						i_1_, (byte) 27);
			int i_9_ = i_1_ + -i_2_;
			for (int i_10_ = i_4_; i_10_ > i_7_; i_10_--)
				Class333.method3761(i_3_,
						AnimationDefinition.anIntArrayArray814[i_10_], i_5_,
						i_1_, (byte) 81);
			int i_11_ = i_2_ + i_5_;
			for (int i_12_ = i_6_; (i_12_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff); i_12_++) {
				int[] is = AnimationDefinition.anIntArrayArray814[i_12_];
				Class333.method3761(i_3_, is, i_5_, i_11_, (byte) -127);
				Class333.method3761(i_3_, is, i_9_, i_1_, (byte) -126);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("kaa.A(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_
					+ ',' + bool + ')'));
		}
	}

	Class98_Sub26(int i, int i_13_) {
		try {
			((Class98_Sub26) this).anInt4031 = i;
			((Class98_Sub26) this).anInt4032 = i_13_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("kaa.<init>(" + i
					+ ',' + i_13_ + ')'));
		}
	}
}
