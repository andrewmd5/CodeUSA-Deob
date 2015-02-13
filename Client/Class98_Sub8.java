/* Class98_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub8 extends Class98 implements Interface7 {
	static OutgoingOpcode aClass171_3264 = new OutgoingOpcode(74, -1);
	char aChar3265;
	int anInt3266;
	long aLong3267;
	int anInt3268;
	int anInt3269;

	@Override
	public final long method18(final int i) {
		try {
			if (i >= -20) {
				method987(53);
			}
			return aLong3267;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.B(" + i + ')');
		}
	}

	@Override
	public final int method17(final boolean bool) {
		try {
			if (bool != true) {
				aLong3267 = 43L;
			}
			return anInt3269;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.E(" + bool
					+ ')');
		}
	}

	static final void method986(final int i, final int i_0_,
			final Class293 class293, final int i_1_) {
		do {
			try {
				if ((class293.aByte2245 ^ 0xffffffff) == -1) {
					class293.anInt2299 = class293.anInt2229;
				} else if ((class293.aByte2245 ^ 0xffffffff) == -2) {
					class293.anInt2299 = (class293.anInt2229 + (-class293.anInt2258 + i_0_) / 2);
				} else if (class293.aByte2245 != 2) {
					if ((class293.aByte2245 ^ 0xffffffff) != -4) {
						if ((class293.aByte2245 ^ 0xffffffff) != -5) {
							class293.anInt2299 = (-(class293.anInt2229 * i_0_ >> -1245136754) + (-class293.anInt2258 + i_0_));
						} else {
							class293.anInt2299 = ((i_0_ * class293.anInt2229 >> 925133390) + ((i_0_ - class293.anInt2258) / 2));
						}
					} else {
						class293.anInt2299 = (i_0_ * class293.anInt2229 >> -1820578994);
					}
				} else {
					class293.anInt2299 = (i_0_ - class293.anInt2258 + -class293.anInt2229);
				}
				if ((class293.aByte2240 ^ 0xffffffff) == -1) {
					class293.anInt2347 = class293.anInt2283;
				} else if (class293.aByte2240 == 1) {
					class293.anInt2347 = (class293.anInt2283 + (i - class293.anInt2311) / 2);
				} else if (class293.aByte2240 != 2) {
					if (class293.aByte2240 != 3) {
						if ((class293.aByte2240 ^ 0xffffffff) == -5) {
							class293.anInt2347 = ((-class293.anInt2311 + i) / 2 + (i
									* class293.anInt2283 >> 853340622));
						} else {
							class293.anInt2347 = i
									+ (-class293.anInt2311 + -(i
											* class293.anInt2283 >> -1549429234));
						}
					} else {
						class293.anInt2347 = (class293.anInt2283 * i >> 1647618894);
					}
				} else {
					class293.anInt2347 = (i - class293.anInt2311 - class293.anInt2283);
				}
				if (i_1_ > 105) {
					if (!Class15.aBoolean169) {
						break;
					}
					if ((client.method116(class293).anInt4284 ^ 0xffffffff) != -1
							|| class293.anInt2354 == 0) {
						if ((class293.anInt2299 ^ 0xffffffff) > -1) {
							class293.anInt2299 = 0;
						} else if (i_0_ < (class293.anInt2299 + class293.anInt2258)) {
							class293.anInt2299 = -class293.anInt2258 + i_0_;
						}
						if (class293.anInt2347 < 0) {
							class293.anInt2347 = 0;
						} else {
							if (i >= (class293.anInt2347 + class293.anInt2311)) {
								break;
							}
							class293.anInt2347 = -class293.anInt2311 + i;
						}
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception,
						("cja.F(" + i + ',' + i_0_ + ','
								+ (class293 != null ? "{...}" : "null") + ','
								+ i_1_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	public final int method14(final int i) {
		try {
			return anInt3268;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.A(" + i + ')');
		}
	}

	public static void method987(final int i) {
		do {
			try {
				aClass171_3264 = null;
				if (i >= 103) {
					break;
				}
				method986(38, -44, null, 87);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "cja.G(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	public final int method16(final byte i) {
		try {
			if (i != 82) {
				return -4;
			}
			return anInt3266;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.C(" + i + ')');
		}
	}

	@Override
	public final char method15(final int i) {
		try {
			if (i != 13313) {
				return '4';
			}
			return aChar3265;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cja.D(" + i + ')');
		}
	}
}
