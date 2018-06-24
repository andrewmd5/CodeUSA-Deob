/* IOException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class IOException_Sub1 extends IOException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4368960814481865299L;
	static Class148 aClass148_30 = new Class148();
	static float aFloat31;

	public static void method126(final int i) {
		try {
			if (i == 65535) {
				aClass148_30 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wh.A(" + i + ')');
		}
	}

	IOException_Sub1(final String string) {
		super(string);
	}

	static final int method127(final int i, final int i_0_) {
		if (Class304.aShortArrayArray2534 != null) {
			return Class304.aShortArrayArray2534[i][i_0_] & 0xffff;
		}
		return 0;
	}
}
