/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Frame;

final class Class54 implements Interface14 {
	static int anInt3391;
	private boolean aBoolean3392;
	static String[] aStringArray3393 = new String[100];
	static int anInt3394;
	static int anInt3395 = 0;
	private String aString3396;

	@Override
	public final int method51(final byte i) {
		try {
			final int i_0_ = SurfaceSkin.method337(-120, aString3396);
			if (i_0_ >= 0 && (i_0_ ^ 0xffffffff) >= -101) {
				return i_0_;
			}
			if (i < 126) {
				method504(true);
			}
			aBoolean3392 = true;
			return 100;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dm.E(" + i + ')');
		}
	}

	static final Frame method503(int i, final byte i_1_, final int i_2_,
			final int i_3_, final int i_4_, final Class88 class88) {
		try {
			if (i_1_ <= 93) {
				anInt3395 = 45;
			}
			if (!class88.method860((byte) 83)) {
				return null;
			}
			if ((i ^ 0xffffffff) == -1) {
				final Class259[] class259s = Class52.method490(class88,
						(byte) -94);
				if (class259s == null) {
					return null;
				}
				boolean bool = false;
				for (int i_5_ = 0; (class259s.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
					if (i_2_ == class259s[i_5_].anInt1953
							&& i_3_ == class259s[i_5_].anInt1956
							&& (i_4_ == 0 || i_4_ == class259s[i_5_].anInt1958)
							&& (!bool || (class259s[i_5_].anInt1955 ^ 0xffffffff) < (i ^ 0xffffffff))) {
						bool = true;
						i = class259s[i_5_].anInt1955;
					}
				}
				if (!bool) {
					return null;
				}
			}
			final Class143 class143 = class88.method869(-21605, i, i_2_, i_4_,
					i_3_);
			while ((class143.anInt1163 ^ 0xffffffff) == -1) {
				Class246_Sub7.method3131(0, 10L);
			}
			final Frame frame = (Frame) class143.anObject1162;
			if (frame == null) {
				return null;
			}
			if (class143.anInt1163 == 2) {
				Class281.method3331(false, frame, class88);
				return null;
			}
			return frame;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("dm.A(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ','
					+ (class88 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method504(final boolean bool) {
		try {
			if (bool != true) {
				method505((byte) 83);
			}
			return aBoolean3392;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dm.D(" + bool
					+ ')');
		}
	}

	@Override
	public final Class191 method50(final int i) {
		try {
			if (i != 15763) {
				return null;
			}
			return Class191.aClass191_1476;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dm.B(" + i + ')');
		}
	}

	public static void method505(final byte i) {
		try {
			aStringArray3393 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dm.C(" + i + ')');
		}
	}

	Class54(final String string) {
		try {
			aString3396 = string;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "dm.<init>("
					+ (string != null ? "{...}" : "null") + ')');
		}
	}

	static {
		anInt3394 = 0;
	}
}
