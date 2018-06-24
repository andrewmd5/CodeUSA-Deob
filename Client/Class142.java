/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class142 {
	static Class377 aClass377_1157 = new Class377(32);
	static Class79 aClass79_1158 = new Class79(64);
	static Class105 aClass105_1159;
	static int anInt1160 = 0;

	public static void method2306(final int i) {
		do {
			try {
				aClass79_1158 = null;
				aClass105_1159 = null;
				aClass377_1157 = null;
				if (i == -1) {
					break;
				}
				anInt1160 = 44;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "jp.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final int method2307(final int i, final int i_0_, final int i_1_) {
		try {
			final double d = Math.log(i_0_) / Math.log(2.0);
			final double d_2_ = Math.log(i) / Math.log(2.0);
			final double d_4_ = d_2_ + Math.random() * (-d_2_ + d);
			return (int) (0.5 + Math.pow(2.0, d_4_));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("jp.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	abstract long method2308(byte i);

	static final void method2309(final int i, final String string) {
		try {
			Class89.aString716 = string;
			if (Class76_Sub11.anApplet3799 != null) {
				try {
					final String string_5_ = Class76_Sub11.anApplet3799
							.getParameter("cookieprefix");
					final String string_6_ = Class76_Sub11.anApplet3799
							.getParameter("cookiehost");
					String string_7_ = (string_5_ + "settings=" + string
							+ "; version=1; path=/; domain=" + string_6_);
					if (i != 19208) {
						aClass105_1159 = null;
					}
					do {
						if ((string.length() ^ 0xffffffff) == -1) {
							string_7_ += "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
							if (!client.aBoolean3553) {
								break;
							}
						}
						string_7_ += ("; Expires="
								+ (Class98_Sub40.method1471(
										5090,
										(94608000000L + Class343.method3819(i
												+ -19255)))) + "; Max-Age=" + 94608000L);
					} while (false);
					Class203.method2706(Class76_Sub11.anApplet3799,
							("document.cookie=\"" + string_7_ + "\""), 9202);
				} catch (final Throwable throwable) {
					/* empty */
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("jp.E(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public Class142() {
		/* empty */
	}

	static final void method2310(final byte i) {
		try {
			Class232.aClass79_1740.method794(18);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "jp.B(" + i + ')');
		}
	}

	static {
		aClass105_1159 = new Class105("", 10);
	}
}
