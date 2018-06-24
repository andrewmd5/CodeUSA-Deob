/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class148 {
	static Class314 aClass314_1195;
	static int[] anIntArray1196 = new int[32];
	static double aDouble1197 = -1.0;
	Node aClass98_1198 = new Node();
	private Node aClass98_1199;

	public static void method2415(boolean bool) {
		do {
			try {
				aClass314_1195 = null;
				anIntArray1196 = null;
				if (bool == false)
					break;
				method2415(false);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "kba.K(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final Node method2416(byte i) {
		try {
			int i_0_ = -103 % ((i - -66) / 47);
			Node node = aClass98_1199;
			if (node == ((Class148) this).aClass98_1198) {
				aClass98_1199 = null;
				return null;
			}
			aClass98_1199 = ((Node) node).aClass98_833;
			return node;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kba.C(" + i + ')');
		}
	}

	final Node method2417(int i) {
		try {
			Node node = aClass98_1199;
			if (((Class148) this).aClass98_1198 == node) {
				aClass98_1199 = null;
				return null;
			}
			aClass98_1199 = ((Node) node).aClass98_836;
			return node;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kba.F(" + i + ')');
		}
	}

	final Node method2418(int i) {
		try {
			if (i != 32)
				return null;
			Node node = ((Node) ((Class148) this).aClass98_1198).aClass98_836;
			if (((Class148) this).aClass98_1198 == node) {
				aClass98_1199 = null;
				return null;
			}
			aClass98_1199 = ((Node) node).aClass98_836;
			return node;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kba.D(" + i + ')');
		}
	}

	final void method2419(Node node, int i) {
		do {
			try {
				if (((Node) node).aClass98_833 != null)
					node.method942(71);
				((Node) node).aClass98_833 = ((Node) ((Class148) this).aClass98_1198).aClass98_833;
				((Node) node).aClass98_836 = ((Class148) this).aClass98_1198;
				((Node) ((Node) node).aClass98_833).aClass98_836 = node;
				((Node) ((Node) node).aClass98_836).aClass98_833 = node;
				if (i == -20911)
					break;
				((Class148) this).aClass98_1198 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27
						.printError(runtimeexception, ("kba.B("
								+ (node != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2420(int i) {
		try {
			if (i > -123)
				anIntArray1196 = null;
			if (((Class148) this).aClass98_1198 != ((Node) ((Class148) this).aClass98_1198).aClass98_836)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kba.L(" + i + ')');
		}
	}

	final Node method2421(int i) {
		try {
			Node node = ((Node) ((Class148) this).aClass98_1198).aClass98_836;
			if (((Class148) this).aClass98_1198 == node)
				return null;
			node.method942(90);
			if (i != 6494)
				aClass98_1199 = null;
			return node;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kba.J(" + i + ')');
		}
	}

	final void method2422(byte i) {
		do {
			try {
				for (;;) {
					Node node = (((Node) ((Class148) this).aClass98_1198).aClass98_836);
					if (node == ((Class148) this).aClass98_1198)
						break;
					node.method942(87);
				}
				aClass98_1199 = null;
				if (i == 47)
					break;
				method2429(-56, -39);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, "kba.G(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final void method2423(int i, Node node) {
		do {
			try {
				if (((Node) node).aClass98_833 != null)
					node.method942(100);
				((Node) node).aClass98_833 = ((Class148) this).aClass98_1198;
				((Node) node).aClass98_836 = ((Node) ((Class148) this).aClass98_1198).aClass98_836;
				((Node) ((Node) node).aClass98_833).aClass98_836 = node;
				((Node) ((Node) node).aClass98_836).aClass98_833 = node;
				if (i == -2)
					break;
				method2427(100);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("kba.E(" + i
						+ ',' + (node != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int method2424(int i) {
		try {
			int i_1_ = i;
			for (Node node = (((Node) ((Class148) this).aClass98_1198).aClass98_836); ((Class148) this).aClass98_1198 != node; node = ((Node) node).aClass98_836)
				i_1_++;
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kba.M(" + i + ')');
		}
	}

	final void method2425(Class148 class148_2_, int i) {
		try {
			int i_3_ = -55 % ((11 - i) / 57);
			method2426(class148_2_,
					(((Node) ((Class148) this).aClass98_1198).aClass98_836),
					(byte) -123);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, ("kba.N("
							+ (class148_2_ != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	private final void method2426(Class148 class148_4_, Node node, byte i) {
		do {
			try {
				if (i > -57)
					method2421(-21);
				Node class98_5_ = ((Node) ((Class148) this).aClass98_1198).aClass98_833;
				((Node) ((Class148) this).aClass98_1198).aClass98_833 = ((Node) node).aClass98_833;
				((Node) ((Node) node).aClass98_833).aClass98_836 = ((Class148) this).aClass98_1198;
				if (node == ((Class148) this).aClass98_1198)
					break;
				((Node) node).aClass98_833 = (((Node) ((Class148) class148_4_).aClass98_1198).aClass98_833);
				((Node) ((Node) node).aClass98_833).aClass98_836 = node;
				((Node) ((Class148) class148_4_).aClass98_1198).aClass98_833 = class98_5_;
				((Node) class98_5_).aClass98_836 = ((Class148) class148_4_).aClass98_1198;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27
						.printError(runtimeexception, ("kba.O("
								+ (class148_4_ != null ? "{...}" : "null")
								+ ',' + (node != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final Node method2427(int i) {
		try {
			if (i > -39)
				return null;
			Node node = ((Node) ((Class148) this).aClass98_1198).aClass98_833;
			if (((Class148) this).aClass98_1198 == node) {
				aClass98_1199 = null;
				return null;
			}
			aClass98_1199 = ((Node) node).aClass98_833;
			return node;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kba.H(" + i + ')');
		}
	}

	static final void method2428(Class98_Sub33 class98_sub33, boolean bool,
			int i) {
		do {
			try {
				if (i != 15697)
					aClass314_1195 = null;
				if (((Class98_Sub33) class98_sub33).aBoolean4124) {
					if (((Class98_Sub33) class98_sub33).anInt4119 < 0
							|| Class358
									.method3889(
											(((Class98_Sub33) class98_sub33).anInt4115),
											(((Class98_Sub33) class98_sub33).anInt4119),
											false)) {
						if (!bool)
							Canvas_Sub1.method119(
									((Class98_Sub33) class98_sub33).anInt4119,
									((Class98_Sub33) class98_sub33).anInt4113,
									((Class98_Sub33) class98_sub33).anInt4118,
									((Class98_Sub33) class98_sub33).anInt4121,
									((Class98_Sub33) class98_sub33).anInt4116,
									i ^ ~0x3d50,
									((Class98_Sub33) class98_sub33).anInt4112,
									-1,
									((Class98_Sub33) class98_sub33).anInt4115);
						else
							Class64_Sub13.method601(null,
									((Class98_Sub33) class98_sub33).anInt4113,
									((Class98_Sub33) class98_sub33).anInt4116,
									((Class98_Sub33) class98_sub33).anInt4112,
									((Class98_Sub33) class98_sub33).anInt4118,
									6093);
						class98_sub33.method942(109);
					}
				} else {
					if (!((Class98_Sub33) class98_sub33).aBoolean4123
							|| ((Class98_Sub33) class98_sub33).anInt4112 < 1
							|| (((Class98_Sub33) class98_sub33).anInt4113 ^ 0xffffffff) > -2
							|| (Class165.anInt1276 - 2 < ((Class98_Sub33) class98_sub33).anInt4112)
							|| ((Class98_Sub10_Sub7.anInt5572 + -2 ^ 0xffffffff) > (((Class98_Sub33) class98_sub33).anInt4113 ^ 0xffffffff)))
						break;
					if ((((Class98_Sub33) class98_sub33).anInt4114 ^ 0xffffffff) > -1
							|| Class358
									.method3889(
											(((Class98_Sub33) class98_sub33).anInt4122),
											(((Class98_Sub33) class98_sub33).anInt4114),
											false)) {
						if (!bool)
							Canvas_Sub1.method119(
									((Class98_Sub33) class98_sub33).anInt4114,
									((Class98_Sub33) class98_sub33).anInt4113,
									((Class98_Sub33) class98_sub33).anInt4118,
									((Class98_Sub33) class98_sub33).anInt4120,
									((Class98_Sub33) class98_sub33).anInt4116,
									-2,
									((Class98_Sub33) class98_sub33).anInt4112,
									-1,
									((Class98_Sub33) class98_sub33).anInt4122);
						else
							Class64_Sub13
									.method601(
											(((Class98_Sub33) class98_sub33).aClass185_4125),
											((Class98_Sub33) class98_sub33).anInt4113,
											((Class98_Sub33) class98_sub33).anInt4116,
											((Class98_Sub33) class98_sub33).anInt4112,
											((Class98_Sub33) class98_sub33).anInt4118,
											6093);
						((Class98_Sub33) class98_sub33).aBoolean4123 = false;
						if (!bool
								&& (((Class98_Sub33) class98_sub33).anInt4119 == ((Class98_Sub33) class98_sub33).anInt4114)
								&& ((Class98_Sub33) class98_sub33).anInt4119 == -1)
							class98_sub33.method942(45);
						else {
							if (bool
									|| ((((Class98_Sub33) class98_sub33).anInt4114 ^ 0xffffffff) != ((((Class98_Sub33) class98_sub33).anInt4119) ^ 0xffffffff))
									|| (((Class98_Sub33) class98_sub33).anInt4121 != (((Class98_Sub33) class98_sub33).anInt4120))
									|| ((((Class98_Sub33) class98_sub33).anInt4115 ^ 0xffffffff) != ((((Class98_Sub33) class98_sub33).anInt4122) ^ 0xffffffff)))
								break;
							class98_sub33.method942(86);
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.printError(runtimeexception, ("kba.A("
						+ (class98_sub33 != null ? "{...}" : "null") + ','
						+ bool + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method2429(int i, int i_6_) {
		try {
			Class105.anInt3415 = i_6_;
			r_Sub1.aClass79_6321.method794(119);
			int i_7_ = -38 % ((57 - i) / 35);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "kba.I(" + i + ','
					+ i_6_ + ')');
		}
	}

	public Class148() {
		try {
			((Node) ((Class148) this).aClass98_1198).aClass98_833 = ((Class148) this).aClass98_1198;
			((Node) ((Class148) this).aClass98_1198).aClass98_836 = ((Class148) this).aClass98_1198;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27
					.printError(runtimeexception, "kba.<init>(" + ')');
		}
	}
}
