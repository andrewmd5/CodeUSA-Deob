/* Class98_Sub46_Sub20_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class Class98_Sub46_Sub20_Sub1 extends Class98_Sub46_Sub20 {
	private SoftReference aSoftReference6314;

	@Override
	final boolean method1638(final int i) {
		boolean bool;
		try {
			if (i != 896) {
				return true;
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	Class98_Sub46_Sub20_Sub1(final Interface20 interface20,
			final Object object, final int i) {
		super(interface20, i);
		try {
			aSoftReference6314 = new SoftReference(object);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	final Object method1635(final int i) {
		Object object;
		try {
			object = aSoftReference6314.get();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return object;
	}
}
