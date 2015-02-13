package org.codeusa.cache.format;

import java.io.IOException;

import org.codeusa.cache.CacheManager;
import org.codeusa.cache.stream.RSByteArrayInputStream;
import org.codeusa.cache.stream.RSByteBuffer;

/**
 *
 * @author 'Mystic Flow <Steven@rune-server.org>
 */
public class RSFont {

	private static RSFont[] fonts = new RSFont[1000];
	public static String[] strings = new String[100];
	private final int anInt1390;
	private final int anInt1397;
	private int anInt1394;
	private byte[][] aByteArrayArray1395;
	private final byte[] aByteArray1407;

	public RSFont(final byte[] bs) throws IOException {
		final RSByteBuffer buffer = new RSByteBuffer(
				new RSByteArrayInputStream(bs));
		final int i = buffer.readByte();
		if (i != 0) {
			throw new RuntimeException("");
		}
		final boolean bool = buffer.readByte() == 1;
		aByteArray1407 = new byte[256];
		buffer.read(aByteArray1407, 0, 256);
		if (!bool) {
			anInt1394 = buffer.readByte();
		} else {
			final int[] is = new int[256];
			final int[] is_67_ = new int[256];
			for (int i_68_ = 0; i_68_ < 256; i_68_++) {
				is[i_68_] = buffer.readByte();
			}
			for (int i_69_ = 0; i_69_ < 256; i_69_++) {
				is_67_[i_69_] = buffer.readByte();
			}
			final byte[][] bs_70_ = new byte[256][];
			for (int i_71_ = 0; i_71_ < 256; i_71_++) {
				bs_70_[i_71_] = new byte[is[i_71_]];
				byte b = 0;
				for (int i_72_ = 0; i_72_ < bs_70_[i_71_].length; i_72_++) {
					b += buffer.readByte();
					bs_70_[i_71_][i_72_] = b;
				}
			}
			final byte[][] bs_73_ = new byte[256][];
			for (int i_74_ = 0; i_74_ < 256; i_74_++) {
				bs_73_[i_74_] = new byte[is[i_74_]];
				byte b = 0;
				for (int i_75_ = 0; i_75_ < bs_73_[i_74_].length; i_75_++) {
					b += buffer.readByte();
					bs_73_[i_74_][i_75_] = b;
				}
			}
			aByteArrayArray1395 = new byte[256][256];
			for (int i_76_ = 0; i_76_ < 256; i_76_++) {
				if ((i_76_ != 32) && (i_76_ != 160)) {
					for (int i_77_ = 0; i_77_ < 256; i_77_++) {
						if ((i_77_ != 32) && (i_77_ != 160)) {
							aByteArrayArray1395[i_76_][i_77_] = (byte) method1653(
									bs_73_, aByteArray1407, is, i_77_, i_76_,
									(byte) -13, bs_70_, is_67_);
						}
					}
				}
			}
			anInt1394 = is_67_[32] + is[32];
		}
		buffer.readByte();
		buffer.readByte();
		anInt1390 = buffer.readByte();
		anInt1397 = buffer.readByte();
	}

	static final int method1653(final byte[][] bs, final byte[] bs_0_,
			final int[] is, final int i, final int i_1_, final byte b,
			final byte[][] bs_2_, final int[] is_3_) {
		final int i_4_ = is_3_[i_1_];
		final int i_5_ = i_4_ - -is[i_1_];
		final int i_6_ = is_3_[i];
		final int i_7_ = is[i] + i_6_;
		int i_8_ = i_4_;
		if (i_6_ > i_4_) {
			i_8_ = i_6_;
		}
		int i_9_ = i_5_;
		if (i_5_ > i_7_) {
			i_9_ = i_7_;
		}
		int i_10_ = bs_0_[i_1_] & 0xff;
		if ((bs_0_[i] & 0xff) < i_10_) {
			i_10_ = 0xff & bs_0_[i];
		}
		final byte[] bs_11_ = bs[i_1_];
		final byte[] bs_12_ = bs_2_[i];
		int i_13_ = -i_4_ + i_8_;
		int i_14_ = i_8_ + -i_6_;
		for (int i_15_ = i_8_; i_15_ < i_9_; i_15_++) {
			final int i_16_ = bs_11_[i_13_++] - -bs_12_[i_14_++];
			if (i_16_ < i_10_) {
				i_10_ = i_16_;
			}
		}
		return -i_10_;
	}

	public static RSFont getFont(final int fontId) {
		if (fonts[fontId] == null) {
			loadFont(fontId);
		}
		return fonts[fontId];
	}

	private static void loadFont(final int fontId) {
		try {
			final byte[] bs = CacheManager.getData(13, fontId, 0);
			final RSFont font = new RSFont(bs);
			fonts[fontId] = font;
		} catch (final IOException e) {
			e.printStackTrace();
		}

	}

	public final int method870(final String string, final int i, int i_53_,
			final int i_54_) {
		if (i_53_ == 0) {
			i_53_ = anInt1394;
		}
		final int i_55_ = method866(strings, (byte) -75, string,
				new int[] { i });
		final int i_56_ = i_53_ * (i_55_ - 1);
		return anInt1397 + i_56_ + anInt1390;
	}

