/* Class98_Sub10_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub34 extends Class98_Sub10 {
	private int anInt5725 = 0;
	private int anInt5726;
	private int anInt5727 = 0;
	static Class215 aClass215_5728 = new Class215();
	private int anInt5729 = 20;
	static Class43 aClass43_5730;

	public Class98_Sub10_Sub34() {
		super(0, true);
		anInt5726 = 1365;
	}

	static final String method1103(int i, final boolean bool, final int i_0_,
			final int i_1_) {
		try {
			if ((i_1_ ^ 0xffffffff) > -3 || i_1_ > 36) {
				throw new IllegalArgumentException("Invalid radix:" + i_1_);
			}
			if (!bool || (i ^ 0xffffffff) > -1) {
				return Integer.toString(i, i_1_);
			}
			int i_2_ = 2;
			for (int i_3_ = i / i_1_; (i_3_ ^ 0xffffffff) != -1; i_3_ /= i_1_) {
				i_2_++;
			}
			if (i_0_ != 328) {
				return null;
			}
			final char[] cs = new char[i_2_];
			cs[0] = '+';
			for (int i_4_ = i_2_ - 1; i_4_ > 0; i_4_--) {
				final int i_5_ = i;
				i /= i_1_;
				final int i_6_ = -(i_1_ * i) + i_5_;
				if (i_6_ >= 10) {
					cs[i_4_] = (char) (87 + i_6_);
				} else {
					cs[i_4_] = (char) (48 + i_6_);
				}
			}
			return new String(cs);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ta.D(" + i + ','
					+ bool + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method1104(final int i) {
		try {
			if (i <= 78) {
				method1103(-104, true, 77, -76);
			}
			Class246_Sub4_Sub2.anInt6184 = (int) (Class165.anInt1276 * 34.46);
			Class64_Sub20.anInt3696 = 200;
			Class246_Sub4_Sub2.anInt6184 <<= 2;
			if (Class265.aHa1974.method1788()) {
				Class246_Sub4_Sub2.anInt6184 += 512;
			}
			Class201.method2697(-546, false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ta.F(" + i + ')');
		}
	}

	public static void method1105(final int i) {
		try {
			aClass43_5730 = null;
			aClass215_5728 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ta.E(" + i + ')');
		}
	}

	static final void method1106(final byte i) {
		try {
			if (i == -61) {
				Class142.aClass377_1157.method3994(-95);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ta.B(" + i + ')');
		}
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_8_) {
		while_177_: do {
			try {
				if (i_8_ > -92) {
					method1106((byte) 111);
				}
				final int i_9_ = i;
				while_176_: do {
					while_175_: do {
						do {
							if ((i_9_ ^ 0xffffffff) != -1) {
								if (i_9_ == 1) {
									break;
								}
								if (i_9_ == 2) {
									break while_175_;
								}
								if (i_9_ != 3) {
									break while_177_;
								}
								if (!client.aBoolean3553) {
									break while_176_;
								}
							}
							anInt5726 = class98_sub22.readUnsignedShort((byte) 127);
							return;
						} while (false);
						anInt5729 = class98_sub22.readUnsignedShort((byte) 127);
						return;
					} while (false);
					anInt5727 = class98_sub22.readUnsignedShort((byte) 127);
					return;
				} while (false);
				anInt5725 = class98_sub22.readUnsignedShort((byte) 127);
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ta.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_8_ + ')'));
			}
		} while (false);
	}

	@Override
	final int[] method990(final int i, final int i_10_) {
		try {
			if (i != 255) {
				return null;
			}
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_10_);
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				for (int i_11_ = 0; i_11_ < Class25.anInt268; i_11_++) {
					final int i_12_ = ((Class64_Sub1.anIntArray3640[i_11_] << 1511869708)
							/ anInt5726 + anInt5727);
					final int i_13_ = anInt5725
							+ (GameObjectDefinition.anIntArray3001[i_10_] << 1223121772)
							/ anInt5726;
					final int i_14_ = i_12_;
					final int i_15_ = i_13_;
					int i_16_ = i_12_;
					int i_17_ = i_13_;
					int i_18_ = i_12_ * i_12_ >> -74704404;
					int i_19_ = i_13_ * i_13_ >> 476654668;
					int i_20_;
					for (i_20_ = 0; ((i_19_ + i_18_ ^ 0xffffffff) > -16385 && (i_20_ ^ 0xffffffff) > (anInt5729 ^ 0xffffffff)); i_19_ = i_17_
							* i_17_ >> -973863668) {
						i_17_ = (i_16_ * i_17_ >> 1013466860) * 2 + i_15_;
						i_16_ = i_14_ + (i_18_ - i_19_);
						i_18_ = i_16_ * i_16_ >> -998006516;
						i_20_++;
					}
					is[i_11_] = ((anInt5729 + -1 ^ 0xffffffff) < (i_20_ ^ 0xffffffff) ? (i_20_ << -1736488308)
							/ anInt5729
							: 0);
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ta.G(" + i + ','
					+ i_10_ + ')');
		}
	}
}
