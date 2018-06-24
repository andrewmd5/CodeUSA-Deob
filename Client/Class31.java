/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

abstract class Class31 {
	String aString299;
	static int anInt300 = -2;
	static Interface17 anInterface17_301;
	int anInt302;

	abstract Socket method305(int i) throws IOException;

	static final void method306(final int i, final ByteBuffer class98_sub22) {
		try {
			if (((-class98_sub22.position + class98_sub22.incomingBytes.length) ^ 0xffffffff) <= -2) {
				final int i_0_ = class98_sub22.readUnsignedByte((byte) 38);
				if ((i_0_ ^ 0xffffffff) <= -1
						&& (i_0_ ^ 0xffffffff) >= -2
						&& i == 10090
						&& ((class98_sub22.incomingBytes.length - class98_sub22.position) ^ 0xffffffff) <= -3) {
					final int i_1_ = class98_sub22.readUnsignedShort((byte) 127);
					if (((class98_sub22.incomingBytes.length - class98_sub22.position) ^ 0xffffffff) <= (i_1_ * 6 ^ 0xffffffff)) {
						for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
							final int i_3_ = class98_sub22
									.readUnsignedShort((byte) 127);
							final int i_4_ = class98_sub22.readInt(-2);
							if ((Class76_Sub5.anIntArray3744.length ^ 0xffffffff) < (i_3_ ^ 0xffffffff)
									&& Class140.aBooleanArray3246[i_3_]
									&& (((Class345.aClass132_2889.method2237(
											i_3_, 101).aChar720) ^ 0xffffffff) != -50 || i_4_ >= -1
											&& i_4_ <= 1)) {
								Class76_Sub5.anIntArray3744[i_3_] = i_4_;
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("cda.B(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method307(final boolean bool) {
		do {
			try {
				anInterface17_301 = null;
				if (bool == true) {
					break;
				}
				method307(false);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "cda.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final Socket method308(final byte i) throws IOException {
		try {
			if (i != -53) {
				anInterface17_301 = null;
			}
			return new Socket(aString299, anInt302);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "cda.D(" + i + ')');
		}
	}

	static final int method309(final int i, final byte[] is, final int i_5_) {
		try {
			if (i_5_ != -30091) {
				anInterface17_301 = null;
			}
			return Class365.method3937(i, is, 0, false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("cda.C(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_5_ + ')'));
		}
	}

	public Class31() {
		/* empty */
	}
}
