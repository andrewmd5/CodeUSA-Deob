/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class105 implements Interface15 {
	static byte[][] aByteArrayArray3414;
	static int anInt3415;
	int anInt3416;
	static int anInt3417;

	public static void method1714(int i) {
		do {
			try {
				aByteArrayArray3414 = null;
				if (i == -9)
					break;
				method1714(-127);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "gm.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					"gm.toString(" + ')');
		}
	}

	static final boolean method1715(boolean bool, int i, int i_0_) {
		try {
			if (bool != true)
				return true;
			if ((i & 0x22 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gm.A(" + bool
					+ ',' + i + ',' + i_0_ + ')'));
		}
	}

	static final Class93 method1716(int i, ByteBuffer class98_sub22) {
		try {
			if (i != -1)
				aByteArrayArray3414 = null;
			Class63 class63 = (Class98_Sub46_Sub13_Sub1.method1595(122)[class98_sub22
					.readUnsignedByte((byte) -101)]);
			Class110 class110 = (Class331.method3723(256)[class98_sub22
					.readUnsignedByte((byte) -98)]);
			int i_1_ = class98_sub22.readUShort(false);
			int i_2_ = class98_sub22.readUShort(false);
			int i_3_ = class98_sub22.readUnsignedShort((byte) 127);
			int i_4_ = class98_sub22.readUnsignedShort((byte) 127);
			int i_5_ = class98_sub22.readUShort(false);
			int i_6_ = class98_sub22.readInt(-2);
			int i_7_ = class98_sub22.readInt(i ^ 0x1);
			return new Class93(class63, class110, i_1_, i_2_, i_3_, i_4_, i_5_,
					i_6_, i_7_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gm.B(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method1717(int i, int i_8_, int i_9_, int i_10_, int i_11_) {
		try {
			int i_12_ = 0xf & i_10_;
			int i_13_ = (i_12_ ^ 0xffffffff) > -9 ? i_9_ : i_8_;
			int i_14_ = (i_11_ >= (i_12_ ^ 0xffffffff) ? i_12_ != 12
					&& i_12_ != 14 ? i : i_9_ : i_8_);
			return (((i_12_ & 0x2) == 0 ? i_14_ : -i_14_) + ((i_12_ & 0x1 ^ 0xffffffff) == -1 ? i_13_
					: -i_13_));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gm.C(" + i + ','
					+ i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	static final Class326 method1718(int i, int i_15_) {
		try {
			if ((i ^ 0xffffffff) != -1) {
				if (i != 1) {
					if ((i ^ 0xffffffff) == -3) {
						if ((double) Class278.aFloat2064 == 3.0)
							return Class151_Sub7.aClass326_5009;
						if ((double) Class278.aFloat2064 == 4.0)
							return Class271.aClass326_2033;
						if ((double) Class278.aFloat2064 == 6.0)
							return Class224.aClass326_1686;
						if ((double) Class278.aFloat2064 >= 8.0)
							return Class260.aClass326_3263;
					}
				} else {
					if ((double) Class278.aFloat2064 == 3.0)
						return Class339_Sub1.aClass326_5308;
					if ((double) Class278.aFloat2064 == 4.0)
						return Class137.aClass326_1080;
					if ((double) Class278.aFloat2064 == 6.0)
						return Class151_Sub7.aClass326_5009;
					if ((double) Class278.aFloat2064 >= 8.0)
						return Class271.aClass326_2033;
				}
			} else {
				if ((double) Class278.aFloat2064 == 3.0)
					return Class339_Sub1.aClass326_5315;
				if ((double) Class278.aFloat2064 == 4.0)
					return Class77_Sub1.aClass326_3805;
				if ((double) Class278.aFloat2064 == 6.0)
					return Class339_Sub1.aClass326_5308;
				if ((double) Class278.aFloat2064 >= 8.0)
					return Class137.aClass326_1080;
			}
			if (i_15_ != 5466)
				method1718(35, 58);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gm.E(" + i + ','
					+ i_15_ + ')');
		}
	}

	Class105(String string, int i) {
		try {
			((Class105) this).anInt3416 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gm.<init>("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
