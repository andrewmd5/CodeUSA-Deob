/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class77 {
	static IncomingOpcode aClass58_591 = new IncomingOpcode(99, 0);
	static IncomingOpcode aClass58_592 = new IncomingOpcode(44, 4);
	static Class293 aClass293_593;

	abstract void method773(byte i);

	abstract void method774(byte i);

	static final void method775(final int i, final Class207 class207,
			final int[] is, final Class207 class207_0_) {
		try {
			if (i != 3) {
				method775(-54, null, null, null);
			}
			if (is != null) {
				Class2.anIntArray70 = is;
			}
			Class64_Sub17.aClass207_3687 = class207;
			Class64_Sub16.aClass207_3683 = class207_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fa.G(" + i + ','
					+ (class207 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ','
					+ (class207_0_ != null ? "{...}" : "null") + ')'));
		}
	}

	abstract Interface7 method776(byte i);

	public static void method777(final byte i) {
		do {
			try {
				aClass58_591 = null;
				aClass58_592 = null;
				aClass293_593 = null;
				if (i == 72) {
					break;
				}
				method780(67, (byte) -65, 92);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fa.H(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method778(final int i, final int i_1_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i_1_, i ^ ~0xd, 14);
			class98_sub46_sub17.method1621(i ^ i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fa.E(" + i + ','
					+ i_1_ + ')');
		}
	}

	public Class77() {
		/* empty */
	}

	abstract boolean method779(int i, int i_2_);

	static final int method780(final int i, final byte i_3_, final int i_4_) {
		try {
			if ((i ^ 0xffffffff) == -2 || (i ^ 0xffffffff) == -4) {
				return Class373.anIntArray3479[i_4_ & 0x3];
			}
			if (i_3_ != -72) {
				return -111;
			}
			return Class137.anIntArray1081[i_4_ & 0x3];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fa.F(" + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}
}
