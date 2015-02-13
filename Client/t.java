/* t - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class t extends s implements Interface9 {
	private final Class148 aClass148_3324 = new Class148();
	private final oa anOa3325;
	long nativeid;
	private int anInt3326 = -1;

	@Override
	final void method3422(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_, final int i_5_,
			final boolean[][] bools) {
		anOa3325.method1930().method148(this, i, i_0_, i_1_, i_2_, i_3_, i_4_,
				i_5_, bools);
	}

	private final native void V(int i, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_, int[] is);

	private final native void ga(oa var_oa, ya var_ya, int i, int i_11_,
			int[][] is, int[][] is_12_, int i_13_, int i_14_, int i_15_);

	@Override
	final void method3416(final int i, final int i_16_, final int i_17_,
			final boolean[][] bools, final boolean bool, final int i_18_,
			final int i_19_) {
		anInt3326 = i_18_;
		int i_20_ = 0;
		final float[] fs = new float[aClass148_3324.method2424(0)];
		for (Class98_Sub5 class98_sub5 = (Class98_Sub5) aClass148_3324
				.method2418(32); class98_sub5 != null; class98_sub5 = (Class98_Sub5) aClass148_3324
				.method2417(92)) {
			fs[i_20_++] = class98_sub5.method956(false);
		}
		q(fs);
		for (int i_21_ = 0; i_21_ < i_17_ + i_17_; i_21_++) {
			for (int i_22_ = 0; i_22_ < i_17_ + i_17_; i_22_++) {
				if (bools[i_21_][i_22_]) {
					final int i_23_ = i - i_17_ + i_21_;
					final int i_24_ = i_16_ - i_17_ + i_22_;
					if (i_23_ >= 0 && i_23_ < ((s) this).anInt2203
							&& i_24_ >= 0 && i_24_ < ((s) this).anInt2204) {
						method3425(i_23_, i_24_);
					}
				}
			}
		}
	}

	@Override
	final native void wa(r var_r, int i, int i_25_, int i_26_, int i_27_,
			boolean bool);

	@Override
	final native r fa(int i, int i_28_, r var_r);

	@Override
	final void method3426(final int i, final int i_29_, final int i_30_,
			final boolean[][] bools, final boolean bool, final int i_31_) {
		anInt3326 = -1;
		int i_32_ = 0;
		final float[] fs = new float[aClass148_3324.method2424(0)];
		for (Class98_Sub5 class98_sub5 = (Class98_Sub5) aClass148_3324
				.method2418(32); class98_sub5 != null; class98_sub5 = (Class98_Sub5) aClass148_3324
				.method2417(102)) {
			fs[i_32_++] = class98_sub5.method956(false);
		}
		q(fs);
		for (int i_33_ = 0; i_33_ < i_30_ + i_30_; i_33_++) {
			for (int i_34_ = 0; i_34_ < i_30_ + i_30_; i_34_++) {
				if (bools[i_33_][i_34_]) {
					final int i_35_ = i - i_30_ + i_33_;
					final int i_36_ = i_29_ - i_30_ + i_34_;
					if (i_35_ >= 0 && i_35_ < ((s) this).anInt2203
							&& i_36_ >= 0 && i_36_ < ((s) this).anInt2204) {
						method3425(i_35_, i_36_);
					}
				}
			}
		}
	}

	@Override
	final void method3425(final int i, final int i_37_) {
		if (anInt3326 < 0) {
			anOa3325.method1930().method145(this, i, i_37_);
		} else {
			anOa3325.method1930().method136(this, i, i_37_, anInt3326);
		}
	}

	@Override
	final native void ka(int i, int i_38_, int i_39_);

	@Override
	final native void U(int i, int i_40_, int[] is, int[] is_41_, int[] is_42_,
			int[] is_43_, int[] is_44_, int[] is_45_, int[] is_46_,
			int[] is_47_, int i_48_, int i_49_, int i_50_, boolean bool);

	@Override
	public final native void w(boolean bool);

	@Override
	final native void CA(r var_r, int i, int i_51_, int i_52_, int i_53_,
			boolean bool);

	@Override
	final void method3424(final int i, final int i_54_, final int[] is,
			final int[] is_55_, final int[] is_56_, final int[] is_57_,
			final int[] is_58_, final int[] is_59_, final int[] is_60_,
			final int[] is_61_, final int[] is_62_, final int[] is_63_,
			final int[] is_64_, final int i_65_, final int i_66_,
			final int i_67_, final boolean bool) {
		boolean bool_68_ = false;
		if (is_61_ != null) {
			final int[] is_69_ = is_61_;
			for (int i_70_ = 0; i_70_ < is_69_.length; i_70_++) {
				final int i_71_ = is_69_[i_70_];
				if (i_71_ != -1) {
					bool_68_ = true;
					break;
				}
			}
		}
		final int i_72_ = is_61_.length;
		final int[] is_73_ = new int[i_72_ * 3];
		final int[] is_74_ = new int[i_72_ * 3];
		final int[] is_75_ = new int[i_72_ * 3];
		final int[] is_76_ = new int[i_72_ * 3];
		final int[] is_77_ = new int[i_72_ * 3];
		final int[] is_78_ = is_62_ != null ? new int[i_72_ * 3] : null;
		final int[] is_79_ = is_55_ != null ? new int[i_72_ * 3] : null;
		final int[] is_80_ = is_57_ != null ? new int[i_72_ * 3] : null;
		int i_81_ = 0;
		for (int i_82_ = 0; i_82_ < i_72_; i_82_++) {
			final int i_83_ = is_58_[i_82_];
			final int i_84_ = is_59_[i_82_];
			final int i_85_ = is_60_[i_82_];
			is_73_[i_81_] = is[i_83_];
			is_74_[i_81_] = is_56_[i_83_];
			is_75_[i_81_] = is_61_[i_82_];
			is_76_[i_81_] = is_63_[i_82_];
			is_77_[i_81_] = is_64_[i_82_];
			if (is_62_ != null) {
				is_78_[i_81_] = is_62_[i_82_];
			}
			if (is_55_ != null) {
				is_79_[i_81_] = is_55_[i_83_];
			}
			if (is_57_ != null) {
				is_80_[i_81_] = is_57_[i_83_];
			}
			i_81_++;
			is_73_[i_81_] = is[i_84_];
			is_74_[i_81_] = is_56_[i_84_];
			is_75_[i_81_] = is_61_[i_82_];
			is_76_[i_81_] = is_63_[i_82_];
			is_77_[i_81_] = is_64_[i_82_];
			if (is_62_ != null) {
				is_78_[i_81_] = is_62_[i_82_];
			}
			if (is_55_ != null) {
				is_79_[i_81_] = is_55_[i_84_];
			}
			if (is_57_ != null) {
				is_80_[i_81_] = is_57_[i_84_];
			}
			i_81_++;
			is_73_[i_81_] = is[i_85_];
			is_74_[i_81_] = is_56_[i_85_];
			is_75_[i_81_] = is_61_[i_82_];
			is_76_[i_81_] = is_63_[i_82_];
			is_77_[i_81_] = is_64_[i_82_];
			if (is_62_ != null) {
				is_78_[i_81_] = is_62_[i_82_];
			}
			if (is_55_ != null) {
				is_79_[i_81_] = is_55_[i_85_];
			}
			if (is_57_ != null) {
				is_80_[i_81_] = is_57_[i_85_];
			}
			i_81_++;
		}
		if (bool_68_ || is_78_ != null) {
			U(i, i_54_, is_73_, is_79_, is_74_, is_80_, is_75_, is_78_, is_76_,
					is_77_, i_65_, i_66_, i_67_, bool);
		}
	}

	@Override
	final void method3421(final Class98_Sub5 class98_sub5, final int[] is) {
		aClass148_3324.method2419(class98_sub5, -20911);
		V(class98_sub5.hashCode(), class98_sub5.method954(7019),
				class98_sub5.method963((byte) 94),
				class98_sub5.method962(28699), class98_sub5.method958(-14),
				class98_sub5.method961((byte) -78), is);
	}

	@Override
	protected final void finalize() {
		if (nativeid != 0L) {
			Class192.method2654(false, this);
		}
	}

	private final native void q(float[] fs);

	@Override
	final native void YA();

	@Override
	final boolean method3418(final r var_r, final int i, final int i_86_,
			final int i_87_, final int i_88_, final boolean bool) {
		return true;
	}

	t(final oa var_oa, final ya var_ya, final int i, final int i_89_,
			final int[][] is, final int[][] is_90_, final int i_91_,
			final int i_92_, final int i_93_) {
		super(i, i_89_, i_91_, is);
		anOa3325 = var_oa;
		ga(anOa3325, var_ya, i, i_89_, ((s) this).anIntArrayArray2201, is_90_,
				i_91_, i_92_, i_93_);
	}
}
