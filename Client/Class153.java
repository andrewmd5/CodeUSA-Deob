/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;

final class Class153 {
	static ha aHa1225;
	private final Class79 aClass79_1226 = new Class79(128);
	private Class207 aClass207_1227;
	static volatile boolean aBoolean1228 = true;
	static String aString1229 = null;
	static boolean aBoolean1230 = false;

	final void method2482(final byte i) {
		do {
			try {
				synchronized (aClass79_1226) {
					aClass79_1226.method806((byte) 61);
				}
				if (i > 17) {
					break;
				}
				method2487(126);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "kf.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final Class72 method2483(final int i, final int i_0_) {
		try {
			Class72 class72;
			synchronized (aClass79_1226) {
				class72 = (Class72) aClass79_1226.method802(-128, i);
			}
			if (class72 != null) {
				return class72;
			}
			if (i_0_ < 117) {
				aBoolean1228 = false;
			}
			byte[] is;
			synchronized (aClass207_1227) {
				is = aClass207_1227.method2745(i, 1, false);
			}
			class72 = new Class72();
			if (is != null) {
				class72.method717(new ByteBuffer(is), -52);
			}
			synchronized (aClass79_1226) {
				aClass79_1226.method805(i, class72, (byte) -80);
			}
			return class72;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kf.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final Class268 method2484(int i, final int i_1_, final byte i_2_,
			final Class88 class88, final Component component) {
		try {
			if (Class64_Sub15.anInt3678 == 0) {
				throw new IllegalStateException();
			}
			if ((i_1_ ^ 0xffffffff) > -1 || i_1_ >= 2) {
				throw new IllegalArgumentException();
			}
			if (i < 256) {
				i = 256;
			}
			try {
				final Class268 class268 = (Class268) Class.forName(
						"Class268_Sub2").newInstance();
				class268.anInt2016 = i;
				class268.anIntArray2005 = new int[(!Class151_Sub7.aBoolean5007 ? 1
						: 2) * 256];
				class268.method3253(component);
				class268.anInt2010 = 1024 + (i & ~0x3ff);
				if (class268.anInt2010 > 16384) {
					class268.anInt2010 = 16384;
				}
				class268.method3250(class268.anInt2010);
				if ((PlayerUpdateMask.anInt529 ^ 0xffffffff) < -1
						&& Class177.aClass103_1375 == null) {
					Class177.aClass103_1375 = new Class103();
					Class177.aClass103_1375.aClass88_891 = class88;
					class88.method858(PlayerUpdateMask.anInt529,
							Class177.aClass103_1375, 1);
				}
				if (Class177.aClass103_1375 != null) {
					if ((Class177.aClass103_1375.aClass268Array894[i_1_]) != null) {
						throw new IllegalArgumentException();
					}
					Class177.aClass103_1375.aClass268Array894[i_1_] = class268;
				}
				return class268;
			} catch (final Throwable throwable) {
				try {
					final Class268_Sub1 class268_sub1 = new Class268_Sub1(
							class88, i_1_);
					((Class268) class268_sub1).anInt2016 = i;
					((Class268) class268_sub1).anIntArray2005 = new int[256 * (Class151_Sub7.aBoolean5007 ? 2
							: 1)];
					class268_sub1.method3253(component);
					((Class268) class268_sub1).anInt2010 = 16384;
					if (i_2_ != -126) {
						aBoolean1228 = true;
					}
					class268_sub1
							.method3250(((Class268) class268_sub1).anInt2010);
					if (PlayerUpdateMask.anInt529 > 0
							&& Class177.aClass103_1375 == null) {
						Class177.aClass103_1375 = new Class103();
						Class177.aClass103_1375.aClass88_891 = class88;
						class88.method858(PlayerUpdateMask.anInt529,
								Class177.aClass103_1375, 1);
					}
					if (Class177.aClass103_1375 != null) {
						if ((Class177.aClass103_1375.aClass268Array894[i_1_]) != null) {
							throw new IllegalArgumentException();
						}
						Class177.aClass103_1375.aClass268Array894[i_1_] = class268_sub1;
					}
					return class268_sub1;
				} catch (final Throwable throwable_3_) {
					return new Class268();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("kf.D(" + i + ','
					+ i_1_ + ',' + i_2_ + ','
					+ (class88 != null ? "{...}" : "null") + ','
					+ (component != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2485(final int i, final int i_4_) {
		try {
			synchronized (aClass79_1226) {
				aClass79_1226.method800((byte) 62, i);
			}
			if (i_4_ != 1) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kf.H(" + i + ','
					+ i_4_ + ')');
		}
	}

	final void method2486(final byte i) {
		do {
			try {
				synchronized (aClass79_1226) {
					aClass79_1226.method794(97);
				}
				if (i < -67) {
					break;
				}
				method2485(-5, -3);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "kf.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method2487(final int i) {
		do {
			try {
				Class186.aClass148_3428 = new Class148();
				if (i == -1) {
					break;
				}
				aBoolean1230 = false;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "kf.I(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method2488(final int i) {
		do {
			try {
				aHa1225 = null;
				aString1229 = null;
				if (i == -1) {
					break;
				}
				aString1229 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "kf.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method2489(final long l, final byte i) {
		try {
			final int i_5_ = (Class304.anInt2533 + ((Class246_Sub3) Surface.player).anInt5084);
			final int i_7_ = ((((Class246_Sub3) Surface.player).anInt5079) - -Class98_Sub17.anInt3943);
			if ((-i_5_ + Class201.anInt1545 ^ 0xffffffff) > 1999
					|| (Class201.anInt1545 + -i_5_ ^ 0xffffffff) < -2001
					|| Class224_Sub3_Sub1.anInt6147 + -i_7_ < -2000
					|| ((-i_7_ + Class224_Sub3_Sub1.anInt6147 ^ 0xffffffff) < -2001)) {
				Class201.anInt1545 = i_5_;
				Class224_Sub3_Sub1.anInt6147 = i_7_;
			}
			if (Class201.anInt1545 != i_5_) {
				final int i_8_ = i_5_ + -Class201.anInt1545;
				int i_9_ = (int) (i_8_ * l / 320L);
				if ((i_8_ ^ 0xffffffff) >= -1) {
					if (i_9_ == 0) {
						i_9_ = -1;
					} else if ((i_9_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
						i_9_ = i_8_;
					}
				} else if (i_9_ != 0) {
					if ((i_9_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff)) {
						i_9_ = i_8_;
					}
				} else {
					i_9_ = 1;
				}
				Class201.anInt1545 += i_9_;
			}
			if (i_7_ != Class224_Sub3_Sub1.anInt6147) {
				final int i_10_ = -Class224_Sub3_Sub1.anInt6147 + i_7_;
				int i_11_ = (int) (l * i_10_ / 320L);
				if ((i_10_ ^ 0xffffffff) >= -1) {
					if ((i_11_ ^ 0xffffffff) != -1) {
						if ((i_10_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff)) {
							i_11_ = i_10_;
						}
					} else {
						i_11_ = -1;
					}
				} else if (i_11_ == 0) {
					i_11_ = 1;
				} else if (i_10_ < i_11_) {
					i_11_ = i_10_;
				}
				Class224_Sub3_Sub1.anInt6147 += i_11_;
			}
			Class119_Sub4.aFloat4740 += l * Class305.aFloat2545 / 6.0F;
			Class98_Sub22_Sub2.aFloat5794 += l * Class180.aFloat3405 / 6.0F;
			Class42_Sub2.method388(true);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kf.G(" + l + ','
					+ i + ')');
		}
	}

	Class153(final Class279 class279, final int i, final Class207 class207) {
		try {
			aClass207_1227 = class207;
			aClass207_1227.method2761(0, 1);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("kf.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method2490(final int i, final boolean bool) {
		try {
			if (bool != false) {
				aHa1225 = null;
			}
			return i >>> -1052998200;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kf.E(" + i + ','
					+ bool + ')');
		}
	}
}
