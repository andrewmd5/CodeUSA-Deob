/* Class98_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub1 extends Node {
	int anInt3809;
	boolean[] aBooleanArray3810;
	static OutgoingOpcode aClass171_3811 = new OutgoingOpcode(67, 8);
	int[] anIntArray3812;
	int anInt3813;
	static int anInt3814;
	int[] anIntArray3815;
	int[][] anIntArrayArray3816;

	static final Class43 method945(final int i, final ha var_ha,
			final byte i_0_, final boolean bool) {
		try {
			if (i_0_ < 74) {
				return null;
			}
			final Class244 class244 = Class114
					.method2151(i, bool, var_ha, true);
			if (class244 == null) {
				return null;
			}
			return class244.aClass43_1859;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ah.C(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_0_ + ','
					+ bool + ')'));
		}
	}

	static final void method946(final int i, final int i_1_, final int i_2_,
			final Class293 class293) {
		try {
			Class265.aClass293_1979 = class293;
			if (i_1_ <= -104) {
				Class64_Sub10.anInt3664 = i_2_;
				Class98_Sub10_Sub17.anInt5623 = i;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ah.B(" + i + ','
					+ i_1_ + ',' + i_2_ + ','
					+ (class293 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method947(final int i) {
		do {
			try {
				aClass171_3811 = null;
				if (i == -20899) {
					break;
				}
				aClass171_3811 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ah.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	Class98_Sub1(final int i, final byte[] is) {
		try {
			anInt3813 = i;
			final ByteBuffer class98_sub22 = new ByteBuffer(is);
			anInt3809 = class98_sub22.readUnsignedByte((byte) 38);
			anIntArray3815 = new int[anInt3809];
			anIntArray3812 = new int[anInt3809];
			aBooleanArray3810 = new boolean[anInt3809];
			anIntArrayArray3816 = new int[anInt3809][];
			for (int i_3_ = 0; i_3_ < anInt3809; i_3_++) {
				anIntArray3812[i_3_] = class98_sub22
						.readUnsignedByte((byte) -126);
				if (anIntArray3812[i_3_] == 6) {
					anIntArray3812[i_3_] = 2;
				}
			}
			for (int i_4_ = 0; ((anInt3809 ^ 0xffffffff) < (i_4_ ^ 0xffffffff)); i_4_++) {
				aBooleanArray3810[i_4_] = ((class98_sub22
						.readUnsignedByte((byte) -128) ^ 0xffffffff) == -2);
			}
			for (int i_5_ = 0; ((anInt3809 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++) {
				anIntArray3815[i_5_] = class98_sub22.readUnsignedShort((byte) 127);
			}
			for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (anInt3809 ^ 0xffffffff)); i_6_++) {
				anIntArrayArray3816[i_6_] = new int[class98_sub22
						.readUnsignedByte((byte) -119)];
			}
			for (int i_7_ = 0; ((anInt3809 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
				for (int i_8_ = 0; (anIntArrayArray3816[i_7_].length > i_8_); i_8_++) {
					anIntArrayArray3816[i_7_][i_8_] = class98_sub22
							.readUnsignedByte((byte) 125);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ah.<init>(" + i
					+ ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}
}
