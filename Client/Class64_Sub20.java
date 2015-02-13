/* Class64_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub20 extends Class64 {
	static Class218 aClass218_3694 = new Class218();
	static Class207 aClass207_3695;
	static int anInt3696;
	static Class207 aClass207_3697;
	static int anInt3698 = 1403;
	static Model[] aClass178Array3699 = new Model[4];

	@Override
	final void method551(final byte i) {
		do {
			try {
				if (i >= 118) {
					do {
						if (((Class64) this).aClass98_Sub27_495
								.method1286((byte) 104) == s_Sub1.aClass279_5197) {
							if (!((Class64) this).aClass98_Sub27_495
									.method1291((byte) 117)) {
								break;
							}
							((Class64) this).anInt494 = 0;
							if (!client.aBoolean3553) {
								break;
							}
						}
						((Class64) this).anInt494 = 1;
					} while (false);
					if (((Class64) this).anInt494 == 0
							|| ((Class64) this).anInt494 == 1) {
						break;
					}
					((Class64) this).anInt494 = method552(0);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "raa.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final int method556(final int i, final int i_0_) {
		try {
			if (i_0_ != 29053) {
				method556(68, 122);
			}
			if (((Class64) this).aClass98_Sub27_495.method1286((byte) 104) == s_Sub1.aClass279_5197) {
				if (((Class64) this).aClass98_Sub27_495.method1291((byte) 114)) {
					return 3;
				}
				if (i == 0
						|| ((Class64) this).aClass98_Sub27_495.aClass64_Sub25_4039
								.method655((byte) 126) == 1) {
					return 1;
				}
				return 2;
			}
			return 3;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "raa.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method633(final int i) {
		try {
			if (Class258.aClass155Array1951 != null) {
				for (int i_1_ = 0; ((Class21_Sub3.anInt5389 ^ 0xffffffff) < (i_1_ ^ 0xffffffff)); i_1_++) {
					Class258.aClass155Array1951[i_1_] = null;
				}
				Class258.aClass155Array1951 = null;
			}
			if (i != 0) {
				aClass178Array3699 = null;
			}
			if (Class98_Sub30.aClass155Array4099 != null) {
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (Class336.anInt2820 ^ 0xffffffff); i_2_++) {
					Class98_Sub30.aClass155Array4099[i_2_] = null;
				}
				Class98_Sub30.aClass155Array4099 = null;
			}
			if (Class98_Sub32_Sub1.aClass155Array5889 != null) {
				for (int i_3_ = 0; i_3_ < ha.anInt936; i_3_++) {
					Class98_Sub32_Sub1.aClass155Array5889[i_3_] = null;
				}
				Class98_Sub32_Sub1.aClass155Array5889 = null;
			}
			Class213.aClass155Array1611 = null;
			Class111_Sub3.anIntArray4707 = null;
			Class64_Sub3.anInt3646 = IncomingOpcode.anInt461 = -1;
			Class98_Sub46_Sub13_Sub2.anIntArrayArrayArray6311 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "raa.I(" + i + ')');
		}
	}

	final int method634(final byte i) {
		try {
			if (i <= 119) {
				method637(-83);
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "raa.E(" + i + ')');
		}
	}

	@Override
	final void method550(final int i, final int i_4_) {
		try {
			((Class64) this).anInt494 = i_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "raa.B(" + i + ','
					+ i_4_ + ')');
		}
	}

	final boolean method635(final int i) {
		try {
			if (i != -1) {
				method633(-77);
			}
			if (((Class64) this).aClass98_Sub27_495.method1286((byte) 104) == s_Sub1.aClass279_5197) {
				if (((Class64) this).aClass98_Sub27_495.method1291((byte) 120)) {
					return false;
				}
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "raa.G(" + i + ')');
		}
	}

	Class64_Sub20(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	static final Class206 method636(final byte i) {
		try {
			try {
				if (i != 5) {
					method637(20);
				}
				return (Class206) Class.forName("Class206_Sub1").newInstance();
			} catch (final Throwable throwable) {
				return null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "raa.D(" + i + ')');
		}
	}

	public static void method637(final int i) {
		try {
			aClass207_3695 = null;
			aClass218_3694 = null;
			if (i != 0) {
				method636((byte) 45);
			}
			aClass207_3697 = null;
			aClass178Array3699 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "raa.H(" + i + ')');
		}
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				aClass207_3695 = null;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "raa.A(" + i + ')');
		}
	}

	Class64_Sub20(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}
}
