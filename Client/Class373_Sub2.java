/* Class373_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class373_Sub2 extends Class373 {
	static Class246_Sub5[] aClass246_Sub5Array5469;
	static Class59 aClass59_5470;
	static int anInt5471 = 1406;
	static float aFloat5472;
	static int anInt5473 = 0;

	@Override
	final void method3960(final int i, final int i_0_, final byte i_1_,
			final boolean bool) {
		try {
			Class265.aHa1974.method1779(-2 + i_0_, i,
					((Class373) this).aClass93_3478.anInt3514 - -4,
					((Class373) this).aClass93_3478.anInt3504 - -2,
					((Class93_Sub3) ((Class373) this).aClass93_3478).anInt5495,
					0);
			if (i_1_ != -36) {
				method3974(-49, -39, 108);
			}
			Class265.aHa1974.method1779(i_0_ + -1, 1 + i,
					2 + ((Class373) this).aClass93_3478.anInt3514,
					((Class373) this).aClass93_3478.anInt3504, 0, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ct.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + bool + ')'));
		}
	}

	static final boolean method3974(final int i, final int i_2_, final int i_3_) {
		try {
			if ((0x21 & i_2_ ^ 0xffffffff) == -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ct.E(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	public static void method3975(final byte i) {
		try {
			aClass59_5470 = null;
			aClass246_Sub5Array5469 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ct.G(" + i + ')');
		}
	}

	@Override
	final void method3965(final int i, final int i_6_, final int i_7_,
			final boolean bool) {
		try {
			final int i_8_ = (method3963(100)
					* ((Class373) this).aClass93_3478.anInt3514 / 10000);
			Class265.aHa1974.aa(i_7_, 2 + i_6_, i_8_, -2
					+ (((Class373) this).aClass93_3478).anInt3504,
					((Class93_Sub3) ((Class373) this).aClass93_3478).anInt5496,
					0);
			Class265.aHa1974.aa(i_8_ + i_7_, i_6_ + i, -i_8_
					+ ((Class373) this).aClass93_3478.anInt3514,
					((Class373) this).aClass93_3478.anInt3504 - 2, 0, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ct.F(" + i + ','
					+ i_6_ + ',' + i_7_ + ',' + bool + ')'));
		}
	}

	Class373_Sub2(final Class207 class207, final Class207 class207_9_,
			final Class93_Sub3 class93_sub3) {
		super(class207, class207_9_, class93_sub3);
	}
}
