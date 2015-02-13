/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;

final class Class110 {
	static int anInt944 = 0;
	static String[] aStringArray945 = new String[100];
	static int anInt946;

	@Override
	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					"haa.toString(" + ')');
		}
	}

	public static void method2086(final byte i) {
		try {
			if (i == 54) {
				aStringArray945 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "haa.B(" + i + ')');
		}
	}

	static final ha method2087(final Canvas canvas, final int i,
			final int i_0_, final d var_d) {
		try {
			if (i != 2) {
				method2087(null, -100, 122, null);
			}
			return new ha_Sub1(canvas, var_d, i_0_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("haa.C("
					+ (canvas != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + (var_d != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2088(final int i, final int i_1_, final byte i_2_) {
		try {
			final int i_3_ = (Class98_Sub25.anInt4024 <= i_1_ ? i_1_
					: Class98_Sub25.anInt4024);
			if (Class358.aClass110_3030 == this) {
				return 0;
			}
			if (i_2_ != -56) {
				anInt944 = -104;
			}
			if (ha.aClass110_941 == this) {
				return -i + i_3_;
			}
			if (this == Class314.aClass110_2688) {
				return (i_3_ - i) / 2;
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("haa.A(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	public Class110() {
		/* empty */
	}
}
