/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class286 {
	int anInt2180;
	int anInt2181;
	static float aFloat2182;
	int anInt2183;
	int anInt2184;

	static final void method3380(final int i, final int i_0_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i_0_, i + -72, i);
			class98_sub46_sub17.method1621(0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rp.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method3381(final int i, final int i_1_, final int i_2_,
			final int i_3_,
			final Class246_Sub3_Sub4_Sub2 class246_sub3_sub4_sub2,
			final int i_4_,
			final Class246_Sub3_Sub4_Sub2 class246_sub3_sub4_sub2_5_,
			final int i_6_, final int i_7_, final int i_8_) {
		try {
			final int i_9_ = class246_sub3_sub4_sub2_5_.method3035(28213);
			if (i_9_ != -1) {
				Class332 class332 = ((Class332) Class378.aClass79_3189
						.method802(-120, i_9_));
				if (class332 == null) {
					final Class324[] class324s = Class324.method3680(
							Class332_Sub2.aClass207_5423, i_9_, 0);
					if (class324s == null) {
						return;
					}
					class332 = Class265.aHa1974.method1758(class324s[0], true);
					Class378.aClass79_3189
							.method805(i_9_, class332, (byte) -80);
				}
				Class168.method2533(i_7_ >> -1098562655,
						((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084,
						i_8_ >> 101128225,
						256 * class246_sub3_sub4_sub2.method3034(0), (byte) 94,
						((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079, i,
						((Class246_Sub3) class246_sub3_sub4_sub2).aByte5088,
						i_2_, 0);
				int i_10_ = i_1_ - -Class259.anIntArray1957[0] + -18;
				int i_11_ = -70 + (Class259.anIntArray1957[1] + i_4_);
				i_10_ += i_6_ / 4 * 18;
				i_11_ += 18 * (i_6_ % 4);
				class332.method3735(i_10_, i_11_);
				if (class246_sub3_sub4_sub2_5_ == class246_sub3_sub4_sub2) {
					Class265.aHa1974.method1781(true, 18, 18, -256, i_10_ - 1,
							-1 + i_11_);
				}
				Class93_Sub1_Sub1.method908(i_11_ + 18, -1 + i_11_, false,
						i_10_ - 1, 18 + i_10_);
				final Class246_Sub2 class246_sub2 = Class90.method883(-90);
				if (i_3_ > 15) {
					class246_sub2.anInt5071 = i_11_;
					class246_sub2.aClass246_Sub3_Sub4_Sub2_5076 = class246_sub3_sub4_sub2_5_;
					class246_sub2.anInt5075 = i_11_ - -16;
					class246_sub2.anInt5073 = 16 + i_10_;
					class246_sub2.anInt5074 = i_10_;
					Class151_Sub2.aClass218_4973
							.method2808(true, class246_sub2);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rp.D(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ','
					+ (class246_sub3_sub4_sub2 != null ? "{...}" : "null")
					+ ',' + i_4_ + ','
					+ ((class246_sub3_sub4_sub2_5_ != null) ? "{...}" : "null")
					+ ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final void method3382(final int i, final int i_12_, final int i_13_,
			final int i_14_, final int i_15_) {
		if (Class40.anIntArrayArray367 != null) {
			Class40.anIntArrayArray367[i][i_12_] = ~0xffffff | i_13_;
		}
		if (Class304.aShortArrayArray2534 != null) {
			Class304.aShortArrayArray2534[i][i_12_] = (short) i_14_;
		}
		if (Class299_Sub2.aByteArrayArray5291 != null) {
			Class299_Sub2.aByteArrayArray5291[i][i_12_] = (byte) i_15_;
		}
	}

	static final int method3383(
			final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2,
			final boolean bool) {
		try {
			if (bool != true) {
				return -121;
			}
			int i = (class246_sub3_sub4_sub2_sub2.anInt6522);
			final Class294 class294 = class246_sub3_sub4_sub2_sub2
					.method3039(1);
			if ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6385) == -1
					|| (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).aBoolean6359)) {
				i = class246_sub3_sub4_sub2_sub2.anInt6527;
			} else if (((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6385 ^ 0xffffffff) != (class294.anInt2389 ^ 0xffffffff))
					&& ((class294.anInt2361 ^ 0xffffffff) != (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6385 ^ 0xffffffff))
					&& ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6385 ^ 0xffffffff) != (class294.anInt2402 ^ 0xffffffff))
					&& (class294.anInt2357 != ((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6385)) {
				if ((((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6385) ^ 0xffffffff) == (class294.anInt2368 ^ 0xffffffff))
						|| ((class294.anInt2394 ^ 0xffffffff) == (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6385 ^ 0xffffffff))
						|| (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6385 == class294.anInt2403)
						|| ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6385 ^ 0xffffffff) == (class294.anInt2377 ^ 0xffffffff))) {
					i = class246_sub3_sub4_sub2_sub2.anInt6524;
				}
			} else {
				i = class246_sub3_sub4_sub2_sub2.anInt6517;
			}
			return i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rp.B("
					+ ((class246_sub3_sub4_sub2_sub2 != null) ? "{...}"
							: "null") + ',' + bool + ')'));
		}
	}

	public Class286() {
		/* empty */
	}
}
