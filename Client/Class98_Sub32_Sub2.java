/* Class98_Sub32_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

final class Class98_Sub32_Sub2 extends Class98_Sub32 {
	private Shape aShape5891;
	private Canvas aCanvas5892;
	private Rectangle aRectangle5893;
	private Image anImage5894;

	@Override
	final void method1441(final int i, final int i_0_, final int i_1_,
			final Canvas canvas) {
		try {
			aCanvas5892 = canvas;
			aRectangle5893 = new Rectangle();
			anInt4110 = i;
			anInt4105 = i_0_;
			anIntArray4108 = new int[(anInt4110 * anInt4105)];
			if (i_1_ != 4095) {
				method1441(-47, -17, -7, null);
			}
			final DataBufferInt databufferint = new DataBufferInt(
					anIntArray4108, (anIntArray4108).length);
			final DirectColorModel directcolormodel = new DirectColorModel(32,
					16711680, 65280, 255);
			final WritableRaster writableraster = Raster.createWritableRaster(
					(directcolormodel.createCompatibleSampleModel((anInt4105),
							(anInt4110))), databufferint, null);
			anImage5894 = new BufferedImage(directcolormodel, writableraster,
					false, new Hashtable());
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final void method1434(final Graphics graphics, final int i,
			final byte i_2_, final int i_3_, final int i_4_, final int i_5_,
			final int i_6_, final int i_7_) {
		try {
			if (i_2_ == -125) {
				aShape5891 = graphics.getClip();
				aRectangle5893.width = i_4_;
				aRectangle5893.x = i;
				aRectangle5893.y = i_7_;
				aRectangle5893.height = i_6_;
				graphics.setClip(aRectangle5893);
				graphics.drawImage(anImage5894, i + -i_3_, -i_5_ + i_7_,
						aCanvas5892);
				graphics.setClip(aShape5891);
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
