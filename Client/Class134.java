/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class134 implements Interface18 {
	static boolean aBoolean3457 = true;
	static Class196 aClass196_3458 = new Class196("WTI", "office", "_wti", 5);
	Class332 aClass332_3459;
	Class337 aClass337_3460;
	static int anInt3461;
	private Class207 aClass207_3462;
	static float aFloat3463;
	static int anInt3464 = 0;
	static Class139 aClass139_3465;
	static OutgoingOpcode aClass171_3466 = new OutgoingOpcode(11, 15);

	public static void method2241(final int i) {
		do {
			try {
				aClass139_3465 = null;
				aClass171_3466 = null;
				aClass196_3458 = null;
				if (i <= -79) {
					break;
				}
				aFloat3463 = 0.14854974F;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jca.H(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	public void method60(final boolean bool, final byte i) {
		do {
			try {
				if (i < -81) {
					if (!bool) {
						break;
					}
					final int i_0_ = ((aClass337_3460.aClass63_3538.method545(
							Class98_Sub17_Sub1.anInt5782,
							aClass332_3459.method3737(), (byte) 83)) + (aClass337_3460.anInt3541));
					final int i_1_ = ((aClass337_3460.aClass110_3540
							.method2088(aClass332_3459.method3749(),
									Class246_Sub2.anInt5072, (byte) -56)) + (aClass337_3460.anInt3542));
					aClass332_3459.method3735(i_0_, i_1_);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "jca.B(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	@Override
	public final void method58(final byte i) {
		try {
			if (i != -43) {
				aClass207_3462 = null;
			}
			aClass332_3459 = Class237_Sub1.method2915(
					(aClass337_3460.anInt3535), aClass207_3462, (byte) -89);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jca.C(" + i + ')');
		}
	}

	@Override
	public final boolean method59(final int i) {
		try {
			if (i != 14017) {
				method58((byte) 85);
			}
			return aClass207_3462.method2742(i ^ ~0x36fd,
					((aClass337_3460).anInt3535));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jca.A(" + i + ')');
		}
	}

	static final boolean method2242(final int i, final int i_2_,
			final Class155 class155) {
		try {
			RuntimeException_Sub1.aClass111_3203.method2103(
					class155.anIntArray1240[i], class155.anIntArray1237[i],
					class155.anIntArray1241[i], Class114.anIntArray958);
			if (i_2_ != 5541) {
				aClass196_3458 = null;
			}
			final int i_3_ = Class114.anIntArray958[2];
			if (i_3_ < 50) {
				return false;
			}
			class155.aShortArray1244[i] = (short) (Class2.anInt69 + (Class38.anInt358
					* Class114.anIntArray958[0] / i_3_));
			class155.aShortArray1235[i] = (short) (Class98_Sub10_Sub23.anInt5659 + (Class114.anIntArray958[1]
					* Class331.anInt2800 / i_3_));
			class155.aShortArray1234[i] = (short) i_3_;
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(
							runtimeexception,
							("jca.I(" + i + ',' + i_2_ + ','
									+ (class155 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method2243(final boolean bool) {
		try {
			if (bool != true) {
				return -16;
			}
			return Class118.anInt979;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "jca.J(" + bool
					+ ')');
		}
	}

	Class134(final Class207 class207, final Class337 class337) {
		try {
			aClass337_3460 = class337;
			aClass207_3462 = class207;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("jca.<init>("
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class337 != null ? "{...}" : "null") + ')'));
		}
	}
}
