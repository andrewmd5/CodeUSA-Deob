/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class102 {
	private int anInt858;
	private Interface14 anInterface14_859;
	static Class102 aClass102_860 = new Class102(Class191.aClass191_1473);
	private Class191 aClass191_861;
	static Class102 aClass102_862 = new Class102(Class191.aClass191_1476);
	static Class102 aClass102_863 = new Class102(Class191.aClass191_1476);
	static Class102 aClass102_864 = new Class102(Class191.aClass191_1476);
	static Class102 aClass102_865 = new Class102(Class191.aClass191_1476);
	static Class102 aClass102_866 = new Class102(Class191.aClass191_1476);
	static Class102 aClass102_867 = new Class102(Class191.aClass191_1476);
	static Class102 aClass102_868 = new Class102(Class191.aClass191_1476);
	static Class102 aClass102_869 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_870 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_871 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_872 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_873 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_874 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_875 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_876 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_877 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_878 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_879 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_880 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_881 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_882 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_883 = new Class102(Class191.aClass191_1474);
	static Class102 aClass102_884 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_885 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_886 = new Class102(Class191.aClass191_1473);
	static Class102 aClass102_887 = new Class102(Class191.aClass191_1475);
	static Class350 aClass350_888 = new Class350(2);
	static boolean aBoolean889 = false;

	static final AbstractModel method1703(final AnimationDefinition class97,
			final int i, final int i_0_, final int i_1_,
			final AbstractModel abstractModel, final int i_2_, final int i_3_,
			final int i_4_, final int i_5_, final int i_6_, int i_7_,
			final ha var_ha, final int i_8_, final int i_9_) {
		try {
			if (abstractModel == null) {
				return null;
			}
			int i_10_ = 2055;
			if (i_4_ < 113) {
				return null;
			}
			if (class97 != null) {
				i_10_ |= class97.method932(false, i_7_, true, -1);
				i_10_ &= ~0x200;
			}
			final long l = (i_0_ + (i_5_ << -903417392) - -(i_1_ << -423490568)
					- -((long) i_8_ << 142401248) + ((long) i_6_ << 21507696));
			AbstractModel class146_11_;
			synchronized (Class299.aClass79_2493) {
				class146_11_ = (AbstractModel) Class299.aClass79_2493.method802(
						-119, l);
			}
			if (class146_11_ == null
					|| ((var_ha.c(class146_11_.ua(), i_10_) ^ 0xffffffff) != -1)) {
				if (class146_11_ != null) {
					i_10_ = var_ha.method1777(i_10_, class146_11_.ua());
				}
				int i_12_;
				if ((i_0_ ^ 0xffffffff) != -2) {
					if (i_0_ != 2) {
						if (i_0_ != 3) {
							if (i_0_ == 4) {
								i_12_ = 18;
							} else {
								i_12_ = 21;
							}
						} else {
							i_12_ = 15;
						}
					} else {
						i_12_ = 12;
					}
				} else {
					i_12_ = 9;
				}
				final int i_13_ = 3;
				final int[] is = { 64, 96, 128 };
				final Model model = new Model(i_13_ * i_12_ + 1, i_13_
						* (i_12_ * 2) - i_12_, 0);
				final int i_14_ = model.method2599(14418, 0, 0, 0);
				final int[][] is_15_ = new int[i_13_][i_12_];
				for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
					final int i_17_ = is[i_16_];
					final int i_18_ = is[i_16_];
					for (int i_19_ = 0; i_12_ > i_19_; i_19_++) {
						final int i_20_ = (i_19_ << 1158136782) / i_12_;
						final int i_21_ = (Class284_Sub2_Sub2.anIntArray6200[i_20_]
								* i_17_ >> 1774149838);
						final int i_22_ = (Class284_Sub2_Sub2.anIntArray6202[i_20_]
								* i_18_ >> 1320391086);
						is_15_[i_16_][i_19_] = model.method2599(14418,
								i_21_, 0, i_22_);
					}
				}
				for (int i_23_ = 0; i_23_ < i_13_; i_23_++) {
					final int i_24_ = (i_23_ * 256 + 128) / i_13_;
					final int i_25_ = -i_24_ + 256;
					final byte i_26_ = (byte) (i_5_ * i_25_ + i_24_ * i_1_ >> -266203096);
					final short i_27_ = (short) (((0x7f00 & (i_25_
							* (0x7f & i_8_) + (0x7f & i_6_) * i_24_)) + ((0xfc0000 & (i_24_
							* (0xfc00 & i_6_) + i_25_ * (0xfc00 & i_8_))) + (((i_8_ & 0x380)
							* i_25_ + (0x380 & i_6_) * i_24_) & 0x38000))) >> -887272664);
					for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_28_++) {
						if ((i_23_ ^ 0xffffffff) != -1) {
							model.method2594((byte) 1, i_27_, (short) -1,
									i_26_, false, is_15_[i_23_][(1 + i_28_)
											% i_12_],
									is_15_[-1 + i_23_][i_28_], (byte) -1,
									is_15_[i_23_ - 1][(i_28_ + 1) % i_12_]);
							model.method2594((byte) 1, i_27_, (short) -1,
									i_26_, false, is_15_[i_23_][i_28_],
									is_15_[-1 + i_23_][i_28_], (byte) -1,
									(is_15_[i_23_][(1 + i_28_) % i_12_]));
						} else {
							model.method2594((byte) 1, i_27_, (short) -1,
									i_26_, false, is_15_[0][i_28_], i_14_,
									(byte) -1,
									(is_15_[0][(i_28_ - -1) % i_12_]));
						}
					}
				}
				class146_11_ = var_ha.method1790(model, i_10_,
						za_Sub1.anInt6076, 64, 768);
				synchronized (Class299.aClass79_2493) {
					Class299.aClass79_2493.method805(l, class146_11_,
							(byte) -80);
				}
			}
			final int i_29_ = abstractModel.V();
			final int i_30_ = abstractModel.RA();
			final int i_31_ = abstractModel.HA();
			final int i_32_ = abstractModel.G();
			Class98_Sub46_Sub16 class98_sub46_sub16 = null;
			if (class97 != null) {
				i_7_ = class97.anIntArray818[i_7_];
				class98_sub46_sub16 = Class151_Sub7.aClass183_5001.method2624(
						2, i_7_ >> 448240368);
				i_7_ &= 0xffff;
			}
			if (class98_sub46_sub16 != null) {
				class146_11_ = class146_11_.method2341((byte) 3, i_10_, true);
				class146_11_.O(-i_29_ + i_30_ >> 1914721025, 128, -i_31_
						+ i_32_ >> 1598124673);
				class146_11_.H(i_30_ + i_29_ >> 217245921, 0,
						i_31_ - -i_32_ >> 1082256225);
				class146_11_.method2340(class98_sub46_sub16, 0, i_7_);
			} else {
				class146_11_ = class146_11_.method2341((byte) 3, i_10_, true);
				class146_11_.O(-i_29_ + i_30_ >> -953095807, 128, -i_31_
						+ i_32_ >> 226658273);
				class146_11_.H(i_29_ + i_30_ >> -379781503, 0,
						i_31_ - -i_32_ >> -1170469311);
			}
			if (i_2_ != 0) {
				class146_11_.FA(i_2_);
			}
			if ((i ^ 0xffffffff) != -1) {
				class146_11_.VA(i);
			}
			if (i_9_ != 0) {
				class146_11_.H(0, i_9_, 0);
			}
			return class146_11_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gh.G("
					+ (class97 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ','
					+ (abstractModel != null ? "{...}" : "null") + ',' + i_2_ + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_
					+ ',' + (var_ha != null ? "{...}" : "null") + ',' + i_8_
					+ ',' + i_9_ + ')'));
		}
	}

	static final Class102[] method1704(final int i) {
		try {
			if (i != 4) {
				return null;
			}
			return (new Class102[] { aClass102_860, aClass102_862,
					aClass102_863, aClass102_864, aClass102_865, aClass102_866,
					aClass102_867, aClass102_868, aClass102_869, aClass102_870,
					aClass102_871, aClass102_872, aClass102_873, aClass102_874,
					aClass102_875, aClass102_876, aClass102_877, aClass102_878,
					aClass102_879, aClass102_880, aClass102_881, aClass102_882,
					aClass102_883, aClass102_884, aClass102_885, aClass102_886,
					aClass102_887 });
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gh.B(" + i + ')');
		}
	}

	final int method1705(final int i) {
		try {
			if (i < 59) {
				aClass102_886 = null;
			}
			return anInt858;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gh.C(" + i + ')');
		}
	}

	final void method1706(final int i, final int i_33_) {
		try {
			anInt858 = i;
			if (i_33_ <= 96) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gh.F(" + i + ','
					+ i_33_ + ')');
		}
	}

	final void method1707(final byte i, final Interface14 interface14) {
		try {
			if (i != 1) {
				method1709(-10);
			}
			if (interface14.method50(15763) != aClass191_861) {
				throw new IllegalArgumentException();
			}
			anInterface14_859 = interface14;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gh.A(" + i + ','
					+ (interface14 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1708(final byte i) {
		try {
			aClass102_879 = null;
			aClass102_860 = null;
			aClass102_865 = null;
			aClass102_877 = null;
			aClass102_884 = null;
			if (i != 70) {
				method1708((byte) 26);
			}
			aClass102_882 = null;
			aClass102_863 = null;
			aClass102_866 = null;
			aClass102_870 = null;
			aClass350_888 = null;
			aClass102_872 = null;
			aClass102_878 = null;
			aClass102_869 = null;
			aClass102_876 = null;
			aClass102_874 = null;
			aClass102_868 = null;
			aClass102_886 = null;
			aClass102_887 = null;
			aClass102_873 = null;
			aClass102_867 = null;
			aClass102_871 = null;
			aClass102_881 = null;
			aClass102_862 = null;
			aClass102_885 = null;
			aClass102_880 = null;
			aClass102_875 = null;
			aClass102_883 = null;
			aClass102_864 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gh.H(" + i + ')');
		}
	}

	final Interface14 method1709(final int i) {
		try {
			return anInterface14_859;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gh.E(" + i + ')');
		}
	}

	static final int method1710(final int i) {
		try {
			if (i < 45) {
				aClass102_881 = null;
			}
			if (Player.aBoolean6540) {
				return 6;
			}
			if (Class266.aClass98_Sub46_Sub8_1994 == null) {
				return 0;
			}
			final int i_35_ = (Class266.aClass98_Sub46_Sub8_1994.anInt5990);
			if (Class98_Sub21.method1179(i_35_, 255)) {
				return 1;
			}
			if (Class299_Sub2.method3526(123, i_35_)) {
				return 2;
			}
			if (Class98_Sub10_Sub21.method1064(i_35_, false)) {
				return 3;
			}
			if (Class36.method340(i_35_, (byte) -91)) {
				return 4;
			}
			return 5;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gh.D(" + i + ')');
		}
	}

	@Override
	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					"gh.toString(" + ')');
		}
	}

	private Class102(final Class191 class191) {
		try {
			aClass191_861 = class191;
			anInt858 = 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gh.<init>("
					+ (class191 != null ? "{...}" : "null") + ')');
		}
	}
}
