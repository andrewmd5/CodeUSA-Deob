/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class341 {
	Class207 aClass207_2852;
	static OutgoingOpcode aClass171_2853 = new OutgoingOpcode(17, -1);
	private Class79 aClass79_2854 = new Class79(128);
	private Class207 aClass207_2855;
	static int anInt2856 = 100;
	Class79 aClass79_2857 = new Class79(64);
	static int anInt2858 = -1;

	final void method3806(final int i, final boolean bool) {
		try {
			if (bool != false) {
				anInt2856 = 20;
			}
			synchronized (aClass79_2854) {
				aClass79_2854.method800((byte) 62, i);
			}
			synchronized (aClass79_2857) {
				aClass79_2857.method800((byte) 62, i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "up.C(" + i + ','
					+ bool + ')');
		}
	}

	final Class24 method3807(final int i, final int i_0_) { // Map Loading
		try {

			Class24 class24;
			synchronized (aClass79_2854) {
				class24 = (Class24) aClass79_2854.method802(-126, i_0_);
			}
			if (class24 != null) {
				return class24;
			}
			byte[] is;
			synchronized (aClass207_2855) {
				is = aClass207_2855.method2745(i_0_, 36, false);
			}
			class24 = new Class24();
			class24.anInt228 = i_0_;
			class24.aClass341_233 = this;
			// System.out.println(class24.anInt228);
			if (is != null) {
				class24.method290(new ByteBuffer(is), 5);
			}
			class24.method291(-25798);
			synchronized (aClass79_2854) {
				aClass79_2854.method805(i_0_, class24, (byte) -80);
			}
			return class24;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "up.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method3808(final int i) {
		try {
			synchronized (aClass79_2854) {
				aClass79_2854.method794(84);
				if (i != 0) {
					anInt2856 = 80;
				}
			}
			synchronized (aClass79_2857) {
				aClass79_2857.method794(i ^ 0x3d);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "up.F(" + i + ')');
		}
	}

	final void method3809(final int i, final int i_2_, final int i_3_) {
		try {
			if (i_2_ != -30502) {
				aClass171_2853 = null;
			}
			aClass79_2854 = new Class79(i_3_);
			aClass79_2857 = new Class79(i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("up.A(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method3810(final byte i) {
		try {
			while ((Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514.method1258(
					Class65.anInt496, 75) ^ 0xffffffff) <= -16) {
				final int i_4_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readBits((byte) -111, 15);
				if (i_4_ == 32767) {
					break;
				}
				boolean bool = false;
				Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
						.method3990(i_4_, -1));
				if (class98_sub39 == null) {
					final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = new Class246_Sub3_Sub4_Sub2_Sub1();
					((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6369 = i_4_;
					class98_sub39 = new Class98_Sub39(
							class246_sub3_sub4_sub2_sub1);
					Class260.aClass377_3254.method3996(class98_sub39, i_4_, -1);
					bool = true;
					Class163.aClass98_Sub39Array3516[Class98_Sub10_Sub20.anInt5640++] = class98_sub39;
				}
				final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
				Class325.anIntArray2726[Class150.anInt1211++] = i_4_;
				((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6406 = Class201.anInt1544;
				if (class246_sub3_sub4_sub2_sub1.aClass141_6504 != null
						&& class246_sub3_sub4_sub2_sub1.aClass141_6504
								.method2302((byte) 65)) {
					Class98_Sub43_Sub4.method1504(class246_sub3_sub4_sub2_sub1,
							-16255);
				}
				class246_sub3_sub4_sub2_sub1.method3054((Class4.aClass301_85
						.method3538(5,
								Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
										.readBits((byte) -64, 14))), 1);
				final int i_5_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readBits((byte) -67, 1);
				int i_6_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514.readBits(
						(byte) -24, 5);
				if ((i_6_ ^ 0xffffffff) < -16) {
					i_6_ -= 32;
				}
				int i_7_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514.readBits(
						(byte) -34, 5);
				if ((i_7_ ^ 0xffffffff) < -16) {
					i_7_ -= 32;
				}
				final int i_8_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readBits((byte) -25, 2);
				final int i_9_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readBits((byte) -68, 1);
				if (i_9_ == 1) {
					Class76_Sub11.anIntArray3796[Class65.anInt502++] = i_4_;
				}
				final int i_10_ = (4 + Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readBits((byte) -70, 3) << 280873515 & 0x3ee3);
				class246_sub3_sub4_sub2_sub1
						.method3045(
								(byte) 87,
								(class246_sub3_sub4_sub2_sub1.aClass141_6504).anInt1112);
				((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6414 = (class246_sub3_sub4_sub2_sub1.aClass141_6504).anInt1091 << -90290813;
				if (bool) {
					class246_sub3_sub4_sub2_sub1.method3047(i_10_, true, 31);
				}
				class246_sub3_sub4_sub2_sub1
						.method3049(
								class246_sub3_sub4_sub2_sub1.method3034(0),
								i_6_
										+ (((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6437[0]),
								(i_5_ ^ 0xffffffff) == -2,
								(byte) -106,
								i_7_
										+ (((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6438[0]),
								i_8_);
				if (class246_sub3_sub4_sub2_sub1.aClass141_6504
						.method2302((byte) 24)) {
					Class98_Sub31_Sub4
							.method1383(
									null,
									null,
									((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6437[0],
									0,
									3,
									((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6438[0],
									(((Class246_Sub3) class246_sub3_sub4_sub2_sub1).aByte5088),
									class246_sub3_sub4_sub2_sub1);
				}
			}
			if (i >= 112) {
				Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1254((byte) 120);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "up.G(" + i + ')');
		}
	}

	public static void method3811(final int i) {
		try {
			if (i == -8433) {
				aClass171_2853 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "up.H(" + i + ')');
		}
	}

	static final void method3812(int i, Class293 class293) {
		do {
			try {
				if (Class77_Sub1.anInt3803 == ((Class293) class293).anInt2250)
					aa_Sub3.aBooleanArray3574[((Class293) class293).anInt2238] = true;
				if (i == 1)
					break;
				method3811(91);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("up.D(" + i
						+ ',' + (class293 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method3812(final Class293 class293) {
		if (Class77_Sub1.anInt3803 == ((Class293) class293).anInt2250)
			aa_Sub3.aBooleanArray3574[((Class293) class293).anInt2238] = true;
		method3811(91);
	}

	Class341(final Class279 class279, final int i, final Class207 class207,
			final Class207 class207_11_) {
		try {
			aClass207_2852 = class207_11_;
			aClass207_2855 = class207;
			aClass207_2855.method2761(0, 36);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("up.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class207_11_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3813(final int i) {
		try {
			synchronized (aClass79_2854) {
				if (i != 36) {
					return;
				}
				aClass79_2854.method806((byte) -118);
			}
			synchronized (aClass79_2857) {
				aClass79_2857.method806((byte) 61);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "up.E(" + i + ')');
		}
	}
}
