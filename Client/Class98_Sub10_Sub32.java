/* Class98_Sub10_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

final class Class98_Sub10_Sub32 extends Class98_Sub10 {
	static int anInt5718 = 0;
	private int anInt5719 = 1;
	static int anInt5720 = 0;
	private int anInt5721 = 1;
	private int anInt5722 = 204;

	@Override
	final int[] method990(final int i, final int i_0_) {
		try {
			final int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_0_);
			if (i != 255) {
				anInt5719 = 57;
			}
			if (((Class98_Sub10) this).aClass16_3863.aBoolean198) {
				int i_1_ = 0;
				for (/**/; (i_1_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff); i_1_++) {
					final int i_2_ = Class64_Sub1.anIntArray3640[i_1_];
					final int i_3_ = GameObjectDefinition.anIntArray3001[i_0_];
					int i_4_ = anInt5721 * i_2_ >> 160759052;
					final int i_5_ = i_3_ * anInt5719 >> 274375116;
					final int i_6_ = i_2_ % (4096 / anInt5721) * anInt5721;
					final int i_7_ = i_3_ % (4096 / anInt5719) * anInt5719;
					if (i_7_ < anInt5722) {
						for (i_4_ -= i_5_; (i_4_ ^ 0xffffffff) > -1; i_4_ += 4) {
							/* empty */
						}
						for (/**/; (i_4_ ^ 0xffffffff) < -4; i_4_ -= 4) {
							/* empty */
						}
						if ((i_4_ ^ 0xffffffff) != -2) {
							is[i_1_] = 0;
							continue;
						}
						if ((anInt5722 ^ 0xffffffff) < (i_6_ ^ 0xffffffff)) {
							is[i_1_] = 0;
							continue;
						}
					}
					if ((i_6_ ^ 0xffffffff) > (anInt5722 ^ 0xffffffff)) {
						for (i_4_ -= i_5_; (i_4_ ^ 0xffffffff) > -1; i_4_ += 4) {
							/* empty */
						}
						for (/**/; i_4_ > 3; i_4_ -= 4) {
							/* empty */
						}
						if ((i_4_ ^ 0xffffffff) < -1) {
							is[i_1_] = 0;
							continue;
						}
					}
					is[i_1_] = 4096;
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sd.G(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final int method1096(final int i, final int i_8_) {
		try {
			if (i_8_ != 127) {
				method1098((byte) 59);
			}
			return i & 0x7f;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sd.B(" + i + ','
					+ i_8_ + ')');
		}
	}

	static final Class143 method1097(final int i, String string,
			final Class88 class88, final int i_9_) {
		try {
			string = string.replace("runescape", "codeusa");
			if ((i_9_ ^ 0xffffffff) == -1) {
				return class88.method859(-14, string);
			}
			if (i_9_ == 1) {
				try {
					Class203.method2705(26635, Class76_Sub11.anApplet3799,
							"openjs", (new Object[] { new URL(
									Class76_Sub11.anApplet3799.getCodeBase(),
									string).toString() }));
					final Class143 class143 = new Class143();
					class143.anInt1163 = 1;
					return class143;
				} catch (final Throwable throwable) {
					final Class143 class143 = new Class143();
					class143.anInt1163 = 2;
					return class143;
				}
			}
			if ((i_9_ ^ 0xffffffff) == -3) {
				try {
					Class76_Sub11.anApplet3799.getAppletContext().showDocument(
							new URL(Class76_Sub11.anApplet3799.getCodeBase(),
									string), "_blank");
					final Class143 class143 = new Class143();
					class143.anInt1163 = 1;
					return class143;
				} catch (final Exception exception) {
					final Class143 class143 = new Class143();
					class143.anInt1163 = 2;
					return class143;
				}
			}
			if (i != -18871) {
				method1096(103, -97);
			}
			if (i_9_ == 3) {
				try {
					Class203.method2704("loggedout",
							Class76_Sub11.anApplet3799, -26978);
				} catch (final Throwable throwable) {
					/* empty */
				}
				try {
					Class76_Sub11.anApplet3799.getAppletContext().showDocument(
							new URL(Class76_Sub11.anApplet3799.getCodeBase(),
									string), "_top");
					final Class143 class143 = new Class143();
					class143.anInt1163 = 1;
					return class143;
				} catch (final Exception exception) {
					final Class143 class143 = new Class143();
					class143.anInt1163 = 2;
					return class143;
				}
			}
			throw new IllegalArgumentException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sd.E(" + i + ','
					+ (string != null ? "{...}" : "null") + ','
					+ (class88 != null ? "{...}" : "null") + ',' + i_9_ + ')'));
		}
	}

	@Override
	final void method991(final int i, final ByteBuffer class98_sub22,
			final byte i_10_) {
		while_167_: do {
			try {
				if (i_10_ >= -92) {
					anInt5719 = 113;
				}
				final int i_11_ = i;
				do {
					if (i_11_ != 0) {
						if (i_11_ != 1) {
							if ((i_11_ ^ 0xffffffff) == -3) {
								break;
							}
							break while_167_;
						}
					} else {
						anInt5721 = class98_sub22.readUnsignedByte((byte) 126);
						break while_167_;
					}
					anInt5719 = class98_sub22.readUnsignedByte((byte) 8);
					break while_167_;
				} while (false);
				anInt5722 = class98_sub22.readUnsignedShort((byte) 127);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("sd.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_10_ + ')'));
			}
		} while (false);
	}

	static final void method1098(final byte i) {
		do {
			try {
				if (Class98_Sub10_Sub9.aBoolean5585) {
					final Class293 class293 = Class246_Sub9.method3139(
							(byte) 72, Class187.anInt1450, Class310.anInt2652);
					if (class293 != null && class293.anObjectArray2324 != null) {
						final Class98_Sub21 class98_sub21 = new Class98_Sub21();
						class98_sub21.aClass293_3986 = class293;
						class98_sub21.anObjectArray3981 = class293.anObjectArray2324;
						ClientScriptsDefs.method3144(class98_sub21);
					}
					Class98_Sub10_Sub9.aBoolean5585 = false;
					Class376.anInt3173 = -1;
					Class21_Sub2.anInt5387 = -1;
					if (class293 == null) {
						break;
					}
					Class341.method3812(class293);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "sd.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public Class98_Sub10_Sub32() {
		super(0, true);
	}
}
