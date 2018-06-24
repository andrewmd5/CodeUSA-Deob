/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class117 {
	private int anInt968;
	private int[] anIntArray969;
	private int anInt970;
	private int anInt971;
	private int anInt972;
	private int[] anIntArray973;
	static int[] anIntArray974 = new int[50];

	public static void method2163(final int i) {
		try {
			if (i != -20732) {
				anIntArray974 = null;
			}
			anIntArray974 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hj.E(" + i + ')');
		}
	}

	static final void method2164(final ha var_ha, final int i, final int i_0_,
			final int i_1_, final int i_2_, final int i_3_, final int i_4_,
			final boolean bool, final boolean bool_5_) {
		Class98_Sub10_Sub30.aHa5709 = var_ha;
		Class294.anInt2407 = i;
		Class375.aBoolean3170 = (Class294.anInt2407 > 1 && Class98_Sub10_Sub30.aHa5709
				.method1810());
		Class151_Sub8.anInt5015 = i_0_;
		r_Sub2.anInt6333 = 1 << Class151_Sub8.anInt5015;
		Class207.anInt1577 = r_Sub2.anInt6333 >> 1;
		Math.sqrt(Class207.anInt1577 * Class207.anInt1577 + Class207.anInt1577
				* Class207.anInt1577);
		Class364.anInt3103 = i_1_;
		Class366.anInt3112 = i_2_;
		Class64_Sub9.anInt3662 = i_3_;
		Class259.anInt1959 = i_4_;
		Class376.aClass142_3174 = Class111_Sub3.method2133((byte) -20);
		Class64_Sub22.method645((byte) 102);
		Class246_Sub2.aClass172ArrayArrayArray5077 = new Class172[i_1_][Class366.anInt3112][Class64_Sub9.anInt3662];
		Class98_Sub46_Sub2_Sub2.aSArray6298 = new s[i_1_];
		if (bool) {
			Class40.anIntArrayArray367 = new int[Class366.anInt3112][Class64_Sub9.anInt3662];
			Class299_Sub2.aByteArrayArray5291 = new byte[Class366.anInt3112][Class64_Sub9.anInt3662];
			Class304.aShortArrayArray2534 = new short[Class366.anInt3112][Class64_Sub9.anInt3662];
			Class252.aClass172ArrayArrayArray1927 = new Class172[1][Class366.anInt3112][Class64_Sub9.anInt3662];
			Class81.aSArray618 = new s[1];
		} else {
			Class40.anIntArrayArray367 = null;
			Class299_Sub2.aByteArrayArray5291 = null;
			Class304.aShortArrayArray2534 = null;
			Class252.aClass172ArrayArrayArray1927 = null;
			Class81.aSArray618 = null;
		}
		if (bool_5_) {
			Class373_Sub3.aLongArrayArrayArray5476 = new long[i_1_][i_2_][i_3_];
			Class98_Sub10_Sub31.aClass1Array5717 = new Class1[65535];
			Class21_Sub4.aBooleanArray5399 = new boolean[65535];
			Class226.anInt1705 = 0;
		} else {
			Class373_Sub3.aLongArrayArrayArray5476 = null;
			Class98_Sub10_Sub31.aClass1Array5717 = null;
			Class21_Sub4.aBooleanArray5399 = null;
			Class226.anInt1705 = 0;
		}
		Class248.method3158(false);
		Class379.aClass246_Sub3Array3198 = new Class246_Sub3[2];
		Class359.aClass246_Sub3Array3056 = new Class246_Sub3[2];
		Class130.aClass246_Sub3Array1029 = new Class246_Sub3[2];
		Class32.aClass246_Sub3Array307 = new Class246_Sub3[10000];
		GameObjectDefinitionLoader.anInt2523 = 0;
		Class246_Sub4_Sub2.aClass246_Sub3Array6173 = new Class246_Sub3[5000];
		Class353.anInt3009 = 0;
		Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273 = new Class246_Sub3_Sub4[5000];
		Class347.anInt2907 = 0;
		Class74.aBooleanArrayArray551 = (new boolean[Class259.anInt1959
				+ Class259.anInt1959 + 1][Class259.anInt1959
				+ Class259.anInt1959 + 1]);
		Class319.aBooleanArrayArray2702 = (new boolean[Class259.anInt1959
				+ Class259.anInt1959 + 2][Class259.anInt1959
				+ Class259.anInt1959 + 2]);
		Class347.anIntArray2906 = new int[Class259.anInt1959
				+ Class259.anInt1959 + 2];
		Class98_Sub10_Sub27.aClass84_5692 = Class98_Sub10_Sub27.aClass84_5693;
		if (Class375.aBoolean3170) {
			Class34.aBooleanArrayArrayArray325 = (new boolean[i_1_][Class259.anInt1959
					+ Class259.anInt1959 + 1][Class259.anInt1959
					+ Class259.anInt1959 + 1]);
			Class64_Sub12.aBooleanArrayArrayArray3673 = new boolean[i_1_][][];
			if (Class98_Sub46_Sub5.aClass174Array5970 != null) {
				Class249.method3162();
			}
			Class98_Sub46_Sub5.aClass174Array5970 = new Class174[Class294.anInt2407];
			Class98_Sub10_Sub30.aHa5709
					.method1783(Class98_Sub46_Sub5.aClass174Array5970.length + 1);
			Class98_Sub10_Sub30.aHa5709.method1807(0);
			for (int i_6_ = 0; i_6_ < Class98_Sub46_Sub5.aClass174Array5970.length; i_6_++) {
				Class98_Sub46_Sub5.aClass174Array5970[i_6_] = new Class174(
						i_6_ + 1, Class98_Sub10_Sub30.aHa5709);
				new Thread(Class98_Sub46_Sub5.aClass174Array5970[i_6_], "wr"
						+ i_6_).start();
			}
			int i_7_;
			if (Class294.anInt2407 == 2) {
				i_7_ = 4;
				Class18.anInt212 = 2;
			} else if (Class294.anInt2407 == 3) {
				i_7_ = 6;
				Class18.anInt212 = 3;
			} else {
				i_7_ = 8;
				Class18.anInt212 = 4;
			}
			Class98_Sub43_Sub3.aClass245Array5922 = new Class245[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				Class98_Sub43_Sub3.aClass245Array5922[i_8_] = new Class245(
						Class55.aStringArrayArray441[Class294.anInt2407 - 2][i_8_]);
			}
		} else {
			Class18.anInt212 = 1;
		}
		s.anIntArray2205 = new int[Class18.anInt212 - 1];
		Class15.anIntArray182 = new int[Class18.anInt212 - 1];
	}

	private final void method2165(final byte i) {
		try {
			int i_10_;
			int i_11_;
			int i_12_;
			int i_13_;
			int i_14_;
			int i_15_;
			int i_16_;
			int i_9_ = (i_10_ = i_11_ = i_12_ = i_13_ = i_14_ = i_15_ = i_16_ = -1640531527);
			for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -5; i_17_++) {
				i_9_ ^= i_10_ << -910493557;
				i_10_ += i_11_;
				i_12_ += i_9_;
				i_10_ ^= i_11_ >>> -424891550;
				i_13_ += i_10_;
				i_11_ += i_12_;
				i_11_ ^= i_12_ << -1200133080;
				i_12_ += i_13_;
				i_14_ += i_11_;
				i_12_ ^= i_13_ >>> -151076080;
				i_13_ += i_14_;
				i_15_ += i_12_;
				i_13_ ^= i_14_ << -958066198;
				i_16_ += i_13_;
				i_14_ += i_15_;
				i_14_ ^= i_15_ >>> 1081109060;
				i_9_ += i_14_;
				i_15_ += i_16_;
				i_15_ ^= i_16_ << -2066782968;
				i_16_ += i_9_;
				i_10_ += i_15_;
				i_16_ ^= i_9_ >>> -1653233111;
				i_9_ += i_10_;
				i_11_ += i_16_;
			}
			int i_18_ = 0;
			for (/**/; i_18_ < 256; i_18_ += 8) {
				i_10_ += anIntArray973[i_18_ - -1];
				i_9_ += anIntArray973[i_18_];
				i_16_ += anIntArray973[i_18_ + 7];
				i_14_ += anIntArray973[5 + i_18_];
				i_11_ += anIntArray973[2 + i_18_];
				i_13_ += anIntArray973[4 + i_18_];
				i_12_ += anIntArray973[3 + i_18_];
				i_15_ += anIntArray973[i_18_ - -6];
				i_9_ ^= i_10_ << 1494265387;
				i_10_ += i_11_;
				i_12_ += i_9_;
				i_10_ ^= i_11_ >>> 386271234;
				i_13_ += i_10_;
				i_11_ += i_12_;
				i_11_ ^= i_12_ << -459009784;
				i_12_ += i_13_;
				i_14_ += i_11_;
				i_12_ ^= i_13_ >>> 1744658032;
				i_15_ += i_12_;
				i_13_ += i_14_;
				i_13_ ^= i_14_ << -754939414;
				i_16_ += i_13_;
				i_14_ += i_15_;
				i_14_ ^= i_15_ >>> -1730138780;
				i_9_ += i_14_;
				i_15_ += i_16_;
				i_15_ ^= i_16_ << -949934008;
				i_10_ += i_15_;
				i_16_ += i_9_;
				i_16_ ^= i_9_ >>> -1543727799;
				i_11_ += i_16_;
				i_9_ += i_10_;
				anIntArray969[i_18_] = i_9_;
				anIntArray969[1 + i_18_] = i_10_;
				anIntArray969[i_18_ + 2] = i_11_;
				anIntArray969[i_18_ - -3] = i_12_;
				anIntArray969[4 + i_18_] = i_13_;
				anIntArray969[5 + i_18_] = i_14_;
				anIntArray969[i_18_ - -6] = i_15_;
				anIntArray969[i_18_ - -7] = i_16_;
			}
			for (i_18_ = 0; (i_18_ ^ 0xffffffff) > -257; i_18_ += 8) {
				i_16_ += anIntArray969[i_18_ + 7];
				i_12_ += anIntArray969[i_18_ - -3];
				i_13_ += anIntArray969[4 + i_18_];
				i_10_ += anIntArray969[1 + i_18_];
				i_15_ += anIntArray969[6 + i_18_];
				i_9_ += anIntArray969[i_18_];
				i_14_ += anIntArray969[i_18_ + 5];
				i_11_ += anIntArray969[i_18_ - -2];
				i_9_ ^= i_10_ << -542763221;
				i_10_ += i_11_;
				i_12_ += i_9_;
				i_10_ ^= i_11_ >>> -902646974;
				i_13_ += i_10_;
				i_11_ += i_12_;
				i_11_ ^= i_12_ << 334759432;
				i_14_ += i_11_;
				i_12_ += i_13_;
				i_12_ ^= i_13_ >>> 967114160;
				i_15_ += i_12_;
				i_13_ += i_14_;
				i_13_ ^= i_14_ << 755037322;
				i_16_ += i_13_;
				i_14_ += i_15_;
				i_14_ ^= i_15_ >>> -1484981788;
				i_15_ += i_16_;
				i_9_ += i_14_;
				i_15_ ^= i_16_ << 463243080;
				i_10_ += i_15_;
				i_16_ += i_9_;
				i_16_ ^= i_9_ >>> 1562519465;
				i_11_ += i_16_;
				i_9_ += i_10_;
				anIntArray969[i_18_] = i_9_;
				anIntArray969[i_18_ - -1] = i_10_;
				anIntArray969[i_18_ + 2] = i_11_;
				anIntArray969[i_18_ + 3] = i_12_;
				anIntArray969[i_18_ + 4] = i_13_;
				anIntArray969[5 + i_18_] = i_14_;
				anIntArray969[6 + i_18_] = i_15_;
				anIntArray969[i_18_ - -7] = i_16_;
			}
			method2166((byte) 94);
			anInt970 = 256;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hj.B(" + i + ')');
		}
	}

	private final void method2166(final byte i) {
		try {
			if (i == 94) {
				anInt968 += ++anInt972;
				for (int i_20_ = 0; i_20_ < 256; i_20_++) {
					final int i_21_ = anIntArray969[i_20_];
					if ((0x2 & i_20_ ^ 0xffffffff) != -1) {
						if ((0x1 & i_20_ ^ 0xffffffff) != -1) {
							anInt971 ^= anInt971 >>> -2137572944;
						} else {
							anInt971 ^= anInt971 << -255770270;
						}
					} else if ((i_20_ & 0x1) == 0) {
						anInt971 ^= anInt971 << -1951024339;
					} else {
						anInt971 ^= anInt971 >>> 1690224390;
					}
					anInt971 += anIntArray969[0xff & 128 + i_20_];
					int i_22_;
					anIntArray969[i_20_] = i_22_ = (anInt971
							+ (anIntArray969[Class202.method2702(1020, i_21_) >> -875557438]) - -anInt968);
					anIntArray973[i_20_] = anInt968 = (anIntArray969[(Class202
							.method2702(i_22_ >> -1052867128, 1020) >> -1635419422)])
							- -i_21_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hj.G(" + i + ')');
		}
	}

	final int method2167(final int i) {
		try {
			if (i <= 76) {
				anInt968 = -71;
			}
			if ((anInt970 ^ 0xffffffff) == -1) {
				method2166((byte) 94);
				anInt970 = 256;
			}
			return 0;
			// return anIntArray973[--anInt970];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hj.C(" + i + ')');
		}
	}

	final int method2168(final int i) {
		try {
			if (i != 3) {
				return 20;
			}
			if (anInt970 == 0) {
				method2166((byte) 94);
				anInt970 = 256;
			}
			return 0;
			// return anIntArray973[-1 + anInt970];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hj.D(" + i + ')');
		}
	}

	static final void method2169(final int[] is, final long[] ls, final int i,
			final int i_23_, final boolean bool) {
		do {
			try {
				if (i < i_23_) {
					final int i_24_ = (i_23_ + i) / 2;
					int i_25_ = i;
					final long l = ls[i_24_];
					ls[i_24_] = ls[i_23_];
					ls[i_23_] = l;
					final int i_26_ = is[i_24_];
					is[i_24_] = is[i_23_];
					is[i_23_] = i_26_;
					final int i_27_ = l == 9223372036854775807L ? 0 : 1;
					for (int i_28_ = i; (i_23_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
						if (l - -(long) (i_27_ & i_28_) > ls[i_28_]) {
							final long l_29_ = ls[i_28_];
							ls[i_28_] = ls[i_25_];
							ls[i_25_] = l_29_;
							final int i_30_ = is[i_28_];
							is[i_28_] = is[i_25_];
							is[i_25_++] = i_30_;
						}
					}
					ls[i_23_] = ls[i_25_];
					ls[i_25_] = l;
					is[i_23_] = is[i_25_];
					is[i_25_] = i_26_;
					method2169(is, ls, i, i_25_ + -1, bool);
					method2169(is, ls, 1 + i_25_, i_23_, bool);
				}
				if (bool == false) {
					break;
				}
				method2164(null, 101, -71, 107, 35, -44, 75, true, true);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("hj.F("
						+ (is != null ? "{...}" : "null") + ','
						+ (ls != null ? "{...}" : "null") + ',' + i + ','
						+ i_23_ + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	Class117(final int[] is) {
		try {
			anIntArray969 = new int[256];
			anIntArray973 = new int[256];
			for (int i = 0; (is.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				anIntArray973[i] = is[i];
			}
			method2165((byte) -123);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hj.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}
}
