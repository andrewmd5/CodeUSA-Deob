/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class338 {
	int anInt2830;
	int anInt2831;
	int anInt2832;
	static short[] aShortArray2833 = new short[256];
	Class246_Sub3 aClass246_Sub3_2834;
	Class37 aClass37_2835;
	Class98_Sub31_Sub5 aClass98_Sub31_Sub5_2836;
	int anInt2837;
	Class98_Sub13 aClass98_Sub13_2838;
	Class98_Sub24_Sub1 aClass98_Sub24_Sub1_2839;
	byte aByte2840;
	int anInt2841;
	static int anInt2842 = 0;
	int anInt2843;

	static final void method3778(final byte i) {
		try {
			if ((Class98_Sub22_Sub1.anInt5789 ^ 0xffffffff) != 0) {
				Class119.method2176(-1, false, Class98_Sub22_Sub1.anInt5789,
						(byte) 89, -1);
				Class98_Sub22_Sub1.anInt5789 = -1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ul.B(" + i + ')');
		}
	}

	public static void method3779(final int i) {
		try {
			if (i < 70) {
				method3780((byte) 10);
			}
			aShortArray2833 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ul.E(" + i + ')');
		}
	}

	static final void method3780(final byte i) {
		try {
			Class135.aClass79_1054.method794(15);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ul.A(" + i + ')');
		}
	}

	static final Class93_Sub1 method3781(final byte i,
			final ByteBuffer class98_sub22) {
		try {
			final Class93 class93 = Class105.method1716(i + -95, class98_sub22);
			if (i != 94) {
				anInt2842 = 13;
			}
			final int i_2_ = class98_sub22.readUnsignedShort((byte) 127);
			final int i_3_ = class98_sub22.readUnsignedShort((byte) 127);
			final int i_4_ = class98_sub22.readUnsignedShort((byte) 127);
			final int i_5_ = class98_sub22.readUnsignedShort((byte) 127);
			final int i_6_ = class98_sub22.readUnsignedShort((byte) 127);
			final int i_7_ = class98_sub22.readUnsignedShort((byte) 127);
			return new Class93_Sub1(class93.aClass63_3509,
					class93.aClass110_3511, class93.anInt3505,
					class93.anInt3507, class93.anInt3514, class93.anInt3504,
					class93.anInt3508, class93.anInt3506, class93.anInt3513,
					i_2_, i_3_, i_4_, i_5_, i_6_, i_7_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ul.D(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method3782(final int i) {
		try {
			if (i != -4) {
				aClass246_Sub3_2834 = null;
			}
			if (aByte2840 != 2 && (aByte2840 ^ 0xffffffff) != -4) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ul.C(" + i + ')');
		}
	}

	Class338(final byte i, final int i_8_, final int i_9_, final int i_10_,
			final int i_11_, final int i_12_, final int i_13_,
			final Class246_Sub3 class246_sub3) {
		try {
			anInt2832 = i_10_;
			anInt2843 = i_13_;
			anInt2830 = i_8_;
			anInt2841 = i_11_;
			anInt2837 = i_12_;
			aClass246_Sub3_2834 = class246_sub3;
			anInt2831 = i_9_;
			aByte2840 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ul.<init>(" + i
					+ ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ','
					+ i_12_ + ',' + i_13_ + ','
					+ (class246_sub3 != null ? "{...}" : "null") + ')'));
		}
	}
}
