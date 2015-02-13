/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class28 {
	float aFloat281;
	int anInt282;
	int anInt283;
	int anInt284;
	int anInt285;
	static Class128 aClass128_286 = new Class128();
	Class48 aClass48_287;
	float aFloat288;
	float aFloat289;
	int anInt290;
	float aFloat291 = 0.25F;
	int anInt292;
	float aFloat293 = 1.0F;
	static float[] aFloatArray294 = new float[2];
	float aFloat295 = 1.0F;

	final void method297(final int i, final ByteBuffer class98_sub22) {
		try {
			aFloat295 = 8 * class98_sub22.readUnsignedByte((byte) 96) / 255.0F;
			aFloat291 = class98_sub22.readUnsignedByte((byte) -122) * 8 / 255.0F;
			if (i != -50) {
				method297(-51, null);
			}
			aFloat293 = 8 * class98_sub22.readUnsignedByte((byte) 1) / 255.0F;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ca.A(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method298(final int i) {
		do {
			try {
				aClass128_286 = null;
				aFloatArray294 = null;
				if (i == -15136) {
					break;
				}
				method298(-41);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ca.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final boolean method299(final boolean bool, final Class28 class28_0_) {
		try {
			if (bool != true) {
				return false;
			}
			if (((anInt290 ^ 0xffffffff) != (class28_0_.anInt290 ^ 0xffffffff))
					|| (aFloat281 != class28_0_.aFloat281)
					|| (aFloat288 != class28_0_.aFloat288)
					|| (aFloat289 != class28_0_.aFloat289)
					|| (class28_0_.aFloat291 != aFloat291)
					|| (class28_0_.aFloat295 != aFloat295)
					|| (class28_0_.aFloat293 != aFloat293)
					|| ((class28_0_.anInt285 ^ 0xffffffff) != (anInt285 ^ 0xffffffff))
					|| anInt283 != class28_0_.anInt283
					|| (aClass48_287 != class28_0_.aClass48_287)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ca.C(" + bool
					+ ',' + (class28_0_ != null ? "{...}" : "null") + ')'));
		}
	}

	public Class28() {
		try {
			aFloat288 = 0.69921875F;
			anInt282 = -50;
			aClass48_287 = Class246_Sub7.aClass48_5119;
			anInt292 = -50;
			anInt285 = Class189.anInt1455;
			anInt284 = -60;
			anInt290 = Class299_Sub2.anInt5298;
			anInt283 = 0;
			aFloat281 = 1.1523438F;
			aFloat289 = 1.2F;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ca.<init>(" + ')');
		}
	}

	Class28(final ByteBuffer class98_sub22) {
		try {
			final int i = class98_sub22.readUnsignedByte((byte) -100);
			if ((Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub10_4070
					.method592((byte) 126) ^ 0xffffffff) == -2
					&& Class98_Sub37.aHa4185.method1822() > 0) {
				if ((0x1 & i ^ 0xffffffff) != -1) {
					anInt290 = class98_sub22.readInt(-2);
				} else {
					anInt290 = Class299_Sub2.anInt5298;
				}
				if ((0x2 & i) == 0) {
					aFloat281 = 1.1523438F;
				} else {
					aFloat281 = (class98_sub22.readUnsignedShort((byte) 127) / 256.0F);
				}
				if ((0x4 & i) != 0) {
					aFloat288 = (class98_sub22.readUnsignedShort((byte) 127) / 256.0F);
				} else {
					aFloat288 = 0.69921875F;
				}
				if ((0x8 & i ^ 0xffffffff) != -1) {
					aFloat289 = (class98_sub22.readUnsignedShort((byte) 127) / 256.0F);
				} else {
					aFloat289 = 1.2F;
				}
			} else {
				if ((0x1 & i ^ 0xffffffff) != -1) {
					class98_sub22.readInt(-2);
				}
				if ((0x2 & i ^ 0xffffffff) != -1) {
					class98_sub22.readUnsignedShort((byte) 127);
				}
				if ((0x4 & i) != 0) {
					class98_sub22.readUnsignedShort((byte) 127);
				}
				if ((i & 0x8) != 0) {
					class98_sub22.readUnsignedShort((byte) 127);
				}
				aFloat281 = 1.1523438F;
				aFloat289 = 1.2F;
				anInt290 = Class299_Sub2.anInt5298;
				aFloat288 = 0.69921875F;
			}
			if ((0x10 & i) != 0) {
				anInt282 = class98_sub22.readUShort(false);
				anInt284 = class98_sub22.readUShort(false);
				anInt292 = class98_sub22.readUShort(false);
			} else {
				anInt284 = -60;
				anInt292 = -50;
				anInt282 = -50;
			}
			if ((0x20 & i ^ 0xffffffff) == -1) {
				anInt285 = Class189.anInt1455;
			} else {
				anInt285 = class98_sub22.readInt(-2);
			}
			if ((i & 0x40) == 0) {
				anInt283 = 0;
			} else {
				anInt283 = class98_sub22.readUnsignedShort((byte) 127);
			}
			if ((i & 0x80) == 0) {
				aClass48_287 = Class246_Sub7.aClass48_5119;
			} else {
				final int i_1_ = class98_sub22.readUnsignedShort((byte) 127);
				final int i_2_ = class98_sub22.readUnsignedShort((byte) 127);
				final int i_3_ = class98_sub22.readUnsignedShort((byte) 127);
				final int i_4_ = class98_sub22.readUnsignedShort((byte) 127);
				final int i_5_ = class98_sub22.readUnsignedShort((byte) 127);
				final int i_6_ = class98_sub22.readUnsignedShort((byte) 127);
				aClass48_287 = Class13.method217(5, i_4_, i_6_, i_5_, i_3_,
						i_1_, i_2_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ca.<init>("
					+ (class98_sub22 != null ? "{...}" : "null") + ')');
		}
	}
}
