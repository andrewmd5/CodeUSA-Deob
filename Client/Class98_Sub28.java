/* Class98_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class98_Sub28 extends Node {
	static int anInt4078 = 0;
	ha_Sub1 aHa_Sub1_4079;
	static int anInt4080 = 0;
	boolean aBoolean4081;

	abstract boolean method1294(byte i);

	abstract void method1295(int i, int i_0_, boolean bool);

	static final void method1296(final byte i) {
		try {
			Class142.aClass79_1158.method794(106);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lb.K(" + i + ')');
		}
	}

	abstract void method1297(int i, byte i_2_);

	abstract boolean method1298(int i);

	int method1299(final boolean bool) {
		try {
			if (bool != false) {
				method1302(null, -118, (byte) 5, null);
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lb.B(" + bool
					+ ')');
		}
	}

	final boolean method1300(final int i) {
		try {
			if (i != 0) {
				aBoolean4081 = false;
			}
			return aBoolean4081;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lb.N(" + i + ')');
		}
	}

	final boolean method1301(final int i) {
		try {
			if (i > -5) {
				return false;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lb.M(" + i + ')');
		}
	}

	abstract void method1302(Class42_Sub1 class42_sub1, int i, byte i_3_,
			Class42_Sub1 class42_sub1_4_);

	final int method1303(final int i) {
		try {
			if (i != 0) {
				aBoolean4081 = true;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lb.Q(" + i + ')');
		}
	}

	abstract void method1304(byte i);

	static final String method1305(final int i, long l) {
		try {
			if (l <= 0L || l >= 6582952005840035281L) {
				return null;
			}
			if (l % 37L == 0L) {
				return null;
			}
			int i_5_ = 0;
			for (long l_6_ = l; l_6_ != 0L; l_6_ /= 37L) {
				i_5_++;
			}
			final StringBuffer stringbuffer = new StringBuffer(i_5_);
			if (i > -42) {
				method1307(16, -80, -112, 57);
			}
			while (l != 0L) {
				final long l_7_ = l;
				l /= 37L;
				stringbuffer
						.append(Exception_Sub1.aCharArray45[(int) (-(37L * l) + l_7_)]);
			}
			return stringbuffer.reverse().toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lb.P(" + i + ','
					+ l + ')');
		}
	}

	static final int method1306(final byte i) {
		try {
			boolean bool = false;
			boolean bool_8_ = false;
			boolean bool_9_ = false;
			if (Class98_Sub43_Sub2.aClass88_5907.aBoolean682
					&& !Class98_Sub43_Sub2.aClass88_5907.aBoolean675) {
				bool = true;
				if ((Exception_Sub1.aClass98_Sub35_47.anInt4129) < 512
						&& (Exception_Sub1.aClass98_Sub35_47.anInt4129) != 0) {
					bool = false;
				}
				if (!Class88.aString699.startsWith("win")) {
					bool_8_ = true;
				} else {
					bool_9_ = true;
					bool_8_ = true;
				}
			}
			if (Class98_Sub10_Sub38.aBoolean5756) {
				bool = false;
			}
			if (Class95.aBoolean798) {
				bool_8_ = false;
			}
			if (Class67.aBoolean520) {
				bool_9_ = false;
			}
			if (!bool && !bool_8_ && !bool_9_) {
				return Class246_Sub3_Sub4_Sub5.method3085(i ^ ~0x69);
			}
			int i_10_ = -1;
			int i_11_ = -1;
			if (bool) {
				try {
					i_10_ = Class66.method683((byte) -79, 1000, 2);
				} catch (final Exception exception) {
					/* empty */
				}
			}
			int i_12_ = -1;
			do {
				if (bool_9_) {
					try {
						i_12_ = Class66.method683((byte) -113, 1000, 3);
						if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
								.method583((byte) 127) == 3) {
							final Class62 class62 = Class265.aHa1974
									.method1799();
							final long l = (0xffffffffffffL & class62.aLong485);
							final int i_13_ = class62.anInt484;
							if ((i_13_ ^ 0xffffffff) != -4319) {
								if ((i_13_ ^ 0xffffffff) != -4099) {
									break;
								}
							} else {
								bool_8_ = bool_8_
										& ((l ^ 0xffffffffffffffffL) <= -64425238955L);
								break;
							}
							bool_8_ = bool_8_ & l >= 60129613779L;
						}
					} catch (final Exception exception) {
						/* empty */
					}
				}
			} while (false);
			if (i != -106) {
				anInt4078 = -48;
			}
			if (bool_8_) {
				try {
					i_11_ = Class66.method683((byte) -115, 1000, 1);
				} catch (final Exception exception) {
					/* empty */
				}
			}
			if ((i_10_ ^ 0xffffffff) == 0 && (i_11_ ^ 0xffffffff) == 0
					&& i_12_ == -1) {
				return Class246_Sub3_Sub4_Sub5.method3085(0);
			}
			i_12_ *= 1.1F;
			i_11_ *= 1.1F;
			if (i_12_ >= i_10_ || i_10_ <= i_11_) {
				if (i_12_ <= i_11_) {
					return Class132.method2235(i_11_, 1, (byte) 98);
				}
				return Class132.method2235(i_12_, 3, (byte) 98);
			}
			return Class98_Sub46_Sub2_Sub2.method1537(i_10_, 5000);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lb.O(" + i + ')');
		}
	}

	static final int method1307(final int i, final int i_14_, final int i_15_,
			final int i_16_) {
		try {
			if ((Class212.anInt1600 ^ 0xffffffff) > -101) {
				return -2;
			}
			if (i_14_ != 1) {
				return 57;
			}
			int i_17_ = -2;
			int i_18_ = 2147483647;
			final int i_19_ = -Class278.anInt2075 + i_15_;
			final int i_20_ = -Class278.anInt2078 + i_16_;
			for (Class98_Sub47 class98_sub47 = ((Class98_Sub47) Class278.aClass148_2065
					.method2418(i_14_ ^ 0x21)); class98_sub47 != null; class98_sub47 = ((Class98_Sub47) Class278.aClass148_2065
					.method2417(88))) {
				if (i == class98_sub47.anInt4268) {
					final int i_21_ = class98_sub47.anInt4272;
					final int i_22_ = class98_sub47.anInt4267;
					final int i_23_ = (i_21_ + Class278.anInt2075 << -1106336498 | Class278.anInt2078
							+ i_22_);
					final int i_24_ = ((i_20_ + -i_22_) * (i_20_ + -i_22_) + (-i_21_ + i_19_)
							* (i_19_ - i_21_));
					if (i_17_ < 0 || i_24_ < i_18_) {
						i_17_ = i_23_;
						i_18_ = i_24_;
					}
				}
			}
			return i_17_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lb.L(" + i + ','
					+ i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	Class98_Sub28(final ha_Sub1 var_ha_Sub1) {
		try {
			aHa_Sub1_4079 = var_ha_Sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lb.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ')');
		}
	}
}
