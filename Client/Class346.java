/* Class346 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346 {
	private int anInt2892;
	static int[][] anIntArrayArray2893 = { { 2, 4, 6, 0 },
			{ 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 },
			{ 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 },
			{ 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 },
			{ 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
	private Class332 aClass332_2894;
	private boolean aBoolean2895;
	private int anInt2896 = -1;
	private int anInt2897;
	private int anInt2898;
	private Class175[] aClass175Array2899;
	static float aFloat2900;
	private Class175 aClass175_2901;
	private int anInt2902;
	private Class175[] aClass175Array2903;
	private int anInt2904;
	private int anInt2905;

	final void method3827(final byte i) {
		try {
			if (i == -87) {
				if (aClass175Array2903 != null) {
					for (int i_0_ = 0; i_0_ < aClass175Array2903.length; i_0_++) {
						aClass175Array2903[i_0_].method2570();
					}
				}
				aClass332_2894 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vaa.C(" + i + ')');
		}
	}

	final boolean method3828(final int i, final int i_1_, final ha var_ha) {
		try {
			if ((i ^ 0xffffffff) != (anInt2896 ^ 0xffffffff)) {
				anInt2896 = i;
				int i_2_ = Class23.method282(31, i);
				if (i_2_ > 512) {
					i_2_ = 512;
				}
				if ((i_2_ ^ 0xffffffff) >= -1) {
					i_2_ = 1;
				}
				if ((anInt2897 ^ 0xffffffff) != (i_2_ ^ 0xffffffff)) {
					anInt2897 = i_2_;
					aClass332_2894 = null;
				}
				if (aClass175Array2903 != null) {
					anInt2904 = 0;
					final int[] is = new int[aClass175Array2903.length];
					for (int i_3_ = 0; aClass175Array2903.length > i_3_; i_3_++) {
						final Class175 class175 = aClass175Array2903[i_3_];
						if (class175.method2575(anInt2898, anInt2892,
								anInt2905, anInt2896)) {
							is[anInt2904] = class175.anInt1361;
							aClass175Array2899[anInt2904++] = class175;
						}
					}
					Class33.method323(is, aClass175Array2899, 0,
							-1 + anInt2904, 0);
				}
				aBoolean2895 = true;
			}
			if (i_1_ != 6) {
				method3828(-20, 36, null);
			}
			boolean bool = false;
			if (aBoolean2895) {
				aBoolean2895 = false;
				for (int i_4_ = anInt2904 + -1; (i_4_ ^ 0xffffffff) <= -1; i_4_--) {
					final boolean bool_5_ = aClass175Array2899[i_4_]
							.method2577(var_ha, aClass175_2901);
					bool |= bool_5_;
					final Class346 class346_6_ = this;
					class346_6_.aBoolean2895 = class346_6_.aBoolean2895
							| !bool_5_;
				}
			}
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vaa.D(" + i + ','
					+ i_1_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	static final char method3829(final char c, final int i) {
		try {
			if (i != 0) {
				return '\uff8e';
			}
			final int i_7_ = c;
			while_241_: do {
				while_240_: do {
					while_239_: do {
						while_238_: do {
							while_237_: do {
								while_236_: do {
									while_235_: do {
										while_234_: do {
											while_233_: do {
												while_232_: do {
													do {
														if (i_7_ != 32
																&& i_7_ != 160
																&& ((i_7_ ^ 0xffffffff) != -96)
																&& ((i_7_ ^ 0xffffffff) != -46)) {
															if (i_7_ == 91
																	|| ((i_7_ ^ 0xffffffff) == -94)
																	|| i_7_ == 35) {
																break;
															}
															if (i_7_ == 224
																	|| ((i_7_ ^ 0xffffffff) == -226)
																	|| ((i_7_ ^ 0xffffffff) == -227)
																	|| i_7_ == 228
																	|| i_7_ == 227
																	|| ((i_7_ ^ 0xffffffff) == -193)
																	|| ((i_7_ ^ 0xffffffff) == -194)
																	|| ((i_7_ ^ 0xffffffff) == -195)
																	|| i_7_ == 196
																	|| i_7_ == 195) {
																break while_232_;
															}
															if (((i_7_ ^ 0xffffffff) == -233)
																	|| i_7_ == 233
																	|| ((i_7_ ^ 0xffffffff) == -235)
																	|| i_7_ == 235
																	|| ((i_7_ ^ 0xffffffff) == -201)
																	|| i_7_ == 201
																	|| i_7_ == 202
																	|| i_7_ == 203) {
																break while_233_;
															}
															if (i_7_ == 237
																	|| ((i_7_ ^ 0xffffffff) == -239)
																	|| ((i_7_ ^ 0xffffffff) == -240)
																	|| i_7_ == 205
																	|| ((i_7_ ^ 0xffffffff) == -207)
																	|| i_7_ == 207) {
																break while_234_;
															}
															if (((i_7_ ^ 0xffffffff) == -243)
																	|| i_7_ == 243
																	|| ((i_7_ ^ 0xffffffff) == -245)
																	|| i_7_ == 246
																	|| ((i_7_ ^ 0xffffffff) == -246)
																	|| ((i_7_ ^ 0xffffffff) == -211)
																	|| ((i_7_ ^ 0xffffffff) == -212)
																	|| ((i_7_ ^ 0xffffffff) == -213)
																	|| i_7_ == 214
																	|| i_7_ == 213) {
																break while_235_;
															}
															if (i_7_ == 249
																	|| ((i_7_ ^ 0xffffffff) == -251)
																	|| ((i_7_ ^ 0xffffffff) == -252)
																	|| ((i_7_ ^ 0xffffffff) == -253)
																	|| ((i_7_ ^ 0xffffffff) == -218)
																	|| ((i_7_ ^ 0xffffffff) == -219)
																	|| i_7_ == 219
																	|| i_7_ == 220) {
																break while_236_;
															}
															if (((i_7_ ^ 0xffffffff) == -232)
																	|| ((i_7_ ^ 0xffffffff) == -200)) {
																break while_237_;
															}
															if (i_7_ == 255
																	|| ((i_7_ ^ 0xffffffff) == -377)) {
																break while_238_;
															}
															if (i_7_ == 241
																	|| ((i_7_ ^ 0xffffffff) == -210)) {
																break while_239_;
															}
															if ((i_7_ ^ 0xffffffff) != -224) {
																break while_241_;
															}
															if (!client.aBoolean3553) {
																break while_240_;
															}
														}
														return '_';
													} while (false);
													return c;
												} while (false);
												return 'a';
											} while (false);
											return 'e';
										} while (false);
										return 'i';
									} while (false);
									return 'o';
								} while (false);
								return 'u';
							} while (false);
							return 'c';
						} while (false);
						return 'y';
					} while (false);
					return 'n';
				} while (false);
				return 'b';
			} while (false);
			return Character.toLowerCase(c);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vaa.B(" + c + ','
					+ i + ')');
		}
	}

	public static void method3830(final int i) {
		do {
			try {
				anIntArrayArray2893 = null;
				if (i == -211) {
					break;
				}
				aFloat2900 = -0.43294057F;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "vaa.E(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method3831(final int i, final int i_8_, int i_9_,
			final int i_10_, final int i_11_, final int i_12_, final ha var_ha,
			final int i_13_, final int i_14_, final int i_15_) {
		try {
			i_9_ = 0x3fff & i + i_9_;
			if ((anInt2902 ^ 0xffffffff) != 0 && anInt2897 != 0) {
				final TextureDefinition textureDefinition = Class98_Sub10_Sub8.aD5578.method11(
						anInt2902, i_11_ ^ 0x2f2f);
				if (aClass332_2894 == null
						&& Class98_Sub10_Sub8.aD5578.method8(115, anInt2902)) {
					final int[] is = ((textureDefinition.anInt1818 ^ 0xffffffff) != -3 ? Class98_Sub10_Sub8.aD5578
							.method9(anInt2902, (byte) -112, anInt2897, 0.7F,
									false, anInt2897)
							: Class98_Sub10_Sub8.aD5578.method13(111,
									anInt2897, anInt2902, 0.7F, false,
									anInt2897));
					aClass332_2894 = var_ha.method1748(-7962, 0, anInt2897,
							anInt2897, is, anInt2897);
				}
				if ((textureDefinition.anInt1818 ^ 0xffffffff) == -3) {
					var_ha.aa(i_12_, i_10_, i_14_, i_13_, i_15_, 0);
				}
				if (aClass332_2894 != null) {
					final int i_16_ = ((textureDefinition.anInt1818 ^ 0xffffffff) != -3 ? 0
							: 1);
					int i_17_ = i_8_ * i_13_ / -4096;
					int i_18_;
					for (i_18_ = i_13_ * i_9_ / 4096 + (i_14_ - i_13_) / 2; (i_18_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_18_ -= i_13_) {
						/* empty */
					}
					for (/**/; i_18_ < 0; i_18_ += i_13_) {
						/* empty */
					}
					for (/**/; i_13_ < i_17_; i_17_ -= i_13_) {
						/* empty */
					}
					for (/**/; (i_17_ ^ 0xffffffff) > -1; i_17_ += i_13_) {
						/* empty */
					}
					for (int i_19_ = i_18_ + -i_13_; (i_14_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_ += i_13_) {
						for (int i_20_ = i_17_ - i_13_; i_20_ < i_13_; i_20_ += i_13_) {
							aClass332_2894.method3727(i_19_ - -i_12_, i_20_
									- -i_10_, i_13_, i_13_, 1, 0, i_16_);
						}
					}
				}
			} else {
				var_ha.aa(i_12_, i_10_, i_14_, i_13_, i_15_, 0);
			}
			if (i_11_ != -24446) {
				method3831(-115, -58, 66, 67, 6, -61, null, -35, -42, 87);
			}
			for (int i_21_ = anInt2904 + -1; (i_21_ ^ 0xffffffff) <= -1; i_21_--) {
				aClass175Array2899[i_21_].method2573(var_ha, i_12_, i_10_,
						i_14_, i_13_, i_8_, i_9_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vaa.A(" + i + ','
					+ i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ','
					+ i_12_ + ',' + (var_ha != null ? "{...}" : "null") + ','
					+ i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	Class346(final int i, final Class175[] class175s, final int i_22_,
			final int i_23_, final int i_24_, final int i_25_) {
		aBoolean2895 = true;
		try {
			anInt2905 = i_25_;
			aClass175Array2903 = class175s;
			anInt2902 = i;
			anInt2898 = i_23_;
			anInt2892 = i_24_;
			if (class175s == null) {
				aClass175Array2899 = null;
				aClass175_2901 = null;
			} else {
				aClass175Array2899 = new Class175[class175s.length];
				aClass175_2901 = (i_22_ ^ 0xffffffff) <= -1 ? class175s[i_22_]
						: null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("vaa.<init>(" + i
					+ ',' + (class175s != null ? "{...}" : "null") + ','
					+ i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')'));
		}
	}
}
