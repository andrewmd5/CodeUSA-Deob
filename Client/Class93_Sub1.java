/* Class93_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class93_Sub1 extends Class93 {
	static int anInt5477 = 0;
	int anInt5478;
	static boolean aBoolean5479 = true;
	int anInt5480;
	int anInt5481;
	static IncomingOpcode aClass58_5482 = new IncomingOpcode(62, -1);
	int anInt5483;
	int anInt5484;
	int anInt5485;
	static int anInt5486 = 0;
	static int[][] anIntArrayArray5487 = { { 6, 6 }, { 6, 6 }, { 6, 5, 5 },
			{ 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 },
			{ 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 },
			{ 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 },
			{ 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
	static int anInt5488 = 2;
	static int anInt5489;

	public static void method902(int i) {
		try {
			anIntArrayArray5487 = null;
			if (i != 2)
				method902(45);
			aClass58_5482 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ij.I(" + i + ')');
		}
	}

	static final int method903(byte i) {
		try {
			if ((Class16.anInt196 ^ 0xffffffff) == -1) {
				Class102.aClass102_862.method1707((byte) 1, new Class54(
						"jaclib"));
				if (Class102.aClass102_862.method1709(107).method51((byte) 127) != 100)
					return 1;
				if (!((Class54) Class102.aClass102_862.method1709(94))
						.method504(true))
					Class315.aClient3529.method82(-21568);
				Class16.anInt196 = 1;
			}
			if ((Class16.anInt196 ^ 0xffffffff) == -2) {
				Class194.aClass102Array1496 = Class102.method1704(4);
				Class102.aClass102_860.method1707((byte) 1, new PlayerUpdate(
						Class253.aClass207_1932));
				Class102.aClass102_863.method1707((byte) 1,
						new Class54("jaggl"));
				Class102.aClass102_864.method1707((byte) 1,
						new Class54("jagdx"));
				Class102.aClass102_865.method1707((byte) 1, new Class54(
						"jagmisc"));
				Class102.aClass102_866
						.method1707((byte) 1, new Class54("sw3d"));
				Class102.aClass102_867
						.method1707((byte) 1, new Class54("hw3d"));
				Class102.aClass102_868.method1707((byte) 1, new Class54(
						"jagtheora"));
				Class102.aClass102_869.method1707((byte) 1, new PlayerUpdate(
						Class212.aClass207_1603));
				Class102.aClass102_870.method1707((byte) 1, new PlayerUpdate(
						Class64_Sub20.aClass207_3695));
				Class102.aClass102_871.method1707((byte) 1, new PlayerUpdate(
						client.aClass207_3549));
				Class102.aClass102_872.method1707((byte) 1, new PlayerUpdate(
						Class375.aClass207_3167));
				Class102.aClass102_873.method1707((byte) 1, new PlayerUpdate(
						Class98_Sub10_Sub24.aClass207_5668));
				Class102.aClass102_874.method1707((byte) 1, new PlayerUpdate(
						Class234.aClass207_1751));
				Class102.aClass102_875.method1707((byte) 1, new PlayerUpdate(
						Class208.aClass207_1581));
				// could be anim loader.
				Class102.aClass102_876.method1707((byte) 1, new PlayerUpdate(
						Class246_Sub3.ANIMATION_INDEX));
				Class102.aClass102_877.method1707((byte) 1, new PlayerUpdate(
						PlayerUpdateMask.aClass207_525));
				Class102.aClass102_878.method1707((byte) 1, new PlayerUpdate(
						Class98_Sub46_Sub19.aClass207_6067));
				Class102.aClass102_879.method1707((byte) 1, new PlayerUpdate(
						Class81.aClass207_622));
				Class102.aClass102_880.method1707((byte) 1, new PlayerUpdate(
						Class322.aClass207_2714));
				Class102.aClass102_881.method1707((byte) 1, new PlayerUpdate(
						Class245.aClass207_1864));
				Class102.aClass102_882.method1707((byte) 1, new PlayerUpdate(
						Class111_Sub3.aClass207_4715));
				Class102.aClass102_883.method1707((byte) 1, new Class180(
						Class98_Sub40.aClass207_4198, "huffman"));
				Class102.aClass102_884.method1707((byte) 1, new PlayerUpdate(
						Class64_Sub20.aClass207_3697));
				Class102.aClass102_885.method1707((byte) 1, new PlayerUpdate(
						Class52.aClass207_3494));
				Class102.aClass102_886.method1707((byte) 1, new PlayerUpdate(
						Class36.aClass207_348));
				Class102.aClass102_887.method1707((byte) 1, new Class217(
						Class257.aClass207_1947, "details"));
				for (int i_0_ = 0; i_0_ < Class194.aClass102Array1496.length; i_0_++) {
					if (Class194.aClass102Array1496[i_0_].method1709(114) == null)
						throw new RuntimeException();
				}
				int i_1_ = 0;
				Class102[] class102s = Class194.aClass102Array1496;
				for (int i_2_ = 0; class102s.length > i_2_; i_2_++) {
					Class102 class102 = class102s[i_2_];
					int i_3_ = class102.method1705(76);
					int i_4_ = class102.method1709(94).method51((byte) 127);
					i_1_ += i_4_ * i_3_ / 100;
				}
				Class16.anInt196 = 2;
				Class186.anInt3431 = i_1_;
			}
			if (Class194.aClass102Array1496 == null)
				return 100;
			int i_5_ = 0;
			if (i > -116)
				method902(-68);
			int i_6_ = 0;
			boolean bool = true;
			Class102[] class102s = Class194.aClass102Array1496;
			for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (class102s.length ^ 0xffffffff); i_7_++) {
				Class102 class102 = class102s[i_7_];
				int i_8_ = class102.method1705(68);
				int i_9_ = class102.method1709(97).method51((byte) 127);
				i_6_ += i_9_ * i_8_ / 100;
				if (i_9_ < 100)
					bool = false;
				i_5_ += i_8_;
			}
			if (bool) {
				if (!((Class54) Class102.aClass102_865.method1709(118))
						.method504(true))
					Class315.aClient3529.method80(0);
				if (!((Class54) Class102.aClass102_868.method1709(-83))
						.method504(true))
					Class372.aBoolean3152 = Class315.aClient3529.method83(true);
				Class194.aClass102Array1496 = null;
			}
			i_6_ -= Class186.anInt3431;
			i_5_ -= Class186.anInt3431;
			int i_10_ = i_5_ <= 0 ? 100 : i_6_ * 100 / i_5_;
			if (!bool && i_10_ > 99)
				i_10_ = 99;
			return i_10_;// mysticflow
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ij.H(" + i + ')');
		}
	}

	Class93_Sub1(Class63 class63, Class110 class110, int i, int i_11_,
			int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_,
			int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		super(class63, class110, i, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_);
		try {
			((Class93_Sub1) this).anInt5478 = i_21_;
			((Class93_Sub1) this).anInt5484 = i_22_;
			((Class93_Sub1) this).anInt5480 = i_18_;
			((Class93_Sub1) this).anInt5485 = i_19_;
			((Class93_Sub1) this).anInt5483 = i_17_;
			((Class93_Sub1) this).anInt5481 = i_20_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ij.<init>("
					+ (class63 != null ? "{...}" : "null") + ','
					+ (class110 != null ? "{...}" : "null") + ',' + i + ','
					+ i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ','
					+ i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ','
					+ i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ')'));
		}
	}

	static final void method904(byte i) {
		try {
			if (Class208.anIntArray1579 == null) {
				Class208.anIntArray1579 = new int[65536];
				double d = 0.7 + (-0.015 + Math.random() * 0.03);
				for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > -65537; i_24_++) {
					double d_25_ = ((double) (0x3f & i_24_ >> -239388310) / 64.0 + 0.0078125);
					double d_26_ = (0.0625 + (double) ((0x3a8 & i_24_) >> 770038727) / 8.0);
					double d_27_ = (double) (0x7f & i_24_) / 128.0;
					double d_28_ = d_27_;
					double d_29_ = d_27_;
					double d_30_ = d_27_;
					if (d_26_ != 0.0) {
						double d_31_;
						if (!(d_27_ < 0.5))
							d_31_ = -(d_27_ * d_26_) + (d_26_ + d_27_);
						else
							d_31_ = d_27_ * (d_26_ + 1.0);
						double d_32_ = 2.0 * d_27_ - d_31_;
						double d_33_ = 0.3333333333333333 + d_25_;
						if (d_33_ > 1.0)
							d_33_--;
						double d_34_ = d_25_;
						double d_35_ = -0.3333333333333333 + d_25_;
						if (d_35_ < 0.0)
							d_35_++;
						if (!(d_34_ * 6.0 < 1.0)) {
							if (2.0 * d_34_ < 1.0)
								d_29_ = d_31_;
							else if (!(3.0 * d_34_ < 2.0))
								d_29_ = d_32_;
							else
								d_29_ = d_32_
										+ 6.0
										* ((d_31_ - d_32_) * (0.6666666666666666 - d_34_));
						} else
							d_29_ = d_32_ + 6.0 * (d_31_ - d_32_) * d_34_;
						if (!(6.0 * d_33_ < 1.0)) {
							if (!(2.0 * d_33_ < 1.0)) {
								if (3.0 * d_33_ < 2.0)
									d_28_ = (6.0 * ((-d_32_ + d_31_) * (-d_33_ + 0.6666666666666666)) + d_32_);
								else
									d_28_ = d_32_;
							} else
								d_28_ = d_31_;
						} else
							d_28_ = d_33_ * (6.0 * (-d_32_ + d_31_)) + d_32_;
						if (!(d_35_ * 6.0 < 1.0)) {
							if (d_35_ * 2.0 < 1.0)
								d_30_ = d_31_;
							else if (3.0 * d_35_ < 2.0)
								d_30_ = d_32_
										+ ((-d_32_ + d_31_)
												* (-d_35_ + 0.6666666666666666) * 6.0);
							else
								d_30_ = d_32_;
						} else
							d_30_ = d_32_ + d_35_ * (6.0 * (-d_32_ + d_31_));
					}
					d_28_ = Math.pow(d_28_, d);
					d_29_ = Math.pow(d_29_, d);
					d_30_ = Math.pow(d_30_, d);
					int i_36_ = (int) (256.0 * d_28_);
					int i_37_ = (int) (d_29_ * 256.0);
					int i_38_ = (int) (256.0 * d_30_);
					int i_39_ = ((i_36_ << -13557424) + ((i_37_ << 394664072) + i_38_));
					Class208.anIntArray1579[i_24_] = i_39_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ij.F(" + i + ')');
		}
	}

	static final boolean method905(int i, int i_40_, int i_41_) {
		try {
			if (i_40_ > -35)
				anInt5477 = -88;
			if (!((0x70000 & i ^ 0xffffffff) != -1 | IncomingOpcode.method523(
					i_41_, -1, i)) && !TextureDefinition.method2919(-60, i, i_41_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ij.G(" + i + ','
					+ i_40_ + ',' + i_41_ + ')'));
		}
	}

	static final Class348[] method906(byte i) {
		try {
			if (i <= 11)
				return null;
			return (new Class348[] { Class151_Sub9.aClass348_5023,
					Class77_Sub1.aClass348_3801, Class4.aClass348_82,
					Class306.aClass348_2565, Class42_Sub3.aClass348_5363,
					Class98_Sub36.aClass348_4156, Class186.aClass348_3433,
					aa_Sub3.aClass348_3573, Class359.aClass348_3046,
					Class151_Sub7.aClass348_5008, Class218.aClass348_1630,
					Class207.aClass348_1569, Class98_Sub5_Sub1.aClass348_5534,
					TextureDefinition.aClass348_1834 });
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ij.D(" + i + ')');
		}
	}

	public Class113 method70(int i) {
		try {
			if (i != 30778)
				method904((byte) 69);
			return Class98_Sub44.aClass113_4245;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ij.A(" + i + ')');
		}
	}

	static final void method907(int i, int i_42_, int i_43_) {
		try {
			Class151_Sub7.anInt5005 = i_43_;
			Class149.anInt1208 = i_42_;
			int i_44_ = -96 / ((-76 - i) / 49);
			if (Class98_Sub46.anInt4261 == 0) {
				aa_Sub1.anInt3556 = 2 * Class377.anInt3183
						+ Class151_Sub7.anInt5005;
				Class48_Sub1_Sub2.anInt5519 = Class111_Sub3.anInt4701 * 2
						+ Class149.anInt1208;
			} else if (Class98_Sub46.anInt4261 != 1) {
				if (Class98_Sub46.anInt4261 == 2) {
					Class48_Sub1_Sub2.anInt5519 = Class149.anInt1208;
					aa_Sub1.anInt3556 = Class151_Sub7.anInt5005;
				}
			} else {
				Class191.anInt1477 = (Class98_Sub40.anInt4194 + (Class151_Sub7.anInt5005
						/ Class197.anInt1513 + 2));
				Class63.anInt493 = (Class149.anInt1208
						/ Class98_Sub10_Sub38.anInt5761 + (2 + Class151.anInt1214));
				aa_Sub1.anInt3556 = Class197.anInt1513 * Class191.anInt1477;
				Class48_Sub1_Sub2.anInt5519 = Class63.anInt493
						* Class98_Sub10_Sub38.anInt5761;
				Class377.anInt3183 = (-Class151_Sub7.anInt5005
						+ aa_Sub1.anInt3556 >> 881154753);
				Class111_Sub3.anInt4701 = (-Class149.anInt1208
						+ Class48_Sub1_Sub2.anInt5519 >> 1217660993);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ij.E(" + i + ','
					+ i_42_ + ',' + i_43_ + ')'));
		}
	}
}
