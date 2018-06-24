/* Class93_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class93_Sub2 extends Class93 {
	int anInt5490;
	static int anInt5491;
	int anInt5492;

	public final Class113 method70(int i) {
		try {
			if (i != 30778)
				((Class93_Sub2) this).anInt5490 = 109;
			return Class137.aClass113_1078;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "tu.A(" + i + ')');
		}
	}

	Class93_Sub2(Class63 class63, Class110 class110, int i, int i_0_, int i_1_,
			int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		super(class63, class110, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
		try {
			((Class93_Sub2) this).anInt5490 = i_8_;
			((Class93_Sub2) this).anInt5492 = i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("tu.<init>("
					+ (class63 != null ? "{...}" : "null") + ','
					+ (class110 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	static final void method910(ha var_ha, byte i) {
		try {
			Class69_Sub2.aClass43_5336 = Class98_Sub1.method945(
					Class244.anInt1860, var_ha, (byte) 117, true);
			if (i <= -47) {
				Class98_Sub46_Sub2_Sub2.aClass197_6296 = Class98_Sub46_Sub6
						.method1550(Class244.anInt1860, 18361, var_ha);
				Class195.aClass43_1499 = Class98_Sub1.method945(
						Class269.anInt2026, var_ha, (byte) 119, true);
				Class98_Sub46_Sub10.aClass197_6019 = Class98_Sub46_Sub6
						.method1550(Class269.anInt2026, 18361, var_ha);
				Class98_Sub10_Sub34.aClass43_5730 = Class98_Sub1.method945(
						Class123_Sub1.anInt4742, var_ha, (byte) 88, true);
				Class42_Sub1.aClass197_5354 = Class98_Sub46_Sub6.method1550(
						Class123_Sub1.anInt4742, 18361, var_ha);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("tu.C("
					+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final boolean method911(char c, int i) {
		try {
			if (i != 95)
				method911('6', -97);
			if (c != 160 && (c ^ 0xffffffff) != -33 && c != 95
					&& (c ^ 0xffffffff) != -46)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "tu.B(" + c + ','
					+ i + ')');
		}
	}
}
