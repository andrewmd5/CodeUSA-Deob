/* Class98_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub3 extends Node {
	int[] anIntArray3823 = new int[1];
	int[] anIntArray3824 = { -1 };
	static int anInt3825 = 0;

	final AbstractModel method951(final AnimationDefinition class97, final int i,
			final int i_0_, final boolean bool, final Appearance appearance,
			final int i_1_, final int i_2_, final int i_3_, final byte i_4_,
			final ha var_ha) {
		try {
			AbstractModel abstractModel = null;
			int i_5_ = i_2_;
			Class294 class294 = null;
			if ((i_1_ ^ 0xffffffff) != 0) {
				class294 = Class370.aClass257_3136.method3199(false, i_1_);
			}
			int[] is = anIntArray3824;
			if (class294 != null && class294.anIntArray2379 != null) {
				is = new int[class294.anIntArray2379.length];
				for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (class294.anIntArray2379.length ^ 0xffffffff)); i_6_++) {
					final int i_7_ = class294.anIntArray2379[i_6_];
					if (i_7_ < 0
							|| ((i_7_ ^ 0xffffffff) <= (anIntArray3824.length ^ 0xffffffff))) {
						is[i_6_] = -1;
					} else {
						is[i_6_] = anIntArray3824[i_7_];
					}
				}
			}
			boolean bool_8_ = false;
			boolean bool_9_ = false;
			boolean bool_10_ = false;
			boolean bool_11_ = false;
			int i_12_ = -1;
			int i_13_ = -1;
			int i_14_ = 0;
			Class98_Sub46_Sub16 class98_sub46_sub16 = null;
			Class98_Sub46_Sub16 class98_sub46_sub16_15_ = null;
			if (i_4_ > -43) {
				method951(null, 78, 100, false, null, 112, 24, -42, (byte) 36,
						null);
			}
			if (class97 != null) {
				i_5_ |= 0x20;
				i_12_ = class97.anIntArray818[i_0_];
				final int i_16_ = i_12_ >>> -2044512464;
				class98_sub46_sub16 = Class151_Sub7.aClass183_5001.method2624(
						2, i_16_);
				i_12_ &= 0xffff;
				if (class98_sub46_sub16 != null) {
					bool_9_ |= class98_sub46_sub16.method1619(i_12_, 31239);
					bool_8_ |= class98_sub46_sub16.method1617(false, i_12_);
					bool_11_ |= class98_sub46_sub16.method1615(i_12_, false);
					bool_10_ |= class97.aBoolean817;
				}
				if ((class97.aBoolean825 || Class357.tweeningEnabled)
						&& (i_3_ ^ 0xffffffff) != 0
						&& class97.anIntArray818.length > i_3_) {
					i_14_ = class97.anIntArray811[i_0_];
					i_13_ = class97.anIntArray818[i_3_];
					final int i_17_ = i_13_ >>> 951346256;
					i_13_ &= 0xffff;
					if ((i_16_ ^ 0xffffffff) != (i_17_ ^ 0xffffffff)) {
						class98_sub46_sub16_15_ = Class151_Sub7.aClass183_5001
								.method2624(2, i_13_ >>> -1068924144);
					} else {
						class98_sub46_sub16_15_ = class98_sub46_sub16;
					}
					if (class98_sub46_sub16_15_ != null) {
						bool_9_ |= class98_sub46_sub16_15_.method1619(i_13_,
								31239);
						bool_8_ |= class98_sub46_sub16_15_.method1617(false,
								i_13_);
						bool_11_ |= class98_sub46_sub16_15_.method1615(i_13_,
								false);
					}
				}
				if (bool_9_) {
					i_5_ |= 0x80;
				}
				if (bool_8_) {
					i_5_ |= 0x100;
				}
				if (bool_10_) {
					i_5_ |= 0x200;
				}
				if (bool_11_) {
					i_5_ |= 0x400;
				}
			}
			final long l = method952(i_1_, bool, is,
					(appearance != null ? appearance.colour : null), -29509);
			if (r_Sub1.aClass79_6321 != null) {
				abstractModel = (AbstractModel) r_Sub1.aClass79_6321.method802(-120, l);
			}
			if (abstractModel == null
					|| (var_ha.c(abstractModel.ua(), i_5_) ^ 0xffffffff) != -1) {
				if (abstractModel != null) {
					i_5_ = var_ha.method1777(i_5_, abstractModel.ua());
				}
				int i_18_ = i_5_;
				boolean bool_19_ = false;
				for (int i_20_ = 0; (is.length ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++) {
					if ((is[i_20_] ^ 0xffffffff) != 0
							&& !Class98_Sub46_Sub19.aClass205_6068.method2714(
									is[i_20_], (byte) -123).method3492(0, bool)) {
						bool_19_ = true;
					}
				}
				if (bool_19_) {
					return null;
				}
				final Model[] class178s = new Model[is.length];
				for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
					if ((is[i_21_] ^ 0xffffffff) != 0) {
						class178s[i_21_] = Class98_Sub46_Sub19.aClass205_6068
								.method2714(is[i_21_], (byte) -116).method3500(
										bool, 109);
					}
				}
				if (class294 != null && class294.anIntArrayArray2366 != null) {
					for (int i_22_ = 0; ((i_22_ ^ 0xffffffff) > (class294.anIntArrayArray2366.length ^ 0xffffffff)); i_22_++) {
						if ((class294.anIntArrayArray2366[i_22_] != null)
								&& class178s[i_22_] != null) {
							final int i_23_ = (class294.anIntArrayArray2366[i_22_][0]);
							final int i_24_ = (class294.anIntArrayArray2366[i_22_][1]);
							final int i_25_ = (class294.anIntArrayArray2366[i_22_][2]);
							final int i_26_ = (class294.anIntArrayArray2366[i_22_][3]);
							final int i_27_ = (class294.anIntArrayArray2366[i_22_][4]);
							final int i_28_ = (class294.anIntArrayArray2366[i_22_][5]);
							if ((i_26_ ^ 0xffffffff) != -1
									|| (i_27_ ^ 0xffffffff) != -1 || i_28_ != 0) {
								class178s[i_22_].method2600(i_28_, i_26_,
										(byte) -128, i_27_);
							}
							if ((i_23_ ^ 0xffffffff) != -1 || i_24_ != 0
									|| (i_25_ ^ 0xffffffff) != -1) {
								class178s[i_22_].method2597(i_25_, i_23_,
										(byte) 108, i_24_);
							}
						}
					}
				}
				if (appearance != null) {
					i_18_ |= 0x4000;
				}
				final Model model = new Model(class178s,
						class178s.length);
				abstractModel = var_ha.method1790(model, i_18_,
						Class105.anInt3415, 64, 850);
				if (appearance != null) {
					for (int i_29_ = 0; i_29_ < 5; i_29_++) {
						for (int i_30_ = 0; Class61.aShortArrayArrayArray478.length > i_30_; i_30_++) {
							if ((Class61.aShortArrayArrayArray478[i_30_][i_29_]).length > appearance.colour[i_29_]) {
								abstractModel.ia(
										(Class98_Sub10_Sub11.aShortArrayArray5597[i_30_][i_29_]),
										(Class61.aShortArrayArrayArray478[i_30_][i_29_][(appearance.colour[i_29_])]));
							}
						}
					}
				}
				if (r_Sub1.aClass79_6321 != null) {
					abstractModel.s(i_5_);
					r_Sub1.aClass79_6321.method805(l, abstractModel, (byte) -80);
				}
			}
			if (class97 == null || class98_sub46_sub16 == null) {
				return abstractModel;
			}
			final AbstractModel class146_31_ = abstractModel.method2341((byte) 1, i_5_,
					true);
			class146_31_.method2338(i - 1, class98_sub46_sub16, i_12_,
					class98_sub46_sub16_15_, class97.aBoolean817, 0, -104,
					i_14_, i_13_);
			return class146_31_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("bc.A("
					+ (class97 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + bool + ','
					+ (appearance != null ? "{...}" : "null") + ',' + i_1_ + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	public Class98_Sub3() {
		/* empty */
	}

	private final long method952(final int i, final boolean bool,
			final int[] is, final int[] is_32_, final int i_33_) {
		try {
			final long[] ls = Class374.aLongArray3164;
			long l = -1L;
			l = (ls[(int) ((i >> 1392131400 ^ l) & 0xffL)] ^ l >>> -155609528);
			l = ls[(int) (0xffL & (i ^ l))] ^ l >>> -1669638136;
			for (int i_34_ = 0; is.length > i_34_; i_34_++) {
				l = (ls[(int) ((is[i_34_] >> -276629928 ^ l) & 0xffL)] ^ l >>> -947925880);
				l = l >>> -1018516728
						^ ls[(int) ((l ^ is[i_34_] >> 525663440) & 0xffL)];
				l = (ls[(int) ((l ^ is[i_34_] >> 285473992) & 0xffL)] ^ l >>> -600711224);
				l = (ls[(int) (0xffL & (is[i_34_] ^ l))] ^ l >>> -24100984);
			}
			if (is_32_ != null) {
				for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > -6; i_35_++) {
					l = l >>> 1900652552
							^ ls[(int) ((is_32_[i_35_] ^ l) & 0xffL)];
				}
			}
			if (i_33_ != -29509) {
				return -33L;
			}
			l = (ls[(int) (((!bool ? 0 : 1) ^ l) & 0xffL)] ^ l >>> -778341368);
			return l;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("bc.B(" + i + ','
					+ bool + ',' + (is != null ? "{...}" : "null") + ','
					+ (is_32_ != null ? "{...}" : "null") + ',' + i_33_ + ')'));
		}
	}
}
