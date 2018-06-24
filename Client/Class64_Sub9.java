/* Class64_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub9 extends Class64 {
	static int anInt3662;
	static Class332 aClass332_3663;

	@Override
	final void method550(final int i, final int i_0_) {
		try {
			((Class64) this).anInt494 = i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "eu.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	Class64_Sub9(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	@Override
	final int method552(final int i) {
		try {
			if (!((Class64) this).aClass98_Sub27_495.method1291((byte) 111)) {
				return 0;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "eu.A(" + i + ')');
		}
	}

	final int method588(final byte i) {
		try {
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "eu.E(" + i + ')');
		}
	}

	public static void method589(final int i) {
		do {
			try {
				aClass332_3663 = null;
				if (i == 8) {
					break;
				}
				method589(15);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "eu.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method551(final byte i) {
		try {
			((Class64) this).anInt494 = method552(0);
			if (i < 118) {
				method551((byte) 28);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "eu.C(" + i + ')');
		}
	}

	static final void method590(final boolean bool, final ha_Sub1 var_ha_Sub1) {
		do {
			try {
				if (Class167.anObject1285 == null) {
					final Class284_Sub2_Sub1 class284_sub2_sub1 = new Class284_Sub2_Sub1();
					final byte[] is = class284_sub2_sub1.method3377(16, 20283,
							128, 128);
					Class167.anObject1285 = Class64_Sub25.method654(2, is,
							false);
				}
				if (Class130.anObject1030 == null) {
					final Class284_Sub1_Sub1 class284_sub1_sub1 = new Class284_Sub1_Sub1();
					final byte[] is = class284_sub1_sub1.method3366(true, 128,
							16, 128);
					Class130.anObject1030 = Class64_Sub25.method654(2, is,
							false);
				}
				final Class118 class118 = var_ha_Sub1.aClass118_4322;
				if (!class118.method2171(bool)
						|| Class98_Sub41.anObject4203 != null) {
					break;
				}
				final byte[] is = Class134_Sub1.method2244(-31633, 16.0F, 0.5F,
						0.6F, 16, 8, 128, new Class39_Sub1(419684), 4.0F, 4.0F,
						128);
				Class98_Sub41.anObject4203 = Class64_Sub25.method654(2, is,
						false);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27
						.printError(runtimeexception,
								("eu.G("
										+ bool
										+ ','
										+ (var_ha_Sub1 != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method591(final int i, final int i_2_, final int i_3_,
			final int i_4_, final int i_5_, final int i_6_, final int i_7_,
			final int i_8_) {
		try {
			Class98_Sub33 class98_sub33 = null;
			for (Class98_Sub33 class98_sub33_9_ = (Class98_Sub33) Class191.aClass148_1478
					.method2418(32); class98_sub33_9_ != null; class98_sub33_9_ = (Class98_Sub33) Class191.aClass148_1478
					.method2417(122)) {
				if (class98_sub33_9_.anInt4116 == i_8_
						&& class98_sub33_9_.anInt4112 == i_2_
						&& class98_sub33_9_.anInt4113 == i_4_
						&& (i_5_ == class98_sub33_9_.anInt4118)) {
					class98_sub33 = class98_sub33_9_;
					break;
				}
			}
			if (class98_sub33 == null) {
				class98_sub33 = new Class98_Sub33();
				class98_sub33.anInt4113 = i_4_;
				class98_sub33.anInt4118 = i_5_;
				class98_sub33.anInt4116 = i_8_;
				class98_sub33.anInt4112 = i_2_;
				if (i_2_ >= 0 && i_4_ >= 0 && i_2_ < Class165.anInt1276
						&& i_4_ < Class98_Sub10_Sub7.anInt5572) {
					Class98_Sub46_Sub9.method1558((byte) 109, class98_sub33);
				}
				Class191.aClass148_1478.method2419(class98_sub33, -20911);
			}
			class98_sub33.anInt4122 = i_3_;
			class98_sub33.aBoolean4124 = false;
			class98_sub33.anInt4114 = i_6_;
			class98_sub33.aBoolean4123 = true;
			class98_sub33.anInt4120 = i_7_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("eu.H(" + i + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_
					+ ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	@Override
	final int method556(final int i, final int i_11_) {
		try {
			return 3;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "eu.F(" + i + ','
					+ i_11_ + ')');
		}
	}

	Class64_Sub9(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}
}
