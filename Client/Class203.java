/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;

import netscape.javascript.JSObject;

final class Class203 {
	static final Object method2704(final String string, final Applet applet,
			final int i) throws Throwable {
		try {
			if (i != -26978) {
				return null;
			}
			return JSObject.getWindow(applet).call(string, null);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final Object method2705(final int i, final Applet applet,
			final String string, final Object[] objects) throws Throwable {
		try {
			if (i != 26635) {
				return null;
			}
			return JSObject.getWindow(applet).call(string, objects);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final void method2706(final Applet applet, final String string,
			final int i) throws Throwable {
		try {
			JSObject.getWindow(applet).eval(string);
			if (i != 9202) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
