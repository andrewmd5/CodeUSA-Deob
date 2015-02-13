/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class23 {
	static boolean aBoolean220 = false;
	static int anInt221 = 0;
	static int[] anIntArray222 = new int[1];

	public static void method281(final byte i) {
		try {
			anIntArray222 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bm.A(" + i + ')');
		}
	}

	static final int method282(final int i, final int i_1_) {
		try {
			int i_2_ = i_1_ >>> -219070399;
			i_2_ |= i_2_ >>> 1968182145;
			i_2_ |= i_2_ >>> -2008770942;
			i_2_ |= i_2_ >>> -17314684;
			i_2_ |= i_2_ >>> -9788344;
			i_2_ |= i_2_ >>> 1245334000;
			return (i_2_ ^ 0xffffffff) & i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bm.C(" + i + ','
					+ i_1_ + ')');
		}
	}

	static final void method283(final byte i) {
		try {
			Class356 class356 = null;
			try {
				class356 = Class88.method865(-106, "2");
				final ByteBuffer class98_sub22 = new ByteBuffer(
						6 * Class64_Sub21.anInt3700 + 3);
				class98_sub22.method1194(1, -89);
				class98_sub22.writeShort(Class64_Sub21.anInt3700, 1571862888);
				for (int i_5_ = 0; Class76_Sub5.anIntArray3744.length > i_5_; i_5_++) {
					if (Class140.aBooleanArray3246[i_5_]) {
						class98_sub22.writeShort(i_5_, 1571862888);
						class98_sub22.writeInt(1571862888,
								(Class76_Sub5.anIntArray3744[i_5_]));
					}
				}
				class356.method3882((class98_sub22.aByteArray3992), 4657, 0,
						class98_sub22.position);
			} catch (final Exception exception) {
				/* empty */
			}
			try {
				if (class356 != null) {
					class356.method3880(true);
				}
			} catch (final Exception exception) {
				/* empty */
			}
			r_Sub1.aLong6322 = Class343.method3819(-47);
			Class66.aBoolean507 = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "bm.B(" + i + ')');
		}
	}
}