	public final int method865(final byte b, final String string, final int i) {
		final int i_8_ = method866(strings, (byte) -75, string, new int[] { i });
		int i_9_ = 0;
		for (int i_10_ = 0; i_8_ > i_10_; i_10_++) {
			final int i_11_ = method867(strings[i_10_], 0);
			if (i_9_ < i_11_) {
				i_9_ = i_11_;
			}
		}
		return i_9_;
	}

	final int method866(final String[] strings, final byte b,
			final String string, final int[] is) {
		if (string == null) {
			return 0;
		}
		int i = 0;
		int i_12_ = 0;
		int i_13_ = -1;
		int i_14_ = 0;
		int i_15_ = 0;
		int i_16_ = -1;
		int i_17_ = -1;
		int i_18_ = 0;
		final int i_19_ = string.length();
		if (b != -75) {
			return 3;
		}
		for (int i_20_ = 0; i_19_ > i_20_; i_20_++) {
			int i_21_ = 0xff & method2355(string.charAt(i_20_), (byte) 101);
			int i_22_ = 0;
			if (i_21_ == 60) {
				i_16_ = i_20_;
			} else {
				int i_23_;
				if ((i_16_ ^ 0xffffffff) == 0) {
					i_23_ = i_20_;
					i_22_ += method862(true, i_21_);
					if ((aByteArrayArray1395 != null)
							&& ((i_17_ ^ 0xffffffff) != 0)) {
						i_22_ += aByteArrayArray1395[i_17_][i_21_];
					}
					i_17_ = i_21_;
				} else {
					if (i_21_ != 62) {
						continue;
					}
					i_23_ = i_16_;
					final String string_24_ = string
							.substring(i_16_ + 1, i_20_);
					i_16_ = -1;
					if (!string_24_.equals("br")) {
						if (!string_24_.equals("lt")) {
							if (string_24_.equals("gt")) {
								i_22_ += method862(true, 62);
								if ((aByteArrayArray1395 != null)
										&& ((i_17_ ^ 0xffffffff) != 0)) {
									i_22_ += aByteArrayArray1395[i_17_][62];
								}
								i_17_ = 62;
							} else if (!string_24_.equals("nbsp")) {
								if (string_24_.equals("shy")) {
									i_22_ += method862(true, 173);
									if ((aByteArrayArray1395 != null)
											&& (i_17_ != -1)) {
										i_22_ += aByteArrayArray1395[i_17_][173];
									}
									i_17_ = 173;
								} else if (!string_24_.equals("times")) {
									if (string_24_.equals("euro")) {
										i_22_ += method862(true, 8364);
										if ((aByteArrayArray1395 != null)
												&& ((i_17_ ^ 0xffffffff) != 0)) {
											i_22_ += aByteArrayArray1395[i_17_][8364];
										}
										i_17_ = 8364;
									} else if (string_24_.equals("copy")) {
										i_22_ += method862(true, 169);
										if ((aByteArrayArray1395 != null)
												&& ((i_17_ ^ 0xffffffff) != 0)) {
											i_22_ += aByteArrayArray1395[i_17_][169];
										}
										i_17_ = 169;
									} else {
										i_22_ += method862(true, 174);
										if ((aByteArrayArray1395 != null)
												&& (i_17_ != -1)) {
											i_22_ += aByteArrayArray1395[i_17_][174];
										}
										i_17_ = 174;
									}
								} else {
									i_22_ += method862(true, 215);
									if ((aByteArrayArray1395 != null)
											&& ((i_17_ ^ 0xffffffff) != 0)) {
										i_22_ += aByteArrayArray1395[i_17_][215];
									}
									i_17_ = 215;
								}
							} else {
								i_22_ += method862(true, 160);
								if ((aByteArrayArray1395 != null)
										&& (i_17_ != -1)) {
									i_22_ += aByteArrayArray1395[i_17_][160];
								}
								i_17_ = 160;
							}
						} else {
							i_22_ += method862(true, 60);
							if ((aByteArrayArray1395 != null)
									&& ((i_17_ ^ 0xffffffff) != 0)) {
								i_22_ += aByteArrayArray1395[i_17_][60];
							}
							i_17_ = 60;
						}
					} else {
						strings[i_18_] = string.substring(i_12_, 1 + i_20_);
						i_18_++;
						if (strings.length <= i_18_) {
							return 0;
						}
						i_12_ = i_20_ - -1;
						i = 0;
						i_17_ = -1;
						i_13_ = -1;
						continue;
					}
					i_21_ = -1;
				}
				if (i_22_ > 0) {
					i += i_22_;
					if (is != null) {
						if (i_21_ == 32) {
							i_15_ = 1;
							i_13_ = i_20_;
							i_14_ = i;
						}
						if ((i ^ 0xffffffff) < (is[is.length > i_18_ ? i_18_
								: -1 + is.length] ^ 0xffffffff)) {
							if (i_13_ >= 0) {
								strings[i_18_] = string.substring(i_12_, 1
										+ i_13_ + -i_15_);
								if (++i_18_ >= strings.length) {
									return 0;
								}
								i_12_ = 1 + i_13_;
								i -= i_14_;
								i_17_ = -1;
								i_13_ = -1;
							} else {
								strings[i_18_] = string.substring(i_12_, i_23_);
								if (++i_18_ >= strings.length) {
									return 0;
								}
								i_17_ = -1;
								i_13_ = -1;
								i_12_ = i_23_;
								i = i_22_;
							}
						}
						if (i_21_ == 45) {
							i_15_ = 0;
							i_13_ = i_20_;
							i_14_ = i;
						}
					}
				}
			}
		}
		if (string.length() > i_12_) {
			strings[i_18_] = string.substring(i_12_, string.length());
			i_18_++;
		}
		return i_18_;
	}

