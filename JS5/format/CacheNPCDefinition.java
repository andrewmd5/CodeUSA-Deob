package org.codeusa.cache.format;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.codeusa.cache.CacheConstants;
import org.codeusa.cache.CacheManager;
import org.codeusa.cache.stream.RSByteBuffer;

public class CacheNPCDefinition {

	private static HashMap<Integer, CacheNPCDefinition> npcDefs = new HashMap<Integer, CacheNPCDefinition>();

	int id;
	int anInt3164 = -1;
	private short[] aShortArray3166;
	int anInt3167;
	boolean aBoolean3169;
	int configFileId;
	boolean aBoolean3172;
	int anInt3173;
	int anInt3178 = -1;
	int anInt3179;
	String[] options;
	int anInt3181;
	int anInt3182;
	private short[] aShortArray3183;
	int anInt3184;
	boolean aBoolean3187;
	boolean aBoolean3190;
	boolean isVisibleOnMap;
	private int[] anIntArray3192;
	byte aByte3193;
	Object aClass183_3195;
	boolean aBoolean3196;
	int anInt3200;
	private short[] aShortArray3201;
	int[] childrenIds;
	int anInt3203;
	private short[] aShortArray3204;
	private byte[] aByteArray3205;
	public int renderEmote;
	byte aByte3207;
	int configId;
	int anInt3209;
	boolean aBoolean3210;
	int anInt3212;
	short aShort3213;
	int anInt3214;
	byte aByte3215;
	int anInt3216;
	public String name;
	public int combatLevel;
	int[] anIntArray3219;
	boolean isClickable;
	int headIcons;
	int anInt3223;
	public byte direction;
	int anInt3226;
	int anInt3227;
	private int[] anIntArray3230;
	byte aByte3233;
	int anInt3235;
	public int size;
	short aShort3237;

	public static CacheNPCDefinition forID(final int npcID) {
		CacheNPCDefinition npcDef = npcDefs.get(npcID);
		if (npcDef != null) {
			return npcDef;
		}
		byte[] is = null;
		try {
			is = CacheManager.getData(CacheConstants.NPCDEF_IDX_ID,
					npcID >>> 7, npcID & 0x7f);
		} catch (final Exception e) {
			// ignore :P
		}
		npcDef = new CacheNPCDefinition();
		npcDef.id = npcID;
		if (is != null) {
			try {
				npcDef.readValueLoop(new RSByteBuffer(new ByteArrayInputStream(
						is)));
			} catch (final IOException e) {
				System.out.println("Could not load Npc " + npcID);
			} catch (final Exception e) {
				e.printStackTrace();
			}
		}
		npcDefs.put(npcID, npcDef);
		return npcDef;
	}

	private void readValueLoop(final RSByteBuffer stream) throws Exception {
		for (;;) {
			final int i = stream.readByte() & 0xFF;
			if (i == 0) {
				break;
			}
			readValues(i, stream);
		}
	}

	/*
	 * private void method2703() { if ((~aByte3460) == 0) { } if (anIntArray3495
	 * == null) anIntArray3495 = new int[0]; }
	 */

