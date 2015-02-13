/* Class225 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class Class225 {
	private byte[] aByteArray1687;
	private long aLong1688;
	private long aLong1689;
	private long aLong1690;
	private byte[] aByteArray1691;
	private Class356 aClass356_1692;
	private long aLong1693;
	private long aLong1694 = -1L;
	static Class148 aClass148_1695 = new Class148();
	private int anInt1696;
	private long aLong1697;
	private int anInt1698;

	final void method2842(final byte[] is, final int i) throws IOException {
		try {
			method2849(i, is, i + -12913, is.length);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ofa.K("
					+ (is != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method2843(final byte i) throws IOException {
		do {
			try {
				method2845(-1);
				aClass356_1692.method3880(true);
				if (i < -28) {
					break;
				}
				aLong1688 = -117L;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ofa.I(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	private final File method2844(final byte i) {
		try {
			if (i > -121) {
				method2847(true);
			}
			return aClass356_1692.method3876((byte) 3);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ofa.A(" + i + ')');
		}
	}

	private final void method2845(final int i) throws IOException {
		try {
			if (aLong1693 != i) {
				if ((aLong1693 ^ 0xffffffffffffffffL) != (aLong1688 ^ 0xffffffffffffffffL)) {
					aClass356_1692.method3877((byte) 97, aLong1693);
					aLong1688 = aLong1693;
				}
				aClass356_1692.method3882(aByteArray1691, 4657, 0, anInt1698);
				aLong1688 += anInt1698;
				if (aLong1688 > aLong1690) {
					aLong1690 = aLong1688;
				}
				long l = -1L;
				if (aLong1694 > aLong1693 || aLong1693 >= anInt1696 + aLong1694) {
					if (((aLong1693 ^ 0xffffffffffffffffL) >= (aLong1694 ^ 0xffffffffffffffffL))
							&& ((aLong1694 ^ 0xffffffffffffffffL) > (anInt1698
									+ aLong1693 ^ 0xffffffffffffffffL))) {
						l = aLong1694;
					}
				} else {
					l = aLong1693;
				}
				long l_0_ = -1L;
				if (((anInt1698 + aLong1693 ^ 0xffffffffffffffffL) >= (aLong1694 ^ 0xffffffffffffffffL))
						|| (aLong1693 + anInt1698 > aLong1694 + anInt1696)) {
					if (((aLong1693 ^ 0xffffffffffffffffL) > (aLong1694
							+ anInt1696 ^ 0xffffffffffffffffL))
							&& ((anInt1698 + aLong1693 ^ 0xffffffffffffffffL) <= (aLong1694
									+ anInt1696 ^ 0xffffffffffffffffL))) {
						l_0_ = anInt1696 + aLong1694;
					}
				} else {
					l_0_ = anInt1698 + aLong1693;
				}
				if ((l ^ 0xffffffffffffffffL) < 0L && l < l_0_) {
					final int i_1_ = (int) (-l + l_0_);
					Class236.method2894(aByteArray1691, (int) (l - aLong1693),
							aByteArray1687, (int) (l + -aLong1694), i_1_);
				}
				anInt1698 = 0;
				aLong1693 = -1L;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ofa.B(" + i + ')');
		}
	}

	final void method2846(final long l, final int i) throws IOException {
		do {
			try {
				if ((l ^ 0xffffffffffffffffL) > -1L) {
					throw new IOException("Invalid seek to " + l + " in file "
							+ method2844((byte) -127));
				}
				aLong1697 = l;
				if (i == 0) {
					break;
				}
				aLong1693 = 78L;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "ofa.G(" + l
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	final long method2847(final boolean bool) {
		try {
			if (bool != true) {
				method2851(true);
			}
			return aLong1689;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ofa.F(" + bool
					+ ')');
		}
	}

	static final void method2848(final int i, final int i_2_, final int i_3_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i, -113, i_2_);
			class98_sub46_sub17.method1626((byte) -103);
			class98_sub46_sub17.anInt6054 = i_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ofa.J(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method2849(int i, final byte[] is, final int i_4_, int i_5_)
			throws IOException {
		try {
			try {
				if ((is.length ^ 0xffffffff) > (i_5_ + i ^ 0xffffffff)) {
					throw new ArrayIndexOutOfBoundsException(i_5_ + i
							- is.length);
				}
				if (i_4_ != -12913) {
					return;
				}
				if (aLong1693 != -1L
						&& ((aLong1693 ^ 0xffffffffffffffffL) >= (aLong1697 ^ 0xffffffffffffffffL))
						&& ((i_5_ + aLong1697 ^ 0xffffffffffffffffL) >= (aLong1693
								- -(long) anInt1698 ^ 0xffffffffffffffffL))) {
					Class236.method2894(aByteArray1691,
							(int) (aLong1697 - aLong1693), is, i, i_5_);
					aLong1697 += i_5_;
					return;
				}
				final long l = aLong1697;
				final int i_6_ = i;
				final int i_7_ = i_5_;
				if (((aLong1697 ^ 0xffffffffffffffffL) <= (aLong1694 ^ 0xffffffffffffffffL))
						&& ((anInt1696 + aLong1694 ^ 0xffffffffffffffffL) < (aLong1697 ^ 0xffffffffffffffffL))) {
					int i_8_ = (int) (anInt1696 + -aLong1697 + aLong1694);
					if ((i_5_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
						i_8_ = i_5_;
					}
					Class236.method2894(aByteArray1687,
							(int) (aLong1697 - aLong1694), is, i, i_8_);
					i += i_8_;
					aLong1697 += i_8_;
					i_5_ -= i_8_;
				}
				if (i_5_ <= aByteArray1687.length) {
					if (i_5_ > 0) {
						method2850((byte) 113);
						int i_9_ = i_5_;
						if ((anInt1696 ^ 0xffffffff) > (i_9_ ^ 0xffffffff)) {
							i_9_ = anInt1696;
						}
						Class236.method2894(aByteArray1687, 0, is, i, i_9_);
						i += i_9_;
						i_5_ -= i_9_;
						aLong1697 += i_9_;
					}
				} else {
					aClass356_1692.method3877((byte) -121, aLong1697);
					aLong1688 = aLong1697;
					while ((i_5_ ^ 0xffffffff) < -1) {
						final int i_10_ = aClass356_1692.method3879(i_5_,
								(byte) -26, i, is);
						if (i_10_ == -1) {
							break;
						}
						i += i_10_;
						aLong1688 += i_10_;
						i_5_ -= i_10_;
						aLong1697 += i_10_;
					}
				}
				if (aLong1693 != -1L) {
					if (((aLong1697 ^ 0xffffffffffffffffL) > (aLong1693 ^ 0xffffffffffffffffL))
							&& i_5_ > 0) {
						int i_11_ = (int) (aLong1693 - aLong1697) + i;
						if (i_11_ > i_5_ + i) {
							i_11_ = i_5_ + i;
						}
						while (i < i_11_) {
							is[i++] = (byte) 0;
							i_5_--;
							aLong1697++;
						}
					}
					long l_12_ = -1L;
					if (l <= aLong1693 && l + i_7_ > aLong1693) {
						l_12_ = aLong1693;
					} else if (((l ^ 0xffffffffffffffffL) <= (aLong1693 ^ 0xffffffffffffffffL))
							&& l < anInt1698 + aLong1693) {
						l_12_ = l;
					}
					long l_13_ = -1L;
					if (l < aLong1693 + anInt1698
							&& anInt1698 + aLong1693 <= l + i_7_) {
						l_13_ = aLong1693 - -(long) anInt1698;
					} else if (((l + i_7_ ^ 0xffffffffffffffffL) < (aLong1693 ^ 0xffffffffffffffffL))
							&& ((l - -(long) i_7_ ^ 0xffffffffffffffffL) >= (anInt1698
									+ aLong1693 ^ 0xffffffffffffffffL))) {
						l_13_ = i_7_ + l;
					}
					if (l_12_ > -1L && l_12_ < l_13_) {
						final int i_14_ = (int) (l_13_ - l_12_);
						Class236.method2894(aByteArray1691,
								(int) (l_12_ + -aLong1693), is, i_6_
										+ (int) (l_12_ + -l), i_14_);
						if (l_13_ > aLong1697) {
							i_5_ -= l_13_ - aLong1697;
							aLong1697 = l_13_;
						}
					}
				}
			} catch (final IOException ioexception) {
				aLong1688 = -1L;
				throw ioexception;
			}
			if ((i_5_ ^ 0xffffffff) < -1) {
				throw new EOFException();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("ofa.C(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_4_ + ',' + i_5_ + ')'));
		}
	}

	private final void method2850(final byte i) throws IOException {
		try {
			anInt1696 = 0;
			if ((aLong1688 ^ 0xffffffffffffffffL) != (aLong1697 ^ 0xffffffffffffffffL)) {
				aClass356_1692.method3877((byte) -74, aLong1697);
				aLong1688 = aLong1697;
			}
			aLong1694 = aLong1697;
			if (i != 113) {
				method2844((byte) 120);
			}
			int i_15_;
			for (/**/; anInt1696 < aByteArray1687.length; anInt1696 += i_15_) {
				int i_16_ = -anInt1696 + aByteArray1687.length;
				if (i_16_ > 200000000) {
					i_16_ = 200000000;
				}
				i_15_ = aClass356_1692.method3879(i_16_, (byte) -26, anInt1696,
						aByteArray1687);
				if (i_15_ == -1) {
					break;
				}
				aLong1688 += i_15_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ofa.H(" + i + ')');
		}
	}

	public static void method2851(final boolean bool) {
		try {
			if (bool == true) {
				aClass148_1695 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ofa.E(" + bool
					+ ')');
		}
	}

	final void method2852(int i, int i_17_, final int i_18_, final byte[] is)
			throws IOException {
		try {
			try {
				if ((i + aLong1697 ^ 0xffffffffffffffffL) < (aLong1689 ^ 0xffffffffffffffffL)) {
					aLong1689 = aLong1697 - -(long) i;
				}
				if ((aLong1693 ^ 0xffffffffffffffffL) != 0L
						&& (aLong1697 < aLong1693 || ((aLong1697 ^ 0xffffffffffffffffL) < (anInt1698
								+ aLong1693 ^ 0xffffffffffffffffL)))) {
					method2845(-1);
				}
				if (aLong1693 != i_18_
						&& ((aLong1693 + aByteArray1691.length ^ 0xffffffffffffffffL) > (aLong1697
								+ i ^ 0xffffffffffffffffL))) {
					final int i_19_ = (int) (aByteArray1691.length - (aLong1697 + -aLong1693));
					Class236.method2894(is, i_17_, aByteArray1691,
							(int) (aLong1697 - aLong1693), i_19_);
					aLong1697 += i_19_;
					i_17_ += i_19_;
					i -= i_19_;
					anInt1698 = aByteArray1691.length;
					method2845(-1);
				}
				if ((i ^ 0xffffffff) < (aByteArray1691.length ^ 0xffffffff)) {
					if ((aLong1697 ^ 0xffffffffffffffffL) != (aLong1688 ^ 0xffffffffffffffffL)) {
						aClass356_1692.method3877((byte) -23, aLong1697);
						aLong1688 = aLong1697;
					}
					aClass356_1692.method3882(is, i_18_ + 4658, i_17_, i);
					aLong1688 += i;
					if (aLong1690 < aLong1688) {
						aLong1690 = aLong1688;
					}
					long l = -1L;
					long l_20_ = -1L;
					if (((aLong1694 ^ 0xffffffffffffffffL) >= (aLong1697 ^ 0xffffffffffffffffL))
							&& aLong1694 - -(long) anInt1696 > aLong1697) {
						l = aLong1697;
					} else if (((aLong1694 ^ 0xffffffffffffffffL) <= (aLong1697 ^ 0xffffffffffffffffL))
							&& i + aLong1697 > aLong1694) {
						l = aLong1694;
					}
					if (aLong1694 < aLong1697 - -(long) i
							&& ((anInt1696 + aLong1694 ^ 0xffffffffffffffffL) <= (aLong1697
									+ i ^ 0xffffffffffffffffL))) {
						l_20_ = i + aLong1697;
					} else if (aLong1697 < anInt1696 + aLong1694
							&& ((aLong1694 + anInt1696 ^ 0xffffffffffffffffL) >= (aLong1697
									+ i ^ 0xffffffffffffffffL))) {
						l_20_ = aLong1694 - -(long) anInt1696;
					}
					if (l > -1L && l_20_ > l) {
						final int i_21_ = (int) (-l + l_20_);
						Class236.method2894(is, (int) (-aLong1697 + l + i_17_),
								aByteArray1687, (int) (l + -aLong1694), i_21_);
					}
					aLong1697 += i;
				} else if (i > 0) {
					if ((aLong1693 ^ 0xffffffffffffffffL) == 0L) {
						aLong1693 = aLong1697;
					}
					Class236.method2894(is, i_17_, aByteArray1691,
							(int) (aLong1697 - aLong1693), i);
					aLong1697 += i;
					if ((anInt1698 ^ 0xffffffffffffffffL) > (aLong1697
							- aLong1693 ^ 0xffffffffffffffffL)) {
						anInt1698 = (int) (aLong1697 + -aLong1693);
					}
				}
			} catch (final IOException ioexception) {
				aLong1688 = -1L;
				throw ioexception;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ofa.D(" + i + ','
					+ i_17_ + ',' + i_18_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	Class225(final Class356 class356, final int i, final int i_22_)
			throws IOException {
		aLong1693 = -1L;
		anInt1698 = 0;
		try {
			aClass356_1692 = class356;
			aLong1689 = aLong1690 = class356.method3878((byte) -65);
			aLong1697 = 0L;
			aByteArray1687 = new byte[i];
			aByteArray1691 = new byte[i_22_];
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ofa.<init>("
					+ (class356 != null ? "{...}" : "null") + ',' + i + ','
					+ i_22_ + ')'));
		}
	}
}
