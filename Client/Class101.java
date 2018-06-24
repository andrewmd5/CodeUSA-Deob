/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.awt.Dimension;

final class Class101 {
	int anInt847;
	static Class126 aClass126_848;
	static int anInt849 = -1;
	int anInt850;
	int anInt851;
	int anInt852;
	int anInt853;
	static int anInt854;
	private byte aByte855;
	static boolean aBoolean856 = true;
	static Class115 aClass115_857;

	public static void method1696(final boolean bool) {
		do {
			try {
				aClass115_857 = null;
				aClass126_848 = null;
				if (bool == true) {
					break;
				}
				method1702(27, true, false);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "gf.D(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method1697(final Class98_Sub46 class98_sub46,
			final byte i, final Class98_Sub46 class98_sub46_0_) {
		try {
			if (i == 37) {
				if (class98_sub46_0_.aClass98_Sub46_4265 != null) {
					class98_sub46_0_.method1524((byte) -90);
				}
				class98_sub46_0_.aClass98_Sub46_4262 = class98_sub46.aClass98_Sub46_4262;
				class98_sub46_0_.aClass98_Sub46_4265 = class98_sub46;
				(class98_sub46_0_.aClass98_Sub46_4265).aClass98_Sub46_4262 = class98_sub46_0_;
				(class98_sub46_0_.aClass98_Sub46_4262).aClass98_Sub46_4265 = class98_sub46_0_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(
							runtimeexception,
							("gf.E("
									+ (class98_sub46 != null ? "{...}" : "null")
									+ ','
									+ i
									+ ','
									+ (class98_sub46_0_ != null ? "{...}"
											: "null") + ')'));
		}
	}

	final int method1698(final boolean bool) {
		try {
			if (bool != true) {
				method1696(false);
			}
			if ((aByte855 & 0x8) != 8) {
				return 0;
			}
			return 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gf.B(" + bool
					+ ')');
		}
	}

	static final void method1699(final Canvas canvas, final int i) {
		try {
			final Dimension dimension = canvas.getSize();
			Class287_Sub2.method3391(dimension.height, dimension.width, 2);
			if (i != 7) {
				method1699(null, -101);
			}
			if ((Class98_Sub46.anInt4261 ^ 0xffffffff) != -2) {
				Class154.aHa1231.method1741(canvas, Class151_Sub7.anInt5005,
						Class149.anInt1208);
			} else {
				Class154.aHa1231.method1741(canvas, aa_Sub1.anInt3556,
						Class48_Sub1_Sub2.anInt5519);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gf.G("
					+ (canvas != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final int method1700(final int i) {
		try {
			if (i != 7) {
				anInt851 = 29;
			}
			return 0x7 & aByte855;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gf.A(" + i + ')');
		}
	}

	static final Class246_Sub3_Sub5 method1701(final int i, final int i_1_,
			final int i_2_) {
		final Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_1_][i_2_];
		if (class172 == null) {
			return null;
		}
		return class172.aClass246_Sub3_Sub5_1334;
	}

	public Class101() {
		/* empty */
	}

	static final void method1702(final int i, final boolean bool,
			final boolean bool_3_) {
		do {
			try {
				if (bool) {
					Class98_Sub18.anInt3952++;
					Class122.method2199(false);
				}
				if (bool_3_) {
					Class98_Sub10_Sub9.anInt5580++;
					Class93_Sub1.method904((byte) -110);
				}
				if (i == 8) {
					break;
				}
				aClass115_857 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("gf.F(" + i
						+ ',' + bool + ',' + bool_3_ + ')'));
			}
			break;
		} while (false);
	}

	Class101(final ByteBuffer class98_sub22) {
		try {
			aByte855 = class98_sub22.readSignedByte((byte) -19);
			anInt852 = class98_sub22.readUnsignedShort((byte) 127);
			anInt847 = class98_sub22.readInt(-2);
			anInt853 = class98_sub22.readInt(-2);
			anInt851 = class98_sub22.readInt(-2);
			anInt850 = class98_sub22.readInt(-2);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gf.<init>("
					+ (class98_sub22 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aClass126_848 = new Class126();
	}
}
