/* Class98_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub16 extends Node {
	Class98_Sub44 aClass98_Sub44_3918;
	int anInt3919;
	int anInt3920;
	int anInt3921;
	int anInt3922;
	int anInt3923;
	int anInt3924;
	int anInt3925;
	int anInt3926;
	static int anInt3927;
	static int[] anIntArray3928 = new int[32];
	int anInt3929;
	int anInt3930;
	int anInt3931;
	int anInt3932;
	static int[] anIntArray3933 = new int[4];
	Class98_Sub24_Sub1 aClass98_Sub24_Sub1_3934;
	Class89 aClass89_3935;
	int anInt3936;
	int anInt3937;
	int anInt3938;
	Class98_Sub31_Sub5 aClass98_Sub31_Sub5_3939;
	int anInt3940;
	int anInt3941;

	public static void method1146(final boolean bool) {
		do {
			try {
				anIntArray3933 = null;
				anIntArray3928 = null;
				if (bool == false) {
					break;
				}
				anIntArray3933 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hea.D(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method1147(final int i, final int i_0_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i_0_, -126, 6);
			class98_sub46_sub17.method1621(0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hea.E(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method1148(final int i) {
		do {
			try {
				aClass98_Sub31_Sub5_3939 = null;
				aClass98_Sub44_3918 = null;
				aClass98_Sub24_Sub1_3934 = null;
				aClass89_3935 = null;
				if (i == -1) {
					break;
				}
				method1146(false);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hea.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final int method1149(final boolean bool, final Class199 class199,
			final ha var_ha) {
		try {
			if (bool != false) {
				anIntArray3933 = null;
			}
			if (class199.anInt1540 != -1) {
				return class199.anInt1540;
			}
			if (class199.anInt1542 != -1) {
				final TextureDefinition textureDefinition = var_ha.aD938.method11(
						class199.anInt1542, -28755);
				if (!textureDefinition.aBoolean1825) {
					return textureDefinition.aShort1831;
				}
			}
			return class199.anInt1537;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hea.B(" + bool
					+ ',' + (class199 != null ? "{...}" : "null") + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1150(final int i, final int i_2_, final int i_3_,
			final int i_4_, boolean bool) {
		try {
			Class230.method2871(i_3_ + -117);
			Class98_Sub10_Sub25.aLong5677 = 0L;
			final int i_5_ = Class146_Sub2.method2391((byte) -68);
			if (i == i_3_ || (i_5_ ^ 0xffffffff) == -4) {
				bool = true;
			}
			if (!Class265.aHa1974.method1800()) {
				bool = true;
			}
			Class93_Sub1_Sub1.method909(i, i_3_ + -29761, bool, i_5_, i_2_,
					i_4_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hea.C(" + i + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + bool + ')'));
		}
	}
}
