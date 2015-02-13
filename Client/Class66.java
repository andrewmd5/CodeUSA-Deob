/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class66 {
	int anInt505;
	int anInt506;
	static boolean aBoolean507 = false;
	int anInt508;
	int anInt509;
	private int anInt510;
	int anInt511;
	int anInt512;
	int anInt513 = 0;
	int anInt514;
	int anInt515 = 0;
	long aLong516;
	int anInt517;
	int anInt518;
	private boolean aBoolean519 = false;

	final void method682(final ByteBuffer class98_sub22, final int i) {
		do {
			try {
				for (;;) {
					final int i_0_ = class98_sub22.readUnsignedByte((byte) 96);
					if ((i_0_ ^ 0xffffffff) == -1) {
						break;
					}
					method686(i_0_, class98_sub22, (byte) -126);
				}
				if (i == 17127) {
					break;
				}
				method686(-122, null, (byte) -5);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("ega.B(" + (class98_sub22 != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final int method683(final byte i, final int i_1_, final int i_2_) {
		try {
			if ((Class64_Sub10.anInt3666 ^ 0xffffffff) == 0) {
				return 1;
			}
			if ((Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
					.method583((byte) 122) ^ 0xffffffff) != (i_2_ ^ 0xffffffff)) {
				Class151_Sub9.method2472(true, Class309.aClass309_2599
						.method3615(Class374.anInt3159, (byte) 25), i_2_, true);
				if ((i_2_ ^ 0xffffffff) != (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
						.method583((byte) 126) ^ 0xffffffff)) {
					return -1;
				}
			}
			try {
				Class42_Sub3.aCanvas5361.getSize();
				if (i > -77) {
					method683((byte) -124, -85, 24);
				}
				Class246_Sub2.method2972(-117,
						Class98_Sub46_Sub10.aClass197_6019,
						Class195.aClass43_1499, true, Class265.aHa1974,
						Class309.aClass309_2599.method3615(Class374.anInt3159,
								(byte) 25));
				final Model model = Class98_Sub6.method981(0, -9252,
						Class76_Sub9.aClass207_3787, Class64_Sub10.anInt3666);
				final long l = Class343.method3819(-47);
				Class265.aHa1974.la();
				Class266.aClass111_1986.method2100(0, Class207.anInt1577, 0);
				Class265.aHa1974.a(Class266.aClass111_1986);
				// Class265.aHa1974.DA(dimension.width / 2, dimension.height /
				// 2,
				// 512, 512);
				Class265.aHa1974.xa(1.0F);
				Class265.aHa1974.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
				final Class146 class146 = Class265.aHa1974.method1790(model,
						2048, 64, 64, 768);
				int i_3_ = 0;
				while_77_: for (int i_4_ = 0; i_4_ < 500; i_4_++) {
					Class265.aHa1974.GA(0);
					Class265.aHa1974.ya();
					for (int i_5_ = 15; i_5_ >= 0; i_5_--) {
						for (int i_6_ = 0; i_5_ >= i_6_; i_6_++) {
							Class76_Sub5.aClass111_3745
									.method2100(
											(int) ((i_6_ - i_5_ / 2.0F) * r_Sub2.anInt6333),
											0, (1 + i_5_) * r_Sub2.anInt6333);
							class146.method2325(Class76_Sub5.aClass111_3745,
									null, 0);
							i_3_++;
							if ((i_1_ ^ 0xffffffffffffffffL) >= (-l
									+ Class343.method3819(-47) ^ 0xffffffffffffffffL)) {
								break while_77_;
							}
						}
					}
				}
				Class265.aHa1974.method1825();
				final long l_7_ = i_3_ * 1000 / (-l + Class343.method3819(-47));
				Class265.aHa1974.GA(0);
				Class265.aHa1974.ya();
				return (int) l_7_;
			} catch (final Throwable throwable) {
				throwable.printStackTrace();
				return -1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ega.E(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method684(final int i, final String string,
			final boolean bool) {
		try {
			if (string != null) {
				if (Class248.anInt1897 >= 100) {
					za_Sub2.method1684(Class309.aClass309_2625.method3615(
							Class374.anInt3159, (byte) 25), 4, (byte) -40);
				} else {
					final String string_8_ = Class353.method3867(-1, string);
					if (string_8_ != null) {
						for (int i_9_ = 0; i_9_ < Class248.anInt1897; i_9_++) {
							final String string_10_ = Class353
									.method3867(
											-1,
											(Class246_Sub4_Sub1.aStringArray6171[i_9_]));
							if (string_10_ != null
									&& string_10_.equals(string_8_)) {
								za_Sub2.method1684(
										(string + (Class309.aClass309_2626
												.method3615(Class374.anInt3159,
														(byte) 25))), 4,
										(byte) -66);
								return;
							}
							if (Class98_Sub45.aStringArray4255[i_9_] != null) {
								final String string_11_ = Class353.method3867(
										-1,
										(Class98_Sub45.aStringArray4255[i_9_]));
								if (string_11_ != null
										&& string_11_.equals(string_8_)) {
									za_Sub2.method1684(
											(string + (Class309.aClass309_2626
													.method3615(
															Class374.anInt3159,
															(byte) 25))), 4,
											(byte) -84);
									return;
								}
							}
						}
						for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class314.anInt2692 ^ 0xffffffff)); i_12_++) {
							final String string_13_ = Class353.method3867(-1,
									(Class98_Sub25.aStringArray4026[i_12_]));
							if (string_13_ != null
									&& string_13_.equals(string_8_)) {
								za_Sub2.method1684(
										((Class309.aClass309_2631.method3615(
												Class374.anInt3159, (byte) 25))
												+ string + (Class309.aClass309_2632
												.method3615(Class374.anInt3159,
														(byte) 25))), 4,
										(byte) 59);
								return;
							}
							if (Class315.aStringArray3527[i_12_] != null) {
								final String string_14_ = Class353.method3867(
										-1, (Class315.aStringArray3527[i_12_]));
								if (string_14_ != null
										&& string_14_.equals(string_8_)) {
									za_Sub2.method1684(
											((Class309.aClass309_2631
													.method3615(
															Class374.anInt3159,
															(byte) 25))
													+ string + (Class309.aClass309_2632
													.method3615(
															Class374.anInt3159,
															(byte) 25))), 4,
											(byte) -95);
									return;
								}
							}
						}
						if (Class353
								.method3867(
										-1,
										(Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aString6537))
								.equals(string_8_)) {
							za_Sub2.method1684(
									(Class309.aClass309_2628.method3615(
											Class374.anInt3159, (byte) 25)), 4,
									(byte) -66);
						} else {
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260,
											Class98_Sub8.aClass171_3264,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
									1 + r_Sub2.method1650(string, (byte) 90),
									91);
							class98_sub11.aClass98_Sub22_Sub1_3865.method1188(
									string, (byte) 113);
							class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
									bool ? 1 : 0, -89);
							if (i < -40) {
								Class98_Sub10_Sub29.sendPacket(false,
										class98_sub11);
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ega.C(" + i + ','
					+ (string != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final void method685(final int i) {
		do {
			try {
				anInt514 = (Class284_Sub2_Sub2.anIntArray6202[anInt510 << 1969546147]);
				final long l = anInt506;
				if (i != 1) {
					anInt509 = 44;
				}
				final long l_15_ = anInt511;
				final long l_16_ = anInt505;
				anInt517 = (int) Math.sqrt(l * l + l_15_ * l_15_ + l_16_
						* l_16_);
				if (anInt512 == 0) {
					anInt512 = 1;
				}
				if ((anInt518 ^ 0xffffffff) == -1) {
					aLong516 = 2147483647L;
				} else if ((anInt518 ^ 0xffffffff) == -2) {
					aLong516 = 8 * anInt517 / anInt512;
					aLong516 *= aLong516;
				} else if ((anInt518 ^ 0xffffffff) == -3) {
					aLong516 = 8 * anInt517 / anInt512;
				}
				if (!aBoolean519) {
					break;
				}
				anInt517 *= -1;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ega.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	private final void method686(final int i,
			final ByteBuffer class98_sub22, final byte i_17_) {
		do {
			try {
				if ((i ^ 0xffffffff) == -2) {
					anInt510 = class98_sub22.readUnsignedShort((byte) 127);
				} else if (i == 2) {
					class98_sub22.readUnsignedByte((byte) 2);
				} else if (i != 3) {
					if ((i ^ 0xffffffff) == -5) {
						anInt518 = class98_sub22.readUnsignedByte((byte) 90);
						anInt512 = class98_sub22.readInt(-2);
					} else if (i == 6) {
						anInt508 = class98_sub22.readUnsignedByte((byte) 58);
					} else if ((i ^ 0xffffffff) != -9) {
						if (i == 9) {
							anInt515 = 1;
						} else if ((i ^ 0xffffffff) == -11) {
							aBoolean519 = true;
						}
					} else {
						anInt513 = 1;
					}
				} else {
					anInt506 = class98_sub22.readInt(-2);
					anInt511 = class98_sub22.readInt(-2);
					anInt505 = class98_sub22.readInt(-2);
				}
				if (i_17_ <= -120) {
					break;
				}
				anInt518 = 31;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ega.D(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_17_ + ')'));
			}
			break;
		} while (false);
	}

	public Class66() {
		/* empty */
	}
}
