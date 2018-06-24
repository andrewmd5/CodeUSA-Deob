/* Class246_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246_Sub10 extends Class246 {
	int anInt5151;
	static volatile boolean aBoolean5152 = true;
	static int anInt5153;
	static int anInt5154;

	static final byte[] method3140(final byte[] is, final int i) {
		try {
			final int i_0_ = is.length;
			final byte[] is_1_ = new byte[i_0_];
			Class236.method2894(is, i, is_1_, 0, i_0_);
			return is_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qe.B("
					+ (is != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final Class93_Sub3 method3141(final ByteBuffer class98_sub22,
			final int i) {
		try {
			final Class93 class93 = Class105.method1716(-1, class98_sub22);
			final int i_2_ = class98_sub22.readInt(-2);
			final int i_4_ = class98_sub22.readInt(-2);
			return new Class93_Sub3(class93.aClass63_3509,
					class93.aClass110_3511, class93.anInt3505,
					class93.anInt3507, class93.anInt3514, class93.anInt3504,
					class93.anInt3508, class93.anInt3506, class93.anInt3513,
					i_2_, i_4_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("qe.A(" + (class98_sub22 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	Class246_Sub10(final int i) {
		try {
			anInt5151 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qe.<init>(" + i
					+ ')');
		}
	}
}
