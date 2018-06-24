/* Class246_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub7 extends Class246 {
	static OutgoingOpcode aClass171_5115 = new OutgoingOpcode(30, 4);
	int anInt5116;
	int anInt5117;
	int anInt5118;
	static Class48 aClass48_5119;
	int anInt5120;
	String aString5121;
	int anInt5122;
	int anInt5123;

	static final void method3131(final int i, final long l) {
		try {
			if (i != 0) {
				aClass48_5119 = null;
			}
			
			if ((l ^ 0xffffffffffffffffL) < -1L) {
				if ((l % 10L ^ 0xffffffffffffffffL) != -1L) {
					Class74.method733(l, 75);
					
				} else {
					Class74.method733(-1L + l, 60);
					Class74.method733(1L, i + 116);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mda.C(" + i + ','
					+ l + ')');
		}
	}

	static final int method3132(int i, final byte i_0_, final int i_1_) {
		try {
			if (i_0_ != 118) {
				return 45;
			}
			i = (i_1_ & 0x7f) * i >> -1157637401;
			do {
				if (i >= 2) {
					if ((i ^ 0xffffffff) >= -127) {
						break;
					}
					i = 126;
					if (!client.aBoolean3553) {
						break;
					}
				}
				i = 2;
			} while (false);
			return (i_1_ & 0xff80) + i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("mda.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method3133(final byte i) {
		do {
			try {
				aClass48_5119 = null;
				aClass171_5115 = null;
				if (i == 64) {
					break;
				}
				method3133((byte) -73);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "mda.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public Class246_Sub7() {
		/* empty */
	}
}
