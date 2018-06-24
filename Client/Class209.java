/* Class209 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class209 {
	private int anInt1582 = 2;
	int anInt1583;
	int anInt1584;
	private int[] anIntArray1585;
	private int[] anIntArray1586 = new int[2];
	int anInt1587;
	private int anInt1588;
	private int anInt1589;
	private int anInt1590;
	private int anInt1591;
	private int anInt1592;

	final void method2769() {
		anInt1590 = 0;
		anInt1588 = 0;
		anInt1591 = 0;
		anInt1589 = 0;
		anInt1592 = 0;
	}

	final int method2770(final int i) {
		if (anInt1592 >= anInt1590) {
			anInt1589 = anIntArray1585[anInt1588++] << 15;
			if (anInt1588 >= anInt1582) {
				anInt1588 = anInt1582 - 1;
			}
			anInt1590 = (int) (anIntArray1586[anInt1588] / 65536.0 * i);
			if (anInt1590 > anInt1592) {
				anInt1591 = (((anIntArray1585[anInt1588] << 15) - anInt1589) / (anInt1590 - anInt1592));
			}
		}
		anInt1589 += anInt1591;
		anInt1592++;
		return anInt1589 - anInt1591 >> 15;
	}

	final void method2771(final ByteBuffer class98_sub22) {
		anInt1584 = class98_sub22.readUnsignedByte((byte) 115);
		anInt1587 = class98_sub22.readInt(-2);
		anInt1583 = class98_sub22.readInt(-2);
		method2772(class98_sub22);
	}

	final void method2772(final ByteBuffer class98_sub22) {
		anInt1582 = class98_sub22.readUnsignedByte((byte) 93);
		anIntArray1586 = new int[anInt1582];
		anIntArray1585 = new int[anInt1582];
		for (int i = 0; i < anInt1582; i++) {
			anIntArray1586[i] = class98_sub22.readUnsignedShort((byte) 127);
			anIntArray1585[i] = class98_sub22.readUnsignedShort((byte) 127);
		}
	}

	public Class209() {
		anIntArray1585 = new int[2];
		anIntArray1586[0] = 0;
		anIntArray1586[1] = 65535;
		anIntArray1585[0] = 0;
		anIntArray1585[1] = 65535;
	}
}
