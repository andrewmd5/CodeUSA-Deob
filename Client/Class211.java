/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Rectangle;

final class Class211 {
	static boolean aBoolean1593 = false;
	static Class79 aClass79_1594 = new Class79(260);
	static IncomingOpcode aClass58_1595 = new IncomingOpcode(7, 8);
	static IncomingOpcode aClass58_1596 = new IncomingOpcode(79, 0);

	public static void method2774(final int i) {
		try {
			if (i != 79) {
				method2774(-80);
			}
			aClass79_1594 = null;
			aClass58_1596 = null;
			aClass58_1595 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "nl.B(" + i + ')');
		}
	}

	static final void method2775(final Rectangle[] rectangles, final int i,
			final int i_0_) throws Exception_Sub1 {
		do {
			try {
				do {
					if (Class98_Sub46.anInt4261 != 1) {
						Class154.aHa1231.a(rectangles, i, 0, 0);
						if (!client.aBoolean3553) {
							break;
						}
					}
					Class154.aHa1231.a(rectangles, i,
							(Class98_Sub46_Sub13_Sub2.anInt6309),
							Class272.anInt2037);
				} while (false);
				if (i_0_ == 260) {
					break;
				}
				aClass58_1595 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("nl.A("
						+ (rectangles != null ? "{...}" : "null") + ',' + i
						+ ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}
}
