/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108 {
	static final void method1729(final int i,
			final Class246_Sub3_Sub4_Sub2 class246_sub3_sub4_sub2) {
		do {
			try {
				if (i < -89
						&& ((class246_sub3_sub4_sub2.anIntArray6383) != null || (class246_sub3_sub4_sub2.anIntArray6370) != null)) {
					boolean bool = true;
					for (int i_0_ = 0; ((class246_sub3_sub4_sub2.anIntArray6383).length > i_0_); i_0_++) {
						int i_1_ = -1;
						if (class246_sub3_sub4_sub2.anIntArray6383 != null) {
							i_1_ = (class246_sub3_sub4_sub2.anIntArray6383[i_0_]);
						}
						if (i_1_ == -1) {
							if (!class246_sub3_sub4_sub2.method3043(12, i_0_,
									-1)) {
								bool = false;
							}
						} else {
							bool = false;
							int i_4_;
							int i_5_;
							if ((i_1_ & ~0x3fffffff ^ 0xffffffff) == 1073741823) {
								final int i_6_ = 0xfffffff & i_1_;
								final int i_7_ = i_6_ >> 9673934;
								i_5_ = (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084
										+ -256 + -((i_7_ + -Class272.anInt2038) * 512));
								final int i_8_ = 0x3fff & i_6_;
								i_4_ = -256
										- ((-aa_Sub2.anInt3562 + i_8_) * 512 - (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079));
							} else if ((0x8000 & i_1_ ^ 0xffffffff) != -1) {
								final int i_9_ = 0x7fff & i_1_;
								final Class246_Sub3_Sub4_Sub2_Sub2 class246_sub3_sub4_sub2_sub2 = (Class151_Sub9.aClass246_Sub3_Sub4_Sub2_Sub2Array5030[i_9_]);
								if (class246_sub3_sub4_sub2_sub2 != null) {
									i_4_ = (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 - (((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5079));
									i_5_ = (-(((Class246_Sub3) class246_sub3_sub4_sub2_sub2).anInt5084) + (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084));
								} else {
									class246_sub3_sub4_sub2.method3043(12,
											i_0_, -1);
									continue;
								}
							} else {
								final Class98_Sub39 class98_sub39 = ((Class98_Sub39) Class260.aClass377_3254
										.method3990(i_1_, -1));
								if (class98_sub39 != null) {
									final Class246_Sub3_Sub4_Sub2_Sub1 class246_sub3_sub4_sub2_sub1 = (class98_sub39.aClass246_Sub3_Sub4_Sub2_Sub1_4187);
									i_4_ = (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5079 + -(((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5079));
									i_5_ = (((Class246_Sub3) class246_sub3_sub4_sub2).anInt5084 + -(((Class246_Sub3) class246_sub3_sub4_sub2_sub1).anInt5084));
								} else {
									class246_sub3_sub4_sub2.method3043(12,
											i_0_, -1);
									continue;
								}
							}
							if ((i_5_ ^ 0xffffffff) != -1
									|| (i_4_ ^ 0xffffffff) != -1) {
								class246_sub3_sub4_sub2
										.method3043(
												12,
												i_0_,
												(0x3fff & (int) (2607.5945876176133 * Math
														.atan2(i_5_, i_4_))));// mystic
							}
						}
					}
					if (!bool) {
						break;
					}
					class246_sub3_sub4_sub2.anIntArray6370 = null;
					class246_sub3_sub4_sub2.anIntArray6383 = null;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("gs.B("
								+ i
								+ ','
								+ ((class246_sub3_sub4_sub2 != null) ? "{...}"
										: "null") + ')'));
			}
			break;
		} while (false);
	}

	static final String method1730(final int i, final int i_10_, final int i_11_) {
		try {
			if (i_11_ != 16383) {
				return null;
			}
			final int i_12_ = -i_10_ + i;
			if (i_12_ < -9) {
				return "<col=ff0000>";
			}
			if ((i_12_ ^ 0xffffffff) > 5) {
				return "<col=ff3000>";
			}
			if (i_12_ < -3) {
				return "<col=ff7000>";
			}
			if ((i_12_ ^ 0xffffffff) > -1) {
				return "<col=ffb000>";
			}
			if (i_12_ > 9) {
				return "<col=00ff00>";
			}
			if ((i_12_ ^ 0xffffffff) < -7) {
				return "<col=40ff00>";
			}
			if ((i_12_ ^ 0xffffffff) < -4) {
				return "<col=80ff00>";
			}
			if ((i_12_ ^ 0xffffffff) < -1) {
				return "<col=c0ff00>";
			}
			return "<col=ffff00>";
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gs.C(" + i + ','
					+ i_10_ + ',' + i_11_ + ')'));
		}
	}

	static final void method1731(final int i,
			final Class98_Sub22_Sub1 class98_sub22_sub1, final int i_13_) {
		try {
			Class64_Sub24.aBoolean3710 = false;
			Class38.anInt354 = i_13_;
			PlayerUpdate.method2858(class98_sub22_sub1, i_13_ ^ 0xffffffff);
			Class147.method2413(class98_sub22_sub1, 8429);
			if (Class64_Sub24.aBoolean3710) {
				System.out.println("---endgpp---");
			}
			if (i != ((ByteBuffer) class98_sub22_sub1).position) {
				throw new RuntimeException("gpi1 pos:"
						+ ((ByteBuffer) class98_sub22_sub1).position
						+ " psize:" + i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("gs.A(" + i + ','
					+ (class98_sub22_sub1 != null ? "{...}" : "null") + ','
					+ i_13_ + ')'));
		}
	}
}
