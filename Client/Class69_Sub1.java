/* Class69_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class69_Sub1 extends Class69 implements Interface2_Impl2 {
	static int anInt5329 = 0;
	static int anInt5330 = -1;
	private Class162 aClass162_5331;

	Class69_Sub1(final ha_Sub3_Sub2 var_ha_Sub3_Sub2, final Class162 class162,
			final boolean bool) {
		super(var_ha_Sub3_Sub2, 34963, bool);
		try {
			aClass162_5331 = class162;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, ("ud.<init>("
							+ (var_ha_Sub3_Sub2 != null ? "{...}" : "null")
							+ ',' + (class162 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	@Override
	public final void method72(final boolean bool) {
		try {
			super.method72(bool);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ud.L(" + bool
					+ ')');
		}
	}

	@Override
	public final int method2(final int i) {
		try {
			if (i != 200) {
				aClass162_5331 = null;
			}
			return super.method2(200);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ud.E(" + i + ')');
		}
	}

	@Override
	public final boolean method79(final byte i) {
		try {
			return super.method703((byte) -68,
					(((Class69) this).aHa_Sub3_Sub2_3217.aMapBuffer6125));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ud.N(" + i + ')');
		}
	}

	@Override
	public final Buffer method78(final boolean bool, final int i) {
		try {
			if (i > -79) {
				anInt5330 = 20;
			}
			return super.method694(bool,
					(((Class69) this).aHa_Sub3_Sub2_3217.aMapBuffer6125),
					-15793);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ud.O(" + bool
					+ ',' + i + ')');
		}
	}

	@Override
	public final void method76(final int i, final int i_1_) {
		try {
			super.method76(aClass162_5331.anInt1263 * i, i_1_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ud.G(" + i + ','
					+ i_1_ + ')');
		}
	}

	@Override
	public final Class162 method77(final int i) {
		try {
			if (i != -15448) {
				method2(120);
			}
			return aClass162_5331;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ud.P(" + i + ')');
		}
	}
}
