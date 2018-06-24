import jaclib.memory.heap.NativeHeap;

/* za_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class za_Sub2 extends za {
	static boolean aBoolean6079 = false;
	static int anInt6080 = -1;
	static double aDouble6081;
	NativeHeap aNativeHeap6082;

	static final void method1680(final int i, final int i_0_, final int i_1_) {
		try {
			if (i_1_ == 9767) {
				final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
						.method2628(i_0_, -68, 6);
				class98_sub46_sub17.method1626((byte) -103);
				class98_sub46_sub17.anInt6054 = i;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ig.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method1681(final byte i) {
		do {
			try {
				aNativeHeap6082.b();
				if (i == 36) {
					break;
				}
				method1682(-128, -23, -19);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ig.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final boolean method1682(final int i, final int i_2_, final int i_3_) {
		try {
			if (i_2_ != 0) {
				method1683(-45, 78);
			}
			if ((i & 0x800) == 0) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ig.I(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	za_Sub2(final int i) {
		try {
			aNativeHeap6082 = new NativeHeap(i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ig.<init>(" + i
					+ ')');
		}
	}

	static final boolean method1683(final int i, final int i_4_) {
		try {
			if (i != -11297) {
				return false;
			}
			if (i_4_ != 10 && (i_4_ ^ 0xffffffff) != -12 && i_4_ != 12) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ig.G(" + i + ','
					+ i_4_ + ')');
		}
	}

	static final void method1684(final String string, final int i,
			final byte i_5_) {
		try {
			Class98_Sub45.method1521((byte) 122, i, string, 0, "", "", "");
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ig.E("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ i_5_ + ')'));
		}
	}

	static final void method1685(final int i, final int i_7_, final int i_8_,
			final boolean bool, final int i_9_, final int i_10_,
			final int i_11_, final int i_12_, final int i_13_, final int i_14_) {
		do {
			try {
				do {
					if (i_7_ >= Class76_Sub8.anInt3778
							&& Class3.anInt77 >= i_7_
							&& ((Class76_Sub8.anInt3778 ^ 0xffffffff) >= (i ^ 0xffffffff))
							&& (i ^ 0xffffffff) >= (Class3.anInt77 ^ 0xffffffff)
							&& ((Class76_Sub8.anInt3778 ^ 0xffffffff) >= (i_8_ ^ 0xffffffff))
							&& (Class3.anInt77 ^ 0xffffffff) <= (i_8_ ^ 0xffffffff)
							&& i_14_ >= Class76_Sub8.anInt3778
							&& (Class3.anInt77 ^ 0xffffffff) <= (i_14_ ^ 0xffffffff)
							&& i_13_ >= Class98_Sub10_Sub38.anInt5753
							&& (i_13_ ^ 0xffffffff) >= (Class218.anInt1635 ^ 0xffffffff)
							&& Class98_Sub10_Sub38.anInt5753 <= i_10_
							&& (i_10_ ^ 0xffffffff) >= (Class218.anInt1635 ^ 0xffffffff)
							&& i_9_ >= Class98_Sub10_Sub38.anInt5753
							&& Class218.anInt1635 >= i_9_
							&& ((Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff) >= (i_11_ ^ 0xffffffff))
							&& ((Class218.anInt1635 ^ 0xffffffff) <= (i_11_ ^ 0xffffffff))) {
						Class176.method2579(i_13_, i_9_, i_11_, i, i_7_, i_12_,
								i_8_, i_14_, i_10_, 22024);
						if (!client.aBoolean3553) {
							break;
						}
					}
					Class339.method3788(i_7_, i_12_, i_9_, i, (byte) -67,
							i_14_, i_8_, i_11_, i_13_, i_10_);
				} while (false);
				if (bool == true) {
					break;
				}
				method1682(87, 47, -5);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ig.H(" + i
						+ ',' + i_7_ + ',' + i_8_ + ',' + bool + ',' + i_9_
						+ ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_
						+ ',' + i_14_ + ')'));
			}
			break;
		} while (false);
	}
}
