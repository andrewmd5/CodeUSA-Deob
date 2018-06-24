/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

import java.net.InetAddress;

final class Class265 implements Runnable {
	static short aShort1973;
	static ha aHa1974;
	static int anInt1975;
	private Thread aThread1976;
	static short[] aShortArray1977;
	static String aString1978 = null;
	static Class293 aClass293_1979;
	private final Class148 aClass148_1980 = new Class148();
	static int[] anIntArray1981;
	static Class98_Sub49 aClass98_Sub49_1982;
	static int anInt1983;

	private final void method3228(final int i, final Node node) {
		do {
			try {
				synchronized (aClass148_1980) {
					aClass148_1980.method2419(node, i + -20911);
					aClass148_1980.notify();
				}
				if (i == 0) {
					break;
				}
				method3231(-48);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("qia.A(" + i
						+ ',' + (node != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	@Override
	public final void run() {
		try {
			for (;;) {
				Class98_Sub4 class98_sub4;
				synchronized (aClass148_1980) {
					Node node;
					for (node = aClass148_1980.method2421(6494); node == null; node = aClass148_1980
							.method2421(6494)) {
						try {
							aClass148_1980.wait();
						} catch (final InterruptedException interruptedexception) {
							/* empty */
						}
					}
					if (!(node instanceof Class98_Sub4)) {
						break;
					}
					class98_sub4 = (Class98_Sub4) node;
				}
				int i;
				try {
					final byte[] is = InetAddress.getByName(
							class98_sub4.aString3829).getAddress();
					i = jagmisc.ping(is[0], is[1], is[2], is[3], 1000L);
				} catch (final Throwable throwable) {
					i = 1000;
				}
				class98_sub4.anInt3827 = i;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qia.run(" + ')');
		}
	}

	final Class98_Sub4 method3229(final int i, final String string) {
		try {
			if (i <= 43) {
				return null;
			}
			if (aThread1976 == null) {
				throw new IllegalStateException("");
			}
			if (string == null) {
				throw new IllegalArgumentException("");
			}
			final Class98_Sub4 class98_sub4 = new Class98_Sub4(string);
			method3228(0, class98_sub4);
			return class98_sub4;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qia.D(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method3230(final int i, final int i_0_) {
		try {
			if ((i_0_ ^ 0xffffffff) != -1 && i_0_ != 1 && i_0_ != 2) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qia.E(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method3231(final int i) {
		try {
			aClass293_1979 = null;
			anIntArray1981 = null;
			aClass98_Sub49_1982 = null;
			aString1978 = null;
			aHa1974 = null;
			aShortArray1977 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qia.C(" + i + ')');
		}
	}

	public Class265() {
		try {
			aThread1976 = new Thread(this);
			aThread1976.setDaemon(true);
			aThread1976.start();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "qia.<init>(" + ')');
		}
	}

	final void method3232(final byte i) {
		try {
			if (aThread1976 != null) {
				method3228(0, new Node());
				if (i == -103) {
					try {
						aThread1976.join();
					} catch (final InterruptedException interruptedexception) {
						/* empty */
					}
					aThread1976 = null;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qia.B(" + i + ')');
		}
	}

	static {
		aShort1973 = (short) 256;
		aShortArray1977 = new short[256];
		aClass293_1979 = null;
		anIntArray1981 = new int[14];
		anInt1983 = 0;
		aClass98_Sub49_1982 = new Class98_Sub49(0, -1);
	}
}
