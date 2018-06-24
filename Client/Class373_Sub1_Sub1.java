/* Class373_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class373_Sub1_Sub1 extends PacketParser {
	static Class126 aClass126_6216 = new Class126();

	static final void method3970(final Class207 class207, final byte i) {
		try {
			Class361.anInt3089 = 0;
			Class351.anInt2922 = 0;
			Class267.aClass218_2002 = new Class218();
			Class185.aClass246_Sub4_Sub2_Sub1Array1445 = new Class246_Sub4_Sub2_Sub1[1024];
			Class373_Sub2.aClass246_Sub5Array5469 = new Class246_Sub5[(Class224_Sub1.anIntArray5034[Class337_Sub1.anInt5497]) + 1];
			Class273.anInt2039 = 0;
			Class258.anInt1952 = 0;
			Class242.method2935((byte) 40, class207);
			if (i > -58) {
				aClass126_6216 = null;
			}
			Class89.method880(-13258, class207);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qea.N("
					+ (class207 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method3971(final int i) {
		try {
			if (i != 0) {
				aClass126_6216 = null;
			}
			aClass126_6216 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "qea.P(" + i + ')');
		}
	}

	static final void method3972(final int i, final int i_0_, final int i_1_) {
		final Class172 class172 = Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[i][i_0_][i_1_];
		if (class172 != null) {
			Class129.method2227(class172.aClass246_Sub3_Sub3_1324);
			Class129.method2227(class172.aClass246_Sub3_Sub3_1333);
			if (class172.aClass246_Sub3_Sub3_1324 != null) {
				class172.aClass246_Sub3_Sub3_1324 = null;
			}
			if (class172.aClass246_Sub3_Sub3_1333 != null) {
				class172.aClass246_Sub3_Sub3_1333 = null;
			}
		}
	}

	static final boolean method3973(final int i, final int i_2_, final int i_3_) {
		try {
			if (!((i & 0x60000 ^ 0xffffffff) != -1 | Class161.method2514(i, 16,
					i_2_))
					&& !Class228.method2864(55, i, i_2_)
					&& !Class216.method2793(i_2_, (byte) -112, i)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qea.Q(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	@Override
	final void method3966(final int i, final int i_5_, final int i_6_,
			final int i_7_, final byte i_8_) {
		try {
			if (i_8_ >= 21) {
				final int i_9_ = ((PacketParser) this).aClass332_5462
						.method3737();
				final int i_10_ = (((Class93_Sub1_Sub1) ((Class373) this).aClass93_3478).anInt6290
						* RuntimeException_Sub1.method4012(true) / 10 % i_9_);
				((PacketParser) this).aClass332_5462.method3738(i_10_ + i_7_
						+ -i_9_, i_6_, i_9_ + i_5_ + -i_10_, i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("qea.G(" + i + ','
					+ i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	Class373_Sub1_Sub1(final Class207 class207, final Class207 class207_11_,
			final Class93_Sub1_Sub1 class93_sub1_sub1) {
		super(class207, class207_11_, class93_sub1_sub1);
	}
}
