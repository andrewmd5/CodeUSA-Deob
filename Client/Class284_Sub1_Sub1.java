/* Class284_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class284_Sub1_Sub1 extends Class284_Sub1 {
	static Class200 aClass200_6187 = new Class200();
	private byte[] aByteArray6188;
	static Class263 aClass263_6189;
	static int[] anIntArray6190 = new int[4];

	public static void method3365(final byte i) {
		try {
			aClass263_6189 = null;
			anIntArray6190 = null;
			if (i == 89) {
				aClass200_6187 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ed.K(" + i + ')');
		}
	}

	public Class284_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	final byte[] method3366(final boolean bool, final int i, final int i_0_,
			final int i_1_) {
		try {
			if (bool != true) {
				anIntArray6190 = null;
			}
			aByteArray6188 = new byte[2 * i_0_ * (i_1_ * i)];
			method3361((byte) -37, i_1_, i, i_0_);
			return aByteArray6188;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ed.J(" + bool
					+ ',' + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static long method3367(final long l, final long l_2_) {
		try {
			return l ^ l_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ed.L(" + l + ','
					+ l_2_ + ')');
		}
	}

	@Override
	final void method3363(byte i, final int i_3_, final byte i_4_) {
		try {
			if (i_4_ == 42) {
				int i_5_ = 2 * i_3_;
				i = (byte) (127 + ((i & 0xff) >> 768033697));
				aByteArray6188[i_5_++] = i;
				aByteArray6188[i_5_] = i;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ed.M(" + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final int method3368(final int i, final String string,
			final ByteBuffer class98_sub22) {
		try {
			final int i_6_ = class98_sub22.position;
			final byte[] is = aa.method152(0, string);
			class98_sub22.method1237(is.length, -120);
			if (i != 127) {
				aClass263_6189 = null;
			}
			class98_sub22.position += (Class146_Sub3.aClass213_4949
					.method2780(is.length, class98_sub22.aByteArray3992, 0,
							class98_sub22.position, is, 6350));
			return -i_6_ + class98_sub22.position;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ed.N(" + i + ','
					+ (string != null ? "{...}" : "null") + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass263_6189 = new Class263();
	}
}
