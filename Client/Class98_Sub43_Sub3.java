/* Class98_Sub43_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

final class Class98_Sub43_Sub3 extends Class98_Sub43 {
	private Frame aFrame5911;
	private boolean aBoolean5912;
	private boolean aBoolean5913;
	private TheoraInfo aTheoraInfo5914;
	private double aDouble5915;
	private boolean aBoolean5916;
	private Class332 aClass332_5917;
	private GranulePos aGranulePos5918;
	static int[] anIntArray5919;
	private long aLong5920;
	private TheoraComment aTheoraComment5921;
	static Class245[] aClass245Array5922;
	private DecoderContext aDecoderContext5923;
	static int anInt5924 = 0;
	private int anInt5925;
	static Class65 aClass65_5926;
	private boolean aBoolean5927;
	private SetupInfo aSetupInfo5928;
	private int anInt5929;

	private final void method1495(int i, int i_0_) {
		do {
			try {
				anInt5929 = i;
				int i_1_ = -57 / ((-11 - i_0_) / 48);
				if (!aBoolean5927)
					break;
				if ((anInt5925 ^ 0xffffffff) > (anInt5929 ^ 0xffffffff))
					anInt5929 = anInt5925;
				if ((anInt5929 ^ 0xffffffff) > -1)
					anInt5929 = 0;
				aDecoderContext5923.setPostProcessingLevel(anInt5929);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "sb.B(" + i
						+ ',' + i_0_ + ')');
			}
			break;
		} while (false);
	}

	final float method1496(int i) {
		try {
			if (i != -1)
				return -0.24629752F;
			if (!aBoolean5927 || aTheoraInfo5914.b())
				return 0.0F;

			return ((float) aTheoraInfo5914.fpsNumerator / (float) aTheoraInfo5914.fpsDenominator);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sb.H(" + i + ')');
		}
	}

	public static void method1497(byte i) {
		try {
			aClass245Array5922 = null;
			anIntArray5919 = null;
			if (i <= 74)
				aClass65_5926 = null;
			aClass65_5926 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sb.A(" + i + ')');
		}
	}

	final boolean method1498(int i) {
		try {
			if (i != 1024)
				method1500(true);
			return aBoolean5927;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sb.G(" + i + ')');
		}
	}

	final void method1482(OggPacket oggpacket, boolean bool) {
		do {
			try {
				do {
					if (!aBoolean5927) {
						int i = aSetupInfo5928.decodeHeader(aTheoraInfo5914,
								aTheoraComment5921, oggpacket);
						if ((i ^ 0xffffffff) == -1) {
							aBoolean5927 = true;
							if (aTheoraInfo5914.frameWidth > 2048
									|| aTheoraInfo5914.frameHeight > 1024)
								throw new IllegalStateException();
							aDecoderContext5923 = new DecoderContext(
									aTheoraInfo5914, aSetupInfo5928);
							aGranulePos5918 = new GranulePos();
							aFrame5911 = new Frame(aTheoraInfo5914.frameWidth,
									aTheoraInfo5914.frameHeight);
							anInt5925 = aDecoderContext5923
									.getMaxPostProcessingLevel();
							method1495(anInt5929, -98);
							if (!client.aBoolean3553)
								break;
						}
						if ((i ^ 0xffffffff) > -1)
							throw new IllegalStateException(String.valueOf(i));
					} else {
						aLong5920 = Class343.method3819(-47);
						int i = aDecoderContext5923.decodePacketIn(oggpacket,
								aGranulePos5918);
						if ((i ^ 0xffffffff) > -1)
							throw new IllegalStateException(String.valueOf(i));
						aDecoderContext5923.granuleFrame(aGranulePos5918);
						aDouble5915 = aDecoderContext5923
								.granuleTime(aGranulePos5918);
						if (aBoolean5916) {
							boolean bool_2_ = (oggpacket.isKeyFrame() ^ 0xffffffff) == -2;
							if (!bool_2_)
								return;
							aBoolean5916 = false;
						}
						if (!aBoolean5913
								|| (oggpacket.isKeyFrame() ^ 0xffffffff) == -2) {
							if ((aDecoderContext5923.decodeFrame(aFrame5911) ^ 0xffffffff) != -1)
								throw new IllegalStateException(
										String.valueOf(i));
							aBoolean5912 = true;
						}
					}
				} while (false);
				if (bool == false)
					break;
				anInt5924 = -89;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception,
						("sb.J(" + (oggpacket != null ? "{...}" : "null") + ','
								+ bool + ')'));
			}
			break;
		} while (false);
	}

	Class98_Sub43_Sub3(OggStreamState oggstreamstate) {
		super(oggstreamstate);
		try {
			aSetupInfo5928 = new SetupInfo();
			aTheoraInfo5914 = new TheoraInfo();
			aTheoraComment5921 = new TheoraComment();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sb.<init>("
					+ (oggstreamstate != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method1499(byte i, char c) {
		try {
			if (Character.isISOControl(c))
				return false;
			if (Class114.method2147(c, 115))
				return true;
			char[] cs = Class43.aCharArray376;
			for (int i_3_ = 0; cs.length > i_3_; i_3_++) {
				char c_4_ = cs[i_3_];
				if (c_4_ == c)
					return true;
			}
			char[] cs_5_ = aa_Sub3.aCharArray3572;
			int i_6_ = 0;
			if (i != 105)
				method1497((byte) 7);
			for (/**/; i_6_ < cs_5_.length; i_6_++) {
				char c_7_ = cs_5_[i_6_];
				if (c == c_7_)
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sb.F(" + i + ','
					+ c + ')');
		}
	}

	final long method1500(boolean bool) {
		try {
			if (bool != false)
				return -59L;
			return aLong5920;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sb.E(" + bool
					+ ')');
		}
	}

	final void method1487(int i) {
		try {
			if (aFrame5911 != null)
				aFrame5911.a();
			if (aDecoderContext5923 != null) {
				aDecoderContext5923.a();
				aDecoderContext5923 = null;
			}
			if (aGranulePos5918 != null) {
				aGranulePos5918.a();
				aGranulePos5918 = null;
			}
			aTheoraInfo5914.a();
			aTheoraComment5921.a();
			if (i != -1128)
				aTheoraComment5921 = null;
			aSetupInfo5928.a();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sb.C(" + i + ')');
		}
	}

	final Class332 method1501(ha var_ha, int i) {
		try {
			if (aFrame5911 == null)
				return null;
			if (!aBoolean5912 && aClass332_5917 != null)
				return aClass332_5917;
			if (i != 11242)
				return null;
			aClass332_5917 = var_ha.method1770(aFrame5911.pixels, 0,
					aFrame5911.a, aFrame5911.a, aFrame5911.b, false);
			aBoolean5912 = false;
			return aClass332_5917;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sb.D("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final double method1502(int i) {
		try {
			if (i != 0)
				method1500(false);
			return aDouble5915;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sb.I(" + i + ')');
		}
	}

	static {
		anIntArray5919 = new int[128];
		for (int i = 0; anIntArray5919.length > i; i++)
			anIntArray5919[i] = -1;
		for (int i = 65; i <= 90; i++)
			anIntArray5919[i] = i - 65;
		for (int i = 97; (i ^ 0xffffffff) >= -123; i++)
			anIntArray5919[i] = i + -71;
		for (int i = 48; (i ^ 0xffffffff) >= -58; i++)
			anIntArray5919[i] = 52 + (-48 + i);
		anIntArray5919[45] = anIntArray5919[47] = 63;
		anIntArray5919[42] = anIntArray5919[43] = 62;
		aClass65_5926 = new Class65();
	}
}
