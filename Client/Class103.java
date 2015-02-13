/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class103 implements Runnable {
	static int anInt890;
	Class88 aClass88_891;
	static int anInt892;
	volatile boolean aBoolean893;
	volatile Class268[] aClass268Array894 = new Class268[2];
	volatile boolean aBoolean895;
	static int anInt896 = 0;

	@Override
	public final void run() {
		try {
			aBoolean895 = true;
			try {
				while (!aBoolean893) {
					for (int i = 0; (i ^ 0xffffffff) > -3; i++) {
						final Class268 class268 = aClass268Array894[i];
						if (class268 != null) {
							class268.method3261((byte) -122);
						}
					}
					Class246_Sub7.method3131(0, 10L);
					PlayerUpdate.method2857(aClass88_891, 31668, null);
				}
			} catch (final Exception exception) {
				Class305_Sub1.method3585(exception, -123, null);
			} finally {
				aBoolean895 = false;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gi.run(" + ')');
		}
	}

	static final void method1711(final ha var_ha, final byte i,
			final Class98_Sub47 class98_sub47, final Class24 class24) {
		try {
			final Class332 class332 = class24.method286(var_ha, (byte) 92);
			if (class332 != null) {
				int i_0_ = class332.method3734();
				if ((i_0_ ^ 0xffffffff) > (class332.method3731() ^ 0xffffffff)) {
					i_0_ = class332.method3731();
				}
				final int i_1_ = 10;
				int i_2_ = class98_sub47.anInt4266;
				if (i <= 7) {
					anInt892 = 104;
				}
				int i_3_ = class98_sub47.anInt4271;
				int i_4_ = 0;
				int i_5_ = 0;
				int i_6_ = 0;
				if (class24.aString263 != null) {
					i_4_ = (Class98_Sub46_Sub2_Sub2.aClass197_6296.method2675(
							class24.aString263, SurfaceSkin.aStringArray335, null,
							null, -1));
					for (int i_7_ = 0; i_4_ > i_7_; i_7_++) {
						String string = SurfaceSkin.aStringArray335[i_7_];
						if (i_7_ < i_4_ - 1) {
							string = string.substring(0, -4 + string.length());
						}
						final int i_8_ = Class339_Sub1.aClass326_5308
								.method3701(string);
						if (i_5_ < i_8_) {
							i_5_ = i_8_;
						}
					}
					i_6_ = (Class339_Sub1.aClass326_5308.method3705() * i_4_ - -(Class339_Sub1.aClass326_5308
							.method3704() / 2));
				}
				int i_9_ = i_0_ / 2 + class98_sub47.anInt4266;
				if (Class278.anInt2086 - -i_0_ <= i_2_) {
					if ((i_2_ ^ 0xffffffff) < (-i_0_ + Class278.anInt2093 ^ 0xffffffff)) {
						i_9_ = (Class278.anInt2093 - i_0_ / 2
								- (i_1_ + i_5_ / 2) - 5);
						i_2_ = -i_0_ + Class278.anInt2093;
					}
				} else {
					i_9_ = i_5_ / 2 + i_1_
							+ (i_0_ / 2 + Class278.anInt2086 + 5);
					i_2_ = Class278.anInt2086;
				}
				int i_10_ = class98_sub47.anInt4271;
				if ((Class278.anInt2077 - -i_0_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
					i_10_ = i_0_ / 2 + i_1_ + Class278.anInt2077;
					i_3_ = Class278.anInt2077;
				} else if ((Class278.anInt2094 - i_0_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff)) {
					i_10_ = -i_6_ + (-i_1_ + Class278.anInt2094) + -(i_0_ / 2);
					i_3_ = -i_0_ + Class278.anInt2094;
				}
				final int i_11_ = (0xffff & (int) (32767.0 * (Math.atan2(i_2_
						- (class98_sub47.anInt4266), -(class98_sub47.anInt4271)
						+ i_3_) / 3.141592653589793)));
				class332.method3730(i_2_ + i_0_ / 2.0F, i_0_ / 2.0F + i_3_,
						4096, i_11_);
				int i_12_ = -2;
				int i_13_ = -2;
				int i_14_ = -2;
				int i_15_ = -2;
				if (class24.aString263 != null) {
					i_13_ = i_10_;
					i_12_ = i_9_ + -(i_5_ / 2) + -5;
					i_15_ = 3 + (i_4_
							* Class339_Sub1.aClass326_5308.method3705() + i_13_);
					i_14_ = 10 + i_12_ + i_5_;
					if ((class24.anInt226 ^ 0xffffffff) != -1) {
						var_ha.method1760(i_14_ + -i_12_, i_15_ + -i_13_,
								i_13_, class24.anInt226, (byte) -66, i_12_);
					}
					if ((class24.anInt239 ^ 0xffffffff) != -1) {
						var_ha.method1781(true, i_15_ + -i_13_, i_14_ - i_12_,
								class24.anInt239, i_12_, i_13_);
					}
					for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_16_++) {
						String string = SurfaceSkin.aStringArray335[i_16_];
						if (i_16_ < i_4_ - 1) {
							string = string.substring(0, -4 + string.length());
						}
						Class339_Sub1.aClass326_5308.method3706(var_ha, string,
								i_9_, i_10_, class24.anInt257, true);
						i_10_ += Class339_Sub1.aClass326_5308.method3705();
					}
				}
				if (class24.anInt245 != -1 || class24.aString263 != null) {
					final Class98_Sub23 class98_sub23 = new Class98_Sub23(
							class98_sub47);
					i_0_ >>= 1;
					class98_sub23.anInt4004 = i_15_;
					class98_sub23.anInt4005 = i_13_;
					class98_sub23.anInt4002 = i_14_;
					class98_sub23.anInt4003 = i_12_;
					class98_sub23.anInt4000 = i_3_ - -i_0_;
					class98_sub23.anInt4006 = i_2_ + i_0_;
					class98_sub23.anInt3996 = i_2_ + -i_0_;
					class98_sub23.anInt3999 = -i_0_ + i_3_;
					Class8.aClass148_110.method2419(class98_sub23, -20911);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gi.A("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ','
					+ (class98_sub47 != null ? "{...}" : "null") + ','
					+ (class24 != null ? "{...}" : "null") + ')'));
		}
	}

	Class103() {
		aBoolean893 = false;
		aBoolean895 = false;
	}
}
