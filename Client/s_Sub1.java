/* s_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaggl.OpenGL;

final class s_Sub1 extends s {
	private Class98_Sub20[][][] aClass98_Sub20ArrayArrayArray5190;
	private int anInt5191;
	int[][][] anIntArrayArrayArray5192;
	private int[][][] anIntArrayArrayArray5193;
	int[][][] anIntArrayArrayArray5194;
	private int[][][] anIntArrayArrayArray5195;
	short[][] aShortArrayArray5196;
	static Class279 aClass279_5197 = new Class279("codeusav"
			+ GameClient.version, 0);
	int anInt5198;
	private final Class148 aClass148_5199 = new Class148();
	static boolean aBoolean5200;
	private byte[][] aByteArrayArray5201;
	static Class346 aClass346_5202;
	private int anInt5203;
	private int anInt5204;
	static IncomingOpcode aClass58_5205;
	ha_Sub1 aHa_Sub1_5206;
	static boolean aBoolean5207 = true;
	private int[][][] anIntArrayArrayArray5208;
	private Class33 aClass33_5209;
	int[][][] anIntArrayArrayArray5210;
	private int anInt5211;
	private byte[][] aByteArrayArray5212;
	private int anInt5213;
	private float[][] aFloatArrayArray5214;
	Class104 aClass104_5215;
	private Class104 aClass104_5216;
	private int anInt5217;
	private float[][] aFloatArrayArray5218;
	private Class377 aClass377_5219;
	private Interface16 anInterface16_5220;
	private Class98_Sub20[] aClass98_Sub20Array5221;
	Class104 aClass104_5222;
	private float[][] aFloatArrayArray5223;
	Class104 aClass104_5224;

	@Override
	final void ka(final int i, final int i_0_, final int i_1_) {
		do {
			try {
				if ((aByteArrayArray5212[i][i_0_] & 0xff) >= i_1_) {
					break;
				}
				aByteArrayArray5212[i][i_0_] = (byte) i_1_;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ok.ka(" + i
						+ ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void wa(final r var_r, final int i, final int i_2_, final int i_3_,
			final int i_4_, final boolean bool) {
		try {
			if (aClass33_5209 != null && var_r != null) {
				final int i_5_ = (i
						- ((aHa_Sub1_5206.anInt4398) * i_2_ >> 404453736) >> aHa_Sub1_5206.anInt4319);
				final int i_6_ = (i_3_
						+ -(i_2_ * (aHa_Sub1_5206).anInt4377 >> -391620984) >> aHa_Sub1_5206.anInt4319);
				aClass33_5209.method322(i_6_, i_5_, false, var_r);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.wa("
					+ (var_r != null ? "{...}" : "null") + ',' + i + ',' + i_2_
					+ ',' + i_3_ + ',' + i_4_ + ',' + bool + ')'));
		}
	}

	@Override
	final void method3424(final int i, final int i_7_, final int[] is,
			final int[] is_8_, final int[] is_9_, final int[] is_10_,
			final int[] is_11_, final int[] is_12_, final int[] is_13_,
			final int[] is_14_, final int[] is_15_, final int[] is_16_,
			final int[] is_17_, final int i_18_, final int i_19_,
			final int i_20_, final boolean bool) {
		try {
			final int i_21_ = is_14_.length;
			final int[] is_22_ = new int[3 * i_21_];
			final int[] is_23_ = new int[i_21_ * 3];
			final int[] is_24_ = new int[3 * i_21_];
			final int[] is_25_ = new int[i_21_ * 3];
			final int[] is_26_ = new int[3 * i_21_];
			final int[] is_27_ = new int[3 * i_21_];
			final int[] is_28_ = is_8_ == null ? null : new int[3 * i_21_];
			final int[] is_29_ = is_10_ == null ? null : new int[i_21_ * 3];
			int i_30_ = 0;
			for (int i_31_ = 0; i_31_ < i_21_; i_31_++) {
				final int i_32_ = is_11_[i_31_];
				final int i_33_ = is_12_[i_31_];
				final int i_34_ = is_13_[i_31_];
				is_22_[i_30_] = is[i_32_];
				is_23_[i_30_] = is_9_[i_32_];
				is_24_[i_30_] = is_14_[i_31_];
				is_26_[i_30_] = is_16_[i_31_];
				is_27_[i_30_] = is_17_[i_31_];
				is_25_[i_30_] = is_15_ == null ? is_14_[i_31_] : is_15_[i_31_];
				if (is_8_ != null) {
					is_28_[i_30_] = is_8_[i_32_];
				}
				if (is_10_ != null) {
					is_29_[i_30_] = is_10_[i_32_];
				}
				i_30_++;
				is_22_[i_30_] = is[i_33_];
				is_23_[i_30_] = is_9_[i_33_];
				is_24_[i_30_] = is_14_[i_31_];
				is_26_[i_30_] = is_16_[i_31_];
				is_27_[i_30_] = is_17_[i_31_];
				is_25_[i_30_] = is_15_ != null ? is_15_[i_31_] : is_14_[i_31_];
				if (is_8_ != null) {
					is_28_[i_30_] = is_8_[i_33_];
				}
				if (is_10_ != null) {
					is_29_[i_30_] = is_10_[i_33_];
				}
				i_30_++;
				is_22_[i_30_] = is[i_34_];
				is_23_[i_30_] = is_9_[i_34_];
				is_24_[i_30_] = is_14_[i_31_];
				is_26_[i_30_] = is_16_[i_31_];
				is_27_[i_30_] = is_17_[i_31_];
				is_25_[i_30_] = is_15_ != null ? is_15_[i_31_] : is_14_[i_31_];
				if (is_8_ != null) {
					is_28_[i_30_] = is_8_[i_34_];
				}
				if (is_10_ != null) {
					is_29_[i_30_] = is_10_[i_34_];
				}
				i_30_++;
			}
			U(i, i_7_, is_22_, is_28_, is_23_, is_29_, is_24_, is_25_, is_26_,
					is_27_, i_18_, i_19_, i_20_, bool);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.H(" + i + ','
					+ i_7_ + ',' + (is != null ? "{...}" : "null") + ','
					+ (is_8_ != null ? "{...}" : "null") + ','
					+ (is_9_ != null ? "{...}" : "null") + ','
					+ (is_10_ != null ? "{...}" : "null") + ','
					+ (is_11_ != null ? "{...}" : "null") + ','
					+ (is_12_ != null ? "{...}" : "null") + ','
					+ (is_13_ != null ? "{...}" : "null") + ','
					+ (is_14_ != null ? "{...}" : "null") + ','
					+ (is_15_ != null ? "{...}" : "null") + ','
					+ (is_16_ != null ? "{...}" : "null") + ','
					+ (is_17_ != null ? "{...}" : "null") + ',' + i_18_ + ','
					+ i_19_ + ',' + i_20_ + ',' + bool + ')'));
		}
	}

	static final boolean method3427(final int i, final int i_35_,
			final int i_36_, final int i_37_, final byte i_38_,
			final int i_39_, final int i_40_) {
		try {
			final int i_41_ = i_35_ + i_40_;
			final int i_42_ = i - -i_36_;
			final int i_43_ = i_37_ + i_39_;
			if (!Class254.method3187(i_42_, i_40_, i_39_, (byte) 82, i_42_,
					i_43_, i_42_, i_43_, i_41_, i_40_)) {
				return false;
			}
			if (!Class254.method3187(i_42_, i_41_, i_39_, (byte) 82, i_42_,
					i_43_, i_42_, i_39_, i_41_, i_40_)) {
				return false;
			}
			if (i_40_ < Class127.anInt1018) {
				if (!Class254.method3187(i_42_, i_40_, i_43_, (byte) 82, i,
						i_43_, i_42_, i_39_, i_40_, i_40_)) {
					return false;
				}
				if (!Class254.method3187(i, i_40_, i_43_, (byte) 82, i, i_39_,
						i_42_, i_39_, i_40_, i_40_)) {
					return false;
				}
			} else {
				if (!Class254.method3187(i_42_, i_41_, i_43_, (byte) 82, i,
						i_43_, i_42_, i_39_, i_41_, i_41_)) {
					return false;
				}
				if (!Class254.method3187(i, i_41_, i_43_, (byte) 82, i, i_39_,
						i_42_, i_39_, i_41_, i_41_)) {
					return false;
				}
			}
			if (i_38_ != 16) {
				return true;
			}
			if (Class98_Sub48.anInt4280 <= i_39_) {
				if (!Class254.method3187(i_42_, i_40_, i_43_, (byte) 82, i,
						i_43_, i_42_, i_43_, i_41_, i_40_)) {
					return false;
				}
				if (!Class254.method3187(i, i_41_, i_43_, (byte) 82, i, i_43_,
						i_42_, i_43_, i_41_, i_40_)) {
					return false;
				}
			} else {
				if (!Class254.method3187(i_42_, i_40_, i_39_, (byte) 82, i,
						i_39_, i_42_, i_39_, i_41_, i_40_)) {
					return false;
				}
				if (!Class254.method3187(i, i_41_, i_39_, (byte) 82, i, i_39_,
						i_42_, i_39_, i_41_, i_40_)) {
					return false;
				}
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.J(" + i + ','
					+ i_35_ + ',' + i_36_ + ',' + i_37_ + ',' + i_38_ + ','
					+ i_39_ + ',' + i_40_ + ')'));
		}
	}

	private final void method3428(final int i, final int i_44_,
			final boolean bool, final int i_45_, final int i_46_,
			final boolean[][] bools, final int i_47_, final int i_48_) {
		do {
			try {
				if (aClass98_Sub20Array5221 != null) {
					int i_49_ = 1 + i_45_ + i_45_;
					i_49_ *= i_49_;
					if ((i_49_ ^ 0xffffffff) < ((aHa_Sub1_5206.anIntArray4468).length ^ 0xffffffff)) {
						aHa_Sub1_5206.anIntArray4468 = new int[i_49_];
					}
					if (anInt5211 * 2 > ((ByteBuffer) (aHa_Sub1_5206.aClass98_Sub22_Sub2_4446)).incomingBytes.length) {
						aHa_Sub1_5206.aClass98_Sub22_Sub2_4446 = new Class98_Sub22_Sub2(
								2 * anInt5211);
					}
					int i_50_ = -i_45_ + i_46_;
					final int i_51_ = i_50_;
					if (i_50_ < 0) {
						i_50_ = 0;
					}
					int i_52_ = i_48_ - i_45_;
					final int i_53_ = i_52_;
					if (i_52_ < 0) {
						i_52_ = 0;
					}
					int i_54_ = i_46_ + i_45_;
					if (i_54_ > -1 + ((s) this).anInt2203) {
						i_54_ = -1 + ((s) this).anInt2203;
					}
					int i_55_ = i_45_ + i_48_;
					if (((s) this).anInt2204 - 1 < i_55_) {
						i_55_ = ((s) this).anInt2204 + -1;
					}
					int i_56_ = 0;
					final int[] is = (aHa_Sub1_5206.anIntArray4468);
					for (int i_57_ = i_50_; (i_54_ ^ 0xffffffff) <= (i_57_ ^ 0xffffffff); i_57_++) {
						final boolean[] bools_58_ = bools[i_57_ - i_51_];
						for (int i_59_ = i_52_; (i_55_ ^ 0xffffffff) <= (i_59_ ^ 0xffffffff); i_59_++) {
							if (bools_58_[-i_53_ + i_59_]) {
								is[i_56_++] = i_59_ * ((s) this).anInt2203
										- -i_57_;
							}
						}
					}
					if (i_44_ == -1) {
						aHa_Sub1_5206.method1861(19330);
					} else {
						aHa_Sub1_5206.method1890(i_44_, true);
						aHa_Sub1_5206.method1901((byte) -35);
					}
					aHa_Sub1_5206.method1851(
							(anInt5198 & 0x7 ^ 0xffffffff) != -1, false);
					for (int i_60_ = 0; ((i_60_ ^ 0xffffffff) > (aClass98_Sub20Array5221.length ^ 0xffffffff)); i_60_++) {
						aClass98_Sub20Array5221[i_60_].method1169(is,
								(byte) 98, i_56_);
					}
					if (!aClass148_5199.method2420(-126)) {
						final int i_61_ = (aHa_Sub1_5206.anInt4455);
						final int i_62_ = (aHa_Sub1_5206.anInt4441);
						aHa_Sub1_5206.L(0, i_62_, ((aHa_Sub1_5206).anInt4427));
						aHa_Sub1_5206.method1851(false, false);
						aHa_Sub1_5206.method1875((byte) -123, false);
						aHa_Sub1_5206.method1870((byte) -58, 128);
						aHa_Sub1_5206.method1834(-99, -2);
						aHa_Sub1_5206.method1863(1,
								(aHa_Sub1_5206.aClass42_Sub1_4358));
						aHa_Sub1_5206.method1899(7681, i_47_ ^ 0xfe2, 8448);
						aHa_Sub1_5206.method1840(0, 770, 116, 34166);
						aHa_Sub1_5206.method1886(770, 0, 34200, 34167);
						for (Node node = aClass148_5199.method2418(32); node != null; node = aClass148_5199
								.method2417(91)) {
							final Class98_Sub37 class98_sub37 = (Class98_Sub37) node;
							class98_sub37.method1461(i_48_, i_45_, i_46_,
									bools, (byte) 38);
						}
						aHa_Sub1_5206.method1840(0, 768, i_47_ ^ 0x2c88, 5890);
						aHa_Sub1_5206.method1886(770, 0, 34200, 5890);
						aHa_Sub1_5206.method1863(1, null);
						aHa_Sub1_5206.L(i_61_, i_62_,
								((aHa_Sub1_5206).anInt4427));
					}
					if (aClass33_5209 != null) {
						OpenGL.glPushMatrix();
						OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
						aHa_Sub1_5206.method1868(null, null, aClass104_5224,
								aClass104_5222, i_47_ + -11490);
						aClass33_5209.method320(bool, i_45_, i_46_, bools,
								(byte) 93, i_48_);
						OpenGL.glPopMatrix();
					}
				}
				if (i_47_ == 11490) {
					break;
				}
				aBoolean5200 = false;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ok.A(" + i
						+ ',' + i_44_ + ',' + bool + ',' + i_45_ + ',' + i_46_
						+ ',' + (bools != null ? "{...}" : "null") + ','
						+ i_47_ + ',' + i_48_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method3422(final int i, final int i_63_, final int i_64_,
			final int i_65_, final int i_66_, final int i_67_, final int i_68_,
			final boolean[][] bools) {
		do {
			try {
				if ((anInt5217 ^ 0xffffffff) < -1) {
					aHa_Sub1_5206.method1867(29458);
					aHa_Sub1_5206.method1856(false, 6914);
					aHa_Sub1_5206.method1851(false, false);
					aHa_Sub1_5206.method1881(false, false);
					aHa_Sub1_5206.method1875((byte) 27, false);
					aHa_Sub1_5206.method1870((byte) -35, 0);
					aHa_Sub1_5206.method1834(-62, -2);
					aHa_Sub1_5206.method1863(1, null);
					Class86.aFloatArray640[4] = 0.0F;
					Class86.aFloatArray640[13] = 1.0F - ((i_63_ * 2 + i_64_
							* i_68_ / 128.0F) / (aHa_Sub1_5206.anInt4304));
					Class86.aFloatArray640[9] = 0.0F;
					Class86.aFloatArray640[3] = 0.0F;
					Class86.aFloatArray640[7] = 0.0F;
					Class86.aFloatArray640[11] = 0.0F;
					Class86.aFloatArray640[12] = -1.0F
							- ((-(2 * i) + i_65_ * i_64_ / 128.0F) / (aHa_Sub1_5206.anInt4305));
					Class86.aFloatArray640[15] = 1.0F;
					Class86.aFloatArray640[14] = 0.0F;
					Class86.aFloatArray640[10] = 0.0F;
					Class86.aFloatArray640[0] = (i_64_ / (aHa_Sub1_5206.anInt4305 * (128.0F * ((s) this).anInt2206)));
					Class86.aFloatArray640[6] = 0.0F;
					Class86.aFloatArray640[8] = 0.0F;
					Class86.aFloatArray640[1] = 0.0F;
					Class86.aFloatArray640[2] = 0.0F;
					Class86.aFloatArray640[5] = (i_64_ / (((s) this).anInt2206 * 128.0F * (aHa_Sub1_5206.anInt4304)));
					OpenGL.glMatrixMode(5889);
					OpenGL.glLoadMatrixf(Class86.aFloatArray640, 0);
					Class86.aFloatArray640[10] = 0.0F;
					Class86.aFloatArray640[7] = 0.0F;
					Class86.aFloatArray640[12] = 0.0F;
					Class86.aFloatArray640[15] = 1.0F;
					Class86.aFloatArray640[4] = 0.0F;
					Class86.aFloatArray640[5] = 0.0F;
					Class86.aFloatArray640[14] = 0.0F;
					Class86.aFloatArray640[11] = 0.0F;
					Class86.aFloatArray640[2] = 0.0F;
					Class86.aFloatArray640[8] = 0.0F;
					Class86.aFloatArray640[3] = 0.0F;
					Class86.aFloatArray640[0] = 1.0F;
					Class86.aFloatArray640[6] = 1.0F;
					Class86.aFloatArray640[1] = 0.0F;
					Class86.aFloatArray640[9] = 1.0F;
					Class86.aFloatArray640[13] = 0.0F;
					OpenGL.glMatrixMode(5888);
					OpenGL.glLoadMatrixf(Class86.aFloatArray640, 0);
					if ((anInt5198 & 0x7 ^ 0xffffffff) != -1) {
						aHa_Sub1_5206.method1851(true, false);
						aHa_Sub1_5206.method1831(126);
					} else {
						aHa_Sub1_5206.method1851(false, false);
					}
					aHa_Sub1_5206.method1868(aClass104_5216, aClass104_5215,
							aClass104_5224, aClass104_5222, 0);
					if (((ByteBuffer) (aHa_Sub1_5206.aClass98_Sub22_Sub2_4446)).incomingBytes.length < anInt5211 * 2) {
						aHa_Sub1_5206.aClass98_Sub22_Sub2_4446 = new Class98_Sub22_Sub2(
								anInt5211 * 2);
					} else {
						((ByteBuffer) (aHa_Sub1_5206.aClass98_Sub22_Sub2_4446)).position = 0;
					}
					int i_69_ = 0;
					final Class98_Sub22_Sub2 class98_sub22_sub2 = (aHa_Sub1_5206.aClass98_Sub22_Sub2_4446);
					if (aHa_Sub1_5206.aBoolean4397) {
						for (int i_70_ = i_66_; i_70_ < i_68_; i_70_++) {
							int i_71_ = ((s) this).anInt2203 * i_70_ - -i_65_;
							for (int i_72_ = i_65_; (i_72_ ^ 0xffffffff) > (i_67_ ^ 0xffffffff); i_72_++) {
								if (bools[-i_65_ + i_72_][-i_66_ + i_70_]) {
									final short[] is = (aShortArrayArray5196[i_71_]);
									if (is != null) {
										for (int i_73_ = 0; ((is.length ^ 0xffffffff) < (i_73_ ^ 0xffffffff)); i_73_++) {
											i_69_++;
											class98_sub22_sub2.writeShort(
													is[i_73_] & 0xffff,
													1571862888);
										}
									}
								}
								i_71_++;
							}
						}
					} else {
						for (int i_74_ = i_66_; i_68_ > i_74_; i_74_++) {
							int i_75_ = i_65_ + i_74_ * ((s) this).anInt2203;
							for (int i_76_ = i_65_; i_67_ > i_76_; i_76_++) {
								if (bools[i_76_ + -i_65_][-i_66_ + i_74_]) {
									final short[] is = (aShortArrayArray5196[i_75_]);
									if (is != null) {
										for (int i_77_ = 0; is.length > i_77_; i_77_++) {
											class98_sub22_sub2.method1247(
													is[i_77_] & 0xffff, 4);
											i_69_++;
										}
									}
								}
								i_75_++;
							}
						}
					}
					if (i_69_ <= 0) {
						break;
					}
					final Class156_Sub1 class156_sub1 = (new Class156_Sub1(
							aHa_Sub1_5206,
							5123,
							(((ByteBuffer) class98_sub22_sub2).incomingBytes),
							((ByteBuffer) class98_sub22_sub2).position));
					aHa_Sub1_5206.method1865(i_69_, 4, class156_sub1, false, 0);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ok.F(" + i
						+ ',' + i_63_ + ',' + i_64_ + ',' + i_65_ + ',' + i_66_
						+ ',' + i_67_ + ',' + i_68_ + ','
						+ (bools != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	s_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_78_,
			final int i_79_, final int i_80_, final int[][] is,
			final int[][] is_81_, final int i_82_) {
		super(i_79_, i_80_, i_82_, is);
		do {
			try {
				anInt5191 = -2 + ((s) this).anInt2200;
				aHa_Sub1_5206 = var_ha_Sub1;
				anIntArrayArrayArray5194 = new int[i_79_][i_80_][];
				anIntArrayArrayArray5210 = new int[i_79_][i_80_][];
				anIntArrayArrayArray5192 = new int[i_79_][i_80_][];
				aShortArrayArray5196 = new short[i_80_ * i_79_][];
				aByteArrayArray5212 = new byte[1 + i_79_][1 + i_80_];
				anIntArrayArrayArray5193 = new int[i_79_][i_80_][];
				anInt5204 = 1 << anInt5191;
				anIntArrayArrayArray5195 = new int[i_79_][i_80_][];
				aFloatArrayArray5218 = (new float[((s) this).anInt2203 - -1][((s) this).anInt2204
						- -1]);
				anInt5198 = i_78_;
				aFloatArrayArray5214 = (new float[((s) this).anInt2203 + 1][((s) this).anInt2204
						- -1]);
				aClass98_Sub20ArrayArrayArray5190 = new Class98_Sub20[i_79_][i_80_][];
				aByteArrayArray5201 = new byte[i_79_][i_80_];
				aFloatArrayArray5223 = (new float[((s) this).anInt2203 - -1][1 + ((s) this).anInt2204]);
				for (int i_83_ = 1; ((s) this).anInt2204 > i_83_; i_83_++) {
					for (int i_84_ = 1; ((i_84_ ^ 0xffffffff) > (((s) this).anInt2203 ^ 0xffffffff)); i_84_++) {
						final int i_85_ = (-is_81_[-1 + i_84_][i_83_] + is_81_[1 + i_84_][i_83_]);
						final int i_86_ = (is_81_[i_84_][1 + i_83_] + -is_81_[i_84_][-1
								+ i_83_]);
						final float f = (float) (1.0 / (Math.sqrt(i_86_ * i_86_
								+ (4 * i_82_ * i_82_ + i_85_ * i_85_))));
						aFloatArrayArray5218[i_84_][i_83_] = f * i_85_;
						aFloatArrayArray5214[i_84_][i_83_] = 2 * -i_82_ * f;
						aFloatArrayArray5223[i_84_][i_83_] = i_86_ * f;
					}
				}
				aClass377_5219 = new Class377(128);
				if ((anInt5198 & 0x10) == 0) {
					break;
				}
				aClass33_5209 = new Class33(aHa_Sub1_5206, this);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("ok.<init>("
								+ (var_ha_Sub1 != null ? "{...}" : "null")
								+ ',' + i + ',' + i_78_ + ',' + i_79_ + ','
								+ i_80_ + ',' + (is != null ? "{...}" : "null")
								+ ',' + (is_81_ != null ? "{...}" : "null")
								+ ',' + i_82_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final boolean method3418(final r var_r, final int i, final int i_87_,
			final int i_88_, final int i_89_, final boolean bool) {
		try {
			if (aClass33_5209 == null || var_r == null) {
				return false;
			}
			final int i_90_ = (i
					- ((i_87_ * aHa_Sub1_5206.anInt4398) >> 2105336840) >> aHa_Sub1_5206.anInt4319);
			final int i_91_ = (i_88_
					+ -(i_87_ * (aHa_Sub1_5206.anInt4377) >> 1767505640) >> aHa_Sub1_5206.anInt4319);
			return aClass33_5209.method325(var_r, -115, i_90_, i_91_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.O("
					+ (var_r != null ? "{...}" : "null") + ',' + i + ','
					+ i_87_ + ',' + i_88_ + ',' + i_89_ + ',' + bool + ')'));
		}
	}

	@Override
	final void CA(final r var_r, final int i, final int i_92_, final int i_93_,
			final int i_94_, final boolean bool) {
		try {
			if (aClass33_5209 != null && var_r != null) {
				final int i_95_ = (-((aHa_Sub1_5206.anInt4398 * i_92_) >> -1029072408)
						+ i >> aHa_Sub1_5206.anInt4319);
				final int i_96_ = (i_93_
						- (i_92_ * (aHa_Sub1_5206).anInt4377 >> -1852845016) >> aHa_Sub1_5206.anInt4319);
				aClass33_5209.method324((byte) 94, i_96_, i_95_, var_r);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.CA("
					+ (var_r != null ? "{...}" : "null") + ',' + i + ','
					+ i_92_ + ',' + i_93_ + ',' + i_94_ + ',' + bool + ')'));
		}
	}

	private final void method3429(final int i, final int i_97_,
			final int i_98_, final r_Sub1 var_r_Sub1) {
		try {
			final int[] is = anIntArrayArrayArray5192[i][i_97_];
			final int[] is_99_ = anIntArrayArrayArray5194[i][i_97_];
			final int i_100_ = is.length;
			if ((i_100_ ^ 0xffffffff) < ((aHa_Sub1_5206.anIntArray4471).length ^ 0xffffffff)) {
				aHa_Sub1_5206.anIntArray4471 = new int[i_100_];
				aHa_Sub1_5206.anIntArray4470 = new int[i_100_];
			}
			final int[] is_101_ = aHa_Sub1_5206.anIntArray4471;
			final int[] is_102_ = aHa_Sub1_5206.anIntArray4470;
			for (int i_103_ = 0; i_100_ > i_103_; i_103_++) {
				is_101_[i_103_] = (is[i_103_] >> aHa_Sub1_5206.anInt4319);
				is_102_[i_103_] = (is_99_[i_103_] >> aHa_Sub1_5206.anInt4319);
			}
			int i_104_ = i_98_;
			while (i_100_ > i_104_) {
				final int i_105_ = is_101_[i_104_];
				final int i_106_ = is_102_[i_104_++];
				final int i_107_ = is_101_[i_104_];
				final int i_108_ = is_102_[i_104_++];
				final int i_109_ = is_101_[i_104_];
				final int i_110_ = is_102_[i_104_++];
				if (((-i_107_ + i_105_) * (-i_110_ + i_108_) - (i_109_ - i_107_)
						* (-i_106_ + i_108_)) > 0) {
					var_r_Sub1.method1648(i_106_, i_107_, i_105_, i_110_,
							i_108_, i_98_ + -119, i_109_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.B(" + i + ','
					+ i_97_ + ',' + i_98_ + ','
					+ (var_r_Sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3430(String string, final int i) {
		try {
			if (string != null) {
				if (string.startsWith("*")) {
					string = string.substring(1);
				}
				final String string_111_ = Class353.method3867(-1, string);
				if (string_111_ != null) {
					if (i != -23995) {
						method3430(null, 68);
					}
					for (int i_112_ = 0; i_112_ < Class248.anInt1897; i_112_++) {
						String string_113_ = Class246_Sub4_Sub1.aStringArray6171[i_112_];
						if (string_113_.startsWith("*")) {
							string_113_ = string_113_.substring(1);
						}
						string_113_ = Class353.method3867(-1, string_113_);
						if (string_113_ != null
								&& string_113_.equals(string_111_)) {
							Class248.anInt1897--;
							for (int i_114_ = i_112_; ((Class248.anInt1897 ^ 0xffffffff) < (i_114_ ^ 0xffffffff)); i_114_++) {
								Class246_Sub4_Sub1.aStringArray6171[i_114_] = (Class246_Sub4_Sub1.aStringArray6171[1 + i_114_]);
								Class255.aStringArray3209[i_114_] = Class255.aStringArray3209[1 + i_114_];
								Class98_Sub45.aStringArray4255[i_114_] = (Class98_Sub45.aStringArray4255[i_114_ + 1]);
								Class110.aStringArray945[i_114_] = Class110.aStringArray945[1 + i_114_];
								Class98_Sub10_Sub38.aBooleanArray5759[i_114_] = (Class98_Sub10_Sub38.aBooleanArray5759[i_114_ + 1]);
							}
							Class363.anInt3099 = Class24.anInt242;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(i + 24255,
											Class179.aClass171_1424,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
									r_Sub2.method1650(string, (byte) 106),
									i + 24104);
							class98_sub11.aClass98_Sub22_Sub1_3865.method1188(
									string, (byte) 113);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							break;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.L("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final void method3421(final Class98_Sub5 class98_sub5, final int[] is) {
		try {
			aClass148_5199.method2419(new Class98_Sub37((aHa_Sub1_5206), this,
					class98_sub5, is), -20911);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.K("
					+ (class98_sub5 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3431(final int i) {
		do {
			try {
				aClass279_5197 = null;
				aClass58_5205 = null;
				aClass346_5202 = null;
				if (i < -116) {
					break;
				}
				aBoolean5207 = true;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ok.M(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final r fa(final int i, final int i_115_, final r var_r) {
		try {
			if ((0x1 & aByteArrayArray5201[i][i_115_] ^ 0xffffffff) == -1) {
				return null;
			}
			final int i_116_ = (((s) this).anInt2206 >> aHa_Sub1_5206.anInt4319);
			final r_Sub1 var_r_Sub1 = (r_Sub1) var_r;
			r_Sub1 var_r_Sub1_117_;
			do {
				if (var_r_Sub1 != null
						&& var_r_Sub1.method1647(i_116_, (byte) -122, i_116_)) {
					var_r_Sub1_117_ = var_r_Sub1;
					var_r_Sub1_117_.method1646(93);
					if (!client.aBoolean3553) {
						break;
					}
				}
				var_r_Sub1_117_ = new r_Sub1(aHa_Sub1_5206, i_116_, i_116_);
			} while (false);
			var_r_Sub1_117_.method1643(0, i_116_, i_116_, 0, -1);
			method3429(i, i_115_, 0, var_r_Sub1_117_);
			return var_r_Sub1_117_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.fa(" + i + ','
					+ i_115_ + ',' + (var_r != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method3416(final int i, final int i_118_, final int i_119_,
			final boolean[][] bools, final boolean bool, final int i_120_,
			final int i_121_) {
		try {
			method3428(i_121_, i_120_, bool, i_119_, i, bools, 11490, i_118_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.N(" + i + ','
					+ i_118_ + ',' + i_119_ + ','
					+ (bools != null ? "{...}" : "null") + ',' + bool + ','
					+ i_120_ + ',' + i_121_ + ')'));
		}
	}

	@Override
	final void YA() {
		try {
			if ((anInt5217 ^ 0xffffffff) >= -1) {
				aClass33_5209 = null;
			} else {
				final byte[][] is = (new byte[1 + ((s) this).anInt2203][((s) this).anInt2204
						- -1]);
				for (int i = 1; (i ^ 0xffffffff) > (((s) this).anInt2203 ^ 0xffffffff); i++) {
					for (int i_122_ = 1; ((i_122_ ^ 0xffffffff) > (((s) this).anInt2204 ^ 0xffffffff)); i_122_++) {
						is[i][i_122_] = (byte) ((aByteArrayArray5212[i][i_122_] >> -170204799)
								+ (aByteArrayArray5212[i][1 + i_122_] >> 928359555) + ((aByteArrayArray5212[i][i_122_ - 1] >> 2018246786)
								+ (aByteArrayArray5212[1 + i][i_122_] >> -1261459069) + (aByteArrayArray5212[i
								+ -1][i_122_] >> 471859554)));
					}
				}
				aClass98_Sub20Array5221 = new Class98_Sub20[aClass377_5219
						.method3999((byte) -6)];
				aClass377_5219.method3992(aClass98_Sub20Array5221, (byte) 74);
				for (int i = 0; ((aClass98_Sub20Array5221.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
					aClass98_Sub20Array5221[i]
							.method1175(anInt5217, (byte) -64);
				}
				int i = 24;
				if (anIntArrayArrayArray5208 != null) {
					i += 4;
				}
				if ((anInt5198 & 0x7) != 0) {
					i += 12;
				}
				final jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = aHa_Sub1_5206.aNativeHeap4323
						.a(i * anInt5217, false);
				final Stream stream = new Stream(nativeheapbuffer);
				final Class98_Sub20[] class98_sub20s = new Class98_Sub20[anInt5217];
				int i_123_ = Class23.method282(47, anInt5217 / 4);
				if (i_123_ < 1) {
					i_123_ = 1;
				}
				final Class377 class377 = new Class377(i_123_);
				final Class98_Sub20[] class98_sub20s_124_ = new Class98_Sub20[anInt5213];
				for (int i_125_ = 0; ((s) this).anInt2203 > i_125_; i_125_++) {
					for (int i_126_ = 0; i_126_ < ((s) this).anInt2204; i_126_++) {
						if ((anIntArrayArrayArray5210[i_125_][i_126_]) != null) {
							final Class98_Sub20[] class98_sub20s_127_ = (aClass98_Sub20ArrayArrayArray5190[i_125_][i_126_]);
							final int[] is_128_ = (anIntArrayArrayArray5192[i_125_][i_126_]);
							final int[] is_129_ = (anIntArrayArrayArray5194[i_125_][i_126_]);
							int[] is_130_ = anIntArrayArrayArray5195[i_125_][i_126_];
							final int[] is_131_ = (anIntArrayArrayArray5210[i_125_][i_126_]);
							final int[] is_132_ = (anIntArrayArrayArray5193 == null ? null
									: anIntArrayArrayArray5193[i_125_][i_126_]);
							final int[] is_133_ = (anIntArrayArrayArray5208 == null ? null
									: anIntArrayArrayArray5208[i_125_][i_126_]);
							if (is_130_ == null) {
								is_130_ = is_131_;
							}
							final float f = aFloatArrayArray5218[i_125_][i_126_];
							final float f_134_ = aFloatArrayArray5214[i_125_][i_126_];
							final float f_135_ = aFloatArrayArray5223[i_125_][i_126_];
							final float f_136_ = aFloatArrayArray5218[i_125_][1 + i_126_];
							final float f_137_ = aFloatArrayArray5214[i_125_][i_126_
									- -1];
							final float f_138_ = aFloatArrayArray5223[i_125_][1 + i_126_];
							final float f_139_ = (aFloatArrayArray5218[1 + i_125_][i_126_
									- -1]);
							final float f_140_ = aFloatArrayArray5214[i_125_ + 1][1 + i_126_];
							final float f_141_ = (aFloatArrayArray5223[i_125_
									- -1][i_126_ - -1]);
							final float f_142_ = aFloatArrayArray5218[1 + i_125_][i_126_];
							final float f_143_ = aFloatArrayArray5214[1 + i_125_][i_126_];
							final float f_144_ = aFloatArrayArray5223[i_125_
									- -1][i_126_];
							final int i_145_ = 0xff & is[i_125_][i_126_];
							final int i_146_ = 0xff & is[i_125_][i_126_ - -1];
							final int i_147_ = is[1 + i_125_][i_126_ + 1] & 0xff;
							final int i_148_ = is[i_125_ - -1][i_126_] & 0xff;
							int i_149_ = 0;
							while_137_: for (int i_150_ = 0; ((i_150_ ^ 0xffffffff) > (is_131_.length ^ 0xffffffff)); i_150_++) {
								final Class98_Sub20 class98_sub20 = class98_sub20s_127_[i_150_];
								for (int i_151_ = 0; i_149_ > i_151_; i_151_++) {
									if (class98_sub20 == class98_sub20s_124_[i_151_]) {
										continue while_137_;
									}
								}
								class98_sub20s_124_[i_149_++] = class98_sub20;
							}
							final short[] is_152_ = (aShortArrayArray5196[(((s) this).anInt2203
									* i_126_ - -i_125_)] = new short[is_131_.length]);
							for (int i_153_ = 0; ((is_131_.length ^ 0xffffffff) < (i_153_ ^ 0xffffffff)); i_153_++) {
								final int i_154_ = ((i_125_ << ((s) this).anInt2200) + is_128_[i_153_]);
								final int i_155_ = ((i_126_ << ((s) this).anInt2200) - -is_129_[i_153_]);
								final int i_156_ = i_154_ >> anInt5191;
								final int i_157_ = i_155_ >> anInt5191;
								final int i_158_ = is_131_[i_153_];
								final int i_159_ = is_130_[i_153_];
								final int i_160_ = is_132_ != null ? is_132_[i_153_]
										: 0;
								final long l = (i_157_ | ((long) i_159_ << -838159056
										| (long) i_158_ << -1104277280 | i_156_ << -2101067952));
								final int i_161_ = is_128_[i_153_];
								final int i_162_ = is_129_[i_153_];
								int i_163_ = 74;
								int i_164_ = 0;
								float f_165_ = 1.0F;
								float f_166_;
								float f_167_;
								float f_168_;
								if ((i_161_ ^ 0xffffffff) != -1
										|| (i_162_ ^ 0xffffffff) != -1) {
									if ((i_161_ ^ 0xffffffff) != -1
											|| ((i_162_ ^ 0xffffffff) != (((s) this).anInt2206 ^ 0xffffffff))) {
										if (((((s) this).anInt2206 ^ 0xffffffff) != (i_161_ ^ 0xffffffff))
												|| ((i_162_ ^ 0xffffffff) != (((s) this).anInt2206 ^ 0xffffffff))) {
											if (i_161_ == ((s) this).anInt2206
													&& i_162_ == 0) {
												f_168_ = f_142_;
												i_163_ -= i_148_;
												f_167_ = f_144_;
												f_166_ = f_143_;
											} else {
												final float f_169_ = ((float) i_161_ / (float) (((s) this).anInt2206));
												final float f_170_ = ((float) i_162_ / (float) (((s) this).anInt2206));
												final float f_171_ = f
														+ ((-f + f_142_) * f_169_);
												final float f_172_ = (f_169_
														* (f_143_ - f_134_) + f_134_);
												final float f_173_ = (((f_144_ - f_135_) * f_169_) + f_135_);
												final float f_174_ = (f_169_
														* (f_139_ - f_136_) + f_136_);
												final float f_175_ = (f_137_ + ((f_140_ - f_137_) * f_169_));
												final float f_176_ = (((-f_138_ + f_141_) * f_169_) + f_138_);
												f_166_ = ((f_175_ - f_172_) * f_170_)
														+ f_172_;
												f_168_ = (f_170_
														* (-f_171_ + f_174_) + f_171_);
												f_167_ = ((f_176_ - f_173_) * f_170_)
														+ f_173_;
												final int i_177_ = (i_145_ + (i_161_
														* (-i_145_ + i_148_) >> (((s) this).anInt2200)));
												final int i_178_ = (i_146_ + (i_161_
														* (i_147_ - i_146_) >> (((s) this).anInt2200)));
												i_163_ -= (i_177_ - -(((-i_177_ + i_178_) * i_162_) >> (((s) this).anInt2200)));
											}
										} else {
											f_166_ = f_140_;
											f_167_ = f_141_;
											i_163_ -= i_147_;
											f_168_ = f_139_;
										}
									} else {
										f_166_ = f_137_;
										f_168_ = f_136_;
										f_167_ = f_138_;
										i_163_ -= i_146_;
									}
								} else {
									f_166_ = f_134_;
									i_163_ -= i_145_;
									f_167_ = f_135_;
									f_168_ = f;
								}
								if (i_158_ != -1) {
									int i_179_ = ((0x7f & i_158_) * i_163_ >> 633955783);
									if (i_179_ < 2) {
										i_179_ = 2;
									} else if (i_179_ > 126) {
										i_179_ = 126;
									}
									if ((anInt5198 & 0x7 ^ 0xffffffff) == -1) {
										f_165_ = ((f_167_ * ((aHa_Sub1_5206).aFloatArray4438[2])) + (f_168_
												* ((aHa_Sub1_5206).aFloatArray4438[0]) + (f_166_ * ((aHa_Sub1_5206).aFloatArray4438[1]))));
										f_165_ = ((f_165_ > 0.0F ? ((aHa_Sub1_5206).aFloat4435)
												: ((aHa_Sub1_5206).aFloat4407))
												* f_165_ + ((aHa_Sub1_5206).aFloat4413));
									}
									i_164_ = (Class208.anIntArray1579[i_179_
											| 0xff80 & i_158_]);
								}
								Node node = null;
								if (((i_154_ & -1 + anInt5204 ^ 0xffffffff) == -1)
										&& ((i_155_ & -1 + anInt5204 ^ 0xffffffff) == -1)) {
									node = class377.method3990(l, -1);
								}
								int i_180_;
								if (node != null) {
									is_152_[i_153_] = ((Class98_Sub40) node).aShort4191;
									i_180_ = 0xffff & is_152_[i_153_];
									if ((i_158_ ^ 0xffffffff) != 0
											&& ((((Node) class98_sub20s[i_180_]).aLong832) > ((Node) (class98_sub20s_127_[i_153_])).aLong832)) {
										class98_sub20s[i_180_] = class98_sub20s_127_[i_153_];
									}
								} else {
									int i_181_;
									if (i_159_ != i_158_) {
										int i_182_ = ((0x7f & i_159_) * i_163_ >> 378317159);
										if (i_182_ < 2) {
											i_182_ = 2;
										} else if (i_182_ > 126) {
											i_182_ = 126;
										}
										i_181_ = (Class208.anIntArray1579[i_159_
												& 0xff80 | i_182_]);
										if ((0x7 & anInt5198) == 0) {
											float f_183_ = (f_166_
													* ((aHa_Sub1_5206).aFloatArray4438[1])
													+ (((aHa_Sub1_5206).aFloatArray4438[0]) * f_168_) + (f_167_ * ((aHa_Sub1_5206).aFloatArray4438[2])));
											f_183_ = ((f_165_ * (!(f_165_ > 0.0F) ? ((aHa_Sub1_5206).aFloat4407)
													: ((aHa_Sub1_5206).aFloat4435))) + ((aHa_Sub1_5206).aFloat4413));
											int i_184_ = ((0xff0cb1 & i_181_) >> 1379966064);
											int i_185_ = ((i_181_ & 0xffc7) >> 704482856);
											int i_186_ = 0xff & i_181_;
											i_184_ *= f_183_;
											if (i_184_ >= 0) {
												if (i_184_ > 255) {
													i_184_ = 255;
												}
											} else {
												i_184_ = 0;
											}
											i_185_ *= f_183_;
											i_186_ *= f_183_;
											if ((i_185_ ^ 0xffffffff) > -1) {
												i_185_ = 0;
											} else if (i_185_ > 255) {
												i_185_ = 255;
											}
											if ((i_186_ ^ 0xffffffff) <= -1) {
												if ((i_186_ ^ 0xffffffff) < -256) {
													i_186_ = 255;
												}
											} else {
												i_186_ = 0;
											}
											i_181_ = (i_184_ << -630144720
													| i_185_ << 1834767400 | i_186_);
										}
									} else {
										i_181_ = i_164_;
									}
									if (aHa_Sub1_5206.aBoolean4397) {
										stream.b((float) i_154_);
										stream.b((float) (i_160_ + (method3417(
												i_154_, i_155_, true))));
										stream.b((float) i_155_);
										stream.e((byte) (i_181_ >> -274242992));
										stream.e((byte) (i_181_ >> -438976888));
										stream.e((byte) i_181_);
										stream.e(-1);
										stream.b((float) i_154_);
										stream.b((float) i_155_);
										if (anIntArrayArrayArray5208 != null) {
											stream.b((float) (is_133_ != null ? -1
													+ (is_133_[i_153_])
													: 0));
										}
										if ((0x7 & anInt5198) != 0) {
											stream.b(f_168_);
											stream.b(f_166_);
											stream.b(f_167_);
										}
									} else {
										stream.a((float) i_154_);
										stream.a((float) (i_160_ + (method3417(
												i_154_, i_155_, true))));
										stream.a((float) i_155_);
										stream.e((byte) (i_181_ >> -177734704));
										stream.e((byte) (i_181_ >> 1011400392));
										stream.e((byte) i_181_);
										stream.e(-1);
										stream.a((float) i_154_);
										stream.a((float) i_155_);
										if (anIntArrayArrayArray5208 != null) {
											stream.a((float) (is_133_ == null ? 0
													: -1 + (is_133_[i_153_])));
										}
										if ((anInt5198 & 0x7 ^ 0xffffffff) != -1) {
											stream.a(f_168_);
											stream.a(f_166_);
											stream.a(f_167_);
										}
									}
									i_180_ = anInt5203++;
									is_152_[i_153_] = (short) i_180_;
									if ((i_158_ ^ 0xffffffff) != 0) {
										class98_sub20s[i_180_] = class98_sub20s_127_[i_153_];
									}
									class377.method3996(new Class98_Sub40(
											is_152_[i_153_]), l, -1);
								}
								for (int i_187_ = 0; ((i_149_ ^ 0xffffffff) < (i_187_ ^ 0xffffffff)); i_187_++) {
									class98_sub20s_124_[i_187_].method1168(
											i_163_, (byte) 77, f_165_, i_164_,
											i_180_);
								}
								anInt5211++;
							}
						}
					}
				}
				for (int i_188_ = 0; i_188_ < anInt5203; i_188_++) {
					final Class98_Sub20 class98_sub20 = class98_sub20s[i_188_];
					if (class98_sub20 != null) {
						class98_sub20.method1167(i_188_, true);
					}
				}
				for (int i_189_ = 0; ((((s) this).anInt2203 ^ 0xffffffff) < (i_189_ ^ 0xffffffff)); i_189_++) {
					for (int i_190_ = 0; ((s) this).anInt2204 > i_190_; i_190_++) {
						final short[] is_191_ = (aShortArrayArray5196[i_189_
								+ ((s) this).anInt2203 * i_190_]);
						if (is_191_ != null) {
							int i_192_ = 0;
							int i_193_ = 0;
							while (i_193_ < is_191_.length) {
								final int i_194_ = is_191_[i_193_++] & 0xffff;
								final int i_195_ = 0xffff & is_191_[i_193_++];
								final int i_196_ = is_191_[i_193_++] & 0xffff;
								final Class98_Sub20 class98_sub20 = class98_sub20s[i_194_];
								final Class98_Sub20 class98_sub20_197_ = class98_sub20s[i_195_];
								final Class98_Sub20 class98_sub20_198_ = class98_sub20s[i_196_];
								Class98_Sub20 class98_sub20_199_ = null;
								if (class98_sub20 != null) {
									class98_sub20.method1174(i_192_,
											(byte) 118, i_190_, i_189_);
									class98_sub20_199_ = class98_sub20;
								}
								if (class98_sub20_197_ != null) {
									class98_sub20_197_.method1174(i_192_,
											(byte) 123, i_190_, i_189_);
									if (class98_sub20_199_ == null
											|| ((((Node) class98_sub20_197_).aLong832) < (((Node) class98_sub20_199_).aLong832))) {
										class98_sub20_199_ = class98_sub20_197_;
									}
								}
								if (class98_sub20_198_ != null) {
									class98_sub20_198_.method1174(i_192_,
											(byte) 125, i_190_, i_189_);
									if (class98_sub20_199_ == null
											|| (((((Node) class98_sub20_199_).aLong832) ^ 0xffffffffffffffffL) < ((((Node) class98_sub20_198_).aLong832) ^ 0xffffffffffffffffL))) {
										class98_sub20_199_ = class98_sub20_198_;
									}
								}
								if (class98_sub20_199_ != null) {
									if (class98_sub20 != null) {
										class98_sub20_199_.method1167(i_194_,
												true);
									}
									if (class98_sub20_197_ != null) {
										class98_sub20_199_.method1167(i_195_,
												true);
									}
									if (class98_sub20_198_ != null) {
										class98_sub20_199_.method1167(i_196_,
												true);
									}
									class98_sub20_199_.method1174(i_192_,
											(byte) 126, i_190_, i_189_);
								}
								i_192_++;
							}
						}
					}
				}
				stream.c();
				anInterface16_5220 = (aHa_Sub1_5206.method1843(i, (byte) 86,
						nativeheapbuffer, false, stream.b()));
				aClass104_5222 = new Class104(anInterface16_5220, 5126, 3, 0);
				aClass104_5216 = new Class104(anInterface16_5220, 5121, 4, 12);
				int i_200_;
				if (anIntArrayArrayArray5208 == null) {
					aClass104_5224 = new Class104(anInterface16_5220, 5126, 2,
							16);
					i_200_ = 24;
				} else {
					aClass104_5224 = new Class104(anInterface16_5220, 5126, 3,
							16);
					i_200_ = 28;
				}
				if ((anInt5198 & 0x7 ^ 0xffffffff) != -1) {
					aClass104_5215 = new Class104(anInterface16_5220, 5126, 3,
							i_200_);
				}
				final long[] ls = new long[aClass98_Sub20Array5221.length];
				for (int i_201_ = 0; ((aClass98_Sub20Array5221.length ^ 0xffffffff) < (i_201_ ^ 0xffffffff)); i_201_++) {
					final Class98_Sub20 class98_sub20 = aClass98_Sub20Array5221[i_201_];
					ls[i_201_] = ((Node) class98_sub20).aLong832;
					class98_sub20.method1170(true, anInt5203);
				}
				Class46.method436(aClass98_Sub20Array5221, false, ls);
				if (aClass33_5209 != null) {
					aClass33_5209.method321(119);
				}
			}
			anIntArrayArrayArray5210 = null;
			aByteArrayArray5212 = null;
			anIntArrayArrayArray5208 = null;
			anIntArrayArrayArray5195 = null;
			anIntArrayArrayArray5192 = anIntArrayArrayArray5194 = null;
			anIntArrayArrayArray5193 = null;
			aClass98_Sub20ArrayArrayArray5190 = null;
			aClass377_5219 = null;
			aFloatArrayArray5218 = aFloatArrayArray5214 = aFloatArrayArray5223 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ok.YA(" + ')');
		}
	}

	@Override
	final void method3425(final int i, final int i_202_) {
		/* empty */
	}

	@Override
	final void U(final int i, final int i_203_, final int[] is,
			final int[] is_204_, final int[] is_205_, final int[] is_206_,
			final int[] is_207_, final int[] is_208_, final int[] is_209_,
			final int[] is_210_, final int i_211_, final int i_212_,
			final int i_213_, final boolean bool) {
		try {
			final d var_d = ((ha) aHa_Sub1_5206).aD938;
			if (is_204_ != null && anIntArrayArrayArray5193 == null) {
				anIntArrayArrayArray5193 = new int[((s) this).anInt2203][((s) this).anInt2204][];
			}
			if (is_206_ != null && anIntArrayArrayArray5208 == null) {
				anIntArrayArrayArray5208 = new int[((s) this).anInt2203][((s) this).anInt2204][];
			}
			anIntArrayArrayArray5192[i][i_203_] = is;
			anIntArrayArrayArray5194[i][i_203_] = is_205_;
			anIntArrayArrayArray5210[i][i_203_] = is_207_;
			anIntArrayArrayArray5195[i][i_203_] = is_208_;
			if (anIntArrayArrayArray5208 != null) {
				anIntArrayArrayArray5208[i][i_203_] = is_206_;
			}
			if (anIntArrayArrayArray5193 != null) {
				anIntArrayArrayArray5193[i][i_203_] = is_204_;
			}
			final Class98_Sub20[] class98_sub20s = (aClass98_Sub20ArrayArrayArray5190[i][i_203_] = new Class98_Sub20[is_207_.length]);
			for (int i_214_ = 0; (is_207_.length ^ 0xffffffff) < (i_214_ ^ 0xffffffff); i_214_++) {
				int i_215_ = is_209_[i_214_];
				int i_216_ = is_210_[i_214_];
				if ((anInt5198 & 0x20) != 0 && (i_215_ ^ 0xffffffff) != 0
						&& (var_d.method11(i_215_, -28755).aBoolean1825)) {
					i_215_ = -1;
					i_216_ = 128;
				}
				final long l = ((long) i_212_ << 1267155370
						| (long) i_213_ << 1046159152
						| (long) i_211_ << -194355108 | i_216_ << -1435014610 | i_215_);
				Node node;
				for (node = aClass377_5219.method3990(l, -1); node != null; node = aClass377_5219
						.method3993(122)) {
					final Class98_Sub20 class98_sub20 = (Class98_Sub20) node;
					if (i_215_ == class98_sub20.anInt3968
							&& (class98_sub20.aFloat3972 == i_216_)
							&& class98_sub20.anInt3971 == i_211_
							&& ((i_212_ ^ 0xffffffff) == (class98_sub20.anInt3974 ^ 0xffffffff))
							&& ((i_213_ ^ 0xffffffff) == (class98_sub20.anInt3975 ^ 0xffffffff))) {
						break;
					}
				}
				if (node != null) {
					class98_sub20s[i_214_] = (Class98_Sub20) node;
				} else {
					class98_sub20s[i_214_] = new Class98_Sub20(this, i_215_,
							i_216_, i_211_, i_212_, i_213_);
					aClass377_5219.method3996(class98_sub20s[i_214_], l, -1);
				}
			}
			if (bool) {
				aByteArrayArray5201[i][i_203_] = (byte) Class41.method366(
						aByteArrayArray5201[i][i_203_], 1);
			}
			if ((is_207_.length ^ 0xffffffff) < (anInt5213 ^ 0xffffffff)) {
				anInt5213 = is_207_.length;
			}
			anInt5217 += is_207_.length;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.U(" + i + ','
					+ i_203_ + ',' + (is != null ? "{...}" : "null") + ','
					+ (is_204_ != null ? "{...}" : "null") + ','
					+ (is_205_ != null ? "{...}" : "null") + ','
					+ (is_206_ != null ? "{...}" : "null") + ','
					+ (is_207_ != null ? "{...}" : "null") + ','
					+ (is_208_ != null ? "{...}" : "null") + ','
					+ (is_209_ != null ? "{...}" : "null") + ','
					+ (is_210_ != null ? "{...}" : "null") + ',' + i_211_ + ','
					+ i_212_ + ',' + i_213_ + ',' + bool + ')'));
		}
	}

	static final boolean method3432(final int i, final byte i_217_,
			final int i_218_) {
		try {
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.I(" + i + ','
					+ i_217_ + ',' + i_218_ + ')'));
		}
	}

	static final boolean method3433(final int i, final int i_220_,
			final int i_221_) {
		try {
			if (i_220_ != 15849) {
				return false;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.E(" + i + ','
					+ i_220_ + ',' + i_221_ + ')'));
		}
	}

	static final void method3434(final Class207 class207, final boolean bool,
			final int i, final int i_222_, final int i_223_, final int i_224_) {
		do {
			try {
				Class98_Sub15.method1144(i, i_224_ + 16527, bool, i_223_,
						class207, i_222_, 0L);
				if (i_224_ == -16523) {
					break;
				}
				method3427(26, 118, -88, -119, (byte) -81, -59, -59);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("ok.G(" + (class207 != null ? "{...}" : "null") + ','
								+ bool + ',' + i + ',' + i_222_ + ',' + i_223_
								+ ',' + i_224_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method3426(final int i, final int i_225_, final int i_226_,
			final boolean[][] bools, final boolean bool, final int i_227_) {
		try {
			method3428(i_227_, -1, bool, i_226_, i, bools, 11490, i_225_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ok.C(" + i + ','
					+ i_225_ + ',' + i_226_ + ','
					+ (bools != null ? "{...}" : "null") + ',' + bool + ','
					+ i_227_ + ')'));
		}
	}

	static {
		aClass58_5205 = new IncomingOpcode(101, 6);
	}
}
