/* Class98_Sub47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub47 extends Node {
	int anInt4266;
	int anInt4267;
	int anInt4268 = -1;
	int anInt4269;
	static IncomingOpcode aClass58_4270 = new IncomingOpcode(118, 1);
	int anInt4271;
	int anInt4272;
	static Class332 aClass332_4273;
	static Class377 aClass377_4274 = new Class377(16);
	boolean aBoolean4275 = false;
	static int anInt4276 = 0;

	static final void method1658(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_) {
		try {
			if (i_3_ == i_1_) {
				Class64_Sub17.method620(i, i_1_, true, i_0_, i_4_);
			} else {
				if (i_2_ != 16977) {
					aClass58_4270 = null;
				}
				if ((Class76_Sub8.anInt3778 ^ 0xffffffff) >= (-i_1_ + i_0_ ^ 0xffffffff)
						&& i_0_ + i_1_ <= Class3.anInt77
						&& -i_3_ + i >= Class98_Sub10_Sub38.anInt5753
						&& (Class218.anInt1635 ^ 0xffffffff) <= (i + i_3_ ^ 0xffffffff)) {
					Class284.method3362(i, i_1_, i_4_, (byte) -119, i_0_, i_3_);
				} else {
					Class40.method364(i_3_, i_0_, i_1_, i, i_2_ + -17066, i_4_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("uca.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
							+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	public static void method1659(final int i) {
		try {
			aClass58_4270 = null;
			aClass332_4273 = null;
			aClass377_4274 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "uca.A(" + i + ')');
		}
	}

	Class98_Sub47(final int i) {
		try {
			// i = sprite id or something, yet to figure it out lelele
			anInt4268 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "uca.<init>(" + i
					+ ')');
		}
	}
}
