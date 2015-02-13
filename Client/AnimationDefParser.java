/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class AnimationDefParser {
	private Class207 aClass207_1441;
	private final Class79 aClass79_1442 = new Class79(64);
	private Class79 aClass79_1443 = new Class79(100);

	final void method2618(final boolean bool) {
		try {
			synchronized (aClass79_1442) {
				aClass79_1442.method794(109);
			}
			synchronized (aClass79_1443) {
				if (bool != true) {
					method2624(-55, 58);
				}
				aClass79_1443.method794(86);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.B(" + bool
					+ ')');
		}
	}

	final void method2619(final int i) {
		try {
			synchronized (aClass79_1442) {
				aClass79_1442.method806((byte) 18);
			}
			synchronized (aClass79_1443) {
				aClass79_1443.method806((byte) 109);
				if (i != -2118) {
					aClass79_1443 = null;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.G(" + i + ')');
		}
	}

	static final void method2620(final int i) {
		try {
			if (Class368.anInt3128 != -1
					&& (Class53_Sub1.anInt3636 ^ 0xffffffff) != 0) {
				final int i_0_ = (Class246.anInt1872 + (Class54.anInt3394
						* (-Class246.anInt1872 + Class98_Sub10_Sub32.anInt5718) >> 1233746160));
				Class54.anInt3394 += i_0_;
				if ((Class54.anInt3394 ^ 0xffffffff) <= -65536) {
					if (!Class319.aBoolean2700) {
						Class187.aBoolean1451 = true;
					} else {
						Class187.aBoolean1451 = false;
					}
					Class54.anInt3394 = 65535;
					Class319.aBoolean2700 = true;
				} else {
					Class187.aBoolean1451 = false;
					Class319.aBoolean2700 = false;
				}
				final float f = Class54.anInt3394 / 65535.0F;
				final float[] fs = new float[3];
				final int i_1_ = 2 * Class50.anInt418;
				for (int i_2_ = 0; i_2_ < 3; i_2_++) {
					final int i_3_ = 3 * (InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_][i_2_]);
					final int i_4_ = 3 * (InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_ + 1][i_2_]);
					final int i_5_ = 3 * ((InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_ + 2][i_2_]) - (-(InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_
							- -2][i_2_]) + (InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_
							- -3][i_2_])));
					final int i_6_ = (InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_][i_2_]);
					final int i_7_ = i_4_ + -i_3_;
					final int i_8_ = i_5_ + (i_3_ - 2 * i_4_);
					final int i_9_ = (i_4_ + -i_6_ + ((InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_ + 2][i_2_]) - i_5_));
					fs[i_2_] = ((i_7_ + f * (i_8_ + f * i_9_)) * f + i_6_);
				}
				Class79.anInt601 = -1 * (int) fs[1];
				Class134.anInt3461 = (int) fs[2] - 512 * aa_Sub2.anInt3562;
				Class98_Sub46_Sub10.anInt6020 = -(Class272.anInt2038 * 512)
						+ (int) fs[0];
				final float[] fs_10_ = new float[3];
				final int i_11_ = 2 * ha.anInt943;
				for (int i_12_ = 0; i_12_ < 3; i_12_++) {
					final int i_13_ = ((InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][i_11_][i_12_]) * 3);
					final int i_14_ = 3 * (InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][i_11_ + 1][i_12_]);
					final int i_15_ = 3 * ((InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][i_11_ + 2][i_12_]) - ((InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][i_11_
							- -3][i_12_]) + -(InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][i_11_ + 2][i_12_])));
					final int i_16_ = (InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][i_11_][i_12_]);
					final int i_17_ = i_14_ - i_13_;
					final int i_18_ = i_15_ + (-(i_14_ * 2) + i_13_);
					final int i_19_ = (-i_15_ + (i_14_
							+ (InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636][2 + i_11_][i_12_]) + -i_16_));
					fs_10_[i_12_] = (i_16_ + (i_17_ + (f * i_19_ + i_18_) * f)
							* f);
				}
				final float f_20_ = fs_10_[0] - fs[i];
				final float f_21_ = (-fs[1] + fs_10_[1]) * -1.0F;
				final float f_22_ = fs_10_[2] - fs[2];
				final double d = Math.sqrt(f_22_ * f_22_ + f_20_ * f_20_);
				Class246_Sub3_Sub4_Sub2.anInt6357 = (int) (2607.5945876176133 * Math
						.atan2(f_21_, d)) & 0x3fff;
				Class186.anInt3424 = 0x3fff & (int) (2607.5945876176133 * -Math
						.atan2(f_20_, f_22_));
				Class308.anInt2584 = ((InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_][3]) - -(((-(InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][i_1_][3]) + (InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128][2 + i_1_][3])) * Class54.anInt3394) >> -1587239088));
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.C(" + i + ')');
		}
	}

	final void method2621(final int i, final int i_23_) {
		try {
			synchronized (aClass79_1442) {
				aClass79_1442.method800((byte) 62, i);
			}
			if (i_23_ == 3) {
				synchronized (aClass79_1443) {
					aClass79_1443.method800((byte) 62, i);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.F(" + i + ','
					+ i_23_ + ')');
		}
	}

	static final byte[] method2622(final byte[] is, final byte i,
			final int i_24_) {
		try {
			final byte[] is_25_ = new byte[i_24_];
			Class236.method2894(is, 0, is_25_, 0, i_24_);
			if (i > -100) {
				method2622(null, (byte) 61, 124);
			}
			return is_25_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("me.D(" + (is != null ? "{...}" : "null") + ',' + i + ','
							+ i_24_ + ')'));
		}
	}

	/**
	 * Parse?
	 * 
	 * @param id
	 * @param i_26_
	 * @return
	 */
	final AnimationDefinition method2623(int id, final int i_26_) {
		try {
			/**
			 * Id change hardcore starts.
			 */
			if (id == 6320) {
				id = 17404;
			}
			if (id == 6319) {
				id = 17405;
			}
			if (id == 7059) {
				id = 17387;
			}
			if (id == 7058) {
				id = 17388;
			}
			if (id == 6972) {
				id = 17393;
			}
			if (id == 6973) {
				id = 17394;
			}
			if (id == 90) {
				id = 17776;
			}
			if (id == 4635) {
				id = 17778;
			}
			if (id == 9274) {
				id = 16190;
			}
			if (id == 9273) {
				id = 16154;
			}
			if (id == 13516) {
				id = 16715;
			}
			/**
			 * Id change hardcore ends.
			 */
			AnimationDefinition definition;
			synchronized (aClass79_1442) {
				definition = (AnimationDefinition) aClass79_1442.method802(
						-128, id);
			}
			if (definition != null) {
				return definition;
			}
			byte[] is;
			synchronized (aClass207_1441) {
				is = (aClass207_1441
						.method2745(Class98_Sub10_Sub32.method1096(id, 127),
								Class299_Sub2
										.method3527(id, i_26_ ^ 0x2dea8938),
								false));
			}
			definition = new AnimationDefinition();
			if (i_26_ != 16383) {
				return null;
			}
			definition.aClass183_824 = this;
			definition.animationId = id;
			if (is != null) {
				/**
				 * Definition parser.
				 */
				definition.method933(new ByteBuffer(is), -125);
			}
			definition.method938(i_26_ + -16508);
			synchronized (aClass79_1442) {
				aClass79_1442.method805(id, definition, (byte) -80);
			}
			return definition;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.E(" + id + ','
					+ i_26_ + ')');
		}
	}

	final Class98_Sub46_Sub16 method2624(final int i, final int i_27_) {
		try {
			if (i != 2) {
				method2623(20, 104);
			}
			Class98_Sub46_Sub16 class98_sub46_sub16;
			synchronized (aClass79_1443) {
				class98_sub46_sub16 = ((Class98_Sub46_Sub16) aClass79_1443
						.method802(-120, i_27_));
				if (class98_sub46_sub16 == null) {
					class98_sub46_sub16 = new Class98_Sub46_Sub16(i_27_);
					aClass79_1443.method805(i_27_, class98_sub46_sub16,
							(byte) -80);
				}
				if (!class98_sub46_sub16.method1614((byte) 66)) {
					return null;
				}
			}
			return class98_sub46_sub16;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.H(" + i + ','
					+ i_27_ + ')');
		}
	}

	static final void method2625(final boolean bool, final int i) {
		try {
			if (bool != false) {
				method2620(104);
			}
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i, -105, 4);
			class98_sub46_sub17.method1621(0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "me.A(" + bool
					+ ',' + i + ')');
		}
	}

	AnimationDefParser(final Class279 class279, final int i,
			final Class207 class207, final Class207 class207_28_,
			final Class207 class207_29_) {
		try {
			aClass207_1441 = class207;
			if (aClass207_1441 != null) {
				final int i_30_ = aClass207_1441.method2752((byte) -11) - 1;
				aClass207_1441.method2761(0, i_30_);
			}
			Class246_Sub3_Sub4_Sub4.method3079((byte) 33, class207_29_, 2,
					class207_28_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("me.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class207_28_ != null ? "{...}" : "null") + ','
					+ (class207_29_ != null ? "{...}" : "null") + ')'));
		}
	}
}
