/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class187 {
	static Class143 aClass143_1449;
	static int anInt1450;
	static boolean aBoolean1451 = false;

	static final void method2634(final int i, final Class293[] class293s,
			final int i_0_) {
		try {
			int i_1_ = i;
			for (/**/; (class293s.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
				final Class293 class293 = class293s[i_1_];
				if (class293 != null) {
					if ((class293.anInt2354 ^ 0xffffffff) == -1) {
						if (class293.aClass293Array2339 != null) {
							method2634(i, (class293.aClass293Array2339), i_0_);
						}
						final Class98_Sub18 class98_sub18 = ((Class98_Sub18) (Class116.aClass377_964
								.method3990(class293.anInt2248, -1)));
						if (class98_sub18 != null) {
							Class207.method2764(i_0_, class98_sub18.anInt3945,
									-105);
						}
					}
					if ((i_0_ ^ 0xffffffff) == -1
							&& class293.anObjectArray2330 != null) {
						final Class98_Sub21 class98_sub21 = new Class98_Sub21();
						class98_sub21.anObjectArray3981 = class293.anObjectArray2330;
						class98_sub21.aClass293_3986 = class293;
						ClientScriptsDefs.method3144(class98_sub21);
					}
					if ((i_0_ ^ 0xffffffff) == -2
							&& class293.anObjectArray2319 != null) {
						if ((class293.anInt2300 ^ 0xffffffff) <= -1) {
							final Class293 class293_2_ = Class159.method2509(
									(class293.anInt2248), -9820);
							if (class293_2_ == null
									|| (class293_2_.aClass293Array2339 == null)
									|| (((class293_2_.aClass293Array2339).length ^ 0xffffffff) >= (class293.anInt2300 ^ 0xffffffff))
									|| ((class293_2_.aClass293Array2339[class293.anInt2300]) != class293)) {
								continue;
							}
						}
						final Class98_Sub21 class98_sub21 = new Class98_Sub21();
						class98_sub21.aClass293_3986 = class293;
						class98_sub21.anObjectArray3981 = class293.anObjectArray2319;
						ClientScriptsDefs.method3144(class98_sub21);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("mh.A(" + i + ',' + (class293s != null ? "{...}" : "null")
							+ ',' + i_0_ + ')'));
		}
	}

	public static void method2635(final int i) {
		try {
			if (i >= 99) {
				aClass143_1449 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mh.D(" + i + ')');
		}
	}

	static final boolean method2636(final int i, final int i_3_, final int i_4_) {
		try {
			if (i_4_ != 3) {
				return true;
			}
			if ((Class151_Sub2.method2451(i, 544, i_3_) | (i & 0x10000 ^ 0xffffffff) != -1)
					|| Class64_Sub28.method670(i, -12294, i_3_)) {
				return true;
			}
			if ((0x37 & i_3_ ^ 0xffffffff) != -1
					|| !Class228.method2864(55, i, i_3_)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mh.B(" + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final void method2637(final int i, int i_5_, int i_6_,
			final byte[] is, final byte[] is_7_, final int i_8_,
			final int i_9_, final int i_10_, int i_11_) {
		try {
			final int i_12_ = -(i_11_ >> 14184194);
			i_11_ = -(0x3 & i_11_);
			if (i_8_ != -18305) {
				method2634(8, null, 105);
			}
			for (int i_13_ = -i; (i_13_ ^ 0xffffffff) > -1; i_13_++) {
				for (int i_14_ = i_12_; (i_14_ ^ 0xffffffff) > -1; i_14_++) {
					is_7_[i_5_++] += -is[i_6_++];
					is_7_[i_5_++] += -is[i_6_++];
					is_7_[i_5_++] += -is[i_6_++];
					is_7_[i_5_++] += -is[i_6_++];
				}
				for (int i_15_ = i_11_; (i_15_ ^ 0xffffffff) > -1; i_15_++) {
					is_7_[i_5_++] += -is[i_6_++];
				}
				i_6_ += i_9_;
				i_5_ += i_10_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mh.C(" + i + ','
					+ i_5_ + ',' + i_6_ + ',' + (is != null ? "{...}" : "null")
					+ ',' + (is_7_ != null ? "{...}" : "null") + ',' + i_8_
					+ ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}
}
