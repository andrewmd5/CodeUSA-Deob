/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class175 {
	private int anInt1354;
	private final int anInt1355;
	private static Class332 aClass332_1356;
	private static AbstractModel aClass146_1357;
	private int anInt1358;
	private final int anInt1359;
	private int anInt1360;
	int anInt1361;
	private int anInt1362;
	private static Class332 aClass332_1363;
	private final int anInt1364;
	private final int anInt1365;
	private final int anInt1366;
	private static int[] anIntArray1367 = new int[4];
	private Class332 aClass332_1368;
	private final int anInt1369;
	private final int anInt1370;
	private final boolean aBoolean1371;

	private static final void method2568(final ha var_ha) {
		if (aClass332_1356 == null) {
			final int[] is = new int[16384];
			final int[] is_0_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_1_ = 64 - i;
				i_1_ *= i_1_;
				final int i_2_ = 128 - i - 1;
				final int i_3_ = i * 128;
				final int i_4_ = i_2_ * 128;
				for (int i_5_ = 0; i_5_ < 64; i_5_++) {
					int i_6_ = 64 - i_5_;
					i_6_ *= i_6_;
					final int i_7_ = 128 - i_5_ - 1;
					int i_8_ = 256 - (i_6_ + i_1_ << 8) / 4096;
					i_8_ = i_8_ * 16 * 192 / 1536;
					if (i_8_ < 0) {
						i_8_ = 0;
					} else if (i_8_ > 255) {
						i_8_ = 255;
					}
					final int i_9_ = i_8_ / 2;
					is_0_[i_3_ + i_5_] = is_0_[i_3_ + i_7_] = is_0_[i_4_ + i_5_] = is_0_[i_4_
							+ i_7_] = ~0xffffff | i_8_ << 16;
					is[i_3_ + i_5_] = is[i_3_ + i_7_] = is[i_4_ + i_5_] = is[i_4_
							+ i_7_] = 127 - i_9_ << 24 | 0xffffff;
				}
			}
			aClass332_1356 = var_ha.method1748(-7962, 0, 128, 128, is_0_, 128);
			aClass332_1363 = var_ha.method1748(-7962, 0, 128, 128, is, 128);
		}
	}

	private final boolean method2569(final ha var_ha,
			final Class175 class175_10_) {
		if (aClass332_1368 == null) {
			if (anInt1359 == 0) {
				if (Class98_Sub10_Sub8.aD5578.method8(119, anInt1366)) {
					final int[] is = Class98_Sub10_Sub8.aD5578.method13(117,
							anInt1354, anInt1366, 0.7F, false, anInt1354);
					aClass332_1368 = var_ha.method1748(-7962, 0, anInt1354,
							anInt1354, is, anInt1354);
				}
			} else if (anInt1359 == 2) {
				method2572(var_ha, class175_10_);
			} else if (anInt1359 == 1) {
				method2576(var_ha, class175_10_);
			}
		}
		if (aClass332_1368 == null) {
			return false;
		}
		return true;
	}

	final void method2570() {
		aClass332_1368 = null;
	}

	public static void method2571() {
		aClass146_1357 = null;
		aClass332_1363 = null;
		aClass332_1356 = null;
		anIntArray1367 = null;
	}

	private final void method2572(final ha var_ha, final Class175 class175_11_) {
		final Model model = RSModelLoader.createModel(0, -9252,
				Class98_Sub10_Sub39.aClass207_5773, anInt1366);
		if (model != null) {
			var_ha.K(anIntArray1367);
			var_ha.KA(0, 0, anInt1354, anInt1354);
			var_ha.aa(0, 0, anInt1354, anInt1354, 0, 0);
			int i = 0;
			int i_12_ = 0;
			int i_13_ = 256;
			if (class175_11_ != null) {
				if (class175_11_.aBoolean1371) {
					i = -class175_11_.anInt1370;
					i_12_ = -class175_11_.anInt1355;
					i_13_ = -class175_11_.anInt1364;
				} else {
					i = anInt1370 - class175_11_.anInt1370;
					i_12_ = anInt1355 - class175_11_.anInt1355;
					i_13_ = anInt1364 - class175_11_.anInt1364;
				}
			}
			if (anInt1358 != 0) {
				final int i_14_ = -anInt1358 & 0x3fff;
				final int i_15_ = Class284_Sub2_Sub2.anIntArray6200[i_14_];
				final int i_16_ = Class284_Sub2_Sub2.anIntArray6202[i_14_];
				final int i_17_ = i_12_ * i_16_ - i_13_ * i_15_ >> 14;
				i_13_ = i_12_ * i_15_ + i_13_ * i_16_ >> 14;
				i_12_ = i_17_;
			}
			if (anInt1362 != 0) {
				final int i_18_ = -anInt1362 & 0x3fff;
				final int i_19_ = Class284_Sub2_Sub2.anIntArray6200[i_18_];
				final int i_20_ = Class284_Sub2_Sub2.anIntArray6202[i_18_];
				final int i_21_ = i_13_ * i_19_ + i * i_20_ >> 14;
				i_13_ = i_13_ * i_20_ - i * i_19_ >> 14;
				i = i_21_;
			}
			var_ha.xa(1.0F);
			var_ha.ZA(16777215, 1.0F, 1.0F, i, i_12_, i_13_);
			final AbstractModel abstractModel = var_ha.method1790(model, 2048, 0, 64,
					768);
			final int i_22_ = abstractModel.RA() - abstractModel.V();
			final int i_23_ = abstractModel.EA() - abstractModel.fa();
			final int i_24_ = abstractModel.V() + i_22_ / 2;
			final int i_25_ = abstractModel.fa() + i_23_ / 2;
			final int i_26_ = i_22_ > i_23_ ? i_22_ : i_23_;
			var_ha.DA(i_24_, i_25_, i_26_, i_26_);
			var_ha.a(var_ha.method1821());
			final Class111 class111 = var_ha.method1793();
			class111.method2100(0, 0, var_ha.i() - abstractModel.HA());
			abstractModel.method2329(class111, null, var_ha.i(), 1);
			aClass332_1368 = var_ha
					.method1797(0, 0, anInt1354, anInt1354, true);
			aClass332_1368.method3742(0, 0, 3);
			var_ha.KA(anIntArray1367[0], anIntArray1367[1], anIntArray1367[2],
					anIntArray1367[3]);
		}
	}

	final void method2573(final ha var_ha, final int i, final int i_27_,
			final int i_28_, final int i_29_, final int i_30_, final int i_31_) {
		if (aClass332_1368 != null) {
			int i_32_ = anInt1358 - i_30_ & 0x3fff;
			int i_33_ = anInt1362 - i_31_ & 0x3fff;
			if (i_33_ > 8192) {
				i_33_ -= 16384;
			}
			if (i_32_ > 8192) {
				i_32_ -= 16384;
			}
			final int i_34_ = i_32_ * i_29_ / 4096 + (i_29_ - anInt1360) / 2;
			final int i_35_ = i_33_ * i_29_ / -4096 + (i_28_ - anInt1360) / 2;
			if (i_34_ < i_29_ && i_34_ + anInt1360 > 0 && i_35_ < i_28_
					&& i_35_ + anInt1360 > 0) {
				aClass332_1368.method3726(i_35_ + i, i_34_ + i_27_, anInt1360,
						anInt1360);
			}
		}
	}

	private static final void method2574(final ha var_ha) {
		if (aClass146_1357 == null) {
			final Model model = new Model(580, 1104, 1);
			model.method2601((byte) 0, (byte) 0, (short) 0, (short) 0,
					(short) 1024, (short) 1024, (short) 1024, (byte) 123,
					(short) 32767, (byte) 0);
			model.method2599(14418, 0, 128, 0);
			model.method2599(14418, 0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				final int i_36_ = i * 8192 / 24;
				final int i_37_ = Class284_Sub2_Sub2.anIntArray6200[i_36_];
				final int i_38_ = Class284_Sub2_Sub2.anIntArray6202[i_36_];
				for (int i_39_ = 1; i_39_ < 24; i_39_++) {
					final int i_40_ = i_39_ * 8192 / 24;
					final int i_41_ = Class284_Sub2_Sub2.anIntArray6202[i_40_] >> 7;
					final int i_42_ = (Class284_Sub2_Sub2.anIntArray6200[i_40_]
							* i_37_ >> 21);
					final int i_43_ = (Class284_Sub2_Sub2.anIntArray6200[i_40_]
							* i_38_ >> 21);
					model.method2599(14418, i_43_, i_41_, -i_42_);
				}
				if (i > 0) {
					int i_44_ = i * 23 + 2;
					int i_45_ = i_44_ - 23;
					model.method2594((byte) 0, (short) 127, (short) 0,
							(byte) 0, false, i_44_, 0, (byte) 0, i_45_);
					for (int i_46_ = 1; i_46_ < 23; i_46_++) {
						final int i_47_ = i_45_ + 1;
						final int i_48_ = i_44_ + 1;
						model.method2594((byte) 0, (short) 127, (short) 0,
								(byte) 0, false, i_44_, i_45_, (byte) 0, i_47_);
						model.method2594((byte) 0, (short) 127, (short) 0,
								(byte) 0, false, i_44_, i_47_, (byte) 0, i_48_);
						i_45_ = i_47_;
						i_44_ = i_48_;
					}
					model.method2594((byte) 0, (short) 127, (short) 0,
							(byte) 0, false, 1, i_44_, (byte) 0, i_45_);
				}
			}
			model.maxDepth = model.numVertices;
			model.triangleSkinValues = null;
			model.vertexSkins = null;
			model.trianglePriorities = null;
			aClass146_1357 = var_ha.method1790(model, 51200, 33, 64, 768);
		}
	}

	final boolean method2575(final int i, final int i_49_, final int i_50_,
			final int i_51_) {
		int i_52_;
		int i_53_;
		int i_54_;
		if (!aBoolean1371) {
			i_52_ = anInt1370 - i;
			i_53_ = anInt1355 - i_49_;
			i_54_ = anInt1364 - i_50_;
			anInt1361 = (int) Math.sqrt(i_52_ * i_52_ + i_53_ * i_53_ + i_54_
					* i_54_);
			if (anInt1361 == 0) {
				anInt1361 = 1;
			}
			i_52_ = (i_52_ << 8) / anInt1361;
			i_53_ = (i_53_ << 8) / anInt1361;
			i_54_ = (i_54_ << 8) / anInt1361;
		} else {
			anInt1361 = 1073741823;
			i_52_ = anInt1370;
			i_53_ = anInt1355;
			i_54_ = anInt1364;
		}
		final int i_55_ = (int) (Math.sqrt(i_52_ * i_52_ + i_53_ * i_53_
				+ i_54_ * i_54_) * 256.0);
		if (i_55_ > 128) {
			i_52_ = (i_52_ << 16) / i_55_;
			i_53_ = (i_53_ << 16) / i_55_;
			i_54_ = (i_54_ << 16) / i_55_;
			anInt1360 = anInt1365 * i_51_ / (aBoolean1371 ? 1024 : anInt1361);
		} else {
			anInt1360 = 0;
		}
		if (anInt1360 < 8) {
			aClass332_1368 = null;
			return false;
		}
		int i_56_ = Class48.method453(423660257, anInt1360);
		if (i_56_ > i_51_) {
			i_56_ = Class23.method282(-123, i_51_);
		}
		if (i_56_ > 512) {
			i_56_ = 512;
		}
		if (i_56_ != anInt1354) {
			anInt1354 = i_56_;
		}
		anInt1358 = (int) (Math.asin(i_53_ / 256.0F) * 2607.5945876176133) & 0x3fff;
		anInt1362 = (int) (Math.atan2(i_52_, -i_54_) * 2607.5945876176133) & 0x3fff;
		aClass332_1368 = null;
		return true;
	}

	private final void method2576(final ha var_ha, final Class175 class175_57_) {
		method2574(var_ha);
		method2568(var_ha);
		var_ha.K(anIntArray1367);
		var_ha.KA(0, 0, anInt1354, anInt1354);
		var_ha.ya();
		var_ha.aa(0, 0, anInt1354, anInt1354, ~0xffffff | anInt1369, 0);
		int i = 0;
		int i_58_ = 0;
		int i_59_ = 256;
		if (class175_57_ != null) {
			if (class175_57_.aBoolean1371) {
				i = -class175_57_.anInt1370;
				i_58_ = -class175_57_.anInt1355;
				i_59_ = -class175_57_.anInt1364;
			} else {
				i = class175_57_.anInt1370 - anInt1370;
				i_58_ = class175_57_.anInt1355 - anInt1355;
				i_59_ = class175_57_.anInt1364 - anInt1364;
			}
		}
		if (anInt1358 != 0) {
			final int i_60_ = Class284_Sub2_Sub2.anIntArray6200[anInt1358];
			final int i_61_ = Class284_Sub2_Sub2.anIntArray6202[anInt1358];
			final int i_62_ = i_58_ * i_61_ - i_59_ * i_60_ >> 14;
			i_59_ = i_58_ * i_60_ + i_59_ * i_61_ >> 14;
			i_58_ = i_62_;
		}
		if (anInt1362 != 0) {
			final int i_63_ = Class284_Sub2_Sub2.anIntArray6200[anInt1362];
			final int i_64_ = Class284_Sub2_Sub2.anIntArray6202[anInt1362];
			final int i_65_ = i_59_ * i_63_ + i * i_64_ >> 14;
			i_59_ = i_59_ * i_64_ - i * i_63_ >> 14;
			i = i_65_;
		}
		final AbstractModel abstractModel = aClass146_1357.method2341((byte) 0, 51200,
				true);
		abstractModel.aa((short) 0, (short) anInt1366);
		var_ha.xa(1.0F);
		var_ha.ZA(16777215, 1.0F, 1.0F, i, i_58_, i_59_);
		int i_66_ = 1024 * anInt1354 / (abstractModel.RA() - abstractModel.V());
		if (anInt1369 != 0) {
			i_66_ = i_66_ * 13 / 16;
		}
		var_ha.DA(anInt1354 / 2, anInt1354 / 2, i_66_, i_66_);
		var_ha.a(var_ha.method1821());
		final Class111 class111 = var_ha.method1821();
		class111.method2100(0, 0, var_ha.i() - abstractModel.HA());
		abstractModel.method2329(class111, null, 1024, 1);
		final int i_67_ = anInt1354 * 13 / 16;
		final int i_68_ = (anInt1354 - i_67_) / 2;
		aClass332_1363.method3727(i_68_, i_68_, i_67_, i_67_, 0, ~0xffffff
				| anInt1369, 1);
		aClass332_1368 = var_ha.method1797(0, 0, anInt1354, anInt1354, true);
		var_ha.ya();
		var_ha.aa(0, 0, anInt1354, anInt1354, 0, 0);
		aClass332_1356.method3727(0, 0, anInt1354, anInt1354, 1, 0, 0);
		aClass332_1368.method3742(0, 0, 0);
		var_ha.KA(anIntArray1367[0], anIntArray1367[1], anIntArray1367[2],
				anIntArray1367[3]);
	}

	final boolean method2577(final ha var_ha, final Class175 class175_69_) {
		if (aClass332_1368 == null && !method2569(var_ha, class175_69_)) {
			return false;
		}
		return true;
	}

	static final void method2578() {
		aClass146_1357 = null;
		aClass332_1356 = null;
	}

	Class175(final int i, final int i_70_, final int i_71_, final int i_72_,
			final int i_73_, final int i_74_, final int i_75_,
			final boolean bool) {
		anInt1370 = i_71_;
		anInt1355 = i_72_;
		anInt1364 = i_73_;
		aBoolean1371 = bool;
		anInt1366 = i_70_;
		anInt1369 = i_75_;
		anInt1365 = i_74_;
		anInt1359 = i;
	}
}
