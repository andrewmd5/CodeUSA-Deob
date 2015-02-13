/* Class98_Sub43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

abstract class Class98_Sub43 extends Class98 {
	int anInt4240;
	OggStreamState anOggStreamState4241;
	static int anInt4242;
	static boolean aBoolean4243 = true;

	static final void method1481(final int i) {
		do {
			try {
				for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > -101; i_0_++) {
					aa_Sub3.aBooleanArray3574[i_0_] = true;
				}
				if (i == 2) {
					break;
				}
				aBoolean4243 = true;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "rd.N(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	abstract void method1482(OggPacket oggpacket, boolean bool);

	static final void method1483(final int i,
			final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1,
			final int i_1_, final int[] is) {
		do {
			try {
				if ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6373) != null) {
					boolean bool = true;
					for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > ((((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6373).length ^ 0xffffffff); i_2_++) {
						if (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6373[i_2_] != is[i_2_]) {
							bool = false;
							break;
						}
					}
					if (bool
							&& ((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6413 != -1) {
						final AnimationDefinition class97 = (Class151_Sub7.aClass183_5001
								.method2623(
										((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6413,
										16383));
						final int i_3_ = class97.anInt819;
						if (i_3_ == 1) {
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6405 = 0;
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6400 = i;
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6393 = 0;
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6366 = 0;
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6361 = 1;
							if (!((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).aBoolean6371) {
								Class349.method3840(
										(byte) -126,
										class246_sub3_sub4_sub2_sub1,
										((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6393,
										class97);
							}
						}
						if (i_3_ == 2) {
							((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6405 = 0;
						}
					}
				}
				if (i_1_ != 1) {
					method1483(58, null, 36, null);
				}
				boolean bool = true;
				for (int i_4_ = 0; (is.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
					if (is[i_4_] != -1) {
						bool = false;
					}
					if (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6373 == null
							|| (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6373[i_4_] == -1)
							|| (((Class151_Sub7.aClass183_5001.method2623(
									is[i_4_], 16383).anInt829) ^ 0xffffffff) <= ((Class151_Sub7.aClass183_5001
									.method2623(
											(((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6373[i_4_]),
											i_1_ ^ 0x3ffe)).anInt829 ^ 0xffffffff))) {
						((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6373 = is;
						((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6436 = ((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6434;
						((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6400 = i;
					}
				}
				if (!bool) {
					break;
				}
				((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6400 = i;
				((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6436 = (((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anInt6434);
				((Class246_Sub3_Sub4_Sub2) class246_sub3_sub4_sub2_sub1).anIntArray6373 = is;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("rd.P("
						+ i
						+ ','
						+ ((class246_sub3_sub4_sub2_sub1 != null) ? "{...}"
								: "null") + ',' + i_1_ + ','
						+ (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final Class222[] method1484(final int i) {
		try {
			if (i != 0) {
				method1481(96);
			}
			return (new Class222[] { Class298.aClass222_2478,
					Class298.aClass222_2480, Class298.aClass222_2481,
					Class298.aClass222_2482, Class298.aClass222_2483,
					Class298.aClass222_2484, Class298.aClass222_2485,
					Class298.aClass222_2486, Class298.aClass222_2487,
					Class298.aClass222_2488, Class298.aClass222_2489,
					Class298.aClass222_2490 });
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rd.M(" + i + ')');
		}
	}

	Class98_Sub43(final OggStreamState oggstreamstate) {
		try {
			anOggStreamState4241 = oggstreamstate;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rd.<init>("
					+ (oggstreamstate != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1485(final int i) {
		try {
			if (i != -1) {
				method1484(-108);
			}
			if (!PacketSender.aBoolean2575) {
				PacketSender.aBoolean2575 = true;
				Class64_Sub6.aBoolean3656 = true;
				Class305.aFloat2545 += (-12.0F - Class305.aFloat2545) / 2.0F;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "rd.O(" + i + ')');
		}
	}

	final void method1486(final OggPacket oggpacket, final int i) {
		try {
			method1482(oggpacket, false);
			if (i != 21000) {
				aBoolean4243 = false;
			}
			anInt4240++;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("rd.L("
					+ (oggpacket != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	abstract void method1487(int i);
}
