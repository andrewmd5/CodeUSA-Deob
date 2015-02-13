/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class146 {
	static IncomingOpcode aClass58_1179 = new IncomingOpcode(84, 4);
	static Class377 aClass377_1180 = new Class377(64);
	boolean aBoolean1181 = false;
	static Class196 aClass196_1182 = new Class196("WTRC", "office", "_rc", 1);
	static int anInt1183;
	/* synthetic */static Class aClass1184;

	abstract void k(int i);

	abstract int G();

	abstract Surface[] method2320();

	abstract void FA(int i);

	abstract int RA();

	abstract void a(int i);

	final void method2321(int i, int i_0_,
			Class98_Sub46_Sub16 class98_sub46_sub16,
			Class98_Sub46_Sub16 class98_sub46_sub16_1_, boolean[] bools,
			int i_2_, int i_3_, int i_4_,
			Class98_Sub46_Sub16 class98_sub46_sub16_5_, int i_6_, int i_7_,
			boolean bool, Class98_Sub46_Sub16 class98_sub46_sub16_8_, int i_9_,
			int i_10_) {
		try {
			if ((i_0_ ^ 0xffffffff) != 0) {
				if (bools == null || (i_4_ ^ 0xffffffff) == 0)
					method2338(i_7_, class98_sub46_sub16, i_0_,
							class98_sub46_sub16_1_, bool, 0, 112, i, i_10_);
				else {
					method2342();
					if (!NA())
						method2327();
					else {
						Class7 class7 = (((Class98_Sub46_Sub16) class98_sub46_sub16).aClass7Array6045[i_0_]);
						Class98_Sub1 class98_sub1 = ((Class7) class7).aClass98_Sub1_93;
						Class7 class7_11_ = null;
						if (class98_sub46_sub16_1_ != null) {
							class7_11_ = (((Class98_Sub46_Sub16) class98_sub46_sub16_1_).aClass7Array6045[i_10_]);
							if (class98_sub1 != ((Class7) class7_11_).aClass98_Sub1_93)
								class7_11_ = null;
						}
						method2330(class7, class98_sub1, false, class7_11_,
								null, bools, bool, (byte) 77, i_7_, 65535, 0, i);
						if (i_3_ != 28777)
							method2326();
						Class7 class7_12_ = (((Class98_Sub46_Sub16) class98_sub46_sub16_5_).aClass7Array6045[i_4_]);
						Class7 class7_13_ = null;
						if (class98_sub46_sub16_8_ != null) {
							class7_13_ = (((Class98_Sub46_Sub16) class98_sub46_sub16_8_).aClass7Array6045[i_6_]);
							if (((Class7) class7_13_).aClass98_Sub1_93 != class98_sub1)
								class7_13_ = null;
						}
						method2344(0, new int[0], 0, 0, 0, 0, bool);
						method2330(class7_12_,
								((Class7) class7_12_).aClass98_Sub1_93, true,
								class7_13_, null, bools, bool, (byte) 69, i_9_,
								65535, 0, i_2_);
						wa();
						method2327();
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ka.TB(" + i + ','
					+ i_0_ + ','
					+ (class98_sub46_sub16 != null ? "{...}" : "null") + ','
					+ (class98_sub46_sub16_1_ != null ? "{...}" : "null") + ','
					+ (bools != null ? "{...}" : "null") + ',' + i_2_ + ','
					+ i_3_ + ',' + i_4_ + ','
					+ (class98_sub46_sub16_5_ != null ? "{...}" : "null") + ','
					+ i_6_ + ',' + i_7_ + ',' + bool + ','
					+ (class98_sub46_sub16_8_ != null ? "{...}" : "null") + ','
					+ i_9_ + ',' + i_10_ + ')'));
		}
	}

	abstract void LA(int i);

	abstract SurfaceSkin[] method2322();

	abstract boolean r();

	abstract r ba(r var_r);

	abstract int WA();

	final void method2323(int i, int i_14_,
			Class98_Sub46_Sub16 class98_sub46_sub16, int i_15_, int i_16_,
			Class98_Sub46_Sub16 class98_sub46_sub16_17_, boolean bool,
			int i_18_, int[] is, int i_19_, int i_20_) {
		try {
			if (i != -1) {
				method2342();
				if (!NA())
					method2327();
				else {
					if (i_15_ != -27033)
						aClass196_1182 = null;
					Class7 class7 = (((Class98_Sub46_Sub16) class98_sub46_sub16_17_).aClass7Array6045[i]);
					Class98_Sub1 class98_sub1 = ((Class7) class7).aClass98_Sub1_93;
					Class7 class7_21_ = null;
					if (class98_sub46_sub16 != null) {
						class7_21_ = (((Class98_Sub46_Sub16) class98_sub46_sub16).aClass7Array6045[i_18_]);
						if (class98_sub1 != ((Class7) class7_21_).aClass98_Sub1_93)
							class7_21_ = null;
					}
					method2330(class7, class98_sub1, false, class7_21_, is,
							null, bool, (byte) 126, i_14_, i_16_, i_19_, i_20_);
					wa();
					method2327();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ka.WB(" + i + ','
					+ i_14_ + ','
					+ (class98_sub46_sub16 != null ? "{...}" : "null") + ','
					+ i_15_ + ',' + i_16_ + ','
					+ (class98_sub46_sub16_17_ != null ? "{...}" : "null")
					+ ',' + bool + ',' + i_18_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_19_ + ','
					+ i_20_ + ')'));
		}
	}

	abstract int ua();

	abstract boolean method2324();

	abstract void method2325(Class111 class111, Class246_Sub6 class246_sub6,
			int i);

	abstract void H(int i, int i_22_, int i_23_);

	abstract void method2326();

	abstract void VA(int i);

	abstract void method2327();

	public static void method2328(int i) {
		try {
			aClass58_1179 = null;
			aClass377_1180 = null;
			if (i != 0)
				aClass196_1182 = null;
			aClass196_1182 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ka.QB(" + i + ')');
		}
	}

	abstract int V();

	abstract void method2329(Class111 class111, Class246_Sub6 class246_sub6,
			int i, int i_24_);

	abstract void aa(short i, short i_25_);

	private final void method2330(Class7 class7, Class98_Sub1 class98_sub1,
			boolean bool, Class7 class7_26_, int[] is, boolean[] bools,
			boolean bool_27_, byte i, int i_28_, int i_29_, int i_30_, int i_31_) {
		try {
			if (class7_26_ == null || i_28_ == 0) {
				for (int i_32_ = 0; ((Class7) class7).anInt100 > i_32_; i_32_++) {
					short i_33_ = ((Class7) class7).aShortArray108[i_32_];
					if (bools == null
							|| bool == bools[i_33_]
							|| (((Class98_Sub1) class98_sub1).anIntArray3812[i_33_] == 0)) {
						short i_34_ = ((Class7) class7).aShortArray107[i_32_];
						if ((i_34_ ^ 0xffffffff) != 0)
							method2334(
									0,
									bool_27_,
									0,
									0,
									i_29_
											& (((Class98_Sub1) class98_sub1).anIntArray3815[i_34_]),
									(byte) 74,
									i_30_,
									0,
									(((Class98_Sub1) class98_sub1).anIntArrayArray3816[i_34_]),
									is);
						method2334(
								(((Class98_Sub1) class98_sub1).anIntArray3812[i_33_]),
								bool_27_,
								((Class7) class7).aShortArray94[i_32_],
								((Class7) class7).aShortArray106[i_32_],
								i_29_
										& (((Class98_Sub1) class98_sub1).anIntArray3815[i_33_]),
								(byte) 64,
								i_30_,
								((Class7) class7).aShortArray105[i_32_],
								(((Class98_Sub1) class98_sub1).anIntArrayArray3816[i_33_]),
								is);
					}
				}
			} else {
				int i_35_ = 0;
				if (i < 52)
					method2331(null, -74, false);
				int i_36_ = 0;
				for (int i_37_ = 0; ((i_37_ ^ 0xffffffff) > (((Class98_Sub1) class98_sub1).anInt3809 ^ 0xffffffff)); i_37_++) {
					boolean bool_38_ = false;
					if (i_35_ < ((Class7) class7).anInt100
							&& (((Class7) class7).aShortArray108[i_35_] ^ 0xffffffff) == (i_37_ ^ 0xffffffff))
						bool_38_ = true;
					boolean bool_39_ = false;
					if (i_36_ < ((Class7) class7_26_).anInt100
							&& (((Class7) class7_26_).aShortArray108[i_36_] == i_37_))
						bool_39_ = true;
					if (bool_38_ || bool_39_) {
						if (bools != null
								&& bools[i_37_] == !bool
								&& ((((Class98_Sub1) class98_sub1).anIntArray3812[i_37_]) ^ 0xffffffff) != -1) {
							if (bool_39_)
								i_36_++;
							if (bool_38_)
								i_35_++;
						} else {
							int i_40_ = 0;
							int i_41_ = (((Class98_Sub1) class98_sub1).anIntArray3812[i_37_]);
							if ((i_41_ ^ 0xffffffff) == -4 || i_41_ == 10)
								i_40_ = 128;
							int i_42_;
							short i_43_;
							int i_44_;
							byte i_45_;
							int i_46_;
							if (bool_38_) {
								i_43_ = ((Class7) class7).aShortArray107[i_35_];
								i_45_ = ((Class7) class7).aByteArray99[i_35_];
								i_42_ = ((Class7) class7).aShortArray106[i_35_];
								i_44_ = ((Class7) class7).aShortArray105[i_35_];
								i_46_ = ((Class7) class7).aShortArray94[i_35_];
								i_35_++;
							} else {
								i_42_ = i_40_;
								i_43_ = (short) -1;
								i_44_ = i_40_;
								i_45_ = (byte) 0;
								i_46_ = i_40_;
							}
							int i_47_;
							int i_48_;
							byte i_49_;
							short i_50_;
							int i_51_;
							if (!bool_39_) {
								i_48_ = i_40_;
								i_47_ = i_40_;
								i_51_ = i_40_;
								i_50_ = (short) -1;
								i_49_ = (byte) 0;
							} else {
								i_47_ = (((Class7) class7_26_).aShortArray105[i_36_]);
								i_48_ = (((Class7) class7_26_).aShortArray106[i_36_]);
								i_49_ = (((Class7) class7_26_).aByteArray99[i_36_]);
								i_50_ = (((Class7) class7_26_).aShortArray107[i_36_]);
								i_51_ = (((Class7) class7_26_).aShortArray94[i_36_]);
								i_36_++;
							}
							int i_52_;
							int i_53_;
							int i_54_;
							if ((0x2 & i_45_ ^ 0xffffffff) == -1
									&& (i_49_ & 0x1 ^ 0xffffffff) == -1) {
								if ((i_41_ ^ 0xffffffff) == -3) {
									int i_55_ = i_51_ - i_46_ & 0x3fff;
									int i_56_ = i_47_ + -i_44_ & 0x3fff;
									if (i_55_ >= 8192)
										i_55_ -= 16384;
									int i_57_ = i_48_ - i_42_ & 0x3fff;
									if ((i_56_ ^ 0xffffffff) <= -8193)
										i_56_ -= 16384;
									i_54_ = (0x3fff & i_28_ * i_55_ / i_31_
											+ i_46_);
									if ((i_57_ ^ 0xffffffff) <= -8193)
										i_57_ -= 16384;
									i_52_ = (i_56_ * i_28_ / i_31_ + i_44_ & 0x3fff);
									i_53_ = (i_57_ * i_28_ / i_31_ + i_42_ & 0x3fff);
								} else if (i_41_ != 9) {
									if ((i_41_ ^ 0xffffffff) == -8) {
										int i_58_ = i_51_ - i_46_ & 0x3f;
										if (i_58_ >= 32)
											i_58_ -= 64;
										i_54_ = 0x3f & i_46_
												+ (i_28_ * i_58_ / i_31_);
										i_53_ = i_42_
												+ ((i_48_ - i_42_) * i_28_ / i_31_);
										i_52_ = ((i_47_ - i_44_) * i_28_
												/ i_31_ + i_44_);
									} else {
										i_52_ = (i_28_ * (-i_44_ + i_47_)
												/ i_31_ + i_44_);
										i_54_ = i_46_
												- -((i_51_ + -i_46_) * i_28_ / i_31_);
										i_53_ = ((i_48_ + -i_42_) * i_28_
												/ i_31_ + i_42_);
									}
								} else {
									int i_59_ = -i_46_ + i_51_ & 0x3fff;
									if (i_59_ >= 8192)
										i_59_ -= 16384;
									i_54_ = (i_59_ * i_28_ / i_31_ + i_46_ & 0x3fff);
									i_52_ = i_53_ = 0;
								}
							} else {
								i_52_ = i_44_;
								i_53_ = i_42_;
								i_54_ = i_46_;
							}
							if ((i_43_ ^ 0xffffffff) == 0) {
								if ((i_50_ ^ 0xffffffff) != 0)
									method2334(
											0,
											bool_27_,
											0,
											0,
											i_29_
													& (((Class98_Sub1) class98_sub1).anIntArray3815[i_50_]),
											(byte) 82,
											i_30_,
											0,
											(((Class98_Sub1) class98_sub1).anIntArrayArray3816[i_50_]),
											is);
							} else
								method2334(
										0,
										bool_27_,
										0,
										0,
										(((Class98_Sub1) class98_sub1).anIntArray3815[i_43_])
												& i_29_,
										(byte) 73,
										i_30_,
										0,
										(((Class98_Sub1) class98_sub1).anIntArrayArray3816[i_43_]),
										is);
							method2334(
									i_41_,
									bool_27_,
									i_54_,
									i_53_,
									(((Class98_Sub1) class98_sub1).anIntArray3815[i_37_])
											& i_29_,
									(byte) 70,
									i_30_,
									i_52_,
									(((Class98_Sub1) class98_sub1).anIntArrayArray3816[i_37_]),
									is);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("ka.BC(" + (class7 != null ? "{...}" : "null") + ','
							+ (class98_sub1 != null ? "{...}" : "null") + ','
							+ bool + ','
							+ (class7_26_ != null ? "{...}" : "null") + ','
							+ (is != null ? "{...}" : "null") + ','
							+ (bools != null ? "{...}" : "null") + ','
							+ bool_27_ + ',' + i + ',' + i_28_ + ',' + i_29_
							+ ',' + i_30_ + ',' + i_31_ + ')'));
		}
	}

	abstract void method2331(Class111 class111, int i, boolean bool);

	abstract void wa();

	abstract int HA();

	abstract void method2332(Class146 class146_60_, int i, int i_61_,
			int i_62_, boolean bool);

	abstract void v();

	abstract boolean method2333(int i, int i_63_, Class111 class111,
			boolean bool, int i_64_, int i_65_);

	private final void method2334(int i, boolean bool, int i_66_, int i_67_,
			int i_68_, byte i_69_, int i_70_, int i_71_, int[] is, int[] is_72_) {
		try {
			if ((i_70_ ^ 0xffffffff) == -2) {
				if ((i ^ 0xffffffff) == -1 || i == 1) {
					int i_73_ = -i_66_;
					i_66_ = i_67_;
					i_67_ = i_73_;
				} else if (i == 3) {
					int i_74_ = i_66_;
					i_66_ = i_67_;
					i_67_ = i_74_;
				} else if ((i ^ 0xffffffff) == -3) {
					int i_75_ = i_66_;
					i_66_ = -i_67_ & 0x3fff;
					i_67_ = i_75_ & 0x3fff;
				}
			} else if ((i_70_ ^ 0xffffffff) != -3) {
				if ((i_70_ ^ 0xffffffff) == -4) {
					if (i == 0 || i == 1) {
						int i_76_ = i_66_;
						i_66_ = -i_67_;
						i_67_ = i_76_;
					} else if (i != 3) {
						if (i == 2) {
							int i_77_ = i_66_;
							i_66_ = 0x3fff & i_67_;
							i_67_ = 0x3fff & -i_77_;
						}
					} else {
						int i_78_ = i_66_;
						i_66_ = i_67_;
						i_67_ = i_78_;
					}
				}
			} else if (i != 0 && i != 1) {
				if ((i ^ 0xffffffff) == -3) {
					i_66_ = -i_66_ & 0x3fff;
					i_67_ = 0x3fff & -i_67_;
				}
			} else {
				i_67_ = -i_67_;
				i_66_ = -i_66_;
			}
			if (i_69_ < 51)
				aClass377_1180 = null;
			if ((i_68_ ^ 0xffffffff) != -65536)
				I(i, is, i_66_, i_71_, i_67_, bool, i_68_, is_72_);
			else
				method2344(i, is, i_66_, i_71_, i_67_, i_70_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ka.RB(" + i + ','
					+ bool + ',' + i_66_ + ',' + i_67_ + ',' + i_68_ + ','
					+ i_69_ + ',' + i_70_ + ',' + i_71_ + ','
					+ (is != null ? "{...}" : "null") + ','
					+ (is_72_ != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void O(int i, int i_79_, int i_80_);

	abstract int da();

	static final void method2335() {
		for (int i = 0; i < Class226.anInt1705; i++) {
			if (!Class21_Sub4.aBooleanArray5399[i]) {
				Class1 class1 = Class98_Sub10_Sub31.aClass1Array5717[i];
				Class98_Sub5 class98_sub5 = ((Class1) class1).aClass98_Sub5_55;
				int i_81_ = ((Class1) class1).anInt57;
				int i_82_ = class98_sub5.method958(5) - Class207.anInt1577;
				int i_83_ = 1 + (2 * i_82_ >> Class151_Sub8.anInt5015);
				int i_84_ = 0;
				int[] is = new int[i_83_ * i_83_];
				int i_85_ = (class98_sub5.method954(7019) - i_82_ >> Class151_Sub8.anInt5015);
				int i_86_ = (class98_sub5.method962(28699) - i_82_ >> Class151_Sub8.anInt5015);
				int i_87_ = (class98_sub5.method962(28699) + i_82_ >> Class151_Sub8.anInt5015);
				if (i_86_ < 0) {
					i_84_ -= i_86_;
					i_86_ = 0;
				}
				if (i_87_ >= Class64_Sub9.anInt3662)
					i_87_ = Class64_Sub9.anInt3662 - 1;
				for (int i_88_ = i_86_; i_88_ <= i_87_; i_88_++) {
					int i_89_ = ((Class1) class1).aShortArray59[i_84_];
					int i_90_ = i_89_ >>> 8;
					int i_91_ = i_84_ * i_83_ + i_90_;
					int i_92_ = i_85_ + (i_89_ >>> 8);
					int i_93_ = i_92_ + (i_89_ & 0xff) - 1;
					if (i_92_ < 0) {
						i_91_ -= i_92_;
						i_92_ = 0;
					}
					if (i_93_ >= Class366.anInt3112)
						i_93_ = Class366.anInt3112 - 1;
					for (int i_94_ = i_92_; i_94_ <= i_93_; i_94_++) {
						int i_95_ = 1;
						Class246_Sub3_Sub4 class246_sub3_sub4 = (AnimationDefinition
								.method931(
										i_81_,
										i_94_,
										i_88_,
										(aClass1184 != null ? aClass1184
												: (aClass1184 = method2345("Class246_Sub3_Sub4")))));
						if (class246_sub3_sub4 != null
								&& (((Class246_Sub3_Sub4) class246_sub3_sub4).aByte6161) != 0) {
							if ((((Class246_Sub3_Sub4) class246_sub3_sub4).aByte6161) == 1) {
								boolean bool = i_94_ - 1 >= i_92_;
								boolean bool_96_ = i_94_ + 1 <= i_93_;
								if (!bool && i_88_ + 1 <= i_87_) {
									int i_97_ = (((Class1) class1).aShortArray59[i_84_ + 1]);
									int i_98_ = i_85_ + (i_97_ >>> 8);
									int i_99_ = i_98_ + (i_97_ & 0xff);
									bool = i_94_ > i_98_ && i_94_ < i_99_;
								}
								if (!bool_96_ && i_88_ - 1 >= i_86_) {
									int i_100_ = (((Class1) class1).aShortArray59[i_84_ - 1]);
									int i_101_ = i_85_ + (i_100_ >>> 8);
									int i_102_ = i_101_ + (i_100_ & 0xff);
									bool_96_ = i_94_ > i_101_ && i_94_ < i_102_;
								}
								if (bool && !bool_96_)
									i_95_ = 4;
								else if (bool_96_ && !bool)
									i_95_ = 2;
							} else {
								boolean bool = i_94_ - 1 >= i_92_;
								boolean bool_103_ = i_94_ + 1 <= i_93_;
								if (!bool && i_88_ - 1 >= i_86_) {
									int i_104_ = (((Class1) class1).aShortArray59[i_84_ - 1]);
									int i_105_ = i_85_ + (i_104_ >>> 8);
									int i_106_ = i_105_ + (i_104_ & 0xff);
									bool = i_94_ > i_105_ && i_94_ < i_106_;
								}
								if (!bool_103_ && i_88_ + 1 <= i_87_) {
									int i_107_ = (((Class1) class1).aShortArray59[i_84_ + 1]);
									int i_108_ = i_85_ + (i_107_ >>> 8);
									int i_109_ = i_108_ + (i_107_ & 0xff);
									bool_103_ = i_94_ > i_108_
											&& i_94_ < i_109_;
								}
								if (bool && !bool_103_)
									i_95_ = 3;
								else if (bool_103_ && !bool)
									i_95_ = 5;
							}
						}
						is[i_91_++] = i_95_;
					}
					i_84_++;
				}
				Class21_Sub4.aBooleanArray5399[i] = true;
				Class78.aSArray594[i_81_].method3421(class98_sub5, is);
			}
		}
	}

	final void method2336(int i, int i_110_, s var_s, int i_111_, int i_112_,
			int i_113_, int i_114_, int i_115_, int i_116_) {
		do {
			try {
				boolean bool = false;
				boolean bool_117_ = false;
				boolean bool_118_ = false;
				int i_119_ = -i_110_ / 2;
				int i_120_ = -i / 2;
				int i_121_ = var_s.method3417(i_112_ - -i_119_,
						i_113_ + i_120_, true);
				int i_122_ = i_110_ / 2;
				int i_123_ = -i / 2;
				int i_124_ = var_s.method3417(i_122_ + i_112_, i_123_ + i_113_,
						true);
				int i_125_ = -i_110_ / 2;
				int i_126_ = i / 2;
				int i_127_ = var_s.method3417(i_125_ + i_112_, i_126_ + i_113_,
						true);
				int i_128_ = i_110_ / 2;
				int i_129_ = i / i_115_;
				int i_130_ = var_s.method3417(i_112_ + i_128_, i_129_ + i_113_,
						true);
				int i_131_ = ((i_124_ ^ 0xffffffff) >= (i_121_ ^ 0xffffffff) ? i_124_
						: i_121_);
				int i_132_ = i_130_ > i_127_ ? i_127_ : i_130_;
				int i_133_ = i_130_ <= i_124_ ? i_130_ : i_124_;
				if ((i ^ 0xffffffff) != -1) {
					int i_134_ = (int) (Math.atan2((double) (-i_132_ + i_131_),
							(double) i) * 2607.5945876176133) & 0x3fff;
					if ((i_134_ ^ 0xffffffff) != -1) {
						if ((i_114_ ^ 0xffffffff) != -1) {
							if (i_134_ > 8192) {
								int i_135_ = 16384 - i_114_;
								if (i_135_ > i_134_)
									i_134_ = i_135_;
							} else if ((i_134_ ^ 0xffffffff) < (i_114_ ^ 0xffffffff))
								i_134_ = i_114_;
						}
						FA(i_134_);
					}
				}
				int i_136_ = ((i_121_ ^ 0xffffffff) <= (i_127_ ^ 0xffffffff) ? i_127_
						: i_121_);
				if (i_110_ != 0) {
					int i_137_ = ((int) (2607.5945876176133 * Math.atan2(
							(double) (-i_133_ + i_136_), (double) i_110_)) & 0x3fff);
					if ((i_137_ ^ 0xffffffff) != -1) {
						if (i_116_ != 0) {
							if ((i_137_ ^ 0xffffffff) >= -8193) {
								if ((i_116_ ^ 0xffffffff) > (i_137_ ^ 0xffffffff))
									i_137_ = i_116_;
							} else {
								int i_138_ = -i_116_ + 16384;
								if ((i_137_ ^ 0xffffffff) > (i_138_ ^ 0xffffffff))
									i_137_ = i_138_;
							}
						}
						VA(i_137_);
					}
				}
				int i_139_ = i_121_ - -i_130_;
				if ((i_124_ + i_127_ ^ 0xffffffff) > (i_139_ ^ 0xffffffff))
					i_139_ = i_124_ + i_127_;
				i_139_ = -i_111_ + (i_139_ >> -1210480799);
				if (i_139_ == 0)
					break;
				H(0, i_139_, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ka.AC(" + i
						+ ',' + i_110_ + ','
						+ (var_s != null ? "{...}" : "null") + ',' + i_111_
						+ ',' + i_112_ + ',' + i_113_ + ',' + i_114_ + ','
						+ i_115_ + ',' + i_116_ + ')'));
			}
			break;
		} while (false);
	}

	abstract void s(int i);

	abstract void method2337(int i, int i_140_, int i_141_, int i_142_);

	abstract int fa();

	final void method2338(int i, Class98_Sub46_Sub16 class98_sub46_sub16,
			int i_143_, Class98_Sub46_Sub16 class98_sub46_sub16_144_,
			boolean bool, int i_145_, int i_146_, int i_147_, int i_148_) {
		try {
			if (i_143_ != -1) {
				method2342();
				if (!NA())
					method2327();
				else {
					Class7 class7 = (((Class98_Sub46_Sub16) class98_sub46_sub16).aClass7Array6045[i_143_]);
					int i_149_ = 109 % ((53 - i_146_) / 58);
					Class98_Sub1 class98_sub1 = ((Class7) class7).aClass98_Sub1_93;
					Class7 class7_150_ = null;
					if (class98_sub46_sub16_144_ != null) {
						class7_150_ = (((Class98_Sub46_Sub16) class98_sub46_sub16_144_).aClass7Array6045[i_148_]);
						if (class98_sub1 != ((Class7) class7_150_).aClass98_Sub1_93)
							class7_150_ = null;
					}
					method2330(class7, class98_sub1, false, class7_150_, null,
							null, bool, (byte) 124, i, 65535, i_145_, i_147_);
					wa();
					method2327();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ka.SB(" + i + ','
					+ (class98_sub46_sub16 != null ? "{...}" : "null") + ','
					+ i_143_ + ','
					+ (class98_sub46_sub16_144_ != null ? "{...}" : "null")
					+ ',' + bool + ',' + i_145_ + ',' + i_146_ + ',' + i_147_
					+ ',' + i_148_ + ')'));
		}
	}

	abstract boolean method2339(int i, int i_151_, Class111 class111,
			boolean bool, int i_152_);

	abstract int na();

	abstract void P(int i, int i_153_, int i_154_, int i_155_);

	final void method2340(Class98_Sub46_Sub16 class98_sub46_sub16, int i,
			int i_156_) {
		try {
			if (i_156_ != -1) {
				method2342();
				if (!NA())
					method2327();
				else {
					Class7 class7 = (((Class98_Sub46_Sub16) class98_sub46_sub16).aClass7Array6045[i_156_]);
					Class98_Sub1 class98_sub1 = ((Class7) class7).aClass98_Sub1_93;
					for (int i_157_ = i; ((((Class7) class7).anInt100 ^ 0xffffffff) < (i_157_ ^ 0xffffffff)); i_157_++) {
						short i_158_ = ((Class7) class7).aShortArray108[i_157_];
						if (((Class98_Sub1) class98_sub1).aBooleanArray3810[i_158_]) {
							if ((((Class7) class7).aShortArray107[i_157_] ^ 0xffffffff) != 0)
								P(0, 0, 0, 0);
							P((((Class98_Sub1) class98_sub1).anIntArray3812[i_158_]),
									((Class7) class7).aShortArray94[i_157_],
									((Class7) class7).aShortArray105[i_157_],
									((Class7) class7).aShortArray106[i_157_]);
						}
					}
					wa();
					method2327();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ka.VB("
					+ (class98_sub46_sub16 != null ? "{...}" : "null") + ','
					+ i + ',' + i_156_ + ')'));
		}
	}

	abstract void I(int i, int[] is, int i_159_, int i_160_, int i_161_,
			boolean bool, int i_162_, int[] is_163_);

	abstract void ia(short i, short i_164_);

	abstract void C(int i);

	abstract void p(int i, int i_165_, s var_s, s var_s_166_, int i_167_,
			int i_168_, int i_169_);

	abstract Class146 method2341(byte i, int i_170_, boolean bool);

	abstract void method2342();

	abstract boolean NA();

	abstract int EA();

	public Class146() {
		/* empty */
	}

	abstract boolean F();

	abstract void method2343(Class111 class111);

	abstract void method2344(int i, int[] is, int i_171_, int i_172_,
			int i_173_, int i_174_, boolean bool);

	abstract int ma();

	/* synthetic */
	static Class method2345(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
