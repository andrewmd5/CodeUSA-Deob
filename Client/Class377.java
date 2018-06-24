/* Class377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class377 {
	static int[] anIntArray3178;
	int anInt3179;
	Node[] aClass98Array3180;
	private long aLong3181;
	static byte[][] aByteArrayArray3182;
	static int anInt3183;
	private Node aClass98_3184;
	private Node aClass98_3185;
	private int anInt3186 = 0;

	final Node method3990(long l, int i) {
		try {
			aLong3181 = l;
			Node node = (((Class377) this).aClass98Array3180[(int) (l & (long) (((Class377) this).anInt3179 + i))]);
			for (aClass98_3184 = ((Node) node).aClass98_836; aClass98_3184 != node; aClass98_3184 = ((Node) aClass98_3184).aClass98_836) {
				if ((l ^ 0xffffffffffffffffL) == (((Node) aClass98_3184).aLong832 ^ 0xffffffffffffffffL)) {
					Node class98_0_ = aClass98_3184;
					aClass98_3184 = ((Node) aClass98_3184).aClass98_836;
					return class98_0_;
				}
			}
			aClass98_3184 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wr.J(" + l + ','
					+ i + ')');
		}
	}

	static final int method3991(Class293 class293, int i, int i_1_) {
		try {
			if (i >= -23)
				method3991(null, -63, -59);
			if (!client.method116(class293).method1666((byte) -72, i_1_)
					&& ((Class293) class293).anObjectArray2329 == null)
				return -1;
			if (((Class293) class293).anIntArray2326 != null
					&& ((((Class293) class293).anIntArray2326.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff)))
				return ((Class293) class293).anIntArray2326[i_1_];
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("wr.K("
					+ (class293 != null ? "{...}" : "null") + ',' + i + ','
					+ i_1_ + ')'));
		}
	}

	final int method3992(Node[] class98s, byte i) {
		try {
			int i_2_ = 0;
			for (int i_3_ = 0; ((Class377) this).anInt3179 > i_3_; i_3_++) {
				Node node = ((Class377) this).aClass98Array3180[i_3_];
				for (Node class98_4_ = ((Node) node).aClass98_836; node != class98_4_; class98_4_ = ((Node) class98_4_).aClass98_836)
					class98s[i_2_++] = class98_4_;
			}
			if (i != 74)
				method4000((byte) 120);
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("wr.B("
					+ (class98s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final Node method3993(int i) {
		try {
			if (aClass98_3184 == null)
				return null;
			for (Node node = (((Class377) this).aClass98Array3180[(int) ((long) (-1 + ((Class377) this).anInt3179) & aLong3181)]); aClass98_3184 != node; aClass98_3184 = ((Node) aClass98_3184).aClass98_836) {
				if ((aLong3181 ^ 0xffffffffffffffffL) == (((Node) aClass98_3184).aLong832 ^ 0xffffffffffffffffL)) {
					Node class98_5_ = aClass98_3184;
					aClass98_3184 = ((Node) aClass98_3184).aClass98_836;
					return class98_5_;
				}
			}
			aClass98_3184 = null;
			int i_6_ = -38 / ((70 - i) / 48);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wr.D(" + i + ')');
		}
	}

	final void method3994(int i) {
		try {
			for (int i_7_ = 0; ((((Class377) this).anInt3179 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
				Node node = ((Class377) this).aClass98Array3180[i_7_];
				for (;;) {
					Node class98_8_ = ((Node) node).aClass98_836;
					if (class98_8_ == node)
						break;
					class98_8_.method942(79);
				}
			}
			if (i < -59) {
				aClass98_3184 = null;
				aClass98_3185 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wr.H(" + i + ')');
		}
	}

	final Node method3995(int i) {
		try {
			if ((anInt3186 ^ 0xffffffff) < i
					&& (((Class377) this).aClass98Array3180[anInt3186 - 1] != aClass98_3185)) {
				Node node = aClass98_3185;
				aClass98_3185 = ((Node) node).aClass98_836;
				return node;
			}
			while ((anInt3186 ^ 0xffffffff) > (((Class377) this).anInt3179 ^ 0xffffffff)) {
				Node node = (((Node) ((Class377) this).aClass98Array3180[anInt3186++]).aClass98_836);
				if (node != ((Class377) this).aClass98Array3180[anInt3186
						+ -1]) {
					aClass98_3185 = ((Node) node).aClass98_836;
					return node;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wr.F(" + i + ')');
		}
	}

	final void method3996(Node node, long l, int i) {
		try {
			if (((Node) node).aClass98_833 != null)
				node.method942(58);
			Node class98_9_ = (((Class377) this).aClass98Array3180[(int) (l & (long) (i + ((Class377) this).anInt3179))]);
			((Node) node).aClass98_836 = class98_9_;
			((Node) node).aClass98_833 = ((Node) class98_9_).aClass98_833;
			((Node) ((Node) node).aClass98_833).aClass98_836 = node;
			((Node) node).aLong832 = l;
			((Node) ((Node) node).aClass98_836).aClass98_833 = node;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					("wr.G(" + (node != null ? "{...}" : "null") + ',' + l
							+ ',' + i + ')'));
		}
	}

	Class377(int i) {
		try {
			((Class377) this).anInt3179 = i;
			((Class377) this).aClass98Array3180 = new Node[i];
			for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i ^ 0xffffffff); i_10_++) {
				Node node = (((Class377) this).aClass98Array3180[i_10_] = new Node());
				((Node) node).aClass98_833 = node;
				((Node) node).aClass98_836 = node;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wr.<init>(" + i
					+ ')');
		}
	}

	final int method3997(byte i) {
		try {
			if (i <= 40)
				aByteArrayArray3182 = null;
			return ((Class377) this).anInt3179;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wr.I(" + i + ')');
		}
	}

	final Node method3998(int i) {
		try {
			if (i <= 93)
				method3992(null, (byte) 45);
			anInt3186 = 0;
			return method3995(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wr.C(" + i + ')');
		}
	}

	final int method3999(byte i) {
		try {
			int i_11_ = 0;
			for (int i_12_ = 0; ((((Class377) this).anInt3179 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
				Node node = ((Class377) this).aClass98Array3180[i_12_];
				for (Node class98_13_ = ((Node) node).aClass98_836; node != class98_13_; class98_13_ = ((Node) class98_13_).aClass98_836)
					i_11_++;
			}
			if (i != -6)
				anIntArray3178 = null;
			return i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wr.A(" + i + ')');
		}
	}

	public static void method4000(byte i) {
		try {
			aByteArrayArray3182 = null;
			if (i > -62)
				anInt3183 = -27;
			anIntArray3178 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "wr.E(" + i + ')');
		}
	}
}
