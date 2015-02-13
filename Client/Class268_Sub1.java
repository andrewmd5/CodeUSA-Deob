/* Class268_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;

final class Class268_Sub1 extends Class268 {
	private final int anInt5160;
	private static Interface11 anInterface11_5161;

	@Override
	final void method3250(final int i) throws Exception {
		if (i > 32768) {
			throw new IllegalArgumentException();
		}
		anInterface11_5161.method32(i, false, anInt5160);
	}

	@Override
	final void method3257() {
		anInterface11_5161
				.method33(anInt5160, ((Class268) this).anIntArray2005);
	}

	@Override
	final void method3262() {
		anInterface11_5161.method31(111, anInt5160);
	}

	@Override
	final int method3258() {
		return anInterface11_5161.method34((byte) 125, anInt5160);
	}

	@Override
	final void method3259() {
		anInterface11_5161.method30(anInt5160, (byte) -123);
	}

	public static void method3263() {
		anInterface11_5161 = null;
	}

	Class268_Sub1(final Class88 class88, final int i) {
		anInterface11_5161 = (Interface11) class88.method867(false);
		anInt5160 = i;
	}

	@Override
	final void method3253(final Component component) throws Exception {
		anInterface11_5161.method29(Class151_Sub7.aBoolean5007, 103, component,
				Class64_Sub15.anInt3678);
	}
}
