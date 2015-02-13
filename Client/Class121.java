/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class121 {
	static OutgoingOpcode aClass171_1001 = new OutgoingOpcode(64, 3);
	private Class207 aClass207_1002;
	Class79 aClass79_1003 = new Class79(20);
	static Class197 aClass197_1004;
	Class207 aClass207_1005;
	static int[] anIntArray1006;
	private final Class79 aClass79_1007 = new Class79(64);

	final void method2191(final int i, final byte i_0_) {
		try {
			synchronized (aClass79_1007) {
				aClass79_1007.method800((byte) 62, i);
			}
			if (i_0_ != 126) {
				anIntArray1006 = null;
			}
			synchronized (aClass79_1003) {
				aClass79_1003.method800((byte) 62, i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hv.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final int[] method2192(final int i) {
		try {
			if (i > -88) {
				method2195(49);
			}
			return new int[] { Class244.anInt1860, Class269.anInt2026,
					Class123_Sub1.anInt4742 };
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hv.B(" + i + ')');
		}
	}

	final void method2193(final int i) {
		try {
			synchronized (aClass79_1007) {
				aClass79_1007.method806((byte) -104);
			}
			synchronized (aClass79_1003) {
				aClass79_1003.method806((byte) 49);
			}
			if (i != 0) {
				method2191(66, (byte) -78);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hv.E(" + i + ')');
		}
	}

	final Class86 method2194(final int i, final int i_1_) {
		try {
			Class86 class86;
			synchronized (aClass79_1007) {
				class86 = (Class86) aClass79_1007.method802(-120, i_1_);
			}
			if (class86 != null) {
				return class86;
			}
			byte[] is;
			synchronized (aClass207_1002) {
				is = aClass207_1002.method2745(i_1_, 46, false);
			}
			class86 = new Class86();
			class86.aClass121_644 = this;
			if (is != null) {
				class86.method851(new ByteBuffer(is), -1);
			}
			synchronized (aClass79_1007) {
				aClass79_1007.method805(i_1_, class86, (byte) -80);
			}
			return class86;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hv.D(" + i + ','
					+ i_1_ + ')');
		}
	}

	static final void method2195(final int i) {
		try {
			if (i != 30574) {
				anIntArray1006 = null;
			}
			Class2.anInt71 = 0;
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -2049; i_3_++) {
				Class224_Sub3_Sub1.aClass98_Sub22Array6146[i_3_] = null;
				Class98_Sub10_Sub21.aByteArray5642[i_3_] = (byte) 1;
				Class306.aClass376Array2562[i_3_] = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hv.H(" + i + ')');
		}
	}

	public static void method2196(final byte i) {
		try {
			aClass171_1001 = null;
			if (i != -10) {
				method2196((byte) -3);
			}
			aClass197_1004 = null;
			anIntArray1006 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hv.G(" + i + ')');
		}
	}

	final void method2197(final byte i) {
		try {
			synchronized (aClass79_1007) {
				if (i > -34) {
					method2193(-47);
				}
				aClass79_1007.method794(95);
			}
			synchronized (aClass79_1003) {
				aClass79_1003.method794(94);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "hv.F(" + i + ')');
		}
	}

	static final boolean method2198(int i, final int i_4_, final int i_5_,
			final byte[] is, final int i_6_, final int i_7_, final int i_8_) {
		try {
			final int i_9_ = i_5_ % i_6_;
			int i_10_;
			if (i_9_ == 0) {
				i_10_ = 0;
			} else {
				i_10_ = i_6_ - i_9_;
			}
			final int i_11_ = -((i_8_ - (-i_6_ + 1)) / i_6_);
			final int i_12_ = -((-1 + i_5_ + i_6_) / i_6_);
			if (i_7_ != 14849) {
				aClass171_1001 = null;
			}
			for (int i_13_ = i_11_; i_13_ < 0; i_13_++) {
				for (int i_14_ = i_12_; i_14_ < 0; i_14_++) {
					if ((is[i] ^ 0xffffffff) == -1) {
						return true;
					}
					i += i_6_;
				}
				i -= i_10_;
				if ((is[-1 + i] ^ 0xffffffff) == -1) {
					return true;
				}
				i += i_4_;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hv.C(" + i + ','
					+ i_4_ + ',' + i_5_ + ',' + (is != null ? "{...}" : "null")
					+ ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	Class121(final Class279 class279, final int i, final Class207 class207,
			final Class207 class207_15_) {
		try {
			aClass207_1002 = class207;
			aClass207_1005 = class207_15_;
			aClass207_1002.method2761(0, 46);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("hv.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class207_15_ != null ? "{...}" : "null") + ')'));
		}
	}
}
