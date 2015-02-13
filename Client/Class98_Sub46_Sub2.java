/* Class98_Sub46_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class98_Sub46_Sub2 extends Class98_Sub46 {
	int anInt5950;
	static Class105 aClass105_5951 = new Class105("", 12);
	static int anInt5952;

	abstract Object method1533(boolean bool);

	static final void method1534(final int i, final boolean bool) {
		try {
			if (bool != false) {
				method1534(-73, true);
			}
			if (i != 37) {
				if (i != 50) {
					if (i == 75) {
						Class278.aFloat2068 = 6.0F;
					} else if (i != 100) {
						if ((i ^ 0xffffffff) == -201) {
							Class278.aFloat2068 = 16.0F;
						}
					} else {
						Class278.aFloat2068 = 8.0F;
					}
				} else {
					Class278.aFloat2068 = 4.0F;
				}
			} else {
				Class278.aFloat2068 = 3.0F;
			}
			Class169.anInt1307 = -1;
			Class169.anInt1307 = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bda.A(" + i + ','
					+ bool + ')');
		}
	}

	Class98_Sub46_Sub2(final int i) {
		try {
			anInt5950 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bda.<init>(" + i
					+ ')');
		}
	}

	public static void method1535(final int i) {
		try {
			if (i == 26767) {
				aClass105_5951 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bda.D(" + i + ')');
		}
	}

	abstract boolean method1536(int i);
}
