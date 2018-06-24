/* Class98_Sub31_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98_Sub31_Sub3 extends Class98_Sub31 {
	private final Class148 aClass148_5854 = new Class148();
	private final Class148 aClass148_5855 = new Class148();
	private int anInt5856;
	private int anInt5857 = -1;

	final synchronized void method1371(final Class98_Sub31 class98_sub31) {
		aClass148_5854.method2423(-2, class98_sub31);
	}

	@Override
	final synchronized void method1325(final int[] is, int i, int i_0_) {
		do {
			if (anInt5857 < 0) {
				method1376(is, i, i_0_);
				break;
			}
			if (anInt5856 + i_0_ < anInt5857) {
				anInt5856 += i_0_;
				method1376(is, i, i_0_);
				break;
			}
			final int i_1_ = anInt5857 - anInt5856;
			method1376(is, i, i_1_);
			i += i_1_;
			i_0_ -= i_1_;
			anInt5856 += i_1_;
			method1375();
			final Class98_Sub38 class98_sub38 = (Class98_Sub38) aClass148_5855
					.method2418(32);
			synchronized (class98_sub38) {
				final int i_2_ = class98_sub38.method1466(this);
				if (i_2_ < 0) {
					class98_sub38.anInt4186 = 0;
					method1378(class98_sub38);
				} else {
					class98_sub38.anInt4186 = i_2_;
					method1372(((Node) class98_sub38).aClass98_836,
							class98_sub38);
				}
			}
		} while (i_0_ != 0);
	}

	private final void method1372(Node node,
			final Class98_Sub38 class98_sub38) {
		for (/**/; (node != aClass148_5855.aClass98_1198 && (((Class98_Sub38) node).anInt4186 <= class98_sub38.anInt4186)); node = node.aClass98_836) {
			/* empty */
		}
		Class279.method3322(node, class98_sub38, (byte) 24);
		anInt5857 = ((Class98_Sub38) (aClass148_5855.aClass98_1198.aClass98_836)).anInt4186;
	}

	private final void method1373(final int i) {
		for (Class98_Sub31 class98_sub31 = (Class98_Sub31) aClass148_5854
				.method2418(32); class98_sub31 != null; class98_sub31 = (Class98_Sub31) aClass148_5854
				.method2417(114)) {
			class98_sub31.method1321(i);
		}
	}

	@Override
	final synchronized void method1321(int i) {
		do {
			if (anInt5857 < 0) {
				method1373(i);
				break;
			}
			if (anInt5856 + i < anInt5857) {
				anInt5856 += i;
				method1373(i);
				break;
			}
			final int i_3_ = anInt5857 - anInt5856;
			method1373(i_3_);
			i -= i_3_;
			anInt5856 += i_3_;
			method1375();
			final Class98_Sub38 class98_sub38 = (Class98_Sub38) aClass148_5855
					.method2418(32);
			synchronized (class98_sub38) {
				final int i_4_ = class98_sub38.method1466(this);
				if (i_4_ < 0) {
					class98_sub38.anInt4186 = 0;
					method1378(class98_sub38);
				} else {
					class98_sub38.anInt4186 = i_4_;
					method1372(((Node) class98_sub38).aClass98_836,
							class98_sub38);
				}
			}
		} while (i != 0);
	}

	final synchronized void method1374(final Class98_Sub31 class98_sub31) {
		class98_sub31.method942(44);
	}

	private final void method1375() {
		if (anInt5856 > 0) {
			for (Class98_Sub38 class98_sub38 = (Class98_Sub38) aClass148_5855
					.method2418(32); class98_sub38 != null; class98_sub38 = (Class98_Sub38) aClass148_5855
					.method2417(104)) {
				class98_sub38.anInt4186 -= anInt5856;
			}
			anInt5857 -= anInt5856;
			anInt5856 = 0;
		}
	}

	@Override
	final Class98_Sub31 method1327() {
		return (Class98_Sub31) aClass148_5854.method2417(106);
	}

	@Override
	final int method1326() {
		return 0;
	}

	private final void method1376(final int[] is, final int i, final int i_5_) {
		for (Class98_Sub31 class98_sub31 = (Class98_Sub31) aClass148_5854
				.method2418(32); class98_sub31 != null; class98_sub31 = (Class98_Sub31) aClass148_5854
				.method2417(113)) {
			class98_sub31.method1324(is, i, i_5_);
		}
	}

	final synchronized int method1377() {
		return aClass148_5854.method2424(0);
	}

	@Override
	final Class98_Sub31 method1322() {
		return (Class98_Sub31) aClass148_5854.method2418(32);
	}

	private final void method1378(final Class98_Sub38 class98_sub38) {
		class98_sub38.method942(65);
		class98_sub38.method1465();
		final Node node = (aClass148_5855.aClass98_1198.aClass98_836);
		if (node == aClass148_5855.aClass98_1198) {
			anInt5857 = -1;
		} else {
			anInt5857 = ((Class98_Sub38) node).anInt4186;
		}
	}

	public Class98_Sub31_Sub3() {
		anInt5856 = 0;
	}
}
