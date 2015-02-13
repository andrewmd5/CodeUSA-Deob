/* Class98_Sub10_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub22 extends Class98_Sub10 {
	static OutgoingOpcode aClass171_5652;
	static volatile Object anObject5653 = null;
	private int anInt5654;
	private int anInt5655;
	private int anInt5656;

	static final void method1069(int i, ha var_ha) {
		try {
			if (i != 256)
				method1072((byte) -94);
			if (Class246_Sub3_Sub4_Sub2_Sub2.aBoolean6540)
				Class116.method2159((byte) 80, var_ha);
			else
				Class96.method926(2, var_ha);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nn.D(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final int[][] method997(int i, int i_0_) {
		try {
			if (i >= -76)
				anInt5656 = -70;
			int[][] is = ((Class98_Sub10) this).aClass223_3859.method2828(i_0_,
					0);
			if (((Class223) ((Class98_Sub10) this).aClass223_3859).aBoolean1683) {
				int[] is_1_ = is[0];
				int[] is_2_ = is[1];
				int[] is_3_ = is[2];
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff); i_4_++) {
					is_1_[i_4_] = anInt5654;
					is_2_[i_4_] = anInt5656;
					is_3_[i_4_] = anInt5655;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nn.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method1070(byte i, Class85 class85) {
		try {
			if (class85 == ha_Sub1.aClass85_4299) {
				int i_5_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteA(true);
				int i_6_ = Class53.anInt430 - -((0x7c & i_5_) >> 1327059812);
				int i_7_ = Class335.anInt2819 + (i_5_ & 0x7);
				int i_8_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteA(true);
				int i_9_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShort1((byte) 51);
				GameObjectDefinition class352 = Class130.aClass302_1028
						.method3546(i_9_, (byte) 119);
				int i_10_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteA(true);
				int i_11_ = i_10_ >> 948044066;
				int i_12_ = Class64_Sub17.anIntArray3685[i_11_];
				if (i_11_ == 11)
					i_11_ = 10;
				int i_13_ = 0;
				if (((GameObjectDefinition) class352).aByteArray2994 != null) {
					int i_14_ = -1;
					for (int i_15_ = 0; ((GameObjectDefinition) class352).aByteArray2994.length > i_15_; i_15_++) {
						if (((GameObjectDefinition) class352).aByteArray2994[i_15_] == i_11_) {
							i_14_ = i_15_;
							break;
						}
					}
					i_13_ = (((GameObjectDefinition) class352).anIntArrayArray2951[i_14_]).length;
				}
				int i_16_ = 0;
				if (((GameObjectDefinition) class352).aShortArray2965 != null)
					i_16_ = ((GameObjectDefinition) class352).aShortArray2965.length;
				int i_17_ = 0;
				if (((GameObjectDefinition) class352).aShortArray2974 != null)
					i_17_ = ((GameObjectDefinition) class352).aShortArray2974.length;
				if ((i_8_ & 0x1) == 1)
					Class152.method2478(i_7_, i_12_, null, i_6_, -75,
							Class206.anInt1568);
				else {
					int[] is = null;
					if ((i_8_ & 0x2 ^ 0xffffffff) == -3) {
						is = new int[i_13_];
						for (int i_18_ = 0; i_18_ < i_13_; i_18_++)
							is[i_18_] = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
									.readUnsignedShort((byte) 127);
					}
					short[] is_19_ = null;
					if ((i_8_ & 0x4) == 4) {
						is_19_ = new short[i_16_];
						for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_20_++)
							is_19_[i_20_] = (short) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
									.readUnsignedShort((byte) 127);
					}
					short[] is_21_ = null;
					if ((0x8 & i_8_) == 8) {
						is_21_ = new short[i_17_];
						for (int i_22_ = 0; i_22_ < i_17_; i_22_++)
							is_21_[i_22_] = (short) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
									.readUnsignedShort((byte) 127);
					}
					Class152.method2478(i_7_, i_12_, new Class185(
							Class280.aLong2112++, is, is_19_, is_21_), i_6_,
							-92, Class206.anInt1568);
				}
			} else if (class85 == Class39.aClass85_362) {
				int i_23_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -124);
				int i_24_ = Class53.anInt430 - -(i_23_ >> -1645863036 & 0x7);
				int i_25_ = Class335.anInt2819 + (i_23_ & 0x7);
				int i_26_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				if (i_26_ == 65535)
					i_26_ = -1;
				int i_27_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -2);
				int i_28_ = 0xf & i_27_ >> 218942468;
				int i_29_ = 0x7 & i_27_;
				int i_30_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -103);
				int i_31_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -113);
				int i_32_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				if ((i_24_ ^ 0xffffffff) <= -1 && i_25_ >= 0
						&& Class165.anInt1276 > i_24_
						&& Class98_Sub10_Sub7.anInt5572 > i_25_) {
					int i_33_ = 1 + i_28_;
					if ((((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6437[0]) >= -i_33_
							+ i_24_
							&& (i_24_ + i_33_ >= (((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6437[0]))
							&& ((i_25_ - i_33_ ^ 0xffffffff) >= ((((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6438[0]) ^ 0xffffffff))
							&& (((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6438[0]) <= i_25_
									- -i_33_)
						Class21_Sub4
								.method278(
										i_31_,
										i_32_,
										i_26_,
										i_29_,
										i_30_,
										(byte) 65,
										((i_25_ << -1680627448)
												+ (i_24_ << 129807376)
												+ (Class206.anInt1568 << -1551112) - -i_28_));
				}
			} else if (Class98_Sub23.aClass85_4007 == class85) {
				int i_34_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteC((byte) -128);
				int i_35_ = i_34_ >> 1098097986;
				int i_36_ = i_34_ & 0x3;
				int i_37_ = Class64_Sub17.anIntArray3685[i_35_];
				int i_38_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(i ^ ~0x56);
				int i_39_ = Class53.anInt430 + (i_38_ >> 909525444 & 0x7);
				int i_40_ = Class335.anInt2819 + (i_38_ & 0x7);
				if (ReferenceTable.method3623(-114, Class151_Sub9.anInt5028)
						|| ((i_39_ ^ 0xffffffff) <= -1
								&& (i_40_ ^ 0xffffffff) <= -1
								&& Class165.anInt1276 > i_39_ && i_40_ < Class98_Sub10_Sub7.anInt5572))
					Class64_Sub9.method591(-85, i_39_, i_35_, i_40_, i_37_, -1,
							i_36_, Class206.anInt1568);
			} else if (SurfaceSkin.aClass85_332 == class85) {
				int i_41_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 17);
				int i_42_ = Class53.anInt430 * 2
						+ ((i_41_ & 0xfa) >> -1945955580);
				int i_43_ = (0xf & i_41_) + Class335.anInt2819 * 2;
				int i_44_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 36);
				boolean bool = (i_44_ & 0x1) != 0;
				boolean bool_45_ = (0x2 & i_44_) != 0;
				int i_46_ = !bool_45_ ? -1 : i_44_ >> 1165493090;
				int i_47_ = i_42_
						- -Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readSignedByte((byte) -19);
				int i_48_ = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readSignedByte((byte) -19) + i_43_);
				int i_49_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUShort(false);
				int i_50_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUShort(false);
				int i_51_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				int i_52_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -121);
				if (!bool_45_)
					i_52_ *= 4;
				else
					i_52_ = (byte) i_52_;
				int i_53_ = 4 * Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 71);
				int i_54_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				int i_55_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				int i_56_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -119);
				int i_57_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				if ((i_56_ ^ 0xffffffff) == -256)
					i_56_ = -1;
				if ((i_42_ ^ 0xffffffff) <= -1
						&& (i_43_ ^ 0xffffffff) <= -1
						&& (i_42_ ^ 0xffffffff) > (Class165.anInt1276 * 2 ^ 0xffffffff)
						&& i_43_ < Class165.anInt1276 * 2 && i_47_ >= 0
						&& i_48_ >= 0
						&& Class98_Sub10_Sub7.anInt5572 * 2 > i_47_
						&& Class98_Sub10_Sub7.anInt5572 * 2 > i_48_
						&& (i_51_ ^ 0xffffffff) != -65536) {
					i_43_ = 256 * i_43_;
					i_53_ <<= 2;
					i_57_ <<= 2;
					i_52_ <<= 2;
					i_42_ = 256 * i_42_;
					i_48_ = 256 * i_48_;
					i_47_ *= 256;
					if ((i_49_ ^ 0xffffffff) != -1 && i_46_ != -1) {
						Class246_Sub3_Sub4_Sub2 class246_sub3_sub4_sub2 = null;
						if ((i_49_ ^ 0xffffffff) <= -1) {
							int i_58_ = -1 + i_49_;
							Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
									.method3990((long) i_58_, -1));
							if (class98_sub39 != null)
								class246_sub3_sub4_sub2 = (((Class98_Sub39) class98_sub39).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
						} else {
							int i_59_ = -1 + -i_49_;
							if ((i_59_ ^ 0xffffffff) != (za_Sub2.anInt6080 ^ 0xffffffff))
								class246_sub3_sub4_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_59_]);
							else
								class246_sub3_sub4_sub2 = (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660);
						}
						if (class246_sub3_sub4_sub2 != null) {
							Class294 class294 = class246_sub3_sub4_sub2
									.method3039(1);
							if ((((Class294) class294).anIntArrayArray2366 != null)
									&& (((Class294) class294).anIntArrayArray2366[i_46_]) != null)
								i_52_ -= (((Class294) class294).anIntArrayArray2366[i_46_][1]);
							if ((((Class294) class294).anIntArrayArray2364 != null)
									&& (((Class294) class294).anIntArrayArray2364[i_46_]) != null)
								i_52_ -= (((Class294) class294).anIntArrayArray2364[i_46_][1]);
						}
					}
					Class246_Sub3_Sub4_Sub4 class246_sub3_sub4_sub4 = (new Class246_Sub3_Sub4_Sub4(
							i_51_, Class206.anInt1568, Class206.anInt1568,
							i_42_, i_43_, i_52_, i_54_ + Class215.anInt1614,
							i_55_ - -Class215.anInt1614, i_56_, i_57_, i_49_,
							i_50_, i_53_, bool, i_46_));
					class246_sub3_sub4_sub4.method3074(i_47_,
							(-i_53_ + Class98_Sub46_Sub2_Sub2.method1538(
									(Class206.anInt1568), i_48_, i_47_, i
											^ ~0x5e03)), Class215.anInt1614
									+ i_54_, (byte) 108, i_48_);
					Class280.aClass148_2108.method2419(new Class98_Sub46_Sub5(
							class246_sub3_sub4_sub4), i + -20866);
				}
			} else if (Class242.aClass85_1849 == class85) {// ROAR
				// projectile
				int i_60_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -120);
				boolean bool = (i_60_ & 0x80 ^ 0xffffffff) != -1;
				int i_61_ = Class53.anInt430 - -(0x7 & i_60_ >> -1600745245);
				int i_62_ = (i_60_ & 0x7) + Class335.anInt2819;
				int i_63_ = i_61_
						+ Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readSignedByte((byte) -19);
				int i_64_ = i_62_
						- -Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readSignedByte((byte) -19);
				int i_65_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUShort(false);
				int i_66_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127); // lol fp
				int i_67_ = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 0) * 4);
				int i_68_ = 4 * Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -8);
				int i_69_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				int i_70_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				int i_71_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -100);
				int i_72_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				if (i_71_ == 255)
					i_71_ = -1;
				if (i_61_ >= 0
						&& i_62_ >= 0
						&& Class165.anInt1276 > i_61_
						&& ((Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff) < (i_62_ ^ 0xffffffff))
						&& i_63_ >= 0
						&& (i_64_ ^ 0xffffffff) <= -1
						&& i_63_ < Class165.anInt1276
						&& (i_64_ ^ 0xffffffff) > (Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff)
						&& (i_66_ ^ 0xffffffff) != -65536) {
					i_68_ <<= 2;
					i_61_ = i_61_ * 512 + 256;
					i_67_ <<= 2;
					i_62_ = 256 + i_62_ * 512;
					i_63_ = 256 + i_63_ * 512;
					i_64_ = i_64_ * 512 + 256;
					i_72_ <<= 2;
					Class246_Sub3_Sub4_Sub4 class246_sub3_sub4_sub4 = (new Class246_Sub3_Sub4_Sub4(
							i_66_, Class206.anInt1568, Class206.anInt1568,
							i_61_, i_62_, i_67_, i_69_ + Class215.anInt1614,
							i_70_ - -Class215.anInt1614, i_71_, i_72_, 0,
							i_65_, i_68_, bool, -1));
					class246_sub3_sub4_sub4.method3074(
							i_63_,
							Class98_Sub46_Sub2_Sub2.method1538(
									Class206.anInt1568, i_64_, i_63_, 24111)
									- i_68_, i_69_ - -Class215.anInt1614,
							(byte) 108, i_64_);
					Class280.aClass148_2108.method2419(new Class98_Sub46_Sub5(
							class246_sub3_sub4_sub4), -20911);
				}
			} else {
				if (class85 == Class373_Sub3.aClass85_5474) {
					int i_73_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) -102);
					int i_74_ = Class335.anInt2819 + (i_73_ & 0x7);
					int i_75_ = aa_Sub2.anInt3562 + i_74_;
					int i_76_ = (0x7 & i_73_ >> -1172232540) + Class53.anInt430;
					int i_77_ = i_76_ - -Class272.anInt2038;
					int i_78_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					int i_79_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					int i_80_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					if (Class146.aClass377_1180 != null) {
						Class98_Sub45 class98_sub45 = ((Class98_Sub45) (Class146.aClass377_1180
								.method3990(
										(long) (i_77_ | (i_75_ << -45976338 | (Class206.anInt1568 << -2048549060))),
										i ^ 0x2c)));
						if (class98_sub45 != null) {
							for (Class98_Sub26 class98_sub26 = ((Class98_Sub26) ((Class98_Sub45) class98_sub45).aClass148_4254
									.method2418(32)); class98_sub26 != null; class98_sub26 = ((Class98_Sub26) ((Class98_Sub45) class98_sub45).aClass148_4254
									.method2417(i + 142))) {
								if (((i_78_ & 0x7fff ^ 0xffffffff) == ((((Class98_Sub26) class98_sub26).anInt4031) ^ 0xffffffff))
										&& (((Class98_Sub26) class98_sub26).anInt4032) == i_79_) {
									class98_sub26.method942(44);
									((Class98_Sub26) class98_sub26).anInt4032 = i_80_;
									Class48_Sub1.method458(class98_sub26,
											Class206.anInt1568, i_75_, i_77_,
											true);
									break;
								}
							}
							if (i_76_ >= 0
									&& i_74_ >= 0
									&& (i_76_ ^ 0xffffffff) > (Class165.anInt1276 ^ 0xffffffff)
									&& i_74_ < Class98_Sub10_Sub7.anInt5572)
								Class98_Sub32.method1437(i_76_,
										Class206.anInt1568, (byte) 114, i_74_);
						}
					}
				} else if (class85 == Class64_Sub10.aClass85_3667) {
					Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) -113);
					int i_81_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) -122);
					int i_82_ = ((0x72 & i_81_) >> 889841188)
							+ Class53.anInt430;
					int i_83_ = (0x7 & i_81_) + Class335.anInt2819;
					int i_84_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					int i_85_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) -7);
					int i_86_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readMediumInt(-123);
					String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
					Class325.method3696((byte) 118, i_86_, i_83_, i_84_,
							string, i_85_, Class206.anInt1568, i_82_);
				} else if (Class6.aClass85_89 == class85) {// ground items
					int i_87_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readLEShortA((byte) -68);
					int i_88_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readByteS(i ^ ~0x50);
					int i_89_ = (i_88_ & 0x7) + Class335.anInt2819;
					int i_90_ = aa_Sub2.anInt3562 - -i_89_;
					int i_91_ = Class53.anInt430 + (0x7 & i_88_ >> 4);
					int i_92_ = Class272.anInt2038 - -i_91_;
					int i_93_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readLEShortA((byte) 95);
					boolean bool = ((i_91_ ^ 0xffffffff) <= -1
							&& (i_89_ ^ 0xffffffff) <= -1
							&& (i_91_ ^ 0xffffffff) > (Class165.anInt1276 ^ 0xffffffff) && Class98_Sub10_Sub7.anInt5572 > i_89_);
					if (bool
							|| ReferenceTable.method3623(i + -56,
									Class151_Sub9.anInt5028)) {
						Class48_Sub1.method458(new Class98_Sub26(i_87_, i_93_),
								Class206.anInt1568, i_90_, i_92_, true);
						if (bool)
							Class98_Sub32.method1437(i_91_, Class206.anInt1568,
									(byte) 59, i_89_);
					}
				} else if (class85 == Class79.aClass85_600) { // anim
					int i_94_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readByteS(-32);
					int i_95_ = Class53.anInt430
							- -(0x7 & i_94_ >> -1992025084);
					int i_96_ = Class335.anInt2819 - -(0x7 & i_94_);
					int i_97_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readLEShortA((byte) 105);
					if ((i_97_ ^ 0xffffffff) == -65536)
						i_97_ = -1;
					int i_98_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readByteA(true);
					int i_99_ = i_98_ >> -1003983550;
					int i_100_ = 0x3 & i_98_;
					int i_101_ = Class64_Sub17.anIntArray3685[i_99_];
					Class283.method3351(i_99_, i_100_, true, i_95_, i_96_,
							Class206.anInt1568, i_97_, i_101_);
				} else if (class85 == Class246_Sub4_Sub2.aClass85_6186) {
					int i_102_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) -107);
					int i_103_ = Class53.anInt430
							+ ((0x7d & i_102_) >> -1581133244);
					int i_104_ = (0x7 & i_102_) + Class335.anInt2819;
					int i_105_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					if (i_105_ == 65535)
						i_105_ = -1;
					int i_106_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) 56);
					int i_107_ = (i_106_ & 0xf6) >> -1409175612;
					int i_108_ = i_106_ & 0x7;
					int i_109_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) -123);
					int i_110_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) -107);
					int i_111_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					if (i_103_ >= 0
							&& (i_104_ ^ 0xffffffff) <= -1
							&& (Class165.anInt1276 ^ 0xffffffff) < (i_103_ ^ 0xffffffff)
							&& ((Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff) < (i_104_ ^ 0xffffffff))) {
						int i_112_ = i_107_ + 1;
						if (((((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6437[0]) ^ 0xffffffff) <= (i_103_
								+ -i_112_ ^ 0xffffffff)
								&& (((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6437[0]) <= i_112_
										+ i_103_
								&& (-i_112_ + i_104_ <= (((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6438[0]))
								&& (((((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6438[0]) ^ 0xffffffff) >= (i_112_
										+ i_104_ ^ 0xffffffff)))
							Class86.method844(
									i_111_,
									false,
									i_109_,
									i_108_,
									i_110_,
									((i_103_ << 1399144080)
											+ (Class206.anInt1568 << -26386888) + ((i_104_ << -1188209688) - -i_107_)),
									i_105_, i + -21);
					}
				} else if (class85 == Class98_Sub10_Sub16.aClass85_5621) {// remove
																			// ground
																			// item
					int i_113_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readByteS(-20);
					int i_114_ = (i_113_ & 0x7) + Class335.anInt2819;
					int i_115_ = aa_Sub2.anInt3562 + i_114_;
					int i_116_ = Class53.anInt430
							- -((i_113_ & 0x79) >> 1994183780);
					int i_117_ = i_116_ - -Class272.anInt2038;
					int i_118_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readShortA(90);
					Class98_Sub45 class98_sub45 = ((Class98_Sub45) (Class146.aClass377_1180
							.method3990(
									(long) (i_117_ | (i_115_ << -1573020242 | Class206.anInt1568 << -1438380164)),
									-1)));
					if (class98_sub45 != null) {
						for (Class98_Sub26 class98_sub26 = ((Class98_Sub26) ((Class98_Sub45) class98_sub45).aClass148_4254
								.method2418(32)); class98_sub26 != null; class98_sub26 = ((Class98_Sub26) ((Class98_Sub45) class98_sub45).aClass148_4254
								.method2417(117))) {
							if ((((Class98_Sub26) class98_sub26).anInt4031 ^ 0xffffffff) == (i_118_ & 0x7fff ^ 0xffffffff)) {
								class98_sub26.method942(107);
								break;
							}
						}
						if (((Class98_Sub45) class98_sub45).aClass148_4254
								.method2420(-127))
							class98_sub45.method942(64);
						if (i_116_ >= 0
								&& (i_114_ ^ 0xffffffff) <= -1
								&& i_116_ < Class165.anInt1276
								&& ((i_114_ ^ 0xffffffff) > (Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff)))
							Class98_Sub32.method1437(i_116_,
									Class206.anInt1568, (byte) 94, i_114_);
					}
				} else if (class85 == Class60.aClass85_471) { // animate object
					int i_119_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readByteC((byte) 102);
					int i_120_ = Class53.anInt430
							+ (i_119_ >> 2113611716 & 0x7);
					int i_121_ = Class335.anInt2819 + (0x7 & i_119_);
					int i_122_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readShort1((byte) 49);
					// System.out.println(i_122_);
					int i_123_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) 45);
					int i_124_ = i_123_ >> -705226718;
					int i_125_ = i_123_ & 0x3;
					int i_126_ = Class64_Sub17.anIntArray3685[i_124_];
					if (ReferenceTable
							.method3623(-100, Class151_Sub9.anInt5028)
							|| ((i_120_ ^ 0xffffffff) <= -1
									&& (i_121_ ^ 0xffffffff) <= -1
									&& ((Class165.anInt1276 ^ 0xffffffff) < (i_120_ ^ 0xffffffff)) && Class98_Sub10_Sub7.anInt5572 > i_121_))
						Class64_Sub9.method591(-60, i_120_, i_124_, i_121_,
								i_126_, i_122_, i_125_, Class206.anInt1568);
				} else if (Class133.aClass85_3454 == class85) {
					int i_127_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					int i_128_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) -107);
					Class130.aClass302_1028.method3546(i_127_, (byte) 119)
							.method3853((byte) 49, i_128_);
				} else if (Class351.aClass85_2921 == class85) {
					int i_129_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readLEShortA((byte) 109);
					int i_130_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readShortA(99);
					int i_131_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					int i_132_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readByteC((byte) 25);
					int i_133_ = Class335.anInt2819 + (0x7 & i_132_);
					int i_134_ = i_133_ + aa_Sub2.anInt3562;
					int i_135_ = (0x7 & i_132_ >> -999540380)
							+ Class53.anInt430;
					int i_136_ = Class272.anInt2038 + i_135_;
					if ((za_Sub2.anInt6080 ^ 0xffffffff) != (i_131_ ^ 0xffffffff)) {
						boolean bool = (i_135_ >= 0
								&& (i_133_ ^ 0xffffffff) <= -1
								&& i_135_ < Class165.anInt1276 && ((Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff) < (i_133_ ^ 0xffffffff)));
						if (bool
								|| ReferenceTable.method3623(-69,
										Class151_Sub9.anInt5028)) {
							Class48_Sub1.method458(new Class98_Sub26(i_129_,
									i_130_), Class206.anInt1568, i_134_,
									i_136_, true);
							if (bool)
								Class98_Sub32.method1437(i_135_,
										Class206.anInt1568, (byte) 39, i_133_);
						}
					}
				} else if (class85 == Class98_Sub11.aClass85_3868) {
					int i_137_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) -117);
					int i_138_ = (i_137_ >> -1502134172 & 0x7)
							+ Class53.anInt430;
					int i_139_ = Class335.anInt2819 - -(0x7 & i_137_);
					int i_140_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					int i_141_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) -114);
					int i_142_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					int i_143_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) 40);
					if (i_138_ >= 0
							&& i_139_ >= 0
							&& (Class165.anInt1276 ^ 0xffffffff) < (i_138_ ^ 0xffffffff)
							&& Class98_Sub10_Sub7.anInt5572 > i_139_) {
						int i_144_ = i_138_ * 512 - -256;
						int i_145_ = i_139_ * 512 + 256;
						int i_146_ = Class206.anInt1568;
						if (i_146_ < 3
								&& Class1
										.method162(i_139_, (byte) -104, i_138_))
							i_146_++;
						Class246_Sub3_Sub4_Sub3 class246_sub3_sub4_sub3 = (new Class246_Sub3_Sub4_Sub3(
								i_140_, i_142_, Class215.anInt1614,
								Class206.anInt1568, i_146_, i_144_,
								((Class98_Sub46_Sub2_Sub2.method1538(
										Class206.anInt1568, i_145_, i_144_,
										24111)) - i_141_), i_145_, i_138_,
								i_138_, i_139_, i_139_, i_143_));
						Class98_Sub10_Sub11.aClass148_5596
								.method2419(new Class98_Sub46_Sub3(
										class246_sub3_sub4_sub3), i ^ 0x5182);
					}
				} else {
					Class305_Sub1.method3585(null, -123, "T3 - " + class85);
					Class98_Sub10_Sub1.method1003(false, false);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nn.F(" + i + ','
					+ (class85 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method1071(int i, int i_147_) {
		try {
			if (i > 121) {
				anInt5656 = (0xff00 & i_147_) >> 376071844;
				anInt5655 = i_147_ << -339638620 & 0xff0;
				anInt5654 = (i_147_ & 0xff0000) >> -1095348980;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nn.E(" + i + ','
					+ i_147_ + ')');
		}
	}

	private Class98_Sub10_Sub22(int i) {
		super(0, false);
		try {
			method1071(122, i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nn.<init>(" + i
					+ ')');
		}
	}

	public Class98_Sub10_Sub22() {
		this(0);
	}

	public static void method1072(byte i) {
		try {
			int i_148_ = 73 % ((-56 - i) / 43);
			aClass171_5652 = null;
			anObject5653 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nn.B(" + i + ')');
		}
	}

	final void method991(int i, ByteBuffer class98_sub22, byte i_149_) {
		try {
			if (i_149_ > -92)
				anInt5656 = 88;
			int i_150_ = i;
			if ((i_150_ ^ 0xffffffff) == -1)
				method1071(122, class98_sub22.readMediumInt(-124));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("nn.A(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i_149_ + ')'));
		}
	}

	static {
		aClass171_5652 = new OutgoingOpcode(23, 2);
	}
}
