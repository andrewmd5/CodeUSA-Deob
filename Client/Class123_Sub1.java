/* Class123_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

final class Class123_Sub1 extends Class123 {
	static int anInt4742;
	private PacketSender aClass307_4743;
	static int anInt4744;
	private Class127 aClass127_4745;
	private Socket aSocket4746;

	static final void method2211(final byte i) {
		try {
			if (i != -23) {
				anInt4742 = -121;
			}
			Class38.aClass100_357.method1690(1);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "caa.B(" + i + ')');
		}
	}

	@Override
	final void method2204(final int i) {
		try {
			aClass127_4745.method2219((byte) 126);
			if (i != -1) {
				aClass307_4743 = null;
			}
			aClass307_4743.method3603(true);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "caa.C(" + i + ')');
		}
	}

	@Override
	protected final void finalize() {
		try {
			method2207(-17);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					"caa.finalize(" + ')');
		}
	}

	@Override
	final int method2208(final byte[] is, final int i, final int i_0_,
			final int i_1_) throws IOException {
		try {
			if (i_0_ != 2047) {
				method2204(38);
			}
			return aClass127_4745.method2221(i, is, i_1_, (byte) 59);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("caa.A("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_0_
					+ ',' + i_1_ + ')'));
		}
	}

	@Override
	final void method2207(final int i) {
		try {
			try {
				if (i >= -3) {
					aSocket4746 = null;
				}
				aSocket4746.close();
			} catch (final IOException ioexception) {
				/* empty */
			}
			aClass127_4745.method2220(85);
			aClass307_4743.method3606((byte) -117);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "caa.F(" + i + ')');
		}
	}

	@Override
	final void method2202(final int i, final int i_2_, final byte[] is,
			final int i_3_) throws IOException {
		try {
			if (i != -24305) {
				method2204(-21);
			}
			aClass307_4743.method3605(i_3_, i_2_, is, i ^ 0x5ef4);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("caa.E(" + i + ',' + i_2_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_3_ + ')'));
		}
	}

	@Override
	final boolean method2203(final int i, final int i_4_) throws IOException {
		try {
			if (i != -1949) {
				method2211((byte) 112);
			}
			return aClass127_4745.method2222(i_4_, (byte) -124);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "caa.D(" + i + ','
					+ i_4_ + ')');
		}
	}

	Class123_Sub1(final Socket socket, final int i) throws IOException {
		try {
			// System.out.println(socket);
			aSocket4746 = socket;
			aSocket4746.setSoTimeout(30000);
			aSocket4746.setTcpNoDelay(true);
			aClass127_4745 = new Class127(aSocket4746.getInputStream(), i);
			aClass307_4743 = new PacketSender(aSocket4746.getOutputStream(), i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("caa.<init>("
					+ (socket != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
