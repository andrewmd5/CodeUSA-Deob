/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Frame;

final class Class281 {
	byte aByte2113;
	short aShort2114;
	int anInt2115;
	int anInt2116;
	static byte[][][] aByteArrayArrayArray2117;
	boolean aBoolean2118;
	short aShort2119;
	int anInt2120;
	int anInt2121;
	int anInt2122;
	short aShort2123;

	static final void method3331(final boolean bool, final Frame frame,
			final Class88 class88) {
		try {
			for (;;) {
				final Class143 class143 = class88.method862(-3470, frame);
				while ((class143.anInt1163 ^ 0xffffffff) == -1) {
					Class246_Sub7.method3131(0, 10L);
				}
				if (class143.anInt1163 == 1) {
					break;
				}
				Class246_Sub7.method3131(0, 100L);
			}
			frame.setVisible(bool);
			frame.dispose();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ri.C(" + bool
					+ ',' + (frame != null ? "{...}" : "null") + ','
					+ (class88 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3332(final int i) {
		try {
			if (i != 22011) {
				aByteArrayArrayArray2117 = null;
			}
			aByteArrayArrayArray2117 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ri.B(" + i + ')');
		}
	}

	Class281(final int i, final int i_0_, final int i_1_, final int i_2_,
			final int i_3_, final int i_4_, final int i_5_, final int i_6_,
			final int i_7_, final boolean bool, final boolean bool_8_,
			final int i_9_) {
		try {
			aShort2119 = (short) i_4_;
			anInt2115 = i_2_;
			anInt2122 = i_0_;
			aByte2113 = (byte) i_7_;
			aShort2114 = (short) i_5_;
			anInt2121 = i;
			aBoolean2118 = bool_8_;
			aShort2123 = (short) i_3_;
			anInt2120 = i_1_;
			anInt2116 = i_9_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ri.<init>(" + i
					+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
					+ i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + bool
					+ ',' + bool_8_ + ',' + i_9_ + ')'));
		}
	}

	static final Class246_Sub3_Sub2 method3333(final int i, final int i_10_,
			final int i_11_) {
		final Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_10_][i_11_];
		if (class172 == null) {
			return null;
		}
		final Class246_Sub3_Sub2 class246_sub3_sub2 = class172.aClass246_Sub3_Sub2_1331;
		class172.aClass246_Sub3_Sub2_1331 = null;
		Class129.method2227(class246_sub3_sub2);
		return class246_sub3_sub2;
	}
}
