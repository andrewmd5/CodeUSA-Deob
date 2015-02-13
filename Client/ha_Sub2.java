/* ha_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

final class ha_Sub2 extends ha {
	private boolean aBoolean4472;
	private boolean aBoolean4473 = false;
	private int anInt4474;
	private int anInt4475;
	private Class377 aClass377_4476;
	private int anInt4477;
	Class98_Sub32 aClass98_Sub32_4478;
	private Canvas aCanvas4479;
	private int anInt4480;
	int anInt4481;
	int anInt4482;
	private Class235[] aClass235Array4483;
	int anInt4484;
	private int anInt4485;
	int anInt4486;
	float[] aFloatArray4487;
	float[] aFloatArray4488;
	int anInt4489;
	int anInt4490;
	private boolean aBoolean4491;
	int anInt4492;
	private int anInt4493;
	private Class79 aClass79_4494;
	int anInt4495;
	private int anInt4496;
	private final Class79 aClass79_4497;
	private int anInt4498;
	private Class186 aClass186_4499;
	int anInt4500;
	int anInt4501;
	int anInt4502;
	private int anInt4503;
	int[] anIntArray4504;
	int anInt4505;
	int anInt4506;
	int anInt4507;
	int anInt4508;
	int anInt4509;
	int anInt4510;
	int anInt4511;
	private int anInt4512;
	Class111_Sub2 aClass111_Sub2_4513;
	int anInt4514;
	int anInt4515;
	int anInt4516;
	int anInt4517;
	int anInt4518;
	private Class332 aClass332_4519;
	private int anInt4520;

	@Override
	final boolean method1767() {
		return false;
	}

	@Override
	final Class98_Sub5 method1765(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final float f) {
		return null;
	}

	@Override
	final void method1791(final float f, final float f_4_, final float f_5_) {
		/* empty */
	}

	@Override
	final void ZA(final int i, final float f, final float f_6_,
			final float f_7_, final float f_8_, final float f_9_) {
		anInt4501 = (int) (f * 65535.0F);
		anInt4489 = (int) (f_6_ * 65535.0F);
		final float f_10_ = (float) Math.sqrt(f_7_ * f_7_ + f_8_ * f_8_ + f_9_
				* f_9_);
		anInt4481 = (int) (f_7_ * 65535.0F / f_10_);
		anInt4515 = (int) (f_8_ * 65535.0F / f_10_);
		anInt4500 = (int) (f_9_ * 65535.0F / f_10_);
	}

	@Override
	final void a(int i, int i_11_, int i_12_, int i_13_, int i_14_,
			final int i_15_, final aa var_aa, final int i_16_, final int i_17_,
			int i_18_, int i_19_, int i_20_) {
		final aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		final int[] is = var_aa_Sub1.anIntArray3555;
		final int[] is_21_ = var_aa_Sub1.anIntArray3557;
		final int i_22_ = (anInt4495 > i_17_ ? anInt4495 : i_17_);
		final int i_23_ = (anInt4492 < i_17_ + is.length ? anInt4492 : i_17_
				+ is.length);
		i_20_ <<= 8;
		i_18_ <<= 8;
		i_19_ <<= 8;
		final int i_24_ = i_18_ + i_19_;
		i_20_ %= i_24_;
		i_12_ -= i;
		i_13_ -= i_11_;
		if (i_12_ + i_13_ < 0) {
			final int i_25_ = (int) (Math.sqrt(i_12_ * i_12_ + i_13_ * i_13_) * 256.0);
			final int i_26_ = i_25_ % i_24_;
			i_20_ = i_24_ + i_18_ - i_20_ - i_26_;
			i_20_ %= i_24_;
			if (i_20_ < 0) {
				i_20_ += i_24_;
			}
			i += i_12_;
			i_12_ = -i_12_;
			i_11_ += i_13_;
			i_13_ = -i_13_;
		}
		if (i_12_ > i_13_) {
			i_11_ <<= 16;
			i_11_ += 32768;
			i_13_ <<= 16;
			final int i_27_ = (int) Math.floor((double) i_13_ / (double) i_12_
					+ 0.5);
			i_12_ += i;
			final int i_28_ = i_14_ >>> 24;
			final int i_29_ = (int) Math.sqrt(65536 + (i_27_ >> 8)
					* (i_27_ >> 8));
			if (i_15_ == 0 || i_15_ == 1 && i_28_ == 255) {
				while (i <= i_12_) {
					final int i_30_ = i_11_ >> 16;
					final int i_31_ = i_30_ - i_17_;
					if (i >= anInt4509 && i < anInt4507 && i_30_ >= i_22_
							&& i_30_ < i_23_ && i_20_ < i_18_) {
						final int i_32_ = i_16_ + is[i_31_];
						if (i >= i_32_ && i < i_32_ + is_21_[i_31_]) {
							anIntArray4504[i + i_30_ * anInt4505] = i_14_;
						}
					}
					i_11_ += i_27_;
					i++;
					i_20_ += i_29_;
					i_20_ %= i_24_;
				}
				return;
			}
			if (i_15_ == 1) {
				i_14_ = (((i_14_ & 0xff00ff) * i_28_ >> 8 & 0xff00ff)
						+ ((i_14_ & 0xff00) * i_28_ >> 8 & 0xff00) + (i_28_ << 24));
				final int i_33_ = 256 - i_28_;
				while (i <= i_12_) {
					final int i_34_ = i_11_ >> 16;
					final int i_35_ = i_34_ - i_17_;
					if (i >= anInt4509 && i < anInt4507 && i_34_ >= i_22_
							&& i_34_ < i_23_ && i_20_ < i_18_) {
						final int i_36_ = i_16_ + is[i_35_];
						if (i >= i_36_ && i < i_36_ + is_21_[i_35_]) {
							final int i_37_ = i + i_34_ * anInt4505;
							int i_38_ = anIntArray4504[i_37_];
							i_38_ = (((i_38_ & 0xff00ff) * i_33_ >> 8 & 0xff00ff) + ((i_38_ & 0xff00)
									* i_33_ >> 8 & 0xff00));
							anIntArray4504[i_37_] = i_14_ + i_38_;
						}
					}
					i_11_ += i_27_;
					i++;
					i_20_ += i_29_;
					i_20_ %= i_24_;
				}
				return;
			}
			if (i_15_ == 2) {
				while (i <= i_12_) {
					final int i_39_ = i_11_ >> 16;
					final int i_40_ = i_39_ - i_17_;
					if (i >= anInt4509 && i < anInt4507 && i_39_ >= i_22_
							&& i_39_ < i_23_ && i_20_ < i_18_) {
						final int i_41_ = i_16_ + is[i_40_];
						if (i >= i_41_ && i < i_41_ + is_21_[i_40_]) {
							final int i_42_ = i + i_39_ * anInt4505;
							int i_43_ = anIntArray4504[i_42_];
							final int i_44_ = i_14_ + i_43_;
							final int i_45_ = (i_14_ & 0xff00ff)
									+ (i_43_ & 0xff00ff);
							i_43_ = (i_45_ & 0x1000100)
									+ (i_44_ - i_45_ & 0x10000);
							anIntArray4504[i_42_] = i_44_ - i_43_ | i_43_
									- (i_43_ >>> 8);
						}
					}
					i_11_ += i_27_;
					i++;
					i_20_ += i_29_;
					i_20_ %= i_24_;
				}
				return;
			}
			throw new IllegalArgumentException();
		}
		i <<= 16;
		i += 32768;
		i_12_ <<= 16;
		final int i_46_ = (int) Math.floor((double) i_12_ / (double) i_13_
				+ 0.5);
		final int i_47_ = (int) Math.sqrt(65536 + (i_46_ >> 8) * (i_46_ >> 8));
		i_13_ += i_11_;
		final int i_48_ = i_14_ >>> 24;
		if (i_15_ == 0 || i_15_ == 1 && i_48_ == 255) {
			while (i_11_ <= i_13_) {
				final int i_49_ = i >> 16;
				final int i_50_ = i_11_ - i_17_;
				if (i_11_ >= i_22_ && i_11_ < i_23_ && i_49_ >= anInt4509
						&& i_49_ < anInt4507 && i_20_ < i_18_
						&& i_49_ >= i_16_ + is[i_50_]
						&& i_49_ < i_16_ + is[i_50_] + is_21_[i_50_]) {
					anIntArray4504[i_49_ + i_11_ * anInt4505] = i_14_;
				}
				i += i_46_;
				i_11_++;
				i_20_ += i_47_;
				i_20_ %= i_24_;
			}
		} else if (i_15_ == 1) {
			i_14_ = (((i_14_ & 0xff00ff) * i_48_ >> 8 & 0xff00ff)
					+ ((i_14_ & 0xff00) * i_48_ >> 8 & 0xff00) + (i_48_ << 24));
			final int i_51_ = 256 - i_48_;
			while (i_11_ <= i_13_) {
				final int i_52_ = i >> 16;
				final int i_53_ = i_11_ - i_17_;
				if (i_11_ >= i_22_ && i_11_ < i_23_ && i_52_ >= anInt4509
						&& i_52_ < anInt4507 && i_20_ < i_18_
						&& i_52_ >= i_16_ + is[i_53_]
						&& i_52_ < i_16_ + is[i_53_] + is_21_[i_53_]) {
					final int i_54_ = i_52_ + i_11_ * anInt4505;
					int i_55_ = anIntArray4504[i_54_];
					i_55_ = (((i_55_ & 0xff00ff) * i_51_ >> 8 & 0xff00ff) + ((i_55_ & 0xff00)
							* i_51_ >> 8 & 0xff00));
					anIntArray4504[i_52_ + i_11_ * anInt4505] = i_14_ + i_55_;
				}
				i += i_46_;
				i_11_++;
				i_20_ += i_47_;
				i_20_ %= i_24_;
			}
		} else if (i_15_ == 2) {
			while (i_11_ <= i_13_) {
				final int i_56_ = i >> 16;
				final int i_57_ = i_11_ - i_17_;
				if (i_11_ >= i_22_ && i_11_ < i_23_ && i_56_ >= anInt4509
						&& i_56_ < anInt4507 && i_20_ < i_18_
						&& i_56_ >= i_16_ + is[i_57_]
						&& i_56_ < i_16_ + is[i_57_] + is_21_[i_57_]) {
					final int i_58_ = i_56_ + i_11_ * anInt4505;
					int i_59_ = anIntArray4504[i_58_];
					final int i_60_ = i_14_ + i_59_;
					final int i_61_ = (i_14_ & 0xff00ff) + (i_59_ & 0xff00ff);
					i_59_ = (i_61_ & 0x1000100) + (i_60_ - i_61_ & 0x10000);
					anIntArray4504[i_58_] = i_60_ - i_59_ | i_59_
							- (i_59_ >>> 8);
				}
				i += i_46_;
				i_11_++;
				i_20_ += i_47_;
				i_20_ %= i_24_;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	final void HA(final int i, final int i_62_, final int i_63_,
			final int i_64_, final int[] is) {
		final float f = ((aClass111_Sub2_4513.aFloat4689) + ((aClass111_Sub2_4513.aFloat4693)
				* i + (aClass111_Sub2_4513.aFloat4698) * i_62_ + (aClass111_Sub2_4513.aFloat4694)
				* i_63_));
		if (f < anInt4502 || f > anInt4484) {
			is[0] = is[1] = is[2] = -1;
		} else {
			final int i_65_ = (int) (anInt4514
					* (aClass111_Sub2_4513.aFloat4697 + ((aClass111_Sub2_4513.aFloat4700)
							* i + (aClass111_Sub2_4513.aFloat4699) * i_62_ + (aClass111_Sub2_4513.aFloat4690)
							* i_63_)) / i_64_);
			final int i_66_ = (int) (anInt4490
					* (aClass111_Sub2_4513.aFloat4691 + ((aClass111_Sub2_4513.aFloat4692)
							* i + (aClass111_Sub2_4513.aFloat4688) * i_62_ + (aClass111_Sub2_4513.aFloat4696)
							* i_63_)) / i_64_);
			if (i_65_ >= anInt4486 && i_65_ <= anInt4517 && i_66_ >= anInt4518
					&& i_66_ <= anInt4506) {
				is[0] = i_65_ - anInt4486;
				is[1] = i_66_ - anInt4518;
				is[2] = (int) f;
			} else {
				is[0] = is[1] = is[2] = -1;
			}
		}
	}

	@Override
	final void xa(final float f) {
		anInt4516 = (int) (f * 65535.0F);
	}

	@Override
	final void P(final int i, int i_67_, int i_68_, int i_69_, final int i_70_) {
		if (i >= anInt4509 && i < anInt4507) {
			if (i_67_ < anInt4495) {
				i_68_ -= anInt4495 - i_67_;
				i_67_ = anInt4495;
			}
			if (i_67_ + i_68_ > anInt4492) {
				i_68_ = anInt4492 - i_67_;
			}
			final int i_71_ = i + i_67_ * anInt4505;
			final int i_72_ = i_69_ >>> 24;
			if (i_70_ == 0 || i_70_ == 1 && i_72_ == 255) {
				for (int i_73_ = 0; i_73_ < i_68_; i_73_++) {
					anIntArray4504[i_71_ + i_73_ * anInt4505] = i_69_;
				}
			} else if (i_70_ == 1) {
				i_69_ = (((i_69_ & 0xff00ff) * i_72_ >> 8 & 0xff00ff)
						+ ((i_69_ & 0xff00) * i_72_ >> 8 & 0xff00) + (i_72_ << 24));
				final int i_74_ = 256 - i_72_;
				for (int i_75_ = 0; i_75_ < i_68_; i_75_++) {
					final int i_76_ = i_71_ + i_75_ * anInt4505;
					int i_77_ = anIntArray4504[i_76_];
					i_77_ = (((i_77_ & 0xff00ff) * i_74_ >> 8 & 0xff00ff) + ((i_77_ & 0xff00)
							* i_74_ >> 8 & 0xff00));
					anIntArray4504[i_76_] = i_69_ + i_77_;
				}
			} else if (i_70_ == 2) {
				for (int i_78_ = 0; i_78_ < i_68_; i_78_++) {
					final int i_79_ = i_71_ + i_78_ * anInt4505;
					int i_80_ = anIntArray4504[i_79_];
					final int i_81_ = i_69_ + i_80_;
					final int i_82_ = (i_69_ & 0xff00ff) + (i_80_ & 0xff00ff);
					i_80_ = (i_82_ & 0x1000100) + (i_81_ - i_82_ & 0x10000);
					anIntArray4504[i_79_] = i_81_ - i_80_ | i_80_
							- (i_80_ >>> 8);
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@Override
	final boolean method1802() {
		return false;
	}

	@Override
	final void ra(final int i, final int i_83_, final int i_84_, final int i_85_) {
		for (int i_86_ = 0; i_86_ < aClass235Array4483.length; i_86_++) {
			aClass235Array4483[i_86_].anInt1755 = aClass235Array4483[i_86_].anInt1763;
			aClass235Array4483[i_86_].anInt1754 = i;
			aClass235Array4483[i_86_].anInt1763 = i_83_;
			aClass235Array4483[i_86_].anInt1757 = i_84_;
			aClass235Array4483[i_86_].aBoolean1759 = true;
		}
	}

	@Override
	final void method1801(final int[] is) {
		is[0] = anInt4505;
		is[1] = anInt4480;
	}

	@Override
	final void method1786(final Canvas canvas) {
		if (aCanvas4479 == canvas) {
			method1750(null);
		}
		final Class98_Sub32 class98_sub32 = ((Class98_Sub32) aClass377_4476
				.method3990(canvas.hashCode(), -1));
		if (class98_sub32 != null) {
			class98_sub32.method942(75);
		}
	}

	private ha_Sub2(final d var_d) {
		super(var_d);
		aBoolean4472 = false;
		aClass377_4476 = new Class377(4);
		anInt4495 = 0;
		anInt4484 = 3500;
		aBoolean4491 = false;
		anInt4501 = 45823;
		anInt4498 = 0;
		anInt4509 = 0;
		anInt4482 = 128;
		anInt4492 = 0;
		anInt4493 = 0;
		anInt4516 = 75518;
		anInt4507 = 0;
		anInt4502 = 50;
		anInt4489 = 78642;
		anInt4490 = 512;
		anInt4514 = 512;
		aClass79_4497 = new Class79(16);
		anInt4520 = -1;
		try {
			aClass79_4494 = new Class79(256);
			aClass111_Sub2_4513 = new Class111_Sub2();
			method1783(1);
			method1807(0);
			Class101.method1702(8, true, true);
			aBoolean4473 = true;
			anInt4475 = (int) Class343.method3819(-47);
		} catch (final Throwable throwable) {
			throwable.printStackTrace();
			method1743(-1);
			throw new RuntimeException("");
		}
	}

	@Override
	final boolean method1766() {
		return true;
	}

	private final void method1911() {
		for (int i = 0; i < anInt4508; i++) {
			aClass235Array4483[i].method2888((byte) -60);
		}
		la();
	}

	@Override
	final Interface5 method1813(final int i, final int i_87_) {
		return method1739(i, i_87_, false);
	}

	@Override
	final Interface17 method1815(final Interface5 interface5,
			final Interface13 interface13) {
		return new Class186(this, (Class332) interface5, (Class333) interface13);
	}

	@Override
	final void method1783(final int i) {
		anInt4508 = i;
		aClass235Array4483 = new Class235[anInt4508];
		for (int i_88_ = 0; i_88_ < anInt4508; i_88_++) {
			aClass235Array4483[i_88_] = new Class235(this);
		}
	}

	@Override
	final void method1816(int i, int i_89_, final int i_90_, final int i_91_,
			final int i_92_, final int i_93_, final int i_94_) {
		final Class235 class235 = method1921(Thread.currentThread());
		final Class12 class12 = class235.aClass12_1767;
		int i_95_ = i_90_ - i;
		int i_96_ = i_91_ - i_89_;
		final int i_97_ = i_95_ >= 0 ? i_95_ : -i_95_;
		final int i_98_ = i_96_ >= 0 ? i_96_ : -i_96_;
		int i_99_ = i_97_;
		if (i_99_ < i_98_) {
			i_99_ = i_98_;
		}
		if (i_99_ != 0) {
			int i_100_ = (i_95_ << 16) / i_99_;
			int i_101_ = (i_96_ << 16) / i_99_;
			i_95_ += i_100_ >> 16;
			i_96_ += i_101_ >> 16;
			if (i_101_ <= i_100_) {
				i_100_ = -i_100_;
			} else {
				i_101_ = -i_101_;
			}
			final int i_102_ = i_93_ * i_101_ >> 17;
			final int i_103_ = i_93_ * i_101_ + 1 >> 17;
			final int i_104_ = i_93_ * i_100_ >> 17;
			final int i_105_ = i_93_ * i_100_ + 1 >> 17;
			i -= class12.method207();
			i_89_ -= class12.method210();
			final int i_106_ = i + i_102_;
			final int i_107_ = i - i_103_;
			final int i_108_ = i + i_95_ - i_103_;
			final int i_109_ = i + i_95_ + i_102_;
			final int i_110_ = i_89_ + i_104_;
			final int i_111_ = i_89_ - i_105_;
			final int i_112_ = i_89_ + i_96_ - i_105_;
			final int i_113_ = i_89_ + i_96_ + i_104_;
			if (i_94_ == 0) {
				class12.anInt137 = 0;
			} else if (i_94_ == 1) {
				class12.anInt137 = 255 - (i_92_ >>> 24);
			} else {
				throw new IllegalArgumentException();
			}
			C(false);
			class12.aBoolean135 = (i_106_ < 0 || i_106_ > class12.anInt141
					|| i_107_ < 0 || i_107_ > class12.anInt141 || i_108_ < 0 || i_108_ > class12.anInt141);
			class12.method208(i_110_, i_111_, i_112_, i_106_, i_107_, i_108_,
					100.0F, 100.0F, 100.0F, i_92_);
			class12.aBoolean135 = (i_106_ < 0 || i_106_ > class12.anInt141
					|| i_108_ < 0 || i_108_ > class12.anInt141 || i_109_ < 0 || i_109_ > class12.anInt141);
			class12.method208(i_110_, i_112_, i_113_, i_106_, i_108_, i_109_,
					100.0F, 100.0F, 100.0F, i_92_);
			C(true);
		}
	}

	ha_Sub2(final Canvas canvas, final d var_d, final int i, final int i_114_) {
		this(var_d);
		try {
			method1741(canvas, i, i_114_);
			method1750(canvas);
		} catch (final Throwable throwable) {
			throwable.printStackTrace();
			method1743(-1);
			throw new RuntimeException("");
		}
	}

	@Override
	final boolean method1819() {
		return false;
	}

	@Override
	final void method1798(final int i) {
		Class146_Sub1.anInt4810 = Class146_Sub1.anInt4825 = i;
		if (anInt4508 > 1) {
			throw new IllegalStateException("No MT");
		}
		method1783(anInt4508);
		method1807(0);
	}

	@Override
	final int M() {
		final int i = anInt4493;
		anInt4493 = 0;
		return i;
	}

	@Override
	final int method1777(final int i, final int i_115_) {
		return i | i_115_;
	}

	@Override
	final int method1822() {
		return 0;
	}

	final int method1912(final int i) {
		return ((ha) this).aD938.method11(i, -28755).anInt1818;
	}

	@Override
	final void method1756() {
		/* empty */
	}

	@Override
	final int I() {
		final int i = anInt4498;
		anInt4498 = 0;
		return i;
	}

	@Override
	final Class332 method1770(final int[] is, final int i, final int i_116_,
			final int i_117_, final int i_118_, final boolean bool) {
		boolean bool_119_ = false;
		int i_120_ = i;
		while_100_: for (int i_121_ = 0; i_121_ < i_118_; i_121_++) {
			for (int i_122_ = 0; i_122_ < i_117_; i_122_++) {
				final int i_123_ = is[i_120_++] >>> 24;
				if (i_123_ != 0 && i_123_ != 255) {
					bool_119_ = true;
					break while_100_;
				}
			}
		}
		if (bool_119_) {
			return new Class332_Sub3_Sub1(this, is, i, i_116_, i_117_, i_118_,
					bool);
		}
		return new Class332_Sub3_Sub2(this, is, i, i_116_, i_117_, i_118_, bool);
	}

	private final void method1913() {
		anInt4486 = anInt4509 - anInt4510;
		anInt4517 = anInt4507 - anInt4510;
		anInt4518 = anInt4495 - anInt4511;
		anInt4506 = anInt4492 - anInt4511;
		for (int i = 0; i < anInt4508; i++) {
			final Class12 class12 = aClass235Array4483[i].aClass12_1767;
			class12.anInt136 = anInt4510 - anInt4509;
			class12.anInt128 = anInt4511 - anInt4495;
			class12.anInt141 = anInt4507 - anInt4509;
			class12.anInt129 = anInt4492 - anInt4495;
		}
		int i = (anInt4495 * anInt4505 + anInt4509);
		for (int i_124_ = anInt4495; i_124_ < anInt4492; i_124_++) {
			for (int i_125_ = 0; i_125_ < anInt4508; i_125_++) {
				aClass235Array4483[i_125_].aClass12_1767.anIntArray133[i_124_
						- anInt4495] = i;
			}
			i += anInt4505;
		}
	}

	@Override
	final int r(final int i, final int i_126_, final int i_127_,
			final int i_128_, final int i_129_, final int i_130_,
			final int i_131_) {
		final float f = ((aClass111_Sub2_4513.aFloat4693) * i
				+ (aClass111_Sub2_4513.aFloat4698) * i_126_
				+ (aClass111_Sub2_4513.aFloat4694) * i_127_ + (aClass111_Sub2_4513.aFloat4689));
		final float f_132_ = ((aClass111_Sub2_4513.aFloat4693) * i_128_
				+ (aClass111_Sub2_4513.aFloat4698) * i_129_
				+ (aClass111_Sub2_4513.aFloat4694) * i_130_ + (aClass111_Sub2_4513.aFloat4689));
		int i_133_ = 0;
		if (f < anInt4502 && f_132_ < anInt4502) {
			i_133_ |= 0x10;
		} else if (f > anInt4484 && f_132_ > anInt4484) {
			i_133_ |= 0x20;
		}
		final int i_134_ = (int) (anInt4514
				* ((aClass111_Sub2_4513.aFloat4700) * i
						+ (aClass111_Sub2_4513.aFloat4699 * i_126_)
						+ (aClass111_Sub2_4513.aFloat4690 * i_127_) + aClass111_Sub2_4513.aFloat4697) / i_131_);
		final int i_135_ = (int) (anInt4514
				* ((aClass111_Sub2_4513.aFloat4700) * i_128_
						+ (aClass111_Sub2_4513.aFloat4699 * i_129_)
						+ (aClass111_Sub2_4513.aFloat4690 * i_130_) + aClass111_Sub2_4513.aFloat4697) / i_131_);
		if (i_134_ < anInt4486 && i_135_ < anInt4486) {
			i_133_ |= 0x1;
		} else if (i_134_ > anInt4517 && i_135_ > anInt4517) {
			i_133_ |= 0x2;
		}
		final int i_136_ = (int) (anInt4490
				* ((aClass111_Sub2_4513.aFloat4692) * i
						+ (aClass111_Sub2_4513.aFloat4688 * i_126_)
						+ (aClass111_Sub2_4513.aFloat4696 * i_127_) + aClass111_Sub2_4513.aFloat4691) / i_131_);
		final int i_137_ = (int) (anInt4490
				* ((aClass111_Sub2_4513.aFloat4692) * i_128_
						+ (aClass111_Sub2_4513.aFloat4688 * i_129_)
						+ (aClass111_Sub2_4513.aFloat4696 * i_130_) + aClass111_Sub2_4513.aFloat4691) / i_131_);
		if (i_136_ < anInt4518 && i_137_ < anInt4518) {
			i_133_ |= 0x4;
		} else if (i_136_ > anInt4506 && i_137_ > anInt4506) {
			i_133_ |= 0x8;
		}
		return i_133_;
	}

	private final void method1914(final Class246_Sub4_Sub2 class246_sub4_sub2,
			final int i, final int i_138_, final int i_139_, int i_140_) {
		final int i_141_ = class246_sub4_sub2.anInt6180;
		final int i_142_ = i_140_;
		i_140_ <<= 1;
		if (i_141_ == -1) {
			method1916(i, i_138_, i_139_, i_142_, class246_sub4_sub2.anInt6178,
					1);
		} else {
			if (anInt4520 != i_141_) {
				Class332 class332 = (Class332) aClass79_4497.method802(-119,
						i_141_);
				if (class332 == null) {
					final int[] is = method1915(i_141_);
					if (is != null) {
						final int i_143_ = (method1925(i_141_) ? 64 : anInt4482);
						class332 = method1748(-7962, 0, i_143_, i_143_, is,
								i_143_);
						aClass79_4497.method805(i_141_, class332, (byte) -80);
					} else {
						return;
					}
				}
				anInt4520 = i_141_;
				aClass332_4519 = class332;
			}
			i_140_++;
			((Class332_Sub3) aClass332_4519).method3757(i - i_142_, i_138_
					- i_142_, i_139_, i_140_, i_140_, 0,
					class246_sub4_sub2.anInt6178, 1, 1);
		}
	}

	@Override
	final boolean method1824() {
		return false;
	}

	final int[] method1915(final int i) {
		Class98_Sub2 class98_sub2;
		synchronized (aClass79_4494) {
			class98_sub2 = ((Class98_Sub2) aClass79_4494.method802(-121, i
					| ~0x7fffffffffffffffL));
			if (class98_sub2 == null) {
				if (!((ha) this).aD938.method8(-119, i)) {
					return null;
				}
				final TextureDefinition textureDefinition = ((ha) this).aD938.method11(i, -28755);
				final int i_144_ = (textureDefinition.aBoolean1822 || aBoolean4491 ? 64
						: anInt4482);
				class98_sub2 = new Class98_Sub2(i, i_144_,
						((ha) this).aD938.method13(115, i_144_, i, 0.7F, true,
								i_144_), textureDefinition.anInt1818 != 1);
				aClass79_4494.method805(i | ~0x7fffffffffffffffL, class98_sub2,
						(byte) -80);
			}
		}
		class98_sub2.aBoolean3817 = true;
		return class98_sub2.method948();
	}

	@Override
	final void za(final int i, int i_145_, int i_146_, int i_147_,
			final int i_148_) {
		if (i_146_ < 0) {
			i_146_ = -i_146_;
		}
		int i_149_ = i_145_ - i_146_;
		if (i_149_ < anInt4495) {
			i_149_ = anInt4495;
		}
		int i_150_ = i_145_ + i_146_ + 1;
		if (i_150_ > anInt4492) {
			i_150_ = anInt4492;
		}
		int i_151_ = i_149_;
		final int i_152_ = i_146_ * i_146_;
		int i_153_ = 0;
		int i_154_ = i_145_ - i_151_;
		int i_155_ = i_154_ * i_154_;
		int i_156_ = i_155_ - i_154_;
		if (i_145_ > i_150_) {
			i_145_ = i_150_;
		}
		final int i_157_ = i_147_ >>> 24;
		if (i_148_ == 0 || i_148_ == 1 && i_157_ == 255) {
			while (i_151_ < i_145_) {
				for (/**/; i_156_ <= i_152_ || i_155_ <= i_152_; i_156_ += i_153_++
						+ i_153_) {
					i_155_ += i_153_ + i_153_;
				}
				int i_158_ = i - i_153_ + 1;
				if (i_158_ < anInt4509) {
					i_158_ = anInt4509;
				}
				int i_159_ = i + i_153_;
				if (i_159_ > anInt4507) {
					i_159_ = anInt4507;
				}
				int i_160_ = i_158_ + i_151_ * anInt4505;
				for (int i_161_ = i_158_; i_161_ < i_159_; i_161_++) {
					anIntArray4504[i_160_++] = i_147_;
				}
				i_151_++;
				i_155_ -= i_154_-- + i_154_;
				i_156_ -= i_154_ + i_154_;
			}
			i_153_ = i_146_;
			i_154_ = i_151_ - i_145_;
			i_156_ = i_154_ * i_154_ + i_152_;
			i_155_ = i_156_ - i_153_;
			i_156_ -= i_154_;
			while (i_151_ < i_150_) {
				for (/**/; i_156_ > i_152_ && i_155_ > i_152_; i_155_ -= i_153_
						+ i_153_) {
					i_156_ -= i_153_-- + i_153_;
				}
				int i_162_ = i - i_153_;
				if (i_162_ < anInt4509) {
					i_162_ = anInt4509;
				}
				int i_163_ = i + i_153_;
				if (i_163_ > anInt4507 - 1) {
					i_163_ = anInt4507 - 1;
				}
				int i_164_ = i_162_ + i_151_ * anInt4505;
				for (int i_165_ = i_162_; i_165_ <= i_163_; i_165_++) {
					anIntArray4504[i_164_++] = i_147_;
				}
				i_151_++;
				i_156_ += i_154_ + i_154_;
				i_155_ += i_154_++ + i_154_;
			}
		} else if (i_148_ == 1) {
			i_147_ = (((i_147_ & 0xff00ff) * i_157_ >> 8 & 0xff00ff)
					+ ((i_147_ & 0xff00) * i_157_ >> 8 & 0xff00) + (i_157_ << 24));
			final int i_166_ = 256 - i_157_;
			while (i_151_ < i_145_) {
				for (/**/; i_156_ <= i_152_ || i_155_ <= i_152_; i_156_ += i_153_++
						+ i_153_) {
					i_155_ += i_153_ + i_153_;
				}
				int i_167_ = i - i_153_ + 1;
				if (i_167_ < anInt4509) {
					i_167_ = anInt4509;
				}
				int i_168_ = i + i_153_;
				if (i_168_ > anInt4507) {
					i_168_ = anInt4507;
				}
				int i_169_ = i_167_ + i_151_ * anInt4505;
				for (int i_170_ = i_167_; i_170_ < i_168_; i_170_++) {
					int i_171_ = anIntArray4504[i_169_];
					i_171_ = (((i_171_ & 0xff00ff) * i_166_ >> 8 & 0xff00ff) + ((i_171_ & 0xff00)
							* i_166_ >> 8 & 0xff00));
					anIntArray4504[i_169_++] = i_147_ + i_171_;
				}
				i_151_++;
				i_155_ -= i_154_-- + i_154_;
				i_156_ -= i_154_ + i_154_;
			}
			i_153_ = i_146_;
			i_154_ = -i_154_;
			i_156_ = i_154_ * i_154_ + i_152_;
			i_155_ = i_156_ - i_153_;
			i_156_ -= i_154_;
			while (i_151_ < i_150_) {
				for (/**/; i_156_ > i_152_ && i_155_ > i_152_; i_155_ -= i_153_
						+ i_153_) {
					i_156_ -= i_153_-- + i_153_;
				}
				int i_172_ = i - i_153_;
				if (i_172_ < anInt4509) {
					i_172_ = anInt4509;
				}
				int i_173_ = i + i_153_;
				if (i_173_ > anInt4507 - 1) {
					i_173_ = anInt4507 - 1;
				}
				int i_174_ = i_172_ + i_151_ * anInt4505;
				for (int i_175_ = i_172_; i_175_ <= i_173_; i_175_++) {
					int i_176_ = anIntArray4504[i_174_];
					i_176_ = (((i_176_ & 0xff00ff) * i_166_ >> 8 & 0xff00ff) + ((i_176_ & 0xff00)
							* i_166_ >> 8 & 0xff00));
					anIntArray4504[i_174_++] = i_147_ + i_176_;
				}
				i_151_++;
				i_156_ += i_154_ + i_154_;
				i_155_ += i_154_++ + i_154_;
			}
		} else if (i_148_ == 2) {
			while (i_151_ < i_145_) {
				for (/**/; i_156_ <= i_152_ || i_155_ <= i_152_; i_156_ += i_153_++
						+ i_153_) {
					i_155_ += i_153_ + i_153_;
				}
				int i_177_ = i - i_153_ + 1;
				if (i_177_ < anInt4509) {
					i_177_ = anInt4509;
				}
				int i_178_ = i + i_153_;
				if (i_178_ > anInt4507) {
					i_178_ = anInt4507;
				}
				int i_179_ = i_177_ + i_151_ * anInt4505;
				for (int i_180_ = i_177_; i_180_ < i_178_; i_180_++) {
					int i_181_ = anIntArray4504[i_179_];
					final int i_182_ = i_147_ + i_181_;
					final int i_183_ = (i_147_ & 0xff00ff)
							+ (i_181_ & 0xff00ff);
					i_181_ = (i_183_ & 0x1000100) + (i_182_ - i_183_ & 0x10000);
					anIntArray4504[i_179_++] = i_182_ - i_181_ | i_181_
							- (i_181_ >>> 8);
				}
				i_151_++;
				i_155_ -= i_154_-- + i_154_;
				i_156_ -= i_154_ + i_154_;
			}
			i_153_ = i_146_;
			i_154_ = -i_154_;
			i_156_ = i_154_ * i_154_ + i_152_;
			i_155_ = i_156_ - i_153_;
			i_156_ -= i_154_;
			while (i_151_ < i_150_) {
				for (/**/; i_156_ > i_152_ && i_155_ > i_152_; i_155_ -= i_153_
						+ i_153_) {
					i_156_ -= i_153_-- + i_153_;
				}
				int i_184_ = i - i_153_;
				if (i_184_ < anInt4509) {
					i_184_ = anInt4509;
				}
				int i_185_ = i + i_153_;
				if (i_185_ > anInt4507 - 1) {
					i_185_ = anInt4507 - 1;
				}
				int i_186_ = i_184_ + i_151_ * anInt4505;
				for (int i_187_ = i_184_; i_187_ <= i_185_; i_187_++) {
					int i_188_ = anIntArray4504[i_186_];
					final int i_189_ = i_147_ + i_188_;
					final int i_190_ = (i_147_ & 0xff00ff)
							+ (i_188_ & 0xff00ff);
					i_188_ = (i_190_ & 0x1000100) + (i_189_ - i_190_ & 0x10000);
					anIntArray4504[i_186_++] = i_189_ - i_188_ | i_188_
							- (i_188_ >>> 8);
				}
				i_151_++;
				i_156_ += i_154_ + i_154_;
				i_155_ += i_154_++ + i_154_;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	final void method1740(final Interface17 interface17) {
		final Class186 class186 = (Class186) interface17;
		anInt4505 = class186.anInt3426;
		anInt4480 = class186.anInt3430;
		anIntArray4504 = class186.anIntArray3427;
		aClass186_4499 = class186;
		anInt4512 = class186.anInt3426;
		anInt4485 = class186.anInt3430;
		aFloatArray4487 = class186.aFloatArray3429;
		method1911();
	}

	private final void method1916(final int i, int i_191_, final int i_192_,
			int i_193_, int i_194_, final int i_195_) {
		if (i_193_ < 0) {
			i_193_ = -i_193_;
		}
		int i_196_ = i_191_ - i_193_;
		if (i_196_ < anInt4495) {
			i_196_ = anInt4495;
		}
		int i_197_ = i_191_ + i_193_ + 1;
		if (i_197_ > anInt4492) {
			i_197_ = anInt4492;
		}
		int i_198_ = i_196_;
		final int i_199_ = i_193_ * i_193_;
		int i_200_ = 0;
		int i_201_ = i_191_ - i_198_;
		int i_202_ = i_201_ * i_201_;
		int i_203_ = i_202_ - i_201_;
		if (i_191_ > i_197_) {
			i_191_ = i_197_;
		}
		final int i_204_ = i_194_ >>> 24;
		if (i_195_ == 0 || i_195_ == 1 && i_204_ == 255) {
			while (i_198_ < i_191_) {
				for (/**/; i_203_ <= i_199_ || i_202_ <= i_199_; i_203_ += i_200_++
						+ i_200_) {
					i_202_ += i_200_ + i_200_;
				}
				int i_205_ = i - i_200_ + 1;
				if (i_205_ < anInt4509) {
					i_205_ = anInt4509;
				}
				int i_206_ = i + i_200_;
				if (i_206_ > anInt4507) {
					i_206_ = anInt4507;
				}
				int i_207_ = i_205_ + i_198_ * anInt4505;
				for (int i_208_ = i_205_; i_208_ < i_206_; i_208_++) {
					if (i_192_ < aFloatArray4487[i_207_]) {
						anIntArray4504[i_207_] = i_194_;
					}
					i_207_++;
				}
				i_198_++;
				i_202_ -= i_201_-- + i_201_;
				i_203_ -= i_201_ + i_201_;
			}
			i_200_ = i_193_;
			i_201_ = i_198_ - i_191_;
			i_203_ = i_201_ * i_201_ + i_199_;
			i_202_ = i_203_ - i_200_;
			i_203_ -= i_201_;
			while (i_198_ < i_197_) {
				for (/**/; i_203_ > i_199_ && i_202_ > i_199_; i_202_ -= i_200_
						+ i_200_) {
					i_203_ -= i_200_-- + i_200_;
				}
				int i_209_ = i - i_200_;
				if (i_209_ < anInt4509) {
					i_209_ = anInt4509;
				}
				int i_210_ = i + i_200_;
				if (i_210_ > anInt4507 - 1) {
					i_210_ = anInt4507 - 1;
				}
				int i_211_ = i_209_ + i_198_ * anInt4505;
				for (int i_212_ = i_209_; i_212_ <= i_210_; i_212_++) {
					if (i_192_ < aFloatArray4487[i_211_]) {
						anIntArray4504[i_211_] = i_194_;
					}
					i_211_++;
				}
				i_198_++;
				i_203_ += i_201_ + i_201_;
				i_202_ += i_201_++ + i_201_;
			}
		} else if (i_195_ == 1) {
			i_194_ = (((i_194_ & 0xff00ff) * i_204_ >> 8 & 0xff00ff)
					+ ((i_194_ & 0xff00) * i_204_ >> 8 & 0xff00) + (i_204_ << 24));
			final int i_213_ = 256 - i_204_;
			while (i_198_ < i_191_) {
				for (/**/; i_203_ <= i_199_ || i_202_ <= i_199_; i_203_ += i_200_++
						+ i_200_) {
					i_202_ += i_200_ + i_200_;
				}
				int i_214_ = i - i_200_ + 1;
				if (i_214_ < anInt4509) {
					i_214_ = anInt4509;
				}
				int i_215_ = i + i_200_;
				if (i_215_ > anInt4507) {
					i_215_ = anInt4507;
				}
				int i_216_ = i_214_ + i_198_ * anInt4505;
				for (int i_217_ = i_214_; i_217_ < i_215_; i_217_++) {
					if (i_192_ < aFloatArray4487[i_216_]) {
						int i_218_ = anIntArray4504[i_216_];
						i_218_ = (((i_218_ & 0xff00ff) * i_213_ >> 8 & 0xff00ff) + ((i_218_ & 0xff00)
								* i_213_ >> 8 & 0xff00));
						anIntArray4504[i_216_] = i_194_ + i_218_;
					}
					i_216_++;
				}
				i_198_++;
				i_202_ -= i_201_-- + i_201_;
				i_203_ -= i_201_ + i_201_;
			}
			i_200_ = i_193_;
			i_201_ = -i_201_;
			i_203_ = i_201_ * i_201_ + i_199_;
			i_202_ = i_203_ - i_200_;
			i_203_ -= i_201_;
			while (i_198_ < i_197_) {
				for (/**/; i_203_ > i_199_ && i_202_ > i_199_; i_202_ -= i_200_
						+ i_200_) {
					i_203_ -= i_200_-- + i_200_;
				}
				int i_219_ = i - i_200_;
				if (i_219_ < anInt4509) {
					i_219_ = anInt4509;
				}
				int i_220_ = i + i_200_;
				if (i_220_ > anInt4507 - 1) {
					i_220_ = anInt4507 - 1;
				}
				int i_221_ = i_219_ + i_198_ * anInt4505;
				for (int i_222_ = i_219_; i_222_ <= i_220_; i_222_++) {
					if (i_192_ < aFloatArray4487[i_221_]) {
						int i_223_ = anIntArray4504[i_221_];
						i_223_ = (((i_223_ & 0xff00ff) * i_213_ >> 8 & 0xff00ff) + ((i_223_ & 0xff00)
								* i_213_ >> 8 & 0xff00));
						anIntArray4504[i_221_] = i_194_ + i_223_;
					}
					i_221_++;
				}
				i_198_++;
				i_203_ += i_201_ + i_201_;
				i_202_ += i_201_++ + i_201_;
			}
		} else if (i_195_ == 2) {
			while (i_198_ < i_191_) {
				for (/**/; i_203_ <= i_199_ || i_202_ <= i_199_; i_203_ += i_200_++
						+ i_200_) {
					i_202_ += i_200_ + i_200_;
				}
				int i_224_ = i - i_200_ + 1;
				if (i_224_ < anInt4509) {
					i_224_ = anInt4509;
				}
				int i_225_ = i + i_200_;
				if (i_225_ > anInt4507) {
					i_225_ = anInt4507;
				}
				int i_226_ = i_224_ + i_198_ * anInt4505;
				for (int i_227_ = i_224_; i_227_ < i_225_; i_227_++) {
					if (i_192_ < aFloatArray4487[i_226_]) {
						int i_228_ = anIntArray4504[i_226_];
						final int i_229_ = i_194_ + i_228_;
						final int i_230_ = (i_194_ & 0xff00ff)
								+ (i_228_ & 0xff00ff);
						i_228_ = (i_230_ & 0x1000100)
								+ (i_229_ - i_230_ & 0x10000);
						anIntArray4504[i_226_] = i_229_ - i_228_ | i_228_
								- (i_228_ >>> 8);
					}
					i_226_++;
				}
				i_198_++;
				i_202_ -= i_201_-- + i_201_;
				i_203_ -= i_201_ + i_201_;
			}
			i_200_ = i_193_;
			i_201_ = -i_201_;
			i_203_ = i_201_ * i_201_ + i_199_;
			i_202_ = i_203_ - i_200_;
			i_203_ -= i_201_;
			while (i_198_ < i_197_) {
				for (/**/; i_203_ > i_199_ && i_202_ > i_199_; i_202_ -= i_200_
						+ i_200_) {
					i_203_ -= i_200_-- + i_200_;
				}
				int i_231_ = i - i_200_;
				if (i_231_ < anInt4509) {
					i_231_ = anInt4509;
				}
				int i_232_ = i + i_200_;
				if (i_232_ > anInt4507 - 1) {
					i_232_ = anInt4507 - 1;
				}
				int i_233_ = i_231_ + i_198_ * anInt4505;
				for (int i_234_ = i_231_; i_234_ <= i_232_; i_234_++) {
					if (i_192_ < aFloatArray4487[i_233_]) {
						int i_235_ = anIntArray4504[i_233_];
						final int i_236_ = i_194_ + i_235_;
						final int i_237_ = (i_194_ & 0xff00ff)
								+ (i_235_ & 0xff00ff);
						i_235_ = (i_237_ & 0x1000100)
								+ (i_236_ - i_237_ & 0x10000);
						anIntArray4504[i_233_] = i_236_ - i_235_ | i_235_
								- (i_235_ >>> 8);
					}
					i_233_++;
				}
				i_198_++;
				i_203_ += i_201_ + i_201_;
				i_202_ += i_201_++ + i_201_;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	final Interface13 method1744(final int i, final int i_238_) {
		return new Class333(i, i_238_);
	}

	@Override
	final void method1807(final int i) {
		aClass235Array4483[i].method2889((byte) 34, Thread.currentThread());
	}

	@Override
	final Class146 method1790(final Model model, final int i,
			final int i_239_, final int i_240_, final int i_241_) {
		return new Class146_Sub1(this, model, i, i_240_, i_241_, i_239_);
	}

	@Override
	final Class332 method1739(final int i, final int i_242_, final boolean bool) {
		if (bool) {
			return new Class332_Sub3_Sub1(this, i, i_242_);
		}
		return new Class332_Sub3_Sub2(this, i, i_242_);
	}

	@Override
	final void L(final int i, final int i_243_, final int i_244_) {
		for (int i_245_ = 0; i_245_ < aClass235Array4483.length; i_245_++) {
			final Class235 class235 = aClass235Array4483[i_245_];
			class235.anInt1763 = i & 0xffffff;
			int i_246_ = class235.anInt1763 >>> 16 & 0xff;
			if (i_246_ < 2) {
				i_246_ = 2;
			}
			int i_247_ = class235.anInt1763 >> 8 & 0xff;
			if (i_247_ < 2) {
				i_247_ = 2;
			}
			int i_248_ = class235.anInt1763 & 0xff;
			if (i_248_ < 2) {
				i_248_ = 2;
			}
			class235.anInt1763 = i_246_ << 16 | i_247_ << 8 | i_248_;
			if (i_243_ < 0) {
				class235.aBoolean1758 = false;
			} else {
				class235.aBoolean1758 = true;
			}
		}
	}

	@Override
	final Class43 method1804(final Class197 class197,
			final Class324[] class324s, final boolean bool) {
		final int[] is = new int[class324s.length];
		final int[] is_249_ = new int[class324s.length];
		boolean bool_250_ = false;
		for (int i = 0; i < class324s.length; i++) {
			is[i] = class324s[i].anInt2722;
			is_249_[i] = class324s[i].anInt2720;
			if (class324s[i].aByteArray2723 != null) {
				bool_250_ = true;
			}
		}
		if (bool) {
			if (bool_250_) {
				return new Class43_Sub3(this, class197, class324s, is, is_249_);
			}
			return new Class43_Sub5(this, class197, class324s, is, is_249_);
		}
		if (bool_250_) {
			throw new IllegalArgumentException("");
		}
		return new Class43_Sub4(this, class197, class324s, is, is_249_);
	}

	@Override
	final void method1746(final int i, final int i_251_, final int i_252_,
			final int i_253_) {
		/* empty */
	}

	private final void method1917(final int i, final int i_254_,
			final int i_255_, int i_256_, final int i_257_, final int i_258_,
			final int i_259_, final int i_260_) {
		if (i >= anInt4509 && i < anInt4507) {
			final int i_261_ = i + i_254_ * anInt4505;
			final int i_262_ = i_256_ >>> 24;
			final int i_263_ = i_258_ + i_259_;
			int i_264_ = i_260_ % i_263_;
			if (i_257_ == 0 || i_257_ == 1 && i_262_ == 255) {
				int i_265_ = 0;
				while (i_265_ < i_255_) {
					if (i_254_ + i_265_ >= anInt4495
							&& i_254_ + i_265_ < anInt4492 && i_264_ < i_258_) {
						anIntArray4504[i_261_ + i_265_ * anInt4505] = i_256_;
					}
					i_265_++;
					i_264_ = ++i_264_ % i_263_;
				}
			} else if (i_257_ == 1) {
				i_256_ = (((i_256_ & 0xff00ff) * i_262_ >> 8 & 0xff00ff)
						+ ((i_256_ & 0xff00) * i_262_ >> 8 & 0xff00) + (i_262_ << 24));
				final int i_266_ = 256 - i_262_;
				int i_267_ = 0;
				while (i_267_ < i_255_) {
					if (i_254_ + i_267_ >= anInt4495
							&& i_254_ + i_267_ < anInt4492 && i_264_ < i_258_) {
						final int i_268_ = i_261_ + i_267_ * anInt4505;
						int i_269_ = anIntArray4504[i_268_];
						i_269_ = (((i_269_ & 0xff00ff) * i_266_ >> 8 & 0xff00ff) + ((i_269_ & 0xff00)
								* i_266_ >> 8 & 0xff00));
						anIntArray4504[i_268_] = i_256_ + i_269_;
					}
					i_267_++;
					i_264_ = ++i_264_ % i_263_;
				}
			} else if (i_257_ == 2) {
				int i_270_ = 0;
				while (i_270_ < i_255_) {
					if (i_254_ + i_270_ >= anInt4495
							&& i_254_ + i_270_ < anInt4492 && i_264_ < i_258_) {
						final int i_271_ = i_261_ + i_270_ * anInt4505;
						int i_272_ = anIntArray4504[i_271_];
						final int i_273_ = i_256_ + i_272_;
						final int i_274_ = (i_256_ & 0xff00ff)
								+ (i_272_ & 0xff00ff);
						i_272_ = (i_274_ & 0x1000100)
								+ (i_273_ - i_274_ & 0x10000);
						anIntArray4504[i_271_] = i_273_ - i_272_ | i_272_
								- (i_272_ >>> 8);
					}
					i_270_++;
					i_264_ = ++i_264_ % i_263_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@Override
	final void method1775(final Class48 class48) {
		/* empty */
	}

	@Override
	final void ya() {
		if (anInt4509 == 0 && anInt4507 == anInt4505 && anInt4495 == 0
				&& anInt4492 == anInt4480) {
			final int i = aFloatArray4487.length;
			final int i_275_ = i - (i & 0x7);
			int i_276_ = 0;
			while (i_276_ < i_275_) {
				aFloatArray4487[i_276_++] = 2.14748365E9F;
				aFloatArray4487[i_276_++] = 2.14748365E9F;
				aFloatArray4487[i_276_++] = 2.14748365E9F;
				aFloatArray4487[i_276_++] = 2.14748365E9F;
				aFloatArray4487[i_276_++] = 2.14748365E9F;
				aFloatArray4487[i_276_++] = 2.14748365E9F;
				aFloatArray4487[i_276_++] = 2.14748365E9F;
				aFloatArray4487[i_276_++] = 2.14748365E9F;
			}
			while (i_276_ < i) {
				aFloatArray4487[i_276_++] = 2.14748365E9F;
			}
		} else {
			int i = anInt4507 - anInt4509;
			final int i_277_ = anInt4492 - anInt4495;
			final int i_278_ = anInt4505 - i;
			final int i_279_ = (anInt4509 + anInt4495 * anInt4505);
			final int i_280_ = i >> 3;
			final int i_281_ = i & 0x7;
			i = i_279_ - 1;
			for (int i_282_ = -i_277_; i_282_ < 0; i_282_++) {
				if (i_280_ > 0) {
					int i_283_ = i_280_;
					do {
						aFloatArray4487[++i] = 2.14748365E9F;
						aFloatArray4487[++i] = 2.14748365E9F;
						aFloatArray4487[++i] = 2.14748365E9F;
						aFloatArray4487[++i] = 2.14748365E9F;
						aFloatArray4487[++i] = 2.14748365E9F;
						aFloatArray4487[++i] = 2.14748365E9F;
						aFloatArray4487[++i] = 2.14748365E9F;
						aFloatArray4487[++i] = 2.14748365E9F;
					} while (--i_283_ > 0);
				}
				if (i_281_ > 0) {
					int i_284_ = i_281_;
					do {
						aFloatArray4487[++i] = 2.14748365E9F;
					} while (--i_284_ > 0);
				}
				i += i_278_;
			}
		}
	}

	@Override
	final boolean method1771() {
		return false;
	}

	@Override
	final boolean method1768() {
		return false;
	}

	final boolean method1918(final int i) {
		return ((ha) this).aD938.method8(-14, i);
	}

	@Override
	final Class111 method1821() {
		return new Class111_Sub2();
	}

	@Override
	final void f(final int i, final int i_285_) {
		final Class235 class235 = method1921(Thread.currentThread());
		anInt4502 = i;
		anInt4484 = i_285_;
		class235.anInt1761 = anInt4484 - 255;
	}

	@Override
	final void C(final boolean bool) {
		final Class235 class235 = method1921(Thread.currentThread());
		class235.aBoolean1762 = bool;
	}

	@Override
	final void A(final int i, final aa var_aa, final int i_286_, int i_287_) {
		final aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		final int[] is = var_aa_Sub1.anIntArray3555;
		final int[] is_288_ = var_aa_Sub1.anIntArray3557;
		int i_289_;
		if (anInt4492 < i_287_ + is.length) {
			i_289_ = anInt4492 - i_287_;
		} else {
			i_289_ = is.length;
		}
		int i_290_;
		if (anInt4495 > i_287_) {
			i_290_ = anInt4495 - i_287_;
			i_287_ = anInt4495;
		} else {
			i_290_ = 0;
		}
		if (i_289_ - i_290_ > 0) {
			int i_291_ = i_287_ * anInt4505;
			for (int i_292_ = i_290_; i_292_ < i_289_; i_292_++) {
				int i_293_ = i_286_ + is[i_292_];
				int i_294_ = is_288_[i_292_];
				if (anInt4509 > i_293_) {
					i_294_ -= anInt4509 - i_293_;
					i_293_ = anInt4509;
				}
				if (anInt4507 < i_293_ + i_294_) {
					i_294_ = anInt4507 - i_293_;
				}
				i_293_ += i_291_;
				for (int i_295_ = -i_294_; i_295_ < 0; i_295_++) {
					anIntArray4504[i_293_++] = i;
				}
				i_291_ += anInt4505;
			}
		}
	}

	@Override
	final boolean method1823() {
		return false;
	}

	@Override
	final void K(final int[] is) {
		is[0] = anInt4509;
		is[1] = anInt4495;
		is[2] = anInt4507;
		is[3] = anInt4492;
	}

	@Override
	final Class111 method1793() {
		final Class235 class235 = method1921(Thread.currentThread());
		return class235.aClass111_Sub2_1760;
	}

	@Override
	final void method1776() {
		if (aCanvas4479 != null) {
			anIntArray4504 = (aClass98_Sub32_4478.anIntArray4108);
			anInt4505 = (aClass98_Sub32_4478.anInt4105);
			anInt4480 = (aClass98_Sub32_4478.anInt4110);
			aFloatArray4487 = aFloatArray4488;
			anInt4512 = anInt4496;
			anInt4485 = anInt4503;
		} else {
			anInt4505 = 1;
			anInt4480 = 1;
			anIntArray4504 = null;
			anInt4512 = 1;
			anInt4485 = 1;
			aFloatArray4487 = null;
		}
		aClass186_4499 = null;
		method1911();
	}

	@Override
	final Class62 method1799() {
		return new Class62(0, "Pure Java", 1, "CPU", 0L);
	}

	@Override
	final int[] Y() {
		return (new int[] { anInt4510, anInt4511, anInt4514, anInt4490 });
	}

	@Override
	final boolean method1747() {
		return true;
	}

	@Override
	final void pa() {
		for (int i = 0; i < aClass235Array4483.length; i++) {
			aClass235Array4483[i].anInt1763 = aClass235Array4483[i].anInt1755;
			aClass235Array4483[i].aBoolean1759 = false;
		}
	}

	@Override
	final void X(final int i) {
		/* empty */
	}

	@Override
	final void method1741(final Canvas canvas, final int i, final int i_296_) {
		Class98_Sub32 class98_sub32 = ((Class98_Sub32) aClass377_4476
				.method3990(canvas.hashCode(), -1));
		if (class98_sub32 == null) {
			class98_sub32 = Class64_Sub23.method646(i_296_, i, canvas,
					(byte) -128);
			aClass377_4476.method3996(class98_sub32, canvas.hashCode(), -1);
		} else if (class98_sub32.anInt4105 != i
				|| class98_sub32.anInt4110 != i_296_) {
			method1782(canvas, i, i_296_);
		}
	}

	@Override
	final za method1762(final int i) {
		return null;
	}

	@Override
	final int E() {
		return 0;
	}

	@Override
	final s a(final int i, final int i_297_, final int[][] is,
			final int[][] is_298_, final int i_299_, final int i_300_,
			final int i_301_) {
		return new s_Sub3(this, i_300_, i_301_, i, i_297_, is, is_298_, i_299_);
	}

	final int[] method1919(final int i) {
		Class98_Sub2 class98_sub2;
		synchronized (aClass79_4494) {
			class98_sub2 = (Class98_Sub2) aClass79_4494.method802(-123, i);
			if (class98_sub2 == null) {
				if (!((ha) this).aD938.method8(71, i)) {
					return null;
				}
				final TextureDefinition textureDefinition = ((ha) this).aD938.method11(i, -28755);
				final int i_302_ = (textureDefinition.aBoolean1822 || aBoolean4491 ? 64
						: anInt4482);
				class98_sub2 = new Class98_Sub2(i, i_302_,
						((ha) this).aD938.method9(i, (byte) -125, i_302_, 0.7F,
								true, i_302_), textureDefinition.anInt1818 != 1);
				aClass79_4494.method805(i, class98_sub2, (byte) -80);
			}
		}
		class98_sub2.aBoolean3817 = true;
		return class98_sub2.method948();
	}

	final boolean method1920() {
		return aBoolean4472;
	}

	@Override
	final void method1750(final Canvas canvas) {
		if (canvas != null) {
			final Class98_Sub32 class98_sub32 = ((Class98_Sub32) aClass377_4476
					.method3990(canvas.hashCode(), -1));
			if (class98_sub32 != null) {
				aCanvas4479 = canvas;
				final Dimension dimension = canvas.getSize();
				anInt4474 = dimension.width;
				anInt4477 = dimension.height;
				aClass98_Sub32_4478 = class98_sub32;
				if (aClass186_4499 == null) {
					anIntArray4504 = class98_sub32.anIntArray4108;
					anInt4505 = class98_sub32.anInt4105;
					anInt4480 = class98_sub32.anInt4110;
					if (anInt4505 != anInt4512 || anInt4480 != anInt4485) {
						anInt4496 = anInt4512 = anInt4505;
						anInt4503 = anInt4485 = anInt4480;
						aFloatArray4488 = aFloatArray4487 = new float[anInt4512
								* anInt4485];
					}
					method1911();
				}
			}
		} else {
			aCanvas4479 = null;
			aClass98_Sub32_4478 = null;
			if (aClass186_4499 == null) {
				anIntArray4504 = null;
				anInt4505 = anInt4480 = 1;
				anInt4512 = anInt4485 = 1;
				method1911();
			}
		}
	}

	@Override
	final void method1761(final boolean bool) {
		/* empty */
	}

	@Override
	final void method1817() {
		/* empty */
	}

	final Class235 method1921(final Runnable runnable) {
		for (int i = 0; i < anInt4508; i++) {
			if (aClass235Array4483[i].aRunnable1752 == runnable) {
				return aClass235Array4483[i];
			}
		}
		return null;
	}

	@Override
	final int JA(final int i, final int i_303_, final int i_304_,
			final int i_305_, final int i_306_, final int i_307_) {
		int i_308_ = 0;
		float f = ((aClass111_Sub2_4513.aFloat4693) * i
				+ (aClass111_Sub2_4513.aFloat4698) * i_303_
				+ (aClass111_Sub2_4513.aFloat4694) * i_304_ + (aClass111_Sub2_4513.aFloat4689));
		if (f < 1.0F) {
			f = 1.0F;
		}
		float f_309_ = ((aClass111_Sub2_4513.aFloat4693) * i_305_
				+ (aClass111_Sub2_4513.aFloat4698) * i_306_
				+ (aClass111_Sub2_4513.aFloat4694) * i_307_ + (aClass111_Sub2_4513.aFloat4689));
		if (f_309_ < 1.0F) {
			f_309_ = 1.0F;
		}
		if (f < anInt4502 && f_309_ < anInt4502) {
			i_308_ |= 0x10;
		} else if (f > anInt4484 && f_309_ > anInt4484) {
			i_308_ |= 0x20;
		}
		final int i_310_ = (int) (anInt4514
				* ((aClass111_Sub2_4513.aFloat4700) * i
						+ (aClass111_Sub2_4513.aFloat4699 * i_303_)
						+ (aClass111_Sub2_4513.aFloat4690 * i_304_) + aClass111_Sub2_4513.aFloat4697) / f);
		final int i_311_ = (int) (anInt4514
				* ((aClass111_Sub2_4513.aFloat4700) * i_305_
						+ (aClass111_Sub2_4513.aFloat4699 * i_306_)
						+ (aClass111_Sub2_4513.aFloat4690 * i_307_) + aClass111_Sub2_4513.aFloat4697) / f_309_);
		if (i_310_ < anInt4486 && i_311_ < anInt4486) {
			i_308_ |= 0x1;
		} else if (i_310_ > anInt4517 && i_311_ > anInt4517) {
			i_308_ |= 0x2;
		}
		final int i_312_ = (int) (anInt4490
				* ((aClass111_Sub2_4513.aFloat4692) * i
						+ (aClass111_Sub2_4513.aFloat4688 * i_303_)
						+ (aClass111_Sub2_4513.aFloat4696 * i_304_) + aClass111_Sub2_4513.aFloat4691) / f);
		final int i_313_ = (int) (anInt4490
				* ((aClass111_Sub2_4513.aFloat4692) * i_305_
						+ (aClass111_Sub2_4513.aFloat4688 * i_306_)
						+ (aClass111_Sub2_4513.aFloat4696 * i_307_) + aClass111_Sub2_4513.aFloat4691) / f_309_);
		if (i_312_ < anInt4518 && i_313_ < anInt4518) {
			i_308_ |= 0x4;
		} else if (i_312_ > anInt4506 && i_313_ > anInt4506) {
			i_308_ |= 0x8;
		}
		return i_308_;
	}

	@Override
	final void a(final Class111 class111) {
		aClass111_Sub2_4513 = (Class111_Sub2) class111;
	}

	final boolean method1922(final int i) {
		if (!((ha) this).aD938.method11(i, -28755).aBoolean1826
				&& !(((ha) this).aD938.method11(i, -28755).aBoolean1819)) {
			return false;
		}
		return true;
	}

	@Override
	final Class48 method1769(final Class48 class48, final Class48 class48_314_,
			final float f, final Class48 class48_315_) {
		return null;
	}

	@Override
	final void T(final int i, final int i_316_, final int i_317_,
			final int i_318_) {
		if (anInt4509 < i) {
			anInt4509 = i;
		}
		if (anInt4495 < i_316_) {
			anInt4495 = i_316_;
		}
		if (anInt4507 > i_317_) {
			anInt4507 = i_317_;
		}
		if (anInt4492 > i_318_) {
			anInt4492 = i_318_;
		}
		method1913();
	}

	@Override
	final void method1811(int i, int i_319_, int i_320_, int i_321_,
			int i_322_, final int i_323_, int i_324_, int i_325_, int i_326_) {
		i_320_ -= i;
		i_321_ -= i_319_;
		if (i_321_ == 0) {
			if (i_320_ >= 0) {
				method1924(i, i_319_, i_320_ + 1, i_322_, i_323_, i_324_,
						i_325_, i_326_);
			} else {
				final int i_327_ = i_324_ + i_325_;
				i_326_ %= i_327_;
				i_326_ = i_327_ + i_324_ - i_326_ - (-i_320_ + 1) % i_327_;
				i_326_ %= i_327_;
				if (i_326_ < 0) {
					i_326_ += i_327_;
				}
				method1924(i + i_320_, i_319_, -i_320_ + 1, i_322_, i_323_,
						i_324_, i_325_, i_326_);
			}
		} else if (i_320_ == 0) {
			if (i_321_ >= 0) {
				method1917(i, i_319_, i_321_ + 1, i_322_, i_323_, i_324_,
						i_325_, i_326_);
			} else {
				final int i_328_ = i_324_ + i_325_;
				i_326_ %= i_328_;
				i_326_ = i_328_ + i_324_ - i_326_ - (-i_321_ + 1) % i_328_;
				i_326_ %= i_328_;
				if (i_326_ < 0) {
					i_326_ += i_328_;
				}
				method1917(i, i_319_ + i_321_, -i_321_ + 1, i_322_, i_323_,
						i_324_, i_325_, i_326_);
			}
		} else {
			i_326_ <<= 8;
			i_324_ <<= 8;
			i_325_ <<= 8;
			final int i_329_ = i_324_ + i_325_;
			i_326_ %= i_329_;
			if (i_320_ + i_321_ < 0) {
				final int i_330_ = (int) (Math.sqrt(i_320_ * i_320_ + i_321_
						* i_321_) * 256.0);
				final int i_331_ = i_330_ % i_329_;
				i_326_ = i_329_ + i_324_ - i_326_ - i_331_;
				i_326_ %= i_329_;
				if (i_326_ < 0) {
					i_326_ += i_329_;
				}
				i += i_320_;
				i_320_ = -i_320_;
				i_319_ += i_321_;
				i_321_ = -i_321_;
			}
			if (i_320_ > i_321_) {
				i_319_ <<= 16;
				i_319_ += 32768;
				i_321_ <<= 16;
				final int i_332_ = (int) Math.floor((double) i_321_
						/ (double) i_320_ + 0.5);
				i_320_ += i;
				final int i_333_ = i_322_ >>> 24;
				final int i_334_ = (int) Math.sqrt(65536 + (i_332_ >> 8)
						* (i_332_ >> 8));
				if (i_323_ == 0 || i_323_ == 1 && i_333_ == 255) {
					while (i <= i_320_) {
						final int i_335_ = i_319_ >> 16;
						if (i >= anInt4509 && i < anInt4507
								&& i_335_ >= anInt4495 && i_335_ < anInt4492
								&& i_326_ < i_324_) {
							anIntArray4504[i + i_335_ * anInt4505] = i_322_;
						}
						i_319_ += i_332_;
						i++;
						i_326_ += i_334_;
						i_326_ %= i_329_;
					}
					return;
				}
				if (i_323_ == 1) {
					i_322_ = (((i_322_ & 0xff00ff) * i_333_ >> 8 & 0xff00ff)
							+ ((i_322_ & 0xff00) * i_333_ >> 8 & 0xff00) + (i_333_ << 24));
					final int i_336_ = 256 - i_333_;
					while (i <= i_320_) {
						final int i_337_ = i_319_ >> 16;
						if (i >= anInt4509 && i < anInt4507
								&& i_337_ >= anInt4495 && i_337_ < anInt4492
								&& i_326_ < i_324_) {
							final int i_338_ = i + i_337_ * anInt4505;
							int i_339_ = anIntArray4504[i_338_];
							i_339_ = (((i_339_ & 0xff00ff) * i_336_ >> 8 & 0xff00ff) + ((i_339_ & 0xff00)
									* i_336_ >> 8 & 0xff00));
							anIntArray4504[i_338_] = i_322_ + i_339_;
						}
						i_319_ += i_332_;
						i++;
						i_326_ += i_334_;
						i_326_ %= i_329_;
					}
					return;
				}
				if (i_323_ == 2) {
					while (i <= i_320_) {
						final int i_340_ = i_319_ >> 16;
						if (i >= anInt4509 && i < anInt4507
								&& i_340_ >= anInt4495 && i_340_ < anInt4492
								&& i_326_ < i_324_) {
							final int i_341_ = i + i_340_ * anInt4505;
							int i_342_ = anIntArray4504[i_341_];
							final int i_343_ = i_322_ + i_342_;
							final int i_344_ = (i_322_ & 0xff00ff)
									+ (i_342_ & 0xff00ff);
							i_342_ = (i_344_ & 0x1000100)
									+ (i_343_ - i_344_ & 0x10000);
							anIntArray4504[i_341_] = i_343_ - i_342_ | i_342_
									- (i_342_ >>> 8);
						}
						i_319_ += i_332_;
						i++;
						i_326_ += i_334_;
						i_326_ %= i_329_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			i <<= 16;
			i += 32768;
			i_320_ <<= 16;
			final int i_345_ = (int) Math.floor((double) i_320_
					/ (double) i_321_ + 0.5);
			i_321_ += i_319_;
			final int i_346_ = i_322_ >>> 24;
			final int i_347_ = (int) Math.sqrt(65536 + (i_345_ >> 8)
					* (i_345_ >> 8));
			if (i_323_ == 0 || i_323_ == 1 && i_346_ == 255) {
				while (i_319_ <= i_321_) {
					final int i_348_ = i >> 16;
					if (i_319_ >= anInt4495 && i_319_ < anInt4492
							&& i_348_ >= anInt4509 && i_348_ < anInt4507
							&& i_326_ < i_324_) {
						anIntArray4504[i_348_ + i_319_ * anInt4505] = i_322_;
					}
					i += i_345_;
					i_319_++;
					i_326_ += i_347_;
					i_326_ %= i_329_;
				}
			} else if (i_323_ == 1) {
				i_322_ = (((i_322_ & 0xff00ff) * i_346_ >> 8 & 0xff00ff)
						+ ((i_322_ & 0xff00) * i_346_ >> 8 & 0xff00) + (i_346_ << 24));
				final int i_349_ = 256 - i_346_;
				while (i_319_ <= i_321_) {
					final int i_350_ = i >> 16;
					if (i_319_ >= anInt4495 && i_319_ < anInt4492
							&& i_350_ >= anInt4509 && i_350_ < anInt4507
							&& i_326_ < i_324_) {
						final int i_351_ = i_350_ + i_319_ * anInt4505;
						int i_352_ = anIntArray4504[i_351_];
						i_352_ = (((i_352_ & 0xff00ff) * i_349_ >> 8 & 0xff00ff) + ((i_352_ & 0xff00)
								* i_349_ >> 8 & 0xff00));
						anIntArray4504[i_350_ + i_319_ * anInt4505] = i_322_
								+ i_352_;
					}
					i += i_345_;
					i_319_++;
					i_326_ += i_347_;
					i_326_ %= i_329_;
				}
			} else if (i_323_ == 2) {
				while (i_319_ <= i_321_) {
					final int i_353_ = i >> 16;
					if (i_319_ >= anInt4495 && i_319_ < anInt4492
							&& i_353_ >= anInt4509 && i_353_ < anInt4507
							&& i_326_ < i_324_) {
						final int i_354_ = i_353_ + i_319_ * anInt4505;
						int i_355_ = anIntArray4504[i_354_];
						final int i_356_ = i_322_ + i_355_;
						final int i_357_ = (i_322_ & 0xff00ff)
								+ (i_355_ & 0xff00ff);
						i_355_ = (i_357_ & 0x1000100)
								+ (i_356_ - i_357_ & 0x10000);
						anIntArray4504[i_354_] = i_356_ - i_355_ | i_355_
								- (i_355_ >>> 8);
					}
					i += i_345_;
					i_319_++;
					i_326_ += i_347_;
					i_326_ %= i_329_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	final void method1923(final int i, final int i_358_, final int i_359_,
			final int i_360_, final int i_361_, final int i_362_,
			final int i_363_, final int i_364_, final int i_365_,
			final int i_366_) {
		if (i_360_ != 0 && i_361_ != 0) {
			if (i_363_ != 65535
					&& !(((ha) this).aD938.method11(i_363_, -28755).aBoolean1825)) {
				if (anInt4520 != i_363_) {
					Class332 class332 = ((Class332) aClass79_4497.method802(
							-120, i_363_));
					if (class332 == null) {
						final int[] is = method1915(i_363_);
						if (is == null) {
							return;
						}
						final int i_367_ = (method1925(i_363_) ? 64 : anInt4482);
						class332 = method1748(-7962, 0, i_367_, i_367_, is,
								i_367_);
						aClass79_4497.method805(i_363_, class332, (byte) -80);
					}
					anInt4520 = i_363_;
					aClass332_4519 = class332;
				}
				((Class332_Sub3) aClass332_4519).method3757(i - i_360_, i_358_
						- i_361_, i_359_, i_360_ << 1, i_361_ << 1, i_365_,
						i_364_, i_366_, 1);
			} else {
				method1916(i, i_358_, i_359_, i_360_, i_364_, i_366_);
			}
		}
	}

	private final void method1924(final int i, final int i_368_,
			final int i_369_, int i_370_, final int i_371_, final int i_372_,
			final int i_373_, final int i_374_) {
		if (i_368_ >= anInt4495 && i_368_ < anInt4492) {
			final int i_375_ = i + i_368_ * anInt4505;
			final int i_376_ = i_370_ >>> 24;
			final int i_377_ = i_372_ + i_373_;
			int i_378_ = i_374_ % i_377_;
			if (i_371_ == 0 || i_371_ == 1 && i_376_ == 255) {
				int i_379_ = 0;
				while (i_379_ < i_369_) {
					if (i + i_379_ >= anInt4509 && i + i_379_ < anInt4507
							&& i_378_ < i_372_) {
						anIntArray4504[i_375_ + i_379_] = i_370_;
					}
					i_379_++;
					i_378_ = ++i_378_ % i_377_;
				}
			} else if (i_371_ == 1) {
				i_370_ = (((i_370_ & 0xff00ff) * i_376_ >> 8 & 0xff00ff)
						+ ((i_370_ & 0xff00) * i_376_ >> 8 & 0xff00) + (i_376_ << 24));
				final int i_380_ = 256 - i_376_;
				int i_381_ = 0;
				while (i_381_ < i_369_) {
					if (i + i_381_ >= anInt4509 && i + i_381_ < anInt4507
							&& i_378_ < i_372_) {
						int i_382_ = anIntArray4504[i_375_ + i_381_];
						i_382_ = (((i_382_ & 0xff00ff) * i_380_ >> 8 & 0xff00ff) + ((i_382_ & 0xff00)
								* i_380_ >> 8 & 0xff00));
						anIntArray4504[i_375_ + i_381_] = i_370_ + i_382_;
					}
					i_381_++;
					i_378_ = ++i_378_ % i_377_;
				}
			} else if (i_371_ == 2) {
				int i_383_ = 0;
				while (i_383_ < i_369_) {
					if (i + i_383_ >= anInt4509 && i + i_383_ < anInt4507
							&& i_378_ < i_372_) {
						int i_384_ = anIntArray4504[i_375_ + i_383_];
						final int i_385_ = i_370_ + i_384_;
						final int i_386_ = (i_370_ & 0xff00ff)
								+ (i_384_ & 0xff00ff);
						i_384_ = (i_386_ & 0x1000100)
								+ (i_385_ - i_386_ & 0x10000);
						anIntArray4504[i_375_ + i_383_] = i_385_ - i_384_
								| i_384_ - (i_384_ >>> 8);
					}
					i_383_++;
					i_378_ = ++i_378_ % i_377_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@Override
	final void EA(final int i, final int i_387_, final int i_388_,
			final int i_389_) {
		final Class235 class235 = method1921(Thread.currentThread());
		class235.anInt1754 = i;
		class235.anInt1763 = i_387_;
		class235.anInt1757 = i_388_;
	}

	@Override
	final void a(int i, int i_390_, int i_391_, int i_392_, int i_393_,
			final int i_394_, final aa var_aa, final int i_395_,
			final int i_396_) {
		final aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
		final int[] is = var_aa_Sub1.anIntArray3555;
		final int[] is_397_ = var_aa_Sub1.anIntArray3557;
		final int i_398_ = (anInt4495 > i_396_ ? anInt4495 : i_396_);
		final int i_399_ = (anInt4492 < i_396_ + is.length ? anInt4492 : i_396_
				+ is.length);
		i_391_ -= i;
		i_392_ -= i_390_;
		if (i_391_ + i_392_ < 0) {
			i += i_391_;
			i_391_ = -i_391_;
			i_390_ += i_392_;
			i_392_ = -i_392_;
		}
		if (i_391_ > i_392_) {
			i_390_ <<= 16;
			i_390_ += 32768;
			i_392_ <<= 16;
			final int i_400_ = (int) Math.floor((double) i_392_
					/ (double) i_391_ + 0.5);
			i_391_ += i;
			if (i < anInt4509) {
				i_390_ += i_400_ * (anInt4509 - i);
				i = anInt4509;
			}
			if (i_391_ >= anInt4507) {
				i_391_ = anInt4507 - 1;
			}
			final int i_401_ = i_393_ >>> 24;
			if (i_394_ == 0 || i_394_ == 1 && i_401_ == 255) {
				for (/**/; i <= i_391_; i++) {
					final int i_402_ = i_390_ >> 16;
					final int i_403_ = i_402_ - i_396_;
					if (i_402_ >= i_398_ && i_402_ < i_399_) {
						final int i_404_ = i_395_ + is[i_403_];
						if (i >= i_404_ && i < i_404_ + is_397_[i_403_]) {
							anIntArray4504[i + i_402_ * anInt4505] = i_393_;
						}
					}
					i_390_ += i_400_;
				}
				return;
			}
			if (i_394_ == 1) {
				i_393_ = (((i_393_ & 0xff00ff) * i_401_ >> 8 & 0xff00ff)
						+ ((i_393_ & 0xff00) * i_401_ >> 8 & 0xff00) + (i_401_ << 24));
				final int i_405_ = 256 - i_401_;
				for (/**/; i <= i_391_; i++) {
					final int i_406_ = i_390_ >> 16;
					final int i_407_ = i_406_ - i_396_;
					if (i_406_ >= i_398_ && i_406_ < i_399_) {
						final int i_408_ = i_395_ + is[i_407_];
						if (i >= i_408_ && i < i_408_ + is_397_[i_407_]) {
							final int i_409_ = i + i_406_ * anInt4505;
							int i_410_ = anIntArray4504[i_409_];
							i_410_ = (((i_410_ & 0xff00ff) * i_405_ >> 8 & 0xff00ff) + ((i_410_ & 0xff00)
									* i_405_ >> 8 & 0xff00));
							anIntArray4504[i_409_] = i_393_ + i_410_;
						}
					}
					i_390_ += i_400_;
				}
				return;
			}
			if (i_394_ == 2) {
				for (/**/; i <= i_391_; i++) {
					final int i_411_ = i_390_ >> 16;
					final int i_412_ = i_411_ - i_396_;
					if (i_411_ >= i_398_ && i_411_ < i_399_) {
						final int i_413_ = i_395_ + is[i_412_];
						if (i >= i_413_ && i < i_413_ + is_397_[i_412_]) {
							final int i_414_ = i + i_411_ * anInt4505;
							int i_415_ = anIntArray4504[i_414_];
							final int i_416_ = i_393_ + i_415_;
							final int i_417_ = (i_393_ & 0xff00ff)
									+ (i_415_ & 0xff00ff);
							i_415_ = (i_417_ & 0x1000100)
									+ (i_416_ - i_417_ & 0x10000);
							anIntArray4504[i_414_] = i_416_ - i_415_ | i_415_
									- (i_415_ >>> 8);
						}
					}
					i_390_ += i_400_;
				}
				return;
			}
			throw new IllegalArgumentException();
		}
		i <<= 16;
		i += 32768;
		i_391_ <<= 16;
		final int i_418_ = (int) Math.floor((double) i_391_ / (double) i_392_
				+ 0.5);
		i_392_ += i_390_;
		if (i_390_ < i_398_) {
			i += i_418_ * (i_398_ - i_390_);
			i_390_ = i_398_;
		}
		if (i_392_ >= i_399_) {
			i_392_ = i_399_ - 1;
		}
		final int i_419_ = i_393_ >>> 24;
		if (i_394_ == 0 || i_394_ == 1 && i_419_ == 255) {
			for (/**/; i_390_ <= i_392_; i_390_++) {
				final int i_420_ = i >> 16;
				final int i_421_ = i_390_ - i_396_;
				final int i_422_ = i_395_ + is[i_421_];
				if (i_420_ >= anInt4509 && i_420_ < anInt4507
						&& i_420_ >= i_422_
						&& i_420_ < i_422_ + is_397_[i_421_]) {
					anIntArray4504[i_420_ + i_390_ * anInt4505] = i_393_;
				}
				i += i_418_;
			}
		} else if (i_394_ == 1) {
			i_393_ = (((i_393_ & 0xff00ff) * i_419_ >> 8 & 0xff00ff)
					+ ((i_393_ & 0xff00) * i_419_ >> 8 & 0xff00) + (i_419_ << 24));
			final int i_423_ = 256 - i_419_;
			for (/**/; i_390_ <= i_392_; i_390_++) {
				final int i_424_ = i >> 16;
				final int i_425_ = i_390_ - i_396_;
				final int i_426_ = i_395_ + is[i_425_];
				if (i_424_ >= anInt4509 && i_424_ < anInt4507
						&& i_424_ >= i_426_
						&& i_424_ < i_426_ + is_397_[i_425_]) {
					final int i_427_ = i_424_ + i_390_ * anInt4505;
					int i_428_ = anIntArray4504[i_427_];
					i_428_ = (((i_428_ & 0xff00ff) * i_423_ >> 8 & 0xff00ff) + ((i_428_ & 0xff00)
							* i_423_ >> 8 & 0xff00));
					anIntArray4504[i_424_ + i_390_ * anInt4505] = i_393_
							+ i_428_;
				}
				i += i_418_;
			}
		} else if (i_394_ == 2) {
			for (/**/; i_390_ <= i_392_; i_390_++) {
				final int i_429_ = i >> 16;
				final int i_430_ = i_390_ - i_396_;
				final int i_431_ = i_395_ + is[i_430_];
				if (i_429_ >= anInt4509 && i_429_ < anInt4507
						&& i_429_ >= i_431_
						&& i_429_ < i_431_ + is_397_[i_430_]) {
					final int i_432_ = i_429_ + i_390_ * anInt4505;
					int i_433_ = anIntArray4504[i_432_];
					final int i_434_ = i_393_ + i_433_;
					final int i_435_ = (i_393_ & 0xff00ff)
							+ (i_433_ & 0xff00ff);
					i_433_ = (i_435_ & 0x1000100) + (i_434_ - i_435_ & 0x10000);
					anIntArray4504[i_432_] = i_434_ - i_433_ | i_433_
							- (i_433_ >>> 8);
				}
				i += i_418_;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	final boolean method1925(final int i) {
		if (aBoolean4491 || ((ha) this).aD938.method11(i, -28755).aBoolean1822) {
			return true;
		}
		return false;
	}

	@Override
	final int XA() {
		return anInt4484;
	}

	@Override
	final void method1785(final Class242 class242, final int i) {
		final Class235 class235 = method1921(Thread.currentThread());
		final Class246_Sub4 class246_sub4 = (class242.aClass358_1850.aClass246_Sub4_3028);
		for (Class246_Sub4 class246_sub4_436_ = class246_sub4.aClass246_Sub4_5091; class246_sub4_436_ != class246_sub4; class246_sub4_436_ = class246_sub4_436_.aClass246_Sub4_5091) {
			final Class246_Sub4_Sub2 class246_sub4_sub2 = (Class246_Sub4_Sub2) class246_sub4_436_;
			final int i_437_ = class246_sub4_sub2.anInt6176 >> 12;
			final int i_438_ = class246_sub4_sub2.anInt6177 >> 12;
			final int i_439_ = class246_sub4_sub2.anInt6175 >> 12;
			float f = ((aClass111_Sub2_4513.aFloat4689) + ((aClass111_Sub2_4513.aFloat4693)
					* i_437_ + (aClass111_Sub2_4513.aFloat4698) * i_438_ + (aClass111_Sub2_4513.aFloat4694)
					* i_439_));
			if (!(f < anInt4502) && !(f > class235.anInt1761)) {
				final int i_440_ = (anInt4510 + (int) (anInt4514
						* ((aClass111_Sub2_4513.aFloat4697) + ((aClass111_Sub2_4513.aFloat4700)
								* i_437_
								+ (aClass111_Sub2_4513.aFloat4699)
								* i_438_ + (aClass111_Sub2_4513.aFloat4690)
								* i_439_)) / i));
				final int i_441_ = (anInt4511 + (int) (anInt4490
						* ((aClass111_Sub2_4513.aFloat4691) + ((aClass111_Sub2_4513.aFloat4692)
								* i_437_
								+ (aClass111_Sub2_4513.aFloat4688)
								* i_438_ + (aClass111_Sub2_4513.aFloat4696)
								* i_439_)) / i));
				if (i_440_ >= anInt4509 && i_440_ <= anInt4507
						&& i_441_ >= anInt4495 && i_441_ <= anInt4492) {
					if (f == 0.0F) {
						f = 1.0F;
					}
					method1914(class246_sub4_sub2, i_440_, i_441_, (int) f,
							((class246_sub4_sub2.anInt6179) * anInt4514 >> 12)
									/ i);
				}
			}
		}
	}

	@Override
	final int[] na(final int i, final int i_442_, final int i_443_,
			final int i_444_) {
		final int[] is = new int[i_443_ * i_444_];
		int i_445_ = 0;
		for (int i_446_ = 0; i_446_ < i_444_; i_446_++) {
			final int i_447_ = (i_442_ + i_446_) * anInt4505 + i;
			for (int i_448_ = 0; i_448_ < i_443_; i_448_++) {
				is[i_445_++] = anIntArray4504[i_447_ + i_448_];
			}
		}
		return is;
	}

	@Override
	final void b(final int i, final int i_449_, final int i_450_,
			final int i_451_, final double d) {
		final int i_452_ = anInt4512 - i_450_;
		int i_453_ = i_449_ * anInt4512 + i;
		final float[] fs = aFloatArray4487;
		int i_454_ = 0;
		while (i_454_ < i_451_) {
			int i_455_ = 0;
			while (i_455_ < i_450_) {
				final float f = fs[i_453_];
				if (f != 2.14748365E9F) {
					fs[i_453_] = (float) (f + d);
				}
				i_455_++;
				i_453_++;
			}
			i_454_++;
			i_453_ += i_452_;
		}
	}

	@Override
	final Class332 method1797(final int i, final int i_456_, final int i_457_,
			final int i_458_, final boolean bool) {
		final int[] is = new int[i_457_ * i_458_];
		int i_459_ = i_456_ * anInt4505 + i;
		final int i_460_ = anInt4505 - i_457_;
		for (int i_461_ = 0; i_461_ < i_458_; i_461_++) {
			final int i_462_ = i_461_ * i_457_;
			for (int i_463_ = 0; i_463_ < i_457_; i_463_++) {
				is[i_462_ + i_463_] = anIntArray4504[i_459_++];
			}
			i_459_ += i_460_;
		}
		if (bool) {
			return new Class332_Sub3_Sub1(this, is, i_457_, i_458_);
		}
		return new Class332_Sub3_Sub2(this, is, i_457_, i_458_);
	}

	@Override
	final void la() {
		anInt4509 = 0;
		anInt4495 = 0;
		anInt4507 = anInt4505;
		anInt4492 = anInt4480;
		method1913();
	}

	final int method1926(final int i) {
		return (((ha) this).aD938.method11(i, -28755).aShort1831 & 0xffff);
	}

	@Override
	final void GA(final int i) {
		aa(0, 0, anInt4505, anInt4480, i, 0);
	}

	@Override
	final boolean method1810() {
		return true;
	}

	@Override
	final int i() {
		return anInt4502;
	}

	@Override
	final void KA(int i, int i_464_, int i_465_, int i_466_) {
		if (i < 0) {
			i = 0;
		}
		if (i_464_ < 0) {
			i_464_ = 0;
		}
		if (i_465_ > anInt4505) {
			i_465_ = anInt4505;
		}
		if (i_466_ > anInt4480) {
			i_466_ = anInt4480;
		}
		anInt4509 = i;
		anInt4507 = i_465_;
		anInt4495 = i_464_;
		anInt4492 = i_466_;
		method1913();
	}

	@Override
	final Class111 method1752() {
		return aClass111_Sub2_4513;
	}

	@Override
	final void a(final Rectangle[] rectangles, final int i, final int i_467_,
			final int i_468_) throws Exception_Sub1 {
		if (aCanvas4479 == null || aClass98_Sub32_4478 == null) {
			throw new IllegalStateException("off");
		}
		try {
			final Graphics graphics = aCanvas4479.getGraphics();
			for (int i_469_ = 0; i_469_ < i; i_469_++) {
				final Rectangle rectangle = rectangles[i_469_];
				if (rectangle.x + i_467_ <= anInt4505
						&& rectangle.y + i_468_ <= anInt4480
						&& rectangle.x + i_467_ + rectangle.width > 0
						&& rectangle.y + i_468_ + rectangle.height > 0) {
					aClass98_Sub32_4478
							.method1434(graphics, rectangle.x, (byte) -125,
									rectangle.x + i_467_, rectangle.width,
									rectangle.y + i_468_, rectangle.height,
									rectangle.y);
				}
			}
		} catch (final Exception exception) {
			aCanvas4479.repaint();
		}
	}

	@Override
	final void method1774(final int i) {
		aClass235Array4483[i].method2889((byte) 34, null);
	}

	@Override
	final void method1751(int i, int i_470_, final int i_471_, int i_472_,
			int i_473_, final int i_474_, int i_475_, int i_476_,
			final int i_477_, final int i_478_, final int i_479_,
			final int i_480_, final int i_481_) {
		final Class235 class235 = method1921(Thread.currentThread());
		final Class12 class12 = class235.aClass12_1767;
		class12.aBoolean134 = false;
		i -= anInt4486;
		i_472_ -= anInt4486;
		i_475_ -= anInt4486;
		i_470_ -= anInt4518;
		i_473_ -= anInt4518;
		i_476_ -= anInt4518;
		class12.aBoolean135 = (i < 0 || i > class12.anInt141 || i_472_ < 0
				|| i_472_ > class12.anInt141 || i_475_ < 0 || i_475_ > class12.anInt141);
		final int i_482_ = i_478_ >>> 24;
		if (i_481_ == 0 || i_481_ == 1 && i_482_ == 255) {
			class12.anInt137 = 0;
			class12.aBoolean130 = false;
			class12.method206(i_470_, i_473_, i_476_, i, i_472_, i_475_,
					i_471_, i_474_, i_477_, i_478_, i_479_, i_480_);
		} else if (i_481_ == 1) {
			class12.anInt137 = 255 - i_482_;
			class12.aBoolean130 = false;
			class12.method206(i_470_, i_473_, i_476_, i, i_472_, i_475_,
					i_471_, i_474_, i_477_, i_478_, i_479_, i_480_);
		} else if (i_481_ == 2) {
			class12.anInt137 = 128;
			class12.aBoolean130 = true;
			class12.method206(i_470_, i_473_, i_476_, i, i_472_, i_475_,
					i_471_, i_474_, i_477_, i_478_, i_479_, i_480_);
		} else {
			throw new IllegalArgumentException();
		}
		class12.aBoolean134 = true;
	}

	@Override
	final void method1779(final int i, final int i_483_, final int i_484_,
			final int i_485_, final int i_486_, final int i_487_) {
		U(i, i_483_, i_484_, i_486_, i_487_);
		U(i, i_483_ + i_485_ - 1, i_484_, i_486_, i_487_);
		P(i, i_483_ + 1, i_485_ - 2, i_486_, i_487_);
		P(i + i_484_ - 1, i_483_ + 1, i_485_ - 2, i_486_, i_487_);
	}

	@Override
	final void da(final int i, final int i_488_, final int i_489_,
			final int[] is) {
		final float f = ((aClass111_Sub2_4513.aFloat4689) + ((aClass111_Sub2_4513.aFloat4693)
				* i + (aClass111_Sub2_4513.aFloat4698) * i_488_ + (aClass111_Sub2_4513.aFloat4694)
				* i_489_));
		if (f < anInt4502 || f > anInt4484) {
			is[0] = is[1] = is[2] = -1;
		} else {
			final int i_490_ = (int) (anInt4514
					* (aClass111_Sub2_4513.aFloat4697 + ((aClass111_Sub2_4513.aFloat4700)
							* i + (aClass111_Sub2_4513.aFloat4699) * i_488_ + (aClass111_Sub2_4513.aFloat4690)
							* i_489_)) / f);
			final int i_491_ = (int) (anInt4490
					* (aClass111_Sub2_4513.aFloat4691 + ((aClass111_Sub2_4513.aFloat4692)
							* i + (aClass111_Sub2_4513.aFloat4688) * i_488_ + (aClass111_Sub2_4513.aFloat4696)
							* i_489_)) / f);
			if (i_490_ >= anInt4486 && i_490_ <= anInt4517
					&& i_491_ >= anInt4518 && i_491_ <= anInt4506) {
				is[0] = i_490_ - anInt4486;
				is[1] = i_491_ - anInt4518;
				is[2] = (int) f;
			} else {
				is[0] = is[1] = is[2] = -1;
			}
		}
	}

	@Override
	final void method1820(final Class242 class242) {
		final Class235 class235 = method1921(Thread.currentThread());
		final Class246_Sub4 class246_sub4 = (class242.aClass358_1850.aClass246_Sub4_3028);
		for (Class246_Sub4 class246_sub4_492_ = class246_sub4.aClass246_Sub4_5091; class246_sub4_492_ != class246_sub4; class246_sub4_492_ = class246_sub4_492_.aClass246_Sub4_5091) {
			final Class246_Sub4_Sub2 class246_sub4_sub2 = (Class246_Sub4_Sub2) class246_sub4_492_;
			final int i = class246_sub4_sub2.anInt6176 >> 12;
			final int i_493_ = class246_sub4_sub2.anInt6177 >> 12;
			final int i_494_ = class246_sub4_sub2.anInt6175 >> 12;
			float f = ((aClass111_Sub2_4513.aFloat4689) + ((aClass111_Sub2_4513.aFloat4693)
					* i + (aClass111_Sub2_4513.aFloat4698) * i_493_ + (aClass111_Sub2_4513.aFloat4694)
					* i_494_));
			if (!(f < anInt4502) && !(f > class235.anInt1761)) {
				final int i_495_ = (anInt4510 + (int) (anInt4514
						* ((aClass111_Sub2_4513.aFloat4697) + ((aClass111_Sub2_4513.aFloat4700)
								* i + (aClass111_Sub2_4513.aFloat4699) * i_493_ + (aClass111_Sub2_4513.aFloat4690)
								* i_494_)) / f));
				final int i_496_ = (anInt4511 + (int) (anInt4490
						* ((aClass111_Sub2_4513.aFloat4691) + ((aClass111_Sub2_4513.aFloat4692)
								* i + (aClass111_Sub2_4513.aFloat4688) * i_493_ + (aClass111_Sub2_4513.aFloat4696)
								* i_494_)) / f));
				if (i_495_ >= anInt4509 && i_495_ <= anInt4507
						&& i_496_ >= anInt4495 && i_496_ <= anInt4492) {
					if (f == 0.0F) {
						f = 1.0F;
					}
					method1914(
							class246_sub4_sub2,
							i_495_,
							i_496_,
							(int) f,
							(int) (((class246_sub4_sub2.anInt6179 * anInt4514) >> 12) / f));
				}
			}
		}
	}

	@Override
	final int c(int i, final int i_497_) {
		i |= 0x20800;
		return i & i_497_ ^ i_497_;
	}

	@Override
	final void aa(int i, int i_498_, int i_499_, int i_500_, int i_501_,
			final int i_502_) {
		if (i < anInt4509) {
			i_499_ -= anInt4509 - i;
			i = anInt4509;
		}
		if (i_498_ < anInt4495) {
			i_500_ -= anInt4495 - i_498_;
			i_498_ = anInt4495;
		}
		if (i + i_499_ > anInt4507) {
			i_499_ = anInt4507 - i;
		}
		if (i_498_ + i_500_ > anInt4492) {
			i_500_ = anInt4492 - i_498_;
		}
		if (i_499_ > 0 && i_500_ > 0 && i <= anInt4507 && i_498_ <= anInt4492) {
			final int i_503_ = anInt4505 - i_499_;
			int i_504_ = i + i_498_ * anInt4505;
			final int i_505_ = i_501_ >>> 24;
			if (i_502_ == 0 || i_502_ == 1 && i_505_ == 255) {
				final int i_506_ = i_499_ >> 3;
				final int i_507_ = i_499_ & 0x7;
				i_499_ = i_504_ - 1;
				for (int i_508_ = -i_500_; i_508_ < 0; i_508_++) {
					if (i_506_ > 0) {
						i = i_506_;
						do {
							anIntArray4504[++i_499_] = i_501_;
							anIntArray4504[++i_499_] = i_501_;
							anIntArray4504[++i_499_] = i_501_;
							anIntArray4504[++i_499_] = i_501_;
							anIntArray4504[++i_499_] = i_501_;
							anIntArray4504[++i_499_] = i_501_;
							anIntArray4504[++i_499_] = i_501_;
							anIntArray4504[++i_499_] = i_501_;
						} while (--i > 0);
					}
					if (i_507_ > 0) {
						i = i_507_;
						do {
							anIntArray4504[++i_499_] = i_501_;
						} while (--i > 0);
					}
					i_499_ += i_503_;
				}
			} else if (i_502_ == 1) {
				i_501_ = (((i_501_ & 0xff00ff) * i_505_ >> 8 & 0xff00ff) + (((i_501_ & ~0xff00ff) >>> 8)
						* i_505_ & ~0xff00ff));
				final int i_509_ = 256 - i_505_;
				for (int i_510_ = 0; i_510_ < i_500_; i_510_++) {
					for (int i_511_ = -i_499_; i_511_ < 0; i_511_++) {
						int i_512_ = anIntArray4504[i_504_];
						i_512_ = (((i_512_ & 0xff00ff) * i_509_ >> 8 & 0xff00ff) + (((i_512_ & ~0xff00ff) >>> 8)
								* i_509_ & ~0xff00ff));
						anIntArray4504[i_504_++] = i_501_ + i_512_;
					}
					i_504_ += i_503_;
				}
			} else if (i_502_ == 2) {
				for (int i_513_ = 0; i_513_ < i_500_; i_513_++) {
					for (int i_514_ = -i_499_; i_514_ < 0; i_514_++) {
						int i_515_ = anIntArray4504[i_504_];
						final int i_516_ = i_501_ + i_515_;
						final int i_517_ = (i_501_ & 0xff00ff)
								+ (i_515_ & 0xff00ff);
						i_515_ = (i_517_ & 0x1000100)
								+ (i_516_ - i_517_ & 0x10000);
						anIntArray4504[i_504_++] = i_516_ - i_515_ | i_515_
								- (i_515_ >>> 8);
					}
					i_504_ += i_503_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@Override
	final Class48 method1803(final int i, final int i_518_, final int i_519_,
			final int i_520_, final int i_521_, final int i_522_) {
		return null;
	}

	@Override
	final aa method1772(final int i, final int i_523_, final int[] is,
			final int[] is_524_) {
		return new aa_Sub1(i, i_523_, is, is_524_);
	}

	@Override
	final void method1825() {
		/* empty */
	}

	@Override
	final void method1764(final int i, final int i_525_) throws Exception_Sub1 {
		if (aCanvas4479 == null || aClass98_Sub32_4478 == null) {
			throw new IllegalStateException("off");
		}
		try {
			final Graphics graphics = aCanvas4479.getGraphics();
			aClass98_Sub32_4478.method1434(graphics, 0, (byte) -125, i,
					anInt4474, i_525_, anInt4477, 0);
		} catch (final Exception exception) {
			aCanvas4479.repaint();
		}
	}

	@Override
	final void Q(final int i, final int i_526_, int i_527_, int i_528_,
			final int i_529_, final int i_530_, final byte[] is,
			final int i_531_, final int i_532_) {
		if (i_527_ > 0 && i_528_ > 0) {
			int i_533_ = 0;
			int i_534_ = 0;
			final int i_535_ = (i_531_ << 16) / i_527_;
			final int i_536_ = (is.length / i_531_ << 16) / i_528_;
			int i_537_ = i + i_526_ * anInt4505;
			int i_538_ = anInt4505 - i_527_;
			if (i_526_ + i_528_ > anInt4492) {
				i_528_ -= i_526_ + i_528_ - anInt4492;
			}
			if (i_526_ < anInt4495) {
				final int i_539_ = anInt4495 - i_526_;
				i_528_ -= i_539_;
				i_537_ += i_539_ * anInt4505;
				i_534_ += i_536_ * i_539_;
			}
			if (i + i_527_ > anInt4507) {
				final int i_540_ = i + i_527_ - anInt4507;
				i_527_ -= i_540_;
				i_538_ += i_540_;
			}
			if (i < anInt4509) {
				final int i_541_ = anInt4509 - i;
				i_527_ -= i_541_;
				i_537_ += i_541_;
				i_533_ += i_535_ * i_541_;
				i_538_ += i_541_;
			}
			final int i_542_ = i_529_ >>> 24;
			final int i_543_ = i_530_ >>> 24;
			if (i_532_ == 0 || i_532_ == 1 && i_542_ == 255 && i_543_ == 255) {
				final int i_544_ = i_533_;
				for (int i_545_ = -i_528_; i_545_ < 0; i_545_++) {
					final int i_546_ = (i_534_ >> 16) * i_531_;
					for (int i_547_ = -i_527_; i_547_ < 0; i_547_++) {
						if (is[(i_533_ >> 16) + i_546_] != 0) {
							anIntArray4504[i_537_++] = i_530_;
						} else {
							anIntArray4504[i_537_++] = i_529_;
						}
						i_533_ += i_535_;
					}
					i_534_ += i_536_;
					i_533_ = i_544_;
					i_537_ += i_538_;
				}
			} else if (i_532_ == 1) {
				final int i_548_ = i_533_;
				for (int i_549_ = -i_528_; i_549_ < 0; i_549_++) {
					final int i_550_ = (i_534_ >> 16) * i_531_;
					for (int i_551_ = -i_527_; i_551_ < 0; i_551_++) {
						int i_552_ = i_529_;
						if (is[(i_533_ >> 16) + i_550_] != 0) {
							i_552_ = i_530_;
						}
						final int i_553_ = i_552_ >>> 24;
						final int i_554_ = 255 - i_553_;
						final int i_555_ = anIntArray4504[i_537_];
						anIntArray4504[i_537_++] = ((((i_552_ & 0xff00ff)
								* i_553_ + (i_555_ & 0xff00ff) * i_554_) & ~0xff00ff) + (((i_552_ & 0xff00)
								* i_553_ + (i_555_ & 0xff00) * i_554_) & 0xff0000)) >> 8;
						i_533_ += i_535_;
					}
					i_534_ += i_536_;
					i_533_ = i_548_;
					i_537_ += i_538_;
				}
			} else if (i_532_ == 2) {
				final int i_556_ = i_533_;
				for (int i_557_ = -i_528_; i_557_ < 0; i_557_++) {
					final int i_558_ = (i_534_ >> 16) * i_531_;
					for (int i_559_ = -i_527_; i_559_ < 0; i_559_++) {
						int i_560_ = i_529_;
						if (is[(i_533_ >> 16) + i_558_] != 0) {
							i_560_ = i_530_;
						}
						if (i_560_ != 0) {
							int i_561_ = anIntArray4504[i_537_];
							final int i_562_ = i_560_ + i_561_;
							final int i_563_ = (i_560_ & 0xff00ff)
									+ (i_561_ & 0xff00ff);
							i_561_ = (i_563_ & 0x1000100)
									+ (i_562_ - i_563_ & 0x10000);
							anIntArray4504[i_537_++] = i_562_ - i_561_ | i_561_
									- (i_561_ >>> 8);
						} else {
							i_537_++;
						}
						i_533_ += i_535_;
					}
					i_534_ += i_536_;
					i_533_ = i_556_;
					i_537_ += i_538_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@Override
	final void H(final int i, final int i_564_, final int i_565_, final int[] is) {
		final float f = ((aClass111_Sub2_4513.aFloat4689) + ((aClass111_Sub2_4513.aFloat4693)
				* i + (aClass111_Sub2_4513.aFloat4698) * i_564_ + (aClass111_Sub2_4513.aFloat4694)
				* i_565_));
		if (f == 0.0F) {
			is[0] = is[1] = is[2] = -1;
		} else {
			final int i_566_ = (int) (anInt4514
					* (aClass111_Sub2_4513.aFloat4697 + ((aClass111_Sub2_4513.aFloat4700)
							* i + (aClass111_Sub2_4513.aFloat4699) * i_564_ + (aClass111_Sub2_4513.aFloat4690)
							* i_565_)) / f);
			final int i_567_ = (int) (anInt4490
					* (aClass111_Sub2_4513.aFloat4691 + ((aClass111_Sub2_4513.aFloat4692)
							* i + (aClass111_Sub2_4513.aFloat4688) * i_564_ + (aClass111_Sub2_4513.aFloat4696)
							* i_565_)) / f);
			is[0] = i_566_ - anInt4486;
			is[1] = i_567_ - anInt4518;
			is[2] = (int) f;
		}
	}

	@Override
	final boolean method1800() {
		return true;
	}

	@Override
	final void method1818(final int i, final Class98_Sub5[] class98_sub5s) {
		/* empty */
	}

	@Override
	final void method1795(int i, int i_568_, int i_569_, int i_570_,
			int i_571_, final int i_572_) {
		i_569_ -= i;
		i_570_ -= i_568_;
		if (i_570_ == 0) {
			if (i_569_ >= 0) {
				U(i, i_568_, i_569_ + 1, i_571_, i_572_);
			} else {
				U(i + i_569_, i_568_, -i_569_ + 1, i_571_, i_572_);
			}
		} else if (i_569_ == 0) {
			if (i_570_ >= 0) {
				P(i, i_568_, i_570_ + 1, i_571_, i_572_);
			} else {
				P(i, i_568_ + i_570_, -i_570_ + 1, i_571_, i_572_);
			}
		} else {
			if (i_569_ + i_570_ < 0) {
				i += i_569_;
				i_569_ = -i_569_;
				i_568_ += i_570_;
				i_570_ = -i_570_;
			}
			if (i_569_ > i_570_) {
				i_568_ <<= 16;
				i_568_ += 32768;
				i_570_ <<= 16;
				final int i_573_ = (int) Math.floor((double) i_570_
						/ (double) i_569_ + 0.5);
				i_569_ += i;
				if (i < anInt4509) {
					i_568_ += i_573_ * (anInt4509 - i);
					i = anInt4509;
				}
				if (i_569_ >= anInt4507) {
					i_569_ = anInt4507 - 1;
				}
				final int i_574_ = i_571_ >>> 24;
				if (i_572_ == 0 || i_572_ == 1 && i_574_ == 255) {
					for (/**/; i <= i_569_; i++) {
						final int i_575_ = i_568_ >> 16;
						if (i_575_ >= anInt4495 && i_575_ < anInt4492) {
							anIntArray4504[i + i_575_ * anInt4505] = i_571_;
						}
						i_568_ += i_573_;
					}
					return;
				}
				if (i_572_ == 1) {
					i_571_ = (((i_571_ & 0xff00ff) * i_574_ >> 8 & 0xff00ff)
							+ ((i_571_ & 0xff00) * i_574_ >> 8 & 0xff00) + (i_574_ << 24));
					final int i_576_ = 256 - i_574_;
					for (/**/; i <= i_569_; i++) {
						final int i_577_ = i_568_ >> 16;
						if (i_577_ >= anInt4495 && i_577_ < anInt4492) {
							final int i_578_ = i + i_577_ * anInt4505;
							int i_579_ = anIntArray4504[i_578_];
							i_579_ = (((i_579_ & 0xff00ff) * i_576_ >> 8 & 0xff00ff) + ((i_579_ & 0xff00)
									* i_576_ >> 8 & 0xff00));
							anIntArray4504[i_578_] = i_571_ + i_579_;
						}
						i_568_ += i_573_;
					}
					return;
				}
				if (i_572_ == 2) {
					for (/**/; i <= i_569_; i++) {
						final int i_580_ = i_568_ >> 16;
						if (i_580_ >= anInt4495 && i_580_ < anInt4492) {
							final int i_581_ = i + i_580_ * anInt4505;
							int i_582_ = anIntArray4504[i_581_];
							final int i_583_ = i_571_ + i_582_;
							final int i_584_ = (i_571_ & 0xff00ff)
									+ (i_582_ & 0xff00ff);
							i_582_ = (i_584_ & 0x1000100)
									+ (i_583_ - i_584_ & 0x10000);
							anIntArray4504[i_581_] = i_583_ - i_582_ | i_582_
									- (i_582_ >>> 8);
						}
						i_568_ += i_573_;
					}
					return;
				}
				throw new IllegalArgumentException();
			}
			i <<= 16;
			i += 32768;
			i_569_ <<= 16;
			final int i_585_ = (int) Math.floor((double) i_569_
					/ (double) i_570_ + 0.5);
			i_570_ += i_568_;
			if (i_568_ < anInt4495) {
				i += i_585_ * (anInt4495 - i_568_);
				i_568_ = anInt4495;
			}
			if (i_570_ >= anInt4492) {
				i_570_ = anInt4492 - 1;
			}
			final int i_586_ = i_571_ >>> 24;
			if (i_572_ == 0 || i_572_ == 1 && i_586_ == 255) {
				for (/**/; i_568_ <= i_570_; i_568_++) {
					final int i_587_ = i >> 16;
					if (i_587_ >= anInt4509 && i_587_ < anInt4507) {
						anIntArray4504[i_587_ + i_568_ * anInt4505] = i_571_;
					}
					i += i_585_;
				}
			} else if (i_572_ == 1) {
				i_571_ = (((i_571_ & 0xff00ff) * i_586_ >> 8 & 0xff00ff)
						+ ((i_571_ & 0xff00) * i_586_ >> 8 & 0xff00) + (i_586_ << 24));
				final int i_588_ = 256 - i_586_;
				for (/**/; i_568_ <= i_570_; i_568_++) {
					final int i_589_ = i >> 16;
					if (i_589_ >= anInt4509 && i_589_ < anInt4507) {
						final int i_590_ = i_589_ + i_568_ * anInt4505;
						int i_591_ = anIntArray4504[i_590_];
						i_591_ = (((i_591_ & 0xff00ff) * i_588_ >> 8 & 0xff00ff) + ((i_591_ & 0xff00)
								* i_588_ >> 8 & 0xff00));
						anIntArray4504[i_589_ + i_568_ * anInt4505] = i_571_
								+ i_591_;
					}
					i += i_585_;
				}
			} else if (i_572_ == 2) {
				for (/**/; i_568_ <= i_570_; i_568_++) {
					final int i_592_ = i >> 16;
					if (i_592_ >= anInt4509 && i_592_ < anInt4507) {
						final int i_593_ = i_592_ + i_568_ * anInt4505;
						int i_594_ = anIntArray4504[i_593_];
						final int i_595_ = i_571_ + i_594_;
						final int i_596_ = (i_571_ & 0xff00ff)
								+ (i_594_ & 0xff00ff);
						i_594_ = (i_596_ & 0x1000100)
								+ (i_595_ - i_596_ & 0x10000);
						anIntArray4504[i_593_] = i_595_ - i_594_ | i_594_
								- (i_594_ >>> 8);
					}
					i += i_585_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@Override
	final Class332 method1758(final Class324 class324, final boolean bool) {
		final int[] is = class324.anIntArray2718;
		final byte[] is_597_ = class324.aByteArray2717;
		final int i = class324.anInt2722;
		final int i_598_ = class324.anInt2720;
		Class332_Sub3 class332_sub3;
		if (bool && class324.aByteArray2723 == null) {
			final int[] is_599_ = new int[is.length];
			final byte[] is_600_ = new byte[i * i_598_];
			for (int i_601_ = 0; i_601_ < i_598_; i_601_++) {
				final int i_602_ = i_601_ * i;
				for (int i_603_ = 0; i_603_ < i; i_603_++) {
					is_600_[i_602_ + i_603_] = is_597_[i_602_ + i_603_];
				}
			}
			for (int i_604_ = 0; i_604_ < is.length; i_604_++) {
				is_599_[i_604_] = is[i_604_];
			}
			class332_sub3 = new Class332_Sub3_Sub3(this, is_600_, is_599_, i,
					i_598_);
		} else {
			final int[] is_605_ = new int[i * i_598_];
			final byte[] is_606_ = class324.aByteArray2723;
			if (is_606_ != null) {
				for (int i_607_ = 0; i_607_ < i_598_; i_607_++) {
					final int i_608_ = i_607_ * i;
					for (int i_609_ = 0; i_609_ < i; i_609_++) {
						is_605_[i_608_ + i_609_] = (is[is_597_[i_608_ + i_609_] & 0xff] | is_606_[i_608_
								+ i_609_] << 24);
					}
				}
				class332_sub3 = new Class332_Sub3_Sub1(this, is_605_, i, i_598_);
			} else {
				for (int i_610_ = 0; i_610_ < i_598_; i_610_++) {
					final int i_611_ = i_610_ * i;
					for (int i_612_ = 0; i_612_ < i; i_612_++) {
						final int i_613_ = is[is_597_[i_611_ + i_612_] & 0xff];
						is_605_[i_611_ + i_612_] = i_613_ != 0 ? ~0xffffff
								| i_613_ : 0;
					}
				}
				class332_sub3 = new Class332_Sub3_Sub2(this, is_605_, i, i_598_);
			}
		}
		class332_sub3.method3740(class324.anInt2725, class324.anInt2721,
				class324.anInt2719, class324.anInt2724);
		return class332_sub3;
	}

	@Override
	final boolean method1788() {
		return false;
	}

	@Override
	final void a(final za var_za) {
		/* empty */
	}

	@Override
	final void method1806(final int i) {
		final int i_614_ = i - anInt4475;
		for (Object object = aClass79_4494.method803(false); object != null; object = aClass79_4494
				.method804(false)) {
			final Class98_Sub2 class98_sub2 = (Class98_Sub2) object;
			if (class98_sub2.aBoolean3817) {
				class98_sub2.anInt3818 += i_614_;
				final int i_615_ = class98_sub2.anInt3818 / 20;
				if (i_615_ > 0) {
					final TextureDefinition textureDefinition = ((ha) this).aD938.method11(
							class98_sub2.anInt3820, -28755);
					class98_sub2.method949(
							(textureDefinition.aByte1823 * i_614_ * 50 / 1000),
							(textureDefinition.aByte1837 * i_614_ * 50 / 1000));
					class98_sub2.anInt3818 -= i_615_ * 20;
				}
				class98_sub2.aBoolean3817 = false;
			}
		}
		anInt4475 = i;
		aClass79_4497.method800((byte) 62, 5);
		aClass79_4494.method800((byte) 62, 5);
	}

	@Override
	final void method1814() {
		/* empty */
	}

	@Override
	final void method1778(final int i) {
		anInt4482 = i;
		aClass79_4494.method794(31);
	}

	@Override
	final void method1773() {
		if (aBoolean4473) {
			Class18.method248(false, 37, true);
			aBoolean4473 = false;
		}
		aClass98_Sub32_4478 = null;
		aCanvas4479 = null;
		anInt4474 = 0;
		anInt4477 = 0;
		aClass377_4476 = null;
		aBoolean4472 = true;
	}

	@Override
	final void method1782(final Canvas canvas, final int i, final int i_616_) {
		Class98_Sub32 class98_sub32 = ((Class98_Sub32) aClass377_4476
				.method3990(canvas.hashCode(), -1));
		if (class98_sub32 != null) {
			class98_sub32.method942(116);
			class98_sub32 = Class64_Sub23.method646(i_616_, i, canvas,
					(byte) -111);
			aClass377_4476.method3996(class98_sub32, canvas.hashCode(), -1);
			if (aCanvas4479 == canvas && aClass186_4499 == null) {
				final Dimension dimension = canvas.getSize();
				anInt4474 = dimension.width;
				anInt4477 = dimension.height;
				aClass98_Sub32_4478 = class98_sub32;
				anIntArray4504 = class98_sub32.anIntArray4108;
				anInt4505 = class98_sub32.anInt4105;
				anInt4480 = class98_sub32.anInt4110;
				if (anInt4505 != anInt4512 || anInt4480 != anInt4485) {
					anInt4496 = anInt4512 = anInt4505;
					anInt4503 = anInt4485 = anInt4480;
					aFloatArray4488 = aFloatArray4487 = new float[anInt4512
							* anInt4485];
				}
				method1911();
			}
		}
	}

	@Override
	final void method1812() {
		aClass79_4494.method794(82);
		aClass79_4497.method794(62);
	}

	@Override
	final void DA(final int i, final int i_617_, final int i_618_,
			final int i_619_) {
		anInt4510 = i;
		anInt4511 = i_617_;
		anInt4514 = i_618_;
		anInt4490 = i_619_;
		method1913();
	}

	@Override
	final void U(int i, final int i_620_, int i_621_, int i_622_,
			final int i_623_) {
		if (i_620_ >= anInt4495 && i_620_ < anInt4492) {
			if (i < anInt4509) {
				i_621_ -= anInt4509 - i;
				i = anInt4509;
			}
			if (i + i_621_ > anInt4507) {
				i_621_ = anInt4507 - i;
			}
			final int i_624_ = i + i_620_ * anInt4505;
			final int i_625_ = i_622_ >>> 24;
			if (i_623_ == 0 || i_623_ == 1 && i_625_ == 255) {
				for (int i_626_ = 0; i_626_ < i_621_; i_626_++) {
					anIntArray4504[i_624_ + i_626_] = i_622_;
				}
			} else if (i_623_ == 1) {
				i_622_ = (((i_622_ & 0xff00ff) * i_625_ >> 8 & 0xff00ff)
						+ ((i_622_ & 0xff00) * i_625_ >> 8 & 0xff00) + (i_625_ << 24));
				final int i_627_ = 256 - i_625_;
				for (int i_628_ = 0; i_628_ < i_621_; i_628_++) {
					int i_629_ = anIntArray4504[i_624_ + i_628_];
					i_629_ = (((i_629_ & 0xff00ff) * i_627_ >> 8 & 0xff00ff) + ((i_629_ & 0xff00)
							* i_627_ >> 8 & 0xff00));
					anIntArray4504[i_624_ + i_628_] = i_622_ + i_629_;
				}
			} else if (i_623_ == 2) {
				for (int i_630_ = 0; i_630_ < i_621_; i_630_++) {
					int i_631_ = anIntArray4504[i_624_ + i_630_];
					final int i_632_ = i_622_ + i_631_;
					final int i_633_ = (i_622_ & 0xff00ff)
							+ (i_631_ & 0xff00ff);
					i_631_ = (i_633_ & 0x1000100) + (i_632_ - i_633_ & 0x10000);
					anIntArray4504[i_624_ + i_630_] = i_632_ - i_631_ | i_631_
							- (i_631_ >>> 8);
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@Override
	final void F(final int i, final int i_634_) {
		final int i_635_ = i_634_ * anInt4505 + i;
		final int i_636_ = i_634_ * anInt4512 + i;
		if (i_635_ != 0 || i_636_ != 0) {
			final int[] is = anIntArray4504;
			final float[] fs = aFloatArray4487;
			if (i_635_ < 0) {
				final int i_637_ = is.length + i_635_;
				Class236.method2891(is, -i_635_, is, 0, i_637_);
			} else if (i_635_ > 0) {
				final int i_638_ = is.length - i_635_;
				Class236.method2891(is, 0, is, i_635_, i_638_);
			}
			if (i_636_ < 0) {
				final int i_639_ = fs.length + i_636_;
				Class236.method2897(fs, -i_636_, fs, 0, i_639_);
			} else if (i_636_ > 0) {
				final int i_640_ = fs.length - i_636_;
				Class236.method2897(fs, 0, fs, i_636_, i_640_);
			}
		}
	}

	@Override
	final void method1749(final boolean bool) {
		aBoolean4491 = bool;
		aClass79_4494.method794(120);
	}

	@Override
	final boolean method1780() {
		return false;
	}
}
