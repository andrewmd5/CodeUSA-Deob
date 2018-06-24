/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class169 {
	private Class162 aClass162_1293;
	static Class169 aClass169_1294 = new Class169(0, 3, Class162.aClass162_1270);
	int anInt1295;
	private int anInt1296;
	static Class169 aClass169_1297 = new Class169(1, 3, Class162.aClass162_1270);
	static Class169 aClass169_1298 = new Class169(2, 4, Class162.aClass162_1266);
	static Class169 aClass169_1299 = new Class169(3, 1, Class162.aClass162_1270);
	int anInt1300;
	static Class169 aClass169_1301 = new Class169(4, 2, Class162.aClass162_1270);
	static Class169 aClass169_1302 = new Class169(5, 3, Class162.aClass162_1270);
	static Class169 aClass169_1303 = new Class169(6, 4, Class162.aClass162_1270);
	static int anInt1304 = Class48_Sub2_Sub1.method474(16, (byte) 31);
	static int anInt1305 = 2;
	static int anInt1306;
	static int anInt1307 = -1;

	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					"lf.toString(" + ')');
		}
	}

	static final void method2535(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		try {
			if (i_3_ > 101) {
				for (Class98_Sub42 class98_sub42 = ((Class98_Sub42) Class98_Sub10_Sub37.aClass148_5748
						.method2418(32)); class98_sub42 != null; class98_sub42 = (Class98_Sub42) Class98_Sub10_Sub37.aClass148_5748
						.method2417(107))
					Class280.method3328(i_1_, 256, i_0_, i_2_, i, class98_sub42);
				for (Class98_Sub42 class98_sub42 = ((Class98_Sub42) Class358.aClass148_3032
						.method2418(32)); class98_sub42 != null; class98_sub42 = (Class98_Sub42) Class358.aClass148_3032
						.method2417(123)) {
					int i_4_ = 1;
					Class294 class294 = ((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209
							.method3039(1);
					if ((((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).anInt6385 ^ 0xffffffff) == 0
							|| (((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).aBoolean6359))
						i_4_ = 0;
					else if (((((Class294) class294).anInt2389 ^ 0xffffffff) == ((((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).anInt6385) ^ 0xffffffff))
							|| (((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).anInt6385) == ((Class294) class294).anInt2361
							|| (((Class294) class294).anInt2402 == (((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).anInt6385))
							|| ((((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).anInt6385) == ((Class294) class294).anInt2357))
						i_4_ = 2;
					else if ((((Class294) class294).anInt2368 == (((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).anInt6385))
							|| (((Class294) class294).anInt2394 == (((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).anInt6385))
							|| (((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).anInt6385) == ((Class294) class294).anInt2403
							|| ((((Class294) class294).anInt2377 ^ 0xffffffff) == ((((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).anInt6385) ^ 0xffffffff)))
						i_4_ = 3;
					if ((((Class98_Sub42) class98_sub42).anInt4227 ^ 0xffffffff) != (i_4_ ^ 0xffffffff)) {
						int i_5_ = (Class277
								.method3293(
										120,
										(((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)));
						NPC class141 = (((Class246_Sub3_Sub4_Sub2_Sub1) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).aClass141_6504);
						if (((NPC) class141).anIntArray1109 != null)
							class141 = class141.method2300(
									Class75.aClass140_584, (byte) 29);
						if (class141 == null || (i_5_ ^ 0xffffffff) == 0) {
							((Class98_Sub42) class98_sub42).anInt4227 = i_4_;
							((Class98_Sub42) class98_sub42).anInt4210 = -1;
							((Class98_Sub42) class98_sub42).aBoolean4215 = false;
						} else if ((((Class98_Sub42) class98_sub42).anInt4210 ^ 0xffffffff) != (i_5_ ^ 0xffffffff)
								|| (!(((Class98_Sub42) class98_sub42).aBoolean4215) == (((NPC) class141).aBoolean1093))) {
							boolean bool = false;
							if ((((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232) != null) {
								((Class98_Sub42) class98_sub42).anInt4236 -= 512;
								if ((((Class98_Sub42) class98_sub42).anInt4236 ^ 0xffffffff) >= -1) {
									Class81.aClass98_Sub31_Sub3_619
											.method1374(((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232);
									((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232 = null;
									bool = true;
								}
							} else
								bool = true;
							if (bool) {
								((Class98_Sub42) class98_sub42).aClass98_Sub24_Sub1_4214 = null;
								((Class98_Sub42) class98_sub42).anInt4236 = ((NPC) class141).anInt1156;
								((Class98_Sub42) class98_sub42).aBoolean4215 = ((NPC) class141).aBoolean1093;
								((Class98_Sub42) class98_sub42).anInt4227 = i_4_;
								((Class98_Sub42) class98_sub42).aClass98_Sub13_4213 = null;
								((Class98_Sub42) class98_sub42).anInt4210 = i_5_;
							}
						} else {
							((Class98_Sub42) class98_sub42).anInt4236 = ((NPC) class141).anInt1156;
							((Class98_Sub42) class98_sub42).anInt4227 = i_4_;
						}
					}
					((Class98_Sub42) class98_sub42).anInt4229 = ((Class246_Sub3) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).anInt5084;
					((Class98_Sub42) class98_sub42).anInt4224 = (((Class246_Sub3) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).anInt5084 + (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209
							.method3034(0) << 1021778312));
					((Class98_Sub42) class98_sub42).anInt4225 = ((Class246_Sub3) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).anInt5079;
					((Class98_Sub42) class98_sub42).anInt4216 = (((Class246_Sub3) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209)).anInt5079 + (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub1_4209
							.method3034(0) << -1760510648));
					Class280.method3328(i_1_, 256, i_0_, i_2_, i, class98_sub42);
				}
				for (Class98_Sub42 class98_sub42 = (Class98_Sub42) Class98_Sub10_Sub14.aClass377_5612
						.method3998(107); class98_sub42 != null; class98_sub42 = (Class98_Sub42) Class98_Sub10_Sub14.aClass377_5612
						.method3995(-1)) {
					int i_6_ = 1;
					Class294 class294 = ((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206
							.method3039(1);
					if (((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt6385 == -1
							|| (((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).aBoolean6359))
						i_6_ = 0;
					else if ((((Class294) class294).anInt2389 != (((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt6385))
							&& ((((Class294) class294).anInt2361 ^ 0xffffffff) != ((((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt6385) ^ 0xffffffff))
							&& (((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt6385) != ((Class294) class294).anInt2402
							&& ((((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt6385) != ((Class294) class294).anInt2357)) {
						if ((((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt6385 == ((Class294) class294).anInt2368)
								|| (((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt6385) == ((Class294) class294).anInt2394
								|| ((((Class294) class294).anInt2403 ^ 0xffffffff) == ((((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt6385) ^ 0xffffffff))
								|| (((Class294) class294).anInt2377 == (((Entity) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt6385)))
							i_6_ = 3;
					} else
						i_6_ = 2;
					if (i_6_ != ((Class98_Sub42) class98_sub42).anInt4227) {
						int i_7_ = (Class286
								.method3383(
										(((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206),
										true));
						if (((i_7_ ^ 0xffffffff) == (((Class98_Sub42) class98_sub42).anInt4210 ^ 0xffffffff))
								&& (!((Class98_Sub42) class98_sub42).aBoolean4215 == !(((Player) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).aBoolean6526))) {
							((Class98_Sub42) class98_sub42).anInt4227 = i_6_;
							((Class98_Sub42) class98_sub42).anInt4236 = (((Player) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt6514);
						} else {
							boolean bool = false;
							if ((((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232) == null)
								bool = true;
							else {
								((Class98_Sub42) class98_sub42).anInt4236 -= 512;
								if ((((Class98_Sub42) class98_sub42).anInt4236 ^ 0xffffffff) >= -1) {
									Class81.aClass98_Sub31_Sub3_619
											.method1374(((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232);
									((Class98_Sub42) class98_sub42).aClass98_Sub31_Sub5_4232 = null;
									bool = true;
								}
							}
							if (bool) {
								((Class98_Sub42) class98_sub42).anInt4210 = i_7_;
								((Class98_Sub42) class98_sub42).aClass98_Sub24_Sub1_4214 = null;
								((Class98_Sub42) class98_sub42).aClass98_Sub13_4213 = null;
								((Class98_Sub42) class98_sub42).anInt4236 = (((Player) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt6514);
								((Class98_Sub42) class98_sub42).anInt4227 = i_6_;
								((Class98_Sub42) class98_sub42).aBoolean4215 = (((Player) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).aBoolean6526);
							}
						}
					}
					((Class98_Sub42) class98_sub42).anInt4229 = ((Class246_Sub3) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt5084;
					((Class98_Sub42) class98_sub42).anInt4224 = (((Class246_Sub3) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt5084 - -(((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206
							.method3034(0) << 1257463912));
					((Class98_Sub42) class98_sub42).anInt4225 = ((Class246_Sub3) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt5079;
					((Class98_Sub42) class98_sub42).anInt4216 = (((Class246_Sub3) (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206)).anInt5079 + (((Class98_Sub42) class98_sub42).aClass246_Sub3_Sub4_Sub2_Sub2_4206
							.method3034(0) << -1206921304));
					Class280.method3328(i_1_, 256, i_0_, i_2_, i, class98_sub42);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lf.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	public static void method2536(int i) {
		try {
			aClass169_1294 = null;
			aClass169_1298 = null;
			aClass169_1302 = null;
			aClass169_1299 = null;
			if (i > -111)
				aClass169_1297 = null;
			aClass169_1301 = null;
			aClass169_1303 = null;
			aClass169_1297 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lf.C(" + i + ')');
		}
	}

	static final Class169 method2537(int i, byte i_8_) {
		try {
			int i_9_ = i;
			while_110_: do {
				while_109_: do {
					while_108_: do {
						while_107_: do {
							while_106_: do {
								while_105_: do {
									do {
										if ((i_9_ ^ 0xffffffff) != -1) {
											if (i_9_ == 1)
												break;
											if ((i_9_ ^ 0xffffffff) == -3)
												break while_105_;
											if (i_9_ == 3)
												break while_106_;
											if ((i_9_ ^ 0xffffffff) == -5)
												break while_107_;
											if (i_9_ == 5)
												break while_108_;
											if ((i_9_ ^ 0xffffffff) != -7)
												break while_110_;
											if (!client.aBoolean3553)
												break while_109_;
										}
										return aClass169_1294;
									} while (false);
									return aClass169_1297;
								} while (false);
								return aClass169_1298;
							} while (false);
							return aClass169_1299;
						} while (false);
						return aClass169_1301;
					} while (false);
					return aClass169_1302;
				} while (false);
				return aClass169_1303;
			} while (false);
			if (i_8_ < 5)
				aClass169_1298 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lf.A(" + i + ','
					+ i_8_ + ')');
		}
	}

	private Class169(int i, int i_10_, Class162 class162) {
		try {
			aClass162_1293 = class162;
			anInt1296 = i_10_;
			((Class169) this).anInt1300 = i;
			((Class169) this).anInt1295 = ((Class162) aClass162_1293).anInt1263
					* anInt1296;
			if (((Class169) this).anInt1300 >= 16)
				throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("lf.<init>(" + i + ',' + i_10_ + ','
							+ (class162 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		anInt1306 = -1;
	}
}
