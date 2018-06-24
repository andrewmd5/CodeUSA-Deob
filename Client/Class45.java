/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class45 {
	static Class75 aClass75_381;
	static String aString382 = "";
	static Class332 aClass332_383;
	static int anInt384;
	static Class207 aClass207_385;

	static final void method430(boolean bool, int i, int i_0_) {
		do {
			try {
				Class98_Sub46_Sub17 class98_sub46_sub17 = Class185.method2628(
						i_0_, -126, 14);
				class98_sub46_sub17.method1626((byte) -103);
				((Class98_Sub46_Sub17) class98_sub46_sub17).anInt6054 = i;
				if (bool == true)
					break;
				method432((byte) 111);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("dd.C(" + bool
						+ ',' + i + ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method431(long l, boolean bool, ha var_ha) {
		do {
			try {
				Class246_Sub3_Sub1_Sub2.anInt6252 = 0;
				if (bool != true)
					aClass207_385 = null;
				Class98_Sub43_Sub3.anInt5924 = 0;
				Class237_Sub1.anInt5047 = Class113.anInt952;
				Class113.anInt952 = 0;
				long l_1_ = Class343.method3819(-47);
				for (Class246_Sub5 class246_sub5 = ((Class246_Sub5) Class267.aClass218_2002
						.method2803((byte) 15)); class246_sub5 != null; class246_sub5 = (Class246_Sub5) Class267.aClass218_2002
						.method2809(false)) {
					if (class246_sub5.method3121(var_ha, l))
						Class98_Sub43_Sub3.anInt5924++;
				}
				if (!Class246.aBoolean1870 || l % 100L != 0L)
					break;
				System.out.println("Particle system count: "
						+ Class267.aClass218_2002.method2811(15)
						+ ", running: " + Class98_Sub43_Sub3.anInt5924);
				System.out.println("Emitters: "
						+ Class246_Sub3_Sub1_Sub2.anInt6252 + " Particles: "
						+ Class113.anInt952 + ". Time taken: "
						+ (-l_1_ + Class343.method3819(-47)) + "ms");
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("dd.B(" + l
						+ ',' + bool + ','
						+ (var_ha != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method432(byte i) {
		try {
			aString382 = null;
			aClass332_383 = null;
			aClass207_385 = null;
			aClass75_381 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dd.A(" + i + ')');
		}
	}
}
