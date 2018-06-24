/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class219 {
	int anInt1637 = 128;
	int anInt1638;
	int anInt1639;
	static OutgoingOpcode aClass171_1640 = new OutgoingOpcode(7, 6);
	static Class77 aClass77_1641;
	static Class361 aClass361_1642;
	int anInt1643;
	int anInt1644;
	int anInt1645 = 128;

	public static void method2813(final boolean bool) {
		try {
			if (bool != false) {
				aClass361_1642 = null;
			}
			aClass77_1641 = null;
			aClass361_1642 = null;
			aClass171_1640 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oaa.B(" + bool
					+ ')');
		}
	}

	final void method2814(final Class219 class219_0_, final int i) {
		try {
			if (i != 6) {
				method2815(127);
			}
			anInt1638 = class219_0_.anInt1638;
			anInt1639 = class219_0_.anInt1639;
			anInt1643 = class219_0_.anInt1643;
			anInt1645 = class219_0_.anInt1645;
			anInt1644 = class219_0_.anInt1644;
			anInt1637 = class219_0_.anInt1637;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, ("oaa.A("
							+ (class219_0_ != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	final Class219 method2815(final int i) {
		try {
			if (i != 128) {
				method2814(null, 107);
			}
			return new Class219(anInt1643, anInt1637, anInt1645, anInt1638,
					anInt1644, anInt1639);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oaa.C(" + i + ')');
		}
	}

	Class219(final int i) {
		try {
			anInt1643 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "oaa.<init>(" + i
					+ ')');
		}
	}

	private Class219(final int i, final int i_1_, final int i_2_,
			final int i_3_, final int i_4_, final int i_5_) {
		try {
			anInt1638 = i_3_;
			anInt1644 = i_4_;
			anInt1639 = i_5_;
			anInt1643 = i;
			anInt1645 = i_2_;
			anInt1637 = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("oaa.<init>(" + i
					+ ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ','
					+ i_5_ + ')'));
		}
	}
}
