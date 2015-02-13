/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

final class Class196 {
	static IncomingOpcode aClass58_1507 = new IncomingOpcode(72, 0);
	static OutgoingOpcode aClass171_1508;
	static Class304 aClass304_1509;
	int anInt1510;
	static int anInt1511 = 0;
	static Class207 aClass207_1512;

	static final int method2665(final boolean bool, final Class164 class164) {
		try {
			if (Class98_Sub40.aClass164_4190 == class164) {
				return 6407;
			}
			if (Class62.aClass164_486 != class164) {
				if (Class53_Sub1.aClass164_3633 != class164) {
					if (Class98_Sub30.aClass164_4088 != class164) {
						if (Class74.aClass164_547 != class164) {
							if (class164 == Class280.aClass164_2101) {
								return 6145;
							}
						} else {
							return 6410;
						}
					} else {
						return 6409;
					}
				} else {
					return 6406;
				}
			} else {
				return 6408;
			}
			if (bool != false) {
				aClass58_1507 = null;
			}
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mu.D(" + bool
					+ ',' + (class164 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2666(final int i, final boolean bool,
			final Class98_Sub18 class98_sub18, final boolean bool_0_) {
		do {
			try {
				final int i_1_ = class98_sub18.anInt3945;
				final int i_2_ = (int) ((Class98) class98_sub18).aLong832;
				class98_sub18.method942(i + -16284);
				if (bool_0_) {
					Class246.method2964(false, i_1_);
				}
				Class17.method239(i ^ 0x4016, i_1_);
				final Class293 class293 = Class159.method2509(i_2_, -9820);
				if (class293 != null) {
					Class341.method3812(class293);
				}
				Class230.method2869(106);
				if (!bool && (Class15.anInt185 ^ 0xffffffff) != 0) {
					Class207.method2764(1, Class15.anInt185, -44);
				}
				final Class61 class61 = new Class61(Class116.aClass377_964);
				for (Class98_Sub18 class98_sub18_3_ = (Class98_Sub18) class61
						.method541(0); class98_sub18_3_ != null; class98_sub18_3_ = (Class98_Sub18) class61
						.method539(i + -16396)) {
					if (!class98_sub18_3_.method941((byte) 78)) {
						class98_sub18_3_ = (Class98_Sub18) class61.method541(0);
						if (class98_sub18_3_ == null) {
							break;
						}
					}
					if ((class98_sub18_3_.anInt3947 ^ 0xffffffff) == -4) {
						final int i_4_ = (int) ((Class98) class98_sub18_3_).aLong832;
						if ((i_1_ ^ 0xffffffff) == (i_4_ >>> 330667472 ^ 0xffffffff)) {
							method2666(16398, bool, class98_sub18_3_, true);
						}
					}
				}
				if (i == 16398) {
					break;
				}
				method2666(-42, true, null, true);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("mu.C(" + i
						+ ',' + bool + ','
						+ (class98_sub18 != null ? "{...}" : "null") + ','
						+ bool_0_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					"mu.toString(" + ')');
		}
	}

	public static void method2667(final byte i) {
		try {
			aClass207_1512 = null;
			aClass171_1508 = null;
			aClass304_1509 = null;
			if (i == -112) {
				aClass58_1507 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "mu.A(" + i + ')');
		}
	}

	static final Class123 method2668(final Socket socket, final byte i,
			final int i_5_) throws IOException {
		try {
			if (i != 11) {
				method2667((byte) 24);
			}
			// System.out.println(socket);
			return new Class123_Sub1(socket, i_5_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mu.B("
					+ (socket != null ? "{...}" : "null") + ',' + i + ','
					+ i_5_ + ')'));
		}
	}

	Class196(final String string, final String string_6_,
			final String string_7_, final int i) {
		try {
			anInt1510 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("mu.<init>("
					+ (string != null ? "{...}" : "null") + ','
					+ (string_6_ != null ? "{...}" : "null") + ','
					+ (string_7_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static {
		aClass171_1508 = new OutgoingOpcode(81, 7);
	}
}
