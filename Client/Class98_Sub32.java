/* Class98_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;

abstract class Class98_Sub32 extends Node {
	int anInt4105;
	static OutgoingOpcode aClass171_4106;
	static Class293 aClass293_4107 = null;
	int[] anIntArray4108;
	static int[] anIntArray4109 = new int[5];
	int anInt4110;
	static int[][] anIntArrayArray4111;

	static final int method1433(int i, int i_0_, int i_1_, int i_2_) {
		try {
			i_0_ &= 0x3;
			if (i_0_ == 0)
				return i_1_;
			if (i_2_ != -7175)
				method1437(125, 75, (byte) -103, -13);
			if (i_0_ == 1)
				return i;
			if (i_0_ == 2)
				return -i_1_ + 4095;
			return -i + 4095;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("nca.G(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	abstract void method1434(Graphics graphics, int i, byte i_3_, int i_4_,
			int i_5_, int i_6_, int i_7_, int i_8_);

	static final String method1435(String string, String string_9_, byte i,
			char c) {
		try {
			int i_10_ = string.length();
			int i_11_ = string_9_.length();
			if (i >= -57)
				method1439(96, 20, 39, 5);
			int i_12_ = i_10_;
			int i_13_ = -1 + i_11_;
			if (i_13_ != 0) {
				int i_14_ = 0;
				for (;;) {
					i_14_ = string.indexOf(c, i_14_);
					if (i_14_ < 0)
						break;
					i_14_++;
					i_12_ += i_13_;
				}
			}
			StringBuffer stringbuffer = new StringBuffer(i_12_);
			int i_15_ = 0;
			for (;;) {
				int i_16_ = string.indexOf(c, i_15_);
				if (i_16_ < 0)
					break;
				stringbuffer.append(string.substring(i_15_, i_16_));
				i_15_ = i_16_ - -1;
				stringbuffer.append(string_9_);
			}
			stringbuffer.append(string.substring(i_15_));
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("nca.E("
					+ (string != null ? "{...}" : "null") + ','
					+ (string_9_ != null ? "{...}" : "null") + ',' + i + ','
					+ c + ')'));
		}
	}

	static final void method1436(int i, boolean bool) {
		try {
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub3_4041));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub3_4076));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							1,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub15_4034));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							1,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub15_4058));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub11_4038));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub14_4049));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub25_4039));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub24_4047));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub13_4063));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub26_4035));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub7_4073));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub20_4056));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub10_4070));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub28_4064));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub23_4044));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub23_4055));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub6_4033));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub17_4046));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							0,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub5_4065));
			Class151_Sub1.method2450((byte) 103);
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							2,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub16_4040));
			Class98_Sub9.aClass98_Sub27_3856
					.method1285(
							(byte) -13,
							1,
							(((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub12_4048));
			Class98_Sub46_Sub13_Sub1.method1593((byte) 76);
			if (i > -77)
				method1435(null, null, (byte) 62, 'n');
			Class374.method3980((byte) 121);
			Class33.aBoolean316 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "nca.C(" + i + ','
					+ bool + ')');
		}
	}

	static final void method1437(int i, int i_17_, byte i_18_, int i_19_) {
		try {
			int i_20_ = Class272.anInt2038 + i;
			int i_21_ = aa_Sub2.anInt3562 + i_19_;
			if (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948 != null
					&& i >= 0
					&& i_19_ >= 0
					&& (Class165.anInt1276 ^ 0xffffffff) < (i ^ 0xffffffff)
					&& (i_19_ ^ 0xffffffff) > (Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff)
					&& ((((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub3_4076
							.method564((byte) 122) ^ 0xffffffff) != -1 || ((i_17_ ^ 0xffffffff) == ((((Class246_Sub3) Surface.player).aByte5088) ^ 0xffffffff)))) {
				long l = (long) (i_17_ << 1137066972 | i_21_ << -790678898 | i_20_);
				Class98_Sub45 class98_sub45 = ((Class98_Sub45) AbstractModel.aClass377_1180
						.method3990(l, -1));
				if (class98_sub45 == null)
					Class281.method3333(i_17_, i, i_19_);
				else {
					if (i_18_ <= 38)
						anIntArrayArray4111 = null;
					Class98_Sub26 class98_sub26 = (Class98_Sub26) ((Class98_Sub45) class98_sub45).aClass148_4254
							.method2418(32);
					if (class98_sub26 == null)
						Class281.method3333(i_17_, i, i_19_);
					else {
						Class246_Sub3_Sub2_Sub1 class246_sub3_sub2_sub1 = ((Class246_Sub3_Sub2_Sub1) Class281
								.method3333(i_17_, i, i_19_));
						if (class246_sub3_sub2_sub1 == null)
							class246_sub3_sub2_sub1 = (new Class246_Sub3_Sub2_Sub1(
									i << -489573239,
									Class78.aSArray594[i_17_].method3420(i_19_,
											-12639, i), i_19_ << 1477649545,
									i_17_, i_17_));
						else
							((Class246_Sub3_Sub2_Sub1) class246_sub3_sub2_sub1).anInt6341 = ((Class246_Sub3_Sub2_Sub1) class246_sub3_sub2_sub1).anInt6343 = -1;
						((Class246_Sub3_Sub2_Sub1) class246_sub3_sub2_sub1).anInt6338 = ((Class98_Sub26) class98_sub26).anInt4032;
						((Class246_Sub3_Sub2_Sub1) class246_sub3_sub2_sub1).anInt6340 = ((Class98_Sub26) class98_sub26).anInt4031;
						for (;;) {
							Class98_Sub26 class98_sub26_22_ = ((Class98_Sub26) ((Class98_Sub45) class98_sub45).aClass148_4254
									.method2417(88));
							if (class98_sub26_22_ == null)
								break;
							if (((Class246_Sub3_Sub2_Sub1) class246_sub3_sub2_sub1).anInt6340 != (((Class98_Sub26) class98_sub26_22_).anInt4031)) {
								((Class246_Sub3_Sub2_Sub1) class246_sub3_sub2_sub1).anInt6346 = (((Class98_Sub26) class98_sub26_22_).anInt4032);
								((Class246_Sub3_Sub2_Sub1) class246_sub3_sub2_sub1).anInt6341 = (((Class98_Sub26) class98_sub26_22_).anInt4031);
								for (;;) {
									Class98_Sub26 class98_sub26_23_ = ((Class98_Sub26) ((Class98_Sub45) class98_sub45).aClass148_4254
											.method2417(101));
									if (class98_sub26_23_ == null)
										break;
									if (((((Class98_Sub26) class98_sub26_23_).anInt4031) != (((Class246_Sub3_Sub2_Sub1) class246_sub3_sub2_sub1).anInt6340))
											&& (((((Class246_Sub3_Sub2_Sub1) class246_sub3_sub2_sub1).anInt6341) ^ 0xffffffff) != (((Class98_Sub26) class98_sub26_23_).anInt4031 ^ 0xffffffff))) {
										((Class246_Sub3_Sub2_Sub1) class246_sub3_sub2_sub1).anInt6343 = ((Class98_Sub26) class98_sub26_23_).anInt4031;
										((Class246_Sub3_Sub2_Sub1) class246_sub3_sub2_sub1).anInt6337 = ((Class98_Sub26) class98_sub26_23_).anInt4032;
									}
								}
								break;
							}
						}
						int i_24_ = (Class98_Sub46_Sub2_Sub2.method1538(i_17_,
								(i_19_ << -1106673015) + 256,
								256 + (i << 1297062281), 24111));
						((Class246_Sub3_Sub2_Sub1) class246_sub3_sub2_sub1).anInt6339 = 0;
						((Class246_Sub3) class246_sub3_sub2_sub1).aByte5088 = (byte) i_17_;
						((Class246_Sub3) class246_sub3_sub2_sub1).anInt5079 = i_19_ << 657245129;
						((Class246_Sub3) class246_sub3_sub2_sub1).anInt5089 = i_24_;
						((Class246_Sub3) class246_sub3_sub2_sub1).anInt5084 = i << -121249015;
						((Class246_Sub3) class246_sub3_sub2_sub1).aByte5081 = (byte) i_17_;
						if (Class1.method162(i_19_, (byte) -102, i))
							((Class246_Sub3) class246_sub3_sub2_sub1).aByte5081++;
						Class266.method3239(i_17_, i, i_19_, i_24_,
								class246_sub3_sub2_sub1);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("nca.F(" + i + ','
					+ i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	static final int method1438(String string, int i) {
		try {
			int i_25_ = string.length();
			int i_26_ = 0;
			for (int i_27_ = 0; (i_25_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++)
				i_26_ = -i_26_ + ((i_26_ << -672898683) + string.charAt(i_27_));
			if (i != 6243)
				method1436(-52, false);
			return i_26_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("nca.I("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method1439(int i, int i_28_, int i_29_, int i_30_) {
		Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_28_][i_29_];
		if (class172 != null) {
			Class246_Sub3_Sub5 class246_sub3_sub5 = ((Class172) class172).aClass246_Sub3_Sub5_1334;
			Class246_Sub3_Sub5 class246_sub3_sub5_31_ = ((Class172) class172).aClass246_Sub3_Sub5_1326;
			if (class246_sub3_sub5 != null) {
				((Class246_Sub3_Sub5) class246_sub3_sub5).aShort6165 = (short) ((((Class246_Sub3_Sub5) class246_sub3_sub5).aShort6165)
						* i_30_ / (16 << Class151_Sub8.anInt5015 - 7));
				((Class246_Sub3_Sub5) class246_sub3_sub5).aShort6163 = (short) ((((Class246_Sub3_Sub5) class246_sub3_sub5).aShort6163)
						* i_30_ / (16 << Class151_Sub8.anInt5015 - 7));
			}
			if (class246_sub3_sub5_31_ != null) {
				((Class246_Sub3_Sub5) class246_sub3_sub5_31_).aShort6165 = (short) ((((Class246_Sub3_Sub5) class246_sub3_sub5_31_).aShort6165)
						* i_30_ / (16 << Class151_Sub8.anInt5015 - 7));
				((Class246_Sub3_Sub5) class246_sub3_sub5_31_).aShort6163 = (short) ((((Class246_Sub3_Sub5) class246_sub3_sub5_31_).aShort6163)
						* i_30_ / (16 << Class151_Sub8.anInt5015 - 7));
			}
		}
	}

	public static void method1440(int i) {
		try {
			aClass293_4107 = null;
			anIntArrayArray4111 = null;
			int i_32_ = 12 / ((4 - i) / 48);
			aClass171_4106 = null;
			anIntArray4109 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "nca.H(" + i + ')');
		}
	}

	public Class98_Sub32() {
		/* empty */
	}

	abstract void method1441(int i, int i_33_, int i_34_, Canvas canvas);

	static {
		aClass171_4106 = new OutgoingOpcode(26, -1);
		anIntArrayArray4111 = new int[][] { { 12, 12, 12, 12 },
				{ 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 },
				{ 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 },
				{ 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 },
				{ 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 },
				{ 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
	}
}
