/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class322 {
	Interface8 anInterface8_2711;
	static float aFloat2712;
	static IncomingOpcode aClass58_2713 = new IncomingOpcode(50, 7);
	static Class207 aClass207_2714;

	public static void method3669(final int i) {
		do {
			try {
				aClass207_2714 = null;
				aClass58_2713 = null;
				aFloat2712 = -1.0144556F;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "tr.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final String method3670(final ByteBuffer class98_sub22,
			final byte i) {
		try {
			return Class98_Sub10_Sub26.method1084(false, class98_sub22, 32767);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("tr.C(" + (class98_sub22 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	static final void method3671(final int i, final int i_0_, final int i_1_,
			final Class246_Sub3_Sub1 class246_sub3_sub1) {
		final Class172 class172 = Class100.method1693(i, i_0_, i_1_);
		if (class172 != null) {
			class172.aClass246_Sub3_Sub1_1332 = class246_sub3_sub1;
			final int i_2_ = Class78.aSArray594 == Class81.aSArray618 ? 1 : 0;
			if (class246_sub3_sub1.method2978(-127)) {
				if (class246_sub3_sub1.method2987(6540)) {
					((Class246_Sub3) class246_sub3_sub1).aClass246_Sub3_5090 = Class359.aClass246_Sub3Array3056[i_2_];
					Class359.aClass246_Sub3Array3056[i_2_] = class246_sub3_sub1;
				} else {
					((Class246_Sub3) class246_sub3_sub1).aClass246_Sub3_5090 = Class379.aClass246_Sub3Array3198[i_2_];
					Class379.aClass246_Sub3Array3198[i_2_] = class246_sub3_sub1;
					Class358.aBoolean3033 = true;
				}
			} else {
				((Class246_Sub3) class246_sub3_sub1).aClass246_Sub3_5090 = Class130.aClass246_Sub3Array1029[i_2_];
				Class130.aClass246_Sub3Array1029[i_2_] = class246_sub3_sub1;
			}
		}
	}

	static final boolean method3672(final int i, final int i_3_, final int i_4_) {
		try {
			if (i_4_ != 2048) {
				return true;
			}
			if ((0x800 & i_3_) == 0) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tr.D(" + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final void method3673(final int i, final int i_5_, final int i_6_,
			final boolean bool) {
		try {
			Class281.aByteArrayArrayArray2117 = new byte[i_6_][i_5_][i];
			if (bool != true) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tr.E(" + i + ','
					+ i_5_ + ',' + i_6_ + ',' + bool + ')'));
		}
	}

	static final void method3674(final int i,
			final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2) {
		try {
			final Class98_Sub42 class98_sub42 = ((Class98_Sub42) (Class98_Sub10_Sub14.aClass377_5612
					.method3990(
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6369,
							-1)));
			if (class98_sub42 == null) {
				Class98_Sub31_Sub4
						.method1383(
								class246_sub3_sub4_sub2_sub2,
								null,
								(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6437[0]),
								0,
								i + 3,
								(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anIntArray6438[0]),
								((Class246_Sub3) class246_sub3_sub4_sub2_sub2).aByte5088,
								null);
			} else {
				class98_sub42.method1478(true);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tr.A("
					+ i
					+ ','
					+ ((class246_sub3_sub4_sub2_sub2 != null) ? "{...}"
							: "null") + ')'));
		}
	}
}
