/* Class373 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class373 implements Interface18 {
	private int anInt3472;
	Class207 aClass207_3473;
	private Class43 aClass43_3474;
	private long aLong3475;
	private Class207 aClass207_3476;
	static int anInt3477 = Class48_Sub2_Sub1.method474(1600, (byte) 31);
	Class93 aClass93_3478;
	static int[] anIntArray3479 = { 16, 32, 64, 128 };

	@Override
	public boolean method59(final int i) {
		try {
			if (i != 14017) {
				return false;
			}
			boolean bool = true;
			if (!aClass207_3473.method2742(i + -14068, aClass93_3478.anInt3506)) {
				bool = false;
			}
			if (!aClass207_3476.method2742(-112, ((aClass93_3478).anInt3506))) {
				bool = false;
			}
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wl.A(" + i + ')');
		}
	}

	abstract void method3960(int i, int i_0_, byte i_1_, boolean bool);

	public static void method3961(final int i) {
		do {
			try {
				anIntArray3479 = null;
				if (i == -3771) {
					break;
				}
				anIntArray3479 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "wl.K(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method3962(final byte i) {
		try {
			if (i != 0) {
				anIntArray3479 = null;
			}
			Class123.aClass79_1010.method794(125);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wl.M(" + i + ')');
		}
	}

	@Override
	public final void method60(final boolean bool, final byte i) {
		try {
			final int i_2_ = ((aClass93_3478.aClass63_3509.method545(
					Class98_Sub17_Sub1.anInt5782, aClass93_3478.anInt3514,
					(byte) 124)) - -aClass93_3478.anInt3505);
			final int i_3_ = ((aClass93_3478.aClass110_3511.method2088(
					aClass93_3478.anInt3504, Class246_Sub2.anInt5072,
					(byte) -56)) - -aClass93_3478.anInt3507);
			method3960(i_3_, i_2_, (byte) -36, bool);
			if (i >= -81) {
				method3960(8, 30, (byte) -95, true);
			}
			method3965(2, i_3_, i_2_, bool);
			String string = Class140.aClass47_3241.method443((byte) -46);
			if (Class343.method3819(-47) - aLong3475 > 10000L) {
				string += " ("
						+ Class140.aClass47_3241.method442((byte) 54)
								.method736((byte) -10) + ")";
			}
			aClass43_3474
					.method415(
							aClass93_3478.anInt3513,
							string,
							(i_2_ + aClass93_3478.anInt3514 / 2),
							-1,
							(byte) -98,
							4 + (i_3_ - -(aClass93_3478.anInt3504 / 2) + (aClass93_3478.anInt3508)));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wl.B(" + bool
					+ ',' + i + ')');
		}
	}

	final int method3963(final int i) {
		try {
			final int i_4_ = Class140.aClass47_3241.method440(-125);
			int i_5_ = i_4_ * i;
			if ((i_4_ ^ 0xffffffff) != (anInt3472 ^ 0xffffffff)
					|| (i_4_ ^ 0xffffffff) == -1) {
				anInt3472 = i_4_;
				aLong3475 = Class343.method3819(i ^ ~0x4a);
			} else {
				final int i_6_ = Class140.aClass47_3241.method447(6119);
				if ((i_6_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff)) {
					final long l = (aLong3475 + -Class140.aClass47_3241
							.method445((byte) -5));
					if (l > 0L) {
						final long l_7_ = ((i_6_ - i_4_) * (10000L * l / i_4_));
						final long l_8_ = 10000L * (-aLong3475 + Class343
								.method3819(i + -147));
						if ((l_8_ ^ 0xffffffffffffffffL) > (l_7_ ^ 0xffffffffffffffffL)) {
							i_5_ = (int) ((100L * (i_6_ + -i_4_) * l_8_ / l_7_) - -(long) (100 * i_4_));
						} else {
							i_5_ = i_6_ * 100;
						}
					}
				}
			}
			return i_5_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wl.L(" + i + ')');
		}
	}

	@Override
	public void method58(final byte i) {
		try {
			if (i != -43) {
				method3960(-19, 49, (byte) 123, false);
			}
			final Class197 class197 = Class119_Sub1.method2182(aClass207_3476,
					true, (aClass93_3478.anInt3506));
			aClass43_3474 = (Class265.aHa1974.method1804(class197, Class324
					.method3684(aClass207_3473, (aClass93_3478.anInt3506)),
					true));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wl.C(" + i + ')');
		}
	}

	static final void method3964(final Class98_Sub22_Sub1 class98_sub22_sub1,
			final int i) {
		try {
			class98_sub22_sub1.method1256(0);
			final int i_9_ = za_Sub2.anInt6080;
			final Player class246_sub3_sub4_sub2_sub2 = (Surface.player = Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_9_] = new Player());
			((Entity) class246_sub3_sub4_sub2_sub2).anInt6369 = i_9_;
			final int i_10_ = class98_sub22_sub1.readBits((byte) -108, 30);
			final byte i_11_ = (byte) (i_10_ >> -638775876);
			final int i_12_ = (0xffff6b1 & i_10_) >> -190559890;
			((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6437[0] = i_12_
					- Class272.anInt2038;
			final int i_13_ = 0x3fff & i_10_;
			((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5084 = (((((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6437[0]) << 152480009) - -(class246_sub3_sub4_sub2_sub2
					.method3034(i ^ i) << 15811816));
			((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6438[0] = -aa_Sub2.anInt3562
					+ i_13_;
			((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5079 = (((((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6438[0]) << 652406601) + (class246_sub3_sub4_sub2_sub2
					.method3034(0) << 2125038824));
			Class43.anInt377 = ((Class246_Sub3) class246_sub3_sub4_sub2_sub2).aByte5088 = ((Class246_Sub3) class246_sub3_sub4_sub2_sub2).aByte5081 = i_11_;
			if (Class1
					.method162(
							(((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6438[0]),
							(byte) -117,
							(((Entity) class246_sub3_sub4_sub2_sub2).anIntArray6437[0]))) {
				((Class246_Sub3) class246_sub3_sub4_sub2_sub2).aByte5081++;
			}
			if (Class224_Sub3_Sub1.aClass98_Sub22Array6146[i_9_] != null) {
				class246_sub3_sub4_sub2_sub2.method3062(
						Class224_Sub3_Sub1.aClass98_Sub22Array6146[i_9_],
						(byte) 73);
			}
			Class2.anInt71 = 0;
			Class319.anIntArray2705[Class2.anInt71++] = i_9_;
			Class98_Sub27.aByteArray4075[i_9_] = (byte) 0;
			Class373_Sub2.anInt5473 = 0;
			for (int i_14_ = 1; (i_14_ ^ 0xffffffff) > -2049; i_14_++) {
				if ((i_14_ ^ 0xffffffff) != (i_9_ ^ 0xffffffff)) {
					final int i_15_ = class98_sub22_sub1.readBits((byte) -20,
							18);
					final int i_16_ = i_15_ >> 1414608112;
					final int i_17_ = (i_15_ & 0xffe4) >> 251705128;
					final int i_18_ = i_15_ & 0xff;
					final Class376 class376 = Class306.aClass376Array2562[i_14_] = new Class376();
					class376.anInt3176 = (i_16_ << -148957092)
							- (-(i_17_ << -430930482) - i_18_);
					class376.aBoolean3175 = false;
					class376.anInt3177 = -1;
					class376.anInt3172 = 0;
					Class76_Sub9.anIntArray3791[Class373_Sub2.anInt5473++] = i_14_;
					Class98_Sub27.aByteArray4075[i_14_] = (byte) 0;
				}
			}
			class98_sub22_sub1.method1254((byte) 120);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("wl.J(" + (class98_sub22_sub1 != null ? "{...}" : "null")
							+ ',' + i + ')'));
		}
	}

	abstract void method3965(int i, int i_19_, int i_20_, boolean bool);

	Class373(final Class207 class207, final Class207 class207_21_,
			final Class93 class93) {
		try {
			aClass207_3473 = class207;
			aClass207_3476 = class207_21_;
			aClass93_3478 = class93;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("wl.<init>("
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class207_21_ != null ? "{...}" : "null") + ','
					+ (class93 != null ? "{...}" : "null") + ')'));
		}
	}
}
