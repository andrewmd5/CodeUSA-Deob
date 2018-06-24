/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class56 {
	private static float[] aFloatArray445 = { 1.0649863E-7F, 1.1341951E-7F,
			1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F,
			1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F,
			1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F,
			2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F,
			3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F,
			4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F,
			5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F,
			7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F,
			9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F,
			1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F,
			1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F,
			1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F,
			2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F,
			3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F,
			4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F,
			5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F,
			6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F,
			8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F,
			1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F,
			1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F,
			1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F,
			2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F,
			3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F,
			3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F,
			5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F,
			6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F,
			8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F,
			1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F,
			1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F,
			1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F,
			2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F,
			2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F,
			3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F,
			4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F,
			6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F,
			8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F,
			0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F,
			0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F,
			0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F,
			0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F,
			0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F,
			0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F,
			0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F,
			0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F,
			0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F,
			0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F,
			0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F,
			0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F,
			0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F,
			0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F,
			0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F,
			0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F,
			0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F,
			0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F,
			0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F,
			0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F,
			0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F,
			0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F,
			0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F,
			0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F,
			0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
	private final int[] anIntArray446;
	private final int[] anIntArray447;
	private final int[] anIntArray448;
	private final int[] anIntArray449;
	private static int[] anIntArray450;
	private static boolean[] aBooleanArray451;
	private static int[] anIntArray452;
	private final int[][] anIntArrayArray453;
	private final int anInt454;
	private final int[] anIntArray455;
	private static int[] anIntArray456 = { 256, 128, 86, 64 };

	final boolean method510() {
		final boolean bool = Class98_Sub13.method1134() != 0;
		if (!bool) {
			return false;
		}
		final int i = anIntArray446.length;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			anIntArray452[i_0_] = anIntArray446[i_0_];
		}
		final int i_1_ = anIntArray456[anInt454 - 1];
		final int i_2_ = Class48_Sub2_Sub1.method474(i_1_ - 1, (byte) 31);
		anIntArray450[0] = Class98_Sub13.method1138(i_2_);
		anIntArray450[1] = Class98_Sub13.method1138(i_2_);
		int i_3_ = 2;
		for (int i_4_ = 0; i_4_ < anIntArray449.length; i_4_++) {
			final int i_5_ = anIntArray449[i_4_];
			final int i_6_ = anIntArray455[i_5_];
			final int i_7_ = anIntArray447[i_5_];
			final int i_8_ = (1 << i_7_) - 1;
			int i_9_ = 0;
			if (i_7_ > 0) {
				i_9_ = Class98_Sub13.aClass71Array3885[anIntArray448[i_5_]]
						.method714();
			}
			for (int i_10_ = 0; i_10_ < i_6_; i_10_++) {
				final int i_11_ = anIntArrayArray453[i_5_][i_9_ & i_8_];
				i_9_ >>>= i_7_;
				anIntArray450[i_3_++] = (i_11_ >= 0 ? Class98_Sub13.aClass71Array3885[i_11_]
						.method714() : 0);
			}
		}
		return true;
	}

	private final void method511(final int i, final int i_12_, int i_13_,
			final int i_14_, final float[] fs, final int i_15_) {
		final int i_16_ = i_14_ - i_12_;
		final int i_17_ = i_13_ - i;
		int i_18_ = i_16_ < 0 ? -i_16_ : i_16_;
		final int i_19_ = i_16_ / i_17_;
		int i_20_ = i_12_;
		int i_21_ = 0;
		final int i_22_ = i_16_ < 0 ? i_19_ - 1 : i_19_ + 1;
		i_18_ = i_18_ - (i_19_ < 0 ? -i_19_ : i_19_) * i_17_;
		fs[i] *= aFloatArray445[i_20_];
		if (i_13_ > i_15_) {
			i_13_ = i_15_;
		}
		for (int i_23_ = i + 1; i_23_ < i_13_; i_23_++) {
			i_21_ += i_18_;
			if (i_21_ >= i_17_) {
				i_21_ -= i_17_;
				i_20_ += i_22_;
			} else {
				i_20_ += i_19_;
			}
			fs[i_23_] *= aFloatArray445[i_20_];
		}
	}

	private static final int method512(final int[] is, final int i) {
		final int i_24_ = is[i];
		int i_25_ = -1;
		int i_26_ = -2147483648;
		for (int i_27_ = 0; i_27_ < i; i_27_++) {
			final int i_28_ = is[i_27_];
			if (i_28_ < i_24_ && i_28_ > i_26_) {
				i_25_ = i_27_;
				i_26_ = i_28_;
			}
		}
		return i_25_;
	}

	final void method513(final float[] fs, final int i) {
		final int i_29_ = anIntArray446.length;
		final int i_30_ = anIntArray456[anInt454 - 1];
		aBooleanArray451[0] = aBooleanArray451[1] = true;
		for (int i_31_ = 2; i_31_ < i_29_; i_31_++) {
			final int i_32_ = method512(anIntArray452, i_31_);
			final int i_33_ = method516(anIntArray452, i_31_);
			final int i_34_ = method517(anIntArray452[i_32_],
					anIntArray450[i_32_], anIntArray452[i_33_],
					anIntArray450[i_33_], anIntArray452[i_31_]);
			final int i_35_ = anIntArray450[i_31_];
			final int i_36_ = i_30_ - i_34_;
			final int i_37_ = i_34_;
			final int i_38_ = (i_36_ < i_37_ ? i_36_ : i_37_) << 1;
			if (i_35_ != 0) {
				aBooleanArray451[i_32_] = aBooleanArray451[i_33_] = true;
				aBooleanArray451[i_31_] = true;
				if (i_35_ >= i_38_) {
					anIntArray450[i_31_] = (i_36_ > i_37_ ? i_35_ - i_37_
							+ i_34_ : i_34_ - i_35_ + i_36_ - 1);
				} else {
					anIntArray450[i_31_] = ((i_35_ & 0x1) != 0 ? i_34_
							- (i_35_ + 1) / 2 : i_34_ + i_35_ / 2);
				}
			} else {
				aBooleanArray451[i_31_] = false;
				anIntArray450[i_31_] = i_34_;
			}
		}
		method514(0, i_29_ - 1);
		int i_39_ = 0;
		int i_40_ = anIntArray450[0] * anInt454;
		for (int i_41_ = 1; i_41_ < i_29_; i_41_++) {
			if (aBooleanArray451[i_41_]) {
				final int i_42_ = anIntArray452[i_41_];
				final int i_43_ = anIntArray450[i_41_] * anInt454;
				method511(i_39_, i_40_, i_42_, i_43_, fs, i);
				if (i_42_ >= i) {
					return;
				}
				i_39_ = i_42_;
				i_40_ = i_43_;
			}
		}
		final float f = aFloatArray445[i_40_];
		for (int i_44_ = i_39_; i_44_ < i; i_44_++) {
			fs[i_44_] *= f;
		}
	}

	private final void method514(final int i, final int i_45_) {
		if (i < i_45_) {
			int i_46_ = i;
			final int i_47_ = anIntArray452[i_46_];
			final int i_48_ = anIntArray450[i_46_];
			final boolean bool = aBooleanArray451[i_46_];
			for (int i_49_ = i + 1; i_49_ <= i_45_; i_49_++) {
				final int i_50_ = anIntArray452[i_49_];
				if (i_50_ < i_47_) {
					anIntArray452[i_46_] = i_50_;
					anIntArray450[i_46_] = anIntArray450[i_49_];
					aBooleanArray451[i_46_] = aBooleanArray451[i_49_];
					i_46_++;
					anIntArray452[i_49_] = anIntArray452[i_46_];
					anIntArray450[i_49_] = anIntArray450[i_46_];
					aBooleanArray451[i_49_] = aBooleanArray451[i_46_];
				}
			}
			anIntArray452[i_46_] = i_47_;
			anIntArray450[i_46_] = i_48_;
			aBooleanArray451[i_46_] = bool;
			method514(i, i_46_ - 1);
			method514(i_46_ + 1, i_45_);
		}
	}

	public static void method515() {
		anIntArray456 = null;
		aFloatArray445 = null;
		anIntArray452 = null;
		anIntArray450 = null;
		aBooleanArray451 = null;
	}

	private static final int method516(final int[] is, final int i) {
		final int i_51_ = is[i];
		int i_52_ = -1;
		int i_53_ = 2147483647;
		for (int i_54_ = 0; i_54_ < i; i_54_++) {
			final int i_55_ = is[i_54_];
			if (i_55_ > i_51_ && i_55_ < i_53_) {
				i_52_ = i_54_;
				i_53_ = i_55_;
			}
		}
		return i_52_;
	}

	private final int method517(final int i, final int i_56_, final int i_57_,
			final int i_58_, final int i_59_) {
		final int i_60_ = i_58_ - i_56_;
		final int i_61_ = i_57_ - i;
		final int i_62_ = i_60_ < 0 ? -i_60_ : i_60_;
		final int i_63_ = i_62_ * (i_59_ - i);
		final int i_64_ = i_63_ / i_61_;
		if (i_60_ < 0) {
			return i_56_ - i_64_;
		}
		return i_56_ + i_64_;
	}

	Class56() {
		final int i = Class98_Sub13.method1138(16);
		if (i != 1) {
			throw new RuntimeException();
		}
		final int i_65_ = Class98_Sub13.method1138(5);
		int i_66_ = 0;
		anIntArray449 = new int[i_65_];
		for (int i_67_ = 0; i_67_ < i_65_; i_67_++) {
			final int i_68_ = Class98_Sub13.method1138(4);
			anIntArray449[i_67_] = i_68_;
			if (i_68_ >= i_66_) {
				i_66_ = i_68_ + 1;
			}
		}
		anIntArray455 = new int[i_66_];
		anIntArray447 = new int[i_66_];
		anIntArray448 = new int[i_66_];
		anIntArrayArray453 = new int[i_66_][];
		for (int i_69_ = 0; i_69_ < i_66_; i_69_++) {
			anIntArray455[i_69_] = Class98_Sub13.method1138(3) + 1;
			int i_70_ = anIntArray447[i_69_] = Class98_Sub13.method1138(2);
			if (i_70_ != 0) {
				anIntArray448[i_69_] = Class98_Sub13.method1138(8);
			}
			i_70_ = 1 << i_70_;
			final int[] is = new int[i_70_];
			anIntArrayArray453[i_69_] = is;
			for (int i_71_ = 0; i_71_ < i_70_; i_71_++) {
				is[i_71_] = Class98_Sub13.method1138(8) - 1;
			}
		}
		anInt454 = Class98_Sub13.method1138(2) + 1;
		final int i_72_ = Class98_Sub13.method1138(4);
		int i_73_ = 2;
		for (int i_74_ = 0; i_74_ < i_65_; i_74_++) {
			i_73_ += anIntArray455[anIntArray449[i_74_]];
		}
		anIntArray446 = new int[i_73_];
		anIntArray446[0] = 0;
		anIntArray446[1] = 1 << i_72_;
		i_73_ = 2;
		for (int i_75_ = 0; i_75_ < i_65_; i_75_++) {
			final int i_76_ = anIntArray449[i_75_];
			for (int i_77_ = 0; i_77_ < anIntArray455[i_76_]; i_77_++) {
				anIntArray446[i_73_++] = Class98_Sub13.method1138(i_72_);
			}
		}
		if (anIntArray452 == null || anIntArray452.length < i_73_) {
			anIntArray452 = new int[i_73_];
			anIntArray450 = new int[i_73_];
			aBooleanArray451 = new boolean[i_73_];
		}
	}
}
