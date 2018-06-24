/* Class64_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub7 extends Class64 {
	static OutgoingOpcode aClass171_3657 = new OutgoingOpcode(21, -1);

	static final char method576(final byte i, final byte i_0_) {
		try {
			int i_1_ = 0xff & i;
			if ((i_1_ ^ 0xffffffff) == -1) {
				throw new IllegalArgumentException("Non cp1252 character 0x"
						+ Integer.toString(i_1_, 16) + " provided");
			}
			if (i_1_ >= 128 && (i_1_ ^ 0xffffffff) > -161) {
				int i_2_ = Class65.aCharArray497[-128 + i_1_];
				if ((i_2_ ^ 0xffffffff) == -1) {
					i_2_ = 63;
				}
				i_1_ = i_2_;
			}
			if (i_0_ < 118) {
				return '\023';
			}
			return (char) i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ds.D(" + i + ','
					+ i_0_ + ')');
		}
	}

	@Override
	final void method550(final int i, final int i_3_) {
		try {
			((Class64) this).anInt494 = i_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ds.B(" + i + ','
					+ i_3_ + ')');
		}
	}

	public static void method577(final int i) {
		do {
			try {
				aClass171_3657 = null;
				if (i == 16) {
					break;
				}
				aClass171_3657 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ds.I(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final int method556(final int i, final int i_5_) {
		try {
			if (i_5_ != 29053) {
				aClass171_3657 = null;
			}
			if (((Class64) this).aClass98_Sub27_495.method1291((byte) 127)) {
				return 3;
			}
			if (((Class64) this).aClass98_Sub27_495.aClass64_Sub20_4056
					.method634((byte) 123) == 0) {
				return 3;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ds.F(" + i + ','
					+ i_5_ + ')');
		}
	}

	Class64_Sub7(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	Class64_Sub7(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				method577(36);
			}
			return 2;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ds.A(" + i + ')');
		}
	}

	static final void method578(final int i) {
		try {
			if (i != 16543) {
				method578(-104);
			}
			for (Class98_Sub36 class98_sub36 = ((Class98_Sub36) Class156_Sub1.aClass377_3277
					.method3998(123)); class98_sub36 != null; class98_sub36 = (Class98_Sub36) Class156_Sub1.aClass377_3277
					.method3995(i + -16544)) {
				if (!class98_sub36.aClass237_Sub1_4157.method2902(true)) {
					class98_sub36.aClass237_Sub1_4157.method2916((byte) 44);
					try {
						class98_sub36.aClass237_Sub1_4157.method2904(false);
					} catch (final Exception exception) {
						Class305_Sub1.method3585(exception, -121, "TV: "
								+ (class98_sub36.anInt4160));
						Class98_Sub11.method1127((byte) 67,
								class98_sub36.anInt4160);
					}
					if (!class98_sub36.aBoolean4155
							&& !class98_sub36.aBoolean4153) {
						final Class98_Sub43_Sub1 class98_sub43_sub1 = class98_sub36.aClass237_Sub1_4157
								.method2900((byte) -79);
						if (class98_sub43_sub1 != null) {
							final Class98_Sub31_Sub4 class98_sub31_sub4 = class98_sub43_sub1
									.method1488((byte) 92);
							if (class98_sub31_sub4 != null) {
								class98_sub31_sub4.method1392(i + 255170282,
										(class98_sub36.anInt4152));
								Class81.aClass98_Sub31_Sub3_619
										.method1371(class98_sub31_sub4);
								class98_sub36.aBoolean4155 = true;
							}
						}
					}
				} else {
					Class98_Sub11.method1127((byte) 67,
							(class98_sub36.anInt4160));
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ds.H(" + i + ')');
		}
	}

	@Override
	final void method551(final byte i) {
		try {
			if (i < 118) {
				method579((byte) 45);
			}
			if (((Class64) this).aClass98_Sub27_495.method1291((byte) 119)) {
				((Class64) this).anInt494 = 0;
			}
			if ((((Class64) this).aClass98_Sub27_495.aClass64_Sub20_4056
					.method634((byte) 120) ^ 0xffffffff) == -1) {
				((Class64) this).anInt494 = 0;
			}
			if (((Class64) this).anInt494 < 0 || ((Class64) this).anInt494 > 2) {
				((Class64) this).anInt494 = method552(0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ds.C(" + i + ')');
		}
	}

	final int method579(final byte i) {
		try {
			if (i < 119) {
				aClass171_3657 = null;
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ds.E(" + i + ')');
		}
	}

	static final void method580(final ha var_ha, final int i) {
		try {
			for (Class246_Sub5 class246_sub5 = ((Class246_Sub5) Class267.aClass218_2002
					.method2803((byte) 15)); class246_sub5 != null; class246_sub5 = ((Class246_Sub5) Class267.aClass218_2002
					.method2809(false))) {
				if (class246_sub5.aBoolean5108) {
					class246_sub5.method3118(var_ha);
				}
			}
			if (i < 15) {
				method577(15);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ds.M("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final boolean method581(final int i) {
		try {
			if (i != -1) {
				return false;
			}
			if (((Class64) this).aClass98_Sub27_495.method1291((byte) 106)) {
				return false;
			}
			if (((Class64) this).aClass98_Sub27_495.aClass64_Sub20_4056
					.method634((byte) 120) == 0) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ds.G(" + i + ')');
		}
	}
}
