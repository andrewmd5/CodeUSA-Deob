/* Class237_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Class237_Sub1 extends Class237 {
	private int[] anIntArray5040;
	private final byte[][] aByteArrayArray5041 = new byte[10][];
	private int anInt5042;
	private final ByteBuffer aClass98_Sub22_5043 = new ByteBuffer(null);
	static boolean aBoolean5044 = false;
	private int anInt5045;
	private Class207 aClass207_5046;
	static int anInt5047 = 0;
	private final ByteBuffer aClass98_Sub22_5048 = new ByteBuffer(null);

	Class237_Sub1(final int i, final Class207 class207, final int i_0_) {
		super(i);
		try {
			anInt5042 = i_0_;
			aClass207_5046 = class207;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("dha.<init>(" + i + ','
							+ (class207 != null ? "{...}" : "null") + ','
							+ i_0_ + ')'));
		}
	}

	@Override
	final int method2899(final int i, final byte[] is) throws IOException {
		try {
			if (anIntArray5040 == null) {
				if (!aClass207_5046.method2751(0, anInt5042, -6329)) {
					return 0;
				}
				final byte[] is_1_ = aClass207_5046.method2745(0, anInt5042,
						false);
				if (is_1_ == null) {
					throw new IllegalStateException("");
				}
				aClass98_Sub22_5048.incomingBytes = is_1_;
				aClass98_Sub22_5048.position = 0;
				final int i_2_ = is_1_.length >> -830071903;
				anIntArray5040 = new int[i_2_];
				for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_3_++) {
					anIntArray5040[i_3_] = aClass98_Sub22_5048
							.readUnsignedShort((byte) 127);
				}
			}
			if ((anIntArray5040.length ^ 0xffffffff) >= (anInt5045 ^ 0xffffffff)) {
				return -1;
			}
			method2916((byte) 44);
			aClass98_Sub22_5048.position = 0;
			aClass98_Sub22_5048.incomingBytes = is;
			if (i <= 43) {
				anIntArray5040 = null;
			}
			while (aClass98_Sub22_5048.position < (aClass98_Sub22_5048.incomingBytes).length) {
				if (aClass98_Sub22_5043.incomingBytes == null) {
					if (aByteArrayArray5041[0] == null) {
						aClass98_Sub22_5048.incomingBytes = null;
						return aClass98_Sub22_5048.position;
					}
					aClass98_Sub22_5043.incomingBytes = aByteArrayArray5041[0];
				}
				final int i_4_ = (-aClass98_Sub22_5048.position + (aClass98_Sub22_5048.incomingBytes).length);
				final int i_5_ = (-aClass98_Sub22_5043.position + (aClass98_Sub22_5043.incomingBytes).length);
				if ((i_4_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff)) {
					aClass98_Sub22_5048.method1217(
							aClass98_Sub22_5043.incomingBytes, i_5_, -1,
							aClass98_Sub22_5043.position);
					aClass98_Sub22_5043.incomingBytes = null;
					aClass98_Sub22_5043.position = 0;
					anInt5045++;
					for (int i_6_ = 0; i_6_ < 9; i_6_++) {
						aByteArrayArray5041[i_6_] = aByteArrayArray5041[1 + i_6_];
					}
					aByteArrayArray5041[9] = null;
					if (anInt5045 >= anIntArray5040.length) {
						aClass98_Sub22_5048.incomingBytes = null;
						return aClass98_Sub22_5048.position;
					}
				} else {
					aClass98_Sub22_5043.method1190(
							aClass98_Sub22_5048.incomingBytes, true, i_4_,
							aClass98_Sub22_5048.position);
					aClass98_Sub22_5048.incomingBytes = null;
					return is.length;
				}
			}
			aClass98_Sub22_5048.incomingBytes = null;
			return is.length;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("dha.O(" + i + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class332 method2915(final int i, final Class207 class207,
			final byte i_7_) {
		try {
			if (i_7_ != -89) {
				aBoolean5044 = true;
			}
			Class332 class332 = (Class332) Class135.aClass79_1054.method802(
					-123, i);
			if (class332 == null) {
				do {
					if (!Class98_Sub5_Sub2.aBoolean5535) {
						class332 = Class271.method3277(
								class207.method2733(i, 58), 1);
						if (!client.aBoolean3553) {
							break;
						}
					}
					class332 = (Class265.aHa1974.method1758(
							Class324.method3683(class207, i), true));
				} while (false);
				Class135.aClass79_1054.method805(i, class332, (byte) -80);
			}
			return class332;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, ("dha.R(" + i + ','
							+ (class207 != null ? "{...}" : "null") + ','
							+ i_7_ + ')'));
		}
	}

	final void method2916(final byte i) {
		while_56_: do {
			try {
				if (anIntArray5040 != null) {
					if (i != 44) {
						anInt5047 = -49;
					}
					int i_8_ = 0;
					for (;;) {
						if (i_8_ >= 10) {
							break while_56_;
						}
						if (anInt5045 + i_8_ >= anIntArray5040.length) {
							break;
						}
						if (aByteArrayArray5041[i_8_] == null
								&& aClass207_5046.method2751(0,
										(anIntArray5040[anInt5045 + i_8_]),
										-6329)) {
							aByteArrayArray5041[i_8_] = aClass207_5046
									.method2745(
											0,
											(anIntArray5040[(i_8_ + anInt5045)]),
											false);
						}
						i_8_++;
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "dha.S(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
