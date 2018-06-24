/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class37 {
	private final Class344[] aClass344Array351;
	private int anInt352;
	private int anInt353;

	static final Class37 method342(final Class207 class207, final int i,
			final int i_0_) {
		final byte[] is = class207.method2745(i_0_, i, false);
		if (is == null) {
			return null;
		}
		return new Class37(new ByteBuffer(is));
	}

	private Class37(final ByteBuffer class98_sub22) {
		aClass344Array351 = new Class344[10];
		for (int i = 0; i < 10; i++) {
			final int i_1_ = class98_sub22.readUnsignedByte((byte) 104);
			if (i_1_ != 0) {
				class98_sub22.position--;
				aClass344Array351[i] = new Class344();
				aClass344Array351[i].method3820(class98_sub22);
			}
		}
		anInt352 = class98_sub22.readUnsignedShort((byte) 127);
		anInt353 = class98_sub22.readUnsignedShort((byte) 127);
	}

	final int method343() {
		int i = 9999999;
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			if (aClass344Array351[i_2_] != null
					&& aClass344Array351[i_2_].anInt2867 / 20 < i) {
				i = aClass344Array351[i_2_].anInt2867 / 20;
			}
		}
		if (anInt352 < anInt353 && anInt352 / 20 < i) {
			i = anInt352 / 20;
		}
		if (i == 9999999 || i == 0) {
			return 0;
		}
		for (int i_3_ = 0; i_3_ < 10; i_3_++) {
			if (aClass344Array351[i_3_] != null) {
				aClass344Array351[i_3_].anInt2867 -= i * 20;
			}
		}
		if (anInt352 < anInt353) {
			anInt352 -= i * 20;
			anInt353 -= i * 20;
		}
		return i;
	}

	final Class98_Sub24_Sub1 method344() {
		final byte[] is = method345();
		return new Class98_Sub24_Sub1(22050, is, 22050 * anInt352 / 1000,
				22050 * anInt353 / 1000);
	}

	private Class37() {
		aClass344Array351 = new Class344[10];
	}

	private final byte[] method345() {
		int i = 0;
		for (int i_4_ = 0; i_4_ < 10; i_4_++) {
			if (aClass344Array351[i_4_] != null
					&& (aClass344Array351[i_4_].anInt2870 + aClass344Array351[i_4_].anInt2867) > i) {
				i = (aClass344Array351[i_4_].anInt2870 + aClass344Array351[i_4_].anInt2867);
			}
		}
		if (i == 0) {
			return new byte[0];
		}
		final int i_5_ = 22050 * i / 1000;
		final byte[] is = new byte[i_5_];
		for (int i_6_ = 0; i_6_ < 10; i_6_++) {
			if (aClass344Array351[i_6_] != null) {
				final int i_7_ = (aClass344Array351[i_6_].anInt2870 * 22050 / 1000);
				final int i_8_ = (aClass344Array351[i_6_].anInt2867 * 22050 / 1000);
				final int[] is_9_ = (aClass344Array351[i_6_].method3822(i_7_,
						aClass344Array351[i_6_].anInt2870));
				for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
					int i_11_ = is[i_10_ + i_8_] + (is_9_[i_10_] >> 8);
					if ((i_11_ + 128 & ~0xff) != 0) {
						i_11_ = i_11_ >> 31 ^ 0x7f;
					}
					is[i_10_ + i_8_] = (byte) i_11_;
				}
			}
		}
		return is;
	}
}
