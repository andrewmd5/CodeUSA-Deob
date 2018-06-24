/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

final class Class283 {
	private int anInt2133;
	private Class288 aClass288_2134;
	private ha_Sub1 aHa_Sub1_2135;
	private Class288 aClass288_2136;
	private final Class148 aClass148_2137;
	private int anInt2138 = 0;
	static IncomingOpcode aClass58_2139 = new IncomingOpcode(63, 7);
	private int anInt2140;
	private int anInt2141;
	private Class288 aClass288_2142;
	static IncomingOpcode aClass58_2143 = new IncomingOpcode(90, 10);
	private boolean aBoolean2144;
	static double aDouble2145;
	static OutgoingOpcode aClass171_2146 = new OutgoingOpcode(55, 7);
	private Class98_Sub46_Sub14 aClass98_Sub46_Sub14_2147;
	private boolean aBoolean2148;
	private Class42_Sub1 aClass42_Sub1_2149;
	private int anInt2150;
	private boolean aBoolean2151;
	private boolean aBoolean2152;
	private boolean aBoolean2153;
	private Class42_Sub1[] aClass42_Sub1Array2154;
	private int anInt2155;
	private Class98_Sub46_Sub14 aClass98_Sub46_Sub14_2156;
	private boolean aBoolean2157;
	/* synthetic */static Class aClass2158;

