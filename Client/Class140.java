/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class140 implements Interface6 {
	static Class47 aClass47_3241;
	private Class377 aClass377_3242 = new Class377(128);
	static int anInt3243;
	int[] anIntArray3244;
	static Class48 aClass48_3245;
	static boolean[] aBooleanArray3246;
	private int[] anIntArray3247;
	static OutgoingOpcode aClass171_3248 = new OutgoingOpcode(42, 4);

	public static void method2285(final int i) {
		try {
			aClass171_3248 = null;
			aClass48_3245 = null;
			if (i != -4492) {
				method2287(-125, -67, -94);
			}
			aBooleanArray3246 = null;
			aClass47_3241 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jk.B(" + i + ')');
		}
	}

	final void method2286(final int i, final int i_0_, final int i_1_) {
		try {
			if (i_1_ == 5000) {
				client.prayerpoints = i_0_;
				return;
			}
			anIntArray3247[i_1_] = i_0_;
			Class98_Sub50 class98_sub50 = (Class98_Sub50) aClass377_3242
					.method3990(i_1_, -1);
			if (class98_sub50 != null) {
				if ((class98_sub50.aLong4288 ^ 0xffffffffffffffffL) != -4611686018427387906L) {
					class98_sub50.aLong4288 = (0x4000000000000000L | Class343
							.method3819(-47) - -500L);
				}
			} else {
				class98_sub50 = new Class98_Sub50(4611686018427387905L);
				aClass377_3242.method3996(class98_sub50, i_1_, -1);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("jk.G(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	@Override
	public final int method6(final int i, final int i_2_) {
		try {
			return anIntArray3244[i];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jk.H(" + i + ','
					+ i_2_ + ')');
		}
	}

	@Override
	public final int method7(final int i, final int i_4_) {
		try {
			final Class366 class366 = Class17.aClass198_205.method2680(i,
					(byte) 40);
			final int i_5_ = class366.anInt3115;
			final int i_6_ = class366.anInt3116;
			final int i_7_ = class366.anInt3118;
			if (i_4_ != 7373) {
				return -48;
			}
			final int i_8_ = Class98_Sub46_Sub20.anIntArray6070[i_7_ + -i_6_];
			return anIntArray3244[i_5_] >> i_6_ & i_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jk.I(" + i + ','
					+ i_4_ + ')');
		}
	}

	static final boolean method2287(final int i, final int i_9_, final int i_10_) {
		try {
			if (i_10_ != 2048) {
				return false;
			}
			if ((0x800 & i ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("jk.D(" + i + ','
					+ i_9_ + ',' + i_10_ + ')'));
		}
	}

	final void method2288(final byte i) {
		try {
			int i_11_ = 0;
			for (/**/; ((Class134.aClass139_3465.anInt1086 ^ 0xffffffff) < (i_11_ ^ 0xffffffff)); i_11_++) {
				final Class167 class167 = Class134.aClass139_3465.method2282(
						i_11_, 16);
				if (class167 != null && class167.anInt1283 == 0) {
					anIntArray3247[i_11_] = 0;
					anIntArray3244[i_11_] = 0;
				}
			}
			aClass377_3242 = new Class377(128);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jk.F(" + i + ')');
		}
	}

	final void method2289(int i, final int i_13_, final int i_14_) {
		try {
			final Class366 class366 = Class17.aClass198_205.method2680(i_13_,
					(byte) 68);
			final int i_15_ = class366.anInt3115;
			final int i_16_ = class366.anInt3116;
			final int i_17_ = class366.anInt3118;
			int i_18_ = Class98_Sub46_Sub20.anIntArray6070[i_17_ - i_16_];
			if (i < i_14_ || (i ^ 0xffffffff) < (i_18_ ^ 0xffffffff)) {
				i = 0;
			}
			i_18_ <<= i_16_;
			method2291(
					i_15_,
					86,
					(i_18_ & i << i_16_ | ((i_18_ ^ 0xffffffff) & anIntArray3244[i_15_])));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("jk.E(" + i + ','
					+ i_13_ + ',' + i_14_ + ')'));
		}
	}

	final int method2290(final int i, final boolean bool) {
		try {
			final long l = Class343.method3819(-47);
			Class98_Sub50 class98_sub50 = (!bool ? (Class98_Sub50) aClass377_3242
					.method3995(-1) : (Class98_Sub50) aClass377_3242
					.method3998(117));
			for (/**/; class98_sub50 != null; class98_sub50 = (Class98_Sub50) aClass377_3242
					.method3995(-1)) {
				if (((0x3fffffffffffffffL & class98_sub50.aLong4288) ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
					if ((0x4000000000000000L & class98_sub50.aLong4288) == 0L) {
						class98_sub50.method942(59);
					} else {
						final int i_20_ = (int) ((Node) class98_sub50).aLong832;
						anIntArray3244[i_20_] = anIntArray3247[i_20_];
						class98_sub50.method942(45);
						return i_20_;
					}
				}
			}
			return -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jk.A(" + i + ','
					+ bool + ')');
		}
	}

	public Class140() {
		try {
			anIntArray3244 = new int[Class134.aClass139_3465.anInt1086];
			anIntArray3247 = new int[Class134.aClass139_3465.anInt1086];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jk.<init>(" + ')');
		}
	}

	final void method2291(final int i, final int i_21_, final int i_22_) {
		do {
			try {
				anIntArray3244[i] = i_22_;
				Class98_Sub50 class98_sub50 = (Class98_Sub50) aClass377_3242
						.method3990(i, -1);
				do {
					if (class98_sub50 == null) {
						class98_sub50 = new Class98_Sub50(
								500L + Class343.method3819(-47));
						aClass377_3242.method3996(class98_sub50, i, -1);
						if (!client.aBoolean3553) {
							break;
						}
					}
					class98_sub50.aLong4288 = Class343.method3819(-47) - -500L;
				} while (false);
				if (i_21_ > 58) {
					break;
				}
				method2286(36, 108, 47);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("jk.J(" + i
						+ ',' + i_21_ + ',' + i_22_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2292(final int i, int i_23_, final int i_24_) {
		try {
			final Class366 class366 = Class17.aClass198_205.method2680(i,
					(byte) 98);
			final int i_25_ = class366.anInt3115;
			if (i_24_ == -32727) {
				final int i_26_ = class366.anInt3116;
				final int i_27_ = class366.anInt3118;
				int i_28_ = Class98_Sub46_Sub20.anIntArray6070[i_27_ + -i_26_];
				if ((i_23_ ^ 0xffffffff) > -1 || i_28_ < i_23_) {
					i_23_ = 0;
				}
				i_28_ <<= i_26_;
				method2286(i_24_ + 25258,
						(i_23_ << i_26_ & i_28_ | anIntArray3247[i_25_]
								& (i_28_ ^ 0xffffffff)), i_25_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("jk.C(" + i + ','
					+ i_23_ + ',' + i_24_ + ')'));
		}
	}
}
