/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class243 {
	static int anInt1852;
	int[][] anIntArrayArray1853;
	int anInt1854;
	int anInt1855;
	int anInt1856;
	int anInt1857;

	final boolean method2936(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_, final int i_5_,
			final int i_6_, final int i_7_, final int i_8_) {
		try {
			if (i_2_ != -1) {
				method2949(33, false, 107, -45, 14, true, -5);
			}
			final int i_9_ = i_5_ + i_6_;
			final int i_10_ = i_3_ - -i_7_;
			final int i_11_ = i_4_ + i;
			final int i_12_ = i_1_ - -i_0_;
			if (i_11_ != i_6_ || (i_8_ & 0x2) != 0) {
				if (i_9_ != i || (i_8_ & 0x8 ^ 0xffffffff) != -1) {
					if (i_3_ == i_12_ && (0x1 & i_8_ ^ 0xffffffff) == -1) {
						int i_13_ = ((i_6_ ^ 0xffffffff) < (i ^ 0xffffffff) ? i_6_
								: i);
						for (final int i_14_ = i_11_ > i_9_ ? i_9_ : i_11_; i_13_ < i_14_; i_13_++) {
							if (((anIntArrayArray1853[-anInt1854 + i_13_][-anInt1855
									+ i_12_ + -1]) & 0x2) == 0) {
								return true;
							}
						}
					} else if ((i_1_ ^ 0xffffffff) == (i_10_ ^ 0xffffffff)
							&& (0x4 & i_8_ ^ 0xffffffff) == -1) {
						int i_15_ = ((i ^ 0xffffffff) <= (i_6_ ^ 0xffffffff) ? i
								: i_6_);
						for (final int i_16_ = ((i_11_ ^ 0xffffffff) >= (i_9_ ^ 0xffffffff) ? i_11_
								: i_9_); (i_15_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_15_++) {
							if ((0x20 & (anIntArrayArray1853[i_15_ + -anInt1854][-anInt1855
									+ i_1_]) ^ 0xffffffff) == -1) {
								return true;
							}
						}
					}
				} else {
					int i_17_ = i_3_ <= i_1_ ? i_1_ : i_3_;
					for (final int i_18_ = i_10_ < i_12_ ? i_10_ : i_12_; (i_18_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
						if ((0x80 & (anIntArrayArray1853[i + -anInt1854][i_17_
								+ -anInt1855]) ^ 0xffffffff) == -1) {
							return true;
						}
					}
				}
			} else {
				int i_19_ = i_3_ > i_1_ ? i_3_ : i_1_;
				for (final int i_20_ = ((i_12_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff) ? i_10_
						: i_12_); i_19_ < i_20_; i_19_++) {
					if ((0x8 & (anIntArrayArray1853[-anInt1854 + -1 + i_11_][i_19_
							+ -anInt1855]) ^ 0xffffffff) == -1) {
						return true;
					}
				}
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pfa.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	final void method2937(final int i, final boolean bool, final byte i_21_,
			final boolean bool_22_, int i_23_, final int i_24_, int i_25_) {// IMPORTANT
		do {
			try {
				i_25_ -= anInt1855;
				i_23_ -= anInt1854;
				if (i == 0) {
					if ((i_24_ ^ 0xffffffff) == -1) {
						method2940(i_23_, i_25_, 128, 33);
						method2940(-1 + i_23_, i_25_, 8, 91);
					}
					if ((i_24_ ^ 0xffffffff) == -2) {
						method2940(i_23_, i_25_, 2, 52);
						method2940(i_23_, 1 + i_25_, 32, 60);
					}
					if ((i_24_ ^ 0xffffffff) == -3) {
						method2940(i_23_, i_25_, 8, 104);
						method2940(i_23_ + 1, i_25_, 128, 39);
					}
					if (i_24_ == 3) {
						method2940(i_23_, i_25_, 32, 83);
						method2940(i_23_, -1 + i_25_, 2, 126);
					}
				}
				if (i == 1 || i == 3) {
					if (i_24_ == 0) {
						method2940(i_23_, i_25_, 1, 84);
						method2940(i_23_ - 1, 1 + i_25_, 16, 80);
					}
					if ((i_24_ ^ 0xffffffff) == -2) {
						method2940(i_23_, i_25_, 4, 118);
						method2940(1 + i_23_, 1 + i_25_, 64, 75);
					}
					if ((i_24_ ^ 0xffffffff) == -3) {
						method2940(i_23_, i_25_, 16, 60);
						method2940(i_23_ - -1, -1 + i_25_, 1, 125);
					}
					if ((i_24_ ^ 0xffffffff) == -4) {
						method2940(i_23_, i_25_, 64, 86);
						method2940(i_23_ - 1, i_25_ - 1, 4, 67);
					}
				}
				if ((i ^ 0xffffffff) == -3) {
					if (i_24_ == 0) {
						method2940(i_23_, i_25_, 130, 109);
						method2940(i_23_ + -1, i_25_, 8, 105);
						method2940(i_23_, i_25_ + 1, 32, 83);
					}
					if ((i_24_ ^ 0xffffffff) == -2) {
						method2940(i_23_, i_25_, 10, 42);
						method2940(i_23_, i_25_ - -1, 32, 112);
						method2940(1 + i_23_, i_25_, 128, 34);
					}
					if (i_24_ == 2) {
						method2940(i_23_, i_25_, 40, 78);
						method2940(i_23_ + 1, i_25_, 128, 99);
						method2940(i_23_, -1 + i_25_, 2, 30);
					}
					if ((i_24_ ^ 0xffffffff) == -4) {
						method2940(i_23_, i_25_, 160, 66);
						method2940(i_23_, -1 + i_25_, 2, 30);
						method2940(-1 + i_23_, i_25_, 8, 86);
					}
				}
				if (bool) {
					if (i == 0) {
						if (i_24_ == 0) {
							method2940(i_23_, i_25_, 65536, 76);
							method2940(-1 + i_23_, i_25_, 4096, 41);
						}
						if ((i_24_ ^ 0xffffffff) == -2) {
							method2940(i_23_, i_25_, 1024, 94);
							method2940(i_23_, i_25_ - -1, 16384, 29);
						}
						if (i_24_ == 2) {
							method2940(i_23_, i_25_, 4096, 50);
							method2940(1 + i_23_, i_25_, 65536, 118);
						}
						if ((i_24_ ^ 0xffffffff) == -4) {
							method2940(i_23_, i_25_, 16384, 41);
							method2940(i_23_, -1 + i_25_, 1024, 69);
						}
					}
					if ((i ^ 0xffffffff) == -2 || i == 3) {
						if ((i_24_ ^ 0xffffffff) == -1) {
							method2940(i_23_, i_25_, 512, 34);
							method2940(i_23_ + -1, i_25_ - -1, 8192, 98);
						}
						if ((i_24_ ^ 0xffffffff) == -2) {
							method2940(i_23_, i_25_, 2048, 76);
							method2940(i_23_ - -1, i_25_ + 1, 32768, 60);
						}
						if ((i_24_ ^ 0xffffffff) == -3) {
							method2940(i_23_, i_25_, 8192, 100);
							method2940(1 + i_23_, -1 + i_25_, 512, 31);
						}
						if ((i_24_ ^ 0xffffffff) == -4) {
							method2940(i_23_, i_25_, 32768, 92);
							method2940(i_23_ - 1, -1 + i_25_, 2048, 111);
						}
					}
					if (i == 2) {
						if (i_24_ == 0) {
							method2940(i_23_, i_25_, 66560, 88);
							method2940(-1 + i_23_, i_25_, 4096, 99);
							method2940(i_23_, 1 + i_25_, 16384, 101);
						}
						if ((i_24_ ^ 0xffffffff) == -2) {
							method2940(i_23_, i_25_, 5120, 92);
							method2940(i_23_, i_25_ + 1, 16384, 54);
							method2940(i_23_ - -1, i_25_, 65536, 113);
						}
						if (i_24_ == 2) {
							method2940(i_23_, i_25_, 20480, 93);
							method2940(1 + i_23_, i_25_, 65536, 115);
							method2940(i_23_, -1 + i_25_, 1024, 34);
						}
						if ((i_24_ ^ 0xffffffff) == -4) {
							method2940(i_23_, i_25_, 81920, 37);
							method2940(i_23_, -1 + i_25_, 1024, 112);
							method2940(i_23_ + -1, i_25_, 4096, 34);
						}
					}
				}
				if (!bool_22_) {
					break;
				}
				if ((i ^ 0xffffffff) == -1) {
					if (i_24_ == 0) {
						method2940(i_23_, i_25_, 536870912, 71);
						method2940(-1 + i_23_, i_25_, 33554432, 86);
					}
					if ((i_24_ ^ 0xffffffff) == -2) {
						method2940(i_23_, i_25_, 8388608, 99);
						method2940(i_23_, 1 + i_25_, 134217728, 89);
					}
					if (i_24_ == 2) {
						method2940(i_23_, i_25_, 33554432, 91);
						method2940(1 + i_23_, i_25_, 536870912, 55);
					}
					if ((i_24_ ^ 0xffffffff) == -4) {
						method2940(i_23_, i_25_, 134217728, 82);
						method2940(i_23_, -1 + i_25_, 8388608, 117);
					}
				}
				if ((i ^ 0xffffffff) == -2 || i == 3) {
					if (i_24_ == 0) {
						method2940(i_23_, i_25_, 4194304, 78);
						method2940(i_23_ - 1, 1 + i_25_, 67108864, 106);
					}
					if ((i_24_ ^ 0xffffffff) == -2) {
						method2940(i_23_, i_25_, 16777216, 39);
						method2940(i_23_ + 1, i_25_ + 1, 268435456, 34);
					}
					if (i_24_ == 2) {
						method2940(i_23_, i_25_, 67108864, 31);
						method2940(i_23_ - -1, i_25_ - 1, 4194304, 65);
					}
					if (i_24_ == 3) {
						method2940(i_23_, i_25_, 268435456, 79);
						method2940(-1 + i_23_, -1 + i_25_, 16777216, 58);
					}
				}
				if ((i ^ 0xffffffff) != -3) {
					break;
				}
				if (i_24_ == 0) {
					method2940(i_23_, i_25_, 545259520, 79);
					method2940(i_23_ - 1, i_25_, 33554432, 51);
					method2940(i_23_, i_25_ - -1, 134217728, 53);
				}
				if (i_24_ == 1) {
					method2940(i_23_, i_25_, 41943040, 83);
					method2940(i_23_, i_25_ + 1, 134217728, 42);
					method2940(1 + i_23_, i_25_, 536870912, 39);
				}
				if ((i_24_ ^ 0xffffffff) == -3) {
					method2940(i_23_, i_25_, 167772160, 105);
					method2940(i_23_ + 1, i_25_, 536870912, 118);
					method2940(i_23_, -1 + i_25_, 8388608, 60);
				}
				if (i_24_ != 3) {
					break;
				}
				method2940(i_23_, i_25_, 671088640, 77);
				method2940(i_23_, -1 + i_25_, 8388608, 106);
				method2940(i_23_ - 1, i_25_, 33554432, 111);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("pfa.O(" + i
						+ ',' + bool + ',' + i_21_ + ',' + bool_22_ + ','
						+ i_23_ + ',' + i_24_ + ',' + i_25_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2938(int i, int i_27_, int i_28_, int i_29_,
			final int i_30_, final int i_31_, final int i_32_, int i_33_) {
		try {
			if (i_32_ != 1) {
				if (i >= i_33_
						&& i <= i_33_ - -i_32_ - 1
						&& i_29_ <= i_29_
						&& (i_29_ ^ 0xffffffff) >= (i_32_ + i_29_ + -1 ^ 0xffffffff)) {
					return true;
				}
			} else if (i_33_ == i
					&& (i_28_ ^ 0xffffffff) == (i_29_ ^ 0xffffffff)) {
				return true;
			}
			i_33_ -= anInt1854;
			i_28_ -= anInt1855;
			i_29_ -= anInt1855;
			if (i_31_ != 17761) {
				method2946(39, (byte) -56, -52);
			}
			i -= anInt1854;
			if (i_32_ == 1) {
				if ((i_30_ ^ 0xffffffff) == -7 || i_30_ == 7) {
					if ((i_30_ ^ 0xffffffff) == -8) {
						i_27_ = 2 + i_27_ & 0x3;
					}
					if (i_27_ != 0) {
						if ((i_27_ ^ 0xffffffff) == -2) {
							if (-1 + i == i_33_
									&& i_28_ == i_29_
									&& ((anIntArrayArray1853[i_33_][i_28_]) & 0x8) == 0) {
								return true;
							}
							if (i == i_33_
									&& (i_29_ + -1 ^ 0xffffffff) == (i_28_ ^ 0xffffffff)
									&& (0x2 & (anIntArrayArray1853[i_33_][i_28_])) == 0) {
								return true;
							}
						} else if ((i_27_ ^ 0xffffffff) == -3) {
							if (i_33_ == -1 + i
									&& (i_28_ ^ 0xffffffff) == (i_29_ ^ 0xffffffff)
									&& (0x8 & (anIntArrayArray1853[i_33_][i_28_])) == 0) {
								return true;
							}
							if (i_33_ == i
									&& (i_28_ ^ 0xffffffff) == (1 + i_29_ ^ 0xffffffff)
									&& (0x20 & (anIntArrayArray1853[i_33_][i_28_]) ^ 0xffffffff) == -1) {
								return true;
							}
						} else if (i_27_ == 3) {
							if ((i_33_ ^ 0xffffffff) == (i - -1 ^ 0xffffffff)
									&& i_29_ == i_28_
									&& (0x80 & (anIntArrayArray1853[i_33_][i_28_]) ^ 0xffffffff) == -1) {
								return true;
							}
							if ((i ^ 0xffffffff) == (i_33_ ^ 0xffffffff)
									&& (1 + i_29_ ^ 0xffffffff) == (i_28_ ^ 0xffffffff)
									&& (0x20 & (anIntArrayArray1853[i_33_][i_28_]) ^ 0xffffffff) == -1) {
								return true;
							}
						}
					} else {
						if ((i_33_ ^ 0xffffffff) == (1 + i ^ 0xffffffff)
								&& (i_29_ ^ 0xffffffff) == (i_28_ ^ 0xffffffff)
								&& (0x80 & (anIntArrayArray1853[i_33_][i_28_])) == 0) {
							return true;
						}
						if (i == i_33_
								&& -1 + i_29_ == i_28_
								&& (0x2 & (anIntArrayArray1853[i_33_][i_28_])) == 0) {
							return true;
						}
					}
				}
				if (i_30_ == 8) {
					if (i_33_ == i && 1 + i_29_ == i_28_
							&& (anIntArrayArray1853[i_33_][i_28_] & 0x20) == 0) {
						return true;
					}
					if (i == i_33_ && i_28_ == i_29_ - 1
							&& (anIntArrayArray1853[i_33_][i_28_] & 0x2) == 0) {
						return true;
					}
					if (i_33_ == -1 + i && i_28_ == i_29_
							&& (0x8 & (anIntArrayArray1853[i_33_][i_28_])) == 0) {
						return true;
					}
					if ((i_33_ ^ 0xffffffff) == (1 + i ^ 0xffffffff)
							&& i_28_ == i_29_
							&& (0x80 & (anIntArrayArray1853[i_33_][i_28_]) ^ 0xffffffff) == -1) {
						return true;
					}
				}
			} else {
				final int i_34_ = -1 + i_32_ + i_33_;
				final int i_35_ = i_32_ + (i_28_ - 1);
				if (i_30_ == 6 || (i_30_ ^ 0xffffffff) == -8) {
					if ((i_30_ ^ 0xffffffff) == -8) {
						i_27_ = i_27_ + 2 & 0x3;
					}
					if (i_27_ == 0) {
						if (i_33_ == 1 + i
								&& i_29_ >= i_28_
								&& i_35_ >= i_29_
								&& (0x80 & (anIntArrayArray1853[i_33_][i_29_])) == 0) {
							return true;
						}
						if ((i ^ 0xffffffff) <= (i_33_ ^ 0xffffffff)
								&& (i_34_ ^ 0xffffffff) <= (i ^ 0xffffffff)
								&& i_29_ + -i_32_ == i_28_
								&& (anIntArrayArray1853[i][i_35_] & 0x2) == 0) {
							return true;
						}
					} else if ((i_27_ ^ 0xffffffff) == -2) {
						if ((i_33_ ^ 0xffffffff) == (-i_32_ + i ^ 0xffffffff)
								&& i_29_ >= i_28_
								&& i_29_ <= i_35_
								&& (0x8 & (anIntArrayArray1853[i_34_][i_29_])) == 0) {
							return true;
						}
						if ((i ^ 0xffffffff) <= (i_33_ ^ 0xffffffff)
								&& (i_34_ ^ 0xffffffff) <= (i ^ 0xffffffff)
								&& i_28_ == i_29_ - i_32_
								&& (0x2 & (anIntArrayArray1853[i][i_35_]) ^ 0xffffffff) == -1) {
							return true;
						}
					} else if ((i_27_ ^ 0xffffffff) != -3) {
						if (i_27_ == 3) {
							if ((i_33_ ^ 0xffffffff) == (1 + i ^ 0xffffffff)
									&& (i_29_ ^ 0xffffffff) <= (i_28_ ^ 0xffffffff)
									&& (i_29_ ^ 0xffffffff) >= (i_35_ ^ 0xffffffff)
									&& (0x80 & (anIntArrayArray1853[i_33_][i_29_]) ^ 0xffffffff) == -1) {
								return true;
							}
							if ((i_33_ ^ 0xffffffff) >= (i ^ 0xffffffff)
									&& (i_34_ ^ 0xffffffff) <= (i ^ 0xffffffff)
									&& 1 + i_29_ == i_28_
									&& ((0x20 & (anIntArrayArray1853[i][i_28_])) == 0)) {
								return true;
							}
						}
					} else {
						if (i_33_ == -i_32_ + i
								&& (i_28_ ^ 0xffffffff) >= (i_29_ ^ 0xffffffff)
								&& i_35_ >= i_29_
								&& ((anIntArrayArray1853[i_34_][i_29_]) & 0x8 ^ 0xffffffff) == -1) {
							return true;
						}
						if (i_33_ <= i
								&& (i ^ 0xffffffff) >= (i_34_ ^ 0xffffffff)
								&& (i_28_ ^ 0xffffffff) == (i_29_ + 1 ^ 0xffffffff)
								&& (0x20 & (anIntArrayArray1853[i][i_28_])) == 0) {
							return true;
						}
					}
				}
				if (i_30_ == 8) {
					if (i_33_ <= i
							&& (i ^ 0xffffffff) >= (i_34_ ^ 0xffffffff)
							&& i_28_ == 1 + i_29_
							&& ((anIntArrayArray1853[i][i_28_] & 0x20) ^ 0xffffffff) == -1) {
						return true;
					}
					if (i >= i_33_
							&& (i ^ 0xffffffff) >= (i_34_ ^ 0xffffffff)
							&& (i_28_ ^ 0xffffffff) == (i_29_ - i_32_ ^ 0xffffffff)
							&& ((anIntArrayArray1853[i][i_35_] & 0x2) ^ 0xffffffff) == -1) {
						return true;
					}
					if (i_33_ == -i_32_ + i
							&& (i_29_ ^ 0xffffffff) <= (i_28_ ^ 0xffffffff)
							&& (i_35_ ^ 0xffffffff) <= (i_29_ ^ 0xffffffff)
							&& (anIntArrayArray1853[i_34_][i_29_] & 0x8) == 0) {
						return true;
					}
					if (i - -1 == i_33_
							&& (i_28_ ^ 0xffffffff) >= (i_29_ ^ 0xffffffff)
							&& i_35_ >= i_29_
							&& (anIntArrayArray1853[i_33_][i_29_] & 0x80) == 0) {
						return true;
					}
				}
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pfa.B(" + i + ','
					+ i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ','
					+ i_31_ + ',' + i_32_ + ',' + i_33_ + ')'));
		}
	}

	final boolean method2939(final int i, final int i_36_, final int i_37_,
			final int i_38_, final int i_39_, final int i_40_, final int i_41_,
			final int i_42_, final int i_43_) {
		try {
			if (i_39_ > 1) {
				if (Class98_Sub5.method960(i_36_, i, -126, i_37_, i_43_, i_42_,
						i_40_, i_39_, i_39_)) {
					return true;
				}
				return method2936(i_36_, i_43_, i_40_, -1, i_37_, i, i_39_,
						i_42_, i_39_, i_41_);
			}
			final int i_44_ = i_36_ - -i + -1;
			final int i_45_ = -1 + i_40_ - -i_43_;
			if ((i_36_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff) && i_44_ >= i_42_
					&& i_37_ >= i_40_
					&& (i_37_ ^ 0xffffffff) >= (i_45_ ^ 0xffffffff)) {
				return true;
			}
			if ((i_42_ ^ 0xffffffff) == (i_36_ - 1 ^ 0xffffffff)
					&& (i_37_ ^ 0xffffffff) <= (i_40_ ^ 0xffffffff)
					&& (i_45_ ^ 0xffffffff) <= (i_37_ ^ 0xffffffff)
					&& (0x8 & (anIntArrayArray1853[-anInt1854 + i_42_][i_37_
							- anInt1855])) == 0
					&& (i_41_ & 0x8 ^ 0xffffffff) == -1) {
				return true;
			}
			if ((1 + i_44_ ^ 0xffffffff) == (i_42_ ^ 0xffffffff)
					&& (i_40_ ^ 0xffffffff) >= (i_37_ ^ 0xffffffff)
					&& (i_45_ ^ 0xffffffff) <= (i_37_ ^ 0xffffffff)
					&& ((anIntArrayArray1853[-anInt1854 + i_42_][-anInt1855
							+ i_37_]) & 0x80 ^ 0xffffffff) == -1
					&& (0x2 & i_41_ ^ 0xffffffff) == -1) {
				return true;
			}
			if (i_40_ + -1 == i_37_
					&& i_36_ <= i_42_
					&& i_44_ >= i_42_
					&& (0x2 & (anIntArrayArray1853[i_42_ - anInt1854][i_37_
							+ -anInt1855]) ^ 0xffffffff) == -1
					&& (i_41_ & 0x4) == 0) {
				return true;
			}
			if (i_38_ != 14672) {
				return false;
			}
			if ((i_37_ ^ 0xffffffff) == (1 + i_45_ ^ 0xffffffff)
					&& (i_36_ ^ 0xffffffff) >= (i_42_ ^ 0xffffffff)
					&& (i_42_ ^ 0xffffffff) >= (i_44_ ^ 0xffffffff)
					&& (0x20 & (anIntArrayArray1853[-anInt1854 + i_42_][-anInt1855
							+ i_37_]) ^ 0xffffffff) == -1
					&& (0x1 & i_41_ ^ 0xffffffff) == -1) {
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pfa.P(" + i + ','
					+ i_36_ + ',' + i_37_ + ',' + i_38_ + ',' + i_39_ + ','
					+ i_40_ + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ')'));
		}
	}

	private final void method2940(final int i, final int i_46_,
			final int i_47_, final int i_48_) {
		try {
			if (i_48_ <= 28) {
				method2938(30, 97, -75, -102, 18, -47, -86, 19);
			}
			anIntArrayArray1853[i][i_46_] = Class202.method2702(
					(anIntArrayArray1853[i][i_46_]), i_47_ ^ 0xffffffff);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pfa.N(" + i + ','
					+ i_46_ + ',' + i_47_ + ',' + i_48_ + ')'));
		}
	}

	final void method2941(int i, final int i_49_, int i_50_) {
		try {
			i_50_ -= anInt1854;
			i -= anInt1855;
			if (i_49_ != 23254) {
				method2945(-47, true, false, 44, -19, -64, (byte) -46);
			}
			anIntArrayArray1853[i_50_][i] = Class41.method366(
					(anIntArrayArray1853[i_50_][i]), 2097152);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pfa.D(" + i + ','
					+ i_49_ + ',' + i_50_ + ')'));
		}
	}

	static final void method2942(final int i) {
		try {
			synchronized (Class211.aClass79_1594) {
				Class211.aClass79_1594.method806((byte) 29);
				if (i != 1) {
					anInt1852 = 11;
				}
			}
			synchronized (PlayerUpdate.aClass79_3411) {
				PlayerUpdate.aClass79_3411.method806((byte) 80);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pfa.A(" + i + ')');
		}
	}

	static final void method2943(final float[] fs, int i, final int i_51_,
			final int i_52_, final float[] fs_53_, int i_54_, final int i_55_,
			final float f, int i_56_, final int i_57_, final int i_58_) {
		try {
			if (i_58_ < 101) {
				anInt1852 = 104;
			}
			i_54_ -= i_52_;
			i -= i_55_;
			i_56_ -= i_57_;
			final float f_59_ = (i * fs_53_[1] + fs_53_[0] * i_56_ + i_54_
					* fs_53_[2]);
			final float f_60_ = (i_54_ * fs_53_[5] + (fs_53_[3] * i_56_ + fs_53_[4]
					* i));
			final float f_61_ = (i_56_ * fs_53_[6] + fs_53_[7] * i + fs_53_[8]
					* i_54_);
			final float f_62_ = (float) Math.sqrt(f_60_ * f_60_ + f_59_ * f_59_
					+ f_61_ * f_61_);
			float f_63_ = (((float) Math.atan2(f_59_, f_61_) / 6.2831855F) + 0.5F);
			float f_64_ = (0.5F + (float) Math.asin(f_60_ / f_62_) / 3.1415927F + f);
			if (i_51_ == 1) {
				final float f_65_ = f_63_;
				f_63_ = -f_64_;
				f_64_ = f_65_;
			} else if (i_51_ == 2) {
				f_63_ = -f_63_;
				f_64_ = -f_64_;
			} else if ((i_51_ ^ 0xffffffff) == -4) {
				final float f_66_ = f_63_;
				f_63_ = f_64_;
				f_64_ = -f_66_;
			}
			fs[0] = f_63_;
			fs[1] = f_64_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pfa.E("
					+ (fs != null ? "{...}" : "null") + ',' + i + ',' + i_51_
					+ ',' + i_52_ + ',' + (fs_53_ != null ? "{...}" : "null")
					+ ',' + i_54_ + ',' + i_55_ + ',' + f + ',' + i_56_ + ','
					+ i_57_ + ',' + i_58_ + ')'));
		}
	}

	final void method2944(int i, final int i_67_, int i_68_) {
		try {
			i -= anInt1855;
			if (i_67_ >= 28) {
				i_68_ -= anInt1854;
				anIntArrayArray1853[i_68_][i] = Class202.method2702(
						(anIntArrayArray1853[i_68_][i]), -2097153);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pfa.H(" + i + ','
					+ i_67_ + ',' + i_68_ + ')'));
		}
	}

	final void method2945(int i, final boolean bool, final boolean bool_69_,
			final int i_70_, int i_71_, final int i_72_, final byte i_73_) {// IMPORTANT
		do {
			try {
				i -= anInt1855;
				if (i_73_ < 63) {
					anInt1857 = 59;
				}
				i_71_ -= anInt1854;
				if ((i_72_ ^ 0xffffffff) == -1) {
					if ((i_70_ ^ 0xffffffff) == -1) {
						method2947(i_71_, 128, (byte) -25, i);
						method2947(-1 + i_71_, 8, (byte) -23, i);
					}
					if ((i_70_ ^ 0xffffffff) == -2) {
						method2947(i_71_, 2, (byte) -96, i);
						method2947(i_71_, 32, (byte) -89, 1 + i);
					}
					if (i_70_ == 2) {
						method2947(i_71_, 8, (byte) -54, i);
						method2947(1 + i_71_, 128, (byte) -114, i);
					}
					if ((i_70_ ^ 0xffffffff) == -4) {
						method2947(i_71_, 32, (byte) -104, i);
						method2947(i_71_, 2, (byte) -20, i + -1);
					}
				}
				if (i_72_ == 1 || (i_72_ ^ 0xffffffff) == -4) {
					if (i_70_ == 0) {
						method2947(i_71_, 1, (byte) -119, i);
						method2947(i_71_ - 1, 16, (byte) -68, 1 + i);
					}
					if ((i_70_ ^ 0xffffffff) == -2) {
						method2947(i_71_, 4, (byte) -99, i);
						method2947(i_71_ - -1, 64, (byte) -45, i - -1);
					}
					if ((i_70_ ^ 0xffffffff) == -3) {
						method2947(i_71_, 16, (byte) -49, i);
						method2947(i_71_ + 1, 1, (byte) -73, i - 1);
					}
					if (i_70_ == 3) {
						method2947(i_71_, 64, (byte) -53, i);
						method2947(-1 + i_71_, 4, (byte) -82, -1 + i);
					}
				}
				if (i_72_ == 2) {
					if (i_70_ == 0) {
						method2947(i_71_, 130, (byte) -52, i);
						method2947(-1 + i_71_, 8, (byte) -33, i);
						method2947(i_71_, 32, (byte) -26, i + 1);
					}
					if (i_70_ == 1) {
						method2947(i_71_, 10, (byte) -53, i);
						method2947(i_71_, 32, (byte) -112, i + 1);
						method2947(1 + i_71_, 128, (byte) -71, i);
					}
					if (i_70_ == 2) {
						method2947(i_71_, 40, (byte) -72, i);
						method2947(1 + i_71_, 128, (byte) -113, i);
						method2947(i_71_, 2, (byte) -111, -1 + i);
					}
					if (i_70_ == 3) {
						method2947(i_71_, 160, (byte) -90, i);
						method2947(i_71_, 2, (byte) -45, -1 + i);
						method2947(-1 + i_71_, 8, (byte) -95, i);
					}
				}
				if (bool) {
					if (i_72_ == 0) {
						if ((i_70_ ^ 0xffffffff) == -1) {
							method2947(i_71_, 65536, (byte) -30, i);
							method2947(i_71_ + -1, 4096, (byte) -126, i);
						}
						if ((i_70_ ^ 0xffffffff) == -2) {
							method2947(i_71_, 1024, (byte) -102, i);
							method2947(i_71_, 16384, (byte) -92, 1 + i);
						}
						if ((i_70_ ^ 0xffffffff) == -3) {
							method2947(i_71_, 4096, (byte) -105, i);
							method2947(i_71_ + 1, 65536, (byte) -39, i);
						}
						if (i_70_ == 3) {
							method2947(i_71_, 16384, (byte) -111, i);
							method2947(i_71_, 1024, (byte) -106, i + -1);
						}
					}
					if (i_72_ == 1 || (i_72_ ^ 0xffffffff) == -4) {
						if (i_70_ == 0) {
							method2947(i_71_, 512, (byte) -128, i);
							method2947(i_71_ - 1, 8192, (byte) -60, 1 + i);
						}
						if ((i_70_ ^ 0xffffffff) == -2) {
							method2947(i_71_, 2048, (byte) -78, i);
							method2947(i_71_ - -1, 32768, (byte) -81, i - -1);
						}
						if (i_70_ == 2) {
							method2947(i_71_, 8192, (byte) -50, i);
							method2947(1 + i_71_, 512, (byte) -92, -1 + i);
						}
						if ((i_70_ ^ 0xffffffff) == -4) {
							method2947(i_71_, 32768, (byte) -85, i);
							method2947(-1 + i_71_, 2048, (byte) -27, i - 1);
						}
					}
					if (i_72_ == 2) {
						if ((i_70_ ^ 0xffffffff) == -1) {
							method2947(i_71_, 66560, (byte) -49, i);
							method2947(-1 + i_71_, 4096, (byte) -27, i);
							method2947(i_71_, 16384, (byte) -72, 1 + i);
						}
						if (i_70_ == 1) {
							method2947(i_71_, 5120, (byte) -83, i);
							method2947(i_71_, 16384, (byte) -95, 1 + i);
							method2947(i_71_ - -1, 65536, (byte) -110, i);
						}
						if (i_70_ == 2) {
							method2947(i_71_, 20480, (byte) -72, i);
							method2947(i_71_ - -1, 65536, (byte) -36, i);
							method2947(i_71_, 1024, (byte) -27, i - 1);
						}
						if ((i_70_ ^ 0xffffffff) == -4) {
							method2947(i_71_, 81920, (byte) -26, i);
							method2947(i_71_, 1024, (byte) -112, i + -1);
							method2947(i_71_ - 1, 4096, (byte) -108, i);
						}
					}
				}
				if (!bool_69_) {
					break;
				}
				if ((i_72_ ^ 0xffffffff) == -1) {
					if ((i_70_ ^ 0xffffffff) == -1) {
						method2947(i_71_, 536870912, (byte) -67, i);
						method2947(i_71_ - 1, 33554432, (byte) -84, i);
					}
					if (i_70_ == 1) {
						method2947(i_71_, 8388608, (byte) -24, i);
						method2947(i_71_, 134217728, (byte) -107, i + 1);
					}
					if (i_70_ == 2) {
						method2947(i_71_, 33554432, (byte) -86, i);
						method2947(1 + i_71_, 536870912, (byte) -24, i);
					}
					if ((i_70_ ^ 0xffffffff) == -4) {
						method2947(i_71_, 134217728, (byte) -46, i);
						method2947(i_71_, 8388608, (byte) -47, i + -1);
					}
				}
				if (i_72_ == 1 || (i_72_ ^ 0xffffffff) == -4) {
					if ((i_70_ ^ 0xffffffff) == -1) {
						method2947(i_71_, 4194304, (byte) -50, i);
						method2947(-1 + i_71_, 67108864, (byte) -123, 1 + i);
					}
					if (i_70_ == 1) {
						method2947(i_71_, 16777216, (byte) -39, i);
						method2947(1 + i_71_, 268435456, (byte) -103, 1 + i);
					}
					if (i_70_ == 2) {
						method2947(i_71_, 67108864, (byte) -41, i);
						method2947(i_71_ - -1, 4194304, (byte) -34, i + -1);
					}
					if ((i_70_ ^ 0xffffffff) == -4) {
						method2947(i_71_, 268435456, (byte) -33, i);
						method2947(i_71_ - 1, 16777216, (byte) -79, -1 + i);
					}
				}
				if (i_72_ != 2) {
					break;
				}
				if ((i_70_ ^ 0xffffffff) == -1) {
					method2947(i_71_, 545259520, (byte) -70, i);
					method2947(-1 + i_71_, 33554432, (byte) -66, i);
					method2947(i_71_, 134217728, (byte) -36, 1 + i);
				}
				if ((i_70_ ^ 0xffffffff) == -2) {
					method2947(i_71_, 41943040, (byte) -29, i);
					method2947(i_71_, 134217728, (byte) -96, 1 + i);
					method2947(1 + i_71_, 536870912, (byte) -72, i);
				}
				if ((i_70_ ^ 0xffffffff) == -3) {
					method2947(i_71_, 167772160, (byte) -112, i);
					method2947(i_71_ + 1, 536870912, (byte) -93, i);
					method2947(i_71_, 8388608, (byte) -114, i - 1);
				}
				if ((i_70_ ^ 0xffffffff) != -4) {
					break;
				}
				method2947(i_71_, 671088640, (byte) -66, i);
				method2947(i_71_, 8388608, (byte) -124, i + -1);
				method2947(-1 + i_71_, 33554432, (byte) -117, i);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("pfa.K(" + i
						+ ',' + bool + ',' + bool_69_ + ',' + i_70_ + ','
						+ i_71_ + ',' + i_72_ + ',' + i_73_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2946(int i, final byte i_74_, int i_75_) {
		try {
			i_75_ -= anInt1855;
			if (i_74_ != -14) {
				method2944(92, -7, 34);
			}
			i -= anInt1854;
			anIntArrayArray1853[i][i_75_] = Class41.method366(
					(anIntArrayArray1853[i][i_75_]), 262144);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pfa.I(" + i + ','
					+ i_74_ + ',' + i_75_ + ')'));
		}
	}

	private final void method2947(final int i, final int i_76_,
			final byte i_77_, final int i_78_) {
		try {
			if (i_77_ >= -17) {
				method2944(105, 35, 75);
			}
			anIntArrayArray1853[i][i_78_] = Class41.method366(
					(anIntArrayArray1853[i][i_78_]), i_76_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pfa.G(" + i + ','
					+ i_76_ + ',' + i_77_ + ',' + i_78_ + ')'));
		}
	}

	final void method2948(final boolean bool, int i, int i_79_) {
		try {
			i_79_ -= anInt1855;
			i -= anInt1854;
			if (bool != false) {
				method2945(0, false, false, 89, 74, -95, (byte) -85);
			}
			anIntArrayArray1853[i][i_79_] = Class202.method2702(
					(anIntArrayArray1853[i][i_79_]), -262145);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pfa.M(" + bool
					+ ',' + i + ',' + i_79_ + ')'));
		}
	}

	final void method2949(final int i, final boolean bool, int i_80_,
			final int i_81_, final int i_82_, final boolean bool_83_, int i_84_) {// IMPORTANT
		try {
			int i_85_ = 256;
			if (bool_83_) {
				i_85_ |= 0x20000;
			}
			i_80_ -= anInt1854;
			if (i != 0) {
				method2946(-43, (byte) 16, 91);
			}
			if (bool) {
				i_85_ |= 0x40000000;
			}
			i_84_ -= anInt1855;
			for (int i_86_ = i_80_; i_80_ - -i_82_ > i_86_; i_86_++) {
				if ((i_86_ ^ 0xffffffff) <= -1
						&& (i_86_ ^ 0xffffffff) > (anInt1857 ^ 0xffffffff)) {
					for (int i_87_ = i_84_; (i_87_ ^ 0xffffffff) > (i_84_
							- -i_81_ ^ 0xffffffff); i_87_++) {
						if (i_87_ >= 0 && i_87_ < anInt1856) {
							method2947(i_86_, i_85_, (byte) -51, i_87_);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pfa.L(" + i + ','
					+ bool + ',' + i_80_ + ',' + i_81_ + ',' + i_82_ + ','
					+ bool_83_ + ',' + i_84_ + ')'));
		}
	}

	final void method2950(final byte i) {
		try {
			int i_88_ = 0;
			if (i == -99) {
				for (/**/; ((anInt1857 ^ 0xffffffff) < (i_88_ ^ 0xffffffff)); i_88_++) {
					for (int i_89_ = 0; i_89_ < anInt1856; i_89_++) {
						if (i_88_ != 0
								&& i_89_ != 0
								&& i_88_ < anInt1857 - 5
								&& ((i_89_ ^ 0xffffffff) > (anInt1856 + -5 ^ 0xffffffff))) {
							anIntArrayArray1853[i_88_][i_89_] = 2097152;
						} else {
							anIntArrayArray1853[i_88_][i_89_] = -1;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "pfa.Q(" + i + ')');
		}
	}

	final void method2951(int i, final boolean bool, final int i_90_,
			int i_91_, int i_92_, final boolean bool_93_, final int i_94_,
			int i_95_) {
		do {
			try {
				int i_96_ = 256;
				if (bool) {
					i_96_ |= 0x20000;
				}
				if (bool_93_) {
					i_96_ |= 0x40000000;
				}
				if (i_90_ == 1 || (i_90_ ^ 0xffffffff) == -4) {
					final int i_97_ = i;
					i = i_91_;
					i_91_ = i_97_;
				}
				i_92_ -= anInt1855;
				i_95_ -= anInt1854;
				for (int i_98_ = i_95_; (i + i_95_ ^ 0xffffffff) < (i_98_ ^ 0xffffffff); i_98_++) {
					if (i_98_ >= 0
							&& (i_98_ ^ 0xffffffff) > (anInt1857 ^ 0xffffffff)) {
						for (int i_99_ = i_92_; ((i_99_ ^ 0xffffffff) > (i_92_
								+ i_91_ ^ 0xffffffff)); i_99_++) {
							if ((i_99_ ^ 0xffffffff) <= -1
									&& ((anInt1856 ^ 0xffffffff) < (i_99_ ^ 0xffffffff))) {
								method2940(i_98_, i_99_, i_96_, 75);
							}
						}
					}
				}
				if (i_94_ == 131072) {
					break;
				}
				method2938(-71, -69, -92, -110, 104, -115, 29, -10);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("pfa.J(" + i
						+ ',' + bool + ',' + i_90_ + ',' + i_91_ + ',' + i_92_
						+ ',' + bool_93_ + ',' + i_94_ + ',' + i_95_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2952(int i, int i_100_, final byte i_101_,
			final int i_102_, int i_103_, final int i_104_, int i_105_,
			final int i_106_) {
		try {
			if ((i_102_ ^ 0xffffffff) != -2) {
				if (i_100_ <= i_105_ && i_105_ <= -1 + (i_100_ + i_102_)
						&& i <= i && i_102_ + i - 1 >= i) {
					return true;
				}
			} else if (i_100_ == i_105_
					&& (i_103_ ^ 0xffffffff) == (i ^ 0xffffffff)) {
				return true;
			}
			i_103_ -= anInt1855;
			i_100_ -= anInt1854;
			i -= anInt1855;
			i_105_ -= anInt1854;
			if ((i_102_ ^ 0xffffffff) != -2) {
				final int i_108_ = i_100_ - -i_102_ - 1;
				final int i_109_ = -1 + i_102_ + i_103_;
				if ((i_106_ ^ 0xffffffff) == -1) {
					if (i_104_ == 0) {
						if ((i_100_ ^ 0xffffffff) == (i_105_ + -i_102_ ^ 0xffffffff)
								&& i_103_ <= i
								&& (i_109_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
							return true;
						}
						if (i_105_ >= i_100_
								&& (i_108_ ^ 0xffffffff) <= (i_105_ ^ 0xffffffff)
								&& i + 1 == i_103_
								&& ((anIntArrayArray1853[i_105_][i_103_]) & 0x2c0120 ^ 0xffffffff) == -1) {
							return true;
						}
						if (i_100_ <= i_105_
								&& (i_105_ ^ 0xffffffff) >= (i_108_ ^ 0xffffffff)
								&& i_103_ == -i_102_ + i
								&& ((anIntArrayArray1853[i_105_][i_109_]) & 0x2c0102) == 0) {
							return true;
						}
					} else if (i_104_ == 1) {
						if (i_100_ <= i_105_
								&& (i_108_ ^ 0xffffffff) <= (i_105_ ^ 0xffffffff)
								&& (1 + i ^ 0xffffffff) == (i_103_ ^ 0xffffffff)) {
							return true;
						}
						if (i_105_ + -i_102_ == i_100_
								&& (i ^ 0xffffffff) <= (i_103_ ^ 0xffffffff)
								&& (i_109_ ^ 0xffffffff) <= (i ^ 0xffffffff)
								&& ((anIntArrayArray1853[i_108_][i]) & 0x2c0108 ^ 0xffffffff) == -1) {
							return true;
						}
						if (i_105_ + 1 == i_100_
								&& i >= i_103_
								&& i_109_ >= i
								&& ((anIntArrayArray1853[i_100_][i]) & 0x2c0180 ^ 0xffffffff) == -1) {
							return true;
						}
					} else if ((i_104_ ^ 0xffffffff) != -3) {
						if ((i_104_ ^ 0xffffffff) == -4) {
							if ((i_105_ ^ 0xffffffff) <= (i_100_ ^ 0xffffffff)
									&& i_108_ >= i_105_
									&& ((-i_102_ + i ^ 0xffffffff) == (i_103_ ^ 0xffffffff))) {
								return true;
							}
							if (-i_102_ + i_105_ == i_100_
									&& i_103_ <= i
									&& i <= i_109_
									&& ((anIntArrayArray1853[i_108_][i]) & 0x2c0108 ^ 0xffffffff) == -1) {
								return true;
							}
							if (i_105_ + 1 == i_100_
									&& i_103_ <= i
									&& (i ^ 0xffffffff) >= (i_109_ ^ 0xffffffff)
									&& ((anIntArrayArray1853[i_100_][i]) & 0x2c0180 ^ 0xffffffff) == -1) {
								return true;
							}
						}
					} else {
						if ((i_100_ ^ 0xffffffff) == (i_105_ + 1 ^ 0xffffffff)
								&& i >= i_103_
								&& (i_109_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
							return true;
						}
						if ((i_105_ ^ 0xffffffff) <= (i_100_ ^ 0xffffffff)
								&& (i_108_ ^ 0xffffffff) <= (i_105_ ^ 0xffffffff)
								&& i - -1 == i_103_
								&& (0x2c0120 & (anIntArrayArray1853[i_105_][i_103_])) == 0) {
							return true;
						}
						if ((i_105_ ^ 0xffffffff) <= (i_100_ ^ 0xffffffff)
								&& (i_105_ ^ 0xffffffff) >= (i_108_ ^ 0xffffffff)
								&& (i_103_ ^ 0xffffffff) == (i - i_102_ ^ 0xffffffff)
								&& (0x2c0102 & (anIntArrayArray1853[i_105_][i_109_])) == 0) {
							return true;
						}
					}
				}
				if ((i_106_ ^ 0xffffffff) == -3) {
					if (i_104_ != 0) {
						if (i_104_ == 1) {
							if ((i_100_ ^ 0xffffffff) == (i_105_ + -i_102_ ^ 0xffffffff)
									&& i >= i_103_
									&& (i ^ 0xffffffff) >= (i_109_ ^ 0xffffffff)
									&& (0x2c0108 & (anIntArrayArray1853[i_108_][i]) ^ 0xffffffff) == -1) {
								return true;
							}
							if (i_100_ <= i_105_
									&& (i_108_ ^ 0xffffffff) <= (i_105_ ^ 0xffffffff)
									&& (i_103_ ^ 0xffffffff) == (1 + i ^ 0xffffffff)) {
								return true;
							}
							if ((1 + i_105_ ^ 0xffffffff) == (i_100_ ^ 0xffffffff)
									&& i >= i_103_ && i <= i_109_) {
								return true;
							}
							if ((i_105_ ^ 0xffffffff) <= (i_100_ ^ 0xffffffff)
									&& i_105_ <= i_108_
									&& i_103_ == i - i_102_
									&& (0x2c0102 & (anIntArrayArray1853[i_105_][i_109_])) == 0) {
								return true;
							}
						} else if ((i_104_ ^ 0xffffffff) == -3) {
							if (i_100_ == i_105_ - i_102_
									&& i >= i_103_
									&& (i_109_ ^ 0xffffffff) <= (i ^ 0xffffffff)
									&& ((anIntArrayArray1853[i_108_][i]) & 0x2c0108) == 0) {
								return true;
							}
							if ((i_100_ ^ 0xffffffff) >= (i_105_ ^ 0xffffffff)
									&& i_105_ <= i_108_
									&& i_103_ == i + 1
									&& ((anIntArrayArray1853[i_105_][i_103_]) & 0x2c0120 ^ 0xffffffff) == -1) {
								return true;
							}
							if (1 + i_105_ == i_100_
									&& (i ^ 0xffffffff) <= (i_103_ ^ 0xffffffff)
									&& i <= i_109_) {
								return true;
							}
							if (i_105_ >= i_100_
									&& i_108_ >= i_105_
									&& (i_103_ ^ 0xffffffff) == (-i_102_ + i ^ 0xffffffff)) {
								return true;
							}
						} else if (i_104_ == 3) {
							if (((-i_102_ + i_105_ ^ 0xffffffff) == (i_100_ ^ 0xffffffff))
									&& i >= i_103_ && i <= i_109_) {
								return true;
							}
							if ((i_100_ ^ 0xffffffff) >= (i_105_ ^ 0xffffffff)
									&& (i_105_ ^ 0xffffffff) >= (i_108_ ^ 0xffffffff)
									&& (i_103_ ^ 0xffffffff) == (i - -1 ^ 0xffffffff)
									&& (0x2c0120 & (anIntArrayArray1853[i_105_][i_103_]) ^ 0xffffffff) == -1) {
								return true;
							}
							if (i_100_ == i_105_ + 1
									&& (i_103_ ^ 0xffffffff) >= (i ^ 0xffffffff)
									&& i <= i_109_
									&& ((anIntArrayArray1853[i_100_][i]) & 0x2c0180) == 0) {
								return true;
							}
							if ((i_100_ ^ 0xffffffff) >= (i_105_ ^ 0xffffffff)
									&& i_108_ >= i_105_
									&& (i_103_ ^ 0xffffffff) == (-i_102_ + i ^ 0xffffffff)) {
								return true;
							}
						}
					} else {
						if (i_105_ + -i_102_ == i_100_ && i >= i_103_
								&& (i ^ 0xffffffff) >= (i_109_ ^ 0xffffffff)) {
							return true;
						}
						if ((i_100_ ^ 0xffffffff) >= (i_105_ ^ 0xffffffff)
								&& i_108_ >= i_105_
								&& (i_103_ ^ 0xffffffff) == (1 + i ^ 0xffffffff)) {
							return true;
						}
						if ((i_100_ ^ 0xffffffff) == (1 + i_105_ ^ 0xffffffff)
								&& (i_103_ ^ 0xffffffff) >= (i ^ 0xffffffff)
								&& i <= i_109_
								&& ((anIntArrayArray1853[i_100_][i]) & 0x2c0180 ^ 0xffffffff) == -1) {
							return true;
						}
						if ((i_100_ ^ 0xffffffff) >= (i_105_ ^ 0xffffffff)
								&& (i_105_ ^ 0xffffffff) >= (i_108_ ^ 0xffffffff)
								&& (i + -i_102_ ^ 0xffffffff) == (i_103_ ^ 0xffffffff)
								&& (0x2c0102 & (anIntArrayArray1853[i_105_][i_109_])) == 0) {
							return true;
						}
					}
				}
				if (i_106_ == 9) {
					if (i_105_ >= i_100_
							&& i_108_ >= i_105_
							&& 1 + i == i_103_
							&& (0x2c0120 & (anIntArrayArray1853[i_105_][i_103_])) == 0) {
						return true;
					}
					if (i_105_ >= i_100_
							&& (i_108_ ^ 0xffffffff) <= (i_105_ ^ 0xffffffff)
							&& (i - i_102_ ^ 0xffffffff) == (i_103_ ^ 0xffffffff)
							&& ((anIntArrayArray1853[i_105_][i_109_]) & 0x2c0102) == 0) {
						return true;
					}
					if ((i_105_ - i_102_ ^ 0xffffffff) == (i_100_ ^ 0xffffffff)
							&& i_103_ <= i
							&& i_109_ >= i
							&& ((anIntArrayArray1853[i_108_][i] & 0x2c0108) ^ 0xffffffff) == -1) {
						return true;
					}
					if ((i_100_ ^ 0xffffffff) == (1 + i_105_ ^ 0xffffffff)
							&& (i ^ 0xffffffff) <= (i_103_ ^ 0xffffffff)
							&& i <= i_109_
							&& (0x2c0180 & (anIntArrayArray1853[i_100_][i])) == 0) {
						return true;
					}
				}
			} else {
				if ((i_106_ ^ 0xffffffff) == -1) {
					if ((i_104_ ^ 0xffffffff) != -1) {
						if (i_104_ == 1) {
							if ((i_100_ ^ 0xffffffff) == (i_105_ ^ 0xffffffff)
									&& 1 + i == i_103_) {
								return true;
							}
							if ((i_100_ ^ 0xffffffff) == (i_105_ - 1 ^ 0xffffffff)
									&& i_103_ == i
									&& ((anIntArrayArray1853[i_100_][i_103_]) & 0x2c0108 ^ 0xffffffff) == -1) {
								return true;
							}
							if ((i_100_ ^ 0xffffffff) == (i_105_ - -1 ^ 0xffffffff)
									&& i == i_103_
									&& ((anIntArrayArray1853[i_100_][i_103_]) & 0x2c0180) == 0) {
								return true;
							}
						} else if ((i_104_ ^ 0xffffffff) != -3) {
							if (i_104_ == 3) {
								if ((i_105_ ^ 0xffffffff) == (i_100_ ^ 0xffffffff)
										&& -1 + i == i_103_) {
									return true;
								}
								if (i_105_ - 1 == i_100_
										&& (i ^ 0xffffffff) == (i_103_ ^ 0xffffffff)
										&& ((anIntArrayArray1853[i_100_][i_103_]) & 0x2c0108) == 0) {
									return true;
								}
								if (i_105_ - -1 == i_100_
										&& (i_103_ ^ 0xffffffff) == (i ^ 0xffffffff)
										&& ((anIntArrayArray1853[i_100_][i_103_]) & 0x2c0180) == 0) {
									return true;
								}
							}
						} else {
							if ((1 + i_105_ ^ 0xffffffff) == (i_100_ ^ 0xffffffff)
									&& (i_103_ ^ 0xffffffff) == (i ^ 0xffffffff)) {
								return true;
							}
							if (i_105_ == i_100_
									&& (i_103_ ^ 0xffffffff) == (1 + i ^ 0xffffffff)
									&& (0x2c0120 & (anIntArrayArray1853[i_100_][i_103_]) ^ 0xffffffff) == -1) {
								return true;
							}
							if ((i_100_ ^ 0xffffffff) == (i_105_ ^ 0xffffffff)
									&& (i_103_ ^ 0xffffffff) == (i + -1 ^ 0xffffffff)
									&& (0x2c0102 & (anIntArrayArray1853[i_100_][i_103_])) == 0) {
								return true;
							}
						}
					} else {
						if (i_100_ == i_105_ - 1 && i == i_103_) {
							return true;
						}
						if (i_100_ == i_105_
								&& (1 + i ^ 0xffffffff) == (i_103_ ^ 0xffffffff)
								&& (0x2c0120 & (anIntArrayArray1853[i_100_][i_103_])) == 0) {
							return true;
						}
						if (i_105_ == i_100_
								&& i_103_ == i - 1
								&& (0x2c0102 & (anIntArrayArray1853[i_100_][i_103_])) == 0) {
							return true;
						}
					}
				}
				if (i_106_ == 2) {
					if ((i_104_ ^ 0xffffffff) == -1) {
						if ((-1 + i_105_ ^ 0xffffffff) == (i_100_ ^ 0xffffffff)
								&& (i ^ 0xffffffff) == (i_103_ ^ 0xffffffff)) {
							return true;
						}
						if (i_100_ == i_105_ && 1 + i == i_103_) {
							return true;
						}
						if ((i_100_ ^ 0xffffffff) == (1 + i_105_ ^ 0xffffffff)
								&& i == i_103_
								&& ((anIntArrayArray1853[i_100_][i_103_]) & 0x2c0180) == 0) {
							return true;
						}
						if ((i_100_ ^ 0xffffffff) == (i_105_ ^ 0xffffffff)
								&& (i_103_ ^ 0xffffffff) == (-1 + i ^ 0xffffffff)
								&& (0x2c0102 & (anIntArrayArray1853[i_100_][i_103_]) ^ 0xffffffff) == -1) {
							return true;
						}
					} else if ((i_104_ ^ 0xffffffff) != -2) {
						if ((i_104_ ^ 0xffffffff) == -3) {
							if ((i_100_ ^ 0xffffffff) == (i_105_ - 1 ^ 0xffffffff)
									&& i_103_ == i
									&& ((anIntArrayArray1853[i_100_][i_103_]) & 0x2c0108) == 0) {
								return true;
							}
							if ((i_100_ ^ 0xffffffff) == (i_105_ ^ 0xffffffff)
									&& i + 1 == i_103_
									&& (0x2c0120 & (anIntArrayArray1853[i_100_][i_103_])) == 0) {
								return true;
							}
							if ((i_100_ ^ 0xffffffff) == (i_105_ - -1 ^ 0xffffffff)
									&& i_103_ == i) {
								return true;
							}
							if (i_100_ == i_105_
									&& (i_103_ ^ 0xffffffff) == (-1 + i ^ 0xffffffff)) {
								return true;
							}
						} else if (i_104_ == 3) {
							if (i_100_ == i_105_ + -1
									&& (i_103_ ^ 0xffffffff) == (i ^ 0xffffffff)) {
								return true;
							}
							if (i_100_ == i_105_
									&& 1 + i == i_103_
									&& ((anIntArrayArray1853[i_100_][i_103_]) & 0x2c0120 ^ 0xffffffff) == -1) {
								return true;
							}
							if ((i_100_ ^ 0xffffffff) == (i_105_ + 1 ^ 0xffffffff)
									&& i_103_ == i
									&& ((anIntArrayArray1853[i_100_][i_103_]) & 0x2c0180 ^ 0xffffffff) == -1) {
								return true;
							}
							if ((i_105_ ^ 0xffffffff) == (i_100_ ^ 0xffffffff)
									&& i_103_ == -1 + i) {
								return true;
							}
						}
					} else {
						if ((i_100_ ^ 0xffffffff) == (i_105_ - 1 ^ 0xffffffff)
								&& (i_103_ ^ 0xffffffff) == (i ^ 0xffffffff)
								&& ((anIntArrayArray1853[i_100_][i_103_]) & 0x2c0108 ^ 0xffffffff) == -1) {
							return true;
						}
						if (i_100_ == i_105_ && i_103_ == 1 + i) {
							return true;
						}
						if (i_100_ == i_105_ + 1
								&& (i_103_ ^ 0xffffffff) == (i ^ 0xffffffff)) {
							return true;
						}
						if ((i_100_ ^ 0xffffffff) == (i_105_ ^ 0xffffffff)
								&& (-1 + i ^ 0xffffffff) == (i_103_ ^ 0xffffffff)
								&& (0x2c0102 & (anIntArrayArray1853[i_100_][i_103_])) == 0) {
							return true;
						}
					}
				}
				if ((i_106_ ^ 0xffffffff) == -10) {
					if ((i_100_ ^ 0xffffffff) == (i_105_ ^ 0xffffffff)
							&& i - -1 == i_103_
							&& ((anIntArrayArray1853[i_100_][i_103_]) & 0x20) == 0) {
						return true;
					}
					if ((i_105_ ^ 0xffffffff) == (i_100_ ^ 0xffffffff)
							&& i + -1 == i_103_
							&& ((anIntArrayArray1853[i_100_][i_103_]) & 0x2) == 0) {
						return true;
					}
					if (-1 + i_105_ == i_100_
							&& i == i_103_
							&& ((anIntArrayArray1853[i_100_][i_103_]) & 0x8 ^ 0xffffffff) == -1) {
						return true;
					}
					if (1 + i_105_ == i_100_
							&& i_103_ == i
							&& (0x80 & (anIntArrayArray1853[i_100_][i_103_])) == 0) {
						return true;
					}
				}
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("pfa.F(" + i + ','
					+ i_100_ + ',' + i_101_ + ',' + i_102_ + ',' + i_103_ + ','
					+ i_104_ + ',' + i_105_ + ',' + i_106_ + ')'));
		}
	}
}
