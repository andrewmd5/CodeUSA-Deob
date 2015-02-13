/* Class98_Sub10_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub21 extends Class98_Sub10 {
	static IncomingOpcode aClass58_5641;
	static byte[] aByteArray5642 = new byte[2048];
	static int anInt5643;
	private int anInt5644;
	private int anInt5645 = 2048;
	static boolean aBoolean5646 = false;
	private int anInt5647;
	private int anInt5648;
	private int anInt5649;
	private int anInt5650;
	private int anInt5651;

	public Class98_Sub10_Sub21() {
		super(0, true);
		anInt5644 = 4096;
		anInt5647 = 8192;
		anInt5648 = 12288;
		anInt5650 = 0;
		anInt5649 = 2048;
		anInt5651 = 0;
	}

	static final void method1063(final byte i) {
		try {
			synchronized (Class299.aClass79_2493) {
				if (i >= -11) {
					method1068((byte) 49);
				}
				Class299.aClass79_2493.method794(99);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mba.E(" + i + ')');
		}
	}

	@Override
	final void method1001(final byte i) {
		do {
			try {
				Class98_Sub31_Sub4.method1386(i ^ 0x42);
				if (i == 66) {
					break;
				}
				method990(-105, 15);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "mba.I(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final boolean method1064(final int i, final boolean bool) {
		try {
			if ((i ^ 0xffffffff) == -16 || (i ^ 0xffffffff) == -5
					|| (i ^ 0xffffffff) == -9 || i == 16 || i == 1007) {
				return true;
			}
			if ((i ^ 0xffffffff) == -51 || (i ^ 0xffffffff) == -1010) {
				return true;
			}
			if (bool != false) {
				method1066(-107, null);
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mba.D(" + i + ','
					+ bool + ')');
		}
	}

	private final boolean method1065(final byte i, final int i_0_,
			final int i_1_) {
		try {
			if (i != -15) {
				return false;
			}
			final int i_2_ = anInt5648 * (i_0_ + i_1_) >> 387809964;
			int i_3_ = (Class278_Sub1.anIntArray5168[(255 * i_2_ & 0xff4a7) >> 2005561068]);
			i_3_ = (i_3_ << -2091824980) / anInt5648;
			i_3_ = (i_3_ << 431388332) / anInt5647;
			i_3_ = anInt5644 * i_3_ >> 1509067820;
			if (i_3_ <= -i_0_ + i_1_ || i_1_ - i_0_ <= -i_3_) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mba.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method1066(final int i, final Class293 class293) {
		try {
			if (class293.anInt2354 == 5
					&& (class293.anInt2302 ^ 0xffffffff) != 0) {
				Class372.method3957(Class265.aHa1974, true, class293);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mba.J(" + i + ','
					+ (class293 != null ? "{...}" : "null") + ')'));
		}
	}

	private final boolean method1067(final int i, final int i_5_, final int i_6_) {
		try {
			if (i != -13306) {
				method1068((byte) -36);
			}
			final int i_7_ = (i_6_ - i_5_) * anInt5648 >> 1378239116;
			int i_8_ = (Class278_Sub1.anIntArray5168[(0xffce8 & 255 * i_7_) >> 970817420]);
			i_8_ = (i_8_ << -1235031796) / anInt5648;
			i_8_ = (i_8_ << 1531907340) / anInt5647;
			i_8_ = i_8_ * anInt5644 >> 9457036;
			if (i_8_ <= i_6_ + i_5_
					|| (-i_8_ ^ 0xffffffff) <= (i_5_ + i_6_ ^ 0xffffffff)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mba.H(" + i + ','
					+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	@Override
	final int[] method990(final int i, final int i_9_) {
		try {
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_9_);
			if (i != 255) {
				method1067(91, 52, -49);
			}
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				final int i_10_ = GameObjectDefinition.anIntArray3001[i_9_] - 2048;
				for (int i_11_ = 0; Class25.anInt268 > i_11_; i_11_++) {
					final int i_12_ = -2048
							+ Class64_Sub1.anIntArray3640[i_11_];
					int i_13_ = i_12_ - -anInt5645;
					i_13_ = i_13_ >= -2048 ? i_13_ : i_13_ + 4096;
					i_13_ = ((i_13_ ^ 0xffffffff) >= -2049 ? i_13_ : -4096
							+ i_13_);
					int i_14_ = i_10_ - -anInt5651;
					i_14_ = i_14_ < -2048 ? i_14_ + 4096 : i_14_;
					i_14_ = i_14_ <= 2048 ? i_14_ : -4096 + i_14_;
					int i_15_ = anInt5650 + i_12_;
					i_15_ = i_15_ >= -2048 ? i_15_ : i_15_ + 4096;
					i_15_ = (i_15_ ^ 0xffffffff) < -2049 ? i_15_ + -4096
							: i_15_;
					int i_16_ = anInt5649 + i_10_;
					i_16_ = (i_16_ ^ 0xffffffff) <= 2047 ? i_16_ : 4096 + i_16_;
					i_16_ = i_16_ <= 2048 ? i_16_ : i_16_ + -4096;
					is[i_11_] = (method1067(-13306, i_13_, i_14_) || method1065(
							(byte) -15, i_15_, i_16_)) ? 4096 : 0;
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mba.G(" + i + ','
					+ i_9_ + ')');
		}
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_17_) {
		while_127_: do {
			try {
				if (i_17_ > -92) {
					anInt5648 = 53;
				}
				final int i_18_ = i;
				while_126_: do {
					while_125_: do {
						while_124_: do {
							while_123_: do {
								while_122_: do {
									do {
										if (i_18_ != 0) {
											if (i_18_ == 1) {
												break;
											}
											if (i_18_ == 2) {
												break while_122_;
											}
											if (i_18_ == 3) {
												break while_123_;
											}
											if (i_18_ == 4) {
												break while_124_;
											}
											if ((i_18_ ^ 0xffffffff) == -6) {
												break while_125_;
											}
											if ((i_18_ ^ 0xffffffff) != -7) {
												break while_127_;
											}
											if (!client.aBoolean3553) {
												break while_126_;
											}
										}
										anInt5645 = class98_sub22
												.readUnsignedShort((byte) 127);
										return;
									} while (false);
									anInt5651 = class98_sub22
											.readUnsignedShort((byte) 127);
									return;
								} while (false);
								anInt5650 = class98_sub22.readUnsignedShort((byte) 127);
								return;
							} while (false);
							anInt5649 = class98_sub22.readUnsignedShort((byte) 127);
							return;
						} while (false);
						anInt5648 = class98_sub22.readUnsignedShort((byte) 127);
						return;
					} while (false);
					anInt5644 = class98_sub22.readUnsignedShort((byte) 127);
					return;
				} while (false);
				anInt5647 = class98_sub22.readUnsignedShort((byte) 127);
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("mba.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_17_ + ')'));
			}
		} while (false);
	}

	public static void method1068(final byte i) {
		try {
			if (i != -48) {
				aClass58_5641 = null;
			}
			aClass58_5641 = null;
			aByteArray5642 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mba.B(" + i + ')');
		}
	}
}
