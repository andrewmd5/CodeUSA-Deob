/* Class119_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;

final class Class119_Sub3 extends Class119 {
	private int anInt4728;
	private int anInt4729;
	private int anInt4730;
	private int anInt4731;
	private int anInt4732;
	private int anInt4733;
	private int anInt4734;
	private int anInt4735;

	@Override
	final void method2178(final int i, final int i_0_, final int i_1_) {
		try {
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pd.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	@Override
	final void method2179(final byte i, final int i_3_, final int i_4_) {
		try {
			final int i_6_ = i_4_ * anInt4728 >> 1090097196;
			final int i_7_ = i_3_ * anInt4729 >> 1808074956;
			final int i_8_ = i_4_ * anInt4731 >> -168057524;
			final int i_9_ = i_3_ * anInt4733 >> 730639084;
			final int i_10_ = anInt4734 * i_4_ >> -676575636;
			final int i_11_ = i_3_ * anInt4732 >> -1065106292;
			final int i_12_ = i_4_ * anInt4735 >> -1661896212;
			final int i_13_ = i_3_ * anInt4730 >> -264501236;
			za_Sub2.method1685(i_8_, i_6_, i_10_, true, i_11_, i_9_, i_13_,
					((Class119) this).anInt985, i_7_, i_12_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pd.E(" + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	@Override
	final void method2174(final int i, final int i_14_, final int i_15_) {
		do {
			try {
				if (i_15_ == -5515) {
					break;
				}
				method2179((byte) 87, -113, -49);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("pd.C(" + i
						+ ',' + i_14_ + ',' + i_15_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method2185(final int i, final int i_16_) {
		try {
			final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
					.method2628(i_16_, -116, i);
			class98_sub46_sub17.method1621(i + -5);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pd.F(" + i + ','
					+ i_16_ + ')');
		}
	}

	static final void method2186(final int i, final ha var_ha) {
		try {
			if (i >= -9) {
				method2185(-4, 88);
			}
			if (IOException_Sub1.aClass148_30.method2424(0) != 0) {
				if (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
						.method583((byte) 121) != 0) {
					if (Class153.aHa1225 == null) {
						final Canvas canvas = new Canvas();
						canvas.setSize(36, 32);
						Class153.aHa1225 = Class76_Sub11.method771(0, canvas,
								122, (Class284_Sub2_Sub2.aD6203), 0,
								Class212.aClass207_1603);
						TextureDefinition.aClass43_1828 = (Class153.aHa1225.method1804(
								Class109.method1733((byte) 111, 0,
										Class244.anInt1860,
										Class36.aClass207_348), Class324
										.method3680(
												(Class332_Sub2.aClass207_5423),
												Class244.anInt1860, 0), true));
					}
					for (Class98_Sub12 class98_sub12 = ((Class98_Sub12) IOException_Sub1.aClass148_30
							.method2418(32)); class98_sub12 != null; class98_sub12 = (Class98_Sub12) IOException_Sub1.aClass148_30
							.method2417(106)) {
						Class98_Sub46_Sub19.aClass205_6068
								.method2722(
										TextureDefinition.aClass43_1828,
										false,
										class98_sub12.anInt3876,
										class98_sub12.anInt3873,
										class98_sub12.anInt3875,
										(!class98_sub12.aBoolean3878 ? null
												: (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518)),
										Class153.aHa1225,
										class98_sub12.anInt3871, false,
										class98_sub12.anInt3874, var_ha, false);
						class98_sub12.method942(55);
					}
				} else {
					for (Class98_Sub12 class98_sub12 = ((Class98_Sub12) IOException_Sub1.aClass148_30
							.method2418(32)); class98_sub12 != null; class98_sub12 = (Class98_Sub12) IOException_Sub1.aClass148_30
							.method2417(114)) {
						Class98_Sub46_Sub19.aClass205_6068
								.method2722(
										Class69_Sub2.aClass43_5336,
										false,
										class98_sub12.anInt3876,
										class98_sub12.anInt3873,
										class98_sub12.anInt3875,
										(class98_sub12.aBoolean3878 ? (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518)
												: null), var_ha,
										class98_sub12.anInt3871, false,
										class98_sub12.anInt3874, var_ha, false);
						class98_sub12.method942(84);
					}
					Class98_Sub43.method1481(2);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pd.D(" + i + ','
					+ (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method2187(final byte i, final int i_17_) {
		try {
			if (i >= -67) {
				return -87;
			}
			return i_17_ & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "pd.A(" + i + ','
					+ i_17_ + ')');
		}
	}

	Class119_Sub3(final int i, final int i_18_, final int i_19_,
			final int i_20_, final int i_21_, final int i_22_, final int i_23_,
			final int i_24_, final int i_25_, final int i_26_) {
		super(-1, i_25_, i_26_);
		try {
			anInt4733 = i_20_;
			anInt4735 = i_23_;
			anInt4734 = i_21_;
			anInt4729 = i_18_;
			anInt4732 = i_22_;
			anInt4728 = i;
			anInt4731 = i_19_;
			anInt4730 = i_24_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("pd.<init>(" + i
					+ ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_
					+ ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_
					+ ',' + i_26_ + ')'));
		}
	}
}
