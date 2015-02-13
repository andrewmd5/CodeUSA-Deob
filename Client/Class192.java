/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class192 {
	private static int anInt1481 = 0;
	private static boolean aBoolean1482 = false;
	private static Class148 aClass148_1483 = new Class148();

	static final synchronized void method2652(final int i, final boolean bool) {
		try {
			if (i >= -41) {
				method2652(-3, false);
			}
			aBoolean1482 = bool;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final synchronized void method2653(final int i) {
		do {
			try {
				if (i <= -24) {
					anInt1481--;
					if (anInt1481 != 0) {
						break;
					}
					method2656(0);
				}
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	static final synchronized void method2654(final boolean bool,
			final Interface9 interface9) {
		do {
			try {
				if (!aBoolean1482) {
					if (anInt1481 <= 0) {
						interface9.w(false);
					} else {
						final Class98_Sub51 class98_sub51 = new Class98_Sub51();
						class98_sub51.anInterface9_4295 = interface9;
						aClass148_1483.method2419(class98_sub51, -20911);
					}
					if (bool == false) {
						break;
					}
					aClass148_1483 = null;
				}
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	static final synchronized void method2655(final int i) {
		do {
			try {
				anInt1481++;
				if (i == -374) {
					break;
				}
				method2656(-76);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	static final synchronized void method2656(final int i) {
		do {
			try {
				for (;;) {
					final Class98_Sub51 class98_sub51 = (Class98_Sub51) aClass148_1483
							.method2421(6494);
					if (class98_sub51 == null) {
						break;
					}
					class98_sub51.anInterface9_4295.w(true);
					class98_sub51.method942(94);
				}
				if (i == 0) {
					break;
				}
				method2653(11);
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}
}
