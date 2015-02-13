/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

final class InputStream_Sub1 extends InputStream {
	static int[][][] anIntArrayArrayArray27 = new int[2][][];
	static IncomingOpcode aClass58_28 = new IncomingOpcode(22, 6);

	static final boolean method121(final Class246_Sub3 class246_sub3,
			final boolean bool, final byte[][][] is, final int i,
			final byte i_0_) {
		if (!GameObjectDefinitionLoader.aBoolean2526) {
			return false;
		}
		int i_1_ = (class246_sub3.anInt5084 >> Class151_Sub8.anInt5015);
		int i_2_ = i_1_;
		int i_3_ = (class246_sub3.anInt5079 >> Class151_Sub8.anInt5015);
		int i_4_ = i_3_;
		if (class246_sub3 instanceof Class246_Sub3_Sub4) {
			i_2_ = (((Class246_Sub3_Sub4) class246_sub3).aShort6160);
			i_4_ = (((Class246_Sub3_Sub4) class246_sub3).aShort6159);
			i_1_ = (((Class246_Sub3_Sub4) class246_sub3).aShort6158);
			i_3_ = (((Class246_Sub3_Sub4) class246_sub3).aShort6157);
		}
		for (int i_5_ = i_1_; i_5_ <= i_2_; i_5_++) {
			for (int i_6_ = i_3_; i_6_ <= i_4_; i_6_++) {
				if ((class246_sub3.aByte5081 < Class364.anInt3103)
						&& i_5_ >= Class306.anInt2561
						&& i_5_ < Class21_Sub2.anInt5388
						&& i_6_ >= OutgoingOpcode.anInt1318
						&& i_6_ < Class32.anInt303) {
					if ((is != null && class246_sub3.aByte5088 >= i && (is[class246_sub3.aByte5088][i_5_][i_6_]) == i_0_)
							|| !class246_sub3.method2991(false)
							|| class246_sub3.method2977(
									(Class98_Sub10_Sub30.aHa5709), (byte) 77)) {
						if (!bool && i_5_ >= Class241.anInt1845 - 16
								&& i_5_ <= Class241.anInt1845 + 16
								&& i_6_ >= Class64_Sub26.anInt3714 - 16
								&& i_6_ <= Class64_Sub26.anInt3714 + 16) {
							if (Class375.aBoolean3170) {
								Class98_Sub43_Sub3.aClass245Array5922[Class252.anInt1923++]
										.method2958((byte) 115, class246_sub3);
								Class252.anInt1923 %= Class18.anInt212;
							} else {
								class246_sub3.method2988(
										(Class98_Sub10_Sub30.aHa5709), -51);
							}
						}
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void method122(final boolean bool) {
		try {
			if (bool != false) {
				method122(true);
			}
			aClass58_28 = null;
			anIntArrayArrayArray27 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "baa.B(" + bool
					+ ')');
		}
	}

	@Override
	public final int read() {
		try {
			Class246_Sub7.method3131(0, 30000L);
			return -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "baa.read(" + ')');
		}
	}
}
