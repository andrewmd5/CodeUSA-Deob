/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class332 implements Interface5 {
	private final void method3725(final float f, final float f_0_,
			final float f_1_, final float f_2_, final int i, final int i_3_,
			final int i_4_, final int i_5_, final int i_6_) {
		if (i != 0) {
			final double d = (i_3_ & 0xffff) * 9.587379924285257E-5;
			final float f_7_ = (float) Math.sin(d) * i;
			final float f_8_ = (float) Math.cos(d) * i;
			final float f_9_ = (-f_1_ * f_8_ + -f_2_ * f_7_) / 4096.0F + f;
			final float f_10_ = (f_1_ * f_7_ + -f_2_ * f_8_) / 4096.0F + f_0_;
			final float f_11_ = (((method3737() - f_1_) * f_8_ + -f_2_ * f_7_) / 4096.0F + f);
			final float f_12_ = ((-(method3737() - f_1_) * f_7_ + -f_2_ * f_8_) / 4096.0F + f_0_);
			final float f_13_ = ((-f_1_ * f_8_ + (method3749() - f_2_) * f_7_) / 4096.0F + f);
			final float f_14_ = ((f_1_ * f_7_ + (method3749() - f_2_) * f_8_) / 4096.0F + f_0_);
			method3732(f_9_, f_10_, f_11_, f_12_, f_13_, f_14_, i_4_, i_5_,
					i_6_);
		}
	}

	final void method3726(final int i, final int i_15_, final int i_16_,
			final int i_17_) {
		method3745(i, i_15_, i_16_, i_17_, 1, 0, 1, 1);
	}

	final void method3727(final int i, final int i_18_, final int i_19_,
			final int i_20_, final int i_21_, final int i_22_, final int i_23_) {
		method3745(i, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, 1);
	}

	abstract void method3728(int i, int i_24_, int i_25_, int i_26_, int i_27_,
			int i_28_, int i_29_);

	abstract void method3729(int i, int i_30_, aa var_aa, int i_31_, int i_32_);

	final void method3730(final float f, final float f_33_, final int i,
			final int i_34_) {
		method3725(f, f_33_, method3737() / 2.0F, method3749() / 2.0F, i,
				i_34_, 1, 0, 1);
	}

	abstract int method3731();

	private final void method3732(final float f, final float f_35_,
			final float f_36_, final float f_37_, final float f_38_,
			final float f_39_, final int i, final int i_40_, final int i_41_) {
		method3733(f, f_35_, f_36_, f_37_, f_38_, f_39_, i, i_40_, i_41_, 1);
	}

	abstract void method3733(float f, float f_42_, float f_43_, float f_44_,
			float f_45_, float f_46_, int i, int i_47_, int i_48_, int i_49_);

	abstract int method3734();

	final void method3735(final int i, final int i_50_) {
		method3748(i, i_50_, 1, 0, 1);
	}

	abstract void method3736(int i, int i_51_, int i_52_, int i_53_, int i_54_,
			int i_55_);

	abstract int method3737();

	final void method3738(final int i, final int i_56_, final int i_57_,
			final int i_58_) {
		method3728(i, i_56_, i_57_, i_58_, 1, 0, 1);
	}

	final void method3739(final float f, final float f_59_, final int i,
			final int i_60_, final aa var_aa, final int i_61_, final int i_62_) {
		method3746(f, f_59_, method3737() / 2.0F, method3749() / 2.0F, i,
				i_60_, var_aa, i_61_, i_62_);
	}

	abstract void method3740(int i, int i_63_, int i_64_, int i_65_);

	abstract void method3741(int[] is);

	public Class332() {
		/* empty */
	}

	abstract void method3742(int i, int i_66_, int i_67_);

	final void method3743(final float f, final float f_68_, final int i,
			final int i_69_, final int i_70_, final int i_71_, final int i_72_) {
		method3725(f, f_68_, method3737() / 2.0F, method3749() / 2.0F, i,
				i_69_, i_70_, i_71_, i_72_);
	}

	private final void method3744(final float f, final float f_73_,
			final float f_74_, final float f_75_, final float f_76_,
			final float f_77_, final aa var_aa, final int i, final int i_78_) {
		method3747(f, f_73_, f_74_, f_75_, f_76_, f_77_, 1, var_aa, i, i_78_);
	}

	abstract void method3745(int i, int i_79_, int i_80_, int i_81_, int i_82_,
			int i_83_, int i_84_, int i_85_);

	final void method3746(final float f, final float f_86_, final float f_87_,
			final float f_88_, final int i, final int i_89_, final aa var_aa,
			final int i_90_, final int i_91_) {
		if (i != 0) {
			final double d = (i_89_ & 0xffff) * 9.587379924285257E-5;
			final float f_92_ = (float) Math.sin(d) * i;
			final float f_93_ = (float) Math.cos(d) * i;
			final float f_94_ = (-f_87_ * f_93_ + -f_88_ * f_92_) / 4096.0F + f;
			final float f_95_ = (f_87_ * f_92_ + -f_88_ * f_93_) / 4096.0F
					+ f_86_;
			final float f_96_ = (((method3737() - f_87_) * f_93_ + -f_88_
					* f_92_) / 4096.0F + f);
			final float f_97_ = ((-(method3737() - f_87_) * f_92_ + -f_88_
					* f_93_) / 4096.0F + f_86_);
			final float f_98_ = ((-f_87_ * f_93_ + (method3749() - f_88_)
					* f_92_) / 4096.0F + f);
			final float f_99_ = ((f_87_ * f_92_ + (method3749() - f_88_)
					* f_93_) / 4096.0F + f_86_);
			method3744(f_94_, f_95_, f_96_, f_97_, f_98_, f_99_, var_aa, i_90_,
					i_91_);
		}
	}

	abstract void method3747(float f, float f_100_, float f_101_, float f_102_,
			float f_103_, float f_104_, int i, aa var_aa, int i_105_, int i_106_);

	abstract void method3748(int i, int i_107_, int i_108_, int i_109_,
			int i_110_);

	abstract int method3749();
}
