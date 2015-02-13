/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class99 {
	static boolean aBoolean838 = false;

	static final boolean method1686(final int i, final int i_0_,
			final boolean bool) {
		try {
			if (bool != false) {
				aBoolean838 = true;
			}
			if (!(Class206.method2725(32768, i, i_0_) | (0x800 & i) != 0)
					&& !Class98_Sub27.method1292(i_0_, (byte) 121, i)) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ge.A(" + i + ','
					+ i_0_ + ',' + bool + ')'));
		}
	}

	static final void method1687(final Class246_Sub3_Sub4 class246_sub3_sub4,
			final boolean bool) {
		for (int i = class246_sub3_sub4.aShort6158; i <= class246_sub3_sub4.aShort6160; i++) {
			for (int i_1_ = class246_sub3_sub4.aShort6157; i_1_ <= class246_sub3_sub4.aShort6159; i_1_++) {
				final Class172 class172 = (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948[((Class246_Sub3) class246_sub3_sub4).aByte5088][i][i_1_]);
				if (class172 != null) {
					Class154 class154 = class172.aClass154_1325;
					Class154 class154_2_ = null;
					for (/**/; class154 != null; class154 = class154.aClass154_1233) {
						if (class154.aClass246_Sub3_Sub4_1232 == class246_sub3_sub4) {
							if (class154_2_ != null) {
								class154_2_.aClass154_1233 = class154.aClass154_1233;
							} else {
								class172.aClass154_1325 = class154.aClass154_1233;
							}
							class154.method2491(2);
							break;
						}
						class154_2_ = class154;
					}
				}
			}
		}
		if (!bool) {
			Class129.method2227(class246_sub3_sub4);
		}
	}
}
