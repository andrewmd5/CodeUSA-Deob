/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38 {
	static int anInt354 = 0;
	static int anInt355;
	static d aD356;
	static Class100 aClass100_357 = new Class100(128);
	static int anInt358;
	static int anInt359;
	static int anInt360;

	public static void method346(int i) {
		try {
			if (i != 255)
				method347(null, (byte) -123, -77);
			aClass100_357 = null;
			aD356 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cm.B(" + i + ')');
		}
	}

	public final String toString() {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception,
					"cm.toString(" + ')');
		}
	}

	static final String method347(Class293 class293, byte i, int i_0_) {
		try {
			if (i <= 51)
				return null;
			if (!client.method116(class293).method1666((byte) -72, i_0_)
					&& ((Class293) class293).anObjectArray2329 == null)
				return null;
			if (((Class293) class293).aStringArray2351 == null
					|| ((i_0_ ^ 0xffffffff) <= (((Class293) class293).aStringArray2351.length ^ 0xffffffff))
					|| ((Class293) class293).aStringArray2351[i_0_] == null
					|| ((Class293) class293).aStringArray2351[i_0_].trim()
							.length() == 0) {
				if (Class15.aBoolean169)
					return "Hidden-" + i_0_;
				return null;
			}
			return ((Class293) class293).aStringArray2351[i_0_];
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("cm.A("
					+ (class293 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ')'));
		}
	}

	public Class38() {
		/* empty */
	}

	static final int method348(int i, int i_1_) {
		try {
			double d = (double) (0xff & i >> 598073424) / 256.0;
			double d_2_ = (double) ((0xff1e & i) >> -2121118168) / 256.0;
			double d_3_ = (double) (0xff & i) / 256.0;
			double d_4_ = d;
			if (d_2_ < d_4_)
				d_4_ = d_2_;
			if (d_4_ > d_3_)
				d_4_ = d_3_;
			double d_5_ = d;
			if (d_5_ < d_2_)
				d_5_ = d_2_;
			if (d_3_ > d_5_)
				d_5_ = d_3_;
			double d_6_ = 0.0;
			double d_7_ = 0.0;
			double d_8_ = (d_4_ + d_5_) / 2.0;
			int i_9_ = 113 % ((i_1_ - 46) / 38);
			if (d_4_ != d_5_) {
				if (d_8_ < 0.5)
					d_7_ = (d_5_ - d_4_) / (d_4_ + d_5_);
				if (d_8_ >= 0.5)
					d_7_ = (d_5_ - d_4_) / (-d_5_ + 2.0 - d_4_);
				if (d != d_5_) {
					if (d_5_ == d_2_)
						d_6_ = (-d + d_3_) / (d_5_ - d_4_) + 2.0;
					else if (d_3_ == d_5_)
						d_6_ = (d - d_2_) / (d_5_ - d_4_) + 4.0;
				} else
					d_6_ = (d_2_ - d_3_) / (d_5_ - d_4_);
			}
			d_6_ /= 6.0;
			int i_10_ = (int) (256.0 * d_6_);
			int i_11_ = (int) (d_7_ * 256.0);
			if (i_11_ >= 0) {
				if (i_11_ > 255)
					i_11_ = 255;
			} else
				i_11_ = 0;
			int i_12_ = (int) (256.0 * d_8_);
			if (i_12_ >= 0) {
				if ((i_12_ ^ 0xffffffff) < -256)
					i_12_ = 255;
			} else
				i_12_ = 0;
			if ((i_12_ ^ 0xffffffff) >= -244) {
				if (i_12_ <= 217) {
					if ((i_12_ ^ 0xffffffff) >= -193) {
						if ((i_12_ ^ 0xffffffff) < -180)
							i_11_ >>= 1;
					} else
						i_11_ >>= 2;
				} else
					i_11_ >>= 3;
			} else
				i_11_ >>= 4;
			return ((i_11_ >> -187392699 << -941273977)
					+ ((0xff & i_10_) >> 1108545090 << 440834122) - -(i_12_ >> -1810836799));
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "cm.C(" + i + ','
					+ i_1_ + ')');
		}
	}
}
