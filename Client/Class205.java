/* Class205 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class205 {
	int anInt1554;
	int anInt1555;
	Class207 aClass207_1556;
	private Class79 aClass79_1557 = new Class79(64);
	private boolean aBoolean1558;
	private Class207 aClass207_1559;
	Class79 aClass79_1560 = new Class79(50);
	Class74 aClass74_1561 = new Class74(250);
	private Class73 aClass73_1562 = new Class73();
	private Class365 aClass365_1563;
	int anInt1564;
	private String[] aStringArray1565;
	private String[] aStringArray1566;

	final Class332 method2710(int i, int i_0_, ha var_ha, Class313 class313,
			int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			((Class73) aClass73_1562).aBoolean3488 = class313 != null;
			((Class73) aClass73_1562).anInt3487 = i_3_;
			if (i_4_ != 24056)
				return null;
			((Class73) aClass73_1562).anInt3480 = i_0_;
			((Class73) aClass73_1562).anInt3481 = i_2_;
			((Class73) aClass73_1562).anInt3483 = ((ha) var_ha).anInt937;
			((Class73) aClass73_1562).anInt3484 = i_1_;
			((Class73) aClass73_1562).anInt3486 = i;
			return ((Class332) ((Class205) this).aClass74_1561.method732(
					aClass73_1562, i_4_ ^ 0x5df8));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nh.C(" + i + ','
					+ i_0_ + ',' + (var_ha != null ? "{...}" : "null") + ','
					+ (class313 != null ? "{...}" : "null") + ',' + i_1_ + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final Class246_Sub3_Sub3 method2711(int i, int i_5_, int i_6_) {
		Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_5_][i_6_];
		if (class172 == null)
			return null;
		return ((Class172) class172).aClass246_Sub3_Sub3_1333;
	}

	final void method2712(int i, int i_7_) {
		try {
			((Class205) this).anInt1564 = i_7_;
			synchronized (((Class205) this).aClass79_1560) {
				((Class205) this).aClass79_1560.method794(103);
				int i_8_ = -127 / ((-60 - i) / 55);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.K(" + i + ','
					+ i_7_ + ')');
		}
	}

	static final Class82 method2713(ha_Sub3_Sub2 var_ha_Sub3_Sub2, int i,
			Class230[] class230s) {
		try {
			for (int i_9_ = 0; class230s.length > i_9_; i_9_++) {
				if (class230s[i_9_] == null
						|| (((Class230) class230s[i_9_]).aLong1723 ^ 0xffffffffffffffffL) >= -1L)
					return null;
			}
			long l = OpenGL.glCreateProgramObjectARB();
			for (int i_10_ = 0; (class230s.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++)
				OpenGL.glAttachObjectARB(l,
						(((Class230) class230s[i_10_]).aLong1723));
			OpenGL.glLinkProgramARB(l);
			OpenGL.glGetObjectParameterivARB(l, 35714, TextureDefinition.anIntArray1836,
					0);
			if (i == TextureDefinition.anIntArray1836[0]) {
				if (TextureDefinition.anIntArray1836[0] == 0)
					System.out.println("Shader linking failed:");
				OpenGL.glGetObjectParameterivARB(l, 35716,
						TextureDefinition.anIntArray1836, 1);
				if ((TextureDefinition.anIntArray1836[1] ^ 0xffffffff) < -2) {
					byte[] is = new byte[TextureDefinition.anIntArray1836[1]];
					OpenGL.glGetInfoLogARB(l, TextureDefinition.anIntArray1836[1],
							TextureDefinition.anIntArray1836, 0, is, 0);
					System.out.println(new String(is));
				}
				if ((TextureDefinition.anIntArray1836[0] ^ 0xffffffff) == -1) {
					for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > (class230s.length ^ 0xffffffff)); i_11_++)
						OpenGL.glDetachObjectARB(l,
								(((Class230) class230s[i_11_]).aLong1723));
					OpenGL.glDeleteObjectARB(l);
					return null;
				}
			}
			return new Class82(var_ha_Sub3_Sub2, l, class230s);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nh.G("
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ',' + i
					+ ',' + (class230s != null ? "{...}" : "null") + ')'));
		}
	}

	final ItemDefs method2714(int i, byte i_12_) { // Items
		try {
			ItemDefs class297;
			synchronized (aClass79_1557) {
				class297 = (ItemDefs) aClass79_1557.method802(-126, (long) i);
			}
			if (class297 != null)
				return class297;
			byte[] is;
			synchronized (aClass207_1559) {
				is = aClass207_1559.method2745(
						Class119_Sub3.method2187((byte) -84, i),
						Class150.method2437((byte) 124, i), false);
			}
			class297 = new ItemDefs();
			((ItemDefs) class297).aClass205_2419 = this;
			((ItemDefs) class297).anInt2468 = i;
			((ItemDefs) class297).groundOptions = (new String[] {
					null,
					null,
					Class309.aClass309_2593.method3615(
							((Class205) this).anInt1555, (byte) 25), null, null });
			((ItemDefs) class297).inventoryOptions = (new String[] {
					null,
					null,
					null,
					null,
					Class309.aClass309_2594.method3615(
							(((Class205) this).anInt1555), (byte) 25) });
			if (is != null)
				class297.parse(new ByteBuffer(is), (byte) -114);
			class297.method3485(850);
			if ((((ItemDefs) class297).anInt2414 ^ 0xffffffff) != 0)
				class297.method3487(
						method2714(((ItemDefs) class297).anInt2433, (byte) -120),
						118,
						method2714(((ItemDefs) class297).anInt2414, (byte) -122));
			if (((ItemDefs) class297).anInt2459 != -1)
				class297.method3498(
						method2714(((ItemDefs) class297).anInt2472, (byte) -123),
						method2714(((ItemDefs) class297).anInt2459, (byte) -123),
						123);
			if (!aBoolean1558 && ((ItemDefs) class297).aBoolean2420) {
				((ItemDefs) class297).aString2450 = Class309.MEMBERS_OBJECT
						.method3615(((Class205) this).anInt1555, (byte) 25);
				((ItemDefs) class297).groundOptions = aStringArray1565;
				((ItemDefs) class297).aBoolean2461 = false;
				((ItemDefs) class297).inventoryOptions = aStringArray1566;
				((ItemDefs) class297).anInt2435 = 0;
				((ItemDefs) class297).anIntArray2436 = null;
				if (((ItemDefs) class297).aClass377_2443 != null) {
					boolean bool = false;
					for (Class98 class98 = ((ItemDefs) class297).aClass377_2443
							.method3998(124); class98 != null; class98 = ((ItemDefs) class297).aClass377_2443
							.method3995(-1)) {
						Class149 class149 = aClass365_1563
								.method3940((byte) 31,
										(int) (((Class98) class98).aLong832));
						if (((Class149) class149).aBoolean1204)
							class98.method942(44);
						else
							bool = true;
					}
					if (!bool)
						((ItemDefs) class297).aClass377_2443 = null;
				}
			}
			synchronized (aClass79_1557) {
				aClass79_1557.method805((long) i, class297, (byte) -80);
			}
			if (i_12_ >= -115)
				return null;

			return class297;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.H(" + i + ','
					+ i_12_ + ')');
		}
	}

	final void method2715(int i) {
		try {
			int i_13_ = -17 / ((i - -34) / 55);
			synchronized (aClass79_1557) {
				aClass79_1557.method794(110);
			}
			synchronized (((Class205) this).aClass79_1560) {
				((Class205) this).aClass79_1560.method794(64);
			}
			synchronized (((Class205) this).aClass74_1561) {
				((Class205) this).aClass74_1561.method722(true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.M(" + i + ')');
		}
	}

	static final void method2716(int i) {
		do {
			try {
				for (Class98_Sub46_Sub5 class98_sub46_sub5 = ((Class98_Sub46_Sub5) Class280.aClass148_2108
						.method2418(32)); class98_sub46_sub5 != null; class98_sub46_sub5 = ((Class98_Sub46_Sub5) Class280.aClass148_2108
						.method2417(i ^ ~0x25ed))) {
					Class246_Sub3_Sub4_Sub4 class246_sub3_sub4_sub4 = (((Class98_Sub46_Sub5) class98_sub46_sub5).aClass246_Sub3_Sub4_Sub4_5969);
					if (Class215.anInt1614 > (((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6466)) {
						class98_sub46_sub5.method942(81);
						class246_sub3_sub4_sub4.method3078(i ^ 0x3254);
					} else if (Class215.anInt1614 >= ((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6479) {
						class246_sub3_sub4_sub4.method3080((byte) 109);
						if (((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6482 > 0) {
							Class98_Sub39 class98_sub39 = ((Class98_Sub39) (Class260.aClass377_3254
									.method3990(
											(long) ((((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6482) - 1),
											-1)));
							if (class98_sub39 != null) {
								Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (((Class98_Sub39) class98_sub39).aClass246_Sub3_Sub4_Sub2_Sub1_4187);
								if ((((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5084 ^ 0xffffffff) <= -1
										&& (((((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5084) ^ 0xffffffff) > (Class165.anInt1276 * 512 ^ 0xffffffff))
										&& ((((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5079) ^ 0xffffffff) <= -1
										&& ((((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5079) < 512 * Class98_Sub10_Sub7.anInt5572))
									class246_sub3_sub4_sub4
											.method3074(
													(((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5084),
													((Class98_Sub46_Sub2_Sub2
															.method1538(
																	(((Class246_Sub3) class246_sub3_sub4_sub4).aByte5088),
																	(((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5079),
																	(((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5084),
																	i + 33738)) - (((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6463)),
													Class215.anInt1614,
													(byte) 108,
													(((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5079));
							}
						}
						if (((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6482 < 0) {
							int i_14_ = (-((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6482 - 1);
							Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2;
							if (i_14_ != za_Sub2.anInt6080)
								class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_14_]);
							else
								class246_sub3_sub4_sub2_sub2 = (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660);
							if (class246_sub3_sub4_sub2_sub2 != null
									&& (((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5084 ^ 0xffffffff) <= -1
									&& ((((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5084 ^ 0xffffffff) > (512 * Class165.anInt1276 ^ 0xffffffff))
									&& (((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5079 ^ 0xffffffff) <= -1
									&& ((((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5079 ^ 0xffffffff) > (Class98_Sub10_Sub7.anInt5572 * 512 ^ 0xffffffff)))
								class246_sub3_sub4_sub4
										.method3074(
												((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5084,
												((Class98_Sub46_Sub2_Sub2
														.method1538(
																((Class246_Sub3) class246_sub3_sub4_sub4).aByte5088,
																(((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5079),
																(((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5084),
																24111)) - ((Class246_Sub3_Sub4_Sub4) class246_sub3_sub4_sub4).anInt6463),
												Class215.anInt1614,
												(byte) 108,
												((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5079);
						}
						class246_sub3_sub4_sub4.method3075(-10462,
								Class279.anInt2099);
						Class222.method2826(class246_sub3_sub4_sub4, true);
					}
				}
				if (i == -9627)
					break;
				method2711(3, 3, 3);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "nh.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method2717(int i) {
		do {
			try {
				synchronized (((Class205) this).aClass74_1561) {
					((Class205) this).aClass74_1561.method722(true);
				}
				if (i == 64)
					break;
				((Class205) this).aClass74_1561 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "nh.J(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method2718(int i, boolean bool) {
		try {
			if (!bool != !aBoolean1558) {
				aBoolean1558 = bool;
				if (i > -30)
					method2712(15, 22);
				method2715(94);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.F(" + i + ','
					+ bool + ')');
		}
	}

	final void method2719(byte i) {
		try {
			synchronized (aClass79_1557) {
				int i_15_ = 85 / ((-69 - i) / 55);
				aClass79_1557.method806((byte) -86);
			}
			synchronized (((Class205) this).aClass79_1560) {
				((Class205) this).aClass79_1560.method806((byte) 104);
			}
			synchronized (((Class205) this).aClass74_1561) {
				((Class205) this).aClass74_1561.method725(13937);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.E(" + i + ')');
		}
	}

	final void method2720(int i, int i_16_) {
		try {
			synchronized (aClass79_1557) {
				aClass79_1557.method800((byte) 62, i);
			}
			if (i_16_ != 1)
				method2714(50, (byte) -48);
			synchronized (((Class205) this).aClass79_1560) {
				((Class205) this).aClass79_1560.method800((byte) 62, i);
			}
			synchronized (((Class205) this).aClass74_1561) {
				((Class205) this).aClass74_1561.method724((byte) 96, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.I(" + i + ','
					+ i_16_ + ')');
		}
	}

	final void method2721(int i) {
		try {
			synchronized (((Class205) this).aClass79_1560) {
				if (i <= 13)
					((Class205) this).aClass79_1560 = null;
				((Class205) this).aClass79_1560.method794(38);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nh.B(" + i + ')');
		}
	}

	final Class332 method2722(Class43 class43, boolean bool, int i, int i_17_,
			int i_18_, Class313 class313, ha var_ha, int i_19_,
			boolean bool_20_, int i_21_, ha var_ha_22_, boolean bool_23_) {
		try {
			Class332 class332 = method2710(i_17_, i, var_ha_22_, class313,
					i_21_, i_19_, i_18_, 24056);
			if (class332 != null)
				return class332;
			ItemDefs class297 = method2714(i, (byte) -125);
			if (i_21_ > 1 && ((ItemDefs) class297).anIntArray2428 != null) {
				int i_24_ = -1;
				for (int i_25_ = 0; i_25_ < 10; i_25_++) {
					if (((ItemDefs) class297).anIntArray2454[i_25_] <= i_21_
							&& (((ItemDefs) class297).anIntArray2454[i_25_] ^ 0xffffffff) != -1)
						i_24_ = ((ItemDefs) class297).anIntArray2428[i_25_];
				}
				if (i_24_ != -1)
					class297 = method2714(i_24_, (byte) -116);
			}
			int[] is = class297.method3488(i_18_, i_19_, bool_23_, i_21_,
					i_17_, var_ha_22_, var_ha, (byte) -125, class313, class43);
			if (is == null)
				return null;
			Class332 class332_26_;
			if (bool_20_)
				class332_26_ = var_ha.method1748(-7962, 0, 36, 32, is, 36);
			else
				class332_26_ = var_ha_22_.method1748(-7962, 0, 36, 32, is, 36);
			if (!bool_20_) {
				Class73 class73 = new Class73();
				((Class73) class73).anInt3486 = i_17_;
				((Class73) class73).anInt3480 = i;
				((Class73) class73).aBoolean3488 = class313 != null;
				((Class73) class73).anInt3487 = i_18_;
				((Class73) class73).anInt3484 = i_21_;
				((Class73) class73).anInt3483 = ((ha) var_ha_22_).anInt937;
				((Class73) class73).anInt3481 = i_19_;
				((Class205) this).aClass74_1561.method729(class332_26_,
						class73, false);
			}
			if (bool != false)
				method2718(-24, false);
			return class332_26_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("nh.L(" + (class43 != null ? "{...}" : "null") + ','
							+ bool + ',' + i + ',' + i_17_ + ',' + i_18_ + ','
							+ (class313 != null ? "{...}" : "null") + ','
							+ (var_ha != null ? "{...}" : "null") + ',' + i_19_
							+ ',' + bool_20_ + ',' + i_21_ + ','
							+ (var_ha_22_ != null ? "{...}" : "null") + ','
							+ bool_23_ + ')'));
		}
	}

	Class205(Class279 class279, int i, boolean bool, Class365 class365,
			Class207 class207, Class207 class207_27_) {
		try {
			((Class205) this).anInt1555 = i;
			aClass365_1563 = class365;
			((Class205) this).aClass207_1556 = class207_27_;
			aBoolean1558 = bool;
			aClass207_1559 = class207;
			do {
				if (aClass207_1559 == null) {
					((Class205) this).anInt1554 = 0;
					if (!client.aBoolean3553)
						break;
				}
				int i_28_ = -1 + aClass207_1559.method2752((byte) -11);
				((Class205) this).anInt1554 = aClass207_1559.method2761(0,
						i_28_) + 256 * i_28_;
			} while (false);
			aStringArray1565 = (new String[] {
					null,
					null,
					Class309.aClass309_2593.method3615(
							((Class205) this).anInt1555, (byte) 25), null, null });
			aStringArray1566 = (new String[] {
					null,
					null,
					null,
					null,
					Class309.aClass309_2594.method3615(
							(((Class205) this).anInt1555), (byte) 25) });
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nh.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ bool + ',' + (class365 != null ? "{...}" : "null") + ','
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class207_27_ != null ? "{...}" : "null") + ')'));
		}
	}
}
