/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class27 {
	static IncomingOpcode aClass58_274 = new IncomingOpcode(70, -2);
	static Class148 aClass148_275 = new Class148();
	static Class268 aClass268_276;
	static IncomingOpcode aClass58_277 = new IncomingOpcode(61, 4);
	static int[] anIntArray278 = new int[8];
	static long[][] aLongArrayArray279 = new long[8][256];
	static long[] aLongArray280 = new long[11];

	static final void method294(final boolean bool) {
		try {
			Class199.aClass32_1531.method315((byte) -46);
			Class82.aClass153_630.method2482((byte) 62);
			Class149.aClass83_1205.method828(-113);
			Class130.aClass302_1028.method3547((byte) 127);
			Class4.aClass301_85.method3535((byte) -19);
			Class98_Sub46_Sub19.aClass205_6068.method2719((byte) 71);
			Class151_Sub7.aClass183_5001.method2619(-2118);
			Class196.aClass304_1509.method3559(4);
			Class17.aClass198_205.method2683(0);
			Class134.aClass139_3465.method2283((byte) 97);
			Class370.aClass257_3136.method3202((byte) 96);
			Class98_Sub10_Sub23.aClass335_5662.method3768(10673);
			Class216.aClass341_1622.method3813(36);
			Class303.aClass13_2529.method218(bool);
			Class98_Sub43_Sub1.aClass365_5897.method3944(-1);
			Class373_Sub2.aClass59_5470.method525(-112);
			Class101.aClass115_857.method2158(bool);
			Class21_Sub1.aClass269_5383.method3271(bool);
			Class18.aClass11_213.method200(1);
			Class62.aClass264_487.method3226(32);
			Class246_Sub3_Sub1.aClass121_6150.method2193(0);
			Class243.method2942(1);
			Class52.method489(false);
			Class34.method328(0);
			Class315.method3646(-106);
			Class246_Sub3_Sub2_Sub1.method3008((byte) 60);
			Class275.aClass79_2046.method806((byte) -106);
			Class224_Sub3.aClass79_5039.method806((byte) -82);
			Class378.aClass79_3189.method806((byte) -80);
			RSModelLoader.aClass79_3847.method806((byte) 118);
			ClientScriptsDefs.aClass79_1890.method806((byte) 28);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "c.C(" + bool + ')');
		}
	}

	public static void method295(final byte i) {
		try {
			anIntArray278 = null;
			aClass268_276 = null;
			aLongArrayArray279 = null;
			if (i <= -121) {
				aClass148_275 = null;
				aClass58_277 = null;
				aLongArray280 = null;
				aClass58_274 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "c.B(" + i + ')');
		}
	}

	static final void method296(final byte i) {
		do {
			try {
				Class98_Sub46_Sub20_Sub2.anInt6317 = 1;
				Class146_Sub2.anInt4855 = -1;
				long l = 0L;
				if (Class98_Sub10_Sub10.aString5593 == null) {
					Class369.method3952(35, (byte) -55);
				} else {
					final ByteBuffer class98_sub22 = new ByteBuffer(
							Class167.method2531((Class378.method4006(
									Class98_Sub10_Sub10.aString5593, -1)),
									12705));
					l = class98_sub22.method1246(i + -171);
					Class98_Sub10_Sub19.aLong5631 = class98_sub22
							.method1246(-105);
					Class342.finalLogin(true,
							Class98_Sub28.method1305(-111, l), 80, "");
					if (i == 55) {
						break;
					}
					anIntArray278 = null;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "c.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static {
		for (int i = 0; i < 256; i++) {
			final int i_0_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
					.charAt(i / 2);
			final long l = (0x1 & i ^ 0xffffffff) == -1 ? i_0_ >>> 1856053640
					: i_0_ & 0xff;
			long l_1_ = l << 909211713;
			if (l_1_ >= 256L) {
				l_1_ ^= 0x11dL;
			}
			long l_2_ = l_1_ << 1782822081;
			if ((l_2_ ^ 0xffffffffffffffffL) <= -257L) {
				l_2_ ^= 0x11dL;
			}
			final long l_3_ = l_2_ ^ l;
			long l_4_ = l_2_ << 483539521;
			if ((l_4_ ^ 0xffffffffffffffffL) <= -257L) {
				l_4_ ^= 0x11dL;
			}
			final long l_5_ = l ^ l_4_;
			aLongArrayArray279[0][i] = (Class151_Sub1.method2448(l_5_,
					(Class151_Sub1.method2448((Class151_Sub1.method2448(
							l_3_ << 390312336, (Class151_Sub1.method2448(
									l_4_ << 1263478616,
									(Class151_Sub1.method2448((Class151_Sub1
											.method2448(l_2_ << 1309969768,
													Class151_Sub1.method2448(
															l << -966627024,
															l << -650887624))),
											l << 996425056)))))),
							l_1_ << -175798776))));
			for (int i_6_ = 1; (i_6_ ^ 0xffffffff) > -9; i_6_++) {
				aLongArrayArray279[i_6_][i] = Class151_Sub1.method2448(
						(aLongArrayArray279[-1 + i_6_][i]) << 2027155000,
						(aLongArrayArray279[-1 + i_6_][i]) >>> 1503710728);
			}
		}
		aLongArray280[0] = 0L;
		for (int i = 1; i <= 10; i++) {
			final int i_7_ = -8 + i * 8;
			aLongArray280[i] = (Class284_Sub1_Sub1
					.method3367(
							SurfaceSkin.method335(aLongArrayArray279[7][7 + i_7_],
									255L),
							(Class284_Sub1_Sub1.method3367(
									(Class284_Sub1_Sub1.method3367(
											(Class284_Sub1_Sub1
													.method3367(
															SurfaceSkin.method335(
																	aLongArrayArray279[4][i_7_ + 4],
																	4278190080L),
															(Class284_Sub1_Sub1
																	.method3367(
																			SurfaceSkin.method335(
																					aLongArrayArray279[3][i_7_ + 3],
																					1095216660480L),
																			(Class284_Sub1_Sub1
																					.method3367(
																							(Class284_Sub1_Sub1
																									.method3367(
																											SurfaceSkin.method335(
																													71776119061217280L,
																													(aLongArrayArray279[1][i_7_ + 1])),
																											SurfaceSkin.method335(
																													aLongArrayArray279[0][i_7_],
																													-72057594037927936L))),
																							SurfaceSkin.method335(
																									(aLongArrayArray279[2][i_7_
																											- -2]),
																									280375465082880L))))))),
											SurfaceSkin.method335(
													aLongArrayArray279[5][i_7_ + 5],
													16711680L))), SurfaceSkin
											.method335(
													aLongArrayArray279[6][i_7_
															- -6], 65280L)))));
		}
	}
}
