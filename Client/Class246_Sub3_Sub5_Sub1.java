/* Class246_Sub3_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub3_Sub5_Sub1 extends Class246_Sub3_Sub5 implements
		Interface19 {
	private Class228 aClass228_6217;
	private boolean aBoolean6218 = false;
	Class359 aClass359_6219;
	private boolean aBoolean6220;
	static OutgoingOpcode aClass171_6221 = new OutgoingOpcode(6, 8);

	@Override
	final Class246_Sub1 method2975(final ha var_ha, final int i) {
		try {
			final Class146 class146 = aClass359_6219.method3897(-1, false,
					2048, var_ha, true);
			if (class146 == null) {
				return null;
			}
			final Class111 class111 = var_ha.method1793();
			if (i >= -12) {
				aBoolean6220 = true;
			}
			class111.method2100(
					(((Class246_Sub3_Sub5) this).aShort6165 + ((Class246_Sub3) this).anInt5084),
					((Class246_Sub3) this).anInt5089,
					(((Class246_Sub3) this).anInt5079 + ((Class246_Sub3_Sub5) this).aShort6163));
			final Class246_Sub1 class246_sub1 = Class94.method915(1,
					(byte) -47, aBoolean6220);
			final int i_0_ = ((Class246_Sub3) this).anInt5084 >> -644618167;
			final int i_1_ = ((Class246_Sub3) this).anInt5079 >> -811550487;
			aClass359_6219.method3895(class146, i_0_, i_1_, class111, true,
					i_0_, var_ha, false, i_1_);
			if (Class239.aBoolean1839) {
				class146.method2329(class111,
						(class246_sub1.aClass246_Sub6Array5067[0]),
						Class16.anInt197, 0);
			} else {
				class146.method2325(class111,
						(class246_sub1.aClass246_Sub6Array5067[0]), 0);
			}
			if ((aClass359_6219.aClass246_Sub5_3062) != null) {
				final Class242 class242 = aClass359_6219.aClass246_Sub5_3062
						.method3116();
				if (Class239.aBoolean1839) {
					var_ha.method1785(class242, Class16.anInt197);
				} else {
					var_ha.method1820(class242);
				}
			}
			aBoolean6218 = class146.F()
					|| (aClass359_6219.aClass246_Sub5_3062) != null;
			if (aClass228_6217 != null) {
				Class283.method3350(((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5084, 18,
						((Class246_Sub3) this).anInt5079, class146,
						aClass228_6217);
			} else {
				aClass228_6217 = (Class48_Sub2_Sub1.method472(
						((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5084, class146,
						((Class246_Sub3) this).anInt5079, 4));
			}
			return class246_sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.QA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	public final void method67(final int i, final ha var_ha) {
		try {
			aClass359_6219.method3894((byte) 125, var_ha);
			if (i != -25163) {
				method2974((byte) 25, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.E(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final int method64(final int i) {
		try {
			if (i != 30472) {
				method2978(119);
			}
			return (aClass359_6219.anInt3052);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.C(" + i + ')');
		}
	}

	@Override
	final int method2990(final int i) {
		try {
			if (i != 0) {
				method66(-34);
			}
			return aClass359_6219.method3899((byte) 126);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.J(" + i + ')');
		}
	}

	@Override
	final boolean method2987(final int i) {
		try {
			if (i != 6540) {
				aBoolean6218 = false;
			}
			return aBoolean6218;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.I(" + i + ')');
		}
	}

	@Override
	public final int method63(final byte i) {
		try {
			if (i != 20) {
				method2978(-38);
			}
			return (aClass359_6219.anInt3038);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.B(" + i + ')');
		}
	}

	@Override
	final int method2985(final boolean bool) {
		try {
			if (bool != false) {
				method2978(-53);
			}
			return aClass359_6219.method3903((byte) -127);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.O(" + bool
					+ ')');
		}
	}

	@Override
	final void method2988(final ha var_ha, final int i) {
		try {
			final Class146 class146 = aClass359_6219.method3897(-1, false,
					262144, var_ha, true);
			if (class146 != null) {
				final int i_2_ = ((Class246_Sub3) this).anInt5084 >> -2058956119;
				final int i_3_ = ((Class246_Sub3) this).anInt5079 >> -1110738775;
				final Class111 class111 = var_ha.method1793();
				class111.method2100(((Class246_Sub3) this).anInt5084,
						((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5079);
				aClass359_6219.method3895(class146, i_2_, i_3_, class111,
						false, i_2_, var_ha, false, i_3_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.MA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	public final void method61(final byte i) {
		try {
			if (i != -96) {
				method2988(null, 0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.Q(" + i + ')');
		}
	}

	public static void method3090(final byte i) {
		do {
			try {
				aClass171_6221 = null;
				if (i == -94) {
					break;
				}
				method3090((byte) 106);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ce.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	public final boolean method65(final boolean bool) {
		try {
			if (bool != true) {
				return false;
			}
			return aClass359_6219.method3898(99);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.A(" + bool
					+ ')');
		}
	}

	@Override
	public final void method62(final ha var_ha, final int i) {
		try {
			if (i != 24447) {
				method64(106);
			}
			aClass359_6219.method3892(var_ha, 103);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.G("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method3091(final Class185 class185, final boolean bool) {
		do {
			try {
				aClass359_6219.method3901(class185, -108);
				if (bool == false) {
					break;
				}
				aBoolean6218 = true;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("ce.K(" + (class185 != null ? "{...}" : "null") + ','
								+ bool + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final boolean method2976(final int i, final ha var_ha, final byte i_5_,
			final int i_6_) {
		try {
			final Class146 class146 = aClass359_6219.method3897(-1, false,
					131072, var_ha, false);
			if (class146 == null) {
				return false;
			}
			final Class111 class111 = var_ha.method1793();
			class111.method2100(
					(((Class246_Sub3) this).anInt5084 + ((Class246_Sub3_Sub5) this).aShort6165),
					((Class246_Sub3) this).anInt5089,
					(((Class246_Sub3) this).anInt5079 + ((Class246_Sub3_Sub5) this).aShort6163));
			if (i_5_ < 59) {
				method64(111);
			}
			if (!Class239.aBoolean1839) {
				return class146.method2339(i, i_6_, class111, false, 0);
			}
			return class146.method2333(i, i_6_, class111, false, 0,
					Class16.anInt197);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.TA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_5_ + ','
					+ i_6_ + ')'));
		}
	}

	Class246_Sub3_Sub5_Sub1(final ha var_ha,
			final GameObjectDefinition class352, final int i, final int i_7_,
			final int i_8_, final int i_9_, final int i_10_,
			final boolean bool, final int i_11_, final int i_12_,
			final int i_13_, final int i_14_, final int i_15_) {
		super(i_8_, i_9_, i_10_, i, i_7_, i_11_, i_12_);
		try {
			aClass359_6219 = new Class359(var_ha, class352, i_13_, i_14_,
					((Class246_Sub3) this).aByte5088, i_7_, this, bool, i_15_);
			aBoolean6220 = class352.anInt2998 != 0 && !bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.<init>("
					+ (var_ha != null ? "{...}" : "null") + ','
					+ (class352 != null ? "{...}" : "null") + ',' + i + ','
					+ i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool
					+ ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_
					+ ',' + i_15_ + ')'));
		}
	}

	@Override
	final boolean method2978(final int i) {
		try {
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.H(" + i + ')');
		}
	}

	static final void method3092(final int i, final boolean bool) {
		do {
			try {
				if (i != -1) {
					method3090((byte) 63);
				}
				final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
						.method3023(260, Class15.aClass171_183,
								Class331.aClass117_2811);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				for (Class98_Sub18 class98_sub18 = ((Class98_Sub18) Class116.aClass377_964
						.method3998(94)); class98_sub18 != null; class98_sub18 = ((Class98_Sub18) Class116.aClass377_964
						.method3995(i))) {
					if (!class98_sub18.method941((byte) 78)) {
						class98_sub18 = (Class98_Sub18) Class116.aClass377_964
								.method3998(95);
						if (class98_sub18 == null) {
							break;
						}
					}
					if ((class98_sub18.anInt3947 ^ 0xffffffff) == -1) {
						Class196.method2666(16398, bool, class98_sub18, true);
					}
				}
				if (OutputStream_Sub1.aClass293_33 == null) {
					break;
				}
				Class341.method3812(OutputStream_Sub1.aClass293_33);
				OutputStream_Sub1.aClass293_33 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ce.F(" + i
						+ ',' + bool + ')');
			}
			break;
		} while (false);
	}

	@Override
	public final int method66(final int i) {
		try {
			if (i != 4657) {
				aClass171_6221 = null;
			}
			return (aClass359_6219.anInt3059);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ce.N(" + i + ')');
		}
	}

	@Override
	final Class228 method2974(final byte i, final ha var_ha) {
		try {
			if (i != -53) {
				return null;
			}
			return aClass228_6217;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ce.KA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}
}
