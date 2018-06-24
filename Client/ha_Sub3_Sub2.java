/* ha_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;

import java.awt.Canvas;
import java.awt.Rectangle;

final class ha_Sub3_Sub2 extends ha_Sub3 {
	private OpenGL anOpenGL6111;
	private Class148 aClass148_6112 = new Class148();
	private final Class148 aClass148_6113 = new Class148();
	private final Class148 aClass148_6114 = new Class148();
	private Class148 aClass148_6115 = new Class148();
	private final Class148 aClass148_6116 = new Class148();
	private Class148 aClass148_6117 = new Class148();
	private final Class148 aClass148_6118 = new Class148();
	private boolean aBoolean6119;
	private boolean aBoolean6120;
	private boolean aBoolean6121;
	private boolean aBoolean6122;
	private boolean aBoolean6123;
	private Class69_Sub2[] aClass69_Sub2Array6124 = new Class69_Sub2[16];
	MapBuffer aMapBuffer6125 = new MapBuffer();
	private int anInt6126;
	private long aLong6127;
	MapBuffer aMapBuffer6128 = new MapBuffer();
	private int anInt6129;
	private boolean aBoolean6130;
	private String aString6131;
	private int anInt6132 = 0;
	boolean aBoolean6133;
	boolean aBoolean6134;
	int anInt6135;
	boolean aBoolean6136;
	boolean aBoolean6137;
	private boolean aBoolean6138;
	int[] anIntArray6139;
	private String aString6140;

	@Override
	final void method1994(final byte i, final int i_0_) {
		do {
			try {
				if (i >= 0) {
					break;
				}
				aBoolean6133 = true;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hl.BA(" + i
						+ ',' + i_0_ + ')');
			}
			break;
		} while (false);
	}

	@Override
	final void GA(final int i) {
		try {
			OpenGL.glClearColor((i & 0xff0000) / 1.671168E7F,
					(i & 0xff00) / 65280.0F, (0xff & i) / 255.0F,
					(i >>> -58636872) / 255.0F);
			OpenGL.glClear(16384);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.GA(" + i + ')');
		}
	}

	@Override
	final void method2026(final int i, final boolean bool, final byte i_1_,
			final Class65 class65, final boolean bool_2_) {
		try {
			if (i_1_ != 27) {
				aString6140 = null;
			}
			OpenGL.glTexEnvi(8960, 34176 + i,
					Class98_Sub12.method1128(class65, 36));
			if (bool) {
				OpenGL.glTexEnvi(8960, i + 34192, !bool_2_ ? 770 : 771);
			} else {
				OpenGL.glTexEnvi(8960, i + 34192, !bool_2_ ? 768 : 769);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("hl.KB(" + i + ',' + bool + ',' + i_1_ + ','
							+ (class65 != null ? "{...}" : "null") + ','
							+ bool_2_ + ')'));
		}
	}

	@Override
	final void method2037(final Class232 class232, final int i,
			final byte i_3_, final int i_4_) {
		try {
			if (i_3_ > 8) {
				int i_5_;
				int i_6_;
				if (Class334.aClass232_3468 != class232) {
					if (class232 == Class287_Sub1.aClass232_3420) {
						i_5_ = 1 + i_4_;
						i_6_ = 3;
					} else if (class232 == Class336.aClass232_2822) {
						i_6_ = 4;
						i_5_ = i_4_ * 3;
					} else if (class232 == Class98_Sub46_Sub15.aClass232_6043) {
						i_5_ = i_4_ - -2;
						i_6_ = 6;
					} else if (AnimationDefinition.aClass232_806 == class232) {
						i_5_ = i_4_ + 2;
						i_6_ = 5;
					} else {
						i_5_ = i_4_;
						i_6_ = 0;
					}
				} else {
					i_5_ = 2 * i_4_;
					i_6_ = 1;
				}
				OpenGL.glDrawArrays(i_6_, i, i_5_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.HB("
					+ (class232 != null ? "{...}" : "null") + ',' + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	private final void method2081(final byte i) {
		try {
			if (aBoolean6120) {
				OpenGL.glPopMatrix();
			}
			if (((ha_Sub3) this).aClass204_4551.method2708(126)) {
				if (!aBoolean6122) {
					OpenGL.glLoadMatrixf((((ha_Sub3) this).aClass111_Sub3_4545
							.method2121((byte) -81,
									Class98_Sub30.aFloatArray4096)), 0);
					aBoolean6122 = true;
					method2065((byte) 80);
					method2035(-14713);
				}
				if (((ha_Sub3) this).aBoolean4540) {
					aBoolean6120 = false;
				} else {
					OpenGL.glPushMatrix();
					OpenGL.glMultMatrixf((((ha_Sub3) this).aClass111_Sub3_4542
							.method2121((byte) -80,
									Class98_Sub30.aFloatArray4096)), 0);
					aBoolean6120 = true;
				}
			} else if (!((ha_Sub3) this).aBoolean4540) {
				OpenGL.glLoadMatrixf(
						(((ha_Sub3) this).aClass111_Sub3_4542.method2121(
								(byte) -57, Class98_Sub30.aFloatArray4096)), 0);
				aBoolean6120 = false;
			} else {
				OpenGL.glLoadIdentity();
				aBoolean6120 = false;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.N(" + i + ')');
		}
	}

	@Override
	final void method2025(final byte i) {
		try {
			if (!((ha_Sub3) this).aBoolean4555) {
				OpenGL.glDisable(16384);
				OpenGL.glDisable(16385);
			} else {
				OpenGL.glEnable(16384);
				OpenGL.glEnable(16385);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.QA(" + i + ')');
		}
	}

	@Override
	final Class76 method2067(final int i, final byte i_9_) {
		try {
			final int i_11_ = i;
			while_98_: do {
				while_97_: do {
					do {
						if (i_11_ != 3) {
							if ((i_11_ ^ 0xffffffff) == -5) {
								break;
							}
							if ((i_11_ ^ 0xffffffff) != -9) {
								break while_98_;
							}
							if (!client.aBoolean3553) {
								break while_97_;
							}
						}
						return new Class76_Sub8(this,
								(((ha_Sub3) this).aClass207_4535));
					} while (false);
					return new Class76_Sub2(this,
							((ha_Sub3) this).aClass207_4535,
							((ha_Sub3) this).aClass195_4529);
				} while (false);
				return new Class76_Sub9(this, ((ha_Sub3) this).aClass207_4535,
						((ha_Sub3) this).aClass195_4529);
			} while (false);
			return super.method2067(i, (byte) -112);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.CD(" + i + ','
					+ i_9_ + ')');
		}
	}

	@Override
	final void method1746(final int i, final int i_12_, final int i_13_,
			final int i_14_) {
		/* empty */
	}

	@Override
	final void method2009(final int i) {
		try {
			OpenGL.glScissor(((ha_Sub3) this).anInt4578
					+ ((ha_Sub3) this).anInt4602, (-((ha_Sub3) this).anInt4638
					+ ((ha_Sub3) this).anInt4531 + ((ha_Sub3) this).anInt4622),
					((ha_Sub3) this).anInt4575 - ((ha_Sub3) this).anInt4602,
					-((ha_Sub3) this).anInt4558 + ((ha_Sub3) this).anInt4638);
			if (i != 28976) {
				method1974(-60);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.V(" + i + ')');
		}
	}

	@Override
	final void F(final int i, final int i_15_) {
		/* empty */
	}

	@Override
	final void method2007(final boolean bool) {
		try {
			((ha_Sub3) this).aFloat4592 = -((ha_Sub3) this).anInt4601
					+ ((ha_Sub3) this).anInt4605;
			((ha_Sub3) this).aFloat4615 = (-((ha_Sub3) this).anInt4581 + ((ha_Sub3) this).aFloat4592);
			if (bool != false) {
				method1972(58);
			}
			if (((ha_Sub3) this).aFloat4615 < ((ha_Sub3) this).anInt4640) {
				((ha_Sub3) this).aFloat4615 = ((ha_Sub3) this).anInt4640;
			}
			OpenGL.glFogf(2915, ((ha_Sub3) this).aFloat4615);
			OpenGL.glFogf(2916, ((ha_Sub3) this).aFloat4592);
			Class98_Sub39.aFloatArray4189[2] = (Class202.method2702(
					((ha_Sub3) this).anInt4636, 255) / 255.0F);
			Class98_Sub39.aFloatArray4189[0] = (Class202.method2702(16711680,
					((ha_Sub3) this).anInt4636) / 1.671168E7F);
			Class98_Sub39.aFloatArray4189[1] = (Class202.method2702(65280,
					((ha_Sub3) this).anInt4636) / 65280.0F);
			OpenGL.glFogfv(2918, Class98_Sub39.aFloatArray4189, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.S(" + bool
					+ ')');
		}
	}

	@Override
	final Object method2058(final Canvas canvas, final int i) {
		try {
			if (i != -8401) {
				anInt6126 = -114;
			}
			final long l = anOpenGL6111.prepareSurface(canvas);
			if (l == -1L) {
				throw new RuntimeException();
			}
			return new Long(l);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.EB("
					+ (canvas != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final int I() {
		try {
			return anInt6132;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.I(" + ')');
		}
	}

	@Override
	final void b(final int i, final int i_16_, final int i_17_,
			final int i_18_, final double d) {
		/* empty */
	}

	final synchronized void method2082(final int i, final long l) {
		try {
			if (i != 0) {
				aClass148_6112 = null;
			}
			final Node node = new Node();
			node.aLong832 = l;
			aClass148_6118.method2419(node, -20911);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.AA(" + i + ','
					+ l + ')');
		}
	}

	@Override
	final void method2030(final byte i) {
		do {
			try {
				do {
					if (!((ha_Sub3) this).aBoolean4672) {
						OpenGL.glDisable(3089);
						if (!client.aBoolean3553) {
							break;
						}
					}
					OpenGL.glEnable(3089);
				} while (false);
				if (i == -122) {
					break;
				}
				method2007(true);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hl.MC(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method1999(final byte i) {
		try {
			do {
				if (((ha_Sub3) this).aBoolean4571
						&& ((ha_Sub3) this).aBoolean4562
						&& (((ha_Sub3) this).anInt4581 ^ 0xffffffff) <= -1) {
					OpenGL.glEnable(2912);
					if (!client.aBoolean3553) {
						break;
					}
				}
				OpenGL.glDisable(2912);
			} while (false);
			if (i != 112) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.WB(" + i + ')');
		}
	}

	@Override
	final void method2036(final int i) {
		try {
			if (i != -11155) {
				aBoolean6123 = false;
			}
			OpenGL.glViewport(((ha_Sub3) this).anInt4578,
					((ha_Sub3) this).anInt4622, ((ha_Sub3) this).anInt4527,
					((ha_Sub3) this).anInt4531);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.JB(" + i + ')');
		}
	}

	@Override
	final void method2016(final byte i) {
		try {
			if (((ha_Sub3) this).aClass126_4625 == Class101.aClass126_848) {
				OpenGL.glBlendFunc(770, 771);
			} else if (Class373_Sub1_Sub1.aClass126_6216 == ((ha_Sub3) this).aClass126_4625) {
				OpenGL.glBlendFunc(1, 1);
			} else if (Class83.aClass126_632 == ((ha_Sub3) this).aClass126_4625) {
				OpenGL.glBlendFunc(774, 1);
			}
			if (i >= -109) {
				return;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.LA(" + i + ')');
		}
	}

	@Override
	final void method2059(final boolean bool, final boolean bool_19_) {
		do {
			try {
				do {
					if (bool) {
						OpenGL.glEnable(32925);
						if (!client.aBoolean3553) {
							break;
						}
					}
					OpenGL.glDisable(32925);
				} while (false);
				if (bool_19_ == false) {
					break;
				}
				method1806(86);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("hl.FD("
						+ bool + ',' + bool_19_ + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final Class62 method1799() {
		try {
			int i = -1;
			if (aString6140.indexOf("nvidia") == -1) {
				if ((aString6140.indexOf("intel") ^ 0xffffffff) != 0) {
					i = 32902;
				} else if ((aString6140.indexOf("ati") ^ 0xffffffff) != 0) {
					i = 4098;
				}
			} else {
				i = 4318;
			}
			return new Class62(i, "OpenGL", anInt6129, aString6131, 0L);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.RB(" + ')');
		}
	}

	@Override
	final void method1764(final int i, final int i_20_) throws Exception_Sub1 {
		try {
			anOpenGL6111.swapBuffers();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.BB(" + i + ','
					+ i_20_ + ')');
		}
	}

	@Override
	final void method1791(final float f, final float f_21_, final float f_22_) {
		/* empty */
	}

	@Override
	final void method2033(final int i) {
		try {
			do {
				if (((ha_Sub3) this).aBoolean4560) {
					OpenGL.glEnable(3042);
					if (!client.aBoolean3553) {
						break;
					}
				}
				OpenGL.glDisable(3042);
			} while (false);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.IA(" + i + ')');
		}
	}

	@Override
	final int[] na(final int i, final int i_24_, final int i_25_,
			final int i_26_) {
		try {
			final int[] is = new int[i_25_ * i_26_];
			for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
				OpenGL.glReadPixelsi(i, (-i_27_ + ((ha_Sub3) this).anInt4531
						+ -i_24_ + -1), i_25_, 1, 32993, anInt6135, is, i_27_
						* i_25_);
			}
			return is;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.na(" + i + ','
					+ i_24_ + ',' + i_25_ + ',' + i_26_ + ')'));
		}
	}

	@Override
	final synchronized void method1806(int i) {
		try {
			i &= 0x7fffffff;
			int i_28_ = 0;
			while (!aClass148_6113.method2420(-126)) {
				final Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass148_6113
						.method2421(6494);
				Class294.anIntArray2408[i_28_++] = (int) ((Node) class98_sub34).aLong832;
				((ha_Sub3) this).anInt4538 -= class98_sub34.anInt4126;
				if (i_28_ == 1000) {
					OpenGL.glDeleteBuffersARB(i_28_, Class294.anIntArray2408, 0);
					i_28_ = 0;
				}
			}
			if ((i_28_ ^ 0xffffffff) < -1) {
				OpenGL.glDeleteBuffersARB(i_28_, Class294.anIntArray2408, 0);
				i_28_ = 0;
			}
			while (!aClass148_6114.method2420(-125)) {
				final Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass148_6114
						.method2421(6494);
				Class294.anIntArray2408[i_28_++] = (int) ((Node) class98_sub34).aLong832;
				((ha_Sub3) this).anInt4541 -= class98_sub34.anInt4126;
				if (i_28_ == 1000) {
					OpenGL.glDeleteTextures(i_28_, Class294.anIntArray2408, 0);
					i_28_ = 0;
				}
			}
			if (i_28_ > 0) {
				OpenGL.glDeleteTextures(i_28_, Class294.anIntArray2408, 0);
				i_28_ = 0;
			}
			while (!aClass148_6115.method2420(-125)) {
				final Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass148_6115
						.method2421(6494);
				Class294.anIntArray2408[i_28_++] = class98_sub34.anInt4126;
				if ((i_28_ ^ 0xffffffff) == -1001) {
					OpenGL.glDeleteFramebuffersEXT(i_28_,
							Class294.anIntArray2408, 0);
					i_28_ = 0;
				}
			}
			if (i_28_ > 0) {
				OpenGL.glDeleteFramebuffersEXT(i_28_, Class294.anIntArray2408,
						0);
				i_28_ = 0;
			}
			while (!aClass148_6116.method2420(-124)) {
				final Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass148_6116
						.method2421(6494);
				Class294.anIntArray2408[i_28_++] = (int) ((Node) class98_sub34).aLong832;
				((ha_Sub3) this).anInt4539 -= class98_sub34.anInt4126;
				if (i_28_ == 1000) {
					OpenGL.glDeleteRenderbuffersEXT(i_28_,
							Class294.anIntArray2408, 0);
					i_28_ = 0;
				}
			}
			if ((i_28_ ^ 0xffffffff) < -1) {
				OpenGL.glDeleteRenderbuffersEXT(i_28_, Class294.anIntArray2408,
						0);
			}
			while (!aClass148_6112.method2420(-127)) {
				final Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass148_6112
						.method2421(6494);
				OpenGL.glDeleteLists((int) ((Node) class98_sub34).aLong832,
						(class98_sub34.anInt4126));
			}
			while (!aClass148_6117.method2420(-128)) {
				final Node node = aClass148_6117.method2421(6494);
				OpenGL.glDeleteProgramARB((int) node.aLong832);
			}
			while (!aClass148_6118.method2420(-125)) {
				final Node node = aClass148_6118.method2421(6494);
				OpenGL.glDeleteObjectARB(node.aLong832);
			}
			while (!aClass148_6112.method2420(-125)) {
				final Class98_Sub34 class98_sub34 = (Class98_Sub34) aClass148_6112
						.method2421(6494);
				OpenGL.glDeleteLists((int) ((Node) class98_sub34).aLong832,
						(class98_sub34.anInt4126));
			}
			if (E() > 100663296
					&& aLong6127 - -60000L < Class343.method3819(-47)) {
				System.gc();
				aLong6127 = Class343.method3819(-47);
			}
			super.method1806(i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.UB(" + i + ')');
		}
	}

	@Override
	final void method1955(final int i) {
		do {
			try {
				do {
					if (!((ha_Sub3) this).aBoolean4643
							|| ((ha_Sub3) this).aBoolean4637) {
						OpenGL.glDisable(2896);
						if (!client.aBoolean3553) {
							break;
						}
					}
					OpenGL.glEnable(2896);
				} while (false);
				if (i == -5668) {
					break;
				}
				method2030((byte) -122);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hl.AC(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method1966(final byte i) {
		try {
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(((ha_Sub3) this).aFloatArray4566, 0);
			OpenGL.glMatrixMode(5888);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.LC(" + i + ')');
		}
	}

	@Override
	final Interface2_Impl1 method2060(final boolean bool, final int i) {
		try {
			if (i < 40) {
				return null;
			}
			return new Class69_Sub2(this, bool);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.AD(" + bool
					+ ',' + i + ')');
		}
	}

	@Override
	final Interface2_Impl2 method1990(final byte i, final boolean bool) {
		try {
			if (i != 84) {
				aClass69_Sub2Array6124 = null;
			}
			return new Class69_Sub1(this, Class162.aClass162_1267, bool);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.KD(" + i + ','
					+ bool + ')');
		}
	}

	@Override
	final void method1825() {
		try {
			OpenGL.glFinish();
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.TC(" + ')');
		}
	}

	@Override
	final void a(final Rectangle[] rectangles, final int i, final int i_30_,
			final int i_31_) throws Exception_Sub1 {
		try {
			method1764(i_30_, i_31_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.DD("
					+ (rectangles != null ? "{...}" : "null") + ',' + i + ','
					+ i_30_ + ',' + i_31_ + ')'));
		}
	}

	@Override
	final void method1761(final boolean bool) {
		/* empty */
	}

	@Override
	final Interface13 method1744(final int i, final int i_32_) {
		try {
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.SB(" + i + ','
					+ i_32_ + ')');
		}
	}

	@Override
	final boolean method1942(final int i, final Class164 class164,
			final Class162 class162) {
		try {
			if (i != 0) {
				method1988(null, null, 89);
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.CC(" + i + ','
					+ (class164 != null ? "{...}" : "null") + ','
					+ (class162 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method1972(final int i) {
		do {
			try {
				OpenGL.glDepthMask(((ha_Sub3) this).aBoolean4606
						&& ((ha_Sub3) this).aBoolean4620);
				if (i == 0) {
					break;
				}
				aMapBuffer6125 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hl.DB(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final synchronized void method2083(final int i, final int i_33_,
			final int i_34_) {
		try {
			final Class98_Sub34 class98_sub34 = new Class98_Sub34(i_34_);
			((Node) class98_sub34).aLong832 = i_33_;
			if (i <= -4) {
				aClass148_6114.method2419(class98_sub34, -20911);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.CA(" + i + ','
					+ i_33_ + ',' + i_34_ + ')'));
		}
	}

	@Override
	final void method1983(final byte i) {
		try {
			method2081((byte) -89);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.PB(" + i + ')');
		}
	}

	@Override
	final void method2047(final int i, final boolean bool, final byte i_36_,
			final Class65 class65) {
		do {
			try {
				OpenGL.glTexEnvi(8960, i + 34184,
						Class98_Sub12.method1128(class65, 97));
				OpenGL.glTexEnvi(8960, 34200 - -i, bool ? 771 : 770);
				if (i_36_ == -42) {
					break;
				}
				aBoolean6138 = true;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("hl.B(" + i
						+ ',' + bool + ',' + i_36_ + ','
						+ (class65 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	@Override
	final Interface4_Impl2 method2063(final int i, final byte i_37_,
			final int[] is, final boolean bool, final int i_38_,
			final int i_39_, final int i_40_) {
		try {
			if (!aBoolean6130
					&& (!Class81.method815(i_38_, 0) || !Class81.method815(
							i_39_, 0))) {
				if (!aBoolean6138) {
					final Class21_Sub1 class21_sub1 = new Class21_Sub1(this,
							Class62.aClass164_486, Class162.aClass162_1266,
							Class48.method453(423660257, i_38_),
							Class48.method453(423660257, i_39_));
					class21_sub1.method49(17779, 0, i_39_, is, 0, i, i_40_,
							i_38_);
					return class21_sub1;
				}
				return new Class21_Sub3(this, i_38_, i_39_, is, i, i_40_);
			}
			return new Class21_Sub1(this, i_38_, i_39_, bool, is, i, i_40_);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.QB(" + i + ','
					+ i_37_ + ',' + (is != null ? "{...}" : "null") + ','
					+ bool + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ')'));
		}
	}

	@Override
	final void method1776() {
		/* empty */
	}

	@Override
	final void method2046(final int i) {
		do {
			try {
				do {
					if (((ha_Sub3) this).aBoolean4599) {
						OpenGL.glEnable(3008);
						if (!client.aBoolean3553) {
							break;
						}
					}
					OpenGL.glDisable(3008);
				} while (false);
				if (i == 0) {
					break;
				}
				aClass148_6117 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hl.TA(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final Interface5 method1813(final int i, final int i_42_) {
		try {
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.GD(" + i + ','
					+ i_42_ + ')');
		}
	}

	@Override
	final Interface4_Impl2 method2032(final byte[] is, final boolean bool,
			final Class164 class164, final int i, final int i_43_,
			final boolean bool_44_, final int i_45_, final int i_46_) {
		try {
			if (bool != false) {
				anInt6132 = -43;
			}
			if (aBoolean6130 || Class81.method815(i_46_, 0)
					&& Class81.method815(i_43_, 0)) {
				return new Class21_Sub1(this, class164, i_46_, i_43_, bool_44_,
						is, i_45_, i);
			}
			if (!aBoolean6138) {
				final Class21_Sub1 class21_sub1 = new Class21_Sub1(this,
						class164, Class162.aClass162_1266, Class48.method453(
								423660257, i_46_), Class48.method453(423660257,
								i_43_));
				class21_sub1.method41(i, i_45_, i_46_, 0, i_43_, -26946, is,
						class164, 0);
				return class21_sub1;
			}
			return new Class21_Sub3(this, class164, i_46_, i_43_, is, i_45_, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, ("hl.FC("
							+ (is != null ? "{...}" : "null") + ',' + bool
							+ ',' + (class164 != null ? "{...}" : "null") + ','
							+ i + ',' + i_43_ + ',' + bool_44_ + ',' + i_45_
							+ ',' + i_46_ + ')'));
		}
	}

	@Override
	final void method1974(final int i) {
		try {
			if (i == 0) {
				if (!((ha_Sub3) this).aBoolean4577) {
					OpenGL.glDisable(2929);
				} else {
					OpenGL.glEnable(2929);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.PA(" + i + ')');
		}
	}

	@Override
	final Interface4_Impl1 method2044(final int i, final Class164 class164,
			final byte[] is, final int i_47_, final int i_48_, final int i_49_) {
		try {
			return new Class21_Sub4(this, class164, i_47_, i_48_, i_49_, is);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.OB(" + i + ','
					+ (class164 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ',' + i_47_ + ','
					+ i_48_ + ',' + i_49_ + ')'));
		}
	}

	@Override
	final void method1814() {
		/* empty */
	}

	@Override
	final void method1964(final Class38 class38, final byte i) {
		do {
			try {
				if (i != 26) {
					aBoolean6130 = false;
				}
				if (class38 == r_Sub2.aClass38_6334) {
					OpenGL.glDisable(3168);
					OpenGL.glDisable(3169);
					OpenGL.glDisable(3170);
					if (!client.aBoolean3553) {
						break;
					}
				}
				final int i_51_ = Class323.method3678((byte) 115, class38);
				OpenGL.glTexGeni(8192, 9472, i_51_);
				OpenGL.glEnable(3168);
				OpenGL.glTexGeni(8193, 9472, i_51_);
				OpenGL.glEnable(3169);
				OpenGL.glTexGeni(8194, 9472, i_51_);
				OpenGL.glEnable(3170);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27
						.printError(runtimeexception, ("hl.ND("
								+ (class38 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
		} while (false);
	}

	@Override
	final void method2042(final Class256 class256, final byte i) {
		try {
			final Class49[] class49s = ((Class256_Sub1) class256).aClass49Array5159;
			int i_53_ = 0;
			boolean bool = false;
			boolean bool_54_ = false;
			boolean bool_55_ = false;
			for (int i_56_ = 0; (class49s.length ^ 0xffffffff) < (i_56_ ^ 0xffffffff); i_56_++) {
				final Class49 class49 = class49s[i_56_];
				final Class69_Sub2 class69_sub2 = aClass69_Sub2Array6124[i_56_];
				int i_57_ = 0;
				final int i_58_ = class69_sub2.method704((byte) -22);
				final long l = class69_sub2.method695(-30277);
				class69_sub2.method698(18569);
				for (int i_59_ = 0; class49.method480((byte) -99) > i_59_; i_59_++) {
					final Class169 class169 = class49.method479(i_59_,
							(byte) -122);
					if (class169 != Class169.aClass169_1294) {
						if (class169 == Class169.aClass169_1297) {
							bool_54_ = true;
							OpenGL.glNormalPointer(5126, i_58_, l
									- -(long) i_57_);
						} else if (Class169.aClass169_1298 == class169) {
							bool = true;
							OpenGL.glColorPointer(4, 5121, i_58_, l + i_57_);
						} else if (Class169.aClass169_1299 == class169) {
							OpenGL.glClientActiveTexture(i_53_++ + 33984);
							OpenGL.glTexCoordPointer(1, 5126, i_58_, l
									- -(long) i_57_);
						} else if (Class169.aClass169_1301 == class169) {
							OpenGL.glClientActiveTexture(33984 + i_53_++);
							OpenGL.glTexCoordPointer(2, 5126, i_58_, l
									- -(long) i_57_);
						} else if (class169 != Class169.aClass169_1302) {
							if (class169 == Class169.aClass169_1303) {
								OpenGL.glClientActiveTexture(33984 + i_53_++);
								OpenGL.glTexCoordPointer(4, 5126, i_58_, i_57_
										+ l);
							}
						} else {
							OpenGL.glClientActiveTexture(33984 - -i_53_++);
							OpenGL.glTexCoordPointer(3, 5126, i_58_, l
									- -(long) i_57_);
						}
					} else {
						bool_55_ = true;
						OpenGL.glVertexPointer(3, 5126, i_58_, l + i_57_);
					}
					i_57_ += class169.anInt1295;
				}
			}
			if (bool_55_ != aBoolean6121) {
				if (!bool_55_) {
					OpenGL.glDisableClientState(32884);
				} else {
					OpenGL.glEnableClientState(32884);
				}
				aBoolean6121 = bool_55_;
			}
			if (!aBoolean6123 != !bool_54_) {
				if (bool_54_) {
					OpenGL.glEnableClientState(32885);
				} else {
					OpenGL.glDisableClientState(32885);
				}
				aBoolean6123 = bool_54_;
			}
			if (aBoolean6119 == !bool) {
				if (!bool) {
					OpenGL.glDisableClientState(32886);
				} else {
					OpenGL.glEnableClientState(32886);
				}
				aBoolean6119 = bool;
			}
			if ((anInt6126 ^ 0xffffffff) <= (i_53_ ^ 0xffffffff)) {
				if (anInt6126 > i_53_) {
					for (int i_60_ = i_53_; i_60_ < anInt6126; i_60_++) {
						OpenGL.glClientActiveTexture(33984 - -i_60_);
						OpenGL.glDisableClientState(32888);
					}
					anInt6126 = i_53_;
				}
			} else {
				for (int i_61_ = anInt6126; (i_61_ ^ 0xffffffff) > (i_53_ ^ 0xffffffff); i_61_++) {
					OpenGL.glClientActiveTexture(i_61_ + 33984);
					OpenGL.glEnableClientState(32888);
				}
				anInt6126 = i_53_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.JD("
					+ (class256 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final void method1958(final byte i) {
		do {
			try {
				OpenGL.glTexEnvi(
						8960,
						34162,
						Class5.method178(
								(((ha_Sub3) this).aClass128Array4639[(((ha_Sub3) this).anInt4579)]),
								0));
				if (i == -48) {
					break;
				}
				method2065((byte) -18);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hl.KC(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method1817() {
		try {
			if ((((ha_Sub3) this).anInt4527 ^ 0xffffffff) < -1
					|| ((ha_Sub3) this).anInt4531 > 0) {
				final int i = ((ha_Sub3) this).anInt4602;
				final int i_62_ = ((ha_Sub3) this).anInt4575;
				final int i_63_ = ((ha_Sub3) this).anInt4558;
				final int i_64_ = ((ha_Sub3) this).anInt4638;
				la();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method1992((byte) 125);
				method2028(false, (byte) -101);
				method1979(false, -60);
				method2013(false, 2103);
				method1997(0, false);
				method2005(null, 127);
				method2039(false, 0, -2, false);
				method2015(1, (byte) -120);
				method2001(0, 79);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, ((ha_Sub3) this).anInt4527,
						((ha_Sub3) this).anInt4531, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				KA(i, i_63_, i_62_, i_64_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.O(" + ')');
		}
	}

	@Override
	final void method1973(final Class232 class232, final int i,
			final int i_65_, final int i_66_,
			final Interface2_Impl2 interface2_impl2, final int i_67_,
			final int i_68_) {
		try {
			if (i_66_ == 26810) {
				int i_69_;
				int i_70_;
				if (Class334.aClass232_3468 == class232) {
					i_70_ = i_68_ * 2;
					i_69_ = 1;
				} else if (Class287_Sub1.aClass232_3420 != class232) {
					if (Class336.aClass232_2822 == class232) {
						i_69_ = 4;
						i_70_ = i_68_ * 3;
					} else if (Class98_Sub46_Sub15.aClass232_6043 == class232) {
						i_69_ = 6;
						i_70_ = 2 + i_68_;
					} else if (AnimationDefinition.aClass232_806 == class232) {
						i_69_ = 5;
						i_70_ = 2 + i_68_;
					} else {
						i_70_ = i_68_;
						i_69_ = 0;
					}
				} else {
					i_70_ = i_68_ + 1;
					i_69_ = 3;
				}
				final Class162 class162 = interface2_impl2.method77(-15448);
				final Class69_Sub1 class69_sub1 = (Class69_Sub1) interface2_impl2;
				class69_sub1.method698(18569);
				OpenGL.glDrawElements(
						i_69_,
						i_70_,
						Class98_Sub5_Sub1.method964(class162, (byte) 105),
						(class69_sub1.method695(-30277) - -(long) (i_65_ * (class162.anInt1263))));
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.SD("
					+ (class232 != null ? "{...}" : "null") + ',' + i + ','
					+ i_65_ + ',' + i_66_ + ','
					+ (interface2_impl2 != null ? "{...}" : "null") + ','
					+ i_67_ + ',' + i_68_ + ')'));
		}
	}

	@Override
	final Class48 method1769(final Class48 class48, final Class48 class48_71_,
			final float f, final Class48 class48_72_) {
		try {
			if (!(f < 0.5F)) {
				return class48_71_;
			}
			return class48;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.UC("
					+ (class48 != null ? "{...}" : "null") + ','
					+ (class48_71_ != null ? "{...}" : "null") + ',' + f + ','
					+ (class48_72_ != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method2011(final int i) {
		do {
			try {
				OpenGL.glTexEnvi(
						8960,
						34161,
						Class5.method178(
								(((ha_Sub3) this).aClass128Array4585[(((ha_Sub3) this).anInt4579)]),
								0));
				if (i == 2) {
					break;
				}
				GA(-98);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hl.GB(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final Interface4_Impl2 method1968(final int i, final int i_73_,
			final boolean bool, final Class164 class164, final int i_74_,
			final int i_75_, final int i_76_, final float[] fs) {
		try {
			if (aBoolean6130 || Class81.method815(i_73_, 0)
					&& Class81.method815(i_75_, 0)) {
				return new Class21_Sub1(this, class164, i_73_, i_75_, bool, fs,
						i, i_76_);
			}
			if (aBoolean6138) {
				return new Class21_Sub3(this, class164, i_73_, i_75_, fs, i,
						i_76_);
			}
			final Class21_Sub1 class21_sub1 = new Class21_Sub1(this, class164,
					Class162.aClass162_1270,
					Class48.method453(423660257, i_73_), Class48.method453(
							423660257, i_75_));
			class21_sub1.method267(fs, class164, i_75_, i_73_, (byte) 111, 0,
					i_76_, 0, i);
			return class21_sub1;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.HC(" + i + ','
					+ i_73_ + ',' + bool + ','
					+ (class164 != null ? "{...}" : "null") + ',' + i_74_ + ','
					+ i_75_ + ',' + i_76_ + ','
					+ (fs != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method2057(final int i) {
		try {
			Class98_Sub39.aFloatArray4189[2] = (Class202.method2702(
					((ha_Sub3) this).anInt4648, 255) / 255.0F);
			Class98_Sub39.aFloatArray4189[1] = (Class202.method2702(65280,
					((ha_Sub3) this).anInt4648) / 65280.0F);
			if (i != 12362) {
				aLong6127 = 41L;
			}
			Class98_Sub39.aFloatArray4189[0] = (Class202.method2702(16711680,
					((ha_Sub3) this).anInt4648) / 1.671168E7F);
			Class98_Sub39.aFloatArray4189[3] = (((ha_Sub3) this).anInt4648 >>> 1318505624) / 255.0F;
			OpenGL.glTexEnvfv(8960, 8705, Class98_Sub39.aFloatArray4189, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.TB(" + i + ')');
		}
	}

	@Override
	final Class256 method1982(final Class49[] class49s, final int i) {
		try {
			if (i != 6) {
				method2036(59);
			}
			return new Class256_Sub1(class49s);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.RC("
					+ (class49s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final void method1950(final byte i) {
		try {
			OpenGL.glActiveTexture(((ha_Sub3) this).anInt4579 + 33984);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.IB(" + i + ')');
		}
	}

	@Override
	final void method2004(final byte i) {
		do {
			try {
				Class98_Sub39.aFloatArray4189[1] = (((ha_Sub3) this).aFloat4549 * ((ha_Sub3) this).aFloat4630);
				Class98_Sub39.aFloatArray4189[3] = 1.0F;
				Class98_Sub39.aFloatArray4189[0] = (((ha_Sub3) this).aFloat4630 * ((ha_Sub3) this).aFloat4611);
				Class98_Sub39.aFloatArray4189[2] = (((ha_Sub3) this).aFloat4630 * ((ha_Sub3) this).aFloat4591);
				OpenGL.glLightfv(16384, 4609, Class98_Sub39.aFloatArray4189, 0);
				Class98_Sub39.aFloatArray4189[3] = 1.0F;
				Class98_Sub39.aFloatArray4189[1] = (-((ha_Sub3) this).aFloat4594 * ((ha_Sub3) this).aFloat4549);
				Class98_Sub39.aFloatArray4189[2] = (-((ha_Sub3) this).aFloat4594 * ((ha_Sub3) this).aFloat4591);
				Class98_Sub39.aFloatArray4189[0] = (((ha_Sub3) this).aFloat4611 * -((ha_Sub3) this).aFloat4594);
				OpenGL.glLightfv(16385, 4609, Class98_Sub39.aFloatArray4189, 0);
				if (i <= -98) {
					break;
				}
				aBoolean6138 = false;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hl.QC(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method1936(final int i, final Object object, final Canvas canvas) {
		try {
			if (i != 0) {
				aBoolean6120 = false;
			}
			final Long var_long = (Long) object;
			anOpenGL6111.releaseSurface(canvas, var_long.longValue());
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.JC(" + i + ','
					+ (object != null ? "{...}" : "null") + ','
					+ (canvas != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method2021(final int i) {
		try {
			if (i != 0) {
				method2021(-94);
			}
			aBoolean6122 = false;
			method2081((byte) 119);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.G(" + i + ')');
		}
	}

	@Override
	final void method2065(final byte i) {
		try {
			OpenGL.glLightfv(16384, 4611, ((ha_Sub3) this).aFloatArray4596, 0);
			if (i == 80) {
				OpenGL.glLightfv(16385, 4611, ((ha_Sub3) this).aFloatArray4572,
						0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.LB(" + i + ')');
		}
	}

	@Override
	final void method1959(final int i) {
		do {
			try {
				final int i_79_ = (anIntArray6139[((ha_Sub3) this).anInt4579]);
				if (i_79_ == i) {
					break;
				}
				anIntArray6139[(((ha_Sub3) this).anInt4579)] = 0;
				OpenGL.glBindTexture(i_79_, 0);
				OpenGL.glDisable(i_79_);
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hl.MD(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method1740(final Interface17 interface17) {
		/* empty */
	}

	final synchronized void method2084(final int i, final int i_80_,
			final int i_81_) {
		try {
			if (i != 1) {
				method1746(-36, 50, 45, 78);
			}
			final Class98_Sub34 class98_sub34 = new Class98_Sub34(i_80_);
			((Node) class98_sub34).aLong832 = i_81_;
			aClass148_6113.method2419(class98_sub34, -20911);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.FA(" + i + ','
					+ i_80_ + ',' + i_81_ + ')'));
		}
	}

	@Override
	final void method1989(final int i) {
		try {
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.J(" + i + ')');
		}
	}

	@Override
	final void ya() {
		try {
			method1997(0, true);
			OpenGL.glClear(256);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.ya(" + ')');
		}
	}

	ha_Sub3_Sub2(final OpenGL opengl, final Canvas canvas, final long l,
			final d var_d, final Class207 class207, final int i) {
		super(canvas, new Long(l), var_d, class207, i, 1);
		try {
			try {
				anOpenGL6111 = opengl;
				anOpenGL6111.b();
				aString6140 = OpenGL.glGetString(7936).toLowerCase();
				aString6131 = OpenGL.glGetString(7937).toLowerCase();
				if ((aString6140.indexOf("microsoft") ^ 0xffffffff) != 0
						|| aString6140.indexOf("brian paul") != -1
						|| aString6140.indexOf("mesa") != -1) {
					throw new RuntimeException("");
				}
				final String string = OpenGL.glGetString(7938);
				final String[] strings = Class112.method2142(
						string.replace('.', ' '), ' ', false);
				if ((strings.length ^ 0xffffffff) <= -3) {
					try {
						final int i_83_ = PacketSender.method3607(-52,
								strings[0]);
						final int i_84_ = PacketSender.method3607(73,
								strings[1]);
						anInt6129 = i_84_ + 10 * i_83_;
					} catch (final NumberFormatException numberformatexception) {
						throw new RuntimeException("");
					}
				} else {
					throw new RuntimeException("");
				}
				if ((anInt6129 ^ 0xffffffff) > -13) {
					throw new RuntimeException("");
				}
				if (!anOpenGL6111.a("GL_ARB_multitexture")) {
					throw new RuntimeException("");
				}
				if (!anOpenGL6111.a("GL_ARB_texture_env_combine")) {
					throw new RuntimeException("");
				}
				final int[] is = new int[1];
				OpenGL.glGetIntegerv(34018, is, 0);
				((ha_Sub3) this).anInt4608 = is[0];
				if (((ha_Sub3) this).anInt4608 < 2) {
					throw new RuntimeException("");
				}
				((ha_Sub3) this).anInt4565 = 8;
				aBoolean6137 = anOpenGL6111.a("GL_ARB_vertex_buffer_object");
				((ha_Sub3) this).aBoolean4559 = anOpenGL6111
						.a("GL_ARB_multisample");
				aBoolean6138 = anOpenGL6111.a("GL_ARB_texture_rectangle");
				((ha_Sub3) this).aBoolean4569 = anOpenGL6111
						.a("GL_ARB_texture_cube_map");
				aBoolean6130 = anOpenGL6111
						.a("GL_ARB_texture_non_power_of_two");
				((ha_Sub3) this).aBoolean4588 = anOpenGL6111
						.a("GL_EXT_texture3D");
				aBoolean6133 = anOpenGL6111.a("GL_ARB_vertex_shader");
				aBoolean6134 = anOpenGL6111.a("GL_ARB_vertex_program");
				aBoolean6136 = anOpenGL6111.a("GL_ARB_fragment_shader");
				anOpenGL6111.a("GL_ARB_fragment_program");
				anIntArray6139 = new int[((ha_Sub3) this).anInt4608];
				anInt6135 = !Stream.a() ? 5121 : 33639;
				if (aString6131.indexOf("radeon") != -1) {
					int i_85_ = 0;
					boolean bool = false;
					boolean bool_86_ = false;
					final String[] strings_87_ = Class112.method2142(
							aString6131.replace('/', ' '), ' ', false);
					for (int i_88_ = 0; strings_87_.length > i_88_; i_88_++) {
						String string_89_ = strings_87_[i_88_];
						try {
							if (string_89_.length() > 0) {
								if (string_89_.charAt(0) == 'x'
										&& (string_89_.length() ^ 0xffffffff) <= -4
										&& (Class77_Sub1.method781((byte) 53,
												string_89_.substring(1, 3)))) {
									string_89_ = string_89_.substring(1);
									bool_86_ = true;
								}
								if (string_89_.equals("hd")) {
									bool = true;
								} else {
									if (string_89_.startsWith("hd")) {
										string_89_ = string_89_.substring(2);
										bool = true;
									}
									if (((string_89_.length() ^ 0xffffffff) <= -5)
											&& (Class77_Sub1.method781(
													(byte) 53,
													string_89_.substring(0, 4)))) {
										i_85_ = (PacketSender.method3607(87,
												string_89_.substring(0, 4)));
										break;
									}
								}
							}
						} catch (final Exception exception) {
							/* empty */
						}
					}
					if (!bool_86_ && !bool) {
						if (i_85_ >= 7000 && i_85_ <= 7999) {
							aBoolean6137 = false;
						}
						if (i_85_ >= 7000 && i_85_ <= 9250) {
							((ha_Sub3) this).aBoolean4588 = false;
						}
					}
					aBoolean6138 &= anOpenGL6111.a("GL_ARB_half_float_pixel");
				}
				aString6140.indexOf("intel");
				if (aBoolean6137) {
					try {
						final int[] is_90_ = new int[1];
						OpenGL.glGenBuffersARB(1, is_90_, 0);
					} catch (final Throwable throwable) {
						throw new RuntimeException("");
					}
				}
			} catch (final Throwable throwable) {
				throwable.printStackTrace();
				method1743(-1);
				throw new RuntimeException("");
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.<init>("
					+ (opengl != null ? "{...}" : "null") + ','
					+ (canvas != null ? "{...}" : "null") + ',' + l + ','
					+ (var_d != null ? "{...}" : "null") + ','
					+ (class207 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final Interface17 method1815(final Interface5 interface5,
			final Interface13 interface13) {
		try {
			return null;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.EC("
					+ (interface5 != null ? "{...}" : "null") + ','
					+ (interface13 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final boolean method1977(final Class162 class162, final boolean bool,
			final Class164 class164) {
		try {
			if (bool != true) {
				anInt6132 = -89;
			}
			return true;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.BD("
					+ (class162 != null ? "{...}" : "null") + ',' + bool + ','
					+ (class164 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final boolean method1802() {
		try {
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.FB(" + ')');
		}
	}

	@Override
	final void method1991(final int i) {
		try {
			Class98_Sub39.aFloatArray4189[2] = ((ha_Sub3) this).aFloat4576
					* ((ha_Sub3) this).aFloat4591;
			Class98_Sub39.aFloatArray4189[3] = 1.0F;
			Class98_Sub39.aFloatArray4189[1] = ((ha_Sub3) this).aFloat4549
					* ((ha_Sub3) this).aFloat4576;
			Class98_Sub39.aFloatArray4189[0] = ((ha_Sub3) this).aFloat4611
					* ((ha_Sub3) this).aFloat4576;
			if (i != -24391) {
				I();
			}
			OpenGL.glLightModelfv(2899, Class98_Sub39.aFloatArray4189, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.HD(" + i + ')');
		}
	}

	@Override
	final Interface4_Impl2 method2006(final int i, final int i_91_,
			final Class164 class164, final byte i_92_, final Class162 class162) {
		try {
			if (i_92_ != 45) {
				return null;
			}
			if (aBoolean6130 || Class81.method815(i_91_, 0)
					&& Class81.method815(i, 0)) {
				return new Class21_Sub1(this, class164, class162, i_91_, i);
			}
			if (aBoolean6138) {
				return new Class21_Sub3(this, class164, class162, i_91_, i);
			}
			return new Class21_Sub1(this, class164, class162,
					Class48.method453(423660257, i_91_), Class48.method453(
							423660257, i));
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("hl.WC(" + i + ',' + i_91_ + ','
							+ (class164 != null ? "{...}" : "null") + ','
							+ i_92_ + ','
							+ (class162 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method1941(final int i) {
		try {
			for (int i_93_ = ((ha_Sub3) this).anInt4608 + -1; (i_93_ ^ 0xffffffff) <= -1; i_93_--) {
				OpenGL.glActiveTexture(i_93_ + 33984);
				OpenGL.glTexEnvi(8960, 8704, 34160);
				OpenGL.glTexEnvi(8960, 34161, 8448);
				OpenGL.glTexEnvi(8960, 34178, 34166);
				OpenGL.glTexEnvi(8960, 34162, 8448);
				OpenGL.glTexEnvi(8960, 34186, 34166);
			}
			OpenGL.glTexEnvi(8960, 34186, 34168);
			OpenGL.glShadeModel(7425);
			OpenGL.glClearDepth(1.0F);
			OpenGL.glDepthFunc(515);
			OpenGL.glPolygonMode(1028, 6914);
			OpenGL.glEnable(2884);
			OpenGL.glCullFace(1029);
			OpenGL.glAlphaFunc(516, 0.0F);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glColorMaterial(1028, 5634);
			OpenGL.glEnable(2903);
			final float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
			for (int i_94_ = 0; i_94_ < 8; i_94_++) {
				final int i_95_ = i_94_ + 16384;
				OpenGL.glLightfv(i_95_, 4608, fs, 0);
				OpenGL.glLightf(i_95_, 4615, 0.0F);
				OpenGL.glLightf(i_95_, 4616, 0.0F);
			}
			OpenGL.glFogf(2914, 0.95F);
			OpenGL.glFogi(2917, 9729);
			OpenGL.glHint(3156, 4353);
			anOpenGL6111.setSwapInterval(0);
			super.method1941(i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.OC(" + i + ')');
		}
	}

	@Override
	final float method2050(final byte i) {
		try {
			if (i != 56) {
				return -1.1192888F;
			}
			return 0.0F;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.NC(" + i + ')');
		}
	}

	@Override
	final Interface4_Impl3 method1934(final int i, final boolean bool,
			final int[][] is, final int i_96_) {
		try {
			if (i != 8) {
				aClass148_6115 = null;
			}
			return new Class21_Sub2(this, i_96_, bool, is);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.GC(" + i + ','
					+ bool + ',' + (is != null ? "{...}" : "null") + ','
					+ i_96_ + ')'));
		}
	}

	@Override
	final void method2035(final int i) {
		try {
			method1960(i ^ ~0xf07);
			int i_97_;
			for (i_97_ = 0; ((ha_Sub3) this).anInt4619 > i_97_; i_97_++) {
				final Class98_Sub5 class98_sub5 = ((ha_Sub3) this).aClass98_Sub5Array4597[i_97_];
				final int i_98_ = class98_sub5.method961((byte) -78);
				final int i_99_ = 16386 - -i_97_;
				final float f = class98_sub5.method956(false) / 255.0F;
				Class98_Sub39.aFloatArray4189[0] = class98_sub5
						.method954(Class369.method3953(i, -8724));
				Class98_Sub39.aFloatArray4189[1] = class98_sub5
						.method963((byte) 84);
				Class98_Sub39.aFloatArray4189[2] = class98_sub5
						.method962(i + 43412);
				Class98_Sub39.aFloatArray4189[3] = 1.0F;
				OpenGL.glLightfv(i_99_, 4611, Class98_Sub39.aFloatArray4189, 0);
				Class98_Sub39.aFloatArray4189[2] = f
						* Class202.method2702(255, i_98_);
				Class98_Sub39.aFloatArray4189[1] = f
						* Class202.method2702(i_98_ >> -989028888, 255);
				Class98_Sub39.aFloatArray4189[3] = 1.0F;
				Class98_Sub39.aFloatArray4189[0] = Class202.method2702(255,
						i_98_ >> 444887952) * f;
				OpenGL.glLightfv(i_99_, 4609, Class98_Sub39.aFloatArray4189, 0);
				OpenGL.glLightf(i_99_, 4617, (1.0F / (class98_sub5
						.method958(i + 14840) * class98_sub5.method958(126))));
				OpenGL.glEnable(i_99_);
			}
			for (/**/; ((((ha_Sub3) this).anInt4628 ^ 0xffffffff) < (i_97_ ^ 0xffffffff)); i_97_++) {
				OpenGL.glDisable(16386 - -i_97_);
			}
			super.method2035(i);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.BC(" + i + ')');
		}
	}

	@Override
	final void method1773() {
		do {
			try {
				super.method1773();
				if (anOpenGL6111 == null) {
					break;
				}
				anOpenGL6111.a();
				anOpenGL6111.release();
				anOpenGL6111 = null;
			} catch (final RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "hl.AB(" + ')');
			}
			break;
		} while (false);
	}

	@Override
	final void method1971(final int i, final boolean bool,
			final Interface2_Impl1 interface2_impl1) {
		try {
			if (bool == true) {
				aClass69_Sub2Array6124[i] = (Class69_Sub2) interface2_impl1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.R(" + i + ','
					+ bool + ','
					+ (interface2_impl1 != null ? "{...}" : "null") + ')'));
		}
	}

	@Override
	final void method1756() {
		/* empty */
	}

	@Override
	final void method1988(final Canvas canvas, final Object object, final int i) {
		try {
			if (i >= -40) {
				method2025((byte) -19);
			}
			final Long var_long = (Long) object;
			anOpenGL6111.surfaceResized(var_long.longValue());
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.VC("
					+ (canvas != null ? "{...}" : "null") + ','
					+ (object != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	@Override
	final boolean method1768() {
		try {
			return false;
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.CB(" + ')');
		}
	}

	final synchronized void method2085(final boolean bool, final int i) {
		try {
			if (bool != true) {
				aBoolean6133 = false;
			}
			final Node node = new Node();
			node.aLong832 = i;
			aClass148_6117.method2419(node, -20911);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.W(" + bool
					+ ',' + i + ')');
		}
	}

	@Override
	final void method2010(final int i) {
		try {
			OpenGL.glMatrixMode(5890);
			do {
				if (Class98_Sub46_Sub19.aClass258_6062 == (((ha_Sub3) this).aClass258Array4644[((ha_Sub3) this).anInt4579])) {
					OpenGL.glLoadIdentity();
					if (!client.aBoolean3553) {
						break;
					}
				}
				OpenGL.glLoadMatrixf(
						(((ha_Sub3) this).aClass111_Sub3Array4609[((ha_Sub3) this).anInt4579]
								.method2121((byte) -58,
										Class98_Sub30.aFloatArray4096)), 0);
			} while (false);
			OpenGL.glMatrixMode(5888);
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "hl.MB(" + i + ')');
		}
	}

	@Override
	final void method1944(final Object object, final Canvas canvas, final byte i) {
		try {
			if (i == -34) {
				final Long var_long = (Long) object;
				if (!anOpenGL6111.setSurface(var_long.longValue())) {
					throw new RuntimeException();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("hl.NB("
					+ (object != null ? "{...}" : "null") + ','
					+ (canvas != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
