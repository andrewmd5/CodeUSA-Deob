/* Class98_Sub10_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

final class Class98_Sub10_Sub7 extends Class98_Sub10 {
	static OutgoingOpcode aClass171_5571 = new OutgoingOpcode(24, -1);
	static int anInt5572;
	static String aString5573 = null;
	private int anInt5574 = 6;
	static Class324[] aClass324Array5575;
	static Font aFont5576;
	static int anInt5577;

	final int[][] method997(int i, int i_0_) {
		try {
			if (i > -76)
				method1023(-24, -20);
			int[][] is = ((Class98_Sub10) this).aClass223_3859.method2828(i_0_,
					0);
			while_66_: do {
				if (((Class223) ((Class98_Sub10) this).aClass223_3859).aBoolean1683) {
					int[][] is_1_ = this.method994(i_0_, 24431, 0);
					int[][] is_2_ = this.method994(i_0_, 24431, 1);
					int[] is_3_ = is[0];
					int[] is_4_ = is[1];
					int[] is_5_ = is[2];
					int[] is_6_ = is_1_[0];
					int[] is_7_ = is_1_[1];
					int[] is_8_ = is_1_[2];
					int[] is_9_ = is_2_[0];
					int[] is_10_ = is_2_[1];
					int[] is_11_ = is_2_[2];
					int i_12_ = anInt5574;
					while_65_: do {
						while_64_: do {
							while_63_: do {
								while_62_: do {
									while_61_: do {
										while_60_: do {
											while_59_: do {
												while_58_: do {
													while_57_: do {
														do {
															if (i_12_ != 1) {
																if (i_12_ != 2) {
																	if (i_12_ != 3) {
																		if (i_12_ != 4) {
																			if (i_12_ != 5) {
																				if ((i_12_ ^ 0xffffffff) != -7) {
																					if (i_12_ != 7) {
																						if (i_12_ != 8) {
																							if (i_12_ != 9) {
																								if ((i_12_ ^ 0xffffffff) != -11) {
																									if (i_12_ != 11) {
																										if (i_12_ != 12)
																											break while_66_;
																									} else
																										break while_64_;
																									break while_65_;
																								}
																							} else
																								break while_62_;
																							break while_63_;
																						}
																					} else
																						break while_60_;
																					break while_61_;
																				}
																			} else
																				break while_58_;
																			break while_59_;
																		}
																	} else
																		break;
																	break while_57_;
																}
															} else {
																for (i_12_ = 0; (((Class25.anInt268) ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
																	is_3_[i_12_] = ((is_6_[i_12_]) - -is_9_[i_12_]);
																	is_4_[i_12_] = ((is_7_[i_12_]) + is_10_[i_12_]);
																	is_5_[i_12_] = ((is_11_[i_12_]) + is_8_[i_12_]);
																}
																break while_66_;
															}
															for (i_12_ = 0; ((i_12_ ^ 0xffffffff) > ((Class25.anInt268) ^ 0xffffffff)); i_12_++) {
																is_3_[i_12_] = (-(is_9_[i_12_]) + (is_6_[i_12_]));
																is_4_[i_12_] = ((is_7_[i_12_]) - (is_10_[i_12_]));
																is_5_[i_12_] = (-(is_11_[i_12_]) + (is_8_[i_12_]));
															}
															break while_66_;
														} while (false);
														for (i_12_ = 0; ((i_12_ ^ 0xffffffff) > ((Class25.anInt268) ^ 0xffffffff)); i_12_++) {
															is_3_[i_12_] = (((is_6_[i_12_]) * (is_9_[i_12_])) >> 1762674444);
															is_4_[i_12_] = (((is_7_[i_12_]) * (is_10_[i_12_])) >> -166611188);
															is_5_[i_12_] = (((is_11_[i_12_]) * (is_8_[i_12_])) >> 136240748);
														}
														break while_66_;
													} while (false);
													for (i_12_ = 0; ((Class25.anInt268 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
														int i_13_ = is_9_[i_12_];
														int i_14_ = is_10_[i_12_];
														int i_15_ = is_11_[i_12_];
														is_3_[i_12_] = (((i_13_ ^ 0xffffffff) != -1) ? ((is_6_[i_12_] << 1548161740) / i_13_)
																: 4096);
														is_4_[i_12_] = (i_14_ != 0 ? ((is_7_[i_12_] << -1588247860) / i_14_)
																: 4096);
														is_5_[i_12_] = (i_15_ == 0 ? 4096
																: ((is_8_[i_12_] << -2111435412) / i_15_));
													}
													break while_66_;
												} while (false);
												for (i_12_ = 0; i_12_ < Class25.anInt268; i_12_++) {
													is_3_[i_12_] = (-(((4096 - is_9_[i_12_]) * (-is_6_[i_12_] + 4096)) >> -2069537524) + 4096);
													is_4_[i_12_] = (4096 - (((-is_10_[i_12_] + 4096) * (4096 + -(is_7_[i_12_]))) >> 1639164044));
													is_5_[i_12_] = (4096 + -(((-is_11_[i_12_] + 4096) * (4096 - (is_8_[i_12_]))) >> -43965556));
												}
												break while_66_;
											} while (false);
											for (i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff)); i_12_++) {
												int i_16_ = is_11_[i_12_];
												int i_17_ = is_10_[i_12_];
												int i_18_ = is_9_[i_12_];
												is_3_[i_12_] = (i_18_ >= 2048 ? (4096 + -(((-is_6_[i_12_] + 4096) * (-i_18_ + 4096)) >> -122785909))
														: (is_6_[i_12_] * i_18_ >> 702271179));
												is_4_[i_12_] = (((i_17_ ^ 0xffffffff) > -2049) ? (is_7_[i_12_]
														* i_17_ >> 1967190795)
														: (4096 - (((-i_17_ + 4096) * (4096 + -(is_7_[i_12_]))) >> -827610229)));
												is_5_[i_12_] = (i_16_ < 2048 ? (is_8_[i_12_]
														* i_16_ >> 908096939)
														: (-(((4096 - is_8_[i_12_]) * (-i_16_ + 4096)) >> 1201238987) + 4096));
											}
											break while_66_;
										} while (false);
										for (i_12_ = 0; i_12_ < Class25.anInt268; i_12_++) {
											int i_19_ = is_6_[i_12_];
											int i_20_ = is_7_[i_12_];
											int i_21_ = is_8_[i_12_];
											is_3_[i_12_] = (i_19_ != 4096 ? ((is_9_[i_12_] << 2057167660) / (-i_19_ + 4096))
													: 4096);
											is_4_[i_12_] = (((i_20_ ^ 0xffffffff) == -4097) ? 4096
													: ((is_10_[i_12_] << 1907195788) / (4096 + -i_20_)));
											is_5_[i_12_] = (i_21_ != 4096 ? ((is_11_[i_12_] << 1788586060) / (-i_21_ + 4096))
													: 4096);
										}
										break while_66_;
									} while (false);
									for (i_12_ = 0; ((Class25.anInt268 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
										int i_22_ = is_6_[i_12_];
										int i_23_ = is_7_[i_12_];
										int i_24_ = is_8_[i_12_];
										is_3_[i_12_] = (i_22_ != 0 ? 4096 + -((4096 + -is_9_[i_12_] << -1639495252) / i_22_)
												: 0);
										is_4_[i_12_] = (i_23_ == 0 ? 0
												: 4096 + -((4096 - is_10_[i_12_] << -1366428756) / i_23_));
										is_5_[i_12_] = ((i_24_ ^ 0xffffffff) == -1 ? 0
												: 4096 - ((4096 + -is_11_[i_12_] << 798210924) / i_24_));
									}
									break while_66_;
								} while (false);
								for (i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff)); i_12_++) {
									int i_25_ = is_7_[i_12_];
									int i_26_ = is_10_[i_12_];
									int i_27_ = is_6_[i_12_];
									int i_28_ = is_8_[i_12_];
									int i_29_ = is_11_[i_12_];
									int i_30_ = is_9_[i_12_];
									is_3_[i_12_] = i_30_ > i_27_ ? i_27_
											: i_30_;
									is_4_[i_12_] = i_26_ <= i_25_ ? i_26_
											: i_25_;
									is_5_[i_12_] = i_28_ < i_29_ ? i_28_
											: i_29_;
								}
								break while_66_;
							} while (false);
							for (i_12_ = 0; Class25.anInt268 > i_12_; i_12_++) {
								int i_31_ = is_8_[i_12_];
								int i_32_ = is_6_[i_12_];
								int i_33_ = is_9_[i_12_];
								int i_34_ = is_10_[i_12_];
								int i_35_ = is_11_[i_12_];
								int i_36_ = is_7_[i_12_];
								is_3_[i_12_] = i_32_ > i_33_ ? i_32_ : i_33_;
								is_4_[i_12_] = i_34_ >= i_36_ ? i_34_ : i_36_;
								is_5_[i_12_] = i_35_ >= i_31_ ? i_35_ : i_31_;
							}
							break while_66_;
						} while (false);
						for (i_12_ = 0; Class25.anInt268 > i_12_; i_12_++) {
							int i_37_ = is_8_[i_12_];
							int i_38_ = is_10_[i_12_];
							int i_39_ = is_7_[i_12_];
							int i_40_ = is_11_[i_12_];
							int i_41_ = is_6_[i_12_];
							int i_42_ = is_9_[i_12_];
							is_3_[i_12_] = ((i_42_ ^ 0xffffffff) > (i_41_ ^ 0xffffffff) ? i_41_
									- i_42_
									: -i_41_ + i_42_);
							is_4_[i_12_] = ((i_38_ ^ 0xffffffff) <= (i_39_ ^ 0xffffffff) ? -i_39_
									+ i_38_
									: -i_38_ + i_39_);
							is_5_[i_12_] = ((i_37_ ^ 0xffffffff) < (i_40_ ^ 0xffffffff) ? i_37_
									+ -i_40_
									: i_40_ - i_37_);
						}
						break while_66_;
					} while (false);
					for (i_12_ = 0; Class25.anInt268 > i_12_; i_12_++) {
						int i_43_ = is_7_[i_12_];
						int i_44_ = is_9_[i_12_];
						int i_45_ = is_10_[i_12_];
						int i_46_ = is_8_[i_12_];
						int i_47_ = is_11_[i_12_];
						int i_48_ = is_6_[i_12_];
						is_3_[i_12_] = i_44_ + i_48_
								+ -(i_48_ * i_44_ >> 1539396619);
						is_4_[i_12_] = i_43_ - -i_45_
								+ -(i_45_ * i_43_ >> -1763503637);
						is_5_[i_12_] = i_47_ + i_46_
								+ -(i_46_ * i_47_ >> 398684619);
					}
				}
			} while (false);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dp.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	final int[] method990(int i, int i_49_) {
		try {
			int[] is = ((Class98_Sub10) this).aClass16_3863.method237(
					(byte) 98, i_49_);
			if (i != 255)
				anInt5572 = 39;
			while_76_: do {
				if (((Class16) ((Class98_Sub10) this).aClass16_3863).aBoolean198) {
					int[] is_50_ = this.method1000(i_49_, 0, i ^ 0xff);
					int[] is_51_ = this.method1000(i_49_, 1, 0);
					int i_52_ = anInt5574;
					while_75_: do {
						while_74_: do {
							while_73_: do {
								while_72_: do {
									while_71_: do {
										while_70_: do {
											while_69_: do {
												while_68_: do {
													while_67_: do {
														do {
															if (i_52_ != 1) {
																if (i_52_ != 2) {
																	if (i_52_ != 3) {
																		if ((i_52_ ^ 0xffffffff) != -5) {
																			if (i_52_ != 5) {
																				if (i_52_ != 6) {
																					if ((i_52_ ^ 0xffffffff) != -8) {
																						if ((i_52_ ^ 0xffffffff) != -9) {
																							if ((i_52_ ^ 0xffffffff) != -10) {
																								if (i_52_ != 10) {
																									if (i_52_ != 11) {
																										if (i_52_ != 12)
																											break while_76_;
																									} else
																										break while_74_;
																									break while_75_;
																								}
																							} else
																								break while_72_;
																							break while_73_;
																						}
																					} else
																						break while_70_;
																					break while_71_;
																				}
																			} else
																				break while_68_;
																			break while_69_;
																		}
																	} else
																		break;
																	break while_67_;
																}
															} else {
																for (i_52_ = 0; ((Class25.anInt268) > i_52_); i_52_++)
																	is[i_52_] = ((is_50_[i_52_]) + is_51_[i_52_]);
																break while_76_;
															}
															for (i_52_ = 0; (i_52_ < (Class25.anInt268)); i_52_++)
																is[i_52_] = ((is_50_[i_52_]) - (is_51_[i_52_]));
															break while_76_;
														} while (false);
														for (i_52_ = 0; (i_52_ < (Class25.anInt268)); i_52_++)
															is[i_52_] = (((is_51_[i_52_]) * (is_50_[i_52_])) >> 159781452);
														break while_76_;
													} while (false);
													for (i_52_ = 0; (Class25.anInt268 > i_52_); i_52_++) {
														int i_53_ = is_51_[i_52_];
														is[i_52_] = (i_53_ != 0 ? (((is_50_[i_52_]) << -1552573364) / i_53_)
																: 4096);
													}
													break while_76_;
												} while (false);
												for (i_52_ = 0; ((Class25.anInt268 ^ 0xffffffff) < (i_52_ ^ 0xffffffff)); i_52_++)
													is[i_52_] = (4096 + -(((-is_50_[i_52_] + 4096) * (4096 + -(is_51_[i_52_]))) >> 1203892940));
												break while_76_;
											} while (false);
											for (i_52_ = 0; ((Class25.anInt268 ^ 0xffffffff) < (i_52_ ^ 0xffffffff)); i_52_++) {
												int i_54_ = is_51_[i_52_];
												is[i_52_] = (((i_54_ ^ 0xffffffff) <= -2049) ? (-(((4096 - is_50_[i_52_]) * (4096 + -i_54_)) >> -328797877) + 4096)
														: (i_54_
																* is_50_[i_52_] >> 1396388075));
											}
											break while_76_;
										} while (false);
										for (i_52_ = 0; ((i_52_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff)); i_52_++) {
											int i_55_ = is_50_[i_52_];
											is[i_52_] = (((i_55_ ^ 0xffffffff) == -4097) ? 4096
													: ((is_51_[i_52_] << 1138900140) / (4096 - i_55_)));
										}
										break while_76_;
									} while (false);
									for (i_52_ = 0; ((Class25.anInt268 ^ 0xffffffff) < (i_52_ ^ 0xffffffff)); i_52_++) {
										int i_56_ = is_50_[i_52_];
										is[i_52_] = ((i_56_ ^ 0xffffffff) == -1 ? 0
												: -((4096 - is_51_[i_52_] << -250440436) / i_56_) + 4096);
									}
									break while_76_;
								} while (false);
								for (i_52_ = 0; i_52_ < Class25.anInt268; i_52_++) {
									int i_57_ = is_50_[i_52_];
									int i_58_ = is_51_[i_52_];
									is[i_52_] = i_57_ >= i_58_ ? i_58_ : i_57_;
								}
								break while_76_;
							} while (false);
							for (i_52_ = 0; ((i_52_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff)); i_52_++) {
								int i_59_ = is_50_[i_52_];
								int i_60_ = is_51_[i_52_];
								is[i_52_] = i_59_ <= i_60_ ? i_60_ : i_59_;
							}
							break while_76_;
						} while (false);
						for (i_52_ = 0; ((i_52_ ^ 0xffffffff) > (Class25.anInt268 ^ 0xffffffff)); i_52_++) {
							int i_61_ = is_51_[i_52_];
							int i_62_ = is_50_[i_52_];
							is[i_52_] = (i_61_ < i_62_ ? i_62_ + -i_61_
									: -i_62_ + i_61_);
						}
						break while_76_;
					} while (false);
					for (i_52_ = 0; i_52_ < Class25.anInt268; i_52_++) {
						int i_63_ = is_51_[i_52_];
						int i_64_ = is_50_[i_52_];
						is[i_52_] = -(i_64_ * i_63_ >> 1977265323)
								+ (i_64_ + i_63_);
					}
				}
			} while (false);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dp.G(" + i + ','
					+ i_49_ + ')');
		}
	}

	static final boolean method1023(int i, int i_65_) {
		try {
			if (i != 1)
				aString5573 = null;
			if (i_65_ == 1 || i_65_ == 7)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dp.E(" + i + ','
					+ i_65_ + ')');
		}
	}

	public Class98_Sub10_Sub7() {
		super(2, false);
	}

	public static void method1024(byte i) {
		do {
			try {
				aClass171_5571 = null;
				aClass324Array5575 = null;
				aFont5576 = null;
				aString5573 = null;
				if (i >= 106)
					break;
				method1024((byte) 69);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "dp.D(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final Class348 method1025(int i, byte i_66_) {
		try {
			Class348[] class348s = Class93_Sub1.method906((byte) 15);
			for (int i_67_ = 0; (i_67_ ^ 0xffffffff) > (class348s.length ^ 0xffffffff); i_67_++) {
				if (i == ((Class348) class348s[i_67_]).anInt2909)
					return class348s[i_67_];
			}
			int i_68_ = -92 % ((i_66_ - 18) / 41);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "dp.B(" + i + ','
					+ i_66_ + ')');
		}
	}

	final void method991(int i, ByteBuffer class98_sub22, byte i_69_) {
		do {
			try {
				int i_70_ = i;
				do {
					if (i_70_ != 0) {
						if (i_70_ != 1)
							break;
					} else {
						anInt5574 = class98_sub22.readUnsignedByte((byte) 99);
						break;
					}
					((Class98_Sub10) this).aBoolean3861 = class98_sub22
							.readUnsignedByte((byte) -113) == 1;
				} while (false);
				if (i_69_ < -92)
					break;
				aClass171_5571 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("dp.A(" + i
						+ ',' + (class98_sub22 != null ? "{...}" : "null")
						+ ',' + i_69_ + ')'));
			}
			break;
		} while (false);
	}

	static {
		anInt5572 = 104;
		anInt5577 = 0;
	}
}
