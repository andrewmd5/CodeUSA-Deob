/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class207 {
	static Class348 aClass348_1569 = new Class348(13, 0, 1, 0);
	private boolean aBoolean1570;
	private ReferenceTable aClass312_1571 = null;
	private Object[] anObjectArray1572;
	private Object[][] anObjectArrayArray1573;
	private Class339 aClass339_1574;
	int anInt1575;
	static IncomingOpcode aClass58_1576 = new IncomingOpcode(92, 16);
	static int anInt1577;
	static Class196 aClass196_1578 = new Class196("WTWIP", "office", "_wip", 3);

	final boolean method2728(String string, final int i) {
		try {
			if (!method2738((byte) -123)) {
				return false;
			}
			string = string.toLowerCase();
			final int i_0_ = (aClass312_1571.aClass122_2666.method2200(
					(byte) -26, Class305.method3580(string, false)));
			if (i > i_0_) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.S("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final boolean method2729(final int[] is, final int i,
			final byte i_1_, final int i_2_) {
		try {
			if (!method2758(i_2_, false)) {
				return false;
			}
			if (anObjectArray1572[i_2_] == null) {
				return false;
			}
			final int i_3_ = aClass312_1571.anIntArray2670[i_2_];
			final int[] is_4_ = aClass312_1571.anIntArrayArray2669[i_2_];
			if (anObjectArrayArray1573[i_2_] == null) {
				anObjectArrayArray1573[i_2_] = (new Object[aClass312_1571.anIntArray2671[i_2_]]);
			}
			final Object[] objects = anObjectArrayArray1573[i_2_];
			boolean bool = true;
			if (i_1_ >= -62) {
				method2728(null, 43);
			}
			for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_5_++) {
				int i_6_;
				if (is_4_ == null) {
					i_6_ = i_5_;
				} else {
					i_6_ = is_4_[i_5_];
				}
				if (objects[i_6_] == null) {
					bool = false;
					break;
				}
			}
			if (bool) {
				return true;
			}
			byte[] is_7_;
			if (is != null
					&& ((is[0] ^ 0xffffffff) != -1
							|| (is[1] ^ 0xffffffff) != -1
							|| (is[2] ^ 0xffffffff) != -1 || is[3] != 0)) {
				is_7_ = Class98_Sub28_Sub1.method1310(false,
						anObjectArray1572[i_2_], true);
				final ByteBuffer class98_sub22 = new ByteBuffer(is_7_);
				class98_sub22.method1215(is, 5,
						(class98_sub22.aByteArray3992).length, (byte) 30);
			} else {
				is_7_ = Class98_Sub28_Sub1.method1310(false,
						anObjectArray1572[i_2_], false);
			}
			byte[] is_8_;
			try {
				is_8_ = Class98_Sub46_Sub10.method1571(is_7_, (byte) -84);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27
						.method667(
								runtimeexception,
								("T3 - "
										+ (is != null)
										+ ","
										+ i_2_
										+ ","
										+ is_7_.length
										+ ","
										+ Class31.method309(is_7_.length,
												is_7_, -30091)
										+ ","
										+ Class31.method309(-2 + is_7_.length,
												is_7_, -30091) + ","
										+ aClass312_1571.anIntArray2673[i_2_]
										+ "," + aClass312_1571.anInt2677));
			}
			if (aBoolean1570) {
				anObjectArray1572[i_2_] = null;
			}
			if ((i_3_ ^ 0xffffffff) >= -2) {
				int i_9_;
				if (is_4_ == null) {
					i_9_ = 0;
				} else {
					i_9_ = is_4_[0];
				}
				if ((anInt1575 ^ 0xffffffff) != -1) {
					objects[i_9_] = is_8_;
				} else {
					objects[i_9_] = Class64_Sub25.method654(2, is_8_, false);
				}
			} else if (anInt1575 != 2) {
				int i_10_ = is_8_.length;
				final int i_11_ = is_8_[--i_10_] & 0xff;
				i_10_ -= 4 * i_11_ * i_3_;
				final ByteBuffer class98_sub22 = new ByteBuffer(is_8_);
				class98_sub22.position = i_10_;
				final int[] is_12_ = new int[i_3_];
				for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff); i_13_++) {
					int i_14_ = 0;
					for (int i_15_ = 0; (i_3_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
						i_14_ += class98_sub22.readInt(-2);
						is_12_[i_15_] += i_14_;
					}
				}
				final byte[][] is_16_ = new byte[i_3_][];
				for (int i_17_ = 0; i_17_ < i_3_; i_17_++) {
					is_16_[i_17_] = new byte[is_12_[i_17_]];
					is_12_[i_17_] = 0;
				}
				class98_sub22.position = i_10_;
				int i_18_ = 0;
				for (int i_19_ = 0; i_19_ < i_11_; i_19_++) {
					int i_20_ = 0;
					for (int i_21_ = 0; i_21_ < i_3_; i_21_++) {
						i_20_ += class98_sub22.readInt(-2);
						Class236.method2894(is_8_, i_18_, is_16_[i_21_],
								is_12_[i_21_], i_20_);
						i_18_ += i_20_;
						is_12_[i_21_] += i_20_;
					}
				}
				for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_22_++) {
					int i_23_;
					if (is_4_ == null) {
						i_23_ = i_22_;
					} else {
						i_23_ = is_4_[i_22_];
					}
					if ((anInt1575 ^ 0xffffffff) != -1) {
						objects[i_23_] = is_16_[i_22_];
					} else {
						objects[i_23_] = Class64_Sub25.method654(2,
								is_16_[i_22_], false);
					}
				}
			} else {
				int i_24_ = is_8_.length;
				final int i_25_ = is_8_[--i_24_] & 0xff;
				i_24_ -= 4 * i_25_ * i_3_;
				final ByteBuffer class98_sub22 = new ByteBuffer(is_8_);
				int i_26_ = 0;
				class98_sub22.position = i_24_;
				int i_27_ = 0;
				for (int i_28_ = 0; i_25_ > i_28_; i_28_++) {
					int i_29_ = 0;
					for (int i_30_ = 0; i_30_ < i_3_; i_30_++) {
						i_29_ += class98_sub22.readInt(-2);
						int i_31_;
						if (is_4_ != null) {
							i_31_ = is_4_[i_30_];
						} else {
							i_31_ = i_30_;
						}
						if (i_31_ == i) {
							i_26_ += i_29_;
							i_27_ = i_31_;
						}
					}
				}
				if ((i_26_ ^ 0xffffffff) == -1) {
					return true;
				}
				final byte[] is_32_ = new byte[i_26_];
				class98_sub22.position = i_24_;
				i_26_ = 0;
				int i_33_ = 0;
				for (int i_34_ = 0; i_34_ < i_25_; i_34_++) {
					int i_35_ = 0;
					for (int i_36_ = 0; i_36_ < i_3_; i_36_++) {
						i_35_ += class98_sub22.readInt(-2);
						int i_37_;
						if (is_4_ != null) {
							i_37_ = is_4_[i_36_];
						} else {
							i_37_ = i_36_;
						}
						if (i == i_37_) {
							Class236.method2894(is_8_, i_33_, is_32_, i_26_,
									i_35_);
							i_26_ += i_35_;
						}
						i_33_ += i_35_;
					}
				}
				objects[i_27_] = is_32_;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.F("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_1_
					+ ',' + i_2_ + ')'));
		}
	}

	final boolean method2730(final byte i) {
		try {
			if (i <= 8) {
				anInt1577 = 40;
			}
			if (!method2738((byte) -127)) {
				return false;
			}
			boolean bool = true;
			for (int i_38_ = 0; aClass312_1571.anIntArray2664.length > i_38_; i_38_++) {
				final int i_39_ = aClass312_1571.anIntArray2664[i_38_];
				if (anObjectArray1572[i_39_] == null) {
					method2749(i_39_, 126);
					if (anObjectArray1572[i_39_] == null) {
						bool = false;
					}
				}
			}
			return bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.PA(" + i + ')');
		}
	}

	private final boolean method2731(final int i, final int i_40_,
			final int i_41_) {
		try {
			if (!method2738((byte) -124)) {
				return false;
			}
			if (i_40_ < i || i_41_ < 0
					|| i_40_ >= aClass312_1571.anIntArray2671.length
					|| (i_41_ >= aClass312_1571.anIntArray2671[i_40_])) {
				if (Class94.aBoolean797) {
					throw new IllegalArgumentException(String.valueOf(i_40_)
							+ "," + i_41_);
				}
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.HA(" + i + ','
					+ i_40_ + ',' + i_41_ + ')'));
		}
	}

	private final void method2732(final int i, final int i_42_) {
		do {
			try {
				aClass339_1574.method3785(i, false);
				if (i_42_ == 32768) {
					break;
				}
				anInt1577 = -87;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ni.IA(" + i
						+ ',' + i_42_ + ')'));
			}
			break;
		} while (false);
	}

	final byte[] method2733(final int i, final int i_43_) {
		try {
			if (!method2738((byte) -123)) {
				return null;
			}
			if ((aClass312_1571.anIntArray2671.length ^ 0xffffffff) == -2) {
				return method2745(i, 0, false);
			}
			if (!method2758(i, false)) {
				return null;
			}
			if (aClass312_1571.anIntArray2671[i] == 1) {
				return method2745(0, i, false);
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.NA(" + i + ','
					+ i_43_ + ')');
		}
	}

	final boolean method2734(final String string, final boolean bool) {
		try {
			if (bool != false) {
				anObjectArrayArray1573 = null;
			}
			final int i = method2750((byte) -60, "");
			if ((i ^ 0xffffffff) != 0) {
				return method2744("", string, 1);
			}
			return method2744(string, "", 1);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.MA("
					+ (string != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final int method2735(final byte i) {
		try {
			if (i > -2) {
				method2731(-36, -101, 7);
			}
			if (!method2738((byte) -124)) {
				throw new IllegalStateException("");
			}
			return aClass312_1571.anInt2677;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.DA(" + i + ')');
		}
	}

	final byte[] method2736(final int[] is, final int i, final int i_45_,
			final int modelId) {
		try {
			if (!method2731(0, modelId, i_45_)) {

				return null;
			}
			if (anObjectArrayArray1573[modelId] == null
					|| anObjectArrayArray1573[modelId][i_45_] == null) {
				boolean bool = method2729(is, i_45_, (byte) -66, modelId);
				if (!bool) {
					method2749(modelId, 103);
					bool = method2729(is, i_45_, (byte) -95, modelId);
					if (!bool) {
						return null;
					}
				}
			}
			final byte[] is_47_ = Class98_Sub28_Sub1.method1310(false,
					(anObjectArrayArray1573[modelId][i_45_]), false);
			do {
				if (anInt1575 == 1) {
					anObjectArrayArray1573[modelId][i_45_] = null;
					if (aClass312_1571.anIntArray2671[modelId] != 1) {
						break;
					}
					anObjectArrayArray1573[modelId] = null;
					if (!client.aBoolean3553) {
						break;
					}
				}
				if (anInt1575 == 2) {
					anObjectArrayArray1573[modelId] = null;
				}
			} while (false);
			if (i != 5) {

				return null;
			}
			return is_47_;
		} catch (final RuntimeException runtimeexception) {

			throw Class64_Sub27.method667(runtimeexception, ("ni.M("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_45_
					+ ',' + modelId + ')'));
		}
	}

	final boolean method2737(final boolean bool, String string,
			String string_48_) {
		try {
			if (!method2738((byte) -127)) {
				return false;
			}
			if (bool != true) {
				return false;
			}
			string_48_ = string_48_.toLowerCase();
			string = string.toLowerCase();
			final int i = (aClass312_1571.aClass122_2666.method2200((byte) -26,
					Class305.method3580(string_48_, !bool)));
			if ((i ^ 0xffffffff) > -1) {
				return false;
			}
			final int i_49_ = (aClass312_1571.aClass122Array2672[i].method2200(
					(byte) -26, Class305.method3580(string, false)));
			if ((i_49_ ^ 0xffffffff) > -1) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.GA(" + bool
					+ ',' + (string != null ? "{...}" : "null") + ','
					+ (string_48_ != null ? "{...}" : "null") + ')'));
		}
	}

	private final boolean method2738(final byte i) {
		try {
			if (i > -122) {
				anObjectArray1572 = null;
			}
			if (aClass312_1571 == null) {
				aClass312_1571 = aClass339_1574.method3784((byte) -124);
				if (aClass312_1571 == null) {
					return false;
				}
				anObjectArrayArray1573 = new Object[aClass312_1571.anInt2668][];
				anObjectArray1572 = new Object[aClass312_1571.anInt2668];
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.H(" + i + ')');
		}
	}

	final byte[] method2739(String string, String string_50_, final int i) {
		try {
			if (!method2738((byte) -124)) {
				return null;
			}
			string = string.toLowerCase();
			string_50_ = string_50_.toLowerCase();
			final int i_51_ = (aClass312_1571.aClass122_2666.method2200(
					(byte) -26, Class305.method3580(string, false)));
			if (!method2758(i_51_, false)) {
				return null;
			}
			if (i != -32734) {
				return null;
			}
			final int i_52_ = (aClass312_1571.aClass122Array2672[i_51_]
					.method2200((byte) -26,
							Class305.method3580(string_50_, false)));
			return method2745(i_52_, i_51_, false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.B("
					+ (string != null ? "{...}" : "null") + ','
					+ (string_50_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final int method2740(final int i, final int i_53_) {
		try {
			if (!method2758(i_53_, false)) {
				return 0;
			}
			if (anObjectArray1572[i_53_] != null) {
				return 100;
			}
			return aClass339_1574.method3790(i_53_, (byte) -106);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.G(" + i + ','
					+ i_53_ + ')');
		}
	}

	final boolean method2741(String string, final int i) {
		try {
			if (i != 0) {
				aBoolean1570 = true;
			}
			if (!method2738((byte) -127)) {
				return false;
			}
			string = string.toLowerCase();
			final int i_55_ = (aClass312_1571.aClass122_2666.method2200(
					(byte) -26, Class305.method3580(string, false)));
			return method2756(false, i_55_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.Q("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final boolean method2742(final int i, final int i_56_) {
		try {
			if (!method2738((byte) -126)) {
				return false;
			}
			if ((aClass312_1571.anIntArray2671.length ^ 0xffffffff) == -2) {
				return method2751(i_56_, 0, -6329);
			}
			if (i > -18) {
				return false;
			}
			if (!method2758(i_56_, false)) {
				return false;
			}
			if ((aClass312_1571.anIntArray2671[i_56_] ^ 0xffffffff) == -2) {
				return method2751(0, i_56_, -6329);
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.EA(" + i + ','
					+ i_56_ + ')');
		}
	}

	final int[] method2743(final int i, final int i_57_) {
		try {
			if (i_57_ != 6341) {
				return null;
			}
			if (!method2758(i, false)) {
				return null;
			}
			int[] is = aClass312_1571.anIntArrayArray2669[i];
			if (is == null) {
				is = new int[aClass312_1571.anIntArray2670[i]];
				for (int i_58_ = 0; is.length > i_58_; i_58_++) {
					is[i_58_] = i_58_;
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.D(" + i + ','
					+ i_57_ + ')');
		}
	}

	private final boolean method2744(String string, String string_59_,
			final int i) {
		try {
			if (!method2738((byte) -128)) {
				return false;
			}
			string = string.toLowerCase();
			string_59_ = string_59_.toLowerCase();
			final int i_60_ = (aClass312_1571.aClass122_2666.method2200(
					(byte) -26, Class305.method3580(string, false)));
			if (!method2758(i_60_, false)) {
				return false;
			}
			final int i_61_ = (aClass312_1571.aClass122Array2672[i_60_]
					.method2200((byte) -26,
							Class305.method3580(string_59_, false)));
			if (i != 1) {
				method2730((byte) 3);
			}
			return method2751(i_61_, i_60_, i + -6330);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.U("
					+ (string != null ? "{...}" : "null") + ','
					+ (string_59_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final byte[] method2745(final int i, final int i_62_, final boolean bool) {
		try {
			if (bool != false) {
				aClass348_1569 = null;
			}
			// if (!new
			// Throwable().getStackTrace()[1].getFileName().contains("Class324"))
			// new Throwable().printStackTrace();
			return method2736(null, 5, i, i_62_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.CA(" + i + ','
					+ i_62_ + ',' + bool + ')'));
		}
	}

	static final void method2746(final Class43 class43) {
		Class284_Sub1.aClass43_5177 = class43;
	}

	final void method2747(final boolean bool, final boolean bool_63_,
			final byte i) {
		do {
			try {
				if (method2738((byte) -123)) {
					if (bool) {
						aClass312_1571.aClass122_2666 = null;
						aClass312_1571.anIntArray2662 = null;
					}
					if (!bool_63_) {
						break;
					}
					aClass312_1571.aClass122Array2672 = null;
					aClass312_1571.anIntArrayArray2674 = null;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ni.N(" + bool
						+ ',' + bool_63_ + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final int method2748(final int i, String string) {
		try {
			if (!method2738((byte) -127)) {
				return 0;
			}
			if (i != 29952) {
				method2765((byte) -43);
			}
			string = string.toLowerCase();
			final int i_65_ = (aClass312_1571.aClass122_2666.method2200(
					(byte) -26, Class305.method3580(string, false)));
			return method2740(117, i_65_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.O(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method2749(final int i, final int i_66_) {
		try {
			do {
				if (aBoolean1570) {
					anObjectArray1572[i] = aClass339_1574.method3786(i, 0);
					if (!client.aBoolean3553) {
						break;
					}
				}
				anObjectArray1572[i] = Class64_Sub25.method654(2,
						aClass339_1574.method3786(i, 0), false);
			} while (false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.K(" + i + ','
					+ i_66_ + ')');
		}
	}

	final int method2750(final byte i, String string) {
		try {
			if (!method2738((byte) -125)) {
				return -1;
			}
			string = string.toLowerCase();
			if (i > -49) {
				return -53;
			}
			final int i_68_ = (aClass312_1571.aClass122_2666.method2200(
					(byte) -26, Class305.method3580(string, false)));
			if (!method2758(i_68_, false)) {
				return -1;
			}
			return i_68_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.AA(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method2751(final int i, final int i_69_, final int i_70_) {
		try {
			if (!method2731(i_70_ ^ i_70_, i_69_, i)) {
				return false;
			}
			if (anObjectArrayArray1573[i_69_] != null
					&& anObjectArrayArray1573[i_69_][i] != null) {
				return true;
			}
			if (anObjectArray1572[i_69_] != null) {
				return true;
			}
			method2749(i_69_, 103);
			if (anObjectArray1572[i_69_] != null) {
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.J(" + i + ','
					+ i_69_ + ',' + i_70_ + ')'));
		}
	}

	final int method2752(final byte i) {
		try {
			if (!method2738((byte) -123)) {
				return -1;
			}
			if (i != -11) {
				method2751(2, -51, -100);
			}
			return aClass312_1571.anIntArray2671.length;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.P(" + i + ')');
		}
	}

	static final float method2753(final int i, final int i_71_, final float f,
			final float f_72_, final float f_73_, final float f_74_,
			final float f_75_, final float f_76_) {
		try {
			float f_77_ = 0.0F;
			if (i_71_ != 10665) {
				anInt1577 = -101;
			}
			final float f_78_ = -f_76_ + f_72_;
			final float f_79_ = -f_74_ + f_73_;
			final float f_80_ = -f + f_75_;
			float f_81_ = 0.0F;
			float f_82_ = 0.0F;
			float f_83_ = 0.0F;
			while (f_77_ < 1.1F) {
				final float f_84_ = f_76_ + f_78_ * f_77_;
				final float f_85_ = f_74_ + f_79_ * f_77_;
				final float f_86_ = f + f_77_ * f_80_;
				final int i_87_ = (int) f_84_ >> -1052735575;
				final int i_88_ = (int) f_86_ >> 1278945001;
				if (i_87_ > 0 && i_88_ > 0 && i_87_ < Class165.anInt1276
						&& i_88_ < Class98_Sub10_Sub7.anInt5572) {
					int i_89_ = (((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aByte5088);
					if ((i_89_ ^ 0xffffffff) > -4
							&& (0x2 & (Class281.aByteArrayArrayArray2117[1][i_87_][i_88_]) ^ 0xffffffff) != -1) {
						i_89_++;
					}
					final int i_90_ = Class98_Sub46_Sub2_Sub2.aSArray6298[i_89_]
							.method3417((int) f_84_, (int) f_86_, true);
					if (f_85_ > i_90_) {
						if (i >= 2) {
							return (0.1F * method2753(-1 + i, 10665, f_83_,
									f_84_, f_85_, f_82_, f_86_, f_81_) + (f_77_ - 0.1F));
						}
						return f_77_;
					}
				}
				f_77_ += 0.1F;
				f_83_ = f_86_;
				f_81_ = f_84_;
				f_82_ = f_85_;
			}
			return -1.0F;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.W(" + i + ','
					+ i_71_ + ',' + f + ',' + f_72_ + ',' + f_73_ + ',' + f_74_
					+ ',' + f_75_ + ',' + f_76_ + ')'));
		}
	}

	final void method2754(final int i, final int i_91_) {
		do {
			try {
				if (i <= -6 && method2758(i_91_, false)) {
					if (anObjectArrayArray1573 == null) {
						break;
					}
					anObjectArrayArray1573[i_91_] = null;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ni.BA(" + i
						+ ',' + i_91_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2755(String string, final int i) {
		try {
			if (i <= -90 && method2738((byte) -127)) {
				string = string.toLowerCase();
				final int i_92_ = (aClass312_1571.aClass122_2666.method2200(
						(byte) -26, Class305.method3580(string, false)));
				method2732(i_92_, 32768);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.OA("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final boolean method2756(final boolean bool, final int i) {
		try {
			if (!method2758(i, bool)) {
				return false;
			}
			if (anObjectArray1572[i] != null) {
				return true;
			}
			method2749(i, 112);
			if (anObjectArray1572[i] != null) {
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.A(" + bool
					+ ',' + i + ')');
		}
	}

	public static void method2757(final int i) {
		try {
			aClass58_1576 = null;
			aClass348_1569 = null;
			if (i != 1) {
				method2757(51);
			}
			aClass196_1578 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.I(" + i + ')');
		}
	}

	private final boolean method2758(final int i, final boolean bool) {
		try {
			if (!method2738((byte) -126)) {
				return false;
			}
			if ((i ^ 0xffffffff) > -1
					|| ((i ^ 0xffffffff) <= (aClass312_1571.anIntArray2671.length ^ 0xffffffff))
					|| aClass312_1571.anIntArray2671[i] == 0) {
				if (!Class94.aBoolean797) {
					return false;
				}
				throw new IllegalArgumentException(Integer.toString(i));
			}
			if (bool != false) {
				aClass348_1569 = null;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.LA(" + i + ','
					+ bool + ')');
		}
	}

	static final void method2759(final boolean bool, String string, final byte i) {
		try {
			string = string.toLowerCase();
			short[] is = new short[16];
			int i_93_ = 0;
			final int i_94_ = !bool ? 0 : 32768;
			final int i_95_ = (i_94_ - -(bool ? Class52.aClass280_3500.anInt2103
					: Class52.aClass280_3500.anInt2102));
			if (i > 51) {
				for (int i_96_ = i_94_; (i_95_ ^ 0xffffffff) < (i_96_ ^ 0xffffffff); i_96_++) {
					final Class98_Sub46_Sub11 class98_sub46_sub11 = Class52.aClass280_3500
							.method3325(i_96_, 83);
					if ((class98_sub46_sub11.aBoolean6027)
							&& (class98_sub46_sub11.method1582(false)
									.toLowerCase().indexOf(string) ^ 0xffffffff) != 0) {
						if ((i_93_ ^ 0xffffffff) <= -51) {
							Class18.anInt214 = -1;
							Class64_Sub16.aShortArray3682 = null;
							return;
						}
						if ((is.length ^ 0xffffffff) >= (i_93_ ^ 0xffffffff)) {
							final short[] is_97_ = new short[2 * is.length];
							for (int i_98_ = 0; i_98_ < i_93_; i_98_++) {
								is_97_[i_98_] = is[i_98_];
							}
							is = is_97_;
						}
						is[i_93_++] = (short) i_96_;
					}
				}
				Class18.anInt214 = i_93_;
				Class85.anInt638 = 0;
				Class64_Sub16.aShortArray3682 = is;
				final String[] strings = new String[Class18.anInt214];
				for (int i_99_ = 0; i_99_ < Class18.anInt214; i_99_++) {
					strings[i_99_] = Class52.aClass280_3500.method3325(
							is[i_99_], 48).method1582(false);
				}
				Class98_Sub11.method1126(true, Class64_Sub16.aShortArray3682,
						strings);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception,
							("ni.FA(" + bool + ','
									+ (string != null ? "{...}" : "null") + ','
									+ i + ')'));
		}
	}

	final void method2760(final byte i) {
		do {
			try {
				if (i > -114) {
					method2741(null, -42);
				}
				if (anObjectArrayArray1573 == null) {
					break;
				}
				for (int i_100_ = 0; anObjectArrayArray1573.length > i_100_; i_100_++) {
					anObjectArrayArray1573[i_100_] = null;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ni.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	Class207(final Class339 class339, final boolean bool, final int i) {
		try {
			if ((i ^ 0xffffffff) > -1 || i > 2) {
				throw new IllegalArgumentException("js5: Invalid value " + i
						+ " supplied for discardunpacked");
			}
			aClass339_1574 = class339;
			aBoolean1570 = bool;
			anInt1575 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.<init>("
					+ (class339 != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ')'));
		}
	}

	final int method2761(final int i, final int i_101_) {
		try {
			if (!method2758(i_101_, false)) {
				return 0;
			}
			if (i != 0) {
				method2757(-44);
			}
			return aClass312_1571.anIntArray2671[i_101_];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.JA(" + i + ','
					+ i_101_ + ')');
		}
	}

	final int method2762(final byte i) {
		try {
			if (!method2738((byte) -126)) {
				return 0;
			}
			int i_102_ = 0;
			int i_103_ = 0;
			for (int i_104_ = 0; ((anObjectArray1572.length ^ 0xffffffff) < (i_104_ ^ 0xffffffff)); i_104_++) {
				if (aClass312_1571.anIntArray2670[i_104_] > 0) {
					i_103_ += method2740(-48, i_104_);
					i_102_ += 100;
				}
			}
			if (i_102_ == 0) {
				return 100;
			}
			final int i_106_ = i_103_ * 100 / i_102_;
			return i_106_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.V(" + i + ')');
		}
	}

	final int method2763(final int i, final int i_107_) {
		try {
			if (!method2738((byte) -126)) {
				return -1;
			}
			final int i_108_ = aClass312_1571.aClass122_2666.method2200(
					(byte) -26, i_107_);
			if (!method2758(i_108_, false)) {
				return -1;
			}
			if (i <= 35) {
				method2746(null);
			}
			return i_108_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.L(" + i + ','
					+ i_107_ + ')');
		}
	}

	static final void method2764(final int i, final int i_109_, final int i_110_) {
		try {
			if (i_110_ < -24 && Class85.method837(i_109_, 124)) {
				Class187.method2634(0,
						Class159.aClass293ArrayArray1252[i_109_], i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ni.T(" + i + ','
					+ i_109_ + ',' + i_110_ + ')'));
		}
	}

	static final void method2765(final byte i) {
		try {
			Class154.aHa1231.a(Class200.aClass111_1543);
			if (i < 1) {
				aClass196_1578 = null;
			}
			Class154.aHa1231.DA(Class98_Sub48.anInt4279, Class54.anInt3391,
					Class96.anInt802, Class98_Sub10_Sub38.anInt5752);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.R(" + i + ')');
		}
	}

	final void method2766(final int i) {
		try {
			if (anObjectArray1572 != null) {
				for (int i_111_ = 0; ((i_111_ ^ 0xffffffff) > (anObjectArray1572.length ^ 0xffffffff)); i_111_++) {
					anObjectArray1572[i_111_] = null;
				}
			}
			if (i != 16) {
				aClass58_1576 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ni.E(" + i + ')');
		}
	}
}
