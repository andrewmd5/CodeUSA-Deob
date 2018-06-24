/* Class64_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub29 extends Class64 {
	static Class196 aClass196_3720;

	Class64_Sub29(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	static final void method673(final ha var_ha, final d var_d, final int i,
			final int i_0_, final int i_1_, final byte i_2_, final int i_3_) {
		do {
			try {
				if (Class212.anInt1600 < 100) {
					Class339.method3783(var_ha, var_d, 107);
				}
				var_ha.KA(i_0_, i, i_3_ + i_0_, i + i_1_);
				if (Class212.anInt1600 < 100) {
					final int i_4_ = 20;
					final int i_5_ = i_3_ / 2 + i_0_;
					final int i_6_ = -18 + (i + i_1_ / 2 + -i_4_);
					var_ha.aa(i_0_, i, i_3_, i_1_, -16777216, 0);
					var_ha.method1779(
							-152 + i_5_,
							i_6_,
							304,
							34,
							Class224_Sub1.aColorArray5036[Class98_Sub9.anInt3855]
									.getRGB(), 0);
					var_ha.aa(i_5_ - 150, i_6_ - -2, Class212.anInt1600 * 3,
							30,
							Class301.aColorArray2508[Class98_Sub9.anInt3855]
									.getRGB(), 0);
					Class98_Sub10_Sub34.aClass43_5730
							.method415(
									Class98_Sub5_Sub1.aColorArray5533[Class98_Sub9.anInt3855]
											.getRGB(), Class309.aClass309_2604
											.method3615(Class374.anInt3159,
													(byte) 25), i_5_, -1,
									(byte) -50, i_4_ + i_6_);
				} else {
					final int i_7_ = (Class42_Sub4.anInt5371 - (int) (i_3_ / Class278.aFloat2064));
					final int i_8_ = ((int) (i_1_ / Class278.aFloat2064) + Class98_Sub40.anInt4197);
					final int i_9_ = ((int) (i_3_ / Class278.aFloat2064) + Class42_Sub4.anInt5371);
					Class231.anInt1739 = (-(int) (i_1_ / Class278.aFloat2064) + Class98_Sub40.anInt4197);
					aa.anInt48 = (int) (i_3_ * 2 / Class278.aFloat2064);
					Class246_Sub3_Sub5_Sub2.anInt6268 = (int) (2 * i_1_ / Class278.aFloat2064);
					final int i_11_ = (-(int) (i_1_ / Class278.aFloat2064) + Class98_Sub40.anInt4197);
					Class166.anInt1279 = (-(int) (i_3_ / Class278.aFloat2064) + Class42_Sub4.anInt5371);
					Class278.method3308(Class278.anInt2075 + i_7_,
							Class278.anInt2078 + i_8_, i_9_
									+ Class278.anInt2075, Class278.anInt2078
									+ i_11_, i_0_, i, i_3_ + i_0_, i_1_ + i + 1);
					Class278.method3309(var_ha);
					final Class148 class148 = Class278.method3315(var_ha);
					Class86.method843(0, var_ha, class148, -1, 0);
					if ((Class64_Sub25.anInt3711 ^ 0xffffffff) < -1) {
						Class287.anInt2186--;
						if (Class287.anInt2186 == 0) {
							Class64_Sub25.anInt3711--;
							Class287.anInt2186 = 20;
						}
					}
					if (!Class91.aBoolean725) {
						break;
					}
					final int i_12_ = i_3_ + (i_0_ - 5);
					int i_13_ = i_1_ + (i + -8);
					Class195.aClass43_1499.method397(16776960, 0, i_12_, -1,
							("Fps:" + Class338.anInt2842), i_13_);
					i_13_ -= 15;
					final Runtime runtime = Runtime.getRuntime();
					final int i_14_ = (int) ((runtime.totalMemory() + -runtime
							.freeMemory()) / 1024L);
					int i_15_ = 16776960;
					if ((i_14_ ^ 0xffffffff) < -65537) {
						i_15_ = 16711680;
					}
					Class195.aClass43_1499.method397(i_15_, 0, i_12_, -1,
							"Mem:" + i_14_ + "k", i_13_);
					i_13_ -= 15;

				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("wfa.G("
						+ (var_ha != null ? "{...}" : "null") + ','
						+ (var_d != null ? "{...}" : "null") + ',' + i + ','
						+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	Class64_Sub29(final int i, final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				return -116;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wfa.A(" + i + ')');
		}
	}

	@Override
	final void method550(final int i, final int i_16_) {
		try {
			((Class64) this).anInt494 = i_16_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wfa.B(" + i + ','
					+ i_16_ + ')');
		}
	}

	@Override
	final void method551(final byte i) {
		do {
			try {
				if ((((Class64) this).anInt494 ^ 0xffffffff) != -2
						&& (((Class64) this).anInt494 ^ 0xffffffff) != -1) {
					((Class64) this).anInt494 = method552(0);
				}
				if (i >= 118) {
					break;
				}
				method675(103, 107);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "wfa.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method674(final int i, final int i_18_, final int i_19_,
			final Class207 class207, final int i_20_, final boolean bool,
			final byte i_21_) {
		do {
			try {
				if ((i_20_ ^ 0xffffffff) >= -1) {
					s_Sub1.method3434(class207, bool, i, i_19_, i_18_, -16523);
					if (!client.aBoolean3553) {
						break;
					}
				}
				Class116.aClass98_Sub31_Sub2_965 = null;
				Class98_Sub18.anInt3951 = i_19_;
				Class257.anInt1948 = 1;
				Class269.aClass207_2025 = class207;
				Class76_Sub8.anInt3770 = i_18_;
				Class1.aBoolean66 = bool;
				Class224_Sub3.anInt5037 = i;
				Class348.anInt2911 = (Class366.aClass98_Sub31_Sub2_3122
						.method1360(-16257) / i_20_);
				if (Class348.anInt2911 < 1) {
					Class348.anInt2911 = 1;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("wfa.D(" + i
						+ ',' + i_18_ + ',' + i_19_ + ','
						+ (class207 != null ? "{...}" : "null") + ',' + i_20_
						+ ',' + bool + ',' + i_21_ + ')'));
			}
		} while (false);
	}

	static final String method675(final int i, final int i_23_) {
		try {
			String string = Integer.toString(i);
			if (i_23_ != 16474) {
				aClass196_3720 = null;
			}
			for (int i_24_ = string.length() + -3; (i_24_ ^ 0xffffffff) < -1; i_24_ -= 3) {
				string = (string.substring(0, i_24_) + "," + string
						.substring(i_24_));
			}
			if (string.length() > 9) {
				return (" <col=00ff80>"
						+ string.substring(0, -8 + string.length())
						+ Class309.aClass309_2619.method3615(
								Class374.anInt3159, (byte) 25) + " (" + string + ")</col>");
			}
			if ((string.length() ^ 0xffffffff) < -7) {
				return (" <col=ffffff>"
						+ string.substring(0, -4 + string.length())
						+ Class309.aClass309_2621.method3615(
								Class374.anInt3159, (byte) 25) + " (" + string + ")</col>");
			}
			return " <col=ffff00>" + string + "</col>";
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wfa.H(" + i + ','
					+ i_23_ + ')');
		}
	}

	@Override
	final int method556(final int i, final int i_25_) {
		try {
			if (i_25_ != 29053) {
				aClass196_3720 = null;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wfa.F(" + i + ','
					+ i_25_ + ')');
		}
	}

	public static void method676(final byte i) {
		try {
			if (i != -58) {
				aClass196_3720 = null;
			}
			aClass196_3720 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wfa.I(" + i + ')');
		}
	}

	final int method677(final byte i) {
		try {
			if (i < 119) {
				aClass196_3720 = null;
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wfa.E(" + i + ')');
		}
	}
}
