/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class323 {
	static Class128 aClass128_2715 = new Class128();
	static Class207 aClass207_2716;

	static final void method3675(final int i, final int i_0_,
			final boolean bool, final int i_1_, final int i_2_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i, -40, 10);
			if (bool != true) {
				aClass207_2716 = null;
			}
			class98_sub46_sub17.method1626((byte) -103);
			class98_sub46_sub17.anInt6051 = i_1_;
			class98_sub46_sub17.anInt6054 = i_0_;
			class98_sub46_sub17.anInt6053 = i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("tt.D(" + i + ','
					+ i_0_ + ',' + bool + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method3676(final int i, final int i_3_, final int i_4_,
			int i_5_, final byte[] is, final boolean bool, int i_6_,
			final byte[] is_7_, int i_8_) {
		try {
			if (bool == false) {
				final int i_9_ = -(i_5_ >> -1495816926);
				i_5_ = -(i_5_ & 0x3);
				for (int i_10_ = -i; i_10_ < 0; i_10_++) {
					for (int i_11_ = i_9_; (i_11_ ^ 0xffffffff) > -1; i_11_++) {
						is[i_8_++] += -is_7_[i_6_++];
						is[i_8_++] += -is_7_[i_6_++];
						is[i_8_++] += -is_7_[i_6_++];
						is[i_8_++] += -is_7_[i_6_++];
					}
					for (int i_12_ = i_5_; i_12_ < 0; i_12_++) {
						is[i_8_++] += -is_7_[i_6_++];
					}
					i_6_ += i_4_;
					i_8_ += i_3_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception,
							("tt.B(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_
									+ ',' + (is != null ? "{...}" : "null")
									+ ',' + bool + ',' + i_6_ + ','
									+ (is_7_ != null ? "{...}" : "null") + ','
									+ i_8_ + ')'));
		}
	}

	static final Class98_Sub18 method3677(final boolean bool, final int i,
			final int i_13_, final int i_14_, final int i_15_) {
		try {
			final Class98_Sub18 class98_sub18 = new Class98_Sub18();
			class98_sub18.anInt3947 = i_15_;
			class98_sub18.anInt3945 = i_13_;
			if (i >= -125) {
				return null;
			}
			Class116.aClass377_964.method3996(class98_sub18, i_14_, -1);
			Class98_Sub46_Sub15.method1609(i_13_, -12889);
			final Class293 class293 = Class159.method2509(i_14_, -9820);
			if (class293 != null) {
				Class341.method3812(class293);
			}
			if (OutputStream_Sub1.aClass293_33 != null) {
				Class341.method3812(OutputStream_Sub1.aClass293_33);
				OutputStream_Sub1.aClass293_33 = null;
			}
			Class230.method2869(44);
			if (class293 != null) {
				Class63.method549(class293, !bool, (byte) 66);
			}
			if (!bool) {
				ClientScriptsDefs.method3155(i_13_);
			}
			if (!bool && Class15.anInt185 != -1) {
				Class207.method2764(1, Class15.anInt185, -121);
			}
			return class98_sub18;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("tt.C(" + bool
					+ ',' + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	static final int method3678(final byte i, final Class38 class38) {
		try {
			if (i != 115) {
				return -85;
			}
			if (class38 != Node.aClass38_834) {
				if (class38 != Class357.aClass38_3026) {
					if (class38 == Class204.aClass38_1552) {
						return 34066;
					}
				} else {
					return 34065;
				}
			} else {
				return 9216;
			}
			throw new IllegalArgumentException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("tt.E(" + i + ','
					+ (class38 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3679(final int i) {
		do {
			try {
				aClass128_2715 = null;
				aClass207_2716 = null;
				if (i == -1443) {
					break;
				}
				method3677(true, -27, 83, -34, -122);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "tt.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
