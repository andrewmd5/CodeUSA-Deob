/* Class98_Sub10_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub31 extends Class98_Sub10 {
	private int anInt5714;
	private int anInt5715 = 4096;
	static Class350 aClass350_5716 = new Class350(0);
	static Class1[] aClass1Array5717;

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_0_) {
		do {
			try {
				final int i_1_ = i;
				do {
					if ((i_1_ ^ 0xffffffff) != -1) {
						if (i_1_ != 1) {
							break;
						}
					} else {
						anInt5714 = class98_sub22.readUnsignedShort((byte) 127);
						break;
					}
					anInt5715 = class98_sub22.readUnsignedShort((byte) 127);
				} while (false);
				if (i_0_ < -92) {
					break;
				}
				method990(-115, -128);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("rf.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final int[] method990(final int i, final int i_2_) {
		try {
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_2_);
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				final int[] is_3_ = method1000(i_2_, 0, 0);
				for (int i_4_ = 0; i_4_ < Class25.anInt268; i_4_++) {
					final int i_5_ = is_3_[i_4_];
					is[i_4_] = ((i_5_ ^ 0xffffffff) <= (anInt5714 ^ 0xffffffff) && i_5_ <= anInt5715) ? 4096
							: 0;
				}
			}
			if (i != 255) {
				aClass350_5716 = null;
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rf.G(" + i + ','
					+ i_2_ + ')');
		}
	}

	public static void method1095(final int i) {
		do {
			try {
				aClass1Array5717 = null;
				aClass350_5716 = null;
				if (i == 10640) {
					break;
				}
				aClass1Array5717 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "rf.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public Class98_Sub10_Sub31() {
		super(1, true);
		anInt5714 = 0;
	}
}
