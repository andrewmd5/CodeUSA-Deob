/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ReferenceTable {
	static IncomingOpcode aClass58_2661 = new IncomingOpcode(89, 0);
	int[] anIntArray2662;
	private byte[] aByteArray2663;
	int[] anIntArray2664;
	int entryCount;
	Class122 aClass122_2666;
	int[] anIntArray2667;
	int anInt2668;
	int[][] anIntArrayArray2669;
	int[] anIntArray2670;
	int[] anIntArray2671;
	Class122[] aClass122Array2672;
	int[] anIntArray2673;
	int[][] anIntArrayArray2674;
	byte[][] aByteArrayArray2675;
	int anInt2676;
	int anInt2677;

	static final void method3620(final GameObjectDefinition class352,
			final int i, final int i_0_, final int i_1_, final int i_2_) {
		try {
			Class98_Sub42 class98_sub42 = ((Class98_Sub42) Class98_Sub10_Sub37.aClass148_5748
					.method2418(32));
			if (i != -22015) {
				aClass58_2661 = null;
			}
			for (/**/; class98_sub42 != null; class98_sub42 = ((Class98_Sub42) Class98_Sub10_Sub37.aClass148_5748
					.method2417(97))) {
				if (i_1_ == class98_sub42.anInt4220
						&& (i_2_ << -172547319 == class98_sub42.anInt4229)
						&& (class98_sub42.anInt4225 == i_0_ << -244251415)
						&& ((class352.id ^ 0xffffffff) == ((class98_sub42.aClass352_4233).id ^ 0xffffffff))) {
					if ((class98_sub42.aClass98_Sub31_Sub5_4232) != null) {
						Class81.aClass98_Sub31_Sub3_619
								.method1374(class98_sub42.aClass98_Sub31_Sub5_4232);
						class98_sub42.aClass98_Sub31_Sub5_4232 = null;
					}
					if ((class98_sub42.aClass98_Sub31_Sub5_4230) != null) {
						Class81.aClass98_Sub31_Sub3_619
								.method1374(class98_sub42.aClass98_Sub31_Sub5_4230);
						class98_sub42.aClass98_Sub31_Sub5_4230 = null;
					}
					class98_sub42.method942(87);
					break;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("te.D("
					+ (class352 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	public static void method3621(final byte i) {
		try {
			if (i != 7) {
				method3620(null, -45, -88, 50, 116);
			}
			aClass58_2661 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "te.B(" + i + ')');
		}
	}

	private final void method3622(final byte[] is, final int i) {
		do {
			try {
				final ByteBuffer class98_sub22 = new ByteBuffer(
						Class98_Sub46_Sub10.method1571(is, (byte) -84));
				final int version = class98_sub22.readUnsignedByte((byte) 23);
				if (version < 5 || version > 7) {
					throw new RuntimeException("Invalid version.");
				}
				if ((version ^ 0xffffffff) > -7) {
					anInt2676 = 0;
				} else {
					anInt2676 = class98_sub22.readInt(-2);
				}
				final int flags = class98_sub22.readUnsignedByte((byte) -127);
				final boolean hasNames = (0x1 & flags) != 0;
				if (version == 7) {
					entryCount = class98_sub22.readIntSmart();
				} else {
					entryCount = class98_sub22.readIntSmart(); //class98_sub22.readUnsignedShort((byte) 127); forget
				}
				final boolean hasDigests = (0x2 & flags ^ 0xffffffff) != -1;
				int i_6_ = 0;
				anIntArray2664 = new int[entryCount];
				int i_7_ = -1;
				for (int i_8_ = 0; entryCount > i_8_; i_8_++) {
					if (version == 7) {
						anIntArray2664[i_8_] = i_6_ += class98_sub22
								.readIntSmart();
					} else {
						anIntArray2664[i_8_] = i_6_ += class98_sub22
								.readUnsignedShort((byte) 127);
					}
					if (anIntArray2664[i_8_] > i_7_) {
						i_7_ = anIntArray2664[i_8_];
					}
				}
				anInt2668 = 1 + i_7_;
				if (hasDigests) {
					aByteArrayArray2675 = new byte[anInt2668][];
				}
				anIntArray2670 = new int[anInt2668];
				anIntArrayArray2669 = new int[anInt2668][];
				anIntArray2671 = new int[anInt2668];
				anIntArray2667 = new int[anInt2668];
				anIntArray2673 = new int[anInt2668];
				if (hasNames) {
					anIntArray2662 = new int[anInt2668];
					for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (anInt2668 ^ 0xffffffff)); i_9_++) {
						anIntArray2662[i_9_] = -1;
					}
					for (int i_10_ = 0; i_10_ < entryCount; i_10_++) {
						anIntArray2662[anIntArray2664[i_10_]] = class98_sub22
								.readInt(-2);
					}
					aClass122_2666 = new Class122(anIntArray2662);
				}
				for (int i_11_ = 0; entryCount > i_11_; i_11_++) {
					anIntArray2673[(anIntArray2664[i_11_])] = class98_sub22
							.readInt(-2);
				}
				if (hasDigests) {
					for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (entryCount ^ 0xffffffff)); i_12_++) {
						final byte[] is_13_ = new byte[64];
						class98_sub22.method1190(is_13_, true, 64, 0);
						aByteArrayArray2675[anIntArray2664[i_12_]] = is_13_;
					}
				}
				if (i == -7572) {
					for (int i_14_ = 0; entryCount > i_14_; i_14_++) {
						anIntArray2667[anIntArray2664[i_14_]] = class98_sub22
								.readInt(-2);
					}
					for (int i_15_ = 0; entryCount > i_15_; i_15_++) {
						if (version == 7) {
							anIntArray2670[anIntArray2664[i_15_]] = class98_sub22
									.readIntSmart();
						} else {
							anIntArray2670[anIntArray2664[i_15_]] = class98_sub22
									.readUnsignedShort((byte) 127);
						}
					}
					for (int i_16_ = 0; ((entryCount ^ 0xffffffff) < (i_16_ ^ 0xffffffff)); i_16_++) {
						final int i_17_ = anIntArray2664[i_16_];
						final int i_18_ = anIntArray2670[i_17_];
						i_6_ = 0;
						anIntArrayArray2669[i_17_] = new int[i_18_];
						int i_19_ = -1;
						for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff); i_20_++) {
							int i_21_;
							if (version == 7) {
								i_21_ = (anIntArrayArray2669[i_17_][i_20_] = i_6_ += class98_sub22
										.readIntSmart());
							} else {
								i_21_ = (anIntArrayArray2669[i_17_][i_20_] = i_6_ += class98_sub22
										.readUnsignedShort((byte) 127));
							}
							if ((i_21_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff)) {
								i_19_ = i_21_;
							}
						}
						anIntArray2671[i_17_] = 1 + i_19_;
						if ((i_18_ ^ 0xffffffff) == (1 + i_19_ ^ 0xffffffff)) {
							anIntArrayArray2669[i_17_] = null;
						}
					}
					if (!hasNames) {
						break;
					}
					aClass122Array2672 = new Class122[1 + i_7_];
					anIntArrayArray2674 = new int[1 + i_7_][];
					for (int i_22_ = 0; entryCount > i_22_; i_22_++) {
						final int i_23_ = anIntArray2664[i_22_];
						final int i_24_ = anIntArray2670[i_23_];
						anIntArrayArray2674[i_23_] = new int[anIntArray2671[i_23_]];
						for (int i_25_ = 0; ((i_25_ ^ 0xffffffff) > (anIntArray2671[i_23_] ^ 0xffffffff)); i_25_++) {
							anIntArrayArray2674[i_23_][i_25_] = -1;
						}
						for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > (i_24_ ^ 0xffffffff); i_26_++) {
							int i_27_;
							if (anIntArrayArray2669[i_23_] != null) {
								i_27_ = (anIntArrayArray2669[i_23_][i_26_]);
							} else {
								i_27_ = i_26_;
							}
							anIntArrayArray2674[i_23_][i_27_] = class98_sub22
									.readInt(i + 7570);
						}
						aClass122Array2672[i_23_] = new Class122(
								anIntArrayArray2674[i_23_]);
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27
						.printError(runtimeexception,
								("Unproper reference table parse: te.C("
										+ (is != null ? "{...}" : "null") + ','
										+ i + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method3623(int i, int i_28_) {
		try {
			if (i > -68)
				aClass58_2661 = null;
			if ((i_28_ ^ 0xffffffff) != -4 && i_28_ != 4)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "te.A(" + i + ','
					+ i_28_ + ')');
		}
	}

	ReferenceTable(final byte[] is, final int crc, final byte[] is_29_) {
		try {
			if (!client.JS5_CHECKSUM_DISABLED) {
				anInt2677 = Class31.method309(is.length, is, -30091);
				if (crc != anInt2677) {
					throw new RuntimeException();
				}
				if (is_29_ != null) {
					if (is_29_.length != 64) {
						throw new RuntimeException();
					}
					aByteArray2663 = Class64_Sub11.method595(0, (byte) -121,
							is, is.length);
					for (int i_30_ = 0; i_30_ < 64; i_30_++) {
						if ((aByteArray2663[i_30_] ^ 0xffffffff) != (is_29_[i_30_] ^ 0xffffffff)) {
							throw new RuntimeException();
						}
					}
				}
			} else {
				anInt2677 = 0;
			}
			method3622(is, -7572);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("te.<init>("
					+ (is != null ? "{...}" : "null") + ',' + crc + ','
					+ (is_29_ != null ? "{...}" : "null") + ')'));
		}
	}
}
