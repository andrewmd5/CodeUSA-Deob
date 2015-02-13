/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class72 {
	int anInt536 = 512;
	int anInt537 = -1;
	int anInt538;
	private int anInt539 = 0;
	int anInt540;
	int anInt541;
	int anInt542;
	boolean aBoolean543 = true;
	boolean aBoolean544 = true;

	private final void method716(ByteBuffer class98_sub22, boolean bool,
			int i) {
		try {
			if ((i ^ 0xffffffff) != -2) {
				if (i == 2) {
					((Class72) this).anInt537 = class98_sub22
							.readUnsignedShort((byte) 127);
					if ((((Class72) this).anInt537 ^ 0xffffffff) == -65536)
						((Class72) this).anInt537 = -1;
				} else if (i == 3)
					((Class72) this).anInt536 = class98_sub22
							.readUnsignedShort((byte) 127) << -380251870;
				else if (i != 4) {
					if (i == 5)
						((Class72) this).aBoolean543 = false;
				} else
					((Class72) this).aBoolean544 = false;
			} else {
				anInt539 = class98_sub22.readMediumInt(-126);
				method718(0, anInt539);
			}
			if (bool != true)
				((Class72) this).anInt536 = -118;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("el.C("
					+ (class98_sub22 != null ? "{...}" : "null") + ',' + bool
					+ ',' + i + ')'));
		}
	}

	final void method717(ByteBuffer class98_sub22, int i) {
		try {
			for (;;) {
				int i_0_ = class98_sub22.readUnsignedByte((byte) 40);
				if (i_0_ == 0)
					break;
				method716(class98_sub22, true, i_0_);
			}
			if (i > -25)
				anInt539 = 39;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					("el.A(" + (class98_sub22 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	private final void method718(int i, int i_1_) {
		try {
			double d = (double) (i_1_ >> -356542736 & 0xff) / 256.0;
			double d_2_ = (double) ((i_1_ & 0xff10) >> -1757323064) / 256.0;
			double d_3_ = (double) (0xff & i_1_) / 256.0;
			double d_4_ = d;
			if (d_2_ < d_4_)
				d_4_ = d_2_;
			if (d_3_ < d_4_)
				d_4_ = d_3_;
			double d_5_ = d;
			if (d_2_ > d_5_)
				d_5_ = d_2_;
			if (d_5_ < d_3_)
				d_5_ = d_3_;
			double d_6_ = 0.0;
			double d_7_ = 0.0;
			double d_8_ = (d_5_ + d_4_) / 2.0;
			if (d_5_ != d_4_) {
				if (d_8_ < 0.5)
					d_7_ = (d_5_ - d_4_) / (d_5_ + d_4_);
				if (d == d_5_)
					d_6_ = (-d_3_ + d_2_) / (d_5_ - d_4_);
				else if (d_2_ != d_5_) {
					if (d_5_ == d_3_)
						d_6_ = 4.0 + (d - d_2_) / (d_5_ - d_4_);
				} else
					d_6_ = (-d + d_3_) / (d_5_ - d_4_) + 2.0;
				if (d_8_ >= 0.5)
					d_7_ = (-d_4_ + d_5_) / (-d_5_ + 2.0 - d_4_);
			}
			d_6_ /= 6.0;
			((Class72) this).anInt542 = (int) (d_8_ * 256.0);
			((Class72) this).anInt541 = (int) (d_7_ * 256.0);
			if ((((Class72) this).anInt542 ^ 0xffffffff) <= -1) {
				if (((Class72) this).anInt542 > 255)
					((Class72) this).anInt542 = 255;
			} else
				((Class72) this).anInt542 = 0;
			if (i > ((Class72) this).anInt541)
				((Class72) this).anInt541 = 0;
			else if ((((Class72) this).anInt541 ^ 0xffffffff) < -256)
				((Class72) this).anInt541 = 255;
			if (!(d_8_ > 0.5))
				((Class72) this).anInt540 = (int) (512.0 * (d_8_ * d_7_));
			else
				((Class72) this).anInt540 = (int) (d_7_ * (1.0 - d_8_) * 512.0);
			if (((Class72) this).anInt540 < 1)
				((Class72) this).anInt540 = 1;
			((Class72) this).anInt538 = (int) (d_6_ * (double) ((Class72) this).anInt540);
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "el.B(" + i + ','
					+ i_1_ + ')');
		}
	}

	public Class72() {
		/* empty */
	}
}
