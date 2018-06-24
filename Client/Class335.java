/* Class335 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class335 {
	static OutgoingOpcode aClass171_2812 = new OutgoingOpcode(56, 4);
	private Class79 aClass79_2813 = new Class79(64);
	Class207 aClass207_2814;
	private Class207 aClass207_2815;
	static IncomingOpcode aClass58_2816;
	static boolean aBoolean2817 = false;
	Class79 aClass79_2818 = new Class79(64);
	static int anInt2819;

	static final int method3765(boolean bool) {
		try {
			if (bool != false)
				return -46;
			if (Class98_Sub46.anInt4261 == 1)
				return Class272.anInt2037;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ui.G(" + bool
					+ ')');
		}
	}

	final Class9 method3766(int i, byte i_0_) {
		try {
			Class9 class9;
			synchronized (aClass79_2813) {
				class9 = (Class9) aClass79_2813.method802(-121, (long) i);
			}
			if (class9 != null)
				return class9;
			int i_1_ = 64 % ((35 - i_0_) / 43);
			byte[] is;
			synchronized (aClass207_2815) {
				is = aClass207_2815.method2745(i, 34, false);
			}
			class9 = new Class9();
			((Class9) class9).aClass335_117 = this;
			if (is != null)
				class9.method192(new ByteBuffer(is), false);
			synchronized (aClass79_2813) {
				aClass79_2813.method805((long) i, class9, (byte) -80);
			}
			return class9;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ui.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method3767(int i, int i_2_) {
		try {
			synchronized (aClass79_2813) {
				aClass79_2813.method800((byte) 62, i_2_);
				if (i != 56)
					method3768(-12);
			}
			synchronized (((Class335) this).aClass79_2818) {
				((Class335) this).aClass79_2818.method800((byte) 62, i_2_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ui.F(" + i + ','
					+ i_2_ + ')');
		}
	}

	final void method3768(int i) {
		try {
			synchronized (aClass79_2813) {
				aClass79_2813.method806((byte) 36);
			}
			synchronized (((Class335) this).aClass79_2818) {
				if (i != 10673)
					method3771(65, -107, -65);
				((Class335) this).aClass79_2818.method806((byte) -117);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ui.D(" + i + ')');
		}
	}

	public static void method3769(byte i) {
		do {
			try {
				aClass58_2816 = null;
				aClass171_2812 = null;
				if (i >= 59)
					break;
				aBoolean2817 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ui.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method3770(int i) {
		try {
			synchronized (aClass79_2813) {
				aClass79_2813.method794(21);
			}
			synchronized (((Class335) this).aClass79_2818) {
				((Class335) this).aClass79_2818.method794(108);
			}
			if (i != 34)
				((Class335) this).aClass79_2818 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ui.A(" + i + ')');
		}
	}

	final void method3771(int i, int i_3_, int i_4_) {
		try {
			aClass79_2813 = new Class79(i_3_);
			if (i < 107)
				method3767(37, 14);
			((Class335) this).aClass79_2818 = new Class79(i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ui.E(" + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	Class335(Class279 class279, int i, Class207 class207, Class207 class207_5_) {
		try {
			aClass207_2815 = class207;
			((Class335) this).aClass207_2814 = class207_5_;
			aClass207_2815.method2761(0, 34);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ui.<init>("
					+ (class279 != null ? "{...}" : "null") + ',' + i + ','
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class207_5_ != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass58_2816 = new IncomingOpcode(71, 6);
	}
}
