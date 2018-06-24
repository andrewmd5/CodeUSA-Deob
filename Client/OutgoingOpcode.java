/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class OutgoingOpcode {
	static int anInt1318;
	int size;
	private int opcode;

	static final void method2540(int i, int i_0_, Class197 class197, int i_1_,
			Class293 class293, int i_2_, byte i_3_, String string, aa var_aa,
			int i_4_, int i_5_, Class43 class43) {
		try {
			int i_6_;
			do {
				if ((Class98_Sub46_Sub20_Sub2.anInt6319 ^ 0xffffffff) == -5) {
					i_6_ = (int) Class98_Sub22_Sub2.aFloat5794 & 0x3fff;
					if (!client.aBoolean3553)
						break;
				}
				i_6_ = ((int) Class98_Sub22_Sub2.aFloat5794 - -Class204.anInt1553) & 0x3fff;
			} while (false);
			int i_7_ = (Math.max(((Class293) class293).anInt2311 / 2,
					((Class293) class293).anInt2258 / 2) - -10);
			int i_8_ = i_5_ * i_5_ + i * i;
			if ((i_7_ * i_7_ ^ 0xffffffff) <= (i_8_ ^ 0xffffffff)) {
				if (i_3_ < 73)
					method2540(52, -42, null, -60, null, 123, (byte) 1, null,
							null, -98, -39, null);
				int i_9_ = Class284_Sub2_Sub2.anIntArray6200[i_6_];
				int i_10_ = Class284_Sub2_Sub2.anIntArray6202[i_6_];
				if (Class98_Sub46_Sub20_Sub2.anInt6319 != 4) {
					i_9_ = i_9_ * 256 / (Class151.anInt1213 + 256);
					i_10_ = i_10_ * 256 / (256 + Class151.anInt1213);
				}
				int i_11_ = i_5_ * i_9_ + i * i_10_ >> 2091290062;
				int i_12_ = i_10_ * i_5_ + -(i * i_9_) >> 1204621454;
				int i_13_ = class197.method2670(100, string, null, (byte) 106);
				int i_14_ = class197.method2672(null, 100, 0, string, true);
				i_11_ -= i_13_ / 2;
				if (-((Class293) class293).anInt2311 <= i_11_
						&& ((((Class293) class293).anInt2311 ^ 0xffffffff) <= (i_11_ ^ 0xffffffff))
						&& -((Class293) class293).anInt2258 <= i_12_
						&& (i_12_ ^ 0xffffffff) >= (((Class293) class293).anInt2258 ^ 0xffffffff))
					class43.method408(
							(((Class293) class293).anInt2311 / 2 + i_11_ - -i_0_),
							null,
							i_13_,
							string,
							i_0_,
							0,
							var_aa,
							1,
							(byte) -75,
							i_4_,
							null,
							0,
							i_1_,
							0,
							(-i_14_ + -i_12_ + i_1_ - (-(((Class293) class293).anInt2258 / 2) - -i_2_)),
							50);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lga.B(" + i + ','
					+ i_0_ + ',' + (class197 != null ? "{...}" : "null") + ','
					+ i_1_ + ',' + (class293 != null ? "{...}" : "null") + ','
					+ i_2_ + ',' + i_3_ + ','
					+ (string != null ? "{...}" : "null") + ','
					+ (var_aa != null ? "{...}" : "null") + ',' + i_4_ + ','
					+ i_5_ + ',' + (class43 != null ? "{...}" : "null") + ')'));
		}
	}

	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception,
					"lga.toString(" + ')');
		}
	}

	final int method2541(int i) {
		try {
			if (i != 2)
				anInt1318 = -128;
			return opcode;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, "lga.A(" + i + ')');
		}
	}

	OutgoingOpcode(int i, int i_15_) {
		try {
			opcode = i;
			((OutgoingOpcode) this).size = i_15_;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.printError(runtimeexception, ("lga.<init>(" + i
					+ ',' + i_15_ + ')'));
		}
	}
}
