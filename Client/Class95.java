/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class95 {
	static boolean aBoolean798 = false;
	static int anInt799;
	static int[] anIntArray800 = new int[13];

	static final void method920(final byte i) throws IOException {
		do {
			try {
				if (i < 77) {
					method921(true);
				}
				if (aa_Sub1.aClass123_3561 == null
						|| (Class62.anInt490 ^ 0xffffffff) >= -1) {
					break;
				}
				Class160.aClass98_Sub22_1257.position = 0;
				for (;;) {
					final Class98_Sub11 class98_sub11 = ((Class98_Sub11) Class336.aClass148_2827
							.method2418(32));
					if (class98_sub11 == null
							|| (((Class160.aClass98_Sub22_1257.incomingBytes).length + -(Class160.aClass98_Sub22_1257.position)) < class98_sub11.anInt3869)) {
						break;
					}
					Class160.aClass98_Sub22_1257
							.method1217(
									(((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).incomingBytes),
									class98_sub11.anInt3869, -1, 0);
					Class62.anInt490 -= class98_sub11.anInt3869;
					class98_sub11.method942(90);
					class98_sub11.aClass98_Sub22_Sub1_3865.method1201(0);
					class98_sub11.method1125((byte) 6);
				}
				aa_Sub1.aClass123_3561.method2202(-24305,
						Class160.aClass98_Sub22_1257.position,
						(Class160.aClass98_Sub22_1257.incomingBytes), 0);
				Class98_Sub50.anInt4289 += (Class160.aClass98_Sub22_1257.position);
				Class196.anInt1511 = 0;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ft.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method921(final boolean bool) {
		try {
			if (bool != false) {
				anInt799 = 59;
			}
			anIntArray800 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ft.A(" + bool
					+ ')');
		}
	}
}
