/* Class98_Sub10_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub27 extends Class98_Sub10 {
	static Class84 aClass84_5692;
	static Class84 aClass84_5693;

	@Override
	final int[][] method997(final int i, final int i_0_) {
		try {
			if (i > -76) {
				return null;
			}
			final int[][] is = ((Class98_Sub10) this).aClass223_3859
					.method2828(i_0_, 0);
			if (((Class98_Sub10) this).aClass223_3859.aBoolean1683) {
				final int[] is_1_ = is[0];
				final int[] is_2_ = is[1];
				final int[] is_3_ = is[2];
				for (int i_4_ = 0; i_4_ < Class25.anInt268; i_4_++) {
					method1087(-2048, i_0_, i_4_);
					final int[][] is_5_ = method994(Class134.anInt3464, 24431,
							0);
					is_1_[i_4_] = is_5_[0][Class98_Sub10_Sub23.anInt5661];
					is_2_[i_4_] = is_5_[1][Class98_Sub10_Sub23.anInt5661];
					is_3_[i_4_] = is_5_[2][Class98_Sub10_Sub23.anInt5661];
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ow.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	@Override
	final int[] method990(final int i, final int i_6_) {
		try {
			if (i != 255) {
				return null;
			}
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_6_);
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff); i_7_++) {
					method1087(-2048, i_6_, i_7_);
					final int[] is_8_ = method1000(Class134.anInt3464, 0,
							i ^ 0xff);
					is[i_7_] = is_8_[Class98_Sub10_Sub23.anInt5661];
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ow.G(" + i + ','
					+ i_6_ + ')');
		}
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_9_) {
		do {
			try {
				if (i_9_ > -92) {
					method990(-69, 63);
				}
				if ((i ^ 0xffffffff) != -1) {
					break;
				}
				((Class98_Sub10) this).aBoolean3861 = (class98_sub22
						.readUnsignedByte((byte) 14) ^ 0xffffffff) == -2;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ow.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_9_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1085(final int i) {
		try {
			aClass84_5693 = null;
			if (i < 40) {
				method1085(-125);
			}
			aClass84_5692 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ow.B(" + i + ')');
		}
	}

	static final int method1086(final byte i) {
		try {
			if (i != -4) {
				return 72;
			}
			return Class133.anInt3452;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ow.E(" + i + ')');
		}
	}

	private final void method1087(final int i, final int i_10_, final int i_11_) {
		try {
			final int i_12_ = Class64_Sub1.anIntArray3640[i_11_];
			final int i_13_ = GameObjectDefinition.anIntArray3001[i_10_];
			final float f = (float) Math.atan2(i_12_ + i, i_13_ + -2048);
			if (f >= -3.141592653589793 && f <= -2.356194490192345) {
				Class134.anInt3464 = i_10_;
				Class98_Sub10_Sub23.anInt5661 = i_11_;
			} else if (!(f <= -1.5707963267948966)
					|| !(f >= -2.356194490192345)) {
				if (f <= -0.7853981633974483 && f >= -1.5707963267948966) {
					Class134.anInt3464 = i_11_;
					Class98_Sub10_Sub23.anInt5661 = -i_10_ + Class25.anInt268;
				} else if (!(f <= 0.0F) || !(f >= -0.7853981633974483)) {
					if (!(f >= 0.0F) || !(f <= 0.7853981633974483)) {
						if (!(f >= 0.7853981633974483)
								|| !(f <= 1.5707963267948966)) {
							if (!(f >= 1.5707963267948966)
									|| !(f <= 2.356194490192345)) {
								if (f >= 2.356194490192345
										&& f <= 3.141592653589793) {
									Class98_Sub10_Sub23.anInt5661 = -i_11_
											+ Class25.anInt268;
									Class134.anInt3464 = i_10_;
								}
							} else {
								Class134.anInt3464 = Class63.anInt492 - i_11_;
								Class98_Sub10_Sub23.anInt5661 = i_10_;
							}
						} else {
							Class98_Sub10_Sub23.anInt5661 = -i_10_
									+ Class25.anInt268;
							Class134.anInt3464 = Class63.anInt492 + -i_11_;
						}
					} else {
						Class98_Sub10_Sub23.anInt5661 = Class25.anInt268
								+ -i_11_;
						Class134.anInt3464 = -i_10_ + Class63.anInt492;
					}
				} else {
					Class98_Sub10_Sub23.anInt5661 = i_11_;
					Class134.anInt3464 = -i_10_ + Class63.anInt492;
				}
			} else {
				Class134.anInt3464 = i_11_;
				Class98_Sub10_Sub23.anInt5661 = i_10_;
			}
			Class134.anInt3464 &= za_Sub1.anInt6075;
			Class98_Sub10_Sub23.anInt5661 &= Class329.anInt2761;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ow.D(" + i + ','
					+ i_10_ + ',' + i_11_ + ')'));
		}
	}

	public Class98_Sub10_Sub27() {
		super(1, false);
	}

	static {
		aClass84_5692 = aClass84_5693 = new Class84(false);
	}
}
