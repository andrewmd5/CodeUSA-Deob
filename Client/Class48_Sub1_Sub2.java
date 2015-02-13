/* Class48_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class48_Sub1_Sub2 extends Class48_Sub1 {
	static Class98_Sub22_Sub1 aClass98_Sub22_Sub1_5514;
	static float aFloat5515;
	private Class42_Sub2 aClass42_Sub2_5516;
	private ha_Sub1 aHa_Sub1_5517;
	static int[] anIntArray5518 = new int[2];
	static int anInt5519;
	static IncomingOpcode aClass58_5520;

	final Class42_Sub2 method456(byte i) {
		try {
			return aClass42_Sub2_5516;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cv.E(" + i + ')');
		}
	}

	final boolean method464(byte i, Class42_Sub2 class42_sub2, float f,
			Class42_Sub2 class42_sub2_0_) {
		try {
			boolean bool = true;
			Class288 class288 = ((ha_Sub1) aHa_Sub1_5517).aClass288_4363;
			aHa_Sub1_5517.K(Class21.anIntArray3232);
			aHa_Sub1_5517.la();
			aHa_Sub1_5517.method1867(i + 29479);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0,
					((Class42_Sub2) aClass42_Sub2_5516).anInt5357,
					((Class42_Sub2) aClass42_Sub2_5516).anInt5357);
			aHa_Sub1_5517.method1856(false, i ^ ~0x1b16);
			aHa_Sub1_5517.method1851(false, false);
			aHa_Sub1_5517.method1881(false, false);
			aHa_Sub1_5517.method1875((byte) -123, false);
			aHa_Sub1_5517.method1834(69, -2);
			aHa_Sub1_5517.method1845(1, i ^ ~0x3289837c);
			aHa_Sub1_5517.method1858(0.0F, 0.0F, 0.0F, f, -77);
			aHa_Sub1_5517.method1899(34165, 8960, 34165);
			aHa_Sub1_5517.method1863(1, class42_sub2_0_);
			aHa_Sub1_5517.method1845(0, 847872872);
			aHa_Sub1_5517.method1896(260, 1);
			aHa_Sub1_5517.method1863(1, class42_sub2);
			aHa_Sub1_5517.method1898(true, class288);
			for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -7; i_1_++) {
				int i_2_ = i_1_ + 34069;
				class288.method3402(i_2_, i + 21, 0, aClass42_Sub2_5516);
				class288.method3404(0, 0);
				if (!class288.method3403((byte) 74)) {
					bool = false;
					break;
				}
				OpenGL.glBegin(7);
				int i_3_ = i_2_;
				while_47_: do {
					while_46_: do {
						while_45_: do {
							while_44_: do {
								do {
									if ((i_3_ ^ 0xffffffff) != -34070) {
										if ((i_3_ ^ 0xffffffff) != -34071) {
											if (i_3_ != 34071) {
												if (i_3_ != 34072) {
													if (i_3_ != 34073) {
														if ((i_3_ ^ 0xffffffff) != -34075)
															break while_47_;
													} else
														break while_45_;
													break while_46_;
												}
											} else
												break;
											break while_44_;
										}
									} else {
										OpenGL.glTexCoord3i(65535, 65534, 65534);
										OpenGL.glMultiTexCoord3i(33985, 65535,
												65534, 65534);
										OpenGL.glVertex2f(0.0F, 0.0F);
										OpenGL.glTexCoord3i(65535, 65534,
												-65534);
										OpenGL.glMultiTexCoord3i(33985, 65535,
												65534, -65534);
										OpenGL.glVertex2f(1.0F, 0.0F);
										OpenGL.glTexCoord3i(65535, -65534,
												-65534);
										OpenGL.glMultiTexCoord3i(33985, 65535,
												-65534, -65534);
										OpenGL.glVertex2f(1.0F, 1.0F);
										OpenGL.glTexCoord3i(65535, -65534,
												65534);
										OpenGL.glMultiTexCoord3i(33985, 65535,
												-65534, 65534);
										OpenGL.glVertex2f(0.0F, 1.0F);
										break while_47_;
									}
									OpenGL.glTexCoord3i(-65535, 65534, -65534);
									OpenGL.glMultiTexCoord3i(33985, -65535,
											65534, -65534);
									OpenGL.glVertex2f(0.0F, 0.0F);
									OpenGL.glTexCoord3i(-65535, 65534, 65534);
									OpenGL.glMultiTexCoord3i(33985, -65535,
											65534, 65534);
									OpenGL.glVertex2f(1.0F, 0.0F);
									OpenGL.glTexCoord3i(-65535, -65534, 65534);
									OpenGL.glMultiTexCoord3i(33985, -65535,
											-65534, 65534);
									OpenGL.glVertex2f(1.0F, 1.0F);
									OpenGL.glTexCoord3i(-65535, -65534, -65534);
									OpenGL.glMultiTexCoord3i(33985, -65535,
											-65534, -65534);
									OpenGL.glVertex2f(0.0F, 1.0F);
									break while_47_;
								} while (false);
								OpenGL.glTexCoord3i(-65534, 65535, -65534);
								OpenGL.glMultiTexCoord3i(33985, -65534, 65535,
										-65534);
								OpenGL.glVertex2f(0.0F, 0.0F);
								OpenGL.glTexCoord3i(65534, 65535, -65534);
								OpenGL.glMultiTexCoord3i(33985, 65534, 65535,
										-65534);
								OpenGL.glVertex2f(1.0F, 0.0F);
								OpenGL.glTexCoord3i(65534, 65535, 65534);
								OpenGL.glMultiTexCoord3i(33985, 65534, 65535,
										65534);
								OpenGL.glVertex2f(1.0F, 1.0F);
								OpenGL.glTexCoord3i(-65534, 65535, 65534);
								OpenGL.glMultiTexCoord3i(33985, -65534, 65535,
										65534);
								OpenGL.glVertex2f(0.0F, 1.0F);
								break while_47_;
							} while (false);
							OpenGL.glTexCoord3i(-65534, -65535, 65534);
							OpenGL.glMultiTexCoord3i(33985, -65534, -65535,
									65534);
							OpenGL.glVertex2f(0.0F, 0.0F);
							OpenGL.glTexCoord3i(65534, -65535, 65534);
							OpenGL.glMultiTexCoord3i(33985, 65534, -65535,
									65534);
							OpenGL.glVertex2f(1.0F, 0.0F);
							OpenGL.glTexCoord3i(65534, -65535, -65534);
							OpenGL.glMultiTexCoord3i(33985, 65534, -65535,
									-65534);
							OpenGL.glVertex2f(1.0F, 1.0F);
							OpenGL.glTexCoord3i(-65534, -65535, -65534);
							OpenGL.glMultiTexCoord3i(33985, -65534, -65535,
									-65534);
							OpenGL.glVertex2f(0.0F, 1.0F);
							break while_47_;
						} while (false);
						OpenGL.glTexCoord3i(-65534, 65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, 65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, -65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(-65534, -65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break while_47_;
					} while (false);
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
				} while (false);
				OpenGL.glEnd();
			}
			class288.method3401(0, true);
			aHa_Sub1_5517.method1907(class288, i ^ 0x14);
			aHa_Sub1_5517.method1845(1, 847872872);
			aHa_Sub1_5517.method1863(1, null);
			aHa_Sub1_5517.method1899(8448, i ^ ~0x2314, 8448);
			aHa_Sub1_5517.method1845(0, 847872872);
			aHa_Sub1_5517.method1863(1, null);
			if (i != -21)
				method466(true);
			OpenGL.glPopAttrib();
			aHa_Sub1_5517.KA(Class21.anIntArray3232[0],
					Class21.anIntArray3232[1], Class21.anIntArray3232[2],
					Class21.anIntArray3232[3]);
			if (bool && !((ha_Sub1) aHa_Sub1_5517).aBoolean4406)
				aClass42_Sub2_5516.method371(69);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cv.F(" + i + ','
					+ (class42_sub2 != null ? "{...}" : "null") + ',' + f + ','
					+ (class42_sub2_0_ != null ? "{...}" : "null") + ')'));
		}
	}

	final int method465(int i) {
		try {
			if (i != -65534)
				method467(-59);
			return ((Class42_Sub2) aClass42_Sub2_5516).anInt5357;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cv.J(" + i + ')');
		}
	}

	Class48_Sub1_Sub2(ha_Sub1 var_ha_Sub1, int i) {
		try {
			aHa_Sub1_5517 = var_ha_Sub1;
			aClass42_Sub2_5516 = new Class42_Sub2(var_ha_Sub1, 6408, i);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("cv.<init>("
							+ (var_ha_Sub1 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	static final void method466(boolean bool) {
		try {
			Class246_Sub3_Sub4_Sub2_Sub1.aClass332_6508 = null;
			if (bool == true) {
				Class98_Sub10_Sub28.aClass332_5704 = null;
				Class300.aClass332_2500 = null;
				Class221.aClass332_1666 = null;
				Class98_Sub50.aClass332_4287 = null;
				Class98_Sub47.aClass332_4273 = null;
				Class45.aClass332_383 = null;
				Class76_Sub11.aClass332_3795 = null;
				Class217.aClass332Array3408 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cv.G(" + bool
					+ ')');
		}
	}

	public static void method467(int i) {
		try {
			anIntArray5518 = null;
			if (i == 1) {
				aClass98_Sub22_Sub1_5514 = null;
				aClass58_5520 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cv.H(" + i + ')');
		}
	}

	static final boolean method468(boolean bool, int i, int i_4_, String string) {
		try {
			if ((i_4_ ^ 0xffffffff) > -3 || (i_4_ ^ 0xffffffff) < -37)
				throw new IllegalArgumentException("Invalid radix:" + i_4_);
			if (i != 30883)
				return false;
			boolean bool_5_ = false;
			boolean bool_6_ = false;
			int i_7_ = 0;
			int i_8_ = string.length();
			for (int i_9_ = 0; (i_8_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
				int i_10_ = string.charAt(i_9_);
				if (i_9_ == 0) {
					if (i_10_ == 45) {
						bool_5_ = true;
						continue;
					}
					if (i_10_ == 43 && bool)
						continue;
				}
				if (i_10_ >= 48 && i_10_ <= 57)
					i_10_ -= 48;
				else if ((i_10_ ^ 0xffffffff) <= -66 && i_10_ <= 90)
					i_10_ -= 55;
				else {
					if ((i_10_ ^ 0xffffffff) > -98
							|| (i_10_ ^ 0xffffffff) < -123)
						return false;
					i_10_ -= 87;
				}
				if ((i_10_ ^ 0xffffffff) <= (i_4_ ^ 0xffffffff))
					return false;
				if (bool_5_)
					i_10_ = -i_10_;
				int i_11_ = i_4_ * i_7_ + i_10_;
				if (i_7_ != i_11_ / i_4_)
					return false;
				i_7_ = i_11_;
				bool_6_ = true;
			}
			return bool_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cv.I(" + bool
					+ ',' + i + ',' + i_4_ + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass98_Sub22_Sub1_5514 = new Class98_Sub22_Sub1(5000);
		aClass58_5520 = new IncomingOpcode(21, 3);
	}
}
