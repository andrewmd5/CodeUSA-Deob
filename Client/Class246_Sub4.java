/* Class246_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class246_Sub4 extends Class246 {
	Class246_Sub4 aClass246_Sub4_5091;
	Class246_Sub4 aClass246_Sub4_5092;

	static final void method3099(final int i, final int i_0_, final byte i_1_) {
		do {
			try {
				if (!(Class278.aFloat2064 < Class278.aFloat2068)) {
					if (Class278.aFloat2068 < Class278.aFloat2064) {
						Class278.aFloat2064 -= Class278.aFloat2064 / 30.0;
						if (Class278.aFloat2068 > Class278.aFloat2064) {
							Class278.aFloat2064 = Class278.aFloat2068;
						}
						aa_Sub1.method155(-1);
						Class278.anInt2069 = (int) Class278.aFloat2064 >> 9275809;
						Class278.aByteArrayArrayArray2072 = Class287_Sub2
								.method3392(Class278.anInt2069, (byte) -86);
					}
				} else {
					Class278.aFloat2064 += Class278.aFloat2064 / 30.0;
					if (Class278.aFloat2064 > Class278.aFloat2068) {
						Class278.aFloat2064 = Class278.aFloat2068;
					}
					aa_Sub1.method155(-1);
					Class278.anInt2069 = (int) Class278.aFloat2064 >> 2089293857;
					Class278.aByteArrayArrayArray2072 = Class287_Sub2
							.method3392(Class278.anInt2069, (byte) 112);
				}
				if (Class101.anInt849 != -1 && Class169.anInt1307 != -1) {
					int i_2_ = -Class42_Sub4.anInt5371 + Class101.anInt849;
					if (i_2_ < 2 || (i_2_ ^ 0xffffffff) < -3) {
						i_2_ /= 8;
					}
					int i_3_ = -Class98_Sub40.anInt4197 + Class169.anInt1307;
					Class42_Sub4.anInt5371 -= -i_2_;
					if ((i_3_ ^ 0xffffffff) > -3 || i_3_ > 2) {
						i_3_ /= 8;
					}
					if (i_2_ == 0 && (i_3_ ^ 0xffffffff) == -1) {
						Class101.anInt849 = -1;
						Class169.anInt1307 = -1;
					}
					Class98_Sub40.anInt4197 = i_3_ + Class98_Sub40.anInt4197;
					aa_Sub1.method155(-1);
				}
				if (i_1_ != 2) {
					method3099(33, 96, (byte) -1);
				}
				if ((Class64_Sub25.anInt3711 ^ 0xffffffff) >= -1) {
					Class98_Sub5_Sub2.anInt5536 = -1;
					Class256.anInt1945 = -1;
				} else {
					Class287.anInt2186--;
					if (Class287.anInt2186 == 0) {
						Class287.anInt2186 = 100;
						Class64_Sub25.anInt3711--;
					}
				}
				if (!Class253.aBoolean1930 || Class8.aClass148_110 == null) {
					break;
				}
				for (Class98_Sub23 class98_sub23 = (Class98_Sub23) Class8.aClass148_110
						.method2418(32); class98_sub23 != null; class98_sub23 = ((Class98_Sub23) Class8.aClass148_110
						.method2417(i_1_ ^ 0x73))) {
					final Class24 class24 = (Class278.aClass341_2057
							.method3807(
									i_1_ ^ ~0x20,
									((class98_sub23.aClass98_Sub47_3997).anInt4268)));
					if (!class98_sub23.method1267(-2147483648, i_0_, i)) {
						if ((class98_sub23.aClass98_Sub47_3997).aBoolean4275) {
							(class98_sub23.aClass98_Sub47_3997).aBoolean4275 = false;
							ClientScriptsDefs
									.method3152(
											(Class98_Sub10_Sub26.aClass105_5684),
											((class98_sub23.aClass98_Sub47_3997).anInt4268),
											class24.anInt246);
						}
					} else {
						if (class24.aStringArray237 != null) {
							if (class24.aStringArray237[4] != null) {
								Class293.method3470(
										false,
										true,
										(class98_sub23.aClass98_Sub47_3997).anInt4268,
										-1,
										class24.anInt246,
										class24.aString232,
										false,
										0,
										1004,
										(class98_sub23.aClass98_Sub47_3997).anInt4268,
										-1, false, class24.aStringArray237[4]);
							}
							if (class24.aStringArray237[3] != null) {
								Class293.method3470(
										false,
										true,
										(class98_sub23.aClass98_Sub47_3997).anInt4268,
										-1,
										class24.anInt246,
										class24.aString232,
										false,
										0,
										1010,
										(class98_sub23.aClass98_Sub47_3997).anInt4268,
										-1, false, class24.aStringArray237[3]);
							}
							if (class24.aStringArray237[2] != null) {
								Class293.method3470(
										false,
										true,
										(class98_sub23.aClass98_Sub47_3997).anInt4268,
										-1,
										class24.anInt246,
										class24.aString232,
										false,
										0,
										1001,
										(class98_sub23.aClass98_Sub47_3997).anInt4268,
										-1, false, class24.aStringArray237[2]);
							}
							if (class24.aStringArray237[1] != null) {
								Class293.method3470(
										false,
										true,
										(class98_sub23.aClass98_Sub47_3997).anInt4268,
										-1,
										class24.anInt246,
										class24.aString232,
										false,
										0,
										1003,
										(class98_sub23.aClass98_Sub47_3997).anInt4268,
										-1, false, class24.aStringArray237[1]);
							}
							if (class24.aStringArray237[0] != null) {
								Class293.method3470(
										false,
										true,
										(class98_sub23.aClass98_Sub47_3997).anInt4268,
										-1,
										class24.anInt246,
										class24.aString232,
										false,
										0,
										1011,
										(class98_sub23.aClass98_Sub47_3997).anInt4268,
										-1, false, class24.aStringArray237[0]);
							}
						}
						if (!(class98_sub23.aClass98_Sub47_3997).aBoolean4275) {
							(class98_sub23.aClass98_Sub47_3997).aBoolean4275 = true;
							ClientScriptsDefs
									.method3152(
											Class90.aClass105_719,
											((class98_sub23.aClass98_Sub47_3997).anInt4268),
											class24.anInt246);
						}
						if ((class98_sub23.aClass98_Sub47_3997).aBoolean4275) {
							ClientScriptsDefs
									.method3152(
											Class331.aClass105_2792,
											((class98_sub23.aClass98_Sub47_3997).anInt4268),
											class24.anInt246);
						}
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("hs.F(" + i
						+ ',' + i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method3100(final int i, final byte i_4_) {
		try {
			if (i_4_ < 41) {
				return false;
			}
			if ((i ^ 0xffffffff) > -13 || (i ^ 0xffffffff) < -18) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hs.E(" + i + ','
					+ i_4_ + ')');
		}
	}

	final void method3101(final int i) {
		try {
			if (aClass246_Sub4_5092 != null) {
				aClass246_Sub4_5092.aClass246_Sub4_5091 = aClass246_Sub4_5091;
				aClass246_Sub4_5091.aClass246_Sub4_5092 = aClass246_Sub4_5092;
				aClass246_Sub4_5091 = null;
				aClass246_Sub4_5092 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hs.G(" + i + ')');
		}
	}

	public Class246_Sub4() {
		/* empty */
	}
}
