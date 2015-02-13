/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class47 implements Runnable {
	private boolean aBoolean397;
	private Interface10 anInterface10_398 = new Class292();
	static Class113 aClass113_399 = new Class113(1, 2);
	private volatile boolean aBoolean400;
	private int anInt401;
	private Interface10 anInterface10_402 = null;
	private String aString403;
	private int anInt404;
	private long aLong405;
	private long aLong406;
	static int anInt407 = 0;
	private Class75 aClass75_408;

	final int method440(int i) {
		try {
			if (i >= -113)
				return 34;
			return anInt404;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dga.A(" + i + ')');
		}
	}

	final synchronized boolean method441(byte i) {
		try {
			int i_0_ = 127 % ((66 - i) / 52);
			return anInterface10_398.method28(-105, aLong406);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dga.C(" + i + ')');
		}
	}

	final Class75 method442(byte i) {
		try {
			if (i != 54)
				method441((byte) -74);
			return aClass75_408;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dga.F(" + i + ')');
		}
	}

	final String method443(byte i) {
		try {
			if (i != -46)
				method447(66);
			return aString403;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dga.E(" + i + ')');
		}
	}

	final synchronized void method444(byte i, Interface10 interface10) {
		try {
			if (i >= -17)
				anInterface10_398 = null;
			anInterface10_402 = anInterface10_398;
			anInterface10_398 = interface10;
			aLong406 = Class343.method3819(-47);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dga.L(" + i + ','
					+ (interface10 != null ? "{...}" : "null") + ')'));
		}
	}

	final long method445(byte i) {
		try {
			int i_1_ = 110 % ((i - 64) / 56);
			return aLong405;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dga.I(" + i + ')');
		}
	}

	public final void run() {
		try {
			while (!aBoolean400) {
				long l = Class343.method3819(-47);
				synchronized (this) {
					try {
						anInt401++;
						if (!(anInterface10_398 instanceof Class292)) {
							long l_2_ = Class343.method3819(-47);
							if (Class265.aHa1974 == null
									|| anInterface10_402 == null
									|| anInterface10_402.method25(-24591) == 0
									|| ((aLong406 ^ 0xffffffffffffffffL) > (-(long) anInterface10_402
											.method25(-24591) + l_2_ ^ 0xffffffffffffffffL))) {
								if (anInterface10_402 != null) {
									aBoolean397 = true;
									anInterface10_402.method24(-26363);
									anInterface10_402 = null;
								}
								if (aBoolean397) {
									Class263.method3216(14059);
									if (Class265.aHa1974 != null)
										Class265.aHa1974.GA(0);
								}
								anInterface10_398
										.method23(
												32210,
												(aBoolean397 || (Class265.aHa1974 != null && Class265.aHa1974
														.method1819())));
							} else {
								int i = (int) ((l_2_ - aLong406) * 255L / (long) anInterface10_402
										.method25(-24591));
								int i_3_ = -i + 255;
								Class263.method3216(14059);
								i_3_ = 0xffffff | i_3_ << 511614744;
								i = 0xffffff | i << -1078525736;
								Class265.aHa1974.GA(0);
								Class332 class332 = (Class265.aHa1974
										.method1739(Class39_Sub1.anInt3593,
												Class98_Sub25.anInt4024, true));
								Class265.aHa1974.method1763(-74, class332);
								anInterface10_402.method23(32210, true);
								Class265.aHa1974.method1776();
								class332.method3748(0, 0, 0, i_3_, 1);
								Class265.aHa1974.method1763(-123, class332);
								Class265.aHa1974.GA(0);
								anInterface10_398.method23(32210, true);
								Class265.aHa1974.method1776();
								class332.method3748(0, 0, 0, i, 1);
							}
							try {
								if (Class265.aHa1974 != null
										&& !(anInterface10_398 instanceof Class292))
									Class265.aHa1974.method1754(-128);
							} catch (Exception_Sub1 exception_sub1) {
								Class305_Sub1
										.method3585(
												exception_sub1,
												-121,
												(exception_sub1.getMessage()
														+ " (Recovered) " + Class315.aClient3529
														.method94(0)));
								Class76_Sub4.method754(0, true, 57);
							}
						} else
							anInterface10_398.method23(32210, aBoolean397);
						java.awt.Container container;
						if (Class284.aFrame2168 == null) {
							if (Class76_Sub11.anApplet3799 == null)
								container = (Class246_Sub3_Sub5_Sub2.anApplet_Sub1_6271);
							else
								container = Class76_Sub11.anApplet3799;
						} else
							container = Class284.aFrame2168;
						container.getSize();
						container.getSize();
						if (Class284.aFrame2168 == container)
							Class284.aFrame2168.getInsets();
						aBoolean397 = false;
						if (Class265.aHa1974 != null
								&& !(anInterface10_398 instanceof Class292)
								&& ((aClass75_408.method736((byte) -10) ^ 0xffffffff) > (Class75.aClass75_577
										.method736((byte) -10) ^ 0xffffffff)))
							Class98_Sub31_Sub2.method1336((byte) -90);
					} catch (Exception exception) {
						continue;
					}
				}
				long l_4_ = Class343.method3819(-47);
				int i = (int) (20L + l + -l_4_);
				if ((i ^ 0xffffffff) < -1)
					Class246_Sub7.method3131(0, (long) i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dga.run(" + ')');
		}
	}

	final synchronized void method446(long l, byte i, int i_5_,
			Class75 class75, String string) {
		try {
			aLong405 = l;
			aClass75_408 = class75;
			anInt404 = i_5_;
			int i_6_ = -57 % (-i / 58);
			aString403 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dga.G(" + l + ','
					+ i + ',' + i_5_ + ','
					+ (class75 != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	final int method447(int i) {
		try {
			if (i != 6119)
				anInt401 = -126;
			if (aClass75_408 == null)
				return 0;
			int i_7_ = aClass75_408.method736((byte) -10);
			if (((Class75) aClass75_408).aBoolean553
					&& (anInt404 ^ 0xffffffff) > (((Class75) aClass75_408).anInt557 ^ 0xffffffff))
				return anInt404 + 1;
			if ((i_7_ ^ 0xffffffff) > -1
					|| i_7_ >= -1 + Class98_Sub10_Sub1.aClass75Array5542.length)
				return 100;
			if ((anInt404 ^ 0xffffffff) == (((Class75) aClass75_408).anInt552 ^ 0xffffffff))
				return ((Class75) aClass75_408).anInt557;
			return ((Class75) aClass75_408).anInt552;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dga.B(" + i + ')');
		}
	}

	final void method448(boolean bool) {
		try {
			aBoolean400 = true;
			if (bool != false)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dga.M(" + bool
					+ ')');
		}
	}

	public static void method449(int i) {
		try {
			int i_8_ = -32 / ((i - 20) / 57);
			aClass113_399 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dga.H(" + i + ')');
		}
	}

	final int method450(byte i) {
		try {
			if (i != 3)
				return -56;
			return anInt401;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dga.D(" + i + ')');
		}
	}

	static final Class259[] method451(int i) {
		try {
			if (i < 118)
				aClass113_399 = null;
			if (PlayerUpdateMask.aClass259Array527 == null) {
				Class259[] class259s = Class52.method490(
						Class98_Sub43_Sub2.aClass88_5907, (byte) -68);
				Class259[] class259s_9_ = new Class259[class259s.length];
				int i_10_ = 0;
				int i_11_ = ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub16_4040
						.method614((byte) 123);
				while_55_: for (int i_12_ = 0; class259s.length > i_12_; i_12_++) {
					Class259 class259 = class259s[i_12_];
					if (((((Class259) class259).anInt1955 ^ 0xffffffff) >= -1 || ((((Class259) class259).anInt1955 ^ 0xffffffff) <= -25))
							&& ((Class259) class259).anInt1953 >= 800
							&& ((((Class259) class259).anInt1956 ^ 0xffffffff) <= -601)
							&& ((i_11_ ^ 0xffffffff) != -3 || (((Class259) class259).anInt1953 <= 800 && ((Class259) class259).anInt1956 <= 600))
							&& ((i_11_ ^ 0xffffffff) != -2 || (((Class259) class259).anInt1953 <= 1024 && (((Class259) class259).anInt1956 ^ 0xffffffff) >= -769))) {
						for (int i_13_ = 0; i_10_ > i_13_; i_13_++) {
							Class259 class259_14_ = class259s_9_[i_13_];
							if (((((Class259) class259_14_).anInt1953 ^ 0xffffffff) == (((Class259) class259).anInt1953 ^ 0xffffffff))
									&& ((((Class259) class259_14_).anInt1956 ^ 0xffffffff) == (((Class259) class259).anInt1956 ^ 0xffffffff))) {
								if (((Class259) class259).anInt1955 > ((Class259) class259_14_).anInt1955)
									class259s_9_[i_13_] = class259;
								continue while_55_;
							}
						}
						class259s_9_[i_10_] = class259;
						i_10_++;
					}
				}
				PlayerUpdateMask.aClass259Array527 = new Class259[i_10_];
				Class236.method2892(class259s_9_, 0,
						PlayerUpdateMask.aClass259Array527, 0, i_10_);
				int[] is = new int[PlayerUpdateMask.aClass259Array527.length];
				for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (PlayerUpdateMask.aClass259Array527.length ^ 0xffffffff)); i_15_++) {
					Class259 class259 = PlayerUpdateMask.aClass259Array527[i_15_];
					is[i_15_] = (((Class259) class259).anInt1956 * ((Class259) class259).anInt1953);
				}
				Class98_Sub46_Sub13_Sub1.method1597(is,
						PlayerUpdateMask.aClass259Array527, 0);
			}
			return PlayerUpdateMask.aClass259Array527;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dga.J(" + i + ')');
		}
	}

	final synchronized void method452(int i) {
		do {
			try {
				aBoolean397 = true;
				if (i == -7423)
					break;
				method442((byte) 77);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "dga.K(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public Class47() {
		/* empty */
	}
}
