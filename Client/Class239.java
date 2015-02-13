/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239 {
	int anInt1838;
	static boolean aBoolean1839 = false;
	static boolean aBoolean1840 = false;
	static int anInt1841;
	private Class207 aClass207_1842;
	static int anInt1843 = 999999;
	static int anInt1844;

	static final void method2921(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_, final int i_5_) {
		try {
			if (i_5_ != 8) {
				method2921(-3, 122, -57, -125, 9, -70, 106);
			}
			if ((i_4_ ^ 0xffffffff) == -9 || i_4_ == 16) {
				if (i_4_ != 8) {
					final int i_6_ = r_Sub2.anInt6333
							+ (i << Class151_Sub8.anInt5015);
					final int i_7_ = -r_Sub2.anInt6333 + i_6_;
					final int i_8_ = i_1_ << Class151_Sub8.anInt5015;
					final int i_9_ = r_Sub2.anInt6333 + i_8_;
					final int i_10_ = Class98_Sub46_Sub2_Sub2.aSArray6298[i_0_]
							.method3420(i_1_, i_5_ ^ ~0x3156, 1 + i);
					final int i_11_ = Class98_Sub46_Sub2_Sub2.aSArray6298[i_0_]
							.method3420(1 + i_1_, -12639, i);
					Class98_Sub32_Sub1.aClass155Array5889[ha.anInt936++] = new Class155(
							i_4_, i_0_, i_6_, i_7_, i_7_, i_6_, i_10_, i_11_,
							-i_3_ + i_11_, i_10_ - i_3_, i_8_, i_9_, i_9_, i_8_);
				} else {
					final int i_12_ = i << Class151_Sub8.anInt5015;
					final int i_13_ = r_Sub2.anInt6333 + i_12_;
					final int i_14_ = i_1_ << Class151_Sub8.anInt5015;
					final int i_15_ = i_14_ - -r_Sub2.anInt6333;
					final int i_16_ = Class98_Sub46_Sub2_Sub2.aSArray6298[i_0_]
							.method3420(i_1_, -12639, i);
					final int i_17_ = Class98_Sub46_Sub2_Sub2.aSArray6298[i_0_]
							.method3420(i_1_ - -1, -12639, i - -1);
					Class98_Sub32_Sub1.aClass155Array5889[ha.anInt936++] = new Class155(
							i_4_, i_0_, i_12_, i_13_, i_13_, i_12_, i_16_,
							i_17_, i_17_ + -i_3_, i_16_ + -i_3_, i_14_, i_15_,
							i_15_, i_14_);
				}
			} else {
				Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i_0_][i][i_1_]);
				if (class172 == null) {
					class172 = new Class172(i_0_);
				}
				if ((i_4_ ^ 0xffffffff) == -2) {
					class172.aShort1335 = (short) i_3_;
					class172.aShort1329 = (short) i_2_;
				} else if (i_4_ == 2) {
					class172.aShort1328 = (short) i_3_;
					class172.aShort1323 = (short) i_2_;
				}
				if (OutputStream_Sub1.aBoolean35) {
					Class64_Sub22.method644(-44);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pc.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ')'));
		}
	}

	Class239(final Class279 class279, final int i, final Class207 class207) {
		new Class79(64);
		try {
			aClass207_1842 = class207;
			anInt1838 = aClass207_1842.method2761(0, 15);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pc.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt1841 = 1401;
		anInt1844 = 0;
	}
}
