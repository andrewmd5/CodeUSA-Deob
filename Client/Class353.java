/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class353 {
	static int anInt3009;

	static final String method3867(final int i, final String string) {
		try {
			if (string == null) {
				return null;
			}
			int i_0_ = 0;
			int i_1_;
			for (i_1_ = string.length(); i_0_ < i_1_; i_0_++) {
				if (!Class93_Sub2.method911(string.charAt(i_0_), 95)) {
					break;
				}
			}
			for (/**/; (i_0_ < i_1_ && Class93_Sub2.method911(
					string.charAt(-1 + i_1_), 95)); i_1_--) {
				/* empty */
			}
			final int i_2_ = -i_0_ + i_1_;
			if ((i_2_ ^ 0xffffffff) > -2 || i_2_ > 12) {
				return null;
			}
			if (i != -1) {
				anInt3009 = 84;
			}
			final StringBuffer stringbuffer = new StringBuffer(i_2_);
			for (int i_3_ = i_0_; (i_3_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_3_++) {
				final char c = string.charAt(i_3_);
				if (Class98_Sub43_Sub3.method1499((byte) 105, c)) {
					final char c_4_ = Class346.method3829(c, i + 1);
					if ((c_4_ ^ 0xffffffff) != -1) {
						stringbuffer.append(c_4_);
					}
				}
			}
			if (stringbuffer.length() == 0) {
				return null;
			}
			return stringbuffer.toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vi.A(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3868(final int i, final int i_5_, final byte i_6_,
			final int i_7_, final int i_8_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i_5_, -114, 8);
			class98_sub46_sub17.method1626((byte) -103);
			class98_sub46_sub17.anInt6054 = i_7_;
			class98_sub46_sub17.anInt6053 = i;
			class98_sub46_sub17.anInt6051 = i_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("vi.B(" + i + ','
					+ i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final void method3869(final int i, final int i_9_, final int i_10_) {
		do {
			try {
				if (Class21_Sub4.anInt5396 == 1) {
					PacketSender.method3604(i, (byte) 78, i_9_,
							Class347.aClass98_Sub46_Sub8_2908);
				} else if ((Class21_Sub4.anInt5396 ^ 0xffffffff) == -3) {
					if (za_Sub2.aBoolean6079) {
						Class98_Sub4.method953(i - -Class335.method3765(false),
								(i_9_ - -Class189.method2642((byte) 42)), true);
					} else {
						Class98_Sub4.method953(i, i_9_, true);
					}
				}
				Class21_Sub4.anInt5396 = 0;
				Class347.aClass98_Sub46_Sub8_2908 = null;
				if (i_10_ == -2) {
					break;
				}
				method3867(-15, null);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("vi.C(" + i
						+ ',' + i_9_ + ',' + i_10_ + ')'));
			}
			break;
		} while (false);
	}
}
