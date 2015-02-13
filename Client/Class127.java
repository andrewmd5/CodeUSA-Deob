/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

final class Class127 implements Runnable {
	private int anInt1016 = 0;
	private IOException anIOException1017;
	static int anInt1018;
	static Class207 aClass207_1019;
	private int anInt1020 = 0;
	private Thread aThread1021;
	private byte[] aByteArray1022;
	private int anInt1023;
	private InputStream anInputStream1024;

	public static void method2218(final int i) {
		do {
			try {
				aClass207_1019 = null;
				if (i == 0) {
					break;
				}
				anInt1018 = -71;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ik.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method2219(final byte i) {
		try {
			if (i <= 85) {
				run();
			}
			anInputStream1024 = new InputStream_Sub2();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ik.C(" + i + ')');
		}
	}

	@Override
	public final void run() {
		try {
			for (;;) {
				int i;
				synchronized (this) {
					for (;;) {
						if (anIOException1017 != null) {
							return;
						}
						if ((anInt1016 ^ 0xffffffff) == -1) {
							i = -1 + -anInt1020 + anInt1023;
						} else if (anInt1016 >= anInt1020) {
							i = -anInt1020 + (anInt1016 - 1);
						} else {
							i = anInt1023 + -anInt1020;
						}
						if ((i ^ 0xffffffff) < -1) {
							break;
						}
						try {
							this.wait();
						} catch (final InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				int i_0_;
				try {
					i_0_ = anInputStream1024.read(aByteArray1022, anInt1020, i);
					if ((i_0_ ^ 0xffffffff) == 0) {
						throw new EOFException();
					}
				} catch (final IOException ioexception) {
					synchronized (this) {
						anIOException1017 = ioexception;
						break;
					}
				}
				synchronized (this) {
					anInt1020 = (i_0_ + anInt1020) % anInt1023;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ik.run(" + ')');
		}
	}

	final void method2220(final int i) {
		try {
			synchronized (this) {
				if (anIOException1017 == null) {
					anIOException1017 = new IOException("");
				}
				notifyAll();
			}
			try {
				if (i <= 53) {
					anInt1018 = 123;
				}
				aThread1021.join();
			} catch (final InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ik.E(" + i + ')');
		}
	}

	final int method2221(final int i, final byte[] is, int i_1_, final byte i_2_)
			throws IOException {
		try {
			if ((i_1_ ^ 0xffffffff) > -1 || (i ^ 0xffffffff) > -1
					|| (is.length ^ 0xffffffff) > (i + i_1_ ^ 0xffffffff)) {
				throw new IOException();
			}
			synchronized (this) {
				int i_3_;
				if ((anInt1020 ^ 0xffffffff) > (anInt1016 ^ 0xffffffff)) {
					i_3_ = anInt1020 + (anInt1023 - anInt1016);
				} else {
					i_3_ = -anInt1016 + anInt1020;
				}
				if (i_2_ != 59) {
					method2220(-89);
				}
				if ((i_1_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
					i_1_ = i_3_;
				}
				if ((i_1_ ^ 0xffffffff) == -1 && anIOException1017 != null) {
					throw new IOException(anIOException1017.toString());
				}
				if (anInt1023 >= anInt1016 - -i_1_) {
					Class236.method2894(aByteArray1022, anInt1016, is, i, i_1_);
				} else {
					final int i_4_ = -anInt1016 + anInt1023;
					Class236.method2894(aByteArray1022, anInt1016, is, i, i_4_);
					Class236.method2894(aByteArray1022, 0, is, i_4_ + i, i_1_
							- i_4_);
				}
				anInt1016 = (anInt1016 - -i_1_) % anInt1023;
				notifyAll();
				return i_1_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("ik.B(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	final boolean method2222(final int i, final byte i_5_) throws IOException {
		try {
			if (i_5_ > -120) {
				aClass207_1019 = null;
			}
			if ((i ^ 0xffffffff) >= -1
					|| (i ^ 0xffffffff) <= (anInt1023 ^ 0xffffffff)) {
				throw new IOException();
			}
			synchronized (this) {
				int i_6_;
				do {
					if ((anInt1016 ^ 0xffffffff) < (anInt1020 ^ 0xffffffff)) {
						i_6_ = anInt1023 - (anInt1016 + -anInt1020);
						if (!client.aBoolean3553) {
							break;
						}
					}
					i_6_ = anInt1020 - anInt1016;
				} while (false);
				if ((i_6_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
					if (anIOException1017 != null) {
						throw new IOException(anIOException1017.toString());
					}
					return false;
				}
				return true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ik.A(" + i + ','
					+ i_5_ + ')');
		}
	}

	Class127(final InputStream inputstream, final int i) {
		try {
			anInt1023 = i - -1;
			anInputStream1024 = inputstream;
			aByteArray1022 = new byte[anInt1023];
			aThread1021 = new Thread(this);
			aThread1021.setDaemon(true);
			aThread1021.start();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("ik.<init>("
							+ (inputstream != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}
}
