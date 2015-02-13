/* Class119_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class119_Sub4 extends Class119 {
	private int anInt4736;
	private int anInt4737;
	private int anInt4738;
	static Class332[] aClass332Array4739;
	static float aFloat4740 = 1024.0F;
	private int anInt4741;

	@Override
	final void method2178(final int i, final int i_0_, final int i_1_) {
		try {
			final int i_3_ = i_0_ * anInt4738 >> -282666356;
			final int i_4_ = i_0_ * anInt4736 >> 151121132;
			final int i_5_ = anInt4737 * i_1_ >> -444889972;
			final int i_6_ = i_1_ * anInt4741 >> 150376812;
			Class98_Sub47.method1658(i_5_, i_3_, i_4_, 16977, i_6_,
					((Class119) this).anInt988);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sr.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	@Override
	final void method2174(final int i, final int i_7_, final int i_8_) {
		try {
			final int i_9_ = i * anInt4738 >> 263929676;
			final int i_10_ = i * anInt4736 >> -496298516;
			if (i_8_ == -5515) {
				final int i_11_ = anInt4737 * i_7_ >> -1264175348;
				final int i_12_ = anInt4741 * i_7_ >> 226072012;
				za.method1675(i_10_, ((Class119) this).anInt987, i_12_, i_11_,
						((Class119) this).anInt985, i_9_,
						((Class119) this).anInt988, (byte) -89);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sr.C(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final float method2188(final float f, final int i) {
		try {
			if (i != 1024) {
				method2190(-15, -6);
			}
			return f * f * f * (10.0F + f * (6.0F * f - 15.0F));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sr.F(" + f + ','
					+ i + ')');
		}
	}

	public static void method2189(final byte i) {
		do {
			try {
				aClass332Array4739 = null;
				if (i == -1) {
					break;
				}
				method2190(-110, 15);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "sr.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	Class119_Sub4(final int i, final int i_13_, final int i_14_,
			final int i_15_, final int i_16_, final int i_17_, final int i_18_) {
		super(i_16_, i_17_, i_18_);
		try {
			anInt4738 = i;
			anInt4741 = i_15_;
			anInt4736 = i_14_;
			anInt4737 = i_13_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sr.<init>(" + i
					+ ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_
					+ ',' + i_17_ + ',' + i_18_ + ')'));
		}
	}

	@Override
	final void method2179(final byte i, final int i_19_, final int i_20_) {
		try {
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sr.E(" + i + ','
					+ i_19_ + ',' + i_20_ + ')'));
		}
	}

	static final void method2190(final int i, final int i_22_) {
		try {
			Class256.anInt1945 = i_22_;
			Class98_Sub5_Sub2.anInt5536 = -1;
			Class64_Sub25.anInt3711 = 3;
			Class287.anInt2186 = 100;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "sr.A(" + i + ','
					+ i_22_ + ')');
		}
	}
}
