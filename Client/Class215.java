/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class215 {
	static int anInt1612 = 0;
	static float aFloat1613;
	public static int anInt1614 = 0;
	Class98_Sub46 aClass98_Sub46_1615 = new Class98_Sub46();
	private Class98_Sub46 aClass98_Sub46_1616;

	final void method2785(final Class98_Sub46 class98_sub46, final int i) {
		do {
			try {
				if (class98_sub46.aClass98_Sub46_4265 != null) {
					class98_sub46.method1524((byte) -90);
				}
				class98_sub46.aClass98_Sub46_4262 = aClass98_Sub46_1615;
				class98_sub46.aClass98_Sub46_4265 = (aClass98_Sub46_1615.aClass98_Sub46_4265);
				(class98_sub46.aClass98_Sub46_4265).aClass98_Sub46_4262 = class98_sub46;
				(class98_sub46.aClass98_Sub46_4262).aClass98_Sub46_4265 = class98_sub46;
				if (i < -25) {
					break;
				}
				method2789(-121);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("ns.A(" + (class98_sub46 != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method2786(final int i) {
		try {
			if (i != 16711680) {
				aClass98_Sub46_1616 = null;
			}
			for (;;) {
				final Class98_Sub46 class98_sub46 = (aClass98_Sub46_1615.aClass98_Sub46_4262);
				if (aClass98_Sub46_1615 == class98_sub46) {
					break;
				}
				class98_sub46.method1524((byte) -90);
			}
			aClass98_Sub46_1616 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ns.D(" + i + ')');
		}
	}

	final Class98_Sub46 method2787(final int i) {
		try {
			if (i != 0) {
				return null;
			}
			final Class98_Sub46 class98_sub46 = aClass98_Sub46_1616;
			if (aClass98_Sub46_1615 == class98_sub46) {
				aClass98_Sub46_1616 = null;
				return null;
			}
			aClass98_Sub46_1616 = class98_sub46.aClass98_Sub46_4262;
			return class98_sub46;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ns.F(" + i + ')');
		}
	}

	final int method2788(final int i) {
		try {
			int i_0_ = 0;
			if (i > -108) {
				return 8;
			}
			for (Class98_Sub46 class98_sub46 = (aClass98_Sub46_1615.aClass98_Sub46_4262); aClass98_Sub46_1615 != class98_sub46; class98_sub46 = class98_sub46.aClass98_Sub46_4262) {
				i_0_++;
			}
			return i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ns.H(" + i + ')');
		}
	}

	final Class98_Sub46 method2789(final int i) {
		try {
			if (i != -16711936) {
				return null;
			}
			final Class98_Sub46 class98_sub46 = (aClass98_Sub46_1615.aClass98_Sub46_4262);
			if (aClass98_Sub46_1615 == class98_sub46) {
				return null;
			}
			class98_sub46.method1524((byte) -90);
			return class98_sub46;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ns.E(" + i + ')');
		}
	}

	static final int method2790(final int i, final int i_1_, final int i_2_,
			int i_3_) {
		try {
			if (i < 124) {
				return 75;
			}
			i_3_ = (i_1_ * (0xff00ff & i_3_) & ~0xff00ff | i_1_
					* (i_3_ & 0xff00) & 0xff0000) >>> 238779912;
			final int i_4_ = -i_1_ + 255;
			return (((0xff0000 & i_4_ * (i_2_ & 0xff00) | i_4_
					* (0xff00ff & i_2_) & ~0xff00ff) >>> -896446872) - -i_3_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ns.B(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method2791(final byte i) {
		do {
			try {
				Class65.aClass293Array500 = null;
				if (za_Sub2.aBoolean6079
						&& ((Class146_Sub2.method2391((byte) 106) ^ 0xffffffff) != -2)) {
					Class92.method892(
							21337,
							0,
							0,
							Class98_Sub21.method1176(false),
							(Class177.anInt1376 == 3 || ((Class177.anInt1376 ^ 0xffffffff) == -8)),
							Class98_Sub10_Sub36.method1110((byte) 60));
				}
				int i_5_ = 0;
				int i_7_ = 0;
				if (za_Sub2.aBoolean6079) {
					i_5_ = Class189.method2642((byte) 42);
					i_7_ = Class335.method3765(false);
				}
				Class246_Sub3_Sub5_Sub2.method3093(i_7_
						+ Class98_Sub25.anInt4024, -1, i_7_, Class15.anInt185,
						i_7_, i_5_, Class39_Sub1.anInt3593 + i_5_, (byte) 88,
						i_5_);
				if (Class65.aClass293Array500 == null) {
					break;
				}
				Class98_Sub10_Sub24.method1077(-1412584499, true,
						IncomingOpcode.anInt463, i_5_, i_7_,
						Class189.aClass293_1457.anInt2238,
						Class65.aClass293Array500, Class39_Sub1.anInt3593
								+ i_5_, i_7_ + Class98_Sub25.anInt4024, true,
						Class64_Sub5.anInt3654);
				Class65.aClass293Array500 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ns.G(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final Class98_Sub46 method2792(final int i) {
		try {
			final Class98_Sub46 class98_sub46 = (aClass98_Sub46_1615.aClass98_Sub46_4262);
			if (class98_sub46 == aClass98_Sub46_1615) {
				aClass98_Sub46_1616 = null;
				return null;
			}
			if (i != -1) {
				anInt1612 = -120;
			}
			aClass98_Sub46_1616 = class98_sub46.aClass98_Sub46_4262;
			return class98_sub46;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ns.C(" + i + ')');
		}
	}

	public Class215() {
		try {
			aClass98_Sub46_1615.aClass98_Sub46_4265 = aClass98_Sub46_1615;
			aClass98_Sub46_1615.aClass98_Sub46_4262 = aClass98_Sub46_1615;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ns.<init>(" + ')');
		}
	}
}
