/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;

final class ClientScriptsDefs {
	private static int[] anIntArray1875;
	private static Class300 aClass300_1876;
	private static Class293 aClass293_1877;
	private static int[] anIntArray1878 = new int[1000];
	private static Class293 aClass293_1879;
	static int anInt1880;
	private static int[][] anIntArrayArray1881 = new int[5][5000];
	private static Calendar aCalendar1882;
	static String[] aStringArray1883 = new String[1000];
	static int anInt1884 = 0;
	private static int anInt1885;
	private static String[] aStringArray1886;
	private static int[] anIntArray1887;
	private static int anInt1888 = 0;
	private static Class349[] aClass349Array1889;
	static Class79 aClass79_1890;
	private static int[] anIntArray1891;
	private static String[] aStringArray1892;
	private static int anInt1893;

	private static final void method3142(final int i) {
		final Class293 class293 = Class159.method2509(i, -9820);
		if (class293 != null) {
			final int i_0_ = i >>> 16;
			Class293[] class293s = Class64_Sub13.aClass293ArrayArray3674[i_0_];
			if (class293s == null) {
				final Class293[] class293s_1_ = Class159.aClass293ArrayArray1252[i_0_];
				final int i_2_ = class293s_1_.length;
				class293s = Class64_Sub13.aClass293ArrayArray3674[i_0_] = new Class293[i_2_];
				Class236.method2892(class293s_1_, 0, class293s, 0,
						class293s_1_.length);
			}
			int i_3_;
			for (i_3_ = 0; i_3_ < class293s.length; i_3_++) {
				if (class293s[i_3_] == class293) {
					break;
				}
			}
			if (i_3_ < class293s.length) {
				Class236.method2892(class293s, i_3_ + 1, class293s, i_3_,
						class293s.length - i_3_ - 1);
				class293s[class293s.length - 1] = class293;
			}
		}
	}

	static final void method3143(final int i, final boolean bool) {
		/* empty */
	}

	static final void method3144(final Class98_Sub21 class98_sub21) {
		method3150(class98_sub21, 200000);
	}

	private static final void method3145(final int i) {
		final Class293 class293 = Class159.method2509(i, -9820);
		if (class293 != null) {
			final int i_4_ = i >>> 16;
			Class293[] class293s = Class64_Sub13.aClass293ArrayArray3674[i_4_];
			if (class293s == null) {
				final Class293[] class293s_5_ = Class159.aClass293ArrayArray1252[i_4_];
				final int i_6_ = class293s_5_.length;
				class293s = Class64_Sub13.aClass293ArrayArray3674[i_4_] = new Class293[i_6_];
				Class236.method2892(class293s_5_, 0, class293s, 0,
						class293s_5_.length);
			}
			int i_7_;
			for (i_7_ = 0; i_7_ < class293s.length; i_7_++) {
				if (class293s[i_7_] == class293) {
					break;
				}
			}
			if (i_7_ < class293s.length) {
				Class236.method2892(class293s, 0, class293s, 1, i_7_);
				class293s[0] = class293;
			}
		}
	}

	private static final int method3146(final char c) {
		if (Class184.method2627(376, c)) {
			return 1;
		}
		return 0;
	}

	static final void method3147() {
		/* empty */
	}

