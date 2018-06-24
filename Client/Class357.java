/* Class357 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class357 {
	static Class38 aClass38_3026;
	static boolean tweeningEnabled = true;

	public static void method3883(final int i) {
		try {
			aClass38_3026 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "vm.A(" + i + ')');
		}
	}

	static {
		aClass38_3026 = new Class38();
	}
}
