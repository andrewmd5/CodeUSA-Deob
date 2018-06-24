/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;

import java.math.BigInteger;

abstract class Class69 implements Interface2 {
	private int anInt3212;
	static BigInteger aBigInteger3213 = (new BigInteger(
			"974b219bf31b50bc1a89e45f6a0a59f21c9a83e19478ae976391cb262dc9b5f8ecfb2e864356ecbf7ca3cdbacd54ea298db5a159b0a64c25e03330fd744fe0a7181244f6ba5f3025afcb3f4122f5fbda4036b9a1b586eb33e732c5c3fd9a210ac8d42df187317c681060a4de30d9391e0b29ce9a6de27470fa3050f8b0868146efc885c62cf88378c9c19414ed3bbf98a4b8e28a8c9266654eccf773ab928973acc6aeec5648a9781463c5802379e7212fb5c480116a349840c5f04bb4b60f78e79d13a4e64b8843ef9d1273d8f80b198468051a93e6540e2510ffb8003046e10dc9bddd7bc30653936d6b178c2c6d086eeedd0a096878accbd80e6b5919806246167992dfad464b8a83e0b2f2cb3263a12b9937c206238a46ec1aea440d75af5a313de6324ac51a24bcaafeab1181b457145eea7a8ddc4009d1b62b118644ec363c521c6c491a879ace7fe9910b5084f8260855c86667c107164aba828126a12a95913507ae5519fa40452e66213918cc12e99430ffd8284b78bf6c827a4b0fbaeaa838dd9cd2e98bb825ff707df9e4465b51be3601dde7de933191328e1a36b0b950a71b681d35d6103a0d7d451cb32dc4f8dd196722a975a391d0048185e05d3ac876af0f15b3f72cbc9ff8132d4d2f29a315e0ad505e183d87c6a6022699c74038803e879bdd124b6f2f5106ea7d703abaaa2dfa86e5b4db14fadf34694b",
			16));
	private int anInt3214;
	private NativeHeapBuffer aNativeHeapBuffer3215;
	private int anInt3216 = 0;
	ha_Sub3_Sub2 aHa_Sub3_Sub2_3217;
	private int anInt3218;
	private int anInt3219 = -1;
	static int[] anIntArray3220 = new int[4096];
	private boolean aBoolean3221;
	static int[] anIntArray3222 = new int[200];
	static boolean aBoolean3223 = true;

	final Buffer method694(final boolean bool, final MapBuffer mapbuffer,
			final int i) {
		try {
			if (anInt3216 == 0) {
				method702((byte) -72);
				if ((anInt3219 ^ 0xffffffff) < -1) {
					OpenGL.glBindBufferARB(anInt3212, anInt3219);
					if (bool) {
						OpenGL.glBufferDataARBub(anInt3212, anInt3214, null, 0,
								aBoolean3221 ? 35040 : 35044);
						if (anInt3218 <= (((ha_Sub3) aHa_Sub3_Sub2_3217).aNativeHeapBuffer4521.c)) {
							anInt3216 = 1;
							return (((ha_Sub3) aHa_Sub3_Sub2_3217).aNativeHeapBuffer4521);
						}
					}
					if (!mapbuffer.a()
							&& mapbuffer.a(anInt3212, anInt3218, 35001)) {
						anInt3216 = 2;
						return mapbuffer;
					}
				} else {
					anInt3216 = 2;
					return aNativeHeapBuffer3215;
				}
			}
			if (i != -15793) {
				method698(-18);
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception,
							("ei.M(" + bool + ','
									+ (mapbuffer != null ? "{...}" : "null")
									+ ',' + i + ')'));
		}
	}

