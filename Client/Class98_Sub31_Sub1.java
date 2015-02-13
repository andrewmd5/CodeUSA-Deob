/* Class98_Sub31_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub31_Sub1 extends Class98_Sub31 {
	private Class98_Sub31_Sub2 aClass98_Sub31_Sub2_5815;
	static Class305_Sub1 aClass305_Sub1_5816;
	Class148 aClass148_5817 = new Class148();
	Class98_Sub31_Sub3 aClass98_Sub31_Sub3_5818 = new Class98_Sub31_Sub3();

	@Override
	final int method1326() {
		try {
			return 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ap.G(" + ')');
		}
	}

	@Override
	final void method1325(final int[] is, final int i, final int i_0_) {
		try {
			aClass98_Sub31_Sub3_5818.method1325(is, i, i_0_);
			Class98_Sub16 class98_sub16 = ((Class98_Sub16) aClass148_5817
					.method2418(32));
			while_19_: for (/**/; class98_sub16 != null; class98_sub16 = (Class98_Sub16) aClass148_5817
					.method2417(111)) {
				if (!aClass98_Sub31_Sub2_5815.method1345(1816, class98_sub16)) {
					int i_1_ = i;
					int i_2_ = i_0_;
					while (class98_sub16.anInt3923 < i_2_) {
						method1328(i_2_ + i_1_, class98_sub16.anInt3923, i_1_,
								1048575, is, class98_sub16);
						i_1_ += class98_sub16.anInt3923;
						i_2_ -= class98_sub16.anInt3923;
						if (aClass98_Sub31_Sub2_5815.method1340(i_2_, is, 2,
								i_1_, class98_sub16)) {
							continue while_19_;
						}
					}
					method1328(i_2_ + i_1_, i_2_, i_1_, 1048575, is,
							class98_sub16);
					class98_sub16.anInt3923 -= i_2_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("ap.A(" + (is != null ? "{...}" : "null") + ',' + i + ','
							+ i_0_ + ')'));
		}
	}

	private final void method1328(final int i, int i_3_, int i_4_,
			final int i_5_, final int[] is, final Class98_Sub16 class98_sub16) {
		do {
			try {
				if (((aClass98_Sub31_Sub2_5815.anIntArray5840[class98_sub16.anInt3940]) & 0x4 ^ 0xffffffff) != -1
						&& class98_sub16.anInt3930 < 0) {
					final int i_6_ = ((aClass98_Sub31_Sub2_5815.anIntArray5843[class98_sub16.anInt3940]) / Class64_Sub15.anInt3678);
					for (;;) {
						final int i_7_ = ((1048575 - -i_6_ + -class98_sub16.anInt3919) / i_6_);
						if (i_3_ < i_7_) {
							break;
						}
						class98_sub16.aClass98_Sub31_Sub5_3939.method1325(is,
								i_4_, i_7_);
						i_4_ += i_7_;
						class98_sub16.anInt3919 += i_7_ * i_6_ - 1048576;
						i_3_ -= i_7_;
						int i_8_ = Class64_Sub15.anInt3678 / 100;
						final int i_9_ = 262144 / i_6_;
						if (i_9_ < i_8_) {
							i_8_ = i_9_;
						}
						final Class98_Sub31_Sub5 class98_sub31_sub5 = (class98_sub16.aClass98_Sub31_Sub5_3939);
						if (((aClass98_Sub31_Sub2_5815.anIntArray5842[class98_sub16.anInt3940]) ^ 0xffffffff) != -1) {
							class98_sub16.aClass98_Sub31_Sub5_3939 = (Class98_Sub31_Sub5
									.method1402(
											(class98_sub16.aClass98_Sub24_Sub1_3934),
											class98_sub31_sub5.method1430(), 0,
											class98_sub31_sub5.method1426()));
							aClass98_Sub31_Sub2_5815
									.method1361(
											1,
											(((class98_sub16.aClass98_Sub44_3918).aShortArray4248[class98_sub16.anInt3936]) ^ 0xffffffff) > -1,
											class98_sub16);
							class98_sub16.aClass98_Sub31_Sub5_3939.method1397(
									i_8_, class98_sub31_sub5.method1400());
						} else {
							class98_sub16.aClass98_Sub31_Sub5_3939 = (Class98_Sub31_Sub5
									.method1402(
											(class98_sub16.aClass98_Sub24_Sub1_3934),
											class98_sub31_sub5.method1430(),
											class98_sub31_sub5.method1400(),
											class98_sub31_sub5.method1426()));
						}
						if ((((class98_sub16.aClass98_Sub44_3918).aShortArray4248[class98_sub16.anInt3936]) ^ 0xffffffff) > -1) {
							class98_sub16.aClass98_Sub31_Sub5_3939
									.method1422(-1);
						}
						class98_sub31_sub5.method1423(i_8_);
						class98_sub31_sub5.method1325(is, i_4_, i - i_4_);
						if (class98_sub31_sub5.method1425()) {
							aClass98_Sub31_Sub3_5818
									.method1371(class98_sub31_sub5);
						}
					}
					class98_sub16.anInt3919 += i_6_ * i_3_;
				}
				class98_sub16.aClass98_Sub31_Sub5_3939.method1325(is, i_4_,
						i_3_);
				if (i_5_ == 1048575) {
					break;
				}
				method1321(-128);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("ap.C(" + i
						+ ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ','
						+ (is != null ? "{...}" : "null") + ','
						+ (class98_sub16 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method1329(final byte i) {
		try {
			if (i >= -17) {
				aClass305_Sub1_5816 = null;
			}
			aClass305_Sub1_5816 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ap.E(" + i + ')');
		}
	}

	@Override
	final Class98_Sub31 method1327() {
		try {
			Class98_Sub16 class98_sub16;
			do {
				class98_sub16 = (Class98_Sub16) aClass148_5817.method2417(117);
				if (class98_sub16 == null) {
					return null;
				}
			} while (class98_sub16.aClass98_Sub31_Sub5_3939 == null);
			return class98_sub16.aClass98_Sub31_Sub5_3939;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ap.D(" + ')');
		}
	}

	@Override
	final Class98_Sub31 method1322() {
		try {
			final Class98_Sub16 class98_sub16 = ((Class98_Sub16) aClass148_5817
					.method2418(32));
			if (class98_sub16 == null) {
				return null;
			}
			if (class98_sub16.aClass98_Sub31_Sub5_3939 != null) {
				return (class98_sub16.aClass98_Sub31_Sub5_3939);
			}
			return method1327();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ap.B(" + ')');
		}
	}

	@Override
	final void method1321(final int i) {
		try {
			aClass98_Sub31_Sub3_5818.method1321(i);
			Class98_Sub16 class98_sub16 = ((Class98_Sub16) aClass148_5817
					.method2418(32));
			while_21_: for (/**/; class98_sub16 != null; class98_sub16 = (Class98_Sub16) aClass148_5817
					.method2417(94)) {
				if (!aClass98_Sub31_Sub2_5815.method1345(1816, class98_sub16)) {
					int i_10_ = i;
					while ((i_10_ ^ 0xffffffff) < (class98_sub16.anInt3923 ^ 0xffffffff)) {
						method1330(class98_sub16.anInt3923, class98_sub16, -1);
						i_10_ -= class98_sub16.anInt3923;
						if (aClass98_Sub31_Sub2_5815.method1340(i_10_, null, 2,
								0, class98_sub16)) {
							continue while_21_;
						}
					}
					method1330(i_10_, class98_sub16, -1);
					class98_sub16.anInt3923 -= i_10_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "ap.M(" + i + ')');
		}
	}

	private final void method1330(int i, final Class98_Sub16 class98_sub16,
			final int i_11_) {
		try {
			if ((0x4 & (aClass98_Sub31_Sub2_5815.anIntArray5840[class98_sub16.anInt3940])) != 0
					&& ((class98_sub16.anInt3930 ^ 0xffffffff) > -1)) {
				final int i_12_ = ((aClass98_Sub31_Sub2_5815.anIntArray5843[class98_sub16.anInt3940]) / Class64_Sub15.anInt3678);
				final int i_13_ = ((1048575 - (-i_12_ - -class98_sub16.anInt3919)) / i_12_);
				class98_sub16.anInt3919 = 0xfffff & (i * i_12_ + class98_sub16.anInt3919);
				if ((i_13_ ^ 0xffffffff) >= (i ^ 0xffffffff)) {
					do {
						if ((aClass98_Sub31_Sub2_5815.anIntArray5842[class98_sub16.anInt3940]) != 0) {
							class98_sub16.aClass98_Sub31_Sub5_3939 = (Class98_Sub31_Sub5
									.method1402(
											(class98_sub16.aClass98_Sub24_Sub1_3934),
											class98_sub16.aClass98_Sub31_Sub5_3939
													.method1430(),
											0,
											class98_sub16.aClass98_Sub31_Sub5_3939
													.method1426()));
							aClass98_Sub31_Sub2_5815
									.method1361(
											i_11_ + 2,
											(((class98_sub16.aClass98_Sub44_3918).aShortArray4248[class98_sub16.anInt3936]) ^ 0xffffffff) > -1,
											class98_sub16);
							if (!client.aBoolean3553) {
								break;
							}
						}
						class98_sub16.aClass98_Sub31_Sub5_3939 = (Class98_Sub31_Sub5
								.method1402(
										(class98_sub16.aClass98_Sub24_Sub1_3934),
										class98_sub16.aClass98_Sub31_Sub5_3939
												.method1430(),
										class98_sub16.aClass98_Sub31_Sub5_3939
												.method1400(),
										class98_sub16.aClass98_Sub31_Sub5_3939
												.method1426()));
					} while (false);
					if (((class98_sub16.aClass98_Sub44_3918.aShortArray4248[class98_sub16.anInt3936]) ^ 0xffffffff) > -1) {
						class98_sub16.aClass98_Sub31_Sub5_3939.method1422(-1);
					}
					i = class98_sub16.anInt3919 / i_12_;
				}
			}
			if (i_11_ != -1) {
				method1327();
			}
			class98_sub16.aClass98_Sub31_Sub5_3939.method1321(i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("ap.F(" + i + ','
							+ (class98_sub16 != null ? "{...}" : "null") + ','
							+ i_11_ + ')'));
		}
	}

	Class98_Sub31_Sub1(final Class98_Sub31_Sub2 class98_sub31_sub2) {
		try {
			aClass98_Sub31_Sub2_5815 = class98_sub31_sub2;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("ap.<init>("
					+ (class98_sub31_sub2 != null ? "{...}" : "null") + ')'));
		}
	}
}
