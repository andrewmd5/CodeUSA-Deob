/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

abstract class Class123 {
	static Class79 aClass79_1010 = new Class79(8);
	static long aLong1011;

	abstract void method2202(int i, int i_0_, byte[] is, int i_1_)
			throws IOException;

	abstract boolean method2203(int i, int i_2_) throws IOException;

	public Class123() {
		/* empty */
	}

	abstract void method2204(int i);

	static final boolean method2205(final int i, final byte[] is,
			final int i_3_, final int i_4_, final int i_5_, final int i_6_) {
		try {
			if (i_6_ < 85) {
				method2210(81);
			}
			boolean bool = true;
			final ByteBuffer class98_sub22 = new ByteBuffer(is);
			int i_7_ = -1;
			for (;;) {
				final int i_8_ = class98_sub22.method1208(3893);
				if ((i_8_ ^ 0xffffffff) == -1) {
					break;
				}
				i_7_ += i_8_;
				int i_9_ = 0;
				boolean bool_10_ = false;
				for (;;) {
					if (!bool_10_) {
						final int i_11_ = class98_sub22.readSmart();
						if ((i_11_ ^ 0xffffffff) == -1) {
							break;
						}
						i_9_ += i_11_ + -1;
						final int i_12_ = 0x3f & i_9_;
						final int i_13_ = 0x3f & i_9_ >> 145149062;
						final int i_14_ = (class98_sub22
								.readUnsignedByte((byte) -122) >> -2093245406);
						final int i_15_ = i_13_ - -i_3_;
						final int i_16_ = i_12_ - -i;
						if ((i_15_ ^ 0xffffffff) < -1
								&& i_16_ > 0
								&& (-1 + i_4_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff)
								&& i_16_ < -1 + i_5_) {
							final GameObjectDefinition class352 = Class130.aClass302_1028
									.method3546(i_7_, (byte) 119);
							if ((i_14_ ^ 0xffffffff) != -23
									|| (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038
											.method596((byte) 120) ^ 0xffffffff) != -1
									|| class352.anInt2998 != 0
									|| class352.actionCount == 1
									|| class352.aBoolean2969) {
								if (!class352.method3857(18182)) {
									Class132.anInt1043++;
									bool = false;
								}
								bool_10_ = true;
							}
						}
					} else {
						final int i_17_ = class98_sub22.readSmart();
						if (i_17_ == 0) {
							break;
						}
						class98_sub22.readUnsignedByte((byte) -124);
					}
				}
			}
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ida.I(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final void method2206(final Class293 class293, final byte i) {
		try {
			if (i == 19) {
				if (class293.anInt2307 == Class375.anInt3168) {
					if (Surface.player.name2 == null) {
						class293.anInt2343 = 0;
						class293.anInt2210 = 0;
					} else {
						class293.anInt2310 = 150;
						class293.anInt2218 = (int) (256.0 * Math
								.sin(Class215.anInt1614 / 40.0)) & 0x7ff;
						class293.anInt2343 = za_Sub2.anInt6080;
						class293.anInt2233 = 5;
						class293.anInt2210 = (Class98_Sub32
								.method1438(
										(Surface.player.name2),
										i + 6224));
						class293.anInt2312 = 0;
						class293.anInt2303 = (((Entity) Surface.player).anInt6350);
						class293.anInt2287 = (((Entity) Surface.player).anInt6419);
						class293.anInt2208 = (((Entity) Surface.player).anInt6385);
						final AnimationDefinition class97 = (((class293.anInt2208 ^ 0xffffffff) == 0) ? null
								: (Class151_Sub7.aClass183_5001.method2623(
										class293.anInt2208, 16383)));
						if (class97 != null) {
							Class280.method3327((class293.anInt2303), class97,
									(byte) 93);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ida.J("
					+ (class293 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	abstract void method2207(int i);

	abstract int method2208(byte[] is, int i, int i_18_, int i_19_)
			throws IOException;

	static final short[] method2209(final int i, final int i_20_,
			final short[] is) {
		try {
			if (i_20_ != 21119) {
				aClass79_1010 = null;
			}
			final short[] is_21_ = new short[i];
			Class236.method2895(is, 0, is_21_, 0, i);
			return is_21_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ida.H(" + i + ','
					+ i_20_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2210(final int i) {
		do {
			try {
				aClass79_1010 = null;
				if (i == 145149062) {
					break;
				}
				aClass79_1010 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ida.G(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
