/* Class98_Sub10_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub8 extends Class98_Sub10 {
	static d aD5578;
	static boolean[] aBooleanArray5579 = new boolean[8];

	static final Class98_Sub46_Sub10 method1026(final int i) {
		try {
			if (i != -3) {
				return null;
			}
			return Class278.aClass98_Sub46_Sub10_2056;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ej.B(" + i + ')');
		}
	}

	static final int method1027(int i, final int i_0_, final int i_1_) {
		try {
			if ((i_0_ ^ 0xffffffff) == 0) {
				return 12345678;
			}
			i = i * (i_0_ & 0x7f) >> 2041991591;
			do {
				if ((i ^ 0xffffffff) > -3) {
					i = 2;
					if (!client.aBoolean3553) {
						break;
					}
				}
				if ((i ^ 0xffffffff) < -127) {
					i = 126;
				}
			} while (false);
			if (i_1_ >= -73) {
				aBooleanArray5579 = null;
			}
			return i + (i_0_ & 0xff80);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ej.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	@Override
	final int[] method990(final int i, final int i_2_) {
		try {
			if (i != 255) {
				aBooleanArray5579 = null;
			}
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_2_);
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				final int i_3_ = GameObjectDefinition.anIntArray3001[i_2_];
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff); i_4_++) {
					is[i_4_] = method1030(Class64_Sub1.anIntArray3640[i_4_],
							(byte) 3, i_3_) % 4096;
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ej.G(" + i + ','
					+ i_2_ + ')');
		}
	}

	public static void method1028(final boolean bool) {
		do {
			try {
				aBooleanArray5579 = null;
				aD5578 = null;
				if (bool == false) {
					break;
				}
				aD5578 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ej.D(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final Class350 method1029(final byte i, final int i_5_) {
		try {
			final Class350[] class350s = Class306.method3595((byte) 67);
			for (int i_6_ = 0; i_6_ < class350s.length; i_6_++) {
				final Class350 class350 = class350s[i_6_];
				if (i_5_ == class350.anInt2920) {
					return class350;
				}
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ej.E(" + i + ','
					+ i_5_ + ')');
		}
	}

	private final int method1030(final int i, final byte i_7_, final int i_8_) {
		try {
			int i_9_ = 57 * i_8_ + i;
			if (i_7_ != 3) {
				method1027(-5, 93, 26);
			}
			i_9_ = i_9_ << -924402879 ^ i_9_;
			return (-(((789221 + i_9_ * i_9_ * 15731) * i_9_ - -1376312589 & 0x7fffffff) / 262144) + 4096);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ej.H(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	public Class98_Sub10_Sub8() {
		super(0, true);
	}
}
