/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class157 {
	static byte[][] aByteArrayArray1248 = new byte[1000][];
	static float aFloat1249;
	private Class148 aClass148_1250;
	private Class98 aClass98_1251;

	static final void method2502(final int[] is, final int[] is_0_, final int i) {
		try {
			if (is == null || is_0_ == null) {
				Class190.aByteArrayArrayArray1468 = null;
				Class98_Sub46_Sub13_Sub1.anIntArray6308 = null;
				Class111_Sub1.anIntArray4681 = null;
			} else {
				Class111_Sub1.anIntArray4681 = is;
				Class98_Sub46_Sub13_Sub1.anIntArray6308 = new int[is.length];
				Class190.aByteArrayArrayArray1468 = new byte[is.length][][];
				for (int i_1_ = i; ((Class111_Sub1.anIntArray4681.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff)); i_1_++) {
					Class190.aByteArrayArrayArray1468[i_1_] = new byte[is_0_[i_1_]][];
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kk.E("
					+ (is != null ? "{...}" : "null") + ','
					+ (is_0_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Class98 method2503(final int i) {
		try {
			if (i != 1000) {
				return null;
			}
			final Class98 class98 = aClass98_1251;
			if (aClass148_1250.aClass98_1198 == class98) {
				aClass98_1251 = null;
				return null;
			}
			aClass98_1251 = class98.aClass98_836;
			return class98;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kk.F(" + i + ')');
		}
	}

	final Class98 method2504(final byte i) {
		try {
			if (i >= -113) {
				return null;
			}
			final Class98 class98 = (aClass148_1250.aClass98_1198.aClass98_836);
			if (class98 == aClass148_1250.aClass98_1198) {
				aClass98_1251 = null;
				return null;
			}
			aClass98_1251 = class98.aClass98_836;
			return class98;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kk.B(" + i + ')');
		}
	}

	final void method2505(final byte i, final Class148 class148) {
		try {
			aClass148_1250 = class148;
			if (i != 26) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("kk.C(" + i + ','
					+ (class148 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2506(final int i,
			final Class98_Sub46_Sub8 class98_sub46_sub8) {
		do {
			try {
				if (class98_sub46_sub8 != null && i > 117) {
					Class33.aClass148_315
							.method2419(class98_sub46_sub8, -20911);
					Class359.anInt3058++;
					Class98_Sub46_Sub9 class98_sub46_sub9;
					if (!class98_sub46_sub8.aBoolean5989
							&& !"".equals(class98_sub46_sub8.aString5992)) {
						final long l = (class98_sub46_sub8.aLong5991);
						for (class98_sub46_sub9 = (Class98_Sub46_Sub9) Class98_Sub47.aClass377_4274
								.method3990(l, -1); class98_sub46_sub9 != null; class98_sub46_sub9 = (Class98_Sub46_Sub9) Class98_Sub47.aClass377_4274
								.method3993(122)) {
							if (class98_sub46_sub9.aString5998
									.equals(class98_sub46_sub8.aString5992)) {
								break;
							}
						}
						if (class98_sub46_sub9 == null) {
							class98_sub46_sub9 = (Class98_Sub46_Sub9) Class98_Sub46_Sub16.aClass79_6046
									.method802(-126, l);
							if (class98_sub46_sub9 != null
									&& !(class98_sub46_sub9.aString5998
											.equals(class98_sub46_sub8.aString5992))) {
								class98_sub46_sub9 = null;
							}
							if (class98_sub46_sub9 == null) {
								class98_sub46_sub9 = (new Class98_Sub46_Sub9(
										class98_sub46_sub8.aString5992));
							}
							Class98_Sub47.aClass377_4274.method3996(
									class98_sub46_sub9, l, -1);
							Class64_Sub12.anInt3672++;
						}
					} else {
						class98_sub46_sub9 = new Class98_Sub46_Sub9(
								class98_sub46_sub8.aString5992);
						Class64_Sub12.anInt3672++;
					}
					if (!class98_sub46_sub9.method1555(90, class98_sub46_sub8)) {
						break;
					}
					Class9.method189(class98_sub46_sub9, (byte) 87);
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("kk.A("
								+ i
								+ ','
								+ (class98_sub46_sub8 != null ? "{...}"
										: "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2507(final int i) {
		do {
			try {
				aByteArrayArray1248 = null;
				if (i > 19) {
					break;
				}
				aFloat1249 = -0.7901263F;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "kk.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	public Class157() {
		/* empty */
	}

	Class157(final Class148 class148) {
		try {
			aClass148_1250 = class148;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "kk.<init>("
					+ (class148 != null ? "{...}" : "null") + ')');
		}
	}
}
