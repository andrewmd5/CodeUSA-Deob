import java.lang.reflect.Field;
import java.util.Arrays;

/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NPC {
	int anInt1090;
	int anInt1091;
	int anInt1092;
	boolean aBoolean1093;
	short aShort1094 = 0;
	int anInt1095;
	int anInt1096;
	int npcId;
	private Class377 aClass377_1098;
	int anInt1099;
	int anInt1100;
	int anInt1101;
	int anInt1102;
	byte aByte1103;
	private int anInt1104; // not size
	short[] aShortArray1105;
	boolean aBoolean1106;
	int[] modelIds;
	private short[] aShortArray1108;
	int[] anIntArray1109;
	int anInt1110;
	private byte aByte1111;
	int anInt1112; // not dize
	int headIcon;
	int anInt1114;
	int npcCombatLevel;
	boolean aBoolean1116;
	int[] anIntArray1117;
	int anInt1118;
	private byte aByte1119;
	int anInt1120;
	private int npcHeight;
	byte aByte1122;
	int anInt1123;
	private int[][] anIntArrayArray1124;
	int anInt1125;
	boolean aBoolean1126;
	int anInt1127;
	int anInt1128;
	byte aByte1129;
	boolean aBoolean1130;
	private int anInt1131;
	int anInt1132;
	Class301 aClass301_1133;
	byte aByte1134;

	short aShort1135;
	private byte[] aByteArray1136;
	short[] aShortArray1137;
	private byte aByte1138;
	private byte aByte1139;
	boolean aBoolean1140;
	byte aByte1141;
	private int npcWidth;
	int anInt1143;
	String npcName;
	int renderEmote; // durp
	private int anInt1146;
	int anInt1147;
	String[] options;
	boolean aBoolean1149;
	static float aFloat1150;
	private int anInt1151;
	int[] anIntArray1152;
	boolean aBoolean1153;
	int anInt1154;
	private short[] aShortArray1155;
	int anInt1156;

	private final void method2293(final int i, final ByteBuffer class98_sub22,
			final int opcode) {
		try {

			switch (npcId) {
			case 13643:
				npcCombatLevel = 9001;
				options[0] = null;
				options[1] = "Attack";
				options[2] = null;
				options[3] = null;
				options[4] = null;
				renderEmote = 1073;
				break;
			case 5911:
				npcWidth = 256;
				npcHeight = 256;
				renderEmote = 2032;
				options[0] = null;
				options[1] = "Attack";
				options[2] = null;
				options[3] = null;
				options[4] = null;
				break;
			case 6659:
				renderEmote = 124;
				break;
			case 6660:
				renderEmote = 124;
				break;
			case 6222:
				npcWidth = 256;
				npcHeight = 256;
				break;
			case 6203:
				npcWidth = 256;
				npcHeight = 256;
				break;
			case 7605:
				npcName = "Guild Banker";
				break;
			case 13727:
				options[1] = "<shad=1><trans=100><col=ffffff>Claim Voting Reward";
				options[2] = "<shad=1><trans=100><col=ffffff>Loyalty Rewards Shop";
				options[4] = "<shad=1><trans=100><col=ffffff>Open Vote Page";
				break;
			case 13028:
				npcName = "Queen Black Dragon";
				npcCombatLevel = 2100;

				options[0] = null;
				options[1] = "Attack";
				options[2] = null;
				options[3] = null;
				options[4] = null;
				break;
			case 3021:
				npcName = "Blac Dragon Trader - Farming";

				break;
			case 9694:
				renderEmote = 1578;
				npcName = "Madara Uchiha";
				break;
			case 13959:
			case 13944:
				npcName = "Black Dragon Rewards Trader";
				break;
			case 11230:
				npcCombatLevel = 1400;
				options[0] = null;
				options[1] = "Attack";
				options[2] = null;
				options[3] = null;
				options[4] = null;
				renderEmote = 908;
				break;
			case 6260:
			case 6261:
			case 6263:
			case 6265:
				npcWidth = 256;
				npcHeight = 256;
				break;
			case 13447:
			case 13448:
			case 13449:

				npcWidth = 160;
				npcHeight = 160;
				break;
			}


			if (i != 0) {
				method2295((byte) 53);
			}
			if ((opcode ^ 0xffffffff) == -2) {
				int modelArraySize = class98_sub22.readUnsignedByte((byte) 35);

				modelIds = new int[modelArraySize];
				switch (npcId) {
				case 5910:
					modelIds = new int[8];
					break;
				case 5911:
					modelIds = new int[8];
					break;
					
				case 12184:
					modelIds = new int[11];
					break;
				case 6660:
					modelIds = new int[8];
					break;
				case 6659:
					modelIds = new int[8];
					break;
				}
			

				for (int i_2_ = 0; modelArraySize > i_2_; i_2_++) {
					modelIds[i_2_] = class98_sub22
							.readUnsignedShort((byte) 127); // npc
					// model

					// ids
					switch (npcId) {
					case 2026:
						modelIds[1] = -1;
						modelIds[2] = -1;
						modelIds[3] = -1;
						modelIds[4] = -1;
						break;
					case 6659:
						modelIds[0] = 56873;
						modelIds[1] = 56871;
						modelIds[2] = 56874;
						modelIds[3] = -1;
						modelIds[4] = -1;
						modelIds[5] = -1;
						modelIds[6] = -1;
						modelIds[7] = -1;
						break;
					case 6660:
						modelIds[0] = -1;
						modelIds[1] = 56872;
						modelIds[2] = 27729;
						modelIds[3] = -1;
						modelIds[4] = -1;
						modelIds[5] = -1;
						modelIds[6] = -1;
						modelIds[7] = -1;
						break;
					case 5911:
						modelIds[0] = 8397;
						modelIds[1] = 8398;
						modelIds[2] = 8399;
						modelIds[3] = 8400;
						modelIds[4] = 2301;
						modelIds[5] = 53327;
						modelIds[6] = 62575;
						modelIds[7] = 58575;
						break;
					case 5910:
						modelIds[0] = 56875;
						modelIds[1] = -1;
						modelIds[2] = -1;
						modelIds[3] = -1;
						modelIds[4] = -1;
						modelIds[5] = -1;
						modelIds[6] = -1;
						modelIds[7] = -1;
						break;
					case 2029:
						modelIds[1] = -1;
						modelIds[2] = -1;
						modelIds[3] = -1;
						modelIds[4] = -1;
						break;
					case 2027:
						modelIds[1] = -1;
						modelIds[2] = -1;
						modelIds[3] = -1;
						modelIds[5] = -1;
						break;
					case 9694:

						modelIds[0] = 63597;
						break;
					case 12184:
						modelIds[0] = 62738;
						modelIds[1] = 3262;
						modelIds[2] = 62746;
						modelIds[3] = -1;
						modelIds[4] = 117;
						modelIds[5] = 62743;
						modelIds[6] = 53327;
						modelIds[7] = 23712;
						modelIds[8] = 9642;
						modelIds[9] = 2301;
						modelIds[10] = -1;
						break;
					case 11012:
						modelIds[0] = -1;
						modelIds[1] = -1;
						break;
					case 13028:
						modelIds[0] = 110;
						modelIds[1] = 113;
						break;
					}
				//	if (modelIds[i_2_] >= 65535) {
					//	modelIds[i_2_] = -1;
					//}
				}
			} else if ((opcode ^ 0xffffffff) != -3) {
				if (opcode == 12) {
					anInt1112 = class98_sub22.readUnsignedByte((byte) -101);

				} else if (opcode < 30 || (opcode ^ 0xffffffff) <= -36) {
					if (opcode == 40) {
						final int i_3_ = class98_sub22
								.readUnsignedByte((byte) 23);
						aShortArray1105 = new short[i_3_];
						aShortArray1108 = new short[i_3_];
						for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_4_++) {
							aShortArray1108[i_4_] = (short) class98_sub22
									.readUnsignedShort((byte) 127);
							aShortArray1105[i_4_] = (short) class98_sub22
									.readUnsignedShort((byte) 127);
						}
					} else if ((opcode ^ 0xffffffff) == -42) {
						final int i_5_ = class98_sub22
								.readUnsignedByte((byte) -111);
						aShortArray1155 = new short[i_5_];
						aShortArray1137 = new short[i_5_];
						for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
							aShortArray1155[i_6_] = (short) class98_sub22
									.readUnsignedShort((byte) 127);
							aShortArray1137[i_6_] = (short) class98_sub22
									.readUnsignedShort((byte) 127);
						}
					} else if ((opcode ^ 0xffffffff) == -43) {
						final int i_7_ = class98_sub22
								.readUnsignedByte((byte) 84);
						aByteArray1136 = new byte[i_7_];
						for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
							aByteArray1136[i_8_] = class98_sub22
									.readSignedByte((byte) -19);
						}
					} else if (opcode == 60) {
						final int i_9_ = class98_sub22
								.readUnsignedByte((byte) 108);
						anIntArray1117 = new int[i_9_];
						for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
							anIntArray1117[i_10_] = class98_sub22
									.readUnsignedShort((byte) 127);
						}
					} else if ((opcode ^ 0xffffffff) != -94) {
						if (opcode == 95) {
							npcCombatLevel = class98_sub22
									.readUnsignedShort((byte) 127);
						} else if ((opcode ^ 0xffffffff) != -98) {
							if (opcode == 98) {
								npcWidth = class98_sub22
										.readUnsignedShort((byte) 127);

							} else if (opcode != 99) {
								if (opcode != 100) {
									if ((opcode ^ 0xffffffff) == -102) {
										anInt1131 = class98_sub22
												.readSignedByte((byte) -19) * 5;
									} else if (opcode == 102) {
										headIcon = class98_sub22
												.readUnsignedShort((byte) 127);
									} else if (opcode != 103) {
										if (opcode == 106
												|| (opcode ^ 0xffffffff) == -119) {
											anInt1146 = class98_sub22
													.readUnsignedShort((byte) 127);
											if (anInt1146 == 65535) {
												anInt1146 = -1;
											}
											anInt1151 = class98_sub22
													.readUnsignedShort((byte) 127);
											if (anInt1151 == 65535) {
												anInt1151 = -1;
											}
											int i_11_ = -1;
											if (opcode == 118) {
												i_11_ = (class98_sub22
														.readUnsignedShort((byte) 127));
												if ((i_11_ ^ 0xffffffff) == -65536) {
													i_11_ = -1;
												}
											}
											final int i_12_ = class98_sub22
													.readUnsignedByte((byte) 116);
											anIntArray1109 = new int[i_12_ - -2];
											for (int i_13_ = 0; i_13_ <= i_12_; i_13_++) {
												anIntArray1109[i_13_] = (class98_sub22
														.readUnsignedShort((byte) 127));
												if (((anIntArray1109[i_13_]) ^ 0xffffffff) == -65536) {
													anIntArray1109[i_13_] = -1;
												}
											}
											anIntArray1109[1 + i_12_] = i_11_;
										} else if (opcode == 107) {
											aBoolean1116 = false;
										} else if ((opcode ^ 0xffffffff) != -110) {
											if (opcode != 111) {
												if ((opcode ^ 0xffffffff) != -114) {
													if ((opcode ^ 0xffffffff) == -115) {
														aByte1122 = (class98_sub22
																.readSignedByte((byte) -19));
														aByte1134 = (class98_sub22
																.readSignedByte((byte) -19));
													} else if ((opcode ^ 0xffffffff) == -120) {

														aByte1103 = (class98_sub22
																.readSignedByte((byte) -19));

													} else if (opcode == 121) {
														anIntArrayArray1124 = (new int[(modelIds).length][]);
														final int i_14_ = (class98_sub22
																.readUnsignedByte((byte) -126));
														for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
															final int i_16_ = (class98_sub22
																	.readUnsignedByte((byte) 92));
															final int[] is = (anIntArrayArray1124[i_16_] = (new int[3]));
															is[0] = (class98_sub22
																	.readSignedByte((byte) -19));
															is[1] = (class98_sub22
																	.readSignedByte((byte) -19));
															is[2] = (class98_sub22
																	.readSignedByte((byte) -19));
														}
													} else if (opcode == 122) {

														anInt1127 = (class98_sub22
																.readUnsignedShort((byte) 127));

													} else if (opcode == 123) {
														anInt1092 = (class98_sub22
																.readUnsignedShort((byte) 127));
													} else if (opcode == 125) {
														aByte1141 = (class98_sub22
																.readSignedByte((byte) -19));
													} else if (opcode == 127) {
													
														renderEmote = (class98_sub22
																.readUnsignedShort((byte) 127));
														

													} else if (opcode == 128) {
														class98_sub22
																.readUnsignedByte((byte) 45);
													} else if ((opcode ^ 0xffffffff) == -135) {
														anInt1120 = (class98_sub22
																.readUnsignedShort((byte) 127));
														if (((anInt1120) ^ 0xffffffff) == -65536) {
															anInt1120 = -1;
														}
														anInt1132 = (class98_sub22
																.readUnsignedShort((byte) 127));
														if (((anInt1132) ^ 0xffffffff) == -65536) {
															anInt1132 = -1;
														}
														anInt1102 = (class98_sub22
																.readUnsignedShort((byte) 127));
														if (((anInt1102) ^ 0xffffffff) == -65536) {
															anInt1102 = -1;
														}
														anInt1147 = (class98_sub22
																.readUnsignedShort((byte) 127));
														if (((anInt1147) ^ 0xffffffff) == -65536) {
															anInt1147 = -1;
														}
														anInt1128 = (class98_sub22
																.readUnsignedByte((byte) 33));
													} else if (opcode == 135) {
														anInt1143 = (class98_sub22
																.readUnsignedByte((byte) -108));
														anInt1154 = (class98_sub22
																.readUnsignedShort((byte) 127));
													} else if (opcode == 136) {
														anInt1114 = (class98_sub22
																.readUnsignedByte((byte) -98));
														anInt1110 = (class98_sub22
																.readUnsignedShort((byte) 127));
													} else if ((opcode ^ 0xffffffff) != -138) {
														if (opcode == 138) {
															anInt1095 = (class98_sub22
																	.readUnsignedShort((byte) 127));
														} else if (opcode != 139) {
															if ((opcode ^ 0xffffffff) != -141) {
																if ((opcode ^ 0xffffffff) == -142) {
																	aBoolean1153 = true;
																} else if ((opcode ^ 0xffffffff) == -143) {
																	anInt1118 = (class98_sub22
																			.readUnsignedShort((byte) 127));
																} else if (opcode != 143) {

																	if (((opcode ^ 0xffffffff) <= -151)
																			&& (opcode < 155)) {

																		options[-150
																				+ opcode] = class98_sub22
																				.readString((byte) 84);

																		if (!aClass301_1133.aBoolean2503) {
																			options[-150
																					+ opcode] = null;
																		}

																	} else if (opcode != 155) {
																		if ((opcode ^ 0xffffffff) == -159) {
																			aByte1129 = (byte) 1;
																		} else if (opcode != 159) {
																			if ((opcode ^ 0xffffffff) != -161) {
																				if (opcode != 162) {
																					if ((opcode ^ 0xffffffff) != -164) {
																						if ((opcode ^ 0xffffffff) == -165) {
																							anInt1101 = class98_sub22
																									.readUnsignedShort((byte) 127);
																							anInt1090 = class98_sub22
																									.readUnsignedShort((byte) 127);
																						} else if (opcode != 165) {
																							if (opcode != 168) {
																								if (opcode == 249) {
																									final int i_17_ = class98_sub22
																											.readUnsignedByte((byte) 65);
																									if (aClass377_1098 == null) {
																										final int i_18_ = Class48
																												.method453(
																														423660257,
																														i_17_);
																										aClass377_1098 = new Class377(
																												i_18_);
																									}
																									for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
																										final boolean bool = class98_sub22
																												.readUnsignedByte((byte) 34) == 1;
																										final int i_20_ = class98_sub22
																												.readMediumInt(-125);
																										Class98 class98;
																										if (!bool) {
																											class98 = new Class98_Sub34(
																													class98_sub22
																															.readInt(-2));
																										} else {
																											class98 = new Class98_Sub15(
																													class98_sub22
																															.readString((byte) 84));
																										}
																										aClass377_1098
																												.method3996(
																														class98,
																														i_20_,
																														-1);
																									}
																								}
																							} else {
																								anInt1125 = class98_sub22
																										.readUnsignedByte((byte) 15);
																							}
																						} else {
																							anInt1123 = class98_sub22
																									.readUnsignedByte((byte) 108);
																						}
																					} else {
																						anInt1096 = class98_sub22
																								.readUnsignedByte((byte) 89);
																					}
																				} else {
																					aBoolean1093 = true;
																				}
																			} else {
																				final int i_21_ = class98_sub22
																						.readUnsignedByte((byte) -108);
																				anIntArray1152 = new int[i_21_];
																				for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff); i_22_++) {
																					anIntArray1152[i_22_] = class98_sub22
																							.readUnsignedShort((byte) 127);
																				}
																			}
																		} else {
																			aByte1129 = (byte) 0;
																		}
																	} else {
																		aByte1111 = class98_sub22
																				.readSignedByte((byte) -19);
																		aByte1139 = class98_sub22
																				.readSignedByte((byte) -19);
																		aByte1119 = class98_sub22
																				.readSignedByte((byte) -19);
																		aByte1138 = class98_sub22
																				.readSignedByte((byte) -19);
																	}
																} else {
																	aBoolean1149 = true;
																}
															} else {
																anInt1156 = (class98_sub22
																		.readUnsignedByte((byte) -127));

															}
														} else {
															anInt1100 = (class98_sub22
																	.readUnsignedShort((byte) 127));
														}
													} else {

														anInt1099 = (class98_sub22
																.readUnsignedShort((byte) 127));

													}
												} else {
													aShort1094 = (short) (class98_sub22
															.readUnsignedShort((byte) 127));
													aShort1135 = (short) (class98_sub22
															.readUnsignedShort((byte) 127));
												}
											} else {
												aBoolean1130 = false;
											}
										} else {
											aBoolean1126 = false;
										}
									} else {
										anInt1091 = class98_sub22
												.readUnsignedShort((byte) 127);
									}
								} else {
									anInt1104 = class98_sub22
											.readSignedByte((byte) -19);
								}
							} else {
								aBoolean1106 = true;
							}
						} else {
							npcHeight = class98_sub22
									.readUnsignedShort((byte) 127);
						}
					} else {
						aBoolean1140 = false;
					}
				} else {
					options[opcode + -30] = class98_sub22.readString((byte) 84);
				}
			} else {
				npcName = class98_sub22.readString((byte) 84);

			}

		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("NPC DEFS" + "jl.F(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ opcode + ')'));
		}
	}

	// do what you have to do
	// i have never aded this to anything but 317 and it worked on the 317 hmm
	static final void method2294(final int i) {
		do {
			try {
				if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4076
						.method564((byte) 125) == 0
						&& Class115.anInt963 != Class43.anInt377) {
					Class251.method3170(i + -6547, Class275.anInt2047, false,
							Class160.anInt1258, 11);
				} else {
					client.method103(i, Class265.aHa1974);
					if (Class145.anInt1170 == Class43.anInt377) { // i just want
																	// to get it
																	// loading
																	// lol well
																	// i cant
																	// read that
																	// error lol
						break;
					}
					Class135.method2264((byte) -94);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jl.I(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method2295(final byte i) {
		do {
			try {
				if (modelIds == null) {
					modelIds = new int[0];
				}
				if (aByte1129 == -1) {
					if (s_Sub1.aClass279_5197 == (aClass301_1133.aClass279_2502)) {
						aByte1129 = (byte) 1;
						if (!client.aBoolean3553) {
							break;
						}
					}
					aByte1129 = (byte) 0;
				}

			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jl.K(" + i
						+ ')');
			}
		} while (false);
	}

	final boolean method2296(final Interface6 interface6, final byte i) {
		try {
			if (anIntArray1109 == null) {
				return true;
			}
			int i_24_ = -1;
			do {
				if (anInt1146 != -1) {
					i_24_ = interface6.method7(anInt1146, 7373);
					if (!client.aBoolean3553) {
						break;
					}
				}
				if ((anInt1151 ^ 0xffffffff) != 0) {
					i_24_ = interface6.method6(anInt1151, 122);
				}
			} while (false);
			if ((i_24_ ^ 0xffffffff) > -1
					|| i_24_ >= -1 + anIntArray1109.length
					|| ((anIntArray1109[i_24_] ^ 0xffffffff) == 0)) {
				final int i_25_ = (anIntArray1109[anIntArray1109.length + -1]);
				if (i_25_ == -1) {
					return false;
				}
				return true;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.L("
					+ (interface6 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method2297(final ByteBuffer class98_sub22, final boolean bool) {
		try {
			if (bool != true) {
				method2297(null, false);
			}
			for (;;) {
				final int i = class98_sub22.readUnsignedByte((byte) -125);
				if (i == 0) {
					break;
				}
				method2293(0, class98_sub22, i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("jl.A(" + (class98_sub22 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	final String method2298(final int i, final int i_27_, final String string) {
		try {
			if (i_27_ >= -14) {
				method2295((byte) -67);
			}
			if (aClass377_1098 == null) {
				return string;
			}
			final Class98_Sub15 class98_sub15 = (Class98_Sub15) aClass377_1098
					.method3990(i, -1);
			if (class98_sub15 == null) {
				return string;
			}
			return class98_sub15.aString3917;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.J(" + i + ','
					+ i_27_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final Class146 method2299(final AnimationDefinition class97,
			final boolean bool, final Interface6 interface6, final int i,
			final int i_28_, final AnimationDefParser class183,
			final int i_29_, final ha var_ha, final Class40 class40,
			final int i_30_) {
		try {
			if (bool != false) {
				return null;
			}
			if (anIntArray1109 != null) {
				final NPC class141_31_ = method2300(interface6, (byte) 78);
				if (class141_31_ == null) {
					return null;
				}
				return class141_31_.method2299(class97, false, interface6, i,
						i_28_, class183, i_29_, var_ha, class40, i_30_);
			}
			if (anIntArray1117 == null
					&& (class40 == null || class40.anIntArray366 == null)) {
				return null;
			}
			int i_32_ = i_29_;
			if (class97 != null && (i_28_ ^ 0xffffffff) != 0) {
				i_32_ = i_32_ | class97.method932(true, i_28_, !bool, i_30_);
			}
			long l = var_ha.anInt937 << 431969328 | npcId;
			if (class40 != null) {
				l |= class40.aLong365 << -466776552;
			}
			Class146 class146;
			synchronized (aClass301_1133.aClass79_2510) {
				class146 = (Class146) aClass301_1133.aClass79_2510.method802(
						-119, l);
			}
			if (class146 == null
					|| (class146.ua() & i_32_ ^ 0xffffffff) != (i_32_ ^ 0xffffffff)) {
				if (class146 != null) {
					i_32_ |= class146.ua();
				}
				int i_33_ = i_32_;
				final int[] is = ((class40 != null && class40.anIntArray366 != null) ? class40.anIntArray366
						: anIntArray1117);
				boolean bool_34_ = false;
				synchronized (aClass301_1133.aClass207_2506) {
					for (int i_35_ = 0; (i_35_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_35_++) {
						if (!aClass301_1133.aClass207_2506.method2751(0,
								is[i_35_], -6329)) {
							bool_34_ = true;
						}
					}
				}
				if (bool_34_) {
					return null;
				}
				final Model[] class178s = new Model[is.length];
				synchronized (aClass301_1133.aClass207_2506) {
					for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_36_++) {
						class178s[i_36_] = Class98_Sub6.method981(0, -9252,
								((aClass301_1133).aClass207_2506), is[i_36_]);
					}
				}
				for (int i_37_ = 0; (is.length ^ 0xffffffff) < (i_37_ ^ 0xffffffff); i_37_++) {
					if (class178s[i_37_] != null
							&& (class178s[i_37_].version ^ 0xffffffff) > -14) {
						class178s[i_37_].method2592(13746, 2);
					}
				}
				Model model;
				if (class178s.length != 1) {
					model = new Model(class178s, class178s.length);
				} else {
					model = class178s[0];
				}
				if (aShortArray1108 != null) {
					i_33_ |= 0x4000;
				}
				if (aShortArray1155 != null) {
					i_33_ |= 0x8000;
				}
				if ((aByte1138 ^ 0xffffffff) != -1) {
					i_33_ |= 0x80000;
				}
				class146 = var_ha.method1790(model, i_33_,
						((aClass301_1133).anInt2511), 64, 768);
				if (aShortArray1108 != null) {
					short[] is_38_;
					if (class40 == null || class40.aShortArray370 == null) {
						is_38_ = aShortArray1105;
					} else {
						is_38_ = class40.aShortArray370;
					}
					for (int i_39_ = 0; ((i_39_ ^ 0xffffffff) > (aShortArray1108.length ^ 0xffffffff)); i_39_++) {
						if (aByteArray1136 != null
								&& aByteArray1136.length > i_39_) {
							class146.ia(
									aShortArray1108[i_39_],
									(Class265.aShortArray1977[0xff & aByteArray1136[i_39_]]));
						} else {
							class146.ia(aShortArray1108[i_39_], is_38_[i_39_]);
						}
					}
				}
				if (aShortArray1155 != null) {
					short[] is_40_;
					if (class40 != null && class40.aShortArray368 != null) {
						is_40_ = class40.aShortArray368;
					} else {
						is_40_ = aShortArray1137;
					}
					for (int i_41_ = 0; i_41_ < aShortArray1155.length; i_41_++) {
						class146.aa(aShortArray1155[i_41_], is_40_[i_41_]);
					}
				}
				if (aByte1138 != 0) {
					class146.method2337(aByte1111, aByte1139, aByte1119,
							0xff & aByte1138);
				}
				class146.s(i_32_);
				synchronized (aClass301_1133.aClass79_2510) {
					aClass301_1133.aClass79_2510.method805(l, class146,
							(byte) -80);
				}
			}
			if (class97 != null && i_28_ != -1) {
				class146 = class97.method937(i_30_, i, i_32_, -94, class146,
						i_28_);
			}
			class146.s(i_29_);
			return class146;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("jl.M("
							+ (class97 != null ? "{...}" : "null") + ',' + bool
							+ ',' + (interface6 != null ? "{...}" : "null")
							+ ',' + i + ',' + i_28_ + ','
							+ (class183 != null ? "{...}" : "null") + ','
							+ i_29_ + ',' + (var_ha != null ? "{...}" : "null")
							+ ',' + (class40 != null ? "{...}" : "null") + ','
							+ i_30_ + ')'));
		}
	}

	final NPC method2300(final Interface6 interface6, final byte i) {
		try {
			int i_42_ = -1;
			do {
				if (anInt1146 != -1) {
					i_42_ = interface6.method7(anInt1146, 7373);
					if (!client.aBoolean3553) {
						break;
					}
				}
				if (anInt1151 != -1) {
					i_42_ = interface6.method6(anInt1151, 28);
				}
			} while (false);
			if (i < 19) {
				return null;
			}
			if (i_42_ < 0
					|| ((anIntArray1109.length - 1 ^ 0xffffffff) >= (i_42_ ^ 0xffffffff))
					|| anIntArray1109[i_42_] == -1) {
				final int i_43_ = (anIntArray1109[-1 + anIntArray1109.length]);
				if ((i_43_ ^ 0xffffffff) != 0) {
					return aClass301_1133.method3538(5, i_43_);
				}
				return null;
			}
			return aClass301_1133.method3538(5, anIntArray1109[i_42_]);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.B("
					+ (interface6 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class146 method2301(final int i, final int i_44_, final int[] is,
			final int i_45_, final byte i_46_,
			final AnimationDefinition class97, final Class226[] class226s,
			final ha var_ha, final int i_47_, final int i_48_,
			final Interface6 interface6, final Class40 class40,
			final int i_49_, final Class257 class257, final int i_50_,
			final int i_51_, final AnimationDefParser class183,
			final AnimationDefinition class97_52_) {
		try {
			if (anIntArray1109 != null) {
				final NPC class141_53_ = method2300(interface6, (byte) 78);
				if (class141_53_ == null) {
					return null;
				}
				return class141_53_.method2301(i, i_44_, is, i_45_, (byte) 111,
						class97, class226s, var_ha, i_47_, i_48_, interface6,
						class40, i_49_, class257, i_50_, i_51_, class183,
						class97_52_);
			}
			int i_54_ = i_50_;
			if (npcWidth != 128) {
				i_54_ |= 0x2;
			}
			if ((npcHeight ^ 0xffffffff) != -129) {
				i_54_ |= 0x5;
			}
			boolean bool = class97 != null || class97_52_ != null;
			boolean bool_55_ = false;
			boolean bool_56_ = false;
			boolean bool_57_ = false;
			boolean bool_58_ = false;
			final int i_59_ = class226s != null ? class226s.length : 0;
			for (int i_60_ = 0; (i_60_ ^ 0xffffffff) > (i_59_ ^ 0xffffffff); i_60_++) {
				Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_60_] = null;
				if (class226s[i_60_] != null) {
					final AnimationDefinition class97_61_ = class183
							.method2623((class226s[i_60_].anInt1700), 16383);
					if (class97_61_.anIntArray818 != null) {
						bool = true;
						Class98_Sub50.aClass97Array4293[i_60_] = class97_61_;
						final int i_62_ = class226s[i_60_].anInt1702;
						final int i_63_ = class226s[i_60_].anInt1701;
						int i_64_ = class97_61_.anIntArray818[i_62_];
						Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_60_] = class183
								.method2624(2, i_64_ >>> -39687440);
						i_64_ &= 0xffff;
						Class290.anIntArray2198[i_60_] = i_64_;
						if ((Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_60_]) != null) {
							bool_56_ |= Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_60_]
									.method1619(i_64_, 31239);
							bool_55_ |= Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_60_]
									.method1617(false, i_64_);
							bool_58_ |= Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_60_]
									.method1615(i_64_, false);
							bool_57_ |= class97_61_.aBoolean817;
						}
						if ((class97_61_.aBoolean825 || Class357.aBoolean3027)
								&& (i_63_ ^ 0xffffffff) != 0
								&& (class97_61_.anIntArray818.length ^ 0xffffffff) < (i_63_ ^ 0xffffffff)) {
							Class32.anIntArray311[i_60_] = class97_61_.anIntArray811[i_62_];
							Class256_Sub1.anIntArray5156[i_60_] = class226s[i_60_].anInt1707;
							int i_65_ = class97_61_.anIntArray818[i_63_];
							Class98_Sub11.aClass98_Sub46_Sub16Array3870[i_60_] = class183
									.method2624(2, i_65_ >>> -1998137744);
							i_65_ &= 0xffff;
							Class265.anIntArray1981[i_60_] = i_65_;
							if ((Class98_Sub11.aClass98_Sub46_Sub16Array3870[i_60_]) != null) {
								bool_56_ |= Class98_Sub11.aClass98_Sub46_Sub16Array3870[i_60_]
										.method1619(i_65_, 31239);
								bool_55_ |= Class98_Sub11.aClass98_Sub46_Sub16Array3870[i_60_]
										.method1617(false, i_65_);
								bool_58_ |= Class98_Sub11.aClass98_Sub46_Sub16Array3870[i_60_]
										.method1615(i_65_, false);
							}
						} else {
							Class32.anIntArray311[i_60_] = 0;
							Class256_Sub1.anIntArray5156[i_60_] = 0;
							Class98_Sub11.aClass98_Sub46_Sub16Array3870[i_60_] = null;
							Class265.anIntArray1981[i_60_] = -1;
						}
					}
				}
			}
			if (i_46_ <= 91) {
				return null;
			}
			int i_66_ = -1;
			int i_67_ = -1;
			int i_68_ = 0;
			Class98_Sub46_Sub16 class98_sub46_sub16 = null;
			Class98_Sub46_Sub16 class98_sub46_sub16_69_ = null;
			int i_70_ = -1;
			int i_71_ = -1;
			int i_72_ = 0;
			Class98_Sub46_Sub16 class98_sub46_sub16_73_ = null;
			Class98_Sub46_Sub16 class98_sub46_sub16_74_ = null;
			if (bool) {
				if (class97 != null) {
					i_66_ = class97.anIntArray818[i];
					final int i_75_ = i_66_ >>> -329523440;
					i_66_ &= 0xffff;
					class98_sub46_sub16 = class183.method2624(2, i_75_);
					if (class98_sub46_sub16 != null) {
						bool_56_ |= class98_sub46_sub16
								.method1619(i_66_, 31239);
						bool_55_ |= class98_sub46_sub16
								.method1617(false, i_66_);
						bool_58_ |= class98_sub46_sub16
								.method1615(i_66_, false);
						bool_57_ |= class97.aBoolean817;
					}
					if ((class97.aBoolean825 || Class357.aBoolean3027)
							&& (i_48_ ^ 0xffffffff) != 0
							&& class97.anIntArray818.length > i_48_) {
						i_67_ = class97.anIntArray818[i_48_];
						i_68_ = class97.anIntArray811[i];
						final int i_76_ = i_67_ >>> -924031952;
						if (i_75_ != i_76_) {
							class98_sub46_sub16_69_ = class183.method2624(2,
									i_76_);
						} else {
							class98_sub46_sub16_69_ = class98_sub46_sub16;
						}
						i_67_ &= 0xffff;
						if (class98_sub46_sub16_69_ != null) {
							bool_56_ |= class98_sub46_sub16_69_.method1619(
									i_67_, 31239);
							bool_55_ |= class98_sub46_sub16_69_.method1617(
									false, i_67_);
							bool_58_ |= class98_sub46_sub16_69_.method1615(
									i_67_, false);
						}
					}
				}
				i_54_ |= 0x20;
				if (class97_52_ != null) {
					i_70_ = class97_52_.anIntArray818[i_45_];
					final int i_77_ = i_70_ >>> 646999344;
					i_70_ &= 0xffff;
					class98_sub46_sub16_73_ = class183.method2624(2, i_77_);
					if (class98_sub46_sub16_73_ != null) {
						bool_56_ |= class98_sub46_sub16_73_.method1619(i_70_,
								31239);
						bool_55_ |= class98_sub46_sub16_73_.method1617(false,
								i_70_);
						bool_58_ |= class98_sub46_sub16_73_.method1615(i_70_,
								false);
						bool_57_ |= class97_52_.aBoolean817;
					}
					if ((class97_52_.aBoolean825 || Class357.aBoolean3027)
							&& (i_51_ ^ 0xffffffff) != 0
							&& (class97_52_.anIntArray818.length > i_51_)) {
						i_72_ = class97_52_.anIntArray811[i_45_];
						i_71_ = class97_52_.anIntArray818[i_51_];
						final int i_78_ = i_71_ >>> -36661744;
						if ((i_78_ ^ 0xffffffff) != (i_77_ ^ 0xffffffff)) {
							class98_sub46_sub16_74_ = class183.method2624(2,
									i_78_);
						} else {
							class98_sub46_sub16_74_ = class98_sub46_sub16_73_;
						}
						i_71_ &= 0xffff;
						if (class98_sub46_sub16_74_ != null) {
							bool_56_ |= class98_sub46_sub16_74_.method1619(
									i_71_, 31239);
							bool_55_ |= class98_sub46_sub16_74_.method1617(
									false, i_71_);
							bool_58_ |= class98_sub46_sub16_74_.method1615(
									i_71_, false);
						}
					}
				}
				if (bool_56_) {
					i_54_ |= 0x80;
				}
				if (bool_55_) {
					i_54_ |= 0x100;
				}
				if (bool_57_) {
					i_54_ |= 0x200;
				}
				if (bool_58_) {
					i_54_ |= 0x400;
				}
			}
			long l = npcId | var_ha.anInt937 << -262111792;
			if (class40 != null) {
				l |= class40.aLong365 << -1822091880;
			}
			Class146 class146;
			synchronized (aClass301_1133.aClass79_2509) {
				class146 = (Class146) aClass301_1133.aClass79_2509.method802(
						-125, l);
			}
			Class294 class294 = null;
			if (renderEmote != -1) {
				class294 = class257.method3199(false, renderEmote);
			}
			if (class146 == null || (i_54_ & class146.ua()) != i_54_) {
				if (class146 != null) {
					i_54_ |= class146.ua();
				}
				int i_79_ = i_54_;
				final int[] is_80_ = ((class40 != null && class40.anIntArray366 != null) ? class40.anIntArray366
						: modelIds);
				boolean bool_81_ = false;
				synchronized (aClass301_1133.aClass207_2506) {
					for (int i_82_ = 0; i_82_ < is_80_.length; i_82_++) {
						if (is_80_[i_82_] != -1
								&& !aClass301_1133.aClass207_2506.method2751(0,
										is_80_[i_82_], -6329)) {
							bool_81_ = true;
						}
					}
				}
				if (bool_81_) {
					return null;
				}
				final Model[] class178s = new Model[is_80_.length];
				for (int i_83_ = 0; i_83_ < is_80_.length; i_83_++) {
					if ((is_80_[i_83_] ^ 0xffffffff) != 0) {
						synchronized (aClass301_1133.aClass207_2506) {
							class178s[i_83_] = Class98_Sub6.method981(0, -9252,
									((aClass301_1133).aClass207_2506),
									is_80_[i_83_]);
						}
						if (class178s[i_83_] != null) {
							if ((class178s[i_83_].version ^ 0xffffffff) > -14) {
								class178s[i_83_].method2592(13746, 2);
							}
							if (anIntArrayArray1124 != null
									&& anIntArrayArray1124[i_83_] != null) {
								class178s[i_83_].method2597(
										anIntArrayArray1124[i_83_][2],
										anIntArrayArray1124[i_83_][0],
										(byte) 89,
										anIntArrayArray1124[i_83_][1]);
							}
						}
					}
				}
				if (class294 != null && class294.anIntArrayArray2366 != null) {
					for (int i_84_ = 0; (i_84_ < class294.anIntArrayArray2366.length); i_84_++) {
						if ((i_84_ ^ 0xffffffff) > (class178s.length ^ 0xffffffff)
								&& class178s[i_84_] != null) {
							int i_85_ = 0;
							int i_86_ = 0;
							int i_87_ = 0;
							int i_88_ = 0;
							int i_89_ = 0;
							int i_90_ = 0;
							if ((class294.anIntArrayArray2366[i_84_]) != null) {
								i_85_ = (class294.anIntArrayArray2366[i_84_][0]);
								i_90_ = ((class294.anIntArrayArray2366[i_84_][5]) << 591859491);
								i_86_ = (class294.anIntArrayArray2366[i_84_][1]);
								i_89_ = ((class294.anIntArrayArray2366[i_84_][4]) << -915484413);
								i_87_ = (class294.anIntArrayArray2366[i_84_][2]);
								i_88_ = ((class294.anIntArrayArray2366[i_84_][3]) << -1463601021);
							}
							if (i_88_ != 0 || i_89_ != 0
									|| (i_90_ ^ 0xffffffff) != -1) {
								class178s[i_84_].method2600(i_90_, i_88_,
										(byte) 117, i_89_);
							}
							if ((i_85_ ^ 0xffffffff) != -1 || i_86_ != 0
									|| (i_87_ ^ 0xffffffff) != -1) {
								class178s[i_84_].method2597(i_87_, i_85_,
										(byte) 60, i_86_);
							}
						}
					}
				}
				Model model;
				if ((class178s.length ^ 0xffffffff) == -2) {
					model = class178s[0];
				} else {
					model = new Model(class178s, class178s.length);
				}
				if (aShortArray1108 != null) {
					i_79_ |= 0x4000;
				}
				if (aShortArray1155 != null) {
					i_79_ |= 0x8000;
				}
				if ((aByte1138 ^ 0xffffffff) != -1) {
					i_79_ |= 0x80000;
				}
				class146 = var_ha.method1790(model, i_79_,
						((aClass301_1133).anInt2511), 64 + anInt1104,
						anInt1131 + 850);
				if (aShortArray1108 != null) {
					short[] is_91_;
					if (class40 != null && class40.aShortArray370 != null) {
						is_91_ = class40.aShortArray370;
					} else {
						is_91_ = aShortArray1105;
					}
					for (int i_92_ = 0; aShortArray1108.length > i_92_; i_92_++) {
						if (aByteArray1136 != null
								&& i_92_ < aByteArray1136.length) {
							class146.ia(
									aShortArray1108[i_92_],
									(Class265.aShortArray1977[aByteArray1136[i_92_] & 0xff]));
						} else {
							class146.ia(aShortArray1108[i_92_], is_91_[i_92_]);
						}
					}
				}
				if (aShortArray1155 != null) {
					short[] is_93_;
					if (class40 == null || class40.aShortArray368 == null) {
						is_93_ = aShortArray1137;
					} else {
						is_93_ = class40.aShortArray368;
					}
					for (int i_94_ = 0; i_94_ < aShortArray1155.length; i_94_++) {
						class146.aa(aShortArray1155[i_94_], is_93_[i_94_]);
					}
				}
				if ((aByte1138 ^ 0xffffffff) != -1) {
					class146.method2337(aByte1111, aByte1139, aByte1119,
							0xff & aByte1138);
				}
				class146.s(i_54_);
				synchronized (aClass301_1133.aClass79_2509) {
					aClass301_1133.aClass79_2509.method805(l, class146,
							(byte) -80);
				}
			}
			final Class146 class146_95_ = class146.method2341((byte) 4, i_54_,
					true);
			boolean bool_96_ = false;
			if (is != null) {
				for (int i_97_ = 0; i_97_ < 12; i_97_++) {
					if ((is[i_97_] ^ 0xffffffff) != 0) {
						bool_96_ = true;
					}
				}
			}
			if (!bool && !bool_96_) {
				return class146_95_;
			}
			Class111[] class111s = null;
			if (class294 != null) {
				class111s = class294.method3481(var_ha, (byte) -80);
			}
			if (bool_96_ && class111s != null) {
				for (int i_98_ = 0; i_98_ < 12; i_98_++) {
					if (class111s[i_98_] != null) {
						class146_95_.method2331(class111s[i_98_], 1 << i_98_,
								true);
					}
				}
			}
			int i_99_ = 0;
			int i_100_ = 1;
			for (/**/; (i_99_ ^ 0xffffffff) > (i_59_ ^ 0xffffffff); i_99_++) {
				if (Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_99_] != null) {
					class146_95_
							.method2323(
									Class290.anIntArray2198[i_99_],
									-1 + Class256_Sub1.anIntArray5156[i_99_],
									Class98_Sub11.aClass98_Sub46_Sub16Array3870[i_99_],
									-27033,
									i_100_,
									(Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_99_]),
									(Class98_Sub50.aClass97Array4293[i_99_].aBoolean817),
									Class265.anIntArray1981[i_99_], null, 0,
									Class32.anIntArray311[i_99_]);
				}
				i_100_ <<= 1;
			}
			if (bool_96_) {
				for (int i_101_ = 0; (i_101_ ^ 0xffffffff) > -13; i_101_++) {
					if ((is[i_101_] ^ 0xffffffff) != 0) {
						int i_102_ = -i_44_ + is[i_101_];
						i_102_ &= 0x3fff;
						final Class111 class111 = var_ha.method1821();
						class111.method2101(i_102_);
						class146_95_.method2331(class111, 1 << i_101_, false);
					}
				}
			}
			if (bool_96_ && class111s != null) {
				for (int i_103_ = 0; i_103_ < 12; i_103_++) {
					if (class111s[i_103_] != null) {
						class146_95_.method2331(class111s[i_103_], 1 << i_103_,
								false);
					}
				}
			}
			if (class98_sub46_sub16 == null || class98_sub46_sub16_73_ == null) {
				if (class98_sub46_sub16 == null) {
					if (class98_sub46_sub16_73_ != null) {
						class146_95_
								.method2338(-1 + i_47_,
										class98_sub46_sub16_73_, i_70_,
										class98_sub46_sub16_74_,
										(class97_52_.aBoolean817), 0, 126,
										i_72_, i_71_);
					}
				} else {
					class146_95_.method2338(i_49_ - 1, class98_sub46_sub16,
							i_66_, class98_sub46_sub16_69_,
							class97.aBoolean817, 0, 112, i_68_, i_67_);
				}
			} else {
				class146_95_.method2321(i_68_, i_66_, class98_sub46_sub16,
						class98_sub46_sub16_69_, class97.aBooleanArray813,
						i_72_, 28777, i_70_, class98_sub46_sub16_73_, i_71_,
						i_49_ + -1,
						(class97.aBoolean817 | (class97_52_.aBoolean817)),
						class98_sub46_sub16_74_, -1 + i_47_, i_67_);
			}
			for (int i_104_ = 0; (i_59_ ^ 0xffffffff) < (i_104_ ^ 0xffffffff); i_104_++) {
				Class98_Sub10_Sub26.aClass98_Sub46_Sub16Array5690[i_104_] = null;
				Class98_Sub11.aClass98_Sub46_Sub16Array3870[i_104_] = null;
				Class98_Sub50.aClass97Array4293[i_104_] = null;
			}
			if ((npcHeight ^ 0xffffffff) != -129 || npcWidth != 128) {
				class146_95_.O(npcHeight, npcWidth, npcHeight);
			}
			class146_95_.s(i_50_);
			return class146_95_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.C(" + i + ','
					+ i_44_ + ',' + (is != null ? "{...}" : "null") + ','
					+ i_45_ + ',' + i_46_ + ','
					+ (class97 != null ? "{...}" : "null") + ','
					+ (class226s != null ? "{...}" : "null") + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_47_ + ','
					+ i_48_ + ',' + (interface6 != null ? "{...}" : "null")
					+ ',' + (class40 != null ? "{...}" : "null") + ',' + i_49_
					+ ',' + (class257 != null ? "{...}" : "null") + ',' + i_50_
					+ ',' + i_51_ + ',' + (class183 != null ? "{...}" : "null")
					+ ',' + (class97_52_ != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2302(final byte i) {
		try {
			if (i < 16) {
				return false;
			}
			if (anIntArray1109 == null) {
				if ((anInt1120 ^ 0xffffffff) == 0
						&& (anInt1102 ^ 0xffffffff) == 0 && anInt1147 == -1) {
					return false;
				}
				return true;
			}
			for (int i_105_ = 0; i_105_ < anIntArray1109.length; i_105_++) {
				if ((anIntArray1109[i_105_] ^ 0xffffffff) != 0) {
					final NPC class141_106_ = (aClass301_1133.method3538(5,
							anIntArray1109[i_105_]));
					if (((class141_106_.anInt1120 ^ 0xffffffff) != 0)
							|| class141_106_.anInt1102 != -1
							|| ((class141_106_.anInt1147 ^ 0xffffffff) != 0)) {
						return true;
					}
				}
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jl.E(" + i + ')');
		}
	}

	static final void method2303(final ha var_ha, final byte i,
			final Class207 class207) {
		try {
			Class324[] class324s = Class324.method3680(class207, aa.anInt51, 0);
			Class287_Sub2.aClass332Array3275 = new Class332[class324s.length];
			for (int i_107_ = 0; class324s.length > i_107_; i_107_++) {
				Class287_Sub2.aClass332Array3275[i_107_] = var_ha.method1758(
						class324s[i_107_], true);
			}
			class324s = Class324.method3680(class207, Class140.anInt3243, 0);
			Class254.aClass332Array1943 = new Class332[class324s.length];
			for (int i_108_ = 0; i_108_ < class324s.length; i_108_++) {
				Class254.aClass332Array1943[i_108_] = var_ha.method1758(
						class324s[i_108_], true);
			}
			class324s = Class324.method3680(class207, Class65.anInt503, 0);
			Class177.aClass332Array1382 = new Class332[class324s.length];
			for (int i_109_ = 0; (class324s.length ^ 0xffffffff) < (i_109_ ^ 0xffffffff); i_109_++) {
				Class177.aClass332Array1382[i_109_] = var_ha.method1758(
						class324s[i_109_], true);
			}
			class324s = Class324.method3680(class207, Class260.anInt3259, 0);
			Class119_Sub4.aClass332Array4739 = new Class332[class324s.length];
			for (int i_110_ = 0; class324s.length > i_110_; i_110_++) {
				Class119_Sub4.aClass332Array4739[i_110_] = var_ha.method1758(
						class324s[i_110_], true);
			}
			class324s = Class324.method3680(class207, Class251.anInt1916, 0);
			Class2.aClass332Array72 = new Class332[class324s.length];
			for (int i_111_ = 0; (class324s.length ^ 0xffffffff) < (i_111_ ^ 0xffffffff); i_111_++) {
				Class2.aClass332Array72[i_111_] = var_ha.method1758(
						class324s[i_111_], true);
			}
			class324s = Class324.method3680(class207, Class319.anInt2706, 0);
			Class306.aClass332Array2557 = new Class332[class324s.length];
			for (int i_112_ = 0; i_112_ < class324s.length; i_112_++) {
				Class306.aClass332Array2557[i_112_] = var_ha.method1758(
						class324s[i_112_], true);
			}
			class324s = Class324
					.method3680(class207, Class76_Sub2.anInt3728, 0);
			Class98_Sub46_Sub11.aClass332Array6032 = new Class332[class324s.length];
			for (int i_113_ = 0; (class324s.length ^ 0xffffffff) < (i_113_ ^ 0xffffffff); i_113_++) {
				Class98_Sub46_Sub11.aClass332Array6032[i_113_] = var_ha
						.method1758(class324s[i_113_], true);
			}
			class324s = Class324.method3680(class207, Class226.anInt1706, 0);
			Class340.aClass332Array2848 = new Class332[class324s.length];
			for (int i_114_ = 0; (class324s.length ^ 0xffffffff) < (i_114_ ^ 0xffffffff); i_114_++) {
				Class340.aClass332Array2848[i_114_] = var_ha.method1758(
						class324s[i_114_], true);
			}
			class324s = Class324.method3680(class207, Class39.anInt363, 0);
			Class76_Sub7.aClass332Array3764 = new Class332[class324s.length];
			for (int i_115_ = 0; (i_115_ ^ 0xffffffff) > (class324s.length ^ 0xffffffff); i_115_++) {
				Class76_Sub7.aClass332Array3764[i_115_] = var_ha.method1758(
						class324s[i_115_], true);
			}
			class324s = Class324.method3680(class207,
					OutputStream_Sub1.anInt37, 0);
			Class93.aClass332Array3512 = new Class332[class324s.length];
			for (int i_116_ = 0; (i_116_ ^ 0xffffffff) > (class324s.length ^ 0xffffffff); i_116_++) {
				Class93.aClass332Array3512[i_116_] = var_ha.method1758(
						class324s[i_116_], true);
			}
			class324s = Class324.method3680(class207, Class243.anInt1852, 0);
			Class64_Sub14.aClass332Array3675 = new Class332[class324s.length];
			for (int i_117_ = 0; i_117_ < class324s.length; i_117_++) {
				Class64_Sub14.aClass332Array3675[i_117_] = var_ha.method1758(
						class324s[i_117_], true);
			}
			class324s = Class324.method3680(class207,
					Class98_Sub31_Sub4.anInt5860, 0);
			Class64_Sub18.aClass332Array3689 = new Class332[class324s.length];
			for (int i_119_ = 0; class324s.length > i_119_; i_119_++) {
				Class64_Sub18.aClass332Array3689[i_119_] = var_ha.method1758(
						class324s[i_119_], true);
			}
			Class334.aClass332_3471 = var_ha
					.method1758(Class324.method3685(class207,
							(Class111_Sub2.anInt4695), 0), true);
			Class284_Sub2_Sub2.aClass332_6199 = var_ha.method1758(
					Class324.method3685(class207, Class264.anInt1972, 0), true);
			class324s = Class324.method3680(class207, Class76.anInt588, 0);
			GameObjectDefinition.aClass332Array3000 = new Class332[class324s.length];
			for (int i_120_ = 0; i_120_ < class324s.length; i_120_++) {
				GameObjectDefinition.aClass332Array3000[i_120_] = var_ha
						.method1758(class324s[i_120_], true);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.D("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	static final short[] method2304(final byte i, final short[] is) {
		try {
			if (i < 109) {
				method2294(72);
			}
			if (is == null) {
				return null;
			}
			final short[] is_121_ = new short[is.length];
			Class236.method2895(is, 0, is_121_, 0, is.length);
			return is_121_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.H(" + i + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2305(final int i, final int i_122_, final byte i_123_) {
		try {
			if (i_123_ <= 113) {
				return 85;
			}
			if (aClass377_1098 == null) {
				return i_122_;
			}
			final Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass377_1098
					.method3990(i, -1);
			if (class98_sub34 == null) {
				return i_122_;
			}
			return class98_sub34.anInt4126;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jl.G(" + i + ','
					+ i_122_ + ',' + i_123_ + ')'));
		}
	}

	public NPC() {
		anInt1092 = -1;
		anInt1104 = 0; // not size
		anInt1112 = 1; // not size
		aByte1122 = (byte) -96;
		anInt1128 = 0; // not size
		anInt1101 = 256;
		aBoolean1130 = true;
		aByte1129 = (byte) -1;
		aByte1103 = (byte) 0;
		headIcon = -1;
		anInt1095 = -1;
		anInt1125 = 0; // not size
		anInt1123 = 0; // not size
		anInt1118 = -1;
		anInt1099 = -1;
		npcCombatLevel = -1;
		aBoolean1126 = true;
		aBoolean1116 = true;
		anInt1127 = -1;
		anInt1131 = 0; // not size
		npcHeight = 128;
		anInt1114 = -1;
		anInt1143 = -1;
		aShort1135 = (short) 0;
		npcWidth = 128;
		npcName = "null";
		aBoolean1149 = false;
		aByte1141 = (byte) 4;
		aBoolean1140 = true;
		anInt1096 = -1;
		anInt1090 = 256;
		aByte1134 = (byte) -16;
		anInt1120 = -1;
		anInt1110 = -1;
		anInt1091 = 32;
		aBoolean1106 = false;
		renderEmote = -1;
		anInt1102 = -1;
		anInt1100 = -1;
		options = new String[5];
		anInt1132 = -1;
		anInt1151 = -1;
		anInt1146 = -1;
		anInt1147 = -1;
		aByte1138 = (byte) 0;
		anInt1154 = -1;
		aBoolean1153 = false;
		anInt1156 = 255;
	}
}
