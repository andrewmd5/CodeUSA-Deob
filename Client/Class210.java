/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class210 implements Interface10 {
	private Class124 aClass124_3327;
	private ha aHa3328;
	static int[] anIntArray3329 = new int[3];
	private boolean aBoolean3330;
	private Interface18[] anInterface18Array3331;

	@Override
	public final int method25(final int i) {
		try {
			if (i != -24591) {
				return -30;
			}
			return aClass124_3327.anInt1014;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nk.D(" + i + ')');
		}
	}

	@Override
	public final void method27(final int i) {
		do {
			try {
				if (Class265.aHa1974 != aHa3328) {
					aBoolean3330 = true;
					aHa3328 = Class265.aHa1974;
				}
				aHa3328.GA(0);
				final Interface18[] interface18s = anInterface18Array3331;
				for (int i_0_ = 0; (interface18s.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
					final Interface18 interface18 = interface18s[i_0_];
					if (interface18 != null) {
						interface18.method58((byte) -43);
					}
				}
				if (i == -31295) {
					break;
				}
				method24(75);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "nk.H(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	public final void method23(final int i, boolean bool) {
		try {
			bool = true;
			final Interface18[] interface18s = anInterface18Array3331;
			int i_1_ = 0;
			if (i != 32210) {
				aHa3328 = null;
			}
			for (/**/; (i_1_ ^ 0xffffffff) > (interface18s.length ^ 0xffffffff); i_1_++) {
				final Interface18 interface18 = interface18s[i_1_];
				if (interface18 != null) {
					interface18.method60(bool || aBoolean3330, (byte) -124);
				}
			}
			aBoolean3330 = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nk.I(" + i + ','
					+ bool + ')');
		}
	}

	@Override
	public final boolean method28(final int i, final long l) {
		try {
			if ((Class343.method3819(-47) ^ 0xffffffffffffffffL) > (aClass124_3327.anInt1012
					+ l ^ 0xffffffffffffffffL)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nk.N(" + i + ','
					+ l + ')');
		}
	}

	@Override
	public final int method26(final int i) {
		try {
			int i_3_ = 0;
			final Interface18[] interface18s = anInterface18Array3331;
			for (int i_4_ = 0; i_4_ < interface18s.length; i_4_++) {
				final Interface18 interface18 = interface18s[i_4_];
				if (interface18 == null || interface18.method59(14017)) {
					i_3_++;
				}
			}
			if (i != -794) {
				anInterface18Array3331 = null;
			}
			return i_3_ * 100 / anInterface18Array3331.length;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nk.F(" + i + ')');
		}
	}

	@Override
	public final void method24(final int i) {
		try {
			if (i != -26363) {
				method23(-118, false);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nk.K(" + i + ')');
		}
	}

	Class210(final Class124 class124, final Class362 class362) {
		try {
			aClass124_3327 = class124;
			anInterface18Array3331 = new Interface18[(aClass124_3327.anInterface21Array1013).length];
			for (int i = 0; ((anInterface18Array3331.length ^ 0xffffffff) < (i ^ 0xffffffff)); i++) {
				anInterface18Array3331[i] = class362.method3927((byte) 62,
						(aClass124_3327.anInterface21Array1013[i]));
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nk.<init>("
					+ (class124 != null ? "{...}" : "null") + ','
					+ (class362 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2773(final int i) {
		do {
			try {
				anIntArray3329 = null;
				if (i == 3) {
					break;
				}
				method2773(-119);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "nk.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
