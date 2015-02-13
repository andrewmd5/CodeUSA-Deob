/* Class98_Sub10_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub9 extends Class98_Sub10 {
	static int anInt5580 = 0;
	static int anInt5581;
	private int[] anIntArray5582;
	private int[] anIntArray5583;
	private final short[] aShortArray5584;
	static boolean aBoolean5585 = false;
	private int anInt5586 = 0;
	private int[][] anIntArrayArray5587;

	private final void method1031(final int i) {
		while_78_: do {
			try {
				if (i != -1) {
					anInt5580 = 81;
				}
				int i_0_ = anInt5586;
				do {
					if ((i_0_ ^ 0xffffffff) != -3) {
						if (i_0_ != 1) {
							break;
						}
					} else {
						for (i_0_ = 0; (i_0_ ^ 0xffffffff) > -258; i_0_++) {
							final int i_1_ = i_0_ << 1844896324;
							int i_2_;
							for (i_2_ = 1; anIntArrayArray5587.length - 1 > i_2_; i_2_++) {
								if ((i_1_ ^ 0xffffffff) > (anIntArrayArray5587[i_2_][0] ^ 0xffffffff)) {
									break;
								}
							}
							final int[] is = anIntArrayArray5587[i_2_ - 1];
							final int[] is_3_ = anIntArrayArray5587[i_2_];
							final int i_4_ = method1035(6435, -2 + i_2_)[1];
							final int i_5_ = is[1];
							final int i_6_ = is_3_[1];
							final int i_7_ = method1035(i + 6436, i_2_ + 1)[1];
							final int i_8_ = ((-is[0] + i_1_ << -1903518196) / (-is[0] + is_3_[0]));
							final int i_9_ = i_8_ * i_8_ >> 1577884364;
							final int i_10_ = -i_6_ + i_7_ - i_4_ - -i_5_;
							final int i_11_ = -i_10_ + i_4_ - i_5_;
							final int i_12_ = i_6_ + -i_4_;
							final int i_13_ = i_5_;
							final int i_14_ = ((i_10_ * i_8_ >> -1740957524)
									* i_9_ >> -747637524);
							final int i_15_ = i_9_ * i_11_ >> 1675912716;
							final int i_16_ = i_12_ * i_8_ >> -1525582676;
							int i_17_ = i_13_ + i_15_ + i_14_ + i_16_;
							if ((i_17_ ^ 0xffffffff) >= 32767) {
								i_17_ = -32767;
							}
							if (i_17_ >= 32768) {
								i_17_ = 32767;
							}
							aShortArray5584[i_0_] = (short) i_17_;
						}
						break while_78_;
					}
					for (i_0_ = 0; (i_0_ ^ 0xffffffff) > -258; i_0_++) {
						final int i_18_ = i_0_ << 1182163748;
						int i_19_;
						for (i_19_ = 1; ((i_19_ ^ 0xffffffff) > (-1
								+ anIntArrayArray5587.length ^ 0xffffffff)); i_19_++) {
							if ((anIntArrayArray5587[i_19_][0] ^ 0xffffffff) < (i_18_ ^ 0xffffffff)) {
								break;
							}
						}
						final int[] is = anIntArrayArray5587[-1 + i_19_];
						final int[] is_20_ = anIntArrayArray5587[i_19_];
						final int i_21_ = ((i_18_ - is[0] << 1736703948) / (-is[0] + is_20_[0]));
						final int i_22_ = (4096 - (Class278_Sub1.anIntArray5168[(i_21_ & 0x1fe0) >> 1491723813]) >> -2016979391);
						final int i_23_ = -i_22_ + 4096;
						int i_24_ = is_20_[1] * i_22_ + i_23_ * is[1] >> 797288268;
						if ((i_24_ ^ 0xffffffff) >= 32767) {
							i_24_ = -32767;
						}
						if ((i_24_ ^ 0xffffffff) <= -32769) {
							i_24_ = 32767;
						}
						aShortArray5584[i_0_] = (short) i_24_;
					}
					break while_78_;
				} while (false);
				for (i_0_ = 0; (i_0_ ^ 0xffffffff) > -258; i_0_++) {
					final int i_25_ = i_0_ << -1497970108;
					int i_26_;
					for (i_26_ = 1; ((anIntArrayArray5587.length + -1 ^ 0xffffffff) < (i_26_ ^ 0xffffffff)); i_26_++) {
						if (i_25_ < anIntArrayArray5587[i_26_][0]) {
							break;
						}
					}
					final int[] is = anIntArrayArray5587[i_26_ + -1];
					final int[] is_27_ = anIntArrayArray5587[i_26_];
					final int i_28_ = ((-is[0] + i_25_ << -1962608884) / (is_27_[0] + -is[0]));
					final int i_29_ = -i_28_ + 4096;
					int i_30_ = is_27_[1] * i_28_ + i_29_ * is[1] >> -443005428;
					if ((i_30_ ^ 0xffffffff) >= 32767) {
						i_30_ = -32767;
					}
					if (i_30_ >= 32768) {
						i_30_ = 32767;
					}
					aShortArray5584[i_0_] = (short) i_30_;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "et.H(" + i
						+ ')');
			}
		} while (false);
	}

	static final int method1032(final int i, final byte i_31_) {
		try {
			if (i_31_ < 8) {
				aBoolean5585 = true;
			}
			return i & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "et.D(" + i + ','
					+ i_31_ + ')');
		}
	}

	public Class98_Sub10_Sub9() {
		super(1, true);
		aShortArray5584 = new short[257];
	}

	@Override
	final int[] method990(final int i, final int i_32_) {
		try {
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_32_);
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				final int[] is_33_ = method1000(i_32_, 0, 0);
				for (int i_34_ = 0; i_34_ < Class25.anInt268; i_34_++) {
					int i_35_ = is_33_[i_34_] >> -880337692;
					if ((i_35_ ^ 0xffffffff) > -1) {
						i_35_ = 0;
					}
					if ((i_35_ ^ 0xffffffff) < -257) {
						i_35_ = 256;
					}
					is[i_34_] = aShortArray5584[i_35_];
				}
			}
			if (i != 255) {
				aBoolean5585 = true;
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "et.G(" + i + ','
					+ i_32_ + ')');
		}
	}

	static final boolean method1033(final int i, final int i_36_,
			final int i_37_) {
		try {
			if (i_37_ != 16) {
				return true;
			}
			if ((0x10 & i ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("et.B(" + i + ','
					+ i_36_ + ',' + i_37_ + ')'));
		}
	}

	private final void method1034(final int i) {
		try {
			final int[] is = anIntArrayArray5587[0];
			final int[] is_38_ = anIntArrayArray5587[1];
			final int[] is_39_ = anIntArrayArray5587[i
					+ anIntArrayArray5587.length];
			final int[] is_40_ = anIntArrayArray5587[-1
					+ anIntArrayArray5587.length];
			anIntArray5582 = new int[] { is_39_[0] + (-is_40_[0] + is_39_[0]),
					is_39_[1] + (is_39_[1] + -is_40_[1]) };
			anIntArray5583 = new int[] { is[0] - is_38_[0] - -is[0],
					is[1] - is_38_[1] - -is[1] };
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "et.F(" + i + ')');
		}
	}

	private final int[] method1035(final int i, final int i_41_) {
		try {
			if ((i_41_ ^ 0xffffffff) > -1) {
				return anIntArray5583;
			}
			if (i != 6435) {
				aBoolean5585 = false;
			}
			if ((i_41_ ^ 0xffffffff) <= (anIntArrayArray5587.length ^ 0xffffffff)) {
				return anIntArray5582;
			}
			return anIntArrayArray5587[i_41_];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "et.J(" + i + ','
					+ i_41_ + ')');
		}
	}

	@Override
	final void method1001(final byte i) {
		try {
			if (i != 66) {
				anIntArray5582 = null;
			}
			if (anIntArrayArray5587 == null) {
				anIntArrayArray5587 = new int[][] { new int[2], { 4096, 4096 } };
			}
			if (anIntArrayArray5587.length < 2) {
				throw new RuntimeException(
						"Curve operation requires at least two markers");
			}
			if (anInt5586 == 2) {
				method1034(-2);
			}
			Class98_Sub31_Sub4.method1386(0);
			method1031(i + -67);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "et.I(" + i + ')');
		}
	}

	static final void method1036(final int i, final int i_42_, final int i_43_,
			final int i_44_, final boolean bool, final int i_45_,
			final int i_46_) {
		do {
			try {
				if (i == -1962608884) {
					if ((!bool ? Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4066
							.method641((byte) 125)
							: Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4054
									.method641((byte) 123)) == 0
							|| i_43_ == 0
							|| Class306.anInt2566 >= 50
							|| i_44_ == -1) {
						break;
					}
					Class245.aClass338Array1865[Class306.anInt2566++] = new Class338(
							bool ? (byte) 3 : (byte) 2, i_44_, i_43_, i_45_,
							i_42_, 0, i_46_, null);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("et.E(" + i
						+ ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + bool
						+ ',' + i_45_ + ',' + i_46_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_47_) {
		do {
			try {
				if (i_47_ > -92) {
					method990(117, -9);
				}
				if ((i ^ 0xffffffff) != -1) {
					break;
				}
				anInt5586 = class98_sub22.readUnsignedByte((byte) -120);
				anIntArrayArray5587 = new int[class98_sub22
						.readUnsignedByte((byte) -123)][2];
				for (int i_48_ = 0; ((anIntArrayArray5587.length ^ 0xffffffff) < (i_48_ ^ 0xffffffff)); i_48_++) {
					anIntArrayArray5587[i_48_][0] = class98_sub22
							.readUnsignedShort((byte) 127);
					anIntArrayArray5587[i_48_][1] = class98_sub22
							.readUnsignedShort((byte) 127);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("et.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_47_ + ')'));
			}
			break;
		} while (false);
	}

	static {
		anInt5581 = 0;
	}
}
