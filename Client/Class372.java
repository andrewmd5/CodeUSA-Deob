/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class372 {
	int anInt3145;
	int anInt3146;
	static IncomingOpcode aClass58_3147 = new IncomingOpcode(51, 3);
	int anInt3148;
	static int[][] anIntArrayArray3149;
	static int anInt3150;
	static float aFloat3151;
	static boolean aBoolean3152 = false;
	static short[] aShortArray3153 = new short[256];

	static final void method3957(final ha var_ha, final boolean bool,
			final Class293 class293) {
		do {
			try {
				if (bool == true) {
					final boolean bool_0_ = ((Class98_Sub46_Sub19.aClass205_6068
							.method2710(
									class293.anInt2304,
									class293.anInt2302,
									var_ha,
									(class293.aBoolean2262 ? (Surface.player.appearance)
											: null), class293.anInt2349,
									class293.anInt2305, ~0xffffff
											| class293.anInt2355, 24056)) == null);
					if (!bool_0_) {
						break;
					}
					IOException_Sub1.aClass148_30.method2419(new Class98_Sub12(
							class293.anInt2302, class293.anInt2349,
							class293.anInt2304,
							(class293.anInt2355 | ~0xffffff),
							class293.anInt2305, class293.aBoolean2262), -20911);
					Class341.method3812(class293);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("wj.C("
						+ (var_ha != null ? "{...}" : "null") + ',' + bool
						+ ',' + (class293 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method3958(final int i) {
		try {
			if (i != -12477) {
				method3958(4);
			}
			aShortArray3153 = null;
			aClass58_3147 = null;
			anIntArrayArray3149 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wj.B(" + i + ')');
		}
	}

	static final void method3959(final int i, final int i_1_,
			final Class98_Sub31_Sub2 class98_sub31_sub2,
			final Class207 class207, final int i_2_, final int i_3_,
			final boolean bool) {
		do {
			try {
				s_Sub1.method3434(class207, bool, i_2_, i_1_, i_3_, -16523);
				Class116.aClass98_Sub31_Sub2_965 = class98_sub31_sub2;
				if (i == 256) {
					break;
				}
				anInt3150 = 3;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("wj.A(" + i
						+ ',' + i_1_ + ','
						+ (class98_sub31_sub2 != null ? "{...}" : "null") + ','
						+ (class207 != null ? "{...}" : "null") + ',' + i_2_
						+ ',' + i_3_ + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	public Class372() {
		/* empty */
	}

	static {
		anInt3150 = 0;
	}
}
