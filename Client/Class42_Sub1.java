import jaggl.OpenGL;

/* Class42_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class42_Sub1 extends Class42 {
	private int anInt5351 = -1;
	int anInt5352;
	private int anInt5353 = -1;
	static Class197 aClass197_5354;
	int anInt5355;
	static int anInt5356;

	Class42_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_0_,
			final int i_1_, final int i_2_) {
		super(var_ha_Sub1, i, i_0_, i_2_ * i_1_, false);
		try {
			anInt5352 = i_2_;
			anInt5355 = i_1_;
			((Class42) this).aHa_Sub1_3227.method1863(1, this);
			OpenGL.glTexImage2Dub(((Class42) this).anInt3226, 0,
					((Class42) this).anInt3230, i_1_, i_2_, 0,
					Class98_Sub31_Sub2.method1339((((Class42) this).anInt3230),
							126), 5121, null, 0);
			method372(-28003, true);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("aaa.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	Class42_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_3_,
			final int i_4_, final int i_5_, final boolean bool, byte[] is,
			final int i_6_, final boolean bool_7_) {
		super(var_ha_Sub1, i, i_3_, i_4_ * i_5_, bool);
		try {
			anInt5355 = i_4_;
			anInt5352 = i_5_;
			if (bool_7_) {
				final byte[] is_8_ = new byte[is.length];
				for (int i_9_ = 0; (i_5_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
					int i_10_ = i_4_ * i_9_;
					int i_11_ = (-1 + -i_9_ + i_5_) * i_4_;
					for (int i_12_ = 0; (i_4_ ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
						is_8_[i_10_++] = is[i_11_++];
					}
				}
				is = is_8_;
			}
			((Class42) this).aHa_Sub1_3227.method1863(1, this);
			OpenGL.glPixelStorei(3317, 1);
			if (!bool || (((Class42) this).anInt3226 ^ 0xffffffff) == -34038) {
				OpenGL.glTexImage2Dub(((Class42) this).anInt3226, 0,
						((Class42) this).anInt3230, anInt5355, anInt5352, 0,
						i_6_, 5121, is, 0);
				method373(true, false);
			} else {
				Class98_Sub46_Sub16.method1613(i_4_, i, is, -1, i_5_, i_3_,
						i_6_);
				method373(true, true);
			}
			OpenGL.glPixelStorei(3317, 4);
			method372(-28003, true);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("aaa.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + bool + ','
					+ (is != null ? "{...}" : "null") + ',' + i_6_ + ','
					+ bool_7_ + ')'));
		}
	}

	final void method378(final int i, final int i_13_, final boolean bool,
			int i_14_, byte[] is, final int i_15_, final byte i_16_,
			final int i_17_, final int i_18_, final int i_19_) {
		do {
			try {
				if ((i_14_ ^ 0xffffffff) == -1) {
					i_14_ = i;
				}
				if (bool) {
					final int i_20_ = Class246_Sub3_Sub3.method3014(1, i_13_);
					final int i_21_ = i_20_ * i;
					final int i_22_ = i_14_ * i_20_;
					final byte[] is_23_ = new byte[i_21_ * i_19_];
					for (int i_24_ = 0; (i_19_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
						int i_25_ = i_21_ * i_24_;
						int i_26_ = i_22_ * (-i_24_ + i_19_ - 1) - -i_18_;
						for (int i_27_ = 0; (i_21_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++) {
							is_23_[i_25_++] = is[i_26_++];
						}
					}
					is = is_23_;
				}
				((Class42) this).aHa_Sub1_3227.method1863(1, this);
				OpenGL.glPixelStorei(3317, 1);
				if ((i ^ 0xffffffff) != (i_14_ ^ 0xffffffff)) {
					OpenGL.glPixelStorei(3314, i_14_);
				}
				OpenGL.glTexSubImage2Dub(((Class42) this).anInt3226, 0, i_17_,
						i_15_, i, i_19_, i_13_, 5121, is, i_18_);
				if ((i_14_ ^ 0xffffffff) != (i ^ 0xffffffff)) {
					OpenGL.glPixelStorei(3314, 0);
				}
				OpenGL.glPixelStorei(3317, 4);
				if (i_16_ == -80) {
					break;
				}
				method383(false, -121, false);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("aaa.C(" + i + ',' + i_13_ + ',' + bool + ',' + i_14_
								+ ',' + (is != null ? "{...}" : "null") + ','
								+ i_15_ + ',' + i_16_ + ',' + i_17_ + ','
								+ i_18_ + ',' + i_19_ + ')'));
			}
			break;
		} while (false);
	}

	Class42_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_28_,
			final int i_29_, final int i_30_, final int i_31_) {
		super(var_ha_Sub1, i, 6407, i_30_ * i_31_, false);
		try {
			anInt5352 = i_31_;
			anInt5355 = i_30_;
			final int i_32_ = (((Class42) this).aHa_Sub1_3227.anInt4304 - i_31_ - i_29_);
			((Class42) this).aHa_Sub1_3227.method1863(1, this);
			OpenGL.glCopyTexImage2D(((Class42) this).anInt3226, 0,
					((Class42) this).anInt3230, i_28_, i_32_, i_30_, i_31_, 0);
			method372(-28003, true);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("aaa.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ')'));
		}
	}

	final void method379(final int i, int[] is, final int i_33_,
			final int i_34_, final boolean bool, final int i_35_, int i_36_,
			final int i_37_, final int i_38_) {
		do {
			try {
				if (i_34_ == 3656) {
					if ((i_36_ ^ 0xffffffff) == -1) {
						i_36_ = i_37_;
					}
					if (bool) {
						final int[] is_39_ = new int[i * i_37_];
						for (int i_40_ = 0; (i ^ 0xffffffff) < (i_40_ ^ 0xffffffff); i_40_++) {
							int i_41_ = i_37_ * i_40_;
							int i_42_ = (i + (-i_40_ + -1)) * i_36_ + i_33_;
							for (int i_43_ = 0; (i_43_ ^ 0xffffffff) > (i_37_ ^ 0xffffffff); i_43_++) {
								is_39_[i_41_++] = is[i_42_++];
							}
						}
						is = is_39_;
					}
					((Class42) this).aHa_Sub1_3227.method1863(1, this);
					if ((i_37_ ^ 0xffffffff) != (i_36_ ^ 0xffffffff)) {
						OpenGL.glPixelStorei(3314, i_36_);
					}
					OpenGL.glTexSubImage2Di(((Class42) this).anInt3226, 0,
							i_38_, anInt5352 + -i_35_ + -i, i_37_, i, 32993,
							((Class42) this).aHa_Sub1_3227.anInt4425, is, i_33_);
					if ((i_36_ ^ 0xffffffff) == (i_37_ ^ 0xffffffff)) {
						break;
					}
					OpenGL.glPixelStorei(3314, 0);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("aaa.F(" + i
						+ ',' + (is != null ? "{...}" : "null") + ',' + i_33_
						+ ',' + i_34_ + ',' + bool + ',' + i_35_ + ',' + i_36_
						+ ',' + i_37_ + ',' + i_38_ + ')'));
			}
			break;
		} while (false);
	}

	final void method380(final int i, final int i_44_, final int i_45_,
			final int i_46_, final int i_47_, final int i_48_, final int i_49_) {
		try {
			final int i_50_ = (((Class42) this).aHa_Sub1_3227.anInt4304 - (i_46_ - -i_49_));
			((Class42) this).aHa_Sub1_3227.method1863(1, this);
			OpenGL.glCopyTexSubImage2D(((Class42) this).anInt3226, 0, i_44_,
					(anInt5352 - (i_45_ + i_49_)), i_47_, i_50_, i, i_49_);
			if (i_48_ <= 79) {
				method383(true, -52, false);
			}
			OpenGL.glFlush();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("aaa.H(" + i + ','
					+ i_44_ + ',' + i_45_ + ',' + i_46_ + ',' + i_47_ + ','
					+ i_48_ + ',' + i_49_ + ')'));
		}
	}

	static final void method381(final int i, final int i_51_, final ha var_ha,
			final int i_52_, final int i_53_, final int i_54_, final int i_55_,
			final int i_56_) {
		try {
			var_ha.method1760(i_54_, i, i_51_, i_53_, (byte) -66, i_56_);
			var_ha.method1760(i_54_ - 2, 16, 1 + i_51_, i_52_, (byte) -66,
					1 + i_56_);
			if (i_55_ == 8516) {
				var_ha.method1781(true, i - 19, i_54_ - 2, i_52_, 1 + i_56_,
						18 + i_51_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("aaa.E(" + i + ','
					+ i_51_ + ',' + (var_ha != null ? "{...}" : "null") + ','
					+ i_52_ + ',' + i_53_ + ',' + i_54_ + ',' + i_55_ + ','
					+ i_56_ + ')'));
		}
	}

	Class42_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_57_,
			final int i_58_, final int i_59_, final boolean bool,
			final float[] fs, final int i_60_) {
		super(var_ha_Sub1, i, i_57_, i_58_ * i_59_, bool);
		try {
			anInt5355 = i_58_;
			anInt5352 = i_59_;
			((Class42) this).aHa_Sub1_3227.method1863(1, this);
			do {
				if (!bool
						|| (((Class42) this).anInt3226 ^ 0xffffffff) == -34038) {
					OpenGL.glTexImage2Df(((Class42) this).anInt3226, 0,
							((Class42) this).anInt3230, anInt5355, anInt5352,
							0, i_60_, 5126, fs, 0);
					method373(true, false);
					if (!client.aBoolean3553) {
						break;
					}
				}
				Class2.method168(i_58_, i, i_60_, i_57_, fs, i_59_, -70);
				method373(true, true);
			} while (false);
			method372(-28003, true);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("aaa.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_57_ + ',' + i_58_ + ',' + i_59_ + ',' + bool + ','
					+ (fs != null ? "{...}" : "null") + ',' + i_60_ + ')'));
		}
	}

	final void method382(final int i, final boolean bool, final int i_61_,
			final int i_62_) {
		do {
			try {
				OpenGL.glFramebufferTexture2DEXT(i, i_61_,
						((Class42) this).anInt3226, ((Class42) this).anInt3229,
						i_62_);
				anInt5351 = i_61_;
				anInt5353 = i;
				if (bool == true) {
					break;
				}
				method383(false, 107, false);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("aaa.A(" + i
						+ ',' + bool + ',' + i_61_ + ',' + i_62_ + ')'));
			}
			break;
		} while (false);
	}

	final void method383(final boolean bool, final int i, final boolean bool_63_) {
		do {
			try {
				if (i != 10242) {
					method380(-75, 26, 70, 110, -90, 106, 103);
				}
				if ((((Class42) this).anInt3226 ^ 0xffffffff) != -3554) {
					break;
				}
				((Class42) this).aHa_Sub1_3227.method1863(1, this);
				OpenGL.glTexParameteri(((Class42) this).anInt3226, 10242,
						!bool_63_ ? 33071 : 10497);
				OpenGL.glTexParameteri(((Class42) this).anInt3226, 10243,
						!bool ? 33071 : 10497);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("aaa.I("
						+ bool + ',' + i + ',' + bool_63_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method384(final int i) {
		try {
			if (i >= -33) {
				anInt5356 = 68;
			}
			aClass197_5354 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "aaa.D(" + i + ')');
		}
	}

	Class42_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_64_,
			final int i_65_, final int i_66_, final boolean bool, int[] is,
			final int i_67_, final int i_68_, final boolean bool_69_) {
		super(var_ha_Sub1, i, i_64_, i_66_ * i_65_, bool);
		try {
			anInt5352 = i_66_;
			anInt5355 = i_65_;
			if (bool_69_) {
				final int[] is_70_ = new int[is.length];
				for (int i_71_ = 0; (i_66_ ^ 0xffffffff) < (i_71_ ^ 0xffffffff); i_71_++) {
					int i_72_ = i_65_ * i_71_;
					int i_73_ = (-1 + (i_66_ + -i_71_)) * i_65_;
					for (int i_74_ = 0; i_65_ > i_74_; i_74_++) {
						is_70_[i_72_++] = is[i_73_++];
					}
				}
				is = is_70_;
			}
			((Class42) this).aHa_Sub1_3227.method1863(1, this);
			if (((Class42) this).anInt3226 == 34037 || !bool || i_67_ != 0
					|| i_68_ != 0) {
				OpenGL.glPixelStorei(3314, i_67_);
				OpenGL.glTexImage2Di(((Class42) this).anInt3226, 0,
						((Class42) this).anInt3230, anInt5355, anInt5352, 0,
						32993, (((Class42) this).aHa_Sub1_3227).anInt4425, is,
						4 * i_68_);
				OpenGL.glPixelStorei(3314, 0);
				method373(true, false);
			} else {
				Class336.method3773(((Class42) this).anInt3230, -121,
						(((Class42) this).aHa_Sub1_3227.anInt4425),
						((Class42) this).anInt3226, anInt5355, 32993,
						anInt5352, is);
				method373(true, true);
			}
			method372(-28003, true);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("aaa.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_64_ + ',' + i_65_ + ',' + i_66_ + ',' + bool + ','
					+ (is != null ? "{...}" : "null") + ',' + i_67_ + ','
					+ i_68_ + ',' + bool_69_ + ')'));
		}
	}

	@Override
	public final void method3(final byte i) {
		do {
			try {
				OpenGL.glFramebufferTexture2DEXT(anInt5353, anInt5351,
						((Class42) this).anInt3226, 0, 0);
				anInt5353 = -1;
				anInt5351 = -1;
				if (i < -117) {
					break;
				}
				anInt5351 = 4;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "aaa.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method385(final int i, final int i_75_, final int i_76_,
			final int i_77_, final int i_78_, final int i_79_, final int i_80_,
			final int i_81_, final int i_82_) {
		do {
			try {
				Class168.method2533(i_82_, i_76_, i_81_, 0, (byte) 82, i_80_,
						i, i_75_, i_78_, i_79_);
				if (i_77_ == -1) {
					break;
				}
				method385(-52, 78, -128, 103, 42, -10, -6, -22, -116);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("aaa.G(" + i + ',' + i_75_ + ',' + i_76_ + ',' + i_77_
								+ ',' + i_78_ + ',' + i_79_ + ',' + i_80_ + ','
								+ i_81_ + ',' + i_82_ + ')'));
			}
			break;
		} while (false);
	}
}
