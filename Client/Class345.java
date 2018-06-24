/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class345 {
	static Class132 aClass132_2889;
	private ha_Sub1 aHa_Sub1_2890;
	long aLong2891;

	static final void method3824(final String string, final int i) {
		try {
			if (i == 2 && !string.equals("")) {
				Class39_Sub1.anInt3594++;
				final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
						.method3023(i ^ 0x106, (Class98_Sub23.aClass171_3998),
								Class331.aClass117_2811);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
						r_Sub2.method1650(string, (byte) 74), i ^ ~0x40);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1188(string,
						(byte) 113);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "v.B("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final int method3825(int i, final int i_0_, final byte i_1_) {
		try {
			if (i_0_ == -2) {
				return 12345678;
			}
			if (i_1_ != -21) {
				method3826(-112);
			}
			if ((i_0_ ^ 0xffffffff) == 0) {
				if ((i ^ 0xffffffff) > -3) {
					i = 2;
				} else if (i > 126) {
					i = 126;
				}
				return i;
			}
			i = (0x7f & i_0_) * i >> -1571731161;
			if ((i ^ 0xffffffff) <= -3) {
				if ((i ^ 0xffffffff) < -127) {
					i = 126;
				}
			} else {
				i = 2;
			}
			return (0xff80 & i_0_) + i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("v.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	@Override
	protected final void finalize() throws Throwable {
		try {
			aHa_Sub1_2890.method1855(false, aLong2891);
			super.finalize();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "v.finalize(" + ')');
		}
	}

	public static void method3826(final int i) {
		do {
			try {
				aClass132_2889 = null;
				if (i <= -68) {
					break;
				}
				aClass132_2889 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "v.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	Class345(final ha_Sub1 var_ha_Sub1, final long l, final int i) {
		try {
			aLong2891 = l;
			aHa_Sub1_2890 = var_ha_Sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("v.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + l + ','
					+ i + ')'));
		}
	}
}
