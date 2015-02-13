/* Class98_Sub46_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub5 extends Class98_Sub46 {
	Class246_Sub3_Sub4_Sub4 aClass246_Sub3_Sub4_Sub4_5969;
	static Class174[] aClass174Array5970;

	static final boolean method1543(final int i, final int i_0_, final byte i_1_) {
		try {
			if (!Class246_Sub3_Sub4_Sub2_Sub2.aBoolean6540) {
				return false;
			}
			if (i_1_ != 6) {
				method1543(-33, 90, (byte) -77);
			}
			final int i_2_ = i >> -831084784;
			final int i_3_ = i & 0xffff;
			if (Class159.aClass293ArrayArray1252[i_2_] == null
					|| Class159.aClass293ArrayArray1252[i_2_][i_3_] == null) {
				return false;
			}
			final Class293 class293 = Class159.aClass293ArrayArray1252[i_2_][i_3_];
			if ((i_0_ ^ 0xffffffff) == 0
					&& (class293.anInt2354 ^ 0xffffffff) == -1) {
				for (Class98_Sub46_Sub8 class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class33.aClass148_315
						.method2418(32)); class98_sub46_sub8 != null; class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class33.aClass148_315
						.method2417(i_1_ + 99))) {
					if ((class98_sub46_sub8.anInt5990 == 59)
							|| (class98_sub46_sub8.anInt5990 ^ 0xffffffff) == -1007
							|| (class98_sub46_sub8.anInt5990 == 21)
							|| (class98_sub46_sub8.anInt5990 == 49)
							|| (class98_sub46_sub8.anInt5990 == 9)) {
						for (Class293 class293_4_ = Class159.method2509(
								(class98_sub46_sub8.anInt5993), i_1_ ^ ~0x265d); class293_4_ != null; class293_4_ = Class360
								.method3910(true, class293_4_)) {
							if ((class293_4_.anInt2248 ^ 0xffffffff) == (class293.anInt2248 ^ 0xffffffff)) {
								return true;
							}
						}
					}
				}
			} else {
				for (Class98_Sub46_Sub8 class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class33.aClass148_315
						.method2418(32)); class98_sub46_sub8 != null; class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class33.aClass148_315
						.method2417(112))) {
					if (i_0_ == (class98_sub46_sub8.anInt5995)
							&& (class98_sub46_sub8.anInt5993 == class293.anInt2248)
							&& (((class98_sub46_sub8.anInt5990) ^ 0xffffffff) == -60
									|| (class98_sub46_sub8.anInt5990) == 1006
									|| (class98_sub46_sub8.anInt5990) == 21
									|| (class98_sub46_sub8.anInt5990) == 49 || (class98_sub46_sub8.anInt5990) == 9)) {
						return true;
					}
				}
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("de.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final int method1544(int i, final byte i_5_, final int i_6_) {
		try {
			if (i_5_ <= 103) {
				return 86;
			}
			final int i_7_ = i >>> -280491016;
			i = (i_7_ * (0xff00 & i) & 0xff0000 | ~0xff00ff & i_7_
					* (0xff00ff & i)) >>> 591549448;
			final int i_8_ = 255 + -i_7_;
			return (((i_8_ * (i_6_ & 0xff00) & 0xff0000 | ~0xff00ff
					& (0xff00ff & i_6_) * i_8_) >>> -1712218008) + i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("de.B(" + i + ','
					+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	public static void method1545(final byte i) {
		do {
			try {
				aClass174Array5970 = null;
				if (i == 78) {
					break;
				}
				aClass174Array5970 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "de.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	Class98_Sub46_Sub5(final Class246_Sub3_Sub4_Sub4 class246_sub3_sub4_sub4) {
		try {
			aClass246_Sub3_Sub4_Sub4_5969 = class246_sub3_sub4_sub4;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("de.<init>("
							+ (class246_sub3_sub4_sub4 != null ? "{...}"
									: "null") + ')'));
		}
	}
}
