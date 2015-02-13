/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

final class Class149 {
	static Calendar aCalendar1200 = Calendar.getInstance(TimeZone
			.getTimeZone("GMT"));
	private char aChar1201;
	int anInt1202;
	String aString1203;
	boolean aBoolean1204 = true;
	static Class83 aClass83_1205;
	static Class204 aClass204_1206 = new Class204();
	static IncomingOpcode aClass58_1207 = new IncomingOpcode(53, -1);
	static int anInt1208;

	static final void method2430(final ByteBuffer class98_sub22, final byte i) {
		try {
			final byte[] is = new byte[24];
			if (i == 0) {
				if (Class195.aClass225_1502 != null) {
					try {
						Class195.aClass225_1502.method2846(0L, 0);
						Class195.aClass225_1502.method2842(is, i);
						int i_0_;
						for (i_0_ = 0; i_0_ < 24; i_0_++) {
							if ((is[i_0_] ^ 0xffffffff) != -1) {
								break;
							}
						}
						if (i_0_ >= 24) {
							throw new IOException();
						}
					} catch (final Exception exception) {
						for (int i_1_ = 0; i_1_ < 24; i_1_++) {
							is[i_1_] = (byte) -1;
						}
					}
				}
				class98_sub22.method1217(is, 24, -1, 0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("kc.D(" + (class98_sub22 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	final void method2431(final ByteBuffer class98_sub22, final int i) {
		try {
			if (i != -1) {
				aClass83_1205 = null;
			}
			for (;;) {
				final int i_2_ = class98_sub22.readUnsignedByte((byte) 5);
				if (i_2_ == 0) {
					break;
				}
				method2434(i_2_, class98_sub22, 1);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("kc.A(" + (class98_sub22 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	public static void method2432(final int i) {
		try {
			aClass58_1207 = null;
			aClass204_1206 = null;
			if (i == 0) {
				aClass83_1205 = null;
				aCalendar1200 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kc.F(" + i + ')');
		}
	}

	final boolean method2433(final boolean bool) {
		try {
			if (bool != false) {
				return false;
			}
			if ((aChar1201 ^ 0xffffffff) != -116) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kc.C(" + bool
					+ ')');
		}
	}

	private final void method2434(final int i,
			final ByteBuffer class98_sub22, final int i_3_) {
		do {
			try {
				if (i_3_ == i) {
					aChar1201 = Class64_Sub7.method576(
							class98_sub22.readSignedByte((byte) -19),
							(byte) 127);
				} else if (i == 2) {
					anInt1202 = class98_sub22.readInt(-2);
				} else if (i == 4) {
					aBoolean1204 = false;
				} else {
					if ((i ^ 0xffffffff) != -6) {
						break;
					}
					aString1203 = class98_sub22.readString((byte) 84);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("kc.E(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method2435(final int i, final int i_4_, final int i_5_) {
		try {
			if (i_4_ < 78) {
				aClass83_1205 = null;
			}
			final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4.method3023(
					260, Class151_Sub1.aClass171_4968, Class331.aClass117_2811);
			class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(i, (byte) 126);
			class98_sub11.aClass98_Sub22_Sub1_3865.writeLEInt(i_5_, 1046032984);
			Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kc.B(" + i + ','
					+ i_4_ + ',' + i_5_ + ')'));
		}
	}

	public Class149() {
		/* empty */
	}
}
