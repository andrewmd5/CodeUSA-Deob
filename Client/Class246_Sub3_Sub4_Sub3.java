/* Class246_Sub3_Sub4_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Rectangle;

final class Class246_Sub3_Sub4_Sub3 extends Class246_Sub3_Sub4 {
	private int anInt6444;
	int anInt6445;
	static OutgoingOpcode aClass171_6446;
	private int anInt6447 = 0;
	private Class246_Sub5 aClass246_Sub5_6448;
	private boolean aBoolean6449 = true;
	boolean aBoolean6450;
	static int[] anIntArray6451 = new int[1000];
	private int anInt6452;
	private int anInt6453;
	private final int anInt6454;
	private int anInt6455;
	private int anInt6456;
	static IncomingOpcode aClass58_6457;
	private AnimationDefinition aClass97_6458;

	Class246_Sub3_Sub4_Sub3(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_, final int i_5_,
			final int i_6_, final int i_7_, final int i_8_, final int i_9_,
			final int i_10_, final int i_11_) {
		super(i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, false,
				(byte) 0);
		anInt6444 = 0;
		anInt6454 = -1;
		anInt6456 = 0;
		aBoolean6450 = false;
		anInt6452 = 0;
		anInt6453 = 0;
		do {
			try {
				anInt6453 = i_11_;
				anInt6445 = i_1_ - -i_0_;
				anInt6455 = i;
				final Class107 class107 = Class196.aClass304_1509.method3564(2,
						anInt6455);
				final int i_12_ = class107.anInt910;
				do {
					if (i_12_ != -1) {
						aClass97_6458 = Class151_Sub7.aClass183_5001
								.method2623(i_12_, 16383);
						aBoolean6450 = false;
						if (!client.aBoolean3553) {
							break;
						}
					}
					aBoolean6450 = true;
				} while (false);
				if ((i_1_ ^ 0xffffffff) != (anInt6445 ^ 0xffffffff)) {
					break;
				}
				Class349.method3840((byte) -127, this, anInt6456, aClass97_6458);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("or.<init>(" + i + ',' + i_0_ + ',' + i_1_ + ','
								+ i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_
								+ ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ','
								+ i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final boolean method2982(final byte i) {
		try {
			if (i >= -70) {
				anInt6453 = -72;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "or.HA(" + i + ')');
		}
	}

	final void method3067(final int i) {
		try {
			if (aClass246_Sub5_6448 != null) {
				aClass246_Sub5_6448.method3114();
			}
			if (i <= 71) {
				method2981(null, (byte) -50, false, 126, null, 99, 56);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "or.B(" + i + ')');
		}
	}

	private final void method3068(final AbstractModel abstractModel, final ha var_ha,
			final int i, final Class111 class111) {
		do {
			try {
				abstractModel.method2343(class111);
				final Surface[] class87s = abstractModel.method2320();
				final SurfaceSkin[] class35s = abstractModel.method2322();
				if ((aClass246_Sub5_6448 == null || aClass246_Sub5_6448.aBoolean5099)
						&& (class87s != null || class35s != null)) {
					aClass246_Sub5_6448 = Class246_Sub5.method3117(
							Class215.anInt1614, true);
				}
				if (i != -17770) {
					method2975(null, 84);
				}
				if (aClass246_Sub5_6448 == null) {
					break;
				}
				aClass246_Sub5_6448.method3120(var_ha, Class215.anInt1614,
						class87s, class35s, false);
				aClass246_Sub5_6448.method3123(
						((Class246_Sub3) this).aByte5088,
						((Class246_Sub3_Sub4) this).aShort6158,
						((Class246_Sub3_Sub4) this).aShort6160,
						((Class246_Sub3_Sub4) this).aShort6157,
						((Class246_Sub3_Sub4) this).aShort6159);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("or.E("
						+ (abstractModel != null ? "{...}" : "null") + ','
						+ (var_ha != null ? "{...}" : "null") + ',' + i + ','
						+ (class111 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final AbstractModel method3069(final ha var_ha, final int i,
			final int i_13_, final int i_14_) {
		try {
			final Class107 class107 = Class196.aClass304_1509.method3564(2,
					i_14_);
			final s var_s = (Class98_Sub46_Sub2_Sub2.aSArray6298[((Class246_Sub3) this).aByte5088]);
			final s var_s_15_ = (((Class246_Sub3) this).aByte5081 < 3 ? (Class98_Sub46_Sub2_Sub2.aSArray6298[((Class246_Sub3) this).aByte5081 + 1])
					: null);
			if (i_13_ != -18981) {
				method3067(92);
			}
			if (aBoolean6450) {
				return class107.method1722(var_ha,
						Class151_Sub7.aClass183_5001, -1, i,
						((Class246_Sub3) this).anInt5084, true, var_s_15_,
						((Class246_Sub3) this).anInt5089, 0, var_s,
						((Class246_Sub3) this).anInt5079, -1, (byte) 2);
			}
			return class107.method1722(var_ha, Class151_Sub7.aClass183_5001,
					anInt6456, i, ((Class246_Sub3) this).anInt5084, true,
					var_s_15_, ((Class246_Sub3) this).anInt5089, anInt6452,
					var_s, ((Class246_Sub3) this).anInt5079, anInt6454,
					(byte) 2);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("or.C("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ','
					+ i_13_ + ',' + i_14_ + ')'));
		}
	}

	@Override
	final void method2981(final Class246_Sub3 class246_sub3, final byte i,
			final boolean bool, final int i_16_, final ha var_ha,
			final int i_17_, final int i_18_) {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("or.CA("
					+ (class246_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + bool + ',' + i_16_ + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_17_ + ','
					+ i_18_ + ')'));
		}
	}

	@Override
	protected final void finalize() {
		do {
			try {
				if (aClass246_Sub5_6448 == null) {
					break;
				}
				aClass246_Sub5_6448.method3114();
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						"or.finalize(" + ')');
			}
			break;
		} while (false);
	}

	@Override
	final int method2990(final int i) {
		try {
			if (i != 0) {
				return -58;
			}
			return anInt6444;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "or.J(" + i + ')');
		}
	}

	static final void method3070(final int i) {
		try {
			if (i > -2) {
				aClass171_6446 = null;
			}
			final Class98_Sub17 class98_sub17 = (Class98_Sub17) Class167.aClass148_1284
					.method2418(32);
			final boolean bool = (Class255.aClass293_3208 != null || (Class156_Sub2.anInt3423 ^ 0xffffffff) < -1);
			final int i_20_ = class98_sub17.method1155(-115);
			final int i_21_ = class98_sub17.method1151(112);
			if (bool) {
				Class21_Sub4.anInt5396 = 1;
			}
			if (bool) {
				Class347.aClass98_Sub46_Sub8_2908 = Class266.aClass98_Sub46_Sub8_1994;
			} else {
				PacketSender.method3604(i_21_, (byte) 78, i_20_,
						Class266.aClass98_Sub46_Sub8_1994);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "or.D(" + i + ')');
		}
	}

	@Override
	final Class246_Sub1 method2975(final ha var_ha, final int i) {
		try {
			final AbstractModel abstractModel = method3069(var_ha,
					0x800 | ((anInt6453 ^ 0xffffffff) != -1 ? 5 : 0), -18981,
					anInt6455);
			if (abstractModel == null) {
				return null;
			}
			if ((anInt6453 ^ 0xffffffff) != -1) {
				abstractModel.a(2048 * anInt6453);
			}
			if (i > -12) {
				anInt6452 = -121;
			}
			final Class111 class111 = var_ha.method1793();
			class111.method2100(((Class246_Sub3) this).anInt5084,
					((Class246_Sub3) this).anInt5089,
					((Class246_Sub3) this).anInt5079);
			method3068(abstractModel, var_ha, -17770, class111);
			final Class246_Sub1 class246_sub1 = Class94.method915(1,
					(byte) -47, false);
			if (Class239.aBoolean1839) {
				abstractModel.method2329(class111,
						(class246_sub1.aClass246_Sub6Array5067[0]),
						Class16.anInt197, 0);
			} else {
				abstractModel.method2325(class111,
						(class246_sub1.aClass246_Sub6Array5067[0]), 0);
			}
			if (aClass246_Sub5_6448 != null) {
				final Class242 class242 = aClass246_Sub5_6448.method3116();
				if (!Class239.aBoolean1839) {
					var_ha.method1820(class242);
				} else {
					var_ha.method1785(class242, Class16.anInt197);
				}
			}
			aBoolean6449 = abstractModel.F();
			anInt6444 = abstractModel.fa();
			anInt6447 = abstractModel.ma();
			return class246_sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("or.QA("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method3071(final int i, final int i_22_, final int i_23_,
			final int i_24_, final int i_25_) {
		try {
			if (i_22_ == -1) {
				for (int i_26_ = 0; ((Class69_Sub2.anInt5335 ^ 0xffffffff) < (i_26_ ^ 0xffffffff)); i_26_++) {
					final Rectangle rectangle = Class98_Sub35.aRectangleArray4144[i_26_];
					if (i_24_ < rectangle.width + rectangle.x
							&& (rectangle.x ^ 0xffffffff) > (i_23_ + i_24_ ^ 0xffffffff)
							&& ((i_25_ ^ 0xffffffff) > (rectangle.y
									- -rectangle.height ^ 0xffffffff))
							&& i + i_25_ > rectangle.y) {
						aa_Sub3.aBooleanArray3574[i_26_] = true;
					}
				}
				Class93_Sub1_Sub1.method908(i + i_25_, i_25_, false, i_24_,
						i_23_ + i_24_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("or.A(" + i + ','
					+ i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')'));
		}
	}

	@Override
	final int method2985(final boolean bool) {
		try {
			if (bool != false) {
				anInt6447 = 45;
			}
			return anInt6447;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "or.O(" + bool
					+ ')');
		}
	}

	@Override
	final boolean method2976(final int i, final ha var_ha, final byte i_27_,
			final int i_28_) {
		try {
			if (i_27_ < 59) {
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("or.TA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ',' + i_27_ + ','
					+ i_28_ + ')'));
		}
	}

	public static void method3072(final int i) {
		do {
			try {
				aClass171_6446 = null;
				anIntArray6451 = null;
				aClass58_6457 = null;
				if (i == 0) {
					break;
				}
				aClass58_6457 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "or.K(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method3073(final byte i, final int i_29_) {
		do {
			try {
				if (!aBoolean6450) {
					anInt6452 += i_29_;
					while ((anInt6452 ^ 0xffffffff) < ((aClass97_6458.anIntArray811[anInt6456]) ^ 0xffffffff)) {
						anInt6452 -= (aClass97_6458.anIntArray811[anInt6456]);
						anInt6456++;
						if (anInt6456 >= (aClass97_6458.anIntArray818).length) {
							aBoolean6450 = true;
							break;
						}
					}
					if (aBoolean6450) {
						break;
					}
					Class349.method3840((byte) -126, this, anInt6456,
							aClass97_6458);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "or.G(" + i
						+ ',' + i_29_ + ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method2988(final ha var_ha, final int i) {
		do {
			try {
				final AbstractModel abstractModel = method3069(var_ha, 0, -18981,
						anInt6455);
				if (abstractModel == null) {
					break;
				}
				final Class111 class111 = var_ha.method1793();
				class111.method2100(((Class246_Sub3) this).anInt5084,
						((Class246_Sub3) this).anInt5089,
						((Class246_Sub3) this).anInt5079);
				method3068(abstractModel, var_ha, -17770, class111);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("or.MA("
						+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final boolean method2978(final int i) {
		try {
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "or.H(" + i + ')');
		}
	}

	@Override
	final void method2992(final byte i) {
		try {
			if (i == -73) {
				throw new IllegalStateException();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "or.DA(" + i + ')');
		}
	}

	@Override
	final Class228 method2974(final byte i, final ha var_ha) {
		try {
			if (i != -53) {
				anIntArray6451 = null;
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("or.KA(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final boolean method2987(final int i) {
		try {
			return aBoolean6449;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "or.I(" + i + ')');
		}
	}

	static {
		aClass171_6446 = new OutgoingOpcode(2, -1);
		aClass58_6457 = new IncomingOpcode(55, -1);
	}
}
