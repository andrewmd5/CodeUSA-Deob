/* Class98_Sub46_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub46_Sub18 extends Class98_Sub46 {
	int anInt6055 = 0;
	static boolean aBoolean6056 = false;

	public Class98_Sub46_Sub18() {
		/* empty */
	}

	private final void method1627(final int i,
			final ByteBuffer class98_sub22, final byte i_0_) {
		do {
			try {
				if (i_0_ == 95) {
					if (i != 2) {
						break;
					}
					anInt6055 = class98_sub22.readUnsignedShort((byte) 127);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("lm.B(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1628(final ByteBuffer class98_sub22, final int i) {
		try {
			if (i > -124) {
				method1628(null, -65);
			}
			for (;;) {
				final int i_1_ = class98_sub22.readUnsignedByte((byte) 124);
				if ((i_1_ ^ 0xffffffff) == -1) {
					break;
				}
				method1627(i_1_, class98_sub22, (byte) 95);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("lm.A(" + (class98_sub22 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}
}
