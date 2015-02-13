/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class73 implements Interface20 {
	int anInt3480;
	int anInt3481;
	static IncomingOpcode aClass58_3482 = new IncomingOpcode(120, -1);
	int anInt3483;
	int anInt3484;
	static Class6 aClass6_3485;
	int anInt3486;
	int anInt3487;
	boolean aBoolean3488;

	static final boolean method719(final int i, final int i_0_, final int i_1_,
			final int i_2_) {
		try {
			RuntimeException_Sub1.aClass111_3203.method2103(i_0_, i_1_, i,
					Class114.anIntArray958);
			final int i_3_ = Class114.anIntArray958[2];
			if ((i_3_ ^ 0xffffffff) > -51) {
				return false;
			}
			Class114.anIntArray958[1] = (Class331.anInt2800
					* Class114.anIntArray958[1] / i_3_ + Class98_Sub10_Sub23.anInt5659);
			Class114.anIntArray958[2] = i_3_;
			Class114.anIntArray958[i_2_] = (Class38.anInt358
					* Class114.anIntArray958[0] / i_3_ + Class2.anInt69);
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eo.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	@Override
	public final long method69(final boolean bool) {
		try {
			final long[] ls = Class374.aLongArray3164;
			long l = -1L;
			l = (l >>> 104055176 ^ ls[(int) (0xffL & (anInt3483 ^ l))]);
			l = (l >>> -1169160440 ^ ls[(int) ((l ^ anInt3480 >> 333698888) & 0xffL)]);
			l = (ls[(int) ((anInt3480 ^ l) & 0xffL)] ^ l >>> 2082866632);
			l = (l >>> 785508872 ^ ls[(int) (0xffL & (l ^ anInt3484 >> 1900552600))]);
			l = ls[(int) ((l ^ anInt3484 >> -944629936) & 0xffL)]
					^ l >>> -784712120;
			l = (l >>> -982760568 ^ ls[(int) (0xffL & (anInt3484 >> -780870712 ^ l))]);
			l = (ls[(int) ((l ^ anInt3484) & 0xffL)] ^ l >>> -723616056);
			l = (l >>> 546854024 ^ ls[(int) (0xffL & (anInt3486 ^ l))]);
			l = ls[(int) ((anInt3487 >> 19611320 ^ l) & 0xffL)]
					^ l >>> -1652365816;
			l = ls[(int) (0xffL & (anInt3487 >> -1593786384 ^ l))]
					^ l >>> 172527176;
			l = (l >>> -2082785080 ^ ls[(int) (0xffL & (l ^ anInt3487 >> -970562392))]);
			l = l >>> 298776520 ^ ls[(int) ((anInt3487 ^ l) & 0xffL)];
			l = (ls[(int) ((l ^ anInt3481) & 0xffL)] ^ l >>> -1877289208);
			l = (l >>> 1282797832 ^ ls[(int) (0xffL & ((!aBoolean3488 ? 0 : 1) ^ l))]);
			if (bool != true) {
				method721(null, -115, '$');
			}
			return l;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eo.C(" + bool
					+ ')');
		}
	}

	@Override
	public final boolean method68(final int i, final Interface20 interface20) {
		try {
			if (!(interface20 instanceof Class73)) {
				return false;
			}
			final Class73 class73_4_ = (Class73) interface20;
			if ((class73_4_.anInt3483 ^ 0xffffffff) != (anInt3483 ^ 0xffffffff)) {
				return false;
			}
			if ((anInt3480 ^ 0xffffffff) != (class73_4_.anInt3480 ^ 0xffffffff)) {
				return false;
			}
			if ((anInt3484 ^ 0xffffffff) != (class73_4_.anInt3484 ^ 0xffffffff)) {
				return false;
			}
			if (anInt3486 != class73_4_.anInt3486) {
				return false;
			}
			if (class73_4_.anInt3487 != anInt3487) {
				return false;
			}
			if (anInt3481 != class73_4_.anInt3481) {
				return false;
			}
			if (i != 22000) {
				anInt3483 = -99;
			}
			if (!aBoolean3488 == class73_4_.aBoolean3488) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("eo.D(" + i + ','
					+ (interface20 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method720(final int i) {
		try {
			aClass58_3482 = null;
			aClass6_3485 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "eo.B(" + i + ')');
		}
	}

	static final int method721(final String string, final int i, final char c) {
		try {
			int i_6_ = 0;
			final int i_7_ = string.length();
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				if ((c ^ 0xffffffff) == (string.charAt(i_8_) ^ 0xffffffff)) {
					i_6_++;
				}
			}
			if (i < 10) {
				method720(61);
			}
			return i_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("eo.E(" + (string != null ? "{...}" : "null") + ',' + i
							+ ',' + c + ')'));
		}
	}
}
