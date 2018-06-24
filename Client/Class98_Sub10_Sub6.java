/* Class98_Sub10_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub6 extends Class98_Sub10 {
	private int anInt5558;
	static int[] anIntArray5559 = { 16, 32, 64, 128 };
	private int anInt5560;
	private int anInt5561 = 0;
	private int anInt5562;
	private int anInt5563;
	private int anInt5564;
	private int anInt5565;
	private int anInt5566;
	private int anInt5567;
	static Class258 aClass258_5568 = new Class258();
	static int anInt5569;
	static int anInt5570 = -1;

	@Override
	final int[][] method997(final int i, final int i_0_) {
		try {
			final int[][] is = ((Class98_Sub10) this).aClass223_3859
					.method2828(i_0_, 0);
			if (i > -76) {
				anInt5565 = 5;
			}
			if (((Class98_Sub10) this).aClass223_3859.aBoolean1683) {
				final int[][] is_1_ = method994(i_0_, 24431, 0);
				final int[] is_2_ = is_1_[0];
				final int[] is_3_ = is_1_[1];
				final int[] is_4_ = is_1_[2];
				final int[] is_5_ = is[0];
				final int[] is_6_ = is[1];
				final int[] is_7_ = is[2];
				for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff); i_8_++) {
					method1019(4096, is_2_[i_8_], is_4_[i_8_], is_3_[i_8_]);
					anInt5558 += anInt5563;
					anInt5565 += anInt5560;
					anInt5564 += anInt5561;
					for (/**/; anInt5558 < 0; anInt5558 += 4096) {
						/* empty */
					}
					if ((anInt5565 ^ 0xffffffff) > -1) {
						anInt5565 = 0;
					}
					for (/**/; anInt5558 > 4096; anInt5558 -= 4096) {
						/* empty */
					}
					if ((anInt5564 ^ 0xffffffff) > -1) {
						anInt5564 = 0;
					}
					if ((anInt5565 ^ 0xffffffff) < -4097) {
						anInt5565 = 4096;
					}
					if ((anInt5564 ^ 0xffffffff) < -4097) {
						anInt5564 = 4096;
					}
					method1021(-1824307956, anInt5565, anInt5564, anInt5558);
					is_5_[i_8_] = anInt5562;
					is_6_[i_8_] = anInt5567;
					is_7_[i_8_] = anInt5566;
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dfa.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	private final void method1019(final int i, final int i_9_, final int i_10_,
			final int i_11_) {
		try {
			int i_12_ = (i_9_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff) ? i_9_
					: i_11_;
			if (i == 4096) {
				i_12_ = ((i_12_ ^ 0xffffffff) <= (i_10_ ^ 0xffffffff) ? i_12_
						: i_10_);
				int i_13_ = ((i_9_ ^ 0xffffffff) <= (i_11_ ^ 0xffffffff) ? i_11_
						: i_9_);
				i_13_ = i_10_ >= i_13_ ? i_13_ : i_10_;
				final int i_14_ = -i_13_ + i_12_;
				anInt5564 = (i_13_ - -i_12_) / 2;
				if ((anInt5564 ^ 0xffffffff) >= -1 || anInt5564 >= 4096) {
					anInt5565 = 0;
				} else {
					anInt5565 = ((i_14_ << 624417068) / ((anInt5564 ^ 0xffffffff) >= -2049 ? 2 * anInt5564
							: 8192 + -(2 * anInt5564)));
				}
				if ((i_14_ ^ 0xffffffff) >= -1) {
					anInt5558 = 0;
				} else {
					final int i_15_ = (i_12_ - i_9_ << 132649516) / i_14_;
					final int i_16_ = (i_12_ + -i_11_ << -1824307956) / i_14_;
					final int i_17_ = (i_12_ - i_10_ << -1453213364) / i_14_;
					if (i_12_ == i_9_) {
						anInt5558 = ((i_13_ ^ 0xffffffff) == (i_11_ ^ 0xffffffff) ? i_17_ + 20480
								: -i_16_ + 4096);
					} else if (i_12_ != i_11_) {
						anInt5558 = i_13_ != i_9_ ? -i_15_ + 20480
								: 12288 + i_16_;
					} else {
						anInt5558 = i_13_ != i_10_ ? 12288 - i_17_
								: 4096 + i_15_;
					}
					anInt5558 /= 6;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dfa.D(" + i + ','
					+ i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	public static void method1020(final int i) {
		do {
			try {
				anIntArray5559 = null;
				aClass258_5568 = null;
				if (i == 2048) {
					break;
				}
				method1020(17);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "dfa.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_18_) {
		try {
			final int i_19_ = i;
			while_48_: do {
				do {
					if ((i_19_ ^ 0xffffffff) != -1) {
						if ((i_19_ ^ 0xffffffff) != -2) {
							if ((i_19_ ^ 0xffffffff) == -3) {
								break;
							}
							break while_48_;
						}
					} else {
						anInt5563 = class98_sub22.readUShort(false);
						break while_48_;
					}
					anInt5560 = (class98_sub22.readSignedByte((byte) -19) << -132224564) / 100;
					break while_48_;
				} while (false);
				anInt5561 = (class98_sub22.readSignedByte((byte) -19) << 311376012) / 100;
			} while (false);
			if (i_18_ > -92) {
				method997(-105, 125);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("dfa.A(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i_18_ + ')'));
		}
	}

	private final void method1021(final int i, final int i_20_,
			final int i_21_, int i_22_) {
		while_53_: do {
			try {
				final int i_23_ = (i_21_ <= 2048 ? (4096 - -i_20_) * i_21_ >> -1702681940
						: i_20_ + (i_21_ - (i_21_ * i_20_ >> 1984077964)));
				if (i != -1824307956) {
					anInt5558 = -107;
				}
				if (i_23_ > 0) {
					i_22_ *= 6;
					final int i_24_ = i_21_ + (i_21_ - i_23_);
					final int i_25_ = (i_23_ - i_24_ << 1290213260) / i_23_;
					final int i_26_ = i_22_ >> -1706048404;
					final int i_27_ = -(i_26_ << 39515372) + i_22_;
					int i_28_ = i_23_;
					i_28_ = i_25_ * i_28_ >> 1703367340;
					i_28_ = i_28_ * i_27_ >> 1479023980;
					final int i_29_ = i_24_ + i_28_;
					final int i_30_ = i_23_ - i_28_;
					final int i_31_ = i_26_;
					while_52_: do {
						while_51_: do {
							while_50_: do {
								while_49_: do {
									do {
										if ((i_31_ ^ 0xffffffff) != -1) {
											if (i_31_ == 1) {
												break;
											}
											if (i_31_ == 2) {
												break while_49_;
											}
											if ((i_31_ ^ 0xffffffff) == -4) {
												break while_50_;
											}
											if (i_31_ == 4) {
												break while_51_;
											}
											if ((i_31_ ^ 0xffffffff) != -6) {
												break while_53_;
											}
											if (!client.aBoolean3553) {
												break while_52_;
											}
										}
										anInt5562 = i_23_;
										anInt5567 = i_29_;
										anInt5566 = i_24_;
										return;
									} while (false);
									anInt5562 = i_30_;
									anInt5566 = i_24_;
									anInt5567 = i_23_;
									return;
								} while (false);
								anInt5566 = i_29_;
								anInt5567 = i_23_;
								anInt5562 = i_24_;
								return;
							} while (false);
							anInt5566 = i_23_;
							anInt5567 = i_30_;
							anInt5562 = i_24_;
							return;
						} while (false);
						anInt5567 = i_24_;
						anInt5562 = i_29_;
						anInt5566 = i_23_;
						return;
					} while (false);
					anInt5567 = i_24_;
					anInt5566 = i_30_;
					anInt5562 = i_23_;
					break;
				}
				anInt5562 = anInt5567 = anInt5566 = i_21_;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("dfa.E(" + i
						+ ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ')'));
			}
		} while (false);
	}

	static final String[] method1022(final int i, final String[] strings) {
		try {
			final String[] strings_32_ = new String[5];
			if (i != -845) {
				return null;
			}
			for (int i_33_ = 0; i_33_ < 5; i_33_++) {
				strings_32_[i_33_] = String.valueOf(i_33_) + ": ";
				if (strings != null && strings[i_33_] != null) {
					strings_32_[i_33_] = strings_32_[i_33_] + strings[i_33_];
				}
			}
			return strings_32_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dfa.B(" + i + ','
					+ (strings != null ? "{...}" : "null") + ')'));
		}
	}

	public Class98_Sub10_Sub6() {
		super(1, false);
		anInt5560 = 0;
		anInt5563 = 0;
	}

	static {
		anInt5569 = 0;
	}
}
