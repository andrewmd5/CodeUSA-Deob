/* p - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;

final class p extends Class98 implements Interface9 {
	int anInt3319;
	Canvas aCanvas3320;
	private static boolean aBoolean3321 = false;
	int anInt3322;
	long nativeid;
	private static long aLong3323;

	@Override
	protected final void finalize() {
		if (nativeid != 0L) {
			Class192.method2654(false, this);
		}
	}

	final void method1445(final Rectangle[] rectangles, final int i,
			final int i_0_, final int i_1_) {
		try {
			synchronized (aCanvas3320.getTreeLock()) {
				for (int i_2_ = 0; i_2_ < i; i_2_++) {
					final Rectangle rectangle = rectangles[i_2_];
					if (rectangle.width > 0 && rectangle.height > 0) {
						K(rectangle.x, rectangle.y, rectangle.width,
								rectangle.height, i_0_, i_1_);
					}
				}
				aBoolean3321 = false;
			}
		} catch (final Exception exception) {
			method1446(exception);
		}
	}

	private final native void H(int i, int i_3_, int i_4_, int i_5_);

	private final void method1446(final Exception exception) {
		if (!aBoolean3321) {
			aLong3323 = Class343.method3819(-47);
			aBoolean3321 = true;
		} else if (Class343.method3819(-47) - aLong3323 < 30000L) {
			aCanvas3320.repaint();
		} else {
			throw new RuntimeException(exception.getMessage());
		}
	}

	private final native void oa(Canvas canvas, int i, int i_6_);

	private final native void K(int i, int i_7_, int i_8_, int i_9_, int i_10_,
			int i_11_);

	@Override
	public final native void w(boolean bool);

	final void method1447(final int i, final int i_12_) {
		try {
			synchronized (aCanvas3320.getTreeLock()) {
				final Dimension dimension = aCanvas3320.getSize();
				H(i, i_12_, dimension.width, dimension.height);
				aBoolean3321 = false;
			}
		} catch (final Exception exception) {
			method1446(exception);
		}
	}

	p(final oa var_oa, final Canvas canvas, final int i, final int i_13_) {
		aCanvas3320 = canvas;
		anInt3319 = i;
		anInt3322 = i_13_;
		sa(var_oa, aCanvas3320, i, i_13_);
	}

	final void method1448(final Canvas canvas, final int i, final int i_14_) {
		anInt3319 = i;
		anInt3322 = i_14_;
		oa(canvas, i, i_14_);
	}

	final void method1449() {
		w(true);
		nativeid = 0L;
		aCanvas3320 = null;
	}

	private final native void sa(oa var_oa, Canvas canvas, int i, int i_15_);
}
