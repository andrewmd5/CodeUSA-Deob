/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.math.BigInteger;

final class Class109 {
	static int anInt926 = -1;
	private Class135 aClass135_928;
	private ByteBuffer buffer;
	private Class339_Sub1[] aClass339_Sub1Array931;
	private Class98_Sub46_Sub13_Sub1 aClass98_Sub46_Sub13_Sub1_932;
	static boolean aBoolean933;
	static boolean aBoolean934 = false;
	private Class253 aClass253_935;

	static final ha method1732(final int i, final byte i_0_, final int i_1_,
			final Canvas canvas, final d var_d) {
		try {
			return new oa(canvas, var_d, i, i_1_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gu.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ','
					+ (canvas != null ? "{...}" : "null") + ','
					+ (var_d != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class197 method1733(final byte i, final int i_3_,
			final int i_4_, final Class207 class207) {
		try {
			final byte[] is = class207.method2745(i_3_, i_4_, false);
			if (is == null) {
				return null;
			}
			if (i <= 108) {
				return null;
			}
			return new Class197(is);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gu.E(" + i + ','
					+ i_3_ + ',' + i_4_ + ','
					+ (class207 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class339_Sub1 method1734(final int i, final Class17 class17,
			final Class17 class17_5_, final int i_6_) {
		try {
			if (i != 72) {
				return null;
			}
			return method1738(true, class17_5_, i_6_, class17, 96);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("gu.F(" + i + ',' + (class17 != null ? "{...}" : "null")
							+ ',' + (class17_5_ != null ? "{...}" : "null")
							+ ',' + i_6_ + ')'));
		}
	}

	final boolean method1735(final int i) {
		try {
			if (buffer != null) {
				return true;
			}
			if (aClass98_Sub46_Sub13_Sub1_932 == null) {
				if (aClass135_928.method2253(i + 108)) {
					return false;
				}
				aClass98_Sub46_Sub13_Sub1_932 = aClass135_928.method2252(255,
						(byte) 0, 255, 112, true);
			}
			if (((Class98_Sub46_Sub13) aClass98_Sub46_Sub13_Sub1_932).aBoolean6038) {
				return false;
			}
			final ByteBuffer class98_sub22 = new ByteBuffer(
					aClass98_Sub46_Sub13_Sub1_932.method1591(87));
			class98_sub22.position = 5;
			final int i_7_ = class98_sub22.readUnsignedByte((byte) -99);
			class98_sub22.position += 72 * i_7_;
			final byte[] is = (new byte[(class98_sub22.incomingBytes.length - class98_sub22.position)]);
			class98_sub22.method1190(is, true, is.length, 0);
			// byte[] is_8_;
			// if (aBigInteger927 != null && aBigInteger929 != null) {
			// BigInteger biginteger = new BigInteger(is);
			// BigInteger biginteger_9_
			// = biginteger.modPow(aBigInteger927, aBigInteger929);
			// is_8_ = biginteger_9_.toByteArray();
			// } else
			// is_8_ = is;
			/*
			 * if (is_8_.length != 65) throw new RuntimeException();
			 */
			// byte[] is_10_
			// = Class64_Sub11.method595(i, (byte) -128,
			// (((ByteBuffer) class98_sub22)
			// .aByteArray3992),
			// -5 + (((ByteBuffer) class98_sub22)
			// .anInt3991) + -is.length);
			/*
			 * for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -65; i_11_++) { if
			 * ((is_10_[i_11_] ^ 0xffffffff) != (is_8_[i_11_ - -1] ^
			 * 0xffffffff)) throw new RuntimeException(); }
			 */
			buffer = class98_sub22;
			aClass339_Sub1Array931 = new Class339_Sub1[i_7_];
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gu.A(" + i + ')');
		}
	}

	final void method1736(final int i) {
		try {
			if (aClass339_Sub1Array931 != null) {
				for (int i_12_ = i; ((aClass339_Sub1Array931.length ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
					if (aClass339_Sub1Array931[i_12_] != null) {
						aClass339_Sub1Array931[i_12_].method3797(-1);
					}
				}
				for (int i_13_ = 0; i_13_ < aClass339_Sub1Array931.length; i_13_++) {
					if (aClass339_Sub1Array931[i_13_] != null) {
						aClass339_Sub1Array931[i_13_].method3796(7899);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gu.D(" + i + ')');
		}
	}

	static final Class240 method1737(final int i) {
		try {
			try {
				return new Class240_Sub1();
			} catch (final Throwable throwable) {
				if (i != 72) {
					anInt926 = 33;
				}
				try {
					return ((Class240) Class.forName("Class240_Sub2")
							.newInstance());
				} catch (final Throwable throwable_14_) {
					return new Class240_Sub3();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gu.C(" + i + ')');
		}
	}

	Class109(final Class135 class135, final Class253 class253,
			final BigInteger biginteger, final BigInteger biginteger_15_) {
		do {
			try {
				aClass135_928 = class135;
				aClass253_935 = class253;
				if (aClass135_928.method2253(92)) {
					break;
				}
				aClass98_Sub46_Sub13_Sub1_932 = aClass135_928.method2252(255,
						(byte) 0, 255, 105, true);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("gu.<init>("
						+ (class135 != null ? "{...}" : "null") + ','
						+ (class253 != null ? "{...}" : "null") + ','
						+ (biginteger != null ? "{...}" : "null") + ','
						+ (biginteger_15_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final Class339_Sub1 method1738(final boolean bool,
			final Class17 class17, final int i, final Class17 class17_16_,
			final int i_17_) {
		try {
			int version = 0;
			int crc_ = 0;
			final byte[] is = new byte[64];
			if (client.JS5_CHECKSUM_DISABLED) {
				if (buffer == null) {
					throw new RuntimeException();
				}
				if (i < 0 || aClass339_Sub1Array931.length <= i) {
					throw new RuntimeException();
				}
				if (aClass339_Sub1Array931[i] != null) {
					return aClass339_Sub1Array931[i];
				}
				buffer.position = 72 * i - -6;
				crc_ = buffer.readInt(-2);
				version = buffer.readInt(-2);
				buffer.method1190(is, true, 64, 0);
			}
			final Class339_Sub1 class339_sub1 = new Class339_Sub1(i, class17,
					class17_16_, aClass135_928, aClass253_935, crc_, is,
					version, bool);
			aClass339_Sub1Array931[i] = class339_sub1;
			return class339_sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gu.G(" + bool
					+ ',' + (class17 != null ? "{...}" : "null") + ',' + i
					+ ',' + (class17_16_ != null ? "{...}" : "null") + ','
					+ i_17_ + ')'));
		}
	}

	static {
		aBoolean933 = false;
	}
}
