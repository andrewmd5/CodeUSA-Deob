/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class22 {
	static int anInt216 = 0;
	static int anInt217;
	static int anInt218 = 1337;
	static int anInt219;

	static final Class98_Sub46_Sub4 method280(final byte[] is, final int i) {
		try {
			final Class98_Sub46_Sub4 class98_sub46_sub4 = new Class98_Sub46_Sub4();
			final ByteBuffer class98_sub22 = new ByteBuffer(is);
			class98_sub22.position = -2 + class98_sub22.incomingBytes.length;
			final int i_0_ = class98_sub22.readUnsignedShort((byte) 127);
			final int i_1_ = (-12 + -i_0_ + (class98_sub22.incomingBytes.length + -2));
			class98_sub22.position = i_1_;
			final int i_2_ = class98_sub22.readInt(-2);
			class98_sub46_sub4.anInt5958 = class98_sub22.readUnsignedShort((byte) 127);
			class98_sub46_sub4.anInt5964 = class98_sub22.readUnsignedShort((byte) 127);
			class98_sub46_sub4.anInt5966 = class98_sub22.readUnsignedShort((byte) 127);
			class98_sub46_sub4.anInt5965 = class98_sub22.readUnsignedShort((byte) 127);
			final int i_3_ = class98_sub22.readUnsignedByte((byte) 39);
			if ((i_3_ ^ 0xffffffff) < -1) {
				class98_sub46_sub4.aClass377Array5956 = new Class377[i_3_];
				for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
					int i_5_ = class98_sub22.readUnsignedShort((byte) 127);
					final Class377 class377 = new Class377(Class48.method453(
							423660257, i_5_));
					class98_sub46_sub4.aClass377Array5956[i_4_] = class377;
					while (i_5_-- > 0) {
						final int i_6_ = class98_sub22.readInt(-2);
						final int i_7_ = class98_sub22.readInt(-2);
						class377.method3996(new Class98_Sub34(i_7_), i_6_, -1);
					}
				}
			}
			class98_sub22.position = 0;
			class98_sub46_sub4.aString5968 = class98_sub22.method1222(-1);
			class98_sub46_sub4.aStringArray5959 = new String[i_2_];
			class98_sub46_sub4.anIntArray5963 = new int[i_2_];
			class98_sub46_sub4.anIntArray5967 = new int[i_2_];
			int i_8_ = i;
			while ((i_1_ ^ 0xffffffff) < (class98_sub22.position ^ 0xffffffff)) {
				final int i_9_ = class98_sub22.readUnsignedShort((byte) 127);
				if ((i_9_ ^ 0xffffffff) == -4) {
					class98_sub46_sub4.aStringArray5959[i_8_]// here it is
					= class98_sub22.readString((byte) 84).intern();
				}
				if (class98_sub46_sub4.aStringArray5959[i_8_] != null) {
					if (class98_sub46_sub4.aStringArray5959[i_8_].toLowerCase()
							.contains("runescape")) {
						class98_sub46_sub4.aStringArray5959[i_8_] = class98_sub46_sub4.aStringArray5959[i_8_]
								.replace("Runescape", "Codeusa")
								.replace("runescape", "codeusa")
								.replace("RuneScape", "CodeUSA");
					}
					if (class98_sub46_sub4.aStringArray5959[i_8_].toLowerCase()
							.contains("to ")
							&& !class98_sub46_sub4.aStringArray5959[i_8_]
									.toLowerCase().contains("play")) {
						class98_sub46_sub4.aStringArray5959[i_8_] = class98_sub46_sub4.aStringArray5959[i_8_]
								.replace("To", "Whisper to:");
					}
					if (class98_sub46_sub4.aStringArray5959[i_8_].toLowerCase()
							.contains("from ")) {
						class98_sub46_sub4.aStringArray5959[i_8_] = class98_sub46_sub4.aStringArray5959[i_8_]
								.replace("From", "Whisper from:");
					}
					if (class98_sub46_sub4.aStringArray5959[i_8_].toLowerCase()
							.contains("jagex")) {
						class98_sub46_sub4.aStringArray5959[i_8_] = class98_sub46_sub4.aStringArray5959[i_8_]
								.replace("Jagex", "CodeUSA Software").replace(
										"jagex", "codeusa software");
					}

					if (class98_sub46_sub4.aStringArray5959[i_8_].toLowerCase()
							.contains("system")) {
						class98_sub46_sub4.aStringArray5959[i_8_] = class98_sub46_sub4

						.aStringArray5959[i_8_].replace("System", "Server");
					}

				} else if ((i_9_ ^ 0xffffffff) > -101 && i_9_ != 21
						&& (i_9_ ^ 0xffffffff) != -39 && i_9_ != 39) {
					class98_sub46_sub4.anIntArray5967[i_8_] = class98_sub22
							.readInt(i + -2);
				} else {
					class98_sub46_sub4.anIntArray5967[i_8_] = class98_sub22
							.readUnsignedByte((byte) 111);
				}
				class98_sub46_sub4.anIntArray5963[i_8_++] = i_9_;
			}
			return class98_sub46_sub4;
		} catch (final RuntimeException runtimeexception) {
			runtimeexception.printStackTrace();
			throw Class64_Sub27.printError(runtimeexception, ("bk.A("
					+ (is != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
