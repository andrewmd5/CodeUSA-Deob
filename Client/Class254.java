/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class254 {
	private int anInt1938;
	private Class98_Sub46[] aClass98_Sub46Array1939;
	static OutgoingOpcode aClass171_1940 = new OutgoingOpcode(35, 5);
	private Class98_Sub46 aClass98_Sub46_1941;
	private long aLong1942;
	static Class332[] aClass332Array1943;
	static int anInt1944 = 0;

	final void method3185(final byte i, final Class98_Sub46 class98_sub46,
			final long l) {
		try {
			if (class98_sub46.aClass98_Sub46_4265 != null) {
				class98_sub46.method1524((byte) -90);
			}
			final Class98_Sub46 class98_sub46_0_ = aClass98_Sub46Array1939[(int) (-1
					+ anInt1938 & l)];
			class98_sub46.aClass98_Sub46_4262 = class98_sub46_0_;
			class98_sub46.aClass98_Sub46_4265 = class98_sub46_0_.aClass98_Sub46_4265;
			(class98_sub46.aClass98_Sub46_4265).aClass98_Sub46_4262 = class98_sub46;
			if (i > -6) {
				aLong1942 = -42L;
			}
			(class98_sub46.aClass98_Sub46_4262).aClass98_Sub46_4265 = class98_sub46;
			class98_sub46.aLong4259 = l;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("pu.E(" + i + ','
							+ (class98_sub46 != null ? "{...}" : "null") + ','
							+ l + ')'));
		}
	}

	static final void method3186(final int i) {
		try {
			int i_1_ = 0;
			if (i < 6) {
				method3188(6);
			}
			for (int i_2_ = 0; i_2_ < Class165.anInt1276; i_2_++) {
				for (int i_3_ = 0; ((Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
					if (Class253.method3175(i_2_, i_1_,
							(Class98_Sub46_Sub1.aClass172ArrayArrayArray5948),
							i_3_, (byte) -76, true)) {
						i_1_++;
					}
					if (i_1_ >= 512) {
						return;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pu.A(" + i + ')');
		}
	}

	static final boolean method3187(int i, int i_4_, int i_5_, final byte i_6_,
			int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			if (!Class73.method719(i_5_, i_12_, i_7_, i_6_ ^ 0x52)) {
				return false;
			}
			i_7_ = Class114.anIntArray958[1];
			i_5_ = Class114.anIntArray958[2];
			i_12_ = Class114.anIntArray958[0];
			if (i_6_ != 82) {
				method3186(-21);
			}
			if (!Class73.method719(i_10_, i_11_, i, 0)) {
				return false;
			}
			i = Class114.anIntArray958[1];
			i_10_ = Class114.anIntArray958[2];
			i_11_ = Class114.anIntArray958[0];
			if (!Class73.method719(i_8_, i_4_, i_9_, 0)) {
				return false;
			}
			i_9_ = Class114.anIntArray958[1];
			i_4_ = Class114.anIntArray958[0];
			i_8_ = Class114.anIntArray958[2];
			return Class267.method3243(i_11_, i_12_, (byte) 82, i_10_, i_9_,
					i_7_, i_4_, i, i_5_, i_8_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("pu.F(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ','
							+ i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_
							+ ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	public static void method3188(final int i) {
		try {
			aClass171_1940 = null;
			if (i != -386) {
				method3187(80, 18, 123, (byte) 83, -110, -108, -70, -39, -108,
						-12);
			}
			aClass332Array1943 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pu.C(" + i + ')');
		}
	}

	final Class98_Sub46 method3189(final long l, final byte i) {
		try {
			aLong1942 = l;
			final Class98_Sub46 class98_sub46 = aClass98_Sub46Array1939[(int) (l & anInt1938
					+ -1)];
			aClass98_Sub46_1941 = class98_sub46.aClass98_Sub46_4262;
			for (/**/; aClass98_Sub46_1941 != class98_sub46; aClass98_Sub46_1941 = (aClass98_Sub46_1941.aClass98_Sub46_4262)) {
				if ((aClass98_Sub46_1941.aLong4259 ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
					final Class98_Sub46 class98_sub46_14_ = aClass98_Sub46_1941;
					aClass98_Sub46_1941 = (aClass98_Sub46_1941.aClass98_Sub46_4262);
					return class98_sub46_14_;
				}
			}
			aClass98_Sub46_1941 = null;
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pu.D(" + l + ','
					+ i + ')');
		}
	}

	Class254(final int i) {
		try {
			anInt1938 = i;
			aClass98_Sub46Array1939 = new Class98_Sub46[i];
			for (int i_15_ = 0; i > i_15_; i_15_++) {
				final Class98_Sub46 class98_sub46 = aClass98_Sub46Array1939[i_15_] = new Class98_Sub46();
				class98_sub46.aClass98_Sub46_4262 = class98_sub46;
				class98_sub46.aClass98_Sub46_4265 = class98_sub46;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pu.<init>(" + i
					+ ')');
		}
	}

	final Class98_Sub46 method3190(final boolean bool) {
		try {
			if (aClass98_Sub46_1941 == null) {
				return null;
			}
			if (bool != false) {
				return null;
			}
			for (final Class98_Sub46 class98_sub46 = aClass98_Sub46Array1939[(int) (-1
					+ anInt1938 & aLong1942)]; class98_sub46 != aClass98_Sub46_1941; aClass98_Sub46_1941 = (aClass98_Sub46_1941.aClass98_Sub46_4262)) {
				if (aLong1942 == aClass98_Sub46_1941.aLong4259) {
					final Class98_Sub46 class98_sub46_16_ = aClass98_Sub46_1941;
					aClass98_Sub46_1941 = (aClass98_Sub46_1941.aClass98_Sub46_4262);
					return class98_sub46_16_;
				}
			}
			aClass98_Sub46_1941 = null;
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pu.B(" + bool
					+ ')');
		}
	}
}
