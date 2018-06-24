/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.awt.Canvas;

final class Class60 {
	int anInt470 = -1;
	static Class85 aClass85_471 = new Class85(4, 4);
	int anInt472 = -1;
	int[] anIntArray473;
	static Class105 aClass105_474 = new Class105("", 13);
	static long[] aLongArray475;
	static IncomingOpcode aClass58_476 = new IncomingOpcode(27, 6);

	private final void method532(byte i, ByteBuffer class98_sub22, int i_0_) {
		try {
			if (i < 1)
				method535(101, 11, -47, -9, null, null, null, null, null, null,
						-9, (byte) -87, 72, -113, false, true, -44, -71, false);
			if ((i_0_ ^ 0xffffffff) == -2)
				((Class60) this).anInt470 = class98_sub22.readUnsignedShort((byte) 127);
			else if (i_0_ != 2) {
				if (i_0_ == 3)
					((Class60) this).anInt472 = class98_sub22
							.readUnsignedByte((byte) -101);
			} else {
				((Class60) this).anIntArray473 = new int[class98_sub22
						.readUnsignedByte((byte) -101)];
				for (int i_1_ = 0; i_1_ < ((Class60) this).anIntArray473.length; i_1_++)
					((Class60) this).anIntArray473[i_1_] = class98_sub22
							.readUnsignedShort((byte) 127);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("eba.A(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i_0_ + ')'));
		}
	}

	final void method533(ByteBuffer class98_sub22, int i) {
		try {
			if (i != 0)
				method533(null, 76);
			for (;;) {
				int i_2_ = class98_sub22.readUnsignedByte((byte) -120);
				if (i_2_ == 0)
					break;
				method532((byte) 58, class98_sub22, i_2_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("eba.C(" + (class98_sub22 != null ? "{...}" : "null")
							+ ',' + i + ')'));
		}
	}

	public static void method534(byte i) {
		try {
			aClass85_471 = null;
			if (i != -63)
				aLongArray475 = null;
			aClass58_476 = null;
			aClass105_474 = null;
			aLongArray475 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "eba.D(" + i + ')');
		}
	}

	static final void method535(int i, int i_3_, int i_4_, int i_5_,
			byte[][][] is, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_,
			int[] is_10_, int i_11_, byte i_12_, int i_13_, int i_14_,
			boolean bool, boolean bool_15_, int i_16_, int i_17_,
			boolean bool_18_) {
		Class135.aBoolean1052 = true;
		Class348.aBoolean2914 = Class98_Sub10_Sub30.aHa5709.method1822() > 0;
		GameObjectDefinitionLoader.aBoolean2526 = bool_15_;
		Class241.anInt1845 = i_3_ >> Class151_Sub8.anInt5015;
		Class64_Sub26.anInt3714 = i_5_ >> Class151_Sub8.anInt5015;
		Class127.anInt1018 = i_3_;
		Class98_Sub48.anInt4280 = i_5_;
		Class42_Sub1_Sub1.anInt6208 = i_4_;
		Class306.anInt2561 = Class241.anInt1845 - Class259.anInt1959;
		if (Class306.anInt2561 < 0) {
			Class67.anInt521 = -Class306.anInt2561;
			Class306.anInt2561 = 0;
		} else
			Class67.anInt521 = 0;
		OutgoingOpcode.anInt1318 = Class64_Sub26.anInt3714 - Class259.anInt1959;
		if (OutgoingOpcode.anInt1318 < 0) {
			Class98_Sub37.anInt4184 = -OutgoingOpcode.anInt1318;
			OutgoingOpcode.anInt1318 = 0;
		} else
			Class98_Sub37.anInt4184 = 0;
		Class21_Sub2.anInt5388 = Class241.anInt1845 + Class259.anInt1959;
		if (Class21_Sub2.anInt5388 > Class366.anInt3112)
			Class21_Sub2.anInt5388 = Class366.anInt3112;
		Class32.anInt303 = Class64_Sub26.anInt3714 + Class259.anInt1959;
		if (Class32.anInt303 > Class64_Sub9.anInt3662)
			Class32.anInt303 = Class64_Sub9.anInt3662;
		boolean[][] bools = Class74.aBooleanArrayArray551;
		boolean[][] bools_19_ = Class319.aBooleanArrayArray2702;
		if (GameObjectDefinitionLoader.aBoolean2526) {
			for (int i_20_ = 0; i_20_ < Class259.anInt1959 + Class259.anInt1959
					+ 2; i_20_++) {
				int i_21_ = 0;
				int i_22_ = 0;
				for (int i_23_ = 0; i_23_ < Class259.anInt1959
						+ Class259.anInt1959 + 2; i_23_++) {
					if (i_23_ > 1)
						Class347.anIntArray2906[i_23_ - 2] = i_21_;
					i_21_ = i_22_;
					int i_24_ = Class241.anInt1845 - Class259.anInt1959 + i_20_;
					int i_25_ = Class64_Sub26.anInt3714 - Class259.anInt1959
							+ i_23_;
					if (i_24_ >= 0 && i_25_ >= 0 && i_24_ < Class366.anInt3112
							&& i_25_ < Class64_Sub9.anInt3662) {
						int i_26_ = i_24_ << Class151_Sub8.anInt5015;
						int i_27_ = i_25_ << Class151_Sub8.anInt5015;
						int i_28_ = (Class98_Sub46_Sub2_Sub2.aSArray6298[(Class98_Sub46_Sub2_Sub2.aSArray6298.length - 1)]
								.method3420(i_25_, -12639, i_24_) - (1000 << Class151_Sub8.anInt5015 - 7));
						int i_29_ = (Class81.aSArray618 != null ? (Class81.aSArray618[0]
								.method3420(i_25_, -12639, i_24_) + r_Sub2.anInt6333)
								: (Class98_Sub46_Sub2_Sub2.aSArray6298[0]
										.method3420(i_25_, -12639, i_24_) + r_Sub2.anInt6333));
						i_22_ = (i_16_ >= 0 ? Class98_Sub10_Sub30.aHa5709
								.r(i_26_, i_28_, i_27_, i_26_, i_29_, i_27_,
										i_16_) : Class98_Sub10_Sub30.aHa5709
								.JA(i_26_, i_28_, i_27_, i_26_, i_29_, i_27_));
						Class319.aBooleanArrayArray2702[i_20_][i_23_] = i_22_ == 0;
					} else {
						i_22_ = -1;
						Class319.aBooleanArrayArray2702[i_20_][i_23_] = false;
					}
					if (i_20_ > 0 && i_23_ > 0) {
						int i_30_ = (Class347.anIntArray2906[i_23_ - 1]
								& Class347.anIntArray2906[i_23_] & i_21_ & i_22_);
						Class74.aBooleanArrayArray551[i_20_ - 1][i_23_ - 1] = i_30_ == 0;
					}
				}
				Class347.anIntArray2906[(Class259.anInt1959 + Class259.anInt1959)] = i_21_;
				Class347.anIntArray2906[(Class259.anInt1959
						+ Class259.anInt1959 + 1)] = i_22_;
			}
			if (i_16_ >= 0)
				Class135.aBoolean1052 = false;
			else {
				Class132.anIntArray1044 = is_6_;
				Class288.anIntArray3376 = is_7_;
				Class98_Sub46_Sub10.anIntArray6015 = is_8_;
				Class98_Sub10_Sub10.anIntArray5589 = is_9_;
				Class364.anIntArray3102 = is_10_;
				Class340.method3802(Class98_Sub10_Sub30.aHa5709, i_11_,
						(byte) -59);
			}
		} else {
			if (aa_Sub1.aBooleanArrayArray3560 == null)
				aa_Sub1.aBooleanArrayArray3560 = (new boolean[Class366.anInt3112
						+ Class366.anInt3112 + 1][Class64_Sub9.anInt3662
						+ Class366.anInt3112 + 1]);
			for (int i_31_ = 0; i_31_ < aa_Sub1.aBooleanArrayArray3560.length; i_31_++) {
				for (int i_32_ = 0; i_32_ < aa_Sub1.aBooleanArrayArray3560[0].length; i_32_++)
					aa_Sub1.aBooleanArrayArray3560[i_31_][i_32_] = true;
			}
			Class319.aBooleanArrayArray2702 = aa_Sub1.aBooleanArrayArray3560;
			Class74.aBooleanArrayArray551 = aa_Sub1.aBooleanArrayArray3560;
			Class306.anInt2561 = 0;
			OutgoingOpcode.anInt1318 = 0;
			Class21_Sub2.anInt5388 = Class366.anInt3112;
			Class32.anInt303 = Class64_Sub9.anInt3662;
			Class135.aBoolean1052 = false;
		}
		Class64_Sub7.method580(Class98_Sub10_Sub30.aHa5709, 59);
		if (!((Class84) Class98_Sub10_Sub27.aClass84_5692).aBoolean637) {
			Class218 class218 = ((Class84) Class98_Sub10_Sub27.aClass84_5692).aClass218_635;
			for (Class246_Sub1 class246_sub1 = (Class246_Sub1) class218
					.method2803((byte) 15); class246_sub1 != null; class246_sub1 = (Class246_Sub1) class218
					.method2809(false)) {
				class246_sub1.method2965((byte) -37);
				SurfaceSkin.method333(class246_sub1, 84);
			}
		}
		if (Class348.aBoolean2914) {
			for (int i_33_ = 0; i_33_ < Class226.anInt1705; i_33_++)
				Class98_Sub10_Sub31.aClass1Array5717[i_33_].method161(bool, i,
						71);
		}
		if (Class375.aBoolean3170) {
			GameObjectDefinitionLoader.anIntArray2521 = Class98_Sub10_Sub30.aHa5709
					.Y();
			Class98_Sub10_Sub30.aHa5709.K(Class98_Sub16.anIntArray3933);
			int i_34_ = ((Class98_Sub16.anIntArray3933[2] - Class98_Sub16.anIntArray3933[0]) / Class18.anInt212);
			for (int i_35_ = 0; i_35_ < Class18.anInt212 - 1; i_35_++)
				s.anIntArray2205[i_35_] = i_34_ * (i_35_ + 1)
						+ Class15.anIntArray182[i_35_];
			for (int i_36_ = 0; i_36_ < Class98_Sub46_Sub5.aClass174Array5970.length; i_36_++)
				Class98_Sub46_Sub5.aClass174Array5970[i_36_].method2566();
		}
		if (Class252.aClass172ArrayArrayArray1927 != null) {
			if (Class375.aBoolean3170)
				Class69.method701(0);
			Class248.method3158(true);
			Class98_Sub10_Sub30.aHa5709.ra(-1, 1583160, 40, 127);
			Class69.method700(true, is, i_11_, i_12_, i_16_, i_17_, bool_18_);
			if (Class375.aBoolean3170)
				Class9.method194();
			Class98_Sub10_Sub30.aHa5709.pa();
			Class248.method3158(false);
		}
		Class69.method700(false, is, i_11_, i_12_, i_16_, i_17_, bool_18_);
		if (Class375.aBoolean3170) {
			for (int i_37_ = 0; i_37_ < Class364.anInt3103; i_37_++)
				Class64_Sub12.aBooleanArrayArrayArray3673[i_37_] = Class34.aBooleanArrayArrayArray325[i_37_];
			Class69.method701(0);
			for (int i_38_ = 0; i_38_ < Class98_Sub46_Sub5.aClass174Array5970.length; i_38_++)
				Class98_Sub46_Sub5.aClass174Array5970[i_38_].method2566();
		}
		if (Class375.aBoolean3170) {
			Class9.method194();
			for (int i_39_ = 0; i_39_ < Class364.anInt3103; i_39_++)
				Class34.aBooleanArrayArrayArray325[i_39_] = Class64_Sub12.aBooleanArrayArrayArray3673[i_39_];
			if (Class294.anInt2407 == 2) {
				if (Class98_Sub10_Sub39.aLongArray5772[0] < Class98_Sub10_Sub39.aLongArray5772[1]) {
					if (s.anIntArray2205[0] + Class15.anIntArray182[0] > Class98_Sub16.anIntArray3933[0])
						Class15.anIntArray182[0]++;
				} else if ((Class98_Sub10_Sub39.aLongArray5772[0] > Class98_Sub10_Sub39.aLongArray5772[1])
						&& (s.anIntArray2205[0] + Class15.anIntArray182[0] < Class98_Sub16.anIntArray3933[2]))
					Class15.anIntArray182[0]--;
			}
		}
		if (!GameObjectDefinitionLoader.aBoolean2526) {
			Class74.aBooleanArrayArray551 = bools;
			Class319.aBooleanArrayArray2702 = bools_19_;
		}
		Class208.method2767();
	}

	static final ha method536(int i, Class207 class207, d var_d, int i_40_,
			Canvas canvas) {
		try {
			if (!Class319.method3660(true))
				throw new RuntimeException("");
			if (!Class134_Sub1.method2246("jaggl", (byte) -36))
				throw new RuntimeException("");
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, i_40_, i);
			if (l == 0L)
				throw new RuntimeException("");
			ha_Sub3_Sub2 var_ha_Sub3_Sub2 = new ha_Sub3_Sub2(opengl, canvas, l,
					var_d, class207, i);
			var_ha_Sub3_Sub2.method1965(true);
			return var_ha_Sub3_Sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("eba.E(" + i + ','
					+ (class207 != null ? "{...}" : "null") + ','
					+ (var_d != null ? "{...}" : "null") + ',' + i_40_ + ','
					+ (canvas != null ? "{...}" : "null") + ')'));
		}
	}

	public Class60() {
		/* empty */
	}
}
