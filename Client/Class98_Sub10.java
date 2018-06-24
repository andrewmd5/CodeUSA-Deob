/* Class98_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class98_Sub10 extends Node {
	Class98_Sub10[] aClass98_Sub10Array3857;
	static boolean aBoolean3858;
	Class223 aClass223_3859;
	int anInt3860;
	boolean aBoolean3861;
	static boolean aBoolean3862;
	Class16 aClass16_3863;

	int[] method990(int i, int i_0_) {
		try {
			if (i != 255)
				((Class98_Sub10) this).aClass98_Sub10Array3857 = null;
			throw new IllegalStateException(
					"This operation does not have a monochrome output");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dt.G(" + i + ','
					+ i_0_ + ')');
		}
	}

	void method991(int i, ByteBuffer class98_sub22, byte i_1_) {
		try {
			if (i_1_ > -92)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("dt.A(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i_1_ + ')'));
		}
	}

	int method992(int i) {
		try {
			int i_2_ = 27 / ((i - -20) / 33);
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dt.S(" + i + ')');
		}
	}

	void method993(int i) {
		try {
			if (i != 1002)
				aBoolean3862 = true;
			if (((Class98_Sub10) this).aBoolean3861) {
				((Class98_Sub10) this).aClass16_3863.method236(34);
				((Class98_Sub10) this).aClass16_3863 = null;
			} else {
				((Class98_Sub10) this).aClass223_3859.method2831(0);
				((Class98_Sub10) this).aClass223_3859 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dt.P(" + i + ')');
		}
	}

	final int[][] method994(int i, int i_3_, int i_4_) {
		try {
			if (i_3_ != 24431)
				((Class98_Sub10) this).aClass16_3863 = null;
			if (!((Class98_Sub10) ((Class98_Sub10) this).aClass98_Sub10Array3857[i_4_]).aBoolean3861)
				return ((Class98_Sub10) this).aClass98_Sub10Array3857[i_4_]
						.method997(-119, i);
			int[] is = ((Class98_Sub10) this).aClass98_Sub10Array3857[i_4_]
					.method990(i_3_ + -24176, i);
			int[][] is_5_ = new int[3][];
			is_5_[1] = is;
			is_5_[2] = is;
			is_5_[0] = is;
			return is_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dt.L(" + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final void method995(
			final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1,
			final byte i, final boolean bool) {
		try {
			if (Class359.anInt3058 < 400) {
				NPC npc = (class246_sub3_sub4_sub2_sub1.aClass141_6504);
				if (i != 55) {
					aBoolean3858 = true;
				}
				if (npc.anIntArray1109 != null) {
					npc = npc.method2300(Class75.aClass140_584, (byte) 120);
					if (npc == null) {
						return;
					}
				}
				if (npc.aBoolean1116) {
					String string = npc.npcName;
					if (npc.npcCombatLevel != 0) {
						final String string_6_ = ((Class64_Sub2.aClass279_3643 != Class4.aClass279_86) ? Class309.aClass309_2614
								.method3615(Class374.anInt3159, (byte) 25)
								: (Class309.aClass309_2616.method3615(
										Class374.anInt3159, (byte) 25)));
						string += ((Class108
								.method1730(
										(Surface.player.combatLevel),
										npc.npcCombatLevel, i + 16328))
								+ " (" + string_6_ + npc.npcCombatLevel + ")");
					}
					if (Class98_Sub10_Sub9.aBoolean5585 && !bool) {
						final Class149 class149 = ((Class98_Sub46_Sub1.anInt5945 ^ 0xffffffff) != 0 ? (Class98_Sub43_Sub1.aClass365_5897
								.method3940((byte) 31,
										Class98_Sub46_Sub1.anInt5945)) : null);
						if ((0x2 & Class98_Sub4.anInt3826 ^ 0xffffffff) != -1
								&& (class149 == null || ((npc.method2305(
										(Class98_Sub46_Sub1.anInt5945),
										(class149.anInt1202), (byte) 125) ^ 0xffffffff) != (class149.anInt1202 ^ 0xffffffff)))) {
							Class293.method3470(
									false,
									true,
									(((Entity) class246_sub3_sub4_sub2_sub1).anInt6369),
									Class336.anInt2823,
									0,
									(Class246_Sub3_Sub3.aString6156
											+ " -> <col=ffff00>" + string),
									false,
									0,
									48,
									(((Entity) class246_sub3_sub4_sub2_sub1).anInt6369),
									-1, false, Class287_Sub2.aString3272);
						}
					}
					if (!bool) {
						String[] strings = npc.options;
						if (Class34.aBoolean324) {
							strings = Class98_Sub10_Sub6.method1022(i ^ ~0x37b,
									strings);
						}
						if (strings != null) {
							for (int i_7_ = 4; (i_7_ ^ 0xffffffff) <= -1; i_7_--) {
								if (strings[i_7_] != null
										&& (npc.aByte1129 == 0 || !(strings[i_7_]
												.equalsIgnoreCase(Class309.aClass309_2609
														.method3615(
																Class374.anInt3159,
																(byte) 25))))) {
									int i_8_ = 0;
									if (i_7_ == 0) {
										i_8_ = 10;
									}
									int i_9_ = Class284_Sub2.anInt5186;
									if (i_7_ == 1) {
										i_8_ = 25;
									}
									if (i_7_ == 2) {
										i_8_ = 11;
									}
									if ((i_7_ ^ 0xffffffff) == -4) {
										i_8_ = 12;
									}
									if (npc.anInt1143 == i_7_) {
										i_9_ = npc.anInt1154;
									}
									if (i_7_ == 4) {
										i_8_ = 17;
									}
									if (npc.anInt1114 == i_7_) {
										i_9_ = npc.anInt1110;
									}
									Class293.method3470(
											false,
											true,
											(((Entity) class246_sub3_sub4_sub2_sub1).anInt6369),
											((strings[i_7_]
													.equalsIgnoreCase(Class309.aClass309_2609
															.method3615(
																	Class374.anInt3159,
																	(byte) 25))) ? npc.anInt1099
													: i_9_),
											0,
											"<col=ffff00>" + string,
											false,
											0,
											i_8_,
											(((Entity) class246_sub3_sub4_sub2_sub1).anInt6369),
											-1, false, strings[i_7_]);
								}
							}
						}
						if (npc.aByte1129 == 1 && strings != null) {
							for (int i_10_ = 4; i_10_ >= 0; i_10_--) {
								if (strings[i_10_] != null
										&& (strings[i_10_]
												.equalsIgnoreCase(Class309.aClass309_2609
														.method3615(
																Class374.anInt3159,
																(byte) 25)))) {
									short i_11_ = 0;
									if (((((Surface.player).combatLevel) ^ 0xffffffff) > (npc.npcCombatLevel ^ 0xffffffff)) // if
																																						// ((Not
																																						// Modified)
																																						// Player
																																						// Combat
																																						// Level
																																						// >
																																						// (Not
																																						// Modified)
																																						// Npc
																																						// Combat
																																						// level)
																																						// {
																																						// npc
																																						// doesn't
																																						// have
																																						// left
																																						// click
																																						// attack
																																						// option}
											&& npc.npcId != 6203
											&& npc.npcId != 11230
											&& npc.npcId != 13643
											&& npc.npcId != 6223
											&& npc.npcId != 6247
											&& npc.npcId != 6260
											&& npc.npcId != 2783
											&& npc.npcId != 5911
											&& !(npc.npcId >= 8349 && npc.npcId <= 8366)) {
										i_11_ = (short) 2000; // this makes it
									}
									// not have left
									// click attack
									// option
									/*
									 * System.out
									 * .println("Correct Player Combat Level: "
									 * + (((((Surface.
									 * player
									 * ).anInt6519) ^ 0xffffffff) * -1) - 1) +
									 * " (Not Modified Player Combat Level: " +
									 * (
									 * ((Surface.player
									 * ).anInt6519) ^ 0xffffffff) + ")");
									 * System.out
									 * .println("Correct Npc Combat Level: " +
									 * (((npc.npcCombatLevel ^ 0xffffffff) * -1)
									 * - 1) +
									 * " (Not Modified Npc Combat Level: " +
									 * (npc.npcCombatLevel ^ 0xffffffff) + ")");
									 * System.out.println("Npc Id: " +
									 * npc.npcId);
									 */
									short i_12_ = 0;
									if (i_10_ == 0) {
										i_12_ = (short) 10;
									}
									if ((i_10_ ^ 0xffffffff) == -2) {
										i_12_ = (short) 25;
									}
									if ((i_10_ ^ 0xffffffff) == -3) {
										i_12_ = (short) 11;
									}
									if ((i_10_ ^ 0xffffffff) == -4) {
										i_12_ = (short) 12;
									}
									if ((i_10_ ^ 0xffffffff) == -5) {
										i_12_ = (short) 17;
									}
									if ((i_12_ ^ 0xffffffff) != -1) {
										i_12_ += i_11_;
									}
									Class293.method3470(
											false,
											true,
											(((Entity) class246_sub3_sub4_sub2_sub1).anInt6369),
											npc.anInt1099,
											0,
											"<col=ffff00>" + string,
											false,
											0,
											i_12_,
											(((Entity) class246_sub3_sub4_sub2_sub1).anInt6369),
											-1, false, strings[i_10_]);
								}
							}
						}
					}
					Class293.method3470(
							false,
							true,
							((Entity) class246_sub3_sub4_sub2_sub1).anInt6369,
							Class16.anInt190,
							0,
							"<col=ffff00>" + string,
							false,
							0,
							1002,
							((Entity) class246_sub3_sub4_sub2_sub1).anInt6369,
							-1, bool, Class309.aClass309_2608.method3615(
									Class374.anInt3159, (byte) 25));
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dt.N("
					+ ((class246_sub3_sub4_sub2_sub1 != null) ? "{...}"
							: "null") + ',' + i + ',' + bool + ')'));
		}
	}

	int method996(final byte i) {
		try {
			if (i > -119) {
				return 85;
			}
			return -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dt.M(" + i + ')');
		}
	}

	int[][] method997(final int i, final int i_13_) {
		try {
			if (i > -76) {
				method999((byte) 1);
			}
			throw new IllegalStateException(
					"This operation does not have a colour output");
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dt.C(" + i + ','
					+ i_13_ + ')');
		}
	}

	void method998(final int i, final int i_14_, final int i_15_) {
		try {
			final int i_16_ = (i_15_ == (anInt3860 ^ 0xffffffff) ? i
					: anInt3860);
			if (aBoolean3861) {
				aClass16_3863 = new Class16(i_16_, i, i_14_);
			} else {
				aClass223_3859 = new Class223(i_16_, i, i_14_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dt.O(" + i + ','
					+ i_14_ + ',' + i_15_ + ')'));
		}
	}

	static final void method999(final byte i) {
		try {
			if ((Class177.anInt1376 ^ 0xffffffff) != -4) {
				if ((Class177.anInt1376 ^ 0xffffffff) == -8) {
					Class61.method538(8, false);
				} else if (Class177.anInt1376 == 10) {
					Class61.method538(11, false);
				}
			} else {
				Class61.method538(4, false);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dt.R(" + i + ')');
		}
	}

	Class98_Sub10(final int i, final boolean bool) {
		try {
			aBoolean3861 = bool;
			aClass98_Sub10Array3857 = new Class98_Sub10[i];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dt.<init>(" + i
					+ ',' + bool + ')');
		}
	}

	final int[] method1000(final int i, final int i_18_, final int i_19_) {
		try {
			if (i_19_ != 0) {
				method993(-48);
			}
			if (aClass98_Sub10Array3857[i_18_].aBoolean3861) {
				return aClass98_Sub10Array3857[i_18_].method990(255, i);
			}
			return (aClass98_Sub10Array3857[i_18_].method997(-94, i)[0]);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dt.Q(" + i + ','
					+ i_18_ + ',' + i_19_ + ')'));
		}
	}

	void method1001(final byte i) {
		try {
			if (i != 66) {
				anInt3860 = 121;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dt.I(" + i + ')');
		}
	}
}
