/* Class48_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class48_Sub1 extends Class48 {
	static int anInt3628;
	static int[] anIntArray3629 = new int[120];

	static final void method455(int i, int i_0_, int i_1_, int i_2_,
			boolean bool, int i_3_, int i_4_, int i_5_) {
		try {
			int i_6_ = i_0_ + i_3_;
			int i_7_ = i_4_ - i_0_;
			for (int i_8_ = i_3_; (i_8_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff); i_8_++)
				Class333.method3761(i,
						AnimationDefinition.anIntArrayArray814[i_8_], i_2_,
						i_1_, (byte) 96);
			int i_9_ = -i_0_ + i_1_;
			for (int i_10_ = i_4_; i_7_ < i_10_; i_10_--)
				Class333.method3761(i,
						AnimationDefinition.anIntArrayArray814[i_10_], i_2_,
						i_1_, (byte) 91);
			if (bool != false)
				anIntArray3629 = null;
			int i_11_ = i_0_ + i_2_;
			for (int i_12_ = i_6_; i_7_ >= i_12_; i_12_++) {
				int[] is = AnimationDefinition.anIntArrayArray814[i_12_];
				Class333.method3761(i, is, i_2_, i_11_, (byte) 100);
				Class333.method3761(i_5_, is, i_11_, i_9_, (byte) -124);
				Class333.method3761(i, is, i_9_, i_1_, (byte) 63);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("go.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + bool + ',' + i_3_
					+ ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	abstract Class42_Sub2 method456(byte i);

	static final Class98_Sub46_Sub10 method457(int i, int i_13_, int i_14_,
			Class207 class207) {
		try {
			ByteBuffer class98_sub22 = new ByteBuffer(
					class207.method2745(i, i_13_, false));
			Class98_Sub46_Sub10 class98_sub46_sub10 = (new Class98_Sub46_Sub10(
					i,
					class98_sub22.readString((byte) 84),
					class98_sub22.readString((byte) 84),
					class98_sub22.readInt(-2),
					class98_sub22.readInt(-2),
					(class98_sub22.readUnsignedByte((byte) -119) ^ 0xffffffff) == -2,
					class98_sub22.readUnsignedByte((byte) 126), class98_sub22
							.readUnsignedByte((byte) 28)));
			int i_15_ = class98_sub22.readUnsignedByte((byte) 116);
			for (int i_16_ = 0; i_15_ > i_16_; i_16_++)
				((Class98_Sub46_Sub10) class98_sub46_sub10).aClass148_6010
						.method2419(
								new RSModelLoader(class98_sub22
										.readUnsignedByte((byte) -122),
										class98_sub22.readUnsignedShort((byte) 127),
										class98_sub22.readUnsignedShort((byte) 127),
										class98_sub22.readUnsignedShort((byte) 127),
										class98_sub22.readUnsignedShort((byte) 127),
										class98_sub22.readUnsignedShort((byte) 127),
										class98_sub22.readUnsignedShort((byte) 127),
										class98_sub22.readUnsignedShort((byte) 127),
										class98_sub22.readUnsignedShort((byte) 127)),
								-20911);
			class98_sub46_sub10.method1569(-1);
			if (i_14_ != 10443)
				anIntArray3629 = null;
			return class98_sub46_sub10;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("go.A(" + i + ','
					+ i_13_ + ',' + i_14_ + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method458(Class98_Sub26 class98_sub26, int i, int i_17_,
			int i_18_, boolean bool) {
		try {
			long l = (long) (i << 1428771228 | i_17_ << 1140143822 | i_18_);
			Class98_Sub45 class98_sub45 = (Class98_Sub45) AbstractModel.aClass377_1180
					.method3990(l, -1);
			if (class98_sub45 == null) {
				class98_sub45 = new Class98_Sub45();
				AbstractModel.aClass377_1180.method3996(class98_sub45, l, -1);
				((Class98_Sub45) class98_sub45).aClass148_4254.method2419(
						class98_sub26, -20911);
			} else {
				ItemDefs class297 = (Class98_Sub46_Sub19.aClass205_6068
						.method2714(((Class98_Sub26) class98_sub26).anInt4031,
								(byte) -117));
				int i_19_ = ((ItemDefs) class297).anInt2475;
				if ((((ItemDefs) class297).anInt2469 ^ 0xffffffff) == -2)
					i_19_ *= ((Class98_Sub26) class98_sub26).anInt4032 + 1;
				for (Class98_Sub26 class98_sub26_20_ = (Class98_Sub26) ((Class98_Sub45) class98_sub45).aClass148_4254
						.method2418(32); class98_sub26_20_ != null; class98_sub26_20_ = (Class98_Sub26) ((Class98_Sub45) class98_sub45).aClass148_4254
						.method2417(102)) {
					class297 = (Class98_Sub46_Sub19.aClass205_6068.method2714(
							((Class98_Sub26) class98_sub26_20_).anInt4031,
							(byte) -126));
					int i_21_ = ((ItemDefs) class297).anInt2475;
					if (((ItemDefs) class297).anInt2469 == 1)
						i_21_ *= 1 + (((Class98_Sub26) class98_sub26_20_).anInt4032);
					if (i_19_ > i_21_) {
						Class279.method3322(class98_sub26_20_, class98_sub26,
								(byte) 24);
						return;
					}
				}
				if (bool != true)
					method459(true);
				((Class98_Sub45) class98_sub45).aClass148_4254.method2419(
						class98_sub26, -20911);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("go.D("
					+ (class98_sub26 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_17_ + ',' + i_18_ + ',' + bool + ')'));
		}
	}

	public static void method459(boolean bool) {
		do {
			try {
				anIntArray3629 = null;
				if (bool == false)
					break;
				anIntArray3629 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "go.B(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static {
		int i = 0;
		for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > -121; i_22_++) {
			int i_23_ = i_22_ - -1;
			int i_24_ = (int) (300.0 * Math.pow(2.0, (double) i_23_ / 7.0) + (double) i_23_);
			i += i_24_;
			anIntArray3629[i_22_] = i / 4;
		}
	}
}
