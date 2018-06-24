/* VertexNormal - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class VertexNormal {
	static long aLong904;
	int anInt905;
	int anInt906;
	int anInt907;
	int anInt908;

	final VertexNormal method1719(final int i, final int i_0_) {
		try {
			if (i_0_ > -100) {
				return null;
			}
			return new VertexNormal(anInt905, i, anInt908, anInt907);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "gn.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	VertexNormal(final int i, final int i_1_, final int i_2_, final int i_3_) {
		try {
			anInt906 = i_1_;
			anInt907 = i_3_;
			anInt908 = i_2_;
			anInt905 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("gn.<init>(" + i
					+ ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}
}
