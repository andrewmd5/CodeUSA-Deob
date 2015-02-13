/* Class98_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

final class Class98_Sub5_Sub1 extends Class98_Sub5 {
	static Color[] aColorArray5533 = { new Color(16777215),
			new Color(16777215), new Color(16741381), new Color(16741381) };
	static Class348 aClass348_5534 = new Class348(14, 0, 4, 1);

	static final int method964(final Class162 class162, final byte i) {
		try {
			if (i != 105) {
				return -27;
			}
			if (class162 != Class162.aClass162_1262) {
				if (Class162.aClass162_1264 != class162) {
					if (Class162.aClass162_1265 != class162) {
						if (Class162.aClass162_1266 == class162) {
							return 5121;
						}
						if (class162 == Class162.aClass162_1267) {
							return 5123;
						}
						if (Class162.aClass162_1268 != class162) {
							if (class162 == Class162.aClass162_1269) {
								return 5131;
							}
							if (Class162.aClass162_1270 == class162) {
								return 5126;
							}
						} else {
							return 5125;
						}
					} else {
						return 5124;
					}
				} else {
					return 5122;
				}
			} else {
				return 5120;
			}
			throw new IllegalArgumentException("");
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fi.K("
					+ (class162 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final boolean method965(final byte i, final int i_0_) {
		try {
			if (i_0_ != 3 && i_0_ != 7 && i_0_ != 10) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fi.N(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final boolean method966(final int i, boolean bool) {
		try {
			final boolean bool_2_ = Class265.aHa1974.method1768();
			if (i != 29089) {
				aColorArray5533 = null;
			}
			if (bool != !bool_2_) {
				return true;
			}
			do {
				if (bool) {
					if (Class265.aHa1974.method1802()) {
						break;
					}
					bool = false;
					if (!client.aBoolean3553) {
						break;
					}
				}
				Class265.aHa1974.method1756();
			} while (false);
			if (bool == !bool_2_) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						!bool ? 0 : 1,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub5_4065));
				Class310.method3618(-5964);
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fi.L(" + i + ','
					+ bool + ')');
		}
	}

	@Override
	final void method955(final int i, final byte i_3_, final int i_4_,
			final int i_5_) {
		try {
			((Class98_Sub5) this).anInt3833 = i_4_;
			((Class98_Sub5) this).anInt3834 = i;
			if (i_3_ > -120) {
				aClass348_5534 = null;
			}
			((Class98_Sub5) this).anInt3830 = i_5_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fi.A(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	Class98_Sub5_Sub1(final int i, final int i_6_, final int i_7_,
			final int i_8_, final int i_9_, final float f) {
		super(i, i_6_, i_7_, i_8_, i_9_, f);
	}

	public static void method967(final byte i) {
		try {
			if (i >= 16) {
				aClass348_5534 = null;
				aColorArray5533 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fi.M(" + i + ')');
		}
	}

	@Override
	final void method959(final float f, final int i) {
		do {
			try {
				((Class98_Sub5) this).aFloat3832 = f;
				if (i > 12) {
					break;
				}
				method955(55, (byte) 80, -52, 106);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fi.D(" + f
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}
}
