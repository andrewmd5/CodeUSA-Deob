/* Class246_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub9 extends Class246 {
	Surface aClass87_5131;
	Class92 aClass92_5132;
	Class246_Sub5 aClass246_Sub5_5133;
	private long aLong5134;
	int anInt5135;
	Class216 aClass216_5136;
	private int anInt5137;
	static Class79 aClass79_5138;
	boolean aBoolean5139 = false;
	Class218 aClass218_5140;
	static int[][] anIntArrayArray5141 = { { 0, 2, 4, 6 },
			{ 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 },
			{ 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 },
			{ 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 },
			{ 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
	private Class216 aClass216_5142;
	private int anInt5143;
	private int anInt5144;
	private int anInt5145;
	private int anInt5146;
	private int anInt5147;
	private int anInt5148;
	private int anInt5149;
	private boolean aBoolean5150;

	final void method3134(long l, ha var_ha, byte i) {
		try {
			int i_0_ = 64 % ((i - -63) / 41);
			for (Class246_Sub4_Sub2_Sub1 class246_sub4_sub2_sub1 = (Class246_Sub4_Sub2_Sub1) ((Class246_Sub9) this).aClass218_5140
					.method2803((byte) 15); class246_sub4_sub2_sub1 != null; class246_sub4_sub2_sub1 = (Class246_Sub4_Sub2_Sub1) ((Class246_Sub9) this).aClass218_5140
					.method2809(false))
				class246_sub4_sub2_sub1.method3111(var_ha, l);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qba.C(" + l + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method3135(ha var_ha, boolean bool, long l, int i, int i_1_) {
		try {
			if (!((Class246_Sub9) this).aBoolean5139) {
				if (((Class92) ((Class246_Sub9) this).aClass92_5132).anInt752 <= Class337_Sub1.anInt5497) {
					if (Class337.anIntArray3536[Class337_Sub1.anInt5497] < Class237_Sub1.anInt5047)
						bool = false;
					else if (aBoolean5150)
						bool = false;
					else if (((((Class92) ((Class246_Sub9) this).aClass92_5132).anInt762) ^ 0xffffffff) != 0) {
						int i_2_ = (int) (-aLong5134 + l);
						if (!(((Class92) ((Class246_Sub9) this).aClass92_5132).aBoolean783)
								&& ((i_2_ ^ 0xffffffff) < (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt762 ^ 0xffffffff)))
							bool = false;
						else
							i_2_ %= ((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt762;
						if (!(((Class92) ((Class246_Sub9) this).aClass92_5132).aBoolean732)
								&& i_2_ < ((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt746)
							bool = false;
						if ((((Class92) ((Class246_Sub9) this).aClass92_5132).aBoolean732)
								&& (((Class92) ((Class246_Sub9) this).aClass92_5132).anInt746 ^ 0xffffffff) >= (i_2_ ^ 0xffffffff))
							bool = false;
					}
				} else
					bool = false;
			} else
				bool = false;
			if (bool) {
				Class246_Sub3_Sub1_Sub2.anInt6252++;
				int i_3_ = (((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1619)
						+ (((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1624) - -(((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1623)) / 3);
				int i_4_ = (((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1620)
						+ (((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1627) - -(((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1625)) / 3);
				int i_5_ = (((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1626) + ((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1629) - -((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1628)) / 3);
				if (((i_3_ ^ 0xffffffff) != ((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1617) ^ 0xffffffff))
						|| i_4_ != ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1618
						|| (((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1621) != i_5_) {
					((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1617 = i_3_;
					((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1618 = i_4_;
					((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1621 = i_5_;
					int i_6_ = ((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1624) - ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1619);
					int i_7_ = ((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1627) + -((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1620);
					int i_8_ = ((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1628) + -((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1629);
					int i_9_ = (-(((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1619) + ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1623);
					int i_10_ = (-(((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1620) + ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1625);
					int i_11_ = (-(((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1629) + ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1626);
					anInt5144 = -(i_9_ * i_7_) + i_10_ * i_6_;
					anInt5146 = -(i_8_ * i_10_) + i_7_ * i_11_;
					for (anInt5143 = i_8_ * i_9_ - i_6_ * i_11_; ((anInt5146 ^ 0xffffffff) < -32768
							|| (anInt5143 ^ 0xffffffff) < -32768
							|| anInt5144 > 32767
							|| (anInt5146 ^ 0xffffffff) > 32766
							|| (anInt5143 ^ 0xffffffff) > 32766 || anInt5144 < -32767); anInt5143 >>= 1) {
						anInt5144 >>= 1;
						anInt5146 >>= 1;
					}
					int i_12_ = (int) Math
							.sqrt((double) (anInt5144 * anInt5144 + anInt5146
									* anInt5146 - -(anInt5143 * anInt5143)));
					if ((i_12_ ^ 0xffffffff) >= -1)
						i_12_ = 1;
					anInt5144 = 32767 * anInt5144 / i_12_;
					anInt5143 = anInt5143 * 32767 / i_12_;
					anInt5146 = anInt5146 * 32767 / i_12_;
					if ((((Class92) ((Class246_Sub9) this).aClass92_5132).aShort786) > 0
							|| (((Class92) ((Class246_Sub9) this).aClass92_5132).aShort754) > 0) {
						int i_13_ = (int) (2607.5945876176133 * Math.atan2(
								(double) anInt5144, (double) anInt5146));
						int i_14_ = (int) ((Math
								.atan2((double) anInt5143,
										Math.sqrt((double) ((anInt5144 * anInt5144) + (anInt5146 * anInt5146))))) * 2607.5945876176133);
						anInt5148 = (-((Class92) (((Class246_Sub9) this).aClass92_5132)).aShort747 + ((Class92) (((Class246_Sub9) this).aClass92_5132)).aShort786);
						anInt5149 = (i_13_
								- -((Class92) (((Class246_Sub9) this).aClass92_5132)).aShort747 + -(anInt5148 >> 1768988289));
						anInt5145 = (((Class92) (((Class246_Sub9) this).aClass92_5132)).aShort754 - ((Class92) (((Class246_Sub9) this).aClass92_5132)).aShort763);
						anInt5147 = (((Class92) (((Class246_Sub9) this).aClass92_5132)).aShort763 + (i_14_ + -(anInt5145 >> 981292577)));
					}
				}
				anInt5137 += (int) ((double) i_1_ * ((Math.random() * (double) ((((Class92) ((Class246_Sub9) this).aClass92_5132).anInt790) + -((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt750)) + (double) (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt750)));
				if ((anInt5137 ^ 0xffffffff) < -64) {
					int i_15_ = anInt5137 >> 759811430;
					anInt5137 &= 0x3f;
					for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_16_++) {
						int i_17_;
						int i_18_;
						int i_19_;
						if ((((Class92) ((Class246_Sub9) this).aClass92_5132).aShort786) > 0
								|| ((Class92) (((Class246_Sub9) this).aClass92_5132)).aShort754 > 0) {
							int i_20_ = ((int) (Math.random() * (double) anInt5148) + anInt5149);
							i_20_ &= 0x3fff;
							int i_21_ = Class284_Sub2_Sub2.anIntArray6200[i_20_];
							int i_22_ = Class284_Sub2_Sub2.anIntArray6202[i_20_];
							int i_23_ = ((int) ((double) anInt5145 * Math
									.random()) + anInt5147);
							i_23_ &= 0x1fff;
							int i_24_ = Class284_Sub2_Sub2.anIntArray6200[i_23_];
							int i_25_ = Class284_Sub2_Sub2.anIntArray6202[i_23_];
							int i_26_ = 13;
							i_17_ = i_22_ * i_24_ >> i_26_;
							i_18_ = (i_25_ << 515344801) * -1;
							i_19_ = i_21_ * i_24_ >> i_26_;
						} else {
							i_17_ = anInt5146;
							i_18_ = anInt5143;
							i_19_ = anInt5144;
						}
						float f = (float) Math.random();
						float f_27_ = (float) Math.random();
						if (f + f_27_ > 1.0F) {
							f = 1.0F - f;
							f_27_ = -f_27_ + 1.0F;
						}
						float f_28_ = 1.0F - (f_27_ + f);
						int i_29_ = (int) ((float) (((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1624)
								* f_27_
								+ (float) (((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1619)
								* f + (float) (((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1623)
								* f_28_);
						int i_30_ = (int) (f_28_
								* (float) (((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1625) + (((float) ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1620 * f) + (f_27_ * (float) (((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1627))));
						int i_31_ = (int) (((float) ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1626 * f_28_) + (((float) ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1629 * f) + (float) (((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1628)
								* f_27_));
						int i_32_ = (int) ((float) (((Class216) aClass216_5142).anInt1619)
								* f
								+ f_27_
								* (float) (((Class216) aClass216_5142).anInt1624) + f_28_
								* (float) (((Class216) aClass216_5142).anInt1623));
						int i_33_ = (int) (f_28_
								* (float) ((Class216) aClass216_5142).anInt1625 + ((float) (((Class216) aClass216_5142).anInt1627)
								* f_27_ + (float) (((Class216) aClass216_5142).anInt1620)
								* f));
						int i_34_ = (int) (f_27_
								* (float) ((Class216) aClass216_5142).anInt1628
								+ f
								* (float) (((Class216) aClass216_5142).anInt1629) + (float) (((Class216) aClass216_5142).anInt1626)
								* f_28_);
						int i_35_ = -i_32_ + i_29_;
						int i_36_ = -i_33_ + i_30_;
						int i_37_ = i_31_ + -i_34_;
						int i_38_ = (int) ((double) i_35_ * Math.random() + (double) i_32_);
						int i_39_ = (int) ((double) i_33_ + (double) i_36_
								* Math.random());
						int i_40_ = (int) ((double) i_34_ + Math.random()
								* (double) i_37_);
						int i_41_ = ((int) (Math.random() * (double) (-((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt770 + (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt731))) + ((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt770);
						int i_42_ = ((int) (Math.random() * (double) (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt787 - (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt766))) + ((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt766);
						int i_43_ = (((Class92) ((Class246_Sub9) this).aClass92_5132).anInt780 - -(int) (Math
								.random() * (double) ((((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt788) - (((Class92) ((Class246_Sub9) this).aClass92_5132).anInt780))));
						int i_44_;
						if (!((Class92) ((Class246_Sub9) this).aClass92_5132).aBoolean759)
							i_44_ = (((int) ((Math.random() * (double) (((Class92) ((Class246_Sub9) this).aClass92_5132).anInt765)) + (double) (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt756)) << -1210811208) | (((int) ((double) (((Class92) ((Class246_Sub9) this).aClass92_5132).anInt741) + (Math
									.random() * (double) (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt730))) << -752155600)
									| ((int) ((Math.random() * (double) (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt734)) + (double) (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt757)) << 891035144) | (int) ((double) (((Class92) ((Class246_Sub9) this).aClass92_5132).anInt771) + ((double) (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt737) * Math
									.random()))));
						else {
							double d = Math.random();
							i_44_ = (((int) ((double) ((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt741 + d
									* (double) (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt730)) << 1742099248)
									| ((int) ((double) (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt734)
											* d + (double) (((Class92) ((Class246_Sub9) this).aClass92_5132).anInt757)) << -1937900184)
									| (int) (d
											* (double) (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt737) + (double) (((Class92) ((Class246_Sub9) this).aClass92_5132).anInt771)) | ((int) ((Math
									.random() * (double) (((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt765)) + (double) (((Class92) ((Class246_Sub9) this).aClass92_5132).anInt756)) << -1050005608));
						}
						int i_45_ = (((Class92) ((Class246_Sub9) this).aClass92_5132).anInt729);
						if (!var_ha.method1780()
								&& !((Class92) (((Class246_Sub9) this).aClass92_5132)).aBoolean791)
							i_45_ = -1;
						if ((Class351.anInt2922 ^ 0xffffffff) != (Class361.anInt3089 ^ 0xffffffff)) {
							Class246_Sub4_Sub2_Sub1 class246_sub4_sub2_sub1 = (Class185.aClass246_Sub4_Sub2_Sub1Array1445[Class351.anInt2922]);
							Class351.anInt2922 = Class351.anInt2922 + 1 & 0x3ff;
							class246_sub4_sub2_sub1
									.method3112(
											this,
											i_38_,
											i_39_,
											i_40_,
											i_17_,
											i_18_,
											i_19_,
											i_41_,
											i_42_,
											i_44_,
											i_43_,
											i_45_,
											((Class92) (((Class246_Sub9) this).aClass92_5132)).aBoolean753,
											((Class92) (((Class246_Sub9) this).aClass92_5132)).aBoolean778);
						} else {
							Class246_Sub4_Sub2_Sub1 class246_sub4_sub2_sub1 = (new Class246_Sub4_Sub2_Sub1(
									this,
									i_38_,
									i_39_,
									i_40_,
									i_17_,
									i_18_,
									i_19_,
									i_41_,
									i_42_,
									i_44_,
									i_43_,
									i_45_,
									((Class92) (((Class246_Sub9) this).aClass92_5132)).aBoolean753,
									((Class92) (((Class246_Sub9) this).aClass92_5132)).aBoolean778));
						}
					}
				}
			}
			if (!((Class246_Sub9) this).aClass216_5136.method2795(
					aClass216_5142, true)) {
				Class216 class216 = aClass216_5142;
				aClass216_5142 = ((Class246_Sub9) this).aClass216_5136;
				((Class246_Sub9) this).aClass216_5136 = class216;
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1620 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt668);
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1626 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt662);
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1621 = ((Class216) aClass216_5142).anInt1621;
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1623 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt659);
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1619 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt670);
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1628 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt656);
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1629 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt671);
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1627 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt664);
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1617 = ((Class216) aClass216_5142).anInt1617;
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1625 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt669);
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1618 = ((Class216) aClass216_5142).anInt1618;
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1624 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt663);
			}
			if (i == -64) {
				((Class246_Sub9) this).anInt5135 = 0;
				for (Class246_Sub4_Sub2_Sub1 class246_sub4_sub2_sub1 = ((Class246_Sub4_Sub2_Sub1) ((Class246_Sub9) this).aClass218_5140
						.method2803((byte) 15)); class246_sub4_sub2_sub1 != null; class246_sub4_sub2_sub1 = (Class246_Sub4_Sub2_Sub1) ((Class246_Sub9) this).aClass218_5140
						.method2809(false)) {
					class246_sub4_sub2_sub1.method3109(l, i_1_);
					((Class246_Sub9) this).anInt5135++;
				}
				Class113.anInt952 += ((Class246_Sub9) this).anInt5135;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qba.F("
					+ (var_ha != null ? "{...}" : "null") + ',' + bool + ','
					+ l + ',' + i + ',' + i_1_ + ')'));
		}
	}

	static final Class42_Sub1_Sub1 method3136(ha_Sub1 var_ha_Sub1,
			boolean bool, int[] is, int i, byte i_46_, int i_47_, int i_48_,
			int i_49_) {
		try {
			if (i_46_ != 120)
				return null;
			if (!((ha_Sub1) var_ha_Sub1).aBoolean4426
					&& (!Class81.method815(i, i_46_ + -120) || !Class81
							.method815(i_49_, i_46_ + -120))) {
				if (((ha_Sub1) var_ha_Sub1).aBoolean4378)
					return new Class42_Sub1_Sub1(var_ha_Sub1, 34037, i, i_49_,
							bool, is, i_47_, i_48_);
				return new Class42_Sub1_Sub1(var_ha_Sub1, i, i_49_,
						Class48.method453(423660257, i), Class48.method453(
								423660257, i_49_), is);
			}
			return new Class42_Sub1_Sub1(var_ha_Sub1, 3553, i, i_49_, bool, is,
					i_47_, i_48_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qba.B("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + bool
					+ ',' + (is != null ? "{...}" : "null") + ',' + i + ','
					+ i_46_ + ',' + i_47_ + ',' + i_48_ + ',' + i_49_ + ')'));
		}
	}

	public static void method3137(int i) {
		try {
			if (i == -6086) {
				aClass79_5138 = null;
				anIntArrayArray5141 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qba.A(" + i + ')');
		}
	}

	final void method3138(int i) {
		do {
			try {
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1629 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt671);
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1624 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt663);
				((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1626 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt662);
				if (i == -1) {
					((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1620 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt668);
					((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1619 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt670);
					((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1627 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt664);
					((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1625 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt669);
					((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1623 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt659);
					((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1628 = (((Surface) ((Class246_Sub9) this).aClass87_5131).anInt656);
					if (((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1624) == (((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1619))
							&& ((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1623) == ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1624)
							&& ((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1627) == ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1620)
							&& ((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1627 ^ 0xffffffff) == (((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1625 ^ 0xffffffff))
							&& ((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1628 ^ 0xffffffff) == (((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1629 ^ 0xffffffff))
							&& ((((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1626) == ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1628))
						aBoolean5150 = true;
					else {
						if (!aBoolean5150)
							break;
						((Class216) aClass216_5142).anInt1623 = ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1623;
						((Class216) aClass216_5142).anInt1625 = ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1625;
						((Class216) aClass216_5142).anInt1624 = ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1624;
						((Class216) aClass216_5142).anInt1620 = ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1620;
						((Class216) aClass216_5142).anInt1629 = ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1629;
						((Class216) aClass216_5142).anInt1627 = ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1627;
						((Class216) aClass216_5142).anInt1626 = ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1626;
						((Class216) aClass216_5142).anInt1619 = ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1619;
						((Class216) aClass216_5142).anInt1628 = ((Class216) (((Class246_Sub9) this).aClass216_5136)).anInt1628;
						aBoolean5150 = false;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "qba.E(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final Class293 method3139(byte i, int i_50_, int i_51_) {
		try {
			Class293 class293 = Class159.method2509(i_50_, -9820);
			if (i != 72)
				anIntArrayArray5141 = null;
			if (i_51_ == -1)
				return class293;
			if (class293 == null
					|| ((Class293) class293).aClass293Array2339 == null
					|| ((i_51_ ^ 0xffffffff) <= (((Class293) class293).aClass293Array2339.length ^ 0xffffffff)))
				return null;
			return ((Class293) class293).aClass293Array2339[i_51_];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qba.D(" + i + ','
					+ i_50_ + ',' + i_51_ + ')'));
		}
	}

	Class246_Sub9(ha var_ha, Surface surface, Class246_Sub5 class246_sub5,
			long l) {
		anInt5137 = 0;
		((Class246_Sub9) this).aClass216_5136 = new Class216();
		aClass216_5142 = new Class216();
		aBoolean5150 = false;
		try {
			((Class246_Sub9) this).aClass246_Sub5_5133 = class246_sub5;
			((Class246_Sub9) this).aClass87_5131 = surface;
			aLong5134 = l;
			((Class246_Sub9) this).aClass92_5132 = ((Class246_Sub9) this).aClass87_5131
					.method856(0);
			if (!var_ha.method1780()
					&& (((Class92) ((Class246_Sub9) this).aClass92_5132).anInt764 != -1))
				((Class246_Sub9) this).aClass92_5132 = Class98_Sub45
						.method1520(
								((Class92) (((Class246_Sub9) this).aClass92_5132)).anInt764,
								14883);
			((Class246_Sub9) this).aClass218_5140 = new Class218();
			anInt5137 += 64.0 * Math.random();
			method3138(-1);
			((Class216) aClass216_5142).anInt1620 = ((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1620;
			((Class216) aClass216_5142).anInt1619 = ((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1619;
			((Class216) aClass216_5142).anInt1629 = ((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1629;
			((Class216) aClass216_5142).anInt1625 = ((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1625;
			((Class216) aClass216_5142).anInt1627 = ((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1627;
			((Class216) aClass216_5142).anInt1623 = ((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1623;
			((Class216) aClass216_5142).anInt1624 = ((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1624;
			((Class216) aClass216_5142).anInt1626 = ((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1626;
			((Class216) aClass216_5142).anInt1628 = ((Class216) ((Class246_Sub9) this).aClass216_5136).anInt1628;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("qba.<init>(" + (var_ha != null ? "{...}" : "null") + ','
							+ (surface != null ? "{...}" : "null") + ','
							+ (class246_sub5 != null ? "{...}" : "null") + ','
							+ l + ')'));
		}
	}

	static {
		aClass79_5138 = new Class79(64);
	}
}
