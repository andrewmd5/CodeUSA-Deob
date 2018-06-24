/* ha - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Rectangle;

abstract class ha {
	static int anInt936;
	int anInt937;
	d aD938;
	static OutgoingOpcode aClass171_939 = new OutgoingOpcode(50, -1);
	static boolean aBoolean940 = false;
	static Class110 aClass110_941 = new Class110();
	static int[] anIntArray942 = new int[2];
	static int anInt943 = 0;

	abstract Class332 method1739(int i, int i_0_, boolean bool);

	abstract void method1740(Interface17 interface17);

	abstract void method1741(Canvas canvas, int i, int i_1_);

	static final synchronized ha method1742(byte i, int i_2_, Canvas canvas,
			d var_d, int i_3_, Class207 class207, int i_4_, int i_5_) {
		try {
			if ((i_4_ ^ 0xffffffff) == -1)
				return OutputStream_Sub1.method128(var_d, i_5_, i_3_, canvas,
						500);
			if (i_4_ == 2)
				return Class109
						.method1732(i_3_, (byte) 81, i_5_, canvas, var_d);
			if ((i_4_ ^ 0xffffffff) == -2)
				return Class110.method2087(canvas, 2, i_2_, var_d);
			if ((i_4_ ^ 0xffffffff) == -6)
				return Class60.method536(i_2_, class207, var_d, 0, canvas);
			if (i <= 35)
				aBoolean940 = true;
			if (i_4_ == 3)
				return Class214.method2784(54, i_2_, canvas, var_d, class207);
			throw new IllegalArgumentException("UM");
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ha.VJ(" + i + ','
					+ i_2_ + ',' + (canvas != null ? "{...}" : "null") + ','
					+ (var_d != null ? "{...}" : "null") + ',' + i_3_ + ','
					+ (class207 != null ? "{...}" : "null") + ',' + i_4_ + ','
					+ i_5_ + ')'));
		}
	}

	final void method1743(int i) {
		do {
			try {
				Class98_Sub10_Sub8.aBooleanArray5579[((ha) this).anInt937] = false;
				method1773();
				if (i == -1)
					break;
				H(24, 39, 35, null);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "ha.CK(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	abstract Interface13 method1744(int i, int i_6_);

	abstract s a(int i, int i_7_, int[][] is, int[][] is_8_, int i_9_,
			int i_10_, int i_11_);

	abstract void method1746(int i, int i_12_, int i_13_, int i_14_);

	abstract boolean method1747();

	abstract void U(int i, int i_15_, int i_16_, int i_17_, int i_18_);

	abstract void ra(int i, int i_19_, int i_20_, int i_21_);

	abstract void f(int i, int i_22_);

	abstract void C(boolean bool);

	final Class332 method1748(int i, int i_23_, int i_24_, int i_25_, int[] is,
			int i_26_) {
		try {
			if (i != -7962)
				return null;
			return method1770(is, i_23_, i_24_, i_26_, i_25_, true);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ha.WJ(" + i + ','
					+ i_23_ + ',' + i_24_ + ',' + i_25_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_26_ + ')'));
		}
	}

	abstract void method1749(boolean bool);

	abstract void method1750(Canvas canvas);

	abstract void DA(int i, int i_27_, int i_28_, int i_29_);

	abstract void method1751(int i, int i_30_, int i_31_, int i_32_, int i_33_,
			int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_,
			int i_40_, int i_41_);

	abstract int XA();

	abstract Class111 method1752();

	abstract void F(int i, int i_42_);

	final void method1753(int i, int i_43_, int i_44_, int i_45_, int i_46_) {
		try {
			if (i == 22294)
				U(i_46_, i_45_, i_43_, i_44_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ha.EK(" + i + ','
					+ i_43_ + ',' + i_44_ + ',' + i_45_ + ',' + i_46_ + ')'));
		}
	}

	final void method1754(int i) throws Exception_Sub1 {
		try {
			method1764(0, 0);
			int i_47_ = 60 / ((i - -67) / 59);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ha.FK(" + i + ')');
		}
	}

	final void method1755(int i, int i_48_, int i_49_, int i_50_, int i_51_) {
		try {
			P(i_49_, i_48_, i_51_, i_50_, 1);
			if (i != 8479)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ha.TJ(" + i + ','
					+ i_48_ + ',' + i_49_ + ',' + i_50_ + ',' + i_51_ + ')'));
		}
	}

	abstract void method1756();

	abstract int r(int i, int i_52_, int i_53_, int i_54_, int i_55_,
			int i_56_, int i_57_);

	final void method1757(int i, int i_58_, int i_59_, int i_60_, int i_61_) {
		try {
			if (i_60_ <= 19)
				ZA(-128, 0.4222986F, -0.8555362F, 0.64319474F, 0.16042754F,
						-0.00591929F);
			za(i_61_, i_58_, i, i_59_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ha.RJ(" + i + ','
					+ i_58_ + ',' + i_59_ + ',' + i_60_ + ',' + i_61_ + ')'));
		}
	}

	abstract void A(int i, aa var_aa, int i_62_, int i_63_);

	abstract Class332 method1758(Class324 class324, boolean bool);

	abstract void a(Class111 class111);

	final void method1760(int i, int i_64_, int i_65_, int i_66_, byte i_67_,
			int i_68_) {
		do {
			try {
				aa(i_68_, i_65_, i, i_64_, i_66_, 1);
				if (i_67_ == -66)
					break;
				aClass171_939 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("ha.HK(" + i
						+ ',' + i_64_ + ',' + i_65_ + ',' + i_66_ + ',' + i_67_
						+ ',' + i_68_ + ')'));
			}
			break;
		} while (false);
	}

	abstract void method1761(boolean bool);

	abstract void ya();

	abstract za method1762(int i);

	final void method1763(int i, Class332 class332) {
		try {
			if (i > -56)
				K(null);
			method1740(method1815(class332,
					method1744(class332.method3734(), class332.method3731())));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ha.UJ(" + i + ','
					+ (class332 != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void method1764(int i, int i_69_) throws Exception_Sub1;

	abstract Class98_Sub5 method1765(int i, int i_70_, int i_71_, int i_72_,
			int i_73_, float f);

	protected void finalize() {
		try {
			method1743(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					"ha.finalize(" + ')');
		}
	}

	abstract boolean method1766();

	abstract boolean method1767();

	abstract boolean method1768();

	abstract Class48 method1769(Class48 class48, Class48 class48_74_, float f,
			Class48 class48_75_);

	abstract Class332 method1770(int[] is, int i, int i_76_, int i_77_,
			int i_78_, boolean bool);

	abstract void ZA(int i, float f, float f_79_, float f_80_, float f_81_,
			float f_82_);

	abstract boolean method1771();

	abstract aa method1772(int i, int i_83_, int[] is, int[] is_84_);

	abstract void method1773();

	abstract void method1774(int i);

	abstract void T(int i, int i_85_, int i_86_, int i_87_);

	abstract void P(int i, int i_88_, int i_89_, int i_90_, int i_91_);

	abstract void method1775(Class48 class48);

	abstract void method1776();

	abstract int method1777(int i, int i_92_);

	abstract void method1778(int i);

	abstract void method1779(int i, int i_93_, int i_94_, int i_95_, int i_96_,
			int i_97_);

	abstract boolean method1780();

	final void method1781(boolean bool, int i, int i_98_, int i_99_,
			int i_100_, int i_101_) {
		try {
			method1779(i_100_, i_101_, i_98_, i, i_99_, 1);
			if (bool != true)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ha.SJ(" + bool
					+ ',' + i + ',' + i_98_ + ',' + i_99_ + ',' + i_100_ + ','
					+ i_101_ + ')'));
		}
	}

	abstract void method1782(Canvas canvas, int i, int i_102_);

	abstract void method1783(int i);

	abstract int c(int i, int i_103_);

	abstract void method1785(Class242 class242, int i);

	abstract void K(int[] is);

	ha(d var_d) {
		try {
			((ha) this).aD938 = var_d;
			int i = -1;
			for (int i_104_ = 0; (i_104_ ^ 0xffffffff) > -9; i_104_++) {
				if (!Class98_Sub10_Sub8.aBooleanArray5579[i_104_]) {
					Class98_Sub10_Sub8.aBooleanArray5579[i_104_] = true;
					i = i_104_;
					break;
				}
			}
			if ((i ^ 0xffffffff) == 0)
				throw new IllegalStateException("NFTI");
			((ha) this).anInt937 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ha.<init>("
					+ (var_d != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void method1786(Canvas canvas);

	abstract int i();

	public static void method1787(boolean bool) {
		try {
			aClass110_941 = null;
			anIntArray942 = null;
			if (bool != false)
				aClass171_939 = null;
			aClass171_939 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "ha.DK(" + bool
					+ ')');
		}
	}

	abstract void GA(int i);

	abstract int JA(int i, int i_105_, int i_106_, int i_107_, int i_108_,
			int i_109_);

	abstract boolean method1788();

	final void method1789(int i, int i_110_, int i_111_, int i_112_,
			int i_113_, int i_114_) {
		try {
			if (i_113_ != -10550)
				method1825();
			method1795(i_114_, i, i_112_, i_111_, i_110_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ha.GK(" + i + ','
					+ i_110_ + ',' + i_111_ + ',' + i_112_ + ',' + i_113_ + ','
					+ i_114_ + ')'));
		}
	}

	abstract void la();

	abstract AbstractModel method1790(Model model, int i, int i_115_,
			int i_116_, int i_117_);

	abstract void method1791(float f, float f_118_, float f_119_);

	abstract void a(int i, int i_120_, int i_121_, int i_122_, int i_123_,
			int i_124_, aa var_aa, int i_125_, int i_126_, int i_127_,
			int i_128_, int i_129_);

	abstract Class111 method1793();

	final void method1794(Rectangle[] rectangles, int i, int i_130_)
			throws Exception_Sub1 {
		try {
			if (i_130_ != 27179)
				aClass110_941 = null;
			a(rectangles, i, 0, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ha.AK("
					+ (rectangles != null ? "{...}" : "null") + ',' + i + ','
					+ i_130_ + ')'));
		}
	}

	abstract void method1795(int i, int i_131_, int i_132_, int i_133_,
			int i_134_, int i_135_);

	static final Class337 method1796(int i, ByteBuffer class98_sub22) {
		try {
			int i_136_ = class98_sub22.readUnsignedShort((byte) 127);
			Class63 class63 = (Class98_Sub46_Sub13_Sub1.method1595(112)[class98_sub22
					.readUnsignedByte((byte) 123)]);
			if (i != 9342)
				anInt936 = -127;
			Class110 class110 = (Class331.method3723(256)[class98_sub22
					.readUnsignedByte((byte) -127)]);
			int i_137_ = class98_sub22.readUShort(false);
			int i_138_ = class98_sub22.readUShort(false);
			return new Class337(i_136_, class63, class110, i_137_, i_138_);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("ha.BK(" + i + ','
					+ (class98_sub22 != null ? "{...}" : "null") + ')'));
		}
	}

	abstract Class332 method1797(int i, int i_139_, int i_140_, int i_141_,
			boolean bool);

	abstract int E();

	abstract void method1798(int i);

	abstract void pa();

	abstract Class62 method1799();

	abstract boolean method1800();

	abstract void method1801(int[] is);

	abstract void za(int i, int i_142_, int i_143_, int i_144_, int i_145_);

	abstract void da(int i, int i_146_, int i_147_, int[] is);

	abstract boolean method1802();

	abstract Class48 method1803(int i, int i_148_, int i_149_, int i_150_,
			int i_151_, int i_152_);

	abstract Class43 method1804(Class197 class197, Class324[] class324s,
			boolean bool);

	abstract void KA(int i, int i_153_, int i_154_, int i_155_);

	abstract void EA(int i, int i_156_, int i_157_, int i_158_);

	abstract void b(int i, int i_159_, int i_160_, int i_161_, double d);

	abstract void a(Rectangle[] rectangles, int i, int i_162_, int i_163_)
			throws Exception_Sub1;

	abstract void method1806(int i);

	abstract void method1807(int i);

	abstract void a(za var_za);

	abstract void a(int i, int i_164_, int i_165_, int i_166_, int i_167_,
			int i_168_, aa var_aa, int i_169_, int i_170_);

	abstract void xa(float f);

	abstract boolean method1810();

	abstract void HA(int i, int i_171_, int i_172_, int i_173_, int[] is);

	abstract void method1811(int i, int i_174_, int i_175_, int i_176_,
			int i_177_, int i_178_, int i_179_, int i_180_, int i_181_);

	abstract void X(int i);

	abstract void method1812();

	abstract Interface5 method1813(int i, int i_182_);

	abstract void method1814();

	abstract void L(int i, int i_183_, int i_184_);

	abstract Interface17 method1815(Interface5 interface5,
			Interface13 interface13);

	abstract void Q(int i, int i_185_, int i_186_, int i_187_, int i_188_,
			int i_189_, byte[] is, int i_190_, int i_191_);

	abstract void method1816(int i, int i_192_, int i_193_, int i_194_,
			int i_195_, int i_196_, int i_197_);

	abstract int M();

	abstract void aa(int i, int i_198_, int i_199_, int i_200_, int i_201_,
			int i_202_);

	abstract void method1817();

	abstract void method1818(int i, Class98_Sub5[] class98_sub5s);

	abstract boolean method1819();

	abstract void H(int i, int i_203_, int i_204_, int[] is);

	abstract void method1820(Class242 class242);

	abstract int[] Y();

	abstract Class111 method1821();

	abstract int method1822();

	abstract boolean method1823();

	abstract boolean method1824();

	abstract void method1825();

	abstract int I();

	abstract int[] na(int i, int i_205_, int i_206_, int i_207_);
}
