/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;

import java.io.IOException;

abstract class Class237 {
	private Class98_Sub43_Sub4 aClass98_Sub43_Sub4_1801;
	private OggPacket anOggPacket1802;
	static boolean aBoolean1803 = false;
	private boolean aBoolean1804;
	private boolean aBoolean1805;
	private String aString1806;
	private Class98_Sub43_Sub1 aClass98_Sub43_Sub1_1807;
	private OggPage anOggPage1808;
	static int[] anIntArray1809 = new int[3];
	private OggSyncState anOggSyncState1810;
	private Class377 aClass377_1811;
	private boolean aBoolean1812;
	private Class98_Sub43_Sub3 aClass98_Sub43_Sub3_1813;
	private byte[] aByteArray1814;
	private boolean aBoolean1815;

	static final void method2898(final int i, final byte i_0_, final int i_1_,
			final int i_2_, final int i_3_) {
		try {
			Class218.anInt1635 = i_1_;
			if (i_0_ <= -47) {
				Class3.anInt77 = i;
				Class98_Sub10_Sub38.anInt5753 = i_2_;
				Class76_Sub8.anInt3778 = i_3_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pb.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	abstract int method2899(int i, byte[] is) throws IOException;

	final Class98_Sub43_Sub1 method2900(final byte i) {
		try {
			if (i != -79) {
				return null;
			}
			return aClass98_Sub43_Sub1_1807;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pb.Q(" + i + ')');
		}
	}

	final double method2901(final byte i) {
		try {
			if (aClass98_Sub43_Sub1_1807 != null) {
				return aClass98_Sub43_Sub1_1807.method1489(0);
			}
			if (aClass98_Sub43_Sub3_1813 != null) {
				return aClass98_Sub43_Sub3_1813.method1502(0);
			}
			if (i > -80) {
				method2906(108);
			}
			return 0.0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pb.G(" + i + ')');
		}
	}

	final boolean method2902(final boolean bool) {
		try {
			if (bool != true) {
				aBoolean1803 = true;
			}
			if (!aBoolean1815 && !aBoolean1805) {
				return false;
			}
			if (aClass98_Sub43_Sub1_1807 != null
					&& aClass98_Sub43_Sub1_1807.method1492((byte) -110) > 0) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pb.M(" + bool
					+ ')');
		}
	}

	final void method2903(final int i) {
		try {
			if (!aBoolean1815 && i == 8) {
				for (Class98_Sub43 class98_sub43 = (Class98_Sub43) aClass377_1811
						.method3998(108); class98_sub43 != null; class98_sub43 = (Class98_Sub43) aClass377_1811
						.method3995(-1)) {
					class98_sub43.method1487(-1128);
					class98_sub43.anOggStreamState4241.a();
				}
				anOggPacket1802.a();
				anOggPage1808.a();
				anOggSyncState1810.a();
				aBoolean1815 = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pb.L(" + i + ')');
		}
	}

	final void method2904(final boolean bool) throws IOException {
		try {
			if (bool == false && !aBoolean1812) {
				while (!aBoolean1815) {
					Class98_Sub43 class98_sub43;
					if (!aBoolean1804) {
						class98_sub43 = method2914(1);
						if (class98_sub43 == null) {
							if (aBoolean1805) {
								method2907(-2);
							}
							break;
						}
						if (class98_sub43 == null) {
							throw new IllegalStateException();
						}
						aBoolean1804 = true;
					} else {
						class98_sub43 = ((Class98_Sub43) (aClass377_1811
								.method3990(anOggPage1808.getSerialNumber(), -1)));
					}
					if (aClass98_Sub43_Sub1_1807 == class98_sub43) {
						if ((aClass98_Sub43_Sub1_1807.method1492((byte) -18) ^ 0xffffffff) <= -51) {
							break;
						}
						while ((((Class98_Sub43) aClass98_Sub43_Sub1_1807).anOggStreamState4241
								.packetOut(anOggPacket1802) ^ 0xffffffff) == -2) {
							aClass98_Sub43_Sub1_1807.method1486(
									anOggPacket1802, 21000);
							method2910((byte) 119);
							if (aClass98_Sub43_Sub3_1813 != null) {
								final double d = aClass98_Sub43_Sub3_1813
										.method1502(0);
								for (int i = 0; i < 10
										&& method2912((byte) -59); i++) {
									method2905(-88);
									if (aBoolean1815) {
										return;
									}
								}
								if (aClass98_Sub43_Sub3_1813.method1502(0) > d) {
									return;
								}
							}
							if ((aClass98_Sub43_Sub1_1807
									.method1492((byte) -63) ^ 0xffffffff) <= -51) {
								return;
							}
						}
					} else if (!(class98_sub43 instanceof Class98_Sub43_Sub4)) {
						if (aClass98_Sub43_Sub3_1813 != class98_sub43) {
							while ((class98_sub43.anOggStreamState4241
									.packetOut(anOggPacket1802) ^ 0xffffffff) == -2) {
								if ((class98_sub43.anInt4240 ^ 0xffffffff) == -2
										&& (class98_sub43 instanceof Class98_Sub43_Sub4)) {
									method2909(!bool, aString1806);
								}
								class98_sub43
										.method1486(anOggPacket1802, 21000);
							}
						} else if (aClass98_Sub43_Sub1_1807 == null
								&& !aBoolean1812) {
							for (int i = 0; ((i ^ 0xffffffff) > -11 && method2912((byte) -59)); i++) {
								method2905(-95);
								if (aBoolean1815) {
									break;
								}
							}
							break;
						}
					} else {
						method2910((byte) 127);
					}
					aBoolean1804 = false;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pb.E(" + bool
					+ ')');
		}
	}

	private final void method2905(final int i) throws IOException {
		do {
			try {
				while (((Class98_Sub43) aClass98_Sub43_Sub3_1813).anOggStreamState4241
						.packetOut(anOggPacket1802) != 1) {
					final Class98_Sub43 class98_sub43 = method2914(1);
					if (class98_sub43 == null) {
						if (aBoolean1805) {
							method2907(-2);
						}
						return;
					}
					if (class98_sub43 == aClass98_Sub43_Sub4_1801) {
						method2910((byte) 109);
					}
				}
				aClass98_Sub43_Sub3_1813.method1486(anOggPacket1802, 21000);
				if (i < -83) {
					break;
				}
				method2908(40);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "pb.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public static void method2906(final int i) {
		do {
			try {
				anIntArray1809 = null;
				if (i == 10) {
					break;
				}
				aBoolean1803 = true;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "pb.N(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	private final void method2907(final int i) {
		while_151_: do {
			try {
				for (Class98_Sub43 class98_sub43 = (Class98_Sub43) aClass377_1811
						.method3998(97); class98_sub43 != null; class98_sub43 = (Class98_Sub43) aClass377_1811
						.method3995(-1)) {
					if (class98_sub43 != aClass98_Sub43_Sub3_1813) {
						while (class98_sub43.anOggStreamState4241.packetOut() == 1) {
							class98_sub43
									.method1486(anOggPacket1802, i + 21002);
						}
					}
				}
				if (i != -2) {
					method2898(-96, (byte) 32, 48, 89, 40);
				}
				if (aClass98_Sub43_Sub3_1813 != null) {
					int i_4_ = 0;
					for (;;) {
						if (i_4_ >= 10) {
							break while_151_;
						}
						if (!method2912((byte) -59)) {
							break;
						}
						if ((((Class98_Sub43) aClass98_Sub43_Sub3_1813).anOggStreamState4241
								.packetOut() ^ 0xffffffff) != -2) {
							method2903(8);
							break;
						}
						aClass98_Sub43_Sub3_1813.method1486(anOggPacket1802,
								21000);
						i_4_++;
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "pb.J(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final Class98_Sub43_Sub3 method2908(final int i) {
		try {
			if (i != -32675) {
				anOggPage1808 = null;
			}
			return aClass98_Sub43_Sub3_1813;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pb.B(" + i + ')');
		}
	}

	final void method2909(final boolean bool, final String string) {
		do {
			try {
				if (bool != true) {
					aString1806 = null;
				}
				aString1806 = string;
				if (aString1806 == null) {
					aClass98_Sub43_Sub4_1801 = null;
				} else {
					if (aClass98_Sub43_Sub4_1801 != null
							&& !aString1806.equals(aClass98_Sub43_Sub4_1801
									.method1507(bool))) {
						aClass98_Sub43_Sub4_1801 = null;
					}
					if (aClass98_Sub43_Sub4_1801 != null) {
						break;
					}
					for (Class98_Sub43 class98_sub43 = (Class98_Sub43) aClass377_1811
							.method3998(111); class98_sub43 != null; class98_sub43 = (Class98_Sub43) aClass377_1811
							.method3995(-1)) {
						if (class98_sub43 instanceof Class98_Sub43_Sub4) {
							final Class98_Sub43_Sub4 class98_sub43_sub4 = (Class98_Sub43_Sub4) class98_sub43;
							if (aString1806.equals(class98_sub43_sub4
									.method1507(true))) {
								aClass98_Sub43_Sub4_1801 = class98_sub43_sub4;
								break;
							}
						}
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("pb.A(" + bool
						+ ',' + (string != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method2910(final byte i) {
		try {
			for (Class98_Sub43 class98_sub43 = (Class98_Sub43) aClass377_1811
					.method3998(101); class98_sub43 != null; class98_sub43 = (Class98_Sub43) aClass377_1811
					.method3995(-1)) {
				if (class98_sub43 instanceof Class98_Sub43_Sub4) {
					final Class98_Sub43_Sub4 class98_sub43_sub4 = (Class98_Sub43_Sub4) class98_sub43;
					while (((Class98_Sub43) class98_sub43_sub4).anInt4240 <= 8
							|| (method2901((byte) -112) > class98_sub43_sub4
									.method1509(-6085))) {
						if ((((Class98_Sub43) class98_sub43_sub4).anOggStreamState4241
								.packetOut(anOggPacket1802) ^ 0xffffffff) != -2) {
							break;
						}
						class98_sub43_sub4.method1486(anOggPacket1802, 21000);
					}
				}
			}
			if (i < 102) {
				aBoolean1815 = true;
			}
			method2909(true, aString1806);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pb.I(" + i + ')');
		}
	}

	final void method2911(final boolean bool, final byte i) {
		try {
			if (aClass98_Sub43_Sub1_1807 != null) {
				final Class98_Sub31_Sub4 class98_sub31_sub4 = aClass98_Sub43_Sub1_1807
						.method1488((byte) 88);
				if (class98_sub31_sub4 != null) {
					class98_sub31_sub4.method1391(bool, i ^ ~0x3809660);
				}
			}
			if (i != 22) {
				anOggSyncState1810 = null;
			}
			aBoolean1812 = !aBoolean1812;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pb.D(" + bool
					+ ',' + i + ')');
		}
	}

	private final boolean method2912(final byte i) {
		try {
			if (i != -59) {
				method2909(true, null);
			}
			if (aClass98_Sub43_Sub1_1807 == null) {
				final double d = aClass98_Sub43_Sub3_1813.method1496(-1);
				if (d != 0.0
						&& !(Class343.method3819(-47) >= aClass98_Sub43_Sub3_1813
								.method1500(false) + 1000.0 / d)) {
					return false;
				}
				return true;
			}
			if (aClass98_Sub43_Sub3_1813.method1498(1024)
					&& !(method2901((byte) -117) > aClass98_Sub43_Sub3_1813
							.method1502(0))) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pb.P(" + i + ')');
		}
	}

	final Class98_Sub43_Sub4 method2913(final int i) {
		try {
			if (i != 1) {
				method2902(false);
			}
			return aClass98_Sub43_Sub4_1801;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pb.K(" + i + ')');
		}
	}

	private final Class98_Sub43 method2914(final int i) throws IOException {
		try {
			if (i != 1) {
				method2908(110);
			}
			if (aBoolean1815) {
				throw new IllegalStateException();
			}
			if (aBoolean1805) {
				return null;
			}
			while ((anOggSyncState1810.pageOut(anOggPage1808) ^ 0xffffffff) >= -1) {
				final int i_5_ = method2899(i + 48, aByteArray1814);
				if (i_5_ == -1) {
					aBoolean1805 = true;
					return null;
				}
				if ((i_5_ ^ 0xffffffff) == -1) {
					return null;
				}
				if (!anOggSyncState1810.write(aByteArray1814, i_5_)) {
					throw new RuntimeException("");
				}
			}
			final int i_6_ = anOggPage1808.getSerialNumber();
			if (!anOggPage1808.isBOS()) {
				final Class98_Sub43 class98_sub43 = ((Class98_Sub43) aClass377_1811
						.method3990(i_6_, -1));
				if (!class98_sub43.anOggStreamState4241.pageIn(anOggPage1808)) {
					throw new IllegalStateException();
				}
				return class98_sub43;
			}
			final OggStreamState oggstreamstate = new OggStreamState(i_6_);
			if (!oggstreamstate.pageIn(anOggPage1808)) {
				throw new IllegalStateException();
			}
			if ((oggstreamstate.packetPeek(anOggPacket1802) ^ 0xffffffff) != -2) {
				throw new IllegalStateException();
			}
			Class98_Sub43 class98_sub43;
			if (aClass98_Sub43_Sub3_1813 != null || !anOggPacket1802.isTheora()) {
				if (aClass98_Sub43_Sub1_1807 != null
						|| !anOggPacket1802.isVorbis()) {
					final byte[] is = anOggPacket1802.getData();
					final StringBuffer stringbuffer = new StringBuffer();
					for (int i_7_ = 1; (i_7_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_7_++) {
						if (!Character.isLetterOrDigit((char) is[i_7_])) {
							break;
						}
						stringbuffer.append((char) is[i_7_]);
					}
					final String string = stringbuffer.toString();
					if (string.equals("kate")) {
						class98_sub43 = new Class98_Sub43_Sub4(oggstreamstate);
					} else {
						class98_sub43 = new Class98_Sub43_Sub2(oggstreamstate);
					}
				} else {
					aClass98_Sub43_Sub1_1807 = new Class98_Sub43_Sub1(
							oggstreamstate);
					class98_sub43 = aClass98_Sub43_Sub1_1807;
				}
			} else {
				aClass98_Sub43_Sub3_1813 = new Class98_Sub43_Sub3(
						oggstreamstate);
				class98_sub43 = aClass98_Sub43_Sub3_1813;
			}
			aClass377_1811.method3996(class98_sub43, i_6_, -1);
			return class98_sub43;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pb.H(" + i + ')');
		}
	}

	Class237(final int i) {
		try {
			if (!Class134_Sub1.method2246("jagtheora", (byte) -36)) {
				throw new RuntimeException("Failed to load jagtheora library");
			}
			aByteArray1814 = new byte[i];
			anOggSyncState1810 = new OggSyncState();
			anOggPage1808 = new OggPage();
			anOggPacket1802 = new OggPacket();
			aClass377_1811 = new Class377(8);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pb.<init>(" + i
					+ ')');
		}
	}
}
