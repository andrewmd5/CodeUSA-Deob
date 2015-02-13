/* Class246_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class246_Sub3 extends Class246 {
	boolean aBoolean5078;
	int anInt5079;
	int anInt5080;
	byte aByte5081;
	boolean aBoolean5082 = false;
	int anInt5083;
	int anInt5084;
	int anInt5085;
	static IncomingOpcode aClass58_5086 = new IncomingOpcode(83, 20);
	static Class207 ANIMATION_INDEX;
	byte aByte5088;
	int anInt5089;
	Class246_Sub3 aClass246_Sub3_5090;

	abstract Class228 method2974(byte i, ha var_ha);

	abstract Class246_Sub1 method2975(ha var_ha, int i);

	abstract boolean method2976(int i, ha var_ha, byte i_0_, int i_1_);

	abstract boolean method2977(ha var_ha, byte i);

	abstract boolean method2978(int i);

	static final Class98_Sub47 method2979(final int i) {
		try {
			if (Class278.aClass148_2065 == null
					|| Class98_Sub5.aClass157_3835 == null) {
				return null;
			}
			Class98_Sub47 class98_sub47 = (Class98_Sub47) Class98_Sub5.aClass157_3835
					.method2503(1000);
			for (/**/; class98_sub47 != null; class98_sub47 = (Class98_Sub47) Class98_Sub5.aClass157_3835
					.method2503(1000)) {
				final Class24 class24 = Class278.aClass341_2057.method3807(123,
						(class98_sub47.anInt4268));
				if (class24 != null && class24.aBoolean241
						&& class24.method284(35, Class278.anInterface6_2060)) {
					return class98_sub47;
				}
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gg.LB(" + i + ')');
		}
	}

	abstract int method2980(int i, Class98_Sub5[] class98_sub5s);

	abstract void method2981(Class246_Sub3 class246_sub3_3_, byte i,
			boolean bool, int i_4_, ha var_ha, int i_5_, int i_6_);

	abstract boolean method2982(byte i);

	public static void method2983(final byte i) {
		try {
			aClass58_5086 = null;
			if (i <= -45) {
				ANIMATION_INDEX = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gg.NB(" + i + ')');
		}
	}

	static final void method2984(final int i, final byte i_7_, final int i_8_,
			final int i_9_) {
		do {
			try {
				final Class98_Sub46_Sub17 class98_sub46_sub17 = Class185
						.method2628(i_9_, i_7_ + 2, 11);
				class98_sub46_sub17.method1626((byte) -103);
				class98_sub46_sub17.anInt6054 = i_8_;
				class98_sub46_sub17.anInt6051 = i;
				if (i_7_ == -105) {
					break;
				}
				method2983((byte) 8);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("gg.OB(" + i
						+ ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
			}
			break;
		} while (false);
	}

	abstract int method2985(boolean bool);

	int method2986(final int i) {
		try {
			if (i != -14240) {
				method2976(82, null, (byte) -22, -7);
			}
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "gg.FB(" + i + ')');
		}
	}

	abstract boolean method2987(int i);

	abstract void method2988(ha var_ha, int i);

	final int method2989(final int i, final boolean bool,
			final Class98_Sub5[] class98_sub5s, final int i_10_) {
		try {
			if (bool != false) {
				method2988(null, -104);
			}
			final long l = (Class373_Sub3.aLongArrayArrayArray5476[aByte5088][i][i_10_]);
			long l_11_ = 0L;
			int i_12_ = 0;
			while (l_11_ <= 48L) {
				final int i_13_ = (int) (0xffffL & l >> (int) l_11_);
				if (i_13_ <= 0) {
					break;
				}
				l_11_ += 16L;
				class98_sub5s[i_12_++] = (Class98_Sub10_Sub31.aClass1Array5717[-1
						+ i_13_]).aClass98_Sub5_55;
			}
			for (int i_14_ = i_12_; (i_14_ ^ 0xffffffff) > -5; i_14_++) {
				class98_sub5s[i_14_] = null;
			}
			return i_12_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gg.MB(" + i + ','
					+ bool + ',' + (class98_sub5s != null ? "{...}" : "null")
					+ ',' + i_10_ + ')'));
		}
	}

	abstract int method2990(int i);

	abstract boolean method2991(boolean bool);

	abstract void method2992(byte i);

	public Class246_Sub3() {
		/* empty */
	}
}
