/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class30 {
	static final boolean method304(final int i, final byte[] is) {
		try {
			final ByteBuffer class98_sub22 = new ByteBuffer(is);
			final int i_0_ = class98_sub22.readUnsignedByte((byte) -100);
			if (i_0_ != 2) {
				return false;
			}
			final boolean bool = (class98_sub22.readUnsignedByte((byte) -123) ^ 0xffffffff) == -2;
			if (bool) {
				ha_Sub1.method1853(2, class98_sub22);
			}
			Class291.method3415(104, class98_sub22);
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cca.A(" + i + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}
}
