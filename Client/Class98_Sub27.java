/* Class98_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;

final class Class98_Sub27 extends Node {
	Class64_Sub6 aClass64_Sub6_4033;
	Class64_Sub15 aClass64_Sub15_4034;
	Class64_Sub26 aClass64_Sub26_4035;
	private Class145 aClass145_4036;
	Class64_Sub21 aClass64_Sub21_4037;
	Class64_Sub11 aClass64_Sub11_4038;
	Class64_Sub25 aClass64_Sub25_4039;
	Class64_Sub16 aClass64_Sub16_4040;
	Class64_Sub3 aClass64_Sub3_4041;
	Class64_Sub8 aClass64_Sub8_4042;
	Class64_Sub1 aClass64_Sub1_4043;
	Class64_Sub23 aClass64_Sub23_4044;
	static OutgoingOpcode aClass171_4045 = new OutgoingOpcode(59, 2);
	Class64_Sub17 aClass64_Sub17_4046;
	Class64_Sub24 aClass64_Sub24_4047;
	Class64_Sub12 aClass64_Sub12_4048;
	Class64_Sub14 aClass64_Sub14_4049;
	Class64_Sub29 aClass64_Sub29_4050;
	Class64_Sub22 aClass64_Sub22_4051;
	Class64_Sub27 aClass64_Sub27_4052;
	Class64_Sub4 aClass64_Sub4_4053;
	Class64_Sub22 aClass64_Sub22_4054;
	Class64_Sub23 aClass64_Sub23_4055;
	Class64_Sub20 aClass64_Sub20_4056;
	Class64_Sub19 aClass64_Sub19_4057;
	Class64_Sub15 aClass64_Sub15_4058;
	private Class279 aClass279_4059;
	static int anInt4060;
	Class64_Sub2 aClass64_Sub2_4061;
	Class64_Sub8 aClass64_Sub8_4062;
	Class64_Sub13 aClass64_Sub13_4063;
	Class64_Sub28 aClass64_Sub28_4064;
	Class64_Sub5 aClass64_Sub5_4065;
	Class64_Sub22 aClass64_Sub22_4066;
	Class64_Sub9 aClass64_Sub9_4067;
	Class64_Sub27 aClass64_Sub27_4068;
	Class64_Sub22 aClass64_Sub22_4069;
	Class64_Sub10 aClass64_Sub10_4070;
	Class64_Sub18 aClass64_Sub18_4071;
	Class64_Sub22 aClass64_Sub22_4072;
	Class64_Sub7 aClass64_Sub7_4073;
	static Class350 aClass350_4074 = new Class350(1);
	static byte[] aByteArray4075 = new byte[2048];
	Class64_Sub3 aClass64_Sub3_4076;
	/* synthetic */static Class aClass4077;

	public static void method1280(final boolean bool) {
		do {
			try {
				aClass350_4074 = null;
				aByteArray4075 = null;
				aClass171_4045 = null;
				if (bool == true) {
					break;
				}
				anInt4060 = 95;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "kda.L(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	private final void method1281(final ByteBuffer class98_sub22,
			final int i, final int i_0_) {
		do {
			try {
				aClass64_Sub19_4057 = new Class64_Sub19(
						class98_sub22.readUnsignedByte((byte) -109), this);
				aClass64_Sub3_4041 = new Class64_Sub3(
						class98_sub22.readUnsignedByte((byte) 107), this);
				aClass64_Sub15_4034 = new Class64_Sub15(
						1 + class98_sub22.readUnsignedByte((byte) 3), this);
				aClass64_Sub11_4038 = new Class64_Sub11(
						class98_sub22.readUnsignedByte((byte) 14), this);
				aClass64_Sub9_4067 = new Class64_Sub9(
						class98_sub22.readUnsignedByte((byte) 29), this);
				aClass64_Sub24_4047 = new Class64_Sub24(
						class98_sub22.readUnsignedByte((byte) -119), this);
				aClass64_Sub13_4063 = new Class64_Sub13(
						class98_sub22.readUnsignedByte((byte) 53), this);
				class98_sub22.readUnsignedByte((byte) 5);
				aClass64_Sub26_4035 = new Class64_Sub26(
						class98_sub22.readUnsignedByte((byte) -113), this);
				final int i_1_ = class98_sub22.readUnsignedByte((byte) -5);
				int i_2_ = 0;
				if ((i ^ 0xffffffff) <= -18) {
					i_2_ = class98_sub22.readUnsignedByte((byte) -114);
				}
				aClass64_Sub7_4073 = new Class64_Sub7(
						((i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff) ? i_1_
								: i_2_), this);
				boolean bool = true;
				boolean bool_3_ = true;
				if ((i ^ 0xffffffff) <= -3) {
					bool = ((class98_sub22.readUnsignedByte((byte) 77) ^ 0xffffffff) == -2);
					if (i >= 17) {
						bool_3_ = class98_sub22.readUnsignedByte((byte) -128) == 1;
					}
				} else {
					bool = (class98_sub22.readUnsignedByte((byte) -112) ^ 0xffffffff) == -2;
					class98_sub22.readUnsignedByte((byte) -98);
				}
				aClass64_Sub10_4070 = new Class64_Sub10(!(bool | bool_3_) ? 0
						: 1, this);
				aClass64_Sub28_4064 = new Class64_Sub28(
						class98_sub22.readUnsignedByte((byte) -126), this);
				aClass64_Sub14_4049 = new Class64_Sub14(
						class98_sub22.readUnsignedByte((byte) -101), this);
				aClass64_Sub23_4044 = new Class64_Sub23(
						class98_sub22.readUnsignedByte((byte) 11), this);
				aClass64_Sub1_4043 = new Class64_Sub1(
						class98_sub22.readUnsignedByte((byte) 80), this);
				aClass64_Sub22_4066 = new Class64_Sub22(
						class98_sub22.readUnsignedByte((byte) -119), this);
				if (i >= 20) {
					aClass64_Sub22_4054 = new Class64_Sub22(
							class98_sub22.readUnsignedByte((byte) -115), this);
				} else {
					aClass64_Sub22_4054 = new Class64_Sub22(
							aClass64_Sub22_4066.method641((byte) 124), this);
				}
				aClass64_Sub22_4069 = new Class64_Sub22(
						class98_sub22.readUnsignedByte((byte) 81), this);
				aClass64_Sub22_4051 = new Class64_Sub22(
						class98_sub22.readUnsignedByte((byte) 10), this);
				if ((i ^ 0xffffffff) <= -22) {
					aClass64_Sub22_4072 = new Class64_Sub22(
							class98_sub22.readUnsignedByte((byte) 42), this);
				} else {
					aClass64_Sub22_4072 = new Class64_Sub22(
							aClass64_Sub22_4069.method641((byte) 125), this);
				}
				if (i >= 1) {
					class98_sub22.readUnsignedShort((byte) 127);
					class98_sub22.readUnsignedShort((byte) 127);
				}
				if ((i ^ 0xffffffff) <= -4 && i < 6) {
					class98_sub22.readUnsignedByte((byte) -114);
				}
				if (i_0_ != 4311) {
					method1281(null, -107, -6);
				}
				if ((i ^ 0xffffffff) <= -5) {
					aClass64_Sub6_4033 = new Class64_Sub6(
							class98_sub22.readUnsignedByte((byte) 35), this);
				}
				class98_sub22.readInt(-2);
				if (i >= 6) {
					aClass64_Sub27_4052 = new Class64_Sub27(
							class98_sub22.readUnsignedByte((byte) 123), this);
				}
				if ((i ^ 0xffffffff) <= -8) {
					aClass64_Sub2_4061 = new Class64_Sub2(
							class98_sub22.readUnsignedByte((byte) 35), this);
				}
				if ((i ^ 0xffffffff) <= -9) {
					class98_sub22.readUnsignedByte((byte) -120);
				}
				if ((i ^ 0xffffffff) <= -10) {
					aClass64_Sub17_4046 = new Class64_Sub17(
							class98_sub22.readUnsignedByte((byte) -121), this);
				}
				if (i >= 10) {
					aClass64_Sub5_4065 = new Class64_Sub5(
							class98_sub22.readUnsignedByte((byte) 79), this);
				}
				if (i >= 11) {
					aClass64_Sub29_4050 = new Class64_Sub29(
							class98_sub22.readUnsignedByte((byte) 47), this);
				}
				if ((i ^ 0xffffffff) <= -13) {
					aClass64_Sub24_4047 = new Class64_Sub24(
							class98_sub22.readUnsignedByte((byte) -115), this);
				}
				if ((i ^ 0xffffffff) <= -14) {
					aClass64_Sub25_4039 = new Class64_Sub25(
							class98_sub22.readUnsignedByte((byte) 39), this);
				}
				if ((i ^ 0xffffffff) <= -15) {
					aClass64_Sub8_4062 = new Class64_Sub8(
							class98_sub22.readUnsignedByte((byte) -115), this);
				}
				if ((i ^ 0xffffffff) <= -16) {
					aClass64_Sub21_4037 = new Class64_Sub21(
							class98_sub22.readUnsignedByte((byte) -115), this);
				}
				if (i >= 16) {
					aClass64_Sub20_4056 = new Class64_Sub20(
							class98_sub22.readUnsignedByte((byte) 24), this);
				}
				if ((i ^ 0xffffffff) <= -19) {
					aClass64_Sub12_4048 = new Class64_Sub12(
							class98_sub22.readUnsignedByte((byte) -100), this);
				}
				if (i >= 19) {
					aClass64_Sub16_4040 = new Class64_Sub16(
							class98_sub22.readUnsignedByte((byte) -110), this);
				}
				if ((i ^ 0xffffffff) > -23) {
					break;
				}
				aClass64_Sub4_4053 = new Class64_Sub4(
						class98_sub22.readUnsignedByte((byte) 120), this);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("kda.I("
						+ (class98_sub22 != null ? "{...}" : "null") + ',' + i
						+ ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1282(final byte i, final int i_4_) {
		try {
			if (i_4_ != ByteBuffer.anInt3994) {
				Class165.anInt1276 = Class98_Sub10_Sub7.anInt5572 = Class246_Sub3_Sub4_Sub5.anIntArray6265[i_4_];
				Class98_Sub10_Sub34.method1104(112);
				Class170.anIntArrayArrayArray1311 = (new int[4][Class165.anInt1276 >> -762838077][Class98_Sub10_Sub7.anInt5572 >> -755805021]);
				Class372.anIntArrayArray3149 = (new int[Class165.anInt1276][Class98_Sub10_Sub7.anInt5572]);
				Class64_Sub28.anIntArrayArray3719 = (new int[Class165.anInt1276][Class98_Sub10_Sub7.anInt5572]);
				for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -5; i_5_++) {
					Class167.aClass243Array1281[i_5_] = Class299.method3509(
							2742, Class98_Sub10_Sub7.anInt5572,
							Class165.anInt1276);
				}
				OutputStream_Sub2.aByteArrayArrayArray41 = (new byte[4][Class165.anInt1276][Class98_Sub10_Sub7.anInt5572]);
				Class322.method3673(Class98_Sub10_Sub7.anInt5572,
						Class165.anInt1276, 4, true);
				Class159.method2508(Class165.anInt1276 >> 2012820739,
						Class98_Sub10_Sub7.anInt5572 >> 1345943043, (byte) -50,
						Class265.aHa1974);
				if (i != 8) {
					method1284(43);
				}
				ByteBuffer.anInt3994 = i_4_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kda.M(" + i + ','
					+ i_4_ + ')');
		}
	}

	private final void method1283(final boolean bool, final int i) {
		try {
			if (bool || aClass64_Sub23_4044 == null) {
				aClass64_Sub23_4044 = new Class64_Sub23(this);
			}
			if (bool || aClass64_Sub23_4055 == null) {
				aClass64_Sub23_4055 = new Class64_Sub23(
						aClass64_Sub23_4044.method648((byte) 125), this);
			}
			if (bool || aClass64_Sub5_4065 == null) {
				aClass64_Sub5_4065 = new Class64_Sub5(this);
			}
			if (bool || aClass64_Sub19_4057 == null) {
				aClass64_Sub19_4057 = new Class64_Sub19(this);
			}
			if (bool || aClass64_Sub17_4046 == null) {
				aClass64_Sub17_4046 = new Class64_Sub17(this);
			}
			if (bool || aClass64_Sub13_4063 == null) {
				aClass64_Sub13_4063 = new Class64_Sub13(this);
			}
			if (bool || aClass64_Sub14_4049 == null) {
				aClass64_Sub14_4049 = new Class64_Sub14(this);
			}
			if (bool || aClass64_Sub25_4039 == null) {
				aClass64_Sub25_4039 = new Class64_Sub25(this);
			}
			if (bool || aClass64_Sub11_4038 == null) {
				aClass64_Sub11_4038 = new Class64_Sub11(this);
			}
			if (bool || aClass64_Sub24_4047 == null) {
				aClass64_Sub24_4047 = new Class64_Sub24(this);
			}
			if (bool || aClass64_Sub10_4070 == null) {
				aClass64_Sub10_4070 = new Class64_Sub10(this);
			}
			if (bool || aClass64_Sub7_4073 == null) {
				aClass64_Sub7_4073 = new Class64_Sub7(this);
			}
			if (bool || aClass64_Sub18_4071 == null) {
				aClass64_Sub18_4071 = new Class64_Sub18(this);
			}
			if (bool || aClass64_Sub6_4033 == null) {
				aClass64_Sub6_4033 = new Class64_Sub6(this);
			}
			if (bool || aClass64_Sub15_4034 == null) {
				aClass64_Sub15_4034 = new Class64_Sub15(this);
			}
			if (bool || aClass64_Sub15_4058 == null) {
				aClass64_Sub15_4058 = new Class64_Sub15(
						aClass64_Sub15_4034.method612((byte) 120), this);
			}
			if (bool || aClass64_Sub16_4040 == null) {
				aClass64_Sub16_4040 = new Class64_Sub16(this);
			}
			if (bool || aClass64_Sub26_4035 == null) {
				aClass64_Sub26_4035 = new Class64_Sub26(this);
			}
			if (bool || aClass64_Sub9_4067 == null) {
				aClass64_Sub9_4067 = new Class64_Sub9(this);
			}
			if (bool || aClass64_Sub20_4056 == null) {
				aClass64_Sub20_4056 = new Class64_Sub20(this);
			}
			if (bool || aClass64_Sub8_4062 == null) {
				aClass64_Sub8_4062 = new Class64_Sub8(this);
			}
			if (bool || aClass64_Sub8_4042 == null) {
				aClass64_Sub8_4042 = new Class64_Sub8(
						aClass64_Sub8_4062.method583((byte) 125), this);
			}
			if (bool || aClass64_Sub3_4041 == null) {
				aClass64_Sub3_4041 = new Class64_Sub3(this);
			}
			if (bool || aClass64_Sub3_4076 == null) {
				aClass64_Sub3_4076 = new Class64_Sub3(
						aClass64_Sub3_4041.method564((byte) 121), this);
			}
			if (bool || aClass64_Sub28_4064 == null) {
				aClass64_Sub28_4064 = new Class64_Sub28(this);
			}
			if (bool || aClass64_Sub27_4052 == null) {
				aClass64_Sub27_4052 = new Class64_Sub27(this);
			}
			if (bool || aClass64_Sub27_4068 == null) {
				aClass64_Sub27_4068 = new Class64_Sub27(
						aClass64_Sub27_4052.method666((byte) 127), this);
			}
			if (bool || aClass64_Sub29_4050 == null) {
				aClass64_Sub29_4050 = new Class64_Sub29(this);
			}
			if (bool || aClass64_Sub12_4048 == null) {
				aClass64_Sub12_4048 = new Class64_Sub12(this);
			}
			if (bool || aClass64_Sub21_4037 == null) {
				aClass64_Sub21_4037 = new Class64_Sub21(this);
			}
			if (bool || aClass64_Sub4_4053 == null) {
				aClass64_Sub4_4053 = new Class64_Sub4(this);
			}
			if (i == 0) {
				if (bool || aClass64_Sub2_4061 == null) {
					aClass64_Sub2_4061 = new Class64_Sub2(this);
				}
				if (bool || aClass64_Sub22_4066 == null) {
					aClass64_Sub22_4066 = new Class64_Sub22(this);
				}
				if (bool || aClass64_Sub22_4051 == null) {
					aClass64_Sub22_4051 = new Class64_Sub22(this);
				}
				if (bool || aClass64_Sub22_4054 == null) {
					aClass64_Sub22_4054 = new Class64_Sub22(this);
				}
				if (bool || aClass64_Sub22_4069 == null) {
					aClass64_Sub22_4069 = new Class64_Sub22(this);
				}
				if (bool || aClass64_Sub22_4072 == null) {
					aClass64_Sub22_4072 = new Class64_Sub22(this);
				}
				if (bool || aClass64_Sub1_4043 == null) {
					aClass64_Sub1_4043 = new Class64_Sub1(this);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kda.E(" + bool
					+ ',' + i + ')');
		}
	}

	static final void method1284(final int i) {
		try {
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4041));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4076));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 2,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub15_4034));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 2,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub15_4058));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub25_4039));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub24_4047));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub13_4063));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub26_4035));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub20_4056));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 2,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub7_4073));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub10_4070));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 2,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub28_4064));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 1,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub14_4049));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub23_4044));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub23_4055));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 2,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub6_4033));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub17_4046));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub5_4065));
			Class151_Sub1.method2450((byte) 106);
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 0,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub16_4040));
			Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, 4,
					(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub12_4048));
			Class98_Sub46_Sub13_Sub1.method1593((byte) 110);
			Class374.method3980((byte) 125);
			Class33.aBoolean316 = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kda.A(" + i + ')');
		}
	}

	final void method1285(final byte i, final int i_6_, final Class64 class64) {
		try {
			if (i != -13) {
				aClass64_Sub17_4046 = null;
			}
			class64.method554(i_6_, i + 9861);
			method1287(false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("kda.C(" + i + ','
					+ i_6_ + ',' + (class64 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class279 method1286(final byte i) {
		try {
			if (i != 104) {
				aClass64_Sub26_4035 = null;
			}
			return aClass279_4059;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kda.D(" + i + ')');
		}
	}

	private final void method1287(final boolean bool) {
		try {
			try {
				final Field[] fields = this.getClass().getDeclaredFields();
				final Field[] fields_7_ = fields;
				for (int i = 0; i < fields_7_.length; i++) {
					final Field field = fields_7_[i];
					if ((aClass4077 != null ? aClass4077
							: (aClass4077 = method1293("Class64")))
							.isAssignableFrom(field.getType())) {
						final Class64 class64 = (Class64) field.get(this);
						class64.method551((byte) 119);
					}
				}
				if (bool != false) {
					aClass279_4059 = null;
				}
			} catch (final IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kda.B(" + bool
					+ ')');
		}
	}

	final ByteBuffer method1288(final boolean bool) {
		try {
			final ByteBuffer class98_sub22 = new ByteBuffer(
					Class269.method3270(97));
			class98_sub22.method1194(24, -51);
			class98_sub22.method1194(aClass64_Sub23_4044.method648((byte) 125),
					126);
			class98_sub22.method1194(aClass64_Sub5_4065.method570((byte) 122),
					92);
			class98_sub22.method1194(aClass64_Sub19_4057.method630((byte) 123),
					48);
			class98_sub22.method1194(aClass64_Sub17_4046.method617((byte) 126),
					-116);
			class98_sub22.method1194(aClass64_Sub13_4063.method602((byte) 122),
					85);
			class98_sub22.method1194(aClass64_Sub14_4049.method609((byte) 124),
					-44);
			class98_sub22.method1194(aClass64_Sub25_4039.method655((byte) 121),
					124);
			class98_sub22.method1194(aClass64_Sub11_4038.method596((byte) 121),
					-49);
			class98_sub22.method1194(aClass64_Sub24_4047.method651((byte) 123),
					114);
			class98_sub22.method1194(aClass64_Sub10_4070.method592((byte) 122),
					-68);
			class98_sub22.method1194(aClass64_Sub7_4073.method579((byte) 122),
					-124);
			class98_sub22.method1194(aClass64_Sub18_4071.method627((byte) 122),
					-77);
			class98_sub22.method1194(aClass64_Sub6_4033.method572((byte) 122),
					40);
			if (bool != true) {
				return null;
			}
			class98_sub22.method1194(aClass64_Sub15_4034.method612((byte) 122),
					-112);
			class98_sub22.method1194(aClass64_Sub16_4040.method614((byte) 120),
					77);
			class98_sub22.method1194(aClass64_Sub26_4035.method662((byte) 122),
					-99);
			class98_sub22.method1194(aClass64_Sub9_4067.method588((byte) 121),
					-86);
			class98_sub22.method1194(aClass64_Sub20_4056.method634((byte) 127),
					-119);
			class98_sub22.method1194(aClass64_Sub8_4062.method583((byte) 125),
					47);
			class98_sub22.method1194(aClass64_Sub3_4041.method564((byte) 124),
					-103);
			class98_sub22.method1194(aClass64_Sub28_4064.method668((byte) 122),
					-104);
			class98_sub22.method1194(aClass64_Sub27_4052.method666((byte) 125),
					43);
			class98_sub22.method1194(aClass64_Sub29_4050.method677((byte) 127),
					50);
			class98_sub22.method1194(aClass64_Sub12_4048.method600((byte) 122),
					66);
			class98_sub22.method1194(aClass64_Sub21_4037.method639((byte) 126),
					-53);
			class98_sub22.method1194(aClass64_Sub4_4053.method568((byte) 120),
					115);
			class98_sub22.method1194(aClass64_Sub2_4061.method560((byte) 126),
					111);
			class98_sub22.method1194(aClass64_Sub22_4066.method641((byte) 124),
					-81);
			class98_sub22.method1194(aClass64_Sub22_4051.method641((byte) 120),
					47);
			class98_sub22.method1194(aClass64_Sub22_4054.method641((byte) 125),
					-54);
			class98_sub22.method1194(aClass64_Sub22_4069.method641((byte) 122),
					-101);
			class98_sub22.method1194(aClass64_Sub22_4072.method641((byte) 121),
					118);
			class98_sub22.method1194(aClass64_Sub1_4043.method558((byte) 121),
					-97);
			return class98_sub22;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kda.K(" + bool
					+ ')');
		}
	}

	final Class145 method1289(final int i) {
		try {
			if (i >= -95) {
				method1280(true);
			}
			return aClass145_4036;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kda.J(" + i + ')');
		}
	}

	private final void method1290(final ByteBuffer class98_sub22, final int i) {
		try {
			if (class98_sub22 != null && class98_sub22.incomingBytes != null) {
				final int i_8_ = class98_sub22.readUnsignedByte((byte) -127);
				if (i_8_ < 23) {
					try {
						method1281(class98_sub22, i_8_, 4311);
					} catch (final Exception exception) {
						method1283(true, i ^ 0x27a4);
					}
					method1283(false, 0);
				} else if ((i_8_ ^ 0xffffffff) < -25) {
					method1283(true, i + -10148);
				} else {
					aClass64_Sub23_4044 = new Class64_Sub23(
							class98_sub22.readUnsignedByte((byte) 92), this);
					aClass64_Sub23_4055 = new Class64_Sub23(
							aClass64_Sub23_4044.method648((byte) 124), this);
					aClass64_Sub5_4065 = new Class64_Sub5(
							class98_sub22.readUnsignedByte((byte) -108), this);
					aClass64_Sub19_4057 = new Class64_Sub19(
							class98_sub22.readUnsignedByte((byte) 74), this);
					aClass64_Sub17_4046 = new Class64_Sub17(
							class98_sub22.readUnsignedByte((byte) -126), this);
					aClass64_Sub13_4063 = new Class64_Sub13(
							class98_sub22.readUnsignedByte((byte) 104), this);
					aClass64_Sub14_4049 = new Class64_Sub14(
							class98_sub22.readUnsignedByte((byte) -127), this);
					aClass64_Sub25_4039 = new Class64_Sub25(
							class98_sub22.readUnsignedByte((byte) 34), this);
					aClass64_Sub11_4038 = new Class64_Sub11(
							class98_sub22.readUnsignedByte((byte) -6), this);
					aClass64_Sub24_4047 = new Class64_Sub24(
							class98_sub22.readUnsignedByte((byte) -107), this);
					aClass64_Sub10_4070 = new Class64_Sub10(
							class98_sub22.readUnsignedByte((byte) -109), this);
					aClass64_Sub7_4073 = new Class64_Sub7(
							class98_sub22.readUnsignedByte((byte) 26), this);
					if ((i_8_ ^ 0xffffffff) <= -25) {
						aClass64_Sub18_4071 = new Class64_Sub18(
								class98_sub22.readUnsignedByte((byte) -104),
								this);
					}
					aClass64_Sub6_4033 = new Class64_Sub6(
							class98_sub22.readUnsignedByte((byte) -8), this);
					aClass64_Sub15_4034 = new Class64_Sub15(
							class98_sub22.readUnsignedByte((byte) -124), this);
					aClass64_Sub15_4058 = new Class64_Sub15(
							aClass64_Sub15_4034.method612((byte) 123), this);
					aClass64_Sub16_4040 = new Class64_Sub16(
							class98_sub22.readUnsignedByte((byte) 72), this);
					aClass64_Sub26_4035 = new Class64_Sub26(
							class98_sub22.readUnsignedByte((byte) 4), this);
					aClass64_Sub9_4067 = new Class64_Sub9(
							class98_sub22.readUnsignedByte((byte) 71), this);
					aClass64_Sub20_4056 = new Class64_Sub20(
							class98_sub22.readUnsignedByte((byte) 36), this);
					aClass64_Sub8_4062 = new Class64_Sub8(
							class98_sub22.readUnsignedByte((byte) 76), this);
					aClass64_Sub8_4042 = new Class64_Sub8(
							aClass64_Sub8_4062.method583((byte) 122), this);
					aClass64_Sub3_4041 = new Class64_Sub3(
							class98_sub22.readUnsignedByte((byte) -99), this);
					aClass64_Sub3_4076 = new Class64_Sub3(
							aClass64_Sub3_4041.method564((byte) 122), this);
					aClass64_Sub28_4064 = new Class64_Sub28(
							class98_sub22.readUnsignedByte((byte) 67), this);
					aClass64_Sub27_4052 = new Class64_Sub27(
							class98_sub22.readUnsignedByte((byte) -125), this);
					aClass64_Sub27_4068 = new Class64_Sub27(
							aClass64_Sub27_4052.method666((byte) 127), this);
					aClass64_Sub29_4050 = new Class64_Sub29(
							class98_sub22.readUnsignedByte((byte) -107), this);
					aClass64_Sub12_4048 = new Class64_Sub12(
							class98_sub22.readUnsignedByte((byte) -106), this);
					aClass64_Sub21_4037 = new Class64_Sub21(
							class98_sub22.readUnsignedByte((byte) -124), this);
					aClass64_Sub4_4053 = new Class64_Sub4(
							class98_sub22.readUnsignedByte((byte) 99), this);
					aClass64_Sub2_4061 = new Class64_Sub2(
							class98_sub22.readUnsignedByte((byte) 114), this);
					aClass64_Sub22_4066 = new Class64_Sub22(
							class98_sub22.readUnsignedByte((byte) 127), this);
					aClass64_Sub22_4051 = new Class64_Sub22(
							class98_sub22.readUnsignedByte((byte) -118), this);
					aClass64_Sub22_4054 = new Class64_Sub22(
							class98_sub22.readUnsignedByte((byte) 74), this);
					aClass64_Sub22_4069 = new Class64_Sub22(
							class98_sub22.readUnsignedByte((byte) -102), this);
					aClass64_Sub22_4072 = new Class64_Sub22(
							class98_sub22.readUnsignedByte((byte) 111), this);
					aClass64_Sub1_4043 = new Class64_Sub1(
							class98_sub22.readUnsignedByte((byte) -123), this);
					method1283(false, i ^ 0x27a4);
				}
			} else {
				method1283(true, 0);
			}
			if (i != 10148) {
				method1280(true);
			}
			method1287(false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("kda.F(" + (class98_sub22 != null ? "{...}" : "null")
							+ ',' + i + ')'));
		}
	}

	final boolean method1291(final byte i) {
		try {
			if (i < 100) {
				aByteArray4075 = null;
			}
			if (!aClass64_Sub8_4042.method586(true)
					|| aClass64_Sub8_4042.method583((byte) 122) != 0
					|| aClass145_4036.method2318(-1) >= 96) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kda.H(" + i + ')');
		}
	}

	static final boolean method1292(final int i, final byte i_9_,
			final int i_10_) {
		try {
			if (!Class53_Sub1.method502(i, i_10_, (byte) 116)) {
				return false;
			}
			if ((i_10_ & 0x9000 ^ 0xffffffff) != -1
					| Class349.method3842(i, i_10_, -18021)
					| ByteBuffer.method1241(false, i, i_10_)) {
				return true;
			}
			if (i_9_ < 110) {
				aClass171_4045 = null;
			}
			return (((0x2000 & i_10_ ^ 0xffffffff) != -1
					| Class373_Sub3.method3978(i, i_10_, (byte) 74) | Class21_Sub2
						.method271((byte) -112, i_10_, i)) & (i & 0x37) == 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("kda.G(" + i + ','
					+ i_9_ + ',' + i_10_ + ')'));
		}
	}

	Class98_Sub27(final Class279 class279, final int i) {
		try {
			aClass279_4059 = class279;
			aClass145_4036 = new Class145(
					(Class98_Sub43_Sub2.aClass88_5907.aBoolean682),
					Class292.anInt3359, Class98_Sub46_Sub19.anInt6065,
					(Class88.aString690.toLowerCase().indexOf("arm") != -1));
			aClass64_Sub8_4042 = new Class64_Sub8(i, this);
			method1283(true, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("kda.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	Class98_Sub27(final ByteBuffer class98_sub22, final Class279 class279,
			final int i) {
		try {
			aClass279_4059 = class279;
			aClass145_4036 = new Class145(
					(Class98_Sub43_Sub2.aClass88_5907.aBoolean682),
					Class292.anInt3359, Class98_Sub46_Sub19.anInt6065,
					(Class88.aString690.indexOf("arm") ^ 0xffffffff) != 0);
			aClass64_Sub8_4042 = new Class64_Sub8(i, this);
			method1290(class98_sub22, 10148);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("kda.<init>("
					+ (class98_sub22 != null ? "{...}" : "null") + ','
					+ (class279 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	/* synthetic */static Class method1293(final String string) {
		try {
			return Class.forName(string);
		} catch (final ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
