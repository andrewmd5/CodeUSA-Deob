/* Class324 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class324 {
	byte[] aByteArray2717;
	int[] anIntArray2718;
	int anInt2719;
	int anInt2720;
	int anInt2721;
	int anInt2722;
	byte[] aByteArray2723;
	int anInt2724;
	int anInt2725;

	static final Class324[] method3680(final Class207 class207, final int i,
			final int i_0_) {
		final byte[] is = class207.method2745(i_0_, i, false);
		if (is == null) {
			return null;
		}
		return method3690(is);
	}

	final int method3681() {
		return (anInt2720 + anInt2721 + anInt2724);
	}

	final void method3682() {
		final byte[] is = aByteArray2717;
		if (aByteArray2723 == null) {
			for (int i = (anInt2720 >> 1) - 1; i >= 0; i--) {
				int i_1_ = i * anInt2722;
				int i_2_ = ((anInt2720 - i - 1) * anInt2722);
				for (int i_3_ = -anInt2722; i_3_ < 0; i_3_++) {
					final byte i_4_ = is[i_1_];
					is[i_1_] = is[i_2_];
					is[i_2_] = i_4_;
					i_1_++;
					i_2_++;
				}
			}
		} else {
			final byte[] is_5_ = aByteArray2723;
			for (int i = (anInt2720 >> 1) - 1; i >= 0; i--) {
				int i_6_ = i * anInt2722;
				int i_7_ = ((anInt2720 - i - 1) * anInt2722);
				for (int i_8_ = -anInt2722; i_8_ < 0; i_8_++) {
					byte i_9_ = is[i_6_];
					is[i_6_] = is[i_7_];
					is[i_7_] = i_9_;
					i_9_ = is_5_[i_6_];
					is_5_[i_6_] = is_5_[i_7_];
					is_5_[i_7_] = i_9_;
					i_6_++;
					i_7_++;
				}
			}
		}
		final int i = anInt2721;
		anInt2721 = anInt2724;
		anInt2724 = i;
	}

	static final Class324 method3683(final Class207 class207, final int i) {
		final byte[] is = class207.method2733(i, -117);
		if (is == null) {
			return null;
		}
		return method3690(is)[0];
	}

	static final Class324[] method3684(final Class207 class207, final int i) {
		final byte[] is = class207.method2733(i, -127);
		if (is == null) {
			return null;
		}
		return method3690(is);
	}

	static final Class324 method3685(final Class207 class207, final int i,
			final int i_10_) {
		final byte[] is = class207.method2745(i_10_, i, false);
		if (is == null) {
			return null;
		}
		return method3690(is)[0];
	}

	final int[] method3686() {
		final int i = method3689();
		final int[] is = new int[i * method3681()];
		if (aByteArray2723 != null) {
			for (int i_11_ = 0; i_11_ < anInt2720; i_11_++) {
				int i_12_ = i_11_ * anInt2722;
				int i_13_ = (anInt2725 + (i_11_ + anInt2721) * i);
				for (int i_14_ = 0; i_14_ < anInt2722; i_14_++) {
					is[i_13_++] = (aByteArray2723[i_12_] << 24 | (anIntArray2718[(aByteArray2717[i_12_] & 0xff)]));
					i_12_++;
				}
			}
		} else {
			for (int i_15_ = 0; i_15_ < anInt2720; i_15_++) {
				int i_16_ = i_15_ * anInt2722;
				int i_17_ = (anInt2725 + (i_15_ + anInt2721) * i);
				for (int i_18_ = 0; i_18_ < anInt2722; i_18_++) {
					final int i_19_ = (anIntArray2718[aByteArray2717[i_16_++] & 0xff]);
					if (i_19_ != 0) {
						is[i_17_++] = ~0xffffff | i_19_;
					} else {
						is[i_17_++] = 0;
					}
				}
			}
		}
		return is;
	}

	final void method3687() {
		final byte[] is = (new byte[anInt2722 * anInt2720]);
		int i = 0;
		if (aByteArray2723 == null) {
			for (int i_20_ = 0; i_20_ < anInt2722; i_20_++) {
				for (int i_21_ = anInt2720 - 1; i_21_ >= 0; i_21_--) {
					is[i++] = (aByteArray2717[i_20_ + i_21_ * anInt2722]);
				}
			}
			aByteArray2717 = is;
		} else {
			final byte[] is_22_ = new byte[(anInt2722 * anInt2720)];
			for (int i_23_ = 0; i_23_ < anInt2722; i_23_++) {
				for (int i_24_ = anInt2720 - 1; i_24_ >= 0; i_24_--) {
					is[i] = (aByteArray2717[i_23_ + i_24_ * anInt2722]);
					is_22_[i++] = (aByteArray2723[i_23_ + i_24_ * anInt2722]);
				}
			}
			aByteArray2717 = is;
			aByteArray2723 = is_22_;
		}
		int i_25_ = anInt2721;
		anInt2721 = anInt2725;
		anInt2725 = anInt2724;
		anInt2724 = anInt2719;
		anInt2719 = anInt2721;
		i_25_ = anInt2720;
		anInt2720 = anInt2722;
		anInt2722 = i_25_;
	}

	final void method3688(final int i) {
		final int i_26_ = method3689();
		final int i_27_ = method3681();
		if (anInt2722 != i_26_ || anInt2720 != i_27_) {
			int i_28_ = i;
			if (i_28_ > anInt2725) {
				i_28_ = anInt2725;
			}
			int i_29_ = i;
			if ((i_29_ + anInt2725 + anInt2722) > i_26_) {
				i_29_ = (i_26_ - anInt2725 - anInt2722);
			}
			int i_30_ = i;
			if (i_30_ > anInt2721) {
				i_30_ = anInt2721;
			}
			int i_31_ = i;
			if ((i_31_ + anInt2721 + anInt2720) > i_27_) {
				i_31_ = (i_27_ - anInt2721 - anInt2720);
			}
			final int i_32_ = anInt2722 + i_28_ + i_29_;
			final int i_33_ = anInt2720 + i_30_ + i_31_;
			final byte[] is = new byte[i_32_ * i_33_];
			if (aByteArray2723 == null) {
				for (int i_34_ = 0; i_34_ < anInt2720; i_34_++) {
					int i_35_ = i_34_ * anInt2722;
					int i_36_ = (i_34_ + i_30_) * i_32_ + i_28_;
					for (int i_37_ = 0; i_37_ < anInt2722; i_37_++) {
						is[i_36_++] = aByteArray2717[i_35_++];
					}
				}
			} else {
				final byte[] is_38_ = new byte[i_32_ * i_33_];
				for (int i_39_ = 0; i_39_ < anInt2720; i_39_++) {
					int i_40_ = i_39_ * anInt2722;
					int i_41_ = (i_39_ + i_30_) * i_32_ + i_28_;
					for (int i_42_ = 0; i_42_ < anInt2722; i_42_++) {
						is_38_[i_41_] = aByteArray2723[i_40_];
						is[i_41_++] = aByteArray2717[i_40_++];
					}
				}
				aByteArray2723 = is_38_;
			}
			anInt2725 -= i_28_;
			anInt2721 -= i_30_;
			anInt2719 -= i_29_;
			anInt2724 -= i_31_;
			anInt2722 = i_32_;
			anInt2720 = i_33_;
			aByteArray2717 = is;
		}
	}

	final int method3689() {
		return (anInt2722 + anInt2725 + anInt2719);
	}

	private static final Class324[] method3690(final byte[] is) {
		final ByteBuffer class98_sub22 = new ByteBuffer(is);
		class98_sub22.position = is.length - 2;
		final int i = class98_sub22.readUnsignedShort((byte) 127);
		final Class324[] class324s = new Class324[i];
		for (int i_43_ = 0; i_43_ < i; i_43_++) {
			class324s[i_43_] = new Class324();
		}
		class98_sub22.position = is.length - 7 - i * 8;
		final int i_44_ = class98_sub22.readUnsignedShort((byte) 127);
		final int i_45_ = class98_sub22.readUnsignedShort((byte) 127);
		final int i_46_ = (class98_sub22.readUnsignedByte((byte) 48) & 0xff) + 1;
		for (int i_47_ = 0; i_47_ < i; i_47_++) {
			class324s[i_47_].anInt2725 = class98_sub22.readUnsignedShort((byte) 127);
		}
		for (int i_48_ = 0; i_48_ < i; i_48_++) {
			class324s[i_48_].anInt2721 = class98_sub22.readUnsignedShort((byte) 127);
		}
		for (int i_49_ = 0; i_49_ < i; i_49_++) {
			class324s[i_49_].anInt2722 = class98_sub22.readUnsignedShort((byte) 127);
		}
		for (int i_50_ = 0; i_50_ < i; i_50_++) {
			class324s[i_50_].anInt2720 = class98_sub22.readUnsignedShort((byte) 127);
		}
		for (int i_51_ = 0; i_51_ < i; i_51_++) {
			final Class324 class324 = class324s[i_51_];
			class324.anInt2719 = (i_44_ - class324.anInt2722 - class324.anInt2725);
			class324.anInt2724 = (i_45_ - class324.anInt2720 - class324.anInt2721);
		}
		class98_sub22.position = is.length - 7 - i * 8 - (i_46_ - 1) * 3;
		final int[] is_52_ = new int[i_46_];
		for (int i_53_ = 1; i_53_ < i_46_; i_53_++) {
			is_52_[i_53_] = class98_sub22.readMediumInt(-124);
			if (is_52_[i_53_] == 0) {
				is_52_[i_53_] = 1;
			}
		}
		for (int i_54_ = 0; i_54_ < i; i_54_++) {
			class324s[i_54_].anIntArray2718 = is_52_;
		}
		class98_sub22.position = 0;
		for (int i_55_ = 0; i_55_ < i; i_55_++) {
			final Class324 class324 = class324s[i_55_];
			final int i_56_ = (class324.anInt2722 * class324.anInt2720);
			class324.aByteArray2717 = new byte[i_56_];
			final int i_57_ = class98_sub22.readUnsignedByte((byte) -117);
			if ((i_57_ & 0x2) == 0) {
				if ((i_57_ & 0x1) == 0) {
					for (int i_58_ = 0; i_58_ < i_56_; i_58_++) {
						class324.aByteArray2717[i_58_] = class98_sub22
								.readSignedByte((byte) -19);
					}
				} else {
					for (int i_59_ = 0; i_59_ < class324.anInt2722; i_59_++) {
						for (int i_60_ = 0; i_60_ < class324.anInt2720; i_60_++) {
							class324.aByteArray2717[(i_59_ + i_60_
									* class324.anInt2722)] = class98_sub22
									.readSignedByte((byte) -19);
						}
					}
				}
			} else {
				boolean bool = false;
				class324.aByteArray2723 = new byte[i_56_];
				if ((i_57_ & 0x1) == 0) {
					for (int i_61_ = 0; i_61_ < i_56_; i_61_++) {
						class324.aByteArray2717[i_61_] = class98_sub22
								.readSignedByte((byte) -19);
					}
					for (int i_62_ = 0; i_62_ < i_56_; i_62_++) {
						final byte i_63_ = (class324.aByteArray2723[i_62_] = class98_sub22
								.readSignedByte((byte) -19));
						bool = bool | i_63_ != -1;
					}
				} else {
					for (int i_64_ = 0; i_64_ < class324.anInt2722; i_64_++) {
						for (int i_65_ = 0; i_65_ < class324.anInt2720; i_65_++) {
							class324.aByteArray2717[(i_64_ + i_65_
									* class324.anInt2722)] = class98_sub22
									.readSignedByte((byte) -19);
						}
					}
					for (int i_66_ = 0; i_66_ < class324.anInt2722; i_66_++) {
						for (int i_67_ = 0; i_67_ < class324.anInt2720; i_67_++) {
							final byte i_68_ = (class324.aByteArray2723[i_66_
									+ i_67_ * (class324.anInt2722)] = class98_sub22
									.readSignedByte((byte) -19));
							bool = bool | i_68_ != -1;
						}
					}
				}
				if (!bool) {
					class324.aByteArray2723 = null;
				}
			}
		}
		return class324s;
	}

	final void method3691() {
		final byte[] is = aByteArray2717;
		if (aByteArray2723 == null) {
			for (int i = anInt2720 - 1; i >= 0; i--) {
				int i_69_ = i * anInt2722;
				for (int i_70_ = (i + 1) * anInt2722; i_69_ < i_70_; i_69_++) {
					i_70_--;
					final byte i_71_ = is[i_69_];
					is[i_69_] = is[i_70_];
					is[i_70_] = i_71_;
				}
			}
		} else {
			final byte[] is_72_ = aByteArray2723;
			for (int i = anInt2720 - 1; i >= 0; i--) {
				int i_73_ = i * anInt2722;
				for (int i_74_ = (i + 1) * anInt2722; i_73_ < i_74_; i_73_++) {
					i_74_--;
					byte i_75_ = is[i_73_];
					is[i_73_] = is[i_74_];
					is[i_74_] = i_75_;
					i_75_ = is_72_[i_73_];
					is_72_[i_73_] = is_72_[i_74_];
					is_72_[i_74_] = i_75_;
				}
			}
		}
		final int i = anInt2725;
		anInt2725 = anInt2719;
		anInt2719 = i;
	}

	final void method3692() {
		final int i = method3689();
		final int i_76_ = method3681();
		if (anInt2722 != i || anInt2720 != i_76_) {
			final byte[] is = new byte[i * i_76_];
			if (aByteArray2723 != null) {
				final byte[] is_77_ = new byte[i * i_76_];
				for (int i_78_ = 0; i_78_ < anInt2720; i_78_++) {
					int i_79_ = i_78_ * anInt2722;
					int i_80_ = ((i_78_ + anInt2721) * i + anInt2725);
					for (int i_81_ = 0; i_81_ < anInt2722; i_81_++) {
						is[i_80_] = aByteArray2717[i_79_];
						is_77_[i_80_++] = aByteArray2723[i_79_++];
					}
				}
				aByteArray2723 = is_77_;
			} else {
				for (int i_82_ = 0; i_82_ < anInt2720; i_82_++) {
					int i_83_ = i_82_ * anInt2722;
					int i_84_ = ((i_82_ + anInt2721) * i + anInt2725);
					for (int i_85_ = 0; i_85_ < anInt2722; i_85_++) {
						is[i_84_++] = aByteArray2717[i_83_++];
					}
				}
			}
			anInt2725 = anInt2719 = anInt2721 = anInt2724 = 0;
			anInt2722 = i;
			anInt2720 = i_76_;
			aByteArray2717 = is;
		}
	}

	final void method3693(final int i) {
		int i_86_ = -1;
		if (anIntArray2718.length < 255) {
			for (int i_87_ = 0; i_87_ < anIntArray2718.length; i_87_++) {
				if (anIntArray2718[i_87_] == i) {
					i_86_ = i_87_;
					break;
				}
			}
			if (i_86_ == -1) {
				i_86_ = anIntArray2718.length;
				final int[] is = new int[anIntArray2718.length + 1];
				Class236.method2891(anIntArray2718, 0, is, 0,
						anIntArray2718.length);
				anIntArray2718 = is;
				is[i_86_] = i;
			}
		} else {
			int i_88_ = 2147483647;
			final int i_89_ = i >> 16 & 0xff;
			final int i_90_ = i >> 8 & 0xff;
			final int i_91_ = i & 0xff;
			for (int i_92_ = 0; i_92_ < anIntArray2718.length; i_92_++) {
				final int i_93_ = anIntArray2718[i_92_];
				final int i_94_ = i_93_ >> 16 & 0xff;
				final int i_95_ = i_93_ >> 8 & 0xff;
				final int i_96_ = i_93_ & 0xff;
				int i_97_ = i_89_ - i_94_;
				if (i_97_ < 0) {
					i_97_ = -i_97_;
				}
				int i_98_ = i_90_ - i_95_;
				if (i_98_ < 0) {
					i_98_ = -i_98_;
				}
				int i_99_ = i_91_ - i_96_;
				if (i_99_ < 0) {
					i_99_ = -i_99_;
				}
				final int i_100_ = i_97_ + i_98_ + i_99_;
				if (i_100_ < i_88_) {
					i_88_ = i_100_;
					i_86_ = i_92_;
				}
			}
		}
		for (int i_101_ = anInt2720 - 1; i_101_ > 0; i_101_--) {
			final int i_102_ = i_101_ * anInt2722;
			for (int i_103_ = anInt2722 - 1; i_103_ > 0; i_103_--) {
				if ((anIntArray2718[(aByteArray2717[i_103_ + i_102_] & 0xff)]) == 0
						&& (anIntArray2718[((aByteArray2717[i_103_ + i_102_ - 1
								- anInt2722]) & 0xff)]) != 0) {
					aByteArray2717[i_103_ + i_102_] = (byte) i_86_;
				}
			}
		}
	}

	public Class324() {
		/* empty */
	}

	final void method3694(final int i) {
		int i_104_ = -1;
		if (anIntArray2718.length < 255) {
			for (int i_105_ = 0; i_105_ < anIntArray2718.length; i_105_++) {
				if (anIntArray2718[i_105_] == i) {
					i_104_ = i_105_;
					break;
				}
			}
			if (i_104_ == -1) {
				i_104_ = anIntArray2718.length;
				final int[] is = new int[anIntArray2718.length + 1];
				Class236.method2891(anIntArray2718, 0, is, 0,
						anIntArray2718.length);
				anIntArray2718 = is;
				is[i_104_] = i;
			}
		} else {
			int i_106_ = 2147483647;
			final int i_107_ = i >> 16 & 0xff;
			final int i_108_ = i >> 8 & 0xff;
			final int i_109_ = i & 0xff;
			for (int i_110_ = 0; i_110_ < anIntArray2718.length; i_110_++) {
				final int i_111_ = anIntArray2718[i_110_];
				final int i_112_ = i_111_ >> 16 & 0xff;
				final int i_113_ = i_111_ >> 8 & 0xff;
				final int i_114_ = i_111_ & 0xff;
				int i_115_ = i_107_ - i_112_;
				if (i_115_ < 0) {
					i_115_ = -i_115_;
				}
				int i_116_ = i_108_ - i_113_;
				if (i_116_ < 0) {
					i_116_ = -i_116_;
				}
				int i_117_ = i_109_ - i_114_;
				if (i_117_ < 0) {
					i_117_ = -i_117_;
				}
				final int i_118_ = i_115_ + i_116_ + i_117_;
				if (i_118_ < i_106_) {
					i_106_ = i_118_;
					i_104_ = i_110_;
				}
			}
		}
		int i_119_ = 0;
		final byte[] is = (new byte[anInt2722 * anInt2720]);
		for (int i_120_ = 0; i_120_ < anInt2720; i_120_++) {
			for (int i_121_ = 0; i_121_ < anInt2722; i_121_++) {
				int i_122_ = aByteArray2717[i_119_] & 0xff;
				if (anIntArray2718[i_122_] == 0) {
					if (i_121_ > 0
							&& (anIntArray2718[(aByteArray2717[i_119_ - 1] & 0xff)]) != 0) {
						i_122_ = i_104_;
					} else if (i_120_ > 0
							&& (anIntArray2718[((aByteArray2717[i_119_
									- anInt2722]) & 0xff)]) != 0) {
						i_122_ = i_104_;
					} else if (i_121_ < anInt2722 - 1
							&& (anIntArray2718[(aByteArray2717[i_119_ + 1] & 0xff)]) != 0) {
						i_122_ = i_104_;
					} else if (i_120_ < anInt2720 - 1
							&& (anIntArray2718[((aByteArray2717[i_119_
									+ anInt2722]) & 0xff)]) != 0) {
						i_122_ = i_104_;
					}
				}
				is[i_119_++] = (byte) i_122_;
			}
		}
		aByteArray2717 = is;
	}
}
