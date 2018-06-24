import jaclib.memory.heap.NativeHeap;

/* za_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class za_Sub1 extends za {
	static int anInt6075;
	static int anInt6076;
	static Class98_Sub5[] aClass98_Sub5Array6077 = new Class98_Sub5[8];
	NativeHeap aNativeHeap6078;

	final void method1677(final byte i) {
		try {
			if (i != 41) {
				method1679(41, -90, (byte) 42, null);
			}
			aNativeHeap6078.b();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "eb.F(" + i + ')');
		}
	}

	public static void method1678(final int i) {
		try {
			if (i == -129) {
				aClass98_Sub5Array6077 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "eb.D(" + i + ')');
		}
	}

	static final String method1679(final int i, final int i_0_,
			final byte i_1_, final byte[] is) {
		try {
			if (i_1_ > -35) {
				anInt6076 = 112;
			}
			final char[] cs = new char[i_0_];
			int i_2_ = 0;
			int i_3_ = i;
			final int i_4_ = i_0_ + i;
			while (i_4_ > i_3_) {
				final int i_5_ = 0xff & is[i_3_++];
				int i_6_;
				if ((i_5_ ^ 0xffffffff) > -129) {
					if (i_5_ == 0) {
						i_6_ = 65533;
					} else {
						i_6_ = i_5_;
					}
				} else if (i_5_ < 192) {
					i_6_ = 65533;
				} else if (i_5_ < 224) {
					if ((i_3_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)
							&& (0xc0 & is[i_3_] ^ 0xffffffff) == -129) {
						i_6_ = is[i_3_++] & 0x3f | i_5_ << -915049466 & 0x7c0;
						if (i_6_ < 128) {
							i_6_ = 65533;
						}
					} else {
						i_6_ = 65533;
					}
				} else if ((i_5_ ^ 0xffffffff) > -241) {
					if (i_3_ + 1 < i_4_ && (is[i_3_] & 0xc0) == 128
							&& (0xc0 & is[i_3_ - -1] ^ 0xffffffff) == -129) {
						i_6_ = ((0x3f & is[i_3_++]) << -1763835738
								| (i_5_ & 0xf) << -2124097300 | 0x3f & is[i_3_++]);
						if (i_6_ < 2048) {
							i_6_ = 65533;
						}
					} else {
						i_6_ = 65533;
					}
				} else if (i_5_ < 248) {
					if (2 + i_3_ >= i_4_ || (is[i_3_] & 0xc0) != 128
							|| (is[i_3_ + 1] & 0xc0) != 128
							|| (is[2 + i_3_] & 0xc0) != 128) {
						i_6_ = 65533;
					} else {
						i_6_ = (0x1c0000 & i_5_ << -1549523662
								| (is[i_3_++] & 0x3f) << 1368200812
								| (is[i_3_++] & 0x3f) << 1875455398 | is[i_3_++] & 0x3f);
						if ((i_6_ ^ 0xffffffff) <= -65537
								&& (i_6_ ^ 0xffffffff) >= -1114112) {
							i_6_ = 65533;
						} else {
							i_6_ = 65533;
						}
					}
				} else {
					i_6_ = 65533;
				}
				cs[i_2_++] = (char) i_6_;
			}
			return new String(cs, 0, i_2_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("eb.E(" + i + ',' + i_0_ + ',' + i_1_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	za_Sub1(final int i) {
		try {
			aNativeHeap6078 = new NativeHeap(i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "eb.<init>(" + i
					+ ')');
		}
	}
}
