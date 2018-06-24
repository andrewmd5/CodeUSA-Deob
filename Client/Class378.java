/* Class378 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class378 {
	int anInt3187;
	int anInt3188;
	static Class79 aClass79_3189 = new Class79(8);
	static float aFloat3190;
	int anInt3191;

	static final void method4001(final byte i) {
		do {
			try {
				Class242.aClass244Array1851 = null;
				if (i == -34) {
					break;
				}
				method4001((byte) 62);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "wu.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method4002(final int i) {
		try {
			aClass79_3189 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wu.D(" + i + ')');
		}
	}

	static final int method4003(final int i, final int i_1_, final byte[][] is,
			final boolean bool, final int[] is_2_, final byte[][] is_3_,
			final int[] is_4_, final byte[] is_5_) {
		try {
			if (bool != false) {
				return 25;
			}
			final int i_6_ = is_4_[i_1_];
			final int i_7_ = i_6_ + is_2_[i_1_];
			final int i_8_ = is_4_[i];
			final int i_9_ = i_8_ - -is_2_[i];
			int i_10_ = i_6_;
			if (i_6_ < i_8_) {
				i_10_ = i_8_;
			}
			int i_11_ = i_7_;
			if (i_9_ < i_7_) {
				i_11_ = i_9_;
			}
			int i_12_ = 0xff & is_5_[i_1_];
			if ((is_5_[i] & 0xff) < i_12_) {
				i_12_ = 0xff & is_5_[i];
			}
			final byte[] is_13_ = is_3_[i_1_];
			final byte[] is_14_ = is[i];
			int i_15_ = -i_6_ + i_10_;
			int i_16_ = -i_8_ + i_10_;
			for (int i_17_ = i_10_; (i_11_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
				final int i_18_ = is_14_[i_16_++] + is_13_[i_15_++];
				if (i_18_ < i_12_) {
					i_12_ = i_18_;
				}
			}
			return -i_12_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("wu.E(" + i + ','
					+ i_1_ + ',' + (is != null ? "{...}" : "null") + ',' + bool
					+ ',' + (is_2_ != null ? "{...}" : "null") + ','
					+ (is_3_ != null ? "{...}" : "null") + ','
					+ (is_4_ != null ? "{...}" : "null") + ','
					+ (is_5_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method4004(final byte i, final int i_19_,
			final int i_20_) {
		try {
			if (i_20_ >= 1000 && (i_19_ ^ 0xffffffff) > -1001) {
				return true;
			}
			if (i_20_ < 1000 && i_19_ < 1000) {
				if (Class343.method3817((byte) -98, i_19_)) {
					return true;
				}
				if (Class343.method3817((byte) 114, i_20_)) {
					return false;
				}
				return true;
			}
			if (i_20_ >= 1000 && i_19_ >= 1000) {
				return true;
			}
			if (i < 65) {
				method4002(77);
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("wu.C(" + i + ','
					+ i_19_ + ',' + i_20_ + ')'));
		}
	}

	static final void method4005(final int i, final int i_21_, final int i_22_,
			final boolean bool, final int i_23_) {
		try {
			if (Class85.method837(i_21_, 86)) {
				Class224_Sub2.method2837(bool,
						(Class159.aClass293ArrayArray1252[i_21_]), i, true,
						i_23_, i_22_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("wu.B(" + i + ','
					+ i_21_ + ',' + i_22_ + ',' + bool + ',' + i_23_ + ')'));
		}
	}

	static final String method4006(final String string, final int i) {
		try {
			final StringBuffer stringbuffer = new StringBuffer();
			final int i_24_ = string.length();
			for (int i_25_ = 0; i_24_ > i_25_; i_25_++) {
				final char c = string.charAt(i_25_);
				if ((c ^ 0xffffffff) == -38
						&& (i_24_ ^ 0xffffffff) < (2 + i_25_ ^ 0xffffffff)) {
					int i_26_ = string.charAt(i_25_ - -1);
					int i_27_;
					if (i_26_ < 48 || (i_26_ ^ 0xffffffff) < -58) {
						if ((i_26_ ^ 0xffffffff) <= -98 && i_26_ <= 102) {
							i_27_ = -97 + (i_26_ + 10);
						} else {
							if (i_26_ < 65 || i_26_ > 70) {
								stringbuffer.append('%');
								continue;
							}
							i_27_ = 10 - -i_26_ - 65;
						}
					} else {
						i_27_ = -48 + i_26_;
					}
					i_27_ *= 16;
					i_26_ = string.charAt(i_25_ - -2);
					if ((i_26_ ^ 0xffffffff) <= -49
							&& (i_26_ ^ 0xffffffff) >= -58) {
						i_27_ += -48 + i_26_;
					} else if (i_26_ >= 97 && (i_26_ ^ 0xffffffff) >= -103) {
						i_27_ += -87 - -i_26_;
					} else {
						if (i_26_ < 65 || (i_26_ ^ 0xffffffff) < -71) {
							stringbuffer.append('%');
							continue;
						}
						i_27_ += -65 + (10 + i_26_);
					}
					i_25_ += 2;
					if ((i_27_ ^ 0xffffffff) != -1
							&& GameObjectDefinitionLoader.method3553(-127,
									(byte) i_27_)) {
						stringbuffer.append(Class64_Sub7.method576(
								(byte) i_27_, (byte) 125));
					}
				} else if ((c ^ 0xffffffff) != -44) {
					stringbuffer.append(c);
				} else {
					stringbuffer.append(' ');
				}
			}
			if (i != -1) {
				aFloat3190 = -2.4350014F;
			}
			return stringbuffer.toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("wu.F("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public Class378() {
		/* empty */
	}
}
