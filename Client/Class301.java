/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Color;

final class Class301 {
	Class279 aClass279_2502;
	boolean aBoolean2503;
	private Class207 aClass207_2504;
	private Class79 aClass79_2505 = new Class79(64);
	Class207 aClass207_2506;
	static IncomingOpcode aClass58_2507 = new IncomingOpcode(100, 6);
	static Color[] aColorArray2508 = { new Color(9179409), new Color(3289650),
			new Color(3289650), new Color(3289650) };
	Class79 aClass79_2509 = new Class79(50);
	Class79 aClass79_2510 = new Class79(5);
	int anInt2511;

	final void method3534(int i) {
		try {
			synchronized (((Class301) this).aClass79_2509) {
				((Class301) this).aClass79_2509.method794(91);
			}
			if (i <= -22) {
				synchronized (((Class301) this).aClass79_2510) {
					((Class301) this).aClass79_2510.method794(43);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sha.A(" + i + ')');
		}
	}

	final void method3535(byte i) {
		try {
			if (i < -5) {
				synchronized (aClass79_2505) {
					aClass79_2505.method806((byte) 113);
				}
				synchronized (((Class301) this).aClass79_2509) {
					((Class301) this).aClass79_2509.method806((byte) -103);
				}
				synchronized (((Class301) this).aClass79_2510) {
					((Class301) this).aClass79_2510.method806((byte) -104);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sha.E(" + i + ')');
		}
	}

	public static void method3536(byte i) {
		do {
			try {
				aColorArray2508 = null;
				aClass58_2507 = null;
				if (i == -82)
					break;
				aColorArray2508 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "sha.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method3537(int i, byte i_0_, int i_1_, int i_2_,
			int i_3_, int i_4_) {
		do {
			try {
				if (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4066
						.method641((byte) 127) != 0
						&& i_2_ != 0
						&& (Class306.anInt2566 ^ 0xffffffff) > -51
						&& i_1_ != -1)
					Class245.aClass338Array1865[Class306.anInt2566++] = new Class338(
							(byte) 1, i_1_, i_2_, i_3_, i_4_, 0, i, null);
				if (i_0_ == 1)
					break;
				aClass58_2507 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("sha.B(" + i
						+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_
						+ ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	final NPC method3538(int i, int i_5_) {
		try {
			NPC class141;
			synchronized (aClass79_2505) {
				if (i != 5)
					method3536((byte) 88);
				class141 = (NPC) aClass79_2505.method802(-124, (long) i_5_);
			}
			if (class141 != null)
				return class141;
			byte[] is;
			synchronized (aClass207_2504) {
				is = (aClass207_2504.method2745(
						Class163.method2520(i_5_, (byte) 123),
						Class98_Sub46_Sub13_Sub2.method1598(i_5_, i + -22650),
						false));
			}
			class141 = new NPC();
			((NPC) class141).npcId = i_5_;
			((NPC) class141).aClass301_1133 = this;
			if (is != null)
				class141.method2297(new ByteBuffer(is), true);
			class141.method2295((byte) 70);
			synchronized (aClass79_2505) {
				aClass79_2505.method805((long) i_5_, class141, (byte) -80);
			}
			return class141;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sha.D(" + i + ','
					+ i_5_ + ')');
		}
	}

	final void method3539(int i, byte i_6_) {
		try {
			synchronized (aClass79_2505) {
				aClass79_2505.method800((byte) 62, i);
			}
			synchronized (((Class301) this).aClass79_2509) {
				((Class301) this).aClass79_2509.method800((byte) 62, i);
			}
			synchronized (((Class301) this).aClass79_2510) {
				int i_7_ = -30 % ((i_6_ - 57) / 63);
				((Class301) this).aClass79_2510.method800((byte) 62, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sha.H(" + i + ','
					+ i_6_ + ')');
		}
	}

	static final void method3540(int i) {
		try {
			if (i != -2)
				method3542(69);
			if (Class113.aClass143_953 != null) {
				if ((Class113.aClass143_953.anInt1163 ^ 0xffffffff) == -2)
					Class113.aClass143_953 = null;
				else if (Class113.aClass143_953.anInt1163 == 2) {
					Class98_Sub10_Sub32.method1097(-18871,
							Class246_Sub3_Sub4_Sub2_Sub1.aString6507,
							Class364.aClass88_3104, 2);
					Class113.aClass143_953 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sha.F(" + i + ')');
		}
	}

	final void method3541(boolean bool, int i) {
		try {
			((Class301) this).anInt2511 = i;
			synchronized (((Class301) this).aClass79_2509) {
				if (bool != true)
					method3539(127, (byte) -119);
				((Class301) this).aClass79_2509.method794(24);
			}
			synchronized (((Class301) this).aClass79_2510) {
				((Class301) this).aClass79_2510.method794(85);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sha.J(" + bool
					+ ',' + i + ')');
		}
	}

	static final void method3542(int i) {
		try {
			if (i != 50)
				aColorArray2508 = null;
			for (Class98_Sub36 class98_sub36 = ((Class98_Sub36) Class156_Sub1.aClass377_3277
					.method3998(97)); class98_sub36 != null; class98_sub36 = ((Class98_Sub36) Class156_Sub1.aClass377_3277
					.method3995(-1)))
				Class98_Sub11.method1127((byte) 67,
						(((Class98_Sub36) class98_sub36).anInt4160));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sha.L(" + i + ')');
		}
	}

	static final void method3543(int i) {
		try {
			if (i != 16535)
				aColorArray2508 = null;
			Class315.aClient3529.method80(0);
			Class49.method477(-5788);
			Class98_Sub10_Sub6.anInt5569 = 0;
			((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).position = 0;
			Class224_Sub1.anInt5031 = 0;
			Class98_Sub10_Sub21.aClass58_5641 = null;
			Class98_Sub30.aClass58_4094 = null;
			Class260.aClass58_3262 = null;
			Class191.method2650((byte) -126);
			Class314.anInt2692 = 0;
			Class153.aString1229 = null;
			Class374.aClass147Array3157 = null;
			Class98_Sub28.anInt4078 = 0;
			Class32.anInt308 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sha.I(" + i + ')');
		}
	}

	final void method3544(byte i) {
		try {
			if (i == 1) {
				synchronized (aClass79_2505) {
					aClass79_2505.method794(67);
				}
				synchronized (((Class301) this).aClass79_2509) {
					((Class301) this).aClass79_2509.method794(i + 119);
				}
				synchronized (((Class301) this).aClass79_2510) {
					((Class301) this).aClass79_2510.method794(i + 59);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sha.G(" + i + ')');
		}
	}

	final void method3545(int i, boolean bool) {
		try {
			if (i != 9179409)
				aColorArray2508 = null;
			if (bool != ((Class301) this).aBoolean2503) {
				((Class301) this).aBoolean2503 = bool;
				method3544((byte) 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sha.K(" + i + ','
					+ bool + ')');
		}
	}

	Class301(Class279 class279, int i, boolean bool, Class207 class207,
			Class207 class207_8_) {
		do {
			try {
				aClass207_2504 = class207;
				((Class301) this).aClass207_2506 = class207_8_;
				((Class301) this).aBoolean2503 = bool;
				((Class301) this).aClass279_2502 = class279;
				if (aClass207_2504 == null)
					break;
				int i_9_ = aClass207_2504.method2752((byte) -11) - 1;
				aClass207_2504.method2761(0, i_9_);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27
						.printError(runtimeexception,
								("sha.<init>("
										+ (class279 != null ? "{...}" : "null")
										+ ','
										+ i
										+ ','
										+ bool
										+ ','
										+ (class207 != null ? "{...}" : "null")
										+ ','
										+ (class207_8_ != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}
}
