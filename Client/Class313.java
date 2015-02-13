import java.io.BufferedWriter;
import java.io.FileWriter;


/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class313 {
	private long aLong2678;
	private long aLong2679;
	static float aFloat2680 = 0.25F;
	boolean aBoolean2681;
	private int anInt2682;
	int[] anIntArray2683;
	int anInt2684 = -1;
	private int[] anIntArray2685;

	final Class146 method3624(final byte i, final int i_0_,
			final Class83 class83, final Class205 class205, final ha var_ha,
			final int i_1_, final Interface6 interface6,
			final AnimationDefinition class97, final Class301 class301,
			final int i_2_, final AnimationDefParser class183, final int i_3_) {
		try {
			if (anInt2684 != -1) {
				return (class301.method3538(5, anInt2684).method2299(class97,
						false, interface6, i_0_, i_1_, class183, i_3_, var_ha,
						null, i_2_));
			}
			int i_4_ = i_3_;
			if (class97 != null) {
				boolean bool = false;
				boolean bool_5_ = false;
				boolean bool_6_ = false;
				boolean bool_7_ = false;
				int i_8_ = -1;
				int i_9_ = -1;
				i_4_ |= 0x20;
				i_8_ = class97.anIntArray818[i_1_];
				final int i_11_ = i_8_ >>> 1075836880;
				final Class98_Sub46_Sub16 class98_sub46_sub16 = class183
						.method2624(2, i_11_);
				i_8_ &= 0xffff;
				if (class98_sub46_sub16 != null) {
					bool_5_ |= class98_sub46_sub16.method1619(i_8_, 31239);
					bool |= class98_sub46_sub16.method1617(false, i_8_);
					bool_7_ |= class98_sub46_sub16.method1615(i_8_, false);
					bool_6_ |= class97.aBoolean817;
				}
				if ((class97.aBoolean825 || Class357.aBoolean3027)
						&& i_2_ != -1 && class97.anIntArray818.length > i_2_) {
					i_9_ = class97.anIntArray818[i_2_];
					final int i_12_ = i_9_ >>> 334721392;
					i_9_ &= 0xffff;
					final Class98_Sub46_Sub16 class98_sub46_sub16_13_ = (i_12_ == i_11_ ? class98_sub46_sub16
							: class183.method2624(2, i_12_));
					if (class98_sub46_sub16_13_ != null) {
						bool_5_ |= class98_sub46_sub16_13_.method1619(i_9_,
								31239);
						bool |= class98_sub46_sub16_13_.method1617(false, i_9_);
						bool_7_ |= class98_sub46_sub16_13_.method1615(i_9_,
								false);
					}
				}
				if (bool_5_) {
					i_4_ |= 0x80;
				}
				if (bool) {
					i_4_ |= 0x100;
				}
				if (bool_6_) {
					i_4_ |= 0x200;
				}
				if (bool_7_) {
					i_4_ |= 0x400;
				}
			}
			Class146 class146;
			synchronized (PlayerUpdate.aClass79_3411) {
				class146 = (Class146) PlayerUpdate.aClass79_3411.method802(
						-128, aLong2678);
			}
			if (class146 == null || var_ha.c(class146.ua(), i_4_) != 0) {
				if (class146 != null) {
					i_4_ = var_ha.method1777(i_4_, class146.ua());
				}
				int i_14_ = i_4_;
				boolean bool = false;
				for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > -13; i_15_++) {
					final int i_16_ = anIntArray2685[i_15_];
					if ((i_16_ & 0x40000000 ^ 0xffffffff) == -1) {
						if ((i_16_ & ~0x7fffffff) != 0
								&& !class83.method826(0x3fffffff & i_16_, 3)
										.method2474(113)) {
							bool = true;
						}
					} else if (!class205.method2714(0x3fffffff & i_16_,
							(byte) -128).method3489(aBoolean2681, 92)) {
						bool = true;
					}
				}
				if (bool) {
					return null;
				}
				final Model[] class178s = new Model[12];
				int i_17_ = 0;
				for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -13; i_18_++) {
					final int i_19_ = anIntArray2685[i_18_];
					if ((i_19_ & 0x40000000 ^ 0xffffffff) != -1) {
						final Model model = (class205.method2714(
								i_19_ & 0x3fffffff, (byte) -120).method3486(
								aBoolean2681, 0));
						if (model != null) {
							class178s[i_17_++] = model;
						}
					} else if ((~0x7fffffff & i_19_) != 0) {
						final Model model = class83.method826(
								i_19_ & 0x3fffffff, 3).method2476((byte) -99);
						if (model != null) {
							class178s[i_17_++] = model;
						}
					}
				}
				final Model model = new Model(class178s, i_17_);
				i_14_ |= 0x4000;
				class146 = var_ha.method1790(model, i_14_, Class81.anInt624,
						64, 768);
				for (int i_20_ = 0; i_20_ < 5; i_20_++) {
					for (int i_21_ = 0; ((Class61.aShortArrayArrayArray478.length ^ 0xffffffff) < (i_21_ ^ 0xffffffff)); i_21_++) {
						if (anIntArray2683[i_20_] < (Class61.aShortArrayArrayArray478[i_21_][i_20_]).length) {
							class146.ia(
									(Class98_Sub10_Sub11.aShortArrayArray5597[i_21_][i_20_]),
									(Class61.aShortArrayArrayArray478[i_21_][i_20_][(anIntArray2683[i_20_])]));
						}
					}
				}
				class146.s(i_4_);
				synchronized (PlayerUpdate.aClass79_3411) {
					PlayerUpdate.aClass79_3411.method805(aLong2678, class146,
							(byte) -80);
				}
			}
			if (class97 == null) {
				return class146;
			}
			Class146 class146_22_ = class146.method2341((byte) 4, i_4_, true);
			if (i <= 83) {
				aLong2678 = -7L;
			}
			class146_22_ = class97.method937(i_2_, i_0_, i_3_, 127, class146,
					i_1_);
			return class146_22_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("tfa.G(" + i + ',' + i_0_
							+ ',' + (class83 != null ? "{...}" : "null") + ','
							+ (class205 != null ? "{...}" : "null") + ','
							+ (var_ha != null ? "{...}" : "null") + ',' + i_1_
							+ ',' + (interface6 != null ? "{...}" : "null")
							+ ',' + (class97 != null ? "{...}" : "null") + ','
							+ (class301 != null ? "{...}" : "null") + ','
							+ i_2_ + ','
							+ (class183 != null ? "{...}" : "null") + ','
							+ i_3_ + ')'));
		}
	}

	static final void method3625(final int i) {
		do {
			try {
				final int[] is = new int[(Class98_Sub46_Sub19.aClass205_6068.anInt1554)];
				int i_23_ = 0;
				for (int i_24_ = 0; i_24_ < (Class98_Sub46_Sub19.aClass205_6068.anInt1554); i_24_++) {
					final ItemDefs class297 = Class98_Sub46_Sub19.aClass205_6068
							.method2714(i_24_, (byte) -124);
					if ((class297.anInt2458 ^ 0xffffffff) <= -1
							|| ((class297.anInt2466 ^ 0xffffffff) <= -1)) {
						is[i_23_++] = i_24_;
					}
				}
				Class255.anIntArray3207 = new int[i_23_];
				try {
					 BufferedWriter bw = new BufferedWriter(new FileWriter(
					 "lolids.txt"));
					for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > (i_23_ ^ 0xffffffff); i_25_++) {
						Class255.anIntArray3207[i_25_] = is[i_25_];
						bw.write(is[i_25_] + ":" + i_25_);
						 bw.newLine();
					}
					 bw.flush();
					 bw.close();
				} catch (final Exception e) {
					e.printStackTrace();
				}
				if (i == -1439) {
					break;
				}
				method3625(57);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "tfa.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final Class146 method3626(final int i, final AnimationDefinition class97,
			final int i_26_, final int i_27_, final int i_28_, final int i_29_,
			final int i_30_, final int i_31_, final Class83 class83,
			final ha var_ha, final int i_32_, final AnimationDefParser class183) {
		try {
			if (i_32_ != 256) {
				method3636(-13, 94);
			}
			int i_33_ = i_31_;
			if (class97 != null) {
				boolean bool = false;
				boolean bool_34_ = false;
				boolean bool_35_ = false;
				boolean bool_36_ = false;
				int i_37_ = -1;
				int i_38_ = -1;
				i_37_ = class97.anIntArray818[i];
				i_33_ |= 0x20;
				final int i_40_ = i_37_ >>> -1674141136;
				final Class98_Sub46_Sub16 class98_sub46_sub16 = class183
						.method2624(i_32_ ^ 0x102, i_40_);
				i_37_ &= 0xffff;
				if (class98_sub46_sub16 != null) {
					bool_34_ |= class98_sub46_sub16.method1619(i_37_, 31239);
					bool |= class98_sub46_sub16.method1617(false, i_37_);
					bool_36_ |= class98_sub46_sub16.method1615(i_37_, false);
					bool_35_ |= class97.aBoolean817;
				}
				if ((class97.aBoolean825 || Class357.aBoolean3027)
						&& i_30_ != -1 && class97.anIntArray818.length > i_30_) {
					i_38_ = class97.anIntArray818[i_30_];
					final int i_41_ = i_38_ >>> 1835918000;
					i_38_ &= 0xffff;
					Class98_Sub46_Sub16 class98_sub46_sub16_42_;
					if ((i_41_ ^ 0xffffffff) == (i_40_ ^ 0xffffffff)) {
						class98_sub46_sub16_42_ = class98_sub46_sub16;
					} else {
						class98_sub46_sub16_42_ = class183.method2624(2,
								i_38_ >>> 243215344);
					}
					if (class98_sub46_sub16_42_ != null) {
						bool_34_ |= class98_sub46_sub16_42_.method1619(i_38_,
								i_32_ + 30983);
						bool |= class98_sub46_sub16_42_
								.method1617(false, i_38_);
						bool_36_ |= class98_sub46_sub16_42_.method1615(i_38_,
								false);
					}
				}
				if (bool_34_) {
					i_33_ |= 0x80;
				}
				if (bool) {
					i_33_ |= 0x100;
				}
				if (bool_35_) {
					i_33_ |= 0x200;
				}
				if (bool_36_) {
					i_33_ |= 0x400;
				}
			}
			final long l = (i_29_ << -715025360 | (long) i_27_ << 270913248 | i_28_);
			Class146 class146;
			synchronized (PlayerUpdate.aClass79_3411) {
				class146 = (Class146) PlayerUpdate.aClass79_3411.method802(
						-125, l);
			}
			if (class146 == null
					|| (var_ha.c(class146.ua(), i_33_) ^ 0xffffffff) != -1) {
				if (class146 != null) {
					i_33_ = var_ha.method1777(i_33_, class146.ua());
				}
				int i_43_ = i_33_;
				final Model[] class178s = new Model[3];
				int i_44_ = 0;
				if (class83.method826(i_28_, i_32_ + -253).method2474(
						i_32_ + -150)
						&& class83.method826(i_29_, i_32_ + -253).method2474(
								125)
						&& class83.method826(i_27_, 3).method2474(i_32_ + -150)) {
					Model model = class83.method826(i_28_, 3).method2476(
							(byte) -103);
					if (model != null) {
						class178s[i_44_++] = model;
					}
					model = class83.method826(i_29_, i_32_ + -253)
							.method2476((byte) 68);
					if (model != null) {
						class178s[i_44_++] = model;
					}
					model = class83.method826(i_27_, i_32_ ^ 0x103)
							.method2476((byte) 110);
					if (model != null) {
						class178s[i_44_++] = model;
					}
					i_43_ |= 0x4000;
					model = new Model(class178s, i_44_);
					class146 = var_ha.method1790(model, i_43_,
							Class81.anInt624, 64, 768);
					for (int i_45_ = 0; (i_45_ ^ 0xffffffff) > -6; i_45_++) {
						for (int i_46_ = 0; Class61.aShortArrayArrayArray478.length > i_46_; i_46_++) {
							if (anIntArray2683[i_45_] < (Class61.aShortArrayArrayArray478[i_46_][i_45_]).length) {
								class146.ia(
										(Class98_Sub10_Sub11.aShortArrayArray5597[i_46_][i_45_]),
										(Class61.aShortArrayArrayArray478[i_46_][i_45_][(anIntArray2683[i_45_])]));
							}
						}
					}
					class146.s(i_33_);
					synchronized (PlayerUpdate.aClass79_3411) {
						PlayerUpdate.aClass79_3411.method805(l, class146,
								(byte) -80);
					}
				} else {
					return null;
				}
			}
			if (class97 == null) {
				return class146;
			}
			class146 = class146.method2341((byte) 4, i_33_, true);
			class146 = class97.method937(i_30_, i_26_, i_31_, -43, class146, i);
			return class146;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.J(" + i + ','
					+ (class97 != null ? "{...}" : "null") + ',' + i_26_ + ','
					+ i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ','
					+ i_31_ + ',' + (class83 != null ? "{...}" : "null") + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_32_ + ','
					+ (class183 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3627(final int[] is, final int i, final boolean bool,
			final int[] is_47_, final int renderAnim, final int i_49_) {
		try {
			// new Throwable().printStackTrace();
			if (renderAnim != anInt2682) {
				anInt2682 = renderAnim;
			}
			anIntArray2685 = is;
			aBoolean2681 = bool;
			anInt2684 = i_49_;
			anIntArray2683 = is_47_;
			if (i >= -18) {
				anInt2682 = 120;
			}
			method3633(95);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.M("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + bool
					+ ',' + (is_47_ != null ? "{...}" : "null") + ','
					+ renderAnim + ',' + i_49_ + ')'));
		}
	}

	final Class146 method3628(final Class257 class257,
			final AnimationDefinition class97,
			final AnimationDefinition class97_50_,
			final AnimationDefParser class183, final int i,
			final Class83 class83, final int[] is, final Class205 class205,
			final boolean bool, final int i_51_, final Class226[] class226s,
			final Class301 class301, final Interface6 interface6,
			final boolean bool_52_, final int i_53_, final int i_54_,
			final int i_55_, final int i_56_, final int i_57_, final int i_58_,
			final ha var_ha) {
		try {
			if ((anInt2684 ^ 0xffffffff) != 0) {
				return (class301.method3538(5, anInt2684).method2301(i, i_58_,
						is, i_57_, (byte) 101, class97, class226s, var_ha,
						i_51_, i_56_, interface6, null, i_55_, class257, i_53_,
						i_54_, class183, class97_50_));
			}
			int i_59_ = i_53_;
			long l = aLong2678;
			int[] is_60_ = anIntArray2685;
			if (class97 != null
					&& (class97.anInt820 >= 0 || class97.anInt809 >= 0)) {
				is_60_ = new int[12];
				for (int i_61_ = 0; i_61_ < 12; i_61_++) {
					is_60_[i_61_] = anIntArray2685[i_61_];
				}
				if ((class97.anInt820 ^ 0xffffffff) <= -1) {
					if (class97.anInt820 != 65535) {
						is_60_[5] = Class41.method366(class97.anInt820,
								1073741824);
						l ^= (long) is_60_[5] << 1378327584;
					} else {
						is_60_[5] = 0;
						l ^= ~0xffffffffL;
					}
				}
				if (class97.anInt809 >= 0) {
					if ((class97.anInt809 ^ 0xffffffff) != -65536) {
						is_60_[3] = Class41.method366(class97.anInt809,
								1073741824);
						l ^= is_60_[3];
					} else {
						is_60_[3] = 0;
						l ^= 0xffffffffL;
					}
				}
			}
			boolean bool_62_ = false;
			boolean bool_63_ = false;
			boolean bool_64_ = false;
			boolean bool_65_ = class97 != null || class97_50_ != null;
			final int i_66_ = class226s == null ? 0 : class226s.length;
			for (int i_67_ = 0; (i_67_ ^ 0xffffffff) > (i_66_ ^ 0xffffffff); i_67_++) {
				PacketParser.aClass98_Sub46_Sub16Array5468[i_67_] = null;
				if (class226s[i_67_] != null) {
					final AnimationDefinition class97_68_ = class183
							.method2623((class226s[i_67_].anInt1700), 16383);
					if (class97_68_.anIntArray818 != null) {
						bool_65_ = true;
						Class356.aClass97Array3023[i_67_] = class97_68_;
						final int i_69_ = class226s[i_67_].anInt1702;
						final int i_70_ = class226s[i_67_].anInt1701;
						int i_71_ = class97_68_.anIntArray818[i_69_];
						PacketParser.aClass98_Sub46_Sub16Array5468[i_67_] = class183
								.method2624(2, i_71_ >>> -1761370288);
						i_71_ &= 0xffff;
						Class367.anIntArray3546[i_67_] = i_71_;
						if (PacketParser.aClass98_Sub46_Sub16Array5468[i_67_] != null) {
							bool_63_ |= PacketParser.aClass98_Sub46_Sub16Array5468[i_67_]
									.method1619(i_71_, 31239);
							bool_62_ |= PacketParser.aClass98_Sub46_Sub16Array5468[i_67_]
									.method1617(false, i_71_);
							bool_64_ = bool_64_
									| PacketParser.aClass98_Sub46_Sub16Array5468[i_67_]
											.method1615(i_71_, !bool);
						}
						if ((!class97_68_.aBoolean825 && !Class357.aBoolean3027)
								|| i_70_ == -1
								|| ((i_70_ ^ 0xffffffff) <= ((class97_68_.anIntArray818).length ^ 0xffffffff))) {
							Class98_Sub10_Sub17.anIntArray5624[i_67_] = 0;
							Class218.anIntArray1631[i_67_] = 0;
							Class351.aClass98_Sub46_Sub16Array2924[i_67_] = null;
							Class292.anIntArray3355[i_67_] = -1;
						} else {
							Class98_Sub10_Sub17.anIntArray5624[i_67_] = class97_68_.anIntArray811[i_69_];
							Class218.anIntArray1631[i_67_] = class226s[i_67_].anInt1707;
							int i_72_ = class97_68_.anIntArray818[i_70_];
							Class351.aClass98_Sub46_Sub16Array2924[i_67_] = class183
									.method2624(2, i_72_ >>> 347419536);
							i_72_ &= 0xffff;
							Class292.anIntArray3355[i_67_] = i_72_;
							if (Class351.aClass98_Sub46_Sub16Array2924[i_67_] != null) {
								bool_63_ |= Class351.aClass98_Sub46_Sub16Array2924[i_67_]
										.method1619(i_72_, 31239);
								bool_62_ |= Class351.aClass98_Sub46_Sub16Array2924[i_67_]
										.method1617(false, i_72_);
								bool_64_ |= Class351.aClass98_Sub46_Sub16Array2924[i_67_]
										.method1615(i_72_, false);
							}
						}
					}
				}
			}
			int i_73_ = -1;
			int i_74_ = -1;
			int i_75_ = 0;
			Class98_Sub46_Sub16 class98_sub46_sub16 = null;
			Class98_Sub46_Sub16 class98_sub46_sub16_76_ = null;
			int i_77_ = -1;
			int i_78_ = -1;
			int i_79_ = 0;
			Class98_Sub46_Sub16 class98_sub46_sub16_80_ = null;
			Class98_Sub46_Sub16 class98_sub46_sub16_81_ = null;
			if (bool_65_) {
				i_59_ |= 0x20;
				if (class97 != null) {
					i_73_ = class97.anIntArray818[i];
					final int i_82_ = i_73_ >>> -454090480;
					i_73_ &= 0xffff;
					class98_sub46_sub16 = class183.method2624(2, i_82_);
					if (class98_sub46_sub16 != null) {
						bool_63_ |= class98_sub46_sub16
								.method1619(i_73_, 31239);
						bool_62_ |= class98_sub46_sub16
								.method1617(false, i_73_);
						bool_64_ |= class98_sub46_sub16
								.method1615(i_73_, false);
					}
					if ((class97.aBoolean825 || Class357.aBoolean3027)
							&& (i_56_ ^ 0xffffffff) != 0
							&& class97.anIntArray818.length > i_56_) {
						i_74_ = class97.anIntArray818[i_56_];
						i_75_ = class97.anIntArray811[i];
						final int i_83_ = i_74_ >>> -240024528;
						class98_sub46_sub16_76_ = ((i_83_ ^ 0xffffffff) == (i_82_ ^ 0xffffffff) ? class98_sub46_sub16
								: class183.method2624(2, i_83_));
						i_74_ &= 0xffff;
						if (class98_sub46_sub16_76_ != null) {
							bool_63_ |= class98_sub46_sub16_76_.method1619(
									i_74_, 31239);
							bool_62_ |= class98_sub46_sub16_76_.method1617(
									false, i_74_);
							bool_64_ |= class98_sub46_sub16_76_.method1615(
									i_74_, false);
						}
					}
				}
				if (class97_50_ != null) {
					i_77_ = class97_50_.anIntArray818[i_57_];
					final int i_84_ = i_77_ >>> 1300157968;
					i_77_ &= 0xffff;
					class98_sub46_sub16_80_ = class183.method2624(2, i_84_);
					if (class98_sub46_sub16_80_ != null) {
						bool_63_ |= class98_sub46_sub16_80_.method1619(i_77_,
								31239);
						bool_62_ = bool_62_
								| class98_sub46_sub16_80_.method1617(!bool,
										i_77_);
						bool_64_ |= class98_sub46_sub16_80_.method1615(i_77_,
								false);
					}
					if ((class97_50_.aBoolean825 || Class357.aBoolean3027)
							&& i_54_ != -1
							&& (class97_50_.anIntArray818.length > i_54_)) {
						i_79_ = class97_50_.anIntArray811[i_57_];
						i_78_ = class97_50_.anIntArray818[i_54_];
						final int i_85_ = i_78_ >>> -1612855760;
						class98_sub46_sub16_81_ = ((i_85_ ^ 0xffffffff) != (i_84_ ^ 0xffffffff) ? class183
								.method2624(2, i_85_) : class98_sub46_sub16_80_);
						i_78_ &= 0xffff;
						if (class98_sub46_sub16_81_ != null) {
							bool_63_ |= class98_sub46_sub16_81_.method1619(
									i_78_, 31239);
							bool_62_ |= class98_sub46_sub16_81_.method1617(
									false, i_78_);
							bool_64_ |= class98_sub46_sub16_81_.method1615(
									i_78_, false);
						}
					}
				}
				if (bool_63_) {
					i_59_ |= 0x80;
				}
				if (bool_62_) {
					i_59_ |= 0x100;
				}
				if (bool_64_) {
					i_59_ |= 0x400;
				}
			}
			Class146 class146;
			synchronized (Class211.aClass79_1594) {
				class146 = (Class146) Class211.aClass79_1594.method802(-119, l);
			}
			Class294 class294 = null;
			if ((anInt2682 ^ 0xffffffff) != 0) {
				class294 = class257.method3199(false, anInt2682);
			}
			if (class146 == null
					|| (var_ha.c(class146.ua(), i_59_) ^ 0xffffffff) != -1) {
				if (class146 != null) {
					i_59_ = var_ha.method1777(i_59_, class146.ua());
				}
				int i_86_ = i_59_;
				boolean bool_87_ = false;
				for (int i_88_ = 0; i_88_ < 12; i_88_++) {
					final int i_89_ = is_60_[i_88_];
					if ((i_89_ & 0x40000000 ^ 0xffffffff) == -1) {
						if ((i_89_ & ~0x7fffffff ^ 0xffffffff) != -1
								&& !class83.method826(0x3fffffff & i_89_, 3)
										.method2475(0)) {
							bool_87_ = true;
						}
					} else if (!class205.method2714(i_89_ & 0x3fffffff,
							(byte) -128).method3492(0, aBoolean2681)) {
						bool_87_ = true;
					}
				}
				if (!bool_87_) {
					final Model[] class178s = new Model[12];
					for (int i_90_ = 0; (i_90_ ^ 0xffffffff) > -13; i_90_++) {
						final int i_91_ = is_60_[i_90_];
						if ((i_91_ & 0x40000000 ^ 0xffffffff) == -1) {
							if ((~0x7fffffff & i_91_ ^ 0xffffffff) != -1) {
								final Model model = class83.method826(
										0x3fffffff & i_91_, 3).method2473(2);
								if (model != null) {
									class178s[i_90_] = model;
								}
							}
						} else {
							final Model model = (class205.method2714(
									0x3fffffff & i_91_, (byte) -124)
									.method3500(aBoolean2681, 124));
							if (model != null) {
								class178s[i_90_] = model;
							}
						}
					}
					if (class294 != null
							&& class294.anIntArrayArray2366 != null) {
						for (int i_92_ = 0; (class294.anIntArrayArray2366.length > i_92_); i_92_++) {
							if (class178s[i_92_] != null) {
								int i_93_ = 0;
								int i_94_ = 0;
								int i_95_ = 0;
								int i_96_ = 0;
								int i_97_ = 0;
								int i_98_ = 0;
								if ((class294.anIntArrayArray2366[i_92_]) != null) {
									i_98_ = ((class294.anIntArrayArray2366[i_92_][5]) << -264909725);
									i_96_ = ((class294.anIntArrayArray2366[i_92_][3]) << 819372707);
									i_94_ = (class294.anIntArrayArray2366[i_92_][1]);
									i_97_ = ((class294.anIntArrayArray2366[i_92_][4]) << 1212264099);
									i_93_ = (class294.anIntArrayArray2366[i_92_][0]);
									i_95_ = (class294.anIntArrayArray2366[i_92_][2]);
								}
								if ((i_96_ ^ 0xffffffff) != -1
										|| (i_97_ ^ 0xffffffff) != -1
										|| i_98_ != 0) {
									class178s[i_92_].method2600(i_98_, i_96_,
											(byte) 117, i_97_);
								}
								if (i_93_ != 0 || i_94_ != 0 || i_95_ != 0) {
									class178s[i_92_].method2597(i_95_, i_93_,
											(byte) 104, i_94_);
								}
							}
						}
					}
					i_86_ |= 0x4000;
					final Model model = new Model(class178s,
							class178s.length);
					class146 = var_ha.method1790(model, i_86_,
							Class81.anInt624, 64, 850);
					for (int i_99_ = 0; i_99_ < 5; i_99_++) {
						for (int i_100_ = 0; ((Class61.aShortArrayArrayArray478.length ^ 0xffffffff) < (i_100_ ^ 0xffffffff)); i_100_++) {
							if (((Class61.aShortArrayArrayArray478[i_100_][i_99_]).length ^ 0xffffffff) < (anIntArray2683[i_99_] ^ 0xffffffff)) {
								class146.ia(
										(Class98_Sub10_Sub11.aShortArrayArray5597[i_100_][i_99_]),
										(Class61.aShortArrayArrayArray478[i_100_][i_99_][(anIntArray2683[i_99_])]));
							}
						}
					}
					if (bool_52_) {
						class146.s(i_59_);
						synchronized (Class211.aClass79_1594) {
							Class211.aClass79_1594.method805(l, class146,
									(byte) -80);
						}
						aLong2679 = l;
					}
				} else {
					if (aLong2679 != -1L) {
						synchronized (Class211.aClass79_1594) {
							class146 = (Class146) Class211.aClass79_1594
									.method802(-123, aLong2679);
						}
					}
					if (class146 == null || var_ha.c(class146.ua(), i_59_) != 0) {
						return null;
					}
				}
			}
			final Class146 class146_101_ = class146.method2341((byte) 4, i_59_,
					bool);
			boolean bool_102_ = false;
			if (is != null) {
				for (int i_103_ = 0; i_103_ < 12; i_103_++) {
					if ((is[i_103_] ^ 0xffffffff) != 0) {
						bool_102_ = true;
					}
				}
			}
			if (!bool_65_ && !bool_102_) {
				return class146_101_;
			}
			Class111[] class111s = null;
			if (class294 != null) {
				class111s = class294.method3481(var_ha, (byte) 45);
			}
			if (bool_102_ && class111s != null) {
				for (int i_104_ = 0; (i_104_ ^ 0xffffffff) > -13; i_104_++) {
					if (class111s[i_104_] != null) {
						class146_101_.method2331(class111s[i_104_],
								1 << i_104_, true);
					}
				}
			}
			int i_105_ = 0;
			int i_106_ = 1;
			for (/**/; i_66_ > i_105_; i_105_++) {
				if (PacketParser.aClass98_Sub46_Sub16Array5468[i_105_] != null) {
					class146_101_.method2323(Class367.anIntArray3546[i_105_],
							-1 + Class218.anIntArray1631[i_105_],
							Class351.aClass98_Sub46_Sub16Array2924[i_105_],
							-27033, i_106_,
							PacketParser.aClass98_Sub46_Sub16Array5468[i_105_],
							false, Class292.anIntArray3355[i_105_], null, 0,
							Class98_Sub10_Sub17.anIntArray5624[i_105_]);
				}
				i_106_ <<= 1;
			}
			if (bool_102_) {
				for (int i_107_ = 0; (i_107_ ^ 0xffffffff) > -13; i_107_++) {
					if (is[i_107_] != -1) {
						int i_108_ = -i_58_ + is[i_107_];
						i_108_ &= 0x3fff;
						final Class111 class111 = var_ha.method1821();
						class111.method2101(i_108_);
						class146_101_.method2331(class111, 1 << i_107_, false);
					}
				}
			}
			if (bool_102_ && class111s != null) {
				for (int i_109_ = 0; i_109_ < 12; i_109_++) {
					if (class111s[i_109_] != null) {
						class146_101_.method2331(class111s[i_109_],
								1 << i_109_, false);
					}
				}
			}
			if (class98_sub46_sub16 == null || class98_sub46_sub16_80_ == null) {
				if (class98_sub46_sub16 != null) {
					class146_101_.method2338(-1 + i_55_, class98_sub46_sub16,
							i_73_, class98_sub46_sub16_76_, false, 0, 112,
							i_75_, i_74_);
				} else if (class98_sub46_sub16_80_ != null) {
					class146_101_.method2338(i_51_ - 1,
							class98_sub46_sub16_80_, i_77_,
							class98_sub46_sub16_81_, false, 0, 119, i_79_,
							i_78_);
				}
			} else {
				class146_101_.method2321(i_75_, i_73_, class98_sub46_sub16,
						class98_sub46_sub16_76_, class97.aBooleanArray813,
						i_79_, 28777, i_77_, class98_sub46_sub16_80_, i_78_, -1
								+ i_55_, false, class98_sub46_sub16_81_, -1
								+ i_51_, i_74_);
			}
			for (int i_110_ = 0; i_66_ > i_110_; i_110_++) {
				PacketParser.aClass98_Sub46_Sub16Array5468[i_110_] = null;
				Class351.aClass98_Sub46_Sub16Array2924[i_110_] = null;
				Class356.aClass97Array3023[i_110_] = null;
			}
			return class146_101_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.K("
					+ (class257 != null ? "{...}" : "null") + ','
					+ (class97 != null ? "{...}" : "null") + ','
					+ (class97_50_ != null ? "{...}" : "null") + ','
					+ (class183 != null ? "{...}" : "null") + ',' + i + ','
					+ (class83 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ','
					+ (class205 != null ? "{...}" : "null") + ',' + bool + ','
					+ i_51_ + ',' + (class226s != null ? "{...}" : "null")
					+ ',' + (class301 != null ? "{...}" : "null") + ','
					+ (interface6 != null ? "{...}" : "null") + ',' + bool_52_
					+ ',' + i_53_ + ',' + i_54_ + ',' + i_55_ + ',' + i_56_
					+ ',' + i_57_ + ',' + i_58_ + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	static final IncomingOpcode[] method3629(final int i) {
		try {
			if (i <= 1) {
				method3630(-6, 26);
			}
			return (new IncomingOpcode[] { Class370.aClass58_3134,
					Class18.aClass58_215, Class98_Sub10_Sub20.aClass58_5638,
					Class98_Sub32_Sub1.aClass58_5883, Class251.aClass58_1921,
					Class177.aClass58_1381, Class76.aClass58_587,
					Class211.aClass58_1595, Class53.aClass58_431,
					Class98_Sub50.aClass58_4291, Class232.aClass58_1743,
					Class40.aClass58_369, Class151_Sub6.aClass58_4998,
					Class246_Sub4_Sub2.aClass58_6182, Class287.aClass58_2194,
					Class13.aClass58_161, Class64_Sub27.aClass58_3715,
					Class98_Sub22_Sub2.aClass58_5793,
					PacketParser.aClass58_5466, Class348.aClass58_2912,
					Class98_Sub41.aClass58_4199,
					Class48_Sub1_Sub2.aClass58_5520,
					InputStream_Sub1.aClass58_28, Class320.aClass58_2708,
					Class246_Sub3_Sub4_Sub5.aClass58_6264,
					Class39.aClass58_364, Class188.aClass58_1452,
					Class60.aClass58_476,
					Class246_Sub3_Sub4_Sub2_Sub2.aClass58_6516,
					GameObjectDefinitionLoader.aClass58_2514,
					Class98_Sub46_Sub8.aClass58_5996, Class150.aClass58_1212,
					Class98_Sub31_Sub2.aClass58_5838,
					Class224_Sub1.aClass58_5032, Class64_Sub1.aClass58_3637,
					Class8.aClass58_112, Class98_Sub46_Sub15.aClass58_6041,
					Class369.aClass58_3132, Class309.aClass58_2651,
					Class55.aClass58_433, Class98_Sub10_Sub15.aClass58_5615,
					GameObjectDefinition.aClass58_2993,
					Class98_Sub42.aClass58_4222, Class151_Sub8.aClass58_5011,
					Class77.aClass58_592, Class16.aClass58_191,
					Class246_Sub3_Sub2.aClass58_6151, Class299.aClass58_2495,
					Class64_Sub2.aClass58_3642, Class150.aClass58_1210,
					Class322.aClass58_2713, Class372.aClass58_3147,
					Class98_Sub10_Sub20.aClass58_5635, Class149.aClass58_1207,
					Class336.aClass58_2825,
					Class246_Sub3_Sub4_Sub3.aClass58_6457,
					Class284_Sub2_Sub2.aClass58_6197,
					Class98_Sub26.aClass58_4029, Class93_Sub3.aClass58_5493,
					Class217.aClass58_3406, Class98_Sub46_Sub6.aClass58_5975,
					Class27.aClass58_277, Class93_Sub1.aClass58_5482,
					Class283.aClass58_2139, Class64_Sub10.aClass58_3665,
					Class246_Sub3_Sub2_Sub1.aClass58_6335,
					Class98_Sub12.aClass58_3877, aa_Sub3.aClass58_3566,
					Class98_Sub10_Sub14.aClass58_5606, Class76.aClass58_589,
					Class27.aClass58_274, Class335.aClass58_2816,
					Class196.aClass58_1507, Class64_Sub2.aClass58_3645,
					Class339.aClass58_2844, Class44.aClass58_379,
					Class151_Sub6.aClass58_4997,
					Class98_Sub10_Sub14.aClass58_5608, Class65.aClass58_499,
					Class211.aClass58_1596, Class151_Sub6.aClass58_4999,
					Class3.aClass58_75, Class266.aClass58_1992,
					Class246_Sub3.aClass58_5086, Class146.aClass58_1179,
					Class159.aClass58_1253, Class98_Sub34.aClass58_4128,
					Class151_Sub5.aClass58_4992, Class98_Sub18.aClass58_3946,
					ReferenceTable.aClass58_2661, Class283.aClass58_2143,
					Class98_Sub46_Sub19.aClass58_6057, Class207.aClass58_1576,
					Class315.aClass58_3533, aa_Sub1.aClass58_3554,
					Class36.aClass58_344, Class308.aClass58_2581,
					Class98_Sub10_Sub28.aClass58_5697,
					Class246_Sub4_Sub1.aClass58_6166, Class77.aClass58_591,
					Class301.aClass58_2507, s_Sub1.aClass58_5205,
					Class213.aClass58_1609, Class15.aClass58_184,
					Class76_Sub2.aClass58_3731, Class69_Sub2.aClass58_5333,
					Class25.aClass58_266, Class284_Sub1.aClass58_5176,
					GameObjectDefinition.aClass58_2943, Class180.aClass58_3398,
					Class358.aClass58_3029, Class287.aClass58_2187,
					Class246_Sub3_Sub4_Sub4.aClass58_6487,
					Class59.aClass58_469, ByteBuffer.aClass58_3993,
					Class147.aClass58_1192, Class277.aClass58_2052,
					Exception_Sub1.aClass58_43, Class98_Sub47.aClass58_4270,
					Class64_Sub15.aClass58_3677, Class73.aClass58_3482,
					Class98_Sub6.aClass58_3844 });
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tfa.I(" + i + ')');
		}
	}

	static final Class98_Sub10 method3630(final int i, final int i_111_) {
		try {
			final int i_113_ = i;
			while_216_: do {
				while_215_: do {
					while_214_: do {
						while_213_: do {
							while_212_: do {
								while_211_: do {
									while_210_: do {
										while_209_: do {
											while_208_: do {
												while_207_: do {
													while_206_: do {
														while_205_: do {
															while_204_: do {
																while_203_: do {
																	while_202_: do {
																		while_201_: do {
																			while_200_: do {
																				while_199_: do {
																					while_198_: do {
																						while_197_: do {
																							while_196_: do {
																								while_195_: do {
																									while_194_: do {
																										while_193_: do {
																											while_192_: do {
																												while_191_: do {
																													while_190_: do {
																														while_189_: do {
																															while_188_: do {
																																while_187_: do {
																																	while_186_: do {
																																		while_185_: do {
																																			while_184_: do {
																																				while_183_: do {
																																					while_182_: do {
																																						while_181_: do {
																																							while_180_: do {
																																								while_179_: do {
																																									while_178_: do {
																																										do {
																																											if (i_113_ != 0) {
																																												if ((i_113_ ^ 0xffffffff) == -2) {
																																													break;
																																												}
																																												if (i_113_ == 2) {
																																													break while_178_;
																																												}
																																												if (i_113_ == 3) {
																																													break while_179_;
																																												}
																																												if (i_113_ == 4) {
																																													break while_180_;
																																												}
																																												if (i_113_ == 5) {
																																													break while_181_;
																																												}
																																												if (i_113_ == 6) {
																																													break while_182_;
																																												}
																																												if (i_113_ == 7) {
																																													break while_183_;
																																												}
																																												if ((i_113_ ^ 0xffffffff) == -9) {
																																													break while_184_;
																																												}
																																												if ((i_113_ ^ 0xffffffff) == -10) {
																																													break while_185_;
																																												}
																																												if (i_113_ == 10) {
																																													break while_186_;
																																												}
																																												if (i_113_ == 11) {
																																													break while_187_;
																																												}
																																												if (i_113_ == 12) {
																																													break while_188_;
																																												}
																																												if ((i_113_ ^ 0xffffffff) == -14) {
																																													break while_189_;
																																												}
																																												if ((i_113_ ^ 0xffffffff) == -15) {
																																													break while_190_;
																																												}
																																												if (i_113_ == 15) {
																																													break while_191_;
																																												}
																																												if (i_113_ == 16) {
																																													break while_192_;
																																												}
																																												if ((i_113_ ^ 0xffffffff) == -18) {
																																													break while_193_;
																																												}
																																												if ((i_113_ ^ 0xffffffff) == -19) {
																																													break while_194_;
																																												}
																																												if (i_113_ == 19) {
																																													break while_195_;
																																												}
																																												if (i_113_ == 20) {
																																													break while_196_;
																																												}
																																												if (i_113_ == 21) {
																																													break while_197_;
																																												}
																																												if ((i_113_ ^ 0xffffffff) == -23) {
																																													break while_198_;
																																												}
																																												if (i_113_ == 23) {
																																													break while_199_;
																																												}
																																												if ((i_113_ ^ 0xffffffff) == -25) {
																																													break while_200_;
																																												}
																																												if ((i_113_ ^ 0xffffffff) == -26) {
																																													break while_201_;
																																												}
																																												if (i_113_ == 26) {
																																													break while_202_;
																																												}
																																												if (i_113_ == 27) {
																																													break while_203_;
																																												}
																																												if (i_113_ == 28) {
																																													break while_204_;
																																												}
																																												if (i_113_ == 29) {
																																													break while_205_;
																																												}
																																												if ((i_113_ ^ 0xffffffff) == -31) {
																																													break while_206_;
																																												}
																																												if (i_113_ == 31) {
																																													break while_207_;
																																												}
																																												if (i_113_ == 32) {
																																													break while_208_;
																																												}
																																												if (i_113_ == 33) {
																																													break while_209_;
																																												}
																																												if ((i_113_ ^ 0xffffffff) == -35) {
																																													break while_210_;
																																												}
																																												if (i_113_ == 35) {
																																													break while_211_;
																																												}
																																												if ((i_113_ ^ 0xffffffff) == -37) {
																																													break while_212_;
																																												}
																																												if (i_113_ == 37) {
																																													break while_213_;
																																												}
																																												if ((i_113_ ^ 0xffffffff) == -39) {
																																													break while_214_;
																																												}
																																												if (i_113_ != 39) {
																																													break while_216_;
																																												}
																																												if (!client.aBoolean3553) {
																																													break while_215_;
																																												}
																																											}
																																											return new Class98_Sub10_Sub13();
																																										} while (false);
																																										return new Class98_Sub10_Sub22();
																																									} while (false);
																																									return new Class98_Sub10_Sub18();
																																								} while (false);
																																								return new Class98_Sub10_Sub3();
																																							} while (false);
																																							return new Class98_Sub10_Sub38();
																																						} while (false);
																																						return new Class98_Sub10_Sub24();
																																					} while (false);
																																					return new Class98_Sub10_Sub15();
																																				} while (false);
																																				return new Class98_Sub10_Sub7();
																																			} while (false);
																																			return new Class98_Sub10_Sub9();
																																		} while (false);
																																		return new Class98_Sub10_Sub11();
																																	} while (false);
																																	return new Class98_Sub10_Sub33();
																																} while (false);
																																return new Class98_Sub10_Sub4();
																															} while (false);
																															return new Class98_Sub10_Sub30();
																														} while (false);
																														return new Class98_Sub10_Sub8();
																													} while (false);
																													return new Class98_Sub10_Sub17();
																												} while (false);
																												return new Class98_Sub10_Sub26();
																											} while (false);
																											return new Class98_Sub10_Sub32();
																										} while (false);
																										return new Class98_Sub10_Sub6();
																									} while (false);
																									return new Class98_Sub10_Sub5_Sub1();
																								} while (false);
																								return new Class98_Sub10_Sub2();
																							} while (false);
																							return new Class98_Sub10_Sub29();
																						} while (false);
																						return new Class98_Sub10_Sub12();
																					} while (false);
																					return new Class98_Sub10_Sub39();
																				} while (false);
																				return new Class98_Sub10_Sub27();
																			} while (false);
																			return new Class98_Sub10_Sub16();
																		} while (false);
																		return new Class98_Sub10_Sub14();
																	} while (false);
																	return (new Class98_Sub10_Sub31());
																} while (false);
																return (new Class98_Sub10_Sub23());
															} while (false);
															return (new Class98_Sub10_Sub28());
														} while (false);
														return (new Class98_Sub10_Sub36());
													} while (false);
													return (new Class98_Sub10_Sub10());
												} while (false);
												return (new Class98_Sub10_Sub34());
											} while (false);
											return new Class98_Sub10_Sub37();
										} while (false);
										return new Class98_Sub10_Sub20();
									} while (false);
									return new Class98_Sub10_Sub35();
								} while (false);
								return new Class98_Sub10_Sub1();
							} while (false);
							return new Class98_Sub10_Sub25();
						} while (false);
						return new Class98_Sub10_Sub21();
					} while (false);
					return new Class98_Sub10_Sub19();
				} while (false);
				return new Class98_Sub10_Sub5();
			} while (false);
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tfa.A(" + i + ','
					+ i_111_ + ')');
		}
	}

	final void method3631(final int i, final int i_114_, final Class83 class83,
			final int i_115_) {
		try {
			final int i_116_ = Class370.anIntArray3135[i_114_];
			if (i == 12 && class83.method826(i_115_, 3) != null) {
				anIntArray2685[i_116_] = Class41.method366(i_115_, -2147483648);
				//System.out.println("Info " + anIntArray2685[i_116_]);
				method3633(i + 105);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.E(" + i + ','
					+ i_114_ + ',' + (class83 != null ? "{...}" : "null") + ','
					+ i_115_ + ')'));
		}
	}

	final void method3632(final int i, final int i_117_, final int i_118_) {
		try {
			if (i_118_ == -9) {
				anIntArray2683[i_117_] = i;
				method3633(87);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.H(" + i + ','
					+ i_117_ + ',' + i_118_ + ')'));
		}
	}

	private final void method3633(final int i) {
		try {
			final long[] ls = Class374.aLongArray3164;
			aLong2678 = -1L;
			aLong2678 = (aLong2678 >>> -9573176 ^ ls[(int) (0xffL & (aLong2678 ^ anInt2682 >> 1903458056))]);
			aLong2678 = (aLong2678 >>> 1694471240 ^ ls[(int) (0xffL & (anInt2682 ^ aLong2678))]);
			if (i <= 86) {
				method3635(false, false);
			}
			for (int i_119_ = 0; (i_119_ ^ 0xffffffff) > -13; i_119_++) {
				aLong2678 = (ls[(int) (0xffL & (aLong2678 ^ anIntArray2685[i_119_] >> -1026146760))] ^ aLong2678 >>> 1854597576);
				aLong2678 = (aLong2678 >>> 649681160 ^ ls[(int) (0xffL & (anIntArray2685[i_119_] >> -773668400 ^ aLong2678))]);
				aLong2678 = (aLong2678 >>> 519626696 ^ ls[(int) ((anIntArray2685[i_119_] >> -1074692952 ^ aLong2678) & 0xffL)]);
				aLong2678 = (ls[(int) (0xffL & (aLong2678 ^ anIntArray2685[i_119_]))] ^ aLong2678 >>> 690165768);
			}
			for (int i_120_ = 0; i_120_ < 5; i_120_++) {
				aLong2678 = (ls[(int) (0xffL & ((anIntArray2683[i_120_]) ^ aLong2678))] ^ aLong2678 >>> 376623304);
			}
			aLong2678 = (aLong2678 >>> -1793821816 ^ ls[(int) (((!aBoolean2681 ? 0
					: 1) ^ aLong2678) & 0xffL)]);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tfa.F(" + i + ')');
		}
	}

	final void method3634(final int i, final int i_121_,
			final Class205 class205, final int i_122_) {
		try {
			if (i_122_ != 1073741824) {
				aBoolean2681 = false;
			}
			if (i != -1) {
				if (class205.method2714(i, (byte) -118) != null) {
					anIntArray2685[i_121_] = Class41.method366(1073741824, i);
					method3633(i_122_ ^ 0x4000005d);
				}
			} else {
				anIntArray2685[i_121_] = 0;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.L(" + i + ','
					+ i_121_ + ',' + (class205 != null ? "{...}" : "null")
					+ ',' + i_122_ + ')'));
		}
	}

	final void method3635(final boolean bool, final boolean bool_123_) {
		try {
			aBoolean2681 = bool;
			if (bool_123_ != false) {
				method3628(null, null, null, null, 16, null, null, null, false,
						-109, null, null, null, false, 116, 111, 105, -25, 30,
						-75, null);
			}
			method3633(123);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tfa.D(" + bool
					+ ',' + bool_123_ + ')'));
		}
	}

	static final int method3636(final int i, final int i_124_) {
		if (Class40.anIntArrayArray367 != null) {
			return Class40.anIntArrayArray367[i][i_124_] & 0xffffff;
		}
		return 0;
	}

	public Class313() {
		/* empty */
	}
}
