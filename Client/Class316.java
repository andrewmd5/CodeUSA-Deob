/* Class316 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class316 {
	private static String aString2693;
	private static Hashtable aHashtable2694;
	private static boolean aBoolean2695 = false;
	private static int anInt2696;
	private static String aString2697;

	public static File method3648(final int i, final int i_0_,
			final String string, final String string_1_) {
		try {
			if (!aBoolean2695) {
				throw new RuntimeException("");
			}
			final File file = (File) aHashtable2694.get(string);
			if (file != null) {
				return file;
			}
			final String[] strings = { "c:/rscache/", "/rscache/", /*
																	 * "c:/windows/"
																	 * ,
																	 */
			"c:/winnt/", "c:/", aString2693, "/tmp/", "" };
			final String[] strings_2_ = { ".codeusa_beta_cache_" + i,
					".codeusa_file_store_" + i };
			for (int i_3_ = i_0_; (i_3_ ^ 0xffffffff) > -3; i_3_++) {
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (strings_2_.length ^ 0xffffffff); i_4_++) {
					for (int i_5_ = 0; strings.length > i_5_; i_5_++) {
						final String string_6_ = (strings[i_5_]
								+ strings_2_[i_4_] + "/"
								+ (string_1_ != null ? string_1_ + "/" : "") + string);
						RandomAccessFile randomaccessfile = null;
						try {
							final File file_7_ = new File(string_6_);
							if ((i_3_ ^ 0xffffffff) != -1 || file_7_.exists()) {
								final String string_8_ = strings[i_5_];
								if ((i_3_ ^ 0xffffffff) != -2
										|| string_8_.length() <= 0
										|| new File(string_8_).exists()) {
									new File(strings[i_5_] + strings_2_[i_4_])
											.mkdir();
									if (string_1_ != null) {
										new File(strings[i_5_]
												+ strings_2_[i_4_] + "/"
												+ string_1_).mkdir();
									}
									randomaccessfile = new RandomAccessFile(
											file_7_, "rw");
									final int i_9_ = randomaccessfile.read();
									randomaccessfile.seek(0L);
									randomaccessfile.write(i_9_);
									randomaccessfile.seek(0L);
									randomaccessfile.close();
									aHashtable2694.put(string, file_7_);
									return file_7_;
								}
							}
						} catch (final Exception exception) {
							try {
								if (randomaccessfile != null) {
									randomaccessfile.close();
								}
							} catch (final Exception exception_10_) {
								/* empty */
							}
						}
					}
				}
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static File method3649(final String string, final int i) {
		try {
			return method3648(anInt2696, 0, string, aString2697);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static void method3650(final boolean bool, final int i,
			final String string) {
		do {
			try {
				anInt2696 = i;
				aString2697 = string;
				try {
					if (bool != false) {
						break;
					}
					aString2693 = System.getProperty("user.home");
					if (aString2693 != null) {
						aString2693 += "/";
					}
				} catch (final Exception exception) {
					/* empty */
				}
				aBoolean2695 = true;
				if (aString2693 != null) {
					break;
				}
				aString2693 = "~/";
			} catch (final RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	static {
		aHashtable2694 = new Hashtable(16);
	}
}
