/* Class379 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class379 {
	static boolean aBoolean3192;
	int anInt3193 = 0;
	int anInt3194;
	int anInt3195;
	static int anInt3196 = 0;
	int anInt3197 = 2048;
	static Class246_Sub3[] aClass246_Sub3Array3198;

	public static void method4007(final boolean bool) {
		do {
			try {
				aClass246_Sub3Array3198 = null;
				if (bool == true) {
					break;
				}
				anInt3196 = -58;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ww.C(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final void method4008(final byte i, final ByteBuffer class98_sub22) {
		try {
			if (i <= 54) {
				method4008((byte) 108, null);
			}
			for (;;) {
				final int i_0_ = class98_sub22.readUnsignedByte((byte) -108);
				if (i_0_ == 0) {
					break;
				}
				method4009(i_0_, class98_sub22, 116);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ww.B(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method4009(final int i,
			final ByteBuffer class98_sub22, final int i_1_) {
		try {
			if (i_1_ <= 88) {
				method4009(-8, null, -88);
			}
			if ((i ^ 0xffffffff) == -2) {
				anInt3195 = class98_sub22.readUnsignedByte((byte) 21);
			} else if (i != 2) {
				if ((i ^ 0xffffffff) != -4) {
					if (i == 4) {
						anInt3193 = class98_sub22.readUShort(false);
					}
				} else {
					anInt3194 = class98_sub22.readUnsignedShort((byte) 127);
				}
			} else {
				anInt3197 = class98_sub22.readUnsignedShort((byte) 127);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("ww.A(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i_1_ + ')'));
		}
	}

	public Class379() {
		anInt3194 = 2048;
		anInt3195 = 0;
	}
}
