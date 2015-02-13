/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class303 {
	static Class13 aClass13_2529;
	static int anInt2530;
	static int[] anIntArray2531 = { 28, 35, 40, 44 };

	static final void method3556(final Class332[] class332s, final int i) {
		try {
			RuntimeException_Sub1.anInt3201 = class332s.length;
			Class217.aClass332Array3408 = new Class332[10 + RuntimeException_Sub1.anInt3201];
			Class64_Sub5.anIntArray3652 = new int[RuntimeException_Sub1.anInt3201
					- -10];
			Class236.method2892(class332s, 0, Class217.aClass332Array3408, i,
					RuntimeException_Sub1.anInt3201);
			for (int i_0_ = 0; i_0_ < RuntimeException_Sub1.anInt3201; i_0_++) {
				Class64_Sub5.anIntArray3652[i_0_] = Class217.aClass332Array3408[i_0_]
						.method3749();
			}
			for (int i_1_ = RuntimeException_Sub1.anInt3201; i_1_ < Class217.aClass332Array3408.length; i_1_++) {
				Class64_Sub5.anIntArray3652[i_1_] = 12;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("sj.A("
					+ (class332s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method3557(final int i, final int i_2_,
			final String string, final int i_3_, final int i_4_) {
		do {
			try {
				final Class293 class293 = Class246_Sub9.method3139((byte) 72,
						i_4_, i_2_);
				if (class293 != null) {
					if (class293.anObjectArray2329 != null) {
						final Class98_Sub21 class98_sub21 = new Class98_Sub21();
						class98_sub21.anObjectArray3981 = class293.anObjectArray2329;
						class98_sub21.aClass293_3986 = class293;
						class98_sub21.anInt3984 = i;
						class98_sub21.aString3978 = string;
						ClientScriptsDefs.method3144(class98_sub21);
					}
					if (Class177.anInt1376 == 10
							&& client.method116(class293).method1666(
									(byte) -72, -1 + i)) {
						if ((i ^ 0xffffffff) == -2) {
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(
											260,
											Class246_Sub3_Sub5_Sub1.aClass171_6221,
											Class331.aClass117_2811));
							Class180.method2604(i_2_, -21568, i_4_,
									(class293.anInt2302), class98_sub11);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
						if (i == 2) {
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, aa_Sub2.aClass171_3564,
											Class331.aClass117_2811));
							Class180.method2604(i_2_, -21568, i_4_,
									(class293.anInt2302), class98_sub11);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
						if (i == 3) {
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260,
											Class98_Sub46_Sub9.aClass171_6000,
											Class331.aClass117_2811));
							Class180.method2604(i_2_, -21568, i_4_,
									(class293.anInt2302), class98_sub11);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
						if ((i ^ 0xffffffff) == -5) {
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, Class234.aClass171_1747,
											Class331.aClass117_2811));
							Class180.method2604(i_2_, -21568, i_4_,
									(class293.anInt2302), class98_sub11);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
						if ((i ^ 0xffffffff) == -6) {
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, aa.aClass171_49,
											Class331.aClass117_2811));
							Class180.method2604(i_2_, -21568, i_4_,
									(class293.anInt2302), class98_sub11);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
						if (i_3_ > -114) {
							method3557(-106, 15, null, 96, 60);
						}
						if ((i ^ 0xffffffff) == -7) {
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260,
											Class98_Sub1.aClass171_3811,
											Class331.aClass117_2811));
							Class180.method2604(i_2_, -21568, i_4_,
									(class293.anInt2302), class98_sub11);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
						if ((i ^ 0xffffffff) == -8) {
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, Class17.aClass171_202,
											Class331.aClass117_2811));
							Class180.method2604(i_2_, -21568, i_4_,
									(class293.anInt2302), class98_sub11);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
						if ((i ^ 0xffffffff) == -9) {
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, Class15.aClass171_177,
											Class331.aClass117_2811));
							Class180.method2604(i_2_, -21568, i_4_,
									(class293.anInt2302), class98_sub11);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
						if ((i ^ 0xffffffff) == -10) {
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(
											260,
											Class246_Sub3_Sub2_Sub1.aClass171_6342,
											Class331.aClass117_2811));
							Class180.method2604(i_2_, -21568, i_4_,
									(class293.anInt2302), class98_sub11);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
						}
						if ((i ^ 0xffffffff) != -11) {
							break;
						}
						final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
								.method3023(260, (Class13.aClass171_164),
										(Class331.aClass117_2811));
						Class180.method2604(i_2_, -21568, i_4_,
								class293.anInt2302, class98_sub11);
						Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("sj.B(" + i
						+ ',' + i_2_ + ','
						+ (string != null ? "{...}" : "null") + ',' + i_3_
						+ ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method3558(final int i) {
		do {
			try {
				aClass13_2529 = null;
				anIntArray2531 = null;
				if (i == 10) {
					break;
				}
				anIntArray2531 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "sj.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
