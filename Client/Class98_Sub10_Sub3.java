/* Class98_Sub10_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub10_Sub3 extends Class98_Sub10 {
	static Class113 aClass113_5546 = new Class113(6, 1);

	public static void method1011(boolean bool) {
		try {
			if (bool != true)
				method1011(false);
			aClass113_5546 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aja.B(" + bool
					+ ')');
		}
	}

	final int[] method990(int i, int i_0_) {
		try {
			int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_0_);
			if (i != 255)
				aClass113_5546 = null;
			if (((Class16) ((Class98_Sub10) this).aClass16_3863).aBoolean198)
				Class236.method2896(is, 0, Class25.anInt268,
						GameObjectDefinition.anIntArray3001[i_0_]);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aja.G(" + i + ','
					+ i_0_ + ')');
		}
	}

	public Class98_Sub10_Sub3() {
		super(0, true);
	}

	static final void method1012(ha var_ha, byte i) {
		do {
			try {
				int i_1_ = 0;
				int i_2_ = 0;
				if (za_Sub2.aBoolean6079) {
					i_1_ = Class189.method2642((byte) 42);
					i_2_ = Class335.method3765(false);
				}
				var_ha.KA(i_1_, i_2_, Class39_Sub1.anInt3593 - -i_1_,
						350 - -i_2_);
				var_ha.aa(
						i_1_,
						i_2_,
						Class39_Sub1.anInt3593,
						350,
						(808080 | Class98_Sub10_Sub15.anInt5618 << -1258986120),
						1);
				if (i <= 122)
					method1012(null, (byte) -3);
				Class93_Sub1_Sub1.method908(i_2_ + 350, i_2_, false, i_1_, i_1_
						+ Class39_Sub1.anInt3593);
				int i_3_ = 350 / Class253.anInt1934;
				if (Class98_Sub28.anInt4080 > 0) {
					int i_4_ = 346 + (-Class253.anInt1934 + -4);
					int i_5_ = (i_3_ * i_4_ / (Class98_Sub28.anInt4080 + (i_3_ + -1)));
					int i_6_ = 4;
					if (Class98_Sub28.anInt4080 > 1)
						i_6_ += ((-i_5_ + i_4_)
								* (-Class54.anInt3395 + Class98_Sub28.anInt4080 + -1) / (-1 + Class98_Sub28.anInt4080));
					var_ha.aa(
							-16 + (i_1_ + Class39_Sub1.anInt3593),
							i_2_ - -i_6_,
							12,
							i_5_,
							(Class98_Sub10_Sub15.anInt5618 << 2108767992 | 0x332277),
							2);
					for (int i_7_ = Class54.anInt3395; (i_7_ < i_3_
							+ Class54.anInt3395 && (i_7_ ^ 0xffffffff) > (Class98_Sub28.anInt4080 ^ 0xffffffff)); i_7_++) {
						String[] strings = Class112.method2142(
								(Class98_Sub46_Sub20.aStringArray6073[i_7_]),
								'\010', false);
						int i_8_ = ((-16 + Class39_Sub1.anInt3593 - 8) / strings.length);
						for (int i_9_ = 0; ((strings.length ^ 0xffffffff) < (i_9_ ^ 0xffffffff)); i_9_++) {
							int i_10_ = 8 - -(i_8_ * i_9_);
							var_ha.KA(i_1_ - -i_10_, i_2_, i_8_
									+ (i_10_ + i_1_) - 8, 350 + i_2_);
							Class195.aClass43_1499
									.method411(
											(byte) 85,
											(-(Class253.anInt1934 * (-Class54.anInt3395 + i_7_))
													+ (-((Class197) (Class98_Sub46_Sub10.aClass197_6019)).anInt1514 + 348) + (i_2_ + -Class98_Sub10_Sub12.anInt5598)),
											Class224_Sub1.method2834(0,
													strings[i_9_]), -1,
											-16777216, i_1_ - -i_10_);
						}
					}
				}
				Class69_Sub2.aClass43_5336.method397(-1, 0, (i_1_
						- -Class39_Sub1.anInt3593 + -25), -16777216, "Build: "
						+ Game.version, -20 + (i_2_ - -350));
				var_ha.KA(i_1_, i_2_, i_1_ - -Class39_Sub1.anInt3593,
						i_2_ + 350);
				var_ha.method1753(22294, Class39_Sub1.anInt3593, -1, i_2_ + 350
						- Class98_Sub10_Sub12.anInt5598, i_1_);
				Class98_Sub10_Sub34.aClass43_5730.method411(
						(byte) -97,
						(-((Class197) Class42_Sub1.aClass197_5354).anInt1514
								+ i_2_ + 349),
						"--> "
								+ Class224_Sub1.method2834(0,
										Class45.aString382), -1, -16777216,
						10 + i_1_);
				if (!Class4.aBoolean84)
					break;
				int i_11_ = -1;
				if (Class215.anInt1614 % 30 > 15)
					i_11_ = 16777215;
				var_ha.method1755(
						8479,
						-11
								+ (-((Class197) Class42_Sub1.aClass197_5354).anInt1514 + (350 + i_2_)),
						(Class42_Sub1.aClass197_5354.method2674(
								"--> "
										+ Class224_Sub1.method2834(0,
												Class45.aString382).substring(
												0, Class198.anInt1524), 127))
								+ (10 + i_1_), i_11_, 12);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("aja.D("
						+ (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}
}
