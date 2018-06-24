import jaggl.OpenGL;

/* Class246_Sub3_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub1_Sub1 extends Class246_Sub3_Sub1 implements
		Interface19 {
	private Class228 aClass228_6222;
	static int[] anIntArray6223 = new int[6];
	private boolean aBoolean6224;
	private short aShort6225;
	private byte aByte6226;
	private r aR6227;
	private boolean aBoolean6228;
	private boolean aBoolean6229;
	private AbstractModel aClass146_6230;
	private boolean aBoolean6231;

	@Override
	final boolean method2982(final byte i) {
		try {
			if (i >= -70) {
				aBoolean6231 = false;
			}
			return aBoolean6224;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lo.HA(" + i + ')');
		}
	}

	@Override
	public final void method67(final int i, final ha var_ha) {
		do {
			try {
				if (i == -25163) {
					r var_r;
					if (aR6227 == null && aBoolean6231) {
						final Class298 class298 = method2998(true, var_ha,
								true, 262144);
						var_r = (class298 != null ? class298.aR2479 : null);
					} else {
						var_r = aR6227;
						aR6227 = null;
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
				throw Class64_Sub27.printError(runtimeexception, ("lo.E(" + i
						+ ',' + (var_ha != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	@Override
	public final int method64(final int i) {
		try {
			if (i != 30472) {
				return 37;
			}
			return 0xffff & aShort6225;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lo.C(" + i + ')');
		}
	}

	static final Class345 method2996(final int i, final ha_Sub1 var_ha_Sub1,
			final boolean bool, final String string) {
		try {
			if (bool != false) {
				return null;
			}
			final long l = OpenGL.glCreateShaderObjectARB(i);
			OpenGL.glShaderSourceARB(l, string);
			OpenGL.glCompileShaderARB(l);
			OpenGL.glGetObjectParameterivARB(l, 35713, ha.anIntArray942, 0);
			if (ha.anIntArray942[0] == 0) {
				if (ha.anIntArray942[0] == 0) {
					System.out.println("Shader compile failed:");
				}
				OpenGL.glGetObjectParameterivARB(l, 35716, ha.anIntArray942, 1);
				if ((ha.anIntArray942[1] ^ 0xffffffff) < -2) {
					final byte[] is = new byte[ha.anIntArray942[1]];
					OpenGL.glGetInfoLogARB(l, ha.anIntArray942[1],
							ha.anIntArray942, 0, is, 0);
					System.out.println(new String(is));
				}
				if ((ha.anIntArray942[0] ^ 0xffffffff) == -1) {
					OpenGL.glDeleteObjectARB(l);
					return null;
				}
			}
			return new Class345(var_ha_Sub1, l, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lo.L(" + i + ','
					+ (var_ha_Sub1 != null ? "{...}" : "null") + ',' + bool
					+ ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final int method66(final int i) {
		try {
			if (i != 4657) {
				return -4;
			}
			return aByte6226;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lo.N(" + i + ')');
		}
	}

	static final Class196 method2997(final int i, final int i_0_) {
		try {
			final Class196[] class196s = Class6.method180(94);
			for (int i_1_ = 0; (class196s.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
				final Class196 class196 = class196s[i_1_];
				if ((class196.anInt1510 ^ 0xffffffff) == (i_0_ ^ 0xffffffff)) {
					return class196;
				}
			}
			if (i < 101) {
				anIntArray6223 = null;
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lo.M(" + i + ','
					+ i_0_ + ')');
		}
	}

	@Override
	final boolean method2987(final int i) {
		try {
			if (i != 6540) {
				method3000(23, -77, null);
			}
			if (aClass146_6230 == null) {
				return false;
			}
			return aClass146_6230.F();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lo.I(" + i + ')');
		}
	}

	@Override
	public final int method63(final byte i) {
		try {
			if (i != 20) {
				method63((byte) 84);
			}
			return 22;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lo.B(" + i + ')');
		}
	}

	@Override
	final int method2990(final int i) {
		try {
			if (i != 0) {
				return 87;
			}
			if (aClass146_6230 != null) {
				return aClass146_6230.fa();
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lo.J(" + i + ')');
		}
	}

	private final Class298 method2998(final boolean bool, final ha var_ha,
			final boolean bool_2_, final int i) {
		try {
			if (bool != true) {
				return null;
			}
			final GameObjectDefinition class352 = Class130.aClass302_1028
					.method3546(0xffff & aShort6225, (byte) 119);
			s var_s;
			s var_s_3_;
			if (!aBoolean6228) {
				var_s = (Class98_Sub46_Sub2_Sub2.aSArray6298[((Class246_Sub3) this).aByte5081]);
				if (((Class246_Sub3) this).aByte5081 < 3) {
					var_s_3_ = (Class98_Sub46_Sub2_Sub2.aSArray6298[((Class246_Sub3) this).aByte5081
							- -1]);
				} else {
					var_s_3_ = null;
				}
			} else {
				var_s = Class81.aSArray618[((Class246_Sub3) this).aByte5081];
				var_s_3_ = Class98_Sub46_Sub2_Sub2.aSArray6298[0];
			}
			return class352.method3851(((Class246_Sub3) this).anInt5079, false,
					var_s_3_, aByte6226, ((Class246_Sub3) this).anInt5089,
					bool_2_, ((Class246_Sub3) this).anInt5084, i, null, var_s,
					var_ha, 22);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lo.P(" + bool
					+ ',' + (var_ha != null ? "{...}" : "null") + ',' + bool_2_
					+ ',' + i + ')'));
		}
	}

	Class246_Sub3_Sub1_Sub1(final ha var_ha,
			final GameObjectDefinition class352, final int i, final int i_4_,
			final int i_5_, final int i_6_, final int i_7_, final boolean bool,
			final int i_8_, final boolean bool_9_) {
		super(i_5_, i_6_, i_7_, i, i_4_, class352.anInt2945);
		do {
			try {
				aBoolean6224 = bool_9_;
				aShort6225 = (short) class352.id;
				((Class246_Sub3) this).anInt5084 = i_5_;
				aBoolean6228 = bool;
				aBoolean6229 = ((class352.anInt2998 ^ 0xffffffff) != -1 && !bool);
				((Class246_Sub3) this).anInt5079 = i_7_;
				aByte6226 = (byte) i_8_;
				aBoolean6231 = (var_ha.method1771() && class352.aBoolean2935
						&& !aBoolean6228 && Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub7_4073
						.method579((byte) 123) != 0);
				int i_10_ = 2048;
				if (aBoolean6224) {
					i_10_ |= 0x10000;
				}
				final Class298 class298 = method2998(true, var_ha,
						aBoolean6231, i_10_);
				if (class298 == null) {
					break;
				}
				aClass146_6230 = class298.aClass146_2477;
				aR6227 = class298.aR2479;
				if (!aBoolean6224) {
					break;
				}
				aClass146_6230 = aClass146_6230.method2341((byte) 0, i_10_,
						false);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("lo.<init>("
						+ (var_ha != null ? "{...}" : "null") + ','
						+ (class352 != null ? "{...}" : "null") + ',' + i + ','
						+ i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ','
						+ bool + ',' + i_8_ + ',' + bool_9_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final boolean method2978(final int i) {
		try {
			if (aClass146_6230 == null) {
				return true;
			}
			if (aClass146_6230.r()) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lo.H(" + i + ')');
		}
	}

	@Override
	final boolean method2976(final int i, final ha var_ha, final byte i_12_,
			final int i_13_) {
		try {
			if (i_12_ <= 59) {
				return false;
			}
			final AbstractModel abstractModel = method3000(-69, 131072, var_ha);
			if (abstractModel != null) {
				final Class111 class111 = var_ha.method1793();
				class111.method2100(((Class246_Sub3) this).anInt5084,
						((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5079);
				if (!Class239.aBoolean1839) {
					return abstractModel.method2339(i, i_13_, class111, false, 0);
				}
				return abstractModel.method2333(i, i_13_, class111, false, 0,
						Class16.anInt197);
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lo.TA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_12_ + ','
					+ i_13_ + ')'));
		}
	}

	@Override
	final void method2988(final ha var_ha, final int i) {
		try {
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lo.MA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method2999(final int i) {
		try {
			if (i == 25581) {
				anIntArray6223 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lo.R(" + i + ')');
		}
	}

	@Override
	final int method2985(final boolean bool) {
		try {
			if (bool != false) {
				return 68;
			}
			if (aClass146_6230 == null) {
				return 0;
			}
			return aClass146_6230.ma();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lo.O(" + bool
					+ ')');
		}
	}

	@Override
	final Class228 method2974(final byte i, final ha var_ha) {
		try {
			if (aClass228_6222 == null) {
				aClass228_6222 = (Class48_Sub2_Sub1.method472(
						((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5084,
						method3000(121, 0, var_ha),
						((Class246_Sub3) this).anInt5079, 4));
			}
			if (i != -53) {
				anIntArray6223 = null;
			}
			return aClass228_6222;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lo.KA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method2992(final byte i) {
		do {
			try {
				if (i != -73) {
					aShort6225 = (short) 12;
				}
				aBoolean6224 = false;
				if (aClass146_6230 == null) {
					break;
				}
				aClass146_6230.s(~0x10000 & aClass146_6230.ua());
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "lo.DA(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	private final AbstractModel method3000(final int i, final int i_15_,
			final ha var_ha) {
		try {
			if (aClass146_6230 != null
					&& (var_ha.c(aClass146_6230.ua(), i_15_) ^ 0xffffffff) == -1) {
				return aClass146_6230;
			}
			final Class298 class298 = method2998(true, var_ha, false, i_15_);
			if (class298 == null) {
				return null;
			}
			return class298.aClass146_2477;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lo.S(" + i + ','
					+ i_15_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final void method62(final ha var_ha, final int i) {
		do {
			try {
				if (i != 24447) {
					method2996(95, null, true, null);
				}
				r var_r;
				if (aR6227 == null && aBoolean6231) {
					final Class298 class298 = method2998(true, var_ha, true,
							262144);
					var_r = (class298 != null ? class298.aR2479 : null);
				} else {
					var_r = aR6227;
					aR6227 = null;
				}
				if (var_r == null) {
					break;
				}
				Class184.method2626(var_r, ((Class246_Sub3) this).aByte5081,
						((Class246_Sub3) this).anInt5084,
						((Class246_Sub3) this).anInt5079, null);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("lo.G("
						+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	@Override
	public final boolean method65(final boolean bool) {
		try {
			if (bool != true) {
				aClass228_6222 = null;
			}
			return aBoolean6231;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lo.A(" + bool
					+ ')');
		}
	}

	@Override
	final void method2981(final Class246_Sub3 class246_sub3, final byte i,
			final boolean bool, final int i_17_, final ha var_ha,
			final int i_18_, final int i_19_) {
		do {
			try {
				if (!(class246_sub3 instanceof Class246_Sub3_Sub1_Sub1)) {
					break;
				}
				final Class246_Sub3_Sub1_Sub1 class246_sub3_sub1_sub1_21_ = (Class246_Sub3_Sub1_Sub1) class246_sub3;
				if (aClass146_6230 == null
						|| class246_sub3_sub1_sub1_21_.aClass146_6230 == null) {
					break;
				}
				aClass146_6230.method2332(
						(class246_sub3_sub1_sub1_21_.aClass146_6230), i_17_,
						i_18_, i_19_, bool);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("lo.CA("
						+ (class246_sub3 != null ? "{...}" : "null") + ',' + i
						+ ',' + bool + ',' + i_17_ + ','
						+ (var_ha != null ? "{...}" : "null") + ',' + i_18_
						+ ',' + i_19_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final Class246_Sub1 method2975(final ha var_ha, final int i) {
		try {
			if (aClass146_6230 == null) {
				return null;
			}
			if (i >= -12) {
				aShort6225 = (short) 45;
			}
			final Class111 class111 = var_ha.method1793();
			class111.method2100(((Class246_Sub3) this).anInt5084,
					((Class246_Sub3) this).anInt5089,
					((Class246_Sub3) this).anInt5079);
			final Class246_Sub1 class246_sub1 = Class94.method915(1,
					(byte) -47, aBoolean6229);
			do {
				if (Class239.aBoolean1839) {
					aClass146_6230.method2329(class111,
							(class246_sub1.aClass246_Sub6Array5067[0]),
							Class16.anInt197, 0);
					if (!client.aBoolean3553) {
						break;
					}
				}
				aClass146_6230.method2325(class111,
						(class246_sub1.aClass246_Sub6Array5067[0]), 0);
			} while (false);
			return class246_sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lo.QA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	public final void method61(final byte i) {
		try {
			if (i != -96) {
				method2998(true, null, false, 21);
			}
			if (aClass146_6230 != null) {
				aClass146_6230.method2326();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lo.Q(" + i + ')');
		}
	}
}
