/* Class98_Sub22_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

final class Class98_Sub22_Sub2 extends ByteBuffer {
	static OutgoingOpcode aClass171_5792 = new OutgoingOpcode(71, 7);
	static IncomingOpcode aClass58_5793;
	static float aFloat5794 = 0.0F;

	static final int method1262(final int i, final int i_0_) {
		try {
			if (i != 8) {
				method1262(43, -97);
			}
			if (i_0_ < 96) {
				return 0;
			}
			if (i_0_ < 128) {
				return 2;
			}
			return 3;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vda.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	Class98_Sub22_Sub2(final int i) {
		super(i);
	}

	public static void method1263(final int i) {
		try {
			if (i >= -66) {
				method1262(-69, 69);
			}
			aClass58_5793 = null;
			aClass171_5792 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vda.D(" + i + ')');
		}
	}

	final void method1264(final byte i, final float f) {
		try {
			final int i_2_ = Stream.floatToRawIntBits(f);
			((ByteBuffer) this).incomingBytes[((ByteBuffer) this).position++] = (byte) (i_2_ >> -1300741416);
			((ByteBuffer) this).incomingBytes[((ByteBuffer) this).position++] = (byte) (i_2_ >> 494236848);
			((ByteBuffer) this).incomingBytes[((ByteBuffer) this).position++] = (byte) (i_2_ >> -747420472);
			((ByteBuffer) this).incomingBytes[((ByteBuffer) this).position++] = (byte) i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vda.B(" + i + ','
					+ f + ')');
		}
	}

	final void method1265(final byte i, final float f) {
		try {
			final int i_3_ = Stream.floatToRawIntBits(f);
			if (i != -52) {
				aClass171_5792 = null;
			}
			((ByteBuffer) this).incomingBytes[((ByteBuffer) this).position++] = (byte) i_3_;
			((ByteBuffer) this).incomingBytes[((ByteBuffer) this).position++] = (byte) (i_3_ >> 660574952);
			((ByteBuffer) this).incomingBytes[((ByteBuffer) this).position++] = (byte) (i_3_ >> 664922064);
			((ByteBuffer) this).incomingBytes[((ByteBuffer) this).position++] = (byte) (i_3_ >> 566266104);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vda.C(" + i + ','
					+ f + ')');
		}
	}

	static {
		aClass58_5793 = new IncomingOpcode(17, 8);
	}
}
