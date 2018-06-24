/* Class111_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class111_Sub2 extends Class111 {
	float aFloat4688;
	float aFloat4689;
	float aFloat4690;
	float aFloat4691;
	float aFloat4692;
	float aFloat4693;
	float aFloat4694;
	static int anInt4695;
	float aFloat4696;
	float aFloat4697;
	float aFloat4698;
	float aFloat4699;
	float aFloat4700;

	@Override
	final void method2107(final int i) {
		try {
			aFloat4700 = 1.0F;
			aFloat4688 = aFloat4694 = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			aFloat4698 = Class64_Sub5.aFloatArray3651[0x3fff & i];
			aFloat4699 = aFloat4690 = aFloat4697 = aFloat4692 = aFloat4691 = aFloat4693 = aFloat4689 = 0.0F;
			aFloat4696 = -aFloat4698;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ho.N(" + i + ')');
		}
	}

	@Override
	final void method2091() {
		try {
			aFloat4700 = aFloat4688 = aFloat4694 = 1.0F;
			aFloat4692 = aFloat4693 = aFloat4699 = aFloat4698 = aFloat4690 = aFloat4696 = aFloat4697 = aFloat4691 = aFloat4689 = 0.0F;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ho.CA(" + ')');
		}
	}

	@Override
	final void method2096(int i, int i_0_, int i_1_, final int[] is) {
		try {
			i -= aFloat4697;
			i_0_ -= aFloat4691;
			i_1_ -= aFloat4689;
			is[0] = (int) (aFloat4693 * i_1_ + (i * aFloat4700 + (aFloat4692 * i_0_)));
			is[2] = (int) (aFloat4696 * i_0_ + aFloat4690 * i + i_1_
					* aFloat4694);
			is[1] = (int) (aFloat4698 * i_1_ + (aFloat4688 * i_0_ + aFloat4699
					* i));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("ho.PA(" + i + ',' + i_0_ + ',' + i_1_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method2100(final int i, final int i_2_, final int i_3_) {
		try {
			aFloat4697 = i;
			aFloat4700 = aFloat4688 = aFloat4694 = 1.0F;
			aFloat4691 = i_2_;
			aFloat4689 = i_3_;
			aFloat4692 = aFloat4693 = aFloat4699 = aFloat4698 = aFloat4690 = aFloat4696 = 0.0F;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ho.SA(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	@Override
	final void method2093(final int i, final int i_4_, final int i_5_,
			final int i_6_, final int i_7_, final int i_8_) {
		try {
			final float f = Class64_Sub5.aFloatArray3653[0x3fff & i_6_];
			final float f_9_ = Class64_Sub5.aFloatArray3651[0x3fff & i_6_];
			final float f_10_ = Class64_Sub5.aFloatArray3653[0x3fff & i_7_];
			final float f_11_ = Class64_Sub5.aFloatArray3651[i_7_ & 0x3fff];
			final float f_12_ = Class64_Sub5.aFloatArray3653[i_8_ & 0x3fff];
			final float f_13_ = Class64_Sub5.aFloatArray3651[0x3fff & i_8_];
			final float f_14_ = f_12_ * f_9_;
			final float f_15_ = f_9_ * f_13_;
			aFloat4699 = f * f_13_;
			aFloat4692 = f_13_ * -f_10_ + f_14_ * f_11_;
			aFloat4688 = f * f_12_;
			aFloat4698 = -f_9_;
			aFloat4696 = f_10_ * f_14_ + f_13_ * f_11_;
			aFloat4693 = f * f_11_;
			aFloat4700 = f_11_ * f_15_ + f_12_ * f_10_;
			aFloat4690 = f_15_ * f_10_ + f_12_ * -f_11_;
			aFloat4694 = f * f_10_;
			aFloat4691 = (-(aFloat4688 * i_4_) + aFloat4692 * -i - aFloat4696
					* i_5_);
			aFloat4689 = (-(i_4_ * aFloat4698) + -i * aFloat4693 - i_5_
					* aFloat4694);
			aFloat4697 = (aFloat4700 * -i - i_4_ * aFloat4699 - i_5_
					* aFloat4690);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("ho.U(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ','
							+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	@Override
	final void method2101(final int i) {
		try {
			aFloat4688 = 1.0F;
			aFloat4700 = aFloat4694 = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			aFloat4690 = Class64_Sub5.aFloatArray3651[0x3fff & i];
			aFloat4699 = aFloat4697 = aFloat4692 = aFloat4696 = aFloat4691 = aFloat4698 = aFloat4689 = 0.0F;
			aFloat4693 = -aFloat4690;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ho.F(" + i + ')');
		}
	}

	@Override
	final void method2108(final int[] is) {
		try {
			final float f = -aFloat4697 + is[0];
			final float f_16_ = -aFloat4691 + is[1];
			final float f_17_ = is[2] - aFloat4689;
			is[0] = (int) (f_16_ * aFloat4692 + f * aFloat4700 + f_17_
					* aFloat4693);
			is[2] = (int) (aFloat4694 * f_17_ + (f * aFloat4690 + aFloat4696
					* f_16_));
			is[1] = (int) (aFloat4688 * f_16_ + aFloat4699 * f + aFloat4698
					* f_17_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ho.LA("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	final void method2097(final int i) {
		try {
			final float f = Class64_Sub5.aFloatArray3653[0x3fff & i];
			final float f_18_ = Class64_Sub5.aFloatArray3651[0x3fff & i];
			final float f_19_ = aFloat4700;
			final float f_20_ = aFloat4699;
			final float f_21_ = aFloat4690;
			final float f_22_ = aFloat4697;
			aFloat4700 = f_18_ * aFloat4693 + f_19_ * f;
			aFloat4699 = aFloat4698 * f_18_ + f * f_20_;
			aFloat4693 = -(f_18_ * f_19_) + f * aFloat4693;
			aFloat4698 = -(f_20_ * f_18_) + f * aFloat4698;
			aFloat4690 = f_18_ * aFloat4694 + f_21_ * f;
			aFloat4694 = aFloat4694 * f - f_18_ * f_21_;
			aFloat4697 = f_22_ * f + aFloat4689 * f_18_;
			aFloat4689 = -(f_18_ * f_22_) + aFloat4689 * f;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ho.RA(" + i + ')');
		}
	}

	@Override
	final void method2104(final int i) {
		try {
			aFloat4694 = 1.0F;
			aFloat4700 = aFloat4688 = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			aFloat4692 = Class64_Sub5.aFloatArray3651[i & 0x3fff];
			aFloat4690 = aFloat4697 = aFloat4696 = aFloat4691 = aFloat4693 = aFloat4698 = aFloat4689 = 0.0F;
			aFloat4699 = -aFloat4692;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ho.HA(" + i + ')');
		}
	}

	static final short method2117(final int i, final int i_23_) {
		try {
			final int i_24_ = (i & 0xfcc8) >> 1122429642;
			int i_26_ = 0x70 & i >> -544476509;
			final int i_27_ = 0x7f & i;
			i_26_ = ((i_27_ ^ 0xffffffff) < -65 ? (127 - i_27_) * i_26_ >> -1227528857
					: i_26_ * i_27_ >> -1204704377);
			final int i_28_ = i_27_ + i_26_;
			int i_29_;
			do {
				if ((i_28_ ^ 0xffffffff) != -1) {
					i_29_ = (i_26_ << 1992475560) / i_28_;
					if (!client.aBoolean3553) {
						break;
					}
				}
				i_29_ = i_26_ << 1259684257;
			} while (false);
			final int i_30_ = i_28_;
			
			return (short) (i_24_ << 450770282
					| i_29_ >> 45825476 << -224459065 | i_30_);
		} catch (final RuntimeException runtimeexception) {
		
			throw Class64_Sub27.printError(runtimeexception, "ho.A(" + i + ','
					+ i_23_ + ')');

		
		}
	}

	@Override
	final void method2092(final Class111 class111) {
		try {
			final Class111_Sub2 class111_sub2_31_ = (Class111_Sub2) class111;
			aFloat4696 = class111_sub2_31_.aFloat4696;
			aFloat4694 = class111_sub2_31_.aFloat4694;
			aFloat4689 = class111_sub2_31_.aFloat4689;
			aFloat4688 = class111_sub2_31_.aFloat4688;
			aFloat4691 = class111_sub2_31_.aFloat4691;
			aFloat4700 = class111_sub2_31_.aFloat4700;
			aFloat4693 = class111_sub2_31_.aFloat4693;
			aFloat4690 = class111_sub2_31_.aFloat4690;
			aFloat4699 = class111_sub2_31_.aFloat4699;
			aFloat4692 = class111_sub2_31_.aFloat4692;
			aFloat4698 = class111_sub2_31_.aFloat4698;
			aFloat4697 = class111_sub2_31_.aFloat4697;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ho.H("
					+ (class111 != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	final void method2105(final int i) {
		try {
			final float f = Class64_Sub5.aFloatArray3653[i & 0x3fff];
			final float f_32_ = Class64_Sub5.aFloatArray3651[i & 0x3fff];
			final float f_33_ = aFloat4692;
			final float f_34_ = aFloat4688;
			final float f_35_ = aFloat4696;
			aFloat4692 = -(f_32_ * aFloat4693) + f * f_33_;
			final float f_36_ = aFloat4691;
			aFloat4688 = -(aFloat4698 * f_32_) + f_34_ * f;
			aFloat4693 = f * aFloat4693 + f_33_ * f_32_;
			aFloat4698 = f_34_ * f_32_ + f * aFloat4698;
			aFloat4696 = -(aFloat4694 * f_32_) + f_35_ * f;
			aFloat4691 = -(f_32_ * aFloat4689) + f * f_36_;
			aFloat4694 = f_35_ * f_32_ + f * aFloat4694;
			aFloat4689 = f * aFloat4689 + f_32_ * f_36_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ho.O(" + i + ')');
		}
	}

	@Override
	final Class111 method2102() {
		try {
			final Class111_Sub2 class111_sub2_37_ = new Class111_Sub2();
			class111_sub2_37_.aFloat4690 = aFloat4690;
			class111_sub2_37_.aFloat4689 = aFloat4689;
			class111_sub2_37_.aFloat4694 = aFloat4694;
			class111_sub2_37_.aFloat4698 = aFloat4698;
			class111_sub2_37_.aFloat4692 = aFloat4692;
			class111_sub2_37_.aFloat4696 = aFloat4696;
			class111_sub2_37_.aFloat4700 = aFloat4700;
			class111_sub2_37_.aFloat4691 = aFloat4691;
			class111_sub2_37_.aFloat4693 = aFloat4693;
			class111_sub2_37_.aFloat4697 = aFloat4697;
			class111_sub2_37_.aFloat4699 = aFloat4699;
			class111_sub2_37_.aFloat4688 = aFloat4688;
			return class111_sub2_37_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ho.TA(" + ')');
		}
	}

	@Override
	final void method2099(final int i, final int i_38_, final int i_39_,
			final int[] is) {
		try {
			is[2] = (int) (aFloat4698 * i_38_ + aFloat4693 * i + i_39_
					* aFloat4694);
			is[1] = (int) (i_39_ * aFloat4696 + (aFloat4688 * i_38_ + i
					* aFloat4692));
			is[0] = (int) (i_39_ * aFloat4690 + (i * aFloat4700 + (aFloat4699 * i_38_)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ho.MA(" + i + ','
					+ i_38_ + ',' + i_39_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method2106(final int i, final int i_40_, final int i_41_) {
		try {
			aFloat4697 += i;
			aFloat4691 += i_40_;
			aFloat4689 += i_41_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ho.G(" + i + ','
					+ i_40_ + ',' + i_41_ + ')'));
		}
	}

	@Override
	final void method2090(final int i) {
		try {
			final float f = Class64_Sub5.aFloatArray3653[0x3fff & i];
			final float f_42_ = Class64_Sub5.aFloatArray3651[i & 0x3fff];
			final float f_43_ = aFloat4700;
			final float f_44_ = aFloat4699;
			final float f_45_ = aFloat4690;
			aFloat4700 = f_43_ * f - f_42_ * aFloat4692;
			final float f_46_ = aFloat4697;
			aFloat4699 = f_44_ * f - aFloat4688 * f_42_;
			aFloat4692 = f_42_ * f_43_ + f * aFloat4692;
			aFloat4690 = f_45_ * f - f_42_ * aFloat4696;
			aFloat4688 = aFloat4688 * f + f_42_ * f_44_;
			aFloat4697 = f_46_ * f - aFloat4691 * f_42_;
			aFloat4696 = aFloat4696 * f + f_45_ * f_42_;
			aFloat4691 = f_46_ * f_42_ + f * aFloat4691;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ho.C(" + i + ')');
		}
	}

	@Override
	final void method2103(final int i, final int i_47_, final int i_48_,
			final int[] is) {
		try {
			is[2] = (int) (aFloat4689 + (aFloat4693 * i + aFloat4698 * i_47_ + (aFloat4694 * i_48_)));
			is[1] = (int) (aFloat4691 + (aFloat4696 * i_48_ + (aFloat4692 * i + (aFloat4688 * i_47_))));
			is[0] = (int) (aFloat4697 + (aFloat4700 * i + i_47_ * aFloat4699 + (i_48_ * aFloat4690)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ho.M(" + i + ','
					+ i_47_ + ',' + i_48_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	public Class111_Sub2() {
		try {
			method2091();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ho.<init>(" + ')');
		}
	}
}
