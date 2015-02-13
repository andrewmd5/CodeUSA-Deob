/* Class98_Sub24_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub24_Sub1 extends Class98_Sub24 {
	int anInt5795;
	int anInt5796;
	boolean aBoolean5797;
	int anInt5798;
	byte[] aByteArray5799;

	final Class98_Sub24_Sub1 method1269(final Class314 class314) {
		aByteArray5799 = class314.method3642(true, aByteArray5799);
		anInt5795 = class314.method3643(anInt5795, 1);
		if (anInt5798 == anInt5796) {
			anInt5798 = anInt5796 = class314.method3638(6, anInt5798);
		} else {
			anInt5798 = class314.method3638(6, anInt5798);
			anInt5796 = class314.method3638(6, anInt5796);
			if (anInt5798 == anInt5796) {
				anInt5798--;
			}
		}
		return this;
	}

	Class98_Sub24_Sub1(final int i, final byte[] is, final int i_0_,
			final int i_1_) {
		anInt5795 = i;
		aByteArray5799 = is;
		anInt5798 = i_0_;
		anInt5796 = i_1_;
	}

	Class98_Sub24_Sub1(final int i, final byte[] is, final int i_2_,
			final int i_3_, final boolean bool) {
		anInt5795 = i;
		aByteArray5799 = is;
		anInt5798 = i_2_;
		anInt5796 = i_3_;
		aBoolean5797 = bool;
	}
}
