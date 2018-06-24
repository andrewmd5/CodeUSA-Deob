/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class231 {
	static Class324 aClass324_1733;
	static int[] anIntArray1734 = new int[2];
	private int anInt1735;
	int anInt1736;
	Class11 aClass11_1737;
	int anInt1738;
	static int anInt1739;

	static final String method2873(final int i) {
		try {
			if (i != 0) {
				aClass324_1733 = null;
			}
			if (Player.aBoolean6540
					|| Class266.aClass98_Sub46_Sub8_1994 == null) {
				return "";
			}
			return (Class266.aClass98_Sub46_Sub8_1994.aString5994);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "op.C(" + i + ')');
		}
	}

	static final Entity method2874(final int i,
			final int i_0_, final int i_1_, final int i_2_) {
		try {
			final Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_0_][i_1_]);
			if (i_2_ <= 42) {
				method2877(-69);
			}
			if (class172 == null) {
				return null;
			}
			Entity class246_sub3_sub4_sub2 = null;
			int i_3_ = -1;
			for (Class154 class154 = class172.aClass154_1325; class154 != null; class154 = class154.aClass154_1233) {
				final Class246_Sub3_Sub4 class246_sub3_sub4 = class154.aClass246_Sub3_Sub4_1232;
				if (class246_sub3_sub4 instanceof Entity) {
					final Entity class246_sub3_sub4_sub2_4_ = (Entity) class246_sub3_sub4;
					final int i_5_ = (class246_sub3_sub4_sub2_4_.method3034(0)
							* 256 + -256 - -252);
					final int i_6_ = -i_5_
							+ (((Class246_Sub3) class246_sub3_sub4_sub2_4_).anInt5084) >> 734785737;
					final int i_7_ = ((((Class246_Sub3) class246_sub3_sub4_sub2_4_).anInt5079)
							+ -i_5_ >> -1810572375);
					final int i_8_ = ((((Class246_Sub3) class246_sub3_sub4_sub2_4_).anInt5084)
							+ i_5_ >> 1460607529);
					final int i_9_ = ((((Class246_Sub3) class246_sub3_sub4_sub2_4_).anInt5079)
							+ i_5_ >> -397287991);
					if (i_0_ >= i_6_ && i_1_ >= i_7_
							&& (i_0_ ^ 0xffffffff) >= (i_8_ ^ 0xffffffff)
							&& (i_1_ ^ 0xffffffff) >= (i_9_ ^ 0xffffffff)) {
						final int i_10_ = (i_9_ + 1 - i_1_)
								* (i_8_ + 1 + -i_0_);
						if ((i_10_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
							i_3_ = i_10_;
							class246_sub3_sub4_sub2 = class246_sub3_sub4_sub2_4_;
						}
					}
				}
			}
			return class246_sub3_sub4_sub2;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("op.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method2875(final int i, final int i_11_) {
		try {
			if (Class331.anIntArray2810 == null
					|| ((Class331.anIntArray2810.length ^ 0xffffffff) > (i_11_ ^ 0xffffffff))) {
				Class331.anIntArray2810 = new int[i_11_];
			}
			if (i != 256) {
				method2875(-98, 95);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "op.F(" + i + ','
					+ i_11_ + ')');
		}
	}

	final synchronized Class324 method2876(final byte i) {
		try {
			if (i != 126) {
				anInt1739 = -116;
			}
			Class324 class324 = ((Class324) aClass11_1737.aClass79_126
					.method802(-126, anInt1735));
			if (class324 != null) {
				return class324;
			}
			class324 = Class324.method3685((aClass11_1737.aClass207_124),
					anInt1735, 0);
			if (class324 != null) {
				aClass11_1737.aClass79_126.method805(anInt1735, class324,
						(byte) -80);
			}
			return class324;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "op.B(" + i + ')');
		}
	}

	public static void method2877(final int i) {
		try {
			aClass324_1733 = null;
			if (i <= 0) {
				method2878(16);
			}
			anIntArray1734 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "op.H(" + i + ')');
		}
	}

	static final void method2878(final int i) {
		try {
			if (i != 2) {
				anInt1739 = -105;
			}
			Class61.method538(11, false);
			Class373_Sub3.method3977(true);
			System.gc();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "op.D(" + i + ')');
		}
	}

	private final void method2879(final int i,
			final ByteBuffer class98_sub22, final int i_12_) {
		try {
			do {
				if (i != 1) {
					if ((i ^ 0xffffffff) != -3) {
						break;
					}
					anInt1738 = class98_sub22.readUnsignedByte((byte) 84);
					anInt1736 = class98_sub22.readUnsignedByte((byte) -109);
					if (!client.aBoolean3553) {
						break;
					}
				}
				anInt1735 = class98_sub22.readUnsignedShort((byte) 127);
			} while (false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("op.G(" + i + ','
							+ (class98_sub22 != null ? "{...}" : "null") + ','
							+ i_12_ + ')'));
		}
	}

	public Class231() {
		/* empty */
	}

	final void method2880(final boolean bool, final ByteBuffer class98_sub22) {
		try {
			if (bool == true) {
				for (;;) {
					final int i = class98_sub22.readUnsignedByte((byte) -119);
					if (i == 0) {
						break;
					}
					method2879(i, class98_sub22, -127);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("op.A(" + bool
					+ ',' + (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}
}
