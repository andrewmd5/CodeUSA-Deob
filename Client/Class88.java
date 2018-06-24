/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

final class Class88 implements Runnable {
	boolean aBoolean675;
	static String aString676;
	private Callback_Sub1 aCallback_Sub1_677;
	static Method aMethod678;
	private static String aString679;
	Class356 aClass356_680;
	private boolean aBoolean681;
	boolean aBoolean682;
	private Object anObject683;
	private Class20 aClass20_684;
	Class356 aClass356_685;
	private Thread aThread686;
	private Object anObject687;
	private static String aString688;
	private Class143 aClass143_689 = null;
	static String aString690;
	private static int anInt691;
	static String aString692;
	private Object anObject693;
	private static String aString694;
	Class356[] aClass356Array695;
	static String aString696;
	private Class143 aClass143_697;
	EventQueue anEventQueue698;
	static String aString699;
	static Method aMethod700;
	private static volatile long aLong701 = 0L;
	Class356 aClass356_702;
	/* synthetic */static Class aClass703;
	/* synthetic */static Class aClass704;
	/* synthetic */static Class aClass705;
	/* synthetic */static Class aClass706;

	final Class143 method858(final int i, final Runnable runnable,
			final int i_0_) {
		try {
			if (i_0_ != 1) {
				method874(-5);
			}
			return method877(0, -115, i, 2, runnable);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method859(final int i, final String string) {
		try {
			if (i != -14) {
				aClass20_684 = null;
			}
			return method877(0, -126, 0, 16, string);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method860(final byte i) {
		try {
			if (!aBoolean682) {
				return false;
			}
			if (!aBoolean675) {
				if (anObject693 == null) {
					return false;
				}
				return true;
			}
			if (aClass20_684 == null) {
				return false;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method861(final int i) {
		try {
			aLong701 = 5000L + Class343.method3819(-47);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method862(final int i, final Frame frame) {
		try {
			if (i != -3470) {
				aString692 = null;
			}
			return method877(0, -66, 0, 7, frame);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	@Override
	public final void run() {
		try {
			for (;;) {
				Class143 class143;
				synchronized (this) {
					for (;;) {
						if (aBoolean681) {
							return;
						}
						if (aClass143_697 != null) {
							class143 = aClass143_697;
							aClass143_697 = aClass143_697.aClass143_1167;
							if (aClass143_697 == null) {
								aClass143_689 = null;
							}
							break;
						}
						try {
							this.wait();
						} catch (final InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				try {
					final int i = class143.anInt1164;
					if ((i ^ 0xffffffff) != -2) {
						if (i == 22) {
							if ((aLong701 ^ 0xffffffffffffffffL) < (Class343
									.method3819(-47) ^ 0xffffffffffffffffL)) {
								throw new IOException();
							}
							try {
								class143.anObject1162 = Class246_Sub3_Sub2_Sub1
										.method3006(
												(String) (class143.anObject1161),
												0, class143.anInt1166)
										.method305(-2);
							} catch (final IOException_Sub1 ioexception_sub1) {
								class143.anObject1162 = ioexception_sub1
										.getMessage();
								throw ioexception_sub1;
							}
						} else if (i == 2) {
							final Thread thread = new Thread(
									(Runnable) (class143.anObject1161));
							thread.setDaemon(true);
							thread.start();
							thread.setPriority(class143.anInt1166);
							class143.anObject1162 = thread;
						} else if ((i ^ 0xffffffff) != -5) {
							if ((i ^ 0xffffffff) != -9) {
								if ((i ^ 0xffffffff) == -10) {
									final Object[] objects = ((Object[]) class143.anObject1161);
									if (aBoolean682
											&& ((Class) objects[0])
													.getClassLoader() == null) {
										throw new SecurityException();
									}
									class143.anObject1162 = (((Class) objects[0])
											.getDeclaredField((String) objects[1]));
								} else if (i == 18) {
									final Clipboard clipboard = Toolkit
											.getDefaultToolkit()
											.getSystemClipboard();
									class143.anObject1162 = clipboard
											.getContents(null);
								} else if (i != 19) {
									if (aBoolean682) {
										if (i == 3) {
											if (aLong701 > Class343
													.method3819(-47)) {
												throw new IOException();
											}
											final String string = ((String
													.valueOf(0xff & (class143.anInt1166 >> 443133112)))
													+ "."
													+ (0xff & (class143.anInt1166 >> -1933975568))
													+ "."
													+ ((class143.anInt1166 & 0xfffc) >> -963801848)
													+ "." + (0xff & class143.anInt1166));
											class143.anObject1162 = InetAddress
													.getByName(string)
													.getHostName();
										} else if ((i ^ 0xffffffff) != -22) {
											if (i != 5) {
												if ((i ^ 0xffffffff) == -7) {
													final Frame frame = (new Frame(
															"CodeUSA Full Screen"));
													class143.anObject1162 = frame;
													frame.setResizable(false);
													if (!aBoolean675) {
														Class.forName("Class68")
																.getMethod(
																		"method692",
																		(new Class[] {
																				((aClass703 != null) ? aClass703
																						: (aClass703 = (method878("java.awt.Frame")))),
																				Integer.TYPE,
																				Integer.TYPE,
																				Integer.TYPE,
																				(Integer.TYPE) }))
																.invoke(anObject693,
																		(new Object[] {
																				frame,
																				(new Integer(
																						(class143.anInt1166) >>> -367960272)),
																				(new Integer(
																						(class143.anInt1166) & 0xffff)),
																				(new Integer(
																						(class143.anInt1165) >> 753354768)),
																				(new Integer(
																						(class143.anInt1165) & 0xffff)) }));
													} else {
														aClass20_684
																.method255(
																		((class143.anInt1165) >> 178448656),
																		-2147483648,
																		((class143.anInt1166) >>> 1019450064),
																		((class143.anInt1165) & 0xffff),
																		(0xffff & (class143.anInt1166)),
																		frame);
													}
												} else if ((i ^ 0xffffffff) == -8) {
													if (!aBoolean675) {
														Class.forName("Class68")
																.getMethod(
																		"method690",
																		new Class[0])
																.invoke(anObject693,
																		new Object[0]);
													} else {
														aClass20_684
																.method253(
																		83,
																		((Frame) (class143.anObject1161)));
													}
												} else if (i == 12) {
													final Class356 class356 = (method871(
															aString694,
															((String) (class143.anObject1161)),
															anInt691,
															(byte) -121));
													class143.anObject1162 = class356;
												} else if ((i ^ 0xffffffff) != -14) {
													if ((aBoolean682)
															&& ((i ^ 0xffffffff) == -15)) {
														final int i_3_ = (class143.anInt1166);
														final int i_4_ = (class143.anInt1165);
														if (aBoolean675) {
															aCallback_Sub1_677
																	.method356(
																			1,
																			i_4_,
																			i_3_);
														} else {
															Class.forName(
																	"Class321")
																	.getDeclaredMethod(
																			"method3668",
																			(new Class[] {
																					(Integer.TYPE),
																					(Integer.TYPE) }))
																	.invoke(anObject687,
																			(new Object[] {
																					(new Integer(
																							i_3_)),
																					(new Integer(
																							i_4_)) }));
														}
													} else if ((aBoolean682)
															&& ((i ^ 0xffffffff) == -16)) {
														final boolean bool = ((class143.anInt1166) != 0);
														final Component component = ((Component) (class143.anObject1161));
														if (aBoolean675) {
															aCallback_Sub1_677
																	.method358(
																			bool,
																			component,
																			(byte) -104);
														} else {
															Class.forName(
																	"Class321")
																	.getDeclaredMethod(
																			"method3667",
																			(new Class[] {
																					((aClass704 != null) ? aClass704
																							: (aClass704 = (method878("java.awt.Component")))),
																					(Boolean.TYPE) }))
																	.invoke(anObject687,
																			(new Object[] {
																					component,
																					(new Boolean(
																							bool)) }));
														}
													} else if ((aBoolean675)
															|| i != 17) {
														if (i != 16) {
															throw new Exception(
																	"");
														}
														try {
															if (!aString699
																	.startsWith("win")) {
																throw new Exception();
															}
															final String string = ((String) (class143.anObject1161));
															if (!(string
																	.startsWith("http://"))
																	&& !(string
																			.startsWith("https://"))) {
																throw new Exception();
															}
															final String string_5_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
															for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > ((string
																	.length()) ^ 0xffffffff)); i_6_++) {
																if ((string_5_
																		.indexOf(string
																				.charAt(i_6_))) == -1) {
																	throw new Exception();
																}
															}
															Runtime.getRuntime()
																	.exec("cmd /c start \"j\" \""
																			+ string
																			+ "\"");
															class143.anObject1162 = null;
														} catch (final Exception exception) {
															class143.anObject1162 = exception;
															throw exception;
														}
													} else {
														final Object[] objects = ((Object[]) (class143.anObject1161));
														Class.forName(
																"Class321")
																.getDeclaredMethod(
																		"method3666",
																		(new Class[] {
																				((aClass704 != null) ? aClass704
																						: (aClass704 = (method878("java.awt.Component")))),
																				((aClass705 != null) ? aClass705
																						: (aClass705 = (method878("[I")))),
																				Integer.TYPE,
																				Integer.TYPE,
																				((aClass706 != null) ? aClass706
																						: (aClass706 = (method878("java.awt.Point")))) }))
																.invoke(anObject687,
																		(new Object[] {
																				((Component) objects[0]),
																				((int[]) objects[1]),
																				(new Integer(
																						class143.anInt1166)),
																				(new Integer(
																						class143.anInt1165)),
																				((Point) (objects[2])) }));
													}
												} else {
													final Class356 class356 = (method871(
															"",
															((String) (class143.anObject1161)),
															anInt691,
															(byte) -110));
													class143.anObject1162 = class356;
												}
											} else if (aBoolean675) {
												class143.anObject1162 = aClass20_684
														.method252(false);
											} else {
												class143.anObject1162 = (Class
														.forName("Class68")
														.getMethod("method693",
																new Class[0])
														.invoke(anObject693,
																new Object[0]));
											}
										} else {
											if ((aLong701 ^ 0xffffffffffffffffL) < (Class343
													.method3819(-47) ^ 0xffffffffffffffffL)) {
												throw new IOException();
											}
											class143.anObject1162 = InetAddress
													.getByName(
															(String) (class143.anObject1161))
													.getAddress();
										}
									} else {
										throw new Exception("");
									}
								} else {
									final Transferable transferable = ((Transferable) class143.anObject1161);
									final Clipboard clipboard = Toolkit
											.getDefaultToolkit()
											.getSystemClipboard();
									clipboard.setContents(transferable, null);
								}
							} else {
								final Object[] objects = ((Object[]) class143.anObject1161);
								if (aBoolean682
										&& (((Class) objects[0])
												.getClassLoader() == null)) {
									throw new SecurityException();
								}
								class143.anObject1162 = (((Class) objects[0])
										.getDeclaredMethod((String) objects[1],
												(Class[]) objects[2]));
							}
						} else {
							if (aLong701 > Class343.method3819(-47)) {
								throw new IOException();
							}
							class143.anObject1162 = new DataInputStream(
									((URL) (class143.anObject1161))
											.openStream());
						}
					} else {
						if ((aLong701 ^ 0xffffffffffffffffL) < (Class343
								.method3819(-47) ^ 0xffffffffffffffffL)) {
							throw new IOException();
						}
						class143.anObject1162 = new Socket(
								(InetAddress
										.getByName((String) (class143.anObject1161))),
								class143.anInt1166);
					}
					class143.anInt1163 = 1;
				} catch (final ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (final Throwable throwable) {
					class143.anInt1163 = 2;
				}
				synchronized (class143) {
					class143.notify();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method863(final String string, final boolean bool,
			final int i, final boolean bool_7_) {
		try {
			if (bool != false) {
				aCallback_Sub1_677 = null;
			}
			return method877(0, -93, i, bool_7_ ? 22 : 1, string);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method864(final int i) {
		try {
			if (i < 36) {
				method861(-64);
			}
			return method877(0, -114, 0, 5, null);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final Class356 method865(final int i, final String string) {
		try {
			if (i > -64) {
				return null;
			}
			return method871(aString694, string, anInt691, (byte) -106);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method866(final int i, final URL url) {
		try {
			if (i >= -96) {
				method875(null, false, -55);
			}
			return method877(0, -102, 0, 4, url);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Object method867(final boolean bool) {
		try {
			if (bool != false) {
				aString688 = null;
			}
			return anObject683;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method868(final int i, final int i_8_) {
		try {
			if (i_8_ < 91) {
				aBoolean682 = true;
			}
			return method877(0, -77, i, 3, null);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method869(final int i, final int i_9_, final int i_10_,
			final int i_11_, final int i_12_) {
		try {
			if (i != -21605) {
				return null;
			}
			return method877((i_9_ << 1082083888) - -i_11_, i + 21511, i_12_
					+ (i_10_ << 2029886704), 6, null);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method870(final String string, final Class var_class,
			final int i, final Class[] var_classes) {
		try {
			if (i != 0) {
				method876(null, false, null);
			}
			return method877(0, -66, 0, 8, new Object[] { var_class, string,
					var_classes });
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private static final Class356 method871(final String string,
			final String string_13_, final int i, final byte i_14_) {
		try {
			String string_15_;
			if (i != 33) {
				if (i != 34) {
					string_15_ = ("codeusa_" + string + "_preferences"
							+ string_13_ + ".dat");
				} else {
					string_15_ = ("codeusa_" + string + "_preferences"
							+ string_13_ + "_wip.dat");
				}
			} else {
				string_15_ = ("codeusa_" + string + "_preferences" + string_13_ + "_rc.dat");
			}
			final String[] strings = { "c:/rscache/", "/rscache/", aString679,
					"c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
			for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > (strings.length ^ 0xffffffff); i_17_++) {
				final String string_18_ = strings[i_17_];
				if (string_18_.length() <= 0 || new File(string_18_).exists()) {
					try {
						final Class356 class356 = new Class356(new File(
								string_18_, string_15_), "rw", 10000L);
						return class356;
					} catch (final Exception exception) {
						/* empty */
					}
				}
			}
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method872(final int[] is, final Point point, final int i,
			final byte i_19_, final int i_20_, final Component component) {
		try {
			if (i_19_ < 56) {
				method861(16);
			}
			return method877(i, -101, i_20_, 17, new Object[] { component, is,
					point });
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method873(final String string, final Class var_class,
			final int i) {
		try {
			if (i != -27303) {
				return null;
			}
			return method877(0, -72, 0, 9, new Object[] { var_class, string });
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method874(final int i) {
		try {
			synchronized (this) {
				aBoolean681 = true;
				notifyAll();
			}
			try {
				aThread686.join();
			} catch (final InterruptedException interruptedexception) {
				/* empty */
			}
			if (aClass356_702 != null) {
				try {
					aClass356_702.method3880(true);
				} catch (final IOException ioexception) {
					/* empty */
				}
			}
			if (i >= 54) {
				if (aClass356_680 != null) {
					try {
						aClass356_680.method3880(true);
					} catch (final IOException ioexception) {
						/* empty */
					}
				}
				if (aClass356Array695 != null) {
					for (int i_21_ = 0; ((i_21_ ^ 0xffffffff) > (aClass356Array695.length ^ 0xffffffff)); i_21_++) {
						if (aClass356Array695[i_21_] != null) {
							try {
								aClass356Array695[i_21_].method3880(true);
							} catch (final IOException ioexception) {
								/* empty */
							}
						}
					}
				}
				if (aClass356_685 != null) {
					try {
						aClass356_685.method3880(true);
					} catch (final IOException ioexception) {
						/* empty */
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class143 method875(final String string, final boolean bool,
			final int i) {
		try {
			if (i != 21516) {
				return null;
			}
			if (!bool) {
				return method877(0, i + -21585, 0, 13, string);
			}
			return method877(0, -119, 0, 12, string);
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method876(final byte[] is, final boolean bool, final File file) {
		try {
			try {
				final FileOutputStream fileoutputstream = new FileOutputStream(
						file);
				fileoutputstream.write(is, 0, is.length);
				fileoutputstream.close();
				if (bool != true) {
					return false;
				}
				return true;
			} catch (final IOException ioexception) {
				throw new RuntimeException();
			}
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final Class143 method877(final int i, final int i_22_,
			final int i_23_, final int i_24_, final Object object) {
		try {
			if (i_22_ > -61) {
				aThread686 = null;
			}
			final Class143 class143 = new Class143();
			class143.anObject1161 = object;
			class143.anInt1164 = i_24_;
			class143.anInt1166 = i_23_;
			class143.anInt1165 = i;
			synchronized (this) {
				if (aClass143_689 != null) {
					aClass143_689.aClass143_1167 = class143;
					aClass143_689 = class143;
				} else {
					aClass143_689 = aClass143_697 = class143;
				}
				notify();
			}
			return class143;
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class88(final int i, final String string, final int i_25_,
			final boolean bool) throws Exception {
		aClass356_680 = null;
		aClass356_685 = null;
		aBoolean681 = false;
		aClass143_697 = null;
		aBoolean682 = false;
		aBoolean675 = false;
		aClass356_702 = null;
		try {
			aString692 = "1.1";
			aString694 = string;
			aBoolean682 = bool;
			aString696 = "Unknown";
			anInt691 = i;
			try {
				aString696 = System.getProperty("java.vendor");
				aString692 = System.getProperty("java.version");
			} catch (final Exception exception) {
				/* empty */
			}
			if ((aString696.toLowerCase().indexOf("microsoft") ^ 0xffffffff) != 0) {
				aBoolean675 = true;
			}
			try {
				aString688 = System.getProperty("os.name");
			} catch (final Exception exception) {
				aString688 = "Unknown";
			}
			aString699 = aString688.toLowerCase();
			try {
				aString690 = System.getProperty("os.arch").toLowerCase();
			} catch (final Exception exception) {
				aString690 = "";
			}
			try {
				aString676 = System.getProperty("os.version").toLowerCase();
			} catch (final Exception exception) {
				aString676 = "";
			}
			try {
				aString679 = System.getProperty("user.home");
				if (aString679 != null) {
					aString679 += "/";
				}
			} catch (final Exception exception) {
				/* empty */
			}
			if (aString679 == null) {
				aString679 = "~/";
			}
			try {
				anEventQueue698 = Toolkit.getDefaultToolkit()
						.getSystemEventQueue();
			} catch (final Throwable throwable) {
				/* empty */
			}
			if (!aBoolean675) {
				try {
					aMethod700 = (Class.forName("java.awt.Component")
							.getDeclaredMethod("setFocusTraversalKeysEnabled",
									new Class[] { Boolean.TYPE }));
				} catch (final Exception exception) {
					/* empty */
				}
				try {
					aMethod678 = (Class.forName("java.awt.Container")
							.getDeclaredMethod("setFocusCycleRoot",
									new Class[] { Boolean.TYPE }));
				} catch (final Exception exception) {
					/* empty */
				}
			}
			Class316.method3650(false, anInt691, aString694);
			if (aBoolean682) {
				aClass356_685 = new Class356(Class316.method3648(anInt691, 0,
						"random.dat", null), "rw", 25L);
				aClass356_702 = new Class356(Class316.method3649(
						"main_file_cache.dat2", 13), "rw", 524288000L);
				aClass356_680 = (new Class356(Class316.method3649(
						"main_file_cache.idx255", 61), "rw", 1048576L));
				aClass356Array695 = new Class356[i_25_];
				for (int i_26_ = 0; (i_25_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff); i_26_++) {
					aClass356Array695[i_26_] = new Class356(
							(Class316.method3649("main_file_cache.idx" + i_26_,
									-128)), "rw", 1048576L);
				}
				if (aBoolean675) {
					try {
						anObject683 = Class.forName("Class158").newInstance();
					} catch (final Throwable throwable) {
						/* empty */
					}
				}
				try {
					if (!aBoolean675) {
						anObject693 = Class.forName("Class68").newInstance();
					} else {
						aClass20_684 = new Class20();
					}
				} catch (final Throwable throwable) {
					/* empty */
				}
				try {
					if (!aBoolean675) {
						anObject687 = Class.forName("Class321").newInstance();
					} else {
						aCallback_Sub1_677 = new Callback_Sub1();
					}
				} catch (final Throwable throwable) {
					/* empty */
				}
			}
			if (aBoolean682 && !aBoolean675) {
				ThreadGroup threadgroup = Thread.currentThread()
						.getThreadGroup();
				for (ThreadGroup threadgroup_27_ = threadgroup.getParent(); threadgroup_27_ != null; threadgroup_27_ = threadgroup
						.getParent()) {
					threadgroup = threadgroup_27_;
				}
				final Thread[] threads = new Thread[1000];
				threadgroup.enumerate(threads);
				for (int i_28_ = 0; threads.length > i_28_; i_28_++) {
					if (threads[i_28_] != null
							&& threads[i_28_].getName().startsWith("AWT")) {
						threads[i_28_].setPriority(1);
					}
				}
			}
			aBoolean681 = false;
			aThread686 = new Thread(this);
			aThread686.setPriority(10);
			aThread686.setDaemon(true);
			aThread686.start();
		} catch (final RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	/* synthetic */static Class method878(final String string) {
		try {
			return Class.forName(string);
		} catch (final ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