	private final boolean method3339(final int i) {
		try {
			if (aBoolean2151) {
				if (aClass98_Sub46_Sub14_2147 != null) {
					aClass98_Sub46_Sub14_2147.method1603(i ^ 0x5042);
					aClass98_Sub46_Sub14_2147 = null;
				}
				if (aClass42_Sub1_2149 != null) {
					aClass42_Sub1_2149.method375(true);
					aClass42_Sub1_2149 = null;
				}
				if (aClass288_2142 != null) {
					aClass98_Sub46_Sub14_2147 = new Class98_Sub46_Sub14(
							aHa_Sub1_2135, 6402, anInt2141, anInt2140,
							(aHa_Sub1_2135.anInt4310));
				}
				if (aBoolean2152) {
					aClass42_Sub1_2149 = new Class42_Sub1(aHa_Sub1_2135, 34037,
							6402, anInt2141, anInt2140);
				} else if (aClass98_Sub46_Sub14_2147 == null) {
					aClass98_Sub46_Sub14_2147 = new Class98_Sub46_Sub14(
							aHa_Sub1_2135, 6402, anInt2141, anInt2140);
				}
				aBoolean2151 = false;
				aBoolean2148 = true;
				aBoolean2157 = true;
			}
			if (aBoolean2153) {
				if (aClass98_Sub46_Sub14_2156 != null) {
					aClass98_Sub46_Sub14_2156.method1603(0);
					aClass98_Sub46_Sub14_2156 = null;
				}
				if (aClass42_Sub1Array2154[0] != null) {
					aClass42_Sub1Array2154[0].method375(true);
					aClass42_Sub1Array2154[0] = null;
				}
				if (aClass42_Sub1Array2154[1] != null) {
					aClass42_Sub1Array2154[1].method375(true);
					aClass42_Sub1Array2154[1] = null;
				}
				if (aClass288_2142 != null) {
					aClass98_Sub46_Sub14_2156 = new Class98_Sub46_Sub14(
							aHa_Sub1_2135, anInt2150, anInt2141, anInt2140,
							(aHa_Sub1_2135.anInt4310));
				}
				aClass42_Sub1Array2154[0] = new Class42_Sub1(aHa_Sub1_2135,
						34037, anInt2150, anInt2141, anInt2140);
				aClass42_Sub1Array2154[1] = (anInt2155 <= 1 ? (Class42_Sub1) null
						: new Class42_Sub1(aHa_Sub1_2135, 34037, anInt2150,
								anInt2141, anInt2140));
				aBoolean2157 = true;
				aBoolean2153 = false;
				aBoolean2148 = true;
			}
			if (aBoolean2148) {
				if (aClass288_2142 == null) {
					aHa_Sub1_2135.method1898(true, aClass288_2136);
					aClass288_2136.method3401(0, true);
					aClass288_2136.method3401(1, true);
					aClass288_2136.method3401(8, true);
					aClass288_2136
							.method3395(0, aClass42_Sub1Array2154[0], 119);
					if (anInt2155 > 1) {
						aClass288_2136.method3395(1, aClass42_Sub1Array2154[1],
								i + -20431);
					}
					if (aBoolean2152) {
						aClass288_2136.method3395(8, aClass42_Sub1_2149,
								i ^ 0x503b);
					} else {
						aClass288_2136.method3406((byte) 115, 8,
								aClass98_Sub46_Sub14_2147);
					}
					aHa_Sub1_2135.method1907(aClass288_2136, -1);
				} else {
					aHa_Sub1_2135.method1898(true, aClass288_2136);
					aClass288_2136.method3401(0, true);
					aClass288_2136.method3401(1, true);
					aClass288_2136.method3401(8, true);
					aClass288_2136.method3395(0, aClass42_Sub1Array2154[0],
							i ^ 0x5034);
					if (anInt2155 > 1) {
						aClass288_2136.method3395(1, aClass42_Sub1Array2154[1],
								127);
					}
					if (aBoolean2152) {
						aClass288_2136.method3395(8, aClass42_Sub1_2149, 113);
					}
					aHa_Sub1_2135.method1907(aClass288_2136, -1);
					aHa_Sub1_2135.method1898(true, aClass288_2142);
					aClass288_2142.method3401(0, true);
					aClass288_2142.method3401(8, true);
					aClass288_2142.method3406((byte) 78, 0,
							aClass98_Sub46_Sub14_2156);
					aClass288_2142.method3406((byte) 66, 8,
							aClass98_Sub46_Sub14_2147);
					aHa_Sub1_2135.method1907(aClass288_2142, -1);
				}
				aBoolean2157 = true;
				aBoolean2148 = false;
			}
			if (aBoolean2157) {
				aHa_Sub1_2135.method1898(true, aClass288_2134);
				aBoolean2157 = !aClass288_2134.method3403((byte) 74);
				aHa_Sub1_2135.method1907(aClass288_2134, -1);
			}
			if (i != 20546) {
				return false;
			}
			if (aBoolean2157) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rm.K(" + i + ')');
		}
	}

	private final void method3340(final int i) {
		do {
			try {
				if (i != 6408) {
					anInt2141 = 125;
				}
				boolean bool = false;
				int i_0_ = 0;
				int i_1_ = 0;
				for (Class98_Sub28 class98_sub28 = (Class98_Sub28) aClass148_2137
						.method2418(32); class98_sub28 != null; class98_sub28 = (Class98_Sub28) aClass148_2137
						.method2417(118)) {
					final int i_2_ = class98_sub28.method1299(false);
					i_1_ += class98_sub28.method1303(i + -6408);
					if (i_0_ < i_2_) {
						i_0_ = i_2_;
					}
					bool |= class98_sub28.method1301(-11);
				}
				int i_3_;
				if (i_0_ == 2) {
					i_3_ = 34836;
				} else if (i_0_ == 1) {
					i_3_ = 34842;
				} else {
					i_3_ = 6408;
				}
				if ((i_3_ ^ 0xffffffff) != (anInt2150 ^ 0xffffffff)) {
					anInt2150 = i_3_;
					aBoolean2153 = true;
				}
				final int i_4_ = (anInt2155 ^ 0xffffffff) < -3 ? 2 : anInt2155;
				final int i_5_ = i_1_ > 2 ? 2 : i_1_;
				anInt2155 = i_1_;
				if (!bool == aBoolean2152) {
					aBoolean2152 = bool;
					aBoolean2151 = true;
				}
				if (i_5_ == i_4_) {
					break;
				}
				aBoolean2148 = aBoolean2153 = true;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "rm.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method3341(final Class98_Sub28 class98_sub28, final int i) {
		try {
			class98_sub28.aBoolean4081 = false;
			class98_sub28.method1304((byte) -49);
			if (i != -17722) {
				method3339(-66);
			}
			class98_sub28.method942(59);
			method3340(i + 24130);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("rm.G(" + (class98_sub28 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	final void method3342(final int i) {
		try {
			if (aBoolean2144) {
				if (aClass288_2142 != null) {
					aHa_Sub1_2135.method1869(0, aClass288_2142);
					int i_6_ = 16384;
					aHa_Sub1_2135.method1835(aClass288_2136, 0);
					aClass288_2142.method3398(-63, 0);
					aClass288_2136.method3404(0, 0);
					if (aBoolean2152) {
						i_6_ |= 0x100;
					}
					OpenGL.glBlitFramebufferEXT(0, 0, anInt2141, anInt2140, 0,
							0, anInt2141, anInt2140, i_6_, 9728);
					aHa_Sub1_2135.method1832(aClass288_2142, 19);
					aHa_Sub1_2135.method1880(122, aClass288_2136);
				}
				aHa_Sub1_2135.method1829((byte) -99);
				if (i < -114) {
					aHa_Sub1_2135.method1870((byte) -99, 0);
					aHa_Sub1_2135.method1896(260, 1);
					aHa_Sub1_2135.la();
					int i_7_ = 0;
					int i_8_ = 1;
					Class98_Sub28 class98_sub28;
					for (Class98_Sub28 class98_sub28_9_ = (Class98_Sub28) aClass148_2137
							.method2418(32); class98_sub28_9_ != null; class98_sub28_9_ = class98_sub28) {
						class98_sub28 = (Class98_Sub28) aClass148_2137
								.method2417(127);
						final int i_10_ = class98_sub28_9_.method1303(0);
						for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff); i_11_++) {
							class98_sub28_9_.method1302(aClass42_Sub1_2149,
									i_11_, (byte) -64,
									(aClass42_Sub1Array2154[i_7_]));
							if (class98_sub28 != null || i_10_ - 1 != i_11_) {
								aClass288_2136.method3404(0, i_8_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, anInt2140);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, 0.0F);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, anInt2140);
								OpenGL.glTexCoord2f(anInt2141, 0.0F);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(anInt2141, anInt2140);
								OpenGL.glTexCoord2f(anInt2141, anInt2140);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(anInt2141, 0);
								OpenGL.glEnd();
							} else {
								aHa_Sub1_2135.method1907(aClass288_2136, -1);
								aHa_Sub1_2135.method1888(0, 78, 0);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, anInt2140);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(anInt2138, anInt2133);
								OpenGL.glTexCoord2f(0.0F, 0.0F);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(anInt2138, anInt2140
										+ anInt2133);
								OpenGL.glTexCoord2f(anInt2141, 0.0F);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(anInt2141 + anInt2138,
										anInt2133 + anInt2140);
								OpenGL.glTexCoord2f(anInt2141, anInt2140);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(anInt2138 + anInt2141,
										anInt2133);
								OpenGL.glEnd();
							}
							class98_sub28_9_.method1297(i_11_, (byte) 115);
							i_7_ = 1 + i_7_ & 0x1;
							i_8_ = 0x1 & i_8_ + 1;
						}
					}
					aBoolean2144 = false;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rm.E(" + i + ')');
		}
	}

	static final void method3343(final Class246_Sub3[] class246_sub3s,
			final int i, final int i_12_) {
		if (i < i_12_) {
			final int i_13_ = (i + i_12_) / 2;
			int i_14_ = i;
			final Class246_Sub3 class246_sub3 = class246_sub3s[i_13_];
			class246_sub3s[i_13_] = class246_sub3s[i_12_];
			class246_sub3s[i_12_] = class246_sub3;
			final int i_15_ = class246_sub3.anInt5083;
			for (int i_16_ = i; i_16_ < i_12_; i_16_++) {
				if (class246_sub3s[i_16_].anInt5083 < i_15_ + (i_16_ & 0x1)) {
					final Class246_Sub3 class246_sub3_17_ = class246_sub3s[i_16_];
					class246_sub3s[i_16_] = class246_sub3s[i_14_];
					class246_sub3s[i_14_++] = class246_sub3_17_;
				}
			}
			class246_sub3s[i_12_] = class246_sub3s[i_14_];
			class246_sub3s[i_14_] = class246_sub3;
			method3343(class246_sub3s, i, i_14_ - 1);
			method3343(class246_sub3s, i_14_ + 1, i_12_);
		}
	}

	final boolean method3344(final Class98_Sub28 class98_sub28, final int i) {
		try {
			if (aClass288_2134 != null) {
				if (class98_sub28.method1298(72)
						|| class98_sub28.method1294((byte) 81)) {
					aClass148_2137.method2419(class98_sub28, -20911);
					method3340(6408);
					if (method3339(20546)) {
						if ((anInt2141 ^ 0xffffffff) != 0
								&& (anInt2140 ^ 0xffffffff) != 0) {
							class98_sub28.method1295(anInt2140, anInt2141,
									false);
						}
						class98_sub28.aBoolean4081 = true;
						return true;
					}
				}
				method3341(class98_sub28, -17722);
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("rm.L(" + (class98_sub28 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	final boolean method3345(final int i, final int i_19_, final int i_20_,
			final int i_21_, final int i_22_) {
		try {
			if (i_22_ != 0) {
				return false;
			}
			if (aClass288_2134 == null || aClass148_2137.method2420(-128)) {
				return false;
			}
			if (i != anInt2141
					|| (anInt2140 ^ 0xffffffff) != (i_20_ ^ 0xffffffff)) {
				anInt2141 = i;
				anInt2140 = i_20_;
				for (Node node = aClass148_2137.method2418(32); aClass148_2137.aClass98_1198 != node; node = node.aClass98_836) {
					((Class98_Sub28) node).method1295(anInt2140, anInt2141,
							false);
				}
				aBoolean2151 = true;
				aBoolean2148 = true;
				aBoolean2153 = true;
			}
			if (method3339(20546)) {
				aBoolean2144 = true;
				anInt2138 = i_21_;
				anInt2133 = i_19_;
				aHa_Sub1_2135.method1898(true, aClass288_2134);
				aClass288_2134.method3404(0, 0);
				aHa_Sub1_2135.method1888(
						(anInt2140 + (anInt2133 - (aHa_Sub1_2135.anInt4304))),
						61, -anInt2138);
				return true;
			}
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rm.A(" + i + ','
					+ i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ')'));
		}
	}

	final void method3346(final byte i) {
		try {
			if (i >= -116) {
				method3352(21);
			}
			aClass288_2134 = aClass288_2142 = aClass288_2136 = null;
			aClass98_Sub46_Sub14_2147 = null;
			aClass98_Sub46_Sub14_2156 = null;
			aClass42_Sub1_2149 = null;
			aClass42_Sub1Array2154 = null;
			if (!aClass148_2137.method2420(-128)) {
				for (Node node = aClass148_2137.method2418(32); node != aClass148_2137.aClass98_1198; node = node.aClass98_836) {
					((Class98_Sub28) node).method1304((byte) -93);
				}
			}
			anInt2141 = anInt2140 = 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rm.H(" + i + ')');
		}
	}

	static final void method3347(final int i, Color color, Color color_23_,
			Color color_24_, final String string, final int i_25_) {
		try {
			try {
				final Graphics graphics = Class42_Sub3.aCanvas5361
						.getGraphics();
				if (Class98_Sub10_Sub7.aFont5576 == null) {
					Class98_Sub10_Sub7.aFont5576 = new Font("Helvetica", 1, 13);
				}
				if (color_23_ == null) {
					color_23_ = new Color(140, 17, 17);
				}
				if (color == null) {
					color = new Color(140, 17, 17);
				}
				if (color_24_ == null) {
					color_24_ = new Color(255, 255, 255);
				}
				try {
					if (Class3.anImage74 == null) {
						Class3.anImage74 = (Class42_Sub3.aCanvas5361
								.createImage(Class39_Sub1.anInt3593,
										Class98_Sub25.anInt4024));
					}
					final Graphics graphics_26_ = Class3.anImage74
							.getGraphics();
					graphics_26_.setColor(Color.DARK_GRAY);
					graphics_26_.fillRect(0, 0, Class39_Sub1.anInt3593,
							Class98_Sub25.anInt4024);
					final int i_27_ = Class39_Sub1.anInt3593 / 2 + -152;
					final int i_28_ = Class98_Sub25.anInt4024 / 2 - 18;
					graphics_26_.setColor(color);
					if (i_25_ == 90) {
						graphics_26_.drawRect(i_27_, i_28_, 303, 33);
						graphics_26_.setColor(color_23_);
						graphics_26_.fillRect(i_27_ + 2, i_28_ + 2, 3 * i, 30);
						graphics_26_.setColor(Color.DARK_GRAY);
						graphics_26_.drawRect(1 + i_27_, 1 + i_28_, 301, 31);
						graphics_26_.fillRect(2 + (i_27_ - -(i * 3)),
								i_28_ + 2, -(i * 3) + 300, 30);
						graphics_26_.setFont(Class98_Sub10_Sub7.aFont5576);
						graphics_26_.setColor(color_24_);
						graphics_26_.drawString(string,
								i_27_ - -((-(string.length() * 6) + 304) / 2),
								i_28_ - -22);
						if (Class265.aString1978 != null) {
							graphics_26_.setFont(Class98_Sub10_Sub7.aFont5576);
							graphics_26_.setColor(color_24_);
							graphics_26_
									.drawString(
											Class265.aString1978,
											(Class39_Sub1.anInt3593 / 2 - Class265.aString1978
													.length() * 6 / 2),
											Class98_Sub25.anInt4024 / 2 - 26);
						}
						graphics.drawImage(Class3.anImage74, 0, 0, null);
					}
				} catch (final Exception exception) {
					graphics.setColor(Color.DARK_GRAY);
					graphics.fillRect(0, 0, Class39_Sub1.anInt3593,
							Class98_Sub25.anInt4024);
					final int i_29_ = Class39_Sub1.anInt3593 / 2 + -152;
					final int i_30_ = Class98_Sub25.anInt4024 / 2 - 18;
					graphics.setColor(color);
					graphics.drawRect(i_29_, i_30_, 303, 33);
					graphics.setColor(color_23_);
					graphics.fillRect(i_29_ + 2, 2 + i_30_, 3 * i, 30);
					graphics.setColor(Color.DARK_GRAY);
					graphics.drawRect(i_29_ - -1, i_30_ + 1, 301, 31);
					graphics.fillRect(3 * i + i_29_ + 2, 2 + i_30_,
							300 + -(i * 3), 30);
					graphics.setFont(Class98_Sub10_Sub7.aFont5576);
					graphics.setColor(color_24_);
					if (Class265.aString1978 != null) {
						graphics.setFont(Class98_Sub10_Sub7.aFont5576);
						graphics.setColor(color_24_);
						graphics.drawString(
								Class265.aString1978,
								(Class39_Sub1.anInt3593 / 2 + -(Class265.aString1978
										.length() * 6 / 2)),
								Class98_Sub25.anInt4024 / 2 + -26);
					}
					graphics.drawString(string,
							i_29_ - -((304 + -(string.length() * 6)) / 2),
							i_30_ - -22);
				}
			} catch (final Exception exception) {
				Class42_Sub3.aCanvas5361.repaint();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rm.J(" + i + ','
					+ (color != null ? "{...}" : "null") + ','
					+ (color_23_ != null ? "{...}" : "null") + ','
					+ (color_24_ != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ',' + i_25_ + ')'));
		}
	}

	static final int method3348(final Class53_Sub1 class53_sub1, final int i,
			final boolean bool, final Class53_Sub1 class53_sub1_31_,
			final boolean bool_32_, final int i_33_, final int i_34_) {
		try {
			final int i_35_ = Class202.method2700(i_33_, class53_sub1, bool, i
					+ -18, class53_sub1_31_);
			if ((i_35_ ^ 0xffffffff) != -1) {
				if (bool) {
					return -i_35_;
				}
				return i_35_;
			}
			if (i_34_ == -1) {
				return 0;
			}
			if (i != 17) {
				method3350(4, 118, -28, 12, null, null);
			}
			final int i_36_ = Class202.method2700(i_34_, class53_sub1,
					bool_32_, -1, class53_sub1_31_);
			if (!bool_32_) {
				return i_36_;
			}
			return -i_36_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rm.N("
					+ (class53_sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ bool + ','
					+ (class53_sub1_31_ != null ? "{...}" : "null") + ','
					+ bool_32_ + ',' + i_33_ + ',' + i_34_ + ')'));
		}
	}

	final boolean method3349(final boolean bool) {
		try {
			if (bool != true) {
				method3342(26);
			}
			if (aClass288_2134 == null) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rm.I(" + bool
					+ ')');
		}
	}

	static final void method3350(final int i, final int i_37_, final int i_38_,
			final int i_39_, final AbstractModel abstractModel, final Class228 class228) {
		try {
			if (i_38_ != 18) {
				method3350(-82, 96, 36, 122, null, null);
			}
			if (abstractModel != null) {
				class228.method2860(i_37_, i_38_ + -7427, abstractModel.RA(),
						abstractModel.na(), abstractModel.fa(), abstractModel.V(), i_39_,
						abstractModel.G(), abstractModel.HA(), abstractModel.EA(), i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("rm.D(" + i + ','
					+ i_37_ + ',' + i_38_ + ',' + i_39_ + ','
					+ (abstractModel != null ? "{...}" : "null") + ','
					+ (class228 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3351(int i, final int i_40_, final boolean bool,
			final int i_41_, final int i_42_, final int i_43_, final int i_44_,
			final int i_45_) {
		while_166_: do {
			while_165_: do {
				try {
					if (bool != true) {
						method3347(-3, null, null, null, null, -95);
					}
					if ((i_41_ ^ 0xffffffff) > -1 || i_42_ < 0
							|| -1 + Class165.anInt1276 <= i_41_
							|| -1 + Class98_Sub10_Sub7.anInt5572 <= i_42_) {
						break while_166_;
					}
					if (Class98_Sub46_Sub1.aClass172ArrayArrayArray5948 == null) {
						break;
					}
					if ((i_45_ ^ 0xffffffff) != -1) {
						do {
							if ((i_45_ ^ 0xffffffff) != -2) {
								if ((i_45_ ^ 0xffffffff) != -3) {
									if ((i_45_ ^ 0xffffffff) == -4) {
										final Interface19 interface19 = ((Interface19) Class253
												.method3177(i_43_, i_41_, i_42_));
										if (interface19 != null) {
											if (!(interface19 instanceof Class246_Sub3_Sub1_Sub2)) {
												Canvas_Sub1
														.method119(
																interface19
																		.method64(30472),
																i_42_, i_45_,
																i_40_, i_43_,
																-2, i_41_,
																i_44_, i);
											} else {
												((Class246_Sub3_Sub1_Sub2) interface19).aClass359_6249
														.method3900(i_44_, -53);
											}
										}
									}
								} else {
									final Interface19 interface19 = ((Interface19) (AnimationDefinition
											.method931(
													i_43_,
													i_41_,
													i_42_,
													(aClass2158 != null ? aClass2158
															: (aClass2158 = (method3353("Interface19")))))));
									if (interface19 == null) {
										break;
									}
									if ((i ^ 0xffffffff) == -12) {
										i = 10;
									}
									if (interface19 instanceof Class246_Sub3_Sub4_Sub5) {
										((Class246_Sub3_Sub4_Sub5) interface19).aClass359_6261
												.method3900(i_44_, -102);
									} else {
										Canvas_Sub1.method119(
												interface19.method64(30472),
												i_42_, i_45_, i_40_, i_43_, -2,
												i_41_, i_44_, i);
									}
								}
								break;
							}
							final Interface19 interface19 = ((Interface19) Class101
									.method1701(i_43_, i_41_, i_42_));
							if (interface19 == null) {
								break while_165_;
							}
							if (!(interface19 instanceof Class246_Sub3_Sub5_Sub1)) {
								final int i_46_ = interface19.method64(30472);
								if ((i ^ 0xffffffff) != -5
										&& (i ^ 0xffffffff) != -6) {
									if (i != 6) {
										if ((i ^ 0xffffffff) != -8) {
											if ((i ^ 0xffffffff) == -9) {
												Canvas_Sub1.method119(i_46_,
														i_42_, i_45_,
														4 + i_40_, i_43_, -2,
														i_41_, i_44_, 4);
												Canvas_Sub1.method119(i_46_,
														i_42_, i_45_,
														(i_40_ + 2 & 0x3) - -4,
														i_43_, -2, i_41_,
														i_44_, 4);
											}
										} else {
											Canvas_Sub1.method119(i_46_, i_42_,
													i_45_,
													(i_40_ - -2 & 0x3) + 4,
													i_43_, -2, i_41_, i_44_, 4);
										}
									} else {
										Canvas_Sub1.method119(i_46_, i_42_,
												i_45_, i_40_ - -4, i_43_, -2,
												i_41_, i_44_, 4);
									}
								} else {
									Canvas_Sub1.method119(i_46_, i_42_, i_45_,
											i_40_, i_43_, -2, i_41_, i_44_, 4);
									break;
								}
								break;
							}
							((Class246_Sub3_Sub5_Sub1) interface19).aClass359_6219
									.method3900(i_44_, -86);
						} while (false);
						break;
					}
					final Interface19 interface19 = ((Interface19) Class21_Sub1
							.method268(i_43_, i_41_, i_42_));
					final Interface19 interface19_47_ = ((Interface19) Class205
							.method2711(i_43_, i_41_, i_42_));
					do {
						if (interface19 != null && i != 2) {
							if (interface19 instanceof Class246_Sub3_Sub3_Sub1) {
								((Class246_Sub3_Sub3_Sub1) interface19).aClass359_6258
										.method3900(i_44_, -76);
								if (!client.aBoolean3553) {
									break;
								}
							}
							Canvas_Sub1.method119(interface19.method64(30472),
									i_42_, i_45_, i_40_, i_43_, -2, i_41_,
									i_44_, i);
						}
					} while (false);
					if (interface19_47_ == null) {
						break while_166_;
					}
					if (!(interface19_47_ instanceof Class246_Sub3_Sub3_Sub1)) {
						Canvas_Sub1
								.method119(interface19_47_.method64(30472),
										i_42_, i_45_, i_40_, i_43_, -2, i_41_,
										i_44_, i);
						break;
					}
					((Class246_Sub3_Sub3_Sub1) interface19_47_).aClass359_6258
							.method3900(i_44_, -42);
				} catch (final RuntimeException runtimeexception) {
					throw Class64_Sub27.printError(runtimeexception,
							("rm.C(" + i + ',' + i_40_ + ',' + bool + ','
									+ i_41_ + ',' + i_42_ + ',' + i_43_ + ','
									+ i_44_ + ',' + i_45_ + ')'));
				}
			} while (false);
			break;
		} while (false);
	}

	public static void method3352(final int i) {
		try {
			aClass58_2139 = null;
			aClass171_2146 = null;
			aClass58_2143 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "rm.M(" + i + ')');
		}
	}

	Class283(final ha_Sub1 var_ha_Sub1) {
		anInt2133 = 0;
		anInt2140 = 1;
		anInt2141 = 1;
		aClass148_2137 = new Class148();
		aBoolean2148 = true;
		anInt2150 = -1;
		aBoolean2153 = true;
		aBoolean2151 = true;
		aClass42_Sub1Array2154 = new Class42_Sub1[2];
		aBoolean2157 = true;
		aBoolean2152 = false;
		anInt2155 = 0;
		do {
			try {
				aHa_Sub1_2135 = var_ha_Sub1;
				if (!aHa_Sub1_2135.aBoolean4460 || !aHa_Sub1_2135.aBoolean4378) {
					break;
				}
				aClass288_2134 = aClass288_2136 = new Class288(aHa_Sub1_2135);
				if (aHa_Sub1_2135.anInt4310 <= 1 || !aHa_Sub1_2135.aBoolean4375
						|| !aHa_Sub1_2135.aBoolean4424) {
					break;
				}
				aClass288_2134 = aClass288_2142 = new Class288(aHa_Sub1_2135);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("rm.<init>("
						+ (var_ha_Sub1 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	/* synthetic */
	static Class method3353(final String string) {
		try {
			return Class.forName(string);
		} catch (final ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
