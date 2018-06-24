/* Class185 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class185 {
	short[] aShortArray1444;
	static Class246_Sub4_Sub2_Sub1[] aClass246_Sub4_Sub2_Sub1Array1445;
	int[] anIntArray1446;
	short[] aShortArray1447;
	long aLong1448;

	static final Class98_Sub46_Sub17 method2628(int i, int i_0_, int i_1_) {
		try {
			Class98_Sub46_Sub17 class98_sub46_sub17 = ((Class98_Sub46_Sub17) Class76_Sub4.aClass377_3738
					.method3990((long) i_1_ << 1046340512 | (long) i, -1));
			if (i_0_ >= -17)
				aClass246_Sub4_Sub2_Sub1Array1445 = null;
			if (class98_sub46_sub17 == null) {
				class98_sub46_sub17 = new Class98_Sub46_Sub17(i_1_, i);
				Class76_Sub4.aClass377_3738.method3996(class98_sub46_sub17,
						(((Node) class98_sub46_sub17).aLong832), -1);
			}
			return class98_sub46_sub17;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mg.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2629(byte i) {
		try {
			if ((Class98_Sub10_Sub6.anInt5569 ^ 0xffffffff) < -2) {
				Class98_Sub36.anInt4161 = Class24.anInt242;
				Class98_Sub10_Sub6.anInt5569--;
			}
			if (Class76_Sub9.aBoolean3788) {
				Class76_Sub9.aBoolean3788 = false;
				Canvas_Sub1.method118((byte) 104);
			} else {
				if (!Player.aBoolean6540)
					Class46.method435((byte) 85);
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -101; i_2_++) {
					if (!Class98_Sub10_Sub24.method1076(i + -58))
						break;
				}
				if (Class177.anInt1376 == 10) {
					while (Class92.method893(118)) {
						Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(i + 313,
										(Class98_Sub10_Sub7.aClass171_5571),
										(Class331.aClass117_2811));
						((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
								.method1194(0, i + 138);
						int i_3_ = (((ByteBuffer) (((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865)).position);
						Class361.method3919(
								(byte) -61,
								(((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865));
						((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
								.method1211(
										(byte) 91,
										-i_3_
												+ ((ByteBuffer) (((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865)).position);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if (Class284.aClass98_Sub4_2167 != null) {
						if ((((Class98_Sub4) Class284.aClass98_Sub4_2167).anInt3827) != -1) {
							Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260,
											Class98_Sub10_Sub22.aClass171_5652,
											Class331.aClass117_2811));
							((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
									.writeShort(
											(((Class98_Sub4) Class284.aClass98_Sub4_2167).anInt3827),
											1571862888);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class284.aClass98_Sub4_2167 = null;
							Class11.aLong121 = 30000L + Class343
									.method3819(-47);
						}
					} else if ((Class343.method3819(i ^ 0x1a) ^ 0xffffffffffffffffL) <= (Class11.aLong121 ^ 0xffffffffffffffffL))
						Class284.aClass98_Sub4_2167 = (Class48_Sub2_Sub1.aClass265_5531
								.method3229(
										i ^ ~0xb,
										((Class354) (Class98_Sub46_Sub10.aClass354_6011)).aString3016));
					Class98_Sub17 class98_sub17 = ((Class98_Sub17) Class167.aClass148_1284
							.method2418(32));
					if (class98_sub17 != null
							|| (-2000L + Class343.method3819(-47) > Class113.aLong954)) {
						// mysticflow
						// Class98_Sub11 class98_sub11 = null;
						// int i_4_ = 0;
						// for (Class98_Sub17 class98_sub17_5_ = (Class98_Sub17)
						// Class64_Sub21.aClass148_3703
						// .method2418(32); class98_sub17_5_ != null;
						// class98_sub17_5_ = (Class98_Sub17)
						// Class64_Sub21.aClass148_3703
						// .method2417(107)) {
						// if (class98_sub11 != null
						// && ((((ByteBuffer) (((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865)).anInt3991 -
						// i_4_) ^ 0xffffffff) <= -241)
						// break;
						// class98_sub17_5_.method942(126);
						// int i_6_ = class98_sub17_5_.method1151(48);
						// if (i_6_ < -1)
						// i_6_ = -1;
						// else if (i_6_ > 65534)
						// i_6_ = 65534;
						// int i_7_ = class98_sub17_5_.method1155(123);
						// if ((i_7_ ^ 0xffffffff) > 0)
						// i_7_ = -1;
						// else if (i_7_ > 65534)
						// i_7_ = 65534;
						// if (i_7_ != Class118.anInt980
						// || ((Class115.anInt960 ^ 0xffffffff) != (i_6_ ^
						// 0xffffffff))) {
						// if (class98_sub11 == null) {
						// class98_sub11 = (Class246_Sub3_Sub4
						// .method3023(260,
						// Class341.aClass171_2853,
						// Class331.aClass117_2811));
						// ((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865
						// .method1194(0, i ^ 0x4f);
						// i_4_ = (((ByteBuffer) (((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865)).anInt3991);
						// }
						// int i_8_ = -Class118.anInt980 + i_7_;
						// Class118.anInt980 = i_7_;
						// int i_9_ = -Class115.anInt960 + i_6_;
						// Class115.anInt960 = i_6_;
						// int i_10_ = (int) ((class98_sub17_5_
						// .method1154(true) - Class113.aLong954) / 20L);
						// if (i_10_ >= 8 || i_8_ < -32
						// || (i_8_ ^ 0xffffffff) < -32
						// || (i_9_ ^ 0xffffffff) > 31
						// || (i_9_ ^ 0xffffffff) < -32) {
						// if ((i_10_ ^ 0xffffffff) <= -33
						// || (i_8_ ^ 0xffffffff) > 127
						// || (i_8_ ^ 0xffffffff) < -128
						// || i_9_ < -128 || i_9_ > 127) {
						// if (i_10_ >= 32) {
						// ((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865
						// .writeShort(i_10_ + 57344,
						// 1571862888);
						// if (i_7_ == 1 || i_6_ == -1)
						// ((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865
						// .writeInt(1571862888,
						// -2147483648);
						// else
						// ((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865
						// .writeInt(
						// 1571862888,
						// (i_7_ | i_6_ << 1539798800));
						// } else {
						// ((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865
						// .method1194(192 + i_10_, 85);
						// if ((i_7_ ^ 0xffffffff) == -2
						// || i_6_ == -1)
						// ((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865
						// .writeInt(1571862888,
						// -2147483648);
						// else
						// ((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865
						// .writeInt(
						// i ^ ~0x5db0b95c,
						// (i_7_ | i_6_ << -422182576));
						// }
						// } else {
						// i_8_ += 128;
						// ((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865
						// .method1194(128 + i_10_, -98);
						// i_9_ += 128;
						// ((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865
						// .writeShort(i_9_
						// + (i_8_ << 1431182856),
						// 1571862888);
						// }
						// } else {
						// i_8_ += 32;
						// i_9_ += 32;
						// ((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865
						// .writeShort(
						// (i_9_
						// + (i_10_ << 1379774828) - -(i_8_ << -540290298)),
						// 1571862888);
						// }
						// Class113.aLong954 = class98_sub17_5_
						// .method1154(true);
						// }
						// }
						// if (class98_sub11 != null) {
						// ((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865
						// .method1211(
						// (byte) 123,
						// -i_4_
						// + (((ByteBuffer) (((Class98_Sub11)
						// class98_sub11).aClass98_Sub22_Sub1_3865)).anInt3991));
						// Class98_Sub10_Sub29
						// .sendPacket(false, class98_sub11);
						// }
					}
					if (class98_sub17 != null) {
						long l = ((class98_sub17.method1154(true) - Class98_Sub36.aLong4159) / 50L);
						Class98_Sub36.aLong4159 = class98_sub17
								.method1154(true);
						if (l > 32767L)
							l = 32767L;
						int i_11_ = class98_sub17.method1151(89);
						if ((i_11_ ^ 0xffffffff) > -1)
							i_11_ = 0;
						else if ((i_11_ ^ 0xffffffff) < -65536)
							i_11_ = 65535;
						int i_12_ = class98_sub17.method1155(122);
						if (i_12_ >= 0) {
							if (i_12_ > 65535)
								i_12_ = 65535;
						} else
							i_12_ = 0;
						int i_13_ = 0;
						if (class98_sub17.method1156(-5) == 2)
							i_13_ = 1;
						int i_14_ = (int) l;
						Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(260,
										(Class287_Sub2.aClass171_3270),
										(Class331.aClass117_2811));
						((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
								.writeShort(i_13_ << 391207055 | i_14_,
										i + 1571862941);
						((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
								.writeInt(i + 1571862941, i_12_
										| i_11_ << -1879594384);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if ((Class98_Sub46_Sub1.anInt5949 ^ 0xffffffff) < -1) {
						Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(260,
										(Class98_Sub32.aClass171_4106),
										(Class331.aClass117_2811));
						((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
								.method1194(3 * Class98_Sub46_Sub1.anInt5949,
										78);
						for (int i_15_ = 0; ((Class98_Sub46_Sub1.anInt5949 ^ 0xffffffff) < (i_15_ ^ 0xffffffff)); i_15_++) {
							Interface7 interface7 = Class339.anInterface7Array2845[i_15_];
							long l = ((interface7.method18(-121) - Class292.aLong3356) / 50L);
							Class292.aLong3356 = interface7.method18(-84);
							if ((l ^ 0xffffffffffffffffL) < -65536L)
								l = 65535L;
							((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
									.method1194(interface7.method17(true), 89);
							((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
									.writeShort((int) l, i + 1571862941);
						}
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if ((Class42_Sub1_Sub1.anInt6210 ^ 0xffffffff) < -1)
						Class42_Sub1_Sub1.anInt6210--;
					if (Class64_Sub6.aBoolean3656
							&& (Class42_Sub1_Sub1.anInt6210 ^ 0xffffffff) >= -1) {
						Class64_Sub6.aBoolean3656 = false;
						Class42_Sub1_Sub1.anInt6210 = 20;
						Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(i + 313,
										(Class246_Sub7.aClass171_5115),
										(Class331.aClass117_2811));
						((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
								.writeLEShort(
										(int) Class119_Sub4.aFloat4740 >> -52235901,
										17624);
						((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
								.writeShort(
										(int) Class98_Sub22_Sub2.aFloat5794 >> -449746077,
										i + 1571862941);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if (Class4.aBoolean84 == !Class101.aBoolean856) {
						Class101.aBoolean856 = Class4.aBoolean84;
						Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(260, (Class230.aClass171_1727),
										(Class331.aClass117_2811));
						((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
								.method1194(!Class4.aBoolean84 ? 0 : 1, -93);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
					if (!s_Sub1.aBoolean5207) {
						Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(i + 313,
										(Class246_Sub1.aClass171_5068),
										(Class331.aClass117_2811));
						((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
								.method1194(0, i + -27);
						int i_16_ = (((ByteBuffer) (((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865)).position);
						ByteBuffer class98_sub22 = Class98_Sub9.aClass98_Sub27_3856
								.method1288(true);
						((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
								.method1217(
										((ByteBuffer) class98_sub22).incomingBytes,
										((ByteBuffer) class98_sub22).position,
										-1, 0);
						((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
								.method1211(
										(byte) 107,
										(((ByteBuffer) (((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865)).position)
												- i_16_);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
						s_Sub1.aBoolean5207 = true;
					}
					if (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948 != null) {
						if ((Class98_Sub46_Sub20_Sub2.anInt6319 ^ 0xffffffff) == -3)
							Class98_Sub46_Sub3.method1541(73);
						else if ((Class98_Sub46_Sub20_Sub2.anInt6319 ^ 0xffffffff) == -4)
							AnimationDefParser.method2620(0);
					}
					if (Class4.aBoolean79)
						Class4.aBoolean79 = false;
					else
						Class180.aFloat3405 /= 2.0F;
					if (i != -53)
						aClass246_Sub4_Sub2_Sub1Array1445 = null;
					if (PacketSender.aBoolean2575)
						PacketSender.aBoolean2575 = false;
					else
						Class305.aFloat2545 /= 2.0F;
					NPC.method2294(0);
					if ((Class177.anInt1376 ^ 0xffffffff) == -11) {
						Class329.method3708(-1);
						Class269.method3273(true);
						Class246_Sub3_Sub2.method3003(i ^ 0x54bc);
						Class224_Sub1.anInt5031++;
						if (Class224_Sub1.anInt5031 > 750)
							Canvas_Sub1.method118((byte) 104);
						else {
							Class50.method485(37);
							Class216.method2794((byte) -85);
							Class76_Sub10.method770(-256);
							for (int i_17_ = Class75.aClass140_584.method2290(
									-115, true); i_17_ != -1; i_17_ = Class75.aClass140_584
									.method2290(-87, false)) {
								Class349.method3838(i_17_, 1864);
								Class111_Sub1.anIntArray4682[Class202
										.method2702(31, Class239.anInt1844++)] = i_17_;
							}
							for (Class98_Sub46_Sub17 class98_sub46_sub17 = Class98_Sub31_Sub4
									.method1384(i ^ 0x4b); class98_sub46_sub17 != null; class98_sub46_sub17 = Class98_Sub31_Sub4
									.method1384(-46)) {
								int i_18_ = class98_sub46_sub17
										.method1625((byte) -108);
								int i_19_ = class98_sub46_sub17
										.method1623(-101);
								if (i_18_ == 1) {
									Class76_Sub5.anIntArray3744[i_19_] = ((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054;
									Class66.aBoolean507 |= Class140.aBooleanArray3246[i_19_];
									Class98_Sub45.anIntArray4257[Class202
											.method2702(
													Class246_Sub4_Sub2.anInt6181++,
													31)] = i_19_;
								} else if (i_18_ != 2) {
									if ((i_18_ ^ 0xffffffff) != -4) {
										if (i_18_ == 4) {
											Class293 class293 = Class159
													.method2509(i_19_, -9820);
											int i_20_ = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054);
											int i_21_ = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6051);
											int i_22_ = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6053);
											if ((((Class293) class293).anInt2233) != i_20_
													|| ((i_21_ ^ 0xffffffff) != ((((Class293) class293).anInt2343) ^ 0xffffffff))
													|| (i_22_ != (((Class293) class293).anInt2210))) {
												((Class293) class293).anInt2233 = i_20_;
												((Class293) class293).anInt2343 = i_21_;
												((Class293) class293).anInt2210 = i_22_;
												Class341.method3812(class293);
											}
										} else if ((i_18_ ^ 0xffffffff) != -6) {
											if ((i_18_ ^ 0xffffffff) != -7) {
												if ((i_18_ ^ 0xffffffff) != -8) {
													if (i_18_ == 8) {
														Class293 class293 = (Class159
																.method2509(
																		i_19_,
																		i
																				+ -9767));
														if (((((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054) != (((Class293) class293).anInt2310))
																|| (((((Class293) class293).anInt2218) ^ 0xffffffff) != ((((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6051) ^ 0xffffffff))
																|| ((((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6053) != (((Class293) class293).anInt2251))) {
															((Class293) class293).anInt2310 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054);
															((Class293) class293).anInt2251 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6053);
															((Class293) class293).anInt2218 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6051);
															if ((((Class293) class293).anInt2302) != -1) {
																if ((((Class293) class293).anInt2232) <= 0) {
																	if ((((Class293) class293).anInt2235) > 0)
																		((Class293) class293).anInt2251 = 32
																				* ((Class293) class293).anInt2251
																				/ ((Class293) class293).anInt2235;
																} else
																	((Class293) class293).anInt2251 = (32 * ((Class293) class293).anInt2251 / ((Class293) class293).anInt2232);
															}
															Class341.method3812(class293);
														}
													} else if ((i_18_ ^ 0xffffffff) != -10) {
														if ((i_18_ ^ 0xffffffff) != -11) {
															if (i_18_ == 11) {
																Class293 class293 = (Class159
																		.method2509(
																				i_19_,
																				-9820));
																((Class293) class293).aByte2245 = (byte) 0;
																((Class293) class293).aByte2240 = (byte) 0;
																((Class293) class293).anInt2347 = ((Class293) class293).anInt2283 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054);
																((Class293) class293).anInt2299 = ((Class293) class293).anInt2229 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6051);
																Class341.method3812(class293);
															} else if (i_18_ != 12) {
																if ((i_18_ ^ 0xffffffff) == -15) {
																	Class293 class293 = (Class159
																			.method2509(
																					i_19_,
																					i ^ 0x266f));
																	((Class293) class293).anInt2237 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054);
																} else if ((i_18_ ^ 0xffffffff) != -16) {
																	if (i_18_ != 16) {
																		if (i_18_ == 17) {
																			Class293 class293 = Class159
																					.method2509(
																							i_19_,
																							-9820);
																			((Class293) class293).anInt2211 = ((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054;
																		}
																	} else {
																		Class293 class293 = Class159
																				.method2509(
																						i_19_,
																						-9820);
																		((Class293) class293).anInt2264 = ((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054;
																	}
																} else {
																	Class269.anInt2024 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054);
																	Class246_Sub3_Sub1_Sub2.anInt6251 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6051);
																	Class365.aBoolean3110 = true;
																}
															} else {
																Class293 class293 = (Class159
																		.method2509(
																				i_19_,
																				-9820));
																int i_23_ = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054);
																if ((class293 != null)
																		&& (((((Class293) class293).anInt2354) ^ 0xffffffff) == -1)) {
																	if ((-(((Class293) class293).anInt2258) + ((Class293) class293).anInt2228) < i_23_)
																		i_23_ = ((Class293) class293).anInt2228
																				+ -((Class293) class293).anInt2258;
																	if ((i_23_ ^ 0xffffffff) > -1)
																		i_23_ = 0;
																	if ((i_23_ ^ 0xffffffff) != (((Class293) class293).anInt2213 ^ 0xffffffff)) {
																		((Class293) class293).anInt2213 = i_23_;
																		Class341.method3812(class293);
																	}
																}
															}
														} else {
															Class293 class293 = (Class159
																	.method2509(
																			i_19_,
																			-9820));
															if ((((((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054) ^ 0xffffffff) != ((((Class293) class293).anInt2268) ^ 0xffffffff))
																	|| ((((Class293) class293).anInt2273) != (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6051))
																	|| (((((Class293) class293).anInt2346) ^ 0xffffffff) != ((((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6053) ^ 0xffffffff))) {
																((Class293) class293).anInt2346 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6053);
																((Class293) class293).anInt2268 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054);
																((Class293) class293).anInt2273 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6051);
																Class341.method3812(class293);
															}
														}
													} else {
														Class293 class293 = (Class159
																.method2509(
																		i_19_,
																		-9820));
														if ((((((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054) ^ 0xffffffff) != ((((Class293) class293).anInt2302) ^ 0xffffffff))
																|| (((((Class293) class293).anInt2349) ^ 0xffffffff) != ((((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6051) ^ 0xffffffff))) {
															((Class293) class293).anInt2349 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6051);
															((Class293) class293).anInt2302 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054);
															Class341.method3812(class293);
														}
													}
												} else {
													Class293 class293 = (Class159
															.method2509(i_19_,
																	i ^ 0x266f));
													boolean bool = ((((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054) ^ 0xffffffff) == -2;
													if (!(((Class293) class293).aBoolean2295) != !bool) {
														((Class293) class293).aBoolean2295 = bool;
														Class341.method3812(class293);
													}
												}
											} else {
												int i_24_ = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054);
												int i_25_ = ((0x7d21 & i_24_) >> -1879977206);
												int i_26_ = (i_24_ >> 504954597 & 0x1f);
												int i_27_ = 0x1f & i_24_;
												int i_28_ = ((i_26_ << -116011253)
														+ (i_25_ << 1244792819) + (i_27_ << -1908460573));
												Class293 class293 = (Class159
														.method2509(i_19_,
																-9820));
												if ((i_28_ ^ 0xffffffff) != ((((Class293) class293).anInt2236) ^ 0xffffffff)) {
													((Class293) class293).anInt2236 = i_28_;
													Class341.method3812(class293);
												}
											}
										} else {
											Class293 class293 = Class159
													.method2509(i_19_, -9820);
											if (((((Class293) class293).anInt2208) != (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054))
													|| ((((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054) ^ 0xffffffff) == 0) {
												((Class293) class293).anInt2208 = (((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054);
												((Class293) class293).anInt2303 = 0;
												((Class293) class293).anInt2312 = 0;
												((Class293) class293).anInt2287 = 1;
												AnimationDefinition class97 = (((((Class293) class293).anInt2208) ^ 0xffffffff) != 0 ? (Class151_Sub7.aClass183_5001
														.method2623(
																(((Class293) class293).anInt2208),
																i + 16436))
														: null);
												if (class97 != null)
													Class280.method3327(
															(((Class293) class293).anInt2303),
															class97, (byte) 118);
												Class341.method3812(class293);
											}
										}
									} else {
										Class293 class293 = Class159
												.method2509(i_19_, i + -9767);
										if (!((Class98_Sub46_Sub17) class98_sub46_sub17).aString6052
												.equals(((Class293) class293).aString2225)) {
											((Class293) class293).aString2225 = (((Class98_Sub46_Sub17) class98_sub46_sub17).aString6052);
											Class341.method3812(class293);
										}
									}
								} else {
									Class151_Sub1.aStringArray4967[i_19_] = ((Class98_Sub46_Sub17) class98_sub46_sub17).aString6052;
									Class148.anIntArray1196[Class202
											.method2702(31, Class96.anInt803++)] = i_19_;
								}
							}
							Class279.anInt2099++;
							if ((Class55.anInt440 ^ 0xffffffff) != -1) {
								Class98_Sub10_Sub32.anInt5720 += 20;
								if ((Class98_Sub10_Sub32.anInt5720 ^ 0xffffffff) <= -401)
									Class55.anInt440 = 0;
							}
							if (Class77.aClass293_593 != null) {
								Class42_Sub3.anInt5365++;
								if ((Class42_Sub3.anInt5365 ^ 0xffffffff) <= -16) {
									Class341.method3812(Class77.aClass293_593);
									Class77.aClass293_593 = null;
								}
							}
							Class162.aClass293_1272 = null;
							Class239.aBoolean1840 = false;
							Class11.aClass293_120 = null;
							Class166.aBoolean1278 = false;
							Class98_Sub1.method946(-1, -123, -1, null);
							Class304.method3563(-1, null, -1, i ^ ~0x8);
							if (!Class98_Sub10_Sub9.aBoolean5585)
								Class21_Sub2.anInt5387 = -1;
							Class3.method172(98);
							Class24.anInt242++;
							if (Class102.aBoolean889) {
								Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
										.method3023(
												260,
												Class98_Sub43_Sub2.aClass171_5906,
												Class331.aClass117_2811));
								((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
										.method1232(
												(Class375.anInt3169 | (Class122.anInt1009 << 514171598 | Class333.anInt3385 << -509241764)),
												(byte) 106);
								Class98_Sub10_Sub29.sendPacket(false,
										class98_sub11);
								Class102.aBoolean889 = false;
							}
							for (;;) {
								Class98_Sub21 class98_sub21 = ((Class98_Sub21) Class181.aClass148_1430
										.method2421(i ^ ~0x196a));
								if (class98_sub21 == null)
									break;
								Class293 class293 = (((Class98_Sub21) class98_sub21).aClass293_3986);
								if ((((Class293) class293).anInt2300 ^ 0xffffffff) <= -1) {
									Class293 class293_29_ = Class159
											.method2509(
													(((Class293) class293).anInt2234),
													i ^ 0x266f);
									if (class293_29_ == null
											|| (((Class293) class293_29_).aClass293Array2339) == null
											|| ((((Class293) class293).anInt2300 ^ 0xffffffff) <= ((((Class293) class293_29_).aClass293Array2339).length ^ 0xffffffff))
											|| ((((Class293) class293_29_).aClass293Array2339[((Class293) class293).anInt2300]) != class293))
										continue;
								}
								ClientScriptsDefs.method3144(class98_sub21);
							}
							for (;;) {
								Class98_Sub21 class98_sub21 = ((Class98_Sub21) Class98_Sub46_Sub10.aClass148_6018
										.method2421(i ^ ~0x196a));
								if (class98_sub21 == null)
									break;
								Class293 class293 = (((Class98_Sub21) class98_sub21).aClass293_3986);
								if ((((Class293) class293).anInt2300 ^ 0xffffffff) <= -1) {
									Class293 class293_30_ = Class159
											.method2509(
													(((Class293) class293).anInt2234),
													-9820);
									if (class293_30_ == null
											|| (((Class293) class293_30_).aClass293Array2339) == null
											|| (((Class293) class293).anInt2300 >= (((Class293) class293_30_).aClass293Array2339).length)
											|| ((((Class293) class293_30_).aClass293Array2339[((Class293) class293).anInt2300]) != class293))
										continue;
								}
								ClientScriptsDefs.method3144(class98_sub21);
							}
							for (;;) {
								Class98_Sub21 class98_sub21 = ((Class98_Sub21) Class151_Sub3.aClass148_4977
										.method2421(6494));
								if (class98_sub21 == null)
									break;
								Class293 class293 = (((Class98_Sub21) class98_sub21).aClass293_3986);
								if (((Class293) class293).anInt2300 >= 0) {
									Class293 class293_31_ = Class159
											.method2509(
													(((Class293) class293).anInt2234),
													-9820);
									if (class293_31_ == null
											|| (((Class293) class293_31_).aClass293Array2339) == null
											|| (((((Class293) class293_31_).aClass293Array2339).length ^ 0xffffffff) >= (((Class293) class293).anInt2300 ^ 0xffffffff))
											|| (class293 != (((Class293) class293_31_).aClass293Array2339[(((Class293) class293).anInt2300)])))
										continue;
								}
								ClientScriptsDefs.method3144(class98_sub21);
							}
							if (Class11.aClass293_120 == null)
								Class156_Sub2.anInt3423 = 0;
							if (Class255.aClass293_3208 != null)
								Class111_Sub3.method2118(19653);
							if (Class282.anInt2125 > 0
									&& Class219.aClass77_1641.method779(82,
											5503)
									&& Class219.aClass77_1641.method779(81,
											5503)
									&& (Class319.anInt2699 ^ 0xffffffff) != -1) {
								int i_32_ = ((((Class246_Sub3) (Surface.player)).aByte5088) - Class319.anInt2699);
								if (i_32_ >= 0) {
									if (i_32_ > 3)
										i_32_ = 3;
								} else
									i_32_ = 0;
								Class351.method3846(
										(((Entity) (Surface.player)).anIntArray6438[0])
												+ aa_Sub2.anInt3562,
										(Class272.anInt2038 + (((Entity) (Surface.player)).anIntArray6437[0])),
										i_32_, 52);
							}
							Class204.method2709((byte) 49);
							for (int i_33_ = 0; i_33_ < 5; i_33_++)
								Class212.anIntArray1597[i_33_]++;
							if (Class66.aBoolean507
									&& ((r_Sub1.aLong6322 ^ 0xffffffffffffffffL) > (-60000L
											+ Class343.method3819(-47) ^ 0xffffffffffffffffL)))
								Class23.method283((byte) 118);
							for (Class246_Sub4_Sub1 class246_sub4_sub1 = ((Class246_Sub4_Sub1) Class119.aClass218_986
									.method2803((byte) 15)); class246_sub4_sub1 != null; class246_sub4_sub1 = ((Class246_Sub4_Sub1) Class119.aClass218_986
									.method2809(false))) {
								if (((-5L + Class343.method3819(i ^ 0x1a) / 1000L) ^ 0xffffffffffffffffL) < ((long) ((Class246_Sub4_Sub1) class246_sub4_sub1).anInt6172 ^ 0xffffffffffffffffL)) {
									if (((Class246_Sub4_Sub1) class246_sub4_sub1).aShort6167 > 0)
										Class98_Sub45
												.method1521(
														(byte) 125,
														5,
														(((Class246_Sub4_Sub1) class246_sub4_sub1).aString6168 + (Class309.aClass309_2605
																.method3615(
																		Class374.anInt3159,
																		(byte) 25))),
														0, "", "", "");
									if ((((Class246_Sub4_Sub1) class246_sub4_sub1).aShort6167 ^ 0xffffffff) == -1)
										Class98_Sub45
												.method1521(
														(byte) -120,
														5,
														(((Class246_Sub4_Sub1) class246_sub4_sub1).aString6168 + (Class309.aClass309_2606
																.method3615(
																		Class374.anInt3159,
																		(byte) 25))),
														0, "", "", "");
									class246_sub4_sub1.method2965((byte) 126);
								}
							}
							Class134_Sub1.anInt5459++;
							if (Class134_Sub1.anInt5459 > 500) {
								Class134_Sub1.anInt5459 = 0;
								int i_34_ = (int) (Math.random() * 8.0);
								if ((i_34_ & 0x1) == 1)
									Class304.anInt2533 += Class197.anInt1520;
								if ((i_34_ & 0x2) == 2)
									Class98_Sub17.anInt3943 += Class93_Sub1.anInt5488;
								if ((i_34_ & 0x4) == 4)
									Class98_Sub10_Sub9.anInt5581 += Class98_Sub46_Sub4.anInt5961;
							}
							if (Class304.anInt2533 < -50)
								Class197.anInt1520 = 2;
							if (Class304.anInt2533 > 50)
								Class197.anInt1520 = -2;
							if ((Class98_Sub17.anInt3943 ^ 0xffffffff) > 54)
								Class93_Sub1.anInt5488 = 2;
							if (Class98_Sub10_Sub9.anInt5581 < -40)
								Class98_Sub46_Sub4.anInt5961 = 1;
							if (Class98_Sub17.anInt3943 > 55)
								Class93_Sub1.anInt5488 = -2;
							Class278_Sub1.anInt5170++;
							if ((Class98_Sub10_Sub9.anInt5581 ^ 0xffffffff) < -41)
								Class98_Sub46_Sub4.anInt5961 = -1;
							if (Class278_Sub1.anInt5170 > 500) {
								Class278_Sub1.anInt5170 = 0;
								int i_35_ = (int) (8.0 * Math.random());
								if ((0x2 & i_35_ ^ 0xffffffff) == -3)
									Class151.anInt1213 += Class76_Sub9.anInt3786;
								if ((0x1 & i_35_) == 1)
									Class204.anInt1553 += Class169.anInt1305;
							}
							if ((Class204.anInt1553 ^ 0xffffffff) > 59)
								Class169.anInt1305 = 2;
							if (Class151.anInt1213 < -20)
								Class76_Sub9.anInt3786 = 1;
							if (Class204.anInt1553 > 60)
								Class169.anInt1305 = -2;
							Class196.anInt1511++;
							if (Class151.anInt1213 > 10)
								Class76_Sub9.anInt3786 = -1;
							if (Class196.anInt1511 > 50) {
								Class76_Sub5.anInt3746++;
								Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
										.method3023(260,
												Class98_Sub40.aClass171_4193,
												Class331.aClass117_2811));
								Class98_Sub10_Sub29.sendPacket(false,
										class98_sub11);
							}
							if (Class76_Sub8.aBoolean3771) {
								Class213.method2781(i ^ ~0x3c);
								Class76_Sub8.aBoolean3771 = false;
							}
							try {
								Class95.method920((byte) 115);
							} catch (java.io.IOException ioexception) {
								Canvas_Sub1.method118((byte) 104);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mg.D(" + i + ')');
		}
	}

	static final void method2630(int i, int i_36_, int i_37_, int i_38_) {
		try {
			if (i_36_ <= -102) {
				Class28 class28 = Class76.aClass28ArrayArray586[i_37_][i];
				Class21_Sub3.method275(false, i_38_,
						(class28 == null ? Class91.aClass28_722 : class28));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mg.C(" + i + ','
					+ i_36_ + ',' + i_37_ + ',' + i_38_ + ')'));
		}
	}

	static final void method2631(int i, int i_39_) {
		try {
			Class98_Sub46_Sub17 class98_sub46_sub17 = method2628(i_39_, -29, i);
			class98_sub46_sub17.method1621(0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mg.E(" + i + ','
					+ i_39_ + ')');
		}
	}

	Class185(long l, int[] is, short[] is_40_, short[] is_41_) {
		try {
			((Class185) this).aShortArray1444 = is_41_;
			((Class185) this).aLong1448 = l;
			((Class185) this).anIntArray1446 = is;
			((Class185) this).aShortArray1447 = is_40_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mg.<init>(" + l
					+ ',' + (is != null ? "{...}" : "null") + ','
					+ (is_40_ != null ? "{...}" : "null") + ','
					+ (is_41_ != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2632(byte i) {
		do {
			try {
				aClass246_Sub4_Sub2_Sub1Array1445 = null;
				if (i <= -6)
					break;
				method2630(14, 22, 64, 106);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "mg.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	protected Class185() {
		/* empty */
	}
}
