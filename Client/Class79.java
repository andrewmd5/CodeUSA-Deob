/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.lang.reflect.Method;

final class Class79 {
	private int anInt598;
	private Class377 aClass377_599;
	static Class85 aClass85_600 = new Class85(8, 4);
	static int anInt601;
	static boolean aBoolean602 = false;
	static int[] anIntArray603 = new int[1000];
	static int[] anIntArray604 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023,
			2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287,
			1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863,
			134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
	private int anInt605;
	private Class215 aClass215_606 = new Class215();
	/* synthetic */static Class aClass607;

	final int method793(int i) {
		try {
			if (i <= 6)
				anIntArray603 = null;
			return anInt598;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fc.H(" + i + ')');
		}
	}

	final void method794(int i) {
		try {
			aClass215_606.method2786(16711680);
			aClass377_599.method3994(-99);
			if (i <= 0)
				method796(null, 41);
			anInt605 = anInt598;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fc.L(" + i + ')');
		}
	}

	static final boolean method795(int i, Class var_class, String string) {
		try {
			int i_0_ = -53 / ((i - -65) / 50);
			Class var_class_1_ = (Class) Class10.aHashtable118.get(string);
			if (var_class_1_ != null) {
				if (var_class_1_.getClassLoader() != var_class.getClassLoader())
					return false;
				return true;
			}
			File file = null;
			if (file == null)
				file = (File) Class124.aHashtable1015.get(string);
			if (file != null) {
				try {
					file = new File(file.getCanonicalPath());
					Class var_class_2_ = Class.forName("java.lang.Runtime");
					Class var_class_3_ = Class
							.forName("java.lang.reflect.AccessibleObject");
					Method method = var_class_3_.getDeclaredMethod(
							"setAccessible", (new Class[] { Boolean.TYPE }));
					Method method_4_ = (var_class_2_.getDeclaredMethod("load0",
							(new Class[] { Class.forName("java.lang.Class"),
									Class.forName("java.lang.String") })));
					method.invoke(method_4_, new Object[] { Boolean.TRUE });
					method_4_.invoke(Runtime.getRuntime(), new Object[] {
							var_class, file.getPath() });
					method.invoke(method_4_, new Object[] { Boolean.FALSE });
					Class10.aHashtable118.put(string, var_class);
					return true;
				} catch (NoSuchMethodException nosuchmethodexception) {
					System.load(file.getPath());
					Class10.aHashtable118.put(string,
							(aClass607 != null ? aClass607
									: (aClass607 = method809("Class166"))));
					return true;
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fc.O(" + i + ','
					+ (var_class != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method796(Class98_Sub46_Sub2 class98_sub46_sub2, int i) {
		do {
			try {
				if (class98_sub46_sub2 != null) {
					class98_sub46_sub2.method942(56);
					class98_sub46_sub2.method1524((byte) -90);
					anInt605 += ((Class98_Sub46_Sub2) class98_sub46_sub2).anInt5950;
				}
				if (i == 7)
					break;
				anInt598 = 122;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("fc.G("
						+ (class98_sub46_sub2 != null ? "{...}" : "null") + ','
						+ i + ')'));
			}
			break;
		} while (false);
	}

	final int method797(int i) {
		try {
			int i_5_ = 0;
			if (i > -117)
				method799(33);
			for (Class98_Sub46_Sub2 class98_sub46_sub2 = (Class98_Sub46_Sub2) aClass215_606
					.method2792(-1); class98_sub46_sub2 != null; class98_sub46_sub2 = (Class98_Sub46_Sub2) aClass215_606
					.method2787(0)) {
				if (!class98_sub46_sub2.method1536(127))
					i_5_++;
			}
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fc.I(" + i + ')');
		}
	}

	public static void method798(byte i) {
		do {
			try {
				aClass85_600 = null;
				anIntArray604 = null;
				anIntArray603 = null;
				if (i == 22)
					break;
				method801((byte) -119, -90, 83, 33);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "fc.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final int method799(int i) {
		try {
			if (i != 1551398789)
				anIntArray604 = null;
			return anInt605;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fc.E(" + i + ')');
		}
	}

	Class79(int i) {
		this(i, i);
	}

	final void method800(byte i, int i_6_) {
		try {
			if (Class246_Sub3_Sub3.aClass206_6154 != null) {
				for (Class98_Sub46_Sub2 class98_sub46_sub2 = (Class98_Sub46_Sub2) aClass215_606
						.method2792(-1); class98_sub46_sub2 != null; class98_sub46_sub2 = (Class98_Sub46_Sub2) aClass215_606
						.method2787(0)) {
					if (!class98_sub46_sub2.method1536(124)) {
						if ((long) i_6_ < ++((Class98_Sub46) class98_sub46_sub2).aLong4259) {
							Class98_Sub46_Sub2 class98_sub46_sub2_7_ = Class246_Sub3_Sub3.aClass206_6154
									.method2726(0, class98_sub46_sub2);
							aClass377_599.method3996(class98_sub46_sub2_7_,
									(((Node) class98_sub46_sub2).aLong832),
									-1);
							Class101.method1697(class98_sub46_sub2, (byte) 37,
									class98_sub46_sub2_7_);
							class98_sub46_sub2.method942(i + 43);
							class98_sub46_sub2.method1524((byte) -90);
						}
					} else if (class98_sub46_sub2.method1533(true) == null) {
						class98_sub46_sub2.method942(98);
						class98_sub46_sub2.method1524((byte) -90);
						anInt605 += (((Class98_Sub46_Sub2) class98_sub46_sub2).anInt5950);
					}
				}
			}
			if (i != 62)
				anInt605 = -25;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fc.P(" + i + ','
					+ i_6_ + ')');
		}
	}

	static final int method801(byte i, int i_8_, int i_9_, int i_10_) {
		try {
			if (i != -11)
				return 96;
			if ((i_10_ ^ 0xffffffff) < -244)
				i_8_ >>= 4;
			else if (i_10_ <= 217) {
				if (i_10_ > 192)
					i_8_ >>= 2;
				else if ((i_10_ ^ 0xffffffff) < -180)
					i_8_ >>= 1;
			} else
				i_8_ >>= 3;
			return ((i_10_ >> -1942171039) + (i_8_ >> 1551398789 << 908165991) + ((i_9_ >> 466286402 & 0x3f) << 1714760906));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fc.A(" + i + ','
					+ i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	final Object method802(int i, long l) {
		try {
			if (i > -118)
				aClass377_599 = null;
			Class98_Sub46_Sub2 class98_sub46_sub2 = (Class98_Sub46_Sub2) aClass377_599
					.method3990(l, -1);
			if (class98_sub46_sub2 == null)
				return null;
			Object object = class98_sub46_sub2.method1533(true);
			if (object == null) {
				class98_sub46_sub2.method942(100);
				class98_sub46_sub2.method1524((byte) -90);
				anInt605 += ((Class98_Sub46_Sub2) class98_sub46_sub2).anInt5950;
				return null;
			}
			do {
				if (class98_sub46_sub2.method1536(119)) {
					Class98_Sub46_Sub2_Sub2 class98_sub46_sub2_sub2 = new Class98_Sub46_Sub2_Sub2(
							object,
							(((Class98_Sub46_Sub2) class98_sub46_sub2).anInt5950));
					aClass377_599.method3996(class98_sub46_sub2_sub2,
							(((Node) class98_sub46_sub2).aLong832), -1);
					aClass215_606.method2785(class98_sub46_sub2_sub2, -55);
					((Class98_Sub46) class98_sub46_sub2_sub2).aLong4259 = 0L;
					class98_sub46_sub2.method942(123);
					class98_sub46_sub2.method1524((byte) -90);
					if (!client.aBoolean3553)
						break;
				}
				aClass215_606.method2785(class98_sub46_sub2, -50);
				((Class98_Sub46) class98_sub46_sub2).aLong4259 = 0L;
			} while (false);
			return object;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fc.F(" + i + ','
					+ l + ')');
		}
	}

	final Object method803(boolean bool) {
		try {
			if (bool != false)
				anInt605 = -74;
			Class98_Sub46_Sub2 class98_sub46_sub2 = (Class98_Sub46_Sub2) aClass377_599
					.method3998(116);
			while (class98_sub46_sub2 != null) {
				Object object = class98_sub46_sub2.method1533(true);
				if (object == null) {
					Class98_Sub46_Sub2 class98_sub46_sub2_11_ = class98_sub46_sub2;
					class98_sub46_sub2 = (Class98_Sub46_Sub2) aClass377_599
							.method3995(-1);
					class98_sub46_sub2_11_.method942(73);
					class98_sub46_sub2_11_.method1524((byte) -90);
					anInt605 += (((Class98_Sub46_Sub2) class98_sub46_sub2_11_).anInt5950);
				} else
					return object;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fc.D(" + bool
					+ ')');
		}
	}

	final Object method804(boolean bool) {
		try {
			Class98_Sub46_Sub2 class98_sub46_sub2 = (Class98_Sub46_Sub2) aClass377_599
					.method3995(-1);
			if (bool != false)
				return null;
			while (class98_sub46_sub2 != null) {
				Object object = class98_sub46_sub2.method1533(true);
				if (object != null)
					return object;
				Class98_Sub46_Sub2 class98_sub46_sub2_12_ = class98_sub46_sub2;
				class98_sub46_sub2 = (Class98_Sub46_Sub2) aClass377_599
						.method3995(-1);
				class98_sub46_sub2_12_.method942(74);
				class98_sub46_sub2_12_.method1524((byte) -90);
				anInt605 += ((Class98_Sub46_Sub2) class98_sub46_sub2_12_).anInt5950;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fc.C(" + bool
					+ ')');
		}
	}

	final void method805(long l, Object object, byte i) {
		try {
			method807(13436, l, 1, object);
			if (i != -80)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fc.M(" + l + ','
					+ (object != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method806(byte i) {
		try {
			int i_13_ = -40 / ((i - -35) / 43);
			for (Class98_Sub46_Sub2 class98_sub46_sub2 = (Class98_Sub46_Sub2) aClass215_606
					.method2792(-1); class98_sub46_sub2 != null; class98_sub46_sub2 = (Class98_Sub46_Sub2) aClass215_606
					.method2787(0)) {
				if (class98_sub46_sub2.method1536(122)) {
					class98_sub46_sub2.method942(55);
					class98_sub46_sub2.method1524((byte) -90);
					anInt605 += ((Class98_Sub46_Sub2) class98_sub46_sub2).anInt5950;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fc.K(" + i + ')');
		}
	}

	final void method807(int i, long l, int i_14_, Object object) {
		try {
			if ((i_14_ ^ 0xffffffff) < (anInt598 ^ 0xffffffff))
				throw new IllegalStateException("s>cs");
			method808(l, i + 67095427);
			anInt605 -= i_14_;
			while (anInt605 < 0) {
				Class98_Sub46_Sub2 class98_sub46_sub2 = ((Class98_Sub46_Sub2) aClass215_606
						.method2789(i ^ ~0xff3483));
				method796(class98_sub46_sub2, i ^ 0x347b);
			}
			Class98_Sub46_Sub2_Sub2 class98_sub46_sub2_sub2 = new Class98_Sub46_Sub2_Sub2(
					object, i_14_);
			aClass377_599.method3996(class98_sub46_sub2_sub2, l, -1);
			if (i != 13436)
				method807(-1, 58L, 23, null);
			aClass215_606.method2785(class98_sub46_sub2_sub2, -28);
			((Class98_Sub46) class98_sub46_sub2_sub2).aLong4259 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fc.J(" + i + ','
					+ l + ',' + i_14_ + ','
					+ (object != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method808(long l, int i) {
		try {
			if (i != 67108863)
				method794(-39);
			Class98_Sub46_Sub2 class98_sub46_sub2 = (Class98_Sub46_Sub2) aClass377_599
					.method3990(l, -1);
			method796(class98_sub46_sub2, 7);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "fc.N(" + l + ','
					+ i + ')');
		}
	}

	Class79(int i, int i_15_) {
		try {
			anInt598 = i;
			anInt605 = i;
			int i_16_;
			for (i_16_ = 1; ((i ^ 0xffffffff) < (i_16_ + i_16_ ^ 0xffffffff) && (i_16_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff)); i_16_ += i_16_) {
				/* empty */
			}
			aClass377_599 = new Class377(i_16_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("fc.<init>(" + i
					+ ',' + i_15_ + ')'));
		}
	}

	/* synthetic */static Class method809(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
