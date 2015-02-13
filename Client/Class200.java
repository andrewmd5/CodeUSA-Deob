/* Class200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class200 {
	static Class111 aClass111_1543;

	static final int method2692(final int i) {
		int i_0_ = -1;
		for (int i_1_ = 0; i_1_ < Class18.anInt212 - 1; i_1_++) {
			if (i < s.anIntArray2205[i_1_] + Class15.anIntArray182[i_1_]) {
				i_0_ = i_1_;
				break;
			}
		}
		if (i_0_ == -1) {
			i_0_ = Class18.anInt212 - 1;
		}
		return i_0_;
	}

	@Override
	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					"nd.toString(" + ')');
		}
	}

	static final Class332 method2693(final int i, final byte i_2_,
			final ha var_ha) {
		try {
			if (i_2_ > -104) {
				return null;
			}
			final Class98_Sub36 class98_sub36 = ((Class98_Sub36) Class156_Sub1.aClass377_3277
					.method3990(i, -1));
			if (class98_sub36 != null) {
				final Class98_Sub43_Sub3 class98_sub43_sub3 = class98_sub36.aClass237_Sub1_4157
						.method2908(-32675);
				class98_sub36.aBoolean4158 = true;
				if (class98_sub43_sub3 != null) {
					return class98_sub43_sub3.method1501(var_ha, 11242);
				}
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nd.A(" + i + ','
					+ i_2_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method2694(final String string, final int i,
			final int i_3_, final int i_4_, final byte[] is, final int i_5_) {
		try {
			final int i_6_ = -i + i_3_;
			for (int i_7_ = 0; (i_6_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
				final int i_8_ = string.charAt(i + i_7_);
				if (i_8_ > 0 && i_8_ < 128 || i_8_ >= 160
						&& (i_8_ ^ 0xffffffff) >= -256) {
					is[i_4_ + i_7_] = (byte) i_8_;
				} else if ((i_8_ ^ 0xffffffff) == -8365) {
					is[i_7_ + i_4_] = (byte) -128;
				} else if ((i_8_ ^ 0xffffffff) == -8219) {
					is[i_7_ + i_4_] = (byte) -126;
				} else if (i_8_ == 402) {
					is[i_4_ + i_7_] = (byte) -125;
				} else if ((i_8_ ^ 0xffffffff) != -8223) {
					if ((i_8_ ^ 0xffffffff) == -8231) {
						is[i_7_ + i_4_] = (byte) -123;
					} else if ((i_8_ ^ 0xffffffff) == -8225) {
						is[i_4_ - -i_7_] = (byte) -122;
					} else if (i_8_ == 8225) {
						is[i_7_ + i_4_] = (byte) -121;
					} else if (i_8_ != 710) {
						if (i_8_ == 8240) {
							is[i_7_ + i_4_] = (byte) -119;
						} else if (i_8_ == 352) {
							is[i_4_ + i_7_] = (byte) -118;
						} else if ((i_8_ ^ 0xffffffff) != -8250) {
							if ((i_8_ ^ 0xffffffff) != -339) {
								if ((i_8_ ^ 0xffffffff) == -382) {
									is[i_7_ + i_4_] = (byte) -114;
								} else if ((i_8_ ^ 0xffffffff) != -8217) {
									if (i_8_ != 8217) {
										if (i_8_ != 8220) {
											if (i_8_ == 8221) {
												is[i_4_ + i_7_] = (byte) -108;
											} else if (i_8_ == 8226) {
												is[i_4_ - -i_7_] = (byte) -107;
											} else if ((i_8_ ^ 0xffffffff) == -8212) {
												is[i_7_ + i_4_] = (byte) -106;
											} else if ((i_8_ ^ 0xffffffff) != -8213) {
												if (i_8_ == 732) {
													is[i_4_ - -i_7_] = (byte) -104;
												} else if ((i_8_ ^ 0xffffffff) != -8483) {
													if (i_8_ != 353) {
														if (i_8_ == 8250) {
															is[i_7_ + i_4_] = (byte) -101;
														} else if ((i_8_ ^ 0xffffffff) == -340) {
															is[i_7_ + i_4_] = (byte) -100;
														} else if (i_8_ != 382) {
															if (i_8_ == 376) {
																is[i_7_ + i_4_] = (byte) -97;
															} else {
																is[(i_4_ - -i_7_)] = (byte) 63;
															}
														} else {
															is[i_7_ + i_4_] = (byte) -98;
														}
													} else {
														is[i_7_ + i_4_] = (byte) -102;
													}
												} else {
													is[i_7_ + i_4_] = (byte) -103;
												}
											} else {
												is[i_7_ + i_4_] = (byte) -105;
											}
										} else {
											is[i_4_ + i_7_] = (byte) -109;
										}
									} else {
										is[i_7_ + i_4_] = (byte) -110;
									}
								} else {
									is[i_4_ - -i_7_] = (byte) -111;
								}
							} else {
								is[i_7_ + i_4_] = (byte) -116;
							}
						} else {
							is[i_7_ + i_4_] = (byte) -117;
						}
					} else {
						is[i_4_ + i_7_] = (byte) -120;
					}
				} else {
					is[i_4_ - -i_7_] = (byte) -124;
				}
			}
			if (i_5_ != -28439) {
				aClass111_1543 = null;
			}
			return i_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("nd.C("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ i_3_ + ',' + i_4_ + ',' + (is != null ? "{...}" : "null")
					+ ',' + i_5_ + ')'));
		}
	}

	public Class200() {
		/* empty */
	}

	public static void method2695(final int i) {
		do {
			try {
				aClass111_1543 = null;
				if (i == -382) {
					break;
				}
				aClass111_1543 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "nd.B(" + i
						+ ')');
			}
			break;
		} while (false);
	}
}
