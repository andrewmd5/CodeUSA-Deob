/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class9 {
	int anInt114;
	int anInt115;
	boolean aBoolean116 = false;
	Class335 aClass335_117;

	static final void method189(final Class98_Sub46_Sub9 class98_sub46_sub9,
			final byte i) {
		do {
			try {
				if (i == 87) {
					boolean bool = false;
					class98_sub46_sub9.method1524((byte) -90);
					for (Class98_Sub46_Sub9 class98_sub46_sub9_0_ = ((Class98_Sub46_Sub9) Class98_Sub18.aClass215_3949
							.method2792(-1)); class98_sub46_sub9_0_ != null; class98_sub46_sub9_0_ = ((Class98_Sub46_Sub9) Class98_Sub18.aClass215_3949
							.method2787(0))) {
						if (Class378.method4004((byte) 127,
								class98_sub46_sub9.method1559(78),
								class98_sub46_sub9_0_.method1559(103))) {
							bool = true;
							Class51.method487(i + -38, class98_sub46_sub9_0_,
									class98_sub46_sub9);
							break;
						}
					}
					if (bool) {
						break;
					}
					Class98_Sub18.aClass215_3949.method2785(class98_sub46_sub9,
							-107);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("an.G("
						+ (class98_sub46_sub9 != null ? "{...}" : "null") + ','
						+ i + ')'));
			}
			break;
		} while (false);
	}

	final Class332 method190(final boolean bool, final int i, final int i_1_,
			final ha var_ha) {
		try {
			final long l = i_1_ << -529389104 | anInt114 | (!bool ? 0 : 262144)
					| var_ha.anInt937 << -1675288589;
			Class332 class332 = (Class332) aClass335_117.aClass79_2818
					.method802(-119, l);
			if (class332 != null) {
				return class332;
			}
			if (!aClass335_117.aClass207_2814.method2742(-51, anInt114)) {
				return null;
			}
			final Class324 class324 = Class324.method3685(
					(aClass335_117.aClass207_2814), anInt114, i);
			if (class324 != null) {
				class324.anInt2724 = class324.anInt2725 = class324.anInt2719 = class324.anInt2721 = 0;
				if (bool) {
					class324.method3682();
				}
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
					class324.method3687();
				}
			}
			class332 = var_ha.method1758(class324, true);
			if (class332 != null) {
				aClass335_117.aClass79_2818.method805(l, class332, (byte) -80);
			}
			return class332;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("an.C(" + bool
					+ ',' + i + ',' + i_1_ + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method191(final int i) {
		try {
			return aClass335_117.aClass207_2814.method2742(-68, anInt114);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "an.F(" + i + ')');
		}
	}

	final void method192(final ByteBuffer class98_sub22, final boolean bool) {
		try {
			if (bool != false) {
				method189(null, (byte) 10);
			}
			for (;;) {
				final int i = class98_sub22.readUnsignedByte((byte) -118);
				if ((i ^ 0xffffffff) == -1) {
					break;
				}
				method193(class98_sub22, (byte) -43, i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("an.B(" + (class98_sub22 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	private final void method193(final ByteBuffer class98_sub22,
			final byte i, final int i_4_) {
		do {
			try {
				if (i != -43) {
					method195(79, -65, null);
				}
				if ((i_4_ ^ 0xffffffff) == -2) {
					anInt114 = class98_sub22.readUnsignedShort((byte) 127);
				} else if ((i_4_ ^ 0xffffffff) == -3) {
					anInt115 = class98_sub22.readMediumInt(i ^ 0x56);
				} else if (i_4_ == 3) {
					aBoolean116 = true;
				} else {
					if (i_4_ != 4) {
						break;
					}
					anInt114 = -1;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("an.E("
						+ (class98_sub22 != null ? "{...}" : "null") + ',' + i
						+ ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method194() {
		for (;;) {
			boolean bool = true;
			for (int i = 0; i < Class98_Sub46_Sub5.aClass174Array5970.length; i++) {
				if (!Class98_Sub46_Sub5.aClass174Array5970[i].method2563()) {
					synchronized (Class98_Sub46_Sub5.aClass174Array5970[i]) {
						Class98_Sub46_Sub5.aClass174Array5970[i].notify();
					}
					bool = false;
				} else {
					Class98_Sub10_Sub39.aLongArray5772[i] = Class98_Sub46_Sub5.aClass174Array5970[i]
							.method2562();
				}
			}
			if (bool) {
				break;
			}
			try {
				Class246_Sub7.method3131(0, 1L);
			} catch (final Exception exception) {
				/* empty */
			}
		}
		Class98_Sub46_Sub5.aClass174Array5970[Class98_Sub46_Sub5.aClass174Array5970.length - 1]
				.method2561();
		Class69.method701(1);
		for (;;) {
			boolean bool = true;
			for (int i = 0; i < Class98_Sub46_Sub5.aClass174Array5970.length - 1; i++) {
				if (!Class98_Sub46_Sub5.aClass174Array5970[i].method2563()) {
					synchronized (Class98_Sub46_Sub5.aClass174Array5970[i]) {
						Class98_Sub46_Sub5.aClass174Array5970[i].notify();
					}
					bool = false;
				}
			}
			if (bool) {
				break;
			}
			try {
				Class246_Sub7.method3131(0, 1L);
			} catch (final Exception exception) {
				/* empty */
			}
		}
		for (int i = 1; i < Class98_Sub46_Sub5.aClass174Array5970.length - 2; i++) {
			Class98_Sub46_Sub5.aClass174Array5970[i].method2561();
		}
		Class69.method701(2);
		while (!Class98_Sub46_Sub5.aClass174Array5970[0].method2563()) {
			synchronized (Class98_Sub46_Sub5.aClass174Array5970[0]) {
				Class98_Sub46_Sub5.aClass174Array5970[0].notify();
			}
			try {
				Class246_Sub7.method3131(0, 1L);
			} catch (final Exception exception) {
				/* empty */
			}
		}
		Class98_Sub46_Sub5.aClass174Array5970[0].method2561();
	}

	public Class9() {
		/* empty */
	}

	static final void method195(final int i, final int i_5_,
			final Class293[] class293s) {
		try {
			if (i_5_ != 28219) {
				method194();
			}
			for (int i_6_ = 0; class293s.length > i_6_; i_6_++) {
				final Class293 class293 = class293s[i_6_];
				if (class293 != null && i == class293.anInt2234
						&& !client.method111(class293)) {
					if ((class293.anInt2354 ^ 0xffffffff) == -1) {
						method195(class293.anInt2248, 28219, class293s);
						if (class293.aClass293Array2339 != null) {
							method195(class293.anInt2248, 28219,
									(class293.aClass293Array2339));
						}
						final Class98_Sub18 class98_sub18 = ((Class98_Sub18) (Class116.aClass377_964
								.method3990(class293.anInt2248, -1)));
						if (class98_sub18 != null) {
							Class350.method3844(class98_sub18.anInt3945, i_5_
									+ -28101);
						}
					}
					if (class293.anInt2354 == 6 && class293.anInt2208 != -1) {
						final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
								.method2623(class293.anInt2208, 16383));
						if (class97 != null) {
							class293.anInt2312 += Class279.anInt2099;
							final int i_7_ = class293.anInt2303;
							while ((class293.anInt2312 ^ 0xffffffff) < ((class97.anIntArray811[class293.anInt2303]) ^ 0xffffffff)) {
								class293.anInt2312 -= (class97.anIntArray811[class293.anInt2303]);
								class293.anInt2303++;
								if ((class293.anInt2303 ^ 0xffffffff) <= ((class97.anIntArray818).length ^ 0xffffffff)) {
									class293.anInt2303 -= class97.anInt828;
									if (class293.anInt2303 < 0
											|| (class293.anInt2303 >= (class97.anIntArray818).length)) {
										class293.anInt2303 = 0;
									}
								}
								class293.anInt2287 = 1 + class293.anInt2303;
								if ((class293.anInt2287 ^ 0xffffffff) <= ((class97.anIntArray818).length ^ 0xffffffff)) {
									class293.anInt2287 -= class97.anInt828;
									if (class293.anInt2287 < 0
											|| ((class97.anIntArray818).length <= (class293.anInt2287))) {
										class293.anInt2287 = -1;
									}
								}
								Class341.method3812(class293);
							}
							if (i_7_ != class293.anInt2303) {
								Class280.method3327((class293.anInt2303),
										class97, (byte) 121);
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("an.D(" + i + ',' + i_5_ + ','
							+ (class293s != null ? "{...}" : "null") + ')'));
		}
	}
}
