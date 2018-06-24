/* Class98_Sub31_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub31_Sub5 extends Class98_Sub31 {
	private int anInt5868;
	private final int anInt5869;
	private final int anInt5870;
	private int anInt5871;
	private int anInt5872;
	private final boolean aBoolean5873;
	private int anInt5874;
	private int anInt5875;
	private int anInt5876;
	private int anInt5877;
	private int anInt5878;
	private int anInt5879;
	private int anInt5880;
	private int anInt5881;
	private int anInt5882;

	private static final int method1393(int i, int i_0_, final byte[] is,
			final int[] is_1_, int i_2_, int i_3_, final int i_4_,
			final int i_5_, int i_6_, final int i_7_, final int i_8_,
			final Class98_Sub31_Sub5 class98_sub31_sub5, final int i_9_,
			final int i_10_) {
		if (i_9_ == 0
				|| (i_6_ = i_3_ + (i_8_ - i_2_ + i_9_ - 257) / i_9_) > i_7_) {
			i_6_ = i_7_;
		}
		i_3_ <<= 1;
		i_6_ <<= 1;
		while (i_3_ < i_6_) {
			i_0_ = i_2_ >> 8;
			i = is[i_0_];
			i = (i << 8) + (is[i_0_ + 1] - i) * (i_2_ & 0xff);
			is_1_[i_3_++] += i * i_4_ >> 6;
			is_1_[i_3_++] += i * i_5_ >> 6;
			i_2_ += i_9_;
		}
		if (i_9_ == 0
				|| (i_6_ = (i_3_ >> 1) + (i_8_ - i_2_ + i_9_ - 1) / i_9_) > i_7_) {
			i_6_ = i_7_;
		}
		i_6_ <<= 1;
		i_0_ = i_10_;
		while (i_3_ < i_6_) {
			i = is[i_2_ >> 8];
			i = (i << 8) + (i_0_ - i) * (i_2_ & 0xff);
			is_1_[i_3_++] += i * i_4_ >> 6;
			is_1_[i_3_++] += i * i_5_ >> 6;
			i_2_ += i_9_;
		}
		class98_sub31_sub5.anInt5879 = i_2_;
		return i_3_ >> 1;
	}

	private final int method1394(final int[] is, int i, final int i_11_,
			final int i_12_, final int i_13_) {
		while (anInt5882 > 0) {
			int i_14_ = i + anInt5882;
			if (i_14_ > i_12_) {
				i_14_ = i_12_;
			}
			anInt5882 += i;
			if (anInt5874 == -256 && (anInt5879 & 0xff) == 0) {
				if (Class151_Sub7.aBoolean5007) {
					i = method1420(
							0,
							((Class98_Sub24_Sub1) (((Class98_Sub31) this).aClass98_Sub24_4104)).aByteArray5799,
							is, anInt5879, i, anInt5876, anInt5880, anInt5871,
							anInt5868, 0, i_14_, i_11_, this);
				} else {
					i = method1418(
							((Class98_Sub24_Sub1) (((Class98_Sub31) this).aClass98_Sub24_4104)).aByteArray5799,
							is, anInt5879, i, anInt5877, anInt5878, 0, i_14_,
							i_11_, this);
				}
			} else if (Class151_Sub7.aBoolean5007) {
				i = method1409(
						0,
						0,
						(((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799),
						is, anInt5879, i, anInt5876, anInt5880, anInt5871,
						anInt5868, 0, i_14_, i_11_, this, anInt5874, i_13_);
			} else {
				i = method1395(
						0,
						0,
						(((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799),
						is, anInt5879, i, anInt5877, anInt5878, 0, i_14_,
						i_11_, this, anInt5874, i_13_);
			}
			anInt5882 -= i;
			if (anInt5882 != 0) {
				return i;
			}
			if (method1398()) {
				return i_12_;
			}
		}
		if (anInt5874 == -256 && (anInt5879 & 0xff) == 0) {
			if (Class151_Sub7.aBoolean5007) {
				return method1429(
						0,
						(((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799),
						is, anInt5879, i, anInt5876, anInt5880, 0, i_12_,
						i_11_, this);
			}
			return method1414(
					(((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799),
					is, anInt5879, i, anInt5877, 0, i_12_, i_11_, this);
		}
		if (Class151_Sub7.aBoolean5007) {
			return method1406(
					0,
					0,
					(((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799),
					is, anInt5879, i, anInt5876, anInt5880, 0, i_12_, i_11_,
					this, anInt5874, i_13_);
		}
		return method1404(
				0,
				0,
				(((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799),
				is, anInt5879, i, anInt5877, 0, i_12_, i_11_, this, anInt5874,
				i_13_);
	}

	private static final int method1395(int i, int i_15_, final byte[] is,
			final int[] is_16_, int i_17_, int i_18_, int i_19_,
			final int i_20_, int i_21_, final int i_22_, final int i_23_,
			final Class98_Sub31_Sub5 class98_sub31_sub5, final int i_24_,
			final int i_25_) {
		class98_sub31_sub5.anInt5876 -= class98_sub31_sub5.anInt5871 * i_18_;
		class98_sub31_sub5.anInt5880 -= class98_sub31_sub5.anInt5868 * i_18_;
		if (i_24_ == 0
				|| (i_21_ = i_18_ + (i_23_ + 256 - i_17_ + i_24_) / i_24_) > i_22_) {
			i_21_ = i_22_;
		}
		while (i_18_ < i_21_) {
			i_15_ = i_17_ >> 8;
			i = is[i_15_ - 1];
			is_16_[i_18_++] += ((i << 8) + (is[i_15_] - i) * (i_17_ & 0xff))
					* i_19_ >> 6;
			i_19_ += i_20_;
			i_17_ += i_24_;
		}
		if (i_24_ == 0
				|| (i_21_ = i_18_ + (i_23_ - i_17_ + i_24_) / i_24_) > i_22_) {
			i_21_ = i_22_;
		}
		i = i_25_;
		i_15_ = i_24_;
		while (i_18_ < i_21_) {
			is_16_[i_18_++] += (((i << 8) + (is[i_17_ >> 8] - i)
					* (i_17_ & 0xff))
					* i_19_ >> 6);
			i_19_ += i_20_;
			i_17_ += i_15_;
		}
		class98_sub31_sub5.anInt5876 += class98_sub31_sub5.anInt5871 * i_18_;
		class98_sub31_sub5.anInt5880 += class98_sub31_sub5.anInt5868 * i_18_;
		class98_sub31_sub5.anInt5877 = i_19_;
		class98_sub31_sub5.anInt5879 = i_17_;
		return i_18_;
	}

	@Override
	final Class98_Sub31 method1322() {
		return null;
	}

	@Override
	final synchronized void method1325(final int[] is, final int i, int i_26_) {
		if (anInt5881 == 0 && anInt5882 == 0) {
			method1321(i_26_);
		} else {
			final Class98_Sub24_Sub1 class98_sub24_sub1 = ((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104);
			final int i_27_ = anInt5869 << 8;
			final int i_28_ = anInt5870 << 8;
			final int i_29_ = ((class98_sub24_sub1.aByteArray5799).length << 8);
			final int i_30_ = i_28_ - i_27_;
			if (i_30_ <= 0) {
				anInt5872 = 0;
			}
			int i_31_ = i;
			i_26_ += i;
			if (anInt5879 < 0) {
				if (anInt5874 > 0) {
					anInt5879 = 0;
				} else {
					method1413();
					method942(68);
					return;
				}
			}
			if (anInt5879 >= i_29_) {
				if (anInt5874 < 0) {
					anInt5879 = i_29_ - 1;
				} else {
					method1413();
					method942(60);
					return;
				}
			}
			if (anInt5872 < 0) {
				if (aBoolean5873) {
					if (anInt5874 < 0) {
						i_31_ = method1394(is, i_31_, i_27_, i_26_,
								(class98_sub24_sub1.aByteArray5799[anInt5869]));
						if (anInt5879 >= i_27_) {
							return;
						}
						anInt5879 = i_27_ + i_27_ - 1 - anInt5879;
						anInt5874 = -anInt5874;
					}
					for (;;) {
						i_31_ = method1428(
								is,
								i_31_,
								i_28_,
								i_26_,
								(class98_sub24_sub1.aByteArray5799[anInt5870 - 1]));
						if (anInt5879 < i_28_) {
							break;
						}
						anInt5879 = i_28_ + i_28_ - 1 - anInt5879;
						anInt5874 = -anInt5874;
						i_31_ = method1394(is, i_31_, i_27_, i_26_,
								(class98_sub24_sub1.aByteArray5799[anInt5869]));
						if (anInt5879 >= i_27_) {
							break;
						}
						anInt5879 = i_27_ + i_27_ - 1 - anInt5879;
						anInt5874 = -anInt5874;
					}
				} else if (anInt5874 < 0) {
					for (;;) {
						i_31_ = method1394(
								is,
								i_31_,
								i_27_,
								i_26_,
								(class98_sub24_sub1.aByteArray5799[anInt5870 - 1]));
						if (anInt5879 >= i_27_) {
							break;
						}
						anInt5879 = i_28_ - 1 - (i_28_ - 1 - anInt5879) % i_30_;
					}
				} else {
					for (;;) {
						i_31_ = method1428(is, i_31_, i_28_, i_26_,
								(class98_sub24_sub1.aByteArray5799[anInt5869]));
						if (anInt5879 < i_28_) {
							break;
						}
						anInt5879 = i_27_ + (anInt5879 - i_27_) % i_30_;
					}
				}
			} else {
				do {
					if (anInt5872 > 0) {
						if (aBoolean5873) {
							if (anInt5874 < 0) {
								i_31_ = method1394(
										is,
										i_31_,
										i_27_,
										i_26_,
										(class98_sub24_sub1.aByteArray5799[anInt5869]));
								if (anInt5879 >= i_27_) {
									return;
								}
								anInt5879 = i_27_ + i_27_ - 1 - anInt5879;
								anInt5874 = -anInt5874;
								if (--anInt5872 == 0) {
									break;
								}
							}
							do {
								i_31_ = method1428(
										is,
										i_31_,
										i_28_,
										i_26_,
										(class98_sub24_sub1.aByteArray5799[anInt5870 - 1]));
								if (anInt5879 < i_28_) {
									return;
								}
								anInt5879 = i_28_ + i_28_ - 1 - anInt5879;
								anInt5874 = -anInt5874;
								if (--anInt5872 == 0) {
									break;
								}
								i_31_ = method1394(
										is,
										i_31_,
										i_27_,
										i_26_,
										(class98_sub24_sub1.aByteArray5799[anInt5869]));
								if (anInt5879 >= i_27_) {
									return;
								}
								anInt5879 = i_27_ + i_27_ - 1 - anInt5879;
								anInt5874 = -anInt5874;
							} while (--anInt5872 != 0);
						} else if (anInt5874 < 0) {
							for (;;) {
								i_31_ = method1394(
										is,
										i_31_,
										i_27_,
										i_26_,
										(class98_sub24_sub1.aByteArray5799[anInt5870 - 1]));
								if (anInt5879 >= i_27_) {
									return;
								}
								final int i_32_ = (i_28_ - 1 - anInt5879)
										/ i_30_;
								if (i_32_ >= anInt5872) {
									anInt5879 += i_30_ * anInt5872;
									anInt5872 = 0;
									break;
								}
								anInt5879 += i_30_ * i_32_;
								anInt5872 -= i_32_;
							}
						} else {
							for (;;) {
								i_31_ = method1428(
										is,
										i_31_,
										i_28_,
										i_26_,
										(class98_sub24_sub1.aByteArray5799[anInt5869]));
								if (anInt5879 < i_28_) {
									return;
								}
								final int i_33_ = (anInt5879 - i_27_) / i_30_;
								if (i_33_ >= anInt5872) {
									anInt5879 -= i_30_ * anInt5872;
									anInt5872 = 0;
									break;
								}
								anInt5879 -= i_30_ * i_33_;
								anInt5872 -= i_33_;
							}
						}
					}
				} while (false);
				if (anInt5874 < 0) {
					method1394(is, i_31_, 0, i_26_, 0);
					if (anInt5879 < 0) {
						anInt5879 = -1;
						method1413();
						method942(124);
					}
				} else {
					method1428(is, i_31_, i_29_, i_26_, 0);
					if (anInt5879 >= i_29_) {
						anInt5879 = i_29_;
						method1413();
						method942(50);
					}
				}
			}
		}
	}

	@Override
	final Class98_Sub31 method1327() {
		return null;
	}

	private static final int method1396(final byte[] is, final int[] is_34_,
			int i, int i_35_, int i_36_, int i_37_, final int i_38_, int i_39_,
			final Class98_Sub31_Sub5 class98_sub31_sub5) {
		i >>= 8;
		i_39_ >>= 8;
		i_36_ <<= 2;
		if ((i_37_ = i_35_ + i_39_ - i) > i_38_) {
			i_37_ = i_38_;
		}
		i_37_ -= 3;
		while (i_35_ < i_37_) {
			is_34_[i_35_++] += is[i++] * i_36_;
			is_34_[i_35_++] += is[i++] * i_36_;
			is_34_[i_35_++] += is[i++] * i_36_;
			is_34_[i_35_++] += is[i++] * i_36_;
		}
		i_37_ += 3;
		while (i_35_ < i_37_) {
			is_34_[i_35_++] += is[i++] * i_36_;
		}
		class98_sub31_sub5.anInt5879 = i << 8;
		return i_35_;
	}

	final synchronized void method1397(final int i, final int i_40_) {
		method1412(i, i_40_, method1426());
	}

	private final boolean method1398() {
		int i = anInt5881;
		int i_41_;
		int i_42_;
		if (i == -2147483648) {
			i = i_41_ = i_42_ = 0;
		} else {
			i_41_ = method1405(i, anInt5875);
			i_42_ = method1421(i, anInt5875);
		}
		if (anInt5877 != i || anInt5876 != i_41_ || anInt5880 != i_42_) {
			if (anInt5877 < i) {
				anInt5878 = 1;
				anInt5882 = i - anInt5877;
			} else if (anInt5877 > i) {
				anInt5878 = -1;
				anInt5882 = anInt5877 - i;
			} else {
				anInt5878 = 0;
			}
			if (anInt5876 < i_41_) {
				anInt5871 = 1;
				if (anInt5882 == 0 || anInt5882 > i_41_ - anInt5876) {
					anInt5882 = i_41_ - anInt5876;
				}
			} else if (anInt5876 > i_41_) {
				anInt5871 = -1;
				if (anInt5882 == 0 || anInt5882 > anInt5876 - i_41_) {
					anInt5882 = anInt5876 - i_41_;
				}
			} else {
				anInt5871 = 0;
			}
			if (anInt5880 < i_42_) {
				anInt5868 = 1;
				if (anInt5882 == 0 || anInt5882 > i_42_ - anInt5880) {
					anInt5882 = i_42_ - anInt5880;
				}
			} else if (anInt5880 > i_42_) {
				anInt5868 = -1;
				if (anInt5882 == 0 || anInt5882 > anInt5880 - i_42_) {
					anInt5882 = anInt5880 - i_42_;
				}
			} else {
				anInt5868 = 0;
			}
			return false;
		}
		if (anInt5881 == -2147483648) {
			anInt5881 = 0;
			anInt5877 = anInt5876 = anInt5880 = 0;
			method942(64);
			return true;
		}
		method1408();
		return false;
	}

	final synchronized void method1399(int i) {
		final int i_43_ = ((((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799).length << 8);
		if (i < -1) {
			i = -1;
		}
		if (i > i_43_) {
			i = i_43_;
		}
		anInt5879 = i;
	}

	final synchronized int method1400() {
		if (anInt5881 == -2147483648) {
			return 0;
		}
		return anInt5881;
	}

	final boolean method1401() {
		if (anInt5879 >= 0
				&& anInt5879 < (((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799).length << 8) {
			return false;
		}
		return true;
	}

	static final Class98_Sub31_Sub5 method1402(
			final Class98_Sub24_Sub1 class98_sub24_sub1, final int i,
			final int i_44_, final int i_45_) {
		if (class98_sub24_sub1.aByteArray5799 == null
				|| (class98_sub24_sub1.aByteArray5799.length == 0)) {
			return null;
		}
		return new Class98_Sub31_Sub5(class98_sub24_sub1, i, i_44_, i_45_);
	}

	private static final int method1403(int i, final byte[] is,
			final int[] is_46_, int i_47_, int i_48_, int i_49_, int i_50_,
			int i_51_, final int i_52_, int i_53_,
			final Class98_Sub31_Sub5 class98_sub31_sub5) {
		i_47_ >>= 8;
		i_53_ >>= 8;
		i_49_ <<= 2;
		i_50_ <<= 2;
		if ((i_51_ = i_48_ + i_53_ - i_47_) > i_52_) {
			i_51_ = i_52_;
		}
		i_48_ <<= 1;
		i_51_ <<= 1;
		i_51_ -= 6;
		while (i_48_ < i_51_) {
			i = is[i_47_++];
			is_46_[i_48_++] += i * i_49_;
			is_46_[i_48_++] += i * i_50_;
			i = is[i_47_++];
			is_46_[i_48_++] += i * i_49_;
			is_46_[i_48_++] += i * i_50_;
			i = is[i_47_++];
			is_46_[i_48_++] += i * i_49_;
			is_46_[i_48_++] += i * i_50_;
			i = is[i_47_++];
			is_46_[i_48_++] += i * i_49_;
			is_46_[i_48_++] += i * i_50_;
		}
		i_51_ += 6;
		while (i_48_ < i_51_) {
			i = is[i_47_++];
			is_46_[i_48_++] += i * i_49_;
			is_46_[i_48_++] += i * i_50_;
		}
		class98_sub31_sub5.anInt5879 = i_47_ << 8;
		return i_48_ >> 1;
	}

	@Override
	final synchronized void method1321(int i) {
		if (anInt5882 > 0) {
			if (i >= anInt5882) {
				if (anInt5881 == -2147483648) {
					anInt5881 = 0;
					anInt5877 = anInt5876 = anInt5880 = 0;
					method942(98);
					i = anInt5882;
				}
				anInt5882 = 0;
				method1408();
			} else {
				anInt5877 += anInt5878 * i;
				anInt5876 += anInt5871 * i;
				anInt5880 += anInt5868 * i;
				anInt5882 -= i;
			}
		}
		final Class98_Sub24_Sub1 class98_sub24_sub1 = (Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104;
		final int i_54_ = anInt5869 << 8;
		final int i_55_ = anInt5870 << 8;
		final int i_56_ = (class98_sub24_sub1.aByteArray5799.length << 8);
		final int i_57_ = i_55_ - i_54_;
		if (i_57_ <= 0) {
			anInt5872 = 0;
		}
		if (anInt5879 < 0) {
			if (anInt5874 > 0) {
				anInt5879 = 0;
			} else {
				method1413();
				method942(90);
				return;
			}
		}
		if (anInt5879 >= i_56_) {
			if (anInt5874 < 0) {
				anInt5879 = i_56_ - 1;
			} else {
				method1413();
				method942(84);
				return;
			}
		}
		anInt5879 += anInt5874 * i;
		if (anInt5872 < 0) {
			if (aBoolean5873) {
				if (anInt5874 < 0) {
					if (anInt5879 >= i_54_) {
						return;
					}
					anInt5879 = i_54_ + i_54_ - 1 - anInt5879;
					anInt5874 = -anInt5874;
				}
				while (anInt5879 >= i_55_) {
					anInt5879 = i_55_ + i_55_ - 1 - anInt5879;
					anInt5874 = -anInt5874;
					if (anInt5879 >= i_54_) {
						break;
					}
					anInt5879 = i_54_ + i_54_ - 1 - anInt5879;
					anInt5874 = -anInt5874;
				}
			} else if (anInt5874 < 0) {
				if (anInt5879 < i_54_) {
					anInt5879 = i_55_ - 1 - (i_55_ - 1 - anInt5879) % i_57_;
				}
			} else if (anInt5879 >= i_55_) {
				anInt5879 = i_54_ + (anInt5879 - i_54_) % i_57_;
			}
		} else {
			do {
				if (anInt5872 > 0) {
					if (aBoolean5873) {
						if (anInt5874 < 0) {
							if (anInt5879 >= i_54_) {
								return;
							}
							anInt5879 = i_54_ + i_54_ - 1 - anInt5879;
							anInt5874 = -anInt5874;
							if (--anInt5872 == 0) {
								break;
							}
						}
						do {
							if (anInt5879 < i_55_) {
								return;
							}
							anInt5879 = i_55_ + i_55_ - 1 - anInt5879;
							anInt5874 = -anInt5874;
							if (--anInt5872 == 0) {
								break;
							}
							if (anInt5879 >= i_54_) {
								return;
							}
							anInt5879 = i_54_ + i_54_ - 1 - anInt5879;
							anInt5874 = -anInt5874;
						} while (--anInt5872 != 0);
					} else if (anInt5874 < 0) {
						if (anInt5879 >= i_54_) {
							return;
						}
						final int i_58_ = (i_55_ - 1 - anInt5879) / i_57_;
						if (i_58_ >= anInt5872) {
							anInt5879 += i_57_ * anInt5872;
							anInt5872 = 0;
						} else {
							anInt5879 += i_57_ * i_58_;
							anInt5872 -= i_58_;
							return;
						}
					} else {
						if (anInt5879 < i_55_) {
							return;
						}
						final int i_59_ = (anInt5879 - i_54_) / i_57_;
						if (i_59_ >= anInt5872) {
							anInt5879 -= i_57_ * anInt5872;
							anInt5872 = 0;
						} else {
							anInt5879 -= i_57_ * i_59_;
							anInt5872 -= i_59_;
							return;
						}
					}
				}
			} while (false);
			if (anInt5874 < 0) {
				if (anInt5879 < 0) {
					anInt5879 = -1;
					method1413();
					method942(82);
				}
			} else if (anInt5879 >= i_56_) {
				anInt5879 = i_56_;
				method1413();
				method942(87);
			}
		}
	}

	private static final int method1404(int i, int i_60_, final byte[] is,
			final int[] is_61_, int i_62_, int i_63_, final int i_64_,
			int i_65_, final int i_66_, final int i_67_,
			final Class98_Sub31_Sub5 class98_sub31_sub5, final int i_68_,
			final int i_69_) {
		if (i_68_ == 0
				|| (i_65_ = i_63_ + (i_67_ + 256 - i_62_ + i_68_) / i_68_) > i_66_) {
			i_65_ = i_66_;
		}
		while (i_63_ < i_65_) {
			i_60_ = i_62_ >> 8;
			i = is[i_60_ - 1];
			is_61_[i_63_++] += ((i << 8) + (is[i_60_] - i) * (i_62_ & 0xff))
					* i_64_ >> 6;
			i_62_ += i_68_;
		}
		if (i_68_ == 0
				|| (i_65_ = i_63_ + (i_67_ - i_62_ + i_68_) / i_68_) > i_66_) {
			i_65_ = i_66_;
		}
		i = i_69_;
		i_60_ = i_68_;
		while (i_63_ < i_65_) {
			is_61_[i_63_++] += (((i << 8) + (is[i_62_ >> 8] - i)
					* (i_62_ & 0xff))
					* i_64_ >> 6);
			i_62_ += i_60_;
		}
		class98_sub31_sub5.anInt5879 = i_62_;
		return i_63_;
	}

	private static final int method1405(final int i, final int i_70_) {
		if (i_70_ < 0) {
			return i;
		}
		return (int) ((i * Math.sqrt((16384 - i_70_) * 1.220703125E-4)) + 0.5);
	}

	private static final int method1406(int i, int i_71_, final byte[] is,
			final int[] is_72_, int i_73_, int i_74_, final int i_75_,
			final int i_76_, int i_77_, final int i_78_, final int i_79_,
			final Class98_Sub31_Sub5 class98_sub31_sub5, final int i_80_,
			final int i_81_) {
		if (i_80_ == 0
				|| (i_77_ = i_74_ + (i_79_ + 256 - i_73_ + i_80_) / i_80_) > i_78_) {
			i_77_ = i_78_;
		}
		i_74_ <<= 1;
		i_77_ <<= 1;
		while (i_74_ < i_77_) {
			i_71_ = i_73_ >> 8;
			i = is[i_71_ - 1];
			i = (i << 8) + (is[i_71_] - i) * (i_73_ & 0xff);
			is_72_[i_74_++] += i * i_75_ >> 6;
			is_72_[i_74_++] += i * i_76_ >> 6;
			i_73_ += i_80_;
		}
		if (i_80_ == 0
				|| ((i_77_ = (i_74_ >> 1) + (i_79_ - i_73_ + i_80_) / i_80_) > i_78_)) {
			i_77_ = i_78_;
		}
		i_77_ <<= 1;
		i_71_ = i_81_;
		while (i_74_ < i_77_) {
			i = (i_71_ << 8) + (is[i_73_ >> 8] - i_71_) * (i_73_ & 0xff);
			is_72_[i_74_++] += i * i_75_ >> 6;
			is_72_[i_74_++] += i * i_76_ >> 6;
			i_73_ += i_80_;
		}
		class98_sub31_sub5.anInt5879 = i_73_;
		return i_74_ >> 1;
	}

	final synchronized void method1407(final int i) {
		if (anInt5874 < 0) {
			anInt5874 = -i;
		} else {
			anInt5874 = i;
		}
	}

	private final void method1408() {
		anInt5877 = anInt5881;
		anInt5876 = method1405(anInt5881, anInt5875);
		anInt5880 = method1421(anInt5881, anInt5875);
	}

	private static final int method1409(int i, int i_82_, final byte[] is,
			final int[] is_83_, int i_84_, int i_85_, int i_86_, int i_87_,
			final int i_88_, final int i_89_, int i_90_, final int i_91_,
			final int i_92_, final Class98_Sub31_Sub5 class98_sub31_sub5,
			final int i_93_, final int i_94_) {
		class98_sub31_sub5.anInt5877 -= class98_sub31_sub5.anInt5878 * i_85_;
		if (i_93_ == 0
				|| (i_90_ = i_85_ + (i_92_ + 256 - i_84_ + i_93_) / i_93_) > i_91_) {
			i_90_ = i_91_;
		}
		i_85_ <<= 1;
		i_90_ <<= 1;
		while (i_85_ < i_90_) {
			i_82_ = i_84_ >> 8;
			i = is[i_82_ - 1];
			i = (i << 8) + (is[i_82_] - i) * (i_84_ & 0xff);
			is_83_[i_85_++] += i * i_86_ >> 6;
			i_86_ += i_88_;
			is_83_[i_85_++] += i * i_87_ >> 6;
			i_87_ += i_89_;
			i_84_ += i_93_;
		}
		if (i_93_ == 0
				|| ((i_90_ = (i_85_ >> 1) + (i_92_ - i_84_ + i_93_) / i_93_) > i_91_)) {
			i_90_ = i_91_;
		}
		i_90_ <<= 1;
		i_82_ = i_94_;
		while (i_85_ < i_90_) {
			i = (i_82_ << 8) + (is[i_84_ >> 8] - i_82_) * (i_84_ & 0xff);
			is_83_[i_85_++] += i * i_86_ >> 6;
			i_86_ += i_88_;
			is_83_[i_85_++] += i * i_87_ >> 6;
			i_87_ += i_89_;
			i_84_ += i_93_;
		}
		i_85_ >>= 1;
		class98_sub31_sub5.anInt5877 += class98_sub31_sub5.anInt5878 * i_85_;
		class98_sub31_sub5.anInt5876 = i_86_;
		class98_sub31_sub5.anInt5880 = i_87_;
		class98_sub31_sub5.anInt5879 = i_84_;
		return i_85_;
	}

	private final synchronized void method1410(final int i, final int i_95_) {
		anInt5881 = i;
		anInt5875 = i_95_;
		anInt5882 = 0;
		method1408();
	}

	final synchronized void method1411(final boolean bool) {
		anInt5874 = (anInt5874 ^ anInt5874 >> 31) + (anInt5874 >>> 31);
		if (bool) {
			anInt5874 = -anInt5874;
		}
	}

	final synchronized void method1412(int i, final int i_96_, final int i_97_) {
		if (i == 0) {
			method1410(i_96_, i_97_);
		} else {
			final int i_98_ = method1405(i_96_, i_97_);
			final int i_99_ = method1421(i_96_, i_97_);
			if (anInt5876 == i_98_ && anInt5880 == i_99_) {
				anInt5882 = 0;
			} else {
				int i_100_ = i_96_ - anInt5877;
				if (anInt5877 - i_96_ > i_100_) {
					i_100_ = anInt5877 - i_96_;
				}
				if (i_98_ - anInt5876 > i_100_) {
					i_100_ = i_98_ - anInt5876;
				}
				if (anInt5876 - i_98_ > i_100_) {
					i_100_ = anInt5876 - i_98_;
				}
				if (i_99_ - anInt5880 > i_100_) {
					i_100_ = i_99_ - anInt5880;
				}
				if (anInt5880 - i_99_ > i_100_) {
					i_100_ = anInt5880 - i_99_;
				}
				if (i > i_100_) {
					i = i_100_;
				}
				anInt5882 = i;
				anInt5881 = i_96_;
				anInt5875 = i_97_;
				anInt5878 = (i_96_ - anInt5877) / i;
				anInt5871 = (i_98_ - anInt5876) / i;
				anInt5868 = (i_99_ - anInt5880) / i;
			}
		}
	}

	private final void method1413() {
		if (anInt5882 != 0) {
			if (anInt5881 == -2147483648) {
				anInt5881 = 0;
			}
			anInt5882 = 0;
			method1408();
		}
	}

	private static final int method1414(final byte[] is, final int[] is_101_,
			int i, int i_102_, int i_103_, int i_104_, final int i_105_,
			int i_106_, final Class98_Sub31_Sub5 class98_sub31_sub5) {
		i >>= 8;
		i_106_ >>= 8;
		i_103_ <<= 2;
		if ((i_104_ = i_102_ + i - (i_106_ - 1)) > i_105_) {
			i_104_ = i_105_;
		}
		i_104_ -= 3;
		while (i_102_ < i_104_) {
			is_101_[i_102_++] += is[i--] * i_103_;
			is_101_[i_102_++] += is[i--] * i_103_;
			is_101_[i_102_++] += is[i--] * i_103_;
			is_101_[i_102_++] += is[i--] * i_103_;
		}
		i_104_ += 3;
		while (i_102_ < i_104_) {
			is_101_[i_102_++] += is[i--] * i_103_;
		}
		class98_sub31_sub5.anInt5879 = i << 8;
		return i_102_;
	}

	private static final int method1415(int i, int i_107_, final byte[] is,
			final int[] is_108_, int i_109_, int i_110_, int i_111_,
			int i_112_, final int i_113_, final int i_114_, int i_115_,
			final int i_116_, final int i_117_,
			final Class98_Sub31_Sub5 class98_sub31_sub5, final int i_118_,
			final int i_119_) {
		class98_sub31_sub5.anInt5877 -= class98_sub31_sub5.anInt5878 * i_110_;
		if (i_118_ == 0
				|| ((i_115_ = i_110_ + (i_117_ - i_109_ + i_118_ - 257)
						/ i_118_) > i_116_)) {
			i_115_ = i_116_;
		}
		i_110_ <<= 1;
		i_115_ <<= 1;
		while (i_110_ < i_115_) {
			i_107_ = i_109_ >> 8;
			i = is[i_107_];
			i = (i << 8) + (is[i_107_ + 1] - i) * (i_109_ & 0xff);
			is_108_[i_110_++] += i * i_111_ >> 6;
			i_111_ += i_113_;
			is_108_[i_110_++] += i * i_112_ >> 6;
			i_112_ += i_114_;
			i_109_ += i_118_;
		}
		if (i_118_ == 0
				|| (i_115_ = (i_110_ >> 1) + (i_117_ - i_109_ + i_118_ - 1)
						/ i_118_) > i_116_) {
			i_115_ = i_116_;
		}
		i_115_ <<= 1;
		i_107_ = i_119_;
		while (i_110_ < i_115_) {
			i = is[i_109_ >> 8];
			i = (i << 8) + (i_107_ - i) * (i_109_ & 0xff);
			is_108_[i_110_++] += i * i_111_ >> 6;
			i_111_ += i_113_;
			is_108_[i_110_++] += i * i_112_ >> 6;
			i_112_ += i_114_;
			i_109_ += i_118_;
		}
		i_110_ >>= 1;
		class98_sub31_sub5.anInt5877 += class98_sub31_sub5.anInt5878 * i_110_;
		class98_sub31_sub5.anInt5876 = i_111_;
		class98_sub31_sub5.anInt5880 = i_112_;
		class98_sub31_sub5.anInt5879 = i_109_;
		return i_110_;
	}

	private static final int method1416(final byte[] is, final int[] is_120_,
			int i, int i_121_, int i_122_, int i_123_, int i_124_,
			final int i_125_, int i_126_,
			final Class98_Sub31_Sub5 class98_sub31_sub5) {
		i >>= 8;
		i_126_ >>= 8;
		i_122_ <<= 2;
		i_123_ <<= 2;
		if ((i_124_ = i_121_ + i_126_ - i) > i_125_) {
			i_124_ = i_125_;
		}
		class98_sub31_sub5.anInt5876 += class98_sub31_sub5.anInt5871
				* (i_124_ - i_121_);
		class98_sub31_sub5.anInt5880 += class98_sub31_sub5.anInt5868
				* (i_124_ - i_121_);
		i_124_ -= 3;
		while (i_121_ < i_124_) {
			is_120_[i_121_++] += is[i++] * i_122_;
			i_122_ += i_123_;
			is_120_[i_121_++] += is[i++] * i_122_;
			i_122_ += i_123_;
			is_120_[i_121_++] += is[i++] * i_122_;
			i_122_ += i_123_;
			is_120_[i_121_++] += is[i++] * i_122_;
			i_122_ += i_123_;
		}
		i_124_ += 3;
		while (i_121_ < i_124_) {
			is_120_[i_121_++] += is[i++] * i_122_;
			i_122_ += i_123_;
		}
		class98_sub31_sub5.anInt5877 = i_122_ >> 2;
		class98_sub31_sub5.anInt5879 = i << 8;
		return i_121_;
	}

	private static final int method1417(int i, final byte[] is,
			final int[] is_127_, int i_128_, int i_129_, int i_130_,
			int i_131_, int i_132_, int i_133_, int i_134_, final int i_135_,
			int i_136_, final Class98_Sub31_Sub5 class98_sub31_sub5) {
		i_128_ >>= 8;
		i_136_ >>= 8;
		i_130_ <<= 2;
		i_131_ <<= 2;
		i_132_ <<= 2;
		i_133_ <<= 2;
		if ((i_134_ = i_129_ + i_136_ - i_128_) > i_135_) {
			i_134_ = i_135_;
		}
		class98_sub31_sub5.anInt5877 += class98_sub31_sub5.anInt5878
				* (i_134_ - i_129_);
		i_129_ <<= 1;
		i_134_ <<= 1;
		i_134_ -= 6;
		while (i_129_ < i_134_) {
			i = is[i_128_++];
			is_127_[i_129_++] += i * i_130_;
			i_130_ += i_132_;
			is_127_[i_129_++] += i * i_131_;
			i_131_ += i_133_;
			i = is[i_128_++];
			is_127_[i_129_++] += i * i_130_;
			i_130_ += i_132_;
			is_127_[i_129_++] += i * i_131_;
			i_131_ += i_133_;
			i = is[i_128_++];
			is_127_[i_129_++] += i * i_130_;
			i_130_ += i_132_;
			is_127_[i_129_++] += i * i_131_;
			i_131_ += i_133_;
			i = is[i_128_++];
			is_127_[i_129_++] += i * i_130_;
			i_130_ += i_132_;
			is_127_[i_129_++] += i * i_131_;
			i_131_ += i_133_;
		}
		i_134_ += 6;
		while (i_129_ < i_134_) {
			i = is[i_128_++];
			is_127_[i_129_++] += i * i_130_;
			i_130_ += i_132_;
			is_127_[i_129_++] += i * i_131_;
			i_131_ += i_133_;
		}
		class98_sub31_sub5.anInt5876 = i_130_ >> 2;
		class98_sub31_sub5.anInt5880 = i_131_ >> 2;
		class98_sub31_sub5.anInt5879 = i_128_ << 8;
		return i_129_ >> 1;
	}

	private static final int method1418(final byte[] is, final int[] is_137_,
			int i, int i_138_, int i_139_, int i_140_, int i_141_,
			final int i_142_, int i_143_,
			final Class98_Sub31_Sub5 class98_sub31_sub5) {
		i >>= 8;
		i_143_ >>= 8;
		i_139_ <<= 2;
		i_140_ <<= 2;
		if ((i_141_ = i_138_ + i - (i_143_ - 1)) > i_142_) {
			i_141_ = i_142_;
		}
		class98_sub31_sub5.anInt5876 += class98_sub31_sub5.anInt5871
				* (i_141_ - i_138_);
		class98_sub31_sub5.anInt5880 += class98_sub31_sub5.anInt5868
				* (i_141_ - i_138_);
		i_141_ -= 3;
		while (i_138_ < i_141_) {
			is_137_[i_138_++] += is[i--] * i_139_;
			i_139_ += i_140_;
			is_137_[i_138_++] += is[i--] * i_139_;
			i_139_ += i_140_;
			is_137_[i_138_++] += is[i--] * i_139_;
			i_139_ += i_140_;
			is_137_[i_138_++] += is[i--] * i_139_;
			i_139_ += i_140_;
		}
		i_141_ += 3;
		while (i_138_ < i_141_) {
			is_137_[i_138_++] += is[i--] * i_139_;
			i_139_ += i_140_;
		}
		class98_sub31_sub5.anInt5877 = i_139_ >> 2;
		class98_sub31_sub5.anInt5879 = i << 8;
		return i_138_;
	}

	private final synchronized void method1419(final int i) {
		method1410(i, method1426());
	}

	private static final int method1420(int i, final byte[] is,
			final int[] is_144_, int i_145_, int i_146_, int i_147_,
			int i_148_, int i_149_, int i_150_, int i_151_, final int i_152_,
			int i_153_, final Class98_Sub31_Sub5 class98_sub31_sub5) {
		i_145_ >>= 8;
		i_153_ >>= 8;
		i_147_ <<= 2;
		i_148_ <<= 2;
		i_149_ <<= 2;
		i_150_ <<= 2;
		if ((i_151_ = i_146_ + i_145_ - (i_153_ - 1)) > i_152_) {
			i_151_ = i_152_;
		}
		class98_sub31_sub5.anInt5877 += class98_sub31_sub5.anInt5878
				* (i_151_ - i_146_);
		i_146_ <<= 1;
		i_151_ <<= 1;
		i_151_ -= 6;
		while (i_146_ < i_151_) {
			i = is[i_145_--];
			is_144_[i_146_++] += i * i_147_;
			i_147_ += i_149_;
			is_144_[i_146_++] += i * i_148_;
			i_148_ += i_150_;
			i = is[i_145_--];
			is_144_[i_146_++] += i * i_147_;
			i_147_ += i_149_;
			is_144_[i_146_++] += i * i_148_;
			i_148_ += i_150_;
			i = is[i_145_--];
			is_144_[i_146_++] += i * i_147_;
			i_147_ += i_149_;
			is_144_[i_146_++] += i * i_148_;
			i_148_ += i_150_;
			i = is[i_145_--];
			is_144_[i_146_++] += i * i_147_;
			i_147_ += i_149_;
			is_144_[i_146_++] += i * i_148_;
			i_148_ += i_150_;
		}
		i_151_ += 6;
		while (i_146_ < i_151_) {
			i = is[i_145_--];
			is_144_[i_146_++] += i * i_147_;
			i_147_ += i_149_;
			is_144_[i_146_++] += i * i_148_;
			i_148_ += i_150_;
		}
		class98_sub31_sub5.anInt5876 = i_147_ >> 2;
		class98_sub31_sub5.anInt5880 = i_148_ >> 2;
		class98_sub31_sub5.anInt5879 = i_145_ << 8;
		return i_146_ >> 1;
	}

	private static final int method1421(final int i, final int i_154_) {
		if (i_154_ < 0) {
			return -i;
		}
		return (int) (i * Math.sqrt(i_154_ * 1.220703125E-4) + 0.5);
	}

	final synchronized void method1422(final int i) {
		anInt5872 = i;
	}

	final synchronized void method1423(int i) {
		if (i == 0) {
			method1419(0);
			method942(87);
		} else if (anInt5876 == 0 && anInt5880 == 0) {
			anInt5882 = 0;
			anInt5881 = 0;
			anInt5877 = 0;
			method942(75);
		} else {
			int i_155_ = -anInt5877;
			if (anInt5877 > i_155_) {
				i_155_ = anInt5877;
			}
			if (-anInt5876 > i_155_) {
				i_155_ = -anInt5876;
			}
			if (anInt5876 > i_155_) {
				i_155_ = anInt5876;
			}
			if (-anInt5880 > i_155_) {
				i_155_ = -anInt5880;
			}
			if (anInt5880 > i_155_) {
				i_155_ = anInt5880;
			}
			if (i > i_155_) {
				i = i_155_;
			}
			anInt5882 = i;
			anInt5881 = -2147483648;
			anInt5878 = -anInt5877 / i;
			anInt5871 = -anInt5876 / i;
			anInt5868 = -anInt5880 / i;
		}
	}

	private static final int method1424(int i, int i_156_, final byte[] is,
			final int[] is_157_, int i_158_, int i_159_, int i_160_,
			final int i_161_, int i_162_, final int i_163_, final int i_164_,
			final Class98_Sub31_Sub5 class98_sub31_sub5, final int i_165_,
			final int i_166_) {
		class98_sub31_sub5.anInt5876 -= class98_sub31_sub5.anInt5871 * i_159_;
		class98_sub31_sub5.anInt5880 -= class98_sub31_sub5.anInt5868 * i_159_;
		if (i_165_ == 0
				|| ((i_162_ = i_159_ + (i_164_ - i_158_ + i_165_ - 257)
						/ i_165_) > i_163_)) {
			i_162_ = i_163_;
		}
		while (i_159_ < i_162_) {
			i_156_ = i_158_ >> 8;
			i = is[i_156_];
			is_157_[i_159_++] += (((i << 8) + (is[i_156_ + 1] - i)
					* (i_158_ & 0xff)) * i_160_) >> 6;
			i_160_ += i_161_;
			i_158_ += i_165_;
		}
		if (i_165_ == 0
				|| ((i_162_ = i_159_ + (i_164_ - i_158_ + i_165_ - 1) / i_165_) > i_163_)) {
			i_162_ = i_163_;
		}
		i_156_ = i_166_;
		while (i_159_ < i_162_) {
			i = is[i_158_ >> 8];
			is_157_[i_159_++] += ((i << 8) + (i_156_ - i) * (i_158_ & 0xff))
					* i_160_ >> 6;
			i_160_ += i_161_;
			i_158_ += i_165_;
		}
		class98_sub31_sub5.anInt5876 += class98_sub31_sub5.anInt5871 * i_159_;
		class98_sub31_sub5.anInt5880 += class98_sub31_sub5.anInt5868 * i_159_;
		class98_sub31_sub5.anInt5877 = i_160_;
		class98_sub31_sub5.anInt5879 = i_158_;
		return i_159_;
	}

	final boolean method1425() {
		if (anInt5882 == 0) {
			return false;
		}
		return true;
	}

	final synchronized int method1426() {
		if (anInt5875 < 0) {
			return -1;
		}
		return anInt5875;
	}

	final synchronized void method1427(final int i) {
		method1410(i << 6, method1426());
	}

	@Override
	final int method1326() {
		if (anInt5881 == 0 && anInt5882 == 0) {
			return 0;
		}
		return 1;
	}

	private final int method1428(final int[] is, int i, final int i_167_,
			final int i_168_, final int i_169_) {
		while (anInt5882 > 0) {
			int i_170_ = i + anInt5882;
			if (i_170_ > i_168_) {
				i_170_ = i_168_;
			}
			anInt5882 += i;
			if (anInt5874 == 256 && (anInt5879 & 0xff) == 0) {
				if (Class151_Sub7.aBoolean5007) {
					i = method1417(
							0,
							((Class98_Sub24_Sub1) (((Class98_Sub31) this).aClass98_Sub24_4104)).aByteArray5799,
							is, anInt5879, i, anInt5876, anInt5880, anInt5871,
							anInt5868, 0, i_170_, i_167_, this);
				} else {
					i = method1416(
							((Class98_Sub24_Sub1) (((Class98_Sub31) this).aClass98_Sub24_4104)).aByteArray5799,
							is, anInt5879, i, anInt5877, anInt5878, 0, i_170_,
							i_167_, this);
				}
			} else if (Class151_Sub7.aBoolean5007) {
				i = method1415(
						0,
						0,
						(((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799),
						is, anInt5879, i, anInt5876, anInt5880, anInt5871,
						anInt5868, 0, i_170_, i_167_, this, anInt5874, i_169_);
			} else {
				i = method1424(
						0,
						0,
						(((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799),
						is, anInt5879, i, anInt5877, anInt5878, 0, i_170_,
						i_167_, this, anInt5874, i_169_);
			}
			anInt5882 -= i;
			if (anInt5882 != 0) {
				return i;
			}
			if (method1398()) {
				return i_168_;
			}
		}
		if (anInt5874 == 256 && (anInt5879 & 0xff) == 0) {
			if (Class151_Sub7.aBoolean5007) {
				return method1403(
						0,
						(((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799),
						is, anInt5879, i, anInt5876, anInt5880, 0, i_168_,
						i_167_, this);
			}
			return method1396(
					(((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799),
					is, anInt5879, i, anInt5877, 0, i_168_, i_167_, this);
		}
		if (Class151_Sub7.aBoolean5007) {
			return method1393(
					0,
					0,
					(((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799),
					is, anInt5879, i, anInt5876, anInt5880, 0, i_168_, i_167_,
					this, anInt5874, i_169_);
		}
		return method1432(
				0,
				0,
				(((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799),
				is, anInt5879, i, anInt5877, 0, i_168_, i_167_, this,
				anInt5874, i_169_);
	}

	private static final int method1429(int i, final byte[] is,
			final int[] is_171_, int i_172_, int i_173_, int i_174_,
			int i_175_, int i_176_, final int i_177_, int i_178_,
			final Class98_Sub31_Sub5 class98_sub31_sub5) {
		i_172_ >>= 8;
		i_178_ >>= 8;
		i_174_ <<= 2;
		i_175_ <<= 2;
		if ((i_176_ = i_173_ + i_172_ - (i_178_ - 1)) > i_177_) {
			i_176_ = i_177_;
		}
		i_173_ <<= 1;
		i_176_ <<= 1;
		i_176_ -= 6;
		while (i_173_ < i_176_) {
			i = is[i_172_--];
			is_171_[i_173_++] += i * i_174_;
			is_171_[i_173_++] += i * i_175_;
			i = is[i_172_--];
			is_171_[i_173_++] += i * i_174_;
			is_171_[i_173_++] += i * i_175_;
			i = is[i_172_--];
			is_171_[i_173_++] += i * i_174_;
			is_171_[i_173_++] += i * i_175_;
			i = is[i_172_--];
			is_171_[i_173_++] += i * i_174_;
			is_171_[i_173_++] += i * i_175_;
		}
		i_176_ += 6;
		while (i_173_ < i_176_) {
			i = is[i_172_--];
			is_171_[i_173_++] += i * i_174_;
			is_171_[i_173_++] += i * i_175_;
		}
		class98_sub31_sub5.anInt5879 = i_172_ << 8;
		return i_173_ >> 1;
	}

	final synchronized int method1430() {
		if (anInt5874 < 0) {
			return -anInt5874;
		}
		return anInt5874;
	}

	final synchronized void method1431(final int i) {
		method1410(method1400(), i);
	}

	private static final int method1432(int i, int i_179_, final byte[] is,
			final int[] is_180_, int i_181_, int i_182_, final int i_183_,
			int i_184_, final int i_185_, final int i_186_,
			final Class98_Sub31_Sub5 class98_sub31_sub5, final int i_187_,
			final int i_188_) {
		if (i_187_ == 0
				|| ((i_184_ = i_182_ + (i_186_ - i_181_ + i_187_ - 257)
						/ i_187_) > i_185_)) {
			i_184_ = i_185_;
		}
		while (i_182_ < i_184_) {
			i_179_ = i_181_ >> 8;
			i = is[i_179_];
			is_180_[i_182_++] += (((i << 8) + (is[i_179_ + 1] - i)
					* (i_181_ & 0xff)) * i_183_) >> 6;
			i_181_ += i_187_;
		}
		if (i_187_ == 0
				|| ((i_184_ = i_182_ + (i_186_ - i_181_ + i_187_ - 1) / i_187_) > i_185_)) {
			i_184_ = i_185_;
		}
		i_179_ = i_188_;
		while (i_182_ < i_184_) {
			i = is[i_181_ >> 8];
			is_180_[i_182_++] += ((i << 8) + (i_179_ - i) * (i_181_ & 0xff))
					* i_183_ >> 6;
			i_181_ += i_187_;
		}
		class98_sub31_sub5.anInt5879 = i_181_;
		return i_182_;
	}

	private Class98_Sub31_Sub5(final Class98_Sub24_Sub1 class98_sub24_sub1,
			final int i, final int i_189_, final int i_190_) {
		((Class98_Sub31) this).aClass98_Sub24_4104 = class98_sub24_sub1;
		anInt5869 = class98_sub24_sub1.anInt5798;
		anInt5870 = class98_sub24_sub1.anInt5796;
		aBoolean5873 = class98_sub24_sub1.aBoolean5797;
		anInt5874 = i;
		anInt5881 = i_189_;
		anInt5875 = i_190_;
		anInt5879 = 0;
		method1408();
	}

	@Override
	final int method1323() {
		int i = anInt5877 * 3 >> 6;
		i = (i ^ i >> 31) + (i >>> 31);
		if (anInt5872 == 0) {
			i -= i
					* anInt5879
					/ ((((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799).length << 8);
		} else if (anInt5872 >= 0) {
			i -= i
					* anInt5869
					/ (((Class98_Sub24_Sub1) ((Class98_Sub31) this).aClass98_Sub24_4104).aByteArray5799).length;
		}
		if (i > 255) {
			return 255;
		}
		return i;
	}
}
