/* Class246_Sub3_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub4_Sub1 extends Class246_Sub3_Sub4 implements
		Interface19 {
	private byte aByte6232;
	private byte aByte6233;
	private boolean aBoolean6234;
	private boolean aBoolean6235;
	private Class228 aClass228_6236;
	private boolean aBoolean6237;
	private short aShort6238;
	private boolean aBoolean6239;
	static Class279 aClass279_6240 = new Class279("game3", 2);
	static int anInt6241;
	private r aR6242;
	AbstractModel aClass146_6243;
	static boolean aBoolean6244 = false;

	@Override
	final boolean method2987(final int i) {
		try {
			if (aClass146_6243 != null) {
				return aClass146_6243.F();
			}
			if (i != 6540) {
				method2985(true);
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mb.I(" + i + ')');
		}
	}

	@Override
	public final void method67(final int i, final ha var_ha) {
		do {
			try {
				r var_r;
				if (aR6242 == null && aBoolean6239) {
					final Class298 class298 = method3028(262144, (byte) 101,
							var_ha, true);
					var_r = (class298 == null ? null : class298.aR2479);
				} else {
					var_r = aR6242;
					aR6242 = null;
				}
				if (var_r != null) {
					Class268.method3254(var_r,
							((Class246_Sub3) this).aByte5081,
							((Class246_Sub3) this).anInt5084,
							((Class246_Sub3) this).anInt5079, null);
				}
				if (i == -25163) {
					break;
				}
				aBoolean6235 = true;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("mb.E(" + i
						+ ',' + (var_ha != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final Class246_Sub1 method2975(final ha var_ha, final int i) {
		try {
			if (aClass146_6243 == null) {
				return null;
			}
			final Class111 class111 = var_ha.method1793();
			class111.method2100(((Class246_Sub3) this).anInt5084,
					((Class246_Sub3) this).anInt5089,
					((Class246_Sub3) this).anInt5079);
			if (i >= -12) {
				method2992((byte) -76);
			}
			final Class246_Sub1 class246_sub1 = Class94.method915(1,
					(byte) -47, aBoolean6234);
			do {
				if (Class239.aBoolean1839) {
					aClass146_6243.method2329(class111,
							(class246_sub1.aClass246_Sub6Array5067[0]),
							Class16.anInt197, 0);
					if (!client.aBoolean3553) {
						break;
					}
				}
				aClass146_6243.method2325(class111,
						(class246_sub1.aClass246_Sub6Array5067[0]), 0);
			} while (false);
			return class246_sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mb.QA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	public final int method64(final int i) {
		try {
			if (i != 30472) {
				method2981(null, (byte) 46, false, -115, null, -54, -101);
			}
			return 0xffff & aShort6238;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mb.C(" + i + ')');
		}
	}

	static final void method3025(final byte i) {
		do {
			try {
				if ((Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub15_4058
						.method612((byte) 125) ^ 0xffffffff) == -3) {
					final byte i_0_ = (byte) (Class64_Sub15.anInt3676 + -4 & 0xff);
					final int i_1_ = Class64_Sub15.anInt3676
							% Class165.anInt1276;
					for (int i_2_ = 0; i_2_ < 4; i_2_++) {
						for (int i_3_ = 0; Class98_Sub10_Sub7.anInt5572 > i_3_; i_3_++) {
							OutputStream_Sub2.aByteArrayArrayArray41[i_2_][i_1_][i_3_] = i_0_;
						}
					}
					if (Class43.anInt377 != 3) {
						int i_4_ = 0;
						if (i != 72) {
							method3029(-45);
						}
						for (/**/; (i_4_ ^ 0xffffffff) > -3; i_4_++) {
							Class204.anIntArray1551[i_4_] = -1000000;
							Class336.anIntArray2826[i_4_] = 1000000;
							Class287.anIntArray2195[i_4_] = 0;
							Class48_Sub1_Sub2.anIntArray5518[i_4_] = 1000000;
							Class295.anIntArray2409[i_4_] = 0;
						}
						int i_5_ = (((Class246_Sub3) Surface.player).anInt5084);
						int i_6_ = (((Class246_Sub3) Surface.player).anInt5079);
						if (((Class98_Sub46_Sub20_Sub2.anInt6319 ^ 0xffffffff) == -2)
								|| (Class116.anInt967 ^ 0xffffffff) != 0) {
							if (Class98_Sub46_Sub20_Sub2.anInt6319 != 1) {
								i_6_ = Class64_Sub26.anInt3712;
								i_5_ = Class116.anInt967;
							}
							if (((Class281.aByteArrayArrayArray2117[Class43.anInt377][i_5_ >> 819933737][i_6_ >> -1734096311]) & 0x4) != 0) {
								Class253.method3175(
										i_5_ >> 302605065,
										0,
										(Class98_Sub46_Sub1.aClass172ArrayArrayArray5948),
										i_6_ >> 68371017, (byte) -76, false);
							}
							if ((Entity.anInt6357 ^ 0xffffffff) > -2561) {
								int i_7_ = (Class98_Sub46_Sub10.anInt6020 >> 813546185);
								int i_8_ = Class134.anInt3461 >> -794721367;
								final int i_9_ = i_5_ >> 847752841;
								final int i_10_ = i_6_ >> -43834903;
								int i_11_;
								if ((i_9_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff)) {
									i_11_ = i_9_ + -i_7_;
								} else {
									i_11_ = -i_9_ + i_7_;
								}
								int i_12_;
								if ((i_8_ ^ 0xffffffff) <= (i_10_ ^ 0xffffffff)) {
									i_12_ = i_8_ - i_10_;
								} else {
									i_12_ = -i_8_ + i_10_;
								}
								if ((i_11_ ^ 0xffffffff) == -1
										&& i_12_ == 0
										|| ((i_11_ ^ 0xffffffff) >= (-Class165.anInt1276 ^ 0xffffffff))
										|| ((Class165.anInt1276 ^ 0xffffffff) >= (i_11_ ^ 0xffffffff))
										|| -Class98_Sub10_Sub7.anInt5572 >= i_12_
										|| i_12_ >= Class98_Sub10_Sub7.anInt5572) {
									Class305_Sub1
											.method3585(
													null,
													-127,
													("RC: "
															+ i_7_
															+ ","
															+ i_8_
															+ " "
															+ i_9_
															+ ","
															+ i_10_
															+ " "
															+ Class272.anInt2038
															+ "," + aa_Sub2.anInt3562));
								} else if (i_11_ > i_12_) {
									final int i_13_ = i_12_ * 65536 / i_11_;
									int i_14_ = 32768;
									while ((i_7_ ^ 0xffffffff) != (i_9_ ^ 0xffffffff)) {
										if ((i_9_ ^ 0xffffffff) >= (i_7_ ^ 0xffffffff)) {
											if (i_9_ < i_7_) {
												i_7_--;
											}
										} else {
											i_7_++;
										}
										if ((0x4 & (Class281.aByteArrayArrayArray2117[Class43.anInt377][i_7_][i_8_])) != 0) {
											Class253.method3175(
													i_7_,
													1,
													(Class98_Sub46_Sub1.aClass172ArrayArrayArray5948),
													i_8_, (byte) -76, false);
											break;
										}
										i_14_ += i_13_;
										if ((i_14_ ^ 0xffffffff) <= -65537) {
											if ((i_10_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff)) {
												i_8_++;
											} else if (i_8_ > i_10_) {
												i_8_--;
											}
											i_14_ -= 65536;
											if (((Class281.aByteArrayArrayArray2117[Class43.anInt377][i_7_][i_8_]) & 0x4) != 0) {
												Class253.method3175(
														i_7_,
														1,
														(Class98_Sub46_Sub1.aClass172ArrayArrayArray5948),
														i_8_, (byte) -76, false);
												break;
											}
										}
									}
								} else {
									final int i_15_ = 65536 * i_11_ / i_12_;
									int i_16_ = 32768;
									while (i_10_ != i_8_) {
										if ((i_10_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff)) {
											if ((i_8_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff)) {
												i_8_--;
											}
										} else {
											i_8_++;
										}
										if (((Class281.aByteArrayArrayArray2117[Class43.anInt377][i_7_][i_8_]) & 0x4) != 0) {
											Class253.method3175(
													i_7_,
													1,
													(Class98_Sub46_Sub1.aClass172ArrayArrayArray5948),
													i_8_, (byte) -76, false);
											break;
										}
										i_16_ += i_15_;
										if (i_16_ >= 65536) {
											if (i_9_ <= i_7_) {
												if ((i_7_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff)) {
													i_7_--;
												}
											} else {
												i_7_++;
											}
											i_16_ -= 65536;
											if ((0x4 & (Class281.aByteArrayArrayArray2117[Class43.anInt377][i_7_][i_8_])) != 0) {
												Class253.method3175(
														i_7_,
														1,
														(Class98_Sub46_Sub1.aClass172ArrayArrayArray5948),
														i_8_, (byte) -76, false);
												break;
											}
										}
									}
								}
							}
							break;
						}
						final int i_17_ = (Class98_Sub46_Sub2_Sub2.method1538(
								Class43.anInt377, Class134.anInt3461,
								Class98_Sub46_Sub10.anInt6020, 24111));
						if (i_17_ + -Class79.anInt601 >= 3200
								|| ((0x4 & (Class281.aByteArrayArrayArray2117[Class43.anInt377][(Class98_Sub46_Sub10.anInt6020 >> 2064460777)][Class134.anInt3461 >> -1481382711])) == 0)) {
							break;
						}
						Class253.method3175(
								(Class98_Sub46_Sub10.anInt6020 >> 1855536521),
								1,
								(Class98_Sub46_Sub1.aClass172ArrayArrayArray5948),
								Class134.anInt3461 >> 510517769, (byte) -76,
								false);
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "mb.M(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method2988(final ha var_ha, final int i) {
		try {

		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mb.MA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final int method2990(final int i) {
		try {
			if (i != 0) {
				aClass146_6243 = null;
			}
			if (aClass146_6243 == null) {
				return 0;
			}
			return aClass146_6243.fa();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mb.J(" + i + ')');
		}
	}

	@Override
	final void method2992(final byte i) {
		do {
			try {
				if (i != -73) {
					method2992((byte) -74);
				}
				aBoolean6235 = false;
				if (aClass146_6243 == null) {
					break;
				}
				aClass146_6243.s(~0x10000 & aClass146_6243.ua());
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "mb.DA(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	private final AbstractModel method3026(final int i, final int i_19_,
			final ha var_ha) {
		try {
			if (aClass146_6243 != null
					&& (var_ha.c(aClass146_6243.ua(), i_19_) ^ 0xffffffff) == -1) {
				return aClass146_6243;
			}
			if (i >= -20) {
				return null;
			}
			final Class298 class298 = method3028(i_19_, (byte) 123, var_ha,
					false);
			if (class298 != null) {
				return class298.aClass146_2477;
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mb.P(" + i + ','
					+ i_19_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final Class228 method2974(final byte i, final ha var_ha) {
		try {
			if (i != -53) {
				return null;
			}
			if (aClass228_6236 == null) {
				aClass228_6236 = (Class48_Sub2_Sub1.method472(
						((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5084,
						method3026(-128, 0, var_ha),
						((Class246_Sub3) this).anInt5079, i ^ ~0x30));
			}
			return aClass228_6236;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mb.KA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	Class246_Sub3_Sub4_Sub1(final ha var_ha,
			final GameObjectDefinition class352, final int i, final int i_20_,
			final int i_21_, final int i_22_, final int i_23_,
			final boolean bool, final int i_24_, final int i_25_,
			final int i_26_, final int i_27_, final int i_28_, final int i_29_,
			final boolean bool_30_) {
		super(i, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, i_27_,
				class352.anInt2975 == 1, Class246_Sub3_Sub4_Sub5.method3088(
						i_28_, (byte) -41, i_29_));
		do {
			try {
				aBoolean6235 = bool_30_;
				aBoolean6237 = bool;
				aByte6233 = (byte) i_29_;
				aShort6238 = (short) class352.id;
				aBoolean6234 = ((class352.anInt2998 ^ 0xffffffff) != -1 && !bool);
				((Class246_Sub3) this).aByte5081 = (byte) i_20_;
				aByte6232 = (byte) i_28_;
				aBoolean6239 = (var_ha.method1771() && class352.aBoolean2935
						&& !aBoolean6237 && (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub7_4073
						.method579((byte) 127) ^ 0xffffffff) != -1);
				int i_31_ = 2048;
				if (aBoolean6235) {
					i_31_ |= 0x10000;
				}
				final Class298 class298 = method3028(i_31_, (byte) 95, var_ha,
						aBoolean6239);
				if (class298 == null) {
					break;
				}
				aR6242 = class298.aR2479;
				aClass146_6243 = class298.aClass146_2477;
				if (!aBoolean6235) {
					break;
				}
				aClass146_6243 = aClass146_6243.method2341((byte) 0, i_31_,
						false);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("mb.<init>(" + (var_ha != null ? "{...}" : "null")
								+ ',' + (class352 != null ? "{...}" : "null")
								+ ',' + i + ',' + i_20_ + ',' + i_21_ + ','
								+ i_22_ + ',' + i_23_ + ',' + bool + ','
								+ i_24_ + ',' + i_25_ + ',' + i_26_ + ','
								+ i_27_ + ',' + i_28_ + ',' + i_29_ + ','
								+ bool_30_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final boolean method2976(final int i, final ha var_ha, final byte i_32_,
			final int i_33_) {
		try {
			if (i_32_ <= 59) {
				aBoolean6234 = false;
			}
			final AbstractModel abstractModel = method3026(-120, 131072, var_ha);
			if (abstractModel != null) {
				final Class111 class111 = var_ha.method1793();
				class111.method2100(((Class246_Sub3) this).anInt5084,
						((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5079);
				if (!Class239.aBoolean1839) {
					return abstractModel.method2339(i, i_33_, class111, false, 0);
				}
				return abstractModel.method2333(i, i_33_, class111, false, 0,
						Class16.anInt197);
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mb.TA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_32_ + ','
					+ i_33_ + ')'));
		}
	}

	@Override
	final boolean method2978(final int i) {
		try {
			if (aClass146_6243 != null) {
				if (aClass146_6243.r()) {
					return false;
				}
				return true;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mb.H(" + i + ')');
		}
	}

	@Override
	public final boolean method65(final boolean bool) {
		try {
			if (bool != true) {
				aClass228_6236 = null;
			}
			return aBoolean6239;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mb.A(" + bool
					+ ')');
		}
	}

	final int method3027(final int i) {
		try {
			if (i <= 20) {
				aClass279_6240 = null;
			}
			if (aClass146_6243 != null) {
				return (aClass146_6243.na() / 4);
			}
			return 15;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mb.K(" + i + ')');
		}
	}

	@Override
	final int method2985(final boolean bool) {
		try {
			if (bool != false) {
				return -120;
			}
			if (aClass146_6243 != null) {
				return aClass146_6243.ma();
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mb.O(" + bool
					+ ')');
		}
	}

	@Override
	final boolean method2982(final byte i) {
		try {
			if (i >= -70) {
				anInt6241 = -94;
			}
			return aBoolean6235;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mb.HA(" + i + ')');
		}
	}

	private final Class298 method3028(final int i, final byte i_35_,
			final ha var_ha, final boolean bool) {
		try {
			if (i_35_ < 69) {
				method61((byte) -69);
			}
			final GameObjectDefinition class352 = Class130.aClass302_1028
					.method3546(aShort6238 & 0xffff, (byte) 119);
			s var_s;
			s var_s_36_;
			if (!aBoolean6237) {
				if ((((Class246_Sub3) this).aByte5081 ^ 0xffffffff) <= -4) {
					var_s = null;
				} else {
					var_s = (Class98_Sub46_Sub2_Sub2.aSArray6298[1 + ((Class246_Sub3) this).aByte5081]);
				}
				var_s_36_ = (Class98_Sub46_Sub2_Sub2.aSArray6298[((Class246_Sub3) this).aByte5081]);
			} else {
				var_s = Class98_Sub46_Sub2_Sub2.aSArray6298[0];
				var_s_36_ = Class81.aSArray618[((Class246_Sub3) this).aByte5081];
			}
			return class352.method3851(((Class246_Sub3) this).anInt5079, false,
					var_s,
					((aByte6232 ^ 0xffffffff) == -12 ? (int) (aByte6233 + 4)
							: aByte6233), ((Class246_Sub3) this).anInt5089,
					bool, ((Class246_Sub3) this).anInt5084, i, null, var_s_36_,
					var_ha, aByte6232 != 11 ? aByte6232 : 10);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mb.D(" + i + ','
					+ i_35_ + ',' + (var_ha != null ? "{...}" : "null") + ','
					+ bool + ')'));
		}
	}

	@Override
	final void method2981(final Class246_Sub3 class246_sub3, final byte i,
			final boolean bool, final int i_37_, final ha var_ha,
			final int i_38_, final int i_39_) {
		try {
			do {
				if (class246_sub3 instanceof Class246_Sub3_Sub3_Sub2) {
					final Class246_Sub3_Sub3_Sub2 class246_sub3_sub3_sub2 = (Class246_Sub3_Sub3_Sub2) class246_sub3;
					if (aClass146_6243 == null
							|| (class246_sub3_sub3_sub2.aClass146_6285) == null) {
						break;
					}
					aClass146_6243.method2332(
							(class246_sub3_sub3_sub2.aClass146_6285), i_37_,
							i_38_, i_39_, bool);
					if (!client.aBoolean3553) {
						break;
					}
				}
				if (class246_sub3 instanceof Class246_Sub3_Sub4_Sub1) {
					final Class246_Sub3_Sub4_Sub1 class246_sub3_sub4_sub1_40_ = (Class246_Sub3_Sub4_Sub1) class246_sub3;
					if (aClass146_6243 != null
							&& (class246_sub3_sub4_sub1_40_.aClass146_6243 != null)) {
						aClass146_6243.method2332(
								class246_sub3_sub4_sub1_40_.aClass146_6243,
								i_37_, i_38_, i_39_, bool);
					}
				}
			} while (false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mb.CA("
					+ (class246_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + bool + ',' + i_37_ + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_38_ + ','
					+ i_39_ + ')'));
		}
	}

	@Override
	public final void method62(final ha var_ha, final int i) {
		do {
			try {
				r var_r;
				if (aR6242 != null || !aBoolean6239) {
					var_r = aR6242;
					aR6242 = null;
				} else {
					final Class298 class298 = method3028(262144, (byte) 85,
							var_ha, true);
					var_r = (class298 != null ? class298.aR2479 : null);
				}
				if (i != 24447) {
					method2990(94);
				}
				if (var_r == null) {
					break;
				}
				Class184.method2626(var_r, ((Class246_Sub3) this).aByte5081,
						((Class246_Sub3) this).anInt5084,
						((Class246_Sub3) this).anInt5079, null);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("mb.G("
						+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	@Override
	public final int method66(final int i) {
		try {
			if (i != 4657) {
				return 91;
			}
			return aByte6233;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mb.N(" + i + ')');
		}
	}

	@Override
	public final int method63(final byte i) {
		try {
			if (i != 20) {
				method2992((byte) 9);
			}
			return aByte6232;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mb.B(" + i + ')');
		}
	}

	public static void method3029(final int i) {
		do {
			try {
				aClass279_6240 = null;
				if (i == -1) {
					break;
				}
				method3025((byte) -65);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "mb.L(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	public final void method61(final byte i) {
		do {
			try {
				if (aClass146_6243 != null) {
					aClass146_6243.method2326();
				}
				if (i == -96) {
					break;
				}
				aBoolean6234 = false;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "mb.Q(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
