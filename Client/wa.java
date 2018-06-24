/* wa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class wa implements Interface17 {
	private long aLong3434 = 0L;
	j aJ3435;
	xa aXa3436;

	@Override
	public final void method56(final int i, final int i_0_, final int i_1_,
			final int i_2_, final int i_3_, final int i_4_, final boolean bool,
			final boolean bool_5_) {
		X(aLong3434, aJ3435.nativeid, aXa3436.nativeid, i, i_0_, i_1_, i_2_,
				i_3_, i_4_, bool, bool_5_);
	}

	private final native void Z(long l, long l_6_, long l_7_, int i, int i_8_,
			int i_9_, int i_10_, int i_11_, int i_12_, boolean bool,
			boolean bool_13_);

	private final native void X(long l, long l_14_, long l_15_, int i,
			int i_16_, int i_17_, int i_18_, int i_19_, int i_20_,
			boolean bool, boolean bool_21_);

	wa(final oa var_oa, final j var_j, final xa var_xa) {
		aLong3434 = var_oa.nativeid;
		aJ3435 = var_j;
		aXa3436 = var_xa;
	}

	@Override
	public final void method57(final int i, final int i_22_, final int i_23_,
			final int i_24_, final int i_25_, final int i_26_,
			final boolean bool, final boolean bool_27_) {
		Z(aLong3434, aJ3435.nativeid, aXa3436.nativeid, i, i_22_, i_23_, i_24_,
				i_25_, i_26_, bool, bool_27_);
	}
}
