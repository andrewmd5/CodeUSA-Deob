/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class Class85 {
	static int anInt638;
	/* synthetic */static Class aClass639;

	static final boolean method837(int i, int i_0_) { // Interfaces
		try {
			if (Class246_Sub3_Sub3_Sub1.aBooleanArray6256[i])
				return true;
			if (!Class98_Sub17_Sub1.aClass207_5783.method2756(false, i))
				return false;
			int i_1_ = Class98_Sub17_Sub1.aClass207_5783.method2761(0, i);
			if ((i_1_ ^ 0xffffffff) == -1) {
				Class246_Sub3_Sub3_Sub1.aBooleanArray6256[i] = true;
				return true;
			}
			if (Class159.aClass293ArrayArray1252[i] == null)
				Class159.aClass293ArrayArray1252[i] = new Class293[i_1_];
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
				if (Class159.aClass293ArrayArray1252[i][i_2_] == null) {
					byte[] is = Class98_Sub17_Sub1.aClass207_5783.method2745(
							i_2_, i, false);
					if (is != null) {
						Class293 class293 = (Class159.aClass293ArrayArray1252[i][i_2_] = new Class293());
						((Class293) class293).anInt2248 = (i << -1849090224)
								- -i_2_;
						if (is[0] != -1)
							throw new IllegalStateException("if1");
						class293.method3457(new ByteBuffer(is), -947);
					}
				}
			}
			Class246_Sub3_Sub3_Sub1.aBooleanArray6256[i] = true;
			if (i_0_ < 1)
				method838(null);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "fha.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method838(Class84 class84) {
		Class98_Sub10_Sub27.aClass84_5692 = class84;
	}

	static final void method839(int i) {
		do {
			try {
				try {
					Method method = (aClass639 != null ? aClass639
							: (aClass639 = method840("java.lang.Runtime")))
							.getMethod("availableProcessors", new Class[0]);
					if (method != null) {
						try {
							Runtime runtime = Runtime.getRuntime();
							Integer integer = (Integer) method.invoke(runtime,
									null);
							Class98_Sub46_Sub19.anInt6065 = integer.intValue();
						} catch (Throwable throwable) {
							/* empty */
						}
					}
					if (i == 12345)
						break;
					anInt638 = 1;
				} catch (Exception exception) {
					/* empty */
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "fha.B(" + i
						+ ')');
			}
		} while (false);
	}

	Class85(int i, int i_3_) {
		/* empty */
	}

	/* synthetic */static Class method840(String string) {
		try {
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
