/* Class98_Sub10_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub10 extends Class98_Sub10 {
	private int anInt5588;
	static int[] anIntArray5589;
	static int[] anIntArray5590 = { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1,
			2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };
	private int anInt5591 = 1024;
	private int anInt5592;
	static String aString5593 = null;

	@Override
	final int[] method990(final int i, final int i_0_) {
		try {
			if (i != 255) {
				method1001((byte) -46);
			}
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_0_);
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				final int[] is_1_ = method1000(i_0_, 0, 0);
				for (int i_2_ = 0; i_2_ < Class25.anInt268; i_2_++) {
					is[i_2_] = anInt5591
							+ (is_1_[i_2_] * anInt5588 >> 806237676);
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ev.G(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final Class method1037(final int i, final String string)
			throws ClassNotFoundException {
		try {
			if (string.equals("B")) {
				return Byte.TYPE;
			}
			if (string.equals("I")) {
				return Integer.TYPE;
			}
			if (string.equals("S")) {
				return Short.TYPE;
			}
			if (string.equals("J")) {
				return Long.TYPE;
			}
			if (string.equals("Z")) {
				return Boolean.TYPE;
			}
			if (string.equals("F")) {
				return Float.TYPE;
			}
			if (string.equals("D")) {
				return Double.TYPE;
			}
			if (string.equals("C")) {
				return Character.TYPE;
			}
			return Class.forName(string);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ev.E(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1038(
			final Class246_Sub3_Sub4_Sub2 class246_sub3_sub4_sub2, final int i,
			final int i_4_) {
		try {
			int i_5_ = -1;
			int i_6_ = 0;
			if ((Class215.anInt1614 ^ 0xffffffff) <= ((class246_sub3_sub4_sub2.anInt6390) ^ 0xffffffff)) {
				if ((class246_sub3_sub4_sub2.anInt6424) >= Class215.anInt1614) {
					Class293.method3466((byte) 20, class246_sub3_sub4_sub2);
				} else {
					Class333.method3762((byte) 38, false,
							class246_sub3_sub4_sub2);
					i_6_ = Class366.anInt3121;
					i_5_ = Class64_Sub23.anInt3708;
				}
			} else {
				Class165.method2523(i_4_ + 24500, class246_sub3_sub4_sub2);
			}
			if (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 < 512
					|| ((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 < 512
					|| (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 >= -512
							+ 512 * Class165.anInt1276)
					|| ((((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 ^ 0xffffffff) <= (512 * Class98_Sub10_Sub7.anInt5572 - 512 ^ 0xffffffff))) {
				class246_sub3_sub4_sub2.anInt6379 = -1;
				class246_sub3_sub4_sub2.anIntArray6373 = null;
				class246_sub3_sub4_sub2.anInt6365 = -1;
				i_5_ = -1;
				i_6_ = 0;
				class246_sub3_sub4_sub2.anInt6424 = 0;
				class246_sub3_sub4_sub2.anInt6413 = -1;
				class246_sub3_sub4_sub2.anInt6390 = 0;
				((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 = ((class246_sub3_sub4_sub2.anIntArray6437[0]) * 512 - -(256 * class246_sub3_sub4_sub2
						.method3034(0)));
				((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 = ((class246_sub3_sub4_sub2.anIntArray6438[0]) * 512 + 256 * class246_sub3_sub4_sub2
						.method3034(0));
				class246_sub3_sub4_sub2.method3031(0);
			}
			if (i_4_ != -12212) {
				anIntArray5589 = null;
			}
			if ((class246_sub3_sub4_sub2 == Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660)
					&& ((((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 ^ 0xffffffff) > -6145
							|| (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 ^ 0xffffffff) > -6145
							|| (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 >= (-12 + Class165.anInt1276) * 512) || ((-12 + Class98_Sub10_Sub7.anInt5572) * 512 <= (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079)))) {
				class246_sub3_sub4_sub2.anIntArray6373 = null;
				class246_sub3_sub4_sub2.anInt6424 = 0;
				i_5_ = -1;
				class246_sub3_sub4_sub2.anInt6413 = -1;
				class246_sub3_sub4_sub2.anInt6379 = -1;
				class246_sub3_sub4_sub2.anInt6365 = -1;
				i_6_ = 0;
				class246_sub3_sub4_sub2.anInt6390 = 0;
				((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 = (512 * class246_sub3_sub4_sub2.anIntArray6437[0] + 256 * class246_sub3_sub4_sub2
						.method3034(i_4_ ^ ~0x2fb3));
				((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 = (512 * class246_sub3_sub4_sub2.anIntArray6438[0] + 256 * class246_sub3_sub4_sub2
						.method3034(0));
				class246_sub3_sub4_sub2.method3031(0);
			}
			final int i_7_ = Class98_Sub10_Sub13.method1041(
					class246_sub3_sub4_sub2, 0);
			Class108.method1729(i_4_ + 12114, class246_sub3_sub4_sub2);
			Class284_Sub1_Sub2.method3370(i_6_, i_4_ + 18356,
					class246_sub3_sub4_sub2, i_5_, i_7_);
			Class282.method3334((byte) 37, i_5_, class246_sub3_sub4_sub2);
			Class340.method3801(class246_sub3_sub4_sub2, -28111);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ev.D("
					+ (class246_sub3_sub4_sub2 != null ? "{...}" : "null")
					+ ',' + i + ',' + i_4_ + ')'));
		}
	}

	public Class98_Sub10_Sub10() {
		super(1, false);
		anInt5588 = 2048;
		anInt5592 = 3072;
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_8_) {
		while_79_: do {
			try {
				if (i_8_ > -92) {
					method997(64, -121);
				}
				final int i_9_ = i;
				do {
					if (i_9_ != 0) {
						if (i_9_ != 1) {
							if ((i_9_ ^ 0xffffffff) == -3) {
								break;
							}
							break while_79_;
						}
					} else {
						anInt5591 = class98_sub22.readUnsignedShort((byte) 127);
						break while_79_;
					}
					anInt5592 = class98_sub22.readUnsignedShort((byte) 127);
					break while_79_;
				} while (false);
				((Class98_Sub10) this).aBoolean3861 = class98_sub22
						.readUnsignedByte((byte) 40) == 1;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ev.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_8_ + ')'));
			}
		} while (false);
	}

	public static void method1039(final int i) {
		try {
			anIntArray5589 = null;
			aString5593 = null;
			anIntArray5590 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ev.B(" + i + ')');
		}
	}

	@Override
	final int[][] method997(final int i, final int i_11_) {
		try {
			final int[][] is = ((Class98_Sub10) this).aClass223_3859
					.method2828(i_11_, 0);
			if (((Class98_Sub10) this).aClass223_3859.aBoolean1683) {
				final int[][] is_12_ = method994(i_11_, 24431, 0);
				final int[] is_13_ = is_12_[0];
				final int[] is_14_ = is_12_[1];
				final int[] is_15_ = is_12_[2];
				final int[] is_16_ = is[0];
				final int[] is_17_ = is[1];
				final int[] is_18_ = is[2];
				for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff); i_19_++) {
					is_16_[i_19_] = anInt5591
							- -(is_13_[i_19_] * anInt5588 >> 1994769356);
					is_17_[i_19_] = ((anInt5588 * is_14_[i_19_] >> -1205225780) + anInt5591);
					is_18_[i_19_] = (is_15_[i_19_] * anInt5588 >> 859422188)
							+ anInt5591;
				}
			}
			if (i >= -76) {
				method1038(null, 10, -90);
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ev.C(" + i + ','
					+ i_11_ + ')');
		}
	}

	@Override
	final void method1001(final byte i) {
		do {
			try {
				anInt5588 = -anInt5591 + anInt5592;
				if (i == 66) {
					break;
				}
				method990(-42, 80);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ev.I(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