	private void readValues(final int opcode, final RSByteBuffer stream)
			throws Exception {
		switch (opcode) {
		case 163:
			stream.readByte();
			break;
		case 164:
			stream.readShort();
			stream.readShort();
			break;
		case 165:
			stream.readByte();
			break;
		case 168:
			stream.readByte();
			break;
		}
		if (opcode != 1) {
			if (opcode == 2) {
				name = stream.readRS2String();
			}
			if (id == 1597) {
				name = "Paladin Tyrael";
			} else if (opcode != 12) {
				if ((opcode < 30) || (opcode >= 35)) {
					if (opcode == 40) {
						final int i_1_ = stream.readUnsignedByte();
						aShortArray3166 = new short[i_1_];
						aShortArray3201 = new short[i_1_];
						for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
							aShortArray3201[i_2_] = (short) stream
									.readUnsignedShort();
							aShortArray3166[i_2_] = (short) stream
									.readUnsignedShort();
						}
					} else if (opcode != 41) {
						if (opcode != 42) {
							if (opcode != 60) {
								if (opcode == 93) {
									isVisibleOnMap = false;
								} else if (opcode == 95) {
									combatLevel = stream.readUnsignedShort();
								} else if (opcode != 97) {
									if (opcode != 98) {
										if (opcode == 99) {
											aBoolean3210 = true;
										} else if (opcode == 100) {
											stream.readByte();
										} else if (opcode == 101) {
											stream.readByte();
										} else if (opcode == 102) {
											headIcons = stream
													.readUnsignedShort();
										} else if (opcode == 103) {
											anInt3235 = stream
													.readUnsignedShort();
										} else if ((opcode != 106)
												&& (opcode != 118)) {
											if (opcode != 107) {
												if (opcode == 109) {
													aBoolean3169 = false;
												} else if (opcode != 111) {
													if (opcode == 113) {
														aShort3213 = (short) stream
																.readUnsignedShort();
														aShort3237 = (short) stream
																.readUnsignedShort();
													} else if (opcode == 114) {
														aByte3215 = stream
																.readByte();
														aByte3193 = stream
																.readByte();
													} else if (opcode != 119) {
														if (opcode != 121) {
															if (opcode != 122) {
																if (opcode == 123) {
																	anInt3203 = stream
																			.readUnsignedShort();
																} else if (opcode != 125) {
																	if (opcode == 127) {
																		renderEmote = stream
																				.readUnsignedShort();
																	} else if (opcode != 128) {
																		if (opcode == 134) {
																			anInt3173 = stream
																					.readUnsignedShort();
																			if (anInt3173 == 65535) {
																				anInt3173 = -1;
																			}
																			anInt3212 = stream
																					.readUnsignedShort();
																			if (anInt3212 == 65535) {
																				anInt3212 = -1;
																			}
																			anInt3226 = stream
																					.readUnsignedShort();
																			if (anInt3226 == 65535) {
																				anInt3226 = -1;
																			}
																			anInt3179 = stream
																					.readUnsignedShort();
																			if (anInt3179 == 65535) {
																				anInt3179 = -1;
																			}
																			anInt3184 = stream
																					.readUnsignedByte();
																		} else if (opcode == 135) {
																			anInt3214 = stream
																					.readUnsignedByte();
																			anInt3178 = stream
																					.readUnsignedShort();
																		} else if (opcode != 136) {
																			if (opcode == 137) {
																				anInt3223 = stream
																						.readUnsignedShort();
																			} else if (opcode == 138) {
																				anInt3167 = stream
																						.readUnsignedShort();
																			} else if (opcode != 139) {
																				if (opcode == 140) {
																					anInt3216 = stream
																							.readUnsignedByte();
																				} else if (opcode == 141) {
																					aBoolean3187 = true;
																				} else if (opcode == 142) {
																					anInt3200 = stream
																							.readUnsignedShort();
																				} else if (opcode != 143) {
																					if ((opcode < 150)
																							|| (opcode >= 155)) {
																						if (opcode == 155) {
																							stream.readByte();
																							stream.readByte();
																							stream.readByte();
																							stream.readByte();
																						} else if (opcode != 158) {
																							if (opcode == 159) {
																								aByte3233 = (byte) 0;
																							} else if (opcode != 160) {
																								if (opcode != 161) {
																									if (opcode == 249) {
																										final int i_3_ = stream
																												.readUnsignedByte();
																										for (int i_5_ = 0; i_3_ > i_5_; i_5_++) {
																											final boolean bool = stream
																													.readUnsignedByte() == 1;
																											stream.read24BitInt();
																											// System.out.println("ScriptID "
																											// +
																											// i_6_);
																											if (!bool) {
																												stream.readInt();
																												// System.out.println("Script NPC INTEGER: "
																												// +
																												// stream.readInt());
																											} else {
																												stream.readRS2String();
																												// System.out.println("Script NPC STRING: "
																												// +
																												// stream.readRS2String());
																											}
																										}
																									}
																								} else {
																									aBoolean3190 = true;
																								}
																							} else {
																								final int i_7_ = stream
																										.readUnsignedByte();
																								anIntArray3219 = new int[i_7_];
																								for (int i_8_ = 0; i_7_ > i_8_; i_8_++) {
																									anIntArray3219[i_8_] = stream
																											.readUnsignedShort();
																								}
																							}
																						} else {
																							aByte3233 = (byte) 1;
																						}
																					} else {
																						options[opcode - 150] = stream
																								.readRS2String();
																						/*
																						 * if
																						 * (
																						 * !
																						 * (
																						 * (
																						 * Class183
																						 * )
																						 * aClass183_3195
																						 * )
																						 * .
																						 * aBoolean2484
																						 * )
																						 * options
																						 * [
																						 * opcode
																						 * +
																						 * -
																						 * 150
																						 * ]
																						 * =
																						 * null
																						 * ;
																						 */
																					}
																				} else {
																					aBoolean3196 = true;
																				}
																			} else {
																				anInt3164 = stream
																						.readUnsignedShort();
																			}
																		} else {
																			anInt3181 = stream
																					.readUnsignedByte();
																			anInt3227 = stream
																					.readUnsignedShort();
																		}
																	} else {
																		stream.readUnsignedByte();
																	}
																} else {
																	direction = stream
																			.readByte();
																}
															} else {
																anInt3182 = stream
																		.readUnsignedShort();
															}
														} else {
															final int i_9_ = stream
																	.readUnsignedByte();
															for (int i_10_ = 0; i_9_ > i_10_; i_10_++) {
																stream.readUnsignedByte();
																final int[] is = new int[3];
																is[0] = stream
																		.readByte();
																is[1] = stream
																		.readByte();
																is[2] = stream
																		.readByte();
															}
														}
													} else {
														aByte3207 = stream
																.readByte();
													}
												} else {
													aBoolean3172 = false;
												}
											} else {
												isClickable = false;
											}
										} else {
											configFileId = stream
													.readUnsignedShort();
											if (configFileId == 65535) {
												configFileId = -1;
											}
											configId = stream
													.readUnsignedShort();
											if (configId == 65535) {
												configId = -1;
											}
											int i_12_ = -1;
											if (opcode == 118) {
												i_12_ = stream
														.readUnsignedShort();
												if (i_12_ == 65535) {
													i_12_ = -1;
												}
											}
											final int i_13_ = stream
													.readUnsignedByte();
											childrenIds = new int[2 + i_13_];
											for (int i_14_ = 0; i_14_ <= i_13_; i_14_++) {
												childrenIds[i_14_] = stream
														.readUnsignedShort();
												if (childrenIds[i_14_] == 65535) {
													childrenIds[i_14_] = -1;
												}
											}
											childrenIds[1 + i_13_] = i_12_;
										}
									} else {
										stream.readUnsignedShort();
									}
								} else {
									stream.readUnsignedShort();
								}
							} else {
								final int i_15_ = stream.readUnsignedByte();
								anIntArray3192 = new int[i_15_];
								for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
									anIntArray3192[i_16_] = stream
											.readUnsignedShort();
								}
							}
						} else {
							final int i_17_ = stream.readUnsignedByte();
							aByteArray3205 = new byte[i_17_];
							for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
								aByteArray3205[i_18_] = stream.readByte();
							}
						}
					} else {
						final int i_19_ = stream.readUnsignedByte();
						aShortArray3183 = new short[i_19_];
						aShortArray3204 = new short[i_19_];
						for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
							aShortArray3183[i_20_] = (short) stream
									.readUnsignedShort();
							aShortArray3204[i_20_] = (short) stream
									.readUnsignedShort();
						}
					}
				} else {
					options[opcode - 30] = stream.readRS2String();
				}
			} else {
				if (id == 5911) {
					size = 5;
				} else if (id == 13028) {
					size = 5;
				} else {

					size = stream.readUnsignedByte();
				}
			}
		} else {
			final int i_21_ = stream.readUnsignedByte();
			anIntArray3230 = new int[i_21_];
			for (int i_22_ = 0; i_21_ > i_22_; i_22_++) {
				anIntArray3230[i_22_] = stream.readUnsignedShort();
				if (anIntArray3230[i_22_] == 65535) {
					anIntArray3230[i_22_] = -1;
				}
			}
		}
	}

	private CacheNPCDefinition() {
		aBoolean3172 = true;
		options = new String[5];
		aBoolean3169 = true;
		aBoolean3196 = false;
		anInt3200 = -1;
		anInt3173 = -1;
		anInt3167 = -1;
		anInt3179 = -1;
		renderEmote = -1;
		aByte3193 = (byte) -16;
		anInt3184 = 0;
		anInt3214 = -1;
		aBoolean3210 = false;
		aByte3207 = (byte) 0;
		aByte3215 = (byte) -96;
		anInt3181 = -1;
		configId = -1;
		anInt3216 = 255;
		isVisibleOnMap = true;
		anInt3212 = -1;
		anInt3226 = -1;
		anInt3203 = -1;
		aBoolean3187 = false;
		anInt3227 = -1;
		anInt3223 = -1;
		direction = (byte) 4;
		configFileId = -1;
		combatLevel = -1;
		isClickable = true;
		headIcons = -1;
		anInt3235 = 32;
		aShort3213 = (short) 0;
		aByte3233 = (byte) -1;
		name = "null";
		anInt3182 = -1;
		size = 1;
		aShort3237 = (short) 0;
	}

	public int getHeadIcon() {
		return headIcons;
	}

	public int getId() {
		return id;
	}

	public int getSize() {
		return size;
	}

	public boolean hasAttackOption() {
		if (id == 5911) {
			return true;
		}
		for (final String option : options) {
			if ((option != null) && option.equalsIgnoreCase("attack")) {
				return true;
			}
		}
		return false;
	}

	public boolean hasMarkOption() {
		for (final String option : options) {
			if ((option != null) && option.equalsIgnoreCase("mark")) {
				return true;
			}
		}
		return false;
	}

	public boolean hasOption(final String op) {
		for (final String option : options) {
			if ((option != null) && option.equalsIgnoreCase(op)) {
				return true;
			}
		}
		return false;
	}

	public String[] getOptions() {
		return options;
	}

	public void printUnidentified() {
		System.out.println(new StringBuilder("int3200: ").append(anInt3200)
				.append(" anInt3173: ").append(anInt3173)
				.append(" anInt3167: ").append(anInt3167)
				.append(" anInt3179: ").append(anInt3179)
				.append(" anInt3214: ").append(anInt3214)
				.append(" anInt3181: ").append(anInt3181)
				.append(" anInt3212: ").append(anInt3212)
				.append(" anInt3226: ").append(anInt3226)
				.append(" anInt3203: ").append(anInt3203)
				.append(" anInt3227: ").append(anInt3227)
				.append(" anInt3223: ").append(anInt3223)
				.append(" anInt3182: ").append(anInt3182));
	}

	public String getName() {

		return name;
	}
}
