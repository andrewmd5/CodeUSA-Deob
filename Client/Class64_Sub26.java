/* Class64_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub26 extends Class64 {
	static int anInt3712;
	static Class324 aClass324_3713;
	static int anInt3714;

	static final int method658(final int i, final int i_0_, final int i_1_) {
		try {
			final int i_2_ = i_0_ >>> 749908671;
			if (i != 749908671) {
				return -120;
			}
			return (i_2_ + i_0_) / i_1_ + -i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vd.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	@Override
	final int method552(final int i) {
		try {
			if (i != 0) {
				return 11;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vd.A(" + i + ')');
		}
	}

	Class64_Sub26(final int i, final Class98_Sub27 class98_sub27) {
		super(i, class98_sub27);
	}

	public static void method659(final int i) {
		try {
			if (i != 3) {
				method660(61, 91, -74, 72);
			}
			aClass324_3713 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vd.I(" + i + ')');
		}
	}

	Class64_Sub26(final Class98_Sub27 class98_sub27) {
		super(class98_sub27);
	}

	@Override
	final void method550(final int i, final int i_3_) {
		try {
			((Class64) this).anInt494 = i_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vd.B(" + i + ','
					+ i_3_ + ')');
		}
	}

	static final void method660(final int i, final int i_5_, final int i_6_,
			final int i_7_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i, -98, 9);
			class98_sub46_sub17.method1626((byte) -103);
			class98_sub46_sub17.anInt6054 = i_7_;
			class98_sub46_sub17.anInt6051 = i_5_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vd.H(" + i + ','
					+ i_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	final boolean method661(final int i) {
		try {
			if (i != -1) {
				aClass324_3713 = null;
			}
			if (((Class64) this).aClass98_Sub27_495.method1291((byte) 102)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vd.G(" + i + ')');
		}
	}

	@Override
	final int method556(final int i, final int i_9_) {
		try {
			if (i_9_ != 29053) {
				return -85;
			}
			if (((Class64) this).aClass98_Sub27_495.method1291((byte) 123)) {
				return 3;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vd.F(" + i + ','
					+ i_9_ + ')');
		}
	}

	final int method662(final byte i) {
		try {
			if (i <= 119) {
				return 24;
			}
			return ((Class64) this).anInt494;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vd.E(" + i + ')');
		}
	}

	@Override
	final void method551(final byte i) {
		do {
			try {
				if (i <= 118) {
					method661(114);
				}
				if (((Class64) this).aClass98_Sub27_495.method1291((byte) 124)) {
					((Class64) this).anInt494 = 0;
				}
				if (((Class64) this).anInt494 == 1
						|| (((Class64) this).anInt494 ^ 0xffffffff) == -1) {
					break;
				}
				((Class64) this).anInt494 = method552(0);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vd.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
