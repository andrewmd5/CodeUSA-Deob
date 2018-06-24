/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class172 {
	static boolean aBoolean1321 = false;
	byte aByte1322;
	short aShort1323;
	Class246_Sub3_Sub3 aClass246_Sub3_Sub3_1324;
	Class154 aClass154_1325;
	Class246_Sub3_Sub5 aClass246_Sub3_Sub5_1326;
	static Interface17[] anInterface17Array1327;
	short aShort1328;
	short aShort1329;
	Class172 aClass172_1330;
	Class246_Sub3_Sub2 aClass246_Sub3_Sub2_1331;
	Class246_Sub3_Sub1 aClass246_Sub3_Sub1_1332;
	Class246_Sub3_Sub3 aClass246_Sub3_Sub3_1333;
	Class246_Sub3_Sub5 aClass246_Sub3_Sub5_1334;
	short aShort1335;

	static final void method2542(boolean bool, Class293 class293) {
		try {
			if (Class98_Sub10_Sub9.aBoolean5585) {
				if (((Class293) class293).anObjectArray2253 != null) {
					Class293 class293_0_ = Class246_Sub9.method3139((byte) 72,
							Class187.anInt1450, Class310.anInt2652);
					if (class293_0_ != null) {
						Class98_Sub21 class98_sub21 = new Class98_Sub21();
						((Class98_Sub21) class98_sub21).aClass293_3982 = class293_0_;
						((Class98_Sub21) class98_sub21).aClass293_3986 = class293;
						((Class98_Sub21) class98_sub21).anObjectArray3981 = ((Class293) class293).anObjectArray2253;
						ClientScriptsDefs.method3144(class98_sub21);
					}
				}
				if (bool == false) {
					Class98_Sub11 class98_sub11 = Class246_Sub3_Sub4
							.method3023(260, Class44.aClass171_380,
									(Class331.aClass117_2811));
					((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
							.writeInt(1571862888,
									((Class293) class293).anInt2248);
					((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
							.writeShort(Class310.anInt2652, 1571862888);
					((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
							.writeLEShort(((Class293) class293).anInt2302,
									17624);
					((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
							.writeShort(((Class293) class293).anInt2300,
									1571862888);
					((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
							.writeInt(1571862888, Class187.anInt1450);
					((Class98_Sub11) class98_sub11).aClass98_Sub22_Sub1_3865
							.writeLEShortA(Class376.anInt3173, 128);
					Class98_Sub10_Sub29.sendPacket(bool, class98_sub11);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lha.A(" + bool
					+ ',' + (class293 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2543(int i) {
		try {
			if (i != 4390)
				anInterface17Array1327 = null;
			anInterface17Array1327 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lha.C(" + i + ')');
		}
	}

	Class172(int i) {
		try {
			((Class172) this).aByte1322 = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lha.<init>(" + i
					+ ')');
		}
	}

	final void method2544(int i) {
		try {
			Class154 class154;
			for (/**/; ((Class172) this).aClass154_1325 != null; ((Class172) this).aClass154_1325 = class154) {
				class154 = (((Class154) ((Class172) this).aClass154_1325).aClass154_1233);
				((Class172) this).aClass154_1325.method2491(2);
			}
			if (i != 6730)
				method2542(false, null);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lha.B(" + i + ')');
		}
	}
}
