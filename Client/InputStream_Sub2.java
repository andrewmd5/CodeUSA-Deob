/* InputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

final class InputStream_Sub2 extends InputStream {
	static int anInt29 = -50;

	static final aa_Sub3 method123(final int i, final int[] is,
			final ha_Sub1 var_ha_Sub1, final int i_0_, final int[] is_1_,
			final byte i_2_) {
		try {
			if (i_2_ != 111) {
				anInt29 = -5;
			}
			final byte[] is_3_ = new byte[i * i_0_];
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i ^ 0xffffffff); i_4_++) {
				int i_5_ = i_0_ * i_4_ + is[i_4_];
				for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (is_1_[i_4_] ^ 0xffffffff); i_6_++) {
					is_3_[i_5_++] = (byte) -1;
				}
			}
			return new aa_Sub3(var_ha_Sub1, i_0_, i, is_3_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("rca.B(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ (var_ha_Sub1 != null ? "{...}" : "null") + ','
							+ i_0_ + ',' + (is_1_ != null ? "{...}" : "null")
							+ ',' + i_2_ + ')'));
		}
	}

	@Override
	public final int read() {
		try {
			Class246_Sub7.method3131(0, 30000L);
			return -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rca.read(" + ')');
		}
	}

	static final void method124(final int i) {
		try {
			Class64_Sub9.aClass332_3663 = null;
			Canvas_Sub1.anInt26 = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rca.A(" + i + ')');
		}
	}

	static final void method125(final int i, final int i_8_, final int i_9_,
			final int i_10_, final int i_11_, final int i_12_) {
		try {
			final int i_13_ = i + -i_11_;
			if (i_12_ != 21597) {
				anInt29 = 22;
			}
			final int i_14_ = i_9_ + -i_10_;
			if ((i_13_ ^ 0xffffffff) != -1) {
				if (i_14_ == 0) {
					Class318.method3656(i_8_, i_11_, (byte) 85, i, i_10_);
					return;
				}
			} else {
				if (i_14_ != 0) {
					Class98_Sub50
							.method1671(i_11_, (byte) 0, i_10_, i_9_, i_8_);
				}
				return;
			}
			final int i_15_ = (i_14_ << -2124827092) / i_13_;
			final int i_16_ = i_10_ + -(i_15_ * i_11_ >> 203447180);
			int i_17_;
			int i_18_;
			if ((i ^ 0xffffffff) > (Class76_Sub8.anInt3778 ^ 0xffffffff)) {
				i_18_ = i_16_ + (i_15_ * Class76_Sub8.anInt3778 >> -277934004);
				i_17_ = Class76_Sub8.anInt3778;
			} else if (i > Class3.anInt77) {
				i_17_ = Class3.anInt77;
				i_18_ = i_16_ + (Class3.anInt77 * i_15_ >> 674340300);
			} else {
				i_17_ = i;
				i_18_ = i_9_;
			}
			int i_19_;
			int i_20_;
			if (Class76_Sub8.anInt3778 > i_11_) {
				i_19_ = i_16_ - -(i_15_ * Class76_Sub8.anInt3778 >> 376571916);
				i_20_ = Class76_Sub8.anInt3778;
			} else if ((i_11_ ^ 0xffffffff) < (Class3.anInt77 ^ 0xffffffff)) {
				i_19_ = i_16_ + (i_15_ * Class3.anInt77 >> 854040140);
				i_20_ = Class3.anInt77;
			} else {
				i_19_ = i_10_;
				i_20_ = i_11_;
			}
			if (Class98_Sub10_Sub38.anInt5753 > i_18_) {
				i_18_ = Class98_Sub10_Sub38.anInt5753;
				i_17_ = ((-i_16_ + Class98_Sub10_Sub38.anInt5753 << -561169876) / i_15_);
			} else if ((Class218.anInt1635 ^ 0xffffffff) > (i_18_ ^ 0xffffffff)) {
				i_17_ = (-i_16_ + Class218.anInt1635 << -895871700) / i_15_;
				i_18_ = Class218.anInt1635;
			}
			if ((Class98_Sub10_Sub38.anInt5753 ^ 0xffffffff) >= (i_19_ ^ 0xffffffff)) {
				if ((i_19_ ^ 0xffffffff) < (Class218.anInt1635 ^ 0xffffffff)) {
					i_19_ = Class218.anInt1635;
					i_20_ = (-i_16_ + Class218.anInt1635 << 322051660) / i_15_;
				}
			} else {
				i_19_ = Class98_Sub10_Sub38.anInt5753;
				i_20_ = ((-i_16_ + Class98_Sub10_Sub38.anInt5753 << 865861260) / i_15_);
			}
			Class91.method890(i_8_, i_19_, i_18_, i_17_, (byte) -126, i_20_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rca.C(" + i + ','
					+ i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ','
					+ i_12_ + ')'));
		}
	}
}
