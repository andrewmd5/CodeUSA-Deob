/* Class64_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub6 extends Class64 {
	static int anInt3655;
	static boolean aBoolean3656 = true;

	final int method572(final byte i) {
		try {
			if (i < 119) {
				return -73;
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dea.E(" + i + ')');
		}
	}

	static final void method573(final int i, final long l) {
		try {
			final int i_0_ = Class98_Sub46_Sub2_Sub2.anInt6295;
			if ((i_0_ ^ 0xffffffff) != (Class201.anInt1545 ^ 0xffffffff)) {
				final int i_1_ = -Class201.anInt1545 + i_0_;
				int i_2_ = (int) (l * i_1_ / 320L);
				if (i_1_ <= 0) {
					if (i_2_ != 0) {
						if (i_1_ > i_2_) {
							i_2_ = i_1_;
						}
					} else {
						i_2_ = -1;
					}
				} else if (i_2_ == 0) {
					i_2_ = 1;
				} else if ((i_1_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
					i_2_ = i_1_;
				}
				Class201.anInt1545 += i_2_;
			}
			final int i_3_ = Class135.anInt1051;
			if (i == -1) {
				Class119_Sub4.aFloat4740 += 8.0F * (l * Class305.aFloat2545 / 40.0F);
				if ((i_3_ ^ 0xffffffff) != (Class224_Sub3_Sub1.anInt6147 ^ 0xffffffff)) {
					final int i_4_ = -Class224_Sub3_Sub1.anInt6147 + i_3_;
					int i_5_ = (int) (l * i_4_ / 320L);
					if ((i_4_ ^ 0xffffffff) >= -1) {
						if (i_5_ == 0) {
							i_5_ = -1;
						} else if ((i_5_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
							i_5_ = i_4_;
						}
					} else if (i_5_ != 0) {
						if (i_5_ > i_4_) {
							i_5_ = i_4_;
						}
					} else {
						i_5_ = 1;
					}
					Class224_Sub3_Sub1.anInt6147 += i_5_;
				}
				Class98_Sub22_Sub2.aFloat5794 += 8.0F * (Class180.aFloat3405
						* l / 40.0F);
				Class42_Sub2.method388(true);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dea.H(" + i + ','
					+ l + ')');
		}
	}

	static final int method574(final int i, final char c) {
		try {
			if (i <= 72) {
				return 52;
			}
			if (c >= 0 && Class98_Sub43_Sub3.anIntArray5919.length > c) {
				return Class98_Sub43_Sub3.anIntArray5919[c];
			}
			return -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dea.D(" + i + ','
					+ c + ')');
		}
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				return 19;
			}
			if ((((Class64) this).aClass98_Sub27_495.method1289(i ^ ~0x61)
					.method2318(i + -1) ^ 0xffffffff) > -97) {
				return 0;
			}
			return 2;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dea.A(" + i + ')');
		}
	}

	@Override
	final void method551(final byte i) {
		try {
			if (i > 118) {
				if ((((Class64) this).aClass98_Sub27_495.method1289(-123)
						.method2318(-1) ^ 0xffffffff) > -97) {
					((Class64) this).anInt494 = 0;
				}
				if (((Class64) this).anInt494 < 0
						|| ((Class64) this).anInt494 > 2) {
					((Class64) this).anInt494 = method552(0);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dea.C(" + i + ')');
		}
	}

	Class64_Sub6(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
		try {
			Class98_Sub10_Sub1.method1004(-119, ((Class64) this).anInt494);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dea.<init>("
					+ (class98_sub27 != null ? "{...}" : "null") + ')'));
		}
	}

	Class64_Sub6(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
		try {
			Class98_Sub10_Sub1.method1004(-44, ((Class64) this).anInt494);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dea.<init>(" + i
					+ ',' + (class98_sub27 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method575(final int i) {
		try {
			if (((Class64) this).aClass98_Sub27_495.method1289(-100)
					.method2318(i) < 96) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dea.G(" + i + ')');
		}
	}

	@Override
	final void method550(final int i, final int i_6_) {
		try {
			((Class64) this).anInt494 = i_6_;
			Class98_Sub10_Sub1.method1004(-42, ((Class64) this).anInt494);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dea.B(" + i + ','
					+ i_6_ + ')');
		}
	}

	@Override
	final int method556(final int i, final int i_8_) {
		try {
			if (i_8_ != 29053) {
				method574(-122, 't');
			}
			if ((((Class64) this).aClass98_Sub27_495.method1289(-119)
					.method2318(i_8_ ^ ~0x717d) ^ 0xffffffff) > -97) {
				return 3;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dea.F(" + i + ','
					+ i_8_ + ')');
		}
	}
}
