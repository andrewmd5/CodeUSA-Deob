/* Class98_Sub10_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub30 extends Class98_Sub10 {
	static ha aHa5709;
	private int anInt5710 = 0;
	private int anInt5711;
	static boolean aBoolean5712 = false;
	private int anInt5713 = 1;

	@Override
	final void method1001(final byte i) {
		do {
			try {
				Class98_Sub31_Sub4.method1386(0);
				if (i == 66) {
					break;
				}
				method1094(51);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qo.I(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final int[] method990(final int i, final int i_0_) {
		try {
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_0_);
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				final int i_1_ = GameObjectDefinition.anIntArray3001[i_0_];
				final int i_2_ = i_1_ + -2048 >> -1261703615;
				for (int i_3_ = 0; Class25.anInt268 > i_3_; i_3_++) {
					final int i_4_ = Class64_Sub1.anIntArray3640[i_3_];
					final int i_5_ = i_4_ - 2048 >> -1945705119;
					int i_6_;
					if (anInt5711 != 0) {
						final int i_7_ = i_5_ * i_5_ + i_2_ * i_2_ >> 1054777292;
						i_6_ = (int) (Math.sqrt(i_7_ / 4096.0F) * 4096.0);
						i_6_ = (int) (3.141592653589793 * (anInt5713 * i_6_));
					} else {
						i_6_ = (-i_1_ + i_4_) * anInt5713;
					}
					i_6_ -= ~0xfff & i_6_;
					if (anInt5710 != 0) {
						if (anInt5710 == 2) {
							i_6_ -= 2048;
							if ((i_6_ ^ 0xffffffff) > -1) {
								i_6_ = -i_6_;
							}
							i_6_ = -i_6_ + 2048 << 1820888993;
						}
					} else {
						i_6_ = ((aa_Sub2.anIntArray3565[(0xff8 & i_6_) >> -627027964])
								- -4096 >> 2128106177);
					}
					is[i_3_] = i_6_;
				}
			}
			if (i != 255) {
				method1094(-79);
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qo.G(" + i + ','
					+ i_0_ + ')');
		}
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_8_) {
		do {
			try {
				final int i_9_ = i;
				while_162_: do {
					do {
						if (i_9_ != 0) {
							if (i_9_ != 1) {
								if (i_9_ == 3) {
									break;
								}
								break while_162_;
							}
						} else {
							anInt5711 = class98_sub22
									.readUnsignedByte((byte) -117);
							break while_162_;
						}
						anInt5710 = class98_sub22.readUnsignedByte((byte) -112);
						break while_162_;
					} while (false);
					anInt5713 = class98_sub22.readUnsignedByte((byte) 76);
				} while (false);
				if (i_8_ <= -92) {
					break;
				}
				anInt5711 = 61;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("qo.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1093(final int i, final int i_10_,
			final boolean bool, final int i_11_) {
		do {
			try {
				if (i != -29680) {
					aBoolean5712 = false;
				}
				if (Class156_Sub1.aClass377_3277.method3990(i_11_, -1) != null) {
					break;
				}
				if (!Class372.aBoolean3152) {
					Class291.method3414(-1, bool, i_11_);
				} else {
					final Class98_Sub36 class98_sub36 = new Class98_Sub36(
							i_11_, new Class237_Sub1(4096,
									(Class45.aClass207_385), i_11_), i_10_,
							bool);
					class98_sub36.aClass237_Sub1_4157.method2909(true,
							Class366.aStringArray3113[Class374.anInt3159]);
					Class156_Sub1.aClass377_3277.method3996(class98_sub36,
							i_11_, i + 29679);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("qo.B(" + i
						+ ',' + i_10_ + ',' + bool + ',' + i_11_ + ')'));
			}
			break;
		} while (false);
	}

	public Class98_Sub10_Sub30() {
		super(0, true);
		anInt5711 = 0;
	}

	public static void method1094(final int i) {
		do {
			try {
				aHa5709 = null;
				if (i == 615) {
					break;
				}
				method1094(96);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "qo.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
