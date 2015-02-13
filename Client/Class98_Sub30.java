/* Class98_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import java.io.File;
import java.lang.reflect.Method;

final class Class98_Sub30 extends Class98 {
	int anInt4084;
	private Interface2_Impl1 anInterface2_Impl1_4085;
	int anInt4086;
	private ha_Sub3 aHa_Sub3_4087;
	static Class164 aClass164_4088 = new Class164(1);
	private NativeHeapBuffer aNativeHeapBuffer4089;
	int anInt4090;
	int anInt4091;
	float aFloat4092;
	private Stream aStream4093;
	static IncomingOpcode aClass58_4094;
	private int[] anIntArray4095;
	static float[] aFloatArray4096 = new float[16];
	private s_Sub2 aS_Sub2_4097;
	int anInt4098 = 0;
	static Class155[] aClass155Array4099;
	/* synthetic */static Class aClass4100;

	static final void method1311(final boolean bool, final boolean bool_0_,
			final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2) {
		do {
			try {
				if ((Class359.anInt3058 ^ 0xffffffff) > -401) {
					if (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660 == class246_sub3_sub4_sub2_sub2) {
						if (Class98_Sub10_Sub9.aBoolean5585
								&& (0x10 & Class98_Sub4.anInt3826) != 0) {
							Class293.method3470(
									false,
									true,
									0L,
									Class336.anInt2823,
									0,
									(Class246_Sub3_Sub3.aString6156
											+ " -> <col=ffffff>" + (Class309.aClass309_2623
											.method3615(Class374.anInt3159,
													(byte) 25))),
									false,
									0,
									57,
									(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6369),
									-1, false, Class287_Sub2.aString3272);
						}
					} else if (bool_0_ == true) {
						String string;
						if (class246_sub3_sub4_sub2_sub2.anInt6539 == 0) {
							boolean bool_1_ = true;
							if (((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.anInt6535) ^ 0xffffffff) != 0
									&& (class246_sub3_sub4_sub2_sub2.anInt6535 ^ 0xffffffff) != 0) {
								final int i = ((((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt6535) >= (class246_sub3_sub4_sub2_sub2.anInt6535)) ? (class246_sub3_sub4_sub2_sub2.anInt6535)
										: ((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt6535));
								int i_2_ = (((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt6519) - (class246_sub3_sub4_sub2_sub2.anInt6519));
								if ((i_2_ ^ 0xffffffff) > -1) {
									i_2_ = -i_2_;
								}
								if (i_2_ > i) {
									bool_1_ = false;
								}
							}
							final String string_3_ = ((Class4.aClass279_86 != Class64_Sub2.aClass279_3643) ? (Class309.aClass309_2614
									.method3615(Class374.anInt3159, (byte) 25))
									: (Class309.aClass309_2616.method3615(
											Class374.anInt3159, (byte) 25)));
							if ((class246_sub3_sub4_sub2_sub2.anInt6519 ^ 0xffffffff) > (class246_sub3_sub4_sub2_sub2.anInt6542 ^ 0xffffffff)) {
								string = (class246_sub3_sub4_sub2_sub2
										.method3063(0, true)
										+ (bool_1_ ? (Class108
												.method1730(
														((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt6519),
														(class246_sub3_sub4_sub2_sub2.anInt6519),
														16383))
												: "<col=ffffff>")
										+ " ("
										+ string_3_
										+ (class246_sub3_sub4_sub2_sub2.anInt6519)
										+ "+"
										+ ((class246_sub3_sub4_sub2_sub2.anInt6542) + -(class246_sub3_sub4_sub2_sub2.anInt6519)) + ")");
							} else {
								string = (class246_sub3_sub4_sub2_sub2
										.method3063(0, true)
										+ (!bool_1_ ? "<col=ffffff>"
												: (Class108
														.method1730(
																((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt6519),
																(class246_sub3_sub4_sub2_sub2.anInt6519),
																16383)))
										+ " ("
										+ string_3_
										+ (class246_sub3_sub4_sub2_sub2.anInt6519) + ")");
							}
						} else if (class246_sub3_sub4_sub2_sub2.anInt6539 != -1) {
							string = (class246_sub3_sub4_sub2_sub2.method3063(
									0, true)
									+ " ("
									+ (Class309.aClass309_2615.method3615(
											Class374.anInt3159, (byte) 25))
									+ class246_sub3_sub4_sub2_sub2.anInt6539 + ")");
						} else {
							string = class246_sub3_sub4_sub2_sub2.method3063(0,
									true);
						}
						if (Class98_Sub10_Sub9.aBoolean5585 && !bool
								&& (Class98_Sub4.anInt3826 & 0x8) != 0) {
							Class293.method3470(
									false,
									true,
									(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6369),
									Class336.anInt2823,
									0,
									(Class246_Sub3_Sub3.aString6156
											+ " -> <col=ffffff>" + string),
									false,
									0,
									5,
									(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6369),
									-1, false, Class287_Sub2.aString3272);
						}
						if (!bool) {
							for (int i = 7; (i ^ 0xffffffff) <= -1; i--) {
								if (Class269.aStringArray2021[i] != null) {
									short i_4_ = 0;
									if ((s_Sub1.aClass279_5197 == Class4.aClass279_86)
											&& (Class269.aStringArray2021[i]
													.equalsIgnoreCase(Class309.aClass309_2609
															.method3615(
																	Class374.anInt3159,
																	(byte) 25)))) {
										if ((((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt6519) ^ 0xffffffff) > ((class246_sub3_sub4_sub2_sub2.anInt6519) ^ 0xffffffff)) {
											i_4_ = (short) 2000;
										}
										if (((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt6528) != 0
												&& ((class246_sub3_sub4_sub2_sub2.anInt6528) ^ 0xffffffff) != -1) {
											if ((((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt6528) ^ 0xffffffff) == ((class246_sub3_sub4_sub2_sub2.anInt6528) ^ 0xffffffff)) {
												i_4_ = (short) 2000;
											} else {
												i_4_ = (short) 0;
											}
										}
									} else if (Class146_Sub2.aBooleanArray4840[i]) {
										i_4_ = (short) 2000;
									}
									final short i_5_ = (short) (i_4_ + (Class19.aShortArray3447[i]));
									final int i_6_ = ((Class151_Sub9.anIntArray5019[i] != -1) ? Class151_Sub9.anIntArray5019[i]
											: Class284_Sub2.anInt5186);
									Class293.method3470(
											false,
											true,
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6369),
											i_6_,
											0,
											"<col=ffffff>" + string,
											false,
											0,
											i_5_,
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6369),
											-1, false,
											Class269.aStringArray2021[i]);
								}
							}
						} else {
							Class293.method3470(
									false,
									false,
									0L,
									-1,
									0,
									"",
									false,
									0,
									-1,
									(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6369),
									0, true, "<col=cccccc>" + string);
						}
						if (bool) {
							break;
						}
						for (Class98_Sub46_Sub8 class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class33.aClass148_315
								.method2418(32)); class98_sub46_sub8 != null; class98_sub46_sub8 = ((Class98_Sub46_Sub8) Class33.aClass148_315
								.method2417(102))) {
							if (((class98_sub46_sub8.anInt5990) ^ 0xffffffff) == -7) {
								class98_sub46_sub8.aString5985 = "<col=ffffff>"
										+ string;
								break;
							}
						}
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("li.H("
						+ bool
						+ ','
						+ bool_0_
						+ ','
						+ ((class246_sub3_sub4_sub2_sub2 != null) ? "{...}"
								: "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method1312(final int i, final boolean bool) {
		try {
			aStream4093.b(3 + 4 * i);
			if (bool != true) {
				method1313(108, (byte) 47);
			}
			aStream4093.e(-1);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "li.D(" + i + ','
					+ bool + ')');
		}
	}

	final void method1313(final int i, final byte i_7_) {
		try {
			aStream4093.c();
			anInterface2_Impl1_4085 = aHa_Sub3_4087.method2060(false, 68);
			anInterface2_Impl1_4085.method73((byte) -113, i * 4, 4,
					aNativeHeapBuffer4089);
			aNativeHeapBuffer4089 = null;
			if (i_7_ <= 18) {
				method1311(true, false, null);
			}
			aStream4093 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "li.C(" + i + ','
					+ i_7_ + ')');
		}
	}

	final void method1314(final int[] is, final int i, final int i_8_) {
		do {
			try {
				final Interface2_Impl2 interface2_impl2 = aHa_Sub3_4087
						.method1963(62, (anInt4098) * 3);
				final Buffer buffer = interface2_impl2.method78(true, -112);
				if (buffer != null) {
					final Stream stream = aHa_Sub3_4087.method2043(24022,
							buffer);
					int i_9_ = 0;
					if (i_8_ != 32736) {
						method1315(-55, 122, 111, -45);
					}
					int i_10_ = 32767;
					int i_11_ = -32768;
					if (!Stream.a()) {
						for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (i ^ 0xffffffff); i_12_++) {
							final int i_13_ = is[i_12_];
							final int i_14_ = anIntArray4095[i_13_];
							final short[] is_15_ = (aS_Sub2_4097.aShortArrayArray5230[i_13_]);
							if ((i_14_ ^ 0xffffffff) != -1 && is_15_ != null) {
								int i_16_ = 0;
								int i_17_ = 0;
								while ((i_17_ ^ 0xffffffff) > (is_15_.length ^ 0xffffffff)) {
									if ((i_14_ & 1 << i_16_++) != 0) {
										i_9_++;
										for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -4; i_18_++) {
											final int i_19_ = 0xffff & is_15_[i_17_++];
											if (i_19_ > i_11_) {
												i_11_ = i_19_;
											}
											stream.d(i_19_);
											if ((i_19_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff)) {
												i_10_ = i_19_;
											}
										}
									} else {
										i_17_ += 3;
									}
								}
							}
						}
					} else {
						for (int i_20_ = 0; i_20_ < i; i_20_++) {
							final int i_21_ = is[i_20_];
							final int i_22_ = anIntArray4095[i_21_];
							final short[] is_23_ = (aS_Sub2_4097.aShortArrayArray5230[i_21_]);
							if (i_22_ != 0 && is_23_ != null) {
								int i_24_ = 0;
								int i_25_ = 0;
								while (i_25_ < is_23_.length) {
									if ((i_22_ & 1 << i_24_++) != 0) {
										for (int i_26_ = 0; i_26_ < 3; i_26_++) {
											final int i_27_ = 0xffff & is_23_[i_25_++];
											stream.c(i_27_);
											if (i_10_ > i_27_) {
												i_10_ = i_27_;
											}
											if (i_11_ < i_27_) {
												i_11_ = i_27_;
											}
										}
										i_9_++;
									} else {
										i_25_ += 3;
									}
								}
							}
						}
					}
					stream.c();
					if (!interface2_impl2.method79((byte) 60) || i_9_ <= 0) {
						break;
					}
					aHa_Sub3_4087.method2039(
							(0x8 & aS_Sub2_4097.anInt5233) != 0, i_8_ + -32736,
							anInt4084,
							(aS_Sub2_4097.anInt5233 & 0x7 ^ 0xffffffff) != -1);
					if (aHa_Sub3_4087.aBoolean4563) {
						aHa_Sub3_4087.EA(2147483647, anInt4091, anInt4090,
								anInt4086);
					}
					final Class111_Sub3 class111_sub3 = aHa_Sub3_4087
							.method1957((byte) -128);
					class111_sub3.method2137(1.0F / aFloat4092, (byte) -122,
							1.0F / aFloat4092, 1.0F);
					aHa_Sub3_4087
							.method2008(
									(Class246_Sub3_Sub4_Sub5.aClass258_6260),
									(byte) 36);
					aHa_Sub3_4087.method1971(1, true, anInterface2_Impl1_4085);
					aHa_Sub3_4087.method2042((aS_Sub2_4097.aClass256_5252),
							(byte) 67);
					aHa_Sub3_4087.method1973(Class336.aClass232_2822, -i_10_
							+ i_11_ - -1, 0, 26810, interface2_impl2, i_10_,
							i_9_);
					aHa_Sub3_4087.method1985(2);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("li.F("
						+ (is != null ? "{...}" : "null") + ',' + i + ','
						+ i_8_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1315(final int i, final int i_28_, final int i_29_,
			final int i_30_) {
		try {
			anIntArray4095[i_30_ * ((s) aS_Sub2_4097).anInt2203 + i_29_] = Class41
					.method366((anIntArray4095[(i_30_
							* ((s) aS_Sub2_4097).anInt2203 + i_29_)]), 1 << i);
			if (i_28_ != -20787) {
				method1315(22, -33, -30, -8);
			}
			anInt4098++;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("li.B(" + i + ','
					+ i_28_ + ',' + i_29_ + ',' + i_30_ + ')'));
		}
	}

	final void method1316(final int i, final int i_31_) {
		try {
			aNativeHeapBuffer4089 = aHa_Sub3_4087
					.method1947(i * i_31_, true, 0);
			aStream4093 = new Stream(aNativeHeapBuffer4089, 0, 4 * i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "li.A(" + i + ','
					+ i_31_ + ')');
		}
	}

	final void method1317(final int i, final int i_32_, final int i_33_,
			int i_34_, final float f) {
		try {
			if (anInt4084 != i_33_) {
				final TextureDefinition textureDefinition = ((ha) aHa_Sub3_4087).aD938.method11(
						anInt4084, -28755);
				final int i_35_ = textureDefinition.aByte1830 & 0xff;
				if (i_35_ != 0 && (textureDefinition.aByte1820 ^ 0xffffffff) != -5) {
					int i_36_;
					if ((i_32_ ^ 0xffffffff) > -1) {
						i_36_ = 0;
					} else if (i_32_ > 127) {
						i_36_ = 16777215;
					} else {
						i_36_ = i_32_ * 131586;
					}
					if ((i_35_ ^ 0xffffffff) == -257) {
						i_34_ = i_36_;
					} else {
						final int i_37_ = i_35_;
						final int i_38_ = 256 + -i_35_;
						i_34_ = (((~0xff00ff & (i_38_ * (0xff00ff & i_34_) + (i_36_ & 0xff00ff)
								* i_37_)) + (0xff0000 & ((i_36_ & 0xff00)
								* i_37_ + (0xff00 & i_34_) * i_38_))) >> 917253800);
					}
				}
				int i_39_ = 0xff & textureDefinition.aByte1829;
				if ((i_39_ ^ 0xffffffff) != -1) {
					i_39_ += 256;
					int i_40_ = ((0xff0000 & i_34_) >> -921160400) * i_39_;
					if ((i_40_ ^ 0xffffffff) < -65536) {
						i_40_ = 65535;
					}
					int i_41_ = (i_34_ >> 1157906824 & 0xff) * i_39_;
					if ((i_41_ ^ 0xffffffff) < -65536) {
						i_41_ = 65535;
					}
					int i_42_ = (i_34_ & 0xff) * i_39_;
					if ((i_42_ ^ 0xffffffff) < -65536) {
						i_42_ = 65535;
					}
					i_34_ = (i_42_ >> -259571832)
							+ ((0xff00 & i_41_) + ((i_40_ & 0x7000ff00) << -1508903384));
				}
			}
			aStream4093.b(i * 4);
			if (f != 1.0F) {
				int i_43_ = (0xff9fc6 & i_34_) >> 2035833968;
				int i_44_ = 0xff & i_34_ >> 1655837352;
				i_43_ *= f;
				int i_45_ = 0xff & i_34_;
				i_44_ *= f;
				if ((i_43_ ^ 0xffffffff) > -1) {
					i_43_ = 0;
				} else if ((i_43_ ^ 0xffffffff) < -256) {
					i_43_ = 255;
				}
				i_45_ *= f;
				if (i_44_ < 0) {
					i_44_ = 0;
				} else if (i_44_ > 255) {
					i_44_ = 255;
				}
				if ((i_45_ ^ 0xffffffff) > -1) {
					i_45_ = 0;
				} else if ((i_45_ ^ 0xffffffff) < -256) {
					i_45_ = 255;
				}
				i_34_ = i_43_ << -663945424 | i_44_ << 1289794376 | i_45_;
			}
			if (aHa_Sub3_4087.anInt4580 == 0) {
				aStream4093.e((byte) i_34_);
				aStream4093.e((byte) (i_34_ >> 1356888040));
				aStream4093.e((byte) (i_34_ >> -1014001104));
			} else {
				aStream4093.e((byte) (i_34_ >> 771535760));
				aStream4093.e((byte) (i_34_ >> 1569612008));
				aStream4093.e((byte) i_34_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("li.I(" + i + ','
					+ i_32_ + ',' + i_33_ + ',' + i_34_ + ',' + f + ')'));
		}
	}

	public static void method1318(final int i) {
		try {
			aClass164_4088 = null;
			aFloatArray4096 = null;
			aClass58_4094 = null;
			aClass155Array4099 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "li.G(" + i + ')');
		}
	}

	static final void method1319(final int i, final File file,
			final boolean bool) {
		try {
			if (Class98_Sub10_Sub22.anObject5653 == null) {
				Class340.method3803(false);
			}
			try {
				final Class var_class = (Class
						.forName("com.sun.management.HotSpotDiagnosticMXBean"));
				if (i == 0) {
					final Method method = (var_class
							.getDeclaredMethod(
									"dumpHeap",
									(new Class[] {
											(aClass4100 != null ? aClass4100
													: (aClass4100 = method1320("java.lang.String"))),
											Boolean.TYPE })));
					method.invoke(Class98_Sub10_Sub22.anObject5653,
							new Object[] { file.getAbsolutePath(),
									new Boolean(bool) });
				}
			} catch (final Exception exception) {
				System.out.println("HeapDump error:");
				exception.printStackTrace();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("li.E(" + i + ','
					+ (file != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	Class98_Sub30(final s_Sub2 var_s_Sub2, final int i, final int i_47_,
			final int i_48_, final int i_49_, final int i_50_) {
		try {
			aS_Sub2_4097 = var_s_Sub2;
			anInt4091 = i_48_;
			anInt4084 = i;
			anInt4090 = i_49_;
			aHa_Sub3_4087 = aS_Sub2_4097.aHa_Sub3_5225;
			anIntArray4095 = new int[(((s) aS_Sub2_4097).anInt2204 * ((s) aS_Sub2_4097).anInt2203)];
			anInt4086 = i_50_;
			aFloat4092 = i_47_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("li.<init>("
					+ (var_s_Sub2 != null ? "{...}" : "null") + ',' + i + ','
					+ i_47_ + ',' + i_48_ + ',' + i_49_ + ',' + i_50_ + ')'));
		}
	}

	/* synthetic */static Class method1320(final String string) {
		try {
			return Class.forName(string);
		} catch (final ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
