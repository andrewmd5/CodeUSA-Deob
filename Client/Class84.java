/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class84 {
	Class218 aClass218_635 = new Class218();
	static String[] aStringArray636;
	boolean aBoolean637 = false;

	static final void method832(final String string, final byte i) {
		try {
			Class98_Sub45.method1521((byte) 52, 0, string, 0, "", "", "");
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fh.C("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method833(final int i) {
		do {
			try {
				for (;;) {
					final Class246_Sub1 class246_sub1 = (Class246_Sub1) aClass218_635
							.method2805((byte) -72);
					if (class246_sub1 == null) {
						break;
					}
					class246_sub1.method2965((byte) -96);
					SurfaceSkin.method333(class246_sub1, i ^ ~0x75);
				}
				if (i == 0) {
					break;
				}
				aClass218_635 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "fh.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method834(final Class207 class207, final int i) {
		try {
			Class244.anInt1860 = class207.getResourceByName((byte) -62, "p11_full");
			Class269.anInt2026 = class207.getResourceByName((byte) -122, "p12_full");
			Class123_Sub1.anInt4742 = class207.getResourceByName((byte) -91,
					"b12_full");
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fh.E("
					+ (class207 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method835(final int i) {
		do {
			try {
				aStringArray636 = null;
				if (i == 2169) {
					break;
				}
				aStringArray636 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "fh.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method836(final int i, final Class246_Sub1 class246_sub1) {
		try {
			final Class246_Sub3 class246_sub3 = class246_sub1.aClass246_Sub3_5069;
			boolean bool = true;
			final Class246_Sub6[] class246_sub6s = class246_sub1.aClass246_Sub6Array5067;
			for (int i_2_ = i; class246_sub6s.length > i_2_; i_2_++) {
				if (class246_sub6s[i_2_].aBoolean5114) {
					bool = false;
					break;
				}
			}
			if (!bool) {
				if (aBoolean637) {
					for (Class246_Sub1 class246_sub1_3_ = (Class246_Sub1) aClass218_635
							.method2803((byte) 15); class246_sub1_3_ != null; class246_sub1_3_ = (Class246_Sub1) aClass218_635
							.method2809(false)) {
						if (class246_sub3 == (class246_sub1_3_.aClass246_Sub3_5069)) {
							class246_sub1_3_.method2965((byte) 18);
							SurfaceSkin.method333(class246_sub1_3_, -120);
						}
					}
				}
				for (Class246_Sub1 class246_sub1_4_ = (Class246_Sub1) aClass218_635
						.method2803((byte) 15); class246_sub1_4_ != null; class246_sub1_4_ = (Class246_Sub1) aClass218_635
						.method2809(false)) {
					if ((class246_sub1_4_.aClass246_Sub3_5069).anInt5083 <= class246_sub3.anInt5083) {
						Class151_Sub3.method2458(class246_sub1,
								class246_sub1_4_, (byte) 27);
						return;
					}
				}
				aClass218_635.method2808(true, class246_sub1);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fh.A(" + i + ','
					+ (class246_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	Class84(final boolean bool) {
		try {
			aBoolean637 = bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fh.<init>(" + bool
					+ ')');
		}
	}
}
