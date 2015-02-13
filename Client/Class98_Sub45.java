/* Class98_Sub45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class Class98_Sub45 extends Class98 {
	static BigInteger aBigInteger4253;
	Class148 aClass148_4254 = new Class148();
	static String[] aStringArray4255 = new String[100];
	static OutgoingOpcode aClass171_4256;
	static int[] anIntArray4257;
	static int[][] anIntArrayArray4258;

	public static void method1518(int i) {
		try {
			aStringArray4255 = null;
			aBigInteger4253 = null;
			anIntArray4257 = null;
			anIntArrayArray4258 = null;
			if (i != 5)
				method1520(-23, 5);
			aClass171_4256 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tia.D(" + i + ')');
		}
	}

	static final void method1519(Class293 class293, boolean bool) {
		try {
			Class293 class293_0_ = Class360.method3910(bool, class293);
			int i;
			int i_1_;
			do {
				if (class293_0_ == null) {
					i = Class98_Sub25.anInt4024;
					i_1_ = Class39_Sub1.anInt3593;
					if (!client.aBoolean3553)
						break;
				}
				i = ((Class293) class293_0_).anInt2258;
				i_1_ = ((Class293) class293_0_).anInt2311;
			} while (false);
			Class253.method3180(i, i_1_, 1375731712, class293, false);
			Class98_Sub8.method986(i_1_, i, class293, 115);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("tia.C("
							+ (class293 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	static final Class92 method1520(int i, int i_2_) {
		try {
			if (i_2_ != 14883)
				anIntArray4257 = null;
			Class92 class92 = (Class92) Class142.aClass79_1158.method802(-126,
					(long) i);
			if (class92 != null)
				return class92;
			byte[] is = Class42_Sub1_Sub1.aClass207_6206
					.method2745(i, 0, false);
			class92 = new Class92();
			if (is != null)
				class92.method894(-62, new ByteBuffer(is));
			class92.method897((byte) 115);
			Class142.aClass79_1158.method805((long) i, class92, (byte) -80);
			return class92;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "tia.A(" + i + ','
					+ i_2_ + ')');
		}
	}

	public Class98_Sub45() {
		/* empty */
	}

	static final void method1521(byte i, int i_3_, String string, int i_4_,
			String string_5_, String string_6_, String string_7_) {
		try {
			Class137.method2276(string_7_, i_3_, string_6_, string, -1, null,
					(byte) -99, i_4_, string_5_);
			int i_8_ = -101 / ((-33 - i) / 63);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("tia.B(" + i + ','
					+ i_3_ + ',' + (string != null ? "{...}" : "null") + ','
					+ i_4_ + ',' + (string_5_ != null ? "{...}" : "null") + ','
					+ (string_6_ != null ? "{...}" : "null") + ','
					+ (string_7_ != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aBigInteger4253 = (new BigInteger(
				"87d2c867cb1ce29ac740deea9b15092fe92b9bb7daa489ad025ea95852070fac17ae66144119f134f0ae13236b003a8399f8ff59e9c857b81c4ef765ee48b7d7",
				16));
		aClass171_4256 = new OutgoingOpcode(33, 3);
		anIntArray4257 = new int[32];
		anIntArrayArray4258 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 },
				{ 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 },
				{ 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 },
				{ 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 },
				{ 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
	}
}
