/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Class135 {
	static int anInt1051 = 0;
	static boolean aBoolean1052 = true;
	static float aFloat1053;
	static Class79 aClass79_1054 = new Class79(128, 4);
	private final Class215 aClass215_1055 = new Class215();
	static int[] anIntArray1056 = new int[13];
	static short aShort1057 = 320;
	private final Class215 aClass215_1058 = new Class215();
	private final Class215 aClass215_1059 = new Class215();
	private final Class215 aClass215_1060 = new Class215();
	private long aLong1061;
	private int anInt1062;
	private Class361 aClass361_1063;
	private final ByteBuffer aClass98_Sub22_1064 = new ByteBuffer(4);
	volatile int anInt1065 = 0;
	volatile int anInt1066 = 0;
	private byte aByte1067 = 0;
	private final ByteBuffer aClass98_Sub22_1068 = new ByteBuffer(8);
	private Class98_Sub46_Sub13_Sub1 aClass98_Sub46_Sub13_Sub1_1069;

	final void method2249(final int i) {
		do {
			try {
				if (aClass361_1063 != null) {
					aClass361_1063.method3923(-29789);
				}
				if (i < -34) {
					break;
				}
				aLong1061 = 81L;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jd.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method2250(final int i) {
		try {
			if (i == 5790) {
				aClass79_1054 = null;
				anIntArray1056 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jd.G(" + i + ')');
		}
	}

	private final int method2251(final byte i) {
		try {
			if (i <= 44) {
				aClass79_1054 = null;
			}
			return (aClass215_1059.method2788(-126) + aClass215_1060
					.method2788(-109));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jd.O(" + i + ')');
		}
	}

	final Class98_Sub46_Sub13_Sub1 method2252(final int i, final byte i_0_,
			final int i_1_, final int i_2_, final boolean bool) {
		try {
			final long l = (i << -1790531408) - -i_1_;
			final Class98_Sub46_Sub13_Sub1 class98_sub46_sub13_sub1 = new Class98_Sub46_Sub13_Sub1();
			class98_sub46_sub13_sub1.aByte6306 = i_0_;
			if (i_2_ < 104) {
				method2256(-109);
			}
			((Class98_Sub46) class98_sub46_sub13_sub1).aLong4259 = l;
			((Class98_Sub46_Sub13) class98_sub46_sub13_sub1).aBoolean6037 = bool;
			do {
				if (!bool) {
					if ((method2251((byte) 94) ^ 0xffffffff) <= -21) {
						throw new RuntimeException();
					}
					aClass215_1059.method2785(class98_sub46_sub13_sub1, -28);
					if (!client.aBoolean3553) {
						break;
					}
				}
				if (method2261(-1) >= 20) {
					throw new RuntimeException();
				}
				aClass215_1055.method2785(class98_sub46_sub13_sub1, -106);
			} while (false);
			return class98_sub46_sub13_sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jd.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + bool + ')'));
		}
	}

	final boolean method2253(final int i) {
		try {
			if (i <= 23) {
				return true;
			}
			if (method2261(-1) < 20) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jd.J(" + i + ')');
		}
	}

	final void method2254(final int i) {
		try {
			if (aClass361_1063 != null) {
				try {
					aClass98_Sub22_1064.position = 0;
					aClass98_Sub22_1064.method1194(7, 77);
					aClass98_Sub22_1064.method1225(-24472, 0);
					if (i == 29043) {
						aClass361_1063.method3920((byte) 77, 0, 4,
								(aClass98_Sub22_1064.aByteArray3992));
					}
				} catch (final IOException ioexception) {
					try {
						aClass361_1063.method3923(i ^ ~0x52f);
					} catch (final Exception exception) {
						/* empty */
					}
					aClass361_1063 = null;
					anInt1066 = -2;
					anInt1065++;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jd.I(" + i + ')');
		}
	}

	final void method2255(final int i, final boolean bool) {
		try {
			if (i != 2) {
				method2257(121);
			}
			if (aClass361_1063 != null) {
				try {
					aClass98_Sub22_1064.position = 0;
					aClass98_Sub22_1064.method1194(!bool ? 3 : 2, 121);
					aClass98_Sub22_1064.method1225(-24472, 0);
					aClass361_1063.method3920((byte) 77, 0, 4,
							(aClass98_Sub22_1064.aByteArray3992));
				} catch (final IOException ioexception) {
					try {
						aClass361_1063.method3923(-29789);
					} catch (final Exception exception) {
						/* empty */
					}
					anInt1066 = -2;
					anInt1065++;
					aClass361_1063 = null;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jd.L(" + i + ','
					+ bool + ')');
		}
	}

	final boolean method2256(final int i) {
		try {
			if (aClass361_1063 != null) {
				final long l = Class343.method3819(-47);
				int i_3_ = (int) (l - aLong1061);
				aLong1061 = l;
				if (i_3_ > 200) {
					i_3_ = 200;
				}
				anInt1062 += i_3_;
				if (anInt1062 > 30000) {
					try {
						aClass361_1063.method3923(-29789);
					} catch (final Exception exception) {
						/* empty */
					}
					aClass361_1063 = null;
				}
			}
			if (aClass361_1063 == null) {
				if (method2261(-1) == 0 && method2251((byte) 49) == 0) {
					return true;
				}
				return false;
			}
			try {
				aClass361_1063.method3916(true);
				for (Class98_Sub46_Sub13_Sub1 class98_sub46_sub13_sub1 = ((Class98_Sub46_Sub13_Sub1) aClass215_1055
						.method2792(-1)); class98_sub46_sub13_sub1 != null; class98_sub46_sub13_sub1 = ((Class98_Sub46_Sub13_Sub1) aClass215_1055
						.method2787(0))) {
					aClass98_Sub22_1064.position = 0;
					aClass98_Sub22_1064.method1194(1, i ^ 0x104c);
					aClass98_Sub22_1064
							.method1225(
									-24472,
									(int) (((Class98_Sub46) class98_sub46_sub13_sub1).aLong4259));
					aClass361_1063.method3920((byte) 77, 0, 4,
							(aClass98_Sub22_1064.aByteArray3992));
					aClass215_1058.method2785(class98_sub46_sub13_sub1, -84);
				}
				if (i != 4096) {
					method2263(67);
				}
				for (Class98_Sub46_Sub13_Sub1 class98_sub46_sub13_sub1 = ((Class98_Sub46_Sub13_Sub1) aClass215_1059
						.method2792(-1)); class98_sub46_sub13_sub1 != null; class98_sub46_sub13_sub1 = ((Class98_Sub46_Sub13_Sub1) aClass215_1059
						.method2787(i ^ 0x1000))) {
					aClass98_Sub22_1064.position = 0;
					aClass98_Sub22_1064.method1194(0, i ^ 0x102a);
					aClass98_Sub22_1064
							.method1225(
									i + -28568,
									(int) (((Class98_Sub46) class98_sub46_sub13_sub1).aLong4259));
					aClass361_1063.method3920((byte) 77, 0, 4,
							(aClass98_Sub22_1064.aByteArray3992));
					aClass215_1060.method2785(class98_sub46_sub13_sub1, -77);
				}
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -101; i_4_++) {
					final int i_5_ = aClass361_1063.method3915(75);
					if (i_5_ < 0) {
						throw new IOException();
					}
					if (i_5_ == 0) {
						break;
					}
					anInt1062 = 0;
					int i_6_ = 0;
					if (aClass98_Sub46_Sub13_Sub1_1069 != null) {
						if (aClass98_Sub46_Sub13_Sub1_1069.anInt6304 == 0) {
							i_6_ = 1;
						}
					} else {
						i_6_ = 8;
					}
					if ((i_6_ ^ 0xffffffff) >= -1) {
						final int i_7_ = ((aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305).aByteArray3992.length + -aClass98_Sub46_Sub13_Sub1_1069.aByte6306);
						int i_8_ = (-aClass98_Sub46_Sub13_Sub1_1069.anInt6304 + 512);
						if (-(aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305).position
								+ i_7_ < i_8_) {
							i_8_ = i_7_
									+ -(aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305).position;
						}
						if (i_8_ > i_5_) {
							i_8_ = i_5_;
						}
						aClass361_1063
								.method3921(
										(aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305).position,
										true,
										i_8_,
										(aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305).aByteArray3992);
						if (aByte1067 != 0) {
							for (int i_9_ = 0; i_8_ > i_9_; i_9_++) {
								(aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305).aByteArray3992[i_9_
										+ (aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305).position] = (byte) (Class369
										.method3953(
												((aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305).aByteArray3992[(i_9_ + ((aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305).position))]),
												aByte1067));
							}
						}
						(aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305).position += i_8_;
						aClass98_Sub46_Sub13_Sub1_1069.anInt6304 += i_8_;
						if ((i_7_ ^ 0xffffffff) != ((aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305).position ^ 0xffffffff)) {
							if (aClass98_Sub46_Sub13_Sub1_1069.anInt6304 == 512) {
								aClass98_Sub46_Sub13_Sub1_1069.anInt6304 = 0;
							}
						} else {
							aClass98_Sub46_Sub13_Sub1_1069
									.method1524((byte) -90);
							((Class98_Sub46_Sub13) aClass98_Sub46_Sub13_Sub1_1069).aBoolean6038 = false;
							aClass98_Sub46_Sub13_Sub1_1069 = null;
						}
					} else {
						int i_10_ = i_6_ + -(aClass98_Sub22_1068.position);
						if ((i_5_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff)) {
							i_10_ = i_5_;
						}
						aClass361_1063.method3921(
								aClass98_Sub22_1068.position, true, i_10_,
								(aClass98_Sub22_1068.aByteArray3992));
						if ((aByte1067 ^ 0xffffffff) != -1) {
							for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff); i_11_++) {
								aClass98_Sub22_1068.aByteArray3992[i_11_
										+ aClass98_Sub22_1068.position] = (byte) (Class369
										.method3953(
												(aClass98_Sub22_1068.aByteArray3992[i_11_
														+ (aClass98_Sub22_1068.position)]),
												aByte1067));
							}
						}
						aClass98_Sub22_1068.position += i_10_;
						if ((i_6_ ^ 0xffffffff) >= (aClass98_Sub22_1068.position ^ 0xffffffff)) {
							if (aClass98_Sub46_Sub13_Sub1_1069 == null) {
								aClass98_Sub22_1068.position = 0;
								final int i_12_ = aClass98_Sub22_1068
										.readUnsignedByte((byte) 29);
								final int i_13_ = aClass98_Sub22_1068
										.readUnsignedShort((byte) 127);
								final int i_14_ = aClass98_Sub22_1068
										.readUnsignedByte((byte) -110);
								final int i_15_ = aClass98_Sub22_1068.readInt(i
										+ -4098);
								final int i_16_ = i_14_ & 0x7f;
								final boolean bool = (0x80 & i_14_) != 0;
								final long l = (i_12_ << 1231200656) - -i_13_;
								Class98_Sub46_Sub13_Sub1 class98_sub46_sub13_sub1;
								if (bool) {
									for (class98_sub46_sub13_sub1 = ((Class98_Sub46_Sub13_Sub1) aClass215_1060
											.method2792(i ^ ~0x1000)); class98_sub46_sub13_sub1 != null; class98_sub46_sub13_sub1 = ((Class98_Sub46_Sub13_Sub1) aClass215_1060
											.method2787(0))) {
										if ((l ^ 0xffffffffffffffffL) == ((((Class98_Sub46) class98_sub46_sub13_sub1).aLong4259) ^ 0xffffffffffffffffL)) {
											break;
										}
									}
								} else {
									for (class98_sub46_sub13_sub1 = ((Class98_Sub46_Sub13_Sub1) aClass215_1058
											.method2792(-1)); class98_sub46_sub13_sub1 != null; class98_sub46_sub13_sub1 = ((Class98_Sub46_Sub13_Sub1) aClass215_1058
											.method2787(0))) {
										if (((((Class98_Sub46) class98_sub46_sub13_sub1).aLong4259) ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
											break;
										}
									}
								}
								if (class98_sub46_sub13_sub1 == null) {
									throw new IOException();
								}
								final int i_17_ = (i_16_ ^ 0xffffffff) != -1 ? 9
										: 5;
								aClass98_Sub46_Sub13_Sub1_1069 = class98_sub46_sub13_sub1;
								aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305 = (new ByteBuffer(
										(aClass98_Sub46_Sub13_Sub1_1069.aByte6306)
												+ (i_15_ - -i_17_)));
								aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305
										.method1194(i_16_, 107);
								aClass98_Sub46_Sub13_Sub1_1069.aClass98_Sub22_6305
										.writeInt(1571862888, i_15_);
								aClass98_Sub22_1068.position = 0;
								aClass98_Sub46_Sub13_Sub1_1069.anInt6304 = 8;
							} else if (((aClass98_Sub46_Sub13_Sub1_1069.anInt6304) ^ 0xffffffff) == -1) {
								if ((aClass98_Sub22_1068.aByteArray3992[0]) != -1) {
									aClass98_Sub46_Sub13_Sub1_1069 = null;
								} else {
									aClass98_Sub46_Sub13_Sub1_1069.anInt6304 = 1;
									aClass98_Sub22_1068.position = 0;
								}
							} else {
								throw new IOException();
							}
						}
					}
				}
				return true;
			} catch (final IOException ioexception) {
				try {
					aClass361_1063.method3923(i ^ ~0x645c);
				} catch (final Exception exception) {
					/* empty */
				}
				anInt1065++;
				anInt1066 = -2;
				aClass361_1063 = null;
				if ((method2261(i ^ ~0x1000) ^ 0xffffffff) == -1
						&& (method2251((byte) 51) ^ 0xffffffff) == -1) {
					return true;
				}
				return false;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jd.A(" + i + ')');
		}
	}

	final void method2257(final int i) {
		try {
			try {
				aClass361_1063.method3923(-29789);
				if (i <= 17) {
					method2262((byte) 108);
				}
			} catch (final Exception exception) {
				/* empty */
			}
			anInt1065++;
			aClass361_1063 = null;
			anInt1066 = -1;
			aByte1067 = (byte) (int) (1.0 + Math.random() * 255.0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jd.N(" + i + ')');
		}
	}

	static final int[][] method2258(final int i, final int i_18_,
			final boolean bool, final int i_19_, final float f,
			final int i_20_, final int i_21_, final byte i_22_, final int i_23_) {
		try {
			final int[][] is = new int[i_18_][i_19_];
			final Class98_Sub10_Sub35 class98_sub10_sub35 = new Class98_Sub10_Sub35();
			class98_sub10_sub35.anInt5734 = i_23_;
			class98_sub10_sub35.anInt5737 = i_21_;
			class98_sub10_sub35.anInt5733 = i;
			class98_sub10_sub35.aBoolean5731 = bool;
			class98_sub10_sub35.anInt5739 = (int) (4096.0F * f);
			class98_sub10_sub35.method1001((byte) 66);
			Class64_Sub2.method559(true, i_19_, i_18_);
			for (int i_24_ = 0; i_18_ > i_24_; i_24_++) {
				class98_sub10_sub35.method1107((byte) -127, is[i_24_], i_24_);
			}
			if (i_22_ != -63) {
				anIntArray1056 = null;
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jd.E(" + i + ','
					+ i_18_ + ',' + bool + ',' + i_19_ + ',' + f + ',' + i_20_
					+ ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ')'));
		}
	}

	final void method2259(final int i) {
		do {
			try {
				if (i != 0) {
					method2264((byte) -57);
				}
				if (aClass361_1063 == null) {
					break;
				}
				aClass361_1063.method3922(-69);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jd.H(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method2260(final Class361 class361, final boolean bool,
			final byte i) {
		try {
			if (i != 74) {
				anInt1051 = 12;
			}
			if (aClass361_1063 != null) {
				try {
					aClass361_1063.method3923(i ^ ~0x7416);
				} catch (final Exception exception) {
					/* empty */
				}
				aClass361_1063 = null;
			}
			aClass361_1063 = class361;
			method2262((byte) 63);
			method2255(2, bool);
			aClass98_Sub22_1068.position = 0;
			aClass98_Sub46_Sub13_Sub1_1069 = null;
			for (;;) {
				final Class98_Sub46_Sub13_Sub1 class98_sub46_sub13_sub1 = ((Class98_Sub46_Sub13_Sub1) aClass215_1058
						.method2789(-16711936));
				if (class98_sub46_sub13_sub1 == null) {
					break;
				}
				aClass215_1055.method2785(class98_sub46_sub13_sub1, -29);
			}
			for (;;) {
				final Class98_Sub46_Sub13_Sub1 class98_sub46_sub13_sub1 = ((Class98_Sub46_Sub13_Sub1) aClass215_1060
						.method2789(-16711936));
				if (class98_sub46_sub13_sub1 == null) {
					break;
				}
				aClass215_1059.method2785(class98_sub46_sub13_sub1, -82);
			}
			if ((aByte1067 ^ 0xffffffff) != -1) {
				try {
					aClass98_Sub22_1064.position = 0;
					aClass98_Sub22_1064.method1194(4, 67);
					aClass98_Sub22_1064.method1194(aByte1067, -41);
					aClass98_Sub22_1064.writeShort(0, 1571862888);
					aClass361_1063.method3920((byte) 77, 0, 4,
							(aClass98_Sub22_1064.aByteArray3992));
				} catch (final IOException ioexception) {
					try {
						aClass361_1063.method3923(-29789);
					} catch (final Exception exception) {
						/* empty */
					}
					aClass361_1063 = null;
					anInt1065++;
					anInt1066 = -2;
				}
			}
			anInt1062 = 0;
			aLong1061 = Class343.method3819(-47);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jd.D("
					+ (class361 != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ')'));
		}
	}

	final int method2261(final int i) {
		try {
			if (i != -1) {
				method2259(15);
			}
			return (aClass215_1055.method2788(-118) + aClass215_1058
					.method2788(-121));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jd.M(" + i + ')');
		}
	}

	private final void method2262(final byte i) {
		try {
			if (i <= 37) {
				method2253(-82);
			}
			if (aClass361_1063 != null) {
				try {
					aClass98_Sub22_1064.position = 0;
					aClass98_Sub22_1064.method1194(6, -111);
					aClass98_Sub22_1064.method1225(-24472, 3);
					aClass361_1063.method3920((byte) 77, 0, 4,
							(aClass98_Sub22_1064.aByteArray3992));
				} catch (final IOException ioexception) {
					try {
						aClass361_1063.method3923(-29789);
					} catch (final Exception exception) {
						/* empty */
					}
					anInt1065++;
					anInt1066 = -2;
					aClass361_1063 = null;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jd.P(" + i + ')');
		}
	}

	final boolean method2263(final int i) {
		try {
			if (i != 20) {
				aFloat1053 = 0.7821552F;
			}
			if (method2251((byte) 53) < 20) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jd.B(" + i + ')');
		}
	}

	static final void method2264(final byte i) {
		try {
			if (i > -77) {
				aFloat1053 = -0.715336F;
			}
			final int i_25_ = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub15_4058
					.method612((byte) 125);
			if ((i_25_ ^ 0xffffffff) == -1) {
				OutputStream_Sub2.aByteArrayArrayArray41 = null;
				Class36.method341(0, -1003);
			} else if ((i_25_ ^ 0xffffffff) == -2) {
				Class199.method2685(-15, (byte) 0);
				Class36.method341(512, -1003);
				if (Class281.aByteArrayArrayArray2117 != null) {
					Class254.method3186(59);
				}
			} else {
				Class199.method2685(-15, (byte) (0xff & -4
						+ Class64_Sub15.anInt3676));
				Class36.method341(2, -1003);
			}
			Class145.anInt1170 = Class43.anInt377;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jd.K(" + i + ')');
		}
	}

	public Class135() {
		/* empty */
	}
}
