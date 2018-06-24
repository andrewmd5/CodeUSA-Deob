/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Rectangle;

final class Class280 {
	static Class164 aClass164_2101 = new Class164(1);
	int anInt2102;
	int anInt2103 = 0;
	private Class207 aClass207_2104;
	static int anInt2105;
	static Rectangle[] aRectangleArray2106 = new Rectangle[100];
	private Class79 aClass79_2107;
	static Class148 aClass148_2108;
	private Class207 aClass207_2109;
	private Interface1 anInterface1_2110;
	static Class113 aClass113_2111;
	static long aLong2112;

	static final void method3324(Class98_Sub46_Sub8 class98_sub46_sub8, int i) {
		try {
			if (!Player.aBoolean6540) {
				class98_sub46_sub8.method942(87);
				if (i != -32612)
					method3329(110);
				Class359.anInt3058--;
				if (!((Class98_Sub46_Sub8) class98_sub46_sub8).aBoolean5989) {
					long l = ((Class98_Sub46_Sub8) class98_sub46_sub8).aLong5991;
					Class98_Sub46_Sub9 class98_sub46_sub9;
					for (class98_sub46_sub9 = ((Class98_Sub46_Sub9) Class98_Sub47.aClass377_4274
							.method3990(l, -1)); class98_sub46_sub9 != null; class98_sub46_sub9 = (Class98_Sub46_Sub9) Class98_Sub47.aClass377_4274
							.method3993(125)) {
						if (((Class98_Sub46_Sub9) class98_sub46_sub9).aString5998
								.equals(((Class98_Sub46_Sub8) class98_sub46_sub8).aString5992))
							break;
					}
					if (class98_sub46_sub9 != null
							&& class98_sub46_sub9.method1557((byte) -105,
									class98_sub46_sub8))
						Class9.method189(class98_sub46_sub9, (byte) 87);
				} else {
					for (Class98_Sub46_Sub9 class98_sub46_sub9 = ((Class98_Sub46_Sub9) Class98_Sub18.aClass215_3949
							.method2792(-1)); class98_sub46_sub9 != null; class98_sub46_sub9 = ((Class98_Sub46_Sub9) Class98_Sub18.aClass215_3949
							.method2787(0))) {
						if (((Class98_Sub46_Sub9) class98_sub46_sub9).aString5998
								.equals(((Class98_Sub46_Sub8) class98_sub46_sub8).aString5992)) {
							boolean bool = false;
							for (Class98_Sub46_Sub8 class98_sub46_sub8_0_ = ((Class98_Sub46_Sub8) ((Class98_Sub46_Sub9) class98_sub46_sub9).aClass215_5999
									.method2792(-1)); class98_sub46_sub8_0_ != null; class98_sub46_sub8_0_ = ((Class98_Sub46_Sub8) ((Class98_Sub46_Sub9) class98_sub46_sub9).aClass215_5999
									.method2787(0))) {
								if (class98_sub46_sub8_0_ == class98_sub46_sub8) {
									if (class98_sub46_sub9.method1557(
											(byte) -125, class98_sub46_sub8))
										Class9.method189(class98_sub46_sub9,
												(byte) 87);
									bool = true;
									break;
								}
							}
							if (bool)
								break;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("rh.E(" + (class98_sub46_sub8 != null ? "{...}" : "null")
							+ ',' + i + ')'));
		}
	}

	final Class98_Sub46_Sub11 method3325(int i, int i_1_) {
		try {
			Class98_Sub46_Sub11 class98_sub46_sub11 = ((Class98_Sub46_Sub11) aClass79_2107
					.method802(-125, (long) i));
			if (i_1_ <= 31)
				method3326(null, null, (byte) 46, -3L);
			if (class98_sub46_sub11 != null)
				return class98_sub46_sub11;
			byte[] is;
			do {
				if ((i ^ 0xffffffff) <= -32769) {
					is = aClass207_2104.method2745(0x7fff & i, 1, false);
					if (!client.aBoolean3553)
						break;
				}
				is = aClass207_2109.method2745(i, 1, false);
			} while (false);
			class98_sub46_sub11 = new Class98_Sub46_Sub11();
			((Class98_Sub46_Sub11) class98_sub46_sub11).aClass280_6028 = this;
			if (is != null)
				class98_sub46_sub11.method1584((byte) -89,
						new ByteBuffer(is));
			if ((i ^ 0xffffffff) <= -32769)
				class98_sub46_sub11.method1575((byte) -123);
			aClass79_2107.method805((long) i, class98_sub46_sub11, (byte) -80);
			return class98_sub46_sub11;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rh.G(" + i + ','
					+ i_1_ + ')');
		}
	}

	final String method3326(Class348 class348, int[] is, byte i, long l) {
		try {
			int i_2_ = -32 % ((i - -41) / 46);
			if (anInterface1_2110 != null) {
				String string = anInterface1_2110.method1(17438, l, class348,
						is);
				if (string != null)
					return string;
			}
			return Long.toString(l);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("rh.A(" + (class348 != null ? "{...}" : "null") + ','
							+ (is != null ? "{...}" : "null") + ',' + i + ','
							+ l + ')'));
		}
	}

	static final void method3327(int i, AnimationDefinition class97, byte i_3_) {
		try {
			if ((Class306.anInt2566 ^ 0xffffffff) > -51
					&& (class97 != null
							&& ((AnimationDefinition) class97).anIntArrayArray822 != null
							&& (((AnimationDefinition) class97).anIntArrayArray822.length ^ 0xffffffff) < (i ^ 0xffffffff) && ((AnimationDefinition) class97).anIntArrayArray822[i] != null)) {
				int i_4_ = ((AnimationDefinition) class97).anIntArrayArray822[i][0];
				int i_5_ = i_4_ >> -103665464;
				if (((AnimationDefinition) class97).anIntArrayArray822[i].length > 1) {
					int i_6_ = (int) (Math.random() * (double) (((AnimationDefinition) class97).anIntArrayArray822[i]).length);
					if (i_6_ > 0)
						i_5_ = ((AnimationDefinition) class97).anIntArrayArray822[i][i_6_];
				}
				int i_7_ = (0xf6 & i_4_) >> 264525829;
				int i_8_ = 60 / ((i_3_ - 16) / 45);
				int i_9_ = 256;
				if (((AnimationDefinition) class97).anIntArray810 != null
						&& ((AnimationDefinition) class97).anIntArray815 != null)
					i_9_ = Class142.method2307(
							(((AnimationDefinition) class97).anIntArray810[i]),
							(((AnimationDefinition) class97).anIntArray815[i]),
							52);
				if (!((AnimationDefinition) class97).aBoolean812)
					Class301.method3537(i_9_, (byte) 1, i_5_, i_7_, 0, 255);
				else
					Class98_Sub10_Sub9.method1036(-1962608884, 255, i_7_, i_5_,
							false, 0, i_9_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rh.D(" + i + ','
					+ (class97 != null ? "{...}" : "null") + ',' + i_3_ + ')'));
		}
	}

	static final void method3328(int i, int i_10_, int i_11_, int i_12_,
			int i_13_, Class98_Sub42 class98_sub42) {
		while_164_: do {
			do {
				try {
					if ((((Class98_Sub42) class98_sub42).anInt4210 ^ 0xffffffff) == 0
							&& (((Class98_Sub42) class98_sub42).anIntArray4208 == null))
						break;
					int i_14_ = 0;
					int i_15_ = (((Class98_Sub42) class98_sub42).anInt4236 * ((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4051
							.method641((byte) 124)) >> -884604664;
					if ((i_12_ ^ 0xffffffff) >= (((Class98_Sub42) class98_sub42).anInt4224 ^ 0xffffffff)) {
						if ((i_12_ ^ 0xffffffff) > (((Class98_Sub42) class98_sub42).anInt4229 ^ 0xffffffff))
							i_14_ += -i_12_
									+ (((Class98_Sub42) class98_sub42).anInt4229);
					} else
						i_14_ += (-((Class98_Sub42) class98_sub42).anInt4224 + i_12_);
					if (((Class98_Sub42) class98_sub42).anInt4216 < i)
						i_14_ += -((Class98_Sub42) class98_sub42).anInt4216 + i;
					else if ((((Class98_Sub42) class98_sub42).anInt4225 ^ 0xffffffff) < (i ^ 0xffffffff))
						i_14_ += ((Class98_Sub42) class98_sub42).anInt4225 + -i;
					if (((Class98_Sub42) class98_sub42).anInt4228 == 0
							|| (i_14_ + -256 > ((Class98_Sub42) class98_sub42).anInt4228)
							|| (((Class98_Sub27) Class98_Sub9.aClass98_Sub27_3856).aClass64_Sub22_4051
									.method641((byte) 120) ^ 0xffffffff) == -1
							|| (((Class98_Sub42) class98_sub42).anInt4220 ^ 0xffffffff) != (i_11_ ^ 0xffffffff)) {
						if ((((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232) != null) {
							Class81.aClass98_Sub31_Sub3_619
									.method1374(((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232);
							((Class98_Sub42) class98_sub42).aClass98_Sub24_Sub1_4214 = null;
							((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232 = null;
							((Class98_Sub42) class98_sub42).aClass98_Sub13_4213 = null;
						}
						if ((((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4230) != null) {
							Class81.aClass98_Sub31_Sub3_619
									.method1374(((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4230);
							((Class98_Sub42) class98_sub42).aClass98_Sub24_Sub1_4211 = null;
							((Class98_Sub42) class98_sub42).aClass98_Sub13_4231 = null;
							((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4230 = null;
						}
						break;
					}
					i_14_ -= i_10_;
					if (i_14_ < 0)
						i_14_ = 0;
					int i_16_ = (-((Class98_Sub42) class98_sub42).anInt4217 + ((Class98_Sub42) class98_sub42).anInt4228);
					if ((i_16_ ^ 0xffffffff) > -1)
						i_16_ = ((Class98_Sub42) class98_sub42).anInt4228;
					int i_17_ = i_15_;
					int i_18_ = i_14_
							- ((Class98_Sub42) class98_sub42).anInt4217;
					if ((i_18_ ^ 0xffffffff) < -1 && (i_16_ ^ 0xffffffff) < -1)
						i_17_ = i_15_ * (i_16_ - i_18_) / i_16_;
					Surface.player.method3034(i_10_
							+ -256);
					int i_19_ = 8192;
					int i_20_ = ((((Class98_Sub42) class98_sub42).anInt4229 + ((Class98_Sub42) class98_sub42).anInt4224) / 2 + -i_12_);
					int i_21_ = ((((Class98_Sub42) class98_sub42).anInt4225 + ((Class98_Sub42) class98_sub42).anInt4216) / 2 - i);
					if (i_20_ != 0 || (i_21_ ^ 0xffffffff) != -1) {
						int i_22_ = ((-4096 + (-Class186.anInt3424 + -(int) (2607.5945876176133 * Math
								.atan2((double) i_20_, (double) i_21_)))) & 0x3fff);
						if ((i_22_ ^ 0xffffffff) < -8193)
							i_22_ = 16384 + -i_22_;
						int i_23_;
						if ((i_14_ ^ 0xffffffff) >= -1)
							i_23_ = 8192;
						else if (i_14_ >= 4096)
							i_23_ = 16384;
						else
							i_23_ = 8192 - -(i_14_ * 8192 / 4096);
						i_19_ = ((16384 - i_23_ >> 461462369) + i_23_ * i_22_
								/ 8192);
					}
					if ((((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232) == null) {
						if (((Class98_Sub42) class98_sub42).anInt4210 >= 0) {
							int i_24_ = (((((Class98_Sub42) class98_sub42).anInt4237 != 256) || (((Class98_Sub42) class98_sub42).anInt4223) != 256) ? Class142
									.method2307(
											(((Class98_Sub42) class98_sub42).anInt4223),
											(((Class98_Sub42) class98_sub42).anInt4237),
											i_10_ + -347)
									: 256);
							if (!((Class98_Sub42) class98_sub42).aBoolean4215) {
								Class37 class37 = Class37
										.method342(
												(Class76_Sub2.aClass207_3733),
												(((Class98_Sub42) class98_sub42).anInt4210),
												0);
								if (class37 != null) {
									Class98_Sub24_Sub1 class98_sub24_sub1 = (class37
											.method344()
											.method1269(Class148.aClass314_1195));
									Class98_Sub31_Sub5 class98_sub31_sub5 = (Class98_Sub31_Sub5
											.method1402(class98_sub24_sub1,
													i_24_, i_17_ << -44812154,
													i_19_));
									class98_sub31_sub5.method1422(-1);
									Class81.aClass98_Sub31_Sub3_619
											.method1371(class98_sub31_sub5);
									((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232 = class98_sub31_sub5;
								}
							} else {
								if ((((Class98_Sub42) class98_sub42).aClass98_Sub13_4213) == null)
									((Class98_Sub42) class98_sub42).aClass98_Sub13_4213 = (Class98_Sub13
											.method1137(
													Class196.aClass207_1512,
													(((Class98_Sub42) class98_sub42).anInt4210)));
								if ((((Class98_Sub42) class98_sub42).aClass98_Sub13_4213) != null) {
									if ((((Class98_Sub42) class98_sub42).aClass98_Sub24_Sub1_4214) == null)
										((Class98_Sub42) class98_sub42).aClass98_Sub24_Sub1_4214 = (((Class98_Sub42) class98_sub42).aClass98_Sub13_4213
												.method1132(new int[] { 22050 }));
									if ((((Class98_Sub42) class98_sub42).aClass98_Sub24_Sub1_4214) != null) {
										Class98_Sub31_Sub5 class98_sub31_sub5 = (Class98_Sub31_Sub5
												.method1402(
														(((Class98_Sub42) class98_sub42).aClass98_Sub24_Sub1_4214),
														i_24_,
														i_17_ << -669300698,
														i_19_));
										class98_sub31_sub5.method1422(-1);
										Class81.aClass98_Sub31_Sub3_619
												.method1371(class98_sub31_sub5);
										((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232 = class98_sub31_sub5;
									}
								}
							}
						}
					} else {
						((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232
								.method1427(i_17_);
						((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232
								.method1431(i_19_);
					}
					if ((((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4230) == null) {
						if ((((Class98_Sub42) class98_sub42).anIntArray4208 != null)
								&& ((((Class98_Sub42) class98_sub42).anInt4221 -= i_13_) ^ 0xffffffff) >= -1) {
							int i_25_ = (((((Class98_Sub42) class98_sub42).anInt4237 != 256) || (((Class98_Sub42) class98_sub42).anInt4223) != 256) ? (((Class98_Sub42) class98_sub42).anInt4223 + (int) (Math
									.random() * (double) (-(((Class98_Sub42) class98_sub42).anInt4223) + (((Class98_Sub42) class98_sub42).anInt4237))))
									: 256);
							if (((Class98_Sub42) class98_sub42).aBoolean4226) {
								if ((((Class98_Sub42) class98_sub42).aClass98_Sub13_4231) == null) {
									int i_26_ = (int) (Math.random() * (double) (((Class98_Sub42) class98_sub42).anIntArray4208).length);
									((Class98_Sub42) class98_sub42).aClass98_Sub13_4231 = (Class98_Sub13
											.method1137(
													Class196.aClass207_1512,
													(((Class98_Sub42) class98_sub42).anIntArray4208[i_26_])));
								}
								if ((((Class98_Sub42) class98_sub42).aClass98_Sub13_4231) != null) {
									if ((((Class98_Sub42) class98_sub42).aClass98_Sub24_Sub1_4211) == null)
										((Class98_Sub42) class98_sub42).aClass98_Sub24_Sub1_4211 = (((Class98_Sub42) class98_sub42).aClass98_Sub13_4231
												.method1132(new int[] { 22050 }));
									if ((((Class98_Sub42) class98_sub42).aClass98_Sub24_Sub1_4211) != null) {
										Class98_Sub31_Sub5 class98_sub31_sub5 = (Class98_Sub31_Sub5
												.method1402(
														(((Class98_Sub42) class98_sub42).aClass98_Sub24_Sub1_4211),
														i_25_,
														i_17_ << -1521283386,
														i_19_));
										class98_sub31_sub5.method1422(0);
										Class81.aClass98_Sub31_Sub3_619
												.method1371(class98_sub31_sub5);
										((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4230 = class98_sub31_sub5;
										((Class98_Sub42) class98_sub42).anInt4221 = ((int) (Math
												.random() * (double) (-(((Class98_Sub42) class98_sub42).anInt4219) + (((Class98_Sub42) class98_sub42).anInt4205))) + ((Class98_Sub42) class98_sub42).anInt4219);
									}
								}
							} else {
								int i_27_ = (int) (Math.random() * (double) (((Class98_Sub42) class98_sub42).anIntArray4208).length);
								Class37 class37 = Class37
										.method342(
												(Class76_Sub2.aClass207_3733),
												(((Class98_Sub42) class98_sub42).anIntArray4208[i_27_]),
												0);
								if (class37 == null)
									break;
								Class98_Sub24_Sub1 class98_sub24_sub1 = class37
										.method344().method1269(
												Class148.aClass314_1195);
								Class98_Sub31_Sub5 class98_sub31_sub5 = (Class98_Sub31_Sub5
										.method1402(class98_sub24_sub1, i_25_,
												i_17_ << 1722792038, i_19_));
								class98_sub31_sub5.method1422(0);
								Class81.aClass98_Sub31_Sub3_619
										.method1371(class98_sub31_sub5);
								((Class98_Sub42) class98_sub42).anInt4221 = ((int) ((double) (-(((Class98_Sub42) class98_sub42).anInt4219) + (((Class98_Sub42) class98_sub42).anInt4205)) * Math
										.random()) + (((Class98_Sub42) class98_sub42).anInt4219));
								((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4230 = class98_sub31_sub5;
							}
							break;
						}
					} else {
						((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4230
								.method1427(i_17_);
						((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4230
								.method1431(i_19_);
						if (((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4230
								.method941((byte) 78))
							break while_164_;
						((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4230 = null;
						((Class98_Sub42) class98_sub42).aClass98_Sub13_4231 = null;
						((Class98_Sub42) class98_sub42).aClass98_Sub24_Sub1_4211 = null;
					}
				} catch (RuntimeException runtimeexception) {
					throw Class64_Sub27
							.printError(runtimeexception,
									("rh.F("
											+ i
											+ ','
											+ i_10_
											+ ','
											+ i_11_
											+ ','
											+ i_12_
											+ ','
											+ i_13_
											+ ','
											+ (class98_sub42 != null ? "{...}"
													: "null") + ')'));
				}
			} while (false);
			break;
		} while (false);
	}

	public static void method3329(int i) {
		try {
			aClass148_2108 = null;
			aRectangleArray2106 = null;
			aClass164_2101 = null;
			if (i > -120)
				method3327(-15, null, (byte) -55);
			aClass113_2111 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rh.C(" + i + ')');
		}
	}

	static final void method3330(int i) {
		try {
			synchronized (Class211.aClass79_1594) {
				if (i != 1)
					aClass148_2108 = null;
				Class211.aClass79_1594.method794(i + 30);
			}
			synchronized (PlayerUpdate.aClass79_3411) {
				PlayerUpdate.aClass79_3411.method794(16);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rh.B(" + i + ')');
		}
	}

	Class280(int i, Class207 class207, Class207 class207_28_,
			Interface1 interface1) {
		((Class280) this).anInt2102 = 0;
		aClass79_2107 = new Class79(64);
		anInterface1_2110 = null;
		do {
			try {
				aClass207_2109 = class207;
				anInterface1_2110 = interface1;
				aClass207_2104 = class207_28_;
				if (aClass207_2109 != null)
					((Class280) this).anInt2102 = aClass207_2109.method2761(0,
							1);
				if (aClass207_2104 == null)
					break;
				((Class280) this).anInt2103 = aClass207_2104.method2761(0, 1);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("rh.<init>("
						+ i + ',' + (class207 != null ? "{...}" : "null") + ','
						+ (class207_28_ != null ? "{...}" : "null") + ','
						+ (interface1 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		anInt2105 = 1;
		aClass148_2108 = new Class148();
		aLong2112 = 1L;
		aClass113_2111 = new Class113(5, 1);
	}
}