	final long method695(final int i) {
		try {
			if (i != -30277) {
				aHa_Sub3_Sub2_3217 = null;
			}
			if ((anInt3219 ^ 0xffffffff) != -1) {
				return 0L;
			}
			return aNativeHeapBuffer3215.getAddress();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ei.H(" + i + ')');
		}
	}

	static final int method696(final float f, final float f_0_, final byte i,
			final float f_1_) {
		try {
			final float f_2_ = !(f < 0.0F) ? f : -f;
			final float f_3_ = f_1_ < 0.0F ? -f_1_ : f_1_;
			if (i > -51) {
				aBigInteger3213 = null;
			}
			final float f_4_ = !(f_0_ < 0.0F) ? f_0_ : -f_0_;
			if (!(f_3_ > f_2_) || !(f_4_ < f_3_)) {
				if (!(f_2_ < f_4_) || !(f_3_ < f_4_)) {
					if (!(f > 0.0F)) {
						return 5;
					}
					return 4;
				}
				if (f_0_ > 0.0F) {
					return 2;
				}
				return 3;
			}
			if (f_1_ > 0.0F) {
				return 0;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ei.B(" + f + ','
					+ f_0_ + ',' + i + ',' + f_1_ + ')'));
		}
	}

	final boolean method697(final Source source, final int i, final int i_5_) {
		try {
			do {
				if (i_5_ > anInt3214) {
					method702((byte) -76);
					if ((anInt3219 ^ 0xffffffff) >= -1) {
						throw new RuntimeException("ARGH!");
					}
					OpenGL.glBindBufferARB(anInt3212, anInt3219);
					OpenGL.glBufferDataARBa(anInt3212, i_5_,
							source.getAddress(), aBoolean3221 ? 35040 : 35044);
					((ha_Sub3) aHa_Sub3_Sub2_3217).anInt4538 += i_5_
							- anInt3218;
					anInt3214 = i_5_;
					if (!client.aBoolean3553) {
						break;
					}
				}
				if (anInt3219 <= 0) {
					throw new RuntimeException("ARGH!");
				}
				OpenGL.glBindBufferARB(anInt3212, anInt3219);
				OpenGL.glBufferSubDataARBa(anInt3212, 0, anInt3218,
						source.getAddress());
				((ha_Sub3) aHa_Sub3_Sub2_3217).anInt4538 += -anInt3218 + i_5_;
			} while (false);
			anInt3218 = i_5_;
			if (i != 1) {
				return true;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ei.C("
					+ (source != null ? "{...}" : "null") + ',' + i + ','
					+ i_5_ + ')'));
		}
	}

	final void method698(final int i) {
		do {
			try {
				if (i != 18569) {
					anInt3214 = -80;
				}
				if (!aHa_Sub3_Sub2_3217.aBoolean6137) {
					break;
				}
				OpenGL.glBindBufferARB(anInt3212, anInt3219);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ei.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method699(final int i) {
		do {
			try {
				aBigInteger3213 = null;
				anIntArray3222 = null;
				anIntArray3220 = null;
				if (i <= -93) {
					break;
				}
				method699(25);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ei.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	protected final void finalize() throws Throwable {
		try {
			method72(false);
			super.finalize();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					"ei.finalize(" + ')');
		}
	}

	void method76(final int i, final int i_6_) {
		do {
			try {
				if ((i ^ 0xffffffff) < (anInt3214 ^ 0xffffffff)) {
					method702((byte) -85);
					do {
						if ((anInt3219 ^ 0xffffffff) < -1) {
							OpenGL.glBindBufferARB(anInt3212, anInt3219);
							OpenGL.glBufferDataARBub(anInt3212, i, null, 0,
									(!aBoolean3221 ? 35044 : 35040));
							((ha_Sub3) aHa_Sub3_Sub2_3217).anInt4538 += -anInt3214
									+ i;
							if (!client.aBoolean3553) {
								break;
							}
						}
						aNativeHeapBuffer3215 = aHa_Sub3_Sub2_3217.method1947(
								i, false, i_6_ ^ 0x512b);
					} while (false);
					anInt3214 = i;
				}
				anInt3218 = i;
				if (i_6_ == 20779) {
					break;
				}
				anIntArray3222 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ei.G(" + i
						+ ',' + i_6_ + ')');
			}
			break;
		} while (false);
	}

	static final void method700(final boolean bool, final byte[][][] is,
			final int i, final byte i_7_, final int i_8_, final int i_9_,
			final boolean bool_10_) {
		final int i_11_ = bool ? 1 : 0;
		GameObjectDefinitionLoader.anInt2523 = 0;
		Class353.anInt3009 = 0;
		Class356.anInt3020++;
		if ((i_9_ & 0x2) == 0) {
			for (Class246_Sub3 class246_sub3 = Class379.aClass246_Sub3Array3198[i_11_]; class246_sub3 != null; class246_sub3 = class246_sub3.aClass246_Sub3_5090) {
				if (!InputStream_Sub1.method121(class246_sub3, bool, is, i,
						i_7_)) {
					Class111.method2098(class246_sub3);
					if (class246_sub3.anInt5083 != -1) {
						Class32.aClass246_Sub3Array307[GameObjectDefinitionLoader.anInt2523++] = class246_sub3;
					}
				}
			}
		}
		if ((i_9_ & 0x1) == 0) {
			for (Class246_Sub3 class246_sub3 = Class359.aClass246_Sub3Array3056[i_11_]; class246_sub3 != null; class246_sub3 = class246_sub3.aClass246_Sub3_5090) {
				if (!InputStream_Sub1.method121(class246_sub3, bool, is, i,
						i_7_)) {
					Class111.method2098(class246_sub3);
					if (class246_sub3.anInt5083 != -1) {
						Class246_Sub4_Sub2.aClass246_Sub3Array6173[Class353.anInt3009++] = class246_sub3;
					}
				}
			}
			for (Class246_Sub3 class246_sub3 = Class130.aClass246_Sub3Array1029[i_11_]; class246_sub3 != null; class246_sub3 = class246_sub3.aClass246_Sub3_5090) {
				if (!InputStream_Sub1.method121(class246_sub3, bool, is, i,
						i_7_)) {
					if (class246_sub3.method2987(6540)) {
						Class111.method2098(class246_sub3);
						if (class246_sub3.anInt5083 != -1) {
							Class246_Sub4_Sub2.aClass246_Sub3Array6173[Class353.anInt3009++] = class246_sub3;
						}
					} else {
						Class111.method2098(class246_sub3);
						if (class246_sub3.anInt5083 != -1) {
							Class32.aClass246_Sub3Array307[GameObjectDefinitionLoader.anInt2523++] = class246_sub3;
						}
					}
				}
			}
			if (!bool) {
				for (int i_12_ = 0; i_12_ < Class347.anInt2907; i_12_++) {
					if (!InputStream_Sub1
							.method121(
									(Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273[i_12_]),
									bool, is, i, i_7_)) {
						Class111.method2098(Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273[i_12_]);
						if (((Class246_Sub3) (Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273[i_12_])).anInt5083 != -1) {
							if (Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273[i_12_]
									.method2987(6540)) {
								Class246_Sub4_Sub2.aClass246_Sub3Array6173[Class353.anInt3009++] = (Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273[i_12_]);
							} else {
								Class32.aClass246_Sub3Array307[GameObjectDefinitionLoader.anInt2523++] = (Class246_Sub3_Sub5_Sub2.aClass246_Sub3_Sub4Array6273[i_12_]);
							}
						}
					}
				}
			}
		}
		if (GameObjectDefinitionLoader.anInt2523 > 0) {
			Class283.method3343(Class32.aClass246_Sub3Array307, 0,
					GameObjectDefinitionLoader.anInt2523 - 1);
			for (int i_13_ = 0; i_13_ < GameObjectDefinitionLoader.anInt2523; i_13_++) {
				Class167.method2529(Class32.aClass246_Sub3Array307[i_13_],
						true, bool_10_);
			}
		}
		if (Class348.aBoolean2914) {
			Class98_Sub10_Sub30.aHa5709.method1818(0, null);
		}
		if ((i_9_ & 0x2) == 0) {
			for (int i_14_ = Class32.anInt305; i_14_ < Class364.anInt3103; i_14_++) {
				if (i_14_ >= i && is != null) {
					int i_15_ = Class74.aBooleanArrayArray551.length;
					if ((Class306.anInt2561 + Class74.aBooleanArrayArray551.length) > Class366.anInt3112) {
						i_15_ -= (Class306.anInt2561
								+ Class74.aBooleanArrayArray551.length - Class366.anInt3112);
					}
					int i_16_ = Class74.aBooleanArrayArray551[0].length;
					if ((OutgoingOpcode.anInt1318 + Class74.aBooleanArrayArray551[0].length) > Class64_Sub9.anInt3662) {
						i_16_ -= (OutgoingOpcode.anInt1318
								+ Class74.aBooleanArrayArray551[0].length - Class64_Sub9.anInt3662);
					}
					boolean[][] bools = Class319.aBooleanArrayArray2702;
					if (GameObjectDefinitionLoader.aBoolean2526) {
						if (Class375.aBoolean3170) {
							bools = Class34.aBooleanArrayArrayArray325[i_14_];
						}
						for (int i_17_ = Class67.anInt521; i_17_ < i_15_; i_17_++) {
							final int i_18_ = (i_17_ + Class306.anInt2561 - Class67.anInt521);
							for (int i_19_ = Class98_Sub37.anInt4184; i_19_ < i_16_; i_19_++) {
								bools[i_17_][i_19_] = false;
								if (Class74.aBooleanArrayArray551[i_17_][i_19_]) {
									final int i_20_ = (i_19_
											+ OutgoingOpcode.anInt1318 - Class98_Sub37.anInt4184);
									for (int i_21_ = i_14_; i_21_ >= 0; i_21_--) {
										if ((Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_21_][i_18_][i_20_]) != null
												&& ((Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_21_][i_18_][i_20_]).aByte1322) == i_14_) {
											if (i_21_ >= i
													&& (is[i_21_][i_18_][i_20_]) == i_7_
													|| (Class76_Sub5.method758(
															(byte) 95, i_14_,
															i_20_, i_18_))) {
												bools[i_17_][i_19_] = false;
											} else {
												bools[i_17_][i_19_] = true;
											}
											break;
										}
									}
								}
							}
						}
					}
					if (Class375.aBoolean3170) {
						if (i_8_ >= 0) {
							Class78.aSArray594[i_14_].method3416(0, 0, 0, null,
									false, i_8_, i_9_);
						} else {
							Class78.aSArray594[i_14_].method3426(0, 0, 0, null,
									false, i_9_);
						}
						for (int i_22_ = 0; i_22_ < Class294.anInt2407; i_22_++) {
							Class98_Sub43_Sub3.aClass245Array5922[i_22_]
									.method2961(true, new Class246_Sub10(
											i_14_ + 1));
						}
					} else if (i_8_ >= 0) {
						Class78.aSArray594[i_14_].method3416(
								Class241.anInt1845, Class64_Sub26.anInt3714,
								Class259.anInt1959,
								Class319.aBooleanArrayArray2702, false, i_8_,
								i_9_);
					} else {
						Class78.aSArray594[i_14_].method3426(
								Class241.anInt1845, Class64_Sub26.anInt3714,
								Class259.anInt1959,
								Class319.aBooleanArrayArray2702, false, i_9_);
					}
				} else {
					int i_23_ = Class74.aBooleanArrayArray551.length;
					if ((Class306.anInt2561 + Class74.aBooleanArrayArray551.length) > Class366.anInt3112) {
						i_23_ -= (Class306.anInt2561
								+ Class74.aBooleanArrayArray551.length - Class366.anInt3112);
					}
					int i_24_ = Class74.aBooleanArrayArray551[0].length;
					if ((OutgoingOpcode.anInt1318 + Class74.aBooleanArrayArray551[0].length) > Class64_Sub9.anInt3662) {
						i_24_ -= (OutgoingOpcode.anInt1318
								+ Class74.aBooleanArrayArray551[0].length - Class64_Sub9.anInt3662);
					}
					boolean[][] bools = Class319.aBooleanArrayArray2702;
					if (GameObjectDefinitionLoader.aBoolean2526) {
						if (Class375.aBoolean3170) {
							bools = Class34.aBooleanArrayArrayArray325[i_14_];
						}
						for (int i_25_ = Class67.anInt521; i_25_ < i_23_; i_25_++) {
							final int i_26_ = (i_25_ + Class306.anInt2561 - Class67.anInt521);
							for (int i_27_ = Class98_Sub37.anInt4184; i_27_ < i_24_; i_27_++) {
								if (Class74.aBooleanArrayArray551[i_25_][i_27_]
										&& !(Class76_Sub5
												.method758(
														(byte) 110,
														i_14_,
														(i_27_
																+ OutgoingOpcode.anInt1318 - Class98_Sub37.anInt4184),
														i_26_))) {
									bools[i_25_][i_27_] = true;
								} else {
									bools[i_25_][i_27_] = false;
								}
							}
						}
					}
					if (Class375.aBoolean3170) {
						if (i_8_ >= 0) {
							Class78.aSArray594[i_14_].method3416(0, 0, 0, null,
									false, i_8_, i_9_);
						} else {
							Class78.aSArray594[i_14_].method3426(0, 0, 0, null,
									false, i_9_);
						}
						for (int i_28_ = 0; i_28_ < Class294.anInt2407; i_28_++) {
							Class98_Sub43_Sub3.aClass245Array5922[i_28_]
									.method2961(true, new Class246_Sub10(
											i_14_ + 1));
						}
					} else if (i_8_ >= 0) {
						Class78.aSArray594[i_14_].method3416(
								Class241.anInt1845, Class64_Sub26.anInt3714,
								Class259.anInt1959,
								Class319.aBooleanArrayArray2702, true, i_8_,
								i_9_);
					} else {
						Class78.aSArray594[i_14_].method3426(
								Class241.anInt1845, Class64_Sub26.anInt3714,
								Class259.anInt1959,
								Class319.aBooleanArrayArray2702, true, i_9_);
					}
				}
			}
		}
		if (Class353.anInt3009 > 0) {
			r_Sub2.method1656(Class246_Sub4_Sub2.aClass246_Sub3Array6173, 0,
					Class353.anInt3009 - 1);
			for (int i_29_ = 0; i_29_ < Class353.anInt3009; i_29_++) {
				Class167.method2529(
						(Class246_Sub4_Sub2.aClass246_Sub3Array6173[i_29_]),
						true, bool_10_);
			}
		}
	}

	static final void method701(final int i) {
		if (i == 0) {
			if (Class294.anInt2407 == 2) {
				Class98_Sub46_Sub5.aClass174Array5970[0]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[0]);
				Class98_Sub46_Sub5.aClass174Array5970[1]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[1]);
			} else if (Class294.anInt2407 == 3) {
				Class98_Sub46_Sub5.aClass174Array5970[0]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[0]);
				Class98_Sub46_Sub5.aClass174Array5970[1]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[1]);
				Class98_Sub46_Sub5.aClass174Array5970[2]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[2]);
			} else {
				Class98_Sub46_Sub5.aClass174Array5970[0]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[0]);
				Class98_Sub46_Sub5.aClass174Array5970[1]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[1]);
				Class98_Sub46_Sub5.aClass174Array5970[2]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[2]);
				Class98_Sub46_Sub5.aClass174Array5970[3]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[3]);
			}
		} else if (i == 1) {
			if (Class294.anInt2407 == 2) {
				Class98_Sub46_Sub5.aClass174Array5970[0]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[2]);
			} else if (Class294.anInt2407 == 3) {
				Class98_Sub46_Sub5.aClass174Array5970[0]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[3]);
				Class98_Sub46_Sub5.aClass174Array5970[1]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[4]);
			} else {
				Class98_Sub46_Sub5.aClass174Array5970[0]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[4]);
				Class98_Sub46_Sub5.aClass174Array5970[1]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[5]);
				Class98_Sub46_Sub5.aClass174Array5970[2]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[6]);
			}
		} else if (i == 2) {
			if (Class294.anInt2407 == 2) {
				Class98_Sub46_Sub5.aClass174Array5970[0]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[3]);
			} else if (Class294.anInt2407 == 3) {
				Class98_Sub46_Sub5.aClass174Array5970[0]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[5]);
			} else {
				Class98_Sub46_Sub5.aClass174Array5970[0]
						.method2564(Class98_Sub43_Sub3.aClass245Array5922[7]);
			}
		}
	}

	void method72(final boolean bool) {
		do {
			try {
				if ((anInt3219 ^ 0xffffffff) < -1) {
					aHa_Sub3_Sub2_3217.method2084(1, anInt3218, anInt3219);
					anInt3219 = -1;
				}
				if (bool == false) {
					break;
				}
				method703((byte) -53, null);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ei.L(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	public int method2(final int i) {
		try {
			if (i != 200) {
				aBoolean3223 = true;
			}
			return anInt3218;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ei.E(" + i + ')');
		}
	}

	private final void method702(final byte i) {
		try {
			if (i < -53 && anInt3219 < 0) {
				if (aHa_Sub3_Sub2_3217.aBoolean6137) {
					OpenGL.glGenBuffersARB(1, Class190.anIntArray1463, 0);
					anInt3219 = Class190.anIntArray1463[0];
					OpenGL.glBindBufferARB(anInt3212, anInt3219);
				} else {
					anInt3219 = 0;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ei.J(" + i + ')');
		}
	}

	Class69(final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final int i, final boolean bool) {
		try {
			aBoolean3221 = bool;
			aHa_Sub3_Sub2_3217 = var_ha_Sub3_Sub2;
			anInt3212 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ei.<init>("
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + i
					+ ',' + bool + ')'));
		}
	}

	final boolean method703(final byte i, final MapBuffer mapbuffer) {
		try {
			boolean bool = true;
			if (i != -68) {
				method696(-2.5029087F, 1.1315566F, (byte) -51, -0.1177615F);
			}
			if (anInt3216 != 0) {
				do {
					if (anInt3219 > 0) {
						OpenGL.glBindBufferARB(anInt3212, anInt3219);
						if (anInt3216 != 1) {
							bool = mapbuffer.b();
							if (!client.aBoolean3553) {
								break;
							}
						}
						OpenGL.glBufferSubDataARBa(
								anInt3212,
								0,
								anInt3214,
								((ha_Sub3) (aHa_Sub3_Sub2_3217)).aNativeHeapBuffer4521
										.getAddress());
					}
				} while (false);
				anInt3216 = 0;
			}
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ei.F(" + i + ','
					+ (mapbuffer != null ? "{...}" : "null") + ')'));
		}
	}
}
