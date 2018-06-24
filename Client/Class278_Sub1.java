/* Class278_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;

final class Class278_Sub1 extends Class278 {
	static int[] anIntArray5168;
	static int[][] anIntArrayArray5169 = { { 12, 12, 12, 12 },
			{ 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 },
			{ 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 },
			{ 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 },
			{ 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
	static int anInt5170;
	static boolean[][] aBooleanArrayArray5171 = {
			new boolean[13],
			{ false, false, true, true, true, true, true, false, false, false,
					false, false, true },
			{ true, true, true, true, true, true, false, false, false, false,
					false, false, false },
			{ true, true, true, false, false, true, true, true, false, false,
					false, false, false },
			{ true, false, false, false, false, true, true, true, false, false,
					false, false, false },
			{ false, false, true, true, true, true, false, false, false, false,
					false, false, false },
			{ false, true, true, true, true, true, false, false, false, false,
					false, false, true },
			{ false, true, true, true, true, true, true, true, false, false,
					false, false, true },
			{ true, true, false, false, false, false, false, true, false,
					false, false, false, false },
			{ true, true, true, true, true, false, false, false, true, true,
					false, false, false },
			{ true, false, false, false, true, true, true, true, true, true,
					false, false, false },
			{ true, false, true, true, true, true, true, true, false, false,
					true, true, false },
			{ true, true, true, true, true, true, true, true, true, true, true,
					true, true },
			new boolean[13],
			{ true, true, true, true, true, true, true, true, true, true, true,
					true, true } };

	public static void method3319(final int i) {
		try {
			anIntArrayArray5169 = null;
			aBooleanArrayArray5171 = null;
			if (i == 1204) {
				anIntArray5168 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "paa.A(" + i + ')');
		}
	}

	static final int method3320(final int i) {
		try {
			ha var_ha = Class265.aHa1974;
			boolean bool = false;
			if ((Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
					.method583((byte) 123) ^ 0xffffffff) != -1) {
				final Canvas canvas = new Canvas();
				canvas.setSize(100, 100);
				bool = true;
				var_ha = Class76_Sub11.method771(0, canvas, 127, null, 0, null);
			}
			final long l = Class343.method3819(-47);
			for (int i_0_ = 0; i_0_ < 10000; i_0_++) {
				var_ha.method1751(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536,
						-65536, -65536, 1);
			}
			final int i_1_ = (int) (Class343.method3819(-47) - l);
			var_ha.method1760(100, 100, 0, -16777216, (byte) -66, 0);
			if (bool) {
				var_ha.method1743(-1);
			}
			if (i != 12) {
				method3319(-59);
			}
			return i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "paa.B(" + i + ')');
		}
	}

	static {
		anInt5170 = 0;
	}
}
