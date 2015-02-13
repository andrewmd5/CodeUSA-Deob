/* Class98_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub19 extends Class98 {
	int[] anIntArray3953;
	int anInt3954;
	static int anInt3955 = 0;
	static int anInt3956;
	int[] anIntArray3957;
	byte[][][] aByteArrayArrayArray3958;
	int[] anIntArray3959;
	int anInt3960;
	Class143[] aClass143Array3961;
	Class143[] aClass143Array3962;

	static final void method1164(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i_3_, -105, i_2_);
			class98_sub46_sub17.method1626((byte) -103);
			class98_sub46_sub17.anInt6051 = i;
			class98_sub46_sub17.anInt6054 = i_1_;
			class98_sub46_sub17.anInt6053 = i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ia.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method1165(final byte i, final String string) {
		do {
			try {
				if (Class98_Sub10_Sub9.aBoolean5585
						&& (0x18 & Class98_Sub4.anInt3826 ^ 0xffffffff) != -1
						&& i == 36) {
					boolean bool = false;
					final int i_4_ = Class2.anInt71;
					final int[] is = Class319.anIntArray2705;
					for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_5_++) {
						final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[is[i_5_]]);
						if (class246_sub3_sub4_sub2_sub2.aString6537 != null
								&& class246_sub3_sub4_sub2_sub2.aString6537
										.equalsIgnoreCase(string)
								&& (((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660 == class246_sub3_sub4_sub2_sub2) && (0x10 & Class98_Sub4.anInt3826) != 0) || (class246_sub3_sub4_sub2_sub2 != null && (Class98_Sub4.anInt3826 & 0x8) != 0))) {
							client.anInt3548++;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260, Class160.aClass171_1259,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865
									.writeLEShortA(is[i_5_], 128);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(
									Class310.anInt2652, (byte) 126);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeLEInt(
									Class187.anInt1450, 1046032984);
							class98_sub11.aClass98_Sub22_Sub1_3865.method1231(
									0, (byte) -95);
							class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(
									Class376.anInt3173, (byte) 126);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							Class76_Sub2
									.requestFlag(
											0,
											0,
											class246_sub3_sub4_sub2_sub2
													.method3034(0),
											-2,
											0,
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6438[0]),
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6437[0]),
											true, class246_sub3_sub4_sub2_sub2
													.method3034(0));
							bool = true;
							break;
						}
					}
					if (!bool) {
						za_Sub2.method1684(
								((Class309.aClass309_2607.method3615(
										Class374.anInt3159, (byte) 25)) + string),
								4, (byte) 71);
					}
					if (!Class98_Sub10_Sub9.aBoolean5585) {
						break;
					}
					Class98_Sub10_Sub32.method1098((byte) 119);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ia.A(" + i
						+ ',' + (string != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public Class98_Sub19() {
		/* empty */
	}
}
