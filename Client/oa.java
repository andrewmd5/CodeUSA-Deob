/* oa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;

final class oa extends ha implements Interface9 {
	long nativeid = 0L;
	private ya aYa3296;
	private static int[] anIntArray3297 = new int[Math.max(Math.max(104, 20),
			24573)];
	private boolean aBoolean3298 = false;
	private final Class148 aClass148_3299 = new Class148();
	private static byte[] aByteArray3300;
	private static int[] anIntArray3301 = anIntArray3297;
	private static float[] aFloatArray3302;
	private static int[] anIntArray3303;
	private static int[] anIntArray3304;
	private static short[] aShortArray3305;
	static int[] anIntArray3306;
	private p aP3307;
	private static float[] aFloatArray3308;
	private static int[] anIntArray3309;
	private Class111 aClass111_3310;
	private int anInt3311 = 4096;
	private int anInt3312 = 4096;
	static int[] anIntArray3313;
	private Class111 aClass111_3314;
	private final Class377 aClass377_3315 = new Class377(4);
	int anInt3316;
	private a[] anAArray3317;
	private boolean aBoolean3318 = false;

	@Override
	final native void P(int i, int i_0_, int i_1_, int i_2_, int i_3_);

	@Override
	final native void pa();

	@Override
	final void method1746(final int i, final int i_4_, final int i_5_,
			final int i_6_) {
		/* empty */
	}

	@Override
	final native void K(int[] is);

	@Override
	final boolean method1771() {
		return true;
	}

	@Override
	final void method1825() {
		/* empty */
	}

	@Override
	final Class98_Sub5 method1765(final int i, final int i_7_, final int i_8_,
			final int i_9_, final int i_10_, final float f) {
		return new Class98_Sub5_Sub3(i, i_7_, i_8_, i_9_, i_10_, f);
	}

	@Override
	final void method1818(final int i, final Class98_Sub5[] class98_sub5s) {
		int i_11_ = 0;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			anIntArray3303[i_11_++] = class98_sub5s[i_12_].method954(7019);
			anIntArray3303[i_11_++] = class98_sub5s[i_12_]
					.method963((byte) 115);
			anIntArray3303[i_11_++] = class98_sub5s[i_12_].method962(28699);
			anIntArray3303[i_11_++] = class98_sub5s[i_12_].method958(126);
			aFloatArray3308[i_12_] = class98_sub5s[i_12_].method956(false);
			anIntArray3303[i_11_++] = class98_sub5s[i_12_]
					.method961((byte) -78);
		}
		N(i, anIntArray3303, aFloatArray3308);
	}

	@Override
	final void method1761(final boolean bool) {
		/* empty */
	}

	@Override
	final native void GA(int i);

	@Override
	final aa method1772(final int i, final int i_13_, final int[] is,
			final int[] is_14_) {
		return new na(this, aYa3296, i, i_13_, is, is_14_);
	}

	@Override
	final boolean method1766() {
		return true;
	}

	public oa(final Canvas canvas, final d var_d, final int i, final int i_15_) {
		super(var_d);
		do {
			try {
				if (!Class134_Sub1.method2246("sw3d", (byte) -36)) {
					throw new RuntimeException("");
				}
				Class192.method2655(-374);
				MA(((ha) this).aD938, 0, 0);
				Class101.method1702(8, false, true);
				aBoolean3318 = true;
				aClass111_3314 = new ja();
				a(new ja());
				method1783(1);
				method1807(0);
				if (canvas == null) {
					break;
				}
				method1741(canvas, i, i_15_);
				method1750(canvas);
			} catch (final Throwable throwable) {
				method1743(-1);
				throw new RuntimeException();
			}
			break;
		} while (false);
	}

	@Override
	final Interface13 method1744(final int i, final int i_16_) {
		return new xa(i, i_16_);
	}

	private final void method1927(final Class242 class242, final boolean bool) {
		int i = 0;
		int i_17_ = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		for (Class246_Sub4_Sub2 class246_sub4_sub2 = (Class246_Sub4_Sub2) class242.aClass358_1850
				.method3890((byte) 71); class246_sub4_sub2 != null; class246_sub4_sub2 = ((Class246_Sub4_Sub2) class242.aClass358_1850
				.method3884(101))) {
			anIntArray3301[i++] = class246_sub4_sub2.anInt6176;
			anIntArray3301[i++] = class246_sub4_sub2.anInt6177;
			anIntArray3301[i++] = class246_sub4_sub2.anInt6175;
			anIntArray3304[i_17_++] = class246_sub4_sub2.anInt6178;
			aShortArray3305[i_19_++] = (short) class246_sub4_sub2.anInt6180;
			anIntArray3309[i_18_++] = class246_sub4_sub2.anInt6179;
			if (bool) {
				aByteArray3300[i_20_++] = class246_sub4_sub2.aByte6183;
			}
		}
	}

	@Override
	final void a(final Rectangle[] rectangles, final int i, final int i_21_,
			final int i_22_) throws Exception_Sub1 {
		if (aP3307 == null) {
			throw new IllegalStateException("off");
		}
		aP3307.method1445(rectangles, i, i_21_, i_22_);
	}

	@Override
	final Class62 method1799() {
		return new Class62(0, "SSE", 1, "CPU", 0L);
	}

	private final native void AA(short i, short i_23_, int i_24_, byte i_25_,
			byte i_26_, int i_27_, boolean bool, byte i_28_, byte i_29_,
			byte i_30_, byte i_31_, boolean bool_32_, boolean bool_33_,
			boolean bool_34_, boolean bool_35_, boolean bool_36_, byte i_37_,
			boolean bool_38_, boolean bool_39_, int i_40_);

	private final native void MA(d var_d, int i, int i_41_);

	@Override
	final native void KA(int i, int i_42_, int i_43_, int i_44_);

	private final native void CA(short i, int[] is, short i_45_, int i_46_,
			byte i_47_, byte i_48_, int i_49_, boolean bool, byte i_50_,
			byte i_51_, byte i_52_, byte i_53_, boolean bool_54_,
			boolean bool_55_, boolean bool_56_, boolean bool_57_,
			boolean bool_58_, byte i_59_, boolean bool_60_, boolean bool_61_,
			int i_62_);

	@Override
	final int method1777(final int i, final int i_63_) {
		return i | i_63_;
	}

	@Override
	final Class111 method1793() {
		return aClass111_3314;
	}

	@Override
	final Class332 method1758(final Class324 class324, final boolean bool) {
		final j var_j = new j(this, class324.anIntArray2718,
				class324.aByteArray2717, class324.aByteArray2723, 0,
				class324.anInt2722, class324.anInt2722, class324.anInt2720);
		var_j.method3740(class324.anInt2725, class324.anInt2721,
				class324.anInt2719, class324.anInt2724);
		return var_j;
	}

	private final native void wa(int i, int i_64_, int i_65_, int i_66_,
			int i_67_, int i_68_);

	@Override
	final native void ya();

	@Override
	final void method1795(final int i, final int i_69_, final int i_70_,
			final int i_71_, final int i_72_, final int i_73_) {
		wa(i, i_69_, i_70_, i_71_, i_72_, i_73_);
	}

	@Override
	final Class332 method1797(final int i, final int i_74_, final int i_75_,
			final int i_76_, final boolean bool) {
		return new j(this, i, i_74_, i_75_, i_76_, !bool);
	}

	@Override
	final native int XA();

	@Override
	final native void H(int i, int i_77_, int i_78_, int[] is);

	@Override
	final native void la();

	@Override
	final boolean method1780() {
		return true;
	}

	@Override
	final void a(final Class111 class111) {
		aClass111_3310 = class111;
		ma(((ja) class111).nativeid);
	}

	@Override
	final void method1820(final Class242 class242) {
		if (class242.aClass358_1850.method3885(true) != 0) {
			method1927(class242, false);
			method1930().method142(this, anIntArray3301, anIntArray3304,
					anIntArray3309, aShortArray3305,
					class242.aClass358_1850.method3885(true));
		}
	}

	private final native void FA();

	@Override
	final Class48 method1769(final Class48 class48, final Class48 class48_79_,
			final float f, final Class48 class48_80_) {
		return null;
	}

	@Override
	final boolean method1819() {
		return true;
	}

	@Override
	final native int JA(int i, int i_81_, int i_82_, int i_83_, int i_84_,
			int i_85_);

	@Override
	final native void U(int i, int i_86_, int i_87_, int i_88_, int i_89_);

	@Override
	final native void f(int i, int i_90_);

	@Override
	final za method1762(final int i) {
		final ya var_ya = new ya(this, i);
		aClass148_3299.method2419(var_ya, -20911);
		return var_ya;
	}

	@Override
	final native int[] Y();

	@Override
	final void method1778(final int i) {
		throw new IllegalStateException();
	}

	@Override
	final void method1812() {
		/* empty */
	}

	@Override
	final native void ZA(int i, float f, float f_91_, float f_92_, float f_93_,
			float f_94_);

	@Override
	final native void Q(int i, int i_95_, int i_96_, int i_97_, int i_98_,
			int i_99_, byte[] is, int i_100_, int i_101_);

	@Override
	final void method1773() {
		if (!aBoolean3298) {
			anAArray3317 = null;
			aP3307 = null;
			aYa3296 = null;
			aClass111_3314 = null;
			aClass377_3315.method3994(-116);
			for (ya var_ya = (ya) aClass148_3299.method2418(32); var_ya != null; var_ya = (ya) aClass148_3299
					.method2417(88)) {
				var_ya.ga();
			}
			aClass148_3299.method2422((byte) 47);
			FA();
			if (aBoolean3318) {
				Class18.method248(true, 43, false);
				aBoolean3318 = false;
			}
			g();
			Class192.method2653(-55);
			aBoolean3298 = true;
		}
	}

	@Override
	final Class43 method1804(final Class197 class197,
			final Class324[] class324s, final boolean bool) {
		final int[] is = new int[class324s.length];
		final int[] is_102_ = new int[class324s.length];
		boolean bool_103_ = false;
		for (int i = 0; i < class324s.length; i++) {
			is[i] = class324s[i].anInt2722;
			is_102_[i] = class324s[i].anInt2720;
			if (class324s[i].aByteArray2723 != null) {
				bool_103_ = true;
			}
		}
		if (bool) {
			if (bool_103_) {
				throw new IllegalArgumentException(
						"Cannot specify alpha with non-mono font unless someone writes it");
			}
			return new h(this, aYa3296, class197, class324s, null);
		}
		if (bool_103_) {
			throw new IllegalArgumentException(
					"Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new n(this, aYa3296, class197, class324s, null);
	}

	@Override
	final void method1750(final Canvas canvas) {
		if (canvas != null) {
			final p var_p = (p) aClass377_3315
					.method3990(canvas.hashCode(), -1);
			aP3307 = var_p;
			t(var_p);
		} else {
			aP3307 = null;
			t(null);
		}
	}

	@Override
	final native void ra(int i, int i_104_, int i_105_, int i_106_);

	private final boolean method1928(final short i) {
		synchronized (((ha) this).aD938) {
			if (!((ha) this).aD938.method8(-126, i)) {
				return false;
			}
			final TextureDefinition textureDefinition = ((ha) this).aD938.method11(i, -28755);
			if (textureDefinition == null) {
				return false;
			}
			int[] is;
			if (textureDefinition.anInt1818 != 2) {
				is = ((ha) this).aD938.method9(i, (byte) -126, 128, 0.7F, true,
						128);
			} else {
				is = ((ha) this).aD938.method13(121, 128, i, 0.7F, true, 128);
			}
			CA(i, is, textureDefinition.aShort1831, textureDefinition.anInt1818,
					textureDefinition.aByte1820, textureDefinition.aByte1816, textureDefinition.anInt1835,
					textureDefinition.aBoolean1822, textureDefinition.aByte1830,
					textureDefinition.aByte1829, textureDefinition.aByte1823, textureDefinition.aByte1837,
					textureDefinition.aBoolean1825, textureDefinition.aBoolean1833,
					textureDefinition.aBoolean1827, textureDefinition.aBoolean1826,
					textureDefinition.aBoolean1819, textureDefinition.aByte1832,
					textureDefinition.aBoolean1817, textureDefinition.aBoolean1824,
					textureDefinition.anInt1821);
		}
		return true;
	}

	@Override
	final native int i();

	@Override
	final native void HA(int i, int i_107_, int i_108_, int i_109_, int[] is);

	@Override
	final boolean method1767() {
		return false;
	}

	@Override
	final void method1774(final int i) {
		anAArray3317[i].method139();
	}

	@Override
	final boolean method1810() {
		return true;
	}

	@Override
	final void method1776() {
		method1750(aP3307.aCanvas3320);
	}

	@Override
	final int method1822() {
		return 4;
	}

	@Override
	final native void F(int i, int i_110_);

	@Override
	final void method1791(final float f, final float f_111_, final float f_112_) {
		/* empty */
	}

	@Override
	final Interface5 method1813(final int i, final int i_113_) {
		return method1739(i, i_113_, false);
	}

	private final boolean method1929(final short i) {
		synchronized (this) {
			final TextureDefinition textureDefinition = ((ha) this).aD938.method11(i, -28755);
			if (textureDefinition == null) {
				return false;
			}
			AA(i, textureDefinition.aShort1831, textureDefinition.anInt1818, textureDefinition.aByte1820,
					textureDefinition.aByte1816, textureDefinition.anInt1835,
					textureDefinition.aBoolean1822, textureDefinition.aByte1830,
					textureDefinition.aByte1829, textureDefinition.aByte1823, textureDefinition.aByte1837,
					textureDefinition.aBoolean1825, textureDefinition.aBoolean1833,
					textureDefinition.aBoolean1827, textureDefinition.aBoolean1826,
					textureDefinition.aBoolean1819, textureDefinition.aByte1832,
					textureDefinition.aBoolean1817, textureDefinition.aBoolean1824,
					textureDefinition.anInt1821);
		}
		return true;
	}

	@Override
	final void method1798(final int i) {
		anInt3312 = anInt3311 = i;
		if (anInt3316 > 1) {
			throw new IllegalStateException("No MT");
		}
		method1783(anInt3316);
		method1807(0);
	}

	private final native void d(int i);

	@Override
	final s a(final int i, final int i_114_, final int[][] is,
			final int[][] is_115_, final int i_116_, final int i_117_,
			final int i_118_) {
		return new t(this, aYa3296, i, i_114_, is, is_115_, i_116_, i_117_,
				i_118_);
	}

	private final native void t(p var_p);

	@Override
	final native void za(int i, int i_119_, int i_120_, int i_121_, int i_122_);

	@Override
	final native void da(int i, int i_123_, int i_124_, int[] is);

	@Override
	final native void EA(int i, int i_125_, int i_126_, int i_127_);

	@Override
	final void method1785(final Class242 class242, final int i) {
		method1927(class242, false);
		method1930().method142(this, anIntArray3301, anIntArray3304,
				anIntArray3309, aShortArray3305,
				class242.aClass358_1850.method3885(true));
	}

	@Override
	final boolean method1824() {
		return true;
	}

	private final native void Z(int i, int i_128_, int i_129_, int i_130_,
			int i_131_, int i_132_, aa var_aa, int i_133_, int i_134_);

	@Override
	final void method1751(final int i, final int i_135_, final int i_136_,
			final int i_137_, final int i_138_, final int i_139_,
			final int i_140_, final int i_141_, final int i_142_,
			final int i_143_, final int i_144_, final int i_145_,
			final int i_146_) {
		/* empty */
	}

	@Override
	final native void X(int i);

	@Override
	final native void L(int i, int i_147_, int i_148_);

	private final native void va(za var_za);

	@Override
	final Class111 method1821() {
		return new ja();
	}

	@Override
	protected final synchronized void finalize() {
		method1743(-1);
		if (nativeid != 0L) {
			Class192.method2654(false, this);
		}
	}

	@Override
	final Class332 method1739(final int i, final int i_149_, final boolean bool) {
		return new j(this, i, i_149_);
	}

	@Override
	final native int E();

	@Override
	final native int I();

	@Override
	final native int r(int i, int i_150_, int i_151_, int i_152_, int i_153_,
			int i_154_, int i_155_);

	@Override
	final void a(final int i, final int i_156_, final int i_157_,
			final int i_158_, final int i_159_, final int i_160_,
			final aa var_aa, final int i_161_, final int i_162_,
			final int i_163_, final int i_164_, final int i_165_) {
		/* empty */
	}

	@Override
	final boolean method1823() {
		return false;
	}

	@Override
	final void method1801(final int[] is) {
		final Dimension dimension = aP3307.aCanvas3320.getSize();
		is[0] = dimension.width;
		is[1] = dimension.height;
	}

	@Override
	final native void A(int i, aa var_aa, int i_166_, int i_167_);

	@Override
	final void method1779(final int i, final int i_168_, final int i_169_,
			final int i_170_, final int i_171_, final int i_172_) {
		U(i, i_168_, i_169_, i_171_, i_172_);
		U(i, i_168_ + i_170_ - 1, i_169_, i_171_, i_172_);
		P(i, i_168_ + 1, i_170_ - 1, i_171_, i_172_);
		P(i + i_169_ - 1, i_168_ + 1, i_170_ - 1, i_171_, i_172_);
	}

	@Override
	final void a(final za var_za) {
		aYa3296 = (ya) var_za;
		va(var_za);
	}

	private final native void n(long l, long l_173_);

	@Override
	final void method1783(final int i) {
		anInt3316 = i;
		anAArray3317 = new a[anInt3316];
		for (int i_174_ = 0; i_174_ < anInt3316; i_174_++) {
			anAArray3317[i_174_] = new a(this, anInt3312, anInt3311);
		}
	}

	@Override
	final void method1764(final int i, final int i_175_) throws Exception_Sub1 {
		if (aP3307 == null) {
			throw new IllegalStateException("off");
		}
		aP3307.method1447(i, i_175_);
	}

	@Override
	final void method1786(final Canvas canvas) {
		if (aP3307.aCanvas3320 == canvas) {
			method1750(null);
		}
		final p var_p = (p) aClass377_3315.method3990(canvas.hashCode(), -1);
		if (var_p != null) {
			var_p.method942(115);
			var_p.method1449();
		}
	}

	@Override
	final native int[] na(int i, int i_176_, int i_177_, int i_178_);

	@Override
	final void method1749(final boolean bool) {
		/* empty */
	}

	@Override
	final boolean method1768() {
		return false;
	}

	private final native void ma(long l);

	@Override
	final void method1756() {
		/* empty */
	}

	@Override
	final native void C(boolean bool);

	@Override
	final boolean method1788() {
		return true;
	}

	@Override
	final native void xa(float f);

	@Override
	final Class48 method1803(final int i, final int i_179_, final int i_180_,
			final int i_181_, final int i_182_, final int i_183_) {
		return null;
	}

	final a method1930() {
		for (int i = 0; i < anInt3316; i++) {
			if (anAArray3317[i].aRunnable3281 == Thread.currentThread()) {
				return anAArray3317[i];
			}
		}
		return null;
	}

	@Override
	final boolean method1747() {
		return true;
	}

	@Override
	final native void T(int i, int i_184_, int i_185_, int i_186_);

	@Override
	final void method1807(final int i) {
		anAArray3317[i].method141();
	}

	@Override
	public final native void w(boolean bool);

	@Override
	final Class111 method1752() {
		return aClass111_3310;
	}

	@Override
	final Class146 method1790(final Model model, final int i,
			final int i_187_, final int i_188_, final int i_189_) {
		return new i(this, aYa3296, model, i, i_187_, i_188_, i_189_);
	}

	@Override
	final Interface17 method1815(final Interface5 interface5,
			final Interface13 interface13) {
		return new wa(this, (j) interface5, (xa) interface13);
	}

	private final Object method1931() {
		return new ba(this);
	}

	@Override
	final void method1811(final int i, final int i_190_, final int i_191_,
			final int i_192_, final int i_193_, final int i_194_,
			final int i_195_, final int i_196_, final int i_197_) {
		/* empty */
	}

	@Override
	final native void aa(int i, int i_198_, int i_199_, int i_200_, int i_201_,
			int i_202_);

	@Override
	final void method1775(final Class48 class48) {
		/* empty */
	}

	@Override
	final boolean method1800() {
		return true;
	}

	@Override
	final void method1740(final Interface17 interface17) {
		final wa var_wa = (wa) interface17;
		n(var_wa.aJ3435.nativeid, var_wa.aXa3436.nativeid);
	}

	private final native void N(int i, int[] is, float[] fs);

	@Override
	final native void DA(int i, int i_203_, int i_204_, int i_205_);

	@Override
	final void method1741(final Canvas canvas, final int i, final int i_206_) {
		p var_p = (p) aClass377_3315.method3990(canvas.hashCode(), -1);
		if (var_p == null) {
			try {
				final Class var_class = Class.forName("java.awt.Canvas");
				final Method method = var_class.getMethod("setIgnoreRepaint",
						new Class[] { Boolean.TYPE });
				method.invoke(canvas, new Object[] { Boolean.TRUE });
			} catch (final Exception exception) {
				/* empty */
			}
			var_p = new p(this, canvas, i, i_206_);
			aClass377_3315.method3996(var_p, canvas.hashCode(), -1);
		} else if (var_p.anInt3319 != i || var_p.anInt3322 != i_206_) {
			var_p.method1448(canvas, i, i_206_);
		}
	}

	@Override
	final void method1817() {
		/* empty */
	}

	@Override
	final void method1782(final Canvas canvas, final int i, final int i_207_) {
		final p var_p = (p) aClass377_3315.method3990(canvas.hashCode(), -1);
		var_p.method1448(canvas, i, i_207_);
		if (canvas != null && canvas == aP3307.aCanvas3320) {
			method1750(canvas);
		}
	}

	@Override
	final boolean method1802() {
		return false;
	}

	@Override
	final void a(final int i, final int i_208_, final int i_209_,
			final int i_210_, final int i_211_, final int i_212_,
			final aa var_aa, final int i_213_, final int i_214_) {
		Z(i, i_208_, i_209_, i_210_, i_211_, i_212_, var_aa, i_213_, i_214_);
	}

	@Override
	final int c(final int i, final int i_215_) {
		final int i_216_ = i & 0xfffff;
		final int i_217_ = i_215_ & 0xfffff;
		return i_216_ & i_217_ ^ i_217_;
	}

	@Override
	final void method1816(final int i, final int i_218_, final int i_219_,
			final int i_220_, final int i_221_, final int i_222_,
			final int i_223_) {
		method1930().method138(this, i, i_218_, i_219_, i_220_, i_221_, i_222_,
				i_223_);
	}

	@Override
	final Class332 method1770(final int[] is, final int i, final int i_224_,
			final int i_225_, final int i_226_, final boolean bool) {
		return new j(this, is, i, i_224_, i_225_, i_226_, false);
	}

	@Override
	final native void b(int i, int i_227_, int i_228_, int i_229_, double d);

	@Override
	final native int M();

	@Override
	final void method1806(final int i) {
		Class192.method2656(0);
		d(i);
		for (ya var_ya = (ya) aClass148_3299.method2418(32); var_ya != null; var_ya = (ya) aClass148_3299
				.method2417(97)) {
			var_ya.r();
		}
	}

	@Override
	final void method1814() {
		/* empty */
	}

	private final void g() {
		System.gc();
		System.runFinalization();
		Class192.method2656(0);
	}

	static {
		aByteArray3300 = new byte[8191];
		anIntArray3309 = new int[8191];
		anIntArray3306 = anIntArray3297;
		aFloatArray3302 = new float[20];
		aShortArray3305 = new short[8191];
		anIntArray3313 = new int[6];
		aFloatArray3308 = aFloatArray3302;
		anIntArray3304 = new int[8191];
		anIntArray3303 = anIntArray3297;
	}
}
