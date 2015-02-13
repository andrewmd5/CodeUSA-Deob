/* Class98_Sub43_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

import java.awt.Color;

final class Class98_Sub43_Sub4 extends Class98_Sub43 {
	private int anInt5930;
	private String aString5931;
	static String[] aStringArray5932 = new String[100];
	private String aString5933;
	static short aShort5934 = 205;
	private float aFloat5935;
	private int anInt5936;
	private String aString5937;
	static int anInt5938;
	private float aFloat5939;
	static float[] aFloatArray5940 = new float[4];

	final String method1503(final int i) {
		try {
			if (i != 22875) {
				anInt5936 = 92;
			}
			return aString5937;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wda.G(" + i + ')');
		}
	}

	static final void method1504(
			final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1,
			final int i) {
		try {
			if (i != -16255) {
				method1508(-54, -22, null);
			}
			for (Class98_Sub42 class98_sub42 = ((Class98_Sub42) Class358.aClass148_3032
					.method2418(i + 16287)); class98_sub42 != null; class98_sub42 = ((Class98_Sub42) Class358.aClass148_3032
					.method2417(i ^ ~0x3f24))) {
				if ((class98_sub42.aClass246_Sub3_Sub4_Sub2_Sub1_4209) == class246_sub3_sub4_sub2_sub1) {
					if ((class98_sub42.aClass98_Sub31_Sub5_4232) != null) {
						Class81.aClass98_Sub31_Sub3_619
								.method1374(class98_sub42.aClass98_Sub31_Sub5_4232);
						class98_sub42.aClass98_Sub31_Sub5_4232 = null;
					}
					class98_sub42.method942(116);
					break;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wda.D("
					+ ((class246_sub3_sub4_sub2_sub1 != null) ? "{...}"
							: "null") + ',' + i + ')'));
		}
	}

	@Override
	final void method1482(final OggPacket oggpacket, final boolean bool) {
		do {
			try {
				if (((Class98_Sub43) this).anInt4240 <= 0
						|| "SUB".equals(aString5931)) {
					final ByteBuffer class98_sub22 = new ByteBuffer(
							oggpacket.getData());
					if (bool != false) {
						method1510(-72);
					}
					final int i = class98_sub22.readUnsignedByte((byte) 27);
					if (((Class98_Sub43) this).anInt4240 > 8) {
						if (i == 0) {
							final long l = class98_sub22.method1189((byte) -53);
							final long l_0_ = class98_sub22
									.method1189((byte) -63);
							final long l_1_ = class98_sub22
									.method1189((byte) -110);
							if (l < 0L
									|| (l_0_ ^ 0xffffffffffffffffL) > -1L
									|| l_1_ < 0L
									|| ((l_1_ ^ 0xffffffffffffffffL) < (l ^ 0xffffffffffffffffL))) {
								throw new IllegalStateException();
							}
							aFloat5939 = ((float) (anInt5936 * l) / (float) anInt5930);
							aFloat5935 = ((float) (anInt5936 * (l - -l_0_)) / (float) anInt5930);
							final int i_2_ = class98_sub22
									.method1202((byte) -75);
							if ((i_2_ ^ 0xffffffff) > -1
									|| i_2_ > ((class98_sub22.aByteArray3992).length - (class98_sub22.position))) {
								throw new IllegalStateException();
							}
							aString5937 = za_Sub1.method1679(
									class98_sub22.position, i_2_, (byte) -51,
									(class98_sub22.aByteArray3992));
						}
						if ((0x80 | i) != 0) {
							break;
						}
					} else {
						if (((i | 0x80) ^ 0xffffffff) == -1) {
							throw new IllegalStateException();
						}
						if ((((Class98_Sub43) this).anInt4240 ^ 0xffffffff) != -1) {
							break;
						}
						class98_sub22.position += 23;
						anInt5930 = class98_sub22.method1202((byte) -51);
						anInt5936 = class98_sub22.method1202((byte) -108);
						if (anInt5930 == 0 || anInt5936 == 0) {
							throw new IllegalStateException();
						}
						final ByteBuffer class98_sub22_3_ = new ByteBuffer(
								16);
						class98_sub22.method1190(
								(class98_sub22_3_.aByteArray3992), true, 16, 0);
						aString5933 = class98_sub22_3_.readString((byte) 84);
						class98_sub22_3_.position = 0;
						class98_sub22
								.method1190((class98_sub22_3_.aByteArray3992),
										!bool, 16, 0);
						aString5931 = class98_sub22_3_.readString((byte) 84);
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("wda.J(" + (oggpacket != null ? "{...}" : "null")
								+ ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	public static void method1505(final int i) {
		do {
			try {
				aFloatArray5940 = null;
				aStringArray5932 = null;
				if (i == 21237) {
					break;
				}
				aShort5934 = (short) -113;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "wda.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final boolean method1506(final int i, final int i_4_,
			final int i_5_, final int i_6_, final int i_7_, final int i_8_,
			final Class243 class243, final int i_9_, final int i_10_,
			final int i_11_, final int i_12_) {
		try {
			int i_13_ = i_6_;
			int i_14_ = i_12_;
			int i_15_ = 64;
			if (i_4_ != 14664) {
				method1504(null, -75);
			}
			int i_16_ = 64;
			final int i_17_ = -i_15_ + i_6_;
			final int i_18_ = i_12_ + -i_16_;
			PlayerUpdateMask.anIntArrayArray528[i_15_][i_16_] = 99;
			Class339.anIntArrayArray2846[i_15_][i_16_] = 0;
			int i_19_ = 0;
			int i_20_ = 0;
			Class359.anIntArray3060[i_19_] = i_13_;
			Class75.anIntArray580[i_19_++] = i_14_;
			final int[][] is = class243.anIntArrayArray1853;
			while (i_19_ != i_20_) {
				i_13_ = Class359.anIntArray3060[i_20_];
				i_14_ = Class75.anIntArray580[i_20_];
				i_15_ = i_13_ - i_17_;
				i_16_ = -i_18_ + i_14_;
				final int i_21_ = -class243.anInt1854 + i_13_;
				i_20_ = 1 + i_20_ & 0xfff;
				final int i_22_ = i_14_ + -class243.anInt1855;
				int i_23_ = i;
				while_249_: do {
					while_248_: do {
						while_247_: do {
							while_246_: do {
								do {
									if ((i_23_ ^ 0xffffffff) != 3) {
										if ((i_23_ ^ 0xffffffff) != 2) {
											if (i_23_ != -2) {
												if (i_23_ != -1) {
													if (((i_23_ ^ 0xffffffff) == -1)
															|| i_23_ == 1
															|| i_23_ == 2
															|| i_23_ == 3
															|| ((i_23_ ^ 0xffffffff) == -10)) {
														break while_247_;
													}
													break while_248_;
												}
											} else {
												break;
											}
											break while_246_;
										}
									} else {
										if (((i_8_ ^ 0xffffffff) == (i_13_ ^ 0xffffffff))
												&& i_14_ == i_9_) {
											Class22.anInt217 = i_14_;
											Class199.anInt1539 = i_13_;
											return true;
										}
										break while_249_;
									}
									if (Class98_Sub5.method960(i_8_, i_11_,
											-105, i_14_, i_5_, i_13_, i_9_, 1,
											1)) {
										Class199.anInt1539 = i_13_;
										Class22.anInt217 = i_14_;
										return true;
									}
									break while_249_;
								} while (false);
								if (class243.method2936(i_8_, i_5_, i_9_, -1,
										i_14_, i_11_, 1, i_13_, 1, i_7_)) {
									Class22.anInt217 = i_14_;
									Class199.anInt1539 = i_13_;
									return true;
								}
								break while_249_;
							} while (false);
							if (class243.method2939(i_11_, i_8_, i_14_, 14672,
									1, i_9_, i_7_, i_13_, i_5_)) {
								Class22.anInt217 = i_14_;
								Class199.anInt1539 = i_13_;
								return true;
							}
							break while_249_;
						} while (false);
						if (class243.method2952(i_9_, i_13_, (byte) -110, 1,
								i_14_, i_10_, i_8_, i)) {
							Class22.anInt217 = i_14_;
							Class199.anInt1539 = i_13_;
							return true;
						}
						break while_249_;
					} while (false);
					if (class243.method2938(i_8_, i_10_, i_14_, i_9_, i, 17761,
							1, i_13_)) {
						Class22.anInt217 = i_14_;
						Class199.anInt1539 = i_13_;
						return true;
					}
				} while (false);
				i_23_ = Class339.anIntArrayArray2846[i_15_][i_16_] + 1;
				if (i_15_ > 0
						&& (PlayerUpdateMask.anIntArrayArray528[i_15_ + -1][i_16_] ^ 0xffffffff) == -1
						&& ((is[i_21_ + -1][i_22_] & 0x42240000 ^ 0xffffffff) == -1)) {
					Class359.anIntArray3060[i_19_] = i_13_ - 1;
					Class75.anIntArray580[i_19_] = i_14_;
					PlayerUpdateMask.anIntArrayArray528[i_15_ - 1][i_16_] = 2;
					i_19_ = 0xfff & 1 + i_19_;
					Class339.anIntArrayArray2846[i_15_ + -1][i_16_] = i_23_;
				}
				if ((i_15_ ^ 0xffffffff) > -128
						&& PlayerUpdateMask.anIntArrayArray528[1 + i_15_][i_16_] == 0
						&& ((0x60240000 & is[1 + i_21_][i_22_] ^ 0xffffffff) == -1)) {
					Class359.anIntArray3060[i_19_] = 1 + i_13_;
					Class75.anIntArray580[i_19_] = i_14_;
					PlayerUpdateMask.anIntArrayArray528[1 + i_15_][i_16_] = 8;
					i_19_ = i_19_ + 1 & 0xfff;
					Class339.anIntArrayArray2846[1 + i_15_][i_16_] = i_23_;
				}
				if (i_16_ > 0
						&& (PlayerUpdateMask.anIntArrayArray528[i_15_][-1
								+ i_16_] ^ 0xffffffff) == -1
						&& (is[i_21_][-1 + i_22_] & 0x40a40000) == 0) {
					Class359.anIntArray3060[i_19_] = i_13_;
					Class75.anIntArray580[i_19_] = i_14_ - 1;
					PlayerUpdateMask.anIntArrayArray528[i_15_][i_16_ - 1] = 1;
					i_19_ = i_19_ + 1 & 0xfff;
					Class339.anIntArrayArray2846[i_15_][i_16_ + -1] = i_23_;
				}
				if (i_16_ < 127
						&& PlayerUpdateMask.anIntArrayArray528[i_15_][i_16_
								- -1] == 0
						&& ((is[i_21_][1 + i_22_] & 0x48240000 ^ 0xffffffff) == -1)) {
					Class359.anIntArray3060[i_19_] = i_13_;
					Class75.anIntArray580[i_19_] = i_14_ - -1;
					i_19_ = i_19_ + 1 & 0xfff;
					PlayerUpdateMask.anIntArrayArray528[i_15_][i_16_ - -1] = 4;
					Class339.anIntArrayArray2846[i_15_][1 + i_16_] = i_23_;
				}
				if (i_15_ > 0
						&& (i_16_ ^ 0xffffffff) < -1
						&& (PlayerUpdateMask.anIntArrayArray528[-1 + i_15_][i_16_ - 1] ^ 0xffffffff) == -1
						&& (is[i_21_ + -1][i_22_ - 1] & 0x43a40000) == 0
						&& (is[-1 + i_21_][i_22_] & 0x42240000 ^ 0xffffffff) == -1
						&& (0x40a40000 & is[i_21_][-1 + i_22_]) == 0) {
					Class359.anIntArray3060[i_19_] = -1 + i_13_;
					Class75.anIntArray580[i_19_] = i_14_ + -1;
					i_19_ = 0xfff & 1 + i_19_;
					PlayerUpdateMask.anIntArrayArray528[-1 + i_15_][-1 + i_16_] = 3;
					Class339.anIntArrayArray2846[-1 + i_15_][-1 + i_16_] = i_23_;
				}
				if (i_15_ < 127
						&& i_16_ > 0
						&& PlayerUpdateMask.anIntArrayArray528[i_15_ + 1][-1
								+ i_16_] == 0
						&& ((is[1 + i_21_][i_22_ - 1] & 0x60e40000 ^ 0xffffffff) == -1)
						&& (is[1 + i_21_][i_22_] & 0x60240000) == 0
						&& (is[i_21_][i_22_ - 1] & 0x40a40000) == 0) {
					Class359.anIntArray3060[i_19_] = i_13_ - -1;
					Class75.anIntArray580[i_19_] = i_14_ - 1;
					i_19_ = 0xfff & 1 + i_19_;
					PlayerUpdateMask.anIntArrayArray528[i_15_ - -1][-1 + i_16_] = 9;
					Class339.anIntArrayArray2846[1 + i_15_][i_16_ + -1] = i_23_;
				}
				if ((i_15_ ^ 0xffffffff) < -1
						&& (i_16_ ^ 0xffffffff) > -128
						&& (PlayerUpdateMask.anIntArrayArray528[-1 + i_15_][i_16_ + 1] ^ 0xffffffff) == -1
						&& (is[-1 + i_21_][i_22_ + 1] & 0x4e240000) == 0
						&& (0x42240000 & is[i_21_ - 1][i_22_]) == 0
						&& (0x48240000 & is[i_21_][i_22_ + 1]) == 0) {
					Class359.anIntArray3060[i_19_] = -1 + i_13_;
					Class75.anIntArray580[i_19_] = i_14_ - -1;
					PlayerUpdateMask.anIntArrayArray528[-1 + i_15_][1 + i_16_] = 6;
					i_19_ = 1 + i_19_ & 0xfff;
					Class339.anIntArrayArray2846[i_15_ + -1][i_16_ + 1] = i_23_;
				}
				if ((i_15_ ^ 0xffffffff) > -128
						&& (i_16_ ^ 0xffffffff) > -128
						&& (PlayerUpdateMask.anIntArrayArray528[i_15_ - -1][i_16_ + 1] ^ 0xffffffff) == -1
						&& (0x78240000 & is[i_21_ + 1][1 + i_22_]) == 0
						&& (0x60240000 & is[1 + i_21_][i_22_]) == 0
						&& (0x48240000 & is[i_21_][1 + i_22_]) == 0) {
					Class359.anIntArray3060[i_19_] = 1 + i_13_;
					Class75.anIntArray580[i_19_] = i_14_ + 1;
					PlayerUpdateMask.anIntArrayArray528[i_15_ - -1][i_16_ - -1] = 12;
					i_19_ = 0xfff & i_19_ + 1;
					Class339.anIntArrayArray2846[1 + i_15_][1 + i_16_] = i_23_;
				}
			}
			Class199.anInt1539 = i_13_;
			Class22.anInt217 = i_14_;
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wda.A(" + i + ','
					+ i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_
					+ ',' + (class243 != null ? "{...}" : "null") + ',' + i_9_
					+ ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	final String method1507(final boolean bool) {
		try {
			if (bool != true) {
				return null;
			}
			return aString5933;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wda.E(" + bool
					+ ')');
		}
	}

	@Override
	final void method1487(final int i) {
		do {
			try {
				if (i == -1128) {
					break;
				}
				method1510(33);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "wda.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final int method1508(final int i, final int i_24_,
			final String string) {
		try {
			if (i != 1) {
				aStringArray5932 = null;
			}
			return PlayerUpdate.method2859(i_24_, true, string, i ^ ~0x55d2);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wda.K(" + i + ','
					+ i_24_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	Class98_Sub43_Sub4(final OggStreamState oggstreamstate) {
		super(oggstreamstate);
	}

	final float method1509(final int i) {
		try {
			if (i != -6085) {
				return 2.7172983F;
			}
			return aFloat5935;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wda.F(" + i + ')');
		}
	}

	static final void method1510(final int i) {
		try {
			Class219.aClass77_1641.method773((byte) -30);
			if (i != 28837) {
				anInt5938 = -111;
			}
			Class2.aClass299_73.method3515(-119);
			Class315.aClient3529.method87(i + -28837);
			Class42_Sub3.aCanvas5361.setBackground(Color.black);
			Class325.anInt2729 = -1;
			Class219.aClass77_1641 = Class368.method3950((byte) 10,
					Class42_Sub3.aCanvas5361);
			Class2.aClass299_73 = Class151_Sub3.method2457(
					Class42_Sub3.aCanvas5361, true, -16777216);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wda.I(" + i + ')');
		}
	}

	final float method1511(final int i) {
		try {
			if (i >= -38) {
				aShort5934 = (short) 29;
			}
			return aFloat5939;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wda.H(" + i + ')');
		}
	}
}
