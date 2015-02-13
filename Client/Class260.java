/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class260 implements d {
	private TextureDefinition[] aClass238Array3252; //any ideas
	private final Class100 aClass100_3253 = new Class100(256);
	static Class377 aClass377_3254;
	private int anInt3255;
	static short aShort3256 = 32767;
	private Class207 aClass207_3257;
	private Class207 aClass207_3258;
	static int anInt3259;
	static float aFloat3260;
	static int anInt3261;
	static IncomingOpcode aClass58_3262;
	static Class326 aClass326_3263;

	@Override
	public final int[] method13(final int i, final int i_0_, final int i_1_,
			final float f, final boolean bool, final int i_2_) {
		try {
			if (i < 108) {
				method8(-35, -59);
			}
			return (method3206(false, i_1_).method1633(
					aClass238Array3252[i_1_].aBoolean1824, f, i_2_, this,
					aClass207_3257, (byte) 79, i_0_));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("qf.I(" + i + ',' + i_0_ + ',' + i_1_ + ',' + f + ','
							+ bool + ',' + i_2_ + ')'));
		}
	}

	@Override
	public final int method12(final boolean bool) {
		try {
			if (bool != true) {
				method9(-28, (byte) 95, -93, -0.31396338F, false, -83);
			}
			return anInt3255;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qf.G(" + bool
					+ ')');
		}
	}

	private final Class98_Sub46_Sub19 method3206(final boolean bool, final int i) {
		try {
			final Class98_Sub46 class98_sub46 = aClass100_3253.method1694(
					(byte) 127, i);
			if (class98_sub46 != null) {
				return (Class98_Sub46_Sub19) class98_sub46;
			}
			final byte[] is = aClass207_3258.method2733(i, -5);
			if (is == null) {
				return null;
			}
			if (bool != false) {
				return null;
			}
			final Class98_Sub46_Sub19 class98_sub46_sub19 = new Class98_Sub46_Sub19(
					new ByteBuffer(is));
			aClass100_3253.method1695(26404, class98_sub46_sub19, i);
			return class98_sub46_sub19;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qf.B(" + bool
					+ ',' + i + ')');
		}
	}

	static final void method3207(final int i, final short[] is,
			final String[] strings, final int i_3_, final int i_4_) {
		do {
			try {
				if ((i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff)) {
					final int i_5_ = (i_3_ + i_4_) / 2;
					int i_6_ = i_4_;
					final String string = strings[i_5_];
					strings[i_5_] = strings[i_3_];
					strings[i_3_] = string;
					final short i_7_ = is[i_5_];
					is[i_5_] = is[i_3_];
					is[i_3_] = i_7_;
					for (int i_8_ = i_4_; (i_8_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff); i_8_++) {
						if (string == null
								|| (strings[i_8_] != null && ((i_8_ & 0x1 ^ 0xffffffff) < (strings[i_8_]
										.compareTo(string) ^ 0xffffffff)))) {
							final String string_9_ = strings[i_8_];
							strings[i_8_] = strings[i_6_];
							strings[i_6_] = string_9_;
							final short i_10_ = is[i_8_];
							is[i_8_] = is[i_6_];
							is[i_6_++] = i_10_;
						}
					}
					strings[i_3_] = strings[i_6_];
					strings[i_6_] = string;
					is[i_3_] = is[i_6_];
					is[i_6_] = i_7_;
					method3207(47, is, strings, -1 + i_6_, i_4_);
					method3207(47, is, strings, i_3_, 1 + i_6_);
				}
				if (i == 47) {
					break;
				}
				method3209(42);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("qf.D(" + i
						+ ',' + (is != null ? "{...}" : "null") + ','
						+ (strings != null ? "{...}" : "null") + ',' + i_3_
						+ ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	public final int[] method9(final int i, final byte i_11_, final int i_12_,
			final float f, final boolean bool, final int i_13_) {
		try {
			if (i_11_ > -111) {
				method3206(true, 110);
			}
			return (method3206(false, i).method1631(i_12_, bool, this, f,
					aClass238Array3252[i].aBoolean1824, aClass207_3257, i_13_,
					(byte) -34));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("qf.E(" + i + ',' + i_11_ + ',' + i_12_ + ',' + f + ','
							+ bool + ',' + i_13_ + ')'));
		}
	}

	@Override
	public final boolean method8(final int i, final int i_14_) {
		try {
			final Class98_Sub46_Sub19 class98_sub46_sub19 = method3206(false,
					i_14_);
			if (class98_sub46_sub19 == null
					|| !class98_sub46_sub19.method1629(0, aClass207_3257, this)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qf.F(" + i + ','
					+ i_14_ + ')');
		}
	}

	static final void method3208(final int i, final int i_16_, final int i_17_,
			final int i_18_, final int i_19_) {
		try {
			Class98_Sub46_Sub11.anInt6025 = i_19_;
			if (i_16_ >= -81) {
				method3208(33, 69, -94, -55, 47);
			}
			Class98_Sub46_Sub2.anInt5952 = i;
			Class98_Sub46_Sub20.anInt6074 = i_18_;
			Class282.anInt2132 = i_17_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qf.J(" + i + ','
					+ i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	@Override
	public final float[] method10(final byte i, final boolean bool,
			final int i_20_, final int i_21_, final float f, final int i_22_) {
		try {
			if (i > -116) {
				aClass238Array3252 = null;
			}
			return (method3206(false, i_20_).method1630(this, aClass207_3257,
					(byte) -86, i_22_, i_21_,
					aClass238Array3252[i_20_].aBoolean1824));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("qf.H(" + i + ',' + bool + ',' + i_20_ + ',' + i_21_ + ','
							+ f + ',' + i_22_ + ')'));
		}
	}
	@Override
	public final TextureDefinition method11(final int i, final int i_23_) {
		try {
			if (i_23_ != -28755) {
				method3206(false, 2);
			}
			return aClass238Array3252[i];
		} catch (final RuntimeException runtimeexception) {
			//add new texture def
			//do you have it?
			//its index26 archive 0 iirc
			//let me see if i can back it
			 return aClass238Array3252[0]; //gotta love cheap haxs
		//well when i export from your viewer they dont have them
			 //tebxutt tuhreey 'dreef updated recently so u might be able to pack some
			 //i mean watch this
			 
		}
	}

	public static void method3209(final int i) {
		try {
			if (i == -19788) {
				aClass58_3262 = null;
				aClass377_3254 = null;
				aClass326_3263 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "qf.C(" + i + ')');
		}
	}

	Class260(final Class207 class207, final Class207 class207_24_,
			final Class207 class207_25_) {
		try {
			aClass207_3258 = class207_24_;
			aClass207_3257 = class207_25_;
			final ByteBuffer class98_sub22 = new ByteBuffer(
					class207.method2745(0, 0, false));
			anInt3255 = class98_sub22.readUnsignedShort((byte) 127);
			aClass238Array3252 = new TextureDefinition[anInt3255 + 5000];
			for (int i = 0; anInt3255 > i; i++) {
				if (class98_sub22.readUnsignedByte((byte) 72) == 1) {
					aClass238Array3252[i] = new TextureDefinition();
				}
			}
			for (int i = 0; (i ^ 0xffffffff) > (anInt3255 ^ 0xffffffff); i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aBoolean1825 = ((class98_sub22
							.readUnsignedByte((byte) 50) ^ 0xffffffff) == -1);
				}
			}
			for (int i = 0; (i ^ 0xffffffff) > (anInt3255 ^ 0xffffffff); i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aBoolean1822 = ((class98_sub22
							.readUnsignedByte((byte) 95) ^ 0xffffffff) == -2);
				}
			}
			for (int i = 0; (i ^ 0xffffffff) > (anInt3255 ^ 0xffffffff); i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aBoolean1833 = class98_sub22
							.readUnsignedByte((byte) -105) == 1;
				}
			}
			for (int i = 0; i < anInt3255; i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aByte1829 = class98_sub22
							.readSignedByte((byte) -19);
				}
			}
			for (int i = 0; anInt3255 > i; i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aByte1830 = class98_sub22
							.readSignedByte((byte) -19);
				}
			}
			for (int i = 0; (i ^ 0xffffffff) > (anInt3255 ^ 0xffffffff); i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aByte1820 = class98_sub22
							.readSignedByte((byte) -19);
				}
			}
			for (int i = 0; (i ^ 0xffffffff) > (anInt3255 ^ 0xffffffff); i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aByte1816 = class98_sub22
							.readSignedByte((byte) -19);
				}
			}
			for (int i = 0; (anInt3255 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aShort1831 = (short) class98_sub22
							.readUnsignedShort((byte) 127);
				}
			}
			for (int i = 0; i < anInt3255; i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aByte1823 = class98_sub22
							.readSignedByte((byte) -19);
				}
			}
			for (int i = 0; anInt3255 > i; i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aByte1837 = class98_sub22
							.readSignedByte((byte) -19);
				}
			}
			for (int i = 0; i < anInt3255; i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aBoolean1827 = class98_sub22
							.readUnsignedByte((byte) -126) == 1;
				}
			}
			for (int i = 0; anInt3255 > i; i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aBoolean1824 = class98_sub22
							.readUnsignedByte((byte) -117) == 1;
				}
			}
			for (int i = 0; anInt3255 > i; i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aByte1832 = class98_sub22
							.readSignedByte((byte) -19);
				}
			}
			for (int i = 0; (anInt3255 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aBoolean1826 = ((class98_sub22
							.readUnsignedByte((byte) 46) ^ 0xffffffff) == -2);
				}
			}
			for (int i = 0; anInt3255 > i; i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aBoolean1819 = class98_sub22
							.readUnsignedByte((byte) 31) == 1;
				}
			}
			for (int i = 0; (anInt3255 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].aBoolean1817 = class98_sub22
							.readUnsignedByte((byte) 122) == 1;
				}
			}
			for (int i = 0; (anInt3255 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].anInt1821 = class98_sub22
							.readUnsignedByte((byte) 89);
				}
			}
			for (int i = 0; anInt3255 > i; i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].anInt1835 = class98_sub22.readInt(-2);
				}
			}
			for (int i = 0; (i ^ 0xffffffff) > (anInt3255 ^ 0xffffffff); i++) {
				if (aClass238Array3252[i] != null) {
					aClass238Array3252[i].anInt1818 = class98_sub22
							.readUnsignedByte((byte) 35);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("qf.<init>("
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class207_24_ != null ? "{...}" : "null") + ','
					+ (class207_25_ != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass377_3254 = new Class377(64);
	}
}
