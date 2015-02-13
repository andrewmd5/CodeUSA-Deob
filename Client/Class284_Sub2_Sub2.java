/* Class284_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class284_Sub2_Sub2 extends Class284_Sub2 {
	private byte[] aByteArray6196;
	static IncomingOpcode aClass58_6197 = new IncomingOpcode(56, 10);
	static OutgoingOpcode aClass171_6198 = new OutgoingOpcode(54, 7);
	static Class332 aClass332_6199;
	static int[] anIntArray6200;
	static short aShort6201 = 1;
	static int[] anIntArray6202;
	static d aD6203;

	public static void method3378(final int i) {
		try {
			aClass58_6197 = null;
			aClass171_6198 = null;
			anIntArray6202 = null;
			anIntArray6200 = null;
			aD6203 = null;
			if (i == 8) {
				aClass332_6199 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kh.N(" + i + ')');
		}
	}

	public Class284_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@Override
	final void method3375(final int i, final int i_0_, final byte i_1_) {
		try {
			int i_3_ = i * 2;
			aByteArray6196[i_3_++] = (byte) -1;
			final int i_4_ = 0xff & i_1_;
			aByteArray6196[i_3_] = (byte) (3 * i_4_ >> 737825957);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kh.L(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final byte[] method3379(final int i, final int i_5_, final int i_6_,
			final int i_7_) {
		try {
			if (i_5_ != 20283) {
				return null;
			}
			aByteArray6196 = new byte[2 * i_7_ * i_6_ * i];
			method3361((byte) -116, i_7_, i_6_, i);
			return aByteArray6196;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kh.M(" + i + ','
					+ i_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	static {
		anIntArray6200 = new int[16384];
		anIntArray6202 = new int[16384];
		final double d = 3.834951969714103E-4;
		for (int i = 0; (i ^ 0xffffffff) > -16385; i++) {
			anIntArray6200[i] = (int) (16384.0 * Math.sin(i * d));
			anIntArray6202[i] = (int) (Math.cos(d * i) * 16384.0);
		}
	}
}
