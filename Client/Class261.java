/* Class261 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

final class Class261 {
	static final void method3210(final byte i, final byte[] is, int i_0_,
			final int i_1_, int i_2_, final int i_3_) {
		try {
			if (i_3_ < i_1_) {
				i_2_ += i_3_;
				i_0_ = -i_3_ + i_1_ >> 93881506;
				while (--i_0_ >= 0) {
					is[i_2_++] = (byte) 1;
					is[i_2_++] = (byte) 1;
					is[i_2_++] = (byte) 1;
					is[i_2_++] = (byte) 1;
				}
				i_0_ = -i_3_ + i_1_ & 0x3;
				if (i != -104) {
					method3210((byte) -13, null, -55, -86, -52, 78);
				}
				while (--i_0_ >= 0) {
					is[i_2_++] = (byte) 1;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qga.B(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_
					+ ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method3211(final byte[] is, final int i, final int i_4_,
			final File file) throws IOException {
		try {
			if (i < 122) {
				method3212(72);
			}
			final DataInputStream datainputstream = (new DataInputStream(
					new BufferedInputStream(new FileInputStream(file))));
			try {
				datainputstream.readFully(is, 0, i_4_);
			} catch (final java.io.EOFException eofexception) {
				/* empty */
			}
			datainputstream.close();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qga.C("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_4_
					+ ',' + (file != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3212(final int i) {
		try {
			if (Class98_Sub10_Sub15.anInt5618 < 102) {
				Class98_Sub10_Sub15.anInt5618 += 6;
			}
			if ((Class169.anInt1306 ^ 0xffffffff) != 0
					&& ((Class343.method3819(-47) ^ 0xffffffffffffffffL) < (Class198.aLong1525 ^ 0xffffffffffffffffL))) {
				for (int i_5_ = Class169.anInt1306; ((i_5_ ^ 0xffffffff) > (Class147.aStringArray1189.length ^ 0xffffffff)); i_5_++) {
					if (!Class147.aStringArray1189[i_5_].startsWith("pause")) {
						Class45.aString382 = Class147.aStringArray1189[i_5_];
						Class295.method3484(false, false);
					} else {
						int i_6_ = 5;
						try {
							i_6_ = Integer
									.parseInt(Class147.aStringArray1189[i_5_]
											.substring(6));
						} catch (final Exception exception) {
							/* empty */
						}
						Class98_Sub46.method1525(
								("Pausing for " + i_6_ + " seconds..."), -109);
						Class169.anInt1306 = 1 + i_5_;
						Class198.aLong1525 = Class343.method3819(i + -151)
								+ i_6_ * 1000;
						return;
					}
				}
				Class169.anInt1306 = -1;
			}
			if (Class319.anInt2699 != 0) {
				Class54.anInt3395 -= 5 * Class319.anInt2699;
				if (Class54.anInt3395 >= Class98_Sub28.anInt4080) {
					Class54.anInt3395 = -1 + Class98_Sub28.anInt4080;
				}
				if ((Class54.anInt3395 ^ 0xffffffff) > -1) {
					Class54.anInt3395 = 0;
				}
				Class319.anInt2699 = 0;
			}
			int i_7_ = 0;
			if (i == 104) {
				for (/**/; i_7_ < Class329.anInt2765; i_7_++) {
					final Interface7 interface7 = Class21_Sub1.anInterface7Array5385[i_7_];
					final int i_8_ = interface7.method17(true);
					final char c = interface7.method15(13313);
					final int i_9_ = interface7.method16((byte) 82);
					if ((i_8_ ^ 0xffffffff) == -85) {
						Class295.method3484(false, false);
					}
					if ((i_8_ ^ 0xffffffff) == -81) {
						Class295.method3484(true, false);
					} else if ((i_8_ ^ 0xffffffff) != -67 || (0x4 & i_9_) == 0) {
						if (i_8_ != 67 || (i_9_ & 0x4 ^ 0xffffffff) == -1) {
							if (i_8_ == 85 && Class198.anInt1524 > 0) {
								Class45.aString382 = ((Class45.aString382
										.substring(0, -1 + Class198.anInt1524)) + Class45.aString382
										.substring(Class198.anInt1524));
								Class198.anInt1524--;
							} else if (i_8_ == 101
									&& (Class198.anInt1524 < Class45.aString382
											.length())) {
								Class45.aString382 = (Class45.aString382
										.substring(0, Class198.anInt1524) + (Class45.aString382
										.substring(1 + Class198.anInt1524)));
							} else if (i_8_ == 96 && Class198.anInt1524 > 0) {
								Class198.anInt1524--;
							} else if ((i_8_ ^ 0xffffffff) != -98
									|| (Class198.anInt1524 >= Class45.aString382
											.length())) {
								if (i_8_ == 102) {
									Class198.anInt1524 = 0;
								} else if (i_8_ == 103) {
									Class198.anInt1524 = Class45.aString382
											.length();
								} else if (i_8_ != 104
										|| (Class98_Sub31_Sub2.anInt5822 >= (Class98_Sub46_Sub20.aStringArray6073).length)) {
									if ((i_8_ ^ 0xffffffff) == -106
											&& (Class98_Sub31_Sub2.anInt5822 ^ 0xffffffff) < -1) {
										Class98_Sub31_Sub2.anInt5822--;
										Class206.method2724((byte) 123);
										Class198.anInt1524 = Class45.aString382
												.length();
									} else if (Class114.method2147(c, i ^ 0x4)
											|| (c ^ 0xffffffff) == -93
											|| c == 47 || c == 46
											|| (c ^ 0xffffffff) == -59
											|| c == 44 || c == 32
											|| (c ^ 0xffffffff) == -96
											|| (c ^ 0xffffffff) == -46
											|| c == 43
											|| (c ^ 0xffffffff) == -92
											|| c == 93) {
										Class45.aString382 = ((Class45.aString382
												.substring(0,
														Class198.anInt1524))
												+ Class21_Sub1.anInterface7Array5385[i_7_]
														.method15(13313) + (Class45.aString382
												.substring(Class198.anInt1524)));
										Class198.anInt1524++;
									}
								} else {
									Class98_Sub31_Sub2.anInt5822++;
									Class206.method2724((byte) 127);
									Class198.anInt1524 = Class45.aString382
											.length();
								}
							} else {
								Class198.anInt1524++;
							}
						} else if (Class8.aClipboard113 != null) {
							final Transferable transferable = Class8.aClipboard113
									.getContents(null);
							if (transferable != null) {
								try {
									final String string = ((String) (transferable
											.getTransferData(DataFlavor.stringFlavor)));
									if (string != null) {
										final String[] strings = Class112
												.method2142(string, '\n', false);
										Class98_Sub10_Sub13.method1044(
												(byte) 120, strings);
									}
								} catch (final Exception exception) {
									/* empty */
								}
							}
						}
					} else if (Class8.aClipboard113 != null) {
						String string = "";
						for (int i_10_ = -1
								+ (Class98_Sub46_Sub20.aStringArray6073).length; i_10_ >= 0; i_10_--) {
							if ((Class98_Sub46_Sub20.aStringArray6073[i_10_] != null)
									&& (Class98_Sub46_Sub20.aStringArray6073[i_10_]
											.length() ^ 0xffffffff) < -1) {
								string += (Class98_Sub46_Sub20.aStringArray6073[i_10_]) + '\n';
							}
						}
						Class8.aClipboard113.setContents(new StringSelection(
								string), null);
					}
				}
				Class98_Sub46_Sub1.anInt5949 = 0;
				Class329.anInt2765 = 0;
				Class98_Sub43.method1481(2);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qga.A(" + i + ')');
		}
	}
}