	private static final void method3148(int opcode, final boolean bool,
			final int scriptId) {
		if (opcode < 300) {
			if (opcode == 100) {
				anInt1885 -= 3;
				final int i_8_ = anIntArray1878[anInt1885];
				final int i_9_ = anIntArray1878[anInt1885 + 1];
				final int i_10_ = anIntArray1878[anInt1885 + 2];
				if (i_9_ == 0) {
					throw new RuntimeException();
				}
				final Class293 class293 = Class159.method2509(i_8_, -9820);
				if (class293.aClass293Array2339 == null) {
					class293.aClass293Array2339 = new Class293[i_10_ + 1];
				}
				if (class293.aClass293Array2339.length <= i_10_) {
					final Class293[] class293s = new Class293[i_10_ + 1];
					for (int i_11_ = 0; (i_11_ < class293.aClass293Array2339.length); i_11_++) {
						class293s[i_11_] = class293.aClass293Array2339[i_11_];
					}
					class293.aClass293Array2339 = class293s;
				}
				if (i_10_ > 0
						&& (class293.aClass293Array2339[i_10_ - 1] == null)) {
					throw new RuntimeException("Gap at:" + (i_10_ - 1));
				}
				final Class293 class293_12_ = new Class293();
				class293_12_.anInt2354 = i_9_;
				class293_12_.anInt2234 = class293_12_.anInt2248 = class293.anInt2248;
				class293_12_.anInt2300 = i_10_;
				class293.aClass293Array2339[i_10_] = class293_12_;
				if (bool) {
					aClass293_1877 = class293_12_;
				} else {
					aClass293_1879 = class293_12_;
				}
				Class341.method3812(class293);
				return;
			}
			if (opcode == 101) {
				final Class293 class293 = bool ? aClass293_1877
						: aClass293_1879;
				if (class293.anInt2300 == -1) {
					if (bool) {
						throw new RuntimeException(
								"Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException(
							"Tried to cc_delete static active-component!");
				}
				final Class293 class293_13_ = Class159.method2509(
						class293.anInt2248, -9820);
				class293_13_.aClass293Array2339[class293.anInt2300] = null;
				Class341.method3812(class293_13_);
				return;
			}
			if (opcode == 102) {
				try {
					final Class293 class293 = Class159.method2509(
							anIntArray1878[--anInt1885], -9820);
					class293.aClass293Array2339 = null;
					Class341.method3812(class293);
				} catch (final Exception e) {
				}
				return;
			}
			// Added opcode.
			if (opcode == 150) {
				anInt1885 -= 3;
				final int i_8_ = anIntArray1878[anInt1885];
				final int i_9_ = anIntArray1878[anInt1885 + 1];
				final int i_10_ = anIntArray1878[anInt1885 + 2];
				if (i_9_ == 0) {
					throw new RuntimeException();
				}
				final Class293 class293 = Class159.method2509(i_8_, -9820);
				if (class293.aClass293Array2339 == null) {
					class293.aClass293Array2339 = new Class293[i_10_ + 1];
				}
				if (class293.aClass293Array2339.length <= i_10_) {
					final Class293[] class293s = new Class293[i_10_ + 1];
					for (int i_11_ = 0; (i_11_ < class293.aClass293Array2339.length); i_11_++) {
						class293s[i_11_] = class293.aClass293Array2339[i_11_];
					}
					class293.aClass293Array2339 = class293s;
				}
				if (i_10_ > 0
						&& (class293.aClass293Array2339[i_10_ - 1] == null)) {
					throw new RuntimeException("Gap at:" + (i_10_ - 1));
				}
				final Class293 class293_12_ = new Class293();
				class293_12_.anInt2354 = i_9_;
				class293_12_.anInt2234 = class293_12_.anInt2248 = class293.anInt2248;
				class293_12_.anInt2300 = i_10_;
				class293.aClass293Array2339[i_10_] = class293_12_;
				if (bool) {
					aClass293_1877 = class293_12_;
				} else {
					aClass293_1879 = class293_12_;
				}
				Class341.method3812(class293);
				return;
			}
			// Added opcode.
			if (opcode == 151) {
				final Class293 class293 = bool ? aClass293_1877
						: aClass293_1879;
				if (class293.anInt2300 == -1) {
					if (bool) {
						throw new RuntimeException(
								"Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException(
							"Tried to cc_delete static active-component!");
				}
				final Class293 class293_13_ = Class159.method2509(
						class293.anInt2248, -9820);
				class293_13_.aClass293Array2339[class293.anInt2300] = null;
				Class341.method3812(class293_13_);
				return;
			}
			// Added opcode.
			if (opcode == 152) {
				final Class293 class293 = Class159.method2509(
						anIntArray1878[--anInt1885], -9820);
				class293.aClass293Array2339 = null;
				Class341.method3812(class293);
				return;
			}
			if (opcode == 200) {
				anInt1885 -= 2;
				final int i_14_ = anIntArray1878[anInt1885];
				final int i_15_ = anIntArray1878[anInt1885 + 1];
				final Class293 class293 = Class246_Sub9.method3139((byte) 72,
						i_14_, i_15_);
				if (class293 != null && i_15_ != -1) {
					anIntArray1878[anInt1885++] = 1;
					if (bool) {
						aClass293_1877 = class293;
					} else {
						aClass293_1879 = class293;
					}
				} else {
					anIntArray1878[anInt1885++] = 0;
					return;
				}
				return;
			}
			if (opcode == 201) {
				final int i_16_ = anIntArray1878[--anInt1885];
				final Class293 class293 = Class159.method2509(i_16_, -9820);
				if (class293 != null) {
					anIntArray1878[anInt1885++] = 1;
					if (bool) {
						aClass293_1877 = class293;
					} else {
						aClass293_1879 = class293;
					}
				} else {
					anIntArray1878[anInt1885++] = 0;
					return;
				}
				return;
			}
			if (opcode == 202) {
				final int i_17_ = anIntArray1878[--anInt1885];
				method3142(i_17_);
				return;
			}
			if (opcode == 203) {
				final int i_18_ = anIntArray1878[--anInt1885];
				method3145(i_18_);
				return;
			}
		} else if (opcode < 500) {
			if (opcode == 403) {
				anInt1885 -= 2;
				final int i_19_ = anIntArray1878[anInt1885];
				final int i_20_ = anIntArray1878[anInt1885 + 1];
				if (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518 != null) {
					for (int i_21_ = 0; i_21_ < Class304.anIntArray2538.length; i_21_++) {
						if (Class304.anIntArray2538[i_21_] == i_19_) {
							Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518
									.method3631(12, i_21_,
											Class149.aClass83_1205, i_20_);
							return;
						}
					}
					for (int i_22_ = 0; i_22_ < Class49.anIntArray414.length; i_22_++) {
						if (Class49.anIntArray414[i_22_] == i_19_) {
							Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518
									.method3631(12, i_22_,
											Class149.aClass83_1205, i_20_);
							break;
						}
					}
					return;
				}
				return;
			}
			if (opcode == 404) {
				anInt1885 -= 2;
				final int i_23_ = anIntArray1878[anInt1885];
				final int i_24_ = anIntArray1878[anInt1885 + 1];
				if (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518 != null) {
					Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518
							.method3632(i_24_, i_23_, -9);
					return;
				}
				return;
			}
			if (opcode == 410) {
				final boolean bool_25_ = anIntArray1878[--anInt1885] != 0;
				if (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518 != null) {
					Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518
							.method3635(bool_25_, false);
					return;
				}
				return;
			}
			if (opcode == 411) {
				anInt1885 -= 2;
				final int i_26_ = anIntArray1878[anInt1885];
				final int i_27_ = anIntArray1878[anInt1885 + 1];
				if (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518 != null) {
					Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518
							.method3634(i_27_, i_26_,
									Class98_Sub46_Sub19.aClass205_6068,
									1073741824);
					return;
				}
				return;
			}
		} else if (opcode >= 1000 && opcode < 1100 || opcode >= 2000
				&& opcode < 2100) {
			Class293 class293;
			if (opcode >= 2000) {
				opcode -= 1000;
				class293 = Class159.method2509(anIntArray1878[--anInt1885],
						-9820);
			} else {
				class293 = bool ? aClass293_1877 : aClass293_1879;
			}
			if (opcode == 1000) {
				anInt1885 -= 4;
				class293.anInt2283 = anIntArray1878[anInt1885];
				class293.anInt2229 = anIntArray1878[anInt1885 + 1];
				int i_28_ = anIntArray1878[anInt1885 + 2];
				if (i_28_ < 0) {
					i_28_ = 0;
				} else if (i_28_ > 5) {
					i_28_ = 5;
				}
				int i_29_ = anIntArray1878[anInt1885 + 3];
				if (i_29_ < 0) {
					i_29_ = 0;
				} else if (i_29_ > 5) {
					i_29_ = 5;
				}
				class293.aByte2240 = (byte) i_28_;
				class293.aByte2245 = (byte) i_29_;
				Class341.method3812(class293);
				Class98_Sub45.method1519(class293, true);
				if (class293.anInt2300 == -1) {
					Class224_Sub2_Sub1.method2838(11, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1001) {
				anInt1885 -= 4;
				class293.anInt2235 = anIntArray1878[anInt1885];
				class293.anInt2242 = anIntArray1878[anInt1885 + 1];
				class293.anInt2232 = 0;
				class293.anInt2226 = 0;
				int i_30_ = anIntArray1878[anInt1885 + 2];
				if (i_30_ < 0) {
					i_30_ = 0;
				} else if (i_30_ > 4) {
					i_30_ = 4;
				}
				int i_31_ = anIntArray1878[anInt1885 + 3];
				if (i_31_ < 0) {
					i_31_ = 0;
				} else if (i_31_ > 4) {
					i_31_ = 4;
				}
				class293.aByte2243 = (byte) i_30_;
				class293.aByte2207 = (byte) i_31_;
				Class341.method3812(class293);
				Class98_Sub45.method1519(class293, true);
				if (class293.anInt2354 == 0) {
					Class63.method549(class293, false, (byte) 118);
				}
				return;
			}
			if (opcode == 1003) {
				final boolean bool_32_ = anIntArray1878[--anInt1885] == 1;
				if (class293.aBoolean2295 != bool_32_) {
					class293.aBoolean2295 = bool_32_;
					Class341.method3812(class293);
				}
				if (class293.anInt2300 == -1) {
					Class98_Sub10_Sub18.method1056((byte) 97,
							(class293.anInt2248));
				}
				return;
			}
			if (opcode == 1004) {
				anInt1885 -= 2;
				class293.anInt2321 = anIntArray1878[anInt1885];
				class293.anInt2338 = anIntArray1878[anInt1885 + 1];
				Class341.method3812(class293);
				Class98_Sub45.method1519(class293, true);
				if (class293.anInt2354 == 0) {
					Class63.method549(class293, false, (byte) -112);
				}
				return;
			}
			if (opcode == 1005) {
				class293.aBoolean2286 = anIntArray1878[--anInt1885] == 1;
				return;
			}
		} else if (opcode >= 1100 && opcode < 1200 || opcode >= 2100
				&& opcode < 2200) {
			Class293 class293;
			if (opcode >= 2000) {
				opcode -= 1000;
				class293 = Class159.method2509(anIntArray1878[--anInt1885],
						-9820);
			} else {
				class293 = bool ? aClass293_1877 : aClass293_1879;
			}
			if (opcode == 1100) {
				anInt1885 -= 2;
				class293.anInt2246 = anIntArray1878[anInt1885];
				if (class293.anInt2246 > (class293.anInt2290 - class293.anInt2311)) {
					class293.anInt2246 = (class293.anInt2290 - class293.anInt2311);
				}
				if (class293.anInt2246 < 0) {
					class293.anInt2246 = 0;
				}
				class293.anInt2213 = anIntArray1878[anInt1885 + 1];
				if (class293.anInt2213 > (class293.anInt2228 - class293.anInt2258)) {
					class293.anInt2213 = (class293.anInt2228 - class293.anInt2258);
				}
				if (class293.anInt2213 < 0) {
					class293.anInt2213 = 0;
				}
				Class341.method3812(class293);
				if (class293.anInt2300 == -1) {
					Class21_Sub4.method279(16953, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1101) {
				class293.anInt2236 = anIntArray1878[--anInt1885];
				Class341.method3812(class293);
				if (class293.anInt2300 == -1) {
					Class98_Sub16.method1147(124, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1102) {
				class293.aBoolean2263 = anIntArray1878[--anInt1885] == 1;
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1103) {
				class293.anInt2285 = anIntArray1878[--anInt1885];
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1104) {
				class293.anInt2293 = anIntArray1878[--anInt1885];
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1105) {
				final int i_33_ = anIntArray1878[--anInt1885];
				if (class293.anInt2237 != i_33_) {
					class293.anInt2237 = i_33_;
					Class341.method3812(class293);
				}
				if (class293.anInt2300 == -1) {
					Class77.method778(44, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1106) {
				class293.anInt2255 = anIntArray1878[--anInt1885];
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1107) {
				class293.aBoolean2288 = anIntArray1878[--anInt1885] == 1;
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1108) {
				class293.anInt2233 = 1;
				class293.anInt2343 = anIntArray1878[--anInt1885];
				Class341.method3812(class293);
				if (class293.anInt2300 == -1) {
					AnimationDefParser.method2625(false, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1109) {
				anInt1885 -= 6;
				class293.anInt2268 = anIntArray1878[anInt1885];
				class293.anInt2273 = anIntArray1878[anInt1885 + 1];
				class293.anInt2310 = anIntArray1878[anInt1885 + 2];
				class293.anInt2218 = anIntArray1878[anInt1885 + 3];
				class293.anInt2346 = anIntArray1878[anInt1885 + 4];
				class293.anInt2251 = anIntArray1878[anInt1885 + 5];
				Class341.method3812(class293);
				if (class293.anInt2300 == -1) {
					Class290.method3413(0, class293.anInt2248);
					Class185.method2631(10, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1110) {
				final int i_34_ = anIntArray1878[--anInt1885];
				if (class293.anInt2208 != i_34_) {
					class293.anInt2208 = i_34_;
					class293.anInt2303 = 0;
					class293.anInt2287 = 1;
					class293.anInt2312 = 0;
					final AnimationDefinition class97 = (class293.anInt2208 == -1 ? null
							: (Class151_Sub7.aClass183_5001.method2623(
									class293.anInt2208, 16383)));
					if (class97 != null) {
						Class280.method3327(class293.anInt2303, class97,
								(byte) 74);
					}
					Class341.method3812(class293);
				}
				if (class293.anInt2300 == -1) {
					Class119_Sub3.method2185(5, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1111) {
				class293.aBoolean2265 = anIntArray1878[--anInt1885] == 1;
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1112) {
				final String string = aStringArray1883[--anInt1884];
				if (!string.equals(class293.aString2225)) {
					class293.aString2225 = string;
					Class341.method3812(class293);
				}
				if (class293.anInt2300 == -1) {
					Class286.method3380(3, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1113) {
				class293.anInt2264 = anIntArray1878[--anInt1885];
				Class341.method3812(class293);
				if (class293.anInt2300 == -1) {
					Class40.method361(class293.anInt2248, 0);
				}
				return;
			}
			if (opcode == 1114) {
				anInt1885 -= 3;
				class293.anInt2341 = anIntArray1878[anInt1885];
				class293.anInt2296 = anIntArray1878[anInt1885 + 1];
				class293.anInt2244 = anIntArray1878[anInt1885 + 2];
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1115) {
				class293.aBoolean2315 = anIntArray1878[--anInt1885] == 1;
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1116) {
				class293.anInt2304 = anIntArray1878[--anInt1885];
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1117) {
				class293.anInt2355 = anIntArray1878[--anInt1885];
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1118) {
				class293.aBoolean2327 = anIntArray1878[--anInt1885] == 1;
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1119) {
				class293.aBoolean2281 = anIntArray1878[--anInt1885] == 1;
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1120) {
				anInt1885 -= 2;
				class293.anInt2290 = anIntArray1878[anInt1885];
				class293.anInt2228 = anIntArray1878[anInt1885 + 1];
				Class341.method3812(class293);
				if (class293.anInt2354 == 0) {
					Class63.method549(class293, false, (byte) 60);
				}
				return;
			}
			if (opcode == 1122) {
				class293.aBoolean2279 = anIntArray1878[--anInt1885] == 1;
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1123) {
				class293.anInt2251 = anIntArray1878[--anInt1885];
				Class341.method3812(class293);
				if (class293.anInt2300 == -1) {
					Class290.method3413(0, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1124) {
				final int i_35_ = anIntArray1878[--anInt1885];
				class293.aBoolean2256 = i_35_ == 1;
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1125) {
				anInt1885 -= 2;
				class293.anInt2336 = anIntArray1878[anInt1885];
				class293.anInt2344 = anIntArray1878[anInt1885 + 1];
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1126) {
				class293.anInt2350 = anIntArray1878[--anInt1885];
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1127) {
				anInt1885 -= 2;
				final int i_36_ = anIntArray1878[anInt1885];
				final int i_37_ = anIntArray1878[anInt1885 + 1];
				final Class149 class149 = Class98_Sub43_Sub1.aClass365_5897
						.method3940((byte) 31, i_36_);
				if (i_37_ != class149.anInt1202) {
					class293.method3455(i_36_, i_37_, 16);
				} else {
					class293.method3459((byte) 54, i_36_);
					return;
				}
				return;
			}
			if (opcode == 1128) {
				final int i_38_ = anIntArray1878[--anInt1885];
				final String string = aStringArray1883[--anInt1884];
				final Class149 class149 = Class98_Sub43_Sub1.aClass365_5897
						.method3940((byte) 31, i_38_);
				if (!class149.aString1203.equals(string)) {
					class293.method3458(string, 16, i_38_);
				} else {
					class293.method3459((byte) 101, i_38_);
					return;
				}
				return;
			}
			if (opcode == 1129 || opcode == 1130) {
				final int i_39_ = anIntArray1878[--anInt1885];
				if ((class293.anInt2354 == 5 || opcode != 1129)
						&& (class293.anInt2354 == 4 || opcode != 1130)) {
					if (class293.anInt2211 != i_39_) {
						class293.anInt2211 = i_39_;
						Class341.method3812(class293);
					}
					if (class293.anInt2300 == -1) {
						PacketParser.method3969(121, class293.anInt2248);
					}
					return;
				}
				return;
			}
		} else if (opcode >= 1200 && opcode < 1300 || opcode >= 2200
				&& opcode < 2300) {
			Class293 class293;
			if (opcode >= 2000) {
				opcode -= 1000;
				class293 = Class159.method2509(anIntArray1878[--anInt1885],
						-9820);
			} else {
				class293 = bool ? aClass293_1877 : aClass293_1879;
			}
			Class341.method3812(class293);
			if (opcode == 1200 || opcode == 1205 || opcode == 1208
					|| opcode == 1209 || opcode == 1212 || opcode == 1213) {
				anInt1885 -= 2;
				final int i_40_ = anIntArray1878[anInt1885];
				final int i_41_ = anIntArray1878[anInt1885 + 1];
				if (class293.anInt2300 == -1) {
					Class21_Sub2.method274((byte) 83, class293.anInt2248);
					Class290.method3413(0, class293.anInt2248);
					Class185.method2631(10, class293.anInt2248);
				}
				if (i_40_ == -1) {
					class293.anInt2233 = 1;
					class293.anInt2343 = -1;
					class293.anInt2302 = -1;
				} else {
					class293.anInt2302 = i_40_;
					class293.anInt2349 = i_41_;
					if (opcode == 1208 || opcode == 1209) {
						class293.aBoolean2262 = true;
					} else {
						class293.aBoolean2262 = false;
					}
					final ItemDefs class297 = Class98_Sub46_Sub19.aClass205_6068
							.method2714(i_40_, (byte) -120);
					class293.anInt2310 = class297.anInt2416;
					class293.anInt2218 = class297.anInt2476;
					class293.anInt2346 = class297.anInt2441;
					class293.anInt2268 = class297.anInt2437;
					class293.anInt2273 = class297.anInt2447;
					class293.anInt2251 = class297.anInt2465;
					if (opcode == 1205 || opcode == 1209) {
						class293.anInt2305 = 0;
					} else if (opcode == 1212 || opcode == 1213) {
						class293.anInt2305 = 1;
					} else {
						class293.anInt2305 = 2;
					}
					if (class293.anInt2232 > 0) {
						class293.anInt2251 = (class293.anInt2251 * 32 / class293.anInt2232);
					} else {
						if (class293.anInt2235 > 0) {
							class293.anInt2251 = (class293.anInt2251 * 32 / class293.anInt2235);
						}
						return;
					}
					return;
				}
				return;
			}
			if (opcode == 1201) {
				class293.anInt2233 = 2;
				class293.anInt2343 = anIntArray1878[--anInt1885];
				if (class293.anInt2300 == -1) {
					AnimationDefParser.method2625(false, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1202) {
				class293.anInt2233 = 3;
				class293.anInt2343 = -1;
				if (class293.anInt2300 == -1) {
					AnimationDefParser.method2625(false, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1203) {
				class293.anInt2233 = 6;
				class293.anInt2343 = anIntArray1878[--anInt1885];
				if (class293.anInt2300 == -1) {
					AnimationDefParser.method2625(false, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1204) {
				class293.anInt2233 = 5;
				class293.anInt2343 = anIntArray1878[--anInt1885];
				if (class293.anInt2300 == -1) {
					AnimationDefParser.method2625(false, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1206) {
				anInt1885 -= 4;
				class293.anInt2267 = anIntArray1878[anInt1885];
				class293.anInt2306 = anIntArray1878[anInt1885 + 1];
				class293.anInt2260 = anIntArray1878[anInt1885 + 2];
				class293.anInt2334 = anIntArray1878[anInt1885 + 3];
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1207) {
				anInt1885 -= 2;
				class293.anInt2216 = anIntArray1878[anInt1885];
				class293.anInt2261 = anIntArray1878[anInt1885 + 1];
				Class341.method3812(class293);
				return;
			}
			if (opcode == 1210) {
				anInt1885 -= 4;
				class293.anInt2343 = anIntArray1878[anInt1885];
				class293.anInt2210 = anIntArray1878[anInt1885 + 1];
				if (anIntArray1878[anInt1885 + 2] == 1) {
					class293.anInt2233 = 9;
				} else {
					class293.anInt2233 = 8;
				}
				if (anIntArray1878[anInt1885 + 3] == 1) {
					class293.aBoolean2262 = true;
				} else {
					class293.aBoolean2262 = false;
				}
				if (class293.anInt2300 == -1) {
					AnimationDefParser.method2625(false, class293.anInt2248);
				}
				return;
			}
			if (opcode == 1211) {
				class293.anInt2233 = 5;
				class293.anInt2343 = za_Sub2.anInt6080;
				class293.anInt2210 = 0;
				if (class293.anInt2300 == -1) {
					AnimationDefParser.method2625(false, class293.anInt2248);
				}
				return;
			}
		} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300
				&& opcode < 2400) {
			Class293 class293;
			if (opcode >= 2000) {
				opcode -= 1000;
				class293 = Class159.method2509(anIntArray1878[--anInt1885],
						-9820);
			} else {
				class293 = bool ? aClass293_1877 : aClass293_1879;
			}
			if (opcode == 1300) {
				final int i_42_ = anIntArray1878[--anInt1885] - 1;
				if (i_42_ < 0 || i_42_ > 9) {
					anInt1884--;
				} else {
					class293.method3468(aStringArray1883[--anInt1884], i_42_, 1);
					return;
				}
				return;
			}
			if (opcode == 1301) {
				anInt1885 -= 2;
				final int i_43_ = anIntArray1878[anInt1885];
				final int i_44_ = anIntArray1878[anInt1885 + 1];
				if (i_43_ == -1 && i_44_ == -1) {
					class293.aClass293_2219 = null;
				} else {
					class293.aClass293_2219 = Class246_Sub9.method3139(
							(byte) 72, i_43_, i_44_);
					return;
				}
				return;
			}
			if (opcode == 1302) {
				final int i_45_ = anIntArray1878[--anInt1885];
				if (i_45_ == Class369.anInt3129 || i_45_ == Class253.anInt1929
						|| i_45_ == Class36.anInt350) {
					class293.anInt2289 = i_45_;
					return;
				}
				return;
			}
			if (opcode == 1303) {
				class293.anInt2308 = anIntArray1878[--anInt1885];
				return;
			}
			if (opcode == 1304) {
				class293.anInt2353 = anIntArray1878[--anInt1885];
				return;
			}
			if (opcode == 1305) {
				class293.aString2224 = aStringArray1883[--anInt1884];
				return;
			}
			if (opcode == 1306) {
				class293.aString2214 = aStringArray1883[--anInt1884];
				return;
			}
			if (opcode == 1307) {
				class293.aStringArray2351 = null;
				return;
			}
			if (opcode == 1308) {
				class293.anInt2318 = anIntArray1878[--anInt1885];
				class293.anInt2309 = anIntArray1878[--anInt1885];
				return;
			}
			if (opcode == 1309) {
				final int i_46_ = anIntArray1878[--anInt1885];
				final int i_47_ = anIntArray1878[--anInt1885];
				if (i_47_ >= 1 && i_47_ <= 10) {
					class293.method3474(-17972, i_47_ - 1, i_46_);
				}
				return;
			}
			if (opcode == 1310) {
				class293.aString2333 = aStringArray1883[--anInt1884];
				return;
			}
			if (opcode == 1311) {
				class293.anInt2254 = anIntArray1878[--anInt1885];
				return;
			}
			if (opcode == 1312 || opcode == 1313) {
				int i_48_;
				int i_49_;
				int i_50_;
				if (opcode == 1312) {
					anInt1885 -= 3;
					i_48_ = anIntArray1878[anInt1885] - 1;
					i_49_ = anIntArray1878[anInt1885 + 1];
					i_50_ = anIntArray1878[anInt1885 + 2];
					if (i_48_ < 0 || i_48_ > 9) {
						throw new RuntimeException("IOR13121313");
					}
				} else {
					anInt1885 -= 2;
					i_48_ = 10;
					i_49_ = anIntArray1878[anInt1885];
					i_50_ = anIntArray1878[anInt1885 + 1];
				}
				if (class293.aByteArray2345 == null) {
					if (i_49_ != 0) {
						class293.aByteArray2345 = new byte[11];
						class293.aByteArray2331 = new byte[11];
						class293.anIntArray2275 = new int[11];
					} else {
						return;
					}
				}
				class293.aByteArray2345[i_48_] = (byte) i_49_;
				if (i_49_ != 0) {
					class293.aBoolean2222 = true;
				} else {
					class293.aBoolean2222 = false;
					for (int i_51_ = 0; i_51_ < class293.aByteArray2345.length; i_51_++) {
						if (class293.aByteArray2345[i_51_] != 0) {
							class293.aBoolean2222 = true;
							break;
						}
					}
				}
				class293.aByteArray2331[i_48_] = (byte) i_50_;
				return;
			}
			if (opcode == 1314) {
				class293.anInt2317 = anIntArray1878[--anInt1885];
				return;
			}
		} else {
			if (opcode >= 1400 && opcode < 1500 || opcode >= 2400
					&& opcode < 2500) {
				Class293 class293;
				if (opcode >= 2000) {
					opcode -= 1000;
					class293 = Class159.method2509(anIntArray1878[--anInt1885],
							-9820);
				} else {
					class293 = bool ? aClass293_1877 : aClass293_1879;
				}
				if (opcode == 1499) {
					class293.method3465(-1);
				} else {
					String string = aStringArray1883[--anInt1884];
					int[] is = null;
					if (string.length() > 0
							&& string.charAt(string.length() - 1) == 'Y') {
						int i_52_ = anIntArray1878[--anInt1885];
						if (i_52_ > 0) {
							is = new int[i_52_];
							while (i_52_-- > 0) {
								is[i_52_] = anIntArray1878[--anInt1885];
							}
						}
						string = string.substring(0, string.length() - 1);
					}
					Object[] objects = new Object[string.length() + 1];
					for (int i_53_ = objects.length - 1; i_53_ >= 1; i_53_--) {
						if (string.charAt(i_53_ - 1) == 's') {
							objects[i_53_] = aStringArray1883[--anInt1884];
						} else {
							objects[i_53_] = new Integer(
									anIntArray1878[--anInt1885]);
						}
					}
					final int i_54_ = anIntArray1878[--anInt1885];
					if (i_54_ != -1) {
						objects[0] = new Integer(i_54_);
					} else {
						objects = null;
					}
					if (opcode == 1400) {
						class293.anObjectArray2291 = objects;
					} else if (opcode == 1401) {
						class293.anObjectArray2230 = objects;
					} else if (opcode == 1402) {
						class293.anObjectArray2356 = objects;
					} else if (opcode == 1403) {
						class293.anObjectArray2227 = objects;
					} else if (opcode == 1404) {
						class293.anObjectArray2272 = objects;
					} else if (opcode == 1405) {
						class293.anObjectArray2316 = objects;
					} else if (opcode == 1406) {
						class293.anObjectArray2324 = objects;
					} else if (opcode == 1407) {
						class293.anObjectArray2269 = objects;
						class293.anIntArray2284 = is;
					} else if (opcode == 1408) {
						class293.anObjectArray2270 = objects;
					} else if (opcode == 1409) {
						class293.anObjectArray2329 = objects;
					} else if (opcode == 1410) {
						class293.anObjectArray2313 = objects;
					} else if (opcode == 1411) {
						class293.anObjectArray2335 = objects;
					} else if (opcode == 1412) {
						class293.anObjectArray2314 = objects;
					} else if (opcode == 1414) {
						class293.anObjectArray2252 = objects;
						class293.anIntArray2249 = is;
					} else if (opcode == 1415) {
						class293.anObjectArray2278 = objects;
						class293.anIntArray2271 = is;
					} else if (opcode == 1416) {
						class293.anObjectArray2257 = objects;
					} else if (opcode == 1417) {
						class293.anObjectArray2277 = objects;
					} else if (opcode == 1418) {
						class293.anObjectArray2239 = objects;
					} else if (opcode == 1419) {
						class293.anObjectArray2274 = objects;
					} else if (opcode == 1420) {
						class293.anObjectArray2215 = objects;
					} else if (opcode == 1421) {
						class293.anObjectArray2292 = objects;
					} else if (opcode == 1422) {
						class293.anObjectArray2340 = objects;
					} else if (opcode == 1423) {
						class293.anObjectArray2330 = objects;
					} else if (opcode == 1424) {
						class293.anObjectArray2319 = objects;
					} else if (opcode == 1425) {
						class293.anObjectArray2294 = objects;
					} else if (opcode == 1426) {
						class293.anObjectArray2220 = objects;
					} else if (opcode == 1427) {
						class293.anObjectArray2266 = objects;
					} else if (opcode == 1428) {
						class293.anObjectArray2212 = objects;
						class293.anIntArray2297 = is;
					} else if (opcode == 1429) {
						class293.anObjectArray2320 = objects;
						class293.anIntArray2342 = is;
					} else if (opcode == 1430) {
						class293.anObjectArray2253 = objects;
					}
					class293.aBoolean2209 = true;
					return;
				}
				return;
			}
			if (opcode < 1600) {
				final Class293 class293 = bool ? aClass293_1877
						: aClass293_1879;
				if (opcode == 1500) {
					anIntArray1878[anInt1885++] = class293.anInt2347;
					return;
				}
				if (opcode == 1501) {
					anIntArray1878[anInt1885++] = class293.anInt2299;
					return;
				}
				if (opcode == 1502) {
					anIntArray1878[anInt1885++] = class293.anInt2311;
					return;
				}
				if (opcode == 1503) {
					anIntArray1878[anInt1885++] = class293.anInt2258;
					return;
				}
				if (opcode == 1504) {
					anIntArray1878[anInt1885++] = class293.aBoolean2295 ? 1 : 0;
					return;
				}
				if (opcode == 1505) {
					anIntArray1878[anInt1885++] = class293.anInt2234;
					return;
				}
				if (opcode == 1506) {
					final Class293 class293_55_ = Class360.method3910(true,
							class293);
					anIntArray1878[anInt1885++] = (class293_55_ == null ? -1
							: class293_55_.anInt2248);
					return;
				}
			} else if (opcode < 1700) {
				final Class293 class293 = bool ? aClass293_1877
						: aClass293_1879;
				if (opcode == 1600) {
					anIntArray1878[anInt1885++] = class293.anInt2246;
					return;
				}
				if (opcode == 1601) {
					anIntArray1878[anInt1885++] = class293.anInt2213;
					return;
				}
				if (opcode == 1602) {
					aStringArray1883[anInt1884++] = class293.aString2225;
					return;
				}
				if (opcode == 1603) {
					anIntArray1878[anInt1885++] = class293.anInt2290;
					return;
				}
				if (opcode == 1604) {
					anIntArray1878[anInt1885++] = class293.anInt2228;
					return;
				}
				if (opcode == 1605) {
					anIntArray1878[anInt1885++] = class293.anInt2251;
					return;
				}
				if (opcode == 1606) {
					anIntArray1878[anInt1885++] = class293.anInt2310;
					return;
				}
				if (opcode == 1607) {
					anIntArray1878[anInt1885++] = class293.anInt2346;
					return;
				}
				if (opcode == 1608) {
					anIntArray1878[anInt1885++] = class293.anInt2218;
					return;
				}
				if (opcode == 1609) {
					anIntArray1878[anInt1885++] = class293.anInt2285;
					return;
				}
				if (opcode == 1610) {
					anIntArray1878[anInt1885++] = class293.anInt2268;
					return;
				}
				if (opcode == 1611) {
					anIntArray1878[anInt1885++] = class293.anInt2273;
					return;
				}
				if (opcode == 1612) {
					anIntArray1878[anInt1885++] = class293.anInt2237;
					return;
				}
				if (opcode == 1613) {
					final int i_56_ = anIntArray1878[--anInt1885];
					final Class149 class149 = Class98_Sub43_Sub1.aClass365_5897
							.method3940((byte) 31, i_56_);
					if (class149.method2433(false)) {
						aStringArray1883[anInt1884++] = class293.method3463(
								i_56_, 700, (class149.aString1203));
					} else {
						anIntArray1878[anInt1885++] = class293.method3472(
								22241, (class149.anInt1202), i_56_);
						return;
					}
					return;
				}
				if (opcode == 1614) {
					anIntArray1878[anInt1885++] = class293.anInt2255;
					return;
				}
				if (opcode == 2614) {
					anIntArray1878[anInt1885++] = (class293.anInt2233 == 1 ? class293.anInt2343
							: -1);
					return;
				}
			} else if (opcode < 1800) {
				final Class293 class293 = bool ? aClass293_1877
						: aClass293_1879;
				if (opcode == 1700) {
					anIntArray1878[anInt1885++] = class293.anInt2302;
					return;
				}
				if (opcode == 1701) {
					if (class293.anInt2302 != -1) {
						anIntArray1878[anInt1885++] = class293.anInt2349;
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 1702) {
					anIntArray1878[anInt1885++] = class293.anInt2300;
					return;
				}
			} else if (opcode < 1900) {
				final Class293 class293 = bool ? aClass293_1877
						: aClass293_1879;
				if (opcode == 1800) {
					anIntArray1878[anInt1885++] = client.method116(class293)
							.method1668(-1);
					return;
				}
				if (opcode == 1801) {
					int i_57_ = anIntArray1878[--anInt1885];
					i_57_--;
					if (class293.aStringArray2351 == null
							|| (i_57_ >= class293.aStringArray2351.length)
							|| (class293.aStringArray2351[i_57_] == null)) {
						aStringArray1883[anInt1884++] = "";
					} else {
						aStringArray1883[anInt1884++] = class293.aStringArray2351[i_57_];
						return;
					}
					return;
				}
				if (opcode == 1802) {
					if (class293.aString2224 == null) {
						aStringArray1883[anInt1884++] = "";
					} else {
						aStringArray1883[anInt1884++] = class293.aString2224;
						return;
					}
					return;
				}
			} else if (opcode < 2000 || opcode >= 2900 && opcode < 3000) {
				Class293 class293;
				if (opcode >= 2000) {
					class293 = Class159.method2509(anIntArray1878[--anInt1885],
							-9820);
					opcode -= 1000;
				} else {
					class293 = bool ? aClass293_1877 : aClass293_1879;
				}
				if (anInt1893 >= 10) {
					throw new RuntimeException("C29xx-1");
				}
				if (opcode == 1927) {
					if (class293.anObjectArray2266 != null) {
						final Class98_Sub21 class98_sub21 = new Class98_Sub21();
						class98_sub21.aClass293_3986 = class293;
						class98_sub21.anObjectArray3981 = class293.anObjectArray2266;
						class98_sub21.anInt3990 = anInt1893 + 1;
						Class151_Sub3.aClass148_4977.method2419(class98_sub21,
								-20911);
						return;
					}
					return;
				}
			} else if (opcode < 2600) {
				final Class293 class293 = Class159.method2509(
						anIntArray1878[--anInt1885], -9820);
				if (opcode == 2500) {
					anIntArray1878[anInt1885++] = class293.anInt2347;
					return;
				}
				if (opcode == 2501) {
					anIntArray1878[anInt1885++] = class293.anInt2299;
					return;
				}
				if (opcode == 2502) {
					anIntArray1878[anInt1885++] = class293.anInt2311;
					return;
				}
				if (opcode == 2503) {
					anIntArray1878[anInt1885++] = class293.anInt2258;
					return;
				}
				if (opcode == 2504) {
					anIntArray1878[anInt1885++] = class293.aBoolean2295 ? 1 : 0;
					return;
				}
				if (opcode == 2505) {
					anIntArray1878[anInt1885++] = class293.anInt2234;
					return;
				}
				if (opcode == 1506) {
					final Class293 class293_58_ = Class360.method3910(true,
							class293);
					anIntArray1878[anInt1885++] = (class293_58_ == null ? -1
							: class293_58_.anInt2248);
					return;
				}
			} else if (opcode < 2700) {
				final Class293 class293 = Class159.method2509(
						anIntArray1878[--anInt1885], -9820);
				if (opcode == 2600) {
					anIntArray1878[anInt1885++] = class293.anInt2246;
					return;
				}
				if (opcode == 2601) {
					anIntArray1878[anInt1885++] = class293.anInt2213;
					return;
				}
				if (opcode == 2602) {
					aStringArray1883[anInt1884++] = class293.aString2225;
					return;
				}
				if (opcode == 2603) {
					anIntArray1878[anInt1885++] = class293.anInt2290;
					return;
				}
				if (opcode == 2604) {
					anIntArray1878[anInt1885++] = class293.anInt2228;
					return;
				}
				if (opcode == 2605) {
					anIntArray1878[anInt1885++] = class293.anInt2251;
					return;
				}
				if (opcode == 2606) {
					anIntArray1878[anInt1885++] = class293.anInt2310;
					return;
				}
				if (opcode == 2607) {
					anIntArray1878[anInt1885++] = class293.anInt2346;
					return;
				}
				if (opcode == 2608) {
					anIntArray1878[anInt1885++] = class293.anInt2218;
					return;
				}
				if (opcode == 2609) {
					anIntArray1878[anInt1885++] = class293.anInt2285;
					return;
				}
				if (opcode == 2610) {
					anIntArray1878[anInt1885++] = class293.anInt2268;
					return;
				}
				if (opcode == 2611) {
					anIntArray1878[anInt1885++] = class293.anInt2273;
					return;
				}
				if (opcode == 2612) {
					anIntArray1878[anInt1885++] = class293.anInt2237;
					return;
				}
				if (opcode == 2613) {
					anIntArray1878[anInt1885++] = class293.anInt2255;
					return;
				}
				if (opcode == 2614) {
					anIntArray1878[anInt1885++] = (class293.anInt2233 == 1 ? class293.anInt2343
							: -1);
					return;
				}
			} else if (opcode < 2800) {
				if (opcode == 2700) {
					final Class293 class293 = Class159.method2509(
							anIntArray1878[--anInt1885], -9820);
					anIntArray1878[anInt1885++] = class293.anInt2302;
					return;
				}
				if (opcode == 2701) {
					final Class293 class293 = Class159.method2509(
							anIntArray1878[--anInt1885], -9820);
					if (class293.anInt2302 != -1) {
						anIntArray1878[anInt1885++] = class293.anInt2349;
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 2702) {
					final int i_59_ = anIntArray1878[--anInt1885];
					final Class98_Sub18 class98_sub18 = ((Class98_Sub18) Class116.aClass377_964
							.method3990(i_59_, -1));
					if (class98_sub18 != null) {
						anIntArray1878[anInt1885++] = 1;
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 2703) {
					final Class293 class293 = Class159.method2509(
							anIntArray1878[--anInt1885], -9820);
					if (class293.aClass293Array2339 == null) {
						anIntArray1878[anInt1885++] = 0;
					} else {
						int i_60_ = class293.aClass293Array2339.length;
						for (int i_61_ = 0; i_61_ < (class293.aClass293Array2339).length; i_61_++) {
							if (class293.aClass293Array2339[i_61_] == null) {
								i_60_ = i_61_;
								break;
							}
						}
						anIntArray1878[anInt1885++] = i_60_;
						return;
					}
					return;
				}
				if (opcode == 2704 || opcode == 2705) {
					anInt1885 -= 2;
					final int i_62_ = anIntArray1878[anInt1885];
					final int i_63_ = anIntArray1878[anInt1885 + 1];
					final Class98_Sub18 class98_sub18 = ((Class98_Sub18) Class116.aClass377_964
							.method3990(i_62_, -1));
					if (class98_sub18 != null
							&& class98_sub18.anInt3945 == i_63_) {
						anIntArray1878[anInt1885++] = 1;
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
			} else if (opcode < 2900) {
				final Class293 class293 = Class159.method2509(
						anIntArray1878[--anInt1885], -9820);
				if (opcode == 2800) {
					anIntArray1878[anInt1885++] = client.method116(class293)
							.method1668(-1);
					return;
				}
				if (opcode == 2801) {
					int i_64_ = anIntArray1878[--anInt1885];
					i_64_--;
					if (class293.aStringArray2351 == null
							|| (i_64_ >= class293.aStringArray2351.length)
							|| (class293.aStringArray2351[i_64_] == null)) {
						aStringArray1883[anInt1884++] = "";
					} else {
						aStringArray1883[anInt1884++] = class293.aStringArray2351[i_64_];
						return;
					}
					return;
				}
				if (opcode == 2802) {
					if (class293.aString2224 == null) {
						aStringArray1883[anInt1884++] = "";
					} else {
						aStringArray1883[anInt1884++] = class293.aString2224;
						return;
					}
					return;
				}
			} else if (opcode < 3200) {
				if (opcode == 3100) {
					final String string = aStringArray1883[--anInt1884];
					Class84.method832(string, (byte) 108);
					return;
				}
				if (opcode == 3101) {
					anInt1885 -= 2;
					Class194.method2657(
							(Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660),
							(byte) 114, anIntArray1878[anInt1885 + 1],
							anIntArray1878[anInt1885]);
					return;
				}
				if (opcode == 3103) {
					Class246_Sub3_Sub5_Sub1.method3092(-1, true);
					return;
				}
				if (opcode == 3104) {
					final String string = aStringArray1883[--anInt1884];
					int i_65_ = 0;
					if (Class77_Sub1.method781((byte) 53, string)) {
						i_65_ = PacketSender.method3607(-126, string);
					}
					final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
							.method3023(260,
									(Class246_Sub3_Sub5.aClass171_6164),
									(Class331.aClass117_2811));
					class98_sub11.aClass98_Sub22_Sub1_3865.writeInt(1571862888,
							i_65_);
					Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					return;
				}
				if (opcode == 3105) {
					final String string = aStringArray1883[--anInt1884];
					final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
							.method3023(260,
									(Class284_Sub1_Sub2.aClass171_6191),
									(Class331.aClass117_2811));
					class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
							string.length() + 1, -61);
					class98_sub11.aClass98_Sub22_Sub1_3865.method1188(string,
							(byte) 113);
					Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					return;
				}
				if (opcode == 3106) {
					final String string = aStringArray1883[--anInt1884];
					final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
							.method3023(260, (Class199.aClass171_1533),
									(Class331.aClass117_2811));
					class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
							string.length() + 1, -58);
					class98_sub11.aClass98_Sub22_Sub1_3865.method1188(string,
							(byte) 113);
					Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					return;
				}
				if (opcode == 3107) {
					final int i_66_ = anIntArray1878[--anInt1885];
					final String string = aStringArray1883[--anInt1884];
					Class314.method3639(i_66_, string, false);
					return;
				}
				if (opcode == 3108) {
					anInt1885 -= 3;
					final int i_67_ = anIntArray1878[anInt1885];
					final int i_68_ = anIntArray1878[anInt1885 + 1];
					final int i_69_ = anIntArray1878[anInt1885 + 2];
					final Class293 class293 = Class159.method2509(i_69_, -9820);
					Class146_Sub3
							.method2405(class293, (byte) 103, i_67_, i_68_);
					return;
				}
				if (opcode == 3109) {
					anInt1885 -= 2;
					final int i_70_ = anIntArray1878[anInt1885];
					final int i_71_ = anIntArray1878[anInt1885 + 1];
					final Class293 class293 = bool ? aClass293_1877
							: aClass293_1879;
					Class146_Sub3
							.method2405(class293, (byte) 118, i_70_, i_71_);
					return;
				}
				if (opcode == 3110) {
					final int i_72_ = anIntArray1878[--anInt1885];
					final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
							.method3023(260, (Class150.aClass171_1209),
									(Class331.aClass117_2811));
					class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(i_72_,
							1571862888);
					Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					return;
				}
				if (opcode == 3111) {
					anInt1885 -= 2;
					final int i_73_ = anIntArray1878[anInt1885];
					final int i_74_ = anIntArray1878[anInt1885 + 1];
					final Class98_Sub18 class98_sub18 = ((Class98_Sub18) Class116.aClass377_964
							.method3990(i_73_, -1));
					if (class98_sub18 != null) {
						Class196.method2666(16398, true, class98_sub18,
								(class98_sub18.anInt3945) != i_74_);
					}
					Class323.method3677(true, -128, i_74_, i_73_, 3);
					return;
				}
				if (opcode == 3112) {
					anInt1885--;
					final int i_75_ = anIntArray1878[anInt1885];
					final Class98_Sub18 class98_sub18 = ((Class98_Sub18) Class116.aClass377_964
							.method3990(i_75_, -1));
					if (class98_sub18 != null && class98_sub18.anInt3947 == 3) {
						Class196.method2666(16398, true, class98_sub18, true);
					}
					return;
				}
				if (opcode == 3113) {
					Class98_Sub19.method1165((byte) 36,
							aStringArray1883[--anInt1884]);
					return;
				}
				if (opcode == 3114) {
					anInt1885 -= 2;
					final int i_76_ = anIntArray1878[anInt1885];
					final int i_77_ = anIntArray1878[anInt1885 + 1];
					final String string = aStringArray1883[--anInt1884];
					Class98_Sub45.method1521((byte) -119, i_76_, string, i_77_,
							"", "", "");
					return;
				}
				if (opcode == 3115) {
					anInt1885 -= 11;
					final Class63[] class63s = Class98_Sub46_Sub13_Sub1
							.method1595(123);
					final Class110[] class110s = Class331.method3723(256);
					OutputStream_Sub1.method129(anIntArray1878[anInt1885 + 10],
							anIntArray1878[anInt1885 + 3],
							(class63s[anIntArray1878[anInt1885]]),
							anIntArray1878[anInt1885 + 4],
							anIntArray1878[anInt1885 + 2], false,
							anIntArray1878[anInt1885 + 8],
							anIntArray1878[anInt1885 + 9],
							anIntArray1878[anInt1885 + 6],
							anIntArray1878[anInt1885 + 7],
							anIntArray1878[anInt1885 + 5],
							class110s[(anIntArray1878[anInt1885 + 1])]);
					return;
				}
			} else if (opcode < 3300) {
				if (opcode == 3200) {
					anInt1885 -= 3;
					Class301.method3537(256, (byte) 1,
							anIntArray1878[anInt1885],
							anIntArray1878[anInt1885 + 1],
							anIntArray1878[anInt1885 + 2], 255);
					return;
				}
				if (opcode == 3201) {
					Class246_Sub3_Sub1.method2994(anIntArray1878[--anInt1885],
							255, (byte) -83, 50);
					return;
				}
				if (opcode == 3202) {
					anInt1885 -= 2;
					Class228.method2861(anIntArray1878[anInt1885 + 1], 255,
							anIntArray1878[anInt1885], 18596);
					return;
				}
				if (opcode == 3203) {
					anInt1885 -= 4;
					Class301.method3537(256, (byte) 1,
							anIntArray1878[anInt1885],
							anIntArray1878[anInt1885 + 1],
							anIntArray1878[anInt1885 + 2],
							anIntArray1878[anInt1885 + 3]);
					return;
				}
				if (opcode == 3204) {
					anInt1885 -= 3;
					Class246_Sub3_Sub1.method2994(anIntArray1878[anInt1885],
							(anIntArray1878[anInt1885 + 1]), (byte) -83,
							(anIntArray1878[anInt1885 + 2]));
					return;
				}
				if (opcode == 3205) {
					anInt1885 -= 3;
					Class228.method2861(anIntArray1878[anInt1885 + 1],
							anIntArray1878[anInt1885 + 2],
							anIntArray1878[anInt1885], 18596);
					return;
				}
				if (opcode == 3206) {
					anInt1885 -= 4;
					Class98_Sub10_Sub9.method1036(-1962608884,
							anIntArray1878[anInt1885 + 3],
							anIntArray1878[anInt1885 + 1],
							anIntArray1878[anInt1885], false,
							anIntArray1878[anInt1885 + 2], 256);
					return;
				}
				if (opcode == 3207) {
					anInt1885 -= 4;
					Class98_Sub10_Sub9.method1036(-1962608884,
							anIntArray1878[anInt1885 + 3],
							anIntArray1878[anInt1885 + 1],
							anIntArray1878[anInt1885], true,
							anIntArray1878[anInt1885 + 2], 256);
					return;
				}
				if (opcode == 3208) {
					anInt1885 -= 5;
					Class301.method3537(anIntArray1878[anInt1885 + 4],
							(byte) 1, anIntArray1878[anInt1885],
							anIntArray1878[anInt1885 + 1],
							anIntArray1878[anInt1885 + 2],
							anIntArray1878[anInt1885 + 3]);
					return;
				}
				if (opcode == 3209) {
					anInt1885 -= 5;
					Class98_Sub10_Sub9.method1036(-1962608884,
							anIntArray1878[anInt1885 + 3],
							anIntArray1878[anInt1885 + 1],
							anIntArray1878[anInt1885], false,
							anIntArray1878[anInt1885 + 2],
							anIntArray1878[anInt1885 + 4]);
					return;
				}
			} else if (opcode < 3400) {
				if (opcode == 3300) {
					anIntArray1878[anInt1885++] = Class215.anInt1614;
					return;
				}
				if (opcode == 3301) {
					anInt1885 -= 2;
					final int i_78_ = anIntArray1878[anInt1885];
					final int i_79_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = Class96.method925(i_78_,
							-121, i_79_, false);
					return;
				}
				if (opcode == 3302) {
					anInt1885 -= 2;
					final int i_80_ = anIntArray1878[anInt1885];
					final int i_81_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = Class124.method2212(false,
							(byte) -96, i_80_, i_81_);
					return;
				}
				if (opcode == 3303) {
					anInt1885 -= 2;
					final int i_82_ = anIntArray1878[anInt1885];
					final int i_83_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = Class249.method3161(i_82_,
							-122, false, i_83_);
					return;
				}
				if (opcode == 3304) {
					final int i_84_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (Class98_Sub46_Sub14.aClass8_5378
							.method185(9, i_84_).anInt6055);
					return;
				}
				if (opcode == 3305) {
					final int skillId = anIntArray1878[--anInt1885];
					if ((scriptId == 53 || scriptId == 808 || scriptId == 2165
							|| scriptId == 811 || scriptId == 801 || scriptId == 2298)
							&& skillId == 5) {
						anIntArray1878[anInt1885++] = client.prayerpoints;
					} else {
						anIntArray1878[anInt1885++] = Class64_Sub21.skillLevels[skillId];
					}
					return;
				}
				if (opcode == 3306) {
					final int skillId = anIntArray1878[--anInt1885];
					if ((scriptId == 53 || scriptId == 808 || scriptId == 2165
							|| scriptId == 811 || scriptId == 801 || scriptId == 2298)
							&& skillId == 5) {
						anIntArray1878[anInt1885++] = Class256_Sub1.anIntArray5158[skillId] * 10;
					} else {
						anIntArray1878[anInt1885++] = Class256_Sub1.anIntArray5158[skillId];
					}
					return;
				}
				if (opcode == 3307) {
					final int i_87_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class52.anIntArray3493[i_87_];
					return;
				}
				if (opcode == 3308) {
					final int i_88_ = (((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aByte5088);
					final int i_89_ = (((((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5084) >> 9) + Class272.anInt2038);
					final int i_90_ = (((((Class246_Sub3) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).anInt5079) >> 9) + aa_Sub2.anInt3562);
					anIntArray1878[anInt1885++] = (i_88_ << 28) + (i_89_ << 14)
							+ i_90_;
					return;
				}
				if (opcode == 3309) {
					final int i_91_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = i_91_ >> 14 & 0x3fff;
					return;
				}
				if (opcode == 3310) {
					final int i_92_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = i_92_ >> 28;
					return;
				}
				if (opcode == 3311) {
					final int i_93_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = i_93_ & 0x3fff;
					return;
				}
				if (opcode == 3312) {
					anIntArray1878[anInt1885++] = Class79.aBoolean602 ? 1 : 0;
					return;
				}
				if (opcode == 3313) {
					anInt1885 -= 2;
					final int i_94_ = anIntArray1878[anInt1885];
					final int i_95_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = Class96.method925(i_94_, 118,
							i_95_, true);
					return;
				}
				if (opcode == 3314) {
					anInt1885 -= 2;
					final int i_96_ = anIntArray1878[anInt1885];
					final int i_97_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = Class124.method2212(true,
							(byte) -96, i_96_, i_97_);
					return;
				}
				if (opcode == 3315) {
					anInt1885 -= 2;
					final int i_98_ = anIntArray1878[anInt1885];
					final int i_99_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = Class249.method3161(i_98_,
							-121, true, i_99_);
					return;
				}
				if (opcode == 3316) {
					if (Class282.anInt2125 >= 2) {
						anIntArray1878[anInt1885++] = Class282.anInt2125;
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 3317) {
					anIntArray1878[anInt1885++] = Class98_Sub10_Sub6.anInt5569;
					return;
				}
				if (opcode == 3318) {
					anIntArray1878[anInt1885++] = (Class98_Sub46_Sub10.aClass354_6011.worldId);
					return;
				}
				if (opcode == 3321) {
					anIntArray1878[anInt1885++] = Class368.anInt3124;
					return;
				}
				if (opcode == 3322) {
					anIntArray1878[anInt1885++] = Class24.anInt255;
					return;
				}
				if (opcode == 3323) {
					if (Class47.anInt407 >= 5 && Class47.anInt407 <= 9) {
						anIntArray1878[anInt1885++] = 1;
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 3324) {
					if (Class47.anInt407 >= 5 && Class47.anInt407 <= 9) {
						anIntArray1878[anInt1885++] = Class47.anInt407;
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 3325) {
					anIntArray1878[anInt1885++] = Class64_Sub18.aBoolean3690 ? 1
							: 0;
					return;
				}
				if (opcode == 3326) {
					anIntArray1878[anInt1885++] = (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.anInt6519);
					return;
				}
				if (opcode == 3327) {
					anIntArray1878[anInt1885++] = ((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518) != null && (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518).aBoolean2681) ? 1
							: 0;
					return;
				}
				if (opcode == 3329) {
					anIntArray1878[anInt1885++] = Model.aBoolean1401 ? 1 : 0;
					return;
				}
				if (opcode == 3330) {
					final int i_100_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class156_Sub1.method2498(
							i_100_, (byte) 99, false);
					return;
				}
				if (opcode == 3331) {
					anInt1885 -= 2;
					final int i_101_ = anIntArray1878[anInt1885];
					final int i_102_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = Class98_Sub6.method978(false,
							false, i_101_, true, i_102_);
					return;
				}
				if (opcode == 3332) {
					anInt1885 -= 2;
					final int i_103_ = anIntArray1878[anInt1885];
					final int i_104_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = Class98_Sub6.method978(false,
							true, i_103_, true, i_104_);
					return;
				}
				if (opcode == 3333) {
					anIntArray1878[anInt1885++] = Class146_Sub2.anInt4855;
					return;
				}
				if (opcode == 3335) {
					anIntArray1878[anInt1885++] = Class374.anInt3159;
					return;
				}
				if (opcode == 3336) {
					anInt1885 -= 4;
					int i_105_ = anIntArray1878[anInt1885];
					final int i_106_ = anIntArray1878[anInt1885 + 1];
					final int i_107_ = anIntArray1878[anInt1885 + 2];
					final int i_108_ = anIntArray1878[anInt1885 + 3];
					i_105_ += i_106_ << 14;
					i_105_ += i_107_ << 28;
					i_105_ += i_108_;
					anIntArray1878[anInt1885++] = i_105_;
					return;
				}
				if (opcode == 3337) {
					anIntArray1878[anInt1885++] = Class98_Sub10_Sub15.anInt5619;
					return;
				}
				if (opcode == 3338) {
					anIntArray1878[anInt1885++] = Class278_Sub1.method3320(12);
					return;
				}
				if (opcode == 3339) {
					anIntArray1878[anInt1885++] = 0;
					return;
				}
				if (opcode == 3340) {
					anIntArray1878[anInt1885++] = Class4.aBoolean84 ? 1 : 0;
					return;
				}
				if (opcode == 3341) {
					anIntArray1878[anInt1885++] = Class98_Sub10_Sub30.aBoolean5712 ? 1
							: 0;
					return;
				}
				if (opcode == 3342) {
					anIntArray1878[anInt1885++] = Class2.aClass299_73
							.method3514(61);
					return;
				}
				if (opcode == 3343) {
					anIntArray1878[anInt1885++] = Class2.aClass299_73
							.method3507((byte) 82);
					return;
				}
				if (opcode == 3344) {
					aStringArray1883[anInt1884++] = Class152.method2477(29558);
					return;
				}
				if (opcode == 3345) {
					aStringArray1883[anInt1884++] = Class231.method2873(0);
					return;
				}
				if (opcode == 3346) {
					anIntArray1878[anInt1885++] = Class102.method1710(66);
					return;
				}
				if (opcode == 3347) {
					anIntArray1878[anInt1885++] = Class325.anInt2729;
					return;
				}
				if (opcode == 3349) {
					anIntArray1878[anInt1885++] = ((Class246_Sub3_Sub4_Sub2) Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660).aClass325_6399
							.method3698((byte) 116) >> 3;
					return;
				}
			} else if (opcode < 3500) {
				if (opcode == 3400) {
					anInt1885 -= 2;
					final int i_109_ = anIntArray1878[anInt1885];
					final int i_110_ = anIntArray1878[anInt1885 + 1];
					final Class306 class306 = Class98_Sub10_Sub16.aClass29_5620
							.method302(i_109_, 1028602529);
					aStringArray1883[anInt1884++] = class306.method3594(i_110_,
							(byte) 88);
					return;
				}
				if (opcode == 3408) { // source of my god damn problem
					anInt1885 -= 4;
					final int i_111_ = anIntArray1878[anInt1885];
					final int i_112_ = anIntArray1878[anInt1885 + 1];
					final int i_113_ = anIntArray1878[anInt1885 + 2];
					final int i_114_ = anIntArray1878[anInt1885 + 3];
					final Class306 class306 = Class98_Sub10_Sub16.aClass29_5620
							.method302(i_113_, 1028602529);
					if (class306.aChar2560 != i_111_
							|| class306.aChar2567 != i_112_) {
						throw new RuntimeException("C3408-1 " + i_113_ + "-"
								+ i_114_);
					}
					if (i_112_ == 115) {
						aStringArray1883[anInt1884++] = class306.method3594(
								i_114_, (byte) 23);
					} else {
						anIntArray1878[anInt1885++] = class306.method3598(
								i_114_, -28629);
						return;
					}
					return;
				}
				if (opcode == 3409) {
					anInt1885 -= 3;
					final int i_115_ = anIntArray1878[anInt1885];
					final int i_116_ = anIntArray1878[anInt1885 + 1];
					final int i_117_ = anIntArray1878[anInt1885 + 2];
					if (i_116_ == -1) {
						throw new RuntimeException("C3409-2");
					}
					final Class306 class306 = Class98_Sub10_Sub16.aClass29_5620
							.method302(i_116_, 1028602529);
					if (class306.aChar2567 != i_115_) {
						throw new RuntimeException("C3409-1");
					}
					anIntArray1878[anInt1885++] = class306.method3596(i_117_,
							(byte) 104) ? 1 : 0;
					return;
				}
				if (opcode == 3410) {
					final int i_118_ = anIntArray1878[--anInt1885];
					final String string = aStringArray1883[--anInt1884];
					if (i_118_ == -1) {
						throw new RuntimeException("C3410-2");
					}
					final Class306 class306 = Class98_Sub10_Sub16.aClass29_5620
							.method302(i_118_, 1028602529);
					if (class306.aChar2567 != 's') {
						throw new RuntimeException("C3410-1");
					}
					anIntArray1878[anInt1885++] = class306.method3602(string,
							-16972) ? 1 : 0;
					return;
				}
				if (opcode == 3411) {
					final int i_119_ = anIntArray1878[--anInt1885];
					final Class306 class306 = Class98_Sub10_Sub16.aClass29_5620
							.method302(i_119_, 1028602529);
					anIntArray1878[anInt1885++] = class306.aClass377_2558
							.method3999((byte) -6);
					return;
				}
			} else if (opcode < 3700) {
				if (opcode == 3600) {
					if (Class98_Sub28.anInt4078 == 0) {
						anIntArray1878[anInt1885++] = -2;
					} else {
						if (Class98_Sub28.anInt4078 == 1) {
							anIntArray1878[anInt1885++] = -1;
						} else {
							anIntArray1878[anInt1885++] = Class314.anInt2692;
							return;
						}
						return;
					}
					return;
				}
				if (opcode == 3601) {
					final int i_120_ = anIntArray1878[--anInt1885];
					if (Class98_Sub28.anInt4078 == 2
							&& i_120_ < Class314.anInt2692) {
						aStringArray1883[anInt1884++] = Class98_Sub25.aStringArray4026[i_120_];
						if (Class315.aStringArray3527[i_120_] != null) {
							aStringArray1883[anInt1884++] = Class315.aStringArray3527[i_120_];
						} else {
							aStringArray1883[anInt1884++] = "";
						}
					} else {
						aStringArray1883[anInt1884++] = "";
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (opcode == 3602) {
					final int i_121_ = anIntArray1878[--anInt1885];
					if (Class98_Sub28.anInt4078 == 2
							&& i_121_ < Class314.anInt2692) {
						anIntArray1878[anInt1885++] = Class98_Sub26.anIntArray4030[i_121_];
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 3603) {
					final int i_122_ = anIntArray1878[--anInt1885];
					if (Class98_Sub28.anInt4078 == 2
							&& i_122_ < Class314.anInt2692) {
						anIntArray1878[anInt1885++] = Class69.anIntArray3222[i_122_];
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 3604) {
					final String string = aStringArray1883[--anInt1884];
					final int i_123_ = anIntArray1878[--anInt1885];
					Class373_Sub3.method3976(i_123_, (byte) 89, string);
					return;
				}
				if (opcode == 3605) {
					final String string = aStringArray1883[--anInt1884];
					Class176.method2580(4, string);
					return;
				}
				if (opcode == 3606) {
					final String string = aStringArray1883[--anInt1884];
					Class118.method2170(54, string);
					return;
				}
				if (opcode == 3607) {
					final String string = aStringArray1883[--anInt1884];
					Class66.method684(-104, string, false);
					return;
				}
				if (opcode == 3608) {
					final String string = aStringArray1883[--anInt1884];
					s_Sub1.method3430(string, -23995);
					return;
				}
				if (opcode == 3609) {
					String string = aStringArray1883[--anInt1884];
					if (string.startsWith("<img=0>")
							|| string.startsWith("<img=1>")) {
						string = string.substring(7);
					}
					anIntArray1878[anInt1885++] = Class256_Sub1.method3195(0,
							string) ? 1 : 0;
					return;
				}
				if (opcode == 3610) {
					final int i_124_ = anIntArray1878[--anInt1885];
					if (Class98_Sub28.anInt4078 == 2
							&& i_124_ < Class314.anInt2692) {
						aStringArray1883[anInt1884++] = Class98_Sub10_Sub17.aStringArray5625[i_124_];
					} else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (opcode == 3611) {
					if (Class153.aString1229 != null) {
						aStringArray1883[anInt1884++] = Class98_Sub10_Sub2
								.method1007(Class153.aString1229, 46);
					} else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (opcode == 3612) {
					if (Class153.aString1229 != null) {
						anIntArray1878[anInt1885++] = Class32.anInt308;
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 3613) {
					final int i_125_ = anIntArray1878[--anInt1885];
					if (Class153.aString1229 != null
							&& i_125_ < Class32.anInt308) {
						aStringArray1883[anInt1884++] = (Class374.aClass147Array3157[i_125_].aString1191);
					} else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (opcode == 3614) {
					final int i_126_ = anIntArray1878[--anInt1885];
					if (Class153.aString1229 != null
							&& i_126_ < Class32.anInt308) {
						anIntArray1878[anInt1885++] = (Class374.aClass147Array3157[i_126_].anInt1188);
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 3615) {
					final int i_127_ = anIntArray1878[--anInt1885];
					if (Class153.aString1229 != null
							&& i_127_ < Class32.anInt308) {
						anIntArray1878[anInt1885++] = (Class374.aClass147Array3157[i_127_].aByte1187);
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 3616) {
					anIntArray1878[anInt1885++] = Class232.aByte1742;
					return;
				}
				if (opcode == 3617) {
					final String string = aStringArray1883[--anInt1884];
					Class76_Sub4.method756(-108, string);
					return;
				}
				if (opcode == 3618) {
					anIntArray1878[anInt1885++] = Class111.aByte947;
					return;
				}
				if (opcode == 3619) {
					final String string = aStringArray1883[--anInt1884];
					Class345.method3824(string, 2);
					return;
				}
				if (opcode == 3620) {
					Class339_Sub1.method3799(0);
					return;
				}
				if (opcode == 3621) {
					if (Class98_Sub28.anInt4078 == 0) {
						anIntArray1878[anInt1885++] = -1;
					} else {
						anIntArray1878[anInt1885++] = Class248.anInt1897;
						return;
					}
					return;
				}
				if (opcode == 3622) {
					final int i_128_ = anIntArray1878[--anInt1885];
					if (Class98_Sub28.anInt4078 != 0
							&& i_128_ < Class248.anInt1897) {
						aStringArray1883[anInt1884++] = Class246_Sub4_Sub1.aStringArray6171[i_128_];
						if (Class98_Sub45.aStringArray4255[i_128_] != null) {
							aStringArray1883[anInt1884++] = Class98_Sub45.aStringArray4255[i_128_];
						} else {
							aStringArray1883[anInt1884++] = "";
						}
					} else {
						aStringArray1883[anInt1884++] = "";
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (opcode == 3623) {
					String string = aStringArray1883[--anInt1884];
					if (string.startsWith("<img=0>")
							|| string.startsWith("<img=1>")) {
						string = string.substring(7);
					}
					anIntArray1878[anInt1885++] = Class14.method225(string,
							(byte) 117) ? 1 : 0;
					return;
				}
				if (opcode == 3624) {
					final int i_129_ = anIntArray1878[--anInt1885];
					if (Class374.aClass147Array3157 != null
							&& i_129_ < Class32.anInt308
							&& (Class374.aClass147Array3157[i_129_].aString1186
									.equalsIgnoreCase(Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aString6537))) {
						anIntArray1878[anInt1885++] = 1;
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 3625) {
					if (Class93_Sub3.aString5494 != null) {
						aStringArray1883[anInt1884++] = Class93_Sub3.aString5494;
					} else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (opcode == 3626) {
					final int i_130_ = anIntArray1878[--anInt1885];
					if (Class153.aString1229 != null
							&& i_130_ < Class32.anInt308) {
						aStringArray1883[anInt1884++] = (Class374.aClass147Array3157[i_130_].aString1190);
					} else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (opcode == 3627) {
					final int i_131_ = anIntArray1878[--anInt1885];
					if (Class98_Sub28.anInt4078 == 2 && i_131_ >= 0
							&& i_131_ < Class314.anInt2692) {
						anIntArray1878[anInt1885++] = aa_Sub3.aBooleanArray3575[i_131_] ? 1
								: 0;
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 3628) {
					String string = aStringArray1883[--anInt1884];
					if (string.startsWith("<img=0>")
							|| string.startsWith("<img=1>")
							|| string.startsWith("<img=8>")) {
						string = string.substring(7);
					}
					anIntArray1878[anInt1885++] = Class111.method2094(string,
							-125);
					return;
				}
				if (opcode == 3629) {
					anIntArray1878[anInt1885++] = Class233.anInt1746;
					return;
				}
				if (opcode == 3630) {
					final String string = aStringArray1883[--anInt1884];
					Class66.method684(-59, string, true);
					return;
				}
				if (opcode == 3631) {
					final int i_132_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (Class98_Sub10_Sub38.aBooleanArray5759[i_132_] ? 1
							: 0);
					return;
				}
				if (opcode == 3632) {
					final int i_133_ = anIntArray1878[--anInt1885];
					if (Class153.aString1229 != null
							&& i_133_ < Class32.anInt308) {
						aStringArray1883[anInt1884++] = (Class374.aClass147Array3157[i_133_].aString1186);
					} else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (opcode == 3633) {
					final int i_134_ = anIntArray1878[--anInt1885];
					if (Class98_Sub28.anInt4078 != 0
							&& i_134_ < Class248.anInt1897) {
						aStringArray1883[anInt1884++] = Class255.aStringArray3209[i_134_];
					} else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
			} else if (opcode < 3800) {
				// added opcode
				if (opcode == 3700) {
					anIntArray1878[anInt1885++] = 0;
					return;
				}
				if (opcode == 3701) {
					anIntArray1878[anInt1885++] = 0;
					return;
				}
				if (opcode == 3751) {
					anIntArray1878[anInt1885++] = 0;
					return;
				}
			} else if (opcode < 4000) {
				if (opcode == 3903) {
					final int i_135_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class98_Sub10_Sub24.aClass101Array5666[i_135_]
							.method1698(true);
					return;
				}
				if (opcode == 3904) {
					final int i_136_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (Class98_Sub10_Sub24.aClass101Array5666[i_136_]).anInt852;
					return;
				}
				if (opcode == 3905) {
					final int i_137_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (Class98_Sub10_Sub24.aClass101Array5666[i_137_]).anInt847;
					return;
				}
				if (opcode == 3906) {
					final int i_138_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (Class98_Sub10_Sub24.aClass101Array5666[i_138_]).anInt853;
					return;
				}
				if (opcode == 3907) {
					final int i_139_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (Class98_Sub10_Sub24.aClass101Array5666[i_139_]).anInt851;
					return;
				}
				if (opcode == 3908) {
					final int i_140_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (Class98_Sub10_Sub24.aClass101Array5666[i_140_]).anInt850;
					return;
				}
				if (opcode == 3910) {
					final int i_141_ = anIntArray1878[--anInt1885];
					final int i_142_ = Class98_Sub10_Sub24.aClass101Array5666[i_141_]
							.method1700(7);
					anIntArray1878[anInt1885++] = i_142_ == 0 ? 1 : 0;
					return;
				}
				if (opcode == 3911) {
					final int i_143_ = anIntArray1878[--anInt1885];
					final int i_144_ = Class98_Sub10_Sub24.aClass101Array5666[i_143_]
							.method1700(7);
					anIntArray1878[anInt1885++] = i_144_ == 2 ? 1 : 0;
					return;
				}
				if (opcode == 3912) {
					final int i_145_ = anIntArray1878[--anInt1885];
					final int i_146_ = Class98_Sub10_Sub24.aClass101Array5666[i_145_]
							.method1700(7);
					anIntArray1878[anInt1885++] = i_146_ == 5 ? 1 : 0;
					return;
				}
				if (opcode == 3913) {
					final int i_147_ = anIntArray1878[--anInt1885];
					final int i_148_ = Class98_Sub10_Sub24.aClass101Array5666[i_147_]
							.method1700(7);
					anIntArray1878[anInt1885++] = i_148_ == 1 ? 1 : 0;
					return;
				}
			} else if (opcode < 4100) {
				if (opcode == 4000) {
					anInt1885 -= 2;
					final int i_149_ = anIntArray1878[anInt1885];
					final int i_150_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = i_149_ + i_150_;
					return;
				}
				if (opcode == 4001) {
					anInt1885 -= 2;
					final int i_151_ = anIntArray1878[anInt1885];
					final int i_152_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = i_151_ - i_152_;
					return;
				}
				if (opcode == 4002) {
					anInt1885 -= 2;
					final int i_153_ = anIntArray1878[anInt1885];
					final int i_154_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = i_153_ * i_154_;
					return;
				}
				if (opcode == 4003) {
					anInt1885 -= 2;
					final int i_155_ = anIntArray1878[anInt1885];
					final int i_156_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = i_155_ / i_156_;
					return;
				}
				if (opcode == 4004) {
					final int i_157_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (int) (Math.random() * i_157_);
					return;
				}
				if (opcode == 4005) {
					final int i_158_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (int) (Math.random() * (i_158_ + 1));
					return;
				}
				if (opcode == 4006) {
					anInt1885 -= 5;
					final int i_159_ = anIntArray1878[anInt1885];
					final int i_160_ = anIntArray1878[anInt1885 + 1];
					final int i_161_ = anIntArray1878[anInt1885 + 2];
					final int i_162_ = anIntArray1878[anInt1885 + 3];
					final int i_163_ = anIntArray1878[anInt1885 + 4];
					anIntArray1878[anInt1885++] = i_159_
							+ ((i_160_ - i_159_) * (i_163_ - i_161_) / (i_162_ - i_161_));
					return;
				}
				if (opcode == 4007) {
					anInt1885 -= 2;
					final long l = anIntArray1878[anInt1885];
					final long l_164_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = (int) (l + l * l_164_ / 100L);
					return;
				}
				if (opcode == 4008) {
					anInt1885 -= 2;
					final int i_165_ = anIntArray1878[anInt1885];
					final int i_166_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = i_165_ | 1 << i_166_;
					return;
				}
				if (opcode == 4009) {
					anInt1885 -= 2;
					final int i_167_ = anIntArray1878[anInt1885];
					final int i_168_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = i_167_ & -1 - (1 << i_168_);
					return;
				}
				if (opcode == 4010) {
					anInt1885 -= 2;
					final int i_169_ = anIntArray1878[anInt1885];
					final int i_170_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = (i_169_ & 1 << i_170_) != 0 ? 1
							: 0;
					return;
				}
				if (opcode == 4011) {
					anInt1885 -= 2;
					final int i_171_ = anIntArray1878[anInt1885];
					final int i_172_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = i_171_ % i_172_;
					return;
				}
				if (opcode == 4012) {
					anInt1885 -= 2;
					final int i_173_ = anIntArray1878[anInt1885];
					final int i_174_ = anIntArray1878[anInt1885 + 1];
					if (i_173_ == 0) {
						anIntArray1878[anInt1885++] = 0;
					} else {
						anIntArray1878[anInt1885++] = (int) Math.pow(i_173_,
								i_174_);
						return;
					}
					return;
				}
				if (opcode == 4013) {
					anInt1885 -= 2;
					final int i_175_ = anIntArray1878[anInt1885];
					final int i_176_ = anIntArray1878[anInt1885 + 1];
					if (i_175_ == 0) {
						anIntArray1878[anInt1885++] = 0;
					} else {
						if (i_176_ == 0) {
							anIntArray1878[anInt1885++] = 2147483647;
						} else {
							anIntArray1878[anInt1885++] = (int) Math.pow(
									i_175_, 1.0 / i_176_);
							return;
						}
						return;
					}
					return;
				}
				if (opcode == 4014) {
					anInt1885 -= 2;
					final int i_177_ = anIntArray1878[anInt1885];
					final int i_178_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = i_177_ & i_178_;
					return;
				}
				if (opcode == 4015) {
					anInt1885 -= 2;
					final int i_179_ = anIntArray1878[anInt1885];
					final int i_180_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = i_179_ | i_180_;
					return;
				}
				if (opcode == 4016) {
					anInt1885 -= 2;
					final int i_181_ = anIntArray1878[anInt1885];
					final int i_182_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = i_181_ < i_182_ ? i_181_
							: i_182_;
					return;
				}
				if (opcode == 4017) {
					anInt1885 -= 2;
					final int i_183_ = anIntArray1878[anInt1885];
					final int i_184_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = i_183_ > i_184_ ? i_183_
							: i_184_;
					return;
				}
				if (opcode == 4018) {
					anInt1885 -= 3;
					final long l = anIntArray1878[anInt1885];
					final long l_185_ = anIntArray1878[anInt1885 + 1];
					final long l_186_ = anIntArray1878[anInt1885 + 2];
					anIntArray1878[anInt1885++] = (int) (l * l_186_ / l_185_);
					return;
				}
				if (opcode == 4019) {
					anInt1885 -= 2;
					final int i_187_ = anIntArray1878[anInt1885];
					final int i_188_ = anIntArray1878[anInt1885 + 1];
					if (i_187_ > 700 || i_188_ > 700) {
						anIntArray1878[anInt1885++] = 256;
					}
					final double d = ((Math.random() * (i_188_ + i_187_)
							- i_187_ + 800.0) / 100.0);
					anIntArray1878[anInt1885++] = (int) (Math.pow(2.0, d) + 0.5);
					return;
				}
			} else if (opcode < 4200) {
				if (opcode == 4100) {
					final String string = aStringArray1883[--anInt1884];
					final int i_189_ = anIntArray1878[--anInt1885];
					aStringArray1883[anInt1884++] = string + i_189_;
					return;
				}
				if (opcode == 4101) {
					anInt1884 -= 2;
					final String string = aStringArray1883[anInt1884];
					final String string_190_ = aStringArray1883[anInt1884 + 1];
					aStringArray1883[anInt1884++] = string + string_190_;
					return;
				}
				if (opcode == 4102) {
					final String string = aStringArray1883[--anInt1884];
					final int i_191_ = anIntArray1878[--anInt1885];
					aStringArray1883[anInt1884++] = string
							+ Class44.method428(i_191_, false, true);
					return;
				}
				if (opcode == 4103) {
					final String string = aStringArray1883[--anInt1884];
					aStringArray1883[anInt1884++] = string.toLowerCase();
					return;
				}
				if (opcode == 4104) {
					aStringArray1883[anInt1884++] = method3149(anIntArray1878[--anInt1885]);
					return;
				}
				if (opcode == 4105) {
					anInt1884 -= 2;
					final String string = aStringArray1883[anInt1884];
					final String string_192_ = aStringArray1883[anInt1884 + 1];
					if ((Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518) != null
							&& (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aClass313_6518).aBoolean2681) {
						aStringArray1883[anInt1884++] = string_192_;
					} else {
						aStringArray1883[anInt1884++] = string;
						return;
					}
					return;
				}
				if (opcode == 4106) {
					final int i_193_ = anIntArray1878[--anInt1885];
					aStringArray1883[anInt1884++] = Integer.toString(i_193_);
					return;
				}
				if (opcode == 4107) {
					anInt1884 -= 2;
					anIntArray1878[anInt1885++] = Class336.method3772(
							aStringArray1883[anInt1884],
							aStringArray1883[anInt1884 + 1],
							Class374.anInt3159, 1166845806);
					return;
				}
				if (opcode == 4108) {
					final String string = aStringArray1883[--anInt1884];
					anInt1885 -= 2;
					final int i_194_ = anIntArray1878[anInt1885];
					final int i_195_ = anIntArray1878[anInt1885 + 1];
					final Class197 class197 = Class109.method1733((byte) 121,
							0, i_195_, Class36.aClass207_348);
					anIntArray1878[anInt1885++] = class197.method2669(i_194_,
							0, string, (Class64_Sub18.aClass332Array3689));
					return;
				}
				if (opcode == 4109) {
					final String string = aStringArray1883[--anInt1884];
					anInt1885 -= 2;
					final int i_196_ = anIntArray1878[anInt1885];
					final int i_197_ = anIntArray1878[anInt1885 + 1];
					final Class197 class197 = Class109.method1733((byte) 119,
							0, i_197_, Class36.aClass207_348);
					anIntArray1878[anInt1885++] = class197.method2670(i_196_,
							string, Class64_Sub18.aClass332Array3689, (byte) 5);
					return;
				}
				if (opcode == 4110) {
					anInt1884 -= 2;
					final String string = aStringArray1883[anInt1884];
					final String string_198_ = aStringArray1883[anInt1884 + 1];
					if (anIntArray1878[--anInt1885] == 1) {
						aStringArray1883[anInt1884++] = string;
					} else {
						aStringArray1883[anInt1884++] = string_198_;
						return;
					}
					return;
				}
				if (opcode == 4111) {
					final String string = aStringArray1883[--anInt1884];
					aStringArray1883[anInt1884++] = Class249.method3160(string,
							62);
					return;
				}
				if (opcode == 4112) {
					final String string = aStringArray1883[--anInt1884];
					final int i_199_ = anIntArray1878[--anInt1885];
					if (i_199_ == -1) {
						throw new RuntimeException("null char");
					}
					aStringArray1883[anInt1884++] = string + (char) i_199_;
					return;
				}
				if (opcode == 4113) {
					final int i_200_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = method3146((char) i_200_);
					return;
				}
				if (opcode == 4114) {
					final int i_201_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class114.method2147(
							(char) i_201_, 118) ? 1 : 0;
					return;
				}
				if (opcode == 4115) {
					final int i_202_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (Class98_Sub46_Sub15
							.method1611((byte) 124, (char) i_202_) ? 1 : 0);
					return;
				}
				if (opcode == 4116) {
					final int i_203_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (Class134_Sub1.method2245(
							18646, (char) i_203_) ? 1 : 0);
					return;
				}
				if (opcode == 4117) {
					final String string = aStringArray1883[--anInt1884];
					if (string != null) {
						anIntArray1878[anInt1885++] = string.length();
					} else {
						anIntArray1878[anInt1885++] = 0;
						return;
					}
					return;
				}
				if (opcode == 4118) {
					final String string = aStringArray1883[--anInt1884];
					anInt1885 -= 2;
					final int i_204_ = anIntArray1878[anInt1885];
					final int i_205_ = anIntArray1878[anInt1885 + 1];
					aStringArray1883[anInt1884++] = string.substring(i_204_,
							i_205_);
					return;
				}
				if (opcode == 4119) {
					final String string = aStringArray1883[--anInt1884];
					final StringBuffer stringbuffer = new StringBuffer(
							string.length());
					boolean bool_206_ = false;
					for (int i_207_ = 0; i_207_ < string.length(); i_207_++) {
						final char c = string.charAt(i_207_);
						if (c == '<') {
							bool_206_ = true;
						} else if (c == '>') {
							bool_206_ = false;
						} else if (!bool_206_) {
							stringbuffer.append(c);
						}
					}
					aStringArray1883[anInt1884++] = stringbuffer.toString();
					return;
				}
				if (opcode == 4120) {
					final String string = aStringArray1883[--anInt1884];
					anInt1885 -= 2;
					final int i_208_ = anIntArray1878[anInt1885];
					final int i_209_ = anIntArray1878[anInt1885 + 1];
					anIntArray1878[anInt1885++] = string
							.indexOf(i_208_, i_209_);
					return;
				}
				if (opcode == 4121) {
					anInt1884 -= 2;
					final String string = aStringArray1883[anInt1884];
					final String string_210_ = aStringArray1883[anInt1884 + 1];
					final int i_211_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = string.indexOf(string_210_,
							i_211_);
					return;
				}
				if (opcode == 4122) {
					final int i_212_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Character
							.toLowerCase((char) i_212_);
					return;
				}
				if (opcode == 4123) {
					final int i_213_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Character
							.toUpperCase((char) i_213_);
					return;
				}
				if (opcode == 4124) {
					final boolean bool_214_ = anIntArray1878[--anInt1885] != 0;
					final int i_215_ = anIntArray1878[--anInt1885];
					aStringArray1883[anInt1884++] = Class39.method349(
							Class374.anInt3159, 0, 48, i_215_, bool_214_);
					return;
				}
				if (opcode == 4125) {
					final String string = aStringArray1883[--anInt1884];
					final int i_216_ = anIntArray1878[--anInt1885];
					final Class197 class197 = Class109.method1733((byte) 115,
							0, i_216_, Class36.aClass207_348);
					anIntArray1878[anInt1885++] = class197
							.method2676((byte) 82,
									Class64_Sub18.aClass332Array3689, string);
					return;
				}
			} else if (opcode < 4300) {
				if (opcode == 4200) {
					final int i_217_ = anIntArray1878[--anInt1885];
					aStringArray1883[anInt1884++] = (Class98_Sub46_Sub19.aClass205_6068
							.method2714(i_217_, (byte) -126).aString2450);
					return;
				}
				if (opcode == 4201) {
					anInt1885 -= 2;
					final int i_218_ = anIntArray1878[anInt1885];
					final int i_219_ = anIntArray1878[anInt1885 + 1];
					final ItemDefs class297 = Class98_Sub46_Sub19.aClass205_6068
							.method2714(i_218_, (byte) -119);
					if (i_219_ >= 1 && i_219_ <= 5
							&& (class297.groundOptions[i_219_ - 1] != null)) {
						aStringArray1883[anInt1884++] = (class297.groundOptions[i_219_ - 1]);
					} else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (opcode == 4202) {
					anInt1885 -= 2;
					final int i_220_ = anIntArray1878[anInt1885];
					final int i_221_ = anIntArray1878[anInt1885 + 1];
					final ItemDefs class297 = Class98_Sub46_Sub19.aClass205_6068
							.method2714(i_220_, (byte) -125);
					if (i_221_ >= 1 && i_221_ <= 5
							&& (class297.inventoryOptions[i_221_ - 1] != null)) {
						aStringArray1883[anInt1884++] = (class297.inventoryOptions[i_221_ - 1]);
					} else {
						aStringArray1883[anInt1884++] = "";
						return;
					}
					return;
				}
				if (opcode == 4203) {
					final int i_222_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (Class98_Sub46_Sub19.aClass205_6068
							.method2714(i_222_, (byte) -120).anInt2475);
					return;
				}
				if (opcode == 4204) {
					final int i_223_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (Class98_Sub46_Sub19.aClass205_6068
							.method2714(i_223_, (byte) -117).anInt2469) == 1 ? 1
							: 0;
					return;
				}
				if (opcode == 4205) {
					final int i_224_ = anIntArray1878[--anInt1885];
					final ItemDefs class297 = Class98_Sub46_Sub19.aClass205_6068
							.method2714(i_224_, (byte) -116);
					if (class297.anInt2414 == -1 && class297.anInt2433 >= 0) {
						anIntArray1878[anInt1885++] = class297.anInt2433;
					} else {
						anIntArray1878[anInt1885++] = i_224_;
						return;
					}
					return;
				}
				if (opcode == 4206) {
					final int i_225_ = anIntArray1878[--anInt1885];
					final ItemDefs class297 = Class98_Sub46_Sub19.aClass205_6068
							.method2714(i_225_, (byte) -126);
					if (class297.anInt2414 >= 0 && class297.anInt2433 >= 0) {
						anIntArray1878[anInt1885++] = class297.anInt2433;
					} else {
						anIntArray1878[anInt1885++] = i_225_;
						return;
					}
					return;
				}
				if (opcode == 4207) {
					final int i_226_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (Class98_Sub46_Sub19.aClass205_6068
							.method2714(i_226_, (byte) -124).aBoolean2420) ? 1
							: 0;
					return;
				}
				if (opcode == 4208) {
					anInt1885 -= 2;
					final int i_227_ = anIntArray1878[anInt1885];
					final int i_228_ = anIntArray1878[anInt1885 + 1];
					final Class149 class149 = Class98_Sub43_Sub1.aClass365_5897
							.method3940((byte) 31, i_228_);
					if (class149.method2433(false)) {
						aStringArray1883[anInt1884++] = (Class98_Sub46_Sub19.aClass205_6068
								.method2714(i_227_, (byte) -126).method3495(
								class149.aString1203, -1, i_228_));
					} else {
						anIntArray1878[anInt1885++] = (Class98_Sub46_Sub19.aClass205_6068
								.method2714(i_227_, (byte) -123).method3494(
								i_228_, (byte) -86, class149.anInt1202));
						return;
					}
					return;
				}
				if (opcode == 4209) {
					anInt1885 -= 2;
					final int i_229_ = anIntArray1878[anInt1885];
					final int i_230_ = anIntArray1878[anInt1885 + 1] - 1;
					final ItemDefs class297 = Class98_Sub46_Sub19.aClass205_6068
							.method2714(i_229_, (byte) -116);
					if (class297.anInt2463 == i_230_) {
						anIntArray1878[anInt1885++] = class297.anInt2440;
					} else {
						if (class297.anInt2434 == i_230_) {
							anIntArray1878[anInt1885++] = class297.anInt2462;
						} else {
							anIntArray1878[anInt1885++] = -1;
							return;
						}
						return;
					}
					return;
				}
				if (opcode == 4210) {
					final String string = aStringArray1883[--anInt1884];
					final int i_231_ = anIntArray1878[--anInt1885];
					Class115.method2156(i_231_ == 1, string, -97);
					anIntArray1878[anInt1885++] = Class18.anInt214;
					return;
				}
				if (opcode == 4211) {
					if (Class64_Sub16.aShortArray3682 == null
							|| Class85.anInt638 >= Class18.anInt214) {
						anIntArray1878[anInt1885++] = -1;
					} else {
						anIntArray1878[anInt1885++] = (Class64_Sub16.aShortArray3682[Class85.anInt638++]) & 0xffff;
						return;
					}
					return;
				}
				if (opcode == 4212) {
					Class85.anInt638 = 0;
					return;
				}
				if (opcode == 4213) {
					final int i_232_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = (Class98_Sub46_Sub19.aClass205_6068
							.method2714(i_232_, (byte) -117).anInt2418);
					return;
				}
				if (opcode == 4214) {
					final String string = aStringArray1883[--anInt1884];
					anInt1885 -= 3;
					final int i_233_ = anIntArray1878[anInt1885];
					final int i_234_ = anIntArray1878[anInt1885 + 1];
					final int i_235_ = anIntArray1878[anInt1885 + 2];
					Class57.method519(i_233_ == 1, string, i_235_, -1, i_234_);
					anIntArray1878[anInt1885++] = Class18.anInt214;
					return;
				}
				if (opcode == 4215) {
					anInt1884 -= 2;
					anInt1885 -= 2;
					final String string = aStringArray1883[anInt1884];
					final int i_236_ = anIntArray1878[anInt1885];
					final int i_237_ = anIntArray1878[anInt1885 + 1];
					final String string_238_ = aStringArray1883[anInt1884 + 1];
					Class287.method3387(string, string_238_, (byte) 34,
							i_236_ == 1, i_237_);
					anIntArray1878[anInt1885++] = Class18.anInt214;
					return;
				}
			} else if (opcode < 4400) {
				if (opcode == 4300) {
					anInt1885 -= 2;
					final int i_239_ = anIntArray1878[anInt1885];
					final int i_240_ = anIntArray1878[anInt1885 + 1];
					final Class149 class149 = Class98_Sub43_Sub1.aClass365_5897
							.method3940((byte) 31, i_240_);
					if (class149.method2433(false)) {
						aStringArray1883[anInt1884++] = (Class4.aClass301_85
								.method3538(5, i_239_).method2298(i_240_, -105,
								class149.aString1203));
					} else {
						anIntArray1878[anInt1885++] = (Class4.aClass301_85
								.method3538(5, i_239_).method2305(i_240_,
								class149.anInt1202, (byte) 127));
						return;
					}
					return;
				}
			} else if (opcode < 4500) {
				if (opcode == 4400) {
					anInt1885 -= 2;
					final int i_241_ = anIntArray1878[anInt1885];
					final int i_242_ = anIntArray1878[anInt1885 + 1];
					final Class149 class149 = Class98_Sub43_Sub1.aClass365_5897
							.method3940((byte) 31, i_242_);
					if (class149.method2433(false)) {
						aStringArray1883[anInt1884++] = (Class130.aClass302_1028
								.method3546(i_241_, (byte) 119).method3864(
								(byte) 109, i_242_, class149.aString1203));
					} else {
						anIntArray1878[anInt1885++] = (Class130.aClass302_1028
								.method3546(i_241_, (byte) 119).method3866(
								class149.anInt1202, i_242_, 1));
						return;
					}
					return;
				}
			} else if (opcode < 4600) {
				if (opcode == 4500) {
					anInt1885 -= 2;
					final int i_243_ = anIntArray1878[anInt1885];
					final int i_244_ = anIntArray1878[anInt1885 + 1];
					final Class149 class149 = Class98_Sub43_Sub1.aClass365_5897
							.method3940((byte) 31, i_244_);
					if (class149.method2433(false)) {
						aStringArray1883[anInt1884++] = (Class62.aClass264_487
								.method3224(26, i_243_).method1586(i_244_,
								(byte) -19, class149.aString1203));
					} else {
						anIntArray1878[anInt1885++] = (Class62.aClass264_487
								.method3224(26, i_243_).method1585(i_244_,
								true, class149.anInt1202));
						return;
					}
					return;
				}
			} else if (opcode < 4700 && opcode == 4600) {
				final int i_245_ = anIntArray1878[--anInt1885];
				final Class294 class294 = Class370.aClass257_3136.method3199(
						false, i_245_);
				if (class294.anIntArray2395 != null
						&& class294.anIntArray2395.length > 0) {
					int i_246_ = 0;
					int i_247_ = class294.anIntArray2386[0];
					for (int i_248_ = 1; i_248_ < class294.anIntArray2395.length; i_248_++) {
						if (class294.anIntArray2386[i_248_] > i_247_) {
							i_246_ = i_248_;
							i_247_ = class294.anIntArray2386[i_248_];
						}
					}
					anIntArray1878[anInt1885++] = class294.anIntArray2395[i_246_];
				} else {
					anIntArray1878[anInt1885++] = class294.anInt2396;
					return;
				}
				return;
			}
		}
		throw new IllegalStateException(String.valueOf(opcode));
	}

	private static final String method3149(final int i) {
		final long l = (i + 11745L) * 86400000L;
		aCalendar1882.setTime(new Date(l));
		final int i_249_ = aCalendar1882.get(5);
		final int i_250_ = aCalendar1882.get(2);
		final int i_251_ = aCalendar1882.get(1);
		return (String.valueOf(i_249_) + "-" + aStringArray1892[i_250_] + "-" + i_251_);
	}

	private static final void method3150(final Class98_Sub21 class98_sub21,
			final int i) {
		final Object[] objects = class98_sub21.anObjectArray3981;
		final int scriptId = ((Integer) objects[0]).intValue();
		final Class98_Sub46_Sub4 class98_sub46_sub4 = Class98_Sub46_Sub13_Sub2
				.method1601(scriptId, 100);
		if (class98_sub46_sub4 != null) {
			anIntArray1875 = new int[class98_sub46_sub4.anInt5958];
			int i_253_ = 0;
			aStringArray1886 = (new String[class98_sub46_sub4.anInt5964]);
			int i_254_ = 0;
			for (int i_255_ = 1; i_255_ < objects.length; i_255_++) {
				if (objects[i_255_] instanceof Integer) {
					int i_256_ = ((Integer) objects[i_255_]).intValue();
					if (i_256_ == -2147483647) {
						i_256_ = class98_sub21.anInt3985;
					}
					if (i_256_ == -2147483646) {
						i_256_ = class98_sub21.anInt3979;
					}
					if (i_256_ == -2147483645) {
						i_256_ = ((class98_sub21.aClass293_3986 != null) ? (class98_sub21.aClass293_3986).anInt2248
								: -1);
					}
					if (i_256_ == -2147483644) {
						i_256_ = class98_sub21.anInt3984;
					}
					if (i_256_ == -2147483643) {
						i_256_ = ((class98_sub21.aClass293_3986 != null) ? (class98_sub21.aClass293_3986).anInt2300
								: -1);
					}
					if (i_256_ == -2147483642) {
						i_256_ = ((class98_sub21.aClass293_3982 != null) ? (class98_sub21.aClass293_3982).anInt2248
								: -1);
					}
					if (i_256_ == -2147483641) {
						i_256_ = ((class98_sub21.aClass293_3982 != null) ? (class98_sub21.aClass293_3982).anInt2300
								: -1);
					}
					if (i_256_ == -2147483640) {
						i_256_ = class98_sub21.anInt3977;
					}
					if (i_256_ == -2147483639) {
						i_256_ = class98_sub21.anInt3976;
					}
					anIntArray1875[i_253_++] = i_256_;

				} else if (objects[i_255_] instanceof String) {
					String string = (String) objects[i_255_];
					if (string.equals("event_opbase")) {
						string = class98_sub21.aString3978;
					}
					aStringArray1886[i_254_++] = string;
				}
			}
			anInt1893 = class98_sub21.anInt3990;
			method3153(class98_sub46_sub4, i, scriptId);
		}
	}

	private static final void method3151(String string, final int i) {
		if (Class282.anInt2125 != 0
				|| ((!Class109.aBoolean933 || Class98_Sub10_Sub35.aBoolean5732) && !Model.aBoolean1401)) {
			String string_257_ = string.toLowerCase();
			int i_258_ = 0;
			if (string_257_.startsWith(Class309.aClass309_2633.method3615(0,
					(byte) 25))) {
				i_258_ = 0;
				string = string.substring(Class309.aClass309_2633.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2634
					.method3615(0, (byte) 25))) {
				i_258_ = 1;
				string = string.substring(Class309.aClass309_2634.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2635
					.method3615(0, (byte) 25))) {
				i_258_ = 2;
				string = string.substring(Class309.aClass309_2635.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2636
					.method3615(0, (byte) 25))) {
				i_258_ = 3;
				string = string.substring(Class309.aClass309_2636.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2637
					.method3615(0, (byte) 25))) {
				i_258_ = 4;
				string = string.substring(Class309.aClass309_2637.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2638
					.method3615(0, (byte) 25))) {
				i_258_ = 5;
				string = string.substring(Class309.aClass309_2638.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2639
					.method3615(0, (byte) 25))) {
				i_258_ = 6;
				string = string.substring(Class309.aClass309_2639.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2640
					.method3615(0, (byte) 25))) {
				i_258_ = 7;
				string = string.substring(Class309.aClass309_2640.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2641
					.method3615(0, (byte) 25))) {
				i_258_ = 8;
				string = string.substring(Class309.aClass309_2641.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2642
					.method3615(0, (byte) 25))) {
				i_258_ = 9;
				string = string.substring(Class309.aClass309_2642.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2643
					.method3615(0, (byte) 25))) {
				i_258_ = 10;
				string = string.substring(Class309.aClass309_2643.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2644
					.method3615(0, (byte) 25))) {
				i_258_ = 11;
				string = string.substring(Class309.aClass309_2644.method3615(0,
						(byte) 25).length());
			} else if (Class374.anInt3159 != 0) {
				if (string_257_.startsWith(Class309.aClass309_2633.method3615(
						Class374.anInt3159, (byte) 25))) {
					i_258_ = 0;
					string = string
							.substring(Class309.aClass309_2633.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2634
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_258_ = 1;
					string = string
							.substring(Class309.aClass309_2634.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2635
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_258_ = 2;
					string = string
							.substring(Class309.aClass309_2635.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2636
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_258_ = 3;
					string = string
							.substring(Class309.aClass309_2636.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2637
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_258_ = 4;
					string = string
							.substring(Class309.aClass309_2637.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2638
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_258_ = 5;
					string = string
							.substring(Class309.aClass309_2638.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2639
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_258_ = 6;
					string = string
							.substring(Class309.aClass309_2639.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2640
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_258_ = 7;
					string = string
							.substring(Class309.aClass309_2640.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2641
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_258_ = 8;
					string = string
							.substring(Class309.aClass309_2641.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2642
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_258_ = 9;
					string = string
							.substring(Class309.aClass309_2642.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2643
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_258_ = 10;
					string = string
							.substring(Class309.aClass309_2643.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2644
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_258_ = 11;
					string = string
							.substring(Class309.aClass309_2644.method3615(
									Class374.anInt3159, (byte) 25).length());
				}
			}
			string_257_ = string.toLowerCase();
			int i_259_ = 0;
			if (string_257_.startsWith(Class309.aClass309_2645.method3615(0,
					(byte) 25))) {
				i_259_ = 1;
				string = string.substring(Class309.aClass309_2645.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2646
					.method3615(0, (byte) 25))) {
				i_259_ = 2;
				string = string.substring(Class309.aClass309_2646.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2647
					.method3615(0, (byte) 25))) {
				i_259_ = 3;
				string = string.substring(Class309.aClass309_2647.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2648
					.method3615(0, (byte) 25))) {
				i_259_ = 4;
				string = string.substring(Class309.aClass309_2648.method3615(0,
						(byte) 25).length());
			} else if (string_257_.startsWith(Class309.aClass309_2649
					.method3615(0, (byte) 25))) {
				i_259_ = 5;
				string = string.substring(Class309.aClass309_2649.method3615(0,
						(byte) 25).length());
			} else if (Class374.anInt3159 != 0) {
				if (string_257_.startsWith(Class309.aClass309_2645.method3615(
						Class374.anInt3159, (byte) 25))) {
					i_259_ = 1;
					string = string
							.substring(Class309.aClass309_2645.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2646
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_259_ = 2;
					string = string
							.substring(Class309.aClass309_2646.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2647
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_259_ = 3;
					string = string
							.substring(Class309.aClass309_2647.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2648
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_259_ = 4;
					string = string
							.substring(Class309.aClass309_2648.method3615(
									Class374.anInt3159, (byte) 25).length());
				} else if (string_257_.startsWith(Class309.aClass309_2649
						.method3615(Class374.anInt3159, (byte) 25))) {
					i_259_ = 5;
					string = string
							.substring(Class309.aClass309_2649.method3615(
									Class374.anInt3159, (byte) 25).length());
				}
			}
			final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4.method3023(
					260, Surface.aClass171_665, Class331.aClass117_2811);
			class98_sub11.aClass98_Sub22_Sub1_3865.method1194(0, 70);
			final int i_260_ = (((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position);
			class98_sub11.aClass98_Sub22_Sub1_3865.method1194(i_258_, 122);
			class98_sub11.aClass98_Sub22_Sub1_3865.method1194(i_259_, -54);
			Class284_Sub1_Sub1.method3368(127, string,
					(class98_sub11.aClass98_Sub22_Sub1_3865));
			class98_sub11.aClass98_Sub22_Sub1_3865
					.method1211(
							(byte) 84,
							(((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position)
									- i_260_);
			Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
		}
	}

	static final void method3152(final Class105 class105, final int i,
			final int i_261_) {
		final Class98_Sub46_Sub4 class98_sub46_sub4 = Class213.method2779(
				(byte) -109, i_261_, i, class105);
		if (class98_sub46_sub4 != null) {
			anIntArray1875 = new int[class98_sub46_sub4.anInt5958];
			aStringArray1886 = (new String[class98_sub46_sub4.anInt5964]);
			if ((class98_sub46_sub4.aClass105_5957 == Class90.aClass105_719)
					|| (class98_sub46_sub4.aClass105_5957 == Class331.aClass105_2792)
					|| (class98_sub46_sub4.aClass105_5957 == Class98_Sub10_Sub26.aClass105_5684)) {
				int i_262_ = 0;
				int i_263_ = 0;
				if (Class11.aClass293_120 != null) {
					i_262_ = Class11.aClass293_120.anInt2347;
					i_263_ = Class11.aClass293_120.anInt2299;
				}
				anIntArray1875[0] = Class2.aClass299_73.method3514(112)
						- i_262_;
				anIntArray1875[1] = Class2.aClass299_73.method3507((byte) 72)
						- i_263_;
			}
			method3153(class98_sub46_sub4, 200000, -1);
		}
	}

	private static final void method3153(Class98_Sub46_Sub4 class98_sub46_sub4,
			final int i, final int scriptId) {
		anInt1885 = 0;
		anInt1884 = 0;
		int i_264_ = -1;
		int[] is = class98_sub46_sub4.anIntArray5963;
		int[] is_265_ = class98_sub46_sub4.anIntArray5967;
		int i_266_ = -1;
		anInt1888 = 0;
		try {
			int i_267_ = 0;
			for (;;) {
				if (++i_267_ > i) {
					throw new RuntimeException("slow");
				}
				i_266_ = is[++i_264_];
				if (i_266_ < 100) {
					if (i_266_ == 0) {
						anIntArray1878[anInt1885++] = is_265_[i_264_];
					} else if (i_266_ == 1) {
						final int i_268_ = is_265_[i_264_];
						anIntArray1878[anInt1885++] = (Class75.aClass140_584.anIntArray3244[i_268_]);
					} else if (i_266_ == 2) {
						final int i_269_ = is_265_[i_264_];
						Class75.aClass140_584.method2291(i_269_, 98,
								(anIntArray1878[--anInt1885]));
					} else if (i_266_ == 3) {
						aStringArray1883[anInt1884++] = (class98_sub46_sub4.aStringArray5959[i_264_]);
					} else if (i_266_ == 6) {
						i_264_ += is_265_[i_264_];
					} else if (i_266_ == 7) {
						anInt1885 -= 2;
						if (anIntArray1878[anInt1885] != anIntArray1878[anInt1885 + 1]) {
							i_264_ += is_265_[i_264_];
						}
					} else if (i_266_ == 8) {
						anInt1885 -= 2;
						if (anIntArray1878[anInt1885] == anIntArray1878[anInt1885 + 1]) {
							i_264_ += is_265_[i_264_];
						}
					} else if (i_266_ == 9) {
						anInt1885 -= 2;
						if (anIntArray1878[anInt1885] < anIntArray1878[anInt1885 + 1]) {
							i_264_ += is_265_[i_264_];
						}
					} else if (i_266_ == 10) {
						anInt1885 -= 2;
						if (anIntArray1878[anInt1885] > anIntArray1878[anInt1885 + 1]) {
							i_264_ += is_265_[i_264_];
						}
					} else if (i_266_ == 21) {
						if (anInt1888 == 0) {
							return;
						}
						final Class349 class349 = aClass349Array1889[--anInt1888];
						class98_sub46_sub4 = class349.aClass98_Sub46_Sub4_2918;
						is = (class98_sub46_sub4.anIntArray5963);
						is_265_ = (class98_sub46_sub4.anIntArray5967);
						i_264_ = class349.anInt2919;
						anIntArray1875 = class349.anIntArray2916;
						aStringArray1886 = class349.aStringArray2917;
					} else if (i_266_ == 25) {
						final int i_270_ = is_265_[i_264_];
						anIntArray1878[anInt1885++] = Class75.aClass140_584
								.method7(i_270_, 7373);
					} else if (i_266_ == 27) {
						final int i_271_ = is_265_[i_264_];
						Class75.aClass140_584.method2289(
								(anIntArray1878[--anInt1885]), i_271_, 0);
					} else if (i_266_ == 31) {
						anInt1885 -= 2;
						if (anIntArray1878[anInt1885] <= anIntArray1878[anInt1885 + 1]) {
							i_264_ += is_265_[i_264_];
						}
					} else if (i_266_ == 32) {
						anInt1885 -= 2;
						if (anIntArray1878[anInt1885] >= anIntArray1878[anInt1885 + 1]) {
							i_264_ += is_265_[i_264_];
						}
					} else if (i_266_ == 33) {
						anIntArray1878[anInt1885++] = anIntArray1875[is_265_[i_264_]];
					} else if (i_266_ == 34) {
						anIntArray1875[is_265_[i_264_]] = anIntArray1878[--anInt1885];
					} else if (i_266_ == 35) {
						aStringArray1883[anInt1884++] = aStringArray1886[is_265_[i_264_]];
					} else if (i_266_ == 36) {
						aStringArray1886[is_265_[i_264_]] = aStringArray1883[--anInt1884];
					} else if (i_266_ == 37) {
						final int i_272_ = is_265_[i_264_];
						anInt1884 -= i_272_;
						final String string = Class98_Sub5_Sub2.method968(
								i_272_, aStringArray1883, anInt1884, -17120);
						aStringArray1883[anInt1884++] = string;
					} else if (i_266_ == 38) {
						anInt1885--;
					} else if (i_266_ == 39) {
						anInt1884--;
					} else if (i_266_ == 40) {
						final int i_273_ = is_265_[i_264_];
						final Class98_Sub46_Sub4 class98_sub46_sub4_274_ = Class98_Sub46_Sub13_Sub2
								.method1601(i_273_, 100);
						if (class98_sub46_sub4_274_ == null) {
							throw new RuntimeException();
						}
						final int[] is_275_ = (new int[(class98_sub46_sub4_274_.anInt5958)]);
						final String[] strings = (new String[(class98_sub46_sub4_274_.anInt5964)]);
						for (int i_276_ = 0; (i_276_ < (class98_sub46_sub4_274_.anInt5966)); i_276_++) {
							is_275_[i_276_] = (anIntArray1878[anInt1885
									- (class98_sub46_sub4_274_.anInt5966)
									+ i_276_]);
						}
						for (int i_277_ = 0; (i_277_ < (class98_sub46_sub4_274_.anInt5965)); i_277_++) {
							strings[i_277_] = (aStringArray1883[anInt1884
									- (class98_sub46_sub4_274_.anInt5965)
									+ i_277_]);
						}
						anInt1885 -= (class98_sub46_sub4_274_.anInt5966);
						anInt1884 -= (class98_sub46_sub4_274_.anInt5965);
						final Class349 class349 = new Class349();
						class349.aClass98_Sub46_Sub4_2918 = class98_sub46_sub4;
						class349.anInt2919 = i_264_;
						class349.anIntArray2916 = anIntArray1875;
						class349.aStringArray2917 = aStringArray1886;
						if (anInt1888 >= aClass349Array1889.length) {
							throw new RuntimeException();
						}
						aClass349Array1889[anInt1888++] = class349;
						class98_sub46_sub4 = class98_sub46_sub4_274_;
						is = (class98_sub46_sub4.anIntArray5963);
						is_265_ = (class98_sub46_sub4.anIntArray5967);
						i_264_ = -1;
						anIntArray1875 = is_275_;
						aStringArray1886 = strings;
					} else if (i_266_ == 42) {
						anIntArray1878[anInt1885++] = Class76_Sub5.anIntArray3744[is_265_[i_264_]];
					} else if (i_266_ == 43) {
						final int i_278_ = is_265_[i_264_];
						Class76_Sub5.anIntArray3744[i_278_] = anIntArray1878[--anInt1885];
						Class119_Sub1.method2180(i_278_, 15233);
						Class66.aBoolean507 |= Class140.aBooleanArray3246[i_278_];
					} else if (i_266_ == 44) {
						final int i_279_ = is_265_[i_264_] >> 16;
						final int i_280_ = is_265_[i_264_] & 0xffff;
						final int i_281_ = anIntArray1878[--anInt1885];
						if (i_281_ < 0 || i_281_ > 5000) {
							throw new RuntimeException();
						}
						anIntArray1887[i_279_] = i_281_;
						int i_282_ = -1;
						if (i_280_ == 105) {
							i_282_ = 0;
						}
						for (int i_283_ = 0; i_283_ < i_281_; i_283_++) {
							anIntArrayArray1881[i_279_][i_283_] = i_282_;
						}
					} else if (i_266_ == 45) {
						final int i_284_ = is_265_[i_264_];
						final int i_285_ = anIntArray1878[--anInt1885];
						if (i_285_ < 0 || i_285_ >= anIntArray1887[i_284_]) {
							throw new RuntimeException();
						}
						anIntArray1878[anInt1885++] = anIntArrayArray1881[i_284_][i_285_];
					} else if (i_266_ == 46) {
						final int i_286_ = is_265_[i_264_];
						anInt1885 -= 2;
						final int i_287_ = anIntArray1878[anInt1885];
						if (i_287_ < 0 || i_287_ >= anIntArray1887[i_286_]) {
							throw new RuntimeException();
						}
						anIntArrayArray1881[i_286_][i_287_] = anIntArray1878[anInt1885 + 1];
					} else if (i_266_ == 47) {
						String string = Class151_Sub1.aStringArray4967[is_265_[i_264_]];
						if (string == null) {
							string = "null";
						}
						aStringArray1883[anInt1884++] = string;
					} else if (i_266_ == 48) {
						final int i_288_ = is_265_[i_264_];
						Class151_Sub1.aStringArray4967[i_288_] = aStringArray1883[--anInt1884];
						Class347.method3833(i_288_, 2);
					} else if (i_266_ == 51) {
						final Class377 class377 = (class98_sub46_sub4.aClass377Array5956[is_265_[i_264_]]);
						final Class98_Sub34 class98_sub34 = ((Class98_Sub34) class377
								.method3990((anIntArray1878[--anInt1885]), -1));
						if (class98_sub34 != null) {
							i_264_ += class98_sub34.anInt4126;
						}
					} else if (i_266_ == 86) {
						if (anIntArray1878[--anInt1885] == 1) {
							i_264_ += is_265_[i_264_];
						}
					} else if (i_266_ == 87 && anIntArray1878[--anInt1885] == 0) {
						i_264_ += is_265_[i_264_];
					}
				} else {
					boolean bool;
					if (is_265_[i_264_] == 1) {
						bool = true;
					} else {
						bool = false;
					}
					if (i_266_ >= 100 && i_266_ < 5000) {
						method3148(i_266_, bool, scriptId);
					} else {
						if (i_266_ < 5000 || i_266_ >= 10000) {
							break;
						}
						method3156(i_266_, bool);
					}
				}
			}
			throw new IllegalStateException("Command: " + i_266_);
		} catch (final Exception exception) {
			if (class98_sub46_sub4.aString5968 != null) {
				za_Sub2.method1684(
						("Clientscript error in: " + class98_sub46_sub4.aString5968),
						4, (byte) 68);
				final StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("Clientscript error in: ")
						.append(class98_sub46_sub4.aString5968).append("\n");
				for (int i_289_ = anInt1888 - 1; i_289_ >= 0; i_289_--) {
					stringbuffer
							.append("via: ")
							.append((aClass349Array1889[i_289_].aClass98_Sub46_Sub4_2918).aString5968)
							.append("\n");
				}
				stringbuffer.append("Op: ").append(i_266_).append("\n");
				final String string = exception.getMessage();
				if (string != null && string.length() > 0) {
					stringbuffer.append("Message: ").append(string)
							.append("\n");
				}
				Class305_Sub1.method3585(exception, -125,
						stringbuffer.toString());
				Class98_Sub46.method1525(stringbuffer.toString(), -126);
			} else {
				final StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("CS2: ")
						.append(((Class98) class98_sub46_sub4).aLong832)
						.append(" ");
				for (int i_290_ = anInt1888 - 1; i_290_ >= 0; i_290_--) {
					stringbuffer
							.append("v: ")
							.append(((Class98) (aClass349Array1889[i_290_].aClass98_Sub46_Sub4_2918)).aLong832)
							.append(" ");
				}
				stringbuffer.append("op: ").append(i_266_);
				Class305_Sub1.method3585(exception, -125,
						stringbuffer.toString());
			}
		}
	}

	public static void method3154() {
		anIntArray1875 = null;
		aStringArray1886 = null;
		anIntArray1887 = null;
		anIntArrayArray1881 = null;
		anIntArray1878 = null;
		aStringArray1883 = null;
		aClass349Array1889 = null;
		aClass293_1879 = null;
		aClass293_1877 = null;
		aClass300_1876 = null;
		aCalendar1882 = null;
		aStringArray1892 = null;
		anIntArray1891 = null;
		aClass79_1890 = null;
	}

	static final void method3155(final int i) {
		if (i != -1 && Class85.method837(i, 73)) {
			final Class293[] class293s = Class159.aClass293ArrayArray1252[i];
			for (int i_291_ = 0; i_291_ < class293s.length; i_291_++) {
				final Class293 class293 = class293s[i_291_];
				if (class293.anObjectArray2332 != null) {
					final Class98_Sub21 class98_sub21 = new Class98_Sub21();
					class98_sub21.aClass293_3986 = class293;
					class98_sub21.anObjectArray3981 = class293.anObjectArray2332;
					method3150(class98_sub21, 2000000);
				}
			}
		}
	}

	private static final void method3156(final int i, final boolean bool) {
		if (i < 5100) {
			if (i == 5000) {
				anIntArray1878[anInt1885++] = Class265.anInt1983;
				return;
			}
			if (i == 5001) {
				anInt1885 -= 3;
				Class265.anInt1983 = anIntArray1878[anInt1885];
				Class86.aClass350_649 = Class98_Sub10_Sub8.method1029(
						(byte) -107, (anIntArray1878[anInt1885 + 1]));
				if (Class86.aClass350_649 == null) {
					Class86.aClass350_649 = Class98_Sub27.aClass350_4074;
				}
				Class98.anInt837 = anIntArray1878[anInt1885 + 2];
				final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
						.method3023(260, (Class98_Sub17_Sub1.aClass171_5781),
								Class331.aClass117_2811);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
						Class265.anInt1983, -77);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
						Class86.aClass350_649.anInt2920, -57);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(
						Class98.anInt837, 120);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5002) {
				anInt1884 -= 2;
				final String string = aStringArray1883[anInt1884];
				String string_292_ = aStringArray1883[anInt1884 + 1];
				anInt1885 -= 2;
				final int i_293_ = anIntArray1878[anInt1885];
				final int i_294_ = anIntArray1878[anInt1885 + 1];
				if (string_292_ == null) {
					string_292_ = "";
				}
				if (string_292_.length() > 80) {
					string_292_ = string_292_.substring(0, 80);
				}
				final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
						.method3023(260, (Class64_Sub7.aClass171_3657),
								Class331.aClass117_2811);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194((r_Sub2
						.method1650(string, (byte) 109) + 2 + r_Sub2
						.method1650(string_292_, (byte) 110)), 52);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1188(string,
						(byte) 113);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(i_293_ - 1,
						-91);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(i_294_, 108);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1188(string_292_,
						(byte) 113);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5003) {
				final int i_295_ = anIntArray1878[--anInt1885];
				final Class131 class131 = Class138
						.method2280((byte) 49, i_295_);
				String string = "";
				if (class131 != null && class131.aString1041 != null) {
					string = class131.aString1041;
				}
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5004) {
				final int i_296_ = anIntArray1878[--anInt1885];
				final Class131 class131 = Class138
						.method2280((byte) 49, i_296_);
				int i_297_ = -1;
				if (class131 != null) {
					i_297_ = class131.anInt1040;
				}
				anIntArray1878[anInt1885++] = i_297_;
				return;
			}
			if (i == 5005) {
				if (Class86.aClass350_649 == null) {
					anIntArray1878[anInt1885++] = -1;
				} else {
					anIntArray1878[anInt1885++] = Class86.aClass350_649.anInt2920;
					return;
				}
				return;
			}
			if (i == 5006) {
				final int i_298_ = anIntArray1878[--anInt1885];
				final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
						.method3023(260, (Class146_Sub3.aClass171_4900),
								Class331.aClass117_2811);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(i_298_, 55);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5008) {
				final String string = aStringArray1883[--anInt1884];
				method3151(string, i);
				return;
			}
			if (i == 5009) {
				anInt1884 -= 2;
				final String string = aStringArray1883[anInt1884];
				final String string_299_ = aStringArray1883[anInt1884 + 1];
				if (Class282.anInt2125 != 0
						|| ((!Class109.aBoolean933 || Class98_Sub10_Sub35.aBoolean5732) && !Model.aBoolean1401)) {
					final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
							.method3023(260,
									(Class246_Sub4_Sub2.aClass171_6185),
									(Class331.aClass117_2811));
					class98_sub11.aClass98_Sub22_Sub1_3865.method1194(0, -83);
					final int i_300_ = (((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position);
					class98_sub11.aClass98_Sub22_Sub1_3865.method1188(string,
							(byte) 113);
					Class284_Sub1_Sub1.method3368(127, string_299_,
							(class98_sub11.aClass98_Sub22_Sub1_3865));
					class98_sub11.aClass98_Sub22_Sub1_3865
							.method1211(
									(byte) 98,
									(((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position)
											- i_300_);
					Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
					return;
				}
				return;
			}
			if (i == 5010) {
				final int i_301_ = anIntArray1878[--anInt1885];
				final Class131 class131 = Class138
						.method2280((byte) 49, i_301_);
				String string = "";
				if (class131 != null && class131.aString1033 != null) {
					string = class131.aString1033;
				}
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5011) {
				final int i_302_ = anIntArray1878[--anInt1885];
				final Class131 class131 = Class138
						.method2280((byte) 49, i_302_);
				String string = "";
				if (class131 != null && class131.aString1032 != null) {
					string = class131.aString1032;
				}
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5012) {
				final int i_303_ = anIntArray1878[--anInt1885];
				final Class131 class131 = Class138
						.method2280((byte) 49, i_303_);
				int i_304_ = -1;
				if (class131 != null) {
					i_304_ = class131.anInt1036;
				}
				anIntArray1878[anInt1885++] = i_304_;
				return;
			}
			if (i == 5015) {
				String string;
				if (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660 != null
						&& (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aString6536 != null)) {
					string = Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660
							.method3063(0, true);
				} else {
					string = "";
				}
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5016) {
				anIntArray1878[anInt1885++] = Class98.anInt837;
				return;
			}
			if (i == 5017) {
				anIntArray1878[anInt1885++] = Class98_Sub10_Sub27
						.method1086((byte) -4);
				return;
			}
			if (i == 5018) {
				final int i_305_ = anIntArray1878[--anInt1885];
				final Class131 class131 = Class138
						.method2280((byte) 49, i_305_);
				int i_306_ = 0;
				if (class131 != null) {
					i_306_ = class131.anInt1035;
				}
				anIntArray1878[anInt1885++] = i_306_;
				return;
			}
			if (i == 5019) {
				final int i_307_ = anIntArray1878[--anInt1885];
				final Class131 class131 = Class138
						.method2280((byte) 49, i_307_);
				String string = "";
				if (class131 != null && class131.aString1034 != null) {
					string = class131.aString1034;
				}
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5020) {
				String string;
				if (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660 != null
						&& (Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660.aString6536 != null)) {
					string = Surface.aClass246_Sub3_Sub4_Sub2_Sub2_660
							.method3059(-1, false);
				} else {
					string = "";
				}
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5023) {
				final int i_308_ = anIntArray1878[--anInt1885];
				final Class131 class131 = Class138
						.method2280((byte) 49, i_308_);
				int i_309_ = -1;
				if (class131 != null) {
					i_309_ = class131.anInt1037;
				}
				anIntArray1878[anInt1885++] = i_309_;
				return;
			}
			if (i == 5024) {
				final int i_310_ = anIntArray1878[--anInt1885];
				final Class131 class131 = Class138
						.method2280((byte) 49, i_310_);
				int i_311_ = -1;
				if (class131 != null) {
					i_311_ = class131.anInt1039;
				}
				anIntArray1878[anInt1885++] = i_311_;
				return;
			}
			if (i == 5025) {
				final int i_312_ = anIntArray1878[--anInt1885];
				final Class131 class131 = Class138
						.method2280((byte) 49, i_312_);
				String string = "";
				if (class131 != null && class131.aString1042 != null) {
					string = class131.aString1042;
				}
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5050) {
				final int i_313_ = anIntArray1878[--anInt1885];
				aStringArray1883[anInt1884++] = (Class218.aClass212_1634
						.method2777(28559, i_313_).aString5941);
				return;
			}
			if (i == 5051) {
				final int i_314_ = anIntArray1878[--anInt1885];
				final Class98_Sub46_Sub1 class98_sub46_sub1 = Class218.aClass212_1634
						.method2777(28559, i_314_);
				if (class98_sub46_sub1.anIntArray5944 == null) {
					anIntArray1878[anInt1885++] = 0;
				} else {
					anIntArray1878[anInt1885++] = (class98_sub46_sub1.anIntArray5944).length;
					return;
				}
				return;
			}
			if (i == 5052) {
				anInt1885 -= 2;
				final int i_315_ = anIntArray1878[anInt1885];
				final int i_316_ = anIntArray1878[anInt1885 + 1];
				final Class98_Sub46_Sub1 class98_sub46_sub1 = Class218.aClass212_1634
						.method2777(28559, i_315_);
				final int i_317_ = (class98_sub46_sub1.anIntArray5944[i_316_]);
				anIntArray1878[anInt1885++] = i_317_;
				return;
			}
			if (i == 5053) {
				final int i_318_ = anIntArray1878[--anInt1885];
				final Class98_Sub46_Sub1 class98_sub46_sub1 = Class218.aClass212_1634
						.method2777(28559, i_318_);
				if (class98_sub46_sub1.anIntArray5942 == null) {
					anIntArray1878[anInt1885++] = 0;
				} else {
					anIntArray1878[anInt1885++] = (class98_sub46_sub1.anIntArray5942).length;
					return;
				}
				return;
			}
			if (i == 5054) {
				anInt1885 -= 2;
				final int i_319_ = anIntArray1878[anInt1885];
				final int i_320_ = anIntArray1878[anInt1885 + 1];
				anIntArray1878[anInt1885++] = (Class218.aClass212_1634
						.method2777(28559, i_319_).anIntArray5942[i_320_]);
				return;
			}
			if (i == 5055) {
				final int i_321_ = anIntArray1878[--anInt1885];
				aStringArray1883[anInt1884++] = Class52.aClass280_3500
						.method3325(i_321_, 51).method1582(false);
				return;
			}
			if (i == 5056) {
				final int i_322_ = anIntArray1878[--anInt1885];
				final Class98_Sub46_Sub11 class98_sub46_sub11 = Class52.aClass280_3500
						.method3325(i_322_, 53);
				if (class98_sub46_sub11.anIntArray6029 == null) {
					anIntArray1878[anInt1885++] = 0;
				} else {
					anIntArray1878[anInt1885++] = (class98_sub46_sub11.anIntArray6029).length;
					return;
				}
				return;
			}
			if (i == 5057) {
				anInt1885 -= 2;
				final int i_323_ = anIntArray1878[anInt1885];
				final int i_324_ = anIntArray1878[anInt1885 + 1];
				anIntArray1878[anInt1885++] = (Class52.aClass280_3500
						.method3325(i_323_, 74).anIntArray6029[i_324_]);
				return;
			}
			if (i == 5058) {
				aClass300_1876 = new Class300();
				aClass300_1876.anInt2496 = anIntArray1878[--anInt1885];
				aClass300_1876.aClass98_Sub46_Sub11_2498 = Class52.aClass280_3500
						.method3325((aClass300_1876.anInt2496), 98);
				aClass300_1876.anIntArray2497 = new int[aClass300_1876.aClass98_Sub46_Sub11_2498
						.method1574((byte) -111)];
				return;
			}
			if (i == 5059) {
				anInt1880++;
				final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
						.method3023(260, (Class246_Sub3_Sub1.aClass171_6148),
								Class331.aClass117_2811);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(0, 59);
				final int i_325_ = (((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(0, 72);
				class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
						aClass300_1876.anInt2496, 1571862888);
				aClass300_1876.aClass98_Sub46_Sub11_2498.method1579(
						class98_sub11.aClass98_Sub22_Sub1_3865,
						aClass300_1876.anIntArray2497, -3);
				class98_sub11.aClass98_Sub22_Sub1_3865
						.method1211(
								(byte) 98,
								(((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position - i_325_));
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5060) {
				final String string = aStringArray1883[--anInt1884];
				final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
						.method3023(260, (Class98_Sub17_Sub1.aClass171_5780),
								Class331.aClass117_2811);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(0, -109);
				final int i_326_ = (((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1188(string,
						(byte) 113);
				class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
						aClass300_1876.anInt2496, 1571862888);
				aClass300_1876.aClass98_Sub46_Sub11_2498.method1579(
						class98_sub11.aClass98_Sub22_Sub1_3865,
						aClass300_1876.anIntArray2497, -3);
				class98_sub11.aClass98_Sub22_Sub1_3865
						.method1211(
								(byte) 115,
								(((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position - i_326_));
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5061) {
				anInt1880++;
				final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
						.method3023(260, (Class246_Sub3_Sub1.aClass171_6148),
								Class331.aClass117_2811);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(0, 91);
				final int i_327_ = (((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(1, -118);
				class98_sub11.aClass98_Sub22_Sub1_3865.writeShort(
						aClass300_1876.anInt2496, 1571862888);
				aClass300_1876.aClass98_Sub46_Sub11_2498.method1579(
						class98_sub11.aClass98_Sub22_Sub1_3865,
						aClass300_1876.anIntArray2497, -3);
				class98_sub11.aClass98_Sub22_Sub1_3865
						.method1211(
								(byte) 118,
								(((ByteBuffer) (class98_sub11.aClass98_Sub22_Sub1_3865)).position - i_327_));
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5062) {
				anInt1885 -= 2;
				final int i_328_ = anIntArray1878[anInt1885];
				final int i_329_ = anIntArray1878[anInt1885 + 1];
				anIntArray1878[anInt1885++] = (Class218.aClass212_1634
						.method2777(28559, i_328_).aCharArray5946[i_329_]);
				return;
			}
			if (i == 5063) {
				anInt1885 -= 2;
				final int i_330_ = anIntArray1878[anInt1885];
				final int i_331_ = anIntArray1878[anInt1885 + 1];
				anIntArray1878[anInt1885++] = (Class218.aClass212_1634
						.method2777(28559, i_330_).aCharArray5947[i_331_]);
				return;
			}
			if (i == 5064) {
				anInt1885 -= 2;
				final int i_332_ = anIntArray1878[anInt1885];
				final int i_333_ = anIntArray1878[anInt1885 + 1];
				if (i_333_ == -1) {
					anIntArray1878[anInt1885++] = -1;
				} else {
					anIntArray1878[anInt1885++] = Class218.aClass212_1634
							.method2777(28559, i_332_).method1528(-1,
									(char) i_333_);
					return;
				}
				return;
			}
			if (i == 5065) {
				anInt1885 -= 2;
				final int i_334_ = anIntArray1878[anInt1885];
				final int i_335_ = anIntArray1878[anInt1885 + 1];
				if (i_335_ == -1) {
					anIntArray1878[anInt1885++] = -1;
				} else {
					anIntArray1878[anInt1885++] = Class218.aClass212_1634
							.method2777(28559, i_334_).method1529(
									(char) i_335_, (byte) -126);
					return;
				}
				return;
			}
			if (i == 5066) {
				final int i_336_ = anIntArray1878[--anInt1885];
				anIntArray1878[anInt1885++] = Class52.aClass280_3500
						.method3325(i_336_, 109).method1574((byte) -109);
				return;
			}
			if (i == 5067) {
				anInt1885 -= 2;
				final int i_337_ = anIntArray1878[anInt1885];
				final int i_338_ = anIntArray1878[anInt1885 + 1];
				final int i_339_ = (Class52.aClass280_3500.method3325(i_337_,
						67).method1580(i_338_, 78).anInt2909);
				anIntArray1878[anInt1885++] = i_339_;
				return;
			}
			if (i == 5068) {
				anInt1885 -= 2;
				final int i_340_ = anIntArray1878[anInt1885];
				final int i_341_ = anIntArray1878[anInt1885 + 1];
				aClass300_1876.anIntArray2497[i_340_] = i_341_;
				return;
			}
			if (i == 5069) {
				anInt1885 -= 2;
				final int i_342_ = anIntArray1878[anInt1885];
				final int i_343_ = anIntArray1878[anInt1885 + 1];
				aClass300_1876.anIntArray2497[i_342_] = i_343_;
				return;
			}
			if (i == 5070) {
				anInt1885 -= 3;
				final int i_344_ = anIntArray1878[anInt1885];
				final int i_345_ = anIntArray1878[anInt1885 + 1];
				final int i_346_ = anIntArray1878[anInt1885 + 2];
				final Class98_Sub46_Sub11 class98_sub46_sub11 = Class52.aClass280_3500
						.method3325(i_344_, 65);
				if ((class98_sub46_sub11.method1580(i_345_, -126).anInt2909) != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray1878[anInt1885++] = class98_sub46_sub11.method1583(
						121, i_346_, i_345_);
				return;
			}
			if (i == 5071) {
				final String string = aStringArray1883[--anInt1884];
				final boolean bool_347_ = anIntArray1878[--anInt1885] == 1;
				Class207.method2759(bool_347_, string, (byte) 69);
				anIntArray1878[anInt1885++] = Class18.anInt214;
				return;
			}
			if (i == 5072) {
				if (Class64_Sub16.aShortArray3682 == null
						|| Class85.anInt638 >= Class18.anInt214) {
					anIntArray1878[anInt1885++] = -1;
				} else {
					anIntArray1878[anInt1885++] = (Class64_Sub16.aShortArray3682[Class85.anInt638++] & 0xffff);
					return;
				}
				return;
			}
			if (i == 5073) {
				Class85.anInt638 = 0;
				return;
			}
		} else if (i < 5200) {
			if (i == 5100) {
				if (Class219.aClass77_1641.method779(86, 5503)) {
					anIntArray1878[anInt1885++] = 1;
				} else {
					anIntArray1878[anInt1885++] = 0;
					return;
				}
				return;
			}
			if (i == 5101) {
				if (Class219.aClass77_1641.method779(82, 5503)) {
					anIntArray1878[anInt1885++] = 1;
				} else {
					anIntArray1878[anInt1885++] = 0;
					return;
				}
				return;
			}
			if (i == 5102) {
				if (Class219.aClass77_1641.method779(81, 5503)) {
					anIntArray1878[anInt1885++] = 1;
				} else {
					anIntArray1878[anInt1885++] = 0;
					return;
				}
				return;
			}
		} else if (i < 5300) {
			if (i == 5200) {
				Class98_Sub46_Sub2.method1534(anIntArray1878[--anInt1885],
						false);
				return;
			}
			if (i == 5201) {
				anIntArray1878[anInt1885++] = Class64.method553(1024);
				return;
			}
			if (i == 5205) {
				Class119.method2176(-1, false, anIntArray1878[--anInt1885],
						(byte) 89, -1);
				return;
			}
			if (i == 5206) {
				final int i_348_ = anIntArray1878[--anInt1885];
				final Class98_Sub46_Sub10 class98_sub46_sub10 = Class278
						.method3303(i_348_ >> 14 & 0x3fff, i_348_ & 0x3fff);
				if (class98_sub46_sub10 == null) {
					anIntArray1878[anInt1885++] = -1;
				} else {
					anIntArray1878[anInt1885++] = (class98_sub46_sub10.anInt6014);
					return;
				}
				return;
			}
			if (i == 5207) {
				final Class98_Sub46_Sub10 class98_sub46_sub10 = Class278
						.method3306(anIntArray1878[--anInt1885]);
				if (class98_sub46_sub10 == null
						|| (class98_sub46_sub10.aString6005 == null)) {
					aStringArray1883[anInt1884++] = "";
				} else {
					aStringArray1883[anInt1884++] = (class98_sub46_sub10.aString6005);
					return;
				}
				return;
			}
			if (i == 5208) {
				anIntArray1878[anInt1885++] = aa.anInt48;
				anIntArray1878[anInt1885++] = Class246_Sub3_Sub5_Sub2.anInt6268;
				return;
			}
			if (i == 5209) {
				anIntArray1878[anInt1885++] = Class42_Sub4.anInt5371
						+ Class278.anInt2075;
				anIntArray1878[anInt1885++] = Class98_Sub40.anInt4197
						+ Class278.anInt2078;
				return;
			}
			if (i == 5210) {
				final int i_349_ = anIntArray1878[--anInt1885];
				final Class98_Sub46_Sub10 class98_sub46_sub10 = Class278
						.method3306(i_349_);
				if (class98_sub46_sub10 == null) {
					anIntArray1878[anInt1885++] = 0;
					anIntArray1878[anInt1885++] = 0;
				} else {
					anIntArray1878[anInt1885++] = (class98_sub46_sub10.anInt6006) >> 14 & 0x3fff;
					anIntArray1878[anInt1885++] = (class98_sub46_sub10.anInt6006) & 0x3fff;
					return;
				}
				return;
			}
			if (i == 5211) {
				final int i_350_ = anIntArray1878[--anInt1885];
				final Class98_Sub46_Sub10 class98_sub46_sub10 = Class278
						.method3306(i_350_);
				if (class98_sub46_sub10 == null) {
					anIntArray1878[anInt1885++] = 0;
					anIntArray1878[anInt1885++] = 0;
				} else {
					anIntArray1878[anInt1885++] = ((class98_sub46_sub10.anInt6016) - (class98_sub46_sub10.anInt6008));
					anIntArray1878[anInt1885++] = ((class98_sub46_sub10.anInt6023) - (class98_sub46_sub10.anInt6009));
					return;
				}
				return;
			}
			if (i == 5212) {
				final Class98_Sub47 class98_sub47 = Class256_Sub1
						.method3196((byte) -99);
				if (class98_sub47 == null) {
					anIntArray1878[anInt1885++] = -1;
					anIntArray1878[anInt1885++] = -1;
				} else {
					anIntArray1878[anInt1885++] = class98_sub47.anInt4268;
					final int i_351_ = (class98_sub47.anInt4269 << 28
							| (class98_sub47.anInt4272 + Class278.anInt2075) << 14 | (class98_sub47.anInt4267 + Class278.anInt2078));
					anIntArray1878[anInt1885++] = i_351_;
					return;
				}
				return;
			}
			if (i == 5213) {
				final Class98_Sub47 class98_sub47 = Class246_Sub3
						.method2979(-105);
				if (class98_sub47 == null) {
					anIntArray1878[anInt1885++] = -1;
					anIntArray1878[anInt1885++] = -1;
				} else {
					anIntArray1878[anInt1885++] = class98_sub47.anInt4268;
					final int i_352_ = (class98_sub47.anInt4269 << 28
							| (class98_sub47.anInt4272 + Class278.anInt2075) << 14 | (class98_sub47.anInt4267 + Class278.anInt2078));
					anIntArray1878[anInt1885++] = i_352_;
					return;
				}
				return;
			}
			if (i == 5214) {
				final int i_353_ = anIntArray1878[--anInt1885];
				final Class98_Sub46_Sub10 class98_sub46_sub10 = Class98_Sub10_Sub8
						.method1026(-3);
				if (class98_sub46_sub10 != null) {
					final boolean bool_354_ = class98_sub46_sub10.method1573(
							i_353_ >> 28 & 0x3, anIntArray1891, -90,
							i_353_ & 0x3fff, (i_353_ >> 14 & 0x3fff));
					if (bool_354_) {
						Class246_Sub2.method2971(anIntArray1891[2], (byte) 39,
								anIntArray1891[1]);
					}
				}
				return;
			}
			if (i == 5215) {
				anInt1885 -= 2;
				final int i_355_ = anIntArray1878[anInt1885];
				final int i_356_ = anIntArray1878[anInt1885 + 1];
				final Class215 class215 = Class278.method3296(
						i_355_ >> 14 & 0x3fff, i_355_ & 0x3fff);
				boolean bool_357_ = false;
				for (Class98_Sub46_Sub10 class98_sub46_sub10 = (Class98_Sub46_Sub10) class215
						.method2792(-1); class98_sub46_sub10 != null; class98_sub46_sub10 = (Class98_Sub46_Sub10) class215
						.method2787(0)) {
					if (class98_sub46_sub10.anInt6014 == i_356_) {
						bool_357_ = true;
						break;
					}
				}
				if (bool_357_) {
					anIntArray1878[anInt1885++] = 1;
				} else {
					anIntArray1878[anInt1885++] = 0;
					return;
				}
				return;
			}
			if (i == 5218) {
				final int i_358_ = anIntArray1878[--anInt1885];
				final Class98_Sub46_Sub10 class98_sub46_sub10 = Class278
						.method3306(i_358_);
				if (class98_sub46_sub10 == null) {
					anIntArray1878[anInt1885++] = -1;
				} else {
					anIntArray1878[anInt1885++] = (class98_sub46_sub10.anInt6007);
					return;
				}
				return;
			}
			if (i == 5220) {
				anIntArray1878[anInt1885++] = Class212.anInt1600 == 100 ? 1 : 0;
				return;
			}
			if (i == 5221) {
				final int i_359_ = anIntArray1878[--anInt1885];
				Class246_Sub2.method2971(i_359_ & 0x3fff, (byte) 100,
						i_359_ >> 14 & 0x3fff);
				return;
			}
			if (i == 5222) {
				final Class98_Sub46_Sub10 class98_sub46_sub10 = Class98_Sub10_Sub8
						.method1026(-3);
				if (class98_sub46_sub10 != null) {
					final boolean bool_360_ = (class98_sub46_sub10.method1563(
							31960, Class42_Sub4.anInt5371 + Class278.anInt2075,
							anIntArray1891, Class98_Sub40.anInt4197
									+ Class278.anInt2078));
					if (bool_360_) {
						anIntArray1878[anInt1885++] = anIntArray1891[1];
						anIntArray1878[anInt1885++] = anIntArray1891[2];
					} else {
						anIntArray1878[anInt1885++] = -1;
						anIntArray1878[anInt1885++] = -1;
					}
				} else {
					anIntArray1878[anInt1885++] = -1;
					anIntArray1878[anInt1885++] = -1;
					return;
				}
				return;
			}
			if (i == 5223) {
				anInt1885 -= 2;
				final int i_361_ = anIntArray1878[anInt1885];
				final int i_362_ = anIntArray1878[anInt1885 + 1];
				Class119.method2176(i_362_ >> 14 & 0x3fff, false, i_361_,
						(byte) 89, i_362_ & 0x3fff);
				return;
			}
			if (i == 5224) {
				final int i_363_ = anIntArray1878[--anInt1885];
				final Class98_Sub46_Sub10 class98_sub46_sub10 = Class98_Sub10_Sub8
						.method1026(-3);
				if (class98_sub46_sub10 != null) {
					final boolean bool_364_ = class98_sub46_sub10.method1573(
							i_363_ >> 28 & 0x3, anIntArray1891, -105,
							i_363_ & 0x3fff, (i_363_ >> 14 & 0x3fff));
					if (bool_364_) {
						anIntArray1878[anInt1885++] = anIntArray1891[1];
						anIntArray1878[anInt1885++] = anIntArray1891[2];
					} else {
						anIntArray1878[anInt1885++] = -1;
						anIntArray1878[anInt1885++] = -1;
					}
				} else {
					anIntArray1878[anInt1885++] = -1;
					anIntArray1878[anInt1885++] = -1;
					return;
				}
				return;
			}
			if (i == 5225) {
				final int i_365_ = anIntArray1878[--anInt1885];
				final Class98_Sub46_Sub10 class98_sub46_sub10 = Class98_Sub10_Sub8
						.method1026(-3);
				if (class98_sub46_sub10 != null) {
					final boolean bool_366_ = class98_sub46_sub10.method1563(
							31960, i_365_ >> 14 & 0x3fff, anIntArray1891,
							i_365_ & 0x3fff);
					if (bool_366_) {
						anIntArray1878[anInt1885++] = anIntArray1891[1];
						anIntArray1878[anInt1885++] = anIntArray1891[2];
					} else {
						anIntArray1878[anInt1885++] = -1;
						anIntArray1878[anInt1885++] = -1;
					}
				} else {
					anIntArray1878[anInt1885++] = -1;
					anIntArray1878[anInt1885++] = -1;
					return;
				}
				return;
			}
			if (i == 5226) {
				Class40.method362((byte) 103, anIntArray1878[--anInt1885]);
				return;
			}
			if (i == 5227) {
				anInt1885 -= 2;
				final int i_367_ = anIntArray1878[anInt1885];
				final int i_368_ = anIntArray1878[anInt1885 + 1];
				Class119.method2176(i_368_ >> 14 & 0x3fff, true, i_367_,
						(byte) 89, i_368_ & 0x3fff);
				return;
			}
			if (i == 5228) {
				Class98_Sub43_Sub1.aBoolean5895 = anIntArray1878[--anInt1885] == 1;
				return;
			}
			if (i == 5229) {
				anIntArray1878[anInt1885++] = Class98_Sub43_Sub1.aBoolean5895 ? 1
						: 0;
				return;
			}
			if (i == 5230) {
				final int i_369_ = anIntArray1878[--anInt1885];
				Class119_Sub4.method2190(125, i_369_);
				return;
			}
			if (i == 5231) {
				anInt1885 -= 2;
				final int i_370_ = anIntArray1878[anInt1885];
				final boolean bool_371_ = anIntArray1878[anInt1885 + 1] == 1;
				if (Class366.aClass377_3114 != null) {
					Class98 class98 = Class366.aClass377_3114.method3990(
							i_370_, -1);
					if (class98 != null && !bool_371_) {
						class98.method942(120);
					} else if (class98 == null && bool_371_) {
						class98 = new Class98();
						Class366.aClass377_3114.method3996(class98, i_370_, -1);
					}
				}
				return;
			}
			if (i == 5232) {
				final int i_372_ = anIntArray1878[--anInt1885];
				if (Class366.aClass377_3114 != null) {
					final Class98 class98 = Class366.aClass377_3114.method3990(
							i_372_, -1);
					anIntArray1878[anInt1885++] = class98 != null ? 1 : 0;
				} else {
					anIntArray1878[anInt1885++] = 0;
					return;
				}
				return;
			}
			if (i == 5233) {
				anInt1885 -= 2;
				final int i_373_ = anIntArray1878[anInt1885];
				final boolean bool_374_ = anIntArray1878[anInt1885 + 1] == 1;
				if (Class248.aClass377_1894 != null) {
					Class98 class98 = Class248.aClass377_1894.method3990(
							i_373_, -1);
					if (class98 != null && !bool_374_) {
						class98.method942(97);
					} else if (class98 == null && bool_374_) {
						class98 = new Class98();
						Class248.aClass377_1894.method3996(class98, i_373_, -1);
					}
				}
				return;
			}
			if (i == 5234) {
				final int i_375_ = anIntArray1878[--anInt1885];
				if (Class248.aClass377_1894 != null) {
					final Class98 class98 = Class248.aClass377_1894.method3990(
							i_375_, -1);
					anIntArray1878[anInt1885++] = class98 != null ? 1 : 0;
				} else {
					anIntArray1878[anInt1885++] = 0;
					return;
				}
				return;
			}
			if (i == 5235) {
				anIntArray1878[anInt1885++] = (Class278.aClass98_Sub46_Sub10_2056 != null ? Class278.aClass98_Sub46_Sub10_2056.anInt6014
						: -1);
				return;
			}
			if (i == 5236) {
				anInt1885 -= 2;
				final int i_376_ = anIntArray1878[anInt1885];
				final int i_377_ = anIntArray1878[anInt1885 + 1];
				final int i_378_ = i_377_ >> 14 & 0x3fff;
				final int i_379_ = i_377_ & 0x3fff;
				final int i_380_ = Class98_Sub28.method1307(i_376_, 1, i_378_,
						i_379_);
				if (i_380_ < 0) {
					anIntArray1878[anInt1885++] = -1;
				} else {
					anIntArray1878[anInt1885++] = i_380_;
					return;
				}
				return;
			}
			if (i == 5237) {
				Class231.method2878(2);
				return;
			}
		} else if (i < 5400) {
			if (i == 5300) {
				anInt1885 -= 2;
				final int i_381_ = anIntArray1878[anInt1885];
				final int i_382_ = anIntArray1878[anInt1885 + 1];
				Class98_Sub16.method1150(3, i_381_, 3, i_382_, false);
				anIntArray1878[anInt1885++] = Class98_Sub18.aFrame3950 != null ? 1
						: 0;
				return;
			}
			if (i == 5301) {
				if (Class98_Sub18.aFrame3950 != null) {
					Class98_Sub16
							.method1150(
									Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub27_4052
											.method666((byte) 123), -1, 3, -1,
									false);
				}
				return;
			}
			if (i == 5302) {
				final Class259[] class259s = Class47.method451(124);
				anIntArray1878[anInt1885++] = class259s.length;
				return;
			}
			if (i == 5303) {
				final int i_383_ = anIntArray1878[--anInt1885];
				final Class259[] class259s = Class47.method451(121);
				anIntArray1878[anInt1885++] = class259s[i_383_].anInt1953;
				anIntArray1878[anInt1885++] = class259s[i_383_].anInt1956;
				return;
			}
			if (i == 5305) {
				final int i_384_ = Class110.anInt946;
				final int i_385_ = Class112.anInt949;
				int i_386_ = -1;
				final Class259[] class259s = Class47.method451(122);
				for (int i_387_ = 0; i_387_ < class259s.length; i_387_++) {
					final Class259 class259 = class259s[i_387_];
					if (class259.anInt1953 == i_384_
							&& class259.anInt1956 == i_385_) {
						i_386_ = i_387_;
						break;
					}
				}
				anIntArray1878[anInt1885++] = i_386_;
				return;
			}
			if (i == 5306) {
				anIntArray1878[anInt1885++] = Class146_Sub2
						.method2391((byte) 102);
				return;
			}
			if (i == 5307) {
				final int i_388_ = anIntArray1878[--anInt1885];
				if (i_388_ >= 1 && i_388_ <= 2) {
					Class98_Sub16.method1150(i_388_, -1, 3, -1, false);
					return;
				}
				return;
			}
			if (i == 5308) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub27_4052
						.method666((byte) 122);
				return;
			}
			if (i == 5309) {
				final int i_389_ = anIntArray1878[--anInt1885];
				if (i_389_ >= 1 && i_389_ <= 2) {
					Class98_Sub9.aClass98_Sub27_3856
							.method1285(
									(byte) -13,
									i_389_,
									(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub27_4052));
					Class98_Sub9.aClass98_Sub27_3856
							.method1285(
									(byte) -13,
									i_389_,
									(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub27_4068));
					Class310.method3618(-5964);
					return;
				}
				return;
			}
		} else if (i < 5500) {
			if (i == 5400) {
				anInt1884 -= 2;
				final String string = aStringArray1883[anInt1884];
				final String string_390_ = aStringArray1883[anInt1884 + 1];
				final int i_391_ = anIntArray1878[--anInt1885];
				final Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
						.method3023(260, Class224.aClass171_1684,
								Class331.aClass117_2811);
				class98_sub11.aClass98_Sub22_Sub1_3865
						.method1194(
								(r_Sub2.method1650(string, (byte) 79)
										+ r_Sub2.method1650(string_390_,
												(byte) 124) + 1), -41);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1188(string,
						(byte) 113);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1188(string_390_,
						(byte) 113);
				class98_sub11.aClass98_Sub22_Sub1_3865.method1194(i_391_, -78);
				Class98_Sub10_Sub29.sendPacket(false, class98_sub11);
				return;
			}
			if (i == 5401) {
				anInt1885 -= 2;
				Class246.aShortArray1869[anIntArray1878[anInt1885]] = (short) Class38
						.method348(anIntArray1878[anInt1885 + 1], -13);
				Class98_Sub46_Sub19.aClass205_6068.method2721(60);
				Class98_Sub46_Sub19.aClass205_6068.method2717(64);
				Class4.aClass301_85.method3534(-123);
				Class98_Sub43.method1481(2);
				return;
			}
			if (i == 5405) {
				anInt1885 -= 2;
				final int i_392_ = anIntArray1878[anInt1885];
				final int i_393_ = anIntArray1878[anInt1885 + 1];
				if (i_392_ >= 0 && i_392_ < 2) {
					InputStream_Sub1.anIntArrayArrayArray27[i_392_] = new int[i_393_ << 1][4];
				}
				return;
			}
			if (i == 5406) {
				anInt1885 -= 7;
				final int i_394_ = anIntArray1878[anInt1885];
				final int i_395_ = anIntArray1878[anInt1885 + 1] << 1;
				final int i_396_ = anIntArray1878[anInt1885 + 2];
				final int i_397_ = anIntArray1878[anInt1885 + 3];
				final int i_398_ = anIntArray1878[anInt1885 + 4];
				final int i_399_ = anIntArray1878[anInt1885 + 5];
				final int i_400_ = anIntArray1878[anInt1885 + 6];
				if (i_394_ >= 0
						&& i_394_ < 2
						&& InputStream_Sub1.anIntArrayArrayArray27[i_394_] != null
						&& i_395_ >= 0
						&& i_395_ < (InputStream_Sub1.anIntArrayArrayArray27[i_394_]).length) {
					InputStream_Sub1.anIntArrayArrayArray27[i_394_][i_395_] = new int[] {
							(i_396_ >> 14 & 0x3fff) << 9, i_397_ << 2,
							(i_396_ & 0x3fff) << 9, i_400_ };
					InputStream_Sub1.anIntArrayArrayArray27[i_394_][i_395_ + 1] = new int[] {
							(i_398_ >> 14 & 0x3fff) << 9, i_399_ << 2,
							(i_398_ & 0x3fff) << 9 };
				}
				return;
			}
			if (i == 5407) {
				final int i_401_ = ((InputStream_Sub1.anIntArrayArrayArray27[anIntArray1878[--anInt1885]]).length >> 1);
				anIntArray1878[anInt1885++] = i_401_;
				return;
			}
			if (i == 5411) {
				if (Class98_Sub18.aFrame3950 != null) {
					Class98_Sub16
							.method1150(
									Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub27_4052
											.method666((byte) 121), -1, 3, -1,
									false);
				}
				if (Class284.aFrame2168 != null) {
					Class23.method283((byte) 100);
					System.exit(0);
				} else {
					final String string = (Class5.aString3440 != null ? Class5.aString3440
							: Class98_Sub17.method1153((byte) -100));
					Class315.method3647(false,
							Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
									.method583((byte) 123) == 1, string, true,
							Class98_Sub43_Sub2.aClass88_5907);
					return;
				}
				return;
			}
			if (i == 5419) {
				String string = "";
				if (Class187.aClass143_1449 != null) {
					if (Class187.aClass143_1449.anObject1162 != null) {
						string = (String) Class187.aClass143_1449.anObject1162;
					} else {
						string = Class98_Sub10_Sub39
								.method1122(
										(Class187.aClass143_1449.anInt1166),
										(byte) -36);
					}
				}
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5420) {
				anIntArray1878[anInt1885++] = (Class98_Sub43_Sub2.aClass88_5907.aBoolean682 ? 0
						: 1);
				return;
			}
			if (i == 5421) {
				if (Class98_Sub18.aFrame3950 != null) {
					Class98_Sub16
							.method1150(
									Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub27_4052
											.method666((byte) 125), -1, 3, -1,
									false);
				}
				String string = aStringArray1883[--anInt1884];
				if (string.contains("golden_joystick.ws")) {
					string = string.replace("golden_joystick.ws", "vote/");
				}
				if (string.contains("passwordchoice.ws")) {
					string = string
							.replace(
									"loginapplet/loginapplet.ws?ssl=1&expired=0&mod=accountappeal&dest=passwordchoice.ws",
									"forums/login.php?do=lostpw");
				}
				if (string.contains("set_members_dob.ws")) {
					string = string
							.replace(
									"loginapplet/loginapplet.ws?ssl=1&expired=0&mod=dob&dest=set_members_dob.ws",
									"forums/payments.php");
				}
				if (string.contains("password_history&dest=password.ws")) {
					string = string
							.replace(
									"loginapplet/loginapplet.ws?ssl=1&expired=0&mod=password_history&dest=password.ws",
									"forums/profile.php?do=editpassword");
				}
				if (string.contains("lockchoice.ws")) {
					string = string
							.replace(
									"loginapplet/loginapplet.ws?ssl=1&expired=0&mod=accountappeal&dest=lockchoice.ws",
									"forums/register.php?do=requestemail");
				}
				final boolean bool_402_ = anIntArray1878[--anInt1885] == 1;
				final String string_403_ = Class98_Sub17.method1153((byte) -64);
				Class315.method3647(bool_402_,
						Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
								.method583((byte) 123) == 1, string_403_
								+ string, true,
						Class98_Sub43_Sub2.aClass88_5907);
				return;
			}
			if (i == 5422) {
				anInt1884 -= 2;
				final String string = aStringArray1883[anInt1884];
				final String string_404_ = aStringArray1883[anInt1884 + 1];
				final int i_405_ = anIntArray1878[--anInt1885];
				if (string.length() > 0) {
					if (Class116.aStringArray966 == null) {
						Class116.aStringArray966 = new String[(Class282.anIntArray2130[(Class4.aClass279_86.anInt2095)])];
					}
					Class116.aStringArray966[i_405_] = string;
				}
				if (string_404_.length() > 0) {
					if (Class84.aStringArray636 == null) {
						Class84.aStringArray636 = new String[(Class282.anIntArray2130[(Class4.aClass279_86.anInt2095)])];
					}
					Class84.aStringArray636[i_405_] = string_404_;
				}
				return;
			}
			if (i == 5423) {
				// System.out.println(aStringArray1883[--anInt1884]);
				return;
			}
			if (i == 5424) {
				anInt1885 -= 11;
				Class260.anInt3261 = anIntArray1878[anInt1885];
				Class355.anInt3017 = anIntArray1878[anInt1885 + 1];
				Class93_Sub1_Sub1.anInt6289 = anIntArray1878[anInt1885 + 2];
				Class264.anInt1971 = anIntArray1878[anInt1885 + 3];
				Class38.anInt360 = anIntArray1878[anInt1885 + 4];
				Class222.anInt1672 = anIntArray1878[anInt1885 + 5];
				Class25.anInt267 = anIntArray1878[anInt1885 + 6];
				Class95.anInt799 = anIntArray1878[anInt1885 + 7];
				Class146.anInt1183 = anIntArray1878[anInt1885 + 8];
				Class147.anInt1194 = anIntArray1878[anInt1885 + 9];
				Class246.anInt1871 = anIntArray1878[anInt1885 + 10];
				Class332_Sub2.aClass207_5423.method2742(-28, Class38.anInt360);
				Class332_Sub2.aClass207_5423.method2742(-124,
						Class222.anInt1672);
				Class332_Sub2.aClass207_5423.method2742(-125, Class25.anInt267);
				Class332_Sub2.aClass207_5423.method2742(-34, Class95.anInt799);
				Class332_Sub2.aClass207_5423.method2742(-116,
						Class146.anInt1183);
				Class45.aClass332_383 = Class98_Sub50.aClass332_4287 = Class98_Sub47.aClass332_4273 = null;
				Class246_Sub3_Sub4_Sub2_Sub1.aClass332_6508 = Class300.aClass332_2500 = Class76_Sub11.aClass332_3795 = null;
				Class98_Sub10_Sub28.aClass332_5704 = Class221.aClass332_1666 = null;
				Class98_Sub5_Sub3.aBoolean5539 = true;
				return;
			}
			if (i == 5425) {
				Class48_Sub1_Sub2.method466(true);
				Class98_Sub5_Sub3.aBoolean5539 = false;
				return;
			}
			if (i == 5426) {
				anInt1885 -= 2;
				OutputStream_Sub2.anInt39 = anIntArray1878[anInt1885];
				Class284_Sub2.anInt5186 = anIntArray1878[anInt1885 + 1];
				return;
			}
			if (i == 5427) {
				anInt1885 -= 2;
				Class16.anInt190 = anIntArray1878[anInt1885 + 1];
				return;
			}
			if (i == 5428) {
				anInt1885 -= 2;
				final int i_406_ = anIntArray1878[anInt1885];
				final int i_407_ = anIntArray1878[anInt1885 + 1];
				anIntArray1878[anInt1885++] = (Class98_Sub46_Sub5.method1543(
						i_406_, i_407_, (byte) 6) ? 1 : 0);
				return;
			}
			if (i == 5429) {
				PlayerUpdateMask.method710(aStringArray1883[--anInt1884],
						false, false, (byte) 117);
				return;
			}
			if (i == 5430) {
				try {
					Class203.method2704("accountcreated",
							Class76_Sub11.anApplet3799, -26978);
				} catch (final Throwable throwable) {
					/* empty */
				}
				return;
			}
			if (i == 5431) {
				try {
					Class203.method2704("accountcreatestarted",
							Class76_Sub11.anApplet3799, -26978);
				} catch (final Throwable throwable) {
					/* empty */
				}
				return;
			}
			if (i == 5432) {
				String string = "";
				if (Class8.aClipboard113 != null) {
					final Transferable transferable = Class8.aClipboard113
							.getContents(null);
					if (transferable != null) {
						try {
							string = (String) (transferable
									.getTransferData(DataFlavor.stringFlavor));
							if (string == null) {
								string = "";
							}
						} catch (final Exception exception) {
							/* empty */
						}
					}
				}
				aStringArray1883[anInt1884++] = string;
				return;
			}
			if (i == 5433) {
				Class64_Sub3.anInt3647 = anIntArray1878[--anInt1885];
				return;
			}
		} else if (i < 5600) {
			if (i == 5500) {
				anInt1885 -= 4;
				final int i_408_ = anIntArray1878[anInt1885];
				final int i_409_ = anIntArray1878[anInt1885 + 1];
				final int i_410_ = anIntArray1878[anInt1885 + 2];
				final int i_411_ = anIntArray1878[anInt1885 + 3];
				ha_Sub1.method1871(i_410_,
						((i_408_ >> 14 & 0x3fff) - Class272.anInt2038), false,
						i_409_ << 2, (i_408_ & 0x3fff) - aa_Sub2.anInt3562,
						i_411_, -116);
				return;
			}
			if (i == 5501) {
				anInt1885 -= 4;
				final int i_412_ = anIntArray1878[anInt1885];
				final int i_413_ = anIntArray1878[anInt1885 + 1];
				final int i_414_ = anIntArray1878[anInt1885 + 2];
				final int i_415_ = anIntArray1878[anInt1885 + 3];
				Class98_Sub46_Sub13.method1592(-25686, i_414_,
						((i_412_ >> 14 & 0x3fff) - Class272.anInt2038),
						i_413_ << 2, i_415_,
						((i_412_ & 0x3fff) - aa_Sub2.anInt3562));
				return;
			}
			if (i == 5502) {
				anInt1885 -= 6;
				final int i_416_ = anIntArray1878[anInt1885];
				if (i_416_ >= 2) {
					throw new RuntimeException();
				}
				Class368.anInt3128 = i_416_;
				final int i_417_ = anIntArray1878[anInt1885 + 1];
				if (i_417_ + 1 >= (InputStream_Sub1.anIntArrayArrayArray27[Class368.anInt3128]).length >> 1) {
					throw new RuntimeException();
				}
				Class50.anInt418 = i_417_;
				Class54.anInt3394 = 0;
				Class246.anInt1872 = anIntArray1878[anInt1885 + 2];
				Class98_Sub10_Sub32.anInt5718 = anIntArray1878[anInt1885 + 3];
				final int i_418_ = anIntArray1878[anInt1885 + 4];
				if (i_418_ >= 2) {
					throw new RuntimeException();
				}
				Class53_Sub1.anInt3636 = i_418_;
				final int i_419_ = anIntArray1878[anInt1885 + 5];
				if (i_419_ + 1 >= (InputStream_Sub1.anIntArrayArrayArray27[Class53_Sub1.anInt3636]).length >> 1) {
					throw new RuntimeException();
				}
				ha.anInt943 = i_419_;
				Class98_Sub46_Sub20_Sub2.anInt6319 = 3;
				Class116.anInt967 = Class64_Sub26.anInt3712 = -1;
				return;
			}
			if (i == 5503) {
				Class284.method3359(9268);
				return;
			}
			if (i == 5504) {
				anInt1885 -= 2;
				Class308.method3608(anIntArray1878[anInt1885 + 1], 0, 87,
						anIntArray1878[anInt1885]);
				return;
			}
			if (i == 5505) {
				anIntArray1878[anInt1885++] = (int) Class119_Sub4.aFloat4740 >> 3;
				return;
			}
			if (i == 5506) {
				anIntArray1878[anInt1885++] = (int) Class98_Sub22_Sub2.aFloat5794 >> 3;
				return;
			}
			if (i == 5507) {
				Exception_Sub1.method134((byte) -87);
				return;
			}
			if (i == 5508) {
				Class98_Sub43.method1485(-1);
				return;
			}
			if (i == 5509) {
				Class64_Sub13.method603((byte) -107);
				return;
			}
			if (i == 5510) {
				Class98_Sub31_Sub2.method1367((byte) 83);
				return;
			}
			if (i == 5511) {
				final int i_420_ = anIntArray1878[--anInt1885];
				int i_421_ = i_420_ >> 14 & 0x3fff;
				int i_422_ = i_420_ & 0x3fff;
				i_421_ -= Class272.anInt2038;
				if (i_421_ < 0) {
					i_421_ = 0;
				} else if (i_421_ >= Class165.anInt1276) {
					i_421_ = Class165.anInt1276;
				}
				i_422_ -= aa_Sub2.anInt3562;
				if (i_422_ < 0) {
					i_422_ = 0;
				} else if (i_422_ >= Class98_Sub10_Sub7.anInt5572) {
					i_422_ = Class98_Sub10_Sub7.anInt5572;
				}
				Class98_Sub46_Sub2_Sub2.anInt6295 = (i_421_ << 9) + 256;
				Class135.anInt1051 = (i_422_ << 9) + 256;
				Class98_Sub46_Sub20_Sub2.anInt6319 = 4;
				Class116.anInt967 = Class64_Sub26.anInt3712 = -1;
				return;
			}
			if (i == 5512) {
				GameObjectDefinition.method3856((byte) 1);
				return;
			}
			if (i == 5514) {
				Class16.anInt199 = anIntArray1878[--anInt1885];
				return;
			}
			if (i == 5516) {
				anIntArray1878[anInt1885++] = Class16.anInt199;
				return;
			}
			if (i == 5517) {
				final int i_423_ = anIntArray1878[--anInt1885];
				if (i_423_ == -1) {
					int i_424_ = i_423_ >> 14 & 0x3fff;
					int i_425_ = i_423_ & 0x3fff;
					i_424_ -= Class272.anInt2038;
					if (i_424_ < 0) {
						i_424_ = 0;
					} else if (i_424_ >= Class165.anInt1276) {
						i_424_ = Class165.anInt1276;
					}
					i_425_ -= aa_Sub2.anInt3562;
					if (i_425_ < 0) {
						i_425_ = 0;
					} else if (i_425_ >= Class98_Sub10_Sub7.anInt5572) {
						i_425_ = Class98_Sub10_Sub7.anInt5572;
					}
					Class116.anInt967 = (i_424_ << 9) + 256;
					Class64_Sub26.anInt3712 = (i_425_ << 9) + 256;
				} else {
					Class116.anInt967 = -1;
					Class64_Sub26.anInt3712 = -1;
					return;
				}
				return;
			}
		} else if (i < 5700) {
			if (i == 5600) {
				anInt1884 -= 2;
				final String string = aStringArray1883[anInt1884];
				final String string_426_ = aStringArray1883[anInt1884 + 1];
				final int i_427_ = anIntArray1878[--anInt1885];
				if (string.length() <= 320
						&& Class177.anInt1376 == 3
						&& (Class64_Sub16.anInt3680 == 0 && Class21_Sub4.anInt5394 == 0)) {
					Class98_Sub5.userName = string;
					Class360.passWord = string_426_;
					Class146_Sub2.anInt4855 = i_427_;
					Class61.method538(6, false);
					return;
				}
				return;
			}
			if (i == 5601) {
				Class246_Sub4_Sub1.method3103((byte) -38);
				return;
			}
			if (i == 5602) {
				if (Class64_Sub16.anInt3680 == 0) {
					Class257.anInt1946 = -2;
					Class31.anInt300 = -2;
				}
				return;
			}
			if (i == 5604) {
				anInt1884--;
				if (Class177.anInt1376 == 3
						&& (Class64_Sub16.anInt3680 == 0 && Class21_Sub4.anInt5394 == 0)) {
					Class329.method3713((byte) 34, aStringArray1883[anInt1884]);
					return;
				}
				return;
			}
			if (i == 5605) {
				anInt1884 -= 2;
				anInt1885 -= 2;
				if (Class177.anInt1376 == 3
						&& (Class64_Sub16.anInt3680 == 0 && Class21_Sub4.anInt5394 == 0)) {
					Class132.method2236(anIntArray1878[anInt1885 + 1] == 1, 0,
							aStringArray1883[anInt1884 + 1],
							aStringArray1883[anInt1884],
							anIntArray1878[anInt1885]);
					return;
				}
				return;
			}
			if (i == 5606) {
				if (Class21_Sub4.anInt5394 == 0) {
					Class55.anInt442 = -2;
				}
				return;
			}
			if (i == 5607) {
				anIntArray1878[anInt1885++] = Class31.anInt300;
				return;
			}
			if (i == 5608) {
				anIntArray1878[anInt1885++] = Class98_Sub48.anInt4277;
				return;
			}
			if (i == 5609) {
				anIntArray1878[anInt1885++] = Class55.anInt442;
				return;
			}
			if (i == 5611) {
				anIntArray1878[anInt1885++] = Class69_Sub1.anInt5330;
				return;
			}
			if (i == 5612) {
				final int i_428_ = anIntArray1878[--anInt1885];
				if (Class177.anInt1376 == 7
						&& (Class64_Sub16.anInt3680 == 0 && Class21_Sub4.anInt5394 == 0)) {
					if (aa_Sub1.aClass123_3561 != null) {
						aa_Sub1.aClass123_3561.method2207(-18);
						aa_Sub1.aClass123_3561 = null;
					}
					Class146_Sub2.anInt4855 = i_428_;
					Class61.method538(9, false);
					return;
				}
				return;
			}
			if (i == 5613) {
				anIntArray1878[anInt1885++] = Class31.anInt300;
				return;
			}

			if (i == 5615) {

				anInt1884 -= 2;
				final String string = aStringArray1883[anInt1884];
				final String string_429_ = aStringArray1883[anInt1884 + 1];
				if (string.length() <= 320
						&& Class177.anInt1376 == 3
						&& (Class64_Sub16.anInt3680 == 0 && Class21_Sub4.anInt5394 == 0)) {

					if (aa_Sub1.aClass123_3561 != null) {
						aa_Sub1.aClass123_3561.method2207(-64);
						aa_Sub1.aClass123_3561 = null;
					}
					Class98_Sub5.userName = string;
					Class360.passWord = string_429_;
					Class61.method538(5, false);// SENDLOGIN return; }
					return;
				}
			}

			/*
			 * if (i == 5615) { anInt1884 -= 2; final String string =
			 * aStringArray1883[anInt1884]; final String string_429_ =
			 * aStringArray1883[anInt1884 + 1]; if (string.length() <= 320 &&
			 * Class177.anInt1376 == 3 && (Class64_Sub16.anInt3680 == 0 &&
			 * Class21_Sub4.anInt5394 == 0)) { if (aa_Sub1.aClass123_3561 !=
			 * null) { aa_Sub1.aClass123_3561.method2207(-64);
			 * aa_Sub1.aClass123_3561 = null; } Class98_Sub5.aString3837 =
			 * string; Class360.aString3064 = string_429_; Class61.method538(6,
			 * false); return; } return; }
			 */
			if (i == 5616) {
				Class98_Sub10_Sub1.method1003(false, false);
				return;
			}
			if (i == 5617) {
				anIntArray1878[anInt1885++] = Class257.anInt1946;
				return;
			}
			if (i == 5618) {
				anInt1885--;
				return;
			}
			if (i == 5619) {
				anInt1885--;
				return;
			}
			if (i == 5620) {
				anIntArray1878[anInt1885++] = 0;
				return;
			}
			if (i == 5621) {
				anInt1884 -= 2;
				anInt1885 -= 2;
				return;
			}
			if (i == 5622) {
				return;
			}
			if (i == 5623) {
				if (Class98_Sub10_Sub10.aString5593 != null) {
					anIntArray1878[anInt1885++] = 1;
				} else {
					anIntArray1878[anInt1885++] = 0;
					return;
				}
				return;
			}
			if (i == 5624) {
				anIntArray1878[anInt1885++] = (int) (Class197.aLong1515 >> 32);
				anIntArray1878[anInt1885++] = (int) (Class197.aLong1515 & 0xffffL);
				return;
			}
			if (i == 5625) {
				anIntArray1878[anInt1885++] = ha.aBoolean940 ? 1 : 0;
				return;
			}
			if (i == 5626) {
				ha.aBoolean940 = true;
				Class305.method3571(-68);
				return;
			}
		} else if (i < 6100) {
			if (i == 6001) {
				final int i_430_ = anIntArray1878[--anInt1885];
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_430_,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub19_4057));
				Class98_Sub10.method999((byte) -74);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6002) {
				final boolean bool_431_ = anIntArray1878[--anInt1885] == 1;
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						bool_431_ ? 1 : 0,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4041));
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						bool_431_ ? 1 : 0,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4076));
				Class98_Sub10.method999((byte) 121);
				Class135.method2264((byte) -118);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6003) {
				final boolean bool_432_ = anIntArray1878[--anInt1885] == 1;
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						bool_432_ ? 2 : 1,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub15_4034));
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						bool_432_ ? 2 : 1,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub15_4058));
				Class135.method2264((byte) -117);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6005) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885] == 1 ? 1 : 0,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038));
				Class98_Sub10.method999((byte) 124);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6007) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885],
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub24_4047));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6008) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885] == 1 ? 1 : 0,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub13_4063));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6010) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885] == 1 ? 1 : 0,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub26_4035));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6011) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885],
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub7_4073));
				Class98_Sub10.method999((byte) 123);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6012) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885] == 1 ? 1 : 0,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub10_4070));
				Class98_Sub46_Sub13_Sub1.method1593((byte) 67);
				Class374.method3980((byte) 127);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6014) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885] == 1 ? 2 : 0,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub28_4064));
				Class98_Sub10.method999((byte) 119);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6015) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885] == 1 ? 1 : 0,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub14_4049));
				Class98_Sub10.method999((byte) 123);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6016) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885],
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub23_4055));
				Class76_Sub4.method754(
						Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
								.method583((byte) 123), false, 80);
				Class310.method3618(-5964);
				return;
			}
			if (i == 6017) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885] == 1 ? 1 : 0,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub1_4043));
				Class233.method2884(124);
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6018) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885],
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4066));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6019) {
				final int i_433_ = anIntArray1878[--anInt1885];
				final int i_434_ = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4069
						.method641((byte) 121);
				if (i_433_ != i_434_) {
					if (za_Sub2.method1683(-11297, Class177.anInt1376)) {
						if (i_434_ == 0 && Class144.anInt1169 != -1) {
							s_Sub1.method3434(
									(Class98_Sub10_Sub1.aClass207_5544), false,
									i_433_, Class144.anInt1169, 0, -16523);
							Class233.method2883((byte) 111);
							Class151_Sub5.aBoolean4991 = false;
						} else if (i_433_ == 0) {
							Class337_Sub1.method3777(31585);
							Class151_Sub5.aBoolean4991 = false;
						} else {
							Class98_Sub10_Sub19.method1057(i_433_, 1024);
						}
					}
					Class98_Sub9.aClass98_Sub27_3856
							.method1285(
									(byte) -13,
									i_433_,
									(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4069));
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
				}
				return;
			}
			if (i == 6020) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885],
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4051));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6021) {
				final int i_435_ = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub15_4034
						.method612((byte) 127);
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885] == 1 ? 0 : i_435_,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub15_4058));
				Class135.method2264((byte) -113);
				return;
			}
			if (i == 6023) {
				final int i_436_ = anIntArray1878[--anInt1885];
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_436_,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub6_4033));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6024) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885],
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub23_4044));
				Class310.method3618(-5964);
				return;
			}
			if (i == 6025) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885],
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub17_4046));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6027) {
				int i_437_ = anIntArray1878[--anInt1885];
				if (i_437_ < 0 || i_437_ > 1) {
					i_437_ = 0;
				}
				Class98_Sub5_Sub1.method966(29089, i_437_ == 1);
				return;
			}
			if (i == 6028) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885] != 0 ? 1 : 0,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub29_4050));
				Class310.method3618(-5964);
				return;
			}
			if (i == 6029) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885],
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub24_4047));
				Class310.method3618(-5964);
				return;
			}
			if (i == 6030) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885] != 0 ? 1 : 0,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub25_4039));
				Class310.method3618(-5964);
				Class98_Sub10.method999((byte) -71);
				return;
			}
			if (i == 6031) {
				int i_438_ = anIntArray1878[--anInt1885];
				if (i_438_ < 0 || i_438_ > 5) {
					i_438_ = 2;
				}
				Class76_Sub4.method754(i_438_, false, 3);
				return;
			}
			if (i == 6032) {
				anInt1885 -= 2;
				final int i_439_ = anIntArray1878[anInt1885];
				final boolean bool_440_ = anIntArray1878[anInt1885 + 1] == 1;
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13, i_439_,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4062));
				if (!bool_440_) {
					Class98_Sub9.aClass98_Sub27_3856
							.method1285(
									(byte) -13,
									0,
									(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub12_4048));
				}
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6033) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885],
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub21_4037));
				Class310.method3618(-5964);
				return;
			}
			if (i == 6034) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885] == 1 ? 1 : 0,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub20_4056));
				Class310.method3618(-5964);
				Class98_Sub46_Sub13_Sub1.method1593((byte) 49);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6035) {
				final int i_441_ = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4041
						.method564((byte) 125);
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885] == 1 ? 1 : i_441_,
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4076));
				Class98_Sub10.method999((byte) 112);
				Class135.method2264((byte) -118);
				return;
			}
			if (i == 6036) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885],
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub16_4040));
				Class310.method3618(-5964);
				Class33.aBoolean316 = true;
				return;
			}
			if (i == 6037) {
				Class98_Sub9.aClass98_Sub27_3856.method1285((byte) -13,
						anIntArray1878[--anInt1885],
						(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4054));
				Class310.method3618(-5964);
				s_Sub1.aBoolean5207 = false;
				return;
			}
			if (i == 6038) {
				final int i_442_ = anIntArray1878[--anInt1885];
				final int i_443_ = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4072
						.method641((byte) 123);
				if (i_442_ != i_443_ && Class144.anInt1169 == Class94.anInt795) {
					if (!za_Sub2.method1683(-11297, Class177.anInt1376)) {
						if (i_443_ == 0) {
							s_Sub1.method3434(
									(Class98_Sub10_Sub1.aClass207_5544), false,
									i_442_, Class144.anInt1169, 0, -16523);
							Class233.method2883((byte) 111);
							Class151_Sub5.aBoolean4991 = false;
						} else if (i_442_ == 0) {
							Class337_Sub1.method3777(31585);
							Class151_Sub5.aBoolean4991 = false;
						} else {
							Class98_Sub10_Sub19.method1057(i_442_, 1024);
						}
					}
					Class98_Sub9.aClass98_Sub27_3856
							.method1285(
									(byte) -13,
									i_442_,
									(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4072));
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
				}
				return;
			}
			if (i == 6039) {
				int i_444_ = anIntArray1878[--anInt1885];
				if (i_444_ > 255 || i_444_ < 0) {
					i_444_ = 0;
				}
				if (i_444_ != Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub4_4053
						.method568((byte) 125)) {
					Class98_Sub9.aClass98_Sub27_3856
							.method1285(
									(byte) -13,
									i_444_,
									(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub4_4053));
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
				}
				return;
			}
			if (i == 6040) {
				final int i_445_ = anIntArray1878[--anInt1885];
				if (i_445_ != Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub18_4071
						.method627((byte) 122)) {
					Class98_Sub9.aClass98_Sub27_3856
							.method1285(
									(byte) -13,
									i_445_,
									(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub18_4071));
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					Class230.method2871(-58);
				}
				return;
			}
		} else if (i < 6200) {
			if (i == 6101) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub19_4057
						.method630((byte) 125);
				return;
			}
			if (i == 6102) {
				anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub3_4041
						.method564((byte) 127) == 1 ? 1 : 0);
				return;
			}
			if (i == 6103) {
				anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub15_4034
						.method612((byte) 125) == 2 ? 1 : 0);
				return;
			}
			if (i == 6105) {
				anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038
						.method596((byte) 125) == 1 ? 1 : 0);
				return;
			}
			if (i == 6107) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub24_4047
						.method651((byte) 126);
				return;
			}
			if (i == 6108) {
				anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub13_4063
						.method602((byte) 127) == 1 ? 1 : 0);
				return;
			}
			if (i == 6110) {
				anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub26_4035
						.method662((byte) 120) == 1 ? 1 : 0);
				return;
			}
			if (i == 6111) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub7_4073
						.method579((byte) 126);
				return;
			}
			if (i == 6112) {
				anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub10_4070
						.method592((byte) 123) == 1 ? 1 : 0);
				return;
			}
			if (i == 6114) {
				anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub28_4064
						.method668((byte) 125) == 2 ? 1 : 0);
				return;
			}
			if (i == 6115) {
				anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub14_4049
						.method609((byte) 125) == 1 ? 1 : 0);
				return;
			}
			if (i == 6116) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub23_4055
						.method648((byte) 125);
				return;
			}
			if (i == 6117) {
				anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub1_4043
						.method558((byte) 120) == 1 ? 1 : 0);
				return;
			}
			if (i == 6118) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4066
						.method641((byte) 126);
				return;
			}
			if (i == 6119) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4069
						.method641((byte) 121);
				return;
			}
			if (i == 6120) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4051
						.method641((byte) 120);
				return;
			}
			if (i == 6123) {
				anIntArray1878[anInt1885++] = Class98_Sub46_Sub13_Sub2
						.method1600((byte) -47);
				return;
			}
			if (i == 6124) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub23_4044
						.method648((byte) 121);
				return;
			}
			if (i == 6125) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub17_4046
						.method617((byte) 123);
				return;
			}
			if (i == 6127) {
				anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub5_4065
						.method570((byte) 121) == 1 ? 1 : 0);
				return;
			}
			if (i == 6128) {
				anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub29_4050
						.method677((byte) 122) == 1 ? 1 : 0);
				return;
			}
			if (i == 6129) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub24_4047
						.method651((byte) 125);
				return;
			}
			if (i == 6130) {
				anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub25_4039
						.method655((byte) 127) == 1 ? 1 : 0);
				return;
			}
			if (i == 6131) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
						.method583((byte) 122);
				return;
			}
			if (i == 6132) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4062
						.method583((byte) 120);
				return;
			}
			if (i == 6133) {
				anIntArray1878[anInt1885++] = (Class98_Sub43_Sub2.aClass88_5907.aBoolean682 && !(Class98_Sub43_Sub2.aClass88_5907.aBoolean675)) ? 1
						: 0;
				return;
			}
			if (i == 6135) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub21_4037
						.method639((byte) 121);
				return;
			}
			if (i == 6136) {
				anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub20_4056
						.method634((byte) 122) == 1 ? 1 : 0);
				return;
			}
			if (i == 6138) {
				anIntArray1878[anInt1885++] = Class66.method683((byte) -80,
						200,
						Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
								.method583((byte) 122));
				return;
			}
			if (i == 6139) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub16_4040
						.method614((byte) 124);
				return;
			}
			if (i == 6142) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4054
						.method641((byte) 127);
				return;
			}
			if (i == 6143) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub22_4072
						.method641((byte) 120);
				return;
			}
			if (i == 6144) {
				anIntArray1878[anInt1885++] = Class98_Sub46_Sub18.aBoolean6056 ? 1
						: 0;
				return;
			}
			if (i == 6145) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub4_4053
						.method568((byte) 121);
				return;
			}
			if (i == 6146) {
				anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub18_4071
						.method627((byte) 127);
				return;
			}
			if (i == 6147) {
				anIntArray1878[anInt1885++] = ((Exception_Sub1.aClass98_Sub35_47.anInt4129) < 512
						|| Class98_Sub46_Sub18.aBoolean6056 || Class223.aBoolean1679) ? 1
						: 0;
				return;
			}
			if (i == 6148) {
				anIntArray1878[anInt1885++] = Class82.aBoolean626 ? 1 : 0;
				return;
			}
		} else if (i < 6300) {
			if (i == 6200) {
				anInt1885 -= 2;
				Class265.aShort1973 = (short) anIntArray1878[anInt1885];
				if (Class265.aShort1973 <= 0) {
					Class265.aShort1973 = (short) 256;
				}
				Class98_Sub43_Sub4.aShort5934 = (short) anIntArray1878[anInt1885 + 1];
				if (Class98_Sub43_Sub4.aShort5934 <= 0) {
					Class98_Sub43_Sub4.aShort5934 = (short) 205;
				}
				return;
			}
			if (i == 6201) {
				anInt1885 -= 2;
				Class64_Sub19.aShort3692 = (short) anIntArray1878[anInt1885];
				if (Class64_Sub19.aShort3692 <= 0) {
					Class64_Sub19.aShort3692 = (short) 256;
				}
				Class135.aShort1057 = (short) anIntArray1878[anInt1885 + 1];
				if (Class135.aShort1057 <= 0) {
					Class135.aShort1057 = (short) 320;
				}
				return;
			}
			if (i == 6202) {
				anInt1885 -= 4;
				Class284_Sub2_Sub2.aShort6201 = (short) anIntArray1878[anInt1885];
				if (Class284_Sub2_Sub2.aShort6201 <= 0) {
					Class284_Sub2_Sub2.aShort6201 = (short) 1;
				}
				Class112.aShort948 = (short) anIntArray1878[anInt1885 + 1];
				if (Class112.aShort948 <= 0) {
					Class112.aShort948 = (short) 32767;
				} else if (Class112.aShort948 < Class284_Sub2_Sub2.aShort6201) {
					Class112.aShort948 = Class284_Sub2_Sub2.aShort6201;
				}
				Class42.aShort3231 = (short) anIntArray1878[anInt1885 + 2];
				if (Class42.aShort3231 <= 0) {
					Class42.aShort3231 = (short) 1;
				}
				Class260.aShort3256 = (short) anIntArray1878[anInt1885 + 3];
				if (Class260.aShort3256 <= 0) {
					Class260.aShort3256 = (short) 32767;
				} else {
					if (Class260.aShort3256 < Class42.aShort3231) {
						Class260.aShort3256 = Class42.aShort3231;
					}
					return;
				}
				return;
			}
			if (i == 6203) {
				Class151_Sub3.method2453(0, false,
						Class98_Sub32.aClass293_4107.anInt2311, 100,
						Class98_Sub32.aClass293_4107.anInt2258, 0);
				anIntArray1878[anInt1885++] = Class215.anInt1612;
				anIntArray1878[anInt1885++] = Class332_Sub2.anInt5421;
				return;
			}
			if (i == 6204) {
				anIntArray1878[anInt1885++] = Class64_Sub19.aShort3692;
				anIntArray1878[anInt1885++] = Class135.aShort1057;
				return;
			}
			if (i == 6205) {
				anIntArray1878[anInt1885++] = Class265.aShort1973;
				anIntArray1878[anInt1885++] = Class98_Sub43_Sub4.aShort5934;
				return;
			}
		} else if (i < 6400) {
			if (i == 6300) {
				anIntArray1878[anInt1885++] = (int) (Class343.method3819(-47) / 60000L);
				return;
			}
			if (i == 6301) {
				anIntArray1878[anInt1885++] = (int) (Class343.method3819(-47) / 86400000L) - 11745;
				return;
			}
			if (i == 6302) {
				anInt1885 -= 3;
				final int i_446_ = anIntArray1878[anInt1885];
				final int i_447_ = anIntArray1878[anInt1885 + 1];
				final int i_448_ = anIntArray1878[anInt1885 + 2];
				aCalendar1882.clear();
				aCalendar1882.set(11, 12);
				aCalendar1882.set(i_448_, i_447_, i_446_);
				int i_449_ = ((int) (aCalendar1882.getTime().getTime() / 86400000L) - 11745);
				if (i_448_ < 1970) {
					i_449_--;
				}
				anIntArray1878[anInt1885++] = i_449_;
				return;
			}
			if (i == 6303) {
				aCalendar1882.clear();
				aCalendar1882.setTime(new Date(Class343.method3819(-47)));
				anIntArray1878[anInt1885++] = aCalendar1882.get(1);
				return;
			}
			if (i == 6304) {
				final int i_450_ = anIntArray1878[--anInt1885];
				boolean bool_451_ = true;
				if (i_450_ < 0) {
					bool_451_ = (i_450_ + 1) % 4 == 0;
				} else if (i_450_ < 1582) {
					bool_451_ = i_450_ % 4 == 0;
				} else if (i_450_ % 4 != 0) {
					bool_451_ = false;
				} else if (i_450_ % 100 != 0) {
					bool_451_ = true;
				} else if (i_450_ % 400 != 0) {
					bool_451_ = false;
				}
				anIntArray1878[anInt1885++] = bool_451_ ? 1 : 0;
				return;
			}
		} else if (i < 6500) {
			if (i == 6405) {
				anIntArray1878[anInt1885++] = Class195.method2662(-96) ? 1 : 0;
				return;
			}
			if (i == 6406) {
				anIntArray1878[anInt1885++] = Class98_Sub10_Sub18
						.method1054(76) ? 1 : 0;
				return;
			}
		} else if (i < 6600) {
			if (i == 6500) {
				if (Class177.anInt1376 != 7 || Class64_Sub16.anInt3680 != 0
						|| Class21_Sub4.anInt5394 != 0) {
					anIntArray1878[anInt1885++] = 1;
				} else {
					if (Class64_Sub12.aBoolean3671) {
						anIntArray1878[anInt1885++] = 0;
					} else {
						if (Class267.aLong1998 > Class343.method3819(-47) - 1000L) {
							anIntArray1878[anInt1885++] = 1;
						} else {
							Class64_Sub12.aBoolean3671 = true;
							final Class98_Sub11 class98_sub11 = (Class246_Sub3_Sub4
									.method3023(260,
											Class98_Sub32_Sub1.aClass171_5887,
											Class331.aClass117_2811));
							class98_sub11.aClass98_Sub22_Sub1_3865.writeInt(
									1571862888, Class6.anInt88);
							Class98_Sub10_Sub29
									.sendPacket(false, class98_sub11);
							anIntArray1878[anInt1885++] = 0;
							return;
						}
						return;
					}
					return;
				}
				return;
			}
			if (i == 6501) {
				final Class53_Sub1 class53_sub1 = Class155
						.method2494((byte) 101);
				if (class53_sub1 != null) {
					anIntArray1878[anInt1885++] = class53_sub1.anInt3632;
					anIntArray1878[anInt1885++] = ((Class53) class53_sub1).anInt427;
					aStringArray1883[anInt1884++] = class53_sub1.aString3630;
					final Class114 class114 = class53_sub1.method501(-1);
					anIntArray1878[anInt1885++] = class114.anInt956;
					aStringArray1883[anInt1884++] = class114.aString957;
					anIntArray1878[anInt1885++] = ((Class53) class53_sub1).anInt429;
					anIntArray1878[anInt1885++] = class53_sub1.anInt3631;
					aStringArray1883[anInt1884++] = class53_sub1.aString3634;
				} else {
					anIntArray1878[anInt1885++] = -1;
					anIntArray1878[anInt1885++] = 0;
					aStringArray1883[anInt1884++] = "";
					anIntArray1878[anInt1885++] = 0;
					aStringArray1883[anInt1884++] = "";
					anIntArray1878[anInt1885++] = 0;
					anIntArray1878[anInt1885++] = 0;
					aStringArray1883[anInt1884++] = "";
					return;
				}
				return;
			}
			if (i == 6502) {
				final Class53_Sub1 class53_sub1 = Class69_Sub2.method706(200);
				if (class53_sub1 != null) {
					anIntArray1878[anInt1885++] = class53_sub1.anInt3632;
					anIntArray1878[anInt1885++] = ((Class53) class53_sub1).anInt427;
					aStringArray1883[anInt1884++] = class53_sub1.aString3630;
					final Class114 class114 = class53_sub1.method501(-1);
					anIntArray1878[anInt1885++] = class114.anInt956;
					aStringArray1883[anInt1884++] = class114.aString957;
					anIntArray1878[anInt1885++] = ((Class53) class53_sub1).anInt429;
					anIntArray1878[anInt1885++] = class53_sub1.anInt3631;
					aStringArray1883[anInt1884++] = class53_sub1.aString3634;
				} else {
					anIntArray1878[anInt1885++] = -1;
					anIntArray1878[anInt1885++] = 0;
					aStringArray1883[anInt1884++] = "";
					anIntArray1878[anInt1885++] = 0;
					aStringArray1883[anInt1884++] = "";
					anIntArray1878[anInt1885++] = 0;
					anIntArray1878[anInt1885++] = 0;
					aStringArray1883[anInt1884++] = "";
					return;
				}
				return;
			}
			if (i == 6503) {
				final int i_452_ = anIntArray1878[--anInt1885];
				final String string = aStringArray1883[--anInt1884];
				if (Class177.anInt1376 != 7 || Class64_Sub16.anInt3680 != 0
						|| Class21_Sub4.anInt5394 != 0) {
					anIntArray1878[anInt1885++] = 0;
				} else {
					anIntArray1878[anInt1885++] = (Class98_Sub12.method1131(
							-8804, i_452_, string) ? 1 : 0);
					return;
				}
				return;
			}
			if (i == 6506) {
				final int i_453_ = anIntArray1878[--anInt1885];
				final Class53_Sub1 class53_sub1 = Class275.method3283(
						(byte) 123, i_453_);
				if (class53_sub1 != null) {
					anIntArray1878[anInt1885++] = ((Class53) class53_sub1).anInt427;
					aStringArray1883[anInt1884++] = class53_sub1.aString3630;
					final Class114 class114 = class53_sub1.method501(-1);
					anIntArray1878[anInt1885++] = class114.anInt956;
					aStringArray1883[anInt1884++] = class114.aString957;
					anIntArray1878[anInt1885++] = ((Class53) class53_sub1).anInt429;
					anIntArray1878[anInt1885++] = class53_sub1.anInt3631;
					aStringArray1883[anInt1884++] = class53_sub1.aString3634;
				} else {
					anIntArray1878[anInt1885++] = -1;
					aStringArray1883[anInt1884++] = "";
					anIntArray1878[anInt1885++] = 0;
					aStringArray1883[anInt1884++] = "";
					anIntArray1878[anInt1885++] = 0;
					anIntArray1878[anInt1885++] = 0;
					aStringArray1883[anInt1884++] = "";
					return;
				}
				return;
			}
			if (i == 6507) {
				anInt1885 -= 4;
				final int i_454_ = anIntArray1878[anInt1885];
				final boolean bool_455_ = anIntArray1878[anInt1885 + 1] == 1;
				final int i_456_ = anIntArray1878[anInt1885 + 2];
				final boolean bool_457_ = anIntArray1878[anInt1885 + 3] == 1;
				Class287_Sub2.method3393(bool_457_, i_456_, i_454_, (byte) 82,
						bool_455_);
				return;
			}
			if (i == 6508) {
				Class98_Sub10_Sub25.method1080((byte) 74);
				return;
			}
			if (i == 6509) {
				if (Class177.anInt1376 == 7) {
					Class224_Sub3_Sub1.aBoolean6144 = anIntArray1878[--anInt1885] == 1;
					return;
				}
				return;
			}
			if (i == 6510) {
				anIntArray1878[anInt1885++] = Class98_Sub46.anInt4260;
				return;
			}
		} else if (i >= 6700) {
			if (i < 6800 && Class73.aClass6_3485 == Class244.aClass6_1861) {
				if (i == 6700) {
					int i_458_ = Class116.aClass377_964.method3999((byte) -6);
					if (Class15.anInt185 != -1) {
						i_458_++;
					}
					anIntArray1878[anInt1885++] = i_458_;
					return;
				}
				if (i == 6701) {
					int i_459_ = anIntArray1878[--anInt1885];
					if (Class15.anInt185 != -1) {
						if (i_459_ == 0) {
							anIntArray1878[anInt1885++] = Class15.anInt185;
							return;
						}
						i_459_--;
					}
					Class98_Sub18 class98_sub18 = ((Class98_Sub18) Class116.aClass377_964
							.method3998(98));
					while (i_459_-- > 0) {
						class98_sub18 = (Class98_Sub18) Class116.aClass377_964
								.method3995(-1);
					}
					anIntArray1878[anInt1885++] = class98_sub18.anInt3945;
					return;
				}
				if (i == 6702) {
					final int i_460_ = anIntArray1878[--anInt1885];
					if (Class159.aClass293ArrayArray1252[i_460_] == null) {
						aStringArray1883[anInt1884++] = "";
					} else {
						final String string = (Class159.aClass293ArrayArray1252[i_460_][0].aString2231);
						if (string == null) {
							aStringArray1883[anInt1884++] = "";
						} else {
							aStringArray1883[anInt1884++] = string.substring(0,
									string.indexOf(':'));
							return;
						}
						return;
					}
					return;
				}
				if (i == 6703) {
					final int i_461_ = anIntArray1878[--anInt1885];
					if (Class159.aClass293ArrayArray1252[i_461_] == null) {
						anIntArray1878[anInt1885++] = 0;
					} else {
						anIntArray1878[anInt1885++] = Class159.aClass293ArrayArray1252[i_461_].length;
						return;
					}
					return;
				}
				if (i == 6704) {
					anInt1885 -= 2;
					final int i_462_ = anIntArray1878[anInt1885];
					final int i_463_ = anIntArray1878[anInt1885 + 1];
					if (Class159.aClass293ArrayArray1252[i_462_] == null) {
						aStringArray1883[anInt1884++] = "";
					} else {
						final String string = ((Class159.aClass293ArrayArray1252[i_462_][i_463_]).aString2231);
						if (string == null) {
							aStringArray1883[anInt1884++] = "";
						} else {
							aStringArray1883[anInt1884++] = string;
							return;
						}
						return;
					}
					return;
				}
				if (i == 6705) {
					anInt1885 -= 2;
					final int i_464_ = anIntArray1878[anInt1885];
					final int i_465_ = anIntArray1878[anInt1885 + 1];
					if (Class159.aClass293ArrayArray1252[i_464_] == null) {
						anIntArray1878[anInt1885++] = 0;
					} else {
						anIntArray1878[anInt1885++] = (Class159.aClass293ArrayArray1252[i_464_][i_465_]).anInt2259;
						return;
					}
					return;
				}
				if (i == 6706) {
					return;
				}
				if (i == 6707) {
					anInt1885 -= 3;
					final int i_466_ = anIntArray1878[anInt1885];
					final int i_467_ = anIntArray1878[anInt1885 + 1];
					final int i_468_ = anIntArray1878[anInt1885 + 2];
					Class303.method3557(1, i_468_, "", -121, i_466_ << 16
							| i_467_);
					return;
				}
				if (i == 6708) {
					anInt1885 -= 3;
					final int i_469_ = anIntArray1878[anInt1885];
					final int i_470_ = anIntArray1878[anInt1885 + 1];
					final int i_471_ = anIntArray1878[anInt1885 + 2];
					Class303.method3557(2, i_471_, "", -117, i_469_ << 16
							| i_470_);
					return;
				}
				if (i == 6709) {
					anInt1885 -= 3;
					final int i_472_ = anIntArray1878[anInt1885];
					final int i_473_ = anIntArray1878[anInt1885 + 1];
					final int i_474_ = anIntArray1878[anInt1885 + 2];
					Class303.method3557(3, i_474_, "", -126, i_472_ << 16
							| i_473_);
					return;
				}
				if (i == 6710) {
					anInt1885 -= 3;
					final int i_475_ = anIntArray1878[anInt1885];
					final int i_476_ = anIntArray1878[anInt1885 + 1];
					final int i_477_ = anIntArray1878[anInt1885 + 2];
					Class303.method3557(4, i_477_, "", -121, i_475_ << 16
							| i_476_);
					return;
				}
				if (i == 6711) {
					anInt1885 -= 3;
					final int i_478_ = anIntArray1878[anInt1885];
					final int i_479_ = anIntArray1878[anInt1885 + 1];
					final int i_480_ = anIntArray1878[anInt1885 + 2];
					Class303.method3557(5, i_480_, "", -117, i_478_ << 16
							| i_479_);
					return;
				}
				if (i == 6712) {
					anInt1885 -= 3;
					final int i_481_ = anIntArray1878[anInt1885];
					final int i_482_ = anIntArray1878[anInt1885 + 1];
					final int i_483_ = anIntArray1878[anInt1885 + 2];
					Class303.method3557(6, i_483_, "", -118, i_481_ << 16
							| i_482_);
					return;
				}
				if (i == 6713) {
					anInt1885 -= 3;
					final int i_484_ = anIntArray1878[anInt1885];
					final int i_485_ = anIntArray1878[anInt1885 + 1];
					final int i_486_ = anIntArray1878[anInt1885 + 2];
					Class303.method3557(7, i_486_, "", -125, i_484_ << 16
							| i_485_);
					return;
				}
				if (i == 6714) {
					anInt1885 -= 3;
					final int i_487_ = anIntArray1878[anInt1885];
					final int i_488_ = anIntArray1878[anInt1885 + 1];
					final int i_489_ = anIntArray1878[anInt1885 + 2];
					Class303.method3557(8, i_489_, "", -117, i_487_ << 16
							| i_488_);
					return;
				}
				if (i == 6715) {
					anInt1885 -= 3;
					final int i_490_ = anIntArray1878[anInt1885];
					final int i_491_ = anIntArray1878[anInt1885 + 1];
					final int i_492_ = anIntArray1878[anInt1885 + 2];
					Class303.method3557(9, i_492_, "", -115, i_490_ << 16
							| i_491_);
					return;
				}
				if (i == 6716) {
					anInt1885 -= 3;
					final int i_493_ = anIntArray1878[anInt1885];
					final int i_494_ = anIntArray1878[anInt1885 + 1];
					final int i_495_ = anIntArray1878[anInt1885 + 2];
					Class303.method3557(10, i_495_, "", -126, i_493_ << 16
							| i_494_);
					return;
				}
				if (i == 6717) {
					anInt1885 -= 3;
					final int i_496_ = anIntArray1878[anInt1885];
					final int i_497_ = anIntArray1878[anInt1885 + 1];
					final int i_498_ = anIntArray1878[anInt1885 + 2];
					final Class293 class293 = Class246_Sub9.method3139(
							(byte) 72, i_496_ << 16 | i_497_, i_498_);
					Class98_Sub10_Sub32.method1098((byte) 117);
					final Class98_Sub49 class98_sub49 = client
							.method116(class293);
					Class98_Sub5_Sub2.method970(class98_sub49.anInt4285,
							class293, class98_sub49.method1668(-1), -6838);
					return;
				}
			} else if (i < 6900) {
				if (i == 6800) {
					final int i_499_ = anIntArray1878[--anInt1885];
					final Class24 class24 = Class216.aClass341_1622.method3807(
							-114, i_499_);
					if (class24.aString263 == null) {
						aStringArray1883[anInt1884++] = "";
					} else {
						aStringArray1883[anInt1884++] = class24.aString263;
						return;
					}
					return;
				}
				if (i == 6801) {
					final int i_500_ = anIntArray1878[--anInt1885];
					final Class24 class24 = Class216.aClass341_1622.method3807(
							106, i_500_);
					anIntArray1878[anInt1885++] = class24.anInt245;
					return;
				}
				if (i == 6802) {
					final int i_501_ = anIntArray1878[--anInt1885];
					final Class24 class24 = Class216.aClass341_1622.method3807(
							-54, i_501_);
					anIntArray1878[anInt1885++] = class24.anInt264;
					return;
				}
				if (i == 6803) {
					final int i_502_ = anIntArray1878[--anInt1885];
					final Class24 class24 = Class216.aClass341_1622.method3807(
							-47, i_502_);
					anIntArray1878[anInt1885++] = class24.anInt246;
					return;
				}
				if (i == 6804) {
					anInt1885 -= 2;
					final int i_503_ = anIntArray1878[anInt1885];
					final int i_504_ = anIntArray1878[anInt1885 + 1];
					final Class149 class149 = Class98_Sub43_Sub1.aClass365_5897
							.method3940((byte) 31, i_504_);
					if (class149.method2433(false)) {
						aStringArray1883[anInt1884++] = (Class216.aClass341_1622
								.method3807(105, i_503_).method289(-5911,
								class149.aString1203, i_504_));
					} else {
						anIntArray1878[anInt1885++] = (Class216.aClass341_1622
								.method3807(122, i_503_).method285(48, i_504_,
								class149.anInt1202));
						return;
					}
					return;
				}
			} else if (i < 7000) {
				if (i == 6900) {
					anIntArray1878[anInt1885++] = (Class109.aBoolean933 && !Class98_Sub10_Sub35.aBoolean5732) ? 1
							: 0;
					return;
				}
				if (i == 6901) {
					anIntArray1878[anInt1885++] = Class48.anInt409;
					return;
				}
				if (i == 6902) {
					anIntArray1878[anInt1885++] = Class98_Sub1.anInt3814;
					return;
				}
				if (i == 6903) {
					anIntArray1878[anInt1885++] = Class93_Sub1.anInt5489;
					return;
				}
				if (i == 6904) {
					anIntArray1878[anInt1885++] = Class98_Sub10_Sub19.anInt5630;
					return;
				}
				if (i == 6905) {
					String string = "";
					if (Class187.aClass143_1449 != null) {
						if (Class187.aClass143_1449.anObject1162 != null) {
							string = ((String) Class187.aClass143_1449.anObject1162);
						} else {
							string = (Class98_Sub10_Sub39.method1122(
									Class187.aClass143_1449.anInt1166,
									(byte) -63));
						}
					}
					aStringArray1883[anInt1884++] = string;
					return;
				}
				if (i == 6906) {
					anIntArray1878[anInt1885++] = Class17.anInt203;
					return;
				}
				if (i == 6907) {
					anIntArray1878[anInt1885++] = Class98_Sub46.anInt4264;
					return;
				}
				if (i == 6908) {
					anIntArray1878[anInt1885++] = Class93_Sub2.anInt5491;
					return;
				}
				if (i == 6909) {
					anIntArray1878[anInt1885++] = s_Sub1.aBoolean5200 ? 1 : 0;
					return;
				}
				if (i == 6910) {
					anIntArray1878[anInt1885++] = Class98_Sub46_Sub9.anInt6003;
					return;
				}
				if (i == 6911) {
					anIntArray1878[anInt1885++] = Class98_Sub43_Sub2.anInt5910;
					return;
				}
				if (i == 6912) {
					anIntArray1878[anInt1885++] = Class36.anInt349;
					return;
				}
			} else if (i < 7100) {
				if (i == 7000) {
					final int i_505_ = Class98_Sub28.method1306((byte) -106);
					anIntArray1878[anInt1885++] = Class98_Sub10_Sub24.anInt5671 = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4042
							.method583((byte) 120);
					anIntArray1878[anInt1885++] = i_505_;
					Class98_Sub10.method999((byte) 122);
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					return;
				}
				if (i == 7001) {
					Class98_Sub27.method1284(1);
					Class98_Sub10.method999((byte) -27);
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					return;
				}
				if (i == 7002) {
					Class98_Sub50.method1672((byte) 19);
					Class98_Sub10.method999((byte) 113);
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					return;
				}
				if (i == 7003) {
					Class287.method3385((byte) 27);
					Class98_Sub10.method999((byte) -126);
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					return;
				}
				if (i == 7004) {
					Class98_Sub32.method1436(-100, true);
					Class98_Sub10.method999((byte) -10);
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					return;
				}
				if (i == 7005) {
					Class98_Sub9.aClass98_Sub27_3856
							.method1285(
									(byte) -13,
									0,
									(Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub12_4048));
					Class310.method3618(-5964);
					s_Sub1.aBoolean5207 = false;
					return;
				}
				if (i == 7006) {
					if (Class98_Sub10_Sub24.anInt5671 == 2) {
						Class98_Sub10_Sub38.aBoolean5756 = true;
					} else {
						if (Class98_Sub10_Sub24.anInt5671 == 1) {
							Class95.aBoolean798 = true;
						} else {
							if (Class98_Sub10_Sub24.anInt5671 == 3) {
								Class67.aBoolean520 = true;
							}
							return;
						}
						return;
					}
					return;
				}
				if (i == 7007) {
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub12_4048
							.method600((byte) 123);
					return;
				}
			} else if (i < 7200) {
				if (i == 7100) {
					anInt1885 -= 2;
					final int i_506_ = anIntArray1878[anInt1885];
					int i_507_ = anIntArray1878[anInt1885 + 1];
					if (i_506_ != -1) {
						if (i_507_ > 255) {
							i_507_ = 255;
						} else if (i_507_ < 0) {
							i_507_ = 0;
						}
						Class98_Sub10_Sub30.method1093(-29680, i_507_, false,
								i_506_);
					}
					return;
				}
				if (i == 7101) {
					final int i_508_ = anIntArray1878[--anInt1885];
					if (i_508_ != -1) {
						Class98_Sub11.method1127((byte) 67, i_508_);
					}
					return;
				}
				if (i == 7102) {
					final int i_509_ = anIntArray1878[--anInt1885];
					if (i_509_ != -1) {
						Class98_Sub42.method1476(256, i_509_);
					}
					return;
				}
				if (i == 7103) {
					anIntArray1878[anInt1885++] = Class98_Sub42.method1479(
							"jagtheora", 0) ? 1 : 0;
					return;
				}
			} else if (i < 7300) {
				if (i == 7201) {
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038
							.method597(-1) ? 1 : 0;
					return;
				}
				if (i == 7202) {
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub26_4035
							.method661(-1) ? 1 : 0;
					return;
				}
				if (i == 7203) {
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub7_4073
							.method581(-1) ? 1 : 0;
					return;
				}
				if (i == 7204) {
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub28_4064
							.method671(-1) ? 1 : 0;
					return;
				}
				if (i == 7205) {
					anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub23_4044
							.method647(-1) && Class265.aHa1974.method1823()) ? 1
							: 0;
					return;
				}
				if (i == 7206) {
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub6_4033
							.method575(-1) ? 1 : 0;
					return;
				}
				if (i == 7207) {
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub17_4046
							.method621(-1) ? 1 : 0;
					return;
				}
				if (i == 7208) {
					anIntArray1878[anInt1885++] = (Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub5_4065
							.method571(-1) && Class265.aHa1974.method1767()) ? 1
							: 0;
					return;
				}
				if (i == 7209) {
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub25_4039
							.method657(-1) ? 1 : 0;
					return;
				}
				if (i == 7210) {
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub20_4056
							.method635(-1) ? 1 : 0;
					return;
				}
				if (i == 7211) {
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub16_4040
							.method613(-1) ? 1 : 0;
					return;
				}
				if (i == 7212) {
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub14_4049
							.method607(-1) ? 1 : 0;
					return;
				}
				if (i == 7213) {
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub18_4071
							.method626(-1) ? 1 : 0;
					return;
				}
				if (i == 7214) {
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4062
							.method587(-1) ? 1 : 0;
					return;
				}
			} else if (i < 7400) {
				if (i == 7301) {
					final int i_510_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub11_4038
							.method556(i_510_, 29053);
					return;
				}
				if (i == 7302) {
					final int i_511_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub26_4035
							.method556(i_511_, 29053);
					return;
				}
				if (i == 7303) {
					final int i_512_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub7_4073
							.method556(i_512_, 29053);
					return;
				}
				if (i == 7304) {
					final int i_513_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub28_4064
							.method556(i_513_, 29053);
					return;
				}
				if (i == 7305) {
					final int i_514_ = anIntArray1878[--anInt1885];
					if (!Class265.aHa1974.method1823()) {
						anIntArray1878[anInt1885++] = 3;
					} else {
						anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub23_4044
								.method556(i_514_, 29053);
						return;
					}
					return;
				}
				if (i == 7306) {
					final int i_515_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub6_4033
							.method556(i_515_, 29053);
					return;
				}
				if (i == 7307) {
					final int i_516_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub17_4046
							.method556(i_516_, 29053);
					return;
				}
				if (i == 7308) {
					final int i_517_ = anIntArray1878[--anInt1885];
					if (!Class265.aHa1974.method1767()) {
						anIntArray1878[anInt1885++] = 3;
					} else {
						anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub5_4065
								.method556(i_517_, 29053);
						return;
					}
					return;
				}
				if (i == 7309) {
					final int i_518_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub25_4039
							.method556(i_518_, 29053);
					return;
				}
				if (i == 7310) {
					final int i_519_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub20_4056
							.method556(i_519_, 29053);
					return;
				}
				if (i == 7311) {
					final int i_520_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub16_4040
							.method556(i_520_, 29053);
					return;
				}
				if (i == 7312) {
					final int i_521_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub14_4049
							.method556(i_521_, 29053);
					return;
				}
				if (i == 7313) {
					final int i_522_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub18_4071
							.method556(i_522_, 29053);
					return;
				}
				if (i == 7314) {
					final int i_523_ = anIntArray1878[--anInt1885];
					anIntArray1878[anInt1885++] = Class98_Sub9.aClass98_Sub27_3856.aClass64_Sub8_4062
							.method556(i_523_, 29053);
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(i));
	}

	static {
		anIntArray1887 = new int[5];
		anInt1885 = 0;
		aClass349Array1889 = new Class349[50];
		aCalendar1882 = Calendar.getInstance();
		aStringArray1892 = new String[] { "Jan", "Feb", "Mar", "Apr", "May",
				"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		anIntArray1891 = new int[3];
		aClass79_1890 = new Class79(4);
		anInt1893 = 0;
	}
}
