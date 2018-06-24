/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Image;

final class Class3 {
	static Image anImage74;
	static IncomingOpcode aClass58_75;
	static Class282 aClass282_76;
	static int anInt77 = 100;
	static float aFloat78;

	public static void method171(final byte i) {
		try {
			aClass58_75 = null;
			anImage74 = null;
			if (i > 73) {
				aClass282_76 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ada.B(" + i + ')');
		}
	}

	static final void method172(final int i) {
		do {
			try {
				if ((Class15.anInt185 ^ 0xffffffff) != 0) {
					int i_0_ = Class2.aClass299_73.method3514(61);
					int i_1_ = Class2.aClass299_73.method3507((byte) 80);
					final Class98_Sub17 class98_sub17 = ((Class98_Sub17) Class167.aClass148_1284
							.method2418(32));
					if (class98_sub17 != null) {
						i_0_ = class98_sub17.method1155(123);
						i_1_ = class98_sub17.method1151(48);
					}
					int i_2_ = 0;
					if (i < 79) {
						method171((byte) -85);
					}
					int i_3_ = 0;
					if (za_Sub2.aBoolean6079) {
						i_2_ = Class189.method2642((byte) 42);
						i_3_ = Class335.method3765(false);
					}
					Class62.method544(i_2_ + i_0_, i_3_, Class15.anInt185, i_2_
							- -Class39_Sub1.anInt3593, 0,
							Class98_Sub25.anInt4024 + i_3_, i_2_, i_0_, i_1_,
							i_3_ + i_1_, i_3_, i_2_);
					if (Class11.aClass293_120 == null) {
						break;
					}
					Class246_Sub4.method3099(i_0_ - -i_2_, i_3_ + i_1_,
							(byte) 2);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ada.A(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static {
		aClass58_75 = new IncomingOpcode(81, 4);
	}
}
