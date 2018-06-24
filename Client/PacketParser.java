import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

class PacketParser extends Class373 {
	private Class332 aClass332_5461;
	Class332 aClass332_5462;
	private Class332 aClass332_5463;
	private Class332 aClass332_5464;
	private Class332 aClass332_5465;
	static IncomingOpcode aClass58_5466 = new IncomingOpcode(18, 3);
	private Class332 aClass332_5467;
	static Class98_Sub46_Sub16[] aClass98_Sub46_Sub16Array5468 = new Class98_Sub46_Sub16[14];

	@Override
	final void method3965(final int i, final int i_0_, final int i_1_,
			final boolean bool) {
		try {
			final int i_2_ = aClass332_5463.method3737() + i_1_;
			final int i_3_ = i_1_
					+ (((Class373) this).aClass93_3478.anInt3514 + -aClass332_5465
							.method3737());
			final int i_4_ = i_0_ + aClass332_5461.method3749();
			final int i_5_ = i_0_
					+ (((Class373) this).aClass93_3478.anInt3504 + -aClass332_5464
							.method3749());
			final int i_6_ = i_3_ + -i_2_;
			final int i_7_ = -i_4_ + i_5_;
			final int i_8_ = i_6_ * method3963(i ^ 0x66) / 10000;
			final int[] is = new int[4];
			Class265.aHa1974.K(is);
			Class265.aHa1974.KA(i_2_, i_4_, i_8_ + i_2_, i_5_);
			method3966(i_7_, i_6_, i_4_, i_2_, (byte) 88);
			Class265.aHa1974.KA(i_2_ - -i_8_, i_4_, i_3_, i_5_);
			aClass332_5467.method3738(i_2_, i_4_, i_6_, i_7_);
			Class265.aHa1974.KA(is[0], is[1], is[i], is[3]);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("bia.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + bool + ')'));
		}
	}

	PacketParser(final Class207 class207, final Class207 class207_9_,
			final Class93_Sub1 class93_sub1) {
		super(class207, class207_9_, class93_sub1); // okay um, do you know what
													// the packet buffer class
													// is called? no hold on
	}

	void method3966(final int i, final int i_10_, final int i_11_,
			final int i_12_, final byte i_13_) {
		do {
			try {
				aClass332_5462.method3738(i_12_, i_11_, i_10_, i);
				method3969(56, 14);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("bia.G(" + i + ',' + i_10_ + ',' + i_11_ + ',' + i_12_
								+ ',' + i_13_ + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method3967(final int i) throws IOException {
		try {
			if (aa_Sub1.aClass123_3561 == null) {
				return false;
			}
			if (Class92.currentIncommingOpcode == null) {
				if (Class98_Sub43.aBoolean4243) {
					if (!aa_Sub1.aClass123_3561.method2203(-1949, 1)) {
						return false;
					}
					aa_Sub1.aClass123_3561
							.method2208(
									(((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).incomingBytes),
									0, 2047, 1);
					Class224_Sub1.anInt5031 = 0;
					Class103.anInt892++;
					Class98_Sub43.aBoolean4243 = false;
				}
				((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).position = 0;
				if (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1260((byte) 54)) {
					if (!aa_Sub1.aClass123_3561.method2203(-1949, 1)) {
						return false;
					}
					aa_Sub1.aClass123_3561
							.method2208(
									(((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).incomingBytes),
									1, 2047, 1);
					Class103.anInt892++;
					Class224_Sub1.anInt5031 = 0;
				}
				Class98_Sub43.aBoolean4243 = true;
				final IncomingOpcode[] class58s = Appearance.method3629(125);
				final int i_14_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1255(0);
				if (i_14_ < 0 || i_14_ >= class58s.length) {
					throw new IOException(
							"invo:"
									+ i_14_
									+ " ip:"
									+ (((ByteBuffer) (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514)).position));
				}
				Class92.currentIncommingOpcode = class58s[i_14_];
				Class65.anInt496 = Class92.currentIncommingOpcode.anInt460;
			}
			if ((Class65.anInt496 ^ 0xffffffff) == 0) {
				if (!aa_Sub1.aClass123_3561.method2203(-1949, 1)) {
					return false;
				}
				aa_Sub1.aClass123_3561
						.method2208(
								(((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).incomingBytes),
								0, 2047, 1);
				Class224_Sub1.anInt5031 = 0;
				Class65.anInt496 = (((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).incomingBytes[0]) & 0xff;
				Class103.anInt892++;
			}
			if (Class65.anInt496 == -2) {
				if (!aa_Sub1.aClass123_3561.method2203(-1949, 2)) {
					return false;
				}
				aa_Sub1.aClass123_3561
						.method2208(
								(((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).incomingBytes),
								0, 2047, 2);
				((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).position = 0;
				Class65.anInt496 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				Class103.anInt892 += 2;
				Class224_Sub1.anInt5031 = 0;
			}
			if ((Class65.anInt496 ^ 0xffffffff) < -1) {
				if (!aa_Sub1.aClass123_3561.method2203(-1949, Class65.anInt496)) {
					return false;
				}
				((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).position = 0;
				aa_Sub1.aClass123_3561
						.method2208(
								(((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).incomingBytes),
								0, i + -525198532, Class65.anInt496);
				Class224_Sub1.anInt5031 = 0;
				Class103.anInt892 += Class65.anInt496;
			}
			Class98_Sub10_Sub21.aClass58_5641 = Class260.aClass58_3262;
			Class260.aClass58_3262 = Class98_Sub30.aClass58_4094;
			Class98_Sub30.aClass58_4094 = Class92.currentIncommingOpcode;
			if (Class92.currentIncommingOpcode == Class77.aClass58_591) {
				Class92.currentIncommingOpcode = null;
				return false;
			}
			if (Class60.aClass58_476 == Class92.currentIncommingOpcode) {
				final int i_15_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt1(false);
				final int i_16_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				Class75.aClass140_584.method2286(-7469, i_15_, i_16_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (aa_Sub3.aClass58_3566 == Class92.currentIncommingOpcode) {
				final boolean bool = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 64) == 1);
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				String string_17_ = string;
				if (bool) {
					string_17_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
				}
				final int i_18_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 81);
				boolean bool_19_ = false;
				if (i_18_ <= 1) {
					if ((Class109.aBoolean933 && !Class98_Sub10_Sub35.aBoolean5732)
							|| Model.aBoolean1401) {
						bool_19_ = true;
					} else if (i_18_ <= 1
							&& Class14.method225(string_17_, (byte) 113)) {
						bool_19_ = true;
					}
				}
				if (!bool_19_ && (Class22.anInt216 ^ 0xffffffff) == -1) {
					final String string_20_ = (Class249
							.method3160(
									Class322.method3670(
											(Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514),
											(byte) 72), 62));
					if ((i_18_ ^ 0xffffffff) == -3) {
						Class137.method2276(string, 24, "<img=1>" + string,
								string_20_, -1, null, (byte) -67, 0, "<img=1>"
										+ string_17_);
					} else if ((i_18_ ^ 0xffffffff) == -2) {
						Class137.method2276(string, 24, "<img=0>" + string,
								string_20_, -1, null, (byte) -82, 0, "<img=0>"
										+ string_17_);
					} else {
						Class137.method2276(string, 24, string, string_20_, -1,
								null, (byte) -63, 0, string_17_);
					}
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class284_Sub1.aClass58_5176 == Class92.currentIncommingOpcode) {
				final int i_21_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt(-2);
				final int i_22_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				Class98_Sub25.method1274(i + -525200580);
				za_Sub2.method1680(i_22_, i_21_, 9767);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class98_Sub46_Sub19.aClass58_6057) {
				int i_23_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) 99);
				if (i_23_ == 65535) {
					i_23_ = -1;
				}
				final int i_24_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt(-2);
				final int i_25_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt2(-43);
				Class98_Sub25.method1274(i ^ ~0x1f4decc3);
				Class64_Sub26.method660(i_25_, i_24_, 113, i_23_);
				final ItemDefs class297 = Class98_Sub46_Sub19.aClass205_6068
						.method2714(i_23_, (byte) -125);
				Class353.method3868(class297.anInt2465, i_25_, (byte) -104,
						class297.anInt2416, class297.anInt2476);
				Class323.method3675(i_25_, class297.anInt2437, true,
						class297.anInt2447, class297.anInt2441);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class39.aClass58_364) {
				Class98_Sub25.method1274(-1);
				GameObjectDefinition.method3856((byte) 1);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (aClass58_5466 == Class92.currentIncommingOpcode) {
				final int i_26_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShortA(i ^ 0x1f4decad);
				final int i_27_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteA(true);
				Class98_Sub25.method1274(-1);
				Class98_Sub10_Sub30.method1093(-29680, i_27_, true, i_26_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class207.aClass58_1576) {
				Class98_Sub10_Sub22.method1070((byte) -45,
						Class242.aClass85_1849);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class322.aClass58_2713) {
				final int i_28_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt2(-84);
				final int i_29_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) -106);
				final int i_30_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteC((byte) -126);
				Class98_Sub25.method1274(-1);
				final Class98_Sub18 class98_sub18 = ((Class98_Sub18) Class116.aClass377_964
						.method3990(i_28_, i ^ ~0x1f4decc3));
				if (class98_sub18 != null) {
					Class196.method2666(16398, false, class98_sub18,
							i_29_ != class98_sub18.anInt3945);
				}
				Class323.method3677(false, -126, i_29_, i_28_, i_30_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == s_Sub1.aClass58_5205) {
				final int i_31_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final int i_32_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt2(-89);
				Class98_Sub25.method1274(-1);
				Class225.method2848(i_32_, 17, i_31_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == GameObjectDefinition.aClass58_2943) {
				Node.anInt837 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteA(true);
				Class265.anInt1983 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(-126);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class299.aClass58_2495 == Class92.currentIncommingOpcode) {
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				final int i_33_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final String string_34_ = (Class52.aClass280_3500.method3325(
						i_33_, 67).method1576(15281,
						Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514));
				Class137.method2276(string, 19, string, string_34_, i_33_,
						null, (byte) -93, 0, string);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (GameObjectDefinitionLoader.aClass58_2514 == Class92.currentIncommingOpcode) {
				Class98_Sub10_Sub22.method1070((byte) -45, Class6.aClass85_89);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class98_Sub10_Sub14.aClass58_5606 == Class92.currentIncommingOpcode) {
				Class98_Sub10_Sub22.method1070((byte) -45,
						Class133.aClass85_3454);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class76_Sub2.aClass58_3731 == Class92.currentIncommingOpcode) {
				Entity.method3041(i + -525200579,
						(Class98_Sub43_Sub2.aClass88_5907),
						(Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514),
						Class65.anInt496);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class151_Sub8.aClass58_5011 == Class92.currentIncommingOpcode) {
				final int i_35_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				Class98_Sub25.method1274(-1);
				Class94.method919(string, i_35_, 52);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class213.aClass58_1609) {
				Class142.method2309(19208,
						Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readString((byte) 84));
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class98_Sub22_Sub2.aClass58_5793 == Class92.currentIncommingOpcode) {
				final int i_36_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt2(-124);
				final int i_37_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt(i + -525200581);
				Class98_Sub25.method1274(-1);
				final Class98_Sub18 class98_sub18 = ((Class98_Sub18) Class116.aClass377_964
						.method3990(i_37_, -1));
				final Class98_Sub18 class98_sub18_38_ = ((Class98_Sub18) Class116.aClass377_964
						.method3990(i_36_, -1));
				if (class98_sub18_38_ != null) {
					Class196.method2666(
							16398,
							false,
							class98_sub18_38_,
							(class98_sub18 == null || ((class98_sub18.anInt3945) != (class98_sub18_38_.anInt3945))));
				}
				if (class98_sub18 != null) {
					class98_sub18.method942(i ^ 0x1f4dec9a);
					Class116.aClass377_964.method3996(class98_sub18, i_36_, i
							^ ~0x1f4decc3);
				}
				Class293 class293 = Class159.method2509(i_37_, -9820);
				if (class293 != null) {
					Class341.method3812(class293);
				}
				class293 = Class159.method2509(i_36_, -9820);
				if (class293 != null) {
					Class341.method3812(class293);
					Class63.method549(class293, true, (byte) -117);
				}
				if (Class15.anInt185 != -1) {
					Class207.method2764(1, Class15.anInt185, -43);
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class246_Sub4_Sub1.aClass58_6166 == Class92.currentIncommingOpcode) {
				final boolean bool = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 15) == 1);
				final byte[] is = new byte[Class65.anInt496 - 1];
				Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514.method1190(is, true,
						-1 + Class65.anInt496, 0);
				Node.method943(is, bool, false);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class232.aClass58_1743 == Class92.currentIncommingOpcode) {
				while (((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).position < Class65.anInt496) {
					final boolean bool = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) 102) == 1);
					String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
					final String string_39_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
					final int i_40_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					final int i_41_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) 87);
					String string_42_ = "";
					boolean bool_43_ = false;
					if (i_40_ > 0) {
						string_42_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readString((byte) 84);
						bool_43_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readUnsignedByte((byte) -100) == 1;
					}
					for (int i_44_ = 0; ((i_44_ ^ 0xffffffff) > (Class314.anInt2692 ^ 0xffffffff)); i_44_++) {
						if (!bool) {
							if (string
									.equals(Class98_Sub25.aStringArray4026[i_44_])) {
								if (i_40_ != Class98_Sub26.anIntArray4030[i_44_]) {
									boolean bool_45_ = true;
									for (Class246_Sub4_Sub1 class246_sub4_sub1 = ((Class246_Sub4_Sub1) Class119.aClass218_986
											.method2803((byte) 15)); class246_sub4_sub1 != null; class246_sub4_sub1 = ((Class246_Sub4_Sub1) Class119.aClass218_986
											.method2809(false))) {
										if (class246_sub4_sub1.aString6168
												.equals(string)) {
											if ((i_40_ ^ 0xffffffff) != -1
													&& ((class246_sub4_sub1.aShort6167) ^ 0xffffffff) == -1) {
												bool_45_ = false;
												class246_sub4_sub1
														.method2965((byte) -72);
											} else if (i_40_ == 0
													&& ((class246_sub4_sub1.aShort6167) ^ 0xffffffff) != -1) {
												bool_45_ = false;
												class246_sub4_sub1
														.method2965((byte) 126);
											}
										}
									}
									if (bool_45_) {
										Class119.aClass218_986.method2808(true,
												new Class246_Sub4_Sub1(string,
														i_40_));
									}
									Class98_Sub26.anIntArray4030[i_44_] = i_40_;
								}
								Class315.aStringArray3527[i_44_] = string_39_;
								Class98_Sub10_Sub17.aStringArray5625[i_44_] = string_42_;
								Class69.anIntArray3222[i_44_] = i_41_;
								string = null;
								aa_Sub3.aBooleanArray3575[i_44_] = bool_43_;
								break;
							}
						} else if (string_39_
								.equals(Class98_Sub25.aStringArray4026[i_44_])) {
							Class98_Sub25.aStringArray4026[i_44_] = string;
							string = null;
							Class315.aStringArray3527[i_44_] = string_39_;
							break;
						}
					}
					if (string != null
							&& (Class314.anInt2692 ^ 0xffffffff) > -201) {
						Class98_Sub25.aStringArray4026[Class314.anInt2692] = string;
						Class315.aStringArray3527[Class314.anInt2692] = string_39_;
						Class98_Sub26.anIntArray4030[Class314.anInt2692] = i_40_;
						Class98_Sub10_Sub17.aStringArray5625[(Class314.anInt2692)] = string_42_;
						Class69.anIntArray3222[Class314.anInt2692] = i_41_;
						aa_Sub3.aBooleanArray3575[Class314.anInt2692] = bool_43_;
						Class314.anInt2692++;
					}
				}
				Class363.anInt3099 = Class24.anInt242;
				Class98_Sub28.anInt4078 = 2;
				boolean bool = false;
				int i_46_ = Class314.anInt2692;
				while ((i_46_ ^ 0xffffffff) < -1) {
					bool = true;
					i_46_--;
					for (int i_47_ = 0; (i_46_ ^ 0xffffffff) < (i_47_ ^ 0xffffffff); i_47_++) {
						if (((Class98_Sub26.anIntArray4030[i_47_] != (Class98_Sub46_Sub10.aClass354_6011).worldId) && ((Class98_Sub26.anIntArray4030[1 + i_47_] ^ 0xffffffff) == ((Class98_Sub46_Sub10.aClass354_6011).worldId ^ 0xffffffff)))
								|| (Class98_Sub26.anIntArray4030[i_47_] == 0 && (Class98_Sub26.anIntArray4030[1 + i_47_] != 0))) {
							final int i_48_ = Class98_Sub26.anIntArray4030[i_47_];
							Class98_Sub26.anIntArray4030[i_47_] = Class98_Sub26.anIntArray4030[i_47_ + 1];
							Class98_Sub26.anIntArray4030[1 + i_47_] = i_48_;
							final String string = Class98_Sub10_Sub17.aStringArray5625[i_47_];
							Class98_Sub10_Sub17.aStringArray5625[i_47_] = (Class98_Sub10_Sub17.aStringArray5625[1 + i_47_]);
							Class98_Sub10_Sub17.aStringArray5625[1 + i_47_] = string;
							final String string_49_ = Class98_Sub25.aStringArray4026[i_47_];
							Class98_Sub25.aStringArray4026[i_47_] = Class98_Sub25.aStringArray4026[i_47_
									- -1];
							Class98_Sub25.aStringArray4026[i_47_ + 1] = string_49_;
							final String string_50_ = Class315.aStringArray3527[i_47_];
							Class315.aStringArray3527[i_47_] = Class315.aStringArray3527[1 + i_47_];
							Class315.aStringArray3527[i_47_ + 1] = string_50_;
							final int i_51_ = Class69.anIntArray3222[i_47_];
							Class69.anIntArray3222[i_47_] = Class69.anIntArray3222[1 + i_47_];
							Class69.anIntArray3222[i_47_ + 1] = i_51_;
							final boolean bool_52_ = aa_Sub3.aBooleanArray3575[i_47_];
							aa_Sub3.aBooleanArray3575[i_47_] = aa_Sub3.aBooleanArray3575[1 + i_47_];
							bool = false;
							aa_Sub3.aBooleanArray3575[1 + i_47_] = bool_52_;
						}
					}
					if (bool) {
						break;
					}
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class188.aClass58_1452 == Class92.currentIncommingOpcode) { // llll
				final int i_53_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) -114);
				final int i_54_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteA(true);
				final int i_55_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(108);
				final int i_56_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(-110);
				final int i_57_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteC((byte) 122);
				Class98_Sub25.method1274(-1);
				Class217.aBooleanArray3410[i_57_] = true;
				aa_Sub3.anIntArray3571[i_57_] = i_54_;
				Class98_Sub10_Sub13.anIntArray5603[i_57_] = i_56_;
				Class98_Sub32.anIntArray4109[i_57_] = i_55_;
				Class212.anIntArray1597[i_57_] = i_53_;
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class246_Sub4_Sub2.aClass58_6182 == Class92.currentIncommingOpcode) {
				Class368.anInt3124 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 48);
				Class92.currentIncommingOpcode = null;
				Class98_Sub36.anInt4161 = Class24.anInt242;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class151_Sub6.aClass58_4999) {
				Class98_Sub41.method1475(119);
				Class92.currentIncommingOpcode = null;
				return false;
			}
			if (Class92.currentIncommingOpcode == Class98_Sub41.aClass58_4199) {
				Class98_Sub10_Sub22.method1070((byte) -45,
						Class373_Sub3.aClass85_5474);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class40.aClass58_369) {
				((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).position += 28;
				if (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514.method1210(-114)) {
					Class76_Sub7
							.method762(
									(((ByteBuffer) (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514)).position)
											+ -28,
									(Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514),
									true);
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class77.aClass58_592) {
				final int i_58_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt(-2);
				Class98_Sub25.method1274(i + -525200580);
				if (i_58_ != -1) {
					int i_59_ = (0xfffeabc & i_58_) >> 884258670;
					int i_60_ = i_58_ & 0x3fff;
					i_59_ -= Class272.anInt2038;
					i_60_ -= aa_Sub2.anInt3562;
					if ((i_59_ ^ 0xffffffff) > -1) {
						i_59_ = 0;
					} else if (Class165.anInt1276 <= i_59_) {
						i_59_ = Class165.anInt1276;
					}
					Class116.anInt967 = 256 + (i_59_ << -1786298711);
					if ((i_60_ ^ 0xffffffff) <= -1) {
						if (Class98_Sub10_Sub7.anInt5572 <= i_60_) {
							i_60_ = Class98_Sub10_Sub7.anInt5572;
						}
					} else {
						i_60_ = 0;
					}
					Class64_Sub26.anInt3712 = 256 + (i_60_ << 1215708553);
				} else {
					Class64_Sub26.anInt3712 = -1;
					Class116.anInt967 = -1;
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class315.aClass58_3533) {
				final int i_61_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteA(true);
				final int i_62_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(i + -525200499);
				final int i_63_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 127);
				final int i_64_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteC((byte) -120);
				final int i_65_ = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShort1((byte) 107) << -1408209406);
				Class98_Sub25.method1274(i + -525200580);
				Class98_Sub46_Sub13.method1592(-25686, i_64_, i_62_, i_65_,
						i_61_, i_63_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class358.aClass58_3029 == Class92.currentIncommingOpcode) {
				Class98_Sub10_Sub22.method1070((byte) -45,
						Class64_Sub10.aClass85_3667);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class180.aClass58_3398 == Class92.currentIncommingOpcode) {
				final int i_66_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt1(false);
				final int i_67_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) 91);
				final int i_68_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) -81);
				int i_69_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final int i_70_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteC((byte) -124);
				final boolean bool = (0x80 & i_70_ ^ 0xffffffff) != -1;
				final int i_71_ = i_70_ & 0x7;
				int i_72_ = 0xf & i_70_ >> 525200579;
				if (i_72_ == 15) {
					i_72_ = -1;
				}
				if (i_66_ >> -1165516802 != 0) {
					final int i_73_ = i_66_ >> 1762702268 & 0x3;
					final int i_74_ = (((i_66_ & 0xfffdb84) >> -1260772882) - Class272.anInt2038);
					final int i_75_ = -aa_Sub2.anInt3562 + (0x3fff & i_66_);
					if (i_74_ >= 0
							&& i_75_ >= 0
							&& Class165.anInt1276 > i_74_
							&& ((Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff) < (i_75_ ^ 0xffffffff))) {
						final int i_76_ = 512 * i_74_ + 256;
						final int i_77_ = 256 + i_75_ * 512;
						int i_78_ = i_73_;
						if ((i_78_ ^ 0xffffffff) > -4
								&& Class1.method162(i_75_, (byte) -118, i_74_)) {
							i_78_++;
						}
						final Class246_Sub3_Sub4_Sub3 class246_sub3_sub4_sub3 = (new Class246_Sub3_Sub4_Sub3(
								i_69_, i_68_, Class215.anInt1614, i_73_, i_78_,
								i_76_,
								(-i_67_ + Class98_Sub46_Sub2_Sub2.method1538(
										i_73_, i_77_, i_76_, 24111)), i_77_,
								i_74_, i_74_, i_75_, i_75_, i_71_));
						Class98_Sub10_Sub11.aClass148_5596
								.method2419(new Class98_Sub46_Sub3(
										class246_sub3_sub4_sub3), -20911);
					}
				} else if ((i_66_ >> -602350499 ^ 0xffffffff) == -1) {
					if ((i_66_ >> 1424175516 ^ 0xffffffff) != -1) {
						final int i_79_ = i_66_ & 0xffff;
						Player class246_sub3_sub4_sub2_sub2;
						if (i_79_ == za_Sub2.anInt6080) {
							class246_sub3_sub4_sub2_sub2 = Surface.player;
						} else {
							class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_79_]);
						}
						if (class246_sub3_sub4_sub2_sub2 != null) {
							if (i_69_ == 65535) {
								i_69_ = -1;
							}
							boolean bool_80_ = true;
							final int i_81_ = (bool ? ((Entity) class246_sub3_sub4_sub2_sub2).anInt6365
									: ((Entity) class246_sub3_sub4_sub2_sub2).anInt6379);
							if (i_69_ != -1 && (i_81_ ^ 0xffffffff) != 0) {
								if ((i_69_ ^ 0xffffffff) != (i_81_ ^ 0xffffffff)) {
									final Class107 class107 = Class196.aClass304_1509
											.method3564(2, i_69_);
									final Class107 class107_82_ = Class196.aClass304_1509
											.method3564(2, i_81_);
									if ((class107.anInt910 ^ 0xffffffff) != 0
											&& (class107_82_.anInt910 != -1)) {
										final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
												.method2623(class107.anInt910,
														16383));
										final AnimationDefinition class97_83_ = (Class151_Sub7.aClass183_5001
												.method2623(
														(class107_82_.anInt910),
														16383));
										if ((class97.anInt829 ^ 0xffffffff) > (class97_83_.anInt829 ^ 0xffffffff)) {
											bool_80_ = false;
										}
									}
								} else {
									final Class107 class107 = Class196.aClass304_1509
											.method3564(2, i_69_);
									if (class107.aBoolean909
											&& (class107.anInt910 ^ 0xffffffff) != 0) {
										final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
												.method2623(class107.anInt910,
														i + -525184196));
										final int i_84_ = class97.anInt819;
										if ((i_84_ ^ 0xffffffff) == -1
												|| (i_84_ ^ 0xffffffff) == -3) {
											bool_80_ = false;
										} else if ((i_84_ ^ 0xffffffff) == -2) {
											bool_80_ = true;
										}
									}
								}
							}
							if (bool_80_) {
								if (!bool) {
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6376 = 0;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6396 = 0;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6367 = 1;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6410 = i_72_;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6379 = i_69_;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6382 = i_67_;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6389 = i_71_;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6391 = i_68_
											+ Class215.anInt1614;
									if (((((Entity) class246_sub3_sub4_sub2_sub2).anInt6391) ^ 0xffffffff) < (Class215.anInt1614 ^ 0xffffffff)) {
										((Entity) class246_sub3_sub4_sub2_sub2).anInt6376 = -1;
									}
									if (((((Entity) class246_sub3_sub4_sub2_sub2).anInt6379) ^ 0xffffffff) == -65536) {
										((Entity) class246_sub3_sub4_sub2_sub2).anInt6379 = -1;
									}
									if ((((Entity) class246_sub3_sub4_sub2_sub2).anInt6379) != -1
											&& (((((Entity) class246_sub3_sub4_sub2_sub2).anInt6391) ^ 0xffffffff) == (Class215.anInt1614 ^ 0xffffffff))) {
										final int i_85_ = (Class196.aClass304_1509
												.method3564(
														i + -525200577,
														(((Entity) class246_sub3_sub4_sub2_sub2).anInt6379))).anInt910;
										if (i_85_ != -1) {
											final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
													.method2623(i_85_, 16383));
											if (class97 != null
													&& (class97.anIntArray818) != null
													&& !(((Entity) class246_sub3_sub4_sub2_sub2).aBoolean6371)) {
												Class349.method3840(
														(byte) -128,
														class246_sub3_sub4_sub2_sub2,
														0, class97);
											}
										}
									}
								} else {
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6427 = 0;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6426 = i_68_
											+ Class215.anInt1614;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6353 = i_72_;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6365 = i_69_;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6360 = i_71_;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6428 = 0;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6363 = i_67_;
									((Entity) class246_sub3_sub4_sub2_sub2).anInt6421 = 1;
									if ((Class215.anInt1614 ^ 0xffffffff) > ((((Entity) class246_sub3_sub4_sub2_sub2).anInt6426) ^ 0xffffffff)) {
										((Entity) class246_sub3_sub4_sub2_sub2).anInt6428 = -1;
									}
									if (((((Entity) class246_sub3_sub4_sub2_sub2).anInt6365) ^ 0xffffffff) == -65536) {
										((Entity) class246_sub3_sub4_sub2_sub2).anInt6365 = -1;
									}
									if ((((Entity) class246_sub3_sub4_sub2_sub2).anInt6365) != -1
											&& ((((Entity) class246_sub3_sub4_sub2_sub2).anInt6426) == Class215.anInt1614)) {
										final int i_86_ = (Class196.aClass304_1509
												.method3564(
														2,
														(((Entity) class246_sub3_sub4_sub2_sub2).anInt6365))).anInt910;
										if (i_86_ != -1) {
											final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
													.method2623(i_86_,
															i ^ 0x1f4dd33c));
											if (class97 != null
													&& (class97.anIntArray818) != null
													&& !(((Entity) class246_sub3_sub4_sub2_sub2).aBoolean6371)) {
												Class349.method3840(
														(byte) -128,
														class246_sub3_sub4_sub2_sub2,
														0, class97);
											}
										}
									}
								}
							}
						}
					}
				} else {
					final int i_87_ = i_66_ & 0xffff;
					final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
							.method3990(i_87_, -1));
					if (class98_sub39 != null) {
						final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
						if (i_69_ == 65535) {
							i_69_ = -1;
						}
						boolean bool_88_ = true;
						final int i_89_ = (bool ? ((Entity) class246_sub3_sub4_sub2_sub1).anInt6365
								: ((Entity) class246_sub3_sub4_sub2_sub1).anInt6379);
						if ((i_69_ ^ 0xffffffff) != 0
								&& (i_89_ ^ 0xffffffff) != 0) {
							if ((i_69_ ^ 0xffffffff) == (i_89_ ^ 0xffffffff)) {
								final Class107 class107 = Class196.aClass304_1509
										.method3564(i ^ 0x1f4decc1, i_69_);
								if (class107.aBoolean909
										&& (class107.anInt910 ^ 0xffffffff) != 0) {
									final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
											.method2623(class107.anInt910,
													16383));
									final int i_90_ = class97.anInt819;
									if (i_90_ != 0 && i_90_ != 2) {
										if (i_90_ == 1) {
											bool_88_ = true;
										}
									} else {
										bool_88_ = false;
									}
								}
							} else {
								final Class107 class107 = Class196.aClass304_1509
										.method3564(2, i_69_);
								final Class107 class107_91_ = Class196.aClass304_1509
										.method3564(2, i_89_);
								if ((class107.anInt910 ^ 0xffffffff) != 0
										&& (class107_91_.anInt910 ^ 0xffffffff) != 0) {
									final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
											.method2623(class107.anInt910,
													16383));
									final AnimationDefinition class97_92_ = (Class151_Sub7.aClass183_5001
											.method2623(class107_91_.anInt910,
													16383));
									if ((class97_92_.anInt829 ^ 0xffffffff) < (class97.anInt829 ^ 0xffffffff)) {
										bool_88_ = false;
									}
								}
							}
						}
						if (bool_88_) {
							if (bool) {
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6426 = i_68_
										+ Class215.anInt1614;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6353 = i_72_;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6427 = 0;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6360 = i_71_;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6365 = i_69_;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6428 = 0;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6421 = 1;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6363 = i_67_;
								if (Class215.anInt1614 < ((Entity) class246_sub3_sub4_sub2_sub1).anInt6426) {
									((Entity) class246_sub3_sub4_sub2_sub1).anInt6428 = -1;
								}
								if ((((Entity) class246_sub3_sub4_sub2_sub1).anInt6365 != -1)
										&& (Class215.anInt1614 == (((Entity) class246_sub3_sub4_sub2_sub1).anInt6426))) {
									final int i_93_ = (Class196.aClass304_1509
											.method3564(
													2,
													(((Entity) class246_sub3_sub4_sub2_sub1).anInt6365))).anInt910;
									if (i_93_ != -1) {
										final AnimationDefinition class97 = Class151_Sub7.aClass183_5001
												.method2623(i_93_, 16383);
										if (class97 != null
												&& (class97.anIntArray818) != null
												&& !(((Entity) class246_sub3_sub4_sub2_sub1).aBoolean6371)) {
											Class349.method3840(
													(byte) -128,
													class246_sub3_sub4_sub2_sub1,
													0, class97);
										}
									}
								}
							} else {
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6367 = 1;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6389 = i_71_;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6376 = 0;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6396 = 0;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6379 = i_69_;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6410 = i_72_;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6391 = Class215.anInt1614
										- -i_68_;
								((Entity) class246_sub3_sub4_sub2_sub1).anInt6382 = i_67_;
								if (((Entity) class246_sub3_sub4_sub2_sub1).anInt6391 > Class215.anInt1614) {
									((Entity) class246_sub3_sub4_sub2_sub1).anInt6376 = -1;
								}
								if ((((Entity) class246_sub3_sub4_sub2_sub1).anInt6379 != -1)
										&& (((((Entity) class246_sub3_sub4_sub2_sub1).anInt6391) ^ 0xffffffff) == (Class215.anInt1614 ^ 0xffffffff))) {
									final int i_94_ = (Class196.aClass304_1509
											.method3564(
													2,
													(((Entity) class246_sub3_sub4_sub2_sub1).anInt6379))).anInt910;
									if ((i_94_ ^ 0xffffffff) != 0) {
										final AnimationDefinition class97 = Class151_Sub7.aClass183_5001
												.method2623(i_94_, 16383);
										if (class97 != null
												&& (class97.anIntArray818) != null
												&& !(((Entity) class246_sub3_sub4_sub2_sub1).aBoolean6371)) {
											Class349.method3840(
													(byte) -128,
													class246_sub3_sub4_sub2_sub1,
													0, class97);
										}
									}
								}
							}
						}
					}
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class98_Sub12.aClass58_3877) {
				Class86.aClass350_649 = (Class98_Sub10_Sub8.method1029(
						(byte) -107, Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readUnsignedByte((byte) -108)));
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class55.aClass58_433 == Class92.currentIncommingOpcode) {
				Class98_Sub10_Sub22
						.method1070((byte) -45, SurfaceSkin.aClass85_332);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class149.aClass58_1207) {
				final int i_95_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readSmart();
				final int i_96_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt(-2);
				final int i_97_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 122);
				String string = "";
				String string_98_ = string;
				if ((i_97_ & 0x1 ^ 0xffffffff) != -1) {
					string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
					if ((i_97_ & 0x2 ^ 0xffffffff) != -1) {
						string_98_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readString((byte) 84);
					} else {
						string_98_ = string;
					}
				}
				String string_99_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				if (i_95_ != 99) {
					if (string_99_.contains(":url:")) {
						final String url = string_99_;
						string_99_ = "Opening URL";
						if (Desktop.isDesktopSupported()) {
							try {
								Desktop.getDesktop().browse(
										new URI(url.substring(6)));
							} catch (final Exception e) {
							}
						} else {
							openURL(url.substring(6));
						}
					}
					if (string_99_.contains(":tween:")) {
						Class357.tweeningEnabled = true;
						Class98_Sub46.method1525(
								"Forced tweening ENABLED!", 123);
					}
					if (!string_98_.equals("")
							&& Class14.method225(string_98_, (byte) 125)) {
						Class92.currentIncommingOpcode = null;
						return true;
					}
					Class98_Sub45.method1521((byte) -113, i_95_, string_99_,
							i_96_, string_98_, string, string);

				} else {
					Class98_Sub46.method1525(string_99_, -92);
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class348.aClass58_2912 == Class92.currentIncommingOpcode) {
				Class98_Sub10_Sub22.method1070((byte) -45,
						Class98_Sub23.aClass85_4007);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class98_Sub10_Sub15.aClass58_5615) {
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				final boolean bool = ((Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -103) ^ 0xffffffff) == -2);
				String string_100_;
				if (bool) {
					string_100_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
				} else {
					string_100_ = string;
				}
				final int i_101_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final byte i_102_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readSignedByte((byte) -19);
				boolean bool_103_ = false;
				if (i_102_ == -128) {
					bool_103_ = true;
				}
				if (!bool_103_) {
					final String string_104_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
					final Class147 class147 = new Class147();
					class147.aString1191 = string;
					class147.aString1186 = string_100_;
					class147.aString1185 = Class353.method3867(-1,
							(class147.aString1186));
					class147.aByte1187 = i_102_;
					class147.anInt1188 = i_101_;
					class147.aString1190 = string_104_;
					int i_105_;
					for (i_105_ = -1 + Class32.anInt308; (i_105_ ^ 0xffffffff) <= -1; i_105_--) {
						final int i_106_ = (Class374.aClass147Array3157[i_105_].aString1185
								.compareTo(class147.aString1185));
						if ((i_106_ ^ 0xffffffff) == -1) {
							Class374.aClass147Array3157[i_105_].anInt1188 = i_101_;
							Class374.aClass147Array3157[i_105_].aByte1187 = i_102_;
							Class374.aClass147Array3157[i_105_].aString1190 = string_104_;
							if (string_100_
									.equals(Surface.player.name2)) {
								Class111.aByte947 = i_102_;
							}
							Class64_Sub22.anInt3705 = Class24.anInt242;
							Class92.currentIncommingOpcode = null;
							return true;
						}
						if (i_106_ < 0) {
							break;
						}
					}
					if ((Class32.anInt308 ^ 0xffffffff) <= (Class374.aClass147Array3157.length ^ 0xffffffff)) {
						Class92.currentIncommingOpcode = null;
						return true;
					}
					for (int i_107_ = Class32.anInt308 + -1; (i_105_ ^ 0xffffffff) > (i_107_ ^ 0xffffffff); i_107_--) {
						Class374.aClass147Array3157[i_107_ - -1] = Class374.aClass147Array3157[i_107_];
					}
					if (Class32.anInt308 == 0) {
						Class374.aClass147Array3157 = new Class147[100];
					}
					Class374.aClass147Array3157[i_105_ - -1] = class147;
					Class32.anInt308++;
					if (string_100_
							.equals(Surface.player.name2)) {
						Class111.aByte947 = i_102_;
					}
				} else {
					if ((Class32.anInt308 ^ 0xffffffff) == -1) {
						Class92.currentIncommingOpcode = null;
						return true;
					}
					int i_109_;
					for (i_109_ = 0; ((i_109_ ^ 0xffffffff) > (Class32.anInt308 ^ 0xffffffff)); i_109_++) {
						if (Class374.aClass147Array3157[i_109_].aString1186
								.equals(string_100_)
								&& (Class374.aClass147Array3157[i_109_]).anInt1188 == i_101_) {
							break;
						}
					}
					if (Class32.anInt308 > i_109_) {
						for (/**/; ((i_109_ ^ 0xffffffff) > (Class32.anInt308 - 1 ^ 0xffffffff)); i_109_++) {
							Class374.aClass147Array3157[i_109_] = Class374.aClass147Array3157[i_109_
									- -1];
						}
						Class32.anInt308--;
						Class374.aClass147Array3157[Class32.anInt308] = null;
					}
				}
				Class92.currentIncommingOpcode = null;
				Class64_Sub22.anInt3705 = Class24.anInt242;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class98_Sub32_Sub1.aClass58_5883) {
				final int i_110_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt2(-91);
				final int i_111_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteC((byte) 59);
				Class98_Sub25.method1274(-1);
				Class305_Sub1.method3587(i_111_, -39, i_110_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class98_Sub18.aClass58_3946) {
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				final int i_112_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) 101);
				Class98_Sub25.method1274(i + -525200580);
				Class94.method919(string, i_112_, 68);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (InputStream_Sub1.aClass58_28 == Class92.currentIncommingOpcode) {
				int i_113_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				if ((i_113_ ^ 0xffffffff) == -65536) {
					i_113_ = -1;
				}
				final int i_114_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -123);
				final int i_115_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final int i_116_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -118);
				Class98_Sub10_Sub9.method1036(i ^ ~0x6bb6e430, i_116_, i_114_,
						i_113_, true, i_115_, 256);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class69_Sub2.aClass58_5333) {
				final int i_117_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) -31);
				final int i_118_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readIntReverse(true);
				Class98_Sub25.method1274(-1);
				Class64_Sub8.method585(i_117_, (byte) -85, i_118_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class93_Sub1.aClass58_5482) {
				final int i_119_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				Player class246_sub3_sub4_sub2_sub2;
				if (i_119_ != za_Sub2.anInt6080) {
					class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_119_]);
				} else {
					class246_sub3_sub4_sub2_sub2 = Surface.player;
				}
				if (class246_sub3_sub4_sub2_sub2 == null) {
					Class92.currentIncommingOpcode = null;
					return true;
				}
				int i_120_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final int rights = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -112);
				final boolean bool = (0x8000 & i_120_ ^ 0xffffffff) != -1;
				if (class246_sub3_sub4_sub2_sub2.name2 != null
						&& class246_sub3_sub4_sub2_sub2.appearance != null) {
					boolean bool_122_ = false;
					if (rights <= 1 || rights == 10 || rights == 12
							|| rights == 13) {
						if (!bool
								&& ((Class109.aBoolean933 && !Class98_Sub10_Sub35.aBoolean5732) || Model.aBoolean1401)) {
							bool_122_ = true;
						} else if (Class14.method225(
								class246_sub3_sub4_sub2_sub2.name2,
								(byte) 117)) {
							bool_122_ = true;
						}
					}
					if (!bool_122_ && Class22.anInt216 == 0) {
						int i_123_ = -1;
						String string;

						if (!bool) {
							string = (Class249
									.method3160(
											(Class322
													.method3670(
															(Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514),
															(byte) 72)), 62));
						} else {
							i_120_ &= 0x7fff;
							final Class300 class300 = (Class42
									.method376(
											(byte) -12,
											(Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514)));
							i_123_ = class300.anInt2496;
							string = (class300.aClass98_Sub46_Sub11_2498
									.method1576(
											15281,
											(Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514)));
						}
						((Entity) class246_sub3_sub4_sub2_sub2).aString6374 = string
								.trim();
						((Entity) class246_sub3_sub4_sub2_sub2).anInt6398 = i_120_ >> -1332042328;
						((Entity) class246_sub3_sub4_sub2_sub2).anInt6402 = 0xff & i_120_;
						((Entity) class246_sub3_sub4_sub2_sub2).anInt6384 = 150;
						// if (string.contains(":money:")) {

						// string = string.replace(":money:",
						// "<img=8>").replace(":Money:", "<img=8>");

						// }

						int i_124_;
						if (rights == 1 || rights == 2 || rights == 11) {
							i_124_ = bool ? 17 : 1;
						} else {
							i_124_ = !bool ? 17 : 2;
						}
						if (string.toLowerCase().contains(":money:")) {
							string = string.replace(":money:", "<img=8>")
									.replace(":Money:", "<img=8>");
						}
						if (rights == 2) {

							Class137.method2276(
									class246_sub3_sub4_sub2_sub2.name,
									i_124_,
									"<img=1>"
											+ class246_sub3_sub4_sub2_sub2
													.getNameForDisplay(0, true),
									string,
									i_123_,
									null,
									(byte) -107,
									0,
									"<img=1>"
											+ class246_sub3_sub4_sub2_sub2
													.method3059(-1, false));
						} else if (rights == 1) {
							Class137.method2276(
									class246_sub3_sub4_sub2_sub2.name,
									i_124_,
									"<img=0>"
											+ class246_sub3_sub4_sub2_sub2
													.getNameForDisplay(0, true),
									string,
									i_123_,
									null,
									(byte) -84,
									0,
									"<img=0>"
											+ class246_sub3_sub4_sub2_sub2
													.method3059(-1, false));
						} else if (rights == 11) {
							Class137.method2276(
									class246_sub3_sub4_sub2_sub2.name,
									i_124_,
									"<img=8><img=0>"
											+ class246_sub3_sub4_sub2_sub2
													.getNameForDisplay(0, true),
									string,
									i_123_,
									null,
									(byte) -84,
									0,
									"<img=8><img=0>"
											+ class246_sub3_sub4_sub2_sub2
													.method3059(-1, false));
						} else if (rights == 10) {
							Class137.method2276(
									class246_sub3_sub4_sub2_sub2.name,
									i_124_,
									"<img=8>"
											+ class246_sub3_sub4_sub2_sub2
													.getNameForDisplay(0, true),
									string,
									i_123_,
									null,
									(byte) -84,
									0,
									"<img=8>"
											+ class246_sub3_sub4_sub2_sub2
													.method3059(-1, false));
						} else if (rights == 12) {
							Class137.method2276(
									class246_sub3_sub4_sub2_sub2.name,
									i_124_,
									"<img=9>"
											+ class246_sub3_sub4_sub2_sub2
													.getNameForDisplay(0, true),
									string,
									i_123_,
									null,
									(byte) -84,
									0,
									"<img=9>"
											+ class246_sub3_sub4_sub2_sub2
													.method3059(-1, false));
						} else if (rights == 13) {
							Class137.method2276(
									class246_sub3_sub4_sub2_sub2.name,
									i_124_,
									"<img=10>"
											+ class246_sub3_sub4_sub2_sub2
													.getNameForDisplay(0, true),
									string,
									i_123_,
									null,
									(byte) -84,
									0,
									"<img=10>"
											+ class246_sub3_sub4_sub2_sub2
													.method3059(-1, false));
						} else {
							Class137.method2276(
									class246_sub3_sub4_sub2_sub2.name,
									i_124_, class246_sub3_sub4_sub2_sub2
											.getNameForDisplay(i ^ 0x1f4decc3, true),
									string, i_123_, null, (byte) -81, 0,
									class246_sub3_sub4_sub2_sub2.method3059(-1,
											false));
						}
					}
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class246_Sub3_Sub4_Sub5.aClass58_6264 == Class92.currentIncommingOpcode) {
				int i_125_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				if ((i_125_ ^ 0xffffffff) == -65536) {
					i_125_ = -1;
				}
				final int i_126_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readIntReverse(true);
				Class98_Sub25.method1274(i + -525200580);
				Class98_Sub46_Sub10.method1572(i_126_, 30585, i_125_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class98_Sub10_Sub20.aClass58_5638) {
				final int i_127_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteA(true);
				final byte i_128_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1187((byte) -112);
				Class98_Sub25.method1274(-1);
				OutputStream_Sub1.method130(i_128_, 65280, i_127_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class151_Sub5.aClass58_4992) {
				Class98_Sub10_Sub22.method1070((byte) -45,
						Class98_Sub11.aClass85_3868);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class246_Sub3_Sub2.aClass58_6151) {
				final int i_129_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShort1((byte) 112);
				Class98_Sub25.method1274(-1);
				Class98_Sub42.method1476(256, i_129_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class98_Sub10_Sub20.aClass58_5635) {
				final int i_130_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShort1((byte) -85);
				final int i_131_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) 92);
				Class98_Sub25.method1274(-1);
				Class308.method3608(i_131_, 0, i + -525200495, i_130_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class339.aClass58_2844 == Class92.currentIncommingOpcode) {// Quick
				// chat?
				// maybe
				final int[] is = new int[4];
				for (int i_132_ = 0; (i_132_ ^ 0xffffffff) > -5; i_132_++) {
					is[i_132_] = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readShort1((byte) -104);
				}
				final int i_133_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final int i_134_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(i ^ ~0x1f4decb5);
				final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
						.method3990(i_133_, -1));
				if (class98_sub39 != null) {
					Class98_Sub43.method1483(i_134_,
							(class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187),
							i ^ 0x1f4decc2, is);
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class246_Sub3.aClass58_5086 == Class92.currentIncommingOpcode) { // grand
				// exchange
				final int i_135_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 37);
				if ((Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 75) ^ 0xffffffff) == -1) {
					Class98_Sub10_Sub24.aClass101Array5666[i_135_] = new Class101();
				} else {
					((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).position--;
					Class98_Sub10_Sub24.aClass101Array5666[i_135_] = new Class101(
							Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514);
				}
				Class92.currentIncommingOpcode = null;
				Class64_Sub11.anInt3668 = Class24.anInt242;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class15.aClass58_184) {
				final int i_136_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteC((byte) -112);
				final int i_137_ = i_136_ >> 41032322;
				final int i_138_ = i_136_ & 0x3;
				final int i_139_ = Class64_Sub17.anIntArray3685[i_137_];
				int i_140_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) -40);
				if (i_140_ == 65535) {
					i_140_ = -1;
				}
				final int i_141_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt2(i + -525200657);
				final int i_142_ = 0x3 & i_141_ >> 87030492;
				int i_143_ = (0xffff619 & i_141_) >> 1305310190;
				i_143_ -= Class272.anInt2038;
				int i_144_ = i_141_ & 0x3fff;
				i_144_ -= aa_Sub2.anInt3562;
				Class283.method3351(i_137_, i_138_, true, i_143_, i_144_,
						i_142_, i_140_, i_139_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class65.aClass58_499 == Class92.currentIncommingOpcode) {
				Class98_Sub10_Sub22
						.method1070((byte) -45, Class60.aClass85_471);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class48_Sub1_Sub2.aClass58_5520 == Class92.currentIncommingOpcode) {
				final int i_145_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShortA(50);
				final byte i_146_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1234(128);
				Class75.aClass140_584.method2286(-7469, i_146_, i_145_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class246_Sub3_Sub4_Sub3.aClass58_6457) { // opens
																							// a
																							// url
				if (Class98_Sub18.aFrame3950 != null) {
					Class98_Sub16
							.method1150(
									Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub27_4052
											.method666((byte) 120), -1, 3, -1,
									false);
				}
				final byte[] is = new byte[Class65.anInt496];
				Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514.method1251(0,
						Class65.anInt496, is, true);
				final String string = Class98_Sub46_Sub6.method1546(
						Class65.anInt496, 0, (byte) -84, is);
				Class315.method3647(true,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
								.method583((byte) 127) ^ 0xffffffff) == -2,
						string, true, Class98_Sub43_Sub2.aClass88_5907);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class98_Sub46_Sub8.aClass58_5996 == Class92.currentIncommingOpcode) {
				final boolean bool = ((Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 65) ^ 0xffffffff) == -2);
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				String string_147_ = string;
				if (bool) {
					string_147_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
				}
				final long l = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final long l_148_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readMediumInt(i ^ ~0x1f4decbf);
				final int pmrights = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 106);
				final long l_150_ = (l << -1427120736) + l_148_;
				boolean bool_151_ = false;
				while_29_: do {
					for (int i_152_ = 0; (i_152_ ^ 0xffffffff) > -101; i_152_++) {
						if (l_150_ == Class94.aLongArray794[i_152_]) {
							bool_151_ = true;
							break while_29_;
						}
					}
					if (pmrights <= 1) {
						if ((Class109.aBoolean933 && !Class98_Sub10_Sub35.aBoolean5732)
								|| Model.aBoolean1401) {
							bool_151_ = true;
						} else if (Class14.method225(string_147_, (byte) 126)) {
							bool_151_ = true;
						}
					}
				} while (false);
				if (!bool_151_ && Class22.anInt216 == 0) {
					Class94.aLongArray794[Class147.anInt1193] = l_150_;
					Class147.anInt1193 = (1 + Class147.anInt1193) % 100;
					final String string_153_ = (Class249
							.method3160(
									Class322.method3670(
											(Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514),
											(byte) 72), 62));
					// if ((pmrights ^ 0xffffffff) != -3) {
					if (pmrights == 2) {
						Class137.method2276(string, 7, "<img=1>" + string,
								string_153_, -1, null, (byte) -93, 0, "<img=1>"
										+ string_147_);
					} else if (pmrights == 1) {
						Class137.method2276(string, 7, "<img=0>" + string,
								string_153_, -1, null, (byte) -120, 0,
								"<img=0>" + string_147_);
					} else if (pmrights == 10) {
						Class137.method2276(string, 3, "<img=8>" + string,
								string_153_, -1, null, (byte) -120, 0,
								"<img=8>" + string_147_);
					} else if (pmrights == 12) {
						Class137.method2276(string, 3, "<img=9>" + string,
								string_153_, -1, null, (byte) -120, 0,
								"<img=9>" + string_147_);
					} else if (pmrights == 13) {
						Class137.method2276(string, 3, "<img=10>" + string,
								string_153_, -1, null, (byte) -120, 0,
								"<img=10>" + string_147_);
					} else {
						Class137.method2276(string, 3, string, string_153_, -1,
								null, (byte) -108, 0, string_147_);
					}
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Exception_Sub1.aClass58_43) {
				Class273.method3280((byte) -101);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class372.aClass58_3147 == Class92.currentIncommingOpcode) {
				final int i_154_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShort1((byte) 50);
				final byte i_155_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readSignedByte((byte) -19);
				Class98_Sub25.method1274(-1);
				Class116.method2161(i_155_, i_154_, (byte) -120);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class224_Sub1.aClass58_5032) {
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				final int i_156_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readIntReverse(true);
				Class98_Sub25.method1274(i ^ ~0x1f4decc3);
				ha_Sub1.method1895(i_156_, (byte) -52, string);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class16.aClass58_191) {
				Class98_Sub10_Sub1.method1003(false, aa_Sub3.aBoolean3569);
				Class92.currentIncommingOpcode = null;
				return false;
			}
			if (Class92.currentIncommingOpcode == Class277.aClass58_2052) {
				final int i_157_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShort1((byte) -79);
				final int i_158_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) -72);
				final int i_159_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt1(false);
				Class98_Sub25.method1274(-1);
				Class98_Sub10_Sub33.method1099(i_159_, i_158_
						+ (i_157_ << -528695792), (byte) 111);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class283.aClass58_2143 == Class92.currentIncommingOpcode) { // save
				final int i_160_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readIntReverse(true);
				final int i_161_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) -48);
				final int i_162_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readIntReverse(true);
				Class98_Sub25.method1274(-1);
				Class98_Sub19.method1164(i_161_, i_160_, 5, 4, i_162_);
				// Class98_Sub19.method1164(id, -1, 2, i ^ 0x1f4decc7,
				// interfaceId);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class369.aClass58_3132 == Class92.currentIncommingOpcode) {
				Class248.anInt1897 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 15);
				for (int i_163_ = 0; (Class248.anInt1897 ^ 0xffffffff) < (i_163_ ^ 0xffffffff); i_163_++) {
					Class246_Sub4_Sub1.aStringArray6171[i_163_] = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
					Class255.aStringArray3209[i_163_] = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
					if (Class255.aStringArray3209[i_163_].equals("")) {
						Class255.aStringArray3209[i_163_] = Class246_Sub4_Sub1.aStringArray6171[i_163_];
					}
					Class98_Sub45.aStringArray4255[i_163_] = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
					Class110.aStringArray945[i_163_] = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
					if (Class110.aStringArray945[i_163_].equals("")) {
						Class110.aStringArray945[i_163_] = Class98_Sub45.aStringArray4255[i_163_];
					}
					Class98_Sub10_Sub38.aBooleanArray5759[i_163_] = false;
				}
				Class363.anInt3099 = Class24.anInt242;
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class150.aClass58_1212) {
				Class98_Sub36.method1459(-1048016408);
				Class92.currentIncommingOpcode = null;
				return false;
			}
			if (Class309.aClass58_2651 == Class92.currentIncommingOpcode) {
				final int i_164_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteC((byte) -107);
				final int i_165_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShortA(75);
				Class75.aClass140_584.method2292(i_165_, i_164_, -32727);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class73.aClass58_3482 == Class92.currentIncommingOpcode) {
				int i_166_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShortA(i ^ 0x1f4dec82);
				if (i_166_ == 65535) {
					i_166_ = -1;
				}
				final int i_167_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(-83);
				String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				final int i_168_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(126);
				if ((i_168_ ^ 0xffffffff) <= -2 && (i_168_ ^ 0xffffffff) >= -9) {
					if (string.equalsIgnoreCase("null")) {
						string = null;
					}
					Class269.aStringArray2021[-1 + i_168_] = string;
					Class151_Sub9.anIntArray5019[i_168_ + -1] = i_166_;
					Class146_Sub2.aBooleanArray4840[-1 + i_168_] = (i_167_ ^ 0xffffffff) == -1;
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class370.aClass58_3134 == Class92.currentIncommingOpcode) { // hinticon
				// id
				// 0
				final int i_169_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 51);
				final int i_170_ = i_169_ >> -2017319579;
				final int i_171_ = i_169_ & 0x1f;
				if (i_171_ == 0) {
					Class104.aClass36Array903[i_170_] = null;
					Class92.currentIncommingOpcode = null;
					return true;
				}
				final Class36 class36 = new Class36();
				class36.anInt346 = i_171_;
				class36.anInt341 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 90);
				if (class36.anInt341 >= 0
						&& (class36.anInt341 < Class306.aClass332Array2557.length)) {
					if ((class36.anInt346 ^ 0xffffffff) != -2
							&& class36.anInt346 != 10) {
						if ((class36.anInt346 ^ 0xffffffff) <= -3
								&& class36.anInt346 <= 6) {
							if (class36.anInt346 == 2) {
								class36.anInt338 = 256;
								class36.anInt347 = 256;
							}
							if ((class36.anInt346 ^ 0xffffffff) == -4) {
								class36.anInt338 = 0;
								class36.anInt347 = 256;
							}
							if ((class36.anInt346 ^ 0xffffffff) == -5) {
								class36.anInt338 = 512;
								class36.anInt347 = 256;
							}
							if ((class36.anInt346 ^ 0xffffffff) == -6) {
								class36.anInt338 = 256;
								class36.anInt347 = 0;
							}
							if ((class36.anInt346 ^ 0xffffffff) == -7) {
								class36.anInt347 = 512;
								class36.anInt338 = 256;
							}
							class36.anInt346 = 2;
							class36.anInt342 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
									.readUnsignedByte((byte) -112);
							class36.anInt338 += (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
									.readUnsignedShort((byte) 127) - Class272.anInt2038) << -1727288087;
							class36.anInt347 += (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
									.readUnsignedShort((byte) 127) + -aa_Sub2.anInt3562) << 357961001;
							class36.anInt343 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
									.readUnsignedByte((byte) 2) << -1401715486;
							class36.anInt340 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
									.readUnsignedShort((byte) 127);
						}
					} else {
						class36.anInt345 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readUnsignedShort((byte) 127);
						((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).position += 6;
					}
					class36.anInt339 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					if (class36.anInt339 == 65535) {
						class36.anInt339 = -1;
					}
					Class104.aClass36Array903[i_170_] = class36;
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class211.aClass58_1595) { // sound
				int i_172_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				if (i_172_ == 65535) {
					i_172_ = -1;
				}
				final int i_173_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 91);
				final int i_174_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final int i_175_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 5);
				final int i_176_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				Class98_Sub10_Sub9.method1036(-1962608884, i_175_, i_173_,
						i_172_, false, i_174_, i_176_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class301.aClass58_2507) {
				final int i_177_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(i ^ 0x1f4dec88);
				final int i_178_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteA(true);
				final int i_179_ = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShort1((byte) 57) << 12040226);
				final int i_180_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteA(true);
				final int i_181_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteA(true);
				Class98_Sub25.method1274(-1);
				ha_Sub1.method1871(i_177_, i_180_, true, i_179_, i_178_,
						i_181_, i + -525200676);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class59.aClass58_469 == Class92.currentIncommingOpcode) {
				final int i_182_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final int i_183_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 101);
				final boolean bool = (0x1 & i_183_) == 1;
				Class232.method2882(i + -525200605, i_182_, bool);
				final int i_184_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				for (int i_185_ = 0; (i_184_ ^ 0xffffffff) < (i_185_ ^ 0xffffffff); i_185_++) {
					final int i_186_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readShortA(84);
					int i_187_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readByteC((byte) -122);
					if (i_187_ == 255) {
						i_187_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readInt1(false);
					}
					Class349.method3841(bool, i_187_, 3113, i_182_,
							-1 + i_186_, i_185_);
				}
				Class78.anIntArray597[Class202.method2702(Class145.anInt1172++,
						31)] = i_182_;
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class151_Sub6.aClass58_4997) {
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				final String string_188_ = (Class249.method3160(Class322
						.method3670(
								(Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514),
								(byte) 72), 62));
				Class98_Sub45.method1521((byte) 44, 6, string_188_, 0, string,
						string, string);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class150.aClass58_1210) {
				int i_189_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(74);
				int i_190_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(i ^ 0x1f4dec88);
				if (i_189_ == 255) {
					i_190_ = -1;
					i_189_ = -1;
				}
				Class244.method2953((byte) -103, i_189_, i_190_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class98_Sub31_Sub2.aClass58_5838) {
				Class333.anInt3386 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -118);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class98_Sub42.aClass58_4222) {
				Class98_Sub10_Sub22.method1070((byte) -45,
						Class246_Sub4_Sub2.aClass85_6186);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class25.aClass58_266 == Class92.currentIncommingOpcode) {
				final int i_191_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readIntReverse(true);
				final int i_192_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) 121);
				Class98_Sub25.method1274(-1);
				Class45.method430(true, i_192_, i_191_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == aa_Sub1.aClass58_3554) {
				final int i_193_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final int i_194_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final int i_195_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				Class98_Sub25.method1274(-1);
				if (Class159.aClass293ArrayArray1252[i_193_] != null) {
					for (int i_196_ = i_194_; i_196_ < i_195_; i_196_++) {
						final int i_197_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readMediumInt(i + -525200702);
						if ((Class159.aClass293ArrayArray1252[i_193_].length ^ 0xffffffff) < (i_196_ ^ 0xffffffff)
								&& (Class159.aClass293ArrayArray1252[i_193_][i_196_]) != null) {
							(Class159.aClass293ArrayArray1252[i_193_][i_196_]).anInt2259 = i_197_;
						}
					}
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class3.aClass58_75) {
				Class98_Sub10_Sub22
						.method1070((byte) -45, Class79.aClass85_600);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class44.aClass58_379 == Class92.currentIncommingOpcode) {
				final int i_198_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(i + -525200497);
				final int i_199_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) -81);
				final boolean bool = (0x1 & i_198_ ^ 0xffffffff) == -2;
				Class181.method2610(true, bool, i_199_);
				Class78.anIntArray597[Class202.method2702(Class145.anInt1172++,
						31)] = i_199_;
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class98_Sub46_Sub15.aClass58_6041 == Class92.currentIncommingOpcode) {
				final int i_200_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteA(true);
				final int i_201_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShortA(102);
				Class98_Sub25.method1274(-1);
				if (i_200_ == 2) {
					Class231.method2878(i ^ 0x1f4decc1);
				}
				Class15.anInt185 = i_201_;
				Class98_Sub46_Sub15.method1609(i_201_, i + -525213468);
				Class40.method359(-124, false);
				ClientScriptsDefs.method3155(Class15.anInt185);
				for (int i_202_ = 0; (i_202_ ^ 0xffffffff) > -101; i_202_++) {
					aa_Sub3.aBooleanArray3574[i_202_] = true;
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class64_Sub2.aClass58_3645 == Class92.currentIncommingOpcode) {
				final int i_203_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteC((byte) -128);
				final int i_204_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteC((byte) -128);
				int i_205_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShort1((byte) 90);
				if ((i_205_ ^ 0xffffffff) == -65536) {
					i_205_ = -1;
				}
				Class246_Sub3_Sub1.method2994(i_205_, i_203_, (byte) -83,
						i_204_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class64_Sub10.aClass58_3665 == Class92.currentIncommingOpcode) {
				final int i_206_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1192((byte) -108);
				final int i_207_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(88);
				int i_208_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShort1((byte) 42);
				if ((i_208_ ^ 0xffffffff) == -65536) {
					i_208_ = -1;
				}
				Class228.method2861(i_206_, i_207_, i_208_, 18596);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class13.aClass58_161) { // Changed
				// their
				// streams?
				Class206.anInt1568 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 100);
				Class335.anInt2819 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1187((byte) -112) << -1201567837;
				Class53.anInt430 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1184(i + -2023493939) << -1233392637;
				while (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514.position < Class65.anInt496) {
					Class85 class85 = (Class113.method2143(-1)[Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) 111)]);
					Class98_Sub10_Sub22.method1070((byte) -45, class85);
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class76.aClass58_589 == Class92.currentIncommingOpcode) {
				int i_209_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				if (i_209_ == 65535) {
					i_209_ = -1;
				}
				final int i_210_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 56);
				final int i_211_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final int i_212_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 25);
				final int i_213_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				Class301.method3537(i_213_, (byte) 1, i_209_, i_210_, i_211_,
						i_212_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class211.aClass58_1596 == Class92.currentIncommingOpcode) {
				Class98_Sub25.method1274(i + -525200580);
				Class284.method3359(9268);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class246_Sub3_Sub4_Sub4.aClass58_6487) {
				final int i_214_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) -39);
				final int i_215_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt(-2);
				Class75.aClass140_584.method2292(i_214_, i_215_, i
						^ ~0x1f4d9315);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class217.aClass58_3406) {
				Class98_Sub10_Sub22.method1070((byte) -45,
						Class98_Sub10_Sub16.aClass85_5621);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == ByteBuffer.updateTilePosition) { // ??
				Class53.anInt430 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1184(-1498293360) << -182592509;
				Class206.anInt1568 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteC((byte) -106);
				Class335.anInt2819 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1184(i + -2023493939) << 1849187075;
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class98_Sub26.aClass58_4029 == Class92.currentIncommingOpcode) {
				System.out.println("parasing");
				final int i_216_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final int i_217_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -100);
				final boolean bool = (0x1 & i_217_ ^ 0xffffffff) == -2;
				while ((((ByteBuffer) Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514).position ^ 0xffffffff) > (Class65.anInt496 ^ 0xffffffff)) {
					final int i_218_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readSmart();
					final int i_219_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					int i_220_ = 0;
					if ((i_219_ ^ 0xffffffff) != -1) {
						i_220_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readUnsignedByte((byte) -124);
						if (i_220_ == 255) {
							i_220_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
									.readInt(i + -525200581);
						}
					}
					Class349.method3841(bool, i_220_, i ^ 0x1f4de0ea, i_216_,
							-1 + i_219_, i_218_);
				}
				Class78.anIntArray597[Class202.method2702(Class145.anInt1172++,
						31)] = i_216_;
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class98_Sub47.aClass58_4270 == Class92.currentIncommingOpcode) {
				final boolean bool = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(-31) == 1);
				Class98_Sub25.method1274(-1);
				Class98_Sub46_Sub1.aBoolean5943 = bool;
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class27.aClass58_274) {
				Class108.method1731(Class65.anInt496,
						Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514, i
								+ -525200579);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class159.aClass58_1253 == Class92.currentIncommingOpcode) {
				final int i_221_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -114);
				final boolean bool = (i_221_ & 0x1 ^ 0xffffffff) == -2;
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				String string_222_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				if (string_222_.equals("")) {
					string_222_ = string;
				}
				final String string_223_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				String string_224_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				if (string_224_.equals("")) {
					string_224_ = string_223_;
				}
				if (bool) {
					for (int i_225_ = 0; ((i_225_ ^ 0xffffffff) > (Class248.anInt1897 ^ 0xffffffff)); i_225_++) {
						if (Class255.aStringArray3209[i_225_]
								.equals(string_224_)) {
							Class246_Sub4_Sub1.aStringArray6171[i_225_] = string;
							Class255.aStringArray3209[i_225_] = string_222_;
							Class98_Sub45.aStringArray4255[i_225_] = string_223_;
							Class110.aStringArray945[i_225_] = string_224_;
							break;
						}
					}
				} else {
					Class246_Sub4_Sub1.aStringArray6171[Class248.anInt1897] = string;
					Class255.aStringArray3209[Class248.anInt1897] = string_222_;
					Class98_Sub45.aStringArray4255[Class248.anInt1897] = string_223_;
					Class110.aStringArray945[Class248.anInt1897] = string_224_;
					Class98_Sub10_Sub38.aBooleanArray5759[Class248.anInt1897] = Class202
							.method2702(2, i_221_) == 2;
					Class248.anInt1897++;
				}
				Class92.currentIncommingOpcode = null;
				Class363.anInt3099 = Class24.anInt242;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class246_Sub3_Sub2_Sub1.aClass58_6335) {
				final boolean bool = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -125) == 1);
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				String string_226_ = string;
				if (bool) {
					string_226_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
				}
				final int i_227_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -6);
				final int i_228_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				boolean bool_229_ = false;
				if (i_227_ <= 1 && Class14.method225(string_226_, (byte) 108)) {
					bool_229_ = true;
				}
				if (!bool_229_ && (Class22.anInt216 ^ 0xffffffff) == -1) {
					final String string_230_ = (Class52.aClass280_3500
							.method3325(i_228_, 44).method1576(i + -525185298,
							Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514));
					if (i_227_ != 2) {
						if (i_227_ != 1) {
							Class137.method2276(string, 25, string,
									string_230_, i_228_, null, (byte) -100, 0,
									string_226_);
						} else if (i_227_ == 10) {
							Class137.method2276(string, 25, "<img=8>" + string,
									string_230_, i_228_, null, (byte) -127, 0,
									"<img=8>" + string_226_);
						}
						Class137.method2276(string, 25, "<img=0>" + string,
								string_230_, i_228_, null, (byte) -127, 0,
								"<img=0>" + string_226_);
					} else {
						Class137.method2276(string, 25, "<img=1>" + string,
								string_230_, i_228_, null, (byte) -123, 0,
								"<img=1>" + string_226_);
					}

				} // lookiing
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class320.aClass58_2708 == Class92.currentIncommingOpcode) {
				Class98_Sub10_Sub1.method1003(false, false);
				Class92.currentIncommingOpcode = null;
				return false;
			}
			if (Class92.currentIncommingOpcode == Class53.aClass58_431) {
				final int i_231_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt1(false);
				final int i_232_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(i ^ 0x1f4dec8f);
				final int i_233_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readByteS(-103);
				Class52.anIntArray3493[i_232_] = i_231_;
				Class64_Sub21.skillLevels[i_232_] = i_233_;
				Class256_Sub1.anIntArray5158[i_232_] = 1;
				final int i_234_ = -1
						+ Class98_Sub46_Sub4.anIntArray5955[i_232_];
				for (int i_235_ = 0; i_234_ > i_235_; i_235_++) {
					if (i_231_ >= Class48_Sub1.anIntArray3629[i_235_]) {
						Class256_Sub1.anIntArray5158[i_232_] = 2 + i_235_;
					}
				}
				Class98_Sub16.anIntArray3928[Class202.method2702(31,
						Class93_Sub1.anInt5477++)] = i_232_;
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class64_Sub1.aClass58_3637) {
				Class98_Sub10_Sub22
						.method1070((byte) -45, Class39.aClass85_362);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class98_Sub50.aClass58_4291) {
				Class218.aString1636 = ((Class65.anInt496 ^ 0xffffffff) < -3 ? Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84) : Class309.aClass309_2612
						.method3615(Class374.anInt3159, (byte) 25));
				Class199.anInt1541 = Class65.anInt496 > 0 ? Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127) : -1;
				Class92.currentIncommingOpcode = null;
				if ((Class199.anInt1541 ^ 0xffffffff) == -65536) {
					Class199.anInt1541 = -1;
				}
				return true;
			}
			if (Class92.currentIncommingOpcode == Class151_Sub6.aClass58_4998) {
				Class98_Sub28.anInt4078 = 1;
				Class92.currentIncommingOpcode = null;
				Class363.anInt3099 = Class24.anInt242;
				return true;
			}
			if (Class92.currentIncommingOpcode == AbstractModel.aClass58_1179) {
				final int i_236_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt2(i ^ ~0x1f4deccd);
				Class98_Sub25.method1274(-1);
				Class98_Sub19.method1164(za_Sub2.anInt6080, 0, 5,
						i ^ 0x1f4decc7, i_236_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class147.aClass58_1192) {
				final int i_237_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1242(-1420625632);
				final int i_238_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt(i + -525200581);
				final int i_239_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1183(65536);
				Class98_Sub25.method1274(-1);
				Class246_Sub3.method2984(i_239_, (byte) -105, i_237_, i_238_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class27.aClass58_277) {
				final int i_240_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readIntReverse(true);
				Class98_Sub25.method1274(-1);
				final Class98_Sub18 class98_sub18 = ((Class98_Sub18) Class116.aClass377_964
						.method3990(i_240_, -1));
				if (class98_sub18 != null) {
					Class196.method2666(16398, false, class98_sub18, true);
				}
				if (OutputStream_Sub1.aClass293_33 != null) {
					Class341.method3812(OutputStream_Sub1.aClass293_33);
					OutputStream_Sub1.aClass293_33 = null;
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class98_Sub34.aClass58_4128) {
				final int i_241_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt1(false);
				final int i_242_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1198(i + -525200697);
				Class98_Sub25.method1274(i ^ ~0x1f4decc3);
				Class218.method2806(i_241_, i_242_, true);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class308.aClass58_2581 == Class92.currentIncommingOpcode) {
				final int i_243_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final int i_244_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readIntReverse(true);
				final int i_245_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) -115);
				final int i_246_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShortA(96);
				Class98_Sub25.method1274(-1);
				Class98_Sub19.method1164(i_245_ << 725805072 | i_243_, i_246_,
						7, 4, i_244_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class283.aClass58_2139) {
				Class98_Sub10_Sub22.method1070((byte) -45,
						Class351.aClass85_2921);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == GameObjectDefinition.aClass58_2993) {
				Class98_Sub46_Sub9.anInt6003 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1227((byte) -1);
				Class109.aBoolean933 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 112) == 1;
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class98_Sub10_Sub14.aClass58_5608 == Class92.currentIncommingOpcode) {
				if (!Class246_Sub3_Sub3.method3011(-6410, Class177.anInt1376)) {
					Class98_Sub10_Sub6.anInt5569 = 30 * Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
				} else {
					Class98_Sub10_Sub6.anInt5569 = (int) (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127) * 2.5F);
				}
				Class98_Sub36.anInt4161 = Class24.anInt242;
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class93_Sub3.aClass58_5493 == Class92.currentIncommingOpcode) {
				Class98_Sub10_Sub22.method1070((byte) -45,
						ha_Sub1.aClass85_4299);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class98_Sub10_Sub28.aClass58_5697 == Class92.currentIncommingOpcode) {
				final int i_247_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShort1((byte) 75);
				Class98_Sub25.method1274(i + -525200580);
				Class98_Sub11.method1127((byte) 67, i_247_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (ReferenceTable.aClass58_2661 == Class92.currentIncommingOpcode) {
				for (int i_248_ = 0; i_248_ < (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030).length; i_248_++) {
					if ((Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_248_]) != null) {
						((Entity) (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_248_])).anIntArray6373 = null;
						((Entity) (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_248_])).anInt6413 = -1;
					}
				}
				for (int i_249_ = 0; ((i_249_ ^ 0xffffffff) > (Class98_Sub10_Sub20.anInt5640 ^ 0xffffffff)); i_249_++) {
					((Entity) (Class163.aClass98_Sub39Array3516[i_249_].aClass246_Sub3_Sub4_Sub2_Sub1_4187)).anIntArray6373 = null;
					((Entity) (Class163.aClass98_Sub39Array3516[i_249_].aClass246_Sub3_Sub4_Sub2_Sub1_4187)).anInt6413 = -1;
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class336.aClass58_2825 == Class92.currentIncommingOpcode) {
				final int i_250_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt1(false);
				Class98_Sub25.method1274(-1);
				Class98_Sub19.method1164(-1, -1, 3, i ^ 0x1f4decc7, i_250_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class8.aClass58_112) {
				final boolean bool = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 20) == 1);
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				String string_251_ = string;
				if (bool) {
					string_251_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
				}
				final long l = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1246(-105);
				final long l_252_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final long l_253_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readMediumInt(-124);
				final int clanrights = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 126);
				final long l_255_ = (l_252_ << -172131936) + l_253_;
				boolean bool_256_ = false;
				while_30_: do {
					for (int i_257_ = 0; i_257_ < 100; i_257_++) {
						if (l_255_ == Class94.aLongArray794[i_257_]) {
							bool_256_ = true;
							break while_30_;
						}
					}
					if (clanrights <= 1) {
						if ((Class109.aBoolean933 && !Class98_Sub10_Sub35.aBoolean5732)
								|| Model.aBoolean1401) {
							bool_256_ = true;
						} else if (Class14.method225(string_251_, (byte) 121)) {
							bool_256_ = true;
						}
					}
				} while (false);
				if (!bool_256_ && (Class22.anInt216 ^ 0xffffffff) == -1) {
					Class94.aLongArray794[Class147.anInt1193] = l_255_;
					Class147.anInt1193 = (Class147.anInt1193 - -1) % 100;
					final String string_258_ = (Class249
							.method3160(
									Class322.method3670(
											(Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514),
											(byte) 72), 62));
					// if (clanrights != 2 && clanrights != 3) {
					if (clanrights == 2) {
						Class137.method2276(string, 9, "<img=1>" + string,
								string_258_, -1,
								Class18.method247(l, i + -525200644),
								(byte) -113, 0, "<img=1>" + string_251_);

					} else if (clanrights == 1) {
						Class137.method2276(string, 9, "<img=0>" + string,
								string_258_, -1,
								Class18.method247(l, i + -525200681),
								(byte) -65, 0, "<img=0>" + string_251_);
					} else if (clanrights == 12) {
						Class137.method2276(string, 9, "<img=9>" + string,
								string_258_, -1,
								Class18.method247(l, i + -525200644),
								(byte) -113, 0, "<img=9>" + string_251_);
					} else if (clanrights == 13) {
						Class137.method2276(string, 9, "<img=10>" + string,
								string_258_, -1,
								Class18.method247(l, i + -525200644),
								(byte) -113, 0, "<img=10>" + string_251_);
					} else if (clanrights == 11) {
						Class137.method2276(string, 9, "<img=8><img=0>"
								+ string, string_258_, -1,
								Class18.method247(l, i + -525200644),
								(byte) -113, 0, "<img=8><img=0>" + string_251_);
					} else if (clanrights == 10) {
						Class137.method2276(string, 9, "<img=8>" + string,
								string_258_, -1,
								Class18.method247(l, i + -525200644),
								(byte) -113, 0, "<img=8>" + string_251_);
					} else {
						Class137.method2276(string, 9, string, string_258_, -1,
								Class18.method247(l, -120), (byte) -84, 0,
								string_251_);
					}
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class64_Sub15.aClass58_3677) {

				final int set = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt2(-108);
				int len = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShortA(i + -525200459);
				if (len == 65535) {
					len = -1;
				}
				int off = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShortA(74);
				if ((off ^ 0xffffffff) == -65536) {
					off = -1;
				}
				final int interchild = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readIntReverse(true);

				Class98_Sub25.method1274(-1);
				for (int i_263_ = off; (len ^ 0xffffffff) <= (i_263_ ^ 0xffffffff); i_263_++) {
					final long l = ((long) interchild << -1557162784)
							- -(long) i_263_;
					final Class98_Sub49 class98_sub49 = ((Class98_Sub49) Class168.aClass377_1287
							.method3990(l, -1));
					Class98_Sub49 class98_sub49_264_;
					if (class98_sub49 != null) {
						class98_sub49_264_ = new Class98_Sub49(set,
								class98_sub49.anInt4285);
						class98_sub49.method942(103);
					} else if ((i_263_ ^ 0xffffffff) == 0) {
						class98_sub49_264_ = new Class98_Sub49(
								set,
								((Class159.method2509(interchild, -9820).aClass98_Sub49_2348).anInt4285));
					} else {
						class98_sub49_264_ = new Class98_Sub49(set, -1);
					}
					Class168.aClass377_1287.method3996(class98_sub49_264_, l,
							-1);
				}

				Class92.currentIncommingOpcode = null;
				return true;
			}

			if (Class92.currentIncommingOpcode == Class36.aClass58_344) {// shawn
				final int i_265_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt1(false);
				int i_266_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				if ((i_266_ ^ 0xffffffff) == -65536) {
					i_266_ = -1;
				}
				final int i_267_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShortA(66);
				int i_268_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				if ((i_268_ ^ 0xffffffff) == -65536) {
					i_268_ = -1;
				}
				Class98_Sub25.method1274(-1);
				for (int i_269_ = i_266_; (i_269_ ^ 0xffffffff) >= (i_268_ ^ 0xffffffff); i_269_++) {
					final long l = ((long) i_265_ << -1828767200)
							- -(long) i_269_;
					final Class98_Sub49 class98_sub49 = ((Class98_Sub49) Class168.aClass377_1287
							.method3990(l, -1));
					Class98_Sub49 class98_sub49_270_;
					if (class98_sub49 != null) {
						class98_sub49_270_ = new Class98_Sub49(
								class98_sub49.anInt4284, i_267_);
						class98_sub49.method942(110);
					} else if ((i_269_ ^ 0xffffffff) == 0) {
						class98_sub49_270_ = (new Class98_Sub49(
								(Class159.method2509(i_265_, i ^ ~0x1f4dca98).aClass98_Sub49_2348).anInt4284,
								i_267_));
					} else {
						class98_sub49_270_ = new Class98_Sub49(0, i_267_);
					}
					Class168.aClass377_1287.method3996(class98_sub49_270_, l, i
							^ ~0x1f4decc3);
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class284_Sub2_Sub2.aClass58_6197 == Class92.currentIncommingOpcode) {
				final int i_271_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readIntReverse(true);
				final int i_272_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShortA(111);
				final int i_273_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final int i_274_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				Class98_Sub25.method1274(i + -525200580);
				Class353.method3868(i_274_, i_271_, (byte) -121, i_273_, i_272_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Player.aClass58_6516) {
				Class64_Sub22.anInt3705 = Class24.anInt242;
				if (Class65.anInt496 == 0) {
					Class374.aClass147Array3157 = null;
					Class93_Sub3.aString5494 = null;
					Class32.anInt308 = 0;
					Class153.aString1229 = null;
					Class92.currentIncommingOpcode = null;
					return true;
				}
				Class93_Sub3.aString5494 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				boolean bool = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 85) == 1);
				if (bool) {
					Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
				}
				final long l = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1246(-126);
				Class153.aString1229 = Class98_Sub28.method1305(-89, l);
				Class232.aByte1742 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readSignedByte((byte) -19);
				final int i_275_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 120);
				if ((i_275_ ^ 0xffffffff) == -256) {
					Class92.currentIncommingOpcode = null;
					return true;
				}
				Class32.anInt308 = i_275_;
				final Class147[] class147s = new Class147[100];
				for (int i_276_ = 0; (i_276_ ^ 0xffffffff) > (Class32.anInt308 ^ 0xffffffff); i_276_++) {
					class147s[i_276_] = new Class147();
					class147s[i_276_].aString1191 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
					bool = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedByte((byte) -106) == 1;
					if (bool) {
						class147s[i_276_].aString1186 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readString((byte) 84);
					} else {
						class147s[i_276_].aString1186 = class147s[i_276_].aString1191;
					}
					class147s[i_276_].aString1185 = Class353.method3867(i
							^ ~0x1f4decc3, (class147s[i_276_].aString1186));
					class147s[i_276_].anInt1188 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readUnsignedShort((byte) 127);
					class147s[i_276_].aByte1187 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readSignedByte((byte) -19);
					class147s[i_276_].aString1190 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
					if (class147s[i_276_].aString1186
							.equals(Surface.player.name2)) {
						Class111.aByte947 = class147s[i_276_].aByte1187;
					}
				}
				boolean bool_277_ = false;
				int i_278_ = Class32.anInt308;
				while (i_278_ > 0) {
					bool_277_ = true;
					i_278_--;
					for (int i_279_ = 0; i_278_ > i_279_; i_279_++) {
						if (((class147s[i_279_].aString1185
								.compareTo(class147s[1 + i_279_].aString1185)) ^ 0xffffffff) < -1) {
							final Class147 class147 = class147s[i_279_];
							class147s[i_279_] = class147s[i_279_ + 1];
							class147s[1 + i_279_] = class147;
							bool_277_ = false;
						}
					}
					if (bool_277_) {
						break;
					}
				}
				Class92.currentIncommingOpcode = null;
				Class374.aClass147Array3157 = class147s;
				return true;
			}
			if (Class18.aClass58_215 == Class92.currentIncommingOpcode) {
				final boolean bool = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -117) == 1);
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				String string_280_ = string;
				if (bool) {
					string_280_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
				}
				final long l = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1246(-122);
				final long l_281_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final long l_282_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readMediumInt(i ^ ~0x1f4decbe);
				final int notnotrights = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -119);
				final int i_284_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final long l_285_ = l_282_ + (l_281_ << -741032544);
				boolean bool_286_ = false;
				while_31_: do {
					for (int i_287_ = 0; (i_287_ ^ 0xffffffff) > -101; i_287_++) {
						if (l_285_ == Class94.aLongArray794[i_287_]) {
							bool_286_ = true;
							break while_31_;
						}
					}
					if (notnotrights <= 1
							&& Class14.method225(string_280_, (byte) 103)) {
						bool_286_ = true;
					}
				} while (false);
				if (!bool_286_ && Class22.anInt216 == 0) {
					Class94.aLongArray794[Class147.anInt1193] = l_285_;
					Class147.anInt1193 = (Class147.anInt1193 - -1) % 100;
					final String string_288_ = (Class52.aClass280_3500
							.method3325(i_284_, 98).method1576(15281,
							Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514));
					if (notnotrights == 2) {
						Class137.method2276(string, 20, "<img=1>" + string,
								string_288_, i_284_, Class18.method247(l, -76),
								(byte) -117, 0, "<img=1>" + string_280_);
					} else if (notnotrights == 1) {
						Class137.method2276(string, 20, "<img=0>" + string,
								string_288_, i_284_,
								Class18.method247(l, -113), (byte) -121, 0,
								"<img=0>" + string_280_);
					} else {
						Class137.method2276(string, 20, string, string_288_,
								i_284_, Class18.method247(l, -81), (byte) -53,
								0, string_280_);
					}
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class177.aClass58_1381 == Class92.currentIncommingOpcode) {
				final int i_289_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readLEShortA((byte) -102);
				final int i_290_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readIntReverse(true);
				Class98_Sub25.method1274(i ^ ~0x1f4decc3);
				Class116.method2161(i_290_, i_289_, (byte) -120);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == RSModelLoader.aClass58_3844) {
				final boolean bool = (Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 117) == 1);
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				String string_291_ = string;
				if (bool) {
					string_291_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
							.readString((byte) 84);
				}
				final long l = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final long l_292_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readMediumInt(-123);
				final int i_293_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 79);
				final int i_294_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedShort((byte) 127);
				final long l_295_ = l_292_ + (l << 812765856);
				boolean bool_296_ = false;
				while_32_: do {
					for (int i_297_ = 0; i_297_ < 100; i_297_++) {
						if (Class94.aLongArray794[i_297_] == l_295_) {
							bool_296_ = true;
							break while_32_;
						}
					}
					if (i_293_ <= 1
							&& Class14.method225(string_291_, (byte) 104)) {
						bool_296_ = true;
					}
				} while (false);
				if (!bool_296_ && (Class22.anInt216 ^ 0xffffffff) == -1) {
					Class94.aLongArray794[Class147.anInt1193] = l_295_;
					Class147.anInt1193 = (Class147.anInt1193 - -1) % 100;
					final String string_298_ = (Class52.aClass280_3500
							.method3325(i_294_, 98).method1576(15281,
							Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514));
					if ((i_293_ ^ 0xffffffff) == -3) {
						Class137.method2276(string, 18, "<img=1>" + string,
								string_298_, i_294_, null, (byte) -101, 0,
								"<img=1>" + string_291_);
					} else if ((i_293_ ^ 0xffffffff) != -2) {
						Class137.method2276(string, 18, string, string_298_,
								i_294_, null, (byte) -97, 0, string_291_);
					} else {
						Class137.method2276(string, 18, "<img=0>" + string,
								string_298_, i_294_, null, (byte) -126, 0,
								"<img=0>" + string_291_);
					}
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class76.aClass58_587 == Class92.currentIncommingOpcode) {
				Class166.method2525(0);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class64_Sub27.aClass58_3715) {
				final String string = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readString((byte) 84);
				final Object[] objects = new Object[string.length() + 1];
				for (int i_299_ = string.length() + -1; i_299_ >= 0; i_299_--) {
					if (string.charAt(i_299_) != 's') {
						objects[1 + i_299_] = new Integer(
								Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
										.readInt(-2));
					} else {
						objects[i_299_ + 1] = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
								.readString((byte) 84);
					}
				}
				objects[0] = new Integer(
						Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514.readInt(-2));
				Class98_Sub25.method1274(-1);
				final Class98_Sub21 class98_sub21 = new Class98_Sub21();
				class98_sub21.anObjectArray3981 = objects;
				ClientScriptsDefs.method3144(class98_sub21);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class335.aClass58_2816) {
				final int i_300_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt2(-112);
				int i_301_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShort1((byte) -77);
				if ((i_301_ ^ 0xffffffff) == -65536) {
					i_301_ = -1;
				}
				Class98_Sub25.method1274(-1);
				Class98_Sub19.method1164(i_301_, -1, 2, i ^ 0x1f4decc7, i_300_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class92.currentIncommingOpcode == Class251.aClass58_1921) {
				int i_302_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readShort1((byte) 78);
				if (i_302_ == 65535) {
					i_302_ = -1;
				}
				final int i_303_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt(-2);
				Class98_Sub25.method1274(i ^ ~0x1f4decc3);
				Class98_Sub19.method1164(i_302_, -1, 1, 4, i_303_);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class287.aClass58_2187 == Class92.currentIncommingOpcode) {
				final int i_304_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) 8);
				Class98_Sub25.method1274(-1);
				Class103.anInt896 = i_304_;
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class287.aClass58_2194 == Class92.currentIncommingOpcode) {
				Class24.anInt255 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUShort(false);
				Class98_Sub36.anInt4161 = Class24.anInt242;
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class98_Sub46_Sub6.aClass58_5975 == Class92.currentIncommingOpcode) {
				final int i_305_ = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readInt(-2);
				Class187.aClass143_1449 = Class98_Sub43_Sub2.aClass88_5907
						.method868(i_305_, 113);
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class196.aClass58_1507 == Class92.currentIncommingOpcode) {
				Class75.aClass140_584.method2288((byte) -79);
				Class239.anInt1844 += 32;
				Class92.currentIncommingOpcode = null;
				return true;
			}
			if (Class64_Sub2.aClass58_3642 == Class92.currentIncommingOpcode) { // rawr
				Class206.anInt1568 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readUnsignedByte((byte) -115);
				Class335.anInt2819 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.method1234(128) << 212170051;
				Class53.anInt430 = Class48_Sub1_Sub2.aClass98_Sub22_Sub1_5514
						.readSignedByte((byte) -19) << 773724419;
				for (Class98_Sub45 class98_sub45 = ((Class98_Sub45) AbstractModel.aClass377_1180
						.method3998(105)); class98_sub45 != null; class98_sub45 = (Class98_Sub45) AbstractModel.aClass377_1180
						.method3995(-1)) {
					final int i_306_ = (int) (0x3L & (((Node) class98_sub45).aLong832 >> 1200025692));
					final int i_307_ = (int) (0x3fffL & ((Node) class98_sub45).aLong832);
					final int i_308_ = i_307_ + -Class272.anInt2038;
					final int i_309_ = (int) (0x3fffL & (((Node) class98_sub45).aLong832 >> 1428694926));
					final int i_310_ = -aa_Sub2.anInt3562 + i_309_;
					if (Class206.anInt1568 == i_306_
							&& i_308_ >= Class53.anInt430
							&& ((Class53.anInt430 - -8 ^ 0xffffffff) < (i_308_ ^ 0xffffffff))
							&& Class335.anInt2819 <= i_310_
							&& (i_310_ ^ 0xffffffff) > (Class335.anInt2819 - -8 ^ 0xffffffff)) {
						class98_sub45.method942(i ^ 0x1f4dec80);
						if ((i_308_ ^ 0xffffffff) <= -1
								&& (i_310_ ^ 0xffffffff) <= -1
								&& i_308_ < Class165.anInt1276
								&& ((Class98_Sub10_Sub7.anInt5572 ^ 0xffffffff) < (i_310_ ^ 0xffffffff))) {
							Class98_Sub32.method1437(i_308_,
									Class206.anInt1568, (byte) 122, i_310_);
						}
					}
				}
				for (Class98_Sub33 class98_sub33 = ((Class98_Sub33) Class191.aClass148_1478
						.method2418(32)); class98_sub33 != null; class98_sub33 = (Class98_Sub33) Class191.aClass148_1478
						.method2417(96)) {
					if ((class98_sub33.anInt4112 ^ 0xffffffff) <= (Class53.anInt430 ^ 0xffffffff)
							&& (class98_sub33.anInt4112 < 8 + Class53.anInt430)
							&& (class98_sub33.anInt4113 ^ 0xffffffff) <= (Class335.anInt2819 ^ 0xffffffff)
							&& ((8 + Class335.anInt2819 ^ 0xffffffff) < (class98_sub33.anInt4113 ^ 0xffffffff))
							&& (Class206.anInt1568 == class98_sub33.anInt4116)) {
						class98_sub33.aBoolean4124 = true;
					}
				}
				for (Class98_Sub33 class98_sub33 = ((Class98_Sub33) Class98_Sub11.aClass148_3866
						.method2418(32)); class98_sub33 != null; class98_sub33 = (Class98_Sub33) Class98_Sub11.aClass148_3866
						.method2417(i + -525200461)) {
					if (((Class53.anInt430 ^ 0xffffffff) >= (class98_sub33.anInt4112 ^ 0xffffffff))
							&& (class98_sub33.anInt4112 < 8 + Class53.anInt430)
							&& (Class335.anInt2819 <= class98_sub33.anInt4113)
							&& ((8 + Class335.anInt2819 ^ 0xffffffff) < (class98_sub33.anInt4113 ^ 0xffffffff))
							&& ((Class206.anInt1568 ^ 0xffffffff) == (class98_sub33.anInt4116 ^ 0xffffffff))) {
						class98_sub33.aBoolean4124 = true;
					}
				}
				Class92.currentIncommingOpcode = null;
				return true;
			}
			Class305_Sub1
					.method3585(
							null,
							i ^ ~0x1f4decb8,
							("T1 - "
									+ (Class92.currentIncommingOpcode != null ? Class92.currentIncommingOpcode
											.method521((byte) 67) : -1)
									+ ","
									+ (Class260.aClass58_3262 == null ? -1
											: Class260.aClass58_3262
													.method521((byte) 76))
									+ ","
									+ (Class98_Sub10_Sub21.aClass58_5641 == null ? -1
											: Class98_Sub10_Sub21.aClass58_5641
													.method521((byte) 71))
									+ " - " + Class65.anInt496));
			Class98_Sub10_Sub1.method1003(false, false);
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "bia.I(" + i + ')');
		}
	}

	public static void openURL(final String url) {
		URLHandler.openURL(url);
	}

	@Override
	public final void method58(final byte i) {
		try {
			super.method58(i);
			final Class93_Sub1 class93_sub1 = (Class93_Sub1) ((Class373) this).aClass93_3478;
			aClass332_5462 = Class237_Sub1.method2915((class93_sub1.anInt5483),
					((Class373) this).aClass207_3473, (byte) -89);
			aClass332_5467 = Class237_Sub1.method2915((class93_sub1.anInt5480),
					((Class373) this).aClass207_3473, (byte) -89);
			aClass332_5463 = Class237_Sub1.method2915((class93_sub1.anInt5485),
					((Class373) this).aClass207_3473, (byte) -89);
			aClass332_5465 = Class237_Sub1.method2915((class93_sub1.anInt5481),
					((Class373) this).aClass207_3473, (byte) -89);
			aClass332_5461 = Class237_Sub1.method2915((class93_sub1.anInt5478),
					((Class373) this).aClass207_3473, (byte) -89);
			aClass332_5464 = Class237_Sub1.method2915((class93_sub1.anInt5484),
					((Class373) this).aClass207_3473, (byte) -89);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "bia.C(" + i + ')');
		}
	}

	public static void method3968(final boolean bool) {
		try {
			aClass58_5466 = null;
			if (bool != false) {
				method3969(-29, 33);
			}
			aClass98_Sub46_Sub16Array5468 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "bia.H(" + bool
					+ ')');
		}
	}

	@Override
	public final boolean method59(final int i) {
		try {
			if (!super.method59(i)) {
				return false;
			}
			final Class93_Sub1 class93_sub1 = (Class93_Sub1) ((Class373) this).aClass93_3478;
			if (!((Class373) this).aClass207_3473.method2742(-22,
					class93_sub1.anInt5483)) {
				return false;
			}
			if (!((Class373) this).aClass207_3473.method2742(-81,
					class93_sub1.anInt5480)) {
				return false;
			}
			if (!((Class373) this).aClass207_3473.method2742(-87,
					class93_sub1.anInt5485)) {
				return false;
			}
			if (!((Class373) this).aClass207_3473.method2742(-58,
					class93_sub1.anInt5481)) {
				return false;
			}
			if (!((Class373) this).aClass207_3473.method2742(-61,
					class93_sub1.anInt5478)) {
				return false;
			}
			if (!((Class373) this).aClass207_3473.method2742(-61,
					class93_sub1.anInt5484)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "bia.A(" + i + ')');
		}
	}

	@Override
	final void method3960(final int i, final int i_311_, final byte i_312_,
			final boolean bool) {
		try {
			if (i_312_ == -36) {
				if (bool) {
					final int[] is = new int[4];
					Class265.aHa1974.K(is);
					Class265.aHa1974.KA(i_311_, i, i_311_
							+ ((((Class373) this).aClass93_3478).anInt3514), i
							- -(((Class373) this).aClass93_3478.anInt3504));
					final int i_313_ = aClass332_5463.method3737();
					final int i_314_ = aClass332_5463.method3749();
					final int i_315_ = aClass332_5465.method3737();
					final int i_316_ = aClass332_5465.method3749();
					aClass332_5463
							.method3735(
									i_311_,
									(-i_314_ + ((((Class373) this).aClass93_3478).anInt3504))
											/ 2 + i);
					aClass332_5465
							.method3735(
									-i_315_
											+ (i_311_ - -(((Class373) this).aClass93_3478).anInt3514),
									(((Class373) this).aClass93_3478.anInt3504 + -i_316_)
											/ 2 + i);
					Class265.aHa1974
							.KA(i_311_,
									i,
									((((Class373) this).aClass93_3478).anInt3514 + i_311_),
									aClass332_5461.method3749() + i);
					aClass332_5461
							.method3738(
									i_311_ + i_313_,
									i,
									(-i_315_ + -i_313_ + ((((Class373) this).aClass93_3478).anInt3514)),
									((((Class373) this).aClass93_3478).anInt3504));
					final int i_317_ = aClass332_5464.method3749();
					Class265.aHa1974
							.KA(i_311_,
									i
											+ (((Class373) this).aClass93_3478.anInt3504)
											- i_317_,
									(((Class373) this).aClass93_3478.anInt3514 + i_311_),
									i
											- -(((Class373) this).aClass93_3478.anInt3504));
					aClass332_5464
							.method3738(
									i_311_ + i_313_,
									(-i_317_ + (i - -(((Class373) this).aClass93_3478.anInt3504))),
									-i_315_
											+ (((Class373) this).aClass93_3478.anInt3514)
											+ -i_313_,
									(((Class373) this).aClass93_3478.anInt3504));
					Class265.aHa1974.KA(is[0], is[1], is[2], is[3]);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("bia.D(" + i + ','
					+ i_311_ + ',' + i_312_ + ',' + bool + ')'));
		}
	}

	static final void method3969(final int i, final int i_318_) {
		do {
			try {
				final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
						.method2628(i_318_, -114, 17);
				class98_sub46_sub17.method1621(0);
				if (i >= 94) {
					break;
				}

				aClass58_5466 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("bia.E(" + i
						+ ',' + i_318_ + ')'));
			}
			break;
		} while (false);
	}
}
