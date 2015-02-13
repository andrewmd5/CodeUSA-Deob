import jaggl.OpenGL;

/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class91 {
	static Class28 aClass28_722;
	private int anInt723;
	static int anInt724 = -1;
	static boolean aBoolean725 = false;

	final void method886(final byte i) {
		try {
			OpenGL.glEndList();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fo.B(" + i + ')');
		}
	}

	final void method887(final int i, final int i_1_) {
		try {
			if (i_1_ == -30389) {
				OpenGL.glNewList(i + anInt723, 4864);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fo.C(" + i + ','
					+ i_1_ + ')');
		}
	}

	final void method888(final char c, final boolean bool) {
		do {
			try {
				OpenGL.glCallList(c + anInt723);
				if (bool == false) {
					break;
				}
				method889(true);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fo.A(" + c
						+ ',' + bool + ')');
			}
			break;
		} while (false);
	}

	public static void method889(final boolean bool) {
		try {
			if (bool != true) {
				method889(true);
			}
			aClass28_722 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fo.D(" + bool
					+ ')');
		}
	}

	static final void method890(final int i, int i_2_, int i_3_, int i_4_,
			final byte i_5_, int i_6_) {
		try {
			int i_7_ = -i_2_ + i_3_;
			int i_8_ = -i_6_ + i_4_;
			if (i_8_ == 0) {
				if ((i_7_ ^ 0xffffffff) != -1) {
					Class48_Sub2_Sub1.method471(i_6_, (byte) -123, i, i_2_,
							i_3_);
				}
			} else if ((i_7_ ^ 0xffffffff) == -1) {
				Class160.method2513((byte) -83, i, i_6_, i_4_, i_2_);
			} else {
				if (i_7_ < 0) {
					i_7_ = -i_7_;
				}
				if ((i_8_ ^ 0xffffffff) > -1) {
					i_8_ = -i_8_;
				}
				final boolean bool = (i_8_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff);
				if (bool) {
					final int i_9_ = i_6_;
					i_6_ = i_2_;
					final int i_10_ = i_4_;
					i_4_ = i_3_;
					i_2_ = i_9_;
					i_3_ = i_10_;
				}
				if ((i_4_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
					final int i_11_ = i_6_;
					final int i_12_ = i_2_;
					i_6_ = i_4_;
					i_4_ = i_11_;
					i_2_ = i_3_;
					i_3_ = i_12_;
				}
				if (i_5_ <= -21) {
					int i_13_ = i_2_;
					final int i_14_ = i_4_ + -i_6_;
					int i_15_ = i_3_ - i_2_;
					int i_16_ = -(i_14_ >> -1811836063);
					final int i_17_ = (i_2_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff) ? 1
							: -1;
					if (i_15_ < 0) {
						i_15_ = -i_15_;
					}
					if (!bool) {
						for (int i_18_ = i_6_; i_4_ >= i_18_; i_18_++) {
							i_16_ += i_15_;
							AnimationDefinition.anIntArrayArray814[i_13_][i_18_] = i;
							if ((i_16_ ^ 0xffffffff) < -1) {
								i_13_ += i_17_;
								i_16_ -= i_14_;
							}
						}
					} else {
						for (int i_19_ = i_6_; i_19_ <= i_4_; i_19_++) {
							i_16_ += i_15_;
							AnimationDefinition.anIntArrayArray814[i_19_][i_13_] = i;
							if (i_16_ > 0) {
								i_13_ += i_17_;
								i_16_ -= i_14_;
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("fo.E(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ','
							+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	Class91(final ha_Sub1 var_ha_Sub1, final int i) {
		try {
			anInt723 = OpenGL.glGenLists(i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("fo.<init>("
							+ (var_ha_Sub1 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}
}
