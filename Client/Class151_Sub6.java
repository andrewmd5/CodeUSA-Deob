import jaggl.OpenGL;

/* Class151_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class151_Sub6 extends Class151 {
	private Class91 aClass91_4994;
	private Class42_Sub2[] aClass42_Sub2Array4995;
	private boolean aBoolean4996 = false;
	static IncomingOpcode aClass58_4997 = new IncomingOpcode(76, -1);
	static IncomingOpcode aClass58_4998 = new IncomingOpcode(12, 0);
	static IncomingOpcode aClass58_4999 = new IncomingOpcode(80, -2);
	private boolean aBoolean5000;

	Class151_Sub6(final ha_Sub1 var_ha_Sub1) {
		super(var_ha_Sub1);
		do {
			try {
				if (!var_ha_Sub1.aBoolean4391) {
					break;
				}
				aBoolean5000 = (var_ha_Sub1.anInt4410 ^ 0xffffffff) > -4;
				final int i = aBoolean5000 ? 48 : 127;
				final byte[][] is = new byte[6][4096];
				final byte[][] is_0_ = new byte[6][4096];
				final byte[][] is_1_ = new byte[6][4096];
				int i_2_ = 0;
				for (int i_3_ = 0; i_3_ < 64; i_3_++) {
					for (int i_4_ = 0; i_4_ < 64; i_4_++) {
						float f = -1.0F + 2.0F * i_4_ / 64.0F;
						float f_5_ = -1.0F + i_3_ * 2.0F / 64.0F;
						final float f_6_ = (float) (1.0 / Math.sqrt(f_5_ * f_5_
								+ (f * f + 1.0F)));
						f *= f_6_;
						f_5_ *= f_6_;
						for (int i_7_ = 0; i_7_ < 6; i_7_++) {
							float f_8_;
							if (i_7_ != 0) {
								if ((i_7_ ^ 0xffffffff) != -2) {
									if ((i_7_ ^ 0xffffffff) == -3) {
										f_8_ = f_5_;
									} else if ((i_7_ ^ 0xffffffff) != -4) {
										if (i_7_ == 4) {
											f_8_ = f_6_;
										} else {
											f_8_ = -f_6_;
										}
									} else {
										f_8_ = -f_5_;
									}
								} else {
									f_8_ = f;
								}
							} else {
								f_8_ = -f;
							}
							int i_9_;
							int i_10_;
							int i_11_;
							if (f_8_ > 0.0F) {
								i_9_ = (int) (Math.pow(f_8_, 96.0) * i);
								i_10_ = (int) (i * Math.pow(f_8_, 36.0));
								i_11_ = (int) (i * Math.pow(f_8_, 12.0));
							} else {
								i_9_ = i_10_ = i_11_ = 0;
							}
							is_0_[i_7_][i_2_] = (byte) i_9_;
							is_1_[i_7_][i_2_] = (byte) i_10_;
							is[i_7_][i_2_] = (byte) i_11_;
						}
						i_2_++;
					}
				}
				aClass42_Sub2Array4995 = new Class42_Sub2[3];
				aClass42_Sub2Array4995[0] = new Class42_Sub2(
						((Class151) this).aHa_Sub1_1215, 6406, 64, false,
						is_0_, 6406);
				aClass42_Sub2Array4995[1] = new Class42_Sub2(
						((Class151) this).aHa_Sub1_1215, 6406, 64, false,
						is_1_, 6406);
				aClass42_Sub2Array4995[2] = new Class42_Sub2(
						((Class151) this).aHa_Sub1_1215, 6406, 64, false, is,
						6406);
				method2464(0);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("nf.<init>("
						+ (var_ha_Sub1 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method2441(final int i, final int i_12_, final int i_13_) {
		do {
			try {
				if (aBoolean4996) {
					((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
					((Class151) this).aHa_Sub1_1215.method1863(1,
							aClass42_Sub2Array4995[i - 1]);
					((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
				}
				if (i_13_ < -2) {
					break;
				}
				aBoolean4996 = true;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("nf.G(" + i
						+ ',' + i_12_ + ',' + i_13_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method2440(final boolean bool, final boolean bool_14_) {
		do {
			try {
				if (bool != false) {
					break;
				}
				if (aClass91_4994 != null && bool_14_) {
					if (!aBoolean5000) {
						((Class151) this).aHa_Sub1_1215
								.method1845(2, 847872872);
						((Class151) this).aHa_Sub1_1215
								.method1863(
										1,
										(((Class151) this).aHa_Sub1_1215.aClass42_Sub1_4358));
						((Class151) this).aHa_Sub1_1215
								.method1845(0, 847872872);
					}
					aClass91_4994.method888('\0', false);
					aBoolean4996 = true;
					if (!client.aBoolean3553) {
						break;
					}
				}
				((Class151) this).aHa_Sub1_1215
						.method1886(770, 0, 34200, 34168);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("nf.D(" + bool
						+ ',' + bool_14_ + ')'));
			}
		} while (false);
	}

	@Override
	final void method2445(final byte i) {
		try {
			if (i <= 25) {
				aBoolean5000 = true;
			}
			do {
				if (aBoolean4996) {
					if (!aBoolean5000) {
						((Class151) this).aHa_Sub1_1215
								.method1845(2, 847872872);
						((Class151) this).aHa_Sub1_1215.method1863(1, null);
					}
					((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
					((Class151) this).aHa_Sub1_1215.method1863(1, null);
					((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
					aClass91_4994.method888('\001', false);
					aBoolean4996 = false;
					if (!client.aBoolean3553) {
						break;
					}
				}
				((Class151) this).aHa_Sub1_1215.method1886(770, 0, 34200, 5890);
			} while (false);
			((Class151) this).aHa_Sub1_1215.method1899(8448, 8960, 8448);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nf.E(" + i + ')');
		}
	}

	@Override
	final boolean method2439(final int i) {
		try {
			if (i != 31565) {
				aBoolean5000 = true;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nf.A(" + i + ')');
		}
	}

	@Override
	final void method2442(final Class42 class42, final boolean bool, final int i) {
		try {
			if (bool != false) {
				method2445((byte) -95);
			}
			((Class151) this).aHa_Sub1_1215.method1863(1, class42);
			((Class151) this).aHa_Sub1_1215.method1896(260, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nf.F("
					+ (class42 != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ')'));
		}
	}

	static final void method2463(final Class293 class293,
			final Class293 class293_15_, final int i) {
		try {
			final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4.method3023(
					260, Class213.aClass171_1604, Class331.aClass117_2811);
			class98_sub11.aClass98_Sub22_Sub1_3865.writeInt(1571862888,
					class293_15_.anInt2248);
			if (i >= 18) {
				class98_sub11.aClass98_Sub22_Sub1_3865.writeShortA(
						class293.anInt2302, (byte) 126);
				class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
						class293_15_.anInt2302, 1571862888);
				class98_sub11.aClass98_Sub22_Sub1_3865.writeLEInt(
						class293.anInt2248, 1046032984);
				class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShortA(
						class293_15_.anInt2300, 128);
				class98_sub11.aClass98_Sub22_Sub1_3865.writeLEShort(
						class293.anInt2300, 17624);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("nf.H(" + (class293 != null ? "{...}" : "null") + ','
							+ (class293_15_ != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	private final void method2464(final int i) {
		try {
			aClass91_4994 = new Class91(((Class151) this).aHa_Sub1_1215, 2);
			aClass91_4994.method887(0, -30389);
			((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
			OpenGL.glTexGeni(8192, 9472, 34065);
			OpenGL.glTexGeni(8193, 9472, 34065);
			OpenGL.glTexGeni(8194, 9472, 34065);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
			OpenGL.glMatrixMode(5888);
			if (aBoolean5000) {
				((Class151) this).aHa_Sub1_1215.method1899(7681, i ^ 0x2300,
						260);
				((Class151) this).aHa_Sub1_1215.method1840(0, 770, -121, 5890);
				((Class151) this).aHa_Sub1_1215
						.method1886(770, 0, 34200, 34167);
			} else {
				((Class151) this).aHa_Sub1_1215.method1899(8448, i ^ 0x2300,
						7681);
				((Class151) this).aHa_Sub1_1215.method1840(0, 768, i ^ 0x54,
						34168);
				((Class151) this).aHa_Sub1_1215.method1845(2, 847872872);
				((Class151) this).aHa_Sub1_1215.method1899(7681, i ^ 0x2300,
						260);
				((Class151) this).aHa_Sub1_1215.method1840(0, 768, 90, 34168);
				((Class151) this).aHa_Sub1_1215.method1840(1, 770, 80, 34168);
				((Class151) this).aHa_Sub1_1215
						.method1886(770, 0, 34200, 34167);
			}
			((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
			aClass91_4994.method886((byte) 58);
			aClass91_4994.method887(1, -30389);
			((Class151) this).aHa_Sub1_1215.method1845(1, i ^ 0x32898368);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			if (!aBoolean5000) {
				((Class151) this).aHa_Sub1_1215.method1899(8448, 8960, 8448);
				((Class151) this).aHa_Sub1_1215.method1840(0, 768, 81, 5890);
				((Class151) this).aHa_Sub1_1215.method1845(2, 847872872);
				((Class151) this).aHa_Sub1_1215.method1899(8448, 8960, 8448);
				((Class151) this).aHa_Sub1_1215.method1840(0, 768, 110, 5890);
				((Class151) this).aHa_Sub1_1215.method1840(1, 768, -124, 34168);
				((Class151) this).aHa_Sub1_1215.method1886(770, 0, 34200, 5890);
			} else {
				((Class151) this).aHa_Sub1_1215.method1899(8448, 8960, 8448);
				((Class151) this).aHa_Sub1_1215.method1840(0, 768, -82, 5890);
				((Class151) this).aHa_Sub1_1215.method1886(770, 0, 34200, 5890);
			}
			((Class151) this).aHa_Sub1_1215.method1845(i, 847872872);
			aClass91_4994.method886((byte) -95);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nf.B(" + i + ')');
		}
	}

	public static void method2465(final byte i) {
		try {
			aClass58_4997 = null;
			if (i < 81) {
				method2463(null, null, 55);
			}
			aClass58_4999 = null;
			aClass58_4998 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nf.I(" + i + ')');
		}
	}

	@Override
	final void method2443(final boolean bool, final int i) {
		try {
			if (i != 255) {
				method2443(false, 106);
			}
			((Class151) this).aHa_Sub1_1215.method1899(7681, 8960, 8448);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "nf.C(" + bool
					+ ',' + i + ')');
		}
	}
}
