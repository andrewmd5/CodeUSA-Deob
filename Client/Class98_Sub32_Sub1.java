/* Class98_Sub32_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

final class Class98_Sub32_Sub1 extends Class98_Sub32 implements ImageProducer {
	static IncomingOpcode aClass58_5883 = new IncomingOpcode(3, 5);
	private Canvas aCanvas5884;
	private ImageConsumer anImageConsumer5885;
	static float aFloat5886;
	static OutgoingOpcode aClass171_5887 = new OutgoingOpcode(84, 4);
	private ColorModel aColorModel5888;
	static Class155[] aClass155Array5889;
	private Image anImage5890;

	public static void method1442(final boolean bool) {
		try {
			if (bool != true) {
				method1442(true);
			}
			aClass58_5883 = null;
			aClass155Array5889 = null;
			aClass171_5887 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fu.L(" + bool
					+ ')');
		}
	}

	private final synchronized void method1443(final byte i) {
		try {
			if (anImageConsumer5885 != null) {
				anImageConsumer5885.setPixels(0, 0,
						((Class98_Sub32) this).anInt4105,
						((Class98_Sub32) this).anInt4110, aColorModel5888,
						((Class98_Sub32) this).anIntArray4108, 0,
						((Class98_Sub32) this).anInt4105);
				anImageConsumer5885.imageComplete(2);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fu.K(" + i + ')');
		}
	}

	@Override
	final void method1434(final Graphics graphics, final int i,
			final byte i_0_, final int i_1_, final int i_2_, final int i_3_,
			final int i_4_, final int i_5_) {
		try {
			method1444((byte) -75, i_3_, i_2_, i_1_, i_4_);
			if (i_0_ != -125) {
				method1443((byte) 87);
			}
			final Shape shape = graphics.getClip();
			graphics.clipRect(i, i_5_, i_2_, i_4_);
			graphics.drawImage(anImage5890, i - i_1_, -i_3_ + i_5_, aCanvas5884);
			graphics.setClip(shape);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fu.A("
					+ (graphics != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ')'));
		}
	}

	@Override
	final void method1441(final int i, final int i_6_, final int i_7_,
			final Canvas canvas) {
		try {
			((Class98_Sub32) this).anInt4105 = i_6_;
			((Class98_Sub32) this).anInt4110 = i;
			aCanvas5884 = canvas;
			((Class98_Sub32) this).anIntArray4108 = new int[(((Class98_Sub32) this).anInt4110 * ((Class98_Sub32) this).anInt4105)];
			aColorModel5888 = new DirectColorModel(32, 16711680, 65280, 255);
			anImage5890 = aCanvas5884.createImage(this);
			method1443((byte) 115);
			if (i_7_ != 4095) {
				method1443((byte) 120);
			}
			aCanvas5884.prepareImage(anImage5890, aCanvas5884);
			method1443((byte) 115);
			aCanvas5884.prepareImage(anImage5890, aCanvas5884);
			method1443((byte) 115);
			aCanvas5884.prepareImage(anImage5890, aCanvas5884);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fu.B(" + i + ','
					+ i_6_ + ',' + i_7_ + ','
					+ (canvas != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final void startProduction(final ImageConsumer imageconsumer) {
		try {
			addConsumer(imageconsumer);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("fu.startProduction("
							+ (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	private final synchronized void method1444(final byte i, final int i_8_,
			final int i_9_, final int i_10_, final int i_11_) {
		try {
			if (i != -75) {
				addConsumer(null);
			}
			if (anImageConsumer5885 != null) {
				anImageConsumer5885.setPixels(i_10_, i_8_, i_9_, i_11_,
						aColorModel5888, ((Class98_Sub32) this).anIntArray4108,
						((Class98_Sub32) this).anInt4105 * i_8_ - -i_10_,
						((Class98_Sub32) this).anInt4105);
				anImageConsumer5885.imageComplete(2);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fu.J(" + i + ','
					+ i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
		}
	}

	@Override
	public final synchronized void addConsumer(final ImageConsumer imageconsumer) {
		try {
			anImageConsumer5885 = imageconsumer;
			imageconsumer.setDimensions(((Class98_Sub32) this).anInt4105,
					((Class98_Sub32) this).anInt4110);
			imageconsumer.setProperties(null);
			imageconsumer.setColorModel(aColorModel5888);
			imageconsumer.setHints(14);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fu.addConsumer("
					+ (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final synchronized boolean isConsumer(
			final ImageConsumer imageconsumer) {
		try {
			if (anImageConsumer5885 != imageconsumer) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("fu.isConsumer("
					+ (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final synchronized void removeConsumer(
			final ImageConsumer imageconsumer) {
		try {
			if (imageconsumer == anImageConsumer5885) {
				anImageConsumer5885 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.method667(runtimeexception, ("fu.removeConsumer("
							+ (imageconsumer != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	public final void requestTopDownLeftRightResend(
			final ImageConsumer imageconsumer) {
		/* empty */
	}
}
