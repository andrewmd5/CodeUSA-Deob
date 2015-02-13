import jaggl.OpenGL;

/* Class76_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class76_Sub2 extends Class76 {
	static int anInt3728;
	private Class273 aClass273_3729;
	private ha_Sub3_Sub2 aHa_Sub3_Sub2_3730;
	static IncomingOpcode aClass58_3731 = new IncomingOpcode(104, -2);
	private Class195 aClass195_3732;
	static Class207 aClass207_3733;

	@Override
	final void method743(final int i, final boolean bool) {
		try {
			if (i < 93) {
				method745((byte) -62);
			}
			((Class76) this).aHa_Sub3_585.method2019(Class1.aClass128_64,
					Class288.aClass128_3381, 22831);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fs.D(" + i + ','
					+ bool + ')');
		}
	}

	@Override
	final void method746(final int i, final int i_0_, final int i_1_) {
		try {
			do {
				if (aClass195_3732.aBoolean1501) {
					final float f = ((((Class76) this).aHa_Sub3_585.anInt4556) % 4000 / 4000.0F);
					((Class76) this).aHa_Sub3_585.method2005(
							aClass195_3732.anInterface4_Impl1_1498, 36);
					OpenGL.glProgramLocalParameter4fARB(34336, 0, f, 0.0F,
							0.0F, 1.0F);
					if (!client.aBoolean3553) {
						break;
					}
				}
				final int i_2_ = 16 * (((Class76) this).aHa_Sub3_585.anInt4556 % 4000) / 4000;
				((Class76) this).aHa_Sub3_585.method2005(
						(aClass195_3732.anInterface4_Impl2Array1503[i_2_]),
						-117);
				OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F,
						1.0F);
			} while (false);
			if (i_1_ > -75) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fs.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	@Override
	final void method742(final int i, final int i_3_,
			final Interface4 interface4) {
		do {
			try {
				if (i == 6) {
					break;
				}
				method748(52, false);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("fs.I(" + i
						+ ',' + i_3_ + ','
						+ (interface4 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method750(final int i) {
		do {
			try {
				aClass58_3731 = null;
				aClass207_3733 = null;
				if (i == 0) {
					break;
				}
				method751(-105, null, 58, null, -58, 58, 30, -85, -104);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fs.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method751(final int i, final byte[] is, final int i_4_,
			final byte[] is_5_, int i_6_, final int i_7_, int i_8_, int i_9_,
			final int i_10_) {
		try {
			final int i_11_ = -(i_9_ >> -1972136990);
			if (i_10_ == 0) {
				i_9_ = -(i_9_ & 0x3);
				for (int i_12_ = -i_4_; (i_12_ ^ 0xffffffff) > -1; i_12_++) {
					for (int i_13_ = i_11_; i_13_ < 0; i_13_++) {
						is[i_8_++] += is_5_[i_6_++];
						is[i_8_++] += is_5_[i_6_++];
						is[i_8_++] += is_5_[i_6_++];
						is[i_8_++] += is_5_[i_6_++];
					}
					for (int i_14_ = i_9_; (i_14_ ^ 0xffffffff) > -1; i_14_++) {
						is[i_8_++] += is_5_[i_6_++];
					}
					i_8_ += i_7_;
					i_6_ += i;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fs.G(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_4_ + ','
					+ (is_5_ != null ? "{...}" : "null") + ',' + i_6_ + ','
					+ i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	@Override
	final void method748(final int i, final boolean bool) {
		try {
			OpenGL.glBindProgramARB(34336, aClass273_3729.anInt2040);
			OpenGL.glEnable(34336);
			if (i != 69) {
				aClass207_3733 = null;
			}
			((Class76) this).aHa_Sub3_585.method2051(0, -128,
					IncomingOpcode.aClass65_459);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fs.B(" + i + ','
					+ bool + ')');
		}
	}

	@Override
	final void method739(final int i) {
		try {
			((Class76) this).aHa_Sub3_585.method2051(0, -114,
					Class300.aClass65_2499);
			OpenGL.glBindProgramARB(34336, 0);
			if (i != -2) {
				method739(102);
			}
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fs.C(" + i + ')');
		}
	}

	static final boolean requestFlag(final int i, final int i_15_,
			final int i_16_, final int i_17_, final int i_18_, final int i_19_,
			final int i_20_, final boolean bool, final int i_21_) {
		try {
			final int i_22_ = (((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6437[0]);
			final int i_23_ = (((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anIntArray6438[0]);
			if (i_22_ < 0 || Class165.anInt1276 <= i_22_ || i_23_ < 0
					|| i_23_ >= Class98_Sub10_Sub7.anInt5572) {
				return false;
			}
			if (i_18_ > i_20_
					|| i_20_ >= Class165.anInt1276
					|| i_19_ < 0
					|| (i_19_ ^ 0xffffffff) <= (Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff)) {
				return false;
			}
			final int i_24_ = (Applet_Sub1
					.method96(
							(Class167.aClass243Array1281[((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aByte5088]),
							Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660
									.method3034(0),
							Class76_Sub5.anIntArray3743, i_15_, i, i_19_,
							i_16_, i_23_, Class117.anIntArray974, bool, i_20_,
							i_17_, 48, i_22_, i_21_));
			if ((i_24_ ^ 0xffffffff) > -2) {
				return false;
			}

			Class269.anInt2024 = Class76_Sub5.anIntArray3743[-1 + i_24_];
			Class246_Sub3_Sub1_Sub2.anInt6251 = Class117.anIntArray974[-1
					+ i_24_];
			Class365.aBoolean3110 = false;
			ByteBuffer.method1216(-17470);
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fs.A(" + i + ','
					+ i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ','
					+ i_19_ + ',' + i_20_ + ',' + bool + ',' + i_21_ + ')'));
		}
	}

	Class76_Sub2(final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final Class207 class207,
			final Class195 class195) {
		super(var_ha_Sub3_Sub2);
		try {
			aClass195_3732 = class195;
			aHa_Sub3_Sub2_3730 = var_ha_Sub3_Sub2;
			if (class207 == null || !aClass195_3732.method2659(-22382)
					|| !aHa_Sub3_Sub2_3730.aBoolean6134) {
				aClass273_3729 = null;
			} else {
				aClass273_3729 = (Class240.method2927(
						class207.method2739("gl", "transparent_water", -32734),
						aHa_Sub3_Sub2_3730, 34336, 25246));
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fs.<init>("
					+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null") + ','
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class195 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final boolean method745(final byte i) {
		try {
			if (i != 27) {
				method751(-3, null, 8, null, 91, 11, -110, 7, 116);
			}
			if (aClass273_3729 == null) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fs.H(" + i + ')');
		}
	}
}
