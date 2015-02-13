/* aa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class aa {
	static int anInt48;
	static OutgoingOpcode aClass171_49 = new OutgoingOpcode(46, 8);
	static Class28 aClass28_50;
	static int anInt51;

	public static void method151(final boolean bool) {
		try {
			if (bool != true) {
				method151(false);
			}
			aClass28_50 = null;
			aClass171_49 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "aa.E(" + bool
					+ ')');
		}
	}

	static final byte[] method152(final int i, final String string) {
		try {
			final int i_0_ = string.length();
			final byte[] is = new byte[i_0_];
			for (int i_1_ = i; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
				final int i_2_ = string.charAt(i_1_);
				if (i_2_ > 0
						&& (i_2_ ^ 0xffffffff) > -129
						|| ((i_2_ ^ 0xffffffff) <= -161 && (i_2_ ^ 0xffffffff) >= -256)) {
					is[i_1_] = (byte) i_2_;
				} else if (i_2_ != 8364) {
					if ((i_2_ ^ 0xffffffff) != -8219) {
						if (i_2_ == 402) {
							is[i_1_] = (byte) -125;
						} else if ((i_2_ ^ 0xffffffff) == -8223) {
							is[i_1_] = (byte) -124;
						} else if (i_2_ == 8230) {
							is[i_1_] = (byte) -123;
						} else if ((i_2_ ^ 0xffffffff) != -8225) {
							if ((i_2_ ^ 0xffffffff) != -8226) {
								if (i_2_ == 710) {
									is[i_1_] = (byte) -120;
								} else if ((i_2_ ^ 0xffffffff) != -8241) {
									if ((i_2_ ^ 0xffffffff) != -353) {
										if (i_2_ != 8249) {
											if ((i_2_ ^ 0xffffffff) == -339) {
												is[i_1_] = (byte) -116;
											} else if (i_2_ == 381) {
												is[i_1_] = (byte) -114;
											} else if ((i_2_ ^ 0xffffffff) == -8217) {
												is[i_1_] = (byte) -111;
											} else if (i_2_ != 8217) {
												if ((i_2_ ^ 0xffffffff) == -8221) {
													is[i_1_] = (byte) -109;
												} else if (i_2_ == 8221) {
													is[i_1_] = (byte) -108;
												} else if ((i_2_ ^ 0xffffffff) != -8227) {
													if (i_2_ != 8211) {
														if (i_2_ != 8212) {
															if (i_2_ == 732) {
																is[i_1_] = (byte) -104;
															} else if ((i_2_ ^ 0xffffffff) == -8483) {
																is[i_1_] = (byte) -103;
															} else if (i_2_ != 353) {
																if (i_2_ == 8250) {
																	is[i_1_] = (byte) -101;
																} else if ((i_2_ ^ 0xffffffff) == -340) {
																	is[i_1_] = (byte) -100;
																} else if ((i_2_ ^ 0xffffffff) == -383) {
																	is[i_1_] = (byte) -98;
																} else if (i_2_ == 376) {
																	is[i_1_] = (byte) -97;
																} else {
																	is[i_1_] = (byte) 63;
																}
															} else {
																is[i_1_] = (byte) -102;
															}
														} else {
															is[i_1_] = (byte) -105;
														}
													} else {
														is[i_1_] = (byte) -106;
													}
												} else {
													is[i_1_] = (byte) -107;
												}
											} else {
												is[i_1_] = (byte) -110;
											}
										} else {
											is[i_1_] = (byte) -117;
										}
									} else {
										is[i_1_] = (byte) -118;
									}
								} else {
									is[i_1_] = (byte) -119;
								}
							} else {
								is[i_1_] = (byte) -121;
							}
						} else {
							is[i_1_] = (byte) -122;
						}
					} else {
						is[i_1_] = (byte) -126;
					}
				} else {
					is[i_1_] = (byte) -128;
				}
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("aa.D(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public aa() {
		/* empty */
	}
}
