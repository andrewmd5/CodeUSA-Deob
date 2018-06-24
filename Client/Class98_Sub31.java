/* Class98_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class98_Sub31 extends Node {
	Class98_Sub31 aClass98_Sub31_4101;
	volatile boolean aBoolean4102 = true;
	int anInt4103;
	Class98_Sub24 aClass98_Sub24_4104;

	abstract void method1321(int i);

	abstract Class98_Sub31 method1322();

	int method1323() {
		return 255;
	}

	final void method1324(final int[] is, final int i, final int i_0_) {
		if (aBoolean4102) {
			method1325(is, i, i_0_);
		} else {
			method1321(i_0_);
		}
	}

	abstract void method1325(int[] is, int i, int i_1_);

	abstract int method1326();

	abstract Class98_Sub31 method1327();

	public Class98_Sub31() {
		/* empty */
	}
}
