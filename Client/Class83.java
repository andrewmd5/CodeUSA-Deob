/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class83 {
	Class207 aClass207_631;
	static Class126 aClass126_632 = new Class126();
	private Class207 aClass207_633;
	private Class79 aClass79_634 = new Class79(64);

	static final int method824(final byte i) {
		try {
			if (i > -59) {
				return -112;
			}
			if (Class255.aClass293_3208 == null) {
				if (Player.aBoolean6540
						|| Class266.aClass98_Sub46_Sub8_1994 == null) {
					final int i_0_ = Class2.aClass299_73.method3514(116);
					final int i_1_ = Class2.aClass299_73.method3507((byte) 58);
					if (!Class248.aBoolean1896) {
						if (Class38.anInt355 < i_0_
								&& ((i_0_ ^ 0xffffffff) > ((Class246_Sub3_Sub4_Sub4.anInt6488 + Class38.anInt355) ^ 0xffffffff))) {
							int i_2_ = -1;
							for (int i_3_ = 0; i_3_ < Class359.anInt3058; i_3_++) {
								if (!Class98_Sub5_Sub3.aBoolean5539) {
									final int i_4_ = ((Class359.anInt3058 + (-1 + -i_3_)) * 16 + 31 + Class104.anInt897);
									if (((i_4_ - 13 ^ 0xffffffff) > (i_1_ ^ 0xffffffff))
											&& ((i_4_ + 3 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff))) {
										i_2_ = i_3_;
									}
								} else {
									final int i_5_ = 33 + (Class104.anInt897 + (-i_3_
											+ Class359.anInt3058 - 1) * 16);
									if ((i_1_ ^ 0xffffffff) < (i_5_ - 13 ^ 0xffffffff)
											&& ((i_1_ ^ 0xffffffff) >= (i_5_ + 3 ^ 0xffffffff))) {
										i_2_ = i_3_;
									}
								}
							}
							if (i_2_ != -1) {
								int i_6_ = 0;
								final Class157 class157 = new Class157(
										Class33.aClass148_315);
								for (Class98_Sub46_Sub8 class98_sub46_sub8 = ((Class98_Sub46_Sub8) class157
										.method2504((byte) -121)); class98_sub46_sub8 != null; class98_sub46_sub8 = ((Class98_Sub46_Sub8) class157
										.method2503(1000))) {
									if (i_6_++ == i_2_) {
										return (class98_sub46_sub8.anInt5986);
									}
								}
							}
						}
					} else if (Class38.anInt355 >= i_0_
							|| Class38.anInt355
									+ (Class246_Sub3_Sub4_Sub4.anInt6488) <= i_0_) {
						if (Class308.aClass98_Sub46_Sub9_2583 != null
								&& (i_0_ ^ 0xffffffff) < (Class282.anInt2128 ^ 0xffffffff)
								&& (Class5.anInt3439 + Class282.anInt2128 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)) {
							int i_7_ = -1;
							for (int i_8_ = 0; ((i_8_ ^ 0xffffffff) > ((Class308.aClass98_Sub46_Sub9_2583.anInt6001) ^ 0xffffffff)); i_8_++) {
								if (!Class98_Sub5_Sub3.aBoolean5539) {
									final int i_9_ = 31 + (Class163.anInt3518 + i_8_ * 16);
									if (-13 + i_9_ < i_1_ && i_9_ - -3 >= i_1_) {
										i_7_ = i_8_;
									}
								} else {
									final int i_10_ = (Class163.anInt3518 - -33 - -(i_8_ * 16));
									if (-13 + i_10_ < i_1_ && i_10_ + 3 >= i_1_) {
										i_7_ = i_8_;
									}
								}
							}
							if (i_7_ != -1) {
								int i_11_ = 0;
								final Class252 class252 = (new Class252(
										Class308.aClass98_Sub46_Sub9_2583.aClass215_5999));
								for (Class98_Sub46_Sub8 class98_sub46_sub8 = ((Class98_Sub46_Sub8) class252
										.method3173(true)); class98_sub46_sub8 != null; class98_sub46_sub8 = ((Class98_Sub46_Sub8) class252
										.method3174(0))) {
									if ((i_7_ ^ 0xffffffff) == (i_11_++ ^ 0xffffffff)) {
										return (class98_sub46_sub8.anInt5986);
									}
								}
							}
						}
					} else {
						int i_12_ = -1;
						for (int i_13_ = 0; Class64_Sub12.anInt3672 > i_13_; i_13_++) {
							if (!Class98_Sub5_Sub3.aBoolean5539) {
								final int i_14_ = Class104.anInt897
										+ (31 - -(16 * i_13_));
								if ((i_14_ - 13 ^ 0xffffffff) > (i_1_ ^ 0xffffffff)
										&& 3 + i_14_ >= i_1_) {
									i_12_ = i_13_;
								}
							} else {
								final int i_15_ = 33 + (Class104.anInt897 - -(i_13_ * 16));
								if (i_15_ - 13 < i_1_
										&& ((i_15_ + 3 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff))) {
									i_12_ = i_13_;
								}
							}
						}
						if ((i_12_ ^ 0xffffffff) != 0) {
							int i_16_ = 0;
							final Class252 class252 = new Class252(
									Class98_Sub18.aClass215_3949);
							for (Class98_Sub46_Sub9 class98_sub46_sub9 = ((Class98_Sub46_Sub9) class252
									.method3173(true)); class98_sub46_sub9 != null; class98_sub46_sub9 = ((Class98_Sub46_Sub9) class252
									.method3174(0))) {
								if (i_16_++ == i_12_) {
									return (((Class98_Sub46_Sub8) (((class98_sub46_sub9.aClass215_5999).aClass98_Sub46_1615).aClass98_Sub46_4262)).anInt5986);
								}
							}
						}
					}
				} else {
					return (Class266.aClass98_Sub46_Sub8_1994.anInt5986);
				}
			}
			return -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fga.A(" + i + ')');
		}
	}

	static final void method825(final int i) {
		Class64_Sub21.anInt3702 = i;
	}

	final Class152 method826(final int i, final int i_17_) {
		try {
			Class152 class152;
			synchronized (aClass79_634) {
				class152 = (Class152) aClass79_634.method802(i_17_ + -123, i);
			}
			if (class152 != null) {
				return class152;
			}
			byte[] is;
			synchronized (aClass207_633) {
				is = aClass207_633.method2745(i, i_17_, false);
			}
			class152 = new Class152();
			class152.aClass83_1220 = this;
			if (is != null) {
				class152.method2480(false, new ByteBuffer(is));
			}
			synchronized (aClass79_634) {
				aClass79_634.method805(i, class152, (byte) -80);
			}
			return class152;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fga.C(" + i + ','
					+ i_17_ + ')');
		}
	}

	final void method827(final byte i, final int i_18_) {
		try {
			synchronized (aClass79_634) {
				aClass79_634.method800((byte) 62, i_18_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fga.G(" + i + ','
					+ i_18_ + ')');
		}
	}

	final void method828(final int i) {
		try {
			synchronized (aClass79_634) {
				aClass79_634.method806((byte) -107);
			}
			if (i >= -92) {
				method827((byte) -66, 21);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fga.D(" + i + ')');
		}
	}

	final void method829(final int i) {
		try {
			synchronized (aClass79_634) {
				aClass79_634.method794(5);
				if (i <= 107) {
					aClass79_634 = null;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fga.B(" + i + ')');
		}
	}

	public static void method830(final byte i) {
		try {
			if (i <= 57) {
				aClass126_632 = null;
			}
			aClass126_632 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fga.F(" + i + ')');
		}
	}

	static final Class98_Sub31_Sub2 method831(final int i) {
		try {
			if (i >= -36) {
				return null;
			}
			return Class366.aClass98_Sub31_Sub2_3122;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fga.H(" + i + ')');
		}
	}

	Class83(final Class279 class279, final int i, final Class207 class207,
			final Class207 class207_20_) {
		try {
			aClass207_633 = class207;
			aClass207_631 = class207_20_;
			aClass207_633.method2761(0, 3);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fga.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class207_20_ != null ? "{...}" : "null") + ')'));
		}
	}
}
