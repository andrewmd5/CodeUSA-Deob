/* Class358 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class358 {
	Class246_Sub4 aClass246_Sub4_3028 = new Class246_Sub4();
	static IncomingOpcode aClass58_3029 = new IncomingOpcode(110, -1);
	static Class110 aClass110_3030 = new Class110();
	private Class246_Sub4 aClass246_Sub4_3031;
	static Class148 aClass148_3032 = new Class148();
	static boolean aBoolean3033 = true;
	static int[] anIntArray3034 = { 36064, 36065, 36066, 36067, 36068, 36069,
			36070, 36071, 36096 };

	final Class246_Sub4 method3884(final int i) {
		try {
			if (i < 18) {
				return null;
			}
			final Class246_Sub4 class246_sub4 = aClass246_Sub4_3031;
			if (aClass246_Sub4_3028 == class246_sub4) {
				aClass246_Sub4_3031 = null;
				return null;
			}
			aClass246_Sub4_3031 = class246_sub4.aClass246_Sub4_5091;
			return class246_sub4;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vn.G(" + i + ')');
		}
	}

	final int method3885(final boolean bool) {
		try {
			if (bool != true) {
				return 36;
			}
			int i = 0;
			for (Class246_Sub4 class246_sub4 = (aClass246_Sub4_3028.aClass246_Sub4_5091); aClass246_Sub4_3028 != class246_sub4; class246_sub4 = class246_sub4.aClass246_Sub4_5091) {
				i++;
			}
			return i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vn.B(" + bool
					+ ')');
		}
	}

	final void method3886(final byte i) {
		try {
			for (;;) {
				final Class246_Sub4 class246_sub4 = (aClass246_Sub4_3028.aClass246_Sub4_5091);
				if (aClass246_Sub4_3028 == class246_sub4) {
					break;
				}
				class246_sub4.method3101(-74);
			}
			aClass246_Sub4_3031 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vn.H(" + i + ')');
		}
	}

	static final void method3887(final int i) {
		do {
			try {
				Class287_Sub1.anIntArray3421 = Class64_Sub15.method610(35,
						2048, 0.4F, 4, true, true, 8, 8);
				if (i == 110) {
					break;
				}
				method3889(-6, -105, false);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vn.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method3888(final byte i) {
		try {
			anIntArray3034 = null;
			if (i != -3) {
				method3889(-15, -67, false);
			}
			aClass148_3032 = null;
			aClass58_3029 = null;
			aClass110_3030 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vn.F(" + i + ')');
		}
	}

	static final boolean method3889(int i, final int i_1_, final boolean bool) {
		try {
			if (bool != false) {
				anIntArray3034 = null;
			}
			if (i == 11) {
				i = 10;
			}
			final GameObjectDefinition class352 = Class130.aClass302_1028
					.method3546(i_1_, (byte) 119);
			if (i >= 5 && i <= 8) {
				i = 4;
			}
			return class352.method3853((byte) 49, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vn.C(" + i + ','
					+ i_1_ + ',' + bool + ')'));
		}
	}

	final Class246_Sub4 method3890(final byte i) {
		try {
			if (i != 71) {
				return null;
			}
			final Class246_Sub4 class246_sub4 = (aClass246_Sub4_3028.aClass246_Sub4_5091);
			if (class246_sub4 == aClass246_Sub4_3028) {
				aClass246_Sub4_3031 = null;
				return null;
			}
			aClass246_Sub4_3031 = class246_sub4.aClass246_Sub4_5091;
			return class246_sub4;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vn.A(" + i + ')');
		}
	}

	final void method3891(final Class246_Sub4 class246_sub4, final int i) {
		try {
			if (class246_sub4.aClass246_Sub4_5092 != null) {
				class246_sub4.method3101(-102);
			}
			class246_sub4.aClass246_Sub4_5091 = aClass246_Sub4_3028;
			if (i != 8) {
				method3884(51);
			}
			class246_sub4.aClass246_Sub4_5092 = (aClass246_Sub4_3028.aClass246_Sub4_5092);
			(class246_sub4.aClass246_Sub4_5092).aClass246_Sub4_5091 = class246_sub4;
			(class246_sub4.aClass246_Sub4_5091).aClass246_Sub4_5092 = class246_sub4;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("vn.E(" + (class246_sub4 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	public Class358() {
		try {
			aClass246_Sub4_3028.aClass246_Sub4_5092 = aClass246_Sub4_3028;
			aClass246_Sub4_3028.aClass246_Sub4_5091 = aClass246_Sub4_3028;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vn.<init>(" + ')');
		}
	}
}
