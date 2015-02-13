/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59 {
	static int anInt464 = 0;
	private Class207 aClass207_465;
	static int anInt466;
	private final Class79 aClass79_467 = new Class79(16);
	static OutgoingOpcode aClass171_468 = new OutgoingOpcode(36, -1);
	static IncomingOpcode aClass58_469 = new IncomingOpcode(113, -2);

	static final boolean method524(final int i, final int i_0_, final int i_1_) {
		try {
			if (i_1_ < 34) {
				method526((byte) 105, 80, null);
			}
			if (!((i & 0x800) != 0 | Class360.method3905(-12, i, i_0_))
					&& !Class228.method2864(55, i, i_0_)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eaa.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method525(final int i) {
		try {
			synchronized (aClass79_467) {
				aClass79_467.method806((byte) 117);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eaa.E(" + i + ')');
		}
	}

	static final float[] method526(final byte i, final int i_3_,
			final float[] fs) {
		try {
			if (i != -64) {
				anInt466 = -4;
			}
			final float[] fs_4_ = new float[i_3_];
			Class236.method2897(fs, 0, fs_4_, 0, i_3_);
			return fs_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eaa.C(" + i + ','
					+ i_3_ + ',' + (fs != null ? "{...}" : "null") + ')'));
		}
	}

	private final Class60 method527(final int i, final byte i_5_) {
		try {
			Class60 class60;
			synchronized (aClass79_467) {
				class60 = (Class60) aClass79_467.method802(-125, i);
			}
			if (class60 != null) {
				return class60;
			}
			if (i_5_ >= -87) {
				aClass171_468 = null;
			}
			byte[] is;
			synchronized (aClass207_465) {
				is = aClass207_465.method2745(i, 29, false);
			}
			class60 = new Class60();
			if (is != null) {
				class60.method533(new ByteBuffer(is), 0);
			}
			synchronized (aClass79_467) {
				aClass79_467.method805(i, class60, (byte) -80);
			}
			return class60;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eaa.H(" + i + ','
					+ i_5_ + ')');
		}
	}

	final Class346 method528(final int i, final int i_6_, final int i_7_,
			final int i_8_, final Class115 class115, final int i_9_) {
		try {
			if (i != 0) {
				anInt466 = 103;
			}
			Class175[] class175s = null;
			final Class60 class60 = method527(i_6_, (byte) -120);
			if (class60.anIntArray473 != null) {
				class175s = new Class175[class60.anIntArray473.length];
				for (int i_10_ = 0; i_10_ < class175s.length; i_10_++) {
					final Class266 class266 = class115.method2157(
							(class60.anIntArray473[i_10_]), (byte) -87);
					class175s[i_10_] = new Class175(class266.anInt1993,
							class266.anInt1995, class266.anInt1990,
							class266.anInt1989, class266.anInt1987,
							class266.anInt1984, class266.anInt1991,
							class266.aBoolean1985);
				}
			}
			return new Class346(class60.anInt470, class175s, class60.anInt472,
					i_8_, i_7_, i_9_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("eaa.G(" + i + ',' + i_6_
							+ ',' + i_7_ + ',' + i_8_ + ','
							+ (class115 != null ? "{...}" : "null") + ','
							+ i_9_ + ')'));
		}
	}

	final void method529(final byte i) {
		try {
			synchronized (aClass79_467) {
				aClass79_467.method794(37);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eaa.B(" + i + ')');
		}
	}

	final void method530(final byte i, final int i_12_) {
		try {
			if (i != -32) {
				method528(33, -37, -43, -90, null, 116);
			}
			synchronized (aClass79_467) {
				aClass79_467.method800((byte) 62, i_12_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eaa.D(" + i + ','
					+ i_12_ + ')');
		}
	}

	Class59(final Class279 class279, final int i, final Class207 class207) {
		try {
			aClass207_465 = class207;
			aClass207_465.method2761(0, 29);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eaa.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method531(final byte i) {
		do {
			try {
				aClass171_468 = null;
				aClass58_469 = null;
				if (i < -114) {
					break;
				}
				method526((byte) -56, -98, null);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "eaa.F(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
