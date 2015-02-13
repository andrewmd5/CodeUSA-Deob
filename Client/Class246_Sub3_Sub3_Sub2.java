/* Class246_Sub3_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub3_Sub2 extends Class246_Sub3_Sub3 implements
		Interface19 {
	private byte aByte6279;
	private boolean aBoolean6280;
	private boolean aBoolean6281;
	private Class228 aClass228_6282;
	private short aShort6283;
	private boolean aBoolean6284;
	Class146 aClass146_6285;
	private r aR6286;
	private boolean aBoolean6287;
	private byte aByte6288;

	@Override
	final Class246_Sub1 method2975(final ha var_ha, final int i) {
		try {
			if (aClass146_6285 == null) {
				return null;
			}
			final Class111 class111 = var_ha.method1793();
			class111.method2100(((Class246_Sub3) this).anInt5084,
					((Class246_Sub3) this).anInt5089,
					((Class246_Sub3) this).anInt5079);
			final Class246_Sub1 class246_sub1 = Class94.method915(1,
					(byte) -47, aBoolean6280);
			do {
				if (!Class239.aBoolean1839) {
					aClass146_6285.method2325(class111,
							(class246_sub1.aClass246_Sub6Array5067[0]), 0);
					if (!client.aBoolean3553) {
						break;
					}
				}
				aClass146_6285.method2329(class111,
						(class246_sub1.aClass246_Sub6Array5067[0]),
						Class16.anInt197, 0);
			} while (false);
			if (i >= -12) {
				return null;
			}
			return class246_sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vr.QA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	public final int method64(final int i) {
		try {
			if (i != 30472) {
				aBoolean6284 = false;
			}
			return aShort6283 & 0xffff;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vr.C(" + i + ')');
		}
	}

	@Override
	final Class228 method2974(final byte i, final ha var_ha) {
		try {
			if (aClass228_6282 == null) {
				aClass228_6282 = (Class48_Sub2_Sub1.method472(
						((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5084,
						method3019(0, (byte) 58, var_ha),
						((Class246_Sub3) this).anInt5079, 4));
			}
			if (i != -53) {
				method3019(89, (byte) -78, null);
			}
			return aClass228_6282;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vr.KA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	private final Class298 method3018(final ha var_ha, final int i,
			final int i_0_, final boolean bool) {
		try {
			if (i >= -20) {
				return null;
			}
			final GameObjectDefinition class352 = Class130.aClass302_1028
					.method3546(0xffff & aShort6283, (byte) 119);
			s var_s;
			s var_s_1_;
			if (!aBoolean6287) {
				if ((((Class246_Sub3) this).aByte5081 ^ 0xffffffff) > -4) {
					var_s_1_ = (Class98_Sub46_Sub2_Sub2.aSArray6298[((Class246_Sub3) this).aByte5081
							- -1]);
				} else {
					var_s_1_ = null;
				}
				var_s = (Class98_Sub46_Sub2_Sub2.aSArray6298[((Class246_Sub3) this).aByte5081]);
			} else {
				var_s = Class81.aSArray618[((Class246_Sub3) this).aByte5081];
				var_s_1_ = Class98_Sub46_Sub2_Sub2.aSArray6298[0];
			}
			return class352.method3851(((Class246_Sub3) this).anInt5079, false,
					var_s_1_, aByte6288, ((Class246_Sub3) this).anInt5089,
					bool, ((Class246_Sub3) this).anInt5084, i_0_, null, var_s,
					var_ha, aByte6279);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vr.T("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + bool + ')'));
		}
	}

	@Override
	final boolean method2976(final int i, final ha var_ha, final byte i_2_,
			final int i_3_) {
		try {
			final Class146 class146 = method3019(131072, (byte) 61, var_ha);
			if (class146 != null) {
				final Class111 class111 = var_ha.method1793();
				class111.method2100(((Class246_Sub3) this).anInt5084,
						((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5079);
				if (Class239.aBoolean1839) {
					return class146.method2333(i, i_3_, class111, false, 0,
							Class16.anInt197);
				}
				return class146.method2339(i, i_3_, class111, false, 0);
			}
			if (i_2_ <= 59) {
				method3020(43, -102);
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vr.TA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_2_ + ','
					+ i_3_ + ')'));
		}
	}

	@Override
	final boolean method2978(final int i) {
		try {
			if (aClass146_6285 == null) {
				return true;
			}
			if (aClass146_6285.r()) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vr.H(" + i + ')');
		}
	}

	@Override
	final int method2985(final boolean bool) {
		try {
			if (bool != false) {
				return 118;
			}
			if (aClass146_6285 != null) {
				return aClass146_6285.ma();
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vr.O(" + bool
					+ ')');
		}
	}

	@Override
	final void method2981(final Class246_Sub3 class246_sub3, final byte i,
			final boolean bool, final int i_5_, final ha var_ha,
			final int i_6_, final int i_7_) {
		do {
			try {
				if (!(class246_sub3 instanceof Class246_Sub3_Sub3_Sub2)) {
					if (class246_sub3 instanceof Class246_Sub3_Sub4_Sub1) {
						final Class246_Sub3_Sub4_Sub1 class246_sub3_sub4_sub1 = (Class246_Sub3_Sub4_Sub1) class246_sub3;
						if ((aClass146_6285 != null)
								&& (class246_sub3_sub4_sub1.aClass146_6243 != null)) {
							aClass146_6285.method2332(
									class246_sub3_sub4_sub1.aClass146_6243,
									i_5_, i_6_, i_7_, bool);
						}
					}
				} else {
					final Class246_Sub3_Sub3_Sub2 class246_sub3_sub3_sub2_9_ = (Class246_Sub3_Sub3_Sub2) class246_sub3;
					if (aClass146_6285 == null
							|| class246_sub3_sub3_sub2_9_.aClass146_6285 == null) {
						break;
					}
					aClass146_6285.method2332(
							class246_sub3_sub3_sub2_9_.aClass146_6285, i_5_,
							i_6_, i_7_, bool);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vr.CA("
						+ (class246_sub3 != null ? "{...}" : "null") + ',' + i
						+ ',' + bool + ',' + i_5_ + ','
						+ (var_ha != null ? "{...}" : "null") + ',' + i_6_
						+ ',' + i_7_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	public final void method61(final byte i) {
		try {
			if (aClass146_6285 != null) {
				aClass146_6285.method2326();
			}
			if (i != -96) {
				method2992((byte) -58);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vr.Q(" + i + ')');
		}
	}

	@Override
	public final boolean method65(final boolean bool) {
		try {
			if (bool != true) {
				return false;
			}
			return aBoolean6281;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vr.A(" + bool
					+ ')');
		}
	}

	@Override
	public final int method63(final byte i) {
		try {
			if (i != 20) {
				method64(-101);
			}
			return aByte6279;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vr.B(" + i + ')');
		}
	}

	@Override
	final boolean method2982(final byte i) {
		try {
			if (i > -70) {
				method3021(-106, 41, null);
			}
			return aBoolean6284;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vr.HA(" + i + ')');
		}
	}

	@Override
	final void method2988(final ha var_ha, final int i) {
		try {
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vr.MA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	public final int method66(final int i) {
		try {
			if (i != 4657) {
				aBoolean6284 = true;
			}
			return aByte6288;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vr.N(" + i + ')');
		}
	}

	private final Class146 method3019(final int i, final byte i_11_,
			final ha var_ha) {
		try {
			if (aClass146_6285 != null && var_ha.c(aClass146_6285.ua(), i) == 0) {
				return aClass146_6285;
			}
			if (i_11_ < 31) {
				aClass228_6282 = null;
			}
			final Class298 class298 = method3018(var_ha, -56, i, false);
			if (class298 == null) {
				return null;
			}
			return class298.aClass146_2477;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vr.R(" + i + ','
					+ i_11_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	Class246_Sub3_Sub3_Sub2(final ha var_ha,
			final GameObjectDefinition class352, final int i, final int i_12_,
			final int i_13_, final int i_14_, final int i_15_,
			final boolean bool, final int i_16_, final int i_17_,
			final boolean bool_18_) {
		super(i_13_, i_14_, i_15_, i, i_12_, Class77.method780(i_16_,
				(byte) -72, i_17_));
		do {
			try {
				aByte6288 = (byte) i_17_;
				aBoolean6284 = bool_18_;
				aByte6279 = (byte) i_16_;
				aShort6283 = (short) class352.id;
				aBoolean6280 = class352.anInt2998 != 0 && !bool;
				aBoolean6287 = bool;
				((Class246_Sub3) this).anInt5084 = i_13_;
				((Class246_Sub3) this).anInt5079 = i_15_;
				aBoolean6281 = (var_ha.method1771() && class352.aBoolean2935
						&& !aBoolean6287 && Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub7_4073
						.method579((byte) 124) != 0);
				int i_19_ = 2048;
				if (aBoolean6284) {
					i_19_ |= 0x10000;
				}
				final Class298 class298 = method3018(var_ha, -99, i_19_,
						aBoolean6281);
				if (class298 == null) {
					break;
				}
				aClass146_6285 = class298.aClass146_2477;
				aR6286 = class298.aR2479;
				if (!aBoolean6284) {
					break;
				}
				aClass146_6285 = aClass146_6285.method2341((byte) 0, i_19_,
						false);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("vr.<init>(" + (var_ha != null ? "{...}" : "null")
								+ ',' + (class352 != null ? "{...}" : "null")
								+ ',' + i + ',' + i_12_ + ',' + i_13_ + ','
								+ i_14_ + ',' + i_15_ + ',' + bool + ','
								+ i_16_ + ',' + i_17_ + ',' + bool_18_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	public final void method62(final ha var_ha, final int i) {
		do {
			try {
				if (i != 24447) {
					aShort6283 = (short) -43;
				}
				r var_r;
				if (aR6286 == null && aBoolean6281) {
					final Class298 class298 = method3018(var_ha, -49, 262144,
							true);
					var_r = (class298 == null ? null : class298.aR2479);
				} else {
					var_r = aR6286;
					aR6286 = null;
				}
				if (var_r == null) {
					break;
				}
				Class184.method2626(var_r, ((Class246_Sub3) this).aByte5081,
						((Class246_Sub3) this).anInt5084,
						((Class246_Sub3) this).anInt5079, null);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vr.G("
						+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final void method2992(final byte i) {
		do {
			try {
				aBoolean6284 = false;
				if (aClass146_6285 != null) {
					aClass146_6285.s(~0x10000 & aClass146_6285.ua());
				}
				if (i == -73) {
					break;
				}
				method2975(null, -1);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "vr.DA(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final int method2990(final int i) {
		try {
			if (i != 0) {
				return 127;
			}
			if (aClass146_6285 == null) {
				return 0;
			}
			return aClass146_6285.fa();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vr.J(" + i + ')');
		}
	}

	static final Class6 method3020(final int i, final int i_20_) {
		try {
			if (i_20_ <= 101) {
				method3020(26, -94);
			}
			final Class6[] class6s = IncomingOpcode.method520((byte) -63);
			for (int i_21_ = 0; class6s.length > i_21_; i_21_++) {
				final Class6 class6 = class6s[i_21_];
				if ((class6.anInt87 ^ 0xffffffff) == (i ^ 0xffffffff)) {
					return class6;
				}
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vr.S(" + i + ','
					+ i_20_ + ')');
		}
	}

	static final float[] method3021(final int i, final int i_22_,
			final float[] fs) {
		try {
			final float[] fs_23_ = new float[i_22_];
			Class236.method2897(fs, 0, fs_23_, 0, i_22_);
			if (i != -65537) {
				return null;
			}
			return fs_23_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vr.P(" + i + ','
					+ i_22_ + ',' + (fs != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final boolean method2987(final int i) {
		try {
			if (i != 6540) {
				return true;
			}
			if (aClass146_6285 != null) {
				return aClass146_6285.F();
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "vr.I(" + i + ')');
		}
	}

	@Override
	public final void method67(final int i, final ha var_ha) {
		do {
			try {
				if (i == -25163) {
					r var_r;
					if (aR6286 == null && aBoolean6281) {
						final Class298 class298 = method3018(var_ha, i + 25108,
								262144, true);
						var_r = (class298 != null ? class298.aR2479 : null);
					} else {
						var_r = aR6286;
						aR6286 = null;
					}
					if (var_r == null) {
						break;
					}
					Class268.method3254(var_r,
							((Class246_Sub3) this).aByte5081,
							((Class246_Sub3) this).anInt5084,
							((Class246_Sub3) this).anInt5079, null);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vr.E(" + i
						+ ',' + (var_ha != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
