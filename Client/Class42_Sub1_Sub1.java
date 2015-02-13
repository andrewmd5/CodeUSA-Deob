/* Class42_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class42_Sub1_Sub1 extends Class42_Sub1 {
	int anInt6204;
	float aFloat6205;
	static Class207 aClass207_6206;
	int anInt6207;
	static int anInt6208;
	float aFloat6209;
	static int anInt6210 = 0;
	boolean aBoolean6211;

	public static void method386(final int i) {
		try {
			if (i == -16573) {
				aClass207_6206 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iaa.K(" + i + ')');
		}
	}

	Class42_Sub1_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_0_,
			final int i_1_, final int i_2_, final int[] is) {
		super(var_ha_Sub1, 3553, 6408, i_1_, i_2_);
		try {
			anInt6207 = i;
			anInt6204 = i_0_;
			method379(i_0_, is, 0, 3656, true, 0, 0, i, 0);
			aFloat6205 = (float) i / (float) i_1_;
			aFloat6209 = (float) i_0_ / (float) i_2_;
			aBoolean6211 = false;
			method383(false, 10242, false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	Class42_Sub1_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_3_,
			final int i_4_, final int i_5_, final int i_6_) {
		super(var_ha_Sub1, 3553, i, i_5_, i_6_);
		try {
			aBoolean6211 = false;
			anInt6204 = i_4_;
			anInt6207 = i_3_;
			aFloat6205 = (float) i_3_ / (float) i_5_;
			aFloat6209 = (float) i_4_ / (float) i_6_;
			method383(false, 10242, false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final void method387(final boolean bool) {
		try {
			if (Class264.aFileOutputStream1969 != null) {
				try {
					Class264.aFileOutputStream1969.close();
				} catch (final java.io.IOException ioexception) {
					/* empty */
				}
			}
			if (bool != true) {
				method387(true);
			}
			Class264.aFileOutputStream1969 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "iaa.J(" + bool
					+ ')');
		}
	}

	Class42_Sub1_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_7_,
			final int i_8_, final int i_9_, final int i_10_, final boolean bool) {
		super(var_ha_Sub1, i, i_7_, i_8_, i_9_, i_10_);
		try {
			anInt6204 = i_10_;
			do {
				if (((Class42) this).anInt3226 == 34037) {
					aFloat6209 = i_10_;
					aFloat6205 = i_9_;
					aBoolean6211 = false;
					if (!client.aBoolean3553) {
						break;
					}
				}
				aBoolean6211 = true;
				aFloat6205 = aFloat6209 = 1.0F;
			} while (false);
			anInt6207 = i_9_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("iaa.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null")
							+ ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_
							+ ',' + i_10_ + ',' + bool + ')'));
		}
	}

	Class42_Sub1_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_11_,
			final int i_12_, final int i_13_, final boolean bool,
			final byte[] is, final int i_14_) {
		super(var_ha_Sub1, i, i_11_, i_12_, i_13_, bool, is, i_14_, true);
		try {
			do {
				if (((Class42) this).anInt3226 == 34037) {
					aBoolean6211 = false;
					aFloat6205 = i_12_;
					aFloat6209 = i_13_;
					if (!client.aBoolean3553) {
						break;
					}
				}
				aFloat6205 = aFloat6209 = 1.0F;
				aBoolean6211 = true;
			} while (false);
			anInt6207 = i_12_;
			anInt6204 = i_13_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + bool + ','
					+ (is != null ? "{...}" : "null") + ',' + i_14_ + ')'));
		}
	}

	Class42_Sub1_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_15_,
			final int i_16_, final int i_17_) {
		super(var_ha_Sub1, i, i_15_, i_16_, i_17_);
		try {
			anInt6207 = i_16_;
			do {
				if (((Class42) this).anInt3226 != 34037) {
					aFloat6205 = aFloat6209 = 1.0F;
					aBoolean6211 = true;
					if (!client.aBoolean3553) {
						break;
					}
				}
				aBoolean6211 = false;
				aFloat6209 = i_17_;
				aFloat6205 = i_16_;
			} while (false);
			anInt6204 = i_17_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_15_ + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	Class42_Sub1_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_18_,
			final int i_19_, final int i_20_, final int i_21_, final int i_22_,
			final boolean bool) {
		super(var_ha_Sub1, 3553, i, i_18_, i_21_, i_22_);
		try {
			aFloat6209 = (float) i_20_ / (float) i_22_;
			anInt6204 = i_20_;
			aFloat6205 = (float) i_19_ / (float) i_21_;
			anInt6207 = i_19_;
			aBoolean6211 = false;
			method383(false, 10242, false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ','
					+ i_22_ + ',' + bool + ')'));
		}
	}

	Class42_Sub1_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_23_,
			final int i_24_, final int i_25_, final int i_26_, final byte[] is,
			final int i_27_) {
		super(var_ha_Sub1, 3553, i, i_25_, i_26_);
		try {
			anInt6204 = i_24_;
			anInt6207 = i_23_;
			method378(i_23_, i_27_, true, 0, is, 0, (byte) -80, 0, 0, i_24_);
			aBoolean6211 = false;
			aFloat6209 = (float) i_24_ / (float) i_26_;
			aFloat6205 = (float) i_23_ / (float) i_25_;
			method383(false, 10242, false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_27_ + ')'));
		}
	}

	Class42_Sub1_Sub1(final ha_Sub1 var_ha_Sub1, final int i, final int i_28_,
			final int i_29_, final boolean bool, final int[] is,
			final int i_30_, final int i_31_) {
		super(var_ha_Sub1, i, 6408, i_28_, i_29_, bool, is, i_30_, i_31_, true);
		try {
			anInt6207 = i_28_;
			do {
				if ((((Class42) this).anInt3226 ^ 0xffffffff) == -34038) {
					aBoolean6211 = false;
					aFloat6209 = i_29_;
					aFloat6205 = i_28_;
					if (!client.aBoolean3553) {
						break;
					}
				}
				aFloat6205 = aFloat6209 = 1.0F;
				aBoolean6211 = true;
			} while (false);
			anInt6204 = i_29_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("iaa.<init>("
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_28_ + ',' + i_29_ + ',' + bool + ','
					+ (is != null ? "{...}" : "null") + ',' + i_30_ + ','
					+ i_31_ + ')'));
		}
	}
}
