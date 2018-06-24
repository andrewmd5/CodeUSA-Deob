/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class93 implements Interface21 {
	static boolean aBoolean3503 = false;
	int anInt3504;
	int anInt3505;
	int anInt3506;
	int anInt3507;
	int anInt3508;
	Class63 aClass63_3509;
	static int[][] anIntArrayArray3510 = { { 0, 1, 2, 3 }, { 1, -1, -1, 0 },
			{ -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 },
			{ 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 },
			{ -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 },
			{ 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
	Class110 aClass110_3511;
	static Class332[] aClass332Array3512;
	int anInt3513;
	int anInt3514;

	public static void method899(int i) {
		try {
			anIntArrayArray3510 = null;
			if (i > 104)
				aClass332Array3512 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fq.K(" + i + ')');
		}
	}

	static final void method900(int i, byte[][] is, Class305_Sub1 class305_sub1) {
		do {
			try {
				int[] is_0_ = { -1, 0, 0, 0, 0 };
				int i_1_ = 0;
				if (i != 11948)
					aBoolean3503 = false;
				for (/**/; i_1_ < ((Class305) class305_sub1).anInt2547; i_1_++) {
					Class128.method2224(22696);
					for (int i_2_ = 0; i_2_ < Class165.anInt1276 >> 2130796515; i_2_++) {
						for (int i_3_ = 0; ((Class98_Sub10_Sub7.anInt5572 >> 2020537603 ^ 0xffffffff) < (i_3_ ^ 0xffffffff)); i_3_++) {
							int i_4_ = (Class170.anIntArrayArrayArray1311[i_1_][i_2_][i_3_]);
							if (i_4_ != -1) {
								int i_5_ = (i_4_ & 0x3fe0511) >> -79784296;
								if (!((Class305) class305_sub1).aBoolean2544
										|| (i_5_ ^ 0xffffffff) == -1) {
									int i_6_ = (0x7 & i_4_) >> 2079355553;
									int i_7_ = (i_4_ & 0xffe196) >> -797997746;
									int i_8_ = 0x7ff & i_4_ >> 1649106819;
									int i_9_ = (i_7_ / 8 << -1183468824) + i_8_
											/ 8;
									for (int i_10_ = 0; (Class121.anIntArray1006.length > i_10_); i_10_++) {
										if ((Class121.anIntArray1006[i_10_] == i_9_)
												&& is[i_10_] != null) {
											ByteBuffer class98_sub22 = new ByteBuffer(
													is[i_10_]);
											class305_sub1
													.method3575(
															i_8_,
															i_3_ * 8,
															class98_sub22,
															i_6_,
															i_5_,
															8 * i_2_,
															i + -11948,
															i_7_,
															Class167.aClass243Array1281,
															i_1_);
											class305_sub1
													.method3586(
															i_7_,
															i_8_,
															((is_0_[0] ^ 0xffffffff) != 0 ? null
																	: is_0_),
															i_2_ * 8, 8 * i_3_,
															class98_sub22,
															Class265.aHa1974,
															i_6_, true, i_5_,
															i_1_);
											break;
										}
									}
								}
							}
						}
					}
				}
				for (int i_11_ = 0; ((Class305) class305_sub1).anInt2547 > i_11_; i_11_++) {
					Class128.method2224(22696);
					for (int i_12_ = 0; ((Class165.anInt1276 >> -1820522237 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
						for (int i_13_ = 0; ((Class98_Sub10_Sub7.anInt5572 >> 101337859 ^ 0xffffffff) < (i_13_ ^ 0xffffffff)); i_13_++) {
							int i_14_ = (Class170.anIntArrayArrayArray1311[i_11_][i_12_][i_13_]);
							if ((i_14_ ^ 0xffffffff) == 0)
								class305_sub1.method3567(8, i_11_, i_12_ * 8,
										8, 8 * i_13_, i ^ ~0x2eac);
						}
					}
				}
				if ((is_0_[0] ^ 0xffffffff) == 0)
					break;
				s_Sub1.aClass346_5202 = Class373_Sub2.aClass59_5470.method528(
						0, is_0_[0], is_0_[2], is_0_[1],
						(Class101.aClass115_857), is_0_[3]);
				Class156_Sub1.anInt3278 = is_0_[4];
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("fq.J(" + i
						+ ',' + (is != null ? "{...}" : "null") + ','
						+ (class305_sub1 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method901(int i, int i_15_, int i_16_) {
		try {
			int i_17_ = -125 % ((i_16_ - -52) / 55);
			if ((0x800 & i_15_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fq.L(" + i + ','
					+ i_15_ + ',' + i_16_ + ')'));
		}
	}

	Class93(Class63 class63, Class110 class110, int i, int i_18_, int i_19_,
			int i_20_, int i_21_, int i_22_, int i_23_) {
		try {
			((Class93) this).anInt3507 = i_18_;
			((Class93) this).anInt3505 = i;
			((Class93) this).anInt3504 = i_20_;
			((Class93) this).anInt3506 = i_22_;
			((Class93) this).anInt3508 = i_21_;
			((Class93) this).aClass63_3509 = class63;
			((Class93) this).anInt3514 = i_19_;
			((Class93) this).anInt3513 = i_23_;
			((Class93) this).aClass110_3511 = class110;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fq.<init>("
					+ (class63 != null ? "{...}" : "null") + ','
					+ (class110 != null ? "{...}" : "null") + ',' + i + ','
					+ i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ','
					+ i_22_ + ',' + i_23_ + ')'));
		}
	}

	public Class113 method70(int i) {
		try {
			if (i != 30778)
				((Class93) this).aClass63_3509 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fq.A(" + i + ')');
		}
	}
}
