/* Class98_Sub46_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub11 extends Class98_Sub46 {
	static int anInt6024;
	static int anInt6025;
	private int[] anIntArray6026;
	boolean aBoolean6027 = true;
	Class280 aClass280_6028;
	int[] anIntArray6029;
	private int[][] anIntArrayArray6030;
	private String[] aStringArray6031;
	static Class332[] aClass332Array6032;

	final int method1574(final byte i) {
		try {
			if (i > -103) {
				anIntArrayArray6030 = null;
			}
			if (anIntArray6026 == null) {
				return 0;
			}
			return anIntArray6026.length;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gj.N(" + i + ')');
		}
	}

	final void method1575(final byte i) {
		do {
			try {
				if (anIntArray6029 != null) {
					for (int i_0_ = 0; ((i_0_ ^ 0xffffffff) > (anIntArray6029.length ^ 0xffffffff)); i_0_++) {
						anIntArray6029[i_0_] = Class41.method366(
								(anIntArray6029[i_0_]), 32768);
					}
				}
				if (i <= -115) {
					break;
				}
				anIntArrayArray6030 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "gj.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final String method1576(final int i, final ByteBuffer class98_sub22) {
		try {
			final StringBuffer stringbuffer = new StringBuffer(80);
			if (anIntArray6026 != null) {
				for (int i_1_ = 0; i_1_ < anIntArray6026.length; i_1_++) {
					stringbuffer.append(aStringArray6031[i_1_]);
					stringbuffer.append(aClass280_6028.method3326(
							method1580(i_1_, -41), anIntArrayArray6030[i_1_],
							(byte) 70,
							class98_sub22.method1248((Class98_Sub10_Sub7
									.method1025(anIntArray6026[i_1_],
											(byte) -65)).anInt2910, false)));
				}
			}
			if (i != 15281) {
				return null;
			}
			stringbuffer.append(aStringArray6031[-1 + aStringArray6031.length]);
			return stringbuffer.toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gj.G(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1577(final byte i) {
		try {
			if (i != 99) {
				method1581((byte) -118, null);
			}
			aClass332Array6032 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gj.M(" + i + ')');
		}
	}

	private final void method1578(final int i, final int i_2_,
			final ByteBuffer class98_sub22) {
		try {
			if ((i ^ 0xffffffff) == -2) {
				aStringArray6031 = Class112.method2142(
						class98_sub22.readString((byte) 84), '<', false);
			} else if ((i ^ 0xffffffff) != -3) {
				if ((i ^ 0xffffffff) == -4) {
					final int i_3_ = class98_sub22
							.readUnsignedByte((byte) -103);
					anIntArrayArray6030 = new int[i_3_][];
					anIntArray6026 = new int[i_3_];
					for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
						final int i_5_ = class98_sub22.readUnsignedShort((byte) 127);
						final Class348 class348 = Class98_Sub10_Sub7
								.method1025(i_5_, (byte) -96);
						if (class348 != null) {
							anIntArray6026[i_4_] = i_5_;
							anIntArrayArray6030[i_4_] = new int[class348.anInt2915];
							for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (class348.anInt2915 ^ 0xffffffff)); i_6_++) {
								anIntArrayArray6030[i_4_][i_6_] = class98_sub22
										.readUnsignedShort((byte) 127);
							}
						}
					}
				} else if ((i ^ 0xffffffff) == -5) {
					aBoolean6027 = false;
				}
			} else {
				final int i_7_ = class98_sub22.readUnsignedByte((byte) 117);
				anIntArray6029 = new int[i_7_];
				for (int i_8_ = 0; (i_7_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
					anIntArray6029[i_8_] = class98_sub22.readUnsignedShort((byte) 127);
				}
			}
			if (i_2_ != -3) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(
							runtimeexception,
							("gj.P("
									+ i
									+ ','
									+ i_2_
									+ ','
									+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1579(final ByteBuffer class98_sub22, final int[] is,
			final int i) {
		while_93_: do {
			try {
				if (i != -3) {
					method1584((byte) 4, null);
				}
				if (anIntArray6026 != null) {
					int i_9_ = 0;
					for (;;) {
						if (i_9_ >= anIntArray6026.length) {
							break while_93_;
						}
						if ((is.length ^ 0xffffffff) >= (i_9_ ^ 0xffffffff)) {
							break;
						}
						final int i_10_ = (method1580(i_9_, i ^ 0x47).anInt2913);
						if (i_10_ > 0) {
							class98_sub22.method1213(31498, is[i_9_], i_10_);
						}
						i_9_++;
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("gj.C("
						+ (class98_sub22 != null ? "{...}" : "null") + ','
						+ (is != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final Class348 method1580(final int i, final int i_11_) {
		try {
			if (anIntArray6026 == null || (i ^ 0xffffffff) > -1
					|| (i ^ 0xffffffff) < (anIntArray6026.length ^ 0xffffffff)) {
				return null;
			}
			return Class98_Sub10_Sub7
					.method1025(anIntArray6026[i], (byte) -109);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gj.F(" + i + ','
					+ i_11_ + ')');
		}
	}

	static final Class98_Sub10 method1581(final byte i,
			final ByteBuffer class98_sub22) {
		try {
			class98_sub22.readUnsignedByte((byte) -106);
			if (i >= -41) {
				aClass332Array6032 = null;
			}
			final int i_13_ = class98_sub22.readUnsignedByte((byte) -108);
			final Class98_Sub10 class98_sub10 = Appearance.method3630(i_13_, 115);
			class98_sub10.anInt3860 = class98_sub22.readUnsignedByte((byte) 61);
			final int i_14_ = class98_sub22.readUnsignedByte((byte) -116);
			for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff); i_15_++) {
				final int i_16_ = class98_sub22.readUnsignedByte((byte) -104);
				class98_sub10.method991(i_16_, class98_sub22, (byte) -116);
			}
			class98_sub10.method1001((byte) 66);
			return class98_sub10;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gj.O(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	final String method1582(final boolean bool) {
		try {
			final StringBuffer stringbuffer = new StringBuffer(80);
			if (aStringArray6031 == null) {
				return "";
			}
			stringbuffer.append(aStringArray6031[0]);
			if (bool != false) {
				return null;
			}
			for (int i = 1; (aStringArray6031.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				stringbuffer.append("...");
				stringbuffer.append(aStringArray6031[i]);
			}
			return stringbuffer.toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gj.E(" + bool
					+ ')');
		}
	}

	final int method1583(final int i, final int i_17_, final int i_18_) {
		try {
			if (i < 41) {
				return -47;
			}
			if (anIntArray6026 == null
					|| i_18_ < 0
					|| (i_18_ ^ 0xffffffff) < (anIntArray6026.length ^ 0xffffffff)) {
				return -1;
			}
			if (anIntArrayArray6030[i_18_] == null || (i_17_ ^ 0xffffffff) > -1
					|| anIntArrayArray6030[i_18_].length < i_17_) {
				return -1;
			}
			return anIntArrayArray6030[i_18_][i_17_];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gj.A(" + i + ','
					+ i_17_ + ',' + i_18_ + ')'));
		}
	}

	final void method1584(final byte i, final ByteBuffer class98_sub22) {
		try {
			if (i >= -81) {
				anIntArray6026 = null;
			}
			for (;;) {
				final int i_19_ = class98_sub22.readUnsignedByte((byte) -126);
				if ((i_19_ ^ 0xffffffff) == -1) {
					break;
				}
				method1578(i_19_, -3, class98_sub22);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gj.B(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class98_Sub46_Sub11() {
		/* empty */
	}
}
