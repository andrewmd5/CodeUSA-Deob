/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class184 {
	static final boolean method2626(final r var_r, final int i, final int i_0_,
			final int i_1_, final boolean[] bools) {
		boolean bool = false;
		if (Class78.aSArray594 != Class81.aSArray618) {
			final int i_2_ = Class98_Sub46_Sub2_Sub2.aSArray6298[i].method3417(
					i_0_, i_1_, true);
			int i_3_ = 0;
			for (/**/; i_3_ <= i; i_3_++) {
				final s var_s = Class98_Sub46_Sub2_Sub2.aSArray6298[i_3_];
				if (var_s != null) {
					final int i_4_ = i_2_ - var_s.method3417(i_0_, i_1_, true);
					if (bools != null) {
						bools[i_3_] = var_s.method3418(var_r, i_0_, i_4_, i_1_,
								0, false);
						if (!bools[i_3_]) {
							continue;
						}
					}
					var_s.CA(var_r, i_0_, i_4_, i_1_, 0, false);
					bool = true;
				}
			}
		}
		return bool;
	}

	static final boolean method2627(final int i, final char c) {
		try {
			if (c >= 32 && c <= 126) {
				return true;
			}
			if ((c ^ 0xffffffff) <= -161 && (c ^ 0xffffffff) >= -256) {
				return true;
			}
			if (i != 376) {
				return false;
			}
			if (c == 8364 || c == 338 || c == 8212 || c == 339 || c == 376) {
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "mea.B(" + i + ','
					+ c + ')');
		}
	}
}
