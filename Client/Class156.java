/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

class Class156 {
	private final ha_Sub1 aHa_Sub1_1246;
	Buffer aBuffer1247;

	final void method2496(final byte[] is, final int i) {
		if (aBuffer1247 == null || aBuffer1247.getSize() < i) {
			aBuffer1247 = aHa_Sub1_1246.aNativeHeap4323.a(i, false);
		}
		aBuffer1247.a(is, 0, 0, i);
	}

	Class156(final ha_Sub1 var_ha_Sub1, final byte[] is, final int i) {
		aHa_Sub1_1246 = var_ha_Sub1;
		aBuffer1247 = aHa_Sub1_1246.aNativeHeap4323.a(i, false);
		if (is != null) {
			aBuffer1247.a(is, 0, 0, i);
		}
	}

	Class156(final ha_Sub1 var_ha_Sub1, final Buffer buffer) {
		aHa_Sub1_1246 = var_ha_Sub1;
		aBuffer1247 = buffer;
	}
}
