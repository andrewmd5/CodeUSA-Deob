/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class308 {
	static Class105 aClass105_2576 = new Class105("", 14);
	private Class207 aClass207_2577;
	private Class207 aClass207_2578;
	private Class377 aClass377_2579 = new Class377(256);
	static int anInt2580;
	static IncomingOpcode aClass58_2581 = new IncomingOpcode(96, 10);
	static Class113 aClass113_2582 = new Class113(7, 2);
	static Class98_Sub46_Sub9 aClass98_Sub46_Sub9_2583 = null;
	static int anInt2584;
	private Class377 aClass377_2585 = new Class377(256);

	static final void method3608(int i, int i_0_, int i_1_, int i_2_) {
		try {
			i <<= 3;
			i_2_ <<= 3;
			i_0_ <<= 3;
			Class98_Sub22_Sub2.aFloat5794 = (float) i;
			if ((Class98_Sub46_Sub20_Sub2.anInt6319 ^ 0xffffffff) == -3) {
				Entity.anInt6357 = i_2_;
				Class186.anInt3424 = i;
				anInt2584 = i_0_;
			}
			Class119_Sub4.aFloat4740 = (float) i_2_;
			Class42_Sub2.method388(true);
			Class64_Sub6.aBoolean3656 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sv.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	private final Class98_Sub24_Sub1 method3609(int i, int i_4_, int i_5_,
			int[] is) {
		try {
			int i_6_ = (0xfff8 & i_4_ << -42388412 | i_4_ >>> 885159052) ^ i_5_;
			i_6_ |= i_4_ << -1252543472;
			long l = (long) i_6_ ^ 0x100000000L;
			Class98_Sub24_Sub1 class98_sub24_sub1 = ((Class98_Sub24_Sub1) aClass377_2585
					.method3990(l, i ^ ~0x5177));
			if (class98_sub24_sub1 != null)
				return class98_sub24_sub1;
			if (is != null && (is[0] ^ 0xffffffff) >= -1)
				return null;
			Class98_Sub13 class98_sub13 = (Class98_Sub13) aClass377_2579
					.method3990(l, -1);
			if (class98_sub13 == null) {
				class98_sub13 = Class98_Sub13.method1140(aClass207_2577, i_4_,
						i_5_);
				if (class98_sub13 == null)
					return null;
				aClass377_2579.method3996(class98_sub13, l, i + -20856);
			}
			class98_sub24_sub1 = class98_sub13.method1132(is);
			if (class98_sub24_sub1 == null)
				return null;
			class98_sub13.method942(98);
			if (i != 20855)
				method3610(-68);
			aClass377_2585.method3996(class98_sub24_sub1, l, i + -20856);
			return class98_sub24_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("sv.A(" + i + ',' + i_4_ + ',' + i_5_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3610(int i) {
		do {
			try {
				aClass113_2582 = null;
				aClass105_2576 = null;
				aClass98_Sub46_Sub9_2583 = null;
				aClass58_2581 = null;
				if (i == -746085692)
					break;
				method3610(-1);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "sv.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final Class98_Sub24_Sub1 method3611(int i, int i_7_, int[] is) {
		try {
			if (i == (aClass207_2578.method2752((byte) -11) ^ 0xffffffff))
				return method3612(14913, is, i_7_, 0);
			if ((aClass207_2578.method2761(0, i_7_) ^ 0xffffffff) == -2)
				return method3612(i + 14915, is, 0, i_7_);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sv.E(" + i + ','
					+ i_7_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	private final Class98_Sub24_Sub1 method3612(int i, int[] is, int i_8_,
			int i_9_) {
		try {
			int i_10_ = i_8_
					^ ((~0x5ffff000 & i_9_) << -746085692 | i_9_ >>> -2070738644);
			i_10_ |= i_9_ << 965219344;
			long l = (long) i_10_;
			Class98_Sub24_Sub1 class98_sub24_sub1 = (Class98_Sub24_Sub1) aClass377_2585
					.method3990(l, -1);
			if (class98_sub24_sub1 != null)
				return class98_sub24_sub1;
			if (is != null && (is[0] ^ 0xffffffff) >= -1)
				return null;
			Class37 class37 = Class37.method342(aClass207_2578, i_9_, i_8_);
			if (class37 == null)
				return null;
			if (i != 14913)
				method3609(96, 36, 96, null);
			class98_sub24_sub1 = class37.method344();
			aClass377_2585.method3996(class98_sub24_sub1, l, -1);
			if (is != null)
				is[0] -= (((Class98_Sub24_Sub1) class98_sub24_sub1).aByteArray5799).length;
			return class98_sub24_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("sv.B(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_8_ + ',' + i_9_ + ')'));
		}
	}

	final Class98_Sub24_Sub1 method3613(int i, boolean bool, int[] is) {
		try {
			if ((aClass207_2577.method2752((byte) -11) ^ 0xffffffff) == -2)
				return method3609(20855, 0, i, is);
			if ((aClass207_2577.method2761(0, i) ^ 0xffffffff) == -2)
				return method3609(20855, i, 0, is);
			if (bool != true)
				return null;
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sv.F(" + i + ','
					+ bool + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	Class308(Class207 class207, Class207 class207_11_) {
		try {
			aClass207_2578 = class207;
			aClass207_2577 = class207_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sv.<init>("
					+ (class207 != null ? "{...}" : "null") + ','
					+ (class207_11_ != null ? "{...}" : "null") + ')'));
		}
	}
}
