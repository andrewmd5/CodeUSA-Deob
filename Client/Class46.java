/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class46 {
	private Class156_Sub1 aClass156_Sub1_386;
	private Interface8 anInterface8_387;
	static float aFloat388;
	private Class33 aClass33_389;
	private int anInt390;
	private Class42_Sub1 aClass42_Sub1_391;
	boolean aBoolean392 = true;
	private int anInt393;
	private ha_Sub1 aHa_Sub1_394;
	private int anInt395;
	private int anInt396 = -1;

	private final void method433(final byte i, final int i_0_,
			final Interface8 interface8) {
		try {
			if (i <= 35) {
				method438(-46, -60, 86, null);
			}
			if (i_0_ != 0) {
				method434(0);
				aHa_Sub1_394.method1863(1, aClass42_Sub1_391);
				aHa_Sub1_394.method1865(i_0_, 4, interface8, false, 0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("df.E(" + i + ',' + i_0_ + ','
							+ (interface8 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method434(final int i) {
		try {
			if (aBoolean392) {
				aBoolean392 = false;
				final byte[] is = aClass33_389.aByteArray321;
				final byte[] is_1_ = aHa_Sub1_394.aByteArray4469;
				int i_2_ = 0;
				final int i_3_ = aClass33_389.anInt314;
				int i_4_ = (anInt390 - -(aClass33_389.anInt314 * anInt395));
				for (int i_5_ = -128; (i_5_ ^ 0xffffffff) > -1; i_5_++) {
					i_2_ = -i_2_ + (i_2_ << -525962840);
					for (int i_6_ = -128; i_6_ < 0; i_6_++) {
						if ((is[i_4_++] ^ 0xffffffff) != -1) {
							i_2_++;
						}
					}
					i_4_ += -128 + i_3_;
				}
				if (aClass42_Sub1_391 != null && i_2_ == anInt396) {
					aBoolean392 = false;
				} else {
					anInt396 = i_2_;
					i_4_ = anInt395 * i_3_ + anInt390;
					int i_7_ = i;
					for (int i_8_ = -128; i_8_ < 0; i_8_++) {
						for (int i_9_ = -128; i_9_ < 0; i_9_++) {
							if (is[i_4_] == 0) {
								int i_10_ = 0;
								if (is[-1 + i_4_] != 0) {
									i_10_++;
								}
								if ((is[i_4_ + 1] ^ 0xffffffff) != -1) {
									i_10_++;
								}
								if ((is[i_4_ + -i_3_] ^ 0xffffffff) != -1) {
									i_10_++;
								}
								if ((is[i_4_ + i_3_] ^ 0xffffffff) != -1) {
									i_10_++;
								}
								is_1_[i_7_++] = (byte) (17 * i_10_);
							} else {
								is_1_[i_7_++] = (byte) 68;
							}
							i_4_++;
						}
						i_4_ += aClass33_389.anInt314 + -128;
					}
					if (aClass42_Sub1_391 == null) {
						aClass42_Sub1_391 = new Class42_Sub1(aHa_Sub1_394,
								3553, 6406, 128, 128, false,
								(aHa_Sub1_394.aByteArray4469), 6406, false);
						aClass42_Sub1_391.method383(false, i + 10242, false);
						aClass42_Sub1_391.method372(i ^ ~0x6d62, true);
					} else {
						aClass42_Sub1_391.method378(128, 6406, false, 0,
								(aHa_Sub1_394.aByteArray4469), 0, (byte) -80,
								0, 0, 128);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "df.D(" + i + ')');
		}
	}

	static final void method435(final byte i) {
		try {
			for (Class98_Sub46_Sub9 class98_sub46_sub9 = ((Class98_Sub46_Sub9) Class98_Sub18.aClass215_3949
					.method2792(-1)); class98_sub46_sub9 != null; class98_sub46_sub9 = ((Class98_Sub46_Sub9) Class98_Sub18.aClass215_3949
					.method2787(0))) {
				if ((class98_sub46_sub9.anInt6001 ^ 0xffffffff) < -2) {
					class98_sub46_sub9.anInt6001 = 0;
					Class98_Sub46_Sub16.aClass79_6046
							.method805(
									((Class98_Sub46_Sub8) (((class98_sub46_sub9.aClass215_5999).aClass98_Sub46_1615).aClass98_Sub46_4262)).aLong5991,
									class98_sub46_sub9, (byte) -80);
					class98_sub46_sub9.aClass215_5999.method2786(16711680);
				}
			}
			Class64_Sub12.anInt3672 = 0;
			if (i >= 70) {
				Class359.anInt3058 = 0;
				Class33.aClass148_315.method2422((byte) 47);
				Class98_Sub47.aClass377_4274.method3994(-96);
				Class98_Sub18.aClass215_3949.method2786(16711680);
				Class157.method2506(127, Class331.aClass98_Sub46_Sub8_2803);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "df.B(" + i + ')');
		}
	}

	static final void method436(final Object[] objects, final boolean bool,
			final long[] ls) {
		try {
			Class98_Sub46_Sub10.method1566(ls, 0, (byte) -116, ls.length - 1,
					objects);
			if (bool != false) {
				aFloat388 = 1.1995486F;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("df.F("
					+ (objects != null ? "{...}" : "null") + ',' + bool + ','
					+ (ls != null ? "{...}" : "null") + ')'));
		}
	}

	final void method437(final int i) {
		try {
			if (i != 6401) {
				aFloat388 = 0.89933157F;
			}
			method433((byte) 87, anInt393, anInterface8_387);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "df.C(" + i + ')');
		}
	}

	final void method438(final int i, final int i_11_, final int i_12_,
			final byte[] is) {
		try {
			if (i_11_ != 0) {
				anInt396 = -35;
			}
			aClass156_Sub1_386.method20((byte) -47, is,
					i * aHa_Sub1_394.method1839(i_12_, -5122), i_12_);
			method433((byte) 63, i, aClass156_Sub1_386);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("df.G(" + i + ','
					+ i_11_ + ',' + i_12_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method439(final int i) {
		Class32.anInt305 = i;
		for (int i_13_ = 0; i_13_ < Class366.anInt3112; i_13_++) {
			for (int i_14_ = 0; i_14_ < Class64_Sub9.anInt3662; i_14_++) {
				if ((Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_13_][i_14_]) == null) {
					Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_13_][i_14_] = new Class172(
							i);
				}
			}
		}
	}

	Class46(final ha_Sub1 var_ha_Sub1, final Class33 class33,
			final s_Sub1 var_s_Sub1, final int i, final int i_15_,
			final int i_16_, final int i_17_, final int i_18_) {
		try {
			anInt390 = i_17_;
			anInt395 = i_18_;
			aHa_Sub1_394 = var_ha_Sub1;
			aClass33_389 = class33;
			final int i_19_ = 1 << i_16_;
			int i_20_ = 0;
			final int i_21_ = i << i_16_;
			final int i_22_ = i_15_ << i_16_;
			for (int i_23_ = 0; (i_19_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff); i_23_++) {
				int i_24_ = ((s) var_s_Sub1).anInt2203 * (i_23_ + i_22_)
						+ i_21_;
				for (int i_25_ = 0; i_19_ > i_25_; i_25_++) {
					final short[] is = var_s_Sub1.aShortArrayArray5196[i_24_++];
					if (is != null) {
						i_20_ += is.length;
					}
				}
			}
			anInt393 = i_20_;
			if ((i_20_ ^ 0xffffffff) < -1) {
				final ByteBuffer class98_sub22 = new ByteBuffer(2 * i_20_);
				if (!aHa_Sub1_394.aBoolean4397) {
					for (int i_26_ = 0; i_19_ > i_26_; i_26_++) {
						int i_27_ = (i_21_ + ((s) var_s_Sub1).anInt2203
								* (i_26_ + i_22_));
						for (int i_28_ = 0; i_28_ < i_19_; i_28_++) {
							final short[] is = (var_s_Sub1.aShortArrayArray5196[i_27_++]);
							if (is != null) {
								for (int i_29_ = 0; ((is.length ^ 0xffffffff) < (i_29_ ^ 0xffffffff)); i_29_++) {
									class98_sub22.method1247(
											is[i_29_] & 0xffff, 4);
								}
							}
						}
					}
				} else {
					for (int i_30_ = 0; i_19_ > i_30_; i_30_++) {
						int i_31_ = (i_21_ + ((s) var_s_Sub1).anInt2203
								* (i_30_ + i_22_));
						for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff); i_32_++) {
							final short[] is = (var_s_Sub1.aShortArrayArray5196[i_31_++]);
							if (is != null) {
								for (int i_33_ = 0; i_33_ < is.length; i_33_++) {
									class98_sub22.writeShort(
											(is[i_33_] & 0xffff), 1571862888);
								}
							}
						}
					}
				}
				anInterface8_387 = aHa_Sub1_394.method1838(5123,
						(class98_sub22.aByteArray3992), 7, false,
						(class98_sub22.position));
				aClass156_Sub1_386 = new Class156_Sub1(aHa_Sub1_394, 5123,
						null, 1);
			} else {
				aClass42_Sub1_391 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("df.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ','
					+ (class33 != null ? "{...}" : "null") + ','
					+ (var_s_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ')'));
		}
	}
}
