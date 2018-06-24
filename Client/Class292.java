/* Class292 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.reflect.Field;

final class Class292 implements Interface10 {
	private int anInt3332;
	private int anInt3333;
	private Image anImage3334;
	private int anInt3335;
	private Image anImage3336;
	private Color aColor3337;
	private int anInt3338;
	static OutgoingOpcode aClass171_3339 = new OutgoingOpcode(75, 0);
	private int anInt3340;
	private Image anImage3341;
	private Image anImage3342;
	private int anInt3343;
	private Image anImage3344;
	private Image anImage3345;
	private Image anImage3346;
	private boolean aBoolean3347;
	private Font aFont3348;
	private int anInt3349;
	private int anInt3350;
	private Image anImage3351;
	private Image anImage3352;
	private Image anImage3353;
	private int anInt3354;
	static int[] anIntArray3355;
	static long aLong3356 = -1L;
	private boolean aBoolean3357;
	private boolean aBoolean3358;
	static int anInt3359;
	private FontMetrics aFontMetrics3360;

	private final int method3445(String string, int i, Object object,
			Class var_class) throws IllegalAccessException,
			NoSuchFieldException {
		try {
			Field field = var_class.getDeclaredField(string);
			if (i != 2235)
				return -79;
			return field.getInt(object);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sa.P("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ (object != null ? "{...}" : "null") + ','
					+ (var_class != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3446(int i) {
		try {
			for (Class98_Sub42 class98_sub42 = ((Class98_Sub42) Class98_Sub10_Sub37.aClass148_5748
					.method2418(32)); class98_sub42 != null; class98_sub42 = ((Class98_Sub42) Class98_Sub10_Sub37.aClass148_5748
					.method2417(88))) {
				if (((Class98_Sub42) class98_sub42).aBoolean4207)
					class98_sub42.method1478(true);
			}
			if (i != 3)
				aLong3356 = 44L;
			for (Class98_Sub42 class98_sub42 = (Class98_Sub42) Class358.aClass148_3032
					.method2418(32); class98_sub42 != null; class98_sub42 = ((Class98_Sub42) Class358.aClass148_3032
					.method2417(103))) {
				if (((Class98_Sub42) class98_sub42).aBoolean4207)
					class98_sub42.method1478(true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sa.J(" + i + ')');
		}
	}

	public final boolean method28(int i, long l) {
		try {
			int i_0_ = 105 % ((-13 - i) / 50);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sa.N(" + i + ','
					+ l + ')');
		}
	}

	private final void method3447(int i) {
		try {
			if (i != 2)
				aFontMetrics3360 = null;
			Class283.method3347(Class140.aClass47_3241.method440(-119),
					Class224_Sub1.aColorArray5036[Class98_Sub9.anInt3855],
					Class301.aColorArray2508[Class98_Sub9.anInt3855],
					Class98_Sub5_Sub1.aColorArray5533[Class98_Sub9.anInt3855],
					Class140.aClass47_3241.method443((byte) -46), 90);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sa.A(" + i + ')');
		}
	}

	public static void method3448(int i) {
		try {
			if (i != 1)
				method3448(-1);
			aClass171_3339 = null;
			anIntArray3355 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sa.M(" + i + ')');
		}
	}

	private final void method3449(int i) throws IllegalAccessException,
			NoSuchFieldException {
		try {
			Class var_class = Class76_Sub11.anApplet3799.getClass();
			anImage3352 = (Image) method3454(var_class, "bar", (byte) 60);
			anImage3334 = (Image) method3454(var_class, "background",
					(byte) 121);
			anImage3345 = (Image) method3454(var_class, "left", (byte) -107);
			anImage3351 = (Image) method3454(var_class, "right", (byte) 86);
			anImage3336 = (Image) method3454(var_class, "top", (byte) 79);
			anImage3353 = (Image) method3454(var_class, "bottom", (byte) -116);
			anImage3344 = (Image) method3454(var_class, "bodyLeft", (byte) 33);
			anImage3341 = (Image) method3454(var_class, "bodyRight",
					(byte) -113);
			anImage3342 = (Image) method3454(var_class, "bodyFill", (byte) -116);
			aFont3348 = (Font) method3454(var_class, "bf", (byte) -125);
			aFontMetrics3360 = (FontMetrics) method3454(var_class, "bfm",
					(byte) 49);
			if (i == 2) {
				aColor3337 = (Color) method3454(var_class, "colourtext",
						(byte) -125);
				Object object = method3454(var_class, "lb", (byte) -116);
				Class var_class_1_ = object.getClass();
				aBoolean3357 = method3452(var_class_1_, (byte) 103, "xMiddle",
						object);
				aBoolean3347 = method3452(var_class_1_, (byte) 97, "yMiddle",
						object);
				anInt3350 = method3445("xOffset", 2235, object, var_class_1_);
				anInt3340 = method3445("yOffset", 2235, object, var_class_1_);
				anInt3333 = method3445("width", 2235, object, var_class_1_);
				anInt3335 = method3445("height", 2235, object, var_class_1_);
				anInt3332 = method3445("boxXOffset", i + 2233, object,
						var_class_1_);
				anInt3354 = method3445("boxYOffset", 2235, object, var_class_1_);
				anInt3343 = method3445("boxWidth", 2235, object, var_class_1_);
				anInt3349 = method3445("textYOffset", i ^ 0x8b9, object,
						var_class_1_);
				anInt3338 = method3445("offsetPerTenCycles", i ^ 0x8b9, object,
						var_class_1_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sa.C(" + i + ')');
		}
	}

	private final int method3450(int i, int i_2_) {
		try {
			if (i_2_ != 0)
				return 49;
			if (aBoolean3347)
				return (-i + Class98_Sub25.anInt4024) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sa.O(" + i + ','
					+ i_2_ + ')');
		}
	}

	public final void method24(int i) {
		do {
			try {
				Class98_Sub40.method1470(3796);
				if (i == -26363)
					break;
				method3448(65);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "sa.K(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final int method3451(int i, int i_3_, boolean bool, int i_4_,
			int i_5_, int i_6_, int i_7_) {
		try {
			i_5_ &= 0x3;
			if ((i_3_ & 0x1 ^ 0xffffffff) == -2) {
				int i_8_ = i_6_;
				i_6_ = i_7_;
				i_7_ = i_8_;
			}
			if (bool != false)
				anInt3359 = -70;
			if ((i_5_ ^ 0xffffffff) == -1)
				return i;
			if (i_5_ == 1)
				return i_4_;
			if ((i_5_ ^ 0xffffffff) == -3)
				return -i + 7 - i_6_ - -1;
			return -i_7_ + 1 + -i_4_ + 7;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sa.L(" + i + ','
					+ i_3_ + ',' + bool + ',' + i_4_ + ',' + i_5_ + ',' + i_6_
					+ ',' + i_7_ + ')'));
		}
	}

	private final boolean method3452(Class var_class, byte i, String string,
			Object object) throws IllegalAccessException, NoSuchFieldException {
		try {
			int i_9_ = -18 % ((51 - i) / 37);
			Field field = var_class.getDeclaredField(string);
			return field.getBoolean(object);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sa.E("
					+ (var_class != null ? "{...}" : "null") + ',' + i + ','
					+ (string != null ? "{...}" : "null") + ','
					+ (object != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method27(int i) {
		try {
			if (i != -31295)
				method3453(-13, 77);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sa.H(" + i + ')');
		}
	}

	public final int method26(int i) {
		try {
			if (i != -794)
				anImage3345 = null;
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sa.F(" + i + ')');
		}
	}

	public final int method25(int i) {
		try {
			if (i != -24591)
				method3451(-96, 3, true, -103, -108, -61, -101);
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sa.D(" + i + ')');
		}
	}

	private final int method3453(int i, int i_10_) {
		try {
			if (aBoolean3357)
				return (Class39_Sub1.anInt3593 + -i) / 2;
			if (i_10_ != 7)
				return -28;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sa.B(" + i + ','
					+ i_10_ + ')');
		}
	}

	private final Object method3454(Class var_class, String string, byte i)
			throws IllegalAccessException, NoSuchFieldException {
		try {
			int i_11_ = -110 / ((-40 - i) / 62);
			Field field = var_class.getDeclaredField(string);
			Object object = field.get(Class76_Sub11.anApplet3799);
			field.set(Class76_Sub11.anApplet3799, null);
			return object;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("sa.G("
					+ (var_class != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public final void method23(int i, boolean bool) {
		try {
			if (!aBoolean3358) {
				if (Class76_Sub11.anApplet3799 != null) {
					if (aFont3348 == null) {
						try {
							method3449(i ^ 0x7dd0);
						} catch (Exception exception) {
							aBoolean3358 = true;
						}
					}
				} else
					aBoolean3358 = true;
			}
			if (aBoolean3358)
				method3447(2);
			else {
				if (i != 32210)
					method26(51);
				Graphics graphics = Class42_Sub3.aCanvas5361.getGraphics();
				if (graphics != null) {
					try {
						int i_12_ = Class140.aClass47_3241.method440(-127);
						String string = Class140.aClass47_3241
								.method443((byte) -46);
						if (Class3.anImage74 == null)
							Class3.anImage74 = (Class42_Sub3.aCanvas5361
									.createImage(Class39_Sub1.anInt3593,
											Class98_Sub25.anInt4024));
						Graphics graphics_13_ = Class3.anImage74.getGraphics();
						graphics_13_.clearRect(0, 0, Class39_Sub1.anInt3593,
								Class98_Sub25.anInt4024);
						int i_14_ = anImage3344.getWidth(null);
						int i_15_ = anImage3341.getWidth(null);
						int i_16_ = anImage3342.getWidth(null);
						int i_17_ = anImage3344.getHeight(null);
						int i_18_ = anImage3341.getHeight(null);
						int i_19_ = anImage3342.getHeight(null);
						graphics_13_
								.drawImage(
										anImage3344,
										(method3453(i_14_, 7) - (-anInt3332 - -(anInt3343 / 2))),
										(method3450(i_17_, 0) + anInt3354),
										null);
						int i_20_ = i_14_ + (anInt3332 + -(anInt3343 / 2));
						int i_21_ = anInt3332 + anInt3343 / 2;
						for (int i_22_ = i_20_; (i_21_ ^ 0xffffffff) <= (i_22_ ^ 0xffffffff); i_22_ += i_16_)
							graphics_13_
									.drawImage(
											anImage3342,
											(method3453(i_14_, 7) + anInt3332 - -i_22_),
											(method3450(i_19_, 0) + anInt3354),
											null);
						graphics_13_
								.drawImage(
										anImage3341,
										(method3453(i_15_, 7) - (-anInt3332 + -(anInt3343 / 2))),
										(method3450(i_18_, 0) + anInt3354),
										null);
						int i_23_ = anImage3345.getWidth(null);
						int i_24_ = anImage3345.getHeight(null);
						int i_25_ = anImage3351.getWidth(null);
						int i_26_ = anImage3351.getHeight(null);
						int i_27_ = anImage3353.getHeight(null);
						int i_28_ = anImage3336.getWidth(null);
						int i_29_ = anImage3336.getHeight(null);
						int i_30_ = anImage3353.getWidth(null);
						int i_31_ = anImage3352.getWidth(null);
						int i_32_ = anImage3334.getWidth(null);
						int i_33_ = method3453(anInt3333, i ^ 0x7dd5)
								+ anInt3350;
						int i_34_ = method3450(anInt3335, 0) + anInt3340;
						graphics_13_.drawImage(anImage3345, i_33_, i_34_
								- -((anInt3335 - i_24_) / 2), null);
						graphics_13_.drawImage(anImage3351, -i_25_ + i_33_
								+ anInt3333,
								((-i_26_ + anInt3335) / 2 + i_34_), null);
						if (anImage3346 == null)
							anImage3346 = (Class42_Sub3.aCanvas5361
									.createImage(-i_25_ + (anInt3333 - i_23_),
											anInt3335));
						Graphics graphics_35_ = anImage3346.getGraphics();
						for (int i_36_ = 0; i_36_ < -i_25_
								+ (-i_23_ + anInt3333); i_36_ += i_28_)
							graphics_35_.drawImage(anImage3336, i_36_, 0, null);
						for (int i_37_ = 0; ((i_37_ ^ 0xffffffff) > (-i_25_
								+ (-i_23_ + anInt3333) ^ 0xffffffff)); i_37_ += i_30_)
							graphics_35_.drawImage(anImage3353, i_37_,
									anInt3335 + -i_27_, null);
						int i_38_ = i_12_ * (-i_25_ + (-i_23_ + anInt3333))
								/ 100;
						if (i_38_ > 0) {
							Image image = (Class42_Sub3.aCanvas5361
									.createImage(i_38_, -i_27_
											+ (-i_29_ + anInt3335)));
							int i_39_ = image.getWidth(null);
							Graphics graphics_40_ = image.getGraphics();
							int i_41_ = (anInt3338
									* RuntimeException_Sub1.method4012(true)
									/ 10 % i_31_);
							for (int i_42_ = i_41_ + -i_31_; (i_42_ ^ 0xffffffff) > (i_39_ ^ 0xffffffff); i_42_ += i_31_)
								graphics_40_.drawImage(anImage3352, i_42_, 0,
										null);
							graphics_35_.drawImage(image, 0, i_29_, null);
						}
						int i_43_ = i_38_;
						i_38_ = -i_38_ + -i_25_ + anInt3333 - i_23_;
						if ((i_38_ ^ 0xffffffff) < -1) {
							Image image = (Class42_Sub3.aCanvas5361
									.createImage(i_38_, -i_27_
											+ (-i_29_ + anInt3335)));
							int i_44_ = image.getWidth(null);
							Graphics graphics_45_ = image.getGraphics();
							for (int i_46_ = 0; i_46_ < i_44_; i_46_ += i_32_)
								graphics_45_.drawImage(anImage3334, i_46_, 0,
										null);
							graphics_35_.drawImage(image, i_43_, i_29_, null);
						}
						graphics_13_.drawImage(anImage3346, i_23_ + i_33_,
								i_34_, null);
						graphics_13_.setFont(aFont3348);
						graphics_13_.setColor(aColor3337);
						graphics_13_.drawString(
								string,
								((anInt3333 - aFontMetrics3360
										.stringWidth(string)) / 2) + i_33_,
								(anInt3349 + i_34_ + anInt3335 / 2 - -4));
						graphics.drawImage(Class3.anImage74, 0, 0, null);
					} catch (Exception exception) {
						aBoolean3358 = true;
					}
				} else
					Class42_Sub3.aCanvas5361.repaint();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "sa.I(" + i + ','
					+ bool + ')');
		}
	}

	public Class292() {
		/* empty */
	}

	static {
		anIntArray3355 = new int[14];
		anInt3359 = 64;
	}
}
