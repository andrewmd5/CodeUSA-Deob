/* Class266 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class266 {
	int anInt1984 = 8;
	boolean aBoolean1985;
	static Class111 aClass111_1986;
	int anInt1987;
	static Class84 aClass84_1988 = new Class84(true);
	int anInt1989;
	int anInt1990;
	int anInt1991 = 16777215;
	static IncomingOpcode aClass58_1992 = new IncomingOpcode(82, 0);
	int anInt1993;
	static Class98_Sub46_Sub8 aClass98_Sub46_Sub8_1994;
	int anInt1995;

	public static void method3233(final int i) {
		do {
			try {
				aClass58_1992 = null;
				aClass84_1988 = null;
				aClass98_Sub46_Sub8_1994 = null;
				aClass111_1986 = null;
				if (i >= 68) {
					break;
				}
				method3234(null, -99, null, null, null);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ql.G(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method3234(
			final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2,
			final int i, final int[] is, final int[] is_0_, final int[] is_1_) {
		try {
			if (i != -3433) {
				method3233(100);
			}
			for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (is_1_.length ^ 0xffffffff); i_2_++) {
				final int i_3_ = is_1_[i_2_];
				int i_4_ = is[i_2_];
				final int i_5_ = is_0_[i_2_];
				for (int i_6_ = 0; i_4_ != 0
						&& (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).aClass226Array6387).length > i_6_; i_6_++) {
					if ((i_4_ & 0x1) != 0) {
						if ((i_3_ ^ 0xffffffff) == 0) {
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).aClass226Array6387[i_6_] = null;
						} else {
							final AnimationDefinition class97 = Class151_Sub7.aClass183_5001
									.method2623(i_3_, 16383);
							final int i_7_ = class97.anInt819;
							Class226 class226 = (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).aClass226Array6387[i_6_]);
							if (class226 != null) {
								if (i_3_ != class226.anInt1700) {
									if (class97.anInt829 >= (Class151_Sub7.aClass183_5001
											.method2623(class226.anInt1700,
													16383)).anInt829) {
										class226 = ((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).aClass226Array6387[i_6_] = null;
									}
								} else if (i_7_ == 0) {
									class226 = ((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).aClass226Array6387[i_6_] = null;
								} else if (i_7_ != 1) {
									if (i_7_ == 2) {
										class226.anInt1704 = 0;
									}
								} else {
									class226.anInt1707 = 0;
									class226.anInt1704 = 0;
									class226.anInt1703 = i_5_;
									class226.anInt1702 = 0;
									class226.anInt1701 = 1;
									if (!((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).aBoolean6371) {
										Class349.method3840((byte) -128,
												class246_sub3_sub4_sub2_sub2,
												0, class97);
									}
								}
							}
							if (class226 == null) {
								class226 = ((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).aClass226Array6387[i_6_] = new Class226();
								class226.anInt1703 = i_5_;
								class226.anInt1707 = 0;
								class226.anInt1700 = i_3_;
								class226.anInt1702 = 0;
								class226.anInt1704 = 0;
								class226.anInt1701 = 1;
								if (!((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).aBoolean6371) {
									Class349.method3840((byte) -126,
											class246_sub3_sub4_sub2_sub2, 0,
											class97);
								}
							}
						}
					}
					i_4_ >>>= 1;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ql.F("
					+ (class246_sub3_sub4_sub2_sub2 != null ? "{...}" : "null")
					+ ',' + i + ',' + (is != null ? "{...}" : "null") + ','
					+ (is_0_ != null ? "{...}" : "null") + ','
					+ (is_1_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3235(final byte i) {
		try {
			if (i <= -17) {
				if (Class39_Sub1.anInterface10Array3592 != null) {
					final Interface10[] interface10s = Class39_Sub1.anInterface10Array3592;
					for (int i_8_ = 0; interface10s.length > i_8_; i_8_++) {
						final Interface10 interface10 = interface10s[i_8_];
						interface10.method27(-31295);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ql.A(" + i + ')');
		}
	}

	final void method3236(final ByteBuffer class98_sub22, final byte i) {
		try {
			if (i != -16) {
				method3239(-39, -58, -29, 127, null);
			}
			for (;;) {
				final int i_9_ = class98_sub22.readUnsignedByte((byte) 15);
				if (i_9_ == 0) {
					break;
				}
				method3237(false, i_9_, class98_sub22);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("ql.E(" + (class98_sub22 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	private final void method3237(final boolean bool, final int i,
			final ByteBuffer class98_sub22) {
		do {
			try {
				if (i == 1) {
					anInt1984 = class98_sub22.readUnsignedShort((byte) 127);
				} else if (i == 2) {
					aBoolean1985 = true;
				} else if (i == 3) {
					anInt1990 = class98_sub22.readUShort(bool);
					anInt1989 = class98_sub22.readUShort(false);
					anInt1987 = class98_sub22.readUShort(false);
				} else if ((i ^ 0xffffffff) != -5) {
					if (i == 5) {
						anInt1995 = class98_sub22.readUnsignedShort((byte) 127);
					} else if (i == 6) {
						anInt1991 = class98_sub22.readMediumInt(-123);
					}
				} else {
					anInt1993 = class98_sub22.readUnsignedByte((byte) -108);
				}
				if (bool == false) {
					break;
				}
				aClass98_Sub46_Sub8_1994 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ql.C(" + bool
						+ ',' + i + ','
						+ (class98_sub22 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method3238(final int i) {
		try {
			if (Class45.aClass75_381 != null) {
				Class140.aClass47_3241 = new Class47();
				Class140.aClass47_3241.method446(Class235.aLong1753, (byte) 95,
						Class45.aClass75_381.anInt552, Class45.aClass75_381,
						Class45.aClass75_381.aClass309_560.method3615(
								Class374.anInt3159, (byte) 25));
				Class76_Sub9.aThread3783 = new Thread(Class140.aClass47_3241,
						"");
				if (i == 0) {
					Class76_Sub9.aThread3783.start();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ql.B(" + i + ')');
		}
	}

	static final void method3239(final int i, final int i_10_, final int i_11_,
			final int i_12_, final Class246_Sub3_Sub2 class246_sub3_sub2) {
		final Class172 class172 = Class100.method1693(i, i_10_, i_11_);
		if (class172 != null) {
			((Class246_Sub3) class246_sub3_sub2).anInt5084 = (i_10_ << Class151_Sub8.anInt5015)
					+ Class207.anInt1577;
			((Class246_Sub3) class246_sub3_sub2).anInt5089 = i_12_;
			((Class246_Sub3) class246_sub3_sub2).anInt5079 = (i_11_ << Class151_Sub8.anInt5015)
					+ Class207.anInt1577;
			class172.aClass246_Sub3_Sub2_1331 = class246_sub3_sub2;
			final int i_13_ = Class78.aSArray594 == Class81.aSArray618 ? 1 : 0;
			if (class246_sub3_sub2.method2978(-2)) {
				if (class246_sub3_sub2.method2987(6540)) {
					((Class246_Sub3) class246_sub3_sub2).aClass246_Sub3_5090 = Class359.aClass246_Sub3Array3056[i_13_];
					Class359.aClass246_Sub3Array3056[i_13_] = class246_sub3_sub2;
				} else {
					((Class246_Sub3) class246_sub3_sub2).aClass246_Sub3_5090 = Class379.aClass246_Sub3Array3198[i_13_];
					Class379.aClass246_Sub3Array3198[i_13_] = class246_sub3_sub2;
					Class358.aBoolean3033 = true;
				}
			} else {
				((Class246_Sub3) class246_sub3_sub2).aClass246_Sub3_5090 = Class130.aClass246_Sub3Array1029[i_13_];
				Class130.aClass246_Sub3Array1029[i_13_] = class246_sub3_sub2;
			}
		}
	}

	public Class266() {
		/* empty */
	}
}
