/* Class98_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.hardware_info.HardwareInfo;

import java.awt.Rectangle;

final class Class98_Sub35 extends Node {
	int anInt4129;
	private int anInt4130;
	private String aString4131;
	private boolean aBoolean4132;
	private int anInt4133;
	private int anInt4134;
	private String aString4135;
	private int anInt4136;
	private int anInt4137;
	private boolean aBoolean4138;
	private int anInt4139;
	private int anInt4140;
	private int anInt4141;
	private int anInt4142;
	private String aString4143;
	static Rectangle[] aRectangleArray4144 = new Rectangle[100];
	private int anInt4145;
	private String aString4146;
	private int anInt4147;
	private int anInt4148;
	private int anInt4149;
	private int anInt4150;
	static Class63 aClass63_4151;

	static final void method1452(final int i) {
		try {
			Class98_Sub37.aHa4185
					.xa(1.1523438F * (0.7F + 0.1F * Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub19_4057
							.method630((byte) 122)));
			Class98_Sub37.aHa4185.ZA(Class299_Sub2.anInt5298, 0.69921875F,
					1.2F, -200.0F, -240.0F, -200.0F);
			Class98_Sub37.aHa4185.L(Class189.anInt1455, -1, i);
			Class98_Sub37.aHa4185.method1775(Class246_Sub7.aClass48_5119);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pg.E(" + i + ')');
		}
	}

	final void method1453(final byte i, final ByteBuffer class98_sub22) {
		try {
			class98_sub22.method1194(5, i + -104);
			class98_sub22.method1194(anInt4147, -115);
			class98_sub22.method1194(!aBoolean4132 ? 0 : 1, 85);
			class98_sub22.method1194(anInt4133, i + -137);
			if (i != 17) {
				method1452(-7);
			}
			class98_sub22.method1194(anInt4136, 95);
			class98_sub22.method1194(anInt4137, 114);
			class98_sub22.method1194(anInt4148, i ^ 0x26);
			class98_sub22.method1194(anInt4142, -36);
			class98_sub22.method1194(!aBoolean4138 ? 0 : 1, i ^ 0x63);
			class98_sub22.writeShort(anInt4139, 1571862888);
			class98_sub22.method1194(anInt4145, -36);
			class98_sub22.method1225(-24472, anInt4129);
			class98_sub22.writeShort(anInt4150, i + 1571862871);
			class98_sub22.method1194(anInt4141, -101);
			class98_sub22.method1194(anInt4149, 114);
			class98_sub22.method1194(anInt4140, -128);
			class98_sub22.method1181(aString4131, -1);
			class98_sub22.method1181(aString4143, -1);
			class98_sub22.method1181(aString4146, -1);
			class98_sub22.method1181(aString4135, -1);
			class98_sub22.method1194(anInt4130, -76);
			class98_sub22.writeShort(anInt4134, 1571862888);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pg.D(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1454(final int i) {
		do {
			try {
				if (i < -6) {
					if ((aString4131.length() ^ 0xffffffff) < -41) {
						aString4131 = aString4131.substring(0, 40);
					}
					if ((aString4143.length() ^ 0xffffffff) < -41) {
						aString4143 = aString4143.substring(0, 40);
					}
					if (aString4146.length() > 10) {
						aString4146 = aString4146.substring(0, 10);
					}
					if ((aString4135.length() ^ 0xffffffff) >= -11) {
						break;
					}
					aString4135 = aString4135.substring(0, 10);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "pg.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final int method1455(final byte i) {
		try {
			if (i < 112) {
				return -52;
			}
			int i_0_ = 23;
			i_0_ += Class98_Sub26.method1275(aString4131, false);
			i_0_ += Class98_Sub26.method1275(aString4143, false);
			i_0_ += Class98_Sub26.method1275(aString4146, false);
			i_0_ += Class98_Sub26.method1275(aString4135, false);
			return i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pg.B(" + i + ')');
		}
	}

	public static void method1456(final boolean bool) {
		try {
			if (bool != false) {
				aRectangleArray4144 = null;
			}
			aRectangleArray4144 = null;
			aClass63_4151 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pg.A(" + bool
					+ ')');
		}
	}

	public Class98_Sub35() {
		/* empty */
	}

	Class98_Sub35(final boolean bool, final Class88 class88) {
		try {
			if (bool) {
				if (!Class88.aString699.startsWith("win")) {
					if (Class88.aString699.startsWith("mac")) {
						anInt4147 = 2;
					} else if (Class88.aString699.startsWith("linux")) {
						anInt4147 = 3;
					} else {
						anInt4147 = 4;
					}
				} else {
					anInt4147 = 1;
				}
				if (!Class88.aString690.startsWith("amd64")
						&& !Class88.aString690.startsWith("x86_64")) {
					aBoolean4132 = false;
				} else {
					aBoolean4132 = true;
				}
				if ((anInt4147 ^ 0xffffffff) == -2) {
					if (Class88.aString676.indexOf("4.0") == -1) {
						if ((Class88.aString676.indexOf("4.1") ^ 0xffffffff) != 0) {
							anInt4133 = 2;
						} else if ((Class88.aString676.indexOf("4.9") ^ 0xffffffff) != 0) {
							anInt4133 = 3;
						} else if (Class88.aString676.indexOf("5.0") == -1) {
							if (Class88.aString676.indexOf("5.1") == -1) {
								if (Class88.aString676.indexOf("6.0") == -1) {
									if (Class88.aString676.indexOf("6.1") != -1) {
										anInt4133 = 7;
									}
								} else {
									anInt4133 = 6;
								}
							} else {
								anInt4133 = 5;
							}
						} else {
							anInt4133 = 4;
						}
					} else {
						anInt4133 = 1;
					}
				} else if (anInt4147 == 2) {
					if ((Class88.aString676.indexOf("10.4") ^ 0xffffffff) != 0) {
						anInt4133 = 20;
					} else if ((Class88.aString676.indexOf("10.5") ^ 0xffffffff) == 0) {
						if (Class88.aString676.indexOf("10.6") != -1) {
							anInt4133 = 22;
						}
					} else {
						anInt4133 = 21;
					}
				}
				if ((Class88.aString696.toLowerCase().indexOf("sun") ^ 0xffffffff) != 0) {
					anInt4136 = 1;
				} else if ((Class88.aString696.toLowerCase().indexOf(
						"microsoft") ^ 0xffffffff) != 0) {
					anInt4136 = 2;
				} else if (Class88.aString696.toLowerCase().indexOf("apple") == -1) {
					anInt4136 = 4;
				} else {
					anInt4136 = 3;
				}
				int i = 2;
				int i_1_ = 0;
				try {
					while (i < Class88.aString692.length()) {
						final int i_2_ = Class88.aString692.charAt(i);
						if (i_2_ < 48 || i_2_ > 57) {
							break;
						}
						i++;
						i_1_ = 10 * i_1_ + (i_2_ - 48);
					}
				} catch (final Exception exception) {
					/* empty */
				}
				anInt4137 = i_1_;
				i = 1 + Class88.aString692.indexOf('.', 2);
				i_1_ = 0;
				try {
					while (Class88.aString692.length() > i) {
						final int i_3_ = Class88.aString692.charAt(i);
						if ((i_3_ ^ 0xffffffff) > -49 || i_3_ > 57) {
							break;
						}
						i++;
						i_1_ = -48 - -i_3_ + 10 * i_1_;
					}
				} catch (final Exception exception) {
					/* empty */
				}
				anInt4148 = i_1_;
				i = Class88.aString692.indexOf('_', 4) - -1;
				i_1_ = 0;
				try {
					for (/**/; Class88.aString692.length() > i; i++) {
						final int i_4_ = Class88.aString692.charAt(i);
						if ((i_4_ ^ 0xffffffff) > -49 || i_4_ > 57) {
							break;
						}
						i_1_ = i_4_ + (-48 + i_1_ * 10);
					}
				} catch (final Exception exception) {
					/* empty */
				}
				anInt4142 = i_1_;
				anInt4139 = Class292.anInt3359;
				if (!class88.aBoolean682) {
					aBoolean4138 = true;
				} else {
					aBoolean4138 = false;
				}
				if (anInt4137 <= 3) {
					anInt4145 = 0;
				} else {
					anInt4145 = Class98_Sub46_Sub19.anInt6065;
				}
				try {
					final int[] is = HardwareInfo.getCPUInfo();
					if (is != null && (is.length ^ 0xffffffff) == -8) {
						anInt4149 = is[4];
						anInt4140 = is[5];
						anInt4141 = is[3];
						anInt4129 = is[6];
						anInt4150 = is[2];
					}
				} catch (final Throwable throwable) {
					// Class305_Sub1.method3585(throwable, -121,
					// (throwable.getMessage()
					// + " (Recovered)"));
					anInt4129 = 0;
				}
			}
			if (aString4135 == null) {
				aString4135 = "";
			}
			if (aString4143 == null) {
				aString4143 = "";
			}
			if (aString4131 == null) {
				aString4131 = "";
			}
			if (aString4146 == null) {
				aString4146 = "";
			}
			method1454(-120);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pg.<init>("
					+ bool + ',' + (class88 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		for (int i = 0; i < 100; i++) {
			aRectangleArray4144[i] = new Rectangle();
		}
		aClass63_4151 = new Class63();
	}
}
