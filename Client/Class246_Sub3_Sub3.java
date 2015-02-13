/* Class246_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub3_Sub3 extends Class246_Sub3 {
	static Class254 aClass254_6152 = new Class254(8);
	short aShort6153;
	static Class206 aClass206_6154 = Class64_Sub20.method636((byte) 5);
	static Class143 aClass143_6155;
	static String aString6156 = null;

	@Override
	final int method2980(final int i, final Class98_Sub5[] class98_sub5s) {
		try {
			final int i_0_ = ((Class246_Sub3) this).anInt5084 >> Class151_Sub8.anInt5015;
			final int i_1_ = ((Class246_Sub3) this).anInt5079 >> Class151_Sub8.anInt5015;
			int i_2_ = 0;
			if (i_0_ != Class241.anInt1845) {
				if (Class241.anInt1845 < i_0_) {
					i_2_ += 2;
				}
			} else {
				i_2_++;
			}
			if ((Class64_Sub26.anInt3714 ^ 0xffffffff) != (i_1_ ^ 0xffffffff)) {
				if ((i_1_ ^ 0xffffffff) > (Class64_Sub26.anInt3714 ^ 0xffffffff)) {
					i_2_ += 6;
				}
			} else {
				i_2_ += 3;
			}
			final int i_3_ = Class241.anIntArray1846[i_2_];
			if ((aShort6153 & i_3_ ^ 0xffffffff) != -1) {
				return method2989(i_0_, false, class98_sub5s, i_1_);
			}
			if ((aShort6153 ^ 0xffffffff) == -2 && i_0_ > 0) {
				return method2989(-1 + i_0_, false, class98_sub5s, i_1_);
			}
			if ((aShort6153 ^ 0xffffffff) == -5 && i_0_ <= Class366.anInt3112) {
				return method2989(1 + i_0_, false, class98_sub5s, i_1_);
			}
			if (aShort6153 == 8 && i_1_ > 0) {
				return method2989(i_0_, false, class98_sub5s, -1 + i_1_);
			}
			if (aShort6153 == 2
					&& (Class64_Sub9.anInt3662 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)) {
				return method2989(i_0_, false, class98_sub5s, 1 + i_1_);
			}
			if (aShort6153 == 16
					&& i_0_ > 0
					&& (i_1_ ^ 0xffffffff) >= (Class64_Sub9.anInt3662 ^ 0xffffffff)) {
				return method2989(-1 + i_0_, false, class98_sub5s, 1 + i_1_);
			}
			if ((aShort6153 ^ 0xffffffff) == -33
					&& (Class366.anInt3112 ^ 0xffffffff) <= (i_0_ ^ 0xffffffff)
					&& Class64_Sub9.anInt3662 >= i_1_) {
				return method2989(i_0_ + 1, false, class98_sub5s, 1 + i_1_);
			}
			if (aShort6153 == 128 && (i_0_ ^ 0xffffffff) < -1
					&& (i_1_ ^ 0xffffffff) < -1) {
				return method2989(i_0_ + -1, false, class98_sub5s, i_1_ - 1);
			}
			if ((aShort6153 ^ 0xffffffff) == -65 && i_0_ <= Class366.anInt3112
					&& (i_1_ ^ 0xffffffff) < -1) {
				return method2989(i_0_ + 1, false, class98_sub5s, i_1_ - 1);
			}
			throw new RuntimeException("");
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jn.GA(" + i + ','
					+ (class98_sub5s != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final boolean method2991(final boolean bool) {
		try {
			if (bool != false) {
				aString6156 = null;
			}
			return (Class74.aBooleanArrayArray551[((((Class246_Sub3) this).anInt5084 >> Class151_Sub8.anInt5015) + (-Class241.anInt1845 - -Class259.anInt1959))][(-Class64_Sub26.anInt3714 + ((((Class246_Sub3) this).anInt5079 >> Class151_Sub8.anInt5015) + Class259.anInt1959))]);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jn.FA(" + bool
					+ ')');
		}
	}

	static final boolean method3011(final int i, final int i_5_) {
		try {
			if (i != -6410) {
				return false;
			}
			if ((i_5_ ^ 0xffffffff) != -8 && i_5_ != 8 && i_5_ != 9) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jn.L(" + i + ','
					+ i_5_ + ')');
		}
	}

	static final void method3012(
			final Class246_Sub3_Sub4_Sub2 class246_sub3_sub4_sub2, final byte i) {
		do {
			try {
				if (i >= -105) {
					method3012(null, (byte) 25);
				}
				if (!(class246_sub3_sub4_sub2 instanceof Class246_Sub3_Sub4_Sub2_Sub1)) {
					if (class246_sub3_sub4_sub2 instanceof Class246_Sub3_Sub4_Sub2_Sub2) {
						final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = ((Class246_Sub3_Sub4_Sub2_Sub2) class246_sub3_sub4_sub2);
						Class98_Sub30
								.method1311(
										(((((Class246_Sub3) class246_sub3_sub4_sub2_sub2).aByte5088) ^ 0xffffffff) != ((((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aByte5088) ^ 0xffffffff)),
										true, class246_sub3_sub4_sub2_sub2);
					}
				} else {
					final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = ((Class246_Sub3_Sub4_Sub2_Sub1) class246_sub3_sub4_sub2);
					if (class246_sub3_sub4_sub2_sub1.aClass141_6504 == null) {
						break;
					}
					Class98_Sub10
							.method995(
									class246_sub3_sub4_sub2_sub1,
									(byte) 55,
									((((Class246_Sub3) class246_sub3_sub4_sub2_sub1).aByte5088) != (((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aByte5088)));
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("jn.D("
								+ ((class246_sub3_sub4_sub2 != null) ? "{...}"
										: "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public static void method3013(final byte i) {
		try {
			if (i != -93) {
				aClass143_6155 = null;
			}
			aClass206_6154 = null;
			aString6156 = null;
			aClass254_6152 = null;
			aClass143_6155 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jn.F(" + i + ')');
		}
	}

	@Override
	final boolean method2977(final ha var_ha, final byte i) {
		try {
			if (i != 77) {
				return false;
			}
			return Class100
					.method1688(
							((Class246_Sub3) this).aByte5081,
							(((Class246_Sub3) this).anInt5084 >> Class151_Sub8.anInt5015),
							(((Class246_Sub3) this).anInt5079 >> Class151_Sub8.anInt5015),
							this, (byte) 112);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jn.AA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final int method3014(final int i, final int i_6_) {
		try {
			if (i != 1) {
				method3013((byte) -80);
			}
			if (i_6_ != 6406) {
				if ((i_6_ ^ 0xffffffff) != -6410) {
					if (i_6_ != 32841) {
						if (i_6_ != 6410) {
							if (i_6_ == 6407) {
								return 3;
							}
							if ((i_6_ ^ 0xffffffff) == -6409) {
								return 4;
							}
						} else {
							return 2;
						}
					} else {
						return 1;
					}
				} else {
					return 1;
				}
			} else {
				return 1;
			}
			throw new IllegalArgumentException("");
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jn.K(" + i + ','
					+ i_6_ + ')');
		}
	}

	static final void method3015(final int i, final int i_7_, final byte i_8_,
			final Class28 class28) {
		do {
			try {
				Class76.aClass28ArrayArray586[i_7_][i] = class28;
				if (i_8_ > 20) {
					break;
				}
				method3013((byte) -29);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("jn.M(" + i
						+ ',' + i_7_ + ',' + i_8_ + ','
						+ (class28 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	Class246_Sub3_Sub3(final int i, final int i_9_, final int i_10_,
			final int i_11_, final int i_12_, final int i_13_) {
		try {
			aShort6153 = (short) i_13_;
			((Class246_Sub3) this).anInt5084 = i;
			((Class246_Sub3) this).aByte5088 = (byte) i_11_;
			((Class246_Sub3) this).aByte5081 = (byte) i_12_;
			((Class246_Sub3) this).anInt5089 = i_9_;
			((Class246_Sub3) this).anInt5079 = i_10_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jn.<init>(" + i
					+ ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_
					+ ',' + i_13_ + ')'));
		}
	}
}
