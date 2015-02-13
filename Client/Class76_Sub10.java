/* Class76_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class76_Sub10 extends Class76 {
	static int anInt3793;
	static int anInt3794;

	@Override
	final void method746(final int i, final int i_0_, final int i_1_) {
		try {
			if (i_1_ >= -75) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vga.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	@Override
	final void method739(final int i) {
		try {
			if (i != -2) {
				method770(13);
			}
			((Class76) this).aHa_Sub3_585.method2029((byte) -62, false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vga.C(" + i + ')');
		}
	}

	@Override
	final void method742(final int i, final int i_2_,
			final Interface4 interface4) {
		do {
			try {
				((Class76) this).aHa_Sub3_585.method2005(interface4, 63);
				((Class76) this).aHa_Sub3_585.method2015(i_2_, (byte) -118);
				if (i == 6) {
					break;
				}
				method742(-90, 37, null);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vga.I(" + i
						+ ',' + i_2_ + ','
						+ (interface4 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final char method769(final char c, final int i, final byte i_3_) {
		try {
			if (i_3_ > -66) {
				return '|';
			}
			if (c >= 192 && (c ^ 0xffffffff) >= -256) {
				if ((c ^ 0xffffffff) <= -193 && (c ^ 0xffffffff) >= -199) {
					return 'A';
				}
				if (c == 199) {
					return 'C';
				}
				if (c >= 200 && c <= 203) {
					return 'E';
				}
				if ((c ^ 0xffffffff) <= -205 && c <= 207) {
					return 'I';
				}
				if ((c ^ 0xffffffff) <= -211 && (c ^ 0xffffffff) >= -215) {
					return 'O';
				}
				if (c >= 217 && (c ^ 0xffffffff) >= -221) {
					return 'U';
				}
				if ((c ^ 0xffffffff) == -222) {
					return 'Y';
				}
				if ((c ^ 0xffffffff) == -224) {
					return 's';
				}
				if (c >= 224 && c <= 230) {
					return 'a';
				}
				if (c == 231) {
					return 'c';
				}
				if ((c ^ 0xffffffff) <= -233 && c <= 235) {
					return 'e';
				}
				if (c >= 236 && c <= 239) {
					return 'i';
				}
				if ((c ^ 0xffffffff) <= -243 && c <= 246) {
					return 'o';
				}
				if ((c ^ 0xffffffff) <= -250 && (c ^ 0xffffffff) >= -253) {
					return 'u';
				}
				if (c == 253 || (c ^ 0xffffffff) == -256) {
					return 'y';
				}
			}
			if ((c ^ 0xffffffff) == -339) {
				return 'O';
			}
			if ((c ^ 0xffffffff) == -340) {
				return 'o';
			}
			if ((c ^ 0xffffffff) == -377) {
				return 'Y';
			}
			return c;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vga.A(" + c + ','
					+ i + ',' + i_3_ + ')'));
		}
	}

	static final void method770(final int i) {
		do {
			try {
				final int i_4_ = Class2.anInt71;
				final int[] is = Class319.anIntArray2705;
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[is[i_5_]]);
					if (class246_sub3_sub4_sub2_sub2 != null
							&& (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6384 ^ 0xffffffff) < -1) {
						((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6384--;
						if ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).anInt6384 ^ 0xffffffff) == -1) {
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub2).aString6374 = null;
						}
					}
				}
				for (int i_6_ = 0; Class150.anInt1211 > i_6_; i_6_++) {
					final long l = Class325.anIntArray2726[i_6_];
					final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
							.method3990(l, -1));
					if (class98_sub39 != null) {
						final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
						if (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6384 > 0) {
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6384--;
							if ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6384 ^ 0xffffffff) == -1) {
								((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).aString6374 = null;
							}
						}
					}
				}
				if (i == -256) {
					break;
				}
				method770(98);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vga.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method743(final int i, final boolean bool) {
		do {
			try {
				if (i >= 93) {
					break;
				}
				anInt3794 = 111;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vga.D(" + i
						+ ',' + bool + ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method748(final int i, final boolean bool) {
		try {
			if (i != 69) {
				method739(77);
			}
			((Class76) this).aHa_Sub3_585.method2029((byte) -93, true);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vga.B(" + i + ','
					+ bool + ')');
		}
	}

	@Override
	final boolean method745(final byte i) {
		try {
			if (i != 27) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vga.H(" + i + ')');
		}
	}

	Class76_Sub10(final ha_Sub3 var_ha_Sub3) {
		super(var_ha_Sub3);
	}
}
