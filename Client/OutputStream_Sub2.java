/* OutputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class OutputStream_Sub2 extends OutputStream {
	static int anInt39 = -1;
	static int anInt40 = -50;
	static byte[][][] aByteArrayArrayArray41;
	static int[] anIntArray42;

	@Override
	public final void write(final int i) throws IOException {
		try {
			throw new IOException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "taa.write(" + i
					+ ')');
		}
	}

	public static void method132(final int i) {
		try {
			anIntArray42 = null;
			if (i != -1) {
				method132(124);
			}
			aByteArrayArrayArray41 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "taa.A(" + i + ')');
		}
	}
}
