/* Class365 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class365 {
	private Class207 aClass207_3107;
	private Class79 aClass79_3108 = new Class79(64);
	static Class113 aClass113_3109;
	static boolean aBoolean3110 = true;

	static final int method3937(int i, byte[] is, int i_0_, boolean bool) {
		try {
			if (bool != false)
				aBoolean3110 = true;
			int i_1_ = -1;
			for (int i_2_ = i_0_; i_2_ < i; i_2_++)
				i_1_ = (Class287_Sub1.anIntArray3419[0xff & (is[i_2_] ^ i_1_)] ^ i_1_ >>> -26165528);
			i_1_ ^= 0xffffffff;
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("wba.C(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_0_ + ',' + bool + ')'));
		}
	}

	final void method3938(int i) {
		try {
			synchronized (aClass79_3108) {
				aClass79_3108.method794(55);
			}
			int i_3_ = -50 / ((i - 38) / 62);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wba.E(" + i + ')');
		}
	}

	static final Class293 method3939(int i, Class293 class293) {
		try {
			Class293 class293_4_ = client.method102(class293);
			if (class293_4_ == null)
				class293_4_ = ((Class293) class293).aClass293_2219;
			if (i != 4456)
				method3939(54, null);
			return class293_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wba.H(" + i + ','
					+ (class293 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class149 method3940(byte i, int i_5_) {
		try {
			if (i != 31)
				return null;
			Class149 class149;
			synchronized (aClass79_3108) {
				class149 = (Class149) aClass79_3108
						.method802(-128, (long) i_5_);
			}
			if (class149 != null)
				return class149;
			byte[] is;
			synchronized (aClass207_3107) {
				is = aClass207_3107.method2745(i_5_, 11, false);
			}
			class149 = new Class149();
			if (is != null)
				class149.method2431(new ByteBuffer(is), -1);
			synchronized (aClass79_3108) {
				aClass79_3108.method805((long) i_5_, class149, (byte) -80);
			}
			return class149;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wba.F(" + i + ','
					+ i_5_ + ')');
		}
	}

	static final void method3941(Class207 class207, Class88 class88, int i) {
		try {
			Class242.aClass88_1848 = class88;
			Class343.aString2863 = "";
			Class223.aClass207_1681 = class207;
			if (Class19.aString3448.startsWith("win"))
				Class343.aString2863 += "windows/";
			else if (!Class19.aString3448.startsWith("linux")) {
				if (Class19.aString3448.startsWith("mac"))
					Class343.aString2863 += "macos/";
			} else
				Class343.aString2863 += "linux/";
			if (i != -1)
				method3937(63, null, -15, false);
			if (((Class88) Class242.aClass88_1848).aBoolean675)
				Class343.aString2863 += "msjava/";
			else if (!Class19.aString3442.startsWith("amd64")
					&& !Class19.aString3442.startsWith("x86_64")) {
				if (!Class19.aString3442.startsWith("i386")
						&& !Class19.aString3442.startsWith("i486")
						&& !Class19.aString3442.startsWith("i586")
						&& !Class19.aString3442.startsWith("x86")) {
					if (Class19.aString3442.startsWith("ppc"))
						Class343.aString2863 += "ppc/";
					else
						Class343.aString2863 += "universal/";
				} else
					Class343.aString2863 += "x86/";
			} else
				Class343.aString2863 += "x86_64/";
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("wba.G("
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class88 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method3942(int i) {
		try {
			int i_6_ = 38 / ((-74 - i) / 39);
			aClass113_3109 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wba.B(" + i + ')');
		}
	}

	final void method3943(int i, boolean bool) {
		try {
			if (bool != false)
				aBoolean3110 = false;
			synchronized (aClass79_3108) {
				aClass79_3108.method800((byte) 62, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wba.D(" + i + ','
					+ bool + ')');
		}
	}

	final void method3944(int i) {
		try {
			synchronized (aClass79_3108) {
				if (i != -1) {
					/* empty */
				} else
					aClass79_3108.method806((byte) 48);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "wba.A(" + i + ')');
		}
	}

	Class365(Class279 class279, int i, Class207 class207) {
		do {
			try {
				aClass207_3107 = class207;
				if (aClass207_3107 == null)
					break;
				aClass207_3107.method2761(0, 11);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("wba.<init>("
						+ (class279 != null ? "{...}" : "null") + ',' + i + ','
						+ (class207 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass113_3109 = new Class113(4, 1);
	}
}