	final int method862(final boolean bool, final int i) {
		return 0xff & aByteArray1407[i];
	}

	final int method867(final String string, final int i) {
		if (string == null) {
			return 0;
		}
		int i_26_ = -1;
		int i_27_ = -1;
		int i_28_ = i;
		final int i_29_ = string.length();
		for (int i_30_ = 0; i_29_ > i_30_; i_30_++) {
			char c = string.charAt(i_30_);
			if (c == 60) {
				i_26_ = i_30_;
			} else {
				if ((c == 62) && ((i_26_ ^ 0xffffffff) != 0)) {
					final String string_31_ = string
							.substring(1 + i_26_, i_30_);
					i_26_ = -1;
					if (string_31_.equals("lt")) {
						c = '<';
					} else if (string_31_.equals("gt")) {
						c = '>';
					} else if (!string_31_.equals("nbsp")) {
						if (string_31_.equals("shy")) {
							c = '\u00ad';
						} else if (!string_31_.equals("times")) {
							if (string_31_.equals("euro")) {
								c = '\u20ac';
							} else if (string_31_.equals("copy")) {
								c = '\u00a9';
							} else if (string_31_.equals("reg")) {
								c = '\u00ae';
							} else {
								continue;
							}
						} else {
							c = '\u00d7';
						}
					} else {
						c = '\u00a0';
					}
				}
				if ((i_26_ ^ 0xffffffff) == 0) {
					i_28_ += 0xff & aByteArray1407[method2355(c, (byte) 121) & 0xff];
					if ((aByteArrayArray1395 != null) && (i_27_ != -1)) {
						i_28_ += aByteArrayArray1395[i_27_][c];
					}
					i_27_ = c;
				}
			}
		}
		return i_28_;
	}

	static final byte method2355(final char c, final byte b) {
		byte b_20_;
		if (((c <= '\0') || (c >= '\u0080'))
				&& ((c < '\u00a0') || (c > '\u00ff'))) {
			if (c == '\u20ac') {
				b_20_ = (byte) -128;
			} else if (c == '\u201a') {
				b_20_ = (byte) -126;
			} else if (c == '\u0192') {
				b_20_ = (byte) -125;
			} else if (c == '\u201e') {
				b_20_ = (byte) -124;
			} else if (c == '\u2026') {
				b_20_ = (byte) -123;
			} else if (c == '\u2020') {
				b_20_ = (byte) -122;
			} else if (c == '\u2021') {
				b_20_ = (byte) -121;
			} else if (c == '\u02c6') {
				b_20_ = (byte) -120;
			} else if (c == '\u2030') {
				b_20_ = (byte) -119;
			} else if (c == '\u0160') {
				b_20_ = (byte) -118;
			} else if (c == '\u2039') {
				b_20_ = (byte) -117;
			} else if (c == '\u0152') {
				b_20_ = (byte) -116;
			} else if (c == '\u017d') {
				b_20_ = (byte) -114;
			} else if (c == '\u2018') {
				b_20_ = (byte) -111;
			} else if (c == '\u2019') {
				b_20_ = (byte) -110;
			} else if (c == '\u201c') {
				b_20_ = (byte) -109;
			} else if (c == '\u201d') {
				b_20_ = (byte) -108;
			} else if (c == '\u2022') {
				b_20_ = (byte) -107;
			} else if (c == '\u2013') {
				b_20_ = (byte) -106;
			} else if (c == '\u2014') {
				b_20_ = (byte) -105;
			} else if (c == '\u02dc') {
				b_20_ = (byte) -104;
			} else if (c == '\u2122') {
				b_20_ = (byte) -103;
			} else if (c == '\u0161') {
				b_20_ = (byte) -102;
			} else if (c == '\u203a') {
				b_20_ = (byte) -101;
			} else if (c == '\u0153') {
				b_20_ = (byte) -100;
			} else if (c == '\u017e') {
				b_20_ = (byte) -98;
			} else if (c != '\u0178') {
				b_20_ = (byte) 63;
			} else {
				b_20_ = (byte) -97;
			}
		} else {
			b_20_ = (byte) c;
		}
		return b_20_;
	}

}