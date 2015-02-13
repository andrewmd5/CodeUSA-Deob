/* Class98_Sub46_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class Class98_Sub46_Sub2_Sub1 extends Class98_Sub46_Sub2 {
	private SoftReference aSoftReference6293;

	@Override
	final Object method1533(final boolean bool) {
		Object object;
		try {
			if (bool != true) {
				aSoftReference6293 = null;
			}
			object = aSoftReference6293.get();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return object;
	}

	Class98_Sub46_Sub2_Sub1(final Object object, final int i) {
		super(i);
		try {
			aSoftReference6293 = new SoftReference(object);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final boolean method1536(final int i) {
		boolean bool;
		try {
			if (i <= 116) {
				return true;
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}
}
