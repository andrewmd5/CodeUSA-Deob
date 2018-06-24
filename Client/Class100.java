/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class100 {
	private Class98_Sub46 aClass98_Sub46_839 = new Class98_Sub46();
	static Class113 aClass113_840 = new Class113(0, 1);
	private int anInt841;
	private Class215 aClass215_842 = new Class215();
	private int anInt843;
	static Class339_Sub1[] aClass339_Sub1Array844 = new Class339_Sub1[37];
	static float aFloat845;
	private Class377 aClass377_846;

	static final boolean method1688(int i, int i_0_, int i_1_,
			Class246_Sub3_Sub3 class246_sub3_sub3, byte i_2_) {
		try {
			if (!Class98_Sub17.aBoolean3942 || !Class135.aBoolean1052)
				return false;
			if (Class4.anInt81 < 100)
				return false;
			if (!Class76_Sub5.method758((byte) -78, i, i_1_, i_0_))
				return false;
			int i_4_ = i_0_ << Class151_Sub8.anInt5015;
			int i_5_ = i_1_ << Class151_Sub8.anInt5015;
			int i_6_ = Class78.aSArray594[i].method3420(i_1_, -12639, i_0_) - 1;
			int i_7_ = i_6_ + class246_sub3_sub3.method2990(0);
			if ((((Class246_Sub3_Sub3) class246_sub3_sub3).aShort6153 ^ 0xffffffff) == -2) {
				if (!Class254.method3187(i_7_, i_4_, i_5_, (byte) 82, i_6_,
						r_Sub2.anInt6333 + i_5_, i_7_, i_5_, i_4_, i_4_))
					return false;
				if (!Class254.method3187(i_7_, i_4_, i_5_, (byte) 82, i_6_,
						r_Sub2.anInt6333 + i_5_, i_6_, i_5_ + r_Sub2.anInt6333,
						i_4_, i_4_))
					return false;
				Class98_Sub16.anInt3927++;
				return true;
			}
			if (((Class246_Sub3_Sub3) class246_sub3_sub3).aShort6153 == 2) {
				if (!Class254
						.method3187(i_7_, i_4_, r_Sub2.anInt6333 + i_5_,
								(byte) 82, i_6_, r_Sub2.anInt6333 + i_5_, i_7_,
								r_Sub2.anInt6333 + i_5_, i_4_
										- -r_Sub2.anInt6333, i_4_))
					return false;
				if (!Class254.method3187(i_6_, r_Sub2.anInt6333 + i_4_, i_5_
						+ r_Sub2.anInt6333, (byte) 82, i_6_, i_5_
						+ r_Sub2.anInt6333, i_7_, i_5_ - -r_Sub2.anInt6333,
						i_4_ - -r_Sub2.anInt6333, i_4_))
					return false;
				Class98_Sub16.anInt3927++;
				return true;
			}
			if (((Class246_Sub3_Sub3) class246_sub3_sub3).aShort6153 == 4) {
				if (!Class254.method3187(i_7_, i_4_ - -r_Sub2.anInt6333, i_5_,
						(byte) 82, i_6_, r_Sub2.anInt6333 + i_5_, i_7_, i_5_,
						r_Sub2.anInt6333 + i_4_, r_Sub2.anInt6333 + i_4_))
					return false;
				if (!Class254.method3187(i_7_, r_Sub2.anInt6333 + i_4_, i_5_,
						(byte) 82, i_6_, i_5_ + r_Sub2.anInt6333, i_6_,
						r_Sub2.anInt6333 + i_5_, i_4_ - -r_Sub2.anInt6333,
						r_Sub2.anInt6333 + i_4_))
					return false;
				Class98_Sub16.anInt3927++;
				return true;
			}
			if ((((Class246_Sub3_Sub3) class246_sub3_sub3).aShort6153 ^ 0xffffffff) == -9) {
				if (!Class254.method3187(i_7_, i_4_, i_5_, (byte) 82, i_6_,
						i_5_, i_7_, i_5_, r_Sub2.anInt6333 + i_4_, i_4_))
					return false;
				if (!Class254.method3187(i_6_, i_4_ + r_Sub2.anInt6333, i_5_,
						(byte) 82, i_6_, i_5_, i_7_, i_5_, r_Sub2.anInt6333
								+ i_4_, i_4_))
					return false;
				Class98_Sub16.anInt3927++;
				return true;
			}
			if ((((Class246_Sub3_Sub3) class246_sub3_sub3).aShort6153 ^ 0xffffffff) == -17) {
				if (!s_Sub1.method3427(i_6_, Class207.anInt1577, i_7_,
						Class207.anInt1577, (byte) 16, Class207.anInt1577
								+ i_5_, i_4_))
					return false;
				Class98_Sub16.anInt3927++;
				return true;
			}
			if (((Class246_Sub3_Sub3) class246_sub3_sub3).aShort6153 == 32) {
				if (!s_Sub1.method3427(i_6_, Class207.anInt1577, i_7_,
						Class207.anInt1577, (byte) 16, i_5_
								- -Class207.anInt1577, Class207.anInt1577
								+ i_4_))
					return false;
				Class98_Sub16.anInt3927++;
				return true;
			}
			if (((Class246_Sub3_Sub3) class246_sub3_sub3).aShort6153 == 64) {
				if (!s_Sub1.method3427(i_6_, Class207.anInt1577, i_7_,
						Class207.anInt1577, (byte) 16, i_5_, i_4_
								- -Class207.anInt1577))
					return false;
				Class98_Sub16.anInt3927++;
				return true;
			}
			if (((Class246_Sub3_Sub3) class246_sub3_sub3).aShort6153 == 128) {
				if (!s_Sub1.method3427(i_6_, Class207.anInt1577, i_7_,
						Class207.anInt1577, (byte) 16, i_5_, i_4_))
					return false;
				Class98_Sub16.anInt3927++;
				return true;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gea.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ','
					+ (class246_sub3_sub3 != null ? "{...}" : "null") + ','
					+ i_2_ + ')'));
		}
	}

	final void method1689(long l, byte i) {
		do {
			try {
				Class98_Sub46 class98_sub46 = (Class98_Sub46) aClass377_846
						.method3990(l, -1);
				int i_8_ = 88 / ((-13 - i) / 35);
				if (class98_sub46 == null)
					break;
				class98_sub46.method942(98);
				class98_sub46.method1524((byte) -90);
				anInt843++;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "gea.D(" + l
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method1690(int i) {
		try {
			aClass215_842.method2786(16711680);
			if (i == 1) {
				aClass377_846.method3994(-84);
				aClass98_Sub46_839 = new Class98_Sub46();
				anInt843 = anInt841;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gea.C(" + i + ')');
		}
	}

	public static void method1691(int i) {
		try {
			aClass339_Sub1Array844 = null;
			if (i != -9)
				method1691(-108);
			aClass113_840 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gea.B(" + i + ')');
		}
	}

	static final void method1692(int i, int i_9_, int i_10_, int i_11_,
			int i_12_) {
		try {
			if (i_12_ != 64)
				method1688(-20, 71, 72, null, (byte) 127);
			if ((i ^ 0xffffffff) == -9 || (i ^ 0xffffffff) == -17) {
				for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (ha.anInt936 ^ 0xffffffff); i_13_++) {
					Class155 class155 = Class98_Sub32_Sub1.aClass155Array5889[i_13_];
					if ((i == ((Class155) class155).aByte1242
							&& ((i_10_ ^ 0xffffffff) == (((Class155) class155).aShort1236 ^ 0xffffffff)) && ((Class155) class155).aShort1239 == i_11_)
							|| (i_10_ == ((Class155) class155).aShort1243 && ((((Class155) class155).aShort1239 ^ 0xffffffff) == (i_11_ ^ 0xffffffff)))) {
						if (ha.anInt936 != i_13_)
							Class236.method2892(
									Class98_Sub32_Sub1.aClass155Array5889,
									1 + i_13_,
									Class98_Sub32_Sub1.aClass155Array5889,
									i_13_,
									(Class98_Sub32_Sub1.aClass155Array5889.length - (1 + i_13_)));
						ha.anInt936--;
						break;
					}
				}
			} else {
				Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_9_][i_10_][i_11_]);
				if (class172 != null) {
					if ((i ^ 0xffffffff) == -2)
						((Class172) class172).aShort1335 = (short) 0;
					else if (i == 2)
						((Class172) class172).aShort1328 = (short) 0;
				}
				Class64_Sub22.method644(i_12_ + -107);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gea.H(" + i + ','
					+ i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	static final Class172 method1693(int i, int i_14_, int i_15_) {
		if (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_14_][i_15_] == null) {
			boolean bool = ((Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i_14_][i_15_]) != null && ((Class172) (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[0][i_14_][i_15_])).aClass172_1330 != null);
			if (bool && i >= Class364.anInt3103 - 1)
				return null;
			Class224_Sub2_Sub1.method2839(i, i_14_, i_15_);
		}
		return (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_14_][i_15_]);
	}

	final Class98_Sub46 method1694(byte i, long l) {
		try {
			Class98_Sub46 class98_sub46 = (Class98_Sub46) aClass377_846
					.method3990(l, -1);
			int i_16_ = 84 / ((i - 71) / 35);
			if (class98_sub46 != null)
				aClass215_842.method2785(class98_sub46, -54);
			return class98_sub46;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gea.E(" + i + ','
					+ l + ')');
		}
	}

	final void method1695(int i, Class98_Sub46 class98_sub46, long l) {
		do {
			try {
				do {
					if ((anInt843 ^ 0xffffffff) == -1) {
						Class98_Sub46 class98_sub46_17_ = aClass215_842
								.method2789(-16711936);
						class98_sub46_17_.method942(i + -26312);
						class98_sub46_17_.method1524((byte) -90);
						if (aClass98_Sub46_839 != class98_sub46_17_)
							break;
						class98_sub46_17_ = aClass215_842.method2789(-16711936);
						class98_sub46_17_.method942(116);
						class98_sub46_17_.method1524((byte) -90);
						if (!client.aBoolean3553)
							break;
					}
					anInt843--;
				} while (false);
				aClass377_846.method3996(class98_sub46, l, i + -26405);
				aClass215_842.method2785(class98_sub46, -101);
				if (i == 26404)
					break;
				method1688(-123, -119, 55, null, (byte) 68);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("gea.G(" + i
						+ ',' + (class98_sub46 != null ? "{...}" : "null")
						+ ',' + l + ')'));
			}
			break;
		} while (false);
	}

	Class100(int i) {
		try {
			anInt843 = i;
			anInt841 = i;
			int i_18_;
			for (i_18_ = 1; i_18_ + i_18_ < i; i_18_ += i_18_) {
				/* empty */
			}
			aClass377_846 = new Class377(i_18_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gea.<init>(" + i
					+ ')');
		}
	}
}
